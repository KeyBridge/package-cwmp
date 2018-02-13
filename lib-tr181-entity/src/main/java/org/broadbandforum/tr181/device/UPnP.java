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
package org.broadbandforum.tr181.device;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.upnp.Description;
import org.broadbandforum.tr181.device.upnp.Device;
import org.broadbandforum.tr181.device.upnp.Discovery;

	/**
	 * This object contains all UPnP related objects and parameters including Device and Discovery related objects and parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.UPnP.")
@XmlRootElement(name = "Device.UPnP")
@XmlType(name = "Device.UPnP")
@XmlAccessorType(XmlAccessType.FIELD)
public class UPnP {

	/**
	 * This object defines the UPnP devices and UPnP services that are implemented by the CPE.
	 */
	@XmlElement(name = "Device")
	public Device device;
	/**
	 * UPnP {{bibref|UPnP-DAv1}} SSDP discovered root devices, embedded devices and embedded services.

        The CPE MAY, but need not, retain some or all of the information in this object across reboots.
	 */
	@XmlElement(name = "Discovery")
	public Discovery discovery;
	/**
	 * This object contains information from the  Description Document discovered from the UPnP Devices and Services.
	 */
	@XmlElement(name = "Description")
	public Description description;

	public UPnP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object defines the UPnP devices and UPnP services that are implemented by the CPE.
	 *
	 * @return the value
	 */
	public Device getDevice() {
		return device;
	}

	/**
	 * Set the this object defines the UPnP devices and UPnP services that are implemented by the CPE.
	 *
	 * @param device the input value
	 */
	public void  setDevice(Device device) {
		this.device = device;
	}

	/**
	 * Set the this object defines the UPnP devices and UPnP services that are implemented by the CPE.
	 *
	 * @param device the input value
	 * @return this instance
	 */
	public UPnP withDevice(Device device) {
		this.device = device;
		return this;
	}

	/**
	 * Get the upnP {{bibref|UPnP-DAv1}} SSDP discovered root devices, embedded devices and embedded services.

        The CPE MAY, but need not, retain some or all of the information in this object across reboots.
	 *
	 * @return the value
	 */
	public Discovery getDiscovery() {
		return discovery;
	}

	/**
	 * Set the upnP {{bibref|UPnP-DAv1}} SSDP discovered root devices, embedded devices and embedded services.

        The CPE MAY, but need not, retain some or all of the information in this object across reboots.
	 *
	 * @param discovery the input value
	 */
	public void  setDiscovery(Discovery discovery) {
		this.discovery = discovery;
	}

	/**
	 * Set the upnP {{bibref|UPnP-DAv1}} SSDP discovered root devices, embedded devices and embedded services.

        The CPE MAY, but need not, retain some or all of the information in this object across reboots.
	 *
	 * @param discovery the input value
	 * @return this instance
	 */
	public UPnP withDiscovery(Discovery discovery) {
		this.discovery = discovery;
		return this;
	}

	/**
	 * Get the this object contains information from the  Description Document discovered from the UPnP Devices and Services.
	 *
	 * @return the value
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * Set the this object contains information from the  Description Document discovered from the UPnP Devices and Services.
	 *
	 * @param description the input value
	 */
	public void  setDescription(Description description) {
		this.description = description;
	}

	/**
	 * Set the this object contains information from the  Description Document discovered from the UPnP Devices and Services.
	 *
	 * @param description the input value
	 * @return this instance
	 */
	public UPnP withDescription(Description description) {
		this.description = description;
		return this;
	}

	//</editor-fold>

}