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
package org.broadbandforum.tr135.stbservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.stbservice.avplayers.AVPlayer;

	/**
	 * AV Players object.  If more than one AV player can be active at a time, it may contain several {{object|AVPlayer}} instances. 

AV players are created statically. Each AV player corresponds to a combination of several AV streams (one main screen video, several PIP, one audio) being connected to an AV presentation device (such as a TV set).

There is no guarantee that the STB has the resources to enable all of its AV players at the same time.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.AVPlayers.")
@XmlRootElement(name = "STBService.AVPlayers")
@XmlType(name = "STBService.AVPlayers")
@XmlAccessorType(XmlAccessType.FIELD)
public class AVPlayers {

	/**
	 * Number of AV players currently active (i.e. with ''Status'' != ''Disabled'', which means the {{object|AVPlayer}} is processing an audio or AV stream).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ActiveAVPlayers")
	public Long activeAVPlayers;
	/**
	 * Human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language that SHOULD be used by the STB when receiving a multi-language audio multiplex.

{{empty}} indicates that there is no preferred audio language.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PreferredAudioLanguage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String preferredAudioLanguage;
	/**
	 * Human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language that SHOULD be used by the STB when receiving multi-language subtitling.

A value of ''None'' indicates that no subtitling is required.

{{empty}} indicates that there is no preferred subtitling language.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PreferredSubtitlingLanguage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String preferredSubtitlingLanguage;
	/**
	 * Aspect ratio behaviour preference for display on monitor.

If non-empty, the string MUST be one of the .Components.VideoOutput.{i}. AspectRatioBehaviour values.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PreferredBehaviour")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String preferredBehaviour;
	/**
	 * When set to {{true}}, the master PIN code for the STB is set to 0000. Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read. It is not recommended that this be set to true without the user's permission. No data on the device such as PVR recordings are to be cleared as a result of resetting the PIN code.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ResetPINCode")
	@CWMPParameter(access = "readWrite")
	public Boolean resetPINCode;
	/**
	 * List of AV Player objects. Each item is one particular AV player being processed by the STB.
	 */
	@XmlElementWrapper(name = "AVPlayers")
	@XmlElement(name = "AVPlayer")
	public Collection<AVPlayer> avplayers;

	public AVPlayers() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of AV players currently active (i.e. with ''Status'' != ''Disabled'', which means the {{object|AVPlayer}} is processing an audio or AV stream).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getActiveAVPlayers() {
		return activeAVPlayers;
	}

	/**
	 * Set the number of AV players currently active (i.e. with ''Status'' != ''Disabled'', which means the {{object|AVPlayer}} is processing an audio or AV stream).
	 *
	 * @since 1.0
	 * @param activeAVPlayers the input value
	 */
	public void  setActiveAVPlayers(Long activeAVPlayers) {
		this.activeAVPlayers = activeAVPlayers;
	}

	/**
	 * Set the number of AV players currently active (i.e. with ''Status'' != ''Disabled'', which means the {{object|AVPlayer}} is processing an audio or AV stream).
	 *
	 * @since 1.0
	 * @param activeAVPlayers the input value
	 * @return this instance
	 */
	public AVPlayers withActiveAVPlayers(Long activeAVPlayers) {
		this.activeAVPlayers = activeAVPlayers;
		return this;
	}

	/**
	 * Get the human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language that SHOULD be used by the STB when receiving a multi-language audio multiplex.

{{empty}} indicates that there is no preferred audio language.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPreferredAudioLanguage() {
		return preferredAudioLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language that SHOULD be used by the STB when receiving a multi-language audio multiplex.

{{empty}} indicates that there is no preferred audio language.
	 *
	 * @since 1.0
	 * @param preferredAudioLanguage the input value
	 */
	public void  setPreferredAudioLanguage(String preferredAudioLanguage) {
		this.preferredAudioLanguage = preferredAudioLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language that SHOULD be used by the STB when receiving a multi-language audio multiplex.

{{empty}} indicates that there is no preferred audio language.
	 *
	 * @since 1.0
	 * @param preferredAudioLanguage the input value
	 * @return this instance
	 */
	public AVPlayers withPreferredAudioLanguage(String preferredAudioLanguage) {
		this.preferredAudioLanguage = preferredAudioLanguage;
		return this;
	}

	/**
	 * Get the human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language that SHOULD be used by the STB when receiving multi-language subtitling.

A value of ''None'' indicates that no subtitling is required.

{{empty}} indicates that there is no preferred subtitling language.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPreferredSubtitlingLanguage() {
		return preferredSubtitlingLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language that SHOULD be used by the STB when receiving multi-language subtitling.

A value of ''None'' indicates that no subtitling is required.

{{empty}} indicates that there is no preferred subtitling language.
	 *
	 * @since 1.0
	 * @param preferredSubtitlingLanguage the input value
	 */
	public void  setPreferredSubtitlingLanguage(String preferredSubtitlingLanguage) {
		this.preferredSubtitlingLanguage = preferredSubtitlingLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language that SHOULD be used by the STB when receiving multi-language subtitling.

A value of ''None'' indicates that no subtitling is required.

{{empty}} indicates that there is no preferred subtitling language.
	 *
	 * @since 1.0
	 * @param preferredSubtitlingLanguage the input value
	 * @return this instance
	 */
	public AVPlayers withPreferredSubtitlingLanguage(String preferredSubtitlingLanguage) {
		this.preferredSubtitlingLanguage = preferredSubtitlingLanguage;
		return this;
	}

	/**
	 * Get aspect ratio behaviour preference for display on monitor.

If non-empty, the string MUST be one of the .Components.VideoOutput.{i}. AspectRatioBehaviour values.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getPreferredBehaviour() {
		return preferredBehaviour;
	}

	/**
	 * Set aspect ratio behaviour preference for display on monitor.

If non-empty, the string MUST be one of the .Components.VideoOutput.{i}. AspectRatioBehaviour values.
	 *
	 * @since 1.1
	 * @param preferredBehaviour the input value
	 */
	public void  setPreferredBehaviour(String preferredBehaviour) {
		this.preferredBehaviour = preferredBehaviour;
	}

	/**
	 * Set aspect ratio behaviour preference for display on monitor.

If non-empty, the string MUST be one of the .Components.VideoOutput.{i}. AspectRatioBehaviour values.
	 *
	 * @since 1.1
	 * @param preferredBehaviour the input value
	 * @return this instance
	 */
	public AVPlayers withPreferredBehaviour(String preferredBehaviour) {
		this.preferredBehaviour = preferredBehaviour;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the master PIN code for the STB is set to 0000. Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read. It is not recommended that this be set to true without the user's permission. No data on the device such as PVR recordings are to be cleared as a result of resetting the PIN code.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isResetPINCode() {
		return resetPINCode;
	}

	/**
	 * Set the when set to {{true}}, the master PIN code for the STB is set to 0000. Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read. It is not recommended that this be set to true without the user's permission. No data on the device such as PVR recordings are to be cleared as a result of resetting the PIN code.
	 *
	 * @since 1.1
	 * @param resetPINCode the input value
	 */
	public void  setResetPINCode(Boolean resetPINCode) {
		this.resetPINCode = resetPINCode;
	}

	/**
	 * Set the when set to {{true}}, the master PIN code for the STB is set to 0000. Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read. It is not recommended that this be set to true without the user's permission. No data on the device such as PVR recordings are to be cleared as a result of resetting the PIN code.
	 *
	 * @since 1.1
	 * @param resetPINCode the input value
	 * @return this instance
	 */
	public AVPlayers withResetPINCode(Boolean resetPINCode) {
		this.resetPINCode = resetPINCode;
		return this;
	}

	/**
	 * Get the list of AV Player objects. Each item is one particular AV player being processed by the STB.
	 *
	 * @return the value
	 */
	public Collection<AVPlayer> getAvplayers() {
		if (this.avplayers == null){ this.avplayers=new ArrayList<>();}
		return avplayers;
	}

	/**
	 * Set the list of AV Player objects. Each item is one particular AV player being processed by the STB.
	 *
	 * @param avplayers the input value
	 */
	public void  setAvplayers(Collection<AVPlayer> avplayers) {
		this.avplayers = avplayers;
	}

	/**
	 * Set the list of AV Player objects. Each item is one particular AV player being processed by the STB.
	 *
	 * @param avplayer the input value
	 * @return this instance
	 */
	public AVPlayers withAVPlayer(AVPlayer avplayer) {
		getAvplayers().add(avplayer);
		return this;
	}

	//</editor-fold>

}