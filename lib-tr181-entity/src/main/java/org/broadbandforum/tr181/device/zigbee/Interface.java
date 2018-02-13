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
package org.broadbandforum.tr181.device.zigbee;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IEEE_EUI64;
import org.broadbandforum.tr181.datatypes.ZigBeeNetworkAddress;
import org.broadbandforum.tr181.device.zigbee._interface.AssociatedDevice;
import org.broadbandforum.tr181.device.zigbee._interface.Stats;

	/**
	 * ZigBee interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the ZigBee interface of a ZigBee end device, ZigBee router or ZigBee coordinator.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.Interface.{i}.")
@XmlRootElement(name = "Device.ZigBee.Interface")
@XmlType(name = "Device.ZigBee.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interface {

	/**
	 * Enables or disables the interface. This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * The IEEE address assigned to this interface.  A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.IEEEAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "IEEEAddress")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	public IEEE_EUI64 ieeEAddress;
	/**
	 * The ZigBee network address assigned to this interface.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.NetworkAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "NetworkAddress")
	public ZigBeeNetworkAddress networkAddress;
	/**
	 * The ZigBee Device Object assigned to this interface.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ZDOReference")
	@Size(max = 256)
	public String zdoReference;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This table provides information about other ZigBee devices that are directly accessible via this interface.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined.
	 */
	@XmlElementWrapper(name = "AssociatedDevices")
	@XmlElement(name = "AssociatedDevice")
	public Collection<AssociatedDevice> associatedDevices;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the interface. This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the interface. This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the interface. This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @param enable the input value
	 * @return this instance
	 */
	public Interface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.7
	 * @param status the input value
	 * @return this instance
	 */
	public Interface withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 * @return this instance
	 */
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.7
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.7
	 * @param name the input value
	 * @return this instance
	 */
	public Interface withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.7
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.7
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.7
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the IEEE address assigned to this interface.  A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.IEEEAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public IEEE_EUI64 getIeeEAddress() {
		return ieeEAddress;
	}

	/**
	 * Set the IEEE address assigned to this interface.  A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.IEEEAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 * @param ieeEAddress the input value
	 */
	public void  setIeeEAddress(IEEE_EUI64 ieeEAddress) {
		this.ieeEAddress = ieeEAddress;
	}

	/**
	 * Set the IEEE address assigned to this interface.  A value of "FF:FF:FF:FF:FF:FF:FF:FF"  indicates that this address is unknown.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.IEEEAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 * @param ieeEAddress the input value
	 * @return this instance
	 */
	public Interface withIeeEAddress(IEEE_EUI64 ieeEAddress) {
		this.ieeEAddress = ieeEAddress;
		return this;
	}

	/**
	 * Get the ZigBee network address assigned to this interface.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.NetworkAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public ZigBeeNetworkAddress getNetworkAddress() {
		return networkAddress;
	}

	/**
	 * Set the ZigBee network address assigned to this interface.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.NetworkAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 * @param networkAddress the input value
	 */
	public void  setNetworkAddress(ZigBeeNetworkAddress networkAddress) {
		this.networkAddress = networkAddress;
	}

	/**
	 * Set the ZigBee network address assigned to this interface.  This parameter has the same value as the {{param|.ZigBee.ZDO.{i}.NetworkAddress}} parameter of the ZDO instance {{param|ZDOReference}} is pointing to.
	 *
	 * @since 2.7
	 * @param networkAddress the input value
	 * @return this instance
	 */
	public Interface withNetworkAddress(ZigBeeNetworkAddress networkAddress) {
		this.networkAddress = networkAddress;
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
	public Interface withZdoReference(String zdoReference) {
		this.zdoReference = zdoReference;
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Interface withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the this table provides information about other ZigBee devices that are directly accessible via this interface.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set the this table provides information about other ZigBee devices that are directly accessible via this interface.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set the this table provides information about other ZigBee devices that are directly accessible via this interface.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined.
	 *
	 * @param associatedDevice the input value
	 * @return this instance
	 */
	public Interface withAssociatedDevice(AssociatedDevice associatedDevice) {
		getAssociatedDevices().add(associatedDevice);
		return this;
	}

	//</editor-fold>

}