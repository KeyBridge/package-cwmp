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
package org.broadbandforum.tr104.voiceservice.capabilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.capabilities.sip.Client;
import org.broadbandforum.tr104.voiceservice.capabilities.sip.Registrar;

	/**
	 * SIP-specific capabilities (as defined in {{bibref|RFC3261}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.SIP.")
@XmlRootElement(name = "SIP")
@XmlType(name = "VoiceService.Capabilities.SIP")
@XmlAccessorType(XmlAccessType.FIELD)
public class SIP {

	/**
	 * SIP client capabilities.
	 */
	@XmlElement(name = "Client")
	public Client client;
	/**
	 * SIP registrar capabilities.
	 */
	@XmlElement(name = "Registrar")
	public Registrar registrar;

	public SIP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the sip client capabilities.
	 *
	 * @return the value
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Set the sip client capabilities.
	 *
	 * @param client the input value
	 */
	public void  setClient(Client client) {
		this.client = client;
	}

	/**
	 * Set the sip client capabilities.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public SIP withClient(Client client) {
		this.client = client;
		return this;
	}

	/**
	 * Get the sip registrar capabilities.
	 *
	 * @return the value
	 */
	public Registrar getRegistrar() {
		return registrar;
	}

	/**
	 * Set the sip registrar capabilities.
	 *
	 * @param registrar the input value
	 */
	public void  setRegistrar(Registrar registrar) {
		this.registrar = registrar;
	}

	/**
	 * Set the sip registrar capabilities.
	 *
	 * @param registrar the input value
	 * @return this instance
	 */
	public SIP withRegistrar(Registrar registrar) {
		this.registrar = registrar;
		return this;
	}

	//</editor-fold>

}