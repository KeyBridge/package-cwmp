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
package org.broadbandforum.tr140.storageservice.logicalvolume.folder;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr140.datatypes.Alias;

	/**
	 * This object provides information about each user group configured for access permissions on this folder.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.LogicalVolume.{i}.Folder.{i}.GroupAccess.{i}.")
@XmlRootElement(name = "StorageService.LogicalVolume.Folder.GroupAccess")
@XmlType(name = "StorageService.LogicalVolume.Folder.GroupAccess")
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupAccess {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enables or disables the entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Represents a user group that is a collection of User Accounts that have access to this folder.  The {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GroupReference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String groupReference;
	/**
	 * What permissions the group members have over this {{object|.LogicalVolume.{i}.Folder.{i}.}} instance.  This is an integer value like the xNIX systems use for access permissions, meaning that it is a 3-bit field with the following structure:

:100 = read field

:010 = write field

:001 = execute field
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Permissions")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long permissions = 7L;

	public GroupAccess() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public GroupAccess withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables the entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the entry.
	 *
	 * @since 1.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the entry.
	 *
	 * @since 1.1
	 * @param enable the input value
	 * @return this instance
	 */
	public GroupAccess withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the represents a user group that is a collection of User Accounts that have access to this folder.  The {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getGroupReference() {
		return groupReference;
	}

	/**
	 * Set the represents a user group that is a collection of User Accounts that have access to this folder.  The {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @param groupReference the input value
	 */
	public void  setGroupReference(String groupReference) {
		this.groupReference = groupReference;
	}

	/**
	 * Set the represents a user group that is a collection of User Accounts that have access to this folder.  The {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @param groupReference the input value
	 * @return this instance
	 */
	public GroupAccess withGroupReference(String groupReference) {
		this.groupReference = groupReference;
		return this;
	}

	/**
	 * Get the what permissions the group members have over this {{object|.LogicalVolume.{i}.Folder.{i}.}} instance.  This is an integer value like the xNIX systems use for access permissions, meaning that it is a 3-bit field with the following structure:

:100 = read field

:010 = write field

:001 = execute field
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPermissions() {
		return permissions;
	}

	/**
	 * Set the what permissions the group members have over this {{object|.LogicalVolume.{i}.Folder.{i}.}} instance.  This is an integer value like the xNIX systems use for access permissions, meaning that it is a 3-bit field with the following structure:

:100 = read field

:010 = write field

:001 = execute field
	 *
	 * @since 1.0
	 * @param permissions the input value
	 */
	public void  setPermissions(Long permissions) {
		this.permissions = permissions;
	}

	/**
	 * Set the what permissions the group members have over this {{object|.LogicalVolume.{i}.Folder.{i}.}} instance.  This is an integer value like the xNIX systems use for access permissions, meaning that it is a 3-bit field with the following structure:

:100 = read field

:010 = write field

:001 = execute field
	 *
	 * @since 1.0
	 * @param permissions the input value
	 * @return this instance
	 */
	public GroupAccess withPermissions(Long permissions) {
		this.permissions = permissions;
		return this;
	}

	//</editor-fold>

}