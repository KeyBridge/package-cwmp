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
	 * Flow table.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.QoS.Flow.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.QoS.Flow")
@XmlType(name = "Device.QoS.Flow")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flow {

	/**
	 * Enables or disables this Flow table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this Flow table entry.  {{enum}}

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
	 * URN identifying the type of flow to be associated with the specified policer.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String type;
	/**
	 * List of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TypeParameters")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String typeParameters;
	/**
	 * Human-readable name associated with this entry in the Flow table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * {{reference}} Indicates the ''App'' table entry associated with this flow.  {{empty}} indicates the flow table is not associated with any App table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "App")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String app;
	/**
	 * Identifier of the forwarding policy associated with this flow.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long forwardingPolicy = 0L;
	/**
	 * Identifier of the traffic class associated with this flow.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TrafficClass")
	@CWMPParameter(access = "readWrite")
	public Long trafficClass = 0L;
	/**
	 * {{reference}} Indicates the ''Policer'' table entry for traffic that falls in this flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Policer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String policer;
	/**
	 * DSCP to mark traffic with that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer dscPMark;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer ethernetPriorityMark;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags with for traffic that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "InnerEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer innerEthernetPriorityMark;

	public Flow() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Flow table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Flow table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Flow table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Flow withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this Flow table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Flow table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Flow table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Flow withStatus(String status) {
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
	public Flow withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the urn identifying the type of flow to be associated with the specified policer.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the urn identifying the type of flow to be associated with the specified policer.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the urn identifying the type of flow to be associated with the specified policer.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public Flow withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the list of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTypeParameters() {
		return typeParameters;
	}

	/**
	 * Set the list of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 2.0
	 * @param typeParameters the input value
	 */
	public void  setTypeParameters(String typeParameters) {
		this.typeParameters = typeParameters;
	}

	/**
	 * Set the list of name-value pairs representing additional criteria to identify the flow type.  The use and interpretation is specific to the particular FlowType URN.Encoded using the "x-www-form-urlencoded" content type defined in {{bibref|HTML4.01}}.
	 *
	 * @since 2.0
	 * @param typeParameters the input value
	 * @return this instance
	 */
	public Flow withTypeParameters(String typeParameters) {
		this.typeParameters = typeParameters;
		return this;
	}

	/**
	 * Get the human-readable name associated with this entry in the Flow table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this entry in the Flow table.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this entry in the Flow table.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Flow withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the {{reference}} Indicates the ''App'' table entry associated with this flow.  {{empty}} indicates the flow table is not associated with any App table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getApp() {
		return app;
	}

	/**
	 * Set the {{reference}} Indicates the ''App'' table entry associated with this flow.  {{empty}} indicates the flow table is not associated with any App table entry.
	 *
	 * @since 2.0
	 * @param app the input value
	 */
	public void  setApp(String app) {
		this.app = app;
	}

	/**
	 * Set the {{reference}} Indicates the ''App'' table entry associated with this flow.  {{empty}} indicates the flow table is not associated with any App table entry.
	 *
	 * @since 2.0
	 * @param app the input value
	 * @return this instance
	 */
	public Flow withApp(String app) {
		this.app = app;
		return this;
	}

	/**
	 * Get the identifier of the forwarding policy associated with this flow.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getForwardingPolicy() {
		return forwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with this flow.
	 *
	 * @since 2.0
	 * @param forwardingPolicy the input value
	 */
	public void  setForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with this flow.
	 *
	 * @since 2.0
	 * @param forwardingPolicy the input value
	 * @return this instance
	 */
	public Flow withForwardingPolicy(Long forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
		return this;
	}

	/**
	 * Get the identifier of the traffic class associated with this flow.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTrafficClass() {
		return trafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with this flow.
	 *
	 * @since 2.0
	 * @param trafficClass the input value
	 */
	public void  setTrafficClass(Long trafficClass) {
		this.trafficClass = trafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with this flow.
	 *
	 * @since 2.0
	 * @param trafficClass the input value
	 * @return this instance
	 */
	public Flow withTrafficClass(Long trafficClass) {
		this.trafficClass = trafficClass;
		return this;
	}

	/**
	 * Get the {{reference}} Indicates the ''Policer'' table entry for traffic that falls in this flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPolicer() {
		return policer;
	}

	/**
	 * Set the {{reference}} Indicates the ''Policer'' table entry for traffic that falls in this flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @param policer the input value
	 */
	public void  setPolicer(String policer) {
		this.policer = policer;
	}

	/**
	 * Set the {{reference}} Indicates the ''Policer'' table entry for traffic that falls in this flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @param policer the input value
	 * @return this instance
	 */
	public Flow withPolicer(String policer) {
		this.policer = policer;
		return this;
	}

	/**
	 * Get the dscP to mark traffic with that falls into this flow.

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
	 * Set the dscP to mark traffic with that falls into this flow.

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
	 * Set the dscP to mark traffic with that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 * @return this instance
	 */
	public Flow withDscPMark(Integer dscPMark) {
		this.dscPMark = dscPMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic with that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 * @return this instance
	 */
	public Flow withEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags with for traffic that falls into this flow.

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
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags with for traffic that falls into this flow.

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
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags with for traffic that falls into this flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @param innerEthernetPriorityMark the input value
	 * @return this instance
	 */
	public Flow withInnerEthernetPriorityMark(Integer innerEthernetPriorityMark) {
		this.innerEthernetPriorityMark = innerEthernetPriorityMark;
		return this;
	}

	//</editor-fold>

}