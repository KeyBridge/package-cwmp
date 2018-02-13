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
package org.broadbandforum.tr181.device.map.domain;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv4Prefix;
import org.broadbandforum.tr181.datatypes.IPv6Prefix;

	/**
	 * The MAP domain's Mapping Rules {{bibref|RFC7597}}. The rule with the longest match between its {{param|IPv6Prefix}} and the end-user {{param|#.IPv6Prefix}} is the Basic Mapping Rule (BMR). Any of the rules (including the BMR) can be a Forwarding Mapping Rule.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.MAP.Domain.{i}.Rule.{i}.")
@XmlRootElement(name = "Device.MAP.Domain.Rule")
@XmlType(name = "Device.MAP.Domain.Rule")
@XmlAccessorType(XmlAccessType.FIELD)
public class Rule {

	/**
	 * Enable or disable this {{object}} instance.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this {{object}} instance.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The mechanism via which the {{object}} was created.

          If the CPE supports MAP configuration via both DHCPv6 and CWMP, it is up to the implementation to determine how the two mechanisms will interact.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * The ''Rule IPv6 prefix''.

          The Rule IPv6 prefix is a leading part of the end-user {{param|#.IPv6Prefix}}, i.e. its length MUST be less than or equal to the length of the end-user ''IPv6Prefix'', and it MUST match the end-user ''IPv6Prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv6-prefix'' field.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPv6Prefix")
	@CWMPParameter(access = "readWrite")
	public IPv6Prefix ipv6Prefix;
	/**
	 * The ''Rule IPv4 prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv4-prefix'' field.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPv4Prefix")
	@CWMPParameter(access = "readWrite")
	public IPv4Prefix ipv4Prefix;
	/**
	 * The length in bits of the ''Embedded Address (EA) bits'' in the end-user {{param|#.IPv6Prefix}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ea-len'' field.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "EABitsLength")
	@CWMPParameter(access = "readWrite", units = "bits")
	@Size(min = 0, max = 48)
	public Long eabitsLength = 0L;
	/**
	 * Indicates whether this rule is a ''Forwarding Mapping Rule'' (FMR), i.e. can be used for forwarding.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''flags'' field's ''F-Flag''.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IsFMR")
	@CWMPParameter(access = "readWrite")
	public Boolean isfMR = false;

	public Rule() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this {{object}} instance.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this {{object}} instance.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this {{object}} instance.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Rule withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this {{object}} instance.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this {{object}} instance.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this {{object}} instance.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public Rule withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public Rule withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mechanism via which the {{object}} was created.

          If the CPE supports MAP configuration via both DHCPv6 and CWMP, it is up to the implementation to determine how the two mechanisms will interact.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was created.

          If the CPE supports MAP configuration via both DHCPv6 and CWMP, it is up to the implementation to determine how the two mechanisms will interact.
	 *
	 * @since 2.8
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was created.

          If the CPE supports MAP configuration via both DHCPv6 and CWMP, it is up to the implementation to determine how the two mechanisms will interact.
	 *
	 * @since 2.8
	 * @param origin the input value
	 * @return this instance
	 */
	public Rule withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the ''Rule IPv6 prefix''.

          The Rule IPv6 prefix is a leading part of the end-user {{param|#.IPv6Prefix}}, i.e. its length MUST be less than or equal to the length of the end-user ''IPv6Prefix'', and it MUST match the end-user ''IPv6Prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv6-prefix'' field.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPv6Prefix getIpv6Prefix() {
		return ipv6Prefix;
	}

	/**
	 * Set the ''Rule IPv6 prefix''.

          The Rule IPv6 prefix is a leading part of the end-user {{param|#.IPv6Prefix}}, i.e. its length MUST be less than or equal to the length of the end-user ''IPv6Prefix'', and it MUST match the end-user ''IPv6Prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv6-prefix'' field.
	 *
	 * @since 2.8
	 * @param ipv6Prefix the input value
	 */
	public void  setIpv6Prefix(IPv6Prefix ipv6Prefix) {
		this.ipv6Prefix = ipv6Prefix;
	}

	/**
	 * Set the ''Rule IPv6 prefix''.

          The Rule IPv6 prefix is a leading part of the end-user {{param|#.IPv6Prefix}}, i.e. its length MUST be less than or equal to the length of the end-user ''IPv6Prefix'', and it MUST match the end-user ''IPv6Prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv6-prefix'' field.
	 *
	 * @since 2.8
	 * @param ipv6Prefix the input value
	 * @return this instance
	 */
	public Rule withIpv6Prefix(IPv6Prefix ipv6Prefix) {
		this.ipv6Prefix = ipv6Prefix;
		return this;
	}

	/**
	 * Get the ''Rule IPv4 prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv4-prefix'' field.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPv4Prefix getIpv4Prefix() {
		return ipv4Prefix;
	}

	/**
	 * Set the ''Rule IPv4 prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv4-prefix'' field.
	 *
	 * @since 2.8
	 * @param ipv4Prefix the input value
	 */
	public void  setIpv4Prefix(IPv4Prefix ipv4Prefix) {
		this.ipv4Prefix = ipv4Prefix;
	}

	/**
	 * Set the ''Rule IPv4 prefix''.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ipv4-prefix'' field.
	 *
	 * @since 2.8
	 * @param ipv4Prefix the input value
	 * @return this instance
	 */
	public Rule withIpv4Prefix(IPv4Prefix ipv4Prefix) {
		this.ipv4Prefix = ipv4Prefix;
		return this;
	}

	/**
	 * Get the length in bits of the ''Embedded Address (EA) bits'' in the end-user {{param|#.IPv6Prefix}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ea-len'' field.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getEabitsLength() {
		return eabitsLength;
	}

	/**
	 * Set the length in bits of the ''Embedded Address (EA) bits'' in the end-user {{param|#.IPv6Prefix}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ea-len'' field.
	 *
	 * @since 2.8
	 * @param eabitsLength the input value
	 */
	public void  setEabitsLength(Long eabitsLength) {
		this.eabitsLength = eabitsLength;
	}

	/**
	 * Set the length in bits of the ''Embedded Address (EA) bits'' in the end-user {{param|#.IPv6Prefix}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''ea-len'' field.
	 *
	 * @since 2.8
	 * @param eabitsLength the input value
	 * @return this instance
	 */
	public Rule withEabitsLength(Long eabitsLength) {
		this.eabitsLength = eabitsLength;
		return this;
	}

	/**
	 * Get the indicates whether this rule is a ''Forwarding Mapping Rule'' (FMR), i.e. can be used for forwarding.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''flags'' field's ''F-Flag''.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIsfMR() {
		return isfMR;
	}

	/**
	 * Set the indicates whether this rule is a ''Forwarding Mapping Rule'' (FMR), i.e. can be used for forwarding.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''flags'' field's ''F-Flag''.
	 *
	 * @since 2.8
	 * @param isfMR the input value
	 */
	public void  setIsfMR(Boolean isfMR) {
		this.isfMR = isfMR;
	}

	/**
	 * Set the indicates whether this rule is a ''Forwarding Mapping Rule'' (FMR), i.e. can be used for forwarding.

          Corresponds to the {{bibref|RFC7598}} ''S46_RULE'' option's ''flags'' field's ''F-Flag''.
	 *
	 * @since 2.8
	 * @param isfMR the input value
	 * @return this instance
	 */
	public Rule withIsfMR(Boolean isfMR) {
		this.isfMR = isfMR;
		return this;
	}

	//</editor-fold>

}