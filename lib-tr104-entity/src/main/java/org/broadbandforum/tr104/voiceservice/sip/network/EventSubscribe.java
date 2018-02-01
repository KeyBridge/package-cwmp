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
package org.broadbandforum.tr104.voiceservice.sip.network;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Table to specify the SIP events to which the CPE MUST subscribe.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Network.{i}.EventSubscribe.{i}.")
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
	 * SIP event name to appear in the EVENT header of the SIP SUBSCRIBE request.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Event")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String event;
	/**
	 * Host name or IP address of the event notify server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Notifier")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String notifier;
	/**
	 * Destination port to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NotifierPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long notifierPort = 0L;
	/**
	 * Transport protocol to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NotifierTransport")
	@CWMPParameter(access = "readWrite")
	public String notifierTransport = "UDP";
	/**
	 * Subscription refresh timer, in seconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ExpireTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long expireTime;

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
	 * Get the sip event name to appear in the EVENT header of the SIP SUBSCRIBE request.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * Set the sip event name to appear in the EVENT header of the SIP SUBSCRIBE request.
	 *
	 * @since 2.0
	 * @param event the input value
	 */
	public void  setEvent(String event) {
		this.event = event;
	}

	/**
	 * Set the sip event name to appear in the EVENT header of the SIP SUBSCRIBE request.
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
	 * Get the host name or IP address of the event notify server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNotifier() {
		return notifier;
	}

	/**
	 * Set the host name or IP address of the event notify server.
	 *
	 * @since 2.0
	 * @param notifier the input value
	 */
	public void  setNotifier(String notifier) {
		this.notifier = notifier;
	}

	/**
	 * Set the host name or IP address of the event notify server.
	 *
	 * @since 2.0
	 * @param notifier the input value
	 * @return this instance
	 */
	public EventSubscribe withNotifier(String notifier) {
		this.notifier = notifier;
		return this;
	}

	/**
	 * Get the destination port to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNotifierPort() {
		return notifierPort;
	}

	/**
	 * Set the destination port to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 * @param notifierPort the input value
	 */
	public void  setNotifierPort(Long notifierPort) {
		this.notifierPort = notifierPort;
	}

	/**
	 * Set the destination port to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 * @param notifierPort the input value
	 * @return this instance
	 */
	public EventSubscribe withNotifierPort(Long notifierPort) {
		this.notifierPort = notifierPort;
		return this;
	}

	/**
	 * Get the transport protocol to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNotifierTransport() {
		return notifierTransport;
	}

	/**
	 * Set the transport protocol to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 * @param notifierTransport the input value
	 */
	public void  setNotifierTransport(String notifierTransport) {
		this.notifierTransport = notifierTransport;
	}

	/**
	 * Set the transport protocol to be used in connecting to the event notifier.
	 *
	 * @since 2.0
	 * @param notifierTransport the input value
	 * @return this instance
	 */
	public EventSubscribe withNotifierTransport(String notifierTransport) {
		this.notifierTransport = notifierTransport;
		return this;
	}

	/**
	 * Get the subscription refresh timer, in seconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getExpireTime() {
		return expireTime;
	}

	/**
	 * Set the subscription refresh timer, in seconds.
	 *
	 * @since 2.0
	 * @param expireTime the input value
	 */
	public void  setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * Set the subscription refresh timer, in seconds.
	 *
	 * @since 2.0
	 * @param expireTime the input value
	 * @return this instance
	 */
	public EventSubscribe withExpireTime(Long expireTime) {
		this.expireTime = expireTime;
		return this;
	}

	//</editor-fold>

}