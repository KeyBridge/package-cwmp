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
package org.broadbandforum.tr181.device.hpna.diagnostics.performancemonitoring;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.hpna.diagnostics.performancemonitoring.channels.Channel;

	/**
	 * Per-channel HPNA performance monitoring results.

        Note: channels are unidirectional.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Diagnostics.PerformanceMonitoring.Channels.")
public class Channels {

	/**
	 * Time at which channel data was last collected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeStamp")
	public LocalDateTime timeStamp;
	/**
	 * Per-channel HPNA performance monitoring results.
	 */
	@XmlElementWrapper(name = "channels")
	@XmlElement(name = "Channel")
	public Collection<Channel> channels;

	public Channels() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the time at which channel data was last collected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Set the time at which channel data was last collected.
	 *
	 * @since 2.0
	 * @param timeStamp the input value
	 */
	public void  setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * Set the time at which channel data was last collected.
	 *
	 * @since 2.0
	 * @param timeStamp the input value
	 * @return this instance
	 */
	public Channels withTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
		return this;
	}

	/**
	 * Get the per-channel HPNA performance monitoring results.
	 *
	 * @return the value
	 */
	public Collection<Channel> getChannels() {
		if (this.channels == null){ this.channels=new ArrayList<>();}
		return channels;
	}

	/**
	 * Set the per-channel HPNA performance monitoring results.
	 *
	 * @param channels the input value
	 */
	public void  setChannels(Collection<Channel> channels) {
		this.channels = channels;
	}

	/**
	 * Set the per-channel HPNA performance monitoring results.
	 *
	 * @param channel the input value
	 * @return this instance
	 */
	public Channels withChannel(Channel channel) {
		getChannels().add(channel);
		return this;
	}

	//</editor-fold>

}