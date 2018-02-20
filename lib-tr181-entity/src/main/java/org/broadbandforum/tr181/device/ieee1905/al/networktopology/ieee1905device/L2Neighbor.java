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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device;

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
	 * This object represents an instance of an L2 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-41: L2 neighbor device TLV}}.
	 *
	 * @since TR181 v2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.L2Neighbor.{i}.", uniqueConstraints = {@CWMPUnique(names = {"LocalInterface", "NeighborInterfaceId"})})
@XmlRootElement(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.L2Neighbor")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.L2Neighbor")
@XmlAccessorType(XmlAccessType.FIELD)
public class L2Neighbor {

	/**
	 * {{reference}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LocalInterface")
	@Size(max = 256)
	public String localInterface;
	/**
	 * MAC Address of the {{object}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NeighborInterfaceId")
	public MACAddress neighborInterfaceId;
	/**
	 * {{list}} Behind MAC Addresses of the {{object}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "BehindInterfaceIds")
	public MACAddress behindInterfaceIds;

	public L2Neighbor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{reference}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getLocalInterface() {
		return localInterface;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.9
	 * @param localInterface the input value
	 */
	public void  setLocalInterface(String localInterface) {
		this.localInterface = localInterface;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.9
	 * @param localInterface the input value
	 * @return this instance
	 */
	public L2Neighbor withLocalInterface(String localInterface) {
		this.localInterface = localInterface;
		return this;
	}

	/**
	 * Get the mac Address of the {{object}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getNeighborInterfaceId() {
		return neighborInterfaceId;
	}

	/**
	 * Set the mac Address of the {{object}}.
	 *
	 * @since 2.9
	 * @param neighborInterfaceId the input value
	 */
	public void  setNeighborInterfaceId(MACAddress neighborInterfaceId) {
		this.neighborInterfaceId = neighborInterfaceId;
	}

	/**
	 * Set the mac Address of the {{object}}.
	 *
	 * @since 2.9
	 * @param neighborInterfaceId the input value
	 * @return this instance
	 */
	public L2Neighbor withNeighborInterfaceId(MACAddress neighborInterfaceId) {
		this.neighborInterfaceId = neighborInterfaceId;
		return this;
	}

	/**
	 * Get the {{list}} Behind MAC Addresses of the {{object}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getBehindInterfaceIds() {
		return behindInterfaceIds;
	}

	/**
	 * Set the {{list}} Behind MAC Addresses of the {{object}}.
	 *
	 * @since 2.9
	 * @param behindInterfaceIds the input value
	 */
	public void  setBehindInterfaceIds(MACAddress behindInterfaceIds) {
		this.behindInterfaceIds = behindInterfaceIds;
	}

	/**
	 * Set the {{list}} Behind MAC Addresses of the {{object}}.
	 *
	 * @since 2.9
	 * @param behindInterfaceIds the input value
	 * @return this instance
	 */
	public L2Neighbor withBehindInterfaceIds(MACAddress behindInterfaceIds) {
		this.behindInterfaceIds = behindInterfaceIds;
		return this;
	}

	//</editor-fold>

}