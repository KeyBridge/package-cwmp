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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is used in obtaining the Access Authentication related stats.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.AccessAuthStats.")
public class AccessAuthStats {

	/**
	 * Number of AnPppAuthentications attempted by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AnPppAuthenticationAttemptsByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long anpppAuthenticationAttemptsByNode;
	/**
	 * Number of A12 Access Requests Sent from the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12RequestsSentFromNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12RequestsSentFromNode;
	/**
	 * Number of A12 Access Rejects received from the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12RejectsReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12RejectsReceivedByNode;
	/**
	 * Number of A12 Access Accepts received by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12AcceptsReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12AcceptsReceivedByNode;
	/**
	 * Number of A12 Access Challenges received by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12AccessChallengesReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12AccessChallengesReceivedByNode;
	/**
	 * Number of A12 Access Requests retransmitted from the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12RetransmitsSentFromNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12RetransmitsSentFromNode;
	/**
	 * Number of A12 Timeout events occurred at the FAP due to unreachability of the AAA server/ no response from the AAA server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12TimeoutsEventsForNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12TimeoutsEventsForNode;
	/**
	 * Number of Malformed A12 Access Response received by the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12MalformedresponseReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12MalformedresponseReceivedByNode;
	/**
	 * Number of A12 Access Response with Bad Authenticator received by the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12BadAuthenticatorReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12BadAuthenticatorReceivedByNode;
	/**
	 * Number of A12 Packet of unknown type  received by the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12UnknownTypeReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12UnknownTypeReceivedByNode;
	/**
	 * Number of unknown A12  packets  received by the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12UnknownPktReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12UnknownPktReceivedByNode;
	/**
	 * Number of  A12  packets  received from unknown AAA server by the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12UnknownServerReceivedByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12UnknownServerReceivedByNode;
	/**
	 * Number of  A12  packets  failed due to other failure occurences in the AAA server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12OtherFailureOccurencesInNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12OtherFailureOccurencesInNode;
	/**
	 * Number of ATs with UnknowMfrCode detected in the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12ByPassNumAtsWithUnknownMfrCodeByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12ByPassNumAtsWithUnknownMfrCodeByNode;
	/**
	 * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "AnPPP Error".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12TxPathFailDueToAnPppErrorByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12TxPathFailDueToAnPppErrorByNode;
	/**
	 * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No Server Available".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12TxPathFailDueToNoServerAvailableByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12TxPathFailDueToNoServerAvailableByNode;
	/**
	 * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "internal error".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12TxPathFailDueToInternalErrorByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12TxPathFailDueToInternalErrorByNode;
	/**
	 * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No packet id available".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12TxPathFailDueToNoPacketIdAvailableByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12TxPathFailDueToNoPacketIdAvailableByNode;
	/**
	 * Number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "Transmit Error".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12TxPathFailDueToTransmitErrorByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12TxPathFailDueToTransmitErrorByNode;
	/**
	 * Number of  A12 server timeouts happened in the FAP RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12SvrTimeoutsForNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12SvrTimeoutsForNode;
	/**
	 * Number of LCP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12EnhTaBypassLcpTimeoutByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12EnhTaBypassLcpTimeoutByNode;
	/**
	 * Number of CHAP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12EnhTaBypassChapTimeoutByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12EnhTaBypassChapTimeoutByNode;
	/**
	 * Number of  CHAP Challenge response received from the AT when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12EnhTaBypassChapInvalidByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12EnhTaBypassChapInvalidByNode;
	/**
	 * Number of  times the CHAP NAI received from the AT matches with A12Bypass List in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12EnhTaBypassChapNaiMatchesA12BypassListByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
	/**
	 * Number of times Session timeouts occurred due to TA.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12SessionTaTimeoutByNode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long a12SessionTaTimeoutByNode;
	/**
	 * Number of times the Access Authenticaiton failed due to Sesion close.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessAuthFailedDueToSessionCloseTotal")
	@CWMPParameter(activeNotify = "canDeny")
	public Long accessAuthFailedDueToSessionCloseTotal;
	/**
	 * Number of times the Access Authenticaiton succeeded.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessAuthSucceeded")
	@CWMPParameter(activeNotify = "canDeny")
	public Long accessAuthSucceeded;

	public AccessAuthStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of AnPppAuthentications attempted by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAnpppAuthenticationAttemptsByNode() {
		return anpppAuthenticationAttemptsByNode;
	}

	/**
	 * Set the number of AnPppAuthentications attempted by the FAP.
	 *
	 * @since 2.0
	 * @param anpppAuthenticationAttemptsByNode the input value
	 */
	public void  setAnpppAuthenticationAttemptsByNode(Long anpppAuthenticationAttemptsByNode) {
		this.anpppAuthenticationAttemptsByNode = anpppAuthenticationAttemptsByNode;
	}

	/**
	 * Set the number of AnPppAuthentications attempted by the FAP.
	 *
	 * @since 2.0
	 * @param anpppAuthenticationAttemptsByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withAnpppAuthenticationAttemptsByNode(Long anpppAuthenticationAttemptsByNode) {
		this.anpppAuthenticationAttemptsByNode = anpppAuthenticationAttemptsByNode;
		return this;
	}

	/**
	 * Get the number of A12 Access Requests Sent from the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12RequestsSentFromNode() {
		return a12RequestsSentFromNode;
	}

	/**
	 * Set the number of A12 Access Requests Sent from the FAP.
	 *
	 * @since 2.0
	 * @param a12RequestsSentFromNode the input value
	 */
	public void  setA12RequestsSentFromNode(Long a12RequestsSentFromNode) {
		this.a12RequestsSentFromNode = a12RequestsSentFromNode;
	}

	/**
	 * Set the number of A12 Access Requests Sent from the FAP.
	 *
	 * @since 2.0
	 * @param a12RequestsSentFromNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12RequestsSentFromNode(Long a12RequestsSentFromNode) {
		this.a12RequestsSentFromNode = a12RequestsSentFromNode;
		return this;
	}

	/**
	 * Get the number of A12 Access Rejects received from the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12RejectsReceivedByNode() {
		return a12RejectsReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Rejects received from the FAP.
	 *
	 * @since 2.0
	 * @param a12RejectsReceivedByNode the input value
	 */
	public void  setA12RejectsReceivedByNode(Long a12RejectsReceivedByNode) {
		this.a12RejectsReceivedByNode = a12RejectsReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Rejects received from the FAP.
	 *
	 * @since 2.0
	 * @param a12RejectsReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12RejectsReceivedByNode(Long a12RejectsReceivedByNode) {
		this.a12RejectsReceivedByNode = a12RejectsReceivedByNode;
		return this;
	}

	/**
	 * Get the number of A12 Access Accepts received by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12AcceptsReceivedByNode() {
		return a12AcceptsReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Accepts received by the FAP.
	 *
	 * @since 2.0
	 * @param a12AcceptsReceivedByNode the input value
	 */
	public void  setA12AcceptsReceivedByNode(Long a12AcceptsReceivedByNode) {
		this.a12AcceptsReceivedByNode = a12AcceptsReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Accepts received by the FAP.
	 *
	 * @since 2.0
	 * @param a12AcceptsReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12AcceptsReceivedByNode(Long a12AcceptsReceivedByNode) {
		this.a12AcceptsReceivedByNode = a12AcceptsReceivedByNode;
		return this;
	}

	/**
	 * Get the number of A12 Access Challenges received by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12AccessChallengesReceivedByNode() {
		return a12AccessChallengesReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Challenges received by the FAP.
	 *
	 * @since 2.0
	 * @param a12AccessChallengesReceivedByNode the input value
	 */
	public void  setA12AccessChallengesReceivedByNode(Long a12AccessChallengesReceivedByNode) {
		this.a12AccessChallengesReceivedByNode = a12AccessChallengesReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Challenges received by the FAP.
	 *
	 * @since 2.0
	 * @param a12AccessChallengesReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12AccessChallengesReceivedByNode(Long a12AccessChallengesReceivedByNode) {
		this.a12AccessChallengesReceivedByNode = a12AccessChallengesReceivedByNode;
		return this;
	}

	/**
	 * Get the number of A12 Access Requests retransmitted from the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12RetransmitsSentFromNode() {
		return a12RetransmitsSentFromNode;
	}

	/**
	 * Set the number of A12 Access Requests retransmitted from the FAP.
	 *
	 * @since 2.0
	 * @param a12RetransmitsSentFromNode the input value
	 */
	public void  setA12RetransmitsSentFromNode(Long a12RetransmitsSentFromNode) {
		this.a12RetransmitsSentFromNode = a12RetransmitsSentFromNode;
	}

	/**
	 * Set the number of A12 Access Requests retransmitted from the FAP.
	 *
	 * @since 2.0
	 * @param a12RetransmitsSentFromNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12RetransmitsSentFromNode(Long a12RetransmitsSentFromNode) {
		this.a12RetransmitsSentFromNode = a12RetransmitsSentFromNode;
		return this;
	}

	/**
	 * Get the number of A12 Timeout events occurred at the FAP due to unreachability of the AAA server/ no response from the AAA server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12TimeoutsEventsForNode() {
		return a12TimeoutsEventsForNode;
	}

	/**
	 * Set the number of A12 Timeout events occurred at the FAP due to unreachability of the AAA server/ no response from the AAA server.
	 *
	 * @since 2.0
	 * @param a12TimeoutsEventsForNode the input value
	 */
	public void  setA12TimeoutsEventsForNode(Long a12TimeoutsEventsForNode) {
		this.a12TimeoutsEventsForNode = a12TimeoutsEventsForNode;
	}

	/**
	 * Set the number of A12 Timeout events occurred at the FAP due to unreachability of the AAA server/ no response from the AAA server.
	 *
	 * @since 2.0
	 * @param a12TimeoutsEventsForNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12TimeoutsEventsForNode(Long a12TimeoutsEventsForNode) {
		this.a12TimeoutsEventsForNode = a12TimeoutsEventsForNode;
		return this;
	}

	/**
	 * Get the number of Malformed A12 Access Response received by the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12MalformedresponseReceivedByNode() {
		return a12MalformedresponseReceivedByNode;
	}

	/**
	 * Set the number of Malformed A12 Access Response received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12MalformedresponseReceivedByNode the input value
	 */
	public void  setA12MalformedresponseReceivedByNode(Long a12MalformedresponseReceivedByNode) {
		this.a12MalformedresponseReceivedByNode = a12MalformedresponseReceivedByNode;
	}

	/**
	 * Set the number of Malformed A12 Access Response received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12MalformedresponseReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12MalformedresponseReceivedByNode(Long a12MalformedresponseReceivedByNode) {
		this.a12MalformedresponseReceivedByNode = a12MalformedresponseReceivedByNode;
		return this;
	}

	/**
	 * Get the number of A12 Access Response with Bad Authenticator received by the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12BadAuthenticatorReceivedByNode() {
		return a12BadAuthenticatorReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Response with Bad Authenticator received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12BadAuthenticatorReceivedByNode the input value
	 */
	public void  setA12BadAuthenticatorReceivedByNode(Long a12BadAuthenticatorReceivedByNode) {
		this.a12BadAuthenticatorReceivedByNode = a12BadAuthenticatorReceivedByNode;
	}

	/**
	 * Set the number of A12 Access Response with Bad Authenticator received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12BadAuthenticatorReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12BadAuthenticatorReceivedByNode(Long a12BadAuthenticatorReceivedByNode) {
		this.a12BadAuthenticatorReceivedByNode = a12BadAuthenticatorReceivedByNode;
		return this;
	}

	/**
	 * Get the number of A12 Packet of unknown type  received by the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12UnknownTypeReceivedByNode() {
		return a12UnknownTypeReceivedByNode;
	}

	/**
	 * Set the number of A12 Packet of unknown type  received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12UnknownTypeReceivedByNode the input value
	 */
	public void  setA12UnknownTypeReceivedByNode(Long a12UnknownTypeReceivedByNode) {
		this.a12UnknownTypeReceivedByNode = a12UnknownTypeReceivedByNode;
	}

	/**
	 * Set the number of A12 Packet of unknown type  received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12UnknownTypeReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12UnknownTypeReceivedByNode(Long a12UnknownTypeReceivedByNode) {
		this.a12UnknownTypeReceivedByNode = a12UnknownTypeReceivedByNode;
		return this;
	}

	/**
	 * Get the number of unknown A12  packets  received by the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12UnknownPktReceivedByNode() {
		return a12UnknownPktReceivedByNode;
	}

	/**
	 * Set the number of unknown A12  packets  received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12UnknownPktReceivedByNode the input value
	 */
	public void  setA12UnknownPktReceivedByNode(Long a12UnknownPktReceivedByNode) {
		this.a12UnknownPktReceivedByNode = a12UnknownPktReceivedByNode;
	}

	/**
	 * Set the number of unknown A12  packets  received by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12UnknownPktReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12UnknownPktReceivedByNode(Long a12UnknownPktReceivedByNode) {
		this.a12UnknownPktReceivedByNode = a12UnknownPktReceivedByNode;
		return this;
	}

	/**
	 * Get the number of  A12  packets  received from unknown AAA server by the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12UnknownServerReceivedByNode() {
		return a12UnknownServerReceivedByNode;
	}

	/**
	 * Set the number of  A12  packets  received from unknown AAA server by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12UnknownServerReceivedByNode the input value
	 */
	public void  setA12UnknownServerReceivedByNode(Long a12UnknownServerReceivedByNode) {
		this.a12UnknownServerReceivedByNode = a12UnknownServerReceivedByNode;
	}

	/**
	 * Set the number of  A12  packets  received from unknown AAA server by the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12UnknownServerReceivedByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12UnknownServerReceivedByNode(Long a12UnknownServerReceivedByNode) {
		this.a12UnknownServerReceivedByNode = a12UnknownServerReceivedByNode;
		return this;
	}

	/**
	 * Get the number of  A12  packets  failed due to other failure occurences in the AAA server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12OtherFailureOccurencesInNode() {
		return a12OtherFailureOccurencesInNode;
	}

	/**
	 * Set the number of  A12  packets  failed due to other failure occurences in the AAA server.
	 *
	 * @since 2.0
	 * @param a12OtherFailureOccurencesInNode the input value
	 */
	public void  setA12OtherFailureOccurencesInNode(Long a12OtherFailureOccurencesInNode) {
		this.a12OtherFailureOccurencesInNode = a12OtherFailureOccurencesInNode;
	}

	/**
	 * Set the number of  A12  packets  failed due to other failure occurences in the AAA server.
	 *
	 * @since 2.0
	 * @param a12OtherFailureOccurencesInNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12OtherFailureOccurencesInNode(Long a12OtherFailureOccurencesInNode) {
		this.a12OtherFailureOccurencesInNode = a12OtherFailureOccurencesInNode;
		return this;
	}

	/**
	 * Get the number of ATs with UnknowMfrCode detected in the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12ByPassNumAtsWithUnknownMfrCodeByNode() {
		return a12ByPassNumAtsWithUnknownMfrCodeByNode;
	}

	/**
	 * Set the number of ATs with UnknowMfrCode detected in the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12ByPassNumAtsWithUnknownMfrCodeByNode the input value
	 */
	public void  setA12ByPassNumAtsWithUnknownMfrCodeByNode(Long a12ByPassNumAtsWithUnknownMfrCodeByNode) {
		this.a12ByPassNumAtsWithUnknownMfrCodeByNode = a12ByPassNumAtsWithUnknownMfrCodeByNode;
	}

	/**
	 * Set the number of ATs with UnknowMfrCode detected in the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12ByPassNumAtsWithUnknownMfrCodeByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12ByPassNumAtsWithUnknownMfrCodeByNode(Long a12ByPassNumAtsWithUnknownMfrCodeByNode) {
		this.a12ByPassNumAtsWithUnknownMfrCodeByNode = a12ByPassNumAtsWithUnknownMfrCodeByNode;
		return this;
	}

	/**
	 * Get the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "AnPPP Error".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12TxPathFailDueToAnPppErrorByNode() {
		return a12TxPathFailDueToAnPppErrorByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "AnPPP Error".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToAnPppErrorByNode the input value
	 */
	public void  setA12TxPathFailDueToAnPppErrorByNode(Long a12TxPathFailDueToAnPppErrorByNode) {
		this.a12TxPathFailDueToAnPppErrorByNode = a12TxPathFailDueToAnPppErrorByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "AnPPP Error".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToAnPppErrorByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12TxPathFailDueToAnPppErrorByNode(Long a12TxPathFailDueToAnPppErrorByNode) {
		this.a12TxPathFailDueToAnPppErrorByNode = a12TxPathFailDueToAnPppErrorByNode;
		return this;
	}

	/**
	 * Get the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No Server Available".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12TxPathFailDueToNoServerAvailableByNode() {
		return a12TxPathFailDueToNoServerAvailableByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No Server Available".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToNoServerAvailableByNode the input value
	 */
	public void  setA12TxPathFailDueToNoServerAvailableByNode(Long a12TxPathFailDueToNoServerAvailableByNode) {
		this.a12TxPathFailDueToNoServerAvailableByNode = a12TxPathFailDueToNoServerAvailableByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No Server Available".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToNoServerAvailableByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12TxPathFailDueToNoServerAvailableByNode(Long a12TxPathFailDueToNoServerAvailableByNode) {
		this.a12TxPathFailDueToNoServerAvailableByNode = a12TxPathFailDueToNoServerAvailableByNode;
		return this;
	}

	/**
	 * Get the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "internal error".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12TxPathFailDueToInternalErrorByNode() {
		return a12TxPathFailDueToInternalErrorByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "internal error".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToInternalErrorByNode the input value
	 */
	public void  setA12TxPathFailDueToInternalErrorByNode(Long a12TxPathFailDueToInternalErrorByNode) {
		this.a12TxPathFailDueToInternalErrorByNode = a12TxPathFailDueToInternalErrorByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "internal error".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToInternalErrorByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12TxPathFailDueToInternalErrorByNode(Long a12TxPathFailDueToInternalErrorByNode) {
		this.a12TxPathFailDueToInternalErrorByNode = a12TxPathFailDueToInternalErrorByNode;
		return this;
	}

	/**
	 * Get the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No packet id available".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12TxPathFailDueToNoPacketIdAvailableByNode() {
		return a12TxPathFailDueToNoPacketIdAvailableByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No packet id available".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToNoPacketIdAvailableByNode the input value
	 */
	public void  setA12TxPathFailDueToNoPacketIdAvailableByNode(Long a12TxPathFailDueToNoPacketIdAvailableByNode) {
		this.a12TxPathFailDueToNoPacketIdAvailableByNode = a12TxPathFailDueToNoPacketIdAvailableByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "No packet id available".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToNoPacketIdAvailableByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12TxPathFailDueToNoPacketIdAvailableByNode(Long a12TxPathFailDueToNoPacketIdAvailableByNode) {
		this.a12TxPathFailDueToNoPacketIdAvailableByNode = a12TxPathFailDueToNoPacketIdAvailableByNode;
		return this;
	}

	/**
	 * Get the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "Transmit Error".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12TxPathFailDueToTransmitErrorByNode() {
		return a12TxPathFailDueToTransmitErrorByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "Transmit Error".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToTransmitErrorByNode the input value
	 */
	public void  setA12TxPathFailDueToTransmitErrorByNode(Long a12TxPathFailDueToTransmitErrorByNode) {
		this.a12TxPathFailDueToTransmitErrorByNode = a12TxPathFailDueToTransmitErrorByNode;
	}

	/**
	 * Set the number of times sending of A12 packet failed in Tx Path in the FAP RNC due to "Transmit Error".
	 *
	 * @since 2.0
	 * @param a12TxPathFailDueToTransmitErrorByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12TxPathFailDueToTransmitErrorByNode(Long a12TxPathFailDueToTransmitErrorByNode) {
		this.a12TxPathFailDueToTransmitErrorByNode = a12TxPathFailDueToTransmitErrorByNode;
		return this;
	}

	/**
	 * Get the number of  A12 server timeouts happened in the FAP RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12SvrTimeoutsForNode() {
		return a12SvrTimeoutsForNode;
	}

	/**
	 * Set the number of  A12 server timeouts happened in the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12SvrTimeoutsForNode the input value
	 */
	public void  setA12SvrTimeoutsForNode(Long a12SvrTimeoutsForNode) {
		this.a12SvrTimeoutsForNode = a12SvrTimeoutsForNode;
	}

	/**
	 * Set the number of  A12 server timeouts happened in the FAP RNC.
	 *
	 * @since 2.0
	 * @param a12SvrTimeoutsForNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12SvrTimeoutsForNode(Long a12SvrTimeoutsForNode) {
		this.a12SvrTimeoutsForNode = a12SvrTimeoutsForNode;
		return this;
	}

	/**
	 * Get the number of LCP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12EnhTaBypassLcpTimeoutByNode() {
		return a12EnhTaBypassLcpTimeoutByNode;
	}

	/**
	 * Set the number of LCP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassLcpTimeoutByNode the input value
	 */
	public void  setA12EnhTaBypassLcpTimeoutByNode(Long a12EnhTaBypassLcpTimeoutByNode) {
		this.a12EnhTaBypassLcpTimeoutByNode = a12EnhTaBypassLcpTimeoutByNode;
	}

	/**
	 * Set the number of LCP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassLcpTimeoutByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12EnhTaBypassLcpTimeoutByNode(Long a12EnhTaBypassLcpTimeoutByNode) {
		this.a12EnhTaBypassLcpTimeoutByNode = a12EnhTaBypassLcpTimeoutByNode;
		return this;
	}

	/**
	 * Get the number of CHAP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12EnhTaBypassChapTimeoutByNode() {
		return a12EnhTaBypassChapTimeoutByNode;
	}

	/**
	 * Set the number of CHAP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassChapTimeoutByNode the input value
	 */
	public void  setA12EnhTaBypassChapTimeoutByNode(Long a12EnhTaBypassChapTimeoutByNode) {
		this.a12EnhTaBypassChapTimeoutByNode = a12EnhTaBypassChapTimeoutByNode;
	}

	/**
	 * Set the number of CHAP timeouts happened in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassChapTimeoutByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12EnhTaBypassChapTimeoutByNode(Long a12EnhTaBypassChapTimeoutByNode) {
		this.a12EnhTaBypassChapTimeoutByNode = a12EnhTaBypassChapTimeoutByNode;
		return this;
	}

	/**
	 * Get the number of  CHAP Challenge response received from the AT when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12EnhTaBypassChapInvalidByNode() {
		return a12EnhTaBypassChapInvalidByNode;
	}

	/**
	 * Set the number of  CHAP Challenge response received from the AT when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassChapInvalidByNode the input value
	 */
	public void  setA12EnhTaBypassChapInvalidByNode(Long a12EnhTaBypassChapInvalidByNode) {
		this.a12EnhTaBypassChapInvalidByNode = a12EnhTaBypassChapInvalidByNode;
	}

	/**
	 * Set the number of  CHAP Challenge response received from the AT when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassChapInvalidByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12EnhTaBypassChapInvalidByNode(Long a12EnhTaBypassChapInvalidByNode) {
		this.a12EnhTaBypassChapInvalidByNode = a12EnhTaBypassChapInvalidByNode;
		return this;
	}

	/**
	 * Get the number of  times the CHAP NAI received from the AT matches with A12Bypass List in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12EnhTaBypassChapNaiMatchesA12BypassListByNode() {
		return a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
	}

	/**
	 * Set the number of  times the CHAP NAI received from the AT matches with A12Bypass List in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassChapNaiMatchesA12BypassListByNode the input value
	 */
	public void  setA12EnhTaBypassChapNaiMatchesA12BypassListByNode(Long a12EnhTaBypassChapNaiMatchesA12BypassListByNode) {
		this.a12EnhTaBypassChapNaiMatchesA12BypassListByNode = a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
	}

	/**
	 * Set the number of  times the CHAP NAI received from the AT matches with A12Bypass List in the FAP RNC when Enhanced TA A12Bypass mode is enabled.
	 *
	 * @since 2.0
	 * @param a12EnhTaBypassChapNaiMatchesA12BypassListByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12EnhTaBypassChapNaiMatchesA12BypassListByNode(Long a12EnhTaBypassChapNaiMatchesA12BypassListByNode) {
		this.a12EnhTaBypassChapNaiMatchesA12BypassListByNode = a12EnhTaBypassChapNaiMatchesA12BypassListByNode;
		return this;
	}

	/**
	 * Get the number of times Session timeouts occurred due to TA.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA12SessionTaTimeoutByNode() {
		return a12SessionTaTimeoutByNode;
	}

	/**
	 * Set the number of times Session timeouts occurred due to TA.
	 *
	 * @since 2.0
	 * @param a12SessionTaTimeoutByNode the input value
	 */
	public void  setA12SessionTaTimeoutByNode(Long a12SessionTaTimeoutByNode) {
		this.a12SessionTaTimeoutByNode = a12SessionTaTimeoutByNode;
	}

	/**
	 * Set the number of times Session timeouts occurred due to TA.
	 *
	 * @since 2.0
	 * @param a12SessionTaTimeoutByNode the input value
	 * @return this instance
	 */
	public AccessAuthStats withA12SessionTaTimeoutByNode(Long a12SessionTaTimeoutByNode) {
		this.a12SessionTaTimeoutByNode = a12SessionTaTimeoutByNode;
		return this;
	}

	/**
	 * Get the number of times the Access Authenticaiton failed due to Sesion close.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessAuthFailedDueToSessionCloseTotal() {
		return accessAuthFailedDueToSessionCloseTotal;
	}

	/**
	 * Set the number of times the Access Authenticaiton failed due to Sesion close.
	 *
	 * @since 2.0
	 * @param accessAuthFailedDueToSessionCloseTotal the input value
	 */
	public void  setAccessAuthFailedDueToSessionCloseTotal(Long accessAuthFailedDueToSessionCloseTotal) {
		this.accessAuthFailedDueToSessionCloseTotal = accessAuthFailedDueToSessionCloseTotal;
	}

	/**
	 * Set the number of times the Access Authenticaiton failed due to Sesion close.
	 *
	 * @since 2.0
	 * @param accessAuthFailedDueToSessionCloseTotal the input value
	 * @return this instance
	 */
	public AccessAuthStats withAccessAuthFailedDueToSessionCloseTotal(Long accessAuthFailedDueToSessionCloseTotal) {
		this.accessAuthFailedDueToSessionCloseTotal = accessAuthFailedDueToSessionCloseTotal;
		return this;
	}

	/**
	 * Get the number of times the Access Authenticaiton succeeded.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessAuthSucceeded() {
		return accessAuthSucceeded;
	}

	/**
	 * Set the number of times the Access Authenticaiton succeeded.
	 *
	 * @since 2.0
	 * @param accessAuthSucceeded the input value
	 */
	public void  setAccessAuthSucceeded(Long accessAuthSucceeded) {
		this.accessAuthSucceeded = accessAuthSucceeded;
	}

	/**
	 * Set the number of times the Access Authenticaiton succeeded.
	 *
	 * @since 2.0
	 * @param accessAuthSucceeded the input value
	 * @return this instance
	 */
	public AccessAuthStats withAccessAuthSucceeded(Long accessAuthSucceeded) {
		this.accessAuthSucceeded = accessAuthSucceeded;
		return this;
	}

	//</editor-fold>

}