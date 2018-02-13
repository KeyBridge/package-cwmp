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
package org.broadbandforum.tr181.device.wifi;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.DiagnosticsState;
import org.broadbandforum.tr181.device.wifi.neighboringwifidiagnostic.Result;

	/**
	 * This object defines access to other WiFi SSIDs that this device is able to receive.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.WiFi.NeighboringWiFiDiagnostic.")
@XmlRootElement(name = "Device.WiFi.NeighboringWiFiDiagnostic")
@XmlType(name = "Device.WiFi.NeighboringWiFiDiagnostic")
@XmlAccessorType(XmlAccessType.FIELD)
public class NeighboringWiFiDiagnostic {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * Neighboring SSID table. This table models the other WiFi SSIDs that this device is able to receive.
	 */
	@XmlElementWrapper(name = "Results")
	@XmlElement(name = "Result")
	public Collection<Result> results;

	public NeighboringWiFiDiagnostic() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public DiagnosticsState getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public NeighboringWiFiDiagnostic withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the neighboring SSID table. This table models the other WiFi SSIDs that this device is able to receive.
	 *
	 * @return the value
	 */
	public Collection<Result> getResults() {
		if (this.results == null){ this.results=new ArrayList<>();}
		return results;
	}

	/**
	 * Set the neighboring SSID table. This table models the other WiFi SSIDs that this device is able to receive.
	 *
	 * @param results the input value
	 */
	public void  setResults(Collection<Result> results) {
		this.results = results;
	}

	/**
	 * Set the neighboring SSID table. This table models the other WiFi SSIDs that this device is able to receive.
	 *
	 * @param result the input value
	 * @return this instance
	 */
	public NeighboringWiFiDiagnostic withResult(Result result) {
		getResults().add(result);
		return this;
	}

	//</editor-fold>

}