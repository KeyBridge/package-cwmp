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
package org.broadbandforum.tr143;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.internetgatewaydevice.Capabilities;
import org.broadbandforum.tr143.internetgatewaydevice.DeviceConfig;
import org.broadbandforum.tr143.internetgatewaydevice.DeviceInfo;
import org.broadbandforum.tr143.internetgatewaydevice.DownloadDiagnostics;
import org.broadbandforum.tr143.internetgatewaydevice.IPPingDiagnostics;
import org.broadbandforum.tr143.internetgatewaydevice.LANConfigSecurity;
import org.broadbandforum.tr143.internetgatewaydevice.LANDevice;
import org.broadbandforum.tr143.internetgatewaydevice.Layer2Bridging;
import org.broadbandforum.tr143.internetgatewaydevice.Layer3Forwarding;
import org.broadbandforum.tr143.internetgatewaydevice.ManagementServer;
import org.broadbandforum.tr143.internetgatewaydevice.QueueManagement;
import org.broadbandforum.tr143.internetgatewaydevice.Services;
import org.broadbandforum.tr143.internetgatewaydevice.Time;
import org.broadbandforum.tr143.internetgatewaydevice.UDPEchoConfig;
import org.broadbandforum.tr143.internetgatewaydevice.UploadDiagnostics;
import org.broadbandforum.tr143.internetgatewaydevice.UserInterface;
import org.broadbandforum.tr143.internetgatewaydevice.WANDevice;

	/**
	 * The top-level object for an Internet Gateway Device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.")
public class InternetGatewayDevice {

	/**
	 * As defined in {{bibref|TR-106}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DeviceSummary")
	@CWMPParameter(forcedInform = true)
	@Size(max = 1024)
	public String deviceSummary;
	/**
	 * This object contains general services information.
	 */
	@XmlElement(name = "Services")
	public Services services;
	/**
	 * The capabilities of the device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;
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
	 * This object contains parameters relating an NTP or SNTP time client in the CPE.
	 */
	@XmlElement(name = "Time")
	public Time time;
	/**
	 * This object contains parameters relating to the user interface of the CPE.
	 */
	@XmlElement(name = "UserInterface")
	public UserInterface userInterface;
	/**
	 * This object allows the handling of the routing and forwarding configuration of the device.
	 */
	@XmlElement(name = "Layer3Forwarding")
	public Layer3Forwarding layer3Forwarding;
	/**
	 * Layer-2 bridging table.  Specifies bridges between layer-2 LAN and/or WAN interfaces.  Bridges can be defined to include layer-2 filter criteria to selectively bridge traffic between interfaces.
	 */
	@XmlElement(name = "Layer2Bridging")
	public Layer2Bridging layer2Bridging;
	/**
	 * Queue management configuration object.
	 */
	@XmlElement(name = "QueueManagement")
	public QueueManagement queueManagement;
	/**
	 * This object contains generic device configuration information.
	 */
	@XmlElement(name = "LANConfigSecurity")
	public LANConfigSecurity lanConfigSecurity;
	/**
	 * This object provides access to an IP-layer ping test.
	 */
	@XmlElement(name = "IPPingDiagnostics")
	public IPPingDiagnostics ippingDiagnostics;
	/**
	 * This object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 */
	@XmlElement(name = "DownloadDiagnostics")
	public DownloadDiagnostics downloadDiagnostics;
	/**
	 * This object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 */
	@XmlElement(name = "UploadDiagnostics")
	public UploadDiagnostics uploadDiagnostics;
	/**
	 * This object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 */
	@XmlElement(name = "UDPEchoConfig")
	public UDPEchoConfig udpEchoConfig;
	/**
	 * Each instance contains all LAN-related objects for a given bridged subnet.
	 */
	@XmlElementWrapper(name = "lanDevices")
	@XmlElement(name = "LANDevice")
	public Collection<LANDevice> lanDevices;
	/**
	 * Each instance contains all objects associated with a particular physical WAN interface.
	 */
	@XmlElementWrapper(name = "wanDevices")
	@XmlElement(name = "WANDevice")
	public Collection<WANDevice> wanDevices;

	public InternetGatewayDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get as defined in {{bibref|TR-106}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDeviceSummary() {
		return deviceSummary;
	}

	/**
	 * Set as defined in {{bibref|TR-106}}.
	 *
	 * @since 1.1
	 * @param deviceSummary the input value
	 */
	public void  setDeviceSummary(String deviceSummary) {
		this.deviceSummary = deviceSummary;
	}

	/**
	 * Set as defined in {{bibref|TR-106}}.
	 *
	 * @since 1.1
	 * @param deviceSummary the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withDeviceSummary(String deviceSummary) {
		this.deviceSummary = deviceSummary;
		return this;
	}

	/**
	 * Get the this object contains general services information.
	 *
	 * @return the value
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * Set the this object contains general services information.
	 *
	 * @param services the input value
	 */
	public void  setServices(Services services) {
		this.services = services;
	}

	/**
	 * Set the this object contains general services information.
	 *
	 * @param services the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withServices(Services services) {
		this.services = services;
		return this;
	}

	/**
	 * Get the capabilities of the device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the capabilities of the device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the capabilities of the device.  This is a constant read-only object, meaning that only a firmware upgrade will cause these values to be altered.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

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
	 * Get the this object contains parameters relating an NTP or SNTP time client in the CPE.
	 *
	 * @return the value
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * Set the this object contains parameters relating an NTP or SNTP time client in the CPE.
	 *
	 * @param time the input value
	 */
	public void  setTime(Time time) {
		this.time = time;
	}

	/**
	 * Set the this object contains parameters relating an NTP or SNTP time client in the CPE.
	 *
	 * @param time the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withTime(Time time) {
		this.time = time;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the user interface of the CPE.
	 *
	 * @return the value
	 */
	public UserInterface getUserInterface() {
		return userInterface;
	}

	/**
	 * Set the this object contains parameters relating to the user interface of the CPE.
	 *
	 * @param userInterface the input value
	 */
	public void  setUserInterface(UserInterface userInterface) {
		this.userInterface = userInterface;
	}

	/**
	 * Set the this object contains parameters relating to the user interface of the CPE.
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
	 * Get the layer-2 bridging table.  Specifies bridges between layer-2 LAN and/or WAN interfaces.  Bridges can be defined to include layer-2 filter criteria to selectively bridge traffic between interfaces.
	 *
	 * @return the value
	 */
	public Layer2Bridging getLayer2Bridging() {
		return layer2Bridging;
	}

	/**
	 * Set the layer-2 bridging table.  Specifies bridges between layer-2 LAN and/or WAN interfaces.  Bridges can be defined to include layer-2 filter criteria to selectively bridge traffic between interfaces.
	 *
	 * @param layer2Bridging the input value
	 */
	public void  setLayer2Bridging(Layer2Bridging layer2Bridging) {
		this.layer2Bridging = layer2Bridging;
	}

	/**
	 * Set the layer-2 bridging table.  Specifies bridges between layer-2 LAN and/or WAN interfaces.  Bridges can be defined to include layer-2 filter criteria to selectively bridge traffic between interfaces.
	 *
	 * @param layer2Bridging the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withLayer2Bridging(Layer2Bridging layer2Bridging) {
		this.layer2Bridging = layer2Bridging;
		return this;
	}

	/**
	 * Get the queue management configuration object.
	 *
	 * @return the value
	 */
	public QueueManagement getQueueManagement() {
		return queueManagement;
	}

	/**
	 * Set the queue management configuration object.
	 *
	 * @param queueManagement the input value
	 */
	public void  setQueueManagement(QueueManagement queueManagement) {
		this.queueManagement = queueManagement;
	}

	/**
	 * Set the queue management configuration object.
	 *
	 * @param queueManagement the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withQueueManagement(QueueManagement queueManagement) {
		this.queueManagement = queueManagement;
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
	 * Get the this object provides access to an IP-layer ping test.
	 *
	 * @return the value
	 */
	public IPPingDiagnostics getIppingDiagnostics() {
		return ippingDiagnostics;
	}

	/**
	 * Set the this object provides access to an IP-layer ping test.
	 *
	 * @param ippingDiagnostics the input value
	 */
	public void  setIppingDiagnostics(IPPingDiagnostics ippingDiagnostics) {
		this.ippingDiagnostics = ippingDiagnostics;
	}

	/**
	 * Set the this object provides access to an IP-layer ping test.
	 *
	 * @param ippingDiagnostics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withIppingDiagnostics(IPPingDiagnostics ippingDiagnostics) {
		this.ippingDiagnostics = ippingDiagnostics;
		return this;
	}

	/**
	 * Get the this object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 *
	 * @return the value
	 */
	public DownloadDiagnostics getDownloadDiagnostics() {
		return downloadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 *
	 * @param downloadDiagnostics the input value
	 */
	public void  setDownloadDiagnostics(DownloadDiagnostics downloadDiagnostics) {
		this.downloadDiagnostics = downloadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 *
	 * @param downloadDiagnostics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withDownloadDiagnostics(DownloadDiagnostics downloadDiagnostics) {
		this.downloadDiagnostics = downloadDiagnostics;
		return this;
	}

	/**
	 * Get the this object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 *
	 * @return the value
	 */
	public UploadDiagnostics getUploadDiagnostics() {
		return uploadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 *
	 * @param uploadDiagnostics the input value
	 */
	public void  setUploadDiagnostics(UploadDiagnostics uploadDiagnostics) {
		this.uploadDiagnostics = uploadDiagnostics;
	}

	/**
	 * Set the this object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 *
	 * @param uploadDiagnostics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withUploadDiagnostics(UploadDiagnostics uploadDiagnostics) {
		this.uploadDiagnostics = uploadDiagnostics;
		return this;
	}

	/**
	 * Get the this object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 *
	 * @return the value
	 */
	public UDPEchoConfig getUdpEchoConfig() {
		return udpEchoConfig;
	}

	/**
	 * Set the this object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 *
	 * @param udpEchoConfig the input value
	 */
	public void  setUdpEchoConfig(UDPEchoConfig udpEchoConfig) {
		this.udpEchoConfig = udpEchoConfig;
	}

	/**
	 * Set the this object allows the CPE to be configured to perform the UDP Echo Service defined in {{bibref|RFC862}} and UDP Echo Plus Service defined in {{bibref|TR-143|Appendix A.1}}.
	 *
	 * @param udpEchoConfig the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withUdpEchoConfig(UDPEchoConfig udpEchoConfig) {
		this.udpEchoConfig = udpEchoConfig;
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