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
package org.broadbandforum.tr181.device.xmpp.connection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * XMPP Connection statistics information for this resource.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.XMPP.Connection.{i}.Stats.")
@XmlRootElement(name = "Device.XMPP.Connection.Stats")
@XmlType(name = "Device.XMPP.Connection.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ReceivedMessages")
	public Long receivedMessages = 0L;
	/**
	 * The number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "TransmittedMessages")
	public Long transmittedMessages = 0L;
	/**
	 * The number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ReceivedErrorMessages")
	public Long receivedErrorMessages = 0L;
	/**
	 * The number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "TransmittedErrorMessages")
	public Long transmittedErrorMessages = 0L;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getReceivedMessages() {
		return receivedMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 * @param receivedMessages the input value
	 */
	public void  setReceivedMessages(Long receivedMessages) {
		this.receivedMessages = receivedMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 * @param receivedMessages the input value
	 * @return this instance
	 */
	public Stats withReceivedMessages(Long receivedMessages) {
		this.receivedMessages = receivedMessages;
		return this;
	}

	/**
	 * Get the number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getTransmittedMessages() {
		return transmittedMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 * @param transmittedMessages the input value
	 */
	public void  setTransmittedMessages(Long transmittedMessages) {
		this.transmittedMessages = transmittedMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}}.
	 *
	 * @since 2.7
	 * @param transmittedMessages the input value
	 * @return this instance
	 */
	public Stats withTransmittedMessages(Long transmittedMessages) {
		this.transmittedMessages = transmittedMessages;
		return this;
	}

	/**
	 * Get the number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getReceivedErrorMessages() {
		return receivedErrorMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 * @param receivedErrorMessages the input value
	 */
	public void  setReceivedErrorMessages(Long receivedErrorMessages) {
		this.receivedErrorMessages = receivedErrorMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been received on this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 * @param receivedErrorMessages the input value
	 * @return this instance
	 */
	public Stats withReceivedErrorMessages(Long receivedErrorMessages) {
		this.receivedErrorMessages = receivedErrorMessages;
		return this;
	}

	/**
	 * Get the number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getTransmittedErrorMessages() {
		return transmittedErrorMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 * @param transmittedErrorMessages the input value
	 */
	public void  setTransmittedErrorMessages(Long transmittedErrorMessages) {
		this.transmittedErrorMessages = transmittedErrorMessages;
	}

	/**
	 * Set the number of XMPP stanzas (iq, presence, or message) that have been transmitted by this {{object|##.Connection}} where the type attribute had a value of "error".
	 *
	 * @since 2.7
	 * @param transmittedErrorMessages the input value
	 * @return this instance
	 */
	public Stats withTransmittedErrorMessages(Long transmittedErrorMessages) {
		this.transmittedErrorMessages = transmittedErrorMessages;
		return this;
	}

	//</editor-fold>

}