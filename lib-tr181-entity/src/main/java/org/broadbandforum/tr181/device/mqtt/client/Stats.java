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
package org.broadbandforum.tr181.device.mqtt.client;

import java.time.LocalDateTime;
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
	 * Contains the MQTT client statistics and usage information.

        The CPE MUST reset the Stats parameters after the MQTT client gets (re-)enabled or if the MQTT client connects with a new MQTT broker (e.g. {{param|#.BrokerAddress}} has changed). The CPE MAY retain the values across a reboot if it reconnects with the same MQTT broker.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.Client.{i}.Stats.")
@XmlRootElement(name = "Device.MQTT.Client.Stats")
@XmlType(name = "Device.MQTT.Client.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * Time when the MQTT broker connection was established.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "BrokerConnectionEstablished")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime brokerConnectionEstablished;
	/**
	 * Time when the last publish message was sent to the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "LastPublishMessageSent")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime lastPublishMessageSent;
	/**
	 * Time when the last publish message was received from the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "LastPublishMessageReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime lastPublishMessageReceived;
	/**
	 * Number of publish messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "PublishSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 publishSent;
	/**
	 * Number of publish messages received from to the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "PublishReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 publishReceived;
	/**
	 * Number of subscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "SubscribeSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 subscribeSent;
	/**
	 * Number of unsubscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "UnSubscribeSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 unsubscribeSent;
	/**
	 * Total number of MQTT messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MQTTMessagesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public StatsCounter64 mqtTMessagesSent;
	/**
	 * Total number of MQTT messages received from the MQTT broker.
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
	 * Number of errors which prevented sending publish messages.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "PublishErrors")
	public StatsCounter32 publishErrors;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the time when the MQTT broker connection was established.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public LocalDateTime getBrokerConnectionEstablished() {
		return brokerConnectionEstablished;
	}

	/**
	 * Set the time when the MQTT broker connection was established.
	 *
	 * @since 2.10
	 * @param brokerConnectionEstablished the input value
	 */
	public void  setBrokerConnectionEstablished(LocalDateTime brokerConnectionEstablished) {
		this.brokerConnectionEstablished = brokerConnectionEstablished;
	}

	/**
	 * Set the time when the MQTT broker connection was established.
	 *
	 * @since 2.10
	 * @param brokerConnectionEstablished the input value
	 * @return this instance
	 */
	public Stats withBrokerConnectionEstablished(LocalDateTime brokerConnectionEstablished) {
		this.brokerConnectionEstablished = brokerConnectionEstablished;
		return this;
	}

	/**
	 * Get the time when the last publish message was sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public LocalDateTime getLastPublishMessageSent() {
		return lastPublishMessageSent;
	}

	/**
	 * Set the time when the last publish message was sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param lastPublishMessageSent the input value
	 */
	public void  setLastPublishMessageSent(LocalDateTime lastPublishMessageSent) {
		this.lastPublishMessageSent = lastPublishMessageSent;
	}

	/**
	 * Set the time when the last publish message was sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param lastPublishMessageSent the input value
	 * @return this instance
	 */
	public Stats withLastPublishMessageSent(LocalDateTime lastPublishMessageSent) {
		this.lastPublishMessageSent = lastPublishMessageSent;
		return this;
	}

	/**
	 * Get the time when the last publish message was received from the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public LocalDateTime getLastPublishMessageReceived() {
		return lastPublishMessageReceived;
	}

	/**
	 * Set the time when the last publish message was received from the MQTT broker.
	 *
	 * @since 2.10
	 * @param lastPublishMessageReceived the input value
	 */
	public void  setLastPublishMessageReceived(LocalDateTime lastPublishMessageReceived) {
		this.lastPublishMessageReceived = lastPublishMessageReceived;
	}

	/**
	 * Set the time when the last publish message was received from the MQTT broker.
	 *
	 * @since 2.10
	 * @param lastPublishMessageReceived the input value
	 * @return this instance
	 */
	public Stats withLastPublishMessageReceived(LocalDateTime lastPublishMessageReceived) {
		this.lastPublishMessageReceived = lastPublishMessageReceived;
		return this;
	}

	/**
	 * Get the number of publish messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getPublishSent() {
		return publishSent;
	}

	/**
	 * Set the number of publish messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param publishSent the input value
	 */
	public void  setPublishSent(StatsCounter64 publishSent) {
		this.publishSent = publishSent;
	}

	/**
	 * Set the number of publish messages sent to the MQTT broker.
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
	 * Get the number of publish messages received from to the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getPublishReceived() {
		return publishReceived;
	}

	/**
	 * Set the number of publish messages received from to the MQTT broker.
	 *
	 * @since 2.10
	 * @param publishReceived the input value
	 */
	public void  setPublishReceived(StatsCounter64 publishReceived) {
		this.publishReceived = publishReceived;
	}

	/**
	 * Set the number of publish messages received from to the MQTT broker.
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
	 * Get the number of subscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getSubscribeSent() {
		return subscribeSent;
	}

	/**
	 * Set the number of subscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param subscribeSent the input value
	 */
	public void  setSubscribeSent(StatsCounter64 subscribeSent) {
		this.subscribeSent = subscribeSent;
	}

	/**
	 * Set the number of subscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param subscribeSent the input value
	 * @return this instance
	 */
	public Stats withSubscribeSent(StatsCounter64 subscribeSent) {
		this.subscribeSent = subscribeSent;
		return this;
	}

	/**
	 * Get the number of unsubscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getUnsubscribeSent() {
		return unsubscribeSent;
	}

	/**
	 * Set the number of unsubscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param unsubscribeSent the input value
	 */
	public void  setUnsubscribeSent(StatsCounter64 unsubscribeSent) {
		this.unsubscribeSent = unsubscribeSent;
	}

	/**
	 * Set the number of unsubscribe messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param unsubscribeSent the input value
	 * @return this instance
	 */
	public Stats withUnsubscribeSent(StatsCounter64 unsubscribeSent) {
		this.unsubscribeSent = unsubscribeSent;
		return this;
	}

	/**
	 * Get the total number of MQTT messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getMqtTMessagesSent() {
		return mqtTMessagesSent;
	}

	/**
	 * Set the total number of MQTT messages sent to the MQTT broker.
	 *
	 * @since 2.10
	 * @param mqtTMessagesSent the input value
	 */
	public void  setMqtTMessagesSent(StatsCounter64 mqtTMessagesSent) {
		this.mqtTMessagesSent = mqtTMessagesSent;
	}

	/**
	 * Set the total number of MQTT messages sent to the MQTT broker.
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
	 * Get the total number of MQTT messages received from the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter64 getMqtTMessagesReceived() {
		return mqtTMessagesReceived;
	}

	/**
	 * Set the total number of MQTT messages received from the MQTT broker.
	 *
	 * @since 2.10
	 * @param mqtTMessagesReceived the input value
	 */
	public void  setMqtTMessagesReceived(StatsCounter64 mqtTMessagesReceived) {
		this.mqtTMessagesReceived = mqtTMessagesReceived;
	}

	/**
	 * Set the total number of MQTT messages received from the MQTT broker.
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
	 * Get the number of errors which prevented sending publish messages.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public StatsCounter32 getPublishErrors() {
		return publishErrors;
	}

	/**
	 * Set the number of errors which prevented sending publish messages.
	 *
	 * @since 2.10
	 * @param publishErrors the input value
	 */
	public void  setPublishErrors(StatsCounter32 publishErrors) {
		this.publishErrors = publishErrors;
	}

	/**
	 * Set the number of errors which prevented sending publish messages.
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