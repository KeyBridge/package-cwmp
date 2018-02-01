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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.total;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Total video response statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Total.VideoResponseStats.")
public class VideoResponseStats {

	/**
	 * The number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Video response data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TotalSeconds")
	public Long totalSeconds;
	/**
	 * Number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ChannelChangeFailures")
	public Long channelChangeFailures;
	/**
	 * Each entry represents a channel for which a channel change failed. Channels MAY be described as IP address, URL or Service names as appropriate. Only last 10 failures are required to be reported.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ChannelFailures")
	@Size
	@XmlList
	public Collection<String> channelFailures;
	/**
	 * Minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MinimumVoDControlResponse")
	public Long minimumVoDControlResponse;
	/**
	 * Maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaximumVoDControlResponse")
	public Long maximumVoDControlResponse;
	/**
	 * Total number of RTSP protocol  requests to start a VoD program display.  

Only meaningful for VoD.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "RequestedTransactions")
	public Long requestedTransactions;
	/**
	 * Total number of successful VoD attempts.  An attempt is considered successful when the first I-frame is displayed by the client.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AccessSuccesses")
	public Long accessSuccesses;
	/**
	 * Total number of completed VoD requests.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CompletionCount")
	public Long completionCount;
	/**
	 * Minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumVideoSystemResponse")
	public Long minimumVideoSystemResponse;
	/**
	 * Maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumVideoSystemResponse")
	public Long maximumVideoSystemResponse;

	public VideoResponseStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Video response data collection is not appropriate or possible for this AV stream.
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

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Video response data collection is not appropriate or possible for this AV stream.
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

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* Video response data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 * @return this instance
	 */
	public VideoResponseStats withTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
		return this;
	}

	/**
	 * Get the number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getChannelChangeFailures() {
		return channelChangeFailures;
	}

	/**
	 * Set the number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 * @param channelChangeFailures the input value
	 */
	public void  setChannelChangeFailures(Long channelChangeFailures) {
		this.channelChangeFailures = channelChangeFailures;
	}

	/**
	 * Set the number of channel change failures. A channel change is considered as failed when the time period between a user channel change request and the display of the first I frame for this AVStream is above {{param|.ServiceMonitoring.MainStream.{i}.ChannelChangeFailureTimeout}}.
	 *
	 * @since 1.1
	 * @param channelChangeFailures the input value
	 * @return this instance
	 */
	public VideoResponseStats withChannelChangeFailures(Long channelChangeFailures) {
		this.channelChangeFailures = channelChangeFailures;
		return this;
	}

	/**
	 * Get the each entry represents a channel for which a channel change failed. Channels MAY be described as IP address, URL or Service names as appropriate. Only last 10 failures are required to be reported.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getChannelFailures() {
		if (this.channelFailures == null){ this.channelFailures=new ArrayList<>();}
		return channelFailures;
	}

	/**
	 * Set the each entry represents a channel for which a channel change failed. Channels MAY be described as IP address, URL or Service names as appropriate. Only last 10 failures are required to be reported.
	 *
	 * @since 1.1
	 * @param channelFailures the input value
	 */
	public void  setChannelFailures(Collection<String> channelFailures) {
		this.channelFailures = channelFailures;
	}

	/**
	 * Set the each entry represents a channel for which a channel change failed. Channels MAY be described as IP address, URL or Service names as appropriate. Only last 10 failures are required to be reported.
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public VideoResponseStats withChannelFailures(String string) {
		getChannelFailures().add(string);
		return this;
	}

	/**
	 * Get the minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMinimumVoDControlResponse() {
		return minimumVoDControlResponse;
	}

	/**
	 * Set the minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param minimumVoDControlResponse the input value
	 */
	public void  setMinimumVoDControlResponse(Long minimumVoDControlResponse) {
		this.minimumVoDControlResponse = minimumVoDControlResponse;
	}

	/**
	 * Set the minimum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
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
	 * Get the maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaximumVoDControlResponse() {
		return maximumVoDControlResponse;
	}

	/**
	 * Set the maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
	 *
	 * @since 1.1
	 * @param maximumVoDControlResponse the input value
	 */
	public void  setMaximumVoDControlResponse(Long maximumVoDControlResponse) {
		this.maximumVoDControlResponse = maximumVoDControlResponse;
	}

	/**
	 * Set the maximum time period, in milliseconds, between the instant of transmitting a RTSP PLAY command to start playing stream, and displaying the first I-frame of unicast stream.  Only measured when started from a non-play state, i.e. either idle or paused.
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
	 * Get the total number of RTSP protocol  requests to start a VoD program display.  

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getRequestedTransactions() {
		return requestedTransactions;
	}

	/**
	 * Set the total number of RTSP protocol  requests to start a VoD program display.  

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param requestedTransactions the input value
	 */
	public void  setRequestedTransactions(Long requestedTransactions) {
		this.requestedTransactions = requestedTransactions;
	}

	/**
	 * Set the total number of RTSP protocol  requests to start a VoD program display.  

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
	 * Get the total number of successful VoD attempts.  An attempt is considered successful when the first I-frame is displayed by the client.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getAccessSuccesses() {
		return accessSuccesses;
	}

	/**
	 * Set the total number of successful VoD attempts.  An attempt is considered successful when the first I-frame is displayed by the client.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param accessSuccesses the input value
	 */
	public void  setAccessSuccesses(Long accessSuccesses) {
		this.accessSuccesses = accessSuccesses;
	}

	/**
	 * Set the total number of successful VoD attempts.  An attempt is considered successful when the first I-frame is displayed by the client.

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
	 * Get the total number of completed VoD requests.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getCompletionCount() {
		return completionCount;
	}

	/**
	 * Set the total number of completed VoD requests.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

Only meaningful for VoD.
	 *
	 * @since 1.1
	 * @param completionCount the input value
	 */
	public void  setCompletionCount(Long completionCount) {
		this.completionCount = completionCount;
	}

	/**
	 * Set the total number of completed VoD requests.  An attempt is defined successful if it continues until a RTSP protocol request to end the session is sent by the STB.

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
	 * Get the minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumVideoSystemResponse() {
		return minimumVideoSystemResponse;
	}

	/**
	 * Set the minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
	 *
	 * @since 1.0
	 * @param minimumVideoSystemResponse the input value
	 */
	public void  setMinimumVideoSystemResponse(Long minimumVideoSystemResponse) {
		this.minimumVideoSystemResponse = minimumVideoSystemResponse;
	}

	/**
	 * Set the minimum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
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
	 * Get the maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumVideoSystemResponse() {
		return maximumVideoSystemResponse;
	}

	/**
	 * Set the maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
	 *
	 * @since 1.0
	 * @param maximumVideoSystemResponse the input value
	 */
	public void  setMaximumVideoSystemResponse(Long maximumVideoSystemResponse) {
		this.maximumVideoSystemResponse = maximumVideoSystemResponse;
	}

	/**
	 * Set the maximum time period (in milliseconds) between the instant of transmitting an IGMP JOIN command or an RTSP SETUP command, and the display of the first I frame for this AV stream.
	 *
	 * @since 1.0
	 * @param maximumVideoSystemResponse the input value
	 * @return this instance
	 */
	public VideoResponseStats withMaximumVideoSystemResponse(Long maximumVideoSystemResponse) {
		this.maximumVideoSystemResponse = maximumVideoSystemResponse;
		return this;
	}

	//</editor-fold>

}