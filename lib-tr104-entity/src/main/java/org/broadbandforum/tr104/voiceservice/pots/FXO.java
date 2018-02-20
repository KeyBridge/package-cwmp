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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr104.voiceservice.pots.fxo.DiagTests;

	/**
	 * FXO physical interfaces table (a voice physical interface as described in {{bibref|TR-104i2|Section 4.1}}).

Each entry in the table models an analogue physical interface as defined by {{bibref|ETSI_ES_203_021}}
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.POTS.FXO.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Name"}, functional = false),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.POTS.FXO")
@XmlType(name = "VoiceService.POTS.FXO")
@XmlAccessorType(XmlAccessType.FIELD)
public class FXO {

	/**
	 * Enables or disables this FXO interface.
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
	 * Enables the second step dialing mode.

If {{false}}, incoming dialed digits are processed through the voice routing table.

If {{true}}, the FXO port goes directly to the off-hook state and works as a FXS port for the dialing reception (a dial-tone is transmitted). The received digits are processed through the routing table until a match is found. If a match is found, the call is routed to the appropriate subscriber.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecondStepDialing")
	@CWMPParameter(access = "readWrite")
	public Boolean secondStepDialing;
	/**
	 * Specifies the time in seconds between off-hook and the transmission of the first digit for FXO interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeoutBeforeDialing")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1, max = 60)
	public Long timeoutBeforeDialing;
	/**
	 * Defines the timeout in seconds for incoming call on this FXO port: after receiving a ringing signal, the call is disconnected if no ringing signal is received anymore during this time.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingingTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1, max = 30)
	public Long ringingTimeout;
	/**
	 * Defines the number of pulses for ringing signal detection on FXO port.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 40)
	public Long ringNumber;
	/**
	 * Specify the minimum duration in milliseconds of the "on-hook" state between two successive calls.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OnHookMinDuration")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 20, max = 10000)
	public Long onhookMinDuration;
	/**
	 * Signaling mode used for line seizure by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SignalingMode")
	@CWMPParameter(access = "readWrite")
	public String signalingMode;
	/**
	 * The time interval in milliseconds between dialing DTMF digits to PSTN. See also {{bibref|ETSI_ES_203_021}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DTMFDialoutInterval")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 20, max = 10000)
	public Long dtmFDialoutInterval;
	/**
	 * Enables the detection of CallerId for incoming calls. See also {{bibref|ETSI_ES_203_021}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallerIdDetectionEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean callerIdDetectionEnable;
	/**
	 * Determines if this physical interface is plugged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * FXO port tests.
	 */
	@XmlElement(name = "DiagTests")
	public DiagTests diagTests;

	public FXO() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this FXO interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this FXO interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this FXO interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public FXO withEnable(Boolean enable) {
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
	public FXO withStatus(String status) {
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
	public FXO withAlias(Alias alias) {
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
	public FXO withName(String name) {
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
	public FXO withToneEventProfile(String toneEventProfile) {
		this.toneEventProfile = toneEventProfile;
		return this;
	}

	/**
	 * Get the enables the second step dialing mode.

If {{false}}, incoming dialed digits are processed through the voice routing table.

If {{true}}, the FXO port goes directly to the off-hook state and works as a FXS port for the dialing reception (a dial-tone is transmitted). The received digits are processed through the routing table until a match is found. If a match is found, the call is routed to the appropriate subscriber.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSecondStepDialing() {
		return secondStepDialing;
	}

	/**
	 * Set the enables the second step dialing mode.

If {{false}}, incoming dialed digits are processed through the voice routing table.

If {{true}}, the FXO port goes directly to the off-hook state and works as a FXS port for the dialing reception (a dial-tone is transmitted). The received digits are processed through the routing table until a match is found. If a match is found, the call is routed to the appropriate subscriber.
	 *
	 * @since 2.0
	 * @param secondStepDialing the input value
	 */
	public void  setSecondStepDialing(Boolean secondStepDialing) {
		this.secondStepDialing = secondStepDialing;
	}

	/**
	 * Set the enables the second step dialing mode.

If {{false}}, incoming dialed digits are processed through the voice routing table.

If {{true}}, the FXO port goes directly to the off-hook state and works as a FXS port for the dialing reception (a dial-tone is transmitted). The received digits are processed through the routing table until a match is found. If a match is found, the call is routed to the appropriate subscriber.
	 *
	 * @since 2.0
	 * @param secondStepDialing the input value
	 * @return this instance
	 */
	public FXO withSecondStepDialing(Boolean secondStepDialing) {
		this.secondStepDialing = secondStepDialing;
		return this;
	}

	/**
	 * Get the specifies the time in seconds between off-hook and the transmission of the first digit for FXO interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeoutBeforeDialing() {
		return timeoutBeforeDialing;
	}

	/**
	 * Set the specifies the time in seconds between off-hook and the transmission of the first digit for FXO interface.
	 *
	 * @since 2.0
	 * @param timeoutBeforeDialing the input value
	 */
	public void  setTimeoutBeforeDialing(Long timeoutBeforeDialing) {
		this.timeoutBeforeDialing = timeoutBeforeDialing;
	}

	/**
	 * Set the specifies the time in seconds between off-hook and the transmission of the first digit for FXO interface.
	 *
	 * @since 2.0
	 * @param timeoutBeforeDialing the input value
	 * @return this instance
	 */
	public FXO withTimeoutBeforeDialing(Long timeoutBeforeDialing) {
		this.timeoutBeforeDialing = timeoutBeforeDialing;
		return this;
	}

	/**
	 * Get the defines the timeout in seconds for incoming call on this FXO port: after receiving a ringing signal, the call is disconnected if no ringing signal is received anymore during this time.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRingingTimeout() {
		return ringingTimeout;
	}

	/**
	 * Set the defines the timeout in seconds for incoming call on this FXO port: after receiving a ringing signal, the call is disconnected if no ringing signal is received anymore during this time.
	 *
	 * @since 2.0
	 * @param ringingTimeout the input value
	 */
	public void  setRingingTimeout(Long ringingTimeout) {
		this.ringingTimeout = ringingTimeout;
	}

	/**
	 * Set the defines the timeout in seconds for incoming call on this FXO port: after receiving a ringing signal, the call is disconnected if no ringing signal is received anymore during this time.
	 *
	 * @since 2.0
	 * @param ringingTimeout the input value
	 * @return this instance
	 */
	public FXO withRingingTimeout(Long ringingTimeout) {
		this.ringingTimeout = ringingTimeout;
		return this;
	}

	/**
	 * Get the defines the number of pulses for ringing signal detection on FXO port.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRingNumber() {
		return ringNumber;
	}

	/**
	 * Set the defines the number of pulses for ringing signal detection on FXO port.
	 *
	 * @since 2.0
	 * @param ringNumber the input value
	 */
	public void  setRingNumber(Long ringNumber) {
		this.ringNumber = ringNumber;
	}

	/**
	 * Set the defines the number of pulses for ringing signal detection on FXO port.
	 *
	 * @since 2.0
	 * @param ringNumber the input value
	 * @return this instance
	 */
	public FXO withRingNumber(Long ringNumber) {
		this.ringNumber = ringNumber;
		return this;
	}

	/**
	 * Get the specify the minimum duration in milliseconds of the "on-hook" state between two successive calls.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOnhookMinDuration() {
		return onhookMinDuration;
	}

	/**
	 * Set the specify the minimum duration in milliseconds of the "on-hook" state between two successive calls.
	 *
	 * @since 2.0
	 * @param onhookMinDuration the input value
	 */
	public void  setOnhookMinDuration(Long onhookMinDuration) {
		this.onhookMinDuration = onhookMinDuration;
	}

	/**
	 * Set the specify the minimum duration in milliseconds of the "on-hook" state between two successive calls.
	 *
	 * @since 2.0
	 * @param onhookMinDuration the input value
	 * @return this instance
	 */
	public FXO withOnhookMinDuration(Long onhookMinDuration) {
		this.onhookMinDuration = onhookMinDuration;
		return this;
	}

	/**
	 * Get the signaling mode used for line seizure by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSignalingMode() {
		return signalingMode;
	}

	/**
	 * Set the signaling mode used for line seizure by the CPE.
	 *
	 * @since 2.0
	 * @param signalingMode the input value
	 */
	public void  setSignalingMode(String signalingMode) {
		this.signalingMode = signalingMode;
	}

	/**
	 * Set the signaling mode used for line seizure by the CPE.
	 *
	 * @since 2.0
	 * @param signalingMode the input value
	 * @return this instance
	 */
	public FXO withSignalingMode(String signalingMode) {
		this.signalingMode = signalingMode;
		return this;
	}

	/**
	 * Get the time interval in milliseconds between dialing DTMF digits to PSTN. See also {{bibref|ETSI_ES_203_021}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDtmFDialoutInterval() {
		return dtmFDialoutInterval;
	}

	/**
	 * Set the time interval in milliseconds between dialing DTMF digits to PSTN. See also {{bibref|ETSI_ES_203_021}}
	 *
	 * @since 2.0
	 * @param dtmFDialoutInterval the input value
	 */
	public void  setDtmFDialoutInterval(Long dtmFDialoutInterval) {
		this.dtmFDialoutInterval = dtmFDialoutInterval;
	}

	/**
	 * Set the time interval in milliseconds between dialing DTMF digits to PSTN. See also {{bibref|ETSI_ES_203_021}}
	 *
	 * @since 2.0
	 * @param dtmFDialoutInterval the input value
	 * @return this instance
	 */
	public FXO withDtmFDialoutInterval(Long dtmFDialoutInterval) {
		this.dtmFDialoutInterval = dtmFDialoutInterval;
		return this;
	}

	/**
	 * Get the enables the detection of CallerId for incoming calls. See also {{bibref|ETSI_ES_203_021}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCallerIdDetectionEnable() {
		return callerIdDetectionEnable;
	}

	/**
	 * Set the enables the detection of CallerId for incoming calls. See also {{bibref|ETSI_ES_203_021}}.
	 *
	 * @since 2.0
	 * @param callerIdDetectionEnable the input value
	 */
	public void  setCallerIdDetectionEnable(Boolean callerIdDetectionEnable) {
		this.callerIdDetectionEnable = callerIdDetectionEnable;
	}

	/**
	 * Set the enables the detection of CallerId for incoming calls. See also {{bibref|ETSI_ES_203_021}}.
	 *
	 * @since 2.0
	 * @param callerIdDetectionEnable the input value
	 * @return this instance
	 */
	public FXO withCallerIdDetectionEnable(Boolean callerIdDetectionEnable) {
		this.callerIdDetectionEnable = callerIdDetectionEnable;
		return this;
	}

	/**
	 * Get the determines if this physical interface is plugged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the determines if this physical interface is plugged.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the determines if this physical interface is plugged.
	 *
	 * @since 2.0
	 * @param active the input value
	 * @return this instance
	 */
	public FXO withActive(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Get the fxo port tests.
	 *
	 * @return the value
	 */
	public DiagTests getDiagTests() {
		return diagTests;
	}

	/**
	 * Set the fxo port tests.
	 *
	 * @param diagTests the input value
	 */
	public void  setDiagTests(DiagTests diagTests) {
		this.diagTests = diagTests;
	}

	/**
	 * Set the fxo port tests.
	 *
	 * @param diagTests the input value
	 * @return this instance
	 */
	public FXO withDiagTests(DiagTests diagTests) {
		this.diagTests = diagTests;
		return this;
	}

	//</editor-fold>

}