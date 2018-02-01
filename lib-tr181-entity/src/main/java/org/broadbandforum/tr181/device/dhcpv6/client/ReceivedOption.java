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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This is a transitory table that lists all the options received from all servers. Table entries are automatically created to correspond with received options. However, it is a local matter to the CPE when to delete old table entries.

        If the same option is received multiple times, whether from one or more servers, it is up to the CPE to decide which entries to include (i.e. whether the same option will be present multiple times). In order to allow for the same option to be present multiple times within the table, this table has no unique key defined.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Client.{i}.ReceivedOption.{i}.")
public class ReceivedOption {

	/**
	 * Option tag (code) {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Tag")
	@Size(min = 0, max = 65535)
	public Long tag;
	/**
	 * A hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Value")
	public byte[] value;
	/**
	 * {{reference}} This is the server that sent the option to the client. Each {{object}} entry MUST have an associated server.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Server")
	public String server;

	public ReceivedOption() {
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
	public ReceivedOption withTag(Long tag) {
		this.tag = tag;
		return this;
	}

	/**
	 * Get a hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * Set a hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @param value the input value
	 */
	public void  setValue(byte[] value) {
		this.value = value;
	}

	/**
	 * Set a hexbinary encoded option data {{bibref|RFC3315|Section 22.1}}.
	 *
	 * @since 2.2
	 * @param value the input value
	 * @return this instance
	 */
	public ReceivedOption withValue(byte[] value) {
		this.value = value;
		return this;
	}

	/**
	 * Get the {{reference}} This is the server that sent the option to the client. Each {{object}} entry MUST have an associated server.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getServer() {
		return server;
	}

	/**
	 * Set the {{reference}} This is the server that sent the option to the client. Each {{object}} entry MUST have an associated server.
	 *
	 * @since 2.2
	 * @param server the input value
	 */
	public void  setServer(String server) {
		this.server = server;
	}

	/**
	 * Set the {{reference}} This is the server that sent the option to the client. Each {{object}} entry MUST have an associated server.
	 *
	 * @since 2.2
	 * @param server the input value
	 * @return this instance
	 */
	public ReceivedOption withServer(String server) {
		this.server = server;
		return this;
	}

	//</editor-fold>

}