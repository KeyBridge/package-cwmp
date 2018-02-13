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
package org.broadbandforum.tr181.device.dsl;

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
import org.broadbandforum.tr181.device.dsl.bondinggroup.BondedChannel;
import org.broadbandforum.tr181.device.dsl.bondinggroup.Ethernet;
import org.broadbandforum.tr181.device.dsl.bondinggroup.Stats;

	/**
	 * DSL bonding group table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). Each instance is a bonding group, and is expected to be stacked above a {{object|#.Channel}} instance for each bonded channel in the group.

        Many of the parameters within this object, including {{param|LowerLayers}}, are read-only because bonding is not expected to be configured via {{bibref|TR-069}}.

        The DSL bonding data model is closely aligned with {{bibref|TR-159}}. Corresponds to {{bibref|TR-159}} ''oBondingGroup''.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.BondingGroup.{i}.")
@XmlRootElement(name = "BondingGroup")
@XmlType(name = "Device.DSL.BondingGroup")
@XmlAccessorType(XmlAccessType.FIELD)
public class BondingGroup {

	/**
	 * Enables or disables the bonding group.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The current operational state of the bonding group (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

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
	 * The textual name of the bonding group as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the bonding group entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          {{param}} is read-only for this object because bonding is expected to be configured by the CPE, not by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayers")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * {{list}}  Indicates the current fault status of the DSL bonding group.  

Enumerated value must be one of [NoPeer, PeerPowerLoss, PeerBondSchemeMismatch, LowRate]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupStatus''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GroupStatus")
	@XmlList
	public Collection<String> groupStatus;
	/**
	 * DSL bonding group ID.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupID''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GroupID")
	public Long groupID;
	/**
	 * {{list}} Supported DSL bonding schemes. 

Enumerated value must be one of [ATM, Ethernet, TDIM]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupBondSchemesSupported''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BondSchemesSupported")
	@XmlList
	public Collection<String> bondSchemesSupported;
	/**
	 * Currently operating bonding scheme.  Corresponds to {{bibref|TR-159}} ''aGroupOperBondScheme''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BondScheme")
	public String bondScheme;
	/**
	 * DSL bonding group capacity, i.e. the maximum number of channels that can be bonded in this group. Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupCapacity''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GroupCapacity")
	@Size(min = 1, max = 32)
	public Long groupCapacity;
	/**
	 * The accumulated time in seconds for which this bonding group has been operationally up.  Corresponds to  {{bibref|G.998.1|section 11.4.2}} ''Group Running Time''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RunningTime")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long runningTime;
	/**
	 * Desired upstream data rate in bits per second for this DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetUpRate''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TargetUpRate")
	public Long targetUpRate;
	/**
	 * Desired downstream data rate in bits per second for DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetDownRate''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TargetDownRate")
	public Long targetDownRate;
	/**
	 * Threshold upstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the upstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowUpRate''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshLowUpRate")
	public Long threshLowUpRate;
	/**
	 * Threshold downstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the downstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowDownRate''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshLowDownRate")
	public Long threshLowDownRate;
	/**
	 * The maximum upstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamDifferentialDelayTolerance")
	public Long upstreamDifferentialDelayTolerance;
	/**
	 * The maximum downstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamDifferentialDelayTolerance")
	public Long downstreamDifferentialDelayTolerance;
	/**
	 * DSL bonded channel table. Each table entry represents a bonded channel within the bonding group, and is associated with exactly one {{object|##.Channel}} instance. There MUST be an instance of {{object}} for each DSL channel that is bonded.

        When a {{object|##.Channel}} is no longer bonded, then the CPE MUST delete the corresponding {{object}} instance. However, when a bonded {{object|##.Channel}} becomes disabled, the channel remains bonded and so the corresponding {{object}} instance MUST NOT be deleted.
	 */
	@XmlElementWrapper(name = "BondedChannels")
	@XmlElement(name = "BondedChannel")
	public Collection<BondedChannel> bondedChannels;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * Ethernet-based bonding parameters {{bibref|G.998.2}}.

        This object MUST be present if, and only if, {{param|#.BondScheme}} is {{enum|Ethernet|#.BondScheme}}.
	 */
	@XmlElement(name = "Ethernet")
	public Ethernet ethernet;

	public BondingGroup() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the bonding group.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the bonding group.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the bonding group.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public BondingGroup withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the bonding group (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

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
	 * Set the current operational state of the bonding group (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

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
	 * Set the current operational state of the bonding group (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public BondingGroup withStatus(String status) {
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
	public BondingGroup withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the bonding group as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the bonding group as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the bonding group as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public BondingGroup withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the bonding group entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the bonding group entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the bonding group entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public BondingGroup withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          {{param}} is read-only for this object because bonding is expected to be configured by the CPE, not by the ACS.
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

          {{param}} is read-only for this object because bonding is expected to be configured by the CPE, not by the ACS.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          {{param}} is read-only for this object because bonding is expected to be configured by the CPE, not by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public BondingGroup withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the {{list}}  Indicates the current fault status of the DSL bonding group.  

Enumerated value must be one of [NoPeer, PeerPowerLoss, PeerBondSchemeMismatch, LowRate]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupStatus''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getGroupStatus() {
		if (this.groupStatus == null){ this.groupStatus=new ArrayList<>();}
		return groupStatus;
	}

	/**
	 * Set the {{list}}  Indicates the current fault status of the DSL bonding group.  

Enumerated value must be one of [NoPeer, PeerPowerLoss, PeerBondSchemeMismatch, LowRate]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupStatus''.
	 *
	 * @since 2.0
	 * @param groupStatus the input value
	 */
	public void  setGroupStatus(Collection<String> groupStatus) {
		this.groupStatus = groupStatus;
	}

	/**
	 * Set the {{list}}  Indicates the current fault status of the DSL bonding group.  

Enumerated value must be one of [NoPeer, PeerPowerLoss, PeerBondSchemeMismatch, LowRate]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupStatus''.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public BondingGroup withGroupStatus(String string) {
		getGroupStatus().add(string);
		return this;
	}

	/**
	 * Get the dsl bonding group ID.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupID''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getGroupID() {
		return groupID;
	}

	/**
	 * Set the dsl bonding group ID.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupID''.
	 *
	 * @since 2.0
	 * @param groupID the input value
	 */
	public void  setGroupID(Long groupID) {
		this.groupID = groupID;
	}

	/**
	 * Set the dsl bonding group ID.  Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupID''.
	 *
	 * @since 2.0
	 * @param groupID the input value
	 * @return this instance
	 */
	public BondingGroup withGroupID(Long groupID) {
		this.groupID = groupID;
		return this;
	}

	/**
	 * Get the {{list}} Supported DSL bonding schemes. 

Enumerated value must be one of [ATM, Ethernet, TDIM]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupBondSchemesSupported''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getBondSchemesSupported() {
		if (this.bondSchemesSupported == null){ this.bondSchemesSupported=new ArrayList<>();}
		return bondSchemesSupported;
	}

	/**
	 * Set the {{list}} Supported DSL bonding schemes. 

Enumerated value must be one of [ATM, Ethernet, TDIM]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupBondSchemesSupported''.
	 *
	 * @since 2.0
	 * @param bondSchemesSupported the input value
	 */
	public void  setBondSchemesSupported(Collection<String> bondSchemesSupported) {
		this.bondSchemesSupported = bondSchemesSupported;
	}

	/**
	 * Set the {{list}} Supported DSL bonding schemes. 

Enumerated value must be one of [ATM, Ethernet, TDIM]

          Corresponds to {{bibref|TR-159}} ''oBondingGroup.aGroupBondSchemesSupported''.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public BondingGroup withBondSchemesSupported(String string) {
		getBondSchemesSupported().add(string);
		return this;
	}

	/**
	 * Get the currently operating bonding scheme.  Corresponds to {{bibref|TR-159}} ''aGroupOperBondScheme''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBondScheme() {
		return bondScheme;
	}

	/**
	 * Set the currently operating bonding scheme.  Corresponds to {{bibref|TR-159}} ''aGroupOperBondScheme''.
	 *
	 * @since 2.0
	 * @param bondScheme the input value
	 */
	public void  setBondScheme(String bondScheme) {
		this.bondScheme = bondScheme;
	}

	/**
	 * Set the currently operating bonding scheme.  Corresponds to {{bibref|TR-159}} ''aGroupOperBondScheme''.
	 *
	 * @since 2.0
	 * @param bondScheme the input value
	 * @return this instance
	 */
	public BondingGroup withBondScheme(String bondScheme) {
		this.bondScheme = bondScheme;
		return this;
	}

	/**
	 * Get the dsl bonding group capacity, i.e. the maximum number of channels that can be bonded in this group. Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupCapacity''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getGroupCapacity() {
		return groupCapacity;
	}

	/**
	 * Set the dsl bonding group capacity, i.e. the maximum number of channels that can be bonded in this group. Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupCapacity''.
	 *
	 * @since 2.0
	 * @param groupCapacity the input value
	 */
	public void  setGroupCapacity(Long groupCapacity) {
		this.groupCapacity = groupCapacity;
	}

	/**
	 * Set the dsl bonding group capacity, i.e. the maximum number of channels that can be bonded in this group. Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupCapacity''.
	 *
	 * @since 2.0
	 * @param groupCapacity the input value
	 * @return this instance
	 */
	public BondingGroup withGroupCapacity(Long groupCapacity) {
		this.groupCapacity = groupCapacity;
		return this;
	}

	/**
	 * Get the accumulated time in seconds for which this bonding group has been operationally up.  Corresponds to  {{bibref|G.998.1|section 11.4.2}} ''Group Running Time''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRunningTime() {
		return runningTime;
	}

	/**
	 * Set the accumulated time in seconds for which this bonding group has been operationally up.  Corresponds to  {{bibref|G.998.1|section 11.4.2}} ''Group Running Time''.
	 *
	 * @since 2.0
	 * @param runningTime the input value
	 */
	public void  setRunningTime(Long runningTime) {
		this.runningTime = runningTime;
	}

	/**
	 * Set the accumulated time in seconds for which this bonding group has been operationally up.  Corresponds to  {{bibref|G.998.1|section 11.4.2}} ''Group Running Time''.
	 *
	 * @since 2.0
	 * @param runningTime the input value
	 * @return this instance
	 */
	public BondingGroup withRunningTime(Long runningTime) {
		this.runningTime = runningTime;
		return this;
	}

	/**
	 * Get the desired upstream data rate in bits per second for this DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetUpRate''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTargetUpRate() {
		return targetUpRate;
	}

	/**
	 * Set the desired upstream data rate in bits per second for this DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetUpRate''.
	 *
	 * @since 2.0
	 * @param targetUpRate the input value
	 */
	public void  setTargetUpRate(Long targetUpRate) {
		this.targetUpRate = targetUpRate;
	}

	/**
	 * Set the desired upstream data rate in bits per second for this DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetUpRate''.
	 *
	 * @since 2.0
	 * @param targetUpRate the input value
	 * @return this instance
	 */
	public BondingGroup withTargetUpRate(Long targetUpRate) {
		this.targetUpRate = targetUpRate;
		return this;
	}

	/**
	 * Get the desired downstream data rate in bits per second for DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetDownRate''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTargetDownRate() {
		return targetDownRate;
	}

	/**
	 * Set the desired downstream data rate in bits per second for DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetDownRate''.
	 *
	 * @since 2.0
	 * @param targetDownRate the input value
	 */
	public void  setTargetDownRate(Long targetDownRate) {
		this.targetDownRate = targetDownRate;
	}

	/**
	 * Set the desired downstream data rate in bits per second for DSL bonding group (zero indicates best effort). Corresponds to  {{bibref|TR-159}} ''oBondingGroup.aGroupTargetDownRate''.
	 *
	 * @since 2.0
	 * @param targetDownRate the input value
	 * @return this instance
	 */
	public BondingGroup withTargetDownRate(Long targetDownRate) {
		this.targetDownRate = targetDownRate;
		return this;
	}

	/**
	 * Get the threshold upstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the upstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowUpRate''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshLowUpRate() {
		return threshLowUpRate;
	}

	/**
	 * Set the threshold upstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the upstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowUpRate''.
	 *
	 * @since 2.0
	 * @param threshLowUpRate the input value
	 */
	public void  setThreshLowUpRate(Long threshLowUpRate) {
		this.threshLowUpRate = threshLowUpRate;
	}

	/**
	 * Set the threshold upstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the upstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowUpRate''.
	 *
	 * @since 2.0
	 * @param threshLowUpRate the input value
	 * @return this instance
	 */
	public BondingGroup withThreshLowUpRate(Long threshLowUpRate) {
		this.threshLowUpRate = threshLowUpRate;
		return this;
	}

	/**
	 * Get the threshold downstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the downstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowDownRate''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshLowDownRate() {
		return threshLowDownRate;
	}

	/**
	 * Set the threshold downstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the downstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowDownRate''.
	 *
	 * @since 2.0
	 * @param threshLowDownRate the input value
	 */
	public void  setThreshLowDownRate(Long threshLowDownRate) {
		this.threshLowDownRate = threshLowDownRate;
	}

	/**
	 * Set the threshold downstream data rate in bits per second for this DSL bonding group.  {{param|GroupStatus}} will include  {{enum|LowRate|GroupStatus}} whenever the downstream rate is less than this threshold.  Corresponds to {{bibref|TR-159}}  ''oBondingGroup.aGroupThreshLowDownRate''.
	 *
	 * @since 2.0
	 * @param threshLowDownRate the input value
	 * @return this instance
	 */
	public BondingGroup withThreshLowDownRate(Long threshLowDownRate) {
		this.threshLowDownRate = threshLowDownRate;
		return this;
	}

	/**
	 * Get the maximum upstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUpstreamDifferentialDelayTolerance() {
		return upstreamDifferentialDelayTolerance;
	}

	/**
	 * Set the maximum upstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 * @param upstreamDifferentialDelayTolerance the input value
	 */
	public void  setUpstreamDifferentialDelayTolerance(Long upstreamDifferentialDelayTolerance) {
		this.upstreamDifferentialDelayTolerance = upstreamDifferentialDelayTolerance;
	}

	/**
	 * Set the maximum upstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 * @param upstreamDifferentialDelayTolerance the input value
	 * @return this instance
	 */
	public BondingGroup withUpstreamDifferentialDelayTolerance(Long upstreamDifferentialDelayTolerance) {
		this.upstreamDifferentialDelayTolerance = upstreamDifferentialDelayTolerance;
		return this;
	}

	/**
	 * Get the maximum downstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDownstreamDifferentialDelayTolerance() {
		return downstreamDifferentialDelayTolerance;
	}

	/**
	 * Set the maximum downstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 * @param downstreamDifferentialDelayTolerance the input value
	 */
	public void  setDownstreamDifferentialDelayTolerance(Long downstreamDifferentialDelayTolerance) {
		this.downstreamDifferentialDelayTolerance = downstreamDifferentialDelayTolerance;
	}

	/**
	 * Set the maximum downstream differential delay in milliseconds among member links in a bonding group.  Corresponds to  {{bibref|G.998.1|section 11.4.1}} ''Differential Delay Tolerance''.
	 *
	 * @since 2.0
	 * @param downstreamDifferentialDelayTolerance the input value
	 * @return this instance
	 */
	public BondingGroup withDownstreamDifferentialDelayTolerance(Long downstreamDifferentialDelayTolerance) {
		this.downstreamDifferentialDelayTolerance = downstreamDifferentialDelayTolerance;
		return this;
	}

	/**
	 * Get the dsl bonded channel table. Each table entry represents a bonded channel within the bonding group, and is associated with exactly one {{object|##.Channel}} instance. There MUST be an instance of {{object}} for each DSL channel that is bonded.

        When a {{object|##.Channel}} is no longer bonded, then the CPE MUST delete the corresponding {{object}} instance. However, when a bonded {{object|##.Channel}} becomes disabled, the channel remains bonded and so the corresponding {{object}} instance MUST NOT be deleted.
	 *
	 * @return the value
	 */
	public Collection<BondedChannel> getBondedChannels() {
		if (this.bondedChannels == null){ this.bondedChannels=new ArrayList<>();}
		return bondedChannels;
	}

	/**
	 * Set the dsl bonded channel table. Each table entry represents a bonded channel within the bonding group, and is associated with exactly one {{object|##.Channel}} instance. There MUST be an instance of {{object}} for each DSL channel that is bonded.

        When a {{object|##.Channel}} is no longer bonded, then the CPE MUST delete the corresponding {{object}} instance. However, when a bonded {{object|##.Channel}} becomes disabled, the channel remains bonded and so the corresponding {{object}} instance MUST NOT be deleted.
	 *
	 * @param bondedChannels the input value
	 */
	public void  setBondedChannels(Collection<BondedChannel> bondedChannels) {
		this.bondedChannels = bondedChannels;
	}

	/**
	 * Set the dsl bonded channel table. Each table entry represents a bonded channel within the bonding group, and is associated with exactly one {{object|##.Channel}} instance. There MUST be an instance of {{object}} for each DSL channel that is bonded.

        When a {{object|##.Channel}} is no longer bonded, then the CPE MUST delete the corresponding {{object}} instance. However, when a bonded {{object|##.Channel}} becomes disabled, the channel remains bonded and so the corresponding {{object}} instance MUST NOT be deleted.
	 *
	 * @param bondedChannel the input value
	 * @return this instance
	 */
	public BondingGroup withBondedChannel(BondedChannel bondedChannel) {
		getBondedChannels().add(bondedChannel);
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
	public BondingGroup withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the ethernet-based bonding parameters {{bibref|G.998.2}}.

        This object MUST be present if, and only if, {{param|#.BondScheme}} is {{enum|Ethernet|#.BondScheme}}.
	 *
	 * @return the value
	 */
	public Ethernet getEthernet() {
		return ethernet;
	}

	/**
	 * Set the ethernet-based bonding parameters {{bibref|G.998.2}}.

        This object MUST be present if, and only if, {{param|#.BondScheme}} is {{enum|Ethernet|#.BondScheme}}.
	 *
	 * @param ethernet the input value
	 */
	public void  setEthernet(Ethernet ethernet) {
		this.ethernet = ethernet;
	}

	/**
	 * Set the ethernet-based bonding parameters {{bibref|G.998.2}}.

        This object MUST be present if, and only if, {{param|#.BondScheme}} is {{enum|Ethernet|#.BondScheme}}.
	 *
	 * @param ethernet the input value
	 * @return this instance
	 */
	public BondingGroup withEthernet(Ethernet ethernet) {
		this.ethernet = ethernet;
		return this;
	}

	//</editor-fold>

}