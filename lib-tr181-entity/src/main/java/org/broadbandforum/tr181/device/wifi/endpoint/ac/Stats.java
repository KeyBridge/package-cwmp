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
package org.broadbandforum.tr181.device.wifi.endpoint.ac;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * This object contains statistics for different 802.11e access categories (priorities).

        Packet counters here count 802.11 WiFi frames. 

        If there are not separate stats for each access category, (e.g., 802.11e is not used and there is only one queue), then only access category 0 = BE applies (e.g., the statistics for the single queue are in access category 0 = BE).

        The CPE MUST reset the EndPoint's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the EndPoint becomes operationally down due to a previous administrative down (i.e. the EndPoint's Status parameter transitions to a Diasbled state) or when the EndPoint becomes administratively up (i.e. the EndPoint's Enable parameter transitions from false to true). Administrative and operational status is discussed in [Section 4.2.2/TR-181i2].
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.WiFi.EndPoint.{i}.AC.{i}.Stats.")
public class Stats {

	/**
	 * The total number of {{units}} transmitted in this access category, including framing characters.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesSent")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of {{units}} received in this access category, including framing characters.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesReceived")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of {{units}} transmitted in this access category.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsSent")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of {{units}} received in this access category.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of outbound {{units}} in this access category that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsSent")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of inbound {{units}} in this access category that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsReceived")
	public StatsCounter32 errorsReceived;
	/**
	 * The total number of outbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardPacketsSent")
	public StatsCounter32 discardPacketsSent;
	/**
	 * The total number of inbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DiscardPacketsReceived")
	public StatsCounter32 discardPacketsReceived;
	/**
	 * The total number of transmitted {{units}} in this access category which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RetransCount")
	public StatsCounter32 retransCount;
	/**
	 * {{list}} Histogram of the total length of the transmit queue of this access category in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|#.OutQLenHistogramIntervals}}, with samples taken each {{param|#.OutQLenHistogramSampleInterval}}. Example: "12,5,1,0,2,0,0,1"
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "OutQLenHistogram")
	@XmlList
	public Collection<String> outQLenHistogram;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of {{units}} transmitted in this access category, including framing characters.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of {{units}} transmitted in this access category, including framing characters.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of {{units}} transmitted in this access category, including framing characters.
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
	 * Get the total number of {{units}} received in this access category, including framing characters.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received in this access category, including framing characters.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of {{units}} received in this access category, including framing characters.
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
	 * Get the total number of {{units}} transmitted in this access category.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of {{units}} transmitted in this access category.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of {{units}} transmitted in this access category.
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
	 * Get the total number of {{units}} received in this access category.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received in this access category.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of {{units}} received in this access category.
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
	 * Get the total number of outbound {{units}} in this access category that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of outbound {{units}} in this access category that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of outbound {{units}} in this access category that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
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
	 * Get the total number of inbound {{units}} in this access category that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsReceived() {
		return errorsReceived;
	}

	/**
	 * Set the total number of inbound {{units}} in this access category that contained errors preventing them from being delivered to a higher-layer protocol.
	 *
	 * @since 2.8
	 * @param errorsReceived the input value
	 */
	public void  setErrorsReceived(StatsCounter32 errorsReceived) {
		this.errorsReceived = errorsReceived;
	}

	/**
	 * Set the total number of inbound {{units}} in this access category that contained errors preventing them from being delivered to a higher-layer protocol.
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
	 * Get the total number of outbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsSent() {
		return discardPacketsSent;
	}

	/**
	 * Set the total number of outbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @param discardPacketsSent the input value
	 */
	public void  setDiscardPacketsSent(StatsCounter32 discardPacketsSent) {
		this.discardPacketsSent = discardPacketsSent;
	}

	/**
	 * Set the total number of outbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being transmitted. One possible reason for discarding such a packet could be to free up buffer space.
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
	 * Get the total number of inbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getDiscardPacketsReceived() {
		return discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
	 *
	 * @since 2.8
	 * @param discardPacketsReceived the input value
	 */
	public void  setDiscardPacketsReceived(StatsCounter32 discardPacketsReceived) {
		this.discardPacketsReceived = discardPacketsReceived;
	}

	/**
	 * Set the total number of inbound {{units}} in this access category which were chosen to be discarded even though no errors had been detected to prevent their being delivered. One possible reason for discarding such a packet could be to free up buffer space.
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
	 * Get the total number of transmitted {{units}} in this access category which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getRetransCount() {
		return retransCount;
	}

	/**
	 * Set the total number of transmitted {{units}} in this access category which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
	 *
	 * @since 2.8
	 * @param retransCount the input value
	 */
	public void  setRetransCount(StatsCounter32 retransCount) {
		this.retransCount = retransCount;
	}

	/**
	 * Set the total number of transmitted {{units}} in this access category which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
	 *
	 * @since 2.8
	 * @param retransCount the input value
	 * @return this instance
	 */
	public Stats withRetransCount(StatsCounter32 retransCount) {
		this.retransCount = retransCount;
		return this;
	}

	/**
	 * Get the {{list}} Histogram of the total length of the transmit queue of this access category in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|#.OutQLenHistogramIntervals}}, with samples taken each {{param|#.OutQLenHistogramSampleInterval}}. Example: "12,5,1,0,2,0,0,1"
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getOutQLenHistogram() {
		if (this.outQLenHistogram == null){ this.outQLenHistogram=new ArrayList<>();}
		return outQLenHistogram;
	}

	/**
	 * Set the {{list}} Histogram of the total length of the transmit queue of this access category in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|#.OutQLenHistogramIntervals}}, with samples taken each {{param|#.OutQLenHistogramSampleInterval}}. Example: "12,5,1,0,2,0,0,1"
	 *
	 * @since 2.8
	 * @param outQLenHistogram the input value
	 */
	public void  setOutQLenHistogram(Collection<String> outQLenHistogram) {
		this.outQLenHistogram = outQLenHistogram;
	}

	/**
	 * Set the {{list}} Histogram of the total length of the transmit queue of this access category in packets (1 packet, 2 packets, etc.) according to the intervals defined by {{param|#.OutQLenHistogramIntervals}}, with samples taken each {{param|#.OutQLenHistogramSampleInterval}}. Example: "12,5,1,0,2,0,0,1"
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Stats withOutQLenHistogram(String string) {
		getOutQLenHistogram().add(string);
		return this;
	}

	//</editor-fold>

}