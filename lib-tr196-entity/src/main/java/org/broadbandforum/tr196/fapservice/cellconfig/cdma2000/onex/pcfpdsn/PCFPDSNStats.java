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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.pcfpdsn;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.IPAddress;

	/**
	 * This object is used in obtaining the PCF PDSN stats for each PDSN
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.PCFPDSNStats.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.PCFPDSN.PCFPDSNStats")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.PCFPDSN.PCFPDSNStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class PCFPDSNStats {

	/**
	 * Number of attempts the PCF made to establish an A10 connection with PDSN. If PCF fails establishing such a connection on this PDSN and goes on to use another PDSN for that connection, it will be counted as two setup attempts.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupAttemptsPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupAttemptsPDSN;
	/**
	 * Number of times PCF succeeded in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupSuccessesPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupSuccessesPDSN;
	/**
	 * Number of times PCF was blocked in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10SetupBlocksPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10SetupBlocksPDSN;
	/**
	 * Number ofA11 Registration Request denied with a reason "Id Mismatch" (A11 error code: 0x85) by the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedIdMismatchPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedIdMismatchPDSN;
	/**
	 * Number of A11 Registration Request denied with a reason "Unknown PDSN" (A11 error code: 0x88)by the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedUnknownPDSNPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedUnknownPDSNPDSN;
	/**
	 * Number of A11 Registration Request denied with no reason code  by the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedNoReasonPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedNoReasonPDSN;
	/**
	 * Number of A11 Registration Request denied with  a reason "Admin Prohibited" (A11 error code : 0x81) by the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedAdminProhibitPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedAdminProhibitPDSN;
	/**
	 * Number of A11 Registration Request denied with a reason "Insufficient Resources" (A11 error code: 0x82) by the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedInsuffResourcesPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedInsuffResourcesPDSN;
	/**
	 * Number of A11 Registration Request denied with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83) by the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedFailedAuthPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedFailedAuthPDSN;
	/**
	 * Number of A11 Registration Request denied with a reason "Malformed Request" (A11 error code: 0x86) by the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedMalformedReqPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedMalformedReqPDSN;
	/**
	 * Number ofA11 Registration Request denied with a reason "Unsupported Vendor Id" (A11 error code: 0x8D)by the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedUnsuppVendIdPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedUnsuppVendIdPDSN;
	/**
	 * Number ofA11 Registration Request denied with a reason "Reverse Tunnel Unavailable" (A11 error code: 0x89)by the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedReverseTunnelUnavailablePDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedReverseTunnelUnavailablePDSN;
	/**
	 * Number ofA11 Registration Request denied with a reason "Reverse Tunnel Tbit Not Set" (A11 error code: 0x8A)by the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedReverseTunnelTbitNotSetPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedReverseTunnelTbitNotSetPDSN;
	/**
	 * Number of A11 Registration Request denied with an unspecified reason (A11 error code : 0x80) by the PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegReqDeniedUnknownErrorCodePDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegReqDeniedUnknownErrorCodePDSN;
	/**
	 * Number of A11 Registration Requests retransmitted during A10 setup
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10RegReqForRegistrationRetransmissionsPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10RegReqForRegistrationRetransmissionsPDSN;
	/**
	 * Number of A11 Registration Requests retransmitted during A10 reregistration
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10RegReqForReRegistrationRetransmissionsPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10RegReqForReRegistrationRetransmissionsPDSN;
	/**
	 * Number of A11 Registration Requests retransmitted during A10 realease
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A10RegReqForReleaseRetransmissionsPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a10RegReqForReleaseRetransmissionsPDSN;
	/**
	 * The PDSN Number
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNNumberPDSNPerf")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 127)
	public Integer pdsNNumberPDSNPerf;
	/**
	 * The IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNipAddressPDSNPerf")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress pdsNipAddressPDSNPerf;

	public PCFPDSNStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of attempts the PCF made to establish an A10 connection with PDSN. If PCF fails establishing such a connection on this PDSN and goes on to use another PDSN for that connection, it will be counted as two setup attempts.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupAttemptsPDSN() {
		return a10SetupAttemptsPDSN;
	}

	/**
	 * Set the number of attempts the PCF made to establish an A10 connection with PDSN. If PCF fails establishing such a connection on this PDSN and goes on to use another PDSN for that connection, it will be counted as two setup attempts.
	 *
	 * @since 2.0
	 * @param a10SetupAttemptsPDSN the input value
	 */
	public void  setA10SetupAttemptsPDSN(Long a10SetupAttemptsPDSN) {
		this.a10SetupAttemptsPDSN = a10SetupAttemptsPDSN;
	}

	/**
	 * Set the number of attempts the PCF made to establish an A10 connection with PDSN. If PCF fails establishing such a connection on this PDSN and goes on to use another PDSN for that connection, it will be counted as two setup attempts.
	 *
	 * @since 2.0
	 * @param a10SetupAttemptsPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA10SetupAttemptsPDSN(Long a10SetupAttemptsPDSN) {
		this.a10SetupAttemptsPDSN = a10SetupAttemptsPDSN;
		return this;
	}

	/**
	 * Get the number of times PCF succeeded in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupSuccessesPDSN() {
		return a10SetupSuccessesPDSN;
	}

	/**
	 * Set the number of times PCF succeeded in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 * @param a10SetupSuccessesPDSN the input value
	 */
	public void  setA10SetupSuccessesPDSN(Long a10SetupSuccessesPDSN) {
		this.a10SetupSuccessesPDSN = a10SetupSuccessesPDSN;
	}

	/**
	 * Set the number of times PCF succeeded in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 * @param a10SetupSuccessesPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA10SetupSuccessesPDSN(Long a10SetupSuccessesPDSN) {
		this.a10SetupSuccessesPDSN = a10SetupSuccessesPDSN;
		return this;
	}

	/**
	 * Get the number of times PCF was blocked in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10SetupBlocksPDSN() {
		return a10SetupBlocksPDSN;
	}

	/**
	 * Set the number of times PCF was blocked in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 * @param a10SetupBlocksPDSN the input value
	 */
	public void  setA10SetupBlocksPDSN(Long a10SetupBlocksPDSN) {
		this.a10SetupBlocksPDSN = a10SetupBlocksPDSN;
	}

	/**
	 * Set the number of times PCF was blocked in establishing an A10 connection with this PDSN.
	 *
	 * @since 2.0
	 * @param a10SetupBlocksPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA10SetupBlocksPDSN(Long a10SetupBlocksPDSN) {
		this.a10SetupBlocksPDSN = a10SetupBlocksPDSN;
		return this;
	}

	/**
	 * Get the number ofA11 Registration Request denied with a reason "Id Mismatch" (A11 error code: 0x85) by the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedIdMismatchPDSN() {
		return a11RegReqDeniedIdMismatchPDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Id Mismatch" (A11 error code: 0x85) by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedIdMismatchPDSN the input value
	 */
	public void  setA11RegReqDeniedIdMismatchPDSN(Long a11RegReqDeniedIdMismatchPDSN) {
		this.a11RegReqDeniedIdMismatchPDSN = a11RegReqDeniedIdMismatchPDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Id Mismatch" (A11 error code: 0x85) by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedIdMismatchPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedIdMismatchPDSN(Long a11RegReqDeniedIdMismatchPDSN) {
		this.a11RegReqDeniedIdMismatchPDSN = a11RegReqDeniedIdMismatchPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Request denied with a reason "Unknown PDSN" (A11 error code: 0x88)by the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedUnknownPDSNPDSN() {
		return a11RegReqDeniedUnknownPDSNPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Unknown PDSN" (A11 error code: 0x88)by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedUnknownPDSNPDSN the input value
	 */
	public void  setA11RegReqDeniedUnknownPDSNPDSN(Long a11RegReqDeniedUnknownPDSNPDSN) {
		this.a11RegReqDeniedUnknownPDSNPDSN = a11RegReqDeniedUnknownPDSNPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Unknown PDSN" (A11 error code: 0x88)by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedUnknownPDSNPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedUnknownPDSNPDSN(Long a11RegReqDeniedUnknownPDSNPDSN) {
		this.a11RegReqDeniedUnknownPDSNPDSN = a11RegReqDeniedUnknownPDSNPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Request denied with no reason code  by the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedNoReasonPDSN() {
		return a11RegReqDeniedNoReasonPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with no reason code  by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedNoReasonPDSN the input value
	 */
	public void  setA11RegReqDeniedNoReasonPDSN(Long a11RegReqDeniedNoReasonPDSN) {
		this.a11RegReqDeniedNoReasonPDSN = a11RegReqDeniedNoReasonPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with no reason code  by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedNoReasonPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedNoReasonPDSN(Long a11RegReqDeniedNoReasonPDSN) {
		this.a11RegReqDeniedNoReasonPDSN = a11RegReqDeniedNoReasonPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Request denied with  a reason "Admin Prohibited" (A11 error code : 0x81) by the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedAdminProhibitPDSN() {
		return a11RegReqDeniedAdminProhibitPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with  a reason "Admin Prohibited" (A11 error code : 0x81) by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedAdminProhibitPDSN the input value
	 */
	public void  setA11RegReqDeniedAdminProhibitPDSN(Long a11RegReqDeniedAdminProhibitPDSN) {
		this.a11RegReqDeniedAdminProhibitPDSN = a11RegReqDeniedAdminProhibitPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with  a reason "Admin Prohibited" (A11 error code : 0x81) by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedAdminProhibitPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedAdminProhibitPDSN(Long a11RegReqDeniedAdminProhibitPDSN) {
		this.a11RegReqDeniedAdminProhibitPDSN = a11RegReqDeniedAdminProhibitPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Request denied with a reason "Insufficient Resources" (A11 error code: 0x82) by the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedInsuffResourcesPDSN() {
		return a11RegReqDeniedInsuffResourcesPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Insufficient Resources" (A11 error code: 0x82) by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedInsuffResourcesPDSN the input value
	 */
	public void  setA11RegReqDeniedInsuffResourcesPDSN(Long a11RegReqDeniedInsuffResourcesPDSN) {
		this.a11RegReqDeniedInsuffResourcesPDSN = a11RegReqDeniedInsuffResourcesPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Insufficient Resources" (A11 error code: 0x82) by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedInsuffResourcesPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedInsuffResourcesPDSN(Long a11RegReqDeniedInsuffResourcesPDSN) {
		this.a11RegReqDeniedInsuffResourcesPDSN = a11RegReqDeniedInsuffResourcesPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Request denied with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83) by the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedFailedAuthPDSN() {
		return a11RegReqDeniedFailedAuthPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83) by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedFailedAuthPDSN the input value
	 */
	public void  setA11RegReqDeniedFailedAuthPDSN(Long a11RegReqDeniedFailedAuthPDSN) {
		this.a11RegReqDeniedFailedAuthPDSN = a11RegReqDeniedFailedAuthPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Mobile Node Authentication Failure" (A11 error code: 0x83) by the PDSN.
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedFailedAuthPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedFailedAuthPDSN(Long a11RegReqDeniedFailedAuthPDSN) {
		this.a11RegReqDeniedFailedAuthPDSN = a11RegReqDeniedFailedAuthPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Request denied with a reason "Malformed Request" (A11 error code: 0x86) by the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedMalformedReqPDSN() {
		return a11RegReqDeniedMalformedReqPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Malformed Request" (A11 error code: 0x86) by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedMalformedReqPDSN the input value
	 */
	public void  setA11RegReqDeniedMalformedReqPDSN(Long a11RegReqDeniedMalformedReqPDSN) {
		this.a11RegReqDeniedMalformedReqPDSN = a11RegReqDeniedMalformedReqPDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with a reason "Malformed Request" (A11 error code: 0x86) by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedMalformedReqPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedMalformedReqPDSN(Long a11RegReqDeniedMalformedReqPDSN) {
		this.a11RegReqDeniedMalformedReqPDSN = a11RegReqDeniedMalformedReqPDSN;
		return this;
	}

	/**
	 * Get the number ofA11 Registration Request denied with a reason "Unsupported Vendor Id" (A11 error code: 0x8D)by the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedUnsuppVendIdPDSN() {
		return a11RegReqDeniedUnsuppVendIdPDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Unsupported Vendor Id" (A11 error code: 0x8D)by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedUnsuppVendIdPDSN the input value
	 */
	public void  setA11RegReqDeniedUnsuppVendIdPDSN(Long a11RegReqDeniedUnsuppVendIdPDSN) {
		this.a11RegReqDeniedUnsuppVendIdPDSN = a11RegReqDeniedUnsuppVendIdPDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Unsupported Vendor Id" (A11 error code: 0x8D)by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedUnsuppVendIdPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedUnsuppVendIdPDSN(Long a11RegReqDeniedUnsuppVendIdPDSN) {
		this.a11RegReqDeniedUnsuppVendIdPDSN = a11RegReqDeniedUnsuppVendIdPDSN;
		return this;
	}

	/**
	 * Get the number ofA11 Registration Request denied with a reason "Reverse Tunnel Unavailable" (A11 error code: 0x89)by the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedReverseTunnelUnavailablePDSN() {
		return a11RegReqDeniedReverseTunnelUnavailablePDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Reverse Tunnel Unavailable" (A11 error code: 0x89)by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedReverseTunnelUnavailablePDSN the input value
	 */
	public void  setA11RegReqDeniedReverseTunnelUnavailablePDSN(Long a11RegReqDeniedReverseTunnelUnavailablePDSN) {
		this.a11RegReqDeniedReverseTunnelUnavailablePDSN = a11RegReqDeniedReverseTunnelUnavailablePDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Reverse Tunnel Unavailable" (A11 error code: 0x89)by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedReverseTunnelUnavailablePDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedReverseTunnelUnavailablePDSN(Long a11RegReqDeniedReverseTunnelUnavailablePDSN) {
		this.a11RegReqDeniedReverseTunnelUnavailablePDSN = a11RegReqDeniedReverseTunnelUnavailablePDSN;
		return this;
	}

	/**
	 * Get the number ofA11 Registration Request denied with a reason "Reverse Tunnel Tbit Not Set" (A11 error code: 0x8A)by the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedReverseTunnelTbitNotSetPDSN() {
		return a11RegReqDeniedReverseTunnelTbitNotSetPDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Reverse Tunnel Tbit Not Set" (A11 error code: 0x8A)by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedReverseTunnelTbitNotSetPDSN the input value
	 */
	public void  setA11RegReqDeniedReverseTunnelTbitNotSetPDSN(Long a11RegReqDeniedReverseTunnelTbitNotSetPDSN) {
		this.a11RegReqDeniedReverseTunnelTbitNotSetPDSN = a11RegReqDeniedReverseTunnelTbitNotSetPDSN;
	}

	/**
	 * Set the number ofA11 Registration Request denied with a reason "Reverse Tunnel Tbit Not Set" (A11 error code: 0x8A)by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedReverseTunnelTbitNotSetPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedReverseTunnelTbitNotSetPDSN(Long a11RegReqDeniedReverseTunnelTbitNotSetPDSN) {
		this.a11RegReqDeniedReverseTunnelTbitNotSetPDSN = a11RegReqDeniedReverseTunnelTbitNotSetPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Request denied with an unspecified reason (A11 error code : 0x80) by the PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegReqDeniedUnknownErrorCodePDSN() {
		return a11RegReqDeniedUnknownErrorCodePDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with an unspecified reason (A11 error code : 0x80) by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedUnknownErrorCodePDSN the input value
	 */
	public void  setA11RegReqDeniedUnknownErrorCodePDSN(Long a11RegReqDeniedUnknownErrorCodePDSN) {
		this.a11RegReqDeniedUnknownErrorCodePDSN = a11RegReqDeniedUnknownErrorCodePDSN;
	}

	/**
	 * Set the number of A11 Registration Request denied with an unspecified reason (A11 error code : 0x80) by the PDSN
	 *
	 * @since 2.0
	 * @param a11RegReqDeniedUnknownErrorCodePDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA11RegReqDeniedUnknownErrorCodePDSN(Long a11RegReqDeniedUnknownErrorCodePDSN) {
		this.a11RegReqDeniedUnknownErrorCodePDSN = a11RegReqDeniedUnknownErrorCodePDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Requests retransmitted during A10 setup
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10RegReqForRegistrationRetransmissionsPDSN() {
		return a10RegReqForRegistrationRetransmissionsPDSN;
	}

	/**
	 * Set the number of A11 Registration Requests retransmitted during A10 setup
	 *
	 * @since 2.0
	 * @param a10RegReqForRegistrationRetransmissionsPDSN the input value
	 */
	public void  setA10RegReqForRegistrationRetransmissionsPDSN(Long a10RegReqForRegistrationRetransmissionsPDSN) {
		this.a10RegReqForRegistrationRetransmissionsPDSN = a10RegReqForRegistrationRetransmissionsPDSN;
	}

	/**
	 * Set the number of A11 Registration Requests retransmitted during A10 setup
	 *
	 * @since 2.0
	 * @param a10RegReqForRegistrationRetransmissionsPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA10RegReqForRegistrationRetransmissionsPDSN(Long a10RegReqForRegistrationRetransmissionsPDSN) {
		this.a10RegReqForRegistrationRetransmissionsPDSN = a10RegReqForRegistrationRetransmissionsPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Requests retransmitted during A10 reregistration
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10RegReqForReRegistrationRetransmissionsPDSN() {
		return a10RegReqForReRegistrationRetransmissionsPDSN;
	}

	/**
	 * Set the number of A11 Registration Requests retransmitted during A10 reregistration
	 *
	 * @since 2.0
	 * @param a10RegReqForReRegistrationRetransmissionsPDSN the input value
	 */
	public void  setA10RegReqForReRegistrationRetransmissionsPDSN(Long a10RegReqForReRegistrationRetransmissionsPDSN) {
		this.a10RegReqForReRegistrationRetransmissionsPDSN = a10RegReqForReRegistrationRetransmissionsPDSN;
	}

	/**
	 * Set the number of A11 Registration Requests retransmitted during A10 reregistration
	 *
	 * @since 2.0
	 * @param a10RegReqForReRegistrationRetransmissionsPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA10RegReqForReRegistrationRetransmissionsPDSN(Long a10RegReqForReRegistrationRetransmissionsPDSN) {
		this.a10RegReqForReRegistrationRetransmissionsPDSN = a10RegReqForReRegistrationRetransmissionsPDSN;
		return this;
	}

	/**
	 * Get the number of A11 Registration Requests retransmitted during A10 realease
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA10RegReqForReleaseRetransmissionsPDSN() {
		return a10RegReqForReleaseRetransmissionsPDSN;
	}

	/**
	 * Set the number of A11 Registration Requests retransmitted during A10 realease
	 *
	 * @since 2.0
	 * @param a10RegReqForReleaseRetransmissionsPDSN the input value
	 */
	public void  setA10RegReqForReleaseRetransmissionsPDSN(Long a10RegReqForReleaseRetransmissionsPDSN) {
		this.a10RegReqForReleaseRetransmissionsPDSN = a10RegReqForReleaseRetransmissionsPDSN;
	}

	/**
	 * Set the number of A11 Registration Requests retransmitted during A10 realease
	 *
	 * @since 2.0
	 * @param a10RegReqForReleaseRetransmissionsPDSN the input value
	 * @return this instance
	 */
	public PCFPDSNStats withA10RegReqForReleaseRetransmissionsPDSN(Long a10RegReqForReleaseRetransmissionsPDSN) {
		this.a10RegReqForReleaseRetransmissionsPDSN = a10RegReqForReleaseRetransmissionsPDSN;
		return this;
	}

	/**
	 * Get the PDSN Number
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPdsNNumberPDSNPerf() {
		return pdsNNumberPDSNPerf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberPDSNPerf the input value
	 */
	public void  setPdsNNumberPDSNPerf(Integer pdsNNumberPDSNPerf) {
		this.pdsNNumberPDSNPerf = pdsNNumberPDSNPerf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberPDSNPerf the input value
	 * @return this instance
	 */
	public PCFPDSNStats withPdsNNumberPDSNPerf(Integer pdsNNumberPDSNPerf) {
		this.pdsNNumberPDSNPerf = pdsNNumberPDSNPerf;
		return this;
	}

	/**
	 * Get the IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getPdsNipAddressPDSNPerf() {
		return pdsNipAddressPDSNPerf;
	}

	/**
	 * Set the IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNipAddressPDSNPerf the input value
	 */
	public void  setPdsNipAddressPDSNPerf(IPAddress pdsNipAddressPDSNPerf) {
		this.pdsNipAddressPDSNPerf = pdsNipAddressPDSNPerf;
	}

	/**
	 * Set the IP Address of the PDSN for which the PCF PDSN stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNipAddressPDSNPerf the input value
	 * @return this instance
	 */
	public PCFPDSNStats withPdsNipAddressPDSNPerf(IPAddress pdsNipAddressPDSNPerf) {
		this.pdsNipAddressPDSNPerf = pdsNipAddressPDSNPerf;
		return this;
	}

	//</editor-fold>

}