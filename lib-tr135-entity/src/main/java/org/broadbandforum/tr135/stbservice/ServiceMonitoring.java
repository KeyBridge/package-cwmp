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
package org.broadbandforum.tr135.stbservice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.stbservice.servicemonitoring.GlobalOperation;
import org.broadbandforum.tr135.stbservice.servicemonitoring.MainStream;

	/**
	 * {{marktemplate|diffs-1&2}}---Contains statistics relating to the QoS / QoE of Main AV streams. These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:---

+++Records events and collects QoS / QoE related statistics for Main AV streams.+++

+++These statistics are broken down into categories, e.g. de-jittering and RTP, and for each category there are two types of statistics:+++

* '''Total''' statistics, which count the number of occurrences of something.

* '''Sample''' statistics, which are measured over a sample interval, and are made available to the ACS as a list of the most recent n samples.

Total statistics are always collected (collection cannot be disabled, but the values can be reset).

For Sample statistics, an STB uses a single sample interval and number of samples (n) for all {{object|MainStream}} instances.  The sample interval can be aligned with absolute time.

When Sample statistics collection is enabled, statistics collection MUST proceed regardless of whether there are any active Main AV streams.  For example, even when the STB is not receiving any data, sample intervals will continue to be timed as normal.

Refer to {{bibref|TR-135|I.3}} for non-normative explanation of the operation of the ''ServiceMonitoring'' object.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.")
@XmlRootElement(name = "STBService.ServiceMonitoring")
@XmlType(name = "STBService.ServiceMonitoring")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceMonitoring {

	/**
	 * Enables or disables collection of Sample statistics.

When collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean sampleEnable;
	/**
	 * Indicates availability of Sample statistics.  {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} -> {{enum|Trigger}} -> {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleState")
	public String sampleState;
	/**
	 * The sample interval in seconds.  Each statistic is measured over this sample interval.

The STB MAY reject a request to set {{param}} to less than {{param|.Capabilities.ServiceMonitoring.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long sampleInterval;
	/**
	 * The number of samples that the STB can store and report for each statistic.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxReportSamples}}.

If {{param}} is changed while collection of Sample statistics is enabled, the STB will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReportSamples")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long reportSamples;
	/**
	 * The number of event measurements of each applicable statistic that the STB is able to store for each sample interval.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}}.

If {{param}} is changed while collection of Sample statistic is enabled, the STB will truncate or extend its event measurement buffers as appropriate, but event measurement collection MUST NOT otherwise be affected.

For example, if {{param|ReportSamples}} is 24 and {{param|SampleInterval}} is 3600 (an hour), and {{param}} is 60, the STB can store up 60 event measurements per hour, or in total 1440 event measurements per day.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EventsPerSampleInterval")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long eventsPerSampleInterval;
	/**
	 * If collection of Sample statistics is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|SampleState}} MUST transition from {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} on completion of every {{param}} sample intervals.  Otherwise, this transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the STB will store 25 values for each statistic and the above {{param|SampleState}} transition will occur every 24 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FetchSamples")
	@CWMPParameter(access = "readWrite")
	public Long fetchSamples;
	/**
	 * An absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

This time reference also determines when the {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of Sample statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|SampleState}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a1}} indicates that no particular time reference is specified.  That is, the STB MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the STB, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TimeReference")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime timeReference;
	/**
	 * When set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

If this is the first time that {{param}} has been set to true during the current sample interval, this MUST cause a new value to be added to each of the Sample statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, MUST be updated accordingly.

Note that {{param}} just provides a ''sneak preview'' of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ForceSample")
	@CWMPParameter(access = "readWrite")
	public Boolean forceSample;
	/**
	 * The absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReportStartTime")
	public LocalDateTime reportStartTime;
	/**
	 * The absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReportEndTime")
	public LocalDateTime reportEndTime;
	/**
	 * Enables or disables the collection of the events for all main streams.

When the collection of events is enabled, any previously collected events are discarded and the collection of new events begins immediately.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EventCollectionEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean eventCollectionEnable;
	/**
	 * Global operations statistics.
	 */
	@XmlElement(name = "GlobalOperation")
	public GlobalOperation globalOperation;
	/**
	 * List of Main AV stream objects. Each instance is associated with a specified service type and will collect statistics only for the main stream that matches that service type.

Note that this means that streams that do not match an instance's service type MUST NOT contribute to the instance's Total and Sample statistics.

It is up to the STB to determine which AV stream should be regarded as the Main AV stream for a given service type at any given time.  For example, if two active streams are associated with the same service type, the STB might prefer streams that are associated with an AV player, or if more than one stream is associated with an AV player, the STB might prefer a player that is outputting a DVI stream to a player that is outputting an RF stream.

Note that some parameters, e.g. {{param|.Components.FrontEnd.{i}.IP.ServiceConnect.URI}}, include requirements that restrict the STB's freedom to determine which AV stream should be regarded as the Main AV stream for a given service.
	 */
	@XmlElementWrapper(name = "MainStreams")
	@XmlElement(name = "MainStream")
	public Collection<MainStream> mainStreams;

	public ServiceMonitoring() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables collection of Sample statistics.

When collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isSampleEnable() {
		return sampleEnable;
	}

	/**
	 * Set the enables or disables collection of Sample statistics.

When collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.0
	 * @param sampleEnable the input value
	 */
	public void  setSampleEnable(Boolean sampleEnable) {
		this.sampleEnable = sampleEnable;
	}

	/**
	 * Set the enables or disables collection of Sample statistics.

When collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.0
	 * @param sampleEnable the input value
	 * @return this instance
	 */
	public ServiceMonitoring withSampleEnable(Boolean sampleEnable) {
		this.sampleEnable = sampleEnable;
		return this;
	}

	/**
	 * Get the indicates availability of Sample statistics.  {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} -> {{enum|Trigger}} -> {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getSampleState() {
		return sampleState;
	}

	/**
	 * Set the indicates availability of Sample statistics.  {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} -> {{enum|Trigger}} -> {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.0
	 * @param sampleState the input value
	 */
	public void  setSampleState(String sampleState) {
		this.sampleState = sampleState;
	}

	/**
	 * Set the indicates availability of Sample statistics.  {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} -> {{enum|Trigger}} -> {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.0
	 * @param sampleState the input value
	 * @return this instance
	 */
	public ServiceMonitoring withSampleState(String sampleState) {
		this.sampleState = sampleState;
		return this;
	}

	/**
	 * Get the sample interval in seconds.  Each statistic is measured over this sample interval.

The STB MAY reject a request to set {{param}} to less than {{param|.Capabilities.ServiceMonitoring.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleInterval() {
		return sampleInterval;
	}

	/**
	 * Set the sample interval in seconds.  Each statistic is measured over this sample interval.

The STB MAY reject a request to set {{param}} to less than {{param|.Capabilities.ServiceMonitoring.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 * @param sampleInterval the input value
	 */
	public void  setSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
	}

	/**
	 * Set the sample interval in seconds.  Each statistic is measured over this sample interval.

The STB MAY reject a request to set {{param}} to less than {{param|.Capabilities.ServiceMonitoring.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 * @param sampleInterval the input value
	 * @return this instance
	 */
	public ServiceMonitoring withSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
		return this;
	}

	/**
	 * Get the number of samples that the STB can store and report for each statistic.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxReportSamples}}.

If {{param}} is changed while collection of Sample statistics is enabled, the STB will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getReportSamples() {
		return reportSamples;
	}

	/**
	 * Set the number of samples that the STB can store and report for each statistic.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxReportSamples}}.

If {{param}} is changed while collection of Sample statistics is enabled, the STB will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 * @param reportSamples the input value
	 */
	public void  setReportSamples(Long reportSamples) {
		this.reportSamples = reportSamples;
	}

	/**
	 * Set the number of samples that the STB can store and report for each statistic.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxReportSamples}}.

If {{param}} is changed while collection of Sample statistics is enabled, the STB will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the STB can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.0
	 * @param reportSamples the input value
	 * @return this instance
	 */
	public ServiceMonitoring withReportSamples(Long reportSamples) {
		this.reportSamples = reportSamples;
		return this;
	}

	/**
	 * Get the number of event measurements of each applicable statistic that the STB is able to store for each sample interval.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}}.

If {{param}} is changed while collection of Sample statistic is enabled, the STB will truncate or extend its event measurement buffers as appropriate, but event measurement collection MUST NOT otherwise be affected.

For example, if {{param|ReportSamples}} is 24 and {{param|SampleInterval}} is 3600 (an hour), and {{param}} is 60, the STB can store up 60 event measurements per hour, or in total 1440 event measurements per day.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getEventsPerSampleInterval() {
		return eventsPerSampleInterval;
	}

	/**
	 * Set the number of event measurements of each applicable statistic that the STB is able to store for each sample interval.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}}.

If {{param}} is changed while collection of Sample statistic is enabled, the STB will truncate or extend its event measurement buffers as appropriate, but event measurement collection MUST NOT otherwise be affected.

For example, if {{param|ReportSamples}} is 24 and {{param|SampleInterval}} is 3600 (an hour), and {{param}} is 60, the STB can store up 60 event measurements per hour, or in total 1440 event measurements per day.
	 *
	 * @since 1.1
	 * @param eventsPerSampleInterval the input value
	 */
	public void  setEventsPerSampleInterval(Long eventsPerSampleInterval) {
		this.eventsPerSampleInterval = eventsPerSampleInterval;
	}

	/**
	 * Set the number of event measurements of each applicable statistic that the STB is able to store for each sample interval.

The STB MUST permit {{param}} to be set to any value in the range from 1 to {{param|.Capabilities.ServiceMonitoring.MaxEventsPerSampleInterval}}.

If {{param}} is changed while collection of Sample statistic is enabled, the STB will truncate or extend its event measurement buffers as appropriate, but event measurement collection MUST NOT otherwise be affected.

For example, if {{param|ReportSamples}} is 24 and {{param|SampleInterval}} is 3600 (an hour), and {{param}} is 60, the STB can store up 60 event measurements per hour, or in total 1440 event measurements per day.
	 *
	 * @since 1.1
	 * @param eventsPerSampleInterval the input value
	 * @return this instance
	 */
	public ServiceMonitoring withEventsPerSampleInterval(Long eventsPerSampleInterval) {
		this.eventsPerSampleInterval = eventsPerSampleInterval;
		return this;
	}

	/**
	 * Get the if collection of Sample statistics is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|SampleState}} MUST transition from {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} on completion of every {{param}} sample intervals.  Otherwise, this transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the STB will store 25 values for each statistic and the above {{param|SampleState}} transition will occur every 24 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getFetchSamples() {
		return fetchSamples;
	}

	/**
	 * Set the if collection of Sample statistics is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|SampleState}} MUST transition from {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} on completion of every {{param}} sample intervals.  Otherwise, this transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the STB will store 25 values for each statistic and the above {{param|SampleState}} transition will occur every 24 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).
	 *
	 * @since 1.0
	 * @param fetchSamples the input value
	 */
	public void  setFetchSamples(Long fetchSamples) {
		this.fetchSamples = fetchSamples;
	}

	/**
	 * Set the if collection of Sample statistics is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|SampleState}} MUST transition from {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} on completion of every {{param}} sample intervals.  Otherwise, this transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the STB will store 25 values for each statistic and the above {{param|SampleState}} transition will occur every 24 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).
	 *
	 * @since 1.0
	 * @param fetchSamples the input value
	 * @return this instance
	 */
	public ServiceMonitoring withFetchSamples(Long fetchSamples) {
		this.fetchSamples = fetchSamples;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

This time reference also determines when the {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of Sample statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|SampleState}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a1}} indicates that no particular time reference is specified.  That is, the STB MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the STB, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getTimeReference() {
		return timeReference;
	}

	/**
	 * Set an absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

This time reference also determines when the {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of Sample statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|SampleState}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a1}} indicates that no particular time reference is specified.  That is, the STB MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the STB, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.0
	 * @param timeReference the input value
	 */
	public void  setTimeReference(LocalDateTime timeReference) {
		this.timeReference = timeReference;
	}

	/**
	 * Set an absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

This time reference also determines when the {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of Sample statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|SampleState}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of Sample statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a1}} indicates that no particular time reference is specified.  That is, the STB MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the STB, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|SampleState}} {{enum|Enabled|SampleState}} -> {{enum|Trigger|SampleState}} -> {{enum|Enabled|SampleState}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.0
	 * @param timeReference the input value
	 * @return this instance
	 */
	public ServiceMonitoring withTimeReference(LocalDateTime timeReference) {
		this.timeReference = timeReference;
		return this;
	}

	/**
	 * Get the when set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

If this is the first time that {{param}} has been set to true during the current sample interval, this MUST cause a new value to be added to each of the Sample statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, MUST be updated accordingly.

Note that {{param}} just provides a ''sneak preview'' of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isForceSample() {
		return forceSample;
	}

	/**
	 * Set the when set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

If this is the first time that {{param}} has been set to true during the current sample interval, this MUST cause a new value to be added to each of the Sample statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, MUST be updated accordingly.

Note that {{param}} just provides a ''sneak preview'' of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.0
	 * @param forceSample the input value
	 */
	public void  setForceSample(Boolean forceSample) {
		this.forceSample = forceSample;
	}

	/**
	 * Set the when set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.

If this is the first time that {{param}} has been set to true during the current sample interval, this MUST cause a new value to be added to each of the Sample statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, MUST be updated accordingly.

Note that {{param}} just provides a ''sneak preview'' of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all ''SampleSeconds'' parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.0
	 * @param forceSample the input value
	 * @return this instance
	 */
	public ServiceMonitoring withForceSample(Boolean forceSample) {
		this.forceSample = forceSample;
		return this;
	}

	/**
	 * Get the absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getReportStartTime() {
		return reportStartTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.0
	 * @param reportStartTime the input value
	 */
	public void  setReportStartTime(LocalDateTime reportStartTime) {
		this.reportStartTime = reportStartTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.0
	 * @param reportStartTime the input value
	 * @return this instance
	 */
	public ServiceMonitoring withReportStartTime(LocalDateTime reportStartTime) {
		this.reportStartTime = reportStartTime;
		return this;
	}

	/**
	 * Get the absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getReportEndTime() {
		return reportEndTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.0
	 * @param reportEndTime the input value
	 */
	public void  setReportEndTime(LocalDateTime reportEndTime) {
		this.reportEndTime = reportEndTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.0
	 * @param reportEndTime the input value
	 * @return this instance
	 */
	public ServiceMonitoring withReportEndTime(LocalDateTime reportEndTime) {
		this.reportEndTime = reportEndTime;
		return this;
	}

	/**
	 * Get the enables or disables the collection of the events for all main streams.

When the collection of events is enabled, any previously collected events are discarded and the collection of new events begins immediately.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEventCollectionEnable() {
		return eventCollectionEnable;
	}

	/**
	 * Set the enables or disables the collection of the events for all main streams.

When the collection of events is enabled, any previously collected events are discarded and the collection of new events begins immediately.
	 *
	 * @since 1.4
	 * @param eventCollectionEnable the input value
	 */
	public void  setEventCollectionEnable(Boolean eventCollectionEnable) {
		this.eventCollectionEnable = eventCollectionEnable;
	}

	/**
	 * Set the enables or disables the collection of the events for all main streams.

When the collection of events is enabled, any previously collected events are discarded and the collection of new events begins immediately.
	 *
	 * @since 1.4
	 * @param eventCollectionEnable the input value
	 * @return this instance
	 */
	public ServiceMonitoring withEventCollectionEnable(Boolean eventCollectionEnable) {
		this.eventCollectionEnable = eventCollectionEnable;
		return this;
	}

	/**
	 * Get the global operations statistics.
	 *
	 * @return the value
	 */
	public GlobalOperation getGlobalOperation() {
		return globalOperation;
	}

	/**
	 * Set the global operations statistics.
	 *
	 * @param globalOperation the input value
	 */
	public void  setGlobalOperation(GlobalOperation globalOperation) {
		this.globalOperation = globalOperation;
	}

	/**
	 * Set the global operations statistics.
	 *
	 * @param globalOperation the input value
	 * @return this instance
	 */
	public ServiceMonitoring withGlobalOperation(GlobalOperation globalOperation) {
		this.globalOperation = globalOperation;
		return this;
	}

	/**
	 * Get the list of Main AV stream objects. Each instance is associated with a specified service type and will collect statistics only for the main stream that matches that service type.

Note that this means that streams that do not match an instance's service type MUST NOT contribute to the instance's Total and Sample statistics.

It is up to the STB to determine which AV stream should be regarded as the Main AV stream for a given service type at any given time.  For example, if two active streams are associated with the same service type, the STB might prefer streams that are associated with an AV player, or if more than one stream is associated with an AV player, the STB might prefer a player that is outputting a DVI stream to a player that is outputting an RF stream.

Note that some parameters, e.g. {{param|.Components.FrontEnd.{i}.IP.ServiceConnect.URI}}, include requirements that restrict the STB's freedom to determine which AV stream should be regarded as the Main AV stream for a given service.
	 *
	 * @return the value
	 */
	public Collection<MainStream> getMainStreams() {
		if (this.mainStreams == null){ this.mainStreams=new ArrayList<>();}
		return mainStreams;
	}

	/**
	 * Set the list of Main AV stream objects. Each instance is associated with a specified service type and will collect statistics only for the main stream that matches that service type.

Note that this means that streams that do not match an instance's service type MUST NOT contribute to the instance's Total and Sample statistics.

It is up to the STB to determine which AV stream should be regarded as the Main AV stream for a given service type at any given time.  For example, if two active streams are associated with the same service type, the STB might prefer streams that are associated with an AV player, or if more than one stream is associated with an AV player, the STB might prefer a player that is outputting a DVI stream to a player that is outputting an RF stream.

Note that some parameters, e.g. {{param|.Components.FrontEnd.{i}.IP.ServiceConnect.URI}}, include requirements that restrict the STB's freedom to determine which AV stream should be regarded as the Main AV stream for a given service.
	 *
	 * @param mainStreams the input value
	 */
	public void  setMainStreams(Collection<MainStream> mainStreams) {
		this.mainStreams = mainStreams;
	}

	/**
	 * Set the list of Main AV stream objects. Each instance is associated with a specified service type and will collect statistics only for the main stream that matches that service type.

Note that this means that streams that do not match an instance's service type MUST NOT contribute to the instance's Total and Sample statistics.

It is up to the STB to determine which AV stream should be regarded as the Main AV stream for a given service type at any given time.  For example, if two active streams are associated with the same service type, the STB might prefer streams that are associated with an AV player, or if more than one stream is associated with an AV player, the STB might prefer a player that is outputting a DVI stream to a player that is outputting an RF stream.

Note that some parameters, e.g. {{param|.Components.FrontEnd.{i}.IP.ServiceConnect.URI}}, include requirements that restrict the STB's freedom to determine which AV stream should be regarded as the Main AV stream for a given service.
	 *
	 * @param mainStream the input value
	 * @return this instance
	 */
	public ServiceMonitoring withMainStream(MainStream mainStream) {
		getMainStreams().add(mainStream);
		return this;
	}

	//</editor-fold>

}