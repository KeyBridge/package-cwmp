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
package org.broadbandforum.tr196.fapservice.transport.realtime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains performances relating to Real Time Transport using RTP.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.RealTime.Perf.")
@XmlRootElement(name = "FAPService.Transport.RealTime.Perf")
@XmlType(name = "FAPService.Transport.RealTime.Perf")
@XmlAccessorType(XmlAccessType.FIELD)
public class Perf {

	/**
	 * The number of Lost RTP packets in reception.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LostRcvPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long lostRcvPackets;
	/**
	 * The number of Far End Lost RTP packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LostFarEndPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long lostFarEndPackets;
	/**
	 * Total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Overruns")
	@CWMPParameter(activeNotify = "canDeny")
	public Long overruns;
	/**
	 * Total number of times the receive jitter buffer has underrun for a CS-domain RAB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Underruns")
	@CWMPParameter(activeNotify = "canDeny")
	public Long underruns;
	/**
	 * The mean Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeanRTT")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long meanRTT;
	/**
	 * The maximum Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxRTT")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long maxRTT;
	/**
	 * The mean receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeanReceiveJitter")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long meanReceiveJitter;
	/**
	 * The maximum receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxReceiveJitter")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long maxReceiveJitter;
	/**
	 * The mean far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeanFarEndJitter")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long meanFarEndJitter;
	/**
	 * The maximum far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFarEndJitter")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long maxFarEndJitter;

	public Perf() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of Lost RTP packets in reception.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLostRcvPackets() {
		return lostRcvPackets;
	}

	/**
	 * Set the number of Lost RTP packets in reception.
	 *
	 * @since 2.0
	 * @param lostRcvPackets the input value
	 */
	public void  setLostRcvPackets(Long lostRcvPackets) {
		this.lostRcvPackets = lostRcvPackets;
	}

	/**
	 * Set the number of Lost RTP packets in reception.
	 *
	 * @since 2.0
	 * @param lostRcvPackets the input value
	 * @return this instance
	 */
	public Perf withLostRcvPackets(Long lostRcvPackets) {
		this.lostRcvPackets = lostRcvPackets;
		return this;
	}

	/**
	 * Get the number of Far End Lost RTP packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLostFarEndPackets() {
		return lostFarEndPackets;
	}

	/**
	 * Set the number of Far End Lost RTP packets.
	 *
	 * @since 2.0
	 * @param lostFarEndPackets the input value
	 */
	public void  setLostFarEndPackets(Long lostFarEndPackets) {
		this.lostFarEndPackets = lostFarEndPackets;
	}

	/**
	 * Set the number of Far End Lost RTP packets.
	 *
	 * @since 2.0
	 * @param lostFarEndPackets the input value
	 * @return this instance
	 */
	public Perf withLostFarEndPackets(Long lostFarEndPackets) {
		this.lostFarEndPackets = lostFarEndPackets;
		return this;
	}

	/**
	 * Get the total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOverruns() {
		return overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 * @param overruns the input value
	 */
	public void  setOverruns(Long overruns) {
		this.overruns = overruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has overrun.
	 *
	 * @since 2.0
	 * @param overruns the input value
	 * @return this instance
	 */
	public Perf withOverruns(Long overruns) {
		this.overruns = overruns;
		return this;
	}

	/**
	 * Get the total number of times the receive jitter buffer has underrun for a CS-domain RAB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnderruns() {
		return underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun for a CS-domain RAB.
	 *
	 * @since 2.0
	 * @param underruns the input value
	 */
	public void  setUnderruns(Long underruns) {
		this.underruns = underruns;
	}

	/**
	 * Set the total number of times the receive jitter buffer has underrun for a CS-domain RAB.
	 *
	 * @since 2.0
	 * @param underruns the input value
	 * @return this instance
	 */
	public Perf withUnderruns(Long underruns) {
		this.underruns = underruns;
		return this;
	}

	/**
	 * Get the mean Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMeanRTT() {
		return meanRTT;
	}

	/**
	 * Set the mean Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param meanRTT the input value
	 */
	public void  setMeanRTT(Long meanRTT) {
		this.meanRTT = meanRTT;
	}

	/**
	 * Set the mean Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param meanRTT the input value
	 * @return this instance
	 */
	public Perf withMeanRTT(Long meanRTT) {
		this.meanRTT = meanRTT;
		return this;
	}

	/**
	 * Get the maximum Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxRTT() {
		return maxRTT;
	}

	/**
	 * Set the maximum Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param maxRTT the input value
	 */
	public void  setMaxRTT(Long maxRTT) {
		this.maxRTT = maxRTT;
	}

	/**
	 * Set the maximum Round Trip Time in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param maxRTT the input value
	 * @return this instance
	 */
	public Perf withMaxRTT(Long maxRTT) {
		this.maxRTT = maxRTT;
		return this;
	}

	/**
	 * Get the mean receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMeanReceiveJitter() {
		return meanReceiveJitter;
	}

	/**
	 * Set the mean receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param meanReceiveJitter the input value
	 */
	public void  setMeanReceiveJitter(Long meanReceiveJitter) {
		this.meanReceiveJitter = meanReceiveJitter;
	}

	/**
	 * Set the mean receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param meanReceiveJitter the input value
	 * @return this instance
	 */
	public Perf withMeanReceiveJitter(Long meanReceiveJitter) {
		this.meanReceiveJitter = meanReceiveJitter;
		return this;
	}

	/**
	 * Get the maximum receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxReceiveJitter() {
		return maxReceiveJitter;
	}

	/**
	 * Set the maximum receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param maxReceiveJitter the input value
	 */
	public void  setMaxReceiveJitter(Long maxReceiveJitter) {
		this.maxReceiveJitter = maxReceiveJitter;
	}

	/**
	 * Set the maximum receive jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param maxReceiveJitter the input value
	 * @return this instance
	 */
	public Perf withMaxReceiveJitter(Long maxReceiveJitter) {
		this.maxReceiveJitter = maxReceiveJitter;
		return this;
	}

	/**
	 * Get the mean far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMeanFarEndJitter() {
		return meanFarEndJitter;
	}

	/**
	 * Set the mean far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param meanFarEndJitter the input value
	 */
	public void  setMeanFarEndJitter(Long meanFarEndJitter) {
		this.meanFarEndJitter = meanFarEndJitter;
	}

	/**
	 * Set the mean far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param meanFarEndJitter the input value
	 * @return this instance
	 */
	public Perf withMeanFarEndJitter(Long meanFarEndJitter) {
		this.meanFarEndJitter = meanFarEndJitter;
		return this;
	}

	/**
	 * Get the maximum far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxFarEndJitter() {
		return maxFarEndJitter;
	}

	/**
	 * Set the maximum far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param maxFarEndJitter the input value
	 */
	public void  setMaxFarEndJitter(Long maxFarEndJitter) {
		this.maxFarEndJitter = maxFarEndJitter;
	}

	/**
	 * Set the maximum far end jitter in microseconds as computed by the source. {{bibref|RFC3550}}
	 *
	 * @since 2.0
	 * @param maxFarEndJitter the input value
	 * @return this instance
	 */
	public Perf withMaxFarEndJitter(Long maxFarEndJitter) {
		this.maxFarEndJitter = maxFarEndJitter;
		return this;
	}

	//</editor-fold>

}