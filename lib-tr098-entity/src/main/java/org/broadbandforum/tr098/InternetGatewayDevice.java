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
package org.broadbandforum.tr098;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.BulkData;
import org.broadbandforum.tr098.internetgatewaydevice.Capabilities;
import org.broadbandforum.tr098.internetgatewaydevice.CaptivePortal;
import org.broadbandforum.tr098.internetgatewaydevice.DLNA;
import org.broadbandforum.tr098.internetgatewaydevice.DNS;
import org.broadbandforum.tr098.internetgatewaydevice.DeviceConfig;
import org.broadbandforum.tr098.internetgatewaydevice.DeviceInfo;
import org.broadbandforum.tr098.internetgatewaydevice.DownloadAvailability;
import org.broadbandforum.tr098.internetgatewaydevice.DownloadDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.FAP;
import org.broadbandforum.tr098.internetgatewaydevice.FaultMgmt;
import org.broadbandforum.tr098.internetgatewaydevice.Firewall;
import org.broadbandforum.tr098.internetgatewaydevice.IPPingDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.LANConfigSecurity;
import org.broadbandforum.tr098.internetgatewaydevice.LANDevice;
import org.broadbandforum.tr098.internetgatewaydevice.LANInterfaces;
import org.broadbandforum.tr098.internetgatewaydevice.Layer2Bridging;
import org.broadbandforum.tr098.internetgatewaydevice.Layer3Forwarding;
import org.broadbandforum.tr098.internetgatewaydevice.ManagementServer;
import org.broadbandforum.tr098.internetgatewaydevice.NSLookupDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.PeriodicStatistics;
import org.broadbandforum.tr098.internetgatewaydevice.QueueManagement;
import org.broadbandforum.tr098.internetgatewaydevice.Security;
import org.broadbandforum.tr098.internetgatewaydevice.SelfTestDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.Services;
import org.broadbandforum.tr098.internetgatewaydevice.SmartCardReader;
import org.broadbandforum.tr098.internetgatewaydevice.SoftwareModules;
import org.broadbandforum.tr098.internetgatewaydevice.Time;
import org.broadbandforum.tr098.internetgatewaydevice.TraceRouteDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.UDPEchoConfig;
import org.broadbandforum.tr098.internetgatewaydevice.UPnP;
import org.broadbandforum.tr098.internetgatewaydevice.USBHosts;
import org.broadbandforum.tr098.internetgatewaydevice.UploadDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.User;
import org.broadbandforum.tr098.internetgatewaydevice.UserInterface;
import org.broadbandforum.tr098.internetgatewaydevice.WANDevice;
import org.broadbandforum.tr098.internetgatewaydevice.XMPP;

	/**
	 * The top-level object for an Internet Gateway Device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.")
public class InternetGatewayDevice {

	/**
	 * As defined in {{bibref|TR-106a1}}.

This parameter is DEPRECATED because {{object|DeviceInfo.SupportedDataModel}} and associated Device Type XML documents (DT Instances) provide a more granular and scalable way of describing the device's data model.

Therefore its value MAY be {{empty}} if (and only if) {{object|DeviceInfo.SupportedDataModel}} is supported.
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
	 * This object contains parameters relating to the captive portal configuration on the CPE.

The captive portal configuration defines the CPE's WAN-destined  HTTP (port 80) traffic redirect behavior.

When the captive portal is disabled, WAN-destined HTTP (port 80) traffic MUST be permitted to all destinations.

When the captive portal is enabled, WAN-destined HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|CaptivePortalURL}}.
	 */
	@XmlElement(name = "CaptivePortal")
	public CaptivePortal captivePortal;
	/**
	 * This object allows the handling of the routing and forwarding configuration of the device.
	 */
	@XmlElement(name = "Layer3Forwarding")
	public Layer3Forwarding layer3Forwarding;
	/**
	 * Layer 2 bridging configuration.  Specifies bridges between layer 2 LAN and/or WAN interfaces.  Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} bridges.  Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled. 

If the Layer2Bridging object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any LANDevice and WAN**Connection objects.  The implications of this are explained in Annex A.6.
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
	 * This object is defines access to an IP-layer trace-route test for the specified IP interface.
	 */
	@XmlElement(name = "TraceRouteDiagnostics")
	public TraceRouteDiagnostics traceRouteDiagnostics;
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
	 * Each instance models a LAN side layer 3 IP interface.

Each instance has children that correspond to the layer 2 interfaces that are connected to the Gateway's IP router via the modeled IP interface.  If a LANDevice instance is deleted, the objects modeling those layer 2 interfaces that are as a result no longer connected to the Gateway's IP router will move to the InternetGatewayDevice.LANInterfaces object.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 */
	@XmlElementWrapper(name = "lanDevices")
	@XmlElement(name = "LANDevice")
	@CWMPParameter(access = "readWrite")
	public Collection<LANDevice> lanDevices;
	/**
	 * This object contains LAN-side layer 1/2 interfaces that are not currently connected to the Gateway's IP router and which therefore do not currently reside within a ''LANDevice'' instance.
	 */
	@XmlElement(name = "LANInterfaces")
	public LANInterfaces lanInterfaces;
	/**
	 * Each instance contains all objects associated with a particular physical WAN interface.
	 */
	@XmlElementWrapper(name = "wanDevices")
	@XmlElement(name = "WANDevice")
	public Collection<WANDevice> wanDevices;
	/**
	 * This object contains parameters relating to the user characteristics.
	 */
	@XmlElementWrapper(name = "users")
	@XmlElement(name = "User")
	@CWMPParameter(access = "readWrite")
	public Collection<User> users;
	/**
	 * This object contains all UPnP related objects and parameters including Device and Discovery related objects and parameters.
	 */
	@XmlElement(name = "UPnP")
	public UPnP upnP;
	/**
	 * This object contains all DLNA related objects and parameters.
	 */
	@XmlElement(name = "DLNA")
	public DLNA dlnA;
	/**
	 * This object describes the characteristics of the smart card reader.
	 */
	@XmlElementWrapper(name = "smartCardReaders")
	@XmlElement(name = "SmartCardReader")
	public Collection<SmartCardReader> smartCardReaders;
	/**
	 * This diagnostics test is vendor-specific and MAY include testing hardware, software, and/or firmware.
	 */
	@XmlElement(name = "SelfTestDiagnostics")
	public SelfTestDiagnostics selfTestDiagnostics;
	/**
	 * This object defines access to an IP-layer NS Lookup test for the specified IP interface.

When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

Any previous {{object|Result}} instances are removed when a new test is initiated.
	 */
	@XmlElement(name = "NSLookupDiagnostics")
	public NSLookupDiagnostics nslookupDiagnostics;
	/**
	 * Firewall configuration object.
	 */
	@XmlElement(name = "Firewall")
	public Firewall firewall;
	/**
	 * This object models the CPE's USB Host controllers.

See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 */
	@XmlElement(name = "USBHosts")
	public USBHosts usbHosts;
	/**
	 * This object configures collection of periodic statistics for the device.

Periodic statistics are measured over a sample interval (which can be aligned with absolute time) and are made available to the ACS as a comma-separated list of the most recent <n> samples.

This object provides a single set of global settings that affect the entire device unless overridden locally.
	 */
	@XmlElement(name = "PeriodicStatistics")
	public PeriodicStatistics periodicStatistics;
	/**
	 * This object contains multicast announcement and query parameters used for the purpose of downloading files.
	 */
	@XmlElement(name = "DownloadAvailability")
	public DownloadAvailability downloadAvailability;
	/**
	 * Top level object for dynamically managed software applications.
	 */
	@XmlElement(name = "SoftwareModules")
	public SoftwareModules softwareModules;
	/**
	 * This object contains general information related to managing security features on the device.
	 */
	@XmlElement(name = "Security")
	public Security security;
	/**
	 * This object contains parameters relating to Fault/Alarm Management.
	 */
	@XmlElement(name = "FaultMgmt")
	public FaultMgmt faultMgmt;
	/**
	 * This object is the container for all Femto related component objects, to prevent pollution of the so-called global namespace of the BBF with FAP specific objects.
	 */
	@XmlElement(name = "FAP")
	public FAP fap;
	/**
	 * Bulk Data collection utilizes the IPDR solution to collect data from devices based on a service specification described in {{bibref|TR-232}}.

Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.

This object provides bulk data collection capabilities and global collection settings that affect the entire device.
	 */
	@XmlElement(name = "BulkData")
	public BulkData bulkData;
	/**
	 * Properties for Domain Name Service (DNS). It contains the Service Discovery (DNS-SD) objects.
	 */
	@XmlElement(name = "DNS")
	public DNS dns;
	/**
	 * The {{object}} represents the XMPP capabilities of the device as described in {{bibref|TR-069a5|Appendix III}}.
	 */
	@XmlElement(name = "XMPP")
	public XMPP xmpP;

	public InternetGatewayDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get as defined in {{bibref|TR-106a1}}.

This parameter is DEPRECATED because {{object|DeviceInfo.SupportedDataModel}} and associated Device Type XML documents (DT Instances) provide a more granular and scalable way of describing the device's data model.

Therefore its value MAY be {{empty}} if (and only if) {{object|DeviceInfo.SupportedDataModel}} is supported.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDeviceSummary() {
		return deviceSummary;
	}

	/**
	 * Set as defined in {{bibref|TR-106a1}}.

This parameter is DEPRECATED because {{object|DeviceInfo.SupportedDataModel}} and associated Device Type XML documents (DT Instances) provide a more granular and scalable way of describing the device's data model.

Therefore its value MAY be {{empty}} if (and only if) {{object|DeviceInfo.SupportedDataModel}} is supported.
	 *
	 * @since 1.1
	 * @param deviceSummary the input value
	 */
	public void  setDeviceSummary(String deviceSummary) {
		this.deviceSummary = deviceSummary;
	}

	/**
	 * Set as defined in {{bibref|TR-106a1}}.

This parameter is DEPRECATED because {{object|DeviceInfo.SupportedDataModel}} and associated Device Type XML documents (DT Instances) provide a more granular and scalable way of describing the device's data model.

Therefore its value MAY be {{empty}} if (and only if) {{object|DeviceInfo.SupportedDataModel}} is supported.
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
	 * Get the this object contains parameters relating to the captive portal configuration on the CPE.

The captive portal configuration defines the CPE's WAN-destined  HTTP (port 80) traffic redirect behavior.

When the captive portal is disabled, WAN-destined HTTP (port 80) traffic MUST be permitted to all destinations.

When the captive portal is enabled, WAN-destined HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|CaptivePortalURL}}.
	 *
	 * @return the value
	 */
	public CaptivePortal getCaptivePortal() {
		return captivePortal;
	}

	/**
	 * Set the this object contains parameters relating to the captive portal configuration on the CPE.

The captive portal configuration defines the CPE's WAN-destined  HTTP (port 80) traffic redirect behavior.

When the captive portal is disabled, WAN-destined HTTP (port 80) traffic MUST be permitted to all destinations.

When the captive portal is enabled, WAN-destined HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|CaptivePortalURL}}.
	 *
	 * @param captivePortal the input value
	 */
	public void  setCaptivePortal(CaptivePortal captivePortal) {
		this.captivePortal = captivePortal;
	}

	/**
	 * Set the this object contains parameters relating to the captive portal configuration on the CPE.

The captive portal configuration defines the CPE's WAN-destined  HTTP (port 80) traffic redirect behavior.

When the captive portal is disabled, WAN-destined HTTP (port 80) traffic MUST be permitted to all destinations.

When the captive portal is enabled, WAN-destined HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|CaptivePortalURL}}.
	 *
	 * @param captivePortal the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withCaptivePortal(CaptivePortal captivePortal) {
		this.captivePortal = captivePortal;
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
	 * Get the layer 2 bridging configuration.  Specifies bridges between layer 2 LAN and/or WAN interfaces.  Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} bridges.  Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled. 

If the Layer2Bridging object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any LANDevice and WAN**Connection objects.  The implications of this are explained in Annex A.6.
	 *
	 * @return the value
	 */
	public Layer2Bridging getLayer2Bridging() {
		return layer2Bridging;
	}

	/**
	 * Set the layer 2 bridging configuration.  Specifies bridges between layer 2 LAN and/or WAN interfaces.  Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} bridges.  Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled. 

If the Layer2Bridging object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any LANDevice and WAN**Connection objects.  The implications of this are explained in Annex A.6.
	 *
	 * @param layer2Bridging the input value
	 */
	public void  setLayer2Bridging(Layer2Bridging layer2Bridging) {
		this.layer2Bridging = layer2Bridging;
	}

	/**
	 * Set the layer 2 bridging configuration.  Specifies bridges between layer 2 LAN and/or WAN interfaces.  Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} bridges.  Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled. 

If the Layer2Bridging object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any LANDevice and WAN**Connection objects.  The implications of this are explained in Annex A.6.
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
	 * Get the this object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @return the value
	 */
	public TraceRouteDiagnostics getTraceRouteDiagnostics() {
		return traceRouteDiagnostics;
	}

	/**
	 * Set the this object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @param traceRouteDiagnostics the input value
	 */
	public void  setTraceRouteDiagnostics(TraceRouteDiagnostics traceRouteDiagnostics) {
		this.traceRouteDiagnostics = traceRouteDiagnostics;
	}

	/**
	 * Set the this object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @param traceRouteDiagnostics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withTraceRouteDiagnostics(TraceRouteDiagnostics traceRouteDiagnostics) {
		this.traceRouteDiagnostics = traceRouteDiagnostics;
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
	 * Get the each instance models a LAN side layer 3 IP interface.

Each instance has children that correspond to the layer 2 interfaces that are connected to the Gateway's IP router via the modeled IP interface.  If a LANDevice instance is deleted, the objects modeling those layer 2 interfaces that are as a result no longer connected to the Gateway's IP router will move to the InternetGatewayDevice.LANInterfaces object.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @return the value
	 */
	public Collection<LANDevice> getLanDevices() {
		if (this.lanDevices == null){ this.lanDevices=new ArrayList<>();}
		return lanDevices;
	}

	/**
	 * Set the each instance models a LAN side layer 3 IP interface.

Each instance has children that correspond to the layer 2 interfaces that are connected to the Gateway's IP router via the modeled IP interface.  If a LANDevice instance is deleted, the objects modeling those layer 2 interfaces that are as a result no longer connected to the Gateway's IP router will move to the InternetGatewayDevice.LANInterfaces object.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @param lanDevices the input value
	 */
	public void  setLanDevices(Collection<LANDevice> lanDevices) {
		this.lanDevices = lanDevices;
	}

	/**
	 * Set the each instance models a LAN side layer 3 IP interface.

Each instance has children that correspond to the layer 2 interfaces that are connected to the Gateway's IP router via the modeled IP interface.  If a LANDevice instance is deleted, the objects modeling those layer 2 interfaces that are as a result no longer connected to the Gateway's IP router will move to the InternetGatewayDevice.LANInterfaces object.

If the ''Layer2Bridging'' object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any ''LANDevice'' and ''WAN**Connection'' objects.  The implications of this are explained in {{bibref|TR-098a2|Annex A.6}}.
	 *
	 * @param lanDevice the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withLANDevice(LANDevice lanDevice) {
		getLanDevices().add(lanDevice);
		return this;
	}

	/**
	 * Get the this object contains LAN-side layer 1/2 interfaces that are not currently connected to the Gateway's IP router and which therefore do not currently reside within a ''LANDevice'' instance.
	 *
	 * @return the value
	 */
	public LANInterfaces getLanInterfaces() {
		return lanInterfaces;
	}

	/**
	 * Set the this object contains LAN-side layer 1/2 interfaces that are not currently connected to the Gateway's IP router and which therefore do not currently reside within a ''LANDevice'' instance.
	 *
	 * @param lanInterfaces the input value
	 */
	public void  setLanInterfaces(LANInterfaces lanInterfaces) {
		this.lanInterfaces = lanInterfaces;
	}

	/**
	 * Set the this object contains LAN-side layer 1/2 interfaces that are not currently connected to the Gateway's IP router and which therefore do not currently reside within a ''LANDevice'' instance.
	 *
	 * @param lanInterfaces the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withLanInterfaces(LANInterfaces lanInterfaces) {
		this.lanInterfaces = lanInterfaces;
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

	/**
	 * Get the this object contains parameters relating to the user characteristics.
	 *
	 * @return the value
	 */
	public Collection<User> getUsers() {
		if (this.users == null){ this.users=new ArrayList<>();}
		return users;
	}

	/**
	 * Set the this object contains parameters relating to the user characteristics.
	 *
	 * @param users the input value
	 */
	public void  setUsers(Collection<User> users) {
		this.users = users;
	}

	/**
	 * Set the this object contains parameters relating to the user characteristics.
	 *
	 * @param user the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withUser(User user) {
		getUsers().add(user);
		return this;
	}

	/**
	 * Get the this object contains all UPnP related objects and parameters including Device and Discovery related objects and parameters.
	 *
	 * @return the value
	 */
	public UPnP getUpnP() {
		return upnP;
	}

	/**
	 * Set the this object contains all UPnP related objects and parameters including Device and Discovery related objects and parameters.
	 *
	 * @param upnP the input value
	 */
	public void  setUpnP(UPnP upnP) {
		this.upnP = upnP;
	}

	/**
	 * Set the this object contains all UPnP related objects and parameters including Device and Discovery related objects and parameters.
	 *
	 * @param upnP the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withUpnP(UPnP upnP) {
		this.upnP = upnP;
		return this;
	}

	/**
	 * Get the this object contains all DLNA related objects and parameters.
	 *
	 * @return the value
	 */
	public DLNA getDlnA() {
		return dlnA;
	}

	/**
	 * Set the this object contains all DLNA related objects and parameters.
	 *
	 * @param dlnA the input value
	 */
	public void  setDlnA(DLNA dlnA) {
		this.dlnA = dlnA;
	}

	/**
	 * Set the this object contains all DLNA related objects and parameters.
	 *
	 * @param dlnA the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withDlnA(DLNA dlnA) {
		this.dlnA = dlnA;
		return this;
	}

	/**
	 * Get the this object describes the characteristics of the smart card reader.
	 *
	 * @return the value
	 */
	public Collection<SmartCardReader> getSmartCardReaders() {
		if (this.smartCardReaders == null){ this.smartCardReaders=new ArrayList<>();}
		return smartCardReaders;
	}

	/**
	 * Set the this object describes the characteristics of the smart card reader.
	 *
	 * @param smartCardReaders the input value
	 */
	public void  setSmartCardReaders(Collection<SmartCardReader> smartCardReaders) {
		this.smartCardReaders = smartCardReaders;
	}

	/**
	 * Set the this object describes the characteristics of the smart card reader.
	 *
	 * @param smartCardReader the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withSmartCardReader(SmartCardReader smartCardReader) {
		getSmartCardReaders().add(smartCardReader);
		return this;
	}

	/**
	 * Get the this diagnostics test is vendor-specific and MAY include testing hardware, software, and/or firmware.
	 *
	 * @return the value
	 */
	public SelfTestDiagnostics getSelfTestDiagnostics() {
		return selfTestDiagnostics;
	}

	/**
	 * Set the this diagnostics test is vendor-specific and MAY include testing hardware, software, and/or firmware.
	 *
	 * @param selfTestDiagnostics the input value
	 */
	public void  setSelfTestDiagnostics(SelfTestDiagnostics selfTestDiagnostics) {
		this.selfTestDiagnostics = selfTestDiagnostics;
	}

	/**
	 * Set the this diagnostics test is vendor-specific and MAY include testing hardware, software, and/or firmware.
	 *
	 * @param selfTestDiagnostics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withSelfTestDiagnostics(SelfTestDiagnostics selfTestDiagnostics) {
		this.selfTestDiagnostics = selfTestDiagnostics;
		return this;
	}

	/**
	 * Get the this object defines access to an IP-layer NS Lookup test for the specified IP interface.

When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

Any previous {{object|Result}} instances are removed when a new test is initiated.
	 *
	 * @return the value
	 */
	public NSLookupDiagnostics getNslookupDiagnostics() {
		return nslookupDiagnostics;
	}

	/**
	 * Set the this object defines access to an IP-layer NS Lookup test for the specified IP interface.

When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

Any previous {{object|Result}} instances are removed when a new test is initiated.
	 *
	 * @param nslookupDiagnostics the input value
	 */
	public void  setNslookupDiagnostics(NSLookupDiagnostics nslookupDiagnostics) {
		this.nslookupDiagnostics = nslookupDiagnostics;
	}

	/**
	 * Set the this object defines access to an IP-layer NS Lookup test for the specified IP interface.

When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

Any previous {{object|Result}} instances are removed when a new test is initiated.
	 *
	 * @param nslookupDiagnostics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withNslookupDiagnostics(NSLookupDiagnostics nslookupDiagnostics) {
		this.nslookupDiagnostics = nslookupDiagnostics;
		return this;
	}

	/**
	 * Get the firewall configuration object.
	 *
	 * @return the value
	 */
	public Firewall getFirewall() {
		return firewall;
	}

	/**
	 * Set the firewall configuration object.
	 *
	 * @param firewall the input value
	 */
	public void  setFirewall(Firewall firewall) {
		this.firewall = firewall;
	}

	/**
	 * Set the firewall configuration object.
	 *
	 * @param firewall the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withFirewall(Firewall firewall) {
		this.firewall = firewall;
		return this;
	}

	/**
	 * Get the this object models the CPE's USB Host controllers.

See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 *
	 * @return the value
	 */
	public USBHosts getUsbHosts() {
		return usbHosts;
	}

	/**
	 * Set the this object models the CPE's USB Host controllers.

See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 *
	 * @param usbHosts the input value
	 */
	public void  setUsbHosts(USBHosts usbHosts) {
		this.usbHosts = usbHosts;
	}

	/**
	 * Set the this object models the CPE's USB Host controllers.

See {{bibref|TR-157|Appendix I}} for Theory of Operation.
	 *
	 * @param usbHosts the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withUsbHosts(USBHosts usbHosts) {
		this.usbHosts = usbHosts;
		return this;
	}

	/**
	 * Get the this object configures collection of periodic statistics for the device.

Periodic statistics are measured over a sample interval (which can be aligned with absolute time) and are made available to the ACS as a comma-separated list of the most recent <n> samples.

This object provides a single set of global settings that affect the entire device unless overridden locally.
	 *
	 * @return the value
	 */
	public PeriodicStatistics getPeriodicStatistics() {
		return periodicStatistics;
	}

	/**
	 * Set the this object configures collection of periodic statistics for the device.

Periodic statistics are measured over a sample interval (which can be aligned with absolute time) and are made available to the ACS as a comma-separated list of the most recent <n> samples.

This object provides a single set of global settings that affect the entire device unless overridden locally.
	 *
	 * @param periodicStatistics the input value
	 */
	public void  setPeriodicStatistics(PeriodicStatistics periodicStatistics) {
		this.periodicStatistics = periodicStatistics;
	}

	/**
	 * Set the this object configures collection of periodic statistics for the device.

Periodic statistics are measured over a sample interval (which can be aligned with absolute time) and are made available to the ACS as a comma-separated list of the most recent <n> samples.

This object provides a single set of global settings that affect the entire device unless overridden locally.
	 *
	 * @param periodicStatistics the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withPeriodicStatistics(PeriodicStatistics periodicStatistics) {
		this.periodicStatistics = periodicStatistics;
		return this;
	}

	/**
	 * Get the this object contains multicast announcement and query parameters used for the purpose of downloading files.
	 *
	 * @return the value
	 */
	public DownloadAvailability getDownloadAvailability() {
		return downloadAvailability;
	}

	/**
	 * Set the this object contains multicast announcement and query parameters used for the purpose of downloading files.
	 *
	 * @param downloadAvailability the input value
	 */
	public void  setDownloadAvailability(DownloadAvailability downloadAvailability) {
		this.downloadAvailability = downloadAvailability;
	}

	/**
	 * Set the this object contains multicast announcement and query parameters used for the purpose of downloading files.
	 *
	 * @param downloadAvailability the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withDownloadAvailability(DownloadAvailability downloadAvailability) {
		this.downloadAvailability = downloadAvailability;
		return this;
	}

	/**
	 * Get the top level object for dynamically managed software applications.
	 *
	 * @return the value
	 */
	public SoftwareModules getSoftwareModules() {
		return softwareModules;
	}

	/**
	 * Set the top level object for dynamically managed software applications.
	 *
	 * @param softwareModules the input value
	 */
	public void  setSoftwareModules(SoftwareModules softwareModules) {
		this.softwareModules = softwareModules;
	}

	/**
	 * Set the top level object for dynamically managed software applications.
	 *
	 * @param softwareModules the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withSoftwareModules(SoftwareModules softwareModules) {
		this.softwareModules = softwareModules;
		return this;
	}

	/**
	 * Get the this object contains general information related to managing security features on the device.
	 *
	 * @return the value
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * Set the this object contains general information related to managing security features on the device.
	 *
	 * @param security the input value
	 */
	public void  setSecurity(Security security) {
		this.security = security;
	}

	/**
	 * Set the this object contains general information related to managing security features on the device.
	 *
	 * @param security the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withSecurity(Security security) {
		this.security = security;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Fault/Alarm Management.
	 *
	 * @return the value
	 */
	public FaultMgmt getFaultMgmt() {
		return faultMgmt;
	}

	/**
	 * Set the this object contains parameters relating to Fault/Alarm Management.
	 *
	 * @param faultMgmt the input value
	 */
	public void  setFaultMgmt(FaultMgmt faultMgmt) {
		this.faultMgmt = faultMgmt;
	}

	/**
	 * Set the this object contains parameters relating to Fault/Alarm Management.
	 *
	 * @param faultMgmt the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withFaultMgmt(FaultMgmt faultMgmt) {
		this.faultMgmt = faultMgmt;
		return this;
	}

	/**
	 * Get the this object is the container for all Femto related component objects, to prevent pollution of the so-called global namespace of the BBF with FAP specific objects.
	 *
	 * @return the value
	 */
	public FAP getFap() {
		return fap;
	}

	/**
	 * Set the this object is the container for all Femto related component objects, to prevent pollution of the so-called global namespace of the BBF with FAP specific objects.
	 *
	 * @param fap the input value
	 */
	public void  setFap(FAP fap) {
		this.fap = fap;
	}

	/**
	 * Set the this object is the container for all Femto related component objects, to prevent pollution of the so-called global namespace of the BBF with FAP specific objects.
	 *
	 * @param fap the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withFap(FAP fap) {
		this.fap = fap;
		return this;
	}

	/**
	 * Get the bulk Data collection utilizes the IPDR solution to collect data from devices based on a service specification described in {{bibref|TR-232}}.

Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.

This object provides bulk data collection capabilities and global collection settings that affect the entire device.
	 *
	 * @return the value
	 */
	public BulkData getBulkData() {
		return bulkData;
	}

	/**
	 * Set the bulk Data collection utilizes the IPDR solution to collect data from devices based on a service specification described in {{bibref|TR-232}}.

Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.

This object provides bulk data collection capabilities and global collection settings that affect the entire device.
	 *
	 * @param bulkData the input value
	 */
	public void  setBulkData(BulkData bulkData) {
		this.bulkData = bulkData;
	}

	/**
	 * Set the bulk Data collection utilizes the IPDR solution to collect data from devices based on a service specification described in {{bibref|TR-232}}.

Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.

This object provides bulk data collection capabilities and global collection settings that affect the entire device.
	 *
	 * @param bulkData the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withBulkData(BulkData bulkData) {
		this.bulkData = bulkData;
		return this;
	}

	/**
	 * Get the properties for Domain Name Service (DNS). It contains the Service Discovery (DNS-SD) objects.
	 *
	 * @return the value
	 */
	public DNS getDns() {
		return dns;
	}

	/**
	 * Set the properties for Domain Name Service (DNS). It contains the Service Discovery (DNS-SD) objects.
	 *
	 * @param dns the input value
	 */
	public void  setDns(DNS dns) {
		this.dns = dns;
	}

	/**
	 * Set the properties for Domain Name Service (DNS). It contains the Service Discovery (DNS-SD) objects.
	 *
	 * @param dns the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withDns(DNS dns) {
		this.dns = dns;
		return this;
	}

	/**
	 * Get the {{object}} represents the XMPP capabilities of the device as described in {{bibref|TR-069a5|Appendix III}}.
	 *
	 * @return the value
	 */
	public XMPP getXmpP() {
		return xmpP;
	}

	/**
	 * Set the {{object}} represents the XMPP capabilities of the device as described in {{bibref|TR-069a5|Appendix III}}.
	 *
	 * @param xmpP the input value
	 */
	public void  setXmpP(XMPP xmpP) {
		this.xmpP = xmpP;
	}

	/**
	 * Set the {{object}} represents the XMPP capabilities of the device as described in {{bibref|TR-069a5|Appendix III}}.
	 *
	 * @param xmpP the input value
	 * @return this instance
	 */
	public InternetGatewayDevice withXmpP(XMPP xmpP) {
		this.xmpP = xmpP;
		return this;
	}

	//</editor-fold>

}