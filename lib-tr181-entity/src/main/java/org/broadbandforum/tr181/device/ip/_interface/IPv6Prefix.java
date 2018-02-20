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
package org.broadbandforum.tr181.device.ip._interface;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This table contains the interface's IPv6 prefixes.  There MUST be an entry for each such prefix, not only for prefixes learned from router advertisements.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via {{bibref|RFC4861}} Router Advertisements.  See also {{object|.RouterAdvertisement}}.

        * Automatically via DHCPv6 {{bibref|RFC3315}} prefix delegation {{bibref|RFC3633}}.  See also {{object|.DHCPv6.Client}}.

        * Automatically via internal CPE logic, e.g. creation of child prefixes derived from a parent prefix.

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        The CPE MAY choose not to create {{object}} entries for {{enum|WellKnown|Origin}} prefixes or for the ULA /48 prefix {{bibref|RFC4193}}. If an {{object}} entry exists for the ULA /48 prefix, it MUST be on a downstream interface (i.e. an interface for which the physical layer interface object has ''Upstream'' = {{false}}).

        This object is based on ''ipAddressPrefixTable'' from {{bibref|RFC4293}}.
	 *
	 * @since TR181 v2.2
	 */
@CWMPObject(name = "Device.IP.Interface.{i}.IPv6Prefix.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Prefix"})})
@XmlRootElement(name = "Device.IP.Interface.IPv6Prefix")
@XmlType(name = "Device.IP.Interface.IPv6Prefix")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv6Prefix {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this {{object}} table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The status of {{param|Prefix}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PrefixStatus")
	public String prefixStatus;
	/**
	 * {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * IPv6 address prefix.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Prefix")
	@CWMPParameter(access = "readWrite")
	public org.broadbandforum.common.IPv6Prefix prefix;
	/**
	 * Mechanism via which the prefix was assigned or most recently updated. {{enum}}

          Note that:

          * {{enum|PrefixDelegation}} and {{enum|RouterAdvertisement}} prefixes can exist only on upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}),

          * {{enum|AutoConfigured}} and {{enum|WellKnown}} prefixes can exist on any interface, and

          * {{enum|Static}} and {{enum|Child}} prefixes can exist only on downstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{false}}).

          Also note that a {{enum|Child}} prefix's {{param|ParentPrefix}} will always be an {{enum|AutoConfigured}}, {{enum|PrefixDelegation}}, or {{enum|RouterAdvertisement}} prefix.

          This parameter is based on ''ipAddressOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * Static prefix sub-type.  For a {{enum|Static|Origin}} prefix, this can be set to {{enum|PrefixDelegation}} or {{enum|Child}}, thereby creating an unconfigured prefix of the specified type that will be populated in preference to creating a new instance.  This allows the ACS to pre-create "prefix slots" with known path names that can be referenced from elsewhere in the data model before they have been populated.  {{enum}}

          This mechanism works as follows:

          * When this parameter is set to {{enum|PrefixDelegation}} or {{enum|Child}}, the instance becomes a "prefix slot" of the specified type.

          * Such an instance can be administratively enabled ({{param|Enable}} = {{true}}) but will remain operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) until it has been populated.

          * When a new prefix of of type T is needed, the CPE will look for a matching unpopulated instance, i.e. an instance with ({{param|Origin}},{{param}},{{param|Prefix}}) = ({{enum|Static|Origin}},T,"").  If the CPE finds at least one such instance it will choose one and populate it.  If already administratively enabled it will immediately become operationally enabled.  If the CPE finds no such instances, it will create and populate a new instance with ({{param|Origin}},{{param}}) = (T,T).  If the CPE finds more than one such instance, the algorithm via which it chooses which instance to populate is implementation-specific.

          * When a prefix that was populated via this mechanism becomes invalid, the CPE will reset {{param|Prefix}} to {{empty}}.  This does not affect the value of the {{param|Enable}} parameter.

          The prefix {{param}} can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "StaticType")
	@CWMPParameter(access = "readWrite")
	public String staticType;
	/**
	 * Indicates the parent prefix from which this prefix was derived. The parent prefix is relevant only for {{enum|Child|Origin}} prefixes and for {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes (both of which will always be on downstream interfaces), i.e. for {{param|Origin}}={{enum|Child|Origin}} and for ({{param|Origin}},{{param|StaticType}}) = ({{enum|Static|Origin}},{{enum|Child|StaticType}}) prefixes.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}} (which makes sense only for a prefix whose {{param|StaticType}} is already or will be changed to {{enum|Child|StaticType}}).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ParentPrefix")
	@CWMPParameter(access = "readWrite")
	public String parentPrefix;
	/**
	 * A prefix that specifies the length of {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes and how they are derived from their {{param|ParentPrefix}}. It will be used if and only if it is not {{empty}} and is longer than the parent prefix (if it is not used, derivation of such prefixes is implementation-specific).  Any bits to the right of the parent prefix are set to the bits in this prefix.

          For example, for a parent prefix of fedc::/56, if this parameter had the value 123:4567:89ab:cdef::/64, the child /64 would be fedc:0:0:ef::/64.  For a parent prefix of fedc::/60, the child /64 would be fedc:0:0:f::/64.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ChildPrefixBits")
	@CWMPParameter(access = "readWrite")
	public org.broadbandforum.common.IPv6Prefix childPrefixBits;
	/**
	 * On-link flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for on-link determination.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixOnLinkFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "OnLink")
	@CWMPParameter(access = "readWrite")
	public Boolean onlink;
	/**
	 * Autonomous address configuration flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for generating global addresses as specified by SLAAC {{bibref|RFC4862}}.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixAutonomousFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Autonomous")
	@CWMPParameter(access = "readWrite")
	public Boolean autonomous;
	/**
	 * This parameter is based on ''ipAddressPrefixAdvPreferredLifetime'' from {{bibref|RFC4293}}. The time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PreferredLifetime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime preferredLifetime = LocalDateTime.parse("9999-12-31T23:59:59Z");;
	/**
	 * This parameter is based on ''ipAddressPrefixAdvValidLifetime'' from {{bibref|RFC4293}}.  The time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ValidLifetime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime validLifetime = LocalDateTime.parse("9999-12-31T23:59:59Z");;

	public IPv6Prefix() {
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
	public IPv6Prefix withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this {{object}} table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this {{object}} table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this {{object}} table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public IPv6Prefix withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the status of {{param|Prefix}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getPrefixStatus() {
		return prefixStatus;
	}

	/**
	 * Set the status of {{param|Prefix}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param prefixStatus the input value
	 */
	public void  setPrefixStatus(String prefixStatus) {
		this.prefixStatus = prefixStatus;
	}

	/**
	 * Set the status of {{param|Prefix}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param prefixStatus the input value
	 * @return this instance
	 */
	public IPv6Prefix withPrefixStatus(String prefixStatus) {
		this.prefixStatus = prefixStatus;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public IPv6Prefix withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the ipv6 address prefix.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.common.IPv6Prefix getPrefix() {
		return prefix;
	}

	/**
	 * Set the ipv6 address prefix.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 */
	public void  setPrefix(org.broadbandforum.common.IPv6Prefix prefix) {
		this.prefix = prefix;
	}

	/**
	 * Set the ipv6 address prefix.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 * @return this instance
	 */
	public IPv6Prefix withPrefix(org.broadbandforum.common.IPv6Prefix prefix) {
		this.prefix = prefix;
		return this;
	}

	/**
	 * Get the mechanism via which the prefix was assigned or most recently updated. {{enum}}

          Note that:

          * {{enum|PrefixDelegation}} and {{enum|RouterAdvertisement}} prefixes can exist only on upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}),

          * {{enum|AutoConfigured}} and {{enum|WellKnown}} prefixes can exist on any interface, and

          * {{enum|Static}} and {{enum|Child}} prefixes can exist only on downstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{false}}).

          Also note that a {{enum|Child}} prefix's {{param|ParentPrefix}} will always be an {{enum|AutoConfigured}}, {{enum|PrefixDelegation}}, or {{enum|RouterAdvertisement}} prefix.

          This parameter is based on ''ipAddressOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the prefix was assigned or most recently updated. {{enum}}

          Note that:

          * {{enum|PrefixDelegation}} and {{enum|RouterAdvertisement}} prefixes can exist only on upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}),

          * {{enum|AutoConfigured}} and {{enum|WellKnown}} prefixes can exist on any interface, and

          * {{enum|Static}} and {{enum|Child}} prefixes can exist only on downstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{false}}).

          Also note that a {{enum|Child}} prefix's {{param|ParentPrefix}} will always be an {{enum|AutoConfigured}}, {{enum|PrefixDelegation}}, or {{enum|RouterAdvertisement}} prefix.

          This parameter is based on ''ipAddressOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the prefix was assigned or most recently updated. {{enum}}

          Note that:

          * {{enum|PrefixDelegation}} and {{enum|RouterAdvertisement}} prefixes can exist only on upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}),

          * {{enum|AutoConfigured}} and {{enum|WellKnown}} prefixes can exist on any interface, and

          * {{enum|Static}} and {{enum|Child}} prefixes can exist only on downstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{false}}).

          Also note that a {{enum|Child}} prefix's {{param|ParentPrefix}} will always be an {{enum|AutoConfigured}}, {{enum|PrefixDelegation}}, or {{enum|RouterAdvertisement}} prefix.

          This parameter is based on ''ipAddressOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param origin the input value
	 * @return this instance
	 */
	public IPv6Prefix withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the static prefix sub-type.  For a {{enum|Static|Origin}} prefix, this can be set to {{enum|PrefixDelegation}} or {{enum|Child}}, thereby creating an unconfigured prefix of the specified type that will be populated in preference to creating a new instance.  This allows the ACS to pre-create "prefix slots" with known path names that can be referenced from elsewhere in the data model before they have been populated.  {{enum}}

          This mechanism works as follows:

          * When this parameter is set to {{enum|PrefixDelegation}} or {{enum|Child}}, the instance becomes a "prefix slot" of the specified type.

          * Such an instance can be administratively enabled ({{param|Enable}} = {{true}}) but will remain operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) until it has been populated.

          * When a new prefix of of type T is needed, the CPE will look for a matching unpopulated instance, i.e. an instance with ({{param|Origin}},{{param}},{{param|Prefix}}) = ({{enum|Static|Origin}},T,"").  If the CPE finds at least one such instance it will choose one and populate it.  If already administratively enabled it will immediately become operationally enabled.  If the CPE finds no such instances, it will create and populate a new instance with ({{param|Origin}},{{param}}) = (T,T).  If the CPE finds more than one such instance, the algorithm via which it chooses which instance to populate is implementation-specific.

          * When a prefix that was populated via this mechanism becomes invalid, the CPE will reset {{param|Prefix}} to {{empty}}.  This does not affect the value of the {{param|Enable}} parameter.

          The prefix {{param}} can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStaticType() {
		return staticType;
	}

	/**
	 * Set the static prefix sub-type.  For a {{enum|Static|Origin}} prefix, this can be set to {{enum|PrefixDelegation}} or {{enum|Child}}, thereby creating an unconfigured prefix of the specified type that will be populated in preference to creating a new instance.  This allows the ACS to pre-create "prefix slots" with known path names that can be referenced from elsewhere in the data model before they have been populated.  {{enum}}

          This mechanism works as follows:

          * When this parameter is set to {{enum|PrefixDelegation}} or {{enum|Child}}, the instance becomes a "prefix slot" of the specified type.

          * Such an instance can be administratively enabled ({{param|Enable}} = {{true}}) but will remain operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) until it has been populated.

          * When a new prefix of of type T is needed, the CPE will look for a matching unpopulated instance, i.e. an instance with ({{param|Origin}},{{param}},{{param|Prefix}}) = ({{enum|Static|Origin}},T,"").  If the CPE finds at least one such instance it will choose one and populate it.  If already administratively enabled it will immediately become operationally enabled.  If the CPE finds no such instances, it will create and populate a new instance with ({{param|Origin}},{{param}}) = (T,T).  If the CPE finds more than one such instance, the algorithm via which it chooses which instance to populate is implementation-specific.

          * When a prefix that was populated via this mechanism becomes invalid, the CPE will reset {{param|Prefix}} to {{empty}}.  This does not affect the value of the {{param|Enable}} parameter.

          The prefix {{param}} can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param staticType the input value
	 */
	public void  setStaticType(String staticType) {
		this.staticType = staticType;
	}

	/**
	 * Set the static prefix sub-type.  For a {{enum|Static|Origin}} prefix, this can be set to {{enum|PrefixDelegation}} or {{enum|Child}}, thereby creating an unconfigured prefix of the specified type that will be populated in preference to creating a new instance.  This allows the ACS to pre-create "prefix slots" with known path names that can be referenced from elsewhere in the data model before they have been populated.  {{enum}}

          This mechanism works as follows:

          * When this parameter is set to {{enum|PrefixDelegation}} or {{enum|Child}}, the instance becomes a "prefix slot" of the specified type.

          * Such an instance can be administratively enabled ({{param|Enable}} = {{true}}) but will remain operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) until it has been populated.

          * When a new prefix of of type T is needed, the CPE will look for a matching unpopulated instance, i.e. an instance with ({{param|Origin}},{{param}},{{param|Prefix}}) = ({{enum|Static|Origin}},T,"").  If the CPE finds at least one such instance it will choose one and populate it.  If already administratively enabled it will immediately become operationally enabled.  If the CPE finds no such instances, it will create and populate a new instance with ({{param|Origin}},{{param}}) = (T,T).  If the CPE finds more than one such instance, the algorithm via which it chooses which instance to populate is implementation-specific.

          * When a prefix that was populated via this mechanism becomes invalid, the CPE will reset {{param|Prefix}} to {{empty}}.  This does not affect the value of the {{param|Enable}} parameter.

          The prefix {{param}} can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param staticType the input value
	 * @return this instance
	 */
	public IPv6Prefix withStaticType(String staticType) {
		this.staticType = staticType;
		return this;
	}

	/**
	 * Get the indicates the parent prefix from which this prefix was derived. The parent prefix is relevant only for {{enum|Child|Origin}} prefixes and for {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes (both of which will always be on downstream interfaces), i.e. for {{param|Origin}}={{enum|Child|Origin}} and for ({{param|Origin}},{{param|StaticType}}) = ({{enum|Static|Origin}},{{enum|Child|StaticType}}) prefixes.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}} (which makes sense only for a prefix whose {{param|StaticType}} is already or will be changed to {{enum|Child|StaticType}}).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getParentPrefix() {
		return parentPrefix;
	}

	/**
	 * Set the indicates the parent prefix from which this prefix was derived. The parent prefix is relevant only for {{enum|Child|Origin}} prefixes and for {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes (both of which will always be on downstream interfaces), i.e. for {{param|Origin}}={{enum|Child|Origin}} and for ({{param|Origin}},{{param|StaticType}}) = ({{enum|Static|Origin}},{{enum|Child|StaticType}}) prefixes.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}} (which makes sense only for a prefix whose {{param|StaticType}} is already or will be changed to {{enum|Child|StaticType}}).
	 *
	 * @since 2.2
	 * @param parentPrefix the input value
	 */
	public void  setParentPrefix(String parentPrefix) {
		this.parentPrefix = parentPrefix;
	}

	/**
	 * Set the indicates the parent prefix from which this prefix was derived. The parent prefix is relevant only for {{enum|Child|Origin}} prefixes and for {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes (both of which will always be on downstream interfaces), i.e. for {{param|Origin}}={{enum|Child|Origin}} and for ({{param|Origin}},{{param|StaticType}}) = ({{enum|Static|Origin}},{{enum|Child|StaticType}}) prefixes.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}} (which makes sense only for a prefix whose {{param|StaticType}} is already or will be changed to {{enum|Child|StaticType}}).
	 *
	 * @since 2.2
	 * @param parentPrefix the input value
	 * @return this instance
	 */
	public IPv6Prefix withParentPrefix(String parentPrefix) {
		this.parentPrefix = parentPrefix;
		return this;
	}

	/**
	 * Get a prefix that specifies the length of {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes and how they are derived from their {{param|ParentPrefix}}. It will be used if and only if it is not {{empty}} and is longer than the parent prefix (if it is not used, derivation of such prefixes is implementation-specific).  Any bits to the right of the parent prefix are set to the bits in this prefix.

          For example, for a parent prefix of fedc::/56, if this parameter had the value 123:4567:89ab:cdef::/64, the child /64 would be fedc:0:0:ef::/64.  For a parent prefix of fedc::/60, the child /64 would be fedc:0:0:f::/64.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.common.IPv6Prefix getChildPrefixBits() {
		return childPrefixBits;
	}

	/**
	 * Set a prefix that specifies the length of {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes and how they are derived from their {{param|ParentPrefix}}. It will be used if and only if it is not {{empty}} and is longer than the parent prefix (if it is not used, derivation of such prefixes is implementation-specific).  Any bits to the right of the parent prefix are set to the bits in this prefix.

          For example, for a parent prefix of fedc::/56, if this parameter had the value 123:4567:89ab:cdef::/64, the child /64 would be fedc:0:0:ef::/64.  For a parent prefix of fedc::/60, the child /64 would be fedc:0:0:f::/64.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param childPrefixBits the input value
	 */
	public void  setChildPrefixBits(org.broadbandforum.common.IPv6Prefix childPrefixBits) {
		this.childPrefixBits = childPrefixBits;
	}

	/**
	 * Set a prefix that specifies the length of {{enum|Static|Origin}} {{enum|Child|StaticType}} prefixes and how they are derived from their {{param|ParentPrefix}}. It will be used if and only if it is not {{empty}} and is longer than the parent prefix (if it is not used, derivation of such prefixes is implementation-specific).  Any bits to the right of the parent prefix are set to the bits in this prefix.

          For example, for a parent prefix of fedc::/56, if this parameter had the value 123:4567:89ab:cdef::/64, the child /64 would be fedc:0:0:ef::/64.  For a parent prefix of fedc::/60, the child /64 would be fedc:0:0:f::/64.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param childPrefixBits the input value
	 * @return this instance
	 */
	public IPv6Prefix withChildPrefixBits(org.broadbandforum.common.IPv6Prefix childPrefixBits) {
		this.childPrefixBits = childPrefixBits;
		return this;
	}

	/**
	 * Get the on-link flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for on-link determination.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixOnLinkFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isOnlink() {
		return onlink;
	}

	/**
	 * Set the on-link flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for on-link determination.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixOnLinkFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param onlink the input value
	 */
	public void  setOnlink(Boolean onlink) {
		this.onlink = onlink;
	}

	/**
	 * Set the on-link flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for on-link determination.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixOnLinkFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param onlink the input value
	 * @return this instance
	 */
	public IPv6Prefix withOnlink(Boolean onlink) {
		this.onlink = onlink;
		return this;
	}

	/**
	 * Get autonomous address configuration flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for generating global addresses as specified by SLAAC {{bibref|RFC4862}}.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixAutonomousFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isAutonomous() {
		return autonomous;
	}

	/**
	 * Set autonomous address configuration flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for generating global addresses as specified by SLAAC {{bibref|RFC4862}}.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixAutonomousFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param autonomous the input value
	 */
	public void  setAutonomous(Boolean autonomous) {
		this.autonomous = autonomous;
	}

	/**
	 * Set autonomous address configuration flag {{bibref|RFC4861|Section 4.6.2}} as received (in the RA) for RouterAdvertisement.  Indicates whether this prefix can be used for generating global addresses as specified by SLAAC {{bibref|RFC4862}}.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefixAutonomousFlag'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param autonomous the input value
	 * @return this instance
	 */
	public IPv6Prefix withAutonomous(Boolean autonomous) {
		this.autonomous = autonomous;
		return this;
	}

	/**
	 * Get the this parameter is based on ''ipAddressPrefixAdvPreferredLifetime'' from {{bibref|RFC4293}}. The time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getPreferredLifetime() {
		return preferredLifetime;
	}

	/**
	 * Set the this parameter is based on ''ipAddressPrefixAdvPreferredLifetime'' from {{bibref|RFC4293}}. The time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 */
	public void  setPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
	}

	/**
	 * Set the this parameter is based on ''ipAddressPrefixAdvPreferredLifetime'' from {{bibref|RFC4293}}. The time at which this prefix will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 * @return this instance
	 */
	public IPv6Prefix withPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
		return this;
	}

	/**
	 * Get the this parameter is based on ''ipAddressPrefixAdvValidLifetime'' from {{bibref|RFC4293}}.  The time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getValidLifetime() {
		return validLifetime;
	}

	/**
	 * Set the this parameter is based on ''ipAddressPrefixAdvValidLifetime'' from {{bibref|RFC4293}}.  The time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 */
	public void  setValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
	}

	/**
	 * Set the this parameter is based on ''ipAddressPrefixAdvValidLifetime'' from {{bibref|RFC4293}}.  The time at which this prefix will cease to be valid (i.e. will become invalid), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 * @return this instance
	 */
	public IPv6Prefix withValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
		return this;
	}

	//</editor-fold>

}