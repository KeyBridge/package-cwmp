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
package org.broadbandforum.tr181.device.managementserver.downloadavailability.announcement;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Multicast groups to which the CPE SHOULD listen for announcements.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.ManagementServer.DownloadAvailability.Announcement.Group.{i}.")
@XmlRootElement(name = "Group")
@XmlType(name = "Device.ManagementServer.DownloadAvailability.Announcement.Group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enable/disable listening to this multicast group.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this group table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * URL {{bibref|RFC3986}} encoding the group address, source and port on which to listen, and other protocol information, e.g. expected announcement format.

          Depending on the application, the messages identified by this URL MAY directly contain the data to be downloaded, or alternatively MAY contain information informing the CPE how to obtain the data to be downloaded via a separate mechanism, which itself could involve a unicast or a multicast download protocol.

          Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SAP {{bibref|RFC2974}} stream that indicates how to use either FLUTE {{bibref|RFC3926}} or DSM-CC {{bibref|ISO-13818-6:1998}} to perform the download.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String url;

	public Group() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 * @return this instance
	 */
	public Group withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enable/disable listening to this multicast group.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable/disable listening to this multicast group.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable/disable listening to this multicast group.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Group withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this group table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this group table entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this group table entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Group withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the url {{bibref|RFC3986}} encoding the group address, source and port on which to listen, and other protocol information, e.g. expected announcement format.

          Depending on the application, the messages identified by this URL MAY directly contain the data to be downloaded, or alternatively MAY contain information informing the CPE how to obtain the data to be downloaded via a separate mechanism, which itself could involve a unicast or a multicast download protocol.

          Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SAP {{bibref|RFC2974}} stream that indicates how to use either FLUTE {{bibref|RFC3926}} or DSM-CC {{bibref|ISO-13818-6:1998}} to perform the download.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the url {{bibref|RFC3986}} encoding the group address, source and port on which to listen, and other protocol information, e.g. expected announcement format.

          Depending on the application, the messages identified by this URL MAY directly contain the data to be downloaded, or alternatively MAY contain information informing the CPE how to obtain the data to be downloaded via a separate mechanism, which itself could involve a unicast or a multicast download protocol.

          Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SAP {{bibref|RFC2974}} stream that indicates how to use either FLUTE {{bibref|RFC3926}} or DSM-CC {{bibref|ISO-13818-6:1998}} to perform the download.
	 *
	 * @since 2.0
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the url {{bibref|RFC3986}} encoding the group address, source and port on which to listen, and other protocol information, e.g. expected announcement format.

          Depending on the application, the messages identified by this URL MAY directly contain the data to be downloaded, or alternatively MAY contain information informing the CPE how to obtain the data to be downloaded via a separate mechanism, which itself could involve a unicast or a multicast download protocol.

          Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SAP {{bibref|RFC2974}} stream that indicates how to use either FLUTE {{bibref|RFC3926}} or DSM-CC {{bibref|ISO-13818-6:1998}} to perform the download.
	 *
	 * @since 2.0
	 * @param url the input value
	 * @return this instance
	 */
	public Group withUrl(String url) {
		this.url = url;
		return this;
	}

	//</editor-fold>

}