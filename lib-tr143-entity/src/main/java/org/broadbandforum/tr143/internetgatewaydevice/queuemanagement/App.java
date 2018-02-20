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
package org.broadbandforum.tr143.internetgatewaydevice.queuemanagement;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Application table.
	 *
	 * @since TR143 v1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.QueueManagement.App.{i}.")
@XmlRootElement(name = "InternetGatewayDevice.QueueManagement.App")
@XmlType(name = "InternetGatewayDevice.QueueManagement.App")
@XmlAccessorType(XmlAccessType.FIELD)
public class App {

	/**
	 * Unique key for each App table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppKey")
	public Long appKey;
	/**
	 * Enables or disables this App table entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean appEnable;
	/**
	 * The status of this App table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppStatus")
	public String appStatus;
	/**
	 * URN identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ProtocolIdentifier")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String protocolIdentifier;
	/**
	 * Human-readable name associated with this entry in the App table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String appName;
	/**
	 * Identifier of the forwarding policy associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppDefaultForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	public Long appDefaultForwardingPolicy = 0L;
	/**
	 * Instance number of the Policer table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppDefaultPolicer")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer appDefaultPolicer;
	/**
	 * Instance number of the Queue table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null queue.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppDefaultQueue")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer appDefaultQueue;
	/**
	 * DSCP to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppDefaultDSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer appDefaultDSCPMark;
	/**
	 * Ethernet priority code (as defined in 802.1D) to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AppDefaultEthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -2)
	public Integer appDefaultEthernetPriorityMark;

	public App() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique key for each App table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getAppKey() {
		return appKey;
	}

	/**
	 * Set the unique key for each App table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param appKey the input value
	 */
	public void  setAppKey(Long appKey) {
		this.appKey = appKey;
	}

	/**
	 * Set the unique key for each App table entry.

This parameter is OBSOLETED because it serves no purpose (no other parameter references it).
	 *
	 * @since 1.1
	 * @param appKey the input value
	 * @return this instance
	 */
	public App withAppKey(Long appKey) {
		this.appKey = appKey;
		return this;
	}

	/**
	 * Get the enables or disables this App table entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isAppEnable() {
		return appEnable;
	}

	/**
	 * Set the enables or disables this App table entry.
	 *
	 * @since 1.1
	 * @param appEnable the input value
	 */
	public void  setAppEnable(Boolean appEnable) {
		this.appEnable = appEnable;
	}

	/**
	 * Set the enables or disables this App table entry.
	 *
	 * @since 1.1
	 * @param appEnable the input value
	 * @return this instance
	 */
	public App withAppEnable(Boolean appEnable) {
		this.appEnable = appEnable;
		return this;
	}

	/**
	 * Get the status of this App table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getAppStatus() {
		return appStatus;
	}

	/**
	 * Set the status of this App table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param appStatus the input value
	 */
	public void  setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	/**
	 * Set the status of this App table entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param appStatus the input value
	 * @return this instance
	 */
	public App withAppStatus(String appStatus) {
		this.appStatus = appStatus;
		return this;
	}

	/**
	 * Get the urn identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getProtocolIdentifier() {
		return protocolIdentifier;
	}

	/**
	 * Set the urn identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param protocolIdentifier the input value
	 */
	public void  setProtocolIdentifier(String protocolIdentifier) {
		this.protocolIdentifier = protocolIdentifier;
	}

	/**
	 * Set the urn identifying the protocol associated with the given application.  A set of defined URNs is given in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
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
	 * @since 1.1
	 * @return the value
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * Set the human-readable name associated with this entry in the App table.
	 *
	 * @since 1.1
	 * @param appName the input value
	 */
	public void  setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * Set the human-readable name associated with this entry in the App table.
	 *
	 * @since 1.1
	 * @param appName the input value
	 * @return this instance
	 */
	public App withAppName(String appName) {
		this.appName = appName;
		return this;
	}

	/**
	 * Get the identifier of the forwarding policy associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getAppDefaultForwardingPolicy() {
		return appDefaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 1.1
	 * @param appDefaultForwardingPolicy the input value
	 */
	public void  setAppDefaultForwardingPolicy(Long appDefaultForwardingPolicy) {
		this.appDefaultForwardingPolicy = appDefaultForwardingPolicy;
	}

	/**
	 * Set the identifier of the forwarding policy associated with traffic associated with this App table entry, but not associated with any specified flow.
	 *
	 * @since 1.1
	 * @param appDefaultForwardingPolicy the input value
	 * @return this instance
	 */
	public App withAppDefaultForwardingPolicy(Long appDefaultForwardingPolicy) {
		this.appDefaultForwardingPolicy = appDefaultForwardingPolicy;
		return this;
	}

	/**
	 * Get the instance number of the Policer table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getAppDefaultPolicer() {
		return appDefaultPolicer;
	}

	/**
	 * Set the instance number of the Policer table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param appDefaultPolicer the input value
	 */
	public void  setAppDefaultPolicer(Integer appDefaultPolicer) {
		this.appDefaultPolicer = appDefaultPolicer;
	}

	/**
	 * Set the instance number of the Policer table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null policer.
	 *
	 * @since 1.1
	 * @param appDefaultPolicer the input value
	 * @return this instance
	 */
	public App withAppDefaultPolicer(Integer appDefaultPolicer) {
		this.appDefaultPolicer = appDefaultPolicer;
		return this;
	}

	/**
	 * Get the instance number of the Queue table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null queue.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getAppDefaultQueue() {
		return appDefaultQueue;
	}

	/**
	 * Set the instance number of the Queue table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null queue.
	 *
	 * @since 1.1
	 * @param appDefaultQueue the input value
	 */
	public void  setAppDefaultQueue(Integer appDefaultQueue) {
		this.appDefaultQueue = appDefaultQueue;
	}

	/**
	 * Set the instance number of the Queue table entry for traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates a null queue.
	 *
	 * @since 1.1
	 * @param appDefaultQueue the input value
	 * @return this instance
	 */
	public App withAppDefaultQueue(Integer appDefaultQueue) {
		this.appDefaultQueue = appDefaultQueue;
		return this;
	}

	/**
	 * Get the dscP to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getAppDefaultDSCPMark() {
		return appDefaultDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param appDefaultDSCPMark the input value
	 */
	public void  setAppDefaultDSCPMark(Integer appDefaultDSCPMark) {
		this.appDefaultDSCPMark = appDefaultDSCPMark;
	}

	/**
	 * Set the dscP to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of DSCP based upon the EthernetPriority value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param appDefaultDSCPMark the input value
	 * @return this instance
	 */
	public App withAppDefaultDSCPMark(Integer appDefaultDSCPMark) {
		this.appDefaultDSCPMark = appDefaultDSCPMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in 802.1D) to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getAppDefaultEthernetPriorityMark() {
		return appDefaultEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param appDefaultEthernetPriorityMark the input value
	 */
	public void  setAppDefaultEthernetPriorityMark(Integer appDefaultEthernetPriorityMark) {
		this.appDefaultEthernetPriorityMark = appDefaultEthernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to mark traffic associated with this App table entry, but not associated with any specified flow.

A value of -1 indicates no change from the incoming packet.

A value of -2 indicates automatic marking of EthernetPriority based upon the DSCP value of the incoming packet as defined in {{bibref|TR-098a1|Annex A}}.
	 *
	 * @since 1.1
	 * @param appDefaultEthernetPriorityMark the input value
	 * @return this instance
	 */
	public App withAppDefaultEthernetPriorityMark(Integer appDefaultEthernetPriorityMark) {
		this.appDefaultEthernetPriorityMark = appDefaultEthernetPriorityMark;
		return this;
	}

	//</editor-fold>

}