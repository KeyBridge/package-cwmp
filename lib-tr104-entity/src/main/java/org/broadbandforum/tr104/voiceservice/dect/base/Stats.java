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
package org.broadbandforum.tr104.voiceservice.dect.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is associated with statistics collected from the DECT domain of the CPE. The collected statistics are common for all call scenarios. 

The CPE MUST reset the DECT base's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the base becomes operationally down due to a previous administrative down (i.e. the base's {{param|#.Status}} parameter transitions to a down state after the base is disabled) or when the base becomes administratively up (i.e. the base's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.DECT.Base.{i}.Stats.")
@XmlRootElement(name = "VoiceService.DECT.Base.Stats")
@XmlType(name = "VoiceService.DECT.Base.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The count of all successful handovers.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Handovers")
	@CWMPParameter(activeNotify = "canDeny")
	public Long handovers;
	/**
	 * The count of all failed handovers.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HandoverFailures")
	@CWMPParameter(activeNotify = "canDeny")
	public Long handoverFailures;
	/**
	 * The count of all bad A-field packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ControlFieldErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long controlFieldErrors;
	/**
	 * The count of all bad B-field packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PayloadFieldErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long payloadFieldErrors;
	/**
	 * The count of all synchronization failures during all calls.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SyncFailures")
	@CWMPParameter(activeNotify = "canDeny")
	public Long syncFailures;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the count of all successful handovers.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHandovers() {
		return handovers;
	}

	/**
	 * Set the count of all successful handovers.
	 *
	 * @since 2.0
	 * @param handovers the input value
	 */
	public void  setHandovers(Long handovers) {
		this.handovers = handovers;
	}

	/**
	 * Set the count of all successful handovers.
	 *
	 * @since 2.0
	 * @param handovers the input value
	 * @return this instance
	 */
	public Stats withHandovers(Long handovers) {
		this.handovers = handovers;
		return this;
	}

	/**
	 * Get the count of all failed handovers.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHandoverFailures() {
		return handoverFailures;
	}

	/**
	 * Set the count of all failed handovers.
	 *
	 * @since 2.0
	 * @param handoverFailures the input value
	 */
	public void  setHandoverFailures(Long handoverFailures) {
		this.handoverFailures = handoverFailures;
	}

	/**
	 * Set the count of all failed handovers.
	 *
	 * @since 2.0
	 * @param handoverFailures the input value
	 * @return this instance
	 */
	public Stats withHandoverFailures(Long handoverFailures) {
		this.handoverFailures = handoverFailures;
		return this;
	}

	/**
	 * Get the count of all bad A-field packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getControlFieldErrors() {
		return controlFieldErrors;
	}

	/**
	 * Set the count of all bad A-field packets.
	 *
	 * @since 2.0
	 * @param controlFieldErrors the input value
	 */
	public void  setControlFieldErrors(Long controlFieldErrors) {
		this.controlFieldErrors = controlFieldErrors;
	}

	/**
	 * Set the count of all bad A-field packets.
	 *
	 * @since 2.0
	 * @param controlFieldErrors the input value
	 * @return this instance
	 */
	public Stats withControlFieldErrors(Long controlFieldErrors) {
		this.controlFieldErrors = controlFieldErrors;
		return this;
	}

	/**
	 * Get the count of all bad B-field packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPayloadFieldErrors() {
		return payloadFieldErrors;
	}

	/**
	 * Set the count of all bad B-field packets.
	 *
	 * @since 2.0
	 * @param payloadFieldErrors the input value
	 */
	public void  setPayloadFieldErrors(Long payloadFieldErrors) {
		this.payloadFieldErrors = payloadFieldErrors;
	}

	/**
	 * Set the count of all bad B-field packets.
	 *
	 * @since 2.0
	 * @param payloadFieldErrors the input value
	 * @return this instance
	 */
	public Stats withPayloadFieldErrors(Long payloadFieldErrors) {
		this.payloadFieldErrors = payloadFieldErrors;
		return this;
	}

	/**
	 * Get the count of all synchronization failures during all calls.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSyncFailures() {
		return syncFailures;
	}

	/**
	 * Set the count of all synchronization failures during all calls.
	 *
	 * @since 2.0
	 * @param syncFailures the input value
	 */
	public void  setSyncFailures(Long syncFailures) {
		this.syncFailures = syncFailures;
	}

	/**
	 * Set the count of all synchronization failures during all calls.
	 *
	 * @since 2.0
	 * @param syncFailures the input value
	 * @return this instance
	 */
	public Stats withSyncFailures(Long syncFailures) {
		this.syncFailures = syncFailures;
		return this;
	}

	//</editor-fold>

}