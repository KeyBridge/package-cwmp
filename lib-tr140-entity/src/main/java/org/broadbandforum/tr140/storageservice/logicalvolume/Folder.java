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
package org.broadbandforum.tr140.storageservice.logicalvolume;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr140.datatypes.Alias;
import org.broadbandforum.tr140.storageservice.logicalvolume.folder.GroupAccess;
import org.broadbandforum.tr140.storageservice.logicalvolume.folder.Quota;
import org.broadbandforum.tr140.storageservice.logicalvolume.folder.UserAccess;

	/**
	 * This object provides information about each top-level folder configured on this logical volume.  Each top-level folder allows the configuration of quotas and access permissions.

Creating an instance of this object generates a disabled {{object}} instance.  Before this new {{object}} instance can be enabled (via a SetParameterValues command), it MUST have the {{param|Name}} configured.  Folder instances are unique per {{object|.LogicalVolume.{i}.}} and the unique key for this object is {{param|Name}} which also means that once an instance is enabled {{param|Name}} becomes immutable for the life of the instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "StorageService.{i}.LogicalVolume.{i}.Folder.{i}.")
public class Folder {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Setting of this variable will add a new folder.  The full hierarchical pathname of the folder MUST be specified.

All folders created on the Logical Volume will appear here, created locally or via AddObject.

The local directory name will be formatted as a UNIX-style directory name, for example: /home/ftp

The presence of a trailing `/' character is inconsequential, meaning that /home/ftp/ is the same as /home/ftp.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.  This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances within a {{object|.LogicalVolume.{i}.}} to use the same {{param}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * Entry is enabled or disabled
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * What are the User authentication requirements of this folder?  The following bitmap is used.

:11 = Authenticated Access required for Network protocols (NFS/AFP/SMB) and for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:10 = Authenticated Access required for Network protocols (NFS/AFP/SMB)

:01 = Authenticated Access Required for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:00 = No Authentication required
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UserAccountAccess")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Long userAccountAccess = 2L;
	/**
	 * This object provides information about each user account configured for access permissions on this folder.
	 */
	@XmlElementWrapper(name = "userAccesss")
	@XmlElement(name = "UserAccess")
	@CWMPParameter(access = "readWrite")
	public Collection<UserAccess> userAccesss;
	/**
	 * This object provides information about each user group configured for access permissions on this folder.
	 */
	@XmlElementWrapper(name = "groupAccesss")
	@XmlElement(name = "GroupAccess")
	@CWMPParameter(access = "readWrite")
	public Collection<GroupAccess> groupAccesss;
	/**
	 * This object allows the configuration of per-folder storage quota management.
	 */
	@XmlElement(name = "Quota")
	public Quota quota;

	public Folder() {
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
	public Folder withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the setting of this variable will add a new folder.  The full hierarchical pathname of the folder MUST be specified.

All folders created on the Logical Volume will appear here, created locally or via AddObject.

The local directory name will be formatted as a UNIX-style directory name, for example: /home/ftp

The presence of a trailing `/' character is inconsequential, meaning that /home/ftp/ is the same as /home/ftp.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.  This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances within a {{object|.LogicalVolume.{i}.}} to use the same {{param}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the setting of this variable will add a new folder.  The full hierarchical pathname of the folder MUST be specified.

All folders created on the Logical Volume will appear here, created locally or via AddObject.

The local directory name will be formatted as a UNIX-style directory name, for example: /home/ftp

The presence of a trailing `/' character is inconsequential, meaning that /home/ftp/ is the same as /home/ftp.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.  This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances within a {{object|.LogicalVolume.{i}.}} to use the same {{param}}.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the setting of this variable will add a new folder.  The full hierarchical pathname of the folder MUST be specified.

All folders created on the Logical Volume will appear here, created locally or via AddObject.

The local directory name will be formatted as a UNIX-style directory name, for example: /home/ftp

The presence of a trailing `/' character is inconsequential, meaning that /home/ftp/ is the same as /home/ftp.

Once this instance becomes enabled, this parameter will be immutable for the life of the instance.  This parameter acts as the unique identifier for the instance, thus the device MUST NOT allow multiple {{object}} instances within a {{object|.LogicalVolume.{i}.}} to use the same {{param}}.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public Folder withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the entry is enabled or disabled
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the entry is enabled or disabled
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the entry is enabled or disabled
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Folder withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the what are the User authentication requirements of this folder?  The following bitmap is used.

:11 = Authenticated Access required for Network protocols (NFS/AFP/SMB) and for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:10 = Authenticated Access required for Network protocols (NFS/AFP/SMB)

:01 = Authenticated Access Required for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:00 = No Authentication required
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUserAccountAccess() {
		return userAccountAccess;
	}

	/**
	 * Set the what are the User authentication requirements of this folder?  The following bitmap is used.

:11 = Authenticated Access required for Network protocols (NFS/AFP/SMB) and for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:10 = Authenticated Access required for Network protocols (NFS/AFP/SMB)

:01 = Authenticated Access Required for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:00 = No Authentication required
	 *
	 * @since 1.0
	 * @param userAccountAccess the input value
	 */
	public void  setUserAccountAccess(Long userAccountAccess) {
		this.userAccountAccess = userAccountAccess;
	}

	/**
	 * Set the what are the User authentication requirements of this folder?  The following bitmap is used.

:11 = Authenticated Access required for Network protocols (NFS/AFP/SMB) and for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:10 = Authenticated Access required for Network protocols (NFS/AFP/SMB)

:01 = Authenticated Access Required for non Network protocols (FTP/SFTP/HTTP/HTTPS)

:00 = No Authentication required
	 *
	 * @since 1.0
	 * @param userAccountAccess the input value
	 * @return this instance
	 */
	public Folder withUserAccountAccess(Long userAccountAccess) {
		this.userAccountAccess = userAccountAccess;
		return this;
	}

	/**
	 * Get the this object provides information about each user account configured for access permissions on this folder.
	 *
	 * @return the value
	 */
	public Collection<UserAccess> getUserAccesss() {
		if (this.userAccesss == null){ this.userAccesss=new ArrayList<>();}
		return userAccesss;
	}

	/**
	 * Set the this object provides information about each user account configured for access permissions on this folder.
	 *
	 * @param userAccesss the input value
	 */
	public void  setUserAccesss(Collection<UserAccess> userAccesss) {
		this.userAccesss = userAccesss;
	}

	/**
	 * Set the this object provides information about each user account configured for access permissions on this folder.
	 *
	 * @param userAccess the input value
	 * @return this instance
	 */
	public Folder withUserAccess(UserAccess userAccess) {
		getUserAccesss().add(userAccess);
		return this;
	}

	/**
	 * Get the this object provides information about each user group configured for access permissions on this folder.
	 *
	 * @return the value
	 */
	public Collection<GroupAccess> getGroupAccesss() {
		if (this.groupAccesss == null){ this.groupAccesss=new ArrayList<>();}
		return groupAccesss;
	}

	/**
	 * Set the this object provides information about each user group configured for access permissions on this folder.
	 *
	 * @param groupAccesss the input value
	 */
	public void  setGroupAccesss(Collection<GroupAccess> groupAccesss) {
		this.groupAccesss = groupAccesss;
	}

	/**
	 * Set the this object provides information about each user group configured for access permissions on this folder.
	 *
	 * @param groupAccess the input value
	 * @return this instance
	 */
	public Folder withGroupAccess(GroupAccess groupAccess) {
		getGroupAccesss().add(groupAccess);
		return this;
	}

	/**
	 * Get the this object allows the configuration of per-folder storage quota management.
	 *
	 * @return the value
	 */
	public Quota getQuota() {
		return quota;
	}

	/**
	 * Set the this object allows the configuration of per-folder storage quota management.
	 *
	 * @param quota the input value
	 */
	public void  setQuota(Quota quota) {
		this.quota = quota;
	}

	/**
	 * Set the this object allows the configuration of per-folder storage quota management.
	 *
	 * @param quota the input value
	 * @return this instance
	 */
	public Folder withQuota(Quota quota) {
		this.quota = quota;
		return this;
	}

	//</editor-fold>

}