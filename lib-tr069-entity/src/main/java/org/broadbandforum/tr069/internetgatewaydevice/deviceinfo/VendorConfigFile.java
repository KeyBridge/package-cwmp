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
package org.broadbandforum.tr069.internetgatewaydevice.deviceinfo;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Every instance of this object is a Vendor Configuration File, and contains parameters associated with the Vendor Configuration File.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.DeviceInfo.VendorConfigFile.{i}.")
@XmlRootElement(name = "InternetGatewayDevice.DeviceInfo.VendorConfigFile")
@XmlType(name = "InternetGatewayDevice.DeviceInfo.VendorConfigFile")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorConfigFile {

	/**
	 * Name of the vendor configuration file.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * A string identifying the configuration file version currently used in the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Version")
	@Size(max = 16)
	public String version;
	/**
	 * Date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Date")
	public LocalDateTime date;
	/**
	 * A description of the vendor configuration file (human-readable string).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Description")
	@Size(max = 256)
	public String description;

	public VendorConfigFile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the name of the vendor configuration file.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the vendor configuration file.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the vendor configuration file.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public VendorConfigFile withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get a string identifying the configuration file version currently used in the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set a string identifying the configuration file version currently used in the CPE.
	 *
	 * @since 1.0
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set a string identifying the configuration file version currently used in the CPE.
	 *
	 * @since 1.0
	 * @param version the input value
	 * @return this instance
	 */
	public VendorConfigFile withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * Set the date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 1.0
	 * @param date the input value
	 */
	public void  setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * Set the date and time when the content of the current version of this vendor configuration file was first applied by the CPE.
	 *
	 * @since 1.0
	 * @param date the input value
	 * @return this instance
	 */
	public VendorConfigFile withDate(LocalDateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Get a description of the vendor configuration file (human-readable string).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set a description of the vendor configuration file (human-readable string).
	 *
	 * @since 1.0
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set a description of the vendor configuration file (human-readable string).
	 *
	 * @since 1.0
	 * @param description the input value
	 * @return this instance
	 */
	public VendorConfigFile withDescription(String description) {
		this.description = description;
		return this;
	}

	//</editor-fold>

}