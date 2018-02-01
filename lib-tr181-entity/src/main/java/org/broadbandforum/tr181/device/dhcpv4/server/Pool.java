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
package org.broadbandforum.tr181.device.dhcpv4.server;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv4Address;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.dhcpv4.server.pool.Client;
import org.broadbandforum.tr181.device.dhcpv4.server.pool.Option;
import org.broadbandforum.tr181.device.dhcpv4.server.pool.StaticAddress;

	/**
	 * DHCP conditional serving pool table. 

        Each instance of this object defines a DHCP conditional serving pool. Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address. 

        Overlapping pool ranges MUST be supported.

        For enabled table entries, if {{param|Interface}} is not a valid reference, or {{param|MinAddress}}, {{param|MaxAddress}}, or {{param|SubnetMask}} is not a valid value, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Server.Pool.{i}.")
public class Pool {

	/**
	 * Enables or disables the Pool entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For  each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be  compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
	/**
	 * {{reference}} The IP Interface associated with the ''Pool'' entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Pool association criterion. 

          Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VendorClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public String vendorClassID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VendorClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean vendorClassIDExclude = false;
	/**
	 * {{param|VendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of  {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String vendorClassIDMode = "Exact";
	/**
	 * Pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ClientID")
	@CWMPParameter(access = "readWrite")
	public byte[] clientID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ClientIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean clientIDExclude = false;
	/**
	 * Pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in {{bibref|RFC3004}}.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserClassID")
	@CWMPParameter(access = "readWrite")
	public byte[] userClassID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean userClassIDExclude = false;
	/**
	 * Pool association criterion.

          Hardware address (MAC address) of the physical interface of the DHCP client.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Chaddr")
	@CWMPParameter(access = "readWrite")
	public MACAddress chaddr;
	/**
	 * Bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be  done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}}  are to be used for conditional serving classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChaddrMask")
	@CWMPParameter(access = "readWrite")
	public MACAddress chaddrMask;
	/**
	 * If {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChaddrExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean chaddrExclude = false;
	/**
	 * Specifies first IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinAddress")
	@CWMPParameter(access = "readWrite")
	public IPv4Address minAddress;
	/**
	 * Specifies last IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxAddress")
	@CWMPParameter(access = "readWrite")
	public IPv4Address maxAddress;
	/**
	 * {{list}} List items represent addresses marked reserved from the address allocation pool.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReservedAddresses")
	@CWMPParameter(access = "readWrite")
	public IPv4Address reservedAddresses;
	/**
	 * Specifies the client's network subnet mask.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with  {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPv4Address subnetMask;
	/**
	 * {{list}} List items represent DNS servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DNSServers")
	@CWMPParameter(access = "readWrite")
	public IPv4Address dnsServers;
	/**
	 * Sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DomainName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String domainName;
	/**
	 * {{list}} List items represent addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPRouters")
	@CWMPParameter(access = "readWrite")
	public IPv4Address iprouters;
	/**
	 * Specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeaseTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = -1)
	public Integer leaseTime = 86400;
	/**
	 * DHCP static address table.

        Entries in this table correspond to what {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

        Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

        Note that it is possible that an IP address in this table is present in one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 */
	@XmlElementWrapper(name = "staticAddresss")
	@XmlElement(name = "StaticAddress")
	@CWMPParameter(access = "readWrite")
	public Collection<StaticAddress> staticAddresss;
	/**
	 * This object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are  associated with this pool.
	 */
	@XmlElementWrapper(name = "options")
	@XmlElement(name = "Option")
	@CWMPParameter(access = "readWrite")
	public Collection<Option> options;
	/**
	 * DHCPv4 client table.

        This table lists details of DHCPv4 clients that matched the filter criteria of this {{object|#}} entry.
	 */
	@XmlElementWrapper(name = "clients")
	@XmlElement(name = "Client")
	public Collection<Client> clients;

	public Pool() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the Pool entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the Pool entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the Pool entry.
	 *
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	public Pool withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For  each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be  compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For  each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be  compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For  each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be  compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public Pool withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get the {{reference}} The IP Interface associated with the ''Pool'' entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the ''Pool'' entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the ''Pool'' entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Pool with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVendorClassID() {
		return vendorClassID;
	}

	/**
	 * Set the pool association criterion. 

          Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @param vendorClassID the input value
	 */
	public void  setVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
	}

	/**
	 * Set the pool association criterion. 

          Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @param vendorClassID the input value
	 * @return this instance
	 */
	public Pool withVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isVendorClassIDExclude() {
		return vendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.0
	 * @param vendorClassIDExclude the input value
	 */
	public void  setVendorClassIDExclude(Boolean vendorClassIDExclude) {
		this.vendorClassIDExclude = vendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 2.0
	 * @param vendorClassIDExclude the input value
	 * @return this instance
	 */
	public Pool withVendorClassIDExclude(Boolean vendorClassIDExclude) {
		this.vendorClassIDExclude = vendorClassIDExclude;
		return this;
	}

	/**
	 * Get the {{param|VendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of  {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVendorClassIDMode() {
		return vendorClassIDMode;
	}

	/**
	 * Set the {{param|VendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of  {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param vendorClassIDMode the input value
	 */
	public void  setVendorClassIDMode(String vendorClassIDMode) {
		this.vendorClassIDMode = vendorClassIDMode;
	}

	/**
	 * Set the {{param|VendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of  {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param vendorClassIDMode the input value
	 * @return this instance
	 */
	public Pool withVendorClassIDMode(String vendorClassIDMode) {
		this.vendorClassIDMode = vendorClassIDMode;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getClientID() {
		return clientID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @param clientID the input value
	 */
	public void  setClientID(byte[] clientID) {
		this.clientID = clientID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @param clientID the input value
	 * @return this instance
	 */
	public Pool withClientID(byte[] clientID) {
		this.clientID = clientID;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isClientIDExclude() {
		return clientIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 2.0
	 * @param clientIDExclude the input value
	 */
	public void  setClientIDExclude(Boolean clientIDExclude) {
		this.clientIDExclude = clientIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 2.0
	 * @param clientIDExclude the input value
	 * @return this instance
	 */
	public Pool withClientIDExclude(Boolean clientIDExclude) {
		this.clientIDExclude = clientIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in {{bibref|RFC3004}}.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getUserClassID() {
		return userClassID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in {{bibref|RFC3004}}.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @param userClassID the input value
	 */
	public void  setUserClassID(byte[] userClassID) {
		this.userClassID = userClassID;
	}

	/**
	 * Set the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in {{bibref|RFC3004}}.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUserClassIDExclude() {
		return userClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 2.0
	 * @param userClassIDExclude the input value
	 */
	public void  setUserClassIDExclude(Boolean userClassIDExclude) {
		this.userClassIDExclude = userClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

          If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 2.0
	 * @param userClassIDExclude the input value
	 * @return this instance
	 */
	public Pool withUserClassIDExclude(Boolean userClassIDExclude) {
		this.userClassIDExclude = userClassIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion.

          Hardware address (MAC address) of the physical interface of the DHCP client.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getChaddr() {
		return chaddr;
	}

	/**
	 * Set the pool association criterion.

          Hardware address (MAC address) of the physical interface of the DHCP client.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @param chaddr the input value
	 */
	public void  setChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
	}

	/**
	 * Set the pool association criterion.

          Hardware address (MAC address) of the physical interface of the DHCP client.

          {{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 2.0
	 * @param chaddr the input value
	 * @return this instance
	 */
	public Pool withChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
		return this;
	}

	/**
	 * Get the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be  done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}}  are to be used for conditional serving classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getChaddrMask() {
		return chaddrMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be  done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}}  are to be used for conditional serving classification.
	 *
	 * @since 2.0
	 * @param chaddrMask the input value
	 */
	public void  setChaddrMask(MACAddress chaddrMask) {
		this.chaddrMask = chaddrMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be  done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}}  are to be used for conditional serving classification.
	 *
	 * @since 2.0
	 * @param chaddrMask the input value
	 * @return this instance
	 */
	public Pool withChaddrMask(MACAddress chaddrMask) {
		this.chaddrMask = chaddrMask;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isChaddrExclude() {
		return chaddrExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 2.0
	 * @param chaddrExclude the input value
	 */
	public void  setChaddrExclude(Boolean chaddrExclude) {
		this.chaddrExclude = chaddrExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

          If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 2.0
	 * @param chaddrExclude the input value
	 * @return this instance
	 */
	public Pool withChaddrExclude(Boolean chaddrExclude) {
		this.chaddrExclude = chaddrExclude;
		return this;
	}

	/**
	 * Get the specifies first IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getMinAddress() {
		return minAddress;
	}

	/**
	 * Set the specifies first IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @param minAddress the input value
	 */
	public void  setMinAddress(IPv4Address minAddress) {
		this.minAddress = minAddress;
	}

	/**
	 * Set the specifies first IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @param minAddress the input value
	 * @return this instance
	 */
	public Pool withMinAddress(IPv4Address minAddress) {
		this.minAddress = minAddress;
		return this;
	}

	/**
	 * Get the specifies last IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getMaxAddress() {
		return maxAddress;
	}

	/**
	 * Set the specifies last IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @param maxAddress the input value
	 */
	public void  setMaxAddress(IPv4Address maxAddress) {
		this.maxAddress = maxAddress;
	}

	/**
	 * Set the specifies last IPv4 address in the pool to be assigned by the DHCP server on the LAN interface.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @param maxAddress the input value
	 * @return this instance
	 */
	public Pool withMaxAddress(IPv4Address maxAddress) {
		this.maxAddress = maxAddress;
		return this;
	}

	/**
	 * Get the {{list}} List items represent addresses marked reserved from the address allocation pool.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getReservedAddresses() {
		return reservedAddresses;
	}

	/**
	 * Set the {{list}} List items represent addresses marked reserved from the address allocation pool.
	 *
	 * @since 2.0
	 * @param reservedAddresses the input value
	 */
	public void  setReservedAddresses(IPv4Address reservedAddresses) {
		this.reservedAddresses = reservedAddresses;
	}

	/**
	 * Set the {{list}} List items represent addresses marked reserved from the address allocation pool.
	 *
	 * @since 2.0
	 * @param reservedAddresses the input value
	 * @return this instance
	 */
	public Pool withReservedAddresses(IPv4Address reservedAddresses) {
		this.reservedAddresses = reservedAddresses;
		return this;
	}

	/**
	 * Get the specifies the client's network subnet mask.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with  {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with  {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(IPv4Address subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with  {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to {{true}}.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public Pool withSubnetMask(IPv4Address subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the {{list}} List items represent DNS servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the {{list}} List items represent DNS servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPv4Address dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the {{list}} List items represent DNS servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 * @param dnsServers the input value
	 * @return this instance
	 */
	public Pool withDnsServers(IPv4Address dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Set the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 2.0
	 * @param domainName the input value
	 */
	public void  setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Set the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 2.0
	 * @param domainName the input value
	 * @return this instance
	 */
	public Pool withDomainName(String domainName) {
		this.domainName = domainName;
		return this;
	}

	/**
	 * Get the {{list}} List items represent addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getIprouters() {
		return iprouters;
	}

	/**
	 * Set the {{list}} List items represent addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 * @param iprouters the input value
	 */
	public void  setIprouters(IPv4Address iprouters) {
		this.iprouters = iprouters;
	}

	/**
	 * Set the {{list}} List items represent addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.

          The parameter value can be overwritten by dynamic values retrieved via a DHCP client with {{param|##.Client.{i}.PassthroughEnable}} or a PPP interface with {{param|.PPP.Interface.{i}.IPCP.PassthroughEnable}} equal to  {{true}}.
	 *
	 * @since 2.0
	 * @param iprouters the input value
	 * @return this instance
	 */
	public Pool withIprouters(IPv4Address iprouters) {
		this.iprouters = iprouters;
		return this;
	}

	/**
	 * Get the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLeaseTime() {
		return leaseTime;
	}

	/**
	 * Set the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 */
	public void  setLeaseTime(Integer leaseTime) {
		this.leaseTime = leaseTime;
	}

	/**
	 * Set the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 2.0
	 * @param leaseTime the input value
	 * @return this instance
	 */
	public Pool withLeaseTime(Integer leaseTime) {
		this.leaseTime = leaseTime;
		return this;
	}

	/**
	 * Get the dhcP static address table.

        Entries in this table correspond to what {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

        Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

        Note that it is possible that an IP address in this table is present in one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @return the value
	 */
	public Collection<StaticAddress> getStaticAddresss() {
		if (this.staticAddresss == null){ this.staticAddresss=new ArrayList<>();}
		return staticAddresss;
	}

	/**
	 * Set the dhcP static address table.

        Entries in this table correspond to what {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

        Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

        Note that it is possible that an IP address in this table is present in one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @param staticAddresss the input value
	 */
	public void  setStaticAddresss(Collection<StaticAddress> staticAddresss) {
		this.staticAddresss = staticAddresss;
	}

	/**
	 * Set the dhcP static address table.

        Entries in this table correspond to what {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

        Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

        Note that it is possible that an IP address in this table is present in one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @param staticAddress the input value
	 * @return this instance
	 */
	public Pool withStaticAddress(StaticAddress staticAddress) {
		getStaticAddresss().add(staticAddress);
		return this;
	}

	/**
	 * Get the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are  associated with this pool.
	 *
	 * @return the value
	 */
	public Collection<Option> getOptions() {
		if (this.options == null){ this.options=new ArrayList<>();}
		return options;
	}

	/**
	 * Set the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are  associated with this pool.
	 *
	 * @param options the input value
	 */
	public void  setOptions(Collection<Option> options) {
		this.options = options;
	}

	/**
	 * Set the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are  associated with this pool.
	 *
	 * @param option the input value
	 * @return this instance
	 */
	public Pool withOption(Option option) {
		getOptions().add(option);
		return this;
	}

	/**
	 * Get the dhcPv4 client table.

        This table lists details of DHCPv4 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the dhcPv4 client table.

        This table lists details of DHCPv4 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the dhcPv4 client table.

        This table lists details of DHCPv4 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public Pool withClient(Client client) {
		getClients().add(client);
		return this;
	}

	//</editor-fold>

}