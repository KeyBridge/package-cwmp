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

	/**
	 * High-level metric Sample statistics for this ''ServiceMonitoring'' main stream instance.  One or more different high-level metrics can be supported; this is specified by  {{param|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStatsNumberOfEntries}}.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.{i}.", uniqueConstraints = {@CWMPUnique(names = {"MetricName"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "STBService.ServiceMonitoring.MainStream.Sample.HighLevelMetricStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Sample.HighLevelMetricStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class HighLevelMetricStats {

	/**
	 * Enables or disables this Metric instance.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this Metric instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Indicates a unique identifier for this high-level metric.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MetricName")
	@Size(max = 256)
	public String metricName;
	/**
	 * This parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Metric1Threshold")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long metric1Threshold;
	/**
	 * This parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Metric2Threshold")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long metric2Threshold;
	/**
	 * Each entry is the number of seconds during which this high-level metric's data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* This high-level metric's data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * This parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Metric1")
	@Size(min = 0, max = 65535)
	public Long metric1;
	/**
	 * This parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Metric2")
	@Size(min = 0, max = 65535)
	public Long metric2;
	/**
	 * This parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Metric1Failures")
	public Long metric1Failures;
	/**
	 * This parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Metric2Failures")
	public Long metric2Failures;
	/**
	 * A time period measured in seconds. A new value for the high level metric is calculated every {{param}} seconds. 

The value for {{param}} MUST be less than, or equal to, {{param|.ServiceMonitoring.SampleInterval}}.

{{param}}  SHOULD be chosen such that {{param|.ServiceMonitoring.SampleInterval}} is an integer multiple of {{param}}. If not, the last metric sample interval in each sample interval MUST be shortened so that the last metric sample interval ends when the sample interval ends.

The value for {{param}} is algorithm-specific.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MetricSampleInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long metricSampleInterval;
	/**
	 * The threshold value that controls the calculation of the {{param|MetricFailures}} parameter.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MetricThreshold")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long metricThreshold;
	/**
	 * Each entry is a high-level metric calculated for this AV stream during the sample interval as the average of the high level metric values calculated on a metric sample interval basis. The length of the metric sample interval is given by {{param|MetricSampleInterval}}.

The interpretation of the metric values is algorithm-specific; the only constraints are that values have to be numeric, in the range [0:65535] and that lower values indicate worse QoE than do higher values.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Metric")
	@Size(min = 0, max = 65535)
	public Long metric;
	/**
	 * Counts the number of times (since the last time this ''MainStream'' and Sample statistics collection were both enabled) that a newly-calculated value of high-level metric {{param|Metric}} was less than or equal to {{param|MetricThreshold}}.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MetricFailures")
	public Long metricFailures;

	public HighLevelMetricStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Metric instance.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Metric instance.
	 *
	 * @since 1.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Metric instance.
	 *
	 * @since 1.1
	 * @param enable the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this Metric instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Metric instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Metric instance.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param status the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withStatus(String status) {
		this.status = status;
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
	public HighLevelMetricStats withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates a unique identifier for this high-level metric.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMetricName() {
		return metricName;
	}

	/**
	 * Set the indicates a unique identifier for this high-level metric.
	 *
	 * @since 1.0
	 * @param metricName the input value
	 */
	public void  setMetricName(String metricName) {
		this.metricName = metricName;
	}

	/**
	 * Set the indicates a unique identifier for this high-level metric.
	 *
	 * @since 1.0
	 * @param metricName the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetricName(String metricName) {
		this.metricName = metricName;
		return this;
	}

	/**
	 * Get the this parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMetric1Threshold() {
		return metric1Threshold;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric1Threshold the input value
	 */
	public void  setMetric1Threshold(Long metric1Threshold) {
		this.metric1Threshold = metric1Threshold;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric1Threshold the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetric1Threshold(Long metric1Threshold) {
		this.metric1Threshold = metric1Threshold;
		return this;
	}

	/**
	 * Get the this parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMetric2Threshold() {
		return metric2Threshold;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric2Threshold the input value
	 */
	public void  setMetric2Threshold(Long metric2Threshold) {
		this.metric2Threshold = metric2Threshold;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricThreshold}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric2Threshold the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetric2Threshold(Long metric2Threshold) {
		this.metric2Threshold = metric2Threshold;
		return this;
	}

	/**
	 * Get the each entry is the number of seconds during which this high-level metric's data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* This high-level metric's data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which this high-level metric's data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* This high-level metric's data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which this high-level metric's data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* This high-level metric's data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the this parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMetric1() {
		return metric1;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric1 the input value
	 */
	public void  setMetric1(Long metric1) {
		this.metric1 = metric1;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric1 the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetric1(Long metric1) {
		this.metric1 = metric1;
		return this;
	}

	/**
	 * Get the this parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMetric2() {
		return metric2;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric2 the input value
	 */
	public void  setMetric2(Long metric2) {
		this.metric2 = metric2;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|Metric}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric2 the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetric2(Long metric2) {
		this.metric2 = metric2;
		return this;
	}

	/**
	 * Get the this parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMetric1Failures() {
		return metric1Failures;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric1Failures the input value
	 */
	public void  setMetric1Failures(Long metric1Failures) {
		this.metric1Failures = metric1Failures;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric1Failures the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetric1Failures(Long metric1Failures) {
		this.metric1Failures = metric1Failures;
		return this;
	}

	/**
	 * Get the this parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMetric2Failures() {
		return metric2Failures;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric2Failures the input value
	 */
	public void  setMetric2Failures(Long metric2Failures) {
		this.metric2Failures = metric2Failures;
	}

	/**
	 * Set the this parameter is DEPRECATED and replaced by the {{param|MetricFailures}} parameter and, if needed, several instances of {{object|.ServiceMonitoring.MainStream.{i}.Sample.HighLevelMetricStats.}}.
	 *
	 * @since 1.0
	 * @param metric2Failures the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetric2Failures(Long metric2Failures) {
		this.metric2Failures = metric2Failures;
		return this;
	}

	/**
	 * Get a time period measured in seconds. A new value for the high level metric is calculated every {{param}} seconds. 

The value for {{param}} MUST be less than, or equal to, {{param|.ServiceMonitoring.SampleInterval}}.

{{param}}  SHOULD be chosen such that {{param|.ServiceMonitoring.SampleInterval}} is an integer multiple of {{param}}. If not, the last metric sample interval in each sample interval MUST be shortened so that the last metric sample interval ends when the sample interval ends.

The value for {{param}} is algorithm-specific.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMetricSampleInterval() {
		return metricSampleInterval;
	}

	/**
	 * Set a time period measured in seconds. A new value for the high level metric is calculated every {{param}} seconds. 

The value for {{param}} MUST be less than, or equal to, {{param|.ServiceMonitoring.SampleInterval}}.

{{param}}  SHOULD be chosen such that {{param|.ServiceMonitoring.SampleInterval}} is an integer multiple of {{param}}. If not, the last metric sample interval in each sample interval MUST be shortened so that the last metric sample interval ends when the sample interval ends.

The value for {{param}} is algorithm-specific.
	 *
	 * @since 1.1
	 * @param metricSampleInterval the input value
	 */
	public void  setMetricSampleInterval(Long metricSampleInterval) {
		this.metricSampleInterval = metricSampleInterval;
	}

	/**
	 * Set a time period measured in seconds. A new value for the high level metric is calculated every {{param}} seconds. 

The value for {{param}} MUST be less than, or equal to, {{param|.ServiceMonitoring.SampleInterval}}.

{{param}}  SHOULD be chosen such that {{param|.ServiceMonitoring.SampleInterval}} is an integer multiple of {{param}}. If not, the last metric sample interval in each sample interval MUST be shortened so that the last metric sample interval ends when the sample interval ends.

The value for {{param}} is algorithm-specific.
	 *
	 * @since 1.1
	 * @param metricSampleInterval the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetricSampleInterval(Long metricSampleInterval) {
		this.metricSampleInterval = metricSampleInterval;
		return this;
	}

	/**
	 * Get the threshold value that controls the calculation of the {{param|MetricFailures}} parameter.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMetricThreshold() {
		return metricThreshold;
	}

	/**
	 * Set the threshold value that controls the calculation of the {{param|MetricFailures}} parameter.
	 *
	 * @since 1.1
	 * @param metricThreshold the input value
	 */
	public void  setMetricThreshold(Long metricThreshold) {
		this.metricThreshold = metricThreshold;
	}

	/**
	 * Set the threshold value that controls the calculation of the {{param|MetricFailures}} parameter.
	 *
	 * @since 1.1
	 * @param metricThreshold the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetricThreshold(Long metricThreshold) {
		this.metricThreshold = metricThreshold;
		return this;
	}

	/**
	 * Get the each entry is a high-level metric calculated for this AV stream during the sample interval as the average of the high level metric values calculated on a metric sample interval basis. The length of the metric sample interval is given by {{param|MetricSampleInterval}}.

The interpretation of the metric values is algorithm-specific; the only constraints are that values have to be numeric, in the range [0:65535] and that lower values indicate worse QoE than do higher values.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMetric() {
		return metric;
	}

	/**
	 * Set the each entry is a high-level metric calculated for this AV stream during the sample interval as the average of the high level metric values calculated on a metric sample interval basis. The length of the metric sample interval is given by {{param|MetricSampleInterval}}.

The interpretation of the metric values is algorithm-specific; the only constraints are that values have to be numeric, in the range [0:65535] and that lower values indicate worse QoE than do higher values.
	 *
	 * @since 1.1
	 * @param metric the input value
	 */
	public void  setMetric(Long metric) {
		this.metric = metric;
	}

	/**
	 * Set the each entry is a high-level metric calculated for this AV stream during the sample interval as the average of the high level metric values calculated on a metric sample interval basis. The length of the metric sample interval is given by {{param|MetricSampleInterval}}.

The interpretation of the metric values is algorithm-specific; the only constraints are that values have to be numeric, in the range [0:65535] and that lower values indicate worse QoE than do higher values.
	 *
	 * @since 1.1
	 * @param metric the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetric(Long metric) {
		this.metric = metric;
		return this;
	}

	/**
	 * Get the counts the number of times (since the last time this ''MainStream'' and Sample statistics collection were both enabled) that a newly-calculated value of high-level metric {{param|Metric}} was less than or equal to {{param|MetricThreshold}}.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMetricFailures() {
		return metricFailures;
	}

	/**
	 * Set the counts the number of times (since the last time this ''MainStream'' and Sample statistics collection were both enabled) that a newly-calculated value of high-level metric {{param|Metric}} was less than or equal to {{param|MetricThreshold}}.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval.
	 *
	 * @since 1.1
	 * @param metricFailures the input value
	 */
	public void  setMetricFailures(Long metricFailures) {
		this.metricFailures = metricFailures;
	}

	/**
	 * Set the counts the number of times (since the last time this ''MainStream'' and Sample statistics collection were both enabled) that a newly-calculated value of high-level metric {{param|Metric}} was less than or equal to {{param|MetricThreshold}}.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval.
	 *
	 * @since 1.1
	 * @param metricFailures the input value
	 * @return this instance
	 */
	public HighLevelMetricStats withMetricFailures(Long metricFailures) {
		this.metricFailures = metricFailures;
		return this;
	}

	//</editor-fold>

}