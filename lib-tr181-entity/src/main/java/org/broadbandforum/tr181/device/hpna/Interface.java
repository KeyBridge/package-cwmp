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
package org.broadbandforum.tr181.device.hpna;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.hpna._interface.AssociatedDevice;
import org.broadbandforum.tr181.device.hpna._interface.QoS;
import org.broadbandforum.tr181.device.hpna._interface.Stats;

	/**
	 * HPNA interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of an HPNA interface {{bibref|G.9954}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Interface.{i}.")
public class Interface {

	/**
	 * Enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 */
	@XmlElement(name = "Upstream")
	public Boolean upstream;
	/**
	 * The MAC Address of the interface.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * This interface's firmware version.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirmwareVersion")
	@Size(max = 64)
	public String firmwareVersion;
	/**
	 * The Node ID of this interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NodeID")
	public Long nodeID;
	/**
	 * Whether this interface is the HPNA network master.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IsMaster")
	public Boolean ismaster;
	/**
	 * Whether this interface is synchronized with the HPNA network master. If this interface is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Synced")
	public Boolean synced;
	/**
	 * Total time in seconds (since device reset) that this interface has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalSyncTime")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long totalSyncTime;
	/**
	 * The maximum HPNA PHY bit rate (expressed in Mbps) of this interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBitRate")
	public Long maxBitRate;
	/**
	 * Current HPNA network utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkUtilization")
	@Size(min = 0, max = 1000)
	public Long networkUtilization;
	/**
	 * {{list}} List items indicate the types of connections possible for this interface. 

Enumerated value must be one of [Phone, Coax]
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PossibleConnectionTypes")
	@XmlList
	public Collection<String> possibleConnectionTypes;
	/**
	 * {{list}} Connection type(s) for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConnectionType")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> connectionType;
	/**
	 * {{list}} List items indicate the spectral modes possible for this interface. 

Enumerated value must be one of [A, B, C, D]
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PossibleSpectralModes")
	@XmlList
	public Collection<String> possibleSpectralModes;
	/**
	 * Spectral mode for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SpectralMode")
	@CWMPParameter(access = "readWrite")
	public String spectralMode;
	/**
	 * Maximum Transmission Unit for this HPNA interface (expressed in bytes).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MTU")
	@CWMPParameter(access = "readWrite", units = "bytes")
	public Long mtu;
	/**
	 * The desired noise margin for which the local HPNA interface has been configured (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NoiseMargin")
	@CWMPParameter(access = "readWrite", units = "0.1dB")
	public Long noiseMargin;
	/**
	 * The desired packet error rate for which the local HPNA interface has been configured (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultNonLARQPER")
	@CWMPParameter(access = "readWrite")
	public Long defaultNonLARQPER;
	/**
	 * Enable or disable the Limited Automatic Repeat Request (LARQ) mechanism.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LARQEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean larQEnable;
	/**
	 * The minimum multicast (and broadcast) rate that can be negotiated on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinMulticastRate")
	@CWMPParameter(access = "readWrite", units = "Mbps")
	public Long minMulticastRate;
	/**
	 * The negotiated multicast (and broadcast) rate on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NegMulticastRate")
	public Long negMulticastRate;
	/**
	 * Master selection mode. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MasterSelectionMode")
	@CWMPParameter(access = "readWrite")
	public String masterSelectionMode;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * QoS configuration object.
	 */
	@XmlElement(name = "QoS")
	public QoS qos;
	/**
	 * This table provides information about other HPNA devices that are directly accessible via this HPNA interface.
	 */
	@XmlElementWrapper(name = "associatedDevices")
	@XmlElement(name = "AssociatedDevice")
	public Collection<AssociatedDevice> associatedDevices;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the interface.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
	 * @param upstream the input value
	 * @return this instance
	 */
	public Interface withUpstream(Boolean upstream) {
		this.upstream = upstream;
		return this;
	}

	/**
	 * Get the MAC Address of the interface.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the MAC Address of the interface.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the MAC Address of the interface.

          Note: This is not necessarily the same as the Ethernet header source or destination MAC address, which is associated with the IP interface and is modeled via the {{param|.Ethernet.Link.{i}.MACAddress}} parameter.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public Interface withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the this interface's firmware version.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Set the this interface's firmware version.
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 */
	public void  setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Set the this interface's firmware version.
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 * @return this instance
	 */
	public Interface withFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		return this;
	}

	/**
	 * Get the Node ID of this interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNodeID() {
		return nodeID;
	}

	/**
	 * Set the Node ID of this interface.
	 *
	 * @since 2.0
	 * @param nodeID the input value
	 */
	public void  setNodeID(Long nodeID) {
		this.nodeID = nodeID;
	}

	/**
	 * Set the Node ID of this interface.
	 *
	 * @since 2.0
	 * @param nodeID the input value
	 * @return this instance
	 */
	public Interface withNodeID(Long nodeID) {
		this.nodeID = nodeID;
		return this;
	}

	/**
	 * Get the whether this interface is the HPNA network master.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIsmaster() {
		return ismaster;
	}

	/**
	 * Set the whether this interface is the HPNA network master.
	 *
	 * @since 2.0
	 * @param ismaster the input value
	 */
	public void  setIsmaster(Boolean ismaster) {
		this.ismaster = ismaster;
	}

	/**
	 * Set the whether this interface is the HPNA network master.
	 *
	 * @since 2.0
	 * @param ismaster the input value
	 * @return this instance
	 */
	public Interface withIsmaster(Boolean ismaster) {
		this.ismaster = ismaster;
		return this;
	}

	/**
	 * Get the whether this interface is synchronized with the HPNA network master. If this interface is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSynced() {
		return synced;
	}

	/**
	 * Set the whether this interface is synchronized with the HPNA network master. If this interface is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 * @param synced the input value
	 */
	public void  setSynced(Boolean synced) {
		this.synced = synced;
	}

	/**
	 * Set the whether this interface is synchronized with the HPNA network master. If this interface is the HPNA network master, {{param}} MUST be {{true}}.
	 *
	 * @since 2.0
	 * @param synced the input value
	 * @return this instance
	 */
	public Interface withSynced(Boolean synced) {
		this.synced = synced;
		return this;
	}

	/**
	 * Get the total time in seconds (since device reset) that this interface has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalSyncTime() {
		return totalSyncTime;
	}

	/**
	 * Set the total time in seconds (since device reset) that this interface has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 * @param totalSyncTime the input value
	 */
	public void  setTotalSyncTime(Long totalSyncTime) {
		this.totalSyncTime = totalSyncTime;
	}

	/**
	 * Set the total time in seconds (since device reset) that this interface has been up and synchronized to the HPNA network master.
	 *
	 * @since 2.0
	 * @param totalSyncTime the input value
	 * @return this instance
	 */
	public Interface withTotalSyncTime(Long totalSyncTime) {
		this.totalSyncTime = totalSyncTime;
		return this;
	}

	/**
	 * Get the maximum HPNA PHY bit rate (expressed in Mbps) of this interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum HPNA PHY bit rate (expressed in Mbps) of this interface.
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum HPNA PHY bit rate (expressed in Mbps) of this interface.
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public Interface withMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the current HPNA network utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNetworkUtilization() {
		return networkUtilization;
	}

	/**
	 * Set the current HPNA network utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 * @param networkUtilization the input value
	 */
	public void  setNetworkUtilization(Long networkUtilization) {
		this.networkUtilization = networkUtilization;
	}

	/**
	 * Set the current HPNA network utilization (expressed in 0.1%).
	 *
	 * @since 2.0
	 * @param networkUtilization the input value
	 * @return this instance
	 */
	public Interface withNetworkUtilization(Long networkUtilization) {
		this.networkUtilization = networkUtilization;
		return this;
	}

	/**
	 * Get the {{list}} List items indicate the types of connections possible for this interface. 

Enumerated value must be one of [Phone, Coax]
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPossibleConnectionTypes() {
		if (this.possibleConnectionTypes == null){ this.possibleConnectionTypes=new ArrayList<>();}
		return possibleConnectionTypes;
	}

	/**
	 * Set the {{list}} List items indicate the types of connections possible for this interface. 

Enumerated value must be one of [Phone, Coax]
	 *
	 * @since 2.0
	 * @param possibleConnectionTypes the input value
	 */
	public void  setPossibleConnectionTypes(Collection<String> possibleConnectionTypes) {
		this.possibleConnectionTypes = possibleConnectionTypes;
	}

	/**
	 * Set the {{list}} List items indicate the types of connections possible for this interface. 

Enumerated value must be one of [Phone, Coax]
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withPossibleConnectionTypes(String string) {
		getPossibleConnectionTypes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Connection type(s) for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getConnectionType() {
		if (this.connectionType == null){ this.connectionType=new ArrayList<>();}
		return connectionType;
	}

	/**
	 * Set the {{list}} Connection type(s) for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 * @param connectionType the input value
	 */
	public void  setConnectionType(Collection<String> connectionType) {
		this.connectionType = connectionType;
	}

	/**
	 * Set the {{list}} Connection type(s) for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withConnectionType(String string) {
		getConnectionType().add(string);
		return this;
	}

	/**
	 * Get the {{list}} List items indicate the spectral modes possible for this interface. 

Enumerated value must be one of [A, B, C, D]
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPossibleSpectralModes() {
		if (this.possibleSpectralModes == null){ this.possibleSpectralModes=new ArrayList<>();}
		return possibleSpectralModes;
	}

	/**
	 * Set the {{list}} List items indicate the spectral modes possible for this interface. 

Enumerated value must be one of [A, B, C, D]
	 *
	 * @since 2.0
	 * @param possibleSpectralModes the input value
	 */
	public void  setPossibleSpectralModes(Collection<String> possibleSpectralModes) {
		this.possibleSpectralModes = possibleSpectralModes;
	}

	/**
	 * Set the {{list}} List items indicate the spectral modes possible for this interface. 

Enumerated value must be one of [A, B, C, D]
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withPossibleSpectralModes(String string) {
		getPossibleSpectralModes().add(string);
		return this;
	}

	/**
	 * Get the spectral mode for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSpectralMode() {
		return spectralMode;
	}

	/**
	 * Set the spectral mode for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 * @param spectralMode the input value
	 */
	public void  setSpectralMode(String spectralMode) {
		this.spectralMode = spectralMode;
	}

	/**
	 * Set the spectral mode for which the HPNA protocol is active.
	 *
	 * @since 2.0
	 * @param spectralMode the input value
	 * @return this instance
	 */
	public Interface withSpectralMode(String spectralMode) {
		this.spectralMode = spectralMode;
		return this;
	}

	/**
	 * Get the maximum Transmission Unit for this HPNA interface (expressed in bytes).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMtu() {
		return mtu;
	}

	/**
	 * Set the maximum Transmission Unit for this HPNA interface (expressed in bytes).
	 *
	 * @since 2.0
	 * @param mtu the input value
	 */
	public void  setMtu(Long mtu) {
		this.mtu = mtu;
	}

	/**
	 * Set the maximum Transmission Unit for this HPNA interface (expressed in bytes).
	 *
	 * @since 2.0
	 * @param mtu the input value
	 * @return this instance
	 */
	public Interface withMtu(Long mtu) {
		this.mtu = mtu;
		return this;
	}

	/**
	 * Get the desired noise margin for which the local HPNA interface has been configured (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNoiseMargin() {
		return noiseMargin;
	}

	/**
	 * Set the desired noise margin for which the local HPNA interface has been configured (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param noiseMargin the input value
	 */
	public void  setNoiseMargin(Long noiseMargin) {
		this.noiseMargin = noiseMargin;
	}

	/**
	 * Set the desired noise margin for which the local HPNA interface has been configured (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param noiseMargin the input value
	 * @return this instance
	 */
	public Interface withNoiseMargin(Long noiseMargin) {
		this.noiseMargin = noiseMargin;
		return this;
	}

	/**
	 * Get the desired packet error rate for which the local HPNA interface has been configured (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDefaultNonLARQPER() {
		return defaultNonLARQPER;
	}

	/**
	 * Set the desired packet error rate for which the local HPNA interface has been configured (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).
	 *
	 * @since 2.0
	 * @param defaultNonLARQPER the input value
	 */
	public void  setDefaultNonLARQPER(Long defaultNonLARQPER) {
		this.defaultNonLARQPER = defaultNonLARQPER;
	}

	/**
	 * Set the desired packet error rate for which the local HPNA interface has been configured (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).
	 *
	 * @since 2.0
	 * @param defaultNonLARQPER the input value
	 * @return this instance
	 */
	public Interface withDefaultNonLARQPER(Long defaultNonLARQPER) {
		this.defaultNonLARQPER = defaultNonLARQPER;
		return this;
	}

	/**
	 * Get the enable or disable the Limited Automatic Repeat Request (LARQ) mechanism.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLarQEnable() {
		return larQEnable;
	}

	/**
	 * Set the enable or disable the Limited Automatic Repeat Request (LARQ) mechanism.
	 *
	 * @since 2.0
	 * @param larQEnable the input value
	 */
	public void  setLarQEnable(Boolean larQEnable) {
		this.larQEnable = larQEnable;
	}

	/**
	 * Set the enable or disable the Limited Automatic Repeat Request (LARQ) mechanism.
	 *
	 * @since 2.0
	 * @param larQEnable the input value
	 * @return this instance
	 */
	public Interface withLarQEnable(Boolean larQEnable) {
		this.larQEnable = larQEnable;
		return this;
	}

	/**
	 * Get the minimum multicast (and broadcast) rate that can be negotiated on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMinMulticastRate() {
		return minMulticastRate;
	}

	/**
	 * Set the minimum multicast (and broadcast) rate that can be negotiated on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param minMulticastRate the input value
	 */
	public void  setMinMulticastRate(Long minMulticastRate) {
		this.minMulticastRate = minMulticastRate;
	}

	/**
	 * Set the minimum multicast (and broadcast) rate that can be negotiated on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param minMulticastRate the input value
	 * @return this instance
	 */
	public Interface withMinMulticastRate(Long minMulticastRate) {
		this.minMulticastRate = minMulticastRate;
		return this;
	}

	/**
	 * Get the negotiated multicast (and broadcast) rate on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNegMulticastRate() {
		return negMulticastRate;
	}

	/**
	 * Set the negotiated multicast (and broadcast) rate on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param negMulticastRate the input value
	 */
	public void  setNegMulticastRate(Long negMulticastRate) {
		this.negMulticastRate = negMulticastRate;
	}

	/**
	 * Set the negotiated multicast (and broadcast) rate on the HPNA network directly accessible via this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param negMulticastRate the input value
	 * @return this instance
	 */
	public Interface withNegMulticastRate(Long negMulticastRate) {
		this.negMulticastRate = negMulticastRate;
		return this;
	}

	/**
	 * Get the master selection mode. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMasterSelectionMode() {
		return masterSelectionMode;
	}

	/**
	 * Set the master selection mode. {{enum}}
	 *
	 * @since 2.0
	 * @param masterSelectionMode the input value
	 */
	public void  setMasterSelectionMode(String masterSelectionMode) {
		this.masterSelectionMode = masterSelectionMode;
	}

	/**
	 * Set the master selection mode. {{enum}}
	 *
	 * @since 2.0
	 * @param masterSelectionMode the input value
	 * @return this instance
	 */
	public Interface withMasterSelectionMode(String masterSelectionMode) {
		this.masterSelectionMode = masterSelectionMode;
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

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
	 * Get the qos configuration object.
	 *
	 * @return the value
	 */
	public QoS getQos() {
		return qos;
	}

	/**
	 * Set the qos configuration object.
	 *
	 * @param qos the input value
	 */
	public void  setQos(QoS qos) {
		this.qos = qos;
	}

	/**
	 * Set the qos configuration object.
	 *
	 * @param qos the input value
	 * @return this instance
	 */
	public Interface withQos(QoS qos) {
		this.qos = qos;
		return this;
	}

	/**
	 * Get the this table provides information about other HPNA devices that are directly accessible via this HPNA interface.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set the this table provides information about other HPNA devices that are directly accessible via this HPNA interface.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set the this table provides information about other HPNA devices that are directly accessible via this HPNA interface.
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