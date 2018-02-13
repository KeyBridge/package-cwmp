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
package org.broadbandforum.tr181.device.hpna.diagnostics;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.DiagnosticsState;
import org.broadbandforum.tr181.device.hpna.diagnostics.phythroughput.Result;

	/**
	 * HPNA PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all HPNA nodes for which the {{param|##.Interface.{i}.AssociatedDevice.{i}.PHYDiagnosticsEnable}} parameter is set enter PHY diagnostics  mode.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Diagnostics.PHYThroughput.")
@XmlRootElement(name = "Device.HPNA.Diagnostics.PHYThroughput")
@XmlType(name = "Device.HPNA.Diagnostics.PHYThroughput")
@XmlAccessorType(XmlAccessType.FIELD)
public class PHYThroughput {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Number of test packet in burst to be send during PHY diagnostics test from each HPNA device to other HPNA device  in the HPNA network.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumPacketsInBurst")
	@CWMPParameter(access = "readWrite")
	public Long numPacketsInBurst;
	/**
	 * Test packet burst interval length (expressed in milliseconds).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BurstInterval")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long burstInterval;
	/**
	 * Payload length in the test packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TestPacketPayloadLength")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1480)
	public Long testPacketPayloadLength;
	/**
	 * HPNA payload encoding in PHY diagnostics. 0 is used for negotiated payload between devices according to line  conditions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PayloadEncoding")
	@CWMPParameter(access = "readWrite")
	public Long payloadEncoding;
	/**
	 * Test packets payload data generator value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PayloadDataGen")
	@CWMPParameter(access = "readWrite")
	public Long payloadDataGen;
	/**
	 * Test packets payload type. {{enum}}

          In Pattern mode the PayloadDataGen value is repeated pattern in the payload.

          In IncrementByte mode LSByte in PayloadDataGen is used as first payload  and next bytes in payload are incremented.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PayloadType")
	@CWMPParameter(access = "readWrite")
	public String payloadType;
	/**
	 * Priority level of PHY diagnostics packets (0 lowest -7 highest).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PriorityLevel")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long priorityLevel;
	/**
	 * PHY throughput diagnostics results. 

        Each result object corresponds to unidirectional traffic between two PHY diagnostics-enabled nodes (so there are two such objects for  each such pair).
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
	public PHYThroughput withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public PHYThroughput with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the number of test packet in burst to be send during PHY diagnostics test from each HPNA device to other HPNA device  in the HPNA network.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumPacketsInBurst() {
		return numPacketsInBurst;
	}

	/**
	 * Set the number of test packet in burst to be send during PHY diagnostics test from each HPNA device to other HPNA device  in the HPNA network.
	 *
	 * @since 2.0
	 * @param numPacketsInBurst the input value
	 */
	public void  setNumPacketsInBurst(Long numPacketsInBurst) {
		this.numPacketsInBurst = numPacketsInBurst;
	}

	/**
	 * Set the number of test packet in burst to be send during PHY diagnostics test from each HPNA device to other HPNA device  in the HPNA network.
	 *
	 * @since 2.0
	 * @param numPacketsInBurst the input value
	 * @return this instance
	 */
	public PHYThroughput withNumPacketsInBurst(Long numPacketsInBurst) {
		this.numPacketsInBurst = numPacketsInBurst;
		return this;
	}

	/**
	 * Get the test packet burst interval length (expressed in milliseconds).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBurstInterval() {
		return burstInterval;
	}

	/**
	 * Set the test packet burst interval length (expressed in milliseconds).
	 *
	 * @since 2.0
	 * @param burstInterval the input value
	 */
	public void  setBurstInterval(Long burstInterval) {
		this.burstInterval = burstInterval;
	}

	/**
	 * Set the test packet burst interval length (expressed in milliseconds).
	 *
	 * @since 2.0
	 * @param burstInterval the input value
	 * @return this instance
	 */
	public PHYThroughput withBurstInterval(Long burstInterval) {
		this.burstInterval = burstInterval;
		return this;
	}

	/**
	 * Get the payload length in the test packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTestPacketPayloadLength() {
		return testPacketPayloadLength;
	}

	/**
	 * Set the payload length in the test packets.
	 *
	 * @since 2.0
	 * @param testPacketPayloadLength the input value
	 */
	public void  setTestPacketPayloadLength(Long testPacketPayloadLength) {
		this.testPacketPayloadLength = testPacketPayloadLength;
	}

	/**
	 * Set the payload length in the test packets.
	 *
	 * @since 2.0
	 * @param testPacketPayloadLength the input value
	 * @return this instance
	 */
	public PHYThroughput withTestPacketPayloadLength(Long testPacketPayloadLength) {
		this.testPacketPayloadLength = testPacketPayloadLength;
		return this;
	}

	/**
	 * Get the hpnA payload encoding in PHY diagnostics. 0 is used for negotiated payload between devices according to line  conditions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPayloadEncoding() {
		return payloadEncoding;
	}

	/**
	 * Set the hpnA payload encoding in PHY diagnostics. 0 is used for negotiated payload between devices according to line  conditions.
	 *
	 * @since 2.0
	 * @param payloadEncoding the input value
	 */
	public void  setPayloadEncoding(Long payloadEncoding) {
		this.payloadEncoding = payloadEncoding;
	}

	/**
	 * Set the hpnA payload encoding in PHY diagnostics. 0 is used for negotiated payload between devices according to line  conditions.
	 *
	 * @since 2.0
	 * @param payloadEncoding the input value
	 * @return this instance
	 */
	public PHYThroughput withPayloadEncoding(Long payloadEncoding) {
		this.payloadEncoding = payloadEncoding;
		return this;
	}

	/**
	 * Get the test packets payload data generator value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPayloadDataGen() {
		return payloadDataGen;
	}

	/**
	 * Set the test packets payload data generator value.
	 *
	 * @since 2.0
	 * @param payloadDataGen the input value
	 */
	public void  setPayloadDataGen(Long payloadDataGen) {
		this.payloadDataGen = payloadDataGen;
	}

	/**
	 * Set the test packets payload data generator value.
	 *
	 * @since 2.0
	 * @param payloadDataGen the input value
	 * @return this instance
	 */
	public PHYThroughput withPayloadDataGen(Long payloadDataGen) {
		this.payloadDataGen = payloadDataGen;
		return this;
	}

	/**
	 * Get the test packets payload type. {{enum}}

          In Pattern mode the PayloadDataGen value is repeated pattern in the payload.

          In IncrementByte mode LSByte in PayloadDataGen is used as first payload  and next bytes in payload are incremented.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPayloadType() {
		return payloadType;
	}

	/**
	 * Set the test packets payload type. {{enum}}

          In Pattern mode the PayloadDataGen value is repeated pattern in the payload.

          In IncrementByte mode LSByte in PayloadDataGen is used as first payload  and next bytes in payload are incremented.
	 *
	 * @since 2.0
	 * @param payloadType the input value
	 */
	public void  setPayloadType(String payloadType) {
		this.payloadType = payloadType;
	}

	/**
	 * Set the test packets payload type. {{enum}}

          In Pattern mode the PayloadDataGen value is repeated pattern in the payload.

          In IncrementByte mode LSByte in PayloadDataGen is used as first payload  and next bytes in payload are incremented.
	 *
	 * @since 2.0
	 * @param payloadType the input value
	 * @return this instance
	 */
	public PHYThroughput withPayloadType(String payloadType) {
		this.payloadType = payloadType;
		return this;
	}

	/**
	 * Get the priority level of PHY diagnostics packets (0 lowest -7 highest).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriorityLevel() {
		return priorityLevel;
	}

	/**
	 * Set the priority level of PHY diagnostics packets (0 lowest -7 highest).
	 *
	 * @since 2.0
	 * @param priorityLevel the input value
	 */
	public void  setPriorityLevel(Long priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	/**
	 * Set the priority level of PHY diagnostics packets (0 lowest -7 highest).
	 *
	 * @since 2.0
	 * @param priorityLevel the input value
	 * @return this instance
	 */
	public PHYThroughput withPriorityLevel(Long priorityLevel) {
		this.priorityLevel = priorityLevel;
		return this;
	}

	/**
	 * Get the phy throughput diagnostics results. 

        Each result object corresponds to unidirectional traffic between two PHY diagnostics-enabled nodes (so there are two such objects for  each such pair).
	 *
	 * @return the value
	 */
	public Collection<Result> getResults() {
		if (this.results == null){ this.results=new ArrayList<>();}
		return results;
	}

	/**
	 * Set the phy throughput diagnostics results. 

        Each result object corresponds to unidirectional traffic between two PHY diagnostics-enabled nodes (so there are two such objects for  each such pair).
	 *
	 * @param results the input value
	 */
	public void  setResults(Collection<Result> results) {
		this.results = results;
	}

	/**
	 * Set the phy throughput diagnostics results. 

        Each result object corresponds to unidirectional traffic between two PHY diagnostics-enabled nodes (so there are two such objects for  each such pair).
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