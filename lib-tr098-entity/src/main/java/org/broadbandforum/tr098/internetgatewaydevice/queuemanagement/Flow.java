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
	 * Flow table.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.QueueManagement.Flow.{i}.")
@XmlRootElement(name = "Flow")
@XmlType(name = "InternetGatewayDevice.QueueManagement.Flow")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flow {

	/**
	 * Unique key for each Flow table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowKey")
	public Long flowKey;
	/**
	 * Enables or disables this Flow table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean flowEnable = false;
	/**
	 * The status of this Flow table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowStatus")
	public String flowStatus = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * URN identifying the type of flow to be associated with the specified queue and policer.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowType")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String flowType;
	/**
	 * List of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowTypeParameters")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String flowTypeParameters;
	/**
	 * Human-readable name associated with this entry in the Flow table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String flowName;
	/**
	 * Instance number of the App table entry associated with this flow.  A value of -1 indicates the flow table is not associated with any App table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppIdentifier")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer appIdentifier = -1;
	/**
	 * Identifier of the forwarding policy associated with this flow.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long flowForwardingPolicy = 0L;
	/**
	 * Identifier of the traffic class associated with this flow.

A value of -1 indicates a null traffic class.

{{param}} and {{param|FlowQueue}} MUST NOT both be specified.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "FlowTrafficClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer flowTrafficClass = -1;
	/**
	 * Instance number of the Policer table entry for traffic that falls in this flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowPolicer")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer flowPolicer = -1;
	/**
	 * Instance number of the Queue table entry for traffic that falls in this flow.

A value of -1 indicates a null queue.

{{param|FlowTrafficClass}} and {{param}} MUST NOT both be specified.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowQueue")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer flowQueue = -1;
	/**
	 * DSCP to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowDSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer flowDSCPMark = -1;
	/**
	 * Ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "FlowEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer flowEthernetPriorityMark = -1;

	public Flow() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique key for each Flow table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getFlowKey() {
		return flowKey;
	}

	/**
	 * Set the unique key for each Flow table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param flowKey the input value
	 */
	public void  setFlowKey(Long flowKey) {
		this.flowKey = flowKey;
	}

	/**
	 * Set the unique key for each Flow table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param flowKey the input value
	 * @return this instance
	 */
	public Flow withFlowKey(Long flowKey) {
		this.flowKey = flowKey;
		return this;
	}

	/**
	 * Get the enables or disables this Flow table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isFlowEnable() {
		return flowEnable;
	}

	/**
	 * Set the enables or disables this Flow table entry.
	 *
	 * @since 1.1
	 * @param flowEnable the input value
	 */
	public void  setFlowEnable(Boolean flowEnable) {
		this.flowEnable = flowEnable;
	}

	/**
	 * Set the enables or disables this Flow table entry.
	 *
	 * @since 1.1
	 * @param flowEnable the input value
	 * @return this instance
	 */
	public Flow withFlowEnable(Boolean flowEnable) {
		this.flowEnable = flowEnable;
		return this;
	}

	/**
	 * Get the status of this Flow table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getFlowStatus() {
		return flowStatus;
	}

	/**
	 * Set the status of this Flow table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param flowStatus the input value
	 */
	public void  setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	/**
	 * Set the status of this Flow table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param flowStatus the input value
	 * @return this instance
	 */
	public Flow withFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
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
	public Flow withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the urn identifying the type of flow to be associated with the specified queue and policer.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getFlowType() {
		return flowType;
	}

	/**
	 * Set the urn identifying the type of flow to be associated with the specified queue and policer.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param flowType the input value
	 */
	public void  setFlowType(String flowType) {
		this.flowType = flowType;
	}

	/**
	 * Set the urn identifying the type of flow to be associated with the specified queue and policer.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param flowType the input value
	 * @return this instance
	 */
	public Flow withFlowType(String flowType) {
		this.flowType = flowType;
		return this;
	}

	/**
	 * Get the list of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getFlowTypeParameters() {
		return flowTypeParameters;
	}

	/**
	 * Set the list of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 1.1
	 * @param flowTypeParameters the input value
	 */
	public void  setFlowTypeParameters(String flowTypeParameters) {
		this.flowTypeParameters = flowTypeParameters;
	}

	/**
	 * Set the list of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 1.1
	 * @param flowTypeParameters the input value
	 * @return this instance
	 */
	public Flow withFlowTypeParameters(String flowTypeParameters) {
		this.flowTypeParameters = flowTypeParameters;
		return this;
	}

	/**
	 * Get the human-readable name associated with this entry in the Flow table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getFlowName() {
		return flowName;
	}

	/**
	 * Set the human-readable name associated with this entry in the Flow table.
	 *
	 * @since 1.1
	 * @param flowName the input value
	 */
	public void  setFlowName(String flowName) {
		this.flowName = flowName;
	}

	/**
	 * Set the human-readable name associated with this entry in the Flow table.
	 *
	 * @since 1.1
	 * @param flowName the input value
	 * @return this instance
	 */
	public Flow withFlowName(String flowName) {
		this.flowName = flowName;
		return this;
	}

	/**
	 * Get the instance number of the App table entry associated with this flow.  A value of -1 indicates the flow table is not associated with any App table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getAppIdentifier() {
		return appIdentifier;
	}

	/**
	 * Set the instance number of the App table entry associated with this flow.  A value of -1 indicates the flow table is not associated with any App table entry.
	 *
	 * @since 1.1
	 * @param appIdentifier the input value
	 */
	public void  setAppIdentifier(Integer appIdentifier) {
		this.appIdentifier = appIdentifier;
	}

	/**
	 * Set the instance number of the App table entry associated with this flow.  A value of -1 indicates the flow table is not associated with any App table entry.
	 *
	 * @since 1.1
	 * @param appIdentifier the input value
	 * @return this instance
	 */
	public Flow withAppIdentifier(Integer appIdentifier) {
		this.appIdentifier = appIdentifier;
		return this;
	}

	/**
	 * Get the identifier of the forwarding policy associated with this flow.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getFlowForwardingPolicy() {
		return flowForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with this flow.
	 *
	 * @since 1.1
	 * @param flowForwardingPolicy the input value
	 */
	public void  setFlowForwardingPolicy(Long flowForwardingPolicy) {
		this.flowForwardingPolicy = flowForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with this flow.
	 *
	 * @since 1.1
	 * @param flowForwardingPolicy the input value
	 * @return this instance
	 */
	public Flow withFlowForwardingPolicy(Long flowForwardingPolicy) {
		this.flowForwardingPolicy = flowForwardingPolicy;
		return this;
	}

	/**
	 * Get the identifier of the traffic class associated with this flow.

A value of -1 indicates a null traffic class.

{{param}} and {{param|FlowQueue}} MUST NOT both be specified.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getFlowTrafficClass() {
		return flowTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with this flow.

A value of -1 indicates a null traffic class.

{{param}} and {{param|FlowQueue}} MUST NOT both be specified.
	 *
	 * @since 1.4
	 * @param flowTrafficClass the input value
	 */
	public void  setFlowTrafficClass(Integer flowTrafficClass) {
		this.flowTrafficClass = flowTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with this flow.

A value of -1 indicates a null traffic class.

{{param}} and {{param|FlowQueue}} MUST NOT both be specified.
	 *
	 * @since 1.4
	 * @param flowTrafficClass the input value
	 * @return this instance
	 */
	public Flow withFlowTrafficClass(Integer flowTrafficClass) {
		this.flowTrafficClass = flowTrafficClass;
		return this;
	}

	/**
	 * Get the instance number of the Policer table entry for traffic that falls in this flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getFlowPolicer() {
		return flowPolicer;
	}

	/**
	 * Set the instance number of the Policer table entry for traffic that falls in this flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param flowPolicer the input value
	 */
	public void  setFlowPolicer(Integer flowPolicer) {
		this.flowPolicer = flowPolicer;
	}

	/**
	 * Set the instance number of the Policer table entry for traffic that falls in this flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param flowPolicer the input value
	 * @return this instance
	 */
	public Flow withFlowPolicer(Integer flowPolicer) {
		this.flowPolicer = flowPolicer;
		return this;
	}

	/**
	 * Get the instance number of the Queue table entry for traffic that falls in this flow.

A value of -1 indicates a null queue.

{{param|FlowTrafficClass}} and {{param}} MUST NOT both be specified.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getFlowQueue() {
		return flowQueue;
	}

	/**
	 * Set the instance number of the Queue table entry for traffic that falls in this flow.

A value of -1 indicates a null queue.

{{param|FlowTrafficClass}} and {{param}} MUST NOT both be specified.
	 *
	 * @since 1.1
	 * @param flowQueue the input value
	 */
	public void  setFlowQueue(Integer flowQueue) {
		this.flowQueue = flowQueue;
	}

	/**
	 * Set the instance number of the Queue table entry for traffic that falls in this flow.

A value of -1 indicates a null queue.

{{param|FlowTrafficClass}} and {{param}} MUST NOT both be specified.
	 *
	 * @since 1.1
	 * @param flowQueue the input value
	 * @return this instance
	 */
	public Flow withFlowQueue(Integer flowQueue) {
		this.flowQueue = flowQueue;
		return this;
	}

	/**
	 * Get the dscP to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getFlowDSCPMark() {
		return flowDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param flowDSCPMark the input value
	 */
	public void  setFlowDSCPMark(Integer flowDSCPMark) {
		this.flowDSCPMark = flowDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param flowDSCPMark the input value
	 * @return this instance
	 */
	public Flow withFlowDSCPMark(Integer flowDSCPMark) {
		this.flowDSCPMark = flowDSCPMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getFlowEthernetPriorityMark() {
		return flowEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param flowEthernetPriorityMark the input value
	 */
	public void  setFlowEthernetPriorityMark(Integer flowEthernetPriorityMark) {
		this.flowEthernetPriorityMark = flowEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic with that falls into this flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param flowEthernetPriorityMark the input value
	 * @return this instance
	 */
	public Flow withFlowEthernetPriorityMark(Integer flowEthernetPriorityMark) {
		this.flowEthernetPriorityMark = flowEthernetPriorityMark;
		return this;
	}

	//</editor-fold>

}