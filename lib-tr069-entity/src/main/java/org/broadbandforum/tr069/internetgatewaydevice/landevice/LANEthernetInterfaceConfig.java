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
package org.broadbandforum.tr069.internetgatewaydevice.landevice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr069.datatypes.MACAddress;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.lanethernetinterfaceconfig.Stats;

	/**
	 * This object models an Ethernet LAN connection on a CPE device.  This object must be implemented for CPE that contain an Ethernet interface on the LAN side.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}.")
@XmlRootElement(name = "InternetGatewayDevice.LANDevice.LANEthernetInterfaceConfig")
@XmlType(name = "InternetGatewayDevice.LANDevice.LANEthernetInterfaceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class LANEthernetInterfaceConfig {

	/**
	 * Enables or disables this interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
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
	 * The maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxBitRate")
	@CWMPParameter(access = "readWrite")
	public String maxBitRate;
	/**
	 * The duplex mode available to this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DuplexMode")
	@CWMPParameter(access = "readWrite")
	public String duplexMode;
	/**
	 * This object contains statistics for an Ethernet LAN interface on a CPE device.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public LANEthernetInterfaceConfig() {
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
	public LANEthernetInterfaceConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this interface.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this interface.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public LANEthernetInterfaceConfig withStatus(String status) {
		this.status = status;
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
	public LANEthernetInterfaceConfig withMacAddress(MACAddress macAddress) {
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
	public LANEthernetInterfaceConfig withMacAddressControlEnabled(Boolean macAddressControlEnabled) {
		this.macAddressControlEnabled = macAddressControlEnabled;
		return this;
	}

	/**
	 * Get the maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(String maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public LANEthernetInterfaceConfig withMaxBitRate(String maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the duplex mode available to this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDuplexMode() {
		return duplexMode;
	}

	/**
	 * Set the duplex mode available to this connection.
	 *
	 * @since 1.0
	 * @param duplexMode the input value
	 */
	public void  setDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
	}

	/**
	 * Set the duplex mode available to this connection.
	 *
	 * @since 1.0
	 * @param duplexMode the input value
	 * @return this instance
	 */
	public LANEthernetInterfaceConfig withDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
		return this;
	}

	/**
	 * Get the this object contains statistics for an Ethernet LAN interface on a CPE device.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for an Ethernet LAN interface on a CPE device.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for an Ethernet LAN interface on a CPE device.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public LANEthernetInterfaceConfig withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}