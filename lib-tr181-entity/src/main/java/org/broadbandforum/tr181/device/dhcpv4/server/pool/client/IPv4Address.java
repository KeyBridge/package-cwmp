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
package org.broadbandforum.tr181.device.dhcpv4.server.pool.client;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * IPv4 addresses assigned to this client.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv4.Server.Pool.{i}.Client.{i}.IPv4Address.{i}.")
@XmlRootElement(name = "Device.DHCPv4.Server.Pool.Client.IPv4Address")
@XmlType(name = "Device.DHCPv4.Server.Pool.Client.IPv4Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv4Address {

	/**
	 * IPv4 address.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPAddress")
	public org.broadbandforum.tr181.datatypes.IPv4Address ipaddress;
	/**
	 * The time at which the DHCP lease will expire or {{null}} if not known. For an infinite lease, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "LeaseTimeRemaining")
	public LocalDateTime leaseTimeRemaining;

	public IPv4Address() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the ipv4 address.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv4Address getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the ipv4 address.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(org.broadbandforum.tr181.datatypes.IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the ipv4 address.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public IPv4Address withIpaddress(org.broadbandforum.tr181.datatypes.IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the time at which the DHCP lease will expire or {{null}} if not known. For an infinite lease, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getLeaseTimeRemaining() {
		return leaseTimeRemaining;
	}

	/**
	 * Set the time at which the DHCP lease will expire or {{null}} if not known. For an infinite lease, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param leaseTimeRemaining the input value
	 */
	public void  setLeaseTimeRemaining(LocalDateTime leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
	}

	/**
	 * Set the time at which the DHCP lease will expire or {{null}} if not known. For an infinite lease, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param leaseTimeRemaining the input value
	 * @return this instance
	 */
	public IPv4Address withLeaseTimeRemaining(LocalDateTime leaseTimeRemaining) {
		this.leaseTimeRemaining = leaseTimeRemaining;
		return this;
	}

	//</editor-fold>

}