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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.qos.App;
import org.broadbandforum.tr181.device.qos.Classification;
import org.broadbandforum.tr181.device.qos.Flow;
import org.broadbandforum.tr181.device.qos.Policer;
import org.broadbandforum.tr181.device.qos.Queue;
import org.broadbandforum.tr181.device.qos.QueueStats;
import org.broadbandforum.tr181.device.qos.Shaper;

	/**
	 * Queue management configuration object.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.QoS.")
public class QoS {

	/**
	 * The maximum number of entries available in the Classification table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxClassificationEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxClassificationEntries;
	/**
	 * The maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxAppEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxAppEntries;
	/**
	 * The maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFlowEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxFlowEntries;
	/**
	 * The maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxPolicerEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxPolicerEntries;
	/**
	 * The maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxQueueEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxQueueEntries;
	/**
	 * The maximum number of entries available in the {{object|Shaper}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxShaperEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxShaperEntries;
	/**
	 * Identifier of the forwarding policy associated with traffic not associated with any specified  classifier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long defaultForwardingPolicy;
	/**
	 * Identifier of the traffic class associated with traffic not associated with any specified classifier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultTrafficClass")
	@CWMPParameter(access = "readWrite")
	public Long defaultTrafficClass;
	/**
	 * {{reference}} Indicates the ''Policer'' table entry for traffic not associated with any specified classifier.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultPolicer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String defaultPolicer;
	/**
	 * {{reference}} Indicates the ''Queue'' table entry for traffic not associated with any specified classifier. Note: The interpretation of {{empty}} value is implementation specific.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultQueue")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String defaultQueue;
	/**
	 * DSCP to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultDSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultDSCPMark;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultEthernetPriorityMark;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic of the inner VLAN Tag as defined in 802.1Q, when the PDU is not associated with any specified classifier. This parameter is only applicable when the PDU has 2 VLAN Tags.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DefaultInnerEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultInnerEthernetPriorityMark;
	/**
	 * {{list}} List items represent URNs, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-181i2|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AvailableAppList")
	@Size(max = 1024)
	@XmlList
	public Collection<String> availableAppList;
	/**
	 * Classification table.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as classification criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 */
	@XmlElementWrapper(name = "Classifications")
	@XmlElement(name = "Classification")
	@CWMPParameter(access = "readWrite")
	public Collection<Classification> classifications;
	/**
	 * Application table.
	 */
	@XmlElementWrapper(name = "Apps")
	@XmlElement(name = "App")
	@CWMPParameter(access = "readWrite")
	public Collection<App> apps;
	/**
	 * Flow table.
	 */
	@XmlElementWrapper(name = "Flows")
	@XmlElement(name = "Flow")
	@CWMPParameter(access = "readWrite")
	public Collection<Flow> flows;
	/**
	 * Policer table.
	 */
	@XmlElementWrapper(name = "Policers")
	@XmlElement(name = "Policer")
	@CWMPParameter(access = "readWrite")
	public Collection<Policer> policers;
	/**
	 * Queue table. Each entry is associated with a set of traffic classes, which are specified via the {{param|TrafficClasses}} parameter, and is configured with weight, precedence, drop algorithm, scheduler algorithm etc as appropriate for the traffic classes. An entry can be associated either with all egress interfaces (in which case an actual queue will be instantiated on each egress interface on which traffic of that traffic class can be generated) or else with a single specified egress interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "Queues")
	@XmlElement(name = "Queue")
	@CWMPParameter(access = "readWrite")
	public Collection<Queue> queues;
	/**
	 * Queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "QueueStatss")
	@XmlElement(name = "QueueStats")
	@CWMPParameter(access = "readWrite")
	public Collection<QueueStats> queueStatss;
	/**
	 * Shaper table. Used to shape the queue(s) associated with {{param|Interface}}. In case of a single queue for that interface, determines the egress rate of the queue. In case of multiple queues for that interface (possibly with per queue shaping rates), determines the aggregate egress rate on that interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "Shapers")
	@XmlElement(name = "Shaper")
	@CWMPParameter(access = "readWrite")
	public Collection<Shaper> shapers;

	public QoS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries available in the Classification table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxClassificationEntries() {
		return maxClassificationEntries;
	}

	/**
	 * Set the maximum number of entries available in the Classification table.
	 *
	 * @since 2.0
	 * @param maxClassificationEntries the input value
	 */
	public void  setMaxClassificationEntries(Long maxClassificationEntries) {
		this.maxClassificationEntries = maxClassificationEntries;
	}

	/**
	 * Set the maximum number of entries available in the Classification table.
	 *
	 * @since 2.0
	 * @param maxClassificationEntries the input value
	 * @return this instance
	 */
	public QoS withMaxClassificationEntries(Long maxClassificationEntries) {
		this.maxClassificationEntries = maxClassificationEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxAppEntries() {
		return maxAppEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 2.0
	 * @param maxAppEntries the input value
	 */
	public void  setMaxAppEntries(Long maxAppEntries) {
		this.maxAppEntries = maxAppEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 2.0
	 * @param maxAppEntries the input value
	 * @return this instance
	 */
	public QoS withMaxAppEntries(Long maxAppEntries) {
		this.maxAppEntries = maxAppEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxFlowEntries() {
		return maxFlowEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 2.0
	 * @param maxFlowEntries the input value
	 */
	public void  setMaxFlowEntries(Long maxFlowEntries) {
		this.maxFlowEntries = maxFlowEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 2.0
	 * @param maxFlowEntries the input value
	 * @return this instance
	 */
	public QoS withMaxFlowEntries(Long maxFlowEntries) {
		this.maxFlowEntries = maxFlowEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxPolicerEntries() {
		return maxPolicerEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 2.0
	 * @param maxPolicerEntries the input value
	 */
	public void  setMaxPolicerEntries(Long maxPolicerEntries) {
		this.maxPolicerEntries = maxPolicerEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 2.0
	 * @param maxPolicerEntries the input value
	 * @return this instance
	 */
	public QoS withMaxPolicerEntries(Long maxPolicerEntries) {
		this.maxPolicerEntries = maxPolicerEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxQueueEntries() {
		return maxQueueEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 2.0
	 * @param maxQueueEntries the input value
	 */
	public void  setMaxQueueEntries(Long maxQueueEntries) {
		this.maxQueueEntries = maxQueueEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 2.0
	 * @param maxQueueEntries the input value
	 * @return this instance
	 */
	public QoS withMaxQueueEntries(Long maxQueueEntries) {
		this.maxQueueEntries = maxQueueEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Shaper}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxShaperEntries() {
		return maxShaperEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Shaper}} table.
	 *
	 * @since 2.0
	 * @param maxShaperEntries the input value
	 */
	public void  setMaxShaperEntries(Long maxShaperEntries) {
		this.maxShaperEntries = maxShaperEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Shaper}} table.
	 *
	 * @since 2.0
	 * @param maxShaperEntries the input value
	 * @return this instance
	 */
	public QoS withMaxShaperEntries(Long maxShaperEntries) {
		this.maxShaperEntries = maxShaperEntries;
		return this;
	}

	/**
	 * Get the identifier of the forwarding policy associated with traffic not associated with any specified  classifier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDefaultForwardingPolicy() {
		return defaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic not associated with any specified  classifier.
	 *
	 * @since 2.0
	 * @param defaultForwardingPolicy the input value
	 */
	public void  setDefaultForwardingPolicy(Long defaultForwardingPolicy) {
		this.defaultForwardingPolicy = defaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic not associated with any specified  classifier.
	 *
	 * @since 2.0
	 * @param defaultForwardingPolicy the input value
	 * @return this instance
	 */
	public QoS withDefaultForwardingPolicy(Long defaultForwardingPolicy) {
		this.defaultForwardingPolicy = defaultForwardingPolicy;
		return this;
	}

	/**
	 * Get the identifier of the traffic class associated with traffic not associated with any specified classifier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDefaultTrafficClass() {
		return defaultTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with traffic not associated with any specified classifier.
	 *
	 * @since 2.0
	 * @param defaultTrafficClass the input value
	 */
	public void  setDefaultTrafficClass(Long defaultTrafficClass) {
		this.defaultTrafficClass = defaultTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with traffic not associated with any specified classifier.
	 *
	 * @since 2.0
	 * @param defaultTrafficClass the input value
	 * @return this instance
	 */
	public QoS withDefaultTrafficClass(Long defaultTrafficClass) {
		this.defaultTrafficClass = defaultTrafficClass;
		return this;
	}

	/**
	 * Get the {{reference}} Indicates the ''Policer'' table entry for traffic not associated with any specified classifier.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDefaultPolicer() {
		return defaultPolicer;
	}

	/**
	 * Set the {{reference}} Indicates the ''Policer'' table entry for traffic not associated with any specified classifier.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @param defaultPolicer the input value
	 */
	public void  setDefaultPolicer(String defaultPolicer) {
		this.defaultPolicer = defaultPolicer;
	}

	/**
	 * Set the {{reference}} Indicates the ''Policer'' table entry for traffic not associated with any specified classifier.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @param defaultPolicer the input value
	 * @return this instance
	 */
	public QoS withDefaultPolicer(String defaultPolicer) {
		this.defaultPolicer = defaultPolicer;
		return this;
	}

	/**
	 * Get the {{reference}} Indicates the ''Queue'' table entry for traffic not associated with any specified classifier. Note: The interpretation of {{empty}} value is implementation specific.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDefaultQueue() {
		return defaultQueue;
	}

	/**
	 * Set the {{reference}} Indicates the ''Queue'' table entry for traffic not associated with any specified classifier. Note: The interpretation of {{empty}} value is implementation specific.
	 *
	 * @since 2.0
	 * @param defaultQueue the input value
	 */
	public void  setDefaultQueue(String defaultQueue) {
		this.defaultQueue = defaultQueue;
	}

	/**
	 * Set the {{reference}} Indicates the ''Queue'' table entry for traffic not associated with any specified classifier. Note: The interpretation of {{empty}} value is implementation specific.
	 *
	 * @since 2.0
	 * @param defaultQueue the input value
	 * @return this instance
	 */
	public QoS withDefaultQueue(String defaultQueue) {
		this.defaultQueue = defaultQueue;
		return this;
	}

	/**
	 * Get the dscP to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDefaultDSCPMark() {
		return defaultDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param defaultDSCPMark the input value
	 */
	public void  setDefaultDSCPMark(Integer defaultDSCPMark) {
		this.defaultDSCPMark = defaultDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param defaultDSCPMark the input value
	 * @return this instance
	 */
	public QoS withDefaultDSCPMark(Integer defaultDSCPMark) {
		this.defaultDSCPMark = defaultDSCPMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDefaultEthernetPriorityMark() {
		return defaultEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 * @param defaultEthernetPriorityMark the input value
	 */
	public void  setDefaultEthernetPriorityMark(Integer defaultEthernetPriorityMark) {
		this.defaultEthernetPriorityMark = defaultEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic not associated with any specified classifier.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 * @param defaultEthernetPriorityMark the input value
	 * @return this instance
	 */
	public QoS withDefaultEthernetPriorityMark(Integer defaultEthernetPriorityMark) {
		this.defaultEthernetPriorityMark = defaultEthernetPriorityMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic of the inner VLAN Tag as defined in 802.1Q, when the PDU is not associated with any specified classifier. This parameter is only applicable when the PDU has 2 VLAN Tags.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Integer getDefaultInnerEthernetPriorityMark() {
		return defaultInnerEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic of the inner VLAN Tag as defined in 802.1Q, when the PDU is not associated with any specified classifier. This parameter is only applicable when the PDU has 2 VLAN Tags.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @param defaultInnerEthernetPriorityMark the input value
	 */
	public void  setDefaultInnerEthernetPriorityMark(Integer defaultInnerEthernetPriorityMark) {
		this.defaultInnerEthernetPriorityMark = defaultInnerEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic of the inner VLAN Tag as defined in 802.1Q, when the PDU is not associated with any specified classifier. This parameter is only applicable when the PDU has 2 VLAN Tags.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @param defaultInnerEthernetPriorityMark the input value
	 * @return this instance
	 */
	public QoS withDefaultInnerEthernetPriorityMark(Integer defaultInnerEthernetPriorityMark) {
		this.defaultInnerEthernetPriorityMark = defaultInnerEthernetPriorityMark;
		return this;
	}

	/**
	 * Get the {{list}} List items represent URNs, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-181i2|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAvailableAppList() {
		if (this.availableAppList == null){ this.availableAppList=new ArrayList<>();}
		return availableAppList;
	}

	/**
	 * Set the {{list}} List items represent URNs, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-181i2|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 2.0
	 * @param availableAppList the input value
	 */
	public void  setAvailableAppList(Collection<String> availableAppList) {
		this.availableAppList = availableAppList;
	}

	/**
	 * Set the {{list}} List items represent URNs, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-181i2|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public QoS withAvailableAppList(String string) {
		getAvailableAppList().add(string);
		return this;
	}

	/**
	 * Get the classification table.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as classification criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @return the value
	 */
	public Collection<Classification> getClassifications() {
		if (this.classifications == null){ this.classifications=new ArrayList<>();}
		return classifications;
	}

	/**
	 * Set the classification table.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as classification criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @param classifications the input value
	 */
	public void  setClassifications(Collection<Classification> classifications) {
		this.classifications = classifications;
	}

	/**
	 * Set the classification table.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as classification criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @param classification the input value
	 * @return this instance
	 */
	public QoS withClassification(Classification classification) {
		getClassifications().add(classification);
		return this;
	}

	/**
	 * Get application table.
	 *
	 * @return the value
	 */
	public Collection<App> getApps() {
		if (this.apps == null){ this.apps=new ArrayList<>();}
		return apps;
	}

	/**
	 * Set application table.
	 *
	 * @param apps the input value
	 */
	public void  setApps(Collection<App> apps) {
		this.apps = apps;
	}

	/**
	 * Set application table.
	 *
	 * @param app the input value
	 * @return this instance
	 */
	public QoS withApp(App app) {
		getApps().add(app);
		return this;
	}

	/**
	 * Get the flow table.
	 *
	 * @return the value
	 */
	public Collection<Flow> getFlows() {
		if (this.flows == null){ this.flows=new ArrayList<>();}
		return flows;
	}

	/**
	 * Set the flow table.
	 *
	 * @param flows the input value
	 */
	public void  setFlows(Collection<Flow> flows) {
		this.flows = flows;
	}

	/**
	 * Set the flow table.
	 *
	 * @param flow the input value
	 * @return this instance
	 */
	public QoS withFlow(Flow flow) {
		getFlows().add(flow);
		return this;
	}

	/**
	 * Get the policer table.
	 *
	 * @return the value
	 */
	public Collection<Policer> getPolicers() {
		if (this.policers == null){ this.policers=new ArrayList<>();}
		return policers;
	}

	/**
	 * Set the policer table.
	 *
	 * @param policers the input value
	 */
	public void  setPolicers(Collection<Policer> policers) {
		this.policers = policers;
	}

	/**
	 * Set the policer table.
	 *
	 * @param policer the input value
	 * @return this instance
	 */
	public QoS withPolicer(Policer policer) {
		getPolicers().add(policer);
		return this;
	}

	/**
	 * Get the queue table. Each entry is associated with a set of traffic classes, which are specified via the {{param|TrafficClasses}} parameter, and is configured with weight, precedence, drop algorithm, scheduler algorithm etc as appropriate for the traffic classes. An entry can be associated either with all egress interfaces (in which case an actual queue will be instantiated on each egress interface on which traffic of that traffic class can be generated) or else with a single specified egress interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Queue> getQueues() {
		if (this.queues == null){ this.queues=new ArrayList<>();}
		return queues;
	}

	/**
	 * Set the queue table. Each entry is associated with a set of traffic classes, which are specified via the {{param|TrafficClasses}} parameter, and is configured with weight, precedence, drop algorithm, scheduler algorithm etc as appropriate for the traffic classes. An entry can be associated either with all egress interfaces (in which case an actual queue will be instantiated on each egress interface on which traffic of that traffic class can be generated) or else with a single specified egress interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param queues the input value
	 */
	public void  setQueues(Collection<Queue> queues) {
		this.queues = queues;
	}

	/**
	 * Set the queue table. Each entry is associated with a set of traffic classes, which are specified via the {{param|TrafficClasses}} parameter, and is configured with weight, precedence, drop algorithm, scheduler algorithm etc as appropriate for the traffic classes. An entry can be associated either with all egress interfaces (in which case an actual queue will be instantiated on each egress interface on which traffic of that traffic class can be generated) or else with a single specified egress interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param queue the input value
	 * @return this instance
	 */
	public QoS withQueue(Queue queue) {
		getQueues().add(queue);
		return this;
	}

	/**
	 * Get the queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<QueueStats> getQueueStatss() {
		if (this.queueStatss == null){ this.queueStatss=new ArrayList<>();}
		return queueStatss;
	}

	/**
	 * Set the queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @param queueStatss the input value
	 */
	public void  setQueueStatss(Collection<QueueStats> queueStatss) {
		this.queueStatss = queueStatss;
	}

	/**
	 * Set the queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @param queueStats the input value
	 * @return this instance
	 */
	public QoS withQueueStats(QueueStats queueStats) {
		getQueueStatss().add(queueStats);
		return this;
	}

	/**
	 * Get the shaper table. Used to shape the queue(s) associated with {{param|Interface}}. In case of a single queue for that interface, determines the egress rate of the queue. In case of multiple queues for that interface (possibly with per queue shaping rates), determines the aggregate egress rate on that interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<Shaper> getShapers() {
		if (this.shapers == null){ this.shapers=new ArrayList<>();}
		return shapers;
	}

	/**
	 * Set the shaper table. Used to shape the queue(s) associated with {{param|Interface}}. In case of a single queue for that interface, determines the egress rate of the queue. In case of multiple queues for that interface (possibly with per queue shaping rates), determines the aggregate egress rate on that interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param shapers the input value
	 */
	public void  setShapers(Collection<Shaper> shapers) {
		this.shapers = shapers;
	}

	/**
	 * Set the shaper table. Used to shape the queue(s) associated with {{param|Interface}}. In case of a single queue for that interface, determines the egress rate of the queue. In case of multiple queues for that interface (possibly with per queue shaping rates), determines the aggregate egress rate on that interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param shaper the input value
	 * @return this instance
	 */
	public QoS withShaper(Shaper shaper) {
		getShapers().add(shaper);
		return this;
	}

	//</editor-fold>

}