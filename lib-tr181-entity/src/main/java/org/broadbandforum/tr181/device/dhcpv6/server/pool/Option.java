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
package org.broadbandforum.tr181.device.dhcpv6.server.pool;

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
	 * This object specifies the DHCPv6 options that MUST, if enabled, be offered to clients whose DHCPv6 requests are associated with this pool. If {{param|PassthroughClient}} is specified, and the referenced client has a value for a given option then the {{param|PassthroughClient}} option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Server.Pool.{i}.Option.{i}.")
@XmlRootElement(name = "Device.DHCPv6.Server.Pool.Option")
@XmlType(name = "Device.DHCPv6.Server.Pool.Option")
@XmlAccessorType(XmlAccessType.FIELD)
public class Option {

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
	 * A hexbinary encoded option value.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Value")
	@CWMPParameter(access = "readWrite")
	public byte[] value;
	/**
	 * {{reference}} Indicates whether this {{object}} entry is configured for passthrough.

          If {{param}} is specified, and the referenced client (since boot) has received a value from an associated upstream DHCPv6 server for the given {{param|Tag}} option, then the referenced client's option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.

          {{empty}} indicates that passthrough is not configured for this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PassthroughClient")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String passthroughClient;

	public Option() {
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
	public Option withEnable(Boolean enable) {
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
	public Option withAlias(Alias alias) {
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

	/**
	 * Get the {{reference}} Indicates whether this {{object}} entry is configured for passthrough.

          If {{param}} is specified, and the referenced client (since boot) has received a value from an associated upstream DHCPv6 server for the given {{param|Tag}} option, then the referenced client's option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.

          {{empty}} indicates that passthrough is not configured for this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getPassthroughClient() {
		return passthroughClient;
	}

	/**
	 * Set the {{reference}} Indicates whether this {{object}} entry is configured for passthrough.

          If {{param}} is specified, and the referenced client (since boot) has received a value from an associated upstream DHCPv6 server for the given {{param|Tag}} option, then the referenced client's option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.

          {{empty}} indicates that passthrough is not configured for this {{object}} entry.
	 *
	 * @since 2.2
	 * @param passthroughClient the input value
	 */
	public void  setPassthroughClient(String passthroughClient) {
		this.passthroughClient = passthroughClient;
	}

	/**
	 * Set the {{reference}} Indicates whether this {{object}} entry is configured for passthrough.

          If {{param}} is specified, and the referenced client (since boot) has received a value from an associated upstream DHCPv6 server for the given {{param|Tag}} option, then the referenced client's option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.

          {{empty}} indicates that passthrough is not configured for this {{object}} entry.
	 *
	 * @since 2.2
	 * @param passthroughClient the input value
	 * @return this instance
	 */
	public Option withPassthroughClient(String passthroughClient) {
		this.passthroughClient = passthroughClient;
		return this;
	}

	//</editor-fold>

}