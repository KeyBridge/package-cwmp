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
package org.broadbandforum.tr181.device.ipsec;

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

	/**
	 * Filter table that represents the IPsec Security Policy Database (SPD) {{bibref|RFC4301|Section 4.4.1}} selection criteria.  Each (ordered) entry defines a set of selection criteria and references a {{object|#.Profile}} table entry that specifies how matching packets will be processed.

        SPD filtering is performed for all packets that might need to cross the IPsec boundary {{bibref|RFC4301|Section 3.1}}.  Given that IPsec operates at the IP level, this means that SPD filtering conceptually occurs after bridging and before routing.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.Filter.{i}.")
@XmlRootElement(name = "Device.IPsec.Filter")
@XmlType(name = "Device.IPsec.Filter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Filter {

	/**
	 * Enables or disables this IPsec Filter table entry.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this IPsec Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * Position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * SPD selection criterion. {{reference}}

          This specifies the ingress interface associated with the entry.  It MAY be a layer 1, 2 or 3 interface.  However, the types of interfaces for which filters can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * SPD selection criterion.

          This specifies that all ingress interfaces are associated with the entry.  If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "AllInterfaces")
	@CWMPParameter(access = "readWrite")
	public Boolean allInterfaces = false;
	/**
	 * SPD selection criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DestIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIP;
	/**
	 * SPD selection criterion.

          Destination IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|DestIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|DestIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DestMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress destMask;
	/**
	 * If {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DestIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destIPExclude = false;
	/**
	 * SPD selection criterion.

          Source IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SourceIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIP;
	/**
	 * SPD selection criterion.

          Source IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|SourceIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|SourceIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SourceMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceMask;
	/**
	 * If {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SourceIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceIPExclude = false;
	/**
	 * SPD selection criterion.

          Protocol number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          Note that {{bibref|RFC4301}} refers to this as the ''Next Layer Protocol''.  It is obtained from the IPv4 ''Protocol'' or the IPv6 ''Next Header'' fields.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 255)
	public Integer protocol = -1;
	/**
	 * If {{false}}, the rule matches only those packets that match {{param|Protocol}}, if specified.

          If {{true}}, the rule matches all packets except those that match {{param|Protocol}}, if specified.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ProtocolExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean protocolExclude = false;
	/**
	 * SPD selection criterion.

          Destination port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DestPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer destPort = -1;
	/**
	 * SPD selection criterion.

          If specified, indicates a destination port address range from {{param|DestPort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no destination port range is specified.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DestPortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer destPortRangeMax = -1;
	/**
	 * If {{false}}, the rule matches only those packets that match {{param|DestPort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|DestPort}} (or port range), if specified.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "DestPortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destPortExclude = false;
	/**
	 * SPD selection criterion.

          Source port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SourcePort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer sourcePort = -1;
	/**
	 * SPD selection criterion.

          If specified, indicates a source port address range from {{param|SourcePort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no source port range is specified.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SourcePortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer sourcePortRangeMax = -1;
	/**
	 * If {{false}}, the rule matches only those packets that match {{param|SourcePort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|SourcePort}} (or port range), if specified.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SourcePortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourcePortExclude = false;
	/**
	 * Indicates how packets that match this rule will be processed {{bibref|RFC4301|Section 4.4.1}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ProcessingChoice")
	@CWMPParameter(access = "readWrite")
	public String processingChoice = "Bypass";
	/**
	 * The profile that defines the IPsec treatment for matching packets.  {{reference}}

          If {{param|ProcessingChoice}} is {{enum|Protect|ProcessingChoice}}, {{param}} MUST NOT be {{empty}}.  In this case, if it ever becomes {{empty}}, e.g. because the referenced profile is deleted, this IPsec Filter table entry is invalid and {{param|Status}} MUST be set to {{enum|Error_Misconfigured|Status}}.

          If {{param|ProcessingChoice}} is not {{enum|Protect|ProcessingChoice}}, {{param}} is ignored.

          Any changes to the referenced profile will have an immediate effect on any established IPsec tunnels.  Such changes will often force IKEv2 sessions and child SAs to be re-established.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Profile")
	@CWMPParameter(access = "readWrite")
	public String profile;

	public Filter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this IPsec Filter table entry.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this IPsec Filter table entry.
	 *
	 * @since 2.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this IPsec Filter table entry.
	 *
	 * @since 2.5
	 * @param enable the input value
	 * @return this instance
	 */
	public Filter withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this IPsec Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this IPsec Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this IPsec Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.5
	 * @param status the input value
	 * @return this instance
	 */
	public Filter withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.5
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the filter criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.5
	 * @param order the input value
	 * @return this instance
	 */
	public Filter withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 * @return this instance
	 */
	public Filter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the spd selection criterion. {{reference}}

          This specifies the ingress interface associated with the entry.  It MAY be a layer 1, 2 or 3 interface.  However, the types of interfaces for which filters can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the spd selection criterion. {{reference}}

          This specifies the ingress interface associated with the entry.  It MAY be a layer 1, 2 or 3 interface.  However, the types of interfaces for which filters can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.5
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the spd selection criterion. {{reference}}

          This specifies the ingress interface associated with the entry.  It MAY be a layer 1, 2 or 3 interface.  However, the types of interfaces for which filters can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.5
	 * @param _interface the input value
	 * @return this instance
	 */
	public Filter with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          This specifies that all ingress interfaces are associated with the entry.  If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isAllInterfaces() {
		return allInterfaces;
	}

	/**
	 * Set the spd selection criterion.

          This specifies that all ingress interfaces are associated with the entry.  If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.5
	 * @param allInterfaces the input value
	 */
	public void  setAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
	}

	/**
	 * Set the spd selection criterion.

          This specifies that all ingress interfaces are associated with the entry.  If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.5
	 * @param allInterfaces the input value
	 * @return this instance
	 */
	public Filter withAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getDestIP() {
		return destIP;
	}

	/**
	 * Set the spd selection criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 * @param destIP the input value
	 */
	public void  setDestIP(IPAddress destIP) {
		this.destIP = destIP;
	}

	/**
	 * Set the spd selection criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 * @param destIP the input value
	 * @return this instance
	 */
	public Filter withDestIP(IPAddress destIP) {
		this.destIP = destIP;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          Destination IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|DestIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|DestIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getDestMask() {
		return destMask;
	}

	/**
	 * Set the spd selection criterion.

          Destination IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|DestIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|DestIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 * @param destMask the input value
	 */
	public void  setDestMask(IPAddress destMask) {
		this.destMask = destMask;
	}

	/**
	 * Set the spd selection criterion.

          Destination IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|DestIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|DestIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 * @param destMask the input value
	 * @return this instance
	 */
	public Filter withDestMask(IPAddress destMask) {
		this.destMask = destMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isDestIPExclude() {
		return destIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.
	 *
	 * @since 2.5
	 * @param destIPExclude the input value
	 */
	public void  setDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|DestIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|DestIP}} entry, if specified.
	 *
	 * @since 2.5
	 * @param destIPExclude the input value
	 * @return this instance
	 */
	public Filter withDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          Source IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getSourceIP() {
		return sourceIP;
	}

	/**
	 * Set the spd selection criterion.

          Source IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 * @param sourceIP the input value
	 */
	public void  setSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
	}

	/**
	 * Set the spd selection criterion.

          Source IP address.  {{empty}} indicates this criterion is not used, i.e. is ''ANY''.
	 *
	 * @since 2.5
	 * @param sourceIP the input value
	 * @return this instance
	 */
	public Filter withSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          Source IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|SourceIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|SourceIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getSourceMask() {
		return sourceMask;
	}

	/**
	 * Set the spd selection criterion.

          Source IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|SourceIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|SourceIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 * @param sourceMask the input value
	 */
	public void  setSourceMask(IPAddress sourceMask) {
		this.sourceMask = sourceMask;
	}

	/**
	 * Set the spd selection criterion.

          Source IP address mask.  If not {{empty}}, only the indicated network portion of the {{param|SourceIP}} address is to be used for selection.  {{empty}} indicates that the full {{param|SourceIP}} address is to be used for selection.
	 *
	 * @since 2.5
	 * @param sourceMask the input value
	 * @return this instance
	 */
	public Filter withSourceMask(IPAddress sourceMask) {
		this.sourceMask = sourceMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isSourceIPExclude() {
		return sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.5
	 * @param sourceIPExclude the input value
	 */
	public void  setSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match the (masked) {{param|SourceIP}} entry, if specified.

          If {{true}}, the rule matches all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.5
	 * @param sourceIPExclude the input value
	 * @return this instance
	 */
	public Filter withSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          Protocol number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          Note that {{bibref|RFC4301}} refers to this as the ''Next Layer Protocol''.  It is obtained from the IPv4 ''Protocol'' or the IPv6 ''Next Header'' fields.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * Set the spd selection criterion.

          Protocol number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          Note that {{bibref|RFC4301}} refers to this as the ''Next Layer Protocol''.  It is obtained from the IPv4 ''Protocol'' or the IPv6 ''Next Header'' fields.
	 *
	 * @since 2.5
	 * @param protocol the input value
	 */
	public void  setProtocol(Integer protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the spd selection criterion.

          Protocol number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          Note that {{bibref|RFC4301}} refers to this as the ''Next Layer Protocol''.  It is obtained from the IPv4 ''Protocol'' or the IPv6 ''Next Header'' fields.
	 *
	 * @since 2.5
	 * @param protocol the input value
	 * @return this instance
	 */
	public Filter withProtocol(Integer protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match {{param|Protocol}}, if specified.

          If {{true}}, the rule matches all packets except those that match {{param|Protocol}}, if specified.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isProtocolExclude() {
		return protocolExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match {{param|Protocol}}, if specified.

          If {{true}}, the rule matches all packets except those that match {{param|Protocol}}, if specified.
	 *
	 * @since 2.5
	 * @param protocolExclude the input value
	 */
	public void  setProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match {{param|Protocol}}, if specified.

          If {{true}}, the rule matches all packets except those that match {{param|Protocol}}, if specified.
	 *
	 * @since 2.5
	 * @param protocolExclude the input value
	 * @return this instance
	 */
	public Filter withProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          Destination port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Integer getDestPort() {
		return destPort;
	}

	/**
	 * Set the spd selection criterion.

          Destination port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 * @param destPort the input value
	 */
	public void  setDestPort(Integer destPort) {
		this.destPort = destPort;
	}

	/**
	 * Set the spd selection criterion.

          Destination port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 * @param destPort the input value
	 * @return this instance
	 */
	public Filter withDestPort(Integer destPort) {
		this.destPort = destPort;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          If specified, indicates a destination port address range from {{param|DestPort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no destination port range is specified.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Integer getDestPortRangeMax() {
		return destPortRangeMax;
	}

	/**
	 * Set the spd selection criterion.

          If specified, indicates a destination port address range from {{param|DestPort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no destination port range is specified.
	 *
	 * @since 2.5
	 * @param destPortRangeMax the input value
	 */
	public void  setDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
	}

	/**
	 * Set the spd selection criterion.

          If specified, indicates a destination port address range from {{param|DestPort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no destination port range is specified.
	 *
	 * @since 2.5
	 * @param destPortRangeMax the input value
	 * @return this instance
	 */
	public Filter withDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match {{param|DestPort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|DestPort}} (or port range), if specified.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isDestPortExclude() {
		return destPortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match {{param|DestPort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|DestPort}} (or port range), if specified.
	 *
	 * @since 2.5
	 * @param destPortExclude the input value
	 */
	public void  setDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match {{param|DestPort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|DestPort}} (or port range), if specified.
	 *
	 * @since 2.5
	 * @param destPortExclude the input value
	 * @return this instance
	 */
	public Filter withDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          Source port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Integer getSourcePort() {
		return sourcePort;
	}

	/**
	 * Set the spd selection criterion.

          Source port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 * @param sourcePort the input value
	 */
	public void  setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
	}

	/**
	 * Set the spd selection criterion.

          Source port number.  A value of -1 indicates this criterion is not used, i.e. is ''ANY''.

          The value of this parameter is ignored for protocols that do not use ports, e.g. ICMP (1).
	 *
	 * @since 2.5
	 * @param sourcePort the input value
	 * @return this instance
	 */
	public Filter withSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		return this;
	}

	/**
	 * Get the spd selection criterion.

          If specified, indicates a source port address range from {{param|SourcePort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no source port range is specified.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Integer getSourcePortRangeMax() {
		return sourcePortRangeMax;
	}

	/**
	 * Set the spd selection criterion.

          If specified, indicates a source port address range from {{param|SourcePort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no source port range is specified.
	 *
	 * @since 2.5
	 * @param sourcePortRangeMax the input value
	 */
	public void  setSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
	}

	/**
	 * Set the spd selection criterion.

          If specified, indicates a source port address range from {{param|SourcePort}} through {{param}} (inclusive), in which case {{param}} MUST be greater than or equal to {{param|SourcePort}}.

          A value of -1 indicates that no source port range is specified.
	 *
	 * @since 2.5
	 * @param sourcePortRangeMax the input value
	 * @return this instance
	 */
	public Filter withSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the rule matches only those packets that match {{param|SourcePort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|SourcePort}} (or port range), if specified.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isSourcePortExclude() {
		return sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match {{param|SourcePort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|SourcePort}} (or port range), if specified.
	 *
	 * @since 2.5
	 * @param sourcePortExclude the input value
	 */
	public void  setSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the rule matches only those packets that match {{param|SourcePort}} (or port range), if specified.

          If {{true}}, the rule matches all packets except those that match {{param|SourcePort}} (or port range), if specified.
	 *
	 * @since 2.5
	 * @param sourcePortExclude the input value
	 * @return this instance
	 */
	public Filter withSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
		return this;
	}

	/**
	 * Get the indicates how packets that match this rule will be processed {{bibref|RFC4301|Section 4.4.1}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getProcessingChoice() {
		return processingChoice;
	}

	/**
	 * Set the indicates how packets that match this rule will be processed {{bibref|RFC4301|Section 4.4.1}}.
	 *
	 * @since 2.5
	 * @param processingChoice the input value
	 */
	public void  setProcessingChoice(String processingChoice) {
		this.processingChoice = processingChoice;
	}

	/**
	 * Set the indicates how packets that match this rule will be processed {{bibref|RFC4301|Section 4.4.1}}.
	 *
	 * @since 2.5
	 * @param processingChoice the input value
	 * @return this instance
	 */
	public Filter withProcessingChoice(String processingChoice) {
		this.processingChoice = processingChoice;
		return this;
	}

	/**
	 * Get the profile that defines the IPsec treatment for matching packets.  {{reference}}

          If {{param|ProcessingChoice}} is {{enum|Protect|ProcessingChoice}}, {{param}} MUST NOT be {{empty}}.  In this case, if it ever becomes {{empty}}, e.g. because the referenced profile is deleted, this IPsec Filter table entry is invalid and {{param|Status}} MUST be set to {{enum|Error_Misconfigured|Status}}.

          If {{param|ProcessingChoice}} is not {{enum|Protect|ProcessingChoice}}, {{param}} is ignored.

          Any changes to the referenced profile will have an immediate effect on any established IPsec tunnels.  Such changes will often force IKEv2 sessions and child SAs to be re-established.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * Set the profile that defines the IPsec treatment for matching packets.  {{reference}}

          If {{param|ProcessingChoice}} is {{enum|Protect|ProcessingChoice}}, {{param}} MUST NOT be {{empty}}.  In this case, if it ever becomes {{empty}}, e.g. because the referenced profile is deleted, this IPsec Filter table entry is invalid and {{param|Status}} MUST be set to {{enum|Error_Misconfigured|Status}}.

          If {{param|ProcessingChoice}} is not {{enum|Protect|ProcessingChoice}}, {{param}} is ignored.

          Any changes to the referenced profile will have an immediate effect on any established IPsec tunnels.  Such changes will often force IKEv2 sessions and child SAs to be re-established.
	 *
	 * @since 2.5
	 * @param profile the input value
	 */
	public void  setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * Set the profile that defines the IPsec treatment for matching packets.  {{reference}}

          If {{param|ProcessingChoice}} is {{enum|Protect|ProcessingChoice}}, {{param}} MUST NOT be {{empty}}.  In this case, if it ever becomes {{empty}}, e.g. because the referenced profile is deleted, this IPsec Filter table entry is invalid and {{param|Status}} MUST be set to {{enum|Error_Misconfigured|Status}}.

          If {{param|ProcessingChoice}} is not {{enum|Protect|ProcessingChoice}}, {{param}} is ignored.

          Any changes to the referenced profile will have an immediate effect on any established IPsec tunnels.  Such changes will often force IKEv2 sessions and child SAs to be re-established.
	 *
	 * @since 2.5
	 * @param profile the input value
	 * @return this instance
	 */
	public Filter withProfile(String profile) {
		this.profile = profile;
		return this;
	}

	//</editor-fold>

}