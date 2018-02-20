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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object allows the control of network layer protocols authorization enforcement.
	 *
	 * @since TR140 v1.0
	 */
@CWMPObject(name = "StorageService.{i}.NetworkServer.")
@XmlRootElement(name = "StorageService.NetworkServer")
@XmlType(name = "StorageService.NetworkServer")
@XmlAccessorType(XmlAccessType.FIELD)
public class NetworkServer {

	/**
	 * Enables or disables the AFP network protocol.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AFPEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean afpEnable;
	/**
	 * Enables or disables the NFS network protocol.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NFSEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean nfsEnable;
	/**
	 * Enables or disables the SMB network protocol.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SMBEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean smbEnable;
	/**
	 * If this parameter is set to {{false}} then the device MUST NOT attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB.  If this parameter is set to {{true}} then the device MUST attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB by using an instance of {{object|.UserAccount.{i}.}} found on this device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NetworkProtocolAuthReq")
	@CWMPParameter(access = "readWrite")
	public Boolean networkProtocolAuthReq;

	public NetworkServer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the AFP network protocol.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isAfpEnable() {
		return afpEnable;
	}

	/**
	 * Set the enables or disables the AFP network protocol.
	 *
	 * @since 1.0
	 * @param afpEnable the input value
	 */
	public void  setAfpEnable(Boolean afpEnable) {
		this.afpEnable = afpEnable;
	}

	/**
	 * Set the enables or disables the AFP network protocol.
	 *
	 * @since 1.0
	 * @param afpEnable the input value
	 * @return this instance
	 */
	public NetworkServer withAfpEnable(Boolean afpEnable) {
		this.afpEnable = afpEnable;
		return this;
	}

	/**
	 * Get the enables or disables the NFS network protocol.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isNfsEnable() {
		return nfsEnable;
	}

	/**
	 * Set the enables or disables the NFS network protocol.
	 *
	 * @since 1.0
	 * @param nfsEnable the input value
	 */
	public void  setNfsEnable(Boolean nfsEnable) {
		this.nfsEnable = nfsEnable;
	}

	/**
	 * Set the enables or disables the NFS network protocol.
	 *
	 * @since 1.0
	 * @param nfsEnable the input value
	 * @return this instance
	 */
	public NetworkServer withNfsEnable(Boolean nfsEnable) {
		this.nfsEnable = nfsEnable;
		return this;
	}

	/**
	 * Get the enables or disables the SMB network protocol.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isSmbEnable() {
		return smbEnable;
	}

	/**
	 * Set the enables or disables the SMB network protocol.
	 *
	 * @since 1.0
	 * @param smbEnable the input value
	 */
	public void  setSmbEnable(Boolean smbEnable) {
		this.smbEnable = smbEnable;
	}

	/**
	 * Set the enables or disables the SMB network protocol.
	 *
	 * @since 1.0
	 * @param smbEnable the input value
	 * @return this instance
	 */
	public NetworkServer withSmbEnable(Boolean smbEnable) {
		this.smbEnable = smbEnable;
		return this;
	}

	/**
	 * Get the if this parameter is set to {{false}} then the device MUST NOT attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB.  If this parameter is set to {{true}} then the device MUST attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB by using an instance of {{object|.UserAccount.{i}.}} found on this device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isNetworkProtocolAuthReq() {
		return networkProtocolAuthReq;
	}

	/**
	 * Set the if this parameter is set to {{false}} then the device MUST NOT attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB.  If this parameter is set to {{true}} then the device MUST attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB by using an instance of {{object|.UserAccount.{i}.}} found on this device.
	 *
	 * @since 1.0
	 * @param networkProtocolAuthReq the input value
	 */
	public void  setNetworkProtocolAuthReq(Boolean networkProtocolAuthReq) {
		this.networkProtocolAuthReq = networkProtocolAuthReq;
	}

	/**
	 * Set the if this parameter is set to {{false}} then the device MUST NOT attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB.  If this parameter is set to {{true}} then the device MUST attempt to request login credentials or authenticate access from network layer protocols such as AFP, NFS, and SMB by using an instance of {{object|.UserAccount.{i}.}} found on this device.
	 *
	 * @since 1.0
	 * @param networkProtocolAuthReq the input value
	 * @return this instance
	 */
	public NetworkServer withNetworkProtocolAuthReq(Boolean networkProtocolAuthReq) {
		this.networkProtocolAuthReq = networkProtocolAuthReq;
		return this;
	}

	//</editor-fold>

}