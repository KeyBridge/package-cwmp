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
package org.broadbandforum.tr135.stbservice.capabilities.videodecoder;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.capabilities.videodecoder.smptevc1.ProfileLevel;

	/**
	 * Object describing the set of supported SMPTE-VC-1 profiles and levels for this STB. It also describes the set of audio standards supported when SMPTE-VC-1 is used as the video standard.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.VideoDecoder.SMPTEVC1.")
@XmlRootElement(name = "STBService.Capabilities.VideoDecoder.SMPTEVC1")
@XmlType(name = "STBService.Capabilities.VideoDecoder.SMPTEVC1")
@XmlAccessorType(XmlAccessType.FIELD)
public class SMPTEVC1 {

	/**
	 * Audio Standards supported by the Player when associated with SMPTE-VC-1 video.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioStandards")
	@XmlList
	public Collection<String> audioStandards;
	/**
	 * Table to describe the set of profiles and levels combinations supported by the STB when SMPTE-VC-1 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 */
	@XmlElementWrapper(name = "ProfileLevels")
	@XmlElement(name = "ProfileLevel")
	public Collection<ProfileLevel> profileLevels;

	public SMPTEVC1() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get audio Standards supported by the Player when associated with SMPTE-VC-1 video.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getAudioStandards() {
		if (this.audioStandards == null){ this.audioStandards=new ArrayList<>();}
		return audioStandards;
	}

	/**
	 * Set audio Standards supported by the Player when associated with SMPTE-VC-1 video.
	 *
	 * @since 1.0
	 * @param audioStandards the input value
	 */
	public void  setAudioStandards(Collection<String> audioStandards) {
		this.audioStandards = audioStandards;
	}

	/**
	 * Set audio Standards supported by the Player when associated with SMPTE-VC-1 video.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public SMPTEVC1 withAudioStandards(String string) {
		getAudioStandards().add(string);
		return this;
	}

	/**
	 * Get the table to describe the set of profiles and levels combinations supported by the STB when SMPTE-VC-1 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @return the value
	 */
	public Collection<ProfileLevel> getProfileLevels() {
		if (this.profileLevels == null){ this.profileLevels=new ArrayList<>();}
		return profileLevels;
	}

	/**
	 * Set the table to describe the set of profiles and levels combinations supported by the STB when SMPTE-VC-1 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @param profileLevels the input value
	 */
	public void  setProfileLevels(Collection<ProfileLevel> profileLevels) {
		this.profileLevels = profileLevels;
	}

	/**
	 * Set the table to describe the set of profiles and levels combinations supported by the STB when SMPTE-VC-1 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @param profileLevel the input value
	 * @return this instance
	 */
	public SMPTEVC1 withProfileLevel(ProfileLevel profileLevel) {
		getProfileLevels().add(profileLevel);
		return this;
	}

	//</editor-fold>

}