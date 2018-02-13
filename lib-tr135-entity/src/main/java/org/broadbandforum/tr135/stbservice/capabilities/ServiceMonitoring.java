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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object describes the capabilities of the {{object|.ServiceMonitoring}} object.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.ServiceMonitoring.")
@XmlRootElement(name = "ServiceMonitoring")
@XmlType(name = "STBService.Capabilities.ServiceMonitoring")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceMonitoring {

	/**
	 * Supported service types, each of which relates to an AV stream source.  

Enumerated value must be one of [IPTV, VoD, IP, TEST, IP-All, CAB, DTT, SAT, PVR]

Note that none of the standard service types cover LAN-sourced IP streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ServiceTypes")
	@XmlList
	public Collection<String> serviceTypes;
	/**
	 * Maximum number of events of each applicable statistic that the STB is able to store for each sample interval.

A value of -1 indicates no specific maximum number of events.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxEventsPerSampleInterval")
	@Size(min = -1)
	public Integer maxEventsPerSampleInterval;
	/**
	 * Maximum number of AV Main streams for which the STB can simultaneously collect statistics.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxActiveMainStreams")
	@Size(min = -1)
	public Integer maxActiveMainStreams;
	/**
	 * Minimum sample interval in seconds that the STB MUST be able to support.

A value of -1 indicates no specific minimum sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinSampleInterval")
	@Size(min = -1)
	public Integer minSampleInterval;
	/**
	 * Maximum number of samples of each statistic that the STB is able to store and report.

A value of -1 indicates no specific maximum number of samples.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxReportSamples")
	@Size(min = -1)
	public Integer maxReportSamples;
	/**
	 * The names of the supported high-level metrics. If a metric produces several different scores (e.g. an audio, a video, and an audiovisual score), then they MUST be explicitly named.  Example (using "XYZ" as the name of the base metric):

"XYZAudio,XYZVideo,XYZAudiovisual".
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HighLevelMetricNames")
	@Size(max = 1024)
	@XmlList
	public Collection<String> highLevelMetricNames;
	/**
	 * Maximum number of event log entries that the STB is able to record for a MainStream object instance.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MaxMainStreamEventLogEntries")
	public Long maxMainStreamEventLogEntries;

	public ServiceMonitoring() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the supported service types, each of which relates to an AV stream source.  

Enumerated value must be one of [IPTV, VoD, IP, TEST, IP-All, CAB, DTT, SAT, PVR]

Note that none of the standard service types cover LAN-sourced IP streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getServiceTypes() {
		if (this.serviceTypes == null){ this.serviceTypes=new ArrayList<>();}
		return serviceTypes;
	}

	/**
	 * Set the supported service types, each of which relates to an AV stream source.  

Enumerated value must be one of [IPTV, VoD, IP, TEST, IP-All, CAB, DTT, SAT, PVR]

Note that none of the standard service types cover LAN-sourced IP streams.
	 *
	 * @since 1.0
	 * @param serviceTypes the input value
	 */
	public void  setServiceTypes(Collection<String> serviceTypes) {
		this.serviceTypes = serviceTypes;
	}

	/**
	 * Set the supported service types, each of which relates to an AV stream source.  

Enumerated value must be one of [IPTV, VoD, IP, TEST, IP-All, CAB, DTT, SAT, PVR]

Note that none of the standard service types cover LAN-sourced IP streams.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public ServiceMonitoring withServiceTypes(String string) {
		getServiceTypes().add(string);
		return this;
	}

	/**
	 * Get the maximum number of events of each applicable statistic that the STB is able to store for each sample interval.

A value of -1 indicates no specific maximum number of events.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getMaxEventsPerSampleInterval() {
		return maxEventsPerSampleInterval;
	}

	/**
	 * Set the maximum number of events of each applicable statistic that the STB is able to store for each sample interval.

A value of -1 indicates no specific maximum number of events.
	 *
	 * @since 1.1
	 * @param maxEventsPerSampleInterval the input value
	 */
	public void  setMaxEventsPerSampleInterval(Integer maxEventsPerSampleInterval) {
		this.maxEventsPerSampleInterval = maxEventsPerSampleInterval;
	}

	/**
	 * Set the maximum number of events of each applicable statistic that the STB is able to store for each sample interval.

A value of -1 indicates no specific maximum number of events.
	 *
	 * @since 1.1
	 * @param maxEventsPerSampleInterval the input value
	 * @return this instance
	 */
	public ServiceMonitoring withMaxEventsPerSampleInterval(Integer maxEventsPerSampleInterval) {
		this.maxEventsPerSampleInterval = maxEventsPerSampleInterval;
		return this;
	}

	/**
	 * Get the maximum number of AV Main streams for which the STB can simultaneously collect statistics.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxActiveMainStreams() {
		return maxActiveMainStreams;
	}

	/**
	 * Set the maximum number of AV Main streams for which the STB can simultaneously collect statistics.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveMainStreams the input value
	 */
	public void  setMaxActiveMainStreams(Integer maxActiveMainStreams) {
		this.maxActiveMainStreams = maxActiveMainStreams;
	}

	/**
	 * Set the maximum number of AV Main streams for which the STB can simultaneously collect statistics.

A value of -1 indicates no specific limit on the number of active streams.
	 *
	 * @since 1.0
	 * @param maxActiveMainStreams the input value
	 * @return this instance
	 */
	public ServiceMonitoring withMaxActiveMainStreams(Integer maxActiveMainStreams) {
		this.maxActiveMainStreams = maxActiveMainStreams;
		return this;
	}

	/**
	 * Get the minimum sample interval in seconds that the STB MUST be able to support.

A value of -1 indicates no specific minimum sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMinSampleInterval() {
		return minSampleInterval;
	}

	/**
	 * Set the minimum sample interval in seconds that the STB MUST be able to support.

A value of -1 indicates no specific minimum sample interval.
	 *
	 * @since 1.0
	 * @param minSampleInterval the input value
	 */
	public void  setMinSampleInterval(Integer minSampleInterval) {
		this.minSampleInterval = minSampleInterval;
	}

	/**
	 * Set the minimum sample interval in seconds that the STB MUST be able to support.

A value of -1 indicates no specific minimum sample interval.
	 *
	 * @since 1.0
	 * @param minSampleInterval the input value
	 * @return this instance
	 */
	public ServiceMonitoring withMinSampleInterval(Integer minSampleInterval) {
		this.minSampleInterval = minSampleInterval;
		return this;
	}

	/**
	 * Get the maximum number of samples of each statistic that the STB is able to store and report.

A value of -1 indicates no specific maximum number of samples.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxReportSamples() {
		return maxReportSamples;
	}

	/**
	 * Set the maximum number of samples of each statistic that the STB is able to store and report.

A value of -1 indicates no specific maximum number of samples.
	 *
	 * @since 1.0
	 * @param maxReportSamples the input value
	 */
	public void  setMaxReportSamples(Integer maxReportSamples) {
		this.maxReportSamples = maxReportSamples;
	}

	/**
	 * Set the maximum number of samples of each statistic that the STB is able to store and report.

A value of -1 indicates no specific maximum number of samples.
	 *
	 * @since 1.0
	 * @param maxReportSamples the input value
	 * @return this instance
	 */
	public ServiceMonitoring withMaxReportSamples(Integer maxReportSamples) {
		this.maxReportSamples = maxReportSamples;
		return this;
	}

	/**
	 * Get the names of the supported high-level metrics. If a metric produces several different scores (e.g. an audio, a video, and an audiovisual score), then they MUST be explicitly named.  Example (using "XYZ" as the name of the base metric):

"XYZAudio,XYZVideo,XYZAudiovisual".
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getHighLevelMetricNames() {
		if (this.highLevelMetricNames == null){ this.highLevelMetricNames=new ArrayList<>();}
		return highLevelMetricNames;
	}

	/**
	 * Set the names of the supported high-level metrics. If a metric produces several different scores (e.g. an audio, a video, and an audiovisual score), then they MUST be explicitly named.  Example (using "XYZ" as the name of the base metric):

"XYZAudio,XYZVideo,XYZAudiovisual".
	 *
	 * @since 1.0
	 * @param highLevelMetricNames the input value
	 */
	public void  setHighLevelMetricNames(Collection<String> highLevelMetricNames) {
		this.highLevelMetricNames = highLevelMetricNames;
	}

	/**
	 * Set the names of the supported high-level metrics. If a metric produces several different scores (e.g. an audio, a video, and an audiovisual score), then they MUST be explicitly named.  Example (using "XYZ" as the name of the base metric):

"XYZAudio,XYZVideo,XYZAudiovisual".
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public ServiceMonitoring withHighLevelMetricNames(String string) {
		getHighLevelMetricNames().add(string);
		return this;
	}

	/**
	 * Get the maximum number of event log entries that the STB is able to record for a MainStream object instance.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getMaxMainStreamEventLogEntries() {
		return maxMainStreamEventLogEntries;
	}

	/**
	 * Set the maximum number of event log entries that the STB is able to record for a MainStream object instance.
	 *
	 * @since 1.4
	 * @param maxMainStreamEventLogEntries the input value
	 */
	public void  setMaxMainStreamEventLogEntries(Long maxMainStreamEventLogEntries) {
		this.maxMainStreamEventLogEntries = maxMainStreamEventLogEntries;
	}

	/**
	 * Set the maximum number of event log entries that the STB is able to record for a MainStream object instance.
	 *
	 * @since 1.4
	 * @param maxMainStreamEventLogEntries the input value
	 * @return this instance
	 */
	public ServiceMonitoring withMaxMainStreamEventLogEntries(Long maxMainStreamEventLogEntries) {
		this.maxMainStreamEventLogEntries = maxMainStreamEventLogEntries;
		return this;
	}

	//</editor-fold>

}