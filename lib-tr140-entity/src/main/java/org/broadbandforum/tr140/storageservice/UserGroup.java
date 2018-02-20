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
package org.broadbandforum.tr140.storageservice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This object provides information about each user group configured on this device, which allows the grouping of user accounts for easier maintenance of permissions.
	 *
	 * @since TR140 v1.0
	 */
@CWMPObject(name = "StorageService.{i}.UserGroup.{i}.", uniqueConstraints = {@CWMPUnique(names = {"GroupName"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "StorageService.UserGroup")
@XmlType(name = "StorageService.UserGroup")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserGroup {

	/**
	 * Enables or disables this group.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The unique name of the group.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GroupName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String groupName;

	public UserGroup() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this group.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this group.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this group.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public UserGroup withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public UserGroup withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique name of the group.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Set the unique name of the group.
	 *
	 * @since 1.0
	 * @param groupName the input value
	 */
	public void  setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * Set the unique name of the group.
	 *
	 * @since 1.0
	 * @param groupName the input value
	 * @return this instance
	 */
	public UserGroup withGroupName(String groupName) {
		this.groupName = groupName;
		return this;
	}

	//</editor-fold>

}