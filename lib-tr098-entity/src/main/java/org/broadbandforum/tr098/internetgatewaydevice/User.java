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
package org.broadbandforum.tr098.internetgatewaydevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * This object contains parameters relating to the user characteristics.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.User.{i}.")
@XmlRootElement(name = "User")
@XmlType(name = "InternetGatewayDevice.User")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enables/disables this user object instance.

If the User being configured is currently accessing the device then a disable MUST apply to the next user session and the current user session MUST NOT be abruptly terminated.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Allows this user to remotely access the UserInterface via the mechanism defined in {{object|.UserInterface.RemoteAccess.}}
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "RemoteAccessCapable")
	@CWMPParameter(access = "readWrite")
	public Boolean remoteAccessCapable = false;
	/**
	 * Name of the current user. MUST NOT be {{empty}} for an enabled entry.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String username;
	/**
	 * The user's password.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String password;
	/**
	 * String describing the default language for the local configuration interface, specified according to {{bibref|RFC3066}}.

If {{empty}}, {{param|.UserInterface.CurrentLanguage}} is used.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Language")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String language;

	public User() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public User withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables/disables this user object instance.

If the User being configured is currently accessing the device then a disable MUST apply to the next user session and the current user session MUST NOT be abruptly terminated.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables/disables this user object instance.

If the User being configured is currently accessing the device then a disable MUST apply to the next user session and the current user session MUST NOT be abruptly terminated.
	 *
	 * @since 1.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables/disables this user object instance.

If the User being configured is currently accessing the device then a disable MUST apply to the next user session and the current user session MUST NOT be abruptly terminated.
	 *
	 * @since 1.5
	 * @param enable the input value
	 * @return this instance
	 */
	public User withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get allows this user to remotely access the UserInterface via the mechanism defined in {{object|.UserInterface.RemoteAccess.}}
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Boolean isRemoteAccessCapable() {
		return remoteAccessCapable;
	}

	/**
	 * Set allows this user to remotely access the UserInterface via the mechanism defined in {{object|.UserInterface.RemoteAccess.}}
	 *
	 * @since 1.5
	 * @param remoteAccessCapable the input value
	 */
	public void  setRemoteAccessCapable(Boolean remoteAccessCapable) {
		this.remoteAccessCapable = remoteAccessCapable;
	}

	/**
	 * Set allows this user to remotely access the UserInterface via the mechanism defined in {{object|.UserInterface.RemoteAccess.}}
	 *
	 * @since 1.5
	 * @param remoteAccessCapable the input value
	 * @return this instance
	 */
	public User withRemoteAccessCapable(Boolean remoteAccessCapable) {
		this.remoteAccessCapable = remoteAccessCapable;
		return this;
	}

	/**
	 * Get the name of the current user. MUST NOT be {{empty}} for an enabled entry.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the name of the current user. MUST NOT be {{empty}} for an enabled entry.
	 *
	 * @since 1.5
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the name of the current user. MUST NOT be {{empty}} for an enabled entry.
	 *
	 * @since 1.5
	 * @param username the input value
	 * @return this instance
	 */
	public User withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the user's password.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the user's password.
	 *
	 * @since 1.5
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the user's password.
	 *
	 * @since 1.5
	 * @param password the input value
	 * @return this instance
	 */
	public User withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the string describing the default language for the local configuration interface, specified according to {{bibref|RFC3066}}.

If {{empty}}, {{param|.UserInterface.CurrentLanguage}} is used.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Set the string describing the default language for the local configuration interface, specified according to {{bibref|RFC3066}}.

If {{empty}}, {{param|.UserInterface.CurrentLanguage}} is used.
	 *
	 * @since 1.5
	 * @param language the input value
	 */
	public void  setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Set the string describing the default language for the local configuration interface, specified according to {{bibref|RFC3066}}.

If {{empty}}, {{param|.UserInterface.CurrentLanguage}} is used.
	 *
	 * @since 1.5
	 * @param language the input value
	 * @return this instance
	 */
	public User withLanguage(String language) {
		this.language = language;
		return this;
	}

	//</editor-fold>

}