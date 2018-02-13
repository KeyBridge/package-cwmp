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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains statistics for all connections within the same ''WANConnectionDevice'' that share a common MAC address.  The contents of this object SHOULD be identical for each such connection.

This object is intended only for ''WANConnectionDevice''s that can support an Ethernet-layer on this interface (e.g., ''PPPoE'', ''IPoE'').
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANIPConnection.{i}.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANIPConnection.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The total number of bytes transmitted, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetBytesSent;
	/**
	 * The total number of bytes received, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetBytesReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetBytesReceived;
	/**
	 * The total number of packets transmitted over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetPacketsSent;
	/**
	 * The total number of packets which were received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetPacketsReceived;
	/**
	 * The total number of outbound packets that could not be transmitted because of errors, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetErrorsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetErrorsSent;
	/**
	 * The total number of inbound packets that contained errors preventing them from being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetErrorsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetErrorsReceived;
	/**
	 * The total number of packets requested for transmission which were not addressed to a multicast or broadcast address, including those that were discarded or not sent, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetUnicastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetUnicastPacketsSent;
	/**
	 * The total number of received packets which were not addressed to a multicast or broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetUnicastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetUnicastPacketsReceived;
	/**
	 * The total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetDiscardPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetDiscardPacketsSent;
	/**
	 * The total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetDiscardPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetDiscardPacketsReceived;
	/**
	 * The total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetMulticastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetMulticastPacketsSent;
	/**
	 * The total number of received packets which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetMulticastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetMulticastPacketsReceived;
	/**
	 * The total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetBroadcastPacketsSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetBroadcastPacketsSent;
	/**
	 * The total number of received packets which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetBroadcastPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetBroadcastPacketsReceived;
	/**
	 * The total number of packets which were discarded because of an unknown or unsupported protocol, received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "EthernetUnknownProtoPacketsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long ethernetUnknownProtoPacketsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes transmitted, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetBytesSent() {
		return ethernetBytesSent;
	}

	/**
	 * Set the total number of bytes transmitted, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetBytesSent the input value
	 */
	public void  setEthernetBytesSent(Long ethernetBytesSent) {
		this.ethernetBytesSent = ethernetBytesSent;
	}

	/**
	 * Set the total number of bytes transmitted, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetBytesSent the input value
	 * @return this instance
	 */
	public Stats withEthernetBytesSent(Long ethernetBytesSent) {
		this.ethernetBytesSent = ethernetBytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetBytesReceived() {
		return ethernetBytesReceived;
	}

	/**
	 * Set the total number of bytes received, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetBytesReceived the input value
	 */
	public void  setEthernetBytesReceived(Long ethernetBytesReceived) {
		this.ethernetBytesReceived = ethernetBytesReceived;
	}

	/**
	 * Set the total number of bytes received, including framing characters, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetBytesReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetBytesReceived(Long ethernetBytesReceived) {
		this.ethernetBytesReceived = ethernetBytesReceived;
		return this;
	}

	/**
	 * Get the total number of packets transmitted over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetPacketsSent() {
		return ethernetPacketsSent;
	}

	/**
	 * Set the total number of packets transmitted over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetPacketsSent the input value
	 */
	public void  setEthernetPacketsSent(Long ethernetPacketsSent) {
		this.ethernetPacketsSent = ethernetPacketsSent;
	}

	/**
	 * Set the total number of packets transmitted over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetPacketsSent the input value
	 * @return this instance
	 */
	public Stats withEthernetPacketsSent(Long ethernetPacketsSent) {
		this.ethernetPacketsSent = ethernetPacketsSent;
		return this;
	}

	/**
	 * Get the total number of packets which were received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetPacketsReceived() {
		return ethernetPacketsReceived;
	}

	/**
	 * Set the total number of packets which were received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetPacketsReceived the input value
	 */
	public void  setEthernetPacketsReceived(Long ethernetPacketsReceived) {
		this.ethernetPacketsReceived = ethernetPacketsReceived;
	}

	/**
	 * Set the total number of packets which were received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.0
	 * @param ethernetPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetPacketsReceived(Long ethernetPacketsReceived) {
		this.ethernetPacketsReceived = ethernetPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets that could not be transmitted because of errors, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetErrorsSent() {
		return ethernetErrorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetErrorsSent the input value
	 */
	public void  setEthernetErrorsSent(Long ethernetErrorsSent) {
		this.ethernetErrorsSent = ethernetErrorsSent;
	}

	/**
	 * Set the total number of outbound packets that could not be transmitted because of errors, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetErrorsSent the input value
	 * @return this instance
	 */
	public Stats withEthernetErrorsSent(Long ethernetErrorsSent) {
		this.ethernetErrorsSent = ethernetErrorsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets that contained errors preventing them from being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetErrorsReceived() {
		return ethernetErrorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetErrorsReceived the input value
	 */
	public void  setEthernetErrorsReceived(Long ethernetErrorsReceived) {
		this.ethernetErrorsReceived = ethernetErrorsReceived;
	}

	/**
	 * Set the total number of inbound packets that contained errors preventing them from being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetErrorsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetErrorsReceived(Long ethernetErrorsReceived) {
		this.ethernetErrorsReceived = ethernetErrorsReceived;
		return this;
	}

	/**
	 * Get the total number of packets requested for transmission which were not addressed to a multicast or broadcast address, including those that were discarded or not sent, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetUnicastPacketsSent() {
		return ethernetUnicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address, including those that were discarded or not sent, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetUnicastPacketsSent the input value
	 */
	public void  setEthernetUnicastPacketsSent(Long ethernetUnicastPacketsSent) {
		this.ethernetUnicastPacketsSent = ethernetUnicastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission which were not addressed to a multicast or broadcast address, including those that were discarded or not sent, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetUnicastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withEthernetUnicastPacketsSent(Long ethernetUnicastPacketsSent) {
		this.ethernetUnicastPacketsSent = ethernetUnicastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets which were not addressed to a multicast or broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetUnicastPacketsReceived() {
		return ethernetUnicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets which were not addressed to a multicast or broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetUnicastPacketsReceived the input value
	 */
	public void  setEthernetUnicastPacketsReceived(Long ethernetUnicastPacketsReceived) {
		this.ethernetUnicastPacketsReceived = ethernetUnicastPacketsReceived;
	}

	/**
	 * Set the total number of received packets which were not addressed to a multicast or broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetUnicastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetUnicastPacketsReceived(Long ethernetUnicastPacketsReceived) {
		this.ethernetUnicastPacketsReceived = ethernetUnicastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetDiscardPacketsSent() {
		return ethernetDiscardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetDiscardPacketsSent the input value
	 */
	public void  setEthernetDiscardPacketsSent(Long ethernetDiscardPacketsSent) {
		this.ethernetDiscardPacketsSent = ethernetDiscardPacketsSent;
	}

	/**
	 * Set the total number of outbound packets which were chosen to be discarded even though no errors had been detected to prevent their being transmitted, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetDiscardPacketsSent the input value
	 * @return this instance
	 */
	public Stats withEthernetDiscardPacketsSent(Long ethernetDiscardPacketsSent) {
		this.ethernetDiscardPacketsSent = ethernetDiscardPacketsSent;
		return this;
	}

	/**
	 * Get the total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetDiscardPacketsReceived() {
		return ethernetDiscardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetDiscardPacketsReceived the input value
	 */
	public void  setEthernetDiscardPacketsReceived(Long ethernetDiscardPacketsReceived) {
		this.ethernetDiscardPacketsReceived = ethernetDiscardPacketsReceived;
	}

	/**
	 * Set the total number of inbound packets which were chosen to be discarded even though no errors had been detected to prevent their being deliverable, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.  One possible reason for discarding such a packet could be to free up buffer space. 

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetDiscardPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetDiscardPacketsReceived(Long ethernetDiscardPacketsReceived) {
		this.ethernetDiscardPacketsReceived = ethernetDiscardPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetMulticastPacketsSent() {
		return ethernetMulticastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetMulticastPacketsSent the input value
	 */
	public void  setEthernetMulticastPacketsSent(Long ethernetMulticastPacketsSent) {
		this.ethernetMulticastPacketsSent = ethernetMulticastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetMulticastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withEthernetMulticastPacketsSent(Long ethernetMulticastPacketsSent) {
		this.ethernetMulticastPacketsSent = ethernetMulticastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetMulticastPacketsReceived() {
		return ethernetMulticastPacketsReceived;
	}

	/**
	 * Set the total number of received packets which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetMulticastPacketsReceived the input value
	 */
	public void  setEthernetMulticastPacketsReceived(Long ethernetMulticastPacketsReceived) {
		this.ethernetMulticastPacketsReceived = ethernetMulticastPacketsReceived;
	}

	/**
	 * Set the total number of received packets which were addressed to a multicast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetMulticastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetMulticastPacketsReceived(Long ethernetMulticastPacketsReceived) {
		this.ethernetMulticastPacketsReceived = ethernetMulticastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetBroadcastPacketsSent() {
		return ethernetBroadcastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetBroadcastPacketsSent the input value
	 */
	public void  setEthernetBroadcastPacketsSent(Long ethernetBroadcastPacketsSent) {
		this.ethernetBroadcastPacketsSent = ethernetBroadcastPacketsSent;
	}

	/**
	 * Set the total number of packets requested for transmission, including those that were discarded or not sent, which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetBroadcastPacketsSent the input value
	 * @return this instance
	 */
	public Stats withEthernetBroadcastPacketsSent(Long ethernetBroadcastPacketsSent) {
		this.ethernetBroadcastPacketsSent = ethernetBroadcastPacketsSent;
		return this;
	}

	/**
	 * Get the total number of received packets which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetBroadcastPacketsReceived() {
		return ethernetBroadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetBroadcastPacketsReceived the input value
	 */
	public void  setEthernetBroadcastPacketsReceived(Long ethernetBroadcastPacketsReceived) {
		this.ethernetBroadcastPacketsReceived = ethernetBroadcastPacketsReceived;
	}

	/**
	 * Set the total number of received packets which were addressed to a broadcast address, over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetBroadcastPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetBroadcastPacketsReceived(Long ethernetBroadcastPacketsReceived) {
		this.ethernetBroadcastPacketsReceived = ethernetBroadcastPacketsReceived;
		return this;
	}

	/**
	 * Get the total number of packets which were discarded because of an unknown or unsupported protocol, received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getEthernetUnknownProtoPacketsReceived() {
		return ethernetUnknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets which were discarded because of an unknown or unsupported protocol, received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetUnknownProtoPacketsReceived the input value
	 */
	public void  setEthernetUnknownProtoPacketsReceived(Long ethernetUnknownProtoPacketsReceived) {
		this.ethernetUnknownProtoPacketsReceived = ethernetUnknownProtoPacketsReceived;
	}

	/**
	 * Set the total number of packets which were discarded because of an unknown or unsupported protocol, received over all connections within the same ''WANConnectionDevice'' that share a common MAC address.

The value of this counter MAY be reset to zero when the CPE is rebooted.
	 *
	 * @since 1.4
	 * @param ethernetUnknownProtoPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetUnknownProtoPacketsReceived(Long ethernetUnknownProtoPacketsReceived) {
		this.ethernetUnknownProtoPacketsReceived = ethernetUnknownProtoPacketsReceived;
		return this;
	}

	//</editor-fold>

}