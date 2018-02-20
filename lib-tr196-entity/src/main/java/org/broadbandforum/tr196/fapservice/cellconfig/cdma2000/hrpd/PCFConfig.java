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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.pcfconfig.PCFPerformanceStats;

	/**
	 * CDMA2000 HRPD PCF configuration parameters.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFConfig.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.HRPD.PCFConfig")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD.PCFConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class PCFConfig {

	/**
	 * PDSN health check monitor interval in seconds. Setting the value to 0 disables the PDSN Health Monitoring Feature. Setting any non-zero value enables the PDSN Health Monitoring Feature and sets that non-zero value as the timer interval.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCFPDSNHealthMonitorInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 180)
	public Long pcfPDSNHealthMonitorInterval;
	/**
	 * This object is used in obtaining the PCF stats
	 */
	@XmlElement(name = "PCFPerformanceStats")
	public PCFPerformanceStats pcfPerformanceStats;

	public PCFConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the pdsN health check monitor interval in seconds. Setting the value to 0 disables the PDSN Health Monitoring Feature. Setting any non-zero value enables the PDSN Health Monitoring Feature and sets that non-zero value as the timer interval.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPcfPDSNHealthMonitorInterval() {
		return pcfPDSNHealthMonitorInterval;
	}

	/**
	 * Set the pdsN health check monitor interval in seconds. Setting the value to 0 disables the PDSN Health Monitoring Feature. Setting any non-zero value enables the PDSN Health Monitoring Feature and sets that non-zero value as the timer interval.
	 *
	 * @since 2.0
	 * @param pcfPDSNHealthMonitorInterval the input value
	 */
	public void  setPcfPDSNHealthMonitorInterval(Long pcfPDSNHealthMonitorInterval) {
		this.pcfPDSNHealthMonitorInterval = pcfPDSNHealthMonitorInterval;
	}

	/**
	 * Set the pdsN health check monitor interval in seconds. Setting the value to 0 disables the PDSN Health Monitoring Feature. Setting any non-zero value enables the PDSN Health Monitoring Feature and sets that non-zero value as the timer interval.
	 *
	 * @since 2.0
	 * @param pcfPDSNHealthMonitorInterval the input value
	 * @return this instance
	 */
	public PCFConfig withPcfPDSNHealthMonitorInterval(Long pcfPDSNHealthMonitorInterval) {
		this.pcfPDSNHealthMonitorInterval = pcfPDSNHealthMonitorInterval;
		return this;
	}

	/**
	 * Get the this object is used in obtaining the PCF stats
	 *
	 * @return the value
	 */
	public PCFPerformanceStats getPcfPerformanceStats() {
		return pcfPerformanceStats;
	}

	/**
	 * Set the this object is used in obtaining the PCF stats
	 *
	 * @param pcfPerformanceStats the input value
	 */
	public void  setPcfPerformanceStats(PCFPerformanceStats pcfPerformanceStats) {
		this.pcfPerformanceStats = pcfPerformanceStats;
	}

	/**
	 * Set the this object is used in obtaining the PCF stats
	 *
	 * @param pcfPerformanceStats the input value
	 * @return this instance
	 */
	public PCFConfig withPcfPerformanceStats(PCFPerformanceStats pcfPerformanceStats) {
		this.pcfPerformanceStats = pcfPerformanceStats;
		return this;
	}

	//</editor-fold>

}