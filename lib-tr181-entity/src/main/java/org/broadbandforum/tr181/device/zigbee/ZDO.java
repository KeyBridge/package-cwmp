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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.IEEE_EUI64;
import org.broadbandforum.common.ZigBeeNetworkAddress;
import org.broadbandforum.tr181.device.zigbee.zdo.ApplicationEndpoint;
import org.broadbandforum.tr181.device.zigbee.zdo.Binding;
import org.broadbandforum.tr181.device.zigbee.zdo.ComplexDescriptor;
import org.broadbandforum.tr181.device.zigbee.zdo.Group;
import org.broadbandforum.tr181.device.zigbee.zdo.Network;
import org.broadbandforum.tr181.device.zigbee.zdo.NodeDescriptor;
import org.broadbandforum.tr181.device.zigbee.zdo.NodeManager;
import org.broadbandforum.tr181.device.zigbee.zdo.PowerDescriptor;
import org.broadbandforum.tr181.device.zigbee.zdo.Security;
import org.broadbandforum.tr181.device.zigbee.zdo.UserDescriptor;

	/**
	 * ZigBee Device Object (ZDO) provides management capabilities of the ZigBee Application Support  (APS) and Network (NWK) layers of a ZigBee Device as defined in {{bibref|ZigBee2007|section 2.5}}.

        {{keys}}

        It is possible that instances of this object have the same key value when the value of {{param|IEEEAddress}} parameter is "FF:FF:FF:FF:FF:FF:FF:FF" and the ZigBee Coordinators on two or more separate area networks assign the same value for the {{param|NetworkAddress}}. This is because the ZigBee specification describes only intra-area network topologies {{bibref|ZigBee2007|Section 1.1.4 Network Topology}}. As such if two or more {{object}} instances have the same key value the implemenation is undefined
	 *
	 * @since TR181 v2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.", uniqueConstraints = {@CWMPUnique(names = {"IEEEAddress", "NetworkAddress"})})
@XmlRootElement(name = "Device.ZigBee.ZDO")
@XmlType(name = "Device.ZigBee.ZDO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZDO {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
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
	 * The {{object}} object describes the node capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.3 Node Descriptor}}.
	 */
	@XmlElement(name = "NodeDescriptor")
	public NodeDescriptor nodeDescriptor;
	/**
	 * The {{object}} object describes the power capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.4 Node Power Descriptor}}.
	 */
	@XmlElement(name = "PowerDescriptor")
	public PowerDescriptor powerDescriptor;
	/**
	 * The {{object}} object is an optional descriptor that describes user defined capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.7 User Descriptor}}. The {{object}} object contains information that allows the user to identify the device using a user-friendly character string, such as "Bedroom TV" or "Stairs Light".
	 */
	@XmlElement(name = "UserDescriptor")
	public UserDescriptor userDescriptor;
	/**
	 * The {{object}} object is an optional descriptor that describes extended capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.6 Complex Descriptor}}.
	 */
	@XmlElement(name = "ComplexDescriptor")
	public ComplexDescriptor complexDescriptor;
	/**
	 * The {{object}} object provides the configuration capabilities needed to perform the Security Management functionality defined in {{bibref|ZigBee2007|section 4 Security Management}}.
	 */
	@XmlElement(name = "Security")
	public Security security;
	/**
	 * The {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 */
	@XmlElement(name = "Network")
	public Network network;
	/**
	 * The {{object}} object describes the configuration capabilities related for remote management of the ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.6 Node Manager}}.
	 */
	@XmlElement(name = "NodeManager")
	public NodeManager nodeManager;
	/**
	 * The {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Binding Table as defined in {{bibref|ZigBee2007|section 2.2.8.2 Binding}}.
	 */
	@XmlElementWrapper(name = "Bindings")
	@XmlElement(name = "Binding")
	@CWMPParameter(access = "readWrite")
	public Collection<Binding> bindings;
	/**
	 * The {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Group Table as defined in {{bibref|ZigBee2007|section 2.5.2.7 Group Manager}}.
	 */
	@XmlElementWrapper(name = "Groups")
	@XmlElement(name = "Group")
	@CWMPParameter(access = "readWrite")
	public Collection<Group> groups;
	/**
	 * The {{object}} object describes the application endpoint as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.
	 */
	@XmlElementWrapper(name = "ApplicationEndpoints")
	@XmlElement(name = "ApplicationEndpoint")
	@CWMPParameter(access = "readWrite")
	public Collection<ApplicationEndpoint> applicationEndpoints;

	public ZDO() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public ZDO withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

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
	public ZDO withIeeEAddress(IEEE_EUI64 ieeEAddress) {
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
	public ZDO withNetworkAddress(ZigBeeNetworkAddress networkAddress) {
		this.networkAddress = networkAddress;
		return this;
	}

	/**
	 * Get the {{object}} object describes the node capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.3 Node Descriptor}}.
	 *
	 * @return the value
	 */
	public NodeDescriptor getNodeDescriptor() {
		return nodeDescriptor;
	}

	/**
	 * Set the {{object}} object describes the node capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.3 Node Descriptor}}.
	 *
	 * @param nodeDescriptor the input value
	 */
	public void  setNodeDescriptor(NodeDescriptor nodeDescriptor) {
		this.nodeDescriptor = nodeDescriptor;
	}

	/**
	 * Set the {{object}} object describes the node capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.3 Node Descriptor}}.
	 *
	 * @param nodeDescriptor the input value
	 * @return this instance
	 */
	public ZDO withNodeDescriptor(NodeDescriptor nodeDescriptor) {
		this.nodeDescriptor = nodeDescriptor;
		return this;
	}

	/**
	 * Get the {{object}} object describes the power capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.4 Node Power Descriptor}}.
	 *
	 * @return the value
	 */
	public PowerDescriptor getPowerDescriptor() {
		return powerDescriptor;
	}

	/**
	 * Set the {{object}} object describes the power capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.4 Node Power Descriptor}}.
	 *
	 * @param powerDescriptor the input value
	 */
	public void  setPowerDescriptor(PowerDescriptor powerDescriptor) {
		this.powerDescriptor = powerDescriptor;
	}

	/**
	 * Set the {{object}} object describes the power capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.4 Node Power Descriptor}}.
	 *
	 * @param powerDescriptor the input value
	 * @return this instance
	 */
	public ZDO withPowerDescriptor(PowerDescriptor powerDescriptor) {
		this.powerDescriptor = powerDescriptor;
		return this;
	}

	/**
	 * Get the {{object}} object is an optional descriptor that describes user defined capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.7 User Descriptor}}. The {{object}} object contains information that allows the user to identify the device using a user-friendly character string, such as "Bedroom TV" or "Stairs Light".
	 *
	 * @return the value
	 */
	public UserDescriptor getUserDescriptor() {
		return userDescriptor;
	}

	/**
	 * Set the {{object}} object is an optional descriptor that describes user defined capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.7 User Descriptor}}. The {{object}} object contains information that allows the user to identify the device using a user-friendly character string, such as "Bedroom TV" or "Stairs Light".
	 *
	 * @param userDescriptor the input value
	 */
	public void  setUserDescriptor(UserDescriptor userDescriptor) {
		this.userDescriptor = userDescriptor;
	}

	/**
	 * Set the {{object}} object is an optional descriptor that describes user defined capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.7 User Descriptor}}. The {{object}} object contains information that allows the user to identify the device using a user-friendly character string, such as "Bedroom TV" or "Stairs Light".
	 *
	 * @param userDescriptor the input value
	 * @return this instance
	 */
	public ZDO withUserDescriptor(UserDescriptor userDescriptor) {
		this.userDescriptor = userDescriptor;
		return this;
	}

	/**
	 * Get the {{object}} object is an optional descriptor that describes extended capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.6 Complex Descriptor}}.
	 *
	 * @return the value
	 */
	public ComplexDescriptor getComplexDescriptor() {
		return complexDescriptor;
	}

	/**
	 * Set the {{object}} object is an optional descriptor that describes extended capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.6 Complex Descriptor}}.
	 *
	 * @param complexDescriptor the input value
	 */
	public void  setComplexDescriptor(ComplexDescriptor complexDescriptor) {
		this.complexDescriptor = complexDescriptor;
	}

	/**
	 * Set the {{object}} object is an optional descriptor that describes extended capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.6 Complex Descriptor}}.
	 *
	 * @param complexDescriptor the input value
	 * @return this instance
	 */
	public ZDO withComplexDescriptor(ComplexDescriptor complexDescriptor) {
		this.complexDescriptor = complexDescriptor;
		return this;
	}

	/**
	 * Get the {{object}} object provides the configuration capabilities needed to perform the Security Management functionality defined in {{bibref|ZigBee2007|section 4 Security Management}}.
	 *
	 * @return the value
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * Set the {{object}} object provides the configuration capabilities needed to perform the Security Management functionality defined in {{bibref|ZigBee2007|section 4 Security Management}}.
	 *
	 * @param security the input value
	 */
	public void  setSecurity(Security security) {
		this.security = security;
	}

	/**
	 * Set the {{object}} object provides the configuration capabilities needed to perform the Security Management functionality defined in {{bibref|ZigBee2007|section 4 Security Management}}.
	 *
	 * @param security the input value
	 * @return this instance
	 */
	public ZDO withSecurity(Security security) {
		this.security = security;
		return this;
	}

	/**
	 * Get the {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @return the value
	 */
	public Network getNetwork() {
		return network;
	}

	/**
	 * Set the {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @param network the input value
	 */
	public void  setNetwork(Network network) {
		this.network = network;
	}

	/**
	 * Set the {{object}} object provides the configuration capabilities needed to by a ZigBee Device to operate within a ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.4 Network Manager}}.
	 *
	 * @param network the input value
	 * @return this instance
	 */
	public ZDO withNetwork(Network network) {
		this.network = network;
		return this;
	}

	/**
	 * Get the {{object}} object describes the configuration capabilities related for remote management of the ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.6 Node Manager}}.
	 *
	 * @return the value
	 */
	public NodeManager getNodeManager() {
		return nodeManager;
	}

	/**
	 * Set the {{object}} object describes the configuration capabilities related for remote management of the ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.6 Node Manager}}.
	 *
	 * @param nodeManager the input value
	 */
	public void  setNodeManager(NodeManager nodeManager) {
		this.nodeManager = nodeManager;
	}

	/**
	 * Set the {{object}} object describes the configuration capabilities related for remote management of the ZigBee Area Network as defined in {{bibref|ZigBee2007|section 2.5.2.6 Node Manager}}.
	 *
	 * @param nodeManager the input value
	 * @return this instance
	 */
	public ZDO withNodeManager(NodeManager nodeManager) {
		this.nodeManager = nodeManager;
		return this;
	}

	/**
	 * Get the {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Binding Table as defined in {{bibref|ZigBee2007|section 2.2.8.2 Binding}}.
	 *
	 * @return the value
	 */
	public Collection<Binding> getBindings() {
		if (this.bindings == null){ this.bindings=new ArrayList<>();}
		return bindings;
	}

	/**
	 * Set the {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Binding Table as defined in {{bibref|ZigBee2007|section 2.2.8.2 Binding}}.
	 *
	 * @param bindings the input value
	 */
	public void  setBindings(Collection<Binding> bindings) {
		this.bindings = bindings;
	}

	/**
	 * Set the {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Binding Table as defined in {{bibref|ZigBee2007|section 2.2.8.2 Binding}}.
	 *
	 * @param binding the input value
	 * @return this instance
	 */
	public ZDO withBinding(Binding binding) {
		getBindings().add(binding);
		return this;
	}

	/**
	 * Get the {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Group Table as defined in {{bibref|ZigBee2007|section 2.5.2.7 Group Manager}}.
	 *
	 * @return the value
	 */
	public Collection<Group> getGroups() {
		if (this.groups == null){ this.groups=new ArrayList<>();}
		return groups;
	}

	/**
	 * Set the {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Group Table as defined in {{bibref|ZigBee2007|section 2.5.2.7 Group Manager}}.
	 *
	 * @param groups the input value
	 */
	public void  setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	/**
	 * Set the {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Group Table as defined in {{bibref|ZigBee2007|section 2.5.2.7 Group Manager}}.
	 *
	 * @param group the input value
	 * @return this instance
	 */
	public ZDO withGroup(Group group) {
		getGroups().add(group);
		return this;
	}

	/**
	 * Get the {{object}} object describes the application endpoint as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.
	 *
	 * @return the value
	 */
	public Collection<ApplicationEndpoint> getApplicationEndpoints() {
		if (this.applicationEndpoints == null){ this.applicationEndpoints=new ArrayList<>();}
		return applicationEndpoints;
	}

	/**
	 * Set the {{object}} object describes the application endpoint as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.
	 *
	 * @param applicationEndpoints the input value
	 */
	public void  setApplicationEndpoints(Collection<ApplicationEndpoint> applicationEndpoints) {
		this.applicationEndpoints = applicationEndpoints;
	}

	/**
	 * Set the {{object}} object describes the application endpoint as defined in {{bibref|ZigBee2007|section 2.1.2 Application Framework}}.
	 *
	 * @param applicationEndpoint the input value
	 * @return this instance
	 */
	public ZDO withApplicationEndpoint(ApplicationEndpoint applicationEndpoint) {
		getApplicationEndpoints().add(applicationEndpoint);
		return this;
	}

	//</editor-fold>

}