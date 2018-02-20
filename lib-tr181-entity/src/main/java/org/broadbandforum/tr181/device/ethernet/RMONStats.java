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
package org.broadbandforum.tr181.device.ethernet;

import javax.validation.constraints.Size;
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
	 * Ethernet statistics based on the {{bibref|RFC2819}} ''RMON-MIB'' ''etherStatsTable'', with some extensions inspired by {{bibref|G.988|Section 9.3.32}}.

        Each instance is associated with an interface capable of transporting Ethernet-encapsulated packets, and contains a set of unidirectional Ethernet statistics.

        The statistics are sampled either on ingress or on egress.  This is determined as follows:

        * If the instance is associated with an egress queue (or queues) via the {{param|Queue}} parameter or by setting {{param|AllQueues}} to {{true}} then data is sampled on egress.  In this case {{param|Bytes}} etc measure the data that has been sent on the interface, possibly filtered by {{param|Queue}} or {{param|VLANID}}.

        * Otherwise data is sampled on ingress.  In this case {{param|Bytes}} etc measure the data that has been received on the interface, possibly filtered by {{param|VLANID}}.

        When sampling on egress, the term ''received'' means ''received by the queuing sub-system''.

        Multiple instances can be associated with a single interface: individual instances can be configured to collect data associated with the entire interface, or with a particular VLAN and/or queue.

        The CPE MUST reset each instances's Stats parameters whenever the instance is disabled and re-enabled.  Whether this reset occurs when the instance becomes operationally disabled ({{param|Status}} = {{enum|Disabled|Status}}) or administratively enabled ({{param|Enable}} = {{true}}) is a local matter to the CPE.  This is similar to the behavior of interface statistics, e.g. as specified for {{object|Device.Ethernet.Interface.{i}.Stats}}.  Furthermore, this instance's Stats parameters MUST be reset whenever the referenced interface's Stats parameters are reset, or when the referenced queue or VLAN is disabled and re-enabled.

        For enabled table entries, if {{param|Interface}} references an interface that is not capable of transporting Ethernet-encapsulated packets, or if {{param|Queue}} references a queue that is not instantiated on {{param|Interface}}, or if {{param|Queue}} is not a valid reference and {{param|AllQueues}} is {{false}}, the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since TR181 v2.4
	 */
@CWMPObject(name = "Device.Ethernet.RMONStats.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Interface", "VLANID", "Queue"})})
@XmlRootElement(name = "Device.Ethernet.RMONStats")
@XmlType(name = "Device.Ethernet.RMONStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class RMONStats {

	/**
	 * Enables or disables this instance.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this instance.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The textual name of the {{object}} entry as assigned by the CPE.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The interface associated with this instance.  {{reference|an interface that is capable of transporting Ethernet-encapsulated packets}}

          The term "capable of transporting Ethernet-encapsulated packets" means "has an Ethernet header" and therefore refers to any interface that is at or below an ''Ethernet''.{{object|#.Link}} instance in the interface stack.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	public String _interface;
	/**
	 * Filter criterion.

          The VLAN ID for which statistics are to be collected.

          A zero value indicates that all packets, whether or not they have a VLAN header, will be considered.

          A non-zero value indicates that only packets that have the the specified VLAN ID will be considered.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "VLANID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4094)
	public Long vlaNID = 0L;
	/**
	 * Filter criterion.

          The egress queue with which this instance is associated.

          Only packets that are sent to the referenced queue will be considered.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Queue")
	@CWMPParameter(access = "readWrite")
	public String queue;
	/**
	 * Indicates whether this instance applies to all queues.  If {{true}}, the value of {{param|Queue}} is ignored since all egress queues are indicated.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "AllQueues")
	@CWMPParameter(access = "readWrite")
	public Boolean allQueues;
	/**
	 * The total number of events in which packets were dropped due to lack of resources.  Note that this number is not necessarily the number of packets dropped; it is just the number of times this condition has been detected.

          This parameter is based on ''etherStatsDropEvents'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DropEvents")
	@CWMPParameter(activeNotify = "canDeny")
	public Long dropEvents = 0L;
	/**
	 * The total number of bytes (including those in bad packets) received (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsOctets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Bytes")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long bytes = 0L;
	/**
	 * The total number of packets (including bad packets, broadcast packets, and multicast packets) received.

          This parameter is based on ''etherStatsPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Packets")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long packets = 0L;
	/**
	 * The total number of good packets received that were directed to the broadcast address.  Note that this does not include multicast packets.

          This parameter is based on ''etherStatsBroadcastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "BroadcastPackets")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long broadcastPackets = 0L;
	/**
	 * The total number of good packets received that were directed to a multicast address.  Note that this number does not include packets directed to the broadcast address.

          This parameter is based on ''etherStatsMulticastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MulticastPackets")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long multicastPackets = 0L;
	/**
	 * The total number of packets received that had a length (excluding framing bits, but including FCS bytes) of between 64 and 1518 bytes, inclusive, but had either a bad Frame Check Sequence (FCS) with an integral number of bytes (FCS Error) or a bad FCS with a non-integral number of bytes (Alignment Error).

          This parameter is based on ''etherStatsCRCAlignErrors'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "CRCErroredPackets")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long crcErroredPackets = 0L;
	/**
	 * The total number of packets received that were less than 64 bytes long (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsUndersizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "UndersizePackets")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long undersizePackets = 0L;
	/**
	 * The total number of packets received that were longer than 1518 bytes (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsOversizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "OversizePackets")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long oversizePackets = 0L;
	/**
	 * The total number of packets (including bad packets) received that were 64 bytes in length (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts64Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Packets64Bytes")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long packets64Bytes = 0L;
	/**
	 * The total number of packets (including bad packets) received that were between 65 and 127 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts65to127Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Packets65to127Bytes")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long packets65to127Bytes = 0L;
	/**
	 * The total number of packets (including bad packets) received that were between 128 and 255 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts6128to255Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Packets128to255Bytes")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long packets128to255Bytes = 0L;
	/**
	 * The total number of packets (including bad packets) received that were between 256 and 511 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts256to511Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Packets256to511Bytes")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long packets256to511Bytes = 0L;
	/**
	 * The total number of packets (including bad packets) received that were between 512 and 1023 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts512to1023Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Packets512to1023Bytes")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long packets512to1023Bytes = 0L;
	/**
	 * The total number of packets (including bad packets) received that were between 1024 and 1518 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts1024to1518Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Packets1024to1518Bytes")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long packets1024to1518Bytes = 0L;

	public RMONStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this instance.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this instance.
	 *
	 * @since 2.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this instance.
	 *
	 * @since 2.4
	 * @param enable the input value
	 * @return this instance
	 */
	public RMONStats withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this instance.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this instance.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.4
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this instance.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.4
	 * @param status the input value
	 * @return this instance
	 */
	public RMONStats withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.4
	 * @param alias the input value
	 * @return this instance
	 */
	public RMONStats withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the {{object}} entry as assigned by the CPE.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the {{object}} entry as assigned by the CPE.
	 *
	 * @since 2.4
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the {{object}} entry as assigned by the CPE.
	 *
	 * @since 2.4
	 * @param name the input value
	 * @return this instance
	 */
	public RMONStats withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the interface associated with this instance.  {{reference|an interface that is capable of transporting Ethernet-encapsulated packets}}

          The term "capable of transporting Ethernet-encapsulated packets" means "has an Ethernet header" and therefore refers to any interface that is at or below an ''Ethernet''.{{object|#.Link}} instance in the interface stack.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the interface associated with this instance.  {{reference|an interface that is capable of transporting Ethernet-encapsulated packets}}

          The term "capable of transporting Ethernet-encapsulated packets" means "has an Ethernet header" and therefore refers to any interface that is at or below an ''Ethernet''.{{object|#.Link}} instance in the interface stack.
	 *
	 * @since 2.4
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the interface associated with this instance.  {{reference|an interface that is capable of transporting Ethernet-encapsulated packets}}

          The term "capable of transporting Ethernet-encapsulated packets" means "has an Ethernet header" and therefore refers to any interface that is at or below an ''Ethernet''.{{object|#.Link}} instance in the interface stack.
	 *
	 * @since 2.4
	 * @param _interface the input value
	 * @return this instance
	 */
	public RMONStats with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the filter criterion.

          The VLAN ID for which statistics are to be collected.

          A zero value indicates that all packets, whether or not they have a VLAN header, will be considered.

          A non-zero value indicates that only packets that have the the specified VLAN ID will be considered.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getVlaNID() {
		return vlaNID;
	}

	/**
	 * Set the filter criterion.

          The VLAN ID for which statistics are to be collected.

          A zero value indicates that all packets, whether or not they have a VLAN header, will be considered.

          A non-zero value indicates that only packets that have the the specified VLAN ID will be considered.
	 *
	 * @since 2.4
	 * @param vlaNID the input value
	 */
	public void  setVlaNID(Long vlaNID) {
		this.vlaNID = vlaNID;
	}

	/**
	 * Set the filter criterion.

          The VLAN ID for which statistics are to be collected.

          A zero value indicates that all packets, whether or not they have a VLAN header, will be considered.

          A non-zero value indicates that only packets that have the the specified VLAN ID will be considered.
	 *
	 * @since 2.4
	 * @param vlaNID the input value
	 * @return this instance
	 */
	public RMONStats withVlaNID(Long vlaNID) {
		this.vlaNID = vlaNID;
		return this;
	}

	/**
	 * Get the filter criterion.

          The egress queue with which this instance is associated.

          Only packets that are sent to the referenced queue will be considered.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getQueue() {
		return queue;
	}

	/**
	 * Set the filter criterion.

          The egress queue with which this instance is associated.

          Only packets that are sent to the referenced queue will be considered.
	 *
	 * @since 2.4
	 * @param queue the input value
	 */
	public void  setQueue(String queue) {
		this.queue = queue;
	}

	/**
	 * Set the filter criterion.

          The egress queue with which this instance is associated.

          Only packets that are sent to the referenced queue will be considered.
	 *
	 * @since 2.4
	 * @param queue the input value
	 * @return this instance
	 */
	public RMONStats withQueue(String queue) {
		this.queue = queue;
		return this;
	}

	/**
	 * Get the indicates whether this instance applies to all queues.  If {{true}}, the value of {{param|Queue}} is ignored since all egress queues are indicated.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isAllQueues() {
		return allQueues;
	}

	/**
	 * Set the indicates whether this instance applies to all queues.  If {{true}}, the value of {{param|Queue}} is ignored since all egress queues are indicated.
	 *
	 * @since 2.4
	 * @param allQueues the input value
	 */
	public void  setAllQueues(Boolean allQueues) {
		this.allQueues = allQueues;
	}

	/**
	 * Set the indicates whether this instance applies to all queues.  If {{true}}, the value of {{param|Queue}} is ignored since all egress queues are indicated.
	 *
	 * @since 2.4
	 * @param allQueues the input value
	 * @return this instance
	 */
	public RMONStats withAllQueues(Boolean allQueues) {
		this.allQueues = allQueues;
		return this;
	}

	/**
	 * Get the total number of events in which packets were dropped due to lack of resources.  Note that this number is not necessarily the number of packets dropped; it is just the number of times this condition has been detected.

          This parameter is based on ''etherStatsDropEvents'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getDropEvents() {
		return dropEvents;
	}

	/**
	 * Set the total number of events in which packets were dropped due to lack of resources.  Note that this number is not necessarily the number of packets dropped; it is just the number of times this condition has been detected.

          This parameter is based on ''etherStatsDropEvents'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param dropEvents the input value
	 */
	public void  setDropEvents(Long dropEvents) {
		this.dropEvents = dropEvents;
	}

	/**
	 * Set the total number of events in which packets were dropped due to lack of resources.  Note that this number is not necessarily the number of packets dropped; it is just the number of times this condition has been detected.

          This parameter is based on ''etherStatsDropEvents'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param dropEvents the input value
	 * @return this instance
	 */
	public RMONStats withDropEvents(Long dropEvents) {
		this.dropEvents = dropEvents;
		return this;
	}

	/**
	 * Get the total number of bytes (including those in bad packets) received (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsOctets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getBytes() {
		return bytes;
	}

	/**
	 * Set the total number of bytes (including those in bad packets) received (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsOctets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param bytes the input value
	 */
	public void  setBytes(Long bytes) {
		this.bytes = bytes;
	}

	/**
	 * Set the total number of bytes (including those in bad packets) received (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsOctets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param bytes the input value
	 * @return this instance
	 */
	public RMONStats withBytes(Long bytes) {
		this.bytes = bytes;
		return this;
	}

	/**
	 * Get the total number of packets (including bad packets, broadcast packets, and multicast packets) received.

          This parameter is based on ''etherStatsPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getPackets() {
		return packets;
	}

	/**
	 * Set the total number of packets (including bad packets, broadcast packets, and multicast packets) received.

          This parameter is based on ''etherStatsPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets the input value
	 */
	public void  setPackets(Long packets) {
		this.packets = packets;
	}

	/**
	 * Set the total number of packets (including bad packets, broadcast packets, and multicast packets) received.

          This parameter is based on ''etherStatsPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets the input value
	 * @return this instance
	 */
	public RMONStats withPackets(Long packets) {
		this.packets = packets;
		return this;
	}

	/**
	 * Get the total number of good packets received that were directed to the broadcast address.  Note that this does not include multicast packets.

          This parameter is based on ''etherStatsBroadcastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getBroadcastPackets() {
		return broadcastPackets;
	}

	/**
	 * Set the total number of good packets received that were directed to the broadcast address.  Note that this does not include multicast packets.

          This parameter is based on ''etherStatsBroadcastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param broadcastPackets the input value
	 */
	public void  setBroadcastPackets(Long broadcastPackets) {
		this.broadcastPackets = broadcastPackets;
	}

	/**
	 * Set the total number of good packets received that were directed to the broadcast address.  Note that this does not include multicast packets.

          This parameter is based on ''etherStatsBroadcastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param broadcastPackets the input value
	 * @return this instance
	 */
	public RMONStats withBroadcastPackets(Long broadcastPackets) {
		this.broadcastPackets = broadcastPackets;
		return this;
	}

	/**
	 * Get the total number of good packets received that were directed to a multicast address.  Note that this number does not include packets directed to the broadcast address.

          This parameter is based on ''etherStatsMulticastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMulticastPackets() {
		return multicastPackets;
	}

	/**
	 * Set the total number of good packets received that were directed to a multicast address.  Note that this number does not include packets directed to the broadcast address.

          This parameter is based on ''etherStatsMulticastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param multicastPackets the input value
	 */
	public void  setMulticastPackets(Long multicastPackets) {
		this.multicastPackets = multicastPackets;
	}

	/**
	 * Set the total number of good packets received that were directed to a multicast address.  Note that this number does not include packets directed to the broadcast address.

          This parameter is based on ''etherStatsMulticastPkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param multicastPackets the input value
	 * @return this instance
	 */
	public RMONStats withMulticastPackets(Long multicastPackets) {
		this.multicastPackets = multicastPackets;
		return this;
	}

	/**
	 * Get the total number of packets received that had a length (excluding framing bits, but including FCS bytes) of between 64 and 1518 bytes, inclusive, but had either a bad Frame Check Sequence (FCS) with an integral number of bytes (FCS Error) or a bad FCS with a non-integral number of bytes (Alignment Error).

          This parameter is based on ''etherStatsCRCAlignErrors'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getCrcErroredPackets() {
		return crcErroredPackets;
	}

	/**
	 * Set the total number of packets received that had a length (excluding framing bits, but including FCS bytes) of between 64 and 1518 bytes, inclusive, but had either a bad Frame Check Sequence (FCS) with an integral number of bytes (FCS Error) or a bad FCS with a non-integral number of bytes (Alignment Error).

          This parameter is based on ''etherStatsCRCAlignErrors'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param crcErroredPackets the input value
	 */
	public void  setCrcErroredPackets(Long crcErroredPackets) {
		this.crcErroredPackets = crcErroredPackets;
	}

	/**
	 * Set the total number of packets received that had a length (excluding framing bits, but including FCS bytes) of between 64 and 1518 bytes, inclusive, but had either a bad Frame Check Sequence (FCS) with an integral number of bytes (FCS Error) or a bad FCS with a non-integral number of bytes (Alignment Error).

          This parameter is based on ''etherStatsCRCAlignErrors'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param crcErroredPackets the input value
	 * @return this instance
	 */
	public RMONStats withCrcErroredPackets(Long crcErroredPackets) {
		this.crcErroredPackets = crcErroredPackets;
		return this;
	}

	/**
	 * Get the total number of packets received that were less than 64 bytes long (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsUndersizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getUndersizePackets() {
		return undersizePackets;
	}

	/**
	 * Set the total number of packets received that were less than 64 bytes long (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsUndersizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param undersizePackets the input value
	 */
	public void  setUndersizePackets(Long undersizePackets) {
		this.undersizePackets = undersizePackets;
	}

	/**
	 * Set the total number of packets received that were less than 64 bytes long (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsUndersizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param undersizePackets the input value
	 * @return this instance
	 */
	public RMONStats withUndersizePackets(Long undersizePackets) {
		this.undersizePackets = undersizePackets;
		return this;
	}

	/**
	 * Get the total number of packets received that were longer than 1518 bytes (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsOversizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getOversizePackets() {
		return oversizePackets;
	}

	/**
	 * Set the total number of packets received that were longer than 1518 bytes (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsOversizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param oversizePackets the input value
	 */
	public void  setOversizePackets(Long oversizePackets) {
		this.oversizePackets = oversizePackets;
	}

	/**
	 * Set the total number of packets received that were longer than 1518 bytes (excluding framing bits, but including FCS bytes) and were otherwise well formed.

          This parameter is based on ''etherStatsOversizePkts'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param oversizePackets the input value
	 * @return this instance
	 */
	public RMONStats withOversizePackets(Long oversizePackets) {
		this.oversizePackets = oversizePackets;
		return this;
	}

	/**
	 * Get the total number of packets (including bad packets) received that were 64 bytes in length (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts64Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getPackets64Bytes() {
		return packets64Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were 64 bytes in length (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts64Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets64Bytes the input value
	 */
	public void  setPackets64Bytes(Long packets64Bytes) {
		this.packets64Bytes = packets64Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were 64 bytes in length (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts64Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets64Bytes the input value
	 * @return this instance
	 */
	public RMONStats withPackets64Bytes(Long packets64Bytes) {
		this.packets64Bytes = packets64Bytes;
		return this;
	}

	/**
	 * Get the total number of packets (including bad packets) received that were between 65 and 127 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts65to127Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getPackets65to127Bytes() {
		return packets65to127Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 65 and 127 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts65to127Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets65to127Bytes the input value
	 */
	public void  setPackets65to127Bytes(Long packets65to127Bytes) {
		this.packets65to127Bytes = packets65to127Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 65 and 127 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts65to127Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets65to127Bytes the input value
	 * @return this instance
	 */
	public RMONStats withPackets65to127Bytes(Long packets65to127Bytes) {
		this.packets65to127Bytes = packets65to127Bytes;
		return this;
	}

	/**
	 * Get the total number of packets (including bad packets) received that were between 128 and 255 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts6128to255Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getPackets128to255Bytes() {
		return packets128to255Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 128 and 255 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts6128to255Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets128to255Bytes the input value
	 */
	public void  setPackets128to255Bytes(Long packets128to255Bytes) {
		this.packets128to255Bytes = packets128to255Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 128 and 255 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts6128to255Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets128to255Bytes the input value
	 * @return this instance
	 */
	public RMONStats withPackets128to255Bytes(Long packets128to255Bytes) {
		this.packets128to255Bytes = packets128to255Bytes;
		return this;
	}

	/**
	 * Get the total number of packets (including bad packets) received that were between 256 and 511 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts256to511Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getPackets256to511Bytes() {
		return packets256to511Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 256 and 511 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts256to511Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets256to511Bytes the input value
	 */
	public void  setPackets256to511Bytes(Long packets256to511Bytes) {
		this.packets256to511Bytes = packets256to511Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 256 and 511 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts256to511Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets256to511Bytes the input value
	 * @return this instance
	 */
	public RMONStats withPackets256to511Bytes(Long packets256to511Bytes) {
		this.packets256to511Bytes = packets256to511Bytes;
		return this;
	}

	/**
	 * Get the total number of packets (including bad packets) received that were between 512 and 1023 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts512to1023Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getPackets512to1023Bytes() {
		return packets512to1023Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 512 and 1023 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts512to1023Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets512to1023Bytes the input value
	 */
	public void  setPackets512to1023Bytes(Long packets512to1023Bytes) {
		this.packets512to1023Bytes = packets512to1023Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 512 and 1023 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts512to1023Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets512to1023Bytes the input value
	 * @return this instance
	 */
	public RMONStats withPackets512to1023Bytes(Long packets512to1023Bytes) {
		this.packets512to1023Bytes = packets512to1023Bytes;
		return this;
	}

	/**
	 * Get the total number of packets (including bad packets) received that were between 1024 and 1518 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts1024to1518Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getPackets1024to1518Bytes() {
		return packets1024to1518Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 1024 and 1518 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts1024to1518Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets1024to1518Bytes the input value
	 */
	public void  setPackets1024to1518Bytes(Long packets1024to1518Bytes) {
		this.packets1024to1518Bytes = packets1024to1518Bytes;
	}

	/**
	 * Set the total number of packets (including bad packets) received that were between 1024 and 1518 bytes in length inclusive (excluding framing bits but including FCS bytes).

          This parameter is based on ''etherStatsPkts1024to1518Octets'' from {{bibref|RFC2819}}.
	 *
	 * @since 2.4
	 * @param packets1024to1518Bytes the input value
	 * @return this instance
	 */
	public RMONStats withPackets1024to1518Bytes(Long packets1024to1518Bytes) {
		this.packets1024to1518Bytes = packets1024to1518Bytes;
		return this;
	}

	//</editor-fold>

}