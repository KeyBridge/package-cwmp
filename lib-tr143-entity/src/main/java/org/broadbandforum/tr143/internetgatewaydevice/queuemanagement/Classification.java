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
package org.broadbandforum.tr143.internetgatewaydevice.queuemanagement;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.IPAddress;
import org.broadbandforum.common.MACAddress;

	/**
	 * Classification table.
	 *
	 * @since TR143 v1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.QueueManagement.Classification.{i}.")
@XmlRootElement(name = "InternetGatewayDevice.QueueManagement.Classification")
@XmlType(name = "InternetGatewayDevice.QueueManagement.Classification")
@XmlAccessorType(XmlAccessType.FIELD)
public class Classification {

	/**
	 * Unique key for each classification entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassificationKey")
	public Long classificationKey;
	/**
	 * Enables or disables this classifier.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassificationEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean classificationEnable;
	/**
	 * The status of this classifier.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassificationStatus")
	public String classificationStatus;
	/**
	 * Position of the classification entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassificationOrder")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long classificationOrder;
	/**
	 * Classification criterion.

Specifies the LAN or WAN ingress interface associated with this entry.  The content is the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The following are WAN interface examples:

* ''InternetGatewayDevice.WANDevice.2''

* ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following are LAN interface examples:

* ''InternetGatewayDevice.LANDevice.3''

* ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* ''InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

The string ''WAN'' indicates this entry is to apply to traffic entering from any WAN interface.

The string ''LAN'' indicates this entry is to apply to traffic entering from any LAN interface.

The string ''Local'' indicates this entry is to apply to IP-layer traffic entering from a local source within the Internet Gateway Device.

{{empty}} indicates this classification entry is to apply to all sources.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassInterface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String classInterface;
	/**
	 * Classification criterion.

Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIP;
	/**
	 * Destination IP address mask.  If not {{empty}}, only the indicated network portion of the DestIP address is to be used for classification.  {{empty}} indicates that the full DestIP address is to be used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress destMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destIPExclude;
	/**
	 * Classification criterion.

Source IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceIP")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIP;
	/**
	 * Source IP address mask.  If not {{empty}}, only the indicated network portion of the SourceIP address is to be used for classification.  {{empty}} indicates that the full SourceIP address is to be used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) SourceIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceIP entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceIPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceIPExclude;
	/**
	 * Classification criterion.

Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer protocol;
	/**
	 * If {{false}}, the class includes only those packets that match the Protocol entry, if specified.

If {{true}}, the class includes all packets except those that match the Protocol entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ProtocolExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean protocolExclude;
	/**
	 * Classification criterion.

Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer destPort;
	/**
	 * Classification criterion.

If specified, indicates the classification criterion is to include the port range from DestPort through DestPortRangeMax (inclusive).  If specified, DestPortRangeMax MUST be greater than or equal to DestPort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestPortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer destPortRangeMax;
	/**
	 * If {{false}}, the class includes only those packets that match the DestPort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the DestPort entry (or port range), if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestPortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destPortExclude;
	/**
	 * Classification criterion.

Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourcePort")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer sourcePort;
	/**
	 * Classification criterion.

If specified, indicates the classification criterion is to include the port range from SourcePort through SourcePortRangeMax (inclusive).  If specified, SourcePortRangeMax MUST be greater than or equal to SourcePort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourcePortRangeMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer sourcePortRangeMax;
	/**
	 * If {{false}}, the class includes only those packets that match the SourcePort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the SourcePort entry (or port range), if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourcePortExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourcePortExclude;
	/**
	 * Classification criterion.

Source MAC Address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress sourceMACAddress;
	/**
	 * Bit-mask for the MAC address, where matching of a packet's MAC address with the SourceMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the SourceMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceMACMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) SourceMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceMACAddress entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceMACExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceMACExclude;
	/**
	 * Classification criterion.

Destination MAC Address.  {{empty}} indicates this criterion is not used for classification.

The use of destination MAC address as a classification criterion is primarily useful only for bridged traffic.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress destMACAddress;
	/**
	 * Bit-mask for the MAC address, where matching of a packet's MAC address with the DestMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the DestMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress destMACMask;
	/**
	 * If {{false}}, the class includes only those packets that match the (masked) DestMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestMACAddress entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestMACExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destMACExclude;
	/**
	 * Classification criterion.

Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Ethertype")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethertype;
	/**
	 * If {{false}}, the class includes only those packets that match the Ethertype entry, if specified.

If {{true}}, the class includes all packets except those that match the Ethertype entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthertypeExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ethertypeExclude;
	/**
	 * Classification criterion.

SSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SSAP")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ssaP;
	/**
	 * If {{false}}, the class includes only those packets that match the SSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the SSAP entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SSAPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ssaPExclude;
	/**
	 * Classification criterion.

DSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DSAP")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer dsaP;
	/**
	 * If {{false}}, the class includes only those packets that match the DSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the DSAP entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DSAPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean dsaPExclude;
	/**
	 * Classification criterion.

Control element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "LLCControl")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer llcControl;
	/**
	 * If {{false}}, the class includes only those packets that match the LLCControl entry, if specified.

If {{true}}, the class includes all packets except those that match the LLCControl entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "LLCControlExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean llcControlExclude;
	/**
	 * Classification criterion.

OUI element in the SNAP header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SNAPOUI")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer snaPOUI;
	/**
	 * If {{false}}, the class includes only those packets that match the SNAPOUI entry, if specified.

If {{true}}, the class includes all packets except those that match the SNAPOUI entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SNAPOUIExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean snaPOUIExclude;
	/**
	 * Classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceVendorClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sourceVendorClassID;
	/**
	 * If {{false}}, the class includes only those packets sourced from LAN devices that match the SourceVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceVendorClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceVendorClassIDExclude;
	/**
	 * Classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestVendorClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destVendorClassID;
	/**
	 * If {{false}}, the class includes only those packets destined for LAN devices that match the DestVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestVendorClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destVendorClassIDExclude;
	/**
	 * Classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceClientID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sourceClientID;
	/**
	 * If {{false}}, the class includes only those packets sourced from LAN devices that match the SourceClientID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceClientID entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceClientIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceClientIDExclude;
	/**
	 * Classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestClientID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destClientID;
	/**
	 * If {{false}}, the class includes only those packets destined for LAN devices that match the DestClientID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestClientID entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestClientIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destClientIDExclude;
	/**
	 * Classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceUserClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sourceUserClassID;
	/**
	 * If {{false}}, the class includes only those packets sourced from LAN devices that match the SourceUserClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceUserClassID entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SourceUserClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean sourceUserClassIDExclude;
	/**
	 * Classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestUserClassID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String destUserClassID;
	/**
	 * If {{false}}, the class includes only those packets destined for LAN devices that match the DestUserClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestUserClassID entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DestUserClassIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean destUserClassIDExclude;
	/**
	 * Classification criterion.

If {{false}}, this criterion is not used for classification.

If {{true}}, this criterion matches with all TCP segments that have the ACK control bit set.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TCPACK")
	@CWMPParameter(access = "readWrite")
	public Boolean tcpACK;
	/**
	 * If {{false}}, the class includes only those packets that match the TCPACK entry, if specified.

If {{true}}, the class includes all packets except those that match the TCPACK entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "TCPACKExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean tcpACKExclude;
	/**
	 * Classification criterion.

Minimum IP Packet Length (including header) in bytes.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "IPLengthMin")
	@CWMPParameter(access = "readWrite")
	public Long iplengthMin = 0L;
	/**
	 * Classification criterion.

Maximum IP Packet Length (including header) in bytes.

A value of zero indicates that no maximum is specified (an umlimited maximum length).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "IPLengthMax")
	@CWMPParameter(access = "readWrite")
	public Long iplengthMax = 0L;
	/**
	 * If {{false}}, the class includes only those packets whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.  A value of zero for both IPLengthMin and IPLengthMax allows any length packet.  An equal non-zero value of IPLengthMin and IPLengthMax allows only a packet with the exact length specified.

If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "IPLengthExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean iplengthExclude;
	/**
	 * Classification criterion.

DiffServ codepoint (defined in RFC 2474).

If set to a Class Selector Codepoint (defined in RFC 2474), all DSCP values that match the first 3 bits will be considered a valid match.

A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DSCPCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer dscPCheck;
	/**
	 * If {{false}}, the class includes only those packets that match the DSCPCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the DSCPCheck entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DSCPExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean dscPExclude;
	/**
	 * Classification result.

DSCP to mark traffic with that falls into this classification entry.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer dscPMark;
	/**
	 * Classification criterion.

Current Ethernet priority as defined in 802.1D.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthernetPriorityCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetPriorityCheck;
	/**
	 * If {{false}}, the class includes only those packets that match the EthernetPriorityCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the EthernetPriorityCheck entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthernetPriorityExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean ethernetPriorityExclude;
	/**
	 * Classification result.

Ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this classification entry.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer ethernetPriorityMark;
	/**
	 * Classification criterion.

Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VLANIDCheck")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDCheck;
	/**
	 * If {{false}}, the class includes only those packets that match the VLANIDCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the VLANIDCheck entry, if specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "VLANIDExclude")
	@CWMPParameter(access = "readWrite")
	public Boolean vlaNIDExclude;
	/**
	 * Classification result.

Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long forwardingPolicy = 0L;
	/**
	 * Classification result.

Instance number of the Policer table entry for traffic that falls in this classification.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassPolicer")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer classPolicer;
	/**
	 * Classification result.

Instance number of the Queue table entry for traffic that falls in this classification.

A value of -1 indicates a null queue.

{{param}} and {{param|ClassApp}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is null, {{param|ClassApp}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassQueue")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer classQueue;
	/**
	 * Classification result.

Instance number of the App table entry for traffic that falls in this classification.

A value of -1 indicates a null App table entry.

{{param|ClassQueue}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|ClassQueue}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ClassApp")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer classApp;

	public Classification() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique key for each classification entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getClassificationKey() {
		return classificationKey;
	}

	/**
	 * Set the unique key for each classification entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param classificationKey the input value
	 */
	public void  setClassificationKey(Long classificationKey) {
		this.classificationKey = classificationKey;
	}

	/**
	 * Set the unique key for each classification entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param classificationKey the input value
	 * @return this instance
	 */
	public Classification withClassificationKey(Long classificationKey) {
		this.classificationKey = classificationKey;
		return this;
	}

	/**
	 * Get the enables or disables this classifier.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isClassificationEnable() {
		return classificationEnable;
	}

	/**
	 * Set the enables or disables this classifier.
	 *
	 * @since 1.1
	 * @param classificationEnable the input value
	 */
	public void  setClassificationEnable(Boolean classificationEnable) {
		this.classificationEnable = classificationEnable;
	}

	/**
	 * Set the enables or disables this classifier.
	 *
	 * @since 1.1
	 * @param classificationEnable the input value
	 * @return this instance
	 */
	public Classification withClassificationEnable(Boolean classificationEnable) {
		this.classificationEnable = classificationEnable;
		return this;
	}

	/**
	 * Get the status of this classifier.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getClassificationStatus() {
		return classificationStatus;
	}

	/**
	 * Set the status of this classifier.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param classificationStatus the input value
	 */
	public void  setClassificationStatus(String classificationStatus) {
		this.classificationStatus = classificationStatus;
	}

	/**
	 * Set the status of this classifier.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param classificationStatus the input value
	 * @return this instance
	 */
	public Classification withClassificationStatus(String classificationStatus) {
		this.classificationStatus = classificationStatus;
		return this;
	}

	/**
	 * Get the position of the classification entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getClassificationOrder() {
		return classificationOrder;
	}

	/**
	 * Set the position of the classification entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.
	 *
	 * @since 1.1
	 * @param classificationOrder the input value
	 */
	public void  setClassificationOrder(Long classificationOrder) {
		this.classificationOrder = classificationOrder;
	}

	/**
	 * Set the position of the classification entry in the order of precedence.  A value of 1 indicates the first entry considered.  For each packet, the highest ordered entry that matches the classification criteria is applied.  All lower order entries are ignored.

When this value is modified, if the value matches that of an existing entry, the Order value for the existing entry and all lower Order entries is incremented (lowered in precedence) to ensure uniqueness of this value. A deletion causes Order values to be compacted. When a value is changed, incrementing occurs before compaction.
	 *
	 * @since 1.1
	 * @param classificationOrder the input value
	 * @return this instance
	 */
	public Classification withClassificationOrder(Long classificationOrder) {
		this.classificationOrder = classificationOrder;
		return this;
	}

	/**
	 * Get the classification criterion.

Specifies the LAN or WAN ingress interface associated with this entry.  The content is the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The following are WAN interface examples:

* ''InternetGatewayDevice.WANDevice.2''

* ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following are LAN interface examples:

* ''InternetGatewayDevice.LANDevice.3''

* ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* ''InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

The string ''WAN'' indicates this entry is to apply to traffic entering from any WAN interface.

The string ''LAN'' indicates this entry is to apply to traffic entering from any LAN interface.

The string ''Local'' indicates this entry is to apply to IP-layer traffic entering from a local source within the Internet Gateway Device.

{{empty}} indicates this classification entry is to apply to all sources.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getClassInterface() {
		return classInterface;
	}

	/**
	 * Set the classification criterion.

Specifies the LAN or WAN ingress interface associated with this entry.  The content is the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The following are WAN interface examples:

* ''InternetGatewayDevice.WANDevice.2''

* ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following are LAN interface examples:

* ''InternetGatewayDevice.LANDevice.3''

* ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* ''InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

The string ''WAN'' indicates this entry is to apply to traffic entering from any WAN interface.

The string ''LAN'' indicates this entry is to apply to traffic entering from any LAN interface.

The string ''Local'' indicates this entry is to apply to IP-layer traffic entering from a local source within the Internet Gateway Device.

{{empty}} indicates this classification entry is to apply to all sources.
	 *
	 * @since 1.1
	 * @param classInterface the input value
	 */
	public void  setClassInterface(String classInterface) {
		this.classInterface = classInterface;
	}

	/**
	 * Set the classification criterion.

Specifies the LAN or WAN ingress interface associated with this entry.  The content is the full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The following are WAN interface examples:

* ''InternetGatewayDevice.WANDevice.2''

* ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following are LAN interface examples:

* ''InternetGatewayDevice.LANDevice.3''

* ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* ''InternetGatewayDevice.LANDevice.1.WLANConfiguration.3''

The string ''WAN'' indicates this entry is to apply to traffic entering from any WAN interface.

The string ''LAN'' indicates this entry is to apply to traffic entering from any LAN interface.

The string ''Local'' indicates this entry is to apply to IP-layer traffic entering from a local source within the Internet Gateway Device.

{{empty}} indicates this classification entry is to apply to all sources.
	 *
	 * @since 1.1
	 * @param classInterface the input value
	 * @return this instance
	 */
	public Classification withClassInterface(String classInterface) {
		this.classInterface = classInterface;
		return this;
	}

	/**
	 * Get the classification criterion.

Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public IPAddress getDestIP() {
		return destIP;
	}

	/**
	 * Set the classification criterion.

Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destIP the input value
	 */
	public void  setDestIP(IPAddress destIP) {
		this.destIP = destIP;
	}

	/**
	 * Set the classification criterion.

Destination IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destIP the input value
	 * @return this instance
	 */
	public Classification withDestIP(IPAddress destIP) {
		this.destIP = destIP;
		return this;
	}

	/**
	 * Get the destination IP address mask.  If not {{empty}}, only the indicated network portion of the DestIP address is to be used for classification.  {{empty}} indicates that the full DestIP address is to be used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public IPAddress getDestMask() {
		return destMask;
	}

	/**
	 * Set the destination IP address mask.  If not {{empty}}, only the indicated network portion of the DestIP address is to be used for classification.  {{empty}} indicates that the full DestIP address is to be used for classification.
	 *
	 * @since 1.1
	 * @param destMask the input value
	 */
	public void  setDestMask(IPAddress destMask) {
		this.destMask = destMask;
	}

	/**
	 * Set the destination IP address mask.  If not {{empty}}, only the indicated network portion of the DestIP address is to be used for classification.  {{empty}} indicates that the full DestIP address is to be used for classification.
	 *
	 * @since 1.1
	 * @param destMask the input value
	 * @return this instance
	 */
	public Classification withDestMask(IPAddress destMask) {
		this.destMask = destMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestIPExclude() {
		return destIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 1.1
	 * @param destIPExclude the input value
	 */
	public void  setDestIPExclude(Boolean destIPExclude) {
		this.destIPExclude = destIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestIP entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public IPAddress getSourceIP() {
		return sourceIP;
	}

	/**
	 * Set the classification criterion.

Source IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceIP the input value
	 */
	public void  setSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
	}

	/**
	 * Set the classification criterion.

Source IP address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceIP the input value
	 * @return this instance
	 */
	public Classification withSourceIP(IPAddress sourceIP) {
		this.sourceIP = sourceIP;
		return this;
	}

	/**
	 * Get the source IP address mask.  If not {{empty}}, only the indicated network portion of the SourceIP address is to be used for classification.  {{empty}} indicates that the full SourceIP address is to be used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public IPAddress getSourceMask() {
		return sourceMask;
	}

	/**
	 * Set the source IP address mask.  If not {{empty}}, only the indicated network portion of the SourceIP address is to be used for classification.  {{empty}} indicates that the full SourceIP address is to be used for classification.
	 *
	 * @since 1.1
	 * @param sourceMask the input value
	 */
	public void  setSourceMask(IPAddress sourceMask) {
		this.sourceMask = sourceMask;
	}

	/**
	 * Set the source IP address mask.  If not {{empty}}, only the indicated network portion of the SourceIP address is to be used for classification.  {{empty}} indicates that the full SourceIP address is to be used for classification.
	 *
	 * @since 1.1
	 * @param sourceMask the input value
	 * @return this instance
	 */
	public Classification withSourceMask(IPAddress sourceMask) {
		this.sourceMask = sourceMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) SourceIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceIP entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceIPExclude() {
		return sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) SourceIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceIP entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceIPExclude the input value
	 */
	public void  setSourceIPExclude(Boolean sourceIPExclude) {
		this.sourceIPExclude = sourceIPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) SourceIP entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceIP entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * Set the classification criterion.

Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param protocol the input value
	 */
	public void  setProtocol(Integer protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the classification criterion.

Protocol number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param protocol the input value
	 * @return this instance
	 */
	public Classification withProtocol(Integer protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the Protocol entry, if specified.

If {{true}}, the class includes all packets except those that match the Protocol entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isProtocolExclude() {
		return protocolExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the Protocol entry, if specified.

If {{true}}, the class includes all packets except those that match the Protocol entry, if specified.
	 *
	 * @since 1.1
	 * @param protocolExclude the input value
	 */
	public void  setProtocolExclude(Boolean protocolExclude) {
		this.protocolExclude = protocolExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the Protocol entry, if specified.

If {{true}}, the class includes all packets except those that match the Protocol entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDestPort() {
		return destPort;
	}

	/**
	 * Set the classification criterion.

Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destPort the input value
	 */
	public void  setDestPort(Integer destPort) {
		this.destPort = destPort;
	}

	/**
	 * Set the classification criterion.

Destination port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destPort the input value
	 * @return this instance
	 */
	public Classification withDestPort(Integer destPort) {
		this.destPort = destPort;
		return this;
	}

	/**
	 * Get the classification criterion.

If specified, indicates the classification criterion is to include the port range from DestPort through DestPortRangeMax (inclusive).  If specified, DestPortRangeMax MUST be greater than or equal to DestPort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDestPortRangeMax() {
		return destPortRangeMax;
	}

	/**
	 * Set the classification criterion.

If specified, indicates the classification criterion is to include the port range from DestPort through DestPortRangeMax (inclusive).  If specified, DestPortRangeMax MUST be greater than or equal to DestPort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 * @param destPortRangeMax the input value
	 */
	public void  setDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
	}

	/**
	 * Set the classification criterion.

If specified, indicates the classification criterion is to include the port range from DestPort through DestPortRangeMax (inclusive).  If specified, DestPortRangeMax MUST be greater than or equal to DestPort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 * @param destPortRangeMax the input value
	 * @return this instance
	 */
	public Classification withDestPortRangeMax(Integer destPortRangeMax) {
		this.destPortRangeMax = destPortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the DestPort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the DestPort entry (or port range), if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestPortExclude() {
		return destPortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the DestPort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the DestPort entry (or port range), if specified.
	 *
	 * @since 1.1
	 * @param destPortExclude the input value
	 */
	public void  setDestPortExclude(Boolean destPortExclude) {
		this.destPortExclude = destPortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the DestPort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the DestPort entry (or port range), if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Integer getSourcePort() {
		return sourcePort;
	}

	/**
	 * Set the classification criterion.

Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourcePort the input value
	 */
	public void  setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
	}

	/**
	 * Set the classification criterion.

Source port number.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourcePort the input value
	 * @return this instance
	 */
	public Classification withSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		return this;
	}

	/**
	 * Get the classification criterion.

If specified, indicates the classification criterion is to include the port range from SourcePort through SourcePortRangeMax (inclusive).  If specified, SourcePortRangeMax MUST be greater than or equal to SourcePort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getSourcePortRangeMax() {
		return sourcePortRangeMax;
	}

	/**
	 * Set the classification criterion.

If specified, indicates the classification criterion is to include the port range from SourcePort through SourcePortRangeMax (inclusive).  If specified, SourcePortRangeMax MUST be greater than or equal to SourcePort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 * @param sourcePortRangeMax the input value
	 */
	public void  setSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
	}

	/**
	 * Set the classification criterion.

If specified, indicates the classification criterion is to include the port range from SourcePort through SourcePortRangeMax (inclusive).  If specified, SourcePortRangeMax MUST be greater than or equal to SourcePort.

A value of -1 indicates that no port range is specified.
	 *
	 * @since 1.1
	 * @param sourcePortRangeMax the input value
	 * @return this instance
	 */
	public Classification withSourcePortRangeMax(Integer sourcePortRangeMax) {
		this.sourcePortRangeMax = sourcePortRangeMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the SourcePort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the SourcePort entry (or port range), if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourcePortExclude() {
		return sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the SourcePort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the SourcePort entry (or port range), if specified.
	 *
	 * @since 1.1
	 * @param sourcePortExclude the input value
	 */
	public void  setSourcePortExclude(Boolean sourcePortExclude) {
		this.sourcePortExclude = sourcePortExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the SourcePort entry (or port range), if specified.

If {{true}}, the class includes all packets except those that match the SourcePort entry (or port range), if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public MACAddress getSourceMACAddress() {
		return sourceMACAddress;
	}

	/**
	 * Set the classification criterion.

Source MAC Address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceMACAddress the input value
	 */
	public void  setSourceMACAddress(MACAddress sourceMACAddress) {
		this.sourceMACAddress = sourceMACAddress;
	}

	/**
	 * Set the classification criterion.

Source MAC Address.  {{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceMACAddress the input value
	 * @return this instance
	 */
	public Classification withSourceMACAddress(MACAddress sourceMACAddress) {
		this.sourceMACAddress = sourceMACAddress;
		return this;
	}

	/**
	 * Get the bit-mask for the MAC address, where matching of a packet's MAC address with the SourceMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the SourceMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public IPAddress getSourceMACMask() {
		return sourceMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the SourceMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the SourceMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 * @param sourceMACMask the input value
	 */
	public void  setSourceMACMask(IPAddress sourceMACMask) {
		this.sourceMACMask = sourceMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the SourceMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the SourceMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 * @param sourceMACMask the input value
	 * @return this instance
	 */
	public Classification withSourceMACMask(IPAddress sourceMACMask) {
		this.sourceMACMask = sourceMACMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) SourceMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceMACAddress entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceMACExclude() {
		return sourceMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) SourceMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceMACAddress entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceMACExclude the input value
	 */
	public void  setSourceMACExclude(Boolean sourceMACExclude) {
		this.sourceMACExclude = sourceMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) SourceMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) SourceMACAddress entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
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
	 * @since 1.1
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
	 * @since 1.1
	 * @param destMACAddress the input value
	 * @return this instance
	 */
	public Classification withDestMACAddress(MACAddress destMACAddress) {
		this.destMACAddress = destMACAddress;
		return this;
	}

	/**
	 * Get the bit-mask for the MAC address, where matching of a packet's MAC address with the DestMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the DestMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public IPAddress getDestMACMask() {
		return destMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the DestMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the DestMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 * @param destMACMask the input value
	 */
	public void  setDestMACMask(IPAddress destMACMask) {
		this.destMACMask = destMACMask;
	}

	/**
	 * Set the bit-mask for the MAC address, where matching of a packet's MAC address with the DestMACAddress is only to be done for bit positions set to one in the mask.  A mask of ''FF:FF:FF:FF:FF:FF'' or {{empty}} indicates all bits of the DestMACAdress are to be used for classification.
	 *
	 * @since 1.1
	 * @param destMACMask the input value
	 * @return this instance
	 */
	public Classification withDestMACMask(IPAddress destMACMask) {
		this.destMACMask = destMACMask;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the (masked) DestMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestMACAddress entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestMACExclude() {
		return destMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestMACAddress entry, if specified.
	 *
	 * @since 1.1
	 * @param destMACExclude the input value
	 */
	public void  setDestMACExclude(Boolean destMACExclude) {
		this.destMACExclude = destMACExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the (masked) DestMACAddress entry, if specified.

If {{true}}, the class includes all packets except those that match the (masked) DestMACAddress entry, if specified.
	 *
	 * @since 1.1
	 * @param destMACExclude the input value
	 * @return this instance
	 */
	public Classification withDestMACExclude(Boolean destMACExclude) {
		this.destMACExclude = destMACExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getEthertype() {
		return ethertype;
	}

	/**
	 * Set the classification criterion.

Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param ethertype the input value
	 */
	public void  setEthertype(Integer ethertype) {
		this.ethertype = ethertype;
	}

	/**
	 * Set the classification criterion.

Ethertype as indicated in either the Ethernet or SNAP Type header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param ethertype the input value
	 * @return this instance
	 */
	public Classification withEthertype(Integer ethertype) {
		this.ethertype = ethertype;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the Ethertype entry, if specified.

If {{true}}, the class includes all packets except those that match the Ethertype entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEthertypeExclude() {
		return ethertypeExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the Ethertype entry, if specified.

If {{true}}, the class includes all packets except those that match the Ethertype entry, if specified.
	 *
	 * @since 1.1
	 * @param ethertypeExclude the input value
	 */
	public void  setEthertypeExclude(Boolean ethertypeExclude) {
		this.ethertypeExclude = ethertypeExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the Ethertype entry, if specified.

If {{true}}, the class includes all packets except those that match the Ethertype entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Integer getSsaP() {
		return ssaP;
	}

	/**
	 * Set the classification criterion.

SSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param ssaP the input value
	 */
	public void  setSsaP(Integer ssaP) {
		this.ssaP = ssaP;
	}

	/**
	 * Set the classification criterion.

SSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param ssaP the input value
	 * @return this instance
	 */
	public Classification withSsaP(Integer ssaP) {
		this.ssaP = ssaP;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the SSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the SSAP entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSsaPExclude() {
		return ssaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the SSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the SSAP entry, if specified.
	 *
	 * @since 1.1
	 * @param ssaPExclude the input value
	 */
	public void  setSsaPExclude(Boolean ssaPExclude) {
		this.ssaPExclude = ssaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the SSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the SSAP entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDsaP() {
		return dsaP;
	}

	/**
	 * Set the classification criterion.

DSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param dsaP the input value
	 */
	public void  setDsaP(Integer dsaP) {
		this.dsaP = dsaP;
	}

	/**
	 * Set the classification criterion.

DSAP element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param dsaP the input value
	 * @return this instance
	 */
	public Classification withDsaP(Integer dsaP) {
		this.dsaP = dsaP;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the DSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the DSAP entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDsaPExclude() {
		return dsaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the DSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the DSAP entry, if specified.
	 *
	 * @since 1.1
	 * @param dsaPExclude the input value
	 */
	public void  setDsaPExclude(Boolean dsaPExclude) {
		this.dsaPExclude = dsaPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the DSAP entry, if specified.

If {{true}}, the class includes all packets except those that match the DSAP entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Integer getLlcControl() {
		return llcControl;
	}

	/**
	 * Set the classification criterion.

Control element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param llcControl the input value
	 */
	public void  setLlcControl(Integer llcControl) {
		this.llcControl = llcControl;
	}

	/**
	 * Set the classification criterion.

Control element in the LLC header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param llcControl the input value
	 * @return this instance
	 */
	public Classification withLlcControl(Integer llcControl) {
		this.llcControl = llcControl;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the LLCControl entry, if specified.

If {{true}}, the class includes all packets except those that match the LLCControl entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isLlcControlExclude() {
		return llcControlExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the LLCControl entry, if specified.

If {{true}}, the class includes all packets except those that match the LLCControl entry, if specified.
	 *
	 * @since 1.1
	 * @param llcControlExclude the input value
	 */
	public void  setLlcControlExclude(Boolean llcControlExclude) {
		this.llcControlExclude = llcControlExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the LLCControl entry, if specified.

If {{true}}, the class includes all packets except those that match the LLCControl entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Integer getSnaPOUI() {
		return snaPOUI;
	}

	/**
	 * Set the classification criterion.

OUI element in the SNAP header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param snaPOUI the input value
	 */
	public void  setSnaPOUI(Integer snaPOUI) {
		this.snaPOUI = snaPOUI;
	}

	/**
	 * Set the classification criterion.

OUI element in the SNAP header.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param snaPOUI the input value
	 * @return this instance
	 */
	public Classification withSnaPOUI(Integer snaPOUI) {
		this.snaPOUI = snaPOUI;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the SNAPOUI entry, if specified.

If {{true}}, the class includes all packets except those that match the SNAPOUI entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSnaPOUIExclude() {
		return snaPOUIExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the SNAPOUI entry, if specified.

If {{true}}, the class includes all packets except those that match the SNAPOUI entry, if specified.
	 *
	 * @since 1.1
	 * @param snaPOUIExclude the input value
	 */
	public void  setSnaPOUIExclude(Boolean snaPOUIExclude) {
		this.snaPOUIExclude = snaPOUIExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the SNAPOUI entry, if specified.

If {{true}}, the class includes all packets except those that match the SNAPOUI entry, if specified.
	 *
	 * @since 1.1
	 * @param snaPOUIExclude the input value
	 * @return this instance
	 */
	public Classification withSnaPOUIExclude(Boolean snaPOUIExclude) {
		this.snaPOUIExclude = snaPOUIExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getSourceVendorClassID() {
		return sourceVendorClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceVendorClassID the input value
	 */
	public void  setSourceVendorClassID(String sourceVendorClassID) {
		this.sourceVendorClassID = sourceVendorClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceVendorClassID the input value
	 * @return this instance
	 */
	public Classification withSourceVendorClassID(String sourceVendorClassID) {
		this.sourceVendorClassID = sourceVendorClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceVendorClassIDExclude() {
		return sourceVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceVendorClassIDExclude the input value
	 */
	public void  setSourceVendorClassIDExclude(Boolean sourceVendorClassIDExclude) {
		this.sourceVendorClassIDExclude = sourceVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceVendorClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withSourceVendorClassIDExclude(Boolean sourceVendorClassIDExclude) {
		this.sourceVendorClassIDExclude = sourceVendorClassIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDestVendorClassID() {
		return destVendorClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destVendorClassID the input value
	 */
	public void  setDestVendorClassID(String destVendorClassID) {
		this.destVendorClassID = destVendorClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Vendor Class Identifier (Option 60) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destVendorClassID the input value
	 * @return this instance
	 */
	public Classification withDestVendorClassID(String destVendorClassID) {
		this.destVendorClassID = destVendorClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets destined for LAN devices that match the DestVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestVendorClassIDExclude() {
		return destVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the DestVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param destVendorClassIDExclude the input value
	 */
	public void  setDestVendorClassIDExclude(Boolean destVendorClassIDExclude) {
		this.destVendorClassIDExclude = destVendorClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the DestVendorClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestVendorClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param destVendorClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withDestVendorClassIDExclude(Boolean destVendorClassIDExclude) {
		this.destVendorClassIDExclude = destVendorClassIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getSourceClientID() {
		return sourceClientID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceClientID the input value
	 */
	public void  setSourceClientID(String sourceClientID) {
		this.sourceClientID = sourceClientID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceClientID the input value
	 * @return this instance
	 */
	public Classification withSourceClientID(String sourceClientID) {
		this.sourceClientID = sourceClientID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceClientID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceClientID entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceClientIDExclude() {
		return sourceClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceClientID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceClientID entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceClientIDExclude the input value
	 */
	public void  setSourceClientIDExclude(Boolean sourceClientIDExclude) {
		this.sourceClientIDExclude = sourceClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceClientID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceClientID entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceClientIDExclude the input value
	 * @return this instance
	 */
	public Classification withSourceClientIDExclude(Boolean sourceClientIDExclude) {
		this.sourceClientIDExclude = sourceClientIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDestClientID() {
		return destClientID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destClientID the input value
	 */
	public void  setDestClientID(String destClientID) {
		this.destClientID = destClientID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP Client Identifier (Option 61) as defined in RFC 2132.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destClientID the input value
	 * @return this instance
	 */
	public Classification withDestClientID(String destClientID) {
		this.destClientID = destClientID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets destined for LAN devices that match the DestClientID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestClientID entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestClientIDExclude() {
		return destClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the DestClientID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestClientID entry, if specified.
	 *
	 * @since 1.1
	 * @param destClientIDExclude the input value
	 */
	public void  setDestClientIDExclude(Boolean destClientIDExclude) {
		this.destClientIDExclude = destClientIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the DestClientID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestClientID entry, if specified.
	 *
	 * @since 1.1
	 * @param destClientIDExclude the input value
	 * @return this instance
	 */
	public Classification withDestClientIDExclude(Boolean destClientIDExclude) {
		this.destClientIDExclude = destClientIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getSourceUserClassID() {
		return sourceUserClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceUserClassID the input value
	 */
	public void  setSourceUserClassID(String sourceUserClassID) {
		this.sourceUserClassID = sourceUserClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param sourceUserClassID the input value
	 * @return this instance
	 */
	public Classification withSourceUserClassID(String sourceUserClassID) {
		this.sourceUserClassID = sourceUserClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceUserClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceUserClassID entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isSourceUserClassIDExclude() {
		return sourceUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceUserClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceUserClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceUserClassIDExclude the input value
	 */
	public void  setSourceUserClassIDExclude(Boolean sourceUserClassIDExclude) {
		this.sourceUserClassIDExclude = sourceUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets sourced from LAN devices that match the SourceUserClassID entry, if specified.

If {{true}}, the class includes all packets except those sourced from LAN devices that match the SourceUserClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param sourceUserClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withSourceUserClassIDExclude(Boolean sourceUserClassIDExclude) {
		this.sourceUserClassIDExclude = sourceUserClassIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDestUserClassID() {
		return destUserClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destUserClassID the input value
	 */
	public void  setDestUserClassID(String destUserClassID) {
		this.destUserClassID = destUserClassID;
	}

	/**
	 * Set the classification criterion. 

Used to identify one or more LAN devices, value of the DHCP User Class Identifier (Option 77) as defined in RFC 3004.

{{empty}} indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param destUserClassID the input value
	 * @return this instance
	 */
	public Classification withDestUserClassID(String destUserClassID) {
		this.destUserClassID = destUserClassID;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets destined for LAN devices that match the DestUserClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestUserClassID entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDestUserClassIDExclude() {
		return destUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the DestUserClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestUserClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param destUserClassIDExclude the input value
	 */
	public void  setDestUserClassIDExclude(Boolean destUserClassIDExclude) {
		this.destUserClassIDExclude = destUserClassIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets destined for LAN devices that match the DestUserClassID entry, if specified.

If {{true}}, the class includes all packets except those destined for LAN devices that match the DestUserClassID entry, if specified.
	 *
	 * @since 1.1
	 * @param destUserClassIDExclude the input value
	 * @return this instance
	 */
	public Classification withDestUserClassIDExclude(Boolean destUserClassIDExclude) {
		this.destUserClassIDExclude = destUserClassIDExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

If {{false}}, this criterion is not used for classification.

If {{true}}, this criterion matches with all TCP segments that have the ACK control bit set.
	 *
	 * @since 1.1
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
	 * @since 1.1
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
	 * @since 1.1
	 * @param tcpACK the input value
	 * @return this instance
	 */
	public Classification withTcpACK(Boolean tcpACK) {
		this.tcpACK = tcpACK;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the TCPACK entry, if specified.

If {{true}}, the class includes all packets except those that match the TCPACK entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isTcpACKExclude() {
		return tcpACKExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the TCPACK entry, if specified.

If {{true}}, the class includes all packets except those that match the TCPACK entry, if specified.
	 *
	 * @since 1.1
	 * @param tcpACKExclude the input value
	 */
	public void  setTcpACKExclude(Boolean tcpACKExclude) {
		this.tcpACKExclude = tcpACKExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the TCPACK entry, if specified.

If {{true}}, the class includes all packets except those that match the TCPACK entry, if specified.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public Long getIplengthMin() {
		return iplengthMin;
	}

	/**
	 * Set the classification criterion.

Minimum IP Packet Length (including header) in bytes.
	 *
	 * @since 1.1
	 * @param iplengthMin the input value
	 */
	public void  setIplengthMin(Long iplengthMin) {
		this.iplengthMin = iplengthMin;
	}

	/**
	 * Set the classification criterion.

Minimum IP Packet Length (including header) in bytes.
	 *
	 * @since 1.1
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
	 * @since 1.1
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
	 * @since 1.1
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
	 * @since 1.1
	 * @param iplengthMax the input value
	 * @return this instance
	 */
	public Classification withIplengthMax(Long iplengthMax) {
		this.iplengthMax = iplengthMax;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.  A value of zero for both IPLengthMin and IPLengthMax allows any length packet.  An equal non-zero value of IPLengthMin and IPLengthMax allows only a packet with the exact length specified.

If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isIplengthExclude() {
		return iplengthExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.  A value of zero for both IPLengthMin and IPLengthMax allows any length packet.  An equal non-zero value of IPLengthMin and IPLengthMax allows only a packet with the exact length specified.

If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.
	 *
	 * @since 1.1
	 * @param iplengthExclude the input value
	 */
	public void  setIplengthExclude(Boolean iplengthExclude) {
		this.iplengthExclude = iplengthExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.  A value of zero for both IPLengthMin and IPLengthMax allows any length packet.  An equal non-zero value of IPLengthMin and IPLengthMax allows only a packet with the exact length specified.

If {{true}}, the class includes all packets except those whose length (including header) falls within the inclusive range IPLengthMin through IPLengthMax.
	 *
	 * @since 1.1
	 * @param iplengthExclude the input value
	 * @return this instance
	 */
	public Classification withIplengthExclude(Boolean iplengthExclude) {
		this.iplengthExclude = iplengthExclude;
		return this;
	}

	/**
	 * Get the classification criterion.

DiffServ codepoint (defined in RFC 2474).

If set to a Class Selector Codepoint (defined in RFC 2474), all DSCP values that match the first 3 bits will be considered a valid match.

A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDscPCheck() {
		return dscPCheck;
	}

	/**
	 * Set the classification criterion.

DiffServ codepoint (defined in RFC 2474).

If set to a Class Selector Codepoint (defined in RFC 2474), all DSCP values that match the first 3 bits will be considered a valid match.

A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param dscPCheck the input value
	 */
	public void  setDscPCheck(Integer dscPCheck) {
		this.dscPCheck = dscPCheck;
	}

	/**
	 * Set the classification criterion.

DiffServ codepoint (defined in RFC 2474).

If set to a Class Selector Codepoint (defined in RFC 2474), all DSCP values that match the first 3 bits will be considered a valid match.

A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param dscPCheck the input value
	 * @return this instance
	 */
	public Classification withDscPCheck(Integer dscPCheck) {
		this.dscPCheck = dscPCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the DSCPCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the DSCPCheck entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isDscPExclude() {
		return dscPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the DSCPCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the DSCPCheck entry, if specified.
	 *
	 * @since 1.1
	 * @param dscPExclude the input value
	 */
	public void  setDscPExclude(Boolean dscPExclude) {
		this.dscPExclude = dscPExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the DSCPCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the DSCPCheck entry, if specified.
	 *
	 * @since 1.1
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

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDscPMark() {
		return dscPMark;
	}

	/**
	 * Set the classification result.

DSCP to mark traffic with that falls into this classification entry.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param dscPMark the input value
	 */
	public void  setDscPMark(Integer dscPMark) {
		this.dscPMark = dscPMark;
	}

	/**
	 * Set the classification result.

DSCP to mark traffic with that falls into this classification entry.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param dscPMark the input value
	 * @return this instance
	 */
	public Classification withDscPMark(Integer dscPMark) {
		this.dscPMark = dscPMark;
		return this;
	}

	/**
	 * Get the classification criterion.

Current Ethernet priority as defined in 802.1D.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getEthernetPriorityCheck() {
		return ethernetPriorityCheck;
	}

	/**
	 * Set the classification criterion.

Current Ethernet priority as defined in 802.1D.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param ethernetPriorityCheck the input value
	 */
	public void  setEthernetPriorityCheck(Integer ethernetPriorityCheck) {
		this.ethernetPriorityCheck = ethernetPriorityCheck;
	}

	/**
	 * Set the classification criterion.

Current Ethernet priority as defined in 802.1D.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param ethernetPriorityCheck the input value
	 * @return this instance
	 */
	public Classification withEthernetPriorityCheck(Integer ethernetPriorityCheck) {
		this.ethernetPriorityCheck = ethernetPriorityCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the EthernetPriorityCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the EthernetPriorityCheck entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEthernetPriorityExclude() {
		return ethernetPriorityExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the EthernetPriorityCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the EthernetPriorityCheck entry, if specified.
	 *
	 * @since 1.1
	 * @param ethernetPriorityExclude the input value
	 */
	public void  setEthernetPriorityExclude(Boolean ethernetPriorityExclude) {
		this.ethernetPriorityExclude = ethernetPriorityExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the EthernetPriorityCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the EthernetPriorityCheck entry, if specified.
	 *
	 * @since 1.1
	 * @param ethernetPriorityExclude the input value
	 * @return this instance
	 */
	public Classification withEthernetPriorityExclude(Boolean ethernetPriorityExclude) {
		this.ethernetPriorityExclude = ethernetPriorityExclude;
		return this;
	}

	/**
	 * Get the classification result.

Ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this classification entry.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the classification result.

Ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this classification entry.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the classification result.

Ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this classification entry.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param ethernetPriorityMark the input value
	 * @return this instance
	 */
	public Classification withEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
		return this;
	}

	/**
	 * Get the classification criterion.

Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getVlaNIDCheck() {
		return vlaNIDCheck;
	}

	/**
	 * Set the classification criterion.

Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param vlaNIDCheck the input value
	 */
	public void  setVlaNIDCheck(Integer vlaNIDCheck) {
		this.vlaNIDCheck = vlaNIDCheck;
	}

	/**
	 * Set the classification criterion.

Current Ethernet VLAN ID as defined in 802.1Q.  A value of -1 indicates this criterion is not used for classification.
	 *
	 * @since 1.1
	 * @param vlaNIDCheck the input value
	 * @return this instance
	 */
	public Classification withVlaNIDCheck(Integer vlaNIDCheck) {
		this.vlaNIDCheck = vlaNIDCheck;
		return this;
	}

	/**
	 * Get the if {{false}}, the class includes only those packets that match the VLANIDCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the VLANIDCheck entry, if specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isVlaNIDExclude() {
		return vlaNIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the VLANIDCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the VLANIDCheck entry, if specified.
	 *
	 * @since 1.1
	 * @param vlaNIDExclude the input value
	 */
	public void  setVlaNIDExclude(Boolean vlaNIDExclude) {
		this.vlaNIDExclude = vlaNIDExclude;
	}

	/**
	 * Set the if {{false}}, the class includes only those packets that match the VLANIDCheck entry, if specified.

If {{true}}, the class includes all packets except those that match the VLANIDCheck entry, if specified.
	 *
	 * @since 1.1
	 * @param vlaNIDExclude the input value
	 * @return this instance
	 */
	public Classification withVlaNIDExclude(Boolean vlaNIDExclude) {
		this.vlaNIDExclude = vlaNIDExclude;
		return this;
	}

	/**
	 * Get the classification result.

Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getForwardingPolicy() {
		return forwardingPolicy;
	}

	/**
	 * Set the classification result.

Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 1.1
	 * @param forwardingPolicy the input value
	 */
	public void  setForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
	}

	/**
	 * Set the classification result.

Identifier of the forwarding policy associated with traffic that falls in this classification.
	 *
	 * @since 1.1
	 * @param forwardingPolicy the input value
	 * @return this instance
	 */
	public Classification withForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
		return this;
	}

	/**
	 * Get the classification result.

Instance number of the Policer table entry for traffic that falls in this classification.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getClassPolicer() {
		return classPolicer;
	}

	/**
	 * Set the classification result.

Instance number of the Policer table entry for traffic that falls in this classification.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param classPolicer the input value
	 */
	public void  setClassPolicer(Integer classPolicer) {
		this.classPolicer = classPolicer;
	}

	/**
	 * Set the classification result.

Instance number of the Policer table entry for traffic that falls in this classification.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param classPolicer the input value
	 * @return this instance
	 */
	public Classification withClassPolicer(Integer classPolicer) {
		this.classPolicer = classPolicer;
		return this;
	}

	/**
	 * Get the classification result.

Instance number of the Queue table entry for traffic that falls in this classification.

A value of -1 indicates a null queue.

{{param}} and {{param|ClassApp}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is null, {{param|ClassApp}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getClassQueue() {
		return classQueue;
	}

	/**
	 * Set the classification result.

Instance number of the Queue table entry for traffic that falls in this classification.

A value of -1 indicates a null queue.

{{param}} and {{param|ClassApp}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is null, {{param|ClassApp}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 * @param classQueue the input value
	 */
	public void  setClassQueue(Integer classQueue) {
		this.classQueue = classQueue;
	}

	/**
	 * Set the classification result.

Instance number of the Queue table entry for traffic that falls in this classification.

A value of -1 indicates a null queue.

{{param}} and {{param|ClassApp}} are mutually exclusive and one of the two MUST be specified.  If {{param}} is null, {{param|ClassApp}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 * @param classQueue the input value
	 * @return this instance
	 */
	public Classification withClassQueue(Integer classQueue) {
		this.classQueue = classQueue;
		return this;
	}

	/**
	 * Get the classification result.

Instance number of the App table entry for traffic that falls in this classification.

A value of -1 indicates a null App table entry.

{{param|ClassQueue}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|ClassQueue}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getClassApp() {
		return classApp;
	}

	/**
	 * Set the classification result.

Instance number of the App table entry for traffic that falls in this classification.

A value of -1 indicates a null App table entry.

{{param|ClassQueue}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|ClassQueue}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 * @param classApp the input value
	 */
	public void  setClassApp(Integer classApp) {
		this.classApp = classApp;
	}

	/**
	 * Set the classification result.

Instance number of the App table entry for traffic that falls in this classification.

A value of -1 indicates a null App table entry.

{{param|ClassQueue}} and {{param}} are mutually exclusive and one of the two MUST be specified.  If {{param|ClassQueue}} is null, {{param}} MUST be specified, and vice versa.
	 *
	 * @since 1.1
	 * @param classApp the input value
	 * @return this instance
	 */
	public Classification withClassApp(Integer classApp) {
		this.classApp = classApp;
		return this;
	}

	//</editor-fold>

}