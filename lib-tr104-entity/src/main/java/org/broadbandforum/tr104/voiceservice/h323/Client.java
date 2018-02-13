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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * H.323 client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each H.323 client maintains a registration for the H.323 identities of the associated line with the {{object|#.Network}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.H323.Client.{i}.")
@XmlRootElement(name = "VoiceService.H323.Client")
@XmlType(name = "VoiceService.H323.Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	/**
	 * Enable or disable this client.
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
	 * Indicates the status of this client.
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
	 * Enables or disables usage of H.235 security baseline security profile as defined in {{bibref|H.235.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "H235Authentication")
	@CWMPParameter(access = "readWrite")
	public Boolean h235Authentication = false;
	/**
	 * Password to be used when H.235 is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthPassword")
	@CWMPParameter(access = "readWrite")
	public String authPassword;
	/**
	 * In ITU-T based H.235 authentication, the sendersID is the ID of the gateway as received from the Gatekeeper. As long as the endpointID is not received from the Gatekeeper, the sendersID will be applied as configured here.  The generalID is the GatekeeperID.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SendersID")
	@CWMPParameter(access = "readWrite")
	public String sendersID;
	/**
	 * H.323 network with which this H.323 client is associated.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Network")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String network;
	/**
	 * The H.323 ID assigned to the client.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "H323ID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String h323ID;
	/**
	 * Limit on the number of simultaneous voice sessions across this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessions")
	@CWMPParameter(access = "readWrite")
	public Long maxSessions = 0L;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this client.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this client.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this client.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Client withEnable(Boolean enable) {
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
	public Client withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this client.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this client.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this client.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Client withStatus(String status) {
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
	public Client withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables usage of H.235 security baseline security profile as defined in {{bibref|H.235.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isH235Authentication() {
		return h235Authentication;
	}

	/**
	 * Set the enables or disables usage of H.235 security baseline security profile as defined in {{bibref|H.235.1}}.
	 *
	 * @since 2.0
	 * @param h235Authentication the input value
	 */
	public void  setH235Authentication(Boolean h235Authentication) {
		this.h235Authentication = h235Authentication;
	}

	/**
	 * Set the enables or disables usage of H.235 security baseline security profile as defined in {{bibref|H.235.1}}.
	 *
	 * @since 2.0
	 * @param h235Authentication the input value
	 * @return this instance
	 */
	public Client withH235Authentication(Boolean h235Authentication) {
		this.h235Authentication = h235Authentication;
		return this;
	}

	/**
	 * Get the password to be used when H.235 is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthPassword() {
		return authPassword;
	}

	/**
	 * Set the password to be used when H.235 is enabled.
	 *
	 * @since 2.0
	 * @param authPassword the input value
	 */
	public void  setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	/**
	 * Set the password to be used when H.235 is enabled.
	 *
	 * @since 2.0
	 * @param authPassword the input value
	 * @return this instance
	 */
	public Client withAuthPassword(String authPassword) {
		this.authPassword = authPassword;
		return this;
	}

	/**
	 * Get the in ITU-T based H.235 authentication, the sendersID is the ID of the gateway as received from the Gatekeeper. As long as the endpointID is not received from the Gatekeeper, the sendersID will be applied as configured here.  The generalID is the GatekeeperID.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSendersID() {
		return sendersID;
	}

	/**
	 * Set the in ITU-T based H.235 authentication, the sendersID is the ID of the gateway as received from the Gatekeeper. As long as the endpointID is not received from the Gatekeeper, the sendersID will be applied as configured here.  The generalID is the GatekeeperID.
	 *
	 * @since 2.0
	 * @param sendersID the input value
	 */
	public void  setSendersID(String sendersID) {
		this.sendersID = sendersID;
	}

	/**
	 * Set the in ITU-T based H.235 authentication, the sendersID is the ID of the gateway as received from the Gatekeeper. As long as the endpointID is not received from the Gatekeeper, the sendersID will be applied as configured here.  The generalID is the GatekeeperID.
	 *
	 * @since 2.0
	 * @param sendersID the input value
	 * @return this instance
	 */
	public Client withSendersID(String sendersID) {
		this.sendersID = sendersID;
		return this;
	}

	/**
	 * Get the h.323 network with which this H.323 client is associated.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * Set the h.323 network with which this H.323 client is associated.

{{reference}}
	 *
	 * @since 2.0
	 * @param network the input value
	 */
	public void  setNetwork(String network) {
		this.network = network;
	}

	/**
	 * Set the h.323 network with which this H.323 client is associated.

{{reference}}
	 *
	 * @since 2.0
	 * @param network the input value
	 * @return this instance
	 */
	public Client withNetwork(String network) {
		this.network = network;
		return this;
	}

	/**
	 * Get the H.323 ID assigned to the client.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getH323ID() {
		return h323ID;
	}

	/**
	 * Set the H.323 ID assigned to the client.
	 *
	 * @since 2.0
	 * @param h323ID the input value
	 */
	public void  setH323ID(String h323ID) {
		this.h323ID = h323ID;
	}

	/**
	 * Set the H.323 ID assigned to the client.
	 *
	 * @since 2.0
	 * @param h323ID the input value
	 * @return this instance
	 */
	public Client withH323ID(String h323ID) {
		this.h323ID = h323ID;
		return this;
	}

	/**
	 * Get the limit on the number of simultaneous voice sessions across this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSessions() {
		return maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @param maxSessions the input value
	 */
	public void  setMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across this {{object}}. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @param maxSessions the input value
	 * @return this instance
	 */
	public Client withMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
		return this;
	}

	//</editor-fold>

}