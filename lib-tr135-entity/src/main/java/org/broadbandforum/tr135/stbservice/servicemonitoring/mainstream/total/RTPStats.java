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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Total RTP statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Total.RTPStats.")
@XmlRootElement(name = "STBService.ServiceMonitoring.MainStream.Total.RTPStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Total.RTPStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class RTPStats {

	/**
	 * The number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* RTP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TotalSeconds")
	public Long totalSeconds;
	/**
	 * Total number of RTP packets expected for this AV stream as described in {{bibref|RFC3550|A.3}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsExpected")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsExpected;
	/**
	 * Total number of packets discarded at the RTP layer for this AV stream because they were too late for playout, regardless of their being out of sequence or not.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsDiscarded")
	public Long packetsDiscarded;
	/**
	 * Total number of packets out of sequence at the RTP level for this AV stream, regardless of their being too late for playout or not. 

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsOutOfSequence")
	public Long packetsOutOfSequence;
	/**
	 * Total number of RTP packets received for this AV stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsReceived;
	/**
	 * Total number of RTP packets received for this AV stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsReceivedBeforeEC")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsReceivedBeforeEC;
	/**
	 * Total number of RTP packets lost for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsLost")
	public Long packetsLost;
	/**
	 * Total number of RTP packets lost for this stream. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsLostBeforeEC")
	public Long packetsLostBeforeEC;
	/**
	 * {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "PacketsLostByEventHistogram")
	public Long packetsLostByEventHistogram;
	/**
	 * {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "PacketsLostByEventHistogramBeforeEC")
	public Long packetsLostByEventHistogramBeforeEC;
	/**
	 * Total number of Loss Events for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LossEvents")
	public Long lossEvents;
	/**
	 * Total number of Loss Events for this stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LossEventsBeforeEC")
	public Long lossEventsBeforeEC;
	/**
	 * {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DelayBetweenLossEventsHistogram")
	public Long delayBetweenLossEventsHistogram;
	/**
	 * {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DelayBetweenLossEventsHistogramBeforeEC")
	public Long delayBetweenLossEventsHistogramBeforeEC;
	/**
	 * Total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossIndexCount")
	public Long severeLossIndexCount;
	/**
	 * Total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossIndexCountBeforeEC")
	public Long severeLossIndexCountBeforeEC;
	/**
	 * Total number of Loss Events longer than ''SevereLossMinLength''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossLengthCount")
	public Long severeLossLengthCount;
	/**
	 * Total number of Loss Events longer than ''SevereLossMinLength''. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossLengthCountBeforeEC")
	public Long severeLossLengthCountBeforeEC;
	/**
	 * {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DurationSevereLossEventsHistogram")
	public Long durationSevereLossEventsHistogram;
	/**
	 * {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DurationSevereLossEventsHistogramBeforeEC")
	public Long durationSevereLossEventsHistogramBeforeEC;
	/**
	 * Total number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}})

If RTP/AVPF is not used this parameter does not increment
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RetransmitTimeouts")
	public Long retransmitTimeouts;

	public RTPStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* RTP data collection is not appropriate or possible for this AV stream.
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

* RTP data collection is not appropriate or possible for this AV stream.
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

* RTP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 * @return this instance
	 */
	public RTPStats withTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
		return this;
	}

	/**
	 * Get the total number of RTP packets expected for this AV stream as described in {{bibref|RFC3550|A.3}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsExpected() {
		return packetsExpected;
	}

	/**
	 * Set the total number of RTP packets expected for this AV stream as described in {{bibref|RFC3550|A.3}}.
	 *
	 * @since 1.0
	 * @param packetsExpected the input value
	 */
	public void  setPacketsExpected(Long packetsExpected) {
		this.packetsExpected = packetsExpected;
	}

	/**
	 * Set the total number of RTP packets expected for this AV stream as described in {{bibref|RFC3550|A.3}}.
	 *
	 * @since 1.0
	 * @param packetsExpected the input value
	 * @return this instance
	 */
	public RTPStats withPacketsExpected(Long packetsExpected) {
		this.packetsExpected = packetsExpected;
		return this;
	}

	/**
	 * Get the total number of packets discarded at the RTP layer for this AV stream because they were too late for playout, regardless of their being out of sequence or not.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsDiscarded() {
		return packetsDiscarded;
	}

	/**
	 * Set the total number of packets discarded at the RTP layer for this AV stream because they were too late for playout, regardless of their being out of sequence or not.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsDiscarded the input value
	 */
	public void  setPacketsDiscarded(Long packetsDiscarded) {
		this.packetsDiscarded = packetsDiscarded;
	}

	/**
	 * Set the total number of packets discarded at the RTP layer for this AV stream because they were too late for playout, regardless of their being out of sequence or not.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsDiscarded the input value
	 * @return this instance
	 */
	public RTPStats withPacketsDiscarded(Long packetsDiscarded) {
		this.packetsDiscarded = packetsDiscarded;
		return this;
	}

	/**
	 * Get the total number of packets out of sequence at the RTP level for this AV stream, regardless of their being too late for playout or not. 

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsOutOfSequence() {
		return packetsOutOfSequence;
	}

	/**
	 * Set the total number of packets out of sequence at the RTP level for this AV stream, regardless of their being too late for playout or not. 

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsOutOfSequence the input value
	 */
	public void  setPacketsOutOfSequence(Long packetsOutOfSequence) {
		this.packetsOutOfSequence = packetsOutOfSequence;
	}

	/**
	 * Set the total number of packets out of sequence at the RTP level for this AV stream, regardless of their being too late for playout or not. 

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsOutOfSequence the input value
	 * @return this instance
	 */
	public RTPStats withPacketsOutOfSequence(Long packetsOutOfSequence) {
		this.packetsOutOfSequence = packetsOutOfSequence;
		return this;
	}

	/**
	 * Get the total number of RTP packets received for this AV stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of RTP packets received for this AV stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of RTP packets received for this AV stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public RTPStats withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of RTP packets received for this AV stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsReceivedBeforeEC() {
		return packetsReceivedBeforeEC;
	}

	/**
	 * Set the total number of RTP packets received for this AV stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param packetsReceivedBeforeEC the input value
	 */
	public void  setPacketsReceivedBeforeEC(Long packetsReceivedBeforeEC) {
		this.packetsReceivedBeforeEC = packetsReceivedBeforeEC;
	}

	/**
	 * Set the total number of RTP packets received for this AV stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param packetsReceivedBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withPacketsReceivedBeforeEC(Long packetsReceivedBeforeEC) {
		this.packetsReceivedBeforeEC = packetsReceivedBeforeEC;
		return this;
	}

	/**
	 * Get the total number of RTP packets lost for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsLost() {
		return packetsLost;
	}

	/**
	 * Set the total number of RTP packets lost for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsLost the input value
	 */
	public void  setPacketsLost(Long packetsLost) {
		this.packetsLost = packetsLost;
	}

	/**
	 * Set the total number of RTP packets lost for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsLost the input value
	 * @return this instance
	 */
	public RTPStats withPacketsLost(Long packetsLost) {
		this.packetsLost = packetsLost;
		return this;
	}

	/**
	 * Get the total number of RTP packets lost for this stream. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsLostBeforeEC() {
		return packetsLostBeforeEC;
	}

	/**
	 * Set the total number of RTP packets lost for this stream. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param packetsLostBeforeEC the input value
	 */
	public void  setPacketsLostBeforeEC(Long packetsLostBeforeEC) {
		this.packetsLostBeforeEC = packetsLostBeforeEC;
	}

	/**
	 * Set the total number of RTP packets lost for this stream. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param packetsLostBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withPacketsLostBeforeEC(Long packetsLostBeforeEC) {
		this.packetsLostBeforeEC = packetsLostBeforeEC;
		return this;
	}

	/**
	 * Get the {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getPacketsLostByEventHistogram() {
		return packetsLostByEventHistogram;
	}

	/**
	 * Set the {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogram the input value
	 */
	public void  setPacketsLostByEventHistogram(Long packetsLostByEventHistogram) {
		this.packetsLostByEventHistogram = packetsLostByEventHistogram;
	}

	/**
	 * Set the {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogram the input value
	 * @return this instance
	 */
	public RTPStats withPacketsLostByEventHistogram(Long packetsLostByEventHistogram) {
		this.packetsLostByEventHistogram = packetsLostByEventHistogram;
		return this;
	}

	/**
	 * Get the {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getPacketsLostByEventHistogramBeforeEC() {
		return packetsLostByEventHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogramBeforeEC the input value
	 */
	public void  setPacketsLostByEventHistogramBeforeEC(Long packetsLostByEventHistogramBeforeEC) {
		this.packetsLostByEventHistogramBeforeEC = packetsLostByEventHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Total number of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogramBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withPacketsLostByEventHistogramBeforeEC(Long packetsLostByEventHistogramBeforeEC) {
		this.packetsLostByEventHistogramBeforeEC = packetsLostByEventHistogramBeforeEC;
		return this;
	}

	/**
	 * Get the total number of Loss Events for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLossEvents() {
		return lossEvents;
	}

	/**
	 * Set the total number of Loss Events for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param lossEvents the input value
	 */
	public void  setLossEvents(Long lossEvents) {
		this.lossEvents = lossEvents;
	}

	/**
	 * Set the total number of Loss Events for this stream.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param lossEvents the input value
	 * @return this instance
	 */
	public RTPStats withLossEvents(Long lossEvents) {
		this.lossEvents = lossEvents;
		return this;
	}

	/**
	 * Get the total number of Loss Events for this stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLossEventsBeforeEC() {
		return lossEventsBeforeEC;
	}

	/**
	 * Set the total number of Loss Events for this stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param lossEventsBeforeEC the input value
	 */
	public void  setLossEventsBeforeEC(Long lossEventsBeforeEC) {
		this.lossEventsBeforeEC = lossEventsBeforeEC;
	}

	/**
	 * Set the total number of Loss Events for this stream.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param lossEventsBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withLossEventsBeforeEC(Long lossEventsBeforeEC) {
		this.lossEventsBeforeEC = lossEventsBeforeEC;
		return this;
	}

	/**
	 * Get the {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getDelayBetweenLossEventsHistogram() {
		return delayBetweenLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogram the input value
	 */
	public void  setDelayBetweenLossEventsHistogram(Long delayBetweenLossEventsHistogram) {
		this.delayBetweenLossEventsHistogram = delayBetweenLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogram the input value
	 * @return this instance
	 */
	public RTPStats withDelayBetweenLossEventsHistogram(Long delayBetweenLossEventsHistogram) {
		this.delayBetweenLossEventsHistogram = delayBetweenLossEventsHistogram;
		return this;
	}

	/**
	 * Get the {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getDelayBetweenLossEventsHistogramBeforeEC() {
		return delayBetweenLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogramBeforeEC the input value
	 */
	public void  setDelayBetweenLossEventsHistogramBeforeEC(Long delayBetweenLossEventsHistogramBeforeEC) {
		this.delayBetweenLossEventsHistogramBeforeEC = delayBetweenLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Total number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogramBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withDelayBetweenLossEventsHistogramBeforeEC(Long delayBetweenLossEventsHistogramBeforeEC) {
		this.delayBetweenLossEventsHistogramBeforeEC = delayBetweenLossEventsHistogramBeforeEC;
		return this;
	}

	/**
	 * Get the total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossIndexCount() {
		return severeLossIndexCount;
	}

	/**
	 * Set the total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param severeLossIndexCount the input value
	 */
	public void  setSevereLossIndexCount(Long severeLossIndexCount) {
		this.severeLossIndexCount = severeLossIndexCount;
	}

	/**
	 * Set the total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param severeLossIndexCount the input value
	 * @return this instance
	 */
	public RTPStats withSevereLossIndexCount(Long severeLossIndexCount) {
		this.severeLossIndexCount = severeLossIndexCount;
		return this;
	}

	/**
	 * Get the total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossIndexCountBeforeEC() {
		return severeLossIndexCountBeforeEC;
	}

	/**
	 * Set the total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param severeLossIndexCountBeforeEC the input value
	 */
	public void  setSevereLossIndexCountBeforeEC(Long severeLossIndexCountBeforeEC) {
		this.severeLossIndexCountBeforeEC = severeLossIndexCountBeforeEC;
	}

	/**
	 * Set the total number of Loss Events closer than ''SevereLossMinDistance''.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param severeLossIndexCountBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withSevereLossIndexCountBeforeEC(Long severeLossIndexCountBeforeEC) {
		this.severeLossIndexCountBeforeEC = severeLossIndexCountBeforeEC;
		return this;
	}

	/**
	 * Get the total number of Loss Events longer than ''SevereLossMinLength''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossLengthCount() {
		return severeLossLengthCount;
	}

	/**
	 * Set the total number of Loss Events longer than ''SevereLossMinLength''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param severeLossLengthCount the input value
	 */
	public void  setSevereLossLengthCount(Long severeLossLengthCount) {
		this.severeLossLengthCount = severeLossLengthCount;
	}

	/**
	 * Set the total number of Loss Events longer than ''SevereLossMinLength''.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param severeLossLengthCount the input value
	 * @return this instance
	 */
	public RTPStats withSevereLossLengthCount(Long severeLossLengthCount) {
		this.severeLossLengthCount = severeLossLengthCount;
		return this;
	}

	/**
	 * Get the total number of Loss Events longer than ''SevereLossMinLength''. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossLengthCountBeforeEC() {
		return severeLossLengthCountBeforeEC;
	}

	/**
	 * Set the total number of Loss Events longer than ''SevereLossMinLength''. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param severeLossLengthCountBeforeEC the input value
	 */
	public void  setSevereLossLengthCountBeforeEC(Long severeLossLengthCountBeforeEC) {
		this.severeLossLengthCountBeforeEC = severeLossLengthCountBeforeEC;
	}

	/**
	 * Set the total number of Loss Events longer than ''SevereLossMinLength''. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param severeLossLengthCountBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withSevereLossLengthCountBeforeEC(Long severeLossLengthCountBeforeEC) {
		this.severeLossLengthCountBeforeEC = severeLossLengthCountBeforeEC;
		return this;
	}

	/**
	 * Get the {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getDurationSevereLossEventsHistogram() {
		return durationSevereLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogram the input value
	 */
	public void  setDurationSevereLossEventsHistogram(Long durationSevereLossEventsHistogram) {
		this.durationSevereLossEventsHistogram = durationSevereLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogram the input value
	 * @return this instance
	 */
	public RTPStats withDurationSevereLossEventsHistogram(Long durationSevereLossEventsHistogram) {
		this.durationSevereLossEventsHistogram = durationSevereLossEventsHistogram;
		return this;
	}

	/**
	 * Get the {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getDurationSevereLossEventsHistogramBeforeEC() {
		return durationSevereLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogramBeforeEC the input value
	 */
	public void  setDurationSevereLossEventsHistogramBeforeEC(Long durationSevereLossEventsHistogramBeforeEC) {
		this.durationSevereLossEventsHistogramBeforeEC = durationSevereLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Total number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogramBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withDurationSevereLossEventsHistogramBeforeEC(Long durationSevereLossEventsHistogramBeforeEC) {
		this.durationSevereLossEventsHistogramBeforeEC = durationSevereLossEventsHistogramBeforeEC;
		return this;
	}

	/**
	 * Get the total number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}})

If RTP/AVPF is not used this parameter does not increment
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getRetransmitTimeouts() {
		return retransmitTimeouts;
	}

	/**
	 * Set the total number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}})

If RTP/AVPF is not used this parameter does not increment
	 *
	 * @since 1.0
	 * @param retransmitTimeouts the input value
	 */
	public void  setRetransmitTimeouts(Long retransmitTimeouts) {
		this.retransmitTimeouts = retransmitTimeouts;
	}

	/**
	 * Set the total number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}})

If RTP/AVPF is not used this parameter does not increment
	 *
	 * @since 1.0
	 * @param retransmitTimeouts the input value
	 * @return this instance
	 */
	public RTPStats withRetransmitTimeouts(Long retransmitTimeouts) {
		this.retransmitTimeouts = retransmitTimeouts;
		return this;
	}

	//</editor-fold>

}