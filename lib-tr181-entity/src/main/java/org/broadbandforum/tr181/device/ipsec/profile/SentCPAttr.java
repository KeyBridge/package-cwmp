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
package org.broadbandforum.tr181.device.ipsec.profile;

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
	 * Each instance of this object represents an IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attribute that MUST, if enabled, be sent in IKEv2 CP CFG_REQUEST messages.  All such Attributes MUST be listed.
	 *
	 * @since TR181 v2.5
	 */
@CWMPObject(name = "Device.IPsec.Profile.{i}.SentCPAttr.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Type"})})
@XmlRootElement(name = "Device.IPsec.Profile.SentCPAttr")
@XmlType(name = "Device.IPsec.Profile.SentCPAttr")
@XmlAccessorType(XmlAccessType.FIELD)
public class SentCPAttr {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * CP Attribute Type as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 32767)
	public Long type;
	/**
	 * A hexbinary encoded CP Attribute Value as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(access = "readWrite")
	public byte[] value;

	public SentCPAttr() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.5
	 * @param enable the input value
	 * @return this instance
	 */
	public SentCPAttr withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 * @return this instance
	 */
	public SentCPAttr withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the cp Attribute Type as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getType() {
		return type;
	}

	/**
	 * Set the cp Attribute Type as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 * @param type the input value
	 */
	public void  setType(Long type) {
		this.type = type;
	}

	/**
	 * Set the cp Attribute Type as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 * @param type the input value
	 * @return this instance
	 */
	public SentCPAttr withType(Long type) {
		this.type = type;
		return this;
	}

	/**
	 * Get a hexbinary encoded CP Attribute Value as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Set a hexbinary encoded CP Attribute Value as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 * @param value the input value
	 */
	public void  setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Set a hexbinary encoded CP Attribute Value as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 * @param value the input value
	 * @return this instance
	 */
	public SentCPAttr withValue(byte[] value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}