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
package org.broadbandforum.tr135.stbservice.capabilities.videodecoder.smptevc1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * Table to describe the set of profiles and levels combinations supported by the STB when SMPTE-VC-1 is used as video standard.

{{keys}}  The table MUST include a distinct entry for each supported combination of these parameters.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.VideoDecoder.SMPTEVC1.ProfileLevel.{i}.")
@XmlRootElement(name = "STBService.Capabilities.VideoDecoder.SMPTEVC1.ProfileLevel")
@XmlType(name = "STBService.Capabilities.VideoDecoder.SMPTEVC1.ProfileLevel")
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
	 * Identifier of the SMPTE-VC-1 profile.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Profile")
	public String profile;
	/**
	 * Identifier of the SMPTE-VC-1 level.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Level")
	public String level;
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
	 * Get the identifier of the SMPTE-VC-1 profile.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * Set the identifier of the SMPTE-VC-1 profile.
	 *
	 * @since 1.0
	 * @param profile the input value
	 */
	public void  setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * Set the identifier of the SMPTE-VC-1 profile.
	 *
	 * @since 1.0
	 * @param profile the input value
	 * @return this instance
	 */
	public ProfileLevel withProfile(String profile) {
		this.profile = profile;
		return this;
	}

	/**
	 * Get the identifier of the SMPTE-VC-1 level.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Set the identifier of the SMPTE-VC-1 level.
	 *
	 * @since 1.0
	 * @param level the input value
	 */
	public void  setLevel(String level) {
		this.level = level;
	}

	/**
	 * Set the identifier of the SMPTE-VC-1 level.
	 *
	 * @since 1.0
	 * @param level the input value
	 * @return this instance
	 */
	public ProfileLevel withLevel(String level) {
		this.level = level;
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