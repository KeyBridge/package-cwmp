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
	 * Total MPEG2-TS statistics for this ''ServiceMonitoring'' main stream instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.Total.MPEG2TSStats.")
@XmlRootElement(name = "MPEG2TSStats")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.Total.MPEG2TSStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class MPEG2TSStats {

	/**
	 * The number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* MPEG2 TS data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TotalSeconds")
	public Long totalSeconds;
	/**
	 * Total number of MPEG2-TS packets received for this AV stream.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TSPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long tspacketsReceived;
	/**
	 * Total number of MPEG2-TS packets with an invalid transport sync byte received for this AV stream.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TSSyncByteErrorCount")
	public Long tssyncByteErrorCount;
	/**
	 * Total number of MPEG2-TS Loss of Synchronization Events for this AV stream.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TSSyncLossCount")
	public Long tssyncLossCount;
	/**
	 * Total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

These statistics are collected when no CA decryption scheme is in use or after any CA decryption if in use.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PacketDiscontinuityCounter")
	public Long packetDiscontinuityCounter;
	/**
	 * Total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

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
	 * Get the number of seconds during which data was collected for this AV stream since last reset

Each statistics category (Dejittering, RTP etc) has its own {{param}} parameter, which indicates the number of seconds during which data was collected for that statistics category since last reset.

Individual {{param}} values can be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}, for several reasons, including:

* Any of the reasons for which the {{param}} values might be less than {{param|.ServiceMonitoring.MainStream.{i}.Total.ResetTime}}.

* MPEG2 TS data collection is not appropriate or possible for this AV stream.
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

* MPEG2 TS data collection is not appropriate or possible for this AV stream.
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

* MPEG2 TS data collection is not appropriate or possible for this AV stream.
	 *
	 * @since 1.1
	 * @param totalSeconds the input value
	 * @return this instance
	 */
	public MPEG2TSStats withTotalSeconds(Long totalSeconds) {
		this.totalSeconds = totalSeconds;
		return this;
	}

	/**
	 * Get the total number of MPEG2-TS packets received for this AV stream.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTspacketsReceived() {
		return tspacketsReceived;
	}

	/**
	 * Set the total number of MPEG2-TS packets received for this AV stream.
	 *
	 * @since 1.0
	 * @param tspacketsReceived the input value
	 */
	public void  setTspacketsReceived(Long tspacketsReceived) {
		this.tspacketsReceived = tspacketsReceived;
	}

	/**
	 * Set the total number of MPEG2-TS packets received for this AV stream.
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
	 * Get the total number of MPEG2-TS packets with an invalid transport sync byte received for this AV stream.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTssyncByteErrorCount() {
		return tssyncByteErrorCount;
	}

	/**
	 * Set the total number of MPEG2-TS packets with an invalid transport sync byte received for this AV stream.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @param tssyncByteErrorCount the input value
	 */
	public void  setTssyncByteErrorCount(Long tssyncByteErrorCount) {
		this.tssyncByteErrorCount = tssyncByteErrorCount;
	}

	/**
	 * Set the total number of MPEG2-TS packets with an invalid transport sync byte received for this AV stream.

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
	 * Get the total number of MPEG2-TS Loss of Synchronization Events for this AV stream.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTssyncLossCount() {
		return tssyncLossCount;
	}

	/**
	 * Set the total number of MPEG2-TS Loss of Synchronization Events for this AV stream.

Not meaningful when MPEG2-TS is transported over IP.
	 *
	 * @since 1.0
	 * @param tssyncLossCount the input value
	 */
	public void  setTssyncLossCount(Long tssyncLossCount) {
		this.tssyncLossCount = tssyncLossCount;
	}

	/**
	 * Set the total number of MPEG2-TS Loss of Synchronization Events for this AV stream.

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
	 * Get the total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

These statistics are collected when no CA decryption scheme is in use or after any CA decryption if in use.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketDiscontinuityCounter() {
		return packetDiscontinuityCounter;
	}

	/**
	 * Set the total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

These statistics are collected when no CA decryption scheme is in use or after any CA decryption if in use.
	 *
	 * @since 1.0
	 * @param packetDiscontinuityCounter the input value
	 */
	public void  setPacketDiscontinuityCounter(Long packetDiscontinuityCounter) {
		this.packetDiscontinuityCounter = packetDiscontinuityCounter;
	}

	/**
	 * Set the total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

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
	 * Get the total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

These statistics are collected before any CA decryption scheme, if used, is applied.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPacketDiscontinuityCounterBeforeCA() {
		return packetDiscontinuityCounterBeforeCA;
	}

	/**
	 * Set the total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

These statistics are collected before any CA decryption scheme, if used, is applied.
	 *
	 * @since 1.0
	 * @param packetDiscontinuityCounterBeforeCA the input value
	 */
	public void  setPacketDiscontinuityCounterBeforeCA(Long packetDiscontinuityCounterBeforeCA) {
		this.packetDiscontinuityCounterBeforeCA = packetDiscontinuityCounterBeforeCA;
	}

	/**
	 * Set the total number of MPEG2-TS Discontinuity errors that have been captured for this AV stream. This parameter accumulates all of the discontinuities observed for all currently monitored PIDs.

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