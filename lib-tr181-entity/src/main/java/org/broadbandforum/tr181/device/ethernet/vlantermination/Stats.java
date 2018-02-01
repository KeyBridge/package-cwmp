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
package org.broadbandforum.tr181.device.ethernet.vlantermination;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Ethernet.VLANTermination.{i}.Stats.")
public class Stats {

	/**
	 * The total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesSent;
	/**
	 * The total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long bytesReceived;
	/**
	 * The total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsSent;
	/**
	 * The total number of packets received on the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long packetsReceived;
	/**
	 * The total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErrorsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long errorsSent;
	/**
	 * The total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long errorsReceived;
	/**
	 * The total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UnicastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long unicastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UnicastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long unicastPacketsReceived;
	/**
	 * The total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiscardPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long discardPacketsSent;
	/**
	 * The total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiscardPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long discardPacketsReceived;
	/**
	 * The total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MulticastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long multicastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MulticastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long multicastPacketsReceived;
	/**
	 * The total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BroadcastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long broadcastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BroadcastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long broadcastPacketsReceived;
	/**
	 * The total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UnknownProtoPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long unknownProtoPacketsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Stats withPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of packets received on the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(Long errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.
	 *
	 * @since 2.0
	 * @param errorsSent the input value
	 * @return this instance
	 */
	public Stats withErrorsSent(Long errorsSent) {
		this.errorsSent = errorsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(Long errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.0
	 * @param errorsReceived the input value
	 * @return this instance
	 */
	public Stats withErrorsReceived(Long errorsReceived) {
		this.errorsReceived = errorsReceived;
		return this;
	}

	/**
	 * Get the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnicastPacketsSent() {
		return unicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @param unicastPacketsSent the input value
	 */
	public void  setUnicastPacketsSent(Long unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @param unicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsSent(Long unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnicastPacketsReceived() {
		return unicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.0
	 * @param unicastPacketsReceived the input value
	 */
	public void  setUnicastPacketsReceived(Long unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.0
	 * @param unicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsReceived(Long unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDiscardPacketsSent() {
		return discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsSent the input value
	 */
	public void  setDiscardPacketsSent(Long discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsSent the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsSent(Long discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDiscardPacketsReceived() {
		return discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsReceived the input value
	 */
	public void  setDiscardPacketsReceived(Long discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.0
	 * @param discardPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsReceived(Long discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMulticastPacketsSent() {
		return multicastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @param multicastPacketsSent the input value
	 */
	public void  setMulticastPacketsSent(Long multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @param multicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsSent(Long multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMulticastPacketsReceived() {
		return multicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.0
	 * @param multicastPacketsReceived the input value
	 */
	public void  setMulticastPacketsReceived(Long multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.
	 *
	 * @since 2.0
	 * @param multicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsReceived(Long multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBroadcastPacketsSent() {
		return broadcastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @param broadcastPacketsSent the input value
	 */
	public void  setBroadcastPacketsSent(Long broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.0
	 * @param broadcastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsSent(Long broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBroadcastPacketsReceived() {
		return broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.0
	 * @param broadcastPacketsReceived the input value
	 */
	public void  setBroadcastPacketsReceived(Long broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.0
	 * @param broadcastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsReceived(Long broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnknownProtoPacketsReceived() {
		return unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.0
	 * @param unknownProtoPacketsReceived the input value
	 */
	public void  setUnknownProtoPacketsReceived(Long unknownProtoPacketsReceived) {
		this.unknownProtoPacketsReceived = unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.
	 *
	 * @since 2.0
	 * @param unknownProtoPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnknownProtoPacketsReceived(Long unknownProtoPacketsReceived) {
		this.unknownProtoPacketsReceived = unknownProtoPacketsReceived;
		return this;
	}

	//</editor-fold>

}