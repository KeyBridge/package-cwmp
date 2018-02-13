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
package org.broadbandforum.tr106;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr106.device.Capabilities;
import org.broadbandforum.tr106.device.Config;
import org.broadbandforum.tr106.device.DeviceInfo;
import org.broadbandforum.tr106.device.DownloadDiagnostics;
import org.broadbandforum.tr106.device.GatewayInfo;
import org.broadbandforum.tr106.device.LAN;
import org.broadbandforum.tr106.device.ManagementServer;
import org.broadbandforum.tr106.device.Services;
import org.broadbandforum.tr106.device.Time;
import org.broadbandforum.tr106.device.UDPEchoConfig;
import org.broadbandforum.tr106.device.UploadDiagnostics;
import org.broadbandforum.tr106.device.UserInterface;

	/**
	 * The top-level object for a Device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "Device.")
@XmlRootElement(name = "Device")
@XmlType(name = "Device")
@XmlAccessorType(XmlAccessType.FIELD)
public class Device {

	/**
	 * See {{bibref|TR-106|section 3.7}}.
	 *
	 * @since 1.0
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
	 * This object contains parameters relating to the CPE's association with an ACS.
	 */
	@XmlElement(name = "ManagementServer")
	public ManagementServer managementServer;
	/**
	 * This object contains information associated with a connected Internet Gateway Device.
	 */
	@XmlElement(name = "GatewayInfo")
	public GatewayInfo gatewayInfo;
	/**
	 * This object contains general configuration parameters.
	 */
	@XmlElement(name = "Config")
	public Config config;
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
	 * This object contains parameters relating to IP-based LAN connectivity of a device.

This object relates only to IP-layer LAN capabilities.  Lower-layer aspects of LAN connectivity are not considered part of the common data model defined in this specification.

For a device that contains multiple IP interfaces, the scope of this object is limited to the default IP interface.  Data that might be associated with other interfaces is not considered part of the common data model defined in this specification.
	 */
	@XmlElement(name = "LAN")
	public LAN lan;
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

	public Device() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the see {{bibref|TR-106|section 3.7}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDeviceSummary() {
		return deviceSummary;
	}

	/**
	 * Set the see {{bibref|TR-106|section 3.7}}.
	 *
	 * @since 1.0
	 * @param deviceSummary the input value
	 */
	public void  setDeviceSummary(String deviceSummary) {
		this.deviceSummary = deviceSummary;
	}

	/**
	 * Set the see {{bibref|TR-106|section 3.7}}.
	 *
	 * @since 1.0
	 * @param deviceSummary the input value
	 * @return this instance
	 */
	public Device withDeviceSummary(String deviceSummary) {
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
	public Device withServices(Services services) {
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
	public Device withCapabilities(Capabilities capabilities) {
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
	public Device withDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
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
	public Device withManagementServer(ManagementServer managementServer) {
		this.managementServer = managementServer;
		return this;
	}

	/**
	 * Get the this object contains information associated with a connected Internet Gateway Device.
	 *
	 * @return the value
	 */
	public GatewayInfo getGatewayInfo() {
		return gatewayInfo;
	}

	/**
	 * Set the this object contains information associated with a connected Internet Gateway Device.
	 *
	 * @param gatewayInfo the input value
	 */
	public void  setGatewayInfo(GatewayInfo gatewayInfo) {
		this.gatewayInfo = gatewayInfo;
	}

	/**
	 * Set the this object contains information associated with a connected Internet Gateway Device.
	 *
	 * @param gatewayInfo the input value
	 * @return this instance
	 */
	public Device withGatewayInfo(GatewayInfo gatewayInfo) {
		this.gatewayInfo = gatewayInfo;
		return this;
	}

	/**
	 * Get the this object contains general configuration parameters.
	 *
	 * @return the value
	 */
	public Config getConfig() {
		return config;
	}

	/**
	 * Set the this object contains general configuration parameters.
	 *
	 * @param config the input value
	 */
	public void  setConfig(Config config) {
		this.config = config;
	}

	/**
	 * Set the this object contains general configuration parameters.
	 *
	 * @param config the input value
	 * @return this instance
	 */
	public Device withConfig(Config config) {
		this.config = config;
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
	public Device withTime(Time time) {
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
	public Device withUserInterface(UserInterface userInterface) {
		this.userInterface = userInterface;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to IP-based LAN connectivity of a device.

This object relates only to IP-layer LAN capabilities.  Lower-layer aspects of LAN connectivity are not considered part of the common data model defined in this specification.

For a device that contains multiple IP interfaces, the scope of this object is limited to the default IP interface.  Data that might be associated with other interfaces is not considered part of the common data model defined in this specification.
	 *
	 * @return the value
	 */
	public LAN getLan() {
		return lan;
	}

	/**
	 * Set the this object contains parameters relating to IP-based LAN connectivity of a device.

This object relates only to IP-layer LAN capabilities.  Lower-layer aspects of LAN connectivity are not considered part of the common data model defined in this specification.

For a device that contains multiple IP interfaces, the scope of this object is limited to the default IP interface.  Data that might be associated with other interfaces is not considered part of the common data model defined in this specification.
	 *
	 * @param lan the input value
	 */
	public void  setLan(LAN lan) {
		this.lan = lan;
	}

	/**
	 * Set the this object contains parameters relating to IP-based LAN connectivity of a device.

This object relates only to IP-layer LAN capabilities.  Lower-layer aspects of LAN connectivity are not considered part of the common data model defined in this specification.

For a device that contains multiple IP interfaces, the scope of this object is limited to the default IP interface.  Data that might be associated with other interfaces is not considered part of the common data model defined in this specification.
	 *
	 * @param lan the input value
	 * @return this instance
	 */
	public Device withLan(LAN lan) {
		this.lan = lan;
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
	public Device withDownloadDiagnostics(DownloadDiagnostics downloadDiagnostics) {
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
	public Device withUploadDiagnostics(UploadDiagnostics uploadDiagnostics) {
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
	public Device withUdpEchoConfig(UDPEchoConfig udpEchoConfig) {
		this.udpEchoConfig = udpEchoConfig;
		return this;
	}

	//</editor-fold>

}