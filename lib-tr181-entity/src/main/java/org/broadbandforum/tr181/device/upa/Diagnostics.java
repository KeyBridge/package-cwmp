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
package org.broadbandforum.tr181.device.upa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.upa.diagnostics.InterfaceMeasurement;

	/**
	 * The UPA Diagnostics object.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UPA.Diagnostics.")
@XmlRootElement(name = "Device.UPA.Diagnostics")
@XmlType(name = "Device.UPA.Diagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diagnostics {

	/**
	 * This object provides access to either a Signal-to-Noise-Ratio (SNR) Port Measurement test or a Channel Frequency Response (CFR) Port Measurement test. The {{param|Type}} parameter is used to select which type of test to perform.

        CFR and SNR measurements are done between a two UPA devices (a local interface and a remote device belonging to the same network).
	 */
	@XmlElement(name = "InterfaceMeasurement")
	public InterfaceMeasurement interfaceMeasurement;

	public Diagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object provides access to either a Signal-to-Noise-Ratio (SNR) Port Measurement test or a Channel Frequency Response (CFR) Port Measurement test. The {{param|Type}} parameter is used to select which type of test to perform.

        CFR and SNR measurements are done between a two UPA devices (a local interface and a remote device belonging to the same network).
	 *
	 * @return the value
	 */
	public InterfaceMeasurement getInterfaceMeasurement() {
		return interfaceMeasurement;
	}

	/**
	 * Set the this object provides access to either a Signal-to-Noise-Ratio (SNR) Port Measurement test or a Channel Frequency Response (CFR) Port Measurement test. The {{param|Type}} parameter is used to select which type of test to perform.

        CFR and SNR measurements are done between a two UPA devices (a local interface and a remote device belonging to the same network).
	 *
	 * @param interfaceMeasurement the input value
	 */
	public void  setInterfaceMeasurement(InterfaceMeasurement interfaceMeasurement) {
		this.interfaceMeasurement = interfaceMeasurement;
	}

	/**
	 * Set the this object provides access to either a Signal-to-Noise-Ratio (SNR) Port Measurement test or a Channel Frequency Response (CFR) Port Measurement test. The {{param|Type}} parameter is used to select which type of test to perform.

        CFR and SNR measurements are done between a two UPA devices (a local interface and a remote device belonging to the same network).
	 *
	 * @param interfaceMeasurement the input value
	 * @return this instance
	 */
	public Diagnostics withInterfaceMeasurement(InterfaceMeasurement interfaceMeasurement) {
		this.interfaceMeasurement = interfaceMeasurement;
		return this;
	}

	//</editor-fold>

}