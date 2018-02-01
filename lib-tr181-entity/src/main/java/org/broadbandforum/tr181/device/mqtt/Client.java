/*
 * Copyright 2018 Key Bridge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.broadbandforum.tr181.device.mqtt;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.mqtt.client.Stats;
import org.broadbandforum.tr181.device.mqtt.client.Subscription;

	/**
	 * MQTT client table. Contains a list of configured MQTT clients.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.Client.{i}.")
public class Client {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the MQTT client.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * Allows to enable or disable the MQTT client.

          If a MQTT client gets enabled then the MQTT client has first to establish a MQTT broker session and then subscribe for all enabled topics in the {{object|Subscription.}} table. In case the {{param|CleanSession}} is set to {{false}} a subscription MUST only be sent for topics which haven't been subscribed before (see {{bibref|MQTT311|3.1.2.4}}).

          If a connected MQTT client gets disabled ({{param|Status}} is either {{enum|Connecting|Status}} or {{enum|Connected|Status}}) then the MQTT client has to send a MQTT DISCONNECT message to disconnect from the MQTT broker ({{bibref|MQTT31|3.14}} or {{bibref|MQTT311|3.14}}), before setting the {{param|Status}} to {{enum|Disabled|Status}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this MQTT client. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. The MQTT client can not use the defined port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the connection to the MQTT broker could not be established.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which can be changed by the ACS.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ClientID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 23)
	public String clientID;
	/**
	 * Username used to authenticate the CPE when making a connection to the MQTT broker. {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used to authenticate the CPE when making a connection to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          This password is only sent in the MQTT CONNECT message if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Indicates the transport protocol to be used for the MQTT broker connection.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "TransportProtocol")
	@CWMPParameter(access = "readWrite")
	public String transportProtocol = "TCP/IP";
	/**
	 * Specifies the MQTT protocol version used in the communication with the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ProtocolVersion")
	@CWMPParameter(access = "readWrite")
	public String protocolVersion;
	/**
	 * The value of the MQTT clean session flag in the MQTT CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "CleanSession")
	@CWMPParameter(access = "readWrite")
	public Boolean cleanSession = true;
	/**
	 * Message retry time in seconds defines the wait time before a MQTT message that expects a response (QoS value of message is > 0, or PUBLISH, PUBREL, SUBSCRIBE, UNSUBSCRIBE message) is resent, because the response is not received (see {{bibref|MQTT31|4.2}} and {{bibref|MQTT311|4.4}}).
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MessageRetryTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long messageRetryTime = 5L;
	/**
	 * Connect retry time in seconds defines the wait time before a failed MQTT broker connection is retried. 

          A failure can either be on the connection level (the TCP/IP or TLS can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ConnectRetryTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long connectRetryTime = 30L;
	/**
	 * Keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the MQTT client is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "KeepAliveTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(max = 65535)
	public Long keepAliveTime = 60L;
	/**
	 * Disconnects the MQTT client from the MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT client is currently connected to the MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT client is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ForceReconnect")
	@CWMPParameter(access = "readWrite")
	public Boolean forceReconnect;
	/**
	 * Host name or IP address of the MQTT Broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "BrokerAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String brokerAddress;
	/**
	 * Port number of the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "BrokerPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long brokerPort = 1883L;
	/**
	 * Enables or disables the will handling (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}).. Changing this parameter while the MQTT client is connected will cause the client to disconnect and reconnect.

          If the connection gets enabled and this parameter is set to {{true}} and either the parameter {{param|WillTopic}} or {{param|WillValue}} are {{empty}}, the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}} (see {{bibref|MQTT311|3.1.2.5}}).
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "WillEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean willEnable;
	/**
	 * The Topic sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}. 

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "WillTopic")
	@CWMPParameter(access = "readWrite")
	public String willTopic;
	/**
	 * The value sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "WillValue")
	@CWMPParameter(access = "readWrite")
	public String willValue;
	/**
	 * The MQTT QoS level assigned with the will message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.6}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "WillQoS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2)
	public Long willQoS;
	/**
	 * Indicate to the MQTT broker to retain the Will over a Disconnect (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.7}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message.

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "WillRetain")
	@CWMPParameter(access = "readWrite")
	public Boolean willRetain;
	/**
	 * List of MQTT subscriptions handled by the MQTT client.

        The MQTT client MUST subscribe with the MQTT broker for all subscription instances, whose parameter {{param|Enable}} is set to {{true}}, when it establishes a new connection to the MQTT broker. Disabled subscription instances with {{param|Enable}} set to {{false}} will be ignored during connection establishment.
	 */
	@XmlElementWrapper(name = "Subscriptions")
	@XmlElement(name = "Subscription")
	@CWMPParameter(access = "readWrite")
	public Collection<Subscription> subscriptions;
	/**
	 * Contains the MQTT client statistics and usage information.

        The CPE MUST reset the Stats parameters after the MQTT client gets (re-)enabled or if the MQTT client connects with a new MQTT broker (e.g. {{param|#.BrokerAddress}} has changed). The CPE MAY retain the values across a reboot if it reconnects with the same MQTT broker.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @param alias the input value
	 * @return this instance
	 */
	public Client withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the MQTT client.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the MQTT client.
	 *
	 * @since 2.10
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the MQTT client.
	 *
	 * @since 2.10
	 * @param name the input value
	 * @return this instance
	 */
	public Client withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get allows to enable or disable the MQTT client.

          If a MQTT client gets enabled then the MQTT client has first to establish a MQTT broker session and then subscribe for all enabled topics in the {{object|Subscription.}} table. In case the {{param|CleanSession}} is set to {{false}} a subscription MUST only be sent for topics which haven't been subscribed before (see {{bibref|MQTT311|3.1.2.4}}).

          If a connected MQTT client gets disabled ({{param|Status}} is either {{enum|Connecting|Status}} or {{enum|Connected|Status}}) then the MQTT client has to send a MQTT DISCONNECT message to disconnect from the MQTT broker ({{bibref|MQTT31|3.14}} or {{bibref|MQTT311|3.14}}), before setting the {{param|Status}} to {{enum|Disabled|Status}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set allows to enable or disable the MQTT client.

          If a MQTT client gets enabled then the MQTT client has first to establish a MQTT broker session and then subscribe for all enabled topics in the {{object|Subscription.}} table. In case the {{param|CleanSession}} is set to {{false}} a subscription MUST only be sent for topics which haven't been subscribed before (see {{bibref|MQTT311|3.1.2.4}}).

          If a connected MQTT client gets disabled ({{param|Status}} is either {{enum|Connecting|Status}} or {{enum|Connected|Status}}) then the MQTT client has to send a MQTT DISCONNECT message to disconnect from the MQTT broker ({{bibref|MQTT31|3.14}} or {{bibref|MQTT311|3.14}}), before setting the {{param|Status}} to {{enum|Disabled|Status}}.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set allows to enable or disable the MQTT client.

          If a MQTT client gets enabled then the MQTT client has first to establish a MQTT broker session and then subscribe for all enabled topics in the {{object|Subscription.}} table. In case the {{param|CleanSession}} is set to {{false}} a subscription MUST only be sent for topics which haven't been subscribed before (see {{bibref|MQTT311|3.1.2.4}}).

          If a connected MQTT client gets disabled ({{param|Status}} is either {{enum|Connecting|Status}} or {{enum|Connected|Status}}) then the MQTT client has to send a MQTT DISCONNECT message to disconnect from the MQTT broker ({{bibref|MQTT31|3.14}} or {{bibref|MQTT311|3.14}}), before setting the {{param|Status}} to {{enum|Disabled|Status}}.
	 *
	 * @since 2.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Client withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this MQTT client. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. The MQTT client can not use the defined port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the connection to the MQTT broker could not be established.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this MQTT client. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. The MQTT client can not use the defined port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the connection to the MQTT broker could not be established.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this MQTT client. {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. The MQTT client can not use the defined port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the connection to the MQTT broker could not be established.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @param status the input value
	 * @return this instance
	 */
	public Client withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which can be changed by the ACS.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * Set the MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which can be changed by the ACS.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param clientID the input value
	 */
	public void  setClientID(String clientID) {
		this.clientID = clientID;
	}

	/**
	 * Set the MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which can be changed by the ACS.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param clientID the input value
	 * @return this instance
	 */
	public Client withClientID(String clientID) {
		this.clientID = clientID;
		return this;
	}

	/**
	 * Get the username used to authenticate the CPE when making a connection to the MQTT broker. {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the MQTT broker. {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the MQTT broker. {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 * @param username the input value
	 * @return this instance
	 */
	public Client withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate the CPE when making a connection to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          This password is only sent in the MQTT CONNECT message if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          This password is only sent in the MQTT CONNECT message if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          This password is only sent in the MQTT CONNECT message if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @param password the input value
	 * @return this instance
	 */
	public Client withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the indicates the transport protocol to be used for the MQTT broker connection.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getTransportProtocol() {
		return transportProtocol;
	}

	/**
	 * Set the indicates the transport protocol to be used for the MQTT broker connection.
	 *
	 * @since 2.10
	 * @param transportProtocol the input value
	 */
	public void  setTransportProtocol(String transportProtocol) {
		this.transportProtocol = transportProtocol;
	}

	/**
	 * Set the indicates the transport protocol to be used for the MQTT broker connection.
	 *
	 * @since 2.10
	 * @param transportProtocol the input value
	 * @return this instance
	 */
	public Client withTransportProtocol(String transportProtocol) {
		this.transportProtocol = transportProtocol;
		return this;
	}

	/**
	 * Get the specifies the MQTT protocol version used in the communication with the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * Set the specifies the MQTT protocol version used in the communication with the MQTT broker.
	 *
	 * @since 2.10
	 * @param protocolVersion the input value
	 */
	public void  setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * Set the specifies the MQTT protocol version used in the communication with the MQTT broker.
	 *
	 * @since 2.10
	 * @param protocolVersion the input value
	 * @return this instance
	 */
	public Client withProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		return this;
	}

	/**
	 * Get the value of the MQTT clean session flag in the MQTT CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isCleanSession() {
		return cleanSession;
	}

	/**
	 * Set the value of the MQTT clean session flag in the MQTT CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param cleanSession the input value
	 */
	public void  setCleanSession(Boolean cleanSession) {
		this.cleanSession = cleanSession;
	}

	/**
	 * Set the value of the MQTT clean session flag in the MQTT CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param cleanSession the input value
	 * @return this instance
	 */
	public Client withCleanSession(Boolean cleanSession) {
		this.cleanSession = cleanSession;
		return this;
	}

	/**
	 * Get the message retry time in seconds defines the wait time before a MQTT message that expects a response (QoS value of message is > 0, or PUBLISH, PUBREL, SUBSCRIBE, UNSUBSCRIBE message) is resent, because the response is not received (see {{bibref|MQTT31|4.2}} and {{bibref|MQTT311|4.4}}).
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getMessageRetryTime() {
		return messageRetryTime;
	}

	/**
	 * Set the message retry time in seconds defines the wait time before a MQTT message that expects a response (QoS value of message is > 0, or PUBLISH, PUBREL, SUBSCRIBE, UNSUBSCRIBE message) is resent, because the response is not received (see {{bibref|MQTT31|4.2}} and {{bibref|MQTT311|4.4}}).
	 *
	 * @since 2.10
	 * @param messageRetryTime the input value
	 */
	public void  setMessageRetryTime(Long messageRetryTime) {
		this.messageRetryTime = messageRetryTime;
	}

	/**
	 * Set the message retry time in seconds defines the wait time before a MQTT message that expects a response (QoS value of message is > 0, or PUBLISH, PUBREL, SUBSCRIBE, UNSUBSCRIBE message) is resent, because the response is not received (see {{bibref|MQTT31|4.2}} and {{bibref|MQTT311|4.4}}).
	 *
	 * @since 2.10
	 * @param messageRetryTime the input value
	 * @return this instance
	 */
	public Client withMessageRetryTime(Long messageRetryTime) {
		this.messageRetryTime = messageRetryTime;
		return this;
	}

	/**
	 * Get the connect retry time in seconds defines the wait time before a failed MQTT broker connection is retried. 

          A failure can either be on the connection level (the TCP/IP or TLS can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getConnectRetryTime() {
		return connectRetryTime;
	}

	/**
	 * Set the connect retry time in seconds defines the wait time before a failed MQTT broker connection is retried. 

          A failure can either be on the connection level (the TCP/IP or TLS can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 * @param connectRetryTime the input value
	 */
	public void  setConnectRetryTime(Long connectRetryTime) {
		this.connectRetryTime = connectRetryTime;
	}

	/**
	 * Set the connect retry time in seconds defines the wait time before a failed MQTT broker connection is retried. 

          A failure can either be on the connection level (the TCP/IP or TLS can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 * @param connectRetryTime the input value
	 * @return this instance
	 */
	public Client withConnectRetryTime(Long connectRetryTime) {
		this.connectRetryTime = connectRetryTime;
		return this;
	}

	/**
	 * Get the keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the MQTT client is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getKeepAliveTime() {
		return keepAliveTime;
	}

	/**
	 * Set the keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the MQTT client is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param keepAliveTime the input value
	 */
	public void  setKeepAliveTime(Long keepAliveTime) {
		this.keepAliveTime = keepAliveTime;
	}

	/**
	 * Set the keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the MQTT client is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param keepAliveTime the input value
	 * @return this instance
	 */
	public Client withKeepAliveTime(Long keepAliveTime) {
		this.keepAliveTime = keepAliveTime;
		return this;
	}

	/**
	 * Get the disconnects the MQTT client from the MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT client is currently connected to the MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT client is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isForceReconnect() {
		return forceReconnect;
	}

	/**
	 * Set the disconnects the MQTT client from the MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT client is currently connected to the MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT client is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 * @param forceReconnect the input value
	 */
	public void  setForceReconnect(Boolean forceReconnect) {
		this.forceReconnect = forceReconnect;
	}

	/**
	 * Set the disconnects the MQTT client from the MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT client is currently connected to the MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT client is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 * @param forceReconnect the input value
	 * @return this instance
	 */
	public Client withForceReconnect(Boolean forceReconnect) {
		this.forceReconnect = forceReconnect;
		return this;
	}

	/**
	 * Get the host name or IP address of the MQTT Broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getBrokerAddress() {
		return brokerAddress;
	}

	/**
	 * Set the host name or IP address of the MQTT Broker.
	 *
	 * @since 2.10
	 * @param brokerAddress the input value
	 */
	public void  setBrokerAddress(String brokerAddress) {
		this.brokerAddress = brokerAddress;
	}

	/**
	 * Set the host name or IP address of the MQTT Broker.
	 *
	 * @since 2.10
	 * @param brokerAddress the input value
	 * @return this instance
	 */
	public Client withBrokerAddress(String brokerAddress) {
		this.brokerAddress = brokerAddress;
		return this;
	}

	/**
	 * Get the port number of the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getBrokerPort() {
		return brokerPort;
	}

	/**
	 * Set the port number of the MQTT broker.
	 *
	 * @since 2.10
	 * @param brokerPort the input value
	 */
	public void  setBrokerPort(Long brokerPort) {
		this.brokerPort = brokerPort;
	}

	/**
	 * Set the port number of the MQTT broker.
	 *
	 * @since 2.10
	 * @param brokerPort the input value
	 * @return this instance
	 */
	public Client withBrokerPort(Long brokerPort) {
		this.brokerPort = brokerPort;
		return this;
	}

	/**
	 * Get the enables or disables the will handling (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}).. Changing this parameter while the MQTT client is connected will cause the client to disconnect and reconnect.

          If the connection gets enabled and this parameter is set to {{true}} and either the parameter {{param|WillTopic}} or {{param|WillValue}} are {{empty}}, the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}} (see {{bibref|MQTT311|3.1.2.5}}).
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isWillEnable() {
		return willEnable;
	}

	/**
	 * Set the enables or disables the will handling (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}).. Changing this parameter while the MQTT client is connected will cause the client to disconnect and reconnect.

          If the connection gets enabled and this parameter is set to {{true}} and either the parameter {{param|WillTopic}} or {{param|WillValue}} are {{empty}}, the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}} (see {{bibref|MQTT311|3.1.2.5}}).
	 *
	 * @since 2.10
	 * @param willEnable the input value
	 */
	public void  setWillEnable(Boolean willEnable) {
		this.willEnable = willEnable;
	}

	/**
	 * Set the enables or disables the will handling (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}).. Changing this parameter while the MQTT client is connected will cause the client to disconnect and reconnect.

          If the connection gets enabled and this parameter is set to {{true}} and either the parameter {{param|WillTopic}} or {{param|WillValue}} are {{empty}}, the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}} (see {{bibref|MQTT311|3.1.2.5}}).
	 *
	 * @since 2.10
	 * @param willEnable the input value
	 * @return this instance
	 */
	public Client withWillEnable(Boolean willEnable) {
		this.willEnable = willEnable;
		return this;
	}

	/**
	 * Get the Topic sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}. 

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getWillTopic() {
		return willTopic;
	}

	/**
	 * Set the Topic sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}. 

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willTopic the input value
	 */
	public void  setWillTopic(String willTopic) {
		this.willTopic = willTopic;
	}

	/**
	 * Set the Topic sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}. 

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willTopic the input value
	 * @return this instance
	 */
	public Client withWillTopic(String willTopic) {
		this.willTopic = willTopic;
		return this;
	}

	/**
	 * Get the value sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getWillValue() {
		return willValue;
	}

	/**
	 * Set the value sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willValue the input value
	 */
	public void  setWillValue(String willValue) {
		this.willValue = willValue;
	}

	/**
	 * Set the value sent in the Will Message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.5}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willValue the input value
	 * @return this instance
	 */
	public Client withWillValue(String willValue) {
		this.willValue = willValue;
		return this;
	}

	/**
	 * Get the MQTT QoS level assigned with the will message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.6}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getWillQoS() {
		return willQoS;
	}

	/**
	 * Set the MQTT QoS level assigned with the will message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.6}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willQoS the input value
	 */
	public void  setWillQoS(Long willQoS) {
		this.willQoS = willQoS;
	}

	/**
	 * Set the MQTT QoS level assigned with the will message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.6}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message. 

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willQoS the input value
	 * @return this instance
	 */
	public Client withWillQoS(Long willQoS) {
		this.willQoS = willQoS;
		return this;
	}

	/**
	 * Get the indicate to the MQTT broker to retain the Will over a Disconnect (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.7}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message.

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isWillRetain() {
		return willRetain;
	}

	/**
	 * Set the indicate to the MQTT broker to retain the Will over a Disconnect (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.7}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message.

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willRetain the input value
	 */
	public void  setWillRetain(Boolean willRetain) {
		this.willRetain = willRetain;
	}

	/**
	 * Set the indicate to the MQTT broker to retain the Will over a Disconnect (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.7}}). This parameter is only used if {{param|WillEnable}} is set to {{true}}.

          A change of this parameter is only communicated to the MQTT broker with the next MQTT CONNECT message.

          If the will handling is enabled (Paramter {{param|WillEnable}} is set to {{true}}) and the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param willRetain the input value
	 * @return this instance
	 */
	public Client withWillRetain(Boolean willRetain) {
		this.willRetain = willRetain;
		return this;
	}

	/**
	 * Get the list of MQTT subscriptions handled by the MQTT client.

        The MQTT client MUST subscribe with the MQTT broker for all subscription instances, whose parameter {{param|Enable}} is set to {{true}}, when it establishes a new connection to the MQTT broker. Disabled subscription instances with {{param|Enable}} set to {{false}} will be ignored during connection establishment.
	 *
	 * @return the value
	 */
	public Collection<Subscription> getSubscriptions() {
		if (this.subscriptions == null){ this.subscriptions=new ArrayList<>();}
		return subscriptions;
	}

	/**
	 * Set the list of MQTT subscriptions handled by the MQTT client.

        The MQTT client MUST subscribe with the MQTT broker for all subscription instances, whose parameter {{param|Enable}} is set to {{true}}, when it establishes a new connection to the MQTT broker. Disabled subscription instances with {{param|Enable}} set to {{false}} will be ignored during connection establishment.
	 *
	 * @param subscriptions the input value
	 */
	public void  setSubscriptions(Collection<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	/**
	 * Set the list of MQTT subscriptions handled by the MQTT client.

        The MQTT client MUST subscribe with the MQTT broker for all subscription instances, whose parameter {{param|Enable}} is set to {{true}}, when it establishes a new connection to the MQTT broker. Disabled subscription instances with {{param|Enable}} set to {{false}} will be ignored during connection establishment.
	 *
	 * @param subscription the input value
	 * @return this instance
	 */
	public Client withSubscription(Subscription subscription) {
		getSubscriptions().add(subscription);
		return this;
	}

	/**
	 * Get the contains the MQTT client statistics and usage information.

        The CPE MUST reset the Stats parameters after the MQTT client gets (re-)enabled or if the MQTT client connects with a new MQTT broker (e.g. {{param|#.BrokerAddress}} has changed). The CPE MAY retain the values across a reboot if it reconnects with the same MQTT broker.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the contains the MQTT client statistics and usage information.

        The CPE MUST reset the Stats parameters after the MQTT client gets (re-)enabled or if the MQTT client connects with a new MQTT broker (e.g. {{param|#.BrokerAddress}} has changed). The CPE MAY retain the values across a reboot if it reconnects with the same MQTT broker.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the contains the MQTT client statistics and usage information.

        The CPE MUST reset the Stats parameters after the MQTT client gets (re-)enabled or if the MQTT client connects with a new MQTT broker (e.g. {{param|#.BrokerAddress}} has changed). The CPE MAY retain the values across a reboot if it reconnects with the same MQTT broker.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Client withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}