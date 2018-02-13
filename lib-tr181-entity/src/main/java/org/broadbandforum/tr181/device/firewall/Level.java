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
package org.broadbandforum.tr181.device.firewall;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Firewall Level table. When an {{enum|Advanced|#.Config}} configuration is selected, {{param|#.AdvancedLevel}} selects the currently active entry in this table. Each {{object}} table entry references the {{object|#.Chain}} that contains the rules for this level.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.Firewall.Level.{i}.")
@XmlRootElement(name = "Device.Firewall.Level")
@XmlType(name = "Device.Firewall.Level")
@XmlAccessorType(XmlAccessType.FIELD)
public class Level {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name associated with this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * Human-readable description associated with this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Description")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String description;
	/**
	 * Position of the {{object}} entry for user interface display; levels can be presented according to an increasing or decreasing level of security. 

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all greater-valued {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
	/**
	 * The Chain containing Firewall Level Rules associated with this {{object}} entry.

          On creation of a new {{object}} entry, the device will automatically create a new {{object|#.Chain}} table entry that this {{param}} parameter will reference.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Chain")
	public String chain;
	/**
	 * Indicates whether NAT port mapping is enabled or disabled when this is the active Level.  For a {{enum|Stateless|#.Type}} Firewall this can be set to {{false}} to force any port mappings to be operationally disabled (for a {{enum|Stateful|#.Type}} Firewall this is not necessary because the same effect can be achieved via Firewall rules).

          This parameter affects all the interfaces on which NAT is enabled.  It operationally enables or disables port mapping functionality and therefore does not affect the individual {{param|##.NAT.PortMapping.{i}.Enable}} settings.  Note that the current NAT status and NAT port mapping status are indicated by the {{param|##.NAT.InterfaceSetting.{i}.Status}} parameter.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PortMappingEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean portMappingEnabled = true;
	/**
	 * Default action for packets not matching any of the level rules. {{enum}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DefaultPolicy")
	@CWMPParameter(access = "readWrite")
	public String defaultPolicy = "Drop";
	/**
	 * Enable or disable logging, in a {{object|##.DeviceInfo.VendorLogFile}}, of packets not matching any of the level rules.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DefaultLogPolicy")
	@CWMPParameter(access = "readWrite")
	public Boolean defaultLogPolicy = false;

	public Level() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public Level withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param name the input value
	 * @return this instance
	 */
	public Level withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the human-readable description associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the human-readable description associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set the human-readable description associated with this {{object}} entry.
	 *
	 * @since 2.2
	 * @param description the input value
	 * @return this instance
	 */
	public Level withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry for user interface display; levels can be presented according to an increasing or decreasing level of security. 

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all greater-valued {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry for user interface display; levels can be presented according to an increasing or decreasing level of security. 

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all greater-valued {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.2
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry for user interface display; levels can be presented according to an increasing or decreasing level of security. 

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all greater-valued {{param}} entries is incremented to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value.
	 *
	 * @since 2.2
	 * @param order the input value
	 * @return this instance
	 */
	public Level withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get the Chain containing Firewall Level Rules associated with this {{object}} entry.

          On creation of a new {{object}} entry, the device will automatically create a new {{object|#.Chain}} table entry that this {{param}} parameter will reference.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getChain() {
		return chain;
	}

	/**
	 * Set the Chain containing Firewall Level Rules associated with this {{object}} entry.

          On creation of a new {{object}} entry, the device will automatically create a new {{object|#.Chain}} table entry that this {{param}} parameter will reference.
	 *
	 * @since 2.2
	 * @param chain the input value
	 */
	public void  setChain(String chain) {
		this.chain = chain;
	}

	/**
	 * Set the Chain containing Firewall Level Rules associated with this {{object}} entry.

          On creation of a new {{object}} entry, the device will automatically create a new {{object|#.Chain}} table entry that this {{param}} parameter will reference.
	 *
	 * @since 2.2
	 * @param chain the input value
	 * @return this instance
	 */
	public Level withChain(String chain) {
		this.chain = chain;
		return this;
	}

	/**
	 * Get the indicates whether NAT port mapping is enabled or disabled when this is the active Level.  For a {{enum|Stateless|#.Type}} Firewall this can be set to {{false}} to force any port mappings to be operationally disabled (for a {{enum|Stateful|#.Type}} Firewall this is not necessary because the same effect can be achieved via Firewall rules).

          This parameter affects all the interfaces on which NAT is enabled.  It operationally enables or disables port mapping functionality and therefore does not affect the individual {{param|##.NAT.PortMapping.{i}.Enable}} settings.  Note that the current NAT status and NAT port mapping status are indicated by the {{param|##.NAT.InterfaceSetting.{i}.Status}} parameter.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isPortMappingEnabled() {
		return portMappingEnabled;
	}

	/**
	 * Set the indicates whether NAT port mapping is enabled or disabled when this is the active Level.  For a {{enum|Stateless|#.Type}} Firewall this can be set to {{false}} to force any port mappings to be operationally disabled (for a {{enum|Stateful|#.Type}} Firewall this is not necessary because the same effect can be achieved via Firewall rules).

          This parameter affects all the interfaces on which NAT is enabled.  It operationally enables or disables port mapping functionality and therefore does not affect the individual {{param|##.NAT.PortMapping.{i}.Enable}} settings.  Note that the current NAT status and NAT port mapping status are indicated by the {{param|##.NAT.InterfaceSetting.{i}.Status}} parameter.
	 *
	 * @since 2.2
	 * @param portMappingEnabled the input value
	 */
	public void  setPortMappingEnabled(Boolean portMappingEnabled) {
		this.portMappingEnabled = portMappingEnabled;
	}

	/**
	 * Set the indicates whether NAT port mapping is enabled or disabled when this is the active Level.  For a {{enum|Stateless|#.Type}} Firewall this can be set to {{false}} to force any port mappings to be operationally disabled (for a {{enum|Stateful|#.Type}} Firewall this is not necessary because the same effect can be achieved via Firewall rules).

          This parameter affects all the interfaces on which NAT is enabled.  It operationally enables or disables port mapping functionality and therefore does not affect the individual {{param|##.NAT.PortMapping.{i}.Enable}} settings.  Note that the current NAT status and NAT port mapping status are indicated by the {{param|##.NAT.InterfaceSetting.{i}.Status}} parameter.
	 *
	 * @since 2.2
	 * @param portMappingEnabled the input value
	 * @return this instance
	 */
	public Level withPortMappingEnabled(Boolean portMappingEnabled) {
		this.portMappingEnabled = portMappingEnabled;
		return this;
	}

	/**
	 * Get the default action for packets not matching any of the level rules. {{enum}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getDefaultPolicy() {
		return defaultPolicy;
	}

	/**
	 * Set the default action for packets not matching any of the level rules. {{enum}}
	 *
	 * @since 2.2
	 * @param defaultPolicy the input value
	 */
	public void  setDefaultPolicy(String defaultPolicy) {
		this.defaultPolicy = defaultPolicy;
	}

	/**
	 * Set the default action for packets not matching any of the level rules. {{enum}}
	 *
	 * @since 2.2
	 * @param defaultPolicy the input value
	 * @return this instance
	 */
	public Level withDefaultPolicy(String defaultPolicy) {
		this.defaultPolicy = defaultPolicy;
		return this;
	}

	/**
	 * Get the enable or disable logging, in a {{object|##.DeviceInfo.VendorLogFile}}, of packets not matching any of the level rules.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isDefaultLogPolicy() {
		return defaultLogPolicy;
	}

	/**
	 * Set the enable or disable logging, in a {{object|##.DeviceInfo.VendorLogFile}}, of packets not matching any of the level rules.
	 *
	 * @since 2.2
	 * @param defaultLogPolicy the input value
	 */
	public void  setDefaultLogPolicy(Boolean defaultLogPolicy) {
		this.defaultLogPolicy = defaultLogPolicy;
	}

	/**
	 * Set the enable or disable logging, in a {{object|##.DeviceInfo.VendorLogFile}}, of packets not matching any of the level rules.
	 *
	 * @since 2.2
	 * @param defaultLogPolicy the input value
	 * @return this instance
	 */
	public Level withDefaultLogPolicy(Boolean defaultLogPolicy) {
		this.defaultLogPolicy = defaultLogPolicy;
		return this;
	}

	//</editor-fold>

}