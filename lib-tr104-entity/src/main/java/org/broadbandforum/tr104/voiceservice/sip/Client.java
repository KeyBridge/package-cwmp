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
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.sip.client.Contact;
import org.broadbandforum.tr104.voiceservice.sip.client.EventSubscribe;

	/**
	 * SIP client table (a Client as described in {{bibref|TR-104i2|Section 4.2}}). Each SIP client maintains its identity-to-location (i.e., RegisterURI-to-ContactURI) binding for SIP signaling exchanged between the client and the network.

For CPE use cases where {{object|.CallControl}} is used to map network-facing to user-facing objects, the relationship between the SIP client object and its associated {{object|.CallControl.Line}} object(s) is determined by the {{param|RegisterMode}} parameter, as follows:

: - In case of RFC3261-style explicit registration of SIP AoRs, only a single line shall be associated with each SIP client.

: - In case of RFC6140 or IMS/TISPAN-style registration, multiple lines can be associated with each SIP client. The set of lines associated with a SIP client constitute an 'identity set'. In this case, registering the single SIP client implicitly registers the identities of all associated lines.

: - In the case where the client does not register with the network ({{param|RegisterMode}} is {{enum|STATIC|RegisterMode}}), multiple lines can be associated with each SIP client.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Client.{i}.")
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
	 * Indicates the status of this client. Unless noted otherwise, the status values apply to both registering and non-registering clients.
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
	 * Mechanism via which this instance was assigned.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * The registration procedures to apply. For {{param}} values other than {{enum|STATIC}}, the SIP {{object|#}} conveys its RegisterURI-to-ContactURI binding to the network using the SIP registration procedure. For the {{param}} value of {{enum|STATIC}}, the SIP client RegisterURI-to-ContactURI binding is conveyed to the network via some out-of-band mechanism not defined by this data model.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegisterMode")
	@CWMPParameter(access = "readWrite")
	public String registerMode;
	/**
	 * Username used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthUserName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String authUserName;
	/**
	 * Password used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String authPassword;
	/**
	 * SIP network with which this SIP client is associated.

{{reference}} 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Network")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String network;
	/**
	 * Limit on the number of simultaneous voice sessions across this client. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessions")
	@CWMPParameter(access = "readWrite")
	public Long maxSessions = 0L;
	/**
	 * The SIP URI that represents the identity of this SIP client. For {{param|RegisterMode}} values where the SIP client registers with the network, this SIP URI is placed in the From and To headers in the REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegisterURI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 389)
	public String registerURI;
	/**
	 * When {{true}} and using a {{object|.Trunk}}, the SIP URIs built from the directory numbers in {{param|.Trunk.{i}.DDIRange}} SHOULD use E.164 format, using the "user=phone" URI parameter, according to {{bibref|RFC3261|section 19.1.6}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "E164Format")
	@CWMPParameter(access = "readWrite")
	public Boolean e164Format = true;
	/**
	 * Enable or disable the use of T.38.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T38Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean t38Enable;
	/**
	 * Active registrations for this SIP account.
	 */
	@XmlElementWrapper(name = "contacts")
	@XmlElement(name = "Contact")
	@CWMPParameter(access = "readWrite")
	public Collection<Contact> contacts;
	/**
	 * Table of SIP events automatically populated by the CPE with each of the SIP event subscriptions in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.  This table allows specification of the authentication credentials needed for each event subscription.
	 */
	@XmlElementWrapper(name = "eventSubscribes")
	@XmlElement(name = "EventSubscribe")
	@CWMPParameter(access = "readWrite")
	public Collection<EventSubscribe> eventSubscribes;

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
	 * Get the indicates the status of this client. Unless noted otherwise, the status values apply to both registering and non-registering clients.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this client. Unless noted otherwise, the status values apply to both registering and non-registering clients.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this client. Unless noted otherwise, the status values apply to both registering and non-registering clients.
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
	 * Get the mechanism via which this instance was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which this instance was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which this instance was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Client withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the registration procedures to apply. For {{param}} values other than {{enum|STATIC}}, the SIP {{object|#}} conveys its RegisterURI-to-ContactURI binding to the network using the SIP registration procedure. For the {{param}} value of {{enum|STATIC}}, the SIP client RegisterURI-to-ContactURI binding is conveyed to the network via some out-of-band mechanism not defined by this data model.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegisterMode() {
		return registerMode;
	}

	/**
	 * Set the registration procedures to apply. For {{param}} values other than {{enum|STATIC}}, the SIP {{object|#}} conveys its RegisterURI-to-ContactURI binding to the network using the SIP registration procedure. For the {{param}} value of {{enum|STATIC}}, the SIP client RegisterURI-to-ContactURI binding is conveyed to the network via some out-of-band mechanism not defined by this data model.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param registerMode the input value
	 */
	public void  setRegisterMode(String registerMode) {
		this.registerMode = registerMode;
	}

	/**
	 * Set the registration procedures to apply. For {{param}} values other than {{enum|STATIC}}, the SIP {{object|#}} conveys its RegisterURI-to-ContactURI binding to the network using the SIP registration procedure. For the {{param}} value of {{enum|STATIC}}, the SIP client RegisterURI-to-ContactURI binding is conveyed to the network via some out-of-band mechanism not defined by this data model.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
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
	 * Get the username used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthUserName() {
		return authUserName;
	}

	/**
	 * Set the username used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param authUserName the input value
	 */
	public void  setAuthUserName(String authUserName) {
		this.authUserName = authUserName;
	}

	/**
	 * Set the username used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param authUserName the input value
	 * @return this instance
	 */
	public Client withAuthUserName(String authUserName) {
		this.authUserName = authUserName;
		return this;
	}

	/**
	 * Get the password used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthPassword() {
		return authPassword;
	}

	/**
	 * Set the password used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param authPassword the input value
	 */
	public void  setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	/**
	 * Set the password used to authenticate the connection to the server.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
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
	 * Get the sip network with which this SIP client is associated.

{{reference}} 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * Set the sip network with which this SIP client is associated.

{{reference}} 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param network the input value
	 */
	public void  setNetwork(String network) {
		this.network = network;
	}

	/**
	 * Set the sip network with which this SIP client is associated.

{{reference}} 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
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
	 * Get the limit on the number of simultaneous voice sessions across this client. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSessions() {
		return maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across this client. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

A value of zero indicates no explicit limit on the number of sessions.
	 *
	 * @since 2.0
	 * @param maxSessions the input value
	 */
	public void  setMaxSessions(Long maxSessions) {
		this.maxSessions = maxSessions;
	}

	/**
	 * Set the limit on the number of simultaneous voice sessions across this client. This MUST be less than or equal to {{param|.Capabilities.MaxSessionCount}}.

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

	/**
	 * Get the SIP URI that represents the identity of this SIP client. For {{param|RegisterMode}} values where the SIP client registers with the network, this SIP URI is placed in the From and To headers in the REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRegisterURI() {
		return registerURI;
	}

	/**
	 * Set the SIP URI that represents the identity of this SIP client. For {{param|RegisterMode}} values where the SIP client registers with the network, this SIP URI is placed in the From and To headers in the REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param registerURI the input value
	 */
	public void  setRegisterURI(String registerURI) {
		this.registerURI = registerURI;
	}

	/**
	 * Set the SIP URI that represents the identity of this SIP client. For {{param|RegisterMode}} values where the SIP client registers with the network, this SIP URI is placed in the From and To headers in the REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param registerURI the input value
	 * @return this instance
	 */
	public Client withRegisterURI(String registerURI) {
		this.registerURI = registerURI;
		return this;
	}

	/**
	 * Get the when {{true}} and using a {{object|.Trunk}}, the SIP URIs built from the directory numbers in {{param|.Trunk.{i}.DDIRange}} SHOULD use E.164 format, using the "user=phone" URI parameter, according to {{bibref|RFC3261|section 19.1.6}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isE164Format() {
		return e164Format;
	}

	/**
	 * Set the when {{true}} and using a {{object|.Trunk}}, the SIP URIs built from the directory numbers in {{param|.Trunk.{i}.DDIRange}} SHOULD use E.164 format, using the "user=phone" URI parameter, according to {{bibref|RFC3261|section 19.1.6}}.
	 *
	 * @since 2.0
	 * @param e164Format the input value
	 */
	public void  setE164Format(Boolean e164Format) {
		this.e164Format = e164Format;
	}

	/**
	 * Set the when {{true}} and using a {{object|.Trunk}}, the SIP URIs built from the directory numbers in {{param|.Trunk.{i}.DDIRange}} SHOULD use E.164 format, using the "user=phone" URI parameter, according to {{bibref|RFC3261|section 19.1.6}}.
	 *
	 * @since 2.0
	 * @param e164Format the input value
	 * @return this instance
	 */
	public Client withE164Format(Boolean e164Format) {
		this.e164Format = e164Format;
		return this;
	}

	/**
	 * Get the enable or disable the use of T.38.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isT38Enable() {
		return t38Enable;
	}

	/**
	 * Set the enable or disable the use of T.38.
	 *
	 * @since 2.0
	 * @param t38Enable the input value
	 */
	public void  setT38Enable(Boolean t38Enable) {
		this.t38Enable = t38Enable;
	}

	/**
	 * Set the enable or disable the use of T.38.
	 *
	 * @since 2.0
	 * @param t38Enable the input value
	 * @return this instance
	 */
	public Client withT38Enable(Boolean t38Enable) {
		this.t38Enable = t38Enable;
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
	public Client withContact(Contact contact) {
		getContacts().add(contact);
		return this;
	}

	/**
	 * Get the table of SIP events automatically populated by the CPE with each of the SIP event subscriptions in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.  This table allows specification of the authentication credentials needed for each event subscription.
	 *
	 * @return the value
	 */
	public Collection<EventSubscribe> getEventSubscribes() {
		if (this.eventSubscribes == null){ this.eventSubscribes=new ArrayList<>();}
		return eventSubscribes;
	}

	/**
	 * Set the table of SIP events automatically populated by the CPE with each of the SIP event subscriptions in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.  This table allows specification of the authentication credentials needed for each event subscription.
	 *
	 * @param eventSubscribes the input value
	 */
	public void  setEventSubscribes(Collection<EventSubscribe> eventSubscribes) {
		this.eventSubscribes = eventSubscribes;
	}

	/**
	 * Set the table of SIP events automatically populated by the CPE with each of the SIP event subscriptions in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.  This table allows specification of the authentication credentials needed for each event subscription.
	 *
	 * @param eventSubscribe the input value
	 * @return this instance
	 */
	public Client withEventSubscribe(EventSubscribe eventSubscribe) {
		getEventSubscribes().add(eventSubscribe);
		return this;
	}

	//</editor-fold>

}