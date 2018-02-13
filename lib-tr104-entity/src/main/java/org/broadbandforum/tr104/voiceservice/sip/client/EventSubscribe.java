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
package org.broadbandforum.tr104.voiceservice.sip.client;

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
	 * Table of SIP events automatically populated by the CPE with each of the SIP event subscriptions in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.  This table allows specification of the authentication credentials needed for each event subscription.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Client.{i}.EventSubscribe.{i}.")
@XmlRootElement(name = "EventSubscribe")
@XmlType(name = "VoiceService.SIP.Client.EventSubscribe")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventSubscribe {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * SIP event name corresponding to the value given in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Event")
	@Size(max = 32)
	public String event;
	/**
	 * Username used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthUserName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String authUserName;
	/**
	 * Password used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String authPassword;

	public EventSubscribe() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public EventSubscribe withEnable(Boolean enable) {
		this.enable = enable;
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
	public EventSubscribe withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the sip event name corresponding to the value given in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * Set the sip event name corresponding to the value given in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.
	 *
	 * @since 2.0
	 * @param event the input value
	 */
	public void  setEvent(String event) {
		this.event = event;
	}

	/**
	 * Set the sip event name corresponding to the value given in {{object|.SIP.Network.{i}.EventSubscribe.{i}.}}.
	 *
	 * @since 2.0
	 * @param event the input value
	 * @return this instance
	 */
	public EventSubscribe withEvent(String event) {
		this.event = event;
		return this;
	}

	/**
	 * Get the username used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthUserName() {
		return authUserName;
	}

	/**
	 * Set the username used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 * @param authUserName the input value
	 */
	public void  setAuthUserName(String authUserName) {
		this.authUserName = authUserName;
	}

	/**
	 * Set the username used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 * @param authUserName the input value
	 * @return this instance
	 */
	public EventSubscribe withAuthUserName(String authUserName) {
		this.authUserName = authUserName;
		return this;
	}

	/**
	 * Get the password used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAuthPassword() {
		return authPassword;
	}

	/**
	 * Set the password used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 * @param authPassword the input value
	 */
	public void  setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	/**
	 * Set the password used to authenticate the connection to the event notify server.
	 *
	 * @since 2.0
	 * @param authPassword the input value
	 * @return this instance
	 */
	public EventSubscribe withAuthPassword(String authPassword) {
		this.authPassword = authPassword;
		return this;
	}

	//</editor-fold>

}