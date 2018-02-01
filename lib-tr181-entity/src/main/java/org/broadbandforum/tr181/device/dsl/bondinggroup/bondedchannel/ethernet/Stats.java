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
package org.broadbandforum.tr181.device.dsl.bondinggroup.bondedchannel.ethernet;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Per-channel {{bibref|G.998.2}} Ethernet-based bonding statistics.

        These relate to the {{bibref|G.998.2}} PME (Physical Medium Entity) Aggregation Function (PAF) lower layer (per-channel) interfaces.

        The CPE MUST reset the Stats parameters either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|###.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|###.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.BondingGroup.{i}.BondedChannel.{i}.Ethernet.Stats.")
public class Stats {

	/**
	 * Number of underflow errors sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UnderflowErrorsSent")
	public Long underflowErrorsSent;
	/**
	 * Number of CRC errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CRCErrorsReceived")
	public Long crcErrorsReceived;
	/**
	 * Number of alignment errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AlignmentErrorsReceived")
	public Long alignmentErrorsReceived;
	/**
	 * Number of short packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ShortPacketsReceived")
	public Long shortPacketsReceived;
	/**
	 * Number of long packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LongPacketsReceived")
	public Long longPacketsReceived;
	/**
	 * Number of overflow errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OverflowErrorsReceived")
	public Long overflowErrorsReceived;
	/**
	 * Number of pause frames received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PauseFramesReceived")
	public Long pauseFramesReceived;
	/**
	 * Number of frames dropped, e.g. because the receive queue is full.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FramesDropped")
	public Long framesDropped;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of underflow errors sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnderflowErrorsSent() {
		return underflowErrorsSent;
	}

	/**
	 * Set the number of underflow errors sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 * @param underflowErrorsSent the input value
	 */
	public void  setUnderflowErrorsSent(Long underflowErrorsSent) {
		this.underflowErrorsSent = underflowErrorsSent;
	}

	/**
	 * Set the number of underflow errors sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 * @param underflowErrorsSent the input value
	 * @return this instance
	 */
	public Stats withUnderflowErrorsSent(Long underflowErrorsSent) {
		this.underflowErrorsSent = underflowErrorsSent;
		return this;
	}

	/**
	 * Get the number of CRC errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCrcErrorsReceived() {
		return crcErrorsReceived;
	}

	/**
	 * Set the number of CRC errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param crcErrorsReceived the input value
	 */
	public void  setCrcErrorsReceived(Long crcErrorsReceived) {
		this.crcErrorsReceived = crcErrorsReceived;
	}

	/**
	 * Set the number of CRC errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param crcErrorsReceived the input value
	 * @return this instance
	 */
	public Stats withCrcErrorsReceived(Long crcErrorsReceived) {
		this.crcErrorsReceived = crcErrorsReceived;
		return this;
	}

	/**
	 * Get the number of alignment errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAlignmentErrorsReceived() {
		return alignmentErrorsReceived;
	}

	/**
	 * Set the number of alignment errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param alignmentErrorsReceived the input value
	 */
	public void  setAlignmentErrorsReceived(Long alignmentErrorsReceived) {
		this.alignmentErrorsReceived = alignmentErrorsReceived;
	}

	/**
	 * Set the number of alignment errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param alignmentErrorsReceived the input value
	 * @return this instance
	 */
	public Stats withAlignmentErrorsReceived(Long alignmentErrorsReceived) {
		this.alignmentErrorsReceived = alignmentErrorsReceived;
		return this;
	}

	/**
	 * Get the number of short packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getShortPacketsReceived() {
		return shortPacketsReceived;
	}

	/**
	 * Set the number of short packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param shortPacketsReceived the input value
	 */
	public void  setShortPacketsReceived(Long shortPacketsReceived) {
		this.shortPacketsReceived = shortPacketsReceived;
	}

	/**
	 * Set the number of short packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param shortPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withShortPacketsReceived(Long shortPacketsReceived) {
		this.shortPacketsReceived = shortPacketsReceived;
		return this;
	}

	/**
	 * Get the number of long packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLongPacketsReceived() {
		return longPacketsReceived;
	}

	/**
	 * Set the number of long packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param longPacketsReceived the input value
	 */
	public void  setLongPacketsReceived(Long longPacketsReceived) {
		this.longPacketsReceived = longPacketsReceived;
	}

	/**
	 * Set the number of long packets received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param longPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withLongPacketsReceived(Long longPacketsReceived) {
		this.longPacketsReceived = longPacketsReceived;
		return this;
	}

	/**
	 * Get the number of overflow errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOverflowErrorsReceived() {
		return overflowErrorsReceived;
	}

	/**
	 * Set the number of overflow errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param overflowErrorsReceived the input value
	 */
	public void  setOverflowErrorsReceived(Long overflowErrorsReceived) {
		this.overflowErrorsReceived = overflowErrorsReceived;
	}

	/**
	 * Set the number of overflow errors received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param overflowErrorsReceived the input value
	 * @return this instance
	 */
	public Stats withOverflowErrorsReceived(Long overflowErrorsReceived) {
		this.overflowErrorsReceived = overflowErrorsReceived;
		return this;
	}

	/**
	 * Get the number of pause frames received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPauseFramesReceived() {
		return pauseFramesReceived;
	}

	/**
	 * Set the number of pause frames received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param pauseFramesReceived the input value
	 */
	public void  setPauseFramesReceived(Long pauseFramesReceived) {
		this.pauseFramesReceived = pauseFramesReceived;
	}

	/**
	 * Set the number of pause frames received, i.e. on the receive side of the interface.
	 *
	 * @since 2.0
	 * @param pauseFramesReceived the input value
	 * @return this instance
	 */
	public Stats withPauseFramesReceived(Long pauseFramesReceived) {
		this.pauseFramesReceived = pauseFramesReceived;
		return this;
	}

	/**
	 * Get the number of frames dropped, e.g. because the receive queue is full.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFramesDropped() {
		return framesDropped;
	}

	/**
	 * Set the number of frames dropped, e.g. because the receive queue is full.
	 *
	 * @since 2.0
	 * @param framesDropped the input value
	 */
	public void  setFramesDropped(Long framesDropped) {
		this.framesDropped = framesDropped;
	}

	/**
	 * Set the number of frames dropped, e.g. because the receive queue is full.
	 *
	 * @since 2.0
	 * @param framesDropped the input value
	 * @return this instance
	 */
	public Stats withFramesDropped(Long framesDropped) {
		this.framesDropped = framesDropped;
		return this;
	}

	//</editor-fold>

}