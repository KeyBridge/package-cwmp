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
package org.broadbandforum.tr181.device.dhcpv6.server.pool.client;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * IPv6 addresses assigned to this client via IA_NA.
	 *
	 * @since TR181 v2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Server.Pool.{i}.Client.{i}.IPv6Address.{i}.", uniqueConstraints = {@CWMPUnique(names = {"IPAddress"})})
@XmlRootElement(name = "Device.DHCPv6.Server.Pool.Client.IPv6Address")
@XmlType(name = "Device.DHCPv6.Server.Pool.Client.IPv6Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv6Address {

	/**
	 * IPv6 address.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPAddress")
	public org.broadbandforum.common.IPv6Address ipaddress;
	/**
	 * The time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PreferredLifetime")
	public LocalDateTime preferredLifetime;
	/**
	 * The time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ValidLifetime")
	public LocalDateTime validLifetime;

	public IPv6Address() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the ipv6 address.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.common.IPv6Address getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the ipv6 address.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(org.broadbandforum.common.IPv6Address ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the ipv6 address.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public IPv6Address withIpaddress(org.broadbandforum.common.IPv6Address ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getPreferredLifetime() {
		return preferredLifetime;
	}

	/**
	 * Set the time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 */
	public void  setPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
	}

	/**
	 * Set the time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 * @return this instance
	 */
	public IPv6Address withPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
		return this;
	}

	/**
	 * Get the time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getValidLifetime() {
		return validLifetime;
	}

	/**
	 * Set the time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 */
	public void  setValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
	}

	/**
	 * Set the time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 * @return this instance
	 */
	public IPv6Address withValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
		return this;
	}

	//</editor-fold>

}