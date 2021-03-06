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
package org.broadbandforum.tr104.voiceservice.callcontrol.line.stats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Statistics for outgoing calls.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.Line.{i}.Stats.OutgoingCalls.")
@XmlRootElement(name = "VoiceService.CallControl.Line.Stats.OutgoingCalls")
@XmlType(name = "VoiceService.CallControl.Line.Stats.OutgoingCalls")
@XmlAccessorType(XmlAccessType.FIELD)
public class OutgoingCalls {

	/**
	 * Total number of outgoing calls attempted from the line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallsAttempted")
	public Long callsAttempted;
	/**
	 * Total number of calls that successfully completed call setup signaling.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallsConnected")
	public Long callsConnected;
	/**
	 * Total number of calls that failed to successfully complete call setup signaling.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallsFailed")
	public Long callsFailed;
	/**
	 * Total calls that were successfully connected, but dropped unexpectedly while in progress without explicit user termination.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallsDropped")
	public Long callsDropped;
	/**
	 * Cumulative call duration in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalCallTime")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long totalCallTime;

	public OutgoingCalls() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of outgoing calls attempted from the line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallsAttempted() {
		return callsAttempted;
	}

	/**
	 * Set the total number of outgoing calls attempted from the line.
	 *
	 * @since 2.0
	 * @param callsAttempted the input value
	 */
	public void  setCallsAttempted(Long callsAttempted) {
		this.callsAttempted = callsAttempted;
	}

	/**
	 * Set the total number of outgoing calls attempted from the line.
	 *
	 * @since 2.0
	 * @param callsAttempted the input value
	 * @return this instance
	 */
	public OutgoingCalls withCallsAttempted(Long callsAttempted) {
		this.callsAttempted = callsAttempted;
		return this;
	}

	/**
	 * Get the total number of calls that successfully completed call setup signaling.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallsConnected() {
		return callsConnected;
	}

	/**
	 * Set the total number of calls that successfully completed call setup signaling.
	 *
	 * @since 2.0
	 * @param callsConnected the input value
	 */
	public void  setCallsConnected(Long callsConnected) {
		this.callsConnected = callsConnected;
	}

	/**
	 * Set the total number of calls that successfully completed call setup signaling.
	 *
	 * @since 2.0
	 * @param callsConnected the input value
	 * @return this instance
	 */
	public OutgoingCalls withCallsConnected(Long callsConnected) {
		this.callsConnected = callsConnected;
		return this;
	}

	/**
	 * Get the total number of calls that failed to successfully complete call setup signaling.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallsFailed() {
		return callsFailed;
	}

	/**
	 * Set the total number of calls that failed to successfully complete call setup signaling.
	 *
	 * @since 2.0
	 * @param callsFailed the input value
	 */
	public void  setCallsFailed(Long callsFailed) {
		this.callsFailed = callsFailed;
	}

	/**
	 * Set the total number of calls that failed to successfully complete call setup signaling.
	 *
	 * @since 2.0
	 * @param callsFailed the input value
	 * @return this instance
	 */
	public OutgoingCalls withCallsFailed(Long callsFailed) {
		this.callsFailed = callsFailed;
		return this;
	}

	/**
	 * Get the total calls that were successfully connected, but dropped unexpectedly while in progress without explicit user termination.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallsDropped() {
		return callsDropped;
	}

	/**
	 * Set the total calls that were successfully connected, but dropped unexpectedly while in progress without explicit user termination.
	 *
	 * @since 2.0
	 * @param callsDropped the input value
	 */
	public void  setCallsDropped(Long callsDropped) {
		this.callsDropped = callsDropped;
	}

	/**
	 * Set the total calls that were successfully connected, but dropped unexpectedly while in progress without explicit user termination.
	 *
	 * @since 2.0
	 * @param callsDropped the input value
	 * @return this instance
	 */
	public OutgoingCalls withCallsDropped(Long callsDropped) {
		this.callsDropped = callsDropped;
		return this;
	}

	/**
	 * Get the cumulative call duration in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalCallTime() {
		return totalCallTime;
	}

	/**
	 * Set the cumulative call duration in seconds.
	 *
	 * @since 2.0
	 * @param totalCallTime the input value
	 */
	public void  setTotalCallTime(Long totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	/**
	 * Set the cumulative call duration in seconds.
	 *
	 * @since 2.0
	 * @param totalCallTime the input value
	 * @return this instance
	 */
	public OutgoingCalls withTotalCallTime(Long totalCallTime) {
		this.totalCallTime = totalCallTime;
		return this;
	}

	//</editor-fold>

}