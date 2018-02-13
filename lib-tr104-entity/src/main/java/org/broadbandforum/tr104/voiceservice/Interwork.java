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
package org.broadbandforum.tr104.voiceservice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.datatypes.IPAddress;
import org.broadbandforum.tr104.voiceservice.interwork.Map;
import org.broadbandforum.tr104.voiceservice.interwork.UserInterface;

	/**
	 * Each entry in this table configures Inter-Working Function switching features.

It is mutually exclusive with the {{object|.CallControl}} object which is used in case of PBX or Endpoint capabilities.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Interwork.{i}.")
@XmlRootElement(name = "Interwork")
@XmlType(name = "VoiceService.Interwork")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interwork {

	/**
	 * Enable or disable this {{object}} instance.
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
	 * Indicates the status of this {{object}} instance.
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
	 * Indicates the operational status of the {{object}} connections when {{param|Status}} is {{enum|Up|Status}}. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OperationalStatus")
	public String operationalStatus = "OutOfService";
	/**
	 * Human-readable string identifying the reason or explanation for the current {{param|OperationalStatus}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OperationalStatusReason")
	@Size(max = 256)
	public String operationalStatusReason;
	/**
	 * This parameter indicates whether or not the CPE supports a registration procedure that conveys its signaling IP address:port to the network. This parameter also indicates whether the network-facing Client object and its parameters are statically provisioned by the ACS or dynamically created by the CPE.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkConnectionMode")
	@CWMPParameter(access = "readWrite")
	public String networkConnectionMode;
	/**
	 * This parameter indicates whether or not an externally connected user device supports a registration procedure to convey its signaling address to the CPE. This parameter also indicates whether the user-facing objects and parameters that contain the external user device signaling address are statically provisioned by the ACS or dynamically learned by the CPE. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserConnectionMode")
	@CWMPParameter(access = "readWrite")
	public String userConnectionMode;
	/**
	 * This attribute indicates whether or not the CPE performs E.164 routing of incoming requests received from the service provider network when the target Endpoint is a PBX.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "E164Mode")
	@CWMPParameter(access = "readWrite")
	public Boolean e164Mode;
	/**
	 * This parameter indicates how the CPE treats authentication challenges received from the service provider network. This parameter only has meaning when the CPE supports an externally connected user device (e.g., the CPE is acting as a gateway between the user device and the network).  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkAuthenticationChallengeMode")
	@CWMPParameter(access = "readWrite")
	public String networkAuthenticationChallengeMode;
	/**
	 * The network IP Address of the CPE. The CPE MUST resolve this when the {{object|.Interwork.{i}.}} object is created.

Note: In case of multiple network IP addresses, the choice is left to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkIPAddress")
	public IPAddress networkIPAddress;
	/**
	 * URI of the Interworking Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterworkingRuleSetURI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String interworkingRuleSetURI;
	/**
	 * The duration in seconds of the interval for which the CPE SHOULD send request to refresh the Interworking Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterworkingRuleSetInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long interworkingRuleSetInterval;
	/**
	 * An absolute time reference in UTC to determine when the CPE will send a request to refresh the Interworking Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|InterworkingRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|InterworkingRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|InterworkingRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterworkingRuleSetTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime interworkingRuleSetTime;
	/**
	 * URI of the Firewall Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirewallRuleSetURI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String firewallRuleSetURI;
	/**
	 * The duration in seconds of the interval for which the CPE SHOULD send request to refresh the Firewall Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirewallRuleSetInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long firewallRuleSetInterval;
	/**
	 * An absolute time reference in UTC to determine when the CPE will send a request to refresh the Firewall Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|FirewallRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|FirewallRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|FirewallRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirewallRuleSetTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime firewallRuleSetTime;
	/**
	 * Human-readable string identifying the name or explanation for this {{object}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterworkName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String interworkName;
	/**
	 * Reference to the {{object|.SIP.Proxy}} associated with this {{object}}. {{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProxyServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String proxyServer;
	/**
	 * {{list}} {{reference}}

List of available Networks for routing calls.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Networks")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> networks;
	/**
	 * This parameter is MUST contain the {{object|.SIP.Client}} for all {{object|.Trunk}} objects referenced in the {{object|Map}} table when {{param|E164Mode}} = {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "E164Client")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String e164Client;
	/**
	 * Each table entry references a row in the {{object|.SIP.Registrar}} table to identify the User IP address and listening port for the Device and the Network to route calls to.
	 */
	@XmlElementWrapper(name = "UserInterfaces")
	@XmlElement(name = "UserInterface")
	@CWMPParameter(access = "readWrite")
	public Collection<UserInterface> userInterfaces;
	/**
	 * For interworking use cases such as SIP-ISDN PBX plug and ESBC : mapping instance between a Network interface and a User extension.
	 */
	@XmlElementWrapper(name = "Maps")
	@XmlElement(name = "Map")
	@CWMPParameter(access = "readWrite")
	public Collection<Map> maps;

	public Interwork() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this {{object}} instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this {{object}} instance.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this {{object}} instance.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Interwork withEnable(Boolean enable) {
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
	public Interwork withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this {{object}} instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this {{object}} instance.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this {{object}} instance.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Interwork withStatus(String status) {
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
	public Interwork withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates the operational status of the {{object}} connections when {{param|Status}} is {{enum|Up|Status}}. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOperationalStatus() {
		return operationalStatus;
	}

	/**
	 * Set the indicates the operational status of the {{object}} connections when {{param|Status}} is {{enum|Up|Status}}. {{enum}}
	 *
	 * @since 2.0
	 * @param operationalStatus the input value
	 */
	public void  setOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
	}

	/**
	 * Set the indicates the operational status of the {{object}} connections when {{param|Status}} is {{enum|Up|Status}}. {{enum}}
	 *
	 * @since 2.0
	 * @param operationalStatus the input value
	 * @return this instance
	 */
	public Interwork withOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
		return this;
	}

	/**
	 * Get the human-readable string identifying the reason or explanation for the current {{param|OperationalStatus}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOperationalStatusReason() {
		return operationalStatusReason;
	}

	/**
	 * Set the human-readable string identifying the reason or explanation for the current {{param|OperationalStatus}}.
	 *
	 * @since 2.0
	 * @param operationalStatusReason the input value
	 */
	public void  setOperationalStatusReason(String operationalStatusReason) {
		this.operationalStatusReason = operationalStatusReason;
	}

	/**
	 * Set the human-readable string identifying the reason or explanation for the current {{param|OperationalStatus}}.
	 *
	 * @since 2.0
	 * @param operationalStatusReason the input value
	 * @return this instance
	 */
	public Interwork withOperationalStatusReason(String operationalStatusReason) {
		this.operationalStatusReason = operationalStatusReason;
		return this;
	}

	/**
	 * Get the this parameter indicates whether or not the CPE supports a registration procedure that conveys its signaling IP address:port to the network. This parameter also indicates whether the network-facing Client object and its parameters are statically provisioned by the ACS or dynamically created by the CPE.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetworkConnectionMode() {
		return networkConnectionMode;
	}

	/**
	 * Set the this parameter indicates whether or not the CPE supports a registration procedure that conveys its signaling IP address:port to the network. This parameter also indicates whether the network-facing Client object and its parameters are statically provisioned by the ACS or dynamically created by the CPE.  {{enum}}
	 *
	 * @since 2.0
	 * @param networkConnectionMode the input value
	 */
	public void  setNetworkConnectionMode(String networkConnectionMode) {
		this.networkConnectionMode = networkConnectionMode;
	}

	/**
	 * Set the this parameter indicates whether or not the CPE supports a registration procedure that conveys its signaling IP address:port to the network. This parameter also indicates whether the network-facing Client object and its parameters are statically provisioned by the ACS or dynamically created by the CPE.  {{enum}}
	 *
	 * @since 2.0
	 * @param networkConnectionMode the input value
	 * @return this instance
	 */
	public Interwork withNetworkConnectionMode(String networkConnectionMode) {
		this.networkConnectionMode = networkConnectionMode;
		return this;
	}

	/**
	 * Get the this parameter indicates whether or not an externally connected user device supports a registration procedure to convey its signaling address to the CPE. This parameter also indicates whether the user-facing objects and parameters that contain the external user device signaling address are statically provisioned by the ACS or dynamically learned by the CPE. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUserConnectionMode() {
		return userConnectionMode;
	}

	/**
	 * Set the this parameter indicates whether or not an externally connected user device supports a registration procedure to convey its signaling address to the CPE. This parameter also indicates whether the user-facing objects and parameters that contain the external user device signaling address are statically provisioned by the ACS or dynamically learned by the CPE. {{enum}}
	 *
	 * @since 2.0
	 * @param userConnectionMode the input value
	 */
	public void  setUserConnectionMode(String userConnectionMode) {
		this.userConnectionMode = userConnectionMode;
	}

	/**
	 * Set the this parameter indicates whether or not an externally connected user device supports a registration procedure to convey its signaling address to the CPE. This parameter also indicates whether the user-facing objects and parameters that contain the external user device signaling address are statically provisioned by the ACS or dynamically learned by the CPE. {{enum}}
	 *
	 * @since 2.0
	 * @param userConnectionMode the input value
	 * @return this instance
	 */
	public Interwork withUserConnectionMode(String userConnectionMode) {
		this.userConnectionMode = userConnectionMode;
		return this;
	}

	/**
	 * Get the this attribute indicates whether or not the CPE performs E.164 routing of incoming requests received from the service provider network when the target Endpoint is a PBX.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isE164Mode() {
		return e164Mode;
	}

	/**
	 * Set the this attribute indicates whether or not the CPE performs E.164 routing of incoming requests received from the service provider network when the target Endpoint is a PBX.
	 *
	 * @since 2.0
	 * @param e164Mode the input value
	 */
	public void  setE164Mode(Boolean e164Mode) {
		this.e164Mode = e164Mode;
	}

	/**
	 * Set the this attribute indicates whether or not the CPE performs E.164 routing of incoming requests received from the service provider network when the target Endpoint is a PBX.
	 *
	 * @since 2.0
	 * @param e164Mode the input value
	 * @return this instance
	 */
	public Interwork withE164Mode(Boolean e164Mode) {
		this.e164Mode = e164Mode;
		return this;
	}

	/**
	 * Get the this parameter indicates how the CPE treats authentication challenges received from the service provider network. This parameter only has meaning when the CPE supports an externally connected user device (e.g., the CPE is acting as a gateway between the user device and the network).  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetworkAuthenticationChallengeMode() {
		return networkAuthenticationChallengeMode;
	}

	/**
	 * Set the this parameter indicates how the CPE treats authentication challenges received from the service provider network. This parameter only has meaning when the CPE supports an externally connected user device (e.g., the CPE is acting as a gateway between the user device and the network).  {{enum}}
	 *
	 * @since 2.0
	 * @param networkAuthenticationChallengeMode the input value
	 */
	public void  setNetworkAuthenticationChallengeMode(String networkAuthenticationChallengeMode) {
		this.networkAuthenticationChallengeMode = networkAuthenticationChallengeMode;
	}

	/**
	 * Set the this parameter indicates how the CPE treats authentication challenges received from the service provider network. This parameter only has meaning when the CPE supports an externally connected user device (e.g., the CPE is acting as a gateway between the user device and the network).  {{enum}}
	 *
	 * @since 2.0
	 * @param networkAuthenticationChallengeMode the input value
	 * @return this instance
	 */
	public Interwork withNetworkAuthenticationChallengeMode(String networkAuthenticationChallengeMode) {
		this.networkAuthenticationChallengeMode = networkAuthenticationChallengeMode;
		return this;
	}

	/**
	 * Get the network IP Address of the CPE. The CPE MUST resolve this when the {{object|.Interwork.{i}.}} object is created.

Note: In case of multiple network IP addresses, the choice is left to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getNetworkIPAddress() {
		return networkIPAddress;
	}

	/**
	 * Set the network IP Address of the CPE. The CPE MUST resolve this when the {{object|.Interwork.{i}.}} object is created.

Note: In case of multiple network IP addresses, the choice is left to the CPE.
	 *
	 * @since 2.0
	 * @param networkIPAddress the input value
	 */
	public void  setNetworkIPAddress(IPAddress networkIPAddress) {
		this.networkIPAddress = networkIPAddress;
	}

	/**
	 * Set the network IP Address of the CPE. The CPE MUST resolve this when the {{object|.Interwork.{i}.}} object is created.

Note: In case of multiple network IP addresses, the choice is left to the CPE.
	 *
	 * @since 2.0
	 * @param networkIPAddress the input value
	 * @return this instance
	 */
	public Interwork withNetworkIPAddress(IPAddress networkIPAddress) {
		this.networkIPAddress = networkIPAddress;
		return this;
	}

	/**
	 * Get the uri of the Interworking Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInterworkingRuleSetURI() {
		return interworkingRuleSetURI;
	}

	/**
	 * Set the uri of the Interworking Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 * @param interworkingRuleSetURI the input value
	 */
	public void  setInterworkingRuleSetURI(String interworkingRuleSetURI) {
		this.interworkingRuleSetURI = interworkingRuleSetURI;
	}

	/**
	 * Set the uri of the Interworking Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 * @param interworkingRuleSetURI the input value
	 * @return this instance
	 */
	public Interwork withInterworkingRuleSetURI(String interworkingRuleSetURI) {
		this.interworkingRuleSetURI = interworkingRuleSetURI;
		return this;
	}

	/**
	 * Get the duration in seconds of the interval for which the CPE SHOULD send request to refresh the Interworking Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInterworkingRuleSetInterval() {
		return interworkingRuleSetInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE SHOULD send request to refresh the Interworking Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 * @param interworkingRuleSetInterval the input value
	 */
	public void  setInterworkingRuleSetInterval(Long interworkingRuleSetInterval) {
		this.interworkingRuleSetInterval = interworkingRuleSetInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE SHOULD send request to refresh the Interworking Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 * @param interworkingRuleSetInterval the input value
	 * @return this instance
	 */
	public Interwork withInterworkingRuleSetInterval(Long interworkingRuleSetInterval) {
		this.interworkingRuleSetInterval = interworkingRuleSetInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when the CPE will send a request to refresh the Interworking Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|InterworkingRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|InterworkingRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|InterworkingRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getInterworkingRuleSetTime() {
		return interworkingRuleSetTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will send a request to refresh the Interworking Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|InterworkingRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|InterworkingRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|InterworkingRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param interworkingRuleSetTime the input value
	 */
	public void  setInterworkingRuleSetTime(LocalDateTime interworkingRuleSetTime) {
		this.interworkingRuleSetTime = interworkingRuleSetTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will send a request to refresh the Interworking Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|InterworkingRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|InterworkingRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|InterworkingRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param interworkingRuleSetTime the input value
	 * @return this instance
	 */
	public Interwork withInterworkingRuleSetTime(LocalDateTime interworkingRuleSetTime) {
		this.interworkingRuleSetTime = interworkingRuleSetTime;
		return this;
	}

	/**
	 * Get the uri of the Firewall Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFirewallRuleSetURI() {
		return firewallRuleSetURI;
	}

	/**
	 * Set the uri of the Firewall Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 * @param firewallRuleSetURI the input value
	 */
	public void  setFirewallRuleSetURI(String firewallRuleSetURI) {
		this.firewallRuleSetURI = firewallRuleSetURI;
	}

	/**
	 * Set the uri of the Firewall Rule Set for this {{object}} instance.
	 *
	 * @since 2.0
	 * @param firewallRuleSetURI the input value
	 * @return this instance
	 */
	public Interwork withFirewallRuleSetURI(String firewallRuleSetURI) {
		this.firewallRuleSetURI = firewallRuleSetURI;
		return this;
	}

	/**
	 * Get the duration in seconds of the interval for which the CPE SHOULD send request to refresh the Firewall Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFirewallRuleSetInterval() {
		return firewallRuleSetInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE SHOULD send request to refresh the Firewall Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 * @param firewallRuleSetInterval the input value
	 */
	public void  setFirewallRuleSetInterval(Long firewallRuleSetInterval) {
		this.firewallRuleSetInterval = firewallRuleSetInterval;
	}

	/**
	 * Set the duration in seconds of the interval for which the CPE SHOULD send request to refresh the Firewall Rule Set.

A value of '0' indicates that this feature is disabled.
	 *
	 * @since 2.0
	 * @param firewallRuleSetInterval the input value
	 * @return this instance
	 */
	public Interwork withFirewallRuleSetInterval(Long firewallRuleSetInterval) {
		this.firewallRuleSetInterval = firewallRuleSetInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when the CPE will send a request to refresh the Firewall Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|FirewallRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|FirewallRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|FirewallRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getFirewallRuleSetTime() {
		return firewallRuleSetTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will send a request to refresh the Firewall Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|FirewallRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|FirewallRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|FirewallRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param firewallRuleSetTime the input value
	 */
	public void  setFirewallRuleSetTime(LocalDateTime firewallRuleSetTime) {
		this.firewallRuleSetTime = firewallRuleSetTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will send a request to refresh the Firewall Rule Set. Each refresh request MUST occur at this reference time plus or minus an integer multiple of the {{param|FirewallRuleSetInterval}}.

{{param}} is used only to set the ''phase'' of refresh requests. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|FirewallRuleSetInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the refresh requests will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|section 3.2}} indicates that no particular time reference is specified.  That is,  the CPE MAY locally choose the time reference, and needs only to adhere to the specified {{param|FirewallRuleSetInterval}}.

If absolute time is not available to the CPE, its behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param firewallRuleSetTime the input value
	 * @return this instance
	 */
	public Interwork withFirewallRuleSetTime(LocalDateTime firewallRuleSetTime) {
		this.firewallRuleSetTime = firewallRuleSetTime;
		return this;
	}

	/**
	 * Get the human-readable string identifying the name or explanation for this {{object}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInterworkName() {
		return interworkName;
	}

	/**
	 * Set the human-readable string identifying the name or explanation for this {{object}}.
	 *
	 * @since 2.0
	 * @param interworkName the input value
	 */
	public void  setInterworkName(String interworkName) {
		this.interworkName = interworkName;
	}

	/**
	 * Set the human-readable string identifying the name or explanation for this {{object}}.
	 *
	 * @since 2.0
	 * @param interworkName the input value
	 * @return this instance
	 */
	public Interwork withInterworkName(String interworkName) {
		this.interworkName = interworkName;
		return this;
	}

	/**
	 * Get the reference to the {{object|.SIP.Proxy}} associated with this {{object}}. {{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProxyServer() {
		return proxyServer;
	}

	/**
	 * Set the reference to the {{object|.SIP.Proxy}} associated with this {{object}}. {{reference}}
	 *
	 * @since 2.0
	 * @param proxyServer the input value
	 */
	public void  setProxyServer(String proxyServer) {
		this.proxyServer = proxyServer;
	}

	/**
	 * Set the reference to the {{object|.SIP.Proxy}} associated with this {{object}}. {{reference}}
	 *
	 * @since 2.0
	 * @param proxyServer the input value
	 * @return this instance
	 */
	public Interwork withProxyServer(String proxyServer) {
		this.proxyServer = proxyServer;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}

List of available Networks for routing calls.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getNetworks() {
		if (this.networks == null){ this.networks=new ArrayList<>();}
		return networks;
	}

	/**
	 * Set the {{list}} {{reference}}

List of available Networks for routing calls.
	 *
	 * @since 2.0
	 * @param networks the input value
	 */
	public void  setNetworks(Collection<String> networks) {
		this.networks = networks;
	}

	/**
	 * Set the {{list}} {{reference}}

List of available Networks for routing calls.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Interwork withNetworks(String string) {
		getNetworks().add(string);
		return this;
	}

	/**
	 * Get the this parameter is MUST contain the {{object|.SIP.Client}} for all {{object|.Trunk}} objects referenced in the {{object|Map}} table when {{param|E164Mode}} = {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getE164Client() {
		return e164Client;
	}

	/**
	 * Set the this parameter is MUST contain the {{object|.SIP.Client}} for all {{object|.Trunk}} objects referenced in the {{object|Map}} table when {{param|E164Mode}} = {{true}}.
	 *
	 * @since 2.0
	 * @param e164Client the input value
	 */
	public void  setE164Client(String e164Client) {
		this.e164Client = e164Client;
	}

	/**
	 * Set the this parameter is MUST contain the {{object|.SIP.Client}} for all {{object|.Trunk}} objects referenced in the {{object|Map}} table when {{param|E164Mode}} = {{true}}.
	 *
	 * @since 2.0
	 * @param e164Client the input value
	 * @return this instance
	 */
	public Interwork withE164Client(String e164Client) {
		this.e164Client = e164Client;
		return this;
	}

	/**
	 * Get the each table entry references a row in the {{object|.SIP.Registrar}} table to identify the User IP address and listening port for the Device and the Network to route calls to.
	 *
	 * @return the value
	 */
	public Collection<UserInterface> getUserInterfaces() {
		if (this.userInterfaces == null){ this.userInterfaces=new ArrayList<>();}
		return userInterfaces;
	}

	/**
	 * Set the each table entry references a row in the {{object|.SIP.Registrar}} table to identify the User IP address and listening port for the Device and the Network to route calls to.
	 *
	 * @param userInterfaces the input value
	 */
	public void  setUserInterfaces(Collection<UserInterface> userInterfaces) {
		this.userInterfaces = userInterfaces;
	}

	/**
	 * Set the each table entry references a row in the {{object|.SIP.Registrar}} table to identify the User IP address and listening port for the Device and the Network to route calls to.
	 *
	 * @param userInterface the input value
	 * @return this instance
	 */
	public Interwork withUserInterface(UserInterface userInterface) {
		getUserInterfaces().add(userInterface);
		return this;
	}

	/**
	 * Get the for interworking use cases such as SIP-ISDN PBX plug and ESBC : mapping instance between a Network interface and a User extension.
	 *
	 * @return the value
	 */
	public Collection<Map> getMaps() {
		if (this.maps == null){ this.maps=new ArrayList<>();}
		return maps;
	}

	/**
	 * Set the for interworking use cases such as SIP-ISDN PBX plug and ESBC : mapping instance between a Network interface and a User extension.
	 *
	 * @param maps the input value
	 */
	public void  setMaps(Collection<Map> maps) {
		this.maps = maps;
	}

	/**
	 * Set the for interworking use cases such as SIP-ISDN PBX plug and ESBC : mapping instance between a Network interface and a User extension.
	 *
	 * @param map the input value
	 * @return this instance
	 */
	public Interwork withMap(Map map) {
		getMaps().add(map);
		return this;
	}

	//</editor-fold>

}