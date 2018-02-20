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
package org.broadbandforum.tr181.device.ipsec.ikev2sa;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This is a transitory table that lists all the IKEv2 Configuration Payload (CP) {{bibref|RFC5996|Section 3.15}} Attributes that have been received via CFG_REPLY messages.  Table entries are automatically created to correspond with received Attributes. However, it is a local matter to the CPE when to delete old table entries.

        If the same Attribute is received multiple times, it is up to the CPE to decide which entries to include (i.e. whether the same Attribute will be present multiple times). In order to allow for the same Attribute to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @since TR181 v2.5
	 */
@CWMPObject(name = "Device.IPsec.IKEv2SA.{i}.ReceivedCPAttr.{i}.")
@XmlRootElement(name = "Device.IPsec.IKEv2SA.ReceivedCPAttr")
@XmlType(name = "Device.IPsec.IKEv2SA.ReceivedCPAttr")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReceivedCPAttr {

	/**
	 * CP Attribute Type as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Type")
	@Size(min = 0, max = 32767)
	public Long type;
	/**
	 * A hexbinary encoded CP Attribute Value as described in {{bibref|RFC5996|Section 3.15.1}} and defined in {{bibref|IKEv2-params|IKEv2 Configuration Payload Attribute Types}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Value")
	public byte[] value;

	public ReceivedCPAttr() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public ReceivedCPAttr withType(Long type) {
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
	public ReceivedCPAttr withValue(byte[] value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}