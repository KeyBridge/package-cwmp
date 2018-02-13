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
package org.broadbandforum.tr181.device.firewall.chain;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPAddress;
import org.broadbandforum.tr181.datatypes.IPPrefix;

	/**
	 * Firewall Rule table. Each entry defines a Firewall packet selection rule. The {{param|Target}} parameter defines the action to perform for traffic matching this rule: the packet can be dropped, accepted, rejected or passed to another {{object|#}}.

        This table MUST NOT contain dynamic Firewall rules associated with {{enum|Stateful|##.Type}} Firewall sessions.

        All entries are created by the creator of the parent {{object|#}}, as indicated by its {{param|#.Creator}} parameter.  {{object}} entries in a {{object|#}} with a {{param|#.Creator}} of {{enum|Defaults|#.Creator}}, {{enum|ACS|#.Creator}}, {{enum|UserInterface|#.Creator}} or (maybe) {{enum|Other|#.Creator}} are referred to as ''Static'' {{object}}s.  Whether or not a {{object}} in a {{object|#}} with {{param|#.Creator}} {{enum|Other|#.Creator}} is regarded as ''Static'' is a local matter to the CPE.  Some of this object's parameter descriptions refer to whether a {{object}} is ''Static'' when specifying whether or not the parameter value can be modified.

        For enabled table entries, if {{param|SourceInterface}} is not a valid reference and {{param|SourceAllInterfaces}} is {{false}}, or if {{param|DestInterface}} is not a valid reference and {{param|DestAllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.Firewall.Chain.{i}.Rule.{i}.")
@XmlRootElement(name = "Device.Firewall.Chain.Rule")
@XmlType(name = "Device.Firewall.Chain.Rule")
@XmlAccessorType(XmlAccessType.FIELD)
public class Rule {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this {{object}} entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * Position of the {{object}} entry in the order of precedence. A value of ''1'' indicates the first entry considered (highest precedence). For each packet, the highest ordered entry that matches the rule criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
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
	 * Action to perform for traffic matching this {{object}} entry. {{enum}}

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Target")
	@CWMPParameter(access = "readWrite")
	public String target = "Drop";
	/**
	 * Specifies the chain to process when {{param|Target}} equals {{enum|TargetChain|Target}}.  If there are no matching rules in the referenced chain, processing continues with the next rule in this chain (if any).  In other words, {{enum|TargetChain|Target}} behaves like a subroutine call.

          {{empty}} indicates no {{param}} is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "TargetChain")
	@CWMPParameter(access = "readWrite")
	public String targetChain;
	/**
	 * Enable or disable logging, in a {{object|###.DeviceInfo.VendorLogFile}}, of packets matching this {{object}}.

          If the {{object}} is not ''Static'' (as explained in the object description), whether changes to this parameter persist across re-boot is a local matter to the CPE.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Log")
	@CWMPParameter(access = "readWrite")
	public Boolean log = false;
	/**
	 * Date and time when this {{object}} entry was created.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "CreationDate")
	public LocalDateTime creationDate;
	/**
	 * The time at which this {{object}} entry will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          The only value that MUST be supported is 9999-12-31T23:59:59Z (i.e. support for rules that expire is OPTIONAL).

          When a rule expires, the CPE MUST automatically terminate that rule and MUST automatically delete the corresponding {{object}} table entry.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ExpiryDate")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime expiryDate = LocalDateTime.parse("9999-12-31T23:59:59Z");;
	/**
	 * {{object}} criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceInterface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sourceInterface;
	/**
	 * If {{false}}, the rule matches only those packets that match the {{param|SourceInterface}} entry, if specified. 

          If {{true}}, the rule matches all packets except those that match the {{param|SourceInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceInterfaceExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceInterfaceExclude = false;
	/**
	 * {{object}} criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the values of {{param|SourceInterface}} and {{param|SourceInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceAllInterfaces")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceAllInterfaces = false;
	/**
	 * {{object}} criterion. {{reference}}  

          This specifies the egress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestInterface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destInterface;
	/**
	 * If {{false}}, the rule matches only those packets that match the {{param|DestInterface}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestInterfaceExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destInterfaceExclude = false;
	/**
	 * {{object}} criterion. This specifies that all egress interfaces are associated with the entry. If {{true}}, the values of {{param|DestInterface}} and {{param|DestInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestAllInterfaces")
	@CWMPParameter(access = "readWrite")
	public Boolean destAllInterfaces = false;
	/**
	 * {{object}} criterion.

          IP Protocol Version (e.g. 4 for IPv4 and 6 for IPv6). A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPVersion")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 15)
	public Integer ipversion = -1;
	/**
	 * {{object}} criterion.

          Destination IP address. {{empty}} indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated address.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIP;
	/**
	 * Destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestMask")
	@CWMPParameter(access = "readWrite")
	public IPPrefix destMask;
	/**
	 * If {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destIPExclude = false;
	/**
	 * {{object}} criterion.

          Source IP address. {{empty}} indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIP;
	/**
	 * Source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceMask")
	@CWMPParameter(access = "readWrite")
	public IPPrefix sourceMask;
	/**
	 * If {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceIPExclude = false;
	/**
	 * {{object}} criterion.

          Protocol number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 255)
	public Integer protocol = -1;
	/**
	 * If {{false}}, the rule matches only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|Protocol}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ProtocolExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean protocolExclude = false;
	/**
	 * {{object}} criterion.

          Destination port number. A value of -1 indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer destPort = -1;
	/**
	 * {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestPortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer destPortRangeMax = -1;
	/**
	 * If {{false}}, the rule matches only those packets that match the {{param|DestPort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestPort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestPortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destPortExclude = false;
	/**
	 * {{object}} criterion.

          Source port number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourcePort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer sourcePort = -1;
	/**
	 * {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no port range is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourcePortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer sourcePortRangeMax = -1;
	/**
	 * If {{false}}, the rule matches only those packets that match the {{param|SourcePort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|SourcePort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourcePortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourcePortExclude = false;
	/**
	 * {{object}} criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid match.

          A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 63)
	public Integer dscP = -1;
	/**
	 * If {{false}}, the rule matches only those packets that match the {{param|DSCP}} entry, if specified.

          If {{true}}, the rule matchess all packets except those that match the {{param|DSCP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DSCPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean dscPExclude = false;

	public Rule() {
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
	public Rule withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this {{object}} entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this {{object}} entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this {{object}} entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public Rule withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence. A value of ''1'' indicates the first entry considered (highest precedence). For each packet, the highest ordered entry that matches the rule criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence. A value of ''1'' indicates the first entry considered (highest precedence). For each packet, the highest ordered entry that matches the rule criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.2
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence. A value of ''1'' indicates the first entry considered (highest precedence). For each packet, the highest ordered entry that matches the rule criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.2
	 * @param order the input value
	 * @return this instance
	 */
	public Rule withOrder(Long order) {
		this.order = order;
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
	public Rule withAlias(Alias alias) {
		this.alias = alias;
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
	public Rule withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get action to perform for traffic matching this {{object}} entry. {{enum}}

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Set action to perform for traffic matching this {{object}} entry. {{enum}}

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param target the input value
	 */
	public void  setTarget(String target) {
		this.target = target;
	}

	/**
	 * Set action to perform for traffic matching this {{object}} entry. {{enum}}

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param target the input value
	 * @return this instance
	 */
	public Rule withTarget(String target) {
		this.target = target;
		return this;
	}

	/**
	 * Get the specifies the chain to process when {{param|Target}} equals {{enum|TargetChain|Target}}.  If there are no matching rules in the referenced chain, processing continues with the next rule in this chain (if any).  In other words, {{enum|TargetChain|Target}} behaves like a subroutine call.

          {{empty}} indicates no {{param}} is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getTargetChain() {
		return targetChain;
	}

	/**
	 * Set the specifies the chain to process when {{param|Target}} equals {{enum|TargetChain|Target}}.  If there are no matching rules in the referenced chain, processing continues with the next rule in this chain (if any).  In other words, {{enum|TargetChain|Target}} behaves like a subroutine call.

          {{empty}} indicates no {{param}} is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param targetChain the input value
	 */
	public void  setTargetChain(String targetChain) {
		this.targetChain = targetChain;
	}

	/**
	 * Set the specifies the chain to process when {{param|Target}} equals {{enum|TargetChain|Target}}.  If there are no matching rules in the referenced chain, processing continues with the next rule in this chain (if any).  In other words, {{enum|TargetChain|Target}} behaves like a subroutine call.

          {{empty}} indicates no {{param}} is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param targetChain the input value
	 * @return this instance
	 */
	public Rule withTargetChain(String targetChain) {
		this.targetChain = targetChain;
		return this;
	}

	/**
	 * Get the enable or disable logging, in a {{object|###.DeviceInfo.VendorLogFile}}, of packets matching this {{object}}.

          If the {{object}} is not ''Static'' (as explained in the object description), whether changes to this parameter persist across re-boot is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isLog() {
		return log;
	}

	/**
	 * Set the enable or disable logging, in a {{object|###.DeviceInfo.VendorLogFile}}, of packets matching this {{object}}.

          If the {{object}} is not ''Static'' (as explained in the object description), whether changes to this parameter persist across re-boot is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @param log the input value
	 */
	public void  setLog(Boolean log) {
		this.log = log;
	}

	/**
	 * Set the enable or disable logging, in a {{object|###.DeviceInfo.VendorLogFile}}, of packets matching this {{object}}.

          If the {{object}} is not ''Static'' (as explained in the object description), whether changes to this parameter persist across re-boot is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @param log the input value
	 * @return this instance
	 */
	public Rule withLog(Boolean log) {
		this.log = log;
		return this;
	}

	/**
	 * Get the date and time when this {{object}} entry was created.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	/**
	 * Set the date and time when this {{object}} entry was created.
	 *
	 * @since 2.2
	 * @param creationDate the input value
	 */
	public void  setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Set the date and time when this {{object}} entry was created.
	 *
	 * @since 2.2
	 * @param creationDate the input value
	 * @return this instance
	 */
	public Rule withCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * Get the time at which this {{object}} entry will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          The only value that MUST be supported is 9999-12-31T23:59:59Z (i.e. support for rules that expire is OPTIONAL).

          When a rule expires, the CPE MUST automatically terminate that rule and MUST automatically delete the corresponding {{object}} table entry.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Set the time at which this {{object}} entry will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          The only value that MUST be supported is 9999-12-31T23:59:59Z (i.e. support for rules that expire is OPTIONAL).

          When a rule expires, the CPE MUST automatically terminate that rule and MUST automatically delete the corresponding {{object}} table entry.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param expiryDate the input value
	 */
	public void  setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * Set the time at which this {{object}} entry will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          The only value that MUST be supported is 9999-12-31T23:59:59Z (i.e. support for rules that expire is OPTIONAL).

          When a rule expires, the CPE MUST automatically terminate that rule and MUST automatically delete the corresponding {{object}} table entry.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param expiryDate the input value
	 * @return this instance
	 */
	public Rule withExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	/**
	 * Get the {{object}} criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getSourceInterface() {
		return sourceInterface;
	}

	/**
	 * Set the {{object}} criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceInterface the input value
	 */
	public void  setSourceInterface(String sourceInterface) {
		this.sourceInterface = sourceInterface;
	}

	/**
	 * Set the {{object}} criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceInterface the input value
	 * @return this instance
	 */
	public Rule withSourceInterface(String sourceInterface) {
		this.sourceInterface = sourceInterface;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the {{param|SourceInterface}} entry, if specified. 

          If {{true}}, the rule matches all packets except those that match the {{param|SourceInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isSourceInterfaceExclude() {
		return sourceInterfaceExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|SourceInterface}} entry, if specified. 

          If {{true}}, the rule matches all packets except those that match the {{param|SourceInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceInterfaceExclude the input value
	 */
	public void  setSourceInterfaceExclude(Boolean sourceInterfaceExclude) {
		this.sourceInterfaceExclude = sourceInterfaceExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|SourceInterface}} entry, if specified. 

          If {{true}}, the rule matches all packets except those that match the {{param|SourceInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceInterfaceExclude the input value
	 * @return this instance
	 */
	public Rule withSourceInterfaceExclude(Boolean sourceInterfaceExclude) {
		this.sourceInterfaceExclude = sourceInterfaceExclude;
		return this;
	}

	/**
	 * Get the {{object}} criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the values of {{param|SourceInterface}} and {{param|SourceInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isSourceAllInterfaces() {
		return sourceAllInterfaces;
	}

	/**
	 * Set the {{object}} criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the values of {{param|SourceInterface}} and {{param|SourceInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceAllInterfaces the input value
	 */
	public void  setSourceAllInterfaces(Boolean sourceAllInterfaces) {
		this.sourceAllInterfaces = sourceAllInterfaces;
	}

	/**
	 * Set the {{object}} criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the values of {{param|SourceInterface}} and {{param|SourceInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceAllInterfaces the input value
	 * @return this instance
	 */
	public Rule withSourceAllInterfaces(Boolean sourceAllInterfaces) {
		this.sourceAllInterfaces = sourceAllInterfaces;
		return this;
	}

	/**
	 * Get the {{object}} criterion. {{reference}}  

          This specifies the egress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getDestInterface() {
		return destInterface;
	}

	/**
	 * Set the {{object}} criterion. {{reference}}  

          This specifies the egress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destInterface the input value
	 */
	public void  setDestInterface(String destInterface) {
		this.destInterface = destInterface;
	}

	/**
	 * Set the {{object}} criterion. {{reference}}  

          This specifies the egress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which Rules can be instantiated is a local matter to the CPE.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destInterface the input value
	 * @return this instance
	 */
	public Rule withDestInterface(String destInterface) {
		this.destInterface = destInterface;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the {{param|DestInterface}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isDestInterfaceExclude() {
		return destInterfaceExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|DestInterface}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destInterfaceExclude the input value
	 */
	public void  setDestInterfaceExclude(Boolean destInterfaceExclude) {
		this.destInterfaceExclude = destInterfaceExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|DestInterface}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestInterface}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destInterfaceExclude the input value
	 * @return this instance
	 */
	public Rule withDestInterfaceExclude(Boolean destInterfaceExclude) {
		this.destInterfaceExclude = destInterfaceExclude;
		return this;
	}

	/**
	 * Get the {{object}} criterion. This specifies that all egress interfaces are associated with the entry. If {{true}}, the values of {{param|DestInterface}} and {{param|DestInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isDestAllInterfaces() {
		return destAllInterfaces;
	}

	/**
	 * Set the {{object}} criterion. This specifies that all egress interfaces are associated with the entry. If {{true}}, the values of {{param|DestInterface}} and {{param|DestInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destAllInterfaces the input value
	 */
	public void  setDestAllInterfaces(Boolean destAllInterfaces) {
		this.destAllInterfaces = destAllInterfaces;
	}

	/**
	 * Set the {{object}} criterion. This specifies that all egress interfaces are associated with the entry. If {{true}}, the values of {{param|DestInterface}} and {{param|DestInterfaceExclude}} are ignored since all ingress interfaces are indicated.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destAllInterfaces the input value
	 * @return this instance
	 */
	public Rule withDestAllInterfaces(Boolean destAllInterfaces) {
		this.destAllInterfaces = destAllInterfaces;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          IP Protocol Version (e.g. 4 for IPv4 and 6 for IPv6). A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getIpversion() {
		return ipversion;
	}

	/**
	 * Set the {{object}} criterion.

          IP Protocol Version (e.g. 4 for IPv4 and 6 for IPv6). A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param ipversion the input value
	 */
	public void  setIpversion(Integer ipversion) {
		this.ipversion = ipversion;
	}

	/**
	 * Set the {{object}} criterion.

          IP Protocol Version (e.g. 4 for IPv4 and 6 for IPv6). A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param ipversion the input value
	 * @return this instance
	 */
	public Rule withIpversion(Integer ipversion) {
		this.ipversion = ipversion;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          Destination IP address. {{empty}} indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated address.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPAddress getDestIP() {
		return destIP;
	}

	/**
	 * Set the {{object}} criterion.

          Destination IP address. {{empty}} indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated address.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destIP the input value
	 */
	public void  setDestIP(IPAddress destIP) {
		this.destIP = destIP;
	}

	/**
	 * Set the {{object}} criterion.

          Destination IP address. {{empty}} indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated address.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destIP the input value
	 * @return this instance
	 */
	public Rule withDestIP(IPAddress destIP) {
		this.destIP = destIP;
		return this;
	}

	/**
	 * Get the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPPrefix getDestMask() {
		return destMask;
	}

	/**
	 * Set the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 * @param destMask the input value
	 */
	public void  setDestMask(IPPrefix destMask) {
		this.destMask = destMask;
	}

	/**
	 * Set the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 * @param destMask the input value
	 * @return this instance
	 */
	public Rule withDestMask(IPPrefix destMask) {
		this.destMask = destMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isDestIPExclude() {
		return destIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destIPExclude the input value
	 */
	public void  setDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destIPExclude the input value
	 * @return this instance
	 */
	public Rule withDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          Source IP address. {{empty}} indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPAddress getSourceIP() {
		return sourceIP;
	}

	/**
	 * Set the {{object}} criterion.

          Source IP address. {{empty}} indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceIP the input value
	 */
	public void  setSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
	}

	/**
	 * Set the {{object}} criterion.

          Source IP address. {{empty}} indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceIP the input value
	 * @return this instance
	 */
	public Rule withSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
		return this;
	}

	/**
	 * Get the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPPrefix getSourceMask() {
		return sourceMask;
	}

	/**
	 * Set the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 * @param sourceMask the input value
	 */
	public void  setSourceMask(IPPrefix sourceMask) {
		this.sourceMask = sourceMask;
	}

	/**
	 * Set the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.2
	 * @param sourceMask the input value
	 * @return this instance
	 */
	public Rule withSourceMask(IPPrefix sourceMask) {
		this.sourceMask = sourceMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isSourceIPExclude() {
		return sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceIPExclude the input value
	 */
	public void  setSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourceIPExclude the input value
	 * @return this instance
	 */
	public Rule withSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          Protocol number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * Set the {{object}} criterion.

          Protocol number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param protocol the input value
	 */
	public void  setProtocol(Integer protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the {{object}} criterion.

          Protocol number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param protocol the input value
	 * @return this instance
	 */
	public Rule withProtocol(Integer protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|Protocol}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isProtocolExclude() {
		return protocolExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|Protocol}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param protocolExclude the input value
	 */
	public void  setProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|Protocol}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param protocolExclude the input value
	 * @return this instance
	 */
	public Rule withProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          Destination port number. A value of -1 indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getDestPort() {
		return destPort;
	}

	/**
	 * Set the {{object}} criterion.

          Destination port number. A value of -1 indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destPort the input value
	 */
	public void  setDestPort(Integer destPort) {
		this.destPort = destPort;
	}

	/**
	 * Set the {{object}} criterion.

          Destination port number. A value of -1 indicates this criterion is not used for matching.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destPort the input value
	 * @return this instance
	 */
	public Rule withDestPort(Integer destPort) {
		this.destPort = destPort;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getDestPortRangeMax() {
		return destPortRangeMax;
	}

	/**
	 * Set the {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destPortRangeMax the input value
	 */
	public void  setDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
	}

	/**
	 * Set the {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.

          Note that Firewall rules are applied after any {{object|###.NAT}} processing, so if NAT is enabled on the source interface this is always the translated port number.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destPortRangeMax the input value
	 * @return this instance
	 */
	public Rule withDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the {{param|DestPort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestPort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isDestPortExclude() {
		return destPortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|DestPort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestPort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destPortExclude the input value
	 */
	public void  setDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|DestPort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|DestPort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param destPortExclude the input value
	 * @return this instance
	 */
	public Rule withDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          Source port number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getSourcePort() {
		return sourcePort;
	}

	/**
	 * Set the {{object}} criterion.

          Source port number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourcePort the input value
	 */
	public void  setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
	}

	/**
	 * Set the {{object}} criterion.

          Source port number. A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourcePort the input value
	 * @return this instance
	 */
	public Rule withSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no port range is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getSourcePortRangeMax() {
		return sourcePortRangeMax;
	}

	/**
	 * Set the {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no port range is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourcePortRangeMax the input value
	 */
	public void  setSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
	}

	/**
	 * Set the {{object}} criterion.

          If specified, indicates the {{object}} criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive). If specified, {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no port range is specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourcePortRangeMax the input value
	 * @return this instance
	 */
	public Rule withSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the {{param|SourcePort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|SourcePort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isSourcePortExclude() {
		return sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|SourcePort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|SourcePort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourcePortExclude the input value
	 */
	public void  setSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|SourcePort}} entry (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match the {{param|SourcePort}} entry (or port range), if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param sourcePortExclude the input value
	 * @return this instance
	 */
	public Rule withSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
		return this;
	}

	/**
	 * Get the {{object}} criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid match.

          A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getDscP() {
		return dscP;
	}

	/**
	 * Set the {{object}} criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid match.

          A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param dscP the input value
	 */
	public void  setDscP(Integer dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the {{object}} criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid match.

          A value of -1 indicates this criterion is not used for matching.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param dscP the input value
	 * @return this instance
	 */
	public Rule withDscP(Integer dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the {{param|DSCP}} entry, if specified.

          If {{true}}, the rule matchess all packets except those that match the {{param|DSCP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isDscPExclude() {
		return dscPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|DSCP}} entry, if specified.

          If {{true}}, the rule matchess all packets except those that match the {{param|DSCP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param dscPExclude the input value
	 */
	public void  setDscPExclude(Boolean dscPExclude) {
		this.dscPExclude = dscPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the {{param|DSCP}} entry, if specified.

          If {{true}}, the rule matchess all packets except those that match the {{param|DSCP}} entry, if specified.

          This parameter can only be modified if the {{object}} is ''Static'' (as explained in the object description).
	 *
	 * @since 2.2
	 * @param dscPExclude the input value
	 * @return this instance
	 */
	public Rule withDscPExclude(Boolean dscPExclude) {
		this.dscPExclude = dscPExclude;
		return this;
	}

	//</editor-fold>

}