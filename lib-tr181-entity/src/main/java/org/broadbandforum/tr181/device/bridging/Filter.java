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
package org.broadbandforum.tr181.device.bridging;

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
import org.broadbandforum.tr181.datatypes.IPAddress;
import org.broadbandforum.tr181.datatypes.IPPrefix;

	/**
	 * Filter table containing classification filter entries, each of which expresses a set of classification criterion to classify ingress frames as member of a {{object|#.Bridge}} instance or a {{object|#.Bridge.{i}.VLAN}} instance.

        Bridge VLAN classification only applies for 802.1Q {{bibref|802.1Q-2011}} Bridges.

        For enabled table entries, if {{param|Bridge}} or {{param|Interface}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as filter criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Bridging.Filter.{i}.")
@XmlRootElement(name = "Device.Bridging.Filter")
@XmlType(name = "Device.Bridging.Filter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Filter {

	/**
	 * Enables or disables this Filter table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The status of this Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          If the Bridge Port table is supported, but none of its entries correspond to {{param|Interface}}, or if such an entry exists  but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

          If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{reference|a {{object|.Bridging.Bridge}} object in case of a 802.1D bridge or a {{object|.Bridging.Bridge.{i}.VLAN}} object in case of a 802.1Q bridge}}  Note: either way, this identifies the bridge (because each bridge has a VLAN table).

          Defines the Bridge or Bridge VLAN to which ingress frames will be classified based upon matches of the classification criteria.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Bridge")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String bridge;
	/**
	 * Position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each ingress frame on the {{param|Interface}}, the highest ordered entry that matches the filter criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value.  A deletion causes {{param}} values to be compacted.  When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
	/**
	 * {{reference}}  This MUST relate to the same bridge as does {{param|Bridge}}.

          Defines the Bridge Port on which ingress frame classification will occur.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * The DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as filter criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DHCPType")
	@CWMPParameter(access = "readWrite")
	public String dhcPType = "DHCPv4";
	/**
	 * Classification criterion. 

          The 802.1Q {{bibref|802.1Q-2011}} VLAN ID.

          For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be ''0''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4094)
	public Long vlaNIDFilter = 0L;
	/**
	 * Classification criterion.

          {{list}} Each list item represents an Ethertype value.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthertypeFilterList")
	@CWMPParameter(access = "readWrite")
	public Long ethertypeFilterList;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those  packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the  {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthertypeFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ethertypeFilterExclude = true;
	/**
	 * Classification criterion.

          {{list|each representing a MAC Address}}

          Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set  to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACAddressFilterList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> sourceMACAddressFilterList;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the  {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACAddressFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACAddressFilterExclude = true;
	/**
	 * Classification criterion.

          {{list}} Each list item specifies a MAC Address. List items MAY optionally specify a bit-mask after the MAC Address, where matching  of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC  Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACAddressFilterList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> destMACAddressFilterList;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the  {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is  empty, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACAddressFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACAddressFilterExclude = true;
	/**
	 * Classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|SourceMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACFromVendorClassIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public String sourceMACFromVendorClassIDFilter;
	/**
	 * Classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceMACFromVendorClassIDFilterv6")
	@CWMPParameter(access = "readWrite")
	public byte[] sourceMACFromVendorClassIDFilterv6;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACFromVendorClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACFromVendorClassIDFilterExclude = true;
	/**
	 * {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with this parameter values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACFromVendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String sourceMACFromVendorClassIDMode = "Exact";
	/**
	 * Classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACFromVendorClassIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public String destMACFromVendorClassIDFilter;
	/**
	 * Classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestMACFromVendorClassIDFilterv6")
	@CWMPParameter(access = "readWrite")
	public byte[] destMACFromVendorClassIDFilterv6;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACFromVendorClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACFromVendorClassIDFilterExclude = true;
	/**
	 * {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with  {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACFromVendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String destMACFromVendorClassIDMode = "Exact";
	/**
	 * Classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACFromClientIDFilter")
	@CWMPParameter(access = "readWrite")
	public byte[] sourceMACFromClientIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.   If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the  {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACFromClientIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACFromClientIDFilterExclude = true;
	/**
	 * Classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACFromClientIDFilter")
	@CWMPParameter(access = "readWrite")
	public byte[] destMACFromClientIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.   If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If  the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACFromClientIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACFromClientIDFilterExclude = true;
	/**
	 * Classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACFromUserClassIDFilter")
	@CWMPParameter(access = "readWrite")
	public byte[] sourceMACFromUserClassIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACFromUserClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACFromUserClassIDFilterExclude = true;
	/**
	 * Classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACFromUserClassIDFilter")
	@CWMPParameter(access = "readWrite")
	public byte[] destMACFromUserClassIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACFromUserClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACFromUserClassIDFilterExclude = true;
	/**
	 * Classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DestIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIP;
	/**
	 * Destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DestMask")
	@CWMPParameter(access = "readWrite")
	public IPPrefix destMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DestIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destIPExclude = false;
	/**
	 * Classification criterion.

          Source IP address. {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SourceIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIP;
	/**
	 * Source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be an empty string (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SourceMask")
	@CWMPParameter(access = "readWrite")
	public IPPrefix sourceMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SourceIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceIPExclude = false;
	/**
	 * Classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 255)
	public Integer protocol = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ProtocolExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean protocolExclude = false;
	/**
	 * Classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DestPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer destPort = -1;
	/**
	 * Classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DestPortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer destPortRangeMax = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DestPortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destPortExclude = false;
	/**
	 * Classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SourcePort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer sourcePort = -1;
	/**
	 * Classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to SourcePort.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SourcePortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer sourcePortRangeMax = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SourcePortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourcePortExclude = false;

	public Filter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Filter table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Filter table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Filter table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Filter withEnable(Boolean enable) {
		this.enable = enable;
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
	public Filter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the status of this Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          If the Bridge Port table is supported, but none of its entries correspond to {{param|Interface}}, or if such an entry exists  but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

          If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          If the Bridge Port table is supported, but none of its entries correspond to {{param|Interface}}, or if such an entry exists  but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

          If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Filter table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          If the Bridge Port table is supported, but none of its entries correspond to {{param|Interface}}, or if such an entry exists  but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

          If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Filter withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{reference|a {{object|.Bridging.Bridge}} object in case of a 802.1D bridge or a {{object|.Bridging.Bridge.{i}.VLAN}} object in case of a 802.1Q bridge}}  Note: either way, this identifies the bridge (because each bridge has a VLAN table).

          Defines the Bridge or Bridge VLAN to which ingress frames will be classified based upon matches of the classification criteria.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBridge() {
		return bridge;
	}

	/**
	 * Set the {{reference|a {{object|.Bridging.Bridge}} object in case of a 802.1D bridge or a {{object|.Bridging.Bridge.{i}.VLAN}} object in case of a 802.1Q bridge}}  Note: either way, this identifies the bridge (because each bridge has a VLAN table).

          Defines the Bridge or Bridge VLAN to which ingress frames will be classified based upon matches of the classification criteria.
	 *
	 * @since 2.0
	 * @param bridge the input value
	 */
	public void  setBridge(String bridge) {
		this.bridge = bridge;
	}

	/**
	 * Set the {{reference|a {{object|.Bridging.Bridge}} object in case of a 802.1D bridge or a {{object|.Bridging.Bridge.{i}.VLAN}} object in case of a 802.1Q bridge}}  Note: either way, this identifies the bridge (because each bridge has a VLAN table).

          Defines the Bridge or Bridge VLAN to which ingress frames will be classified based upon matches of the classification criteria.
	 *
	 * @since 2.0
	 * @param bridge the input value
	 * @return this instance
	 */
	public Filter withBridge(String bridge) {
		this.bridge = bridge;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each ingress frame on the {{param|Interface}}, the highest ordered entry that matches the filter criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value.  A deletion causes {{param}} values to be compacted.  When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each ingress frame on the {{param|Interface}}, the highest ordered entry that matches the filter criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value.  A deletion causes {{param}} values to be compacted.  When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each ingress frame on the {{param|Interface}}, the highest ordered entry that matches the filter criteria is applied. All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value.  A deletion causes {{param}} values to be compacted.  When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public Filter withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get the {{reference}}  This MUST relate to the same bridge as does {{param|Bridge}}.

          Defines the Bridge Port on which ingress frame classification will occur.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}}  This MUST relate to the same bridge as does {{param|Bridge}}.

          Defines the Bridge Port on which ingress frame classification will occur.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}}  This MUST relate to the same bridge as does {{param|Bridge}}.

          Defines the Bridge Port on which ingress frame classification will occur.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Filter with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as filter criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getDhcPType() {
		return dhcPType;
	}

	/**
	 * Set the DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as filter criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 * @param dhcPType the input value
	 */
	public void  setDhcPType(String dhcPType) {
		this.dhcPType = dhcPType;
	}

	/**
	 * Set the DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as filter criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 * @param dhcPType the input value
	 * @return this instance
	 */
	public Filter withDhcPType(String dhcPType) {
		this.dhcPType = dhcPType;
		return this;
	}

	/**
	 * Get the classification criterion. 

          The 802.1Q {{bibref|802.1Q-2011}} VLAN ID.

          For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be ''0''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getVlaNIDFilter() {
		return vlaNIDFilter;
	}

	/**
	 * Set the classification criterion. 

          The 802.1Q {{bibref|802.1Q-2011}} VLAN ID.

          For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be ''0''.
	 *
	 * @since 2.0
	 * @param vlaNIDFilter the input value
	 */
	public void  setVlaNIDFilter(Long vlaNIDFilter) {
		this.vlaNIDFilter = vlaNIDFilter;
	}

	/**
	 * Set the classification criterion. 

          The 802.1Q {{bibref|802.1Q-2011}} VLAN ID.

          For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be ''0''.
	 *
	 * @since 2.0
	 * @param vlaNIDFilter the input value
	 * @return this instance
	 */
	public Filter withVlaNIDFilter(Long vlaNIDFilter) {
		this.vlaNIDFilter = vlaNIDFilter;
		return this;
	}

	/**
	 * Get the classification criterion.

          {{list}} Each list item represents an Ethertype value.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEthertypeFilterList() {
		return ethertypeFilterList;
	}

	/**
	 * Set the classification criterion.

          {{list}} Each list item represents an Ethertype value.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 * @param ethertypeFilterList the input value
	 */
	public void  setEthertypeFilterList(Long ethertypeFilterList) {
		this.ethertypeFilterList = ethertypeFilterList;
	}

	/**
	 * Set the classification criterion.

          {{list}} Each list item represents an Ethertype value.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 * @param ethertypeFilterList the input value
	 * @return this instance
	 */
	public Filter withEthertypeFilterList(Long ethertypeFilterList) {
		this.ethertypeFilterList = ethertypeFilterList;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those  packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the  {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEthertypeFilterExclude() {
		return ethertypeFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those  packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the  {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 * @param ethertypeFilterExclude the input value
	 */
	public void  setEthertypeFilterExclude(Boolean ethertypeFilterExclude) {
		this.ethertypeFilterExclude = ethertypeFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those  packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the  {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on  Ethertype.
	 *
	 * @since 2.0
	 * @param ethertypeFilterExclude the input value
	 * @return this instance
	 */
	public Filter withEthertypeFilterExclude(Boolean ethertypeFilterExclude) {
		this.ethertypeFilterExclude = ethertypeFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          {{list|each representing a MAC Address}}

          Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set  to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSourceMACAddressFilterList() {
		if (this.sourceMACAddressFilterList == null){ this.sourceMACAddressFilterList=new ArrayList<>();}
		return sourceMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

          {{list|each representing a MAC Address}}

          Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set  to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param sourceMACAddressFilterList the input value
	 */
	public void  setSourceMACAddressFilterList(Collection<String> sourceMACAddressFilterList) {
		this.sourceMACAddressFilterList = sourceMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

          {{list|each representing a MAC Address}}

          Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set  to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Filter withSourceMACAddressFilterList(String string) {
		getSourceMACAddressFilterList().add(string);
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the  {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceMACAddressFilterExclude() {
		return sourceMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the  {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param sourceMACAddressFilterExclude the input value
	 */
	public void  setSourceMACAddressFilterExclude(Boolean sourceMACAddressFilterExclude) {
		this.sourceMACAddressFilterExclude = sourceMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the  {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param sourceMACAddressFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACAddressFilterExclude(Boolean sourceMACAddressFilterExclude) {
		this.sourceMACAddressFilterExclude = sourceMACAddressFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          {{list}} Each list item specifies a MAC Address. List items MAY optionally specify a bit-mask after the MAC Address, where matching  of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC  Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDestMACAddressFilterList() {
		if (this.destMACAddressFilterList == null){ this.destMACAddressFilterList=new ArrayList<>();}
		return destMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

          {{list}} Each list item specifies a MAC Address. List items MAY optionally specify a bit-mask after the MAC Address, where matching  of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC  Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 2.0
	 * @param destMACAddressFilterList the input value
	 */
	public void  setDestMACAddressFilterList(Collection<String> destMACAddressFilterList) {
		this.destMACAddressFilterList = destMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

          {{list}} Each list item specifies a MAC Address. List items MAY optionally specify a bit-mask after the MAC Address, where matching  of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC  Address are to be used for matching.

          For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Filter withDestMACAddressFilterList(String string) {
		getDestMACAddressFilterList().add(string);
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the  {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is  empty, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestMACAddressFilterExclude() {
		return destMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the  {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is  empty, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACAddressFilterExclude the input value
	 */
	public void  setDestMACAddressFilterExclude(Boolean destMACAddressFilterExclude) {
		this.destMACAddressFilterExclude = destMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the  {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is  empty, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACAddressFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACAddressFilterExclude(Boolean destMACAddressFilterExclude) {
		this.destMACAddressFilterExclude = destMACAddressFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|SourceMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSourceMACFromVendorClassIDFilter() {
		return sourceMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|SourceMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceMACFromVendorClassIDFilter the input value
	 */
	public void  setSourceMACFromVendorClassIDFilter(String sourceMACFromVendorClassIDFilter) {
		this.sourceMACFromVendorClassIDFilter = sourceMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|SourceMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceMACFromVendorClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromVendorClassIDFilter(String sourceMACFromVendorClassIDFilter) {
		this.sourceMACFromVendorClassIDFilter = sourceMACFromVendorClassIDFilter;
		return this;
	}

	/**
	 * Get the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getSourceMACFromVendorClassIDFilterv6() {
		return sourceMACFromVendorClassIDFilterv6;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param sourceMACFromVendorClassIDFilterv6 the input value
	 */
	public void  setSourceMACFromVendorClassIDFilterv6(byte[] sourceMACFromVendorClassIDFilterv6) {
		this.sourceMACFromVendorClassIDFilterv6 = sourceMACFromVendorClassIDFilterv6;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param sourceMACFromVendorClassIDFilterv6 the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromVendorClassIDFilterv6(byte[] sourceMACFromVendorClassIDFilterv6) {
		this.sourceMACFromVendorClassIDFilterv6 = sourceMACFromVendorClassIDFilterv6;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceMACFromVendorClassIDFilterExclude() {
		return sourceMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address
	 *
	 * @since 2.0
	 * @param sourceMACFromVendorClassIDFilterExclude the input value
	 */
	public void  setSourceMACFromVendorClassIDFilterExclude(Boolean sourceMACFromVendorClassIDFilterExclude) {
		this.sourceMACFromVendorClassIDFilterExclude = sourceMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|SourceMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address
	 *
	 * @since 2.0
	 * @param sourceMACFromVendorClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromVendorClassIDFilterExclude(Boolean sourceMACFromVendorClassIDFilterExclude) {
		this.sourceMACFromVendorClassIDFilterExclude = sourceMACFromVendorClassIDFilterExclude;
		return this;
	}

	/**
	 * Get the {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with this parameter values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSourceMACFromVendorClassIDMode() {
		return sourceMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with this parameter values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param sourceMACFromVendorClassIDMode the input value
	 */
	public void  setSourceMACFromVendorClassIDMode(String sourceMACFromVendorClassIDMode) {
		this.sourceMACFromVendorClassIDMode = sourceMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with this parameter values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param sourceMACFromVendorClassIDMode the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromVendorClassIDMode(String sourceMACFromVendorClassIDMode) {
		this.sourceMACFromVendorClassIDMode = sourceMACFromVendorClassIDMode;
		return this;
	}

	/**
	 * Get the classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDestMACFromVendorClassIDFilter() {
		return destMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destMACFromVendorClassIDFilter the input value
	 */
	public void  setDestMACFromVendorClassIDFilter(String destMACFromVendorClassIDFilter) {
		this.destMACFromVendorClassIDFilter = destMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCPv4 Vendor Class Identifier (Option 60 as defined in {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}. Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destMACFromVendorClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withDestMACFromVendorClassIDFilter(String destMACFromVendorClassIDFilter) {
		this.destMACFromVendorClassIDFilter = destMACFromVendorClassIDFilter;
		return this;
	}

	/**
	 * Get the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getDestMACFromVendorClassIDFilterv6() {
		return destMACFromVendorClassIDFilterv6;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param destMACFromVendorClassIDFilterv6 the input value
	 */
	public void  setDestMACFromVendorClassIDFilterv6(byte[] destMACFromVendorClassIDFilterv6) {
		this.destMACFromVendorClassIDFilterv6 = destMACFromVendorClassIDFilterv6;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCPv6 Vendor Class Identifier (Option 16 as defined in {{bibref|RFC3315}}) was equal to the specified value. The option value is binary, so an exact match is REQUIRED.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param destMACFromVendorClassIDFilterv6 the input value
	 * @return this instance
	 */
	public Filter withDestMACFromVendorClassIDFilterv6(byte[] destMACFromVendorClassIDFilterv6) {
		this.destMACFromVendorClassIDFilterv6 = destMACFromVendorClassIDFilterv6;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestMACFromVendorClassIDFilterExclude() {
		return destMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACFromVendorClassIDFilterExclude the input value
	 */
	public void  setDestMACFromVendorClassIDFilterExclude(Boolean destMACFromVendorClassIDFilterExclude) {
		this.destMACFromVendorClassIDFilterExclude = destMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}} (for {{enum|DHCPv4|DHCPType}}) or {{param|DestMACFromVendorClassIDFilterv6}} (for {{enum|DHCPv6|DHCPType}}). If this corresponding filter parameter is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACFromVendorClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACFromVendorClassIDFilterExclude(Boolean destMACFromVendorClassIDFilterExclude) {
		this.destMACFromVendorClassIDFilterExclude = destMACFromVendorClassIDFilterExclude;
		return this;
	}

	/**
	 * Get the {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with  {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDestMACFromVendorClassIDMode() {
		return destMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with  {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param destMACFromVendorClassIDMode the input value
	 */
	public void  setDestMACFromVendorClassIDMode(String destMACFromVendorClassIDMode) {
		this.destMACFromVendorClassIDMode = destMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

          For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with  {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param destMACFromVendorClassIDMode the input value
	 * @return this instance
	 */
	public Filter withDestMACFromVendorClassIDMode(String destMACFromVendorClassIDMode) {
		this.destMACFromVendorClassIDMode = destMACFromVendorClassIDMode;
		return this;
	}

	/**
	 * Get the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSourceMACFromClientIDFilter() {
		return sourceMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param sourceMACFromClientIDFilter the input value
	 */
	public void  setSourceMACFromClientIDFilter(byte[] sourceMACFromClientIDFilter) {
		this.sourceMACFromClientIDFilter = sourceMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param sourceMACFromClientIDFilter the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromClientIDFilter(byte[] sourceMACFromClientIDFilter) {
		this.sourceMACFromClientIDFilter = sourceMACFromClientIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.   If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the  {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceMACFromClientIDFilterExclude() {
		return sourceMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.   If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the  {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param sourceMACFromClientIDFilterExclude the input value
	 */
	public void  setSourceMACFromClientIDFilterExclude(Boolean sourceMACFromClientIDFilterExclude) {
		this.sourceMACFromClientIDFilterExclude = sourceMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets  whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.   If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose  source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the  {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC  address.
	 *
	 * @since 2.0
	 * @param sourceMACFromClientIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromClientIDFilterExclude(Boolean sourceMACFromClientIDFilterExclude) {
		this.sourceMACFromClientIDFilterExclude = sourceMACFromClientIDFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDestMACFromClientIDFilter() {
		return destMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param destMACFromClientIDFilter the input value
	 */
	public void  setDestMACFromClientIDFilter(byte[] destMACFromClientIDFilter) {
		this.destMACFromClientIDFilter = destMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP Client Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param destMACFromClientIDFilter the input value
	 * @return this instance
	 */
	public Filter withDestMACFromClientIDFilter(byte[] destMACFromClientIDFilter) {
		this.destMACFromClientIDFilter = destMACFromClientIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.   If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If  the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestMACFromClientIDFilterExclude() {
		return destMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.   If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If  the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACFromClientIDFilterExclude the input value
	 */
	public void  setDestMACFromClientIDFilterExclude(Boolean destMACFromClientIDFilterExclude) {
		this.destMACFromClientIDFilterExclude = destMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.   If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If  the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACFromClientIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACFromClientIDFilterExclude(Boolean destMACFromClientIDFilterExclude) {
		this.destMACFromClientIDFilterExclude = destMACFromClientIDFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSourceMACFromUserClassIDFilter() {
		return sourceMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceMACFromUserClassIDFilter the input value
	 */
	public void  setSourceMACFromUserClassIDFilter(byte[] sourceMACFromUserClassIDFilter) {
		this.sourceMACFromUserClassIDFilter = sourceMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceMACFromUserClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromUserClassIDFilter(byte[] sourceMACFromUserClassIDFilter) {
		this.sourceMACFromUserClassIDFilter = sourceMACFromUserClassIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceMACFromUserClassIDFilterExclude() {
		return sourceMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.
	 *
	 * @since 2.0
	 * @param sourceMACFromUserClassIDFilterExclude the input value
	 */
	public void  setSourceMACFromUserClassIDFilterExclude(Boolean sourceMACFromUserClassIDFilterExclude) {
		this.sourceMACFromUserClassIDFilterExclude = sourceMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

          Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2011}} support classification based on source MAC address.
	 *
	 * @since 2.0
	 * @param sourceMACFromUserClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromUserClassIDFilterExclude(Boolean sourceMACFromUserClassIDFilterExclude) {
		this.sourceMACFromUserClassIDFilterExclude = sourceMACFromUserClassIDFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDestMACFromUserClassIDFilter() {
		return destMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destMACFromUserClassIDFilter the input value
	 */
	public void  setDestMACFromUserClassIDFilter(byte[] destMACFromUserClassIDFilter) {
		this.destMACFromUserClassIDFilter = destMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

          A hexbinary string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply. A device is considered matching if the most recent DHCP User Class Identifier (via DHCP lease acquisition or renewal for DHCPv4) was equal to the specified value. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destMACFromUserClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withDestMACFromUserClassIDFilter(byte[] destMACFromUserClassIDFilter) {
		this.destMACFromUserClassIDFilter = destMACFromUserClassIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestMACFromUserClassIDFilterExclude() {
		return destMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACFromUserClassIDFilterExclude the input value
	 */
	public void  setDestMACFromUserClassIDFilterExclude(Boolean destMACFromUserClassIDFilterExclude) {
		this.destMACFromUserClassIDFilterExclude = destMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

          If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 2.0
	 * @param destMACFromUserClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACFromUserClassIDFilterExclude(Boolean destMACFromUserClassIDFilterExclude) {
		this.destMACFromUserClassIDFilterExclude = destMACFromUserClassIDFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public IPAddress getDestIP() {
		return destIP;
	}

	/**
	 * Set the classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param destIP the input value
	 */
	public void  setDestIP(IPAddress destIP) {
		this.destIP = destIP;
	}

	/**
	 * Set the classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param destIP the input value
	 * @return this instance
	 */
	public Filter withDestIP(IPAddress destIP) {
		this.destIP = destIP;
		return this;
	}

	/**
	 * Get the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 * @return the value
	 */
	public IPPrefix getDestMask() {
		return destMask;
	}

	/**
	 * Set the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 * @param destMask the input value
	 */
	public void  setDestMask(IPPrefix destMask) {
		this.destMask = destMask;
	}

	/**
	 * Set the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 * @param destMask the input value
	 * @return this instance
	 */
	public Filter withDestMask(IPPrefix destMask) {
		this.destMask = destMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isDestIPExclude() {
		return destIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.6
	 * @param destIPExclude the input value
	 */
	public void  setDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.6
	 * @param destIPExclude the input value
	 * @return this instance
	 */
	public Filter withDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Source IP address. {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public IPAddress getSourceIP() {
		return sourceIP;
	}

	/**
	 * Set the classification criterion.

          Source IP address. {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param sourceIP the input value
	 */
	public void  setSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
	}

	/**
	 * Set the classification criterion.

          Source IP address. {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param sourceIP the input value
	 * @return this instance
	 */
	public Filter withSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
		return this;
	}

	/**
	 * Get the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be an empty string (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 * @return the value
	 */
	public IPPrefix getSourceMask() {
		return sourceMask;
	}

	/**
	 * Set the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be an empty string (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 * @param sourceMask the input value
	 */
	public void  setSourceMask(IPPrefix sourceMask) {
		this.sourceMask = sourceMask;
	}

	/**
	 * Set the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be an empty string (and, if specified, MUST be ignored).
	 *
	 * @since 2.6
	 * @param sourceMask the input value
	 * @return this instance
	 */
	public Filter withSourceMask(IPPrefix sourceMask) {
		this.sourceMask = sourceMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isSourceIPExclude() {
		return sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.6
	 * @param sourceIPExclude the input value
	 */
	public void  setSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.6
	 * @param sourceIPExclude the input value
	 * @return this instance
	 */
	public Filter withSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * Set the classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param protocol the input value
	 */
	public void  setProtocol(Integer protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param protocol the input value
	 * @return this instance
	 */
	public Filter withProtocol(Integer protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isProtocolExclude() {
		return protocolExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.6
	 * @param protocolExclude the input value
	 */
	public void  setProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.6
	 * @param protocolExclude the input value
	 * @return this instance
	 */
	public Filter withProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getDestPort() {
		return destPort;
	}

	/**
	 * Set the classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param destPort the input value
	 */
	public void  setDestPort(Integer destPort) {
		this.destPort = destPort;
	}

	/**
	 * Set the classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param destPort the input value
	 * @return this instance
	 */
	public Filter withDestPort(Integer destPort) {
		this.destPort = destPort;
		return this;
	}

	/**
	 * Get the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getDestPortRangeMax() {
		return destPortRangeMax;
	}

	/**
	 * Set the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 * @param destPortRangeMax the input value
	 */
	public void  setDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
	}

	/**
	 * Set the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 * @param destPortRangeMax the input value
	 * @return this instance
	 */
	public Filter withDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isDestPortExclude() {
		return destPortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 * @param destPortExclude the input value
	 */
	public void  setDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 * @param destPortExclude the input value
	 * @return this instance
	 */
	public Filter withDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getSourcePort() {
		return sourcePort;
	}

	/**
	 * Set the classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param sourcePort the input value
	 */
	public void  setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
	}

	/**
	 * Set the classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.6
	 * @param sourcePort the input value
	 * @return this instance
	 */
	public Filter withSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		return this;
	}

	/**
	 * Get the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to SourcePort.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Integer getSourcePortRangeMax() {
		return sourcePortRangeMax;
	}

	/**
	 * Set the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to SourcePort.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 * @param sourcePortRangeMax the input value
	 */
	public void  setSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
	}

	/**
	 * Set the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to SourcePort.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.6
	 * @param sourcePortRangeMax the input value
	 * @return this instance
	 */
	public Filter withSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isSourcePortExclude() {
		return sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 * @param sourcePortExclude the input value
	 */
	public void  setSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.6
	 * @param sourcePortExclude the input value
	 * @return this instance
	 */
	public Filter withSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
		return this;
	}

	//</editor-fold>

}