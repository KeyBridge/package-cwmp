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
package org.broadbandforum.tr181.device.upa.diagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.DiagnosticsState;

	/**
	 * This object provides access to either a Signal-to-Noise-Ratio (SNR) Port Measurement test or a Channel Frequency Response (CFR) Port Measurement test. The {{param|Type}} parameter is used to select which type of test to perform.

        CFR and SNR measurements are done between a two UPA devices (a local interface and a remote device belonging to the same network).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.UPA.Diagnostics.InterfaceMeasurement.")
public class InterfaceMeasurement {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * Indicates the type of port measurement test to be carried out.  {{enum}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	public String type;
	/**
	 * {{reference}}  This is the local UPA interface from which the test is to be performed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * PLC port being measured. This identifies which PLC connection to measure between the local interface (indicated by {{param|Interface}}) and the remote device (implied by {{param}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long port;
	/**
	 * {{list}} Result of Signal-to-Noise-Ratio measurement (if {{param|Type}} is {{enum|SNR|Type}}) or Channel Frequency Response measurement (if {{param|Type}} is {{enum|CFR|Type}}).

          List items indicate measurements per carrier for a PLC port (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Measurements")
	public Long measurements;
	/**
	 * Reception gain of the adapter (expresssed in dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxGain")
	public Integer rxgain;

	public InterfaceMeasurement() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public DiagnosticsState getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public InterfaceMeasurement withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the indicates the type of port measurement test to be carried out.  {{enum}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the indicates the type of port measurement test to be carried out.  {{enum}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the indicates the type of port measurement test to be carried out.  {{enum}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public InterfaceMeasurement withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the {{reference}}  This is the local UPA interface from which the test is to be performed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}}  This is the local UPA interface from which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}}  This is the local UPA interface from which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public InterfaceMeasurement with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the plc port being measured. This identifies which PLC connection to measure between the local interface (indicated by {{param|Interface}}) and the remote device (implied by {{param}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the plc port being measured. This identifies which PLC connection to measure between the local interface (indicated by {{param|Interface}}) and the remote device (implied by {{param}}).
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the plc port being measured. This identifies which PLC connection to measure between the local interface (indicated by {{param|Interface}}) and the remote device (implied by {{param}}).
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public InterfaceMeasurement withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the {{list}} Result of Signal-to-Noise-Ratio measurement (if {{param|Type}} is {{enum|SNR|Type}}) or Channel Frequency Response measurement (if {{param|Type}} is {{enum|CFR|Type}}).

          List items indicate measurements per carrier for a PLC port (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMeasurements() {
		return measurements;
	}

	/**
	 * Set the {{list}} Result of Signal-to-Noise-Ratio measurement (if {{param|Type}} is {{enum|SNR|Type}}) or Channel Frequency Response measurement (if {{param|Type}} is {{enum|CFR|Type}}).

          List items indicate measurements per carrier for a PLC port (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param measurements the input value
	 */
	public void  setMeasurements(Long measurements) {
		this.measurements = measurements;
	}

	/**
	 * Set the {{list}} Result of Signal-to-Noise-Ratio measurement (if {{param|Type}} is {{enum|SNR|Type}}) or Channel Frequency Response measurement (if {{param|Type}} is {{enum|CFR|Type}}).

          List items indicate measurements per carrier for a PLC port (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param measurements the input value
	 * @return this instance
	 */
	public InterfaceMeasurement withMeasurements(Long measurements) {
		this.measurements = measurements;
		return this;
	}

	/**
	 * Get the reception gain of the adapter (expresssed in dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRxgain() {
		return rxgain;
	}

	/**
	 * Set the reception gain of the adapter (expresssed in dB).
	 *
	 * @since 2.0
	 * @param rxgain the input value
	 */
	public void  setRxgain(Integer rxgain) {
		this.rxgain = rxgain;
	}

	/**
	 * Set the reception gain of the adapter (expresssed in dB).
	 *
	 * @since 2.0
	 * @param rxgain the input value
	 * @return this instance
	 */
	public InterfaceMeasurement withRxgain(Integer rxgain) {
		this.rxgain = rxgain;
		return this;
	}

	//</editor-fold>

}