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
package org.broadbandforum.tr104.voiceservice.pots.fxs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Parameters related to voice processing (analogue/digital conversion) capabilities.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.POTS.FXS.{i}.VoiceProcessing.")
@XmlRootElement(name = "VoiceService.POTS.FXS.VoiceProcessing")
@XmlType(name = "VoiceService.POTS.FXS.VoiceProcessing")
@XmlAccessorType(XmlAccessType.FIELD)
public class VoiceProcessing {

	/**
	 * Gain in 0.1 dB to apply to the transmitted voice signal prior to encoding.  This gain is a modifier of the default transmit-gain, which is unspecified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmitGain")
	@CWMPParameter(access = "readWrite", units = "0.1 dB")
	public Integer transmitGain;
	/**
	 * Gain in 0.1 dB to apply to the received voice signal after decoding.  This gain is a modifier of the default receive-gain, which is unspecified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceiveGain")
	@CWMPParameter(access = "readWrite", units = "0.1 dB")
	public Integer receiveGain;
	/**
	 * Enable or disable echo cancellation for this line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EchoCancellationEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean echoCancellationEnable;
	/**
	 * Indication of whether or not echo cancellation is currently in use for this line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EchoCancellationInUse")
	public Boolean echoCancellationInUse;
	/**
	 * Tail length in milliseconds of the echo canceller associated with this line (whether or not it is currently in use).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EchoCancellationTail")
	public Long echoCancellationTail;

	public VoiceProcessing() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the gain in 0.1 dB to apply to the transmitted voice signal prior to encoding.  This gain is a modifier of the default transmit-gain, which is unspecified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTransmitGain() {
		return transmitGain;
	}

	/**
	 * Set the gain in 0.1 dB to apply to the transmitted voice signal prior to encoding.  This gain is a modifier of the default transmit-gain, which is unspecified.
	 *
	 * @since 2.0
	 * @param transmitGain the input value
	 */
	public void  setTransmitGain(Integer transmitGain) {
		this.transmitGain = transmitGain;
	}

	/**
	 * Set the gain in 0.1 dB to apply to the transmitted voice signal prior to encoding.  This gain is a modifier of the default transmit-gain, which is unspecified.
	 *
	 * @since 2.0
	 * @param transmitGain the input value
	 * @return this instance
	 */
	public VoiceProcessing withTransmitGain(Integer transmitGain) {
		this.transmitGain = transmitGain;
		return this;
	}

	/**
	 * Get the gain in 0.1 dB to apply to the received voice signal after decoding.  This gain is a modifier of the default receive-gain, which is unspecified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getReceiveGain() {
		return receiveGain;
	}

	/**
	 * Set the gain in 0.1 dB to apply to the received voice signal after decoding.  This gain is a modifier of the default receive-gain, which is unspecified.
	 *
	 * @since 2.0
	 * @param receiveGain the input value
	 */
	public void  setReceiveGain(Integer receiveGain) {
		this.receiveGain = receiveGain;
	}

	/**
	 * Set the gain in 0.1 dB to apply to the received voice signal after decoding.  This gain is a modifier of the default receive-gain, which is unspecified.
	 *
	 * @since 2.0
	 * @param receiveGain the input value
	 * @return this instance
	 */
	public VoiceProcessing withReceiveGain(Integer receiveGain) {
		this.receiveGain = receiveGain;
		return this;
	}

	/**
	 * Get the enable or disable echo cancellation for this line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEchoCancellationEnable() {
		return echoCancellationEnable;
	}

	/**
	 * Set the enable or disable echo cancellation for this line.
	 *
	 * @since 2.0
	 * @param echoCancellationEnable the input value
	 */
	public void  setEchoCancellationEnable(Boolean echoCancellationEnable) {
		this.echoCancellationEnable = echoCancellationEnable;
	}

	/**
	 * Set the enable or disable echo cancellation for this line.
	 *
	 * @since 2.0
	 * @param echoCancellationEnable the input value
	 * @return this instance
	 */
	public VoiceProcessing withEchoCancellationEnable(Boolean echoCancellationEnable) {
		this.echoCancellationEnable = echoCancellationEnable;
		return this;
	}

	/**
	 * Get the indication of whether or not echo cancellation is currently in use for this line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEchoCancellationInUse() {
		return echoCancellationInUse;
	}

	/**
	 * Set the indication of whether or not echo cancellation is currently in use for this line.
	 *
	 * @since 2.0
	 * @param echoCancellationInUse the input value
	 */
	public void  setEchoCancellationInUse(Boolean echoCancellationInUse) {
		this.echoCancellationInUse = echoCancellationInUse;
	}

	/**
	 * Set the indication of whether or not echo cancellation is currently in use for this line.
	 *
	 * @since 2.0
	 * @param echoCancellationInUse the input value
	 * @return this instance
	 */
	public VoiceProcessing withEchoCancellationInUse(Boolean echoCancellationInUse) {
		this.echoCancellationInUse = echoCancellationInUse;
		return this;
	}

	/**
	 * Get the tail length in milliseconds of the echo canceller associated with this line (whether or not it is currently in use).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEchoCancellationTail() {
		return echoCancellationTail;
	}

	/**
	 * Set the tail length in milliseconds of the echo canceller associated with this line (whether or not it is currently in use).
	 *
	 * @since 2.0
	 * @param echoCancellationTail the input value
	 */
	public void  setEchoCancellationTail(Long echoCancellationTail) {
		this.echoCancellationTail = echoCancellationTail;
	}

	/**
	 * Set the tail length in milliseconds of the echo canceller associated with this line (whether or not it is currently in use).
	 *
	 * @since 2.0
	 * @param echoCancellationTail the input value
	 * @return this instance
	 */
	public VoiceProcessing withEchoCancellationTail(Long echoCancellationTail) {
		this.echoCancellationTail = echoCancellationTail;
		return this;
	}

	//</editor-fold>

}