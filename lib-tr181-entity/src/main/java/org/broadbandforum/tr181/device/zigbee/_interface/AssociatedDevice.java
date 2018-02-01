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
package org.broadbandforum.tr181.device.zigbee._interface;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.IEEE_EUI64;
import org.broadbandforum.tr181.datatypes.ZigBeeNetworkAddress;

	/**
	 * This table provides information about other ZigBee devices that are directly accessible via this interface.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.Interface.{i}.AssociatedDevice.{i}.")
public class AssociatedDevice {

	/**
	 * The IEEE address assigned to this device. A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "IEEEAddress")
	public IEEE_EUI64 ieeEAddress;
	/**
	 * The ZigBee network address assigned to this device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "NetworkAddress")
	public ZigBeeNetworkAddress networkAddress;
	/**
	 * Whether or not this device is currently present in the ZigBee network as defined in {{bibref|ZigBee2007|section 2.4.4.1}}.

          The ability to list inactive devices is OPTIONAL. If the CPE includes inactive devices in this table, {{param}} MUST be set to {{false}}  for each inactive device. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * The ZigBee Device Object assigned to this interface.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ZDOReference")
	@Size(max = 256)
	public String zdoReference;

	public AssociatedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the IEEE address assigned to this device. A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public IEEE_EUI64 getIeeEAddress() {
		return ieeEAddress;
	}

	/**
	 * Set the IEEE address assigned to this device. A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.
	 *
	 * @since 2.7
	 * @param ieeEAddress the input value
	 */
	public void  setIeeEAddress(IEEE_EUI64 ieeEAddress) {
		this.ieeEAddress = ieeEAddress;
	}

	/**
	 * Set the IEEE address assigned to this device. A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.
	 *
	 * @since 2.7
	 * @param ieeEAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withIeeEAddress(IEEE_EUI64 ieeEAddress) {
		this.ieeEAddress = ieeEAddress;
		return this;
	}

	/**
	 * Get the ZigBee network address assigned to this device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public ZigBeeNetworkAddress getNetworkAddress() {
		return networkAddress;
	}

	/**
	 * Set the ZigBee network address assigned to this device.
	 *
	 * @since 2.7
	 * @param networkAddress the input value
	 */
	public void  setNetworkAddress(ZigBeeNetworkAddress networkAddress) {
		this.networkAddress = networkAddress;
	}

	/**
	 * Set the ZigBee network address assigned to this device.
	 *
	 * @since 2.7
	 * @param networkAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withNetworkAddress(ZigBeeNetworkAddress networkAddress) {
		this.networkAddress = networkAddress;
		return this;
	}

	/**
	 * Get the whether or not this device is currently present in the ZigBee network as defined in {{bibref|ZigBee2007|section 2.4.4.1}}.

          The ability to list inactive devices is OPTIONAL. If the CPE includes inactive devices in this table, {{param}} MUST be set to {{false}}  for each inactive device. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this device is currently present in the ZigBee network as defined in {{bibref|ZigBee2007|section 2.4.4.1}}.

          The ability to list inactive devices is OPTIONAL. If the CPE includes inactive devices in this table, {{param}} MUST be set to {{false}}  for each inactive device. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.7
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this device is currently present in the ZigBee network as defined in {{bibref|ZigBee2007|section 2.4.4.1}}.

          The ability to list inactive devices is OPTIONAL. If the CPE includes inactive devices in this table, {{param}} MUST be set to {{false}}  for each inactive device. The length of time an inactive device remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.7
	 * @param active the input value
	 * @return this instance
	 */
	public AssociatedDevice withActive(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Get the ZigBee Device Object assigned to this interface.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getZdoReference() {
		return zdoReference;
	}

	/**
	 * Set the ZigBee Device Object assigned to this interface.
	 *
	 * @since 2.7
	 * @param zdoReference the input value
	 */
	public void  setZdoReference(String zdoReference) {
		this.zdoReference = zdoReference;
	}

	/**
	 * Set the ZigBee Device Object assigned to this interface.
	 *
	 * @since 2.7
	 * @param zdoReference the input value
	 * @return this instance
	 */
	public AssociatedDevice withZdoReference(String zdoReference) {
		this.zdoReference = zdoReference;
		return this;
	}

	//</editor-fold>

}