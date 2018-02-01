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
package org.broadbandforum.tr181.device.hpna;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.hpna.diagnostics.PHYThroughput;
import org.broadbandforum.tr181.device.hpna.diagnostics.PerformanceMonitoring;

	/**
	 * The HPNA Diagnostics object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Diagnostics.")
public class Diagnostics {

	/**
	 * HPNA PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all HPNA nodes for which the {{param|##.Interface.{i}.AssociatedDevice.{i}.PHYDiagnosticsEnable}} parameter is set enter PHY diagnostics  mode.
	 */
	@XmlElement(name = "PHYThroughput")
	public PHYThroughput phyThroughput;
	/**
	 * HPNA performance monitoring configuration and results.

        Performance monitoring results are sampled from all nodes in the HPNA network.  All packet related counters are sampled synchronized at all nodes in the HPNA network in order to derive packet loss calculations in the HPNA network.
	 */
	@XmlElement(name = "PerformanceMonitoring")
	public PerformanceMonitoring performanceMonitoring;

	public Diagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the hpnA PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all HPNA nodes for which the {{param|##.Interface.{i}.AssociatedDevice.{i}.PHYDiagnosticsEnable}} parameter is set enter PHY diagnostics  mode.
	 *
	 * @return the value
	 */
	public PHYThroughput getPhyThroughput() {
		return phyThroughput;
	}

	/**
	 * Set the hpnA PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all HPNA nodes for which the {{param|##.Interface.{i}.AssociatedDevice.{i}.PHYDiagnosticsEnable}} parameter is set enter PHY diagnostics  mode.
	 *
	 * @param phyThroughput the input value
	 */
	public void  setPhyThroughput(PHYThroughput phyThroughput) {
		this.phyThroughput = phyThroughput;
	}

	/**
	 * Set the hpnA PHY throughput diagnostics configuration and results. 

        When diagnostics are requested, all HPNA nodes for which the {{param|##.Interface.{i}.AssociatedDevice.{i}.PHYDiagnosticsEnable}} parameter is set enter PHY diagnostics  mode.
	 *
	 * @param phyThroughput the input value
	 * @return this instance
	 */
	public Diagnostics withPhyThroughput(PHYThroughput phyThroughput) {
		this.phyThroughput = phyThroughput;
		return this;
	}

	/**
	 * Get the hpnA performance monitoring configuration and results.

        Performance monitoring results are sampled from all nodes in the HPNA network.  All packet related counters are sampled synchronized at all nodes in the HPNA network in order to derive packet loss calculations in the HPNA network.
	 *
	 * @return the value
	 */
	public PerformanceMonitoring getPerformanceMonitoring() {
		return performanceMonitoring;
	}

	/**
	 * Set the hpnA performance monitoring configuration and results.

        Performance monitoring results are sampled from all nodes in the HPNA network.  All packet related counters are sampled synchronized at all nodes in the HPNA network in order to derive packet loss calculations in the HPNA network.
	 *
	 * @param performanceMonitoring the input value
	 */
	public void  setPerformanceMonitoring(PerformanceMonitoring performanceMonitoring) {
		this.performanceMonitoring = performanceMonitoring;
	}

	/**
	 * Set the hpnA performance monitoring configuration and results.

        Performance monitoring results are sampled from all nodes in the HPNA network.  All packet related counters are sampled synchronized at all nodes in the HPNA network in order to derive packet loss calculations in the HPNA network.
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