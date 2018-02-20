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
package org.broadbandforum.tr181.device.upa._interface;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.MACAddress;

	/**
	 * This object represents the bridge table of the UPA interface. Each instance is a bridge table entry.

        It shows the MAC addresses of the remote UPA devices with their associated port number, and the MAC addresses of the end-devices (PCs, STBs, routers, etc) connected to Ethernet port of the powerline adapters with their associated logical port. In this way the system identifies to which UPA device an external device is connected to.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UPA.Interface.{i}.BridgeFor.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"MACAddress"})})
@XmlRootElement(name = "Device.UPA.Interface.BridgeFor")
@XmlType(name = "Device.UPA.Interface.BridgeFor")
@XmlAccessorType(XmlAccessType.FIELD)
public class BridgeFor {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * MAC address of the device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * Internal bridge associated port.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@Size(min = 0, max = 65535)
	public Long port;

	public BridgeFor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public BridgeFor withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mac address of the device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the mac address of the device.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the mac address of the device.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public BridgeFor withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the internal bridge associated port.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the internal bridge associated port.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the internal bridge associated port.
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public BridgeFor withPort(Long port) {
		this.port = port;
		return this;
	}

	//</editor-fold>

}