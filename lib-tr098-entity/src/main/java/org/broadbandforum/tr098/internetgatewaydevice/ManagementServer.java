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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.managementserver.AutonomousTransferCompletePolicy;
import org.broadbandforum.tr098.internetgatewaydevice.managementserver.DUStateChangeComplPolicy;
import org.broadbandforum.tr098.internetgatewaydevice.managementserver.EmbeddedDevice;
import org.broadbandforum.tr098.internetgatewaydevice.managementserver.InformParameter;
import org.broadbandforum.tr098.internetgatewaydevice.managementserver.ManageableDevice;
import org.broadbandforum.tr098.internetgatewaydevice.managementserver.StandbyPolicy;
import org.broadbandforum.tr098.internetgatewaydevice.managementserver.VirtualDevice;

	/**
	 * This object contains parameters relating to the CPE's association with an ACS.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.ManagementServer.")
public class ManagementServer {

	/**
	 * Enables and disables the CPE's support for CWMP. 

{{false}} means that CWMP support in the CPE is disabled, in which case the device MUST NOT send any Inform messages to the ACS or accept any Connection Request notifications from the ACS.

{{true}} means that CWMP support on the CPE is enabled.

The factory default value MUST be {{true}}.

The subscriber can re-enable the CPE's CWMP support either by performing a factory reset or by using a LAN-side protocol to change the value of this parameter back to {{true}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EnableCWMP")
	@CWMPParameter(access = "readWrite")
	public Boolean enableCWMP;
	/**
	 * URL, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "URL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String url;
	/**
	 * Username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInformEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean periodicInformEnable;
	/**
	 * The duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInformInterval")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long periodicInformInterval;
	/**
	 * An absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a2|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInformTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime periodicInformTime;
	/**
	 * {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ParameterKey")
	@CWMPParameter(activeNotify = "canDeny", forcedInform = true)
	@Size(max = 32)
	public String parameterKey;
	/**
	 * HTTP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionRequestURL")
	@CWMPParameter(activeNotify = "forceDefaultEnabled", forcedInform = true)
	@Size(max = 256)
	public String connectionRequestURL;
	/**
	 * Username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionRequestUsername")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String connectionRequestUsername;
	/**
	 * Password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionRequestPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String connectionRequestPassword;
	/**
	 * Indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.

Note that an autonomous upgrade (reported via an ''10 AUTONOMOUS TRANSFER COMPLETE'' Inform Event code) SHOULD be regarded as a managed upgade if it is performed according to ACS-specified policy.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpgradesManaged")
	@CWMPParameter(access = "readWrite")
	public Boolean upgradesManaged;
	/**
	 * Present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "KickURL")
	@Size(max = 256)
	public String kickURL;
	/**
	 * Present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownloadProgressURL")
	@Size(max = 256)
	public String downloadProgressURL;
	/**
	 * This parameter is used to control throttling of active notifications sent by the CPE to the ACS.  It defines the minimum number of seconds that the CPE MUST wait since the end of the last session with the ACS before establishing a new session for the purpose of delivering an active notification.

In other words, if CPE needs to establish a new session with the ACS for the sole purpose of delivering an active notification, it MUST delay establishing such a session as needed to ensure that the minimum time since the last session completion has been met.

The time is counted since the last successfully completed session, regardless of whether or not it was used for active notifications or other purposes. However, if connection to the ACS is established for purposes other than just delivering active notifications, including for the purpose of retrying a failed session, such connection MUST NOT be delayed based on this parameter value, and the pending active notifications MUST be communicated during that connection.

The time of the last session completion does not need to be tracked across reboots.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DefaultActiveNotificationThrottle")
	@CWMPParameter(access = "readWrite")
	public Long defaultActiveNotificationThrottle;
	/**
	 * Address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a2|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "UDPConnectionRequestAddress")
	@Size(max = 256)
	public String udpConnectionRequestAddress;
	/**
	 * The minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "UDPConnectionRequestAddressNotificationLimit")
	@CWMPParameter(access = "readWrite")
	public Long udpConnectionRequestAddressNotificationLimit;
	/**
	 * Enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean stuNEnable;
	/**
	 * Host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNServerAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String stuNServerAddress;
	/**
	 * Port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNServerPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long stuNServerPort;
	/**
	 * If not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNUsername")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String stuNUsername;
	/**
	 * The value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String stuNPassword;
	/**
	 * If STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNMaximumKeepAlivePeriod")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer stuNMaximumKeepAlivePeriod;
	/**
	 * If STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "STUNMinimumKeepAlivePeriod")
	@CWMPParameter(access = "readWrite")
	public Long stuNMinimumKeepAlivePeriod;
	/**
	 * When STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "NATDetected")
	public Boolean natDetected;
	/**
	 * Indicates whether or not the Alias-Based Addressing Mechanism is supported.

A {{true}} value indicates that the CPE supports the Alias-Based Addressing Mechanism, as defined in {{bibref|TR-069a4|3.6.1}} and described in {{bibref|TR-069a4|Appendix II}}.
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "AliasBasedAddressing")
	@CWMPParameter(forcedInform = true)
	public Boolean aliasBasedAddressing;
	/**
	 * Instance identification mode as defined in {{bibref|TR-069a4|3.6.1}}. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} is used by the ACS to control whether the CPE will use Instance Numbers or Instance Aliases in returned Path Names.  {{enum}} 

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "InstanceMode")
	@CWMPParameter(access = "readWrite")
	public String instanceMode = "InstanceNumber";
	/**
	 * Enable or disable the Auto-Create Instance Mechanism. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} indicates whether or not the CPE will automatically create instances while processing a SetParameterValues RPC (as defined in {{bibref|TR-069a4|A.3.2.1}}).

*A {{true}} value indicates that the CPE will perform auto-creation of instances when the Alias-Based Addressing Mechanism is used in SetParameterValues RPC.

*A {{false}} value indicates that the CPE will not create new object instances. Instead, it will reject the setting of parameters in unrecognized instances and respond with a fault code.

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "AutoCreateInstances")
	@CWMPParameter(access = "readWrite")
	public Boolean autoCreateInstances = false;
	/**
	 * Configures the first session retry wait interval, in seconds, as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

A value of 5 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param}}  and ({{param}} * {{param|CWMPRetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "CWMPRetryMinimumWaitInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1, max = 65535)
	public Long cwmPRetryMinimumWaitInterval;
	/**
	 * Configures the retry interval multiplier as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

A value of 2000 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param|CWMPRetryMinimumWaitInterval}}  and ({{param|CWMPRetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "CWMPRetryIntervalMultiplier")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1000, max = 65535)
	public Long cwmPRetryIntervalMultiplier;
	/**
	 * The minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "ManageableDeviceNotificationLimit")
	@CWMPParameter(access = "readWrite")
	public Long manageableDeviceNotificationLimit;
	/**
	 * The connection request methods supported by this {{object}}. 

Enumerated value must be one of [HTTP, STUN, XMPP]
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "SupportedConnReqMethods")
	@XmlList
	public Collection<String> supportedConnReqMethods;
	/**
	 * {{reference|the {{object|.XMPP.Connection}} instance that is used for connection requests to this {{object}}}}
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "ConnReqXMPPConnection")
	@CWMPParameter(access = "readWrite")
	public String connReqXMPPConnection;
	/**
	 * When an XMPP Connection Request is sent to a CPE the XMPP IQ Stanza will contian a "from" address that contains the Jabber ID of the initiating entity.

This parameter is a {{list}} Each entry represents a Jabber ID, or address, that is allowed to initiate an XMPP Connection Request.  

Each Jabber ID is allowed to be either a "Full JID" (containing a local-part, domain-part, and resource-part in the following format: "local-part@domain-part/resource-part") or a "Bare JID" (containing a local-part and a domain-part in the following format: "local-part@domain-part").  "Full JID" entries require an exact match whereas "Bare JID" entries are a wildcard match and will match any Jabber ID with the same local-part and domain-part independent of the resource-part.

For example, if {{param}} contained "ACS1@tr069.example.com, ACS2@tr-069.example.com/resource1" then the following incoming "from" addresses would be '''allowed''': 

* "ACS1@tr069.example.com/resource1"

* "ACS1@tr069.example.com/resource2"

* "ACS2@tr069.example.com/resource1"

And the following incoming "from" addresses '''would not be allowed''': 

* "ACS2@tr069.example.com/resource2"

* "ACS@tr069.example.com/resource"  

If this Parameter is {{empty}} then all Jabber IDs are allowed and an XMPP Connection Request can not be deemed invalid due to the "from" address.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "ConnReqAllowedJabberIDs")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> connReqAllowedJabberIDs;
	/**
	 * The value MUST be the value of the {{param|.XMPP.Connection.{i}.JabberID}} contained in the {{object|.XMPP.Connection}} instance referenced by the {{param|ConnReqXMPPConnection}} parameter.  

If the {{param|ConnReqXMPPConnection}} parameter is empty or the {{object|.XMPP.Connection}} instance being reference is disabled, then this value will be empty.  

If the {{object|.XMPP.Connection}} instance being referenced by the {{param|ConnReqXMPPConnection}} parameter is lost ({{param|.XMPP.Connection.{i}.Status}} parameter changes from Enabled to some other value), then the value of this parameter MUST remain unchanged until the connection can be reestablished and a new {{param|.XMPP.Connection.{i}.JabberID}} can be established.  If the new {{param|.XMPP.Connection.{i}.JabberID}} is identical to the existing value, then the value of this parameter MUST NOT be altered and a VALUE CHANGE event MUST NOT be generated.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "ConnReqJabberID")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	public String connReqJabberID;
	/**
	 * Indicates the HTTP Compression mechanism(s) supported by this CPE.  Requirements for the use of HTTP Compression for CWMP can be found in {{bibref|TR-069a5|Section 3.4.7}}. 

Enumerated value must be one of [GZIP, Compress, Deflate]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "HTTPCompressionSupported")
	@XmlList
	public Collection<String> httPCompressionSupported;
	/**
	 * The value of this parameter represents the HTTP Compression mechanism to be used by the CPE when communicating with the ACS.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "HTTPCompression")
	@CWMPParameter(access = "readWrite")
	public String httPCompression = "Disabled";
	/**
	 * Indicates the Lightweight Notification Protocol(s) supported by this CPE.  

Enumerated value must be one of [UDP]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "LightweightNotificationProtocolsSupported")
	@XmlList
	public Collection<String> lightweightNotificationProtocolsSupported;
	/**
	 * The value of this parameter represents the protocol(s) that will be used by the CPE when sending Lightweight Notifications.

{{empty}} means that Lightweight Notifications are disabled, despite any SetParameterAttributes that have been configured on various parameters.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "LightweightNotificationProtocolsUsed")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> lightweightNotificationProtocolsUsed;
	/**
	 * Host name or address to be used when sending the UDP Lightweight Notifications.

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented or is {{empty}}, and UDP Lightweight Notifications are supported, the destination host MUST be the same as the ACS (as contained in the host portion of the {{param|URL}}).
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "UDPLightweightNotificationHost")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String udpLightweightNotificationHost;
	/**
	 * The port number to be used when sending UDP Lightweight Notifications. 

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented and UDP Lightweight Notifications are supported, the destination port MUST be 7547.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "UDPLightweightNotificationPort")
	@CWMPParameter(access = "readWrite")
	public Long udpLightweightNotificationPort;
	/**
	 * Each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a2|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 */
	@XmlElementWrapper(name = "ManageableDevices")
	@XmlElement(name = "ManageableDevice")
	public Collection<ManageableDevice> manageableDevices;
	/**
	 * This object allows configuration of CPE policy for notification of AUTONOMOUS TRANSFER COMPLETE events, defined in {{bibref|TR-069a2}}.

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of file transfers that were not specifically requested by the ACS.
	 */
	@XmlElement(name = "AutonomousTransferCompletePolicy")
	public AutonomousTransferCompletePolicy autonomousTransferCompletePolicy;
	/**
	 * This object allows configuration of CPE policy for notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events defined in {{bibref|TR-069a3}}.  

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of Deployment Unit state changes that were not specifically requested via CWMP.
	 */
	@XmlElement(name = "DUStateChangeComplPolicy")
	public DUStateChangeComplPolicy dustateChangeComplPolicy;
	/**
	 * Each entry in this table represents a distinct Proxied Device that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}} for proxying devices.
	 */
	@XmlElementWrapper(name = "EmbeddedDevices")
	@XmlElement(name = "EmbeddedDevice")
	public Collection<EmbeddedDevice> embeddedDevices;
	/**
	 * Each entry in this table represents a distinct Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}} for proxying devices.
	 */
	@XmlElementWrapper(name = "VirtualDevices")
	@XmlElement(name = "VirtualDevice")
	public Collection<VirtualDevice> virtualDevices;
	/**
	 * Parameters related to CPE behavior when waking up from standby. If this object is supported then the CPE MUST support the requirements of {{bibref|TR-069a5|Annex L}}.

NOTE: "CR", as used in the names and descriptions of the parameters defined in this object, refers to the Connection Request concept defined in TR-069.
	 */
	@XmlElement(name = "StandbyPolicy")
	public StandbyPolicy standbyPolicy;
	/**
	 * This table provides the ACS with the ability to control the Parameters that are delivered by the Inform RPC.

Any Parameter (identified by {{param|ParameterName}}) contained in this table MUST be included within the ParameterList argument of the Inform RPC whenever any Event within the {{param|EventList}} is being delivered. 

This table does not include Forced Inform Parameters, and Forced Inform Parameters are not allowed to be inserted into this table.  Any attempt by an ACS to configure this table to contain a Forced Inform Parameter MUST result in the failure of the SetParameterValues RPC with error code 9007.
	 */
	@XmlElementWrapper(name = "InformParameters")
	@XmlElement(name = "InformParameter")
	@CWMPParameter(access = "readWrite")
	public Collection<InformParameter> informParameters;

	public ManagementServer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables and disables the CPE's support for CWMP. 

{{false}} means that CWMP support in the CPE is disabled, in which case the device MUST NOT send any Inform messages to the ACS or accept any Connection Request notifications from the ACS.

{{true}} means that CWMP support on the CPE is enabled.

The factory default value MUST be {{true}}.

The subscriber can re-enable the CPE's CWMP support either by performing a factory reset or by using a LAN-side protocol to change the value of this parameter back to {{true}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnableCWMP() {
		return enableCWMP;
	}

	/**
	 * Set the enables and disables the CPE's support for CWMP. 

{{false}} means that CWMP support in the CPE is disabled, in which case the device MUST NOT send any Inform messages to the ACS or accept any Connection Request notifications from the ACS.

{{true}} means that CWMP support on the CPE is enabled.

The factory default value MUST be {{true}}.

The subscriber can re-enable the CPE's CWMP support either by performing a factory reset or by using a LAN-side protocol to change the value of this parameter back to {{true}}.
	 *
	 * @since 1.4
	 * @param enableCWMP the input value
	 */
	public void  setEnableCWMP(Boolean enableCWMP) {
		this.enableCWMP = enableCWMP;
	}

	/**
	 * Set the enables and disables the CPE's support for CWMP. 

{{false}} means that CWMP support in the CPE is disabled, in which case the device MUST NOT send any Inform messages to the ACS or accept any Connection Request notifications from the ACS.

{{true}} means that CWMP support on the CPE is enabled.

The factory default value MUST be {{true}}.

The subscriber can re-enable the CPE's CWMP support either by performing a factory reset or by using a LAN-side protocol to change the value of this parameter back to {{true}}.
	 *
	 * @since 1.4
	 * @param enableCWMP the input value
	 * @return this instance
	 */
	public ManagementServer withEnableCWMP(Boolean enableCWMP) {
		this.enableCWMP = enableCWMP;
		return this;
	}

	/**
	 * Get the url, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set the url, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param url the input value
	 */
	public void  setUrl(String url) {
		this.url = url;
	}

	/**
	 * Set the url, as defined in {{bibref|RFC3986}}, for the CPE to connect to the ACS using the CPE WAN Management Protocol. 

This parameter MUST be in the form of a valid HTTP or HTTPS URL {{bibref|RFC2616}}.

The ''host'' portion of this URL is used by the CPE for validating the ACS certificate when using SSL or TLS.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param url the input value
	 * @return this instance
	 */
	public ManagementServer withUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get the username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This username is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param username the input value
	 * @return this instance
	 */
	public ManagementServer withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used to authenticate the CPE when making a connection to the ACS using the CPE WAN Management Protocol.

This password is used only for HTTP-based authentication of the CPE.

Note that on a factory reset of the CPE, the value of this parameter might be reset to its factory value.  If an ACS modifies the value of this parameter, it SHOULD be prepared to accommodate the situation that the original value is restored as the result of a factory reset.
	 *
	 * @since 1.0
	 * @param password the input value
	 * @return this instance
	 */
	public ManagementServer withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isPeriodicInformEnable() {
		return periodicInformEnable;
	}

	/**
	 * Set the whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 * @param periodicInformEnable the input value
	 */
	public void  setPeriodicInformEnable(Boolean periodicInformEnable) {
		this.periodicInformEnable = periodicInformEnable;
	}

	/**
	 * Set the whether or not the CPE MUST periodically send CPE information to the ACS using the Inform method call.
	 *
	 * @since 1.0
	 * @param periodicInformEnable the input value
	 * @return this instance
	 */
	public ManagementServer withPeriodicInformEnable(Boolean periodicInformEnable) {
		this.periodicInformEnable = periodicInformEnable;
		return this;
	}

	/**
	 * Get the duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPeriodicInformInterval() {
		return periodicInformInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 * @param periodicInformInterval the input value
	 */
	public void  setPeriodicInformInterval(Long periodicInformInterval) {
		this.periodicInformInterval = periodicInformInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE MUST attempt to connect with the ACS and call the Inform method if {{param|PeriodicInformEnable}} is {{true}}.
	 *
	 * @since 1.0
	 * @param periodicInformInterval the input value
	 * @return this instance
	 */
	public ManagementServer withPeriodicInformInterval(Long periodicInformInterval) {
		this.periodicInformInterval = periodicInformInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a2|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getPeriodicInformTime() {
		return periodicInformTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a2|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicInformTime the input value
	 */
	public void  setPeriodicInformTime(LocalDateTime periodicInformTime) {
		this.periodicInformTime = periodicInformTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic Inform method calls.  Each Inform call MUST occur at this reference time plus or minus an integer multiple of the {{param|PeriodicInformInterval}}.

{{param}} is used only to set the "phase" of the periodic Informs.  The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInformInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic Informs will occur every day at UTC midnight.  These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-098a2|section 2.2}} indicates that no particular time reference is specified.  That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|PeriodicInformInterval}}.

If absolute time is not available to the CPE, its periodic Inform behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicInformTime the input value
	 * @return this instance
	 */
	public ManagementServer withPeriodicInformTime(LocalDateTime periodicInformTime) {
		this.periodicInformTime = periodicInformTime;
		return this;
	}

	/**
	 * Get the {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getParameterKey() {
		return parameterKey;
	}

	/**
	 * Set the {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 * @param parameterKey the input value
	 */
	public void  setParameterKey(String parameterKey) {
		this.parameterKey = parameterKey;
	}

	/**
	 * Set the {{param}} provides the ACS a reliable and extensible means to track changes made by the ACS.  The value of {{param}} MUST be equal to the value of the ParameterKey argument from the most recent successful SetParameterValues, AddObject, or DeleteObject method call from the ACS.

The CPE MUST set {{param}} to the value specified in the corresponding method arguments if and only if the method completes successfully and no fault response is generated.  If a method call does not complete successfully (implying that the changes requested in the method did not take effect), the value of {{param}} MUST NOT be modified.

The CPE MUST only modify the value of {{param}} as a result of SetParameterValues, AddObject, DeleteObject, or due to a factory reset.  On factory reset, the value of {{param}} MUST be set to {{empty}}.
	 *
	 * @since 1.0
	 * @param parameterKey the input value
	 * @return this instance
	 */
	public ManagementServer withParameterKey(String parameterKey) {
		this.parameterKey = parameterKey;
		return this;
	}

	/**
	 * Get the httP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionRequestURL() {
		return connectionRequestURL;
	}

	/**
	 * Set the httP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @param connectionRequestURL the input value
	 */
	public void  setConnectionRequestURL(String connectionRequestURL) {
		this.connectionRequestURL = connectionRequestURL;
	}

	/**
	 * Set the httP URL, as defined in {{bibref|RFC3986}}, for an ACS to make a Connection Request notification to the CPE.

In the form:

http://host:port/path

The ''host'' portion of the URL MAY be the IP address for the management interface of the CPE in lieu of a host name.
	 *
	 * @since 1.0
	 * @param connectionRequestURL the input value
	 * @return this instance
	 */
	public ManagementServer withConnectionRequestURL(String connectionRequestURL) {
		this.connectionRequestURL = connectionRequestURL;
		return this;
	}

	/**
	 * Get the username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionRequestUsername() {
		return connectionRequestUsername;
	}

	/**
	 * Set the username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestUsername the input value
	 */
	public void  setConnectionRequestUsername(String connectionRequestUsername) {
		this.connectionRequestUsername = connectionRequestUsername;
	}

	/**
	 * Set the username used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestUsername the input value
	 * @return this instance
	 */
	public ManagementServer withConnectionRequestUsername(String connectionRequestUsername) {
		this.connectionRequestUsername = connectionRequestUsername;
		return this;
	}

	/**
	 * Get the password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionRequestPassword() {
		return connectionRequestPassword;
	}

	/**
	 * Set the password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestPassword the input value
	 */
	public void  setConnectionRequestPassword(String connectionRequestPassword) {
		this.connectionRequestPassword = connectionRequestPassword;
	}

	/**
	 * Set the password used to authenticate an ACS making a Connection Request to the CPE.
	 *
	 * @since 1.0
	 * @param connectionRequestPassword the input value
	 * @return this instance
	 */
	public ManagementServer withConnectionRequestPassword(String connectionRequestPassword) {
		this.connectionRequestPassword = connectionRequestPassword;
		return this;
	}

	/**
	 * Get the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.

Note that an autonomous upgrade (reported via an ''10 AUTONOMOUS TRANSFER COMPLETE'' Inform Event code) SHOULD be regarded as a managed upgade if it is performed according to ACS-specified policy.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isUpgradesManaged() {
		return upgradesManaged;
	}

	/**
	 * Set the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.

Note that an autonomous upgrade (reported via an ''10 AUTONOMOUS TRANSFER COMPLETE'' Inform Event code) SHOULD be regarded as a managed upgade if it is performed according to ACS-specified policy.
	 *
	 * @since 1.0
	 * @param upgradesManaged the input value
	 */
	public void  setUpgradesManaged(Boolean upgradesManaged) {
		this.upgradesManaged = upgradesManaged;
	}

	/**
	 * Set the indicates whether or not the ACS will manage upgrades for the CPE.  If {{true}}, the CPE SHOULD NOT use other means other than the ACS to seek out available upgrades.  If {{false}}, the CPE MAY use other means for this purpose.

Note that an autonomous upgrade (reported via an ''10 AUTONOMOUS TRANSFER COMPLETE'' Inform Event code) SHOULD be regarded as a managed upgade if it is performed according to ACS-specified policy.
	 *
	 * @since 1.0
	 * @param upgradesManaged the input value
	 * @return this instance
	 */
	public ManagementServer withUpgradesManaged(Boolean upgradesManaged) {
		this.upgradesManaged = upgradesManaged;
		return this;
	}

	/**
	 * Get the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getKickURL() {
		return kickURL;
	}

	/**
	 * Set the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @param kickURL the input value
	 */
	public void  setKickURL(String kickURL) {
		this.kickURL = kickURL;
	}

	/**
	 * Set the present only for a CPE that supports the Kicked RPC method.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, from which the CPE can be "kicked" to initiate the Kicked RPC method call.  MUST be an absolute URL including a host name or IP address as would be used on the LAN side of the CPE.
	 *
	 * @since 1.0
	 * @param kickURL the input value
	 * @return this instance
	 */
	public ManagementServer withKickURL(String kickURL) {
		this.kickURL = kickURL;
		return this;
	}

	/**
	 * Get the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDownloadProgressURL() {
		return downloadProgressURL;
	}

	/**
	 * Set the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @param downloadProgressURL the input value
	 */
	public void  setDownloadProgressURL(String downloadProgressURL) {
		this.downloadProgressURL = downloadProgressURL;
	}

	/**
	 * Set the present only for a CPE that provides a LAN-side web page to show progress during a file download.

LAN-accessible URL, as defined in {{bibref|RFC3986}}, to which a web-server associated with the ACS MAY redirect a user's browser on initiation of a file download to observer the status of the download.
	 *
	 * @since 1.0
	 * @param downloadProgressURL the input value
	 * @return this instance
	 */
	public ManagementServer withDownloadProgressURL(String downloadProgressURL) {
		this.downloadProgressURL = downloadProgressURL;
		return this;
	}

	/**
	 * Get the this parameter is used to control throttling of active notifications sent by the CPE to the ACS.  It defines the minimum number of seconds that the CPE MUST wait since the end of the last session with the ACS before establishing a new session for the purpose of delivering an active notification.

In other words, if CPE needs to establish a new session with the ACS for the sole purpose of delivering an active notification, it MUST delay establishing such a session as needed to ensure that the minimum time since the last session completion has been met.

The time is counted since the last successfully completed session, regardless of whether or not it was used for active notifications or other purposes. However, if connection to the ACS is established for purposes other than just delivering active notifications, including for the purpose of retrying a failed session, such connection MUST NOT be delayed based on this parameter value, and the pending active notifications MUST be communicated during that connection.

The time of the last session completion does not need to be tracked across reboots.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getDefaultActiveNotificationThrottle() {
		return defaultActiveNotificationThrottle;
	}

	/**
	 * Set the this parameter is used to control throttling of active notifications sent by the CPE to the ACS.  It defines the minimum number of seconds that the CPE MUST wait since the end of the last session with the ACS before establishing a new session for the purpose of delivering an active notification.

In other words, if CPE needs to establish a new session with the ACS for the sole purpose of delivering an active notification, it MUST delay establishing such a session as needed to ensure that the minimum time since the last session completion has been met.

The time is counted since the last successfully completed session, regardless of whether or not it was used for active notifications or other purposes. However, if connection to the ACS is established for purposes other than just delivering active notifications, including for the purpose of retrying a failed session, such connection MUST NOT be delayed based on this parameter value, and the pending active notifications MUST be communicated during that connection.

The time of the last session completion does not need to be tracked across reboots.
	 *
	 * @since 1.4
	 * @param defaultActiveNotificationThrottle the input value
	 */
	public void  setDefaultActiveNotificationThrottle(Long defaultActiveNotificationThrottle) {
		this.defaultActiveNotificationThrottle = defaultActiveNotificationThrottle;
	}

	/**
	 * Set the this parameter is used to control throttling of active notifications sent by the CPE to the ACS.  It defines the minimum number of seconds that the CPE MUST wait since the end of the last session with the ACS before establishing a new session for the purpose of delivering an active notification.

In other words, if CPE needs to establish a new session with the ACS for the sole purpose of delivering an active notification, it MUST delay establishing such a session as needed to ensure that the minimum time since the last session completion has been met.

The time is counted since the last successfully completed session, regardless of whether or not it was used for active notifications or other purposes. However, if connection to the ACS is established for purposes other than just delivering active notifications, including for the purpose of retrying a failed session, such connection MUST NOT be delayed based on this parameter value, and the pending active notifications MUST be communicated during that connection.

The time of the last session completion does not need to be tracked across reboots.
	 *
	 * @since 1.4
	 * @param defaultActiveNotificationThrottle the input value
	 * @return this instance
	 */
	public ManagementServer withDefaultActiveNotificationThrottle(Long defaultActiveNotificationThrottle) {
		this.defaultActiveNotificationThrottle = defaultActiveNotificationThrottle;
		return this;
	}

	/**
	 * Get address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a2|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getUdpConnectionRequestAddress() {
		return udpConnectionRequestAddress;
	}

	/**
	 * Set address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a2|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddress the input value
	 */
	public void  setUdpConnectionRequestAddress(String udpConnectionRequestAddress) {
		this.udpConnectionRequestAddress = udpConnectionRequestAddress;
	}

	/**
	 * Set address and port to which an ACS MAY send a UDP Connection Request to the CPE (see {{bibref|TR-069a2|Annex G}}).

This parameter is represented in the form of an Authority element as defined in {{bibref|RFC3986}}.  The value MUST be in one of the following two forms:

: host:port

: host

When {{param|STUNEnable}} is {{true}}, the ''host'' and ''port'' portions of this parameter MUST represent the public address and port corresponding to the NAT binding through which the ACS can send UDP Connection Request messages (once this information is learned by the CPE through the use of STUN).

When {{param|STUNEnable}} is {{false}}, the ''host'' and ''port'' portions of the URL MUST represent the local IP address and port on which the CPE is listening for UDP Connection Request messages.

The second form of this parameter MAY be used only if the port value is equal to "80".
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddress the input value
	 * @return this instance
	 */
	public ManagementServer withUdpConnectionRequestAddress(String udpConnectionRequestAddress) {
		this.udpConnectionRequestAddress = udpConnectionRequestAddress;
		return this;
	}

	/**
	 * Get the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getUdpConnectionRequestAddressNotificationLimit() {
		return udpConnectionRequestAddressNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddressNotificationLimit the input value
	 */
	public void  setUdpConnectionRequestAddressNotificationLimit(Long udpConnectionRequestAddressNotificationLimit) {
		this.udpConnectionRequestAddressNotificationLimit = udpConnectionRequestAddressNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|UDPConnectionRequestAddress}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param udpConnectionRequestAddressNotificationLimit the input value
	 * @return this instance
	 */
	public ManagementServer withUdpConnectionRequestAddressNotificationLimit(Long udpConnectionRequestAddressNotificationLimit) {
		this.udpConnectionRequestAddressNotificationLimit = udpConnectionRequestAddressNotificationLimit;
		return this;
	}

	/**
	 * Get the enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Boolean isStuNEnable() {
		return stuNEnable;
	}

	/**
	 * Set the enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 * @param stuNEnable the input value
	 */
	public void  setStuNEnable(Boolean stuNEnable) {
		this.stuNEnable = stuNEnable;
	}

	/**
	 * Set the enables or disables the use of STUN by the CPE.  This applies only to the use of STUN in association with the ACS to allow UDP Connection Requests.
	 *
	 * @since 1.2
	 * @param stuNEnable the input value
	 * @return this instance
	 */
	public ManagementServer withStuNEnable(Boolean stuNEnable) {
		this.stuNEnable = stuNEnable;
		return this;
	}

	/**
	 * Get the host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getStuNServerAddress() {
		return stuNServerAddress;
	}

	/**
	 * Set the host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 * @param stuNServerAddress the input value
	 */
	public void  setStuNServerAddress(String stuNServerAddress) {
		this.stuNServerAddress = stuNServerAddress;
	}

	/**
	 * Set the host name or IP address of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

If {{empty}} and {{param|STUNEnable}} is {{true}}, the CPE MUST use the address of the ACS extracted from the host portion of the ACS URL.
	 *
	 * @since 1.2
	 * @param stuNServerAddress the input value
	 * @return this instance
	 */
	public ManagementServer withStuNServerAddress(String stuNServerAddress) {
		this.stuNServerAddress = stuNServerAddress;
		return this;
	}

	/**
	 * Get the port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getStuNServerPort() {
		return stuNServerPort;
	}

	/**
	 * Set the port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 * @param stuNServerPort the input value
	 */
	public void  setStuNServerPort(Long stuNServerPort) {
		this.stuNServerPort = stuNServerPort;
	}

	/**
	 * Set the port number of the STUN server for the CPE to send Binding Requests if STUN is enabled via {{param|STUNEnable}}.

By default, this SHOULD be the equal to the default STUN port, 3478.
	 *
	 * @since 1.2
	 * @param stuNServerPort the input value
	 * @return this instance
	 */
	public ManagementServer withStuNServerPort(Long stuNServerPort) {
		this.stuNServerPort = stuNServerPort;
		return this;
	}

	/**
	 * Get the if not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getStuNUsername() {
		return stuNUsername;
	}

	/**
	 * Set the if not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 * @param stuNUsername the input value
	 */
	public void  setStuNUsername(String stuNUsername) {
		this.stuNUsername = stuNUsername;
	}

	/**
	 * Set the if not {{empty}}, the value of the STUN USERNAME attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).

If {{empty}}, the CPE MUST NOT send STUN Binding Requests with message integrity.
	 *
	 * @since 1.2
	 * @param stuNUsername the input value
	 * @return this instance
	 */
	public ManagementServer withStuNUsername(String stuNUsername) {
		this.stuNUsername = stuNUsername;
		return this;
	}

	/**
	 * Get the value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getStuNPassword() {
		return stuNPassword;
	}

	/**
	 * Set the value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 * @param stuNPassword the input value
	 */
	public void  setStuNPassword(String stuNPassword) {
		this.stuNPassword = stuNPassword;
	}

	/**
	 * Set the value of the STUN Password to be used in computing the MESSAGE-INTEGRITY attribute to be used in Binding Requests (only if message integrity has been requested by the STUN server).
	 *
	 * @since 1.2
	 * @param stuNPassword the input value
	 * @return this instance
	 */
	public ManagementServer withStuNPassword(String stuNPassword) {
		this.stuNPassword = stuNPassword;
		return this;
	}

	/**
	 * Get the if STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Integer getStuNMaximumKeepAlivePeriod() {
		return stuNMaximumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 * @param stuNMaximumKeepAlivePeriod the input value
	 */
	public void  setStuNMaximumKeepAlivePeriod(Integer stuNMaximumKeepAlivePeriod) {
		this.stuNMaximumKeepAlivePeriod = stuNMaximumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the maximum period, in seconds, that STUN Binding Requests MUST be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This applies specifically to Binding Requests sent from the UDP Connection Request address and port.

A value of -1 indicates that no maximum period is specified.
	 *
	 * @since 1.2
	 * @param stuNMaximumKeepAlivePeriod the input value
	 * @return this instance
	 */
	public ManagementServer withStuNMaximumKeepAlivePeriod(Integer stuNMaximumKeepAlivePeriod) {
		this.stuNMaximumKeepAlivePeriod = stuNMaximumKeepAlivePeriod;
		return this;
	}

	/**
	 * Get the if STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getStuNMinimumKeepAlivePeriod() {
		return stuNMinimumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 * @param stuNMinimumKeepAlivePeriod the input value
	 */
	public void  setStuNMinimumKeepAlivePeriod(Long stuNMinimumKeepAlivePeriod) {
		this.stuNMinimumKeepAlivePeriod = stuNMinimumKeepAlivePeriod;
	}

	/**
	 * Set the if STUN Is enabled, the minimum period, in seconds, that STUN Binding Requests can be sent by the CPE for the purpose of maintaining the binding in the Gateway.  This limit applies only to Binding Requests sent from the UDP Connection Request address and port, and only those that do not contain the BINDING-CHANGE attribute.  This limit does not apply to retransmissions following the procedures defined in {{bibref|RFC3489}}.
	 *
	 * @since 1.2
	 * @param stuNMinimumKeepAlivePeriod the input value
	 * @return this instance
	 */
	public ManagementServer withStuNMinimumKeepAlivePeriod(Long stuNMinimumKeepAlivePeriod) {
		this.stuNMinimumKeepAlivePeriod = stuNMinimumKeepAlivePeriod;
		return this;
	}

	/**
	 * Get the when STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Boolean isNatDetected() {
		return natDetected;
	}

	/**
	 * Set the when STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 * @param natDetected the input value
	 */
	public void  setNatDetected(Boolean natDetected) {
		this.natDetected = natDetected;
	}

	/**
	 * Set the when STUN is enabled, this parameter indicates whether or not the CPE has detected address and/or port mapping in use.

A {{true}} value indicates that the received MAPPED-ADDRESS in the most recent Binding Response differs from the CPE's source address and port.

When STUNEnable is {{false}}, this value MUST be {{false}}.
	 *
	 * @since 1.2
	 * @param natDetected the input value
	 * @return this instance
	 */
	public ManagementServer withNatDetected(Boolean natDetected) {
		this.natDetected = natDetected;
		return this;
	}

	/**
	 * Get the indicates whether or not the Alias-Based Addressing Mechanism is supported.

A {{true}} value indicates that the CPE supports the Alias-Based Addressing Mechanism, as defined in {{bibref|TR-069a4|3.6.1}} and described in {{bibref|TR-069a4|Appendix II}}.
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Boolean isAliasBasedAddressing() {
		return aliasBasedAddressing;
	}

	/**
	 * Set the indicates whether or not the Alias-Based Addressing Mechanism is supported.

A {{true}} value indicates that the CPE supports the Alias-Based Addressing Mechanism, as defined in {{bibref|TR-069a4|3.6.1}} and described in {{bibref|TR-069a4|Appendix II}}.
	 *
	 * @since 1.9
	 * @param aliasBasedAddressing the input value
	 */
	public void  setAliasBasedAddressing(Boolean aliasBasedAddressing) {
		this.aliasBasedAddressing = aliasBasedAddressing;
	}

	/**
	 * Set the indicates whether or not the Alias-Based Addressing Mechanism is supported.

A {{true}} value indicates that the CPE supports the Alias-Based Addressing Mechanism, as defined in {{bibref|TR-069a4|3.6.1}} and described in {{bibref|TR-069a4|Appendix II}}.
	 *
	 * @since 1.9
	 * @param aliasBasedAddressing the input value
	 * @return this instance
	 */
	public ManagementServer withAliasBasedAddressing(Boolean aliasBasedAddressing) {
		this.aliasBasedAddressing = aliasBasedAddressing;
		return this;
	}

	/**
	 * Get the instance identification mode as defined in {{bibref|TR-069a4|3.6.1}}. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} is used by the ACS to control whether the CPE will use Instance Numbers or Instance Aliases in returned Path Names.  {{enum}} 

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 * @return the value
	 */
	public String getInstanceMode() {
		return instanceMode;
	}

	/**
	 * Set the instance identification mode as defined in {{bibref|TR-069a4|3.6.1}}. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} is used by the ACS to control whether the CPE will use Instance Numbers or Instance Aliases in returned Path Names.  {{enum}} 

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 * @param instanceMode the input value
	 */
	public void  setInstanceMode(String instanceMode) {
		this.instanceMode = instanceMode;
	}

	/**
	 * Set the instance identification mode as defined in {{bibref|TR-069a4|3.6.1}}. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} is used by the ACS to control whether the CPE will use Instance Numbers or Instance Aliases in returned Path Names.  {{enum}} 

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 * @param instanceMode the input value
	 * @return this instance
	 */
	public ManagementServer withInstanceMode(String instanceMode) {
		this.instanceMode = instanceMode;
		return this;
	}

	/**
	 * Get the enable or disable the Auto-Create Instance Mechanism. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} indicates whether or not the CPE will automatically create instances while processing a SetParameterValues RPC (as defined in {{bibref|TR-069a4|A.3.2.1}}).

*A {{true}} value indicates that the CPE will perform auto-creation of instances when the Alias-Based Addressing Mechanism is used in SetParameterValues RPC.

*A {{false}} value indicates that the CPE will not create new object instances. Instead, it will reject the setting of parameters in unrecognized instances and respond with a fault code.

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Boolean isAutoCreateInstances() {
		return autoCreateInstances;
	}

	/**
	 * Set the enable or disable the Auto-Create Instance Mechanism. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} indicates whether or not the CPE will automatically create instances while processing a SetParameterValues RPC (as defined in {{bibref|TR-069a4|A.3.2.1}}).

*A {{true}} value indicates that the CPE will perform auto-creation of instances when the Alias-Based Addressing Mechanism is used in SetParameterValues RPC.

*A {{false}} value indicates that the CPE will not create new object instances. Instead, it will reject the setting of parameters in unrecognized instances and respond with a fault code.

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 * @param autoCreateInstances the input value
	 */
	public void  setAutoCreateInstances(Boolean autoCreateInstances) {
		this.autoCreateInstances = autoCreateInstances;
	}

	/**
	 * Set the enable or disable the Auto-Create Instance Mechanism. When {{param|AliasBasedAddressing}} is {{true}}, {{param}} indicates whether or not the CPE will automatically create instances while processing a SetParameterValues RPC (as defined in {{bibref|TR-069a4|A.3.2.1}}).

*A {{true}} value indicates that the CPE will perform auto-creation of instances when the Alias-Based Addressing Mechanism is used in SetParameterValues RPC.

*A {{false}} value indicates that the CPE will not create new object instances. Instead, it will reject the setting of parameters in unrecognized instances and respond with a fault code.

This parameter is REQUIRED for any CPE supporting Alias-Based Addressing.
	 *
	 * @since 1.9
	 * @param autoCreateInstances the input value
	 * @return this instance
	 */
	public ManagementServer withAutoCreateInstances(Boolean autoCreateInstances) {
		this.autoCreateInstances = autoCreateInstances;
		return this;
	}

	/**
	 * Get the configures the first session retry wait interval, in seconds, as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

A value of 5 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param}}  and ({{param}} * {{param|CWMPRetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Long getCwmPRetryMinimumWaitInterval() {
		return cwmPRetryMinimumWaitInterval;
	}

	/**
	 * Set the configures the first session retry wait interval, in seconds, as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

A value of 5 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param}}  and ({{param}} * {{param|CWMPRetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 * @param cwmPRetryMinimumWaitInterval the input value
	 */
	public void  setCwmPRetryMinimumWaitInterval(Long cwmPRetryMinimumWaitInterval) {
		this.cwmPRetryMinimumWaitInterval = cwmPRetryMinimumWaitInterval;
	}

	/**
	 * Set the configures the first session retry wait interval, in seconds, as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

A value of 5 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param}}  and ({{param}} * {{param|CWMPRetryIntervalMultiplier}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 * @param cwmPRetryMinimumWaitInterval the input value
	 * @return this instance
	 */
	public ManagementServer withCwmPRetryMinimumWaitInterval(Long cwmPRetryMinimumWaitInterval) {
		this.cwmPRetryMinimumWaitInterval = cwmPRetryMinimumWaitInterval;
		return this;
	}

	/**
	 * Get the configures the retry interval multiplier as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

A value of 2000 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param|CWMPRetryMinimumWaitInterval}}  and ({{param|CWMPRetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Long getCwmPRetryIntervalMultiplier() {
		return cwmPRetryIntervalMultiplier;
	}

	/**
	 * Set the configures the retry interval multiplier as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

A value of 2000 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param|CWMPRetryMinimumWaitInterval}}  and ({{param|CWMPRetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 * @param cwmPRetryIntervalMultiplier the input value
	 */
	public void  setCwmPRetryIntervalMultiplier(Long cwmPRetryIntervalMultiplier) {
		this.cwmPRetryIntervalMultiplier = cwmPRetryIntervalMultiplier;
	}

	/**
	 * Set the configures the retry interval multiplier as specified in {{bibref|TR-069a2|Section 3.2.1.1}}.

This value is expressed in units of 0.001.  Hence the values of the multiplier range between 1.000 and 65.535.

A value of 2000 corresponds to the default behavior that is described in {{bibref|TR-069a2}}.

The device MUST use a random value between {{param|CWMPRetryMinimumWaitInterval}}  and ({{param|CWMPRetryMinimumWaitInterval}} * {{param}} / 1000) as the first retry wait interval.  Other values in the retry pattern MUST be calculated using this value as a starting point.
	 *
	 * @since 1.9
	 * @param cwmPRetryIntervalMultiplier the input value
	 * @return this instance
	 */
	public ManagementServer withCwmPRetryIntervalMultiplier(Long cwmPRetryIntervalMultiplier) {
		this.cwmPRetryIntervalMultiplier = cwmPRetryIntervalMultiplier;
		return this;
	}

	/**
	 * Get the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Long getManageableDeviceNotificationLimit() {
		return manageableDeviceNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param manageableDeviceNotificationLimit the input value
	 */
	public void  setManageableDeviceNotificationLimit(Long manageableDeviceNotificationLimit) {
		this.manageableDeviceNotificationLimit = manageableDeviceNotificationLimit;
	}

	/**
	 * Set the minimum time, in seconds, between Active Notifications resulting from changes to the {{param|ManageableDeviceNumberOfEntries}} (if Active Notification is enabled).
	 *
	 * @since 1.2
	 * @param manageableDeviceNotificationLimit the input value
	 * @return this instance
	 */
	public ManagementServer withManageableDeviceNotificationLimit(Long manageableDeviceNotificationLimit) {
		this.manageableDeviceNotificationLimit = manageableDeviceNotificationLimit;
		return this;
	}

	/**
	 * Get the connection request methods supported by this {{object}}. 

Enumerated value must be one of [HTTP, STUN, XMPP]
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Collection<String> getSupportedConnReqMethods() {
		if (this.supportedConnReqMethods == null){ this.supportedConnReqMethods=new ArrayList<>();}
		return supportedConnReqMethods;
	}

	/**
	 * Set the connection request methods supported by this {{object}}. 

Enumerated value must be one of [HTTP, STUN, XMPP]
	 *
	 * @since 1.13
	 * @param supportedConnReqMethods the input value
	 */
	public void  setSupportedConnReqMethods(Collection<String> supportedConnReqMethods) {
		this.supportedConnReqMethods = supportedConnReqMethods;
	}

	/**
	 * Set the connection request methods supported by this {{object}}. 

Enumerated value must be one of [HTTP, STUN, XMPP]
	 *
	 * @since 1.13
	 * @param string the input value
	 * @return this instance
	 */
	public ManagementServer withSupportedConnReqMethods(String string) {
		getSupportedConnReqMethods().add(string);
		return this;
	}

	/**
	 * Get the {{reference|the {{object|.XMPP.Connection}} instance that is used for connection requests to this {{object}}}}
	 *
	 * @since 1.13
	 * @return the value
	 */
	public String getConnReqXMPPConnection() {
		return connReqXMPPConnection;
	}

	/**
	 * Set the {{reference|the {{object|.XMPP.Connection}} instance that is used for connection requests to this {{object}}}}
	 *
	 * @since 1.13
	 * @param connReqXMPPConnection the input value
	 */
	public void  setConnReqXMPPConnection(String connReqXMPPConnection) {
		this.connReqXMPPConnection = connReqXMPPConnection;
	}

	/**
	 * Set the {{reference|the {{object|.XMPP.Connection}} instance that is used for connection requests to this {{object}}}}
	 *
	 * @since 1.13
	 * @param connReqXMPPConnection the input value
	 * @return this instance
	 */
	public ManagementServer withConnReqXMPPConnection(String connReqXMPPConnection) {
		this.connReqXMPPConnection = connReqXMPPConnection;
		return this;
	}

	/**
	 * Get the when an XMPP Connection Request is sent to a CPE the XMPP IQ Stanza will contian a "from" address that contains the Jabber ID of the initiating entity.

This parameter is a {{list}} Each entry represents a Jabber ID, or address, that is allowed to initiate an XMPP Connection Request.  

Each Jabber ID is allowed to be either a "Full JID" (containing a local-part, domain-part, and resource-part in the following format: "local-part@domain-part/resource-part") or a "Bare JID" (containing a local-part and a domain-part in the following format: "local-part@domain-part").  "Full JID" entries require an exact match whereas "Bare JID" entries are a wildcard match and will match any Jabber ID with the same local-part and domain-part independent of the resource-part.

For example, if {{param}} contained "ACS1@tr069.example.com, ACS2@tr-069.example.com/resource1" then the following incoming "from" addresses would be '''allowed''': 

* "ACS1@tr069.example.com/resource1"

* "ACS1@tr069.example.com/resource2"

* "ACS2@tr069.example.com/resource1"

And the following incoming "from" addresses '''would not be allowed''': 

* "ACS2@tr069.example.com/resource2"

* "ACS@tr069.example.com/resource"  

If this Parameter is {{empty}} then all Jabber IDs are allowed and an XMPP Connection Request can not be deemed invalid due to the "from" address.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Collection<String> getConnReqAllowedJabberIDs() {
		if (this.connReqAllowedJabberIDs == null){ this.connReqAllowedJabberIDs=new ArrayList<>();}
		return connReqAllowedJabberIDs;
	}

	/**
	 * Set the when an XMPP Connection Request is sent to a CPE the XMPP IQ Stanza will contian a "from" address that contains the Jabber ID of the initiating entity.

This parameter is a {{list}} Each entry represents a Jabber ID, or address, that is allowed to initiate an XMPP Connection Request.  

Each Jabber ID is allowed to be either a "Full JID" (containing a local-part, domain-part, and resource-part in the following format: "local-part@domain-part/resource-part") or a "Bare JID" (containing a local-part and a domain-part in the following format: "local-part@domain-part").  "Full JID" entries require an exact match whereas "Bare JID" entries are a wildcard match and will match any Jabber ID with the same local-part and domain-part independent of the resource-part.

For example, if {{param}} contained "ACS1@tr069.example.com, ACS2@tr-069.example.com/resource1" then the following incoming "from" addresses would be '''allowed''': 

* "ACS1@tr069.example.com/resource1"

* "ACS1@tr069.example.com/resource2"

* "ACS2@tr069.example.com/resource1"

And the following incoming "from" addresses '''would not be allowed''': 

* "ACS2@tr069.example.com/resource2"

* "ACS@tr069.example.com/resource"  

If this Parameter is {{empty}} then all Jabber IDs are allowed and an XMPP Connection Request can not be deemed invalid due to the "from" address.
	 *
	 * @since 1.13
	 * @param connReqAllowedJabberIDs the input value
	 */
	public void  setConnReqAllowedJabberIDs(Collection<String> connReqAllowedJabberIDs) {
		this.connReqAllowedJabberIDs = connReqAllowedJabberIDs;
	}

	/**
	 * Set the when an XMPP Connection Request is sent to a CPE the XMPP IQ Stanza will contian a "from" address that contains the Jabber ID of the initiating entity.

This parameter is a {{list}} Each entry represents a Jabber ID, or address, that is allowed to initiate an XMPP Connection Request.  

Each Jabber ID is allowed to be either a "Full JID" (containing a local-part, domain-part, and resource-part in the following format: "local-part@domain-part/resource-part") or a "Bare JID" (containing a local-part and a domain-part in the following format: "local-part@domain-part").  "Full JID" entries require an exact match whereas "Bare JID" entries are a wildcard match and will match any Jabber ID with the same local-part and domain-part independent of the resource-part.

For example, if {{param}} contained "ACS1@tr069.example.com, ACS2@tr-069.example.com/resource1" then the following incoming "from" addresses would be '''allowed''': 

* "ACS1@tr069.example.com/resource1"

* "ACS1@tr069.example.com/resource2"

* "ACS2@tr069.example.com/resource1"

And the following incoming "from" addresses '''would not be allowed''': 

* "ACS2@tr069.example.com/resource2"

* "ACS@tr069.example.com/resource"  

If this Parameter is {{empty}} then all Jabber IDs are allowed and an XMPP Connection Request can not be deemed invalid due to the "from" address.
	 *
	 * @since 1.13
	 * @param string the input value
	 * @return this instance
	 */
	public ManagementServer withConnReqAllowedJabberIDs(String string) {
		getConnReqAllowedJabberIDs().add(string);
		return this;
	}

	/**
	 * Get the value MUST be the value of the {{param|.XMPP.Connection.{i}.JabberID}} contained in the {{object|.XMPP.Connection}} instance referenced by the {{param|ConnReqXMPPConnection}} parameter.  

If the {{param|ConnReqXMPPConnection}} parameter is empty or the {{object|.XMPP.Connection}} instance being reference is disabled, then this value will be empty.  

If the {{object|.XMPP.Connection}} instance being referenced by the {{param|ConnReqXMPPConnection}} parameter is lost ({{param|.XMPP.Connection.{i}.Status}} parameter changes from Enabled to some other value), then the value of this parameter MUST remain unchanged until the connection can be reestablished and a new {{param|.XMPP.Connection.{i}.JabberID}} can be established.  If the new {{param|.XMPP.Connection.{i}.JabberID}} is identical to the existing value, then the value of this parameter MUST NOT be altered and a VALUE CHANGE event MUST NOT be generated.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public String getConnReqJabberID() {
		return connReqJabberID;
	}

	/**
	 * Set the value MUST be the value of the {{param|.XMPP.Connection.{i}.JabberID}} contained in the {{object|.XMPP.Connection}} instance referenced by the {{param|ConnReqXMPPConnection}} parameter.  

If the {{param|ConnReqXMPPConnection}} parameter is empty or the {{object|.XMPP.Connection}} instance being reference is disabled, then this value will be empty.  

If the {{object|.XMPP.Connection}} instance being referenced by the {{param|ConnReqXMPPConnection}} parameter is lost ({{param|.XMPP.Connection.{i}.Status}} parameter changes from Enabled to some other value), then the value of this parameter MUST remain unchanged until the connection can be reestablished and a new {{param|.XMPP.Connection.{i}.JabberID}} can be established.  If the new {{param|.XMPP.Connection.{i}.JabberID}} is identical to the existing value, then the value of this parameter MUST NOT be altered and a VALUE CHANGE event MUST NOT be generated.
	 *
	 * @since 1.13
	 * @param connReqJabberID the input value
	 */
	public void  setConnReqJabberID(String connReqJabberID) {
		this.connReqJabberID = connReqJabberID;
	}

	/**
	 * Set the value MUST be the value of the {{param|.XMPP.Connection.{i}.JabberID}} contained in the {{object|.XMPP.Connection}} instance referenced by the {{param|ConnReqXMPPConnection}} parameter.  

If the {{param|ConnReqXMPPConnection}} parameter is empty or the {{object|.XMPP.Connection}} instance being reference is disabled, then this value will be empty.  

If the {{object|.XMPP.Connection}} instance being referenced by the {{param|ConnReqXMPPConnection}} parameter is lost ({{param|.XMPP.Connection.{i}.Status}} parameter changes from Enabled to some other value), then the value of this parameter MUST remain unchanged until the connection can be reestablished and a new {{param|.XMPP.Connection.{i}.JabberID}} can be established.  If the new {{param|.XMPP.Connection.{i}.JabberID}} is identical to the existing value, then the value of this parameter MUST NOT be altered and a VALUE CHANGE event MUST NOT be generated.
	 *
	 * @since 1.13
	 * @param connReqJabberID the input value
	 * @return this instance
	 */
	public ManagementServer withConnReqJabberID(String connReqJabberID) {
		this.connReqJabberID = connReqJabberID;
		return this;
	}

	/**
	 * Get the indicates the HTTP Compression mechanism(s) supported by this CPE.  Requirements for the use of HTTP Compression for CWMP can be found in {{bibref|TR-069a5|Section 3.4.7}}. 

Enumerated value must be one of [GZIP, Compress, Deflate]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Collection<String> getHttPCompressionSupported() {
		if (this.httPCompressionSupported == null){ this.httPCompressionSupported=new ArrayList<>();}
		return httPCompressionSupported;
	}

	/**
	 * Set the indicates the HTTP Compression mechanism(s) supported by this CPE.  Requirements for the use of HTTP Compression for CWMP can be found in {{bibref|TR-069a5|Section 3.4.7}}. 

Enumerated value must be one of [GZIP, Compress, Deflate]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 * @param httPCompressionSupported the input value
	 */
	public void  setHttPCompressionSupported(Collection<String> httPCompressionSupported) {
		this.httPCompressionSupported = httPCompressionSupported;
	}

	/**
	 * Set the indicates the HTTP Compression mechanism(s) supported by this CPE.  Requirements for the use of HTTP Compression for CWMP can be found in {{bibref|TR-069a5|Section 3.4.7}}. 

Enumerated value must be one of [GZIP, Compress, Deflate]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 * @param string the input value
	 * @return this instance
	 */
	public ManagementServer withHttPCompressionSupported(String string) {
		getHttPCompressionSupported().add(string);
		return this;
	}

	/**
	 * Get the value of this parameter represents the HTTP Compression mechanism to be used by the CPE when communicating with the ACS.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public String getHttPCompression() {
		return httPCompression;
	}

	/**
	 * Set the value of this parameter represents the HTTP Compression mechanism to be used by the CPE when communicating with the ACS.
	 *
	 * @since 1.13
	 * @param httPCompression the input value
	 */
	public void  setHttPCompression(String httPCompression) {
		this.httPCompression = httPCompression;
	}

	/**
	 * Set the value of this parameter represents the HTTP Compression mechanism to be used by the CPE when communicating with the ACS.
	 *
	 * @since 1.13
	 * @param httPCompression the input value
	 * @return this instance
	 */
	public ManagementServer withHttPCompression(String httPCompression) {
		this.httPCompression = httPCompression;
		return this;
	}

	/**
	 * Get the indicates the Lightweight Notification Protocol(s) supported by this CPE.  

Enumerated value must be one of [UDP]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Collection<String> getLightweightNotificationProtocolsSupported() {
		if (this.lightweightNotificationProtocolsSupported == null){ this.lightweightNotificationProtocolsSupported=new ArrayList<>();}
		return lightweightNotificationProtocolsSupported;
	}

	/**
	 * Set the indicates the Lightweight Notification Protocol(s) supported by this CPE.  

Enumerated value must be one of [UDP]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 * @param lightweightNotificationProtocolsSupported the input value
	 */
	public void  setLightweightNotificationProtocolsSupported(Collection<String> lightweightNotificationProtocolsSupported) {
		this.lightweightNotificationProtocolsSupported = lightweightNotificationProtocolsSupported;
	}

	/**
	 * Set the indicates the Lightweight Notification Protocol(s) supported by this CPE.  

Enumerated value must be one of [UDP]

Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a7|Section 3.3}} MUST be adhered to.
	 *
	 * @since 1.13
	 * @param string the input value
	 * @return this instance
	 */
	public ManagementServer withLightweightNotificationProtocolsSupported(String string) {
		getLightweightNotificationProtocolsSupported().add(string);
		return this;
	}

	/**
	 * Get the value of this parameter represents the protocol(s) that will be used by the CPE when sending Lightweight Notifications.

{{empty}} means that Lightweight Notifications are disabled, despite any SetParameterAttributes that have been configured on various parameters.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Collection<String> getLightweightNotificationProtocolsUsed() {
		if (this.lightweightNotificationProtocolsUsed == null){ this.lightweightNotificationProtocolsUsed=new ArrayList<>();}
		return lightweightNotificationProtocolsUsed;
	}

	/**
	 * Set the value of this parameter represents the protocol(s) that will be used by the CPE when sending Lightweight Notifications.

{{empty}} means that Lightweight Notifications are disabled, despite any SetParameterAttributes that have been configured on various parameters.
	 *
	 * @since 1.13
	 * @param lightweightNotificationProtocolsUsed the input value
	 */
	public void  setLightweightNotificationProtocolsUsed(Collection<String> lightweightNotificationProtocolsUsed) {
		this.lightweightNotificationProtocolsUsed = lightweightNotificationProtocolsUsed;
	}

	/**
	 * Set the value of this parameter represents the protocol(s) that will be used by the CPE when sending Lightweight Notifications.

{{empty}} means that Lightweight Notifications are disabled, despite any SetParameterAttributes that have been configured on various parameters.
	 *
	 * @since 1.13
	 * @param string the input value
	 * @return this instance
	 */
	public ManagementServer withLightweightNotificationProtocolsUsed(String string) {
		getLightweightNotificationProtocolsUsed().add(string);
		return this;
	}

	/**
	 * Get the host name or address to be used when sending the UDP Lightweight Notifications.

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented or is {{empty}}, and UDP Lightweight Notifications are supported, the destination host MUST be the same as the ACS (as contained in the host portion of the {{param|URL}}).
	 *
	 * @since 1.13
	 * @return the value
	 */
	public String getUdpLightweightNotificationHost() {
		return udpLightweightNotificationHost;
	}

	/**
	 * Set the host name or address to be used when sending the UDP Lightweight Notifications.

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented or is {{empty}}, and UDP Lightweight Notifications are supported, the destination host MUST be the same as the ACS (as contained in the host portion of the {{param|URL}}).
	 *
	 * @since 1.13
	 * @param udpLightweightNotificationHost the input value
	 */
	public void  setUdpLightweightNotificationHost(String udpLightweightNotificationHost) {
		this.udpLightweightNotificationHost = udpLightweightNotificationHost;
	}

	/**
	 * Set the host name or address to be used when sending the UDP Lightweight Notifications.

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented or is {{empty}}, and UDP Lightweight Notifications are supported, the destination host MUST be the same as the ACS (as contained in the host portion of the {{param|URL}}).
	 *
	 * @since 1.13
	 * @param udpLightweightNotificationHost the input value
	 * @return this instance
	 */
	public ManagementServer withUdpLightweightNotificationHost(String udpLightweightNotificationHost) {
		this.udpLightweightNotificationHost = udpLightweightNotificationHost;
		return this;
	}

	/**
	 * Get the port number to be used when sending UDP Lightweight Notifications. 

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented and UDP Lightweight Notifications are supported, the destination port MUST be 7547.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Long getUdpLightweightNotificationPort() {
		return udpLightweightNotificationPort;
	}

	/**
	 * Set the port number to be used when sending UDP Lightweight Notifications. 

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented and UDP Lightweight Notifications are supported, the destination port MUST be 7547.
	 *
	 * @since 1.13
	 * @param udpLightweightNotificationPort the input value
	 */
	public void  setUdpLightweightNotificationPort(Long udpLightweightNotificationPort) {
		this.udpLightweightNotificationPort = udpLightweightNotificationPort;
	}

	/**
	 * Set the port number to be used when sending UDP Lightweight Notifications. 

{{param}} is only applicable when {{param|LightweightNotificationProtocolsUsed}} contains the {{enum|UDP|LightweightNotificationProtocolsUsed}} enumeration.

If {{param}} is not implemented and UDP Lightweight Notifications are supported, the destination port MUST be 7547.
	 *
	 * @since 1.13
	 * @param udpLightweightNotificationPort the input value
	 * @return this instance
	 */
	public ManagementServer withUdpLightweightNotificationPort(Long udpLightweightNotificationPort) {
		this.udpLightweightNotificationPort = udpLightweightNotificationPort;
		return this;
	}

	/**
	 * Get the each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a2|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @return the value
	 */
	public Collection<ManageableDevice> getManageableDevices() {
		if (this.manageableDevices == null){ this.manageableDevices=new ArrayList<>();}
		return manageableDevices;
	}

	/**
	 * Set the each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a2|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @param manageableDevices the input value
	 */
	public void  setManageableDevices(Collection<ManageableDevice> manageableDevices) {
		this.manageableDevices = manageableDevices;
	}

	/**
	 * Set the each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a2|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @param manageableDevice the input value
	 * @return this instance
	 */
	public ManagementServer withManageableDevice(ManageableDevice manageableDevice) {
		getManageableDevices().add(manageableDevice);
		return this;
	}

	/**
	 * Get the this object allows configuration of CPE policy for notification of AUTONOMOUS TRANSFER COMPLETE events, defined in {{bibref|TR-069a2}}.

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of file transfers that were not specifically requested by the ACS.
	 *
	 * @return the value
	 */
	public AutonomousTransferCompletePolicy getAutonomousTransferCompletePolicy() {
		return autonomousTransferCompletePolicy;
	}

	/**
	 * Set the this object allows configuration of CPE policy for notification of AUTONOMOUS TRANSFER COMPLETE events, defined in {{bibref|TR-069a2}}.

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of file transfers that were not specifically requested by the ACS.
	 *
	 * @param autonomousTransferCompletePolicy the input value
	 */
	public void  setAutonomousTransferCompletePolicy(AutonomousTransferCompletePolicy autonomousTransferCompletePolicy) {
		this.autonomousTransferCompletePolicy = autonomousTransferCompletePolicy;
	}

	/**
	 * Set the this object allows configuration of CPE policy for notification of AUTONOMOUS TRANSFER COMPLETE events, defined in {{bibref|TR-069a2}}.

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of file transfers that were not specifically requested by the ACS.
	 *
	 * @param autonomousTransferCompletePolicy the input value
	 * @return this instance
	 */
	public ManagementServer withAutonomousTransferCompletePolicy(AutonomousTransferCompletePolicy autonomousTransferCompletePolicy) {
		this.autonomousTransferCompletePolicy = autonomousTransferCompletePolicy;
		return this;
	}

	/**
	 * Get the this object allows configuration of CPE policy for notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events defined in {{bibref|TR-069a3}}.  

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of Deployment Unit state changes that were not specifically requested via CWMP.
	 *
	 * @return the value
	 */
	public DUStateChangeComplPolicy getDustateChangeComplPolicy() {
		return dustateChangeComplPolicy;
	}

	/**
	 * Set the this object allows configuration of CPE policy for notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events defined in {{bibref|TR-069a3}}.  

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of Deployment Unit state changes that were not specifically requested via CWMP.
	 *
	 * @param dustateChangeComplPolicy the input value
	 */
	public void  setDustateChangeComplPolicy(DUStateChangeComplPolicy dustateChangeComplPolicy) {
		this.dustateChangeComplPolicy = dustateChangeComplPolicy;
	}

	/**
	 * Set the this object allows configuration of CPE policy for notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events defined in {{bibref|TR-069a3}}.  

The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of Deployment Unit state changes that were not specifically requested via CWMP.
	 *
	 * @param dustateChangeComplPolicy the input value
	 * @return this instance
	 */
	public ManagementServer withDustateChangeComplPolicy(DUStateChangeComplPolicy dustateChangeComplPolicy) {
		this.dustateChangeComplPolicy = dustateChangeComplPolicy;
		return this;
	}

	/**
	 * Get the each entry in this table represents a distinct Proxied Device that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}} for proxying devices.
	 *
	 * @return the value
	 */
	public Collection<EmbeddedDevice> getEmbeddedDevices() {
		if (this.embeddedDevices == null){ this.embeddedDevices=new ArrayList<>();}
		return embeddedDevices;
	}

	/**
	 * Set the each entry in this table represents a distinct Proxied Device that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}} for proxying devices.
	 *
	 * @param embeddedDevices the input value
	 */
	public void  setEmbeddedDevices(Collection<EmbeddedDevice> embeddedDevices) {
		this.embeddedDevices = embeddedDevices;
	}

	/**
	 * Set the each entry in this table represents a distinct Proxied Device that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}} for proxying devices.
	 *
	 * @param embeddedDevice the input value
	 * @return this instance
	 */
	public ManagementServer withEmbeddedDevice(EmbeddedDevice embeddedDevice) {
		getEmbeddedDevices().add(embeddedDevice);
		return this;
	}

	/**
	 * Get the each entry in this table represents a distinct Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}} for proxying devices.
	 *
	 * @return the value
	 */
	public Collection<VirtualDevice> getVirtualDevices() {
		if (this.virtualDevices == null){ this.virtualDevices=new ArrayList<>();}
		return virtualDevices;
	}

	/**
	 * Set the each entry in this table represents a distinct Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}} for proxying devices.
	 *
	 * @param virtualDevices the input value
	 */
	public void  setVirtualDevices(Collection<VirtualDevice> virtualDevices) {
		this.virtualDevices = virtualDevices;
	}

	/**
	 * Set the each entry in this table represents a distinct Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}} for proxying devices.
	 *
	 * @param virtualDevice the input value
	 * @return this instance
	 */
	public ManagementServer withVirtualDevice(VirtualDevice virtualDevice) {
		getVirtualDevices().add(virtualDevice);
		return this;
	}

	/**
	 * Get the parameters related to CPE behavior when waking up from standby. If this object is supported then the CPE MUST support the requirements of {{bibref|TR-069a5|Annex L}}.

NOTE: "CR", as used in the names and descriptions of the parameters defined in this object, refers to the Connection Request concept defined in TR-069.
	 *
	 * @return the value
	 */
	public StandbyPolicy getStandbyPolicy() {
		return standbyPolicy;
	}

	/**
	 * Set the parameters related to CPE behavior when waking up from standby. If this object is supported then the CPE MUST support the requirements of {{bibref|TR-069a5|Annex L}}.

NOTE: "CR", as used in the names and descriptions of the parameters defined in this object, refers to the Connection Request concept defined in TR-069.
	 *
	 * @param standbyPolicy the input value
	 */
	public void  setStandbyPolicy(StandbyPolicy standbyPolicy) {
		this.standbyPolicy = standbyPolicy;
	}

	/**
	 * Set the parameters related to CPE behavior when waking up from standby. If this object is supported then the CPE MUST support the requirements of {{bibref|TR-069a5|Annex L}}.

NOTE: "CR", as used in the names and descriptions of the parameters defined in this object, refers to the Connection Request concept defined in TR-069.
	 *
	 * @param standbyPolicy the input value
	 * @return this instance
	 */
	public ManagementServer withStandbyPolicy(StandbyPolicy standbyPolicy) {
		this.standbyPolicy = standbyPolicy;
		return this;
	}

	/**
	 * Get the this table provides the ACS with the ability to control the Parameters that are delivered by the Inform RPC.

Any Parameter (identified by {{param|ParameterName}}) contained in this table MUST be included within the ParameterList argument of the Inform RPC whenever any Event within the {{param|EventList}} is being delivered. 

This table does not include Forced Inform Parameters, and Forced Inform Parameters are not allowed to be inserted into this table.  Any attempt by an ACS to configure this table to contain a Forced Inform Parameter MUST result in the failure of the SetParameterValues RPC with error code 9007.
	 *
	 * @return the value
	 */
	public Collection<InformParameter> getInformParameters() {
		if (this.informParameters == null){ this.informParameters=new ArrayList<>();}
		return informParameters;
	}

	/**
	 * Set the this table provides the ACS with the ability to control the Parameters that are delivered by the Inform RPC.

Any Parameter (identified by {{param|ParameterName}}) contained in this table MUST be included within the ParameterList argument of the Inform RPC whenever any Event within the {{param|EventList}} is being delivered. 

This table does not include Forced Inform Parameters, and Forced Inform Parameters are not allowed to be inserted into this table.  Any attempt by an ACS to configure this table to contain a Forced Inform Parameter MUST result in the failure of the SetParameterValues RPC with error code 9007.
	 *
	 * @param informParameters the input value
	 */
	public void  setInformParameters(Collection<InformParameter> informParameters) {
		this.informParameters = informParameters;
	}

	/**
	 * Set the this table provides the ACS with the ability to control the Parameters that are delivered by the Inform RPC.

Any Parameter (identified by {{param|ParameterName}}) contained in this table MUST be included within the ParameterList argument of the Inform RPC whenever any Event within the {{param|EventList}} is being delivered. 

This table does not include Forced Inform Parameters, and Forced Inform Parameters are not allowed to be inserted into this table.  Any attempt by an ACS to configure this table to contain a Forced Inform Parameter MUST result in the failure of the SetParameterValues RPC with error code 9007.
	 *
	 * @param informParameter the input value
	 * @return this instance
	 */
	public ManagementServer withInformParameter(InformParameter informParameter) {
		getInformParameters().add(informParameter);
		return this;
	}

	//</editor-fold>

}