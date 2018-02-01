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
package org.broadbandforum.tr135.stbservice.applications.audiencestats;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;

	/**
	 * Table to record what the STB has been receiving. Time durations are recorded only for an AVPlayer's main AVStream (i.e. for TV channels being displayed in the main screen).

Each entry corresponds to a given TV channel and is indexed by channel name (the instance number is chosen by the STB and is not related to the channel number).
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Applications.AudienceStats.Channel.{i}.")
public class Channel {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * String describing the TV channel being displayed in the main screen. MUST be the value of the corresponding {{param|.AVStreams.AVStream.{i}.Name}} parameter.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 256)
	public String name;
	/**
	 * The cumulative duration of this channel in seconds.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Duration")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long duration;

	public Channel() {
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
	public Channel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the string describing the TV channel being displayed in the main screen. MUST be the value of the corresponding {{param|.AVStreams.AVStream.{i}.Name}} parameter.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the string describing the TV channel being displayed in the main screen. MUST be the value of the corresponding {{param|.AVStreams.AVStream.{i}.Name}} parameter.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the string describing the TV channel being displayed in the main screen. MUST be the value of the corresponding {{param|.AVStreams.AVStream.{i}.Name}} parameter.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public Channel withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the cumulative duration of this channel in seconds.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * Set the cumulative duration of this channel in seconds.
	 *
	 * @since 1.0
	 * @param duration the input value
	 */
	public void  setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * Set the cumulative duration of this channel in seconds.
	 *
	 * @since 1.0
	 * @param duration the input value
	 * @return this instance
	 */
	public Channel withDuration(Long duration) {
		this.duration = duration;
		return this;
	}

	//</editor-fold>

}