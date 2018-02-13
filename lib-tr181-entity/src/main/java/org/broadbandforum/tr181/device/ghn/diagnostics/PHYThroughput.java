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
package org.broadbandforum.tr181.device.ghn.diagnostics;

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
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.ghn.diagnostics.phythroughput.Result;

	/**
	 * G.hn PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PHYThroughputDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Ghn.Diagnostics.PHYThroughput.")
@XmlRootElement(name = "PHYThroughput")
@XmlType(name = "Device.Ghn.Diagnostics.PHYThroughput")
@XmlAccessorType(XmlAccessType.FIELD)
public class PHYThroughput {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * The interface over which the test is to be performed.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public String _interface;
	/**
	 * The MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiagnoseMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress diagnoseMACAddress;
	/**
	 * PHY throughput diagnostics results.
	 */
	@XmlElementWrapper(name = "Results")
	@XmlElement(name = "Result")
	public Collection<Result> results;

	public PHYThroughput() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public DiagnosticsState getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public PHYThroughput withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the interface over which the test is to be performed.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the interface over which the test is to be performed.
	 *
	 * @since 2.8
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the interface over which the test is to be performed.
	 *
	 * @since 2.8
	 * @param _interface the input value
	 * @return this instance
	 */
	public PHYThroughput with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getDiagnoseMACAddress() {
		return diagnoseMACAddress;
	}

	/**
	 * Set the MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 * @param diagnoseMACAddress the input value
	 */
	public void  setDiagnoseMACAddress(MACAddress diagnoseMACAddress) {
		this.diagnoseMACAddress = diagnoseMACAddress;
	}

	/**
	 * Set the MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 * @param diagnoseMACAddress the input value
	 * @return this instance
	 */
	public PHYThroughput withDiagnoseMACAddress(MACAddress diagnoseMACAddress) {
		this.diagnoseMACAddress = diagnoseMACAddress;
		return this;
	}

	/**
	 * Get the phy throughput diagnostics results.
	 *
	 * @return the value
	 */
	public Collection<Result> getResults() {
		if (this.results == null){ this.results=new ArrayList<>();}
		return results;
	}

	/**
	 * Set the phy throughput diagnostics results.
	 *
	 * @param results the input value
	 */
	public void  setResults(Collection<Result> results) {
		this.results = results;
	}

	/**
	 * Set the phy throughput diagnostics results.
	 *
	 * @param result the input value
	 * @return this instance
	 */
	public PHYThroughput withResult(Result result) {
		getResults().add(result);
		return this;
	}

	//</editor-fold>

}