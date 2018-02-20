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
package org.broadbandforum.tr069.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.Hosts;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.LANEthernetInterfaceConfig;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.LANHostConfigManagement;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.LANUSBInterfaceConfig;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.WLANConfiguration;

	/**
	 * Each instance contains all LAN-related objects for a given bridged subnet.
	 *
	 * @since TR069 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.")
@XmlRootElement(name = "InternetGatewayDevice.LANDevice")
@XmlType(name = "InternetGatewayDevice.LANDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class LANDevice {

	/**
	 * This object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.
	 */
	@XmlElement(name = "LANHostConfigManagement")
	public LANHostConfigManagement lanHostConfigManagement;
	/**
	 * This object models an Ethernet LAN connection on a CPE device.  This object must be implemented for CPE that contain an Ethernet interface on the LAN side.
	 */
	@XmlElementWrapper(name = "LANEthernetInterfaceConfigs")
	@XmlElement(name = "LANEthernetInterfaceConfig")
	public Collection<LANEthernetInterfaceConfig> lanEthernetInterfaceConfigs;
	/**
	 * This object models a USB LAN connection on a CPE device.  This object must be implemented for CPE that contain a USB interface on the LAN side.
	 */
	@XmlElementWrapper(name = "LANUSBInterfaceConfigs")
	@XmlElement(name = "LANUSBInterfaceConfig")
	public Collection<LANUSBInterfaceConfig> lanUSBInterfaceConfigs;
	/**
	 * This object models an 802.11 LAN connection on a CPE device.  This object must be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "WLANConfigurations")
	@XmlElement(name = "WLANConfiguration")
	public Collection<WLANConfiguration> wlaNConfigurations;
	/**
	 * This object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses.
	 */
	@XmlElement(name = "Hosts")
	public Hosts hosts;

	public LANDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.
	 *
	 * @return the value
	 */
	public LANHostConfigManagement getLanHostConfigManagement() {
		return lanHostConfigManagement;
	}

	/**
	 * Set the this object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.
	 *
	 * @param lanHostConfigManagement the input value
	 */
	public void  setLanHostConfigManagement(LANHostConfigManagement lanHostConfigManagement) {
		this.lanHostConfigManagement = lanHostConfigManagement;
	}

	/**
	 * Set the this object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.
	 *
	 * @param lanHostConfigManagement the input value
	 * @return this instance
	 */
	public LANDevice withLanHostConfigManagement(LANHostConfigManagement lanHostConfigManagement) {
		this.lanHostConfigManagement = lanHostConfigManagement;
		return this;
	}

	/**
	 * Get the this object models an Ethernet LAN connection on a CPE device.  This object must be implemented for CPE that contain an Ethernet interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<LANEthernetInterfaceConfig> getLanEthernetInterfaceConfigs() {
		if (this.lanEthernetInterfaceConfigs == null){ this.lanEthernetInterfaceConfigs=new ArrayList<>();}
		return lanEthernetInterfaceConfigs;
	}

	/**
	 * Set the this object models an Ethernet LAN connection on a CPE device.  This object must be implemented for CPE that contain an Ethernet interface on the LAN side.
	 *
	 * @param lanEthernetInterfaceConfigs the input value
	 */
	public void  setLanEthernetInterfaceConfigs(Collection<LANEthernetInterfaceConfig> lanEthernetInterfaceConfigs) {
		this.lanEthernetInterfaceConfigs = lanEthernetInterfaceConfigs;
	}

	/**
	 * Set the this object models an Ethernet LAN connection on a CPE device.  This object must be implemented for CPE that contain an Ethernet interface on the LAN side.
	 *
	 * @param lanEthernetInterfaceConfig the input value
	 * @return this instance
	 */
	public LANDevice withLANEthernetInterfaceConfig(LANEthernetInterfaceConfig lanEthernetInterfaceConfig) {
		getLanEthernetInterfaceConfigs().add(lanEthernetInterfaceConfig);
		return this;
	}

	/**
	 * Get the this object models a USB LAN connection on a CPE device.  This object must be implemented for CPE that contain a USB interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<LANUSBInterfaceConfig> getLanUSBInterfaceConfigs() {
		if (this.lanUSBInterfaceConfigs == null){ this.lanUSBInterfaceConfigs=new ArrayList<>();}
		return lanUSBInterfaceConfigs;
	}

	/**
	 * Set the this object models a USB LAN connection on a CPE device.  This object must be implemented for CPE that contain a USB interface on the LAN side.
	 *
	 * @param lanUSBInterfaceConfigs the input value
	 */
	public void  setLanUSBInterfaceConfigs(Collection<LANUSBInterfaceConfig> lanUSBInterfaceConfigs) {
		this.lanUSBInterfaceConfigs = lanUSBInterfaceConfigs;
	}

	/**
	 * Set the this object models a USB LAN connection on a CPE device.  This object must be implemented for CPE that contain a USB interface on the LAN side.
	 *
	 * @param lanUSBInterfaceConfig the input value
	 * @return this instance
	 */
	public LANDevice withLANUSBInterfaceConfig(LANUSBInterfaceConfig lanUSBInterfaceConfig) {
		getLanUSBInterfaceConfigs().add(lanUSBInterfaceConfig);
		return this;
	}

	/**
	 * Get the this object models an 802.11 LAN connection on a CPE device.  This object must be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<WLANConfiguration> getWlaNConfigurations() {
		if (this.wlaNConfigurations == null){ this.wlaNConfigurations=new ArrayList<>();}
		return wlaNConfigurations;
	}

	/**
	 * Set the this object models an 802.11 LAN connection on a CPE device.  This object must be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param wlaNConfigurations the input value
	 */
	public void  setWlaNConfigurations(Collection<WLANConfiguration> wlaNConfigurations) {
		this.wlaNConfigurations = wlaNConfigurations;
	}

	/**
	 * Set the this object models an 802.11 LAN connection on a CPE device.  This object must be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param wlaNConfiguration the input value
	 * @return this instance
	 */
	public LANDevice withWLANConfiguration(WLANConfiguration wlaNConfiguration) {
		getWlaNConfigurations().add(wlaNConfiguration);
		return this;
	}

	/**
	 * Get the this object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses.
	 *
	 * @return the value
	 */
	public Hosts getHosts() {
		return hosts;
	}

	/**
	 * Set the this object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses.
	 *
	 * @param hosts the input value
	 */
	public void  setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

	/**
	 * Set the this object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses.
	 *
	 * @param hosts the input value
	 * @return this instance
	 */
	public LANDevice withHosts(Hosts hosts) {
		this.hosts = hosts;
		return this;
	}

	//</editor-fold>

}