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
package org.broadbandforum.tr104.voiceservice.sip;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.datatypes.IPAddress;
import org.broadbandforum.tr104.voiceservice.sip.network.EventSubscribe;
import org.broadbandforum.tr104.voiceservice.sip.network.FQDNServer;
import org.broadbandforum.tr104.voiceservice.sip.network.ResponseMap;

	/**
	 * This object models a SIP network (a network as described in {{bibref|TR-104i2|Section 4.2}}). SIP networks are used by SIP {{object|#.Client}} objects so that common parameters do not have to be provisioned multiple times.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Network.{i}.")
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
	 * Host name or IP address of the SIP proxy server.

If not {{empty}}, all SIP signaling traffic MUST be sent to the host indicated by this parameter and the port indicated by {{param|ProxyServerPort}} unless {{param|OutboundProxy}} is not {{empty}} or a different route was discovered during normal SIP routing operations.

Regardless of which host the traffic gets sent to ({{param}} or {{param|OutboundProxy}}), the value of this parameter (unless {{empty}}) MUST be used to derive the URI placed into the SIP Route header field of all requests originated by this end-point, unless a different proxy host was discovered dynamically during normal SIP routing operations.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProxyServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String proxyServer;
	/**
	 * Destination port to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProxyServerPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long proxyServerPort = 5060L;
	/**
	 * Transport protocol to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProxyServerTransport")
	@CWMPParameter(access = "readWrite")
	public String proxyServerTransport = "UDP";
	/**
	 * Host name or IP address of the SIP registrar server.

If this parameter is {{empty}}, the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrarServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String registrarServer;
	/**
	 * Destination port to be used in connecting to the SIP registrar server.

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrarServerPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long registrarServerPort = 5060L;
	/**
	 * Transport protocol to be used in connecting to the registrar server. {{enum}}

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrarServerTransport")
	@CWMPParameter(access = "readWrite")
	public String registrarServerTransport = "UDP";
	/**
	 * If non-empty this {{param}} is used by the devices in a DNS SRV request to provide FQDNs {{object|FQDNServer.{i}.}} for SIP Server connections.

{{bibref|RFC2782}} ''Clients ask for a specific service/protocol for a specific domain (the word domain is used here in the strict RFC 1034 sense), and get back the names of any available servers.''
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ServerDomain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serverDomain;
	/**
	 * Domain used by {{object|#.Client}} objects that reference this {{object}} instance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChosenDomain")
	@Size(max = 256)
	public String chosenDomain;
	/**
	 * IP address used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChosenIPAddress")
	public IPAddress chosenIPAddress;
	/**
	 * Port used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChosenPort")
	@Size(min = 0, max = 65535)
	public Long chosenPort;
	/**
	 * CPE domain string. If {{empty}}, the CPE SHOULD use its IP address as the domain.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserAgentDomain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String userAgentDomain;
	/**
	 * Port used for incoming call control signaling.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserAgentPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long userAgentPort = 0L;
	/**
	 * Transport protocol to be used for incoming call control signaling.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserAgentTransport")
	@CWMPParameter(access = "readWrite")
	public String userAgentTransport = "UDP";
	/**
	 * The Fully Qualified Domain Name (FQDN) or IP Address of the outbound proxy. If the value is not {{empty}}, the SIP endpoint MUST send all SIP traffic (requests and responses) to the host indicated by this parameter and the port indicated by {{param|OutboundProxyPort}}. This MUST be done regardless of the routes discovered using normal SIP operations, including use of Route headers initialized from Service-Route and Record-Route headers previously received. {{param}} is NOT used to generate the URI placed into the Route header of any requests.

When {{param}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutboundProxy")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String outboundProxy;
	/**
	 * The IP address of the outbound proxy.

This parameter can be assigned statically (e.g. present in the factory default configuration or set by the ACS via {{param|OutboundProxy}}) or assigned dynamically (via DHCP).

When {{param|OutboundProxy}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutboundProxyResolvedAddress")
	public IPAddress outboundProxyResolvedAddress;
	/**
	 * Indicates whether it is the static configuration or the DHCP configuration that is actually used for {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutboundProxyPrecedence")
	public String outboundProxyPrecedence;
	/**
	 * Destination port to be used in connecting to the outbound proxy.  This parameter MUST be ignored unless the value of {{param|OutboundProxy}} is non-empty.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutboundProxyPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long outboundProxyPort = 5060L;
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
	 * Text string to be used in the Organization header.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Organization")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String organization;
	/**
	 * Duration, in seconds, after which the user agent needs to register again.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrationPeriod")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long registrationPeriod;
	/**
	 * Realm for authentication with the specified values of {{param|#.Client.{i}.AuthUserName}} and {{param|#.Client.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Realm")
	@CWMPParameter(access = "readWrite")
	public String realm;
	/**
	 * Value of SIP timer T1, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerT1")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerT1;
	/**
	 * Value of SIP timer T2, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerT2")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerT2;
	/**
	 * Value of SIP timer T4, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerT4")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerT4;
	/**
	 * Value of SIP timer A, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerA")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerA;
	/**
	 * Value of SIP timer B, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerB")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerB;
	/**
	 * Value of SIP timer C, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerC")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerC;
	/**
	 * Value of SIP timer D, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerD")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerD;
	/**
	 * Value of SIP timer E, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerE")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerE;
	/**
	 * Value of SIP timer F, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerF")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerF;
	/**
	 * Value of SIP timer G, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerG")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerG;
	/**
	 * Value of SIP timer H, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerH")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerH;
	/**
	 * Value of SIP timer I, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerI")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerI;
	/**
	 * Value of SIP timer J, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerJ")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerJ;
	/**
	 * Value of SIP timer K, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerK")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timerK;
	/**
	 * Invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InviteExpires")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long inviteExpires;
	/**
	 * Re-invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReInviteExpires")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long reinviteExpires;
	/**
	 * Register request Expires header value, in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegisterExpires")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long registerExpires;
	/**
	 * Register retry interval, in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegisterRetryInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long registerRetryInterval;
	/**
	 * Applicable inbound authentication method, if any.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InboundAuth")
	@CWMPParameter(access = "readWrite")
	public String inboundAuth = "None";
	/**
	 * If inbound authentication is used, the username credentials.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InboundAuthUsername")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String inboundAuthUsername;
	/**
	 * If inbound authentication is used, the password credentials.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InboundAuthPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String inboundAuthPassword;
	/**
	 * When {{true}}, in the SDP included in an OK response to an Invite, the first listed codec MUST be the highest priority codec among those offered in the Invite, based on the priorities specified in {{param|CodecList}}. The list of codecs in the SDP MAY also include other lower priority codecs.

When {{false}}, there is no specific requirement for choosing the codecs listed in the SDP included in an OK response.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UseCodecPriorityInSDPResponse")
	@CWMPParameter(access = "readWrite")
	public Boolean useCodecPriorityInSDPResponse = false;
	/**
	 * Diffserv code point to be used for outgoing SIP signaling packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscPMark = 0L;
	/**
	 * VLAN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANIDMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDMark = -1;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetPriorityMark = -1;
	/**
	 * URI of the network conference bridge for the multiway conference call service.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConferenceCallDomainURI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String conferenceCallDomainURI;
	/**
	 * In case of a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER request, the CPE shall send REGISTER using credentials. If the second response is a new 401 (Unauthorized) or a 407 (Proxy Authentication Required) with stale=false or no stale value, the CPE shall re-init registration cycle after expiration of this timer (in seconds). If stale=true, the CPE shall send REGISTER using credentials.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerLoginRejected")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long timerLoginRejected;
	/**
	 * If {{true}}, no retry after a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER until power cycle or credentials have been changed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NoLoginRetry")
	@CWMPParameter(access = "readWrite")
	public Boolean nologinRetry;
	/**
	 * In case of no response to a REGISTER request, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds).

In case of other response, the CPE shall wait for expiration of this timer before sending a new REGISTER request.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerRegistrationFailed")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long timerRegistrationFailed;
	/**
	 * When starting a MWI subscription, on response of a SUBSCRIBE request : in case of no response or other response than 200 or 423, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds) before sending a new SUBSCRIBE request.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimerSubscriptionFailed")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long timerSubscriptionFailed;
	/**
	 * The number of registration timeouts when trying to register the server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UnansweredRegistrationAttempts")
	public Long unansweredRegistrationAttempts;
	/**
	 * VoIP profile to use with this {{object}}.

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
	/**
	 * Limit on the number of simultaneous voice sessions across all {{object|.SIP.Client}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessions")
	@CWMPParameter(access = "readWrite")
	public Long maxSessions = 0L;
	/**
	 * Table of Fully Qualified Domain Names for this {{object|#}} instance in order to connect to the SIP server as described in {{bibref|RFC2782}}.
	 */
	@XmlElementWrapper(name = "FQDNServers")
	@XmlElement(name = "FQDNServer")
	@CWMPParameter(access = "readWrite")
	public Collection<FQDNServer> fqdNServers;
	/**
	 * Table to specify the SIP events to which the CPE MUST subscribe.
	 */
	@XmlElementWrapper(name = "EventSubscribes")
	@XmlElement(name = "EventSubscribe")
	@CWMPParameter(access = "readWrite")
	public Collection<EventSubscribe> eventSubscribes;
	/**
	 * Each entry in this table specifies the tone and message to be provided to the user for a particular SIP response received (normally 4xx and 5xx).
	 */
	@XmlElementWrapper(name = "ResponseMaps")
	@XmlElement(name = "ResponseMap")
	@CWMPParameter(access = "readWrite")
	public Collection<ResponseMap> responseMaps;

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
	 * Get the host name or IP address of the SIP proxy server.

If not {{empty}}, all SIP signaling traffic MUST be sent to the host indicated by this parameter and the port indicated by {{param|ProxyServerPort}} unless {{param|OutboundProxy}} is not {{empty}} or a different route was discovered during normal SIP routing operations.

Regardless of which host the traffic gets sent to ({{param}} or {{param|OutboundProxy}}), the value of this parameter (unless {{empty}}) MUST be used to derive the URI placed into the SIP Route header field of all requests originated by this end-point, unless a different proxy host was discovered dynamically during normal SIP routing operations.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProxyServer() {
		return proxyServer;
	}

	/**
	 * Set the host name or IP address of the SIP proxy server.

If not {{empty}}, all SIP signaling traffic MUST be sent to the host indicated by this parameter and the port indicated by {{param|ProxyServerPort}} unless {{param|OutboundProxy}} is not {{empty}} or a different route was discovered during normal SIP routing operations.

Regardless of which host the traffic gets sent to ({{param}} or {{param|OutboundProxy}}), the value of this parameter (unless {{empty}}) MUST be used to derive the URI placed into the SIP Route header field of all requests originated by this end-point, unless a different proxy host was discovered dynamically during normal SIP routing operations.
	 *
	 * @since 2.0
	 * @param proxyServer the input value
	 */
	public void  setProxyServer(String proxyServer) {
		this.proxyServer = proxyServer;
	}

	/**
	 * Set the host name or IP address of the SIP proxy server.

If not {{empty}}, all SIP signaling traffic MUST be sent to the host indicated by this parameter and the port indicated by {{param|ProxyServerPort}} unless {{param|OutboundProxy}} is not {{empty}} or a different route was discovered during normal SIP routing operations.

Regardless of which host the traffic gets sent to ({{param}} or {{param|OutboundProxy}}), the value of this parameter (unless {{empty}}) MUST be used to derive the URI placed into the SIP Route header field of all requests originated by this end-point, unless a different proxy host was discovered dynamically during normal SIP routing operations.
	 *
	 * @since 2.0
	 * @param proxyServer the input value
	 * @return this instance
	 */
	public Network withProxyServer(String proxyServer) {
		this.proxyServer = proxyServer;
		return this;
	}

	/**
	 * Get the destination port to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getProxyServerPort() {
		return proxyServerPort;
	}

	/**
	 * Set the destination port to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 * @param proxyServerPort the input value
	 */
	public void  setProxyServerPort(Long proxyServerPort) {
		this.proxyServerPort = proxyServerPort;
	}

	/**
	 * Set the destination port to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 * @param proxyServerPort the input value
	 * @return this instance
	 */
	public Network withProxyServerPort(Long proxyServerPort) {
		this.proxyServerPort = proxyServerPort;
		return this;
	}

	/**
	 * Get the transport protocol to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProxyServerTransport() {
		return proxyServerTransport;
	}

	/**
	 * Set the transport protocol to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 * @param proxyServerTransport the input value
	 */
	public void  setProxyServerTransport(String proxyServerTransport) {
		this.proxyServerTransport = proxyServerTransport;
	}

	/**
	 * Set the transport protocol to be used in connecting to the SIP proxy server.
	 *
	 * @since 2.0
	 * @param proxyServerTransport the input value
	 * @return this instance
	 */
	public Network withProxyServerTransport(String proxyServerTransport) {
		this.proxyServerTransport = proxyServerTransport;
		return this;
	}

	/**
	 * Get the host name or IP address of the SIP registrar server.

If this parameter is {{empty}}, the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegistrarServer() {
		return registrarServer;
	}

	/**
	 * Set the host name or IP address of the SIP registrar server.

If this parameter is {{empty}}, the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @param registrarServer the input value
	 */
	public void  setRegistrarServer(String registrarServer) {
		this.registrarServer = registrarServer;
	}

	/**
	 * Set the host name or IP address of the SIP registrar server.

If this parameter is {{empty}}, the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @param registrarServer the input value
	 * @return this instance
	 */
	public Network withRegistrarServer(String registrarServer) {
		this.registrarServer = registrarServer;
		return this;
	}

	/**
	 * Get the destination port to be used in connecting to the SIP registrar server.

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegistrarServerPort() {
		return registrarServerPort;
	}

	/**
	 * Set the destination port to be used in connecting to the SIP registrar server.

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @param registrarServerPort the input value
	 */
	public void  setRegistrarServerPort(Long registrarServerPort) {
		this.registrarServerPort = registrarServerPort;
	}

	/**
	 * Set the destination port to be used in connecting to the SIP registrar server.

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @param registrarServerPort the input value
	 * @return this instance
	 */
	public Network withRegistrarServerPort(Long registrarServerPort) {
		this.registrarServerPort = registrarServerPort;
		return this;
	}

	/**
	 * Get the transport protocol to be used in connecting to the registrar server. {{enum}}

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegistrarServerTransport() {
		return registrarServerTransport;
	}

	/**
	 * Set the transport protocol to be used in connecting to the registrar server. {{enum}}

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @param registrarServerTransport the input value
	 */
	public void  setRegistrarServerTransport(String registrarServerTransport) {
		this.registrarServerTransport = registrarServerTransport;
	}

	/**
	 * Set the transport protocol to be used in connecting to the registrar server. {{enum}}

If {{param|RegistrarServer}} is empty the CPE MUST obtain all of the registrar server configuration information, including host name or IP address, port, and transport protocol, from the values in {{param|ProxyServer}}, {{param|ProxyServerPort}}, and {{param|ProxyServerTransport}}.
	 *
	 * @since 2.0
	 * @param registrarServerTransport the input value
	 * @return this instance
	 */
	public Network withRegistrarServerTransport(String registrarServerTransport) {
		this.registrarServerTransport = registrarServerTransport;
		return this;
	}

	/**
	 * Get the if non-empty this {{param}} is used by the devices in a DNS SRV request to provide FQDNs {{object|FQDNServer.{i}.}} for SIP Server connections.

{{bibref|RFC2782}} ''Clients ask for a specific service/protocol for a specific domain (the word domain is used here in the strict RFC 1034 sense), and get back the names of any available servers.''
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getServerDomain() {
		return serverDomain;
	}

	/**
	 * Set the if non-empty this {{param}} is used by the devices in a DNS SRV request to provide FQDNs {{object|FQDNServer.{i}.}} for SIP Server connections.

{{bibref|RFC2782}} ''Clients ask for a specific service/protocol for a specific domain (the word domain is used here in the strict RFC 1034 sense), and get back the names of any available servers.''
	 *
	 * @since 2.0
	 * @param serverDomain the input value
	 */
	public void  setServerDomain(String serverDomain) {
		this.serverDomain = serverDomain;
	}

	/**
	 * Set the if non-empty this {{param}} is used by the devices in a DNS SRV request to provide FQDNs {{object|FQDNServer.{i}.}} for SIP Server connections.

{{bibref|RFC2782}} ''Clients ask for a specific service/protocol for a specific domain (the word domain is used here in the strict RFC 1034 sense), and get back the names of any available servers.''
	 *
	 * @since 2.0
	 * @param serverDomain the input value
	 * @return this instance
	 */
	public Network withServerDomain(String serverDomain) {
		this.serverDomain = serverDomain;
		return this;
	}

	/**
	 * Get the domain used by {{object|#.Client}} objects that reference this {{object}} instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getChosenDomain() {
		return chosenDomain;
	}

	/**
	 * Set the domain used by {{object|#.Client}} objects that reference this {{object}} instance.
	 *
	 * @since 2.0
	 * @param chosenDomain the input value
	 */
	public void  setChosenDomain(String chosenDomain) {
		this.chosenDomain = chosenDomain;
	}

	/**
	 * Set the domain used by {{object|#.Client}} objects that reference this {{object}} instance.
	 *
	 * @since 2.0
	 * @param chosenDomain the input value
	 * @return this instance
	 */
	public Network withChosenDomain(String chosenDomain) {
		this.chosenDomain = chosenDomain;
		return this;
	}

	/**
	 * Get the ip address used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getChosenIPAddress() {
		return chosenIPAddress;
	}

	/**
	 * Set the ip address used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 * @param chosenIPAddress the input value
	 */
	public void  setChosenIPAddress(IPAddress chosenIPAddress) {
		this.chosenIPAddress = chosenIPAddress;
	}

	/**
	 * Set the ip address used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 * @param chosenIPAddress the input value
	 * @return this instance
	 */
	public Network withChosenIPAddress(IPAddress chosenIPAddress) {
		this.chosenIPAddress = chosenIPAddress;
		return this;
	}

	/**
	 * Get the port used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getChosenPort() {
		return chosenPort;
	}

	/**
	 * Set the port used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 * @param chosenPort the input value
	 */
	public void  setChosenPort(Long chosenPort) {
		this.chosenPort = chosenPort;
	}

	/**
	 * Set the port used to reach the {{param|ChosenDomain}}.
	 *
	 * @since 2.0
	 * @param chosenPort the input value
	 * @return this instance
	 */
	public Network withChosenPort(Long chosenPort) {
		this.chosenPort = chosenPort;
		return this;
	}

	/**
	 * Get the cpe domain string. If {{empty}}, the CPE SHOULD use its IP address as the domain.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUserAgentDomain() {
		return userAgentDomain;
	}

	/**
	 * Set the cpe domain string. If {{empty}}, the CPE SHOULD use its IP address as the domain.
	 *
	 * @since 2.0
	 * @param userAgentDomain the input value
	 */
	public void  setUserAgentDomain(String userAgentDomain) {
		this.userAgentDomain = userAgentDomain;
	}

	/**
	 * Set the cpe domain string. If {{empty}}, the CPE SHOULD use its IP address as the domain.
	 *
	 * @since 2.0
	 * @param userAgentDomain the input value
	 * @return this instance
	 */
	public Network withUserAgentDomain(String userAgentDomain) {
		this.userAgentDomain = userAgentDomain;
		return this;
	}

	/**
	 * Get the port used for incoming call control signaling.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUserAgentPort() {
		return userAgentPort;
	}

	/**
	 * Set the port used for incoming call control signaling.
	 *
	 * @since 2.0
	 * @param userAgentPort the input value
	 */
	public void  setUserAgentPort(Long userAgentPort) {
		this.userAgentPort = userAgentPort;
	}

	/**
	 * Set the port used for incoming call control signaling.
	 *
	 * @since 2.0
	 * @param userAgentPort the input value
	 * @return this instance
	 */
	public Network withUserAgentPort(Long userAgentPort) {
		this.userAgentPort = userAgentPort;
		return this;
	}

	/**
	 * Get the transport protocol to be used for incoming call control signaling.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUserAgentTransport() {
		return userAgentTransport;
	}

	/**
	 * Set the transport protocol to be used for incoming call control signaling.
	 *
	 * @since 2.0
	 * @param userAgentTransport the input value
	 */
	public void  setUserAgentTransport(String userAgentTransport) {
		this.userAgentTransport = userAgentTransport;
	}

	/**
	 * Set the transport protocol to be used for incoming call control signaling.
	 *
	 * @since 2.0
	 * @param userAgentTransport the input value
	 * @return this instance
	 */
	public Network withUserAgentTransport(String userAgentTransport) {
		this.userAgentTransport = userAgentTransport;
		return this;
	}

	/**
	 * Get the Fully Qualified Domain Name (FQDN) or IP Address of the outbound proxy. If the value is not {{empty}}, the SIP endpoint MUST send all SIP traffic (requests and responses) to the host indicated by this parameter and the port indicated by {{param|OutboundProxyPort}}. This MUST be done regardless of the routes discovered using normal SIP operations, including use of Route headers initialized from Service-Route and Record-Route headers previously received. {{param}} is NOT used to generate the URI placed into the Route header of any requests.

When {{param}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOutboundProxy() {
		return outboundProxy;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) or IP Address of the outbound proxy. If the value is not {{empty}}, the SIP endpoint MUST send all SIP traffic (requests and responses) to the host indicated by this parameter and the port indicated by {{param|OutboundProxyPort}}. This MUST be done regardless of the routes discovered using normal SIP operations, including use of Route headers initialized from Service-Route and Record-Route headers previously received. {{param}} is NOT used to generate the URI placed into the Route header of any requests.

When {{param}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 * @param outboundProxy the input value
	 */
	public void  setOutboundProxy(String outboundProxy) {
		this.outboundProxy = outboundProxy;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) or IP Address of the outbound proxy. If the value is not {{empty}}, the SIP endpoint MUST send all SIP traffic (requests and responses) to the host indicated by this parameter and the port indicated by {{param|OutboundProxyPort}}. This MUST be done regardless of the routes discovered using normal SIP operations, including use of Route headers initialized from Service-Route and Record-Route headers previously received. {{param}} is NOT used to generate the URI placed into the Route header of any requests.

When {{param}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 * @param outboundProxy the input value
	 * @return this instance
	 */
	public Network withOutboundProxy(String outboundProxy) {
		this.outboundProxy = outboundProxy;
		return this;
	}

	/**
	 * Get the IP address of the outbound proxy.

This parameter can be assigned statically (e.g. present in the factory default configuration or set by the ACS via {{param|OutboundProxy}}) or assigned dynamically (via DHCP).

When {{param|OutboundProxy}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getOutboundProxyResolvedAddress() {
		return outboundProxyResolvedAddress;
	}

	/**
	 * Set the IP address of the outbound proxy.

This parameter can be assigned statically (e.g. present in the factory default configuration or set by the ACS via {{param|OutboundProxy}}) or assigned dynamically (via DHCP).

When {{param|OutboundProxy}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param}}.
	 *
	 * @since 2.0
	 * @param outboundProxyResolvedAddress the input value
	 */
	public void  setOutboundProxyResolvedAddress(IPAddress outboundProxyResolvedAddress) {
		this.outboundProxyResolvedAddress = outboundProxyResolvedAddress;
	}

	/**
	 * Set the IP address of the outbound proxy.

This parameter can be assigned statically (e.g. present in the factory default configuration or set by the ACS via {{param|OutboundProxy}}) or assigned dynamically (via DHCP).

When {{param|OutboundProxy}} is assigned, the name is looked up (resolved) and the corresponding address is set in {{param}}.
	 *
	 * @since 2.0
	 * @param outboundProxyResolvedAddress the input value
	 * @return this instance
	 */
	public Network withOutboundProxyResolvedAddress(IPAddress outboundProxyResolvedAddress) {
		this.outboundProxyResolvedAddress = outboundProxyResolvedAddress;
		return this;
	}

	/**
	 * Get the indicates whether it is the static configuration or the DHCP configuration that is actually used for {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOutboundProxyPrecedence() {
		return outboundProxyPrecedence;
	}

	/**
	 * Set the indicates whether it is the static configuration or the DHCP configuration that is actually used for {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 * @param outboundProxyPrecedence the input value
	 */
	public void  setOutboundProxyPrecedence(String outboundProxyPrecedence) {
		this.outboundProxyPrecedence = outboundProxyPrecedence;
	}

	/**
	 * Set the indicates whether it is the static configuration or the DHCP configuration that is actually used for {{param|OutboundProxyResolvedAddress}}.
	 *
	 * @since 2.0
	 * @param outboundProxyPrecedence the input value
	 * @return this instance
	 */
	public Network withOutboundProxyPrecedence(String outboundProxyPrecedence) {
		this.outboundProxyPrecedence = outboundProxyPrecedence;
		return this;
	}

	/**
	 * Get the destination port to be used in connecting to the outbound proxy.  This parameter MUST be ignored unless the value of {{param|OutboundProxy}} is non-empty.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutboundProxyPort() {
		return outboundProxyPort;
	}

	/**
	 * Set the destination port to be used in connecting to the outbound proxy.  This parameter MUST be ignored unless the value of {{param|OutboundProxy}} is non-empty.
	 *
	 * @since 2.0
	 * @param outboundProxyPort the input value
	 */
	public void  setOutboundProxyPort(Long outboundProxyPort) {
		this.outboundProxyPort = outboundProxyPort;
	}

	/**
	 * Set the destination port to be used in connecting to the outbound proxy.  This parameter MUST be ignored unless the value of {{param|OutboundProxy}} is non-empty.
	 *
	 * @since 2.0
	 * @param outboundProxyPort the input value
	 * @return this instance
	 */
	public Network withOutboundProxyPort(Long outboundProxyPort) {
		this.outboundProxyPort = outboundProxyPort;
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
	 * Get the text string to be used in the Organization header.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * Set the text string to be used in the Organization header.
	 *
	 * @since 2.0
	 * @param organization the input value
	 */
	public void  setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * Set the text string to be used in the Organization header.
	 *
	 * @since 2.0
	 * @param organization the input value
	 * @return this instance
	 */
	public Network withOrganization(String organization) {
		this.organization = organization;
		return this;
	}

	/**
	 * Get the duration, in seconds, after which the user agent needs to register again.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegistrationPeriod() {
		return registrationPeriod;
	}

	/**
	 * Set the duration, in seconds, after which the user agent needs to register again.
	 *
	 * @since 2.0
	 * @param registrationPeriod the input value
	 */
	public void  setRegistrationPeriod(Long registrationPeriod) {
		this.registrationPeriod = registrationPeriod;
	}

	/**
	 * Set the duration, in seconds, after which the user agent needs to register again.
	 *
	 * @since 2.0
	 * @param registrationPeriod the input value
	 * @return this instance
	 */
	public Network withRegistrationPeriod(Long registrationPeriod) {
		this.registrationPeriod = registrationPeriod;
		return this;
	}

	/**
	 * Get the realm for authentication with the specified values of {{param|#.Client.{i}.AuthUserName}} and {{param|#.Client.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRealm() {
		return realm;
	}

	/**
	 * Set the realm for authentication with the specified values of {{param|#.Client.{i}.AuthUserName}} and {{param|#.Client.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 * @param realm the input value
	 */
	public void  setRealm(String realm) {
		this.realm = realm;
	}

	/**
	 * Set the realm for authentication with the specified values of {{param|#.Client.{i}.AuthUserName}} and {{param|#.Client.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 * @param realm the input value
	 * @return this instance
	 */
	public Network withRealm(String realm) {
		this.realm = realm;
		return this;
	}

	/**
	 * Get the value of SIP timer T1, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerT1() {
		return timerT1;
	}

	/**
	 * Set the value of SIP timer T1, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerT1 the input value
	 */
	public void  setTimerT1(Long timerT1) {
		this.timerT1 = timerT1;
	}

	/**
	 * Set the value of SIP timer T1, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerT1 the input value
	 * @return this instance
	 */
	public Network withTimerT1(Long timerT1) {
		this.timerT1 = timerT1;
		return this;
	}

	/**
	 * Get the value of SIP timer T2, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerT2() {
		return timerT2;
	}

	/**
	 * Set the value of SIP timer T2, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerT2 the input value
	 */
	public void  setTimerT2(Long timerT2) {
		this.timerT2 = timerT2;
	}

	/**
	 * Set the value of SIP timer T2, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerT2 the input value
	 * @return this instance
	 */
	public Network withTimerT2(Long timerT2) {
		this.timerT2 = timerT2;
		return this;
	}

	/**
	 * Get the value of SIP timer T4, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerT4() {
		return timerT4;
	}

	/**
	 * Set the value of SIP timer T4, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerT4 the input value
	 */
	public void  setTimerT4(Long timerT4) {
		this.timerT4 = timerT4;
	}

	/**
	 * Set the value of SIP timer T4, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerT4 the input value
	 * @return this instance
	 */
	public Network withTimerT4(Long timerT4) {
		this.timerT4 = timerT4;
		return this;
	}

	/**
	 * Get the value of SIP timer A, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerA() {
		return timerA;
	}

	/**
	 * Set the value of SIP timer A, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerA the input value
	 */
	public void  setTimerA(Long timerA) {
		this.timerA = timerA;
	}

	/**
	 * Set the value of SIP timer A, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerA the input value
	 * @return this instance
	 */
	public Network withTimerA(Long timerA) {
		this.timerA = timerA;
		return this;
	}

	/**
	 * Get the value of SIP timer B, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerB() {
		return timerB;
	}

	/**
	 * Set the value of SIP timer B, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerB the input value
	 */
	public void  setTimerB(Long timerB) {
		this.timerB = timerB;
	}

	/**
	 * Set the value of SIP timer B, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerB the input value
	 * @return this instance
	 */
	public Network withTimerB(Long timerB) {
		this.timerB = timerB;
		return this;
	}

	/**
	 * Get the value of SIP timer C, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerC() {
		return timerC;
	}

	/**
	 * Set the value of SIP timer C, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerC the input value
	 */
	public void  setTimerC(Long timerC) {
		this.timerC = timerC;
	}

	/**
	 * Set the value of SIP timer C, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerC the input value
	 * @return this instance
	 */
	public Network withTimerC(Long timerC) {
		this.timerC = timerC;
		return this;
	}

	/**
	 * Get the value of SIP timer D, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerD() {
		return timerD;
	}

	/**
	 * Set the value of SIP timer D, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerD the input value
	 */
	public void  setTimerD(Long timerD) {
		this.timerD = timerD;
	}

	/**
	 * Set the value of SIP timer D, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerD the input value
	 * @return this instance
	 */
	public Network withTimerD(Long timerD) {
		this.timerD = timerD;
		return this;
	}

	/**
	 * Get the value of SIP timer E, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerE() {
		return timerE;
	}

	/**
	 * Set the value of SIP timer E, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerE the input value
	 */
	public void  setTimerE(Long timerE) {
		this.timerE = timerE;
	}

	/**
	 * Set the value of SIP timer E, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerE the input value
	 * @return this instance
	 */
	public Network withTimerE(Long timerE) {
		this.timerE = timerE;
		return this;
	}

	/**
	 * Get the value of SIP timer F, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerF() {
		return timerF;
	}

	/**
	 * Set the value of SIP timer F, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerF the input value
	 */
	public void  setTimerF(Long timerF) {
		this.timerF = timerF;
	}

	/**
	 * Set the value of SIP timer F, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerF the input value
	 * @return this instance
	 */
	public Network withTimerF(Long timerF) {
		this.timerF = timerF;
		return this;
	}

	/**
	 * Get the value of SIP timer G, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerG() {
		return timerG;
	}

	/**
	 * Set the value of SIP timer G, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerG the input value
	 */
	public void  setTimerG(Long timerG) {
		this.timerG = timerG;
	}

	/**
	 * Set the value of SIP timer G, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerG the input value
	 * @return this instance
	 */
	public Network withTimerG(Long timerG) {
		this.timerG = timerG;
		return this;
	}

	/**
	 * Get the value of SIP timer H, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerH() {
		return timerH;
	}

	/**
	 * Set the value of SIP timer H, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerH the input value
	 */
	public void  setTimerH(Long timerH) {
		this.timerH = timerH;
	}

	/**
	 * Set the value of SIP timer H, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerH the input value
	 * @return this instance
	 */
	public Network withTimerH(Long timerH) {
		this.timerH = timerH;
		return this;
	}

	/**
	 * Get the value of SIP timer I, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerI() {
		return timerI;
	}

	/**
	 * Set the value of SIP timer I, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerI the input value
	 */
	public void  setTimerI(Long timerI) {
		this.timerI = timerI;
	}

	/**
	 * Set the value of SIP timer I, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerI the input value
	 * @return this instance
	 */
	public Network withTimerI(Long timerI) {
		this.timerI = timerI;
		return this;
	}

	/**
	 * Get the value of SIP timer J, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerJ() {
		return timerJ;
	}

	/**
	 * Set the value of SIP timer J, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerJ the input value
	 */
	public void  setTimerJ(Long timerJ) {
		this.timerJ = timerJ;
	}

	/**
	 * Set the value of SIP timer J, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerJ the input value
	 * @return this instance
	 */
	public Network withTimerJ(Long timerJ) {
		this.timerJ = timerJ;
		return this;
	}

	/**
	 * Get the value of SIP timer K, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerK() {
		return timerK;
	}

	/**
	 * Set the value of SIP timer K, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerK the input value
	 */
	public void  setTimerK(Long timerK) {
		this.timerK = timerK;
	}

	/**
	 * Set the value of SIP timer K, in milliseconds, as defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 * @param timerK the input value
	 * @return this instance
	 */
	public Network withTimerK(Long timerK) {
		this.timerK = timerK;
		return this;
	}

	/**
	 * Get the invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInviteExpires() {
		return inviteExpires;
	}

	/**
	 * Set the invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @param inviteExpires the input value
	 */
	public void  setInviteExpires(Long inviteExpires) {
		this.inviteExpires = inviteExpires;
	}

	/**
	 * Set the invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @param inviteExpires the input value
	 * @return this instance
	 */
	public Network withInviteExpires(Long inviteExpires) {
		this.inviteExpires = inviteExpires;
		return this;
	}

	/**
	 * Get the re-invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReinviteExpires() {
		return reinviteExpires;
	}

	/**
	 * Set the re-invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @param reinviteExpires the input value
	 */
	public void  setReinviteExpires(Long reinviteExpires) {
		this.reinviteExpires = reinviteExpires;
	}

	/**
	 * Set the re-invite request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @param reinviteExpires the input value
	 * @return this instance
	 */
	public Network withReinviteExpires(Long reinviteExpires) {
		this.reinviteExpires = reinviteExpires;
		return this;
	}

	/**
	 * Get the register request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegisterExpires() {
		return registerExpires;
	}

	/**
	 * Set the register request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @param registerExpires the input value
	 */
	public void  setRegisterExpires(Long registerExpires) {
		this.registerExpires = registerExpires;
	}

	/**
	 * Set the register request Expires header value, in seconds.
	 *
	 * @since 2.0
	 * @param registerExpires the input value
	 * @return this instance
	 */
	public Network withRegisterExpires(Long registerExpires) {
		this.registerExpires = registerExpires;
		return this;
	}

	/**
	 * Get the register retry interval, in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegisterRetryInterval() {
		return registerRetryInterval;
	}

	/**
	 * Set the register retry interval, in seconds.
	 *
	 * @since 2.0
	 * @param registerRetryInterval the input value
	 */
	public void  setRegisterRetryInterval(Long registerRetryInterval) {
		this.registerRetryInterval = registerRetryInterval;
	}

	/**
	 * Set the register retry interval, in seconds.
	 *
	 * @since 2.0
	 * @param registerRetryInterval the input value
	 * @return this instance
	 */
	public Network withRegisterRetryInterval(Long registerRetryInterval) {
		this.registerRetryInterval = registerRetryInterval;
		return this;
	}

	/**
	 * Get applicable inbound authentication method, if any.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInboundAuth() {
		return inboundAuth;
	}

	/**
	 * Set applicable inbound authentication method, if any.
	 *
	 * @since 2.0
	 * @param inboundAuth the input value
	 */
	public void  setInboundAuth(String inboundAuth) {
		this.inboundAuth = inboundAuth;
	}

	/**
	 * Set applicable inbound authentication method, if any.
	 *
	 * @since 2.0
	 * @param inboundAuth the input value
	 * @return this instance
	 */
	public Network withInboundAuth(String inboundAuth) {
		this.inboundAuth = inboundAuth;
		return this;
	}

	/**
	 * Get the if inbound authentication is used, the username credentials.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInboundAuthUsername() {
		return inboundAuthUsername;
	}

	/**
	 * Set the if inbound authentication is used, the username credentials.
	 *
	 * @since 2.0
	 * @param inboundAuthUsername the input value
	 */
	public void  setInboundAuthUsername(String inboundAuthUsername) {
		this.inboundAuthUsername = inboundAuthUsername;
	}

	/**
	 * Set the if inbound authentication is used, the username credentials.
	 *
	 * @since 2.0
	 * @param inboundAuthUsername the input value
	 * @return this instance
	 */
	public Network withInboundAuthUsername(String inboundAuthUsername) {
		this.inboundAuthUsername = inboundAuthUsername;
		return this;
	}

	/**
	 * Get the if inbound authentication is used, the password credentials.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInboundAuthPassword() {
		return inboundAuthPassword;
	}

	/**
	 * Set the if inbound authentication is used, the password credentials.
	 *
	 * @since 2.0
	 * @param inboundAuthPassword the input value
	 */
	public void  setInboundAuthPassword(String inboundAuthPassword) {
		this.inboundAuthPassword = inboundAuthPassword;
	}

	/**
	 * Set the if inbound authentication is used, the password credentials.
	 *
	 * @since 2.0
	 * @param inboundAuthPassword the input value
	 * @return this instance
	 */
	public Network withInboundAuthPassword(String inboundAuthPassword) {
		this.inboundAuthPassword = inboundAuthPassword;
		return this;
	}

	/**
	 * Get the when {{true}}, in the SDP included in an OK response to an Invite, the first listed codec MUST be the highest priority codec among those offered in the Invite, based on the priorities specified in {{param|CodecList}}. The list of codecs in the SDP MAY also include other lower priority codecs.

When {{false}}, there is no specific requirement for choosing the codecs listed in the SDP included in an OK response.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUseCodecPriorityInSDPResponse() {
		return useCodecPriorityInSDPResponse;
	}

	/**
	 * Set the when {{true}}, in the SDP included in an OK response to an Invite, the first listed codec MUST be the highest priority codec among those offered in the Invite, based on the priorities specified in {{param|CodecList}}. The list of codecs in the SDP MAY also include other lower priority codecs.

When {{false}}, there is no specific requirement for choosing the codecs listed in the SDP included in an OK response.
	 *
	 * @since 2.0
	 * @param useCodecPriorityInSDPResponse the input value
	 */
	public void  setUseCodecPriorityInSDPResponse(Boolean useCodecPriorityInSDPResponse) {
		this.useCodecPriorityInSDPResponse = useCodecPriorityInSDPResponse;
	}

	/**
	 * Set the when {{true}}, in the SDP included in an OK response to an Invite, the first listed codec MUST be the highest priority codec among those offered in the Invite, based on the priorities specified in {{param|CodecList}}. The list of codecs in the SDP MAY also include other lower priority codecs.

When {{false}}, there is no specific requirement for choosing the codecs listed in the SDP included in an OK response.
	 *
	 * @since 2.0
	 * @param useCodecPriorityInSDPResponse the input value
	 * @return this instance
	 */
	public Network withUseCodecPriorityInSDPResponse(Boolean useCodecPriorityInSDPResponse) {
		this.useCodecPriorityInSDPResponse = useCodecPriorityInSDPResponse;
		return this;
	}

	/**
	 * Get the diffserv code point to be used for outgoing SIP signaling packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDscPMark() {
		return dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing SIP signaling packets.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 */
	public void  setDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing SIP signaling packets.
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
	 * Get the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getVlaNIDMark() {
		return vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param vlaNIDMark the input value
	 */
	public void  setVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

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
	 * Get the ethernet priority code (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} are greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing SIP signaling packets for this network.  A value of -1 indicates the default value is to be used.

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
	 * Get the uri of the network conference bridge for the multiway conference call service.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getConferenceCallDomainURI() {
		return conferenceCallDomainURI;
	}

	/**
	 * Set the uri of the network conference bridge for the multiway conference call service.
	 *
	 * @since 2.0
	 * @param conferenceCallDomainURI the input value
	 */
	public void  setConferenceCallDomainURI(String conferenceCallDomainURI) {
		this.conferenceCallDomainURI = conferenceCallDomainURI;
	}

	/**
	 * Set the uri of the network conference bridge for the multiway conference call service.
	 *
	 * @since 2.0
	 * @param conferenceCallDomainURI the input value
	 * @return this instance
	 */
	public Network withConferenceCallDomainURI(String conferenceCallDomainURI) {
		this.conferenceCallDomainURI = conferenceCallDomainURI;
		return this;
	}

	/**
	 * Get the in case of a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER request, the CPE shall send REGISTER using credentials. If the second response is a new 401 (Unauthorized) or a 407 (Proxy Authentication Required) with stale=false or no stale value, the CPE shall re-init registration cycle after expiration of this timer (in seconds). If stale=true, the CPE shall send REGISTER using credentials.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerLoginRejected() {
		return timerLoginRejected;
	}

	/**
	 * Set the in case of a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER request, the CPE shall send REGISTER using credentials. If the second response is a new 401 (Unauthorized) or a 407 (Proxy Authentication Required) with stale=false or no stale value, the CPE shall re-init registration cycle after expiration of this timer (in seconds). If stale=true, the CPE shall send REGISTER using credentials.
	 *
	 * @since 2.0
	 * @param timerLoginRejected the input value
	 */
	public void  setTimerLoginRejected(Long timerLoginRejected) {
		this.timerLoginRejected = timerLoginRejected;
	}

	/**
	 * Set the in case of a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER request, the CPE shall send REGISTER using credentials. If the second response is a new 401 (Unauthorized) or a 407 (Proxy Authentication Required) with stale=false or no stale value, the CPE shall re-init registration cycle after expiration of this timer (in seconds). If stale=true, the CPE shall send REGISTER using credentials.
	 *
	 * @since 2.0
	 * @param timerLoginRejected the input value
	 * @return this instance
	 */
	public Network withTimerLoginRejected(Long timerLoginRejected) {
		this.timerLoginRejected = timerLoginRejected;
		return this;
	}

	/**
	 * Get the if {{true}}, no retry after a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER until power cycle or credentials have been changed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNologinRetry() {
		return nologinRetry;
	}

	/**
	 * Set the if {{true}}, no retry after a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER until power cycle or credentials have been changed.
	 *
	 * @since 2.0
	 * @param nologinRetry the input value
	 */
	public void  setNologinRetry(Boolean nologinRetry) {
		this.nologinRetry = nologinRetry;
	}

	/**
	 * Set the if {{true}}, no retry after a 401 (Unauthorized) or a 407 (Proxy Authentication Required) response to a REGISTER until power cycle or credentials have been changed.
	 *
	 * @since 2.0
	 * @param nologinRetry the input value
	 * @return this instance
	 */
	public Network withNologinRetry(Boolean nologinRetry) {
		this.nologinRetry = nologinRetry;
		return this;
	}

	/**
	 * Get the in case of no response to a REGISTER request, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds).

In case of other response, the CPE shall wait for expiration of this timer before sending a new REGISTER request.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerRegistrationFailed() {
		return timerRegistrationFailed;
	}

	/**
	 * Set the in case of no response to a REGISTER request, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds).

In case of other response, the CPE shall wait for expiration of this timer before sending a new REGISTER request.
	 *
	 * @since 2.0
	 * @param timerRegistrationFailed the input value
	 */
	public void  setTimerRegistrationFailed(Long timerRegistrationFailed) {
		this.timerRegistrationFailed = timerRegistrationFailed;
	}

	/**
	 * Set the in case of no response to a REGISTER request, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds).

In case of other response, the CPE shall wait for expiration of this timer before sending a new REGISTER request.
	 *
	 * @since 2.0
	 * @param timerRegistrationFailed the input value
	 * @return this instance
	 */
	public Network withTimerRegistrationFailed(Long timerRegistrationFailed) {
		this.timerRegistrationFailed = timerRegistrationFailed;
		return this;
	}

	/**
	 * Get the when starting a MWI subscription, on response of a SUBSCRIBE request : in case of no response or other response than 200 or 423, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds) before sending a new SUBSCRIBE request.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimerSubscriptionFailed() {
		return timerSubscriptionFailed;
	}

	/**
	 * Set the when starting a MWI subscription, on response of a SUBSCRIBE request : in case of no response or other response than 200 or 423, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds) before sending a new SUBSCRIBE request.
	 *
	 * @since 2.0
	 * @param timerSubscriptionFailed the input value
	 */
	public void  setTimerSubscriptionFailed(Long timerSubscriptionFailed) {
		this.timerSubscriptionFailed = timerSubscriptionFailed;
	}

	/**
	 * Set the when starting a MWI subscription, on response of a SUBSCRIBE request : in case of no response or other response than 200 or 423, the CPE shall retry according to retransmission algorithm defined in {{bibref|RFC3261}}, then wait for expiration of this timer (in seconds) before sending a new SUBSCRIBE request.
	 *
	 * @since 2.0
	 * @param timerSubscriptionFailed the input value
	 * @return this instance
	 */
	public Network withTimerSubscriptionFailed(Long timerSubscriptionFailed) {
		this.timerSubscriptionFailed = timerSubscriptionFailed;
		return this;
	}

	/**
	 * Get the number of registration timeouts when trying to register the server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUnansweredRegistrationAttempts() {
		return unansweredRegistrationAttempts;
	}

	/**
	 * Set the number of registration timeouts when trying to register the server.
	 *
	 * @since 2.0
	 * @param unansweredRegistrationAttempts the input value
	 */
	public void  setUnansweredRegistrationAttempts(Long unansweredRegistrationAttempts) {
		this.unansweredRegistrationAttempts = unansweredRegistrationAttempts;
	}

	/**
	 * Set the number of registration timeouts when trying to register the server.
	 *
	 * @since 2.0
	 * @param unansweredRegistrationAttempts the input value
	 * @return this instance
	 */
	public Network withUnansweredRegistrationAttempts(Long unansweredRegistrationAttempts) {
		this.unansweredRegistrationAttempts = unansweredRegistrationAttempts;
		return this;
	}

	/**
	 * Get the voiP profile to use with this {{object}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVoiPProfile() {
		return voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this {{object}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 */
	public void  setVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this {{object}}.

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

	/**
	 * Get the limit on the number of simultaneous voice sessions across all {{object|.SIP.Client}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSessions() {
		return maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across all {{object|.SIP.Client}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @param maxSessions the input value
	 */
	public void  setMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across all {{object|.SIP.Client}} referencing this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

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
	 * Get the table of Fully Qualified Domain Names for this {{object|#}} instance in order to connect to the SIP server as described in {{bibref|RFC2782}}.
	 *
	 * @return the value
	 */
	public Collection<FQDNServer> getFqdNServers() {
		if (this.fqdNServers == null){ this.fqdNServers=new ArrayList<>();}
		return fqdNServers;
	}

	/**
	 * Set the table of Fully Qualified Domain Names for this {{object|#}} instance in order to connect to the SIP server as described in {{bibref|RFC2782}}.
	 *
	 * @param fqdNServers the input value
	 */
	public void  setFqdNServers(Collection<FQDNServer> fqdNServers) {
		this.fqdNServers = fqdNServers;
	}

	/**
	 * Set the table of Fully Qualified Domain Names for this {{object|#}} instance in order to connect to the SIP server as described in {{bibref|RFC2782}}.
	 *
	 * @param fqdNServer the input value
	 * @return this instance
	 */
	public Network withFQDNServer(FQDNServer fqdNServer) {
		getFqdNServers().add(fqdNServer);
		return this;
	}

	/**
	 * Get the table to specify the SIP events to which the CPE MUST subscribe.
	 *
	 * @return the value
	 */
	public Collection<EventSubscribe> getEventSubscribes() {
		if (this.eventSubscribes == null){ this.eventSubscribes=new ArrayList<>();}
		return eventSubscribes;
	}

	/**
	 * Set the table to specify the SIP events to which the CPE MUST subscribe.
	 *
	 * @param eventSubscribes the input value
	 */
	public void  setEventSubscribes(Collection<EventSubscribe> eventSubscribes) {
		this.eventSubscribes = eventSubscribes;
	}

	/**
	 * Set the table to specify the SIP events to which the CPE MUST subscribe.
	 *
	 * @param eventSubscribe the input value
	 * @return this instance
	 */
	public Network withEventSubscribe(EventSubscribe eventSubscribe) {
		getEventSubscribes().add(eventSubscribe);
		return this;
	}

	/**
	 * Get the each entry in this table specifies the tone and message to be provided to the user for a particular SIP response received (normally 4xx and 5xx).
	 *
	 * @return the value
	 */
	public Collection<ResponseMap> getResponseMaps() {
		if (this.responseMaps == null){ this.responseMaps=new ArrayList<>();}
		return responseMaps;
	}

	/**
	 * Set the each entry in this table specifies the tone and message to be provided to the user for a particular SIP response received (normally 4xx and 5xx).
	 *
	 * @param responseMaps the input value
	 */
	public void  setResponseMaps(Collection<ResponseMap> responseMaps) {
		this.responseMaps = responseMaps;
	}

	/**
	 * Set the each entry in this table specifies the tone and message to be provided to the user for a particular SIP response received (normally 4xx and 5xx).
	 *
	 * @param responseMap the input value
	 * @return this instance
	 */
	public Network withResponseMap(ResponseMap responseMap) {
		getResponseMaps().add(responseMap);
		return this;
	}

	//</editor-fold>

}