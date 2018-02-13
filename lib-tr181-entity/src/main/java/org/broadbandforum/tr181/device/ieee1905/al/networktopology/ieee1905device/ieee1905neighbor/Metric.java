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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.ieee1905neighbor;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.datatypes.StatsCounter32;

	/**
	 * This object represents the metrics included in a Link metric response from the IEEE1905Device where {{param|#.LocalInterface}} is the MAC address of an interface in the receiving 1905 AL as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.IEEE1905Neighbor.{i}.Metric.{i}.")
@XmlRootElement(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.IEEE1905Neighbor.Metric")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.IEEE1905Neighbor.Metric")
@XmlAccessorType(XmlAccessType.FIELD)
public class Metric {

	/**
	 * The MAC address of an interface in a neighbor 1905 device as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV or Table 6-19: 1905 receiver link metric TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NeighborMACAddress")
	public MACAddress neighborMACAddress;
	/**
	 * Indicates whether or not the 1905 link includes one or more IEEE 802.1 bridges. If {{false}}, the 1905 link does not include an IEEE 802.1 bridge. If {{true}}, the 1905 link does include one or more IEEE 802.1 bridges.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IEEE802dot1Bridge")
	public Boolean ieeE802dot1Bridge;
	/**
	 * Estimated number of lost {{units}} on the transmit side of the link {{bibref|IEEE1905.1a|Table 6-18: 1905 transmitter link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PacketErrors")
	public StatsCounter32 packetErrors;
	/**
	 * Estimated number of lost {{units}} on the receive side of the link {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PacketErrorsReceived")
	public StatsCounter32 packetErrorsReceived;
	/**
	 * Estimated number of {{units}} sent to the Neighbor on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TransmittedPackets")
	public StatsCounter32 transmittedPackets;
	/**
	 * Estimated number of {{units}} received from this Neighbor {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PacketsReceived")
	public StatsCounter32 packetsReceived;
	/**
	 * The maximum MAC throughput in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MACThroughputCapacity")
	public Long macThroughputCapacity;
	/**
	 * The estimated average percent of time that this link is idle.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LinkAvailability")
	@Size(min = 0, max = 100)
	public Long linkAvailability;
	/**
	 * The Physical Layer (PHY) rate in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PHYRate")
	public Long phyRate;
	/**
	 * The estimated Received Signal Strength Indicator (RSSI) ratio in dB between this Interface and the Neighbor on this link that is estimated at the receive side of this Interface.  Note: This parameter is valid only for IEEE 802.11 Neighbors.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "RSSI")
	@Size(min = 0, max = 255)
	public Long rssI;

	public Metric() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the MAC address of an interface in a neighbor 1905 device as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV or Table 6-19: 1905 receiver link metric TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getNeighborMACAddress() {
		return neighborMACAddress;
	}

	/**
	 * Set the MAC address of an interface in a neighbor 1905 device as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV or Table 6-19: 1905 receiver link metric TLV}}.
	 *
	 * @since 2.9
	 * @param neighborMACAddress the input value
	 */
	public void  setNeighborMACAddress(MACAddress neighborMACAddress) {
		this.neighborMACAddress = neighborMACAddress;
	}

	/**
	 * Set the MAC address of an interface in a neighbor 1905 device as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV or Table 6-19: 1905 receiver link metric TLV}}.
	 *
	 * @since 2.9
	 * @param neighborMACAddress the input value
	 * @return this instance
	 */
	public Metric withNeighborMACAddress(MACAddress neighborMACAddress) {
		this.neighborMACAddress = neighborMACAddress;
		return this;
	}

	/**
	 * Get the indicates whether or not the 1905 link includes one or more IEEE 802.1 bridges. If {{false}}, the 1905 link does not include an IEEE 802.1 bridge. If {{true}}, the 1905 link does include one or more IEEE 802.1 bridges.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isIeeE802dot1Bridge() {
		return ieeE802dot1Bridge;
	}

	/**
	 * Set the indicates whether or not the 1905 link includes one or more IEEE 802.1 bridges. If {{false}}, the 1905 link does not include an IEEE 802.1 bridge. If {{true}}, the 1905 link does include one or more IEEE 802.1 bridges.
	 *
	 * @since 2.9
	 * @param ieeE802dot1Bridge the input value
	 */
	public void  setIeeE802dot1Bridge(Boolean ieeE802dot1Bridge) {
		this.ieeE802dot1Bridge = ieeE802dot1Bridge;
	}

	/**
	 * Set the indicates whether or not the 1905 link includes one or more IEEE 802.1 bridges. If {{false}}, the 1905 link does not include an IEEE 802.1 bridge. If {{true}}, the 1905 link does include one or more IEEE 802.1 bridges.
	 *
	 * @since 2.9
	 * @param ieeE802dot1Bridge the input value
	 * @return this instance
	 */
	public Metric withIeeE802dot1Bridge(Boolean ieeE802dot1Bridge) {
		this.ieeE802dot1Bridge = ieeE802dot1Bridge;
		return this;
	}

	/**
	 * Get the estimated number of lost {{units}} on the transmit side of the link {{bibref|IEEE1905.1a|Table 6-18: 1905 transmitter link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public StatsCounter32 getPacketErrors() {
		return packetErrors;
	}

	/**
	 * Set the estimated number of lost {{units}} on the transmit side of the link {{bibref|IEEE1905.1a|Table 6-18: 1905 transmitter link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 * @param packetErrors the input value
	 */
	public void  setPacketErrors(StatsCounter32 packetErrors) {
		this.packetErrors = packetErrors;
	}

	/**
	 * Set the estimated number of lost {{units}} on the transmit side of the link {{bibref|IEEE1905.1a|Table 6-18: 1905 transmitter link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 * @param packetErrors the input value
	 * @return this instance
	 */
	public Metric withPacketErrors(StatsCounter32 packetErrors) {
		this.packetErrors = packetErrors;
		return this;
	}

	/**
	 * Get the estimated number of lost {{units}} on the receive side of the link {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public StatsCounter32 getPacketErrorsReceived() {
		return packetErrorsReceived;
	}

	/**
	 * Set the estimated number of lost {{units}} on the receive side of the link {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 * @param packetErrorsReceived the input value
	 */
	public void  setPacketErrorsReceived(StatsCounter32 packetErrorsReceived) {
		this.packetErrorsReceived = packetErrorsReceived;
	}

	/**
	 * Set the estimated number of lost {{units}} on the receive side of the link {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} during a measurement period.
	 *
	 * @since 2.9
	 * @param packetErrorsReceived the input value
	 * @return this instance
	 */
	public Metric withPacketErrorsReceived(StatsCounter32 packetErrorsReceived) {
		this.packetErrorsReceived = packetErrorsReceived;
		return this;
	}

	/**
	 * Get the estimated number of {{units}} sent to the Neighbor on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public StatsCounter32 getTransmittedPackets() {
		return transmittedPackets;
	}

	/**
	 * Set the estimated number of {{units}} sent to the Neighbor on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 * @param transmittedPackets the input value
	 */
	public void  setTransmittedPackets(StatsCounter32 transmittedPackets) {
		this.transmittedPackets = transmittedPackets;
	}

	/**
	 * Set the estimated number of {{units}} sent to the Neighbor on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 * @param transmittedPackets the input value
	 * @return this instance
	 */
	public Metric withTransmittedPackets(StatsCounter32 transmittedPackets) {
		this.transmittedPackets = transmittedPackets;
		return this;
	}

	/**
	 * Get the estimated number of {{units}} received from this Neighbor {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public StatsCounter32 getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the estimated number of {{units}} received from this Neighbor {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(StatsCounter32 packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the estimated number of {{units}} received from this Neighbor {{bibref|IEEE1905.1a|Table 6-20: 1905 receiver link metrics}} on this link, in the same measurement period used to estimate {{param|PacketErrors}}.
	 *
	 * @since 2.9
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Metric withPacketsReceived(StatsCounter32 packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the maximum MAC throughput in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getMacThroughputCapacity() {
		return macThroughputCapacity;
	}

	/**
	 * Set the maximum MAC throughput in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 * @param macThroughputCapacity the input value
	 */
	public void  setMacThroughputCapacity(Long macThroughputCapacity) {
		this.macThroughputCapacity = macThroughputCapacity;
	}

	/**
	 * Set the maximum MAC throughput in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 * @param macThroughputCapacity the input value
	 * @return this instance
	 */
	public Metric withMacThroughputCapacity(Long macThroughputCapacity) {
		this.macThroughputCapacity = macThroughputCapacity;
		return this;
	}

	/**
	 * Get the estimated average percent of time that this link is idle.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getLinkAvailability() {
		return linkAvailability;
	}

	/**
	 * Set the estimated average percent of time that this link is idle.
	 *
	 * @since 2.9
	 * @param linkAvailability the input value
	 */
	public void  setLinkAvailability(Long linkAvailability) {
		this.linkAvailability = linkAvailability;
	}

	/**
	 * Set the estimated average percent of time that this link is idle.
	 *
	 * @since 2.9
	 * @param linkAvailability the input value
	 * @return this instance
	 */
	public Metric withLinkAvailability(Long linkAvailability) {
		this.linkAvailability = linkAvailability;
		return this;
	}

	/**
	 * Get the Physical Layer (PHY) rate in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getPhyRate() {
		return phyRate;
	}

	/**
	 * Set the Physical Layer (PHY) rate in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 * @param phyRate the input value
	 */
	public void  setPhyRate(Long phyRate) {
		this.phyRate = phyRate;
	}

	/**
	 * Set the Physical Layer (PHY) rate in Mb/s between this Interface and the Neighbor on this link that is estimated at this Interface.
	 *
	 * @since 2.9
	 * @param phyRate the input value
	 * @return this instance
	 */
	public Metric withPhyRate(Long phyRate) {
		this.phyRate = phyRate;
		return this;
	}

	/**
	 * Get the estimated Received Signal Strength Indicator (RSSI) ratio in dB between this Interface and the Neighbor on this link that is estimated at the receive side of this Interface.  Note: This parameter is valid only for IEEE 802.11 Neighbors.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getRssI() {
		return rssI;
	}

	/**
	 * Set the estimated Received Signal Strength Indicator (RSSI) ratio in dB between this Interface and the Neighbor on this link that is estimated at the receive side of this Interface.  Note: This parameter is valid only for IEEE 802.11 Neighbors.
	 *
	 * @since 2.9
	 * @param rssI the input value
	 */
	public void  setRssI(Long rssI) {
		this.rssI = rssI;
	}

	/**
	 * Set the estimated Received Signal Strength Indicator (RSSI) ratio in dB between this Interface and the Neighbor on this link that is estimated at the receive side of this Interface.  Note: This parameter is valid only for IEEE 802.11 Neighbors.
	 *
	 * @since 2.9
	 * @param rssI the input value
	 * @return this instance
	 */
	public Metric withRssI(Long rssI) {
		this.rssI = rssI;
		return this;
	}

	//</editor-fold>

}