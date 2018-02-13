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
package org.broadbandforum.tr098.internetgatewaydevice.queuemanagement;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Queue table.

This table can contain hardware queues.  The CPE MAY refuse to allow hardware queues to be deleted.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.QueueManagement.Queue.{i}.")
@XmlRootElement(name = "Queue")
@XmlType(name = "InternetGatewayDevice.QueueManagement.Queue")
@XmlAccessorType(XmlAccessType.FIELD)
public class Queue {

	/**
	 * Unique key for each queue entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "QueueKey")
	public Long queueKey;
	/**
	 * Enables or disables this queue.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "QueueEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean queueEnable = false;
	/**
	 * The status of this queue.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "QueueStatus")
	public String queueStatus = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Identifies the set of traffic classes associated with this queue.

If this list is empty then traffic can be sent to this queue only as a result of a direct reference from a Classification, App or Flow table entry, e.g. via the Classification table's ''ClassQueue'' parameter.

If this list is non-empty then traffic can additionally be sent to this queue if a Classification, App or Flow table entry specifies a traffic class, e.g. via the Classification table's ''TrafficClass'' parameter.

If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TrafficClasses")
	@CWMPParameter(access = "readWrite")
	public Long trafficClasses;
	/**
	 * Egress interfaces for which the specified queue MUST exist.  This parameter MUST be in one of the following forms:

The full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The string ''WAN'', which indicates this entry applies to all WAN interfaces.

The string ''LAN'', which indicates this entry applies to all LAN interfaces.

{{empty}}, which indicates this classification entry is to apply to all interfaces.

Packets classified into this queue that exit through any other interface MUST instead use the default queuing behavior specified in the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}.

For the default queue itself (the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}), the value of the {{param}} parameter MUST be ignored.  That is, the default queue MUST exist on all egress interfaces.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "QueueInterface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String queueInterface;
	/**
	 * Number of bytes in the buffer.

Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress interfaces, this parameter MUST be 0.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "QueueBufferLength")
	public Long queueBufferLength;
	/**
	 * Weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only used for queues of equal precedence.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "QueueWeight")
	@CWMPParameter(access = "readWrite")
	public Long queueWeight = 0L;
	/**
	 * Precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "QueuePrecedence")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long queuePrecedence = 1L;
	/**
	 * Random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value, e.g. three times the minimum threshold. 

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "REDThreshold")
	@CWMPParameter(access = "readWrite")
	@Size(max = 100)
	public Long redThreshold = 0L;
	/**
	 * Random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 10 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "REDPercentage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 100)
	public Long redPercentage = 0L;
	/**
	 * Dropping algorithm used for this queue if congested.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "DropAlgorithm")
	@CWMPParameter(access = "readWrite")
	public String dropAlgorithm = "DT";
	/**
	 * Scheduling Algorithm used by scheduler.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "SchedulerAlgorithm")
	@CWMPParameter(access = "readWrite")
	public String schedulerAlgorithm = "SP";
	/**
	 * Rate to shape this queue's traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the egress will be on a PPP or IP link with a specified ''ShapingRate'', the percentage is calculated relative to this rate.  Otherwise, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ShapingRate")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer shapingRate = -1;
	/**
	 * Burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ShapingBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long shapingBurstSize = 0L;

	public Queue() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique key for each queue entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getQueueKey() {
		return queueKey;
	}

	/**
	 * Set the unique key for each queue entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param queueKey the input value
	 */
	public void  setQueueKey(Long queueKey) {
		this.queueKey = queueKey;
	}

	/**
	 * Set the unique key for each queue entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param queueKey the input value
	 * @return this instance
	 */
	public Queue withQueueKey(Long queueKey) {
		this.queueKey = queueKey;
		return this;
	}

	/**
	 * Get the enables or disables this queue.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isQueueEnable() {
		return queueEnable;
	}

	/**
	 * Set the enables or disables this queue.
	 *
	 * @since 1.1
	 * @param queueEnable the input value
	 */
	public void  setQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
	}

	/**
	 * Set the enables or disables this queue.
	 *
	 * @since 1.1
	 * @param queueEnable the input value
	 * @return this instance
	 */
	public Queue withQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
		return this;
	}

	/**
	 * Get the status of this queue.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getQueueStatus() {
		return queueStatus;
	}

	/**
	 * Set the status of this queue.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param queueStatus the input value
	 */
	public void  setQueueStatus(String queueStatus) {
		this.queueStatus = queueStatus;
	}

	/**
	 * Set the status of this queue.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param queueStatus the input value
	 * @return this instance
	 */
	public Queue withQueueStatus(String queueStatus) {
		this.queueStatus = queueStatus;
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
	public Queue withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the identifies the set of traffic classes associated with this queue.

If this list is empty then traffic can be sent to this queue only as a result of a direct reference from a Classification, App or Flow table entry, e.g. via the Classification table's ''ClassQueue'' parameter.

If this list is non-empty then traffic can additionally be sent to this queue if a Classification, App or Flow table entry specifies a traffic class, e.g. via the Classification table's ''TrafficClass'' parameter.

If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTrafficClasses() {
		return trafficClasses;
	}

	/**
	 * Set the identifies the set of traffic classes associated with this queue.

If this list is empty then traffic can be sent to this queue only as a result of a direct reference from a Classification, App or Flow table entry, e.g. via the Classification table's ''ClassQueue'' parameter.

If this list is non-empty then traffic can additionally be sent to this queue if a Classification, App or Flow table entry specifies a traffic class, e.g. via the Classification table's ''TrafficClass'' parameter.

If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 1.4
	 * @param trafficClasses the input value
	 */
	public void  setTrafficClasses(Long trafficClasses) {
		this.trafficClasses = trafficClasses;
	}

	/**
	 * Set the identifies the set of traffic classes associated with this queue.

If this list is empty then traffic can be sent to this queue only as a result of a direct reference from a Classification, App or Flow table entry, e.g. via the Classification table's ''ClassQueue'' parameter.

If this list is non-empty then traffic can additionally be sent to this queue if a Classification, App or Flow table entry specifies a traffic class, e.g. via the Classification table's ''TrafficClass'' parameter.

If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 1.4
	 * @param trafficClasses the input value
	 * @return this instance
	 */
	public Queue withTrafficClasses(Long trafficClasses) {
		this.trafficClasses = trafficClasses;
		return this;
	}

	/**
	 * Get the egress interfaces for which the specified queue MUST exist.  This parameter MUST be in one of the following forms:

The full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The string ''WAN'', which indicates this entry applies to all WAN interfaces.

The string ''LAN'', which indicates this entry applies to all LAN interfaces.

{{empty}}, which indicates this classification entry is to apply to all interfaces.

Packets classified into this queue that exit through any other interface MUST instead use the default queuing behavior specified in the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}.

For the default queue itself (the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}), the value of the {{param}} parameter MUST be ignored.  That is, the default queue MUST exist on all egress interfaces.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getQueueInterface() {
		return queueInterface;
	}

	/**
	 * Set the egress interfaces for which the specified queue MUST exist.  This parameter MUST be in one of the following forms:

The full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The string ''WAN'', which indicates this entry applies to all WAN interfaces.

The string ''LAN'', which indicates this entry applies to all LAN interfaces.

{{empty}}, which indicates this classification entry is to apply to all interfaces.

Packets classified into this queue that exit through any other interface MUST instead use the default queuing behavior specified in the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}.

For the default queue itself (the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}), the value of the {{param}} parameter MUST be ignored.  That is, the default queue MUST exist on all egress interfaces.
	 *
	 * @since 1.1
	 * @param queueInterface the input value
	 */
	public void  setQueueInterface(String queueInterface) {
		this.queueInterface = queueInterface;
	}

	/**
	 * Set the egress interfaces for which the specified queue MUST exist.  This parameter MUST be in one of the following forms:

The full hierarchical parameter name of the particular ''WANDevice'', ''WANConnectionDevice'', ''WAN**Connection'', ''LANDevice'', ''LAN**InterfaceConfig'', or ''WLANConfiguration'' object.

The string ''WAN'', which indicates this entry applies to all WAN interfaces.

The string ''LAN'', which indicates this entry applies to all LAN interfaces.

{{empty}}, which indicates this classification entry is to apply to all interfaces.

Packets classified into this queue that exit through any other interface MUST instead use the default queuing behavior specified in the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}.

For the default queue itself (the Queue table entry referenced by {{param|InternetGatewayDevice.QueueManagement.DefaultQueue}}), the value of the {{param}} parameter MUST be ignored.  That is, the default queue MUST exist on all egress interfaces.
	 *
	 * @since 1.1
	 * @param queueInterface the input value
	 * @return this instance
	 */
	public Queue withQueueInterface(String queueInterface) {
		this.queueInterface = queueInterface;
		return this;
	}

	/**
	 * Get the number of bytes in the buffer.

Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress interfaces, this parameter MUST be 0.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getQueueBufferLength() {
		return queueBufferLength;
	}

	/**
	 * Set the number of bytes in the buffer.

Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress interfaces, this parameter MUST be 0.
	 *
	 * @since 1.1
	 * @param queueBufferLength the input value
	 */
	public void  setQueueBufferLength(Long queueBufferLength) {
		this.queueBufferLength = queueBufferLength;
	}

	/**
	 * Set the number of bytes in the buffer.

Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress interfaces, this parameter MUST be 0.
	 *
	 * @since 1.1
	 * @param queueBufferLength the input value
	 * @return this instance
	 */
	public Queue withQueueBufferLength(Long queueBufferLength) {
		this.queueBufferLength = queueBufferLength;
		return this;
	}

	/**
	 * Get the weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only used for queues of equal precedence.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getQueueWeight() {
		return queueWeight;
	}

	/**
	 * Set the weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only used for queues of equal precedence.
	 *
	 * @since 1.1
	 * @param queueWeight the input value
	 */
	public void  setQueueWeight(Long queueWeight) {
		this.queueWeight = queueWeight;
	}

	/**
	 * Set the weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only used for queues of equal precedence.
	 *
	 * @since 1.1
	 * @param queueWeight the input value
	 * @return this instance
	 */
	public Queue withQueueWeight(Long queueWeight) {
		this.queueWeight = queueWeight;
		return this;
	}

	/**
	 * Get the precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getQueuePrecedence() {
		return queuePrecedence;
	}

	/**
	 * Set the precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 1.1
	 * @param queuePrecedence the input value
	 */
	public void  setQueuePrecedence(Long queuePrecedence) {
		this.queuePrecedence = queuePrecedence;
	}

	/**
	 * Set the precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 1.1
	 * @param queuePrecedence the input value
	 * @return this instance
	 */
	public Queue withQueuePrecedence(Long queuePrecedence) {
		this.queuePrecedence = queuePrecedence;
		return this;
	}

	/**
	 * Get the random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value, e.g. three times the minimum threshold. 

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getRedThreshold() {
		return redThreshold;
	}

	/**
	 * Set the random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value, e.g. three times the minimum threshold. 

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 * @param redThreshold the input value
	 */
	public void  setRedThreshold(Long redThreshold) {
		this.redThreshold = redThreshold;
	}

	/**
	 * Set the random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value, e.g. three times the minimum threshold. 

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 * @param redThreshold the input value
	 * @return this instance
	 */
	public Queue withRedThreshold(Long redThreshold) {
		this.redThreshold = redThreshold;
		return this;
	}

	/**
	 * Get the random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 10 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getRedPercentage() {
		return redPercentage;
	}

	/**
	 * Set the random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 10 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 * @param redPercentage the input value
	 */
	public void  setRedPercentage(Long redPercentage) {
		this.redPercentage = redPercentage;
	}

	/**
	 * Set the random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible value, e.g. 10 (but the value MUST still read back as zero).

In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g. 0.002.
	 *
	 * @since 1.1
	 * @param redPercentage the input value
	 * @return this instance
	 */
	public Queue withRedPercentage(Long redPercentage) {
		this.redPercentage = redPercentage;
		return this;
	}

	/**
	 * Get the dropping algorithm used for this queue if congested.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getDropAlgorithm() {
		return dropAlgorithm;
	}

	/**
	 * Set the dropping algorithm used for this queue if congested.
	 *
	 * @since 1.1
	 * @param dropAlgorithm the input value
	 */
	public void  setDropAlgorithm(String dropAlgorithm) {
		this.dropAlgorithm = dropAlgorithm;
	}

	/**
	 * Set the dropping algorithm used for this queue if congested.
	 *
	 * @since 1.1
	 * @param dropAlgorithm the input value
	 * @return this instance
	 */
	public Queue withDropAlgorithm(String dropAlgorithm) {
		this.dropAlgorithm = dropAlgorithm;
		return this;
	}

	/**
	 * Get the scheduling Algorithm used by scheduler.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getSchedulerAlgorithm() {
		return schedulerAlgorithm;
	}

	/**
	 * Set the scheduling Algorithm used by scheduler.
	 *
	 * @since 1.1
	 * @param schedulerAlgorithm the input value
	 */
	public void  setSchedulerAlgorithm(String schedulerAlgorithm) {
		this.schedulerAlgorithm = schedulerAlgorithm;
	}

	/**
	 * Set the scheduling Algorithm used by scheduler.
	 *
	 * @since 1.1
	 * @param schedulerAlgorithm the input value
	 * @return this instance
	 */
	public Queue withSchedulerAlgorithm(String schedulerAlgorithm) {
		this.schedulerAlgorithm = schedulerAlgorithm;
		return this;
	}

	/**
	 * Get the rate to shape this queue's traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the egress will be on a PPP or IP link with a specified ''ShapingRate'', the percentage is calculated relative to this rate.  Otherwise, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getShapingRate() {
		return shapingRate;
	}

	/**
	 * Set the rate to shape this queue's traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the egress will be on a PPP or IP link with a specified ''ShapingRate'', the percentage is calculated relative to this rate.  Otherwise, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.1
	 * @param shapingRate the input value
	 */
	public void  setShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
	}

	/**
	 * Set the rate to shape this queue's traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the egress will be on a PPP or IP link with a specified ''ShapingRate'', the percentage is calculated relative to this rate.  Otherwise, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.1
	 * @param shapingRate the input value
	 * @return this instance
	 */
	public Queue withShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
		return this;
	}

	/**
	 * Get the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getShapingBurstSize() {
		return shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 * @param shapingBurstSize the input value
	 */
	public void  setShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.1
	 * @param shapingBurstSize the input value
	 * @return this instance
	 */
	public Queue withShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
		return this;
	}

	//</editor-fold>

}