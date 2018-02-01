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
package org.broadbandforum.tr181.device.dhcpv4.server.pool;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv4Address;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * DHCP static address table.

        Entries in this table correspond to what {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

        Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

        Note that it is possible that an IP address in this table is present in one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Server.Pool.{i}.StaticAddress.{i}.")
public class StaticAddress {

	/**
	 * Enables or disables the StaticAddress table entry.

          Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Hardware address (MAC address) of the physical interface of the DHCP client.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Chaddr")
	@CWMPParameter(access = "readWrite")
	public MACAddress chaddr;
	/**
	 * IPv4 address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Yiaddr")
	@CWMPParameter(access = "readWrite")
	public IPv4Address yiaddr;

	public StaticAddress() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the StaticAddress table entry.

          Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the StaticAddress table entry.

          Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the StaticAddress table entry.

          Disabling an entry does not return the IP address to the pool.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public StaticAddress withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public StaticAddress withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the hardware address (MAC address) of the physical interface of the DHCP client.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getChaddr() {
		return chaddr;
	}

	/**
	 * Set the hardware address (MAC address) of the physical interface of the DHCP client.
	 *
	 * @since 2.0
	 * @param chaddr the input value
	 */
	public void  setChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
	}

	/**
	 * Set the hardware address (MAC address) of the physical interface of the DHCP client.
	 *
	 * @since 2.0
	 * @param chaddr the input value
	 * @return this instance
	 */
	public StaticAddress withChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
		return this;
	}

	/**
	 * Get the ipv4 address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getYiaddr() {
		return yiaddr;
	}

	/**
	 * Set the ipv4 address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).
	 *
	 * @since 2.0
	 * @param yiaddr the input value
	 */
	public void  setYiaddr(IPv4Address yiaddr) {
		this.yiaddr = yiaddr;
	}

	/**
	 * Set the ipv4 address to be assigned by the DHCP server to the DHCP client with the specified hardware address (MAC address).
	 *
	 * @since 2.0
	 * @param yiaddr the input value
	 * @return this instance
	 */
	public StaticAddress withYiaddr(IPv4Address yiaddr) {
		this.yiaddr = yiaddr;
		return this;
	}

	//</editor-fold>

}