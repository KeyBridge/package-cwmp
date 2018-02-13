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
package org.broadbandforum.tr181.device.usb.usbhosts;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.usb.usbhosts.host.Device;

	/**
	 * Table of CPE USB Host controllers.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.USB.USBHosts.Host.{i}.")
@XmlRootElement(name = "Device.USB.USBHosts.Host")
@XmlType(name = "Device.USB.USBHosts.Host")
@XmlAccessorType(XmlAccessType.FIELD)
public class Host {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enables or disables the USB Host controller.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * User-readable host controller name.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * Type of USB Host
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * When set to {{true}}, reset the Host Controller and apply the reset signaling (see {{bibref|USB2.0|Chapter 7.1.7.5}}) to all of the Host Controller Hub downstream ports.

          The value is not saved in the device's state and setting it to {{false}} has no effect.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * When set to {{true}}, {{param}} enables the Host Controller to invoke Power Management policy, i.e. controlled Suspend (see {{bibref|USB2.0}}, Chapters 4.3.2, 7.1.7.6, and 11.9).

          When set to {{false}} {{param}} immediately disables the Host controller Power Management policy.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerManagementEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean powerManagementEnable;
	/**
	 * USB specification version with which the controller complies.  Example: "1.1"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "USBVersion")
	@Size(max = 4)
	public String usbVersion;
	/**
	 * Table of connected USB devices.
	 */
	@XmlElementWrapper(name = "Devices")
	@XmlElement(name = "Device")
	public Collection<Device> devices;

	public Host() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.3
	 * @param alias the input value
	 * @return this instance
	 */
	public Host withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables the USB Host controller.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the USB Host controller.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the USB Host controller.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Host withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the user-readable host controller name.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the user-readable host controller name.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the user-readable host controller name.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Host withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the type of USB Host
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of USB Host
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the type of USB Host
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public Host withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the when set to {{true}}, reset the Host Controller and apply the reset signaling (see {{bibref|USB2.0|Chapter 7.1.7.5}}) to all of the Host Controller Hub downstream ports.

          The value is not saved in the device's state and setting it to {{false}} has no effect.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, reset the Host Controller and apply the reset signaling (see {{bibref|USB2.0|Chapter 7.1.7.5}}) to all of the Host Controller Hub downstream ports.

          The value is not saved in the device's state and setting it to {{false}} has no effect.
	 *
	 * @since 2.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, reset the Host Controller and apply the reset signaling (see {{bibref|USB2.0|Chapter 7.1.7.5}}) to all of the Host Controller Hub downstream ports.

          The value is not saved in the device's state and setting it to {{false}} has no effect.
	 *
	 * @since 2.0
	 * @param reset the input value
	 * @return this instance
	 */
	public Host withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the when set to {{true}}, {{param}} enables the Host Controller to invoke Power Management policy, i.e. controlled Suspend (see {{bibref|USB2.0}}, Chapters 4.3.2, 7.1.7.6, and 11.9).

          When set to {{false}} {{param}} immediately disables the Host controller Power Management policy.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPowerManagementEnable() {
		return powerManagementEnable;
	}

	/**
	 * Set the when set to {{true}}, {{param}} enables the Host Controller to invoke Power Management policy, i.e. controlled Suspend (see {{bibref|USB2.0}}, Chapters 4.3.2, 7.1.7.6, and 11.9).

          When set to {{false}} {{param}} immediately disables the Host controller Power Management policy.
	 *
	 * @since 2.0
	 * @param powerManagementEnable the input value
	 */
	public void  setPowerManagementEnable(Boolean powerManagementEnable) {
		this.powerManagementEnable = powerManagementEnable;
	}

	/**
	 * Set the when set to {{true}}, {{param}} enables the Host Controller to invoke Power Management policy, i.e. controlled Suspend (see {{bibref|USB2.0}}, Chapters 4.3.2, 7.1.7.6, and 11.9).

          When set to {{false}} {{param}} immediately disables the Host controller Power Management policy.
	 *
	 * @since 2.0
	 * @param powerManagementEnable the input value
	 * @return this instance
	 */
	public Host withPowerManagementEnable(Boolean powerManagementEnable) {
		this.powerManagementEnable = powerManagementEnable;
		return this;
	}

	/**
	 * Get the usb specification version with which the controller complies.  Example: "1.1"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUsbVersion() {
		return usbVersion;
	}

	/**
	 * Set the usb specification version with which the controller complies.  Example: "1.1"
	 *
	 * @since 2.0
	 * @param usbVersion the input value
	 */
	public void  setUsbVersion(String usbVersion) {
		this.usbVersion = usbVersion;
	}

	/**
	 * Set the usb specification version with which the controller complies.  Example: "1.1"
	 *
	 * @since 2.0
	 * @param usbVersion the input value
	 * @return this instance
	 */
	public Host withUsbVersion(String usbVersion) {
		this.usbVersion = usbVersion;
		return this;
	}

	/**
	 * Get the table of connected USB devices.
	 *
	 * @return the value
	 */
	public Collection<Device> getDevices() {
		if (this.devices == null){ this.devices=new ArrayList<>();}
		return devices;
	}

	/**
	 * Set the table of connected USB devices.
	 *
	 * @param devices the input value
	 */
	public void  setDevices(Collection<Device> devices) {
		this.devices = devices;
	}

	/**
	 * Set the table of connected USB devices.
	 *
	 * @param device the input value
	 * @return this instance
	 */
	public Host withDevice(Device device) {
		getDevices().add(device);
		return this;
	}

	//</editor-fold>

}