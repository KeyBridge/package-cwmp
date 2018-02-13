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
package org.broadbandforum.tr135.stbservice.components.frontend.ip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Parameters related to RTP AVPF configuration as defined in {{bibref|RFC4585}} and {{bibref|RFC4588}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.RTPAVPF.")
@XmlRootElement(name = "RTPAVPF")
@XmlType(name = "STBService.Components.FrontEnd.IP.RTPAVPF")
@XmlAccessorType(XmlAccessType.FIELD)
public class RTPAVPF {

	/**
	 * Enables or disables RTP/AVPF receiver report generation.

When set to {{true}}, enables the error correction operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the error correction operation.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The operation mode of the Error Correction mechanism. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled, the STB decides whether or not to run the Error Correction operation (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the Error Correction operation.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "OperationMode")
	@CWMPParameter(access = "readWrite")
	public String operationMode;
	/**
	 * The status of RTP/AVPF operation. {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ECOperationStatus")
	public String ecoperationStatus;
	/**
	 * The status of RTP/AVPF receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Time in milliseconds the receiver shall wait for a retransmitted packet before considering it to be lost.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RetransmitTimeout")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long retransmitTimeout;
	/**
	 * Minimum number of lost packets the receiver shall wait for before generating a retransmission request.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinLossPackets")
	@CWMPParameter(access = "readWrite")
	public Long minLossPackets;
	/**
	 * Maximum time in milliseconds the receiver shall wait between a lost packet and the generation of a retransmission request.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxReportTime")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long maxReportTime;
	/**
	 * Maximum number of consecutive lost packets for which the receiver shall attempt recovery.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxLossBurst")
	@CWMPParameter(access = "readWrite")
	public Long maxLossBurst;

	public RTPAVPF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables RTP/AVPF receiver report generation.

When set to {{true}}, enables the error correction operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the error correction operation.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables RTP/AVPF receiver report generation.

When set to {{true}}, enables the error correction operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the error correction operation.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables RTP/AVPF receiver report generation.

When set to {{true}}, enables the error correction operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the error correction operation.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public RTPAVPF withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the operation mode of the Error Correction mechanism. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled, the STB decides whether or not to run the Error Correction operation (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the Error Correction operation.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getOperationMode() {
		return operationMode;
	}

	/**
	 * Set the operation mode of the Error Correction mechanism. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled, the STB decides whether or not to run the Error Correction operation (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the Error Correction operation.
	 *
	 * @since 1.1
	 * @param operationMode the input value
	 */
	public void  setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	/**
	 * Set the operation mode of the Error Correction mechanism. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled, the STB decides whether or not to run the Error Correction operation (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the Error Correction operation.
	 *
	 * @since 1.1
	 * @param operationMode the input value
	 * @return this instance
	 */
	public RTPAVPF withOperationMode(String operationMode) {
		this.operationMode = operationMode;
		return this;
	}

	/**
	 * Get the status of RTP/AVPF operation. {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getEcoperationStatus() {
		return ecoperationStatus;
	}

	/**
	 * Set the status of RTP/AVPF operation. {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param ecoperationStatus the input value
	 */
	public void  setEcoperationStatus(String ecoperationStatus) {
		this.ecoperationStatus = ecoperationStatus;
	}

	/**
	 * Set the status of RTP/AVPF operation. {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param ecoperationStatus the input value
	 * @return this instance
	 */
	public RTPAVPF withEcoperationStatus(String ecoperationStatus) {
		this.ecoperationStatus = ecoperationStatus;
		return this;
	}

	/**
	 * Get the status of RTP/AVPF receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of RTP/AVPF receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of RTP/AVPF receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public RTPAVPF withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the time in milliseconds the receiver shall wait for a retransmitted packet before considering it to be lost.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getRetransmitTimeout() {
		return retransmitTimeout;
	}

	/**
	 * Set the time in milliseconds the receiver shall wait for a retransmitted packet before considering it to be lost.
	 *
	 * @since 1.0
	 * @param retransmitTimeout the input value
	 */
	public void  setRetransmitTimeout(Long retransmitTimeout) {
		this.retransmitTimeout = retransmitTimeout;
	}

	/**
	 * Set the time in milliseconds the receiver shall wait for a retransmitted packet before considering it to be lost.
	 *
	 * @since 1.0
	 * @param retransmitTimeout the input value
	 * @return this instance
	 */
	public RTPAVPF withRetransmitTimeout(Long retransmitTimeout) {
		this.retransmitTimeout = retransmitTimeout;
		return this;
	}

	/**
	 * Get the minimum number of lost packets the receiver shall wait for before generating a retransmission request.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinLossPackets() {
		return minLossPackets;
	}

	/**
	 * Set the minimum number of lost packets the receiver shall wait for before generating a retransmission request.
	 *
	 * @since 1.0
	 * @param minLossPackets the input value
	 */
	public void  setMinLossPackets(Long minLossPackets) {
		this.minLossPackets = minLossPackets;
	}

	/**
	 * Set the minimum number of lost packets the receiver shall wait for before generating a retransmission request.
	 *
	 * @since 1.0
	 * @param minLossPackets the input value
	 * @return this instance
	 */
	public RTPAVPF withMinLossPackets(Long minLossPackets) {
		this.minLossPackets = minLossPackets;
		return this;
	}

	/**
	 * Get the maximum time in milliseconds the receiver shall wait between a lost packet and the generation of a retransmission request.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxReportTime() {
		return maxReportTime;
	}

	/**
	 * Set the maximum time in milliseconds the receiver shall wait between a lost packet and the generation of a retransmission request.
	 *
	 * @since 1.0
	 * @param maxReportTime the input value
	 */
	public void  setMaxReportTime(Long maxReportTime) {
		this.maxReportTime = maxReportTime;
	}

	/**
	 * Set the maximum time in milliseconds the receiver shall wait between a lost packet and the generation of a retransmission request.
	 *
	 * @since 1.0
	 * @param maxReportTime the input value
	 * @return this instance
	 */
	public RTPAVPF withMaxReportTime(Long maxReportTime) {
		this.maxReportTime = maxReportTime;
		return this;
	}

	/**
	 * Get the maximum number of consecutive lost packets for which the receiver shall attempt recovery.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxLossBurst() {
		return maxLossBurst;
	}

	/**
	 * Set the maximum number of consecutive lost packets for which the receiver shall attempt recovery.
	 *
	 * @since 1.0
	 * @param maxLossBurst the input value
	 */
	public void  setMaxLossBurst(Long maxLossBurst) {
		this.maxLossBurst = maxLossBurst;
	}

	/**
	 * Set the maximum number of consecutive lost packets for which the receiver shall attempt recovery.
	 *
	 * @since 1.0
	 * @param maxLossBurst the input value
	 * @return this instance
	 */
	public RTPAVPF withMaxLossBurst(Long maxLossBurst) {
		this.maxLossBurst = maxLossBurst;
		return this;
	}

	//</editor-fold>

}