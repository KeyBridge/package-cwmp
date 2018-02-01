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
package org.broadbandforum.tr181.device.nat;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Port mapping table.

        This table MUST contain all NAT port mappings associated with this connection, including static and dynamic port mappings programmatically created via local control protocol, such as UPnP.

        This table MUST NOT contain dynamic NAT binding entries associated with the normal operation of NAT.

        If the CPE hosts a firewall, it is assumed that it will appropriately configure the firewall for the port mapping.

        For enabled table entries, if {{param|InternalClient}} is {{empty}}, or if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.NAT.PortMapping.{i}.")
public class PortMapping {

	/**
	 * Enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}} Specifies the IP interface to which this port mapping applies.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Indicates whether this port mapping applies to all IP interfaces that support port mappings. If {{true}}, the value of {{param|Interface}} is ignored since all supported IP interfaces are indicated.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllInterfaces")
	@CWMPParameter(access = "readWrite")
	public Boolean allInterfaces = false;
	/**
	 * Determines the time to live, in seconds, of a port mapping lease, where "time to live" means the number of  seconds before the port mapping expires. 

          A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value  for {{param}} that MUST be supported is 0.

          For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port mapping  lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port mapping lease expires, the CPE MUST  automatically terminate that port mapping, and MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseDuration")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "seconds")
	public Long leaseDuration;
	/**
	 * This parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard", i.e. any IP address (this will be {{empty}} in most cases).  CPE are REQUIRED only to support {{empty}}.

          When {{param}} is {{empty}}, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

          If a CPE supports non-empty values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|Protocol}}, but with differing values of {{param}}.

          When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param}}, explicit {{param|ExternalPort}}

          # Explicit {{param}}, zero {{param|ExternalPort}}

          # Empty {{param}}, explicit {{param|ExternalPort}}

          # Empty {{param}}, zero {{param|ExternalPort}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RemoteHost")
	@CWMPParameter(access = "readWrite")
	public String remoteHost;
	/**
	 * The external port (or the first port of a range of external ports) that the NAT gateway would listen on for traffic to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          A value of zero ({{null}}) represents a "wildcard", i.e. any port number.  If this value is {{null}}, traffic on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}, and the value(s) of  {{param|InternalPort}} on {{param|InternalClient}} are ignored.

          When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param|RemoteHost}}, explicit {{param}}

          # Explicit {{param|RemoteHost}}, zero {{param}}

          # Empty {{param|RemoteHost}}, explicit {{param}}

          # Empty {{param|RemoteHost}}, zero {{param}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ExternalPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long externalPort;
	/**
	 * Indicates the last port of the external port range that starts with {{param|ExternalPort}}.

          If an external port range is specified, then the behavior described for {{param|ExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|ExternalPort}}.

          If {{param|ExternalPort}} is zero (wildcard), the value of this parameter MUST be ignored.

          If specified, the value of this parameter MUST be greater than or equal to the value of {{param|ExternalPort}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ExternalPortEndRange")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long externalPortEndRange = 0L;
	/**
	 * The port on {{param|InternalClient}} that the gateway SHOULD forward traffic to.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InternalPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long internalPort;
	/**
	 * The protocol of the port mapping.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	public String protocol;
	/**
	 * The IP address or DNS host name of an internal client (on the LAN).

          Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

          Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the {{object|.Hosts.Host.}} table.

          Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

          It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InternalClient")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String internalClient;
	/**
	 * User-readable description of this port mapping.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Description")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String description;

	public PortMapping() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the port mapping instance.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public PortMapping withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public PortMapping withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public PortMapping withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}} Specifies the IP interface to which this port mapping applies.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} Specifies the IP interface to which this port mapping applies.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} Specifies the IP interface to which this port mapping applies.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public PortMapping with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the indicates whether this port mapping applies to all IP interfaces that support port mappings. If {{true}}, the value of {{param|Interface}} is ignored since all supported IP interfaces are indicated.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAllInterfaces() {
		return allInterfaces;
	}

	/**
	 * Set the indicates whether this port mapping applies to all IP interfaces that support port mappings. If {{true}}, the value of {{param|Interface}} is ignored since all supported IP interfaces are indicated.
	 *
	 * @since 2.0
	 * @param allInterfaces the input value
	 */
	public void  setAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
	}

	/**
	 * Set the indicates whether this port mapping applies to all IP interfaces that support port mappings. If {{true}}, the value of {{param|Interface}} is ignored since all supported IP interfaces are indicated.
	 *
	 * @since 2.0
	 * @param allInterfaces the input value
	 * @return this instance
	 */
	public PortMapping withAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
		return this;
	}

	/**
	 * Get the determines the time to live, in seconds, of a port mapping lease, where "time to live" means the number of  seconds before the port mapping expires. 

          A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value  for {{param}} that MUST be supported is 0.

          For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port mapping  lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port mapping lease expires, the CPE MUST  automatically terminate that port mapping, and MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLeaseDuration() {
		return leaseDuration;
	}

	/**
	 * Set the determines the time to live, in seconds, of a port mapping lease, where "time to live" means the number of  seconds before the port mapping expires. 

          A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value  for {{param}} that MUST be supported is 0.

          For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port mapping  lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port mapping lease expires, the CPE MUST  automatically terminate that port mapping, and MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.0
	 * @param leaseDuration the input value
	 */
	public void  setLeaseDuration(Long leaseDuration) {
		this.leaseDuration = leaseDuration;
	}

	/**
	 * Set the determines the time to live, in seconds, of a port mapping lease, where "time to live" means the number of  seconds before the port mapping expires. 

          A value of 0 means the port mapping is static. Support for dynamic (non-static) port mappings is OPTIONAL.  That is, the only value  for {{param}} that MUST be supported is 0.

          For a dynamic (non-static) port mapping, when this parameter is read, the value represents the time remaining on the port mapping  lease.  That is, for a dynamic port mapping, the value counts down toward 0.  When a dynamic port mapping lease expires, the CPE MUST  automatically terminate that port mapping, and MUST automatically delete the corresponding {{object}} table entry.
	 *
	 * @since 2.0
	 * @param leaseDuration the input value
	 * @return this instance
	 */
	public PortMapping withLeaseDuration(Long leaseDuration) {
		this.leaseDuration = leaseDuration;
		return this;
	}

	/**
	 * Get the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard", i.e. any IP address (this will be {{empty}} in most cases).  CPE are REQUIRED only to support {{empty}}.

          When {{param}} is {{empty}}, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

          If a CPE supports non-empty values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|Protocol}}, but with differing values of {{param}}.

          When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param}}, explicit {{param|ExternalPort}}

          # Explicit {{param}}, zero {{param|ExternalPort}}

          # Empty {{param}}, explicit {{param|ExternalPort}}

          # Empty {{param}}, zero {{param|ExternalPort}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRemoteHost() {
		return remoteHost;
	}

	/**
	 * Set the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard", i.e. any IP address (this will be {{empty}} in most cases).  CPE are REQUIRED only to support {{empty}}.

          When {{param}} is {{empty}}, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

          If a CPE supports non-empty values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|Protocol}}, but with differing values of {{param}}.

          When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param}}, explicit {{param|ExternalPort}}

          # Explicit {{param}}, zero {{param|ExternalPort}}

          # Empty {{param}}, explicit {{param|ExternalPort}}

          # Empty {{param}}, zero {{param|ExternalPort}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 * @param remoteHost the input value
	 */
	public void  setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	/**
	 * Set the this parameter is the IP address of the source of inbound packets.  {{empty}} indicates a "wildcard", i.e. any IP address (this will be {{empty}} in most cases).  CPE are REQUIRED only to support {{empty}}.

          When {{param}} is {{empty}}, all traffic sent to the {{param|ExternalPort}} on the WAN interface of the gateway is forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          When {{param}} is specified as one external IP address, the NAT will only forward inbound packets from this {{param}} to the {{param|InternalClient}}, all other packets will be dropped. 

          If a CPE supports non-empty values for {{param}}, it MAY additionally support the ability to have more than one port mapping with the same {{param|ExternalPort}} and {{param|Protocol}}, but with differing values of {{param}}.

          When wildcard values are used for {{param}} and/or {{param|ExternalPort}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param}}, explicit {{param|ExternalPort}}

          # Explicit {{param}}, zero {{param|ExternalPort}}

          # Empty {{param}}, explicit {{param|ExternalPort}}

          # Empty {{param}}, zero {{param|ExternalPort}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 * @param remoteHost the input value
	 * @return this instance
	 */
	public PortMapping withRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
		return this;
	}

	/**
	 * Get the external port (or the first port of a range of external ports) that the NAT gateway would listen on for traffic to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          A value of zero ({{null}}) represents a "wildcard", i.e. any port number.  If this value is {{null}}, traffic on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}, and the value(s) of  {{param|InternalPort}} on {{param|InternalClient}} are ignored.

          When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param|RemoteHost}}, explicit {{param}}

          # Explicit {{param|RemoteHost}}, zero {{param}}

          # Empty {{param|RemoteHost}}, explicit {{param}}

          # Empty {{param|RemoteHost}}, zero {{param}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getExternalPort() {
		return externalPort;
	}

	/**
	 * Set the external port (or the first port of a range of external ports) that the NAT gateway would listen on for traffic to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          A value of zero ({{null}}) represents a "wildcard", i.e. any port number.  If this value is {{null}}, traffic on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}, and the value(s) of  {{param|InternalPort}} on {{param|InternalClient}} are ignored.

          When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param|RemoteHost}}, explicit {{param}}

          # Explicit {{param|RemoteHost}}, zero {{param}}

          # Empty {{param|RemoteHost}}, explicit {{param}}

          # Empty {{param|RemoteHost}}, zero {{param}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 * @param externalPort the input value
	 */
	public void  setExternalPort(Long externalPort) {
		this.externalPort = externalPort;
	}

	/**
	 * Set the external port (or the first port of a range of external ports) that the NAT gateway would listen on for traffic to a corresponding {{param|InternalPort}}. Inbound packets to this external port on the WAN interface SHOULD be forwarded to the {{object|.IP.Interface}} associated with the {{param|InternalClient}} on the {{param|InternalPort}}.

          A value of zero ({{null}}) represents a "wildcard", i.e. any port number.  If this value is {{null}}, traffic on all external ports (that are not otherwise mapped) will be forwarded to {{param|InternalClient}}, and the value(s) of  {{param|InternalPort}} on {{param|InternalClient}} are ignored.

          When wildcard values are used for {{param|RemoteHost}} and/or {{param}}, the following precedence order applies (with the highest precedence listed first):

          # Explicit {{param|RemoteHost}}, explicit {{param}}

          # Explicit {{param|RemoteHost}}, zero {{param}}

          # Empty {{param|RemoteHost}}, explicit {{param}}

          # Empty {{param|RemoteHost}}, zero {{param}}

          If an incoming packet matches the criteria associated with more than one entry in this table, the CPE MUST apply the port mapping associated with the highest precedence entry.
	 *
	 * @since 2.0
	 * @param externalPort the input value
	 * @return this instance
	 */
	public PortMapping withExternalPort(Long externalPort) {
		this.externalPort = externalPort;
		return this;
	}

	/**
	 * Get the indicates the last port of the external port range that starts with {{param|ExternalPort}}.

          If an external port range is specified, then the behavior described for {{param|ExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|ExternalPort}}.

          If {{param|ExternalPort}} is zero (wildcard), the value of this parameter MUST be ignored.

          If specified, the value of this parameter MUST be greater than or equal to the value of {{param|ExternalPort}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getExternalPortEndRange() {
		return externalPortEndRange;
	}

	/**
	 * Set the indicates the last port of the external port range that starts with {{param|ExternalPort}}.

          If an external port range is specified, then the behavior described for {{param|ExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|ExternalPort}}.

          If {{param|ExternalPort}} is zero (wildcard), the value of this parameter MUST be ignored.

          If specified, the value of this parameter MUST be greater than or equal to the value of {{param|ExternalPort}}.
	 *
	 * @since 2.0
	 * @param externalPortEndRange the input value
	 */
	public void  setExternalPortEndRange(Long externalPortEndRange) {
		this.externalPortEndRange = externalPortEndRange;
	}

	/**
	 * Set the indicates the last port of the external port range that starts with {{param|ExternalPort}}.

          If an external port range is specified, then the behavior described for {{param|ExternalPort}} applies to all ports within the range.

          A value of zero (0) indicates that no external port range is specified, i.e. that the range consists only of {{param|ExternalPort}}.

          If {{param|ExternalPort}} is zero (wildcard), the value of this parameter MUST be ignored.

          If specified, the value of this parameter MUST be greater than or equal to the value of {{param|ExternalPort}}.
	 *
	 * @since 2.0
	 * @param externalPortEndRange the input value
	 * @return this instance
	 */
	public PortMapping withExternalPortEndRange(Long externalPortEndRange) {
		this.externalPortEndRange = externalPortEndRange;
		return this;
	}

	/**
	 * Get the port on {{param|InternalClient}} that the gateway SHOULD forward traffic to.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInternalPort() {
		return internalPort;
	}

	/**
	 * Set the port on {{param|InternalClient}} that the gateway SHOULD forward traffic to.
	 *
	 * @since 2.0
	 * @param internalPort the input value
	 */
	public void  setInternalPort(Long internalPort) {
		this.internalPort = internalPort;
	}

	/**
	 * Set the port on {{param|InternalClient}} that the gateway SHOULD forward traffic to.
	 *
	 * @since 2.0
	 * @param internalPort the input value
	 * @return this instance
	 */
	public PortMapping withInternalPort(Long internalPort) {
		this.internalPort = internalPort;
		return this;
	}

	/**
	 * Get the protocol of the port mapping.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the protocol of the port mapping.  {{enum}}
	 *
	 * @since 2.0
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the protocol of the port mapping.  {{enum}}
	 *
	 * @since 2.0
	 * @param protocol the input value
	 * @return this instance
	 */
	public PortMapping withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the IP address or DNS host name of an internal client (on the LAN).

          Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

          Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the {{object|.Hosts.Host.}} table.

          Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

          It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInternalClient() {
		return internalClient;
	}

	/**
	 * Set the IP address or DNS host name of an internal client (on the LAN).

          Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

          Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the {{object|.Hosts.Host.}} table.

          Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

          It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 2.0
	 * @param internalClient the input value
	 */
	public void  setInternalClient(String internalClient) {
		this.internalClient = internalClient;
	}

	/**
	 * Set the IP address or DNS host name of an internal client (on the LAN).

          Support for an IP address is mandatory.  If {{param}} is specified as an IP address and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with the original IP address.

          Support for DNS host names is OPTIONAL.  If {{param}} is specified as a DNS host name and the LAN device's IP address subsequently changes, the port mapping MUST remain associated with this LAN device.  In this case, it is the responsibility of the CPE to maintain the name-to-address mapping in the event of IP address changes.  This can be accomplished, for example, by assigning the DNS host name via use of DHCP option 12 (Host Name) or option 81 (FQDN).  Note that the ACS can learn the host name associated with a given LAN device via the {{object|.Hosts.Host.}} table.

          Read access to this parameter MUST always return the exact value that was last set by the ACS.  For example, if the internal client is set to a DNS host name, it MUST read back as a DNS host name and not as an IP address.

          It MUST be possible to set the {{param}} to the broadcast IP address 255.255.255.255 for UDP mappings. This is to enable multiple NAT clients to use the same well-known port simultaneously.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the user-readable description of this port mapping.
	 *
	 * @since 2.0
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the user-readable description of this port mapping.
	 *
	 * @since 2.0
	 * @param description the input value
	 * @return this instance
	 */
	public PortMapping withDescription(String description) {
		this.description = description;
		return this;
	}

	//</editor-fold>

}