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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The object used for configuring extended channel assignment  messages for 1x
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.ForwardPwrCtr.")
@XmlRootElement(name = "ForwardPwrCtr")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.ForwardPwrCtr")
@XmlAccessorType(XmlAccessType.FIELD)
public class ForwardPwrCtr {

	/**
	 * Initial Fundamental Channel outer loop Eb/Nt setpoint in 0.125 dB. For example, 56 corresponds to 7 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FPCFCHInitSetpt")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = -128, max = 127)
	public Integer fpcFCHInitSetpt;
	/**
	 * Forward power control subchannel relative to fwd traffic channel in 0.25 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FPCSubchanGain")
	@CWMPParameter(access = "readWrite", units = "0.25 dB")
	@Size(min = -16, max = 15)
	public Integer fpcSubchanGain;
	/**
	 * Reverse Traffic Channel power relative to access power in dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RLGainAdj")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -8, max = 7)
	public Integer rlgainAdj;
	/**
	 * Fundamental Channel target frame error rate. Refer to table 3.7.3.3.2.25-2 of {{bibref|3GPP2-C.S0005}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FPCFCHFER")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long fpcFCHFER;
	/**
	 * Minimum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FPCFCHMinSetpt")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = -128, max = 127)
	public Integer fpcFCHMinSetpt;
	/**
	 * Maximum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FPCFCHMaxSetpt")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = -128, max = 127)
	public Integer fpcFCHMaxSetpt;

	public ForwardPwrCtr() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the initial Fundamental Channel outer loop Eb/Nt setpoint in 0.125 dB. For example, 56 corresponds to 7 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFpcFCHInitSetpt() {
		return fpcFCHInitSetpt;
	}

	/**
	 * Set the initial Fundamental Channel outer loop Eb/Nt setpoint in 0.125 dB. For example, 56 corresponds to 7 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcFCHInitSetpt the input value
	 */
	public void  setFpcFCHInitSetpt(Integer fpcFCHInitSetpt) {
		this.fpcFCHInitSetpt = fpcFCHInitSetpt;
	}

	/**
	 * Set the initial Fundamental Channel outer loop Eb/Nt setpoint in 0.125 dB. For example, 56 corresponds to 7 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcFCHInitSetpt the input value
	 * @return this instance
	 */
	public ForwardPwrCtr withFpcFCHInitSetpt(Integer fpcFCHInitSetpt) {
		this.fpcFCHInitSetpt = fpcFCHInitSetpt;
		return this;
	}

	/**
	 * Get the forward power control subchannel relative to fwd traffic channel in 0.25 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFpcSubchanGain() {
		return fpcSubchanGain;
	}

	/**
	 * Set the forward power control subchannel relative to fwd traffic channel in 0.25 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcSubchanGain the input value
	 */
	public void  setFpcSubchanGain(Integer fpcSubchanGain) {
		this.fpcSubchanGain = fpcSubchanGain;
	}

	/**
	 * Set the forward power control subchannel relative to fwd traffic channel in 0.25 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcSubchanGain the input value
	 * @return this instance
	 */
	public ForwardPwrCtr withFpcSubchanGain(Integer fpcSubchanGain) {
		this.fpcSubchanGain = fpcSubchanGain;
		return this;
	}

	/**
	 * Get the reverse Traffic Channel power relative to access power in dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRlgainAdj() {
		return rlgainAdj;
	}

	/**
	 * Set the reverse Traffic Channel power relative to access power in dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param rlgainAdj the input value
	 */
	public void  setRlgainAdj(Integer rlgainAdj) {
		this.rlgainAdj = rlgainAdj;
	}

	/**
	 * Set the reverse Traffic Channel power relative to access power in dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param rlgainAdj the input value
	 * @return this instance
	 */
	public ForwardPwrCtr withRlgainAdj(Integer rlgainAdj) {
		this.rlgainAdj = rlgainAdj;
		return this;
	}

	/**
	 * Get the fundamental Channel target frame error rate. Refer to table 3.7.3.3.2.25-2 of {{bibref|3GPP2-C.S0005}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFpcFCHFER() {
		return fpcFCHFER;
	}

	/**
	 * Set the fundamental Channel target frame error rate. Refer to table 3.7.3.3.2.25-2 of {{bibref|3GPP2-C.S0005}}
	 *
	 * @since 2.0
	 * @param fpcFCHFER the input value
	 */
	public void  setFpcFCHFER(Long fpcFCHFER) {
		this.fpcFCHFER = fpcFCHFER;
	}

	/**
	 * Set the fundamental Channel target frame error rate. Refer to table 3.7.3.3.2.25-2 of {{bibref|3GPP2-C.S0005}}
	 *
	 * @since 2.0
	 * @param fpcFCHFER the input value
	 * @return this instance
	 */
	public ForwardPwrCtr withFpcFCHFER(Long fpcFCHFER) {
		this.fpcFCHFER = fpcFCHFER;
		return this;
	}

	/**
	 * Get the minimum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFpcFCHMinSetpt() {
		return fpcFCHMinSetpt;
	}

	/**
	 * Set the minimum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcFCHMinSetpt the input value
	 */
	public void  setFpcFCHMinSetpt(Integer fpcFCHMinSetpt) {
		this.fpcFCHMinSetpt = fpcFCHMinSetpt;
	}

	/**
	 * Set the minimum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcFCHMinSetpt the input value
	 * @return this instance
	 */
	public ForwardPwrCtr withFpcFCHMinSetpt(Integer fpcFCHMinSetpt) {
		this.fpcFCHMinSetpt = fpcFCHMinSetpt;
		return this;
	}

	/**
	 * Get the maximum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFpcFCHMaxSetpt() {
		return fpcFCHMaxSetpt;
	}

	/**
	 * Set the maximum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcFCHMaxSetpt the input value
	 */
	public void  setFpcFCHMaxSetpt(Integer fpcFCHMaxSetpt) {
		this.fpcFCHMaxSetpt = fpcFCHMaxSetpt;
	}

	/**
	 * Set the maximum Fundamental Channel Outer Loop Eb/Nt setpoint in 0.125 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param fpcFCHMaxSetpt the input value
	 * @return this instance
	 */
	public ForwardPwrCtr withFpcFCHMaxSetpt(Integer fpcFCHMaxSetpt) {
		this.fpcFCHMaxSetpt = fpcFCHMaxSetpt;
		return this;
	}

	//</editor-fold>

}