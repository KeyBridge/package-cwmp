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
package org.broadbandforum.tr098.internetgatewaydevice.queuemanagement;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.QueueManagement.QueueStats.{i}.")
public class QueueStats {

	/**
	 * Enables or disables this object.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this object.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Instance number of the Queue table entry with which this object is associated.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Queue")
	@CWMPParameter(access = "readWrite")
	public Long queue = 0L;
	/**
	 * Egress interface for which this object contains statistics. This parameter MUST be the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Number of packets output through the queue.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "OutputPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outputPackets = 0L;
	/**
	 * Number of bytes output through the queue.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "OutputBytes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outputBytes = 0L;
	/**
	 * Number of packets dropped by the queue.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DroppedPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long droppedPackets = 0L;
	/**
	 * Number of bytes dropped by the queue.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DroppedBytes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long droppedBytes = 0L;
	/**
	 * Queue occupancy in packets (gives a measure of queue latency).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "QueueOccupancyPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long queueOccupancyPackets = 0L;
	/**
	 * Queue occupancy as a percentage, i.e. 100 * queue occupancy in bytes / queue size in bytes (gives a measure of queue usage).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "QueueOccupancyPercentage")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 100)
	public Long queueOccupancyPercentage = 0L;

	public QueueStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this object.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this object.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this object.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public QueueStats withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this object.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this object.
	 *
	 * @since 1.4
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this object.
	 *
	 * @since 1.4
	 * @param status the input value
	 * @return this instance
	 */
	public QueueStats withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public QueueStats withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the instance number of the Queue table entry with which this object is associated.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getQueue() {
		return queue;
	}

	/**
	 * Set the instance number of the Queue table entry with which this object is associated.
	 *
	 * @since 1.4
	 * @param queue the input value
	 */
	public void  setQueue(Long queue) {
		this.queue = queue;
	}

	/**
	 * Set the instance number of the Queue table entry with which this object is associated.
	 *
	 * @since 1.4
	 * @param queue the input value
	 * @return this instance
	 */
	public QueueStats withQueue(Long queue) {
		this.queue = queue;
		return this;
	}

	/**
	 * Get the egress interface for which this object contains statistics. This parameter MUST be the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the egress interface for which this object contains statistics. This parameter MUST be the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.
	 *
	 * @since 1.4
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the egress interface for which this object contains statistics. This parameter MUST be the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.
	 *
	 * @since 1.4
	 * @param _interface the input value
	 * @return this instance
	 */
	public QueueStats with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the number of packets output through the queue.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getOutputPackets() {
		return outputPackets;
	}

	/**
	 * Set the number of packets output through the queue.
	 *
	 * @since 1.4
	 * @param outputPackets the input value
	 */
	public void  setOutputPackets(Long outputPackets) {
		this.outputPackets = outputPackets;
	}

	/**
	 * Set the number of packets output through the queue.
	 *
	 * @since 1.4
	 * @param outputPackets the input value
	 * @return this instance
	 */
	public QueueStats withOutputPackets(Long outputPackets) {
		this.outputPackets = outputPackets;
		return this;
	}

	/**
	 * Get the number of bytes output through the queue.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getOutputBytes() {
		return outputBytes;
	}

	/**
	 * Set the number of bytes output through the queue.
	 *
	 * @since 1.4
	 * @param outputBytes the input value
	 */
	public void  setOutputBytes(Long outputBytes) {
		this.outputBytes = outputBytes;
	}

	/**
	 * Set the number of bytes output through the queue.
	 *
	 * @since 1.4
	 * @param outputBytes the input value
	 * @return this instance
	 */
	public QueueStats withOutputBytes(Long outputBytes) {
		this.outputBytes = outputBytes;
		return this;
	}

	/**
	 * Get the number of packets dropped by the queue.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getDroppedPackets() {
		return droppedPackets;
	}

	/**
	 * Set the number of packets dropped by the queue.
	 *
	 * @since 1.4
	 * @param droppedPackets the input value
	 */
	public void  setDroppedPackets(Long droppedPackets) {
		this.droppedPackets = droppedPackets;
	}

	/**
	 * Set the number of packets dropped by the queue.
	 *
	 * @since 1.4
	 * @param droppedPackets the input value
	 * @return this instance
	 */
	public QueueStats withDroppedPackets(Long droppedPackets) {
		this.droppedPackets = droppedPackets;
		return this;
	}

	/**
	 * Get the number of bytes dropped by the queue.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getDroppedBytes() {
		return droppedBytes;
	}

	/**
	 * Set the number of bytes dropped by the queue.
	 *
	 * @since 1.4
	 * @param droppedBytes the input value
	 */
	public void  setDroppedBytes(Long droppedBytes) {
		this.droppedBytes = droppedBytes;
	}

	/**
	 * Set the number of bytes dropped by the queue.
	 *
	 * @since 1.4
	 * @param droppedBytes the input value
	 * @return this instance
	 */
	public QueueStats withDroppedBytes(Long droppedBytes) {
		this.droppedBytes = droppedBytes;
		return this;
	}

	/**
	 * Get the queue occupancy in packets (gives a measure of queue latency).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getQueueOccupancyPackets() {
		return queueOccupancyPackets;
	}

	/**
	 * Set the queue occupancy in packets (gives a measure of queue latency).
	 *
	 * @since 1.4
	 * @param queueOccupancyPackets the input value
	 */
	public void  setQueueOccupancyPackets(Long queueOccupancyPackets) {
		this.queueOccupancyPackets = queueOccupancyPackets;
	}

	/**
	 * Set the queue occupancy in packets (gives a measure of queue latency).
	 *
	 * @since 1.4
	 * @param queueOccupancyPackets the input value
	 * @return this instance
	 */
	public QueueStats withQueueOccupancyPackets(Long queueOccupancyPackets) {
		this.queueOccupancyPackets = queueOccupancyPackets;
		return this;
	}

	/**
	 * Get the queue occupancy as a percentage, i.e. 100 * queue occupancy in bytes / queue size in bytes (gives a measure of queue usage).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getQueueOccupancyPercentage() {
		return queueOccupancyPercentage;
	}

	/**
	 * Set the queue occupancy as a percentage, i.e. 100 * queue occupancy in bytes / queue size in bytes (gives a measure of queue usage).
	 *
	 * @since 1.4
	 * @param queueOccupancyPercentage the input value
	 */
	public void  setQueueOccupancyPercentage(Long queueOccupancyPercentage) {
		this.queueOccupancyPercentage = queueOccupancyPercentage;
	}

	/**
	 * Set the queue occupancy as a percentage, i.e. 100 * queue occupancy in bytes / queue size in bytes (gives a measure of queue usage).
	 *
	 * @since 1.4
	 * @param queueOccupancyPercentage the input value
	 * @return this instance
	 */
	public QueueStats withQueueOccupancyPercentage(Long queueOccupancyPercentage) {
		this.queueOccupancyPercentage = queueOccupancyPercentage;
		return this;
	}

	//</editor-fold>

}