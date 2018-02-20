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
package org.broadbandforum.tr181.device.hpna._interface;

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
	 * This table provides information about other HPNA devices that are directly accessible via this HPNA interface.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.HPNA.Interface.{i}.AssociatedDevice.{i}.", uniqueConstraints = {@CWMPUnique(names = {"MACAddress"})})
@XmlRootElement(name = "Device.HPNA.Interface.AssociatedDevice")
@XmlType(name = "Device.HPNA.Interface.AssociatedDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class AssociatedDevice {

	/**
	 * The physical address of this node.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * The Node ID of this node.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NodeID")
	public Long nodeID;
	/**
	 * Whether this node is the HPNA network master.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IsMaster")
	public Boolean ismaster;
	/**
	 * Whether this node is synchronized with the HPNA network master. If this node is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Synced")
	public Boolean synced;
	/**
	 * Total time in seconds (since device reset) that this node has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalSyncTime")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long totalSyncTime;
	/**
	 * This node's maximum HPNA PHY bit rate (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBitRate")
	public Long maxBitRate;
	/**
	 * Enable / disable PHY throughput diagnostics mode on this node. All devices that are enabled will participate in the HPNA network PHY throughput diagnostics process.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PHYDiagnosticsEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean phyDiagnosticsEnable;
	/**
	 * Whether or not this node is currently present in the HPNA network.

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
	 * Get the physical address of this node.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the physical address of this node.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the physical address of this node.
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
	 * Get the Node ID of this node.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNodeID() {
		return nodeID;
	}

	/**
	 * Set the Node ID of this node.
	 *
	 * @since 2.0
	 * @param nodeID the input value
	 */
	public void  setNodeID(Long nodeID) {
		this.nodeID = nodeID;
	}

	/**
	 * Set the Node ID of this node.
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
	 * Get the whether this node is the HPNA network master.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIsmaster() {
		return ismaster;
	}

	/**
	 * Set the whether this node is the HPNA network master.
	 *
	 * @since 2.0
	 * @param ismaster the input value
	 */
	public void  setIsmaster(Boolean ismaster) {
		this.ismaster = ismaster;
	}

	/**
	 * Set the whether this node is the HPNA network master.
	 *
	 * @since 2.0
	 * @param ismaster the input value
	 * @return this instance
	 */
	public AssociatedDevice withIsmaster(Boolean ismaster) {
		this.ismaster = ismaster;
		return this;
	}

	/**
	 * Get the whether this node is synchronized with the HPNA network master. If this node is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSynced() {
		return synced;
	}

	/**
	 * Set the whether this node is synchronized with the HPNA network master. If this node is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 * @param synced the input value
	 */
	public void  setSynced(Boolean synced) {
		this.synced = synced;
	}

	/**
	 * Set the whether this node is synchronized with the HPNA network master. If this node is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 * @param synced the input value
	 * @return this instance
	 */
	public AssociatedDevice withSynced(Boolean synced) {
		this.synced = synced;
		return this;
	}

	/**
	 * Get the total time in seconds (since device reset) that this node has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalSyncTime() {
		return totalSyncTime;
	}

	/**
	 * Set the total time in seconds (since device reset) that this node has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 * @param totalSyncTime the input value
	 */
	public void  setTotalSyncTime(Long totalSyncTime) {
		this.totalSyncTime = totalSyncTime;
	}

	/**
	 * Set the total time in seconds (since device reset) that this node has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 * @param totalSyncTime the input value
	 * @return this instance
	 */
	public AssociatedDevice withTotalSyncTime(Long totalSyncTime) {
		this.totalSyncTime = totalSyncTime;
		return this;
	}

	/**
	 * Get the this node's maximum HPNA PHY bit rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the this node's maximum HPNA PHY bit rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the this node's maximum HPNA PHY bit rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the enable / disable PHY throughput diagnostics mode on this node. All devices that are enabled will participate in the HPNA network PHY throughput diagnostics process.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPhyDiagnosticsEnable() {
		return phyDiagnosticsEnable;
	}

	/**
	 * Set the enable / disable PHY throughput diagnostics mode on this node. All devices that are enabled will participate in the HPNA network PHY throughput diagnostics process.
	 *
	 * @since 2.0
	 * @param phyDiagnosticsEnable the input value
	 */
	public void  setPhyDiagnosticsEnable(Boolean phyDiagnosticsEnable) {
		this.phyDiagnosticsEnable = phyDiagnosticsEnable;
	}

	/**
	 * Set the enable / disable PHY throughput diagnostics mode on this node. All devices that are enabled will participate in the HPNA network PHY throughput diagnostics process.
	 *
	 * @since 2.0
	 * @param phyDiagnosticsEnable the input value
	 * @return this instance
	 */
	public AssociatedDevice withPhyDiagnosticsEnable(Boolean phyDiagnosticsEnable) {
		this.phyDiagnosticsEnable = phyDiagnosticsEnable;
		return this;
	}

	/**
	 * Get the whether or not this node is currently present in the HPNA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this node is currently present in the HPNA network.

          The ability to list inactive nodes is OPTIONAL.  If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}}  for each inactive node.  The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this node is currently present in the HPNA network.

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