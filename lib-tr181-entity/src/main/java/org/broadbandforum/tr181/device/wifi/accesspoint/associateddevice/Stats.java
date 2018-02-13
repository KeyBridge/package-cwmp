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
package org.broadbandforum.tr181.device.wifi.accesspoint.associateddevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * These count bytes or packets sent to, or received from, this Associated Device, which is a WiFi station associated to this access point. Packet counters here count 802.11 WiFi frames.

        The CPE MUST reset these {{object}} parameters (unless otherwise stated in individual object or parameter descriptions) either when the {{param|##.Status}} of the parent {{object|##}} object transitions from {{enum|Disabled|##.Status}} to {{enum|Enabled|##.Status}}, or when it transitions from {{enum|Enabled|##.Status}} to {{enum|Disabled|##.Status}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.WiFi.AccessPoint.{i}.AssociatedDevice.{i}.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "Device.WiFi.AccessPoint.AssociatedDevice.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of bytes transmitted to the Associated Device, including framing characters.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesSent")
	public StatsCounter64 bytesSent;
	/**
	 * The total number of bytes received from the Associated Device, including framing characters.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BytesReceived")
	public StatsCounter64 bytesReceived;
	/**
	 * The total number of packets transmitted to the Associated Device.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsSent")
	public StatsCounter64 packetsSent;
	/**
	 * The total number of packets received from the Associated Device.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter64 packetsReceived;
	/**
	 * The total number of outbound packets that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ErrorsSent")
	public StatsCounter32 errorsSent;
	/**
	 * The total number of transmitted packets which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RetransCount")
	public StatsCounter32 retransCount;
	/**
	 * The number of packets that were not transmitted successfully due to the number of retransmission attempts exceeding an 802.11 retry limit. This parameter is based on ''dot11FailedCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "FailedRetransCount")
	public StatsCounter32 failedRetransCount;
	/**
	 * The number of packets that were successfully transmitted after one or more retransmissions. This parameter is based on ''dot11RetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RetryCount")
	public StatsCounter32 retryCount;
	/**
	 * The number of packets that were successfully transmitted after more than one retransmission. This parameter is based on ''dot11MultipleRetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MultipleRetryCount")
	public StatsCounter32 multipleRetryCount;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes transmitted to the Associated Device, including framing characters.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesSent() {
		return bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted to the Associated Device, including framing characters.
	 *
	 * @since 2.8
	 * @param bytesSent the input value
	 */
	public void  setBytesSent(StatsCounter64 bytesSent) {
		this.bytesSent = bytesSent;
	}

	/**
	 * Set the total number of bytes transmitted to the Associated Device, including framing characters.
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
	 * Get the total number of bytes received from the Associated Device, including framing characters.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getBytesReceived() {
		return bytesReceived;
	}

	/**
	 * Set the total number of bytes received from the Associated Device, including framing characters.
	 *
	 * @since 2.8
	 * @param bytesReceived the input value
	 */
	public void  setBytesReceived(StatsCounter64 bytesReceived) {
		this.bytesReceived = bytesReceived;
	}

	/**
	 * Set the total number of bytes received from the Associated Device, including framing characters.
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
	 * Get the total number of packets transmitted to the Associated Device.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the total number of packets transmitted to the Associated Device.
	 *
	 * @since 2.8
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(StatsCounter64 packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the total number of packets transmitted to the Associated Device.
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
	 * Get the total number of packets received from the Associated Device.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter64 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the total number of packets received from the Associated Device.
	 *
	 * @since 2.8
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter64 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the total number of packets received from the Associated Device.
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
	 * Get the total number of outbound packets that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getErrorsSent() {
		return errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
	 *
	 * @since 2.8
	 * @param errorsSent the input value
	 */
	public void  setErrorsSent(StatsCounter32 errorsSent) {
		this.errorsSent = errorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors. These might be due to the number of retransmissions exceeding the retry limit, or from other causes.
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
	 * Get the total number of transmitted packets which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getRetransCount() {
		return retransCount;
	}

	/**
	 * Set the total number of transmitted packets which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
	 *
	 * @since 2.8
	 * @param retransCount the input value
	 */
	public void  setRetransCount(StatsCounter32 retransCount) {
		this.retransCount = retransCount;
	}

	/**
	 * Set the total number of transmitted packets which were retransmissions. Two retransmissions of the same packet results in this counter incrementing by two.
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
	 * Get the number of packets that were not transmitted successfully due to the number of retransmission attempts exceeding an 802.11 retry limit. This parameter is based on ''dot11FailedCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getFailedRetransCount() {
		return failedRetransCount;
	}

	/**
	 * Set the number of packets that were not transmitted successfully due to the number of retransmission attempts exceeding an 802.11 retry limit. This parameter is based on ''dot11FailedCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param failedRetransCount the input value
	 */
	public void  setFailedRetransCount(StatsCounter32 failedRetransCount) {
		this.failedRetransCount = failedRetransCount;
	}

	/**
	 * Set the number of packets that were not transmitted successfully due to the number of retransmission attempts exceeding an 802.11 retry limit. This parameter is based on ''dot11FailedCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param failedRetransCount the input value
	 * @return this instance
	 */
	public Stats withFailedRetransCount(StatsCounter32 failedRetransCount) {
		this.failedRetransCount = failedRetransCount;
		return this;
	}

	/**
	 * Get the number of packets that were successfully transmitted after one or more retransmissions. This parameter is based on ''dot11RetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getRetryCount() {
		return retryCount;
	}

	/**
	 * Set the number of packets that were successfully transmitted after one or more retransmissions. This parameter is based on ''dot11RetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param retryCount the input value
	 */
	public void  setRetryCount(StatsCounter32 retryCount) {
		this.retryCount = retryCount;
	}

	/**
	 * Set the number of packets that were successfully transmitted after one or more retransmissions. This parameter is based on ''dot11RetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param retryCount the input value
	 * @return this instance
	 */
	public Stats withRetryCount(StatsCounter32 retryCount) {
		this.retryCount = retryCount;
		return this;
	}

	/**
	 * Get the number of packets that were successfully transmitted after more than one retransmission. This parameter is based on ''dot11MultipleRetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public StatsCounter32 getMultipleRetryCount() {
		return multipleRetryCount;
	}

	/**
	 * Set the number of packets that were successfully transmitted after more than one retransmission. This parameter is based on ''dot11MultipleRetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param multipleRetryCount the input value
	 */
	public void  setMultipleRetryCount(StatsCounter32 multipleRetryCount) {
		this.multipleRetryCount = multipleRetryCount;
	}

	/**
	 * Set the number of packets that were successfully transmitted after more than one retransmission. This parameter is based on ''dot11MultipleRetryCount'' from {{bibref|802.11-2012}}.
	 *
	 * @since 2.8
	 * @param multipleRetryCount the input value
	 * @return this instance
	 */
	public Stats withMultipleRetryCount(StatsCounter32 multipleRetryCount) {
		this.multipleRetryCount = multipleRetryCount;
		return this;
	}

	//</editor-fold>

}