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
package org.broadbandforum.tr181.device.hpna.diagnostics.performancemonitoring.channels;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.MACAddress;

	/**
	 * Per-channel HPNA performance monitoring results.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.HPNA.Diagnostics.PerformanceMonitoring.Channels.Channel.{i}.", uniqueConstraints = {@CWMPUnique(names = {"HostSrcMACAddress", "HostDestMACAddress"})})
@XmlRootElement(name = "Device.HPNA.Diagnostics.PerformanceMonitoring.Channels.Channel")
@XmlType(name = "Device.HPNA.Diagnostics.PerformanceMonitoring.Channels.Channel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Channel {

	/**
	 * The host source MAC address associated with the channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HostSrcMACAddress")
	public MACAddress hostSrcMACAddress;
	/**
	 * The host destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HostDestMACAddress")
	public MACAddress hostDestMACAddress;
	/**
	 * The HPNA source MAC address associated with the channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HPNASrcMACAddress")
	public MACAddress hpnASrcMACAddress;
	/**
	 * The HPNA destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HPNADestMACAddress")
	public MACAddress hpnADestMACAddress;
	/**
	 * Channel PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PHYRate")
	public Long phyRate;
	/**
	 * PHY Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BaudRate")
	public Long baudRate;
	/**
	 * Channel actual SNR measured in receiver side (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNR")
	public Long snr;
	/**
	 * Number of packets sent in the channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsSent")
	public Long packetsSent;
	/**
	 * Pre-LARQ number of packets received in the channel.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceived")
	public Long packetsReceived;
	/**
	 * Post-LARQ number of packets received in the channel. Valid only if LARQ is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LARQPacketsReceived")
	public Long larqPacketsReceived;
	/**
	 * {{reference}} Identifies the ''FlowSpec'' associated with the channel. This parameter is only used for channels that correspond to egress traffic from the local HPNA interface.

          {{null}} means that the channel is not associated with any specified flow specification in the QoS object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FlowSpec")
	@Size(max = 256)
	public String flowSpec;

	public Channel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the host source MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getHostSrcMACAddress() {
		return hostSrcMACAddress;
	}

	/**
	 * Set the host source MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hostSrcMACAddress the input value
	 */
	public void  setHostSrcMACAddress(MACAddress hostSrcMACAddress) {
		this.hostSrcMACAddress = hostSrcMACAddress;
	}

	/**
	 * Set the host source MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hostSrcMACAddress the input value
	 * @return this instance
	 */
	public Channel withHostSrcMACAddress(MACAddress hostSrcMACAddress) {
		this.hostSrcMACAddress = hostSrcMACAddress;
		return this;
	}

	/**
	 * Get the host destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getHostDestMACAddress() {
		return hostDestMACAddress;
	}

	/**
	 * Set the host destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hostDestMACAddress the input value
	 */
	public void  setHostDestMACAddress(MACAddress hostDestMACAddress) {
		this.hostDestMACAddress = hostDestMACAddress;
	}

	/**
	 * Set the host destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hostDestMACAddress the input value
	 * @return this instance
	 */
	public Channel withHostDestMACAddress(MACAddress hostDestMACAddress) {
		this.hostDestMACAddress = hostDestMACAddress;
		return this;
	}

	/**
	 * Get the HPNA source MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getHpnASrcMACAddress() {
		return hpnASrcMACAddress;
	}

	/**
	 * Set the HPNA source MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hpnASrcMACAddress the input value
	 */
	public void  setHpnASrcMACAddress(MACAddress hpnASrcMACAddress) {
		this.hpnASrcMACAddress = hpnASrcMACAddress;
	}

	/**
	 * Set the HPNA source MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hpnASrcMACAddress the input value
	 * @return this instance
	 */
	public Channel withHpnASrcMACAddress(MACAddress hpnASrcMACAddress) {
		this.hpnASrcMACAddress = hpnASrcMACAddress;
		return this;
	}

	/**
	 * Get the HPNA destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getHpnADestMACAddress() {
		return hpnADestMACAddress;
	}

	/**
	 * Set the HPNA destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hpnADestMACAddress the input value
	 */
	public void  setHpnADestMACAddress(MACAddress hpnADestMACAddress) {
		this.hpnADestMACAddress = hpnADestMACAddress;
	}

	/**
	 * Set the HPNA destination MAC address associated with the channel.
	 *
	 * @since 2.0
	 * @param hpnADestMACAddress the input value
	 * @return this instance
	 */
	public Channel withHpnADestMACAddress(MACAddress hpnADestMACAddress) {
		this.hpnADestMACAddress = hpnADestMACAddress;
		return this;
	}

	/**
	 * Get the channel PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyRate() {
		return phyRate;
	}

	/**
	 * Set the channel PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param phyRate the input value
	 */
	public void  setPhyRate(Long phyRate) {
		this.phyRate = phyRate;
	}

	/**
	 * Set the channel PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param phyRate the input value
	 * @return this instance
	 */
	public Channel withPhyRate(Long phyRate) {
		this.phyRate = phyRate;
		return this;
	}

	/**
	 * Get the phy Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBaudRate() {
		return baudRate;
	}

	/**
	 * Set the phy Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 * @param baudRate the input value
	 */
	public void  setBaudRate(Long baudRate) {
		this.baudRate = baudRate;
	}

	/**
	 * Set the phy Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 * @param baudRate the input value
	 * @return this instance
	 */
	public Channel withBaudRate(Long baudRate) {
		this.baudRate = baudRate;
		return this;
	}

	/**
	 * Get the channel actual SNR measured in receiver side (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnr() {
		return snr;
	}

	/**
	 * Set the channel actual SNR measured in receiver side (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param snr the input value
	 */
	public void  setSnr(Long snr) {
		this.snr = snr;
	}

	/**
	 * Set the channel actual SNR measured in receiver side (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param snr the input value
	 * @return this instance
	 */
	public Channel withSnr(Long snr) {
		this.snr = snr;
		return this;
	}

	/**
	 * Get the number of packets sent in the channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsSent() {
		return packetsSent;
	}

	/**
	 * Set the number of packets sent in the channel.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 */
	public void  setPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
	}

	/**
	 * Set the number of packets sent in the channel.
	 *
	 * @since 2.0
	 * @param packetsSent the input value
	 * @return this instance
	 */
	public Channel withPacketsSent(Long packetsSent) {
		this.packetsSent = packetsSent;
		return this;
	}

	/**
	 * Get the pre-LARQ number of packets received in the channel.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the pre-LARQ number of packets received in the channel.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the pre-LARQ number of packets received in the channel.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Channel withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the post-LARQ number of packets received in the channel. Valid only if LARQ is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLarqPacketsReceived() {
		return larqPacketsReceived;
	}

	/**
	 * Set the post-LARQ number of packets received in the channel. Valid only if LARQ is enabled.
	 *
	 * @since 2.0
	 * @param larqPacketsReceived the input value
	 */
	public void  setLarqPacketsReceived(Long larqPacketsReceived) {
		this.larqPacketsReceived = larqPacketsReceived;
	}

	/**
	 * Set the post-LARQ number of packets received in the channel. Valid only if LARQ is enabled.
	 *
	 * @since 2.0
	 * @param larQPacketsReceived the input value
	 * @return this instance
	 */
	public Channel withLarQPacketsReceived(Long larQPacketsReceived) {
		this.larqPacketsReceived = larQPacketsReceived;
		return this;
	}

	/**
	 * Get the {{reference}} Identifies the ''FlowSpec'' associated with the channel. This parameter is only used for channels that correspond to egress traffic from the local HPNA interface.

          {{null}} means that the channel is not associated with any specified flow specification in the QoS object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFlowSpec() {
		return flowSpec;
	}

	/**
	 * Set the {{reference}} Identifies the ''FlowSpec'' associated with the channel. This parameter is only used for channels that correspond to egress traffic from the local HPNA interface.

          {{null}} means that the channel is not associated with any specified flow specification in the QoS object.
	 *
	 * @since 2.0
	 * @param flowSpec the input value
	 */
	public void  setFlowSpec(String flowSpec) {
		this.flowSpec = flowSpec;
	}

	/**
	 * Set the {{reference}} Identifies the ''FlowSpec'' associated with the channel. This parameter is only used for channels that correspond to egress traffic from the local HPNA interface.

          {{null}} means that the channel is not associated with any specified flow specification in the QoS object.
	 *
	 * @since 2.0
	 * @param flowSpec the input value
	 * @return this instance
	 */
	public Channel withFlowSpec(String flowSpec) {
		this.flowSpec = flowSpec;
		return this;
	}

	//</editor-fold>

}