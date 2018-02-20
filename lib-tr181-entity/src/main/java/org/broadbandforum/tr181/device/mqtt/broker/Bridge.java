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
package org.broadbandforum.tr181.device.mqtt.broker;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr181.device.mqtt.broker.bridge.Server;
import org.broadbandforum.tr181.device.mqtt.broker.bridge.Subscription;

	/**
	 * Configures MQTT bridges, which are used to communicate with other MQTT brokers.
	 *
	 * @since TR181 v2.10
	 */
@CWMPObject(name = "Device.MQTT.Broker.{i}.Bridge.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Name"}, functional = false)})
@XmlRootElement(name = "Device.MQTT.Broker.Bridge")
@XmlType(name = "Device.MQTT.Broker.Bridge")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bridge {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the MQTT bridge used for identification.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * Allows to enable or disable the MQTT Bridge.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this MQTT Bridge. {{enum}}

          The {{enum|Disabled}} value indicates that the MQTT bridge is not in service; parameter {{param|Enable}} is set to {{false}}.

          The {{enum|Connecting}} value indicates that the MQTT bridge is currently established.

          The {{enum|Connected}} value indicates that the MQTT bridge is currently active.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. No active Server entry, the MQTT broker can not use the defined bridge port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the MQTT bridge connection to the remote MQTT broker could not be established.

          The {{enum|Error}} value MAY be used to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which may be changed by the ACS.

          A change of this parameter is only communicated to the remote MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ClientID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 23)
	public String clientID;
	/**
	 * Username used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}). {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          The password is only sent if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Indicates the transport protocol to be used for the MQTT bridge connection.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "TransportProtocol")
	@CWMPParameter(access = "readWrite")
	public String transportProtocol;
	/**
	 * Specifies the MQTT protocol version used in the MQTT bridge connection.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ProtocolVersion")
	@CWMPParameter(access = "readWrite")
	public String protocolVersion;
	/**
	 * The value of the MQTT clean session flag in the MQTT bridge connection (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the remote MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "CleanSession")
	@CWMPParameter(access = "readWrite")
	public Boolean cleanSession;
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
	 * Connect retry time in seconds defines the wait time before a failed bridge connection is retried. 

          A failure can either be on the connection level (e.g. the TCP/IP or TLS conection can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ConnectRetryTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long connectRetryTime = 30L;
	/**
	 * Keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the remote MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the bridge is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "KeepAliveTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(max = 65535)
	public Long keepAliveTime = 60L;
	/**
	 * Disconnects the MQTT bridge to the remote MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT bridge is currently connected to the remote MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT bridge is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ForceReconnect")
	@CWMPParameter(access = "readWrite")
	public Boolean forceReconnect;
	/**
	 * The algorithm used to select a server entry from the {{object|Server}} table
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ServerSelectionAlgorithm")
	@CWMPParameter(access = "readWrite")
	public String serverSelectionAlgorithm;
	/**
	 * {{reference|the {{object|Server.}} instance that is used for this {{object}}, while the {{param|Status}} is {{enum|Connecting|Status}} or {{enum|Connected|Status}}. If the MQTT bridge is not connected the value MUST be an empty string}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ServerConnection")
	public String serverConnection;
	/**
	 * Each {{object}} instance represents a MQTT bridge server to be used for a {{object|##.Bridge}}. A remote MQTT broker, which is connected by a MQTT bridge can be reachable via several host addresses each represented by its own {{object}} table entry. For an active MQTT bridge at least one enabled entry has to exist.

        If a MQTT bridge gets enabled by setting the parameter {{param|##.Bridge.{i}.Enable}} to {{true}}, which either has an empty {{object}} table or the {{object}} table only contains instances whose {{param|Enable}} is set to {{false}}, the {{param|##.Bridge.{i}.Status}} has to be set to {{enum|Error_Misconfigured|##.Bridge.{i}.Status}}.

        Any attempt to delete an instance, which is currently in use ({{param|##.Bridge.{i}.ServerConnection}} refers to the instance to be deleted), has to be rejected.
	 */
	@XmlElementWrapper(name = "Servers")
	@XmlElement(name = "Server")
	@CWMPParameter(access = "readWrite")
	public Collection<Server> servers;
	/**
	 * List of MQTT subscriptions handled over the bridge.
	 */
	@XmlElementWrapper(name = "Subscriptions")
	@XmlElement(name = "Subscription")
	@CWMPParameter(access = "readWrite")
	public Collection<Subscription> subscriptions;

	public Bridge() {
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
	public Bridge withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the MQTT bridge used for identification.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the MQTT bridge used for identification.
	 *
	 * @since 2.10
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the MQTT bridge used for identification.
	 *
	 * @since 2.10
	 * @param name the input value
	 * @return this instance
	 */
	public Bridge withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get allows to enable or disable the MQTT Bridge.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set allows to enable or disable the MQTT Bridge.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set allows to enable or disable the MQTT Bridge.
	 *
	 * @since 2.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Bridge withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this MQTT Bridge. {{enum}}

          The {{enum|Disabled}} value indicates that the MQTT bridge is not in service; parameter {{param|Enable}} is set to {{false}}.

          The {{enum|Connecting}} value indicates that the MQTT bridge is currently established.

          The {{enum|Connected}} value indicates that the MQTT bridge is currently active.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. No active Server entry, the MQTT broker can not use the defined bridge port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the MQTT bridge connection to the remote MQTT broker could not be established.

          The {{enum|Error}} value MAY be used to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this MQTT Bridge. {{enum}}

          The {{enum|Disabled}} value indicates that the MQTT bridge is not in service; parameter {{param|Enable}} is set to {{false}}.

          The {{enum|Connecting}} value indicates that the MQTT bridge is currently established.

          The {{enum|Connected}} value indicates that the MQTT bridge is currently active.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. No active Server entry, the MQTT broker can not use the defined bridge port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the MQTT bridge connection to the remote MQTT broker could not be established.

          The {{enum|Error}} value MAY be used to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this MQTT Bridge. {{enum}}

          The {{enum|Disabled}} value indicates that the MQTT bridge is not in service; parameter {{param|Enable}} is set to {{false}}.

          The {{enum|Connecting}} value indicates that the MQTT bridge is currently established.

          The {{enum|Connected}} value indicates that the MQTT bridge is currently active.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid (e.g. No active Server entry, the MQTT broker can not use the defined bridge port, because it is blocked)

          The {{enum|Error_BrokerUnreachable}} value indicates that the MQTT bridge connection to the remote MQTT broker could not be established.

          The {{enum|Error}} value MAY be used to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @param status the input value
	 * @return this instance
	 */
	public Bridge withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which may be changed by the ACS.

          A change of this parameter is only communicated to the remote MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * Set the MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which may be changed by the ACS.

          A change of this parameter is only communicated to the remote MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param clientID the input value
	 */
	public void  setClientID(String clientID) {
		this.clientID = clientID;
	}

	/**
	 * Set the MQTT client identifier used in the CONNECT message (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.1}}). This parameter MUST NOT be {{empty}}, the CPE has to provide a default value for the parameter, which may be changed by the ACS.

          A change of this parameter is only communicated to the remote MQTT broker with the next MQTT CONNECT message. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param clientID the input value
	 * @return this instance
	 */
	public Bridge withClientID(String clientID) {
		this.clientID = clientID;
		return this;
	}

	/**
	 * Get the username used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}). {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}). {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}). {{bibref|MQTT31|3.1}} recommends that the username has 12 characters or fewer, but this is not required.

          If this parameter is {{empty}} no authentication parameters are sent in the MQTT CONNECT message.
	 *
	 * @since 2.10
	 * @param username the input value
	 * @return this instance
	 */
	public Bridge withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          The password is only sent if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          The password is only sent if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate the MQTT broker when making a connection over the MQTT bridge (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.3.4}}).

          The password is only sent if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @param password the input value
	 * @return this instance
	 */
	public Bridge withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the indicates the transport protocol to be used for the MQTT bridge connection.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getTransportProtocol() {
		return transportProtocol;
	}

	/**
	 * Set the indicates the transport protocol to be used for the MQTT bridge connection.
	 *
	 * @since 2.10
	 * @param transportProtocol the input value
	 */
	public void  setTransportProtocol(String transportProtocol) {
		this.transportProtocol = transportProtocol;
	}

	/**
	 * Set the indicates the transport protocol to be used for the MQTT bridge connection.
	 *
	 * @since 2.10
	 * @param transportProtocol the input value
	 * @return this instance
	 */
	public Bridge withTransportProtocol(String transportProtocol) {
		this.transportProtocol = transportProtocol;
		return this;
	}

	/**
	 * Get the specifies the MQTT protocol version used in the MQTT bridge connection.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * Set the specifies the MQTT protocol version used in the MQTT bridge connection.
	 *
	 * @since 2.10
	 * @param protocolVersion the input value
	 */
	public void  setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * Set the specifies the MQTT protocol version used in the MQTT bridge connection.
	 *
	 * @since 2.10
	 * @param protocolVersion the input value
	 * @return this instance
	 */
	public Bridge withProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		return this;
	}

	/**
	 * Get the value of the MQTT clean session flag in the MQTT bridge connection (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the remote MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isCleanSession() {
		return cleanSession;
	}

	/**
	 * Set the value of the MQTT clean session flag in the MQTT bridge connection (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the remote MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param cleanSession the input value
	 */
	public void  setCleanSession(Boolean cleanSession) {
		this.cleanSession = cleanSession;
	}

	/**
	 * Set the value of the MQTT clean session flag in the MQTT bridge connection (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.4}}). If this flag is set to {{true}} (default), the remote MQTT broker will delete all subscription information after a Disconnect.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param cleanSession the input value
	 * @return this instance
	 */
	public Bridge withCleanSession(Boolean cleanSession) {
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
	public Bridge withMessageRetryTime(Long messageRetryTime) {
		this.messageRetryTime = messageRetryTime;
		return this;
	}

	/**
	 * Get the connect retry time in seconds defines the wait time before a failed bridge connection is retried. 

          A failure can either be on the connection level (e.g. the TCP/IP or TLS conection can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getConnectRetryTime() {
		return connectRetryTime;
	}

	/**
	 * Set the connect retry time in seconds defines the wait time before a failed bridge connection is retried. 

          A failure can either be on the connection level (e.g. the TCP/IP or TLS conection can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 * @param connectRetryTime the input value
	 */
	public void  setConnectRetryTime(Long connectRetryTime) {
		this.connectRetryTime = connectRetryTime;
	}

	/**
	 * Set the connect retry time in seconds defines the wait time before a failed bridge connection is retried. 

          A failure can either be on the connection level (e.g. the TCP/IP or TLS conection can not be established) or on the Protocol level, the MQTT client does not receive a MQTT CONNACK message on a MQTT CONNECT message sent.
	 *
	 * @since 2.10
	 * @param connectRetryTime the input value
	 * @return this instance
	 */
	public Bridge withConnectRetryTime(Long connectRetryTime) {
		this.connectRetryTime = connectRetryTime;
		return this;
	}

	/**
	 * Get the keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the remote MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the bridge is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getKeepAliveTime() {
		return keepAliveTime;
	}

	/**
	 * Set the keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the remote MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the bridge is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param keepAliveTime the input value
	 */
	public void  setKeepAliveTime(Long keepAliveTime) {
		this.keepAliveTime = keepAliveTime;
	}

	/**
	 * Set the keep Alive Time in seconds defines the maximum wait time after which a message has to be sent to the remote MQTT broker (see {{bibref|MQTT31|3.1}} and {{bibref|MQTT311|3.1.2.10}}). If no regular messages can be sent a MQTT PINGREQ is sent.

          A value of zero (0) means no keep alive message are sent and the bridge is not disconnected by the server.

          A change of this parameter is only effective after the next MQTT CONNECT message to the remote MQTT broker. If the change needs to be applied immediately, the parameter {{param|ForceReconnect}} has to be set as well.
	 *
	 * @since 2.10
	 * @param keepAliveTime the input value
	 * @return this instance
	 */
	public Bridge withKeepAliveTime(Long keepAliveTime) {
		this.keepAliveTime = keepAliveTime;
		return this;
	}

	/**
	 * Get the disconnects the MQTT bridge to the remote MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT bridge is currently connected to the remote MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT bridge is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isForceReconnect() {
		return forceReconnect;
	}

	/**
	 * Set the disconnects the MQTT bridge to the remote MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT bridge is currently connected to the remote MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT bridge is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 * @param forceReconnect the input value
	 */
	public void  setForceReconnect(Boolean forceReconnect) {
		this.forceReconnect = forceReconnect;
	}

	/**
	 * Set the disconnects the MQTT bridge to the remote MQTT broker and reconnects it again (toggle connection). It is only effective if the MQTT bridge is currently connected to the remote MQTT broker (Parameter {{param|Status|}} is {{enum|Connected|Status}}).

          If the MQTT bridge is in a different state, the parameter has no effect.

          This action parameter may be used to immediately apply changes in the MQTT connection settings.
	 *
	 * @since 2.10
	 * @param forceReconnect the input value
	 * @return this instance
	 */
	public Bridge withForceReconnect(Boolean forceReconnect) {
		this.forceReconnect = forceReconnect;
		return this;
	}

	/**
	 * Get the algorithm used to select a server entry from the {{object|Server}} table
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getServerSelectionAlgorithm() {
		return serverSelectionAlgorithm;
	}

	/**
	 * Set the algorithm used to select a server entry from the {{object|Server}} table
	 *
	 * @since 2.10
	 * @param serverSelectionAlgorithm the input value
	 */
	public void  setServerSelectionAlgorithm(String serverSelectionAlgorithm) {
		this.serverSelectionAlgorithm = serverSelectionAlgorithm;
	}

	/**
	 * Set the algorithm used to select a server entry from the {{object|Server}} table
	 *
	 * @since 2.10
	 * @param serverSelectionAlgorithm the input value
	 * @return this instance
	 */
	public Bridge withServerSelectionAlgorithm(String serverSelectionAlgorithm) {
		this.serverSelectionAlgorithm = serverSelectionAlgorithm;
		return this;
	}

	/**
	 * Get the {{reference|the {{object|Server.}} instance that is used for this {{object}}, while the {{param|Status}} is {{enum|Connecting|Status}} or {{enum|Connected|Status}}. If the MQTT bridge is not connected the value MUST be an empty string}}
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getServerConnection() {
		return serverConnection;
	}

	/**
	 * Set the {{reference|the {{object|Server.}} instance that is used for this {{object}}, while the {{param|Status}} is {{enum|Connecting|Status}} or {{enum|Connected|Status}}. If the MQTT bridge is not connected the value MUST be an empty string}}
	 *
	 * @since 2.10
	 * @param serverConnection the input value
	 */
	public void  setServerConnection(String serverConnection) {
		this.serverConnection = serverConnection;
	}

	/**
	 * Set the {{reference|the {{object|Server.}} instance that is used for this {{object}}, while the {{param|Status}} is {{enum|Connecting|Status}} or {{enum|Connected|Status}}. If the MQTT bridge is not connected the value MUST be an empty string}}
	 *
	 * @since 2.10
	 * @param serverConnection the input value
	 * @return this instance
	 */
	public Bridge withServerConnection(String serverConnection) {
		this.serverConnection = serverConnection;
		return this;
	}

	/**
	 * Get the each {{object}} instance represents a MQTT bridge server to be used for a {{object|##.Bridge}}. A remote MQTT broker, which is connected by a MQTT bridge can be reachable via several host addresses each represented by its own {{object}} table entry. For an active MQTT bridge at least one enabled entry has to exist.

        If a MQTT bridge gets enabled by setting the parameter {{param|##.Bridge.{i}.Enable}} to {{true}}, which either has an empty {{object}} table or the {{object}} table only contains instances whose {{param|Enable}} is set to {{false}}, the {{param|##.Bridge.{i}.Status}} has to be set to {{enum|Error_Misconfigured|##.Bridge.{i}.Status}}.

        Any attempt to delete an instance, which is currently in use ({{param|##.Bridge.{i}.ServerConnection}} refers to the instance to be deleted), has to be rejected.
	 *
	 * @return the value
	 */
	public Collection<Server> getServers() {
		if (this.servers == null){ this.servers=new ArrayList<>();}
		return servers;
	}

	/**
	 * Set the each {{object}} instance represents a MQTT bridge server to be used for a {{object|##.Bridge}}. A remote MQTT broker, which is connected by a MQTT bridge can be reachable via several host addresses each represented by its own {{object}} table entry. For an active MQTT bridge at least one enabled entry has to exist.

        If a MQTT bridge gets enabled by setting the parameter {{param|##.Bridge.{i}.Enable}} to {{true}}, which either has an empty {{object}} table or the {{object}} table only contains instances whose {{param|Enable}} is set to {{false}}, the {{param|##.Bridge.{i}.Status}} has to be set to {{enum|Error_Misconfigured|##.Bridge.{i}.Status}}.

        Any attempt to delete an instance, which is currently in use ({{param|##.Bridge.{i}.ServerConnection}} refers to the instance to be deleted), has to be rejected.
	 *
	 * @param servers the input value
	 */
	public void  setServers(Collection<Server> servers) {
		this.servers = servers;
	}

	/**
	 * Set the each {{object}} instance represents a MQTT bridge server to be used for a {{object|##.Bridge}}. A remote MQTT broker, which is connected by a MQTT bridge can be reachable via several host addresses each represented by its own {{object}} table entry. For an active MQTT bridge at least one enabled entry has to exist.

        If a MQTT bridge gets enabled by setting the parameter {{param|##.Bridge.{i}.Enable}} to {{true}}, which either has an empty {{object}} table or the {{object}} table only contains instances whose {{param|Enable}} is set to {{false}}, the {{param|##.Bridge.{i}.Status}} has to be set to {{enum|Error_Misconfigured|##.Bridge.{i}.Status}}.

        Any attempt to delete an instance, which is currently in use ({{param|##.Bridge.{i}.ServerConnection}} refers to the instance to be deleted), has to be rejected.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public Bridge withServer(Server server) {
		getServers().add(server);
		return this;
	}

	/**
	 * Get the list of MQTT subscriptions handled over the bridge.
	 *
	 * @return the value
	 */
	public Collection<Subscription> getSubscriptions() {
		if (this.subscriptions == null){ this.subscriptions=new ArrayList<>();}
		return subscriptions;
	}

	/**
	 * Set the list of MQTT subscriptions handled over the bridge.
	 *
	 * @param subscriptions the input value
	 */
	public void  setSubscriptions(Collection<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	/**
	 * Set the list of MQTT subscriptions handled over the bridge.
	 *
	 * @param subscription the input value
	 * @return this instance
	 */
	public Bridge withSubscription(Subscription subscription) {
		getSubscriptions().add(subscription);
		return this;
	}

	//</editor-fold>

}