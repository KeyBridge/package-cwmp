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
package org.broadbandforum.tr181.device.ghn;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.ghn._interface.AssociatedDevice;
import org.broadbandforum.tr181.device.ghn._interface.DMInfo;
import org.broadbandforum.tr181.device.ghn._interface.SCInfo;
import org.broadbandforum.tr181.device.ghn._interface.SMMaskedBand;
import org.broadbandforum.tr181.device.ghn._interface.Stats;

	/**
	 * G.hn interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY {{bibref|G.9960}} and MAC {{bibref|G.9961}} layers of a G.hn interface.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.Ghn.Interface.{i}.")
@XmlRootElement(name = "Interface")
@XmlType(name = "Device.Ghn.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interface {

	/**
	 * Enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * Indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Upstream")
	public Boolean upstream;
	/**
	 * The MAC Address of the interface, denoted as node MAC address or REGID in {{bibref|G.9961}}.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * The firmware version of the interface.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "FirmwareVersion")
	@Size(max = 64)
	public String firmwareVersion;
	/**
	 * This parameter is DEPRECATED because it has been replaced by {{param|MediumType}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ConnectionType")
	public String connectionType;
	/**
	 * The maximum PHY data rate that the interface is capable of transmitting (expressed in Mbps).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MaxTransmitRate")
	public Long maxTransmitRate;
	/**
	 * {{list}}  Identifies the target domains configured by the user, as described in {{bibref|G.9961|Section 8.6.1}}. When registering or re-registering, the G.hn interface SHOULD try to register to one of these domains in the given order.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "TargetDomainNames")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> targetDomainNames;
	/**
	 * This is the domain name to which the interface is currently registered.

          {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DomainName")
	@Size(max = 32)
	public String domainName;
	/**
	 * The Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DomainNameIdentifier")
	public Long domainNameIdentifier;
	/**
	 * The Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DomainId")
	public Long domainId;
	/**
	 * The Device Identifier assigned by the Domain Master, denoted as DEVICE_ID in {{bibref|G.9961}}.

          The value 0 indicates that the device is not currently registered.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DeviceId")
	public Long deviceId;
	/**
	 * The maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MaxBitRate")
	public Long maxBitRate;
	/**
	 * Indicates whether this interface has the capability to act as Domain Master in the G.hn domain.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "NodeTypeDMCapable")
	public Boolean nodeTypeDMCapable;
	/**
	 * Indicates a request to force the role of the G.hn interface to Domain Master (DM) for the G.hn domain it is connected to. The selection of the Domain Master follows the procedures described in {{bibref|G.9961|Clause 8.6.6}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DMRequested")
	@CWMPParameter(access = "readWrite")
	public Boolean dmrequested;
	/**
	 * Indicates whether this G.hn interface is currently the Domain Master (DM) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 8.6}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IsDM")
	public Boolean isdM;
	/**
	 * Indicates whether this interface has the capability to act as Security Controller in the G.hn domain.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "NodeTypeSCCapable")
	public Boolean nodeTypeSCCapable;
	/**
	 * Indicates a request to force the role of the G.hn interface to Security Controller (SC) for the G.hn domain it is connected to. The selection of the Security Controller follows the procedures described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SCRequested")
	@CWMPParameter(access = "readWrite")
	public Boolean screquested;
	/**
	 * Indicates whether this G.hn interface is currently the Security Controller (SC) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IsSC")
	public Boolean issC;
	/**
	 * The standard versions that the interface supports. The list MUST have an even number of items.  The first item of each pair represents an ITU-T G.hn Recommendation while the second element of each pair represents the amendment version of the indicated Recommendation that this interface supports (the value 0 corresponds to the base Recommendation).

          For example, to indicate support for the G.9960 base document and G.9961 amendment 1, the corresponding list would be "G9960,0,G9961,1".
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "StandardVersions")
	@XmlList
	public Collection<String> standardVersions;
	/**
	 * The largest bandplan that the interface can support, as defined in {{bibref|G.9961|Clause 8.8.5.5}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MaxBandPlan")
	public Long maxBandPlan;
	/**
	 * The medium type that the interface currently operates on.  Refer to {{bibref|G.9962|Table 7-5}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MediumType")
	public String mediumType;
	/**
	 * The Acknowledgement InterFrame Gap, or TAIFG, as defined in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 1.28 microseconds.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "TAIFG")
	public Long taiFG;
	/**
	 * A bit map representing usage of international amateur bands (0 = masked, 1 = unmasked). The LSB represents the lowest band (1.8-2.0 MHz), the second LSB represents the second lowest band (3.5-4.0 MHz), and so on. The maximum value for this parameter is 0x03FF, i.e. it is a 10-bit quantity represented in 16 bits and the top 6 bits are always zero.

          International Radio amateur bands are described in {{bibref|G.9964|Table D-1}} and conveyed by the Domain Master in the Amateur radio band descriptor (see {{bibref|G.9961|Table 8-77}}).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "NotchedAmateurRadioBands")
	@CWMPParameter(access = "readWrite")
	public byte[] notchedAmateurRadioBands;
	/**
	 * Comma-separated list of DeviceIDs of nodes that need to enable their PHY throughput diagnostics mode. All devices that are enabled will participate in the G.hn network PHY throughput diagnostics process.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PHYThroughputDiagnosticsEnable")
	@CWMPParameter(access = "readWrite")
	public String phyThroughputDiagnosticsEnable;
	/**
	 * Comma-separated list of DeviceIDs of nodes that need to enable their Performance Monitoring diagnostics mode on this node. All devices that are enabled will participate in the G.hn network Performance Monitoring diagnostics process.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PerformanceMonitoringDiagnosticsEnable")
	@CWMPParameter(access = "readWrite")
	public String performanceMonitoringDiagnosticsEnable;
	/**
	 * Requests the interface to become the Domain Master in the G.hn domain.

          This parameter is valid only if {{param|NodeTypeDMCapable}} is {{true}}.

          Note that, if more than one node is configured to act as Domain Master, G.hn specifies a protocol to ensure only one device actually becomes DM.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "NodeTypeDMConfig")
	@CWMPParameter(access = "readWrite")
	public Boolean nodeTypeDMConfig;
	/**
	 * Indicates whether the interface is acting as Domain Master ({{true}}) or not ({{false}}).

          See Note in {{param|NodeTypeDMConfig}} regarding the possibility of more than one node being configured with {{param|NodeTypeDMConfig}} = {{true}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "NodeTypeDMStatus")
	public Boolean nodeTypeDMStatus;
	/**
	 * Indicates whether the interface is acting as Security Controller ({{true}}) or not ({{false}}).
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "NodeTypeSCStatus")
	public Boolean nodeTypeSCStatus;
	/**
	 * This object specifies management parameters pertaining to the domain functionality (Domain Master function; see {{bibref|G.9961|Clause 8.6}}). The object exists only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 */
	@XmlElement(name = "DMInfo")
	public DMInfo dminfo;
	/**
	 * This object specifies management parameters pertaining to the Security Controller functionality (Security Controller function; see {{bibref|G.9961|Clause 9.2}}). The object exists only on G.hn interfaces that are currently the Security Controller, i.e. for which parameter {{param|#.IsSC}} is {{true}}.
	 */
	@XmlElement(name = "SCInfo")
	public SCInfo scinfo;
	/**
	 * Specifies the list of masked bands to be applied to the G.hn interface.  This information is conveyed by the Domain Master in the SM descriptor as specified in {{bibref|G.9961|Table 8-77}}.

        Instances of this object are expected to exist only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 */
	@XmlElementWrapper(name = "SMMaskedBands")
	@XmlElement(name = "SMMaskedBand")
	@CWMPParameter(access = "readWrite", maxEntries = 32)
	public Collection<SMMaskedBand> smmaskedBands;
	/**
	 * Throughput statistics for this interface at the different G.hn reference points described in {{bibref|G.9961|Clause 8.1}}.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This table contains information about other G.hn devices connected to this G.hn interface.
	 */
	@XmlElementWrapper(name = "AssociatedDevices")
	@XmlElement(name = "AssociatedDevice")
	public Collection<AssociatedDevice> associatedDevices;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @param enable the input value
	 * @return this instance
	 */
	public Interface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.4
	 * @param status the input value
	 * @return this instance
	 */
	public Interface withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @param alias the input value
	 * @return this instance
	 */
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.4
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.4
	 * @param name the input value
	 * @return this instance
	 */
	public Interface withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.4
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.4
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}}  {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.4
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isUpstream() {
		return upstream;
	}

	/**
	 * Set the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.4
	 * @param upstream the input value
	 */
	public void  setUpstream(Boolean upstream) {
		this.upstream = upstream;
	}

	/**
	 * Set the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.4
	 * @param upstream the input value
	 * @return this instance
	 */
	public Interface withUpstream(Boolean upstream) {
		this.upstream = upstream;
		return this;
	}

	/**
	 * Get the MAC Address of the interface, denoted as node MAC address or REGID in {{bibref|G.9961}}.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the MAC Address of the interface, denoted as node MAC address or REGID in {{bibref|G.9961}}.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.4
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the MAC Address of the interface, denoted as node MAC address or REGID in {{bibref|G.9961}}.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.4
	 * @param macAddress the input value
	 * @return this instance
	 */
	public Interface withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the firmware version of the interface.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Set the firmware version of the interface.
	 *
	 * @since 2.4
	 * @param firmwareVersion the input value
	 */
	public void  setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Set the firmware version of the interface.
	 *
	 * @since 2.4
	 * @param firmwareVersion the input value
	 * @return this instance
	 */
	public Interface withFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		return this;
	}

	/**
	 * Get the this parameter is DEPRECATED because it has been replaced by {{param|MediumType}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * Set the this parameter is DEPRECATED because it has been replaced by {{param|MediumType}}.
	 *
	 * @since 2.4
	 * @param connectionType the input value
	 */
	public void  setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	/**
	 * Set the this parameter is DEPRECATED because it has been replaced by {{param|MediumType}}.
	 *
	 * @since 2.4
	 * @param connectionType the input value
	 * @return this instance
	 */
	public Interface withConnectionType(String connectionType) {
		this.connectionType = connectionType;
		return this;
	}

	/**
	 * Get the maximum PHY data rate that the interface is capable of transmitting (expressed in Mbps).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getMaxTransmitRate() {
		return maxTransmitRate;
	}

	/**
	 * Set the maximum PHY data rate that the interface is capable of transmitting (expressed in Mbps).
	 *
	 * @since 2.8
	 * @param maxTransmitRate the input value
	 */
	public void  setMaxTransmitRate(Long maxTransmitRate) {
		this.maxTransmitRate = maxTransmitRate;
	}

	/**
	 * Set the maximum PHY data rate that the interface is capable of transmitting (expressed in Mbps).
	 *
	 * @since 2.8
	 * @param maxTransmitRate the input value
	 * @return this instance
	 */
	public Interface withMaxTransmitRate(Long maxTransmitRate) {
		this.maxTransmitRate = maxTransmitRate;
		return this;
	}

	/**
	 * Get the {{list}}  Identifies the target domains configured by the user, as described in {{bibref|G.9961|Section 8.6.1}}. When registering or re-registering, the G.hn interface SHOULD try to register to one of these domains in the given order.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Collection<String> getTargetDomainNames() {
		if (this.targetDomainNames == null){ this.targetDomainNames=new ArrayList<>();}
		return targetDomainNames;
	}

	/**
	 * Set the {{list}}  Identifies the target domains configured by the user, as described in {{bibref|G.9961|Section 8.6.1}}. When registering or re-registering, the G.hn interface SHOULD try to register to one of these domains in the given order.
	 *
	 * @since 2.4
	 * @param targetDomainNames the input value
	 */
	public void  setTargetDomainNames(Collection<String> targetDomainNames) {
		this.targetDomainNames = targetDomainNames;
	}

	/**
	 * Set the {{list}}  Identifies the target domains configured by the user, as described in {{bibref|G.9961|Section 8.6.1}}. When registering or re-registering, the G.hn interface SHOULD try to register to one of these domains in the given order.
	 *
	 * @since 2.4
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withTargetDomainNames(String string) {
		getTargetDomainNames().add(string);
		return this;
	}

	/**
	 * Get the this is the domain name to which the interface is currently registered.

          {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Set the this is the domain name to which the interface is currently registered.

          {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.4
	 * @param domainName the input value
	 */
	public void  setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Set the this is the domain name to which the interface is currently registered.

          {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.4
	 * @param domainName the input value
	 * @return this instance
	 */
	public Interface withDomainName(String domainName) {
		this.domainName = domainName;
		return this;
	}

	/**
	 * Get the Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getDomainNameIdentifier() {
		return domainNameIdentifier;
	}

	/**
	 * Set the Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.4
	 * @param domainNameIdentifier the input value
	 */
	public void  setDomainNameIdentifier(Long domainNameIdentifier) {
		this.domainNameIdentifier = domainNameIdentifier;
	}

	/**
	 * Set the Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.4
	 * @param domainNameIdentifier the input value
	 * @return this instance
	 */
	public Interface withDomainNameIdentifier(Long domainNameIdentifier) {
		this.domainNameIdentifier = domainNameIdentifier;
		return this;
	}

	/**
	 * Get the Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getDomainId() {
		return domainId;
	}

	/**
	 * Set the Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @param domainId the input value
	 */
	public void  setDomainId(Long domainId) {
		this.domainId = domainId;
	}

	/**
	 * Set the Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @param domainId the input value
	 * @return this instance
	 */
	public Interface withDomainId(Long domainId) {
		this.domainId = domainId;
		return this;
	}

	/**
	 * Get the Device Identifier assigned by the Domain Master, denoted as DEVICE_ID in {{bibref|G.9961}}.

          The value 0 indicates that the device is not currently registered.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getDeviceId() {
		return deviceId;
	}

	/**
	 * Set the Device Identifier assigned by the Domain Master, denoted as DEVICE_ID in {{bibref|G.9961}}.

          The value 0 indicates that the device is not currently registered.
	 *
	 * @since 2.4
	 * @param deviceId the input value
	 */
	public void  setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * Set the Device Identifier assigned by the Domain Master, denoted as DEVICE_ID in {{bibref|G.9961}}.

          The value 0 indicates that the device is not currently registered.
	 *
	 * @since 2.4
	 * @param deviceId the input value
	 * @return this instance
	 */
	public Interface withDeviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Get the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.4
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.4
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public Interface withMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the indicates whether this interface has the capability to act as Domain Master in the G.hn domain.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isNodeTypeDMCapable() {
		return nodeTypeDMCapable;
	}

	/**
	 * Set the indicates whether this interface has the capability to act as Domain Master in the G.hn domain.
	 *
	 * @since 2.4
	 * @param nodeTypeDMCapable the input value
	 */
	public void  setNodeTypeDMCapable(Boolean nodeTypeDMCapable) {
		this.nodeTypeDMCapable = nodeTypeDMCapable;
	}

	/**
	 * Set the indicates whether this interface has the capability to act as Domain Master in the G.hn domain.
	 *
	 * @since 2.4
	 * @param nodeTypeDMCapable the input value
	 * @return this instance
	 */
	public Interface withNodeTypeDMCapable(Boolean nodeTypeDMCapable) {
		this.nodeTypeDMCapable = nodeTypeDMCapable;
		return this;
	}

	/**
	 * Get the indicates a request to force the role of the G.hn interface to Domain Master (DM) for the G.hn domain it is connected to. The selection of the Domain Master follows the procedures described in {{bibref|G.9961|Clause 8.6.6}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isDmrequested() {
		return dmrequested;
	}

	/**
	 * Set the indicates a request to force the role of the G.hn interface to Domain Master (DM) for the G.hn domain it is connected to. The selection of the Domain Master follows the procedures described in {{bibref|G.9961|Clause 8.6.6}}.
	 *
	 * @since 2.8
	 * @param dmrequested the input value
	 */
	public void  setDmrequested(Boolean dmrequested) {
		this.dmrequested = dmrequested;
	}

	/**
	 * Set the indicates a request to force the role of the G.hn interface to Domain Master (DM) for the G.hn domain it is connected to. The selection of the Domain Master follows the procedures described in {{bibref|G.9961|Clause 8.6.6}}.
	 *
	 * @since 2.8
	 * @param dmrequested the input value
	 * @return this instance
	 */
	public Interface withDmrequested(Boolean dmrequested) {
		this.dmrequested = dmrequested;
		return this;
	}

	/**
	 * Get the indicates whether this G.hn interface is currently the Domain Master (DM) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 8.6}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIsdM() {
		return isdM;
	}

	/**
	 * Set the indicates whether this G.hn interface is currently the Domain Master (DM) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 8.6}}.
	 *
	 * @since 2.8
	 * @param isdM the input value
	 */
	public void  setIsdM(Boolean isdM) {
		this.isdM = isdM;
	}

	/**
	 * Set the indicates whether this G.hn interface is currently the Domain Master (DM) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 8.6}}.
	 *
	 * @since 2.8
	 * @param isdM the input value
	 * @return this instance
	 */
	public Interface withIsdM(Boolean isdM) {
		this.isdM = isdM;
		return this;
	}

	/**
	 * Get the indicates whether this interface has the capability to act as Security Controller in the G.hn domain.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isNodeTypeSCCapable() {
		return nodeTypeSCCapable;
	}

	/**
	 * Set the indicates whether this interface has the capability to act as Security Controller in the G.hn domain.
	 *
	 * @since 2.4
	 * @param nodeTypeSCCapable the input value
	 */
	public void  setNodeTypeSCCapable(Boolean nodeTypeSCCapable) {
		this.nodeTypeSCCapable = nodeTypeSCCapable;
	}

	/**
	 * Set the indicates whether this interface has the capability to act as Security Controller in the G.hn domain.
	 *
	 * @since 2.4
	 * @param nodeTypeSCCapable the input value
	 * @return this instance
	 */
	public Interface withNodeTypeSCCapable(Boolean nodeTypeSCCapable) {
		this.nodeTypeSCCapable = nodeTypeSCCapable;
		return this;
	}

	/**
	 * Get the indicates a request to force the role of the G.hn interface to Security Controller (SC) for the G.hn domain it is connected to. The selection of the Security Controller follows the procedures described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isScrequested() {
		return screquested;
	}

	/**
	 * Set the indicates a request to force the role of the G.hn interface to Security Controller (SC) for the G.hn domain it is connected to. The selection of the Security Controller follows the procedures described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @param screquested the input value
	 */
	public void  setScrequested(Boolean screquested) {
		this.screquested = screquested;
	}

	/**
	 * Set the indicates a request to force the role of the G.hn interface to Security Controller (SC) for the G.hn domain it is connected to. The selection of the Security Controller follows the procedures described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @param screquested the input value
	 * @return this instance
	 */
	public Interface withScrequested(Boolean screquested) {
		this.screquested = screquested;
		return this;
	}

	/**
	 * Get the indicates whether this G.hn interface is currently the Security Controller (SC) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIssC() {
		return issC;
	}

	/**
	 * Set the indicates whether this G.hn interface is currently the Security Controller (SC) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @param issC the input value
	 */
	public void  setIssC(Boolean issC) {
		this.issC = issC;
	}

	/**
	 * Set the indicates whether this G.hn interface is currently the Security Controller (SC) for the G.hn domain it is connected to, as described in {{bibref|G.9961|Clause 9.2}}.
	 *
	 * @since 2.8
	 * @param issC the input value
	 * @return this instance
	 */
	public Interface withIssC(Boolean issC) {
		this.issC = issC;
		return this;
	}

	/**
	 * Get the standard versions that the interface supports. The list MUST have an even number of items.  The first item of each pair represents an ITU-T G.hn Recommendation while the second element of each pair represents the amendment version of the indicated Recommendation that this interface supports (the value 0 corresponds to the base Recommendation).

          For example, to indicate support for the G.9960 base document and G.9961 amendment 1, the corresponding list would be "G9960,0,G9961,1".
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getStandardVersions() {
		if (this.standardVersions == null){ this.standardVersions=new ArrayList<>();}
		return standardVersions;
	}

	/**
	 * Set the standard versions that the interface supports. The list MUST have an even number of items.  The first item of each pair represents an ITU-T G.hn Recommendation while the second element of each pair represents the amendment version of the indicated Recommendation that this interface supports (the value 0 corresponds to the base Recommendation).

          For example, to indicate support for the G.9960 base document and G.9961 amendment 1, the corresponding list would be "G9960,0,G9961,1".
	 *
	 * @since 2.8
	 * @param standardVersions the input value
	 */
	public void  setStandardVersions(Collection<String> standardVersions) {
		this.standardVersions = standardVersions;
	}

	/**
	 * Set the standard versions that the interface supports. The list MUST have an even number of items.  The first item of each pair represents an ITU-T G.hn Recommendation while the second element of each pair represents the amendment version of the indicated Recommendation that this interface supports (the value 0 corresponds to the base Recommendation).

          For example, to indicate support for the G.9960 base document and G.9961 amendment 1, the corresponding list would be "G9960,0,G9961,1".
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withStandardVersions(String string) {
		getStandardVersions().add(string);
		return this;
	}

	/**
	 * Get the largest bandplan that the interface can support, as defined in {{bibref|G.9961|Clause 8.8.5.5}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getMaxBandPlan() {
		return maxBandPlan;
	}

	/**
	 * Set the largest bandplan that the interface can support, as defined in {{bibref|G.9961|Clause 8.8.5.5}}.
	 *
	 * @since 2.8
	 * @param maxBandPlan the input value
	 */
	public void  setMaxBandPlan(Long maxBandPlan) {
		this.maxBandPlan = maxBandPlan;
	}

	/**
	 * Set the largest bandplan that the interface can support, as defined in {{bibref|G.9961|Clause 8.8.5.5}}.
	 *
	 * @since 2.8
	 * @param maxBandPlan the input value
	 * @return this instance
	 */
	public Interface withMaxBandPlan(Long maxBandPlan) {
		this.maxBandPlan = maxBandPlan;
		return this;
	}

	/**
	 * Get the medium type that the interface currently operates on.  Refer to {{bibref|G.9962|Table 7-5}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getMediumType() {
		return mediumType;
	}

	/**
	 * Set the medium type that the interface currently operates on.  Refer to {{bibref|G.9962|Table 7-5}}.
	 *
	 * @since 2.8
	 * @param mediumType the input value
	 */
	public void  setMediumType(String mediumType) {
		this.mediumType = mediumType;
	}

	/**
	 * Set the medium type that the interface currently operates on.  Refer to {{bibref|G.9962|Table 7-5}}.
	 *
	 * @since 2.8
	 * @param mediumType the input value
	 * @return this instance
	 */
	public Interface withMediumType(String mediumType) {
		this.mediumType = mediumType;
		return this;
	}

	/**
	 * Get the Acknowledgement InterFrame Gap, or TAIFG, as defined in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 1.28 microseconds.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getTaiFG() {
		return taiFG;
	}

	/**
	 * Set the Acknowledgement InterFrame Gap, or TAIFG, as defined in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 1.28 microseconds.
	 *
	 * @since 2.8
	 * @param taiFG the input value
	 */
	public void  setTaiFG(Long taiFG) {
		this.taiFG = taiFG;
	}

	/**
	 * Set the Acknowledgement InterFrame Gap, or TAIFG, as defined in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 1.28 microseconds.
	 *
	 * @since 2.8
	 * @param taiFG the input value
	 * @return this instance
	 */
	public Interface withTaiFG(Long taiFG) {
		this.taiFG = taiFG;
		return this;
	}

	/**
	 * Get a bit map representing usage of international amateur bands (0 = masked, 1 = unmasked). The LSB represents the lowest band (1.8-2.0 MHz), the second LSB represents the second lowest band (3.5-4.0 MHz), and so on. The maximum value for this parameter is 0x03FF, i.e. it is a 10-bit quantity represented in 16 bits and the top 6 bits are always zero.

          International Radio amateur bands are described in {{bibref|G.9964|Table D-1}} and conveyed by the Domain Master in the Amateur radio band descriptor (see {{bibref|G.9961|Table 8-77}}).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getNotchedAmateurRadioBands() {
		return notchedAmateurRadioBands;
	}

	/**
	 * Set a bit map representing usage of international amateur bands (0 = masked, 1 = unmasked). The LSB represents the lowest band (1.8-2.0 MHz), the second LSB represents the second lowest band (3.5-4.0 MHz), and so on. The maximum value for this parameter is 0x03FF, i.e. it is a 10-bit quantity represented in 16 bits and the top 6 bits are always zero.

          International Radio amateur bands are described in {{bibref|G.9964|Table D-1}} and conveyed by the Domain Master in the Amateur radio band descriptor (see {{bibref|G.9961|Table 8-77}}).
	 *
	 * @since 2.8
	 * @param notchedAmateurRadioBands the input value
	 */
	public void  setNotchedAmateurRadioBands(byte[] notchedAmateurRadioBands) {
		this.notchedAmateurRadioBands = notchedAmateurRadioBands;
	}

	/**
	 * Set a bit map representing usage of international amateur bands (0 = masked, 1 = unmasked). The LSB represents the lowest band (1.8-2.0 MHz), the second LSB represents the second lowest band (3.5-4.0 MHz), and so on. The maximum value for this parameter is 0x03FF, i.e. it is a 10-bit quantity represented in 16 bits and the top 6 bits are always zero.

          International Radio amateur bands are described in {{bibref|G.9964|Table D-1}} and conveyed by the Domain Master in the Amateur radio band descriptor (see {{bibref|G.9961|Table 8-77}}).
	 *
	 * @since 2.8
	 * @param notchedAmateurRadioBands the input value
	 * @return this instance
	 */
	public Interface withNotchedAmateurRadioBands(byte[] notchedAmateurRadioBands) {
		this.notchedAmateurRadioBands = notchedAmateurRadioBands;
		return this;
	}

	/**
	 * Get the comma-separated list of DeviceIDs of nodes that need to enable their PHY throughput diagnostics mode. All devices that are enabled will participate in the G.hn network PHY throughput diagnostics process.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPhyThroughputDiagnosticsEnable() {
		return phyThroughputDiagnosticsEnable;
	}

	/**
	 * Set the comma-separated list of DeviceIDs of nodes that need to enable their PHY throughput diagnostics mode. All devices that are enabled will participate in the G.hn network PHY throughput diagnostics process.
	 *
	 * @since 2.8
	 * @param phyThroughputDiagnosticsEnable the input value
	 */
	public void  setPhyThroughputDiagnosticsEnable(String phyThroughputDiagnosticsEnable) {
		this.phyThroughputDiagnosticsEnable = phyThroughputDiagnosticsEnable;
	}

	/**
	 * Set the comma-separated list of DeviceIDs of nodes that need to enable their PHY throughput diagnostics mode. All devices that are enabled will participate in the G.hn network PHY throughput diagnostics process.
	 *
	 * @since 2.8
	 * @param phyThroughputDiagnosticsEnable the input value
	 * @return this instance
	 */
	public Interface withPhyThroughputDiagnosticsEnable(String phyThroughputDiagnosticsEnable) {
		this.phyThroughputDiagnosticsEnable = phyThroughputDiagnosticsEnable;
		return this;
	}

	/**
	 * Get the comma-separated list of DeviceIDs of nodes that need to enable their Performance Monitoring diagnostics mode on this node. All devices that are enabled will participate in the G.hn network Performance Monitoring diagnostics process.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getPerformanceMonitoringDiagnosticsEnable() {
		return performanceMonitoringDiagnosticsEnable;
	}

	/**
	 * Set the comma-separated list of DeviceIDs of nodes that need to enable their Performance Monitoring diagnostics mode on this node. All devices that are enabled will participate in the G.hn network Performance Monitoring diagnostics process.
	 *
	 * @since 2.8
	 * @param performanceMonitoringDiagnosticsEnable the input value
	 */
	public void  setPerformanceMonitoringDiagnosticsEnable(String performanceMonitoringDiagnosticsEnable) {
		this.performanceMonitoringDiagnosticsEnable = performanceMonitoringDiagnosticsEnable;
	}

	/**
	 * Set the comma-separated list of DeviceIDs of nodes that need to enable their Performance Monitoring diagnostics mode on this node. All devices that are enabled will participate in the G.hn network Performance Monitoring diagnostics process.
	 *
	 * @since 2.8
	 * @param performanceMonitoringDiagnosticsEnable the input value
	 * @return this instance
	 */
	public Interface withPerformanceMonitoringDiagnosticsEnable(String performanceMonitoringDiagnosticsEnable) {
		this.performanceMonitoringDiagnosticsEnable = performanceMonitoringDiagnosticsEnable;
		return this;
	}

	/**
	 * Get the requests the interface to become the Domain Master in the G.hn domain.

          This parameter is valid only if {{param|NodeTypeDMCapable}} is {{true}}.

          Note that, if more than one node is configured to act as Domain Master, G.hn specifies a protocol to ensure only one device actually becomes DM.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isNodeTypeDMConfig() {
		return nodeTypeDMConfig;
	}

	/**
	 * Set the requests the interface to become the Domain Master in the G.hn domain.

          This parameter is valid only if {{param|NodeTypeDMCapable}} is {{true}}.

          Note that, if more than one node is configured to act as Domain Master, G.hn specifies a protocol to ensure only one device actually becomes DM.
	 *
	 * @since 2.4
	 * @param nodeTypeDMConfig the input value
	 */
	public void  setNodeTypeDMConfig(Boolean nodeTypeDMConfig) {
		this.nodeTypeDMConfig = nodeTypeDMConfig;
	}

	/**
	 * Set the requests the interface to become the Domain Master in the G.hn domain.

          This parameter is valid only if {{param|NodeTypeDMCapable}} is {{true}}.

          Note that, if more than one node is configured to act as Domain Master, G.hn specifies a protocol to ensure only one device actually becomes DM.
	 *
	 * @since 2.4
	 * @param nodeTypeDMConfig the input value
	 * @return this instance
	 */
	public Interface withNodeTypeDMConfig(Boolean nodeTypeDMConfig) {
		this.nodeTypeDMConfig = nodeTypeDMConfig;
		return this;
	}

	/**
	 * Get the indicates whether the interface is acting as Domain Master ({{true}}) or not ({{false}}).

          See Note in {{param|NodeTypeDMConfig}} regarding the possibility of more than one node being configured with {{param|NodeTypeDMConfig}} = {{true}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isNodeTypeDMStatus() {
		return nodeTypeDMStatus;
	}

	/**
	 * Set the indicates whether the interface is acting as Domain Master ({{true}}) or not ({{false}}).

          See Note in {{param|NodeTypeDMConfig}} regarding the possibility of more than one node being configured with {{param|NodeTypeDMConfig}} = {{true}}.
	 *
	 * @since 2.4
	 * @param nodeTypeDMStatus the input value
	 */
	public void  setNodeTypeDMStatus(Boolean nodeTypeDMStatus) {
		this.nodeTypeDMStatus = nodeTypeDMStatus;
	}

	/**
	 * Set the indicates whether the interface is acting as Domain Master ({{true}}) or not ({{false}}).

          See Note in {{param|NodeTypeDMConfig}} regarding the possibility of more than one node being configured with {{param|NodeTypeDMConfig}} = {{true}}.
	 *
	 * @since 2.4
	 * @param nodeTypeDMStatus the input value
	 * @return this instance
	 */
	public Interface withNodeTypeDMStatus(Boolean nodeTypeDMStatus) {
		this.nodeTypeDMStatus = nodeTypeDMStatus;
		return this;
	}

	/**
	 * Get the indicates whether the interface is acting as Security Controller ({{true}}) or not ({{false}}).
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isNodeTypeSCStatus() {
		return nodeTypeSCStatus;
	}

	/**
	 * Set the indicates whether the interface is acting as Security Controller ({{true}}) or not ({{false}}).
	 *
	 * @since 2.4
	 * @param nodeTypeSCStatus the input value
	 */
	public void  setNodeTypeSCStatus(Boolean nodeTypeSCStatus) {
		this.nodeTypeSCStatus = nodeTypeSCStatus;
	}

	/**
	 * Set the indicates whether the interface is acting as Security Controller ({{true}}) or not ({{false}}).
	 *
	 * @since 2.4
	 * @param nodeTypeSCStatus the input value
	 * @return this instance
	 */
	public Interface withNodeTypeSCStatus(Boolean nodeTypeSCStatus) {
		this.nodeTypeSCStatus = nodeTypeSCStatus;
		return this;
	}

	/**
	 * Get the this object specifies management parameters pertaining to the domain functionality (Domain Master function; see {{bibref|G.9961|Clause 8.6}}). The object exists only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @return the value
	 */
	public DMInfo getDminfo() {
		return dminfo;
	}

	/**
	 * Set the this object specifies management parameters pertaining to the domain functionality (Domain Master function; see {{bibref|G.9961|Clause 8.6}}). The object exists only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @param dminfo the input value
	 */
	public void  setDminfo(DMInfo dminfo) {
		this.dminfo = dminfo;
	}

	/**
	 * Set the this object specifies management parameters pertaining to the domain functionality (Domain Master function; see {{bibref|G.9961|Clause 8.6}}). The object exists only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @param dminfo the input value
	 * @return this instance
	 */
	public Interface withDminfo(DMInfo dminfo) {
		this.dminfo = dminfo;
		return this;
	}

	/**
	 * Get the this object specifies management parameters pertaining to the Security Controller functionality (Security Controller function; see {{bibref|G.9961|Clause 9.2}}). The object exists only on G.hn interfaces that are currently the Security Controller, i.e. for which parameter {{param|#.IsSC}} is {{true}}.
	 *
	 * @return the value
	 */
	public SCInfo getScinfo() {
		return scinfo;
	}

	/**
	 * Set the this object specifies management parameters pertaining to the Security Controller functionality (Security Controller function; see {{bibref|G.9961|Clause 9.2}}). The object exists only on G.hn interfaces that are currently the Security Controller, i.e. for which parameter {{param|#.IsSC}} is {{true}}.
	 *
	 * @param scinfo the input value
	 */
	public void  setScinfo(SCInfo scinfo) {
		this.scinfo = scinfo;
	}

	/**
	 * Set the this object specifies management parameters pertaining to the Security Controller functionality (Security Controller function; see {{bibref|G.9961|Clause 9.2}}). The object exists only on G.hn interfaces that are currently the Security Controller, i.e. for which parameter {{param|#.IsSC}} is {{true}}.
	 *
	 * @param scinfo the input value
	 * @return this instance
	 */
	public Interface withScinfo(SCInfo scinfo) {
		this.scinfo = scinfo;
		return this;
	}

	/**
	 * Get the specifies the list of masked bands to be applied to the G.hn interface.  This information is conveyed by the Domain Master in the SM descriptor as specified in {{bibref|G.9961|Table 8-77}}.

        Instances of this object are expected to exist only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @return the value
	 */
	public Collection<SMMaskedBand> getSmmaskedBands() {
		if (this.smmaskedBands == null){ this.smmaskedBands=new ArrayList<>();}
		return smmaskedBands;
	}

	/**
	 * Set the specifies the list of masked bands to be applied to the G.hn interface.  This information is conveyed by the Domain Master in the SM descriptor as specified in {{bibref|G.9961|Table 8-77}}.

        Instances of this object are expected to exist only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @param smmaskedBands the input value
	 */
	public void  setSmmaskedBands(Collection<SMMaskedBand> smmaskedBands) {
		this.smmaskedBands = smmaskedBands;
	}

	/**
	 * Set the specifies the list of masked bands to be applied to the G.hn interface.  This information is conveyed by the Domain Master in the SM descriptor as specified in {{bibref|G.9961|Table 8-77}}.

        Instances of this object are expected to exist only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @param smmaskedBand the input value
	 * @return this instance
	 */
	public Interface withSMMaskedBand(SMMaskedBand smmaskedBand) {
		getSmmaskedBands().add(smmaskedBand);
		return this;
	}

	/**
	 * Get the throughput statistics for this interface at the different G.hn reference points described in {{bibref|G.9961|Clause 8.1}}.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface at the different G.hn reference points described in {{bibref|G.9961|Clause 8.1}}.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface at the different G.hn reference points described in {{bibref|G.9961|Clause 8.1}}.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Interface withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the this table contains information about other G.hn devices connected to this G.hn interface.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set the this table contains information about other G.hn devices connected to this G.hn interface.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set the this table contains information about other G.hn devices connected to this G.hn interface.
	 *
	 * @param associatedDevice the input value
	 * @return this instance
	 */
	public Interface withAssociatedDevice(AssociatedDevice associatedDevice) {
		getAssociatedDevices().add(associatedDevice);
		return this;
	}

	//</editor-fold>

}