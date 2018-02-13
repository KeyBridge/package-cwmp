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
package org.broadbandforum.tr181.device.ghn.diagnostics.performancemonitoring;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.ghn.diagnostics.performancemonitoring.nodes.Node;

	/**
	 * Per-node G.hn performance monitoring results.

        When automatic collection is enabled, i.e. {{param|#.SampleInterval}} is non-zero, the "current" interval is defined by the most recent automatic sample and the most recent subsequent manual sample, if any.

        When automatic collection is disabled, i.e. SampleInterval is zero, the "current" interval is defined by the three most recent manual  samples.

        Note: Packets in statistics counters are Ethernet packets.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Nodes.")
@XmlRootElement(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Nodes")
@XmlType(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Nodes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Nodes {

	/**
	 * Start time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval started at the most recent automatic sample.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval started two manual samples ago.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "CurrentStart")
	public LocalDateTime currentStart;
	/**
	 * End time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval ended at the most recent manual sample since the most recent automatic sample.  If there has been no such manual sample, the current interval is empty.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval ended at the most recent manual sample.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "CurrentEnd")
	public LocalDateTime currentEnd;
	/**
	 * Per-node G.hn performance monitoring results during the current sample interval. Each table entry contains the results collected between the G.hn nodes with MAC addresses {{param|##.DiagnoseMACAddress}}) and {{param|DestinationMACAddress}}).

        Note: Packet counters indicate the number of packets received between {{param|#.CurrentStart}} and {{param|#.CurrentEnd}}.
	 */
	@XmlElementWrapper(name = "Nodes")
	@XmlElement(name = "Node")
	@CWMPParameter(minEntries = 1)
	public Collection<Node> nodes;

	public Nodes() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the start time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval started at the most recent automatic sample.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval started two manual samples ago.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public LocalDateTime getCurrentStart() {
		return currentStart;
	}

	/**
	 * Set the start time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval started at the most recent automatic sample.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval started two manual samples ago.
	 *
	 * @since 2.8
	 * @param currentStart the input value
	 */
	public void  setCurrentStart(LocalDateTime currentStart) {
		this.currentStart = currentStart;
	}

	/**
	 * Set the start time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval started at the most recent automatic sample.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval started two manual samples ago.
	 *
	 * @since 2.8
	 * @param currentStart the input value
	 * @return this instance
	 */
	public Nodes withCurrentStart(LocalDateTime currentStart) {
		this.currentStart = currentStart;
		return this;
	}

	/**
	 * Get the end time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval ended at the most recent manual sample since the most recent automatic sample.  If there has been no such manual sample, the current interval is empty.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval ended at the most recent manual sample.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public LocalDateTime getCurrentEnd() {
		return currentEnd;
	}

	/**
	 * Set the end time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval ended at the most recent manual sample since the most recent automatic sample.  If there has been no such manual sample, the current interval is empty.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval ended at the most recent manual sample.
	 *
	 * @since 2.8
	 * @param currentEnd the input value
	 */
	public void  setCurrentEnd(LocalDateTime currentEnd) {
		this.currentEnd = currentEnd;
	}

	/**
	 * Set the end time for the current interval.

          When automatic collection is enabled, i.e. SampleInterval is non-zero, the current interval ended at the most recent manual sample since the most recent automatic sample.  If there has been no such manual sample, the current interval is empty.

          When automatic collection is disabled, i.e. SampleInterval is zero, the current interval ended at the most recent manual sample.
	 *
	 * @since 2.8
	 * @param currentEnd the input value
	 * @return this instance
	 */
	public Nodes withCurrentEnd(LocalDateTime currentEnd) {
		this.currentEnd = currentEnd;
		return this;
	}

	/**
	 * Get the per-node G.hn performance monitoring results during the current sample interval. Each table entry contains the results collected between the G.hn nodes with MAC addresses {{param|##.DiagnoseMACAddress}}) and {{param|DestinationMACAddress}}).

        Note: Packet counters indicate the number of packets received between {{param|#.CurrentStart}} and {{param|#.CurrentEnd}}.
	 *
	 * @return the value
	 */
	public Collection<Node> getNodes() {
		if (this.nodes == null){ this.nodes=new ArrayList<>();}
		return nodes;
	}

	/**
	 * Set the per-node G.hn performance monitoring results during the current sample interval. Each table entry contains the results collected between the G.hn nodes with MAC addresses {{param|##.DiagnoseMACAddress}}) and {{param|DestinationMACAddress}}).

        Note: Packet counters indicate the number of packets received between {{param|#.CurrentStart}} and {{param|#.CurrentEnd}}.
	 *
	 * @param nodes the input value
	 */
	public void  setNodes(Collection<Node> nodes) {
		this.nodes = nodes;
	}

	/**
	 * Set the per-node G.hn performance monitoring results during the current sample interval. Each table entry contains the results collected between the G.hn nodes with MAC addresses {{param|##.DiagnoseMACAddress}}) and {{param|DestinationMACAddress}}).

        Note: Packet counters indicate the number of packets received between {{param|#.CurrentStart}} and {{param|#.CurrentEnd}}.
	 *
	 * @param node the input value
	 * @return this instance
	 */
	public Nodes withNode(Node node) {
		getNodes().add(node);
		return this;
	}

	//</editor-fold>

}