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
package org.broadbandforum.tr098.internetgatewaydevice.landevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.IPAddress;
import org.broadbandforum.tr098.datatypes.MACAddress;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement.DHCPConditionalServingPool;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement.DHCPOption;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement.DHCPStaticAddress;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement.IPInterface;

	/**
	 * This object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.

The DHCP parameters in this object define the behavior of the default DHCP server, i.e. the behavior for DHCP requests that do not match any of the DHCP conditional serving pool entries.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.")
public class LANHostConfigManagement {

	/**
	 * The MAC address associated with the IP interface modeled by this LANDevice instance.  This is the MAC address that is returned in response to an ARP request for any of the IP interface's IP addresses.  It is also the source MAC address in all IP traffic sent over the IP interface.

If no single MAC address meets the above criteria, the value of this parameter MUST be the all-zero MAC address ''00:00:00:00:00:00''.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * Enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE SHOULD restore its default DHCP server settings.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPServerConfigurable")
	@CWMPParameter(access = "readWrite")
	public Boolean dhcPServerConfigurable = true;
	/**
	 * Enables or disables the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPServerEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean dhcPServerEnable = false;
	/**
	 * Indicates if the DHCP server performs the role of a server ({{false}}) or a relay ({{true}}) on the LAN interface.

This parameter is DEPRECATED because the functionality that it describes is not well-defined.  The CPE MAY set it to the value that it thinks most appropriate, based on its configuration.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPRelay")
	public Boolean dhcPRelay;
	/**
	 * Specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress minAddress;
	/**
	 * Specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress maxAddress;
	/**
	 * Addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReservedAddresses")
	@CWMPParameter(access = "readWrite")
	public IPAddress reservedAddresses;
	/**
	 * Specifies the client's network subnet mask.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress subnetMask;
	/**
	 * DNS servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DNSServers")
	@CWMPParameter(access = "readWrite")
	public IPAddress dnsServers;
	/**
	 * Sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DomainName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String domainName;
	/**
	 * IP addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IPRouters")
	@CWMPParameter(access = "readWrite")
	public IPAddress iprouters;
	/**
	 * Specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPLeaseTime")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer dhcPLeaseTime = 86400;
	/**
	 * Controls use of addresses from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the address pool is directly configured by the ACS.

If {{enum|UseAllocatedSubnet}}, behavior is the same as for {{enum|Passthrough}} with an empty {{param|PassthroughMACAddress}}.  For this reason, {{enum|UseAllocatedSubnet}} is DEPRECATED.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is {{empty}}, the configured values of the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are ignored.  The corresponding address pool values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is not {{empty}}, the LAN Host identified by {{param|PassthroughMACAddress}} is given a WAN IP address from the WAN connection specified by {{param|AssociatedConnection}}.  Other LAN Hosts are treated as for {{enum|Normal}}.

Use of {{param|PassthroughMACAddress}} does not cover the case where more than one LAN Host is to be given a WAN IP address.  This can be achieved by using a DHCP conditional serving pool.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UseAllocatedWAN")
	@CWMPParameter(access = "readWrite")
	public String useAllocatedWAN = "Normal";
	/**
	 * {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}}}  The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AssociatedConnection")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String associatedConnection;
	/**
	 * DHCP lease time in seconds given to the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.

Note: A temporary private IP address with short lease (for example, 1 min) might be given to the passthrough LAN Host before the WAN IP address is acquired.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PassthroughLease")
	@CWMPParameter(access = "readWrite")
	public Long passthroughLease = 600L;
	/**
	 * Hardware address of the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.  

Note: {{empty}} indicates that no specific LAN Host is designated, and results in the same behavior as the (DEPRECATED) {{enum|UseAllocatedSubnet|UseAllocatedWAN}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PassthroughMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress passthroughMACAddress;
	/**
	 * Hardware addresses that are allowed to connect to this connection if ''MACAddressControlEnabled'' is 1 for a given interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AllowedMACAddresses")
	@CWMPParameter(access = "readWrite")
	public MACAddress allowedMACAddresses;
	/**
	 * IP address table with each object representing an IP address on the LANDevice IP interface.

Support for more than one interface instance is OPTIONAL.
	 */
	@XmlElementWrapper(name = "ipinterfaces")
	@XmlElement(name = "IPInterface")
	@CWMPParameter(access = "readWrite")
	public Collection<IPInterface> ipinterfaces;
	/**
	 * DHCP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in one or more of the conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 */
	@XmlElementWrapper(name = "dhcPStaticAddresss")
	@XmlElement(name = "DHCPStaticAddress")
	@CWMPParameter(access = "readWrite")
	public Collection<DHCPStaticAddress> dhcPStaticAddresss;
	/**
	 * This object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests do not match any of the DHCP conditional serving pool entries.
	 */
	@XmlElementWrapper(name = "dhcPOptions")
	@XmlElement(name = "DHCPOption")
	@CWMPParameter(access = "readWrite")
	public Collection<DHCPOption> dhcPOptions;
	/**
	 * DHCP conditional serving pool table.

Each instance of this object defines a DHCP conditional serving pool.  Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address.

If a DHCP request does not match any of the DHCP conditional serving pool entries, the handling of the request is determined by the default DHCP server behavior that is defined by the LANHostConfigManagement object.

Overlapping pool ranges MUST be supported.
	 */
	@XmlElementWrapper(name = "dhcPConditionalServingPools")
	@XmlElement(name = "DHCPConditionalServingPool")
	@CWMPParameter(access = "readWrite")
	public Collection<DHCPConditionalServingPool> dhcPConditionalServingPools;

	public LANHostConfigManagement() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the MAC address associated with the IP interface modeled by this LANDevice instance.  This is the MAC address that is returned in response to an ARP request for any of the IP interface's IP addresses.  It is also the source MAC address in all IP traffic sent over the IP interface.

If no single MAC address meets the above criteria, the value of this parameter MUST be the all-zero MAC address ''00:00:00:00:00:00''.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the MAC address associated with the IP interface modeled by this LANDevice instance.  This is the MAC address that is returned in response to an ARP request for any of the IP interface's IP addresses.  It is also the source MAC address in all IP traffic sent over the IP interface.

If no single MAC address meets the above criteria, the value of this parameter MUST be the all-zero MAC address ''00:00:00:00:00:00''.
	 *
	 * @since 1.4
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the MAC address associated with the IP interface modeled by this LANDevice instance.  This is the MAC address that is returned in response to an ARP request for any of the IP interface's IP addresses.  It is also the source MAC address in all IP traffic sent over the IP interface.

If no single MAC address meets the above criteria, the value of this parameter MUST be the all-zero MAC address ''00:00:00:00:00:00''.
	 *
	 * @since 1.4
	 * @param macAddress the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE SHOULD restore its default DHCP server settings.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDhcPServerConfigurable() {
		return dhcPServerConfigurable;
	}

	/**
	 * Set the enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE SHOULD restore its default DHCP server settings.
	 *
	 * @since 1.0
	 * @param dhcPServerConfigurable the input value
	 */
	public void  setDhcPServerConfigurable(Boolean dhcPServerConfigurable) {
		this.dhcPServerConfigurable = dhcPServerConfigurable;
	}

	/**
	 * Set the enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE SHOULD restore its default DHCP server settings.
	 *
	 * @since 1.0
	 * @param dhcPServerConfigurable the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDhcPServerConfigurable(Boolean dhcPServerConfigurable) {
		this.dhcPServerConfigurable = dhcPServerConfigurable;
		return this;
	}

	/**
	 * Get the enables or disables the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDhcPServerEnable() {
		return dhcPServerEnable;
	}

	/**
	 * Set the enables or disables the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 * @param dhcPServerEnable the input value
	 */
	public void  setDhcPServerEnable(Boolean dhcPServerEnable) {
		this.dhcPServerEnable = dhcPServerEnable;
	}

	/**
	 * Set the enables or disables the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 * @param dhcPServerEnable the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDhcPServerEnable(Boolean dhcPServerEnable) {
		this.dhcPServerEnable = dhcPServerEnable;
		return this;
	}

	/**
	 * Get the indicates if the DHCP server performs the role of a server ({{false}}) or a relay ({{true}}) on the LAN interface.

This parameter is DEPRECATED because the functionality that it describes is not well-defined.  The CPE MAY set it to the value that it thinks most appropriate, based on its configuration.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDhcPRelay() {
		return dhcPRelay;
	}

	/**
	 * Set the indicates if the DHCP server performs the role of a server ({{false}}) or a relay ({{true}}) on the LAN interface.

This parameter is DEPRECATED because the functionality that it describes is not well-defined.  The CPE MAY set it to the value that it thinks most appropriate, based on its configuration.
	 *
	 * @since 1.0
	 * @param dhcPRelay the input value
	 */
	public void  setDhcPRelay(Boolean dhcPRelay) {
		this.dhcPRelay = dhcPRelay;
	}

	/**
	 * Set the indicates if the DHCP server performs the role of a server ({{false}}) or a relay ({{true}}) on the LAN interface.

This parameter is DEPRECATED because the functionality that it describes is not well-defined.  The CPE MAY set it to the value that it thinks most appropriate, based on its configuration.
	 *
	 * @since 1.0
	 * @param dhcPRelay the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDhcPRelay(Boolean dhcPRelay) {
		this.dhcPRelay = dhcPRelay;
		return this;
	}

	/**
	 * Get the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getMinAddress() {
		return minAddress;
	}

	/**
	 * Set the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param minAddress the input value
	 */
	public void  setMinAddress(IPAddress minAddress) {
		this.minAddress = minAddress;
	}

	/**
	 * Set the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param minAddress the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withMinAddress(IPAddress minAddress) {
		this.minAddress = minAddress;
		return this;
	}

	/**
	 * Get the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getMaxAddress() {
		return maxAddress;
	}

	/**
	 * Set the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param maxAddress the input value
	 */
	public void  setMaxAddress(IPAddress maxAddress) {
		this.maxAddress = maxAddress;
	}

	/**
	 * Set the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param maxAddress the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withMaxAddress(IPAddress maxAddress) {
		this.maxAddress = maxAddress;
		return this;
	}

	/**
	 * Get addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getReservedAddresses() {
		return reservedAddresses;
	}

	/**
	 * Set addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.0
	 * @param reservedAddresses the input value
	 */
	public void  setReservedAddresses(IPAddress reservedAddresses) {
		this.reservedAddresses = reservedAddresses;
	}

	/**
	 * Set addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.0
	 * @param reservedAddresses the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withReservedAddresses(IPAddress reservedAddresses) {
		this.reservedAddresses = reservedAddresses;
		return this;
	}

	/**
	 * Get the specifies the client's network subnet mask.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.

This parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the dns servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the dns servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the dns servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Set the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.0
	 * @param domainName the input value
	 */
	public void  setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Set the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.0
	 * @param domainName the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDomainName(String domainName) {
		this.domainName = domainName;
		return this;
	}

	/**
	 * Get the ip addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getIprouters() {
		return iprouters;
	}

	/**
	 * Set the ip addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.0
	 * @param iprouters the input value
	 */
	public void  setIprouters(IPAddress iprouters) {
		this.iprouters = iprouters;
	}

	/**
	 * Set the ip addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.0
	 * @param iprouters the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withIprouters(IPAddress iprouters) {
		this.iprouters = iprouters;
		return this;
	}

	/**
	 * Get the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDhcPLeaseTime() {
		return dhcPLeaseTime;
	}

	/**
	 * Set the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.0
	 * @param dhcPLeaseTime the input value
	 */
	public void  setDhcPLeaseTime(Integer dhcPLeaseTime) {
		this.dhcPLeaseTime = dhcPLeaseTime;
	}

	/**
	 * Set the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.0
	 * @param dhcPLeaseTime the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDhcPLeaseTime(Integer dhcPLeaseTime) {
		this.dhcPLeaseTime = dhcPLeaseTime;
		return this;
	}

	/**
	 * Get the controls use of addresses from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the address pool is directly configured by the ACS.

If {{enum|UseAllocatedSubnet}}, behavior is the same as for {{enum|Passthrough}} with an empty {{param|PassthroughMACAddress}}.  For this reason, {{enum|UseAllocatedSubnet}} is DEPRECATED.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is {{empty}}, the configured values of the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are ignored.  The corresponding address pool values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is not {{empty}}, the LAN Host identified by {{param|PassthroughMACAddress}} is given a WAN IP address from the WAN connection specified by {{param|AssociatedConnection}}.  Other LAN Hosts are treated as for {{enum|Normal}}.

Use of {{param|PassthroughMACAddress}} does not cover the case where more than one LAN Host is to be given a WAN IP address.  This can be achieved by using a DHCP conditional serving pool.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUseAllocatedWAN() {
		return useAllocatedWAN;
	}

	/**
	 * Set the controls use of addresses from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the address pool is directly configured by the ACS.

If {{enum|UseAllocatedSubnet}}, behavior is the same as for {{enum|Passthrough}} with an empty {{param|PassthroughMACAddress}}.  For this reason, {{enum|UseAllocatedSubnet}} is DEPRECATED.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is {{empty}}, the configured values of the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are ignored.  The corresponding address pool values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is not {{empty}}, the LAN Host identified by {{param|PassthroughMACAddress}} is given a WAN IP address from the WAN connection specified by {{param|AssociatedConnection}}.  Other LAN Hosts are treated as for {{enum|Normal}}.

Use of {{param|PassthroughMACAddress}} does not cover the case where more than one LAN Host is to be given a WAN IP address.  This can be achieved by using a DHCP conditional serving pool.
	 *
	 * @since 1.0
	 * @param useAllocatedWAN the input value
	 */
	public void  setUseAllocatedWAN(String useAllocatedWAN) {
		this.useAllocatedWAN = useAllocatedWAN;
	}

	/**
	 * Set the controls use of addresses from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the address pool is directly configured by the ACS.

If {{enum|UseAllocatedSubnet}}, behavior is the same as for {{enum|Passthrough}} with an empty {{param|PassthroughMACAddress}}.  For this reason, {{enum|UseAllocatedSubnet}} is DEPRECATED.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is {{empty}}, the configured values of the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are ignored.  The corresponding address pool values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, and {{param|PassthroughMACAddress}} is not {{empty}}, the LAN Host identified by {{param|PassthroughMACAddress}} is given a WAN IP address from the WAN connection specified by {{param|AssociatedConnection}}.  Other LAN Hosts are treated as for {{enum|Normal}}.

Use of {{param|PassthroughMACAddress}} does not cover the case where more than one LAN Host is to be given a WAN IP address.  This can be achieved by using a DHCP conditional serving pool.
	 *
	 * @since 1.0
	 * @param useAllocatedWAN the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withUseAllocatedWAN(String useAllocatedWAN) {
		this.useAllocatedWAN = useAllocatedWAN;
		return this;
	}

	/**
	 * Get the {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}}}  The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAssociatedConnection() {
		return associatedConnection;
	}

	/**
	 * Set the {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}}}  The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param associatedConnection the input value
	 */
	public void  setAssociatedConnection(String associatedConnection) {
		this.associatedConnection = associatedConnection;
	}

	/**
	 * Set the {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}}}  The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before the DHCP server can be enabled.
	 *
	 * @since 1.0
	 * @param associatedConnection the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withAssociatedConnection(String associatedConnection) {
		this.associatedConnection = associatedConnection;
		return this;
	}

	/**
	 * Get the dhcP lease time in seconds given to the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.

Note: A temporary private IP address with short lease (for example, 1 min) might be given to the passthrough LAN Host before the WAN IP address is acquired.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPassthroughLease() {
		return passthroughLease;
	}

	/**
	 * Set the dhcP lease time in seconds given to the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.

Note: A temporary private IP address with short lease (for example, 1 min) might be given to the passthrough LAN Host before the WAN IP address is acquired.
	 *
	 * @since 1.0
	 * @param passthroughLease the input value
	 */
	public void  setPassthroughLease(Long passthroughLease) {
		this.passthroughLease = passthroughLease;
	}

	/**
	 * Set the dhcP lease time in seconds given to the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.

Note: A temporary private IP address with short lease (for example, 1 min) might be given to the passthrough LAN Host before the WAN IP address is acquired.
	 *
	 * @since 1.0
	 * @param passthroughLease the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withPassthroughLease(Long passthroughLease) {
		this.passthroughLease = passthroughLease;
		return this;
	}

	/**
	 * Get the hardware address of the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.  

Note: {{empty}} indicates that no specific LAN Host is designated, and results in the same behavior as the (DEPRECATED) {{enum|UseAllocatedSubnet|UseAllocatedWAN}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getPassthroughMACAddress() {
		return passthroughMACAddress;
	}

	/**
	 * Set the hardware address of the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.  

Note: {{empty}} indicates that no specific LAN Host is designated, and results in the same behavior as the (DEPRECATED) {{enum|UseAllocatedSubnet|UseAllocatedWAN}}.
	 *
	 * @since 1.0
	 * @param passthroughMACAddress the input value
	 */
	public void  setPassthroughMACAddress(MACAddress passthroughMACAddress) {
		this.passthroughMACAddress = passthroughMACAddress;
	}

	/**
	 * Set the hardware address of the LAN Host that is used to passthrough a WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.  

Note: {{empty}} indicates that no specific LAN Host is designated, and results in the same behavior as the (DEPRECATED) {{enum|UseAllocatedSubnet|UseAllocatedWAN}}.
	 *
	 * @since 1.0
	 * @param passthroughMACAddress the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withPassthroughMACAddress(MACAddress passthroughMACAddress) {
		this.passthroughMACAddress = passthroughMACAddress;
		return this;
	}

	/**
	 * Get the hardware addresses that are allowed to connect to this connection if ''MACAddressControlEnabled'' is 1 for a given interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getAllowedMACAddresses() {
		return allowedMACAddresses;
	}

	/**
	 * Set the hardware addresses that are allowed to connect to this connection if ''MACAddressControlEnabled'' is 1 for a given interface.
	 *
	 * @since 1.0
	 * @param allowedMACAddresses the input value
	 */
	public void  setAllowedMACAddresses(MACAddress allowedMACAddresses) {
		this.allowedMACAddresses = allowedMACAddresses;
	}

	/**
	 * Set the hardware addresses that are allowed to connect to this connection if ''MACAddressControlEnabled'' is 1 for a given interface.
	 *
	 * @since 1.0
	 * @param allowedMACAddresses the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withAllowedMACAddresses(MACAddress allowedMACAddresses) {
		this.allowedMACAddresses = allowedMACAddresses;
		return this;
	}

	/**
	 * Get the ip address table with each object representing an IP address on the LANDevice IP interface.

Support for more than one interface instance is OPTIONAL.
	 *
	 * @return the value
	 */
	public Collection<IPInterface> getIpinterfaces() {
		if (this.ipinterfaces == null){ this.ipinterfaces=new ArrayList<>();}
		return ipinterfaces;
	}

	/**
	 * Set the ip address table with each object representing an IP address on the LANDevice IP interface.

Support for more than one interface instance is OPTIONAL.
	 *
	 * @param ipinterfaces the input value
	 */
	public void  setIpinterfaces(Collection<IPInterface> ipinterfaces) {
		this.ipinterfaces = ipinterfaces;
	}

	/**
	 * Set the ip address table with each object representing an IP address on the LANDevice IP interface.

Support for more than one interface instance is OPTIONAL.
	 *
	 * @param ipinterface the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withIPInterface(IPInterface ipinterface) {
		getIpinterfaces().add(ipinterface);
		return this;
	}

	/**
	 * Get the dhcP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in one or more of the conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @return the value
	 */
	public Collection<DHCPStaticAddress> getDhcPStaticAddresss() {
		if (this.dhcPStaticAddresss == null){ this.dhcPStaticAddresss=new ArrayList<>();}
		return dhcPStaticAddresss;
	}

	/**
	 * Set the dhcP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in one or more of the conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @param dhcPStaticAddresss the input value
	 */
	public void  setDhcPStaticAddresss(Collection<DHCPStaticAddress> dhcPStaticAddresss) {
		this.dhcPStaticAddresss = dhcPStaticAddresss;
	}

	/**
	 * Set the dhcP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in one or more of the conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @param dhcPStaticAddress the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDHCPStaticAddress(DHCPStaticAddress dhcPStaticAddress) {
		getDhcPStaticAddresss().add(dhcPStaticAddress);
		return this;
	}

	/**
	 * Get the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests do not match any of the DHCP conditional serving pool entries.
	 *
	 * @return the value
	 */
	public Collection<DHCPOption> getDhcPOptions() {
		if (this.dhcPOptions == null){ this.dhcPOptions=new ArrayList<>();}
		return dhcPOptions;
	}

	/**
	 * Set the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests do not match any of the DHCP conditional serving pool entries.
	 *
	 * @param dhcPOptions the input value
	 */
	public void  setDhcPOptions(Collection<DHCPOption> dhcPOptions) {
		this.dhcPOptions = dhcPOptions;
	}

	/**
	 * Set the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests do not match any of the DHCP conditional serving pool entries.
	 *
	 * @param dhcPOption the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDHCPOption(DHCPOption dhcPOption) {
		getDhcPOptions().add(dhcPOption);
		return this;
	}

	/**
	 * Get the dhcP conditional serving pool table.

Each instance of this object defines a DHCP conditional serving pool.  Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address.

If a DHCP request does not match any of the DHCP conditional serving pool entries, the handling of the request is determined by the default DHCP server behavior that is defined by the LANHostConfigManagement object.

Overlapping pool ranges MUST be supported.
	 *
	 * @return the value
	 */
	public Collection<DHCPConditionalServingPool> getDhcPConditionalServingPools() {
		if (this.dhcPConditionalServingPools == null){ this.dhcPConditionalServingPools=new ArrayList<>();}
		return dhcPConditionalServingPools;
	}

	/**
	 * Set the dhcP conditional serving pool table.

Each instance of this object defines a DHCP conditional serving pool.  Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address.

If a DHCP request does not match any of the DHCP conditional serving pool entries, the handling of the request is determined by the default DHCP server behavior that is defined by the LANHostConfigManagement object.

Overlapping pool ranges MUST be supported.
	 *
	 * @param dhcPConditionalServingPools the input value
	 */
	public void  setDhcPConditionalServingPools(Collection<DHCPConditionalServingPool> dhcPConditionalServingPools) {
		this.dhcPConditionalServingPools = dhcPConditionalServingPools;
	}

	/**
	 * Set the dhcP conditional serving pool table.

Each instance of this object defines a DHCP conditional serving pool.  Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address.

If a DHCP request does not match any of the DHCP conditional serving pool entries, the handling of the request is determined by the default DHCP server behavior that is defined by the LANHostConfigManagement object.

Overlapping pool ranges MUST be supported.
	 *
	 * @param dhcPConditionalServingPool the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withDHCPConditionalServingPool(DHCPConditionalServingPool dhcPConditionalServingPool) {
		getDhcPConditionalServingPools().add(dhcPConditionalServingPool);
		return this;
	}

	//</editor-fold>

}