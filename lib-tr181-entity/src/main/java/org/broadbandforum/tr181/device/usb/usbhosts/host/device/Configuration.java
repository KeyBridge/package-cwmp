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
package org.broadbandforum.tr181.device.usb.usbhosts.host.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.usb.usbhosts.host.device.configuration.Interface;

	/**
	 * Table of device configurations.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.USB.USBHosts.Host.{i}.Device.{i}.Configuration.{i}.")
@XmlRootElement(name = "Device.USB.USBHosts.Host.Device.Configuration")
@XmlType(name = "Device.USB.USBHosts.Host.Device.Configuration")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration {

	/**
	 * The identifier for each Device Configuration.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConfigurationNumber")
	public Long configurationNumber;
	/**
	 * Table of device interface descriptors.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;

	public Configuration() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the identifier for each Device Configuration.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getConfigurationNumber() {
		return configurationNumber;
	}

	/**
	 * Set the identifier for each Device Configuration.
	 *
	 * @since 2.0
	 * @param configurationNumber the input value
	 */
	public void  setConfigurationNumber(Long configurationNumber) {
		this.configurationNumber = configurationNumber;
	}

	/**
	 * Set the identifier for each Device Configuration.
	 *
	 * @since 2.0
	 * @param configurationNumber the input value
	 * @return this instance
	 */
	public Configuration withConfigurationNumber(Long configurationNumber) {
		this.configurationNumber = configurationNumber;
		return this;
	}

	/**
	 * Get the table of device interface descriptors.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the table of device interface descriptors.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the table of device interface descriptors.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public Configuration withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	//</editor-fold>

}