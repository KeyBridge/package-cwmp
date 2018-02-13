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
package org.broadbandforum.tr135.stbservice.capabilities.videodecoder.mpeg4part10;

import java.util.ArrayList;
import java.util.Collection;
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
	 * Table to describe the set of profiles and levels combinations supported by the STB when MPEG4 Part 10 is used as video standard.

{{marktemplate|diffs-0:4}}{{+++k+++e---num---+++ys+++}}--- --- The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.VideoDecoder.MPEG4Part10.ProfileLevel.{i}.")
@XmlRootElement(name = "ProfileLevel")
@XmlType(name = "STBService.Capabilities.VideoDecoder.MPEG4Part10.ProfileLevel")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProfileLevel {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Supported MPEG4 Part 10 profiles.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Profile")
	@XmlList
	public Collection<String> profile;
	/**
	 * Supported MPEG4 Part 10 Levels.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Level")
	@XmlList
	public Collection<String> level;
	/**
	 * The maximum decoding capability for this video standard in Kilobits per second. This strictly depends on the profile and level selected.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumDecodingCapability")
	public Long maximumDecodingCapability;

	public ProfileLevel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public ProfileLevel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the supported MPEG4 Part 10 profiles.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getProfile() {
		if (this.profile == null){ this.profile=new ArrayList<>();}
		return profile;
	}

	/**
	 * Set the supported MPEG4 Part 10 profiles.
	 *
	 * @since 1.0
	 * @param profile the input value
	 */
	public void  setProfile(Collection<String> profile) {
		this.profile = profile;
	}

	/**
	 * Set the supported MPEG4 Part 10 profiles.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public ProfileLevel withProfile(String string) {
		getProfile().add(string);
		return this;
	}

	/**
	 * Get the supported MPEG4 Part 10 Levels.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getLevel() {
		if (this.level == null){ this.level=new ArrayList<>();}
		return level;
	}

	/**
	 * Set the supported MPEG4 Part 10 Levels.
	 *
	 * @since 1.0
	 * @param level the input value
	 */
	public void  setLevel(Collection<String> level) {
		this.level = level;
	}

	/**
	 * Set the supported MPEG4 Part 10 Levels.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public ProfileLevel withLevel(String string) {
		getLevel().add(string);
		return this;
	}

	/**
	 * Get the maximum decoding capability for this video standard in Kilobits per second. This strictly depends on the profile and level selected.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumDecodingCapability() {
		return maximumDecodingCapability;
	}

	/**
	 * Set the maximum decoding capability for this video standard in Kilobits per second. This strictly depends on the profile and level selected.
	 *
	 * @since 1.0
	 * @param maximumDecodingCapability the input value
	 */
	public void  setMaximumDecodingCapability(Long maximumDecodingCapability) {
		this.maximumDecodingCapability = maximumDecodingCapability;
	}

	/**
	 * Set the maximum decoding capability for this video standard in Kilobits per second. This strictly depends on the profile and level selected.
	 *
	 * @since 1.0
	 * @param maximumDecodingCapability the input value
	 * @return this instance
	 */
	public ProfileLevel withMaximumDecodingCapability(Long maximumDecodingCapability) {
		this.maximumDecodingCapability = maximumDecodingCapability;
		return this;
	}

	//</editor-fold>

}