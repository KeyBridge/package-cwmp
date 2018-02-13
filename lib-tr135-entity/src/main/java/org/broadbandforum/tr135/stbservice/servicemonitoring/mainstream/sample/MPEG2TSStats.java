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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * MPEG2-TS Sample statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Sample.MPEG2TSStats.")
@XmlRootElement(name = "MPEG2TSStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Sample.MPEG2TSStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class MPEG2TSStats {

	/**
	 * Each entry is the number of seconds during which MPEG2-TS data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* MPEG2-TS data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SampleSeconds")
	public Long sampleSeconds;
	/**
	 * Each entry is the total number of MPEG2-TS packets received for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TSPacketsReceived")
	public Long tspacketsReceived;
	/**
	 * Each entry is the total number of good MPEG2-TS packets removed from the buffer for this AV stream during the sample interval.

Packets received minus packets drained provides an indication how close the buffer came to over or under running during the sample interval.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TSPacketsDrained")
	public Long tspacketsDrained;
	/**
	 * Each entry is the total number of MPEG2-TS packets with an invalid transport sync byte for this AV stream during the sample interval.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TSSyncByteErrorCount")
	public Long tssyncByteErrorCount;
	/**
	 * Each entry is the total number of MPEG2-TS Loss of Synchronization Events for this AV stream during the sample interval. 

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TSSyncLossCount")
	public Long tssyncLossCount;
	/**
	 * Each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected when no CA decryption scheme is in use or after any CA decryption if in use.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketDiscontinuityCounter")
	public Long packetDiscontinuityCounter;
	/**
	 * Each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected before any CA decryption scheme, if used, is applied.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketDiscontinuityCounterBeforeCA")
	public Long packetDiscontinuityCounterBeforeCA;

	public MPEG2TSStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the number of seconds during which MPEG2-TS data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* MPEG2-TS data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which MPEG2-TS data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* MPEG2-TS data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the each entry is the number of seconds during which MPEG2-TS data was collected for this AV stream during the sample interval.

Individual {{param}} values can be less than the sample interval, for several reasons, including:

* Any of the reasons for which the {{param|.ServiceMonitoring.MainStream.{i}.Sample.SampleSeconds}} values might be less than the sample interval.

* MPEG2-TS data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.0
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public MPEG2TSStats withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the each entry is the total number of MPEG2-TS packets received for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTspacketsReceived() {
		return tspacketsReceived;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS packets received for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param tspacketsReceived the input value
	 */
	public void  setTspacketsReceived(Long tspacketsReceived) {
		this.tspacketsReceived = tspacketsReceived;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS packets received for this AV stream during the sample interval.
	 *
	 * @since 1.0
	 * @param tspacketsReceived the input value
	 * @return this instance
	 */
	public MPEG2TSStats withTspacketsReceived(Long tspacketsReceived) {
		this.tspacketsReceived = tspacketsReceived;
		return this;
	}

	/**
	 * Get the each entry is the total number of good MPEG2-TS packets removed from the buffer for this AV stream during the sample interval.

Packets received minus packets drained provides an indication how close the buffer came to over or under running during the sample interval.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTspacketsDrained() {
		return tspacketsDrained;
	}

	/**
	 * Set the each entry is the total number of good MPEG2-TS packets removed from the buffer for this AV stream during the sample interval.

Packets received minus packets drained provides an indication how close the buffer came to over or under running during the sample interval.
	 *
	 * @since 1.0
	 * @param tspacketsDrained the input value
	 */
	public void  setTspacketsDrained(Long tspacketsDrained) {
		this.tspacketsDrained = tspacketsDrained;
	}

	/**
	 * Set the each entry is the total number of good MPEG2-TS packets removed from the buffer for this AV stream during the sample interval.

Packets received minus packets drained provides an indication how close the buffer came to over or under running during the sample interval.
	 *
	 * @since 1.0
	 * @param tspacketsDrained the input value
	 * @return this instance
	 */
	public MPEG2TSStats withTspacketsDrained(Long tspacketsDrained) {
		this.tspacketsDrained = tspacketsDrained;
		return this;
	}

	/**
	 * Get the each entry is the total number of MPEG2-TS packets with an invalid transport sync byte for this AV stream during the sample interval.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTssyncByteErrorCount() {
		return tssyncByteErrorCount;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS packets with an invalid transport sync byte for this AV stream during the sample interval.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @param tssyncByteErrorCount the input value
	 */
	public void  setTssyncByteErrorCount(Long tssyncByteErrorCount) {
		this.tssyncByteErrorCount = tssyncByteErrorCount;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS packets with an invalid transport sync byte for this AV stream during the sample interval.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @param tssyncByteErrorCount the input value
	 * @return this instance
	 */
	public MPEG2TSStats withTssyncByteErrorCount(Long tssyncByteErrorCount) {
		this.tssyncByteErrorCount = tssyncByteErrorCount;
		return this;
	}

	/**
	 * Get the each entry is the total number of MPEG2-TS Loss of Synchronization Events for this AV stream during the sample interval. 

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTssyncLossCount() {
		return tssyncLossCount;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS Loss of Synchronization Events for this AV stream during the sample interval. 

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @param tssyncLossCount the input value
	 */
	public void  setTssyncLossCount(Long tssyncLossCount) {
		this.tssyncLossCount = tssyncLossCount;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS Loss of Synchronization Events for this AV stream during the sample interval. 

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @param tssyncLossCount the input value
	 * @return this instance
	 */
	public MPEG2TSStats withTssyncLossCount(Long tssyncLossCount) {
		this.tssyncLossCount = tssyncLossCount;
		return this;
	}

	/**
	 * Get the each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected when no CA decryption scheme is in use or after any CA decryption if in use.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketDiscontinuityCounter() {
		return packetDiscontinuityCounter;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected when no CA decryption scheme is in use or after any CA decryption if in use.
	 *
	 * @since 1.0
	 * @param packetDiscontinuityCounter the input value
	 */
	public void  setPacketDiscontinuityCounter(Long packetDiscontinuityCounter) {
		this.packetDiscontinuityCounter = packetDiscontinuityCounter;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected when no CA decryption scheme is in use or after any CA decryption if in use.
	 *
	 * @since 1.0
	 * @param packetDiscontinuityCounter the input value
	 * @return this instance
	 */
	public MPEG2TSStats withPacketDiscontinuityCounter(Long packetDiscontinuityCounter) {
		this.packetDiscontinuityCounter = packetDiscontinuityCounter;
		return this;
	}

	/**
	 * Get the each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected before any CA decryption scheme, if used, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketDiscontinuityCounterBeforeCA() {
		return packetDiscontinuityCounterBeforeCA;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected before any CA decryption scheme, if used, is applied.
	 *
	 * @since 1.0
	 * @param packetDiscontinuityCounterBeforeCA the input value
	 */
	public void  setPacketDiscontinuityCounterBeforeCA(Long packetDiscontinuityCounterBeforeCA) {
		this.packetDiscontinuityCounterBeforeCA = packetDiscontinuityCounterBeforeCA;
	}

	/**
	 * Set the each entry is the total number of MPEG2-TS Discontinuity errors that were captured for this AV stream during the sample interval.

These statistics are collected before any CA decryption scheme, if used, is applied.
	 *
	 * @since 1.0
	 * @param packetDiscontinuityCounterBeforeCA the input value
	 * @return this instance
	 */
	public MPEG2TSStats withPacketDiscontinuityCounterBeforeCA(Long packetDiscontinuityCounterBeforeCA) {
		this.packetDiscontinuityCounterBeforeCA = packetDiscontinuityCounterBeforeCA;
		return this;
	}

	//</editor-fold>

}