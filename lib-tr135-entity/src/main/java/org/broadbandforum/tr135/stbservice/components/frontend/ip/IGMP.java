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
package org.broadbandforum.tr135.stbservice.components.frontend.ip;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp.ClientGroup;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp.ClientGroupStats;

	/**
	 * Parameters that are specific to IGMP clients when changing channels.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.IGMP.")
public class IGMP {

	/**
	 * Enables or disables all IGMP support on the receiver side of the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Status of IGMP support on the receiver side of the CPE.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Maximum number of group memberships allowed simultaneously.

For example, this would need to be at least 2 in order to support a Multicast-delivered main picture and a Multicast-delivered PIP.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumNumberOfConcurrentGroups")
	public Long maximumNumberOfConcurrentGroups;
	/**
	 * Maximum number of groups for which statistics will be tracked.

This relates only to the maintenance of statistics, and does not affect the operation of the STB.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumNumberOfTrackedGroups")
	public Long maximumNumberOfTrackedGroups;
	/**
	 * Controls logging of IGMP traffic.

The CPE MAY choose to throttle log entries, e.g. if joins and leaves are occurring at an excessive rate.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LoggingEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean loggingEnable;
	/**
	 * Diffserv code point to be used for outgoing IGMP packets.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscPMark;
	/**
	 * VLAN ID (as defined in 802.1Q) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "VLANIDMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDMark;
	/**
	 * Ethernet priority code (as defined in 802.1D) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetPriorityMark;
	/**
	 * The highest IGMP version supported by the IGMP Client.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ClientVersion")
	public String clientVersion;
	/**
	 * Robustness is a way of indicating how vulnerable the network is to lost packets. IGMP can recover from robustness minus 1 lost IGMP packets.

RFC 3376 specifies a default of 2.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ClientRobustness")
	@CWMPParameter(access = "readWrite")
	public Long clientRobustness;
	/**
	 * The number of seconds between repetitions of a host's initial report of membership in a group.

RFC 3376 specifies a default of 1s.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ClientUnsolicitedReportInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1, max = 25)
	public Long clientUnsolicitedReportInterval;
	/**
	 * IGMP Group table. This is the database that is maintained by the IGMP client to reflect the current group membership.

The CPE MUST support at least ''MaximumNumberOfConcurrentGroups'' table entries.
	 */
	@XmlElementWrapper(name = "ClientGroups")
	@XmlElement(name = "ClientGroup")
	public Collection<ClientGroup> clientGroups;
	/**
	 * IGMP Group statistics table.  This stores per-group historical statistical data.

The CPE MUST support at least ''MaximumNumberOfTrackedGroups'' table entries.  The CPE MAY reclaim entries based on the oldest membership reports.
	 */
	@XmlElementWrapper(name = "ClientGroupStatss")
	@XmlElement(name = "ClientGroupStats")
	public Collection<ClientGroupStats> clientGroupStatss;

	public IGMP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables all IGMP support on the receiver side of the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables all IGMP support on the receiver side of the CPE.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables all IGMP support on the receiver side of the CPE.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public IGMP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of IGMP support on the receiver side of the CPE.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of IGMP support on the receiver side of the CPE.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of IGMP support on the receiver side of the CPE.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public IGMP withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the maximum number of group memberships allowed simultaneously.

For example, this would need to be at least 2 in order to support a Multicast-delivered main picture and a Multicast-delivered PIP.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumNumberOfConcurrentGroups() {
		return maximumNumberOfConcurrentGroups;
	}

	/**
	 * Set the maximum number of group memberships allowed simultaneously.

For example, this would need to be at least 2 in order to support a Multicast-delivered main picture and a Multicast-delivered PIP.
	 *
	 * @since 1.0
	 * @param maximumNumberOfConcurrentGroups the input value
	 */
	public void  setMaximumNumberOfConcurrentGroups(Long maximumNumberOfConcurrentGroups) {
		this.maximumNumberOfConcurrentGroups = maximumNumberOfConcurrentGroups;
	}

	/**
	 * Set the maximum number of group memberships allowed simultaneously.

For example, this would need to be at least 2 in order to support a Multicast-delivered main picture and a Multicast-delivered PIP.
	 *
	 * @since 1.0
	 * @param maximumNumberOfConcurrentGroups the input value
	 * @return this instance
	 */
	public IGMP withMaximumNumberOfConcurrentGroups(Long maximumNumberOfConcurrentGroups) {
		this.maximumNumberOfConcurrentGroups = maximumNumberOfConcurrentGroups;
		return this;
	}

	/**
	 * Get the maximum number of groups for which statistics will be tracked.

This relates only to the maintenance of statistics, and does not affect the operation of the STB.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumNumberOfTrackedGroups() {
		return maximumNumberOfTrackedGroups;
	}

	/**
	 * Set the maximum number of groups for which statistics will be tracked.

This relates only to the maintenance of statistics, and does not affect the operation of the STB.
	 *
	 * @since 1.0
	 * @param maximumNumberOfTrackedGroups the input value
	 */
	public void  setMaximumNumberOfTrackedGroups(Long maximumNumberOfTrackedGroups) {
		this.maximumNumberOfTrackedGroups = maximumNumberOfTrackedGroups;
	}

	/**
	 * Set the maximum number of groups for which statistics will be tracked.

This relates only to the maintenance of statistics, and does not affect the operation of the STB.
	 *
	 * @since 1.0
	 * @param maximumNumberOfTrackedGroups the input value
	 * @return this instance
	 */
	public IGMP withMaximumNumberOfTrackedGroups(Long maximumNumberOfTrackedGroups) {
		this.maximumNumberOfTrackedGroups = maximumNumberOfTrackedGroups;
		return this;
	}

	/**
	 * Get the controls logging of IGMP traffic.

The CPE MAY choose to throttle log entries, e.g. if joins and leaves are occurring at an excessive rate.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isLoggingEnable() {
		return loggingEnable;
	}

	/**
	 * Set the controls logging of IGMP traffic.

The CPE MAY choose to throttle log entries, e.g. if joins and leaves are occurring at an excessive rate.
	 *
	 * @since 1.0
	 * @param loggingEnable the input value
	 */
	public void  setLoggingEnable(Boolean loggingEnable) {
		this.loggingEnable = loggingEnable;
	}

	/**
	 * Set the controls logging of IGMP traffic.

The CPE MAY choose to throttle log entries, e.g. if joins and leaves are occurring at an excessive rate.
	 *
	 * @since 1.0
	 * @param loggingEnable the input value
	 * @return this instance
	 */
	public IGMP withLoggingEnable(Boolean loggingEnable) {
		this.loggingEnable = loggingEnable;
		return this;
	}

	/**
	 * Get the diffserv code point to be used for outgoing IGMP packets.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDscPMark() {
		return dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing IGMP packets.
	 *
	 * @since 1.0
	 * @param dscPMark the input value
	 */
	public void  setDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing IGMP packets.
	 *
	 * @since 1.0
	 * @param dscPMark the input value
	 * @return this instance
	 */
	public IGMP withDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
		return this;
	}

	/**
	 * Get the vlaN ID (as defined in 802.1Q) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getVlaNIDMark() {
		return vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in 802.1Q) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 * @param vlaNIDMark the input value
	 */
	public void  setVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in 802.1Q) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 * @param vlaNIDMark the input value
	 * @return this instance
	 */
	public IGMP withVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in 802.1D) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in 802.1D) to be used for outgoing IGMP packets.  A value of -1 indicates the default value is to be used.

If either the {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 1.0
	 * @param ethernetPriorityMark the input value
	 * @return this instance
	 */
	public IGMP withEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
		return this;
	}

	/**
	 * Get the highest IGMP version supported by the IGMP Client.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getClientVersion() {
		return clientVersion;
	}

	/**
	 * Set the highest IGMP version supported by the IGMP Client.
	 *
	 * @since 1.0
	 * @param clientVersion the input value
	 */
	public void  setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	/**
	 * Set the highest IGMP version supported by the IGMP Client.
	 *
	 * @since 1.0
	 * @param clientVersion the input value
	 * @return this instance
	 */
	public IGMP withClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		return this;
	}

	/**
	 * Get the robustness is a way of indicating how vulnerable the network is to lost packets. IGMP can recover from robustness minus 1 lost IGMP packets.

RFC 3376 specifies a default of 2.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getClientRobustness() {
		return clientRobustness;
	}

	/**
	 * Set the robustness is a way of indicating how vulnerable the network is to lost packets. IGMP can recover from robustness minus 1 lost IGMP packets.

RFC 3376 specifies a default of 2.
	 *
	 * @since 1.0
	 * @param clientRobustness the input value
	 */
	public void  setClientRobustness(Long clientRobustness) {
		this.clientRobustness = clientRobustness;
	}

	/**
	 * Set the robustness is a way of indicating how vulnerable the network is to lost packets. IGMP can recover from robustness minus 1 lost IGMP packets.

RFC 3376 specifies a default of 2.
	 *
	 * @since 1.0
	 * @param clientRobustness the input value
	 * @return this instance
	 */
	public IGMP withClientRobustness(Long clientRobustness) {
		this.clientRobustness = clientRobustness;
		return this;
	}

	/**
	 * Get the number of seconds between repetitions of a host's initial report of membership in a group.

RFC 3376 specifies a default of 1s.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getClientUnsolicitedReportInterval() {
		return clientUnsolicitedReportInterval;
	}

	/**
	 * Set the number of seconds between repetitions of a host's initial report of membership in a group.

RFC 3376 specifies a default of 1s.
	 *
	 * @since 1.0
	 * @param clientUnsolicitedReportInterval the input value
	 */
	public void  setClientUnsolicitedReportInterval(Long clientUnsolicitedReportInterval) {
		this.clientUnsolicitedReportInterval = clientUnsolicitedReportInterval;
	}

	/**
	 * Set the number of seconds between repetitions of a host's initial report of membership in a group.

RFC 3376 specifies a default of 1s.
	 *
	 * @since 1.0
	 * @param clientUnsolicitedReportInterval the input value
	 * @return this instance
	 */
	public IGMP withClientUnsolicitedReportInterval(Long clientUnsolicitedReportInterval) {
		this.clientUnsolicitedReportInterval = clientUnsolicitedReportInterval;
		return this;
	}

	/**
	 * Get the igmP Group table. This is the database that is maintained by the IGMP client to reflect the current group membership.

The CPE MUST support at least ''MaximumNumberOfConcurrentGroups'' table entries.
	 *
	 * @return the value
	 */
	public Collection<ClientGroup> getClientGroups() {
		if (this.clientGroups == null){ this.clientGroups=new ArrayList<>();}
		return clientGroups;
	}

	/**
	 * Set the igmP Group table. This is the database that is maintained by the IGMP client to reflect the current group membership.

The CPE MUST support at least ''MaximumNumberOfConcurrentGroups'' table entries.
	 *
	 * @param clientGroups the input value
	 */
	public void  setClientGroups(Collection<ClientGroup> clientGroups) {
		this.clientGroups = clientGroups;
	}

	/**
	 * Set the igmP Group table. This is the database that is maintained by the IGMP client to reflect the current group membership.

The CPE MUST support at least ''MaximumNumberOfConcurrentGroups'' table entries.
	 *
	 * @param clientGroup the input value
	 * @return this instance
	 */
	public IGMP withClientGroup(ClientGroup clientGroup) {
		getClientGroups().add(clientGroup);
		return this;
	}

	/**
	 * Get the igmP Group statistics table.  This stores per-group historical statistical data.

The CPE MUST support at least ''MaximumNumberOfTrackedGroups'' table entries.  The CPE MAY reclaim entries based on the oldest membership reports.
	 *
	 * @return the value
	 */
	public Collection<ClientGroupStats> getClientGroupStatss() {
		if (this.clientGroupStatss == null){ this.clientGroupStatss=new ArrayList<>();}
		return clientGroupStatss;
	}

	/**
	 * Set the igmP Group statistics table.  This stores per-group historical statistical data.

The CPE MUST support at least ''MaximumNumberOfTrackedGroups'' table entries.  The CPE MAY reclaim entries based on the oldest membership reports.
	 *
	 * @param clientGroupStatss the input value
	 */
	public void  setClientGroupStatss(Collection<ClientGroupStats> clientGroupStatss) {
		this.clientGroupStatss = clientGroupStatss;
	}

	/**
	 * Set the igmP Group statistics table.  This stores per-group historical statistical data.

The CPE MUST support at least ''MaximumNumberOfTrackedGroups'' table entries.  The CPE MAY reclaim entries based on the oldest membership reports.
	 *
	 * @param clientGroupStats the input value
	 * @return this instance
	 */
	public IGMP withClientGroupStats(ClientGroupStats clientGroupStats) {
		getClientGroupStatss().add(clientGroupStats);
		return this;
	}

	//</editor-fold>

}