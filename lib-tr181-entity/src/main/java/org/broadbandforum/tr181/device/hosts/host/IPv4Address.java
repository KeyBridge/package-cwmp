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
package org.broadbandforum.tr181.device.hosts.host;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * The host's known IPv4 addresses.  This includes any addresses assigned via DHCP, which can also be accessed via the {{param|#.DHCPClient}} reference.
	 *
	 * @since TR181 v2.2
	 */
@CWMPObject(name = "Device.Hosts.Host.{i}.IPv4Address.{i}.", uniqueConstraints = {@CWMPUnique(names = {"IPAddress"})})
@XmlRootElement(name = "Device.Hosts.Host.IPv4Address")
@XmlType(name = "Device.Hosts.Host.IPv4Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv4Address {

	/**
	 * IPv4 address.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPAddress")
	public org.broadbandforum.common.IPv4Address ipaddress;

	public IPv4Address() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the ipv4 address.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.common.IPv4Address getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the ipv4 address.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(org.broadbandforum.common.IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the ipv4 address.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public IPv4Address withIpaddress(org.broadbandforum.common.IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	//</editor-fold>

}