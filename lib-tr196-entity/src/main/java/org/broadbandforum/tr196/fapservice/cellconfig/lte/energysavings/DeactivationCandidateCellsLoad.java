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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.energysavings;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is relevant if the cell acts as a candidate cell. This object indicates the traffic load threshold and the time duration which is used by distributed energy saving algorithms to allow a cell to leave the energy saving state. Threshold and time duration are applied to the candidate cell when it provides coverage backup for the cell in energy saving state.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.EnergySavings.DeactivationCandidateCellsLoad.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.EnergySavings.DeactivationCandidateCellsLoad")
@XmlType(name = "FAPService.CellConfig.LTE.EnergySavings.DeactivationCandidateCellsLoad")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeactivationCandidateCellsLoad {

	/**
	 * PRB usage as a percent {{bibref|3GPP-TS.36.314}}. The threshold applies in the same way for a candidate cell, no matter for which original cell it provides backup coverage.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Threshold")
	@CWMPParameter(access = "readWrite", units = "percent")
	@Size(max = 100)
	public Long threshold;
	/**
	 * This parameter indicates how long the traffic in the candidate cell needs to have been above the threshold, in seconds, to wake up one or more original cells which have been provided backup coverage by the candidate cell.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "TimeDuration")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long timeDuration;

	public DeactivationCandidateCellsLoad() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the prb usage as a percent {{bibref|3GPP-TS.36.314}}. The threshold applies in the same way for a candidate cell, no matter for which original cell it provides backup coverage.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getThreshold() {
		return threshold;
	}

	/**
	 * Set the prb usage as a percent {{bibref|3GPP-TS.36.314}}. The threshold applies in the same way for a candidate cell, no matter for which original cell it provides backup coverage.
	 *
	 * @since 2.1
	 * @param threshold the input value
	 */
	public void  setThreshold(Long threshold) {
		this.threshold = threshold;
	}

	/**
	 * Set the prb usage as a percent {{bibref|3GPP-TS.36.314}}. The threshold applies in the same way for a candidate cell, no matter for which original cell it provides backup coverage.
	 *
	 * @since 2.1
	 * @param threshold the input value
	 * @return this instance
	 */
	public DeactivationCandidateCellsLoad withThreshold(Long threshold) {
		this.threshold = threshold;
		return this;
	}

	/**
	 * Get the this parameter indicates how long the traffic in the candidate cell needs to have been above the threshold, in seconds, to wake up one or more original cells which have been provided backup coverage by the candidate cell.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getTimeDuration() {
		return timeDuration;
	}

	/**
	 * Set the this parameter indicates how long the traffic in the candidate cell needs to have been above the threshold, in seconds, to wake up one or more original cells which have been provided backup coverage by the candidate cell.
	 *
	 * @since 2.1
	 * @param timeDuration the input value
	 */
	public void  setTimeDuration(Long timeDuration) {
		this.timeDuration = timeDuration;
	}

	/**
	 * Set the this parameter indicates how long the traffic in the candidate cell needs to have been above the threshold, in seconds, to wake up one or more original cells which have been provided backup coverage by the candidate cell.
	 *
	 * @since 2.1
	 * @param timeDuration the input value
	 * @return this instance
	 */
	public DeactivationCandidateCellsLoad withTimeDuration(Long timeDuration) {
		this.timeDuration = timeDuration;
		return this;
	}

	//</editor-fold>

}