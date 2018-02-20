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
package org.broadbandforum.tr181.device.zigbee.zdo;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.ZigBeeNetworkAddress;

	/**
	 * The {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Group Table as defined in {{bibref|ZigBee2007|section 2.5.2.7 Group Manager}}.
	 *
	 * @since TR181 v2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.Group.{i}.", uniqueConstraints = {@CWMPUnique(names = {"GroupId"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.ZigBee.ZDO.Group")
@XmlType(name = "Device.ZigBee.ZDO.Group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {

	/**
	 * Enables or disables the use of this group on the device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The Group Identifier for this object as defined in {{bibref|ZigBee2007|table 2.25 Group Table Entry Format}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "GroupId")
	@CWMPParameter(access = "readWrite")
	public ZigBeeNetworkAddress groupId;
	/**
	 * The list of application endpoints assigned as a member of this {{object}} object.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "EndpointList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> endpointList;

	public Group() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the use of this group on the device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the use of this group on the device.
	 *
	 * @since 2.7
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the use of this group on the device.
	 *
	 * @since 2.7
	 * @param enable the input value
	 * @return this instance
	 */
	public Group withEnable(Boolean enable) {
		this.enable = enable;
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
	public Group withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the Group Identifier for this object as defined in {{bibref|ZigBee2007|table 2.25 Group Table Entry Format}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public ZigBeeNetworkAddress getGroupId() {
		return groupId;
	}

	/**
	 * Set the Group Identifier for this object as defined in {{bibref|ZigBee2007|table 2.25 Group Table Entry Format}}.
	 *
	 * @since 2.7
	 * @param groupId the input value
	 */
	public void  setGroupId(ZigBeeNetworkAddress groupId) {
		this.groupId = groupId;
	}

	/**
	 * Set the Group Identifier for this object as defined in {{bibref|ZigBee2007|table 2.25 Group Table Entry Format}}.
	 *
	 * @since 2.7
	 * @param groupId the input value
	 * @return this instance
	 */
	public Group withGroupId(ZigBeeNetworkAddress groupId) {
		this.groupId = groupId;
		return this;
	}

	/**
	 * Get the list of application endpoints assigned as a member of this {{object}} object.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getEndpointList() {
		if (this.endpointList == null){ this.endpointList=new ArrayList<>();}
		return endpointList;
	}

	/**
	 * Set the list of application endpoints assigned as a member of this {{object}} object.
	 *
	 * @since 2.7
	 * @param endpointList the input value
	 */
	public void  setEndpointList(Collection<String> endpointList) {
		this.endpointList = endpointList;
	}

	/**
	 * Set the list of application endpoints assigned as a member of this {{object}} object.
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public Group withEndpointList(String string) {
		getEndpointList().add(string);
		return this;
	}

	//</editor-fold>

}