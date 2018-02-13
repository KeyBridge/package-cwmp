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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.pcfconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is used in obtaining the PCF stats
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.PCFConfig.PCFPerformanceStats.")
@XmlRootElement(name = "PCFPerformanceStats")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.PCFConfig.PCFPerformanceStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class PCFPerformanceStats {

	/**
	 * Number of times the PCF was refused an A10 connection with an unspecified reason (A11 error code : 0x80)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureNoReason")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureNoReason;
	/**
	 * Number of times the PCF was refused an A10 connection with a reason "Admin Prohibited" (A11 error code : 0x81).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureAdminProhibit")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureAdminProhibit;
	/**
	 * Number of times the PCF was refused  an A10 connection with a reason "Insufficient Resources" (A11 error code: 0x82).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureInsuffResources")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureInsuffResources;
	/**
	 * Number of times the PCF was refused an A10 connection with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureFailedAuth")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureFailedAuth;
	/**
	 * Number of times the PCF was refused an A10 connection with a reason "Id Mismatch" (A11 error code: 0x85)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureIdMismatch")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureIdMismatch;
	/**
	 * Number of times the PCF was  refused an A10 connection with a reason "Malformed Request" (A11 error code: 0x86)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureMalformedReq")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureMalformedReq;
	/**
	 * Number of times  the PCF was refused an A10 connection with a reason "Unknown PDSN" (A11 error code: 0x88)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureUnknownPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureUnknownPDSN;
	/**
	 * Number of times the PCF was refused an A10 connection with a reason "Unsupported Vendor Id" (A11 error code: 0x89)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupFailureUnsuppVendId")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupFailureUnsuppVendId;
	/**
	 * Number of A10 closed by the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalA10ClosedByRnc")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalA10ClosedByRnc;
	/**
	 * Number of A10 closed by the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalA10ClosedByPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalA10ClosedByPDSN;
	/**
	 * Numebr of  A10 Pages initiated by PCFsucceeded.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalA10SuccessPages")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalA10SuccessPages;
	/**
	 * Numebr of  A10 Pages initiated by PCF failed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalA10FailedPages")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalA10FailedPages;
	/**
	 * Number of bytes received from the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalA10IngressBytes")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long totalA10IngressBytes;
	/**
	 * Number of bytes transmitted to the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalA10EgressBytes")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long totalA10EgressBytes;
	/**
	 * Number of A10 Registration updates received by the FAP PCF
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10RegUpdateReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10RegUpdateReceived;
	/**
	 * Number of  A10 Pages initiated by PCF dropped
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalA10DroppedPages")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalA10DroppedPages;

	public PCFPerformanceStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of times the PCF was refused an A10 connection with an unspecified reason (A11 error code : 0x80)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureNoReason() {
		return a10SetupFailureNoReason;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with an unspecified reason (A11 error code : 0x80)
	 *
	 * @since 2.0
	 * @param a10SetupFailureNoReason the input value
	 */
	public void  setA10SetupFailureNoReason(Long a10SetupFailureNoReason) {
		this.a10SetupFailureNoReason = a10SetupFailureNoReason;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with an unspecified reason (A11 error code : 0x80)
	 *
	 * @since 2.0
	 * @param a10SetupFailureNoReason the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureNoReason(Long a10SetupFailureNoReason) {
		this.a10SetupFailureNoReason = a10SetupFailureNoReason;
		return this;
	}

	/**
	 * Get the number of times the PCF was refused an A10 connection with a reason "Admin Prohibited" (A11 error code : 0x81).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureAdminProhibit() {
		return a10SetupFailureAdminProhibit;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Admin Prohibited" (A11 error code : 0x81).
	 *
	 * @since 2.0
	 * @param a10SetupFailureAdminProhibit the input value
	 */
	public void  setA10SetupFailureAdminProhibit(Long a10SetupFailureAdminProhibit) {
		this.a10SetupFailureAdminProhibit = a10SetupFailureAdminProhibit;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Admin Prohibited" (A11 error code : 0x81).
	 *
	 * @since 2.0
	 * @param a10SetupFailureAdminProhibit the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureAdminProhibit(Long a10SetupFailureAdminProhibit) {
		this.a10SetupFailureAdminProhibit = a10SetupFailureAdminProhibit;
		return this;
	}

	/**
	 * Get the number of times the PCF was refused  an A10 connection with a reason "Insufficient Resources" (A11 error code: 0x82).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureInsuffResources() {
		return a10SetupFailureInsuffResources;
	}

	/**
	 * Set the number of times the PCF was refused  an A10 connection with a reason "Insufficient Resources" (A11 error code: 0x82).
	 *
	 * @since 2.0
	 * @param a10SetupFailureInsuffResources the input value
	 */
	public void  setA10SetupFailureInsuffResources(Long a10SetupFailureInsuffResources) {
		this.a10SetupFailureInsuffResources = a10SetupFailureInsuffResources;
	}

	/**
	 * Set the number of times the PCF was refused  an A10 connection with a reason "Insufficient Resources" (A11 error code: 0x82).
	 *
	 * @since 2.0
	 * @param a10SetupFailureInsuffResources the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureInsuffResources(Long a10SetupFailureInsuffResources) {
		this.a10SetupFailureInsuffResources = a10SetupFailureInsuffResources;
		return this;
	}

	/**
	 * Get the number of times the PCF was refused an A10 connection with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureFailedAuth() {
		return a10SetupFailureFailedAuth;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83).
	 *
	 * @since 2.0
	 * @param a10SetupFailureFailedAuth the input value
	 */
	public void  setA10SetupFailureFailedAuth(Long a10SetupFailureFailedAuth) {
		this.a10SetupFailureFailedAuth = a10SetupFailureFailedAuth;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83).
	 *
	 * @since 2.0
	 * @param a10SetupFailureFailedAuth the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureFailedAuth(Long a10SetupFailureFailedAuth) {
		this.a10SetupFailureFailedAuth = a10SetupFailureFailedAuth;
		return this;
	}

	/**
	 * Get the number of times the PCF was refused an A10 connection with a reason "Id Mismatch" (A11 error code: 0x85)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureIdMismatch() {
		return a10SetupFailureIdMismatch;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Id Mismatch" (A11 error code: 0x85)
	 *
	 * @since 2.0
	 * @param a10SetupFailureIdMismatch the input value
	 */
	public void  setA10SetupFailureIdMismatch(Long a10SetupFailureIdMismatch) {
		this.a10SetupFailureIdMismatch = a10SetupFailureIdMismatch;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Id Mismatch" (A11 error code: 0x85)
	 *
	 * @since 2.0
	 * @param a10SetupFailureIdMismatch the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureIdMismatch(Long a10SetupFailureIdMismatch) {
		this.a10SetupFailureIdMismatch = a10SetupFailureIdMismatch;
		return this;
	}

	/**
	 * Get the number of times the PCF was  refused an A10 connection with a reason "Malformed Request" (A11 error code: 0x86)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureMalformedReq() {
		return a10SetupFailureMalformedReq;
	}

	/**
	 * Set the number of times the PCF was  refused an A10 connection with a reason "Malformed Request" (A11 error code: 0x86)
	 *
	 * @since 2.0
	 * @param a10SetupFailureMalformedReq the input value
	 */
	public void  setA10SetupFailureMalformedReq(Long a10SetupFailureMalformedReq) {
		this.a10SetupFailureMalformedReq = a10SetupFailureMalformedReq;
	}

	/**
	 * Set the number of times the PCF was  refused an A10 connection with a reason "Malformed Request" (A11 error code: 0x86)
	 *
	 * @since 2.0
	 * @param a10SetupFailureMalformedReq the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureMalformedReq(Long a10SetupFailureMalformedReq) {
		this.a10SetupFailureMalformedReq = a10SetupFailureMalformedReq;
		return this;
	}

	/**
	 * Get the number of times  the PCF was refused an A10 connection with a reason "Unknown PDSN" (A11 error code: 0x88)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureUnknownPDSN() {
		return a10SetupFailureUnknownPDSN;
	}

	/**
	 * Set the number of times  the PCF was refused an A10 connection with a reason "Unknown PDSN" (A11 error code: 0x88)
	 *
	 * @since 2.0
	 * @param a10SetupFailureUnknownPDSN the input value
	 */
	public void  setA10SetupFailureUnknownPDSN(Long a10SetupFailureUnknownPDSN) {
		this.a10SetupFailureUnknownPDSN = a10SetupFailureUnknownPDSN;
	}

	/**
	 * Set the number of times  the PCF was refused an A10 connection with a reason "Unknown PDSN" (A11 error code: 0x88)
	 *
	 * @since 2.0
	 * @param a10SetupFailureUnknownPDSN the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureUnknownPDSN(Long a10SetupFailureUnknownPDSN) {
		this.a10SetupFailureUnknownPDSN = a10SetupFailureUnknownPDSN;
		return this;
	}

	/**
	 * Get the number of times the PCF was refused an A10 connection with a reason "Unsupported Vendor Id" (A11 error code: 0x89)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupFailureUnsuppVendId() {
		return a10SetupFailureUnsuppVendId;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Unsupported Vendor Id" (A11 error code: 0x89)
	 *
	 * @since 2.0
	 * @param a10SetupFailureUnsuppVendId the input value
	 */
	public void  setA10SetupFailureUnsuppVendId(Long a10SetupFailureUnsuppVendId) {
		this.a10SetupFailureUnsuppVendId = a10SetupFailureUnsuppVendId;
	}

	/**
	 * Set the number of times the PCF was refused an A10 connection with a reason "Unsupported Vendor Id" (A11 error code: 0x89)
	 *
	 * @since 2.0
	 * @param a10SetupFailureUnsuppVendId the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10SetupFailureUnsuppVendId(Long a10SetupFailureUnsuppVendId) {
		this.a10SetupFailureUnsuppVendId = a10SetupFailureUnsuppVendId;
		return this;
	}

	/**
	 * Get the number of A10 closed by the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalA10ClosedByRnc() {
		return totalA10ClosedByRnc;
	}

	/**
	 * Set the number of A10 closed by the FAP RNC.
	 *
	 * @since 2.0
	 * @param totalA10ClosedByRnc the input value
	 */
	public void  setTotalA10ClosedByRnc(Long totalA10ClosedByRnc) {
		this.totalA10ClosedByRnc = totalA10ClosedByRnc;
	}

	/**
	 * Set the number of A10 closed by the FAP RNC.
	 *
	 * @since 2.0
	 * @param totalA10ClosedByRnc the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withTotalA10ClosedByRnc(Long totalA10ClosedByRnc) {
		this.totalA10ClosedByRnc = totalA10ClosedByRnc;
		return this;
	}

	/**
	 * Get the number of A10 closed by the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalA10ClosedByPDSN() {
		return totalA10ClosedByPDSN;
	}

	/**
	 * Set the number of A10 closed by the PDSN.
	 *
	 * @since 2.0
	 * @param totalA10ClosedByPDSN the input value
	 */
	public void  setTotalA10ClosedByPDSN(Long totalA10ClosedByPDSN) {
		this.totalA10ClosedByPDSN = totalA10ClosedByPDSN;
	}

	/**
	 * Set the number of A10 closed by the PDSN.
	 *
	 * @since 2.0
	 * @param totalA10ClosedByPDSN the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withTotalA10ClosedByPDSN(Long totalA10ClosedByPDSN) {
		this.totalA10ClosedByPDSN = totalA10ClosedByPDSN;
		return this;
	}

	/**
	 * Get the numebr of  A10 Pages initiated by PCFsucceeded.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalA10SuccessPages() {
		return totalA10SuccessPages;
	}

	/**
	 * Set the numebr of  A10 Pages initiated by PCFsucceeded.
	 *
	 * @since 2.0
	 * @param totalA10SuccessPages the input value
	 */
	public void  setTotalA10SuccessPages(Long totalA10SuccessPages) {
		this.totalA10SuccessPages = totalA10SuccessPages;
	}

	/**
	 * Set the numebr of  A10 Pages initiated by PCFsucceeded.
	 *
	 * @since 2.0
	 * @param totalA10SuccessPages the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withTotalA10SuccessPages(Long totalA10SuccessPages) {
		this.totalA10SuccessPages = totalA10SuccessPages;
		return this;
	}

	/**
	 * Get the numebr of  A10 Pages initiated by PCF failed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalA10FailedPages() {
		return totalA10FailedPages;
	}

	/**
	 * Set the numebr of  A10 Pages initiated by PCF failed.
	 *
	 * @since 2.0
	 * @param totalA10FailedPages the input value
	 */
	public void  setTotalA10FailedPages(Long totalA10FailedPages) {
		this.totalA10FailedPages = totalA10FailedPages;
	}

	/**
	 * Set the numebr of  A10 Pages initiated by PCF failed.
	 *
	 * @since 2.0
	 * @param totalA10FailedPages the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withTotalA10FailedPages(Long totalA10FailedPages) {
		this.totalA10FailedPages = totalA10FailedPages;
		return this;
	}

	/**
	 * Get the number of bytes received from the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalA10IngressBytes() {
		return totalA10IngressBytes;
	}

	/**
	 * Set the number of bytes received from the PDSN.
	 *
	 * @since 2.0
	 * @param totalA10IngressBytes the input value
	 */
	public void  setTotalA10IngressBytes(Long totalA10IngressBytes) {
		this.totalA10IngressBytes = totalA10IngressBytes;
	}

	/**
	 * Set the number of bytes received from the PDSN.
	 *
	 * @since 2.0
	 * @param totalA10IngressBytes the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withTotalA10IngressBytes(Long totalA10IngressBytes) {
		this.totalA10IngressBytes = totalA10IngressBytes;
		return this;
	}

	/**
	 * Get the number of bytes transmitted to the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalA10EgressBytes() {
		return totalA10EgressBytes;
	}

	/**
	 * Set the number of bytes transmitted to the PDSN
	 *
	 * @since 2.0
	 * @param totalA10EgressBytes the input value
	 */
	public void  setTotalA10EgressBytes(Long totalA10EgressBytes) {
		this.totalA10EgressBytes = totalA10EgressBytes;
	}

	/**
	 * Set the number of bytes transmitted to the PDSN
	 *
	 * @since 2.0
	 * @param totalA10EgressBytes the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withTotalA10EgressBytes(Long totalA10EgressBytes) {
		this.totalA10EgressBytes = totalA10EgressBytes;
		return this;
	}

	/**
	 * Get the number of A10 Registration updates received by the FAP PCF
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10RegUpdateReceived() {
		return a10RegUpdateReceived;
	}

	/**
	 * Set the number of A10 Registration updates received by the FAP PCF
	 *
	 * @since 2.0
	 * @param a10RegUpdateReceived the input value
	 */
	public void  setA10RegUpdateReceived(Long a10RegUpdateReceived) {
		this.a10RegUpdateReceived = a10RegUpdateReceived;
	}

	/**
	 * Set the number of A10 Registration updates received by the FAP PCF
	 *
	 * @since 2.0
	 * @param a10RegUpdateReceived the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withA10RegUpdateReceived(Long a10RegUpdateReceived) {
		this.a10RegUpdateReceived = a10RegUpdateReceived;
		return this;
	}

	/**
	 * Get the number of  A10 Pages initiated by PCF dropped
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalA10DroppedPages() {
		return totalA10DroppedPages;
	}

	/**
	 * Set the number of  A10 Pages initiated by PCF dropped
	 *
	 * @since 2.0
	 * @param totalA10DroppedPages the input value
	 */
	public void  setTotalA10DroppedPages(Long totalA10DroppedPages) {
		this.totalA10DroppedPages = totalA10DroppedPages;
	}

	/**
	 * Set the number of  A10 Pages initiated by PCF dropped
	 *
	 * @since 2.0
	 * @param totalA10DroppedPages the input value
	 * @return this instance
	 */
	public PCFPerformanceStats withTotalA10DroppedPages(Long totalA10DroppedPages) {
		this.totalA10DroppedPages = totalA10DroppedPages;
		return this;
	}

	//</editor-fold>

}