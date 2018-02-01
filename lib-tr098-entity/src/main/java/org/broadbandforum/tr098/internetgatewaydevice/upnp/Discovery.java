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
package org.broadbandforum.tr098.internetgatewaydevice.upnp;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.upnp.discovery.Device;
import org.broadbandforum.tr098.internetgatewaydevice.upnp.discovery.RootDevice;
import org.broadbandforum.tr098.internetgatewaydevice.upnp.discovery.Service;

	/**
	 * UPnP {{bibref|UPnP-DAv1}} SSDP discovered root devices, embedded devices and embedded services.

The CPE MAY, but need not, retain some or all of the information in this object across reboots.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.UPnP.Discovery.")
public class Discovery {

	/**
	 * UPnP root device table. This table contains an entry for each UPnP root device that has been discovered via SSDP.
	 */
	@XmlElementWrapper(name = "RootDevices")
	@XmlElement(name = "RootDevice")
	public Collection<RootDevice> rootDevices;
	/**
	 * UPnP embedded device table. This table contains an entry for each UPnP embedded device that has been discovered via SSDP.
	 */
	@XmlElementWrapper(name = "Devices")
	@XmlElement(name = "Device")
	public Collection<Device> devices;
	/**
	 * UPnP embedded service table. This table contains an entry for each UPnP embedded service that has been discovered via SSDP.
	 */
	@XmlElementWrapper(name = "Services")
	@XmlElement(name = "Service")
	public Collection<Service> services;

	public Discovery() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the upnP root device table. This table contains an entry for each UPnP root device that has been discovered via SSDP.
	 *
	 * @return the value
	 */
	public Collection<RootDevice> getRootDevices() {
		if (this.rootDevices == null){ this.rootDevices=new ArrayList<>();}
		return rootDevices;
	}

	/**
	 * Set the upnP root device table. This table contains an entry for each UPnP root device that has been discovered via SSDP.
	 *
	 * @param rootDevices the input value
	 */
	public void  setRootDevices(Collection<RootDevice> rootDevices) {
		this.rootDevices = rootDevices;
	}

	/**
	 * Set the upnP root device table. This table contains an entry for each UPnP root device that has been discovered via SSDP.
	 *
	 * @param rootDevice the input value
	 * @return this instance
	 */
	public Discovery withRootDevice(RootDevice rootDevice) {
		getRootDevices().add(rootDevice);
		return this;
	}

	/**
	 * Get the upnP embedded device table. This table contains an entry for each UPnP embedded device that has been discovered via SSDP.
	 *
	 * @return the value
	 */
	public Collection<Device> getDevices() {
		if (this.devices == null){ this.devices=new ArrayList<>();}
		return devices;
	}

	/**
	 * Set the upnP embedded device table. This table contains an entry for each UPnP embedded device that has been discovered via SSDP.
	 *
	 * @param devices the input value
	 */
	public void  setDevices(Collection<Device> devices) {
		this.devices = devices;
	}

	/**
	 * Set the upnP embedded device table. This table contains an entry for each UPnP embedded device that has been discovered via SSDP.
	 *
	 * @param device the input value
	 * @return this instance
	 */
	public Discovery withDevice(Device device) {
		getDevices().add(device);
		return this;
	}

	/**
	 * Get the upnP embedded service table. This table contains an entry for each UPnP embedded service that has been discovered via SSDP.
	 *
	 * @return the value
	 */
	public Collection<Service> getServices() {
		if (this.services == null){ this.services=new ArrayList<>();}
		return services;
	}

	/**
	 * Set the upnP embedded service table. This table contains an entry for each UPnP embedded service that has been discovered via SSDP.
	 *
	 * @param services the input value
	 */
	public void  setServices(Collection<Service> services) {
		this.services = services;
	}

	/**
	 * Set the upnP embedded service table. This table contains an entry for each UPnP embedded service that has been discovered via SSDP.
	 *
	 * @param service the input value
	 * @return this instance
	 */
	public Discovery withService(Service service) {
		getServices().add(service);
		return this;
	}

	//</editor-fold>

}