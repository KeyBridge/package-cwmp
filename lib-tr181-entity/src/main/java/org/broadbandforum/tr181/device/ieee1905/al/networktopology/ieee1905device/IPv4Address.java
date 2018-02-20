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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.IPAddress;
import org.broadbandforum.common.MACAddress;

	/**
	 * This object represents represents all IPv4 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-32: IPv4 type TLV}}.
	 *
	 * @since TR181 v2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.IPv4Address.{i}.", uniqueConstraints = {@CWMPUnique(names = {"MACAddress", "IPv4Address"})})
@XmlRootElement(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.IPv4Address")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.IPv4Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv4Address {

	/**
	 * MAC Address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * IPv4 Address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv4Address")
	public org.broadbandforum.common.IPv4Address ipv4Address;
	/**
	 * The IPv4 Address Type of this {{param|IPv4Address}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv4AddressType")
	public String ipv4AddressType;
	/**
	 * Either IPv4 address of DHCPv4 server or IPv6 address of DHCPv6 server.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "DHCPServer")
	public IPAddress dhcPServer;

	public IPv4Address() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac Address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the mac Address.
	 *
	 * @since 2.9
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the mac Address.
	 *
	 * @since 2.9
	 * @param macAddress the input value
	 * @return this instance
	 */
	public IPv4Address withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the ipv4 Address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public org.broadbandforum.common.IPv4Address getIpv4Address() {
		return ipv4Address;
	}

	/**
	 * Set the ipv4 Address.
	 *
	 * @since 2.9
	 * @param ipv4Address the input value
	 */
	public void  setIpv4Address(org.broadbandforum.common.IPv4Address ipv4Address) {
		this.ipv4Address = ipv4Address;
	}

	/**
	 * Set the ipv4 Address.
	 *
	 * @since 2.9
	 * @param ipv4Address the input value
	 * @return this instance
	 */
	public IPv4Address withIpv4Address(org.broadbandforum.common.IPv4Address ipv4Address) {
		this.ipv4Address = ipv4Address;
		return this;
	}

	/**
	 * Get the IPv4 Address Type of this {{param|IPv4Address}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getIpv4AddressType() {
		return ipv4AddressType;
	}

	/**
	 * Set the IPv4 Address Type of this {{param|IPv4Address}}. {{enum}}
	 *
	 * @since 2.9
	 * @param ipv4AddressType the input value
	 */
	public void  setIpv4AddressType(String ipv4AddressType) {
		this.ipv4AddressType = ipv4AddressType;
	}

	/**
	 * Set the IPv4 Address Type of this {{param|IPv4Address}}. {{enum}}
	 *
	 * @since 2.9
	 * @param ipv4AddressType the input value
	 * @return this instance
	 */
	public IPv4Address withIpv4AddressType(String ipv4AddressType) {
		this.ipv4AddressType = ipv4AddressType;
		return this;
	}

	/**
	 * Get the either IPv4 address of DHCPv4 server or IPv6 address of DHCPv6 server.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public IPAddress getDhcPServer() {
		return dhcPServer;
	}

	/**
	 * Set the either IPv4 address of DHCPv4 server or IPv6 address of DHCPv6 server.
	 *
	 * @since 2.9
	 * @param dhcPServer the input value
	 */
	public void  setDhcPServer(IPAddress dhcPServer) {
		this.dhcPServer = dhcPServer;
	}

	/**
	 * Set the either IPv4 address of DHCPv4 server or IPv6 address of DHCPv6 server.
	 *
	 * @since 2.9
	 * @param dhcPServer the input value
	 * @return this instance
	 */
	public IPv4Address withDhcPServer(IPAddress dhcPServer) {
		this.dhcPServer = dhcPServer;
		return this;
	}

	//</editor-fold>

}