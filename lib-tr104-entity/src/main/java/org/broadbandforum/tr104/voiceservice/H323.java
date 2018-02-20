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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.voiceservice.h323.Client;
import org.broadbandforum.tr104.voiceservice.h323.Network;

	/**
	 * This object is dedicated to H.323 as defined in {{bibref|H.323}}. It models H.323 clients and networks.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.H323.")
@XmlRootElement(name = "VoiceService.H323")
@XmlType(name = "VoiceService.H323")
@XmlAccessorType(XmlAccessType.FIELD)
public class H323 {

	/**
	 * H.323 client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each H.323 client maintains a registration for the H.323 identities of the associated line with the {{object|#.Network}}.
	 */
	@XmlElementWrapper(name = "Clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite")
	public Collection<Client> clients;
	/**
	 * This object models a H.323 network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 */
	@XmlElementWrapper(name = "Networks")
	@XmlElement(name = "Network")
	@CWMPParameter(access = "readWrite")
	public Collection<Network> networks;

	public H323() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the h.323 client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each H.323 client maintains a registration for the H.323 identities of the associated line with the {{object|#.Network}}.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the h.323 client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each H.323 client maintains a registration for the H.323 identities of the associated line with the {{object|#.Network}}.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the h.323 client table (a client as described in {{bibref|TR-104i2|Section 4.2}}). Each H.323 client maintains a registration for the H.323 identities of the associated line with the {{object|#.Network}}.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public H323 withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the this object models a H.323 network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @return the value
	 */
	public Collection<Network> getNetworks() {
		if (this.networks == null){ this.networks=new ArrayList<>();}
		return networks;
	}

	/**
	 * Set the this object models a H.323 network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @param networks the input value
	 */
	public void  setNetworks(Collection<Network> networks) {
		this.networks = networks;
	}

	/**
	 * Set the this object models a H.323 network (a network as described in {{bibref|TR-104i2|Section 4.2}}).
	 *
	 * @param network the input value
	 * @return this instance
	 */
	public H323 withNetwork(Network network) {
		getNetworks().add(network);
		return this;
	}

	//</editor-fold>

}