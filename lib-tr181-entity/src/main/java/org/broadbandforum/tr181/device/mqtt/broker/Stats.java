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
package org.broadbandforum.tr181.device.mqtt.broker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.StatsCounter32;
import org.broadbandforum.tr181.datatypes.StatsCounter64;

	/**
	 * The MQTT broker statistics values. These will reset with each MQTT broker start, either after reboot or if the MQTT broker gets (re-)enabled.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.Broker.{i}.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "Device.MQTT.Broker.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * Total number of MQTT clients registered with the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "TotalNumberOfClients")
	public Long totalNumberOfClients;
	/**
	 * Number of MQTT clients, which have a connection with the MQTT broker established.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "NumberOfActiveClients")
	public Long numberOfActiveClients;
	/**
	 * Number of MQTT clients, which have no connection with the MQTT broker established.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "NumberOfInactiveClients")
	public Long numberOfInactiveClients;
	/**
	 * Number of subscriptions held by the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Subscriptions")
	@CWMPParameter(activeNotify = "canDeny")
	public Long subscriptions;
	/**
	 * Number of publish messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "PublishSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 publishSent;
	/**
	 * Number of publish messages received by the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "PublishReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 publishReceived;
	/**
	 * Total number of MQTT messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MQTTMessagesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 mqtTMessagesSent;
	/**
	 * Total number of MQTT messages received by the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MQTTMessagesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 mqtTMessagesReceived;
	/**
	 * Number of connection errors.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ConnectionErrors")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter32 connectionErrors;
	/**
	 * Number of errors which prevented sending publish messages
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "PublishErrors")
	public StatsCounter32 publishErrors;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of MQTT clients registered with the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getTotalNumberOfClients() {
		return totalNumberOfClients;
	}

	/**
	 * Set the total number of MQTT clients registered with the MQTT broker.
	 *
	 * @since 2.10
	 * @param totalNumberOfClients the input value
	 */
	public void  setTotalNumberOfClients(Long totalNumberOfClients) {
		this.totalNumberOfClients = totalNumberOfClients;
	}

	/**
	 * Set the total number of MQTT clients registered with the MQTT broker.
	 *
	 * @since 2.10
	 * @param totalNumberOfClients the input value
	 * @return this instance
	 */
	public Stats withTotalNumberOfClients(Long totalNumberOfClients) {
		this.totalNumberOfClients = totalNumberOfClients;
		return this;
	}

	/**
	 * Get the number of MQTT clients, which have a connection with the MQTT broker established.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getNumberOfActiveClients() {
		return numberOfActiveClients;
	}

	/**
	 * Set the number of MQTT clients, which have a connection with the MQTT broker established.
	 *
	 * @since 2.10
	 * @param numberOfActiveClients the input value
	 */
	public void  setNumberOfActiveClients(Long numberOfActiveClients) {
		this.numberOfActiveClients = numberOfActiveClients;
	}

	/**
	 * Set the number of MQTT clients, which have a connection with the MQTT broker established.
	 *
	 * @since 2.10
	 * @param numberOfActiveClients the input value
	 * @return this instance
	 */
	public Stats withNumberOfActiveClients(Long numberOfActiveClients) {
		this.numberOfActiveClients = numberOfActiveClients;
		return this;
	}

	/**
	 * Get the number of MQTT clients, which have no connection with the MQTT broker established.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getNumberOfInactiveClients() {
		return numberOfInactiveClients;
	}

	/**
	 * Set the number of MQTT clients, which have no connection with the MQTT broker established.
	 *
	 * @since 2.10
	 * @param numberOfInactiveClients the input value
	 */
	public void  setNumberOfInactiveClients(Long numberOfInactiveClients) {
		this.numberOfInactiveClients = numberOfInactiveClients;
	}

	/**
	 * Set the number of MQTT clients, which have no connection with the MQTT broker established.
	 *
	 * @since 2.10
	 * @param numberOfInactiveClients the input value
	 * @return this instance
	 */
	public Stats withNumberOfInactiveClients(Long numberOfInactiveClients) {
		this.numberOfInactiveClients = numberOfInactiveClients;
		return this;
	}

	/**
	 * Get the number of subscriptions held by the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getSubscriptions() {
		return subscriptions;
	}

	/**
	 * Set the number of subscriptions held by the MQTT broker.
	 *
	 * @since 2.10
	 * @param subscriptions the input value
	 */
	public void  setSubscriptions(Long subscriptions) {
		this.subscriptions = subscriptions;
	}

	/**
	 * Set the number of subscriptions held by the MQTT broker.
	 *
	 * @since 2.10
	 * @param subscriptions the input value
	 * @return this instance
	 */
	public Stats withSubscriptions(Long subscriptions) {
		this.subscriptions = subscriptions;
		return this;
	}

	/**
	 * Get the number of publish messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getPublishSent() {
		return publishSent;
	}

	/**
	 * Set the number of publish messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 * @param publishSent the input value
	 */
	public void  setPublishSent(StatsCounter64 publishSent) {
		this.publishSent = publishSent;
	}

	/**
	 * Set the number of publish messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 * @param publishSent the input value
	 * @return this instance
	 */
	public Stats withPublishSent(StatsCounter64 publishSent) {
		this.publishSent = publishSent;
		return this;
	}

	/**
	 * Get the number of publish messages received by the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getPublishReceived() {
		return publishReceived;
	}

	/**
	 * Set the number of publish messages received by the MQTT broker.
	 *
	 * @since 2.10
	 * @param publishReceived the input value
	 */
	public void  setPublishReceived(StatsCounter64 publishReceived) {
		this.publishReceived = publishReceived;
	}

	/**
	 * Set the number of publish messages received by the MQTT broker.
	 *
	 * @since 2.10
	 * @param publishReceived the input value
	 * @return this instance
	 */
	public Stats withPublishReceived(StatsCounter64 publishReceived) {
		this.publishReceived = publishReceived;
		return this;
	}

	/**
	 * Get the total number of MQTT messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getMqtTMessagesSent() {
		return mqtTMessagesSent;
	}

	/**
	 * Set the total number of MQTT messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 * @param mqtTMessagesSent the input value
	 */
	public void  setMqtTMessagesSent(StatsCounter64 mqtTMessagesSent) {
		this.mqtTMessagesSent = mqtTMessagesSent;
	}

	/**
	 * Set the total number of MQTT messages sent by the MQTT broker.
	 *
	 * @since 2.10
	 * @param mqtTMessagesSent the input value
	 * @return this instance
	 */
	public Stats withMqtTMessagesSent(StatsCounter64 mqtTMessagesSent) {
		this.mqtTMessagesSent = mqtTMessagesSent;
		return this;
	}

	/**
	 * Get the total number of MQTT messages received by the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getMqtTMessagesReceived() {
		return mqtTMessagesReceived;
	}

	/**
	 * Set the total number of MQTT messages received by the MQTT broker.
	 *
	 * @since 2.10
	 * @param mqtTMessagesReceived the input value
	 */
	public void  setMqtTMessagesReceived(StatsCounter64 mqtTMessagesReceived) {
		this.mqtTMessagesReceived = mqtTMessagesReceived;
	}

	/**
	 * Set the total number of MQTT messages received by the MQTT broker.
	 *
	 * @since 2.10
	 * @param mqtTMessagesReceived the input value
	 * @return this instance
	 */
	public Stats withMqtTMessagesReceived(StatsCounter64 mqtTMessagesReceived) {
		this.mqtTMessagesReceived = mqtTMessagesReceived;
		return this;
	}

	/**
	 * Get the number of connection errors.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter32 getConnectionErrors() {
		return connectionErrors;
	}

	/**
	 * Set the number of connection errors.
	 *
	 * @since 2.10
	 * @param connectionErrors the input value
	 */
	public void  setConnectionErrors(StatsCounter32 connectionErrors) {
		this.connectionErrors = connectionErrors;
	}

	/**
	 * Set the number of connection errors.
	 *
	 * @since 2.10
	 * @param connectionErrors the input value
	 * @return this instance
	 */
	public Stats withConnectionErrors(StatsCounter32 connectionErrors) {
		this.connectionErrors = connectionErrors;
		return this;
	}

	/**
	 * Get the number of errors which prevented sending publish messages
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter32 getPublishErrors() {
		return publishErrors;
	}

	/**
	 * Set the number of errors which prevented sending publish messages
	 *
	 * @since 2.10
	 * @param publishErrors the input value
	 */
	public void  setPublishErrors(StatsCounter32 publishErrors) {
		this.publishErrors = publishErrors;
	}

	/**
	 * Set the number of errors which prevented sending publish messages
	 *
	 * @since 2.10
	 * @param publishErrors the input value
	 * @return this instance
	 */
	public Stats withPublishErrors(StatsCounter32 publishErrors) {
		this.publishErrors = publishErrors;
		return this;
	}

	//</editor-fold>

}