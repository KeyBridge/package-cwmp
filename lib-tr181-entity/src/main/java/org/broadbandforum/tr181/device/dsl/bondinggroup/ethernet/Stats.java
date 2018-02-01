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
package org.broadbandforum.tr181.device.dsl.bondinggroup.ethernet;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * {{bibref|G.998.2}} Ethernet-based bonding statistics.

        These relate to the {{bibref|G.998.2}} PME (Physical Medium Entity) Aggregation Function (PAF) and to its upper layer interface.  PAF  lower layer interface statistics are in the {{object|##.BondedChannel.{i}.Ethernet.Stats}} objects.

        The CPE MUST reset the Stats parameters either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|##.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|##.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.BondingGroup.{i}.Ethernet.Stats.")
public class Stats {

	/**
	 * Number of PAF errors.  Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxErrors''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFErrors")
	public Long pafErrors;
	/**
	 * Number of PAF Small Fragment events.  Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxSmallFragments''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFSmallFragments")
	public Long pafSmallFragments;
	/**
	 * Number of PAF Large Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLargeFragments''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFLargeFragments")
	public Long pafLargeFragments;
	/**
	 * Number of PAF Bad Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxBadFragments''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFBadFragments")
	public Long pafBadFragments;
	/**
	 * Number of PAF Lost Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLostFragments''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFLostFragments")
	public Long pafLostFragments;
	/**
	 * Number of PAF Late Fragment events.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFLateFragments")
	public Long pafLateFragments;
	/**
	 * Number of PAF Lost Start events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostStarts''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFLostStarts")
	public Long pafLostStarts;
	/**
	 * Number of PAF Lost End events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostEnds''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFLostEnds")
	public Long pafLostEnds;
	/**
	 * Number of PAF Overflow events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxOverflows''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PAFOverflows")
	public Long pafOverflows;
	/**
	 * Number of pause frames sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PauseFramesSent")
	public Long pauseFramesSent;
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
	 * Get the number of PAF errors.  Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxErrors''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafErrors() {
		return pafErrors;
	}

	/**
	 * Set the number of PAF errors.  Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxErrors''.
	 *
	 * @since 2.0
	 * @param pafErrors the input value
	 */
	public void  setPafErrors(Long pafErrors) {
		this.pafErrors = pafErrors;
	}

	/**
	 * Set the number of PAF errors.  Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxErrors''.
	 *
	 * @since 2.0
	 * @param pafErrors the input value
	 * @return this instance
	 */
	public Stats withPafErrors(Long pafErrors) {
		this.pafErrors = pafErrors;
		return this;
	}

	/**
	 * Get the number of PAF Small Fragment events.  Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxSmallFragments''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafSmallFragments() {
		return pafSmallFragments;
	}

	/**
	 * Set the number of PAF Small Fragment events.  Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxSmallFragments''.
	 *
	 * @since 2.0
	 * @param pafSmallFragments the input value
	 */
	public void  setPafSmallFragments(Long pafSmallFragments) {
		this.pafSmallFragments = pafSmallFragments;
	}

	/**
	 * Set the number of PAF Small Fragment events.  Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxSmallFragments''.
	 *
	 * @since 2.0
	 * @param pafSmallFragments the input value
	 * @return this instance
	 */
	public Stats withPafSmallFragments(Long pafSmallFragments) {
		this.pafSmallFragments = pafSmallFragments;
		return this;
	}

	/**
	 * Get the number of PAF Large Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLargeFragments''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafLargeFragments() {
		return pafLargeFragments;
	}

	/**
	 * Set the number of PAF Large Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLargeFragments''.
	 *
	 * @since 2.0
	 * @param pafLargeFragments the input value
	 */
	public void  setPafLargeFragments(Long pafLargeFragments) {
		this.pafLargeFragments = pafLargeFragments;
	}

	/**
	 * Set the number of PAF Large Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLargeFragments''.
	 *
	 * @since 2.0
	 * @param pafLargeFragments the input value
	 * @return this instance
	 */
	public Stats withPafLargeFragments(Long pafLargeFragments) {
		this.pafLargeFragments = pafLargeFragments;
		return this;
	}

	/**
	 * Get the number of PAF Bad Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxBadFragments''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafBadFragments() {
		return pafBadFragments;
	}

	/**
	 * Set the number of PAF Bad Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxBadFragments''.
	 *
	 * @since 2.0
	 * @param pafBadFragments the input value
	 */
	public void  setPafBadFragments(Long pafBadFragments) {
		this.pafBadFragments = pafBadFragments;
	}

	/**
	 * Set the number of PAF Bad Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxBadFragments''.
	 *
	 * @since 2.0
	 * @param pafBadFragments the input value
	 * @return this instance
	 */
	public Stats withPafBadFragments(Long pafBadFragments) {
		this.pafBadFragments = pafBadFragments;
		return this;
	}

	/**
	 * Get the number of PAF Lost Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLostFragments''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafLostFragments() {
		return pafLostFragments;
	}

	/**
	 * Set the number of PAF Lost Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLostFragments''.
	 *
	 * @since 2.0
	 * @param pafLostFragments the input value
	 */
	public void  setPafLostFragments(Long pafLostFragments) {
		this.pafLostFragments = pafLostFragments;
	}

	/**
	 * Set the number of PAF Lost Fragment events. Corresponds to {{bibref|TR-159}}  ''oBondETH.aEthRxLostFragments''.
	 *
	 * @since 2.0
	 * @param pafLostFragments the input value
	 * @return this instance
	 */
	public Stats withPafLostFragments(Long pafLostFragments) {
		this.pafLostFragments = pafLostFragments;
		return this;
	}

	/**
	 * Get the number of PAF Late Fragment events.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafLateFragments() {
		return pafLateFragments;
	}

	/**
	 * Set the number of PAF Late Fragment events.
	 *
	 * @since 2.0
	 * @param pafLateFragments the input value
	 */
	public void  setPafLateFragments(Long pafLateFragments) {
		this.pafLateFragments = pafLateFragments;
	}

	/**
	 * Set the number of PAF Late Fragment events.
	 *
	 * @since 2.0
	 * @param pafLateFragments the input value
	 * @return this instance
	 */
	public Stats withPafLateFragments(Long pafLateFragments) {
		this.pafLateFragments = pafLateFragments;
		return this;
	}

	/**
	 * Get the number of PAF Lost Start events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostStarts''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafLostStarts() {
		return pafLostStarts;
	}

	/**
	 * Set the number of PAF Lost Start events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostStarts''.
	 *
	 * @since 2.0
	 * @param pafLostStarts the input value
	 */
	public void  setPafLostStarts(Long pafLostStarts) {
		this.pafLostStarts = pafLostStarts;
	}

	/**
	 * Set the number of PAF Lost Start events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostStarts''.
	 *
	 * @since 2.0
	 * @param pafLostStarts the input value
	 * @return this instance
	 */
	public Stats withPafLostStarts(Long pafLostStarts) {
		this.pafLostStarts = pafLostStarts;
		return this;
	}

	/**
	 * Get the number of PAF Lost End events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostEnds''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafLostEnds() {
		return pafLostEnds;
	}

	/**
	 * Set the number of PAF Lost End events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostEnds''.
	 *
	 * @since 2.0
	 * @param pafLostEnds the input value
	 */
	public void  setPafLostEnds(Long pafLostEnds) {
		this.pafLostEnds = pafLostEnds;
	}

	/**
	 * Set the number of PAF Lost End events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxLostEnds''.
	 *
	 * @since 2.0
	 * @param pafLostEnds the input value
	 * @return this instance
	 */
	public Stats withPafLostEnds(Long pafLostEnds) {
		this.pafLostEnds = pafLostEnds;
		return this;
	}

	/**
	 * Get the number of PAF Overflow events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxOverflows''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPafOverflows() {
		return pafOverflows;
	}

	/**
	 * Set the number of PAF Overflow events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxOverflows''.
	 *
	 * @since 2.0
	 * @param pafOverflows the input value
	 */
	public void  setPafOverflows(Long pafOverflows) {
		this.pafOverflows = pafOverflows;
	}

	/**
	 * Set the number of PAF Overflow events. Corresponds to {{bibref|TR-159}} ''oBondETH.aEthRxOverflows''.
	 *
	 * @since 2.0
	 * @param pafOverflows the input value
	 * @return this instance
	 */
	public Stats withPafOverflows(Long pafOverflows) {
		this.pafOverflows = pafOverflows;
		return this;
	}

	/**
	 * Get the number of pause frames sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPauseFramesSent() {
		return pauseFramesSent;
	}

	/**
	 * Set the number of pause frames sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 * @param pauseFramesSent the input value
	 */
	public void  setPauseFramesSent(Long pauseFramesSent) {
		this.pauseFramesSent = pauseFramesSent;
	}

	/**
	 * Set the number of pause frames sent, i.e. on the transmit side of the interface.
	 *
	 * @since 2.0
	 * @param pauseFramesSent the input value
	 * @return this instance
	 */
	public Stats withPauseFramesSent(Long pauseFramesSent) {
		this.pauseFramesSent = pauseFramesSent;
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