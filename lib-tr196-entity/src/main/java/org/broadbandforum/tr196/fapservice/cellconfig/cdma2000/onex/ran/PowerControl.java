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
	 * Configuration Managed Object for OTA  power control attribute.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.PowerControl.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.PowerControl")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.PowerControl")
@XmlAccessorType(XmlAccessType.FIELD)
public class PowerControl {

	/**
	 * Whether Forward power control information included in Power Control message
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCFPCIncl")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer oneXPCFPCIncl;
	/**
	 * The value for the minimum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCFPCFCHMinSetpt")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = 0, max = 255)
	public Integer oneXPCFPCFCHMinSetpt;
	/**
	 * The value for the maximum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCFPCFCHMaxSetpt")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = 0, max = 255)
	public Integer oneXPCFPCFCHMaxSetpt;
	/**
	 * Whether reverse Power control information included in the Power Control Message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCRPCIncl")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer oneXPCRPCIncl;
	/**
	 * Channel adjustment gain (in 0.125 dB) for Reverse Fundamental Channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCFCHChanAdjGain")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = -48, max = 48)
	public Integer oneXPCFCHChanAdjGain;
	/**
	 * The number of bad frames to be received in a measurement period on the channel which carries the Power Control Subchannel before mobile stations are to generate a Power easurement Report Message
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCPwrRepThresh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long oneXPCPwrRepThresh;
	/**
	 * Power control reporting frame count. Number of frames over which the mobile station measures frame errors.  For example, 7 corresponds to 55 frames. Refer to {{bibref|3GPP2-C.S0005}} for mapping between this value and the actual frame count.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCPwrRepFrames")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long oneXPCPwrRepFrames;
	/**
	 * Threshold report mode indicator. If the mobile station is to generate threshold Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate threshold Power Measurement Report Messages, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPwrThreshEnable")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer oneXPwrThreshEnable;
	/**
	 * Periodic report mode indicator. If the mobile station is to generate periodic Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate periodic Power Measurement Report Messages, the base station shall  set this field to '0'.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCPwrPeriodEnable")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer oneXPCPwrPeriodEnable;
	/**
	 * Power report delay. The period that the mobile station waits following a Power Measurement Report Message before restarting frame  counting for power control purposes. The base station shall set this field to the power report delay values in units of 4 frames.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OneXPCPwrRepDelay")
	@CWMPParameter(access = "readWrite", units = "4 frames")
	@Size(min = 0, max = 31)
	public Long oneXPCPwrRepDelay;

	public PowerControl() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the whether Forward power control information included in Power Control message
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPCFPCIncl() {
		return oneXPCFPCIncl;
	}

	/**
	 * Set the whether Forward power control information included in Power Control message
	 *
	 * @since 2.0
	 * @param oneXPCFPCIncl the input value
	 */
	public void  setOneXPCFPCIncl(Integer oneXPCFPCIncl) {
		this.oneXPCFPCIncl = oneXPCFPCIncl;
	}

	/**
	 * Set the whether Forward power control information included in Power Control message
	 *
	 * @since 2.0
	 * @param oneXPCFPCIncl the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCFPCIncl(Integer oneXPCFPCIncl) {
		this.oneXPCFPCIncl = oneXPCFPCIncl;
		return this;
	}

	/**
	 * Get the value for the minimum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPCFPCFCHMinSetpt() {
		return oneXPCFPCFCHMinSetpt;
	}

	/**
	 * Set the value for the minimum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param oneXPCFPCFCHMinSetpt the input value
	 */
	public void  setOneXPCFPCFCHMinSetpt(Integer oneXPCFPCFCHMinSetpt) {
		this.oneXPCFPCFCHMinSetpt = oneXPCFPCFCHMinSetpt;
	}

	/**
	 * Set the value for the minimum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param oneXPCFPCFCHMinSetpt the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCFPCFCHMinSetpt(Integer oneXPCFPCFCHMinSetpt) {
		this.oneXPCFPCFCHMinSetpt = oneXPCFPCFCHMinSetpt;
		return this;
	}

	/**
	 * Get the value for the maximum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPCFPCFCHMaxSetpt() {
		return oneXPCFPCFCHMaxSetpt;
	}

	/**
	 * Set the value for the maximum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param oneXPCFPCFCHMaxSetpt the input value
	 */
	public void  setOneXPCFPCFCHMaxSetpt(Integer oneXPCFPCFCHMaxSetpt) {
		this.oneXPCFPCFCHMaxSetpt = oneXPCFPCFCHMaxSetpt;
	}

	/**
	 * Set the value for the maximum Fundamental Channel Outer Loop Eb/Nt setpoint, in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param oneXPCFPCFCHMaxSetpt the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCFPCFCHMaxSetpt(Integer oneXPCFPCFCHMaxSetpt) {
		this.oneXPCFPCFCHMaxSetpt = oneXPCFPCFCHMaxSetpt;
		return this;
	}

	/**
	 * Get the whether reverse Power control information included in the Power Control Message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPCRPCIncl() {
		return oneXPCRPCIncl;
	}

	/**
	 * Set the whether reverse Power control information included in the Power Control Message.
	 *
	 * @since 2.0
	 * @param oneXPCRPCIncl the input value
	 */
	public void  setOneXPCRPCIncl(Integer oneXPCRPCIncl) {
		this.oneXPCRPCIncl = oneXPCRPCIncl;
	}

	/**
	 * Set the whether reverse Power control information included in the Power Control Message.
	 *
	 * @since 2.0
	 * @param oneXPCRPCIncl the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCRPCIncl(Integer oneXPCRPCIncl) {
		this.oneXPCRPCIncl = oneXPCRPCIncl;
		return this;
	}

	/**
	 * Get the channel adjustment gain (in 0.125 dB) for Reverse Fundamental Channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPCFCHChanAdjGain() {
		return oneXPCFCHChanAdjGain;
	}

	/**
	 * Set the channel adjustment gain (in 0.125 dB) for Reverse Fundamental Channel.
	 *
	 * @since 2.0
	 * @param oneXPCFCHChanAdjGain the input value
	 */
	public void  setOneXPCFCHChanAdjGain(Integer oneXPCFCHChanAdjGain) {
		this.oneXPCFCHChanAdjGain = oneXPCFCHChanAdjGain;
	}

	/**
	 * Set the channel adjustment gain (in 0.125 dB) for Reverse Fundamental Channel.
	 *
	 * @since 2.0
	 * @param oneXPCFCHChanAdjGain the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCFCHChanAdjGain(Integer oneXPCFCHChanAdjGain) {
		this.oneXPCFCHChanAdjGain = oneXPCFCHChanAdjGain;
		return this;
	}

	/**
	 * Get the number of bad frames to be received in a measurement period on the channel which carries the Power Control Subchannel before mobile stations are to generate a Power easurement Report Message
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOneXPCPwrRepThresh() {
		return oneXPCPwrRepThresh;
	}

	/**
	 * Set the number of bad frames to be received in a measurement period on the channel which carries the Power Control Subchannel before mobile stations are to generate a Power easurement Report Message
	 *
	 * @since 2.0
	 * @param oneXPCPwrRepThresh the input value
	 */
	public void  setOneXPCPwrRepThresh(Long oneXPCPwrRepThresh) {
		this.oneXPCPwrRepThresh = oneXPCPwrRepThresh;
	}

	/**
	 * Set the number of bad frames to be received in a measurement period on the channel which carries the Power Control Subchannel before mobile stations are to generate a Power easurement Report Message
	 *
	 * @since 2.0
	 * @param oneXPCPwrRepThresh the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCPwrRepThresh(Long oneXPCPwrRepThresh) {
		this.oneXPCPwrRepThresh = oneXPCPwrRepThresh;
		return this;
	}

	/**
	 * Get the power control reporting frame count. Number of frames over which the mobile station measures frame errors.  For example, 7 corresponds to 55 frames. Refer to {{bibref|3GPP2-C.S0005}} for mapping between this value and the actual frame count.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOneXPCPwrRepFrames() {
		return oneXPCPwrRepFrames;
	}

	/**
	 * Set the power control reporting frame count. Number of frames over which the mobile station measures frame errors.  For example, 7 corresponds to 55 frames. Refer to {{bibref|3GPP2-C.S0005}} for mapping between this value and the actual frame count.
	 *
	 * @since 2.0
	 * @param oneXPCPwrRepFrames the input value
	 */
	public void  setOneXPCPwrRepFrames(Long oneXPCPwrRepFrames) {
		this.oneXPCPwrRepFrames = oneXPCPwrRepFrames;
	}

	/**
	 * Set the power control reporting frame count. Number of frames over which the mobile station measures frame errors.  For example, 7 corresponds to 55 frames. Refer to {{bibref|3GPP2-C.S0005}} for mapping between this value and the actual frame count.
	 *
	 * @since 2.0
	 * @param oneXPCPwrRepFrames the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCPwrRepFrames(Long oneXPCPwrRepFrames) {
		this.oneXPCPwrRepFrames = oneXPCPwrRepFrames;
		return this;
	}

	/**
	 * Get the threshold report mode indicator. If the mobile station is to generate threshold Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate threshold Power Measurement Report Messages, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPwrThreshEnable() {
		return oneXPwrThreshEnable;
	}

	/**
	 * Set the threshold report mode indicator. If the mobile station is to generate threshold Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate threshold Power Measurement Report Messages, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param oneXPwrThreshEnable the input value
	 */
	public void  setOneXPwrThreshEnable(Integer oneXPwrThreshEnable) {
		this.oneXPwrThreshEnable = oneXPwrThreshEnable;
	}

	/**
	 * Set the threshold report mode indicator. If the mobile station is to generate threshold Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate threshold Power Measurement Report Messages, the base station shall set this field to '0'.
	 *
	 * @since 2.0
	 * @param oneXPwrThreshEnable the input value
	 * @return this instance
	 */
	public PowerControl withOneXPwrThreshEnable(Integer oneXPwrThreshEnable) {
		this.oneXPwrThreshEnable = oneXPwrThreshEnable;
		return this;
	}

	/**
	 * Get the periodic report mode indicator. If the mobile station is to generate periodic Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate periodic Power Measurement Report Messages, the base station shall  set this field to '0'.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOneXPCPwrPeriodEnable() {
		return oneXPCPwrPeriodEnable;
	}

	/**
	 * Set the periodic report mode indicator. If the mobile station is to generate periodic Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate periodic Power Measurement Report Messages, the base station shall  set this field to '0'.
	 *
	 * @since 2.0
	 * @param oneXPCPwrPeriodEnable the input value
	 */
	public void  setOneXPCPwrPeriodEnable(Integer oneXPCPwrPeriodEnable) {
		this.oneXPCPwrPeriodEnable = oneXPCPwrPeriodEnable;
	}

	/**
	 * Set the periodic report mode indicator. If the mobile station is to generate periodic Power Measurement Report Messages, the base station shall set this field to '1'. If the mobile station is not to generate periodic Power Measurement Report Messages, the base station shall  set this field to '0'.
	 *
	 * @since 2.0
	 * @param oneXPCPwrPeriodEnable the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCPwrPeriodEnable(Integer oneXPCPwrPeriodEnable) {
		this.oneXPCPwrPeriodEnable = oneXPCPwrPeriodEnable;
		return this;
	}

	/**
	 * Get the power report delay. The period that the mobile station waits following a Power Measurement Report Message before restarting frame  counting for power control purposes. The base station shall set this field to the power report delay values in units of 4 frames.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOneXPCPwrRepDelay() {
		return oneXPCPwrRepDelay;
	}

	/**
	 * Set the power report delay. The period that the mobile station waits following a Power Measurement Report Message before restarting frame  counting for power control purposes. The base station shall set this field to the power report delay values in units of 4 frames.
	 *
	 * @since 2.0
	 * @param oneXPCPwrRepDelay the input value
	 */
	public void  setOneXPCPwrRepDelay(Long oneXPCPwrRepDelay) {
		this.oneXPCPwrRepDelay = oneXPCPwrRepDelay;
	}

	/**
	 * Set the power report delay. The period that the mobile station waits following a Power Measurement Report Message before restarting frame  counting for power control purposes. The base station shall set this field to the power report delay values in units of 4 frames.
	 *
	 * @since 2.0
	 * @param oneXPCPwrRepDelay the input value
	 * @return this instance
	 */
	public PowerControl withOneXPCPwrRepDelay(Long oneXPCPwrRepDelay) {
		this.oneXPCPwrRepDelay = oneXPCPwrRepDelay;
		return this;
	}

	//</editor-fold>

}