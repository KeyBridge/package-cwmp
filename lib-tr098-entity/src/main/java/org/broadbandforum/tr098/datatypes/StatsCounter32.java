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
package org.broadbandforum.tr098.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

	/**
	 * A 32-bit statistics parameter, e.g. a byte counter.

This data type SHOULD NOT be used for statistics parameters whose values might become greater than the maximum value that can be represented as an ''unsignedInt'' (i.e. 0xffffffff, referred to below as ''maxval''). ''StatsCounter64'' SHOULD be used for such parameters.

The value ''maxval'' indicates that no data is available for this parameter.  In the unlikely event that the actual value of the statistic is ''maxval'', the CPE SHOULD return ''maxval - 1''.

The actual value of the statistic might be greater than ''maxval''. Such values SHOULD wrap around through zero.

The term ''packet'' is to be interpreted as the transmission unit appropriate to the protocol layer in question, e.g. an IP packet or an Ethernet frame.
	 */
@XmlRootElement(name = "StatsCounter32")
@XmlType(name = "org.broadbandforum.tr098.datatypes.StatsCounter32")
@XmlAccessorType(XmlAccessType.FIELD)
public class StatsCounter32 {

	public Long value;

	public StatsCounter32() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 *
	 * @return the value
	 */
	public Long getValue() {
		return value;
	}

	/**
	 *
	 * @param value the input value
	 */
	public void  setValue(Long value) {
		this.value = value;
	}

	/**
	 *
	 * @param value the input value
	 * @return this instance
	 */
	public StatsCounter32 withValue(Long value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}