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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * DHCPv6 options supplied by this client, e.g. ''DUID'' (Option 1), ''UserClassID'' (Option 15) or ''VendorClassID'' (option 16).
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Server.Pool.{i}.Client.{i}.Option.{i}.")
@XmlRootElement(name = "Option")
@XmlType(name = "Device.DHCPv6.Server.Pool.Client.Option")
@XmlAccessorType(XmlAccessType.FIELD)
public class Option {

	/**
	 * Option tag (code) {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Tag")
	@Size(min = 0, max = 65535)
	public Long tag;
	/**
	 * A hexbinary encoded option value.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Value")
	public byte[] value;

	public Option() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the option tag (code) {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getTag() {
		return tag;
	}

	/**
	 * Set the option tag (code) {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @param tag the input value
	 */
	public void  setTag(Long tag) {
		this.tag = tag;
	}

	/**
	 * Set the option tag (code) {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
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
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Set a hexbinary encoded option value.
	 *
	 * @since 2.2
	 * @param value the input value
	 */
	public void  setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Set a hexbinary encoded option value.
	 *
	 * @since 2.2
	 * @param value the input value
	 * @return this instance
	 */
	public Option withValue(byte[] value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}