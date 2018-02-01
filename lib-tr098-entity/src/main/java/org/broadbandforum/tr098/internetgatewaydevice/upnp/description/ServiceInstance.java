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
package org.broadbandforum.tr098.internetgatewaydevice.upnp.description;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This table contains the information from Device Description Document retrieved for a discovered UPnP service.
	 *
	 * @since 1.12
	 */
@CWMPObject(name = "InternetGatewayDevice.UPnP.Description.ServiceInstance.{i}.")
public class ServiceInstance {

	/**
	 * {{reference|a {{object|#.DeviceInstance}} table entry}}
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "ParentDevice")
	@Size(max = 256)
	public String parentDevice;
	/**
	 * The value of the UPnP serviceId element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.

If the UPnP serviceId is not provided by the UPnP service, this {{object}} MUST be deleted.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "ServiceId")
	@Size(max = 256)
	public String serviceId;
	/**
	 * {{reference|a {{object|##.Discovery.Service}} table entry}}

This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "ServiceDiscovery")
	@Size(max = 256)
	public String serviceDiscovery;
	/**
	 * The value of the UPnP serviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "ServiceType")
	@Size(max = 256)
	public String serviceType;
	/**
	 * The value of the UPnP SCPDURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the SCPDURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the SCPDURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "SCPDURL")
	public String scpDURL;
	/**
	 * The value of the UPnP controlURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the controlURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the controlURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "ControlURL")
	public String controlURL;
	/**
	 * The value of the UPnP eventSubURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the eventSubURLL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the eventSubURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "EventSubURL")
	public String eventSubURL;

	public ServiceInstance() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{reference|a {{object|#.DeviceInstance}} table entry}}
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getParentDevice() {
		return parentDevice;
	}

	/**
	 * Set the {{reference|a {{object|#.DeviceInstance}} table entry}}
	 *
	 * @since 1.12
	 * @param parentDevice the input value
	 */
	public void  setParentDevice(String parentDevice) {
		this.parentDevice = parentDevice;
	}

	/**
	 * Set the {{reference|a {{object|#.DeviceInstance}} table entry}}
	 *
	 * @since 1.12
	 * @param parentDevice the input value
	 * @return this instance
	 */
	public ServiceInstance withParentDevice(String parentDevice) {
		this.parentDevice = parentDevice;
		return this;
	}

	/**
	 * Get the value of the UPnP serviceId element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.

If the UPnP serviceId is not provided by the UPnP service, this {{object}} MUST be deleted.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * Set the value of the UPnP serviceId element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.

If the UPnP serviceId is not provided by the UPnP service, this {{object}} MUST be deleted.
	 *
	 * @since 1.12
	 * @param serviceId the input value
	 */
	public void  setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * Set the value of the UPnP serviceId element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.

If the UPnP serviceId is not provided by the UPnP service, this {{object}} MUST be deleted.
	 *
	 * @since 1.12
	 * @param serviceId the input value
	 * @return this instance
	 */
	public ServiceInstance withServiceId(String serviceId) {
		this.serviceId = serviceId;
		return this;
	}

	/**
	 * Get the {{reference|a {{object|##.Discovery.Service}} table entry}}

This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getServiceDiscovery() {
		return serviceDiscovery;
	}

	/**
	 * Set the {{reference|a {{object|##.Discovery.Service}} table entry}}

This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 1.12
	 * @param serviceDiscovery the input value
	 */
	public void  setServiceDiscovery(String serviceDiscovery) {
		this.serviceDiscovery = serviceDiscovery;
	}

	/**
	 * Set the {{reference|a {{object|##.Discovery.Service}} table entry}}

This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 1.12
	 * @param serviceDiscovery the input value
	 * @return this instance
	 */
	public ServiceInstance withServiceDiscovery(String serviceDiscovery) {
		this.serviceDiscovery = serviceDiscovery;
		return this;
	}

	/**
	 * Get the value of the UPnP serviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * Set the value of the UPnP serviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.
	 *
	 * @since 1.12
	 * @param serviceType the input value
	 */
	public void  setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * Set the value of the UPnP serviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the service.
	 *
	 * @since 1.12
	 * @param serviceType the input value
	 * @return this instance
	 */
	public ServiceInstance withServiceType(String serviceType) {
		this.serviceType = serviceType;
		return this;
	}

	/**
	 * Get the value of the UPnP SCPDURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the SCPDURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the SCPDURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getScpDURL() {
		return scpDURL;
	}

	/**
	 * Set the value of the UPnP SCPDURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the SCPDURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the SCPDURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 1.12
	 * @param scpDURL the input value
	 */
	public void  setScpDURL(String scpDURL) {
		this.scpDURL = scpDURL;
	}

	/**
	 * Set the value of the UPnP SCPDURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the SCPDURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the SCPDURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 1.12
	 * @param scpDURL the input value
	 * @return this instance
	 */
	public ServiceInstance withScpDURL(String scpDURL) {
		this.scpDURL = scpDURL;
		return this;
	}

	/**
	 * Get the value of the UPnP controlURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the controlURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the controlURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getControlURL() {
		return controlURL;
	}

	/**
	 * Set the value of the UPnP controlURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the controlURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the controlURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 * @param controlURL the input value
	 */
	public void  setControlURL(String controlURL) {
		this.controlURL = controlURL;
	}

	/**
	 * Set the value of the UPnP controlURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the controlURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the controlURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 * @param controlURL the input value
	 * @return this instance
	 */
	public ServiceInstance withControlURL(String controlURL) {
		this.controlURL = controlURL;
		return this;
	}

	/**
	 * Get the value of the UPnP eventSubURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the eventSubURLL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the eventSubURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getEventSubURL() {
		return eventSubURL;
	}

	/**
	 * Set the value of the UPnP eventSubURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the eventSubURLL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the eventSubURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 * @param eventSubURL the input value
	 */
	public void  setEventSubURL(String eventSubURL) {
		this.eventSubURL = eventSubURL;
	}

	/**
	 * Set the value of the UPnP eventSubURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

The way to obtain an absolute URL from the eventSubURLL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

If the eventSubURL is not provided by the device then this value MUST be {{empty}}
	 *
	 * @since 1.12
	 * @param eventSubURL the input value
	 * @return this instance
	 */
	public ServiceInstance withEventSubURL(String eventSubURL) {
		this.eventSubURL = eventSubURL;
		return this;
	}

	//</editor-fold>

}