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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.periodicstatistics.SampleSet;

	/**
	 * This object configures collection of periodic statistics for the device.

Periodic statistics are measured over a sample interval (which can be aligned with absolute time) and are made available to the ACS as a comma-separated list of the most recent <n> samples.

This object provides a single set of global settings that affect the entire device unless overridden locally.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.PeriodicStatistics.")
public class PeriodicStatistics {

	/**
	 * Minimum sample interval in seconds that the CPE is able to support.

A value of 0 indicates no specific minimum sample interval.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "MinSampleInterval")
	public Long minSampleInterval;
	/**
	 * Maximum number of samples of each statistic that the CPE is able to store and report.

A value of 0 indicates no specific maximum number of samples.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "MaxReportSamples")
	public Long maxReportSamples;
	/**
	 * Periodic statistics sample set table.  Each sample set has its own sample interval etc.
	 */
	@XmlElementWrapper(name = "SampleSets")
	@XmlElement(name = "SampleSet")
	@CWMPParameter(access = "readWrite")
	public Collection<SampleSet> sampleSets;

	public PeriodicStatistics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the minimum sample interval in seconds that the CPE is able to support.

A value of 0 indicates no specific minimum sample interval.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getMinSampleInterval() {
		return minSampleInterval;
	}

	/**
	 * Set the minimum sample interval in seconds that the CPE is able to support.

A value of 0 indicates no specific minimum sample interval.
	 *
	 * @since 1.5
	 * @param minSampleInterval the input value
	 */
	public void  setMinSampleInterval(Long minSampleInterval) {
		this.minSampleInterval = minSampleInterval;
	}

	/**
	 * Set the minimum sample interval in seconds that the CPE is able to support.

A value of 0 indicates no specific minimum sample interval.
	 *
	 * @since 1.5
	 * @param minSampleInterval the input value
	 * @return this instance
	 */
	public PeriodicStatistics withMinSampleInterval(Long minSampleInterval) {
		this.minSampleInterval = minSampleInterval;
		return this;
	}

	/**
	 * Get the maximum number of samples of each statistic that the CPE is able to store and report.

A value of 0 indicates no specific maximum number of samples.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getMaxReportSamples() {
		return maxReportSamples;
	}

	/**
	 * Set the maximum number of samples of each statistic that the CPE is able to store and report.

A value of 0 indicates no specific maximum number of samples.
	 *
	 * @since 1.5
	 * @param maxReportSamples the input value
	 */
	public void  setMaxReportSamples(Long maxReportSamples) {
		this.maxReportSamples = maxReportSamples;
	}

	/**
	 * Set the maximum number of samples of each statistic that the CPE is able to store and report.

A value of 0 indicates no specific maximum number of samples.
	 *
	 * @since 1.5
	 * @param maxReportSamples the input value
	 * @return this instance
	 */
	public PeriodicStatistics withMaxReportSamples(Long maxReportSamples) {
		this.maxReportSamples = maxReportSamples;
		return this;
	}

	/**
	 * Get the periodic statistics sample set table.  Each sample set has its own sample interval etc.
	 *
	 * @return the value
	 */
	public Collection<SampleSet> getSampleSets() {
		if (this.sampleSets == null){ this.sampleSets=new ArrayList<>();}
		return sampleSets;
	}

	/**
	 * Set the periodic statistics sample set table.  Each sample set has its own sample interval etc.
	 *
	 * @param sampleSets the input value
	 */
	public void  setSampleSets(Collection<SampleSet> sampleSets) {
		this.sampleSets = sampleSets;
	}

	/**
	 * Set the periodic statistics sample set table.  Each sample set has its own sample interval etc.
	 *
	 * @param sampleSet the input value
	 * @return this instance
	 */
	public PeriodicStatistics withSampleSet(SampleSet sampleSet) {
		getSampleSets().add(sampleSet);
		return this;
	}

	//</editor-fold>

}