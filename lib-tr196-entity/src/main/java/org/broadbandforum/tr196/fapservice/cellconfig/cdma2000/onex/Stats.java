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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains 1x FAP statistics aggregated over all connections of all users over all sectors.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.Stats.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.Stats")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * Total number of registration attempts
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrationAttempts")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long registrationAttempts;
	/**
	 * Total number of registrations failed
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrationFails")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long registrationFails;
	/**
	 * Unauthorized registrations blocked by admission control
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrationsBlocked")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long registrationsBlocked;
	/**
	 * Total number of attemots to page requests received from the core
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PageAttempts")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long pageAttempts;
	/**
	 * Total number of page requests rejected or not responded
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PageFails")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long pageFails;
	/**
	 * Total number of voice call attempts
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoiceCallAttempts")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long voiceCallAttempts;
	/**
	 * Total number of voice call attempts which failed for various reasons
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoiceCallFailures")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long voiceCallFailures;
	/**
	 * Total number of voice calls blocked due to lack of authorization
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoiceCallsBlocked")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long voiceCallsBlocked;
	/**
	 * Number of voice calls dropped due to various reasons other than a normal call release
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoiceCallsDropped")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long voiceCallsDropped;
	/**
	 * Total number of data call attempts
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DataCallAttempts")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long dataCallAttempts;
	/**
	 * Total number of data call attemots failed for various reasons
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DataCallFailures")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long dataCallFailures;
	/**
	 * Total number of data calls failed due to lack of authorization
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DataCallsBlocked")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long dataCallsBlocked;
	/**
	 * Total number of data calls dropped due to reasons other than a normal release.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DataCallsDropped")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long dataCallsDropped;
	/**
	 * Average voice call duration in milliseconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageVoiceCall")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	@Size(min = 0, max = -1)
	public Long averageVoiceCall;
	/**
	 * Average data call duration in milliseconds
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageDataCall")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	@Size(min = 0, max = -1)
	public Long averageDataCall;
	/**
	 * Average session duration in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageSessionInSec")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	@Size(min = 0, max = -1)
	public Long averageSessionInSec;
	/**
	 * Total number of successful voice calls
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalVoiceCalls")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	@Size(min = 0, max = -1)
	public Long totalVoiceCalls;
	/**
	 * Total number of successful data calls
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalDataCalls")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long totalDataCalls;
	/**
	 * Percentage of voice packets dropped in MAC due to signaling
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FwdVoicePacketDropPercentage")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long fwdVoicePacketDropPercentage;
	/**
	 * Percentage of voice packets received with bad FQI
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RevVoicePacketDropPercentage")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long revVoicePacketDropPercentage;
	/**
	 * Average data rate of the scheduler on the forward link
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FwdAvgDataRate")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long fwdAvgDataRate;
	/**
	 * Average data rate of the scheduler on reverse link
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RevAvgDataRate")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long revAvgDataRate;
	/**
	 * Num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BcIndexZeroToOneTransitions")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long bcindexZeroToOneTransitions;
	/**
	 * Num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BcIndexOneToZeroTransitions")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = -1)
	public Long bcindexOneToZeroTransitions;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of registration attempts
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegistrationAttempts() {
		return registrationAttempts;
	}

	/**
	 * Set the total number of registration attempts
	 *
	 * @since 2.0
	 * @param registrationAttempts the input value
	 */
	public void  setRegistrationAttempts(Long registrationAttempts) {
		this.registrationAttempts = registrationAttempts;
	}

	/**
	 * Set the total number of registration attempts
	 *
	 * @since 2.0
	 * @param registrationAttempts the input value
	 * @return this instance
	 */
	public Stats withRegistrationAttempts(Long registrationAttempts) {
		this.registrationAttempts = registrationAttempts;
		return this;
	}

	/**
	 * Get the total number of registrations failed
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegistrationFails() {
		return registrationFails;
	}

	/**
	 * Set the total number of registrations failed
	 *
	 * @since 2.0
	 * @param registrationFails the input value
	 */
	public void  setRegistrationFails(Long registrationFails) {
		this.registrationFails = registrationFails;
	}

	/**
	 * Set the total number of registrations failed
	 *
	 * @since 2.0
	 * @param registrationFails the input value
	 * @return this instance
	 */
	public Stats withRegistrationFails(Long registrationFails) {
		this.registrationFails = registrationFails;
		return this;
	}

	/**
	 * Get the unauthorized registrations blocked by admission control
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegistrationsBlocked() {
		return registrationsBlocked;
	}

	/**
	 * Set the unauthorized registrations blocked by admission control
	 *
	 * @since 2.0
	 * @param registrationsBlocked the input value
	 */
	public void  setRegistrationsBlocked(Long registrationsBlocked) {
		this.registrationsBlocked = registrationsBlocked;
	}

	/**
	 * Set the unauthorized registrations blocked by admission control
	 *
	 * @since 2.0
	 * @param registrationsBlocked the input value
	 * @return this instance
	 */
	public Stats withRegistrationsBlocked(Long registrationsBlocked) {
		this.registrationsBlocked = registrationsBlocked;
		return this;
	}

	/**
	 * Get the total number of attemots to page requests received from the core
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPageAttempts() {
		return pageAttempts;
	}

	/**
	 * Set the total number of attemots to page requests received from the core
	 *
	 * @since 2.0
	 * @param pageAttempts the input value
	 */
	public void  setPageAttempts(Long pageAttempts) {
		this.pageAttempts = pageAttempts;
	}

	/**
	 * Set the total number of attemots to page requests received from the core
	 *
	 * @since 2.0
	 * @param pageAttempts the input value
	 * @return this instance
	 */
	public Stats withPageAttempts(Long pageAttempts) {
		this.pageAttempts = pageAttempts;
		return this;
	}

	/**
	 * Get the total number of page requests rejected or not responded
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPageFails() {
		return pageFails;
	}

	/**
	 * Set the total number of page requests rejected or not responded
	 *
	 * @since 2.0
	 * @param pageFails the input value
	 */
	public void  setPageFails(Long pageFails) {
		this.pageFails = pageFails;
	}

	/**
	 * Set the total number of page requests rejected or not responded
	 *
	 * @since 2.0
	 * @param pageFails the input value
	 * @return this instance
	 */
	public Stats withPageFails(Long pageFails) {
		this.pageFails = pageFails;
		return this;
	}

	/**
	 * Get the total number of voice call attempts
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getVoiceCallAttempts() {
		return voiceCallAttempts;
	}

	/**
	 * Set the total number of voice call attempts
	 *
	 * @since 2.0
	 * @param voiceCallAttempts the input value
	 */
	public void  setVoiceCallAttempts(Long voiceCallAttempts) {
		this.voiceCallAttempts = voiceCallAttempts;
	}

	/**
	 * Set the total number of voice call attempts
	 *
	 * @since 2.0
	 * @param voiceCallAttempts the input value
	 * @return this instance
	 */
	public Stats withVoiceCallAttempts(Long voiceCallAttempts) {
		this.voiceCallAttempts = voiceCallAttempts;
		return this;
	}

	/**
	 * Get the total number of voice call attempts which failed for various reasons
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getVoiceCallFailures() {
		return voiceCallFailures;
	}

	/**
	 * Set the total number of voice call attempts which failed for various reasons
	 *
	 * @since 2.0
	 * @param voiceCallFailures the input value
	 */
	public void  setVoiceCallFailures(Long voiceCallFailures) {
		this.voiceCallFailures = voiceCallFailures;
	}

	/**
	 * Set the total number of voice call attempts which failed for various reasons
	 *
	 * @since 2.0
	 * @param voiceCallFailures the input value
	 * @return this instance
	 */
	public Stats withVoiceCallFailures(Long voiceCallFailures) {
		this.voiceCallFailures = voiceCallFailures;
		return this;
	}

	/**
	 * Get the total number of voice calls blocked due to lack of authorization
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getVoiceCallsBlocked() {
		return voiceCallsBlocked;
	}

	/**
	 * Set the total number of voice calls blocked due to lack of authorization
	 *
	 * @since 2.0
	 * @param voiceCallsBlocked the input value
	 */
	public void  setVoiceCallsBlocked(Long voiceCallsBlocked) {
		this.voiceCallsBlocked = voiceCallsBlocked;
	}

	/**
	 * Set the total number of voice calls blocked due to lack of authorization
	 *
	 * @since 2.0
	 * @param voiceCallsBlocked the input value
	 * @return this instance
	 */
	public Stats withVoiceCallsBlocked(Long voiceCallsBlocked) {
		this.voiceCallsBlocked = voiceCallsBlocked;
		return this;
	}

	/**
	 * Get the number of voice calls dropped due to various reasons other than a normal call release
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getVoiceCallsDropped() {
		return voiceCallsDropped;
	}

	/**
	 * Set the number of voice calls dropped due to various reasons other than a normal call release
	 *
	 * @since 2.0
	 * @param voiceCallsDropped the input value
	 */
	public void  setVoiceCallsDropped(Long voiceCallsDropped) {
		this.voiceCallsDropped = voiceCallsDropped;
	}

	/**
	 * Set the number of voice calls dropped due to various reasons other than a normal call release
	 *
	 * @since 2.0
	 * @param voiceCallsDropped the input value
	 * @return this instance
	 */
	public Stats withVoiceCallsDropped(Long voiceCallsDropped) {
		this.voiceCallsDropped = voiceCallsDropped;
		return this;
	}

	/**
	 * Get the total number of data call attempts
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDataCallAttempts() {
		return dataCallAttempts;
	}

	/**
	 * Set the total number of data call attempts
	 *
	 * @since 2.0
	 * @param dataCallAttempts the input value
	 */
	public void  setDataCallAttempts(Long dataCallAttempts) {
		this.dataCallAttempts = dataCallAttempts;
	}

	/**
	 * Set the total number of data call attempts
	 *
	 * @since 2.0
	 * @param dataCallAttempts the input value
	 * @return this instance
	 */
	public Stats withDataCallAttempts(Long dataCallAttempts) {
		this.dataCallAttempts = dataCallAttempts;
		return this;
	}

	/**
	 * Get the total number of data call attemots failed for various reasons
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDataCallFailures() {
		return dataCallFailures;
	}

	/**
	 * Set the total number of data call attemots failed for various reasons
	 *
	 * @since 2.0
	 * @param dataCallFailures the input value
	 */
	public void  setDataCallFailures(Long dataCallFailures) {
		this.dataCallFailures = dataCallFailures;
	}

	/**
	 * Set the total number of data call attemots failed for various reasons
	 *
	 * @since 2.0
	 * @param dataCallFailures the input value
	 * @return this instance
	 */
	public Stats withDataCallFailures(Long dataCallFailures) {
		this.dataCallFailures = dataCallFailures;
		return this;
	}

	/**
	 * Get the total number of data calls failed due to lack of authorization
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDataCallsBlocked() {
		return dataCallsBlocked;
	}

	/**
	 * Set the total number of data calls failed due to lack of authorization
	 *
	 * @since 2.0
	 * @param dataCallsBlocked the input value
	 */
	public void  setDataCallsBlocked(Long dataCallsBlocked) {
		this.dataCallsBlocked = dataCallsBlocked;
	}

	/**
	 * Set the total number of data calls failed due to lack of authorization
	 *
	 * @since 2.0
	 * @param dataCallsBlocked the input value
	 * @return this instance
	 */
	public Stats withDataCallsBlocked(Long dataCallsBlocked) {
		this.dataCallsBlocked = dataCallsBlocked;
		return this;
	}

	/**
	 * Get the total number of data calls dropped due to reasons other than a normal release.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDataCallsDropped() {
		return dataCallsDropped;
	}

	/**
	 * Set the total number of data calls dropped due to reasons other than a normal release.
	 *
	 * @since 2.0
	 * @param dataCallsDropped the input value
	 */
	public void  setDataCallsDropped(Long dataCallsDropped) {
		this.dataCallsDropped = dataCallsDropped;
	}

	/**
	 * Set the total number of data calls dropped due to reasons other than a normal release.
	 *
	 * @since 2.0
	 * @param dataCallsDropped the input value
	 * @return this instance
	 */
	public Stats withDataCallsDropped(Long dataCallsDropped) {
		this.dataCallsDropped = dataCallsDropped;
		return this;
	}

	/**
	 * Get average voice call duration in milliseconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAverageVoiceCall() {
		return averageVoiceCall;
	}

	/**
	 * Set average voice call duration in milliseconds.
	 *
	 * @since 2.0
	 * @param averageVoiceCall the input value
	 */
	public void  setAverageVoiceCall(Long averageVoiceCall) {
		this.averageVoiceCall = averageVoiceCall;
	}

	/**
	 * Set average voice call duration in milliseconds.
	 *
	 * @since 2.0
	 * @param averageVoiceCall the input value
	 * @return this instance
	 */
	public Stats withAverageVoiceCall(Long averageVoiceCall) {
		this.averageVoiceCall = averageVoiceCall;
		return this;
	}

	/**
	 * Get average data call duration in milliseconds
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAverageDataCall() {
		return averageDataCall;
	}

	/**
	 * Set average data call duration in milliseconds
	 *
	 * @since 2.0
	 * @param averageDataCall the input value
	 */
	public void  setAverageDataCall(Long averageDataCall) {
		this.averageDataCall = averageDataCall;
	}

	/**
	 * Set average data call duration in milliseconds
	 *
	 * @since 2.0
	 * @param averageDataCall the input value
	 * @return this instance
	 */
	public Stats withAverageDataCall(Long averageDataCall) {
		this.averageDataCall = averageDataCall;
		return this;
	}

	/**
	 * Get average session duration in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAverageSessionInSec() {
		return averageSessionInSec;
	}

	/**
	 * Set average session duration in seconds.
	 *
	 * @since 2.0
	 * @param averageSessionInSec the input value
	 */
	public void  setAverageSessionInSec(Long averageSessionInSec) {
		this.averageSessionInSec = averageSessionInSec;
	}

	/**
	 * Set average session duration in seconds.
	 *
	 * @since 2.0
	 * @param averageSessionInSec the input value
	 * @return this instance
	 */
	public Stats withAverageSessionInSec(Long averageSessionInSec) {
		this.averageSessionInSec = averageSessionInSec;
		return this;
	}

	/**
	 * Get the total number of successful voice calls
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalVoiceCalls() {
		return totalVoiceCalls;
	}

	/**
	 * Set the total number of successful voice calls
	 *
	 * @since 2.0
	 * @param totalVoiceCalls the input value
	 */
	public void  setTotalVoiceCalls(Long totalVoiceCalls) {
		this.totalVoiceCalls = totalVoiceCalls;
	}

	/**
	 * Set the total number of successful voice calls
	 *
	 * @since 2.0
	 * @param totalVoiceCalls the input value
	 * @return this instance
	 */
	public Stats withTotalVoiceCalls(Long totalVoiceCalls) {
		this.totalVoiceCalls = totalVoiceCalls;
		return this;
	}

	/**
	 * Get the total number of successful data calls
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalDataCalls() {
		return totalDataCalls;
	}

	/**
	 * Set the total number of successful data calls
	 *
	 * @since 2.0
	 * @param totalDataCalls the input value
	 */
	public void  setTotalDataCalls(Long totalDataCalls) {
		this.totalDataCalls = totalDataCalls;
	}

	/**
	 * Set the total number of successful data calls
	 *
	 * @since 2.0
	 * @param totalDataCalls the input value
	 * @return this instance
	 */
	public Stats withTotalDataCalls(Long totalDataCalls) {
		this.totalDataCalls = totalDataCalls;
		return this;
	}

	/**
	 * Get the percentage of voice packets dropped in MAC due to signaling
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFwdVoicePacketDropPercentage() {
		return fwdVoicePacketDropPercentage;
	}

	/**
	 * Set the percentage of voice packets dropped in MAC due to signaling
	 *
	 * @since 2.0
	 * @param fwdVoicePacketDropPercentage the input value
	 */
	public void  setFwdVoicePacketDropPercentage(Long fwdVoicePacketDropPercentage) {
		this.fwdVoicePacketDropPercentage = fwdVoicePacketDropPercentage;
	}

	/**
	 * Set the percentage of voice packets dropped in MAC due to signaling
	 *
	 * @since 2.0
	 * @param fwdVoicePacketDropPercentage the input value
	 * @return this instance
	 */
	public Stats withFwdVoicePacketDropPercentage(Long fwdVoicePacketDropPercentage) {
		this.fwdVoicePacketDropPercentage = fwdVoicePacketDropPercentage;
		return this;
	}

	/**
	 * Get the percentage of voice packets received with bad FQI
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRevVoicePacketDropPercentage() {
		return revVoicePacketDropPercentage;
	}

	/**
	 * Set the percentage of voice packets received with bad FQI
	 *
	 * @since 2.0
	 * @param revVoicePacketDropPercentage the input value
	 */
	public void  setRevVoicePacketDropPercentage(Long revVoicePacketDropPercentage) {
		this.revVoicePacketDropPercentage = revVoicePacketDropPercentage;
	}

	/**
	 * Set the percentage of voice packets received with bad FQI
	 *
	 * @since 2.0
	 * @param revVoicePacketDropPercentage the input value
	 * @return this instance
	 */
	public Stats withRevVoicePacketDropPercentage(Long revVoicePacketDropPercentage) {
		this.revVoicePacketDropPercentage = revVoicePacketDropPercentage;
		return this;
	}

	/**
	 * Get average data rate of the scheduler on the forward link
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFwdAvgDataRate() {
		return fwdAvgDataRate;
	}

	/**
	 * Set average data rate of the scheduler on the forward link
	 *
	 * @since 2.0
	 * @param fwdAvgDataRate the input value
	 */
	public void  setFwdAvgDataRate(Long fwdAvgDataRate) {
		this.fwdAvgDataRate = fwdAvgDataRate;
	}

	/**
	 * Set average data rate of the scheduler on the forward link
	 *
	 * @since 2.0
	 * @param fwdAvgDataRate the input value
	 * @return this instance
	 */
	public Stats withFwdAvgDataRate(Long fwdAvgDataRate) {
		this.fwdAvgDataRate = fwdAvgDataRate;
		return this;
	}

	/**
	 * Get average data rate of the scheduler on reverse link
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRevAvgDataRate() {
		return revAvgDataRate;
	}

	/**
	 * Set average data rate of the scheduler on reverse link
	 *
	 * @since 2.0
	 * @param revAvgDataRate the input value
	 */
	public void  setRevAvgDataRate(Long revAvgDataRate) {
		this.revAvgDataRate = revAvgDataRate;
	}

	/**
	 * Set average data rate of the scheduler on reverse link
	 *
	 * @since 2.0
	 * @param revAvgDataRate the input value
	 * @return this instance
	 */
	public Stats withRevAvgDataRate(Long revAvgDataRate) {
		this.revAvgDataRate = revAvgDataRate;
		return this;
	}

	/**
	 * Get the num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBcindexZeroToOneTransitions() {
		return bcindexZeroToOneTransitions;
	}

	/**
	 * Set the num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 * @param bcindexZeroToOneTransitions the input value
	 */
	public void  setBcindexZeroToOneTransitions(Long bcindexZeroToOneTransitions) {
		this.bcindexZeroToOneTransitions = bcindexZeroToOneTransitions;
	}

	/**
	 * Set the num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 * @param bcindexZeroToOneTransitions the input value
	 * @return this instance
	 */
	public Stats withBcindexZeroToOneTransitions(Long bcindexZeroToOneTransitions) {
		this.bcindexZeroToOneTransitions = bcindexZeroToOneTransitions;
		return this;
	}

	/**
	 * Get the num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBcindexOneToZeroTransitions() {
		return bcindexOneToZeroTransitions;
	}

	/**
	 * Set the num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 * @param bcindexOneToZeroTransitions the input value
	 */
	public void  setBcindexOneToZeroTransitions(Long bcindexOneToZeroTransitions) {
		this.bcindexOneToZeroTransitions = bcindexOneToZeroTransitions;
	}

	/**
	 * Set the num of times the bcIndex was changed from 0 to 1 in the Extended System Parameters Message.
	 *
	 * @since 2.0
	 * @param bcindexOneToZeroTransitions the input value
	 * @return this instance
	 */
	public Stats withBcindexOneToZeroTransitions(Long bcindexOneToZeroTransitions) {
		this.bcindexOneToZeroTransitions = bcindexOneToZeroTransitions;
		return this;
	}

	//</editor-fold>

}