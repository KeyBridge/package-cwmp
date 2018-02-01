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
package org.broadbandforum.tr104.voiceservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.voiceservice.mgcp.Client;
import org.broadbandforum.tr104.voiceservice.mgcp.Network;

	/**
	 * This object is dedicated to MGCP as defined in {{bibref|RFC3435}}. It models MGCP clients and networks.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.MGCP.")
public class MGCP {

	/**
	 * MGCP client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each MGCP client maintains a registration for the MGCP identities of the associated line with the {{object|#.Network}}.
	 */
	@XmlElementWrapper(name = "clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite")
	public Collection<Client> clients;
	/**
	 * This object models a MGCP network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 */
	@XmlElementWrapper(name = "networks")
	@XmlElement(name = "Network")
	@CWMPParameter(access = "readWrite")
	public Collection<Network> networks;

	public MGCP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mgcP client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each MGCP client maintains a registration for the MGCP identities of the associated line with the {{object|#.Network}}.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the mgcP client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each MGCP client maintains a registration for the MGCP identities of the associated line with the {{object|#.Network}}.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the mgcP client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each MGCP client maintains a registration for the MGCP identities of the associated line with the {{object|#.Network}}.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public MGCP withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the this object models a MGCP network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @return the value
	 */
	public Collection<Network> getNetworks() {
		if (this.networks == null){ this.networks=new ArrayList<>();}
		return networks;
	}

	/**
	 * Set the this object models a MGCP network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @param networks the input value
	 */
	public void  setNetworks(Collection<Network> networks) {
		this.networks = networks;
	}

	/**
	 * Set the this object models a MGCP network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @param network the input value
	 * @return this instance
	 */
	public MGCP withNetwork(Network network) {
		getNetworks().add(network);
		return this;
	}

	//</editor-fold>

}