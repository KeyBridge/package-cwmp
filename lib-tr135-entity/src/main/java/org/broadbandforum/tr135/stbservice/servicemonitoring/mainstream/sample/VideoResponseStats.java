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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Video response Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.VideoResponseStats.")
public class VideoResponseStats {

	/**
	 * Each entry is the number of seconds during which video response data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video response data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame, computed as the average of the VideoSystemResponse events that occured for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageVideoSystemResponse")
	public Long averageVideoSystemResponse;
	/**
	 * Each entry is the minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumVideoSystemResponse")
	public Long minimumVideoSystemResponse;
	/**
	 * Each entry is the maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumVideoSystemResponse")
	public Long maximumVideoSystemResponse;
	/**
	 * Each entry is the time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream, computed as the average of the VoDControlResponse events that occured for this AV stream during the sample interval. Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AverageVoDControlResponse")
	public Long averageVoDControlResponse;
	/**
	 * Each entry is the minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MinimumVoDControlResponse")
	public Long minimumVoDControlResponse;
	/**
	 * Each entry is the maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaximumVoDControlResponse")
	public Long maximumVoDControlResponse;
	/**
	 * Each entry is a colon separated list of time periods in milliseconds between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VoDControlResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VoDControlResponse")
	@XmlList
	public Collection<String> vodControlResponse;
	/**
	 * Each entry is a colon separated list of time periods in milliseconds between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame that occurred for this AV stream during the sample interval.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VideoSystemResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VideoSystemResponse")
	@XmlList
	public Collection<String> videoSystemResponse;
	/**
	 * Each entry is the number of RTSP protocol requests to start a VoD program display during the sample interval.  

Only meaningful for VoD.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "RequestedTransactions")
	public Long requestedTransactions;
	/**
	 * Each entry is the number of successful VoD attempts during the sample interval.  An attempt is considered successful when the first I-frame is displayed by the client.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AccessSuccesses")
	public Long accessSuccesses;
	/**
	 * Each entry is the number of completed VoD requests during the sample interval.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CompletionCount")
	public Long completionCount;
	/**
	 * Each entry is the number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ChannelChangeFailures")
	public Long channelChangeFailures;

	public VideoResponseStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which video response data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video response data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which video response data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video response data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which video response data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* Video response data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public VideoResponseStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame, computed as the average of the VideoSystemResponse events that occured for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAverageVideoSystemResponse() {
		return averageVideoSystemResponse;
	}

	/**
	 * Set the each entry is the time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame, computed as the average of the VideoSystemResponse events that occured for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param averageVideoSystemResponse the input value
	 */
	public void  setAverageVideoSystemResponse(Long averageVideoSystemResponse) {
		this.averageVideoSystemResponse = averageVideoSystemResponse;
	}

	/**
	 * Set the each entry is the time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame, computed as the average of the VideoSystemResponse events that occured for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param averageVideoSystemResponse the input value
	 * @return this instance
	 */
	public VideoResponseStats withAverageVideoSystemResponse(Long averageVideoSystemResponse) {
		this.averageVideoSystemResponse = averageVideoSystemResponse;
		return this;
	}

	/**
	 * Get the each entry is the minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumVideoSystemResponse() {
		return minimumVideoSystemResponse;
	}

	/**
	 * Set the each entry is the minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param minimumVideoSystemResponse the input value
	 */
	public void  setMinimumVideoSystemResponse(Long minimumVideoSystemResponse) {
		this.minimumVideoSystemResponse = minimumVideoSystemResponse;
	}

	/**
	 * Set the each entry is the minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param minimumVideoSystemResponse the input value
	 * @return this instance
	 */
	public VideoResponseStats withMinimumVideoSystemResponse(Long minimumVideoSystemResponse) {
		this.minimumVideoSystemResponse = minimumVideoSystemResponse;
		return this;
	}

	/**
	 * Get the each entry is the maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumVideoSystemResponse() {
		return maximumVideoSystemResponse;
	}

	/**
	 * Set the each entry is the maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param maximumVideoSystemResponse the input value
	 */
	public void  setMaximumVideoSystemResponse(Long maximumVideoSystemResponse) {
		this.maximumVideoSystemResponse = maximumVideoSystemResponse;
	}

	/**
	 * Set the each entry is the maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param maximumVideoSystemResponse the input value
	 * @return this instance
	 */
	public VideoResponseStats withMaximumVideoSystemResponse(Long maximumVideoSystemResponse) {
		this.maximumVideoSystemResponse = maximumVideoSystemResponse;
		return this;
	}

	/**
	 * Get the each entry is the time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream, computed as the average of the VoDControlResponse events that occured for this AV stream during the sample interval. Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getAverageVoDControlResponse() {
		return averageVoDControlResponse;
	}

	/**
	 * Set the each entry is the time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream, computed as the average of the VoDControlResponse events that occured for this AV stream during the sample interval. Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param averageVoDControlResponse the input value
	 */
	public void  setAverageVoDControlResponse(Long averageVoDControlResponse) {
		this.averageVoDControlResponse = averageVoDControlResponse;
	}

	/**
	 * Set the each entry is the time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream, computed as the average of the VoDControlResponse events that occured for this AV stream during the sample interval. Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param averageVoDControlResponse the input value
	 * @return this instance
	 */
	public VideoResponseStats withAverageVoDControlResponse(Long averageVoDControlResponse) {
		this.averageVoDControlResponse = averageVoDControlResponse;
		return this;
	}

	/**
	 * Get the each entry is the minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMinimumVoDControlResponse() {
		return minimumVoDControlResponse;
	}

	/**
	 * Set the each entry is the minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param minimumVoDControlResponse the input value
	 */
	public void  setMinimumVoDControlResponse(Long minimumVoDControlResponse) {
		this.minimumVoDControlResponse = minimumVoDControlResponse;
	}

	/**
	 * Set the each entry is the minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param minimumVoDControlResponse the input value
	 * @return this instance
	 */
	public VideoResponseStats withMinimumVoDControlResponse(Long minimumVoDControlResponse) {
		this.minimumVoDControlResponse = minimumVoDControlResponse;
		return this;
	}

	/**
	 * Get the each entry is the maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaximumVoDControlResponse() {
		return maximumVoDControlResponse;
	}

	/**
	 * Set the each entry is the maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param maximumVoDControlResponse the input value
	 */
	public void  setMaximumVoDControlResponse(Long maximumVoDControlResponse) {
		this.maximumVoDControlResponse = maximumVoDControlResponse;
	}

	/**
	 * Set the each entry is the maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param maximumVoDControlResponse the input value
	 * @return this instance
	 */
	public VideoResponseStats withMaximumVoDControlResponse(Long maximumVoDControlResponse) {
		this.maximumVoDControlResponse = maximumVoDControlResponse;
		return this;
	}

	/**
	 * Get the each entry is a colon separated list of time periods in milliseconds between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VoDControlResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getVodControlResponse() {
		if (this.vodControlResponse == null){ this.vodControlResponse=new ArrayList<>();}
		return vodControlResponse;
	}

	/**
	 * Set the each entry is a colon separated list of time periods in milliseconds between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VoDControlResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @param vodControlResponse the input value
	 */
	public void  setVodControlResponse(Collection<String> vodControlResponse) {
		this.vodControlResponse = vodControlResponse;
	}

	/**
	 * Set the each entry is a colon separated list of time periods in milliseconds between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VoDControlResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public VideoResponseStats withVodControlResponse(String string) {
		getVodControlResponse().add(string);
		return this;
	}

	/**
	 * Get the each entry is a colon separated list of time periods in milliseconds between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame that occurred for this AV stream during the sample interval.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VideoSystemResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getVideoSystemResponse() {
		if (this.videoSystemResponse == null){ this.videoSystemResponse=new ArrayList<>();}
		return videoSystemResponse;
	}

	/**
	 * Set the each entry is a colon separated list of time periods in milliseconds between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame that occurred for this AV stream during the sample interval.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VideoSystemResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @param videoSystemResponse the input value
	 */
	public void  setVideoSystemResponse(Collection<String> videoSystemResponse) {
		this.videoSystemResponse = videoSystemResponse;
	}

	/**
	 * Set the each entry is a colon separated list of time periods in milliseconds between the instant of transmitting an IGMP JOIN or an RTSP SETUP command and the display of the first I frame that occurred for this AV stream during the sample interval.

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no VideoSystemResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public VideoResponseStats withVideoSystemResponse(String string) {
		getVideoSystemResponse().add(string);
		return this;
	}

	/**
	 * Get the each entry is the number of RTSP protocol requests to start a VoD program display during the sample interval.  

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getRequestedTransactions() {
		return requestedTransactions;
	}

	/**
	 * Set the each entry is the number of RTSP protocol requests to start a VoD program display during the sample interval.  

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param requestedTransactions the input value
	 */
	public void  setRequestedTransactions(Long requestedTransactions) {
		this.requestedTransactions = requestedTransactions;
	}

	/**
	 * Set the each entry is the number of RTSP protocol requests to start a VoD program display during the sample interval.  

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param requestedTransactions the input value
	 * @return this instance
	 */
	public VideoResponseStats withRequestedTransactions(Long requestedTransactions) {
		this.requestedTransactions = requestedTransactions;
		return this;
	}

	/**
	 * Get the each entry is the number of successful VoD attempts during the sample interval.  An attempt is considered successful when the first I-frame is displayed by the client.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getAccessSuccesses() {
		return accessSuccesses;
	}

	/**
	 * Set the each entry is the number of successful VoD attempts during the sample interval.  An attempt is considered successful when the first I-frame is displayed by the client.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param accessSuccesses the input value
	 */
	public void  setAccessSuccesses(Long accessSuccesses) {
		this.accessSuccesses = accessSuccesses;
	}

	/**
	 * Set the each entry is the number of successful VoD attempts during the sample interval.  An attempt is considered successful when the first I-frame is displayed by the client.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param accessSuccesses the input value
	 * @return this instance
	 */
	public VideoResponseStats withAccessSuccesses(Long accessSuccesses) {
		this.accessSuccesses = accessSuccesses;
		return this;
	}

	/**
	 * Get the each entry is the number of completed VoD requests during the sample interval.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getCompletionCount() {
		return completionCount;
	}

	/**
	 * Set the each entry is the number of completed VoD requests during the sample interval.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param completionCount the input value
	 */
	public void  setCompletionCount(Long completionCount) {
		this.completionCount = completionCount;
	}

	/**
	 * Set the each entry is the number of completed VoD requests during the sample interval.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param completionCount the input value
	 * @return this instance
	 */
	public VideoResponseStats withCompletionCount(Long completionCount) {
		this.completionCount = completionCount;
		return this;
	}

	/**
	 * Get the each entry is the number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getChannelChangeFailures() {
		return channelChangeFailures;
	}

	/**
	 * Set the each entry is the number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 * @param channelChangeFailures the input value
	 */
	public void  setChannelChangeFailures(Long channelChangeFailures) {
		this.channelChangeFailures = channelChangeFailures;
	}

	/**
	 * Set the each entry is the number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 * @param channelChangeFailures the input value
	 * @return this instance
	 */
	public VideoResponseStats withChannelChangeFailures(Long channelChangeFailures) {
		this.channelChangeFailures = channelChangeFailures;
		return this;
	}

	//</editor-fold>

}