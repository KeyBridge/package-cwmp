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
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Application table.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.QoS.App.{i}.")
@XmlRootElement(name = "App")
@XmlType(name = "Device.QoS.App")
@XmlAccessorType(XmlAccessType.FIELD)
public class App {

	/**
	 * Enables or disables this App table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this App table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * URN identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProtocolIdentifier")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String protocolIdentifier;
	/**
	 * Human-readable name associated with this entry in the App table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * Identifier of the forwarding policy associated with traffic associated with this App table entry, but not  associated with any specified flow.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long defaultForwardingPolicy = 0L;
	/**
	 * Identifier of the traffic class associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultTrafficClass")
	@CWMPParameter(access = "readWrite")
	public Long defaultTrafficClass = 0L;
	/**
	 * {{reference}} Indicates the ''Policer'' table entry for traffic associated with this {{object}} table entry, but not associated with any specified flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultPolicer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String defaultPolicer;
	/**
	 * DSCP to mark traffic associated with this App table entry, but not associated with any specified flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultDSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultDSCPMark = -1;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic associated with this App table entry, but not  associated with any specified flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultEthernetPriorityMark = -1;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags as defined in 802.1Q with this {{object}} table entry where the packet is not associated with any specified flow. This parameter is only applicable when the PDU has 2 VLAN Tags.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DefaultInnerEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer defaultInnerEthernetPriorityMark;

	public App() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this App table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this App table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this App table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public App withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this App table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this App table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this App table entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public App withStatus(String status) {
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
	public App withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the urn identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProtocolIdentifier() {
		return protocolIdentifier;
	}

	/**
	 * Set the urn identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param protocolIdentifier the input value
	 */
	public void  setProtocolIdentifier(String protocolIdentifier) {
		this.protocolIdentifier = protocolIdentifier;
	}

	/**
	 * Set the urn identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param protocolIdentifier the input value
	 * @return this instance
	 */
	public App withProtocolIdentifier(String protocolIdentifier) {
		this.protocolIdentifier = protocolIdentifier;
		return this;
	}

	/**
	 * Get the human-readable name associated with this entry in the App table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name associated with this entry in the App table.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name associated with this entry in the App table.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public App withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the identifier of the forwarding policy associated with traffic associated with this App table entry, but not  associated with any specified flow.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDefaultForwardingPolicy() {
		return defaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic associated with this App table entry, but not  associated with any specified flow.
	 *
	 * @since 2.0
	 * @param defaultForwardingPolicy the input value
	 */
	public void  setDefaultForwardingPolicy(Long defaultForwardingPolicy) {
		this.defaultForwardingPolicy = defaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic associated with this App table entry, but not  associated with any specified flow.
	 *
	 * @since 2.0
	 * @param defaultForwardingPolicy the input value
	 * @return this instance
	 */
	public App withDefaultForwardingPolicy(Long defaultForwardingPolicy) {
		this.defaultForwardingPolicy = defaultForwardingPolicy;
		return this;
	}

	/**
	 * Get the identifier of the traffic class associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDefaultTrafficClass() {
		return defaultTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 2.0
	 * @param defaultTrafficClass the input value
	 */
	public void  setDefaultTrafficClass(Long defaultTrafficClass) {
		this.defaultTrafficClass = defaultTrafficClass;
	}

	/**
	 * Set the identifier of the traffic class associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 2.0
	 * @param defaultTrafficClass the input value
	 * @return this instance
	 */
	public App withDefaultTrafficClass(Long defaultTrafficClass) {
		this.defaultTrafficClass = defaultTrafficClass;
		return this;
	}

	/**
	 * Get the {{reference}} Indicates the ''Policer'' table entry for traffic associated with this {{object}} table entry, but not associated with any specified flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDefaultPolicer() {
		return defaultPolicer;
	}

	/**
	 * Set the {{reference}} Indicates the ''Policer'' table entry for traffic associated with this {{object}} table entry, but not associated with any specified flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @param defaultPolicer the input value
	 */
	public void  setDefaultPolicer(String defaultPolicer) {
		this.defaultPolicer = defaultPolicer;
	}

	/**
	 * Set the {{reference}} Indicates the ''Policer'' table entry for traffic associated with this {{object}} table entry, but not associated with any specified flow.

          {{empty}} indicates a null policer.
	 *
	 * @since 2.0
	 * @param defaultPolicer the input value
	 * @return this instance
	 */
	public App withDefaultPolicer(String defaultPolicer) {
		this.defaultPolicer = defaultPolicer;
		return this;
	}

	/**
	 * Get the dscP to mark traffic associated with this App table entry, but not associated with any specified flow.

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
	 * Set the dscP to mark traffic associated with this App table entry, but not associated with any specified flow.

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
	 * Set the dscP to mark traffic associated with this App table entry, but not associated with any specified flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.0
	 * @param defaultDSCPMark the input value
	 * @return this instance
	 */
	public App withDefaultDSCPMark(Integer defaultDSCPMark) {
		this.defaultDSCPMark = defaultDSCPMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic associated with this App table entry, but not  associated with any specified flow.

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
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic associated with this App table entry, but not  associated with any specified flow.

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
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark traffic associated with this App table entry, but not  associated with any specified flow.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2a5|Annex A}}.
	 *
	 * @since 2.0
	 * @param defaultEthernetPriorityMark the input value
	 * @return this instance
	 */
	public App withDefaultEthernetPriorityMark(Integer defaultEthernetPriorityMark) {
		this.defaultEthernetPriorityMark = defaultEthernetPriorityMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags as defined in 802.1Q with this {{object}} table entry where the packet is not associated with any specified flow. This parameter is only applicable when the PDU has 2 VLAN Tags.

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
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags as defined in 802.1Q with this {{object}} table entry where the packet is not associated with any specified flow. This parameter is only applicable when the PDU has 2 VLAN Tags.

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
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2011}}) to mark the inner VLAN Tags as defined in 802.1Q with this {{object}} table entry where the packet is not associated with any specified flow. This parameter is only applicable when the PDU has 2 VLAN Tags.

          A value of -1 indicates no change from the incoming packet.

          A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-181i2|Annex A}}.
	 *
	 * @since 2.7
	 * @param defaultInnerEthernetPriorityMark the input value
	 * @return this instance
	 */
	public App withDefaultInnerEthernetPriorityMark(Integer defaultInnerEthernetPriorityMark) {
		this.defaultInnerEthernetPriorityMark = defaultInnerEthernetPriorityMark;
		return this;
	}

	//</editor-fold>

}