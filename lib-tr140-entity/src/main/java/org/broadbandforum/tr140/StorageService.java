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
package org.broadbandforum.tr140;

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
import org.broadbandforum.tr140.datatypes.Alias;
import org.broadbandforum.tr140.storageservice.Capabilities;
import org.broadbandforum.tr140.storageservice.FTPServer;
import org.broadbandforum.tr140.storageservice.HTTPSServer;
import org.broadbandforum.tr140.storageservice.HTTPServer;
import org.broadbandforum.tr140.storageservice.LogicalVolume;
import org.broadbandforum.tr140.storageservice.NetInfo;
import org.broadbandforum.tr140.storageservice.NetworkServer;
import org.broadbandforum.tr140.storageservice.PhysicalMedium;
import org.broadbandforum.tr140.storageservice.SFTPServer;
import org.broadbandforum.tr140.storageservice.StorageArray;
import org.broadbandforum.tr140.storageservice.UserAccount;
import org.broadbandforum.tr140.storageservice.UserGroup;

	/**
	 * The Service Object for a Storage Service device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.")
@XmlRootElement(name = "StorageService")
@XmlType(name = "StorageService")
@XmlAccessorType(XmlAccessType.FIELD)
public class StorageService {

	/**
	 * Enables or Disables the entire Storage mechanism.
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
	 * The overall capabilities of a Storage Service device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.

Note that when TR-140 was originally published there was a typo in this object name, which has been corrected.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;
	/**
	 * This object provides general LAN network information about this device.
	 */
	@XmlElement(name = "NetInfo")
	public NetInfo netInfo;
	/**
	 * This object provides information about each user group configured on this device, which allows the grouping of user accounts for easier maintenance of permissions.
	 */
	@XmlElementWrapper(name = "UserGroups")
	@XmlElement(name = "UserGroup")
	@CWMPParameter(access = "readWrite")
	public Collection<UserGroup> userGroups;
	/**
	 * This object provides information about each user configured on this device, which provides a means for controlling access to the device.
	 */
	@XmlElementWrapper(name = "UserAccounts")
	@XmlElement(name = "UserAccount")
	@CWMPParameter(access = "readWrite")
	public Collection<UserAccount> userAccounts;
	/**
	 * This object allows the control of network layer protocols authorization enforcement.
	 */
	@XmlElement(name = "NetworkServer")
	public NetworkServer networkServer;
	/**
	 * This object allows the configuration of the FTP server.
	 */
	@XmlElement(name = "FTPServer")
	public FTPServer ftpServer;
	/**
	 * This object allows the configuration of the SSH FTP server.
	 */
	@XmlElement(name = "SFTPServer")
	public SFTPServer sftPServer;
	/**
	 * This object allows the configuration of the HTTP server.
	 */
	@XmlElement(name = "HTTPServer")
	public HTTPServer httPServer;
	/**
	 * This object allows the configuration of the HTTPS server.
	 */
	@XmlElement(name = "HTTPSServer")
	public HTTPSServer httPSServer;
	/**
	 * This object provides information about each physical medium connected to this device.
	 */
	@XmlElementWrapper(name = "PhysicalMediums")
	@XmlElement(name = "PhysicalMedium")
	public Collection<PhysicalMedium> physicalMediums;
	/**
	 * This object provides information about each storage array (RAID) configured on this device.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}. Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}.
	 */
	@XmlElementWrapper(name = "StorageArraies")
	@XmlElement(name = "StorageArray")
	@CWMPParameter(access = "readWrite")
	public Collection<StorageArray> storageArraies;
	/**
	 * This object provides information about each logical volume configured on this device.  A logical volume can reside either on an instance of a single {{object|.PhysicalMedium.{i}.}} or on an instance of a single {{object|.StorageArray.{i}.}} instance, but it can not span multiple instances of either. {{param|PhysicalReference}} is used to define where this {{object}} instance resides.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.  Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.
	 */
	@XmlElementWrapper(name = "LogicalVolumes")
	@XmlElement(name = "LogicalVolume")
	@CWMPParameter(access = "readWrite")
	public Collection<LogicalVolume> logicalVolumes;

	public StorageService() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or Disables the entire Storage mechanism.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or Disables the entire Storage mechanism.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or Disables the entire Storage mechanism.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public StorageService withEnable(Boolean enable) {
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
	public StorageService withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the overall capabilities of a Storage Service device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.

Note that when TR-140 was originally published there was a typo in this object name, which has been corrected.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the overall capabilities of a Storage Service device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.

Note that when TR-140 was originally published there was a typo in this object name, which has been corrected.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the overall capabilities of a Storage Service device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.

Note that when TR-140 was originally published there was a typo in this object name, which has been corrected.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public StorageService withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	/**
	 * Get the this object provides general LAN network information about this device.
	 *
	 * @return the value
	 */
	public NetInfo getNetInfo() {
		return netInfo;
	}

	/**
	 * Set the this object provides general LAN network information about this device.
	 *
	 * @param netInfo the input value
	 */
	public void  setNetInfo(NetInfo netInfo) {
		this.netInfo = netInfo;
	}

	/**
	 * Set the this object provides general LAN network information about this device.
	 *
	 * @param netInfo the input value
	 * @return this instance
	 */
	public StorageService withNetInfo(NetInfo netInfo) {
		this.netInfo = netInfo;
		return this;
	}

	/**
	 * Get the this object provides information about each user group configured on this device, which allows the grouping of user accounts for easier maintenance of permissions.
	 *
	 * @return the value
	 */
	public Collection<UserGroup> getUserGroups() {
		if (this.userGroups == null){ this.userGroups=new ArrayList<>();}
		return userGroups;
	}

	/**
	 * Set the this object provides information about each user group configured on this device, which allows the grouping of user accounts for easier maintenance of permissions.
	 *
	 * @param userGroups the input value
	 */
	public void  setUserGroups(Collection<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}

	/**
	 * Set the this object provides information about each user group configured on this device, which allows the grouping of user accounts for easier maintenance of permissions.
	 *
	 * @param userGroup the input value
	 * @return this instance
	 */
	public StorageService withUserGroup(UserGroup userGroup) {
		getUserGroups().add(userGroup);
		return this;
	}

	/**
	 * Get the this object provides information about each user configured on this device, which provides a means for controlling access to the device.
	 *
	 * @return the value
	 */
	public Collection<UserAccount> getUserAccounts() {
		if (this.userAccounts == null){ this.userAccounts=new ArrayList<>();}
		return userAccounts;
	}

	/**
	 * Set the this object provides information about each user configured on this device, which provides a means for controlling access to the device.
	 *
	 * @param userAccounts the input value
	 */
	public void  setUserAccounts(Collection<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	/**
	 * Set the this object provides information about each user configured on this device, which provides a means for controlling access to the device.
	 *
	 * @param userAccount the input value
	 * @return this instance
	 */
	public StorageService withUserAccount(UserAccount userAccount) {
		getUserAccounts().add(userAccount);
		return this;
	}

	/**
	 * Get the this object allows the control of network layer protocols authorization enforcement.
	 *
	 * @return the value
	 */
	public NetworkServer getNetworkServer() {
		return networkServer;
	}

	/**
	 * Set the this object allows the control of network layer protocols authorization enforcement.
	 *
	 * @param networkServer the input value
	 */
	public void  setNetworkServer(NetworkServer networkServer) {
		this.networkServer = networkServer;
	}

	/**
	 * Set the this object allows the control of network layer protocols authorization enforcement.
	 *
	 * @param networkServer the input value
	 * @return this instance
	 */
	public StorageService withNetworkServer(NetworkServer networkServer) {
		this.networkServer = networkServer;
		return this;
	}

	/**
	 * Get the this object allows the configuration of the FTP server.
	 *
	 * @return the value
	 */
	public FTPServer getFtpServer() {
		return ftpServer;
	}

	/**
	 * Set the this object allows the configuration of the FTP server.
	 *
	 * @param ftpServer the input value
	 */
	public void  setFtpServer(FTPServer ftpServer) {
		this.ftpServer = ftpServer;
	}

	/**
	 * Set the this object allows the configuration of the FTP server.
	 *
	 * @param ftpServer the input value
	 * @return this instance
	 */
	public StorageService withFtpServer(FTPServer ftpServer) {
		this.ftpServer = ftpServer;
		return this;
	}

	/**
	 * Get the this object allows the configuration of the SSH FTP server.
	 *
	 * @return the value
	 */
	public SFTPServer getSftPServer() {
		return sftPServer;
	}

	/**
	 * Set the this object allows the configuration of the SSH FTP server.
	 *
	 * @param sftPServer the input value
	 */
	public void  setSftPServer(SFTPServer sftPServer) {
		this.sftPServer = sftPServer;
	}

	/**
	 * Set the this object allows the configuration of the SSH FTP server.
	 *
	 * @param sftPServer the input value
	 * @return this instance
	 */
	public StorageService withSftPServer(SFTPServer sftPServer) {
		this.sftPServer = sftPServer;
		return this;
	}

	/**
	 * Get the this object allows the configuration of the HTTP server.
	 *
	 * @return the value
	 */
	public HTTPServer getHttPServer() {
		return httPServer;
	}

	/**
	 * Set the this object allows the configuration of the HTTP server.
	 *
	 * @param httPServer the input value
	 */
	public void  setHttPServer(HTTPServer httPServer) {
		this.httPServer = httPServer;
	}

	/**
	 * Set the this object allows the configuration of the HTTP server.
	 *
	 * @param httPServer the input value
	 * @return this instance
	 */
	public StorageService withHttPServer(HTTPServer httPServer) {
		this.httPServer = httPServer;
		return this;
	}

	/**
	 * Get the this object allows the configuration of the HTTPS server.
	 *
	 * @return the value
	 */
	public HTTPSServer getHttPSServer() {
		return httPSServer;
	}

	/**
	 * Set the this object allows the configuration of the HTTPS server.
	 *
	 * @param httPSServer the input value
	 */
	public void  setHttPSServer(HTTPSServer httPSServer) {
		this.httPSServer = httPSServer;
	}

	/**
	 * Set the this object allows the configuration of the HTTPS server.
	 *
	 * @param httPSServer the input value
	 * @return this instance
	 */
	public StorageService withHttPSServer(HTTPSServer httPSServer) {
		this.httPSServer = httPSServer;
		return this;
	}

	/**
	 * Get the this object provides information about each physical medium connected to this device.
	 *
	 * @return the value
	 */
	public Collection<PhysicalMedium> getPhysicalMediums() {
		if (this.physicalMediums == null){ this.physicalMediums=new ArrayList<>();}
		return physicalMediums;
	}

	/**
	 * Set the this object provides information about each physical medium connected to this device.
	 *
	 * @param physicalMediums the input value
	 */
	public void  setPhysicalMediums(Collection<PhysicalMedium> physicalMediums) {
		this.physicalMediums = physicalMediums;
	}

	/**
	 * Set the this object provides information about each physical medium connected to this device.
	 *
	 * @param physicalMedium the input value
	 * @return this instance
	 */
	public StorageService withPhysicalMedium(PhysicalMedium physicalMedium) {
		getPhysicalMediums().add(physicalMedium);
		return this;
	}

	/**
	 * Get the this object provides information about each storage array (RAID) configured on this device.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}. Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}.
	 *
	 * @return the value
	 */
	public Collection<StorageArray> getStorageArraies() {
		if (this.storageArraies == null){ this.storageArraies=new ArrayList<>();}
		return storageArraies;
	}

	/**
	 * Set the this object provides information about each storage array (RAID) configured on this device.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}. Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}.
	 *
	 * @param storageArraies the input value
	 */
	public void  setStorageArraies(Collection<StorageArray> storageArraies) {
		this.storageArraies = storageArraies;
	}

	/**
	 * Set the this object provides information about each storage array (RAID) configured on this device.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}. Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|RaidType}}, and {{param|PhysicalMediumReference}}.
	 *
	 * @param storageArray the input value
	 * @return this instance
	 */
	public StorageService withStorageArray(StorageArray storageArray) {
		getStorageArraies().add(storageArray);
		return this;
	}

	/**
	 * Get the this object provides information about each logical volume configured on this device.  A logical volume can reside either on an instance of a single {{object|.PhysicalMedium.{i}.}} or on an instance of a single {{object|.StorageArray.{i}.}} instance, but it can not span multiple instances of either. {{param|PhysicalReference}} is used to define where this {{object}} instance resides.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.  Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.
	 *
	 * @return the value
	 */
	public Collection<LogicalVolume> getLogicalVolumes() {
		if (this.logicalVolumes == null){ this.logicalVolumes=new ArrayList<>();}
		return logicalVolumes;
	}

	/**
	 * Set the this object provides information about each logical volume configured on this device.  A logical volume can reside either on an instance of a single {{object|.PhysicalMedium.{i}.}} or on an instance of a single {{object|.StorageArray.{i}.}} instance, but it can not span multiple instances of either. {{param|PhysicalReference}} is used to define where this {{object}} instance resides.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.  Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.
	 *
	 * @param logicalVolumes the input value
	 */
	public void  setLogicalVolumes(Collection<LogicalVolume> logicalVolumes) {
		this.logicalVolumes = logicalVolumes;
	}

	/**
	 * Set the this object provides information about each logical volume configured on this device.  A logical volume can reside either on an instance of a single {{object|.PhysicalMedium.{i}.}} or on an instance of a single {{object|.StorageArray.{i}.}} instance, but it can not span multiple instances of either. {{param|PhysicalReference}} is used to define where this {{object}} instance resides.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the following parameters configured: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.  Once an instance is enabled the following parameters become immutable for the life of the instance: {{param|Name}}, {{param|PhysicalReference}}, and {{param|Capacity}}.
	 *
	 * @param logicalVolume the input value
	 * @return this instance
	 */
	public StorageService withLogicalVolume(LogicalVolume logicalVolume) {
		getLogicalVolumes().add(logicalVolume);
		return this;
	}

	//</editor-fold>

}