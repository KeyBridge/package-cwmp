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
package org.broadbandforum.tr181.device.dhcpv6.client;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * The top-level options and option values (including any encapsulated options) that the client will send to the server.

        This table is intended only for options that are not part of the basic operation of the protocol, and whose values are simple, do not often change and are not modeled elsewhere.  For example, it is appropriate for OPTION_USER_CLASS (whose value is a list of user classes) but is not appropriate for OPTION_RECONF_MSG (which is part of the protocol), OPTION_IA_NA (which is modeled via {{param|#.RequestAddresses}}) or OPTION_RAPID_COMMIT (which is modeled via {{param|#.RapidCommit}}).
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Client.{i}.SentOption.{i}.")
@XmlRootElement(name = "SentOption")
@XmlType(name = "Device.DHCPv6.Client.SentOption")
@XmlAccessorType(XmlAccessType.FIELD)
public class SentOption {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Option tag (code) {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Tag")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long tag;
	/**
	 * A hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.

          Note: The length of the option data is ''option-len'' octets, as specified in {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(access = "readWrite")
	public byte[] value;

	public SentOption() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public SentOption withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public SentOption withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

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
	public SentOption withTag(Long tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get a hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.

          Note: The length of the option data is ''option-len'' octets, as specified in {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Set a hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.

          Note: The length of the option data is ''option-len'' octets, as specified in {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @param value the input value
	 */
	public void  setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Set a hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.

          Note: The length of the option data is ''option-len'' octets, as specified in {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @param value the input value
	 * @return this instance
	 */
	public SentOption withValue(byte[] value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}