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

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

	/**
	 * The IEEE EUI 64-bit identifier as defined in {{bibref|EUI64}}. The IEEE defined 64-bit extended unique identifier (EUI-64) is a concatenation of:

      * The 24-bit (OUI-24) or 36-bit (OUI-36) company_id value assigned by the IEEE Registration Authority (IEEE-RA), and

      * The extension identifier (40 bits for OUI-24 or 28 bits for OUI-36) assigned by the organization with that company_id assignment.
	 */
public class IEEE_EUI64 {

	@Size(max = 23)
	@Pattern(regexp = "([0-9A-Fa-f][0-9A-Fa-f]:){7}([0-9A-Fa-f][0-9A-Fa-f])")
	public String value;

	public IEEE_EUI64() {
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
	public IEEE_EUI64 withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}