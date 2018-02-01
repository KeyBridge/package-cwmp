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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection.dhcpclient;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Each instance of this object represents a DHCP option that MUST, if enabled, be sent in DHCP client requests.  All sent DHCP options MUST be listed.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANIPConnection.{i}.DHCPClient.SentDHCPOption.{i}.")
public class SentDHCPOption {

	/**
	 * Enables or disables this SentDHCPOption table entry.
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

	public SentDHCPOption() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this SentDHCPOption table entry.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this SentDHCPOption table entry.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this SentDHCPOption table entry.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public SentDHCPOption withEnable(Boolean enable) {
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
	public SentDHCPOption withAlias(Alias alias) {
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
	public SentDHCPOption withTag(Long tag) {
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
	public SentDHCPOption withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}