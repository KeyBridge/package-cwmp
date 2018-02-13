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
package org.broadbandforum.tr104.voiceservice.pots;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.pots.fxs.DiagTests;
import org.broadbandforum.tr104.voiceservice.pots.fxs.VoiceProcessing;

	/**
	 * FXS physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_201_970}}
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.POTS.FXS.{i}.")
@XmlRootElement(name = "FXS")
@XmlType(name = "VoiceService.POTS.FXS")
@XmlAccessorType(XmlAccessType.FIELD)
public class FXS {

	/**
	 * Enables or disables this FXS interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this physical interface.
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
	 * Indicates the support for pass-through of fax data of this interface. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FaxPassThrough")
	@CWMPParameter(access = "readWrite")
	public String faxPassThrough;
	/**
	 * Indicates the support for pass-through of modem data of this interface. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModemPassThrough")
	@CWMPParameter(access = "readWrite")
	public String modemPassThrough;
	/**
	 * Dial type used on the line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DialType")
	@CWMPParameter(access = "readWrite")
	public String dialType;
	/**
	 * Whether the Calling Line identification (CLIP) is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ClipGeneration")
	@CWMPParameter(access = "readWrite")
	public Boolean clipGeneration;
	/**
	 * Whether a charging pulse is transmitted on the line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChargingPulse")
	@CWMPParameter(access = "readWrite")
	public Boolean chargingPulse;
	/**
	 * Indicates whether a terminal is plugged on this physical interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * Defines the terminal type plugged on this interface to determine the correct signaling to be used to contact the terminal.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TerminalType")
	@CWMPParameter(access = "readWrite")
	public String terminalType;
	/**
	 * Parameters related to voice processing (analogue/digital conversion) capabilities.
	 */
	@XmlElement(name = "VoiceProcessing")
	public VoiceProcessing voiceProcessing;
	/**
	 * FXS port tests.
	 */
	@XmlElement(name = "DiagTests")
	public DiagTests diagTests;

	public FXS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this FXS interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this FXS interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this FXS interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public FXS withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this physical interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this physical interface.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this physical interface.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public FXS withStatus(String status) {
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
	public FXS withAlias(Alias alias) {
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
	public FXS withName(String name) {
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
	public FXS withToneEventProfile(String toneEventProfile) {
		this.toneEventProfile = toneEventProfile;
		return this;
	}

	/**
	 * Get the indicates the support for pass-through of fax data of this interface. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFaxPassThrough() {
		return faxPassThrough;
	}

	/**
	 * Set the indicates the support for pass-through of fax data of this interface. {{enum}}
	 *
	 * @since 2.0
	 * @param faxPassThrough the input value
	 */
	public void  setFaxPassThrough(String faxPassThrough) {
		this.faxPassThrough = faxPassThrough;
	}

	/**
	 * Set the indicates the support for pass-through of fax data of this interface. {{enum}}
	 *
	 * @since 2.0
	 * @param faxPassThrough the input value
	 * @return this instance
	 */
	public FXS withFaxPassThrough(String faxPassThrough) {
		this.faxPassThrough = faxPassThrough;
		return this;
	}

	/**
	 * Get the indicates the support for pass-through of modem data of this interface. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getModemPassThrough() {
		return modemPassThrough;
	}

	/**
	 * Set the indicates the support for pass-through of modem data of this interface. {{enum}}
	 *
	 * @since 2.0
	 * @param modemPassThrough the input value
	 */
	public void  setModemPassThrough(String modemPassThrough) {
		this.modemPassThrough = modemPassThrough;
	}

	/**
	 * Set the indicates the support for pass-through of modem data of this interface. {{enum}}
	 *
	 * @since 2.0
	 * @param modemPassThrough the input value
	 * @return this instance
	 */
	public FXS withModemPassThrough(String modemPassThrough) {
		this.modemPassThrough = modemPassThrough;
		return this;
	}

	/**
	 * Get the dial type used on the line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDialType() {
		return dialType;
	}

	/**
	 * Set the dial type used on the line.
	 *
	 * @since 2.0
	 * @param dialType the input value
	 */
	public void  setDialType(String dialType) {
		this.dialType = dialType;
	}

	/**
	 * Set the dial type used on the line.
	 *
	 * @since 2.0
	 * @param dialType the input value
	 * @return this instance
	 */
	public FXS withDialType(String dialType) {
		this.dialType = dialType;
		return this;
	}

	/**
	 * Get the whether the Calling Line identification (CLIP) is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isClipGeneration() {
		return clipGeneration;
	}

	/**
	 * Set the whether the Calling Line identification (CLIP) is enabled.
	 *
	 * @since 2.0
	 * @param clipGeneration the input value
	 */
	public void  setClipGeneration(Boolean clipGeneration) {
		this.clipGeneration = clipGeneration;
	}

	/**
	 * Set the whether the Calling Line identification (CLIP) is enabled.
	 *
	 * @since 2.0
	 * @param clipGeneration the input value
	 * @return this instance
	 */
	public FXS withClipGeneration(Boolean clipGeneration) {
		this.clipGeneration = clipGeneration;
		return this;
	}

	/**
	 * Get the whether a charging pulse is transmitted on the line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isChargingPulse() {
		return chargingPulse;
	}

	/**
	 * Set the whether a charging pulse is transmitted on the line.
	 *
	 * @since 2.0
	 * @param chargingPulse the input value
	 */
	public void  setChargingPulse(Boolean chargingPulse) {
		this.chargingPulse = chargingPulse;
	}

	/**
	 * Set the whether a charging pulse is transmitted on the line.
	 *
	 * @since 2.0
	 * @param chargingPulse the input value
	 * @return this instance
	 */
	public FXS withChargingPulse(Boolean chargingPulse) {
		this.chargingPulse = chargingPulse;
		return this;
	}

	/**
	 * Get the indicates whether a terminal is plugged on this physical interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the indicates whether a terminal is plugged on this physical interface.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the indicates whether a terminal is plugged on this physical interface.
	 *
	 * @since 2.0
	 * @param active the input value
	 * @return this instance
	 */
	public FXS withActive(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Get the defines the terminal type plugged on this interface to determine the correct signaling to be used to contact the terminal.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTerminalType() {
		return terminalType;
	}

	/**
	 * Set the defines the terminal type plugged on this interface to determine the correct signaling to be used to contact the terminal.
	 *
	 * @since 2.0
	 * @param terminalType the input value
	 */
	public void  setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	/**
	 * Set the defines the terminal type plugged on this interface to determine the correct signaling to be used to contact the terminal.
	 *
	 * @since 2.0
	 * @param terminalType the input value
	 * @return this instance
	 */
	public FXS withTerminalType(String terminalType) {
		this.terminalType = terminalType;
		return this;
	}

	/**
	 * Get the parameters related to voice processing (analogue/digital conversion) capabilities.
	 *
	 * @return the value
	 */
	public VoiceProcessing getVoiceProcessing() {
		return voiceProcessing;
	}

	/**
	 * Set the parameters related to voice processing (analogue/digital conversion) capabilities.
	 *
	 * @param voiceProcessing the input value
	 */
	public void  setVoiceProcessing(VoiceProcessing voiceProcessing) {
		this.voiceProcessing = voiceProcessing;
	}

	/**
	 * Set the parameters related to voice processing (analogue/digital conversion) capabilities.
	 *
	 * @param voiceProcessing the input value
	 * @return this instance
	 */
	public FXS withVoiceProcessing(VoiceProcessing voiceProcessing) {
		this.voiceProcessing = voiceProcessing;
		return this;
	}

	/**
	 * Get the fxs port tests.
	 *
	 * @return the value
	 */
	public DiagTests getDiagTests() {
		return diagTests;
	}

	/**
	 * Set the fxs port tests.
	 *
	 * @param diagTests the input value
	 */
	public void  setDiagTests(DiagTests diagTests) {
		this.diagTests = diagTests;
	}

	/**
	 * Set the fxs port tests.
	 *
	 * @param diagTests the input value
	 * @return this instance
	 */
	public FXS withDiagTests(DiagTests diagTests) {
		this.diagTests = diagTests;
		return this;
	}

	//</editor-fold>

}