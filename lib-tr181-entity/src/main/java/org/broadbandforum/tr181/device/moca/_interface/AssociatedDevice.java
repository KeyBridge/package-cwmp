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
package org.broadbandforum.tr181.device.moca._interface;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This table contains information about other MoCA devices currently associated with this MoCA interface.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.MoCA.Interface.{i}.AssociatedDevice.{i}.")
public class AssociatedDevice {

	/**
	 * The MAC address of the associated device's MoCA interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * The Node ID of this remote device.

          This parameter is based on ''mocaNodeIndex'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NodeID")
	public Long nodeID;
	/**
	 * Whether this remote device is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaNodePreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PreferredNC")
	public Boolean preferredNC;
	/**
	 * Identifies the highest MoCA version that this remote device supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaNodeMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HighestVersion")
	@Size(max = 64)
	@Pattern(regexp = "\\d+(\\.\\d+)*")
	public String highestVersion;
	/**
	 * The PHY transmit rate (in Mbps) to this remote device.

          This parameter is based on ''mocaMeshTxRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PHYTxRate")
	public Long phyTxRate;
	/**
	 * The PHY receive rate (in Mbps) from this remote device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PHYRxRate")
	public Long phyRxRate;
	/**
	 * The reduction in transmitter level (in dB) due to power control.

          This parameter is based on ''mocaNodeTxPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxPowerControlReduction")
	public Long txpowerControlReduction;
	/**
	 * The power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxPowerLevel")
	@CWMPParameter(activeNotify = "canDeny", units = "dBm")
	public Long rxpowerLevel;
	/**
	 * The broadcast PHY transmit rate (in Mbps) from this remote device.

          This parameter is based on ''mocaNodeTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxBcastRate")
	public Long txbcastRate;
	/**
	 * The power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxGcdPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxBcastPowerLevel")
	@CWMPParameter(activeNotify = "canDeny", units = "dBm")
	public Long rxbcastPowerLevel;
	/**
	 * The number of packets transmitted to this remote device (Note: Includes Broadcast, Multicast and Unicast packets).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long txpackets;
	/**
	 * The number of packets received from this remote device (Note: Includes Broadcast, Multicast and Unicast packets).

          This parameter is based on ''mocaNodeRxPackets'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long rxpackets;
	/**
	 * The number of errored and missed packets received from this remote device.

          This parameter is based on ''mocaNodeRxDrops'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxErroredAndMissedPackets")
	public Long rxerroredAndMissedPackets;
	/**
	 * Whether this remote device supports the 256 QAM feature.

          This parameter is based on ''mocaNodeQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QAM256Capable")
	public Boolean qam256Capable;
	/**
	 * The packet aggregation capability supported by the remote device. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaNodePacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketAggregationCapability")
	@Size(min = 0, max = 10)
	public Long packetAggregationCapability;
	/**
	 * The signal to noise level (in dBm) received at this interface from this remote device.

          This parameter is based on ''mocaNodeSNR'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxSNR")
	public Long rxsNR;
	/**
	 * Whether or not this remote device is currently present in the MoCA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;

	public AssociatedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the MAC address of the associated device's MoCA interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the MAC address of the associated device's MoCA interface.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the MAC address of the associated device's MoCA interface.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the Node ID of this remote device.

          This parameter is based on ''mocaNodeIndex'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNodeID() {
		return nodeID;
	}

	/**
	 * Set the Node ID of this remote device.

          This parameter is based on ''mocaNodeIndex'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param nodeID the input value
	 */
	public void  setNodeID(Long nodeID) {
		this.nodeID = nodeID;
	}

	/**
	 * Set the Node ID of this remote device.

          This parameter is based on ''mocaNodeIndex'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param nodeID the input value
	 * @return this instance
	 */
	public AssociatedDevice withNodeID(Long nodeID) {
		this.nodeID = nodeID;
		return this;
	}

	/**
	 * Get the whether this remote device is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaNodePreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPreferredNC() {
		return preferredNC;
	}

	/**
	 * Set the whether this remote device is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaNodePreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param preferredNC the input value
	 */
	public void  setPreferredNC(Boolean preferredNC) {
		this.preferredNC = preferredNC;
	}

	/**
	 * Set the whether this remote device is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaNodePreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param preferredNC the input value
	 * @return this instance
	 */
	public AssociatedDevice withPreferredNC(Boolean preferredNC) {
		this.preferredNC = preferredNC;
		return this;
	}

	/**
	 * Get the identifies the highest MoCA version that this remote device supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaNodeMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHighestVersion() {
		return highestVersion;
	}

	/**
	 * Set the identifies the highest MoCA version that this remote device supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaNodeMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param highestVersion the input value
	 */
	public void  setHighestVersion(String highestVersion) {
		this.highestVersion = highestVersion;
	}

	/**
	 * Set the identifies the highest MoCA version that this remote device supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaNodeMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param highestVersion the input value
	 * @return this instance
	 */
	public AssociatedDevice withHighestVersion(String highestVersion) {
		this.highestVersion = highestVersion;
		return this;
	}

	/**
	 * Get the PHY transmit rate (in Mbps) to this remote device.

          This parameter is based on ''mocaMeshTxRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyTxRate() {
		return phyTxRate;
	}

	/**
	 * Set the PHY transmit rate (in Mbps) to this remote device.

          This parameter is based on ''mocaMeshTxRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param phyTxRate the input value
	 */
	public void  setPhyTxRate(Long phyTxRate) {
		this.phyTxRate = phyTxRate;
	}

	/**
	 * Set the PHY transmit rate (in Mbps) to this remote device.

          This parameter is based on ''mocaMeshTxRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param phyTxRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withPhyTxRate(Long phyTxRate) {
		this.phyTxRate = phyTxRate;
		return this;
	}

	/**
	 * Get the PHY receive rate (in Mbps) from this remote device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyRxRate() {
		return phyRxRate;
	}

	/**
	 * Set the PHY receive rate (in Mbps) from this remote device.
	 *
	 * @since 2.0
	 * @param phyRxRate the input value
	 */
	public void  setPhyRxRate(Long phyRxRate) {
		this.phyRxRate = phyRxRate;
	}

	/**
	 * Set the PHY receive rate (in Mbps) from this remote device.
	 *
	 * @since 2.0
	 * @param phyRxRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withPhyRxRate(Long phyRxRate) {
		this.phyRxRate = phyRxRate;
		return this;
	}

	/**
	 * Get the reduction in transmitter level (in dB) due to power control.

          This parameter is based on ''mocaNodeTxPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxpowerControlReduction() {
		return txpowerControlReduction;
	}

	/**
	 * Set the reduction in transmitter level (in dB) due to power control.

          This parameter is based on ''mocaNodeTxPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txpowerControlReduction the input value
	 */
	public void  setTxpowerControlReduction(Long txpowerControlReduction) {
		this.txpowerControlReduction = txpowerControlReduction;
	}

	/**
	 * Set the reduction in transmitter level (in dB) due to power control.

          This parameter is based on ''mocaNodeTxPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txpowerControlReduction the input value
	 * @return this instance
	 */
	public AssociatedDevice withTxpowerControlReduction(Long txpowerControlReduction) {
		this.txpowerControlReduction = txpowerControlReduction;
		return this;
	}

	/**
	 * Get the power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxpowerLevel() {
		return rxpowerLevel;
	}

	/**
	 * Set the power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxpowerLevel the input value
	 */
	public void  setRxpowerLevel(Long rxpowerLevel) {
		this.rxpowerLevel = rxpowerLevel;
	}

	/**
	 * Set the power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxpowerLevel the input value
	 * @return this instance
	 */
	public AssociatedDevice withRxpowerLevel(Long rxpowerLevel) {
		this.rxpowerLevel = rxpowerLevel;
		return this;
	}

	/**
	 * Get the broadcast PHY transmit rate (in Mbps) from this remote device.

          This parameter is based on ''mocaNodeTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxbcastRate() {
		return txbcastRate;
	}

	/**
	 * Set the broadcast PHY transmit rate (in Mbps) from this remote device.

          This parameter is based on ''mocaNodeTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txbcastRate the input value
	 */
	public void  setTxbcastRate(Long txbcastRate) {
		this.txbcastRate = txbcastRate;
	}

	/**
	 * Set the broadcast PHY transmit rate (in Mbps) from this remote device.

          This parameter is based on ''mocaNodeTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txbcastRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withTxbcastRate(Long txbcastRate) {
		this.txbcastRate = txbcastRate;
		return this;
	}

	/**
	 * Get the power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxGcdPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxbcastPowerLevel() {
		return rxbcastPowerLevel;
	}

	/**
	 * Set the power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxGcdPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxbcastPowerLevel the input value
	 */
	public void  setRxbcastPowerLevel(Long rxbcastPowerLevel) {
		this.rxbcastPowerLevel = rxbcastPowerLevel;
	}

	/**
	 * Set the power level (in dBm) received at the MoCA interface from this remote device.

          This parameter is based on ''mocaNodeRxGcdPower'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxbcastPowerLevel the input value
	 * @return this instance
	 */
	public AssociatedDevice withRxbcastPowerLevel(Long rxbcastPowerLevel) {
		this.rxbcastPowerLevel = rxbcastPowerLevel;
		return this;
	}

	/**
	 * Get the number of packets transmitted to this remote device (Note: Includes Broadcast, Multicast and Unicast packets).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxpackets() {
		return txpackets;
	}

	/**
	 * Set the number of packets transmitted to this remote device (Note: Includes Broadcast, Multicast and Unicast packets).
	 *
	 * @since 2.0
	 * @param txpackets the input value
	 */
	public void  setTxpackets(Long txpackets) {
		this.txpackets = txpackets;
	}

	/**
	 * Set the number of packets transmitted to this remote device (Note: Includes Broadcast, Multicast and Unicast packets).
	 *
	 * @since 2.0
	 * @param txpackets the input value
	 * @return this instance
	 */
	public AssociatedDevice withTxpackets(Long txpackets) {
		this.txpackets = txpackets;
		return this;
	}

	/**
	 * Get the number of packets received from this remote device (Note: Includes Broadcast, Multicast and Unicast packets).

          This parameter is based on ''mocaNodeRxPackets'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxpackets() {
		return rxpackets;
	}

	/**
	 * Set the number of packets received from this remote device (Note: Includes Broadcast, Multicast and Unicast packets).

          This parameter is based on ''mocaNodeRxPackets'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxpackets the input value
	 */
	public void  setRxpackets(Long rxpackets) {
		this.rxpackets = rxpackets;
	}

	/**
	 * Set the number of packets received from this remote device (Note: Includes Broadcast, Multicast and Unicast packets).

          This parameter is based on ''mocaNodeRxPackets'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxpackets the input value
	 * @return this instance
	 */
	public AssociatedDevice withRxpackets(Long rxpackets) {
		this.rxpackets = rxpackets;
		return this;
	}

	/**
	 * Get the number of errored and missed packets received from this remote device.

          This parameter is based on ''mocaNodeRxDrops'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxerroredAndMissedPackets() {
		return rxerroredAndMissedPackets;
	}

	/**
	 * Set the number of errored and missed packets received from this remote device.

          This parameter is based on ''mocaNodeRxDrops'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxerroredAndMissedPackets the input value
	 */
	public void  setRxerroredAndMissedPackets(Long rxerroredAndMissedPackets) {
		this.rxerroredAndMissedPackets = rxerroredAndMissedPackets;
	}

	/**
	 * Set the number of errored and missed packets received from this remote device.

          This parameter is based on ''mocaNodeRxDrops'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxerroredAndMissedPackets the input value
	 * @return this instance
	 */
	public AssociatedDevice withRxerroredAndMissedPackets(Long rxerroredAndMissedPackets) {
		this.rxerroredAndMissedPackets = rxerroredAndMissedPackets;
		return this;
	}

	/**
	 * Get the whether this remote device supports the 256 QAM feature.

          This parameter is based on ''mocaNodeQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isQam256Capable() {
		return qam256Capable;
	}

	/**
	 * Set the whether this remote device supports the 256 QAM feature.

          This parameter is based on ''mocaNodeQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param qam256Capable the input value
	 */
	public void  setQam256Capable(Boolean qam256Capable) {
		this.qam256Capable = qam256Capable;
	}

	/**
	 * Set the whether this remote device supports the 256 QAM feature.

          This parameter is based on ''mocaNodeQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param qam256Capable the input value
	 * @return this instance
	 */
	public AssociatedDevice withQam256Capable(Boolean qam256Capable) {
		this.qam256Capable = qam256Capable;
		return this;
	}

	/**
	 * Get the packet aggregation capability supported by the remote device. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaNodePacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketAggregationCapability() {
		return packetAggregationCapability;
	}

	/**
	 * Set the packet aggregation capability supported by the remote device. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaNodePacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param packetAggregationCapability the input value
	 */
	public void  setPacketAggregationCapability(Long packetAggregationCapability) {
		this.packetAggregationCapability = packetAggregationCapability;
	}

	/**
	 * Set the packet aggregation capability supported by the remote device. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaNodePacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param packetAggregationCapability the input value
	 * @return this instance
	 */
	public AssociatedDevice withPacketAggregationCapability(Long packetAggregationCapability) {
		this.packetAggregationCapability = packetAggregationCapability;
		return this;
	}

	/**
	 * Get the signal to noise level (in dBm) received at this interface from this remote device.

          This parameter is based on ''mocaNodeSNR'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxsNR() {
		return rxsNR;
	}

	/**
	 * Set the signal to noise level (in dBm) received at this interface from this remote device.

          This parameter is based on ''mocaNodeSNR'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxsNR the input value
	 */
	public void  setRxsNR(Long rxsNR) {
		this.rxsNR = rxsNR;
	}

	/**
	 * Set the signal to noise level (in dBm) received at this interface from this remote device.

          This parameter is based on ''mocaNodeSNR'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param rxsNR the input value
	 * @return this instance
	 */
	public AssociatedDevice withRxsNR(Long rxsNR) {
		this.rxsNR = rxsNR;
		return this;
	}

	/**
	 * Get the whether or not this remote device is currently present in the MoCA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this remote device is currently present in the MoCA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this remote device is currently present in the MoCA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 * @return this instance
	 */
	public AssociatedDevice withActive(Boolean active) {
		this.active = active;
		return this;
	}

	//</editor-fold>

}