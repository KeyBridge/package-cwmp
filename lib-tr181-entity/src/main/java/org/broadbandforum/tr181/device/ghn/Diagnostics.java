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
package org.broadbandforum.tr181.device.ghn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.ghn.diagnostics.PHYThroughput;
import org.broadbandforum.tr181.device.ghn.diagnostics.PerformanceMonitoring;

	/**
	 * The G.hn Diagnostics object.
	 *
	 * @since TR181 v2.8
	 */
@CWMPObject(name = "Device.Ghn.Diagnostics.")
@XmlRootElement(name = "Device.Ghn.Diagnostics")
@XmlType(name = "Device.Ghn.Diagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diagnostics {

	/**
	 * G.hn PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PHYThroughputDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 */
	@XmlElement(name = "PHYThroughput")
	public PHYThroughput phyThroughput;
	/**
	 * G.hn Performance Monitoring diagnostics configuration and results.

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PerformanceMonitoringDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 */
	@XmlElement(name = "PerformanceMonitoring")
	public PerformanceMonitoring performanceMonitoring;

	public Diagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the g.hn PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PHYThroughputDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @return the value
	 */
	public PHYThroughput getPhyThroughput() {
		return phyThroughput;
	}

	/**
	 * Set the g.hn PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PHYThroughputDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @param phyThroughput the input value
	 */
	public void  setPhyThroughput(PHYThroughput phyThroughput) {
		this.phyThroughput = phyThroughput;
	}

	/**
	 * Set the g.hn PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PHYThroughputDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @param phyThroughput the input value
	 * @return this instance
	 */
	public Diagnostics withPhyThroughput(PHYThroughput phyThroughput) {
		this.phyThroughput = phyThroughput;
		return this;
	}

	/**
	 * Get the g.hn Performance Monitoring diagnostics configuration and results.

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PerformanceMonitoringDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @return the value
	 */
	public PerformanceMonitoring getPerformanceMonitoring() {
		return performanceMonitoring;
	}

	/**
	 * Set the g.hn Performance Monitoring diagnostics configuration and results.

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PerformanceMonitoringDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @param performanceMonitoring the input value
	 */
	public void  setPerformanceMonitoring(PerformanceMonitoring performanceMonitoring) {
		this.performanceMonitoring = performanceMonitoring;
	}

	/**
	 * Set the g.hn Performance Monitoring diagnostics configuration and results.

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PerformanceMonitoringDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @param performanceMonitoring the input value
	 * @return this instance
	 */
	public Diagnostics withPerformanceMonitoring(PerformanceMonitoring performanceMonitoring) {
		this.performanceMonitoring = performanceMonitoring;
		return this;
	}

	//</editor-fold>

}