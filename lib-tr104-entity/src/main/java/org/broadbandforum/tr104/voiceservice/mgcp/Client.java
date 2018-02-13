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
	 * MGCP client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each MGCP client maintains a registration for the MGCP identities of the associated line with the {{object|#.Network}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.MGCP.Client.{i}.")
@XmlRootElement(name = "VoiceService.MGCP.Client")
@XmlType(name = "VoiceService.MGCP.Client")
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
	 * Register mode.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegisterMode")
	@CWMPParameter(access = "readWrite")
	public String registerMode = "Wildcard";
	/**
	 * Port listening for incoming call control signaling.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long localPort = 0L;
	/**
	 * CPE domain string.  If {{empty}}, the CPE SHOULD use its IP address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Domain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String domain;
	/**
	 * User string used in accessing the call agent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "User")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String user;
	/**
	 * MGCP network with which this MGCP client is associated.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Network")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String network;
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
	 * Get the register mode.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegisterMode() {
		return registerMode;
	}

	/**
	 * Set the register mode.
	 *
	 * @since 2.0
	 * @param registerMode the input value
	 */
	public void  setRegisterMode(String registerMode) {
		this.registerMode = registerMode;
	}

	/**
	 * Set the register mode.
	 *
	 * @since 2.0
	 * @param registerMode the input value
	 * @return this instance
	 */
	public Client withRegisterMode(String registerMode) {
		this.registerMode = registerMode;
		return this;
	}

	/**
	 * Get the port listening for incoming call control signaling.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLocalPort() {
		return localPort;
	}

	/**
	 * Set the port listening for incoming call control signaling.
	 *
	 * @since 2.0
	 * @param localPort the input value
	 */
	public void  setLocalPort(Long localPort) {
		this.localPort = localPort;
	}

	/**
	 * Set the port listening for incoming call control signaling.
	 *
	 * @since 2.0
	 * @param localPort the input value
	 * @return this instance
	 */
	public Client withLocalPort(Long localPort) {
		this.localPort = localPort;
		return this;
	}

	/**
	 * Get the cpe domain string.  If {{empty}}, the CPE SHOULD use its IP address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Set the cpe domain string.  If {{empty}}, the CPE SHOULD use its IP address.
	 *
	 * @since 2.0
	 * @param domain the input value
	 */
	public void  setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Set the cpe domain string.  If {{empty}}, the CPE SHOULD use its IP address.
	 *
	 * @since 2.0
	 * @param domain the input value
	 * @return this instance
	 */
	public Client withDomain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Get the user string used in accessing the call agent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Set the user string used in accessing the call agent.
	 *
	 * @since 2.0
	 * @param user the input value
	 */
	public void  setUser(String user) {
		this.user = user;
	}

	/**
	 * Set the user string used in accessing the call agent.
	 *
	 * @since 2.0
	 * @param user the input value
	 * @return this instance
	 */
	public Client withUser(String user) {
		this.user = user;
		return this;
	}

	/**
	 * Get the mgcP network with which this MGCP client is associated.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * Set the mgcP network with which this MGCP client is associated.

{{reference}}
	 *
	 * @since 2.0
	 * @param network the input value
	 */
	public void  setNetwork(String network) {
		this.network = network;
	}

	/**
	 * Set the mgcP network with which this MGCP client is associated.

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