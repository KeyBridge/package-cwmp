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
package org.broadbandforum.tr181.device.zigbee.zdo.nodemanager;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.ZigBeeNetworkAddress;

	/**
	 * The {{object}} object describes the route table as defined in {{bibref|ZigBee2007|table 3.51 Routing Table Entry}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.NodeManager.RoutingTable.{i}.")
public class RoutingTable {

	/**
	 * The ZigBee network address of this route.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DestinationAddress")
	@Size(max = 4)
	@Pattern(regexp = "([0-9A-Fa-f]){4}")
	public String destinationAddress;
	/**
	 * Specifies the network address of the next hop ZigBee device on the way to the destination ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "NextHopAddress")
	@CWMPParameter(activeNotify = "canDeny")
	public ZigBeeNetworkAddress nextHopAddress;
	/**
	 * The status of the route entry. {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Status")
	@CWMPParameter(activeNotify = "canDeny")
	public String status;
	/**
	 * A flag indicating whether the device is a memory constrained concentrator.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MemoryConstrained")
	public Boolean memoryConstrained;
	/**
	 * A flag indicating that the destination is a concentrator that issued a many to-one request.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ManyToOne")
	public Boolean manyToOne;
	/**
	 * A flag indicating that a route record command frame should be sent to the destination prior to the next data packet.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "RouteRecordRequired")
	public Boolean routeRecordRequired;

	public RoutingTable() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the ZigBee network address of this route.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * Set the ZigBee network address of this route.
	 *
	 * @since 2.7
	 * @param destinationAddress the input value
	 */
	public void  setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * Set the ZigBee network address of this route.
	 *
	 * @since 2.7
	 * @param destinationAddress the input value
	 * @return this instance
	 */
	public RoutingTable withDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
		return this;
	}

	/**
	 * Get the specifies the network address of the next hop ZigBee device on the way to the destination ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public ZigBeeNetworkAddress getNextHopAddress() {
		return nextHopAddress;
	}

	/**
	 * Set the specifies the network address of the next hop ZigBee device on the way to the destination ZigBee device.
	 *
	 * @since 2.7
	 * @param nextHopAddress the input value
	 */
	public void  setNextHopAddress(ZigBeeNetworkAddress nextHopAddress) {
		this.nextHopAddress = nextHopAddress;
	}

	/**
	 * Set the specifies the network address of the next hop ZigBee device on the way to the destination ZigBee device.
	 *
	 * @since 2.7
	 * @param nextHopAddress the input value
	 * @return this instance
	 */
	public RoutingTable withNextHopAddress(ZigBeeNetworkAddress nextHopAddress) {
		this.nextHopAddress = nextHopAddress;
		return this;
	}

	/**
	 * Get the status of the route entry. {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the route entry. {{enum}}
	 *
	 * @since 2.7
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the route entry. {{enum}}
	 *
	 * @since 2.7
	 * @param status the input value
	 * @return this instance
	 */
	public RoutingTable withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get a flag indicating whether the device is a memory constrained concentrator.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isMemoryConstrained() {
		return memoryConstrained;
	}

	/**
	 * Set a flag indicating whether the device is a memory constrained concentrator.
	 *
	 * @since 2.7
	 * @param memoryConstrained the input value
	 */
	public void  setMemoryConstrained(Boolean memoryConstrained) {
		this.memoryConstrained = memoryConstrained;
	}

	/**
	 * Set a flag indicating whether the device is a memory constrained concentrator.
	 *
	 * @since 2.7
	 * @param memoryConstrained the input value
	 * @return this instance
	 */
	public RoutingTable withMemoryConstrained(Boolean memoryConstrained) {
		this.memoryConstrained = memoryConstrained;
		return this;
	}

	/**
	 * Get a flag indicating that the destination is a concentrator that issued a many to-one request.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isManyToOne() {
		return manyToOne;
	}

	/**
	 * Set a flag indicating that the destination is a concentrator that issued a many to-one request.
	 *
	 * @since 2.7
	 * @param manyToOne the input value
	 */
	public void  setManyToOne(Boolean manyToOne) {
		this.manyToOne = manyToOne;
	}

	/**
	 * Set a flag indicating that the destination is a concentrator that issued a many to-one request.
	 *
	 * @since 2.7
	 * @param manyToOne the input value
	 * @return this instance
	 */
	public RoutingTable withManyToOne(Boolean manyToOne) {
		this.manyToOne = manyToOne;
		return this;
	}

	/**
	 * Get a flag indicating that a route record command frame should be sent to the destination prior to the next data packet.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isRouteRecordRequired() {
		return routeRecordRequired;
	}

	/**
	 * Set a flag indicating that a route record command frame should be sent to the destination prior to the next data packet.
	 *
	 * @since 2.7
	 * @param routeRecordRequired the input value
	 */
	public void  setRouteRecordRequired(Boolean routeRecordRequired) {
		this.routeRecordRequired = routeRecordRequired;
	}

	/**
	 * Set a flag indicating that a route record command frame should be sent to the destination prior to the next data packet.
	 *
	 * @since 2.7
	 * @param routeRecordRequired the input value
	 * @return this instance
	 */
	public RoutingTable withRouteRecordRequired(Boolean routeRecordRequired) {
		this.routeRecordRequired = routeRecordRequired;
		return this;
	}

	//</editor-fold>

}