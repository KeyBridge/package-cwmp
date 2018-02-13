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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr140.datatypes.Alias;

	/**
	 * This object provides information about each user configured on this device, which provides a means for controlling access to the device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.UserAccount.{i}.")
@XmlRootElement(name = "StorageService.UserAccount")
@XmlType(name = "StorageService.UserAccount")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserAccount {

	/**
	 * Enables or disables this user.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The unique name of the user.  Also used for authentication.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String username;
	/**
	 * Password used to authenticate the user when connecting to the Storage Service Device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String password;
	/**
	 * Represents a User Group that this User Account is a member of.  Each {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UserGroupParticipation")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> userGroupParticipation;
	/**
	 * Enables or disables access via FTP (including SSH FTP access) for this user.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AllowFTPAccess")
	@CWMPParameter(access = "readWrite")
	public Boolean allowFTPAccess = false;
	/**
	 * Enables or disables access via HTTP (including HTTPS access) for this user.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AllowHTTPAccess")
	@CWMPParameter(access = "readWrite")
	public Boolean allowHTTPAccess = false;

	public UserAccount() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this user.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this user.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this user.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public UserAccount withEnable(Boolean enable) {
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
	public UserAccount withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique name of the user.  Also used for authentication.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the unique name of the user.  Also used for authentication.
	 *
	 * @since 1.0
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the unique name of the user.  Also used for authentication.
	 *
	 * @since 1.0
	 * @param username the input value
	 * @return this instance
	 */
	public UserAccount withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate the user when connecting to the Storage Service Device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate the user when connecting to the Storage Service Device.
	 *
	 * @since 1.0
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate the user when connecting to the Storage Service Device.
	 *
	 * @since 1.0
	 * @param password the input value
	 * @return this instance
	 */
	public UserAccount withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the represents a User Group that this User Account is a member of.  Each {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getUserGroupParticipation() {
		if (this.userGroupParticipation == null){ this.userGroupParticipation=new ArrayList<>();}
		return userGroupParticipation;
	}

	/**
	 * Set the represents a User Group that this User Account is a member of.  Each {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @param userGroupParticipation the input value
	 */
	public void  setUserGroupParticipation(Collection<String> userGroupParticipation) {
		this.userGroupParticipation = userGroupParticipation;
	}

	/**
	 * Set the represents a User Group that this User Account is a member of.  Each {{object|.UserGroup.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public UserAccount withUserGroupParticipation(String string) {
		getUserGroupParticipation().add(string);
		return this;
	}

	/**
	 * Get the enables or disables access via FTP (including SSH FTP access) for this user.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isAllowFTPAccess() {
		return allowFTPAccess;
	}

	/**
	 * Set the enables or disables access via FTP (including SSH FTP access) for this user.
	 *
	 * @since 1.0
	 * @param allowFTPAccess the input value
	 */
	public void  setAllowFTPAccess(Boolean allowFTPAccess) {
		this.allowFTPAccess = allowFTPAccess;
	}

	/**
	 * Set the enables or disables access via FTP (including SSH FTP access) for this user.
	 *
	 * @since 1.0
	 * @param allowFTPAccess the input value
	 * @return this instance
	 */
	public UserAccount withAllowFTPAccess(Boolean allowFTPAccess) {
		this.allowFTPAccess = allowFTPAccess;
		return this;
	}

	/**
	 * Get the enables or disables access via HTTP (including HTTPS access) for this user.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isAllowHTTPAccess() {
		return allowHTTPAccess;
	}

	/**
	 * Set the enables or disables access via HTTP (including HTTPS access) for this user.
	 *
	 * @since 1.0
	 * @param allowHTTPAccess the input value
	 */
	public void  setAllowHTTPAccess(Boolean allowHTTPAccess) {
		this.allowHTTPAccess = allowHTTPAccess;
	}

	/**
	 * Set the enables or disables access via HTTP (including HTTPS access) for this user.
	 *
	 * @since 1.0
	 * @param allowHTTPAccess the input value
	 * @return this instance
	 */
	public UserAccount withAllowHTTPAccess(Boolean allowHTTPAccess) {
		this.allowHTTPAccess = allowHTTPAccess;
		return this;
	}

	//</editor-fold>

}