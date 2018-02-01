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
import org.broadbandforum.tr098.internetgatewaydevice.upnp.description.DeviceDescription;
import org.broadbandforum.tr098.internetgatewaydevice.upnp.description.DeviceInstance;
import org.broadbandforum.tr098.internetgatewaydevice.upnp.description.ServiceInstance;

	/**
	 * This object contains information from the  Description Document discovered from the UPnP Devices and Services.
	 *
	 * @since 1.12
	 */
@CWMPObject(name = "InternetGatewayDevice.UPnP.Description.")
public class Description {

	/**
	 * This table contains information read from the Device Description Document of discovered root devices.

The CPE MAY, but need not, retain some or all of the information in this table after the associated SSDP advertisement (objects in the  UPnP.Discovery. object tables) expires. 

In case the SSDP advertisement expires and the CPE deletes the related instances from the tables in UPnP.Discovery., the reference to such instances MUST be set to the empty string.
	 */
	@XmlElementWrapper(name = "DeviceDescriptions")
	@XmlElement(name = "DeviceDescription")
	public Collection<DeviceDescription> deviceDescriptions;
	/**
	 * This table contains the information from Device Description Document retrieved for a discovered UPnP root or embedded device.
	 */
	@XmlElementWrapper(name = "DeviceInstances")
	@XmlElement(name = "DeviceInstance")
	public Collection<DeviceInstance> deviceInstances;
	/**
	 * This table contains the information from Device Description Document retrieved for a discovered UPnP service.
	 */
	@XmlElementWrapper(name = "ServiceInstances")
	@XmlElement(name = "ServiceInstance")
	public Collection<ServiceInstance> serviceInstances;

	public Description() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this table contains information read from the Device Description Document of discovered root devices.

The CPE MAY, but need not, retain some or all of the information in this table after the associated SSDP advertisement (objects in the  UPnP.Discovery. object tables) expires. 

In case the SSDP advertisement expires and the CPE deletes the related instances from the tables in UPnP.Discovery., the reference to such instances MUST be set to the empty string.
	 *
	 * @return the value
	 */
	public Collection<DeviceDescription> getDeviceDescriptions() {
		if (this.deviceDescriptions == null){ this.deviceDescriptions=new ArrayList<>();}
		return deviceDescriptions;
	}

	/**
	 * Set the this table contains information read from the Device Description Document of discovered root devices.

The CPE MAY, but need not, retain some or all of the information in this table after the associated SSDP advertisement (objects in the  UPnP.Discovery. object tables) expires. 

In case the SSDP advertisement expires and the CPE deletes the related instances from the tables in UPnP.Discovery., the reference to such instances MUST be set to the empty string.
	 *
	 * @param deviceDescriptions the input value
	 */
	public void  setDeviceDescriptions(Collection<DeviceDescription> deviceDescriptions) {
		this.deviceDescriptions = deviceDescriptions;
	}

	/**
	 * Set the this table contains information read from the Device Description Document of discovered root devices.

The CPE MAY, but need not, retain some or all of the information in this table after the associated SSDP advertisement (objects in the  UPnP.Discovery. object tables) expires. 

In case the SSDP advertisement expires and the CPE deletes the related instances from the tables in UPnP.Discovery., the reference to such instances MUST be set to the empty string.
	 *
	 * @param deviceDescription the input value
	 * @return this instance
	 */
	public Description withDeviceDescription(DeviceDescription deviceDescription) {
		getDeviceDescriptions().add(deviceDescription);
		return this;
	}

	/**
	 * Get the this table contains the information from Device Description Document retrieved for a discovered UPnP root or embedded device.
	 *
	 * @return the value
	 */
	public Collection<DeviceInstance> getDeviceInstances() {
		if (this.deviceInstances == null){ this.deviceInstances=new ArrayList<>();}
		return deviceInstances;
	}

	/**
	 * Set the this table contains the information from Device Description Document retrieved for a discovered UPnP root or embedded device.
	 *
	 * @param deviceInstances the input value
	 */
	public void  setDeviceInstances(Collection<DeviceInstance> deviceInstances) {
		this.deviceInstances = deviceInstances;
	}

	/**
	 * Set the this table contains the information from Device Description Document retrieved for a discovered UPnP root or embedded device.
	 *
	 * @param deviceInstance the input value
	 * @return this instance
	 */
	public Description withDeviceInstance(DeviceInstance deviceInstance) {
		getDeviceInstances().add(deviceInstance);
		return this;
	}

	/**
	 * Get the this table contains the information from Device Description Document retrieved for a discovered UPnP service.
	 *
	 * @return the value
	 */
	public Collection<ServiceInstance> getServiceInstances() {
		if (this.serviceInstances == null){ this.serviceInstances=new ArrayList<>();}
		return serviceInstances;
	}

	/**
	 * Set the this table contains the information from Device Description Document retrieved for a discovered UPnP service.
	 *
	 * @param serviceInstances the input value
	 */
	public void  setServiceInstances(Collection<ServiceInstance> serviceInstances) {
		this.serviceInstances = serviceInstances;
	}

	/**
	 * Set the this table contains the information from Device Description Document retrieved for a discovered UPnP service.
	 *
	 * @param serviceInstance the input value
	 * @return this instance
	 */
	public Description withServiceInstance(ServiceInstance serviceInstance) {
		getServiceInstances().add(serviceInstance);
		return this;
	}

	//</editor-fold>

}