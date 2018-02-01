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
package org.broadbandforum.tr181.device.zigbee.zdo.network;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.Network.Neighbor.{i}.")
public class Neighbor {

	/**
	 * Neighbor of this ZigBee device. The value MUST be the path name of a row in the ZigBee.ZDO table. If the referenced row is deleted then this entry MUST be deleted.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Neighbor")
	public String neighbor;
	/**
	 * The LQI field specified link quality identification (LQI) for neighbor ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "LQI")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 255)
	public Long lqi;
	/**
	 * The relationship between the neighbor and this device.{{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Relationship")
	public String relationship;
	/**
	 * An indication of whether the neighbor device is accepting join requests.{{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "PermitJoin")
	public String permitJoin;
	/**
	 * The tree depth of the neighbor device. A value of 0x00 indicates that the device is the ZigBee coordinator for the network.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Depth")
	public Long depth;

	public Neighbor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the neighbor of this ZigBee device. The value MUST be the path name of a row in the ZigBee.ZDO table. If the referenced row is deleted then this entry MUST be deleted.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getNeighbor() {
		return neighbor;
	}

	/**
	 * Set the neighbor of this ZigBee device. The value MUST be the path name of a row in the ZigBee.ZDO table. If the referenced row is deleted then this entry MUST be deleted.
	 *
	 * @since 2.7
	 * @param neighbor the input value
	 */
	public void  setNeighbor(String neighbor) {
		this.neighbor = neighbor;
	}

	/**
	 * Set the neighbor of this ZigBee device. The value MUST be the path name of a row in the ZigBee.ZDO table. If the referenced row is deleted then this entry MUST be deleted.
	 *
	 * @since 2.7
	 * @param neighbor the input value
	 * @return this instance
	 */
	public Neighbor withNeighbor(String neighbor) {
		this.neighbor = neighbor;
		return this;
	}

	/**
	 * Get the LQI field specified link quality identification (LQI) for neighbor ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getLqi() {
		return lqi;
	}

	/**
	 * Set the LQI field specified link quality identification (LQI) for neighbor ZigBee device.
	 *
	 * @since 2.7
	 * @param lqi the input value
	 */
	public void  setLqi(Long lqi) {
		this.lqi = lqi;
	}

	/**
	 * Set the LQI field specified link quality identification (LQI) for neighbor ZigBee device.
	 *
	 * @since 2.7
	 * @param lqi the input value
	 * @return this instance
	 */
	public Neighbor withLqi(Long lqi) {
		this.lqi = lqi;
		return this;
	}

	/**
	 * Get the relationship between the neighbor and this device.{{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * Set the relationship between the neighbor and this device.{{enum}}
	 *
	 * @since 2.7
	 * @param relationship the input value
	 */
	public void  setRelationship(String relationship) {
		this.relationship = relationship;
	}

	/**
	 * Set the relationship between the neighbor and this device.{{enum}}
	 *
	 * @since 2.7
	 * @param relationship the input value
	 * @return this instance
	 */
	public Neighbor withRelationship(String relationship) {
		this.relationship = relationship;
		return this;
	}

	/**
	 * Get an indication of whether the neighbor device is accepting join requests.{{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getPermitJoin() {
		return permitJoin;
	}

	/**
	 * Set an indication of whether the neighbor device is accepting join requests.{{enum}}
	 *
	 * @since 2.7
	 * @param permitJoin the input value
	 */
	public void  setPermitJoin(String permitJoin) {
		this.permitJoin = permitJoin;
	}

	/**
	 * Set an indication of whether the neighbor device is accepting join requests.{{enum}}
	 *
	 * @since 2.7
	 * @param permitJoin the input value
	 * @return this instance
	 */
	public Neighbor withPermitJoin(String permitJoin) {
		this.permitJoin = permitJoin;
		return this;
	}

	/**
	 * Get the tree depth of the neighbor device. A value of 0x00 indicates that the device is the ZigBee coordinator for the network.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getDepth() {
		return depth;
	}

	/**
	 * Set the tree depth of the neighbor device. A value of 0x00 indicates that the device is the ZigBee coordinator for the network.
	 *
	 * @since 2.7
	 * @param depth the input value
	 */
	public void  setDepth(Long depth) {
		this.depth = depth;
	}

	/**
	 * Set the tree depth of the neighbor device. A value of 0x00 indicates that the device is the ZigBee coordinator for the network.
	 *
	 * @since 2.7
	 * @param depth the input value
	 * @return this instance
	 */
	public Neighbor withDepth(Long depth) {
		this.depth = depth;
		return this;
	}

	//</editor-fold>

}