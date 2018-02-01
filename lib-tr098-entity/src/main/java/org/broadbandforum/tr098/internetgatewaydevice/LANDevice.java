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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.Hosts;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.LANEthernetInterfaceConfig;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.LANHostConfigManagement;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.LANUSBInterfaceConfig;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.WLANConfiguration;

	/**
	 * Each instance models a LAN side layer 3 IP interface.

Each instance has children that correspond to the layer 2 interfaces that are connected to the Gateway's IP router via the modeled IP interface.  If a LANDevice instance is deleted, the objects modeling those layer 2 interfaces that are as a result no longer connected to the Gateway's IP router will move to the InternetGatewayDevice.LANInterfaces object.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.")
public class LANDevice {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * This object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.

The DHCP parameters in this object define the behavior of the default DHCP server, i.e. the behavior for DHCP requests that do not match any of the DHCP conditional serving pool entries.
	 */
	@XmlElement(name = "LANHostConfigManagement")
	public LANHostConfigManagement lanHostConfigManagement;
	/**
	 * This object models an Ethernet LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an Ethernet interface on the LAN side.
	 */
	@XmlElementWrapper(name = "lanEthernetInterfaceConfigs")
	@XmlElement(name = "LANEthernetInterfaceConfig")
	public Collection<LANEthernetInterfaceConfig> lanEthernetInterfaceConfigs;
	/**
	 * This object models a USB LAN connection on a CPE device.  This object MUST be implemented for CPE that contain a USB interface on the LAN side.
	 */
	@XmlElementWrapper(name = "lanUSBInterfaceConfigs")
	@XmlElement(name = "LANUSBInterfaceConfig")
	public Collection<LANUSBInterfaceConfig> lanUSBInterfaceConfigs;
	/**
	 * This object models an 802.11 LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 */
	@XmlElementWrapper(name = "wlaNConfigurations")
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
	public LANDevice withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.

The DHCP parameters in this object define the behavior of the default DHCP server, i.e. the behavior for DHCP requests that do not match any of the DHCP conditional serving pool entries.
	 *
	 * @return the value
	 */
	public LANHostConfigManagement getLanHostConfigManagement() {
		return lanHostConfigManagement;
	}

	/**
	 * Set the this object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.

The DHCP parameters in this object define the behavior of the default DHCP server, i.e. the behavior for DHCP requests that do not match any of the DHCP conditional serving pool entries.
	 *
	 * @param lanHostConfigManagement the input value
	 */
	public void  setLanHostConfigManagement(LANHostConfigManagement lanHostConfigManagement) {
		this.lanHostConfigManagement = lanHostConfigManagement;
	}

	/**
	 * Set the this object enables reporting of LAN-related device information and setting and configuring LAN IP addressing.

The DHCP parameters in this object define the behavior of the default DHCP server, i.e. the behavior for DHCP requests that do not match any of the DHCP conditional serving pool entries.
	 *
	 * @param lanHostConfigManagement the input value
	 * @return this instance
	 */
	public LANDevice withLanHostConfigManagement(LANHostConfigManagement lanHostConfigManagement) {
		this.lanHostConfigManagement = lanHostConfigManagement;
		return this;
	}

	/**
	 * Get the this object models an Ethernet LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an Ethernet interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<LANEthernetInterfaceConfig> getLanEthernetInterfaceConfigs() {
		if (this.lanEthernetInterfaceConfigs == null){ this.lanEthernetInterfaceConfigs=new ArrayList<>();}
		return lanEthernetInterfaceConfigs;
	}

	/**
	 * Set the this object models an Ethernet LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an Ethernet interface on the LAN side.
	 *
	 * @param lanEthernetInterfaceConfigs the input value
	 */
	public void  setLanEthernetInterfaceConfigs(Collection<LANEthernetInterfaceConfig> lanEthernetInterfaceConfigs) {
		this.lanEthernetInterfaceConfigs = lanEthernetInterfaceConfigs;
	}

	/**
	 * Set the this object models an Ethernet LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an Ethernet interface on the LAN side.
	 *
	 * @param lanEthernetInterfaceConfig the input value
	 * @return this instance
	 */
	public LANDevice withLANEthernetInterfaceConfig(LANEthernetInterfaceConfig lanEthernetInterfaceConfig) {
		getLanEthernetInterfaceConfigs().add(lanEthernetInterfaceConfig);
		return this;
	}

	/**
	 * Get the this object models a USB LAN connection on a CPE device.  This object MUST be implemented for CPE that contain a USB interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<LANUSBInterfaceConfig> getLanUSBInterfaceConfigs() {
		if (this.lanUSBInterfaceConfigs == null){ this.lanUSBInterfaceConfigs=new ArrayList<>();}
		return lanUSBInterfaceConfigs;
	}

	/**
	 * Set the this object models a USB LAN connection on a CPE device.  This object MUST be implemented for CPE that contain a USB interface on the LAN side.
	 *
	 * @param lanUSBInterfaceConfigs the input value
	 */
	public void  setLanUSBInterfaceConfigs(Collection<LANUSBInterfaceConfig> lanUSBInterfaceConfigs) {
		this.lanUSBInterfaceConfigs = lanUSBInterfaceConfigs;
	}

	/**
	 * Set the this object models a USB LAN connection on a CPE device.  This object MUST be implemented for CPE that contain a USB interface on the LAN side.
	 *
	 * @param lanUSBInterfaceConfig the input value
	 * @return this instance
	 */
	public LANDevice withLANUSBInterfaceConfig(LANUSBInterfaceConfig lanUSBInterfaceConfig) {
		getLanUSBInterfaceConfigs().add(lanUSBInterfaceConfig);
		return this;
	}

	/**
	 * Get the this object models an 802.11 LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @return the value
	 */
	public Collection<WLANConfiguration> getWlaNConfigurations() {
		if (this.wlaNConfigurations == null){ this.wlaNConfigurations=new ArrayList<>();}
		return wlaNConfigurations;
	}

	/**
	 * Set the this object models an 802.11 LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @param wlaNConfigurations the input value
	 */
	public void  setWlaNConfigurations(Collection<WLANConfiguration> wlaNConfigurations) {
		this.wlaNConfigurations = wlaNConfigurations;
	}

	/**
	 * Set the this object models an 802.11 LAN connection on a CPE device.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
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