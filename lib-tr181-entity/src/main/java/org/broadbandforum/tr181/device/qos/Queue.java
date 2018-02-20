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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Queue table. Each entry is associated with a set of traffic classes, which are specified via the {{param|TrafficClasses}} parameter, and is configured with weight, precedence, drop algorithm, scheduler algorithm etc as appropriate for the traffic classes. An entry can be associated either with all egress interfaces (in which case an actual queue will be instantiated on each egress interface on which traffic of that traffic class can be generated) or else with a single specified egress interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference and {{param|AllInterfaces}} is {{false}}, then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.QoS.Queue.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.QoS.Queue")
@XmlType(name = "Device.QoS.Queue")
@XmlAccessorType(XmlAccessType.FIELD)
public class Queue {

	/**
	 * Enables or disables this queue.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this queue.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{list}} Each list item identifies the set of traffic classes associated with this queue.

          Traffic is sent to this queue if a {{object|#.Classification}}, {{object|#.App}} or {{object|#.Flow}} table entry specifies a traffic class, e.g. via the {{param|#.Classification.{i}.TrafficClass}} parameter.

          If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TrafficClasses")
	@CWMPParameter(access = "readWrite")
	public Long trafficClasses;
	/**
	 * {{reference}} Specifies the egress interface for which the specified queue MUST exist.

          This MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Queues'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Indicates that the specified queue MUST exist for all egress interfaces (i.e. this queue entry is to apply to all egress interfaces). If {{true}}, the value of {{param|Interface}} is ignored since all egress interfaces are indicated.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllInterfaces")
	@CWMPParameter(access = "readWrite")
	public Boolean allInterfaces;
	/**
	 * Indicates whether ''all'' the queues corresponding to this table entry are hardware assisted. If any of the queues corresponding to this table entry are not hardware assisted, the parameter value MUST be {{false}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HardwareAssisted")
	public Boolean hardwareAssisted;
	/**
	 * Number of bytes in the buffer.

          Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress  interfaces, this parameter MUST be 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BufferLength")
	public Long bufferLength;
	/**
	 * Weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only  used for queues of equal precedence.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Weight")
	@CWMPParameter(access = "readWrite")
	public Long weight = 0L;
	/**
	 * Precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Precedence")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long precedence = 1L;
	/**
	 * Random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE  MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value,  e.g. three times the minimum threshold. 

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "REDThreshold")
	@CWMPParameter(access = "readWrite")
	@Size(max = 100)
	public Long redThreshold = 0L;
	/**
	 * Random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible  value, e.g. 10 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "REDPercentage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 100)
	public Long redPercentage = 0L;
	/**
	 * Dropping algorithm used for this queue if congested.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DropAlgorithm")
	@CWMPParameter(access = "readWrite")
	public String dropAlgorithm;
	/**
	 * Scheduling Algorithm used by scheduler.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SchedulerAlgorithm")
	@CWMPParameter(access = "readWrite")
	public String schedulerAlgorithm;
	/**
	 * Rate to shape this queue's traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

          If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

          If > 100, in bits per second.

          A value of -1 indicates no shaping.

          For example, for packets destined for a WAN DSL interface, if the egress will be on a PPP or IP link with a specified ''ShapingRate'', the percentage is calculated relative to this rate.  Otherwise, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ShapingRate")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer shapingRate;
	/**
	 * Burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ShapingBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long shapingBurstSize;

	public Queue() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this queue.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this queue.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this queue.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Queue withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this queue.  {{enum}}

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
	 * Set the status of this queue.  {{enum}}

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
	 * Set the status of this queue.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Queue withStatus(String status) {
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
	public Queue withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{list}} Each list item identifies the set of traffic classes associated with this queue.

          Traffic is sent to this queue if a {{object|#.Classification}}, {{object|#.App}} or {{object|#.Flow}} table entry specifies a traffic class, e.g. via the {{param|#.Classification.{i}.TrafficClass}} parameter.

          If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrafficClasses() {
		return trafficClasses;
	}

	/**
	 * Set the {{list}} Each list item identifies the set of traffic classes associated with this queue.

          Traffic is sent to this queue if a {{object|#.Classification}}, {{object|#.App}} or {{object|#.Flow}} table entry specifies a traffic class, e.g. via the {{param|#.Classification.{i}.TrafficClass}} parameter.

          If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 2.0
	 * @param trafficClasses the input value
	 */
	public void  setTrafficClasses(Long trafficClasses) {
		this.trafficClasses = trafficClasses;
	}

	/**
	 * Set the {{list}} Each list item identifies the set of traffic classes associated with this queue.

          Traffic is sent to this queue if a {{object|#.Classification}}, {{object|#.App}} or {{object|#.Flow}} table entry specifies a traffic class, e.g. via the {{param|#.Classification.{i}.TrafficClass}} parameter.

          If more than one queue on a given egress interface is associated with a given traffic class, the implementation will choose which queue to send traffic of this class to.
	 *
	 * @since 2.0
	 * @param trafficClasses the input value
	 * @return this instance
	 */
	public Queue withTrafficClasses(Long trafficClasses) {
		this.trafficClasses = trafficClasses;
		return this;
	}

	/**
	 * Get the {{reference}} Specifies the egress interface for which the specified queue MUST exist.

          This MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Queues'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} Specifies the egress interface for which the specified queue MUST exist.

          This MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Queues'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} Specifies the egress interface for which the specified queue MUST exist.

          This MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Queues'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Queue with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the indicates that the specified queue MUST exist for all egress interfaces (i.e. this queue entry is to apply to all egress interfaces). If {{true}}, the value of {{param|Interface}} is ignored since all egress interfaces are indicated.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAllInterfaces() {
		return allInterfaces;
	}

	/**
	 * Set the indicates that the specified queue MUST exist for all egress interfaces (i.e. this queue entry is to apply to all egress interfaces). If {{true}}, the value of {{param|Interface}} is ignored since all egress interfaces are indicated.
	 *
	 * @since 2.0
	 * @param allInterfaces the input value
	 */
	public void  setAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
	}

	/**
	 * Set the indicates that the specified queue MUST exist for all egress interfaces (i.e. this queue entry is to apply to all egress interfaces). If {{true}}, the value of {{param|Interface}} is ignored since all egress interfaces are indicated.
	 *
	 * @since 2.0
	 * @param allInterfaces the input value
	 * @return this instance
	 */
	public Queue withAllInterfaces(Boolean allInterfaces) {
		this.allInterfaces = allInterfaces;
		return this;
	}

	/**
	 * Get the indicates whether ''all'' the queues corresponding to this table entry are hardware assisted. If any of the queues corresponding to this table entry are not hardware assisted, the parameter value MUST be {{false}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHardwareAssisted() {
		return hardwareAssisted;
	}

	/**
	 * Set the indicates whether ''all'' the queues corresponding to this table entry are hardware assisted. If any of the queues corresponding to this table entry are not hardware assisted, the parameter value MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param hardwareAssisted the input value
	 */
	public void  setHardwareAssisted(Boolean hardwareAssisted) {
		this.hardwareAssisted = hardwareAssisted;
	}

	/**
	 * Set the indicates whether ''all'' the queues corresponding to this table entry are hardware assisted. If any of the queues corresponding to this table entry are not hardware assisted, the parameter value MUST be {{false}}.
	 *
	 * @since 2.0
	 * @param hardwareAssisted the input value
	 * @return this instance
	 */
	public Queue withHardwareAssisted(Boolean hardwareAssisted) {
		this.hardwareAssisted = hardwareAssisted;
		return this;
	}

	/**
	 * Get the number of bytes in the buffer.

          Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress  interfaces, this parameter MUST be 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBufferLength() {
		return bufferLength;
	}

	/**
	 * Set the number of bytes in the buffer.

          Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress  interfaces, this parameter MUST be 0.
	 *
	 * @since 2.0
	 * @param bufferLength the input value
	 */
	public void  setBufferLength(Long bufferLength) {
		this.bufferLength = bufferLength;
	}

	/**
	 * Set the number of bytes in the buffer.

          Queue buffer size for all egress interfaces for which this queue exists.  If the buffer size is not the same for all such egress  interfaces, this parameter MUST be 0.
	 *
	 * @since 2.0
	 * @param bufferLength the input value
	 * @return this instance
	 */
	public Queue withBufferLength(Long bufferLength) {
		this.bufferLength = bufferLength;
		return this;
	}

	/**
	 * Get the weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only  used for queues of equal precedence.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * Set the weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only  used for queues of equal precedence.
	 *
	 * @since 2.0
	 * @param weight the input value
	 */
	public void  setWeight(Long weight) {
		this.weight = weight;
	}

	/**
	 * Set the weight of this queue in case of {{enum|WFQ|SchedulerAlgorithm}} or {{enum|WRR|SchedulerAlgorithm}}, but only  used for queues of equal precedence.
	 *
	 * @since 2.0
	 * @param weight the input value
	 * @return this instance
	 */
	public Queue withWeight(Long weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * Get the precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrecedence() {
		return precedence;
	}

	/**
	 * Set the precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 2.0
	 * @param precedence the input value
	 */
	public void  setPrecedence(Long precedence) {
		this.precedence = precedence;
	}

	/**
	 * Set the precedence of this queue relative to others. Lower numbers imply greater precedence.
	 *
	 * @since 2.0
	 * @param precedence the input value
	 * @return this instance
	 */
	public Queue withPrecedence(Long precedence) {
		this.precedence = precedence;
		return this;
	}

	/**
	 * Get the random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE  MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value,  e.g. three times the minimum threshold. 

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRedThreshold() {
		return redThreshold;
	}

	/**
	 * Set the random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE  MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value,  e.g. three times the minimum threshold. 

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
	 * @param redThreshold the input value
	 */
	public void  setRedThreshold(Long redThreshold) {
		this.redThreshold = redThreshold;
	}

	/**
	 * Set the random Early Detection threshold, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the minimum threshold (''min_th'') and is measured as a percentage of the queue size.  If the value is set to zero, the CPE  MUST choose a sensible value, e.g. 5 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the maximum threshold (''max_th'').  The CPE MUST choose a sensible value,  e.g. three times the minimum threshold. 

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
	 * @param redThreshold the input value
	 * @return this instance
	 */
	public Queue withRedThreshold(Long redThreshold) {
		this.redThreshold = redThreshold;
		return this;
	}

	/**
	 * Get the random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible  value, e.g. 10 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRedPercentage() {
		return redPercentage;
	}

	/**
	 * Set the random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible  value, e.g. 10 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
	 * @param redPercentage the input value
	 */
	public void  setRedPercentage(Long redPercentage) {
		this.redPercentage = redPercentage;
	}

	/**
	 * Set the random Early Detection percentage, used only when {{param|DropAlgorithm}} is {{enum|RED|DropAlgorithm}}.

          This is the maximum value of the packet marking probability (''max_p'').  If the value is set to zero, the CPE MUST choose a sensible  value, e.g. 10 (but the value MUST still read back as zero).

          In this version of the data model, there is no way to set the RED weight (''w_q'').  The CPE MUST choose a sensible value, e.g.  0.002.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getDropAlgorithm() {
		return dropAlgorithm;
	}

	/**
	 * Set the dropping algorithm used for this queue if congested.
	 *
	 * @since 2.0
	 * @param dropAlgorithm the input value
	 */
	public void  setDropAlgorithm(String dropAlgorithm) {
		this.dropAlgorithm = dropAlgorithm;
	}

	/**
	 * Set the dropping algorithm used for this queue if congested.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getSchedulerAlgorithm() {
		return schedulerAlgorithm;
	}

	/**
	 * Set the scheduling Algorithm used by scheduler.
	 *
	 * @since 2.0
	 * @param schedulerAlgorithm the input value
	 */
	public void  setSchedulerAlgorithm(String schedulerAlgorithm) {
		this.schedulerAlgorithm = schedulerAlgorithm;
	}

	/**
	 * Set the scheduling Algorithm used by scheduler.
	 *
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
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
	 * @since 2.0
	 * @param shapingRate the input value
	 * @return this instance
	 */
	public Queue withShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
		return this;
	}

	/**
	 * Get the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getShapingBurstSize() {
		return shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 * @param shapingBurstSize the input value
	 */
	public void  setShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 * @param shapingBurstSize the input value
	 * @return this instance
	 */
	public Queue withShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
		return this;
	}

	//</editor-fold>

}