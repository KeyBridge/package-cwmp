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
package org.broadbandforum.tr181.datatypes;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

	/**
	 * All MAC addresses are represented as strings of 12 hexadecimal digits (digits 0-9, letters A-F or a-f) displayed as six pairs of digits separated by colons.  Unspecified or inapplicable MAC addresses MUST be represented as empty strings unless otherwise specified by the parameter definition.
	 */
@XmlRootElement(name = "org.broadbandforum.tr181.datatypes.MACAddress")
@XmlType(name = "org.broadbandforum.tr181.datatypes.MACAddress")
@XmlAccessorType(XmlAccessType.FIELD)
public class MACAddress {

	@Size(max = 17)
	@Pattern(regexp = "([0-9A-Fa-f][0-9A-Fa-f]:){5}([0-9A-Fa-f][0-9A-Fa-f])")
	public String value;

	public MACAddress() {
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
	public MACAddress withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}