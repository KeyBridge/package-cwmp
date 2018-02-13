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
package org.broadbandforum.tr181.device.atm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.atm.diagnostics.F5Loopback;

	/**
	 * The ATM Diagnostics object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.ATM.Diagnostics.")
@XmlRootElement(name = "Device.ATM.Diagnostics")
@XmlType(name = "Device.ATM.Diagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diagnostics {

	/**
	 * This object provides access to an ATM-layer F5 OAM loopback test.
	 */
	@XmlElement(name = "F5Loopback")
	public F5Loopback f5loopback;

	public Diagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @return the value
	 */
	public F5Loopback getF5loopback() {
		return f5loopback;
	}

	/**
	 * Set the this object provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @param f5loopback the input value
	 */
	public void  setF5loopback(F5Loopback f5loopback) {
		this.f5loopback = f5loopback;
	}

	/**
	 * Set the this object provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @param f5loopback the input value
	 * @return this instance
	 */
	public Diagnostics withF5loopback(F5Loopback f5loopback) {
		this.f5loopback = f5loopback;
		return this;
	}

	//</editor-fold>

}