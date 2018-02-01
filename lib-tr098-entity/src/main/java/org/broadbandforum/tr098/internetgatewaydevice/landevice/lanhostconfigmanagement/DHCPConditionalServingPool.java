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
package org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.datatypes.IPAddress;
import org.broadbandforum.tr098.datatypes.MACAddress;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement.dhcpconditionalservingpool.DHCPOption;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.lanhostconfigmanagement.dhcpconditionalservingpool.DHCPStaticAddress;

	/**
	 * DHCP conditional serving pool table.

Each instance of this object defines a DHCP conditional serving pool.  Client requests are associated with pools based on criteria such as source interface, supplied DHCP options, and MAC address.

If a DHCP request does not match any of the DHCP conditional serving pool entries, the handling of the request is determined by the default DHCP server behavior that is defined by the LANHostConfigManagement object.

Overlapping pool ranges MUST be supported.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.LANHostConfigManagement.DHCPConditionalServingPool.{i}.")
public class DHCPConditionalServingPool {

	/**
	 * Enables or disables the DHCPConditionalServingPool entry.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Position of the pool entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.

The value on creation of a DHCPConditionalServingPool table entry MUST be one greater than the largest current value.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PoolOrder")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long poolOrder;
	/**
	 * Pool association criterion.

{{list}}  {{reference|the layer 2 ingress interfaces associated with this entry, i.e. the corresponding ''LAN**InterfaceConfig'' or ''WLANConfiguration'' objects}}

For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2,InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

{{empty}} indicates this entry is to apply to all layer 2 interface objects under this ''LANDevice'' instance.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SourceInterface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> sourceInterface;
	/**
	 * Pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132 {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VendorClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String vendorClassID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VendorClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean vendorClassIDExclude = false;
	/**
	 * {{param|VendorClassID}} pattern match criterion.  {{enum}}

For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String vendorClassIDMode = "Exact";
	/**
	 * Pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132 {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ClientID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String clientID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ClientIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean clientIDExclude = false;
	/**
	 * Pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004 {{bibref|RFC3004}}.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UserClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String userClassID;
	/**
	 * If {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UserClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean userClassIDExclude = false;
	/**
	 * Pool association criterion.

Hardware address (MAC address.) of the physical interface of the DHCP client.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Chaddr")
	@CWMPParameter(access = "readWrite")
	public MACAddress chaddr;
	/**
	 * Bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for conditional serving classification.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ChaddrMask")
	@CWMPParameter(access = "readWrite")
	public MACAddress chaddrMask;
	/**
	 * If {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ChaddrExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean chaddrExclude = false;
	/**
	 * If {{true}}, then the local DHCP server will assign an IP address from the specific address pool specified in this object. If {{false}}, the DHCP server will send the request to the {{param|DHCPServerIPAddress}} configured for this pool.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LocallyServed")
	@CWMPParameter(access = "readWrite")
	public Boolean locallyServed = true;
	/**
	 * Specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MinAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress minAddress;
	/**
	 * Specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MaxAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress maxAddress;
	/**
	 * IP addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ReservedAddresses")
	@CWMPParameter(access = "readWrite")
	public IPAddress reservedAddresses;
	/**
	 * Specifies the client's network subnet mask.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress subnetMask;
	/**
	 * DNS servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DNSServers")
	@CWMPParameter(access = "readWrite")
	public IPAddress dnsServers;
	/**
	 * Sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DomainName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String domainName;
	/**
	 * IP addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "IPRouters")
	@CWMPParameter(access = "readWrite")
	public IPAddress iprouters;
	/**
	 * Specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DHCPLeaseTime")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer dhcPLeaseTime = 86400;
	/**
	 * Controls whether the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are configurable or are taken from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the above-mentioned pool parameters are directly configured by the ACS.

If {{enum|Passthrough}}, the above-mentioned pool parameters cannot be configured by the ACS.  Their values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UseAllocatedWAN")
	@CWMPParameter(access = "readWrite")
	public String useAllocatedWAN = "Normal";
	/**
	 * {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|Passthrough|UseAllocatedWAN}}}} The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "AssociatedConnection")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String associatedConnection;
	/**
	 * IP address of the DHCP server, where the request has to be sent to when there is a conditional match with this pool and {{param|LocallyServed}} is {{false}}. If this parameter is not configured, then the DHCP request is dropped.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DHCPServerIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress dhcPServerIPAddress;
	/**
	 * DHCP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in the main pool and/or one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 */
	@XmlElementWrapper(name = "DHCPStaticAddresss")
	@XmlElement(name = "DHCPStaticAddress")
	@CWMPParameter(access = "readWrite")
	public Collection<DHCPStaticAddress> dhcPStaticAddresss;
	/**
	 * This object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are associated with this pool.
	 */
	@XmlElementWrapper(name = "DHCPOptions")
	@XmlElement(name = "DHCPOption")
	@CWMPParameter(access = "readWrite")
	public Collection<DHCPOption> dhcPOptions;

	public DHCPConditionalServingPool() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DHCPConditionalServingPool entry.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DHCPConditionalServingPool entry.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DHCPConditionalServingPool entry.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

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
	public DHCPConditionalServingPool withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the position of the pool entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.

The value on creation of a DHCPConditionalServingPool table entry MUST be one greater than the largest current value.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getPoolOrder() {
		return poolOrder;
	}

	/**
	 * Set the position of the pool entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.

The value on creation of a DHCPConditionalServingPool table entry MUST be one greater than the largest current value.
	 *
	 * @since 1.4
	 * @param poolOrder the input value
	 */
	public void  setPoolOrder(Long poolOrder) {
		this.poolOrder = poolOrder;
	}

	/**
	 * Set the position of the pool entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each DHCP request, the highest ordered entry that matches the association criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.

The value on creation of a DHCPConditionalServingPool table entry MUST be one greater than the largest current value.
	 *
	 * @since 1.4
	 * @param poolOrder the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withPoolOrder(Long poolOrder) {
		this.poolOrder = poolOrder;
		return this;
	}

	/**
	 * Get the pool association criterion.

{{list}}  {{reference|the layer 2 ingress interfaces associated with this entry, i.e. the corresponding ''LAN**InterfaceConfig'' or ''WLANConfiguration'' objects}}

For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2,InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

{{empty}} indicates this entry is to apply to all layer 2 interface objects under this ''LANDevice'' instance.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getSourceInterface() {
		if (this.sourceInterface == null){ this.sourceInterface=new ArrayList<>();}
		return sourceInterface;
	}

	/**
	 * Set the pool association criterion.

{{list}}  {{reference|the layer 2 ingress interfaces associated with this entry, i.e. the corresponding ''LAN**InterfaceConfig'' or ''WLANConfiguration'' objects}}

For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2,InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

{{empty}} indicates this entry is to apply to all layer 2 interface objects under this ''LANDevice'' instance.
	 *
	 * @since 1.4
	 * @param sourceInterface the input value
	 */
	public void  setSourceInterface(Collection<String> sourceInterface) {
		this.sourceInterface = sourceInterface;
	}

	/**
	 * Set the pool association criterion.

{{list}}  {{reference|the layer 2 ingress interfaces associated with this entry, i.e. the corresponding ''LAN**InterfaceConfig'' or ''WLANConfiguration'' objects}}

For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2,InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

{{empty}} indicates this entry is to apply to all layer 2 interface objects under this ''LANDevice'' instance.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withSourceInterface(String string) {
		getSourceInterface().add(string);
		return this;
	}

	/**
	 * Get the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132 {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getVendorClassID() {
		return vendorClassID;
	}

	/**
	 * Set the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132 {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param vendorClassID the input value
	 */
	public void  setVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
	}

	/**
	 * Set the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132 {{bibref|RFC2132}}, matched according to the criterion in {{param|VendorClassIDMode}}.  Case sensitive.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param vendorClassID the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withVendorClassID(String vendorClassID) {
		this.vendorClassID = vendorClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isVendorClassIDExclude() {
		return vendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 1.4
	 * @param vendorClassIDExclude the input value
	 */
	public void  setVendorClassIDExclude(Boolean vendorClassIDExclude) {
		this.vendorClassIDExclude = vendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|VendorClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|VendorClassID}} entry, if specified.
	 *
	 * @since 1.4
	 * @param vendorClassIDExclude the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withVendorClassIDExclude(Boolean vendorClassIDExclude) {
		this.vendorClassIDExclude = vendorClassIDExclude;
		return this;
	}

	/**
	 * Get the {{param|VendorClassID}} pattern match criterion.  {{enum}}

For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getVendorClassIDMode() {
		return vendorClassIDMode;
	}

	/**
	 * Set the {{param|VendorClassID}} pattern match criterion.  {{enum}}

For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 * @param vendorClassIDMode the input value
	 */
	public void  setVendorClassIDMode(String vendorClassIDMode) {
		this.vendorClassIDMode = vendorClassIDMode;
	}

	/**
	 * Set the {{param|VendorClassID}} pattern match criterion.  {{enum}}

For example, if {{param|VendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 1.4
	 * @param vendorClassIDMode the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withVendorClassIDMode(String vendorClassIDMode) {
		this.vendorClassIDMode = vendorClassIDMode;
		return this;
	}

	/**
	 * Get the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132 {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * Set the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132 {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param clientID the input value
	 */
	public void  setClientID(String clientID) {
		this.clientID = clientID;
	}

	/**
	 * Set the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132 {{bibref|RFC2132}}.  The option value is binary, so an exact match is REQUIRED.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param clientID the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withClientID(String clientID) {
		this.clientID = clientID;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isClientIDExclude() {
		return clientIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 1.4
	 * @param clientIDExclude the input value
	 */
	public void  setClientIDExclude(Boolean clientIDExclude) {
		this.clientIDExclude = clientIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|ClientID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|ClientID}} entry, if specified.
	 *
	 * @since 1.4
	 * @param clientIDExclude the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withClientIDExclude(Boolean clientIDExclude) {
		this.clientIDExclude = clientIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004 {{bibref|RFC3004}}.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getUserClassID() {
		return userClassID;
	}

	/**
	 * Set the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004 {{bibref|RFC3004}}.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param userClassID the input value
	 */
	public void  setUserClassID(String userClassID) {
		this.userClassID = userClassID;
	}

	/**
	 * Set the pool association criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004 {{bibref|RFC3004}}.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param userClassID the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withUserClassID(String userClassID) {
		this.userClassID = userClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isUserClassIDExclude() {
		return userClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 1.4
	 * @param userClassIDExclude the input value
	 */
	public void  setUserClassIDExclude(Boolean userClassIDExclude) {
		this.userClassIDExclude = userClassIDExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the {{param|UserClassID}} entry, if specified.

If {{true}}, matching packets are those that do not match the {{param|UserClassID}} entry, if specified.
	 *
	 * @since 1.4
	 * @param userClassIDExclude the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withUserClassIDExclude(Boolean userClassIDExclude) {
		this.userClassIDExclude = userClassIDExclude;
		return this;
	}

	/**
	 * Get the pool association criterion.

Hardware address (MAC address.) of the physical interface of the DHCP client.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public MACAddress getChaddr() {
		return chaddr;
	}

	/**
	 * Set the pool association criterion.

Hardware address (MAC address.) of the physical interface of the DHCP client.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param chaddr the input value
	 */
	public void  setChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
	}

	/**
	 * Set the pool association criterion.

Hardware address (MAC address.) of the physical interface of the DHCP client.

{{empty}} indicates this criterion is not used for conditional serving.
	 *
	 * @since 1.4
	 * @param chaddr the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
		return this;
	}

	/**
	 * Get the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for conditional serving classification.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public MACAddress getChaddrMask() {
		return chaddrMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for conditional serving classification.
	 *
	 * @since 1.4
	 * @param chaddrMask the input value
	 */
	public void  setChaddrMask(MACAddress chaddrMask) {
		this.chaddrMask = chaddrMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|Chaddr}} is only to be done for bit positions set to one in the mask.  A mask of FF:FF:FF:FF:FF:FF  or {{empty}} indicates all bits of the {{param|Chaddr}} are to be used for conditional serving classification.
	 *
	 * @since 1.4
	 * @param chaddrMask the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withChaddrMask(MACAddress chaddrMask) {
		this.chaddrMask = chaddrMask;
		return this;
	}

	/**
	 * Get the if {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isChaddrExclude() {
		return chaddrExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 1.4
	 * @param chaddrExclude the input value
	 */
	public void  setChaddrExclude(Boolean chaddrExclude) {
		this.chaddrExclude = chaddrExclude;
	}

	/**
	 * Set the if {{false}}, matching packets are those that match the (masked) {{param|Chaddr}} entry, if specified.

If {{true}}, matching packets are those that do not match the (masked) {{param|Chaddr}} entry, if specified.
	 *
	 * @since 1.4
	 * @param chaddrExclude the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withChaddrExclude(Boolean chaddrExclude) {
		this.chaddrExclude = chaddrExclude;
		return this;
	}

	/**
	 * Get the if {{true}}, then the local DHCP server will assign an IP address from the specific address pool specified in this object. If {{false}}, the DHCP server will send the request to the {{param|DHCPServerIPAddress}} configured for this pool.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isLocallyServed() {
		return locallyServed;
	}

	/**
	 * Set the if {{true}}, then the local DHCP server will assign an IP address from the specific address pool specified in this object. If {{false}}, the DHCP server will send the request to the {{param|DHCPServerIPAddress}} configured for this pool.
	 *
	 * @since 1.4
	 * @param locallyServed the input value
	 */
	public void  setLocallyServed(Boolean locallyServed) {
		this.locallyServed = locallyServed;
	}

	/**
	 * Set the if {{true}}, then the local DHCP server will assign an IP address from the specific address pool specified in this object. If {{false}}, the DHCP server will send the request to the {{param|DHCPServerIPAddress}} configured for this pool.
	 *
	 * @since 1.4
	 * @param locallyServed the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withLocallyServed(Boolean locallyServed) {
		this.locallyServed = locallyServed;
		return this;
	}

	/**
	 * Get the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getMinAddress() {
		return minAddress;
	}

	/**
	 * Set the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param minAddress the input value
	 */
	public void  setMinAddress(IPAddress minAddress) {
		this.minAddress = minAddress;
	}

	/**
	 * Set the specifies first address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param minAddress the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withMinAddress(IPAddress minAddress) {
		this.minAddress = minAddress;
		return this;
	}

	/**
	 * Get the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getMaxAddress() {
		return maxAddress;
	}

	/**
	 * Set the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param maxAddress the input value
	 */
	public void  setMaxAddress(IPAddress maxAddress) {
		this.maxAddress = maxAddress;
	}

	/**
	 * Set the specifies last address in the pool to be assigned by the DHCP server on the LAN interface.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param maxAddress the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withMaxAddress(IPAddress maxAddress) {
		this.maxAddress = maxAddress;
		return this;
	}

	/**
	 * Get the ip addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getReservedAddresses() {
		return reservedAddresses;
	}

	/**
	 * Set the ip addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.4
	 * @param reservedAddresses the input value
	 */
	public void  setReservedAddresses(IPAddress reservedAddresses) {
		this.reservedAddresses = reservedAddresses;
	}

	/**
	 * Set the ip addresses marked reserved from the address allocation pool.
	 *
	 * @since 1.4
	 * @param reservedAddresses the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withReservedAddresses(IPAddress reservedAddresses) {
		this.reservedAddresses = reservedAddresses;
		return this;
	}

	/**
	 * Get the specifies the client's network subnet mask.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the specifies the client's network subnet mask.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.

This parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the dns servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getDnsServers() {
		return dnsServers;
	}

	/**
	 * Set the dns servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.
	 *
	 * @since 1.4
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the dns servers offered to DHCP clients.  Support for more than three DNS Servers is OPTIONAL.

This parameter is configurable only if {{param|UseAllocatedWAN}} is {{enum|Normal|UseAllocatedWAN}}.
	 *
	 * @since 1.4
	 * @param dnsServers the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withDnsServers(IPAddress dnsServers) {
		this.dnsServers = dnsServers;
		return this;
	}

	/**
	 * Get the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * Set the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.4
	 * @param domainName the input value
	 */
	public void  setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Set the sets the domain name to provide to clients on the LAN interface.
	 *
	 * @since 1.4
	 * @param domainName the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withDomainName(String domainName) {
		this.domainName = domainName;
		return this;
	}

	/**
	 * Get the ip addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getIprouters() {
		return iprouters;
	}

	/**
	 * Set the ip addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.4
	 * @param iprouters the input value
	 */
	public void  setIprouters(IPAddress iprouters) {
		this.iprouters = iprouters;
	}

	/**
	 * Set the ip addresses of routers on this subnet.  Also known as default gateway.  Support for more than one Router address is OPTIONAL.
	 *
	 * @since 1.4
	 * @param iprouters the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withIprouters(IPAddress iprouters) {
		this.iprouters = iprouters;
		return this;
	}

	/**
	 * Get the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getDhcPLeaseTime() {
		return dhcPLeaseTime;
	}

	/**
	 * Set the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.4
	 * @param dhcPLeaseTime the input value
	 */
	public void  setDhcPLeaseTime(Integer dhcPLeaseTime) {
		this.dhcPLeaseTime = dhcPLeaseTime;
	}

	/**
	 * Set the specifies the lease time in seconds of client assigned addresses.  A value of -1 indicates an infinite lease.
	 *
	 * @since 1.4
	 * @param dhcPLeaseTime the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withDhcPLeaseTime(Integer dhcPLeaseTime) {
		this.dhcPLeaseTime = dhcPLeaseTime;
		return this;
	}

	/**
	 * Get the controls whether the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are configurable or are taken from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the above-mentioned pool parameters are directly configured by the ACS.

If {{enum|Passthrough}}, the above-mentioned pool parameters cannot be configured by the ACS.  Their values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getUseAllocatedWAN() {
		return useAllocatedWAN;
	}

	/**
	 * Set the controls whether the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are configurable or are taken from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the above-mentioned pool parameters are directly configured by the ACS.

If {{enum|Passthrough}}, the above-mentioned pool parameters cannot be configured by the ACS.  Their values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.
	 *
	 * @since 1.4
	 * @param useAllocatedWAN the input value
	 */
	public void  setUseAllocatedWAN(String useAllocatedWAN) {
		this.useAllocatedWAN = useAllocatedWAN;
	}

	/**
	 * Set the controls whether the {{param|MinAddress}}, {{param|MaxAddress}}, {{param|SubnetMask}} and {{param|DNSServers}} parameters are configurable or are taken from the associated WAN connection.  {{enum}}

If {{enum|Normal}}, the above-mentioned pool parameters are directly configured by the ACS.

If {{enum|Passthrough}}, the above-mentioned pool parameters cannot be configured by the ACS.  Their values are instead taken from the WAN connection specified by {{param|AssociatedConnection}}.
	 *
	 * @since 1.4
	 * @param useAllocatedWAN the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withUseAllocatedWAN(String useAllocatedWAN) {
		this.useAllocatedWAN = useAllocatedWAN;
		return this;
	}

	/**
	 * Get the {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|Passthrough|UseAllocatedWAN}}}} The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getAssociatedConnection() {
		return associatedConnection;
	}

	/**
	 * Set the {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|Passthrough|UseAllocatedWAN}}}} The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param associatedConnection the input value
	 */
	public void  setAssociatedConnection(String associatedConnection) {
		this.associatedConnection = associatedConnection;
	}

	/**
	 * Set the {{reference|the connection instance to be used for address allocation if {{param|UseAllocatedWAN}} is set to {{enum|Passthrough|UseAllocatedWAN}}}} The content is the full hierarchical parameter name of a WAN-side layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

If {{param|UseAllocatedWAN}} is {{enum|Passthrough|UseAllocatedWAN}}, this parameter MUST have a valid value before this pool can be enabled.
	 *
	 * @since 1.4
	 * @param associatedConnection the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withAssociatedConnection(String associatedConnection) {
		this.associatedConnection = associatedConnection;
		return this;
	}

	/**
	 * Get the ip address of the DHCP server, where the request has to be sent to when there is a conditional match with this pool and {{param|LocallyServed}} is {{false}}. If this parameter is not configured, then the DHCP request is dropped.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public IPAddress getDhcPServerIPAddress() {
		return dhcPServerIPAddress;
	}

	/**
	 * Set the ip address of the DHCP server, where the request has to be sent to when there is a conditional match with this pool and {{param|LocallyServed}} is {{false}}. If this parameter is not configured, then the DHCP request is dropped.
	 *
	 * @since 1.4
	 * @param dhcPServerIPAddress the input value
	 */
	public void  setDhcPServerIPAddress(IPAddress dhcPServerIPAddress) {
		this.dhcPServerIPAddress = dhcPServerIPAddress;
	}

	/**
	 * Set the ip address of the DHCP server, where the request has to be sent to when there is a conditional match with this pool and {{param|LocallyServed}} is {{false}}. If this parameter is not configured, then the DHCP request is dropped.
	 *
	 * @since 1.4
	 * @param dhcPServerIPAddress the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withDhcPServerIPAddress(IPAddress dhcPServerIPAddress) {
		this.dhcPServerIPAddress = dhcPServerIPAddress;
		return this;
	}

	/**
	 * Get the dhcP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in the main pool and/or one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @return the value
	 */
	public Collection<DHCPStaticAddress> getDhcPStaticAddresss() {
		if (this.dhcPStaticAddresss == null){ this.dhcPStaticAddresss=new ArrayList<>();}
		return dhcPStaticAddresss;
	}

	/**
	 * Set the dhcP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in the main pool and/or one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @param dhcPStaticAddresss the input value
	 */
	public void  setDhcPStaticAddresss(Collection<DHCPStaticAddress> dhcPStaticAddresss) {
		this.dhcPStaticAddresss = dhcPStaticAddresss;
	}

	/**
	 * Set the dhcP static address table.

Entries in this table correspond to what RFC 2131 {{bibref|RFC2131}} calls "manual allocation", where a client's IP address is assigned by the network administrator, and DHCP is used simply to convey the assigned address to the client.

Each instance of this object specifies a hardware address (MAC address) and an IP address within the pool.  When serving from this pool, this IP address MUST, if available, be assigned to the DHCP client with this hardware address, and MUST NOT be assigned to any other client.

Note that it is possible that an IP address in this table is present in the main pool and/or one or more of the other conditional serving pools, in which case it is possible that such an address will be assigned to a different client.
	 *
	 * @param dhcPStaticAddress the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withDHCPStaticAddress(DHCPStaticAddress dhcPStaticAddress) {
		getDhcPStaticAddresss().add(dhcPStaticAddress);
		return this;
	}

	/**
	 * Get the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are associated with this pool.
	 *
	 * @return the value
	 */
	public Collection<DHCPOption> getDhcPOptions() {
		if (this.dhcPOptions == null){ this.dhcPOptions=new ArrayList<>();}
		return dhcPOptions;
	}

	/**
	 * Set the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are associated with this pool.
	 *
	 * @param dhcPOptions the input value
	 */
	public void  setDhcPOptions(Collection<DHCPOption> dhcPOptions) {
		this.dhcPOptions = dhcPOptions;
	}

	/**
	 * Set the this object specifies the DHCP options that MUST, if enabled, be returned to clients whose DHCP requests are associated with this pool.
	 *
	 * @param dhcPOption the input value
	 * @return this instance
	 */
	public DHCPConditionalServingPool withDHCPOption(DHCPOption dhcPOption) {
		getDhcPOptions().add(dhcPOption);
		return this;
	}

	//</editor-fold>

}