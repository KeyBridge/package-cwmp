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
import org.broadbandforum.tr098.internetgatewaydevice.laninterfaces.LANEthernetInterfaceConfig;
import org.broadbandforum.tr098.internetgatewaydevice.laninterfaces.LANUSBInterfaceConfig;
import org.broadbandforum.tr098.internetgatewaydevice.laninterfaces.WLANConfiguration;

	/**
	 * This object contains LAN-side layer 1/2 interfaces that are not currently connected to the Gateway's IP router and which therefore do not currently reside within a ''LANDevice'' instance.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.LANInterfaces.")
public class LANInterfaces {

	/**
	 * This object models an Ethernet LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}}}.
	 */
	@XmlElementWrapper(name = "lanEthernetInterfaceConfigs")
	@XmlElement(name = "LANEthernetInterfaceConfig")
	public Collection<LANEthernetInterfaceConfig> lanEthernetInterfaceConfigs;
	/**
	 * This object models a USB LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANUSBInterfaceConfig.{i}}}.
	 */
	@XmlElementWrapper(name = "lanUSBInterfaceConfigs")
	@XmlElement(name = "LANUSBInterfaceConfig")
	public Collection<LANUSBInterfaceConfig> lanUSBInterfaceConfigs;
	/**
	 * This object models an 802.11 LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}}}.
	 */
	@XmlElementWrapper(name = "wlaNConfigurations")
	@XmlElement(name = "WLANConfiguration")
	public Collection<WLANConfiguration> wlaNConfigurations;

	public LANInterfaces() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object models an Ethernet LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}}}.
	 *
	 * @return the value
	 */
	public Collection<LANEthernetInterfaceConfig> getLanEthernetInterfaceConfigs() {
		if (this.lanEthernetInterfaceConfigs == null){ this.lanEthernetInterfaceConfigs=new ArrayList<>();}
		return lanEthernetInterfaceConfigs;
	}

	/**
	 * Set the this object models an Ethernet LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}}}.
	 *
	 * @param lanEthernetInterfaceConfigs the input value
	 */
	public void  setLanEthernetInterfaceConfigs(Collection<LANEthernetInterfaceConfig> lanEthernetInterfaceConfigs) {
		this.lanEthernetInterfaceConfigs = lanEthernetInterfaceConfigs;
	}

	/**
	 * Set the this object models an Ethernet LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}}}.
	 *
	 * @param lanEthernetInterfaceConfig the input value
	 * @return this instance
	 */
	public LANInterfaces withLANEthernetInterfaceConfig(LANEthernetInterfaceConfig lanEthernetInterfaceConfig) {
		getLanEthernetInterfaceConfigs().add(lanEthernetInterfaceConfig);
		return this;
	}

	/**
	 * Get the this object models a USB LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANUSBInterfaceConfig.{i}}}.
	 *
	 * @return the value
	 */
	public Collection<LANUSBInterfaceConfig> getLanUSBInterfaceConfigs() {
		if (this.lanUSBInterfaceConfigs == null){ this.lanUSBInterfaceConfigs=new ArrayList<>();}
		return lanUSBInterfaceConfigs;
	}

	/**
	 * Set the this object models a USB LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANUSBInterfaceConfig.{i}}}.
	 *
	 * @param lanUSBInterfaceConfigs the input value
	 */
	public void  setLanUSBInterfaceConfigs(Collection<LANUSBInterfaceConfig> lanUSBInterfaceConfigs) {
		this.lanUSBInterfaceConfigs = lanUSBInterfaceConfigs;
	}

	/**
	 * Set the this object models a USB LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.LANUSBInterfaceConfig.{i}}}.
	 *
	 * @param lanUSBInterfaceConfig the input value
	 * @return this instance
	 */
	public LANInterfaces withLANUSBInterfaceConfig(LANUSBInterfaceConfig lanUSBInterfaceConfig) {
		getLanUSBInterfaceConfigs().add(lanUSBInterfaceConfig);
		return this;
	}

	/**
	 * Get the this object models an 802.11 LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}}}.
	 *
	 * @return the value
	 */
	public Collection<WLANConfiguration> getWlaNConfigurations() {
		if (this.wlaNConfigurations == null){ this.wlaNConfigurations=new ArrayList<>();}
		return wlaNConfigurations;
	}

	/**
	 * Set the this object models an 802.11 LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}}}.
	 *
	 * @param wlaNConfigurations the input value
	 */
	public void  setWlaNConfigurations(Collection<WLANConfiguration> wlaNConfigurations) {
		this.wlaNConfigurations = wlaNConfigurations;
	}

	/**
	 * Set the this object models an 802.11 LAN connection on a CPE device.

The object definition is identical to that for {{object|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}}}.
	 *
	 * @param wlaNConfiguration the input value
	 * @return this instance
	 */
	public LANInterfaces withWLANConfiguration(WLANConfiguration wlaNConfiguration) {
		getWlaNConfigurations().add(wlaNConfiguration);
		return this;
	}

	//</editor-fold>

}