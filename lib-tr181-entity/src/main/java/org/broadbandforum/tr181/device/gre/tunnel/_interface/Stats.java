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
package org.broadbandforum.tr181.device.gre.tunnel._interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.common.StatsCounter32;
import org.broadbandforum.common.StatsCounter64;

	/**
	 * Statistics for this GRE tunnel interface, i.e. all traffic that has passed through the interface.

        The device MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e., the interface's Status parameter transitions to a down state after the interface has been disabled) or when the interface becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @since TR181 v2.8
	 */
@CWMPObject(name = "Device.GRE.Tunnel.{i}.Interface.{i}.Stats.")
@XmlRootElement(name = "Device.GRE.Tunnel.Interface.Stats")
@XmlType(name = "Device.GRE.Tunnel.Interface.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesSent")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesReceived")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsSent")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of {{units}} discarded by this interface due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsSent")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of {{units}} received by this interface that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsReceived")
	public StatsCounter32 errorsReceived;
	/**
	 * The total number of {{units}} received by the tunnel interface that are discarded because of Checksum errors.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardChecksumReceived")
	public StatsCounter32 discardChecksumReceived;
	/**
	 * The total number of {{units}} received by the tunnel interface that are discarded because of Sequence Number errors.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardSequenceNumberReceived")
	public StatsCounter32 discardSequenceNumberReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent by this interface.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Stats withPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by this interface.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} discarded by this interface due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by this interface due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by this interface due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 * @return this instance
	 */
	public Stats withErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received by this interface that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of {{units}} received by this interface that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of {{units}} received by this interface that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 * @return this instance
	 */
	public Stats withErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} received by the tunnel interface that are discarded because of Checksum errors.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardChecksumReceived() {
		return discardChecksumReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel interface that are discarded because of Checksum errors.
	 *
	 * @since 2.8
	 * @param discardChecksumReceived the input value
	 */
	public void  setDiscardChecksumReceived(StatsCounter32 discardChecksumReceived) {
		this.discardChecksumReceived = discardChecksumReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel interface that are discarded because of Checksum errors.
	 *
	 * @since 2.8
	 * @param discardChecksumReceived the input value
	 * @return this instance
	 */
	public Stats withDiscardChecksumReceived(StatsCounter32 discardChecksumReceived) {
		this.discardChecksumReceived = discardChecksumReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} received by the tunnel interface that are discarded because of Sequence Number errors.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardSequenceNumberReceived() {
		return discardSequenceNumberReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel interface that are discarded because of Sequence Number errors.
	 *
	 * @since 2.8
	 * @param discardSequenceNumberReceived the input value
	 */
	public void  setDiscardSequenceNumberReceived(StatsCounter32 discardSequenceNumberReceived) {
		this.discardSequenceNumberReceived = discardSequenceNumberReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel interface that are discarded because of Sequence Number errors.
	 *
	 * @since 2.8
	 * @param discardSequenceNumberReceived the input value
	 * @return this instance
	 */
	public Stats withDiscardSequenceNumberReceived(StatsCounter32 discardSequenceNumberReceived) {
		this.discardSequenceNumberReceived = discardSequenceNumberReceived;
		return this;
	}

	//</editor-fold>

}