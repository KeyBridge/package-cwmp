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
	 * Global SIP parameters used by the CPE when acting as proxy for SIP user agents.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Proxy.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"ProxyIPAddress", "ProxyPort"})})
@XmlRootElement(name = "VoiceService.SIP.Proxy")
@XmlType(name = "VoiceService.SIP.Proxy")
@XmlAccessorType(XmlAccessType.FIELD)
public class Proxy {

	/**
	 * Enable or disable the proxy.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this proxy.
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
	 * The IP address the proxy listens on.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProxyIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress proxyIPAddress;
	/**
	 * The port the proxy listens on.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProxyPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long proxyPort;
	/**
	 * Built by the CPE using {{param|ProxyIPAddress}} and {{param|ProxyPort}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ContactURI")
	@Size(max = 256)
	public String contactURI;
	/**
	 * VoIP profile to use with this proxy.

{{reference}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoIPProfile")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String voiPProfile;

	public Proxy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable the proxy.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable the proxy.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable the proxy.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Proxy withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this proxy.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this proxy.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this proxy.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Proxy withStatus(String status) {
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
	public Proxy withAlias(Alias alias) {
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
	public Proxy withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the IP address the proxy listens on.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getProxyIPAddress() {
		return proxyIPAddress;
	}

	/**
	 * Set the IP address the proxy listens on.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param proxyIPAddress the input value
	 */
	public void  setProxyIPAddress(IPAddress proxyIPAddress) {
		this.proxyIPAddress = proxyIPAddress;
	}

	/**
	 * Set the IP address the proxy listens on.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param proxyIPAddress the input value
	 * @return this instance
	 */
	public Proxy withProxyIPAddress(IPAddress proxyIPAddress) {
		this.proxyIPAddress = proxyIPAddress;
		return this;
	}

	/**
	 * Get the port the proxy listens on.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getProxyPort() {
		return proxyPort;
	}

	/**
	 * Set the port the proxy listens on.
	 *
	 * @since 2.0
	 * @param proxyPort the input value
	 */
	public void  setProxyPort(Long proxyPort) {
		this.proxyPort = proxyPort;
	}

	/**
	 * Set the port the proxy listens on.
	 *
	 * @since 2.0
	 * @param proxyPort the input value
	 * @return this instance
	 */
	public Proxy withProxyPort(Long proxyPort) {
		this.proxyPort = proxyPort;
		return this;
	}

	/**
	 * Get the built by the CPE using {{param|ProxyIPAddress}} and {{param|ProxyPort}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getContactURI() {
		return contactURI;
	}

	/**
	 * Set the built by the CPE using {{param|ProxyIPAddress}} and {{param|ProxyPort}}.
	 *
	 * @since 2.0
	 * @param contactURI the input value
	 */
	public void  setContactURI(String contactURI) {
		this.contactURI = contactURI;
	}

	/**
	 * Set the built by the CPE using {{param|ProxyIPAddress}} and {{param|ProxyPort}}.
	 *
	 * @since 2.0
	 * @param contactURI the input value
	 * @return this instance
	 */
	public Proxy withContactURI(String contactURI) {
		this.contactURI = contactURI;
		return this;
	}

	/**
	 * Get the voiP profile to use with this proxy.

{{reference}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVoiPProfile() {
		return voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this proxy.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 */
	public void  setVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
	}

	/**
	 * Set the voiP profile to use with this proxy.

{{reference}}
	 *
	 * @since 2.0
	 * @param voiPProfile the input value
	 * @return this instance
	 */
	public Proxy withVoiPProfile(String voiPProfile) {
		this.voiPProfile = voiPProfile;
		return this;
	}

	//</editor-fold>

}