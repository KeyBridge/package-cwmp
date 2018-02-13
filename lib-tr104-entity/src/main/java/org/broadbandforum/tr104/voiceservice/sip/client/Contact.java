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

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.datatypes.IPAddress;

	/**
	 * Active registrations for this SIP account.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Client.{i}.Contact.{i}.")
@XmlRootElement(name = "VoiceService.SIP.Client.Contact")
@XmlType(name = "VoiceService.SIP.Client.Contact")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {

	/**
	 * Enable or disable this {{object}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Indicates the status of this {{object}}.
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
	 * Mechanism via which this {{object}} was assigned.  {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * This is the IP address where the {{object|#}} is listening for SIP requests from the service provider network. This IP address value is populated in the host portion of the {{param|ContactURI}} parameter.  

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress ipaddress;
	/**
	 * This is the port where the {{object|#}} is listening for SIP requests from the service provider network. This IP port value is populated in the port portion of the {{param|ContactURI}} parameter. 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long port;
	/**
	 * The current Contact URI of the {{object|#}}.

If SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter, then this parameter is populated in the Contact header field of the REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ContactURI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String contactURI;
	/**
	 * Time when this registration will expire. This parameter is valid only when SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter.

If this registration never expires, this parameter SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ExpireTime")
	public LocalDateTime expireTime;
	/**
	 * The interval in seconds between sending a periodic ping request toward the network (i.e. a SIP OPTIONS ping). The CPE performs the periodic ping request to verify connectivity with the network when SIP registration procedures are not used (i.e. when the SIP client {{param|#.RegisterMode}} is {{enum|STATIC|#.RegisterMode}}). A value of '0' indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PingInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 65535)
	public Long pingInterval;
	/**
	 * This is the User-Agent field reported in the SIP header of the REGISTER message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserAgent")
	@Size(max = 256)
	public String userAgent;

	public Contact() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this {{object}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this {{object}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this {{object}}.
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
	 * Get the indicates the status of this {{object}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this {{object}}.
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
	 * Get the mechanism via which this {{object}} was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which this {{object}} was assigned.  {{enum}}
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which this {{object}} was assigned.  {{enum}}
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
	 * Get the this is the IP address where the {{object|#}} is listening for SIP requests from the service provider network. This IP address value is populated in the host portion of the {{param|ContactURI}} parameter.  

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the this is the IP address where the {{object|#}} is listening for SIP requests from the service provider network. This IP address value is populated in the host portion of the {{param|ContactURI}} parameter.  

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the this is the IP address where the {{object|#}} is listening for SIP requests from the service provider network. This IP address value is populated in the host portion of the {{param|ContactURI}} parameter.  

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
	 * Get the this is the port where the {{object|#}} is listening for SIP requests from the service provider network. This IP port value is populated in the port portion of the {{param|ContactURI}} parameter. 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the this is the port where the {{object|#}} is listening for SIP requests from the service provider network. This IP port value is populated in the port portion of the {{param|ContactURI}} parameter. 

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the this is the port where the {{object|#}} is listening for SIP requests from the service provider network. This IP port value is populated in the port portion of the {{param|ContactURI}} parameter. 

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
	 * Get the current Contact URI of the {{object|#}}.

If SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter, then this parameter is populated in the Contact header field of the REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getContactURI() {
		return contactURI;
	}

	/**
	 * Set the current Contact URI of the {{object|#}}.

If SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter, then this parameter is populated in the Contact header field of the REGISTER request.

This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param contactURI the input value
	 */
	public void  setContactURI(String contactURI) {
		this.contactURI = contactURI;
	}

	/**
	 * Set the current Contact URI of the {{object|#}}.

If SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter, then this parameter is populated in the Contact header field of the REGISTER request.

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
	 * Get the time when this registration will expire. This parameter is valid only when SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter.

If this registration never expires, this parameter SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	/**
	 * Set the time when this registration will expire. This parameter is valid only when SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter.

If this registration never expires, this parameter SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param expireTime the input value
	 */
	public void  setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * Set the time when this registration will expire. This parameter is valid only when SIP registration procedures are being used, as determined by the {{param|#.RegisterMode}} parameter.

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
	 * Get the interval in seconds between sending a periodic ping request toward the network (i.e. a SIP OPTIONS ping). The CPE performs the periodic ping request to verify connectivity with the network when SIP registration procedures are not used (i.e. when the SIP client {{param|#.RegisterMode}} is {{enum|STATIC|#.RegisterMode}}). A value of '0' indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPingInterval() {
		return pingInterval;
	}

	/**
	 * Set the interval in seconds between sending a periodic ping request toward the network (i.e. a SIP OPTIONS ping). The CPE performs the periodic ping request to verify connectivity with the network when SIP registration procedures are not used (i.e. when the SIP client {{param|#.RegisterMode}} is {{enum|STATIC|#.RegisterMode}}). A value of '0' indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 * @param pingInterval the input value
	 */
	public void  setPingInterval(Long pingInterval) {
		this.pingInterval = pingInterval;
	}

	/**
	 * Set the interval in seconds between sending a periodic ping request toward the network (i.e. a SIP OPTIONS ping). The CPE performs the periodic ping request to verify connectivity with the network when SIP registration procedures are not used (i.e. when the SIP client {{param|#.RegisterMode}} is {{enum|STATIC|#.RegisterMode}}). A value of '0' indicates that the CPE should not perform the periodic ping request.
	 *
	 * @since 2.0
	 * @param pingInterval the input value
	 * @return this instance
	 */
	public Contact withPingInterval(Long pingInterval) {
		this.pingInterval = pingInterval;
		return this;
	}

	/**
	 * Get the this is the User-Agent field reported in the SIP header of the REGISTER message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * Set the this is the User-Agent field reported in the SIP header of the REGISTER message.
	 *
	 * @since 2.0
	 * @param userAgent the input value
	 */
	public void  setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * Set the this is the User-Agent field reported in the SIP header of the REGISTER message.
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