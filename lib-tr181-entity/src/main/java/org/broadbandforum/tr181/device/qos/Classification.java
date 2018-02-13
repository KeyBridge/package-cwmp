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
package org.broadbandforum.tr181.device.qos;

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
import org.broadbandforum.tr181.datatypes.IPPrefix;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * Classification table.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as classification criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.QoS.Classification.{i}.")
@XmlRootElement(name = "Classification")
@XmlType(name = "Device.QoS.Classification")
@XmlAccessorType(XmlAccessType.FIELD)
public class Classification {

	/**
	 * Enables or disables this classifier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this classifier.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * Position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Order")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long order;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as classification criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DHCPType")
	@CWMPParameter(access = "readWrite")
	public String dhcPType = "DHCPv4";
	/**
	 * Classification criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Classifications'' can be instantiated is a local matter to the CPE.

          Note that this parameter is permitted to reference ''Tunnel'' instances in order to classify upstream packets that have just been encapsulated (such packets are conceptually similar to locally-generated traffic).  For example, this parameter might reference a {{object|.GRE.Tunnel}} or a {{object|.MAP.Domain}} instance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Classification criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllInterfaces")
	@CWMPParameter(access = "readWrite")
	public Boolean allInterfaces = false;
	/**
	 * Classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIP;
	/**
	 * Destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMask")
	@CWMPParameter(access = "readWrite")
	public IPPrefix destMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destIPExclude = false;
	/**
	 * Classification criterion.

          Source IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIP;
	/**
	 * Source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMask")
	@CWMPParameter(access = "readWrite")
	public IPPrefix sourceMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceIPExclude = false;
	/**
	 * Classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 255)
	public Integer protocol = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProtocolExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean protocolExclude = false;
	/**
	 * Classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 */
	@XmlElement(name = "DestPortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer destPortRangeMax = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestPortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destPortExclude = false;
	/**
	 * Classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 */
	@XmlElement(name = "SourcePortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Integer sourcePortRangeMax = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range),  if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourcePortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourcePortExclude = false;
	/**
	 * Classification criterion.

          Source MAC Address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress sourceMACAddress;
	/**
	 * Bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|SourceMACAddress}} is  only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|SourceMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACMask")
	@CWMPParameter(access = "readWrite")
	public MACAddress sourceMACMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) {{param|SourceMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceMACExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACExclude = false;
	/**
	 * Classification criterion.

          Destination MAC Address.  {{empty}} indicates this criterion is not used for classification.

          The use of destination MAC address as a classification criterion is primarily useful only for bridged traffic.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress destMACAddress;
	/**
	 * Bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|DestMACAddress}} is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|DestMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACMask")
	@CWMPParameter(access = "readWrite")
	public MACAddress destMACMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) {{param|DestMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|DestMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACExclude = false;
	/**
	 * Classification criterion.

          Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for  classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Ethertype")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethertype = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|Ethertype}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Ethertype}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthertypeExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ethertypeExclude = false;
	/**
	 * Classification criterion.

          SSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSAP")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ssaP = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|SSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SSAP}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSAPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ssaPExclude = false;
	/**
	 * Classification criterion.

          DSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSAP")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer dsaP = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|DSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSAP}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSAPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean dsaPExclude = false;
	/**
	 * Classification criterion.

          Control element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LLCControl")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer llcControl = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|LLCControl}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|LLCControl}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LLCControlExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean llcControlExclude = false;
	/**
	 * Classification criterion.

          OUI element in the SNAP header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNAPOUI")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer snaPOUI = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|SNAPOUI}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SNAPOUI}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNAPOUIExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean snaPOUIExclude = false;
	/**
	 * Classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|SourceVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceVendorClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public String sourceVendorClassID;
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceVendorClassIDv6")
	@CWMPParameter(access = "readWrite")
	public byte[] sourceVendorClassIDv6;
	/**
	 * If {{false}}, the class includes only those packets sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceVendorClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceVendorClassIDExclude = false;
	/**
	 * SourceVendorClassID pattern match criterion.  {{enum}}

          For example, if {{param|SourceVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}}  values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceVendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String sourceVendorClassIDMode = "Exact";
	/**
	 * Classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|DestVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestVendorClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 255)
	public String destVendorClassID;
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestVendorClassIDv6")
	@CWMPParameter(access = "readWrite")
	public byte[] destVendorClassIDv6;
	/**
	 * If {{false}}, the class includes only those packets destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestVendorClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destVendorClassIDExclude = false;
	/**
	 * {{param|DestVendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|DestVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values  of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestVendorClassIDMode")
	@CWMPParameter(access = "readWrite")
	public String destVendorClassIDMode = "Exact";
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceClientID")
	@CWMPParameter(access = "readWrite")
	public byte[] sourceClientID;
	/**
	 * If {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceClientIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceClientIDExclude = false;
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestClientID")
	@CWMPParameter(access = "readWrite")
	public byte[] destClientID;
	/**
	 * If {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestClientIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destClientIDExclude = false;
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceUserClassID")
	@CWMPParameter(access = "readWrite")
	public byte[] sourceUserClassID;
	/**
	 * If {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceUserClassID}} entry,  if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceUserClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceUserClassIDExclude = false;
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestUserClassID")
	@CWMPParameter(access = "readWrite")
	public byte[] destUserClassID;
	/**
	 * If {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestUserClassID}} entry, if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestUserClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destUserClassIDExclude = false;
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|SourceVendorSpecificInfoEnterprise}} and {{param|SourceVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceVendorSpecificInfo")
	@CWMPParameter(access = "readWrite")
	public byte[] sourceVendorSpecificInfo;
	/**
	 * If {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceVendorSpecificInfoExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceVendorSpecificInfoExclude = false;
	/**
	 * {{param|SourceVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceVendorSpecificInfoEnterprise")
	@CWMPParameter(access = "readWrite")
	public Long sourceVendorSpecificInfoEnterprise = 0L;
	/**
	 * {{param|SourceVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SourceVendorSpecificInfoSubOption")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Integer sourceVendorSpecificInfoSubOption = 0;
	/**
	 * Classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|DestVendorSpecificInfoEnterprise}} and {{param|DestVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestVendorSpecificInfo")
	@CWMPParameter(access = "readWrite")
	public byte[] destVendorSpecificInfo;
	/**
	 * If {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestVendorSpecificInfoExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destVendorSpecificInfoExclude = false;
	/**
	 * {{param|DestVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestVendorSpecificInfoEnterprise")
	@CWMPParameter(access = "readWrite")
	public Long destVendorSpecificInfoEnterprise = 0L;
	/**
	 * {{param|DestVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestVendorSpecificInfoSubOption")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Integer destVendorSpecificInfoSubOption = 0;
	/**
	 * Classification criterion.

          If {{false}}, this criterion is not used for classification.

          If {{true}}, this criterion matches with all TCP segments that have the ACK control bit set.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCPACK")
	@CWMPParameter(access = "readWrite")
	public Boolean tcpACK = false;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|TCPACK}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|TCPACK}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCPACKExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean tcpACKExclude = false;
	/**
	 * Classification criterion.

          Minimum IP Packet Length (including header) in bytes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPLengthMin")
	@CWMPParameter(access = "readWrite")
	public Long iplengthMin = 0L;
	/**
	 * Classification criterion.

          Maximum IP Packet Length (including header) in bytes.

          A value of zero indicates that no maximum is specified (an umlimited maximum length).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPLengthMax")
	@CWMPParameter(access = "readWrite")
	public Long iplengthMax = 0L;
	/**
	 * If {{false}}, the class includes only those packets whose length (including header) falls within the inclusive  range {{param|IPLengthMin}} through {{param|IPLengthMax}}.  A value of zero for both {{param|IPLengthMin}} and {{param|IPLengthMax}}  allows any length packet.  An equal non-zero value of {{param|IPLengthMin}} and {{param|IPLengthMax}} allows only a packet with the exact length specified.

          If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range  {{param|IPLengthMin}} through {{param|IPLengthMax}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPLengthExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean iplengthExclude = false;
	/**
	 * Classification criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid  match.

          A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 63)
	public Integer dscPCheck = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|DSCPCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSCPCheck}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean dscPExclude = false;
	/**
	 * Classification result.

          DSCP to mark traffic with that falls into this classification entry.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer dscPMark = -1;
	/**
	 * Classification criterion.

          Current Ethernet priority of a VLAN Tag as defined in {{bibref|802.1Q-2011}} or Ethernet Priority field as defined in 802.1D. If more than 1 VLAN tag is present, then this parameter represents the outer VLAN Tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetPriorityCheck = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|EthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ethernetPriorityExclude = false;
	/**
	 * Classification result.

          Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this classification entry associated with the {{param|EthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer ethernetPriorityMark = -1;
	/**
	 * Classification criterion.

          Current Ethernet priority of the inner VLAN Tag as defined in 802.1Q. This parameter is only applicable when the PDU has 2 VLAN Tags. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "InnerEthernetPriorityCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer innerEthernetPriorityCheck = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "InnerEthernetPriorityExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean innerEthernetPriorityExclude = false;
	/**
	 * Classification result.

          Ethernet priority code to mark traffic with that falls into this classification entry associated with the {{param|InnerEthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "InnerEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer innerEthernetPriorityMark = -1;
	/**
	 * Classification criterion.

          Current Ethernet Drop eligible Indication (DEI) of the VLAN tag as defined in 802.1Q. If 2 VLAN Tags are present, then this parameter represents the outer VLAN tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "EthernetDEICheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetDEICheck = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|EthernetDEICheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetDEICheck}} entry, if specified.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "EthernetDEIExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ethernetDEIExclude = false;
	/**
	 * Classification criterion.

          Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANIDCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDCheck = -1;
	/**
	 * If {{false}}, the class includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean vlaNIDExclude = false;
	/**
	 * Classification criterion.

          Allows traffic to be distinguished based on out-of-band information such as physical port or application ID.  Primarily intended for,  but not restricted to, locally sourced traffic.

          If specified, this entry applies to traffic with matching out-of-band information.  A value of -1 indicates this criterion is not  used for classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutOfBandInfo")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer outOfBandInfo = -1;
	/**
	 * Classification result.

          Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long forwardingPolicy = 0L;
	/**
	 * Classification result.

          Identifier of the traffic class associated with traffic that falls in this classification.  If specified, at least one {{object|#.Queue}} table entry MUST include this traffic class in its {{param|#.Queue.{i}.TrafficClasses}} parameter (which is a comma-separated list).

          A value of -1 indicates a null traffic class.

          {{param}} and {{param|App}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is {{null}}, {{param|App}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TrafficClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer trafficClass = -1;
	/**
	 * Classification result. {{reference}} 

          Indicates the ''Policer'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null policer.

          {{param}} MAY optionally be specified in conjunction with {{param|TrafficClass}}. {{param}} and {{param|App}} are mutually exclusive.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Policer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String policer;
	/**
	 * Classification result. {{reference}} 

          Indicates the ''App'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null ''App''.

          {{param|TrafficClass}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|TrafficClass}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "App")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String app;

	public Classification() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this classifier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this classifier.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this classifier.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Classification withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this classifier.  {{enum}}

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
	 * Set the status of this classifier.  {{enum}}

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
	 * Set the status of this classifier.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Classification withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrder() {
		return order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 */
	public void  setOrder(Long order) {
		this.order = order;
	}

	/**
	 * Set the position of the {{object}} entry in the order of precedence.  A value of ''1'' indicates the first entry considered (highest precedence).  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

          When this value is modified, if the value matches that of an existing entry, the {{param}} value for the existing entry and all lower {{param}} entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes {{param}} values to be compacted. When a value is changed, incrementing occurs before compaction.

          The value of {{param}} on creation of a {{object}} table entry MUST be one greater than the largest current value (initially assigned the lowest precedence).
	 *
	 * @since 2.0
	 * @param order the input value
	 * @return this instance
	 */
	public Classification withOrder(Long order) {
		this.order = order;
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
	public Classification withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as classification criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getDhcPType() {
		return dhcPType;
	}

	/**
	 * Set the DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as classification criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 * @param dhcPType the input value
	 */
	public void  setDhcPType(String dhcPType) {
		this.dhcPType = dhcPType;
	}

	/**
	 * Set the DHCP protocol associated with the {{object}} instance. Affects only parameters that specify DHCP option values as classification criteria (all such parameter descriptions note this fact).  {{enum}}

          If {{param}} is {{enum|DHCPv4}}, then {{object}} parameters that are DHCPv6-specific are ignored. If {{param}} is {{enum|DHCPv6}}, then {{object}} parameters that are DHCPv4-specific are ignored.
	 *
	 * @since 2.2
	 * @param dhcPType the input value
	 * @return this instance
	 */
	public Classification withDhcPType(String dhcPType) {
		this.dhcPType = dhcPType;
		return this;
	}

	/**
	 * Get the classification criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Classifications'' can be instantiated is a local matter to the CPE.

          Note that this parameter is permitted to reference ''Tunnel'' instances in order to classify upstream packets that have just been encapsulated (such packets are conceptually similar to locally-generated traffic).  For example, this parameter might reference a {{object|.GRE.Tunnel}} or a {{object|.MAP.Domain}} instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the classification criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Classifications'' can be instantiated is a local matter to the CPE.

          Note that this parameter is permitted to reference ''Tunnel'' instances in order to classify upstream packets that have just been encapsulated (such packets are conceptually similar to locally-generated traffic).  For example, this parameter might reference a {{object|.GRE.Tunnel}} or a {{object|.MAP.Domain}} instance.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the classification criterion. {{reference}}  

          This specifies the ingress interface associated with the entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Classifications'' can be instantiated is a local matter to the CPE.

          Note that this parameter is permitted to reference ''Tunnel'' instances in order to classify upstream packets that have just been encapsulated (such packets are conceptually similar to locally-generated traffic).  For example, this parameter might reference a {{object|.GRE.Tunnel}} or a {{object|.MAP.Domain}} instance.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Classification with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the classification criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAllInterfaces() {
		return allInterfaces;
	}

	/**
	 * Set the classification criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.0
	 * @param allInterfaces the input value
	 */
	public void  setAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
	}

	/**
	 * Set the classification criterion. This specifies that all ingress interfaces are associated with the entry. If {{true}}, the value of {{param|Interface}} is ignored since all ingress interfaces are indicated.
	 *
	 * @since 2.0
	 * @param allInterfaces the input value
	 * @return this instance
	 */
	public Classification withAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
		return this;
	}

	/**
	 * Get the classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getDestIP() {
		return destIP;
	}

	/**
	 * Set the classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param destIP the input value
	 */
	public void  setDestIP(IPAddress destIP) {
		this.destIP = destIP;
	}

	/**
	 * Set the classification criterion.

          Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param destIP the input value
	 * @return this instance
	 */
	public Classification withDestIP(IPAddress destIP) {
		this.destIP = destIP;
		return this;
	}

	/**
	 * Get the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPPrefix getDestMask() {
		return destMask;
	}

	/**
	 * Set the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 * @param destMask the input value
	 */
	public void  setDestMask(IPPrefix destMask) {
		this.destMask = destMask;
	}

	/**
	 * Set the destination IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 * @param destMask the input value
	 * @return this instance
	 */
	public Classification withDestMask(IPPrefix destMask) {
		this.destMask = destMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestIPExclude() {
		return destIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.0
	 * @param destIPExclude the input value
	 */
	public void  setDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

          If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 2.0
	 * @param destIPExclude the input value
	 * @return this instance
	 */
	public Classification withDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Source IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getSourceIP() {
		return sourceIP;
	}

	/**
	 * Set the classification criterion.

          Source IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param sourceIP the input value
	 */
	public void  setSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
	}

	/**
	 * Set the classification criterion.

          Source IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param sourceIP the input value
	 * @return this instance
	 */
	public Classification withSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
		return this;
	}

	/**
	 * Get the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPPrefix getSourceMask() {
		return sourceMask;
	}

	/**
	 * Set the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 * @param sourceMask the input value
	 */
	public void  setSourceMask(IPPrefix sourceMask) {
		this.sourceMask = sourceMask;
	}

	/**
	 * Set the source IP address mask, represented as an IP routing prefix using CIDR notation [RFC4632]. The IP address part MUST be {{empty}} (and, if specified, MUST be ignored).
	 *
	 * @since 2.0
	 * @param sourceMask the input value
	 * @return this instance
	 */
	public Classification withSourceMask(IPPrefix sourceMask) {
		this.sourceMask = sourceMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceIPExclude() {
		return sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.0
	 * @param sourceIPExclude the input value
	 */
	public void  setSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceIP}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceIP}} entry, if specified.
	 *
	 * @since 2.0
	 * @param sourceIPExclude the input value
	 * @return this instance
	 */
	public Classification withSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * Set the classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 */
	public void  setProtocol(Integer protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the classification criterion.

          Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 * @return this instance
	 */
	public Classification withProtocol(Integer protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isProtocolExclude() {
		return protocolExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.0
	 * @param protocolExclude the input value
	 */
	public void  setProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|Protocol}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Protocol}} entry, if specified.
	 *
	 * @since 2.0
	 * @param protocolExclude the input value
	 * @return this instance
	 */
	public Classification withProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDestPort() {
		return destPort;
	}

	/**
	 * Set the classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param destPort the input value
	 */
	public void  setDestPort(Integer destPort) {
		this.destPort = destPort;
	}

	/**
	 * Set the classification criterion.

          Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param destPort the input value
	 * @return this instance
	 */
	public Classification withDestPort(Integer destPort) {
		this.destPort = destPort;
		return this;
	}

	/**
	 * Get the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|DestPort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to {{param|DestPort}}.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
	 * @param destPortRangeMax the input value
	 * @return this instance
	 */
	public Classification withDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestPortExclude() {
		return destPortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 * @param destPortExclude the input value
	 */
	public void  setDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DestPort}} entry (or port range), if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|DestPort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 * @param destPortExclude the input value
	 * @return this instance
	 */
	public Classification withDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSourcePort() {
		return sourcePort;
	}

	/**
	 * Set the classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param sourcePort the input value
	 */
	public void  setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
	}

	/**
	 * Set the classification criterion.

          Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param sourcePort the input value
	 * @return this instance
	 */
	public Classification withSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		return this;
	}

	/**
	 * Get the classification criterion.

          If specified, indicates the classification criterion is to include the port range from {{param|SourcePort}} through {{param}} (inclusive).  If specified, {{param}} MUST be greater than or equal to SourcePort.

          A value of -1 indicates that no port range is specified.
	 *
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
	 * @param sourcePortRangeMax the input value
	 * @return this instance
	 */
	public Classification withSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range),  if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourcePortExclude() {
		return sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range),  if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 * @param sourcePortExclude the input value
	 */
	public void  setSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SourcePort}} entry (or port range),  if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SourcePort}} entry (or port range), if  specified.
	 *
	 * @since 2.0
	 * @param sourcePortExclude the input value
	 * @return this instance
	 */
	public Classification withSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Source MAC Address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getSourceMACAddress() {
		return sourceMACAddress;
	}

	/**
	 * Set the classification criterion.

          Source MAC Address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param sourceMACAddress the input value
	 */
	public void  setSourceMACAddress(MACAddress sourceMACAddress) {
		this.sourceMACAddress = sourceMACAddress;
	}

	/**
	 * Set the classification criterion.

          Source MAC Address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param sourceMACAddress the input value
	 * @return this instance
	 */
	public Classification withSourceMACAddress(MACAddress sourceMACAddress) {
		this.sourceMACAddress = sourceMACAddress;
		return this;
	}

	/**
	 * Get the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|SourceMACAddress}} is  only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|SourceMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getSourceMACMask() {
		return sourceMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|SourceMACAddress}} is  only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|SourceMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 * @param sourceMACMask the input value
	 */
	public void  setSourceMACMask(MACAddress sourceMACMask) {
		this.sourceMACMask = sourceMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|SourceMACAddress}} is  only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|SourceMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 * @param sourceMACMask the input value
	 * @return this instance
	 */
	public Classification withSourceMACMask(MACAddress sourceMACMask) {
		this.sourceMACMask = sourceMACMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceMACExclude() {
		return sourceMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param sourceMACExclude the input value
	 */
	public void  setSourceMACExclude(Boolean sourceMACExclude) {
		this.sourceMACExclude = sourceMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|SourceMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|SourceMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param sourceMACExclude the input value
	 * @return this instance
	 */
	public Classification withSourceMACExclude(Boolean sourceMACExclude) {
		this.sourceMACExclude = sourceMACExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Destination MAC Address.  {{empty}} indicates this criterion is not used for classification.

          The use of destination MAC address as a classification criterion is primarily useful only for bridged traffic.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getDestMACAddress() {
		return destMACAddress;
	}

	/**
	 * Set the classification criterion.

          Destination MAC Address.  {{empty}} indicates this criterion is not used for classification.

          The use of destination MAC address as a classification criterion is primarily useful only for bridged traffic.
	 *
	 * @since 2.0
	 * @param destMACAddress the input value
	 */
	public void  setDestMACAddress(MACAddress destMACAddress) {
		this.destMACAddress = destMACAddress;
	}

	/**
	 * Set the classification criterion.

          Destination MAC Address.  {{empty}} indicates this criterion is not used for classification.

          The use of destination MAC address as a classification criterion is primarily useful only for bridged traffic.
	 *
	 * @since 2.0
	 * @param destMACAddress the input value
	 * @return this instance
	 */
	public Classification withDestMACAddress(MACAddress destMACAddress) {
		this.destMACAddress = destMACAddress;
		return this;
	}

	/**
	 * Get the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|DestMACAddress}} is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|DestMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getDestMACMask() {
		return destMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|DestMACAddress}} is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|DestMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 * @param destMACMask the input value
	 */
	public void  setDestMACMask(MACAddress destMACMask) {
		this.destMACMask = destMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the {{param|DestMACAddress}} is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the  {{param|DestMACAddress}} are to be used for classification.
	 *
	 * @since 2.0
	 * @param destMACMask the input value
	 * @return this instance
	 */
	public Classification withDestMACMask(MACAddress destMACMask) {
		this.destMACMask = destMACMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) {{param|DestMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|DestMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestMACExclude() {
		return destMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|DestMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|DestMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param destMACExclude the input value
	 */
	public void  setDestMACExclude(Boolean destMACExclude) {
		this.destMACExclude = destMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) {{param|DestMACAddress}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the (masked) {{param|DestMACAddress}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param destMACExclude the input value
	 * @return this instance
	 */
	public Classification withDestMACExclude(Boolean destMACExclude) {
		this.destMACExclude = destMACExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for  classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthertype() {
		return ethertype;
	}

	/**
	 * Set the classification criterion.

          Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for  classification.
	 *
	 * @since 2.0
	 * @param ethertype the input value
	 */
	public void  setEthertype(Integer ethertype) {
		this.ethertype = ethertype;
	}

	/**
	 * Set the classification criterion.

          Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for  classification.
	 *
	 * @since 2.0
	 * @param ethertype the input value
	 * @return this instance
	 */
	public Classification withEthertype(Integer ethertype) {
		this.ethertype = ethertype;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|Ethertype}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Ethertype}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEthertypeExclude() {
		return ethertypeExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|Ethertype}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Ethertype}} entry, if specified.
	 *
	 * @since 2.0
	 * @param ethertypeExclude the input value
	 */
	public void  setEthertypeExclude(Boolean ethertypeExclude) {
		this.ethertypeExclude = ethertypeExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|Ethertype}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|Ethertype}} entry, if specified.
	 *
	 * @since 2.0
	 * @param ethertypeExclude the input value
	 * @return this instance
	 */
	public Classification withEthertypeExclude(Boolean ethertypeExclude) {
		this.ethertypeExclude = ethertypeExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          SSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSsaP() {
		return ssaP;
	}

	/**
	 * Set the classification criterion.

          SSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param ssaP the input value
	 */
	public void  setSsaP(Integer ssaP) {
		this.ssaP = ssaP;
	}

	/**
	 * Set the classification criterion.

          SSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param ssaP the input value
	 * @return this instance
	 */
	public Classification withSsaP(Integer ssaP) {
		this.ssaP = ssaP;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|SSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SSAP}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSsaPExclude() {
		return ssaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SSAP}} entry, if specified.
	 *
	 * @since 2.0
	 * @param ssaPExclude the input value
	 */
	public void  setSsaPExclude(Boolean ssaPExclude) {
		this.ssaPExclude = ssaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SSAP}} entry, if specified.
	 *
	 * @since 2.0
	 * @param ssaPExclude the input value
	 * @return this instance
	 */
	public Classification withSsaPExclude(Boolean ssaPExclude) {
		this.ssaPExclude = ssaPExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          DSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDsaP() {
		return dsaP;
	}

	/**
	 * Set the classification criterion.

          DSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param dsaP the input value
	 */
	public void  setDsaP(Integer dsaP) {
		this.dsaP = dsaP;
	}

	/**
	 * Set the classification criterion.

          DSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param dsaP the input value
	 * @return this instance
	 */
	public Classification withDsaP(Integer dsaP) {
		this.dsaP = dsaP;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|DSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSAP}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDsaPExclude() {
		return dsaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSAP}} entry, if specified.
	 *
	 * @since 2.0
	 * @param dsaPExclude the input value
	 */
	public void  setDsaPExclude(Boolean dsaPExclude) {
		this.dsaPExclude = dsaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DSAP}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSAP}} entry, if specified.
	 *
	 * @since 2.0
	 * @param dsaPExclude the input value
	 * @return this instance
	 */
	public Classification withDsaPExclude(Boolean dsaPExclude) {
		this.dsaPExclude = dsaPExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Control element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLlcControl() {
		return llcControl;
	}

	/**
	 * Set the classification criterion.

          Control element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param llcControl the input value
	 */
	public void  setLlcControl(Integer llcControl) {
		this.llcControl = llcControl;
	}

	/**
	 * Set the classification criterion.

          Control element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param llcControl the input value
	 * @return this instance
	 */
	public Classification withLlcControl(Integer llcControl) {
		this.llcControl = llcControl;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|LLCControl}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|LLCControl}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLlcControlExclude() {
		return llcControlExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|LLCControl}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|LLCControl}} entry, if specified.
	 *
	 * @since 2.0
	 * @param llcControlExclude the input value
	 */
	public void  setLlcControlExclude(Boolean llcControlExclude) {
		this.llcControlExclude = llcControlExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|LLCControl}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|LLCControl}} entry, if specified.
	 *
	 * @since 2.0
	 * @param llcControlExclude the input value
	 * @return this instance
	 */
	public Classification withLlcControlExclude(Boolean llcControlExclude) {
		this.llcControlExclude = llcControlExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          OUI element in the SNAP header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSnaPOUI() {
		return snaPOUI;
	}

	/**
	 * Set the classification criterion.

          OUI element in the SNAP header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param snaPOUI the input value
	 */
	public void  setSnaPOUI(Integer snaPOUI) {
		this.snaPOUI = snaPOUI;
	}

	/**
	 * Set the classification criterion.

          OUI element in the SNAP header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param snaPOUI the input value
	 * @return this instance
	 */
	public Classification withSnaPOUI(Integer snaPOUI) {
		this.snaPOUI = snaPOUI;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|SNAPOUI}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SNAPOUI}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSnaPOUIExclude() {
		return snaPOUIExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SNAPOUI}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SNAPOUI}} entry, if specified.
	 *
	 * @since 2.0
	 * @param snaPOUIExclude the input value
	 */
	public void  setSnaPOUIExclude(Boolean snaPOUIExclude) {
		this.snaPOUIExclude = snaPOUIExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|SNAPOUI}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|SNAPOUI}} entry, if specified.
	 *
	 * @since 2.0
	 * @param snaPOUIExclude the input value
	 * @return this instance
	 */
	public Classification withSnaPOUIExclude(Boolean snaPOUIExclude) {
		this.snaPOUIExclude = snaPOUIExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|SourceVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSourceVendorClassID() {
		return sourceVendorClassID;
	}

	/**
	 * Set the classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|SourceVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceVendorClassID the input value
	 */
	public void  setSourceVendorClassID(String sourceVendorClassID) {
		this.sourceVendorClassID = sourceVendorClassID;
	}

	/**
	 * Set the classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|SourceVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceVendorClassID the input value
	 * @return this instance
	 */
	public Classification withSourceVendorClassID(String sourceVendorClassID) {
		this.sourceVendorClassID = sourceVendorClassID;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getSourceVendorClassIDv6() {
		return sourceVendorClassIDv6;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param sourceVendorClassIDv6 the input value
	 */
	public void  setSourceVendorClassIDv6(byte[] sourceVendorClassIDv6) {
		this.sourceVendorClassIDv6 = sourceVendorClassIDv6;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param sourceVendorClassIDv6 the input value
	 * @return this instance
	 */
	public Classification withSourceVendorClassIDv6(byte[] sourceVendorClassIDv6) {
		this.sourceVendorClassIDv6 = sourceVendorClassIDv6;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceVendorClassIDExclude() {
		return sourceVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 * @param sourceVendorClassIDExclude the input value
	 */
	public void  setSourceVendorClassIDExclude(Boolean sourceVendorClassIDExclude) {
		this.sourceVendorClassIDExclude = sourceVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|SourceVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 * @param sourceVendorClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withSourceVendorClassIDExclude(Boolean sourceVendorClassIDExclude) {
		this.sourceVendorClassIDExclude = sourceVendorClassIDExclude;
		return this;
	}

	/**
	 * Get the sourceVendorClassID pattern match criterion.  {{enum}}

          For example, if {{param|SourceVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}}  values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSourceVendorClassIDMode() {
		return sourceVendorClassIDMode;
	}

	/**
	 * Set the sourceVendorClassID pattern match criterion.  {{enum}}

          For example, if {{param|SourceVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}}  values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param sourceVendorClassIDMode the input value
	 */
	public void  setSourceVendorClassIDMode(String sourceVendorClassIDMode) {
		this.sourceVendorClassIDMode = sourceVendorClassIDMode;
	}

	/**
	 * Set the sourceVendorClassID pattern match criterion.  {{enum}}

          For example, if {{param|SourceVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}}  values of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param sourceVendorClassIDMode the input value
	 * @return this instance
	 */
	public Classification withSourceVendorClassIDMode(String sourceVendorClassIDMode) {
		this.sourceVendorClassIDMode = sourceVendorClassIDMode;
		return this;
	}

	/**
	 * Get the classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|DestVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDestVendorClassID() {
		return destVendorClassID;
	}

	/**
	 * Set the classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|DestVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destVendorClassID the input value
	 */
	public void  setDestVendorClassID(String destVendorClassID) {
		this.destVendorClassID = destVendorClassID;
	}

	/**
	 * Set the classification criterion. 

          Used to identify one or more LAN devices, value of the DHCPv4 Vendor Class Identifier (Option 60) as defined in {{bibref|RFC2132}}, matched according to the criterion in {{param|DestVendorClassIDMode}}.  Case sensitive.

          This is a normal string, e.g. "abc" is represented as "abc" and not say "616263" hex. However, if the value includes non-printing characters then such characters have to be represented using XML escapes, e.g. #x0a for line-feed.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv4-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv4|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destVendorClassID the input value
	 * @return this instance
	 */
	public Classification withDestVendorClassID(String destVendorClassID) {
		this.destVendorClassID = destVendorClassID;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getDestVendorClassIDv6() {
		return destVendorClassIDv6;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param destVendorClassIDv6 the input value
	 */
	public void  setDestVendorClassIDv6(byte[] destVendorClassIDv6) {
		this.destVendorClassIDv6 = destVendorClassIDv6;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCPv6 Vendor Class Identifier (Option 16) as defined in {{bibref|RFC3315}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: This parameter is DHCPv6-specific. It only applies when {{param|DHCPType}} is {{enum|DHCPv6|DHCPType}}.
	 *
	 * @since 2.2
	 * @param destVendorClassIDv6 the input value
	 * @return this instance
	 */
	public Classification withDestVendorClassIDv6(byte[] destVendorClassIDv6) {
		this.destVendorClassIDv6 = destVendorClassIDv6;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestVendorClassIDExclude() {
		return destVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 * @param destVendorClassIDExclude the input value
	 */
	public void  setDestVendorClassIDExclude(Boolean destVendorClassIDExclude) {
		this.destVendorClassIDExclude = destVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorClassID}} entry (for {{enum|DHCPv4|DHCPType}}) or the {{param|DestVendorClassIDv6}} entry (for {{enum|DHCPv6|DHCPType}}), if specified.
	 *
	 * @since 2.0
	 * @param destVendorClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withDestVendorClassIDExclude(Boolean destVendorClassIDExclude) {
		this.destVendorClassIDExclude = destVendorClassIDExclude;
		return this;
	}

	/**
	 * Get the {{param|DestVendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|DestVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values  of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDestVendorClassIDMode() {
		return destVendorClassIDMode;
	}

	/**
	 * Set the {{param|DestVendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|DestVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values  of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param destVendorClassIDMode the input value
	 */
	public void  setDestVendorClassIDMode(String destVendorClassIDMode) {
		this.destVendorClassIDMode = destVendorClassIDMode;
	}

	/**
	 * Set the {{param|DestVendorClassID}} pattern match criterion.  {{enum}}

          For example, if {{param|DestVendorClassID}} is "Example" then an Option 60 value of "Example device" will match with {{param}} values  of {{enum|Prefix}} or {{enum|Substring}}, but not with {{enum|Exact}} or {{enum|Suffix}}.
	 *
	 * @since 2.0
	 * @param destVendorClassIDMode the input value
	 * @return this instance
	 */
	public Classification withDestVendorClassIDMode(String destVendorClassIDMode) {
		this.destVendorClassIDMode = destVendorClassIDMode;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSourceClientID() {
		return sourceClientID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param sourceClientID the input value
	 */
	public void  setSourceClientID(byte[] sourceClientID) {
		this.sourceClientID = sourceClientID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param sourceClientID the input value
	 * @return this instance
	 */
	public Classification withSourceClientID(byte[] sourceClientID) {
		this.sourceClientID = sourceClientID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceClientIDExclude() {
		return sourceClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param sourceClientIDExclude the input value
	 */
	public void  setSourceClientIDExclude(Boolean sourceClientIDExclude) {
		this.sourceClientIDExclude = sourceClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param sourceClientIDExclude the input value
	 * @return this instance
	 */
	public Classification withSourceClientIDExclude(Boolean sourceClientIDExclude) {
		this.sourceClientIDExclude = sourceClientIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDestClientID() {
		return destClientID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param destClientID the input value
	 */
	public void  setDestClientID(byte[] destClientID) {
		this.destClientID = destClientID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Client Identifier. The DHCP Client Identifier is Option 61 (as defined in {{bibref|RFC2132}}) for {{enum|DHCPv4|DHCPType}}, or is Option 1 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.

          Note: DHCPv6 Option 1 (Client Identifier) is sometimes referred to as ''DUID''.
	 *
	 * @since 2.0
	 * @param destClientID the input value
	 * @return this instance
	 */
	public Classification withDestClientID(byte[] destClientID) {
		this.destClientID = destClientID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestClientIDExclude() {
		return destClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param destClientIDExclude the input value
	 */
	public void  setDestClientIDExclude(Boolean destClientIDExclude) {
		this.destClientIDExclude = destClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestClientID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestClientID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param destClientIDExclude the input value
	 * @return this instance
	 */
	public Classification withDestClientIDExclude(Boolean destClientIDExclude) {
		this.destClientIDExclude = destClientIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSourceUserClassID() {
		return sourceUserClassID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceUserClassID the input value
	 */
	public void  setSourceUserClassID(byte[] sourceUserClassID) {
		this.sourceUserClassID = sourceUserClassID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceUserClassID the input value
	 * @return this instance
	 */
	public Classification withSourceUserClassID(byte[] sourceUserClassID) {
		this.sourceUserClassID = sourceUserClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceUserClassID}} entry,  if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceUserClassIDExclude() {
		return sourceUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceUserClassID}} entry,  if specified.
	 *
	 * @since 2.0
	 * @param sourceUserClassIDExclude the input value
	 */
	public void  setSourceUserClassIDExclude(Boolean sourceUserClassIDExclude) {
		this.sourceUserClassIDExclude = sourceUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceUserClassID}} entry,  if specified.
	 *
	 * @since 2.0
	 * @param sourceUserClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withSourceUserClassIDExclude(Boolean sourceUserClassIDExclude) {
		this.sourceUserClassIDExclude = sourceUserClassIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDestUserClassID() {
		return destUserClassID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destUserClassID the input value
	 */
	public void  setDestUserClassID(byte[] destUserClassID) {
		this.destUserClassID = destUserClassID;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP User Class Identifier. The DHCP User Class Identifier is Option 77 (as defined in {{bibref|RFC3004}}) for {{enum|DHCPv4|DHCPType}}, or is Option 15 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}. The option value is binary, so an exact match is REQUIRED.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destUserClassID the input value
	 * @return this instance
	 */
	public Classification withDestUserClassID(byte[] destUserClassID) {
		this.destUserClassID = destUserClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestUserClassID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestUserClassIDExclude() {
		return destUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestUserClassID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param destUserClassIDExclude the input value
	 */
	public void  setDestUserClassIDExclude(Boolean destUserClassIDExclude) {
		this.destUserClassIDExclude = destUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestUserClassID}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestUserClassID}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param destUserClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withDestUserClassIDExclude(Boolean destUserClassIDExclude) {
		this.destUserClassIDExclude = destUserClassIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|SourceVendorSpecificInfoEnterprise}} and {{param|SourceVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSourceVendorSpecificInfo() {
		return sourceVendorSpecificInfo;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|SourceVendorSpecificInfoEnterprise}} and {{param|SourceVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfo the input value
	 */
	public void  setSourceVendorSpecificInfo(byte[] sourceVendorSpecificInfo) {
		this.sourceVendorSpecificInfo = sourceVendorSpecificInfo;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|SourceVendorSpecificInfoEnterprise}} and {{param|SourceVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfo the input value
	 * @return this instance
	 */
	public Classification withSourceVendorSpecificInfo(byte[] sourceVendorSpecificInfo) {
		this.sourceVendorSpecificInfo = sourceVendorSpecificInfo;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSourceVendorSpecificInfoExclude() {
		return sourceVendorSpecificInfoExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfoExclude the input value
	 */
	public void  setSourceVendorSpecificInfoExclude(Boolean sourceVendorSpecificInfoExclude) {
		this.sourceVendorSpecificInfoExclude = sourceVendorSpecificInfoExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the  {{param|SourceVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those sourced from LAN devices that match the {{param|SourceVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfoExclude the input value
	 * @return this instance
	 */
	public Classification withSourceVendorSpecificInfoExclude(Boolean sourceVendorSpecificInfoExclude) {
		this.sourceVendorSpecificInfoExclude = sourceVendorSpecificInfoExclude;
		return this;
	}

	/**
	 * Get the {{param|SourceVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSourceVendorSpecificInfoEnterprise() {
		return sourceVendorSpecificInfoEnterprise;
	}

	/**
	 * Set the {{param|SourceVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfoEnterprise the input value
	 */
	public void  setSourceVendorSpecificInfoEnterprise(Long sourceVendorSpecificInfoEnterprise) {
		this.sourceVendorSpecificInfoEnterprise = sourceVendorSpecificInfoEnterprise;
	}

	/**
	 * Set the {{param|SourceVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfoEnterprise the input value
	 * @return this instance
	 */
	public Classification withSourceVendorSpecificInfoEnterprise(Long sourceVendorSpecificInfoEnterprise) {
		this.sourceVendorSpecificInfoEnterprise = sourceVendorSpecificInfoEnterprise;
		return this;
	}

	/**
	 * Get the {{param|SourceVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSourceVendorSpecificInfoSubOption() {
		return sourceVendorSpecificInfoSubOption;
	}

	/**
	 * Set the {{param|SourceVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfoSubOption the input value
	 */
	public void  setSourceVendorSpecificInfoSubOption(Integer sourceVendorSpecificInfoSubOption) {
		this.sourceVendorSpecificInfoSubOption = sourceVendorSpecificInfoSubOption;
	}

	/**
	 * Set the {{param|SourceVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 * @param sourceVendorSpecificInfoSubOption the input value
	 * @return this instance
	 */
	public Classification withSourceVendorSpecificInfoSubOption(Integer sourceVendorSpecificInfoSubOption) {
		this.sourceVendorSpecificInfoSubOption = sourceVendorSpecificInfoSubOption;
		return this;
	}

	/**
	 * Get the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|DestVendorSpecificInfoEnterprise}} and {{param|DestVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getDestVendorSpecificInfo() {
		return destVendorSpecificInfo;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|DestVendorSpecificInfoEnterprise}} and {{param|DestVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfo the input value
	 */
	public void  setDestVendorSpecificInfo(byte[] destVendorSpecificInfo) {
		this.destVendorSpecificInfo = destVendorSpecificInfo;
	}

	/**
	 * Set the classification criterion. 

          A hexbinary string used to identify one or more LAN devices, value of the DHCP Vendor-specific Information, matched according to the criteria in {{param|DestVendorSpecificInfoEnterprise}} and {{param|DestVendorSpecificInfoSubOption}}. The DHCP Vendor-specific Information is Option 125 (as defined in {{bibref|RFC3925}}) for {{enum|DHCPv4|DHCPType}}, or is Option 17 (as defined in {{bibref|RFC3315}}) for {{enum|DHCPv6|DHCPType}}.

          {{empty}} indicates this criterion is not used for classification.

          Note: DHCPv4 Option values are limited to a length of 255, while DHCPv6 Option values can have a maximum length of 65535.

          Note: This parameter is DHCP version neutral. The specific DHCP version in use with this parameter is indicated by {{param|DHCPType}}.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfo the input value
	 * @return this instance
	 */
	public Classification withDestVendorSpecificInfo(byte[] destVendorSpecificInfo) {
		this.destVendorSpecificInfo = destVendorSpecificInfo;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDestVendorSpecificInfoExclude() {
		return destVendorSpecificInfoExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfoExclude the input value
	 */
	public void  setDestVendorSpecificInfoExclude(Boolean destVendorSpecificInfoExclude) {
		this.destVendorSpecificInfoExclude = destVendorSpecificInfoExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the  {{param|DestVendorSpecificInfo}} entry, if specified.

          If {{true}}, the class includes all packets except those destined for LAN devices that match the {{param|DestVendorSpecificInfo}}  entry, if specified.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfoExclude the input value
	 * @return this instance
	 */
	public Classification withDestVendorSpecificInfoExclude(Boolean destVendorSpecificInfoExclude) {
		this.destVendorSpecificInfoExclude = destVendorSpecificInfoExclude;
		return this;
	}

	/**
	 * Get the {{param|DestVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDestVendorSpecificInfoEnterprise() {
		return destVendorSpecificInfoEnterprise;
	}

	/**
	 * Set the {{param|DestVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfoEnterprise the input value
	 */
	public void  setDestVendorSpecificInfoEnterprise(Long destVendorSpecificInfoEnterprise) {
		this.destVendorSpecificInfoEnterprise = destVendorSpecificInfoEnterprise;
	}

	/**
	 * Set the {{param|DestVendorSpecificInfo}} Enterprise Number as defined in {{bibref|RFC3925}}.

          The default value (0) is assigned to IANA and will probably need to be replaced with an appropriate enterprise number.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfoEnterprise the input value
	 * @return this instance
	 */
	public Classification withDestVendorSpecificInfoEnterprise(Long destVendorSpecificInfoEnterprise) {
		this.destVendorSpecificInfoEnterprise = destVendorSpecificInfoEnterprise;
		return this;
	}

	/**
	 * Get the {{param|DestVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDestVendorSpecificInfoSubOption() {
		return destVendorSpecificInfoSubOption;
	}

	/**
	 * Set the {{param|DestVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfoSubOption the input value
	 */
	public void  setDestVendorSpecificInfoSubOption(Integer destVendorSpecificInfoSubOption) {
		this.destVendorSpecificInfoSubOption = destVendorSpecificInfoSubOption;
	}

	/**
	 * Set the {{param|DestVendorSpecificInfo}} Sub Option Code as defined in {{bibref|RFC3925}}.
	 *
	 * @since 2.0
	 * @param destVendorSpecificInfoSubOption the input value
	 * @return this instance
	 */
	public Classification withDestVendorSpecificInfoSubOption(Integer destVendorSpecificInfoSubOption) {
		this.destVendorSpecificInfoSubOption = destVendorSpecificInfoSubOption;
		return this;
	}

	/**
	 * Get the classification criterion.

          If {{false}}, this criterion is not used for classification.

          If {{true}}, this criterion matches with all TCP segments that have the ACK control bit set.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isTcpACK() {
		return tcpACK;
	}

	/**
	 * Set the classification criterion.

          If {{false}}, this criterion is not used for classification.

          If {{true}}, this criterion matches with all TCP segments that have the ACK control bit set.
	 *
	 * @since 2.0
	 * @param tcpACK the input value
	 */
	public void  setTcpACK(Boolean tcpACK) {
		this.tcpACK = tcpACK;
	}

	/**
	 * Set the classification criterion.

          If {{false}}, this criterion is not used for classification.

          If {{true}}, this criterion matches with all TCP segments that have the ACK control bit set.
	 *
	 * @since 2.0
	 * @param tcpACK the input value
	 * @return this instance
	 */
	public Classification withTcpACK(Boolean tcpACK) {
		this.tcpACK = tcpACK;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|TCPACK}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|TCPACK}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isTcpACKExclude() {
		return tcpACKExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|TCPACK}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|TCPACK}} entry, if specified.
	 *
	 * @since 2.0
	 * @param tcpACKExclude the input value
	 */
	public void  setTcpACKExclude(Boolean tcpACKExclude) {
		this.tcpACKExclude = tcpACKExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|TCPACK}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|TCPACK}} entry, if specified.
	 *
	 * @since 2.0
	 * @param tcpACKExclude the input value
	 * @return this instance
	 */
	public Classification withTcpACKExclude(Boolean tcpACKExclude) {
		this.tcpACKExclude = tcpACKExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Minimum IP Packet Length (including header) in bytes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIplengthMin() {
		return iplengthMin;
	}

	/**
	 * Set the classification criterion.

          Minimum IP Packet Length (including header) in bytes.
	 *
	 * @since 2.0
	 * @param iplengthMin the input value
	 */
	public void  setIplengthMin(Long iplengthMin) {
		this.iplengthMin = iplengthMin;
	}

	/**
	 * Set the classification criterion.

          Minimum IP Packet Length (including header) in bytes.
	 *
	 * @since 2.0
	 * @param iplengthMin the input value
	 * @return this instance
	 */
	public Classification withIplengthMin(Long iplengthMin) {
		this.iplengthMin = iplengthMin;
		return this;
	}

	/**
	 * Get the classification criterion.

          Maximum IP Packet Length (including header) in bytes.

          A value of zero indicates that no maximum is specified (an umlimited maximum length).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getIplengthMax() {
		return iplengthMax;
	}

	/**
	 * Set the classification criterion.

          Maximum IP Packet Length (including header) in bytes.

          A value of zero indicates that no maximum is specified (an umlimited maximum length).
	 *
	 * @since 2.0
	 * @param iplengthMax the input value
	 */
	public void  setIplengthMax(Long iplengthMax) {
		this.iplengthMax = iplengthMax;
	}

	/**
	 * Set the classification criterion.

          Maximum IP Packet Length (including header) in bytes.

          A value of zero indicates that no maximum is specified (an umlimited maximum length).
	 *
	 * @since 2.0
	 * @param iplengthMax the input value
	 * @return this instance
	 */
	public Classification withIplengthMax(Long iplengthMax) {
		this.iplengthMax = iplengthMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets whose length (including header) falls within the inclusive  range {{param|IPLengthMin}} through {{param|IPLengthMax}}.  A value of zero for both {{param|IPLengthMin}} and {{param|IPLengthMax}}  allows any length packet.  An equal non-zero value of {{param|IPLengthMin}} and {{param|IPLengthMax}} allows only a packet with the exact length specified.

          If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range  {{param|IPLengthMin}} through {{param|IPLengthMax}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIplengthExclude() {
		return iplengthExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets whose length (including header) falls within the inclusive  range {{param|IPLengthMin}} through {{param|IPLengthMax}}.  A value of zero for both {{param|IPLengthMin}} and {{param|IPLengthMax}}  allows any length packet.  An equal non-zero value of {{param|IPLengthMin}} and {{param|IPLengthMax}} allows only a packet with the exact length specified.

          If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range  {{param|IPLengthMin}} through {{param|IPLengthMax}}.
	 *
	 * @since 2.0
	 * @param iplengthExclude the input value
	 */
	public void  setIplengthExclude(Boolean iplengthExclude) {
		this.iplengthExclude = iplengthExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets whose length (including header) falls within the inclusive  range {{param|IPLengthMin}} through {{param|IPLengthMax}}.  A value of zero for both {{param|IPLengthMin}} and {{param|IPLengthMax}}  allows any length packet.  An equal non-zero value of {{param|IPLengthMin}} and {{param|IPLengthMax}} allows only a packet with the exact length specified.

          If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range  {{param|IPLengthMin}} through {{param|IPLengthMax}}.
	 *
	 * @since 2.0
	 * @param iplengthExclude the input value
	 * @return this instance
	 */
	public Classification withIplengthExclude(Boolean iplengthExclude) {
		this.iplengthExclude = iplengthExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid  match.

          A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDscPCheck() {
		return dscPCheck;
	}

	/**
	 * Set the classification criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid  match.

          A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param dscPCheck the input value
	 */
	public void  setDscPCheck(Integer dscPCheck) {
		this.dscPCheck = dscPCheck;
	}

	/**
	 * Set the classification criterion.

          DiffServ codepoint (defined in {{bibref|RFC2474}}).

          If set to a Class Selector Codepoint (defined in {{bibref|RFC2474}}), all DSCP values that match the first 3 bits will be considered a valid  match.

          A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param dscPCheck the input value
	 * @return this instance
	 */
	public Classification withDscPCheck(Integer dscPCheck) {
		this.dscPCheck = dscPCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|DSCPCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSCPCheck}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDscPExclude() {
		return dscPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DSCPCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSCPCheck}} entry, if specified.
	 *
	 * @since 2.0
	 * @param dscPExclude the input value
	 */
	public void  setDscPExclude(Boolean dscPExclude) {
		this.dscPExclude = dscPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|DSCPCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|DSCPCheck}} entry, if specified.
	 *
	 * @since 2.0
	 * @param dscPExclude the input value
	 * @return this instance
	 */
	public Classification withDscPExclude(Boolean dscPExclude) {
		this.dscPExclude = dscPExclude;
		return this;
	}

	/**
	 * Get the classification result.

          DSCP to mark traffic with that falls into this classification entry.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDscPMark() {
		return dscPMark;
	}

	/**
	 * Set the classification result.

          DSCP to mark traffic with that falls into this classification entry.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 */
	public void  setDscPMark(Integer dscPMark) {
		this.dscPMark = dscPMark;
	}

	/**
	 * Set the classification result.

          DSCP to mark traffic with that falls into this classification entry.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 * @return this instance
	 */
	public Classification withDscPMark(Integer dscPMark) {
		this.dscPMark = dscPMark;
		return this;
	}

	/**
	 * Get the classification criterion.

          Current Ethernet priority of a VLAN Tag as defined in {{bibref|802.1Q-2011}} or Ethernet Priority field as defined in 802.1D. If more than 1 VLAN tag is present, then this parameter represents the outer VLAN Tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthernetPriorityCheck() {
		return ethernetPriorityCheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet priority of a VLAN Tag as defined in {{bibref|802.1Q-2011}} or Ethernet Priority field as defined in 802.1D. If more than 1 VLAN tag is present, then this parameter represents the outer VLAN Tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param ethernetPriorityCheck the input value
	 */
	public void  setEthernetPriorityCheck(Integer ethernetPriorityCheck) {
		this.ethernetPriorityCheck = ethernetPriorityCheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet priority of a VLAN Tag as defined in {{bibref|802.1Q-2011}} or Ethernet Priority field as defined in 802.1D. If more than 1 VLAN tag is present, then this parameter represents the outer VLAN Tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param ethernetPriorityCheck the input value
	 * @return this instance
	 */
	public Classification withEthernetPriorityCheck(Integer ethernetPriorityCheck) {
		this.ethernetPriorityCheck = ethernetPriorityCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|EthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEthernetPriorityExclude() {
		return ethernetPriorityExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|EthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param ethernetPriorityExclude the input value
	 */
	public void  setEthernetPriorityExclude(Boolean ethernetPriorityExclude) {
		this.ethernetPriorityExclude = ethernetPriorityExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|EthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.0
	 * @param ethernetPriorityExclude the input value
	 * @return this instance
	 */
	public Classification withEthernetPriorityExclude(Boolean ethernetPriorityExclude) {
		this.ethernetPriorityExclude = ethernetPriorityExclude;
		return this;
	}

	/**
	 * Get the classification result.

          Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this classification entry associated with the {{param|EthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the classification result.

          Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this classification entry associated with the {{param|EthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the classification result.

          Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this classification entry associated with the {{param|EthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 * @return this instance
	 */
	public Classification withEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
		return this;
	}

	/**
	 * Get the classification criterion.

          Current Ethernet priority of the inner VLAN Tag as defined in 802.1Q. This parameter is only applicable when the PDU has 2 VLAN Tags. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getInnerEthernetPriorityCheck() {
		return innerEthernetPriorityCheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet priority of the inner VLAN Tag as defined in 802.1Q. This parameter is only applicable when the PDU has 2 VLAN Tags. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 * @param innerEthernetPriorityCheck the input value
	 */
	public void  setInnerEthernetPriorityCheck(Integer innerEthernetPriorityCheck) {
		this.innerEthernetPriorityCheck = innerEthernetPriorityCheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet priority of the inner VLAN Tag as defined in 802.1Q. This parameter is only applicable when the PDU has 2 VLAN Tags. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 * @param innerEthernetPriorityCheck the input value
	 * @return this instance
	 */
	public Classification withInnerEthernetPriorityCheck(Integer innerEthernetPriorityCheck) {
		this.innerEthernetPriorityCheck = innerEthernetPriorityCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isInnerEthernetPriorityExclude() {
		return innerEthernetPriorityExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.7
	 * @param innerEthernetPriorityExclude the input value
	 */
	public void  setInnerEthernetPriorityExclude(Boolean innerEthernetPriorityExclude) {
		this.innerEthernetPriorityExclude = innerEthernetPriorityExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|InnerEthernetPriorityCheck}} entry, if  specified.
	 *
	 * @since 2.7
	 * @param innerEthernetPriorityExclude the input value
	 * @return this instance
	 */
	public Classification withInnerEthernetPriorityExclude(Boolean innerEthernetPriorityExclude) {
		this.innerEthernetPriorityExclude = innerEthernetPriorityExclude;
		return this;
	}

	/**
	 * Get the classification result.

          Ethernet priority code to mark traffic with that falls into this classification entry associated with the {{param|InnerEthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getInnerEthernetPriorityMark() {
		return innerEthernetPriorityMark;
	}

	/**
	 * Set the classification result.

          Ethernet priority code to mark traffic with that falls into this classification entry associated with the {{param|InnerEthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @param innerEthernetPriorityMark the input value
	 */
	public void  setInnerEthernetPriorityMark(Integer innerEthernetPriorityMark) {
		this.innerEthernetPriorityMark = innerEthernetPriorityMark;
	}

	/**
	 * Set the classification result.

          Ethernet priority code to mark traffic with that falls into this classification entry associated with the {{param|InnerEthernetPriorityCheck}}.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @param innerEthernetPriorityMark the input value
	 * @return this instance
	 */
	public Classification withInnerEthernetPriorityMark(Integer innerEthernetPriorityMark) {
		this.innerEthernetPriorityMark = innerEthernetPriorityMark;
		return this;
	}

	/**
	 * Get the classification criterion.

          Current Ethernet Drop eligible Indication (DEI) of the VLAN tag as defined in 802.1Q. If 2 VLAN Tags are present, then this parameter represents the outer VLAN tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getEthernetDEICheck() {
		return ethernetDEICheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet Drop eligible Indication (DEI) of the VLAN tag as defined in 802.1Q. If 2 VLAN Tags are present, then this parameter represents the outer VLAN tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 * @param ethernetDEICheck the input value
	 */
	public void  setEthernetDEICheck(Integer ethernetDEICheck) {
		this.ethernetDEICheck = ethernetDEICheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet Drop eligible Indication (DEI) of the VLAN tag as defined in 802.1Q. If 2 VLAN Tags are present, then this parameter represents the outer VLAN tag. A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.7
	 * @param ethernetDEICheck the input value
	 * @return this instance
	 */
	public Classification withEthernetDEICheck(Integer ethernetDEICheck) {
		this.ethernetDEICheck = ethernetDEICheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|EthernetDEICheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetDEICheck}} entry, if specified.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEthernetDEIExclude() {
		return ethernetDEIExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|EthernetDEICheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetDEICheck}} entry, if specified.
	 *
	 * @since 2.7
	 * @param ethernetDEIExclude the input value
	 */
	public void  setEthernetDEIExclude(Boolean ethernetDEIExclude) {
		this.ethernetDEIExclude = ethernetDEIExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|EthernetDEICheck}} entry, if  specified.

          If {{true}}, the class includes all packets except those that match the {{param|EthernetDEICheck}} entry, if specified.
	 *
	 * @since 2.7
	 * @param ethernetDEIExclude the input value
	 * @return this instance
	 */
	public Classification withEthernetDEIExclude(Boolean ethernetDEIExclude) {
		this.ethernetDEIExclude = ethernetDEIExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getVlaNIDCheck() {
		return vlaNIDCheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param vlaNIDCheck the input value
	 */
	public void  setVlaNIDCheck(Integer vlaNIDCheck) {
		this.vlaNIDCheck = vlaNIDCheck;
	}

	/**
	 * Set the classification criterion.

          Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 2.0
	 * @param vlaNIDCheck the input value
	 * @return this instance
	 */
	public Classification withVlaNIDCheck(Integer vlaNIDCheck) {
		this.vlaNIDCheck = vlaNIDCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isVlaNIDExclude() {
		return vlaNIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.0
	 * @param vlaNIDExclude the input value
	 */
	public void  setVlaNIDExclude(Boolean vlaNIDExclude) {
		this.vlaNIDExclude = vlaNIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the {{param|VLANIDCheck}} entry, if specified.

          If {{true}}, the class includes all packets except those that match the {{param|VLANIDCheck}} entry, if specified.
	 *
	 * @since 2.0
	 * @param vlaNIDExclude the input value
	 * @return this instance
	 */
	public Classification withVlaNIDExclude(Boolean vlaNIDExclude) {
		this.vlaNIDExclude = vlaNIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

          Allows traffic to be distinguished based on out-of-band information such as physical port or application ID.  Primarily intended for,  but not restricted to, locally sourced traffic.

          If specified, this entry applies to traffic with matching out-of-band information.  A value of -1 indicates this criterion is not  used for classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOutOfBandInfo() {
		return outOfBandInfo;
	}

	/**
	 * Set the classification criterion.

          Allows traffic to be distinguished based on out-of-band information such as physical port or application ID.  Primarily intended for,  but not restricted to, locally sourced traffic.

          If specified, this entry applies to traffic with matching out-of-band information.  A value of -1 indicates this criterion is not  used for classification.
	 *
	 * @since 2.0
	 * @param outOfBandInfo the input value
	 */
	public void  setOutOfBandInfo(Integer outOfBandInfo) {
		this.outOfBandInfo = outOfBandInfo;
	}

	/**
	 * Set the classification criterion.

          Allows traffic to be distinguished based on out-of-band information such as physical port or application ID.  Primarily intended for,  but not restricted to, locally sourced traffic.

          If specified, this entry applies to traffic with matching out-of-band information.  A value of -1 indicates this criterion is not  used for classification.
	 *
	 * @since 2.0
	 * @param outOfBandInfo the input value
	 * @return this instance
	 */
	public Classification withOutOfBandInfo(Integer outOfBandInfo) {
		this.outOfBandInfo = outOfBandInfo;
		return this;
	}

	/**
	 * Get the classification result.

          Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getForwardingPolicy() {
		return forwardingPolicy;
	}

	/**
	 * Set the classification result.

          Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 2.0
	 * @param forwardingPolicy the input value
	 */
	public void  setForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
	}

	/**
	 * Set the classification result.

          Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 2.0
	 * @param forwardingPolicy the input value
	 * @return this instance
	 */
	public Classification withForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
		return this;
	}

	/**
	 * Get the classification result.

          Identifier of the traffic class associated with traffic that falls in this classification.  If specified, at least one {{object|#.Queue}} table entry MUST include this traffic class in its {{param|#.Queue.{i}.TrafficClasses}} parameter (which is a comma-separated list).

          A value of -1 indicates a null traffic class.

          {{param}} and {{param|App}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is {{null}}, {{param|App}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTrafficClass() {
		return trafficClass;
	}

	/**
	 * Set the classification result.

          Identifier of the traffic class associated with traffic that falls in this classification.  If specified, at least one {{object|#.Queue}} table entry MUST include this traffic class in its {{param|#.Queue.{i}.TrafficClasses}} parameter (which is a comma-separated list).

          A value of -1 indicates a null traffic class.

          {{param}} and {{param|App}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is {{null}}, {{param|App}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 * @param trafficClass the input value
	 */
	public void  setTrafficClass(Integer trafficClass) {
		this.trafficClass = trafficClass;
	}

	/**
	 * Set the classification result.

          Identifier of the traffic class associated with traffic that falls in this classification.  If specified, at least one {{object|#.Queue}} table entry MUST include this traffic class in its {{param|#.Queue.{i}.TrafficClasses}} parameter (which is a comma-separated list).

          A value of -1 indicates a null traffic class.

          {{param}} and {{param|App}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is {{null}}, {{param|App}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 * @param trafficClass the input value
	 * @return this instance
	 */
	public Classification withTrafficClass(Integer trafficClass) {
		this.trafficClass = trafficClass;
		return this;
	}

	/**
	 * Get the classification result. {{reference}} 

          Indicates the ''Policer'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null policer.

          {{param}} MAY optionally be specified in conjunction with {{param|TrafficClass}}. {{param}} and {{param|App}} are mutually exclusive.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPolicer() {
		return policer;
	}

	/**
	 * Set the classification result. {{reference}} 

          Indicates the ''Policer'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null policer.

          {{param}} MAY optionally be specified in conjunction with {{param|TrafficClass}}. {{param}} and {{param|App}} are mutually exclusive.
	 *
	 * @since 2.0
	 * @param policer the input value
	 */
	public void  setPolicer(String policer) {
		this.policer = policer;
	}

	/**
	 * Set the classification result. {{reference}} 

          Indicates the ''Policer'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null policer.

          {{param}} MAY optionally be specified in conjunction with {{param|TrafficClass}}. {{param}} and {{param|App}} are mutually exclusive.
	 *
	 * @since 2.0
	 * @param policer the input value
	 * @return this instance
	 */
	public Classification withPolicer(String policer) {
		this.policer = policer;
		return this;
	}

	/**
	 * Get the classification result. {{reference}} 

          Indicates the ''App'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null ''App''.

          {{param|TrafficClass}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|TrafficClass}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getApp() {
		return app;
	}

	/**
	 * Set the classification result. {{reference}} 

          Indicates the ''App'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null ''App''.

          {{param|TrafficClass}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|TrafficClass}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 * @param app the input value
	 */
	public void  setApp(String app) {
		this.app = app;
	}

	/**
	 * Set the classification result. {{reference}} 

          Indicates the ''App'' table entry for traffic that falls in this classification.

          {{empty}} indicates a null ''App''.

          {{param|TrafficClass}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|TrafficClass}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 2.0
	 * @param app the input value
	 * @return this instance
	 */
	public Classification withApp(String app) {
		this.app = app;
		return this;
	}

	//</editor-fold>

}