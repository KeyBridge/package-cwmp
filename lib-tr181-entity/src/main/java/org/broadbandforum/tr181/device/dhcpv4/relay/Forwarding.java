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
package org.broadbandforum.tr181.device.dhcpv4.relay;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv4Address;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * DHCP Relay Agent Forwarding table.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DHCPv4.Relay.Forwarding.{i}.")
@XmlRootElement(name = "Forwarding")
@XmlType(name = "Device.DHCPv4.Relay.Forwarding")
@XmlAccessorType(XmlAccessType.FIELD)
public class Forwarding {

	/**
	 * Enables or disables the Forwarding entry.
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
	 * Position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

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
	 * {{reference}} The IP Interface associated with the ''Forwarding'' entry.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Chaddr")
	@CWMPParameter(access = "readWrite")
	public MACAddress chaddr;
	/**
	 * Bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for relay classification.
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
	 * If {{true}}, incoming DHCP requests will be forwarded to the CPE DHCP Server. If {{false}}, incoming DHCP requests will be forwarded to the {{param|DHCPServerIPAddress}} configured for this forwarding entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocallyServed")
	@CWMPParameter(access = "readWrite")
	public Boolean locallyServed = false;
	/**
	 * IPv4 address of the DHCP server, where the request has to be sent to when there is a conditional match with this forwarding entry and {{param|LocallyServed}} is {{false}}. If {{param|LocallyServed}} is {{false}} and this parameter is not  configured, then the DHCP request is dropped.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DHCPServerIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPv4Address dhcPServerIPAddress;

	public Forwarding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the Forwarding entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the Forwarding entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the Forwarding entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Forwarding withEnable(Boolean enable) {
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
	public Forwarding withStatus(String status) {
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
	public Forwarding withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

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
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

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
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be  compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public Forwarding withOrder(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Get the {{reference}} The IP Interface associated with the ''Forwarding'' entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the ''Forwarding'' entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} The IP Interface associated with the ''Forwarding'' entry.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Forwarding with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
	 *
	 * @since 2.0
	 * @param vendorClassID the input value
	 * @return this instance
	 */
	public Forwarding withVendorClassID(String vendorClassID) {
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
	public Forwarding withVendorClassIDExclude(Boolean vendorClassIDExclude) {
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
	public Forwarding withVendorClassIDMode(String vendorClassIDMode) {
		this.vendorClassIDMode = vendorClassIDMode;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
	 *
	 * @since 2.0
	 * @param clientID the input value
	 * @return this instance
	 */
	public Forwarding withClientID(byte[] clientID) {
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
	public Forwarding withClientIDExclude(Boolean clientIDExclude) {
		this.clientIDExclude = clientIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in {{bibref|RFC3004}}.

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
	 *
	 * @since 2.0
	 * @param userClassID the input value
	 * @return this instance
	 */
	public Forwarding withUserClassID(byte[] userClassID) {
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
	public Forwarding withUserClassIDExclude(Boolean userClassIDExclude) {
		this.userClassIDExclude = userClassIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion.

          Hardware address (MAC address) of the physical interface of the DHCP client.

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
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

          {{empty}} indicates this criterion is not used as a relay classification criterion.
	 *
	 * @since 2.0
	 * @param chaddr the input value
	 * @return this instance
	 */
	public Forwarding withChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
		return this;
	}

	/**
	 * Get the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for relay classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getChaddrMask() {
		return chaddrMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for relay classification.
	 *
	 * @since 2.0
	 * @param chaddrMask the input value
	 */
	public void  setChaddrMask(MACAddress chaddrMask) {
		this.chaddrMask = chaddrMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for relay classification.
	 *
	 * @since 2.0
	 * @param chaddrMask the input value
	 * @return this instance
	 */
	public Forwarding withChaddrMask(MACAddress chaddrMask) {
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
	public Forwarding withChaddrExclude(Boolean chaddrExclude) {
		this.chaddrExclude = chaddrExclude;
		return this;
	}

	/**
	 * Get the if {{true}}, incoming DHCP requests will be forwarded to the CPE DHCP Server. If {{false}}, incoming DHCP requests will be forwarded to the {{param|DHCPServerIPAddress}} configured for this forwarding entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLocallyServed() {
		return locallyServed;
	}

	/**
	 * Set the if {{true}}, incoming DHCP requests will be forwarded to the CPE DHCP Server. If {{false}}, incoming DHCP requests will be forwarded to the {{param|DHCPServerIPAddress}} configured for this forwarding entry.
	 *
	 * @since 2.0
	 * @param locallyServed the input value
	 */
	public void  setLocallyServed(Boolean locallyServed) {
		this.locallyServed = locallyServed;
	}

	/**
	 * Set the if {{true}}, incoming DHCP requests will be forwarded to the CPE DHCP Server. If {{false}}, incoming DHCP requests will be forwarded to the {{param|DHCPServerIPAddress}} configured for this forwarding entry.
	 *
	 * @since 2.0
	 * @param locallyServed the input value
	 * @return this instance
	 */
	public Forwarding withLocallyServed(Boolean locallyServed) {
		this.locallyServed = locallyServed;
		return this;
	}

	/**
	 * Get the ipv4 address of the DHCP server, where the request has to be sent to when there is a conditional match with this forwarding entry and {{param|LocallyServed}} is {{false}}. If {{param|LocallyServed}} is {{false}} and this parameter is not  configured, then the DHCP request is dropped.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getDhcPServerIPAddress() {
		return dhcPServerIPAddress;
	}

	/**
	 * Set the ipv4 address of the DHCP server, where the request has to be sent to when there is a conditional match with this forwarding entry and {{param|LocallyServed}} is {{false}}. If {{param|LocallyServed}} is {{false}} and this parameter is not  configured, then the DHCP request is dropped.
	 *
	 * @since 2.0
	 * @param dhcPServerIPAddress the input value
	 */
	public void  setDhcPServerIPAddress(IPv4Address dhcPServerIPAddress) {
		this.dhcPServerIPAddress = dhcPServerIPAddress;
	}

	/**
	 * Set the ipv4 address of the DHCP server, where the request has to be sent to when there is a conditional match with this forwarding entry and {{param|LocallyServed}} is {{false}}. If {{param|LocallyServed}} is {{false}} and this parameter is not  configured, then the DHCP request is dropped.
	 *
	 * @since 2.0
	 * @param dhcPServerIPAddress the input value
	 * @return this instance
	 */
	public Forwarding withDhcPServerIPAddress(IPv4Address dhcPServerIPAddress) {
		this.dhcPServerIPAddress = dhcPServerIPAddress;
		return this;
	}

	//</editor-fold>

}