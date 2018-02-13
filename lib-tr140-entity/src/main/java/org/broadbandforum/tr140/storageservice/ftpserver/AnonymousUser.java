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
package org.broadbandforum.tr140.storageservice.ftpserver;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object allows the configuration of anonymous FTP access.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.FTPServer.AnonymousUser.")
@XmlRootElement(name = "AnonymousUser")
@XmlType(name = "StorageService.FTPServer.AnonymousUser")
@XmlAccessorType(XmlAccessType.FIELD)
public class AnonymousUser {

	/**
	 * Enables or disables support for anonymous access into the FTP server
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Represents the home directory for anonymous FTP access.  The {{object|.LogicalVolume.{i}.Folder.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "StartingFolder")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String startingFolder;
	/**
	 * If this is set to {{true}}, then the anonymous user is limited to only retrieval of files from the Storage Service (no deletions, copies, creations or uploads).  If this is set to {{false}}, then the anonymous user has full permissions within the folder specified in {{param|StartingFolder}}.  This SHOULD default to True.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReadOnlyAccess")
	@CWMPParameter(access = "readWrite")
	public Boolean readOnlyAccess;

	public AnonymousUser() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables support for anonymous access into the FTP server
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables support for anonymous access into the FTP server
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables support for anonymous access into the FTP server
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public AnonymousUser withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the represents the home directory for anonymous FTP access.  The {{object|.LogicalVolume.{i}.Folder.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStartingFolder() {
		return startingFolder;
	}

	/**
	 * Set the represents the home directory for anonymous FTP access.  The {{object|.LogicalVolume.{i}.Folder.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @param startingFolder the input value
	 */
	public void  setStartingFolder(String startingFolder) {
		this.startingFolder = startingFolder;
	}

	/**
	 * Set the represents the home directory for anonymous FTP access.  The {{object|.LogicalVolume.{i}.Folder.{i}.}} referenced by this parameter MUST exist within the same StorageService instance.
	 *
	 * @since 1.0
	 * @param startingFolder the input value
	 * @return this instance
	 */
	public AnonymousUser withStartingFolder(String startingFolder) {
		this.startingFolder = startingFolder;
		return this;
	}

	/**
	 * Get the if this is set to {{true}}, then the anonymous user is limited to only retrieval of files from the Storage Service (no deletions, copies, creations or uploads).  If this is set to {{false}}, then the anonymous user has full permissions within the folder specified in {{param|StartingFolder}}.  This SHOULD default to True.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isReadOnlyAccess() {
		return readOnlyAccess;
	}

	/**
	 * Set the if this is set to {{true}}, then the anonymous user is limited to only retrieval of files from the Storage Service (no deletions, copies, creations or uploads).  If this is set to {{false}}, then the anonymous user has full permissions within the folder specified in {{param|StartingFolder}}.  This SHOULD default to True.
	 *
	 * @since 1.0
	 * @param readOnlyAccess the input value
	 */
	public void  setReadOnlyAccess(Boolean readOnlyAccess) {
		this.readOnlyAccess = readOnlyAccess;
	}

	/**
	 * Set the if this is set to {{true}}, then the anonymous user is limited to only retrieval of files from the Storage Service (no deletions, copies, creations or uploads).  If this is set to {{false}}, then the anonymous user has full permissions within the folder specified in {{param|StartingFolder}}.  This SHOULD default to True.
	 *
	 * @since 1.0
	 * @param readOnlyAccess the input value
	 * @return this instance
	 */
	public AnonymousUser withReadOnlyAccess(Boolean readOnlyAccess) {
		this.readOnlyAccess = readOnlyAccess;
		return this;
	}

	//</editor-fold>

}