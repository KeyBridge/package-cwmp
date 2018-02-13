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
package org.broadbandforum.tr196.fapservice.transport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to Packet Transport using GTP-U.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.Packet.")
@XmlRootElement(name = "FAPService.Transport.Packet")
@XmlType(name = "FAPService.Transport.Packet")
@XmlAccessorType(XmlAccessType.FIELD)
public class Packet {

	/**
	 * Echo interval in seconds.  An Echo interval value of zero means echo is disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EchoInterval")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "seconds")
	public Long echoInterval;
	/**
	 * The number of sent GTP-U packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SentPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long sentPackets;
	/**
	 * The number of received GTP-U packets.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RcvPackets")
	@CWMPParameter(activeNotify = "canDeny")
	public Long rcvPackets;

	public Packet() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the echo interval in seconds.  An Echo interval value of zero means echo is disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEchoInterval() {
		return echoInterval;
	}

	/**
	 * Set the echo interval in seconds.  An Echo interval value of zero means echo is disabled.
	 *
	 * @since 2.0
	 * @param echoInterval the input value
	 */
	public void  setEchoInterval(Long echoInterval) {
		this.echoInterval = echoInterval;
	}

	/**
	 * Set the echo interval in seconds.  An Echo interval value of zero means echo is disabled.
	 *
	 * @since 2.0
	 * @param echoInterval the input value
	 * @return this instance
	 */
	public Packet withEchoInterval(Long echoInterval) {
		this.echoInterval = echoInterval;
		return this;
	}

	/**
	 * Get the number of sent GTP-U packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSentPackets() {
		return sentPackets;
	}

	/**
	 * Set the number of sent GTP-U packets.
	 *
	 * @since 2.0
	 * @param sentPackets the input value
	 */
	public void  setSentPackets(Long sentPackets) {
		this.sentPackets = sentPackets;
	}

	/**
	 * Set the number of sent GTP-U packets.
	 *
	 * @since 2.0
	 * @param sentPackets the input value
	 * @return this instance
	 */
	public Packet withSentPackets(Long sentPackets) {
		this.sentPackets = sentPackets;
		return this;
	}

	/**
	 * Get the number of received GTP-U packets.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRcvPackets() {
		return rcvPackets;
	}

	/**
	 * Set the number of received GTP-U packets.
	 *
	 * @since 2.0
	 * @param rcvPackets the input value
	 */
	public void  setRcvPackets(Long rcvPackets) {
		this.rcvPackets = rcvPackets;
	}

	/**
	 * Set the number of received GTP-U packets.
	 *
	 * @since 2.0
	 * @param rcvPackets the input value
	 * @return this instance
	 */
	public Packet withRcvPackets(Long rcvPackets) {
		this.rcvPackets = rcvPackets;
		return this;
	}

	//</editor-fold>

}