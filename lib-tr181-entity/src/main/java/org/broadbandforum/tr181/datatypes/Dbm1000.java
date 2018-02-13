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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

	/**
	 * The value is measured in ''dBm/1000'', i.e. the value divided by 1000 is dB relative to 1 mW.  For example, -12345 means -12.345 dBm, 0 means 0 dBm (1 mW) and 12345 means 12.345 dBm.
	 */
@XmlRootElement(name = "Dbm1000")
@XmlType(name = "org.broadbandforum.tr181.datatypes.Dbm1000")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dbm1000 {

	public Integer value;

	public Dbm1000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 *
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 *
	 * @param value the input value
	 */
	public void  setValue(Integer value) {
		this.value = value;
	}

	/**
	 *
	 * @param value the input value
	 * @return this instance
	 */
	public Dbm1000 withValue(Integer value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}