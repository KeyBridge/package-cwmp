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
package org.broadbandforum.tr181.device.ghn._interface;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This object specifies management parameters pertaining to the domain functionality (Domain Master function; see {{bibref|G.9961|Clause 8.6}}). The object exists only on G.hn interfaces that are currently the Domain Master, i.e. for which parameter {{param|#.IsDM}} is {{true}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Ghn.Interface.{i}.DMInfo.")
public class DMInfo {

	/**
	 * This is the domain name to which the interface is currently registered. {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DomainName")
	@CWMPParameter(access = "readWrite")
	public byte[] domainName;
	/**
	 * The Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DomainNameIdentifier")
	public byte[] domainNameIdentifier;
	/**
	 * The Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DomainId")
	public Long domainId;
	/**
	 * The MAC cycle duration, as specified in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 0.5 msec. In the case of power line, writing to this parameter has no effect and it reads back as 0, which is a special value indicating that the MAC cycle is synchronized with 2 AC cycles as defined in {{bibref|G.9961|Clause 8.6.3.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MACCycleDuration")
	@CWMPParameter(access = "readWrite", units = "0.5 msec")
	@Size(min = 10, max = 200)
	public Long macCycleDuration;
	/**
	 * The DEVICE_ID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SCDeviceId")
	@CWMPParameter(access = "readWrite")
	public Long scdeviceId;
	/**
	 * The REGID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SCMACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress scmACAddress;
	/**
	 * The time interval for periodic re-registration, as specified in {{bibref|G.9961|Clause 8.8.5.8}}. It is represented as multiples of 2 seconds.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ReregistrationTimePeriod")
	@CWMPParameter(access = "readWrite", units = "2 seconds")
	@Size(min = 5, max = 63)
	public Long reregistrationTimePeriod;
	/**
	 * The time interval that a node sends out the periodic topology update using TM_NodeTopologyChange.ind message, as specified in {{bibref|G.9961|Clause 8.8.5.8.1}}. It is represented as multiples of 0.1 sec. The special value 0 represents an infinite interval (i.e., no periodic topology update).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "TopologyPeriodicInterval")
	@CWMPParameter(access = "readWrite", units = "0.1 sec")
	@Size(min = 0, max = 255)
	public Long topologyPeriodicInterval;
	/**
	 * Indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MinSupportedBandplan")
	@CWMPParameter(access = "readWrite")
	public Long minSupportedBandplan;
	/**
	 * Indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "MaxSupportedBandplan")
	@CWMPParameter(access = "readWrite")
	public Long maxSupportedBandplan;

	public DMInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this is the domain name to which the interface is currently registered. {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getDomainName() {
		return domainName;
	}

	/**
	 * Set the this is the domain name to which the interface is currently registered. {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.8
	 * @param domainName the input value
	 */
	public void  setDomainName(byte[] domainName) {
		this.domainName = domainName;
	}

	/**
	 * Set the this is the domain name to which the interface is currently registered. {{empty}} indicates that the interface is currently not registered.
	 *
	 * @since 2.8
	 * @param domainName the input value
	 * @return this instance
	 */
	public DMInfo withDomainName(byte[] domainName) {
		this.domainName = domainName;
		return this;
	}

	/**
	 * Get the Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getDomainNameIdentifier() {
		return domainNameIdentifier;
	}

	/**
	 * Set the Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.8
	 * @param domainNameIdentifier the input value
	 */
	public void  setDomainNameIdentifier(byte[] domainNameIdentifier) {
		this.domainNameIdentifier = domainNameIdentifier;
	}

	/**
	 * Set the Domain Name Identifier, a shortened version of {{param|DomainName}}, denoted as DNI in {{bibref|G.9961|Section 8.6.11.2.1}}.
	 *
	 * @since 2.8
	 * @param domainNameIdentifier the input value
	 * @return this instance
	 */
	public DMInfo withDomainNameIdentifier(byte[] domainNameIdentifier) {
		this.domainNameIdentifier = domainNameIdentifier;
		return this;
	}

	/**
	 * Get the Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getDomainId() {
		return domainId;
	}

	/**
	 * Set the Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.8
	 * @param domainId the input value
	 */
	public void  setDomainId(Long domainId) {
		this.domainId = domainId;
	}

	/**
	 * Set the Domain Identifier of the domain to which the interface is registered, denoted as DOD in {{bibref|G.9961}}.
	 *
	 * @since 2.8
	 * @param domainId the input value
	 * @return this instance
	 */
	public DMInfo withDomainId(Long domainId) {
		this.domainId = domainId;
		return this;
	}

	/**
	 * Get the MAC cycle duration, as specified in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 0.5 msec. In the case of power line, writing to this parameter has no effect and it reads back as 0, which is a special value indicating that the MAC cycle is synchronized with 2 AC cycles as defined in {{bibref|G.9961|Clause 8.6.3.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getMacCycleDuration() {
		return macCycleDuration;
	}

	/**
	 * Set the MAC cycle duration, as specified in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 0.5 msec. In the case of power line, writing to this parameter has no effect and it reads back as 0, which is a special value indicating that the MAC cycle is synchronized with 2 AC cycles as defined in {{bibref|G.9961|Clause 8.6.3.1}}.
	 *
	 * @since 2.8
	 * @param macCycleDuration the input value
	 */
	public void  setMacCycleDuration(Long macCycleDuration) {
		this.macCycleDuration = macCycleDuration;
	}

	/**
	 * Set the MAC cycle duration, as specified in {{bibref|G.9961|Clause 8.4}}. It is represented as multiples of 0.5 msec. In the case of power line, writing to this parameter has no effect and it reads back as 0, which is a special value indicating that the MAC cycle is synchronized with 2 AC cycles as defined in {{bibref|G.9961|Clause 8.6.3.1}}.
	 *
	 * @since 2.8
	 * @param macCycleDuration the input value
	 * @return this instance
	 */
	public DMInfo withMacCycleDuration(Long macCycleDuration) {
		this.macCycleDuration = macCycleDuration;
		return this;
	}

	/**
	 * Get the DEVICE_ID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getScdeviceId() {
		return scdeviceId;
	}

	/**
	 * Set the DEVICE_ID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 * @param scdeviceId the input value
	 */
	public void  setScdeviceId(Long scdeviceId) {
		this.scdeviceId = scdeviceId;
	}

	/**
	 * Set the DEVICE_ID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 * @param scdeviceId the input value
	 * @return this instance
	 */
	public DMInfo withScdeviceId(Long scdeviceId) {
		this.scdeviceId = scdeviceId;
		return this;
	}

	/**
	 * Get the REGID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getScmACAddress() {
		return scmACAddress;
	}

	/**
	 * Set the REGID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 * @param scmACAddress the input value
	 */
	public void  setScmACAddress(MACAddress scmACAddress) {
		this.scmACAddress = scmACAddress;
	}

	/**
	 * Set the REGID of the Security Controller selected by the Domain Master.
	 *
	 * @since 2.8
	 * @param scmACAddress the input value
	 * @return this instance
	 */
	public DMInfo withScmACAddress(MACAddress scmACAddress) {
		this.scmACAddress = scmACAddress;
		return this;
	}

	/**
	 * Get the time interval for periodic re-registration, as specified in {{bibref|G.9961|Clause 8.8.5.8}}. It is represented as multiples of 2 seconds.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getReregistrationTimePeriod() {
		return reregistrationTimePeriod;
	}

	/**
	 * Set the time interval for periodic re-registration, as specified in {{bibref|G.9961|Clause 8.8.5.8}}. It is represented as multiples of 2 seconds.
	 *
	 * @since 2.8
	 * @param reregistrationTimePeriod the input value
	 */
	public void  setReregistrationTimePeriod(Long reregistrationTimePeriod) {
		this.reregistrationTimePeriod = reregistrationTimePeriod;
	}

	/**
	 * Set the time interval for periodic re-registration, as specified in {{bibref|G.9961|Clause 8.8.5.8}}. It is represented as multiples of 2 seconds.
	 *
	 * @since 2.8
	 * @param reregistrationTimePeriod the input value
	 * @return this instance
	 */
	public DMInfo withReregistrationTimePeriod(Long reregistrationTimePeriod) {
		this.reregistrationTimePeriod = reregistrationTimePeriod;
		return this;
	}

	/**
	 * Get the time interval that a node sends out the periodic topology update using TM_NodeTopologyChange.ind message, as specified in {{bibref|G.9961|Clause 8.8.5.8.1}}. It is represented as multiples of 0.1 sec. The special value 0 represents an infinite interval (i.e., no periodic topology update).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getTopologyPeriodicInterval() {
		return topologyPeriodicInterval;
	}

	/**
	 * Set the time interval that a node sends out the periodic topology update using TM_NodeTopologyChange.ind message, as specified in {{bibref|G.9961|Clause 8.8.5.8.1}}. It is represented as multiples of 0.1 sec. The special value 0 represents an infinite interval (i.e., no periodic topology update).
	 *
	 * @since 2.8
	 * @param topologyPeriodicInterval the input value
	 */
	public void  setTopologyPeriodicInterval(Long topologyPeriodicInterval) {
		this.topologyPeriodicInterval = topologyPeriodicInterval;
	}

	/**
	 * Set the time interval that a node sends out the periodic topology update using TM_NodeTopologyChange.ind message, as specified in {{bibref|G.9961|Clause 8.8.5.8.1}}. It is represented as multiples of 0.1 sec. The special value 0 represents an infinite interval (i.e., no periodic topology update).
	 *
	 * @since 2.8
	 * @param topologyPeriodicInterval the input value
	 * @return this instance
	 */
	public DMInfo withTopologyPeriodicInterval(Long topologyPeriodicInterval) {
		this.topologyPeriodicInterval = topologyPeriodicInterval;
		return this;
	}

	/**
	 * Get the indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getMinSupportedBandplan() {
		return minSupportedBandplan;
	}

	/**
	 * Set the indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 * @param minSupportedBandplan the input value
	 */
	public void  setMinSupportedBandplan(Long minSupportedBandplan) {
		this.minSupportedBandplan = minSupportedBandplan;
	}

	/**
	 * Set the indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 * @param minSupportedBandplan the input value
	 * @return this instance
	 */
	public DMInfo withMinSupportedBandplan(Long minSupportedBandplan) {
		this.minSupportedBandplan = minSupportedBandplan;
		return this;
	}

	/**
	 * Get the indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getMaxSupportedBandplan() {
		return maxSupportedBandplan;
	}

	/**
	 * Set the indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 * @param maxSupportedBandplan the input value
	 */
	public void  setMaxSupportedBandplan(Long maxSupportedBandplan) {
		this.maxSupportedBandplan = maxSupportedBandplan;
	}

	/**
	 * Set the indicates the value of the minimal bandplan capability for a node that is allowed to register to the domain.
	 *
	 * @since 2.8
	 * @param maxSupportedBandplan the input value
	 * @return this instance
	 */
	public DMInfo withMaxSupportedBandplan(Long maxSupportedBandplan) {
		this.maxSupportedBandplan = maxSupportedBandplan;
		return this;
	}

	//</editor-fold>

}