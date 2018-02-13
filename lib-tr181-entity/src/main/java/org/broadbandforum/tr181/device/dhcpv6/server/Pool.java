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
package org.broadbandforum.tr181.device.dhcpv6.server;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv6Address;
import org.broadbandforum.tr181.device.dhcpv6.server.pool.Client;
import org.broadbandforum.tr181.device.dhcpv6.server.pool.Option;

	/**
	 * DHCPv6 server pool table.

        Each instance of this object defines a DHCPv6 server pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCPv6 options, and source address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack) then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Server.Pool.{i}.")
@XmlRootElement(name = "Device.DHCPv6.Server.Pool")
@XmlType(name = "Device.DHCPv6.Server.Pool")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pool {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCPv6 request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

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
	 * {{reference}} The IP Interface associated with the {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Client Identifier (Option 1) {{bibref|RFC3315|Section 22.2}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.

          Note: DHCPv6 Option 1 (DUID) is sometimes referred to as ''Client Identifier''.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DUID")
	@CWMPParameter(access = "readWrite")
	public byte[] duiD;
	/**
	 * If {{false}}, matching packets are those that match the {{param|DUID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|DUID}} entry, if specified.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DUIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean duiDExclude = false;
	/**
	 * Pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) {{bibref|RFC3315|Section 22.16}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "VendorClassID")
	@CWMPParameter(access = "readWrite")
	public byte[] vendorClassID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "VendorClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean vendorClassIDExclude = false;
	/**
	 * Pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 User Class Identifier (Option 15) {{bibref|RFC3315|Section 22.15}}.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "UserClassID")
	@CWMPParameter(access = "readWrite")
	public byte[] userClassID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "UserClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean userClassIDExclude = false;
	/**
	 * Pool association criterion.

          Source address (link-layer address) of DHCPv6 messages sent from the DHCPv6 client.  This criterion is only likely to be useful if this is a link-layer address.

          {{empty}} indicates this criterion is not used for serving.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceAddress")
	@CWMPParameter(access = "readWrite")
	public IPv6Address sourceAddress;
	/**
	 * Bit-mask for the source address, where matching of a packet's source address with the {{param|SourceAddress}} is only to be done for bit positions set to one in the mask.  A mask of {{empty}} indicates all bits of the {{param|SourceAddress}} are to be used.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceAddressMask")
	@CWMPParameter(access = "readWrite")
	public IPv6Address sourceAddressMask;
	/**
	 * If {{false}}, matching packets are those that match the (masked) {{param|SourceAddress}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|SourceAddress}} entry, if specified.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceAddressExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceAddressExclude = false;
	/**
	 * Enables or disables IANA offers.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IANAEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean ianAEnable;
	/**
	 * {{list}} {{reference}}

          Manually-configured prefixes from which IA_NA addresses will be assigned.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  All clients that request IA_NA and match filter criteria on this {{param|Interface}} MUST be offered IA_NA addresses from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) /64 prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IANAManualPrefixes")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> ianAManualPrefixes;
	/**
	 * {{list}} {{reference}}

          All prefixes from which IA_NA addresses will be assigned. This list can include:

          * Prefixes from {{param|IANAManualPrefixes}} that are used for IA_NA offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IANAPrefixes")
	@Size
	@XmlList
	public Collection<String> ianAPrefixes;
	/**
	 * Enables or disables IAPD offers.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IAPDEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean iapDEnable;
	/**
	 * {{list}} {{reference}}

          Manually-configured prefixes from which IA_PD prefixes will be derived.  This list can include:

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} associated with with the interface instance referenced by {{param|Interface}}.

          All clients that request IA_PD and match filter criteria on this {{param|Interface}} MUST be offered IA_PD prefixes derived from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IAPDManualPrefixes")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> iapDManualPrefixes;
	/**
	 * {{list}} {{reference}}

          All prefixes for which IA_PD prefixes will be assigned. This list can include:

          * Prefixes from {{param|IAPDManualPrefixes}} that are used for IA_PD offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IAPDPrefixes")
	@Size
	@XmlList
	public Collection<String> iapDPrefixes;
	/**
	 * The RECOMMENDED minimum number of bits to add to {{param|IAPDManualPrefixes}} or {{param|IAPDPrefixes}} in order to determine the length of prefixes that are offered in an IA_PD.  The device is responsible for ensuring that it does not delegate a prefix longer than /64.  The device can have additional logic that is used (in conjunction with this parameter) to determine the actual length of prefixes offered in an IA_PD.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IAPDAddLength")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public Long iapDAddLength;
	/**
	 * DHCPv6 client table.

        This table lists details of DHCPv6 clients that matched the filter criteria of this {{object|#}} entry.
	 */
	@XmlElementWrapper(name = "Clients")
	@XmlElement(name = "Client")
	public Collection<Client> clients;
	/**
	 * This object specifies the DHCPv6 options that MUST, if enabled, be offered to clients whose DHCPv6 requests are associated with this pool. If {{param|PassthroughClient}} is specified, and the referenced client has a value for a given option then the {{param|PassthroughClient}} option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.
	 */
	@XmlElementWrapper(name = "Options")
	@XmlElement(name = "Option")
	@CWMPParameter(access = "readWrite")
	public Collection<Option> options;

	public Pool() {
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
	public Pool withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this entry.  {{enum}}

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
	 * Set the status of this entry.  {{enum}}

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
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public Pool withStatus(String status) {
		this.status = status;
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
	public Pool withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCPv6 request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

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
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCPv6 request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

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
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCPv6 request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.2
	 * @param order the input value
	 * @return this instance
	 */
	public Pool withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get the {{reference}} The IP Interface associated with the {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the {{object}} entry.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the {{object}} entry.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 * @return this instance
	 */
	public Pool with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Client Identifier (Option 1) {{bibref|RFC3315|Section 22.2}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.

          Note: DHCPv6 Option 1 (DUID) is sometimes referred to as ''Client Identifier''.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getDuiD() {
		return duiD;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Client Identifier (Option 1) {{bibref|RFC3315|Section 22.2}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.

          Note: DHCPv6 Option 1 (DUID) is sometimes referred to as ''Client Identifier''.
	 *
	 * @since 2.2
	 * @param duiD the input value
	 */
	public void  setDuiD(byte[] duiD) {
		this.duiD = duiD;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Client Identifier (Option 1) {{bibref|RFC3315|Section 22.2}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.

          Note: DHCPv6 Option 1 (DUID) is sometimes referred to as ''Client Identifier''.
	 *
	 * @since 2.2
	 * @param duiD the input value
	 * @return this instance
	 */
	public Pool withDuiD(byte[] duiD) {
		this.duiD = duiD;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|DUID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|DUID}} entry, if specified.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isDuiDExclude() {
		return duiDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|DUID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|DUID}} entry, if specified.
	 *
	 * @since 2.2
	 * @param duiDExclude the input value
	 */
	public void  setDuiDExclude(Boolean duiDExclude) {
		this.duiDExclude = duiDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|DUID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|DUID}} entry, if specified.
	 *
	 * @since 2.2
	 * @param duiDExclude the input value
	 * @return this instance
	 */
	public Pool withDuiDExclude(Boolean duiDExclude) {
		this.duiDExclude = duiDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) {{bibref|RFC3315|Section 22.16}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getVendorClassID() {
		return vendorClassID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) {{bibref|RFC3315|Section 22.16}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 * @param vendorClassID the input value
	 */
	public void  setVendorClassID(byte[] vendorClassID) {
		this.vendorClassID = vendorClassID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) {{bibref|RFC3315|Section 22.16}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 * @param vendorClassID the input value
	 * @return this instance
	 */
	public Pool withVendorClassID(byte[] vendorClassID) {
		this.vendorClassID = vendorClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isVendorClassIDExclude() {
		return vendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.2
	 * @param vendorClassIDExclude the input value
	 */
	public void  setVendorClassIDExclude(Boolean vendorClassIDExclude) {
		this.vendorClassIDExclude = vendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.2
	 * @param vendorClassIDExclude the input value
	 * @return this instance
	 */
	public Pool withVendorClassIDExclude(Boolean vendorClassIDExclude) {
		this.vendorClassIDExclude = vendorClassIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 User Class Identifier (Option 15) {{bibref|RFC3315|Section 22.15}}.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getUserClassID() {
		return userClassID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 User Class Identifier (Option 15) {{bibref|RFC3315|Section 22.15}}.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 * @param userClassID the input value
	 */
	public void  setUserClassID(byte[] userClassID) {
		this.userClassID = userClassID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 User Class Identifier (Option 15) {{bibref|RFC3315|Section 22.15}}.

          {{empty}} indicates this criterion is not used.
	 *
	 * @since 2.2
	 * @param userClassID the input value
	 * @return this instance
	 */
	public Pool withUserClassID(byte[] userClassID) {
		this.userClassID = userClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isUserClassIDExclude() {
		return userClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 2.2
	 * @param userClassIDExclude the input value
	 */
	public void  setUserClassIDExclude(Boolean userClassIDExclude) {
		this.userClassIDExclude = userClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 2.2
	 * @param userClassIDExclude the input value
	 * @return this instance
	 */
	public Pool withUserClassIDExclude(Boolean userClassIDExclude) {
		this.userClassIDExclude = userClassIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion.

          Source address (link-layer address) of DHCPv6 messages sent from the DHCPv6 client.  This criterion is only likely to be useful if this is a link-layer address.

          {{empty}} indicates this criterion is not used for serving.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * Set the pool association criterion.

          Source address (link-layer address) of DHCPv6 messages sent from the DHCPv6 client.  This criterion is only likely to be useful if this is a link-layer address.

          {{empty}} indicates this criterion is not used for serving.
	 *
	 * @since 2.2
	 * @param sourceAddress the input value
	 */
	public void  setSourceAddress(IPv6Address sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	/**
	 * Set the pool association criterion.

          Source address (link-layer address) of DHCPv6 messages sent from the DHCPv6 client.  This criterion is only likely to be useful if this is a link-layer address.

          {{empty}} indicates this criterion is not used for serving.
	 *
	 * @since 2.2
	 * @param sourceAddress the input value
	 * @return this instance
	 */
	public Pool withSourceAddress(IPv6Address sourceAddress) {
		this.sourceAddress = sourceAddress;
		return this;
	}

	/**
	 * Get the bit-mask for the source address, where matching of a packet's source address with the {{param|SourceAddress}} is only to be done for bit positions set to one in the mask.  A mask of {{empty}} indicates all bits of the {{param|SourceAddress}} are to be used.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getSourceAddressMask() {
		return sourceAddressMask;
	}

	/**
	 * Set the bit-mask for the source address, where matching of a packet's source address with the {{param|SourceAddress}} is only to be done for bit positions set to one in the mask.  A mask of {{empty}} indicates all bits of the {{param|SourceAddress}} are to be used.
	 *
	 * @since 2.2
	 * @param sourceAddressMask the input value
	 */
	public void  setSourceAddressMask(IPv6Address sourceAddressMask) {
		this.sourceAddressMask = sourceAddressMask;
	}

	/**
	 * Set the bit-mask for the source address, where matching of a packet's source address with the {{param|SourceAddress}} is only to be done for bit positions set to one in the mask.  A mask of {{empty}} indicates all bits of the {{param|SourceAddress}} are to be used.
	 *
	 * @since 2.2
	 * @param sourceAddressMask the input value
	 * @return this instance
	 */
	public Pool withSourceAddressMask(IPv6Address sourceAddressMask) {
		this.sourceAddressMask = sourceAddressMask;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the (masked) {{param|SourceAddress}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|SourceAddress}} entry, if specified.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isSourceAddressExclude() {
		return sourceAddressExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the (masked) {{param|SourceAddress}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|SourceAddress}} entry, if specified.
	 *
	 * @since 2.2
	 * @param sourceAddressExclude the input value
	 */
	public void  setSourceAddressExclude(Boolean sourceAddressExclude) {
		this.sourceAddressExclude = sourceAddressExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the (masked) {{param|SourceAddress}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|SourceAddress}} entry, if specified.
	 *
	 * @since 2.2
	 * @param sourceAddressExclude the input value
	 * @return this instance
	 */
	public Pool withSourceAddressExclude(Boolean sourceAddressExclude) {
		this.sourceAddressExclude = sourceAddressExclude;
		return this;
	}

	/**
	 * Get the enables or disables IANA offers.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIanAEnable() {
		return ianAEnable;
	}

	/**
	 * Set the enables or disables IANA offers.
	 *
	 * @since 2.2
	 * @param ianAEnable the input value
	 */
	public void  setIanAEnable(Boolean ianAEnable) {
		this.ianAEnable = ianAEnable;
	}

	/**
	 * Set the enables or disables IANA offers.
	 *
	 * @since 2.2
	 * @param ianAEnable the input value
	 * @return this instance
	 */
	public Pool withIanAEnable(Boolean ianAEnable) {
		this.ianAEnable = ianAEnable;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

          Manually-configured prefixes from which IA_NA addresses will be assigned.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  All clients that request IA_NA and match filter criteria on this {{param|Interface}} MUST be offered IA_NA addresses from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) /64 prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getIanAManualPrefixes() {
		if (this.ianAManualPrefixes == null){ this.ianAManualPrefixes=new ArrayList<>();}
		return ianAManualPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          Manually-configured prefixes from which IA_NA addresses will be assigned.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  All clients that request IA_NA and match filter criteria on this {{param|Interface}} MUST be offered IA_NA addresses from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) /64 prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param ianAManualPrefixes the input value
	 */
	public void  setIanAManualPrefixes(Collection<String> ianAManualPrefixes) {
		this.ianAManualPrefixes = ianAManualPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          Manually-configured prefixes from which IA_NA addresses will be assigned.  Each referenced prefix MUST have a  {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} of {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}}.  All clients that request IA_NA and match filter criteria on this {{param|Interface}} MUST be offered IA_NA addresses from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) /64 prefixes in this list.

          Prefixes MUST be associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public Pool withIanAManualPrefixes(String string) {
		getIanAManualPrefixes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

          All prefixes from which IA_NA addresses will be assigned. This list can include:

          * Prefixes from {{param|IANAManualPrefixes}} that are used for IA_NA offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getIanAPrefixes() {
		if (this.ianAPrefixes == null){ this.ianAPrefixes=new ArrayList<>();}
		return ianAPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          All prefixes from which IA_NA addresses will be assigned. This list can include:

          * Prefixes from {{param|IANAManualPrefixes}} that are used for IA_NA offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param ianAPrefixes the input value
	 */
	public void  setIanAPrefixes(Collection<String> ianAPrefixes) {
		this.ianAPrefixes = ianAPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          All prefixes from which IA_NA addresses will be assigned. This list can include:

          * Prefixes from {{param|IANAManualPrefixes}} that are used for IA_NA offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public Pool withIanAPrefixes(String string) {
		getIanAPrefixes().add(string);
		return this;
	}

	/**
	 * Get the enables or disables IAPD offers.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIapDEnable() {
		return iapDEnable;
	}

	/**
	 * Set the enables or disables IAPD offers.
	 *
	 * @since 2.2
	 * @param iapDEnable the input value
	 */
	public void  setIapDEnable(Boolean iapDEnable) {
		this.iapDEnable = iapDEnable;
	}

	/**
	 * Set the enables or disables IAPD offers.
	 *
	 * @since 2.2
	 * @param iapDEnable the input value
	 * @return this instance
	 */
	public Pool withIapDEnable(Boolean iapDEnable) {
		this.iapDEnable = iapDEnable;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

          Manually-configured prefixes from which IA_PD prefixes will be derived.  This list can include:

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} associated with with the interface instance referenced by {{param|Interface}}.

          All clients that request IA_PD and match filter criteria on this {{param|Interface}} MUST be offered IA_PD prefixes derived from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getIapDManualPrefixes() {
		if (this.iapDManualPrefixes == null){ this.iapDManualPrefixes=new ArrayList<>();}
		return iapDManualPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          Manually-configured prefixes from which IA_PD prefixes will be derived.  This list can include:

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} associated with with the interface instance referenced by {{param|Interface}}.

          All clients that request IA_PD and match filter criteria on this {{param|Interface}} MUST be offered IA_PD prefixes derived from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.
	 *
	 * @since 2.2
	 * @param iapDManualPrefixes the input value
	 */
	public void  setIapDManualPrefixes(Collection<String> iapDManualPrefixes) {
		this.iapDManualPrefixes = iapDManualPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          Manually-configured prefixes from which IA_PD prefixes will be derived.  This list can include:

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} = {{enum|Static|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} or {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.StaticType}} associated with with the interface instance referenced by {{param|Interface}}.

          All clients that request IA_PD and match filter criteria on this {{param|Interface}} MUST be offered IA_PD prefixes derived from all of the ''Valid'' ({{param|.IP.Interface.{i}.IPv6Prefix.{i}.ValidLifetime}} is infinite or in the future) prefixes in this list.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public Pool withIapDManualPrefixes(String string) {
		getIapDManualPrefixes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

          All prefixes for which IA_PD prefixes will be assigned. This list can include:

          * Prefixes from {{param|IAPDManualPrefixes}} that are used for IA_PD offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Collection<String> getIapDPrefixes() {
		if (this.iapDPrefixes == null){ this.iapDPrefixes=new ArrayList<>();}
		return iapDPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          All prefixes for which IA_PD prefixes will be assigned. This list can include:

          * Prefixes from {{param|IAPDManualPrefixes}} that are used for IA_PD offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param iapDPrefixes the input value
	 */
	public void  setIapDPrefixes(Collection<String> iapDPrefixes) {
		this.iapDPrefixes = iapDPrefixes;
	}

	/**
	 * Set the {{list}} {{reference}}

          All prefixes for which IA_PD prefixes will be assigned. This list can include:

          * Prefixes from {{param|IAPDManualPrefixes}} that are used for IA_PD offers.

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|PrefixDelegation|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with upstream interfaces (i.e. interfaces for which the physical layer interface object has ''Upstream'' = {{true}}).

          * Prefixes with {{param|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} = {{enum|Child|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} or {{enum|AutoConfigured|.IP.Interface.{i}.IPv6Prefix.{i}.Origin}} associated with the interface instance referenced by {{param|Interface}}.
	 *
	 * @since 2.2
	 * @param string the input value
	 * @return this instance
	 */
	public Pool withIapDPrefixes(String string) {
		getIapDPrefixes().add(string);
		return this;
	}

	/**
	 * Get the RECOMMENDED minimum number of bits to add to {{param|IAPDManualPrefixes}} or {{param|IAPDPrefixes}} in order to determine the length of prefixes that are offered in an IA_PD.  The device is responsible for ensuring that it does not delegate a prefix longer than /64.  The device can have additional logic that is used (in conjunction with this parameter) to determine the actual length of prefixes offered in an IA_PD.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getIapDAddLength() {
		return iapDAddLength;
	}

	/**
	 * Set the RECOMMENDED minimum number of bits to add to {{param|IAPDManualPrefixes}} or {{param|IAPDPrefixes}} in order to determine the length of prefixes that are offered in an IA_PD.  The device is responsible for ensuring that it does not delegate a prefix longer than /64.  The device can have additional logic that is used (in conjunction with this parameter) to determine the actual length of prefixes offered in an IA_PD.
	 *
	 * @since 2.2
	 * @param iapDAddLength the input value
	 */
	public void  setIapDAddLength(Long iapDAddLength) {
		this.iapDAddLength = iapDAddLength;
	}

	/**
	 * Set the RECOMMENDED minimum number of bits to add to {{param|IAPDManualPrefixes}} or {{param|IAPDPrefixes}} in order to determine the length of prefixes that are offered in an IA_PD.  The device is responsible for ensuring that it does not delegate a prefix longer than /64.  The device can have additional logic that is used (in conjunction with this parameter) to determine the actual length of prefixes offered in an IA_PD.
	 *
	 * @since 2.2
	 * @param iapDAddLength the input value
	 * @return this instance
	 */
	public Pool withIapDAddLength(Long iapDAddLength) {
		this.iapDAddLength = iapDAddLength;
		return this;
	}

	/**
	 * Get the dhcPv6 client table.

        This table lists details of DHCPv6 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the dhcPv6 client table.

        This table lists details of DHCPv6 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the dhcPv6 client table.

        This table lists details of DHCPv6 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public Pool withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the this object specifies the DHCPv6 options that MUST, if enabled, be offered to clients whose DHCPv6 requests are associated with this pool. If {{param|PassthroughClient}} is specified, and the referenced client has a value for a given option then the {{param|PassthroughClient}} option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.
	 *
	 * @return the value
	 */
	public Collection<Option> getOptions() {
		if (this.options == null){ this.options=new ArrayList<>();}
		return options;
	}

	/**
	 * Set the this object specifies the DHCPv6 options that MUST, if enabled, be offered to clients whose DHCPv6 requests are associated with this pool. If {{param|PassthroughClient}} is specified, and the referenced client has a value for a given option then the {{param|PassthroughClient}} option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.
	 *
	 * @param options the input value
	 */
	public void  setOptions(Collection<Option> options) {
		this.options = options;
	}

	/**
	 * Set the this object specifies the DHCPv6 options that MUST, if enabled, be offered to clients whose DHCPv6 requests are associated with this pool. If {{param|PassthroughClient}} is specified, and the referenced client has a value for a given option then the {{param|PassthroughClient}} option value will be sent instead of {{param|Value}}. Otherwise, {{param|Value}} will be sent.
	 *
	 * @param option the input value
	 * @return this instance
	 */
	public Pool withOption(Option option) {
		getOptions().add(option);
		return this;
	}

	//</editor-fold>

}