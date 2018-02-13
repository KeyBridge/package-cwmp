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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * De-jittering Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.DejitteringStats.")
@XmlRootElement(name = "DejitteringStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Sample.DejitteringStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class DejitteringStats {

	/**
	 * Each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* De-jittering data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the total number of times the receive jitter buffer has overrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Overruns")
	public Long overruns;
	/**
	 * Each entry is the total number of times the receive jitter buffer has underrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Underruns")
	public Long underruns;
	/**
	 * Each entry is the time period, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EmptyBufferTime")
	public Long emptyBufferTime;

	public DejitteringStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* De-jittering data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* De-jittering data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which de-jittering data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* De-jittering data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public DejitteringStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the total number of times the receive jitter buffer has overrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getOverruns() {
		return overruns;
	}

	/**
	 * Set the each entry is the total number of times the receive jitter buffer has overrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param overruns the input value
	 */
	public void  setOverruns(Long overruns) {
		this.overruns = overruns;
	}

	/**
	 * Set the each entry is the total number of times the receive jitter buffer has overrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param overruns the input value
	 * @return this instance
	 */
	public DejitteringStats withOverruns(Long overruns) {
		this.overruns = overruns;
		return this;
	}

	/**
	 * Get the each entry is the total number of times the receive jitter buffer has underrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUnderruns() {
		return underruns;
	}

	/**
	 * Set the each entry is the total number of times the receive jitter buffer has underrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param underruns the input value
	 */
	public void  setUnderruns(Long underruns) {
		this.underruns = underruns;
	}

	/**
	 * Set the each entry is the total number of times the receive jitter buffer has underrun for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param underruns the input value
	 * @return this instance
	 */
	public DejitteringStats withUnderruns(Long underruns) {
		this.underruns = underruns;
		return this;
	}

	/**
	 * Get the each entry is the time period, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEmptyBufferTime() {
		return emptyBufferTime;
	}

	/**
	 * Set the each entry is the time period, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param emptyBufferTime the input value
	 */
	public void  setEmptyBufferTime(Long emptyBufferTime) {
		this.emptyBufferTime = emptyBufferTime;
	}

	/**
	 * Set the each entry is the time period, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param emptyBufferTime the input value
	 * @return this instance
	 */
	public DejitteringStats withEmptyBufferTime(Long emptyBufferTime) {
		this.emptyBufferTime = emptyBufferTime;
		return this;
	}

	//</editor-fold>

}