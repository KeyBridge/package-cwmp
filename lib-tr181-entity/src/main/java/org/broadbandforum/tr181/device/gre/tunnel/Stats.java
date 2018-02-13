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
package org.broadbandforum.tr181.device.gre.tunnel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * Statistics for this GRE tunnel, i.e. all traffic that has passed through the tunnel.

        The device MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e., Status parameter transitions to a disabled state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. the Enable parameter transitioned from {{false}} to {{true}}).
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.GRE.Tunnel.{i}.Stats.")
@XmlRootElement(name = "Device.GRE.Tunnel.Stats")
@XmlType(name = "Device.GRE.Tunnel.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of KeepAlive {{units}} sent out the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "KeepAliveSent")
	public StatsCounter32 keepAliveSent;
	/**
	 * The total number of KeepAlive {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "KeepAliveReceived")
	public StatsCounter32 keepAliveReceived;
	/**
	 * The total number of {{units}} sent by the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesSent")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesReceived")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of {{units}} sent by the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsSent")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of {{units}} discarded by the tunnel due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsSent")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of {{units}} received by the tunnel that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsReceived")
	public StatsCounter32 errorsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of KeepAlive {{units}} sent out the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getKeepAliveSent() {
		return keepAliveSent;
	}

	/**
	 * Set the total number of KeepAlive {{units}} sent out the tunnel.
	 *
	 * @since 2.8
	 * @param keepAliveSent the input value
	 */
	public void  setKeepAliveSent(StatsCounter32 keepAliveSent) {
		this.keepAliveSent = keepAliveSent;
	}

	/**
	 * Set the total number of KeepAlive {{units}} sent out the tunnel.
	 *
	 * @since 2.8
	 * @param keepAliveSent the input value
	 * @return this instance
	 */
	public Stats withKeepAliveSent(StatsCounter32 keepAliveSent) {
		this.keepAliveSent = keepAliveSent;
		return this;
	}

	/**
	 * Get the total number of KeepAlive {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getKeepAliveReceived() {
		return keepAliveReceived;
	}

	/**
	 * Set the total number of KeepAlive {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 * @param keepAliveReceived the input value
	 */
	public void  setKeepAliveReceived(StatsCounter32 keepAliveReceived) {
		this.keepAliveReceived = keepAliveReceived;
	}

	/**
	 * Set the total number of KeepAlive {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 * @param keepAliveReceived the input value
	 * @return this instance
	 */
	public Stats withKeepAliveReceived(StatsCounter32 keepAliveReceived) {
		this.keepAliveReceived = keepAliveReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} sent by the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of {{units}} sent by the tunnel.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of {{units}} sent by the tunnel.
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
	 * Get the total number of {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel.
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
	 * Get the total number of {{units}} sent by the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent by the tunnel.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent by the tunnel.
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
	 * Get the total number of {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel.
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
	 * Get the total number of {{units}} discarded by the tunnel due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by the tunnel due to any error.  This can include packets dropped due to a lack of transmit buffers.
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by the tunnel due to any error.  This can include packets dropped due to a lack of transmit buffers.
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
	 * Get the total number of {{units}} received by the tunnel that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of {{units}} received by the tunnel that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 * @return this instance
	 */
	public Stats withErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
		return this;
	}

	//</editor-fold>

}