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
	 * This object allows the configuration of the SSH FTP server.
	 *
	 * @since TR140 v1.0
	 */
@CWMPObject(name = "StorageService.{i}.SFTPServer.")
@XmlRootElement(name = "StorageService.SFTPServer")
@XmlType(name = "StorageService.SFTPServer")
@XmlAccessorType(XmlAccessType.FIELD)
public class SFTPServer {

	/**
	 * Enables or disables the SSH FTP server.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current status of this SSH FTP server.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Maximum number of users allowed to log in to the device at once via SFTP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxNumUsers")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 32)
	public Long maxNumUsers;
	/**
	 * Maximum amount of time in seconds that the SFTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IdleTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 600)
	public Long idleTime;
	/**
	 * The port number that the SSH FTP server is listening on.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PortNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long portNumber = 115L;

	public SFTPServer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the SSH FTP server.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the SSH FTP server.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the SSH FTP server.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SFTPServer withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current status of this SSH FTP server.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current status of this SSH FTP server.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current status of this SSH FTP server.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public SFTPServer withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the maximum number of users allowed to log in to the device at once via SFTP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxNumUsers() {
		return maxNumUsers;
	}

	/**
	 * Set the maximum number of users allowed to log in to the device at once via SFTP.
	 *
	 * @since 1.0
	 * @param maxNumUsers the input value
	 */
	public void  setMaxNumUsers(Long maxNumUsers) {
		this.maxNumUsers = maxNumUsers;
	}

	/**
	 * Set the maximum number of users allowed to log in to the device at once via SFTP.
	 *
	 * @since 1.0
	 * @param maxNumUsers the input value
	 * @return this instance
	 */
	public SFTPServer withMaxNumUsers(Long maxNumUsers) {
		this.maxNumUsers = maxNumUsers;
		return this;
	}

	/**
	 * Get the maximum amount of time in seconds that the SFTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIdleTime() {
		return idleTime;
	}

	/**
	 * Set the maximum amount of time in seconds that the SFTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 * @param idleTime the input value
	 */
	public void  setIdleTime(Long idleTime) {
		this.idleTime = idleTime;
	}

	/**
	 * Set the maximum amount of time in seconds that the SFTP socket will remain open without any activity.  If set to 0 an infinite timeout will apply.
	 *
	 * @since 1.0
	 * @param idleTime the input value
	 * @return this instance
	 */
	public SFTPServer withIdleTime(Long idleTime) {
		this.idleTime = idleTime;
		return this;
	}

	/**
	 * Get the port number that the SSH FTP server is listening on.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPortNumber() {
		return portNumber;
	}

	/**
	 * Set the port number that the SSH FTP server is listening on.
	 *
	 * @since 1.0
	 * @param portNumber the input value
	 */
	public void  setPortNumber(Long portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * Set the port number that the SSH FTP server is listening on.
	 *
	 * @since 1.0
	 * @param portNumber the input value
	 * @return this instance
	 */
	public SFTPServer withPortNumber(Long portNumber) {
		this.portNumber = portNumber;
		return this;
	}

	//</editor-fold>

}