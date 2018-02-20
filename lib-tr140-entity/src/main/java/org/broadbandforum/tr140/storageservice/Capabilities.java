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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The overall capabilities of a Storage Service device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.

Note that when TR-140 was originally published there was a typo in this object name, which has been corrected.
	 *
	 * @since TR140 v1.0
	 */
@CWMPObject(name = "StorageService.{i}.Capabilities.")
@XmlRootElement(name = "StorageService.Capabilities")
@XmlType(name = "StorageService.Capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

	/**
	 * Does this device contain an FTP server allowing clients to access the data via an FTP client?
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FTPCapable")
	public Boolean ftpCapable;
	/**
	 * Does this device contain an SSH FTP server allowing clients to access the data via an SFTP client?
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SFTPCapable")
	public Boolean sftPCapable;
	/**
	 * Does this device contain an HTTP server allowing clients to access the data via an HTTP client?
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HTTPCapable")
	public Boolean httPCapable;
	/**
	 * Does this device contain an HTTPS server allowing clients to access the data via an HTTPS client?
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HTTPSCapable")
	public Boolean httPSCapable;
	/**
	 * Does this device contain an HTTP server that supports creating files via an HTTP PUT/POST mechanism that would allow an HTTP client to upload files via HTTP?  This is also sometimes referred to as "WebDAV" support.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HTTPWritable")
	public Boolean httPWritable;
	/**
	 * {{list}} Supported application-level network protocols. 

Enumerated value must be one of [SMB, NFS, AFP]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyProt.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SupportedNetworkProtocols")
	@XmlList
	public Collection<String> supportedNetworkProtocols;
	/**
	 * {{list}} Supported FileSystems Types.  

Enumerated value must be one of [FAT16, FAT32, NTFS, HFS, HFS+, HSFJ, ext2, ext3, XFS, REISER]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyType.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SupportedFileSystemTypes")
	@XmlList
	public Collection<String> supportedFileSystemTypes;
	/**
	 * {{list}} Supported RAID types. 

Enumerated value must be one of [RAID0, RAID1, RAID2, RAID3, RAID4, RAID5, RAID6, RAID10, RAID0+1, RAID30, RAID50, RAID60]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example:"X_EXAMPLE-COM_MyRaid.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SupportedRaidTypes")
	@XmlList
	public Collection<String> supportedRaidTypes;
	/**
	 * Does this device have the ability to encrypt and decrypt Logical Volumes as they are stored and retrieved?
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VolumeEncryptionCapable")
	public Boolean volumeEncryptionCapable;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the does this device contain an FTP server allowing clients to access the data via an FTP client?
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isFtpCapable() {
		return ftpCapable;
	}

	/**
	 * Set the does this device contain an FTP server allowing clients to access the data via an FTP client?
	 *
	 * @since 1.0
	 * @param ftpCapable the input value
	 */
	public void  setFtpCapable(Boolean ftpCapable) {
		this.ftpCapable = ftpCapable;
	}

	/**
	 * Set the does this device contain an FTP server allowing clients to access the data via an FTP client?
	 *
	 * @since 1.0
	 * @param ftpCapable the input value
	 * @return this instance
	 */
	public Capabilities withFtpCapable(Boolean ftpCapable) {
		this.ftpCapable = ftpCapable;
		return this;
	}

	/**
	 * Get the does this device contain an SSH FTP server allowing clients to access the data via an SFTP client?
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isSftPCapable() {
		return sftPCapable;
	}

	/**
	 * Set the does this device contain an SSH FTP server allowing clients to access the data via an SFTP client?
	 *
	 * @since 1.0
	 * @param sftPCapable the input value
	 */
	public void  setSftPCapable(Boolean sftPCapable) {
		this.sftPCapable = sftPCapable;
	}

	/**
	 * Set the does this device contain an SSH FTP server allowing clients to access the data via an SFTP client?
	 *
	 * @since 1.0
	 * @param sftPCapable the input value
	 * @return this instance
	 */
	public Capabilities withSftPCapable(Boolean sftPCapable) {
		this.sftPCapable = sftPCapable;
		return this;
	}

	/**
	 * Get the does this device contain an HTTP server allowing clients to access the data via an HTTP client?
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isHttPCapable() {
		return httPCapable;
	}

	/**
	 * Set the does this device contain an HTTP server allowing clients to access the data via an HTTP client?
	 *
	 * @since 1.0
	 * @param httPCapable the input value
	 */
	public void  setHttPCapable(Boolean httPCapable) {
		this.httPCapable = httPCapable;
	}

	/**
	 * Set the does this device contain an HTTP server allowing clients to access the data via an HTTP client?
	 *
	 * @since 1.0
	 * @param httPCapable the input value
	 * @return this instance
	 */
	public Capabilities withHttPCapable(Boolean httPCapable) {
		this.httPCapable = httPCapable;
		return this;
	}

	/**
	 * Get the does this device contain an HTTPS server allowing clients to access the data via an HTTPS client?
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isHttPSCapable() {
		return httPSCapable;
	}

	/**
	 * Set the does this device contain an HTTPS server allowing clients to access the data via an HTTPS client?
	 *
	 * @since 1.0
	 * @param httPSCapable the input value
	 */
	public void  setHttPSCapable(Boolean httPSCapable) {
		this.httPSCapable = httPSCapable;
	}

	/**
	 * Set the does this device contain an HTTPS server allowing clients to access the data via an HTTPS client?
	 *
	 * @since 1.0
	 * @param httPSCapable the input value
	 * @return this instance
	 */
	public Capabilities withHttPSCapable(Boolean httPSCapable) {
		this.httPSCapable = httPSCapable;
		return this;
	}

	/**
	 * Get the does this device contain an HTTP server that supports creating files via an HTTP PUT/POST mechanism that would allow an HTTP client to upload files via HTTP?  This is also sometimes referred to as "WebDAV" support.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isHttPWritable() {
		return httPWritable;
	}

	/**
	 * Set the does this device contain an HTTP server that supports creating files via an HTTP PUT/POST mechanism that would allow an HTTP client to upload files via HTTP?  This is also sometimes referred to as "WebDAV" support.
	 *
	 * @since 1.0
	 * @param httPWritable the input value
	 */
	public void  setHttPWritable(Boolean httPWritable) {
		this.httPWritable = httPWritable;
	}

	/**
	 * Set the does this device contain an HTTP server that supports creating files via an HTTP PUT/POST mechanism that would allow an HTTP client to upload files via HTTP?  This is also sometimes referred to as "WebDAV" support.
	 *
	 * @since 1.0
	 * @param httPWritable the input value
	 * @return this instance
	 */
	public Capabilities withHttPWritable(Boolean httPWritable) {
		this.httPWritable = httPWritable;
		return this;
	}

	/**
	 * Get the {{list}} Supported application-level network protocols. 

Enumerated value must be one of [SMB, NFS, AFP]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyProt.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getSupportedNetworkProtocols() {
		if (this.supportedNetworkProtocols == null){ this.supportedNetworkProtocols=new ArrayList<>();}
		return supportedNetworkProtocols;
	}

	/**
	 * Set the {{list}} Supported application-level network protocols. 

Enumerated value must be one of [SMB, NFS, AFP]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyProt.
	 *
	 * @since 1.0
	 * @param supportedNetworkProtocols the input value
	 */
	public void  setSupportedNetworkProtocols(Collection<String> supportedNetworkProtocols) {
		this.supportedNetworkProtocols = supportedNetworkProtocols;
	}

	/**
	 * Set the {{list}} Supported application-level network protocols. 

Enumerated value must be one of [SMB, NFS, AFP]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyProt.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withSupportedNetworkProtocols(String string) {
		getSupportedNetworkProtocols().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Supported FileSystems Types.  

Enumerated value must be one of [FAT16, FAT32, NTFS, HFS, HFS+, HSFJ, ext2, ext3, XFS, REISER]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyType.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getSupportedFileSystemTypes() {
		if (this.supportedFileSystemTypes == null){ this.supportedFileSystemTypes=new ArrayList<>();}
		return supportedFileSystemTypes;
	}

	/**
	 * Set the {{list}} Supported FileSystems Types.  

Enumerated value must be one of [FAT16, FAT32, NTFS, HFS, HFS+, HSFJ, ext2, ext3, XFS, REISER]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyType.
	 *
	 * @since 1.0
	 * @param supportedFileSystemTypes the input value
	 */
	public void  setSupportedFileSystemTypes(Collection<String> supportedFileSystemTypes) {
		this.supportedFileSystemTypes = supportedFileSystemTypes;
	}

	/**
	 * Set the {{list}} Supported FileSystems Types.  

Enumerated value must be one of [FAT16, FAT32, NTFS, HFS, HFS+, HSFJ, ext2, ext3, XFS, REISER]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example: "X_EXAMPLE-COM_MyType.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withSupportedFileSystemTypes(String string) {
		getSupportedFileSystemTypes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Supported RAID types. 

Enumerated value must be one of [RAID0, RAID1, RAID2, RAID3, RAID4, RAID5, RAID6, RAID10, RAID0+1, RAID30, RAID50, RAID60]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example:"X_EXAMPLE-COM_MyRaid.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getSupportedRaidTypes() {
		if (this.supportedRaidTypes == null){ this.supportedRaidTypes=new ArrayList<>();}
		return supportedRaidTypes;
	}

	/**
	 * Set the {{list}} Supported RAID types. 

Enumerated value must be one of [RAID0, RAID1, RAID2, RAID3, RAID4, RAID5, RAID6, RAID10, RAID0+1, RAID30, RAID50, RAID60]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example:"X_EXAMPLE-COM_MyRaid.
	 *
	 * @since 1.0
	 * @param supportedRaidTypes the input value
	 */
	public void  setSupportedRaidTypes(Collection<String> supportedRaidTypes) {
		this.supportedRaidTypes = supportedRaidTypes;
	}

	/**
	 * Set the {{list}} Supported RAID types. 

Enumerated value must be one of [RAID0, RAID1, RAID2, RAID3, RAID4, RAID5, RAID6, RAID10, RAID0+1, RAID30, RAID50, RAID60]

The list MAY include vendor-specific protocols, which MUST be in the format defined in {{bibref|TR-106}}.  For example:"X_EXAMPLE-COM_MyRaid.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withSupportedRaidTypes(String string) {
		getSupportedRaidTypes().add(string);
		return this;
	}

	/**
	 * Get the does this device have the ability to encrypt and decrypt Logical Volumes as they are stored and retrieved?
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isVolumeEncryptionCapable() {
		return volumeEncryptionCapable;
	}

	/**
	 * Set the does this device have the ability to encrypt and decrypt Logical Volumes as they are stored and retrieved?
	 *
	 * @since 1.0
	 * @param volumeEncryptionCapable the input value
	 */
	public void  setVolumeEncryptionCapable(Boolean volumeEncryptionCapable) {
		this.volumeEncryptionCapable = volumeEncryptionCapable;
	}

	/**
	 * Set the does this device have the ability to encrypt and decrypt Logical Volumes as they are stored and retrieved?
	 *
	 * @since 1.0
	 * @param volumeEncryptionCapable the input value
	 * @return this instance
	 */
	public Capabilities withVolumeEncryptionCapable(Boolean volumeEncryptionCapable) {
		this.volumeEncryptionCapable = volumeEncryptionCapable;
		return this;
	}

	//</editor-fold>

}