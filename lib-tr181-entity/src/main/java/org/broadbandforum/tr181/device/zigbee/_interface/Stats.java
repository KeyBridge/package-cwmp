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
package org.broadbandforum.tr181.device.zigbee._interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.StatsCounter32;
import org.broadbandforum.common.StatsCounter64;

	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @since TR181 v2.7
	 */
@CWMPObject(name = "Device.ZigBee.Interface.{i}.Stats.")
@XmlRootElement(name = "Device.ZigBee.Interface.Stats")
@XmlType(name = "Device.ZigBee.Interface.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of {{units}} transmitted out of the interface, including framing characters.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "BytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of {{units}}  received on the interface, including framing characters.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of {{units}} sent transmitted out of the interface.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of {{units}} received by the interface.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of {{units}} discarded by interface due to any error.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ErrorsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of {{units}} received that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsReceived;
	/**
	 * The total number of {{units}} requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "UnicastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 unicastPacketsSent;
	/**
	 * The total number of {{units}} received which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "UnicastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 unicastPacketsReceived;
	/**
	 * The total number of {{units}} requested for transmission which were chosen to be discarded even though no errors had been detected to prevent the {{units}} being transmitted.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DiscardPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsSent;
	/**
	 * The total number of {{units}} received which were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DiscardPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsReceived;
	/**
	 * The total number of {{units}} requested for transmission which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MulticastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 multicastPacketsSent;
	/**
	 * The total number of {{units}} received which were addressed to a multicast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MulticastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 multicastPacketsReceived;
	/**
	 * The total number of {{units}} requested for transmission which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "BroadcastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 broadcastPacketsSent;
	/**
	 * The total number of {{units}} received which were addressed to a broadcast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "BroadcastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 broadcastPacketsReceived;
	/**
	 * The total number of {{units}} received which were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "UnknownPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 unknownPacketsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of {{units}} transmitted out of the interface, including framing characters.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of {{units}} transmitted out of the interface, including framing characters.
	 *
	 * @since 2.7
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of {{units}} transmitted out of the interface, including framing characters.
	 *
	 * @since 2.7
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of {{units}}  received on the interface, including framing characters.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of {{units}}  received on the interface, including framing characters.
	 *
	 * @since 2.7
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of {{units}}  received on the interface, including framing characters.
	 *
	 * @since 2.7
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} sent transmitted out of the interface.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent transmitted out of the interface.
	 *
	 * @since 2.7
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of {{units}} sent transmitted out of the interface.
	 *
	 * @since 2.7
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Stats withPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received by the interface.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by the interface.
	 *
	 * @since 2.7
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received by the interface.
	 *
	 * @since 2.7
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} discarded by interface due to any error.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by interface due to any error.
	 *
	 * @since 2.7
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of {{units}} discarded by interface due to any error.
	 *
	 * @since 2.7
	 * @param errorsSent the input value
	 * @return this instance
	 */
	public Stats withErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of {{units}} received that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.7
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of {{units}} received that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.7
	 * @param errorsReceived the input value
	 * @return this instance
	 */
	public Stats withErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getUnicastPacketsSent() {
		return unicastPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @param unicastPacketsSent the input value
	 */
	public void  setUnicastPacketsSent(StatsCounter32 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @param unicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsSent(StatsCounter32 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getUnicastPacketsReceived() {
		return unicastPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.7
	 * @param unicastPacketsReceived the input value
	 */
	public void  setUnicastPacketsReceived(StatsCounter32 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were not addressed to a multicast or broadcast address at this layer.
	 *
	 * @since 2.7
	 * @param unicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsReceived(StatsCounter32 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} requested for transmission which were chosen to be discarded even though no errors had been detected to prevent the {{units}} being transmitted.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsSent() {
		return discardPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were chosen to be discarded even though no errors had been detected to prevent the {{units}} being transmitted.
	 *
	 * @since 2.7
	 * @param discardPacketsSent the input value
	 */
	public void  setDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were chosen to be discarded even though no errors had been detected to prevent the {{units}} being transmitted.
	 *
	 * @since 2.7
	 * @param discardPacketsSent the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received which were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsReceived() {
		return discardPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.7
	 * @param discardPacketsReceived the input value
	 */
	public void  setDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.7
	 * @param discardPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} requested for transmission which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getMulticastPacketsSent() {
		return multicastPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @param multicastPacketsSent the input value
	 */
	public void  setMulticastPacketsSent(StatsCounter32 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were addressed to a multicast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @param multicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsSent(StatsCounter32 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received which were addressed to a multicast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getMulticastPacketsReceived() {
		return multicastPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were addressed to a multicast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 * @param multicastPacketsReceived the input value
	 */
	public void  setMulticastPacketsReceived(StatsCounter32 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were addressed to a multicast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 * @param multicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsReceived(StatsCounter32 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} requested for transmission which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getBroadcastPacketsSent() {
		return broadcastPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @param broadcastPacketsSent the input value
	 */
	public void  setBroadcastPacketsSent(StatsCounter32 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
	}

	/**
	 * Set the total number of {{units}} requested for transmission which were addressed to a broadcast address at this layer, including those that were discarded or not sent.
	 *
	 * @since 2.7
	 * @param broadcastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsSent(StatsCounter32 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of {{units}} received which were addressed to a broadcast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getBroadcastPacketsReceived() {
		return broadcastPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were addressed to a broadcast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 * @param broadcastPacketsReceived the input value
	 */
	public void  setBroadcastPacketsReceived(StatsCounter32 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were addressed to a broadcast address at this layer and delivered by this layer to a higher layer.
	 *
	 * @since 2.7
	 * @param broadcastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsReceived(StatsCounter32 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of {{units}} received which were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public StatsCounter32 getUnknownPacketsReceived() {
		return unknownPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.7
	 * @param unknownPacketsReceived the input value
	 */
	public void  setUnknownPacketsReceived(StatsCounter32 unknownPacketsReceived) {
		this.unknownPacketsReceived = unknownPacketsReceived;
	}

	/**
	 * Set the total number of {{units}} received which were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.7
	 * @param unknownPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnknownPacketsReceived(StatsCounter32 unknownPacketsReceived) {
		this.unknownPacketsReceived = unknownPacketsReceived;
		return this;
	}

	//</editor-fold>

}