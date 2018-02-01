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
import org.broadbandforum.tr181.device.dhcpv6.Client;
import org.broadbandforum.tr181.device.dhcpv6.Server;

	/**
	 * The Dynamic Host Configuration Protocol (DHCP) IPv6 object {{bibref|RFC3315}}. This entire object applies to IPv6 only. It contains the {{object|Client}} and {{object|Server}} objects.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.")
public class DHCPv6 {

	/**
	 * This object contains DHCPv6 client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference.  If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}.  However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite", minEntries = 1)
	public Collection<Client> clients;
	/**
	 * DHCPv6 server configuration.
	 */
	@XmlElement(name = "Server")
	public Server server;

	public DHCPv6() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains DHCPv6 client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference.  If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}.  However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the this object contains DHCPv6 client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference.  If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}.  However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the this object contains DHCPv6 client settings for an associated ''IP Interface'' indicated by {{param|Interface}}.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference.  If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}.  However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public DHCPv6 withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the dhcPv6 server configuration.
	 *
	 * @return the value
	 */
	public Server getServer() {
		return server;
	}

	/**
	 * Set the dhcPv6 server configuration.
	 *
	 * @param server the input value
	 */
	public void  setServer(Server server) {
		this.server = server;
	}

	/**
	 * Set the dhcPv6 server configuration.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public DHCPv6 withServer(Server server) {
		this.server = server;
		return this;
	}

	//</editor-fold>

}