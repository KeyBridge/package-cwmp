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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.dynamicdns.Client;
import org.broadbandforum.tr181.device.dynamicdns.Server;

	/**
	 * Properties for Dynamic DNS.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.DynamicDNS.")
public class DynamicDNS {

	/**
	 * List of Dynamic DNS service names that are supported by the CPE.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "SupportedServices")
	@Size(max = 1024)
	@XmlList
	public Collection<String> supportedServices;
	/**
	 * Client properties for Dynamic DNS. 

        A dynamic DNS client is responsible for verifying IP address changes and updating information from a subscribed account on a Dynamic DNS Server.

        For enabled table entries, if {{param|Server}} is not a valid reference then the table entry is inoperable and the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 */
	@XmlElementWrapper(name = "clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite")
	public Collection<Client> clients;
	/**
	 * Table of Dynamic DNS servers available for this CPE.
	 */
	@XmlElementWrapper(name = "servers")
	@XmlElement(name = "Server")
	@CWMPParameter(access = "readWrite")
	public Collection<Server> servers;

	public DynamicDNS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the list of Dynamic DNS service names that are supported by the CPE.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Collection<String> getSupportedServices() {
		if (this.supportedServices == null){ this.supportedServices=new ArrayList<>();}
		return supportedServices;
	}

	/**
	 * Set the list of Dynamic DNS service names that are supported by the CPE.
	 *
	 * @since 2.10
	 * @param supportedServices the input value
	 */
	public void  setSupportedServices(Collection<String> supportedServices) {
		this.supportedServices = supportedServices;
	}

	/**
	 * Set the list of Dynamic DNS service names that are supported by the CPE.
	 *
	 * @since 2.10
	 * @param string the input value
	 * @return this instance
	 */
	public DynamicDNS withSupportedServices(String string) {
		getSupportedServices().add(string);
		return this;
	}

	/**
	 * Get the client properties for Dynamic DNS. 

        A dynamic DNS client is responsible for verifying IP address changes and updating information from a subscribed account on a Dynamic DNS Server.

        For enabled table entries, if {{param|Server}} is not a valid reference then the table entry is inoperable and the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the client properties for Dynamic DNS. 

        A dynamic DNS client is responsible for verifying IP address changes and updating information from a subscribed account on a Dynamic DNS Server.

        For enabled table entries, if {{param|Server}} is not a valid reference then the table entry is inoperable and the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the client properties for Dynamic DNS. 

        A dynamic DNS client is responsible for verifying IP address changes and updating information from a subscribed account on a Dynamic DNS Server.

        For enabled table entries, if {{param|Server}} is not a valid reference then the table entry is inoperable and the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public DynamicDNS withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the table of Dynamic DNS servers available for this CPE.
	 *
	 * @return the value
	 */
	public Collection<Server> getServers() {
		if (this.servers == null){ this.servers=new ArrayList<>();}
		return servers;
	}

	/**
	 * Set the table of Dynamic DNS servers available for this CPE.
	 *
	 * @param servers the input value
	 */
	public void  setServers(Collection<Server> servers) {
		this.servers = servers;
	}

	/**
	 * Set the table of Dynamic DNS servers available for this CPE.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public DynamicDNS withServer(Server server) {
		getServers().add(server);
		return this;
	}

	//</editor-fold>

}