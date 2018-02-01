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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.AudioDecoderStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.DejitteringStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.HighLevelMetricStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.MPEG2TSStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.RTPStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.TCPStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.VideoDecoderStats;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample.VideoResponseStats;

	/**
	 * Sample statistics collected since collection was last enabled or reset.

Most of the parameters in this object are comma-separated lists of individual statistics values, each of which corresponds to a sample interval.

The statistics values in these comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

Each comma-separated list can contain up to {{param|##.ReportSamples}} statistics values.  When the list is full, each new value causes the oldest one to be discarded.

Some comma-separated lists contain terms that are comma-separated lists themselves and are used to store measurements on an event basis. These sub-lists can contain up to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}} values.

If no data was collected for a statistic during a sample interval then the value for that sample interval MUST be zero unless otherwise specified in the description of the individual statistics parameter.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.")
public class Sample {

	/**
	 * Each entry is the number of seconds during which data was collected for this AV stream during the sample interval.  Each statistics category (Dejittering, RTP etc) has its own ''SampleSeconds'' parameter, which indicates the number of seconds during which data was collected for that statistics category during the sample interval.

Individual ''SampleSeconds'' values can be less than the ''SampleInterval'', for several reasons, including:

* The STB was not receiving any data for the corresponding ServiceType for all or part of the sample interval.

* ''TimeReference'' has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

* ''ForceSample'' has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the total number of times that a channel change (or other potentially disruptive event) occurred for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SignificantChanges")
	public Long significantChanges;
	/**
	 * Each entry is a Boolean that indicates whether the PVR, with a non-zero time-shift, was used at any time for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PVRTimeShift")
	public Boolean pvrTimeShift;
	/**
	 * De-jittering Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "DejitteringStats")
	public DejitteringStats dejitteringStats;
	/**
	 * TCP sample statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "TCPStats")
	public TCPStats tcpStats;
	/**
	 * RTP Sample statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 */
	@XmlElement(name = "RTPStats")
	public RTPStats rtpStats;
	/**
	 * MPEG2-TS Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "MPEG2TSStats")
	public MPEG2TSStats mpeG2TSStats;
	/**
	 * Video decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "VideoDecoderStats")
	public VideoDecoderStats videoDecoderStats;
	/**
	 * Audio decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "AudioDecoderStats")
	public AudioDecoderStats audioDecoderStats;
	/**
	 * Video response Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 */
	@XmlElement(name = "VideoResponseStats")
	public VideoResponseStats videoResponseStats;
	/**
	 * High-level metric Sample statistics for this ''ServiceMonitoring'' main stream instance.  One or more different high-level metrics can be supported; this is specified by  {{param|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStatsNumberOfEntries}}.
	 */
	@XmlElementWrapper(name = "highLevelMetricStatss")
	@XmlElement(name = "HighLevelMetricStats")
	public Collection<HighLevelMetricStats> highLevelMetricStatss;

	public Sample() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which data was collected for this AV stream during the sample interval.  Each statistics category (Dejittering, RTP etc) has its own ''SampleSeconds'' parameter, which indicates the number of seconds during which data was collected for that statistics category during the sample interval.

Individual ''SampleSeconds'' values can be less than the ''SampleInterval'', for several reasons, including:

* The STB was not receiving any data for the corresponding ServiceType for all or part of the sample interval.

* ''TimeReference'' has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

* ''ForceSample'' has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which data was collected for this AV stream during the sample interval.  Each statistics category (Dejittering, RTP etc) has its own ''SampleSeconds'' parameter, which indicates the number of seconds during which data was collected for that statistics category during the sample interval.

Individual ''SampleSeconds'' values can be less than the ''SampleInterval'', for several reasons, including:

* The STB was not receiving any data for the corresponding ServiceType for all or part of the sample interval.

* ''TimeReference'' has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

* ''ForceSample'' has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which data was collected for this AV stream during the sample interval.  Each statistics category (Dejittering, RTP etc) has its own ''SampleSeconds'' parameter, which indicates the number of seconds during which data was collected for that statistics category during the sample interval.

Individual ''SampleSeconds'' values can be less than the ''SampleInterval'', for several reasons, including:

* The STB was not receiving any data for the corresponding ServiceType for all or part of the sample interval.

* ''TimeReference'' has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

* ''ForceSample'' has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public Sample withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the total number of times that a channel change (or other potentially disruptive event) occurred for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSignificantChanges() {
		return significantChanges;
	}

	/**
	 * Set the each entry is the total number of times that a channel change (or other potentially disruptive event) occurred for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param significantChanges the input value
	 */
	public void  setSignificantChanges(Long significantChanges) {
		this.significantChanges = significantChanges;
	}

	/**
	 * Set the each entry is the total number of times that a channel change (or other potentially disruptive event) occurred for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param significantChanges the input value
	 * @return this instance
	 */
	public Sample withSignificantChanges(Long significantChanges) {
		this.significantChanges = significantChanges;
		return this;
	}

	/**
	 * Get the each entry is a Boolean that indicates whether the PVR, with a non-zero time-shift, was used at any time for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPvrTimeShift() {
		return pvrTimeShift;
	}

	/**
	 * Set the each entry is a Boolean that indicates whether the PVR, with a non-zero time-shift, was used at any time for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param pvrTimeShift the input value
	 */
	public void  setPvrTimeShift(Boolean pvrTimeShift) {
		this.pvrTimeShift = pvrTimeShift;
	}

	/**
	 * Set the each entry is a Boolean that indicates whether the PVR, with a non-zero time-shift, was used at any time for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param pvrTimeShift the input value
	 * @return this instance
	 */
	public Sample withPvrTimeShift(Boolean pvrTimeShift) {
		this.pvrTimeShift = pvrTimeShift;
		return this;
	}

	/**
	 * Get the de-jittering Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public DejitteringStats getDejitteringStats() {
		return dejitteringStats;
	}

	/**
	 * Set the de-jittering Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param dejitteringStats the input value
	 */
	public void  setDejitteringStats(DejitteringStats dejitteringStats) {
		this.dejitteringStats = dejitteringStats;
	}

	/**
	 * Set the de-jittering Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param dejitteringStats the input value
	 * @return this instance
	 */
	public Sample withDejitteringStats(DejitteringStats dejitteringStats) {
		this.dejitteringStats = dejitteringStats;
		return this;
	}

	/**
	 * Get the tcp sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public TCPStats getTcpStats() {
		return tcpStats;
	}

	/**
	 * Set the tcp sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param tcpStats the input value
	 */
	public void  setTcpStats(TCPStats tcpStats) {
		this.tcpStats = tcpStats;
	}

	/**
	 * Set the tcp sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param tcpStats the input value
	 * @return this instance
	 */
	public Sample withTcpStats(TCPStats tcpStats) {
		this.tcpStats = tcpStats;
		return this;
	}

	/**
	 * Get the rtp Sample statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @return the value
	 */
	public RTPStats getRtpStats() {
		return rtpStats;
	}

	/**
	 * Set the rtp Sample statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @param rtpStats the input value
	 */
	public void  setRtpStats(RTPStats rtpStats) {
		this.rtpStats = rtpStats;
	}

	/**
	 * Set the rtp Sample statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @param rtpStats the input value
	 * @return this instance
	 */
	public Sample withRtpStats(RTPStats rtpStats) {
		this.rtpStats = rtpStats;
		return this;
	}

	/**
	 * Get the mpeG2-TS Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public MPEG2TSStats getMpeG2TSStats() {
		return mpeG2TSStats;
	}

	/**
	 * Set the mpeG2-TS Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param mpeG2TSStats the input value
	 */
	public void  setMpeG2TSStats(MPEG2TSStats mpeG2TSStats) {
		this.mpeG2TSStats = mpeG2TSStats;
	}

	/**
	 * Set the mpeG2-TS Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param mpeG2TSStats the input value
	 * @return this instance
	 */
	public Sample withMpeG2TSStats(MPEG2TSStats mpeG2TSStats) {
		this.mpeG2TSStats = mpeG2TSStats;
		return this;
	}

	/**
	 * Get the video decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public VideoDecoderStats getVideoDecoderStats() {
		return videoDecoderStats;
	}

	/**
	 * Set the video decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoDecoderStats the input value
	 */
	public void  setVideoDecoderStats(VideoDecoderStats videoDecoderStats) {
		this.videoDecoderStats = videoDecoderStats;
	}

	/**
	 * Set the video decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoDecoderStats the input value
	 * @return this instance
	 */
	public Sample withVideoDecoderStats(VideoDecoderStats videoDecoderStats) {
		this.videoDecoderStats = videoDecoderStats;
		return this;
	}

	/**
	 * Get audio decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public AudioDecoderStats getAudioDecoderStats() {
		return audioDecoderStats;
	}

	/**
	 * Set audio decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param audioDecoderStats the input value
	 */
	public void  setAudioDecoderStats(AudioDecoderStats audioDecoderStats) {
		this.audioDecoderStats = audioDecoderStats;
	}

	/**
	 * Set audio decoder Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param audioDecoderStats the input value
	 * @return this instance
	 */
	public Sample withAudioDecoderStats(AudioDecoderStats audioDecoderStats) {
		this.audioDecoderStats = audioDecoderStats;
		return this;
	}

	/**
	 * Get the video response Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @return the value
	 */
	public VideoResponseStats getVideoResponseStats() {
		return videoResponseStats;
	}

	/**
	 * Set the video response Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoResponseStats the input value
	 */
	public void  setVideoResponseStats(VideoResponseStats videoResponseStats) {
		this.videoResponseStats = videoResponseStats;
	}

	/**
	 * Set the video response Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @param videoResponseStats the input value
	 * @return this instance
	 */
	public Sample withVideoResponseStats(VideoResponseStats videoResponseStats) {
		this.videoResponseStats = videoResponseStats;
		return this;
	}

	/**
	 * Get the high-level metric Sample statistics for this ''ServiceMonitoring'' main stream instance.  One or more different high-level metrics can be supported; this is specified by  {{param|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStatsNumberOfEntries}}.
	 *
	 * @return the value
	 */
	public Collection<HighLevelMetricStats> getHighLevelMetricStatss() {
		if (this.highLevelMetricStatss == null){ this.highLevelMetricStatss=new ArrayList<>();}
		return highLevelMetricStatss;
	}

	/**
	 * Set the high-level metric Sample statistics for this ''ServiceMonitoring'' main stream instance.  One or more different high-level metrics can be supported; this is specified by  {{param|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStatsNumberOfEntries}}.
	 *
	 * @param highLevelMetricStatss the input value
	 */
	public void  setHighLevelMetricStatss(Collection<HighLevelMetricStats> highLevelMetricStatss) {
		this.highLevelMetricStatss = highLevelMetricStatss;
	}

	/**
	 * Set the high-level metric Sample statistics for this ''ServiceMonitoring'' main stream instance.  One or more different high-level metrics can be supported; this is specified by  {{param|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStatsNumberOfEntries}}.
	 *
	 * @param highLevelMetricStats the input value
	 * @return this instance
	 */
	public Sample withHighLevelMetricStats(HighLevelMetricStats highLevelMetricStats) {
		getHighLevelMetricStatss().add(highLevelMetricStats);
		return this;
	}

	//</editor-fold>

}