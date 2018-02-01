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
package org.broadbandforum.tr181;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.ATM;
import org.broadbandforum.tr181.device.Bridging;
import org.broadbandforum.tr181.device.BulkData;
import org.broadbandforum.tr181.device.CaptivePortal;
import org.broadbandforum.tr181.device.Cellular;
import org.broadbandforum.tr181.device.DHCPv4;
import org.broadbandforum.tr181.device.DHCPv6;
import org.broadbandforum.tr181.device.DLNA;
import org.broadbandforum.tr181.device.DNS;
import org.broadbandforum.tr181.device.DSL;
import org.broadbandforum.tr181.device.DSLite;
import org.broadbandforum.tr181.device.DeviceInfo;
import org.broadbandforum.tr181.device.DynamicDNS;
import org.broadbandforum.tr181.device.ETSIM2M;
import org.broadbandforum.tr181.device.Ethernet;
import org.broadbandforum.tr181.device.FAP;
import org.broadbandforum.tr181.device.FaultMgmt;
import org.broadbandforum.tr181.device.Firewall;
import org.broadbandforum.tr181.device.GRE;
import org.broadbandforum.tr181.device.GatewayInfo;
import org.broadbandforum.tr181.device.Ghn;
import org.broadbandforum.tr181.device.HPNA;
import org.broadbandforum.tr181.device.HomePlug;
import org.broadbandforum.tr181.device.Hosts;
import org.broadbandforum.tr181.device.IEEE1905;
import org.broadbandforum.tr181.device.IEEE8021x;
import org.broadbandforum.tr181.device.IP;
import org.broadbandforum.tr181.device.IPsec;
import org.broadbandforum.tr181.device.IPv6rd;
import org.broadbandforum.tr181.device.InterfaceStack;
import org.broadbandforum.tr181.device.LANConfigSecurity;
import org.broadbandforum.tr181.device.LLDP;
import org.broadbandforum.tr181.device.MAP;
import org.broadbandforum.tr181.device.MQTT;
import org.broadbandforum.tr181.device.ManagementServer;
import org.broadbandforum.tr181.device.MoCA;
import org.broadbandforum.tr181.device.NAT;
import org.broadbandforum.tr181.device.NeighborDiscovery;
import org.broadbandforum.tr181.device.Optical;
import org.broadbandforum.tr181.device.PCP;
import org.broadbandforum.tr181.device.PPP;
import org.broadbandforum.tr181.device.PTM;
import org.broadbandforum.tr181.device.PeriodicStatistics;
import org.broadbandforum.tr181.device.QoS;
import org.broadbandforum.tr181.device.RouterAdvertisement;
import org.broadbandforum.tr181.device.Routing;
import org.broadbandforum.tr181.device.Security;
import org.broadbandforum.tr181.device.SelfTestDiagnostics;
import org.broadbandforum.tr181.device.Services;
import org.broadbandforum.tr181.device.SmartCardReaders;
import org.broadbandforum.tr181.device.SoftwareModules;
import org.broadbandforum.tr181.device.Time;
import org.broadbandforum.tr181.device.UPA;
import org.broadbandforum.tr181.device.UPnP;
import org.broadbandforum.tr181.device.USB;
import org.broadbandforum.tr181.device.UserInterface;
import org.broadbandforum.tr181.device.Users;
import org.broadbandforum.tr181.device.WiFi;
import org.broadbandforum.tr181.device.XMPP;
import org.broadbandforum.tr181.device.ZigBee;

	/**
	 * The top-level object for a Device.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.")
public class Device {

	/**
	 * Root data model version, e.g. ''2.4''.  For a vendor-defined root data model, this is the standard Broadband Forum model on which the vendor-defined model is based.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "RootDataModelVersion")
	@CWMPParameter(forcedInform = true)
	@Size(max = 32)
	@Pattern(regexp = "2\\.\\d+")
	public String rootDataModelVersion;
	/**
	 * This object contains general services information.
	 */
	@XmlElement(name = "Services")
	public Services services;
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
	 * This table contains information about the relationships between the multiple layers of interface objects ({{bibref|TR-181i2|Section 4.3}}). In particular, it contains information on which interfaces run ''on top of'' which other interfaces.

        This table is auto-generated by the CPE based on the ''LowerLayers'' parameters on individual interface objects. 

        Each table row represents a "link" between two interface objects, a higher-layer interface object (referenced by {{param|HigherLayer}}) and a lower-layer interface object (referenced by {{param|LowerLayer}}). Consequently, if a referenced interface object is deleted, the CPE MUST delete the corresponding {{object}} row(s) that had referenced it.
	 */
	@XmlElementWrapper(name = "interfaceStacks")
	@XmlElement(name = "InterfaceStack")
	public Collection<InterfaceStack> interfaceStacks;
	/**
	 * This object models DSL lines, DSL channels, DSL bonding, and DSL diagnostics. The specific interface objects defined here are {{object|Line}}, {{object|Channel}}, and {{object|BondingGroup}}. Each {{object|Line}} models a layer 1 DSL Line interface, and each {{object|Channel}} models a layer 1 DSL Channel interface where multiple channels can run over a DSL line. In the case where bonding is configured, it is expected that {{object|BondingGroup}} is stacked above the {{object|Channel}} instances within its group.
	 */
	@XmlElement(name = "DSL")
	public DSL dsl;
	/**
	 * This object models optical interface technologies.  It defines an {{object|Interface}} object that models a layer 1 optical interface that is capable of transporting Ethernet packets.  The data model definition is based on parts of {{bibref|G.988}}.
	 */
	@XmlElement(name = "Optical")
	public Optical optical;
	/**
	 * This object models cellular interfaces and access points.
	 */
	@XmlElement(name = "Cellular")
	public Cellular cellular;
	/**
	 * Asynchronous Transfer Mode (ATM) object that contains the {{object|Link}} interface and {{object|Diagnostics.F5Loopback}} diagnostics.
	 */
	@XmlElement(name = "ATM")
	public ATM atm;
	/**
	 * Packet Transfer Mode ({{bibref|G.993.1|Annex H}}). This object contains the {{object|Link}} interface.
	 */
	@XmlElement(name = "PTM")
	public PTM ptm;
	/**
	 * Ethernet object. This object models several Ethernet interface objects, each representing a different stack layer, including: {{object|Interface}}, {{object|Link}}, and {{object|VLANTermination}}. {{object|Interface}} is media-specific and models a port, the PHY layer, and the MAC layer. {{object|Link}} is media-independent and models the Logical Link Control (LLC) layer. An "outer" {{object|VLANTermination}}, when present, is expected to be stacked on top of {{object|Link}} objects to receive and send frames with a configured VLANID.
	 */
	@XmlElement(name = "Ethernet")
	public Ethernet ethernet;
	/**
	 * Universal Serial Bus ({{bibref|USB1.0}}, {{bibref|USB2.0}}, {{bibref|USB3.0}}). This object contains the {{object|Interface}}, {{object|Port}}, and {{object|USBHosts}} objects.
	 */
	@XmlElement(name = "USB")
	public USB usb;
	/**
	 * HPNA object that contains the {{object|Interface}} and {{object|Diagnostics}} objects. The HPNA (also known as HomePNA) industry standard {{bibref|G.9954}} defines peer to peer communication for home networking over existing coax cables and telephone wiring within the home.
	 */
	@XmlElement(name = "HPNA")
	public HPNA hpnA;
	/**
	 * MoCA object that contains the {{object|Interface}} table {{bibref|MoCAv1.0}} {{bibref|MoCAv1.1}}.
	 */
	@XmlElement(name = "MoCA")
	public MoCA mocA;
	/**
	 * G.hn object that contains an {{object|Interface}} table for G.hn supported CPE. The ITU-T G.hn specifications {{bibref|G.9960}} and {{bibref|G.9961}} define Physical and MAC Layers for communication between two or more G.hn nodes in the home network over multiple wired media such as power line, phone line and coaxial cable.
	 */
	@XmlElement(name = "Ghn")
	public Ghn ghn;
	/**
	 * HomePlug object that contains the {{object|Interface}} table. The HomePlug industry standard {{bibref|HPAV1.1}} defines peer to peer communication over powerline medium.
	 */
	@XmlElement(name = "HomePlug")
	public HomePlug homePlug;
	/**
	 * Universal Powerline Association {{bibref|UPA-PLC}}. This object contains the {{object|Interface}} and {{object|Diagnostics}} objects.
	 */
	@XmlElement(name = "UPA")
	public UPA upa;
	/**
	 * The WiFi object is based on the WiFi Alliance 802.11 specifications ({{bibref|802.11-2007}}). It defines interface objects ({{object|Radio}} and {{object|SSID}}), and application objects ({{object|AccessPoint}} and {{object|EndPoint}}).
	 */
	@XmlElement(name = "WiFi")
	public WiFi wifi;
	/**
	 * Top level object for ZigBee capabilities based on the {{bibref|ZigBee2007}} specification.
	 */
	@XmlElement(name = "ZigBee")
	public ZigBee zigBee;
	/**
	 * Layer 2 bridging configuration. Specifies bridges between different layer 2 interfaces. Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

        This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}} bridges.

        Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled.

        802.1Q {{bibref|802.1Q-2011}} bridges incorporate 802.1Q {{bibref|802.1Q-2005}} customer and 802.1ad {{bibref|802.1ad-2005}} provider bridges.
	 */
	@XmlElement(name = "Bridging")
	public Bridging bridging;
	/**
	 * Point-to-Point Protocol {{bibref|RFC1661}}. This object contains the {{object|Interface}} table.
	 */
	@XmlElement(name = "PPP")
	public PPP ppp;
	/**
	 * IP object that contains the {{object|Interface}}, {{object|ActivePort}}, and {{object|Diagnostics}} objects.
	 */
	@XmlElement(name = "IP")
	public IP ip;
	/**
	 * This object contains Link Layer Discovery Protocol (LLDP) {{bibref|802.1AB-2009}} related objects and parameters.
	 */
	@XmlElement(name = "LLDP")
	public LLDP lldP;
	/**
	 * IPsec {{bibref|RFC4301}} object that supports the configuration of Encapsulating Security Payload (ESP) {{bibref|RFC4303}} and Authentication Header (AH) {{bibref|RFC4302}} in tunnel mode {{bibref|RFC4301|Section 3.2}}.

        Use of IKEv2 {{bibref|RFC5996}} is assumed.  The IPsec object does not currently support static configuration of tunnels and child Security Associations (SAs).

        See the IPsec Theory of Operation {{bibref|TR-181i2a5|Appendix IX}} for a description of the working of this IPsec data model.
	 */
	@XmlElement(name = "IPsec")
	public IPsec ipsec;
	/**
	 * This object contains parameters associated with the Generic Routing Encapsulation (GRE) Tunnel ({{bibref|RFC2784}}) with Key and Sequence Number extensions ({{bibref|RFC2890}}). This object also provides a means to treat packets that are encapsulated within a GRE Tunnel by using a set of {{object|Filter}} objects to determine the treatment of the packet.
	 */
	@XmlElement(name = "GRE")
	public GRE gre;
	/**
	 * The Mapping of Address and Port (MAP) object {{bibref|RFC7597}} {{bibref|RFC7599}} {{bibref|RFC7598}}. This object applies only to gateway devices that support IPv4 on the LAN side, include a {{object|#.NAT}}, and typically have only IPv6 connectivity on the WAN side.

        See the MAP Theory of Operation {{bibref|TR-181i2a8|Appendix XV}} for a description of the working of this MAP data model.
	 */
	@XmlElement(name = "MAP")
	public MAP map;
	/**
	 * This object contains parameters relating to the captive portal configuration on the CPE.

        The captive portal configuration defines the CPE's upstream HTTP (port 80) traffic redirect behavior.

        When the captive portal is disabled, upstream HTTP (port 80) traffic MUST be permitted to all destinations.

        When the captive portal is enabled, upstream HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|URL}}.
	 */
	@XmlElement(name = "CaptivePortal")
	public CaptivePortal captivePortal;
	/**
	 * Routing object that contains the {{object|Router}} table and {{object|RIP}} protocol object.
	 */
	@XmlElement(name = "Routing")
	public Routing routing;
	/**
	 * The Neighbor Discovery Protocol (NDP) object {{bibref|RFC4861}}.  This object applies only to IPv6.  It contains an {{object|InterfaceSetting}} table that defines the NDP configuration for individual IP interfaces.
	 */
	@XmlElement(name = "NeighborDiscovery")
	public NeighborDiscovery neighborDiscovery;
	/**
	 * The Router Advertisement (RA) object {{bibref|RFC4861}}. This object applies only to IPv6. It contains an {{object|InterfaceSetting}} table that defines the RA configuration for individual IP interfaces.

        Information received via router advertisement messages is automatically propagated to the relevant {{object|.IP.Interface}} sub-objects, e.g. to the {{object|.IP.Interface.{i}.IPv6Address}} and {{object|.IP.Interface.{i}.IPv6Prefix}} tables.
	 */
	@XmlElement(name = "RouterAdvertisement")
	public RouterAdvertisement routerAdvertisement;
	/**
	 * Settings allowing a CPE to derive and route IPv6 Rapid Deployment (6rd) delegated prefixes as specified in {{bibref|RFC5969}}.  The 6rd mechanism is intended to be implemented only on what {{bibref|RFC5969}} refers to as ''Customer Edge Routers'', i.e. on gateway devices, that support IPv6 on the LAN side and only have IPv4 connectivity on the WAN side.

        See the 6rd Theory of Operation {{bibref|TR-181i2a2|Appendix VI}} for a description of the working of this 6rd data model.
	 */
	@XmlElement(name = "IPv6rd")
	public IPv6rd ipv6rd;
	/**
	 * Settings allowing a CPE to configure and route IPv6 Dual-Stack Lite (DSLite) as specified in {{bibref|DSLite}}. The DS-Lite mechanism is intended to be implemented only on gateway devices that support IPv4 on the LAN side and only have IPv6 connectivity on the WAN side.

        See the Dual-Stack Lite Theory of Operation {{bibref|TR-181i2a2|Appendix VII}} for a description of the working of this DS-Lite data model.
	 */
	@XmlElement(name = "DSLite")
	public DSLite dslite;
	/**
	 * Queue management configuration object.
	 */
	@XmlElement(name = "QoS")
	public QoS qos;
	/**
	 * This object contains generic device configuration information.
	 */
	@XmlElement(name = "LANConfigSecurity")
	public LANConfigSecurity lanConfigSecurity;
	/**
	 * This object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses. It can also include non-IP  hosts.
	 */
	@XmlElement(name = "Hosts")
	public Hosts hosts;
	/**
	 * Properties for Domain Name Service (DNS).
	 */
	@XmlElement(name = "DNS")
	public DNS dns;
	/**
	 * Properties for Network Address Translation (NAT).

        The entire {{object}} object only applies to IPv4.
	 */
	@XmlElement(name = "NAT")
	public NAT nat;
	/**
	 * Properties for Port Control Protocol (PCP) {{bibref|RFC6887}}.

        See the PCP Theory of Operation {{bibref|TR-181i2a8|Appendix XIV}} for a description of the working of this PCP data model.
	 */
	@XmlElement(name = "PCP")
	public PCP pcp;
	/**
	 * The Dynamic Host Configuration Protocol (DHCP) IPv4 object {{bibref|RFC2131}}. This entire object applies to IPv4 only. It contains the {{object|Client}}, {{object|Server}}, and {{object|Relay}} objects.
	 */
	@XmlElement(name = "DHCPv4")
	public DHCPv4 dhcPv4;
	/**
	 * The Dynamic Host Configuration Protocol (DHCP) IPv6 object {{bibref|RFC3315}}. This entire object applies to IPv6 only. It contains the {{object|Client}} and {{object|Server}} objects.
	 */
	@XmlElement(name = "DHCPv6")
	public DHCPv6 dhcPv6;
	/**
	 * IEEE 802.1x object {{bibref|802.1x-2004}}, where {{object|Supplicant}} models authentication supplicants.
	 */
	@XmlElement(name = "IEEE8021x")
	public IEEE8021x ieeE8021x;
	/**
	 * Users object that contains the {{object|User}} table.
	 */
	@XmlElement(name = "Users")
	public Users users;
	/**
	 * SmartCardReaders object that contains the {{object|SmartCardReader}} table.
	 */
	@XmlElement(name = "SmartCardReaders")
	public SmartCardReaders smartCardReaders;
	/**
	 * This object contains all UPnP related objects and parameters including Device and Discovery related objects and parameters.
	 */
	@XmlElement(name = "UPnP")
	public UPnP upnP;
	/**
	 * The {{object}} object represents the management object for the Remote Entity Functions (REM) functions defined in the M2M Functional Architecture {{bibref|ETSIM2MFA}}.
	 */
	@XmlElement(name = "ETSIM2M")
	public ETSIM2M etsIM2M;
	/**
	 * This object contains all DLNA related objects and parameters.
	 */
	@XmlElement(name = "DLNA")
	public DLNA dlnA;
	/**
	 * This diagnostics test is vendor-specific and MAY include testing hardware, software, and/or firmware.
	 */
	@XmlElement(name = "SelfTestDiagnostics")
	public SelfTestDiagnostics selfTestDiagnostics;
	/**
	 * Firewall configuration object. The {{param|Config}} parameter enables and disables the Firewall, and can select either a predefined configuration ({{enum|High|Config}} or {{enum|Low|Config}}) or an explicitly-defined {{enum|Advanced|Config}} configuration.

        For an {{enum|Advanced|Config}} configuration, {{param|AdvancedLevel}} controls the currently active Firewall Level, and the Firewall Levels are defined in the {{object|Level}}, {{object|Chain}} and {{object|Chain.{i}.Rule}} tables.

        The Firewall rules modeled by this object operate only on the forwarding path. This means that they affect only routed traffic, and do not affect traffic that is destined for or generated by the CPE.  Note that any {{object|#.NAT}} processing on the ingress packet occurs before Firewall rules are applied so, for example, the Firewall rules will see the translated destination IP address and port in a downstream packet that has passed through the NAT.

        See {{bibref|TR-181i2a2|Appendix VIII}} for an example {{enum|Advanced|Config}} configuration.
	 */
	@XmlElement(name = "Firewall")
	public Firewall firewall;
	/**
	 * This object configures collection of periodic statistics for the device.

        Periodic statistics are measured over a sample interval (which can be aligned with absolute time) and are made available to the ACS as a comma-separated list of the most recent <n> samples.

        This object provides a single set of global settings that affect the entire device unless overridden locally.
	 */
	@XmlElement(name = "PeriodicStatistics")
	public PeriodicStatistics periodicStatistics;
	/**
	 * Top level object for dynamically managed software applications.
	 */
	@XmlElement(name = "SoftwareModules")
	public SoftwareModules softwareModules;
	/**
	 * This object contains parameters relating to Fault/Alarm Management.
	 */
	@XmlElement(name = "FaultMgmt")
	public FaultMgmt faultMgmt;
	/**
	 * This object contains general information related to managing security features on the device.
	 */
	@XmlElement(name = "Security")
	public Security security;
	/**
	 * This object is the container for all Femto related component objects, to prevent pollution of the so-called global namespace of the BBF with FAP specific objects.
	 */
	@XmlElement(name = "FAP")
	public FAP fap;
	/**
	 * This object provides bulk data collection capabilities and global collection settings that affect the entire device.

        Bulk Data utilizes various solutions (e.g., IPDR, HTTP) to collect data from devices and transfer the data to a collection server.        

        The IPDR solution is based on a service specification described in {{bibref|TR-232}}.

        The HTTP solution is based on transfer mechanisms described in {{bibref|TR-157a10|Annex A}}.

        The Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.
	 */
	@XmlElement(name = "BulkData")
	public BulkData bulkData;
	/**
	 * The {{object}} represents the XMPP capabilities of the device as described in {{bibref|TR-069a5|Appendix III}}.
	 */
	@XmlElement(name = "XMPP")
	public XMPP xmpP;
	/**
	 * This object represents the management functions for the 1905 capabilities as defined in {{bibref|IEEE1905.1a}}.
	 */
	@XmlElement(name = "IEEE1905")
	public IEEE1905 ieeE1905;
	/**
	 * MQTT Base object describing all MQTT related parameters and objects {{bibref|MQTT31}},
	 */
	@XmlElement(name = "MQTT")
	public MQTT mqtT;
	/**
	 * Properties for Dynamic DNS.
	 */
	@XmlElement(name = "DynamicDNS")
	public DynamicDNS dynamicDNS;

	public Device() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the root data model version, e.g. ''2.4''.  For a vendor-defined root data model, this is the standard Broadband Forum model on which the vendor-defined model is based.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getRootDataModelVersion() {
		return rootDataModelVersion;
	}

	/**
	 * Set the root data model version, e.g. ''2.4''.  For a vendor-defined root data model, this is the standard Broadband Forum model on which the vendor-defined model is based.
	 *
	 * @since 2.4
	 * @param rootDataModelVersion the input value
	 */
	public void  setRootDataModelVersion(String rootDataModelVersion) {
		this.rootDataModelVersion = rootDataModelVersion;
	}

	/**
	 * Set the root data model version, e.g. ''2.4''.  For a vendor-defined root data model, this is the standard Broadband Forum model on which the vendor-defined model is based.
	 *
	 * @since 2.4
	 * @param rootDataModelVersion the input value
	 * @return this instance
	 */
	public Device withRootDataModelVersion(String rootDataModelVersion) {
		this.rootDataModelVersion = rootDataModelVersion;
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
	 * Get the this table contains information about the relationships between the multiple layers of interface objects ({{bibref|TR-181i2|Section 4.3}}). In particular, it contains information on which interfaces run ''on top of'' which other interfaces.

        This table is auto-generated by the CPE based on the ''LowerLayers'' parameters on individual interface objects. 

        Each table row represents a "link" between two interface objects, a higher-layer interface object (referenced by {{param|HigherLayer}}) and a lower-layer interface object (referenced by {{param|LowerLayer}}). Consequently, if a referenced interface object is deleted, the CPE MUST delete the corresponding {{object}} row(s) that had referenced it.
	 *
	 * @return the value
	 */
	public Collection<InterfaceStack> getInterfaceStacks() {
		if (this.interfaceStacks == null){ this.interfaceStacks=new ArrayList<>();}
		return interfaceStacks;
	}

	/**
	 * Set the this table contains information about the relationships between the multiple layers of interface objects ({{bibref|TR-181i2|Section 4.3}}). In particular, it contains information on which interfaces run ''on top of'' which other interfaces.

        This table is auto-generated by the CPE based on the ''LowerLayers'' parameters on individual interface objects. 

        Each table row represents a "link" between two interface objects, a higher-layer interface object (referenced by {{param|HigherLayer}}) and a lower-layer interface object (referenced by {{param|LowerLayer}}). Consequently, if a referenced interface object is deleted, the CPE MUST delete the corresponding {{object}} row(s) that had referenced it.
	 *
	 * @param interfaceStacks the input value
	 */
	public void  setInterfaceStacks(Collection<InterfaceStack> interfaceStacks) {
		this.interfaceStacks = interfaceStacks;
	}

	/**
	 * Set the this table contains information about the relationships between the multiple layers of interface objects ({{bibref|TR-181i2|Section 4.3}}). In particular, it contains information on which interfaces run ''on top of'' which other interfaces.

        This table is auto-generated by the CPE based on the ''LowerLayers'' parameters on individual interface objects. 

        Each table row represents a "link" between two interface objects, a higher-layer interface object (referenced by {{param|HigherLayer}}) and a lower-layer interface object (referenced by {{param|LowerLayer}}). Consequently, if a referenced interface object is deleted, the CPE MUST delete the corresponding {{object}} row(s) that had referenced it.
	 *
	 * @param interfaceStack the input value
	 * @return this instance
	 */
	public Device withInterfaceStack(InterfaceStack interfaceStack) {
		getInterfaceStacks().add(interfaceStack);
		return this;
	}

	/**
	 * Get the this object models DSL lines, DSL channels, DSL bonding, and DSL diagnostics. The specific interface objects defined here are {{object|Line}}, {{object|Channel}}, and {{object|BondingGroup}}. Each {{object|Line}} models a layer 1 DSL Line interface, and each {{object|Channel}} models a layer 1 DSL Channel interface where multiple channels can run over a DSL line. In the case where bonding is configured, it is expected that {{object|BondingGroup}} is stacked above the {{object|Channel}} instances within its group.
	 *
	 * @return the value
	 */
	public DSL getDsl() {
		return dsl;
	}

	/**
	 * Set the this object models DSL lines, DSL channels, DSL bonding, and DSL diagnostics. The specific interface objects defined here are {{object|Line}}, {{object|Channel}}, and {{object|BondingGroup}}. Each {{object|Line}} models a layer 1 DSL Line interface, and each {{object|Channel}} models a layer 1 DSL Channel interface where multiple channels can run over a DSL line. In the case where bonding is configured, it is expected that {{object|BondingGroup}} is stacked above the {{object|Channel}} instances within its group.
	 *
	 * @param dsl the input value
	 */
	public void  setDsl(DSL dsl) {
		this.dsl = dsl;
	}

	/**
	 * Set the this object models DSL lines, DSL channels, DSL bonding, and DSL diagnostics. The specific interface objects defined here are {{object|Line}}, {{object|Channel}}, and {{object|BondingGroup}}. Each {{object|Line}} models a layer 1 DSL Line interface, and each {{object|Channel}} models a layer 1 DSL Channel interface where multiple channels can run over a DSL line. In the case where bonding is configured, it is expected that {{object|BondingGroup}} is stacked above the {{object|Channel}} instances within its group.
	 *
	 * @param dsl the input value
	 * @return this instance
	 */
	public Device withDsl(DSL dsl) {
		this.dsl = dsl;
		return this;
	}

	/**
	 * Get the this object models optical interface technologies.  It defines an {{object|Interface}} object that models a layer 1 optical interface that is capable of transporting Ethernet packets.  The data model definition is based on parts of {{bibref|G.988}}.
	 *
	 * @return the value
	 */
	public Optical getOptical() {
		return optical;
	}

	/**
	 * Set the this object models optical interface technologies.  It defines an {{object|Interface}} object that models a layer 1 optical interface that is capable of transporting Ethernet packets.  The data model definition is based on parts of {{bibref|G.988}}.
	 *
	 * @param optical the input value
	 */
	public void  setOptical(Optical optical) {
		this.optical = optical;
	}

	/**
	 * Set the this object models optical interface technologies.  It defines an {{object|Interface}} object that models a layer 1 optical interface that is capable of transporting Ethernet packets.  The data model definition is based on parts of {{bibref|G.988}}.
	 *
	 * @param optical the input value
	 * @return this instance
	 */
	public Device withOptical(Optical optical) {
		this.optical = optical;
		return this;
	}

	/**
	 * Get the this object models cellular interfaces and access points.
	 *
	 * @return the value
	 */
	public Cellular getCellular() {
		return cellular;
	}

	/**
	 * Set the this object models cellular interfaces and access points.
	 *
	 * @param cellular the input value
	 */
	public void  setCellular(Cellular cellular) {
		this.cellular = cellular;
	}

	/**
	 * Set the this object models cellular interfaces and access points.
	 *
	 * @param cellular the input value
	 * @return this instance
	 */
	public Device withCellular(Cellular cellular) {
		this.cellular = cellular;
		return this;
	}

	/**
	 * Get asynchronous Transfer Mode (ATM) object that contains the {{object|Link}} interface and {{object|Diagnostics.F5Loopback}} diagnostics.
	 *
	 * @return the value
	 */
	public ATM getAtm() {
		return atm;
	}

	/**
	 * Set asynchronous Transfer Mode (ATM) object that contains the {{object|Link}} interface and {{object|Diagnostics.F5Loopback}} diagnostics.
	 *
	 * @param atm the input value
	 */
	public void  setAtm(ATM atm) {
		this.atm = atm;
	}

	/**
	 * Set asynchronous Transfer Mode (ATM) object that contains the {{object|Link}} interface and {{object|Diagnostics.F5Loopback}} diagnostics.
	 *
	 * @param atm the input value
	 * @return this instance
	 */
	public Device withAtm(ATM atm) {
		this.atm = atm;
		return this;
	}

	/**
	 * Get the packet Transfer Mode ({{bibref|G.993.1|Annex H}}). This object contains the {{object|Link}} interface.
	 *
	 * @return the value
	 */
	public PTM getPtm() {
		return ptm;
	}

	/**
	 * Set the packet Transfer Mode ({{bibref|G.993.1|Annex H}}). This object contains the {{object|Link}} interface.
	 *
	 * @param ptm the input value
	 */
	public void  setPtm(PTM ptm) {
		this.ptm = ptm;
	}

	/**
	 * Set the packet Transfer Mode ({{bibref|G.993.1|Annex H}}). This object contains the {{object|Link}} interface.
	 *
	 * @param ptm the input value
	 * @return this instance
	 */
	public Device withPtm(PTM ptm) {
		this.ptm = ptm;
		return this;
	}

	/**
	 * Get the ethernet object. This object models several Ethernet interface objects, each representing a different stack layer, including: {{object|Interface}}, {{object|Link}}, and {{object|VLANTermination}}. {{object|Interface}} is media-specific and models a port, the PHY layer, and the MAC layer. {{object|Link}} is media-independent and models the Logical Link Control (LLC) layer. An "outer" {{object|VLANTermination}}, when present, is expected to be stacked on top of {{object|Link}} objects to receive and send frames with a configured VLANID.
	 *
	 * @return the value
	 */
	public Ethernet getEthernet() {
		return ethernet;
	}

	/**
	 * Set the ethernet object. This object models several Ethernet interface objects, each representing a different stack layer, including: {{object|Interface}}, {{object|Link}}, and {{object|VLANTermination}}. {{object|Interface}} is media-specific and models a port, the PHY layer, and the MAC layer. {{object|Link}} is media-independent and models the Logical Link Control (LLC) layer. An "outer" {{object|VLANTermination}}, when present, is expected to be stacked on top of {{object|Link}} objects to receive and send frames with a configured VLANID.
	 *
	 * @param ethernet the input value
	 */
	public void  setEthernet(Ethernet ethernet) {
		this.ethernet = ethernet;
	}

	/**
	 * Set the ethernet object. This object models several Ethernet interface objects, each representing a different stack layer, including: {{object|Interface}}, {{object|Link}}, and {{object|VLANTermination}}. {{object|Interface}} is media-specific and models a port, the PHY layer, and the MAC layer. {{object|Link}} is media-independent and models the Logical Link Control (LLC) layer. An "outer" {{object|VLANTermination}}, when present, is expected to be stacked on top of {{object|Link}} objects to receive and send frames with a configured VLANID.
	 *
	 * @param ethernet the input value
	 * @return this instance
	 */
	public Device withEthernet(Ethernet ethernet) {
		this.ethernet = ethernet;
		return this;
	}

	/**
	 * Get the universal Serial Bus ({{bibref|USB1.0}}, {{bibref|USB2.0}}, {{bibref|USB3.0}}). This object contains the {{object|Interface}}, {{object|Port}}, and {{object|USBHosts}} objects.
	 *
	 * @return the value
	 */
	public USB getUsb() {
		return usb;
	}

	/**
	 * Set the universal Serial Bus ({{bibref|USB1.0}}, {{bibref|USB2.0}}, {{bibref|USB3.0}}). This object contains the {{object|Interface}}, {{object|Port}}, and {{object|USBHosts}} objects.
	 *
	 * @param usb the input value
	 */
	public void  setUsb(USB usb) {
		this.usb = usb;
	}

	/**
	 * Set the universal Serial Bus ({{bibref|USB1.0}}, {{bibref|USB2.0}}, {{bibref|USB3.0}}). This object contains the {{object|Interface}}, {{object|Port}}, and {{object|USBHosts}} objects.
	 *
	 * @param usb the input value
	 * @return this instance
	 */
	public Device withUsb(USB usb) {
		this.usb = usb;
		return this;
	}

	/**
	 * Get the hpnA object that contains the {{object|Interface}} and {{object|Diagnostics}} objects. The HPNA (also known as HomePNA) industry standard {{bibref|G.9954}} defines peer to peer communication for home networking over existing coax cables and telephone wiring within the home.
	 *
	 * @return the value
	 */
	public HPNA getHpnA() {
		return hpnA;
	}

	/**
	 * Set the hpnA object that contains the {{object|Interface}} and {{object|Diagnostics}} objects. The HPNA (also known as HomePNA) industry standard {{bibref|G.9954}} defines peer to peer communication for home networking over existing coax cables and telephone wiring within the home.
	 *
	 * @param hpnA the input value
	 */
	public void  setHpnA(HPNA hpnA) {
		this.hpnA = hpnA;
	}

	/**
	 * Set the hpnA object that contains the {{object|Interface}} and {{object|Diagnostics}} objects. The HPNA (also known as HomePNA) industry standard {{bibref|G.9954}} defines peer to peer communication for home networking over existing coax cables and telephone wiring within the home.
	 *
	 * @param hpnA the input value
	 * @return this instance
	 */
	public Device withHpnA(HPNA hpnA) {
		this.hpnA = hpnA;
		return this;
	}

	/**
	 * Get the mocA object that contains the {{object|Interface}} table {{bibref|MoCAv1.0}} {{bibref|MoCAv1.1}}.
	 *
	 * @return the value
	 */
	public MoCA getMocA() {
		return mocA;
	}

	/**
	 * Set the mocA object that contains the {{object|Interface}} table {{bibref|MoCAv1.0}} {{bibref|MoCAv1.1}}.
	 *
	 * @param mocA the input value
	 */
	public void  setMocA(MoCA mocA) {
		this.mocA = mocA;
	}

	/**
	 * Set the mocA object that contains the {{object|Interface}} table {{bibref|MoCAv1.0}} {{bibref|MoCAv1.1}}.
	 *
	 * @param mocA the input value
	 * @return this instance
	 */
	public Device withMocA(MoCA mocA) {
		this.mocA = mocA;
		return this;
	}

	/**
	 * Get the g.hn object that contains an {{object|Interface}} table for G.hn supported CPE. The ITU-T G.hn specifications {{bibref|G.9960}} and {{bibref|G.9961}} define Physical and MAC Layers for communication between two or more G.hn nodes in the home network over multiple wired media such as power line, phone line and coaxial cable.
	 *
	 * @return the value
	 */
	public Ghn getGhn() {
		return ghn;
	}

	/**
	 * Set the g.hn object that contains an {{object|Interface}} table for G.hn supported CPE. The ITU-T G.hn specifications {{bibref|G.9960}} and {{bibref|G.9961}} define Physical and MAC Layers for communication between two or more G.hn nodes in the home network over multiple wired media such as power line, phone line and coaxial cable.
	 *
	 * @param ghn the input value
	 */
	public void  setGhn(Ghn ghn) {
		this.ghn = ghn;
	}

	/**
	 * Set the g.hn object that contains an {{object|Interface}} table for G.hn supported CPE. The ITU-T G.hn specifications {{bibref|G.9960}} and {{bibref|G.9961}} define Physical and MAC Layers for communication between two or more G.hn nodes in the home network over multiple wired media such as power line, phone line and coaxial cable.
	 *
	 * @param ghn the input value
	 * @return this instance
	 */
	public Device withGhn(Ghn ghn) {
		this.ghn = ghn;
		return this;
	}

	/**
	 * Get the homePlug object that contains the {{object|Interface}} table. The HomePlug industry standard {{bibref|HPAV1.1}} defines peer to peer communication over powerline medium.
	 *
	 * @return the value
	 */
	public HomePlug getHomePlug() {
		return homePlug;
	}

	/**
	 * Set the homePlug object that contains the {{object|Interface}} table. The HomePlug industry standard {{bibref|HPAV1.1}} defines peer to peer communication over powerline medium.
	 *
	 * @param homePlug the input value
	 */
	public void  setHomePlug(HomePlug homePlug) {
		this.homePlug = homePlug;
	}

	/**
	 * Set the homePlug object that contains the {{object|Interface}} table. The HomePlug industry standard {{bibref|HPAV1.1}} defines peer to peer communication over powerline medium.
	 *
	 * @param homePlug the input value
	 * @return this instance
	 */
	public Device withHomePlug(HomePlug homePlug) {
		this.homePlug = homePlug;
		return this;
	}

	/**
	 * Get the universal Powerline Association {{bibref|UPA-PLC}}. This object contains the {{object|Interface}} and {{object|Diagnostics}} objects.
	 *
	 * @return the value
	 */
	public UPA getUpa() {
		return upa;
	}

	/**
	 * Set the universal Powerline Association {{bibref|UPA-PLC}}. This object contains the {{object|Interface}} and {{object|Diagnostics}} objects.
	 *
	 * @param upa the input value
	 */
	public void  setUpa(UPA upa) {
		this.upa = upa;
	}

	/**
	 * Set the universal Powerline Association {{bibref|UPA-PLC}}. This object contains the {{object|Interface}} and {{object|Diagnostics}} objects.
	 *
	 * @param upa the input value
	 * @return this instance
	 */
	public Device withUpa(UPA upa) {
		this.upa = upa;
		return this;
	}

	/**
	 * Get the WiFi object is based on the WiFi Alliance 802.11 specifications ({{bibref|802.11-2007}}). It defines interface objects ({{object|Radio}} and {{object|SSID}}), and application objects ({{object|AccessPoint}} and {{object|EndPoint}}).
	 *
	 * @return the value
	 */
	public WiFi getWifi() {
		return wifi;
	}

	/**
	 * Set the WiFi object is based on the WiFi Alliance 802.11 specifications ({{bibref|802.11-2007}}). It defines interface objects ({{object|Radio}} and {{object|SSID}}), and application objects ({{object|AccessPoint}} and {{object|EndPoint}}).
	 *
	 * @param wifi the input value
	 */
	public void  setWifi(WiFi wifi) {
		this.wifi = wifi;
	}

	/**
	 * Set the WiFi object is based on the WiFi Alliance 802.11 specifications ({{bibref|802.11-2007}}). It defines interface objects ({{object|Radio}} and {{object|SSID}}), and application objects ({{object|AccessPoint}} and {{object|EndPoint}}).
	 *
	 * @param wifi the input value
	 * @return this instance
	 */
	public Device withWifi(WiFi wifi) {
		this.wifi = wifi;
		return this;
	}

	/**
	 * Get the top level object for ZigBee capabilities based on the {{bibref|ZigBee2007}} specification.
	 *
	 * @return the value
	 */
	public ZigBee getZigBee() {
		return zigBee;
	}

	/**
	 * Set the top level object for ZigBee capabilities based on the {{bibref|ZigBee2007}} specification.
	 *
	 * @param zigBee the input value
	 */
	public void  setZigBee(ZigBee zigBee) {
		this.zigBee = zigBee;
	}

	/**
	 * Set the top level object for ZigBee capabilities based on the {{bibref|ZigBee2007}} specification.
	 *
	 * @param zigBee the input value
	 * @return this instance
	 */
	public Device withZigBee(ZigBee zigBee) {
		this.zigBee = zigBee;
		return this;
	}

	/**
	 * Get the layer 2 bridging configuration. Specifies bridges between different layer 2 interfaces. Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

        This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}} bridges.

        Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled.

        802.1Q {{bibref|802.1Q-2011}} bridges incorporate 802.1Q {{bibref|802.1Q-2005}} customer and 802.1ad {{bibref|802.1ad-2005}} provider bridges.
	 *
	 * @return the value
	 */
	public Bridging getBridging() {
		return bridging;
	}

	/**
	 * Set the layer 2 bridging configuration. Specifies bridges between different layer 2 interfaces. Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

        This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}} bridges.

        Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled.

        802.1Q {{bibref|802.1Q-2011}} bridges incorporate 802.1Q {{bibref|802.1Q-2005}} customer and 802.1ad {{bibref|802.1ad-2005}} provider bridges.
	 *
	 * @param bridging the input value
	 */
	public void  setBridging(Bridging bridging) {
		this.bridging = bridging;
	}

	/**
	 * Set the layer 2 bridging configuration. Specifies bridges between different layer 2 interfaces. Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

        This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}} bridges.

        Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled.

        802.1Q {{bibref|802.1Q-2011}} bridges incorporate 802.1Q {{bibref|802.1Q-2005}} customer and 802.1ad {{bibref|802.1ad-2005}} provider bridges.
	 *
	 * @param bridging the input value
	 * @return this instance
	 */
	public Device withBridging(Bridging bridging) {
		this.bridging = bridging;
		return this;
	}

	/**
	 * Get the point-to-Point Protocol {{bibref|RFC1661}}. This object contains the {{object|Interface}} table.
	 *
	 * @return the value
	 */
	public PPP getPpp() {
		return ppp;
	}

	/**
	 * Set the point-to-Point Protocol {{bibref|RFC1661}}. This object contains the {{object|Interface}} table.
	 *
	 * @param ppp the input value
	 */
	public void  setPpp(PPP ppp) {
		this.ppp = ppp;
	}

	/**
	 * Set the point-to-Point Protocol {{bibref|RFC1661}}. This object contains the {{object|Interface}} table.
	 *
	 * @param ppp the input value
	 * @return this instance
	 */
	public Device withPpp(PPP ppp) {
		this.ppp = ppp;
		return this;
	}

	/**
	 * Get the ip object that contains the {{object|Interface}}, {{object|ActivePort}}, and {{object|Diagnostics}} objects.
	 *
	 * @return the value
	 */
	public IP getIp() {
		return ip;
	}

	/**
	 * Set the ip object that contains the {{object|Interface}}, {{object|ActivePort}}, and {{object|Diagnostics}} objects.
	 *
	 * @param ip the input value
	 */
	public void  setIp(IP ip) {
		this.ip = ip;
	}

	/**
	 * Set the ip object that contains the {{object|Interface}}, {{object|ActivePort}}, and {{object|Diagnostics}} objects.
	 *
	 * @param ip the input value
	 * @return this instance
	 */
	public Device withIp(IP ip) {
		this.ip = ip;
		return this;
	}

	/**
	 * Get the this object contains Link Layer Discovery Protocol (LLDP) {{bibref|802.1AB-2009}} related objects and parameters.
	 *
	 * @return the value
	 */
	public LLDP getLldP() {
		return lldP;
	}

	/**
	 * Set the this object contains Link Layer Discovery Protocol (LLDP) {{bibref|802.1AB-2009}} related objects and parameters.
	 *
	 * @param lldP the input value
	 */
	public void  setLldP(LLDP lldP) {
		this.lldP = lldP;
	}

	/**
	 * Set the this object contains Link Layer Discovery Protocol (LLDP) {{bibref|802.1AB-2009}} related objects and parameters.
	 *
	 * @param lldP the input value
	 * @return this instance
	 */
	public Device withLldP(LLDP lldP) {
		this.lldP = lldP;
		return this;
	}

	/**
	 * Get the ipsec {{bibref|RFC4301}} object that supports the configuration of Encapsulating Security Payload (ESP) {{bibref|RFC4303}} and Authentication Header (AH) {{bibref|RFC4302}} in tunnel mode {{bibref|RFC4301|Section 3.2}}.

        Use of IKEv2 {{bibref|RFC5996}} is assumed.  The IPsec object does not currently support static configuration of tunnels and child Security Associations (SAs).

        See the IPsec Theory of Operation {{bibref|TR-181i2a5|Appendix IX}} for a description of the working of this IPsec data model.
	 *
	 * @return the value
	 */
	public IPsec getIpsec() {
		return ipsec;
	}

	/**
	 * Set the ipsec {{bibref|RFC4301}} object that supports the configuration of Encapsulating Security Payload (ESP) {{bibref|RFC4303}} and Authentication Header (AH) {{bibref|RFC4302}} in tunnel mode {{bibref|RFC4301|Section 3.2}}.

        Use of IKEv2 {{bibref|RFC5996}} is assumed.  The IPsec object does not currently support static configuration of tunnels and child Security Associations (SAs).

        See the IPsec Theory of Operation {{bibref|TR-181i2a5|Appendix IX}} for a description of the working of this IPsec data model.
	 *
	 * @param ipsec the input value
	 */
	public void  setIpsec(IPsec ipsec) {
		this.ipsec = ipsec;
	}

	/**
	 * Set the ipsec {{bibref|RFC4301}} object that supports the configuration of Encapsulating Security Payload (ESP) {{bibref|RFC4303}} and Authentication Header (AH) {{bibref|RFC4302}} in tunnel mode {{bibref|RFC4301|Section 3.2}}.

        Use of IKEv2 {{bibref|RFC5996}} is assumed.  The IPsec object does not currently support static configuration of tunnels and child Security Associations (SAs).

        See the IPsec Theory of Operation {{bibref|TR-181i2a5|Appendix IX}} for a description of the working of this IPsec data model.
	 *
	 * @param ipsec the input value
	 * @return this instance
	 */
	public Device withIpsec(IPsec ipsec) {
		this.ipsec = ipsec;
		return this;
	}

	/**
	 * Get the this object contains parameters associated with the Generic Routing Encapsulation (GRE) Tunnel ({{bibref|RFC2784}}) with Key and Sequence Number extensions ({{bibref|RFC2890}}). This object also provides a means to treat packets that are encapsulated within a GRE Tunnel by using a set of {{object|Filter}} objects to determine the treatment of the packet.
	 *
	 * @return the value
	 */
	public GRE getGre() {
		return gre;
	}

	/**
	 * Set the this object contains parameters associated with the Generic Routing Encapsulation (GRE) Tunnel ({{bibref|RFC2784}}) with Key and Sequence Number extensions ({{bibref|RFC2890}}). This object also provides a means to treat packets that are encapsulated within a GRE Tunnel by using a set of {{object|Filter}} objects to determine the treatment of the packet.
	 *
	 * @param gre the input value
	 */
	public void  setGre(GRE gre) {
		this.gre = gre;
	}

	/**
	 * Set the this object contains parameters associated with the Generic Routing Encapsulation (GRE) Tunnel ({{bibref|RFC2784}}) with Key and Sequence Number extensions ({{bibref|RFC2890}}). This object also provides a means to treat packets that are encapsulated within a GRE Tunnel by using a set of {{object|Filter}} objects to determine the treatment of the packet.
	 *
	 * @param gre the input value
	 * @return this instance
	 */
	public Device withGre(GRE gre) {
		this.gre = gre;
		return this;
	}

	/**
	 * Get the Mapping of Address and Port (MAP) object {{bibref|RFC7597}} {{bibref|RFC7599}} {{bibref|RFC7598}}. This object applies only to gateway devices that support IPv4 on the LAN side, include a {{object|#.NAT}}, and typically have only IPv6 connectivity on the WAN side.

        See the MAP Theory of Operation {{bibref|TR-181i2a8|Appendix XV}} for a description of the working of this MAP data model.
	 *
	 * @return the value
	 */
	public MAP getMap() {
		return map;
	}

	/**
	 * Set the Mapping of Address and Port (MAP) object {{bibref|RFC7597}} {{bibref|RFC7599}} {{bibref|RFC7598}}. This object applies only to gateway devices that support IPv4 on the LAN side, include a {{object|#.NAT}}, and typically have only IPv6 connectivity on the WAN side.

        See the MAP Theory of Operation {{bibref|TR-181i2a8|Appendix XV}} for a description of the working of this MAP data model.
	 *
	 * @param map the input value
	 */
	public void  setMap(MAP map) {
		this.map = map;
	}

	/**
	 * Set the Mapping of Address and Port (MAP) object {{bibref|RFC7597}} {{bibref|RFC7599}} {{bibref|RFC7598}}. This object applies only to gateway devices that support IPv4 on the LAN side, include a {{object|#.NAT}}, and typically have only IPv6 connectivity on the WAN side.

        See the MAP Theory of Operation {{bibref|TR-181i2a8|Appendix XV}} for a description of the working of this MAP data model.
	 *
	 * @param map the input value
	 * @return this instance
	 */
	public Device withMap(MAP map) {
		this.map = map;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the captive portal configuration on the CPE.

        The captive portal configuration defines the CPE's upstream HTTP (port 80) traffic redirect behavior.

        When the captive portal is disabled, upstream HTTP (port 80) traffic MUST be permitted to all destinations.

        When the captive portal is enabled, upstream HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|URL}}.
	 *
	 * @return the value
	 */
	public CaptivePortal getCaptivePortal() {
		return captivePortal;
	}

	/**
	 * Set the this object contains parameters relating to the captive portal configuration on the CPE.

        The captive portal configuration defines the CPE's upstream HTTP (port 80) traffic redirect behavior.

        When the captive portal is disabled, upstream HTTP (port 80) traffic MUST be permitted to all destinations.

        When the captive portal is enabled, upstream HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|URL}}.
	 *
	 * @param captivePortal the input value
	 */
	public void  setCaptivePortal(CaptivePortal captivePortal) {
		this.captivePortal = captivePortal;
	}

	/**
	 * Set the this object contains parameters relating to the captive portal configuration on the CPE.

        The captive portal configuration defines the CPE's upstream HTTP (port 80) traffic redirect behavior.

        When the captive portal is disabled, upstream HTTP (port 80) traffic MUST be permitted to all destinations.

        When the captive portal is enabled, upstream HTTP (port 80) traffic MUST be permitted only to destinations listed in the {{param|AllowedList}}; traffic to all other destinations MUST be redirected to the {{param|URL}}.
	 *
	 * @param captivePortal the input value
	 * @return this instance
	 */
	public Device withCaptivePortal(CaptivePortal captivePortal) {
		this.captivePortal = captivePortal;
		return this;
	}

	/**
	 * Get the routing object that contains the {{object|Router}} table and {{object|RIP}} protocol object.
	 *
	 * @return the value
	 */
	public Routing getRouting() {
		return routing;
	}

	/**
	 * Set the routing object that contains the {{object|Router}} table and {{object|RIP}} protocol object.
	 *
	 * @param routing the input value
	 */
	public void  setRouting(Routing routing) {
		this.routing = routing;
	}

	/**
	 * Set the routing object that contains the {{object|Router}} table and {{object|RIP}} protocol object.
	 *
	 * @param routing the input value
	 * @return this instance
	 */
	public Device withRouting(Routing routing) {
		this.routing = routing;
		return this;
	}

	/**
	 * Get the Neighbor Discovery Protocol (NDP) object {{bibref|RFC4861}}.  This object applies only to IPv6.  It contains an {{object|InterfaceSetting}} table that defines the NDP configuration for individual IP interfaces.
	 *
	 * @return the value
	 */
	public NeighborDiscovery getNeighborDiscovery() {
		return neighborDiscovery;
	}

	/**
	 * Set the Neighbor Discovery Protocol (NDP) object {{bibref|RFC4861}}.  This object applies only to IPv6.  It contains an {{object|InterfaceSetting}} table that defines the NDP configuration for individual IP interfaces.
	 *
	 * @param neighborDiscovery the input value
	 */
	public void  setNeighborDiscovery(NeighborDiscovery neighborDiscovery) {
		this.neighborDiscovery = neighborDiscovery;
	}

	/**
	 * Set the Neighbor Discovery Protocol (NDP) object {{bibref|RFC4861}}.  This object applies only to IPv6.  It contains an {{object|InterfaceSetting}} table that defines the NDP configuration for individual IP interfaces.
	 *
	 * @param neighborDiscovery the input value
	 * @return this instance
	 */
	public Device withNeighborDiscovery(NeighborDiscovery neighborDiscovery) {
		this.neighborDiscovery = neighborDiscovery;
		return this;
	}

	/**
	 * Get the Router Advertisement (RA) object {{bibref|RFC4861}}. This object applies only to IPv6. It contains an {{object|InterfaceSetting}} table that defines the RA configuration for individual IP interfaces.

        Information received via router advertisement messages is automatically propagated to the relevant {{object|.IP.Interface}} sub-objects, e.g. to the {{object|.IP.Interface.{i}.IPv6Address}} and {{object|.IP.Interface.{i}.IPv6Prefix}} tables.
	 *
	 * @return the value
	 */
	public RouterAdvertisement getRouterAdvertisement() {
		return routerAdvertisement;
	}

	/**
	 * Set the Router Advertisement (RA) object {{bibref|RFC4861}}. This object applies only to IPv6. It contains an {{object|InterfaceSetting}} table that defines the RA configuration for individual IP interfaces.

        Information received via router advertisement messages is automatically propagated to the relevant {{object|.IP.Interface}} sub-objects, e.g. to the {{object|.IP.Interface.{i}.IPv6Address}} and {{object|.IP.Interface.{i}.IPv6Prefix}} tables.
	 *
	 * @param routerAdvertisement the input value
	 */
	public void  setRouterAdvertisement(RouterAdvertisement routerAdvertisement) {
		this.routerAdvertisement = routerAdvertisement;
	}

	/**
	 * Set the Router Advertisement (RA) object {{bibref|RFC4861}}. This object applies only to IPv6. It contains an {{object|InterfaceSetting}} table that defines the RA configuration for individual IP interfaces.

        Information received via router advertisement messages is automatically propagated to the relevant {{object|.IP.Interface}} sub-objects, e.g. to the {{object|.IP.Interface.{i}.IPv6Address}} and {{object|.IP.Interface.{i}.IPv6Prefix}} tables.
	 *
	 * @param routerAdvertisement the input value
	 * @return this instance
	 */
	public Device withRouterAdvertisement(RouterAdvertisement routerAdvertisement) {
		this.routerAdvertisement = routerAdvertisement;
		return this;
	}

	/**
	 * Get the settings allowing a CPE to derive and route IPv6 Rapid Deployment (6rd) delegated prefixes as specified in {{bibref|RFC5969}}.  The 6rd mechanism is intended to be implemented only on what {{bibref|RFC5969}} refers to as ''Customer Edge Routers'', i.e. on gateway devices, that support IPv6 on the LAN side and only have IPv4 connectivity on the WAN side.

        See the 6rd Theory of Operation {{bibref|TR-181i2a2|Appendix VI}} for a description of the working of this 6rd data model.
	 *
	 * @return the value
	 */
	public IPv6rd getIpv6rd() {
		return ipv6rd;
	}

	/**
	 * Set the settings allowing a CPE to derive and route IPv6 Rapid Deployment (6rd) delegated prefixes as specified in {{bibref|RFC5969}}.  The 6rd mechanism is intended to be implemented only on what {{bibref|RFC5969}} refers to as ''Customer Edge Routers'', i.e. on gateway devices, that support IPv6 on the LAN side and only have IPv4 connectivity on the WAN side.

        See the 6rd Theory of Operation {{bibref|TR-181i2a2|Appendix VI}} for a description of the working of this 6rd data model.
	 *
	 * @param ipv6rd the input value
	 */
	public void  setIpv6rd(IPv6rd ipv6rd) {
		this.ipv6rd = ipv6rd;
	}

	/**
	 * Set the settings allowing a CPE to derive and route IPv6 Rapid Deployment (6rd) delegated prefixes as specified in {{bibref|RFC5969}}.  The 6rd mechanism is intended to be implemented only on what {{bibref|RFC5969}} refers to as ''Customer Edge Routers'', i.e. on gateway devices, that support IPv6 on the LAN side and only have IPv4 connectivity on the WAN side.

        See the 6rd Theory of Operation {{bibref|TR-181i2a2|Appendix VI}} for a description of the working of this 6rd data model.
	 *
	 * @param ipv6rd the input value
	 * @return this instance
	 */
	public Device withIpv6rd(IPv6rd ipv6rd) {
		this.ipv6rd = ipv6rd;
		return this;
	}

	/**
	 * Get the settings allowing a CPE to configure and route IPv6 Dual-Stack Lite (DSLite) as specified in {{bibref|DSLite}}. The DS-Lite mechanism is intended to be implemented only on gateway devices that support IPv4 on the LAN side and only have IPv6 connectivity on the WAN side.

        See the Dual-Stack Lite Theory of Operation {{bibref|TR-181i2a2|Appendix VII}} for a description of the working of this DS-Lite data model.
	 *
	 * @return the value
	 */
	public DSLite getDslite() {
		return dslite;
	}

	/**
	 * Set the settings allowing a CPE to configure and route IPv6 Dual-Stack Lite (DSLite) as specified in {{bibref|DSLite}}. The DS-Lite mechanism is intended to be implemented only on gateway devices that support IPv4 on the LAN side and only have IPv6 connectivity on the WAN side.

        See the Dual-Stack Lite Theory of Operation {{bibref|TR-181i2a2|Appendix VII}} for a description of the working of this DS-Lite data model.
	 *
	 * @param dslite the input value
	 */
	public void  setDslite(DSLite dslite) {
		this.dslite = dslite;
	}

	/**
	 * Set the settings allowing a CPE to configure and route IPv6 Dual-Stack Lite (DSLite) as specified in {{bibref|DSLite}}. The DS-Lite mechanism is intended to be implemented only on gateway devices that support IPv4 on the LAN side and only have IPv6 connectivity on the WAN side.

        See the Dual-Stack Lite Theory of Operation {{bibref|TR-181i2a2|Appendix VII}} for a description of the working of this DS-Lite data model.
	 *
	 * @param dslite the input value
	 * @return this instance
	 */
	public Device withDslite(DSLite dslite) {
		this.dslite = dslite;
		return this;
	}

	/**
	 * Get the queue management configuration object.
	 *
	 * @return the value
	 */
	public QoS getQos() {
		return qos;
	}

	/**
	 * Set the queue management configuration object.
	 *
	 * @param qos the input value
	 */
	public void  setQos(QoS qos) {
		this.qos = qos;
	}

	/**
	 * Set the queue management configuration object.
	 *
	 * @param qos the input value
	 * @return this instance
	 */
	public Device withQos(QoS qos) {
		this.qos = qos;
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
	public Device withLanConfigSecurity(LANConfigSecurity lanConfigSecurity) {
		this.lanConfigSecurity = lanConfigSecurity;
		return this;
	}

	/**
	 * Get the this object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses. It can also include non-IP  hosts.
	 *
	 * @return the value
	 */
	public Hosts getHosts() {
		return hosts;
	}

	/**
	 * Set the this object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses. It can also include non-IP  hosts.
	 *
	 * @param hosts the input value
	 */
	public void  setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

	/**
	 * Set the this object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses. It can also include non-IP  hosts.
	 *
	 * @param hosts the input value
	 * @return this instance
	 */
	public Device withHosts(Hosts hosts) {
		this.hosts = hosts;
		return this;
	}

	/**
	 * Get the properties for Domain Name Service (DNS).
	 *
	 * @return the value
	 */
	public DNS getDns() {
		return dns;
	}

	/**
	 * Set the properties for Domain Name Service (DNS).
	 *
	 * @param dns the input value
	 */
	public void  setDns(DNS dns) {
		this.dns = dns;
	}

	/**
	 * Set the properties for Domain Name Service (DNS).
	 *
	 * @param dns the input value
	 * @return this instance
	 */
	public Device withDns(DNS dns) {
		this.dns = dns;
		return this;
	}

	/**
	 * Get the properties for Network Address Translation (NAT).

        The entire {{object}} object only applies to IPv4.
	 *
	 * @return the value
	 */
	public NAT getNat() {
		return nat;
	}

	/**
	 * Set the properties for Network Address Translation (NAT).

        The entire {{object}} object only applies to IPv4.
	 *
	 * @param nat the input value
	 */
	public void  setNat(NAT nat) {
		this.nat = nat;
	}

	/**
	 * Set the properties for Network Address Translation (NAT).

        The entire {{object}} object only applies to IPv4.
	 *
	 * @param nat the input value
	 * @return this instance
	 */
	public Device withNat(NAT nat) {
		this.nat = nat;
		return this;
	}

	/**
	 * Get the properties for Port Control Protocol (PCP) {{bibref|RFC6887}}.

        See the PCP Theory of Operation {{bibref|TR-181i2a8|Appendix XIV}} for a description of the working of this PCP data model.
	 *
	 * @return the value
	 */
	public PCP getPcp() {
		return pcp;
	}

	/**
	 * Set the properties for Port Control Protocol (PCP) {{bibref|RFC6887}}.

        See the PCP Theory of Operation {{bibref|TR-181i2a8|Appendix XIV}} for a description of the working of this PCP data model.
	 *
	 * @param pcp the input value
	 */
	public void  setPcp(PCP pcp) {
		this.pcp = pcp;
	}

	/**
	 * Set the properties for Port Control Protocol (PCP) {{bibref|RFC6887}}.

        See the PCP Theory of Operation {{bibref|TR-181i2a8|Appendix XIV}} for a description of the working of this PCP data model.
	 *
	 * @param pcp the input value
	 * @return this instance
	 */
	public Device withPcp(PCP pcp) {
		this.pcp = pcp;
		return this;
	}

	/**
	 * Get the Dynamic Host Configuration Protocol (DHCP) IPv4 object {{bibref|RFC2131}}. This entire object applies to IPv4 only. It contains the {{object|Client}}, {{object|Server}}, and {{object|Relay}} objects.
	 *
	 * @return the value
	 */
	public DHCPv4 getDhcPv4() {
		return dhcPv4;
	}

	/**
	 * Set the Dynamic Host Configuration Protocol (DHCP) IPv4 object {{bibref|RFC2131}}. This entire object applies to IPv4 only. It contains the {{object|Client}}, {{object|Server}}, and {{object|Relay}} objects.
	 *
	 * @param dhcPv4 the input value
	 */
	public void  setDhcPv4(DHCPv4 dhcPv4) {
		this.dhcPv4 = dhcPv4;
	}

	/**
	 * Set the Dynamic Host Configuration Protocol (DHCP) IPv4 object {{bibref|RFC2131}}. This entire object applies to IPv4 only. It contains the {{object|Client}}, {{object|Server}}, and {{object|Relay}} objects.
	 *
	 * @param dhcPv4 the input value
	 * @return this instance
	 */
	public Device withDhcPv4(DHCPv4 dhcPv4) {
		this.dhcPv4 = dhcPv4;
		return this;
	}

	/**
	 * Get the Dynamic Host Configuration Protocol (DHCP) IPv6 object {{bibref|RFC3315}}. This entire object applies to IPv6 only. It contains the {{object|Client}} and {{object|Server}} objects.
	 *
	 * @return the value
	 */
	public DHCPv6 getDhcPv6() {
		return dhcPv6;
	}

	/**
	 * Set the Dynamic Host Configuration Protocol (DHCP) IPv6 object {{bibref|RFC3315}}. This entire object applies to IPv6 only. It contains the {{object|Client}} and {{object|Server}} objects.
	 *
	 * @param dhcPv6 the input value
	 */
	public void  setDhcPv6(DHCPv6 dhcPv6) {
		this.dhcPv6 = dhcPv6;
	}

	/**
	 * Set the Dynamic Host Configuration Protocol (DHCP) IPv6 object {{bibref|RFC3315}}. This entire object applies to IPv6 only. It contains the {{object|Client}} and {{object|Server}} objects.
	 *
	 * @param dhcPv6 the input value
	 * @return this instance
	 */
	public Device withDhcPv6(DHCPv6 dhcPv6) {
		this.dhcPv6 = dhcPv6;
		return this;
	}

	/**
	 * Get the ieeE 802.1x object {{bibref|802.1x-2004}}, where {{object|Supplicant}} models authentication supplicants.
	 *
	 * @return the value
	 */
	public IEEE8021x getIeeE8021x() {
		return ieeE8021x;
	}

	/**
	 * Set the ieeE 802.1x object {{bibref|802.1x-2004}}, where {{object|Supplicant}} models authentication supplicants.
	 *
	 * @param ieeE8021x the input value
	 */
	public void  setIeeE8021x(IEEE8021x ieeE8021x) {
		this.ieeE8021x = ieeE8021x;
	}

	/**
	 * Set the ieeE 802.1x object {{bibref|802.1x-2004}}, where {{object|Supplicant}} models authentication supplicants.
	 *
	 * @param ieeE8021x the input value
	 * @return this instance
	 */
	public Device withIeeE8021x(IEEE8021x ieeE8021x) {
		this.ieeE8021x = ieeE8021x;
		return this;
	}

	/**
	 * Get the users object that contains the {{object|User}} table.
	 *
	 * @return the value
	 */
	public Users getUsers() {
		return users;
	}

	/**
	 * Set the users object that contains the {{object|User}} table.
	 *
	 * @param users the input value
	 */
	public void  setUsers(Users users) {
		this.users = users;
	}

	/**
	 * Set the users object that contains the {{object|User}} table.
	 *
	 * @param users the input value
	 * @return this instance
	 */
	public Device withUsers(Users users) {
		this.users = users;
		return this;
	}

	/**
	 * Get the smartCardReaders object that contains the {{object|SmartCardReader}} table.
	 *
	 * @return the value
	 */
	public SmartCardReaders getSmartCardReaders() {
		return smartCardReaders;
	}

	/**
	 * Set the smartCardReaders object that contains the {{object|SmartCardReader}} table.
	 *
	 * @param smartCardReaders the input value
	 */
	public void  setSmartCardReaders(SmartCardReaders smartCardReaders) {
		this.smartCardReaders = smartCardReaders;
	}

	/**
	 * Set the smartCardReaders object that contains the {{object|SmartCardReader}} table.
	 *
	 * @param smartCardReaders the input value
	 * @return this instance
	 */
	public Device withSmartCardReaders(SmartCardReaders smartCardReaders) {
		this.smartCardReaders = smartCardReaders;
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
	public Device withUpnP(UPnP upnP) {
		this.upnP = upnP;
		return this;
	}

	/**
	 * Get the {{object}} object represents the management object for the Remote Entity Functions (REM) functions defined in the M2M Functional Architecture {{bibref|ETSIM2MFA}}.
	 *
	 * @return the value
	 */
	public ETSIM2M getEtsIM2M() {
		return etsIM2M;
	}

	/**
	 * Set the {{object}} object represents the management object for the Remote Entity Functions (REM) functions defined in the M2M Functional Architecture {{bibref|ETSIM2MFA}}.
	 *
	 * @param etsIM2M the input value
	 */
	public void  setEtsIM2M(ETSIM2M etsIM2M) {
		this.etsIM2M = etsIM2M;
	}

	/**
	 * Set the {{object}} object represents the management object for the Remote Entity Functions (REM) functions defined in the M2M Functional Architecture {{bibref|ETSIM2MFA}}.
	 *
	 * @param etsIM2M the input value
	 * @return this instance
	 */
	public Device withEtsIM2M(ETSIM2M etsIM2M) {
		this.etsIM2M = etsIM2M;
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
	public Device withDlnA(DLNA dlnA) {
		this.dlnA = dlnA;
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
	public Device withSelfTestDiagnostics(SelfTestDiagnostics selfTestDiagnostics) {
		this.selfTestDiagnostics = selfTestDiagnostics;
		return this;
	}

	/**
	 * Get the firewall configuration object. The {{param|Config}} parameter enables and disables the Firewall, and can select either a predefined configuration ({{enum|High|Config}} or {{enum|Low|Config}}) or an explicitly-defined {{enum|Advanced|Config}} configuration.

        For an {{enum|Advanced|Config}} configuration, {{param|AdvancedLevel}} controls the currently active Firewall Level, and the Firewall Levels are defined in the {{object|Level}}, {{object|Chain}} and {{object|Chain.{i}.Rule}} tables.

        The Firewall rules modeled by this object operate only on the forwarding path. This means that they affect only routed traffic, and do not affect traffic that is destined for or generated by the CPE.  Note that any {{object|#.NAT}} processing on the ingress packet occurs before Firewall rules are applied so, for example, the Firewall rules will see the translated destination IP address and port in a downstream packet that has passed through the NAT.

        See {{bibref|TR-181i2a2|Appendix VIII}} for an example {{enum|Advanced|Config}} configuration.
	 *
	 * @return the value
	 */
	public Firewall getFirewall() {
		return firewall;
	}

	/**
	 * Set the firewall configuration object. The {{param|Config}} parameter enables and disables the Firewall, and can select either a predefined configuration ({{enum|High|Config}} or {{enum|Low|Config}}) or an explicitly-defined {{enum|Advanced|Config}} configuration.

        For an {{enum|Advanced|Config}} configuration, {{param|AdvancedLevel}} controls the currently active Firewall Level, and the Firewall Levels are defined in the {{object|Level}}, {{object|Chain}} and {{object|Chain.{i}.Rule}} tables.

        The Firewall rules modeled by this object operate only on the forwarding path. This means that they affect only routed traffic, and do not affect traffic that is destined for or generated by the CPE.  Note that any {{object|#.NAT}} processing on the ingress packet occurs before Firewall rules are applied so, for example, the Firewall rules will see the translated destination IP address and port in a downstream packet that has passed through the NAT.

        See {{bibref|TR-181i2a2|Appendix VIII}} for an example {{enum|Advanced|Config}} configuration.
	 *
	 * @param firewall the input value
	 */
	public void  setFirewall(Firewall firewall) {
		this.firewall = firewall;
	}

	/**
	 * Set the firewall configuration object. The {{param|Config}} parameter enables and disables the Firewall, and can select either a predefined configuration ({{enum|High|Config}} or {{enum|Low|Config}}) or an explicitly-defined {{enum|Advanced|Config}} configuration.

        For an {{enum|Advanced|Config}} configuration, {{param|AdvancedLevel}} controls the currently active Firewall Level, and the Firewall Levels are defined in the {{object|Level}}, {{object|Chain}} and {{object|Chain.{i}.Rule}} tables.

        The Firewall rules modeled by this object operate only on the forwarding path. This means that they affect only routed traffic, and do not affect traffic that is destined for or generated by the CPE.  Note that any {{object|#.NAT}} processing on the ingress packet occurs before Firewall rules are applied so, for example, the Firewall rules will see the translated destination IP address and port in a downstream packet that has passed through the NAT.

        See {{bibref|TR-181i2a2|Appendix VIII}} for an example {{enum|Advanced|Config}} configuration.
	 *
	 * @param firewall the input value
	 * @return this instance
	 */
	public Device withFirewall(Firewall firewall) {
		this.firewall = firewall;
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
	public Device withPeriodicStatistics(PeriodicStatistics periodicStatistics) {
		this.periodicStatistics = periodicStatistics;
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
	public Device withSoftwareModules(SoftwareModules softwareModules) {
		this.softwareModules = softwareModules;
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
	public Device withFaultMgmt(FaultMgmt faultMgmt) {
		this.faultMgmt = faultMgmt;
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
	public Device withSecurity(Security security) {
		this.security = security;
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
	public Device withFap(FAP fap) {
		this.fap = fap;
		return this;
	}

	/**
	 * Get the this object provides bulk data collection capabilities and global collection settings that affect the entire device.

        Bulk Data utilizes various solutions (e.g., IPDR, HTTP) to collect data from devices and transfer the data to a collection server.        

        The IPDR solution is based on a service specification described in {{bibref|TR-232}}.

        The HTTP solution is based on transfer mechanisms described in {{bibref|TR-157a10|Annex A}}.

        The Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.
	 *
	 * @return the value
	 */
	public BulkData getBulkData() {
		return bulkData;
	}

	/**
	 * Set the this object provides bulk data collection capabilities and global collection settings that affect the entire device.

        Bulk Data utilizes various solutions (e.g., IPDR, HTTP) to collect data from devices and transfer the data to a collection server.        

        The IPDR solution is based on a service specification described in {{bibref|TR-232}}.

        The HTTP solution is based on transfer mechanisms described in {{bibref|TR-157a10|Annex A}}.

        The Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.
	 *
	 * @param bulkData the input value
	 */
	public void  setBulkData(BulkData bulkData) {
		this.bulkData = bulkData;
	}

	/**
	 * Set the this object provides bulk data collection capabilities and global collection settings that affect the entire device.

        Bulk Data utilizes various solutions (e.g., IPDR, HTTP) to collect data from devices and transfer the data to a collection server.        

        The IPDR solution is based on a service specification described in {{bibref|TR-232}}.

        The HTTP solution is based on transfer mechanisms described in {{bibref|TR-157a10|Annex A}}.

        The Bulk Data Collection Profiles are measured over a reporting interval (which can be aligned with absolute time) and are made available to the collection server.
	 *
	 * @param bulkData the input value
	 * @return this instance
	 */
	public Device withBulkData(BulkData bulkData) {
		this.bulkData = bulkData;
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
	public Device withXmpP(XMPP xmpP) {
		this.xmpP = xmpP;
		return this;
	}

	/**
	 * Get the this object represents the management functions for the 1905 capabilities as defined in {{bibref|IEEE1905.1a}}.
	 *
	 * @return the value
	 */
	public IEEE1905 getIeeE1905() {
		return ieeE1905;
	}

	/**
	 * Set the this object represents the management functions for the 1905 capabilities as defined in {{bibref|IEEE1905.1a}}.
	 *
	 * @param ieeE1905 the input value
	 */
	public void  setIeeE1905(IEEE1905 ieeE1905) {
		this.ieeE1905 = ieeE1905;
	}

	/**
	 * Set the this object represents the management functions for the 1905 capabilities as defined in {{bibref|IEEE1905.1a}}.
	 *
	 * @param ieeE1905 the input value
	 * @return this instance
	 */
	public Device withIeeE1905(IEEE1905 ieeE1905) {
		this.ieeE1905 = ieeE1905;
		return this;
	}

	/**
	 * Get the mqtT Base object describing all MQTT related parameters and objects {{bibref|MQTT31}},
	 *
	 * @return the value
	 */
	public MQTT getMqtT() {
		return mqtT;
	}

	/**
	 * Set the mqtT Base object describing all MQTT related parameters and objects {{bibref|MQTT31}},
	 *
	 * @param mqtT the input value
	 */
	public void  setMqtT(MQTT mqtT) {
		this.mqtT = mqtT;
	}

	/**
	 * Set the mqtT Base object describing all MQTT related parameters and objects {{bibref|MQTT31}},
	 *
	 * @param mqtT the input value
	 * @return this instance
	 */
	public Device withMqtT(MQTT mqtT) {
		this.mqtT = mqtT;
		return this;
	}

	/**
	 * Get the properties for Dynamic DNS.
	 *
	 * @return the value
	 */
	public DynamicDNS getDynamicDNS() {
		return dynamicDNS;
	}

	/**
	 * Set the properties for Dynamic DNS.
	 *
	 * @param dynamicDNS the input value
	 */
	public void  setDynamicDNS(DynamicDNS dynamicDNS) {
		this.dynamicDNS = dynamicDNS;
	}

	/**
	 * Set the properties for Dynamic DNS.
	 *
	 * @param dynamicDNS the input value
	 * @return this instance
	 */
	public Device withDynamicDNS(DynamicDNS dynamicDNS) {
		this.dynamicDNS = dynamicDNS;
		return this;
	}

	//</editor-fold>

}