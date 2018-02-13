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

	/**
	 * This object allows the configuration of the HTTP server.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.HTTPServer.")
@XmlRootElement(name = "StorageService.HTTPServer")
@XmlType(name = "StorageService.HTTPServer")
@XmlAccessorType(XmlAccessType.FIELD)
public class HTTPServer {

	/**
	 * Enables or disables the HTTP server.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current status of this HTTP server.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Maximum number of users allowed to log in to the device at once via HTTP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxNumUsers")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 32)
	public Long maxNumUsers;
	/**
	 * Maximum amount of time in seconds that the HTTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IdleTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 600)
	public Long idleTime;
	/**
	 * Is support for the HTTP PUT/POST mechanism (WebDAV) enabled?
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HTTPWritingEnabled")
	public Boolean httPWritingEnabled;
	/**
	 * The port number that the HTTP server is listening on.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long portNumber = 80L;
	/**
	 * If {{true}}, HTTP will require login prior to access (basic or digest authentication).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AuthenticationReq")
	@CWMPParameter(access = "readWrite")
	public Boolean authenticationReq;

	public HTTPServer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the HTTP server.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the HTTP server.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the HTTP server.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public HTTPServer withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current status of this HTTP server.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current status of this HTTP server.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current status of this HTTP server.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public HTTPServer withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the maximum number of users allowed to log in to the device at once via HTTP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxNumUsers() {
		return maxNumUsers;
	}

	/**
	 * Set the maximum number of users allowed to log in to the device at once via HTTP.
	 *
	 * @since 1.0
	 * @param maxNumUsers the input value
	 */
	public void  setMaxNumUsers(Long maxNumUsers) {
		this.maxNumUsers = maxNumUsers;
	}

	/**
	 * Set the maximum number of users allowed to log in to the device at once via HTTP.
	 *
	 * @since 1.0
	 * @param maxNumUsers the input value
	 * @return this instance
	 */
	public HTTPServer withMaxNumUsers(Long maxNumUsers) {
		this.maxNumUsers = maxNumUsers;
		return this;
	}

	/**
	 * Get the maximum amount of time in seconds that the HTTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIdleTime() {
		return idleTime;
	}

	/**
	 * Set the maximum amount of time in seconds that the HTTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 * @param idleTime the input value
	 */
	public void  setIdleTime(Long idleTime) {
		this.idleTime = idleTime;
	}

	/**
	 * Set the maximum amount of time in seconds that the HTTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 * @param idleTime the input value
	 * @return this instance
	 */
	public HTTPServer withIdleTime(Long idleTime) {
		this.idleTime = idleTime;
		return this;
	}

	/**
	 * Get the is support for the HTTP PUT/POST mechanism (WebDAV) enabled?
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isHttPWritingEnabled() {
		return httPWritingEnabled;
	}

	/**
	 * Set the is support for the HTTP PUT/POST mechanism (WebDAV) enabled?
	 *
	 * @since 1.0
	 * @param httPWritingEnabled the input value
	 */
	public void  setHttPWritingEnabled(Boolean httPWritingEnabled) {
		this.httPWritingEnabled = httPWritingEnabled;
	}

	/**
	 * Set the is support for the HTTP PUT/POST mechanism (WebDAV) enabled?
	 *
	 * @since 1.0
	 * @param httPWritingEnabled the input value
	 * @return this instance
	 */
	public HTTPServer withHttPWritingEnabled(Boolean httPWritingEnabled) {
		this.httPWritingEnabled = httPWritingEnabled;
		return this;
	}

	/**
	 * Get the port number that the HTTP server is listening on.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPortNumber() {
		return portNumber;
	}

	/**
	 * Set the port number that the HTTP server is listening on.
	 *
	 * @since 1.0
	 * @param portNumber the input value
	 */
	public void  setPortNumber(Long portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * Set the port number that the HTTP server is listening on.
	 *
	 * @since 1.0
	 * @param portNumber the input value
	 * @return this instance
	 */
	public HTTPServer withPortNumber(Long portNumber) {
		this.portNumber = portNumber;
		return this;
	}

	/**
	 * Get the if {{true}}, HTTP will require login prior to access (basic or digest authentication).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isAuthenticationReq() {
		return authenticationReq;
	}

	/**
	 * Set the if {{true}}, HTTP will require login prior to access (basic or digest authentication).
	 *
	 * @since 1.0
	 * @param authenticationReq the input value
	 */
	public void  setAuthenticationReq(Boolean authenticationReq) {
		this.authenticationReq = authenticationReq;
	}

	/**
	 * Set the if {{true}}, HTTP will require login prior to access (basic or digest authentication).
	 *
	 * @since 1.0
	 * @param authenticationReq the input value
	 * @return this instance
	 */
	public HTTPServer withAuthenticationReq(Boolean authenticationReq) {
		this.authenticationReq = authenticationReq;
		return this;
	}

	//</editor-fold>

}