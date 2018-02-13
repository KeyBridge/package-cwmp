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
package org.broadbandforum.tr069.internetgatewaydevice.landevice;

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
import org.broadbandforum.tr069.datatypes.IPAddress;
import org.broadbandforum.tr069.datatypes.MACAddress;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.lanhostconfigmanagement.IPInterface;

	/**
	 * This object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.")
@XmlRootElement(name = "InternetGatewayDevice.LANDevice.LANHostConfigManagement")
@XmlType(name = "InternetGatewayDevice.LANDevice.LANHostConfigManagement")
@XmlAccessorType(XmlAccessType.FIELD)
public class LANHostConfigManagement {

	/**
	 * Enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE should restore its default DHCP server settings.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPServerConfigurable")
	@CWMPParameter(access = "readWrite")
	public Boolean dhcPServerConfigurable;
	/**
	 * Enables or disables the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPServerEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean dhcPServerEnable;
	/**
	 * Indicates if the DHCP server performs the role of a server (0) or a relay (1) on the LAN interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DHCPRelay")
	public Boolean dhcPRelay;
	/**
	 * Specifies first address in the pool to be assigned by the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress minAddress;
	/**
	 * Specifies last address in the pool to be assigned by the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress maxAddress;
	/**
	 * Comma separated list of addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReservedAddresses")
	@CWMPParameter(access = "readWrite")
	public IPAddress reservedAddresses;
	/**
	 * Specifies the client's network subnet mask.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress subnetMask;
	/**
	 * Comma separated list of DNS servers offered to DHCP clients.  Support for more than three DNS Servers is Optional.
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
	 * Comma separated list of IP addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is Optional.
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
	public Integer dhcPLeaseTime;
	/**
	 * {{enum}}

If {{enum|Normal}}, then DHCP addresses are to be allocated out of a private address pool.

If {{enum|UseAllocatedSubnet}}, instructs the CPE to allocate DHCP addresses from the WAN subnet block for the WAN connection identified in {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, then the specified LAN Host identified by the Passthrough MAC address is given the WAN IP address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UseAllocatedWAN")
	@CWMPParameter(access = "readWrite")
	public String useAllocatedWAN;
	/**
	 * Specifies the connection instance for the connection to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}.  The content is the full hierarchical parameter name of the default layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AssociatedConnection")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String associatedConnection;
	/**
	 * DHCP lease time in seconds given to the specified LAN Host when the WAN IP address is passed-through.

Note: A temporary private IP address with short lease (for example, 1 min) may be given to the passthrough LAN Host before the WAN IP address is acquired.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PassthroughLease")
	@CWMPParameter(access = "readWrite")
	public Long passthroughLease;
	/**
	 * Hardware address of the LAN Host that is used to passthrough the WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.
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
	 * IP interface table.
	 */
	@XmlElementWrapper(name = "IPInterfaces")
	@XmlElement(name = "IPInterface")
	@CWMPParameter(access = "readWrite")
	public Collection<IPInterface> ipinterfaces;

	public LANHostConfigManagement() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE should restore its default DHCP server settings.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDhcPServerConfigurable() {
		return dhcPServerConfigurable;
	}

	/**
	 * Set the enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE should restore its default DHCP server settings.
	 *
	 * @since 1.0
	 * @param dhcPServerConfigurable the input value
	 */
	public void  setDhcPServerConfigurable(Boolean dhcPServerConfigurable) {
		this.dhcPServerConfigurable = dhcPServerConfigurable;
	}

	/**
	 * Set the enables the configuration of the DHCP server on the LAN interface.  If this variable is set to {{false}}, the CPE should restore its default DHCP server settings.
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
	 * Get the indicates if the DHCP server performs the role of a server (0) or a relay (1) on the LAN interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDhcPRelay() {
		return dhcPRelay;
	}

	/**
	 * Set the indicates if the DHCP server performs the role of a server (0) or a relay (1) on the LAN interface.
	 *
	 * @since 1.0
	 * @param dhcPRelay the input value
	 */
	public void  setDhcPRelay(Boolean dhcPRelay) {
		this.dhcPRelay = dhcPRelay;
	}

	/**
	 * Set the indicates if the DHCP server performs the role of a server (0) or a relay (1) on the LAN interface.
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
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getMinAddress() {
		return minAddress;
	}

	/**
	 * Set the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 * @param minAddress the input value
	 */
	public void  setMinAddress(IPAddress minAddress) {
		this.minAddress = minAddress;
	}

	/**
	 * Set the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.
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
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getMaxAddress() {
		return maxAddress;
	}

	/**
	 * Set the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.
	 *
	 * @since 1.0
	 * @param maxAddress the input value
	 */
	public void  setMaxAddress(IPAddress maxAddress) {
		this.maxAddress = maxAddress;
	}

	/**
	 * Set the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.
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
	 * Get the comma separated list of addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getReservedAddresses() {
		return reservedAddresses;
	}

	/**
	 * Set the comma separated list of addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.0
	 * @param reservedAddresses the input value
	 */
	public void  setReservedAddresses(IPAddress reservedAddresses) {
		this.reservedAddresses = reservedAddresses;
	}

	/**
	 * Set the comma separated list of addresses marked reserved from the address allocation pool.
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
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.
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
	 * Get the comma separated list of DNS servers offered to DHCP clients.  Support for more than three DNS Servers is Optional.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the comma separated list of DNS servers offered to DHCP clients.  Support for more than three DNS Servers is Optional.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the comma separated list of DNS servers offered to DHCP clients.  Support for more than three DNS Servers is Optional.
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
	 * Get the comma separated list of IP addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is Optional.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getIprouters() {
		return iprouters;
	}

	/**
	 * Set the comma separated list of IP addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is Optional.
	 *
	 * @since 1.0
	 * @param iprouters the input value
	 */
	public void  setIprouters(IPAddress iprouters) {
		this.iprouters = iprouters;
	}

	/**
	 * Set the comma separated list of IP addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is Optional.
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
	 * Get the {{enum}}

If {{enum|Normal}}, then DHCP addresses are to be allocated out of a private address pool.

If {{enum|UseAllocatedSubnet}}, instructs the CPE to allocate DHCP addresses from the WAN subnet block for the WAN connection identified in {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, then the specified LAN Host identified by the Passthrough MAC address is given the WAN IP address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUseAllocatedWAN() {
		return useAllocatedWAN;
	}

	/**
	 * Set the {{enum}}

If {{enum|Normal}}, then DHCP addresses are to be allocated out of a private address pool.

If {{enum|UseAllocatedSubnet}}, instructs the CPE to allocate DHCP addresses from the WAN subnet block for the WAN connection identified in {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, then the specified LAN Host identified by the Passthrough MAC address is given the WAN IP address.
	 *
	 * @since 1.0
	 * @param useAllocatedWAN the input value
	 */
	public void  setUseAllocatedWAN(String useAllocatedWAN) {
		this.useAllocatedWAN = useAllocatedWAN;
	}

	/**
	 * Set the {{enum}}

If {{enum|Normal}}, then DHCP addresses are to be allocated out of a private address pool.

If {{enum|UseAllocatedSubnet}}, instructs the CPE to allocate DHCP addresses from the WAN subnet block for the WAN connection identified in {{param|AssociatedConnection}}.

If {{enum|Passthrough}}, then the specified LAN Host identified by the Passthrough MAC address is given the WAN IP address.
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
	 * Get the specifies the connection instance for the connection to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}.  The content is the full hierarchical parameter name of the default layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAssociatedConnection() {
		return associatedConnection;
	}

	/**
	 * Set the specifies the connection instance for the connection to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}.  The content is the full hierarchical parameter name of the default layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @param associatedConnection the input value
	 */
	public void  setAssociatedConnection(String associatedConnection) {
		this.associatedConnection = associatedConnection;
	}

	/**
	 * Set the specifies the connection instance for the connection to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|UseAllocatedSubnet|UseAllocatedWAN}} or {{enum|Passthrough|UseAllocatedWAN}}.  The content is the full hierarchical parameter name of the default layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
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
	 * Get the dhcP lease time in seconds given to the specified LAN Host when the WAN IP address is passed-through.

Note: A temporary private IP address with short lease (for example, 1 min) may be given to the passthrough LAN Host before the WAN IP address is acquired.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPassthroughLease() {
		return passthroughLease;
	}

	/**
	 * Set the dhcP lease time in seconds given to the specified LAN Host when the WAN IP address is passed-through.

Note: A temporary private IP address with short lease (for example, 1 min) may be given to the passthrough LAN Host before the WAN IP address is acquired.
	 *
	 * @since 1.0
	 * @param passthroughLease the input value
	 */
	public void  setPassthroughLease(Long passthroughLease) {
		this.passthroughLease = passthroughLease;
	}

	/**
	 * Set the dhcP lease time in seconds given to the specified LAN Host when the WAN IP address is passed-through.

Note: A temporary private IP address with short lease (for example, 1 min) may be given to the passthrough LAN Host before the WAN IP address is acquired.
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
	 * Get the hardware address of the LAN Host that is used to passthrough the WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getPassthroughMACAddress() {
		return passthroughMACAddress;
	}

	/**
	 * Set the hardware address of the LAN Host that is used to passthrough the WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.
	 *
	 * @since 1.0
	 * @param passthroughMACAddress the input value
	 */
	public void  setPassthroughMACAddress(MACAddress passthroughMACAddress) {
		this.passthroughMACAddress = passthroughMACAddress;
	}

	/**
	 * Set the hardware address of the LAN Host that is used to passthrough the WAN IP address if {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}.
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
	 * Get the ip interface table.
	 *
	 * @return the value
	 */
	public Collection<IPInterface> getIpinterfaces() {
		if (this.ipinterfaces == null){ this.ipinterfaces=new ArrayList<>();}
		return ipinterfaces;
	}

	/**
	 * Set the ip interface table.
	 *
	 * @param ipinterfaces the input value
	 */
	public void  setIpinterfaces(Collection<IPInterface> ipinterfaces) {
		this.ipinterfaces = ipinterfaces;
	}

	/**
	 * Set the ip interface table.
	 *
	 * @param ipinterface the input value
	 * @return this instance
	 */
	public LANHostConfigManagement withIPInterface(IPInterface ipinterface) {
		getIpinterfaces().add(ipinterface);
		return this;
	}

	//</editor-fold>

}