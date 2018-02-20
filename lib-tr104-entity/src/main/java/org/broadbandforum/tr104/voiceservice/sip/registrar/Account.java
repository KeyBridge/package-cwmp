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
package org.broadbandforum.tr104.voiceservice.sip.registrar;

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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr104.voiceservice.sip.registrar.account.Contact;

	/**
	 * SIP account table.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Registrar.{i}.Account.{i}.", uniqueConstraints = {@CWMPUnique(names = {"URI"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.SIP.Registrar.Account")
@XmlType(name = "VoiceService.SIP.Registrar.Account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {

	/**
	 * Enables or disables this account, or places it into a quiescent state. {{enum}}

In the {{enum|Quiescent}} state, in-progress sessions remain intact, but no new sessions are allowed. If this parameter is set to {{enum|Quiescent}} in a CPE that does not support the {{enum|Quiescent}} state, it MUST treat it the same as the {{enum|Disable}} state (and indicate {{enum|Disabled|Status}} in {{param|Status}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public String enable;
	/**
	 * If {{true}}, when {{param|Enable}} is set to {{false}} in-progress sessions remain intact, but no new sessions are allowed. When all sessions are terminated, the {{object}} is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QuiescentMode")
	@CWMPParameter(access = "readWrite")
	public Boolean quiescentMode;
	/**
	 * Indicates the status of this account. Unless noted otherwise, the {{param}} values apply to both registering and non-registering external SIP user agents.
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
	 * Mechanism via which the {{object}} was created.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * Indicates the call status for this account.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CallStatus")
	public String callStatus;
	/**
	 * Username used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthUserName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String authUserName;
	/**
	 * Password used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String authPassword;
	/**
	 * The current registration status of the externally connected SIP user agent. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegistrationStatus")
	public String registrationStatus;
	/**
	 * The URI (AoR) of the externally connected SIP user agent. For SIP user agents that register, this is the URI that is contained in the To header field of the incoming REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 389)
	public String uri;
	/**
	 * The domain name used when the SIP user agent has registered itself.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Domain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String domain;
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
	 * Voice profile to use with this {{object}}.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoIPProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String voiPProfile;
	/**
	 * Active registrations for this SIP account.
	 */
	@XmlElementWrapper(name = "Contacts")
	@XmlElement(name = "Contact")
	@CWMPParameter(access = "readWrite")
	public Collection<Contact> contacts;

	public Account() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this account, or places it into a quiescent state. {{enum}}

In the {{enum|Quiescent}} state, in-progress sessions remain intact, but no new sessions are allowed. If this parameter is set to {{enum|Quiescent}} in a CPE that does not support the {{enum|Quiescent}} state, it MUST treat it the same as the {{enum|Disable}} state (and indicate {{enum|Disabled|Status}} in {{param|Status}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this account, or places it into a quiescent state. {{enum}}

In the {{enum|Quiescent}} state, in-progress sessions remain intact, but no new sessions are allowed. If this parameter is set to {{enum|Quiescent}} in a CPE that does not support the {{enum|Quiescent}} state, it MUST treat it the same as the {{enum|Disable}} state (and indicate {{enum|Disabled|Status}} in {{param|Status}}).
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(String enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this account, or places it into a quiescent state. {{enum}}

In the {{enum|Quiescent}} state, in-progress sessions remain intact, but no new sessions are allowed. If this parameter is set to {{enum|Quiescent}} in a CPE that does not support the {{enum|Quiescent}} state, it MUST treat it the same as the {{enum|Disable}} state (and indicate {{enum|Disabled|Status}} in {{param|Status}}).
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Account withEnable(String enable) {
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
	public Account withQuiescentMode(Boolean quiescentMode) {
		this.quiescentMode = quiescentMode;
		return this;
	}

	/**
	 * Get the indicates the status of this account. Unless noted otherwise, the {{param}} values apply to both registering and non-registering external SIP user agents.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this account. Unless noted otherwise, the {{param}} values apply to both registering and non-registering external SIP user agents.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this account. Unless noted otherwise, the {{param}} values apply to both registering and non-registering external SIP user agents.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Account withStatus(String status) {
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
	public Account withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mechanism via which the {{object}} was created.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was created.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was created.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Account withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the indicates the call status for this account.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCallStatus() {
		return callStatus;
	}

	/**
	 * Set the indicates the call status for this account.
	 *
	 * @since 2.0
	 * @param callStatus the input value
	 */
	public void  setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}

	/**
	 * Set the indicates the call status for this account.
	 *
	 * @since 2.0
	 * @param callStatus the input value
	 * @return this instance
	 */
	public Account withCallStatus(String callStatus) {
		this.callStatus = callStatus;
		return this;
	}

	/**
	 * Get the username used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthUserName() {
		return authUserName;
	}

	/**
	 * Set the username used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 * @param authUserName the input value
	 */
	public void  setAuthUserName(String authUserName) {
		this.authUserName = authUserName;
	}

	/**
	 * Set the username used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 * @param authUserName the input value
	 * @return this instance
	 */
	public Account withAuthUserName(String authUserName) {
		this.authUserName = authUserName;
		return this;
	}

	/**
	 * Get the password used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthPassword() {
		return authPassword;
	}

	/**
	 * Set the password used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 * @param authPassword the input value
	 */
	public void  setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	/**
	 * Set the password used to authenticate the connection to the registrar server.

This parameter can only be modified if {{param|Origin}} is Static.
	 *
	 * @since 2.0
	 * @param authPassword the input value
	 * @return this instance
	 */
	public Account withAuthPassword(String authPassword) {
		this.authPassword = authPassword;
		return this;
	}

	/**
	 * Get the current registration status of the externally connected SIP user agent. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegistrationStatus() {
		return registrationStatus;
	}

	/**
	 * Set the current registration status of the externally connected SIP user agent. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 * @param registrationStatus the input value
	 */
	public void  setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	/**
	 * Set the current registration status of the externally connected SIP user agent. This parameter is valid only for SIP user agents that support registration.
	 *
	 * @since 2.0
	 * @param registrationStatus the input value
	 * @return this instance
	 */
	public Account withRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
		return this;
	}

	/**
	 * Get the URI (AoR) of the externally connected SIP user agent. For SIP user agents that register, this is the URI that is contained in the To header field of the incoming REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Set the URI (AoR) of the externally connected SIP user agent. For SIP user agents that register, this is the URI that is contained in the To header field of the incoming REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param uri the input value
	 */
	public void  setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Set the URI (AoR) of the externally connected SIP user agent. For SIP user agents that register, this is the URI that is contained in the To header field of the incoming REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param uri the input value
	 * @return this instance
	 */
	public Account withUri(String uri) {
		this.uri = uri;
		return this;
	}

	/**
	 * Get the domain name used when the SIP user agent has registered itself.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Set the domain name used when the SIP user agent has registered itself.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param domain the input value
	 */
	public void  setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Set the domain name used when the SIP user agent has registered itself.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param domain the input value
	 * @return this instance
	 */
	public Account withDomain(String domain) {
		this.domain = domain;
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
	public Account withCodecList(String string) {
		getCodecList().add(string);
		return this;
	}

	/**
	 * Get the voice profile to use with this {{object}}.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVoiPProfile() {
		return voiPProfile;
	}

	/**
	 * Set the voice profile to use with this {{object}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 */
	public void  setVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
	}

	/**
	 * Set the voice profile to use with this {{object}}.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 * @return this instance
	 */
	public Account withVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
		return this;
	}

	/**
	 * Get active registrations for this SIP account.
	 *
	 * @return the value
	 */
	public Collection<Contact> getContacts() {
		if (this.contacts == null){ this.contacts=new ArrayList<>();}
		return contacts;
	}

	/**
	 * Set active registrations for this SIP account.
	 *
	 * @param contacts the input value
	 */
	public void  setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}

	/**
	 * Set active registrations for this SIP account.
	 *
	 * @param contact the input value
	 * @return this instance
	 */
	public Account withContact(Contact contact) {
		getContacts().add(contact);
		return this;
	}

	//</editor-fold>

}