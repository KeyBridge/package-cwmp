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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The object used for configuring system parameter messages for 1x
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.SystemParameters.")
public class SystemParameters {

	/**
	 * registration zone number (refer to Section 2.6.5.1.5 of {{bibref|3GPP2-C.S0005}})
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegZone")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4095)
	public Long regZone;
	/**
	 * Total number of zones the mobile shall retain for zone based registration. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalZones")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long totalZones;
	/**
	 * timer value to be used by the mobile in the zone registration timer. Refer to table 3.7.2.3.2.1-1 of the standard {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ZoneTimer")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long zoneTimer;
	/**
	 * Registration period for timer based registration. Registration period is calculated from the formula 2^(REG_PRD/4) x 0.08 seconds. Thus a value of 59 corresponds to 1853.6 seconds (~ 1/2 hour). See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegPeriod")
	@CWMPParameter(access = "readWrite")
	@Size(min = 29, max = 85)
	public Long regPeriod;
	/**
	 * Search window size to be used ny the mobile for active set and candidate set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 11 corresponds to 130 chips
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SrchWinA")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long srchWinA;
	/**
	 * Search window size to be used by the mobile for neighbor set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SrchWinN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long srchWinN;
	/**
	 * Search window size to be used by the mobile for remaining set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SrchWinR")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long srchWinR;
	/**
	 * neighbor set maximum age beyond which the mobiles are supposed to drop a neighbor. This is the count of neighbout list updat or extended neighbor list updates a mobile shall receive before removing a neighbor from the neighbor list. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NghbrMaxAge")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long nghbrMaxAge;
	/**
	 * Power control reporting threshold. Number of bad frames a mobile should receive before sending a PMRM message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PwrRepThresh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long pwrRepThresh;
	/**
	 * Duration (in number of frames) for measuring bad frames - given by equation 2^(PWR_REP_FRAMES/2) x 5 frames. For example, 6 corresponds to 40 frames. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PwrRepFrames")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long pwrRepFrames;
	/**
	 * enable/disable power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PwrThreshEnable")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long pwrThreshEnable;
	/**
	 * enable/disable periodic power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PwrPeriodEnable")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long pwrPeriodEnable;
	/**
	 * Delay (in unit of four frames) following a PMRM before the mobile restarts counting bad frames for power control measuremnt. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PwrRepDelay")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 32)
	public Long pwrRepDelay;
	/**
	 * If {{param}} is set to 1, the mobiles should restart and reinitialize the System Parameters message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Rescan")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long rescan;
	/**
	 * Power threshold (in dB) for transferring a neighbor from neighbor set or remaining set to active set. For example, a value of 26 corresponds to -13 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Tadd")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long tadd;
	/**
	 * Drop threshold (in dB) to start a handoff timer to drop a neighbor from active or candidate set. For example, 30 corresponds to  -15dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Tdrop")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long tdrop;
	/**
	 * If a pilot in condidate set exceeds the power of a pilot in active set by threshold, the mobile shall send a power strenght measurement report message. This threshold is defined in unit of 0.5 dB. For example, 5 corresponds to a threshold of  2.5 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Tcomp")
	@CWMPParameter(access = "readWrite", units = "0.5 dB")
	@Size(min = 0, max = 15)
	public Long tcomp;
	/**
	 * Timer value for which an action is taken by the mobile for a neighbor in candidate set or in active set. Refer to Table 2.6.6.2.3-1 of the {{bibref|3GPP2-C.S0005}} for details. For example, 3 corresponds to four seconds
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TTdrop")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long ttdrop;
	/**
	 * T-ADD value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InTrafficTadd")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long intrafficTadd;
	/**
	 * T-Drop value (in dB) used in in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InTrafficTdrop")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long intrafficTdrop;
	/**
	 * T_Comp value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InTrafficTcomp")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 15)
	public Long intrafficTcomp;
	/**
	 * T_Tdrop timer value value used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InTrafficTtdrop")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long intrafficTtdrop;

	public SystemParameters() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the registration zone number (refer to Section 2.6.5.1.5 of {{bibref|3GPP2-C.S0005}})
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegZone() {
		return regZone;
	}

	/**
	 * Set the registration zone number (refer to Section 2.6.5.1.5 of {{bibref|3GPP2-C.S0005}})
	 *
	 * @since 2.0
	 * @param regZone the input value
	 */
	public void  setRegZone(Long regZone) {
		this.regZone = regZone;
	}

	/**
	 * Set the registration zone number (refer to Section 2.6.5.1.5 of {{bibref|3GPP2-C.S0005}})
	 *
	 * @since 2.0
	 * @param regZone the input value
	 * @return this instance
	 */
	public SystemParameters withRegZone(Long regZone) {
		this.regZone = regZone;
		return this;
	}

	/**
	 * Get the total number of zones the mobile shall retain for zone based registration. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalZones() {
		return totalZones;
	}

	/**
	 * Set the total number of zones the mobile shall retain for zone based registration. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param totalZones the input value
	 */
	public void  setTotalZones(Long totalZones) {
		this.totalZones = totalZones;
	}

	/**
	 * Set the total number of zones the mobile shall retain for zone based registration. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param totalZones the input value
	 * @return this instance
	 */
	public SystemParameters withTotalZones(Long totalZones) {
		this.totalZones = totalZones;
		return this;
	}

	/**
	 * Get the timer value to be used by the mobile in the zone registration timer. Refer to table 3.7.2.3.2.1-1 of the standard {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getZoneTimer() {
		return zoneTimer;
	}

	/**
	 * Set the timer value to be used by the mobile in the zone registration timer. Refer to table 3.7.2.3.2.1-1 of the standard {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param zoneTimer the input value
	 */
	public void  setZoneTimer(Long zoneTimer) {
		this.zoneTimer = zoneTimer;
	}

	/**
	 * Set the timer value to be used by the mobile in the zone registration timer. Refer to table 3.7.2.3.2.1-1 of the standard {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param zoneTimer the input value
	 * @return this instance
	 */
	public SystemParameters withZoneTimer(Long zoneTimer) {
		this.zoneTimer = zoneTimer;
		return this;
	}

	/**
	 * Get the registration period for timer based registration. Registration period is calculated from the formula 2^(REG_PRD/4) x 0.08 seconds. Thus a value of 59 corresponds to 1853.6 seconds (~ 1/2 hour). See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegPeriod() {
		return regPeriod;
	}

	/**
	 * Set the registration period for timer based registration. Registration period is calculated from the formula 2^(REG_PRD/4) x 0.08 seconds. Thus a value of 59 corresponds to 1853.6 seconds (~ 1/2 hour). See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param regPeriod the input value
	 */
	public void  setRegPeriod(Long regPeriod) {
		this.regPeriod = regPeriod;
	}

	/**
	 * Set the registration period for timer based registration. Registration period is calculated from the formula 2^(REG_PRD/4) x 0.08 seconds. Thus a value of 59 corresponds to 1853.6 seconds (~ 1/2 hour). See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param regPeriod the input value
	 * @return this instance
	 */
	public SystemParameters withRegPeriod(Long regPeriod) {
		this.regPeriod = regPeriod;
		return this;
	}

	/**
	 * Get the search window size to be used ny the mobile for active set and candidate set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 11 corresponds to 130 chips
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSrchWinA() {
		return srchWinA;
	}

	/**
	 * Set the search window size to be used ny the mobile for active set and candidate set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 11 corresponds to 130 chips
	 *
	 * @since 2.0
	 * @param srchWinA the input value
	 */
	public void  setSrchWinA(Long srchWinA) {
		this.srchWinA = srchWinA;
	}

	/**
	 * Set the search window size to be used ny the mobile for active set and candidate set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 11 corresponds to 130 chips
	 *
	 * @since 2.0
	 * @param srchWinA the input value
	 * @return this instance
	 */
	public SystemParameters withSrchWinA(Long srchWinA) {
		this.srchWinA = srchWinA;
		return this;
	}

	/**
	 * Get the search window size to be used by the mobile for neighbor set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSrchWinN() {
		return srchWinN;
	}

	/**
	 * Set the search window size to be used by the mobile for neighbor set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 * @param srchWinN the input value
	 */
	public void  setSrchWinN(Long srchWinN) {
		this.srchWinN = srchWinN;
	}

	/**
	 * Set the search window size to be used by the mobile for neighbor set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 * @param srchWinN the input value
	 * @return this instance
	 */
	public SystemParameters withSrchWinN(Long srchWinN) {
		this.srchWinN = srchWinN;
		return this;
	}

	/**
	 * Get the search window size to be used by the mobile for remaining set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSrchWinR() {
		return srchWinR;
	}

	/**
	 * Set the search window size to be used by the mobile for remaining set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 * @param srchWinR the input value
	 */
	public void  setSrchWinR(Long srchWinR) {
		this.srchWinR = srchWinR;
	}

	/**
	 * Set the search window size to be used by the mobile for remaining set. Refer to table 2.6.6.2.1-1 of {{bibref|3GPP2-C.S0005}}. For example, 8 corresponds to 60 chips
	 *
	 * @since 2.0
	 * @param srchWinR the input value
	 * @return this instance
	 */
	public SystemParameters withSrchWinR(Long srchWinR) {
		this.srchWinR = srchWinR;
		return this;
	}

	/**
	 * Get the neighbor set maximum age beyond which the mobiles are supposed to drop a neighbor. This is the count of neighbout list updat or extended neighbor list updates a mobile shall receive before removing a neighbor from the neighbor list. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNghbrMaxAge() {
		return nghbrMaxAge;
	}

	/**
	 * Set the neighbor set maximum age beyond which the mobiles are supposed to drop a neighbor. This is the count of neighbout list updat or extended neighbor list updates a mobile shall receive before removing a neighbor from the neighbor list. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nghbrMaxAge the input value
	 */
	public void  setNghbrMaxAge(Long nghbrMaxAge) {
		this.nghbrMaxAge = nghbrMaxAge;
	}

	/**
	 * Set the neighbor set maximum age beyond which the mobiles are supposed to drop a neighbor. This is the count of neighbout list updat or extended neighbor list updates a mobile shall receive before removing a neighbor from the neighbor list. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nghbrMaxAge the input value
	 * @return this instance
	 */
	public SystemParameters withNghbrMaxAge(Long nghbrMaxAge) {
		this.nghbrMaxAge = nghbrMaxAge;
		return this;
	}

	/**
	 * Get the power control reporting threshold. Number of bad frames a mobile should receive before sending a PMRM message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPwrRepThresh() {
		return pwrRepThresh;
	}

	/**
	 * Set the power control reporting threshold. Number of bad frames a mobile should receive before sending a PMRM message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrRepThresh the input value
	 */
	public void  setPwrRepThresh(Long pwrRepThresh) {
		this.pwrRepThresh = pwrRepThresh;
	}

	/**
	 * Set the power control reporting threshold. Number of bad frames a mobile should receive before sending a PMRM message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrRepThresh the input value
	 * @return this instance
	 */
	public SystemParameters withPwrRepThresh(Long pwrRepThresh) {
		this.pwrRepThresh = pwrRepThresh;
		return this;
	}

	/**
	 * Get the duration (in number of frames) for measuring bad frames - given by equation 2^(PWR_REP_FRAMES/2) x 5 frames. For example, 6 corresponds to 40 frames. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPwrRepFrames() {
		return pwrRepFrames;
	}

	/**
	 * Set the duration (in number of frames) for measuring bad frames - given by equation 2^(PWR_REP_FRAMES/2) x 5 frames. For example, 6 corresponds to 40 frames. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrRepFrames the input value
	 */
	public void  setPwrRepFrames(Long pwrRepFrames) {
		this.pwrRepFrames = pwrRepFrames;
	}

	/**
	 * Set the duration (in number of frames) for measuring bad frames - given by equation 2^(PWR_REP_FRAMES/2) x 5 frames. For example, 6 corresponds to 40 frames. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrRepFrames the input value
	 * @return this instance
	 */
	public SystemParameters withPwrRepFrames(Long pwrRepFrames) {
		this.pwrRepFrames = pwrRepFrames;
		return this;
	}

	/**
	 * Get the enable/disable power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPwrThreshEnable() {
		return pwrThreshEnable;
	}

	/**
	 * Set the enable/disable power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrThreshEnable the input value
	 */
	public void  setPwrThreshEnable(Long pwrThreshEnable) {
		this.pwrThreshEnable = pwrThreshEnable;
	}

	/**
	 * Set the enable/disable power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrThreshEnable the input value
	 * @return this instance
	 */
	public SystemParameters withPwrThreshEnable(Long pwrThreshEnable) {
		this.pwrThreshEnable = pwrThreshEnable;
		return this;
	}

	/**
	 * Get the enable/disable periodic power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPwrPeriodEnable() {
		return pwrPeriodEnable;
	}

	/**
	 * Set the enable/disable periodic power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrPeriodEnable the input value
	 */
	public void  setPwrPeriodEnable(Long pwrPeriodEnable) {
		this.pwrPeriodEnable = pwrPeriodEnable;
	}

	/**
	 * Set the enable/disable periodic power measurement report message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrPeriodEnable the input value
	 * @return this instance
	 */
	public SystemParameters withPwrPeriodEnable(Long pwrPeriodEnable) {
		this.pwrPeriodEnable = pwrPeriodEnable;
		return this;
	}

	/**
	 * Get the delay (in unit of four frames) following a PMRM before the mobile restarts counting bad frames for power control measuremnt. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPwrRepDelay() {
		return pwrRepDelay;
	}

	/**
	 * Set the delay (in unit of four frames) following a PMRM before the mobile restarts counting bad frames for power control measuremnt. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrRepDelay the input value
	 */
	public void  setPwrRepDelay(Long pwrRepDelay) {
		this.pwrRepDelay = pwrRepDelay;
	}

	/**
	 * Set the delay (in unit of four frames) following a PMRM before the mobile restarts counting bad frames for power control measuremnt. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrRepDelay the input value
	 * @return this instance
	 */
	public SystemParameters withPwrRepDelay(Long pwrRepDelay) {
		this.pwrRepDelay = pwrRepDelay;
		return this;
	}

	/**
	 * Get the if {{param}} is set to 1, the mobiles should restart and reinitialize the System Parameters message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRescan() {
		return rescan;
	}

	/**
	 * Set the if {{param}} is set to 1, the mobiles should restart and reinitialize the System Parameters message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param rescan the input value
	 */
	public void  setRescan(Long rescan) {
		this.rescan = rescan;
	}

	/**
	 * Set the if {{param}} is set to 1, the mobiles should restart and reinitialize the System Parameters message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param rescan the input value
	 * @return this instance
	 */
	public SystemParameters withRescan(Long rescan) {
		this.rescan = rescan;
		return this;
	}

	/**
	 * Get the power threshold (in dB) for transferring a neighbor from neighbor set or remaining set to active set. For example, a value of 26 corresponds to -13 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTadd() {
		return tadd;
	}

	/**
	 * Set the power threshold (in dB) for transferring a neighbor from neighbor set or remaining set to active set. For example, a value of 26 corresponds to -13 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param tadd the input value
	 */
	public void  setTadd(Long tadd) {
		this.tadd = tadd;
	}

	/**
	 * Set the power threshold (in dB) for transferring a neighbor from neighbor set or remaining set to active set. For example, a value of 26 corresponds to -13 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param tadd the input value
	 * @return this instance
	 */
	public SystemParameters withTadd(Long tadd) {
		this.tadd = tadd;
		return this;
	}

	/**
	 * Get the drop threshold (in dB) to start a handoff timer to drop a neighbor from active or candidate set. For example, 30 corresponds to  -15dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTdrop() {
		return tdrop;
	}

	/**
	 * Set the drop threshold (in dB) to start a handoff timer to drop a neighbor from active or candidate set. For example, 30 corresponds to  -15dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param tdrop the input value
	 */
	public void  setTdrop(Long tdrop) {
		this.tdrop = tdrop;
	}

	/**
	 * Set the drop threshold (in dB) to start a handoff timer to drop a neighbor from active or candidate set. For example, 30 corresponds to  -15dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param tdrop the input value
	 * @return this instance
	 */
	public SystemParameters withTdrop(Long tdrop) {
		this.tdrop = tdrop;
		return this;
	}

	/**
	 * Get the if a pilot in condidate set exceeds the power of a pilot in active set by threshold, the mobile shall send a power strenght measurement report message. This threshold is defined in unit of 0.5 dB. For example, 5 corresponds to a threshold of  2.5 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTcomp() {
		return tcomp;
	}

	/**
	 * Set the if a pilot in condidate set exceeds the power of a pilot in active set by threshold, the mobile shall send a power strenght measurement report message. This threshold is defined in unit of 0.5 dB. For example, 5 corresponds to a threshold of  2.5 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param tcomp the input value
	 */
	public void  setTcomp(Long tcomp) {
		this.tcomp = tcomp;
	}

	/**
	 * Set the if a pilot in condidate set exceeds the power of a pilot in active set by threshold, the mobile shall send a power strenght measurement report message. This threshold is defined in unit of 0.5 dB. For example, 5 corresponds to a threshold of  2.5 dB. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param tcomp the input value
	 * @return this instance
	 */
	public SystemParameters withTcomp(Long tcomp) {
		this.tcomp = tcomp;
		return this;
	}

	/**
	 * Get the timer value for which an action is taken by the mobile for a neighbor in candidate set or in active set. Refer to Table 2.6.6.2.3-1 of the {{bibref|3GPP2-C.S0005}} for details. For example, 3 corresponds to four seconds
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTtdrop() {
		return ttdrop;
	}

	/**
	 * Set the timer value for which an action is taken by the mobile for a neighbor in candidate set or in active set. Refer to Table 2.6.6.2.3-1 of the {{bibref|3GPP2-C.S0005}} for details. For example, 3 corresponds to four seconds
	 *
	 * @since 2.0
	 * @param ttdrop the input value
	 */
	public void  setTtdrop(Long ttdrop) {
		this.ttdrop = ttdrop;
	}

	/**
	 * Set the timer value for which an action is taken by the mobile for a neighbor in candidate set or in active set. Refer to Table 2.6.6.2.3-1 of the {{bibref|3GPP2-C.S0005}} for details. For example, 3 corresponds to four seconds
	 *
	 * @since 2.0
	 * @param ttdrop the input value
	 * @return this instance
	 */
	public SystemParameters withTtdrop(Long ttdrop) {
		this.ttdrop = ttdrop;
		return this;
	}

	/**
	 * Get the t-aDD value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntrafficTadd() {
		return intrafficTadd;
	}

	/**
	 * Set the t-aDD value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTadd the input value
	 */
	public void  setIntrafficTadd(Long intrafficTadd) {
		this.intrafficTadd = intrafficTadd;
	}

	/**
	 * Set the t-aDD value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTadd the input value
	 * @return this instance
	 */
	public SystemParameters withIntrafficTadd(Long intrafficTadd) {
		this.intrafficTadd = intrafficTadd;
		return this;
	}

	/**
	 * Get the t-drop value (in dB) used in in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntrafficTdrop() {
		return intrafficTdrop;
	}

	/**
	 * Set the t-drop value (in dB) used in in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTdrop the input value
	 */
	public void  setIntrafficTdrop(Long intrafficTdrop) {
		this.intrafficTdrop = intrafficTdrop;
	}

	/**
	 * Set the t-drop value (in dB) used in in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTdrop the input value
	 * @return this instance
	 */
	public SystemParameters withIntrafficTdrop(Long intrafficTdrop) {
		this.intrafficTdrop = intrafficTdrop;
		return this;
	}

	/**
	 * Get the t_comp value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntrafficTcomp() {
		return intrafficTcomp;
	}

	/**
	 * Set the t_comp value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTcomp the input value
	 */
	public void  setIntrafficTcomp(Long intrafficTcomp) {
		this.intrafficTcomp = intrafficTcomp;
	}

	/**
	 * Set the t_comp value (in dB) used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTcomp the input value
	 * @return this instance
	 */
	public SystemParameters withIntrafficTcomp(Long intrafficTcomp) {
		this.intrafficTcomp = intrafficTcomp;
		return this;
	}

	/**
	 * Get the t_tdrop timer value value used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIntrafficTtdrop() {
		return intrafficTtdrop;
	}

	/**
	 * Set the t_tdrop timer value value used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTtdrop the input value
	 */
	public void  setIntrafficTtdrop(Long intrafficTtdrop) {
		this.intrafficTtdrop = intrafficTtdrop;
	}

	/**
	 * Set the t_tdrop timer value value used for in-traffic system parameter message. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param intrafficTtdrop the input value
	 * @return this instance
	 */
	public SystemParameters withIntrafficTtdrop(Long intrafficTtdrop) {
		this.intrafficTtdrop = intrafficTtdrop;
		return this;
	}

	//</editor-fold>

}