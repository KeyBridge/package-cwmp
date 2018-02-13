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
package org.broadbandforum.tr104.voiceservice.dect;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.dect.base.Stats;

	/**
	 * DECT base table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.DECT.Base.{i}.")
@XmlRootElement(name = "Base")
@XmlType(name = "VoiceService.DECT.Base")
@XmlAccessorType(XmlAccessType.FIELD)
public class Base {

	/**
	 * Enables or disables this base.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this base.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * Reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneEventProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String toneEventProfile;
	/**
	 * The highest DECT protocol version supported by the base.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Standard")
	public String standard;
	/**
	 * The Radio Fixed Part Identity which uniquely identifies the Base. The RFPI is a 40 bits number stored in a hexbinary string. The format of the number is class-dependant and is defined in {{bibref|ETSI_EN_300_175-6|sections 5.1 to 5.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFPI")
	public byte[] rfpI;
	/**
	 * The maximum number of Portable Parts (PP) supported by the DECT base of the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSupportedPP")
	@CWMPParameter(access = "readWrite")
	public Long maxSupportedPP;
	/**
	 * The PIN is an hexbinary string of 32 bits, as defined in {{bibref|ETSI_TS_102_527-3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PIN")
	@CWMPParameter(access = "readWrite")
	public byte[] pin;
	/**
	 * If {{true}}, the DECT system supports the REP feature, as defined in {{bibref|ETSI_EN_300_175-8}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RepeaterSupportEnabled")
	public Boolean repeaterSupportEnabled;
	/**
	 * Enable or disable NEMO (No Emission Mode as defined in {{bibref|ETSI_TS_102_527-3}}) operation of the base.  Note: NEMO operations can be successfully enabled only if all PPs registered to the CPE support the NEMO operations.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NEMOEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean nemOEnable;
	/**
	 * Enables the subscription mode of the DECT base. If {{true}}, the ''subscription window'' is open, otherwise it is closed. When the ''subscription window'' is open, a DECT portable part can be subscribed / registered to the DECT base. When written as {{true}}, it forces the device to open the ''subscription window''. When the ''subscription window'' timeslot expires, the value MUST be changed back to {{false}}.

If the CPE user can open the ''subscription window'' with a specific command (i.e. via DECT base GUI or pushing a button), the parameter MUST report the correct status ({{true}}, while the window is opened).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubscriptionEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean subscriptionEnable;
	/**
	 * Enable or disable ciphering for the calls on the DECT domain.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CipheringEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean cipheringEnable;
	/**
	 * Algorithm used in the encryption process defined in {{bibref|ETSI_EN_300_175-7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EncryptionType")
	public String encryptionType;
	/**
	 * This parameter is used to control the sending RF power as per the required range within the customer premises.

When set to 'Reduced', the CPE SHALL undertake measures to reduce the transmission RF power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFPowerControl")
	@CWMPParameter(access = "readWrite")
	public String rfpowerControl;
	/**
	 * Firmware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirmwareVersion")
	@Size(max = 20)
	public String firmwareVersion;
	/**
	 * EEPROM version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EepromVersion")
	@Size(max = 20)
	public String eepromVersion;
	/**
	 * Hardware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HardwareVersion")
	@Size(max = 20)
	public String hardwareVersion;
	/**
	 * This object is associated with statistics collected from the DECT domain of the CPE. The collected statistics are common for all call scenarios. 

The CPE MUST reset the DECT base's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the base becomes operationally down due to a previous administrative down (i.e. the base's {{param|#.Status}} parameter transitions to a down state after the base is disabled) or when the base becomes administratively up (i.e. the base's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Base() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this base.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this base.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this base.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Base withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this base.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this base.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this base.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Base withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Base withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Base withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getToneEventProfile() {
		return toneEventProfile;
	}

	/**
	 * Set the reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 * @param toneEventProfile the input value
	 */
	public void  setToneEventProfile(String toneEventProfile) {
		this.toneEventProfile = toneEventProfile;
	}

	/**
	 * Set the reference to the {{object|.Tone.EventProfile}} to use with this interface. If this parameter is {{empty}}, the value of {{param|.Tone.DefautEventProfile}} is used instead.
	 *
	 * @since 2.0
	 * @param toneEventProfile the input value
	 * @return this instance
	 */
	public Base withToneEventProfile(String toneEventProfile) {
		this.toneEventProfile = toneEventProfile;
		return this;
	}

	/**
	 * Get the highest DECT protocol version supported by the base.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * Set the highest DECT protocol version supported by the base.
	 *
	 * @since 2.0
	 * @param standard the input value
	 */
	public void  setStandard(String standard) {
		this.standard = standard;
	}

	/**
	 * Set the highest DECT protocol version supported by the base.
	 *
	 * @since 2.0
	 * @param standard the input value
	 * @return this instance
	 */
	public Base withStandard(String standard) {
		this.standard = standard;
		return this;
	}

	/**
	 * Get the Radio Fixed Part Identity which uniquely identifies the Base. The RFPI is a 40 bits number stored in a hexbinary string. The format of the number is class-dependant and is defined in {{bibref|ETSI_EN_300_175-6|sections 5.1 to 5.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getRfpI() {
		return rfpI;
	}

	/**
	 * Set the Radio Fixed Part Identity which uniquely identifies the Base. The RFPI is a 40 bits number stored in a hexbinary string. The format of the number is class-dependant and is defined in {{bibref|ETSI_EN_300_175-6|sections 5.1 to 5.5}}.
	 *
	 * @since 2.0
	 * @param rfpI the input value
	 */
	public void  setRfpI(byte[] rfpI) {
		this.rfpI = rfpI;
	}

	/**
	 * Set the Radio Fixed Part Identity which uniquely identifies the Base. The RFPI is a 40 bits number stored in a hexbinary string. The format of the number is class-dependant and is defined in {{bibref|ETSI_EN_300_175-6|sections 5.1 to 5.5}}.
	 *
	 * @since 2.0
	 * @param rfpI the input value
	 * @return this instance
	 */
	public Base withRfpI(byte[] rfpI) {
		this.rfpI = rfpI;
		return this;
	}

	/**
	 * Get the maximum number of Portable Parts (PP) supported by the DECT base of the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSupportedPP() {
		return maxSupportedPP;
	}

	/**
	 * Set the maximum number of Portable Parts (PP) supported by the DECT base of the CPE.
	 *
	 * @since 2.0
	 * @param maxSupportedPP the input value
	 */
	public void  setMaxSupportedPP(Long maxSupportedPP) {
		this.maxSupportedPP = maxSupportedPP;
	}

	/**
	 * Set the maximum number of Portable Parts (PP) supported by the DECT base of the CPE.
	 *
	 * @since 2.0
	 * @param maxSupportedPP the input value
	 * @return this instance
	 */
	public Base withMaxSupportedPP(Long maxSupportedPP) {
		this.maxSupportedPP = maxSupportedPP;
		return this;
	}

	/**
	 * Get the PIN is an hexbinary string of 32 bits, as defined in {{bibref|ETSI_TS_102_527-3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getPin() {
		return pin;
	}

	/**
	 * Set the PIN is an hexbinary string of 32 bits, as defined in {{bibref|ETSI_TS_102_527-3}}.
	 *
	 * @since 2.0
	 * @param pin the input value
	 */
	public void  setPin(byte[] pin) {
		this.pin = pin;
	}

	/**
	 * Set the PIN is an hexbinary string of 32 bits, as defined in {{bibref|ETSI_TS_102_527-3}}.
	 *
	 * @since 2.0
	 * @param pin the input value
	 * @return this instance
	 */
	public Base withPin(byte[] pin) {
		this.pin = pin;
		return this;
	}

	/**
	 * Get the if {{true}}, the DECT system supports the REP feature, as defined in {{bibref|ETSI_EN_300_175-8}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRepeaterSupportEnabled() {
		return repeaterSupportEnabled;
	}

	/**
	 * Set the if {{true}}, the DECT system supports the REP feature, as defined in {{bibref|ETSI_EN_300_175-8}}.
	 *
	 * @since 2.0
	 * @param repeaterSupportEnabled the input value
	 */
	public void  setRepeaterSupportEnabled(Boolean repeaterSupportEnabled) {
		this.repeaterSupportEnabled = repeaterSupportEnabled;
	}

	/**
	 * Set the if {{true}}, the DECT system supports the REP feature, as defined in {{bibref|ETSI_EN_300_175-8}}.
	 *
	 * @since 2.0
	 * @param repeaterSupportEnabled the input value
	 * @return this instance
	 */
	public Base withRepeaterSupportEnabled(Boolean repeaterSupportEnabled) {
		this.repeaterSupportEnabled = repeaterSupportEnabled;
		return this;
	}

	/**
	 * Get the enable or disable NEMO (No Emission Mode as defined in {{bibref|ETSI_TS_102_527-3}}) operation of the base.  Note: NEMO operations can be successfully enabled only if all PPs registered to the CPE support the NEMO operations.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNemOEnable() {
		return nemOEnable;
	}

	/**
	 * Set the enable or disable NEMO (No Emission Mode as defined in {{bibref|ETSI_TS_102_527-3}}) operation of the base.  Note: NEMO operations can be successfully enabled only if all PPs registered to the CPE support the NEMO operations.
	 *
	 * @since 2.0
	 * @param nemOEnable the input value
	 */
	public void  setNemOEnable(Boolean nemOEnable) {
		this.nemOEnable = nemOEnable;
	}

	/**
	 * Set the enable or disable NEMO (No Emission Mode as defined in {{bibref|ETSI_TS_102_527-3}}) operation of the base.  Note: NEMO operations can be successfully enabled only if all PPs registered to the CPE support the NEMO operations.
	 *
	 * @since 2.0
	 * @param nemOEnable the input value
	 * @return this instance
	 */
	public Base withNemOEnable(Boolean nemOEnable) {
		this.nemOEnable = nemOEnable;
		return this;
	}

	/**
	 * Get the enables the subscription mode of the DECT base. If {{true}}, the ''subscription window'' is open, otherwise it is closed. When the ''subscription window'' is open, a DECT portable part can be subscribed / registered to the DECT base. When written as {{true}}, it forces the device to open the ''subscription window''. When the ''subscription window'' timeslot expires, the value MUST be changed back to {{false}}.

If the CPE user can open the ''subscription window'' with a specific command (i.e. via DECT base GUI or pushing a button), the parameter MUST report the correct status ({{true}}, while the window is opened).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSubscriptionEnable() {
		return subscriptionEnable;
	}

	/**
	 * Set the enables the subscription mode of the DECT base. If {{true}}, the ''subscription window'' is open, otherwise it is closed. When the ''subscription window'' is open, a DECT portable part can be subscribed / registered to the DECT base. When written as {{true}}, it forces the device to open the ''subscription window''. When the ''subscription window'' timeslot expires, the value MUST be changed back to {{false}}.

If the CPE user can open the ''subscription window'' with a specific command (i.e. via DECT base GUI or pushing a button), the parameter MUST report the correct status ({{true}}, while the window is opened).
	 *
	 * @since 2.0
	 * @param subscriptionEnable the input value
	 */
	public void  setSubscriptionEnable(Boolean subscriptionEnable) {
		this.subscriptionEnable = subscriptionEnable;
	}

	/**
	 * Set the enables the subscription mode of the DECT base. If {{true}}, the ''subscription window'' is open, otherwise it is closed. When the ''subscription window'' is open, a DECT portable part can be subscribed / registered to the DECT base. When written as {{true}}, it forces the device to open the ''subscription window''. When the ''subscription window'' timeslot expires, the value MUST be changed back to {{false}}.

If the CPE user can open the ''subscription window'' with a specific command (i.e. via DECT base GUI or pushing a button), the parameter MUST report the correct status ({{true}}, while the window is opened).
	 *
	 * @since 2.0
	 * @param subscriptionEnable the input value
	 * @return this instance
	 */
	public Base withSubscriptionEnable(Boolean subscriptionEnable) {
		this.subscriptionEnable = subscriptionEnable;
		return this;
	}

	/**
	 * Get the enable or disable ciphering for the calls on the DECT domain.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCipheringEnable() {
		return cipheringEnable;
	}

	/**
	 * Set the enable or disable ciphering for the calls on the DECT domain.
	 *
	 * @since 2.0
	 * @param cipheringEnable the input value
	 */
	public void  setCipheringEnable(Boolean cipheringEnable) {
		this.cipheringEnable = cipheringEnable;
	}

	/**
	 * Set the enable or disable ciphering for the calls on the DECT domain.
	 *
	 * @since 2.0
	 * @param cipheringEnable the input value
	 * @return this instance
	 */
	public Base withCipheringEnable(Boolean cipheringEnable) {
		this.cipheringEnable = cipheringEnable;
		return this;
	}

	/**
	 * Get algorithm used in the encryption process defined in {{bibref|ETSI_EN_300_175-7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEncryptionType() {
		return encryptionType;
	}

	/**
	 * Set algorithm used in the encryption process defined in {{bibref|ETSI_EN_300_175-7}}.
	 *
	 * @since 2.0
	 * @param encryptionType the input value
	 */
	public void  setEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
	}

	/**
	 * Set algorithm used in the encryption process defined in {{bibref|ETSI_EN_300_175-7}}.
	 *
	 * @since 2.0
	 * @param encryptionType the input value
	 * @return this instance
	 */
	public Base withEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
		return this;
	}

	/**
	 * Get the this parameter is used to control the sending RF power as per the required range within the customer premises.

When set to 'Reduced', the CPE SHALL undertake measures to reduce the transmission RF power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRfpowerControl() {
		return rfpowerControl;
	}

	/**
	 * Set the this parameter is used to control the sending RF power as per the required range within the customer premises.

When set to 'Reduced', the CPE SHALL undertake measures to reduce the transmission RF power.
	 *
	 * @since 2.0
	 * @param rfpowerControl the input value
	 */
	public void  setRfpowerControl(String rfpowerControl) {
		this.rfpowerControl = rfpowerControl;
	}

	/**
	 * Set the this parameter is used to control the sending RF power as per the required range within the customer premises.

When set to 'Reduced', the CPE SHALL undertake measures to reduce the transmission RF power.
	 *
	 * @since 2.0
	 * @param rfpowerControl the input value
	 * @return this instance
	 */
	public Base withRfpowerControl(String rfpowerControl) {
		this.rfpowerControl = rfpowerControl;
		return this;
	}

	/**
	 * Get the firmware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Set the firmware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 */
	public void  setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Set the firmware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 * @return this instance
	 */
	public Base withFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		return this;
	}

	/**
	 * Get the eepROM version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEepromVersion() {
		return eepromVersion;
	}

	/**
	 * Set the eepROM version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @param eepromVersion the input value
	 */
	public void  setEepromVersion(String eepromVersion) {
		this.eepromVersion = eepromVersion;
	}

	/**
	 * Set the eepROM version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @param eepromVersion the input value
	 * @return this instance
	 */
	public Base withEepromVersion(String eepromVersion) {
		this.eepromVersion = eepromVersion;
		return this;
	}

	/**
	 * Get the hardware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHardwareVersion() {
		return hardwareVersion;
	}

	/**
	 * Set the hardware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @param hardwareVersion the input value
	 */
	public void  setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	/**
	 * Set the hardware version of the base as defined in {{bibref|ETSI_TS_102_527-3}}
	 *
	 * @since 2.0
	 * @param hardwareVersion the input value
	 * @return this instance
	 */
	public Base withHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
		return this;
	}

	/**
	 * Get the this object is associated with statistics collected from the DECT domain of the CPE. The collected statistics are common for all call scenarios. 

The CPE MUST reset the DECT base's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the base becomes operationally down due to a previous administrative down (i.e. the base's {{param|#.Status}} parameter transitions to a down state after the base is disabled) or when the base becomes administratively up (i.e. the base's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object is associated with statistics collected from the DECT domain of the CPE. The collected statistics are common for all call scenarios. 

The CPE MUST reset the DECT base's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the base becomes operationally down due to a previous administrative down (i.e. the base's {{param|#.Status}} parameter transitions to a down state after the base is disabled) or when the base becomes administratively up (i.e. the base's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object is associated with statistics collected from the DECT domain of the CPE. The collected statistics are common for all call scenarios. 

The CPE MUST reset the DECT base's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the base becomes operationally down due to a previous administrative down (i.e. the base's {{param|#.Status}} parameter transitions to a down state after the base is disabled) or when the base becomes administratively up (i.e. the base's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Base withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}