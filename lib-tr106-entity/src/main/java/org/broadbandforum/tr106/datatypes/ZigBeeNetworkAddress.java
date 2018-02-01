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
package org.broadbandforum.tr106.datatypes;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

	/**
	 * The ZigBee 16-bit network address (NWK) as defined in {{bibref|ZigBee2007}}. The address is assigned to a device by the network layer and used by the network layer for routing messages between devices.
	 */
public class ZigBeeNetworkAddress {

	@Size(max = 4)
	@Pattern(regexp = "([0-9A-Fa-f]){4}")
	public String value;

	public ZigBeeNetworkAddress() {
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
	public ZigBeeNetworkAddress withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}