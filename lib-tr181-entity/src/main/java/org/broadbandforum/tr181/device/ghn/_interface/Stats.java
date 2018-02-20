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
package org.broadbandforum.tr181.device.ghn._interface;

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
	 * Throughput statistics for this interface at the different G.hn reference points described in {{bibref|G.9961|Clause 8.1}}.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @since TR181 v2.4
	 */
@CWMPObject(name = "Device.Ghn.Interface.{i}.Stats.")
@XmlRootElement(name = "Device.Ghn.Interface.Stats")
@XmlType(name = "Device.Ghn.Interface.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of bytes transmitted out of the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "BytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of bytes received on the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It can include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "BytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of packets transmitted out of the interface.

          More specifically, this is the total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "PacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of packets received on the interface.

          More specifically, this is the total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "PacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of outbound packets that could not be transmitted because of errors.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ErrorsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.

          More specifically, this is the total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 errorsReceived;
	/**
	 * The total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "UnicastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 unicastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "UnicastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 unicastPacketsReceived;
	/**
	 * The total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DiscardPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsSent;
	/**
	 * The total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DiscardPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 discardPacketsReceived;
	/**
	 * The total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MulticastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 multicastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MulticastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 multicastPacketsReceived;
	/**
	 * The total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "BroadcastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 broadcastPacketsSent;
	/**
	 * The total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "BroadcastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 broadcastPacketsReceived;
	/**
	 * The total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.

          More specifically, this is the total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.4
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

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes transmitted out of the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted out of the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes transmitted or retransmitted by the node through a physical medium (i.e., PMI defined in {{bibref|G.9960|Clause 5.2.1}}), which correspond to data LPDUs (i.e., data packets) and framing overhead (e.g., LFH, LPH, LPCS defined in {{bibref|G.9961|Clause 8.1}}). It does not include transmitted bytes contributed by management LPDUs (i.e., management packets).

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 * @param bytesSent the input value
	 * @return this instance
	 */
	public Stats withBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received on the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It can include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It can include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received on the interface, including framing characters.

          More specifically, this is the total number of MPDU bytes received by the node through a physical medium, which correspond to data LPDUs and framing overhead. It does not include received bytes contributed by management LPDUs. It can include blocks with errors.

          Note: LPDUs in mixed LLC frame blocks are considered data LPDUs.
	 *
	 * @since 2.4
	 * @param bytesReceived the input value
	 * @return this instance
	 */
	public Stats withBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
		return this;
	}

	/**
	 * Get the total number of packets transmitted out of the interface.

          More specifically, this is the total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.

          More specifically, this is the total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.4
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of packets transmitted out of the interface.

          More specifically, this is the total number of APDUs requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) that were transmitted by the node through the physical medium. It does not include transmitted LCDUs.
	 *
	 * @since 2.4
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Stats withPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the total number of packets received on the interface.

          More specifically, this is the total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.

          More specifically, this is the total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.4
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of packets received on the interface.

          More specifically, this is the total number of APDUs delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) that were received by the node through the physical medium. It does not include received LCDUs.
	 *
	 * @since 2.4
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets that could not be transmitted because of errors.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.4
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}) but could not be transmitted because of errors (e.g., APDUs containing CRC errors).
	 *
	 * @since 2.4
	 * @param errorsSent the input value
	 * @return this instance
	 */
	public Stats withErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.

          More specifically, this is the total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter32 getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.

          More specifically, this is the total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.4
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being delivered to a higher-layer protocol.

          More specifically, this is the total number of received APDUs that contained errors preventing them from being delivered to a higher layer (i.e., inbound APDUs at the x1 reference point defined in {{bibref|G.9960|Clause 5.2.1}}). The possible causes of error are: incorrect CRC, incorrect MIC, incorrect MIC size, and incorrect size of packet.
	 *
	 * @since 2.4
	 * @param errorsReceived the input value
	 * @return this instance
	 */
	public Stats withErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
		return this;
	}

	/**
	 * Get the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getUnicastPacketsSent() {
		return unicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @param unicastPacketsSent the input value
	 */
	public void  setUnicastPacketsSent(StatsCounter64 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @param unicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsSent(StatsCounter64 unicastPacketsSent) {
		this.unicastPacketsSent = unicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getUnicastPacketsReceived() {
		return unicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.4
	 * @param unicastPacketsReceived the input value
	 */
	public void  setUnicastPacketsReceived(StatsCounter64 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were not addressed to a multicast or broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a unicast address at this layer.
	 *
	 * @since 2.4
	 * @param unicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnicastPacketsReceived(StatsCounter64 unicastPacketsReceived) {
		this.unicastPacketsReceived = unicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsSent() {
		return discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.4
	 * @param discardPacketsSent the input value
	 */
	public void  setDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) but chosen to be discarded even though no errors had been detected to prevent their being transmitted (e.g., buffer overflow).
	 *
	 * @since 2.4
	 * @param discardPacketsSent the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsReceived() {
		return discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.4
	 * @param discardPacketsReceived the input value
	 */
	public void  setDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to  prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.

          More specifically, this is the total number of received APDUs that were chosen to be discarded even though no errors had been detected to prevent their being delivered.
	 *
	 * @since 2.4
	 * @param discardPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getMulticastPacketsSent() {
		return multicastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @param multicastPacketsSent the input value
	 */
	public void  setMulticastPacketsSent(StatsCounter64 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a multicast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @param multicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsSent(StatsCounter64 multicastPacketsSent) {
		this.multicastPacketsSent = multicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getMulticastPacketsReceived() {
		return multicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.4
	 * @param multicastPacketsReceived the input value
	 */
	public void  setMulticastPacketsReceived(StatsCounter64 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a multicast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a multicast address at this layer.
	 *
	 * @since 2.4
	 * @param multicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withMulticastPacketsReceived(StatsCounter64 multicastPacketsReceived) {
		this.multicastPacketsReceived = multicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getBroadcastPacketsSent() {
		return broadcastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @param broadcastPacketsSent the input value
	 */
	public void  setBroadcastPacketsSent(StatsCounter64 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
	}

	/**
	 * Set the total number of packets that higher-level protocols requested for transmission and which were addressed to a broadcast address at this layer, including those that were discarded or not sent.

          More specifically, this is the total number of APDUs that were requested for transmission by a higher layer (i.e., outbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer. It includes APDUs that were discarded or not sent.
	 *
	 * @since 2.4
	 * @param broadcastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsSent(StatsCounter64 broadcastPacketsSent) {
		this.broadcastPacketsSent = broadcastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter64 getBroadcastPacketsReceived() {
		return broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.4
	 * @param broadcastPacketsReceived the input value
	 */
	public void  setBroadcastPacketsReceived(StatsCounter64 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets, delivered by this layer to a higher layer, which were addressed to a broadcast address at this layer.

          More specifically, this is the total number of received APDUs that were delivered to a higher layer (i.e., inbound APDUs at the x1 reference point) and which were addressed to a broadcast address at this layer.
	 *
	 * @since 2.4
	 * @param broadcastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withBroadcastPacketsReceived(StatsCounter64 broadcastPacketsReceived) {
		this.broadcastPacketsReceived = broadcastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.

          More specifically, this is the total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public StatsCounter32 getUnknownProtoPacketsReceived() {
		return unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.

          More specifically, this is the total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.4
	 * @param unknownProtoPacketsReceived the input value
	 */
	public void  setUnknownProtoPacketsReceived(StatsCounter32 unknownProtoPacketsReceived) {
		this.unknownProtoPacketsReceived = unknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets received via the interface which were discarded because of an unknown or unsupported  protocol.

          More specifically, this is the total number of APDUs received by the management that were discarded because of an unknown or unsupported protocol.
	 *
	 * @since 2.4
	 * @param unknownProtoPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withUnknownProtoPacketsReceived(StatsCounter32 unknownProtoPacketsReceived) {
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
	public Stats withMgmtBytesSent(StatsCounter64 mgmtBytesSent) {
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
	public Stats withMgmtBytesReceived(StatsCounter64 mgmtBytesReceived) {
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
	public Stats withMgmtPacketsSent(StatsCounter64 mgmtPacketsSent) {
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
	public Stats withMgmtPacketsReceived(StatsCounter64 mgmtPacketsReceived) {
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
	public Stats withBlocksSent(StatsCounter64 blocksSent) {
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
	public Stats withBlocksReceived(StatsCounter64 blocksReceived) {
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
	public Stats withBlocksResent(StatsCounter32 blocksResent) {
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
	public Stats withBlocksErrorsReceived(StatsCounter32 blocksErrorsReceived) {
		this.blocksErrorsReceived = blocksErrorsReceived;
		return this;
	}

	//</editor-fold>

}