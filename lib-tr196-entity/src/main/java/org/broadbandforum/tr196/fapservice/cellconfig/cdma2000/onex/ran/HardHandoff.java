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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.hardhandoff.Stats;

	/**
	 * This object provides configurable parameters for 1x Handout
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.HardHandoff.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.HardHandoff")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.HardHandoff")
@XmlAccessorType(XmlAccessType.FIELD)
public class HardHandoff {

	/**
	 * Enabling handout operation.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HandoutEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean handoutEnable;
	/**
	 * Pilot power threshold (in dB relative to the FAP pilot power) for handout declaration
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HOPilotPowerThresh")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 5)
	public Integer hopilotPowerThresh;
	/**
	 * Timethreshold for handout declaration (in 100ms)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HOPilotDuration")
	@CWMPParameter(access = "readWrite", units = "100ms")
	@Size(min = 20, max = 50)
	public Long hopilotDuration;
	/**
	 * This object contains statistics for all Handouts of the 1x FAP.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public HardHandoff() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enabling handout operation.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHandoutEnable() {
		return handoutEnable;
	}

	/**
	 * Set the enabling handout operation.
	 *
	 * @since 2.0
	 * @param handoutEnable the input value
	 */
	public void  setHandoutEnable(Boolean handoutEnable) {
		this.handoutEnable = handoutEnable;
	}

	/**
	 * Set the enabling handout operation.
	 *
	 * @since 2.0
	 * @param handoutEnable the input value
	 * @return this instance
	 */
	public HardHandoff withHandoutEnable(Boolean handoutEnable) {
		this.handoutEnable = handoutEnable;
		return this;
	}

	/**
	 * Get the pilot power threshold (in dB relative to the FAP pilot power) for handout declaration
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHopilotPowerThresh() {
		return hopilotPowerThresh;
	}

	/**
	 * Set the pilot power threshold (in dB relative to the FAP pilot power) for handout declaration
	 *
	 * @since 2.0
	 * @param hopilotPowerThresh the input value
	 */
	public void  setHopilotPowerThresh(Integer hopilotPowerThresh) {
		this.hopilotPowerThresh = hopilotPowerThresh;
	}

	/**
	 * Set the pilot power threshold (in dB relative to the FAP pilot power) for handout declaration
	 *
	 * @since 2.0
	 * @param hopilotPowerThresh the input value
	 * @return this instance
	 */
	public HardHandoff withHopilotPowerThresh(Integer hopilotPowerThresh) {
		this.hopilotPowerThresh = hopilotPowerThresh;
		return this;
	}

	/**
	 * Get the timethreshold for handout declaration (in 100ms)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHopilotDuration() {
		return hopilotDuration;
	}

	/**
	 * Set the timethreshold for handout declaration (in 100ms)
	 *
	 * @since 2.0
	 * @param hopilotDuration the input value
	 */
	public void  setHopilotDuration(Long hopilotDuration) {
		this.hopilotDuration = hopilotDuration;
	}

	/**
	 * Set the timethreshold for handout declaration (in 100ms)
	 *
	 * @since 2.0
	 * @param hopilotDuration the input value
	 * @return this instance
	 */
	public HardHandoff withHopilotDuration(Long hopilotDuration) {
		this.hopilotDuration = hopilotDuration;
		return this;
	}

	/**
	 * Get the this object contains statistics for all Handouts of the 1x FAP.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for all Handouts of the 1x FAP.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for all Handouts of the 1x FAP.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public HardHandoff withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}