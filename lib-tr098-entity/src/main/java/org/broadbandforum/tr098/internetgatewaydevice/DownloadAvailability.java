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
package org.broadbandforum.tr098.internetgatewaydevice;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.downloadavailability.Announcement;
import org.broadbandforum.tr098.internetgatewaydevice.downloadavailability.Query;

	/**
	 * This object contains multicast announcement and query parameters used for the purpose of downloading files.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.DownloadAvailability.")
public class DownloadAvailability {

	/**
	 * This object contains multicast announcement parameters used to download files.
	 */
	@XmlElement(name = "Announcement")
	public Announcement announcement;
	/**
	 * This object contains multicast query parameters used to download files.
	 */
	@XmlElement(name = "Query")
	public Query query;

	public DownloadAvailability() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains multicast announcement parameters used to download files.
	 *
	 * @return the value
	 */
	public Announcement getAnnouncement() {
		return announcement;
	}

	/**
	 * Set the this object contains multicast announcement parameters used to download files.
	 *
	 * @param announcement the input value
	 */
	public void  setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}

	/**
	 * Set the this object contains multicast announcement parameters used to download files.
	 *
	 * @param announcement the input value
	 * @return this instance
	 */
	public DownloadAvailability withAnnouncement(Announcement announcement) {
		this.announcement = announcement;
		return this;
	}

	/**
	 * Get the this object contains multicast query parameters used to download files.
	 *
	 * @return the value
	 */
	public Query getQuery() {
		return query;
	}

	/**
	 * Set the this object contains multicast query parameters used to download files.
	 *
	 * @param query the input value
	 */
	public void  setQuery(Query query) {
		this.query = query;
	}

	/**
	 * Set the this object contains multicast query parameters used to download files.
	 *
	 * @param query the input value
	 * @return this instance
	 */
	public DownloadAvailability withQuery(Query query) {
		this.query = query;
		return this;
	}

	//</editor-fold>

}