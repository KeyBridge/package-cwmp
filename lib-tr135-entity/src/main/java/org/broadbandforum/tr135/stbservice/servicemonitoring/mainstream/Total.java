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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total.AudioDecoderStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total.DejitteringStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total.MPEG2TSStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total.RTPStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total.TCPStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total.VideoDecoderStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total.VideoResponseStats;

	/**
	 * Total statistics since this ''ServiceMonitoring'' main stream instance was last enabled or Total statistics were last reset.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Total.")
@XmlRootElement(name = "Total")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Total")
@XmlAccessorType(XmlAccessType.FIELD)
public class Total {

	/**
	 * The number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than the {{param|ResetTime}}, for several reasons, including the STB was not receiving any data (Standby mode without force monitoring).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TotalSeconds")
	public Long totalSeconds;
	/**
	 * When set to {{true}}, resets Total statistics for this ''ServiceMonitoring'' main stream instance.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * Number of seconds since the Total statistics were last enabled or reset for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ResetTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long resetTime;
	/**
	 * Total de-jittering statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "DejitteringStats")
	public DejitteringStats dejitteringStats;
	/**
	 * Total TCP statistics for this ServiceMonitoring main stream instance.
	 */
	@XmlElement(name = "TCPStats")
	public TCPStats tcpStats;
	/**
	 * Total RTP statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 */
	@XmlElement(name = "RTPStats")
	public RTPStats rtpStats;
	/**
	 * Total MPEG2-TS statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "MPEG2TSStats")
	public MPEG2TSStats mpeG2TSStats;
	/**
	 * Total video decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "VideoDecoderStats")
	public VideoDecoderStats videoDecoderStats;
	/**
	 * Total audio decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "AudioDecoderStats")
	public AudioDecoderStats audioDecoderStats;
	/**
	 * Total video response statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "VideoResponseStats")
	public VideoResponseStats videoResponseStats;

	public Total() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than the {{param|ResetTime}}, for several reasons, including the STB was not receiving any data (Standby mode without force monitoring).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getTotalSeconds() {
		return totalSeconds;
	}

	/**
	 * Set the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than the {{param|ResetTime}}, for several reasons, including the STB was not receiving any data (Standby mode without force monitoring).
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 */
	public void  setTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
	}

	/**
	 * Set the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than the {{param|ResetTime}}, for several reasons, including the STB was not receiving any data (Standby mode without force monitoring).
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 * @return this instance
	 */
	public Total withTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
		return this;
	}

	/**
	 * Get the when set to {{true}}, resets Total statistics for this ''ServiceMonitoring'' main stream instance.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, resets Total statistics for this ''ServiceMonitoring'' main stream instance.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, resets Total statistics for this ''ServiceMonitoring'' main stream instance.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @param reset the input value
	 * @return this instance
	 */
	public Total withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the number of seconds since the Total statistics were last enabled or reset for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getResetTime() {
		return resetTime;
	}

	/**
	 * Set the number of seconds since the Total statistics were last enabled or reset for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 * @param resetTime the input value
	 */
	public void  setResetTime(Long resetTime) {
		this.resetTime = resetTime;
	}

	/**
	 * Set the number of seconds since the Total statistics were last enabled or reset for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 * @param resetTime the input value
	 * @return this instance
	 */
	public Total withResetTime(Long resetTime) {
		this.resetTime = resetTime;
		return this;
	}

	/**
	 * Get the total de-jittering statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public DejitteringStats getDejitteringStats() {
		return dejitteringStats;
	}

	/**
	 * Set the total de-jittering statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param dejitteringStats the input value
	 */
	public void  setDejitteringStats(DejitteringStats dejitteringStats) {
		this.dejitteringStats = dejitteringStats;
	}

	/**
	 * Set the total de-jittering statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param dejitteringStats the input value
	 * @return this instance
	 */
	public Total withDejitteringStats(DejitteringStats dejitteringStats) {
		this.dejitteringStats = dejitteringStats;
		return this;
	}

	/**
	 * Get the total TCP statistics for this ServiceMonitoring main stream instance.
	 *
	 * @return the value
	 */
	public TCPStats getTcpStats() {
		return tcpStats;
	}

	/**
	 * Set the total TCP statistics for this ServiceMonitoring main stream instance.
	 *
	 * @param tcpStats the input value
	 */
	public void  setTcpStats(TCPStats tcpStats) {
		this.tcpStats = tcpStats;
	}

	/**
	 * Set the total TCP statistics for this ServiceMonitoring main stream instance.
	 *
	 * @param tcpStats the input value
	 * @return this instance
	 */
	public Total withTcpStats(TCPStats tcpStats) {
		this.tcpStats = tcpStats;
		return this;
	}

	/**
	 * Get the total RTP statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @return the value
	 */
	public RTPStats getRtpStats() {
		return rtpStats;
	}

	/**
	 * Set the total RTP statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @param rtpStats the input value
	 */
	public void  setRtpStats(RTPStats rtpStats) {
		this.rtpStats = rtpStats;
	}

	/**
	 * Set the total RTP statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @param rtpStats the input value
	 * @return this instance
	 */
	public Total withRtpStats(RTPStats rtpStats) {
		this.rtpStats = rtpStats;
		return this;
	}

	/**
	 * Get the total MPEG2-TS statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public MPEG2TSStats getMpeG2TSStats() {
		return mpeG2TSStats;
	}

	/**
	 * Set the total MPEG2-TS statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param mpeG2TSStats the input value
	 */
	public void  setMpeG2TSStats(MPEG2TSStats mpeG2TSStats) {
		this.mpeG2TSStats = mpeG2TSStats;
	}

	/**
	 * Set the total MPEG2-TS statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param mpeG2TSStats the input value
	 * @return this instance
	 */
	public Total withMpeG2TSStats(MPEG2TSStats mpeG2TSStats) {
		this.mpeG2TSStats = mpeG2TSStats;
		return this;
	}

	/**
	 * Get the total video decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public VideoDecoderStats getVideoDecoderStats() {
		return videoDecoderStats;
	}

	/**
	 * Set the total video decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoDecoderStats the input value
	 */
	public void  setVideoDecoderStats(VideoDecoderStats videoDecoderStats) {
		this.videoDecoderStats = videoDecoderStats;
	}

	/**
	 * Set the total video decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoDecoderStats the input value
	 * @return this instance
	 */
	public Total withVideoDecoderStats(VideoDecoderStats videoDecoderStats) {
		this.videoDecoderStats = videoDecoderStats;
		return this;
	}

	/**
	 * Get the total audio decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public AudioDecoderStats getAudioDecoderStats() {
		return audioDecoderStats;
	}

	/**
	 * Set the total audio decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param audioDecoderStats the input value
	 */
	public void  setAudioDecoderStats(AudioDecoderStats audioDecoderStats) {
		this.audioDecoderStats = audioDecoderStats;
	}

	/**
	 * Set the total audio decoder application layer statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param audioDecoderStats the input value
	 * @return this instance
	 */
	public Total withAudioDecoderStats(AudioDecoderStats audioDecoderStats) {
		this.audioDecoderStats = audioDecoderStats;
		return this;
	}

	/**
	 * Get the total video response statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public VideoResponseStats getVideoResponseStats() {
		return videoResponseStats;
	}

	/**
	 * Set the total video response statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoResponseStats the input value
	 */
	public void  setVideoResponseStats(VideoResponseStats videoResponseStats) {
		this.videoResponseStats = videoResponseStats;
	}

	/**
	 * Set the total video response statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoResponseStats the input value
	 * @return this instance
	 */
	public Total withVideoResponseStats(VideoResponseStats videoResponseStats) {
		this.videoResponseStats = videoResponseStats;
		return this;
	}

	//</editor-fold>

}