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
package org.broadbandforum.tr181.device.map;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv6Prefix;
import org.broadbandforum.tr181.device.map.domain.Interface;
import org.broadbandforum.tr181.device.map.domain.Rule;

	/**
	 * MAP domain settings {{bibref|RFC7597}} {{bibref|RFC7599}}.  Each instance models a MAP domain.

        MAP supports two transport modes, both of which use NAPT44 (modified to use a restricted port range):

        * MAP-E ({{param|TransportMode}} = {{enum|Encapsulation|TransportMode}}) uses an IPv4-in-IPv6 tunnel.

        * MAP-T ({{param|TransportMode}} = {{enum|Translation|TransportMode}}) uses stateless NAT64.

        Note: There is an n:1 relationship between a MAP domain and the associated {{param|WANInterface}}, i.e. in theory multiple MAP domains can be associated with a single WAN IP interface (each domain would have its own ''End-user IPv6 prefix'' and ''MAP IPv6 address'').

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.MAP.Domain.{i}.")
public class Domain {

	/**
	 * Enables or disables the MAP domain.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The current operational state of the MAP domain.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The transport mode to use.

          Corresponds to the {{bibref|RFC7598}} ''S46_CONT_MAPE'' and ''S46_CONT_MAPT'' container options.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "TransportMode")
	@CWMPParameter(access = "readWrite")
	public String transportMode = "Translation";
	/**
	 * The IP interface with which this MAP domain is associated.  This will always be a NAT-ted upstream (WAN) interface.

          The ''End-user IPv6 prefix'' {{param|IPv6Prefix}} is one of this IP interface's prefixes.

          The ''MAP IPv6 address'' is derived from the ''End-user IPv6 prefix'' and is one of this IP interface's IP addresses, with an {{param|##.IP.Interface.{i}.IPv6Address.{i}.Origin}} of {{enum|MAP|##.IP.Interface.{i}.IPv6Address.{i}.Origin}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "WANInterface")
	@CWMPParameter(access = "readWrite")
	public String wanInterface;
	/**
	 * The MAP domain's ''End-user IPv6 prefix''.  This MUST reference one of {{param|WANInterface}}'s prefixes.

          If the ACS configures this prefix directly, the CPE MUST use the ACS-configured prefix.  Otherwise, the CPE MUST select one of {{param|WANInterface}}'s prefixes; the selected prefix will typically have {{param|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} =  {{enum|PrefixDelegation|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPv6Prefix")
	@CWMPParameter(access = "readWrite")
	public String ipv6Prefix;
	/**
	 * The MAP Border Relay (BR) address or prefix.

          * For MAP-E this is the BR address and therefore MUST be a /128 {{bibref|RFC7597}}. Note this address can be an IPv6 anycast address. This address corresponds to the {{bibref|RFC7598}} ''OPTION_S46_BR'' (Border Relay) option.

          * For MAP-T this is the BR prefix {{bibref|RFC7599}}. This address prefix corresponds to the {{bibref|RFC7598}} ''OPTION_S46_DMR'' (Default Mapping Rule) option.

          Note: There will be a corresponding {{object|.Routing.Router.{i}.IPv4Forwarding}} default rule.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "BRIPv6Prefix")
	@CWMPParameter(access = "readWrite")
	public IPv6Prefix briPv6Prefix;
	/**
	 * DSCP with which to mark the outer IP header for traffic that is associated with this MAP domain.

          Downstream packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the incoming packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DSCPMarkPolicy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2, max = 63)
	public Integer dscPMarkPolicy;
	/**
	 * ''Port-set ID'' (PSID) offset in bits.  The number of Port-sets is 2^{{param}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''offset'' field.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PSIDOffset")
	@CWMPParameter(access = "readWrite", units = "bits")
	@Size(min = 0, max = 15)
	public Long psiDOffset = 6L;
	/**
	 * The length in bits of the ''Port-set id'' (PSID) configured in the {{param|PSID}} parameter.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID-len'' field.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PSIDLength")
	@CWMPParameter(access = "readWrite", units = "bits")
	@Size(min = 0, max = 16)
	public Long psiDLength = 0L;
	/**
	 * ''Port-set ID'' (PSID) to use in preference to the value extracted from the ''Embedded Address'' (EA) bits.

          Only the high order {{param|PSIDLength}} bits of the {{param}} value are used, so the parameter is ignored when {{param|PSIDLength}} is zero.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID'' field.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "PSID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long psiD = 0L;
	/**
	 * Whether to include low-numbered (system) ports in the Port-sets. Normally ports in the range [0:2^(16-{{param|PSIDOffset}})-1] are excluded, e.g. for the default {{param|PSIDOffset}} value of 4, ports [0:4095] are not included in the Port-sets.

          This parameter is related to {{bibref|RFC7597}}'s ''N'', which is defined as ''the number of ports (e.g., 1024) excluded from the lower end of the range''.  The parameter is relevant only when {{param|PSIDOffset}} is 0; {{false}} corresponds to ''N=1024'' and {{true}} corresponds to ''N=0''.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IncludeSystemPorts")
	@CWMPParameter(access = "readWrite")
	public Boolean includeSystemPorts = false;
	/**
	 * The MAP domain's Mapping Rules {{bibref|RFC7597}}. The rule with the longest match between its {{param|IPv6Prefix}} and the end-user {{param|#.IPv6Prefix}} is the Basic Mapping Rule (BMR). Any of the rules (including the BMR) can be a Forwarding Mapping Rule.
	 */
	@XmlElementWrapper(name = "Rules")
	@XmlElement(name = "Rule")
	@CWMPParameter(access = "readWrite")
	public Collection<Rule> rules;
	/**
	 * MAP interface (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  This models the LAN side MAP domain interface.
	 */
	@XmlElement(name = "Interface")
	public Interface _interface;

	public Domain() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the MAP domain.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the MAP domain.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the MAP domain.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public Domain withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current operational state of the MAP domain.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the MAP domain.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the MAP domain.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public Domain withStatus(String status) {
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
	public Domain withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the transport mode to use.

          Corresponds to the {{bibref|RFC7598}} ''S46_CONT_MAPE'' and ''S46_CONT_MAPT'' container options.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getTransportMode() {
		return transportMode;
	}

	/**
	 * Set the transport mode to use.

          Corresponds to the {{bibref|RFC7598}} ''S46_CONT_MAPE'' and ''S46_CONT_MAPT'' container options.
	 *
	 * @since 2.8
	 * @param transportMode the input value
	 */
	public void  setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	/**
	 * Set the transport mode to use.

          Corresponds to the {{bibref|RFC7598}} ''S46_CONT_MAPE'' and ''S46_CONT_MAPT'' container options.
	 *
	 * @since 2.8
	 * @param transportMode the input value
	 * @return this instance
	 */
	public Domain withTransportMode(String transportMode) {
		this.transportMode = transportMode;
		return this;
	}

	/**
	 * Get the IP interface with which this MAP domain is associated.  This will always be a NAT-ted upstream (WAN) interface.

          The ''End-user IPv6 prefix'' {{param|IPv6Prefix}} is one of this IP interface's prefixes.

          The ''MAP IPv6 address'' is derived from the ''End-user IPv6 prefix'' and is one of this IP interface's IP addresses, with an {{param|##.IP.Interface.{i}.IPv6Address.{i}.Origin}} of {{enum|MAP|##.IP.Interface.{i}.IPv6Address.{i}.Origin}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getWanInterface() {
		return wanInterface;
	}

	/**
	 * Set the IP interface with which this MAP domain is associated.  This will always be a NAT-ted upstream (WAN) interface.

          The ''End-user IPv6 prefix'' {{param|IPv6Prefix}} is one of this IP interface's prefixes.

          The ''MAP IPv6 address'' is derived from the ''End-user IPv6 prefix'' and is one of this IP interface's IP addresses, with an {{param|##.IP.Interface.{i}.IPv6Address.{i}.Origin}} of {{enum|MAP|##.IP.Interface.{i}.IPv6Address.{i}.Origin}}.
	 *
	 * @since 2.8
	 * @param wanInterface the input value
	 */
	public void  setWanInterface(String wanInterface) {
		this.wanInterface = wanInterface;
	}

	/**
	 * Set the IP interface with which this MAP domain is associated.  This will always be a NAT-ted upstream (WAN) interface.

          The ''End-user IPv6 prefix'' {{param|IPv6Prefix}} is one of this IP interface's prefixes.

          The ''MAP IPv6 address'' is derived from the ''End-user IPv6 prefix'' and is one of this IP interface's IP addresses, with an {{param|##.IP.Interface.{i}.IPv6Address.{i}.Origin}} of {{enum|MAP|##.IP.Interface.{i}.IPv6Address.{i}.Origin}}.
	 *
	 * @since 2.8
	 * @param wanInterface the input value
	 * @return this instance
	 */
	public Domain withWanInterface(String wanInterface) {
		this.wanInterface = wanInterface;
		return this;
	}

	/**
	 * Get the MAP domain's ''End-user IPv6 prefix''.  This MUST reference one of {{param|WANInterface}}'s prefixes.

          If the ACS configures this prefix directly, the CPE MUST use the ACS-configured prefix.  Otherwise, the CPE MUST select one of {{param|WANInterface}}'s prefixes; the selected prefix will typically have {{param|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} =  {{enum|PrefixDelegation|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getIpv6Prefix() {
		return ipv6Prefix;
	}

	/**
	 * Set the MAP domain's ''End-user IPv6 prefix''.  This MUST reference one of {{param|WANInterface}}'s prefixes.

          If the ACS configures this prefix directly, the CPE MUST use the ACS-configured prefix.  Otherwise, the CPE MUST select one of {{param|WANInterface}}'s prefixes; the selected prefix will typically have {{param|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} =  {{enum|PrefixDelegation|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}}.
	 *
	 * @since 2.8
	 * @param ipv6Prefix the input value
	 */
	public void  setIpv6Prefix(String ipv6Prefix) {
		this.ipv6Prefix = ipv6Prefix;
	}

	/**
	 * Set the MAP domain's ''End-user IPv6 prefix''.  This MUST reference one of {{param|WANInterface}}'s prefixes.

          If the ACS configures this prefix directly, the CPE MUST use the ACS-configured prefix.  Otherwise, the CPE MUST select one of {{param|WANInterface}}'s prefixes; the selected prefix will typically have {{param|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} =  {{enum|PrefixDelegation|##.IP.Interface.{i}.IPv6Prefix.{i}.Origin}}.
	 *
	 * @since 2.8
	 * @param ipv6Prefix the input value
	 * @return this instance
	 */
	public Domain withIpv6Prefix(String ipv6Prefix) {
		this.ipv6Prefix = ipv6Prefix;
		return this;
	}

	/**
	 * Get the MAP Border Relay (BR) address or prefix.

          * For MAP-E this is the BR address and therefore MUST be a /128 {{bibref|RFC7597}}. Note this address can be an IPv6 anycast address. This address corresponds to the {{bibref|RFC7598}} ''OPTION_S46_BR'' (Border Relay) option.

          * For MAP-T this is the BR prefix {{bibref|RFC7599}}. This address prefix corresponds to the {{bibref|RFC7598}} ''OPTION_S46_DMR'' (Default Mapping Rule) option.

          Note: There will be a corresponding {{object|.Routing.Router.{i}.IPv4Forwarding}} default rule.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPv6Prefix getBriPv6Prefix() {
		return briPv6Prefix;
	}

	/**
	 * Set the MAP Border Relay (BR) address or prefix.

          * For MAP-E this is the BR address and therefore MUST be a /128 {{bibref|RFC7597}}. Note this address can be an IPv6 anycast address. This address corresponds to the {{bibref|RFC7598}} ''OPTION_S46_BR'' (Border Relay) option.

          * For MAP-T this is the BR prefix {{bibref|RFC7599}}. This address prefix corresponds to the {{bibref|RFC7598}} ''OPTION_S46_DMR'' (Default Mapping Rule) option.

          Note: There will be a corresponding {{object|.Routing.Router.{i}.IPv4Forwarding}} default rule.
	 *
	 * @since 2.8
	 * @param briPv6Prefix the input value
	 */
	public void  setBriPv6Prefix(IPv6Prefix briPv6Prefix) {
		this.briPv6Prefix = briPv6Prefix;
	}

	/**
	 * Set the MAP Border Relay (BR) address or prefix.

          * For MAP-E this is the BR address and therefore MUST be a /128 {{bibref|RFC7597}}. Note this address can be an IPv6 anycast address. This address corresponds to the {{bibref|RFC7598}} ''OPTION_S46_BR'' (Border Relay) option.

          * For MAP-T this is the BR prefix {{bibref|RFC7599}}. This address prefix corresponds to the {{bibref|RFC7598}} ''OPTION_S46_DMR'' (Default Mapping Rule) option.

          Note: There will be a corresponding {{object|.Routing.Router.{i}.IPv4Forwarding}} default rule.
	 *
	 * @since 2.8
	 * @param briPv6Prefix the input value
	 * @return this instance
	 */
	public Domain withBriPv6Prefix(IPv6Prefix briPv6Prefix) {
		this.briPv6Prefix = briPv6Prefix;
		return this;
	}

	/**
	 * Get the dscP with which to mark the outer IP header for traffic that is associated with this MAP domain.

          Downstream packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the incoming packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getDscPMarkPolicy() {
		return dscPMarkPolicy;
	}

	/**
	 * Set the dscP with which to mark the outer IP header for traffic that is associated with this MAP domain.

          Downstream packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the incoming packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 * @param dscPMarkPolicy the input value
	 */
	public void  setDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
	}

	/**
	 * Set the dscP with which to mark the outer IP header for traffic that is associated with this MAP domain.

          Downstream packets are never re-marked.

          Automatic DSCP marking behavior is a local matter to the device, possibly influenced by other Broadband Forum standards that it supports.

          * A value of -1 indicates copy from the incoming packet.

          * A value of -2 indicates automatic marking of DSCP.
	 *
	 * @since 2.8
	 * @param dscPMarkPolicy the input value
	 * @return this instance
	 */
	public Domain withDscPMarkPolicy(Integer dscPMarkPolicy) {
		this.dscPMarkPolicy = dscPMarkPolicy;
		return this;
	}

	/**
	 * Get the ''port-set ID'' (PSID) offset in bits.  The number of Port-sets is 2^{{param}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''offset'' field.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPsiDOffset() {
		return psiDOffset;
	}

	/**
	 * Set the ''port-set ID'' (PSID) offset in bits.  The number of Port-sets is 2^{{param}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''offset'' field.
	 *
	 * @since 2.8
	 * @param psiDOffset the input value
	 */
	public void  setPsiDOffset(Long psiDOffset) {
		this.psiDOffset = psiDOffset;
	}

	/**
	 * Set the ''port-set ID'' (PSID) offset in bits.  The number of Port-sets is 2^{{param}}.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''offset'' field.
	 *
	 * @since 2.8
	 * @param psiDOffset the input value
	 * @return this instance
	 */
	public Domain withPsiDOffset(Long psiDOffset) {
		this.psiDOffset = psiDOffset;
		return this;
	}

	/**
	 * Get the length in bits of the ''Port-set id'' (PSID) configured in the {{param|PSID}} parameter.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID-len'' field.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPsiDLength() {
		return psiDLength;
	}

	/**
	 * Set the length in bits of the ''Port-set id'' (PSID) configured in the {{param|PSID}} parameter.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID-len'' field.
	 *
	 * @since 2.8
	 * @param psiDLength the input value
	 */
	public void  setPsiDLength(Long psiDLength) {
		this.psiDLength = psiDLength;
	}

	/**
	 * Set the length in bits of the ''Port-set id'' (PSID) configured in the {{param|PSID}} parameter.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID-len'' field.
	 *
	 * @since 2.8
	 * @param psiDLength the input value
	 * @return this instance
	 */
	public Domain withPsiDLength(Long psiDLength) {
		this.psiDLength = psiDLength;
		return this;
	}

	/**
	 * Get the ''port-set ID'' (PSID) to use in preference to the value extracted from the ''Embedded Address'' (EA) bits.

          Only the high order {{param|PSIDLength}} bits of the {{param}} value are used, so the parameter is ignored when {{param|PSIDLength}} is zero.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID'' field.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getPsiD() {
		return psiD;
	}

	/**
	 * Set the ''port-set ID'' (PSID) to use in preference to the value extracted from the ''Embedded Address'' (EA) bits.

          Only the high order {{param|PSIDLength}} bits of the {{param}} value are used, so the parameter is ignored when {{param|PSIDLength}} is zero.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID'' field.
	 *
	 * @since 2.8
	 * @param psiD the input value
	 */
	public void  setPsiD(Long psiD) {
		this.psiD = psiD;
	}

	/**
	 * Set the ''port-set ID'' (PSID) to use in preference to the value extracted from the ''Embedded Address'' (EA) bits.

          Only the high order {{param|PSIDLength}} bits of the {{param}} value are used, so the parameter is ignored when {{param|PSIDLength}} is zero.

          Corresponds to the {{bibref|RFC7598}} ''S46_PORTPARAMS'' (Port Parameters) option's ''PSID'' field.
	 *
	 * @since 2.8
	 * @param psiD the input value
	 * @return this instance
	 */
	public Domain withPsiD(Long psiD) {
		this.psiD = psiD;
		return this;
	}

	/**
	 * Get the whether to include low-numbered (system) ports in the Port-sets. Normally ports in the range [0:2^(16-{{param|PSIDOffset}})-1] are excluded, e.g. for the default {{param|PSIDOffset}} value of 4, ports [0:4095] are not included in the Port-sets.

          This parameter is related to {{bibref|RFC7597}}'s ''N'', which is defined as ''the number of ports (e.g., 1024) excluded from the lower end of the range''.  The parameter is relevant only when {{param|PSIDOffset}} is 0; {{false}} corresponds to ''N=1024'' and {{true}} corresponds to ''N=0''.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isIncludeSystemPorts() {
		return includeSystemPorts;
	}

	/**
	 * Set the whether to include low-numbered (system) ports in the Port-sets. Normally ports in the range [0:2^(16-{{param|PSIDOffset}})-1] are excluded, e.g. for the default {{param|PSIDOffset}} value of 4, ports [0:4095] are not included in the Port-sets.

          This parameter is related to {{bibref|RFC7597}}'s ''N'', which is defined as ''the number of ports (e.g., 1024) excluded from the lower end of the range''.  The parameter is relevant only when {{param|PSIDOffset}} is 0; {{false}} corresponds to ''N=1024'' and {{true}} corresponds to ''N=0''.
	 *
	 * @since 2.8
	 * @param includeSystemPorts the input value
	 */
	public void  setIncludeSystemPorts(Boolean includeSystemPorts) {
		this.includeSystemPorts = includeSystemPorts;
	}

	/**
	 * Set the whether to include low-numbered (system) ports in the Port-sets. Normally ports in the range [0:2^(16-{{param|PSIDOffset}})-1] are excluded, e.g. for the default {{param|PSIDOffset}} value of 4, ports [0:4095] are not included in the Port-sets.

          This parameter is related to {{bibref|RFC7597}}'s ''N'', which is defined as ''the number of ports (e.g., 1024) excluded from the lower end of the range''.  The parameter is relevant only when {{param|PSIDOffset}} is 0; {{false}} corresponds to ''N=1024'' and {{true}} corresponds to ''N=0''.
	 *
	 * @since 2.8
	 * @param includeSystemPorts the input value
	 * @return this instance
	 */
	public Domain withIncludeSystemPorts(Boolean includeSystemPorts) {
		this.includeSystemPorts = includeSystemPorts;
		return this;
	}

	/**
	 * Get the MAP domain's Mapping Rules {{bibref|RFC7597}}. The rule with the longest match between its {{param|IPv6Prefix}} and the end-user {{param|#.IPv6Prefix}} is the Basic Mapping Rule (BMR). Any of the rules (including the BMR) can be a Forwarding Mapping Rule.
	 *
	 * @return the value
	 */
	public Collection<Rule> getRules() {
		if (this.rules == null){ this.rules=new ArrayList<>();}
		return rules;
	}

	/**
	 * Set the MAP domain's Mapping Rules {{bibref|RFC7597}}. The rule with the longest match between its {{param|IPv6Prefix}} and the end-user {{param|#.IPv6Prefix}} is the Basic Mapping Rule (BMR). Any of the rules (including the BMR) can be a Forwarding Mapping Rule.
	 *
	 * @param rules the input value
	 */
	public void  setRules(Collection<Rule> rules) {
		this.rules = rules;
	}

	/**
	 * Set the MAP domain's Mapping Rules {{bibref|RFC7597}}. The rule with the longest match between its {{param|IPv6Prefix}} and the end-user {{param|#.IPv6Prefix}} is the Basic Mapping Rule (BMR). Any of the rules (including the BMR) can be a Forwarding Mapping Rule.
	 *
	 * @param rule the input value
	 * @return this instance
	 */
	public Domain withRule(Rule rule) {
		getRules().add(rule);
		return this;
	}

	/**
	 * Get the map interface (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  This models the LAN side MAP domain interface.
	 *
	 * @return the value
	 */
	public Interface get_interface() {
		return _interface;
	}

	/**
	 * Set the map interface (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  This models the LAN side MAP domain interface.
	 *
	 * @param _interface the input value
	 */
	public void  set_interface(Interface _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the map interface (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  This models the LAN side MAP domain interface.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public Domain with_interface(Interface _interface) {
		this._interface = _interface;
		return this;
	}

	//</editor-fold>

}