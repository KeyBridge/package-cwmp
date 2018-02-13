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
import org.broadbandforum.tr104.voiceservice.sip.Client;
import org.broadbandforum.tr104.voiceservice.sip.Network;
import org.broadbandforum.tr104.voiceservice.sip.Proxy;
import org.broadbandforum.tr104.voiceservice.sip.Registrar;

	/**
	 * This object is dedicated to SIP as defined in {{bibref|RFC3261}}. It models SIP networks, clients, proxies and registrars.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.")
@XmlRootElement(name = "SIP")
@XmlType(name = "VoiceService.SIP")
@XmlAccessorType(XmlAccessType.FIELD)
public class SIP {

	/**
	 * SIP client table (a Client as described in {{bibref|TR-104i2|Section 4.2}}). Each SIP client maintains its identity-to-location (i.e., RegisterURI-to-ContactURI) binding for SIP signaling exchanged between the client and the network.

For CPE use cases where {{object|.CallControl}} is used to map network-facing to user-facing objects, the relationship between the SIP client object and its associated {{object|.CallControl.Line}} object(s) is determined by the {{param|RegisterMode}} parameter, as follows:

: - In case of RFC3261-style explicit registration of SIP AoRs, only a single line shall be associated with each SIP client.

: - In case of RFC6140 or IMS/TISPAN-style registration, multiple lines can be associated with each SIP client. The set of lines associated with a SIP client constitute an 'identity set'. In this case, registering the single SIP client implicitly registers the identities of all associated lines.

: - In the case where the client does not register with the network ({{param|RegisterMode}} is {{enum|STATIC|RegisterMode}}), multiple lines can be associated with each SIP client.
	 */
	@XmlElementWrapper(name = "Clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite")
	public Collection<Client> clients;
	/**
	 * This object models a SIP network (a network as described in {{bibref|TR-104i2|Section 4.2}}). SIP networks are used by SIP {{object|#.Client}} objects so that common parameters do not have to be provisioned multiple times.
	 */
	@XmlElementWrapper(name = "Networks")
	@XmlElement(name = "Network")
	@CWMPParameter(access = "readWrite")
	public Collection<Network> networks;
	/**
	 * Global SIP parameters used by the CPE when acting as proxy for SIP user agents.
	 */
	@XmlElementWrapper(name = "Proxies")
	@XmlElement(name = "Proxy")
	@CWMPParameter(access = "readWrite")
	public Collection<Proxy> proxies;
	/**
	 * Global SIP parameters used by the CPE when acting as registrar server for externally connected SIP user agents. This object also contains the global SIP parameters used by the CPE when it acts as static identity-to-location binding database for externally connected SIP user agents that don't register (i.e. static-mode SIP-PBX).
	 */
	@XmlElementWrapper(name = "Registrars")
	@XmlElement(name = "Registrar")
	@CWMPParameter(access = "readWrite")
	public Collection<Registrar> registrars;

	public SIP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the sip client table (a Client as described in {{bibref|TR-104i2|Section 4.2}}). Each SIP client maintains its identity-to-location (i.e., RegisterURI-to-ContactURI) binding for SIP signaling exchanged between the client and the network.

For CPE use cases where {{object|.CallControl}} is used to map network-facing to user-facing objects, the relationship between the SIP client object and its associated {{object|.CallControl.Line}} object(s) is determined by the {{param|RegisterMode}} parameter, as follows:

: - In case of RFC3261-style explicit registration of SIP AoRs, only a single line shall be associated with each SIP client.

: - In case of RFC6140 or IMS/TISPAN-style registration, multiple lines can be associated with each SIP client. The set of lines associated with a SIP client constitute an 'identity set'. In this case, registering the single SIP client implicitly registers the identities of all associated lines.

: - In the case where the client does not register with the network ({{param|RegisterMode}} is {{enum|STATIC|RegisterMode}}), multiple lines can be associated with each SIP client.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the sip client table (a Client as described in {{bibref|TR-104i2|Section 4.2}}). Each SIP client maintains its identity-to-location (i.e., RegisterURI-to-ContactURI) binding for SIP signaling exchanged between the client and the network.

For CPE use cases where {{object|.CallControl}} is used to map network-facing to user-facing objects, the relationship between the SIP client object and its associated {{object|.CallControl.Line}} object(s) is determined by the {{param|RegisterMode}} parameter, as follows:

: - In case of RFC3261-style explicit registration of SIP AoRs, only a single line shall be associated with each SIP client.

: - In case of RFC6140 or IMS/TISPAN-style registration, multiple lines can be associated with each SIP client. The set of lines associated with a SIP client constitute an 'identity set'. In this case, registering the single SIP client implicitly registers the identities of all associated lines.

: - In the case where the client does not register with the network ({{param|RegisterMode}} is {{enum|STATIC|RegisterMode}}), multiple lines can be associated with each SIP client.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the sip client table (a Client as described in {{bibref|TR-104i2|Section 4.2}}). Each SIP client maintains its identity-to-location (i.e., RegisterURI-to-ContactURI) binding for SIP signaling exchanged between the client and the network.

For CPE use cases where {{object|.CallControl}} is used to map network-facing to user-facing objects, the relationship between the SIP client object and its associated {{object|.CallControl.Line}} object(s) is determined by the {{param|RegisterMode}} parameter, as follows:

: - In case of RFC3261-style explicit registration of SIP AoRs, only a single line shall be associated with each SIP client.

: - In case of RFC6140 or IMS/TISPAN-style registration, multiple lines can be associated with each SIP client. The set of lines associated with a SIP client constitute an 'identity set'. In this case, registering the single SIP client implicitly registers the identities of all associated lines.

: - In the case where the client does not register with the network ({{param|RegisterMode}} is {{enum|STATIC|RegisterMode}}), multiple lines can be associated with each SIP client.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public SIP withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the this object models a SIP network (a network as described in {{bibref|TR-104i2|Section 4.2}}). SIP networks are used by SIP {{object|#.Client}} objects so that common parameters do not have to be provisioned multiple times.
	 *
	 * @return the value
	 */
	public Collection<Network> getNetworks() {
		if (this.networks == null){ this.networks=new ArrayList<>();}
		return networks;
	}

	/**
	 * Set the this object models a SIP network (a network as described in {{bibref|TR-104i2|Section 4.2}}). SIP networks are used by SIP {{object|#.Client}} objects so that common parameters do not have to be provisioned multiple times.
	 *
	 * @param networks the input value
	 */
	public void  setNetworks(Collection<Network> networks) {
		this.networks = networks;
	}

	/**
	 * Set the this object models a SIP network (a network as described in {{bibref|TR-104i2|Section 4.2}}). SIP networks are used by SIP {{object|#.Client}} objects so that common parameters do not have to be provisioned multiple times.
	 *
	 * @param network the input value
	 * @return this instance
	 */
	public SIP withNetwork(Network network) {
		getNetworks().add(network);
		return this;
	}

	/**
	 * Get the global SIP parameters used by the CPE when acting as proxy for SIP user agents.
	 *
	 * @return the value
	 */
	public Collection<Proxy> getProxies() {
		if (this.proxies == null){ this.proxies=new ArrayList<>();}
		return proxies;
	}

	/**
	 * Set the global SIP parameters used by the CPE when acting as proxy for SIP user agents.
	 *
	 * @param proxies the input value
	 */
	public void  setProxies(Collection<Proxy> proxies) {
		this.proxies = proxies;
	}

	/**
	 * Set the global SIP parameters used by the CPE when acting as proxy for SIP user agents.
	 *
	 * @param proxy the input value
	 * @return this instance
	 */
	public SIP withProxy(Proxy proxy) {
		getProxies().add(proxy);
		return this;
	}

	/**
	 * Get the global SIP parameters used by the CPE when acting as registrar server for externally connected SIP user agents. This object also contains the global SIP parameters used by the CPE when it acts as static identity-to-location binding database for externally connected SIP user agents that don't register (i.e. static-mode SIP-PBX).
	 *
	 * @return the value
	 */
	public Collection<Registrar> getRegistrars() {
		if (this.registrars == null){ this.registrars=new ArrayList<>();}
		return registrars;
	}

	/**
	 * Set the global SIP parameters used by the CPE when acting as registrar server for externally connected SIP user agents. This object also contains the global SIP parameters used by the CPE when it acts as static identity-to-location binding database for externally connected SIP user agents that don't register (i.e. static-mode SIP-PBX).
	 *
	 * @param registrars the input value
	 */
	public void  setRegistrars(Collection<Registrar> registrars) {
		this.registrars = registrars;
	}

	/**
	 * Set the global SIP parameters used by the CPE when acting as registrar server for externally connected SIP user agents. This object also contains the global SIP parameters used by the CPE when it acts as static identity-to-location binding database for externally connected SIP user agents that don't register (i.e. static-mode SIP-PBX).
	 *
	 * @param registrar the input value
	 * @return this instance
	 */
	public SIP withRegistrar(Registrar registrar) {
		getRegistrars().add(registrar);
		return this;
	}

	//</editor-fold>

}