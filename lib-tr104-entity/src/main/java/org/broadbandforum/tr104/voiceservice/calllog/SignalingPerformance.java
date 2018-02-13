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
package org.broadbandforum.tr104.voiceservice.calllog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This table contains signaling performance statistics for each protocol involved in the call.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.SignalingPerformance.{i}.")
@XmlRootElement(name = "VoiceService.CallLog.SignalingPerformance")
@XmlType(name = "VoiceService.CallLog.SignalingPerformance")
@XmlAccessorType(XmlAccessType.FIELD)
public class SignalingPerformance {

	/**
	 * Protocol for which this signaling performance statistics are available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Protocol")
	public String protocol;
	/**
	 * The time between the instant a system receives a call attempt and the instant of invitation of ringing at the call receiver end instrument in milliseconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallSetupDelay")
	public Long callSetupDelay;
	/**
	 * The time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes out the CPE

The value could be negative if a media packet is sent before the connection establishment.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutgoingMediaEstablishDelay")
	public Integer outgoingMediaEstablishDelay;
	/**
	 * The time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes into the CPE

The value could be negative if a media packet arrives before the connection establishment.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IncomingMediaEstablishDelay")
	public Integer incomingMediaEstablishDelay;

	public SignalingPerformance() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the protocol for which this signaling performance statistics are available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the protocol for which this signaling performance statistics are available.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the protocol for which this signaling performance statistics are available.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 * @return this instance
	 */
	public SignalingPerformance withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the time between the instant a system receives a call attempt and the instant of invitation of ringing at the call receiver end instrument in milliseconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallSetupDelay() {
		return callSetupDelay;
	}

	/**
	 * Set the time between the instant a system receives a call attempt and the instant of invitation of ringing at the call receiver end instrument in milliseconds.
	 *
	 * @since 2.0
	 * @param callSetupDelay the input value
	 */
	public void  setCallSetupDelay(Long callSetupDelay) {
		this.callSetupDelay = callSetupDelay;
	}

	/**
	 * Set the time between the instant a system receives a call attempt and the instant of invitation of ringing at the call receiver end instrument in milliseconds.
	 *
	 * @since 2.0
	 * @param callSetupDelay the input value
	 * @return this instance
	 */
	public SignalingPerformance withCallSetupDelay(Long callSetupDelay) {
		this.callSetupDelay = callSetupDelay;
		return this;
	}

	/**
	 * Get the time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes out the CPE

The value could be negative if a media packet is sent before the connection establishment.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOutgoingMediaEstablishDelay() {
		return outgoingMediaEstablishDelay;
	}

	/**
	 * Set the time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes out the CPE

The value could be negative if a media packet is sent before the connection establishment.
	 *
	 * @since 2.0
	 * @param outgoingMediaEstablishDelay the input value
	 */
	public void  setOutgoingMediaEstablishDelay(Integer outgoingMediaEstablishDelay) {
		this.outgoingMediaEstablishDelay = outgoingMediaEstablishDelay;
	}

	/**
	 * Set the time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes out the CPE

The value could be negative if a media packet is sent before the connection establishment.
	 *
	 * @since 2.0
	 * @param outgoingMediaEstablishDelay the input value
	 * @return this instance
	 */
	public SignalingPerformance withOutgoingMediaEstablishDelay(Integer outgoingMediaEstablishDelay) {
		this.outgoingMediaEstablishDelay = outgoingMediaEstablishDelay;
		return this;
	}

	/**
	 * Get the time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes into the CPE

The value could be negative if a media packet arrives before the connection establishment.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getIncomingMediaEstablishDelay() {
		return incomingMediaEstablishDelay;
	}

	/**
	 * Set the time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes into the CPE

The value could be negative if a media packet arrives before the connection establishment.
	 *
	 * @since 2.0
	 * @param incomingMediaEstablishDelay the input value
	 */
	public void  setIncomingMediaEstablishDelay(Integer incomingMediaEstablishDelay) {
		this.incomingMediaEstablishDelay = incomingMediaEstablishDelay;
	}

	/**
	 * Set the time in milliseconds between :

:- the instant a system has received information that the called party is connected

:- the instant the first media packet goes into the CPE

The value could be negative if a media packet arrives before the connection establishment.
	 *
	 * @since 2.0
	 * @param incomingMediaEstablishDelay the input value
	 * @return this instance
	 */
	public SignalingPerformance withIncomingMediaEstablishDelay(Integer incomingMediaEstablishDelay) {
		this.incomingMediaEstablishDelay = incomingMediaEstablishDelay;
		return this;
	}

	//</editor-fold>

}