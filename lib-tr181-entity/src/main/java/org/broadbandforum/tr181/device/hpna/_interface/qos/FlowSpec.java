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
package org.broadbandforum.tr181.device.hpna._interface.qos;

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
	 * Flow specification table.

        The {{object|.QoS.Classification}} table is used to classify ingress traffic, where {{param|.QoS.Classification.{i}.TrafficClass}} is one of the classification result outputs. This ''TrafficClass'' value can be used to look up the appropriate {{object}} entry (i.e. the {{object}} entry whose {{param|TrafficClasses}} list contains a matching traffic class).

        For enabled table entries, if {{param|TrafficClasses}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.HPNA.Interface.{i}.QoS.FlowSpec.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.HPNA.Interface.QoS.FlowSpec")
@XmlType(name = "Device.HPNA.Interface.QoS.FlowSpec")
@XmlAccessorType(XmlAccessType.FIELD)
public class FlowSpec {

	/**
	 * Enables or disables the table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this entry.  {{enum}}

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
	 * {{list}} This list identifies the set of traffic classes associated with this flow spec.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TrafficClasses")
	@CWMPParameter(access = "readWrite")
	public Long trafficClasses;
	/**
	 * Flow type. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FlowType")
	@CWMPParameter(access = "readWrite")
	public String flowType;
	/**
	 * Flow queue network priority.

          Priority 0 is the lowest priority.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long priority = 0L;
	/**
	 * Maximum latency of the flow (expressed in milliseconds).

          Value 0 means no latency requirements.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Latency")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 0, max = 999)
	public Long latency = 0L;
	/**
	 * Maximum jitter of the flow (expressed in milliseconds).

          Value 0 means no jitter requirements.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Jitter")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 0, max = 999)
	public Long jitter = 0L;
	/**
	 * Typical packet size.

          Value 0 means undefined packet size.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0)
	public Long packetSize = 0L;
	/**
	 * Minimum required rate in Kbps.

          Value 0 means no MinRate requirements.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinRate")
	@CWMPParameter(access = "readWrite")
	public Long minRate = 0L;
	/**
	 * Average required rate in Kbps.

          Value 0 means no AvgRate requirements.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AvgRate")
	@CWMPParameter(access = "readWrite")
	public Long avgRate = 0L;
	/**
	 * Maximum required rate in Kbps. 

          Value 0 means no MaxRate requirements.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxRate")
	@CWMPParameter(access = "readWrite")
	public Long maxRate = 0L;
	/**
	 * The desired packet error rate (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).

          Value 0 means no PER requirements.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PER")
	@CWMPParameter(access = "readWrite")
	public Long per = 0L;
	/**
	 * Flow inactivity tear down timeout (expressed in milliseconds). 

          Value 0 means unlimited timeout.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long timeout = 0L;

	public FlowSpec() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public FlowSpec withEnable(Boolean enable) {
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
	public FlowSpec withStatus(String status) {
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
	public FlowSpec withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{list}} This list identifies the set of traffic classes associated with this flow spec.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrafficClasses() {
		return trafficClasses;
	}

	/**
	 * Set the {{list}} This list identifies the set of traffic classes associated with this flow spec.
	 *
	 * @since 2.0
	 * @param trafficClasses the input value
	 */
	public void  setTrafficClasses(Long trafficClasses) {
		this.trafficClasses = trafficClasses;
	}

	/**
	 * Set the {{list}} This list identifies the set of traffic classes associated with this flow spec.
	 *
	 * @since 2.0
	 * @param trafficClasses the input value
	 * @return this instance
	 */
	public FlowSpec withTrafficClasses(Long trafficClasses) {
		this.trafficClasses = trafficClasses;
		return this;
	}

	/**
	 * Get the flow type. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFlowType() {
		return flowType;
	}

	/**
	 * Set the flow type. {{enum}}
	 *
	 * @since 2.0
	 * @param flowType the input value
	 */
	public void  setFlowType(String flowType) {
		this.flowType = flowType;
	}

	/**
	 * Set the flow type. {{enum}}
	 *
	 * @since 2.0
	 * @param flowType the input value
	 * @return this instance
	 */
	public FlowSpec withFlowType(String flowType) {
		this.flowType = flowType;
		return this;
	}

	/**
	 * Get the flow queue network priority.

          Priority 0 is the lowest priority.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the flow queue network priority.

          Priority 0 is the lowest priority.
	 *
	 * @since 2.0
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the flow queue network priority.

          Priority 0 is the lowest priority.
	 *
	 * @since 2.0
	 * @param priority the input value
	 * @return this instance
	 */
	public FlowSpec withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the maximum latency of the flow (expressed in milliseconds).

          Value 0 means no latency requirements.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLatency() {
		return latency;
	}

	/**
	 * Set the maximum latency of the flow (expressed in milliseconds).

          Value 0 means no latency requirements.
	 *
	 * @since 2.0
	 * @param latency the input value
	 */
	public void  setLatency(Long latency) {
		this.latency = latency;
	}

	/**
	 * Set the maximum latency of the flow (expressed in milliseconds).

          Value 0 means no latency requirements.
	 *
	 * @since 2.0
	 * @param latency the input value
	 * @return this instance
	 */
	public FlowSpec withLatency(Long latency) {
		this.latency = latency;
		return this;
	}

	/**
	 * Get the maximum jitter of the flow (expressed in milliseconds).

          Value 0 means no jitter requirements.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getJitter() {
		return jitter;
	}

	/**
	 * Set the maximum jitter of the flow (expressed in milliseconds).

          Value 0 means no jitter requirements.
	 *
	 * @since 2.0
	 * @param jitter the input value
	 */
	public void  setJitter(Long jitter) {
		this.jitter = jitter;
	}

	/**
	 * Set the maximum jitter of the flow (expressed in milliseconds).

          Value 0 means no jitter requirements.
	 *
	 * @since 2.0
	 * @param jitter the input value
	 * @return this instance
	 */
	public FlowSpec withJitter(Long jitter) {
		this.jitter = jitter;
		return this;
	}

	/**
	 * Get the typical packet size.

          Value 0 means undefined packet size.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketSize() {
		return packetSize;
	}

	/**
	 * Set the typical packet size.

          Value 0 means undefined packet size.
	 *
	 * @since 2.0
	 * @param packetSize the input value
	 */
	public void  setPacketSize(Long packetSize) {
		this.packetSize = packetSize;
	}

	/**
	 * Set the typical packet size.

          Value 0 means undefined packet size.
	 *
	 * @since 2.0
	 * @param packetSize the input value
	 * @return this instance
	 */
	public FlowSpec withPacketSize(Long packetSize) {
		this.packetSize = packetSize;
		return this;
	}

	/**
	 * Get the minimum required rate in Kbps.

          Value 0 means no MinRate requirements.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMinRate() {
		return minRate;
	}

	/**
	 * Set the minimum required rate in Kbps.

          Value 0 means no MinRate requirements.
	 *
	 * @since 2.0
	 * @param minRate the input value
	 */
	public void  setMinRate(Long minRate) {
		this.minRate = minRate;
	}

	/**
	 * Set the minimum required rate in Kbps.

          Value 0 means no MinRate requirements.
	 *
	 * @since 2.0
	 * @param minRate the input value
	 * @return this instance
	 */
	public FlowSpec withMinRate(Long minRate) {
		this.minRate = minRate;
		return this;
	}

	/**
	 * Get average required rate in Kbps.

          Value 0 means no AvgRate requirements.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAvgRate() {
		return avgRate;
	}

	/**
	 * Set average required rate in Kbps.

          Value 0 means no AvgRate requirements.
	 *
	 * @since 2.0
	 * @param avgRate the input value
	 */
	public void  setAvgRate(Long avgRate) {
		this.avgRate = avgRate;
	}

	/**
	 * Set average required rate in Kbps.

          Value 0 means no AvgRate requirements.
	 *
	 * @since 2.0
	 * @param avgRate the input value
	 * @return this instance
	 */
	public FlowSpec withAvgRate(Long avgRate) {
		this.avgRate = avgRate;
		return this;
	}

	/**
	 * Get the maximum required rate in Kbps. 

          Value 0 means no MaxRate requirements.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxRate() {
		return maxRate;
	}

	/**
	 * Set the maximum required rate in Kbps. 

          Value 0 means no MaxRate requirements.
	 *
	 * @since 2.0
	 * @param maxRate the input value
	 */
	public void  setMaxRate(Long maxRate) {
		this.maxRate = maxRate;
	}

	/**
	 * Set the maximum required rate in Kbps. 

          Value 0 means no MaxRate requirements.
	 *
	 * @since 2.0
	 * @param maxRate the input value
	 * @return this instance
	 */
	public FlowSpec withMaxRate(Long maxRate) {
		this.maxRate = maxRate;
		return this;
	}

	/**
	 * Get the desired packet error rate (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).

          Value 0 means no PER requirements.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPer() {
		return per;
	}

	/**
	 * Set the desired packet error rate (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).

          Value 0 means no PER requirements.
	 *
	 * @since 2.0
	 * @param per the input value
	 */
	public void  setPer(Long per) {
		this.per = per;
	}

	/**
	 * Set the desired packet error rate (expressed in 1E-8, e.g. PER of 1.27E-6 will be presented as 127).

          Value 0 means no PER requirements.
	 *
	 * @since 2.0
	 * @param per the input value
	 * @return this instance
	 */
	public FlowSpec withPer(Long per) {
		this.per = per;
		return this;
	}

	/**
	 * Get the flow inactivity tear down timeout (expressed in milliseconds). 

          Value 0 means unlimited timeout.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the flow inactivity tear down timeout (expressed in milliseconds). 

          Value 0 means unlimited timeout.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the flow inactivity tear down timeout (expressed in milliseconds). 

          Value 0 means unlimited timeout.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 * @return this instance
	 */
	public FlowSpec withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	//</editor-fold>

}