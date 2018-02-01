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
package org.broadbandforum.tr181.device.homeplug;

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
import org.broadbandforum.tr181.device.homeplug._interface.AssociatedDevice;
import org.broadbandforum.tr181.device.homeplug._interface.Stats;

	/**
	 * HomePlug interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of a HomePlug interface {{bibref|HPAV1.1}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HomePlug.Interface.{i}.")
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
	 * The textual name of the HomePlug Logical Network.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LogicalNetwork")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String logicalNetwork;
	/**
	 * Indicates the HomePlug version of the interface. This element SHOULD be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example: 

          : "1.0"

          : "1.1"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Version")
	@Size(max = 16)
	public String version;
	/**
	 * The firmware version of the interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirmwareVersion")
	@Size(max = 64)
	public String firmwareVersion;
	/**
	 * Central Coordinator (CCo) selection mode.

          If {{false}}, CCo selection is automatic. If {{true}}, the local HomePlug interface is forced to be CCo and all other devices in the Logical Network MUST be set to automatic CCo selection. 

          Typically {{param}} is set to automatic CCo selection ({{false}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ForceCCo")
	@CWMPParameter(access = "readWrite")
	public Boolean forceCCo = false;
	/**
	 * The network password of the device. This is a human readable ASCII string that is hashed per the HomePlug specification to generate the Network Membership Key (NMK). Note that care needs to be taken when setting this parameter as it might prohibit communication with other adapters or equipment connected via the powerline network.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String networkPassword;
	/**
	 * {{list}} Indicates whether any other HomePlug networks are currently visible via this interface. Examples of valid list items include, but are not limited to: 

          : "HomePlugAV"

          : "HomePlug1.0"

          : "Other"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OtherNetworksPresent")
	@Size(max = 64)
	@XmlList
	public Collection<String> otherNetworksPresent;
	/**
	 * The maximum PHY bit rate supported by this interface (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBitRate")
	public Long maxBitRate;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This table contains information about other HomePlug devices connected to this HomePlug interface.
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
	 * Get the textual name of the HomePlug Logical Network.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLogicalNetwork() {
		return logicalNetwork;
	}

	/**
	 * Set the textual name of the HomePlug Logical Network.
	 *
	 * @since 2.0
	 * @param logicalNetwork the input value
	 */
	public void  setLogicalNetwork(String logicalNetwork) {
		this.logicalNetwork = logicalNetwork;
	}

	/**
	 * Set the textual name of the HomePlug Logical Network.
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
	 * Get the indicates the HomePlug version of the interface. This element SHOULD be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example: 

          : "1.0"

          : "1.1"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the indicates the HomePlug version of the interface. This element SHOULD be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example: 

          : "1.0"

          : "1.1"
	 *
	 * @since 2.0
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set the indicates the HomePlug version of the interface. This element SHOULD be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example: 

          : "1.0"

          : "1.1"
	 *
	 * @since 2.0
	 * @param version the input value
	 * @return this instance
	 */
	public Interface withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the firmware version of the interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Set the firmware version of the interface.
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 */
	public void  setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Set the firmware version of the interface.
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
	 * Get the central Coordinator (CCo) selection mode.

          If {{false}}, CCo selection is automatic. If {{true}}, the local HomePlug interface is forced to be CCo and all other devices in the Logical Network MUST be set to automatic CCo selection. 

          Typically {{param}} is set to automatic CCo selection ({{false}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isForceCCo() {
		return forceCCo;
	}

	/**
	 * Set the central Coordinator (CCo) selection mode.

          If {{false}}, CCo selection is automatic. If {{true}}, the local HomePlug interface is forced to be CCo and all other devices in the Logical Network MUST be set to automatic CCo selection. 

          Typically {{param}} is set to automatic CCo selection ({{false}}).
	 *
	 * @since 2.0
	 * @param forceCCo the input value
	 */
	public void  setForceCCo(Boolean forceCCo) {
		this.forceCCo = forceCCo;
	}

	/**
	 * Set the central Coordinator (CCo) selection mode.

          If {{false}}, CCo selection is automatic. If {{true}}, the local HomePlug interface is forced to be CCo and all other devices in the Logical Network MUST be set to automatic CCo selection. 

          Typically {{param}} is set to automatic CCo selection ({{false}}).
	 *
	 * @since 2.0
	 * @param forceCCo the input value
	 * @return this instance
	 */
	public Interface withForceCCo(Boolean forceCCo) {
		this.forceCCo = forceCCo;
		return this;
	}

	/**
	 * Get the network password of the device. This is a human readable ASCII string that is hashed per the HomePlug specification to generate the Network Membership Key (NMK). Note that care needs to be taken when setting this parameter as it might prohibit communication with other adapters or equipment connected via the powerline network.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetworkPassword() {
		return networkPassword;
	}

	/**
	 * Set the network password of the device. This is a human readable ASCII string that is hashed per the HomePlug specification to generate the Network Membership Key (NMK). Note that care needs to be taken when setting this parameter as it might prohibit communication with other adapters or equipment connected via the powerline network.
	 *
	 * @since 2.0
	 * @param networkPassword the input value
	 */
	public void  setNetworkPassword(String networkPassword) {
		this.networkPassword = networkPassword;
	}

	/**
	 * Set the network password of the device. This is a human readable ASCII string that is hashed per the HomePlug specification to generate the Network Membership Key (NMK). Note that care needs to be taken when setting this parameter as it might prohibit communication with other adapters or equipment connected via the powerline network.
	 *
	 * @since 2.0
	 * @param networkPassword the input value
	 * @return this instance
	 */
	public Interface withNetworkPassword(String networkPassword) {
		this.networkPassword = networkPassword;
		return this;
	}

	/**
	 * Get the {{list}} Indicates whether any other HomePlug networks are currently visible via this interface. Examples of valid list items include, but are not limited to: 

          : "HomePlugAV"

          : "HomePlug1.0"

          : "Other"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getOtherNetworksPresent() {
		if (this.otherNetworksPresent == null){ this.otherNetworksPresent=new ArrayList<>();}
		return otherNetworksPresent;
	}

	/**
	 * Set the {{list}} Indicates whether any other HomePlug networks are currently visible via this interface. Examples of valid list items include, but are not limited to: 

          : "HomePlugAV"

          : "HomePlug1.0"

          : "Other"
	 *
	 * @since 2.0
	 * @param otherNetworksPresent the input value
	 */
	public void  setOtherNetworksPresent(Collection<String> otherNetworksPresent) {
		this.otherNetworksPresent = otherNetworksPresent;
	}

	/**
	 * Set the {{list}} Indicates whether any other HomePlug networks are currently visible via this interface. Examples of valid list items include, but are not limited to: 

          : "HomePlugAV"

          : "HomePlug1.0"

          : "Other"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withOtherNetworksPresent(String string) {
		getOtherNetworksPresent().add(string);
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
	 * Get the this table contains information about other HomePlug devices connected to this HomePlug interface.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set the this table contains information about other HomePlug devices connected to this HomePlug interface.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set the this table contains information about other HomePlug devices connected to this HomePlug interface.
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