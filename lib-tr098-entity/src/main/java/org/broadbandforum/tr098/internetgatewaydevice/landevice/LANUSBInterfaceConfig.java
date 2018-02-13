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
package org.broadbandforum.tr098.internetgatewaydevice.landevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.datatypes.MACAddress;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.lanusbinterfaceconfig.Stats;

	/**
	 * This object models a USB LAN connection on a CPE device.  This object MUST be implemented for CPE that contain a USB interface on the LAN side.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANUSBInterfaceConfig.{i}.")
@XmlRootElement(name = "LANUSBInterfaceConfig")
@XmlType(name = "InternetGatewayDevice.LANDevice.LANUSBInterfaceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class LANUSBInterfaceConfig {

	/**
	 * Enables or disables this interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The name of this layer 2 interface, chosen by the vendor, e.g. "usb0".
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Name")
	@Size(max = 16)
	public String name;
	/**
	 * The physical address of the interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * Indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddressControlEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean macAddressControlEnabled;
	/**
	 * USB version supported by the device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Standard")
	@Size(max = 6)
	public String standard;
	/**
	 * Type of the USB interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * Speed of the USB interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Rate")
	public String rate;
	/**
	 * Power configuration of the USB interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Power")
	public String power;
	/**
	 * This object contains statistics for a USB LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public LANUSBInterfaceConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this interface.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this interface.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the name of this layer 2 interface, chosen by the vendor, e.g. "usb0".
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of this layer 2 interface, chosen by the vendor, e.g. "usb0".
	 *
	 * @since 1.4
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of this layer 2 interface, chosen by the vendor, e.g. "usb0".
	 *
	 * @since 1.4
	 * @param name the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the physical address of the interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the physical address of the interface.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the physical address of the interface.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isMacAddressControlEnabled() {
		return macAddressControlEnabled;
	}

	/**
	 * Set the indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 * @param macAddressControlEnabled the input value
	 */
	public void  setMacAddressControlEnabled(Boolean macAddressControlEnabled) {
		this.macAddressControlEnabled = macAddressControlEnabled;
	}

	/**
	 * Set the indicates whether MAC Address Control is enabled or not on this interface.  MAC Address Control limits the clients that connect to those that match a list of allowed MAC addresses specified in {{param|InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.AllowedMACAddresses}}.
	 *
	 * @since 1.0
	 * @param macAddressControlEnabled the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withMacAddressControlEnabled(Boolean macAddressControlEnabled) {
		this.macAddressControlEnabled = macAddressControlEnabled;
		return this;
	}

	/**
	 * Get the usb version supported by the device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * Set the usb version supported by the device.
	 *
	 * @since 1.0
	 * @param standard the input value
	 */
	public void  setStandard(String standard) {
		this.standard = standard;
	}

	/**
	 * Set the usb version supported by the device.
	 *
	 * @since 1.0
	 * @param standard the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withStandard(String standard) {
		this.standard = standard;
		return this;
	}

	/**
	 * Get the type of the USB interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of the USB interface.
	 *
	 * @since 1.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the type of the USB interface.
	 *
	 * @since 1.0
	 * @param type the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the speed of the USB interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * Set the speed of the USB interface.
	 *
	 * @since 1.0
	 * @param rate the input value
	 */
	public void  setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * Set the speed of the USB interface.
	 *
	 * @since 1.0
	 * @param rate the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withRate(String rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * Get the power configuration of the USB interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPower() {
		return power;
	}

	/**
	 * Set the power configuration of the USB interface.
	 *
	 * @since 1.0
	 * @param power the input value
	 */
	public void  setPower(String power) {
		this.power = power;
	}

	/**
	 * Set the power configuration of the USB interface.
	 *
	 * @since 1.0
	 * @param power the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withPower(String power) {
		this.power = power;
		return this;
	}

	/**
	 * Get the this object contains statistics for a USB LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for a USB LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for a USB LAN interface on a CPE device.

Note that these statistics refer to the link layer, not to the physical layer.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public LANUSBInterfaceConfig withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}