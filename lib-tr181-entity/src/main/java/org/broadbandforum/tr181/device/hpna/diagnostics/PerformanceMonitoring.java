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
package org.broadbandforum.tr181.device.hpna.diagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.DiagnosticsState;
import org.broadbandforum.tr181.device.hpna.diagnostics.performancemonitoring.Channels;
import org.broadbandforum.tr181.device.hpna.diagnostics.performancemonitoring.Nodes;

	/**
	 * HPNA performance monitoring configuration and results.

        Performance monitoring results are sampled from all nodes in the HPNA network.  All packet related counters are sampled synchronized at all nodes in the HPNA network in order to derive packet loss calculations in the HPNA network.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Diagnostics.PerformanceMonitoring.")
@XmlRootElement(name = "Device.HPNA.Diagnostics.PerformanceMonitoring")
@XmlType(name = "Device.HPNA.Diagnostics.PerformanceMonitoring")
@XmlAccessorType(XmlAccessType.FIELD)
public class PerformanceMonitoring {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * {{reference}} This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Time in seconds between automatic collection of performance monitoring data.  A value of zero disables automatic collection of data.

          The CPE MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the CPE MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SampleInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long sampleInterval;
	/**
	 * Per-node HPNA performance monitoring results.

        When automatic collection is enabled, i.e. {{param|#.SampleInterval}} is non-zero, the "current" interval is defined by the most recent automatic sample and the most recent subsequent manual sample, if any.

        When automatic collection is disabled, i.e. SampleInterval is zero, the "current" interval is defined by the three most recent manual  samples.

        Note: Packets in statistics counters are Ethernet packets.
	 */
	@XmlElement(name = "Nodes")
	public Nodes nodes;
	/**
	 * Per-channel HPNA performance monitoring results.

        Note: channels are unidirectional.
	 */
	@XmlElement(name = "Channels")
	public Channels channels;

	public PerformanceMonitoring() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public DiagnosticsState getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference}} This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public PerformanceMonitoring with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the time in seconds between automatic collection of performance monitoring data.  A value of zero disables automatic collection of data.

          The CPE MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the CPE MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSampleInterval() {
		return sampleInterval;
	}

	/**
	 * Set the time in seconds between automatic collection of performance monitoring data.  A value of zero disables automatic collection of data.

          The CPE MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the CPE MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.0
	 * @param sampleInterval the input value
	 */
	public void  setSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
	}

	/**
	 * Set the time in seconds between automatic collection of performance monitoring data.  A value of zero disables automatic collection of data.

          The CPE MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the CPE MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.0
	 * @param sampleInterval the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
		return this;
	}

	/**
	 * Get the per-node HPNA performance monitoring results.

        When automatic collection is enabled, i.e. {{param|#.SampleInterval}} is non-zero, the "current" interval is defined by the most recent automatic sample and the most recent subsequent manual sample, if any.

        When automatic collection is disabled, i.e. SampleInterval is zero, the "current" interval is defined by the three most recent manual  samples.

        Note: Packets in statistics counters are Ethernet packets.
	 *
	 * @return the value
	 */
	public Nodes getNodes() {
		return nodes;
	}

	/**
	 * Set the per-node HPNA performance monitoring results.

        When automatic collection is enabled, i.e. {{param|#.SampleInterval}} is non-zero, the "current" interval is defined by the most recent automatic sample and the most recent subsequent manual sample, if any.

        When automatic collection is disabled, i.e. SampleInterval is zero, the "current" interval is defined by the three most recent manual  samples.

        Note: Packets in statistics counters are Ethernet packets.
	 *
	 * @param nodes the input value
	 */
	public void  setNodes(Nodes nodes) {
		this.nodes = nodes;
	}

	/**
	 * Set the per-node HPNA performance monitoring results.

        When automatic collection is enabled, i.e. {{param|#.SampleInterval}} is non-zero, the "current" interval is defined by the most recent automatic sample and the most recent subsequent manual sample, if any.

        When automatic collection is disabled, i.e. SampleInterval is zero, the "current" interval is defined by the three most recent manual  samples.

        Note: Packets in statistics counters are Ethernet packets.
	 *
	 * @param nodes the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withNodes(Nodes nodes) {
		this.nodes = nodes;
		return this;
	}

	/**
	 * Get the per-channel HPNA performance monitoring results.

        Note: channels are unidirectional.
	 *
	 * @return the value
	 */
	public Channels getChannels() {
		return channels;
	}

	/**
	 * Set the per-channel HPNA performance monitoring results.

        Note: channels are unidirectional.
	 *
	 * @param channels the input value
	 */
	public void  setChannels(Channels channels) {
		this.channels = channels;
	}

	/**
	 * Set the per-channel HPNA performance monitoring results.

        Note: channels are unidirectional.
	 *
	 * @param channels the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withChannels(Channels channels) {
		this.channels = channels;
		return this;
	}

	//</editor-fold>

}