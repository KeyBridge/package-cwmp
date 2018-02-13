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
package org.broadbandforum.tr135.stbservice.applications;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.stbservice.applications.audiencestats.Channel;

	/**
	 * Audience viewing statistics.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Applications.AudienceStats.")
@XmlRootElement(name = "STBService.Applications.AudienceStats")
@XmlType(name = "STBService.Applications.AudienceStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudienceStats {

	/**
	 * Enables or disables collection of viewing statistics.  Enabling collection of viewing statistics also resets the viewing statistics table.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * When set to {{true}} resets the viewing statistics table.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

Resetting statistics MUST reset all {{param|Channel.{i}.Duration}} parameters.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * Number of seconds since the Audience statistics were last enabled or reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ResetTime")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long resetTime;
	/**
	 * Table to record what the STB has been receiving. Time durations are recorded only for an AVPlayer's main AVStream (i.e. for TV channels being displayed in the main screen).

Each entry corresponds to a given TV channel and is indexed by channel name (the instance number is chosen by the STB and is not related to the channel number).
	 */
	@XmlElementWrapper(name = "Channels")
	@XmlElement(name = "Channel")
	public Collection<Channel> channels;

	public AudienceStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables collection of viewing statistics.  Enabling collection of viewing statistics also resets the viewing statistics table.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables collection of viewing statistics.  Enabling collection of viewing statistics also resets the viewing statistics table.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables collection of viewing statistics.  Enabling collection of viewing statistics also resets the viewing statistics table.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AudienceStats withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the when set to {{true}} resets the viewing statistics table.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

Resetting statistics MUST reset all {{param|Channel.{i}.Duration}} parameters.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}} resets the viewing statistics table.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

Resetting statistics MUST reset all {{param|Channel.{i}.Duration}} parameters.
	 *
	 * @since 1.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}} resets the viewing statistics table.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

Resetting statistics MUST reset all {{param|Channel.{i}.Duration}} parameters.
	 *
	 * @since 1.0
	 * @param reset the input value
	 * @return this instance
	 */
	public AudienceStats withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the number of seconds since the Audience statistics were last enabled or reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getResetTime() {
		return resetTime;
	}

	/**
	 * Set the number of seconds since the Audience statistics were last enabled or reset.
	 *
	 * @since 1.0
	 * @param resetTime the input value
	 */
	public void  setResetTime(Long resetTime) {
		this.resetTime = resetTime;
	}

	/**
	 * Set the number of seconds since the Audience statistics were last enabled or reset.
	 *
	 * @since 1.0
	 * @param resetTime the input value
	 * @return this instance
	 */
	public AudienceStats withResetTime(Long resetTime) {
		this.resetTime = resetTime;
		return this;
	}

	/**
	 * Get the table to record what the STB has been receiving. Time durations are recorded only for an AVPlayer's main AVStream (i.e. for TV channels being displayed in the main screen).

Each entry corresponds to a given TV channel and is indexed by channel name (the instance number is chosen by the STB and is not related to the channel number).
	 *
	 * @return the value
	 */
	public Collection<Channel> getChannels() {
		if (this.channels == null){ this.channels=new ArrayList<>();}
		return channels;
	}

	/**
	 * Set the table to record what the STB has been receiving. Time durations are recorded only for an AVPlayer's main AVStream (i.e. for TV channels being displayed in the main screen).

Each entry corresponds to a given TV channel and is indexed by channel name (the instance number is chosen by the STB and is not related to the channel number).
	 *
	 * @param channels the input value
	 */
	public void  setChannels(Collection<Channel> channels) {
		this.channels = channels;
	}

	/**
	 * Set the table to record what the STB has been receiving. Time durations are recorded only for an AVPlayer's main AVStream (i.e. for TV channels being displayed in the main screen).

Each entry corresponds to a given TV channel and is indexed by channel name (the instance number is chosen by the STB and is not related to the channel number).
	 *
	 * @param channel the input value
	 * @return this instance
	 */
	public AudienceStats withChannel(Channel channel) {
		getChannels().add(channel);
		return this;
	}

	//</editor-fold>

}