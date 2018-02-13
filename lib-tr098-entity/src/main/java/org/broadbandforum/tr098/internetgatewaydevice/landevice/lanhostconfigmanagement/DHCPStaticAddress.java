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
package org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.datatypes.IPAddress;
import org.broadbandforum.tr098.datatypes.MACAddress;

	/**
	 * DHCP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in one or more of the conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.DHCPStaticAddress.{i}.")
@XmlRootElement(name = "DHCPStaticAddress")
@XmlType(name = "InternetGatewayDevice.LANDevice.LANHostConfigManagement.DHCPStaticAddress")
@XmlAccessorType(XmlAccessType.FIELD)
public class DHCPStaticAddress {

	/**
	 * Enables or disables the DHCPStaticAddress table entry.

Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 1.4
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
	 * Hardware address (MAC address) of the physical interface of the DHCP client.

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Chaddr")
	@CWMPParameter(access = "readWrite")
	public MACAddress chaddr;
	/**
	 * IP address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Yiaddr")
	@CWMPParameter(access = "readWrite")
	public IPAddress yiaddr;

	public DHCPStaticAddress() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DHCPStaticAddress table entry.

Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DHCPStaticAddress table entry.

Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DHCPStaticAddress table entry.

Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public DHCPStaticAddress withEnable(Boolean enable) {
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
	public DHCPStaticAddress withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the hardware address (MAC address) of the physical interface of the DHCP client.

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public MACAddress getChaddr() {
		return chaddr;
	}

	/**
	 * Set the hardware address (MAC address) of the physical interface of the DHCP client.

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 * @param chaddr the input value
	 */
	public void  setChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
	}

	/**
	 * Set the hardware address (MAC address) of the physical interface of the DHCP client.

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 * @param chaddr the input value
	 * @return this instance
	 */
	public DHCPStaticAddress withChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
		return this;
	}

	/**
	 * Get the ip address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getYiaddr() {
		return yiaddr;
	}

	/**
	 * Set the ip address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 * @param yiaddr the input value
	 */
	public void  setYiaddr(IPAddress yiaddr) {
		this.yiaddr = yiaddr;
	}

	/**
	 * Set the ip address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).

This parameter MUST have a valid value before the table entry can be enabled.
	 *
	 * @since 1.4
	 * @param yiaddr the input value
	 * @return this instance
	 */
	public DHCPStaticAddress withYiaddr(IPAddress yiaddr) {
		this.yiaddr = yiaddr;
		return this;
	}

	//</editor-fold>

}