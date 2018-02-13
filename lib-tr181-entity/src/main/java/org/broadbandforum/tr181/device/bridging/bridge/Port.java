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
package org.broadbandforum.tr181.device.bridging.bridge;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.bridging.bridge.port.PriorityCodePoint;
import org.broadbandforum.tr181.device.bridging.bridge.port.Stats;

	/**
	 * Bridge Port table, which MUST contain an entry for each bridge port (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).

        There are two types of bridge ports: management (upward facing) and non-management (downward facing). This is determined by configuring the Boolean {{param|ManagementPort}} parameter. The CPE will automatically configure each management bridge port to appear in the interface stack above all non-management bridge ports that share the same {{object|##.Bridge}} instance.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Bridging.Bridge.{i}.Port.{i}.")
@XmlRootElement(name = "Port")
@XmlType(name = "Device.Bridging.Bridge.Port")
@XmlAccessorType(XmlAccessType.FIELD)
public class Port {

	/**
	 * Enables or disables the bridge port.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The current operational state of the bridge port (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then this parameter SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then this parameter SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Down";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the bridge port as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the bridge port entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}. 

          When {{param|ManagementPort}} is set to {{true}} the CPE MUST set {{param}} to reference all non-management bridge ports that are within the same {{object|##.Bridge}} instance (and update {{param}} when subsequent non-management bridge ports are added or deleted on that ''Bridge''). The ACS SHOULD NOT set {{param}} in this case.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * If {{true}} then the entry is a management (upward facing) bridge port rather than a non-management (downward facing) bridge port. For a given {{object|##.Bridge}} instance, each management bridge port appears in the interface stack above all non-management bridge ports. The concept of Management Port is discussed in {{bibref|802.1Q-2005|chapter 8}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ManagementPort")
	@CWMPParameter(access = "readWrite")
	public Boolean managementPort = false;
	/**
	 * The type of bridge port as defined in 802.1Q {{bibref|802.1Q-2011|Section 17 IEEE8021BridgePortType}}.

          Enumeration of:

          {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	public String type;
	/**
	 * Bridge Port Default User Priority.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultUserPriority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long defaultUserPriority;
	/**
	 * {{list}} List items represent user priority regeneration values for each ingress user priority on this Bridge  Port.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PriorityRegeneration")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long priorityRegeneration;
	/**
	 * Bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PortState")
	public String portState = "Disabled";
	/**
	 * PVID (or Port VID) is the VLAN ID with which an untagged or priority tagged frame that arrives on this port will be associated (i.e. default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2011}}).

          For an 802.1D Bridge {{bibref|802.1D-2004}}, this parameter MUST be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PVID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 4094)
	public Integer pviD = 1;
	/**
	 * The Tag Protocol Identifier (TPID) assigned to this {{object}}. The TPID is an EtherType value used to identify the frame as a tagged frame.

          Standard {{bibref|802.1Q-2011|Table 9.1}} TPID values are:

          *S-TAG 0x88A8 = 34984

          *C-TAG 0x8100 = 33024

          Non-Standard TPID values are:

          *S-TAG 0x9100 = 37120
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "TPID")
	@CWMPParameter(access = "readWrite")
	public Long tpiD = 33024L;
	/**
	 * Indicates which types of frame arriving on this port will be admitted to the bridge (i.e. Bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2011}}).  {{enum}}

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AcceptableFrameTypes")
	@CWMPParameter(access = "readWrite")
	public String acceptableFrameTypes = "AdmitAll";
	/**
	 * Enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2011}}. If enabled ({{true}}), causes frames arriving on this port to be discarded if the port is not in the VLAN ID's member set (which is configured via the {{object|#.VLANPort}} table).

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IngressFiltering")
	@CWMPParameter(access = "readWrite")
	public Boolean ingressFiltering = false;
	/**
	 * This parameter controls the Service Access Priority selection function as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServiceAccessPrioritySelection")
	@CWMPParameter(access = "readWrite")
	public Boolean serviceAccessPrioritySelection = false;
	/**
	 * {{list}} List items represent service access priority translation values for each ingress priority on this {{object}} as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServiceAccessPriorityTranslation")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long serviceAccessPriorityTranslation;
	/**
	 * Enables or disables priority tagging on this Bridge Port. 

          When {{true}}, egress frames leaving this interface will be priority tagged with the frame's associated priority value, which will either be derived directly from the ingress frame or else set via {{param|.QoS.Classification.{i}.EthernetPriorityMark}}.

          When {{false}}, egress frames leaving this interface will be untagged.

          The parameter does not affect reception of ingress frames.

          Only applies on bridge ports that are untagged member of one or more VLAN's.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PriorityTagging")
	@CWMPParameter(access = "readWrite")
	public Boolean priorityTagging = false;
	/**
	 * {{object}} provides the management control for the processing of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}}.

        The object is applicable to deployments of  {{object|####.Bridging.ProviderBridge}} where the {{object|###.Bridge}} instance is referenced by {{param|####.Bridging.ProviderBridge.{i}.SVLANComponent}} or {{param|####.Bridging.ProviderBridge.{i}.CVLANComponents}} parameters.
	 */
	@XmlElement(name = "PriorityCodePoint")
	public PriorityCodePoint priorityCodePoint;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Port() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the bridge port.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the bridge port.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the bridge port.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Port withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the bridge port (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then this parameter SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then this parameter SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the bridge port (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then this parameter SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then this parameter SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the bridge port (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then this parameter SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then this parameter SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Port withStatus(String status) {
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
	public Port withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the bridge port as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the bridge port as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the bridge port as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Port withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the bridge port entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the bridge port entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the bridge port entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Port withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}. 

          When {{param|ManagementPort}} is set to {{true}} the CPE MUST set {{param}} to reference all non-management bridge ports that are within the same {{object|##.Bridge}} instance (and update {{param}} when subsequent non-management bridge ports are added or deleted on that ''Bridge''). The ACS SHOULD NOT set {{param}} in this case.
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

          When {{param|ManagementPort}} is set to {{true}} the CPE MUST set {{param}} to reference all non-management bridge ports that are within the same {{object|##.Bridge}} instance (and update {{param}} when subsequent non-management bridge ports are added or deleted on that ''Bridge''). The ACS SHOULD NOT set {{param}} in this case.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}. 

          When {{param|ManagementPort}} is set to {{true}} the CPE MUST set {{param}} to reference all non-management bridge ports that are within the same {{object|##.Bridge}} instance (and update {{param}} when subsequent non-management bridge ports are added or deleted on that ''Bridge''). The ACS SHOULD NOT set {{param}} in this case.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Port withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the if {{true}} then the entry is a management (upward facing) bridge port rather than a non-management (downward facing) bridge port. For a given {{object|##.Bridge}} instance, each management bridge port appears in the interface stack above all non-management bridge ports. The concept of Management Port is discussed in {{bibref|802.1Q-2005|chapter 8}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isManagementPort() {
		return managementPort;
	}

	/**
	 * Set the if {{true}} then the entry is a management (upward facing) bridge port rather than a non-management (downward facing) bridge port. For a given {{object|##.Bridge}} instance, each management bridge port appears in the interface stack above all non-management bridge ports. The concept of Management Port is discussed in {{bibref|802.1Q-2005|chapter 8}}.
	 *
	 * @since 2.0
	 * @param managementPort the input value
	 */
	public void  setManagementPort(Boolean managementPort) {
		this.managementPort = managementPort;
	}

	/**
	 * Set the if {{true}} then the entry is a management (upward facing) bridge port rather than a non-management (downward facing) bridge port. For a given {{object|##.Bridge}} instance, each management bridge port appears in the interface stack above all non-management bridge ports. The concept of Management Port is discussed in {{bibref|802.1Q-2005|chapter 8}}.
	 *
	 * @since 2.0
	 * @param managementPort the input value
	 * @return this instance
	 */
	public Port withManagementPort(Boolean managementPort) {
		this.managementPort = managementPort;
		return this;
	}

	/**
	 * Get the type of bridge port as defined in 802.1Q {{bibref|802.1Q-2011|Section 17 IEEE8021BridgePortType}}.

          Enumeration of:

          {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of bridge port as defined in 802.1Q {{bibref|802.1Q-2011|Section 17 IEEE8021BridgePortType}}.

          Enumeration of:

          {{enum}}
	 *
	 * @since 2.7
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the type of bridge port as defined in 802.1Q {{bibref|802.1Q-2011|Section 17 IEEE8021BridgePortType}}.

          Enumeration of:

          {{enum}}
	 *
	 * @since 2.7
	 * @param type the input value
	 * @return this instance
	 */
	public Port withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the bridge Port Default User Priority.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDefaultUserPriority() {
		return defaultUserPriority;
	}

	/**
	 * Set the bridge Port Default User Priority.
	 *
	 * @since 2.0
	 * @param defaultUserPriority the input value
	 */
	public void  setDefaultUserPriority(Long defaultUserPriority) {
		this.defaultUserPriority = defaultUserPriority;
	}

	/**
	 * Set the bridge Port Default User Priority.
	 *
	 * @since 2.0
	 * @param defaultUserPriority the input value
	 * @return this instance
	 */
	public Port withDefaultUserPriority(Long defaultUserPriority) {
		this.defaultUserPriority = defaultUserPriority;
		return this;
	}

	/**
	 * Get the {{list}} List items represent user priority regeneration values for each ingress user priority on this Bridge  Port.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriorityRegeneration() {
		return priorityRegeneration;
	}

	/**
	 * Set the {{list}} List items represent user priority regeneration values for each ingress user priority on this Bridge  Port.
	 *
	 * @since 2.0
	 * @param priorityRegeneration the input value
	 */
	public void  setPriorityRegeneration(Long priorityRegeneration) {
		this.priorityRegeneration = priorityRegeneration;
	}

	/**
	 * Set the {{list}} List items represent user priority regeneration values for each ingress user priority on this Bridge  Port.
	 *
	 * @since 2.0
	 * @param priorityRegeneration the input value
	 * @return this instance
	 */
	public Port withPriorityRegeneration(Long priorityRegeneration) {
		this.priorityRegeneration = priorityRegeneration;
		return this;
	}

	/**
	 * Get the bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPortState() {
		return portState;
	}

	/**
	 * Set the bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}}.
	 *
	 * @since 2.0
	 * @param portState the input value
	 */
	public void  setPortState(String portState) {
		this.portState = portState;
	}

	/**
	 * Set the bridge Port state as defined in 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}}.
	 *
	 * @since 2.0
	 * @param portState the input value
	 * @return this instance
	 */
	public Port withPortState(String portState) {
		this.portState = portState;
		return this;
	}

	/**
	 * Get the pviD (or Port VID) is the VLAN ID with which an untagged or priority tagged frame that arrives on this port will be associated (i.e. default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2011}}).

          For an 802.1D Bridge {{bibref|802.1D-2004}}, this parameter MUST be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPviD() {
		return pviD;
	}

	/**
	 * Set the pviD (or Port VID) is the VLAN ID with which an untagged or priority tagged frame that arrives on this port will be associated (i.e. default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2011}}).

          For an 802.1D Bridge {{bibref|802.1D-2004}}, this parameter MUST be ignored.
	 *
	 * @since 2.0
	 * @param pviD the input value
	 */
	public void  setPviD(Integer pviD) {
		this.pviD = pviD;
	}

	/**
	 * Set the pviD (or Port VID) is the VLAN ID with which an untagged or priority tagged frame that arrives on this port will be associated (i.e. default Port VLAN ID as defined in 802.1Q {{bibref|802.1Q-2011}}).

          For an 802.1D Bridge {{bibref|802.1D-2004}}, this parameter MUST be ignored.
	 *
	 * @since 2.0
	 * @param pviD the input value
	 * @return this instance
	 */
	public Port withPviD(Integer pviD) {
		this.pviD = pviD;
		return this;
	}

	/**
	 * Get the Tag Protocol Identifier (TPID) assigned to this {{object}}. The TPID is an EtherType value used to identify the frame as a tagged frame.

          Standard {{bibref|802.1Q-2011|Table 9.1}} TPID values are:

          *S-TAG 0x88A8 = 34984

          *C-TAG 0x8100 = 33024

          Non-Standard TPID values are:

          *S-TAG 0x9100 = 37120
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getTpiD() {
		return tpiD;
	}

	/**
	 * Set the Tag Protocol Identifier (TPID) assigned to this {{object}}. The TPID is an EtherType value used to identify the frame as a tagged frame.

          Standard {{bibref|802.1Q-2011|Table 9.1}} TPID values are:

          *S-TAG 0x88A8 = 34984

          *C-TAG 0x8100 = 33024

          Non-Standard TPID values are:

          *S-TAG 0x9100 = 37120
	 *
	 * @since 2.7
	 * @param tpiD the input value
	 */
	public void  setTpiD(Long tpiD) {
		this.tpiD = tpiD;
	}

	/**
	 * Set the Tag Protocol Identifier (TPID) assigned to this {{object}}. The TPID is an EtherType value used to identify the frame as a tagged frame.

          Standard {{bibref|802.1Q-2011|Table 9.1}} TPID values are:

          *S-TAG 0x88A8 = 34984

          *C-TAG 0x8100 = 33024

          Non-Standard TPID values are:

          *S-TAG 0x9100 = 37120
	 *
	 * @since 2.7
	 * @param tpiD the input value
	 * @return this instance
	 */
	public Port withTpiD(Long tpiD) {
		this.tpiD = tpiD;
		return this;
	}

	/**
	 * Get the indicates which types of frame arriving on this port will be admitted to the bridge (i.e. Bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2011}}).  {{enum}}

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAcceptableFrameTypes() {
		return acceptableFrameTypes;
	}

	/**
	 * Set the indicates which types of frame arriving on this port will be admitted to the bridge (i.e. Bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2011}}).  {{enum}}

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 2.0
	 * @param acceptableFrameTypes the input value
	 */
	public void  setAcceptableFrameTypes(String acceptableFrameTypes) {
		this.acceptableFrameTypes = acceptableFrameTypes;
	}

	/**
	 * Set the indicates which types of frame arriving on this port will be admitted to the bridge (i.e. Bridge Port acceptable frame types as defined in 802.1Q {{bibref|802.1Q-2011}}).  {{enum}}

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{enum|AdmitAll}}.
	 *
	 * @since 2.0
	 * @param acceptableFrameTypes the input value
	 * @return this instance
	 */
	public Port withAcceptableFrameTypes(String acceptableFrameTypes) {
		this.acceptableFrameTypes = acceptableFrameTypes;
		return this;
	}

	/**
	 * Get the enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2011}}. If enabled ({{true}}), causes frames arriving on this port to be discarded if the port is not in the VLAN ID's member set (which is configured via the {{object|#.VLANPort}} table).

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIngressFiltering() {
		return ingressFiltering;
	}

	/**
	 * Set the enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2011}}. If enabled ({{true}}), causes frames arriving on this port to be discarded if the port is not in the VLAN ID's member set (which is configured via the {{object|#.VLANPort}} table).

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param ingressFiltering the input value
	 */
	public void  setIngressFiltering(Boolean ingressFiltering) {
		this.ingressFiltering = ingressFiltering;
	}

	/**
	 * Set the enables or disables Ingress Filtering as defined in 802.1Q {{bibref|802.1Q-2011}}. If enabled ({{true}}), causes frames arriving on this port to be discarded if the port is not in the VLAN ID's member set (which is configured via the {{object|#.VLANPort}} table).

          For an 802.1D {{bibref|802.1D-2004}} Bridge, the value of this parameter MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param ingressFiltering the input value
	 * @return this instance
	 */
	public Port withIngressFiltering(Boolean ingressFiltering) {
		this.ingressFiltering = ingressFiltering;
		return this;
	}

	/**
	 * Get the this parameter controls the Service Access Priority selection function as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isServiceAccessPrioritySelection() {
		return serviceAccessPrioritySelection;
	}

	/**
	 * Set the this parameter controls the Service Access Priority selection function as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 * @param serviceAccessPrioritySelection the input value
	 */
	public void  setServiceAccessPrioritySelection(Boolean serviceAccessPrioritySelection) {
		this.serviceAccessPrioritySelection = serviceAccessPrioritySelection;
	}

	/**
	 * Set the this parameter controls the Service Access Priority selection function as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 * @param serviceAccessPrioritySelection the input value
	 * @return this instance
	 */
	public Port withServiceAccessPrioritySelection(Boolean serviceAccessPrioritySelection) {
		this.serviceAccessPrioritySelection = serviceAccessPrioritySelection;
		return this;
	}

	/**
	 * Get the {{list}} List items represent service access priority translation values for each ingress priority on this {{object}} as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getServiceAccessPriorityTranslation() {
		return serviceAccessPriorityTranslation;
	}

	/**
	 * Set the {{list}} List items represent service access priority translation values for each ingress priority on this {{object}} as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 * @param serviceAccessPriorityTranslation the input value
	 */
	public void  setServiceAccessPriorityTranslation(Long serviceAccessPriorityTranslation) {
		this.serviceAccessPriorityTranslation = serviceAccessPriorityTranslation;
	}

	/**
	 * Set the {{list}} List items represent service access priority translation values for each ingress priority on this {{object}} as described in {{bibref|802.1Q-2011|section 6.13}}.

          The parameter is applicable to deployments of {{object|##.Bridge}} instances that are referenced by {{param|###.Bridging.ProviderBridge.{i}.SVLANComponent}}.
	 *
	 * @since 2.7
	 * @param serviceAccessPriorityTranslation the input value
	 * @return this instance
	 */
	public Port withServiceAccessPriorityTranslation(Long serviceAccessPriorityTranslation) {
		this.serviceAccessPriorityTranslation = serviceAccessPriorityTranslation;
		return this;
	}

	/**
	 * Get the enables or disables priority tagging on this Bridge Port. 

          When {{true}}, egress frames leaving this interface will be priority tagged with the frame's associated priority value, which will either be derived directly from the ingress frame or else set via {{param|.QoS.Classification.{i}.EthernetPriorityMark}}.

          When {{false}}, egress frames leaving this interface will be untagged.

          The parameter does not affect reception of ingress frames.

          Only applies on bridge ports that are untagged member of one or more VLAN's.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPriorityTagging() {
		return priorityTagging;
	}

	/**
	 * Set the enables or disables priority tagging on this Bridge Port. 

          When {{true}}, egress frames leaving this interface will be priority tagged with the frame's associated priority value, which will either be derived directly from the ingress frame or else set via {{param|.QoS.Classification.{i}.EthernetPriorityMark}}.

          When {{false}}, egress frames leaving this interface will be untagged.

          The parameter does not affect reception of ingress frames.

          Only applies on bridge ports that are untagged member of one or more VLAN's.
	 *
	 * @since 2.0
	 * @param priorityTagging the input value
	 */
	public void  setPriorityTagging(Boolean priorityTagging) {
		this.priorityTagging = priorityTagging;
	}

	/**
	 * Set the enables or disables priority tagging on this Bridge Port. 

          When {{true}}, egress frames leaving this interface will be priority tagged with the frame's associated priority value, which will either be derived directly from the ingress frame or else set via {{param|.QoS.Classification.{i}.EthernetPriorityMark}}.

          When {{false}}, egress frames leaving this interface will be untagged.

          The parameter does not affect reception of ingress frames.

          Only applies on bridge ports that are untagged member of one or more VLAN's.
	 *
	 * @since 2.0
	 * @param priorityTagging the input value
	 * @return this instance
	 */
	public Port withPriorityTagging(Boolean priorityTagging) {
		this.priorityTagging = priorityTagging;
		return this;
	}

	/**
	 * Get the {{object}} provides the management control for the processing of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}}.

        The object is applicable to deployments of  {{object|####.Bridging.ProviderBridge}} where the {{object|###.Bridge}} instance is referenced by {{param|####.Bridging.ProviderBridge.{i}.SVLANComponent}} or {{param|####.Bridging.ProviderBridge.{i}.CVLANComponents}} parameters.
	 *
	 * @return the value
	 */
	public PriorityCodePoint getPriorityCodePoint() {
		return priorityCodePoint;
	}

	/**
	 * Set the {{object}} provides the management control for the processing of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}}.

        The object is applicable to deployments of  {{object|####.Bridging.ProviderBridge}} where the {{object|###.Bridge}} instance is referenced by {{param|####.Bridging.ProviderBridge.{i}.SVLANComponent}} or {{param|####.Bridging.ProviderBridge.{i}.CVLANComponents}} parameters.
	 *
	 * @param priorityCodePoint the input value
	 */
	public void  setPriorityCodePoint(PriorityCodePoint priorityCodePoint) {
		this.priorityCodePoint = priorityCodePoint;
	}

	/**
	 * Set the {{object}} provides the management control for the processing of the Priority Code Point (PCP) field for the 802.1Q header as defined in {{bibref|802.1Q-2011|section 6.9.3 Priority Code Point Encoding}}.

        The object is applicable to deployments of  {{object|####.Bridging.ProviderBridge}} where the {{object|###.Bridge}} instance is referenced by {{param|####.Bridging.ProviderBridge.{i}.SVLANComponent}} or {{param|####.Bridging.ProviderBridge.{i}.CVLANComponents}} parameters.
	 *
	 * @param priorityCodePoint the input value
	 * @return this instance
	 */
	public Port withPriorityCodePoint(PriorityCodePoint priorityCodePoint) {
		this.priorityCodePoint = priorityCodePoint;
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
	public Port withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}