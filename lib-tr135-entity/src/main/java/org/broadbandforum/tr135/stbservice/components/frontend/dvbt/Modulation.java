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
package org.broadbandforum.tr135.stbservice.components.frontend.dvbt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * DVB-T modulation details.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.Modulation.")
@XmlRootElement(name = "Modulation")
@XmlType(name = "STBService.Components.FrontEnd.DVBT.Modulation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Modulation {

	/**
	 * Indicates the current frequency in kHz.

The value of this parameter is undefined while installing the service list (see {{object|.Components.FrontEnd.{i}.DVBT.Install}}).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Frequency")
	@CWMPParameter(access = "readWrite", units = "kHz")
	public Long frequency;
	/**
	 * Indicates the channel bandwidth in use.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ChannelBandwidth")
	@CWMPParameter(access = "readWrite")
	public String channelBandwidth;
	/**
	 * Indicates the current constellation in use.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Constellation")
	@CWMPParameter(access = "readWrite")
	public String constellation;
	/**
	 * Hierarchical parameter alpha. The higher the value of alpha, the more noise-immune the High Priority Modulation is.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HierarchicalInformation")
	@CWMPParameter(access = "readWrite")
	public String hierarchicalInformation;
	/**
	 * Indicates the current code rate in use. Code rate applies to HP in case of hierarchical coding.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CodeRateHP")
	@CWMPParameter(access = "readWrite")
	public String codeRateHP;
	/**
	 * Indicates the current code rate in use. Code rate applies to LP in case of hierarchical coding.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CodeRateLP")
	@CWMPParameter(access = "readWrite")
	public String codeRateLP;
	/**
	 * Indicates the current guard interval in use.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GuardInterval")
	@CWMPParameter(access = "readWrite")
	public String guardInterval;
	/**
	 * Indicates the number of carriers in an OFDM frame.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TransmissionMode")
	@CWMPParameter(access = "readWrite")
	public String transmissionMode;
	/**
	 * Signal/Noise ratio in the carrier band, measured in dB.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SNR")
	@CWMPParameter(activeNotify = "canDeny", units = "dB")
	public Long snr;
	/**
	 * Bit Error Ratio before correction, expressed in multiples of 1e-6.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "BER")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ber;
	/**
	 * Bit Error Ratio after correction, expressed in multiples of 1e-9.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CBER")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cbeR;
	/**
	 * Indicates whether or not the tuner is locked on a frequency.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Locked")
	public Boolean locked;

	public Modulation() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the current frequency in kHz.

The value of this parameter is undefined while installing the service list (see {{object|.Components.FrontEnd.{i}.DVBT.Install}}).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getFrequency() {
		return frequency;
	}

	/**
	 * Set the indicates the current frequency in kHz.

The value of this parameter is undefined while installing the service list (see {{object|.Components.FrontEnd.{i}.DVBT.Install}}).
	 *
	 * @since 1.0
	 * @param frequency the input value
	 */
	public void  setFrequency(Long frequency) {
		this.frequency = frequency;
	}

	/**
	 * Set the indicates the current frequency in kHz.

The value of this parameter is undefined while installing the service list (see {{object|.Components.FrontEnd.{i}.DVBT.Install}}).
	 *
	 * @since 1.0
	 * @param frequency the input value
	 * @return this instance
	 */
	public Modulation withFrequency(Long frequency) {
		this.frequency = frequency;
		return this;
	}

	/**
	 * Get the indicates the channel bandwidth in use.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getChannelBandwidth() {
		return channelBandwidth;
	}

	/**
	 * Set the indicates the channel bandwidth in use.
	 *
	 * @since 1.0
	 * @param channelBandwidth the input value
	 */
	public void  setChannelBandwidth(String channelBandwidth) {
		this.channelBandwidth = channelBandwidth;
	}

	/**
	 * Set the indicates the channel bandwidth in use.
	 *
	 * @since 1.0
	 * @param channelBandwidth the input value
	 * @return this instance
	 */
	public Modulation withChannelBandwidth(String channelBandwidth) {
		this.channelBandwidth = channelBandwidth;
		return this;
	}

	/**
	 * Get the indicates the current constellation in use.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConstellation() {
		return constellation;
	}

	/**
	 * Set the indicates the current constellation in use.
	 *
	 * @since 1.0
	 * @param constellation the input value
	 */
	public void  setConstellation(String constellation) {
		this.constellation = constellation;
	}

	/**
	 * Set the indicates the current constellation in use.
	 *
	 * @since 1.0
	 * @param constellation the input value
	 * @return this instance
	 */
	public Modulation withConstellation(String constellation) {
		this.constellation = constellation;
		return this;
	}

	/**
	 * Get the hierarchical parameter alpha. The higher the value of alpha, the more noise-immune the High Priority Modulation is.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHierarchicalInformation() {
		return hierarchicalInformation;
	}

	/**
	 * Set the hierarchical parameter alpha. The higher the value of alpha, the more noise-immune the High Priority Modulation is.
	 *
	 * @since 1.0
	 * @param hierarchicalInformation the input value
	 */
	public void  setHierarchicalInformation(String hierarchicalInformation) {
		this.hierarchicalInformation = hierarchicalInformation;
	}

	/**
	 * Set the hierarchical parameter alpha. The higher the value of alpha, the more noise-immune the High Priority Modulation is.
	 *
	 * @since 1.0
	 * @param hierarchicalInformation the input value
	 * @return this instance
	 */
	public Modulation withHierarchicalInformation(String hierarchicalInformation) {
		this.hierarchicalInformation = hierarchicalInformation;
		return this;
	}

	/**
	 * Get the indicates the current code rate in use. Code rate applies to HP in case of hierarchical coding.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getCodeRateHP() {
		return codeRateHP;
	}

	/**
	 * Set the indicates the current code rate in use. Code rate applies to HP in case of hierarchical coding.
	 *
	 * @since 1.0
	 * @param codeRateHP the input value
	 */
	public void  setCodeRateHP(String codeRateHP) {
		this.codeRateHP = codeRateHP;
	}

	/**
	 * Set the indicates the current code rate in use. Code rate applies to HP in case of hierarchical coding.
	 *
	 * @since 1.0
	 * @param codeRateHP the input value
	 * @return this instance
	 */
	public Modulation withCodeRateHP(String codeRateHP) {
		this.codeRateHP = codeRateHP;
		return this;
	}

	/**
	 * Get the indicates the current code rate in use. Code rate applies to LP in case of hierarchical coding.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getCodeRateLP() {
		return codeRateLP;
	}

	/**
	 * Set the indicates the current code rate in use. Code rate applies to LP in case of hierarchical coding.
	 *
	 * @since 1.0
	 * @param codeRateLP the input value
	 */
	public void  setCodeRateLP(String codeRateLP) {
		this.codeRateLP = codeRateLP;
	}

	/**
	 * Set the indicates the current code rate in use. Code rate applies to LP in case of hierarchical coding.
	 *
	 * @since 1.0
	 * @param codeRateLP the input value
	 * @return this instance
	 */
	public Modulation withCodeRateLP(String codeRateLP) {
		this.codeRateLP = codeRateLP;
		return this;
	}

	/**
	 * Get the indicates the current guard interval in use.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getGuardInterval() {
		return guardInterval;
	}

	/**
	 * Set the indicates the current guard interval in use.
	 *
	 * @since 1.0
	 * @param guardInterval the input value
	 */
	public void  setGuardInterval(String guardInterval) {
		this.guardInterval = guardInterval;
	}

	/**
	 * Set the indicates the current guard interval in use.
	 *
	 * @since 1.0
	 * @param guardInterval the input value
	 * @return this instance
	 */
	public Modulation withGuardInterval(String guardInterval) {
		this.guardInterval = guardInterval;
		return this;
	}

	/**
	 * Get the indicates the number of carriers in an OFDM frame.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getTransmissionMode() {
		return transmissionMode;
	}

	/**
	 * Set the indicates the number of carriers in an OFDM frame.
	 *
	 * @since 1.0
	 * @param transmissionMode the input value
	 */
	public void  setTransmissionMode(String transmissionMode) {
		this.transmissionMode = transmissionMode;
	}

	/**
	 * Set the indicates the number of carriers in an OFDM frame.
	 *
	 * @since 1.0
	 * @param transmissionMode the input value
	 * @return this instance
	 */
	public Modulation withTransmissionMode(String transmissionMode) {
		this.transmissionMode = transmissionMode;
		return this;
	}

	/**
	 * Get the signal/Noise ratio in the carrier band, measured in dB.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSnr() {
		return snr;
	}

	/**
	 * Set the signal/Noise ratio in the carrier band, measured in dB.
	 *
	 * @since 1.0
	 * @param snr the input value
	 */
	public void  setSnr(Long snr) {
		this.snr = snr;
	}

	/**
	 * Set the signal/Noise ratio in the carrier band, measured in dB.
	 *
	 * @since 1.0
	 * @param snr the input value
	 * @return this instance
	 */
	public Modulation withSnr(Long snr) {
		this.snr = snr;
		return this;
	}

	/**
	 * Get the bit Error Ratio before correction, expressed in multiples of 1e-6.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getBer() {
		return ber;
	}

	/**
	 * Set the bit Error Ratio before correction, expressed in multiples of 1e-6.
	 *
	 * @since 1.0
	 * @param ber the input value
	 */
	public void  setBer(Long ber) {
		this.ber = ber;
	}

	/**
	 * Set the bit Error Ratio before correction, expressed in multiples of 1e-6.
	 *
	 * @since 1.0
	 * @param ber the input value
	 * @return this instance
	 */
	public Modulation withBer(Long ber) {
		this.ber = ber;
		return this;
	}

	/**
	 * Get the bit Error Ratio after correction, expressed in multiples of 1e-9.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCbeR() {
		return cbeR;
	}

	/**
	 * Set the bit Error Ratio after correction, expressed in multiples of 1e-9.
	 *
	 * @since 1.0
	 * @param cbeR the input value
	 */
	public void  setCbeR(Long cbeR) {
		this.cbeR = cbeR;
	}

	/**
	 * Set the bit Error Ratio after correction, expressed in multiples of 1e-9.
	 *
	 * @since 1.0
	 * @param cbeR the input value
	 * @return this instance
	 */
	public Modulation withCbeR(Long cbeR) {
		this.cbeR = cbeR;
		return this;
	}

	/**
	 * Get the indicates whether or not the tuner is locked on a frequency.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isLocked() {
		return locked;
	}

	/**
	 * Set the indicates whether or not the tuner is locked on a frequency.
	 *
	 * @since 1.0
	 * @param locked the input value
	 */
	public void  setLocked(Boolean locked) {
		this.locked = locked;
	}

	/**
	 * Set the indicates whether or not the tuner is locked on a frequency.
	 *
	 * @since 1.0
	 * @param locked the input value
	 * @return this instance
	 */
	public Modulation withLocked(Boolean locked) {
		this.locked = locked;
		return this;
	}

	//</editor-fold>

}