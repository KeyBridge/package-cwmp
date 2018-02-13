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

	/**
	 * IPv6 prefixes delegated to this client via IA_PD.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Server.Pool.{i}.Client.{i}.IPv6Prefix.{i}.")
@XmlRootElement(name = "IPv6Prefix")
@XmlType(name = "Device.DHCPv6.Server.Pool.Client.IPv6Prefix")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv6Prefix {

	/**
	 * IPv6 address prefix.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Prefix")
	public org.broadbandforum.tr181.datatypes.IPv6Prefix prefix;
	/**
	 * The time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PreferredLifetime")
	public LocalDateTime preferredLifetime;
	/**
	 * The time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ValidLifetime")
	public LocalDateTime validLifetime;

	public IPv6Prefix() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the ipv6 address prefix.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv6Prefix getPrefix() {
		return prefix;
	}

	/**
	 * Set the ipv6 address prefix.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 */
	public void  setPrefix(org.broadbandforum.tr181.datatypes.IPv6Prefix prefix) {
		this.prefix = prefix;
	}

	/**
	 * Set the ipv6 address prefix.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 * @return this instance
	 */
	public IPv6Prefix withPrefix(org.broadbandforum.tr181.datatypes.IPv6Prefix prefix) {
		this.prefix = prefix;
		return this;
	}

	/**
	 * Get the time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getPreferredLifetime() {
		return preferredLifetime;
	}

	/**
	 * Set the time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 */
	public void  setPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
	}

	/**
	 * Set the time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 * @return this instance
	 */
	public IPv6Prefix withPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
		return this;
	}

	/**
	 * Get the time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getValidLifetime() {
		return validLifetime;
	}

	/**
	 * Set the time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 */
	public void  setValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
	}

	/**
	 * Set the time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 * @return this instance
	 */
	public IPv6Prefix withValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
		return this;
	}

	//</editor-fold>

}