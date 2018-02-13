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
package org.broadbandforum.tr181.device.dhcpv4.client;

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
	 * Each instance of this object represents a DHCP option that MUST, if enabled, be requested in DHCP client requests.  All requested DHCP options MUST be listed.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Client.{i}.ReqOption.{i}.")
@XmlRootElement(name = "Device.DHCPv4.Client.ReqOption")
@XmlType(name = "Device.DHCPv4.Client.ReqOption")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqOption {

	/**
	 * Enables or disables this ReqOption table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Position of the option in the DHCP client request.  A value of ''1'' indicates the first entry.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is  changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
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
	 * A hexbinary encoded, most recently received DHCP option value.

          If no option value has been received, then the value MUST represent {{empty}}.

          Received DHCP option values MAY, but need not, persist across CPE reboots.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Value")
	public byte[] value;

	public ReqOption() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this ReqOption table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this ReqOption table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this ReqOption table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public ReqOption withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the position of the option in the DHCP client request.  A value of ''1'' indicates the first entry.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is  changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the option in the DHCP client request.  A value of ''1'' indicates the first entry.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is  changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the option in the DHCP client request.  A value of ''1'' indicates the first entry.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is  changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public ReqOption withOrder(Long order) {
		this.order = order;
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
	public ReqOption withAlias(Alias alias) {
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
	public ReqOption withTag(Long tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get a hexbinary encoded, most recently received DHCP option value.

          If no option value has been received, then the value MUST represent {{empty}}.

          Received DHCP option values MAY, but need not, persist across CPE reboots.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Set a hexbinary encoded, most recently received DHCP option value.

          If no option value has been received, then the value MUST represent {{empty}}.

          Received DHCP option values MAY, but need not, persist across CPE reboots.
	 *
	 * @since 2.0
	 * @param value the input value
	 */
	public void  setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Set a hexbinary encoded, most recently received DHCP option value.

          If no option value has been received, then the value MUST represent {{empty}}.

          Received DHCP option values MAY, but need not, persist across CPE reboots.
	 *
	 * @since 2.0
	 * @param value the input value
	 * @return this instance
	 */
	public ReqOption withValue(byte[] value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}