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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.firewall.chain.Rule;

	/**
	 * Firewall Chain table. Each entry contains an ordered list of {{object|Rule}} objects which can themselves reference other {{object}} instances. A hierarchy of rules can therefore be created.

        A given Firewall Chain's rules are all created by the same entity, as indicated by the {{param|Creator}} parameter.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.Firewall.Chain.{i}.")
@XmlRootElement(name = "Chain")
@XmlType(name = "Device.Firewall.Chain")
@XmlAccessorType(XmlAccessType.FIELD)
public class Chain {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
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
	 * Creator of this {{object}} entry and of its {{object|Rule}}s. {{enum}}

          Note that this is the entity that originally created the {{object}} entry.  The value of this parameter does not change if the {{object}} entry or one of its rules is subsequently changed by another entity.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Creator")
	public String creator = "ACS";
	/**
	 * Firewall Rule table. Each entry defines a Firewall packet selection rule. The {{param|Target}} parameter defines the action to perform for traffic matching this rule: the packet can be dropped, accepted, rejected or passed to another {{object|#}}.

        This table MUST NOT contain dynamic Firewall rules associated with {{enum|Stateful|##.Type}} Firewall sessions.

        All entries are created by the creator of the parent {{object|#}}, as indicated by its {{param|#.Creator}} parameter.  {{object}} entries in a {{object|#}} with a {{param|#.Creator}} of {{enum|Defaults|#.Creator}}, {{enum|ACS|#.Creator}}, {{enum|UserInterface|#.Creator}} or (maybe) {{enum|Other|#.Creator}} are referred to as ''Static'' {{object}}s.  Whether or not a {{object}} in a {{object|#}} with {{param|#.Creator}} {{enum|Other|#.Creator}} is regarded as ''Static'' is a local matter to the CPE.  Some of this object's parameter descriptions refer to whether a {{object}} is ''Static'' when specifying whether or not the parameter value can be modified.

        For enabled table entries, if {{param|SourceInterface}} is not a valid reference and {{param|SourceAllInterfaces}} is {{false}}, or if {{param|DestInterface}} is not a valid reference and {{param|DestAllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "Rules")
	@XmlElement(name = "Rule")
	@CWMPParameter(access = "readWrite")
	public Collection<Rule> rules;

	public Chain() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public Chain withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

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
	public Chain withAlias(Alias alias) {
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
	public Chain withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the creator of this {{object}} entry and of its {{object|Rule}}s. {{enum}}

          Note that this is the entity that originally created the {{object}} entry.  The value of this parameter does not change if the {{object}} entry or one of its rules is subsequently changed by another entity.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Set the creator of this {{object}} entry and of its {{object|Rule}}s. {{enum}}

          Note that this is the entity that originally created the {{object}} entry.  The value of this parameter does not change if the {{object}} entry or one of its rules is subsequently changed by another entity.
	 *
	 * @since 2.2
	 * @param creator the input value
	 */
	public void  setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * Set the creator of this {{object}} entry and of its {{object|Rule}}s. {{enum}}

          Note that this is the entity that originally created the {{object}} entry.  The value of this parameter does not change if the {{object}} entry or one of its rules is subsequently changed by another entity.
	 *
	 * @since 2.2
	 * @param creator the input value
	 * @return this instance
	 */
	public Chain withCreator(String creator) {
		this.creator = creator;
		return this;
	}

	/**
	 * Get the firewall Rule table. Each entry defines a Firewall packet selection rule. The {{param|Target}} parameter defines the action to perform for traffic matching this rule: the packet can be dropped, accepted, rejected or passed to another {{object|#}}.

        This table MUST NOT contain dynamic Firewall rules associated with {{enum|Stateful|##.Type}} Firewall sessions.

        All entries are created by the creator of the parent {{object|#}}, as indicated by its {{param|#.Creator}} parameter.  {{object}} entries in a {{object|#}} with a {{param|#.Creator}} of {{enum|Defaults|#.Creator}}, {{enum|ACS|#.Creator}}, {{enum|UserInterface|#.Creator}} or (maybe) {{enum|Other|#.Creator}} are referred to as ''Static'' {{object}}s.  Whether or not a {{object}} in a {{object|#}} with {{param|#.Creator}} {{enum|Other|#.Creator}} is regarded as ''Static'' is a local matter to the CPE.  Some of this object's parameter descriptions refer to whether a {{object}} is ''Static'' when specifying whether or not the parameter value can be modified.

        For enabled table entries, if {{param|SourceInterface}} is not a valid reference and {{param|SourceAllInterfaces}} is {{false}}, or if {{param|DestInterface}} is not a valid reference and {{param|DestAllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Rule> getRules() {
		if (this.rules == null){ this.rules=new ArrayList<>();}
		return rules;
	}

	/**
	 * Set the firewall Rule table. Each entry defines a Firewall packet selection rule. The {{param|Target}} parameter defines the action to perform for traffic matching this rule: the packet can be dropped, accepted, rejected or passed to another {{object|#}}.

        This table MUST NOT contain dynamic Firewall rules associated with {{enum|Stateful|##.Type}} Firewall sessions.

        All entries are created by the creator of the parent {{object|#}}, as indicated by its {{param|#.Creator}} parameter.  {{object}} entries in a {{object|#}} with a {{param|#.Creator}} of {{enum|Defaults|#.Creator}}, {{enum|ACS|#.Creator}}, {{enum|UserInterface|#.Creator}} or (maybe) {{enum|Other|#.Creator}} are referred to as ''Static'' {{object}}s.  Whether or not a {{object}} in a {{object|#}} with {{param|#.Creator}} {{enum|Other|#.Creator}} is regarded as ''Static'' is a local matter to the CPE.  Some of this object's parameter descriptions refer to whether a {{object}} is ''Static'' when specifying whether or not the parameter value can be modified.

        For enabled table entries, if {{param|SourceInterface}} is not a valid reference and {{param|SourceAllInterfaces}} is {{false}}, or if {{param|DestInterface}} is not a valid reference and {{param|DestAllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param rules the input value
	 */
	public void  setRules(Collection<Rule> rules) {
		this.rules = rules;
	}

	/**
	 * Set the firewall Rule table. Each entry defines a Firewall packet selection rule. The {{param|Target}} parameter defines the action to perform for traffic matching this rule: the packet can be dropped, accepted, rejected or passed to another {{object|#}}.

        This table MUST NOT contain dynamic Firewall rules associated with {{enum|Stateful|##.Type}} Firewall sessions.

        All entries are created by the creator of the parent {{object|#}}, as indicated by its {{param|#.Creator}} parameter.  {{object}} entries in a {{object|#}} with a {{param|#.Creator}} of {{enum|Defaults|#.Creator}}, {{enum|ACS|#.Creator}}, {{enum|UserInterface|#.Creator}} or (maybe) {{enum|Other|#.Creator}} are referred to as ''Static'' {{object}}s.  Whether or not a {{object}} in a {{object|#}} with {{param|#.Creator}} {{enum|Other|#.Creator}} is regarded as ''Static'' is a local matter to the CPE.  Some of this object's parameter descriptions refer to whether a {{object}} is ''Static'' when specifying whether or not the parameter value can be modified.

        For enabled table entries, if {{param|SourceInterface}} is not a valid reference and {{param|SourceAllInterfaces}} is {{false}}, or if {{param|DestInterface}} is not a valid reference and {{param|DestAllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param rule the input value
	 * @return this instance
	 */
	public Chain withRule(Rule rule) {
		getRules().add(rule);
		return this;
	}

	//</editor-fold>

}