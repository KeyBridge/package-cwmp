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
	 * Table of Fully Qualified Domain Names for this {{object|#}} instance in order to connect to the SIP server as described in {{bibref|RFC2782}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Network.{i}.FQDNServer.{i}.")
@XmlRootElement(name = "FQDNServer")
@XmlType(name = "VoiceService.SIP.Network.FQDNServer")
@XmlAccessorType(XmlAccessType.FIELD)
public class FQDNServer {

	/**
	 * Enables or disables this FQDN server.
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
	 * Mechanism via which the FQDN server was assigned.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * The domain name of the target host.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Domain")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String domain;
	/**
	 * A server selection mechanism. The weight field specifies a relative weight for entries with the same priority.

Larger weights SHOULD be given a proportionately higher probability of being selected.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Weight")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long weight = 0L;
	/**
	 * The priority of this target host.  A client MUST attempt to contact the target host with the lowest-numbered priority it can reach;

target hosts with the same priority SHOULD be tried in an order defined by the weight field.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long priority = 0L;
	/**
	 * The port on this target host of this service.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long port;
	/**
	 * {{list|the IP Addresses that the FQDN resolves to}}

The order in which the addresses appear in the list MAY imply priority.  This parameter MAY be modified by the ACS only if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPAddresses")
	@CWMPParameter(access = "readWrite")
	public IPAddress ipaddresses;

	public FQDNServer() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this FQDN server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this FQDN server.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this FQDN server.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public FQDNServer withEnable(Boolean enable) {
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
	public FQDNServer withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the mechanism via which the FQDN server was assigned.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the FQDN server was assigned.
	 *
	 * @since 2.0
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the FQDN server was assigned.
	 *
	 * @since 2.0
	 * @param origin the input value
	 * @return this instance
	 */
	public FQDNServer withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the domain name of the target host.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Set the domain name of the target host.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param domain the input value
	 */
	public void  setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Set the domain name of the target host.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param domain the input value
	 * @return this instance
	 */
	public FQDNServer withDomain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Get a server selection mechanism. The weight field specifies a relative weight for entries with the same priority.

Larger weights SHOULD be given a proportionately higher probability of being selected.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * Set a server selection mechanism. The weight field specifies a relative weight for entries with the same priority.

Larger weights SHOULD be given a proportionately higher probability of being selected.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param weight the input value
	 */
	public void  setWeight(Long weight) {
		this.weight = weight;
	}

	/**
	 * Set a server selection mechanism. The weight field specifies a relative weight for entries with the same priority.

Larger weights SHOULD be given a proportionately higher probability of being selected.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param weight the input value
	 * @return this instance
	 */
	public FQDNServer withWeight(Long weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * Get the priority of this target host.  A client MUST attempt to contact the target host with the lowest-numbered priority it can reach;

target hosts with the same priority SHOULD be tried in an order defined by the weight field.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the priority of this target host.  A client MUST attempt to contact the target host with the lowest-numbered priority it can reach;

target hosts with the same priority SHOULD be tried in an order defined by the weight field.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the priority of this target host.  A client MUST attempt to contact the target host with the lowest-numbered priority it can reach;

target hosts with the same priority SHOULD be tried in an order defined by the weight field.  This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param priority the input value
	 * @return this instance
	 */
	public FQDNServer withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the port on this target host of this service.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the port on this target host of this service.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the port on this target host of this service.
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public FQDNServer withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the {{list|the IP Addresses that the FQDN resolves to}}

The order in which the addresses appear in the list MAY imply priority.  This parameter MAY be modified by the ACS only if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getIpaddresses() {
		return ipaddresses;
	}

	/**
	 * Set the {{list|the IP Addresses that the FQDN resolves to}}

The order in which the addresses appear in the list MAY imply priority.  This parameter MAY be modified by the ACS only if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param ipaddresses the input value
	 */
	public void  setIpaddresses(IPAddress ipaddresses) {
		this.ipaddresses = ipaddresses;
	}

	/**
	 * Set the {{list|the IP Addresses that the FQDN resolves to}}

The order in which the addresses appear in the list MAY imply priority.  This parameter MAY be modified by the ACS only if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.0
	 * @param ipaddresses the input value
	 * @return this instance
	 */
	public FQDNServer withIpaddresses(IPAddress ipaddresses) {
		this.ipaddresses = ipaddresses;
		return this;
	}

	//</editor-fold>

}