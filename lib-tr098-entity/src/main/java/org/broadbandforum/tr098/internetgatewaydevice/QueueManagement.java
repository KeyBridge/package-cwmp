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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.queuemanagement.App;
import org.broadbandforum.tr098.internetgatewaydevice.queuemanagement.Classification;
import org.broadbandforum.tr098.internetgatewaydevice.queuemanagement.Flow;
import org.broadbandforum.tr098.internetgatewaydevice.queuemanagement.Policer;
import org.broadbandforum.tr098.internetgatewaydevice.queuemanagement.Queue;
import org.broadbandforum.tr098.internetgatewaydevice.queuemanagement.QueueStats;

	/**
	 * Queue management configuration object.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.QueueManagement.")
public class QueueManagement {

	/**
	 * Enables or disables all queuing operation.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The maximum number of queues supported by the CPE. Calculated as the sum of the number of different queues pointed to by Classification table.  For each entry in the Classification table, the count includes a queue for each egress interface to which the corresponding classified traffic could reach.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxQueues")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxQueues;
	/**
	 * The maximum number of entries available in the Classification table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxClassificationEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxClassificationEntries;
	/**
	 * The maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxAppEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxAppEntries;
	/**
	 * The maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxFlowEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxFlowEntries;
	/**
	 * The maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxPolicerEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxPolicerEntries;
	/**
	 * The maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxQueueEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxQueueEntries;
	/**
	 * Identifier of the forwarding policy associated with traffic not associated with any specified classifier.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DefaultForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long defaultForwardingPolicy;
	/**
	 * Identifier of the traffic class associated with traffic not associated with any specified classifier.

A value of -1 indicates a null traffic class.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DefaultTrafficClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer defaultTrafficClass;
	/**
	 * Instance number of the Policer table entry for traffic not associated with any specified classifier.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DefaultPolicer")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer defaultPolicer;
	/**
	 * Instance number of the {{object|Queue}} table entry for traffic not associated with any specified classifier.

A value of 0xffffffff (-1) indicates a null queue (permitted in data model versions 1.4 and later).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DefaultQueue")
	@CWMPParameter(access = "readWrite")
	public Long defaultQueue;
	/**
	 * DSCP to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DefaultDSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultDSCPMark;
	/**
	 * Ethernet priority code (as defined in 802.1D) to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DefaultEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultEthernetPriorityMark;
	/**
	 * URNs, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-098a1|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AvailableAppList")
	@Size(max = 1024)
	@XmlList
	public Collection<String> availableAppList;
	/**
	 * Classification table.
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
	 * Queue table.

This table can contain hardware queues.  The CPE MAY refuse to allow hardware queues to be deleted.
	 */
	@XmlElementWrapper(name = "Queues")
	@XmlElement(name = "Queue")
	@CWMPParameter(access = "readWrite")
	public Collection<Queue> queues;
	/**
	 * Queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.
	 */
	@XmlElementWrapper(name = "QueueStatss")
	@XmlElement(name = "QueueStats")
	@CWMPParameter(access = "readWrite")
	public Collection<QueueStats> queueStatss;

	public QueueManagement() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables all queuing operation.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables all queuing operation.
	 *
	 * @since 1.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables all queuing operation.
	 *
	 * @since 1.1
	 * @param enable the input value
	 * @return this instance
	 */
	public QueueManagement withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the maximum number of queues supported by the CPE. Calculated as the sum of the number of different queues pointed to by Classification table.  For each entry in the Classification table, the count includes a queue for each egress interface to which the corresponding classified traffic could reach.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxQueues() {
		return maxQueues;
	}

	/**
	 * Set the maximum number of queues supported by the CPE. Calculated as the sum of the number of different queues pointed to by Classification table.  For each entry in the Classification table, the count includes a queue for each egress interface to which the corresponding classified traffic could reach.
	 *
	 * @since 1.1
	 * @param maxQueues the input value
	 */
	public void  setMaxQueues(Long maxQueues) {
		this.maxQueues = maxQueues;
	}

	/**
	 * Set the maximum number of queues supported by the CPE. Calculated as the sum of the number of different queues pointed to by Classification table.  For each entry in the Classification table, the count includes a queue for each egress interface to which the corresponding classified traffic could reach.
	 *
	 * @since 1.1
	 * @param maxQueues the input value
	 * @return this instance
	 */
	public QueueManagement withMaxQueues(Long maxQueues) {
		this.maxQueues = maxQueues;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the Classification table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxClassificationEntries() {
		return maxClassificationEntries;
	}

	/**
	 * Set the maximum number of entries available in the Classification table.
	 *
	 * @since 1.1
	 * @param maxClassificationEntries the input value
	 */
	public void  setMaxClassificationEntries(Long maxClassificationEntries) {
		this.maxClassificationEntries = maxClassificationEntries;
	}

	/**
	 * Set the maximum number of entries available in the Classification table.
	 *
	 * @since 1.1
	 * @param maxClassificationEntries the input value
	 * @return this instance
	 */
	public QueueManagement withMaxClassificationEntries(Long maxClassificationEntries) {
		this.maxClassificationEntries = maxClassificationEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxAppEntries() {
		return maxAppEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 1.1
	 * @param maxAppEntries the input value
	 */
	public void  setMaxAppEntries(Long maxAppEntries) {
		this.maxAppEntries = maxAppEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|App}} table.
	 *
	 * @since 1.1
	 * @param maxAppEntries the input value
	 * @return this instance
	 */
	public QueueManagement withMaxAppEntries(Long maxAppEntries) {
		this.maxAppEntries = maxAppEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxFlowEntries() {
		return maxFlowEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 1.1
	 * @param maxFlowEntries the input value
	 */
	public void  setMaxFlowEntries(Long maxFlowEntries) {
		this.maxFlowEntries = maxFlowEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Flow}} table.
	 *
	 * @since 1.1
	 * @param maxFlowEntries the input value
	 * @return this instance
	 */
	public QueueManagement withMaxFlowEntries(Long maxFlowEntries) {
		this.maxFlowEntries = maxFlowEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxPolicerEntries() {
		return maxPolicerEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 1.1
	 * @param maxPolicerEntries the input value
	 */
	public void  setMaxPolicerEntries(Long maxPolicerEntries) {
		this.maxPolicerEntries = maxPolicerEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Policer}} table.
	 *
	 * @since 1.1
	 * @param maxPolicerEntries the input value
	 * @return this instance
	 */
	public QueueManagement withMaxPolicerEntries(Long maxPolicerEntries) {
		this.maxPolicerEntries = maxPolicerEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxQueueEntries() {
		return maxQueueEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 1.1
	 * @param maxQueueEntries the input value
	 */
	public void  setMaxQueueEntries(Long maxQueueEntries) {
		this.maxQueueEntries = maxQueueEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Queue}} table.
	 *
	 * @since 1.1
	 * @param maxQueueEntries the input value
	 * @return this instance
	 */
	public QueueManagement withMaxQueueEntries(Long maxQueueEntries) {
		this.maxQueueEntries = maxQueueEntries;
		return this;
	}

	/**
	 * Get the identifier of the forwarding policy associated with traffic not associated with any specified classifier.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getDefaultForwardingPolicy() {
		return defaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic not associated with any specified classifier.
	 *
	 * @since 1.1
	 * @param defaultForwardingPolicy the input value
	 */
	public void  setDefaultForwardingPolicy(Long defaultForwardingPolicy) {
		this.defaultForwardingPolicy = defaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic not associated with any specified classifier.
	 *
	 * @since 1.1
	 * @param defaultForwardingPolicy the input value
	 * @return this instance
	 */
	public QueueManagement withDefaultForwardingPolicy(Long defaultForwardingPolicy) {
		this.defaultForwardingPolicy = defaultForwardingPolicy;
		return this;
	}

	/**
	 * Get the identifier of the traffic class associated with traffic not associated with any specified classifier.

A value of -1 indicates a null traffic class.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getDefaultTrafficClass() {
		return defaultTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with traffic not associated with any specified classifier.

A value of -1 indicates a null traffic class.
	 *
	 * @since 1.4
	 * @param defaultTrafficClass the input value
	 */
	public void  setDefaultTrafficClass(Integer defaultTrafficClass) {
		this.defaultTrafficClass = defaultTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with traffic not associated with any specified classifier.

A value of -1 indicates a null traffic class.
	 *
	 * @since 1.4
	 * @param defaultTrafficClass the input value
	 * @return this instance
	 */
	public QueueManagement withDefaultTrafficClass(Integer defaultTrafficClass) {
		this.defaultTrafficClass = defaultTrafficClass;
		return this;
	}

	/**
	 * Get the instance number of the Policer table entry for traffic not associated with any specified classifier.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDefaultPolicer() {
		return defaultPolicer;
	}

	/**
	 * Set the instance number of the Policer table entry for traffic not associated with any specified classifier.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param defaultPolicer the input value
	 */
	public void  setDefaultPolicer(Integer defaultPolicer) {
		this.defaultPolicer = defaultPolicer;
	}

	/**
	 * Set the instance number of the Policer table entry for traffic not associated with any specified classifier.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param defaultPolicer the input value
	 * @return this instance
	 */
	public QueueManagement withDefaultPolicer(Integer defaultPolicer) {
		this.defaultPolicer = defaultPolicer;
		return this;
	}

	/**
	 * Get the instance number of the {{object|Queue}} table entry for traffic not associated with any specified classifier.

A value of 0xffffffff (-1) indicates a null queue (permitted in data model versions 1.4 and later).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getDefaultQueue() {
		return defaultQueue;
	}

	/**
	 * Set the instance number of the {{object|Queue}} table entry for traffic not associated with any specified classifier.

A value of 0xffffffff (-1) indicates a null queue (permitted in data model versions 1.4 and later).
	 *
	 * @since 1.1
	 * @param defaultQueue the input value
	 */
	public void  setDefaultQueue(Long defaultQueue) {
		this.defaultQueue = defaultQueue;
	}

	/**
	 * Set the instance number of the {{object|Queue}} table entry for traffic not associated with any specified classifier.

A value of 0xffffffff (-1) indicates a null queue (permitted in data model versions 1.4 and later).
	 *
	 * @since 1.1
	 * @param defaultQueue the input value
	 * @return this instance
	 */
	public QueueManagement withDefaultQueue(Long defaultQueue) {
		this.defaultQueue = defaultQueue;
		return this;
	}

	/**
	 * Get the dscP to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDefaultDSCPMark() {
		return defaultDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param defaultDSCPMark the input value
	 */
	public void  setDefaultDSCPMark(Integer defaultDSCPMark) {
		this.defaultDSCPMark = defaultDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param defaultDSCPMark the input value
	 * @return this instance
	 */
	public QueueManagement withDefaultDSCPMark(Integer defaultDSCPMark) {
		this.defaultDSCPMark = defaultDSCPMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in 802.1D) to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getDefaultEthernetPriorityMark() {
		return defaultEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param defaultEthernetPriorityMark the input value
	 */
	public void  setDefaultEthernetPriorityMark(Integer defaultEthernetPriorityMark) {
		this.defaultEthernetPriorityMark = defaultEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic not associated with any specified classifier.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param defaultEthernetPriorityMark the input value
	 * @return this instance
	 */
	public QueueManagement withDefaultEthernetPriorityMark(Integer defaultEthernetPriorityMark) {
		this.defaultEthernetPriorityMark = defaultEthernetPriorityMark;
		return this;
	}

	/**
	 * Get the urns, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-098a1|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getAvailableAppList() {
		if (this.availableAppList == null){ this.availableAppList=new ArrayList<>();}
		return availableAppList;
	}

	/**
	 * Set the urns, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-098a1|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 1.1
	 * @param availableAppList the input value
	 */
	public void  setAvailableAppList(Collection<String> availableAppList) {
		this.availableAppList = availableAppList;
	}

	/**
	 * Set the urns, each indicating a protocol supported for use as a ProtocolIdentifier in the App table.  This list MAY include any of the URNs defined in {{bibref|TR-098a1|Annex A}} as well as other URNs defined elsewhere.
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public QueueManagement withAvailableAppList(String string) {
		getAvailableAppList().add(string);
		return this;
	}

	/**
	 * Get the classification table.
	 *
	 * @return the value
	 */
	public Collection<Classification> getClassifications() {
		if (this.classifications == null){ this.classifications=new ArrayList<>();}
		return classifications;
	}

	/**
	 * Set the classification table.
	 *
	 * @param classifications the input value
	 */
	public void  setClassifications(Collection<Classification> classifications) {
		this.classifications = classifications;
	}

	/**
	 * Set the classification table.
	 *
	 * @param classification the input value
	 * @return this instance
	 */
	public QueueManagement withClassification(Classification classification) {
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
	public QueueManagement withApp(App app) {
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
	public QueueManagement withFlow(Flow flow) {
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
	public QueueManagement withPolicer(Policer policer) {
		getPolicers().add(policer);
		return this;
	}

	/**
	 * Get the queue table.

This table can contain hardware queues.  The CPE MAY refuse to allow hardware queues to be deleted.
	 *
	 * @return the value
	 */
	public Collection<Queue> getQueues() {
		if (this.queues == null){ this.queues=new ArrayList<>();}
		return queues;
	}

	/**
	 * Set the queue table.

This table can contain hardware queues.  The CPE MAY refuse to allow hardware queues to be deleted.
	 *
	 * @param queues the input value
	 */
	public void  setQueues(Collection<Queue> queues) {
		this.queues = queues;
	}

	/**
	 * Set the queue table.

This table can contain hardware queues.  The CPE MAY refuse to allow hardware queues to be deleted.
	 *
	 * @param queue the input value
	 * @return this instance
	 */
	public QueueManagement withQueue(Queue queue) {
		getQueues().add(queue);
		return this;
	}

	/**
	 * Get the queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.
	 *
	 * @return the value
	 */
	public Collection<QueueStats> getQueueStatss() {
		if (this.queueStatss == null){ this.queueStatss=new ArrayList<>();}
		return queueStatss;
	}

	/**
	 * Set the queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.
	 *
	 * @param queueStatss the input value
	 */
	public void  setQueueStatss(Collection<QueueStats> queueStatss) {
		this.queueStatss = queueStatss;
	}

	/**
	 * Set the queue statistics table. This table is managed by the ACS, which will create entries only for those {Queue, Interface} combinations for which statistics are to be collected.
	 *
	 * @param queueStats the input value
	 * @return this instance
	 */
	public QueueManagement withQueueStats(QueueStats queueStats) {
		getQueueStatss().add(queueStats);
		return this;
	}

	//</editor-fold>

}