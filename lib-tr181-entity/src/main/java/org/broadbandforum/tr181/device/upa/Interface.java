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
package org.broadbandforum.tr181.device.upa;

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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.MACAddress;
import org.broadbandforum.tr181.device.upa._interface.ActiveNotch;
import org.broadbandforum.tr181.device.upa._interface.AssociatedDevice;
import org.broadbandforum.tr181.device.upa._interface.BridgeFor;
import org.broadbandforum.tr181.device.upa._interface.Stats;

	/**
	 * UPA interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of a UPA interface {{bibref|UPA-PLC}}.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UPA.Interface.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Name"}, functional = false)})
@XmlRootElement(name = "Device.UPA.Interface")
@XmlType(name = "Device.UPA.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
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
	 * The maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBitRate")
	public Long maxBitRate;
	/**
	 * Type of UPA device role. It can be Fixed Access Point (master) or End Point (slave) of the PLC network.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NodeType")
	@CWMPParameter(access = "readWrite")
	public String nodeType;
	/**
	 * The name (network ID) of the logical PLC network in which the local interface is a member (human readable string).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LogicalNetwork")
	@CWMPParameter(access = "readWrite")
	@Size(max = 20)
	public String logicalNetwork;
	/**
	 * Encryption Method used by UPA device. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EncryptionMethod")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String encryptionMethod;
	/**
	 * Encryption key for secure PLC communications.

          This a human readable string used by the system to generate the encryption key to encrypt communications in powerline. It takes non extended ASCII characters (i.e. printable 7-bit ASCII character codes 32-126, which includes SPACE but excludes TAB, LF and CR). For example: bvjPekZiYUf9kjNKJASkgJ09adfoP01Fjvgd
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EncryptionKey")
	@CWMPParameter(access = "readWrite")
	@Size(max = 36)
	public String encryptionKey;
	/**
	 * Power back-off management feature status in the UPA device. Boolean can be {{true}} for "enabled" and {{false}}  for "disabled".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerBackoffEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean powerBackoffEnabled;
	/**
	 * Show if power back-off mechanism is active at that time in the UPA device. Boolean can be {{true}} for "active"  and {{false}} for "not active".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerBackoffMechanismActive")
	public Boolean powerBackoffMechanismActive;
	/**
	 * The estimated application throughput (expressed in Mbps), received from the PLC link. This value can be  used to indicate link quality.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EstApplicationThroughput")
	public Long estApplicationThroughput;
	/**
	 * Enables or disables the {{object|ActiveNotch}} table for this interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ActiveNotchEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean activeNotchEnable;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This table contains information about PLC connections running between this UPA interface and other UPA devices.
	 */
	@XmlElementWrapper(name = "AssociatedDevices")
	@XmlElement(name = "AssociatedDevice")
	public Collection<AssociatedDevice> associatedDevices;
	/**
	 * This object contains the list of active notches of the UPA interface. 

        A UPA device can have notches in its spectrum, where no power is transmitted in a given part of the spectrum. These notches are typically located in amateur radio bands, to avoid interference.

        Note: All {{object}} entries can be enabled/disabled as a group using the {{param|#.ActiveNotchEnable}} parameter.
	 */
	@XmlElementWrapper(name = "ActiveNotchs")
	@XmlElement(name = "ActiveNotch")
	@CWMPParameter(access = "readWrite")
	public Collection<ActiveNotch> activeNotchs;
	/**
	 * This object represents the bridge table of the UPA interface. Each instance is a bridge table entry.

        It shows the MAC addresses of the remote UPA devices with their associated port number, and the MAC addresses of the end-devices (PCs, STBs, routers, etc) connected to Ethernet port of the powerline adapters with their associated logical port. In this way the system identifies to which UPA device an external device is connected to.
	 */
	@XmlElementWrapper(name = "BridgeFors")
	@XmlElement(name = "BridgeFor")
	public Collection<BridgeFor> bridgeFors;

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
	 * Get the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum PHY bit rate supported by this interface (expressed in Mbps).
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
	 * Get the type of UPA device role. It can be Fixed Access Point (master) or End Point (slave) of the PLC network.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNodeType() {
		return nodeType;
	}

	/**
	 * Set the type of UPA device role. It can be Fixed Access Point (master) or End Point (slave) of the PLC network.  {{enum}}
	 *
	 * @since 2.0
	 * @param nodeType the input value
	 */
	public void  setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	/**
	 * Set the type of UPA device role. It can be Fixed Access Point (master) or End Point (slave) of the PLC network.  {{enum}}
	 *
	 * @since 2.0
	 * @param nodeType the input value
	 * @return this instance
	 */
	public Interface withNodeType(String nodeType) {
		this.nodeType = nodeType;
		return this;
	}

	/**
	 * Get the name (network ID) of the logical PLC network in which the local interface is a member (human readable string).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLogicalNetwork() {
		return logicalNetwork;
	}

	/**
	 * Set the name (network ID) of the logical PLC network in which the local interface is a member (human readable string).
	 *
	 * @since 2.0
	 * @param logicalNetwork the input value
	 */
	public void  setLogicalNetwork(String logicalNetwork) {
		this.logicalNetwork = logicalNetwork;
	}

	/**
	 * Set the name (network ID) of the logical PLC network in which the local interface is a member (human readable string).
	 *
	 * @since 2.0
	 * @param logicalNetwork the input value
	 * @return this instance
	 */
	public Interface withLogicalNetwork(String logicalNetwork) {
		this.logicalNetwork = logicalNetwork;
		return this;
	}

	/**
	 * Get the encryption Method used by UPA device. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEncryptionMethod() {
		return encryptionMethod;
	}

	/**
	 * Set the encryption Method used by UPA device. {{enum}}
	 *
	 * @since 2.0
	 * @param encryptionMethod the input value
	 */
	public void  setEncryptionMethod(String encryptionMethod) {
		this.encryptionMethod = encryptionMethod;
	}

	/**
	 * Set the encryption Method used by UPA device. {{enum}}
	 *
	 * @since 2.0
	 * @param encryptionMethod the input value
	 * @return this instance
	 */
	public Interface withEncryptionMethod(String encryptionMethod) {
		this.encryptionMethod = encryptionMethod;
		return this;
	}

	/**
	 * Get the encryption key for secure PLC communications.

          This a human readable string used by the system to generate the encryption key to encrypt communications in powerline. It takes non extended ASCII characters (i.e. printable 7-bit ASCII character codes 32-126, which includes SPACE but excludes TAB, LF and CR). For example: bvjPekZiYUf9kjNKJASkgJ09adfoP01Fjvgd
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEncryptionKey() {
		return encryptionKey;
	}

	/**
	 * Set the encryption key for secure PLC communications.

          This a human readable string used by the system to generate the encryption key to encrypt communications in powerline. It takes non extended ASCII characters (i.e. printable 7-bit ASCII character codes 32-126, which includes SPACE but excludes TAB, LF and CR). For example: bvjPekZiYUf9kjNKJASkgJ09adfoP01Fjvgd
	 *
	 * @since 2.0
	 * @param encryptionKey the input value
	 */
	public void  setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	/**
	 * Set the encryption key for secure PLC communications.

          This a human readable string used by the system to generate the encryption key to encrypt communications in powerline. It takes non extended ASCII characters (i.e. printable 7-bit ASCII character codes 32-126, which includes SPACE but excludes TAB, LF and CR). For example: bvjPekZiYUf9kjNKJASkgJ09adfoP01Fjvgd
	 *
	 * @since 2.0
	 * @param encryptionKey the input value
	 * @return this instance
	 */
	public Interface withEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
		return this;
	}

	/**
	 * Get the power back-off management feature status in the UPA device. Boolean can be {{true}} for "enabled" and {{false}}  for "disabled".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPowerBackoffEnabled() {
		return powerBackoffEnabled;
	}

	/**
	 * Set the power back-off management feature status in the UPA device. Boolean can be {{true}} for "enabled" and {{false}}  for "disabled".
	 *
	 * @since 2.0
	 * @param powerBackoffEnabled the input value
	 */
	public void  setPowerBackoffEnabled(Boolean powerBackoffEnabled) {
		this.powerBackoffEnabled = powerBackoffEnabled;
	}

	/**
	 * Set the power back-off management feature status in the UPA device. Boolean can be {{true}} for "enabled" and {{false}}  for "disabled".
	 *
	 * @since 2.0
	 * @param powerBackoffEnabled the input value
	 * @return this instance
	 */
	public Interface withPowerBackoffEnabled(Boolean powerBackoffEnabled) {
		this.powerBackoffEnabled = powerBackoffEnabled;
		return this;
	}

	/**
	 * Get the show if power back-off mechanism is active at that time in the UPA device. Boolean can be {{true}} for "active"  and {{false}} for "not active".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPowerBackoffMechanismActive() {
		return powerBackoffMechanismActive;
	}

	/**
	 * Set the show if power back-off mechanism is active at that time in the UPA device. Boolean can be {{true}} for "active"  and {{false}} for "not active".
	 *
	 * @since 2.0
	 * @param powerBackoffMechanismActive the input value
	 */
	public void  setPowerBackoffMechanismActive(Boolean powerBackoffMechanismActive) {
		this.powerBackoffMechanismActive = powerBackoffMechanismActive;
	}

	/**
	 * Set the show if power back-off mechanism is active at that time in the UPA device. Boolean can be {{true}} for "active"  and {{false}} for "not active".
	 *
	 * @since 2.0
	 * @param powerBackoffMechanismActive the input value
	 * @return this instance
	 */
	public Interface withPowerBackoffMechanismActive(Boolean powerBackoffMechanismActive) {
		this.powerBackoffMechanismActive = powerBackoffMechanismActive;
		return this;
	}

	/**
	 * Get the estimated application throughput (expressed in Mbps), received from the PLC link. This value can be  used to indicate link quality.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEstApplicationThroughput() {
		return estApplicationThroughput;
	}

	/**
	 * Set the estimated application throughput (expressed in Mbps), received from the PLC link. This value can be  used to indicate link quality.
	 *
	 * @since 2.0
	 * @param estApplicationThroughput the input value
	 */
	public void  setEstApplicationThroughput(Long estApplicationThroughput) {
		this.estApplicationThroughput = estApplicationThroughput;
	}

	/**
	 * Set the estimated application throughput (expressed in Mbps), received from the PLC link. This value can be  used to indicate link quality.
	 *
	 * @since 2.0
	 * @param estApplicationThroughput the input value
	 * @return this instance
	 */
	public Interface withEstApplicationThroughput(Long estApplicationThroughput) {
		this.estApplicationThroughput = estApplicationThroughput;
		return this;
	}

	/**
	 * Get the enables or disables the {{object|ActiveNotch}} table for this interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActiveNotchEnable() {
		return activeNotchEnable;
	}

	/**
	 * Set the enables or disables the {{object|ActiveNotch}} table for this interface.
	 *
	 * @since 2.0
	 * @param activeNotchEnable the input value
	 */
	public void  setActiveNotchEnable(Boolean activeNotchEnable) {
		this.activeNotchEnable = activeNotchEnable;
	}

	/**
	 * Set the enables or disables the {{object|ActiveNotch}} table for this interface.
	 *
	 * @since 2.0
	 * @param activeNotchEnable the input value
	 * @return this instance
	 */
	public Interface withActiveNotchEnable(Boolean activeNotchEnable) {
		this.activeNotchEnable = activeNotchEnable;
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
	 * Get the this table contains information about PLC connections running between this UPA interface and other UPA devices.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set the this table contains information about PLC connections running between this UPA interface and other UPA devices.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set the this table contains information about PLC connections running between this UPA interface and other UPA devices.
	 *
	 * @param associatedDevice the input value
	 * @return this instance
	 */
	public Interface withAssociatedDevice(AssociatedDevice associatedDevice) {
		getAssociatedDevices().add(associatedDevice);
		return this;
	}

	/**
	 * Get the this object contains the list of active notches of the UPA interface. 

        A UPA device can have notches in its spectrum, where no power is transmitted in a given part of the spectrum. These notches are typically located in amateur radio bands, to avoid interference.

        Note: All {{object}} entries can be enabled/disabled as a group using the {{param|#.ActiveNotchEnable}} parameter.
	 *
	 * @return the value
	 */
	public Collection<ActiveNotch> getActiveNotchs() {
		if (this.activeNotchs == null){ this.activeNotchs=new ArrayList<>();}
		return activeNotchs;
	}

	/**
	 * Set the this object contains the list of active notches of the UPA interface. 

        A UPA device can have notches in its spectrum, where no power is transmitted in a given part of the spectrum. These notches are typically located in amateur radio bands, to avoid interference.

        Note: All {{object}} entries can be enabled/disabled as a group using the {{param|#.ActiveNotchEnable}} parameter.
	 *
	 * @param activeNotchs the input value
	 */
	public void  setActiveNotchs(Collection<ActiveNotch> activeNotchs) {
		this.activeNotchs = activeNotchs;
	}

	/**
	 * Set the this object contains the list of active notches of the UPA interface. 

        A UPA device can have notches in its spectrum, where no power is transmitted in a given part of the spectrum. These notches are typically located in amateur radio bands, to avoid interference.

        Note: All {{object}} entries can be enabled/disabled as a group using the {{param|#.ActiveNotchEnable}} parameter.
	 *
	 * @param activeNotch the input value
	 * @return this instance
	 */
	public Interface withActiveNotch(ActiveNotch activeNotch) {
		getActiveNotchs().add(activeNotch);
		return this;
	}

	/**
	 * Get the this object represents the bridge table of the UPA interface. Each instance is a bridge table entry.

        It shows the MAC addresses of the remote UPA devices with their associated port number, and the MAC addresses of the end-devices (PCs, STBs, routers, etc) connected to Ethernet port of the powerline adapters with their associated logical port. In this way the system identifies to which UPA device an external device is connected to.
	 *
	 * @return the value
	 */
	public Collection<BridgeFor> getBridgeFors() {
		if (this.bridgeFors == null){ this.bridgeFors=new ArrayList<>();}
		return bridgeFors;
	}

	/**
	 * Set the this object represents the bridge table of the UPA interface. Each instance is a bridge table entry.

        It shows the MAC addresses of the remote UPA devices with their associated port number, and the MAC addresses of the end-devices (PCs, STBs, routers, etc) connected to Ethernet port of the powerline adapters with their associated logical port. In this way the system identifies to which UPA device an external device is connected to.
	 *
	 * @param bridgeFors the input value
	 */
	public void  setBridgeFors(Collection<BridgeFor> bridgeFors) {
		this.bridgeFors = bridgeFors;
	}

	/**
	 * Set the this object represents the bridge table of the UPA interface. Each instance is a bridge table entry.

        It shows the MAC addresses of the remote UPA devices with their associated port number, and the MAC addresses of the end-devices (PCs, STBs, routers, etc) connected to Ethernet port of the powerline adapters with their associated logical port. In this way the system identifies to which UPA device an external device is connected to.
	 *
	 * @param bridgeFor the input value
	 * @return this instance
	 */
	public Interface withBridgeFor(BridgeFor bridgeFor) {
		getBridgeFors().add(bridgeFor);
		return this;
	}

	//</editor-fold>

}