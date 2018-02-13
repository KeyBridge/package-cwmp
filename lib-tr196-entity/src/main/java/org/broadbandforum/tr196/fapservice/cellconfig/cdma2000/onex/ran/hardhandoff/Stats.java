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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.hardhandoff;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains statistics for all Handouts of the 1x FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.HardHandoff.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.HardHandoff.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * Total number of Handout Required messages sent to the MSC
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxHORequired")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long txhORequired;
	/**
	 * Total number of Handout Command messegaes received from the MSC
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxHOCommand")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long rxhOCommand;
	/**
	 * Total number of HO required requests rejected by the MSC
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HORequiredRejected")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long horequiredRejected;
	/**
	 * Total number of HO required requests for which no response received from the MSC
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HORequiredUnanswered")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long horequiredUnanswered;
	/**
	 * Total number UHDMs sent to mobiles
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxUHDM")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long txuHDM;
	/**
	 * Total number of MSAcks received from the mobile  in response to UHDM
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxNSAck")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long rxnSAck;
	/**
	 * Total number of Handout attempts declared as failure
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HOFailureCount")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long hofailureCount;
	/**
	 * Total numer of call drops after a HO attempt. RTC lost without MSack
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallDropCount")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long callDropCount;
	/**
	 * Number of Handout Commenced messages sent to MSC
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxHOCommence")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long txhOCommence;
	/**
	 * Number of session clear commands received form the core
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxHOSessionClear")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long rxhOSessionClear;
	/**
	 * Total number of times a Return On Handoff failure was declared
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReturnOnFailureCount")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long returnOnFailureCount;
	/**
	 * Number of times only one pilot was reported in HO Required message
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OnePilotReportCount")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long onePilotReportCount;
	/**
	 * Number of times only two pilot was reported in HO Required message
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TwoPilotReportCount")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long twoPilotReportCount;
	/**
	 * Number of times only three pilot was reported in HO Required message
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreePilotReportCount")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long threePilotReportCount;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of Handout Required messages sent to the MSC
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxhORequired() {
		return txhORequired;
	}

	/**
	 * Set the total number of Handout Required messages sent to the MSC
	 *
	 * @since 2.0
	 * @param txhORequired the input value
	 */
	public void  setTxhORequired(Long txhORequired) {
		this.txhORequired = txhORequired;
	}

	/**
	 * Set the total number of Handout Required messages sent to the MSC
	 *
	 * @since 2.0
	 * @param txhORequired the input value
	 * @return this instance
	 */
	public Stats withTxhORequired(Long txhORequired) {
		this.txhORequired = txhORequired;
		return this;
	}

	/**
	 * Get the total number of Handout Command messegaes received from the MSC
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxhOCommand() {
		return rxhOCommand;
	}

	/**
	 * Set the total number of Handout Command messegaes received from the MSC
	 *
	 * @since 2.0
	 * @param rxhOCommand the input value
	 */
	public void  setRxhOCommand(Long rxhOCommand) {
		this.rxhOCommand = rxhOCommand;
	}

	/**
	 * Set the total number of Handout Command messegaes received from the MSC
	 *
	 * @since 2.0
	 * @param rxhOCommand the input value
	 * @return this instance
	 */
	public Stats withRxhOCommand(Long rxhOCommand) {
		this.rxhOCommand = rxhOCommand;
		return this;
	}

	/**
	 * Get the total number of HO required requests rejected by the MSC
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHorequiredRejected() {
		return horequiredRejected;
	}

	/**
	 * Set the total number of HO required requests rejected by the MSC
	 *
	 * @since 2.0
	 * @param horequiredRejected the input value
	 */
	public void  setHorequiredRejected(Long horequiredRejected) {
		this.horequiredRejected = horequiredRejected;
	}

	/**
	 * Set the total number of HO required requests rejected by the MSC
	 *
	 * @since 2.0
	 * @param horequiredRejected the input value
	 * @return this instance
	 */
	public Stats withHorequiredRejected(Long horequiredRejected) {
		this.horequiredRejected = horequiredRejected;
		return this;
	}

	/**
	 * Get the total number of HO required requests for which no response received from the MSC
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHorequiredUnanswered() {
		return horequiredUnanswered;
	}

	/**
	 * Set the total number of HO required requests for which no response received from the MSC
	 *
	 * @since 2.0
	 * @param horequiredUnanswered the input value
	 */
	public void  setHorequiredUnanswered(Long horequiredUnanswered) {
		this.horequiredUnanswered = horequiredUnanswered;
	}

	/**
	 * Set the total number of HO required requests for which no response received from the MSC
	 *
	 * @since 2.0
	 * @param horequiredUnanswered the input value
	 * @return this instance
	 */
	public Stats withHorequiredUnanswered(Long horequiredUnanswered) {
		this.horequiredUnanswered = horequiredUnanswered;
		return this;
	}

	/**
	 * Get the total number UHDMs sent to mobiles
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxuHDM() {
		return txuHDM;
	}

	/**
	 * Set the total number UHDMs sent to mobiles
	 *
	 * @since 2.0
	 * @param txuHDM the input value
	 */
	public void  setTxuHDM(Long txuHDM) {
		this.txuHDM = txuHDM;
	}

	/**
	 * Set the total number UHDMs sent to mobiles
	 *
	 * @since 2.0
	 * @param txuHDM the input value
	 * @return this instance
	 */
	public Stats withTxuHDM(Long txuHDM) {
		this.txuHDM = txuHDM;
		return this;
	}

	/**
	 * Get the total number of MSAcks received from the mobile  in response to UHDM
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxnSAck() {
		return rxnSAck;
	}

	/**
	 * Set the total number of MSAcks received from the mobile  in response to UHDM
	 *
	 * @since 2.0
	 * @param rxnSAck the input value
	 */
	public void  setRxnSAck(Long rxnSAck) {
		this.rxnSAck = rxnSAck;
	}

	/**
	 * Set the total number of MSAcks received from the mobile  in response to UHDM
	 *
	 * @since 2.0
	 * @param rxnSAck the input value
	 * @return this instance
	 */
	public Stats withRxnSAck(Long rxnSAck) {
		this.rxnSAck = rxnSAck;
		return this;
	}

	/**
	 * Get the total number of Handout attempts declared as failure
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHofailureCount() {
		return hofailureCount;
	}

	/**
	 * Set the total number of Handout attempts declared as failure
	 *
	 * @since 2.0
	 * @param hofailureCount the input value
	 */
	public void  setHofailureCount(Long hofailureCount) {
		this.hofailureCount = hofailureCount;
	}

	/**
	 * Set the total number of Handout attempts declared as failure
	 *
	 * @since 2.0
	 * @param hofailureCount the input value
	 * @return this instance
	 */
	public Stats withHofailureCount(Long hofailureCount) {
		this.hofailureCount = hofailureCount;
		return this;
	}

	/**
	 * Get the total numer of call drops after a HO attempt. RTC lost without MSack
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallDropCount() {
		return callDropCount;
	}

	/**
	 * Set the total numer of call drops after a HO attempt. RTC lost without MSack
	 *
	 * @since 2.0
	 * @param callDropCount the input value
	 */
	public void  setCallDropCount(Long callDropCount) {
		this.callDropCount = callDropCount;
	}

	/**
	 * Set the total numer of call drops after a HO attempt. RTC lost without MSack
	 *
	 * @since 2.0
	 * @param callDropCount the input value
	 * @return this instance
	 */
	public Stats withCallDropCount(Long callDropCount) {
		this.callDropCount = callDropCount;
		return this;
	}

	/**
	 * Get the number of Handout Commenced messages sent to MSC
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxhOCommence() {
		return txhOCommence;
	}

	/**
	 * Set the number of Handout Commenced messages sent to MSC
	 *
	 * @since 2.0
	 * @param txhOCommence the input value
	 */
	public void  setTxhOCommence(Long txhOCommence) {
		this.txhOCommence = txhOCommence;
	}

	/**
	 * Set the number of Handout Commenced messages sent to MSC
	 *
	 * @since 2.0
	 * @param txhOCommence the input value
	 * @return this instance
	 */
	public Stats withTxhOCommence(Long txhOCommence) {
		this.txhOCommence = txhOCommence;
		return this;
	}

	/**
	 * Get the number of session clear commands received form the core
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxhOSessionClear() {
		return rxhOSessionClear;
	}

	/**
	 * Set the number of session clear commands received form the core
	 *
	 * @since 2.0
	 * @param rxhOSessionClear the input value
	 */
	public void  setRxhOSessionClear(Long rxhOSessionClear) {
		this.rxhOSessionClear = rxhOSessionClear;
	}

	/**
	 * Set the number of session clear commands received form the core
	 *
	 * @since 2.0
	 * @param rxhOSessionClear the input value
	 * @return this instance
	 */
	public Stats withRxhOSessionClear(Long rxhOSessionClear) {
		this.rxhOSessionClear = rxhOSessionClear;
		return this;
	}

	/**
	 * Get the total number of times a Return On Handoff failure was declared
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReturnOnFailureCount() {
		return returnOnFailureCount;
	}

	/**
	 * Set the total number of times a Return On Handoff failure was declared
	 *
	 * @since 2.0
	 * @param returnOnFailureCount the input value
	 */
	public void  setReturnOnFailureCount(Long returnOnFailureCount) {
		this.returnOnFailureCount = returnOnFailureCount;
	}

	/**
	 * Set the total number of times a Return On Handoff failure was declared
	 *
	 * @since 2.0
	 * @param returnOnFailureCount the input value
	 * @return this instance
	 */
	public Stats withReturnOnFailureCount(Long returnOnFailureCount) {
		this.returnOnFailureCount = returnOnFailureCount;
		return this;
	}

	/**
	 * Get the number of times only one pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOnePilotReportCount() {
		return onePilotReportCount;
	}

	/**
	 * Set the number of times only one pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @param onePilotReportCount the input value
	 */
	public void  setOnePilotReportCount(Long onePilotReportCount) {
		this.onePilotReportCount = onePilotReportCount;
	}

	/**
	 * Set the number of times only one pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @param onePilotReportCount the input value
	 * @return this instance
	 */
	public Stats withOnePilotReportCount(Long onePilotReportCount) {
		this.onePilotReportCount = onePilotReportCount;
		return this;
	}

	/**
	 * Get the number of times only two pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTwoPilotReportCount() {
		return twoPilotReportCount;
	}

	/**
	 * Set the number of times only two pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @param twoPilotReportCount the input value
	 */
	public void  setTwoPilotReportCount(Long twoPilotReportCount) {
		this.twoPilotReportCount = twoPilotReportCount;
	}

	/**
	 * Set the number of times only two pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @param twoPilotReportCount the input value
	 * @return this instance
	 */
	public Stats withTwoPilotReportCount(Long twoPilotReportCount) {
		this.twoPilotReportCount = twoPilotReportCount;
		return this;
	}

	/**
	 * Get the number of times only three pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreePilotReportCount() {
		return threePilotReportCount;
	}

	/**
	 * Set the number of times only three pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @param threePilotReportCount the input value
	 */
	public void  setThreePilotReportCount(Long threePilotReportCount) {
		this.threePilotReportCount = threePilotReportCount;
	}

	/**
	 * Set the number of times only three pilot was reported in HO Required message
	 *
	 * @since 2.0
	 * @param threePilotReportCount the input value
	 * @return this instance
	 */
	public Stats withThreePilotReportCount(Long threePilotReportCount) {
		this.threePilotReportCount = threePilotReportCount;
		return this;
	}

	//</editor-fold>

}