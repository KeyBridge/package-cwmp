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
package org.broadbandforum.tr098.internetgatewaydevice.downloadavailability;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains multicast query parameters used to download files.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.DownloadAvailability.Query.")
public class Query {

	/**
	 * Enable/disable CPE ability to autonomously query a server for the purpose of downloading files.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of the query service.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * URL {{bibref|RFC3986}} of the query response server.

Depending on the application, the protocol described by this URL MAY be a SOAP interface, or MAY be any other RPC mechanism.

Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SOAP interface running over HTTP or HTTPS.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "URL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String url;

	public Query() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable/disable CPE ability to autonomously query a server for the purpose of downloading files.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable/disable CPE ability to autonomously query a server for the purpose of downloading files.
	 *
	 * @since 1.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable/disable CPE ability to autonomously query a server for the purpose of downloading files.
	 *
	 * @since 1.5
	 * @param enable the input value
	 * @return this instance
	 */
	public Query withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the query service.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the query service.
	 *
	 * @since 1.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the query service.
	 *
	 * @since 1.5
	 * @param status the input value
	 * @return this instance
	 */
	public Query withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the url {{bibref|RFC3986}} of the query response server.

Depending on the application, the protocol described by this URL MAY be a SOAP interface, or MAY be any other RPC mechanism.

Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SOAP interface running over HTTP or HTTPS.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the url {{bibref|RFC3986}} of the query response server.

Depending on the application, the protocol described by this URL MAY be a SOAP interface, or MAY be any other RPC mechanism.

Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SOAP interface running over HTTP or HTTPS.
	 *
	 * @since 1.5
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the url {{bibref|RFC3986}} of the query response server.

Depending on the application, the protocol described by this URL MAY be a SOAP interface, or MAY be any other RPC mechanism.

Refer to {{bibref|DVB-TS.102.824}} for an example of a URL format that identifies a SOAP interface running over HTTP or HTTPS.
	 *
	 * @since 1.5
	 * @param url the input value
	 * @return this instance
	 */
	public Query withUrl(String url) {
		this.url = url;
		return this;
	}

	//</editor-fold>

}