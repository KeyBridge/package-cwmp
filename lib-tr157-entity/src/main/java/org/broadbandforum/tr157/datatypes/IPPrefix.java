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
package org.broadbandforum.tr157.datatypes;

import javax.validation.constraints.Size;

	/**
	 * IPv4 or IPv6 routing prefix in Classless Inter-Domain Routing (CIDR) notation {{bibref|RFC4632}}. This is specified as an IP address followed by an appended "/n" suffix, where ''n'' (the prefix size) is an integer in the range 0-32 (for IPv4) or 0-128 (for IPv6) that indicates the number of (leftmost) '1' bits of the routing prefix. 

      * IPv4 example: 192.168.1.0/24

      * IPv6 example: 2001:edff:fe6a:f76::/64

      If the IP address part is unspecified or inapplicable, it MUST be {{empty}} unless otherwise specified by the parameter definition.  In this case the IP prefix will be of the form "/n".

      If the entire IP prefix is unspecified or inapplicable, it MUST be {{empty}} unless otherwise specified by the parameter definition.
	 */
public class IPPrefix {

	@Size(max = 49)
	public String value;

	public IPPrefix() {
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
	public IPPrefix withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}