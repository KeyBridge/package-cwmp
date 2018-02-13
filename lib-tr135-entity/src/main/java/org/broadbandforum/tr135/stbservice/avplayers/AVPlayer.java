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
package org.broadbandforum.tr135.stbservice.avplayers;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * List of AV Player objects. Each item is one particular AV player being processed by the STB.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.AVPlayers.AVPlayer.{i}.")
@XmlRootElement(name = "AVPlayer")
@XmlType(name = "STBService.AVPlayers.AVPlayer")
@XmlAccessorType(XmlAccessType.FIELD)
public class AVPlayer {

	/**
	 * Enables or disables this AV player.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this AV player.  {{enum}}

If an AV player is disabled then the values of other AV player parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name associated with this AV player.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language being currently processed by the AV player.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioLanguage")
	@Size(max = 64)
	public String audioLanguage;
	/**
	 * The status of subtitling for this AV player.  {{enum}}

Subtitles are assumed to be shown only on the main screen.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SubtitlingStatus")
	public String subtitlingStatus;
	/**
	 * Human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language being currently processed by the AV player.

Subtitles are assumed to be shown only on the main screen.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SubtitlingLanguage")
	@Size(max = 64)
	public String subtitlingLanguage;
	/**
	 * Audio output object instances associated with this AV player, or {{empty}} if not associated with any audio output object instances.  For example:

''.Components.AudioOutput.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioOutputs")
	@Size(max = 1024)
	@XmlList
	public Collection<String> audioOutputs;
	/**
	 * Video output object instances associated with this AV player, or {{empty}} if not associated with any video output object instances.  For example:

''.Components.VideoOutput.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VideoOutputs")
	@Size(max = 1024)
	@XmlList
	public Collection<String> videoOutputs;
	/**
	 * AV stream object instance associated with this AV player that is being sent to the main screen, or {{empty}} if not associated with an AV stream object.  For example:

''.AVStreams.AVStream.2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MainStream")
	@Size(max = 256)
	public String mainStream;
	/**
	 * AV stream object instances associated with this AV player that are being displayed as Picture In Picture (PIP), or {{empty}} if not associated with any PIP AV stream objects.  For example:

* ''.AVStreams.AVStream.2''

* ''.AVStreams.AVStream.2,.AVStreams.AVStream.3''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PIPStreams")
	@Size(max = 1024)
	@XmlList
	public Collection<String> pipStreams;

	public AVPlayer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this AV player.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this AV player.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this AV player.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AVPlayer withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this AV player.  {{enum}}

If an AV player is disabled then the values of other AV player parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this AV player.  {{enum}}

If an AV player is disabled then the values of other AV player parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this AV player.  {{enum}}

If an AV player is disabled then the values of other AV player parameters are not significant.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public AVPlayer withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public AVPlayer withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this AV player.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this AV player.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this AV player.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public AVPlayer withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language being currently processed by the AV player.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAudioLanguage() {
		return audioLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language being currently processed by the AV player.
	 *
	 * @since 1.0
	 * @param audioLanguage the input value
	 */
	public void  setAudioLanguage(String audioLanguage) {
		this.audioLanguage = audioLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the audio language being currently processed by the AV player.
	 *
	 * @since 1.0
	 * @param audioLanguage the input value
	 * @return this instance
	 */
	public AVPlayer withAudioLanguage(String audioLanguage) {
		this.audioLanguage = audioLanguage;
		return this;
	}

	/**
	 * Get the status of subtitling for this AV player.  {{enum}}

Subtitles are assumed to be shown only on the main screen.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSubtitlingStatus() {
		return subtitlingStatus;
	}

	/**
	 * Set the status of subtitling for this AV player.  {{enum}}

Subtitles are assumed to be shown only on the main screen.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param subtitlingStatus the input value
	 */
	public void  setSubtitlingStatus(String subtitlingStatus) {
		this.subtitlingStatus = subtitlingStatus;
	}

	/**
	 * Set the status of subtitling for this AV player.  {{enum}}

Subtitles are assumed to be shown only on the main screen.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param subtitlingStatus the input value
	 * @return this instance
	 */
	public AVPlayer withSubtitlingStatus(String subtitlingStatus) {
		this.subtitlingStatus = subtitlingStatus;
		return this;
	}

	/**
	 * Get the human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language being currently processed by the AV player.

Subtitles are assumed to be shown only on the main screen.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSubtitlingLanguage() {
		return subtitlingLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language being currently processed by the AV player.

Subtitles are assumed to be shown only on the main screen.
	 *
	 * @since 1.0
	 * @param subtitlingLanguage the input value
	 */
	public void  setSubtitlingLanguage(String subtitlingLanguage) {
		this.subtitlingLanguage = subtitlingLanguage;
	}

	/**
	 * Set the human-readable string, as specified in {{bibref|RFC3066}}, describing the subtitling language being currently processed by the AV player.

Subtitles are assumed to be shown only on the main screen.
	 *
	 * @since 1.0
	 * @param subtitlingLanguage the input value
	 * @return this instance
	 */
	public AVPlayer withSubtitlingLanguage(String subtitlingLanguage) {
		this.subtitlingLanguage = subtitlingLanguage;
		return this;
	}

	/**
	 * Get audio output object instances associated with this AV player, or {{empty}} if not associated with any audio output object instances.  For example:

''.Components.AudioOutput.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getAudioOutputs() {
		if (this.audioOutputs == null){ this.audioOutputs=new ArrayList<>();}
		return audioOutputs;
	}

	/**
	 * Set audio output object instances associated with this AV player, or {{empty}} if not associated with any audio output object instances.  For example:

''.Components.AudioOutput.2''
	 *
	 * @since 1.0
	 * @param audioOutputs the input value
	 */
	public void  setAudioOutputs(Collection<String> audioOutputs) {
		this.audioOutputs = audioOutputs;
	}

	/**
	 * Set audio output object instances associated with this AV player, or {{empty}} if not associated with any audio output object instances.  For example:

''.Components.AudioOutput.2''
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public AVPlayer withAudioOutputs(String string) {
		getAudioOutputs().add(string);
		return this;
	}

	/**
	 * Get the video output object instances associated with this AV player, or {{empty}} if not associated with any video output object instances.  For example:

''.Components.VideoOutput.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getVideoOutputs() {
		if (this.videoOutputs == null){ this.videoOutputs=new ArrayList<>();}
		return videoOutputs;
	}

	/**
	 * Set the video output object instances associated with this AV player, or {{empty}} if not associated with any video output object instances.  For example:

''.Components.VideoOutput.2''
	 *
	 * @since 1.0
	 * @param videoOutputs the input value
	 */
	public void  setVideoOutputs(Collection<String> videoOutputs) {
		this.videoOutputs = videoOutputs;
	}

	/**
	 * Set the video output object instances associated with this AV player, or {{empty}} if not associated with any video output object instances.  For example:

''.Components.VideoOutput.2''
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public AVPlayer withVideoOutputs(String string) {
		getVideoOutputs().add(string);
		return this;
	}

	/**
	 * Get av stream object instance associated with this AV player that is being sent to the main screen, or {{empty}} if not associated with an AV stream object.  For example:

''.AVStreams.AVStream.2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMainStream() {
		return mainStream;
	}

	/**
	 * Set av stream object instance associated with this AV player that is being sent to the main screen, or {{empty}} if not associated with an AV stream object.  For example:

''.AVStreams.AVStream.2''
	 *
	 * @since 1.0
	 * @param mainStream the input value
	 */
	public void  setMainStream(String mainStream) {
		this.mainStream = mainStream;
	}

	/**
	 * Set av stream object instance associated with this AV player that is being sent to the main screen, or {{empty}} if not associated with an AV stream object.  For example:

''.AVStreams.AVStream.2''
	 *
	 * @since 1.0
	 * @param mainStream the input value
	 * @return this instance
	 */
	public AVPlayer withMainStream(String mainStream) {
		this.mainStream = mainStream;
		return this;
	}

	/**
	 * Get av stream object instances associated with this AV player that are being displayed as Picture In Picture (PIP), or {{empty}} if not associated with any PIP AV stream objects.  For example:

* ''.AVStreams.AVStream.2''

* ''.AVStreams.AVStream.2,.AVStreams.AVStream.3''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getPipStreams() {
		if (this.pipStreams == null){ this.pipStreams=new ArrayList<>();}
		return pipStreams;
	}

	/**
	 * Set av stream object instances associated with this AV player that are being displayed as Picture In Picture (PIP), or {{empty}} if not associated with any PIP AV stream objects.  For example:

* ''.AVStreams.AVStream.2''

* ''.AVStreams.AVStream.2,.AVStreams.AVStream.3''
	 *
	 * @since 1.0
	 * @param pipStreams the input value
	 */
	public void  setPipStreams(Collection<String> pipStreams) {
		this.pipStreams = pipStreams;
	}

	/**
	 * Set av stream object instances associated with this AV player that are being displayed as Picture In Picture (PIP), or {{empty}} if not associated with any PIP AV stream objects.  For example:

* ''.AVStreams.AVStream.2''

* ''.AVStreams.AVStream.2,.AVStreams.AVStream.3''
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public AVPlayer withPipStreams(String string) {
		getPipStreams().add(string);
		return this;
	}

	//</editor-fold>

}