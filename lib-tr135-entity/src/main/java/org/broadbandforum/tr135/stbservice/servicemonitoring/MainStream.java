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
package org.broadbandforum.tr135.stbservice.servicemonitoring;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.UUID;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.EventLog;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.Sample;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.Total;

	/**
	 * List of Main AV stream objects. Each instance is associated with a specified service type and will collect statistics only for the main stream that matches that service type.

Note that this means that streams that do not match an instance's service type MUST NOT contribute to the instance's Total and Sample statistics.

It is up to the STB to determine which AV stream should be regarded as the Main AV stream for a given service type at any given time.  For example, if two active streams are associated with the same service type, the STB might prefer streams that are associated with an AV player, or if more than one stream is associated with an AV player, the STB might prefer a player that is outputting a DVI stream to a player that is outputting an RF stream.

Note that some parameters, e.g. {{param|.Components.FrontEnd.{i}.IP.ServiceConnect.URI}}, include requirements that restrict the STB's freedom to determine which AV stream should be regarded as the Main AV stream for a given service.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.", uniqueConstraints = {@CWMPUnique(names = {"ServiceType"}, functional = false),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "STBService.ServiceMonitoring.MainStream")
@XmlType(name = "STBService.ServiceMonitoring.MainStream")
@XmlAccessorType(XmlAccessType.FIELD)
public class MainStream {

	/**
	 * {{marktemplate|diffs-1&2}}---Enables or disables collection of Total and Sample statistics for this object instance.---

+++Enables or disables collection of Total and Sample statistics and events for this object instance.+++

+++The collection of events requires the value of this parameter to be {{true}} and the value of the {{param|##.ServiceMonitoring.EventCollectionEnable}} to be {{true}}.+++
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{marktemplate|diffs-0:1}}Total and Sample statistics +++and event +++collection status for this object instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Time based UUID {{bibref|RFC4122|Section 4.2}} that is the identifier for the associated {{param|AVStream}} parameter when available to the device.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SessionId")
	public UUID sessionId;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Service type associated with this main stream instance, or {{empty}} if this instance is disabled.

The STB MUST reject a request that would result in a given AV stream contributing to more than one {{object|.ServiceMonitoring.MainStream}} instance, e.g. it would reject a request to enable simultaneous collection of both IPTV and IP statistics, or to collect IPTV statistics on more than one instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ServiceType")
	@CWMPParameter(access = "readWrite")
	public String serviceType;
	/**
	 * Main AV stream object instance currently associated with this ''ServiceMonitoring'' main stream instance.  For example:

''.AVStreams.AVStream.2''

Note that, during the period of time over which Sample statistics are stored, this ''ServiceMonitoring'' main stream instance might be associated with many different ''AVStream'' instances.  This parameter just provides information about which ''AVStream'' is currently being monitored.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AVStream")
	@Size(max = 256)
	public String avstream;
	/**
	 * Minimum number of consecutive received packets after the end of an RTP Loss Event.  A Loss Event is defined as as a sequence of lost packets, possibly including islands of received packets.  Each island consists of up to

({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Gmin")
	@CWMPParameter(access = "readWrite")
	public Long gmin;
	/**
	 * The minimum distance required between error events before an RTP Loss Event is considered severe. Used in the calculation of ''SevereLossIndexCount'' and ''SevereLossIndexCountBeforeEC''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossMinDistance")
	@CWMPParameter(access = "readWrite")
	public Long severeLossMinDistance;
	/**
	 * The minimum value for the count of lost packets per RTP Loss Event before the count of lost packets is considered severe. Used in the calculation of ''SevereLossLengthCount'' and ''SevereLossLengthCountBeforeEC''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossMinLength")
	@CWMPParameter(access = "readWrite")
	public Long severeLossMinLength;
	/**
	 * Time period, in seconds, between a user channel change request (defined as the instant of transmission of the relevant control protocol message (IGMP JOIN or RTSP SETUP) or a tuner command in case of DTT), and the display of the first I frame for the current AVStream, above which a channel change is considered as failed.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ChannelChangeFailureTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long channelChangeFailureTimeout;
	/**
	 * {{list}} Definition of the histogram intervals for counting loss events according to their size (in packets). Each value indicates the maximum value of the interval. For example, "1,2,4,8," defines the five intervals: 1 packet lost, 2 packets, 3 or 4 packets, 5 to 8 packets and 9 or more packets. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no PacketsLostByEvent stats will be collected.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "PacketsLostByEventHistogramIntervals")
	@CWMPParameter(access = "readWrite", units = "packets")
	@Size(min = 1)
	public Long packetsLostByEventHistogramIntervals;
	/**
	 * {{list}} Definition of the histogram intervals for counting loss events according to their delay (in milliseconds) after the preceding loss event. Each value indicates the maximum value of the interval. For example, "10,20,50,100,1000,60000,3600000," defines the intervals up to 10 ms, to 20 ms, to 50 ms, to 100 ms, to 1 s, to 1 mn, to 1 h and more than 1 h. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DelayBetweenLossEvents stats will be collected.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DelayBetweenLossEventsHistogramIntervals")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long delayBetweenLossEventsHistogramIntervals;
	/**
	 * {{list}} Definition of the histogram intervals for counting severe loss events according to their duration (in milliseconds). Each value indicates the maximum value of the interval. For example, "50,100,500,1000,2000,5000,10000,120000," defines the intervals up to 50 ms, to 100 ms, to 500 ms, to 1 s, to 2 s etc. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DurationSevereLossEvents stats will be collected.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DurationSevereLossEventsHistogramIntervals")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long durationSevereLossEventsHistogramIntervals;
	/**
	 * This object represents the log entries of events recorded by the MainStream object instance.

When the number of log entries in the EventLog exceeds the value of the {{param|###.Capabilities.ServiceMonitoring.MaxMainStreamEventLogEntries}} parameter, the Entry object with the lowest SequenceNumber value is replaced by the new EventLog Entry object.

Log entries are persisted across reboots of the CPE.
	 */
	@XmlElement(name = "EventLog")
	public EventLog eventLog;
	/**
	 * Total statistics since this ''ServiceMonitoring'' main stream instance was last enabled or Total statistics were last reset.
	 */
	@XmlElement(name = "Total")
	public Total total;
	/**
	 * Sample statistics collected since collection was last enabled or reset.

Most of the parameters in this object are comma-separated lists of individual statistics values, each of which corresponds to a sample interval.

The statistics values in these comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

Each comma-separated list can contain up to {{param|##.ReportSamples}} statistics values.  When the list is full, each new value causes the oldest one to be discarded.

Some comma-separated lists contain terms that are comma-separated lists themselves and are used to store measurements on an event basis. These sub-lists can contain up to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}} values.

If no data was collected for a statistic during a sample interval then the value for that sample interval MUST be zero unless otherwise specified in the description of the individual statistics parameter.
	 */
	@XmlElement(name = "Sample")
	public Sample sample;

	public MainStream() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{marktemplate|diffs-1&2}}---Enables or disables collection of Total and Sample statistics for this object instance.---

+++Enables or disables collection of Total and Sample statistics and events for this object instance.+++

+++The collection of events requires the value of this parameter to be {{true}} and the value of the {{param|##.ServiceMonitoring.EventCollectionEnable}} to be {{true}}.+++
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the {{marktemplate|diffs-1&2}}---Enables or disables collection of Total and Sample statistics for this object instance.---

+++Enables or disables collection of Total and Sample statistics and events for this object instance.+++

+++The collection of events requires the value of this parameter to be {{true}} and the value of the {{param|##.ServiceMonitoring.EventCollectionEnable}} to be {{true}}.+++
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the {{marktemplate|diffs-1&2}}---Enables or disables collection of Total and Sample statistics for this object instance.---

+++Enables or disables collection of Total and Sample statistics and events for this object instance.+++

+++The collection of events requires the value of this parameter to be {{true}} and the value of the {{param|##.ServiceMonitoring.EventCollectionEnable}} to be {{true}}.+++
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public MainStream withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{marktemplate|diffs-0:1}}Total and Sample statistics +++and event +++collection status for this object instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the {{marktemplate|diffs-0:1}}Total and Sample statistics +++and event +++collection status for this object instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the {{marktemplate|diffs-0:1}}Total and Sample statistics +++and event +++collection status for this object instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public MainStream withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the time based UUID {{bibref|RFC4122|Section 4.2}} that is the identifier for the associated {{param|AVStream}} parameter when available to the device.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public UUID getSessionId() {
		return sessionId;
	}

	/**
	 * Set the time based UUID {{bibref|RFC4122|Section 4.2}} that is the identifier for the associated {{param|AVStream}} parameter when available to the device.
	 *
	 * @since 1.4
	 * @param sessionId the input value
	 */
	public void  setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * Set the time based UUID {{bibref|RFC4122|Section 4.2}} that is the identifier for the associated {{param|AVStream}} parameter when available to the device.
	 *
	 * @since 1.4
	 * @param sessionId the input value
	 * @return this instance
	 */
	public MainStream withSessionId(UUID sessionId) {
		this.sessionId = sessionId;
		return this;
	}

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
	public MainStream withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the service type associated with this main stream instance, or {{empty}} if this instance is disabled.

The STB MUST reject a request that would result in a given AV stream contributing to more than one {{object|.ServiceMonitoring.MainStream}} instance, e.g. it would reject a request to enable simultaneous collection of both IPTV and IP statistics, or to collect IPTV statistics on more than one instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * Set the service type associated with this main stream instance, or {{empty}} if this instance is disabled.

The STB MUST reject a request that would result in a given AV stream contributing to more than one {{object|.ServiceMonitoring.MainStream}} instance, e.g. it would reject a request to enable simultaneous collection of both IPTV and IP statistics, or to collect IPTV statistics on more than one instance.
	 *
	 * @since 1.0
	 * @param serviceType the input value
	 */
	public void  setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * Set the service type associated with this main stream instance, or {{empty}} if this instance is disabled.

The STB MUST reject a request that would result in a given AV stream contributing to more than one {{object|.ServiceMonitoring.MainStream}} instance, e.g. it would reject a request to enable simultaneous collection of both IPTV and IP statistics, or to collect IPTV statistics on more than one instance.
	 *
	 * @since 1.0
	 * @param serviceType the input value
	 * @return this instance
	 */
	public MainStream withServiceType(String serviceType) {
		this.serviceType = serviceType;
		return this;
	}

	/**
	 * Get the main AV stream object instance currently associated with this ''ServiceMonitoring'' main stream instance.  For example:

''.AVStreams.AVStream.2''

Note that, during the period of time over which Sample statistics are stored, this ''ServiceMonitoring'' main stream instance might be associated with many different ''AVStream'' instances.  This parameter just provides information about which ''AVStream'' is currently being monitored.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAvstream() {
		return avstream;
	}

	/**
	 * Set the main AV stream object instance currently associated with this ''ServiceMonitoring'' main stream instance.  For example:

''.AVStreams.AVStream.2''

Note that, during the period of time over which Sample statistics are stored, this ''ServiceMonitoring'' main stream instance might be associated with many different ''AVStream'' instances.  This parameter just provides information about which ''AVStream'' is currently being monitored.
	 *
	 * @since 1.0
	 * @param avstream the input value
	 */
	public void  setAvstream(String avstream) {
		this.avstream = avstream;
	}

	/**
	 * Set the main AV stream object instance currently associated with this ''ServiceMonitoring'' main stream instance.  For example:

''.AVStreams.AVStream.2''

Note that, during the period of time over which Sample statistics are stored, this ''ServiceMonitoring'' main stream instance might be associated with many different ''AVStream'' instances.  This parameter just provides information about which ''AVStream'' is currently being monitored.
	 *
	 * @since 1.0
	 * @param avstream the input value
	 * @return this instance
	 */
	public MainStream withAvstream(String avstream) {
		this.avstream = avstream;
		return this;
	}

	/**
	 * Get the minimum number of consecutive received packets after the end of an RTP Loss Event.  A Loss Event is defined as as a sequence of lost packets, possibly including islands of received packets.  Each island consists of up to

({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getGmin() {
		return gmin;
	}

	/**
	 * Set the minimum number of consecutive received packets after the end of an RTP Loss Event.  A Loss Event is defined as as a sequence of lost packets, possibly including islands of received packets.  Each island consists of up to

({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 1.0
	 * @param gmin the input value
	 */
	public void  setGmin(Long gmin) {
		this.gmin = gmin;
	}

	/**
	 * Set the minimum number of consecutive received packets after the end of an RTP Loss Event.  A Loss Event is defined as as a sequence of lost packets, possibly including islands of received packets.  Each island consists of up to

({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 1.0
	 * @param gmin the input value
	 * @return this instance
	 */
	public MainStream withGmin(Long gmin) {
		this.gmin = gmin;
		return this;
	}

	/**
	 * Get the minimum distance required between error events before an RTP Loss Event is considered severe. Used in the calculation of ''SevereLossIndexCount'' and ''SevereLossIndexCountBeforeEC''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossMinDistance() {
		return severeLossMinDistance;
	}

	/**
	 * Set the minimum distance required between error events before an RTP Loss Event is considered severe. Used in the calculation of ''SevereLossIndexCount'' and ''SevereLossIndexCountBeforeEC''.
	 *
	 * @since 1.0
	 * @param severeLossMinDistance the input value
	 */
	public void  setSevereLossMinDistance(Long severeLossMinDistance) {
		this.severeLossMinDistance = severeLossMinDistance;
	}

	/**
	 * Set the minimum distance required between error events before an RTP Loss Event is considered severe. Used in the calculation of ''SevereLossIndexCount'' and ''SevereLossIndexCountBeforeEC''.
	 *
	 * @since 1.0
	 * @param severeLossMinDistance the input value
	 * @return this instance
	 */
	public MainStream withSevereLossMinDistance(Long severeLossMinDistance) {
		this.severeLossMinDistance = severeLossMinDistance;
		return this;
	}

	/**
	 * Get the minimum value for the count of lost packets per RTP Loss Event before the count of lost packets is considered severe. Used in the calculation of ''SevereLossLengthCount'' and ''SevereLossLengthCountBeforeEC''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossMinLength() {
		return severeLossMinLength;
	}

	/**
	 * Set the minimum value for the count of lost packets per RTP Loss Event before the count of lost packets is considered severe. Used in the calculation of ''SevereLossLengthCount'' and ''SevereLossLengthCountBeforeEC''.
	 *
	 * @since 1.0
	 * @param severeLossMinLength the input value
	 */
	public void  setSevereLossMinLength(Long severeLossMinLength) {
		this.severeLossMinLength = severeLossMinLength;
	}

	/**
	 * Set the minimum value for the count of lost packets per RTP Loss Event before the count of lost packets is considered severe. Used in the calculation of ''SevereLossLengthCount'' and ''SevereLossLengthCountBeforeEC''.
	 *
	 * @since 1.0
	 * @param severeLossMinLength the input value
	 * @return this instance
	 */
	public MainStream withSevereLossMinLength(Long severeLossMinLength) {
		this.severeLossMinLength = severeLossMinLength;
		return this;
	}

	/**
	 * Get the time period, in seconds, between a user channel change request (defined as the instant of transmission of the relevant control protocol message (IGMP JOIN or RTSP SETUP) or a tuner command in case of DTT), and the display of the first I frame for the current AVStream, above which a channel change is considered as failed.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getChannelChangeFailureTimeout() {
		return channelChangeFailureTimeout;
	}

	/**
	 * Set the time period, in seconds, between a user channel change request (defined as the instant of transmission of the relevant control protocol message (IGMP JOIN or RTSP SETUP) or a tuner command in case of DTT), and the display of the first I frame for the current AVStream, above which a channel change is considered as failed.
	 *
	 * @since 1.1
	 * @param channelChangeFailureTimeout the input value
	 */
	public void  setChannelChangeFailureTimeout(Long channelChangeFailureTimeout) {
		this.channelChangeFailureTimeout = channelChangeFailureTimeout;
	}

	/**
	 * Set the time period, in seconds, between a user channel change request (defined as the instant of transmission of the relevant control protocol message (IGMP JOIN or RTSP SETUP) or a tuner command in case of DTT), and the display of the first I frame for the current AVStream, above which a channel change is considered as failed.
	 *
	 * @since 1.1
	 * @param channelChangeFailureTimeout the input value
	 * @return this instance
	 */
	public MainStream withChannelChangeFailureTimeout(Long channelChangeFailureTimeout) {
		this.channelChangeFailureTimeout = channelChangeFailureTimeout;
		return this;
	}

	/**
	 * Get the {{list}} Definition of the histogram intervals for counting loss events according to their size (in packets). Each value indicates the maximum value of the interval. For example, "1,2,4,8," defines the five intervals: 1 packet lost, 2 packets, 3 or 4 packets, 5 to 8 packets and 9 or more packets. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no PacketsLostByEvent stats will be collected.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getPacketsLostByEventHistogramIntervals() {
		return packetsLostByEventHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting loss events according to their size (in packets). Each value indicates the maximum value of the interval. For example, "1,2,4,8," defines the five intervals: 1 packet lost, 2 packets, 3 or 4 packets, 5 to 8 packets and 9 or more packets. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no PacketsLostByEvent stats will be collected.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogramIntervals the input value
	 */
	public void  setPacketsLostByEventHistogramIntervals(Long packetsLostByEventHistogramIntervals) {
		this.packetsLostByEventHistogramIntervals = packetsLostByEventHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting loss events according to their size (in packets). Each value indicates the maximum value of the interval. For example, "1,2,4,8," defines the five intervals: 1 packet lost, 2 packets, 3 or 4 packets, 5 to 8 packets and 9 or more packets. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no PacketsLostByEvent stats will be collected.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogramIntervals the input value
	 * @return this instance
	 */
	public MainStream withPacketsLostByEventHistogramIntervals(Long packetsLostByEventHistogramIntervals) {
		this.packetsLostByEventHistogramIntervals = packetsLostByEventHistogramIntervals;
		return this;
	}

	/**
	 * Get the {{list}} Definition of the histogram intervals for counting loss events according to their delay (in milliseconds) after the preceding loss event. Each value indicates the maximum value of the interval. For example, "10,20,50,100,1000,60000,3600000," defines the intervals up to 10 ms, to 20 ms, to 50 ms, to 100 ms, to 1 s, to 1 mn, to 1 h and more than 1 h. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DelayBetweenLossEvents stats will be collected.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getDelayBetweenLossEventsHistogramIntervals() {
		return delayBetweenLossEventsHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting loss events according to their delay (in milliseconds) after the preceding loss event. Each value indicates the maximum value of the interval. For example, "10,20,50,100,1000,60000,3600000," defines the intervals up to 10 ms, to 20 ms, to 50 ms, to 100 ms, to 1 s, to 1 mn, to 1 h and more than 1 h. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DelayBetweenLossEvents stats will be collected.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogramIntervals the input value
	 */
	public void  setDelayBetweenLossEventsHistogramIntervals(Long delayBetweenLossEventsHistogramIntervals) {
		this.delayBetweenLossEventsHistogramIntervals = delayBetweenLossEventsHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting loss events according to their delay (in milliseconds) after the preceding loss event. Each value indicates the maximum value of the interval. For example, "10,20,50,100,1000,60000,3600000," defines the intervals up to 10 ms, to 20 ms, to 50 ms, to 100 ms, to 1 s, to 1 mn, to 1 h and more than 1 h. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DelayBetweenLossEvents stats will be collected.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogramIntervals the input value
	 * @return this instance
	 */
	public MainStream withDelayBetweenLossEventsHistogramIntervals(Long delayBetweenLossEventsHistogramIntervals) {
		this.delayBetweenLossEventsHistogramIntervals = delayBetweenLossEventsHistogramIntervals;
		return this;
	}

	/**
	 * Get the {{list}} Definition of the histogram intervals for counting severe loss events according to their duration (in milliseconds). Each value indicates the maximum value of the interval. For example, "50,100,500,1000,2000,5000,10000,120000," defines the intervals up to 50 ms, to 100 ms, to 500 ms, to 1 s, to 2 s etc. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DurationSevereLossEvents stats will be collected.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getDurationSevereLossEventsHistogramIntervals() {
		return durationSevereLossEventsHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting severe loss events according to their duration (in milliseconds). Each value indicates the maximum value of the interval. For example, "50,100,500,1000,2000,5000,10000,120000," defines the intervals up to 50 ms, to 100 ms, to 500 ms, to 1 s, to 2 s etc. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DurationSevereLossEvents stats will be collected.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogramIntervals the input value
	 */
	public void  setDurationSevereLossEventsHistogramIntervals(Long durationSevereLossEventsHistogramIntervals) {
		this.durationSevereLossEventsHistogramIntervals = durationSevereLossEventsHistogramIntervals;
	}

	/**
	 * Set the {{list}} Definition of the histogram intervals for counting severe loss events according to their duration (in milliseconds). Each value indicates the maximum value of the interval. For example, "50,100,500,1000,2000,5000,10000,120000," defines the intervals up to 50 ms, to 100 ms, to 500 ms, to 1 s, to 2 s etc. (No value after the last comma means no upper bound.)

If this parameter is set to an empty string, no DurationSevereLossEvents stats will be collected.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogramIntervals the input value
	 * @return this instance
	 */
	public MainStream withDurationSevereLossEventsHistogramIntervals(Long durationSevereLossEventsHistogramIntervals) {
		this.durationSevereLossEventsHistogramIntervals = durationSevereLossEventsHistogramIntervals;
		return this;
	}

	/**
	 * Get the this object represents the log entries of events recorded by the MainStream object instance.

When the number of log entries in the EventLog exceeds the value of the {{param|###.Capabilities.ServiceMonitoring.MaxMainStreamEventLogEntries}} parameter, the Entry object with the lowest SequenceNumber value is replaced by the new EventLog Entry object.

Log entries are persisted across reboots of the CPE.
	 *
	 * @return the value
	 */
	public EventLog getEventLog() {
		return eventLog;
	}

	/**
	 * Set the this object represents the log entries of events recorded by the MainStream object instance.

When the number of log entries in the EventLog exceeds the value of the {{param|###.Capabilities.ServiceMonitoring.MaxMainStreamEventLogEntries}} parameter, the Entry object with the lowest SequenceNumber value is replaced by the new EventLog Entry object.

Log entries are persisted across reboots of the CPE.
	 *
	 * @param eventLog the input value
	 */
	public void  setEventLog(EventLog eventLog) {
		this.eventLog = eventLog;
	}

	/**
	 * Set the this object represents the log entries of events recorded by the MainStream object instance.

When the number of log entries in the EventLog exceeds the value of the {{param|###.Capabilities.ServiceMonitoring.MaxMainStreamEventLogEntries}} parameter, the Entry object with the lowest SequenceNumber value is replaced by the new EventLog Entry object.

Log entries are persisted across reboots of the CPE.
	 *
	 * @param eventLog the input value
	 * @return this instance
	 */
	public MainStream withEventLog(EventLog eventLog) {
		this.eventLog = eventLog;
		return this;
	}

	/**
	 * Get the total statistics since this ''ServiceMonitoring'' main stream instance was last enabled or Total statistics were last reset.
	 *
	 * @return the value
	 */
	public Total getTotal() {
		return total;
	}

	/**
	 * Set the total statistics since this ''ServiceMonitoring'' main stream instance was last enabled or Total statistics were last reset.
	 *
	 * @param total the input value
	 */
	public void  setTotal(Total total) {
		this.total = total;
	}

	/**
	 * Set the total statistics since this ''ServiceMonitoring'' main stream instance was last enabled or Total statistics were last reset.
	 *
	 * @param total the input value
	 * @return this instance
	 */
	public MainStream withTotal(Total total) {
		this.total = total;
		return this;
	}

	/**
	 * Get the sample statistics collected since collection was last enabled or reset.

Most of the parameters in this object are comma-separated lists of individual statistics values, each of which corresponds to a sample interval.

The statistics values in these comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

Each comma-separated list can contain up to {{param|##.ReportSamples}} statistics values.  When the list is full, each new value causes the oldest one to be discarded.

Some comma-separated lists contain terms that are comma-separated lists themselves and are used to store measurements on an event basis. These sub-lists can contain up to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}} values.

If no data was collected for a statistic during a sample interval then the value for that sample interval MUST be zero unless otherwise specified in the description of the individual statistics parameter.
	 *
	 * @return the value
	 */
	public Sample getSample() {
		return sample;
	}

	/**
	 * Set the sample statistics collected since collection was last enabled or reset.

Most of the parameters in this object are comma-separated lists of individual statistics values, each of which corresponds to a sample interval.

The statistics values in these comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

Each comma-separated list can contain up to {{param|##.ReportSamples}} statistics values.  When the list is full, each new value causes the oldest one to be discarded.

Some comma-separated lists contain terms that are comma-separated lists themselves and are used to store measurements on an event basis. These sub-lists can contain up to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}} values.

If no data was collected for a statistic during a sample interval then the value for that sample interval MUST be zero unless otherwise specified in the description of the individual statistics parameter.
	 *
	 * @param sample the input value
	 */
	public void  setSample(Sample sample) {
		this.sample = sample;
	}

	/**
	 * Set the sample statistics collected since collection was last enabled or reset.

Most of the parameters in this object are comma-separated lists of individual statistics values, each of which corresponds to a sample interval.

The statistics values in these comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

Each comma-separated list can contain up to {{param|##.ReportSamples}} statistics values.  When the list is full, each new value causes the oldest one to be discarded.

Some comma-separated lists contain terms that are comma-separated lists themselves and are used to store measurements on an event basis. These sub-lists can contain up to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}} values.

If no data was collected for a statistic during a sample interval then the value for that sample interval MUST be zero unless otherwise specified in the description of the individual statistics parameter.
	 *
	 * @param sample the input value
	 * @return this instance
	 */
	public MainStream withSample(Sample sample) {
		this.sample = sample;
		return this;
	}

	//</editor-fold>

}