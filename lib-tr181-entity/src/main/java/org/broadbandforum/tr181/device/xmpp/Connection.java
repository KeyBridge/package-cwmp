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
package org.broadbandforum.tr181.device.xmpp;

import java.time.LocalDateTime;
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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.xmpp.connection.Server;
import org.broadbandforum.tr181.device.xmpp.connection.Stats;

	/**
	 * The {{object}} represents a XMPP connection between the device and a server. The {{param|Username}}, {{param|Domain}} and {{param|Resource}} comprise the full identity (JabberID) of this {{object}} for this device.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.XMPP.Connection.{i}.")
@XmlRootElement(name = "Connection")
@XmlType(name = "Device.XMPP.Connection")
@XmlAccessorType(XmlAccessType.FIELD)
public class Connection {

	/**
	 * Enables or disables this {{object}}.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The proposed local-part of the Jabber ID of this {{object}}, and the value to be used to authenticate this {{object}} when making a connection to the Server using the procedure outlined in {{bibref|RFC6120|Section 6}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used to authenticate this {{object}} when making a connection to the {{object|Server}} using the procedure outlined in {{bibref|RFC6120|Section 6}}.

          Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the  value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a  factory reset.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * The proposed domain-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Domain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String domain;
	/**
	 * The proposed resource-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Resource")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String resource;
	/**
	 * The complete Jabber ID as determined by the first-hop XMPP server at time of connection establishment.  This Jabber ID will usually be the standard concatentation of the local-part (Username), domain-part (Domain), and resource-part (Resource) as defined in {{bibref|RFC6120|Section 2.1}} (local-part@domain-part/resource-part), but since the Jabber ID is owned by the first-hop XMPP Server there are cases where the value will be different.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "JabberID")
	public String jabberID;
	/**
	 * The current operational state of this {{object}} (see {{bibref|TR-181i2|Section 4.2.2}}).  {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Disabled}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Enabled}} if and only if the interface is able to transmit and receive PDUs; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Enabled}} if still operable when the expected actions have completed);  it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The date and time at which this {{object}} entered into its current operational state.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "LastChangeDate")
	public LocalDateTime lastChangeDate;
	/**
	 * The algorithm the {{object}} uses when connecting with the associated lists of servers. {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServerConnectAlgorithm")
	@CWMPParameter(access = "readWrite")
	public String serverConnectAlgorithm = "DNS-SRV";
	/**
	 * The number of seconds that keep alive events as specified in {{bibref|RFC6120|Section 4.6.1}} are sent by this {{object}}. 

          A value of 0 disables the keep alive functionality. A value of -1 indicates that the keep alive interval is a vendor specific implementation.

          {{bibref|RFC6120|Section 4.6.4}} recommends not checking more frequently than every 5 minutes (or 300 seconds).
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "KeepAliveInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = -1)
	public Long keepAliveInterval = -1L;
	/**
	 * The number of times that this {{object}} attempts to connect to a given IP address before moving on to the current server's next IP address, or to the next server if the current server has no more IP addresses.

          If {{param}}, {{param|ServerRetryInitialInterval}}, {{param|ServerRetryIntervalMultiplier}} and {{param|ServerRetryMaxInterval}} all have their default values, the maximum reconnection wait intervals, in ''minutes'', will be ''{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, 512, 512, 512, 512}''.  After the initial attempt there are 15 further attempts, making a total of 16.  The maximum reconnection wait interval is reached on the 10th retry, i.e. the 11th attempt.

          NOTE: If this {{object}} fails to connect to any of the servers' IP addresses, fallback behavior SHOULD be as specified in {{bibref|RFC6120|Section 3.2}}.

          NOTE: If the value of this parameter is 0, server connection and reconnection behavior is implementation-dependent.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServerConnectAttempts")
	@CWMPParameter(access = "readWrite")
	public Long serverConnectAttempts = 16L;
	/**
	 * The maximum first reconnection wait interval, in seconds, as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}.

          The Device MUST use a random value between ''0'' and {{param}} as the first reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServerRetryInitialInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1, max = 65535)
	public Long serverRetryInitialInterval = 60L;
	/**
	 * The reconnection interval multiplier as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}. This value is expressed in units of 0.001. Hence the values of the multiplier range between 1.000 and 65.535.

          For the ''n''th reconnection wait interval, the Device MUST use a random value, in ''seconds'', between ''0'' and {{param|ServerRetryInitialInterval}} * ({{param}} / 1000) ** (''n'' - ''1'').

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServerRetryIntervalMultiplier")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1000, max = 65535)
	public Long serverRetryIntervalMultiplier = 2000L;
	/**
	 * The maximum reconnection wait interval, in seconds.

          If the ''n''th reconnection wait interval calculated from {{param|ServerRetryInitialInterval}} and {{param|ServerRetryIntervalMultiplier}} exceeds the value of this parameter, then the Device MUST use the value of this parameter as the next reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServerRetryMaxInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long serverRetryMaxInterval = 30720L;
	/**
	 * This parameter allows an ACS to configure whether or not this XMPP Connection is required to use TLS independent of whether or not the XMPP Server that is being connected to is configured for TLS "mandatory-to-negotiate".

          If the value of {{param}} is {{true}} then the CPE will initiate TLS negotiation if not required to by the XMPP Server.  

          If the value of {{param}} is {{false}} then the CPE will not initiate TLS negotiation if not required to by the XMPP Server.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "UseTLS")
	@CWMPParameter(access = "readWrite")
	public Boolean useTLS = false;
	/**
	 * This parameter represents the TLS state of this XMPP Connection.

          If this XMPP Connection is established and is secured by TLS then the value of this parameter is {{true}}.

          If this XMPP Connection is either not established or established but not secured by TLS then the value of this parameter is {{false}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "TLSEstablished")
	public Boolean tlsEstablished;
	/**
	 * The {{object}} represents an XMPP server to be used for a {{object|##.Connection}}.

        This table is only relevant when {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|ServerTable|##.Connection.{i}.ServerConnectAlgorithm}}.  If {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|DNS-SRV|##.Connection.{i}.ServerConnectAlgorithm}} then any instances of this table are ignored by this {{object|##.Connection}}.
	 */
	@XmlElementWrapper(name = "Servers")
	@XmlElement(name = "Server")
	@CWMPParameter(access = "readWrite")
	public Collection<Server> servers;
	/**
	 * XMPP Connection statistics information for this resource.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Connection() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}}.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}}.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}}.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 * @return this instance
	 */
	public Connection withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 * @return this instance
	 */
	public Connection withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the proposed local-part of the Jabber ID of this {{object}}, and the value to be used to authenticate this {{object}} when making a connection to the Server using the procedure outlined in {{bibref|RFC6120|Section 6}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the proposed local-part of the Jabber ID of this {{object}}, and the value to be used to authenticate this {{object}} when making a connection to the Server using the procedure outlined in {{bibref|RFC6120|Section 6}}.
	 *
	 * @since 2.7
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the proposed local-part of the Jabber ID of this {{object}}, and the value to be used to authenticate this {{object}} when making a connection to the Server using the procedure outlined in {{bibref|RFC6120|Section 6}}.
	 *
	 * @since 2.7
	 * @param username the input value
	 * @return this instance
	 */
	public Connection withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate this {{object}} when making a connection to the {{object|Server}} using the procedure outlined in {{bibref|RFC6120|Section 6}}.

          Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the  value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a  factory reset.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate this {{object}} when making a connection to the {{object|Server}} using the procedure outlined in {{bibref|RFC6120|Section 6}}.

          Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the  value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a  factory reset.
	 *
	 * @since 2.7
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate this {{object}} when making a connection to the {{object|Server}} using the procedure outlined in {{bibref|RFC6120|Section 6}}.

          Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the  value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a  factory reset.
	 *
	 * @since 2.7
	 * @param password the input value
	 * @return this instance
	 */
	public Connection withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the proposed domain-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Set the proposed domain-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 * @param domain the input value
	 */
	public void  setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Set the proposed domain-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 * @param domain the input value
	 * @return this instance
	 */
	public Connection withDomain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Get the proposed resource-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * Set the proposed resource-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 * @param resource the input value
	 */
	public void  setResource(String resource) {
		this.resource = resource;
	}

	/**
	 * Set the proposed resource-part of the Jabber ID of this {{object}}.
	 *
	 * @since 2.7
	 * @param resource the input value
	 * @return this instance
	 */
	public Connection withResource(String resource) {
		this.resource = resource;
		return this;
	}

	/**
	 * Get the complete Jabber ID as determined by the first-hop XMPP server at time of connection establishment.  This Jabber ID will usually be the standard concatentation of the local-part (Username), domain-part (Domain), and resource-part (Resource) as defined in {{bibref|RFC6120|Section 2.1}} (local-part@domain-part/resource-part), but since the Jabber ID is owned by the first-hop XMPP Server there are cases where the value will be different.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getJabberID() {
		return jabberID;
	}

	/**
	 * Set the complete Jabber ID as determined by the first-hop XMPP server at time of connection establishment.  This Jabber ID will usually be the standard concatentation of the local-part (Username), domain-part (Domain), and resource-part (Resource) as defined in {{bibref|RFC6120|Section 2.1}} (local-part@domain-part/resource-part), but since the Jabber ID is owned by the first-hop XMPP Server there are cases where the value will be different.
	 *
	 * @since 2.7
	 * @param jabberID the input value
	 */
	public void  setJabberID(String jabberID) {
		this.jabberID = jabberID;
	}

	/**
	 * Set the complete Jabber ID as determined by the first-hop XMPP server at time of connection establishment.  This Jabber ID will usually be the standard concatentation of the local-part (Username), domain-part (Domain), and resource-part (Resource) as defined in {{bibref|RFC6120|Section 2.1}} (local-part@domain-part/resource-part), but since the Jabber ID is owned by the first-hop XMPP Server there are cases where the value will be different.
	 *
	 * @since 2.7
	 * @param jabberID the input value
	 * @return this instance
	 */
	public Connection withJabberID(String jabberID) {
		this.jabberID = jabberID;
		return this;
	}

	/**
	 * Get the current operational state of this {{object}} (see {{bibref|TR-181i2|Section 4.2.2}}).  {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Disabled}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Enabled}} if and only if the interface is able to transmit and receive PDUs; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Enabled}} if still operable when the expected actions have completed);  it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of this {{object}} (see {{bibref|TR-181i2|Section 4.2.2}}).  {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Disabled}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Enabled}} if and only if the interface is able to transmit and receive PDUs; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Enabled}} if still operable when the expected actions have completed);  it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.
	 *
	 * @since 2.7
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of this {{object}} (see {{bibref|TR-181i2|Section 4.2.2}}).  {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Disabled}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Enabled}} if and only if the interface is able to transmit and receive PDUs; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Enabled}} if still operable when the expected actions have completed);  it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.
	 *
	 * @since 2.7
	 * @param status the input value
	 * @return this instance
	 */
	public Connection withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the date and time at which this {{object}} entered into its current operational state.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public LocalDateTime getLastChangeDate() {
		return lastChangeDate;
	}

	/**
	 * Set the date and time at which this {{object}} entered into its current operational state.
	 *
	 * @since 2.7
	 * @param lastChangeDate the input value
	 */
	public void  setLastChangeDate(LocalDateTime lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
	}

	/**
	 * Set the date and time at which this {{object}} entered into its current operational state.
	 *
	 * @since 2.7
	 * @param lastChangeDate the input value
	 * @return this instance
	 */
	public Connection withLastChangeDate(LocalDateTime lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
		return this;
	}

	/**
	 * Get the algorithm the {{object}} uses when connecting with the associated lists of servers. {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getServerConnectAlgorithm() {
		return serverConnectAlgorithm;
	}

	/**
	 * Set the algorithm the {{object}} uses when connecting with the associated lists of servers. {{enum}}
	 *
	 * @since 2.7
	 * @param serverConnectAlgorithm the input value
	 */
	public void  setServerConnectAlgorithm(String serverConnectAlgorithm) {
		this.serverConnectAlgorithm = serverConnectAlgorithm;
	}

	/**
	 * Set the algorithm the {{object}} uses when connecting with the associated lists of servers. {{enum}}
	 *
	 * @since 2.7
	 * @param serverConnectAlgorithm the input value
	 * @return this instance
	 */
	public Connection withServerConnectAlgorithm(String serverConnectAlgorithm) {
		this.serverConnectAlgorithm = serverConnectAlgorithm;
		return this;
	}

	/**
	 * Get the number of seconds that keep alive events as specified in {{bibref|RFC6120|Section 4.6.1}} are sent by this {{object}}. 

          A value of 0 disables the keep alive functionality. A value of -1 indicates that the keep alive interval is a vendor specific implementation.

          {{bibref|RFC6120|Section 4.6.4}} recommends not checking more frequently than every 5 minutes (or 300 seconds).
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getKeepAliveInterval() {
		return keepAliveInterval;
	}

	/**
	 * Set the number of seconds that keep alive events as specified in {{bibref|RFC6120|Section 4.6.1}} are sent by this {{object}}. 

          A value of 0 disables the keep alive functionality. A value of -1 indicates that the keep alive interval is a vendor specific implementation.

          {{bibref|RFC6120|Section 4.6.4}} recommends not checking more frequently than every 5 minutes (or 300 seconds).
	 *
	 * @since 2.7
	 * @param keepAliveInterval the input value
	 */
	public void  setKeepAliveInterval(Long keepAliveInterval) {
		this.keepAliveInterval = keepAliveInterval;
	}

	/**
	 * Set the number of seconds that keep alive events as specified in {{bibref|RFC6120|Section 4.6.1}} are sent by this {{object}}. 

          A value of 0 disables the keep alive functionality. A value of -1 indicates that the keep alive interval is a vendor specific implementation.

          {{bibref|RFC6120|Section 4.6.4}} recommends not checking more frequently than every 5 minutes (or 300 seconds).
	 *
	 * @since 2.7
	 * @param keepAliveInterval the input value
	 * @return this instance
	 */
	public Connection withKeepAliveInterval(Long keepAliveInterval) {
		this.keepAliveInterval = keepAliveInterval;
		return this;
	}

	/**
	 * Get the number of times that this {{object}} attempts to connect to a given IP address before moving on to the current server's next IP address, or to the next server if the current server has no more IP addresses.

          If {{param}}, {{param|ServerRetryInitialInterval}}, {{param|ServerRetryIntervalMultiplier}} and {{param|ServerRetryMaxInterval}} all have their default values, the maximum reconnection wait intervals, in ''minutes'', will be ''{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, 512, 512, 512, 512}''.  After the initial attempt there are 15 further attempts, making a total of 16.  The maximum reconnection wait interval is reached on the 10th retry, i.e. the 11th attempt.

          NOTE: If this {{object}} fails to connect to any of the servers' IP addresses, fallback behavior SHOULD be as specified in {{bibref|RFC6120|Section 3.2}}.

          NOTE: If the value of this parameter is 0, server connection and reconnection behavior is implementation-dependent.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getServerConnectAttempts() {
		return serverConnectAttempts;
	}

	/**
	 * Set the number of times that this {{object}} attempts to connect to a given IP address before moving on to the current server's next IP address, or to the next server if the current server has no more IP addresses.

          If {{param}}, {{param|ServerRetryInitialInterval}}, {{param|ServerRetryIntervalMultiplier}} and {{param|ServerRetryMaxInterval}} all have their default values, the maximum reconnection wait intervals, in ''minutes'', will be ''{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, 512, 512, 512, 512}''.  After the initial attempt there are 15 further attempts, making a total of 16.  The maximum reconnection wait interval is reached on the 10th retry, i.e. the 11th attempt.

          NOTE: If this {{object}} fails to connect to any of the servers' IP addresses, fallback behavior SHOULD be as specified in {{bibref|RFC6120|Section 3.2}}.

          NOTE: If the value of this parameter is 0, server connection and reconnection behavior is implementation-dependent.
	 *
	 * @since 2.7
	 * @param serverConnectAttempts the input value
	 */
	public void  setServerConnectAttempts(Long serverConnectAttempts) {
		this.serverConnectAttempts = serverConnectAttempts;
	}

	/**
	 * Set the number of times that this {{object}} attempts to connect to a given IP address before moving on to the current server's next IP address, or to the next server if the current server has no more IP addresses.

          If {{param}}, {{param|ServerRetryInitialInterval}}, {{param|ServerRetryIntervalMultiplier}} and {{param|ServerRetryMaxInterval}} all have their default values, the maximum reconnection wait intervals, in ''minutes'', will be ''{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512, 512, 512, 512, 512}''.  After the initial attempt there are 15 further attempts, making a total of 16.  The maximum reconnection wait interval is reached on the 10th retry, i.e. the 11th attempt.

          NOTE: If this {{object}} fails to connect to any of the servers' IP addresses, fallback behavior SHOULD be as specified in {{bibref|RFC6120|Section 3.2}}.

          NOTE: If the value of this parameter is 0, server connection and reconnection behavior is implementation-dependent.
	 *
	 * @since 2.7
	 * @param serverConnectAttempts the input value
	 * @return this instance
	 */
	public Connection withServerConnectAttempts(Long serverConnectAttempts) {
		this.serverConnectAttempts = serverConnectAttempts;
		return this;
	}

	/**
	 * Get the maximum first reconnection wait interval, in seconds, as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}.

          The Device MUST use a random value between ''0'' and {{param}} as the first reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getServerRetryInitialInterval() {
		return serverRetryInitialInterval;
	}

	/**
	 * Set the maximum first reconnection wait interval, in seconds, as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}.

          The Device MUST use a random value between ''0'' and {{param}} as the first reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @param serverRetryInitialInterval the input value
	 */
	public void  setServerRetryInitialInterval(Long serverRetryInitialInterval) {
		this.serverRetryInitialInterval = serverRetryInitialInterval;
	}

	/**
	 * Set the maximum first reconnection wait interval, in seconds, as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}.

          The Device MUST use a random value between ''0'' and {{param}} as the first reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @param serverRetryInitialInterval the input value
	 * @return this instance
	 */
	public Connection withServerRetryInitialInterval(Long serverRetryInitialInterval) {
		this.serverRetryInitialInterval = serverRetryInitialInterval;
		return this;
	}

	/**
	 * Get the reconnection interval multiplier as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}. This value is expressed in units of 0.001. Hence the values of the multiplier range between 1.000 and 65.535.

          For the ''n''th reconnection wait interval, the Device MUST use a random value, in ''seconds'', between ''0'' and {{param|ServerRetryInitialInterval}} * ({{param}} / 1000) ** (''n'' - ''1'').

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getServerRetryIntervalMultiplier() {
		return serverRetryIntervalMultiplier;
	}

	/**
	 * Set the reconnection interval multiplier as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}. This value is expressed in units of 0.001. Hence the values of the multiplier range between 1.000 and 65.535.

          For the ''n''th reconnection wait interval, the Device MUST use a random value, in ''seconds'', between ''0'' and {{param|ServerRetryInitialInterval}} * ({{param}} / 1000) ** (''n'' - ''1'').

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @param serverRetryIntervalMultiplier the input value
	 */
	public void  setServerRetryIntervalMultiplier(Long serverRetryIntervalMultiplier) {
		this.serverRetryIntervalMultiplier = serverRetryIntervalMultiplier;
	}

	/**
	 * Set the reconnection interval multiplier as specified in {{bibref|TR-069a5|Annex K XMPP Connection Request}}. This value is expressed in units of 0.001. Hence the values of the multiplier range between 1.000 and 65.535.

          For the ''n''th reconnection wait interval, the Device MUST use a random value, in ''seconds'', between ''0'' and {{param|ServerRetryInitialInterval}} * ({{param}} / 1000) ** (''n'' - ''1'').

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @param serverRetryIntervalMultiplier the input value
	 * @return this instance
	 */
	public Connection withServerRetryIntervalMultiplier(Long serverRetryIntervalMultiplier) {
		this.serverRetryIntervalMultiplier = serverRetryIntervalMultiplier;
		return this;
	}

	/**
	 * Get the maximum reconnection wait interval, in seconds.

          If the ''n''th reconnection wait interval calculated from {{param|ServerRetryInitialInterval}} and {{param|ServerRetryIntervalMultiplier}} exceeds the value of this parameter, then the Device MUST use the value of this parameter as the next reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getServerRetryMaxInterval() {
		return serverRetryMaxInterval;
	}

	/**
	 * Set the maximum reconnection wait interval, in seconds.

          If the ''n''th reconnection wait interval calculated from {{param|ServerRetryInitialInterval}} and {{param|ServerRetryIntervalMultiplier}} exceeds the value of this parameter, then the Device MUST use the value of this parameter as the next reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @param serverRetryMaxInterval the input value
	 */
	public void  setServerRetryMaxInterval(Long serverRetryMaxInterval) {
		this.serverRetryMaxInterval = serverRetryMaxInterval;
	}

	/**
	 * Set the maximum reconnection wait interval, in seconds.

          If the ''n''th reconnection wait interval calculated from {{param|ServerRetryInitialInterval}} and {{param|ServerRetryIntervalMultiplier}} exceeds the value of this parameter, then the Device MUST use the value of this parameter as the next reconnection wait interval.

          NOTE: If the value of the {{param|ServerConnectAttempts}} parameter is 0, the value of this parameter is ignored.
	 *
	 * @since 2.7
	 * @param serverRetryMaxInterval the input value
	 * @return this instance
	 */
	public Connection withServerRetryMaxInterval(Long serverRetryMaxInterval) {
		this.serverRetryMaxInterval = serverRetryMaxInterval;
		return this;
	}

	/**
	 * Get the this parameter allows an ACS to configure whether or not this XMPP Connection is required to use TLS independent of whether or not the XMPP Server that is being connected to is configured for TLS "mandatory-to-negotiate".

          If the value of {{param}} is {{true}} then the CPE will initiate TLS negotiation if not required to by the XMPP Server.  

          If the value of {{param}} is {{false}} then the CPE will not initiate TLS negotiation if not required to by the XMPP Server.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isUseTLS() {
		return useTLS;
	}

	/**
	 * Set the this parameter allows an ACS to configure whether or not this XMPP Connection is required to use TLS independent of whether or not the XMPP Server that is being connected to is configured for TLS "mandatory-to-negotiate".

          If the value of {{param}} is {{true}} then the CPE will initiate TLS negotiation if not required to by the XMPP Server.  

          If the value of {{param}} is {{false}} then the CPE will not initiate TLS negotiation if not required to by the XMPP Server.
	 *
	 * @since 2.7
	 * @param useTLS the input value
	 */
	public void  setUseTLS(Boolean useTLS) {
		this.useTLS = useTLS;
	}

	/**
	 * Set the this parameter allows an ACS to configure whether or not this XMPP Connection is required to use TLS independent of whether or not the XMPP Server that is being connected to is configured for TLS "mandatory-to-negotiate".

          If the value of {{param}} is {{true}} then the CPE will initiate TLS negotiation if not required to by the XMPP Server.  

          If the value of {{param}} is {{false}} then the CPE will not initiate TLS negotiation if not required to by the XMPP Server.
	 *
	 * @since 2.7
	 * @param useTLS the input value
	 * @return this instance
	 */
	public Connection withUseTLS(Boolean useTLS) {
		this.useTLS = useTLS;
		return this;
	}

	/**
	 * Get the this parameter represents the TLS state of this XMPP Connection.

          If this XMPP Connection is established and is secured by TLS then the value of this parameter is {{true}}.

          If this XMPP Connection is either not established or established but not secured by TLS then the value of this parameter is {{false}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isTlsEstablished() {
		return tlsEstablished;
	}

	/**
	 * Set the this parameter represents the TLS state of this XMPP Connection.

          If this XMPP Connection is established and is secured by TLS then the value of this parameter is {{true}}.

          If this XMPP Connection is either not established or established but not secured by TLS then the value of this parameter is {{false}}.
	 *
	 * @since 2.7
	 * @param tlsEstablished the input value
	 */
	public void  setTlsEstablished(Boolean tlsEstablished) {
		this.tlsEstablished = tlsEstablished;
	}

	/**
	 * Set the this parameter represents the TLS state of this XMPP Connection.

          If this XMPP Connection is established and is secured by TLS then the value of this parameter is {{true}}.

          If this XMPP Connection is either not established or established but not secured by TLS then the value of this parameter is {{false}}.
	 *
	 * @since 2.7
	 * @param tlsEstablished the input value
	 * @return this instance
	 */
	public Connection withTlsEstablished(Boolean tlsEstablished) {
		this.tlsEstablished = tlsEstablished;
		return this;
	}

	/**
	 * Get the {{object}} represents an XMPP server to be used for a {{object|##.Connection}}.

        This table is only relevant when {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|ServerTable|##.Connection.{i}.ServerConnectAlgorithm}}.  If {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|DNS-SRV|##.Connection.{i}.ServerConnectAlgorithm}} then any instances of this table are ignored by this {{object|##.Connection}}.
	 *
	 * @return the value
	 */
	public Collection<Server> getServers() {
		if (this.servers == null){ this.servers=new ArrayList<>();}
		return servers;
	}

	/**
	 * Set the {{object}} represents an XMPP server to be used for a {{object|##.Connection}}.

        This table is only relevant when {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|ServerTable|##.Connection.{i}.ServerConnectAlgorithm}}.  If {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|DNS-SRV|##.Connection.{i}.ServerConnectAlgorithm}} then any instances of this table are ignored by this {{object|##.Connection}}.
	 *
	 * @param servers the input value
	 */
	public void  setServers(Collection<Server> servers) {
		this.servers = servers;
	}

	/**
	 * Set the {{object}} represents an XMPP server to be used for a {{object|##.Connection}}.

        This table is only relevant when {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|ServerTable|##.Connection.{i}.ServerConnectAlgorithm}}.  If {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|DNS-SRV|##.Connection.{i}.ServerConnectAlgorithm}} then any instances of this table are ignored by this {{object|##.Connection}}.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public Connection withServer(Server server) {
		getServers().add(server);
		return this;
	}

	/**
	 * Get the xmpP Connection statistics information for this resource.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the xmpP Connection statistics information for this resource.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the xmpP Connection statistics information for this resource.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Connection withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}