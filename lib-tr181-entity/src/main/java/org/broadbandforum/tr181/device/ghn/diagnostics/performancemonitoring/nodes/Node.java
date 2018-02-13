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
package org.broadbandforum.tr181.device.ghn.diagnostics.performancemonitoring.nodes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * Per-node G.hn performance monitoring results during the current sample interval. Each table entry contains the results collected between the G.hn nodes with MAC addresses {{param|##.DiagnoseMACAddress}}) and {{param|DestinationMACAddress}}).

        Note: Packet counters indicate the number of packets received between {{param|#.CurrentStart}} and {{param|#.CurrentEnd}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Nodes.Node.{i}.")
@XmlRootElement(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Nodes.Node")
@XmlType(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Nodes.Node")
@XmlAccessorType(XmlAccessType.FIELD)
public class Node {

	/**
	 * MAC address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DestinationMACAddress")
	public MACAddress destinationMACAddress;
	/**
	 * The total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It might include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}).  This parameter represents the total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsReceived;
	/**
	 * The total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UnicastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 unicastPacketsSent;
	/**
	 * The total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UnicastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 unicastPacketsReceived;
	/**
	 * The total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsSent;
	/**
	 * The total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsReceived;
	/**
	 * The total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MulticastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 multicastPacketsSent;
	/**
	 * The total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MulticastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 multicastPacketsReceived;
	/**
	 * The total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BroadcastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 broadcastPacketsSent;
	/**
	 * The total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BroadcastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 broadcastPacketsReceived;
	/**
	 * The total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UnknownProtoPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 unknownProtoPacketsReceived;
	/**
	 * The total number of MPDU bytes transmitted by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MgmtBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 mgmtBytesSent;
	/**
	 * The total number of MPDU bytes received by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MgmtBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 mgmtBytesReceived;
	/**
	 * The total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MgmtPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 mgmtPacketsSent;
	/**
	 * The total number of LCDUs delivered to a management layer (i.e., inbound LCDUs) that were received by the node through a physical medium.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MgmtPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 mgmtPacketsReceived;
	/**
	 * The total number of LPDUs that were transmitted by the node through a physical medium, regardless of new or retransmitted LPDUs.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BlocksSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 blocksSent;
	/**
	 * The total number of LPDUs that were received by the node through a physical medium, with or without errors.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BlocksReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 blocksReceived;
	/**
	 * The total number of LPDUs that were retransmitted.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BlocksResent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 blocksResent;
	/**
	 * The total number of received LPDUs that contained errors.

          Note the following relationships hold:

          * PacketsSent + ErrorsSent + DiscardPacketsSent = UnicastPacketsSent + MulticastPacketsSent + BroadcastPacketsSent.

          * PacketsReceived = UnicastPacketsReceived + MulticastPacketsReceived + BroadcastPacketsReceived.

          * Retransmission rate = BlocksResent / BlocksSent.

          * Block error rate = BlocksErrorReceived / BlocksReceived.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BlocksErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 blocksErrorsReceived;

	public Node() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getDestinationMACAddress() {
		return destinationMACAddress;
	}

	/**
	 * Set the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @param destinationMACAddress the input value
	 */
	public void  setDestinationMACAddress(MACAddress destinationMACAddress) {
		this.destinationMACAddress = destinationMACAddress;
	}

	/**
	 * Set the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @param destinationMACAddress the input value
	 * @return this instance
	 */
	public Node withDestinationMACAddress(MACAddress destinationMACAddress) {
		this.destinationMACAddress = destinationMACAddress;
		return this;
	}

	/**
	 * Get the total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Node withBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It might include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It might include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It might include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Node withBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Node withPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Node withPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}).  This parameter represents the total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}).  This parameter represents the total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}).  This parameter represents the total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 * @return this instance
	 */
	public Node withErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
		return this;
	}

	/**
	 * Get the total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 * @return this instance
	 */
	public Node withErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
		return this;
	}

	/**
	 * Get the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getUnicastPacketsSent() {
		return unicastPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param unicastPacketsSent the input value
	 */
	public void  setUnicastPacketsSent(StatsCounter64 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param unicastPacketsSent the input value
	 * @return this instance
	 */
	public Node withUnicastPacketsSent(StatsCounter64 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getUnicastPacketsReceived() {
		return unicastPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.8
	 * @param unicastPacketsReceived the input value
	 */
	public void  setUnicastPacketsReceived(StatsCounter64 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.8
	 * @param unicastPacketsReceived the input value
	 * @return this instance
	 */
	public Node withUnicastPacketsReceived(StatsCounter64 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsSent() {
		return discardPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.8
	 * @param discardPacketsSent the input value
	 */
	public void  setDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.8
	 * @param discardPacketsSent the input value
	 * @return this instance
	 */
	public Node withDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsReceived() {
		return discardPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.8
	 * @param discardPacketsReceived the input value
	 */
	public void  setDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.8
	 * @param discardPacketsReceived the input value
	 * @return this instance
	 */
	public Node withDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMulticastPacketsSent() {
		return multicastPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param multicastPacketsSent the input value
	 */
	public void  setMulticastPacketsSent(StatsCounter64 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param multicastPacketsSent the input value
	 * @return this instance
	 */
	public Node withMulticastPacketsSent(StatsCounter64 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMulticastPacketsReceived() {
		return multicastPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 * @param multicastPacketsReceived the input value
	 */
	public void  setMulticastPacketsReceived(StatsCounter64 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.8
	 * @param multicastPacketsReceived the input value
	 * @return this instance
	 */
	public Node withMulticastPacketsReceived(StatsCounter64 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBroadcastPacketsSent() {
		return broadcastPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param broadcastPacketsSent the input value
	 */
	public void  setBroadcastPacketsSent(StatsCounter64 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
	}

	/**
	 * Set the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.8
	 * @param broadcastPacketsSent the input value
	 * @return this instance
	 */
	public Node withBroadcastPacketsSent(StatsCounter64 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBroadcastPacketsReceived() {
		return broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.8
	 * @param broadcastPacketsReceived the input value
	 */
	public void  setBroadcastPacketsReceived(StatsCounter64 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.8
	 * @param broadcastPacketsReceived the input value
	 * @return this instance
	 */
	public Node withBroadcastPacketsReceived(StatsCounter64 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getUnknownProtoPacketsReceived() {
		return unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.8
	 * @param unknownProtoPacketsReceived the input value
	 */
	public void  setUnknownProtoPacketsReceived(StatsCounter32 unknownProtoPacketsReceived) {
		this.unknownProtoPacketsReceived = unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.8
	 * @param unknownProtoPacketsReceived the input value
	 * @return this instance
	 */
	public Node withUnknownProtoPacketsReceived(StatsCounter32 unknownProtoPacketsReceived) {
		this.unknownProtoPacketsReceived = unknownProtoPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of MPDU bytes transmitted by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMgmtBytesSent() {
		return mgmtBytesSent;
	}

	/**
	 * Set the total number of MPDU bytes transmitted by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 * @param mgmtBytesSent the input value
	 */
	public void  setMgmtBytesSent(StatsCounter64 mgmtBytesSent) {
		this.mgmtBytesSent = mgmtBytesSent;
	}

	/**
	 * Set the total number of MPDU bytes transmitted by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 * @param mgmtBytesSent the input value
	 * @return this instance
	 */
	public Node withMgmtBytesSent(StatsCounter64 mgmtBytesSent) {
		this.mgmtBytesSent = mgmtBytesSent;
		return this;
	}

	/**
	 * Get the total number of MPDU bytes received by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMgmtBytesReceived() {
		return mgmtBytesReceived;
	}

	/**
	 * Set the total number of MPDU bytes received by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 * @param mgmtBytesReceived the input value
	 */
	public void  setMgmtBytesReceived(StatsCounter64 mgmtBytesReceived) {
		this.mgmtBytesReceived = mgmtBytesReceived;
	}

	/**
	 * Set the total number of MPDU bytes received by the node through a physical medium, which correspond to management LPDUs and framing overhead.
	 *
	 * @since 2.8
	 * @param mgmtBytesReceived the input value
	 * @return this instance
	 */
	public Node withMgmtBytesReceived(StatsCounter64 mgmtBytesReceived) {
		this.mgmtBytesReceived = mgmtBytesReceived;
		return this;
	}

	/**
	 * Get the total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMgmtPacketsSent() {
		return mgmtPacketsSent;
	}

	/**
	 * Set the total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium.
	 *
	 * @since 2.8
	 * @param mgmtPacketsSent the input value
	 */
	public void  setMgmtPacketsSent(StatsCounter64 mgmtPacketsSent) {
		this.mgmtPacketsSent = mgmtPacketsSent;
	}

	/**
	 * Set the total number of LCDUs requested for transmission by a management layer (i.e., outbound LCDUs generated in LLC defined in {{bibref|G.9961|Clause 8.1.3}}) that were transmitted by the node through a physical medium.
	 *
	 * @since 2.8
	 * @param mgmtPacketsSent the input value
	 * @return this instance
	 */
	public Node withMgmtPacketsSent(StatsCounter64 mgmtPacketsSent) {
		this.mgmtPacketsSent = mgmtPacketsSent;
		return this;
	}

	/**
	 * Get the total number of LCDUs delivered to a management layer (i.e., inbound LCDUs) that were received by the node through a physical medium.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getMgmtPacketsReceived() {
		return mgmtPacketsReceived;
	}

	/**
	 * Set the total number of LCDUs delivered to a management layer (i.e., inbound LCDUs) that were received by the node through a physical medium.
	 *
	 * @since 2.8
	 * @param mgmtPacketsReceived the input value
	 */
	public void  setMgmtPacketsReceived(StatsCounter64 mgmtPacketsReceived) {
		this.mgmtPacketsReceived = mgmtPacketsReceived;
	}

	/**
	 * Set the total number of LCDUs delivered to a management layer (i.e., inbound LCDUs) that were received by the node through a physical medium.
	 *
	 * @since 2.8
	 * @param mgmtPacketsReceived the input value
	 * @return this instance
	 */
	public Node withMgmtPacketsReceived(StatsCounter64 mgmtPacketsReceived) {
		this.mgmtPacketsReceived = mgmtPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of LPDUs that were transmitted by the node through a physical medium, regardless of new or retransmitted LPDUs.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBlocksSent() {
		return blocksSent;
	}

	/**
	 * Set the total number of LPDUs that were transmitted by the node through a physical medium, regardless of new or retransmitted LPDUs.
	 *
	 * @since 2.8
	 * @param blocksSent the input value
	 */
	public void  setBlocksSent(StatsCounter64 blocksSent) {
		this.blocksSent = blocksSent;
	}

	/**
	 * Set the total number of LPDUs that were transmitted by the node through a physical medium, regardless of new or retransmitted LPDUs.
	 *
	 * @since 2.8
	 * @param blocksSent the input value
	 * @return this instance
	 */
	public Node withBlocksSent(StatsCounter64 blocksSent) {
		this.blocksSent = blocksSent;
		return this;
	}

	/**
	 * Get the total number of LPDUs that were received by the node through a physical medium, with or without errors.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBlocksReceived() {
		return blocksReceived;
	}

	/**
	 * Set the total number of LPDUs that were received by the node through a physical medium, with or without errors.
	 *
	 * @since 2.8
	 * @param blocksReceived the input value
	 */
	public void  setBlocksReceived(StatsCounter64 blocksReceived) {
		this.blocksReceived = blocksReceived;
	}

	/**
	 * Set the total number of LPDUs that were received by the node through a physical medium, with or without errors.
	 *
	 * @since 2.8
	 * @param blocksReceived the input value
	 * @return this instance
	 */
	public Node withBlocksReceived(StatsCounter64 blocksReceived) {
		this.blocksReceived = blocksReceived;
		return this;
	}

	/**
	 * Get the total number of LPDUs that were retransmitted.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getBlocksResent() {
		return blocksResent;
	}

	/**
	 * Set the total number of LPDUs that were retransmitted.
	 *
	 * @since 2.8
	 * @param blocksResent the input value
	 */
	public void  setBlocksResent(StatsCounter32 blocksResent) {
		this.blocksResent = blocksResent;
	}

	/**
	 * Set the total number of LPDUs that were retransmitted.
	 *
	 * @since 2.8
	 * @param blocksResent the input value
	 * @return this instance
	 */
	public Node withBlocksResent(StatsCounter32 blocksResent) {
		this.blocksResent = blocksResent;
		return this;
	}

	/**
	 * Get the total number of received LPDUs that contained errors.

          Note the following relationships hold:

          * PacketsSent + ErrorsSent + DiscardPacketsSent = UnicastPacketsSent + MulticastPacketsSent + BroadcastPacketsSent.

          * PacketsReceived = UnicastPacketsReceived + MulticastPacketsReceived + BroadcastPacketsReceived.

          * Retransmission rate = BlocksResent / BlocksSent.

          * Block error rate = BlocksErrorReceived / BlocksReceived.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getBlocksErrorsReceived() {
		return blocksErrorsReceived;
	}

	/**
	 * Set the total number of received LPDUs that contained errors.

          Note the following relationships hold:

          * PacketsSent + ErrorsSent + DiscardPacketsSent = UnicastPacketsSent + MulticastPacketsSent + BroadcastPacketsSent.

          * PacketsReceived = UnicastPacketsReceived + MulticastPacketsReceived + BroadcastPacketsReceived.

          * Retransmission rate = BlocksResent / BlocksSent.

          * Block error rate = BlocksErrorReceived / BlocksReceived.
	 *
	 * @since 2.8
	 * @param blocksErrorsReceived the input value
	 */
	public void  setBlocksErrorsReceived(StatsCounter32 blocksErrorsReceived) {
		this.blocksErrorsReceived = blocksErrorsReceived;
	}

	/**
	 * Set the total number of received LPDUs that contained errors.

          Note the following relationships hold:

          * PacketsSent + ErrorsSent + DiscardPacketsSent = UnicastPacketsSent + MulticastPacketsSent + BroadcastPacketsSent.

          * PacketsReceived = UnicastPacketsReceived + MulticastPacketsReceived + BroadcastPacketsReceived.

          * Retransmission rate = BlocksResent / BlocksSent.

          * Block error rate = BlocksErrorReceived / BlocksReceived.
	 *
	 * @since 2.8
	 * @param blocksErrorsReceived the input value
	 * @return this instance
	 */
	public Node withBlocksErrorsReceived(StatsCounter32 blocksErrorsReceived) {
		this.blocksErrorsReceived = blocksErrorsReceived;
		return this;
	}

	//</editor-fold>

}