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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.voiceservice.clocksynchronization.ClockSource;

	/**
	 * Clock source configuration for Time-Division multiplexing subsystem.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.ClockSynchronization.")
public class ClockSynchronization {

	/**
	 * The currently selected external clock source. If the current clock source is not selected from the {{object|ClockSource}} table, e.g. an internal holdover clock, this parameter is set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentSource")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String currentSource;
	/**
	 * Human readable description of the current clock synchronization status.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Description")
	@Size(max = 64)
	public String description;
	/**
	 * If set to {{true}} the CPE automatically reverts back to a higher priority external clock source when it becomes available once again. If set to {{false}}, an automatic change between external clock sources only occurs when the current source becomes unavailable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoRevert")
	@CWMPParameter(access = "readWrite")
	public Boolean autoRevert;
	/**
	 * List of eligible external clock sources. The number of entries in this table depends on the maximum number of external clock sources supported by the CPE.
	 */
	@XmlElementWrapper(name = "clockSources")
	@XmlElement(name = "ClockSource")
	public Collection<ClockSource> clockSources;

	public ClockSynchronization() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the currently selected external clock source. If the current clock source is not selected from the {{object|ClockSource}} table, e.g. an internal holdover clock, this parameter is set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCurrentSource() {
		return currentSource;
	}

	/**
	 * Set the currently selected external clock source. If the current clock source is not selected from the {{object|ClockSource}} table, e.g. an internal holdover clock, this parameter is set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param currentSource the input value
	 */
	public void  setCurrentSource(String currentSource) {
		this.currentSource = currentSource;
	}

	/**
	 * Set the currently selected external clock source. If the current clock source is not selected from the {{object|ClockSource}} table, e.g. an internal holdover clock, this parameter is set to {{empty}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param currentSource the input value
	 * @return this instance
	 */
	public ClockSynchronization withCurrentSource(String currentSource) {
		this.currentSource = currentSource;
		return this;
	}

	/**
	 * Get the human readable description of the current clock synchronization status.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the human readable description of the current clock synchronization status.
	 *
	 * @since 2.0
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the human readable description of the current clock synchronization status.
	 *
	 * @since 2.0
	 * @param description the input value
	 * @return this instance
	 */
	public ClockSynchronization withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the if set to {{true}} the CPE automatically reverts back to a higher priority external clock source when it becomes available once again. If set to {{false}}, an automatic change between external clock sources only occurs when the current source becomes unavailable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAutoRevert() {
		return autoRevert;
	}

	/**
	 * Set the if set to {{true}} the CPE automatically reverts back to a higher priority external clock source when it becomes available once again. If set to {{false}}, an automatic change between external clock sources only occurs when the current source becomes unavailable.
	 *
	 * @since 2.0
	 * @param autoRevert the input value
	 */
	public void  setAutoRevert(Boolean autoRevert) {
		this.autoRevert = autoRevert;
	}

	/**
	 * Set the if set to {{true}} the CPE automatically reverts back to a higher priority external clock source when it becomes available once again. If set to {{false}}, an automatic change between external clock sources only occurs when the current source becomes unavailable.
	 *
	 * @since 2.0
	 * @param autoRevert the input value
	 * @return this instance
	 */
	public ClockSynchronization withAutoRevert(Boolean autoRevert) {
		this.autoRevert = autoRevert;
		return this;
	}

	/**
	 * Get the list of eligible external clock sources. The number of entries in this table depends on the maximum number of external clock sources supported by the CPE.
	 *
	 * @return the value
	 */
	public Collection<ClockSource> getClockSources() {
		if (this.clockSources == null){ this.clockSources=new ArrayList<>();}
		return clockSources;
	}

	/**
	 * Set the list of eligible external clock sources. The number of entries in this table depends on the maximum number of external clock sources supported by the CPE.
	 *
	 * @param clockSources the input value
	 */
	public void  setClockSources(Collection<ClockSource> clockSources) {
		this.clockSources = clockSources;
	}

	/**
	 * Set the list of eligible external clock sources. The number of entries in this table depends on the maximum number of external clock sources supported by the CPE.
	 *
	 * @param clockSource the input value
	 * @return this instance
	 */
	public ClockSynchronization withClockSource(ClockSource clockSource) {
		getClockSources().add(clockSource);
		return this;
	}

	//</editor-fold>

}