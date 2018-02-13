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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.onex;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * CDMA2000 1x active handin operational parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.OneX.ActiveHandinMeasurement.")
@XmlRootElement(name = "ActiveHandinMeasurement")
@XmlType(name = "FAPService.FAPControl.CDMA2000.OneX.ActiveHandinMeasurement")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActiveHandinMeasurement {

	/**
	 * Indicates whether the FAP performs active hand-in measurement if a request is received. If {{true}} active hand-in measurement is enabled; if {{false}} active hand-in measurement is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ActiveHandinMeasurementEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean activeHandinMeasurementEnable;
	/**
	 * The minimum duration in 1.25 ms slots for which FAP should take a mobile's RL  pilot strength measurements for active hand-in purpose when directed by the network. Instead of continuous measurement for this entire duration, a FAP can make multiple measurements by sampling over shorter durations. In such a case, this value specifies the minimum time separation required between the first and last measurement samples.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ActiveHandInMeasurementDuration")
	@CWMPParameter(access = "readWrite", units = "1.25 ms slots")
	@Size(min = 0, max = 65535)
	public Long activeHandInMeasurementDuration;
	/**
	 * The threshold (in dBm) for the FAP to report an active hand-in measurement. If the metric to be reported is below the threshold, the FAP may not send any report.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeasurementReportThreshold")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -150, max = 0)
	public Integer measurementReportThreshold;

	public ActiveHandinMeasurement() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the FAP performs active hand-in measurement if a request is received. If {{true}} active hand-in measurement is enabled; if {{false}} active hand-in measurement is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActiveHandinMeasurementEnable() {
		return activeHandinMeasurementEnable;
	}

	/**
	 * Set the indicates whether the FAP performs active hand-in measurement if a request is received. If {{true}} active hand-in measurement is enabled; if {{false}} active hand-in measurement is disabled.
	 *
	 * @since 2.0
	 * @param activeHandinMeasurementEnable the input value
	 */
	public void  setActiveHandinMeasurementEnable(Boolean activeHandinMeasurementEnable) {
		this.activeHandinMeasurementEnable = activeHandinMeasurementEnable;
	}

	/**
	 * Set the indicates whether the FAP performs active hand-in measurement if a request is received. If {{true}} active hand-in measurement is enabled; if {{false}} active hand-in measurement is disabled.
	 *
	 * @since 2.0
	 * @param activeHandinMeasurementEnable the input value
	 * @return this instance
	 */
	public ActiveHandinMeasurement withActiveHandinMeasurementEnable(Boolean activeHandinMeasurementEnable) {
		this.activeHandinMeasurementEnable = activeHandinMeasurementEnable;
		return this;
	}

	/**
	 * Get the minimum duration in 1.25 ms slots for which FAP should take a mobile's RL  pilot strength measurements for active hand-in purpose when directed by the network. Instead of continuous measurement for this entire duration, a FAP can make multiple measurements by sampling over shorter durations. In such a case, this value specifies the minimum time separation required between the first and last measurement samples.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getActiveHandInMeasurementDuration() {
		return activeHandInMeasurementDuration;
	}

	/**
	 * Set the minimum duration in 1.25 ms slots for which FAP should take a mobile's RL  pilot strength measurements for active hand-in purpose when directed by the network. Instead of continuous measurement for this entire duration, a FAP can make multiple measurements by sampling over shorter durations. In such a case, this value specifies the minimum time separation required between the first and last measurement samples.
	 *
	 * @since 2.0
	 * @param activeHandInMeasurementDuration the input value
	 */
	public void  setActiveHandInMeasurementDuration(Long activeHandInMeasurementDuration) {
		this.activeHandInMeasurementDuration = activeHandInMeasurementDuration;
	}

	/**
	 * Set the minimum duration in 1.25 ms slots for which FAP should take a mobile's RL  pilot strength measurements for active hand-in purpose when directed by the network. Instead of continuous measurement for this entire duration, a FAP can make multiple measurements by sampling over shorter durations. In such a case, this value specifies the minimum time separation required between the first and last measurement samples.
	 *
	 * @since 2.0
	 * @param activeHandInMeasurementDuration the input value
	 * @return this instance
	 */
	public ActiveHandinMeasurement withActiveHandInMeasurementDuration(Long activeHandInMeasurementDuration) {
		this.activeHandInMeasurementDuration = activeHandInMeasurementDuration;
		return this;
	}

	/**
	 * Get the threshold (in dBm) for the FAP to report an active hand-in measurement. If the metric to be reported is below the threshold, the FAP may not send any report.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMeasurementReportThreshold() {
		return measurementReportThreshold;
	}

	/**
	 * Set the threshold (in dBm) for the FAP to report an active hand-in measurement. If the metric to be reported is below the threshold, the FAP may not send any report.
	 *
	 * @since 2.0
	 * @param measurementReportThreshold the input value
	 */
	public void  setMeasurementReportThreshold(Integer measurementReportThreshold) {
		this.measurementReportThreshold = measurementReportThreshold;
	}

	/**
	 * Set the threshold (in dBm) for the FAP to report an active hand-in measurement. If the metric to be reported is below the threshold, the FAP may not send any report.
	 *
	 * @since 2.0
	 * @param measurementReportThreshold the input value
	 * @return this instance
	 */
	public ActiveHandinMeasurement withMeasurementReportThreshold(Integer measurementReportThreshold) {
		this.measurementReportThreshold = measurementReportThreshold;
		return this;
	}

	//</editor-fold>

}