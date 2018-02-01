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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.onex.ActiveHandinMeasurement;
import org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.onex.SelfConfig;

	/**
	 * This object contains all global attributes of the 1xFemto application.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.OneX.")
public class OneX {

	/**
	 * Administrative state for 1x
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AdminState")
	@CWMPParameter(access = "readWrite")
	public String adminState;
	/**
	 * Operational state of the 1x
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OpState")
	@CWMPParameter(activeNotify = "forceDefaultEnabled", forcedInform = true)
	public String opstate;
	/**
	 * Current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS. When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFTxStatus")
	@CWMPParameter(activeNotify = "forceDefaultEnabled", forcedInform = true)
	public Boolean rftxStatus;
	/**
	 * If Daylight Savings Time is being used with respect to CDMA2000 1x overhead parameters (see {{bibref|3GPP2-C.S0005}}), then {{param}} should be set to {{true}}. Otherwise, {{param}} should be set to {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Daylight")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer daylight;
	/**
	 * Protocol revision supported by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxPRev")
	@CWMPParameter(access = "readWrite")
	@Size(min = 6, max = 9)
	public Integer maxPRev;
	/**
	 * {{param}} triggers a re-registration of all mobiles. The FAP triggers re-registration of all registered mobiles everytime this number changes
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Reregister")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Long reregister;
	/**
	 * The period (in seconds) the session of an unauthorized user is kept alive after an emergency call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EmergencySessionPeriod")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 15, max = 1800)
	public Long emergencySessionPeriod;
	/**
	 * This is the location area code.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocationAreaCode")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long locationAreaCode;
	/**
	 * This is the FAP's MSCID. This ID is used in PANI header.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MSCId")
	@CWMPParameter(access = "readWrite")
	public Long mscId;
	/**
	 * Indicates whether the FAP performs active hand-in from another base station. If {{true}} active hand-in is enabled; if {{false}} active hand-in is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ActiveHandinEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean activeHandinEnable;
	/**
	 * CDMA2000 1x active handin operational parameters.
	 */
	@XmlElement(name = "ActiveHandinMeasurement")
	public ActiveHandinMeasurement activeHandinMeasurement;
	/**
	 * This object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 */
	@XmlElement(name = "SelfConfig")
	public SelfConfig selfConfig;

	public OneX() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get administrative state for 1x
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAdminState() {
		return adminState;
	}

	/**
	 * Set administrative state for 1x
	 *
	 * @since 2.0
	 * @param adminState the input value
	 */
	public void  setAdminState(String adminState) {
		this.adminState = adminState;
	}

	/**
	 * Set administrative state for 1x
	 *
	 * @since 2.0
	 * @param adminState the input value
	 * @return this instance
	 */
	public OneX withAdminState(String adminState) {
		this.adminState = adminState;
		return this;
	}

	/**
	 * Get the operational state of the 1x
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOpstate() {
		return opstate;
	}

	/**
	 * Set the operational state of the 1x
	 *
	 * @since 2.0
	 * @param opstate the input value
	 */
	public void  setOpstate(String opstate) {
		this.opstate = opstate;
	}

	/**
	 * Set the operational state of the 1x
	 *
	 * @since 2.0
	 * @param opstate the input value
	 * @return this instance
	 */
	public OneX withOpstate(String opstate) {
		this.opstate = opstate;
		return this;
	}

	/**
	 * Get the current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS. When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRftxStatus() {
		return rftxStatus;
	}

	/**
	 * Set the current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS. When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @param rftxStatus the input value
	 */
	public void  setRftxStatus(Boolean rftxStatus) {
		this.rftxStatus = rftxStatus;
	}

	/**
	 * Set the current status of this RF transmitter. {{true}} indicates that the 3G Tx transmitter is on. {{false}} indicates that the 3G Tx transmitter is off. This state is tied to the Administrative state which is controlled by the ACS. When the ACS sets AdminState to {{true}}, then the FAP has permission to turn on the RF transmitter. When the ACS sets AdminState to {{false}}, then the FAP is not allowed to provide service and MUST turn off the RF transmitter.
	 *
	 * @since 2.0
	 * @param rftxStatus the input value
	 * @return this instance
	 */
	public OneX withRftxStatus(Boolean rftxStatus) {
		this.rftxStatus = rftxStatus;
		return this;
	}

	/**
	 * Get the if Daylight Savings Time is being used with respect to CDMA2000 1x overhead parameters (see {{bibref|3GPP2-C.S0005}}), then {{param}} should be set to {{true}}. Otherwise, {{param}} should be set to {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDaylight() {
		return daylight;
	}

	/**
	 * Set the if Daylight Savings Time is being used with respect to CDMA2000 1x overhead parameters (see {{bibref|3GPP2-C.S0005}}), then {{param}} should be set to {{true}}. Otherwise, {{param}} should be set to {{false}}.
	 *
	 * @since 2.0
	 * @param daylight the input value
	 */
	public void  setDaylight(Integer daylight) {
		this.daylight = daylight;
	}

	/**
	 * Set the if Daylight Savings Time is being used with respect to CDMA2000 1x overhead parameters (see {{bibref|3GPP2-C.S0005}}), then {{param}} should be set to {{true}}. Otherwise, {{param}} should be set to {{false}}.
	 *
	 * @since 2.0
	 * @param daylight the input value
	 * @return this instance
	 */
	public OneX withDaylight(Integer daylight) {
		this.daylight = daylight;
		return this;
	}

	/**
	 * Get the protocol revision supported by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxPRev() {
		return maxPRev;
	}

	/**
	 * Set the protocol revision supported by the FAP.
	 *
	 * @since 2.0
	 * @param maxPRev the input value
	 */
	public void  setMaxPRev(Integer maxPRev) {
		this.maxPRev = maxPRev;
	}

	/**
	 * Set the protocol revision supported by the FAP.
	 *
	 * @since 2.0
	 * @param maxPRev the input value
	 * @return this instance
	 */
	public OneX withMaxPRev(Integer maxPRev) {
		this.maxPRev = maxPRev;
		return this;
	}

	/**
	 * Get the {{param}} triggers a re-registration of all mobiles. The FAP triggers re-registration of all registered mobiles everytime this number changes
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReregister() {
		return reregister;
	}

	/**
	 * Set the {{param}} triggers a re-registration of all mobiles. The FAP triggers re-registration of all registered mobiles everytime this number changes
	 *
	 * @since 2.0
	 * @param reregister the input value
	 */
	public void  setReregister(Long reregister) {
		this.reregister = reregister;
	}

	/**
	 * Set the {{param}} triggers a re-registration of all mobiles. The FAP triggers re-registration of all registered mobiles everytime this number changes
	 *
	 * @since 2.0
	 * @param reregister the input value
	 * @return this instance
	 */
	public OneX withReregister(Long reregister) {
		this.reregister = reregister;
		return this;
	}

	/**
	 * Get the period (in seconds) the session of an unauthorized user is kept alive after an emergency call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEmergencySessionPeriod() {
		return emergencySessionPeriod;
	}

	/**
	 * Set the period (in seconds) the session of an unauthorized user is kept alive after an emergency call.
	 *
	 * @since 2.0
	 * @param emergencySessionPeriod the input value
	 */
	public void  setEmergencySessionPeriod(Long emergencySessionPeriod) {
		this.emergencySessionPeriod = emergencySessionPeriod;
	}

	/**
	 * Set the period (in seconds) the session of an unauthorized user is kept alive after an emergency call.
	 *
	 * @since 2.0
	 * @param emergencySessionPeriod the input value
	 * @return this instance
	 */
	public OneX withEmergencySessionPeriod(Long emergencySessionPeriod) {
		this.emergencySessionPeriod = emergencySessionPeriod;
		return this;
	}

	/**
	 * Get the this is the location area code.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLocationAreaCode() {
		return locationAreaCode;
	}

	/**
	 * Set the this is the location area code.
	 *
	 * @since 2.0
	 * @param locationAreaCode the input value
	 */
	public void  setLocationAreaCode(Long locationAreaCode) {
		this.locationAreaCode = locationAreaCode;
	}

	/**
	 * Set the this is the location area code.
	 *
	 * @since 2.0
	 * @param locationAreaCode the input value
	 * @return this instance
	 */
	public OneX withLocationAreaCode(Long locationAreaCode) {
		this.locationAreaCode = locationAreaCode;
		return this;
	}

	/**
	 * Get the this is the FAP's MSCID. This ID is used in PANI header.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMscId() {
		return mscId;
	}

	/**
	 * Set the this is the FAP's MSCID. This ID is used in PANI header.
	 *
	 * @since 2.0
	 * @param mscId the input value
	 */
	public void  setMscId(Long mscId) {
		this.mscId = mscId;
	}

	/**
	 * Set the this is the FAP's MSCID. This ID is used in PANI header.
	 *
	 * @since 2.0
	 * @param mscId the input value
	 * @return this instance
	 */
	public OneX withMscId(Long mscId) {
		this.mscId = mscId;
		return this;
	}

	/**
	 * Get the indicates whether the FAP performs active hand-in from another base station. If {{true}} active hand-in is enabled; if {{false}} active hand-in is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActiveHandinEnable() {
		return activeHandinEnable;
	}

	/**
	 * Set the indicates whether the FAP performs active hand-in from another base station. If {{true}} active hand-in is enabled; if {{false}} active hand-in is disabled.
	 *
	 * @since 2.0
	 * @param activeHandinEnable the input value
	 */
	public void  setActiveHandinEnable(Boolean activeHandinEnable) {
		this.activeHandinEnable = activeHandinEnable;
	}

	/**
	 * Set the indicates whether the FAP performs active hand-in from another base station. If {{true}} active hand-in is enabled; if {{false}} active hand-in is disabled.
	 *
	 * @since 2.0
	 * @param activeHandinEnable the input value
	 * @return this instance
	 */
	public OneX withActiveHandinEnable(Boolean activeHandinEnable) {
		this.activeHandinEnable = activeHandinEnable;
		return this;
	}

	/**
	 * Get the cdmA2000 1x active handin operational parameters.
	 *
	 * @return the value
	 */
	public ActiveHandinMeasurement getActiveHandinMeasurement() {
		return activeHandinMeasurement;
	}

	/**
	 * Set the cdmA2000 1x active handin operational parameters.
	 *
	 * @param activeHandinMeasurement the input value
	 */
	public void  setActiveHandinMeasurement(ActiveHandinMeasurement activeHandinMeasurement) {
		this.activeHandinMeasurement = activeHandinMeasurement;
	}

	/**
	 * Set the cdmA2000 1x active handin operational parameters.
	 *
	 * @param activeHandinMeasurement the input value
	 * @return this instance
	 */
	public OneX withActiveHandinMeasurement(ActiveHandinMeasurement activeHandinMeasurement) {
		this.activeHandinMeasurement = activeHandinMeasurement;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 *
	 * @return the value
	 */
	public SelfConfig getSelfConfig() {
		return selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 *
	 * @param selfConfig the input value
	 */
	public void  setSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 *
	 * @param selfConfig the input value
	 * @return this instance
	 */
	public OneX withSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
		return this;
	}

	//</editor-fold>

}