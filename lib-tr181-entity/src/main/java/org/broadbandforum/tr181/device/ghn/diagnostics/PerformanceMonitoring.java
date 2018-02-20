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
package org.broadbandforum.tr181.device.ghn.diagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.DiagnosticsState;
import org.broadbandforum.common.MACAddress;
import org.broadbandforum.tr181.device.ghn.diagnostics.performancemonitoring.Channels;
import org.broadbandforum.tr181.device.ghn.diagnostics.performancemonitoring.Nodes;

	/**
	 * G.hn Performance Monitoring diagnostics configuration and results.

        When diagnostics are requested, all G.hn nodes for which the {{param|##.Interface.{i}.PerformanceMonitoringDiagnosticsEnable}} parameter is set enter PHY diagnostics mode.
	 *
	 * @since TR181 v2.8
	 */
@CWMPObject(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.")
@XmlRootElement(name = "Device.Ghn.Diagnostics.PerformanceMonitoring")
@XmlType(name = "Device.Ghn.Diagnostics.PerformanceMonitoring")
@XmlAccessorType(XmlAccessType.FIELD)
public class PerformanceMonitoring {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * The interface over which the test is to be performed.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public String _interface;
	/**
	 * The MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiagnoseMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress diagnoseMACAddress;
	/**
	 * Time in seconds between automatic collection of performance monitoring data. A value of zero disables automatic collection of data.

          The node MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the device MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SampleInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long sampleInterval;
	/**
	 * The number of sub-carriers in a group to be used for averaging SNR values when providing SNR information for a channel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SNRGroupLength")
	@CWMPParameter(access = "readWrite")
	@Size(min = 256, max = 256)
	public Long snrGroupLength;
	/**
	 * Per-node G.hn performance monitoring results.

        When automatic collection is enabled, i.e. {{param|#.SampleInterval}} is non-zero, the "current" interval is defined by the most recent automatic sample and the most recent subsequent manual sample, if any.

        When automatic collection is disabled, i.e. SampleInterval is zero, the "current" interval is defined by the three most recent manual  samples.

        Note: Packets in statistics counters are Ethernet packets.
	 */
	@XmlElement(name = "Nodes")
	public Nodes nodes;
	/**
	 * Per-channel G.hn performance monitoring results.

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
	 * @since 2.8
	 * @return the value
	 */
	public DiagnosticsState getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the interface over which the test is to be performed.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the interface over which the test is to be performed.
	 *
	 * @since 2.8
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the interface over which the test is to be performed.
	 *
	 * @since 2.8
	 * @param _interface the input value
	 * @return this instance
	 */
	public PerformanceMonitoring with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getDiagnoseMACAddress() {
		return diagnoseMACAddress;
	}

	/**
	 * Set the MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 * @param diagnoseMACAddress the input value
	 */
	public void  setDiagnoseMACAddress(MACAddress diagnoseMACAddress) {
		this.diagnoseMACAddress = diagnoseMACAddress;
	}

	/**
	 * Set the MAC address of the originating G.hn interface of the link that is being diagnosed.

          Note: This MAC address might belong to another node of the domain.
	 *
	 * @since 2.8
	 * @param diagnoseMACAddress the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withDiagnoseMACAddress(MACAddress diagnoseMACAddress) {
		this.diagnoseMACAddress = diagnoseMACAddress;
		return this;
	}

	/**
	 * Get the time in seconds between automatic collection of performance monitoring data. A value of zero disables automatic collection of data.

          The node MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the device MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSampleInterval() {
		return sampleInterval;
	}

	/**
	 * Set the time in seconds between automatic collection of performance monitoring data. A value of zero disables automatic collection of data.

          The node MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the device MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.8
	 * @param sampleInterval the input value
	 */
	public void  setSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
	}

	/**
	 * Set the time in seconds between automatic collection of performance monitoring data. A value of zero disables automatic collection of data.

          The node MAY impose a minimum sample interval, in which case an attempt to set a (non-zero) interval that is less than this minimum MUST set the interval to the minimum and MUST NOT be regarded as an error.

          If SampleInterval is a simple fraction of a day, e.g. 900 (a quarter of an hour) or 3600 (an hour), the device MAY choose to align sample intervals with time of day, but is not required to do so.
	 *
	 * @since 2.8
	 * @param sampleInterval the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withSampleInterval(Long sampleInterval) {
		this.sampleInterval = sampleInterval;
		return this;
	}

	/**
	 * Get the number of sub-carriers in a group to be used for averaging SNR values when providing SNR information for a channel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSnrGroupLength() {
		return snrGroupLength;
	}

	/**
	 * Set the number of sub-carriers in a group to be used for averaging SNR values when providing SNR information for a channel.
	 *
	 * @since 2.8
	 * @param snrGroupLength the input value
	 */
	public void  setSnrGroupLength(Long snrGroupLength) {
		this.snrGroupLength = snrGroupLength;
	}

	/**
	 * Set the number of sub-carriers in a group to be used for averaging SNR values when providing SNR information for a channel.
	 *
	 * @since 2.8
	 * @param snrGroupLength the input value
	 * @return this instance
	 */
	public PerformanceMonitoring withSnrGroupLength(Long snrGroupLength) {
		this.snrGroupLength = snrGroupLength;
		return this;
	}

	/**
	 * Get the per-node G.hn performance monitoring results.

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
	 * Set the per-node G.hn performance monitoring results.

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
	 * Set the per-node G.hn performance monitoring results.

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
	 * Get the per-channel G.hn performance monitoring results.

        Note: channels are unidirectional.
	 *
	 * @return the value
	 */
	public Channels getChannels() {
		return channels;
	}

	/**
	 * Set the per-channel G.hn performance monitoring results.

        Note: channels are unidirectional.
	 *
	 * @param channels the input value
	 */
	public void  setChannels(Channels channels) {
		this.channels = channels;
	}

	/**
	 * Set the per-channel G.hn performance monitoring results.

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