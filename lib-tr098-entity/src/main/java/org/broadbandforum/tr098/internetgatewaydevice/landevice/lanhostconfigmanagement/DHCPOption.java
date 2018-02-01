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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * This object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests do not match any of the DHCP conditional serving pool entries.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.DHCPOption.{i}.")
public class DHCPOption {

	/**
	 * Enables or disables this DHCPOption table entry.
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
	 * Option tag as defined in RFC 2132 {{bibref|RFC2132}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Tag")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 254)
	public Long tag;
	/**
	 * Base64 encoded option value.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(access = "readWrite")
	public String value;

	public DHCPOption() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this DHCPOption table entry.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this DHCPOption table entry.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this DHCPOption table entry.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public DHCPOption withEnable(Boolean enable) {
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
	public DHCPOption withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the option tag as defined in RFC 2132 {{bibref|RFC2132}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTag() {
		return tag;
	}

	/**
	 * Set the option tag as defined in RFC 2132 {{bibref|RFC2132}}.
	 *
	 * @since 1.4
	 * @param tag the input value
	 */
	public void  setTag(Long tag) {
		this.tag = tag;
	}

	/**
	 * Set the option tag as defined in RFC 2132 {{bibref|RFC2132}}.
	 *
	 * @since 1.4
	 * @param tag the input value
	 * @return this instance
	 */
	public DHCPOption withTag(Long tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get the base64 encoded option value.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set the base64 encoded option value.
	 *
	 * @since 1.4
	 * @param value the input value
	 */
	public void  setValue(String value) {
		this.value = value;
	}

	/**
	 * Set the base64 encoded option value.
	 *
	 * @since 1.4
	 * @param value the input value
	 * @return this instance
	 */
	public DHCPOption withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}