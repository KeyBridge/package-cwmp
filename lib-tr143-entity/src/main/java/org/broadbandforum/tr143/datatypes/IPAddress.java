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
package org.broadbandforum.tr143.datatypes;

import javax.validation.constraints.Size;

	/**
	 * IP address, i.e. IPv4 address (or IPv4 subnet mask) or IPv6 address.

All IPv4 addresses and subnet masks MUST be represented as strings in IPv4 dotted-decimal notation.  Here are some examples of valid IPv4 address textual representations:

* 216.52.29.100

* 192.168.1.254

All IPv6 addresses MUST be represented using any of the 3 standard textual representations defined in {{bibref|RFC4291}} Sections 2.2.1, 2.2.2 and 2.2.3.  Both lower-case and upper-case letters can be used, but use of lower-case letters is RECOMMENDED.  Here are some examples of valid IPv6 address textual representations:

* 1080:0:0:800:ba98:3210:11aa:12dd

* 1080::800:ba98:3210:11aa:12dd

* 0:0:0:0:0:0:13.1.68.3

IPv6 addresses MUST NOT include zone identifiers. Zone identifiers are discussed in {{bibref|RFC4007|Section 6}}.

Unspecified or inapplicable addresses (or IPv4 subnet masks) MUST be represented as empty strings unless otherwise specified by the parameter definition.
	 */
public class IPAddress {

	@Size(max = 45)
	public String value;

	public IPAddress() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 *
	 * @param value the input value
	 */
	public void  setValue(String value) {
		this.value = value;
	}

	/**
	 *
	 * @param value the input value
	 * @return this instance
	 */
	public IPAddress withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}