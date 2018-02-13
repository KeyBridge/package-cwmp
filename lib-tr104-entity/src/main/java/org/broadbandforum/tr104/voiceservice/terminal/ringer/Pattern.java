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
package org.broadbandforum.tr104.voiceservice.terminal.ringer;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Each entry in the table defines a single phase in an overall ring pattern.  Each phase identifies the entry that corresponds to the next phase.

Each entry in the table refers to the entry that corresponds to the next phase of the pattern.  The table MAY be set up such that entries form loops, or MAY end after a finite sequence.

The defaults given for this object apply only to explicit creation of an instance of this object and not to automatic creation of instances of this object due to creation of a parent object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Terminal.{i}.Ringer.Pattern.{i}.")
@XmlRootElement(name = "VoiceService.Terminal.Ringer.Pattern")
@XmlType(name = "VoiceService.Terminal.Ringer.Pattern")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pattern {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Whether or not a ringer is on during this phase of the pattern.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingerOn")
	@CWMPParameter(access = "readWrite")
	public Boolean ringerOn = false;
	/**
	 * The duration of this phase of the ring pattern, in milliseconds. 

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Duration")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long duration = 0L;
	/**
	 * The {{object}} for the next phase of the ring pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the ring pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NextPattern")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String nextPattern;

	public Pattern() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Pattern withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

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
	public Pattern withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the whether or not a ringer is on during this phase of the pattern.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRingerOn() {
		return ringerOn;
	}

	/**
	 * Set the whether or not a ringer is on during this phase of the pattern.
	 *
	 * @since 2.0
	 * @param ringerOn the input value
	 */
	public void  setRingerOn(Boolean ringerOn) {
		this.ringerOn = ringerOn;
	}

	/**
	 * Set the whether or not a ringer is on during this phase of the pattern.
	 *
	 * @since 2.0
	 * @param ringerOn the input value
	 * @return this instance
	 */
	public Pattern withRingerOn(Boolean ringerOn) {
		this.ringerOn = ringerOn;
		return this;
	}

	/**
	 * Get the duration of this phase of the ring pattern, in milliseconds. 

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * Set the duration of this phase of the ring pattern, in milliseconds. 

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 * @param duration the input value
	 */
	public void  setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * Set the duration of this phase of the ring pattern, in milliseconds. 

A value of zero indicates an unlimited duration.
	 *
	 * @since 2.0
	 * @param duration the input value
	 * @return this instance
	 */
	public Pattern withDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get the {{object}} for the next phase of the ring pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the ring pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNextPattern() {
		return nextPattern;
	}

	/**
	 * Set the {{object}} for the next phase of the ring pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the ring pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 * @param nextPattern the input value
	 */
	public void  setNextPattern(String nextPattern) {
		this.nextPattern = nextPattern;
	}

	/**
	 * Set the {{object}} for the next phase of the ring pattern, after the specified {{param|Duration}} of this phase has completed.

{{reference}}

{{empty}} indicates that the ring pattern is to terminate after the current phase is completed.
	 *
	 * @since 2.0
	 * @param nextPattern the input value
	 * @return this instance
	 */
	public Pattern withNextPattern(String nextPattern) {
		this.nextPattern = nextPattern;
		return this;
	}

	//</editor-fold>

}