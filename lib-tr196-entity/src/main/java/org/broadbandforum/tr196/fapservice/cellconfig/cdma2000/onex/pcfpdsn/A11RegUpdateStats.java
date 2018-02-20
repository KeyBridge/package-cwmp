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
	 * This object is used in obtaining the A11 Registration Update stats for each PDSN
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.A11RegUpdateStats.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.PCFPDSN.A11RegUpdateStats")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.PCFPDSN.A11RegUpdateStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class A11RegUpdateStats {

	/**
	 * The PDSN Number
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNNumberRegUpdatePerf")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 127)
	public Integer pdsNNumberRegUpdatePerf;
	/**
	 * The IP Address of the PDSN for which the A11 Reg Update stats is obtained
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNIPAddressRegUpdatePerf")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress pdsNIPAddressRegUpdatePerf;
	/**
	 * Number of A10 Reg-update messages receieved from a PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateReceivedPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateReceivedPDSN;
	/**
	 * Number of A10 Reg-Update messages receieved from a PDSN that failed ID validation
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateIDCheckFailPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateIDCheckFailPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN that failed Authentication
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateAuthCheckFailPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateAuthCheckFailPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with unknown PSI
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateForUnknownPSIPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateForUnknownPSIPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with unspecified reason code
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateUnspecifiedReasonPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateUnspecifiedReasonPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "PPP Timeout"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdatePppTimeoutPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdatePppTimeoutPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "Registration Timeout"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateRegistrationTimeoutPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateRegistrationTimeoutPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN Error"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdatePDSNErrorPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdatePDSNErrorPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PCF Handoff"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateInterPCFHandoffPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateInterPCFHandoffPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PDSN Handoff"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateInterPDSNHandoffPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateInterPDSNHandoffPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN OAMP Intervention"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdatePDSNOAMPInterventionPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdatePDSNOAMPInterventionPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "Accounting Error"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateAccountingErrorPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateAccountingErrorPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  reason code "User Failed Authentication"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateUserFailedAuthenticationPDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateUserFailedAuthenticationPDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  Unknown Cause Code
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateUnknownCauseCodePDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateUnknownCauseCodePDSN;
	/**
	 * Number of A10 Reg-Update messages received from a PDSN with  PDSN Code Not Included
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A11RegUpdateWithoutReasonCodePDSN")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a11RegUpdateWithoutReasonCodePDSN;

	public A11RegUpdateStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the PDSN Number
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPdsNNumberRegUpdatePerf() {
		return pdsNNumberRegUpdatePerf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberRegUpdatePerf the input value
	 */
	public void  setPdsNNumberRegUpdatePerf(Integer pdsNNumberRegUpdatePerf) {
		this.pdsNNumberRegUpdatePerf = pdsNNumberRegUpdatePerf;
	}

	/**
	 * Set the PDSN Number
	 *
	 * @since 2.0
	 * @param pdsNNumberRegUpdatePerf the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withPdsNNumberRegUpdatePerf(Integer pdsNNumberRegUpdatePerf) {
		this.pdsNNumberRegUpdatePerf = pdsNNumberRegUpdatePerf;
		return this;
	}

	/**
	 * Get the IP Address of the PDSN for which the A11 Reg Update stats is obtained
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getPdsNIPAddressRegUpdatePerf() {
		return pdsNIPAddressRegUpdatePerf;
	}

	/**
	 * Set the IP Address of the PDSN for which the A11 Reg Update stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNIPAddressRegUpdatePerf the input value
	 */
	public void  setPdsNIPAddressRegUpdatePerf(IPAddress pdsNIPAddressRegUpdatePerf) {
		this.pdsNIPAddressRegUpdatePerf = pdsNIPAddressRegUpdatePerf;
	}

	/**
	 * Set the IP Address of the PDSN for which the A11 Reg Update stats is obtained
	 *
	 * @since 2.0
	 * @param pdsNIPAddressRegUpdatePerf the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withPdsNIPAddressRegUpdatePerf(IPAddress pdsNIPAddressRegUpdatePerf) {
		this.pdsNIPAddressRegUpdatePerf = pdsNIPAddressRegUpdatePerf;
		return this;
	}

	/**
	 * Get the number of A10 Reg-update messages receieved from a PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateReceivedPDSN() {
		return a11RegUpdateReceivedPDSN;
	}

	/**
	 * Set the number of A10 Reg-update messages receieved from a PDSN
	 *
	 * @since 2.0
	 * @param a11RegUpdateReceivedPDSN the input value
	 */
	public void  setA11RegUpdateReceivedPDSN(Long a11RegUpdateReceivedPDSN) {
		this.a11RegUpdateReceivedPDSN = a11RegUpdateReceivedPDSN;
	}

	/**
	 * Set the number of A10 Reg-update messages receieved from a PDSN
	 *
	 * @since 2.0
	 * @param a11RegUpdateReceivedPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateReceivedPDSN(Long a11RegUpdateReceivedPDSN) {
		this.a11RegUpdateReceivedPDSN = a11RegUpdateReceivedPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages receieved from a PDSN that failed ID validation
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateIDCheckFailPDSN() {
		return a11RegUpdateIDCheckFailPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages receieved from a PDSN that failed ID validation
	 *
	 * @since 2.0
	 * @param a11RegUpdateIDCheckFailPDSN the input value
	 */
	public void  setA11RegUpdateIDCheckFailPDSN(Long a11RegUpdateIDCheckFailPDSN) {
		this.a11RegUpdateIDCheckFailPDSN = a11RegUpdateIDCheckFailPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages receieved from a PDSN that failed ID validation
	 *
	 * @since 2.0
	 * @param a11RegUpdateIDCheckFailPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateIDCheckFailPDSN(Long a11RegUpdateIDCheckFailPDSN) {
		this.a11RegUpdateIDCheckFailPDSN = a11RegUpdateIDCheckFailPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN that failed Authentication
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateAuthCheckFailPDSN() {
		return a11RegUpdateAuthCheckFailPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN that failed Authentication
	 *
	 * @since 2.0
	 * @param a11RegUpdateAuthCheckFailPDSN the input value
	 */
	public void  setA11RegUpdateAuthCheckFailPDSN(Long a11RegUpdateAuthCheckFailPDSN) {
		this.a11RegUpdateAuthCheckFailPDSN = a11RegUpdateAuthCheckFailPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN that failed Authentication
	 *
	 * @since 2.0
	 * @param a11RegUpdateAuthCheckFailPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateAuthCheckFailPDSN(Long a11RegUpdateAuthCheckFailPDSN) {
		this.a11RegUpdateAuthCheckFailPDSN = a11RegUpdateAuthCheckFailPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with unknown PSI
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateForUnknownPSIPDSN() {
		return a11RegUpdateForUnknownPSIPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with unknown PSI
	 *
	 * @since 2.0
	 * @param a11RegUpdateForUnknownPSIPDSN the input value
	 */
	public void  setA11RegUpdateForUnknownPSIPDSN(Long a11RegUpdateForUnknownPSIPDSN) {
		this.a11RegUpdateForUnknownPSIPDSN = a11RegUpdateForUnknownPSIPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with unknown PSI
	 *
	 * @since 2.0
	 * @param a11RegUpdateForUnknownPSIPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateForUnknownPSIPDSN(Long a11RegUpdateForUnknownPSIPDSN) {
		this.a11RegUpdateForUnknownPSIPDSN = a11RegUpdateForUnknownPSIPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with unspecified reason code
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateUnspecifiedReasonPDSN() {
		return a11RegUpdateUnspecifiedReasonPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with unspecified reason code
	 *
	 * @since 2.0
	 * @param a11RegUpdateUnspecifiedReasonPDSN the input value
	 */
	public void  setA11RegUpdateUnspecifiedReasonPDSN(Long a11RegUpdateUnspecifiedReasonPDSN) {
		this.a11RegUpdateUnspecifiedReasonPDSN = a11RegUpdateUnspecifiedReasonPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with unspecified reason code
	 *
	 * @since 2.0
	 * @param a11RegUpdateUnspecifiedReasonPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateUnspecifiedReasonPDSN(Long a11RegUpdateUnspecifiedReasonPDSN) {
		this.a11RegUpdateUnspecifiedReasonPDSN = a11RegUpdateUnspecifiedReasonPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "PPP Timeout"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdatePppTimeoutPDSN() {
		return a11RegUpdatePppTimeoutPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "PPP Timeout"
	 *
	 * @since 2.0
	 * @param a11RegUpdatePppTimeoutPDSN the input value
	 */
	public void  setA11RegUpdatePppTimeoutPDSN(Long a11RegUpdatePppTimeoutPDSN) {
		this.a11RegUpdatePppTimeoutPDSN = a11RegUpdatePppTimeoutPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "PPP Timeout"
	 *
	 * @since 2.0
	 * @param a11RegUpdatePppTimeoutPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdatePppTimeoutPDSN(Long a11RegUpdatePppTimeoutPDSN) {
		this.a11RegUpdatePppTimeoutPDSN = a11RegUpdatePppTimeoutPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "Registration Timeout"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateRegistrationTimeoutPDSN() {
		return a11RegUpdateRegistrationTimeoutPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Registration Timeout"
	 *
	 * @since 2.0
	 * @param a11RegUpdateRegistrationTimeoutPDSN the input value
	 */
	public void  setA11RegUpdateRegistrationTimeoutPDSN(Long a11RegUpdateRegistrationTimeoutPDSN) {
		this.a11RegUpdateRegistrationTimeoutPDSN = a11RegUpdateRegistrationTimeoutPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Registration Timeout"
	 *
	 * @since 2.0
	 * @param a11RegUpdateRegistrationTimeoutPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateRegistrationTimeoutPDSN(Long a11RegUpdateRegistrationTimeoutPDSN) {
		this.a11RegUpdateRegistrationTimeoutPDSN = a11RegUpdateRegistrationTimeoutPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN Error"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdatePDSNErrorPDSN() {
		return a11RegUpdatePDSNErrorPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN Error"
	 *
	 * @since 2.0
	 * @param a11RegUpdatePDSNErrorPDSN the input value
	 */
	public void  setA11RegUpdatePDSNErrorPDSN(Long a11RegUpdatePDSNErrorPDSN) {
		this.a11RegUpdatePDSNErrorPDSN = a11RegUpdatePDSNErrorPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN Error"
	 *
	 * @since 2.0
	 * @param a11RegUpdatePDSNErrorPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdatePDSNErrorPDSN(Long a11RegUpdatePDSNErrorPDSN) {
		this.a11RegUpdatePDSNErrorPDSN = a11RegUpdatePDSNErrorPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PCF Handoff"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateInterPCFHandoffPDSN() {
		return a11RegUpdateInterPCFHandoffPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PCF Handoff"
	 *
	 * @since 2.0
	 * @param a11RegUpdateInterPCFHandoffPDSN the input value
	 */
	public void  setA11RegUpdateInterPCFHandoffPDSN(Long a11RegUpdateInterPCFHandoffPDSN) {
		this.a11RegUpdateInterPCFHandoffPDSN = a11RegUpdateInterPCFHandoffPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PCF Handoff"
	 *
	 * @since 2.0
	 * @param a11RegUpdateInterPCFHandoffPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateInterPCFHandoffPDSN(Long a11RegUpdateInterPCFHandoffPDSN) {
		this.a11RegUpdateInterPCFHandoffPDSN = a11RegUpdateInterPCFHandoffPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PDSN Handoff"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateInterPDSNHandoffPDSN() {
		return a11RegUpdateInterPDSNHandoffPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PDSN Handoff"
	 *
	 * @since 2.0
	 * @param a11RegUpdateInterPDSNHandoffPDSN the input value
	 */
	public void  setA11RegUpdateInterPDSNHandoffPDSN(Long a11RegUpdateInterPDSNHandoffPDSN) {
		this.a11RegUpdateInterPDSNHandoffPDSN = a11RegUpdateInterPDSNHandoffPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Inter PDSN Handoff"
	 *
	 * @since 2.0
	 * @param a11RegUpdateInterPDSNHandoffPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateInterPDSNHandoffPDSN(Long a11RegUpdateInterPDSNHandoffPDSN) {
		this.a11RegUpdateInterPDSNHandoffPDSN = a11RegUpdateInterPDSNHandoffPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN OAMP Intervention"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdatePDSNOAMPInterventionPDSN() {
		return a11RegUpdatePDSNOAMPInterventionPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN OAMP Intervention"
	 *
	 * @since 2.0
	 * @param a11RegUpdatePDSNOAMPInterventionPDSN the input value
	 */
	public void  setA11RegUpdatePDSNOAMPInterventionPDSN(Long a11RegUpdatePDSNOAMPInterventionPDSN) {
		this.a11RegUpdatePDSNOAMPInterventionPDSN = a11RegUpdatePDSNOAMPInterventionPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "PDSN OAMP Intervention"
	 *
	 * @since 2.0
	 * @param a11RegUpdatePDSNOAMPInterventionPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdatePDSNOAMPInterventionPDSN(Long a11RegUpdatePDSNOAMPInterventionPDSN) {
		this.a11RegUpdatePDSNOAMPInterventionPDSN = a11RegUpdatePDSNOAMPInterventionPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "Accounting Error"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateAccountingErrorPDSN() {
		return a11RegUpdateAccountingErrorPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Accounting Error"
	 *
	 * @since 2.0
	 * @param a11RegUpdateAccountingErrorPDSN the input value
	 */
	public void  setA11RegUpdateAccountingErrorPDSN(Long a11RegUpdateAccountingErrorPDSN) {
		this.a11RegUpdateAccountingErrorPDSN = a11RegUpdateAccountingErrorPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "Accounting Error"
	 *
	 * @since 2.0
	 * @param a11RegUpdateAccountingErrorPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateAccountingErrorPDSN(Long a11RegUpdateAccountingErrorPDSN) {
		this.a11RegUpdateAccountingErrorPDSN = a11RegUpdateAccountingErrorPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  reason code "User Failed Authentication"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateUserFailedAuthenticationPDSN() {
		return a11RegUpdateUserFailedAuthenticationPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "User Failed Authentication"
	 *
	 * @since 2.0
	 * @param a11RegUpdateUserFailedAuthenticationPDSN the input value
	 */
	public void  setA11RegUpdateUserFailedAuthenticationPDSN(Long a11RegUpdateUserFailedAuthenticationPDSN) {
		this.a11RegUpdateUserFailedAuthenticationPDSN = a11RegUpdateUserFailedAuthenticationPDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  reason code "User Failed Authentication"
	 *
	 * @since 2.0
	 * @param a11RegUpdateUserFailedAuthenticationPDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateUserFailedAuthenticationPDSN(Long a11RegUpdateUserFailedAuthenticationPDSN) {
		this.a11RegUpdateUserFailedAuthenticationPDSN = a11RegUpdateUserFailedAuthenticationPDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  Unknown Cause Code
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateUnknownCauseCodePDSN() {
		return a11RegUpdateUnknownCauseCodePDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  Unknown Cause Code
	 *
	 * @since 2.0
	 * @param a11RegUpdateUnknownCauseCodePDSN the input value
	 */
	public void  setA11RegUpdateUnknownCauseCodePDSN(Long a11RegUpdateUnknownCauseCodePDSN) {
		this.a11RegUpdateUnknownCauseCodePDSN = a11RegUpdateUnknownCauseCodePDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  Unknown Cause Code
	 *
	 * @since 2.0
	 * @param a11RegUpdateUnknownCauseCodePDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateUnknownCauseCodePDSN(Long a11RegUpdateUnknownCauseCodePDSN) {
		this.a11RegUpdateUnknownCauseCodePDSN = a11RegUpdateUnknownCauseCodePDSN;
		return this;
	}

	/**
	 * Get the number of A10 Reg-Update messages received from a PDSN with  PDSN Code Not Included
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA11RegUpdateWithoutReasonCodePDSN() {
		return a11RegUpdateWithoutReasonCodePDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  PDSN Code Not Included
	 *
	 * @since 2.0
	 * @param a11RegUpdateWithoutReasonCodePDSN the input value
	 */
	public void  setA11RegUpdateWithoutReasonCodePDSN(Long a11RegUpdateWithoutReasonCodePDSN) {
		this.a11RegUpdateWithoutReasonCodePDSN = a11RegUpdateWithoutReasonCodePDSN;
	}

	/**
	 * Set the number of A10 Reg-Update messages received from a PDSN with  PDSN Code Not Included
	 *
	 * @since 2.0
	 * @param a11RegUpdateWithoutReasonCodePDSN the input value
	 * @return this instance
	 */
	public A11RegUpdateStats withA11RegUpdateWithoutReasonCodePDSN(Long a11RegUpdateWithoutReasonCodePDSN) {
		this.a11RegUpdateWithoutReasonCodePDSN = a11RegUpdateWithoutReasonCodePDSN;
		return this;
	}

	//</editor-fold>

}