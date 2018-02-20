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
package org.broadbandforum.tr181.device.cellular;

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
import org.broadbandforum.common.IPAddress;

	/**
	 * Cellular Access Point table. Each entry is identified by an {{param|APN}} (Access Point Name) that identifies a gateway between the mobile network and another computer network.
	 *
	 * @since TR181 v2.8
	 */
@CWMPObject(name = "Device.Cellular.AccessPoint.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"APN"}),
	@CWMPUnique(names = {"Interface"})})
@XmlRootElement(name = "Device.Cellular.AccessPoint")
@XmlType(name = "Device.Cellular.AccessPoint")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccessPoint {

	/**
	 * Enables or disables the Access Point.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Access Point Name.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "APN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String apn;
	/**
	 * Username used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Proxy server IP address.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Proxy")
	@CWMPParameter(access = "readWrite")
	public IPAddress proxy;
	/**
	 * Proxy server port.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ProxyPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long proxyPort;
	/**
	 * Reference to the interface with which the access point is associated.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public String _interface;

	public AccessPoint() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the Access Point.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the Access Point.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the Access Point.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public AccessPoint withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public AccessPoint withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get access Point Name.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getApn() {
		return apn;
	}

	/**
	 * Set access Point Name.
	 *
	 * @since 2.8
	 * @param apn the input value
	 */
	public void  setApn(String apn) {
		this.apn = apn;
	}

	/**
	 * Set access Point Name.
	 *
	 * @since 2.8
	 * @param apn the input value
	 * @return this instance
	 */
	public AccessPoint withApn(String apn) {
		this.apn = apn;
		return this;
	}

	/**
	 * Get the username used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 * @param username the input value
	 * @return this instance
	 */
	public AccessPoint withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the Access Point.
	 *
	 * @since 2.8
	 * @param password the input value
	 * @return this instance
	 */
	public AccessPoint withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the proxy server IP address.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getProxy() {
		return proxy;
	}

	/**
	 * Set the proxy server IP address.
	 *
	 * @since 2.8
	 * @param proxy the input value
	 */
	public void  setProxy(IPAddress proxy) {
		this.proxy = proxy;
	}

	/**
	 * Set the proxy server IP address.
	 *
	 * @since 2.8
	 * @param proxy the input value
	 * @return this instance
	 */
	public AccessPoint withProxy(IPAddress proxy) {
		this.proxy = proxy;
		return this;
	}

	/**
	 * Get the proxy server port.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getProxyPort() {
		return proxyPort;
	}

	/**
	 * Set the proxy server port.
	 *
	 * @since 2.8
	 * @param proxyPort the input value
	 */
	public void  setProxyPort(Long proxyPort) {
		this.proxyPort = proxyPort;
	}

	/**
	 * Set the proxy server port.
	 *
	 * @since 2.8
	 * @param proxyPort the input value
	 * @return this instance
	 */
	public AccessPoint withProxyPort(Long proxyPort) {
		this.proxyPort = proxyPort;
		return this;
	}

	/**
	 * Get the reference to the interface with which the access point is associated.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the reference to the interface with which the access point is associated.
	 *
	 * @since 2.8
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the reference to the interface with which the access point is associated.
	 *
	 * @since 2.8
	 * @param _interface the input value
	 * @return this instance
	 */
	public AccessPoint with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	//</editor-fold>

}