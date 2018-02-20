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
package org.broadbandforum.tr181.device.mqtt;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Indicates the MQTT capabilities of the device.
	 *
	 * @since TR181 v2.10
	 */
@CWMPObject(name = "Device.MQTT.Capabilities.")
@XmlRootElement(name = "Device.MQTT.Capabilities")
@XmlType(name = "Device.MQTT.Capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

	/**
	 * Indicates the supported protocol versions. 

Enumerated value must be one of [3.1, 3.1.1]
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ProtocolVersionsSupported")
	@XmlList
	public Collection<String> protocolVersionsSupported;
	/**
	 * Indicates the supported transport protocols. 

Enumerated value must be one of [TCP/IP, TLS, WebSocket]
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "TransportProtocolSupported")
	@XmlList
	public Collection<String> transportProtocolSupported;
	/**
	 * Indicates the maximum number of subscriptions per MQTT client, which can be stored in the {{object|#.Client.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MaxNumberOfClientSubscriptions")
	public Long maxNumberOfClientSubscriptions;
	/**
	 * Indicates the maximum number of bridges, which can be configured in the {{object|#.Broker.{i}.Bridge}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MaxNumberOfBrokerBridges")
	public Long maxNumberOfBrokerBridges;
	/**
	 * Indicates the maximum number of subscriptions, which can be stored per bridge instance in the {{object|#.Broker.{i}.Bridge.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MaxNumberOfBrokerBridgeSubscriptions")
	public Long maxNumberOfBrokerBridgeSubscriptions;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the supported protocol versions. 

Enumerated value must be one of [3.1, 3.1.1]
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Collection<String> getProtocolVersionsSupported() {
		if (this.protocolVersionsSupported == null){ this.protocolVersionsSupported=new ArrayList<>();}
		return protocolVersionsSupported;
	}

	/**
	 * Set the indicates the supported protocol versions. 

Enumerated value must be one of [3.1, 3.1.1]
	 *
	 * @since 2.10
	 * @param protocolVersionsSupported the input value
	 */
	public void  setProtocolVersionsSupported(Collection<String> protocolVersionsSupported) {
		this.protocolVersionsSupported = protocolVersionsSupported;
	}

	/**
	 * Set the indicates the supported protocol versions. 

Enumerated value must be one of [3.1, 3.1.1]
	 *
	 * @since 2.10
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withProtocolVersionsSupported(String string) {
		getProtocolVersionsSupported().add(string);
		return this;
	}

	/**
	 * Get the indicates the supported transport protocols. 

Enumerated value must be one of [TCP/IP, TLS, WebSocket]
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Collection<String> getTransportProtocolSupported() {
		if (this.transportProtocolSupported == null){ this.transportProtocolSupported=new ArrayList<>();}
		return transportProtocolSupported;
	}

	/**
	 * Set the indicates the supported transport protocols. 

Enumerated value must be one of [TCP/IP, TLS, WebSocket]
	 *
	 * @since 2.10
	 * @param transportProtocolSupported the input value
	 */
	public void  setTransportProtocolSupported(Collection<String> transportProtocolSupported) {
		this.transportProtocolSupported = transportProtocolSupported;
	}

	/**
	 * Set the indicates the supported transport protocols. 

Enumerated value must be one of [TCP/IP, TLS, WebSocket]
	 *
	 * @since 2.10
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withTransportProtocolSupported(String string) {
		getTransportProtocolSupported().add(string);
		return this;
	}

	/**
	 * Get the indicates the maximum number of subscriptions per MQTT client, which can be stored in the {{object|#.Client.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getMaxNumberOfClientSubscriptions() {
		return maxNumberOfClientSubscriptions;
	}

	/**
	 * Set the indicates the maximum number of subscriptions per MQTT client, which can be stored in the {{object|#.Client.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @param maxNumberOfClientSubscriptions the input value
	 */
	public void  setMaxNumberOfClientSubscriptions(Long maxNumberOfClientSubscriptions) {
		this.maxNumberOfClientSubscriptions = maxNumberOfClientSubscriptions;
	}

	/**
	 * Set the indicates the maximum number of subscriptions per MQTT client, which can be stored in the {{object|#.Client.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @param maxNumberOfClientSubscriptions the input value
	 * @return this instance
	 */
	public Capabilities withMaxNumberOfClientSubscriptions(Long maxNumberOfClientSubscriptions) {
		this.maxNumberOfClientSubscriptions = maxNumberOfClientSubscriptions;
		return this;
	}

	/**
	 * Get the indicates the maximum number of bridges, which can be configured in the {{object|#.Broker.{i}.Bridge}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getMaxNumberOfBrokerBridges() {
		return maxNumberOfBrokerBridges;
	}

	/**
	 * Set the indicates the maximum number of bridges, which can be configured in the {{object|#.Broker.{i}.Bridge}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @param maxNumberOfBrokerBridges the input value
	 */
	public void  setMaxNumberOfBrokerBridges(Long maxNumberOfBrokerBridges) {
		this.maxNumberOfBrokerBridges = maxNumberOfBrokerBridges;
	}

	/**
	 * Set the indicates the maximum number of bridges, which can be configured in the {{object|#.Broker.{i}.Bridge}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @param maxNumberOfBrokerBridges the input value
	 * @return this instance
	 */
	public Capabilities withMaxNumberOfBrokerBridges(Long maxNumberOfBrokerBridges) {
		this.maxNumberOfBrokerBridges = maxNumberOfBrokerBridges;
		return this;
	}

	/**
	 * Get the indicates the maximum number of subscriptions, which can be stored per bridge instance in the {{object|#.Broker.{i}.Bridge.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getMaxNumberOfBrokerBridgeSubscriptions() {
		return maxNumberOfBrokerBridgeSubscriptions;
	}

	/**
	 * Set the indicates the maximum number of subscriptions, which can be stored per bridge instance in the {{object|#.Broker.{i}.Bridge.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @param maxNumberOfBrokerBridgeSubscriptions the input value
	 */
	public void  setMaxNumberOfBrokerBridgeSubscriptions(Long maxNumberOfBrokerBridgeSubscriptions) {
		this.maxNumberOfBrokerBridgeSubscriptions = maxNumberOfBrokerBridgeSubscriptions;
	}

	/**
	 * Set the indicates the maximum number of subscriptions, which can be stored per bridge instance in the {{object|#.Broker.{i}.Bridge.{i}.Subscription}} table. A value of 0 means no limit.
	 *
	 * @since 2.10
	 * @param maxNumberOfBrokerBridgeSubscriptions the input value
	 * @return this instance
	 */
	public Capabilities withMaxNumberOfBrokerBridgeSubscriptions(Long maxNumberOfBrokerBridgeSubscriptions) {
		this.maxNumberOfBrokerBridgeSubscriptions = maxNumberOfBrokerBridgeSubscriptions;
		return this;
	}

	//</editor-fold>

}