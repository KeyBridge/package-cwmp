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
package org.broadbandforum.tr098.internetgatewaydevice.dns;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.dns.sd.Service;

	/**
	 * This object contains the DNS Service Discovery {{bibref|DNS-SD}} object and parameters necessary to discover services and their associated devices.

Upon reboot the the contents of the service table are repopulated. When the DNS.SD service is disabled, the contents of the service table is implementation specific.
	 *
	 * @since 1.12
	 */
@CWMPObject(name = "InternetGatewayDevice.DNS.SD.")
public class SD {

	/**
	 * The parameter, when {{true}}, enables the discovery of DNS-SD services hosted by other devices.
	 *
	 * @since 1.12
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
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
	 */
	@XmlElementWrapper(name = "services")
	@XmlElement(name = "Service")
	public Collection<Service> services;

	public SD() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the parameter, when {{true}}, enables the discovery of DNS-SD services hosted by other devices.
	 *
	 * @since 1.12
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the parameter, when {{true}}, enables the discovery of DNS-SD services hosted by other devices.
	 *
	 * @since 1.12
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the parameter, when {{true}}, enables the discovery of DNS-SD services hosted by other devices.
	 *
	 * @since 1.12
	 * @param enable the input value
	 * @return this instance
	 */
	public SD withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{object}} table contains discovered DNS-SD services. DNS.SD service information is provided in DNS RR SRV records {{bibref|RFC2782}}. The Service Instance Name {{bibref|DNS-SD|Section 4.1 Structured Instance Names}} further specifies information about the service name (RFC2782 Service field) and domain name (RFC2782 Name field) in the form:

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
	 * @return the value
	 */
	public Collection<Service> getServices() {
		if (this.services == null){ this.services=new ArrayList<>();}
		return services;
	}

	/**
	 * Set the {{object}} table contains discovered DNS-SD services. DNS.SD service information is provided in DNS RR SRV records {{bibref|RFC2782}}. The Service Instance Name {{bibref|DNS-SD|Section 4.1 Structured Instance Names}} further specifies information about the service name (RFC2782 Service field) and domain name (RFC2782 Name field) in the form:

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
	 * @param services the input value
	 */
	public void  setServices(Collection<Service> services) {
		this.services = services;
	}

	/**
	 * Set the {{object}} table contains discovered DNS-SD services. DNS.SD service information is provided in DNS RR SRV records {{bibref|RFC2782}}. The Service Instance Name {{bibref|DNS-SD|Section 4.1 Structured Instance Names}} further specifies information about the service name (RFC2782 Service field) and domain name (RFC2782 Name field) in the form:

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
	 * @param service the input value
	 * @return this instance
	 */
	public SD withService(Service service) {
		getServices().add(service);
		return this;
	}

	//</editor-fold>

}