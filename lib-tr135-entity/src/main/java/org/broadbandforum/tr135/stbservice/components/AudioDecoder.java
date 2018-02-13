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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * Audio decoder instance table. It contains data representing the current status of the Audio decoder.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.AudioDecoder.{i}.")
@XmlRootElement(name = "STBService.Components.AudioDecoder")
@XmlType(name = "STBService.Components.AudioDecoder")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudioDecoder {

	/**
	 * Enables or disables this audio decoder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this audio decoder.  {{enum}}

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
	 * Human-readable name associated with this audio decoder.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * Audio standard currently being processed by this audio decoder, or an empty string if no audio standard is currently being processed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioStandard")
	public String audioStandard;

	public AudioDecoder() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this audio decoder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this audio decoder.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this audio decoder.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AudioDecoder withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this audio decoder.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this audio decoder.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this audio decoder.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public AudioDecoder withStatus(String status) {
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
	public AudioDecoder withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this audio decoder.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this audio decoder.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this audio decoder.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public AudioDecoder withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get audio standard currently being processed by this audio decoder, or an empty string if no audio standard is currently being processed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAudioStandard() {
		return audioStandard;
	}

	/**
	 * Set audio standard currently being processed by this audio decoder, or an empty string if no audio standard is currently being processed.
	 *
	 * @since 1.0
	 * @param audioStandard the input value
	 */
	public void  setAudioStandard(String audioStandard) {
		this.audioStandard = audioStandard;
	}

	/**
	 * Set audio standard currently being processed by this audio decoder, or an empty string if no audio standard is currently being processed.
	 *
	 * @since 1.0
	 * @param audioStandard the input value
	 * @return this instance
	 */
	public AudioDecoder withAudioStandard(String audioStandard) {
		this.audioStandard = audioStandard;
		return this;
	}

	//</editor-fold>

}