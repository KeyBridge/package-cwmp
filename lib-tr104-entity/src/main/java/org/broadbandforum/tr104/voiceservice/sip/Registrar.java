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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.IPAddress;
import org.broadbandforum.tr104.voiceservice.sip.registrar.Account;

	/**
	 * Global SIP parameters used by the CPE when acting as registrar server for externally connected SIP user agents. This object also contains the global SIP parameters used by the CPE when it acts as static identity-to-location binding database for externally connected SIP user agents that don't register (i.e. static-mode SIP-PBX).
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Registrar.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"RegistrarPort", "RegistrarIPAddress"})})
@XmlRootElement(name = "VoiceService.SIP.Registrar")
@XmlType(name = "VoiceService.SIP.Registrar")
@XmlAccessorType(XmlAccessType.FIELD)
public class Registrar {

	/**
	 * Enable or disable the registrar.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * If {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuiescentMode")
	@CWMPParameter(access = "readWrite")
	public Boolean quiescentMode;
	/**
	 * Indicates the status of this registrar.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Mechanism via which the IP address was assigned.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * The IP address the registrar listens on for incoming SIP requests from an externally connected SIP user agent.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrarIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress registrarIPAddress;
	/**
	 * The port the registrar listens on.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrarPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long registrarPort;
	/**
	 * The minimum register expire time in seconds. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegisterExpires")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long registerExpires;
	/**
	 * The interval in seconds between sending a periodic ping request (e.g., a SIP OPTIONS ping) to externally connected SIP user agents. The CPE performs the periodic ping request to verify connectivity with externally connected devices that do not support SIP registration procedures (i.e. a static-mode SIP-PBX). A value of 0 indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PingInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 65535)
	public Long pingInterval;
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
	 * Realm for authentication with the specified values of {{param|Account.{i}.AuthUserName}} and {{param|Account.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Realm")
	@CWMPParameter(access = "readWrite")
	public String realm;
	/**
	 * VoIP profile to use with this registrar.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoIPProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String voiPProfile;
	/**
	 * Built by the CPE using {{param|RegistrarIPAddress}} and {{param|RegistrarPort}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ContactURI")
	@Size(max = 256)
	public String contactURI;
	/**
	 * SIP account table.
	 */
	@XmlElementWrapper(name = "Accounts")
	@XmlElement(name = "Account")
	@CWMPParameter(access = "readWrite")
	public Collection<Account> accounts;

	public Registrar() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable the registrar.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable the registrar.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable the registrar.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Registrar withEnable(Boolean enable) {
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
	public Registrar withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this registrar.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this registrar.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this registrar.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Registrar withStatus(String status) {
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
	public Registrar withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mechanism via which the IP address was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the IP address was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the IP address was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Registrar withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the IP address the registrar listens on for incoming SIP requests from an externally connected SIP user agent.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getRegistrarIPAddress() {
		return registrarIPAddress;
	}

	/**
	 * Set the IP address the registrar listens on for incoming SIP requests from an externally connected SIP user agent.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param registrarIPAddress the input value
	 */
	public void  setRegistrarIPAddress(IPAddress registrarIPAddress) {
		this.registrarIPAddress = registrarIPAddress;
	}

	/**
	 * Set the IP address the registrar listens on for incoming SIP requests from an externally connected SIP user agent.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param registrarIPAddress the input value
	 * @return this instance
	 */
	public Registrar withRegistrarIPAddress(IPAddress registrarIPAddress) {
		this.registrarIPAddress = registrarIPAddress;
		return this;
	}

	/**
	 * Get the port the registrar listens on.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegistrarPort() {
		return registrarPort;
	}

	/**
	 * Set the port the registrar listens on.
	 *
	 * @since 2.0
	 * @param registrarPort the input value
	 */
	public void  setRegistrarPort(Long registrarPort) {
		this.registrarPort = registrarPort;
	}

	/**
	 * Set the port the registrar listens on.
	 *
	 * @since 2.0
	 * @param registrarPort the input value
	 * @return this instance
	 */
	public Registrar withRegistrarPort(Long registrarPort) {
		this.registrarPort = registrarPort;
		return this;
	}

	/**
	 * Get the minimum register expire time in seconds. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegisterExpires() {
		return registerExpires;
	}

	/**
	 * Set the minimum register expire time in seconds. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 * @param registerExpires the input value
	 */
	public void  setRegisterExpires(Long registerExpires) {
		this.registerExpires = registerExpires;
	}

	/**
	 * Set the minimum register expire time in seconds. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 * @param registerExpires the input value
	 * @return this instance
	 */
	public Registrar withRegisterExpires(Long registerExpires) {
		this.registerExpires = registerExpires;
		return this;
	}

	/**
	 * Get the interval in seconds between sending a periodic ping request (e.g., a SIP OPTIONS ping) to externally connected SIP user agents. The CPE performs the periodic ping request to verify connectivity with externally connected devices that do not support SIP registration procedures (i.e. a static-mode SIP-PBX). A value of 0 indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPingInterval() {
		return pingInterval;
	}

	/**
	 * Set the interval in seconds between sending a periodic ping request (e.g., a SIP OPTIONS ping) to externally connected SIP user agents. The CPE performs the periodic ping request to verify connectivity with externally connected devices that do not support SIP registration procedures (i.e. a static-mode SIP-PBX). A value of 0 indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 * @param pingInterval the input value
	 */
	public void  setPingInterval(Long pingInterval) {
		this.pingInterval = pingInterval;
	}

	/**
	 * Set the interval in seconds between sending a periodic ping request (e.g., a SIP OPTIONS ping) to externally connected SIP user agents. The CPE performs the periodic ping request to verify connectivity with externally connected devices that do not support SIP registration procedures (i.e. a static-mode SIP-PBX). A value of 0 indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 * @param pingInterval the input value
	 * @return this instance
	 */
	public Registrar withPingInterval(Long pingInterval) {
		this.pingInterval = pingInterval;
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
	public Registrar withOrganization(String organization) {
		this.organization = organization;
		return this;
	}

	/**
	 * Get the realm for authentication with the specified values of {{param|Account.{i}.AuthUserName}} and {{param|Account.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRealm() {
		return realm;
	}

	/**
	 * Set the realm for authentication with the specified values of {{param|Account.{i}.AuthUserName}} and {{param|Account.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 * @param realm the input value
	 */
	public void  setRealm(String realm) {
		this.realm = realm;
	}

	/**
	 * Set the realm for authentication with the specified values of {{param|Account.{i}.AuthUserName}} and {{param|Account.{i}.AuthPassword}}.
	 *
	 * @since 2.0
	 * @param realm the input value
	 * @return this instance
	 */
	public Registrar withRealm(String realm) {
		this.realm = realm;
		return this;
	}

	/**
	 * Get the voiP profile to use with this registrar.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVoiPProfile() {
		return voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this registrar.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 */
	public void  setVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this registrar.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 * @return this instance
	 */
	public Registrar withVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
		return this;
	}

	/**
	 * Get the built by the CPE using {{param|RegistrarIPAddress}} and {{param|RegistrarPort}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getContactURI() {
		return contactURI;
	}

	/**
	 * Set the built by the CPE using {{param|RegistrarIPAddress}} and {{param|RegistrarPort}}.
	 *
	 * @since 2.0
	 * @param contactURI the input value
	 */
	public void  setContactURI(String contactURI) {
		this.contactURI = contactURI;
	}

	/**
	 * Set the built by the CPE using {{param|RegistrarIPAddress}} and {{param|RegistrarPort}}.
	 *
	 * @since 2.0
	 * @param contactURI the input value
	 * @return this instance
	 */
	public Registrar withContactURI(String contactURI) {
		this.contactURI = contactURI;
		return this;
	}

	/**
	 * Get the sip account table.
	 *
	 * @return the value
	 */
	public Collection<Account> getAccounts() {
		if (this.accounts == null){ this.accounts=new ArrayList<>();}
		return accounts;
	}

	/**
	 * Set the sip account table.
	 *
	 * @param accounts the input value
	 */
	public void  setAccounts(Collection<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * Set the sip account table.
	 *
	 * @param account the input value
	 * @return this instance
	 */
	public Registrar withAccount(Account account) {
		getAccounts().add(account);
		return this;
	}

	//</editor-fold>

}