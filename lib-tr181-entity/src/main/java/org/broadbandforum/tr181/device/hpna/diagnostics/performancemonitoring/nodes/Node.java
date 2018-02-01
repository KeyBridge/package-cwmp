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
package org.broadbandforum.tr181.device.hpna.diagnostics.performancemonitoring.nodes;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * Per-node HPNA performance monitoring results during the current sample interval. Each table entry contains the results collected between an HPNA node (as indicated by {{param|MACAddress}}) and the local HPNA interface (as indicated by {{param|##.Interface}}).

        Note: Packet counters indicate the number of packets received between {{param|#.CurrentStart}} and {{param|#.CurrentEnd}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Diagnostics.PerformanceMonitoring.Nodes.Node.{i}.")
public class Node {

	/**
	 * The MAC address of the HPNA node.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * The total number of bytes sent by host equipment for transmission on the HPNA interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesSent")
	public Long bytesSent;
	/**
	 * The total number of received bytes on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BytesReceived")
	public Long bytesReceived;
	/**
	 * The total number of packets sent by host equipment for transmission on the HPNA interface. Number includes also short error packets and control packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsSent")
	public Long packetsSent;
	/**
	 * The total number of good packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceived")
	public Long packetsReceived;
	/**
	 * The number of broadcast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BroadcastPacketsSent")
	public Long broadcastPacketsSent;
	/**
	 * The number of broadcast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BroadcastPacketsReceived")
	public Long broadcastPacketsReceived;
	/**
	 * The number of multicast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MulticastPacketsSent")
	public Long multicastPacketsSent;
	/**
	 * The number of multicast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MulticastPacketsReceived")
	public Long multicastPacketsReceived;
	/**
	 * The number of packets received on the HPNA interface with CRC errors.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsCrcErrored")
	public Long packetsCrcErrored;
	/**
	 * The number of CRC error packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsCrcErroredHost")
	public Long packetsCrcErroredHost;
	/**
	 * The number of packets received on the HPNA interface that are too short to be valid.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsShortErrored")
	public Long packetsShortErrored;
	/**
	 * The number packets sent by the host equipment that are too short to be valid.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsShortErroredHost")
	public Long packetsShortErroredHost;
	/**
	 * The number of received packets dropped due to lack of resources.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxPacketsDropped")
	public Long rxpacketsDropped;
	/**
	 * The number packets sent by the host equipment for transmission on the HPNA interface but dropped due to lack of resources.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxPacketsDropped")
	public Long txpacketsDropped;
	/**
	 * The number of HPNA control request packets from local host.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ControlRequestLocal")
	public Long controlRequestLocal;
	/**
	 * The number of HPNA control reply packets to local host.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ControlReplyLocal")
	public Long controlReplyLocal;
	/**
	 * The number of HPNA control request packets from remote host.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ControlRequestRemote")
	public Long controlRequestRemote;
	/**
	 * The number of HPNA control reply packets to remote host.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ControlReplyRemote")
	public Long controlReplyRemote;
	/**
	 * The total number of packets transmitted to wire.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsSentWire")
	public Long packetsSentWire;
	/**
	 * The total number of broadcast packets transmitted to wire.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BroadcastPacketsSentWire")
	public Long broadcastPacketsSentWire;
	/**
	 * The total number of multicast packets transmitted to wire.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MulticastPacketsSentWire")
	public Long multicastPacketsSentWire;
	/**
	 * The number of HPNA control request packets from internal node.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsInternalControl")
	public Long packetsInternalControl;
	/**
	 * The number of HPNA broadcast control request packets from internal node.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BroadcastPacketsInternalControl")
	public Long broadcastPacketsInternalControl;
	/**
	 * The number of received packets queued on host output queues.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceivedQueued")
	public Long packetsReceivedQueued;
	/**
	 * The number of packets received and forwarded to unknown hosts.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceivedForwardUnknown")
	public Long packetsReceivedForwardUnknown;
	/**
	 * The node utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NodeUtilization")
	@Size(min = 0, max = 1000)
	public Long nodeUtilization;

	public Node() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the MAC address of the HPNA node.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the MAC address of the HPNA node.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the MAC address of the HPNA node.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public Node withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the total number of bytes sent by host equipment for transmission on the HPNA interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes sent by host equipment for transmission on the HPNA interface.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes sent by host equipment for transmission on the HPNA interface.
	 *
	 * @since 2.0
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Node withBytesSent(Long bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of received bytes on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of received bytes on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of received bytes on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Node withBytesReceived(Long bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of packets sent by host equipment for transmission on the HPNA interface. Number includes also short error packets and control packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of packets sent by host equipment for transmission on the HPNA interface. Number includes also short error packets and control packets.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of packets sent by host equipment for transmission on the HPNA interface. Number includes also short error packets and control packets.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Node withPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of good packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of good packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of good packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Node withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the number of broadcast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBroadcastPacketsSent() {
		return broadcastPacketsSent;
	}

	/**
	 * Set the number of broadcast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 * @param broadcastPacketsSent the input value
	 */
	public void  setBroadcastPacketsSent(Long broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
	}

	/**
	 * Set the number of broadcast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 * @param broadcastPacketsSent the input value
	 * @return this instance
	 */
	public Node withBroadcastPacketsSent(Long broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
		return this;
	}

	/**
	 * Get the number of broadcast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBroadcastPacketsReceived() {
		return broadcastPacketsReceived;
	}

	/**
	 * Set the number of broadcast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 * @param broadcastPacketsReceived the input value
	 */
	public void  setBroadcastPacketsReceived(Long broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
	}

	/**
	 * Set the number of broadcast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 * @param broadcastPacketsReceived the input value
	 * @return this instance
	 */
	public Node withBroadcastPacketsReceived(Long broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
		return this;
	}

	/**
	 * Get the number of multicast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMulticastPacketsSent() {
		return multicastPacketsSent;
	}

	/**
	 * Set the number of multicast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 * @param multicastPacketsSent the input value
	 */
	public void  setMulticastPacketsSent(Long multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
	}

	/**
	 * Set the number of multicast packets transmitted on the HPNA interface.
	 *
	 * @since 2.0
	 * @param multicastPacketsSent the input value
	 * @return this instance
	 */
	public Node withMulticastPacketsSent(Long multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
		return this;
	}

	/**
	 * Get the number of multicast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMulticastPacketsReceived() {
		return multicastPacketsReceived;
	}

	/**
	 * Set the number of multicast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 * @param multicastPacketsReceived the input value
	 */
	public void  setMulticastPacketsReceived(Long multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
	}

	/**
	 * Set the number of multicast packets received on the HPNA interface.
	 *
	 * @since 2.0
	 * @param multicastPacketsReceived the input value
	 * @return this instance
	 */
	public Node withMulticastPacketsReceived(Long multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
		return this;
	}

	/**
	 * Get the number of packets received on the HPNA interface with CRC errors.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsCrcErrored() {
		return packetsCrcErrored;
	}

	/**
	 * Set the number of packets received on the HPNA interface with CRC errors.
	 *
	 * @since 2.0
	 * @param packetsCrcErrored the input value
	 */
	public void  setPacketsCrcErrored(Long packetsCrcErrored) {
		this.packetsCrcErrored = packetsCrcErrored;
	}

	/**
	 * Set the number of packets received on the HPNA interface with CRC errors.
	 *
	 * @since 2.0
	 * @param packetsCrcErrored the input value
	 * @return this instance
	 */
	public Node withPacketsCrcErrored(Long packetsCrcErrored) {
		this.packetsCrcErrored = packetsCrcErrored;
		return this;
	}

	/**
	 * Get the number of CRC error packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsCrcErroredHost() {
		return packetsCrcErroredHost;
	}

	/**
	 * Set the number of CRC error packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @param packetsCrcErroredHost the input value
	 */
	public void  setPacketsCrcErroredHost(Long packetsCrcErroredHost) {
		this.packetsCrcErroredHost = packetsCrcErroredHost;
	}

	/**
	 * Set the number of CRC error packets received on the HPNA interface destined for the host equipment.
	 *
	 * @since 2.0
	 * @param packetsCrcErroredHost the input value
	 * @return this instance
	 */
	public Node withPacketsCrcErroredHost(Long packetsCrcErroredHost) {
		this.packetsCrcErroredHost = packetsCrcErroredHost;
		return this;
	}

	/**
	 * Get the number of packets received on the HPNA interface that are too short to be valid.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsShortErrored() {
		return packetsShortErrored;
	}

	/**
	 * Set the number of packets received on the HPNA interface that are too short to be valid.
	 *
	 * @since 2.0
	 * @param packetsShortErrored the input value
	 */
	public void  setPacketsShortErrored(Long packetsShortErrored) {
		this.packetsShortErrored = packetsShortErrored;
	}

	/**
	 * Set the number of packets received on the HPNA interface that are too short to be valid.
	 *
	 * @since 2.0
	 * @param packetsShortErrored the input value
	 * @return this instance
	 */
	public Node withPacketsShortErrored(Long packetsShortErrored) {
		this.packetsShortErrored = packetsShortErrored;
		return this;
	}

	/**
	 * Get the number packets sent by the host equipment that are too short to be valid.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsShortErroredHost() {
		return packetsShortErroredHost;
	}

	/**
	 * Set the number packets sent by the host equipment that are too short to be valid.
	 *
	 * @since 2.0
	 * @param packetsShortErroredHost the input value
	 */
	public void  setPacketsShortErroredHost(Long packetsShortErroredHost) {
		this.packetsShortErroredHost = packetsShortErroredHost;
	}

	/**
	 * Set the number packets sent by the host equipment that are too short to be valid.
	 *
	 * @since 2.0
	 * @param packetsShortErroredHost the input value
	 * @return this instance
	 */
	public Node withPacketsShortErroredHost(Long packetsShortErroredHost) {
		this.packetsShortErroredHost = packetsShortErroredHost;
		return this;
	}

	/**
	 * Get the number of received packets dropped due to lack of resources.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxpacketsDropped() {
		return rxpacketsDropped;
	}

	/**
	 * Set the number of received packets dropped due to lack of resources.
	 *
	 * @since 2.0
	 * @param rxpacketsDropped the input value
	 */
	public void  setRxpacketsDropped(Long rxpacketsDropped) {
		this.rxpacketsDropped = rxpacketsDropped;
	}

	/**
	 * Set the number of received packets dropped due to lack of resources.
	 *
	 * @since 2.0
	 * @param rxpacketsDropped the input value
	 * @return this instance
	 */
	public Node withRxpacketsDropped(Long rxpacketsDropped) {
		this.rxpacketsDropped = rxpacketsDropped;
		return this;
	}

	/**
	 * Get the number packets sent by the host equipment for transmission on the HPNA interface but dropped due to lack of resources.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxpacketsDropped() {
		return txpacketsDropped;
	}

	/**
	 * Set the number packets sent by the host equipment for transmission on the HPNA interface but dropped due to lack of resources.
	 *
	 * @since 2.0
	 * @param txpacketsDropped the input value
	 */
	public void  setTxpacketsDropped(Long txpacketsDropped) {
		this.txpacketsDropped = txpacketsDropped;
	}

	/**
	 * Set the number packets sent by the host equipment for transmission on the HPNA interface but dropped due to lack of resources.
	 *
	 * @since 2.0
	 * @param txpacketsDropped the input value
	 * @return this instance
	 */
	public Node withTxpacketsDropped(Long txpacketsDropped) {
		this.txpacketsDropped = txpacketsDropped;
		return this;
	}

	/**
	 * Get the number of HPNA control request packets from local host.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getControlRequestLocal() {
		return controlRequestLocal;
	}

	/**
	 * Set the number of HPNA control request packets from local host.
	 *
	 * @since 2.0
	 * @param controlRequestLocal the input value
	 */
	public void  setControlRequestLocal(Long controlRequestLocal) {
		this.controlRequestLocal = controlRequestLocal;
	}

	/**
	 * Set the number of HPNA control request packets from local host.
	 *
	 * @since 2.0
	 * @param controlRequestLocal the input value
	 * @return this instance
	 */
	public Node withControlRequestLocal(Long controlRequestLocal) {
		this.controlRequestLocal = controlRequestLocal;
		return this;
	}

	/**
	 * Get the number of HPNA control reply packets to local host.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getControlReplyLocal() {
		return controlReplyLocal;
	}

	/**
	 * Set the number of HPNA control reply packets to local host.
	 *
	 * @since 2.0
	 * @param controlReplyLocal the input value
	 */
	public void  setControlReplyLocal(Long controlReplyLocal) {
		this.controlReplyLocal = controlReplyLocal;
	}

	/**
	 * Set the number of HPNA control reply packets to local host.
	 *
	 * @since 2.0
	 * @param controlReplyLocal the input value
	 * @return this instance
	 */
	public Node withControlReplyLocal(Long controlReplyLocal) {
		this.controlReplyLocal = controlReplyLocal;
		return this;
	}

	/**
	 * Get the number of HPNA control request packets from remote host.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getControlRequestRemote() {
		return controlRequestRemote;
	}

	/**
	 * Set the number of HPNA control request packets from remote host.
	 *
	 * @since 2.0
	 * @param controlRequestRemote the input value
	 */
	public void  setControlRequestRemote(Long controlRequestRemote) {
		this.controlRequestRemote = controlRequestRemote;
	}

	/**
	 * Set the number of HPNA control request packets from remote host.
	 *
	 * @since 2.0
	 * @param controlRequestRemote the input value
	 * @return this instance
	 */
	public Node withControlRequestRemote(Long controlRequestRemote) {
		this.controlRequestRemote = controlRequestRemote;
		return this;
	}

	/**
	 * Get the number of HPNA control reply packets to remote host.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getControlReplyRemote() {
		return controlReplyRemote;
	}

	/**
	 * Set the number of HPNA control reply packets to remote host.
	 *
	 * @since 2.0
	 * @param controlReplyRemote the input value
	 */
	public void  setControlReplyRemote(Long controlReplyRemote) {
		this.controlReplyRemote = controlReplyRemote;
	}

	/**
	 * Set the number of HPNA control reply packets to remote host.
	 *
	 * @since 2.0
	 * @param controlReplyRemote the input value
	 * @return this instance
	 */
	public Node withControlReplyRemote(Long controlReplyRemote) {
		this.controlReplyRemote = controlReplyRemote;
		return this;
	}

	/**
	 * Get the total number of packets transmitted to wire.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsSentWire() {
		return packetsSentWire;
	}

	/**
	 * Set the total number of packets transmitted to wire.
	 *
	 * @since 2.0
	 * @param packetsSentWire the input value
	 */
	public void  setPacketsSentWire(Long packetsSentWire) {
		this.packetsSentWire = packetsSentWire;
	}

	/**
	 * Set the total number of packets transmitted to wire.
	 *
	 * @since 2.0
	 * @param packetsSentWire the input value
	 * @return this instance
	 */
	public Node withPacketsSentWire(Long packetsSentWire) {
		this.packetsSentWire = packetsSentWire;
		return this;
	}

	/**
	 * Get the total number of broadcast packets transmitted to wire.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBroadcastPacketsSentWire() {
		return broadcastPacketsSentWire;
	}

	/**
	 * Set the total number of broadcast packets transmitted to wire.
	 *
	 * @since 2.0
	 * @param broadcastPacketsSentWire the input value
	 */
	public void  setBroadcastPacketsSentWire(Long broadcastPacketsSentWire) {
		this.broadcastPacketsSentWire = broadcastPacketsSentWire;
	}

	/**
	 * Set the total number of broadcast packets transmitted to wire.
	 *
	 * @since 2.0
	 * @param broadcastPacketsSentWire the input value
	 * @return this instance
	 */
	public Node withBroadcastPacketsSentWire(Long broadcastPacketsSentWire) {
		this.broadcastPacketsSentWire = broadcastPacketsSentWire;
		return this;
	}

	/**
	 * Get the total number of multicast packets transmitted to wire.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMulticastPacketsSentWire() {
		return multicastPacketsSentWire;
	}

	/**
	 * Set the total number of multicast packets transmitted to wire.
	 *
	 * @since 2.0
	 * @param multicastPacketsSentWire the input value
	 */
	public void  setMulticastPacketsSentWire(Long multicastPacketsSentWire) {
		this.multicastPacketsSentWire = multicastPacketsSentWire;
	}

	/**
	 * Set the total number of multicast packets transmitted to wire.
	 *
	 * @since 2.0
	 * @param multicastPacketsSentWire the input value
	 * @return this instance
	 */
	public Node withMulticastPacketsSentWire(Long multicastPacketsSentWire) {
		this.multicastPacketsSentWire = multicastPacketsSentWire;
		return this;
	}

	/**
	 * Get the number of HPNA control request packets from internal node.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsInternalControl() {
		return packetsInternalControl;
	}

	/**
	 * Set the number of HPNA control request packets from internal node.
	 *
	 * @since 2.0
	 * @param packetsInternalControl the input value
	 */
	public void  setPacketsInternalControl(Long packetsInternalControl) {
		this.packetsInternalControl = packetsInternalControl;
	}

	/**
	 * Set the number of HPNA control request packets from internal node.
	 *
	 * @since 2.0
	 * @param packetsInternalControl the input value
	 * @return this instance
	 */
	public Node withPacketsInternalControl(Long packetsInternalControl) {
		this.packetsInternalControl = packetsInternalControl;
		return this;
	}

	/**
	 * Get the number of HPNA broadcast control request packets from internal node.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBroadcastPacketsInternalControl() {
		return broadcastPacketsInternalControl;
	}

	/**
	 * Set the number of HPNA broadcast control request packets from internal node.
	 *
	 * @since 2.0
	 * @param broadcastPacketsInternalControl the input value
	 */
	public void  setBroadcastPacketsInternalControl(Long broadcastPacketsInternalControl) {
		this.broadcastPacketsInternalControl = broadcastPacketsInternalControl;
	}

	/**
	 * Set the number of HPNA broadcast control request packets from internal node.
	 *
	 * @since 2.0
	 * @param broadcastPacketsInternalControl the input value
	 * @return this instance
	 */
	public Node withBroadcastPacketsInternalControl(Long broadcastPacketsInternalControl) {
		this.broadcastPacketsInternalControl = broadcastPacketsInternalControl;
		return this;
	}

	/**
	 * Get the number of received packets queued on host output queues.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsReceivedQueued() {
		return packetsReceivedQueued;
	}

	/**
	 * Set the number of received packets queued on host output queues.
	 *
	 * @since 2.0
	 * @param packetsReceivedQueued the input value
	 */
	public void  setPacketsReceivedQueued(Long packetsReceivedQueued) {
		this.packetsReceivedQueued = packetsReceivedQueued;
	}

	/**
	 * Set the number of received packets queued on host output queues.
	 *
	 * @since 2.0
	 * @param packetsReceivedQueued the input value
	 * @return this instance
	 */
	public Node withPacketsReceivedQueued(Long packetsReceivedQueued) {
		this.packetsReceivedQueued = packetsReceivedQueued;
		return this;
	}

	/**
	 * Get the number of packets received and forwarded to unknown hosts.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsReceivedForwardUnknown() {
		return packetsReceivedForwardUnknown;
	}

	/**
	 * Set the number of packets received and forwarded to unknown hosts.
	 *
	 * @since 2.0
	 * @param packetsReceivedForwardUnknown the input value
	 */
	public void  setPacketsReceivedForwardUnknown(Long packetsReceivedForwardUnknown) {
		this.packetsReceivedForwardUnknown = packetsReceivedForwardUnknown;
	}

	/**
	 * Set the number of packets received and forwarded to unknown hosts.
	 *
	 * @since 2.0
	 * @param packetsReceivedForwardUnknown the input value
	 * @return this instance
	 */
	public Node withPacketsReceivedForwardUnknown(Long packetsReceivedForwardUnknown) {
		this.packetsReceivedForwardUnknown = packetsReceivedForwardUnknown;
		return this;
	}

	/**
	 * Get the node utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNodeUtilization() {
		return nodeUtilization;
	}

	/**
	 * Set the node utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 * @param nodeUtilization the input value
	 */
	public void  setNodeUtilization(Long nodeUtilization) {
		this.nodeUtilization = nodeUtilization;
	}

	/**
	 * Set the node utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 * @param nodeUtilization the input value
	 * @return this instance
	 */
	public Node withNodeUtilization(Long nodeUtilization) {
		this.nodeUtilization = nodeUtilization;
		return this;
	}

	//</editor-fold>

}