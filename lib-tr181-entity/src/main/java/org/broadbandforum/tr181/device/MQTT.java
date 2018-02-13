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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.mqtt.Broker;
import org.broadbandforum.tr181.device.mqtt.Capabilities;
import org.broadbandforum.tr181.device.mqtt.Client;

	/**
	 * MQTT Base object describing all MQTT related parameters and objects {{bibref|MQTT31}},
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.")
@XmlRootElement(name = "Device.MQTT")
@XmlType(name = "Device.MQTT")
@XmlAccessorType(XmlAccessType.FIELD)
public class MQTT {

	/**
	 * Indicates the MQTT capabilities of the device.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;
	/**
	 * MQTT client table. Contains a list of configured MQTT clients.
	 */
	@XmlElementWrapper(name = "Clients")
	@XmlElement(name = "Client")
	@CWMPParameter(access = "readWrite")
	public Collection<Client> clients;
	/**
	 * MQTT broker table. Contains a list of configured MQTT brokers.
	 */
	@XmlElementWrapper(name = "Brokers")
	@XmlElement(name = "Broker")
	@CWMPParameter(access = "readWrite")
	public Collection<Broker> brokers;

	public MQTT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the MQTT capabilities of the device.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the indicates the MQTT capabilities of the device.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the indicates the MQTT capabilities of the device.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public MQTT withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	/**
	 * Get the mqtT client table. Contains a list of configured MQTT clients.
	 *
	 * @return the value
	 */
	public Collection<Client> getClients() {
		if (this.clients == null){ this.clients=new ArrayList<>();}
		return clients;
	}

	/**
	 * Set the mqtT client table. Contains a list of configured MQTT clients.
	 *
	 * @param clients the input value
	 */
	public void  setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * Set the mqtT client table. Contains a list of configured MQTT clients.
	 *
	 * @param client the input value
	 * @return this instance
	 */
	public MQTT withClient(Client client) {
		getClients().add(client);
		return this;
	}

	/**
	 * Get the mqtT broker table. Contains a list of configured MQTT brokers.
	 *
	 * @return the value
	 */
	public Collection<Broker> getBrokers() {
		if (this.brokers == null){ this.brokers=new ArrayList<>();}
		return brokers;
	}

	/**
	 * Set the mqtT broker table. Contains a list of configured MQTT brokers.
	 *
	 * @param brokers the input value
	 */
	public void  setBrokers(Collection<Broker> brokers) {
		this.brokers = brokers;
	}

	/**
	 * Set the mqtT broker table. Contains a list of configured MQTT brokers.
	 *
	 * @param broker the input value
	 * @return this instance
	 */
	public MQTT withBroker(Broker broker) {
		getBrokers().add(broker);
		return this;
	}

	//</editor-fold>

}