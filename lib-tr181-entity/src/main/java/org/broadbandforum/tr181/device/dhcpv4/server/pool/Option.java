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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are  associated with this pool.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Server.Pool.{i}.Option.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Tag"})})
@XmlRootElement(name = "Device.DHCPv4.Server.Pool.Option")
@XmlType(name = "Device.DHCPv4.Server.Pool.Option")
@XmlAccessorType(XmlAccessType.FIELD)
public class Option {

	/**
	 * Enables or disables this Option table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Option tag as defined in {{bibref|RFC2132}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Tag")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 254)
	public Long tag;
	/**
	 * A hexbinary encoded option value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(access = "readWrite")
	public byte[] value;

	public Option() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Option table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Option table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Option table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Option withEnable(Boolean enable) {
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
	public Option withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the option tag as defined in {{bibref|RFC2132}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTag() {
		return tag;
	}

	/**
	 * Set the option tag as defined in {{bibref|RFC2132}}.
	 *
	 * @since 2.0
	 * @param tag the input value
	 */
	public void  setTag(Long tag) {
		this.tag = tag;
	}

	/**
	 * Set the option tag as defined in {{bibref|RFC2132}}.
	 *
	 * @since 2.0
	 * @param tag the input value
	 * @return this instance
	 */
	public Option withTag(Long tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get a hexbinary encoded option value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Set a hexbinary encoded option value.
	 *
	 * @since 2.0
	 * @param value the input value
	 */
	public void  setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Set a hexbinary encoded option value.
	 *
	 * @since 2.0
	 * @param value the input value
	 * @return this instance
	 */
	public Option withValue(byte[] value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}