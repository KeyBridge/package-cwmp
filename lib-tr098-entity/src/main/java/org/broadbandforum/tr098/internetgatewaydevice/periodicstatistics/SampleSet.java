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
package org.broadbandforum.tr098.internetgatewaydevice.periodicstatistics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.internetgatewaydevice.periodicstatistics.sampleset.Parameter;

	/**
	 * Periodic statistics sample set table.  Each sample set has its own sample interval etc.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.PeriodicStatistics.SampleSet.{i}.")
public class SampleSet {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enables or disables collection of periodic statistics for this sample set.

When collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Indicates availability of Sample statistics. {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} to {{enum|Trigger}} to {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * The name of this sample set, which uniquely distinguishes each sample set.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String name;
	/**
	 * The sample interval in seconds. Each statistic is measured over this sample interval.

The CPE MAY reject a request to set {{param}} to less than {{param|.PeriodicStatistics.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "SampleInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long sampleInterval = 3600L;
	/**
	 * The number of samples that the CPE will store and report for each statistic.

The CPE MUST permit {{param}} to be set to at least {{param|.PeriodicStatistics.MaxReportSamples}}.

If {{param}} is changed while collection of periodic statistics is enabled, the CPE will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "ReportSamples")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long reportSamples = 24L;
	/**
	 * An absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

This time reference also determines when the {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of periodic statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|Status}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the CPE, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "TimeReference")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime timeReference = LocalDateTime.parse("0001-01-01T00:00:00Z");;
	/**
	 * The number of sample intervals to be collected before transitioning {{param|Status}} from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}}.

If this SampleSet is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|Status}} MUST transition from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} on completion of every {{param}} sample intervals.  Otherwise, the transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the CPE will store 25 values for each monitored parameter and the above {{param|Status}} transition will occur as the CPE stores each 24th of 25 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).

To disable this trigger mechanism and still collect sampled statistics, {{param}} can be set to either 0 or a value greater than {{param|ReportSamples}}.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "FetchSamples")
	@CWMPParameter(access = "readWrite")
	public Long fetchSamples = 0L;
	/**
	 * When set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect. {{hidden}}

If this is the first time that {{param}} has been set to {{true}} during the current sample interval, this MUST cause a new value to be added to each of the periodic statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, MUST be updated accordingly.

Note that {{param}} just provides a "sneak preview" of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "ForceSample")
	@CWMPParameter(access = "readWrite")
	public Boolean forceSample = false;
	/**
	 * The absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "ReportStartTime")
	public LocalDateTime reportStartTime = LocalDateTime.parse("");;
	/**
	 * The absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "ReportEndTime")
	public LocalDateTime reportEndTime = LocalDateTime.parse("");;
	/**
	 * {{list}} Each entry indicates the number of seconds during which data was collected during the sample interval.

Individual {{param}} values can be less than {{param|SampleInterval}}, for several reasons, including:

: {{param|TimeReference}} has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

: {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "SampleSeconds")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long sampleSeconds;
	/**
	 * Periodic statistics parameter table for this sample set.  This table contains entries for parameters whose values are to be sampled.

Note that the comma-separated lists in this object (SampleSeconds, SuspectData and Values) only ever change (a) when first enabled, (b) when ForceSample is set to true (a "sneak preview" of the current sample), or (c) at the end of the sample interval.
	 */
	@XmlElementWrapper(name = "Parameters")
	@XmlElement(name = "Parameter")
	@CWMPParameter(access = "readWrite")
	public Collection<Parameter> parameters;

	public SampleSet() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public SampleSet withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables collection of periodic statistics for this sample set.

When collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables collection of periodic statistics for this sample set.

When collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables collection of periodic statistics for this sample set.

When collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.
	 *
	 * @since 1.5
	 * @param enable the input value
	 * @return this instance
	 */
	public SampleSet withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates availability of Sample statistics. {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} to {{enum|Trigger}} to {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates availability of Sample statistics. {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} to {{enum|Trigger}} to {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates availability of Sample statistics. {{enum}}

The {{enum|Trigger}} value is only used for triggering the ACS to fetch the collected data and can only be used when {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}].

The transition from {{enum|Enabled}} to {{enum|Trigger}} to {{enum|Enabled}} MUST be instantaneous and so will result in only a single value change for notification purposes.
	 *
	 * @since 1.5
	 * @param status the input value
	 * @return this instance
	 */
	public SampleSet withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the name of this sample set, which uniquely distinguishes each sample set.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of this sample set, which uniquely distinguishes each sample set.
	 *
	 * @since 1.5
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of this sample set, which uniquely distinguishes each sample set.
	 *
	 * @since 1.5
	 * @param name the input value
	 * @return this instance
	 */
	public SampleSet withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the sample interval in seconds. Each statistic is measured over this sample interval.

The CPE MAY reject a request to set {{param}} to less than {{param|.PeriodicStatistics.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getSampleInterval() {
		return sampleInterval;
	}

	/**
	 * Set the sample interval in seconds. Each statistic is measured over this sample interval.

The CPE MAY reject a request to set {{param}} to less than {{param|.PeriodicStatistics.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 * @param sampleInterval the input value
	 */
	public void  setSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
	}

	/**
	 * Set the sample interval in seconds. Each statistic is measured over this sample interval.

The CPE MAY reject a request to set {{param}} to less than {{param|.PeriodicStatistics.MinSampleInterval}}.

Sample intervals MUST begin every {{param}} seconds, with no delay between samples.

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

For example, if {{param|ReportSamples}} is 24 and {{param}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 * @param sampleInterval the input value
	 * @return this instance
	 */
	public SampleSet withSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
		return this;
	}

	/**
	 * Get the number of samples that the CPE will store and report for each statistic.

The CPE MUST permit {{param}} to be set to at least {{param|.PeriodicStatistics.MaxReportSamples}}.

If {{param}} is changed while collection of periodic statistics is enabled, the CPE will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getReportSamples() {
		return reportSamples;
	}

	/**
	 * Set the number of samples that the CPE will store and report for each statistic.

The CPE MUST permit {{param}} to be set to at least {{param|.PeriodicStatistics.MaxReportSamples}}.

If {{param}} is changed while collection of periodic statistics is enabled, the CPE will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 * @param reportSamples the input value
	 */
	public void  setReportSamples(Long reportSamples) {
		this.reportSamples = reportSamples;
	}

	/**
	 * Set the number of samples that the CPE will store and report for each statistic.

The CPE MUST permit {{param}} to be set to at least {{param|.PeriodicStatistics.MaxReportSamples}}.

If {{param}} is changed while collection of periodic statistics is enabled, the CPE will truncate or extend its statistics buffers as appropriate, but statistics collection MUST NOT otherwise be affected.

For example, if {{param}} is 24 and {{param|SampleInterval}} is 3600 (an hour), the CPE can store up to a day's worth of samples for each statistic.
	 *
	 * @since 1.5
	 * @param reportSamples the input value
	 * @return this instance
	 */
	public SampleSet withReportSamples(Long reportSamples) {
		this.reportSamples = reportSamples;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

This time reference also determines when the {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of periodic statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|Status}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the CPE, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public LocalDateTime getTimeReference() {
		return timeReference;
	}

	/**
	 * Set an absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

This time reference also determines when the {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of periodic statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|Status}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the CPE, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.5
	 * @param timeReference the input value
	 */
	public void  setTimeReference(LocalDateTime timeReference) {
		this.timeReference = timeReference;
	}

	/**
	 * Set an absolute time reference in UTC to determine when sample intervals will complete.  Each sample interval MUST complete at this reference time plus or minus an integer multiple of {{param|SampleInterval}}.

{{param}} is used only to set the "phase" of the sample and fetch intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

This time reference also determines when the {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions that are controlled by {{param|FetchSamples}} will occur.  If collection of periodic statistics is enabled and {{param|FetchSamples}} is in the range [1:{{param|ReportSamples}}] then each such {{param|Status}} transition MUST occur at this reference time plus or minus an integer multiple of {{param|FetchSamples}} * {{param|SampleInterval}} (the fetch interval).

If {{param}} is changed while collection of periodic statistics is enabled, any stored samples are discarded, and the first sample interval begins immediately.

The Unknown Time value defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified sample and fetch intervals.

If absolute time is not available to the CPE, its sample and fetch interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|SampleInterval}} is 3600 (an hour) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then sample intervals will complete on each UTC hour (00:00, 01:00, 02:00 etc).

If, in addition, {{param|FetchSamples}} is 24, then the fetch interval is 86400 (a day) and {{param|Status}} {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} transitions will occur every day at UTC midnight.

Note that, if {{param}} is set to a time other than the Unknown Time, the first sample interval (which has to begin immediately) will almost certainly be shorter than {{param|SampleInterval}}).  This is why {{param}} is defined in terms of when sample intervals complete rather than start.
	 *
	 * @since 1.5
	 * @param timeReference the input value
	 * @return this instance
	 */
	public SampleSet withTimeReference(LocalDateTime timeReference) {
		this.timeReference = timeReference;
		return this;
	}

	/**
	 * Get the number of sample intervals to be collected before transitioning {{param|Status}} from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}}.

If this SampleSet is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|Status}} MUST transition from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} on completion of every {{param}} sample intervals.  Otherwise, the transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the CPE will store 25 values for each monitored parameter and the above {{param|Status}} transition will occur as the CPE stores each 24th of 25 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).

To disable this trigger mechanism and still collect sampled statistics, {{param}} can be set to either 0 or a value greater than {{param|ReportSamples}}.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getFetchSamples() {
		return fetchSamples;
	}

	/**
	 * Set the number of sample intervals to be collected before transitioning {{param|Status}} from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}}.

If this SampleSet is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|Status}} MUST transition from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} on completion of every {{param}} sample intervals.  Otherwise, the transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the CPE will store 25 values for each monitored parameter and the above {{param|Status}} transition will occur as the CPE stores each 24th of 25 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).

To disable this trigger mechanism and still collect sampled statistics, {{param}} can be set to either 0 or a value greater than {{param|ReportSamples}}.
	 *
	 * @since 1.5
	 * @param fetchSamples the input value
	 */
	public void  setFetchSamples(Long fetchSamples) {
		this.fetchSamples = fetchSamples;
	}

	/**
	 * Set the number of sample intervals to be collected before transitioning {{param|Status}} from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}}.

If this SampleSet is enabled and {{param}} is in the range [1:{{param|ReportSamples}}] then {{param|Status}} MUST transition from {{enum|Enabled|Status}} to {{enum|Trigger|Status}} to {{enum|Enabled|Status}} on completion of every {{param}} sample intervals.  Otherwise, the transition MUST NOT occur.

For example, if {{param|ReportSamples}} is 25 and {{param}} is 24, then the CPE will store 25 values for each monitored parameter and the above {{param|Status}} transition will occur as the CPE stores each 24th of 25 sample intervals, which means that the ACS could delay for up to two sample intervals before reading the stored values and would still not miss any samples (see also {{param|ForceSample}}).

To disable this trigger mechanism and still collect sampled statistics, {{param}} can be set to either 0 or a value greater than {{param|ReportSamples}}.
	 *
	 * @since 1.5
	 * @param fetchSamples the input value
	 * @return this instance
	 */
	public SampleSet withFetchSamples(Long fetchSamples) {
		this.fetchSamples = fetchSamples;
		return this;
	}

	/**
	 * Get the when set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect. {{hidden}}

If this is the first time that {{param}} has been set to {{true}} during the current sample interval, this MUST cause a new value to be added to each of the periodic statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, MUST be updated accordingly.

Note that {{param}} just provides a "sneak preview" of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Boolean isForceSample() {
		return forceSample;
	}

	/**
	 * Set the when set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect. {{hidden}}

If this is the first time that {{param}} has been set to {{true}} during the current sample interval, this MUST cause a new value to be added to each of the periodic statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, MUST be updated accordingly.

Note that {{param}} just provides a "sneak preview" of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.5
	 * @param forceSample the input value
	 */
	public void  setForceSample(Boolean forceSample) {
		this.forceSample = forceSample;
	}

	/**
	 * Set the when set to {{true}}, forces statistics for the current sample to be calculated and updated in the data model.  Setting it to {{false}} has no effect. {{hidden}}

If this is the first time that {{param}} has been set to {{true}} during the current sample interval, this MUST cause a new value to be added to each of the periodic statistics comma-separated list parameters, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters MUST be updated accordingly.

If this is not the first time that {{param}} has been set to {{true}} during the current sample interval, then the new values that were added as described in the previous paragraph, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, MUST be updated accordingly.

Note that {{param}} just provides a "sneak preview" of the current sample.  It does not create a new sample and it does not interfere with the sample interval schedule.

At the end of each sample interval, if {{param}} was set to {{true}} during the sample interval then the new values that were added as described above, and the {{param|ReportEndTime}} and all {{param|SampleSeconds}} parameters, will be updated accordingly.  In other words, the partial sample data that was created when {{param}} was set to {{true}} will be updated one last time at the end of the sample interval.
	 *
	 * @since 1.5
	 * @param forceSample the input value
	 * @return this instance
	 */
	public SampleSet withForceSample(Boolean forceSample) {
		this.forceSample = forceSample;
		return this;
	}

	/**
	 * Get the absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public LocalDateTime getReportStartTime() {
		return reportStartTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.5
	 * @param reportStartTime the input value
	 */
	public void  setReportStartTime(LocalDateTime reportStartTime) {
		this.reportStartTime = reportStartTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the first stored sample (for each statistic) started.
	 *
	 * @since 1.5
	 * @param reportStartTime the input value
	 * @return this instance
	 */
	public SampleSet withReportStartTime(LocalDateTime reportStartTime) {
		this.reportStartTime = reportStartTime;
		return this;
	}

	/**
	 * Get the absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public LocalDateTime getReportEndTime() {
		return reportEndTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.5
	 * @param reportEndTime the input value
	 */
	public void  setReportEndTime(LocalDateTime reportEndTime) {
		this.reportEndTime = reportEndTime;
	}

	/**
	 * Set the absolute time at which the sample interval for the last stored sample (for each statistic) ended.

If {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model, then {{param}} MUST be updated to reflect the actual time over which stored data was collected.
	 *
	 * @since 1.5
	 * @param reportEndTime the input value
	 * @return this instance
	 */
	public SampleSet withReportEndTime(LocalDateTime reportEndTime) {
		this.reportEndTime = reportEndTime;
		return this;
	}

	/**
	 * Get the {{list}} Each entry indicates the number of seconds during which data was collected during the sample interval.

Individual {{param}} values can be less than {{param|SampleInterval}}, for several reasons, including:

: {{param|TimeReference}} has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

: {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the {{list}} Each entry indicates the number of seconds during which data was collected during the sample interval.

Individual {{param}} values can be less than {{param|SampleInterval}}, for several reasons, including:

: {{param|TimeReference}} has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

: {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.5
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the {{list}} Each entry indicates the number of seconds during which data was collected during the sample interval.

Individual {{param}} values can be less than {{param|SampleInterval}}, for several reasons, including:

: {{param|TimeReference}} has been set to a time other than the Unknown Time and the current sample interval started part of the way through a scheduled sample interval.

: {{param|ForceSample}} has been used to force statistics for the current sample to be calculated and updated in the data model.
	 *
	 * @since 1.5
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public SampleSet withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the periodic statistics parameter table for this sample set.  This table contains entries for parameters whose values are to be sampled.

Note that the comma-separated lists in this object (SampleSeconds, SuspectData and Values) only ever change (a) when first enabled, (b) when ForceSample is set to true (a "sneak preview" of the current sample), or (c) at the end of the sample interval.
	 *
	 * @return the value
	 */
	public Collection<Parameter> getParameters() {
		if (this.parameters == null){ this.parameters=new ArrayList<>();}
		return parameters;
	}

	/**
	 * Set the periodic statistics parameter table for this sample set.  This table contains entries for parameters whose values are to be sampled.

Note that the comma-separated lists in this object (SampleSeconds, SuspectData and Values) only ever change (a) when first enabled, (b) when ForceSample is set to true (a "sneak preview" of the current sample), or (c) at the end of the sample interval.
	 *
	 * @param parameters the input value
	 */
	public void  setParameters(Collection<Parameter> parameters) {
		this.parameters = parameters;
	}

	/**
	 * Set the periodic statistics parameter table for this sample set.  This table contains entries for parameters whose values are to be sampled.

Note that the comma-separated lists in this object (SampleSeconds, SuspectData and Values) only ever change (a) when first enabled, (b) when ForceSample is set to true (a "sneak preview" of the current sample), or (c) at the end of the sample interval.
	 *
	 * @param parameter the input value
	 * @return this instance
	 */
	public SampleSet withParameter(Parameter parameter) {
		getParameters().add(parameter);
		return this;
	}

	//</editor-fold>

}