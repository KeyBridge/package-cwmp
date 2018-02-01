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
package org.broadbandforum.tr104.voiceservice.h323;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * This object models a H.323 network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.H323.Network.{i}.")
public class Network {

	/**
	 * Enable or disable this {{object}}. Starts the DNS resolving when enabled.
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
	 * Indicates the status of this network.
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
	 * Host name or IP address of H.323 Gatekeeper.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Gatekeeper")
	@CWMPParameter(access = "readWrite")
	public String gatekeeper;
	/**
	 * Destination port to be used in connecting to the H.323 Gatekeeper.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GatekeeperPort")
	@CWMPParameter(access = "readWrite")
	public Long gatekeeperPort = 1719L;
	/**
	 * Gatekeeper ID.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GatekeeperID")
	@CWMPParameter(access = "readWrite")
	public String gatekeeperID;
	/**
	 * Defines the TimeToLive specification in the registration with the Gatekeeper in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToLive")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long timeToLive = 86400L;
	/**
	 * Diffserv code point to be used for outgoing H.323 signaling packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscPMark = 0L;
	/**
	 * VLAN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANIDMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDMark = -1;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetPriorityMark = -1;
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
	 * Limit on the number of simultaneous voice sessions across all {{object|.H323.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

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
	 * Get the enable or disable this {{object}}. Starts the DNS resolving when enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this {{object}}. Starts the DNS resolving when enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this {{object}}. Starts the DNS resolving when enabled.
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
	 * Get the indicates the status of this network.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this network.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this network.
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
	 * Get the host name or IP address of H.323 Gatekeeper.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getGatekeeper() {
		return gatekeeper;
	}

	/**
	 * Set the host name or IP address of H.323 Gatekeeper.
	 *
	 * @since 2.0
	 * @param gatekeeper the input value
	 */
	public void  setGatekeeper(String gatekeeper) {
		this.gatekeeper = gatekeeper;
	}

	/**
	 * Set the host name or IP address of H.323 Gatekeeper.
	 *
	 * @since 2.0
	 * @param gatekeeper the input value
	 * @return this instance
	 */
	public Network withGatekeeper(String gatekeeper) {
		this.gatekeeper = gatekeeper;
		return this;
	}

	/**
	 * Get the destination port to be used in connecting to the H.323 Gatekeeper.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getGatekeeperPort() {
		return gatekeeperPort;
	}

	/**
	 * Set the destination port to be used in connecting to the H.323 Gatekeeper.
	 *
	 * @since 2.0
	 * @param gatekeeperPort the input value
	 */
	public void  setGatekeeperPort(Long gatekeeperPort) {
		this.gatekeeperPort = gatekeeperPort;
	}

	/**
	 * Set the destination port to be used in connecting to the H.323 Gatekeeper.
	 *
	 * @since 2.0
	 * @param gatekeeperPort the input value
	 * @return this instance
	 */
	public Network withGatekeeperPort(Long gatekeeperPort) {
		this.gatekeeperPort = gatekeeperPort;
		return this;
	}

	/**
	 * Get the gatekeeper ID.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getGatekeeperID() {
		return gatekeeperID;
	}

	/**
	 * Set the gatekeeper ID.
	 *
	 * @since 2.0
	 * @param gatekeeperID the input value
	 */
	public void  setGatekeeperID(String gatekeeperID) {
		this.gatekeeperID = gatekeeperID;
	}

	/**
	 * Set the gatekeeper ID.
	 *
	 * @since 2.0
	 * @param gatekeeperID the input value
	 * @return this instance
	 */
	public Network withGatekeeperID(String gatekeeperID) {
		this.gatekeeperID = gatekeeperID;
		return this;
	}

	/**
	 * Get the defines the TimeToLive specification in the registration with the Gatekeeper in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToLive() {
		return timeToLive;
	}

	/**
	 * Set the defines the TimeToLive specification in the registration with the Gatekeeper in seconds.
	 *
	 * @since 2.0
	 * @param timeToLive the input value
	 */
	public void  setTimeToLive(Long timeToLive) {
		this.timeToLive = timeToLive;
	}

	/**
	 * Set the defines the TimeToLive specification in the registration with the Gatekeeper in seconds.
	 *
	 * @since 2.0
	 * @param timeToLive the input value
	 * @return this instance
	 */
	public Network withTimeToLive(Long timeToLive) {
		this.timeToLive = timeToLive;
		return this;
	}

	/**
	 * Get the diffserv code point to be used for outgoing H.323 signaling packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDscPMark() {
		return dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing H.323 signaling packets.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 */
	public void  setDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing H.323 signaling packets.
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
	 * Get the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getVlaNIDMark() {
		return vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param vlaNIDMark the input value
	 */
	public void  setVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
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
	 * Get the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing H.323 signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
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
	 * Get the limit on the number of simultaneous voice sessions across all {{object|.H323.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSessions() {
		return maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across all {{object|.H323.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @param maxSessions the input value
	 */
	public void  setMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across all {{object|.H323.Client.}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

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