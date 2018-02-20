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
package org.broadbandforum.tr104.voiceservice.terminal;

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
import org.broadbandforum.tr104.voiceservice.terminal.audio.VoiceProcessing;

	/**
	 * This object models the audio outputs of a telephony terminal.(ex. Handset, handsfree, ...)
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Terminal.{i}.Audio.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.Terminal.Audio")
@XmlType(name = "VoiceService.Terminal.Audio")
@XmlAccessorType(XmlAccessType.FIELD)
public class Audio {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The internal name of this audio.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String name;
	/**
	 * Parameters related to voice processing capabilities.
	 */
	@XmlElement(name = "VoiceProcessing")
	public VoiceProcessing voiceProcessing;

	public Audio() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public Audio withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the internal name of this audio.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the internal name of this audio.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the internal name of this audio.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Audio withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the parameters related to voice processing capabilities.
	 *
	 * @return the value
	 */
	public VoiceProcessing getVoiceProcessing() {
		return voiceProcessing;
	}

	/**
	 * Set the parameters related to voice processing capabilities.
	 *
	 * @param voiceProcessing the input value
	 */
	public void  setVoiceProcessing(VoiceProcessing voiceProcessing) {
		this.voiceProcessing = voiceProcessing;
	}

	/**
	 * Set the parameters related to voice processing capabilities.
	 *
	 * @param voiceProcessing the input value
	 * @return this instance
	 */
	public Audio withVoiceProcessing(VoiceProcessing voiceProcessing) {
		this.voiceProcessing = voiceProcessing;
		return this;
	}

	//</editor-fold>

}