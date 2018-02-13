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
package org.broadbandforum.tr069.internetgatewaydevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains general configuration parameters.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.DeviceConfig.")
@XmlRootElement(name = "DeviceConfig")
@XmlType(name = "InternetGatewayDevice.DeviceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceConfig {

	/**
	 * Arbitrary user data that must persist across CPE reboots.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PersistentData")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String persistentData;
	/**
	 * A dump of the currently running configuration on the CPE.  This parameter enables the ability to backup and restore the last known good state of the CPE.  It returns a vendor-specific document that defines the state of the CPE.  The document must be capable of restoring the CPE's state when written back to the CPE using SetParameterValues.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConfigFile")
	@CWMPParameter(access = "readWrite")
	@Size(max = -32768)
	public String configFile;

	public DeviceConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get arbitrary user data that must persist across CPE reboots.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPersistentData() {
		return persistentData;
	}

	/**
	 * Set arbitrary user data that must persist across CPE reboots.
	 *
	 * @since 1.0
	 * @param persistentData the input value
	 */
	public void  setPersistentData(String persistentData) {
		this.persistentData = persistentData;
	}

	/**
	 * Set arbitrary user data that must persist across CPE reboots.
	 *
	 * @since 1.0
	 * @param persistentData the input value
	 * @return this instance
	 */
	public DeviceConfig withPersistentData(String persistentData) {
		this.persistentData = persistentData;
		return this;
	}

	/**
	 * Get a dump of the currently running configuration on the CPE.  This parameter enables the ability to backup and restore the last known good state of the CPE.  It returns a vendor-specific document that defines the state of the CPE.  The document must be capable of restoring the CPE's state when written back to the CPE using SetParameterValues.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConfigFile() {
		return configFile;
	}

	/**
	 * Set a dump of the currently running configuration on the CPE.  This parameter enables the ability to backup and restore the last known good state of the CPE.  It returns a vendor-specific document that defines the state of the CPE.  The document must be capable of restoring the CPE's state when written back to the CPE using SetParameterValues.
	 *
	 * @since 1.0
	 * @param configFile the input value
	 */
	public void  setConfigFile(String configFile) {
		this.configFile = configFile;
	}

	/**
	 * Set a dump of the currently running configuration on the CPE.  This parameter enables the ability to backup and restore the last known good state of the CPE.  It returns a vendor-specific document that defines the state of the CPE.  The document must be capable of restoring the CPE's state when written back to the CPE using SetParameterValues.
	 *
	 * @since 1.0
	 * @param configFile the input value
	 * @return this instance
	 */
	public DeviceConfig withConfigFile(String configFile) {
		this.configFile = configFile;
		return this;
	}

	//</editor-fold>

}