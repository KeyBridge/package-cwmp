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
package org.broadbandforum.tr181.device.map.domain._interface;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * Throughput statistics for this MAP domain interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.MAP.Domain.{i}.Interface.Stats.")
public class Stats {

	/**
	 * The total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of packets transmitted out of the interface.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of packets received on the interface.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsReceived;
	/**
	 * The total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UnicastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 unicastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UnicastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 unicastPacketsReceived;
	/**
	 * The total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsSent;
	/**
	 * The total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsReceived;
	/**
	 * The total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MulticastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 multicastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MulticastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 multicastPacketsReceived;
	/**
	 * The total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BroadcastPacketsSent")
	public StatsCounter64 broadcastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BroadcastPacketsReceived")
	public StatsCounter64 broadcastPacketsReceived;
	/**
	 * The total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UnknownProtoPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 unknownProtoPacketsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.
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
	 * Get the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.
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
	 * Get the total number of packets transmitted out of the interface.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.
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
	 * Get the total number of packets received on the interface.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.
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
	 * Get the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.
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
	 * Get the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
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
	 * Get the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getUnicastPacketsSent() {
		return unicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param unicastPacketsSent the input value
	 */
	public void  setUnicastPacketsSent(StatsCounter64 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param unicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsSent(StatsCounter64 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getUnicastPacketsReceived() {
		return unicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.8
	 * @param unicastPacketsReceived the input value
	 */
	public void  setUnicastPacketsReceived(StatsCounter64 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.8
	 * @param unicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsReceived(StatsCounter64 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsSent() {
		return discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @param discardPacketsSent the input value
	 */
	public void  setDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @param discardPacketsSent the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsReceived() {
		return discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @param discardPacketsReceived the input value
	 */
	public void  setDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @param discardPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMulticastPacketsSent() {
		return multicastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param multicastPacketsSent the input value
	 */
	public void  setMulticastPacketsSent(StatsCounter64 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param multicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsSent(StatsCounter64 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMulticastPacketsReceived() {
		return multicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 * @param multicastPacketsReceived the input value
	 */
	public void  setMulticastPacketsReceived(StatsCounter64 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 * @param multicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsReceived(StatsCounter64 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBroadcastPacketsSent() {
		return broadcastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 * @param broadcastPacketsSent the input value
	 */
	public void  setBroadcastPacketsSent(StatsCounter64 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 * @param broadcastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsSent(StatsCounter64 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBroadcastPacketsReceived() {
		return broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 * @param broadcastPacketsReceived the input value
	 */
	public void  setBroadcastPacketsReceived(StatsCounter64 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          Note that IPv6 does not define broadcast addresses, so IPv6 packets will never cause this counter to increment.
	 *
	 * @since 2.8
	 * @param broadcastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsReceived(StatsCounter64 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getUnknownProtoPacketsReceived() {
		return unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.8
	 * @param unknownProtoPacketsReceived the input value
	 */
	public void  setUnknownProtoPacketsReceived(StatsCounter32 unknownProtoPacketsReceived) {
		this.unknownProtoPacketsReceived = unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.8
	 * @param unknownProtoPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnknownProtoPacketsReceived(StatsCounter32 unknownProtoPacketsReceived) {
		this.unknownProtoPacketsReceived = unknownProtoPacketsReceived;
		return this;
	}

	//</editor-fold>

}