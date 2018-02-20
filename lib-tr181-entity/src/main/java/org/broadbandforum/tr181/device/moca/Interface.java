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
package org.broadbandforum.tr181.device.moca;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
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
import org.broadbandforum.tr181.device.moca._interface.AssociatedDevice;
import org.broadbandforum.tr181.device.moca._interface.QoS;
import org.broadbandforum.tr181.device.moca._interface.Stats;

	/**
	 * MoCA interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each table entry models the PHY and MAC levels of a MoCA interface {{bibref|MoCAv1.0}} {{bibref|MoCAv1.1}}.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.MoCA.Interface.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Name"}, functional = false)})
@XmlRootElement(name = "Device.MoCA.Interface")
@XmlType(name = "Device.MoCA.Interface")
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

          This parameter is based on ''mocaIfSoftwareVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirmwareVersion")
	@Size(max = 64)
	public String firmwareVersion;
	/**
	 * The maximum MoCA PHY bit rate (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBitRate")
	public Long maxBitRate;
	/**
	 * The maximum bandwidth of this interface for flows onto the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxIngressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxIngressBW")
	public Long maxIngressBW;
	/**
	 * The maximum bandwidth of this interface for flows from the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxEgressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxEgressBW")
	public Long maxEgressBW;
	/**
	 * Identifies the highest MoCA version that this interface supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HighestVersion")
	@Size(max = 64)
	@Pattern(regexp = "\\d+(\\.\\d+)*")
	public String highestVersion;
	/**
	 * Identifies the MoCA version that the MoCA network is currently running.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfNetworkVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentVersion")
	@Size(max = 64)
	@Pattern(regexp = "\\d+(\\.\\d+)*")
	public String currentVersion;
	/**
	 * The Node ID of the current Network Coordinator (NC) for the MoCA network.

          This parameter is based on ''mocaIfNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkCoordinator")
	public Long networkCoordinator;
	/**
	 * The Node ID of this interface.

          This parameter is based on ''mocaIfNodeID'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NodeID")
	public Long nodeID;
	/**
	 * The maximum network node capability supported by the interface. If {{param}} is {{true}} then the interface supports 16 nodes (the maximum for a MoCA 1.1 network). If {{param}} is false then the interface supports 8 nodes (the maximum for a MoCA 1.0 network).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxNodes")
	public Boolean maxNodes;
	/**
	 * Whether this interface is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaIfPreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PreferredNC")
	@CWMPParameter(access = "readWrite")
	public Boolean preferredNC;
	/**
	 * The Node ID of the backup Network Coordinator node.

          This parameter is based on ''mocaIfBackupNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BackupNC")
	public Long backupNC;
	/**
	 * The configured privacy mode. This indicates whether link-layer security is enabled ({{true}}) or disabled ({{false}}) for network admission.

          The configured privacy setting MAY NOT match the current operational state ({{param|PrivacyEnabled}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrivacyEnabledSetting")
	@CWMPParameter(access = "readWrite")
	public Boolean privacyEnabledSetting;
	/**
	 * Indicates whether link-layer security is enabled or disabled.

          This parameter is based on ''mocaIfPrivacyEnable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrivacyEnabled")
	public Boolean privacyEnabled;
	/**
	 * Hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          For example, an interface that supports 1150 MHz through 1500 MHz would have a value of 0x000000001FFFC000.

          This parameter is based on ''mocaIfCapabilityMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FreqCapabilityMask")
	public byte[] freqCapabilityMask;
	/**
	 * The configured hexadecimal encoded 64-bit mask of enabled frequencies for network admission.

          The configured frequencies MAY NOT match the current operational state ({{param|FreqCurrentMask}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FreqCurrentMaskSetting")
	@CWMPParameter(access = "readWrite")
	public byte[] freqCurrentMaskSetting;
	/**
	 * Hexadecimal encoded 64-bit mask of used frequencies. This is the bit map of the spectrum that can be used and is a subset of the {{param|FreqCapabilityMask}}. Each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FreqCurrentMask")
	public byte[] freqCurrentMask;
	/**
	 * Current Operational Frequency.  The RF frequency in Hz to which the MoCA interface is currently  tuned. This parameter is only valid when {{param|Status}} is {{enum|Up|Status}}.

          This parameter is based on ''mocaIfRFChannel'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentOperFreq")
	public Long currentOperFreq;
	/**
	 * Last Operational Frequency.  The RF frequency in Hz to which the MoCA interface was tuned when last in the {{enum|Up|Status}} state.

          This parameter is based on ''mocaIfLOF'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastOperFreq")
	public Long lastOperFreq;
	/**
	 * MoCA Password. The value consists of numeric characters (0-9). {{pattern}}

          This parameter is based on ''mocaIfPassword'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "KeyPassphrase")
	@CWMPParameter(access = "readWrite")
	@Size(min = 12, max = 17)
	@Pattern(regexp = "\\d+")
	public String keyPassphrase;
	/**
	 * Transmit Power attenuation in dB relative to the maximum transmit power.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfTxPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxPowerLimit")
	@CWMPParameter(access = "readWrite")
	public Long txpowerLimit;
	/**
	 * Target PHY rate in Mbps for the power control algorithm.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfPowerControlTargetRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerCntlPhyTarget")
	@CWMPParameter(access = "readWrite")
	public Long powerCntlPhyTarget;
	/**
	 * Beacon Transmit Power attenuation in dB relative to the maximum transmit power. 

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfBeaconPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconPowerLimit")
	@CWMPParameter(access = "readWrite", units = "dB")
	public Long beaconPowerLimit;
	/**
	 * Hexadecimal encoded 64-bit mask of MoCA taboo channels identified for the home network. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkTabooMask")
	public byte[] networkTabooMask;
	/**
	 * Hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfNodeTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NodeTabooMask")
	public byte[] nodeTabooMask;
	/**
	 * The broadcast PHY transmit rate in Mbps for this interface.

          This parameter is based on ''mocaIfTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxBcastRate")
	public Long txbcastRate;
	/**
	 * Transmit Power attenuation in dB relative to the maximum transmit power for broadcast transmissions.

          This parameter is based on ''mocaIfTxGcdPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxBcastPowerReduction")
	public Long txbcastPowerReduction;
	/**
	 * Whether this interface supports the 256 QAM feature.

          This parameter is based on ''mocaIfQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QAM256Capable")
	public Boolean qam256Capable;
	/**
	 * The packet aggregation capability supported by the interface. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaIfPacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketAggregationCapability")
	@Size(min = 0, max = 10)
	public Long packetAggregationCapability;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * The QoS object provides information on MoCA parameterized QoS for this interface {{bibref|MoCAv1.1}}.
	 */
	@XmlElement(name = "QoS")
	public QoS qos;
	/**
	 * This table contains information about other MoCA devices currently associated with this MoCA interface.
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
	 * Get the this interface's firmware version.

          This parameter is based on ''mocaIfSoftwareVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Set the this interface's firmware version.

          This parameter is based on ''mocaIfSoftwareVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 */
	public void  setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Set the this interface's firmware version.

          This parameter is based on ''mocaIfSoftwareVersion'' from {{bibref|MOCA11-MIB}}.
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
	 * Get the maximum MoCA PHY bit rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum MoCA PHY bit rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum MoCA PHY bit rate (expressed in Mbps).
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
	 * Get the maximum bandwidth of this interface for flows onto the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxIngressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxIngressBW() {
		return maxIngressBW;
	}

	/**
	 * Set the maximum bandwidth of this interface for flows onto the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxIngressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxIngressBW the input value
	 */
	public void  setMaxIngressBW(Long maxIngressBW) {
		this.maxIngressBW = maxIngressBW;
	}

	/**
	 * Set the maximum bandwidth of this interface for flows onto the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxIngressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxIngressBW the input value
	 * @return this instance
	 */
	public Interface withMaxIngressBW(Long maxIngressBW) {
		this.maxIngressBW = maxIngressBW;
		return this;
	}

	/**
	 * Get the maximum bandwidth of this interface for flows from the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxEgressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxEgressBW() {
		return maxEgressBW;
	}

	/**
	 * Set the maximum bandwidth of this interface for flows from the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxEgressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxEgressBW the input value
	 */
	public void  setMaxEgressBW(Long maxEgressBW) {
		this.maxEgressBW = maxEgressBW;
	}

	/**
	 * Set the maximum bandwidth of this interface for flows from the MoCA network in Mbps.

          This parameter is based on ''mocaIfMaxEgressNodeBw'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param maxEgressBW the input value
	 * @return this instance
	 */
	public Interface withMaxEgressBW(Long maxEgressBW) {
		this.maxEgressBW = maxEgressBW;
		return this;
	}

	/**
	 * Get the identifies the highest MoCA version that this interface supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHighestVersion() {
		return highestVersion;
	}

	/**
	 * Set the identifies the highest MoCA version that this interface supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param highestVersion the input value
	 */
	public void  setHighestVersion(String highestVersion) {
		this.highestVersion = highestVersion;
	}

	/**
	 * Set the identifies the highest MoCA version that this interface supports.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfMocaVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param highestVersion the input value
	 * @return this instance
	 */
	public Interface withHighestVersion(String highestVersion) {
		this.highestVersion = highestVersion;
		return this;
	}

	/**
	 * Get the identifies the MoCA version that the MoCA network is currently running.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfNetworkVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCurrentVersion() {
		return currentVersion;
	}

	/**
	 * Set the identifies the MoCA version that the MoCA network is currently running.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfNetworkVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param currentVersion the input value
	 */
	public void  setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}

	/**
	 * Set the identifies the MoCA version that the MoCA network is currently running.

          This element MUST be in the form of dot-delimited integers, where each successive integer represents a more minor category of variation. For example, 1.0, where the components mean major.minor revision number. {{pattern}}

          This parameter is based on ''mocaIfNetworkVersion'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param currentVersion the input value
	 * @return this instance
	 */
	public Interface withCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
		return this;
	}

	/**
	 * Get the Node ID of the current Network Coordinator (NC) for the MoCA network.

          This parameter is based on ''mocaIfNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNetworkCoordinator() {
		return networkCoordinator;
	}

	/**
	 * Set the Node ID of the current Network Coordinator (NC) for the MoCA network.

          This parameter is based on ''mocaIfNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param networkCoordinator the input value
	 */
	public void  setNetworkCoordinator(Long networkCoordinator) {
		this.networkCoordinator = networkCoordinator;
	}

	/**
	 * Set the Node ID of the current Network Coordinator (NC) for the MoCA network.

          This parameter is based on ''mocaIfNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param networkCoordinator the input value
	 * @return this instance
	 */
	public Interface withNetworkCoordinator(Long networkCoordinator) {
		this.networkCoordinator = networkCoordinator;
		return this;
	}

	/**
	 * Get the Node ID of this interface.

          This parameter is based on ''mocaIfNodeID'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNodeID() {
		return nodeID;
	}

	/**
	 * Set the Node ID of this interface.

          This parameter is based on ''mocaIfNodeID'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param nodeID the input value
	 */
	public void  setNodeID(Long nodeID) {
		this.nodeID = nodeID;
	}

	/**
	 * Set the Node ID of this interface.

          This parameter is based on ''mocaIfNodeID'' from {{bibref|MOCA11-MIB}}.
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
	 * Get the maximum network node capability supported by the interface. If {{param}} is {{true}} then the interface supports 16 nodes (the maximum for a MoCA 1.1 network). If {{param}} is false then the interface supports 8 nodes (the maximum for a MoCA 1.0 network).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxNodes() {
		return maxNodes;
	}

	/**
	 * Set the maximum network node capability supported by the interface. If {{param}} is {{true}} then the interface supports 16 nodes (the maximum for a MoCA 1.1 network). If {{param}} is false then the interface supports 8 nodes (the maximum for a MoCA 1.0 network).
	 *
	 * @since 2.0
	 * @param maxNodes the input value
	 */
	public void  setMaxNodes(Boolean maxNodes) {
		this.maxNodes = maxNodes;
	}

	/**
	 * Set the maximum network node capability supported by the interface. If {{param}} is {{true}} then the interface supports 16 nodes (the maximum for a MoCA 1.1 network). If {{param}} is false then the interface supports 8 nodes (the maximum for a MoCA 1.0 network).
	 *
	 * @since 2.0
	 * @param maxNodes the input value
	 * @return this instance
	 */
	public Interface withMaxNodes(Boolean maxNodes) {
		this.maxNodes = maxNodes;
		return this;
	}

	/**
	 * Get the whether this interface is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaIfPreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPreferredNC() {
		return preferredNC;
	}

	/**
	 * Set the whether this interface is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaIfPreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param preferredNC the input value
	 */
	public void  setPreferredNC(Boolean preferredNC) {
		this.preferredNC = preferredNC;
	}

	/**
	 * Set the whether this interface is a preferred Network Coordinator (NC).

          This parameter is based on ''mocaIfPreferredNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param preferredNC the input value
	 * @return this instance
	 */
	public Interface withPreferredNC(Boolean preferredNC) {
		this.preferredNC = preferredNC;
		return this;
	}

	/**
	 * Get the Node ID of the backup Network Coordinator node.

          This parameter is based on ''mocaIfBackupNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBackupNC() {
		return backupNC;
	}

	/**
	 * Set the Node ID of the backup Network Coordinator node.

          This parameter is based on ''mocaIfBackupNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param backupNC the input value
	 */
	public void  setBackupNC(Long backupNC) {
		this.backupNC = backupNC;
	}

	/**
	 * Set the Node ID of the backup Network Coordinator node.

          This parameter is based on ''mocaIfBackupNC'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param backupNC the input value
	 * @return this instance
	 */
	public Interface withBackupNC(Long backupNC) {
		this.backupNC = backupNC;
		return this;
	}

	/**
	 * Get the configured privacy mode. This indicates whether link-layer security is enabled ({{true}}) or disabled ({{false}}) for network admission.

          The configured privacy setting MAY NOT match the current operational state ({{param|PrivacyEnabled}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPrivacyEnabledSetting() {
		return privacyEnabledSetting;
	}

	/**
	 * Set the configured privacy mode. This indicates whether link-layer security is enabled ({{true}}) or disabled ({{false}}) for network admission.

          The configured privacy setting MAY NOT match the current operational state ({{param|PrivacyEnabled}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 * @param privacyEnabledSetting the input value
	 */
	public void  setPrivacyEnabledSetting(Boolean privacyEnabledSetting) {
		this.privacyEnabledSetting = privacyEnabledSetting;
	}

	/**
	 * Set the configured privacy mode. This indicates whether link-layer security is enabled ({{true}}) or disabled ({{false}}) for network admission.

          The configured privacy setting MAY NOT match the current operational state ({{param|PrivacyEnabled}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 * @param privacyEnabledSetting the input value
	 * @return this instance
	 */
	public Interface withPrivacyEnabledSetting(Boolean privacyEnabledSetting) {
		this.privacyEnabledSetting = privacyEnabledSetting;
		return this;
	}

	/**
	 * Get the indicates whether link-layer security is enabled or disabled.

          This parameter is based on ''mocaIfPrivacyEnable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPrivacyEnabled() {
		return privacyEnabled;
	}

	/**
	 * Set the indicates whether link-layer security is enabled or disabled.

          This parameter is based on ''mocaIfPrivacyEnable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param privacyEnabled the input value
	 */
	public void  setPrivacyEnabled(Boolean privacyEnabled) {
		this.privacyEnabled = privacyEnabled;
	}

	/**
	 * Set the indicates whether link-layer security is enabled or disabled.

          This parameter is based on ''mocaIfPrivacyEnable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param privacyEnabled the input value
	 * @return this instance
	 */
	public Interface withPrivacyEnabled(Boolean privacyEnabled) {
		this.privacyEnabled = privacyEnabled;
		return this;
	}

	/**
	 * Get the hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          For example, an interface that supports 1150 MHz through 1500 MHz would have a value of 0x000000001FFFC000.

          This parameter is based on ''mocaIfCapabilityMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getFreqCapabilityMask() {
		return freqCapabilityMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          For example, an interface that supports 1150 MHz through 1500 MHz would have a value of 0x000000001FFFC000.

          This parameter is based on ''mocaIfCapabilityMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param freqCapabilityMask the input value
	 */
	public void  setFreqCapabilityMask(byte[] freqCapabilityMask) {
		this.freqCapabilityMask = freqCapabilityMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          For example, an interface that supports 1150 MHz through 1500 MHz would have a value of 0x000000001FFFC000.

          This parameter is based on ''mocaIfCapabilityMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param freqCapabilityMask the input value
	 * @return this instance
	 */
	public Interface withFreqCapabilityMask(byte[] freqCapabilityMask) {
		this.freqCapabilityMask = freqCapabilityMask;
		return this;
	}

	/**
	 * Get the configured hexadecimal encoded 64-bit mask of enabled frequencies for network admission.

          The configured frequencies MAY NOT match the current operational state ({{param|FreqCurrentMask}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getFreqCurrentMaskSetting() {
		return freqCurrentMaskSetting;
	}

	/**
	 * Set the configured hexadecimal encoded 64-bit mask of enabled frequencies for network admission.

          The configured frequencies MAY NOT match the current operational state ({{param|FreqCurrentMask}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 * @param freqCurrentMaskSetting the input value
	 */
	public void  setFreqCurrentMaskSetting(byte[] freqCurrentMaskSetting) {
		this.freqCurrentMaskSetting = freqCurrentMaskSetting;
	}

	/**
	 * Set the configured hexadecimal encoded 64-bit mask of enabled frequencies for network admission.

          The configured frequencies MAY NOT match the current operational state ({{param|FreqCurrentMask}}), since this setting is only applied during network formation or admission.
	 *
	 * @since 2.0
	 * @param freqCurrentMaskSetting the input value
	 * @return this instance
	 */
	public Interface withFreqCurrentMaskSetting(byte[] freqCurrentMaskSetting) {
		this.freqCurrentMaskSetting = freqCurrentMaskSetting;
		return this;
	}

	/**
	 * Get the hexadecimal encoded 64-bit mask of used frequencies. This is the bit map of the spectrum that can be used and is a subset of the {{param|FreqCapabilityMask}}. Each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getFreqCurrentMask() {
		return freqCurrentMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of used frequencies. This is the bit map of the spectrum that can be used and is a subset of the {{param|FreqCapabilityMask}}. Each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param freqCurrentMask the input value
	 */
	public void  setFreqCurrentMask(byte[] freqCurrentMask) {
		this.freqCurrentMask = freqCurrentMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of used frequencies. This is the bit map of the spectrum that can be used and is a subset of the {{param|FreqCapabilityMask}}. Each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param freqCurrentMask the input value
	 * @return this instance
	 */
	public Interface withFreqCurrentMask(byte[] freqCurrentMask) {
		this.freqCurrentMask = freqCurrentMask;
		return this;
	}

	/**
	 * Get the current Operational Frequency.  The RF frequency in Hz to which the MoCA interface is currently  tuned. This parameter is only valid when {{param|Status}} is {{enum|Up|Status}}.

          This parameter is based on ''mocaIfRFChannel'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCurrentOperFreq() {
		return currentOperFreq;
	}

	/**
	 * Set the current Operational Frequency.  The RF frequency in Hz to which the MoCA interface is currently  tuned. This parameter is only valid when {{param|Status}} is {{enum|Up|Status}}.

          This parameter is based on ''mocaIfRFChannel'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param currentOperFreq the input value
	 */
	public void  setCurrentOperFreq(Long currentOperFreq) {
		this.currentOperFreq = currentOperFreq;
	}

	/**
	 * Set the current Operational Frequency.  The RF frequency in Hz to which the MoCA interface is currently  tuned. This parameter is only valid when {{param|Status}} is {{enum|Up|Status}}.

          This parameter is based on ''mocaIfRFChannel'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param currentOperFreq the input value
	 * @return this instance
	 */
	public Interface withCurrentOperFreq(Long currentOperFreq) {
		this.currentOperFreq = currentOperFreq;
		return this;
	}

	/**
	 * Get the last Operational Frequency.  The RF frequency in Hz to which the MoCA interface was tuned when last in the {{enum|Up|Status}} state.

          This parameter is based on ''mocaIfLOF'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastOperFreq() {
		return lastOperFreq;
	}

	/**
	 * Set the last Operational Frequency.  The RF frequency in Hz to which the MoCA interface was tuned when last in the {{enum|Up|Status}} state.

          This parameter is based on ''mocaIfLOF'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param lastOperFreq the input value
	 */
	public void  setLastOperFreq(Long lastOperFreq) {
		this.lastOperFreq = lastOperFreq;
	}

	/**
	 * Set the last Operational Frequency.  The RF frequency in Hz to which the MoCA interface was tuned when last in the {{enum|Up|Status}} state.

          This parameter is based on ''mocaIfLOF'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param lastOperFreq the input value
	 * @return this instance
	 */
	public Interface withLastOperFreq(Long lastOperFreq) {
		this.lastOperFreq = lastOperFreq;
		return this;
	}

	/**
	 * Get the mocA Password. The value consists of numeric characters (0-9). {{pattern}}

          This parameter is based on ''mocaIfPassword'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getKeyPassphrase() {
		return keyPassphrase;
	}

	/**
	 * Set the mocA Password. The value consists of numeric characters (0-9). {{pattern}}

          This parameter is based on ''mocaIfPassword'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param keyPassphrase the input value
	 */
	public void  setKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
	}

	/**
	 * Set the mocA Password. The value consists of numeric characters (0-9). {{pattern}}

          This parameter is based on ''mocaIfPassword'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param keyPassphrase the input value
	 * @return this instance
	 */
	public Interface withKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
		return this;
	}

	/**
	 * Get the transmit Power attenuation in dB relative to the maximum transmit power.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfTxPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxpowerLimit() {
		return txpowerLimit;
	}

	/**
	 * Set the transmit Power attenuation in dB relative to the maximum transmit power.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfTxPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txpowerLimit the input value
	 */
	public void  setTxpowerLimit(Long txpowerLimit) {
		this.txpowerLimit = txpowerLimit;
	}

	/**
	 * Set the transmit Power attenuation in dB relative to the maximum transmit power.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfTxPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txpowerLimit the input value
	 * @return this instance
	 */
	public Interface withTxpowerLimit(Long txpowerLimit) {
		this.txpowerLimit = txpowerLimit;
		return this;
	}

	/**
	 * Get the target PHY rate in Mbps for the power control algorithm.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfPowerControlTargetRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPowerCntlPhyTarget() {
		return powerCntlPhyTarget;
	}

	/**
	 * Set the target PHY rate in Mbps for the power control algorithm.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfPowerControlTargetRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param powerCntlPhyTarget the input value
	 */
	public void  setPowerCntlPhyTarget(Long powerCntlPhyTarget) {
		this.powerCntlPhyTarget = powerCntlPhyTarget;
	}

	/**
	 * Set the target PHY rate in Mbps for the power control algorithm.

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfPowerControlTargetRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param powerCntlPhyTarget the input value
	 * @return this instance
	 */
	public Interface withPowerCntlPhyTarget(Long powerCntlPhyTarget) {
		this.powerCntlPhyTarget = powerCntlPhyTarget;
		return this;
	}

	/**
	 * Get the beacon Transmit Power attenuation in dB relative to the maximum transmit power. 

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfBeaconPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBeaconPowerLimit() {
		return beaconPowerLimit;
	}

	/**
	 * Set the beacon Transmit Power attenuation in dB relative to the maximum transmit power. 

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfBeaconPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param beaconPowerLimit the input value
	 */
	public void  setBeaconPowerLimit(Long beaconPowerLimit) {
		this.beaconPowerLimit = beaconPowerLimit;
	}

	/**
	 * Set the beacon Transmit Power attenuation in dB relative to the maximum transmit power. 

          The MoCA interface SHOULD have {{param|Enable}} set to {{false}} for any change in this configuration. If the parameter is modified when {{param|Enable}} is {{true}} then this change might take several minutes to complete.

          This parameter is based on ''mocaIfBeaconPowerLimit'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param beaconPowerLimit the input value
	 * @return this instance
	 */
	public Interface withBeaconPowerLimit(Long beaconPowerLimit) {
		this.beaconPowerLimit = beaconPowerLimit;
		return this;
	}

	/**
	 * Get the hexadecimal encoded 64-bit mask of MoCA taboo channels identified for the home network. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getNetworkTabooMask() {
		return networkTabooMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of MoCA taboo channels identified for the home network. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param networkTabooMask the input value
	 */
	public void  setNetworkTabooMask(byte[] networkTabooMask) {
		this.networkTabooMask = networkTabooMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of MoCA taboo channels identified for the home network. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param networkTabooMask the input value
	 * @return this instance
	 */
	public Interface withNetworkTabooMask(byte[] networkTabooMask) {
		this.networkTabooMask = networkTabooMask;
		return this;
	}

	/**
	 * Get the hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfNodeTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getNodeTabooMask() {
		return nodeTabooMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfNodeTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param nodeTabooMask the input value
	 */
	public void  setNodeTabooMask(byte[] nodeTabooMask) {
		this.nodeTabooMask = nodeTabooMask;
	}

	/**
	 * Set the hexadecimal encoded 64-bit mask of supported frequencies. This is the bit map of the spectrum that the interface supports, and each bit represents 25 MHz of spectrum. The least significant bit of the rightmost character corresponds to 800MHz, which is the lowest frequency.

          This parameter is based on ''mocaIfNodeTabooChannelMask'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param nodeTabooMask the input value
	 * @return this instance
	 */
	public Interface withNodeTabooMask(byte[] nodeTabooMask) {
		this.nodeTabooMask = nodeTabooMask;
		return this;
	}

	/**
	 * Get the broadcast PHY transmit rate in Mbps for this interface.

          This parameter is based on ''mocaIfTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxbcastRate() {
		return txbcastRate;
	}

	/**
	 * Set the broadcast PHY transmit rate in Mbps for this interface.

          This parameter is based on ''mocaIfTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txbcastRate the input value
	 */
	public void  setTxbcastRate(Long txbcastRate) {
		this.txbcastRate = txbcastRate;
	}

	/**
	 * Set the broadcast PHY transmit rate in Mbps for this interface.

          This parameter is based on ''mocaIfTxGcdRate'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txbcastRate the input value
	 * @return this instance
	 */
	public Interface withTxbcastRate(Long txbcastRate) {
		this.txbcastRate = txbcastRate;
		return this;
	}

	/**
	 * Get the transmit Power attenuation in dB relative to the maximum transmit power for broadcast transmissions.

          This parameter is based on ''mocaIfTxGcdPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxbcastPowerReduction() {
		return txbcastPowerReduction;
	}

	/**
	 * Set the transmit Power attenuation in dB relative to the maximum transmit power for broadcast transmissions.

          This parameter is based on ''mocaIfTxGcdPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txbcastPowerReduction the input value
	 */
	public void  setTxbcastPowerReduction(Long txbcastPowerReduction) {
		this.txbcastPowerReduction = txbcastPowerReduction;
	}

	/**
	 * Set the transmit Power attenuation in dB relative to the maximum transmit power for broadcast transmissions.

          This parameter is based on ''mocaIfTxGcdPowerReduction'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param txbcastPowerReduction the input value
	 * @return this instance
	 */
	public Interface withTxbcastPowerReduction(Long txbcastPowerReduction) {
		this.txbcastPowerReduction = txbcastPowerReduction;
		return this;
	}

	/**
	 * Get the whether this interface supports the 256 QAM feature.

          This parameter is based on ''mocaIfQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isQam256Capable() {
		return qam256Capable;
	}

	/**
	 * Set the whether this interface supports the 256 QAM feature.

          This parameter is based on ''mocaIfQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param qam256Capable the input value
	 */
	public void  setQam256Capable(Boolean qam256Capable) {
		this.qam256Capable = qam256Capable;
	}

	/**
	 * Set the whether this interface supports the 256 QAM feature.

          This parameter is based on ''mocaIfQAM256Capable'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param qam256Capable the input value
	 * @return this instance
	 */
	public Interface withQam256Capable(Boolean qam256Capable) {
		this.qam256Capable = qam256Capable;
		return this;
	}

	/**
	 * Get the packet aggregation capability supported by the interface. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaIfPacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketAggregationCapability() {
		return packetAggregationCapability;
	}

	/**
	 * Set the packet aggregation capability supported by the interface. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaIfPacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param packetAggregationCapability the input value
	 */
	public void  setPacketAggregationCapability(Long packetAggregationCapability) {
		this.packetAggregationCapability = packetAggregationCapability;
	}

	/**
	 * Set the packet aggregation capability supported by the interface. Standard values are 0 (no support), 6 (6 packets) or 10 (10 packets).

          This parameter is based on ''mocaIfPacketsAggrCapability'' from {{bibref|MOCA11-MIB}}.
	 *
	 * @since 2.0
	 * @param packetAggregationCapability the input value
	 * @return this instance
	 */
	public Interface withPacketAggregationCapability(Long packetAggregationCapability) {
		this.packetAggregationCapability = packetAggregationCapability;
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
	 * Get the QoS object provides information on MoCA parameterized QoS for this interface {{bibref|MoCAv1.1}}.
	 *
	 * @return the value
	 */
	public QoS getQos() {
		return qos;
	}

	/**
	 * Set the QoS object provides information on MoCA parameterized QoS for this interface {{bibref|MoCAv1.1}}.
	 *
	 * @param qos the input value
	 */
	public void  setQos(QoS qos) {
		this.qos = qos;
	}

	/**
	 * Set the QoS object provides information on MoCA parameterized QoS for this interface {{bibref|MoCAv1.1}}.
	 *
	 * @param qos the input value
	 * @return this instance
	 */
	public Interface withQos(QoS qos) {
		this.qos = qos;
		return this;
	}

	/**
	 * Get the this table contains information about other MoCA devices currently associated with this MoCA interface.
	 *
	 * @return the value
	 */
	public Collection<AssociatedDevice> getAssociatedDevices() {
		if (this.associatedDevices == null){ this.associatedDevices=new ArrayList<>();}
		return associatedDevices;
	}

	/**
	 * Set the this table contains information about other MoCA devices currently associated with this MoCA interface.
	 *
	 * @param associatedDevices the input value
	 */
	public void  setAssociatedDevices(Collection<AssociatedDevice> associatedDevices) {
		this.associatedDevices = associatedDevices;
	}

	/**
	 * Set the this table contains information about other MoCA devices currently associated with this MoCA interface.
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