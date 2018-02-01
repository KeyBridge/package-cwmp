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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice.wanconnectiondevice.wanpppconnection;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Port mapping table.

This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

At most one entry in an instance of this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.  If the ACS attempts to set the parameters of an existing entry such that this requirement would be violated, the CPE MUST reject the request.  In this case, the SetParameterValues response MUST include a SetParameterValuesFault element for each parameter in the corresponding request whose modification would have resulted in such a violation.  On creation of a new table entry, the CPE MUST choose default values for {{param|ExternalPort}} and {{param|PortMappingProtocol}} such that the new entry does not conflict with any existing entry.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPPPConnection.{i}.PortMapping.{i}.")
public class PortMapping {

	/**
	 * Enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean portMappingEnabled = false;
	/**
	 * Determines the time to live, in seconds, of a port-mapping lease, where "time to live" means the number of seconds before the port mapping expires. 

A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value for {{param}} that MUST be supported is 0.

For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port-mapping lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port-mapping lease expires, the CPE MUST automatically terminate that port mapping, and MUST automatically delete the corresponding ''PortMapping'' table entry.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingLeaseDuration")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Long portMappingLeaseDuration;
	/**
	 * This parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are REQUIRED only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

If a CPE supports non-wildcard values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|PortMappingProtocol}}, but with differing values of {{param}}.

When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param}}, explicit {{param|ExternalPort}}

# Explicit {{param}}, wildcard {{param|ExternalPort}}

# Wildcard {{param}}, explicit {{param|ExternalPort}}

# Wildcard {{param}}, wildcard {{param|ExternalPort}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RemoteHost")
	@CWMPParameter(access = "readWrite")
	public String remoteHost;
	/**
	 * The external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.

When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param|RemoteHost}}, explicit {{param}}

# Explicit {{param|RemoteHost}}, wildcard {{param}}

# Wildcard {{param|RemoteHost}}, explicit {{param}}

# Wildcard {{param|RemoteHost}}, wildcard {{param}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ExternalPort")
	@CWMPParameter(access = "readWrite")
	public Long externalPort;
	/**
	 * The port on {{param|InternalClient}} that the gateway SHOULD forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InternalPort")
	@CWMPParameter(access = "readWrite")
	public Long internalPort;
	/**
	 * The protocol of the port mapping.  {{enum}}

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingProtocol")
	@CWMPParameter(access = "readWrite")
	public String portMappingProtocol;
	/**
	 * The IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the ''Hosts'' table ({{object|InternetGatewayDevice.LANDevice.{i}.Hosts}}).

Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

{{empty}} indicates an unconfigured {{param}}. If this parameter is unconfigured, this port mapping MUST NOT be operational.

It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InternalClient")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String internalClient;
	/**
	 * User-readable description of this port mapping.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortMappingDescription")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String portMappingDescription;

	public PortMapping() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPortMappingEnabled() {
		return portMappingEnabled;
	}

	/**
	 * Set the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param portMappingEnabled the input value
	 */
	public void  setPortMappingEnabled(Boolean portMappingEnabled) {
		this.portMappingEnabled = portMappingEnabled;
	}

	/**
	 * Set the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param portMappingEnabled the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingEnabled(Boolean portMappingEnabled) {
		this.portMappingEnabled = portMappingEnabled;
		return this;
	}

	/**
	 * Get the determines the time to live, in seconds, of a port-mapping lease, where "time to live" means the number of seconds before the port mapping expires. 

A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value for {{param}} that MUST be supported is 0.

For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port-mapping lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port-mapping lease expires, the CPE MUST automatically terminate that port mapping, and MUST automatically delete the corresponding ''PortMapping'' table entry.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPortMappingLeaseDuration() {
		return portMappingLeaseDuration;
	}

	/**
	 * Set the determines the time to live, in seconds, of a port-mapping lease, where "time to live" means the number of seconds before the port mapping expires. 

A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value for {{param}} that MUST be supported is 0.

For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port-mapping lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port-mapping lease expires, the CPE MUST automatically terminate that port mapping, and MUST automatically delete the corresponding ''PortMapping'' table entry.
	 *
	 * @since 1.0
	 * @param portMappingLeaseDuration the input value
	 */
	public void  setPortMappingLeaseDuration(Long portMappingLeaseDuration) {
		this.portMappingLeaseDuration = portMappingLeaseDuration;
	}

	/**
	 * Set the determines the time to live, in seconds, of a port-mapping lease, where "time to live" means the number of seconds before the port mapping expires. 

A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value for {{param}} that MUST be supported is 0.

For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port-mapping lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port-mapping lease expires, the CPE MUST automatically terminate that port mapping, and MUST automatically delete the corresponding ''PortMapping'' table entry.
	 *
	 * @since 1.0
	 * @param portMappingLeaseDuration the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingLeaseDuration(Long portMappingLeaseDuration) {
		this.portMappingLeaseDuration = portMappingLeaseDuration;
		return this;
	}

	/**
	 * Get the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are REQUIRED only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

If a CPE supports non-wildcard values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|PortMappingProtocol}}, but with differing values of {{param}}.

When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param}}, explicit {{param|ExternalPort}}

# Explicit {{param}}, wildcard {{param|ExternalPort}}

# Wildcard {{param}}, explicit {{param|ExternalPort}}

# Wildcard {{param}}, wildcard {{param|ExternalPort}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getRemoteHost() {
		return remoteHost;
	}

	/**
	 * Set the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are REQUIRED only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

If a CPE supports non-wildcard values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|PortMappingProtocol}}, but with differing values of {{param}}.

When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param}}, explicit {{param|ExternalPort}}

# Explicit {{param}}, wildcard {{param|ExternalPort}}

# Wildcard {{param}}, explicit {{param|ExternalPort}}

# Wildcard {{param}}, wildcard {{param|ExternalPort}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 * @param remoteHost the input value
	 */
	public void  setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	/**
	 * Set the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard" (this will be a wildcard in most cases).  CPE are REQUIRED only to support wildcards.

When {{param}} is a wildcard, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{param|InternalClient}} on the {{param|InternalPort}}.

When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

If a CPE supports non-wildcard values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|PortMappingProtocol}}, but with differing values of {{param}}.

When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param}}, explicit {{param|ExternalPort}}

# Explicit {{param}}, wildcard {{param|ExternalPort}}

# Wildcard {{param}}, explicit {{param|ExternalPort}}

# Wildcard {{param}}, wildcard {{param|ExternalPort}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param}}, {{param|ExternalPort}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 * @param remoteHost the input value
	 * @return this instance
	 */
	public PortMapping withRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
		return this;
	}

	/**
	 * Get the external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.

When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param|RemoteHost}}, explicit {{param}}

# Explicit {{param|RemoteHost}}, wildcard {{param}}

# Wildcard {{param|RemoteHost}}, explicit {{param}}

# Wildcard {{param|RemoteHost}}, wildcard {{param}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getExternalPort() {
		return externalPort;
	}

	/**
	 * Set the external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.

When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param|RemoteHost}}, explicit {{param}}

# Explicit {{param|RemoteHost}}, wildcard {{param}}

# Wildcard {{param|RemoteHost}}, explicit {{param}}

# Wildcard {{param|RemoteHost}}, wildcard {{param}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 * @param externalPort the input value
	 */
	public void  setExternalPort(Long externalPort) {
		this.externalPort = externalPort;
	}

	/**
	 * Set the external port that the NAT gateway would listen on for connection requests to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to {{param|InternalClient}} on the {{param|InternalPort}}.

A value of zero (0) represents a "wildcard".  If this value is a wildcard, connection request on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}.  In the wildcard case, the value(s) of {{param|InternalPort}} on {{param|InternalClient}} are ignored.

When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

# Explicit {{param|RemoteHost}}, explicit {{param}}

# Explicit {{param|RemoteHost}}, wildcard {{param}}

# Wildcard {{param|RemoteHost}}, explicit {{param}}

# Wildcard {{param|RemoteHost}}, wildcard {{param}}

If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param}}, and {{param|PortMappingProtocol}}.
	 *
	 * @since 1.0
	 * @param externalPort the input value
	 * @return this instance
	 */
	public PortMapping withExternalPort(Long externalPort) {
		this.externalPort = externalPort;
		return this;
	}

	/**
	 * Get the port on {{param|InternalClient}} that the gateway SHOULD forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getInternalPort() {
		return internalPort;
	}

	/**
	 * Set the port on {{param|InternalClient}} that the gateway SHOULD forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 * @param internalPort the input value
	 */
	public void  setInternalPort(Long internalPort) {
		this.internalPort = internalPort;
	}

	/**
	 * Set the port on {{param|InternalClient}} that the gateway SHOULD forward connection requests to.  A value of zero (0) is not allowed.
	 *
	 * @since 1.0
	 * @param internalPort the input value
	 * @return this instance
	 */
	public PortMapping withInternalPort(Long internalPort) {
		this.internalPort = internalPort;
		return this;
	}

	/**
	 * Get the protocol of the port mapping.  {{enum}}

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPortMappingProtocol() {
		return portMappingProtocol;
	}

	/**
	 * Set the protocol of the port mapping.  {{enum}}

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param}}.
	 *
	 * @since 1.0
	 * @param portMappingProtocol the input value
	 */
	public void  setPortMappingProtocol(String portMappingProtocol) {
		this.portMappingProtocol = portMappingProtocol;
	}

	/**
	 * Set the protocol of the port mapping.  {{enum}}

At most one entry in this table can exist with all of the same values for {{param|RemoteHost}}, {{param|ExternalPort}}, and {{param}}.
	 *
	 * @since 1.0
	 * @param portMappingProtocol the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingProtocol(String portMappingProtocol) {
		this.portMappingProtocol = portMappingProtocol;
		return this;
	}

	/**
	 * Get the IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the ''Hosts'' table ({{object|InternetGatewayDevice.LANDevice.{i}.Hosts}}).

Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

{{empty}} indicates an unconfigured {{param}}. If this parameter is unconfigured, this port mapping MUST NOT be operational.

It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getInternalClient() {
		return internalClient;
	}

	/**
	 * Set the IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the ''Hosts'' table ({{object|InternetGatewayDevice.LANDevice.{i}.Hosts}}).

Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

{{empty}} indicates an unconfigured {{param}}. If this parameter is unconfigured, this port mapping MUST NOT be operational.

It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 * @param internalClient the input value
	 */
	public void  setInternalClient(String internalClient) {
		this.internalClient = internalClient;
	}

	/**
	 * Set the IP address or DNS host name of an internal client (on the LAN).

Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the ''Hosts'' table ({{object|InternetGatewayDevice.LANDevice.{i}.Hosts}}).

Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

{{empty}} indicates an unconfigured {{param}}. If this parameter is unconfigured, this port mapping MUST NOT be operational.

It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 1.0
	 * @param internalClient the input value
	 * @return this instance
	 */
	public PortMapping withInternalClient(String internalClient) {
		this.internalClient = internalClient;
		return this;
	}

	/**
	 * Get the user-readable description of this port mapping.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPortMappingDescription() {
		return portMappingDescription;
	}

	/**
	 * Set the user-readable description of this port mapping.
	 *
	 * @since 1.0
	 * @param portMappingDescription the input value
	 */
	public void  setPortMappingDescription(String portMappingDescription) {
		this.portMappingDescription = portMappingDescription;
	}

	/**
	 * Set the user-readable description of this port mapping.
	 *
	 * @since 1.0
	 * @param portMappingDescription the input value
	 * @return this instance
	 */
	public PortMapping withPortMappingDescription(String portMappingDescription) {
		this.portMappingDescription = portMappingDescription;
		return this;
	}

	//</editor-fold>

}