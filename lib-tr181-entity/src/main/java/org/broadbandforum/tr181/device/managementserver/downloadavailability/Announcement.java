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
package org.broadbandforum.tr181.device.managementserver.downloadavailability;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.managementserver.downloadavailability.announcement.Group;

	/**
	 * This object contains multicast announcement parameters used to download files.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.ManagementServer.DownloadAvailability.Announcement.")
public class Announcement {

	/**
	 * Enable/disable CPE ability to receive and use multicast announcements from a server for the purpose of downloading files.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of the announcement service.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Multicast groups to which the CPE SHOULD listen for announcements.
	 */
	@XmlElementWrapper(name = "groups")
	@XmlElement(name = "Group")
	@CWMPParameter(access = "readWrite")
	public Collection<Group> groups;

	public Announcement() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable/disable CPE ability to receive and use multicast announcements from a server for the purpose of downloading files.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable/disable CPE ability to receive and use multicast announcements from a server for the purpose of downloading files.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable/disable CPE ability to receive and use multicast announcements from a server for the purpose of downloading files.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Announcement withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the announcement service.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the announcement service.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the announcement service.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Announcement withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the multicast groups to which the CPE SHOULD listen for announcements.
	 *
	 * @return the value
	 */
	public Collection<Group> getGroups() {
		if (this.groups == null){ this.groups=new ArrayList<>();}
		return groups;
	}

	/**
	 * Set the multicast groups to which the CPE SHOULD listen for announcements.
	 *
	 * @param groups the input value
	 */
	public void  setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	/**
	 * Set the multicast groups to which the CPE SHOULD listen for announcements.
	 *
	 * @param group the input value
	 * @return this instance
	 */
	public Announcement withGroup(Group group) {
		getGroups().add(group);
		return this;
	}

	//</editor-fold>

}