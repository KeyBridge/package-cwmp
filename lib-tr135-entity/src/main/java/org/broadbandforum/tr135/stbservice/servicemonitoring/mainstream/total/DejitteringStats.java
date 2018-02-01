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

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Total de-jittering statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Total.DejitteringStats.")
public class DejitteringStats {

	/**
	 * The number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* De-jittering data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TotalSeconds")
	public Long totalSeconds;
	/**
	 * Total time, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EmptyBufferTime")
	public Long emptyBufferTime;
	/**
	 * Total number of times the receive jitter buffer has overrun for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Overruns")
	@CWMPParameter(activeNotify = "canDeny")
	public Long overruns;
	/**
	 * Total number of times the receive jitter buffer has underrun for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Underruns")
	@CWMPParameter(activeNotify = "canDeny")
	public Long underruns;

	public DejitteringStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* De-jittering data collection is not appropriate or possible for this AV stream.
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

* De-jittering data collection is not appropriate or possible for this AV stream.
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

* De-jittering data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 * @return this instance
	 */
	public DejitteringStats withTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
		return this;
	}

	/**
	 * Get the total time, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getEmptyBufferTime() {
		return emptyBufferTime;
	}

	/**
	 * Set the total time, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream.
	 *
	 * @since 1.1
	 * @param emptyBufferTime the input value
	 */
	public void  setEmptyBufferTime(Long emptyBufferTime) {
		this.emptyBufferTime = emptyBufferTime;
	}

	/**
	 * Set the total time, in milliseconds, for which the playout was stopped due to buffer issues (empty or too low level) for this AV stream.
	 *
	 * @since 1.1
	 * @param emptyBufferTime the input value
	 * @return this instance
	 */
	public DejitteringStats withEmptyBufferTime(Long emptyBufferTime) {
		this.emptyBufferTime = emptyBufferTime;
		return this;
	}

	/**
	 * Get the total number of times the receive jitter buffer has overrun for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getOverruns() {
		return overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun for this AV stream.
	 *
	 * @since 1.0
	 * @param overruns the input value
	 */
	public void  setOverruns(Long overruns) {
		this.overruns = overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun for this AV stream.
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
	 * Get the total number of times the receive jitter buffer has underrun for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUnderruns() {
		return underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun for this AV stream.
	 *
	 * @since 1.0
	 * @param underruns the input value
	 */
	public void  setUnderruns(Long underruns) {
		this.underruns = underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun for this AV stream.
	 *
	 * @since 1.0
	 * @param underruns the input value
	 * @return this instance
	 */
	public DejitteringStats withUnderruns(Long underruns) {
		this.underruns = underruns;
		return this;
	}

	//</editor-fold>

}