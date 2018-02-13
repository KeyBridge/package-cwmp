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
package org.broadbandforum.tr135.stbservice.capabilities;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * PVR capabilities.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.PVR.")
@XmlRootElement(name = "PVR")
@XmlType(name = "STBService.Capabilities.PVR")
@XmlAccessorType(XmlAccessType.FIELD)
public class PVR {

	/**
	 * Maximum number of AV streams that the PVR can simultaneously record and playback. For example a time shift, consisting of a record and a play back is considered as 2 streams.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxIOStreams")
	@Size(min = -1)
	public Integer maxIOStreams;
	/**
	 * Maximum number of AV streams that the PVR can simultaneously record.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxRecordingStreams")
	@Size(min = -1)
	public Integer maxRecordingStreams;
	/**
	 * Maximum number of AV streams that the PVR can simultaneously play back.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxPlaybackStreams")
	@Size(min = -1)
	public Integer maxPlaybackStreams;
	/**
	 * Maximum time delay, in seconds, that the PVR time-shift mode can support.

A value of -1 indicates no specific limit on the time delay.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxTimeDelay")
	@Size(min = -1)
	public Integer maxTimeDelay;

	public PVR() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of AV streams that the PVR can simultaneously record and playback. For example a time shift, consisting of a record and a play back is considered as 2 streams.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxIOStreams() {
		return maxIOStreams;
	}

	/**
	 * Set the maximum number of AV streams that the PVR can simultaneously record and playback. For example a time shift, consisting of a record and a play back is considered as 2 streams.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @param maxIOStreams the input value
	 */
	public void  setMaxIOStreams(Integer maxIOStreams) {
		this.maxIOStreams = maxIOStreams;
	}

	/**
	 * Set the maximum number of AV streams that the PVR can simultaneously record and playback. For example a time shift, consisting of a record and a play back is considered as 2 streams.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @param maxIOStreams the input value
	 * @return this instance
	 */
	public PVR withMaxIOStreams(Integer maxIOStreams) {
		this.maxIOStreams = maxIOStreams;
		return this;
	}

	/**
	 * Get the maximum number of AV streams that the PVR can simultaneously record.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxRecordingStreams() {
		return maxRecordingStreams;
	}

	/**
	 * Set the maximum number of AV streams that the PVR can simultaneously record.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @param maxRecordingStreams the input value
	 */
	public void  setMaxRecordingStreams(Integer maxRecordingStreams) {
		this.maxRecordingStreams = maxRecordingStreams;
	}

	/**
	 * Set the maximum number of AV streams that the PVR can simultaneously record.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @param maxRecordingStreams the input value
	 * @return this instance
	 */
	public PVR withMaxRecordingStreams(Integer maxRecordingStreams) {
		this.maxRecordingStreams = maxRecordingStreams;
		return this;
	}

	/**
	 * Get the maximum number of AV streams that the PVR can simultaneously play back.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxPlaybackStreams() {
		return maxPlaybackStreams;
	}

	/**
	 * Set the maximum number of AV streams that the PVR can simultaneously play back.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @param maxPlaybackStreams the input value
	 */
	public void  setMaxPlaybackStreams(Integer maxPlaybackStreams) {
		this.maxPlaybackStreams = maxPlaybackStreams;
	}

	/**
	 * Set the maximum number of AV streams that the PVR can simultaneously play back.

A value of -1 indicates no specific limit on the number of streams.
	 *
	 * @since 1.0
	 * @param maxPlaybackStreams the input value
	 * @return this instance
	 */
	public PVR withMaxPlaybackStreams(Integer maxPlaybackStreams) {
		this.maxPlaybackStreams = maxPlaybackStreams;
		return this;
	}

	/**
	 * Get the maximum time delay, in seconds, that the PVR time-shift mode can support.

A value of -1 indicates no specific limit on the time delay.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxTimeDelay() {
		return maxTimeDelay;
	}

	/**
	 * Set the maximum time delay, in seconds, that the PVR time-shift mode can support.

A value of -1 indicates no specific limit on the time delay.
	 *
	 * @since 1.0
	 * @param maxTimeDelay the input value
	 */
	public void  setMaxTimeDelay(Integer maxTimeDelay) {
		this.maxTimeDelay = maxTimeDelay;
	}

	/**
	 * Set the maximum time delay, in seconds, that the PVR time-shift mode can support.

A value of -1 indicates no specific limit on the time delay.
	 *
	 * @since 1.0
	 * @param maxTimeDelay the input value
	 * @return this instance
	 */
	public PVR withMaxTimeDelay(Integer maxTimeDelay) {
		this.maxTimeDelay = maxTimeDelay;
		return this;
	}

	//</editor-fold>

}