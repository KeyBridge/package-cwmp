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
package org.broadbandforum.tr104.datatypes;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

	/**
	 * A non-volatile handle used to reference this instance. Alias provides a mechanism for an ACS to label this instance for future reference.

If the CPE supports the Alias-based Addressing feature as defined in {{bibref|TR-069a4|3.6.1}} and described in {{bibref|TR-069a4|Appendix II}}, the following mandatory constraints MUST be enforced:

*Its value MUST NOT be empty.

*Its value MUST start with a letter.

*If its value is not assigned by the ACS, it MUST start with a "cpe-" prefix.

*The CPE MUST NOT change the parameter value.
	 */
@XmlRootElement(name = "Alias")
@XmlType(name = "org.broadbandforum.tr104.datatypes.Alias")
@XmlAccessorType(XmlAccessType.FIELD)
public class Alias {

	@Size(max = 64)
	public String value;

	public Alias() {
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
	public Alias withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}