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
package org.broadbandforum.tr181.device.moca._interface.qos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.MACAddress;

	/**
	 * The flow statistics table provides information on the MoCA parameterized QoS flows this interface has allocated onto the MoCA network.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.MoCA.Interface.{i}.QoS.FlowStats.{i}.", uniqueConstraints = {@CWMPUnique(names = {"FlowID"})})
@XmlRootElement(name = "Device.MoCA.Interface.QoS.FlowStats")
@XmlType(name = "Device.MoCA.Interface.QoS.FlowStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class FlowStats {

	/**
	 * The flow ID used to identify a flow in the network.

          This parameter is based on ''mocaIfFlowID'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FlowID")
	public Long flowID;
	/**
	 * The Destination Address (DA) for the packets in this flow.

          This parameter is based on ''mocaIfPacketDA'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketDA")
	public MACAddress packetDA;
	/**
	 * Maximum required rate in Kbps.

          This parameter is based on ''mocaIfPeakDataRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxRate")
	public Long maxRate;
	/**
	 * Maximum burst size. 

          This parameter is based on ''mocaIfBurstSize'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBurstSize")
	public Long maxBurstSize;
	/**
	 * Flow lease time (expressed in seconds). 

          A {{param}} of 0 means unlimited lease time.

          This parameter is based on ''mocaIfLeaseTime'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseTime")
	public Long leaseTime;
	/**
	 * Flow lease time remaining (expressed in seconds). 

          If {{param|LeaseTime}} is 0 then a {{param}} of 0 means unlimited lease time; otherwise, a {{param}} of 0 means expired.

          This parameter is based on ''mocaIfLeaseTimeLeft'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseTimeLeft")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long leaseTimeLeft;
	/**
	 * The number of packets transmitted for this flow.

          This parameter is based on ''mocaIfTxPacketsFlow'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FlowPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long flowPackets;

	public FlowStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the flow ID used to identify a flow in the network.

          This parameter is based on ''mocaIfFlowID'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFlowID() {
		return flowID;
	}

	/**
	 * Set the flow ID used to identify a flow in the network.

          This parameter is based on ''mocaIfFlowID'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param flowID the input value
	 */
	public void  setFlowID(Long flowID) {
		this.flowID = flowID;
	}

	/**
	 * Set the flow ID used to identify a flow in the network.

          This parameter is based on ''mocaIfFlowID'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param flowID the input value
	 * @return this instance
	 */
	public FlowStats withFlowID(Long flowID) {
		this.flowID = flowID;
		return this;
	}

	/**
	 * Get the Destination Address (DA) for the packets in this flow.

          This parameter is based on ''mocaIfPacketDA'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getPacketDA() {
		return packetDA;
	}

	/**
	 * Set the Destination Address (DA) for the packets in this flow.

          This parameter is based on ''mocaIfPacketDA'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param packetDA the input value
	 */
	public void  setPacketDA(MACAddress packetDA) {
		this.packetDA = packetDA;
	}

	/**
	 * Set the Destination Address (DA) for the packets in this flow.

          This parameter is based on ''mocaIfPacketDA'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param packetDA the input value
	 * @return this instance
	 */
	public FlowStats withPacketDA(MACAddress packetDA) {
		this.packetDA = packetDA;
		return this;
	}

	/**
	 * Get the maximum required rate in Kbps.

          This parameter is based on ''mocaIfPeakDataRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxRate() {
		return maxRate;
	}

	/**
	 * Set the maximum required rate in Kbps.

          This parameter is based on ''mocaIfPeakDataRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxRate the input value
	 */
	public void  setMaxRate(Long maxRate) {
		this.maxRate = maxRate;
	}

	/**
	 * Set the maximum required rate in Kbps.

          This parameter is based on ''mocaIfPeakDataRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxRate the input value
	 * @return this instance
	 */
	public FlowStats withMaxRate(Long maxRate) {
		this.maxRate = maxRate;
		return this;
	}

	/**
	 * Get the maximum burst size. 

          This parameter is based on ''mocaIfBurstSize'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBurstSize() {
		return maxBurstSize;
	}

	/**
	 * Set the maximum burst size. 

          This parameter is based on ''mocaIfBurstSize'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxBurstSize the input value
	 */
	public void  setMaxBurstSize(Long maxBurstSize) {
		this.maxBurstSize = maxBurstSize;
	}

	/**
	 * Set the maximum burst size. 

          This parameter is based on ''mocaIfBurstSize'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxBurstSize the input value
	 * @return this instance
	 */
	public FlowStats withMaxBurstSize(Long maxBurstSize) {
		this.maxBurstSize = maxBurstSize;
		return this;
	}

	/**
	 * Get the flow lease time (expressed in seconds). 

          A {{param}} of 0 means unlimited lease time.

          This parameter is based on ''mocaIfLeaseTime'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLeaseTime() {
		return leaseTime;
	}

	/**
	 * Set the flow lease time (expressed in seconds). 

          A {{param}} of 0 means unlimited lease time.

          This parameter is based on ''mocaIfLeaseTime'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 */
	public void  setLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
	}

	/**
	 * Set the flow lease time (expressed in seconds). 

          A {{param}} of 0 means unlimited lease time.

          This parameter is based on ''mocaIfLeaseTime'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 * @return this instance
	 */
	public FlowStats withLeaseTime(Long leaseTime) {
		this.leaseTime = leaseTime;
		return this;
	}

	/**
	 * Get the flow lease time remaining (expressed in seconds). 

          If {{param|LeaseTime}} is 0 then a {{param}} of 0 means unlimited lease time; otherwise, a {{param}} of 0 means expired.

          This parameter is based on ''mocaIfLeaseTimeLeft'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLeaseTimeLeft() {
		return leaseTimeLeft;
	}

	/**
	 * Set the flow lease time remaining (expressed in seconds). 

          If {{param|LeaseTime}} is 0 then a {{param}} of 0 means unlimited lease time; otherwise, a {{param}} of 0 means expired.

          This parameter is based on ''mocaIfLeaseTimeLeft'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param leaseTimeLeft the input value
	 */
	public void  setLeaseTimeLeft(Long leaseTimeLeft) {
		this.leaseTimeLeft = leaseTimeLeft;
	}

	/**
	 * Set the flow lease time remaining (expressed in seconds). 

          If {{param|LeaseTime}} is 0 then a {{param}} of 0 means unlimited lease time; otherwise, a {{param}} of 0 means expired.

          This parameter is based on ''mocaIfLeaseTimeLeft'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param leaseTimeLeft the input value
	 * @return this instance
	 */
	public FlowStats withLeaseTimeLeft(Long leaseTimeLeft) {
		this.leaseTimeLeft = leaseTimeLeft;
		return this;
	}

	/**
	 * Get the number of packets transmitted for this flow.

          This parameter is based on ''mocaIfTxPacketsFlow'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFlowPackets() {
		return flowPackets;
	}

	/**
	 * Set the number of packets transmitted for this flow.

          This parameter is based on ''mocaIfTxPacketsFlow'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param flowPackets the input value
	 */
	public void  setFlowPackets(Long flowPackets) {
		this.flowPackets = flowPackets;
	}

	/**
	 * Set the number of packets transmitted for this flow.

          This parameter is based on ''mocaIfTxPacketsFlow'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param flowPackets the input value
	 * @return this instance
	 */
	public FlowStats withFlowPackets(Long flowPackets) {
		this.flowPackets = flowPackets;
		return this;
	}

	//</editor-fold>

}