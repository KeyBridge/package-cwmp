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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.datatypes.IPAddress;
import org.broadbandforum.tr098.datatypes.MACAddress;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection.DHCPClient;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection.PortMapping;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection.Stats;

	/**
	 * This object enables configuration of IP connections on the WAN interface of a CPE.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANIPConnection.{i}.")
@XmlRootElement(name = "WANIPConnection")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANIPConnection")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANIPConnection {

	/**
	 * Enables or disables the connection instance.  On creation of a ''WANIPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * When set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

When read, this parameter always returns {{false}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset = false;
	/**
	 * Current status of the connection.  {{enum}}

The value {{enum|Disconneting}} is DEPRECATED because it is a typo.  The ACS MUST treat {{enum|Disconneting}} and {{enum|Disconnecting}} the same.
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
	 * The method used to assign an address to the WAN side interface of the CPE for this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AddressingType")
	@CWMPParameter(access = "readWrite")
	public String addressingType;
	/**
	 * This is the external IP address used by NAT for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.

If Active Notification is enabled, the CPE MUST initiate an Inform whenever either the value of this parameter changes or the default WAN connection changes to a different connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ExternalIPAddress")
	@CWMPParameter(access = "readWrite", activeNotify = "forceDefaultEnabled", forcedInform = true)
	public IPAddress externalIPAddress;
	/**
	 * Subnet mask of the WAN interface.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress subnetMask;
	/**
	 * The IP address of the default gateway for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DefaultGateway")
	@CWMPParameter(access = "readWrite")
	public String defaultGateway;
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
	 * The maximum allowed size of an Ethernet frame from LAN-side devices.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxMTUSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1540)
	public Long maxMTUSize;
	/**
	 * The physical address of the ''WANIPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress macAddress;
	/**
	 * Whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddressOverride")
	@CWMPParameter(access = "readWrite")
	public Boolean macAddressOverride;
	/**
	 * Trigger used to establish the IP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this IP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for an IP connection becoming disconnected to begin with might be either external to the CPE, such as non-renewal of a DHCP lease or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.

Note also that the means by which a CPE would keep an IP connection disconnected (while waiting for the designated trigger) if it is otherwise physically connected and has an IP address is a local matter specific to the implementation of the CPE.
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
	 * Rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
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
	 * This object contains DHCP client configuration parameters.
	 */
	@XmlElement(name = "DHCPClient")
	public DHCPClient dhcPClient;
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

	public WANIPConnection() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the connection instance.  On creation of a ''WANIPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the connection instance.  On creation of a ''WANIPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the connection instance.  On creation of a ''WANIPConnection'' instance, it is initially disabled.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WANIPConnection withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public WANIPConnection withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

When read, this parameter always returns {{false}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

When read, this parameter always returns {{false}}.
	 *
	 * @since 1.4
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

When read, this parameter always returns {{false}}.
	 *
	 * @since 1.4
	 * @param reset the input value
	 * @return this instance
	 */
	public WANIPConnection withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the current status of the connection.  {{enum}}

The value {{enum|Disconneting}} is DEPRECATED because it is a typo.  The ACS MUST treat {{enum|Disconneting}} and {{enum|Disconnecting}} the same.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionStatus() {
		return connectionStatus;
	}

	/**
	 * Set the current status of the connection.  {{enum}}

The value {{enum|Disconneting}} is DEPRECATED because it is a typo.  The ACS MUST treat {{enum|Disconneting}} and {{enum|Disconnecting}} the same.
	 *
	 * @since 1.0
	 * @param connectionStatus the input value
	 */
	public void  setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	/**
	 * Set the current status of the connection.  {{enum}}

The value {{enum|Disconneting}} is DEPRECATED because it is a typo.  The ACS MUST treat {{enum|Disconneting}} and {{enum|Disconnecting}} the same.
	 *
	 * @since 1.0
	 * @param connectionStatus the input value
	 * @return this instance
	 */
	public WANIPConnection withConnectionStatus(String connectionStatus) {
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
	public WANIPConnection withPossibleConnectionTypes(String string) {
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
	public WANIPConnection withConnectionType(String connectionType) {
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
	public WANIPConnection withName(String name) {
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
	public WANIPConnection withUptime(Long uptime) {
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
	public WANIPConnection withLastConnectionError(String lastConnectionError) {
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
	public WANIPConnection withAutoDisconnectTime(Long autoDisconnectTime) {
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
	public WANIPConnection withIdleDisconnectTime(Long idleDisconnectTime) {
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
	public WANIPConnection withWarnDisconnectDelay(Long warnDisconnectDelay) {
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
	public WANIPConnection withRsiPAvailable(Boolean rsiPAvailable) {
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
	public WANIPConnection withNatEnabled(Boolean natEnabled) {
		this.natEnabled = natEnabled;
		return this;
	}

	/**
	 * Get the method used to assign an address to the WAN side interface of the CPE for this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAddressingType() {
		return addressingType;
	}

	/**
	 * Set the method used to assign an address to the WAN side interface of the CPE for this connection.
	 *
	 * @since 1.0
	 * @param addressingType the input value
	 */
	public void  setAddressingType(String addressingType) {
		this.addressingType = addressingType;
	}

	/**
	 * Set the method used to assign an address to the WAN side interface of the CPE for this connection.
	 *
	 * @since 1.0
	 * @param addressingType the input value
	 * @return this instance
	 */
	public WANIPConnection withAddressingType(String addressingType) {
		this.addressingType = addressingType;
		return this;
	}

	/**
	 * Get the this is the external IP address used by NAT for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.

If Active Notification is enabled, the CPE MUST initiate an Inform whenever either the value of this parameter changes or the default WAN connection changes to a different connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getExternalIPAddress() {
		return externalIPAddress;
	}

	/**
	 * Set the this is the external IP address used by NAT for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.

If Active Notification is enabled, the CPE MUST initiate an Inform whenever either the value of this parameter changes or the default WAN connection changes to a different connection.
	 *
	 * @since 1.0
	 * @param externalIPAddress the input value
	 */
	public void  setExternalIPAddress(IPAddress externalIPAddress) {
		this.externalIPAddress = externalIPAddress;
	}

	/**
	 * Set the this is the external IP address used by NAT for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.

If Active Notification is enabled, the CPE MUST initiate an Inform whenever either the value of this parameter changes or the default WAN connection changes to a different connection.
	 *
	 * @since 1.0
	 * @param externalIPAddress the input value
	 * @return this instance
	 */
	public WANIPConnection withExternalIPAddress(IPAddress externalIPAddress) {
		this.externalIPAddress = externalIPAddress;
		return this;
	}

	/**
	 * Get the subnet mask of the WAN interface.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the subnet mask of the WAN interface.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the subnet mask of the WAN interface.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public WANIPConnection withSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the IP address of the default gateway for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDefaultGateway() {
		return defaultGateway;
	}

	/**
	 * Set the IP address of the default gateway for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 * @param defaultGateway the input value
	 */
	public void  setDefaultGateway(String defaultGateway) {
		this.defaultGateway = defaultGateway;
	}

	/**
	 * Set the IP address of the default gateway for this connection.  This parameter is configurable only if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 1.0
	 * @param defaultGateway the input value
	 * @return this instance
	 */
	public WANIPConnection withDefaultGateway(String defaultGateway) {
		this.defaultGateway = defaultGateway;
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
	public WANIPConnection withDnsEnabled(Boolean dnsEnabled) {
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
	public WANIPConnection withDnsOverrideAllowed(Boolean dnsOverrideAllowed) {
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
	public WANIPConnection withDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the maximum allowed size of an Ethernet frame from LAN-side devices.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxMTUSize() {
		return maxMTUSize;
	}

	/**
	 * Set the maximum allowed size of an Ethernet frame from LAN-side devices.
	 *
	 * @since 1.0
	 * @param maxMTUSize the input value
	 */
	public void  setMaxMTUSize(Long maxMTUSize) {
		this.maxMTUSize = maxMTUSize;
	}

	/**
	 * Set the maximum allowed size of an Ethernet frame from LAN-side devices.
	 *
	 * @since 1.0
	 * @param maxMTUSize the input value
	 * @return this instance
	 */
	public WANIPConnection withMaxMTUSize(Long maxMTUSize) {
		this.maxMTUSize = maxMTUSize;
		return this;
	}

	/**
	 * Get the physical address of the ''WANIPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the physical address of the ''WANIPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the physical address of the ''WANIPConnection'' if applicable.  Configurable only if {{param|MACAddressOverride}} is present and {{true}}.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public WANIPConnection withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isMacAddressOverride() {
		return macAddressOverride;
	}

	/**
	 * Set the whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).
	 *
	 * @since 1.0
	 * @param macAddressOverride the input value
	 */
	public void  setMacAddressOverride(Boolean macAddressOverride) {
		this.macAddressOverride = macAddressOverride;
	}

	/**
	 * Set the whether the value of {{param|MACAddress}} parameter can be overridden. If {{false}}, the CPE's default value is used (or restored if it had previously been overridden).
	 *
	 * @since 1.0
	 * @param macAddressOverride the input value
	 * @return this instance
	 */
	public WANIPConnection withMacAddressOverride(Boolean macAddressOverride) {
		this.macAddressOverride = macAddressOverride;
		return this;
	}

	/**
	 * Get the trigger used to establish the IP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this IP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for an IP connection becoming disconnected to begin with might be either external to the CPE, such as non-renewal of a DHCP lease or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.

Note also that the means by which a CPE would keep an IP connection disconnected (while waiting for the designated trigger) if it is otherwise physically connected and has an IP address is a local matter specific to the implementation of the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionTrigger() {
		return connectionTrigger;
	}

	/**
	 * Set the trigger used to establish the IP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this IP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for an IP connection becoming disconnected to begin with might be either external to the CPE, such as non-renewal of a DHCP lease or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.

Note also that the means by which a CPE would keep an IP connection disconnected (while waiting for the designated trigger) if it is otherwise physically connected and has an IP address is a local matter specific to the implementation of the CPE.
	 *
	 * @since 1.0
	 * @param connectionTrigger the input value
	 */
	public void  setConnectionTrigger(String connectionTrigger) {
		this.connectionTrigger = connectionTrigger;
	}

	/**
	 * Set the trigger used to establish the IP connection.  {{enum}}

The above values are defined as follows:

* {{enum|OnDemand}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the CPE has one or more packets to communicate over this connection, at which time the CPE automatically attempts to reestablish the connection.

* {{enum|AlwaysOn}}: If this IP connection is disconnected for any reason, the CPE automatically attempts to reestablish the connection (and continues to attempt to reestablish the connection as long it remains disconnected).

* {{enum|Manual}}: If this IP connection is disconnected for any reason, it is to remain disconnected until the user of the CPE explicitly instructs the CPE to reestablish the connection.

Note that the reason for an IP connection becoming disconnected to begin with might be either external to the CPE, such as non-renewal of a DHCP lease or momentary disconnection of the physical interface, or internal to the CPE, such as use of the {{param|IdleDisconnectTime}} and/or {{param|AutoDisconnectTime}} parameters in this object.

Note also that the means by which a CPE would keep an IP connection disconnected (while waiting for the designated trigger) if it is otherwise physically connected and has an IP address is a local matter specific to the implementation of the CPE.
	 *
	 * @since 1.0
	 * @param connectionTrigger the input value
	 * @return this instance
	 */
	public WANIPConnection withConnectionTrigger(String connectionTrigger) {
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
	public WANIPConnection withRouteProtocolRx(String routeProtocolRx) {
		this.routeProtocolRx = routeProtocolRx;
		return this;
	}

	/**
	 * Get the rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
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

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
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

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.1
	 * @param shapingRate the input value
	 * @return this instance
	 */
	public WANIPConnection withShapingRate(Integer shapingRate) {
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
	public WANIPConnection withShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
		return this;
	}

	/**
	 * Get the this object contains DHCP client configuration parameters.
	 *
	 * @return the value
	 */
	public DHCPClient getDhcPClient() {
		return dhcPClient;
	}

	/**
	 * Set the this object contains DHCP client configuration parameters.
	 *
	 * @param dhcPClient the input value
	 */
	public void  setDhcPClient(DHCPClient dhcPClient) {
		this.dhcPClient = dhcPClient;
	}

	/**
	 * Set the this object contains DHCP client configuration parameters.
	 *
	 * @param dhcPClient the input value
	 * @return this instance
	 */
	public WANIPConnection withDhcPClient(DHCPClient dhcPClient) {
		this.dhcPClient = dhcPClient;
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
	public WANIPConnection withPortMapping(PortMapping portMapping) {
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
	public WANIPConnection withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}