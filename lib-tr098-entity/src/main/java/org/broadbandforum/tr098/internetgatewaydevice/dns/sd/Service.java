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
package org.broadbandforum.tr098.internetgatewaydevice.dns.sd;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.dns.sd.service.TextRecord;

	/**
	 * The {{object}} table contains discovered DNS-SD services. DNS.SD service information is provided in DNS RR SRV records {{bibref|RFC2782}}. The Service Instance Name {{bibref|DNS-SD|Section 4.1 Structured Instance Names}} further specifies information about the service name (RFC2782 Service field) and domain name (RFC2782 Name field) in the form:

Service Instance Name = <InstanceName> . <Service> . <Domain>

<Service> = _<ApplicationProtocol> . _<TransportProtocol>

RFC2782 Service field will always be equal to <InstanceName>. <Service>

RFC2782 Name field will always be equal to <Domain> 

For example, an SSH service might have:

*{{param|InstanceName}} = "Secure Shell (SSH))"

*{{param|ApplicationProtocol}} = "ssh"

*{{param|TransportProtocol}} = "TCP"

*{{param|Domain}} = "example.com"

*{{param|Port}} = 22

*{{param|Target}} = "ssh.example.com."
	 *
	 * @since 1.12
	 */
@CWMPObject(name = "InternetGatewayDevice.DNS.SD.Service.{i}.")
public class Service {

	/**
	 * Human-readable instance name {{bibref|DNS-SD|Section 4.1.1 Instance Names}} (i.e. The "<{{param}}>" portion of the '"Service Instance Name'").
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "InstanceName")
	@Size(max = 63)
	public String instanceName;
	/**
	 * The Application Protocol, without the leading underscore, associated with the service (e.g., daap) as defined by the DNS-SD service {{bibref|DNS-SD|Section 7 Application Protocol Names}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "ApplicationProtocol")
	@Size(max = 15)
	public String applicationProtocol;
	/**
	 * The Transport Protocol associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.2 Service Names}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "TransportProtocol")
	public String transportProtocol;
	/**
	 * The value extracted from the Name field of the DNS SRV record {{bibref|RFC2782}} which represents the fully qualified domain name (FQDN) associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.3 Domain Names}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Domain")
	@Size(max = 256)
	public String domain;
	/**
	 * The value extracted from the Port field of the DNS SRV record {{bibref|RFC2782}} that is used to contact the service.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Port")
	@Size(max = 65535)
	public Long port;
	/**
	 * The fully qualified domain name (FQDN) with the trailing dot "." of the target host implementing the service as in the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Target")
	@Size(max = 256)
	public String target;
	/**
	 * The status of the discovered {{object}} at {{param|LastUpdate}} time. {{enum}}

The ability to instantiate an inactive {{object}} is OPTIONAL.

The time an inactive {{object}} remains listed in this table is a local matter to the device.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The date and time at which the last advertisement for this {{object}} was received.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "LastUpdate")
	public LocalDateTime lastUpdate;
	/**
	 * {{list}} {{reference|all Host table entries, active or inactive, that correspond to this discovered DNS.SD service. As such, when entries are added or removed from the Host tables the value of this parameter MUST be updated accordingly|ignore}}
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Host")
	@Size(max = 1024)
	@XmlList
	public Collection<String> host;
	/**
	 * The value extracted from the TTL field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "TimeToLive")
	@Size(max = 2147483647)
	public Long timeToLive;
	/**
	 * The value extracted from the Priority field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Priority")
	@Size(max = 65535)
	public Long priority;
	/**
	 * A server selection mechanism. The value extracted from the Weight field of the DNS SRV record {{bibref|RFC2782}} that specifies the relative weight for entries with the same {{param|Priority}}.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Weight")
	@Size(max = 65535)
	public Long weight;
	/**
	 * This object maintains an instance of a (key/value pairs) of the service. The information is extracted from DNS TXT records {{bibref|RFC1035}} of the discovered service.

When multiple instances of the {{object}} table have the same value for the {{param|Key}} parameter, the implementation is CPE specific.
	 */
	@XmlElementWrapper(name = "textRecords")
	@XmlElement(name = "TextRecord")
	public Collection<TextRecord> textRecords;

	public Service() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the human-readable instance name {{bibref|DNS-SD|Section 4.1.1 Instance Names}} (i.e. The "<{{param}}>" portion of the '"Service Instance Name'").
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * Set the human-readable instance name {{bibref|DNS-SD|Section 4.1.1 Instance Names}} (i.e. The "<{{param}}>" portion of the '"Service Instance Name'").
	 *
	 * @since 1.12
	 * @param instanceName the input value
	 */
	public void  setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	/**
	 * Set the human-readable instance name {{bibref|DNS-SD|Section 4.1.1 Instance Names}} (i.e. The "<{{param}}>" portion of the '"Service Instance Name'").
	 *
	 * @since 1.12
	 * @param instanceName the input value
	 * @return this instance
	 */
	public Service withInstanceName(String instanceName) {
		this.instanceName = instanceName;
		return this;
	}

	/**
	 * Get the Application Protocol, without the leading underscore, associated with the service (e.g., daap) as defined by the DNS-SD service {{bibref|DNS-SD|Section 7 Application Protocol Names}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getApplicationProtocol() {
		return applicationProtocol;
	}

	/**
	 * Set the Application Protocol, without the leading underscore, associated with the service (e.g., daap) as defined by the DNS-SD service {{bibref|DNS-SD|Section 7 Application Protocol Names}}.
	 *
	 * @since 1.12
	 * @param applicationProtocol the input value
	 */
	public void  setApplicationProtocol(String applicationProtocol) {
		this.applicationProtocol = applicationProtocol;
	}

	/**
	 * Set the Application Protocol, without the leading underscore, associated with the service (e.g., daap) as defined by the DNS-SD service {{bibref|DNS-SD|Section 7 Application Protocol Names}}.
	 *
	 * @since 1.12
	 * @param applicationProtocol the input value
	 * @return this instance
	 */
	public Service withApplicationProtocol(String applicationProtocol) {
		this.applicationProtocol = applicationProtocol;
		return this;
	}

	/**
	 * Get the Transport Protocol associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.2 Service Names}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getTransportProtocol() {
		return transportProtocol;
	}

	/**
	 * Set the Transport Protocol associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.2 Service Names}}.
	 *
	 * @since 1.12
	 * @param transportProtocol the input value
	 */
	public void  setTransportProtocol(String transportProtocol) {
		this.transportProtocol = transportProtocol;
	}

	/**
	 * Set the Transport Protocol associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.2 Service Names}}.
	 *
	 * @since 1.12
	 * @param transportProtocol the input value
	 * @return this instance
	 */
	public Service withTransportProtocol(String transportProtocol) {
		this.transportProtocol = transportProtocol;
		return this;
	}

	/**
	 * Get the value extracted from the Name field of the DNS SRV record {{bibref|RFC2782}} which represents the fully qualified domain name (FQDN) associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.3 Domain Names}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Set the value extracted from the Name field of the DNS SRV record {{bibref|RFC2782}} which represents the fully qualified domain name (FQDN) associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.3 Domain Names}}.
	 *
	 * @since 1.12
	 * @param domain the input value
	 */
	public void  setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * Set the value extracted from the Name field of the DNS SRV record {{bibref|RFC2782}} which represents the fully qualified domain name (FQDN) associated with the service as defined by the DNS-SD service {{bibref|DNS-SD|Section 4.1.3 Domain Names}}.
	 *
	 * @since 1.12
	 * @param domain the input value
	 * @return this instance
	 */
	public Service withDomain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * Get the value extracted from the Port field of the DNS SRV record {{bibref|RFC2782}} that is used to contact the service.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the value extracted from the Port field of the DNS SRV record {{bibref|RFC2782}} that is used to contact the service.
	 *
	 * @since 1.12
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the value extracted from the Port field of the DNS SRV record {{bibref|RFC2782}} that is used to contact the service.
	 *
	 * @since 1.12
	 * @param port the input value
	 * @return this instance
	 */
	public Service withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the fully qualified domain name (FQDN) with the trailing dot "." of the target host implementing the service as in the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Set the fully qualified domain name (FQDN) with the trailing dot "." of the target host implementing the service as in the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @param target the input value
	 */
	public void  setTarget(String target) {
		this.target = target;
	}

	/**
	 * Set the fully qualified domain name (FQDN) with the trailing dot "." of the target host implementing the service as in the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @param target the input value
	 * @return this instance
	 */
	public Service withTarget(String target) {
		this.target = target;
		return this;
	}

	/**
	 * Get the status of the discovered {{object}} at {{param|LastUpdate}} time. {{enum}}

The ability to instantiate an inactive {{object}} is OPTIONAL.

The time an inactive {{object}} remains listed in this table is a local matter to the device.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the discovered {{object}} at {{param|LastUpdate}} time. {{enum}}

The ability to instantiate an inactive {{object}} is OPTIONAL.

The time an inactive {{object}} remains listed in this table is a local matter to the device.
	 *
	 * @since 1.12
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the discovered {{object}} at {{param|LastUpdate}} time. {{enum}}

The ability to instantiate an inactive {{object}} is OPTIONAL.

The time an inactive {{object}} remains listed in this table is a local matter to the device.
	 *
	 * @since 1.12
	 * @param status the input value
	 * @return this instance
	 */
	public Service withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the date and time at which the last advertisement for this {{object}} was received.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Set the date and time at which the last advertisement for this {{object}} was received.
	 *
	 * @since 1.12
	 * @param lastUpdate the input value
	 */
	public void  setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Set the date and time at which the last advertisement for this {{object}} was received.
	 *
	 * @since 1.12
	 * @param lastUpdate the input value
	 * @return this instance
	 */
	public Service withLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|all Host table entries, active or inactive, that correspond to this discovered DNS.SD service. As such, when entries are added or removed from the Host tables the value of this parameter MUST be updated accordingly|ignore}}
	 *
	 * @since 1.12
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}} {{reference|all Host table entries, active or inactive, that correspond to this discovered DNS.SD service. As such, when entries are added or removed from the Host tables the value of this parameter MUST be updated accordingly|ignore}}
	 *
	 * @since 1.12
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} {{reference|all Host table entries, active or inactive, that correspond to this discovered DNS.SD service. As such, when entries are added or removed from the Host tables the value of this parameter MUST be updated accordingly|ignore}}
	 *
	 * @since 1.12
	 * @param string the input value
	 * @return this instance
	 */
	public Service withHost(String string) {
		getHost().add(string);
		return this;
	}

	/**
	 * Get the value extracted from the TTL field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public Long getTimeToLive() {
		return timeToLive;
	}

	/**
	 * Set the value extracted from the TTL field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @param timeToLive the input value
	 */
	public void  setTimeToLive(Long timeToLive) {
		this.timeToLive = timeToLive;
	}

	/**
	 * Set the value extracted from the TTL field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @param timeToLive the input value
	 * @return this instance
	 */
	public Service withTimeToLive(Long timeToLive) {
		this.timeToLive = timeToLive;
		return this;
	}

	/**
	 * Get the value extracted from the Priority field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the value extracted from the Priority field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the value extracted from the Priority field of the DNS SRV record {{bibref|RFC2782}}.
	 *
	 * @since 1.12
	 * @param priority the input value
	 * @return this instance
	 */
	public Service withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get a server selection mechanism. The value extracted from the Weight field of the DNS SRV record {{bibref|RFC2782}} that specifies the relative weight for entries with the same {{param|Priority}}.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * Set a server selection mechanism. The value extracted from the Weight field of the DNS SRV record {{bibref|RFC2782}} that specifies the relative weight for entries with the same {{param|Priority}}.
	 *
	 * @since 1.12
	 * @param weight the input value
	 */
	public void  setWeight(Long weight) {
		this.weight = weight;
	}

	/**
	 * Set a server selection mechanism. The value extracted from the Weight field of the DNS SRV record {{bibref|RFC2782}} that specifies the relative weight for entries with the same {{param|Priority}}.
	 *
	 * @since 1.12
	 * @param weight the input value
	 * @return this instance
	 */
	public Service withWeight(Long weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * Get the this object maintains an instance of a (key/value pairs) of the service. The information is extracted from DNS TXT records {{bibref|RFC1035}} of the discovered service.

When multiple instances of the {{object}} table have the same value for the {{param|Key}} parameter, the implementation is CPE specific.
	 *
	 * @return the value
	 */
	public Collection<TextRecord> getTextRecords() {
		if (this.textRecords == null){ this.textRecords=new ArrayList<>();}
		return textRecords;
	}

	/**
	 * Set the this object maintains an instance of a (key/value pairs) of the service. The information is extracted from DNS TXT records {{bibref|RFC1035}} of the discovered service.

When multiple instances of the {{object}} table have the same value for the {{param|Key}} parameter, the implementation is CPE specific.
	 *
	 * @param textRecords the input value
	 */
	public void  setTextRecords(Collection<TextRecord> textRecords) {
		this.textRecords = textRecords;
	}

	/**
	 * Set the this object maintains an instance of a (key/value pairs) of the service. The information is extracted from DNS TXT records {{bibref|RFC1035}} of the discovered service.

When multiple instances of the {{object}} table have the same value for the {{param|Key}} parameter, the implementation is CPE specific.
	 *
	 * @param textRecord the input value
	 * @return this instance
	 */
	public Service withTextRecord(TextRecord textRecord) {
		getTextRecords().add(textRecord);
		return this;
	}

	//</editor-fold>

}