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
package org.broadbandforum.tr098.internetgatewaydevice.landevice.hosts;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.IPAddress;
import org.broadbandforum.tr098.datatypes.MACAddress;

	/**
	 * Host table.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.Hosts.Host.{i}.")
@XmlRootElement(name = "Host")
@XmlType(name = "InternetGatewayDevice.LANDevice.Hosts.Host")
@XmlAccessorType(XmlAccessType.FIELD)
public class Host {

	/**
	 * Current IP Address of the host.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IPAddress")
	public IPAddress ipaddress;
	/**
	 * Indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AddressSource")
	public String addressSource;
	/**
	 * DHCP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LeaseTimeRemaining")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -1)
	public Integer leaseTimeRemaining;
	/**
	 * MAC address of the host.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * This parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object or a ''WLANConfiguration'' object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''.

In the case of an embedded Ethernet switch, the {{param}} parameter references the ''LANEthernetInterfaceConfig'' object that corresponds to the switch port the device is connected to (a ''LANEthernetInterfaceConfig'' instance for each switch port).

In the case of an embedded WLAN access point, the {{param}} parameter references the ''WLANConfiguration'' object that corresponds to the SSID the device is connected to (if the access point supports multiple SSIDs, then each SSID is a separate instance).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Layer2Interface")
	@Size(max = 256)
	public String layer2Interface;
	/**
	 * Vendor Class Identifier DHCP option (Option 60) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VendorClassID")
	@Size(max = 256)
	public String vendorClassID;
	/**
	 * Client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ClientID")
	@Size(max = 256)
	public String clientID;
	/**
	 * User Class Identifier DHCP option (Option 77) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UserClassID")
	@Size(max = 256)
	public String userClassID;
	/**
	 * The device's host name or {{empty}} if unknown.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HostName")
	@Size(max = 64)
	public String hostName;
	/**
	 * Type of physical interface through which this host is connected to the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InterfaceType")
	public String interfaceType;
	/**
	 * Whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to the CPE.

The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, this variable MUST be set to {{false}} for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;

	public Host() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the current IP Address of the host.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the current IP Address of the host.
	 *
	 * @since 1.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the current IP Address of the host.
	 *
	 * @since 1.0
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public Host withIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAddressSource() {
		return addressSource;
	}

	/**
	 * Set the indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.
	 *
	 * @since 1.0
	 * @param addressSource the input value
	 */
	public void  setAddressSource(String addressSource) {
		this.addressSource = addressSource;
	}

	/**
	 * Set the indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.
	 *
	 * @since 1.0
	 * @param addressSource the input value
	 * @return this instance
	 */
	public Host withAddressSource(String addressSource) {
		this.addressSource = addressSource;
		return this;
	}

	/**
	 * Get the dhcP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getLeaseTimeRemaining() {
		return leaseTimeRemaining;
	}

	/**
	 * Set the dhcP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.
	 *
	 * @since 1.0
	 * @param leaseTimeRemaining the input value
	 */
	public void  setLeaseTimeRemaining(Integer leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
	}

	/**
	 * Set the dhcP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.
	 *
	 * @since 1.0
	 * @param leaseTimeRemaining the input value
	 * @return this instance
	 */
	public Host withLeaseTimeRemaining(Integer leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
		return this;
	}

	/**
	 * Get the mac address of the host.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the mac address of the host.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the mac address of the host.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public Host withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the this parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object or a ''WLANConfiguration'' object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''.

In the case of an embedded Ethernet switch, the {{param}} parameter references the ''LANEthernetInterfaceConfig'' object that corresponds to the switch port the device is connected to (a ''LANEthernetInterfaceConfig'' instance for each switch port).

In the case of an embedded WLAN access point, the {{param}} parameter references the ''WLANConfiguration'' object that corresponds to the SSID the device is connected to (if the access point supports multiple SSIDs, then each SSID is a separate instance).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getLayer2Interface() {
		return layer2Interface;
	}

	/**
	 * Set the this parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object or a ''WLANConfiguration'' object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''.

In the case of an embedded Ethernet switch, the {{param}} parameter references the ''LANEthernetInterfaceConfig'' object that corresponds to the switch port the device is connected to (a ''LANEthernetInterfaceConfig'' instance for each switch port).

In the case of an embedded WLAN access point, the {{param}} parameter references the ''WLANConfiguration'' object that corresponds to the SSID the device is connected to (if the access point supports multiple SSIDs, then each SSID is a separate instance).
	 *
	 * @since 1.4
	 * @param layer2Interface the input value
	 */
	public void  setLayer2Interface(String layer2Interface) {
		this.layer2Interface = layer2Interface;
	}

	/**
	 * Set the this parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object or a ''WLANConfiguration'' object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''.

In the case of an embedded Ethernet switch, the {{param}} parameter references the ''LANEthernetInterfaceConfig'' object that corresponds to the switch port the device is connected to (a ''LANEthernetInterfaceConfig'' instance for each switch port).

In the case of an embedded WLAN access point, the {{param}} parameter references the ''WLANConfiguration'' object that corresponds to the SSID the device is connected to (if the access point supports multiple SSIDs, then each SSID is a separate instance).
	 *
	 * @since 1.4
	 * @param layer2Interface the input value
	 * @return this instance
	 */
	public Host withLayer2Interface(String layer2Interface) {
		this.layer2Interface = layer2Interface;
		return this;
	}

	/**
	 * Get the vendor Class Identifier DHCP option (Option 60) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getVendorClassID() {
		return vendorClassID;
	}

	/**
	 * Set the vendor Class Identifier DHCP option (Option 60) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @param vendorClassID the input value
	 */
	public void  setVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
	}

	/**
	 * Set the vendor Class Identifier DHCP option (Option 60) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @param vendorClassID the input value
	 * @return this instance
	 */
	public Host withVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
		return this;
	}

	/**
	 * Get the client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * Set the client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @param clientID the input value
	 */
	public void  setClientID(String clientID) {
		this.clientID = clientID;
	}

	/**
	 * Set the client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @param clientID the input value
	 * @return this instance
	 */
	public Host withClientID(String clientID) {
		this.clientID = clientID;
		return this;
	}

	/**
	 * Get the user Class Identifier DHCP option (Option 77) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getUserClassID() {
		return userClassID;
	}

	/**
	 * Set the user Class Identifier DHCP option (Option 77) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @param userClassID the input value
	 */
	public void  setUserClassID(String userClassID) {
		this.userClassID = userClassID;
	}

	/**
	 * Set the user Class Identifier DHCP option (Option 77) of the host.

It MAY be defined when ''AddressSource'' is ''DHCP''. {{empty}} indicates this option is not used.
	 *
	 * @since 1.4
	 * @param userClassID the input value
	 * @return this instance
	 */
	public Host withUserClassID(String userClassID) {
		this.userClassID = userClassID;
		return this;
	}

	/**
	 * Get the device's host name or {{empty}} if unknown.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Set the device's host name or {{empty}} if unknown.
	 *
	 * @since 1.0
	 * @param hostName the input value
	 */
	public void  setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Set the device's host name or {{empty}} if unknown.
	 *
	 * @since 1.0
	 * @param hostName the input value
	 * @return this instance
	 */
	public Host withHostName(String hostName) {
		this.hostName = hostName;
		return this;
	}

	/**
	 * Get the type of physical interface through which this host is connected to the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getInterfaceType() {
		return interfaceType;
	}

	/**
	 * Set the type of physical interface through which this host is connected to the CPE.
	 *
	 * @since 1.0
	 * @param interfaceType the input value
	 */
	public void  setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * Set the type of physical interface through which this host is connected to the CPE.
	 *
	 * @since 1.0
	 * @param interfaceType the input value
	 * @return this instance
	 */
	public Host withInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
		return this;
	}

	/**
	 * Get the whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to the CPE.

The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, this variable MUST be set to {{false}} for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to the CPE.

The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, this variable MUST be set to {{false}} for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to the CPE.

The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, this variable MUST be set to {{false}} for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 1.0
	 * @param active the input value
	 * @return this instance
	 */
	public Host withActive(Boolean active) {
		this.active = active;
		return this;
	}

	//</editor-fold>

}