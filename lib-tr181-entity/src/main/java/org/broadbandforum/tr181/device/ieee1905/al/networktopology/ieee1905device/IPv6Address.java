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
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This object represents represents all IPv6 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-34: IPv6 type TLV}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.IPv6Address.{i}.")
@XmlRootElement(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.IPv6Address")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.IPv6Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv6Address {

	/**
	 * MAC Address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * IPv6 Address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv6Address")
	public org.broadbandforum.tr181.datatypes.IPv6Address ipv6Address;
	/**
	 * The IPv6 Address Type of this {{param|IPv6Address}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv6AddressType")
	public String ipv6AddressType;
	/**
	 * "::" or the IPv6 address of the origin of this IPv6 address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPv6AddressOrigin")
	public org.broadbandforum.tr181.datatypes.IPv6Address ipv6AddressOrigin;

	public IPv6Address() {
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
	public IPv6Address withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the ipv6 Address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv6Address getIpv6Address() {
		return ipv6Address;
	}

	/**
	 * Set the ipv6 Address.
	 *
	 * @since 2.9
	 * @param ipv6Address the input value
	 */
	public void  setIpv6Address(org.broadbandforum.tr181.datatypes.IPv6Address ipv6Address) {
		this.ipv6Address = ipv6Address;
	}

	/**
	 * Set the ipv6 Address.
	 *
	 * @since 2.9
	 * @param ipv6Address the input value
	 * @return this instance
	 */
	public IPv6Address withIpv6Address(org.broadbandforum.tr181.datatypes.IPv6Address ipv6Address) {
		this.ipv6Address = ipv6Address;
		return this;
	}

	/**
	 * Get the IPv6 Address Type of this {{param|IPv6Address}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getIpv6AddressType() {
		return ipv6AddressType;
	}

	/**
	 * Set the IPv6 Address Type of this {{param|IPv6Address}}. {{enum}}
	 *
	 * @since 2.9
	 * @param ipv6AddressType the input value
	 */
	public void  setIpv6AddressType(String ipv6AddressType) {
		this.ipv6AddressType = ipv6AddressType;
	}

	/**
	 * Set the IPv6 Address Type of this {{param|IPv6Address}}. {{enum}}
	 *
	 * @since 2.9
	 * @param ipv6AddressType the input value
	 * @return this instance
	 */
	public IPv6Address withIpv6AddressType(String ipv6AddressType) {
		this.ipv6AddressType = ipv6AddressType;
		return this;
	}

	/**
	 * Get the "::" or the IPv6 address of the origin of this IPv6 address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv6Address getIpv6AddressOrigin() {
		return ipv6AddressOrigin;
	}

	/**
	 * Set the "::" or the IPv6 address of the origin of this IPv6 address.
	 *
	 * @since 2.9
	 * @param ipv6AddressOrigin the input value
	 */
	public void  setIpv6AddressOrigin(org.broadbandforum.tr181.datatypes.IPv6Address ipv6AddressOrigin) {
		this.ipv6AddressOrigin = ipv6AddressOrigin;
	}

	/**
	 * Set the "::" or the IPv6 address of the origin of this IPv6 address.
	 *
	 * @since 2.9
	 * @param ipv6AddressOrigin the input value
	 * @return this instance
	 */
	public IPv6Address withIpv6AddressOrigin(org.broadbandforum.tr181.datatypes.IPv6Address ipv6AddressOrigin) {
		this.ipv6AddressOrigin = ipv6AddressOrigin;
		return this;
	}

	//</editor-fold>

}