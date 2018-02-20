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
package org.broadbandforum.tr104.voiceservice.sip.registrar.account;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.common.IPAddress;

	/**
	 * Active registrations for this SIP account.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Registrar.{i}.Account.{i}.Contact.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "VoiceService.SIP.Registrar.Account.Contact")
@XmlType(name = "VoiceService.SIP.Registrar.Account.Contact")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {

	/**
	 * Enable or disable this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this entry.
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
	 * Mechanism via which the {{object}} was assigned.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * IP Address of the externally connected SIP user agent. This is the IP address contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress ipaddress;
	/**
	 * The port of the externally connected SIP user agent. This is the port contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long port;
	/**
	 * This is the SIP signaling address of the externally connected SIP user agent. If the SIP user agent registers, then {{param}} is the Contact URI contained in the Contact header field of the REGISTER request received from the SIP user agent. If the SIP user agent does not register, then the {{param}} is provisioned by the ACS. 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ContactURI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String contactURI;
	/**
	 * Time when this registration will expire. This parameter is valid only for external SIP user agents that register.

If this registration never expires, this parameter SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ExpireTime")
	public LocalDateTime expireTime;
	/**
	 * This parameter defines the User-Agent header that will be used by the SIP messages send by this user agent. Implementers SHOULD make the User-Agent header field a configurable option.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserAgent")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String userAgent;

	public Contact() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Contact withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Contact withStatus(String status) {
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
	public Contact withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mechanism via which the {{object}} was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the {{object}} was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public Contact withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the ip Address of the externally connected SIP user agent. This is the IP address contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the ip Address of the externally connected SIP user agent. This is the IP address contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the ip Address of the externally connected SIP user agent. This is the IP address contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public Contact withIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the port of the externally connected SIP user agent. This is the port contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the port of the externally connected SIP user agent. This is the port contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the port of the externally connected SIP user agent. This is the port contained in the {{param|ContactURI}} parameter.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public Contact withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the this is the SIP signaling address of the externally connected SIP user agent. If the SIP user agent registers, then {{param}} is the Contact URI contained in the Contact header field of the REGISTER request received from the SIP user agent. If the SIP user agent does not register, then the {{param}} is provisioned by the ACS. 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getContactURI() {
		return contactURI;
	}

	/**
	 * Set the this is the SIP signaling address of the externally connected SIP user agent. If the SIP user agent registers, then {{param}} is the Contact URI contained in the Contact header field of the REGISTER request received from the SIP user agent. If the SIP user agent does not register, then the {{param}} is provisioned by the ACS. 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param contactURI the input value
	 */
	public void  setContactURI(String contactURI) {
		this.contactURI = contactURI;
	}

	/**
	 * Set the this is the SIP signaling address of the externally connected SIP user agent. If the SIP user agent registers, then {{param}} is the Contact URI contained in the Contact header field of the REGISTER request received from the SIP user agent. If the SIP user agent does not register, then the {{param}} is provisioned by the ACS. 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param contactURI the input value
	 * @return this instance
	 */
	public Contact withContactURI(String contactURI) {
		this.contactURI = contactURI;
		return this;
	}

	/**
	 * Get the time when this registration will expire. This parameter is valid only for external SIP user agents that register.

If this registration never expires, this parameter SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	/**
	 * Set the time when this registration will expire. This parameter is valid only for external SIP user agents that register.

If this registration never expires, this parameter SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param expireTime the input value
	 */
	public void  setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * Set the time when this registration will expire. This parameter is valid only for external SIP user agents that register.

If this registration never expires, this parameter SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param expireTime the input value
	 * @return this instance
	 */
	public Contact withExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
		return this;
	}

	/**
	 * Get the this parameter defines the User-Agent header that will be used by the SIP messages send by this user agent. Implementers SHOULD make the User-Agent header field a configurable option.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * Set the this parameter defines the User-Agent header that will be used by the SIP messages send by this user agent. Implementers SHOULD make the User-Agent header field a configurable option.
	 *
	 * @since 2.0
	 * @param userAgent the input value
	 */
	public void  setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * Set the this parameter defines the User-Agent header that will be used by the SIP messages send by this user agent. Implementers SHOULD make the User-Agent header field a configurable option.
	 *
	 * @since 2.0
	 * @param userAgent the input value
	 * @return this instance
	 */
	public Contact withUserAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}

	//</editor-fold>

}