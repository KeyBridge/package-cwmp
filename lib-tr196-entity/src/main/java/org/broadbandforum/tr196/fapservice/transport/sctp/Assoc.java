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
package org.broadbandforum.tr196.fapservice.transport.sctp;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.IPAddress;

	/**
	 * SCTP Association Table
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.SCTP.Assoc.{i}.")
@XmlRootElement(name = "FAPService.Transport.SCTP.Assoc")
@XmlType(name = "FAPService.Transport.SCTP.Assoc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Assoc {

	/**
	 * The status of this SCTP association entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The primary IP address of the peer SCTP association entity.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrimaryPeerAddress")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress primaryPeerAddress;
	/**
	 * The local SCTP port number used for this SCTP association.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalPort")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 0, max = 63999)
	public Long localPort;
	/**
	 * The number of Inbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InStreams")
	@CWMPParameter(activeNotify = "canDeny")
	public Long instreams;
	/**
	 * The number of Outbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OutStreams")
	@CWMPParameter(activeNotify = "canDeny")
	public Long outStreams;
	/**
	 * The start Time for the present SCTP association.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StartTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime startTime;
	/**
	 * The time of the last discontinuity.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Discontinuity")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime discontinuity;

	public Assoc() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the status of this SCTP association entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this SCTP association entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this SCTP association entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Assoc withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the primary IP address of the peer SCTP association entity.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getPrimaryPeerAddress() {
		return primaryPeerAddress;
	}

	/**
	 * Set the primary IP address of the peer SCTP association entity.
	 *
	 * @since 2.0
	 * @param primaryPeerAddress the input value
	 */
	public void  setPrimaryPeerAddress(IPAddress primaryPeerAddress) {
		this.primaryPeerAddress = primaryPeerAddress;
	}

	/**
	 * Set the primary IP address of the peer SCTP association entity.
	 *
	 * @since 2.0
	 * @param primaryPeerAddress the input value
	 * @return this instance
	 */
	public Assoc withPrimaryPeerAddress(IPAddress primaryPeerAddress) {
		this.primaryPeerAddress = primaryPeerAddress;
		return this;
	}

	/**
	 * Get the local SCTP port number used for this SCTP association.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLocalPort() {
		return localPort;
	}

	/**
	 * Set the local SCTP port number used for this SCTP association.
	 *
	 * @since 2.0
	 * @param localPort the input value
	 */
	public void  setLocalPort(Long localPort) {
		this.localPort = localPort;
	}

	/**
	 * Set the local SCTP port number used for this SCTP association.
	 *
	 * @since 2.0
	 * @param localPort the input value
	 * @return this instance
	 */
	public Assoc withLocalPort(Long localPort) {
		this.localPort = localPort;
		return this;
	}

	/**
	 * Get the number of Inbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInstreams() {
		return instreams;
	}

	/**
	 * Set the number of Inbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 * @param instreams the input value
	 */
	public void  setInstreams(Long instreams) {
		this.instreams = instreams;
	}

	/**
	 * Set the number of Inbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 * @param instreams the input value
	 * @return this instance
	 */
	public Assoc withInstreams(Long instreams) {
		this.instreams = instreams;
		return this;
	}

	/**
	 * Get the number of Outbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOutStreams() {
		return outStreams;
	}

	/**
	 * Set the number of Outbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 * @param outStreams the input value
	 */
	public void  setOutStreams(Long outStreams) {
		this.outStreams = outStreams;
	}

	/**
	 * Set the number of Outbound Streams according to the negotiation at association start-up.
	 *
	 * @since 2.0
	 * @param outStreams the input value
	 * @return this instance
	 */
	public Assoc withOutStreams(Long outStreams) {
		this.outStreams = outStreams;
		return this;
	}

	/**
	 * Get the start Time for the present SCTP association.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}

	/**
	 * Set the start Time for the present SCTP association.
	 *
	 * @since 2.0
	 * @param startTime the input value
	 */
	public void  setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * Set the start Time for the present SCTP association.
	 *
	 * @since 2.0
	 * @param startTime the input value
	 * @return this instance
	 */
	public Assoc withStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Get the time of the last discontinuity.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getDiscontinuity() {
		return discontinuity;
	}

	/**
	 * Set the time of the last discontinuity.
	 *
	 * @since 2.0
	 * @param discontinuity the input value
	 */
	public void  setDiscontinuity(LocalDateTime discontinuity) {
		this.discontinuity = discontinuity;
	}

	/**
	 * Set the time of the last discontinuity.
	 *
	 * @since 2.0
	 * @param discontinuity the input value
	 * @return this instance
	 */
	public Assoc withDiscontinuity(LocalDateTime discontinuity) {
		this.discontinuity = discontinuity;
		return this;
	}

	//</editor-fold>

}