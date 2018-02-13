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
import org.broadbandforum.tr135.stbservice.capabilities.videodecoder.mpeg2part2.ProfileLevel;

	/**
	 * Object describing the set of supported MPEG2 profiles and levels for this STB. It also describes the set of audio standards supported when MPEG2 Part 2 is used as the video standard.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.VideoDecoder.MPEG2Part2.")
@XmlRootElement(name = "MPEG2Part2")
@XmlType(name = "STBService.Capabilities.VideoDecoder.MPEG2Part2")
@XmlAccessorType(XmlAccessType.FIELD)
public class MPEG2Part2 {

	/**
	 * Audio Standards supported by the Player when associated with MPEG2 Part 2 Video.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AudioStandards")
	@XmlList
	public Collection<String> audioStandards;
	/**
	 * Table to describe the set of profiles and levels combinations supported by the STB when MPEG2 Part 2 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 */
	@XmlElementWrapper(name = "ProfileLevels")
	@XmlElement(name = "ProfileLevel")
	public Collection<ProfileLevel> profileLevels;

	public MPEG2Part2() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get audio Standards supported by the Player when associated with MPEG2 Part 2 Video.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getAudioStandards() {
		if (this.audioStandards == null){ this.audioStandards=new ArrayList<>();}
		return audioStandards;
	}

	/**
	 * Set audio Standards supported by the Player when associated with MPEG2 Part 2 Video.
	 *
	 * @since 1.0
	 * @param audioStandards the input value
	 */
	public void  setAudioStandards(Collection<String> audioStandards) {
		this.audioStandards = audioStandards;
	}

	/**
	 * Set audio Standards supported by the Player when associated with MPEG2 Part 2 Video.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public MPEG2Part2 withAudioStandards(String string) {
		getAudioStandards().add(string);
		return this;
	}

	/**
	 * Get the table to describe the set of profiles and levels combinations supported by the STB when MPEG2 Part 2 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @return the value
	 */
	public Collection<ProfileLevel> getProfileLevels() {
		if (this.profileLevels == null){ this.profileLevels=new ArrayList<>();}
		return profileLevels;
	}

	/**
	 * Set the table to describe the set of profiles and levels combinations supported by the STB when MPEG2 Part 2 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @param profileLevels the input value
	 */
	public void  setProfileLevels(Collection<ProfileLevel> profileLevels) {
		this.profileLevels = profileLevels;
	}

	/**
	 * Set the table to describe the set of profiles and levels combinations supported by the STB when MPEG2 Part 2 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @param profileLevel the input value
	 * @return this instance
	 */
	public MPEG2Part2 withProfileLevel(ProfileLevel profileLevel) {
		getProfileLevels().add(profileLevel);
		return this;
	}

	//</editor-fold>

}