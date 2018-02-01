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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice.wanconnectiondevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.datatypes.IPAddress;
import org.broadbandforum.tr143.datatypes.MACAddress;
import org.broadbandforum.tr143.internetgatewaydevice.wandevice.wanconnectiondevice.wanpppconnection.PortMapping;
import org.broadbandforum.tr143.internetgatewaydevice.wandevice.wanconnectiondevice.wanpppconnection.Stats;

	/**
	 * This object enables configuration of PPP connections on the WAN interface of a CPE.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPPPConnection.{i}.")
public class WANPPPConnection {

	/**
	 * Enables or disables the connection instance.  On creation of a ''WANPPPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Current status of the connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionStatus")
	public String connectionStatus;
	/**
	 * Types of connections possible for this connection instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PossibleConnectionTypes")
	@XmlList
	public Collection<String> possibleConnectionTypes;
	/**
	 * Specifies the connection type of the connection instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionType")
	@CWMPParameter(access = "readWrite")
	public String connectionType;
	/**
	 * User-readable name of this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String name;
	/**
	 * The time in seconds that this connection has been up.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Uptime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long uptime;
	/**
	 * The cause of failure for the last connection setup attempt.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastConnectionError")
	public String lastConnectionError = "ERROR_NONE";
	/**
	 * The time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AutoDisconnectTime")
	@CWMPParameter(access = "readWrite")
	public Long autoDisconnectTime;
	/**
	 * The time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IdleDisconnectTime")
	@CWMPParameter(access = "readWrite")
	public Long idleDisconnectTime;
	/**
	 * Time in seconds the Status remains in the pending disconnect state before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WarnDisconnectDelay")
	@CWMPParameter(access = "readWrite")
	public Long warnDisconnectDelay;
	/**
	 * Indicates if Realm-specific IP (RSIP) is available as a feature on the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RSIPAvailable")
	public Boolean rsiPAvailable;
	/**
	 * Indicates if Network Address Translation (NAT) is enabled for this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NATEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean natEnabled;
	/**
	 * Username to be used for authentication.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String username;
	/**
	 * Password to be usef for authentication.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String password;
	/**
	 * Describes the PPP encryption protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PPPEncryptionProtocol")
	public String pppEncryptionProtocol;
	/**
	 * Describes the PPP compression protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PPPCompressionProtocol")
	public String pppCompressionProtocol;
	/**
	 * Describes the PPP authentication protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PPPAuthenticationProtocol")
	public String pppAuthenticationProtocol;
	/**
	 * This is the external IP address used by NAT for this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ExternalIPAddress")
	public IPAddress externalIPAddress;
	/**
	 * The remote IP address for this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RemoteIPAddress")
	public IPAddress remoteIPAddress;
	/**
	 * The maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxMRUSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1540)
	public Long maxMRUSize;
	/**
	 * The current MRU in use over this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentMRUSize")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 1, max = 1540)
	public Long currentMRUSize;
	/**
	 * Whether or not the device SHOULD attempt to query a DNS server across this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DNSEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean dnsEnabled = true;
	/**
	 * Whether or not a manually set, non-empty DNS address can be overridden by a DNS entry received from the WAN.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DNSOverrideAllowed")
	@CWMPParameter(access = "readWrite")
	public Boolean dnsOverrideAllowed = false;
	/**
	 * DNS server IP addresses for this connection.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DNSServers")
	@CWMPParameter(access = "readWrite")
	public IPAddress dnsServers;
	/**
	 * The physical address of the ''WANPPPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{empty}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress macAddress;
	/**
	 * Whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{false}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddressOverride")
	@CWMPParameter(access = "readWrite")
	public Boolean macAddressOverride;
	/**
	 * PPP transport type of the connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TransportType")
	public String transportType;
	/**
	 * PPPoE Access Concentrator.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PPPoEACName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String pppoEACName;
	/**
	 * PPPoE Service Name.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PPPoEServiceName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String pppoEServiceName;
	/**
	 * Trigger used to establish the PPP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this PPP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionTrigger")
	@CWMPParameter(access = "readWrite")
	public String connectionTrigger = "OnDemand";
	/**
	 * Defines the Rx protocol to be used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RouteProtocolRx")
	@CWMPParameter(access = "readWrite")
	public String routeProtocolRx = "Off";
	/**
	 * PPP LCP Echo period in seconds.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PPPLCPEcho")
	public Long pppLCPEcho;
	/**
	 * Number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PPPLCPEchoRetry")
	public Long pppLCPEchoRetry;
	/**
	 * Rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ShapingRate")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer shapingRate = -1;
	/**
	 * Burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ShapingBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long shapingBurstSize = 0L;
	/**
	 * Port mapping table.

This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

At most one entry in an instance of this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.  If the ACS attempts to set the parameters of an existing entry such that this requirement would be violated, the CPE MUST reject the request.  In this case, the SetParameterValues response MUST include a SetParameterValuesFault element for each parameter in the corresponding request whose modification would have resulted in such a violation.  On creation of a new table entry, the CPE MUST choose default values for {{param|ExternalPort}} and {{param|PortMappingProtocol}} such that the new entry does not conflict with any existing entry.
	 */
	@XmlElementWrapper(name = "PortMappings")
	@XmlElement(name = "PortMapping")
	@CWMPParameter(access = "readWrite")
	public Collection<PortMapping> portMappings;
	/**
	 * This object contains statistics for all connections within the same ''WANConnectionDevice'' that share a common MAC address.  The contents of this object SHOULD be identical for each such connection.

This object is intended only for ''WANConnectionDevice''s that can support an Ethernet-layer on this interface (e.g., ''PPPoE'', ''IPoE'').
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public WANPPPConnection() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the connection instance.  On creation of a ''WANPPPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the connection instance.  On creation of a ''WANPPPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the connection instance.  On creation of a ''WANPPPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WANPPPConnection withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current status of the connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionStatus() {
		return connectionStatus;
	}

	/**
	 * Set the current status of the connection.
	 *
	 * @since 1.0
	 * @param connectionStatus the input value
	 */
	public void  setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	/**
	 * Set the current status of the connection.
	 *
	 * @since 1.0
	 * @param connectionStatus the input value
	 * @return this instance
	 */
	public WANPPPConnection withConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
		return this;
	}

	/**
	 * Get the types of connections possible for this connection instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getPossibleConnectionTypes() {
		if (this.possibleConnectionTypes == null){ this.possibleConnectionTypes=new ArrayList<>();}
		return possibleConnectionTypes;
	}

	/**
	 * Set the types of connections possible for this connection instance.
	 *
	 * @since 1.0
	 * @param possibleConnectionTypes the input value
	 */
	public void  setPossibleConnectionTypes(Collection<String> possibleConnectionTypes) {
		this.possibleConnectionTypes = possibleConnectionTypes;
	}

	/**
	 * Set the types of connections possible for this connection instance.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public WANPPPConnection withPossibleConnectionTypes(String string) {
		getPossibleConnectionTypes().add(string);
		return this;
	}

	/**
	 * Get the specifies the connection type of the connection instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * Set the specifies the connection type of the connection instance.
	 *
	 * @since 1.0
	 * @param connectionType the input value
	 */
	public void  setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	/**
	 * Set the specifies the connection type of the connection instance.
	 *
	 * @since 1.0
	 * @param connectionType the input value
	 * @return this instance
	 */
	public WANPPPConnection withConnectionType(String connectionType) {
		this.connectionType = connectionType;
		return this;
	}

	/**
	 * Get the user-readable name of this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the user-readable name of this connection.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the user-readable name of this connection.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public WANPPPConnection withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the time in seconds that this connection has been up.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUptime() {
		return uptime;
	}

	/**
	 * Set the time in seconds that this connection has been up.
	 *
	 * @since 1.0
	 * @param uptime the input value
	 */
	public void  setUptime(Long uptime) {
		this.uptime = uptime;
	}

	/**
	 * Set the time in seconds that this connection has been up.
	 *
	 * @since 1.0
	 * @param uptime the input value
	 * @return this instance
	 */
	public WANPPPConnection withUptime(Long uptime) {
		this.uptime = uptime;
		return this;
	}

	/**
	 * Get the cause of failure for the last connection setup attempt.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLastConnectionError() {
		return lastConnectionError;
	}

	/**
	 * Set the cause of failure for the last connection setup attempt.
	 *
	 * @since 1.0
	 * @param lastConnectionError the input value
	 */
	public void  setLastConnectionError(String lastConnectionError) {
		this.lastConnectionError = lastConnectionError;
	}

	/**
	 * Set the cause of failure for the last connection setup attempt.
	 *
	 * @since 1.0
	 * @param lastConnectionError the input value
	 * @return this instance
	 */
	public WANPPPConnection withLastConnectionError(String lastConnectionError) {
		this.lastConnectionError = lastConnectionError;
		return this;
	}

	/**
	 * Get the time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAutoDisconnectTime() {
		return autoDisconnectTime;
	}

	/**
	 * Set the time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 * @param autoDisconnectTime the input value
	 */
	public void  setAutoDisconnectTime(Long autoDisconnectTime) {
		this.autoDisconnectTime = autoDisconnectTime;
	}

	/**
	 * Set the time in seconds since the establishment of the connection after which connection termination is automatically initiated by the CPE.  This occurs irrespective of whether the connection is being used or not.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 * @param autoDisconnectTime the input value
	 * @return this instance
	 */
	public WANPPPConnection withAutoDisconnectTime(Long autoDisconnectTime) {
		this.autoDisconnectTime = autoDisconnectTime;
		return this;
	}

	/**
	 * Get the time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIdleDisconnectTime() {
		return idleDisconnectTime;
	}

	/**
	 * Set the time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 * @param idleDisconnectTime the input value
	 */
	public void  setIdleDisconnectTime(Long idleDisconnectTime) {
		this.idleDisconnectTime = idleDisconnectTime;
	}

	/**
	 * Set the time in seconds that if the connection remains idle, the CPE automatically terminates the connection.  A value of 0 (zero) indicates that the connection is not to be shut down automatically.
	 *
	 * @since 1.0
	 * @param idleDisconnectTime the input value
	 * @return this instance
	 */
	public WANPPPConnection withIdleDisconnectTime(Long idleDisconnectTime) {
		this.idleDisconnectTime = idleDisconnectTime;
		return this;
	}

	/**
	 * Get the time in seconds the Status remains in the pending disconnect state before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getWarnDisconnectDelay() {
		return warnDisconnectDelay;
	}

	/**
	 * Set the time in seconds the Status remains in the pending disconnect state before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 1.0
	 * @param warnDisconnectDelay the input value
	 */
	public void  setWarnDisconnectDelay(Long warnDisconnectDelay) {
		this.warnDisconnectDelay = warnDisconnectDelay;
	}

	/**
	 * Set the time in seconds the Status remains in the pending disconnect state before transitioning to disconnecting state to drop the connection.
	 *
	 * @since 1.0
	 * @param warnDisconnectDelay the input value
	 * @return this instance
	 */
	public WANPPPConnection withWarnDisconnectDelay(Long warnDisconnectDelay) {
		this.warnDisconnectDelay = warnDisconnectDelay;
		return this;
	}

	/**
	 * Get the indicates if Realm-specific IP (RSIP) is available as a feature on the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isRsiPAvailable() {
		return rsiPAvailable;
	}

	/**
	 * Set the indicates if Realm-specific IP (RSIP) is available as a feature on the CPE.
	 *
	 * @since 1.0
	 * @param rsiPAvailable the input value
	 */
	public void  setRsiPAvailable(Boolean rsiPAvailable) {
		this.rsiPAvailable = rsiPAvailable;
	}

	/**
	 * Set the indicates if Realm-specific IP (RSIP) is available as a feature on the CPE.
	 *
	 * @since 1.0
	 * @param rsiPAvailable the input value
	 * @return this instance
	 */
	public WANPPPConnection withRsiPAvailable(Boolean rsiPAvailable) {
		this.rsiPAvailable = rsiPAvailable;
		return this;
	}

	/**
	 * Get the indicates if Network Address Translation (NAT) is enabled for this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isNatEnabled() {
		return natEnabled;
	}

	/**
	 * Set the indicates if Network Address Translation (NAT) is enabled for this connection.
	 *
	 * @since 1.0
	 * @param natEnabled the input value
	 */
	public void  setNatEnabled(Boolean natEnabled) {
		this.natEnabled = natEnabled;
	}

	/**
	 * Set the indicates if Network Address Translation (NAT) is enabled for this connection.
	 *
	 * @since 1.0
	 * @param natEnabled the input value
	 * @return this instance
	 */
	public WANPPPConnection withNatEnabled(Boolean natEnabled) {
		this.natEnabled = natEnabled;
		return this;
	}

	/**
	 * Get the username to be used for authentication.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username to be used for authentication.
	 *
	 * @since 1.0
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username to be used for authentication.
	 *
	 * @since 1.0
	 * @param username the input value
	 * @return this instance
	 */
	public WANPPPConnection withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password to be usef for authentication.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password to be usef for authentication.
	 *
	 * @since 1.0
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password to be usef for authentication.
	 *
	 * @since 1.0
	 * @param password the input value
	 * @return this instance
	 */
	public WANPPPConnection withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the describes the PPP encryption protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPppEncryptionProtocol() {
		return pppEncryptionProtocol;
	}

	/**
	 * Set the describes the PPP encryption protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @param pppEncryptionProtocol the input value
	 */
	public void  setPppEncryptionProtocol(String pppEncryptionProtocol) {
		this.pppEncryptionProtocol = pppEncryptionProtocol;
	}

	/**
	 * Set the describes the PPP encryption protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @param pppEncryptionProtocol the input value
	 * @return this instance
	 */
	public WANPPPConnection withPppEncryptionProtocol(String pppEncryptionProtocol) {
		this.pppEncryptionProtocol = pppEncryptionProtocol;
		return this;
	}

	/**
	 * Get the describes the PPP compression protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPppCompressionProtocol() {
		return pppCompressionProtocol;
	}

	/**
	 * Set the describes the PPP compression protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @param pppCompressionProtocol the input value
	 */
	public void  setPppCompressionProtocol(String pppCompressionProtocol) {
		this.pppCompressionProtocol = pppCompressionProtocol;
	}

	/**
	 * Set the describes the PPP compression protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @param pppCompressionProtocol the input value
	 * @return this instance
	 */
	public WANPPPConnection withPppCompressionProtocol(String pppCompressionProtocol) {
		this.pppCompressionProtocol = pppCompressionProtocol;
		return this;
	}

	/**
	 * Get the describes the PPP authentication protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPppAuthenticationProtocol() {
		return pppAuthenticationProtocol;
	}

	/**
	 * Set the describes the PPP authentication protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @param pppAuthenticationProtocol the input value
	 */
	public void  setPppAuthenticationProtocol(String pppAuthenticationProtocol) {
		this.pppAuthenticationProtocol = pppAuthenticationProtocol;
	}

	/**
	 * Set the describes the PPP authentication protocol used between the WAN device and the ISP POP.
	 *
	 * @since 1.0
	 * @param pppAuthenticationProtocol the input value
	 * @return this instance
	 */
	public WANPPPConnection withPppAuthenticationProtocol(String pppAuthenticationProtocol) {
		this.pppAuthenticationProtocol = pppAuthenticationProtocol;
		return this;
	}

	/**
	 * Get the this is the external IP address used by NAT for this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getExternalIPAddress() {
		return externalIPAddress;
	}

	/**
	 * Set the this is the external IP address used by NAT for this connection.
	 *
	 * @since 1.0
	 * @param externalIPAddress the input value
	 */
	public void  setExternalIPAddress(IPAddress externalIPAddress) {
		this.externalIPAddress = externalIPAddress;
	}

	/**
	 * Set the this is the external IP address used by NAT for this connection.
	 *
	 * @since 1.0
	 * @param externalIPAddress the input value
	 * @return this instance
	 */
	public WANPPPConnection withExternalIPAddress(IPAddress externalIPAddress) {
		this.externalIPAddress = externalIPAddress;
		return this;
	}

	/**
	 * Get the remote IP address for this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getRemoteIPAddress() {
		return remoteIPAddress;
	}

	/**
	 * Set the remote IP address for this connection.
	 *
	 * @since 1.0
	 * @param remoteIPAddress the input value
	 */
	public void  setRemoteIPAddress(IPAddress remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
	}

	/**
	 * Set the remote IP address for this connection.
	 *
	 * @since 1.0
	 * @param remoteIPAddress the input value
	 * @return this instance
	 */
	public WANPPPConnection withRemoteIPAddress(IPAddress remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
		return this;
	}

	/**
	 * Get the maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxMRUSize() {
		return maxMRUSize;
	}

	/**
	 * Set the maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 1.0
	 * @param maxMRUSize the input value
	 */
	public void  setMaxMRUSize(Long maxMRUSize) {
		this.maxMRUSize = maxMRUSize;
	}

	/**
	 * Set the maximum allowed size of frames sent from the remote peer.
	 *
	 * @since 1.0
	 * @param maxMRUSize the input value
	 * @return this instance
	 */
	public WANPPPConnection withMaxMRUSize(Long maxMRUSize) {
		this.maxMRUSize = maxMRUSize;
		return this;
	}

	/**
	 * Get the current MRU in use over this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentMRUSize() {
		return currentMRUSize;
	}

	/**
	 * Set the current MRU in use over this connection.
	 *
	 * @since 1.0
	 * @param currentMRUSize the input value
	 */
	public void  setCurrentMRUSize(Long currentMRUSize) {
		this.currentMRUSize = currentMRUSize;
	}

	/**
	 * Set the current MRU in use over this connection.
	 *
	 * @since 1.0
	 * @param currentMRUSize the input value
	 * @return this instance
	 */
	public WANPPPConnection withCurrentMRUSize(Long currentMRUSize) {
		this.currentMRUSize = currentMRUSize;
		return this;
	}

	/**
	 * Get the whether or not the device SHOULD attempt to query a DNS server across this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDnsEnabled() {
		return dnsEnabled;
	}

	/**
	 * Set the whether or not the device SHOULD attempt to query a DNS server across this connection.
	 *
	 * @since 1.0
	 * @param dnsEnabled the input value
	 */
	public void  setDnsEnabled(Boolean dnsEnabled) {
		this.dnsEnabled = dnsEnabled;
	}

	/**
	 * Set the whether or not the device SHOULD attempt to query a DNS server across this connection.
	 *
	 * @since 1.0
	 * @param dnsEnabled the input value
	 * @return this instance
	 */
	public WANPPPConnection withDnsEnabled(Boolean dnsEnabled) {
		this.dnsEnabled = dnsEnabled;
		return this;
	}

	/**
	 * Get the whether or not a manually set, non-empty DNS address can be overridden by a DNS entry received from the WAN.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDnsOverrideAllowed() {
		return dnsOverrideAllowed;
	}

	/**
	 * Set the whether or not a manually set, non-empty DNS address can be overridden by a DNS entry received from the WAN.
	 *
	 * @since 1.0
	 * @param dnsOverrideAllowed the input value
	 */
	public void  setDnsOverrideAllowed(Boolean dnsOverrideAllowed) {
		this.dnsOverrideAllowed = dnsOverrideAllowed;
	}

	/**
	 * Set the whether or not a manually set, non-empty DNS address can be overridden by a DNS entry received from the WAN.
	 *
	 * @since 1.0
	 * @param dnsOverrideAllowed the input value
	 * @return this instance
	 */
	public WANPPPConnection withDnsOverrideAllowed(Boolean dnsOverrideAllowed) {
		this.dnsOverrideAllowed = dnsOverrideAllowed;
		return this;
	}

	/**
	 * Get the dns server IP addresses for this connection.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the dns server IP addresses for this connection.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the dns server IP addresses for this connection.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 * @return this instance
	 */
	public WANPPPConnection withDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the physical address of the ''WANPPPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{empty}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the physical address of the ''WANPPPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{empty}}.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the physical address of the ''WANPPPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{empty}}.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public WANPPPConnection withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{false}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isMacAddressOverride() {
		return macAddressOverride;
	}

	/**
	 * Set the whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{false}}.
	 *
	 * @since 1.0
	 * @param macAddressOverride the input value
	 */
	public void  setMacAddressOverride(Boolean macAddressOverride) {
		this.macAddressOverride = macAddressOverride;
	}

	/**
	 * Set the whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).

If {{param|TransportType}} is {{enum|PPPoA|TransportType}}, the value of this parameter is irrelevant and MUST be {{false}}.
	 *
	 * @since 1.0
	 * @param macAddressOverride the input value
	 * @return this instance
	 */
	public WANPPPConnection withMacAddressOverride(Boolean macAddressOverride) {
		this.macAddressOverride = macAddressOverride;
		return this;
	}

	/**
	 * Get the ppp transport type of the connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getTransportType() {
		return transportType;
	}

	/**
	 * Set the ppp transport type of the connection.
	 *
	 * @since 1.0
	 * @param transportType the input value
	 */
	public void  setTransportType(String transportType) {
		this.transportType = transportType;
	}

	/**
	 * Set the ppp transport type of the connection.
	 *
	 * @since 1.0
	 * @param transportType the input value
	 * @return this instance
	 */
	public WANPPPConnection withTransportType(String transportType) {
		this.transportType = transportType;
		return this;
	}

	/**
	 * Get the pppoE Access Concentrator.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPppoEACName() {
		return pppoEACName;
	}

	/**
	 * Set the pppoE Access Concentrator.
	 *
	 * @since 1.0
	 * @param pppoEACName the input value
	 */
	public void  setPppoEACName(String pppoEACName) {
		this.pppoEACName = pppoEACName;
	}

	/**
	 * Set the pppoE Access Concentrator.
	 *
	 * @since 1.0
	 * @param pppoEACName the input value
	 * @return this instance
	 */
	public WANPPPConnection withPppoEACName(String pppoEACName) {
		this.pppoEACName = pppoEACName;
		return this;
	}

	/**
	 * Get the pppoE Service Name.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPppoEServiceName() {
		return pppoEServiceName;
	}

	/**
	 * Set the pppoE Service Name.
	 *
	 * @since 1.0
	 * @param pppoEServiceName the input value
	 */
	public void  setPppoEServiceName(String pppoEServiceName) {
		this.pppoEServiceName = pppoEServiceName;
	}

	/**
	 * Set the pppoE Service Name.
	 *
	 * @since 1.0
	 * @param pppoEServiceName the input value
	 * @return this instance
	 */
	public WANPPPConnection withPppoEServiceName(String pppoEServiceName) {
		this.pppoEServiceName = pppoEServiceName;
		return this;
	}

	/**
	 * Get the trigger used to establish the PPP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this PPP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionTrigger() {
		return connectionTrigger;
	}

	/**
	 * Set the trigger used to establish the PPP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this PPP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 1.0
	 * @param connectionTrigger the input value
	 */
	public void  setConnectionTrigger(String connectionTrigger) {
		this.connectionTrigger = connectionTrigger;
	}

	/**
	 * Set the trigger used to establish the PPP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this PPP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this PPP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for a PPP connection becoming disconnected to begin with might be either external to the CPE, such as termination by the BRAS or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.
	 *
	 * @since 1.0
	 * @param connectionTrigger the input value
	 * @return this instance
	 */
	public WANPPPConnection withConnectionTrigger(String connectionTrigger) {
		this.connectionTrigger = connectionTrigger;
		return this;
	}

	/**
	 * Get the defines the Rx protocol to be used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getRouteProtocolRx() {
		return routeProtocolRx;
	}

	/**
	 * Set the defines the Rx protocol to be used.
	 *
	 * @since 1.0
	 * @param routeProtocolRx the input value
	 */
	public void  setRouteProtocolRx(String routeProtocolRx) {
		this.routeProtocolRx = routeProtocolRx;
	}

	/**
	 * Set the defines the Rx protocol to be used.
	 *
	 * @since 1.0
	 * @param routeProtocolRx the input value
	 * @return this instance
	 */
	public WANPPPConnection withRouteProtocolRx(String routeProtocolRx) {
		this.routeProtocolRx = routeProtocolRx;
		return this;
	}

	/**
	 * Get the ppp LCP Echo period in seconds.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPppLCPEcho() {
		return pppLCPEcho;
	}

	/**
	 * Set the ppp LCP Echo period in seconds.
	 *
	 * @since 1.0
	 * @param pppLCPEcho the input value
	 */
	public void  setPppLCPEcho(Long pppLCPEcho) {
		this.pppLCPEcho = pppLCPEcho;
	}

	/**
	 * Set the ppp LCP Echo period in seconds.
	 *
	 * @since 1.0
	 * @param pppLCPEcho the input value
	 * @return this instance
	 */
	public WANPPPConnection withPppLCPEcho(Long pppLCPEcho) {
		this.pppLCPEcho = pppLCPEcho;
		return this;
	}

	/**
	 * Get the number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPppLCPEchoRetry() {
		return pppLCPEchoRetry;
	}

	/**
	 * Set the number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 1.0
	 * @param pppLCPEchoRetry the input value
	 */
	public void  setPppLCPEchoRetry(Long pppLCPEchoRetry) {
		this.pppLCPEchoRetry = pppLCPEchoRetry;
	}

	/**
	 * Set the number of PPP LCP Echo retries within an echo period.
	 *
	 * @since 1.0
	 * @param pppLCPEchoRetry the input value
	 * @return this instance
	 */
	public WANPPPConnection withPppLCPEchoRetry(Long pppLCPEchoRetry) {
		this.pppLCPEchoRetry = pppLCPEchoRetry;
		return this;
	}

	/**
	 * Get the rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getShapingRate() {
		return shapingRate;
	}

	/**
	 * Set the rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.
	 *
	 * @since 1.1
	 * @param shapingRate the input value
	 */
	public void  setShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
	}

	/**
	 * Set the rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.
	 *
	 * @since 1.1
	 * @param shapingRate the input value
	 * @return this instance
	 */
	public WANPPPConnection withShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
		return this;
	}

	/**
	 * Get the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getShapingBurstSize() {
		return shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 * @param shapingBurstSize the input value
	 */
	public void  setShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 * @param shapingBurstSize the input value
	 * @return this instance
	 */
	public WANPPPConnection withShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
		return this;
	}

	/**
	 * Get the port mapping table.

This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

At most one entry in an instance of this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.  If the ACS attempts to set the parameters of an existing entry such that this requirement would be violated, the CPE MUST reject the request.  In this case, the SetParameterValues response MUST include a SetParameterValuesFault element for each parameter in the corresponding request whose modification would have resulted in such a violation.  On creation of a new table entry, the CPE MUST choose default values for {{param|ExternalPort}} and {{param|PortMappingProtocol}} such that the new entry does not conflict with any existing entry.
	 *
	 * @return the value
	 */
	public Collection<PortMapping> getPortMappings() {
		if (this.portMappings == null){ this.portMappings=new ArrayList<>();}
		return portMappings;
	}

	/**
	 * Set the port mapping table.

This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

At most one entry in an instance of this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.  If the ACS attempts to set the parameters of an existing entry such that this requirement would be violated, the CPE MUST reject the request.  In this case, the SetParameterValues response MUST include a SetParameterValuesFault element for each parameter in the corresponding request whose modification would have resulted in such a violation.  On creation of a new table entry, the CPE MUST choose default values for {{param|ExternalPort}} and {{param|PortMappingProtocol}} such that the new entry does not conflict with any existing entry.
	 *
	 * @param portMappings the input value
	 */
	public void  setPortMappings(Collection<PortMapping> portMappings) {
		this.portMappings = portMappings;
	}

	/**
	 * Set the port mapping table.

This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

At most one entry in an instance of this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.  If the ACS attempts to set the parameters of an existing entry such that this requirement would be violated, the CPE MUST reject the request.  In this case, the SetParameterValues response MUST include a SetParameterValuesFault element for each parameter in the corresponding request whose modification would have resulted in such a violation.  On creation of a new table entry, the CPE MUST choose default values for {{param|ExternalPort}} and {{param|PortMappingProtocol}} such that the new entry does not conflict with any existing entry.
	 *
	 * @param portMapping the input value
	 * @return this instance
	 */
	public WANPPPConnection withPortMapping(PortMapping portMapping) {
		getPortMappings().add(portMapping);
		return this;
	}

	/**
	 * Get the this object contains statistics for all connections within the same ''WANConnectionDevice'' that share a common MAC address.  The contents of this object SHOULD be identical for each such connection.

This object is intended only for ''WANConnectionDevice''s that can support an Ethernet-layer on this interface (e.g., ''PPPoE'', ''IPoE'').
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for all connections within the same ''WANConnectionDevice'' that share a common MAC address.  The contents of this object SHOULD be identical for each such connection.

This object is intended only for ''WANConnectionDevice''s that can support an Ethernet-layer on this interface (e.g., ''PPPoE'', ''IPoE'').
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for all connections within the same ''WANConnectionDevice'' that share a common MAC address.  The contents of this object SHOULD be identical for each such connection.

This object is intended only for ''WANConnectionDevice''s that can support an Ethernet-layer on this interface (e.g., ''PPPoE'', ''IPoE'').
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public WANPPPConnection withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}