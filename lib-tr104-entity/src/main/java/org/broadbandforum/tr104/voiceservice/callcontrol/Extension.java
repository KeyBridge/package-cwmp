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
package org.broadbandforum.tr104.voiceservice.callcontrol;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.callcontrol.extension.Stats;

	/**
	 * Extension table containing the local numbers and names.

Support for adding and removing extensions is conditional on whether the CPE supports more than one line in total as indicated by {{param|.Capabilities.MaxExtensionCount}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.Extension.{i}.")
public class Extension {

	/**
	 * Enable or disable this extension.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * If {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuiescentMode")
	@CWMPParameter(access = "readWrite")
	public Boolean quiescentMode;
	/**
	 * Indicates the status of this extension.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Indicates the call status for this extension.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallStatus")
	public String callStatus;
	/**
	 * Mechanism via which the {{object}} object was assigned.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * The name of this extension.

This name will also be used for CallerIdName functionality and for displaying on screen of handset, etc...
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String name;
	/**
	 * The number assigned to this extension for internal calls.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ExtensionNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String extensionNumber;
	/**
	 * Provider for the extension. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Provider")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String provider;
	/**
	 * Numbering plan to be used for outgoing calls.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberingPlan")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String numberingPlan;
	/**
	 * Set of calling features to apply to this extension.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallingFeatures")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String callingFeatures;
	/**
	 * Status of endpoint managed call waiting, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed call waiting.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallWaitingStatus")
	public String callWaitingStatus;
	/**
	 * Status of endpoint managed conference calling, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConferenceCallingStatus")
	public String conferenceCallingStatus;
	/**
	 * Number of active sessions on this extension.

: 0 indicates no call is in progress.

: 1 indicates a single call is in progress.

: Higher values indicate a conference call is in progress.

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConferenceCallingSessionCount")
	public Long conferenceCallingSessionCount;
	/**
	 * Voice mail to use when the {{object}} is not responding.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoiceMail")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String voiceMail;
	/**
	 * Statistics for this extension.

The CPE MUST reset the extension's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the extension becomes operationally down due to a previous administrative down (i.e. the extension's {{param|#.Status}} parameter transitions to a down state after the extension is disabled) or when the extension becomes administratively up (i.e. the extension's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Extension() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this extension.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this extension.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this extension.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Extension withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isQuiescentMode() {
		return quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 */
	public void  setQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 * @return this instance
	 */
	public Extension withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this extension.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this extension.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this extension.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Extension withStatus(String status) {
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
	public Extension withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates the call status for this extension.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallStatus() {
		return callStatus;
	}

	/**
	 * Set the indicates the call status for this extension.
	 *
	 * @since 2.0
	 * @param callStatus the input value
	 */
	public void  setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}

	/**
	 * Set the indicates the call status for this extension.
	 *
	 * @since 2.0
	 * @param callStatus the input value
	 * @return this instance
	 */
	public Extension withCallStatus(String callStatus) {
		this.callStatus = callStatus;
		return this;
	}

	/**
	 * Get the mechanism via which the {{object}} object was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the {{object}} object was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the {{object}} object was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Extension withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the name of this extension.

This name will also be used for CallerIdName functionality and for displaying on screen of handset, etc...
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of this extension.

This name will also be used for CallerIdName functionality and for displaying on screen of handset, etc...
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of this extension.

This name will also be used for CallerIdName functionality and for displaying on screen of handset, etc...
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Extension withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the number assigned to this extension for internal calls.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getExtensionNumber() {
		return extensionNumber;
	}

	/**
	 * Set the number assigned to this extension for internal calls.
	 *
	 * @since 2.0
	 * @param extensionNumber the input value
	 */
	public void  setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}

	/**
	 * Set the number assigned to this extension for internal calls.
	 *
	 * @since 2.0
	 * @param extensionNumber the input value
	 * @return this instance
	 */
	public Extension withExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
		return this;
	}

	/**
	 * Get the provider for the extension. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * Set the provider for the extension. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 * @param provider the input value
	 */
	public void  setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * Set the provider for the extension. The value MUST be the path name of a row in one of the following tables: 

{{reference}}
	 *
	 * @since 2.0
	 * @param provider the input value
	 * @return this instance
	 */
	public Extension withProvider(String provider) {
		this.provider = provider;
		return this;
	}

	/**
	 * Get the numbering plan to be used for outgoing calls.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNumberingPlan() {
		return numberingPlan;
	}

	/**
	 * Set the numbering plan to be used for outgoing calls.

{{reference}}
	 *
	 * @since 2.0
	 * @param numberingPlan the input value
	 */
	public void  setNumberingPlan(String numberingPlan) {
		this.numberingPlan = numberingPlan;
	}

	/**
	 * Set the numbering plan to be used for outgoing calls.

{{reference}}
	 *
	 * @since 2.0
	 * @param numberingPlan the input value
	 * @return this instance
	 */
	public Extension withNumberingPlan(String numberingPlan) {
		this.numberingPlan = numberingPlan;
		return this;
	}

	/**
	 * Get the set of calling features to apply to this extension.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallingFeatures() {
		return callingFeatures;
	}

	/**
	 * Set the set of calling features to apply to this extension.

{{reference}}
	 *
	 * @since 2.0
	 * @param callingFeatures the input value
	 */
	public void  setCallingFeatures(String callingFeatures) {
		this.callingFeatures = callingFeatures;
	}

	/**
	 * Set the set of calling features to apply to this extension.

{{reference}}
	 *
	 * @since 2.0
	 * @param callingFeatures the input value
	 * @return this instance
	 */
	public Extension withCallingFeatures(String callingFeatures) {
		this.callingFeatures = callingFeatures;
		return this;
	}

	/**
	 * Get the status of endpoint managed call waiting, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed call waiting.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallWaitingStatus() {
		return callWaitingStatus;
	}

	/**
	 * Set the status of endpoint managed call waiting, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed call waiting.
	 *
	 * @since 2.0
	 * @param callWaitingStatus the input value
	 */
	public void  setCallWaitingStatus(String callWaitingStatus) {
		this.callWaitingStatus = callWaitingStatus;
	}

	/**
	 * Set the status of endpoint managed call waiting, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed call waiting.
	 *
	 * @since 2.0
	 * @param callWaitingStatus the input value
	 * @return this instance
	 */
	public Extension withCallWaitingStatus(String callWaitingStatus) {
		this.callWaitingStatus = callWaitingStatus;
		return this;
	}

	/**
	 * Get the status of endpoint managed conference calling, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getConferenceCallingStatus() {
		return conferenceCallingStatus;
	}

	/**
	 * Set the status of endpoint managed conference calling, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 * @param conferenceCallingStatus the input value
	 */
	public void  setConferenceCallingStatus(String conferenceCallingStatus) {
		this.conferenceCallingStatus = conferenceCallingStatus;
	}

	/**
	 * Set the status of endpoint managed conference calling, if supported.  {{enum}}

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 * @param conferenceCallingStatus the input value
	 * @return this instance
	 */
	public Extension withConferenceCallingStatus(String conferenceCallingStatus) {
		this.conferenceCallingStatus = conferenceCallingStatus;
		return this;
	}

	/**
	 * Get the number of active sessions on this extension.

: 0 indicates no call is in progress.

: 1 indicates a single call is in progress.

: Higher values indicate a conference call is in progress.

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getConferenceCallingSessionCount() {
		return conferenceCallingSessionCount;
	}

	/**
	 * Set the number of active sessions on this extension.

: 0 indicates no call is in progress.

: 1 indicates a single call is in progress.

: Higher values indicate a conference call is in progress.

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 * @param conferenceCallingSessionCount the input value
	 */
	public void  setConferenceCallingSessionCount(Long conferenceCallingSessionCount) {
		this.conferenceCallingSessionCount = conferenceCallingSessionCount;
	}

	/**
	 * Set the number of active sessions on this extension.

: 0 indicates no call is in progress.

: 1 indicates a single call is in progress.

: Higher values indicate a conference call is in progress.

This parameter SHOULD NOT be present if the CPE does not support endpoint managed conference calling.
	 *
	 * @since 2.0
	 * @param conferenceCallingSessionCount the input value
	 * @return this instance
	 */
	public Extension withConferenceCallingSessionCount(Long conferenceCallingSessionCount) {
		this.conferenceCallingSessionCount = conferenceCallingSessionCount;
		return this;
	}

	/**
	 * Get the voice mail to use when the {{object}} is not responding.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVoiceMail() {
		return voiceMail;
	}

	/**
	 * Set the voice mail to use when the {{object}} is not responding.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiceMail the input value
	 */
	public void  setVoiceMail(String voiceMail) {
		this.voiceMail = voiceMail;
	}

	/**
	 * Set the voice mail to use when the {{object}} is not responding.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiceMail the input value
	 * @return this instance
	 */
	public Extension withVoiceMail(String voiceMail) {
		this.voiceMail = voiceMail;
		return this;
	}

	/**
	 * Get the statistics for this extension.

The CPE MUST reset the extension's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the extension becomes operationally down due to a previous administrative down (i.e. the extension's {{param|#.Status}} parameter transitions to a down state after the extension is disabled) or when the extension becomes administratively up (i.e. the extension's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the statistics for this extension.

The CPE MUST reset the extension's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the extension becomes operationally down due to a previous administrative down (i.e. the extension's {{param|#.Status}} parameter transitions to a down state after the extension is disabled) or when the extension becomes administratively up (i.e. the extension's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the statistics for this extension.

The CPE MUST reset the extension's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the extension becomes operationally down due to a previous administrative down (i.e. the extension's {{param|#.Status}} parameter transitions to a down state after the extension is disabled) or when the extension becomes administratively up (i.e. the extension's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}).
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Extension withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}