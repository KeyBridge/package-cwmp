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
package org.broadbandforum.tr181.device.dynamicdns.client;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * Each table entry represents a fully qualified domain name updated by this Dynamic DNS Client.
	 *
	 * @since TR181 v2.10
	 */
@CWMPObject(name = "Device.DynamicDNS.Client.{i}.Hostname.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Name"})})
@XmlRootElement(name = "Device.DynamicDNS.Client.Hostname")
@XmlType(name = "Device.DynamicDNS.Client.Hostname")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hostname {

	/**
	 * Enables or disables this Hostname.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Status of this Hostname.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Fully qualified domain name that has to be updated with the IP address.

          If the name is set to another value, the Client MUST immediately send an update request to the Server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String name;
	/**
	 * The date time of the last successful update of this name to the Dynamic DNS Server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "LastUpdate")
	public LocalDateTime lastUpdate;

	public Hostname() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Hostname.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Hostname.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Hostname.
	 *
	 * @since 2.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Hostname withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this Hostname.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Hostname.
	 *
	 * @since 2.10
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Hostname.
	 *
	 * @since 2.10
	 * @param status the input value
	 * @return this instance
	 */
	public Hostname withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the fully qualified domain name that has to be updated with the IP address.

          If the name is set to another value, the Client MUST immediately send an update request to the Server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the fully qualified domain name that has to be updated with the IP address.

          If the name is set to another value, the Client MUST immediately send an update request to the Server.
	 *
	 * @since 2.10
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the fully qualified domain name that has to be updated with the IP address.

          If the name is set to another value, the Client MUST immediately send an update request to the Server.
	 *
	 * @since 2.10
	 * @param name the input value
	 * @return this instance
	 */
	public Hostname withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the date time of the last successful update of this name to the Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Set the date time of the last successful update of this name to the Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @param lastUpdate the input value
	 */
	public void  setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Set the date time of the last successful update of this name to the Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @param lastUpdate the input value
	 * @return this instance
	 */
	public Hostname withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	//</editor-fold>

}