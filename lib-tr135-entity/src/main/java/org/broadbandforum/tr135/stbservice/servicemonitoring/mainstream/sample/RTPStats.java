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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.sample;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * RTP Sample statistics for this ''ServiceMonitoring'' main stream instance.

If no EC is applied the ''BeforeEC'' statistics provide the same values as the corresponding statistics, e.g. when there is no EC, {{param|PacketsReceivedBeforeEC}} = {{param|PacketsReceived}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.RTPStats.")
@XmlRootElement(name = "STBService.ServiceMonitoring.MainStream.Sample.RTPStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Sample.RTPStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class RTPStats {

	/**
	 * Each entry is the number of seconds during which RTP data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* RTP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the total number of RTP packets expected for this AV stream during the sample interval as described in {{bibref|RFC3550|A.3}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsExpected")
	public Long packetsExpected;
	/**
	 * Each entry is the number of packets that were discarded at the RTP layer for this AV stream during the sample interval because they were too late for playout, regardless of their being out of sequence or not. 

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsDiscarded")
	public Long packetsDiscarded;
	/**
	 * Each entry is the number of packets out of sequence at the RTP level for this AV stream during the sample interval, regardless of their being too late for playout or not.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsOutOfSequence")
	public Long packetsOutOfSequence;
	/**
	 * Each entry is the total number of RTP packets received for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsReceived")
	public Long packetsReceived;
	/**
	 * Each entry is the total number of RTP packets received for this AV stream during the sample interval. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsReceivedBeforeEC")
	public Long packetsReceivedBeforeEC;
	/**
	 * Each entry is the number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}}) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "RetransmitTimeouts")
	public Long retransmitTimeouts;
	/**
	 * Each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsLost")
	public Long packetsLost;
	/**
	 * Each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketsLostBeforeEC")
	public Long packetsLostBeforeEC;
	/**
	 * {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "PacketsLostByEventHistogram")
	@XmlList
	public Collection<String> packetsLostByEventHistogram;
	/**
	 * {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "PacketsLostByEventHistogramBeforeEC")
	@XmlList
	public Collection<String> packetsLostByEventHistogramBeforeEC;
	/**
	 * Each entry is the total number of Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LossEvents")
	public Long lossEvents;
	/**
	 * Each entry is the total number of Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LossEventsBeforeEC")
	public Long lossEventsBeforeEC;
	/**
	 * {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DelayBetweenLossEventsHistogram")
	@XmlList
	public Collection<String> delayBetweenLossEventsHistogram;
	/**
	 * {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DelayBetweenLossEventsHistogramBeforeEC")
	@XmlList
	public Collection<String> delayBetweenLossEventsHistogramBeforeEC;
	/**
	 * Each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossIndexCount")
	public Long severeLossIndexCount;
	/**
	 * Each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossIndexCountBeforeEC")
	public Long severeLossIndexCountBeforeEC;
	/**
	 * Each entry is the average distance in RTP packets between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageLossDistance")
	public Long averageLossDistance;
	/**
	 * Each entry is the average distance in RTP packets between consecutive loss events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageLossDistanceBeforeEC")
	public Long averageLossDistanceBeforeEC;
	/**
	 * Each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumLossDistance")
	public Long minimumLossDistance;
	/**
	 * Each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumLossDistanceBeforeEC")
	public Long minimumLossDistanceBeforeEC;
	/**
	 * Each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossLengthCount")
	public Long severeLossLengthCount;
	/**
	 * Each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SevereLossLengthCountBeforeEC")
	public Long severeLossLengthCountBeforeEC;
	/**
	 * {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DurationSevereLossEventsHistogram")
	@XmlList
	public Collection<String> durationSevereLossEventsHistogram;
	/**
	 * {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DurationSevereLossEventsHistogramBeforeEC")
	@XmlList
	public Collection<String> durationSevereLossEventsHistogramBeforeEC;
	/**
	 * Each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumLossPeriod")
	public Long maximumLossPeriod;
	/**
	 * Each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumLossPeriodBeforeEC")
	public Long maximumLossPeriodBeforeEC;
	/**
	 * Each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageLossPeriod")
	public Long averageLossPeriod;
	/**
	 * Each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageLossPeriodBeforeEC")
	public Long averageLossPeriodBeforeEC;
	/**
	 * Each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumLossPeriod")
	public Long minimumLossPeriod;
	/**
	 * Each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumLossPeriodBeforeEC")
	public Long minimumLossPeriodBeforeEC;

	public RTPStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which RTP data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* RTP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which RTP data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* RTP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which RTP data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* RTP data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public RTPStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the total number of RTP packets expected for this AV stream during the sample interval as described in {{bibref|RFC3550|A.3}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsExpected() {
		return packetsExpected;
	}

	/**
	 * Set the each entry is the total number of RTP packets expected for this AV stream during the sample interval as described in {{bibref|RFC3550|A.3}}.
	 *
	 * @since 1.0
	 * @param packetsExpected the input value
	 */
	public void  setPacketsExpected(Long packetsExpected) {
		this.packetsExpected = packetsExpected;
	}

	/**
	 * Set the each entry is the total number of RTP packets expected for this AV stream during the sample interval as described in {{bibref|RFC3550|A.3}}.
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
	 * Get the each entry is the number of packets that were discarded at the RTP layer for this AV stream during the sample interval because they were too late for playout, regardless of their being out of sequence or not. 

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsDiscarded() {
		return packetsDiscarded;
	}

	/**
	 * Set the each entry is the number of packets that were discarded at the RTP layer for this AV stream during the sample interval because they were too late for playout, regardless of their being out of sequence or not. 

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsDiscarded the input value
	 */
	public void  setPacketsDiscarded(Long packetsDiscarded) {
		this.packetsDiscarded = packetsDiscarded;
	}

	/**
	 * Set the each entry is the number of packets that were discarded at the RTP layer for this AV stream during the sample interval because they were too late for playout, regardless of their being out of sequence or not. 

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
	 * Get the each entry is the number of packets out of sequence at the RTP level for this AV stream during the sample interval, regardless of their being too late for playout or not.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsOutOfSequence() {
		return packetsOutOfSequence;
	}

	/**
	 * Set the each entry is the number of packets out of sequence at the RTP level for this AV stream during the sample interval, regardless of their being too late for playout or not.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsOutOfSequence the input value
	 */
	public void  setPacketsOutOfSequence(Long packetsOutOfSequence) {
		this.packetsOutOfSequence = packetsOutOfSequence;
	}

	/**
	 * Set the each entry is the number of packets out of sequence at the RTP level for this AV stream during the sample interval, regardless of their being too late for playout or not.

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
	 * Get the each entry is the total number of RTP packets received for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the each entry is the total number of RTP packets received for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the each entry is the total number of RTP packets received for this AV stream during the sample interval.

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
	 * Get the each entry is the total number of RTP packets received for this AV stream during the sample interval. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsReceivedBeforeEC() {
		return packetsReceivedBeforeEC;
	}

	/**
	 * Set the each entry is the total number of RTP packets received for this AV stream during the sample interval. 

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param packetsReceivedBeforeEC the input value
	 */
	public void  setPacketsReceivedBeforeEC(Long packetsReceivedBeforeEC) {
		this.packetsReceivedBeforeEC = packetsReceivedBeforeEC;
	}

	/**
	 * Set the each entry is the total number of RTP packets received for this AV stream during the sample interval. 

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
	 * Get the each entry is the number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}}) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getRetransmitTimeouts() {
		return retransmitTimeouts;
	}

	/**
	 * Set the each entry is the number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}}) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param retransmitTimeouts the input value
	 */
	public void  setRetransmitTimeouts(Long retransmitTimeouts) {
		this.retransmitTimeouts = retransmitTimeouts;
	}

	/**
	 * Set the each entry is the number of RTP/AVPF retransmission timeouts ({{bibref|RFC4585}}, {{bibref|RFC4588}}) for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param retransmitTimeouts the input value
	 * @return this instance
	 */
	public RTPStats withRetransmitTimeouts(Long retransmitTimeouts) {
		this.retransmitTimeouts = retransmitTimeouts;
		return this;
	}

	/**
	 * Get the each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsLost() {
		return packetsLost;
	}

	/**
	 * Set the each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param packetsLost the input value
	 */
	public void  setPacketsLost(Long packetsLost) {
		this.packetsLost = packetsLost;
	}

	/**
	 * Set the each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

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
	 * Get the each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketsLostBeforeEC() {
		return packetsLostBeforeEC;
	}

	/**
	 * Set the each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param packetsLostBeforeEC the input value
	 */
	public void  setPacketsLostBeforeEC(Long packetsLostBeforeEC) {
		this.packetsLostBeforeEC = packetsLostBeforeEC;
	}

	/**
	 * Set the each entry is the total number of RTP packets lost for this AV stream during the sample interval.

Calculated by looking for missing RTP sequence headers.  

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
	 * Get the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getPacketsLostByEventHistogram() {
		if (this.packetsLostByEventHistogram == null){ this.packetsLostByEventHistogram=new ArrayList<>();}
		return packetsLostByEventHistogram;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogram the input value
	 */
	public void  setPacketsLostByEventHistogram(Collection<String> packetsLostByEventHistogram) {
		this.packetsLostByEventHistogram = packetsLostByEventHistogram;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public RTPStats withPacketsLostByEventHistogram(String string) {
		getPacketsLostByEventHistogram().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getPacketsLostByEventHistogramBeforeEC() {
		if (this.packetsLostByEventHistogramBeforeEC == null){ this.packetsLostByEventHistogramBeforeEC=new ArrayList<>();}
		return packetsLostByEventHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param packetsLostByEventHistogramBeforeEC the input value
	 */
	public void  setPacketsLostByEventHistogramBeforeEC(Collection<String> packetsLostByEventHistogramBeforeEC) {
		this.packetsLostByEventHistogramBeforeEC = packetsLostByEventHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of loss events counted by their length in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|##.PacketsLostByEventHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public RTPStats withPacketsLostByEventHistogramBeforeEC(String string) {
		getPacketsLostByEventHistogramBeforeEC().add(string);
		return this;
	}

	/**
	 * Get the each entry is the total number of Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLossEvents() {
		return lossEvents;
	}

	/**
	 * Set the each entry is the total number of Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param lossEvents the input value
	 */
	public void  setLossEvents(Long lossEvents) {
		this.lossEvents = lossEvents;
	}

	/**
	 * Set the each entry is the total number of Loss Events for this AV stream during the sample interval.

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
	 * Get the each entry is the total number of Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLossEventsBeforeEC() {
		return lossEventsBeforeEC;
	}

	/**
	 * Set the each entry is the total number of Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param lossEventsBeforeEC the input value
	 */
	public void  setLossEventsBeforeEC(Long lossEventsBeforeEC) {
		this.lossEventsBeforeEC = lossEventsBeforeEC;
	}

	/**
	 * Set the each entry is the total number of Loss Events for this AV stream during the sample interval.

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
	 * Get the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getDelayBetweenLossEventsHistogram() {
		if (this.delayBetweenLossEventsHistogram == null){ this.delayBetweenLossEventsHistogram=new ArrayList<>();}
		return delayBetweenLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogram the input value
	 */
	public void  setDelayBetweenLossEventsHistogram(Collection<String> delayBetweenLossEventsHistogram) {
		this.delayBetweenLossEventsHistogram = delayBetweenLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public RTPStats withDelayBetweenLossEventsHistogram(String string) {
		getDelayBetweenLossEventsHistogram().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getDelayBetweenLossEventsHistogramBeforeEC() {
		if (this.delayBetweenLossEventsHistogramBeforeEC == null){ this.delayBetweenLossEventsHistogramBeforeEC=new ArrayList<>();}
		return delayBetweenLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param delayBetweenLossEventsHistogramBeforeEC the input value
	 */
	public void  setDelayBetweenLossEventsHistogramBeforeEC(Collection<String> delayBetweenLossEventsHistogramBeforeEC) {
		this.delayBetweenLossEventsHistogramBeforeEC = delayBetweenLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of times that the delay (in milliseconds) between two consecutive loss events belongs to each time interval defined by {{param|##.DelayBetweenLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public RTPStats withDelayBetweenLossEventsHistogramBeforeEC(String string) {
		getDelayBetweenLossEventsHistogramBeforeEC().add(string);
		return this;
	}

	/**
	 * Get the each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossIndexCount() {
		return severeLossIndexCount;
	}

	/**
	 * Set the each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param severeLossIndexCount the input value
	 */
	public void  setSevereLossIndexCount(Long severeLossIndexCount) {
		this.severeLossIndexCount = severeLossIndexCount;
	}

	/**
	 * Set the each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

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
	 * Get the each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossIndexCountBeforeEC() {
		return severeLossIndexCountBeforeEC;
	}

	/**
	 * Set the each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param severeLossIndexCountBeforeEC the input value
	 */
	public void  setSevereLossIndexCountBeforeEC(Long severeLossIndexCountBeforeEC) {
		this.severeLossIndexCountBeforeEC = severeLossIndexCountBeforeEC;
	}

	/**
	 * Set the each entry is the total number of Loss Events that occurred at a distance shorter than ''SevereLossMinDistance'' from the previous Loss Event for this AV stream during the sample interval.

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
	 * Get the each entry is the average distance in RTP packets between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAverageLossDistance() {
		return averageLossDistance;
	}

	/**
	 * Set the each entry is the average distance in RTP packets between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param averageLossDistance the input value
	 */
	public void  setAverageLossDistance(Long averageLossDistance) {
		this.averageLossDistance = averageLossDistance;
	}

	/**
	 * Set the each entry is the average distance in RTP packets between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param averageLossDistance the input value
	 * @return this instance
	 */
	public RTPStats withAverageLossDistance(Long averageLossDistance) {
		this.averageLossDistance = averageLossDistance;
		return this;
	}

	/**
	 * Get the each entry is the average distance in RTP packets between consecutive loss events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAverageLossDistanceBeforeEC() {
		return averageLossDistanceBeforeEC;
	}

	/**
	 * Set the each entry is the average distance in RTP packets between consecutive loss events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param averageLossDistanceBeforeEC the input value
	 */
	public void  setAverageLossDistanceBeforeEC(Long averageLossDistanceBeforeEC) {
		this.averageLossDistanceBeforeEC = averageLossDistanceBeforeEC;
	}

	/**
	 * Set the each entry is the average distance in RTP packets between consecutive loss events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param averageLossDistanceBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withAverageLossDistanceBeforeEC(Long averageLossDistanceBeforeEC) {
		this.averageLossDistanceBeforeEC = averageLossDistanceBeforeEC;
		return this;
	}

	/**
	 * Get the each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumLossDistance() {
		return minimumLossDistance;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param minimumLossDistance the input value
	 */
	public void  setMinimumLossDistance(Long minimumLossDistance) {
		this.minimumLossDistance = minimumLossDistance;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param minimumLossDistance the input value
	 * @return this instance
	 */
	public RTPStats withMinimumLossDistance(Long minimumLossDistance) {
		this.minimumLossDistance = minimumLossDistance;
		return this;
	}

	/**
	 * Get the each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumLossDistanceBeforeEC() {
		return minimumLossDistanceBeforeEC;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param minimumLossDistanceBeforeEC the input value
	 */
	public void  setMinimumLossDistanceBeforeEC(Long minimumLossDistanceBeforeEC) {
		this.minimumLossDistanceBeforeEC = minimumLossDistanceBeforeEC;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest distance between consecutive Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param minimumLossDistanceBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withMinimumLossDistanceBeforeEC(Long minimumLossDistanceBeforeEC) {
		this.minimumLossDistanceBeforeEC = minimumLossDistanceBeforeEC;
		return this;
	}

	/**
	 * Get the each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossLengthCount() {
		return severeLossLengthCount;
	}

	/**
	 * Set the each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param severeLossLengthCount the input value
	 */
	public void  setSevereLossLengthCount(Long severeLossLengthCount) {
		this.severeLossLengthCount = severeLossLengthCount;
	}

	/**
	 * Set the each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

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
	 * Get the each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSevereLossLengthCountBeforeEC() {
		return severeLossLengthCountBeforeEC;
	}

	/**
	 * Set the each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param severeLossLengthCountBeforeEC the input value
	 */
	public void  setSevereLossLengthCountBeforeEC(Long severeLossLengthCountBeforeEC) {
		this.severeLossLengthCountBeforeEC = severeLossLengthCountBeforeEC;
	}

	/**
	 * Set the each entry is the total number of Loss Events with length in RTP packets greater than ''SevereLossMinLength'' for this AV stream during the sample interval.

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
	 * Get the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getDurationSevereLossEventsHistogram() {
		if (this.durationSevereLossEventsHistogram == null){ this.durationSevereLossEventsHistogram=new ArrayList<>();}
		return durationSevereLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogram the input value
	 */
	public void  setDurationSevereLossEventsHistogram(Collection<String> durationSevereLossEventsHistogram) {
		this.durationSevereLossEventsHistogram = durationSevereLossEventsHistogram;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public RTPStats withDurationSevereLossEventsHistogram(String string) {
		getDurationSevereLossEventsHistogram().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Collection<String> getDurationSevereLossEventsHistogramBeforeEC() {
		if (this.durationSevereLossEventsHistogramBeforeEC == null){ this.durationSevereLossEventsHistogramBeforeEC=new ArrayList<>();}
		return durationSevereLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param durationSevereLossEventsHistogramBeforeEC the input value
	 */
	public void  setDurationSevereLossEventsHistogramBeforeEC(Collection<String> durationSevereLossEventsHistogramBeforeEC) {
		this.durationSevereLossEventsHistogramBeforeEC = durationSevereLossEventsHistogramBeforeEC;
	}

	/**
	 * Set the {{list}} Each list item is a comma-separated list of unsigned integers that represents, for a sample interval, a histogram of the number of severe loss events counted by their duration (in milliseconds) according to the intervals defined by {{param|##.DurationSevereLossEventsHistogramIntervals}}.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.3
	 * @param string the input value
	 * @return this instance
	 */
	public RTPStats withDurationSevereLossEventsHistogramBeforeEC(String string) {
		getDurationSevereLossEventsHistogramBeforeEC().add(string);
		return this;
	}

	/**
	 * Get the each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumLossPeriod() {
		return maximumLossPeriod;
	}

	/**
	 * Set the each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param maximumLossPeriod the input value
	 */
	public void  setMaximumLossPeriod(Long maximumLossPeriod) {
		this.maximumLossPeriod = maximumLossPeriod;
	}

	/**
	 * Set the each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param maximumLossPeriod the input value
	 * @return this instance
	 */
	public RTPStats withMaximumLossPeriod(Long maximumLossPeriod) {
		this.maximumLossPeriod = maximumLossPeriod;
		return this;
	}

	/**
	 * Get the each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumLossPeriodBeforeEC() {
		return maximumLossPeriodBeforeEC;
	}

	/**
	 * Set the each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param maximumLossPeriodBeforeEC the input value
	 */
	public void  setMaximumLossPeriodBeforeEC(Long maximumLossPeriodBeforeEC) {
		this.maximumLossPeriodBeforeEC = maximumLossPeriodBeforeEC;
	}

	/**
	 * Set the each entry is the length in RTP packets of the longest Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param maximumLossPeriodBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withMaximumLossPeriodBeforeEC(Long maximumLossPeriodBeforeEC) {
		this.maximumLossPeriodBeforeEC = maximumLossPeriodBeforeEC;
		return this;
	}

	/**
	 * Get the each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAverageLossPeriod() {
		return averageLossPeriod;
	}

	/**
	 * Set the each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param averageLossPeriod the input value
	 */
	public void  setAverageLossPeriod(Long averageLossPeriod) {
		this.averageLossPeriod = averageLossPeriod;
	}

	/**
	 * Set the each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param averageLossPeriod the input value
	 * @return this instance
	 */
	public RTPStats withAverageLossPeriod(Long averageLossPeriod) {
		this.averageLossPeriod = averageLossPeriod;
		return this;
	}

	/**
	 * Get the each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAverageLossPeriodBeforeEC() {
		return averageLossPeriodBeforeEC;
	}

	/**
	 * Set the each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param averageLossPeriodBeforeEC the input value
	 */
	public void  setAverageLossPeriodBeforeEC(Long averageLossPeriodBeforeEC) {
		this.averageLossPeriodBeforeEC = averageLossPeriodBeforeEC;
	}

	/**
	 * Set the each entry is the average length in RTP packets of Loss Events for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param averageLossPeriodBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withAverageLossPeriodBeforeEC(Long averageLossPeriodBeforeEC) {
		this.averageLossPeriodBeforeEC = averageLossPeriodBeforeEC;
		return this;
	}

	/**
	 * Get the each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumLossPeriod() {
		return minimumLossPeriod;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param minimumLossPeriod the input value
	 */
	public void  setMinimumLossPeriod(Long minimumLossPeriod) {
		this.minimumLossPeriod = minimumLossPeriod;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected when no EC is applied or after any EC if available.
	 *
	 * @since 1.0
	 * @param minimumLossPeriod the input value
	 * @return this instance
	 */
	public RTPStats withMinimumLossPeriod(Long minimumLossPeriod) {
		this.minimumLossPeriod = minimumLossPeriod;
		return this;
	}

	/**
	 * Get the each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumLossPeriodBeforeEC() {
		return minimumLossPeriodBeforeEC;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param minimumLossPeriodBeforeEC the input value
	 */
	public void  setMinimumLossPeriodBeforeEC(Long minimumLossPeriodBeforeEC) {
		this.minimumLossPeriodBeforeEC = minimumLossPeriodBeforeEC;
	}

	/**
	 * Set the each entry is the length in RTP packets of the shortest RTP Loss Event for this AV stream during the sample interval.

These statistics are collected before any EC, if available, is applied.
	 *
	 * @since 1.0
	 * @param minimumLossPeriodBeforeEC the input value
	 * @return this instance
	 */
	public RTPStats withMinimumLossPeriodBeforeEC(Long minimumLossPeriodBeforeEC) {
		this.minimumLossPeriodBeforeEC = minimumLossPeriodBeforeEC;
		return this;
	}

	//</editor-fold>

}