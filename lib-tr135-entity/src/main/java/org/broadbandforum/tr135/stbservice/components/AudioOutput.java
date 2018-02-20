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
package org.broadbandforum.tr135.stbservice.components;

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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Audio output instance table.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.AudioOutput.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Name"}, functional = false),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "STBService.Components.AudioOutput")
@XmlType(name = "STBService.Components.AudioOutput")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudioOutput {

	/**
	 * Enables or disables this audio output.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this audio output.  {{enum}}

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
	 * Human-readable name associated with this audio output.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Currently active audio output format, or {{empty}} if no audio output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioFormat")
	public String audioFormat;
	/**
	 * The audio level on this audio output in % (0 is quietest and 100 is loudest). This setting is independent of the mute status.

For some audio formats, the audio level is not meaningful, in which case this parameter SHOULD have a fixed value of 0.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioLevel")
	@CWMPParameter(access = "readWrite", units = "%")
	@Size(min = 0, max = 100)
	public Long audioLevel;
	/**
	 * When set to {{true}}, cancels this audio output's mute status. Setting it to {{false}} has no effect. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CancelMute")
	@CWMPParameter(access = "readWrite")
	public Boolean cancelMute;
	/**
	 * SCART object instances associated with this audio output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SCARTs")
	@Size(max = 1024)
	@XmlList
	public Collection<String> scaRTs;

	public AudioOutput() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this audio output.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this audio output.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this audio output.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AudioOutput withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this audio output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this audio output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this audio output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public AudioOutput withStatus(String status) {
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
	public AudioOutput withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this audio output.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this audio output.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this audio output.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public AudioOutput withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the currently active audio output format, or {{empty}} if no audio output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAudioFormat() {
		return audioFormat;
	}

	/**
	 * Set the currently active audio output format, or {{empty}} if no audio output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param audioFormat the input value
	 */
	public void  setAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
	}

	/**
	 * Set the currently active audio output format, or {{empty}} if no audio output format is currently active.

Note that this parameter refers to output formats and not to physical connectors.
	 *
	 * @since 1.0
	 * @param audioFormat the input value
	 * @return this instance
	 */
	public AudioOutput withAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
		return this;
	}

	/**
	 * Get the audio level on this audio output in % (0 is quietest and 100 is loudest). This setting is independent of the mute status.

For some audio formats, the audio level is not meaningful, in which case this parameter SHOULD have a fixed value of 0.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAudioLevel() {
		return audioLevel;
	}

	/**
	 * Set the audio level on this audio output in % (0 is quietest and 100 is loudest). This setting is independent of the mute status.

For some audio formats, the audio level is not meaningful, in which case this parameter SHOULD have a fixed value of 0.
	 *
	 * @since 1.0
	 * @param audioLevel the input value
	 */
	public void  setAudioLevel(Long audioLevel) {
		this.audioLevel = audioLevel;
	}

	/**
	 * Set the audio level on this audio output in % (0 is quietest and 100 is loudest). This setting is independent of the mute status.

For some audio formats, the audio level is not meaningful, in which case this parameter SHOULD have a fixed value of 0.
	 *
	 * @since 1.0
	 * @param audioLevel the input value
	 * @return this instance
	 */
	public AudioOutput withAudioLevel(Long audioLevel) {
		this.audioLevel = audioLevel;
		return this;
	}

	/**
	 * Get the when set to {{true}}, cancels this audio output's mute status. Setting it to {{false}} has no effect. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isCancelMute() {
		return cancelMute;
	}

	/**
	 * Set the when set to {{true}}, cancels this audio output's mute status. Setting it to {{false}} has no effect. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @param cancelMute the input value
	 */
	public void  setCancelMute(Boolean cancelMute) {
		this.cancelMute = cancelMute;
	}

	/**
	 * Set the when set to {{true}}, cancels this audio output's mute status. Setting it to {{false}} has no effect. The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @param cancelMute the input value
	 * @return this instance
	 */
	public AudioOutput withCancelMute(Boolean cancelMute) {
		this.cancelMute = cancelMute;
		return this;
	}

	/**
	 * Get the scaRT object instances associated with this audio output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getScaRTs() {
		if (this.scaRTs == null){ this.scaRTs=new ArrayList<>();}
		return scaRTs;
	}

	/**
	 * Set the scaRT object instances associated with this audio output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 * @param scaRTs the input value
	 */
	public void  setScaRTs(Collection<String> scaRTs) {
		this.scaRTs = scaRTs;
	}

	/**
	 * Set the scaRT object instances associated with this audio output, or {{empty}} if not associated with any SCART object instances.  For example:

* ''.Components.SCART.2''

* ''.Components.SCART.2,.Components.SCART.3''
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public AudioOutput withScaRTs(String string) {
		getScaRTs().add(string);
		return this;
	}

	//</editor-fold>

}