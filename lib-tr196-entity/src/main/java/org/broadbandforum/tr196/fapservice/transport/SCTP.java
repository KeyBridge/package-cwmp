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
package org.broadbandforum.tr196.fapservice.transport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.transport.sctp.Assoc;

	/**
	 * This object contains parameters relating to SCTP as a transport protocol.

SCTP is defined in {{bibref|RFC4960}} and {{bibref|RFC3873}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.SCTP.")
@XmlRootElement(name = "FAPService.Transport.SCTP")
@XmlType(name = "FAPService.Transport.SCTP")
@XmlAccessorType(XmlAccessType.FIELD)
public class SCTP {

	/**
	 * Enables or disables the whole SCTP object and allows the setup or release of SCTP associations and their related streams.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Heartbeat interval in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HBInterval")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "seconds")
	@Size(min = 1)
	public Long hbinterval = 30L;
	/**
	 * Maximum number of consecutive retransmissions to a peer before an endpoint considers that the peer is unreachable and closes the association.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxAssociationRetransmits")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Long maxAssociationRetransmits = 10L;
	/**
	 * Number of retransmission per connection-attempt.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxInitRetransmits")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Long maxInitRetransmits = 8L;
	/**
	 * Maximum retransmission per destination address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxPathRetransmits")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Long maxPathRetransmits = 5L;
	/**
	 * Initial value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RTOInitial")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "milliseconds")
	public Long rtoInitial = 3000L;
	/**
	 * Maximum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RTOMax")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "milliseconds")
	public Long rtoMax = 6000L;
	/**
	 * Minimum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.

The value of this parameter MUST be lower than or equal to {{param|RTOMax}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RTOMin")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "milliseconds")
	public Long rtoMin = 1000L;
	/**
	 * Valid cookie life in the 4-way start-up handshake procedure in milliseconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ValCookieLife")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "milliseconds")
	public Long valCookieLife = 60000L;
	/**
	 * The number of correctly formed SCTP packets, including the proper checksum, but for which the receiver was unable to identify an appropriate association.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutOfBlues")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outOfBlues;
	/**
	 * The number of SCTP packets received with an invalid checksum.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChecksumErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public Long checksumErrors;
	/**
	 * The number of SCTP control chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutCtrlChunks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outCtrlChunks;
	/**
	 * The number of SCTP ordered data chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutOrderChunks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outOrderChunks;
	/**
	 * The number of SCTP unordered chunks (data chunks in which the U bit is set to 1) sent (retransmissions are not included).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutUnorderChunks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outUnorderChunks;
	/**
	 * The number of SCTP control chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InCtrlChunks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long inctrlChunks;
	/**
	 * The number of SCTP ordered data chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InOrderChunks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long inorderChunks;
	/**
	 * The number of SCTP unordered chunks (data chunks in which the U bit is set to 1) received (no duplicate chunks included).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InUnorderChunks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long inunorderChunks;
	/**
	 * The number of user messages that have been sent fragmented.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FragUsrMsgs")
	@CWMPParameter(activeNotify = "canDeny")
	public Long fragUsrMsgs;
	/**
	 * The number of user messages that have been received fragmented and submitted to the reassembly process.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReasmUsrMsgs")
	@CWMPParameter(activeNotify = "canDeny")
	public Long reasmUsrMsgs;
	/**
	 * The number of SCTP packets sent. Retransmitted DATA chunks are included.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutSCTPPacks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outSCTPPacks;
	/**
	 * The number of SCTP packets received. Duplicates are included.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InSCTPPacks")
	@CWMPParameter(activeNotify = "canDeny")
	public Long insCTPPacks;
	/**
	 * The time of the last discontinuity.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Discontinuity")
	public LocalDateTime discontinuity;
	/**
	 * SCTP Association Table
	 */
	@XmlElementWrapper(name = "Assocs")
	@XmlElement(name = "Assoc")
	public Collection<Assoc> assocs;

	public SCTP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the whole SCTP object and allows the setup or release of SCTP associations and their related streams.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the whole SCTP object and allows the setup or release of SCTP associations and their related streams.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the whole SCTP object and allows the setup or release of SCTP associations and their related streams.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SCTP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the heartbeat interval in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHbinterval() {
		return hbinterval;
	}

	/**
	 * Set the heartbeat interval in seconds.
	 *
	 * @since 2.0
	 * @param hbinterval the input value
	 */
	public void  setHbinterval(Long hbinterval) {
		this.hbinterval = hbinterval;
	}

	/**
	 * Set the heartbeat interval in seconds.
	 *
	 * @since 2.0
	 * @param hbinterval the input value
	 * @return this instance
	 */
	public SCTP withHbinterval(Long hbinterval) {
		this.hbinterval = hbinterval;
		return this;
	}

	/**
	 * Get the maximum number of consecutive retransmissions to a peer before an endpoint considers that the peer is unreachable and closes the association.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxAssociationRetransmits() {
		return maxAssociationRetransmits;
	}

	/**
	 * Set the maximum number of consecutive retransmissions to a peer before an endpoint considers that the peer is unreachable and closes the association.
	 *
	 * @since 2.0
	 * @param maxAssociationRetransmits the input value
	 */
	public void  setMaxAssociationRetransmits(Long maxAssociationRetransmits) {
		this.maxAssociationRetransmits = maxAssociationRetransmits;
	}

	/**
	 * Set the maximum number of consecutive retransmissions to a peer before an endpoint considers that the peer is unreachable and closes the association.
	 *
	 * @since 2.0
	 * @param maxAssociationRetransmits the input value
	 * @return this instance
	 */
	public SCTP withMaxAssociationRetransmits(Long maxAssociationRetransmits) {
		this.maxAssociationRetransmits = maxAssociationRetransmits;
		return this;
	}

	/**
	 * Get the number of retransmission per connection-attempt.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxInitRetransmits() {
		return maxInitRetransmits;
	}

	/**
	 * Set the number of retransmission per connection-attempt.
	 *
	 * @since 2.0
	 * @param maxInitRetransmits the input value
	 */
	public void  setMaxInitRetransmits(Long maxInitRetransmits) {
		this.maxInitRetransmits = maxInitRetransmits;
	}

	/**
	 * Set the number of retransmission per connection-attempt.
	 *
	 * @since 2.0
	 * @param maxInitRetransmits the input value
	 * @return this instance
	 */
	public SCTP withMaxInitRetransmits(Long maxInitRetransmits) {
		this.maxInitRetransmits = maxInitRetransmits;
		return this;
	}

	/**
	 * Get the maximum retransmission per destination address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxPathRetransmits() {
		return maxPathRetransmits;
	}

	/**
	 * Set the maximum retransmission per destination address.
	 *
	 * @since 2.0
	 * @param maxPathRetransmits the input value
	 */
	public void  setMaxPathRetransmits(Long maxPathRetransmits) {
		this.maxPathRetransmits = maxPathRetransmits;
	}

	/**
	 * Set the maximum retransmission per destination address.
	 *
	 * @since 2.0
	 * @param maxPathRetransmits the input value
	 * @return this instance
	 */
	public SCTP withMaxPathRetransmits(Long maxPathRetransmits) {
		this.maxPathRetransmits = maxPathRetransmits;
		return this;
	}

	/**
	 * Get the initial value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRtoInitial() {
		return rtoInitial;
	}

	/**
	 * Set the initial value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 * @param rtoInitial the input value
	 */
	public void  setRtoInitial(Long rtoInitial) {
		this.rtoInitial = rtoInitial;
	}

	/**
	 * Set the initial value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 * @param rtoInitial the input value
	 * @return this instance
	 */
	public SCTP withRtoInitial(Long rtoInitial) {
		this.rtoInitial = rtoInitial;
		return this;
	}

	/**
	 * Get the maximum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRtoMax() {
		return rtoMax;
	}

	/**
	 * Set the maximum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 * @param rtoMax the input value
	 */
	public void  setRtoMax(Long rtoMax) {
		this.rtoMax = rtoMax;
	}

	/**
	 * Set the maximum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.
	 *
	 * @since 2.0
	 * @param rtoMax the input value
	 * @return this instance
	 */
	public SCTP withRtoMax(Long rtoMax) {
		this.rtoMax = rtoMax;
		return this;
	}

	/**
	 * Get the minimum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.

The value of this parameter MUST be lower than or equal to {{param|RTOMax}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRtoMin() {
		return rtoMin;
	}

	/**
	 * Set the minimum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.

The value of this parameter MUST be lower than or equal to {{param|RTOMax}}.
	 *
	 * @since 2.0
	 * @param rtoMin the input value
	 */
	public void  setRtoMin(Long rtoMin) {
		this.rtoMin = rtoMin;
	}

	/**
	 * Set the minimum value for Retransmit timeout in milliseconds. A retransmission time value of zero means immediate retransmission.

The value of this parameter MUST be lower than or equal to {{param|RTOMax}}.
	 *
	 * @since 2.0
	 * @param rtoMin the input value
	 * @return this instance
	 */
	public SCTP withRtoMin(Long rtoMin) {
		this.rtoMin = rtoMin;
		return this;
	}

	/**
	 * Get the valid cookie life in the 4-way start-up handshake procedure in milliseconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getValCookieLife() {
		return valCookieLife;
	}

	/**
	 * Set the valid cookie life in the 4-way start-up handshake procedure in milliseconds.
	 *
	 * @since 2.0
	 * @param valCookieLife the input value
	 */
	public void  setValCookieLife(Long valCookieLife) {
		this.valCookieLife = valCookieLife;
	}

	/**
	 * Set the valid cookie life in the 4-way start-up handshake procedure in milliseconds.
	 *
	 * @since 2.0
	 * @param valCookieLife the input value
	 * @return this instance
	 */
	public SCTP withValCookieLife(Long valCookieLife) {
		this.valCookieLife = valCookieLife;
		return this;
	}

	/**
	 * Get the number of correctly formed SCTP packets, including the proper checksum, but for which the receiver was unable to identify an appropriate association.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutOfBlues() {
		return outOfBlues;
	}

	/**
	 * Set the number of correctly formed SCTP packets, including the proper checksum, but for which the receiver was unable to identify an appropriate association.
	 *
	 * @since 2.0
	 * @param outOfBlues the input value
	 */
	public void  setOutOfBlues(Long outOfBlues) {
		this.outOfBlues = outOfBlues;
	}

	/**
	 * Set the number of correctly formed SCTP packets, including the proper checksum, but for which the receiver was unable to identify an appropriate association.
	 *
	 * @since 2.0
	 * @param outOfBlues the input value
	 * @return this instance
	 */
	public SCTP withOutOfBlues(Long outOfBlues) {
		this.outOfBlues = outOfBlues;
		return this;
	}

	/**
	 * Get the number of SCTP packets received with an invalid checksum.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getChecksumErrors() {
		return checksumErrors;
	}

	/**
	 * Set the number of SCTP packets received with an invalid checksum.
	 *
	 * @since 2.0
	 * @param checksumErrors the input value
	 */
	public void  setChecksumErrors(Long checksumErrors) {
		this.checksumErrors = checksumErrors;
	}

	/**
	 * Set the number of SCTP packets received with an invalid checksum.
	 *
	 * @since 2.0
	 * @param checksumErrors the input value
	 * @return this instance
	 */
	public SCTP withChecksumErrors(Long checksumErrors) {
		this.checksumErrors = checksumErrors;
		return this;
	}

	/**
	 * Get the number of SCTP control chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutCtrlChunks() {
		return outCtrlChunks;
	}

	/**
	 * Set the number of SCTP control chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @param outCtrlChunks the input value
	 */
	public void  setOutCtrlChunks(Long outCtrlChunks) {
		this.outCtrlChunks = outCtrlChunks;
	}

	/**
	 * Set the number of SCTP control chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @param outCtrlChunks the input value
	 * @return this instance
	 */
	public SCTP withOutCtrlChunks(Long outCtrlChunks) {
		this.outCtrlChunks = outCtrlChunks;
		return this;
	}

	/**
	 * Get the number of SCTP ordered data chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutOrderChunks() {
		return outOrderChunks;
	}

	/**
	 * Set the number of SCTP ordered data chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @param outOrderChunks the input value
	 */
	public void  setOutOrderChunks(Long outOrderChunks) {
		this.outOrderChunks = outOrderChunks;
	}

	/**
	 * Set the number of SCTP ordered data chunks sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @param outOrderChunks the input value
	 * @return this instance
	 */
	public SCTP withOutOrderChunks(Long outOrderChunks) {
		this.outOrderChunks = outOrderChunks;
		return this;
	}

	/**
	 * Get the number of SCTP unordered chunks (data chunks in which the U bit is set to 1) sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutUnorderChunks() {
		return outUnorderChunks;
	}

	/**
	 * Set the number of SCTP unordered chunks (data chunks in which the U bit is set to 1) sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @param outUnorderChunks the input value
	 */
	public void  setOutUnorderChunks(Long outUnorderChunks) {
		this.outUnorderChunks = outUnorderChunks;
	}

	/**
	 * Set the number of SCTP unordered chunks (data chunks in which the U bit is set to 1) sent (retransmissions are not included).
	 *
	 * @since 2.0
	 * @param outUnorderChunks the input value
	 * @return this instance
	 */
	public SCTP withOutUnorderChunks(Long outUnorderChunks) {
		this.outUnorderChunks = outUnorderChunks;
		return this;
	}

	/**
	 * Get the number of SCTP control chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInctrlChunks() {
		return inctrlChunks;
	}

	/**
	 * Set the number of SCTP control chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @param inctrlChunks the input value
	 */
	public void  setInctrlChunks(Long inctrlChunks) {
		this.inctrlChunks = inctrlChunks;
	}

	/**
	 * Set the number of SCTP control chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @param inctrlChunks the input value
	 * @return this instance
	 */
	public SCTP withInctrlChunks(Long inctrlChunks) {
		this.inctrlChunks = inctrlChunks;
		return this;
	}

	/**
	 * Get the number of SCTP ordered data chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInorderChunks() {
		return inorderChunks;
	}

	/**
	 * Set the number of SCTP ordered data chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @param inorderChunks the input value
	 */
	public void  setInorderChunks(Long inorderChunks) {
		this.inorderChunks = inorderChunks;
	}

	/**
	 * Set the number of SCTP ordered data chunks received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @param inorderChunks the input value
	 * @return this instance
	 */
	public SCTP withInorderChunks(Long inorderChunks) {
		this.inorderChunks = inorderChunks;
		return this;
	}

	/**
	 * Get the number of SCTP unordered chunks (data chunks in which the U bit is set to 1) received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInunorderChunks() {
		return inunorderChunks;
	}

	/**
	 * Set the number of SCTP unordered chunks (data chunks in which the U bit is set to 1) received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @param inunorderChunks the input value
	 */
	public void  setInunorderChunks(Long inunorderChunks) {
		this.inunorderChunks = inunorderChunks;
	}

	/**
	 * Set the number of SCTP unordered chunks (data chunks in which the U bit is set to 1) received (no duplicate chunks included).
	 *
	 * @since 2.0
	 * @param inunorderChunks the input value
	 * @return this instance
	 */
	public SCTP withInunorderChunks(Long inunorderChunks) {
		this.inunorderChunks = inunorderChunks;
		return this;
	}

	/**
	 * Get the number of user messages that have been sent fragmented.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFragUsrMsgs() {
		return fragUsrMsgs;
	}

	/**
	 * Set the number of user messages that have been sent fragmented.
	 *
	 * @since 2.0
	 * @param fragUsrMsgs the input value
	 */
	public void  setFragUsrMsgs(Long fragUsrMsgs) {
		this.fragUsrMsgs = fragUsrMsgs;
	}

	/**
	 * Set the number of user messages that have been sent fragmented.
	 *
	 * @since 2.0
	 * @param fragUsrMsgs the input value
	 * @return this instance
	 */
	public SCTP withFragUsrMsgs(Long fragUsrMsgs) {
		this.fragUsrMsgs = fragUsrMsgs;
		return this;
	}

	/**
	 * Get the number of user messages that have been received fragmented and submitted to the reassembly process.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReasmUsrMsgs() {
		return reasmUsrMsgs;
	}

	/**
	 * Set the number of user messages that have been received fragmented and submitted to the reassembly process.
	 *
	 * @since 2.0
	 * @param reasmUsrMsgs the input value
	 */
	public void  setReasmUsrMsgs(Long reasmUsrMsgs) {
		this.reasmUsrMsgs = reasmUsrMsgs;
	}

	/**
	 * Set the number of user messages that have been received fragmented and submitted to the reassembly process.
	 *
	 * @since 2.0
	 * @param reasmUsrMsgs the input value
	 * @return this instance
	 */
	public SCTP withReasmUsrMsgs(Long reasmUsrMsgs) {
		this.reasmUsrMsgs = reasmUsrMsgs;
		return this;
	}

	/**
	 * Get the number of SCTP packets sent. Retransmitted DATA chunks are included.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutSCTPPacks() {
		return outSCTPPacks;
	}

	/**
	 * Set the number of SCTP packets sent. Retransmitted DATA chunks are included.
	 *
	 * @since 2.0
	 * @param outSCTPPacks the input value
	 */
	public void  setOutSCTPPacks(Long outSCTPPacks) {
		this.outSCTPPacks = outSCTPPacks;
	}

	/**
	 * Set the number of SCTP packets sent. Retransmitted DATA chunks are included.
	 *
	 * @since 2.0
	 * @param outSCTPPacks the input value
	 * @return this instance
	 */
	public SCTP withOutSCTPPacks(Long outSCTPPacks) {
		this.outSCTPPacks = outSCTPPacks;
		return this;
	}

	/**
	 * Get the number of SCTP packets received. Duplicates are included.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInsCTPPacks() {
		return insCTPPacks;
	}

	/**
	 * Set the number of SCTP packets received. Duplicates are included.
	 *
	 * @since 2.0
	 * @param insCTPPacks the input value
	 */
	public void  setInsCTPPacks(Long insCTPPacks) {
		this.insCTPPacks = insCTPPacks;
	}

	/**
	 * Set the number of SCTP packets received. Duplicates are included.
	 *
	 * @since 2.0
	 * @param insCTPPacks the input value
	 * @return this instance
	 */
	public SCTP withInsCTPPacks(Long insCTPPacks) {
		this.insCTPPacks = insCTPPacks;
		return this;
	}

	/**
	 * Get the time of the last discontinuity.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getDiscontinuity() {
		return discontinuity;
	}

	/**
	 * Set the time of the last discontinuity.
	 *
	 * @since 2.0
	 * @param discontinuity the input value
	 */
	public void  setDiscontinuity(LocalDateTime discontinuity) {
		this.discontinuity = discontinuity;
	}

	/**
	 * Set the time of the last discontinuity.
	 *
	 * @since 2.0
	 * @param discontinuity the input value
	 * @return this instance
	 */
	public SCTP withDiscontinuity(LocalDateTime discontinuity) {
		this.discontinuity = discontinuity;
		return this;
	}

	/**
	 * Get the sctP Association Table
	 *
	 * @return the value
	 */
	public Collection<Assoc> getAssocs() {
		if (this.assocs == null){ this.assocs=new ArrayList<>();}
		return assocs;
	}

	/**
	 * Set the sctP Association Table
	 *
	 * @param assocs the input value
	 */
	public void  setAssocs(Collection<Assoc> assocs) {
		this.assocs = assocs;
	}

	/**
	 * Set the sctP Association Table
	 *
	 * @param assoc the input value
	 * @return this instance
	 */
	public SCTP withAssoc(Assoc assoc) {
		getAssocs().add(assoc);
		return this;
	}

	//</editor-fold>

}