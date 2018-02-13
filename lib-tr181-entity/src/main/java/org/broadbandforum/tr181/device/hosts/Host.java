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
package org.broadbandforum.tr181.device.hosts;

import java.time.LocalDateTime;
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
import org.broadbandforum.tr181.datatypes.IPAddress;
import org.broadbandforum.tr181.device.hosts.host.IPv4Address;
import org.broadbandforum.tr181.device.hosts.host.IPv6Address;

	/**
	 * Host table.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Hosts.Host.{i}.")
@XmlRootElement(name = "Device.Hosts.Host")
@XmlType(name = "Device.Hosts.Host")
@XmlAccessorType(XmlAccessType.FIELD)
public class Host {

	/**
	 * A non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String alias;
	/**
	 * Unique physical identifier of the host. For many layer 2 technologies this is typically a MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhysAddress")
	@Size(max = 64)
	public String physAddress;
	/**
	 * Current IP Address of the host. {{empty}} if no address is available.

          If more than one IP address for this host is known, the CPE will choose a ''primary'' address.  All known IP addresses can be listed in the {{object|IPv4Address}} and {{object|IPv6Address}} tables.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPAddress")
	public IPAddress ipaddress;
	/**
	 * Indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.  {{enum}}

          This parameter is DEPRECATED because only {{enum|None}} and {{enum|DHCP}} made sense (the CPE doesn't know whether the address is {{enum|Static}} or {{enum|AutoIP}}).  The {{enum|DHCP}} case is now handled via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AddressSource")
	public String addressSource;
	/**
	 * {{reference}} Each list item is the DHCPv4 or DHCPv6 server's client entry that corresponds to the host.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DHCPClient")
	@Size
	@XmlList
	public Collection<String> dhcPClient;
	/**
	 * DHCP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.

          This parameter is DEPRECATED because DHCP lease/lifetime information can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseTimeRemaining")
	@Size(min = -1)
	public Integer leaseTimeRemaining;
	/**
	 * {{noreference}}The value MUST the path name of the ''AssociatedDevice'' (or equivalent) table row that models the host, or {{null}} if there is no such table.

          For example: ''Device.WiFi.AccessPoint.1.AssociatedDevice.2''
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AssociatedDevice")
	@Size(max = 256)
	public String associatedDevice;
	/**
	 * {{noreference}}The value MUST be the path name of a row in a layer 1 interface table.  If the layer 1 device isn’t known, then {{param}} will be {{null}}.

          For example: ''Device.Ethernet.Interface.2''
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Layer1Interface")
	@Size(max = 256)
	public String layer1Interface;
	/**
	 * {{reference}}  If the entry represents a non-IP device, then {{param}} will be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Layer3Interface")
	@Size(max = 256)
	public String layer3Interface;
	/**
	 * Vendor Class Identifier DHCP option (Option 60) of the host.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VendorClassID")
	@Size(max = 255)
	public String vendorClassID;
	/**
	 * A hexbinary string, Client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ClientID")
	public byte[] clientID;
	/**
	 * A hexbinary string, User Class Identifier DHCP option (Option 77) of the host.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserClassID")
	public byte[] userClassID;
	/**
	 * The device's host name or {{empty}} if unknown.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HostName")
	@Size(max = 64)
	public String hostName;
	/**
	 * Whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, {{param}} MUST be set to {{false}}  for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * The datetime when {{param|Active}} last changed from {{true}} to {{false}} or from {{false}} to {{true}}.  The initial detection of a host SHOULD be treated as a transition from {{false}} to {{true}}, showing the datetime when the host was first detected.

          The ability to list inactive hosts is OPTIONAL. The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ActiveLastChange")
	public LocalDateTime activeLastChange;
	/**
	 * The host's known IPv4 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 */
	@XmlElementWrapper(name = "IPv4Addresss")
	@XmlElement(name = "IPv4Address")
	public Collection<IPv4Address> ipv4Addresss;
	/**
	 * The host's known IPv6 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 */
	@XmlElementWrapper(name = "IPv6Addresss")
	@XmlElement(name = "IPv6Address")
	public Collection<IPv6Address> ipv6Addresss;

	public Host() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Host withAlias(String alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique physical identifier of the host. For many layer 2 technologies this is typically a MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPhysAddress() {
		return physAddress;
	}

	/**
	 * Set the unique physical identifier of the host. For many layer 2 technologies this is typically a MAC address.
	 *
	 * @since 2.0
	 * @param physAddress the input value
	 */
	public void  setPhysAddress(String physAddress) {
		this.physAddress = physAddress;
	}

	/**
	 * Set the unique physical identifier of the host. For many layer 2 technologies this is typically a MAC address.
	 *
	 * @since 2.0
	 * @param physAddress the input value
	 * @return this instance
	 */
	public Host withPhysAddress(String physAddress) {
		this.physAddress = physAddress;
		return this;
	}

	/**
	 * Get the current IP Address of the host. {{empty}} if no address is available.

          If more than one IP address for this host is known, the CPE will choose a ''primary'' address.  All known IP addresses can be listed in the {{object|IPv4Address}} and {{object|IPv6Address}} tables.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the current IP Address of the host. {{empty}} if no address is available.

          If more than one IP address for this host is known, the CPE will choose a ''primary'' address.  All known IP addresses can be listed in the {{object|IPv4Address}} and {{object|IPv6Address}} tables.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the current IP Address of the host. {{empty}} if no address is available.

          If more than one IP address for this host is known, the CPE will choose a ''primary'' address.  All known IP addresses can be listed in the {{object|IPv4Address}} and {{object|IPv6Address}} tables.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public Host withIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.  {{enum}}

          This parameter is DEPRECATED because only {{enum|None}} and {{enum|DHCP}} made sense (the CPE doesn't know whether the address is {{enum|Static}} or {{enum|AutoIP}}).  The {{enum|DHCP}} case is now handled via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAddressSource() {
		return addressSource;
	}

	/**
	 * Set the indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.  {{enum}}

          This parameter is DEPRECATED because only {{enum|None}} and {{enum|DHCP}} made sense (the CPE doesn't know whether the address is {{enum|Static}} or {{enum|AutoIP}}).  The {{enum|DHCP}} case is now handled via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param addressSource the input value
	 */
	public void  setAddressSource(String addressSource) {
		this.addressSource = addressSource;
	}

	/**
	 * Set the indicates whether the IP address of the host was allocated by the CPE using DHCP, was assigned to the host statically, or was assigned using automatic IP address allocation.  {{enum}}

          This parameter is DEPRECATED because only {{enum|None}} and {{enum|DHCP}} made sense (the CPE doesn't know whether the address is {{enum|Static}} or {{enum|AutoIP}}).  The {{enum|DHCP}} case is now handled via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param addressSource the input value
	 * @return this instance
	 */
	public Host withAddressSource(String addressSource) {
		this.addressSource = addressSource;
		return this;
	}

	/**
	 * Get the {{reference}} Each list item is the DHCPv4 or DHCPv6 server's client entry that corresponds to the host.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getDhcPClient() {
		if (this.dhcPClient == null){ this.dhcPClient=new ArrayList<>();}
		return dhcPClient;
	}

	/**
	 * Set the {{reference}} Each list item is the DHCPv4 or DHCPv6 server's client entry that corresponds to the host.
	 *
	 * @since 2.2
	 * @param dhcPClient the input value
	 */
	public void  setDhcPClient(Collection<String> dhcPClient) {
		this.dhcPClient = dhcPClient;
	}

	/**
	 * Set the {{reference}} Each list item is the DHCPv4 or DHCPv6 server's client entry that corresponds to the host.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public Host withDhcPClient(String string) {
		getDhcPClient().add(string);
		return this;
	}

	/**
	 * Get the dhcP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.

          This parameter is DEPRECATED because DHCP lease/lifetime information can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLeaseTimeRemaining() {
		return leaseTimeRemaining;
	}

	/**
	 * Set the dhcP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.

          This parameter is DEPRECATED because DHCP lease/lifetime information can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param leaseTimeRemaining the input value
	 */
	public void  setLeaseTimeRemaining(Integer leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
	}

	/**
	 * Set the dhcP lease time remaining in seconds.  A value of -1 indicates an infinite lease.  The value MUST be 0 (zero) if the {{param|AddressSource}} is not {{enum|DHCP|AddressSource}}.

          This parameter is DEPRECATED because DHCP lease/lifetime information can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param leaseTimeRemaining the input value
	 * @return this instance
	 */
	public Host withLeaseTimeRemaining(Integer leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
		return this;
	}

	/**
	 * Get the {{noreference}}The value MUST the path name of the ''AssociatedDevice'' (or equivalent) table row that models the host, or {{null}} if there is no such table.

          For example: ''Device.WiFi.AccessPoint.1.AssociatedDevice.2''
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getAssociatedDevice() {
		return associatedDevice;
	}

	/**
	 * Set the {{noreference}}The value MUST the path name of the ''AssociatedDevice'' (or equivalent) table row that models the host, or {{null}} if there is no such table.

          For example: ''Device.WiFi.AccessPoint.1.AssociatedDevice.2''
	 *
	 * @since 2.2
	 * @param associatedDevice the input value
	 */
	public void  setAssociatedDevice(String associatedDevice) {
		this.associatedDevice = associatedDevice;
	}

	/**
	 * Set the {{noreference}}The value MUST the path name of the ''AssociatedDevice'' (or equivalent) table row that models the host, or {{null}} if there is no such table.

          For example: ''Device.WiFi.AccessPoint.1.AssociatedDevice.2''
	 *
	 * @since 2.2
	 * @param associatedDevice the input value
	 * @return this instance
	 */
	public Host withAssociatedDevice(String associatedDevice) {
		this.associatedDevice = associatedDevice;
		return this;
	}

	/**
	 * Get the {{noreference}}The value MUST be the path name of a row in a layer 1 interface table.  If the layer 1 device isn’t known, then {{param}} will be {{null}}.

          For example: ''Device.Ethernet.Interface.2''
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLayer1Interface() {
		return layer1Interface;
	}

	/**
	 * Set the {{noreference}}The value MUST be the path name of a row in a layer 1 interface table.  If the layer 1 device isn’t known, then {{param}} will be {{null}}.

          For example: ''Device.Ethernet.Interface.2''
	 *
	 * @since 2.0
	 * @param layer1Interface the input value
	 */
	public void  setLayer1Interface(String layer1Interface) {
		this.layer1Interface = layer1Interface;
	}

	/**
	 * Set the {{noreference}}The value MUST be the path name of a row in a layer 1 interface table.  If the layer 1 device isn’t known, then {{param}} will be {{null}}.

          For example: ''Device.Ethernet.Interface.2''
	 *
	 * @since 2.0
	 * @param layer1Interface the input value
	 * @return this instance
	 */
	public Host withLayer1Interface(String layer1Interface) {
		this.layer1Interface = layer1Interface;
		return this;
	}

	/**
	 * Get the {{reference}}  If the entry represents a non-IP device, then {{param}} will be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLayer3Interface() {
		return layer3Interface;
	}

	/**
	 * Set the {{reference}}  If the entry represents a non-IP device, then {{param}} will be {{empty}}.
	 *
	 * @since 2.0
	 * @param layer3Interface the input value
	 */
	public void  setLayer3Interface(String layer3Interface) {
		this.layer3Interface = layer3Interface;
	}

	/**
	 * Set the {{reference}}  If the entry represents a non-IP device, then {{param}} will be {{empty}}.
	 *
	 * @since 2.0
	 * @param layer3Interface the input value
	 * @return this instance
	 */
	public Host withLayer3Interface(String layer3Interface) {
		this.layer3Interface = layer3Interface;
		return this;
	}

	/**
	 * Get the vendor Class Identifier DHCP option (Option 60) of the host.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVendorClassID() {
		return vendorClassID;
	}

	/**
	 * Set the vendor Class Identifier DHCP option (Option 60) of the host.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param vendorClassID the input value
	 */
	public void  setVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
	}

	/**
	 * Set the vendor Class Identifier DHCP option (Option 60) of the host.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param vendorClassID the input value
	 * @return this instance
	 */
	public Host withVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
		return this;
	}

	/**
	 * Get a hexbinary string, Client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getClientID() {
		return clientID;
	}

	/**
	 * Set a hexbinary string, Client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param clientID the input value
	 */
	public void  setClientID(byte[] clientID) {
		this.clientID = clientID;
	}

	/**
	 * Set a hexbinary string, Client Identifier DHCP option (Option 61) for the specific IP connection of the client.  The option value is binary, so an exact match is REQUIRED.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param clientID the input value
	 * @return this instance
	 */
	public Host withClientID(byte[] clientID) {
		this.clientID = clientID;
		return this;
	}

	/**
	 * Get a hexbinary string, User Class Identifier DHCP option (Option 77) of the host.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getUserClassID() {
		return userClassID;
	}

	/**
	 * Set a hexbinary string, User Class Identifier DHCP option (Option 77) of the host.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param userClassID the input value
	 */
	public void  setUserClassID(byte[] userClassID) {
		this.userClassID = userClassID;
	}

	/**
	 * Set a hexbinary string, User Class Identifier DHCP option (Option 77) of the host.

          It MAY be defined when {{param|AddressSource}} is {{enum|DHCP|AddressSource}}. {{empty}} indicates this option is not used.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          This parameter is DEPRECATED because host-supplied DHCP options can be accessed via the {{param|DHCPClient}} reference.
	 *
	 * @since 2.0
	 * @param userClassID the input value
	 * @return this instance
	 */
	public Host withUserClassID(byte[] userClassID) {
		this.userClassID = userClassID;
		return this;
	}

	/**
	 * Get the device's host name or {{empty}} if unknown.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Set the device's host name or {{empty}} if unknown.
	 *
	 * @since 2.0
	 * @param hostName the input value
	 */
	public void  setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Set the device's host name or {{empty}} if unknown.
	 *
	 * @since 2.0
	 * @param hostName the input value
	 * @return this instance
	 */
	public Host withHostName(String hostName) {
		this.hostName = hostName;
		return this;
	}

	/**
	 * Get the whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, {{param}} MUST be set to {{false}}  for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, {{param}} MUST be set to {{false}}  for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not the host is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive hosts is OPTIONAL.  If the CPE includes inactive hosts in this table, {{param}} MUST be set to {{false}}  for each inactive host.  The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 * @return this instance
	 */
	public Host withActive(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Get the datetime when {{param|Active}} last changed from {{true}} to {{false}} or from {{false}} to {{true}}.  The initial detection of a host SHOULD be treated as a transition from {{false}} to {{true}}, showing the datetime when the host was first detected.

          The ability to list inactive hosts is OPTIONAL. The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public LocalDateTime getActiveLastChange() {
		return activeLastChange;
	}

	/**
	 * Set the datetime when {{param|Active}} last changed from {{true}} to {{false}} or from {{false}} to {{true}}.  The initial detection of a host SHOULD be treated as a transition from {{false}} to {{true}}, showing the datetime when the host was first detected.

          The ability to list inactive hosts is OPTIONAL. The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.10
	 * @param activeLastChange the input value
	 */
	public void  setActiveLastChange(LocalDateTime activeLastChange) {
		this.activeLastChange = activeLastChange;
	}

	/**
	 * Set the datetime when {{param|Active}} last changed from {{true}} to {{false}} or from {{false}} to {{true}}.  The initial detection of a host SHOULD be treated as a transition from {{false}} to {{true}}, showing the datetime when the host was first detected.

          The ability to list inactive hosts is OPTIONAL. The length of time an inactive host remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.10
	 * @param activeLastChange the input value
	 * @return this instance
	 */
	public Host withActiveLastChange(LocalDateTime activeLastChange) {
		this.activeLastChange = activeLastChange;
		return this;
	}

	/**
	 * Get the host's known IPv4 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 *
	 * @return the value
	 */
	public Collection<IPv4Address> getIpv4Addresss() {
		if (this.ipv4Addresss == null){ this.ipv4Addresss=new ArrayList<>();}
		return ipv4Addresss;
	}

	/**
	 * Set the host's known IPv4 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 *
	 * @param ipv4Addresss the input value
	 */
	public void  setIpv4Addresss(Collection<IPv4Address> ipv4Addresss) {
		this.ipv4Addresss = ipv4Addresss;
	}

	/**
	 * Set the host's known IPv4 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 *
	 * @param ipv4Address the input value
	 * @return this instance
	 */
	public Host withIPv4Address(IPv4Address ipv4Address) {
		getIpv4Addresss().add(ipv4Address);
		return this;
	}

	/**
	 * Get the host's known IPv6 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 *
	 * @return the value
	 */
	public Collection<IPv6Address> getIpv6Addresss() {
		if (this.ipv6Addresss == null){ this.ipv6Addresss=new ArrayList<>();}
		return ipv6Addresss;
	}

	/**
	 * Set the host's known IPv6 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 *
	 * @param ipv6Addresss the input value
	 */
	public void  setIpv6Addresss(Collection<IPv6Address> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;
	}

	/**
	 * Set the host's known IPv6 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 *
	 * @param ipv6Address the input value
	 * @return this instance
	 */
	public Host withIPv6Address(IPv6Address ipv6Address) {
		getIpv6Addresss().add(ipv6Address);
		return this;
	}

	//</editor-fold>

}