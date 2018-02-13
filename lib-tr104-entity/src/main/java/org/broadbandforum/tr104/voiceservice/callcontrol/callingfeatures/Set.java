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
package org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures;

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
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set.CFT;
import org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set.FollowMe;
import org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set.SCF;
import org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set.SCREJ;
import org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set.Voice2Mail;

	/**
	 * This object models a set of calling features that can be applied in {{object|.CallControl.Line.}} or {{object|.CallControl.Extension.}} objects.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.CallingFeatures.Set.{i}.")
@XmlRootElement(name = "Set")
@XmlType(name = "VoiceService.CallControl.CallingFeatures.Set")
@XmlAccessorType(XmlAccessType.FIELD)
public class Set {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enable or disable the transmission of caller ID information on incoming calls (CLIP).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallerIDEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callerIDEnable;
	/**
	 * Enable or disable the transmission of caller ID name information on incoming calls (CNIP).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallerIDNameEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callerIDNameEnable;
	/**
	 * Enables or disables call waiting in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint managed call waiting.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallWaitingEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callWaitingEnable;
	/**
	 * Enables or disables unconditional call forwarding by the endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardUnconditionalEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callForwardUnconditionalEnable;
	/**
	 * Directory number to which all incoming calls to this line are forwarded when {{param|CallForwardUnconditionalEnable}} is {{true}}.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardUnconditionalNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String callForwardUnconditionalNumber;
	/**
	 * Enables or disables call forwarding-on-busy by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardOnBusyEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callForwardOnBusyEnable;
	/**
	 * Directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnBusyEnable}} is {{true}} and the line is busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardOnBusyNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String callForwardOnBusyNumber;
	/**
	 * Delay in seconds before considering there is no answer for call forwarding-on-busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardOnBusyRingTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long callForwardOnBusyRingTimeout;
	/**
	 * Enables or disables call forwarding-on-no-answer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardOnNoAnswerEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callForwardOnNoAnswerEnable;
	/**
	 * Directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnNoAnswerEnable}} is {{true}} and there is no local answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardOnNoAnswerNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String callForwardOnNoAnswerNumber;
	/**
	 * Delay in seconds before considering there is no answer for call forwarding-on-no-answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallForwardOnNoAnswerRingTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long callForwardOnNoAnswerRingTimeout;
	/**
	 * Enables or disables call transfer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call transfer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallTransferEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callTransferEnable;
	/**
	 * Enables or disables Message Waiting Indication by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MWIEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean mwiEnable;
	/**
	 * Enables or disables Visual Message Waiting Indication.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VMWIEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean vmwIEnable;
	/**
	 * Indicates the number of messages which are currently waiting on this line as known by the CPE.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LineMessagesWaiting")
	public Long lineMessagesWaiting;
	/**
	 * Enable or disable Anonymous Call Block capability in the endpoint (ACR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call Block capability.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AnonymousCallRejectionEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean anonymousCallRejectionEnable;
	/**
	 * Enable or disable Anonymous Call capability in the endpoint (CLIR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call capability.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AnonymousCallEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean anonymousCallEnable;
	/**
	 * Enable or disable Do Not Disturb capability in the Endpoint. When enabled, all calls are forwarded to voice mail.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Do Not Disturb capability.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DoNotDisturbEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean donotDisturbEnable;
	/**
	 * Enable or disable Repeat Dial capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Repeat Dial capability.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RepeatDialEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean repeatDialEnable;
	/**
	 * Enable or disable Voice Mail capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Voice Mail capability.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoiceMailEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean voiceMailEnable;
	/**
	 * Enable or disable Call Interception capability in the Endpoint.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallPickUpEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callPickUpEnable;
	/**
	 * Enable or disable automatic recall on busy (Completion of Calls to Busy Subscriber) capability in the Endpoint.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CCBSEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean ccbSEnable;
	/**
	 * Enable or disable successive forwarding (Inhibition of Incoming Forwarded Calls) from the Endpoint.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IIFCEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean iifCEnable;
	/**
	 * Allow or block any internal forward to the Endpoint.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BlockForwardEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean blockForwardEnable;
	/**
	 * Enable or disable secret identity of this Endpoint in case it initiates (on an external incoming call) a forward to another internal phone Endpoint.

If enabled, only the remote ''caller party'' can be identified (if not anonymous), not this intermediate ''via'' phone extension.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecretForwarderEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean secretForwarderEnable;
	/**
	 * Enable or disable FollowMe capability in the Endpoint.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FollowMeEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean followMeEnable;
	/**
	 * This object defines a Call Forwarding Timed (CFT) that permit the user to forward calls to particular destinations depending on the time of day.

Note: a bad configuration (e.g. timeslots overlapping) could cause unexpected behavior.
	 */
	@XmlElementWrapper(name = "CFTs")
	@XmlElement(name = "CFT")
	@CWMPParameter(access = "readWrite")
	public Collection<CFT> cfts;
	/**
	 * This object defines a Selective Call Forwarding (SCF) that permit the user to forward calls to different destinations depending on the calling number.
	 */
	@XmlElementWrapper(name = "SCFs")
	@XmlElement(name = "SCF")
	@CWMPParameter(access = "readWrite")
	public Collection<SCF> scfs;
	/**
	 * This object defines a Selective Call Rejection (SCREJ) that permit the user to selectively reject calls depending on the calling number.
	 */
	@XmlElementWrapper(name = "SCREJs")
	@XmlElement(name = "SCREJ")
	@CWMPParameter(access = "readWrite")
	public Collection<SCREJ> scrEJs;
	/**
	 * This object defines the FollowMe destinations mapping definition, in the provided sequence order.
	 */
	@XmlElementWrapper(name = "FollowMes")
	@XmlElement(name = "FollowMe")
	@CWMPParameter(access = "readWrite")
	public Collection<FollowMe> followMes;
	/**
	 * Voice to mail specific attributes. Applies only if {{param|#.VoiceMailEnable}} is set to {{true}}.
	 */
	@XmlElement(name = "Voice2Mail")
	public Voice2Mail voice2Mail;

	public Set() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Set withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enable or disable the transmission of caller ID information on incoming calls (CLIP).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallerIDEnable() {
		return callerIDEnable;
	}

	/**
	 * Set the enable or disable the transmission of caller ID information on incoming calls (CLIP).
	 *
	 * @since 2.0
	 * @param callerIDEnable the input value
	 */
	public void  setCallerIDEnable(Boolean callerIDEnable) {
		this.callerIDEnable = callerIDEnable;
	}

	/**
	 * Set the enable or disable the transmission of caller ID information on incoming calls (CLIP).
	 *
	 * @since 2.0
	 * @param callerIDEnable the input value
	 * @return this instance
	 */
	public Set withCallerIDEnable(Boolean callerIDEnable) {
		this.callerIDEnable = callerIDEnable;
		return this;
	}

	/**
	 * Get the enable or disable the transmission of caller ID name information on incoming calls (CNIP).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallerIDNameEnable() {
		return callerIDNameEnable;
	}

	/**
	 * Set the enable or disable the transmission of caller ID name information on incoming calls (CNIP).
	 *
	 * @since 2.0
	 * @param callerIDNameEnable the input value
	 */
	public void  setCallerIDNameEnable(Boolean callerIDNameEnable) {
		this.callerIDNameEnable = callerIDNameEnable;
	}

	/**
	 * Set the enable or disable the transmission of caller ID name information on incoming calls (CNIP).
	 *
	 * @since 2.0
	 * @param callerIDNameEnable the input value
	 * @return this instance
	 */
	public Set withCallerIDNameEnable(Boolean callerIDNameEnable) {
		this.callerIDNameEnable = callerIDNameEnable;
		return this;
	}

	/**
	 * Get the enables or disables call waiting in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint managed call waiting.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallWaitingEnable() {
		return callWaitingEnable;
	}

	/**
	 * Set the enables or disables call waiting in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint managed call waiting.
	 *
	 * @since 2.0
	 * @param callWaitingEnable the input value
	 */
	public void  setCallWaitingEnable(Boolean callWaitingEnable) {
		this.callWaitingEnable = callWaitingEnable;
	}

	/**
	 * Set the enables or disables call waiting in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint managed call waiting.
	 *
	 * @since 2.0
	 * @param callWaitingEnable the input value
	 * @return this instance
	 */
	public Set withCallWaitingEnable(Boolean callWaitingEnable) {
		this.callWaitingEnable = callWaitingEnable;
		return this;
	}

	/**
	 * Get the enables or disables unconditional call forwarding by the endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallForwardUnconditionalEnable() {
		return callForwardUnconditionalEnable;
	}

	/**
	 * Set the enables or disables unconditional call forwarding by the endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardUnconditionalEnable the input value
	 */
	public void  setCallForwardUnconditionalEnable(Boolean callForwardUnconditionalEnable) {
		this.callForwardUnconditionalEnable = callForwardUnconditionalEnable;
	}

	/**
	 * Set the enables or disables unconditional call forwarding by the endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardUnconditionalEnable the input value
	 * @return this instance
	 */
	public Set withCallForwardUnconditionalEnable(Boolean callForwardUnconditionalEnable) {
		this.callForwardUnconditionalEnable = callForwardUnconditionalEnable;
		return this;
	}

	/**
	 * Get the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardUnconditionalEnable}} is {{true}}.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallForwardUnconditionalNumber() {
		return callForwardUnconditionalNumber;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardUnconditionalEnable}} is {{true}}.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding
	 *
	 * @since 2.0
	 * @param callForwardUnconditionalNumber the input value
	 */
	public void  setCallForwardUnconditionalNumber(String callForwardUnconditionalNumber) {
		this.callForwardUnconditionalNumber = callForwardUnconditionalNumber;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardUnconditionalEnable}} is {{true}}.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding
	 *
	 * @since 2.0
	 * @param callForwardUnconditionalNumber the input value
	 * @return this instance
	 */
	public Set withCallForwardUnconditionalNumber(String callForwardUnconditionalNumber) {
		this.callForwardUnconditionalNumber = callForwardUnconditionalNumber;
		return this;
	}

	/**
	 * Get the enables or disables call forwarding-on-busy by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallForwardOnBusyEnable() {
		return callForwardOnBusyEnable;
	}

	/**
	 * Set the enables or disables call forwarding-on-busy by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnBusyEnable the input value
	 */
	public void  setCallForwardOnBusyEnable(Boolean callForwardOnBusyEnable) {
		this.callForwardOnBusyEnable = callForwardOnBusyEnable;
	}

	/**
	 * Set the enables or disables call forwarding-on-busy by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnBusyEnable the input value
	 * @return this instance
	 */
	public Set withCallForwardOnBusyEnable(Boolean callForwardOnBusyEnable) {
		this.callForwardOnBusyEnable = callForwardOnBusyEnable;
		return this;
	}

	/**
	 * Get the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnBusyEnable}} is {{true}} and the line is busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallForwardOnBusyNumber() {
		return callForwardOnBusyNumber;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnBusyEnable}} is {{true}} and the line is busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnBusyNumber the input value
	 */
	public void  setCallForwardOnBusyNumber(String callForwardOnBusyNumber) {
		this.callForwardOnBusyNumber = callForwardOnBusyNumber;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnBusyEnable}} is {{true}} and the line is busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnBusyNumber the input value
	 * @return this instance
	 */
	public Set withCallForwardOnBusyNumber(String callForwardOnBusyNumber) {
		this.callForwardOnBusyNumber = callForwardOnBusyNumber;
		return this;
	}

	/**
	 * Get the delay in seconds before considering there is no answer for call forwarding-on-busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallForwardOnBusyRingTimeout() {
		return callForwardOnBusyRingTimeout;
	}

	/**
	 * Set the delay in seconds before considering there is no answer for call forwarding-on-busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnBusyRingTimeout the input value
	 */
	public void  setCallForwardOnBusyRingTimeout(Long callForwardOnBusyRingTimeout) {
		this.callForwardOnBusyRingTimeout = callForwardOnBusyRingTimeout;
	}

	/**
	 * Set the delay in seconds before considering there is no answer for call forwarding-on-busy.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnBusyRingTimeout the input value
	 * @return this instance
	 */
	public Set withCallForwardOnBusyRingTimeout(Long callForwardOnBusyRingTimeout) {
		this.callForwardOnBusyRingTimeout = callForwardOnBusyRingTimeout;
		return this;
	}

	/**
	 * Get the enables or disables call forwarding-on-no-answer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallForwardOnNoAnswerEnable() {
		return callForwardOnNoAnswerEnable;
	}

	/**
	 * Set the enables or disables call forwarding-on-no-answer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnNoAnswerEnable the input value
	 */
	public void  setCallForwardOnNoAnswerEnable(Boolean callForwardOnNoAnswerEnable) {
		this.callForwardOnNoAnswerEnable = callForwardOnNoAnswerEnable;
	}

	/**
	 * Set the enables or disables call forwarding-on-no-answer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnNoAnswerEnable the input value
	 * @return this instance
	 */
	public Set withCallForwardOnNoAnswerEnable(Boolean callForwardOnNoAnswerEnable) {
		this.callForwardOnNoAnswerEnable = callForwardOnNoAnswerEnable;
		return this;
	}

	/**
	 * Get the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnNoAnswerEnable}} is {{true}} and there is no local answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallForwardOnNoAnswerNumber() {
		return callForwardOnNoAnswerNumber;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnNoAnswerEnable}} is {{true}} and there is no local answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnNoAnswerNumber the input value
	 */
	public void  setCallForwardOnNoAnswerNumber(String callForwardOnNoAnswerNumber) {
		this.callForwardOnNoAnswerNumber = callForwardOnNoAnswerNumber;
	}

	/**
	 * Set the directory number to which all incoming calls to this line are forwarded when {{param|CallForwardOnNoAnswerEnable}} is {{true}} and there is no local answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnNoAnswerNumber the input value
	 * @return this instance
	 */
	public Set withCallForwardOnNoAnswerNumber(String callForwardOnNoAnswerNumber) {
		this.callForwardOnNoAnswerNumber = callForwardOnNoAnswerNumber;
		return this;
	}

	/**
	 * Get the delay in seconds before considering there is no answer for call forwarding-on-no-answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallForwardOnNoAnswerRingTimeout() {
		return callForwardOnNoAnswerRingTimeout;
	}

	/**
	 * Set the delay in seconds before considering there is no answer for call forwarding-on-no-answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnNoAnswerRingTimeout the input value
	 */
	public void  setCallForwardOnNoAnswerRingTimeout(Long callForwardOnNoAnswerRingTimeout) {
		this.callForwardOnNoAnswerRingTimeout = callForwardOnNoAnswerRingTimeout;
	}

	/**
	 * Set the delay in seconds before considering there is no answer for call forwarding-on-no-answer.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call forwarding.
	 *
	 * @since 2.0
	 * @param callForwardOnNoAnswerRingTimeout the input value
	 * @return this instance
	 */
	public Set withCallForwardOnNoAnswerRingTimeout(Long callForwardOnNoAnswerRingTimeout) {
		this.callForwardOnNoAnswerRingTimeout = callForwardOnNoAnswerRingTimeout;
		return this;
	}

	/**
	 * Get the enables or disables call transfer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call transfer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallTransferEnable() {
		return callTransferEnable;
	}

	/**
	 * Set the enables or disables call transfer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call transfer.
	 *
	 * @since 2.0
	 * @param callTransferEnable the input value
	 */
	public void  setCallTransferEnable(Boolean callTransferEnable) {
		this.callTransferEnable = callTransferEnable;
	}

	/**
	 * Set the enables or disables call transfer by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based call transfer.
	 *
	 * @since 2.0
	 * @param callTransferEnable the input value
	 * @return this instance
	 */
	public Set withCallTransferEnable(Boolean callTransferEnable) {
		this.callTransferEnable = callTransferEnable;
		return this;
	}

	/**
	 * Get the enables or disables Message Waiting Indication by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMwiEnable() {
		return mwiEnable;
	}

	/**
	 * Set the enables or disables Message Waiting Indication by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 * @param mwiEnable the input value
	 */
	public void  setMwiEnable(Boolean mwiEnable) {
		this.mwiEnable = mwiEnable;
	}

	/**
	 * Set the enables or disables Message Waiting Indication by the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 * @param mwiEnable the input value
	 * @return this instance
	 */
	public Set withMwiEnable(Boolean mwiEnable) {
		this.mwiEnable = mwiEnable;
		return this;
	}

	/**
	 * Get the enables or disables Visual Message Waiting Indication.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isVmwIEnable() {
		return vmwIEnable;
	}

	/**
	 * Set the enables or disables Visual Message Waiting Indication.
	 *
	 * @since 2.0
	 * @param vmwIEnable the input value
	 */
	public void  setVmwIEnable(Boolean vmwIEnable) {
		this.vmwIEnable = vmwIEnable;
	}

	/**
	 * Set the enables or disables Visual Message Waiting Indication.
	 *
	 * @since 2.0
	 * @param vmwIEnable the input value
	 * @return this instance
	 */
	public Set withVmwIEnable(Boolean vmwIEnable) {
		this.vmwIEnable = vmwIEnable;
		return this;
	}

	/**
	 * Get the indicates the number of messages which are currently waiting on this line as known by the CPE.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLineMessagesWaiting() {
		return lineMessagesWaiting;
	}

	/**
	 * Set the indicates the number of messages which are currently waiting on this line as known by the CPE.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 * @param lineMessagesWaiting the input value
	 */
	public void  setLineMessagesWaiting(Long lineMessagesWaiting) {
		this.lineMessagesWaiting = lineMessagesWaiting;
	}

	/**
	 * Set the indicates the number of messages which are currently waiting on this line as known by the CPE.

This parameter SHOULD NOT be present if the CPE does not support MWI.
	 *
	 * @since 2.0
	 * @param lineMessagesWaiting the input value
	 * @return this instance
	 */
	public Set withLineMessagesWaiting(Long lineMessagesWaiting) {
		this.lineMessagesWaiting = lineMessagesWaiting;
		return this;
	}

	/**
	 * Get the enable or disable Anonymous Call Block capability in the endpoint (ACR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call Block capability.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAnonymousCallRejectionEnable() {
		return anonymousCallRejectionEnable;
	}

	/**
	 * Set the enable or disable Anonymous Call Block capability in the endpoint (ACR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call Block capability.
	 *
	 * @since 2.0
	 * @param anonymousCallRejectionEnable the input value
	 */
	public void  setAnonymousCallRejectionEnable(Boolean anonymousCallRejectionEnable) {
		this.anonymousCallRejectionEnable = anonymousCallRejectionEnable;
	}

	/**
	 * Set the enable or disable Anonymous Call Block capability in the endpoint (ACR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call Block capability.
	 *
	 * @since 2.0
	 * @param anonymousCallRejectionEnable the input value
	 * @return this instance
	 */
	public Set withAnonymousCallRejectionEnable(Boolean anonymousCallRejectionEnable) {
		this.anonymousCallRejectionEnable = anonymousCallRejectionEnable;
		return this;
	}

	/**
	 * Get the enable or disable Anonymous Call capability in the endpoint (CLIR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call capability.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAnonymousCallEnable() {
		return anonymousCallEnable;
	}

	/**
	 * Set the enable or disable Anonymous Call capability in the endpoint (CLIR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call capability.
	 *
	 * @since 2.0
	 * @param anonymousCallEnable the input value
	 */
	public void  setAnonymousCallEnable(Boolean anonymousCallEnable) {
		this.anonymousCallEnable = anonymousCallEnable;
	}

	/**
	 * Set the enable or disable Anonymous Call capability in the endpoint (CLIR).

This parameter SHOULD NOT be present if the CPE does not support endpoint based Anonymous Call capability.
	 *
	 * @since 2.0
	 * @param anonymousCallEnable the input value
	 * @return this instance
	 */
	public Set withAnonymousCallEnable(Boolean anonymousCallEnable) {
		this.anonymousCallEnable = anonymousCallEnable;
		return this;
	}

	/**
	 * Get the enable or disable Do Not Disturb capability in the Endpoint. When enabled, all calls are forwarded to voice mail.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Do Not Disturb capability.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDonotDisturbEnable() {
		return donotDisturbEnable;
	}

	/**
	 * Set the enable or disable Do Not Disturb capability in the Endpoint. When enabled, all calls are forwarded to voice mail.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Do Not Disturb capability.
	 *
	 * @since 2.0
	 * @param donotDisturbEnable the input value
	 */
	public void  setDonotDisturbEnable(Boolean donotDisturbEnable) {
		this.donotDisturbEnable = donotDisturbEnable;
	}

	/**
	 * Set the enable or disable Do Not Disturb capability in the Endpoint. When enabled, all calls are forwarded to voice mail.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Do Not Disturb capability.
	 *
	 * @since 2.0
	 * @param donotDisturbEnable the input value
	 * @return this instance
	 */
	public Set withDonotDisturbEnable(Boolean donotDisturbEnable) {
		this.donotDisturbEnable = donotDisturbEnable;
		return this;
	}

	/**
	 * Get the enable or disable Repeat Dial capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Repeat Dial capability.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRepeatDialEnable() {
		return repeatDialEnable;
	}

	/**
	 * Set the enable or disable Repeat Dial capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Repeat Dial capability.
	 *
	 * @since 2.0
	 * @param repeatDialEnable the input value
	 */
	public void  setRepeatDialEnable(Boolean repeatDialEnable) {
		this.repeatDialEnable = repeatDialEnable;
	}

	/**
	 * Set the enable or disable Repeat Dial capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Repeat Dial capability.
	 *
	 * @since 2.0
	 * @param repeatDialEnable the input value
	 * @return this instance
	 */
	public Set withRepeatDialEnable(Boolean repeatDialEnable) {
		this.repeatDialEnable = repeatDialEnable;
		return this;
	}

	/**
	 * Get the enable or disable Voice Mail capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Voice Mail capability.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isVoiceMailEnable() {
		return voiceMailEnable;
	}

	/**
	 * Set the enable or disable Voice Mail capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Voice Mail capability.
	 *
	 * @since 2.0
	 * @param voiceMailEnable the input value
	 */
	public void  setVoiceMailEnable(Boolean voiceMailEnable) {
		this.voiceMailEnable = voiceMailEnable;
	}

	/**
	 * Set the enable or disable Voice Mail capability in the Endpoint.

This parameter SHOULD NOT be present if the CPE does not support Endpoint based Voice Mail capability.
	 *
	 * @since 2.0
	 * @param voiceMailEnable the input value
	 * @return this instance
	 */
	public Set withVoiceMailEnable(Boolean voiceMailEnable) {
		this.voiceMailEnable = voiceMailEnable;
		return this;
	}

	/**
	 * Get the enable or disable Call Interception capability in the Endpoint.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallPickUpEnable() {
		return callPickUpEnable;
	}

	/**
	 * Set the enable or disable Call Interception capability in the Endpoint.
	 *
	 * @since 2.0
	 * @param callPickUpEnable the input value
	 */
	public void  setCallPickUpEnable(Boolean callPickUpEnable) {
		this.callPickUpEnable = callPickUpEnable;
	}

	/**
	 * Set the enable or disable Call Interception capability in the Endpoint.
	 *
	 * @since 2.0
	 * @param callPickUpEnable the input value
	 * @return this instance
	 */
	public Set withCallPickUpEnable(Boolean callPickUpEnable) {
		this.callPickUpEnable = callPickUpEnable;
		return this;
	}

	/**
	 * Get the enable or disable automatic recall on busy (Completion of Calls to Busy Subscriber) capability in the Endpoint.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCcbSEnable() {
		return ccbSEnable;
	}

	/**
	 * Set the enable or disable automatic recall on busy (Completion of Calls to Busy Subscriber) capability in the Endpoint.
	 *
	 * @since 2.0
	 * @param ccbSEnable the input value
	 */
	public void  setCcbSEnable(Boolean ccbSEnable) {
		this.ccbSEnable = ccbSEnable;
	}

	/**
	 * Set the enable or disable automatic recall on busy (Completion of Calls to Busy Subscriber) capability in the Endpoint.
	 *
	 * @since 2.0
	 * @param ccbSEnable the input value
	 * @return this instance
	 */
	public Set withCcbSEnable(Boolean ccbSEnable) {
		this.ccbSEnable = ccbSEnable;
		return this;
	}

	/**
	 * Get the enable or disable successive forwarding (Inhibition of Incoming Forwarded Calls) from the Endpoint.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIifCEnable() {
		return iifCEnable;
	}

	/**
	 * Set the enable or disable successive forwarding (Inhibition of Incoming Forwarded Calls) from the Endpoint.
	 *
	 * @since 2.0
	 * @param iifCEnable the input value
	 */
	public void  setIifCEnable(Boolean iifCEnable) {
		this.iifCEnable = iifCEnable;
	}

	/**
	 * Set the enable or disable successive forwarding (Inhibition of Incoming Forwarded Calls) from the Endpoint.
	 *
	 * @since 2.0
	 * @param iifCEnable the input value
	 * @return this instance
	 */
	public Set withIifCEnable(Boolean iifCEnable) {
		this.iifCEnable = iifCEnable;
		return this;
	}

	/**
	 * Get allow or block any internal forward to the Endpoint.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isBlockForwardEnable() {
		return blockForwardEnable;
	}

	/**
	 * Set allow or block any internal forward to the Endpoint.
	 *
	 * @since 2.0
	 * @param blockForwardEnable the input value
	 */
	public void  setBlockForwardEnable(Boolean blockForwardEnable) {
		this.blockForwardEnable = blockForwardEnable;
	}

	/**
	 * Set allow or block any internal forward to the Endpoint.
	 *
	 * @since 2.0
	 * @param blockForwardEnable the input value
	 * @return this instance
	 */
	public Set withBlockForwardEnable(Boolean blockForwardEnable) {
		this.blockForwardEnable = blockForwardEnable;
		return this;
	}

	/**
	 * Get the enable or disable secret identity of this Endpoint in case it initiates (on an external incoming call) a forward to another internal phone Endpoint.

If enabled, only the remote ''caller party'' can be identified (if not anonymous), not this intermediate ''via'' phone extension.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSecretForwarderEnable() {
		return secretForwarderEnable;
	}

	/**
	 * Set the enable or disable secret identity of this Endpoint in case it initiates (on an external incoming call) a forward to another internal phone Endpoint.

If enabled, only the remote ''caller party'' can be identified (if not anonymous), not this intermediate ''via'' phone extension.
	 *
	 * @since 2.0
	 * @param secretForwarderEnable the input value
	 */
	public void  setSecretForwarderEnable(Boolean secretForwarderEnable) {
		this.secretForwarderEnable = secretForwarderEnable;
	}

	/**
	 * Set the enable or disable secret identity of this Endpoint in case it initiates (on an external incoming call) a forward to another internal phone Endpoint.

If enabled, only the remote ''caller party'' can be identified (if not anonymous), not this intermediate ''via'' phone extension.
	 *
	 * @since 2.0
	 * @param secretForwarderEnable the input value
	 * @return this instance
	 */
	public Set withSecretForwarderEnable(Boolean secretForwarderEnable) {
		this.secretForwarderEnable = secretForwarderEnable;
		return this;
	}

	/**
	 * Get the enable or disable FollowMe capability in the Endpoint.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isFollowMeEnable() {
		return followMeEnable;
	}

	/**
	 * Set the enable or disable FollowMe capability in the Endpoint.
	 *
	 * @since 2.0
	 * @param followMeEnable the input value
	 */
	public void  setFollowMeEnable(Boolean followMeEnable) {
		this.followMeEnable = followMeEnable;
	}

	/**
	 * Set the enable or disable FollowMe capability in the Endpoint.
	 *
	 * @since 2.0
	 * @param followMeEnable the input value
	 * @return this instance
	 */
	public Set withFollowMeEnable(Boolean followMeEnable) {
		this.followMeEnable = followMeEnable;
		return this;
	}

	/**
	 * Get the this object defines a Call Forwarding Timed (CFT) that permit the user to forward calls to particular destinations depending on the time of day.

Note: a bad configuration (e.g. timeslots overlapping) could cause unexpected behavior.
	 *
	 * @return the value
	 */
	public Collection<CFT> getCfts() {
		if (this.cfts == null){ this.cfts=new ArrayList<>();}
		return cfts;
	}

	/**
	 * Set the this object defines a Call Forwarding Timed (CFT) that permit the user to forward calls to particular destinations depending on the time of day.

Note: a bad configuration (e.g. timeslots overlapping) could cause unexpected behavior.
	 *
	 * @param cfts the input value
	 */
	public void  setCfts(Collection<CFT> cfts) {
		this.cfts = cfts;
	}

	/**
	 * Set the this object defines a Call Forwarding Timed (CFT) that permit the user to forward calls to particular destinations depending on the time of day.

Note: a bad configuration (e.g. timeslots overlapping) could cause unexpected behavior.
	 *
	 * @param cft the input value
	 * @return this instance
	 */
	public Set withCFT(CFT cft) {
		getCfts().add(cft);
		return this;
	}

	/**
	 * Get the this object defines a Selective Call Forwarding (SCF) that permit the user to forward calls to different destinations depending on the calling number.
	 *
	 * @return the value
	 */
	public Collection<SCF> getScfs() {
		if (this.scfs == null){ this.scfs=new ArrayList<>();}
		return scfs;
	}

	/**
	 * Set the this object defines a Selective Call Forwarding (SCF) that permit the user to forward calls to different destinations depending on the calling number.
	 *
	 * @param scfs the input value
	 */
	public void  setScfs(Collection<SCF> scfs) {
		this.scfs = scfs;
	}

	/**
	 * Set the this object defines a Selective Call Forwarding (SCF) that permit the user to forward calls to different destinations depending on the calling number.
	 *
	 * @param scf the input value
	 * @return this instance
	 */
	public Set withSCF(SCF scf) {
		getScfs().add(scf);
		return this;
	}

	/**
	 * Get the this object defines a Selective Call Rejection (SCREJ) that permit the user to selectively reject calls depending on the calling number.
	 *
	 * @return the value
	 */
	public Collection<SCREJ> getScrEJs() {
		if (this.scrEJs == null){ this.scrEJs=new ArrayList<>();}
		return scrEJs;
	}

	/**
	 * Set the this object defines a Selective Call Rejection (SCREJ) that permit the user to selectively reject calls depending on the calling number.
	 *
	 * @param scrEJs the input value
	 */
	public void  setScrEJs(Collection<SCREJ> scrEJs) {
		this.scrEJs = scrEJs;
	}

	/**
	 * Set the this object defines a Selective Call Rejection (SCREJ) that permit the user to selectively reject calls depending on the calling number.
	 *
	 * @param scrEJ the input value
	 * @return this instance
	 */
	public Set withSCREJ(SCREJ scrEJ) {
		getScrEJs().add(scrEJ);
		return this;
	}

	/**
	 * Get the this object defines the FollowMe destinations mapping definition, in the provided sequence order.
	 *
	 * @return the value
	 */
	public Collection<FollowMe> getFollowMes() {
		if (this.followMes == null){ this.followMes=new ArrayList<>();}
		return followMes;
	}

	/**
	 * Set the this object defines the FollowMe destinations mapping definition, in the provided sequence order.
	 *
	 * @param followMes the input value
	 */
	public void  setFollowMes(Collection<FollowMe> followMes) {
		this.followMes = followMes;
	}

	/**
	 * Set the this object defines the FollowMe destinations mapping definition, in the provided sequence order.
	 *
	 * @param followMe the input value
	 * @return this instance
	 */
	public Set withFollowMe(FollowMe followMe) {
		getFollowMes().add(followMe);
		return this;
	}

	/**
	 * Get the voice to mail specific attributes. Applies only if {{param|#.VoiceMailEnable}} is set to {{true}}.
	 *
	 * @return the value
	 */
	public Voice2Mail getVoice2Mail() {
		return voice2Mail;
	}

	/**
	 * Set the voice to mail specific attributes. Applies only if {{param|#.VoiceMailEnable}} is set to {{true}}.
	 *
	 * @param voice2Mail the input value
	 */
	public void  setVoice2Mail(Voice2Mail voice2Mail) {
		this.voice2Mail = voice2Mail;
	}

	/**
	 * Set the voice to mail specific attributes. Applies only if {{param|#.VoiceMailEnable}} is set to {{true}}.
	 *
	 * @param voice2Mail the input value
	 * @return this instance
	 */
	public Set withVoice2Mail(Voice2Mail voice2Mail) {
		this.voice2Mail = voice2Mail;
		return this;
	}

	//</editor-fold>

}