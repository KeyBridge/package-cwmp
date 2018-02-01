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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * S/PDIF output instance table configuration. This object, if present, is connected to the audio ouput instance currently delivering S/PDIF audio format as described in {{bibref|SPDIF}}.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Components.SPDIF.{i}.")
public class SPDIF {

	/**
	 * Enables or disables the S/PDIF output.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this S/PDIF output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
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
	 * Human-readable name associated with this output.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * When set to {{true}}, forces the audio format over S/PDIF to be in PCM mode. 

When set to {{false}}, let the compressed audio format be carried over S/PDIF (passthrough).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ForcePCM")
	@CWMPParameter(access = "readWrite")
	public Boolean forcePCM;
	/**
	 * When in Passthrough mode, the STB sends the audio stream over S/PDIF without decoding it.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Passthrough")
	public Boolean passthrough;
	/**
	 * Audio delay value, in milliseconds, currently being applied to the audio stream on the S/PDIF interface. The audio delay is entered by the user via his local UI, when necessary for correcting the lipsync.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AudioDelay")
	public Long audioDelay;

	public SPDIF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the S/PDIF output.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the S/PDIF output.
	 *
	 * @since 1.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the S/PDIF output.
	 *
	 * @since 1.1
	 * @param enable the input value
	 * @return this instance
	 */
	public SPDIF withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this S/PDIF output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this S/PDIF output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this S/PDIF output.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 * @return this instance
	 */
	public SPDIF withStatus(String status) {
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
	public SPDIF withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this output.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this output.
	 *
	 * @since 1.1
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this output.
	 *
	 * @since 1.1
	 * @param name the input value
	 * @return this instance
	 */
	public SPDIF withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the when set to {{true}}, forces the audio format over S/PDIF to be in PCM mode. 

When set to {{false}}, let the compressed audio format be carried over S/PDIF (passthrough).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isForcePCM() {
		return forcePCM;
	}

	/**
	 * Set the when set to {{true}}, forces the audio format over S/PDIF to be in PCM mode. 

When set to {{false}}, let the compressed audio format be carried over S/PDIF (passthrough).
	 *
	 * @since 1.1
	 * @param forcePCM the input value
	 */
	public void  setForcePCM(Boolean forcePCM) {
		this.forcePCM = forcePCM;
	}

	/**
	 * Set the when set to {{true}}, forces the audio format over S/PDIF to be in PCM mode. 

When set to {{false}}, let the compressed audio format be carried over S/PDIF (passthrough).
	 *
	 * @since 1.1
	 * @param forcePCM the input value
	 * @return this instance
	 */
	public SPDIF withForcePCM(Boolean forcePCM) {
		this.forcePCM = forcePCM;
		return this;
	}

	/**
	 * Get the when in Passthrough mode, the STB sends the audio stream over S/PDIF without decoding it.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isPassthrough() {
		return passthrough;
	}

	/**
	 * Set the when in Passthrough mode, the STB sends the audio stream over S/PDIF without decoding it.
	 *
	 * @since 1.1
	 * @param passthrough the input value
	 */
	public void  setPassthrough(Boolean passthrough) {
		this.passthrough = passthrough;
	}

	/**
	 * Set the when in Passthrough mode, the STB sends the audio stream over S/PDIF without decoding it.
	 *
	 * @since 1.1
	 * @param passthrough the input value
	 * @return this instance
	 */
	public SPDIF withPassthrough(Boolean passthrough) {
		this.passthrough = passthrough;
		return this;
	}

	/**
	 * Get audio delay value, in milliseconds, currently being applied to the audio stream on the S/PDIF interface. The audio delay is entered by the user via his local UI, when necessary for correcting the lipsync.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getAudioDelay() {
		return audioDelay;
	}

	/**
	 * Set audio delay value, in milliseconds, currently being applied to the audio stream on the S/PDIF interface. The audio delay is entered by the user via his local UI, when necessary for correcting the lipsync.
	 *
	 * @since 1.1
	 * @param audioDelay the input value
	 */
	public void  setAudioDelay(Long audioDelay) {
		this.audioDelay = audioDelay;
	}

	/**
	 * Set audio delay value, in milliseconds, currently being applied to the audio stream on the S/PDIF interface. The audio delay is entered by the user via his local UI, when necessary for correcting the lipsync.
	 *
	 * @since 1.1
	 * @param audioDelay the input value
	 * @return this instance
	 */
	public SPDIF withAudioDelay(Long audioDelay) {
		this.audioDelay = audioDelay;
		return this;
	}

	//</editor-fold>

}