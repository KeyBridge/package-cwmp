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
package org.broadbandforum.tr098.internetgatewaydevice.layer2bridging;

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
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.

For both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# If the Bridge Port table is not supported, it implicitly specifies the Bridge interfaces (in collaboration with the Marking table).

# It specifies destination MAC address classification rules.

For an 802.1Q Bridge, this table is also used for the following:

# For each VLAN ID, it specifies the interfaces that are in the VLAN's Member Set.

# If the Bridge Port table is not supported, it specifies the Port VLAN ID (PVID) for each interface.

This table also supports several concepts that are not covered by either 802.1D or 802.1Q:

# It allows a given packet to be admitted to multiple Bridges.

# It supports Ethertype and source MAC address classification rules.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.Filter.{i}.")
@XmlRootElement(name = "Filter")
@XmlType(name = "InternetGatewayDevice.Layer2Bridging.Filter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Filter {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Unique key for each Filter table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FilterKey")
	public Long filterKey;
	/**
	 * Enables or disables this Filter table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FilterEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean filterEnable = false;
	/**
	 * The status of this Filter table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

If the Bridge Port table is supported, but none of its entries correspond to {{param|FilterInterface}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FilterStatus")
	public String filterStatus = "Disabled";
	/**
	 * The ''BridgeKey'' value of the ''Bridge'' table entry associated with this Filter.  A value of -1 indicates the Filter table entry is not associated with a Bridge (and has no effect).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FilterBridgeReference")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer filterBridgeReference = -1;
	/**
	 * Whether or not the Filter definition is exclusive of all others.  And if the entry is exclusive, order of precedence.

A value of 1 or greater indicates an Exclusive Filter, where the value 1 indicates the first entry to be considered (highest precedence).

A value of 0 indicates a Non-Exclusive Filter (OPTIONAL).

For each packet, if the packet matches any Exclusive Filters, the packet is assigned to the Bridge associated with the highest precedence Exclusive Filter to which it matches (lowest {{param}} value).

If and only if the packet does not match any Exclusive Filters, the packet is assigned to all Bridges associated with each Non-Exclusive Filter for which it matches the defining criteria.

If a packet matches no Filter, it is discarded.

When the {{param}} is set to match that of an existing Exclusive Filter (1 or greater), the value for the existing entry and all higher numbered entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion or change in {{param}} of an Exclusive Filter causes {{param}} values of other Exclusive Filters (values 1 or greater) to be compacted.

Note that the use of Exclusive Filters to associate a layer 3 router interface with LAN and/or WAN interfaces via a Bridge entry overrides and updates the association between layer 3 and layer 2 objects implied by the ''InternetGatewayDevice'' object hierarchy.

Support for Non-Exclusive Filter entries, i.e. entries with an {{param}} value of 0, is OPTIONAL because 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} do not consider the case of a packet potentially being admitted to more than one bridge.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ExclusivityOrder")
	@CWMPParameter(access = "readWrite")
	public Long exclusivityOrder = 0L;
	/**
	 * The interface or interfaces associated with this Filter table entry.  The bridge corresponding to this Filter table entry is defined to admit packets on ingress to the bridge from the specified interfaces that meet all of the criteria specified in the Filter table entry.  The following values are defined.

* To associate this Filter with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Filter is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''LANInterfaces'' indicates that this Filter is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''WANInterfaces'' indicates that this Filter is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

{{empty}} indicates the Filter table entry is not associated with any interface (and has no effect)
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FilterInterface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String filterInterface;
	/**
	 * The 802.1Q {{bibref|802.1Q-2005}} VLAN ID associated with this Filter table entry.

A value of -1 indicates that the default VLAN ID for the Bridge MUST be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Filter table entry).

For an 802.1Q bridge, the value of this parameter MUST NOT be 0, and it is interpreted as follows  (more than one condition can apply, e.g. a single Filter table entry might both add an interface to a VLAN's Member Set, and define a classification rule).

# If the Bridge Port table is not supported, it is a candidate to be the 802.1Q Port VLAN ID (PVID) for the interface associated with this Filter.  Where there is more than one such candidate for a given interface, the PVID MUST be selected according to the {{param|ExclusivityOrder}} precedence rules.

# The interface associated with this Filter is added to the VLAN's 802.1Q Member Set.

# If a classification parameter, e.g. {{param|DestMACAddressFilterList}}, is specified, a classification rule for this VLAN ID is added.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be 0.  This is most easily achieved by allowing this parameter to retain its default value of -1 and relying on the fact that the default VLAN ID for an 802.1D bridge will always be 0.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VLANIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 4094)
	public Integer vlaNIDFilter = -1;
	/**
	 * 802.1Q {{bibref|802.1Q-2005}} Acceptable Frame Types criterion.

This parameter is DEPRECATED, because it only partly models 802.1Q Acceptable Frame Types (and Ingress Filtering).  The Bridge Port table SHOULD be used instead and, if supported, MUST take precedence over this parameter.

If {{true}}, the Bridge admits only packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets.

If {{false}}, the Bridge admits both packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets, and any Untagged or PriorityOnly packets.  All Untagged or PriorityOnly packets are associated on ingress with the interface's Port VLAN ID (PVID).

See the description of {{param|VLANIDFilter}} for an explanation of how the Member Set and PVID are determined.

If more than one Filter table entry is associated with a given interface, the value of {{param}} MUST be the same for all such entries.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AdmitOnlyVLANTagged")
	@CWMPParameter(access = "readWrite")
	public Boolean admitOnlyVLANTagged = false;
	/**
	 * Classification criterion.

{{list|each representing an Ethertype value}}

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthertypeFilterList")
	@CWMPParameter(access = "readWrite")
	public Long ethertypeFilterList;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthertypeFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ethertypeFilterExclude = true;
	/**
	 * Classification criterion.

{{list|each representing a MAC Address}}

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACAddressFilterList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> sourceMACAddressFilterList;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACAddressFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACAddressFilterExclude = true;
	/**
	 * Classification criterion.

{{list|each representing a MAC Address}}

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACAddressFilterList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> destMACAddressFilterList;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACAddressFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACAddressFilterExclude = true;
	/**
	 * Classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in SourceMACFromVendorClassIDMode.  Case sensitive.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACFromVendorClassIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sourceMACFromVendorClassIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If the {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACFromVendorClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACFromVendorClassIDFilterExclude = true;
	/**
	 * {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SourceMACFromVendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String sourceMACFromVendorClassIDMode = "Exact";
	/**
	 * Classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}.  Case sensitive.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACFromVendorClassIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destMACFromVendorClassIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If the {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACFromVendorClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACFromVendorClassIDFilterExclude = true;
	/**
	 * {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DestMACFromVendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String destMACFromVendorClassIDMode = "Exact";
	/**
	 * Classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACFromClientIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sourceMACFromClientIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACFromClientIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACFromClientIDFilterExclude = true;
	/**
	 * Classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACFromClientIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destMACFromClientIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACFromClientIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACFromClientIDFilterExclude = true;
	/**
	 * Classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACFromUserClassIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sourceMACFromUserClassIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACFromUserClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACFromUserClassIDFilterExclude = true;
	/**
	 * Classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACFromUserClassIDFilter")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destMACFromUserClassIDFilter;
	/**
	 * If {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACFromUserClassIDFilterExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACFromUserClassIDFilterExclude = true;

	public Filter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public Filter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the unique key for each Filter table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getFilterKey() {
		return filterKey;
	}

	/**
	 * Set the unique key for each Filter table entry.
	 *
	 * @since 1.1
	 * @param filterKey the input value
	 */
	public void  setFilterKey(Long filterKey) {
		this.filterKey = filterKey;
	}

	/**
	 * Set the unique key for each Filter table entry.
	 *
	 * @since 1.1
	 * @param filterKey the input value
	 * @return this instance
	 */
	public Filter withFilterKey(Long filterKey) {
		this.filterKey = filterKey;
		return this;
	}

	/**
	 * Get the enables or disables this Filter table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isFilterEnable() {
		return filterEnable;
	}

	/**
	 * Set the enables or disables this Filter table entry.
	 *
	 * @since 1.1
	 * @param filterEnable the input value
	 */
	public void  setFilterEnable(Boolean filterEnable) {
		this.filterEnable = filterEnable;
	}

	/**
	 * Set the enables or disables this Filter table entry.
	 *
	 * @since 1.1
	 * @param filterEnable the input value
	 * @return this instance
	 */
	public Filter withFilterEnable(Boolean filterEnable) {
		this.filterEnable = filterEnable;
		return this;
	}

	/**
	 * Get the status of this Filter table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

If the Bridge Port table is supported, but none of its entries correspond to {{param|FilterInterface}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getFilterStatus() {
		return filterStatus;
	}

	/**
	 * Set the status of this Filter table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

If the Bridge Port table is supported, but none of its entries correspond to {{param|FilterInterface}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 1.1
	 * @param filterStatus the input value
	 */
	public void  setFilterStatus(String filterStatus) {
		this.filterStatus = filterStatus;
	}

	/**
	 * Set the status of this Filter table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

If the Bridge Port table is supported, but none of its entries correspond to {{param|FilterInterface}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.

If the Bridge VLAN table is supported, but none of its entries correspond to {{param|VLANIDFilter}}, or if such an entry exists but is disabled, {{param}} MUST NOT indicate {{enum|Enabled}}.
	 *
	 * @since 1.1
	 * @param filterStatus the input value
	 * @return this instance
	 */
	public Filter withFilterStatus(String filterStatus) {
		this.filterStatus = filterStatus;
		return this;
	}

	/**
	 * Get the ''BridgeKey'' value of the ''Bridge'' table entry associated with this Filter.  A value of -1 indicates the Filter table entry is not associated with a Bridge (and has no effect).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getFilterBridgeReference() {
		return filterBridgeReference;
	}

	/**
	 * Set the ''BridgeKey'' value of the ''Bridge'' table entry associated with this Filter.  A value of -1 indicates the Filter table entry is not associated with a Bridge (and has no effect).
	 *
	 * @since 1.1
	 * @param filterBridgeReference the input value
	 */
	public void  setFilterBridgeReference(Integer filterBridgeReference) {
		this.filterBridgeReference = filterBridgeReference;
	}

	/**
	 * Set the ''BridgeKey'' value of the ''Bridge'' table entry associated with this Filter.  A value of -1 indicates the Filter table entry is not associated with a Bridge (and has no effect).
	 *
	 * @since 1.1
	 * @param filterBridgeReference the input value
	 * @return this instance
	 */
	public Filter withFilterBridgeReference(Integer filterBridgeReference) {
		this.filterBridgeReference = filterBridgeReference;
		return this;
	}

	/**
	 * Get the whether or not the Filter definition is exclusive of all others.  And if the entry is exclusive, order of precedence.

A value of 1 or greater indicates an Exclusive Filter, where the value 1 indicates the first entry to be considered (highest precedence).

A value of 0 indicates a Non-Exclusive Filter (OPTIONAL).

For each packet, if the packet matches any Exclusive Filters, the packet is assigned to the Bridge associated with the highest precedence Exclusive Filter to which it matches (lowest {{param}} value).

If and only if the packet does not match any Exclusive Filters, the packet is assigned to all Bridges associated with each Non-Exclusive Filter for which it matches the defining criteria.

If a packet matches no Filter, it is discarded.

When the {{param}} is set to match that of an existing Exclusive Filter (1 or greater), the value for the existing entry and all higher numbered entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion or change in {{param}} of an Exclusive Filter causes {{param}} values of other Exclusive Filters (values 1 or greater) to be compacted.

Note that the use of Exclusive Filters to associate a layer 3 router interface with LAN and/or WAN interfaces via a Bridge entry overrides and updates the association between layer 3 and layer 2 objects implied by the ''InternetGatewayDevice'' object hierarchy.

Support for Non-Exclusive Filter entries, i.e. entries with an {{param}} value of 0, is OPTIONAL because 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} do not consider the case of a packet potentially being admitted to more than one bridge.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getExclusivityOrder() {
		return exclusivityOrder;
	}

	/**
	 * Set the whether or not the Filter definition is exclusive of all others.  And if the entry is exclusive, order of precedence.

A value of 1 or greater indicates an Exclusive Filter, where the value 1 indicates the first entry to be considered (highest precedence).

A value of 0 indicates a Non-Exclusive Filter (OPTIONAL).

For each packet, if the packet matches any Exclusive Filters, the packet is assigned to the Bridge associated with the highest precedence Exclusive Filter to which it matches (lowest {{param}} value).

If and only if the packet does not match any Exclusive Filters, the packet is assigned to all Bridges associated with each Non-Exclusive Filter for which it matches the defining criteria.

If a packet matches no Filter, it is discarded.

When the {{param}} is set to match that of an existing Exclusive Filter (1 or greater), the value for the existing entry and all higher numbered entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion or change in {{param}} of an Exclusive Filter causes {{param}} values of other Exclusive Filters (values 1 or greater) to be compacted.

Note that the use of Exclusive Filters to associate a layer 3 router interface with LAN and/or WAN interfaces via a Bridge entry overrides and updates the association between layer 3 and layer 2 objects implied by the ''InternetGatewayDevice'' object hierarchy.

Support for Non-Exclusive Filter entries, i.e. entries with an {{param}} value of 0, is OPTIONAL because 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} do not consider the case of a packet potentially being admitted to more than one bridge.
	 *
	 * @since 1.1
	 * @param exclusivityOrder the input value
	 */
	public void  setExclusivityOrder(Long exclusivityOrder) {
		this.exclusivityOrder = exclusivityOrder;
	}

	/**
	 * Set the whether or not the Filter definition is exclusive of all others.  And if the entry is exclusive, order of precedence.

A value of 1 or greater indicates an Exclusive Filter, where the value 1 indicates the first entry to be considered (highest precedence).

A value of 0 indicates a Non-Exclusive Filter (OPTIONAL).

For each packet, if the packet matches any Exclusive Filters, the packet is assigned to the Bridge associated with the highest precedence Exclusive Filter to which it matches (lowest {{param}} value).

If and only if the packet does not match any Exclusive Filters, the packet is assigned to all Bridges associated with each Non-Exclusive Filter for which it matches the defining criteria.

If a packet matches no Filter, it is discarded.

When the {{param}} is set to match that of an existing Exclusive Filter (1 or greater), the value for the existing entry and all higher numbered entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion or change in {{param}} of an Exclusive Filter causes {{param}} values of other Exclusive Filters (values 1 or greater) to be compacted.

Note that the use of Exclusive Filters to associate a layer 3 router interface with LAN and/or WAN interfaces via a Bridge entry overrides and updates the association between layer 3 and layer 2 objects implied by the ''InternetGatewayDevice'' object hierarchy.

Support for Non-Exclusive Filter entries, i.e. entries with an {{param}} value of 0, is OPTIONAL because 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} do not consider the case of a packet potentially being admitted to more than one bridge.
	 *
	 * @since 1.1
	 * @param exclusivityOrder the input value
	 * @return this instance
	 */
	public Filter withExclusivityOrder(Long exclusivityOrder) {
		this.exclusivityOrder = exclusivityOrder;
		return this;
	}

	/**
	 * Get the interface or interfaces associated with this Filter table entry.  The bridge corresponding to this Filter table entry is defined to admit packets on ingress to the bridge from the specified interfaces that meet all of the criteria specified in the Filter table entry.  The following values are defined.

* To associate this Filter with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Filter is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''LANInterfaces'' indicates that this Filter is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''WANInterfaces'' indicates that this Filter is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

{{empty}} indicates the Filter table entry is not associated with any interface (and has no effect)
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getFilterInterface() {
		return filterInterface;
	}

	/**
	 * Set the interface or interfaces associated with this Filter table entry.  The bridge corresponding to this Filter table entry is defined to admit packets on ingress to the bridge from the specified interfaces that meet all of the criteria specified in the Filter table entry.  The following values are defined.

* To associate this Filter with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Filter is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''LANInterfaces'' indicates that this Filter is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''WANInterfaces'' indicates that this Filter is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

{{empty}} indicates the Filter table entry is not associated with any interface (and has no effect)
	 *
	 * @since 1.1
	 * @param filterInterface the input value
	 */
	public void  setFilterInterface(String filterInterface) {
		this.filterInterface = filterInterface;
	}

	/**
	 * Set the interface or interfaces associated with this Filter table entry.  The bridge corresponding to this Filter table entry is defined to admit packets on ingress to the bridge from the specified interfaces that meet all of the criteria specified in the Filter table entry.  The following values are defined.

* To associate this Filter with a single interface listed in the ''AvailableInterface'' table, the {{param}} value is set to the value of the corresponding ''AvailableInterfaceKey''.

* ''AllInterfaces'' indicates that this Filter is associated with all LAN and WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'' or ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''LANInterfaces'' indicates that this Filter is associated with all LAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''LANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

* ''WANInterfaces'' indicates that this Filter is associated with all WAN interfaces listed in the ''AvailableInterface'' table (all entries of ''InterfaceType'' ''WANInterface'').  This value is DEPRECATED because of the configuration complexity it requires.

{{empty}} indicates the Filter table entry is not associated with any interface (and has no effect)
	 *
	 * @since 1.1
	 * @param filterInterface the input value
	 * @return this instance
	 */
	public Filter withFilterInterface(String filterInterface) {
		this.filterInterface = filterInterface;
		return this;
	}

	/**
	 * Get the 802.1Q {{bibref|802.1Q-2005}} VLAN ID associated with this Filter table entry.

A value of -1 indicates that the default VLAN ID for the Bridge MUST be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Filter table entry).

For an 802.1Q bridge, the value of this parameter MUST NOT be 0, and it is interpreted as follows  (more than one condition can apply, e.g. a single Filter table entry might both add an interface to a VLAN's Member Set, and define a classification rule).

# If the Bridge Port table is not supported, it is a candidate to be the 802.1Q Port VLAN ID (PVID) for the interface associated with this Filter.  Where there is more than one such candidate for a given interface, the PVID MUST be selected according to the {{param|ExclusivityOrder}} precedence rules.

# The interface associated with this Filter is added to the VLAN's 802.1Q Member Set.

# If a classification parameter, e.g. {{param|DestMACAddressFilterList}}, is specified, a classification rule for this VLAN ID is added.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be 0.  This is most easily achieved by allowing this parameter to retain its default value of -1 and relying on the fact that the default VLAN ID for an 802.1D bridge will always be 0.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getVlaNIDFilter() {
		return vlaNIDFilter;
	}

	/**
	 * Set the 802.1Q {{bibref|802.1Q-2005}} VLAN ID associated with this Filter table entry.

A value of -1 indicates that the default VLAN ID for the Bridge MUST be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Filter table entry).

For an 802.1Q bridge, the value of this parameter MUST NOT be 0, and it is interpreted as follows  (more than one condition can apply, e.g. a single Filter table entry might both add an interface to a VLAN's Member Set, and define a classification rule).

# If the Bridge Port table is not supported, it is a candidate to be the 802.1Q Port VLAN ID (PVID) for the interface associated with this Filter.  Where there is more than one such candidate for a given interface, the PVID MUST be selected according to the {{param|ExclusivityOrder}} precedence rules.

# The interface associated with this Filter is added to the VLAN's 802.1Q Member Set.

# If a classification parameter, e.g. {{param|DestMACAddressFilterList}}, is specified, a classification rule for this VLAN ID is added.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be 0.  This is most easily achieved by allowing this parameter to retain its default value of -1 and relying on the fact that the default VLAN ID for an 802.1D bridge will always be 0.
	 *
	 * @since 1.1
	 * @param vlaNIDFilter the input value
	 */
	public void  setVlaNIDFilter(Integer vlaNIDFilter) {
		this.vlaNIDFilter = vlaNIDFilter;
	}

	/**
	 * Set the 802.1Q {{bibref|802.1Q-2005}} VLAN ID associated with this Filter table entry.

A value of -1 indicates that the default VLAN ID for the Bridge MUST be used instead (as specified by {{param|InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLANID}} for the Bridge table entry associated with this Filter table entry).

For an 802.1Q bridge, the value of this parameter MUST NOT be 0, and it is interpreted as follows  (more than one condition can apply, e.g. a single Filter table entry might both add an interface to a VLAN's Member Set, and define a classification rule).

# If the Bridge Port table is not supported, it is a candidate to be the 802.1Q Port VLAN ID (PVID) for the interface associated with this Filter.  Where there is more than one such candidate for a given interface, the PVID MUST be selected according to the {{param|ExclusivityOrder}} precedence rules.

# The interface associated with this Filter is added to the VLAN's 802.1Q Member Set.

# If a classification parameter, e.g. {{param|DestMACAddressFilterList}}, is specified, a classification rule for this VLAN ID is added.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the VLAN ID MUST be 0.  This is most easily achieved by allowing this parameter to retain its default value of -1 and relying on the fact that the default VLAN ID for an 802.1D bridge will always be 0.
	 *
	 * @since 1.1
	 * @param vlaNIDFilter the input value
	 * @return this instance
	 */
	public Filter withVlaNIDFilter(Integer vlaNIDFilter) {
		this.vlaNIDFilter = vlaNIDFilter;
		return this;
	}

	/**
	 * Get the 802.1Q {{bibref|802.1Q-2005}} Acceptable Frame Types criterion.

This parameter is DEPRECATED, because it only partly models 802.1Q Acceptable Frame Types (and Ingress Filtering).  The Bridge Port table SHOULD be used instead and, if supported, MUST take precedence over this parameter.

If {{true}}, the Bridge admits only packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets.

If {{false}}, the Bridge admits both packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets, and any Untagged or PriorityOnly packets.  All Untagged or PriorityOnly packets are associated on ingress with the interface's Port VLAN ID (PVID).

See the description of {{param|VLANIDFilter}} for an explanation of how the Member Set and PVID are determined.

If more than one Filter table entry is associated with a given interface, the value of {{param}} MUST be the same for all such entries.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isAdmitOnlyVLANTagged() {
		return admitOnlyVLANTagged;
	}

	/**
	 * Set the 802.1Q {{bibref|802.1Q-2005}} Acceptable Frame Types criterion.

This parameter is DEPRECATED, because it only partly models 802.1Q Acceptable Frame Types (and Ingress Filtering).  The Bridge Port table SHOULD be used instead and, if supported, MUST take precedence over this parameter.

If {{true}}, the Bridge admits only packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets.

If {{false}}, the Bridge admits both packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets, and any Untagged or PriorityOnly packets.  All Untagged or PriorityOnly packets are associated on ingress with the interface's Port VLAN ID (PVID).

See the description of {{param|VLANIDFilter}} for an explanation of how the Member Set and PVID are determined.

If more than one Filter table entry is associated with a given interface, the value of {{param}} MUST be the same for all such entries.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.1
	 * @param admitOnlyVLANTagged the input value
	 */
	public void  setAdmitOnlyVLANTagged(Boolean admitOnlyVLANTagged) {
		this.admitOnlyVLANTagged = admitOnlyVLANTagged;
	}

	/**
	 * Set the 802.1Q {{bibref|802.1Q-2005}} Acceptable Frame Types criterion.

This parameter is DEPRECATED, because it only partly models 802.1Q Acceptable Frame Types (and Ingress Filtering).  The Bridge Port table SHOULD be used instead and, if supported, MUST take precedence over this parameter.

If {{true}}, the Bridge admits only packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets.

If {{false}}, the Bridge admits both packets tagged with VLAN IDs that include the ingress interface in their 802.1Q Member Sets, and any Untagged or PriorityOnly packets.  All Untagged or PriorityOnly packets are associated on ingress with the interface's Port VLAN ID (PVID).

See the description of {{param|VLANIDFilter}} for an explanation of how the Member Set and PVID are determined.

If more than one Filter table entry is associated with a given interface, the value of {{param}} MUST be the same for all such entries.

For an 802.1D {{bibref|802.1D-2004}} Bridge, which has no concept of VLANs, the value of this parameter MUST be {{false}}.
	 *
	 * @since 1.1
	 * @param admitOnlyVLANTagged the input value
	 * @return this instance
	 */
	public Filter withAdmitOnlyVLANTagged(Boolean admitOnlyVLANTagged) {
		this.admitOnlyVLANTagged = admitOnlyVLANTagged;
		return this;
	}

	/**
	 * Get the classification criterion.

{{list|each representing an Ethertype value}}

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getEthertypeFilterList() {
		return ethertypeFilterList;
	}

	/**
	 * Set the classification criterion.

{{list|each representing an Ethertype value}}

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
	 * @param ethertypeFilterList the input value
	 */
	public void  setEthertypeFilterList(Long ethertypeFilterList) {
		this.ethertypeFilterList = ethertypeFilterList;
	}

	/**
	 * Set the classification criterion.

{{list|each representing an Ethertype value}}

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
	 * @param ethertypeFilterList the input value
	 * @return this instance
	 */
	public Filter withEthertypeFilterList(Long ethertypeFilterList) {
		this.ethertypeFilterList = ethertypeFilterList;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEthertypeFilterExclude() {
		return ethertypeFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
	 * @param ethertypeFilterExclude the input value
	 */
	public void  setEthertypeFilterExclude(Boolean ethertypeFilterExclude) {
		this.ethertypeFilterExclude = ethertypeFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit only those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge is defined to admit all packets except those packets that match one of the {{param|EthertypeFilterList}} entries (in either the Ethernet or SNAP Type header).  If the {{param|EthertypeFilterList}} is empty, packets are admitted regardless of Ethertype.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on Ethertype.
	 *
	 * @since 1.1
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

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getSourceMACAddressFilterList() {
		if (this.sourceMACAddressFilterList == null){ this.sourceMACAddressFilterList=new ArrayList<>();}
		return sourceMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

{{list|each representing a MAC Address}}

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACAddressFilterList the input value
	 */
	public void  setSourceMACAddressFilterList(Collection<String> sourceMACAddressFilterList) {
		this.sourceMACAddressFilterList = sourceMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

{{list|each representing a MAC Address}}

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public Filter withSourceMACAddressFilterList(String string) {
		getSourceMACAddressFilterList().add(string);
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceMACAddressFilterExclude() {
		return sourceMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACAddressFilterExclude the input value
	 */
	public void  setSourceMACAddressFilterExclude(Boolean sourceMACAddressFilterExclude) {
		this.sourceMACAddressFilterExclude = sourceMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches one of the {{param|SourceMACAddressFilterList}} entries.  If the {{param|SourceMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACAddressFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACAddressFilterExclude(Boolean sourceMACAddressFilterExclude) {
		this.sourceMACAddressFilterExclude = sourceMACAddressFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

{{list|each representing a MAC Address}}

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getDestMACAddressFilterList() {
		if (this.destMACAddressFilterList == null){ this.destMACAddressFilterList=new ArrayList<>();}
		return destMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

{{list|each representing a MAC Address}}

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 1.1
	 * @param destMACAddressFilterList the input value
	 */
	public void  setDestMACAddressFilterList(Collection<String> destMACAddressFilterList) {
		this.destMACAddressFilterList = destMACAddressFilterList;
	}

	/**
	 * Set the classification criterion.

{{list|each representing a MAC Address}}

Each list entry MAY optionally specify a bit-mask, where matching of a packet's MAC address is only to be done for bit positions set to one in the mask.  If no mask is specified, all bits of the MAC Address are to be used for matching.

For example, the list might be: ''01:02:03:04:05:06, 1:22:33:00:00:00/FF:FF:FF:00:00:00, 88:77:66:55:44:33''
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public Filter withDestMACAddressFilterList(String string) {
		getDestMACAddressFilterList().add(string);
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestMACAddressFilterExclude() {
		return destMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACAddressFilterExclude the input value
	 */
	public void  setDestMACAddressFilterExclude(Boolean destMACAddressFilterExclude) {
		this.destMACAddressFilterExclude = destMACAddressFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches one of the {{param|DestMACAddressFilterList}} entries.  If the {{param|DestMACAddressFilterList}} is empty, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACAddressFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACAddressFilterExclude(Boolean destMACAddressFilterExclude) {
		this.destMACAddressFilterExclude = destMACAddressFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in SourceMACFromVendorClassIDMode.  Case sensitive.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getSourceMACFromVendorClassIDFilter() {
		return sourceMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in SourceMACFromVendorClassIDMode.  Case sensitive.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromVendorClassIDFilter the input value
	 */
	public void  setSourceMACFromVendorClassIDFilter(String sourceMACFromVendorClassIDFilter) {
		this.sourceMACFromVendorClassIDFilter = sourceMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in SourceMACFromVendorClassIDMode.  Case sensitive.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromVendorClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromVendorClassIDFilter(String sourceMACFromVendorClassIDFilter) {
		this.sourceMACFromVendorClassIDFilter = sourceMACFromVendorClassIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If the {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceMACFromVendorClassIDFilterExclude() {
		return sourceMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If the {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromVendorClassIDFilterExclude the input value
	 */
	public void  setSourceMACFromVendorClassIDFilterExclude(Boolean sourceMACFromVendorClassIDFilterExclude) {
		this.sourceMACFromVendorClassIDFilterExclude = sourceMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromVendorClassIDFilter}}.  If the {{param|SourceMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromVendorClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromVendorClassIDFilterExclude(Boolean sourceMACFromVendorClassIDFilterExclude) {
		this.sourceMACFromVendorClassIDFilterExclude = sourceMACFromVendorClassIDFilterExclude;
		return this;
	}

	/**
	 * Get the {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getSourceMACFromVendorClassIDMode() {
		return sourceMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.4
	 * @param sourceMACFromVendorClassIDMode the input value
	 */
	public void  setSourceMACFromVendorClassIDMode(String sourceMACFromVendorClassIDMode) {
		this.sourceMACFromVendorClassIDMode = sourceMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|SourceMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|SourceMACFromVendorClassIDFilter}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.4
	 * @param sourceMACFromVendorClassIDMode the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromVendorClassIDMode(String sourceMACFromVendorClassIDMode) {
		this.sourceMACFromVendorClassIDMode = sourceMACFromVendorClassIDMode;
		return this;
	}

	/**
	 * Get the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}.  Case sensitive.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDestMACFromVendorClassIDFilter() {
		return destMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}.  Case sensitive.
	 *
	 * @since 1.1
	 * @param destMACFromVendorClassIDFilter the input value
	 */
	public void  setDestMACFromVendorClassIDFilter(String destMACFromVendorClassIDFilter) {
		this.destMACFromVendorClassIDFilter = destMACFromVendorClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Vendor Class Identifier (Option 60 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal matches the specified value according to the match criterion in {{param|DestMACFromVendorClassIDMode}}.  Case sensitive.
	 *
	 * @since 1.1
	 * @param destMACFromVendorClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withDestMACFromVendorClassIDFilter(String destMACFromVendorClassIDFilter) {
		this.destMACFromVendorClassIDFilter = destMACFromVendorClassIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If the {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestMACFromVendorClassIDFilterExclude() {
		return destMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If the {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACFromVendorClassIDFilterExclude the input value
	 */
	public void  setDestMACFromVendorClassIDFilterExclude(Boolean destMACFromVendorClassIDFilterExclude) {
		this.destMACFromVendorClassIDFilterExclude = destMACFromVendorClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromVendorClassIDFilter}}.  If the {{param|DestMACFromVendorClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACFromVendorClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACFromVendorClassIDFilterExclude(Boolean destMACFromVendorClassIDFilterExclude) {
		this.destMACFromVendorClassIDFilterExclude = destMACFromVendorClassIDFilterExclude;
		return this;
	}

	/**
	 * Get the {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getDestMACFromVendorClassIDMode() {
		return destMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 * @param destMACFromVendorClassIDMode the input value
	 */
	public void  setDestMACFromVendorClassIDMode(String destMACFromVendorClassIDMode) {
		this.destMACFromVendorClassIDMode = destMACFromVendorClassIDMode;
	}

	/**
	 * Set the {{param|DestMACFromVendorClassIDFilter}} pattern match criterion.  {{enum}}

For example, if {{param|DestMACFromVendorClassIDFilter}} is ''Example'' then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 * @param destMACFromVendorClassIDMode the input value
	 * @return this instance
	 */
	public Filter withDestMACFromVendorClassIDMode(String destMACFromVendorClassIDMode) {
		this.destMACFromVendorClassIDMode = destMACFromVendorClassIDMode;
		return this;
	}

	/**
	 * Get the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getSourceMACFromClientIDFilter() {
		return sourceMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromClientIDFilter the input value
	 */
	public void  setSourceMACFromClientIDFilter(String sourceMACFromClientIDFilter) {
		this.sourceMACFromClientIDFilter = sourceMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromClientIDFilter the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromClientIDFilter(String sourceMACFromClientIDFilter) {
		this.sourceMACFromClientIDFilter = sourceMACFromClientIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceMACFromClientIDFilterExclude() {
		return sourceMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromClientIDFilterExclude the input value
	 */
	public void  setSourceMACFromClientIDFilterExclude(Boolean sourceMACFromClientIDFilterExclude) {
		this.sourceMACFromClientIDFilterExclude = sourceMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If {{param|SourceMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromClientIDFilter}}.  If the {{param|SourceMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromClientIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromClientIDFilterExclude(Boolean sourceMACFromClientIDFilterExclude) {
		this.sourceMACFromClientIDFilterExclude = sourceMACFromClientIDFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDestMACFromClientIDFilter() {
		return destMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.
	 *
	 * @since 1.1
	 * @param destMACFromClientIDFilter the input value
	 */
	public void  setDestMACFromClientIDFilter(String destMACFromClientIDFilter) {
		this.destMACFromClientIDFilter = destMACFromClientIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP Client Identifier (Option 61 as defined in RFC 2132 {{bibref|RFC2132}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.  The option value is binary, so an exact match is REQUIRED.
	 *
	 * @since 1.1
	 * @param destMACFromClientIDFilter the input value
	 * @return this instance
	 */
	public Filter withDestMACFromClientIDFilter(String destMACFromClientIDFilter) {
		this.destMACFromClientIDFilter = destMACFromClientIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestMACFromClientIDFilterExclude() {
		return destMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACFromClientIDFilterExclude the input value
	 */
	public void  setDestMACFromClientIDFilterExclude(Boolean destMACFromClientIDFilterExclude) {
		this.destMACFromClientIDFilterExclude = destMACFromClientIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If {{param|DestMACFromClientIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromClientIDFilter}}.  If the {{param|DestMACFromClientIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACFromClientIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACFromClientIDFilterExclude(Boolean destMACFromClientIDFilterExclude) {
		this.destMACFromClientIDFilterExclude = destMACFromClientIDFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getSourceMACFromUserClassIDFilter() {
		return sourceMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromUserClassIDFilter the input value
	 */
	public void  setSourceMACFromUserClassIDFilter(String sourceMACFromUserClassIDFilter) {
		this.sourceMACFromUserClassIDFilter = sourceMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromUserClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromUserClassIDFilter(String sourceMACFromUserClassIDFilter) {
		this.sourceMACFromUserClassIDFilter = sourceMACFromUserClassIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceMACFromUserClassIDFilterExclude() {
		return sourceMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromUserClassIDFilterExclude the input value
	 */
	public void  setSourceMACFromUserClassIDFilterExclude(Boolean sourceMACFromUserClassIDFilterExclude) {
		this.sourceMACFromUserClassIDFilterExclude = sourceMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose source MAC Address matches that of a LAN device previously identified as described in {{param|SourceMACFromUserClassIDFilter}}.  If the {{param|SourceMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.

Note that neither 802.1D {{bibref|802.1D-2004}} nor 802.1Q {{bibref|802.1Q-2005}} support classification based on source MAC address.
	 *
	 * @since 1.1
	 * @param sourceMACFromUserClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withSourceMACFromUserClassIDFilterExclude(Boolean sourceMACFromUserClassIDFilterExclude) {
		this.sourceMACFromUserClassIDFilterExclude = sourceMACFromUserClassIDFilterExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDestMACFromUserClassIDFilter() {
		return destMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.
	 *
	 * @since 1.1
	 * @param destMACFromUserClassIDFilter the input value
	 */
	public void  setDestMACFromUserClassIDFilter(String destMACFromUserClassIDFilter) {
		this.destMACFromUserClassIDFilter = destMACFromUserClassIDFilter;
	}

	/**
	 * Set the classification criterion.

A string used to identify one or more devices via DHCP for which MAC address filtering would subsequently apply.  A device is considered matching if its DHCP User Class Identifier (Option 77 as defined in RFC 3004 {{bibref|RFC3004}}) in the most recent DHCP lease acquisition or renewal was equal to the specified value.
	 *
	 * @since 1.1
	 * @param destMACFromUserClassIDFilter the input value
	 * @return this instance
	 */
	public Filter withDestMACFromUserClassIDFilter(String destMACFromUserClassIDFilter) {
		this.destMACFromUserClassIDFilter = destMACFromUserClassIDFilter;
		return this;
	}

	/**
	 * Get the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestMACFromUserClassIDFilterExclude() {
		return destMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACFromUserClassIDFilterExclude the input value
	 */
	public void  setDestMACFromUserClassIDFilterExclude(Boolean destMACFromUserClassIDFilterExclude) {
		this.destMACFromUserClassIDFilterExclude = destMACFromUserClassIDFilterExclude;
	}

	/**
	 * Set the if {{false}}, on ingress to the interfaces associated with this Filter, the Bridge admits only those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If {{param|DestMACFromUserClassIDFilter}} is {{empty}}, no packets are admitted.

If {{true}}, on ingress to the interfaces associated with this Filter, the Bridge admits all packets except those packets whose destination MAC Address matches that of a LAN device previously identified as described in {{param|DestMACFromUserClassIDFilter}}.  If the {{param|DestMACFromUserClassIDFilter}} is {{empty}}, packets are admitted regardless of MAC address.
	 *
	 * @since 1.1
	 * @param destMACFromUserClassIDFilterExclude the input value
	 * @return this instance
	 */
	public Filter withDestMACFromUserClassIDFilterExclude(Boolean destMACFromUserClassIDFilterExclude) {
		this.destMACFromUserClassIDFilterExclude = destMACFromUserClassIDFilterExclude;
		return this;
	}

	//</editor-fold>

}