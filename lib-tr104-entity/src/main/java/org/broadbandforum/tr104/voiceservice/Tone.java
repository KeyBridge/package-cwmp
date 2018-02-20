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
package org.broadbandforum.tr104.voiceservice;

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
import org.broadbandforum.tr104.voiceservice.tone.Description;
import org.broadbandforum.tr104.voiceservice.tone.EventProfile;
import org.broadbandforum.tr104.voiceservice.tone.Pattern;

	/**
	 * This object defines the contents of the tones and announcements generated locally by the VoIP device.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Tone.")
@XmlRootElement(name = "VoiceService.Tone")
@XmlType(name = "VoiceService.Tone")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tone {

	/**
	 * Reference to the default tone event profile.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefautEventProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String defautEventProfile;
	/**
	 * Each entry in this table defines the contents of an individual tone.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 */
	@XmlElementWrapper(name = "Descriptions")
	@XmlElement(name = "Description")
	@CWMPParameter(access = "readWrite")
	public Collection<Description> descriptions;
	/**
	 * Each entry in the table defines a single phase in an overall tone pattern.  Each phase identifies the entry that corresponds to the next phase.

Each entry in the table refers to the entry that corresponds to the next phase of the pattern.  The table MAY be set up such that entries form loops, or MAY end after a finite sequence.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 */
	@XmlElementWrapper(name = "Patterns")
	@XmlElement(name = "Pattern")
	@CWMPParameter(access = "readWrite")
	public Collection<Pattern> patterns;
	/**
	 * Configuration profile for tone events.
	 */
	@XmlElementWrapper(name = "EventProfiles")
	@XmlElement(name = "EventProfile")
	@CWMPParameter(access = "readWrite")
	public Collection<EventProfile> eventProfiles;

	public Tone() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the reference to the default tone event profile.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDefautEventProfile() {
		return defautEventProfile;
	}

	/**
	 * Set the reference to the default tone event profile.
	 *
	 * @since 2.0
	 * @param defautEventProfile the input value
	 */
	public void  setDefautEventProfile(String defautEventProfile) {
		this.defautEventProfile = defautEventProfile;
	}

	/**
	 * Set the reference to the default tone event profile.
	 *
	 * @since 2.0
	 * @param defautEventProfile the input value
	 * @return this instance
	 */
	public Tone withDefautEventProfile(String defautEventProfile) {
		this.defautEventProfile = defautEventProfile;
		return this;
	}

	/**
	 * Get the each entry in this table defines the contents of an individual tone.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @return the value
	 */
	public Collection<Description> getDescriptions() {
		if (this.descriptions == null){ this.descriptions=new ArrayList<>();}
		return descriptions;
	}

	/**
	 * Set the each entry in this table defines the contents of an individual tone.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @param descriptions the input value
	 */
	public void  setDescriptions(Collection<Description> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * Set the each entry in this table defines the contents of an individual tone.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @param description the input value
	 * @return this instance
	 */
	public Tone withDescription(Description description) {
		getDescriptions().add(description);
		return this;
	}

	/**
	 * Get the each entry in the table defines a single phase in an overall tone pattern.  Each phase identifies the entry that corresponds to the next phase.

Each entry in the table refers to the entry that corresponds to the next phase of the pattern.  The table MAY be set up such that entries form loops, or MAY end after a finite sequence.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @return the value
	 */
	public Collection<Pattern> getPatterns() {
		if (this.patterns == null){ this.patterns=new ArrayList<>();}
		return patterns;
	}

	/**
	 * Set the each entry in the table defines a single phase in an overall tone pattern.  Each phase identifies the entry that corresponds to the next phase.

Each entry in the table refers to the entry that corresponds to the next phase of the pattern.  The table MAY be set up such that entries form loops, or MAY end after a finite sequence.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @param patterns the input value
	 */
	public void  setPatterns(Collection<Pattern> patterns) {
		this.patterns = patterns;
	}

	/**
	 * Set the each entry in the table defines a single phase in an overall tone pattern.  Each phase identifies the entry that corresponds to the next phase.

Each entry in the table refers to the entry that corresponds to the next phase of the pattern.  The table MAY be set up such that entries form loops, or MAY end after a finite sequence.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @param pattern the input value
	 * @return this instance
	 */
	public Tone withPattern(Pattern pattern) {
		getPatterns().add(pattern);
		return this;
	}

	/**
	 * Get the configuration profile for tone events.
	 *
	 * @return the value
	 */
	public Collection<EventProfile> getEventProfiles() {
		if (this.eventProfiles == null){ this.eventProfiles=new ArrayList<>();}
		return eventProfiles;
	}

	/**
	 * Set the configuration profile for tone events.
	 *
	 * @param eventProfiles the input value
	 */
	public void  setEventProfiles(Collection<EventProfile> eventProfiles) {
		this.eventProfiles = eventProfiles;
	}

	/**
	 * Set the configuration profile for tone events.
	 *
	 * @param eventProfile the input value
	 * @return this instance
	 */
	public Tone withEventProfile(EventProfile eventProfile) {
		getEventProfiles().add(eventProfile);
		return this;
	}

	//</editor-fold>

}