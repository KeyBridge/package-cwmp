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
package org.broadbandforum.tr181.device.wifi.radio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Throughput statistics for this interface. Packet counters here count 802.11 WiFi frames. See {{bibref|TR-181i2a5|Appendix III}} for further details. The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2a5|Section 4.2.2}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.Radio.{i}.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "Device.WiFi.Radio.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
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
	 * The number of packets that were received with a detected Physical Layer Convergence Protocol (PLCP) header error.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PLCPErrorCount")
	public Long plcPErrorCount;
	/**
	 * The number of packets that were received with a detected FCS error. This parameter is based on dot11FCSErrorCount from {{bibref|802.11-2012|Annex C}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "FCSErrorCount")
	public Long fcsErrorCount;
	/**
	 * The number of packets that were received with a detected invalid MAC header error.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "InvalidMACCount")
	public Long invalidMACCount;
	/**
	 * The number of packets that were received, but which were destined for a MAC address that is not associated with this interface.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PacketsOtherReceived")
	public Long packetsOtherReceived;
	/**
	 * An indicator of average noise strength received at this radio, measured in dBm. This measurement of non-IEEE 802.11 noise power is made by sampling the channel when virtual carrier sense indicates idle and this radio is neither transmitting nor receiving a frame.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Noise")
	public Integer noise;

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
	 * Get the number of packets that were received with a detected Physical Layer Convergence Protocol (PLCP) header error.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getPlcPErrorCount() {
		return plcPErrorCount;
	}

	/**
	 * Set the number of packets that were received with a detected Physical Layer Convergence Protocol (PLCP) header error.
	 *
	 * @since 2.7
	 * @param plcPErrorCount the input value
	 */
	public void  setPlcPErrorCount(Long plcPErrorCount) {
		this.plcPErrorCount = plcPErrorCount;
	}

	/**
	 * Set the number of packets that were received with a detected Physical Layer Convergence Protocol (PLCP) header error.
	 *
	 * @since 2.7
	 * @param plcPErrorCount the input value
	 * @return this instance
	 */
	public Stats withPlcPErrorCount(Long plcPErrorCount) {
		this.plcPErrorCount = plcPErrorCount;
		return this;
	}

	/**
	 * Get the number of packets that were received with a detected FCS error. This parameter is based on dot11FCSErrorCount from {{bibref|802.11-2012|Annex C}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getFcsErrorCount() {
		return fcsErrorCount;
	}

	/**
	 * Set the number of packets that were received with a detected FCS error. This parameter is based on dot11FCSErrorCount from {{bibref|802.11-2012|Annex C}}.
	 *
	 * @since 2.7
	 * @param fcsErrorCount the input value
	 */
	public void  setFcsErrorCount(Long fcsErrorCount) {
		this.fcsErrorCount = fcsErrorCount;
	}

	/**
	 * Set the number of packets that were received with a detected FCS error. This parameter is based on dot11FCSErrorCount from {{bibref|802.11-2012|Annex C}}.
	 *
	 * @since 2.7
	 * @param fcsErrorCount the input value
	 * @return this instance
	 */
	public Stats withFcsErrorCount(Long fcsErrorCount) {
		this.fcsErrorCount = fcsErrorCount;
		return this;
	}

	/**
	 * Get the number of packets that were received with a detected invalid MAC header error.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getInvalidMACCount() {
		return invalidMACCount;
	}

	/**
	 * Set the number of packets that were received with a detected invalid MAC header error.
	 *
	 * @since 2.7
	 * @param invalidMACCount the input value
	 */
	public void  setInvalidMACCount(Long invalidMACCount) {
		this.invalidMACCount = invalidMACCount;
	}

	/**
	 * Set the number of packets that were received with a detected invalid MAC header error.
	 *
	 * @since 2.7
	 * @param invalidMACCount the input value
	 * @return this instance
	 */
	public Stats withInvalidMACCount(Long invalidMACCount) {
		this.invalidMACCount = invalidMACCount;
		return this;
	}

	/**
	 * Get the number of packets that were received, but which were destined for a MAC address that is not associated with this interface.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getPacketsOtherReceived() {
		return packetsOtherReceived;
	}

	/**
	 * Set the number of packets that were received, but which were destined for a MAC address that is not associated with this interface.
	 *
	 * @since 2.7
	 * @param packetsOtherReceived the input value
	 */
	public void  setPacketsOtherReceived(Long packetsOtherReceived) {
		this.packetsOtherReceived = packetsOtherReceived;
	}

	/**
	 * Set the number of packets that were received, but which were destined for a MAC address that is not associated with this interface.
	 *
	 * @since 2.7
	 * @param packetsOtherReceived the input value
	 * @return this instance
	 */
	public Stats withPacketsOtherReceived(Long packetsOtherReceived) {
		this.packetsOtherReceived = packetsOtherReceived;
		return this;
	}

	/**
	 * Get an indicator of average noise strength received at this radio, measured in dBm. This measurement of non-IEEE 802.11 noise power is made by sampling the channel when virtual carrier sense indicates idle and this radio is neither transmitting nor receiving a frame.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getNoise() {
		return noise;
	}

	/**
	 * Set an indicator of average noise strength received at this radio, measured in dBm. This measurement of non-IEEE 802.11 noise power is made by sampling the channel when virtual carrier sense indicates idle and this radio is neither transmitting nor receiving a frame.
	 *
	 * @since 2.8
	 * @param noise the input value
	 */
	public void  setNoise(Integer noise) {
		this.noise = noise;
	}

	/**
	 * Set an indicator of average noise strength received at this radio, measured in dBm. This measurement of non-IEEE 802.11 noise power is made by sampling the channel when virtual carrier sense indicates idle and this radio is neither transmitting nor receiving a frame.
	 *
	 * @since 2.8
	 * @param noise the input value
	 * @return this instance
	 */
	public Stats withNoise(Integer noise) {
		this.noise = noise;
		return this;
	}

	//</editor-fold>

}