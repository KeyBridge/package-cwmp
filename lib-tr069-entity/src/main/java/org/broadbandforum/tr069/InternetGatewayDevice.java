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
package org.broadbandforum.tr069;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr069.internetgatewaydevice.DeviceConfig;
import org.broadbandforum.tr069.internetgatewaydevice.DeviceInfo;
import org.broadbandforum.tr069.internetgatewaydevice.IPPingDiagnostics;
import org.broadbandforum.tr069.internetgatewaydevice.LANConfigSecurity;
import org.broadbandforum.tr069.internetgatewaydevice.LANDevice;
import org.broadbandforum.tr069.internetgatewaydevice.Layer3Forwarding;
import org.broadbandforum.tr069.internetgatewaydevice.ManagementServer;
import org.broadbandforum.tr069.internetgatewaydevice.Time;
import org.broadbandforum.tr069.internetgatewaydevice.UserInterface;
import org.broadbandforum.tr069.internetgatewaydevice.WANDevice;

	/**
	 * The top-level object for an Internet Gateway Device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.")
@XmlRootElement(name = "InternetGatewayDevice")
@XmlType(name = "InternetGatewayDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class InternetGatewayDevice {

	/**
	 * This object contains general device information.
	 */
	@XmlElement(name = "DeviceInfo")
	public DeviceInfo deviceInfo;
	/**
	 * This object contains general configuration parameters.
	 */
	@XmlElement(name = "DeviceConfig")
	public DeviceConfig deviceConfig;
	/**
	 * This object contains parameters relating to the CPE's association with an ACS.
	 */
	@XmlElement(name = "ManagementServer")
	public ManagementServer managementServer;
	/**
	 * This object contains parameters relating an NTP or SNTP time client in the CPE.  Support for this object is Optional.
	 */
	@XmlElement(name = "Time")
	public Time time;
	/**
	 * This object contains parameters relating to the user interface of the CPE.  Support for this object is Optional.
	 */
	@XmlElement(name = "UserInterface")
	public UserInterface userInterface;
	/**
	 * This object allows the handling of the routing and forwarding configuration of the device.
	 */
	@XmlElement(name = "Layer3Forwarding")
	public Layer3Forwarding layer3Forwarding;
	/**
	 * This object contains generic device configuration information.
	 */
	@XmlElement(name = "LANConfigSecurity")
	public LANConfigSecurity lanConfigSecurity;
	/**
	 * This object is provides access to an IP-layer ping test.
	 */
	@XmlElement(name = "IPPingDiagnostics")
	public IPPingDiagnostics ippingDiagnostics;
	/**
	 * Each instance contains all LAN-related objects for a given bridged subnet.
	 */
	@XmlElementWrapper(name = "LANDevices")
	@XmlElement(name = "LANDevice")
	public Collection<LANDevice> lanDevices;
	/**
	 * Each instance contains all objects associated with a particular physical WAN interface.
	 */
	@XmlElementWrapper(name = "WANDevices")
	@XmlElement(name = "WANDevice")
	public Collection<WANDevice> wanDevices;

	public InternetGatewayDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains general device information.
	 *
	 * @return the value
	 */
	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	/**
	 * Set the this object contains general device information.
	 *
	 * @param deviceInfo the input value
	 */
	public void  setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	/**
	 * Set the this object contains general device information.
	 *
	 * @param deviceInfo the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
		return this;
	}

	/**
	 * Get the this object contains general configuration parameters.
	 *
	 * @return the value
	 */
	public DeviceConfig getDeviceConfig() {
		return deviceConfig;
	}

	/**
	 * Set the this object contains general configuration parameters.
	 *
	 * @param deviceConfig the input value
	 */
	public void  setDeviceConfig(DeviceConfig deviceConfig) {
		this.deviceConfig = deviceConfig;
	}

	/**
	 * Set the this object contains general configuration parameters.
	 *
	 * @param deviceConfig the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withDeviceConfig(DeviceConfig deviceConfig) {
		this.deviceConfig = deviceConfig;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the CPE's association with an ACS.
	 *
	 * @return the value
	 */
	public ManagementServer getManagementServer() {
		return managementServer;
	}

	/**
	 * Set the this object contains parameters relating to the CPE's association with an ACS.
	 *
	 * @param managementServer the input value
	 */
	public void  setManagementServer(ManagementServer managementServer) {
		this.managementServer = managementServer;
	}

	/**
	 * Set the this object contains parameters relating to the CPE's association with an ACS.
	 *
	 * @param managementServer the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withManagementServer(ManagementServer managementServer) {
		this.managementServer = managementServer;
		return this;
	}

	/**
	 * Get the this object contains parameters relating an NTP or SNTP time client in the CPE.  Support for this object is Optional.
	 *
	 * @return the value
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * Set the this object contains parameters relating an NTP or SNTP time client in the CPE.  Support for this object is Optional.
	 *
	 * @param time the input value
	 */
	public void  setTime(Time time) {
		this.time = time;
	}

	/**
	 * Set the this object contains parameters relating an NTP or SNTP time client in the CPE.  Support for this object is Optional.
	 *
	 * @param time the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withTime(Time time) {
		this.time = time;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the user interface of the CPE.  Support for this object is Optional.
	 *
	 * @return the value
	 */
	public UserInterface getUserInterface() {
		return userInterface;
	}

	/**
	 * Set the this object contains parameters relating to the user interface of the CPE.  Support for this object is Optional.
	 *
	 * @param userInterface the input value
	 */
	public void  setUserInterface(UserInterface userInterface) {
		this.userInterface = userInterface;
	}

	/**
	 * Set the this object contains parameters relating to the user interface of the CPE.  Support for this object is Optional.
	 *
	 * @param userInterface the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withUserInterface(UserInterface userInterface) {
		this.userInterface = userInterface;
		return this;
	}

	/**
	 * Get the this object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @return the value
	 */
	public Layer3Forwarding getLayer3Forwarding() {
		return layer3Forwarding;
	}

	/**
	 * Set the this object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @param layer3Forwarding the input value
	 */
	public void  setLayer3Forwarding(Layer3Forwarding layer3Forwarding) {
		this.layer3Forwarding = layer3Forwarding;
	}

	/**
	 * Set the this object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @param layer3Forwarding the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withLayer3Forwarding(Layer3Forwarding layer3Forwarding) {
		this.layer3Forwarding = layer3Forwarding;
		return this;
	}

	/**
	 * Get the this object contains generic device configuration information.
	 *
	 * @return the value
	 */
	public LANConfigSecurity getLanConfigSecurity() {
		return lanConfigSecurity;
	}

	/**
	 * Set the this object contains generic device configuration information.
	 *
	 * @param lanConfigSecurity the input value
	 */
	public void  setLanConfigSecurity(LANConfigSecurity lanConfigSecurity) {
		this.lanConfigSecurity = lanConfigSecurity;
	}

	/**
	 * Set the this object contains generic device configuration information.
	 *
	 * @param lanConfigSecurity the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withLanConfigSecurity(LANConfigSecurity lanConfigSecurity) {
		this.lanConfigSecurity = lanConfigSecurity;
		return this;
	}

	/**
	 * Get the this object is provides access to an IP-layer ping test.
	 *
	 * @return the value
	 */
	public IPPingDiagnostics getIppingDiagnostics() {
		return ippingDiagnostics;
	}

	/**
	 * Set the this object is provides access to an IP-layer ping test.
	 *
	 * @param ippingDiagnostics the input value
	 */
	public void  setIppingDiagnostics(IPPingDiagnostics ippingDiagnostics) {
		this.ippingDiagnostics = ippingDiagnostics;
	}

	/**
	 * Set the this object is provides access to an IP-layer ping test.
	 *
	 * @param ippingDiagnostics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withIppingDiagnostics(IPPingDiagnostics ippingDiagnostics) {
		this.ippingDiagnostics = ippingDiagnostics;
		return this;
	}

	/**
	 * Get the each instance contains all LAN-related objects for a given bridged subnet.
	 *
	 * @return the value
	 */
	public Collection<LANDevice> getLanDevices() {
		if (this.lanDevices == null){ this.lanDevices=new ArrayList<>();}
		return lanDevices;
	}

	/**
	 * Set the each instance contains all LAN-related objects for a given bridged subnet.
	 *
	 * @param lanDevices the input value
	 */
	public void  setLanDevices(Collection<LANDevice> lanDevices) {
		this.lanDevices = lanDevices;
	}

	/**
	 * Set the each instance contains all LAN-related objects for a given bridged subnet.
	 *
	 * @param lanDevice the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withLANDevice(LANDevice lanDevice) {
		getLanDevices().add(lanDevice);
		return this;
	}

	/**
	 * Get the each instance contains all objects associated with a particular physical WAN interface.
	 *
	 * @return the value
	 */
	public Collection<WANDevice> getWanDevices() {
		if (this.wanDevices == null){ this.wanDevices=new ArrayList<>();}
		return wanDevices;
	}

	/**
	 * Set the each instance contains all objects associated with a particular physical WAN interface.
	 *
	 * @param wanDevices the input value
	 */
	public void  setWanDevices(Collection<WANDevice> wanDevices) {
		this.wanDevices = wanDevices;
	}

	/**
	 * Set the each instance contains all objects associated with a particular physical WAN interface.
	 *
	 * @param wanDevice the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withWANDevice(WANDevice wanDevice) {
		getWanDevices().add(wanDevice);
		return this;
	}

	//</editor-fold>

}