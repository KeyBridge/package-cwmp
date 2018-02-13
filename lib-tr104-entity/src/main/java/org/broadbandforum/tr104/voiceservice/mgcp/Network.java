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
package org.broadbandforum.tr104.voiceservice.mgcp;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * This object models a MGCP network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.MGCP.Network.{i}.")
@XmlRootElement(name = "Network")
@XmlType(name = "VoiceService.MGCP.Network")
@XmlAccessorType(XmlAccessType.FIELD)
public class Network {

	/**
	 * Enable or disable the {{object}}. Starts the DNS resolving when enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * If {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuiescentMode")
	@CWMPParameter(access = "readWrite")
	public Boolean quiescentMode;
	/**
	 * Indicates the status of this {{object}}.
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
	 * Host name or IP address of the main MGCP call agent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallAgent1")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String callAgent1;
	/**
	 * Destination port to be used in connecting with the main MGCP call agent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallAgentPort1")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long callAgentPort1 = 0L;
	/**
	 * Host name or IP address of the backup MGCP call agent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallAgent2")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String callAgent2;
	/**
	 * Destination port to be used in connecting with the backup MGCP call agent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallAgentPort2")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long callAgentPort2 = 0L;
	/**
	 * Message retransfer interval, in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RetranIntervalTimer")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 65535)
	public Long retranIntervalTimer = 1L;
	/**
	 * Max number of message retransfers.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxRetranCount")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long maxRetranCount = 10L;
	/**
	 * Diffserv code point to be used for outgoing MGCP signaling packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscPMark;
	/**
	 * VLAN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANIDMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDMark = -1;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetPriorityMark = -1;
	/**
	 * Indicates whether or not piggyback events are allowed to the MGCP call agent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllowPiggybackEvents")
	@CWMPParameter(access = "readWrite")
	public Boolean allowPiggybackEvents;
	/**
	 * Indicates whether or not to send RSIP immediately on restart.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SendRSIPImmediately")
	@CWMPParameter(access = "readWrite")
	public Boolean sendRSIPImmediately;
	/**
	 * Enable or disable use of STUN to allow operation through NAT.  Note: enabling STUN is to be interpreted as enabling the use of STUN for discovery, not use as a keep-alive mechanism.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "STUNEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean stuNEnable = false;
	/**
	 * Domain name or IP address of the STUN server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "STUNServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String stuNServer;
	/**
	 * For bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of upstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NonVoiceBandwidthReservedUpstream")
	@CWMPParameter(access = "readWrite", units = "bits per second")
	public Long nonVoiceBandwidthReservedUpstream = 0L;
	/**
	 * For bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of downstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NonVoiceBandwidthReservedDownstream")
	@CWMPParameter(access = "readWrite", units = "bits per second")
	public Long nonVoiceBandwidthReservedDownstream = 0L;
	/**
	 * Limit on the number of simultaneous voice sessions across all {{object|.MGCP.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessions")
	@CWMPParameter(access = "readWrite")
	public Long maxSessions = 0L;
	/**
	 * VoIP profile to use with this network.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoIPProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String voiPProfile;
	/**
	 * {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the remote endpoint and consistent with the available bandwidth.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CodecList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> codecList;

	public Network() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable the {{object}}. Starts the DNS resolving when enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable the {{object}}. Starts the DNS resolving when enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable the {{object}}. Starts the DNS resolving when enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Network withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isQuiescentMode() {
		return quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 */
	public void  setQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
	}

	/**
	 * Set the if {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 * @param quiescentMode the input value
	 * @return this instance
	 */
	public Network withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this {{object}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Network withStatus(String status) {
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
	public Network withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the host name or IP address of the main MGCP call agent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallAgent1() {
		return callAgent1;
	}

	/**
	 * Set the host name or IP address of the main MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgent1 the input value
	 */
	public void  setCallAgent1(String callAgent1) {
		this.callAgent1 = callAgent1;
	}

	/**
	 * Set the host name or IP address of the main MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgent1 the input value
	 * @return this instance
	 */
	public Network withCallAgent1(String callAgent1) {
		this.callAgent1 = callAgent1;
		return this;
	}

	/**
	 * Get the destination port to be used in connecting with the main MGCP call agent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallAgentPort1() {
		return callAgentPort1;
	}

	/**
	 * Set the destination port to be used in connecting with the main MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgentPort1 the input value
	 */
	public void  setCallAgentPort1(Long callAgentPort1) {
		this.callAgentPort1 = callAgentPort1;
	}

	/**
	 * Set the destination port to be used in connecting with the main MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgentPort1 the input value
	 * @return this instance
	 */
	public Network withCallAgentPort1(Long callAgentPort1) {
		this.callAgentPort1 = callAgentPort1;
		return this;
	}

	/**
	 * Get the host name or IP address of the backup MGCP call agent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallAgent2() {
		return callAgent2;
	}

	/**
	 * Set the host name or IP address of the backup MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgent2 the input value
	 */
	public void  setCallAgent2(String callAgent2) {
		this.callAgent2 = callAgent2;
	}

	/**
	 * Set the host name or IP address of the backup MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgent2 the input value
	 * @return this instance
	 */
	public Network withCallAgent2(String callAgent2) {
		this.callAgent2 = callAgent2;
		return this;
	}

	/**
	 * Get the destination port to be used in connecting with the backup MGCP call agent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCallAgentPort2() {
		return callAgentPort2;
	}

	/**
	 * Set the destination port to be used in connecting with the backup MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgentPort2 the input value
	 */
	public void  setCallAgentPort2(Long callAgentPort2) {
		this.callAgentPort2 = callAgentPort2;
	}

	/**
	 * Set the destination port to be used in connecting with the backup MGCP call agent.
	 *
	 * @since 2.0
	 * @param callAgentPort2 the input value
	 * @return this instance
	 */
	public Network withCallAgentPort2(Long callAgentPort2) {
		this.callAgentPort2 = callAgentPort2;
		return this;
	}

	/**
	 * Get the message retransfer interval, in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRetranIntervalTimer() {
		return retranIntervalTimer;
	}

	/**
	 * Set the message retransfer interval, in seconds.
	 *
	 * @since 2.0
	 * @param retranIntervalTimer the input value
	 */
	public void  setRetranIntervalTimer(Long retranIntervalTimer) {
		this.retranIntervalTimer = retranIntervalTimer;
	}

	/**
	 * Set the message retransfer interval, in seconds.
	 *
	 * @since 2.0
	 * @param retranIntervalTimer the input value
	 * @return this instance
	 */
	public Network withRetranIntervalTimer(Long retranIntervalTimer) {
		this.retranIntervalTimer = retranIntervalTimer;
		return this;
	}

	/**
	 * Get the max number of message retransfers.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxRetranCount() {
		return maxRetranCount;
	}

	/**
	 * Set the max number of message retransfers.
	 *
	 * @since 2.0
	 * @param maxRetranCount the input value
	 */
	public void  setMaxRetranCount(Long maxRetranCount) {
		this.maxRetranCount = maxRetranCount;
	}

	/**
	 * Set the max number of message retransfers.
	 *
	 * @since 2.0
	 * @param maxRetranCount the input value
	 * @return this instance
	 */
	public Network withMaxRetranCount(Long maxRetranCount) {
		this.maxRetranCount = maxRetranCount;
		return this;
	}

	/**
	 * Get the diffserv code point to be used for outgoing MGCP signaling packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDscPMark() {
		return dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing MGCP signaling packets.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 */
	public void  setDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing MGCP signaling packets.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 * @return this instance
	 */
	public Network withDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
		return this;
	}

	/**
	 * Get the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getVlaNIDMark() {
		return vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param vlaNIDMark the input value
	 */
	public void  setVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param vlaNIDMark the input value
	 * @return this instance
	 */
	public Network withVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing MGCP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 * @return this instance
	 */
	public Network withEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
		return this;
	}

	/**
	 * Get the indicates whether or not piggyback events are allowed to the MGCP call agent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAllowPiggybackEvents() {
		return allowPiggybackEvents;
	}

	/**
	 * Set the indicates whether or not piggyback events are allowed to the MGCP call agent.
	 *
	 * @since 2.0
	 * @param allowPiggybackEvents the input value
	 */
	public void  setAllowPiggybackEvents(Boolean allowPiggybackEvents) {
		this.allowPiggybackEvents = allowPiggybackEvents;
	}

	/**
	 * Set the indicates whether or not piggyback events are allowed to the MGCP call agent.
	 *
	 * @since 2.0
	 * @param allowPiggybackEvents the input value
	 * @return this instance
	 */
	public Network withAllowPiggybackEvents(Boolean allowPiggybackEvents) {
		this.allowPiggybackEvents = allowPiggybackEvents;
		return this;
	}

	/**
	 * Get the indicates whether or not to send RSIP immediately on restart.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSendRSIPImmediately() {
		return sendRSIPImmediately;
	}

	/**
	 * Set the indicates whether or not to send RSIP immediately on restart.
	 *
	 * @since 2.0
	 * @param sendRSIPImmediately the input value
	 */
	public void  setSendRSIPImmediately(Boolean sendRSIPImmediately) {
		this.sendRSIPImmediately = sendRSIPImmediately;
	}

	/**
	 * Set the indicates whether or not to send RSIP immediately on restart.
	 *
	 * @since 2.0
	 * @param sendRSIPImmediately the input value
	 * @return this instance
	 */
	public Network withSendRSIPImmediately(Boolean sendRSIPImmediately) {
		this.sendRSIPImmediately = sendRSIPImmediately;
		return this;
	}

	/**
	 * Get the enable or disable use of STUN to allow operation through NAT.  Note: enabling STUN is to be interpreted as enabling the use of STUN for discovery, not use as a keep-alive mechanism.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isStuNEnable() {
		return stuNEnable;
	}

	/**
	 * Set the enable or disable use of STUN to allow operation through NAT.  Note: enabling STUN is to be interpreted as enabling the use of STUN for discovery, not use as a keep-alive mechanism.
	 *
	 * @since 2.0
	 * @param stuNEnable the input value
	 */
	public void  setStuNEnable(Boolean stuNEnable) {
		this.stuNEnable = stuNEnable;
	}

	/**
	 * Set the enable or disable use of STUN to allow operation through NAT.  Note: enabling STUN is to be interpreted as enabling the use of STUN for discovery, not use as a keep-alive mechanism.
	 *
	 * @since 2.0
	 * @param stuNEnable the input value
	 * @return this instance
	 */
	public Network withStuNEnable(Boolean stuNEnable) {
		this.stuNEnable = stuNEnable;
		return this;
	}

	/**
	 * Get the domain name or IP address of the STUN server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStuNServer() {
		return stuNServer;
	}

	/**
	 * Set the domain name or IP address of the STUN server.
	 *
	 * @since 2.0
	 * @param stuNServer the input value
	 */
	public void  setStuNServer(String stuNServer) {
		this.stuNServer = stuNServer;
	}

	/**
	 * Set the domain name or IP address of the STUN server.
	 *
	 * @since 2.0
	 * @param stuNServer the input value
	 * @return this instance
	 */
	public Network withStuNServer(String stuNServer) {
		this.stuNServer = stuNServer;
		return this;
	}

	/**
	 * Get the for bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of upstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNonVoiceBandwidthReservedUpstream() {
		return nonVoiceBandwidthReservedUpstream;
	}

	/**
	 * Set the for bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of upstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 * @param nonVoiceBandwidthReservedUpstream the input value
	 */
	public void  setNonVoiceBandwidthReservedUpstream(Long nonVoiceBandwidthReservedUpstream) {
		this.nonVoiceBandwidthReservedUpstream = nonVoiceBandwidthReservedUpstream;
	}

	/**
	 * Set the for bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of upstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 * @param nonVoiceBandwidthReservedUpstream the input value
	 * @return this instance
	 */
	public Network withNonVoiceBandwidthReservedUpstream(Long nonVoiceBandwidthReservedUpstream) {
		this.nonVoiceBandwidthReservedUpstream = nonVoiceBandwidthReservedUpstream;
		return this;
	}

	/**
	 * Get the for bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of downstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNonVoiceBandwidthReservedDownstream() {
		return nonVoiceBandwidthReservedDownstream;
	}

	/**
	 * Set the for bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of downstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 * @param nonVoiceBandwidthReservedDownstream the input value
	 */
	public void  setNonVoiceBandwidthReservedDownstream(Long nonVoiceBandwidthReservedDownstream) {
		this.nonVoiceBandwidthReservedDownstream = nonVoiceBandwidthReservedDownstream;
	}

	/**
	 * Set the for bandwidth-based admission control, a session can proceed only if there is {{param}} bits per second of downstream bandwidth left available for non-voice traffic.  This parameter is appropriate only in implementations in which the actual bandwidth can be known, such as a VoIP device embedded in a DSL B-NT.
	 *
	 * @since 2.0
	 * @param nonVoiceBandwidthReservedDownstream the input value
	 * @return this instance
	 */
	public Network withNonVoiceBandwidthReservedDownstream(Long nonVoiceBandwidthReservedDownstream) {
		this.nonVoiceBandwidthReservedDownstream = nonVoiceBandwidthReservedDownstream;
		return this;
	}

	/**
	 * Get the limit on the number of simultaneous voice sessions across all {{object|.MGCP.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSessions() {
		return maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across all {{object|.MGCP.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @param maxSessions the input value
	 */
	public void  setMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across all {{object|.MGCP.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @param maxSessions the input value
	 * @return this instance
	 */
	public Network withMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
		return this;
	}

	/**
	 * Get the voiP profile to use with this network.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVoiPProfile() {
		return voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this network.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 */
	public void  setVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this network.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 * @return this instance
	 */
	public Network withVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the remote endpoint and consistent with the available bandwidth.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getCodecList() {
		if (this.codecList == null){ this.codecList=new ArrayList<>();}
		return codecList;
	}

	/**
	 * Set the {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the remote endpoint and consistent with the available bandwidth.
	 *
	 * @since 2.0
	 * @param codecList the input value
	 */
	public void  setCodecList(Collection<String> codecList) {
		this.codecList = codecList;
	}

	/**
	 * Set the {{list}} {{reference}}

The CPE SHOULD use the first enabled item in the list among those supported by the remote endpoint and consistent with the available bandwidth.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Network withCodecList(String string) {
		getCodecList().add(string);
		return this;
	}

	//</editor-fold>

}