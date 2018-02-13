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
package org.broadbandforum.tr181.device.usb.usbhosts.host;

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
import org.broadbandforum.tr181.device.usb.usbhosts.host.device.Configuration;

	/**
	 * Table of connected USB devices.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.USB.USBHosts.Host.{i}.Device.{i}.")
@XmlRootElement(name = "Device.USB.USBHosts.Host.Device")
@XmlType(name = "Device.USB.USBHosts.Host.Device")
@XmlAccessorType(XmlAccessType.FIELD)
public class Device {

	/**
	 * Device number on USB bus.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeviceNumber")
	public Long deviceNumber;
	/**
	 * USB specification version with which the device complies.  Example: "1.1"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "USBVersion")
	@Size(max = 4)
	public String usbVersion;
	/**
	 * Class Code as assigned by USB-IF. 

          When 0x00, each device specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeviceClass")
	public byte[] deviceClass;
	/**
	 * Subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeviceSubClass")
	public byte[] deviceSubClass;
	/**
	 * Device release number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeviceVersion")
	@Size(max = 65535)
	public Long deviceVersion;
	/**
	 * Protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeviceProtocol")
	public byte[] deviceProtocol;
	/**
	 * Product ID (assigned by manufacturer).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProductID")
	@Size(max = 65535)
	public Long productID;
	/**
	 * Vendor ID (assigned by USB-IF).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VendorID")
	@Size(max = 65535)
	public Long vendorID;
	/**
	 * Device Manufacturer string descriptor.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Manufacturer")
	@Size(max = 64)
	public String manufacturer;
	/**
	 * Device Product Class string descriptor.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProductClass")
	@Size(max = 64)
	public String productClass;
	/**
	 * Device SerialNumber string descriptor.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * Hub port on parent device.

          0 when no parent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@Size(max = 255)
	public Long port;
	/**
	 * {{reference}} This is a reference to the USB host device to which this (external) USB device is connected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "USBPort")
	public String usbPort;
	/**
	 * Speed of the USB device. {{enum}}

          Internal signaling between the connected USB device and the USB Host Controller provide the information needed to determine the negotiated rate.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Rate")
	public String rate;
	/**
	 * {{reference}} This is a reference to the parent USB device (e.g. hub device).

          This is {{empty}} for a device connected to the Host controller (root hub).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Parent")
	public String parent;
	/**
	 * Number of ports.  Only applies for hub device, equal to 0 for other devices.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxChildren")
	public Long maxChildren;
	/**
	 * When {{true}} the associated Device is in a suspended (i.e. low-power) state (see {{bibref|USB2.0|Chapter 11.9}}).

          When {{false}} the associated Device is in any of the other states specified by the USB 2.0 Device State Machine (see {{bibref|USB2.0|Chapter 9.1.1}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IsSuspended")
	public Boolean issuspended;
	/**
	 * When {{true}} the associated device is at least partly powered by a local source (see {{bibref|USB2.0|Chapter 9.4.5}}). 

          When {{false}} the associated device draws all the current it needs from the USB bus.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IsSelfPowered")
	public Boolean isselfPowered;
	/**
	 * Table of device configurations.
	 */
	@XmlElementWrapper(name = "Configurations")
	@XmlElement(name = "Configuration")
	public Collection<Configuration> configurations;

	public Device() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the device number on USB bus.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * Set the device number on USB bus.
	 *
	 * @since 2.0
	 * @param deviceNumber the input value
	 */
	public void  setDeviceNumber(Long deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	/**
	 * Set the device number on USB bus.
	 *
	 * @since 2.0
	 * @param deviceNumber the input value
	 * @return this instance
	 */
	public Device withDeviceNumber(Long deviceNumber) {
		this.deviceNumber = deviceNumber;
		return this;
	}

	/**
	 * Get the usb specification version with which the device complies.  Example: "1.1"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUsbVersion() {
		return usbVersion;
	}

	/**
	 * Set the usb specification version with which the device complies.  Example: "1.1"
	 *
	 * @since 2.0
	 * @param usbVersion the input value
	 */
	public void  setUsbVersion(String usbVersion) {
		this.usbVersion = usbVersion;
	}

	/**
	 * Set the usb specification version with which the device complies.  Example: "1.1"
	 *
	 * @since 2.0
	 * @param usbVersion the input value
	 * @return this instance
	 */
	public Device withUsbVersion(String usbVersion) {
		this.usbVersion = usbVersion;
		return this;
	}

	/**
	 * Get the class Code as assigned by USB-IF. 

          When 0x00, each device specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDeviceClass() {
		return deviceClass;
	}

	/**
	 * Set the class Code as assigned by USB-IF. 

          When 0x00, each device specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 * @param deviceClass the input value
	 */
	public void  setDeviceClass(byte[] deviceClass) {
		this.deviceClass = deviceClass;
	}

	/**
	 * Set the class Code as assigned by USB-IF. 

          When 0x00, each device specifies its own class code.  When 0xFF, the class code is vendor specified.
	 *
	 * @since 2.0
	 * @param deviceClass the input value
	 * @return this instance
	 */
	public Device withDeviceClass(byte[] deviceClass) {
		this.deviceClass = deviceClass;
		return this;
	}

	/**
	 * Get the subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDeviceSubClass() {
		return deviceSubClass;
	}

	/**
	 * Set the subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param deviceSubClass the input value
	 */
	public void  setDeviceSubClass(byte[] deviceSubClass) {
		this.deviceSubClass = deviceSubClass;
	}

	/**
	 * Set the subclass code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param deviceSubClass the input value
	 * @return this instance
	 */
	public Device withDeviceSubClass(byte[] deviceSubClass) {
		this.deviceSubClass = deviceSubClass;
		return this;
	}

	/**
	 * Get the device release number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDeviceVersion() {
		return deviceVersion;
	}

	/**
	 * Set the device release number.
	 *
	 * @since 2.0
	 * @param deviceVersion the input value
	 */
	public void  setDeviceVersion(Long deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	/**
	 * Set the device release number.
	 *
	 * @since 2.0
	 * @param deviceVersion the input value
	 * @return this instance
	 */
	public Device withDeviceVersion(Long deviceVersion) {
		this.deviceVersion = deviceVersion;
		return this;
	}

	/**
	 * Get the protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDeviceProtocol() {
		return deviceProtocol;
	}

	/**
	 * Set the protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param deviceProtocol the input value
	 */
	public void  setDeviceProtocol(byte[] deviceProtocol) {
		this.deviceProtocol = deviceProtocol;
	}

	/**
	 * Set the protocol code (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param deviceProtocol the input value
	 * @return this instance
	 */
	public Device withDeviceProtocol(byte[] deviceProtocol) {
		this.deviceProtocol = deviceProtocol;
		return this;
	}

	/**
	 * Get the product ID (assigned by manufacturer).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getProductID() {
		return productID;
	}

	/**
	 * Set the product ID (assigned by manufacturer).
	 *
	 * @since 2.0
	 * @param productID the input value
	 */
	public void  setProductID(Long productID) {
		this.productID = productID;
	}

	/**
	 * Set the product ID (assigned by manufacturer).
	 *
	 * @since 2.0
	 * @param productID the input value
	 * @return this instance
	 */
	public Device withProductID(Long productID) {
		this.productID = productID;
		return this;
	}

	/**
	 * Get the vendor ID (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getVendorID() {
		return vendorID;
	}

	/**
	 * Set the vendor ID (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param vendorID the input value
	 */
	public void  setVendorID(Long vendorID) {
		this.vendorID = vendorID;
	}

	/**
	 * Set the vendor ID (assigned by USB-IF).
	 *
	 * @since 2.0
	 * @param vendorID the input value
	 * @return this instance
	 */
	public Device withVendorID(Long vendorID) {
		this.vendorID = vendorID;
		return this;
	}

	/**
	 * Get the device Manufacturer string descriptor.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Set the device Manufacturer string descriptor.
	 *
	 * @since 2.0
	 * @param manufacturer the input value
	 */
	public void  setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Set the device Manufacturer string descriptor.
	 *
	 * @since 2.0
	 * @param manufacturer the input value
	 * @return this instance
	 */
	public Device withManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	/**
	 * Get the device Product Class string descriptor.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * Set the device Product Class string descriptor.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 */
	public void  setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Set the device Product Class string descriptor.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 * @return this instance
	 */
	public Device withProductClass(String productClass) {
		this.productClass = productClass;
		return this;
	}

	/**
	 * Get the device SerialNumber string descriptor.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the device SerialNumber string descriptor.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the device SerialNumber string descriptor.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public Device withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the hub port on parent device.

          0 when no parent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the hub port on parent device.

          0 when no parent.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the hub port on parent device.

          0 when no parent.
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public Device withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the {{reference}} This is a reference to the USB host device to which this (external) USB device is connected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUsbPort() {
		return usbPort;
	}

	/**
	 * Set the {{reference}} This is a reference to the USB host device to which this (external) USB device is connected.
	 *
	 * @since 2.0
	 * @param usbPort the input value
	 */
	public void  setUsbPort(String usbPort) {
		this.usbPort = usbPort;
	}

	/**
	 * Set the {{reference}} This is a reference to the USB host device to which this (external) USB device is connected.
	 *
	 * @since 2.0
	 * @param usbPort the input value
	 * @return this instance
	 */
	public Device withUsbPort(String usbPort) {
		this.usbPort = usbPort;
		return this;
	}

	/**
	 * Get the speed of the USB device. {{enum}}

          Internal signaling between the connected USB device and the USB Host Controller provide the information needed to determine the negotiated rate.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * Set the speed of the USB device. {{enum}}

          Internal signaling between the connected USB device and the USB Host Controller provide the information needed to determine the negotiated rate.
	 *
	 * @since 2.0
	 * @param rate the input value
	 */
	public void  setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * Set the speed of the USB device. {{enum}}

          Internal signaling between the connected USB device and the USB Host Controller provide the information needed to determine the negotiated rate.
	 *
	 * @since 2.0
	 * @param rate the input value
	 * @return this instance
	 */
	public Device withRate(String rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * Get the {{reference}} This is a reference to the parent USB device (e.g. hub device).

          This is {{empty}} for a device connected to the Host controller (root hub).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * Set the {{reference}} This is a reference to the parent USB device (e.g. hub device).

          This is {{empty}} for a device connected to the Host controller (root hub).
	 *
	 * @since 2.0
	 * @param parent the input value
	 */
	public void  setParent(String parent) {
		this.parent = parent;
	}

	/**
	 * Set the {{reference}} This is a reference to the parent USB device (e.g. hub device).

          This is {{empty}} for a device connected to the Host controller (root hub).
	 *
	 * @since 2.0
	 * @param parent the input value
	 * @return this instance
	 */
	public Device withParent(String parent) {
		this.parent = parent;
		return this;
	}

	/**
	 * Get the number of ports.  Only applies for hub device, equal to 0 for other devices.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxChildren() {
		return maxChildren;
	}

	/**
	 * Set the number of ports.  Only applies for hub device, equal to 0 for other devices.
	 *
	 * @since 2.0
	 * @param maxChildren the input value
	 */
	public void  setMaxChildren(Long maxChildren) {
		this.maxChildren = maxChildren;
	}

	/**
	 * Set the number of ports.  Only applies for hub device, equal to 0 for other devices.
	 *
	 * @since 2.0
	 * @param maxChildren the input value
	 * @return this instance
	 */
	public Device withMaxChildren(Long maxChildren) {
		this.maxChildren = maxChildren;
		return this;
	}

	/**
	 * Get the when {{true}} the associated Device is in a suspended (i.e. low-power) state (see {{bibref|USB2.0|Chapter 11.9}}).

          When {{false}} the associated Device is in any of the other states specified by the USB 2.0 Device State Machine (see {{bibref|USB2.0|Chapter 9.1.1}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIssuspended() {
		return issuspended;
	}

	/**
	 * Set the when {{true}} the associated Device is in a suspended (i.e. low-power) state (see {{bibref|USB2.0|Chapter 11.9}}).

          When {{false}} the associated Device is in any of the other states specified by the USB 2.0 Device State Machine (see {{bibref|USB2.0|Chapter 9.1.1}}).
	 *
	 * @since 2.0
	 * @param issuspended the input value
	 */
	public void  setIssuspended(Boolean issuspended) {
		this.issuspended = issuspended;
	}

	/**
	 * Set the when {{true}} the associated Device is in a suspended (i.e. low-power) state (see {{bibref|USB2.0|Chapter 11.9}}).

          When {{false}} the associated Device is in any of the other states specified by the USB 2.0 Device State Machine (see {{bibref|USB2.0|Chapter 9.1.1}}).
	 *
	 * @since 2.0
	 * @param issuspended the input value
	 * @return this instance
	 */
	public Device withIssuspended(Boolean issuspended) {
		this.issuspended = issuspended;
		return this;
	}

	/**
	 * Get the when {{true}} the associated device is at least partly powered by a local source (see {{bibref|USB2.0|Chapter 9.4.5}}). 

          When {{false}} the associated device draws all the current it needs from the USB bus.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIsselfPowered() {
		return isselfPowered;
	}

	/**
	 * Set the when {{true}} the associated device is at least partly powered by a local source (see {{bibref|USB2.0|Chapter 9.4.5}}). 

          When {{false}} the associated device draws all the current it needs from the USB bus.
	 *
	 * @since 2.0
	 * @param isselfPowered the input value
	 */
	public void  setIsselfPowered(Boolean isselfPowered) {
		this.isselfPowered = isselfPowered;
	}

	/**
	 * Set the when {{true}} the associated device is at least partly powered by a local source (see {{bibref|USB2.0|Chapter 9.4.5}}). 

          When {{false}} the associated device draws all the current it needs from the USB bus.
	 *
	 * @since 2.0
	 * @param isselfPowered the input value
	 * @return this instance
	 */
	public Device withIsselfPowered(Boolean isselfPowered) {
		this.isselfPowered = isselfPowered;
		return this;
	}

	/**
	 * Get the table of device configurations.
	 *
	 * @return the value
	 */
	public Collection<Configuration> getConfigurations() {
		if (this.configurations == null){ this.configurations=new ArrayList<>();}
		return configurations;
	}

	/**
	 * Set the table of device configurations.
	 *
	 * @param configurations the input value
	 */
	public void  setConfigurations(Collection<Configuration> configurations) {
		this.configurations = configurations;
	}

	/**
	 * Set the table of device configurations.
	 *
	 * @param configuration the input value
	 * @return this instance
	 */
	public Device withConfiguration(Configuration configuration) {
		getConfigurations().add(configuration);
		return this;
	}

	//</editor-fold>

}