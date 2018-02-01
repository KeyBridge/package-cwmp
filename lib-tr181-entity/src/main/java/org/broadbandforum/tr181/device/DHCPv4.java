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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.dhcpv4.Client;
import org.broadbandforum.tr181.device.dhcpv4.Relay;
import org.broadbandforum.tr181.device.dhcpv4.Server;

	/**
	 * The Dynamic Host Configuration Protocol (DHCP) IPv4 object {{bibref|RFC2131}}. This entire object applies to IPv4 only. It contains the {{object|Client}}, {{object|Server}}, and {{object|Relay}} objects.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DHCPv4.")
public class DHCPv4 {

	/**
	 * This object contains DHCP client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite", minEntries = 1)
	public Collection<Client> clients;
	/**
	 * DHCP server configuration.
	 */
	@XmlElement(name = "Server")
	public Server server;
	/**
	 * DHCP Relay Agent (conditional relaying).
	 */
	@XmlElement(name = "Relay")
	public Relay relay;

	public DHCPv4() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains DHCP client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the this object contains DHCP client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the this object contains DHCP client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public DHCPv4 withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the dhcP server configuration.
	 *
	 * @return the value
	 */
	public Server getServer() {
		return server;
	}

	/**
	 * Set the dhcP server configuration.
	 *
	 * @param server the input value
	 */
	public void  setServer(Server server) {
		this.server = server;
	}

	/**
	 * Set the dhcP server configuration.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public DHCPv4 withServer(Server server) {
		this.server = server;
		return this;
	}

	/**
	 * Get the dhcP Relay Agent (conditional relaying).
	 *
	 * @return the value
	 */
	public Relay getRelay() {
		return relay;
	}

	/**
	 * Set the dhcP Relay Agent (conditional relaying).
	 *
	 * @param relay the input value
	 */
	public void  setRelay(Relay relay) {
		this.relay = relay;
	}

	/**
	 * Set the dhcP Relay Agent (conditional relaying).
	 *
	 * @param relay the input value
	 * @return this instance
	 */
	public DHCPv4 withRelay(Relay relay) {
		this.relay = relay;
		return this;
	}

	//</editor-fold>

}