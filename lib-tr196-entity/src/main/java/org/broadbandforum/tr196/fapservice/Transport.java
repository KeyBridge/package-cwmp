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
package org.broadbandforum.tr196.fapservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.transport.Packet;
import org.broadbandforum.tr196.fapservice.transport.RealTime;
import org.broadbandforum.tr196.fapservice.transport.SCTP;
import org.broadbandforum.tr196.fapservice.transport.SIP;
import org.broadbandforum.tr196.fapservice.transport.Security;

	/**
	 * This object contains parameters relating to the transport.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.")
@XmlRootElement(name = "FAPService.Transport")
@XmlType(name = "FAPService.Transport")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transport {

	/**
	 * This object contains parameters relating to SIP as a transport protocol.

SIP is defined in {{bibref|RFC3261}}.
	 */
	@XmlElement(name = "SIP")
	public SIP sip;
	/**
	 * This object contains parameters relating to SCTP as a transport protocol.

SCTP is defined in {{bibref|RFC4960}} and {{bibref|RFC3873}}.
	 */
	@XmlElement(name = "SCTP")
	public SCTP sctP;
	/**
	 * This object contains parameters relating to Real Time Transport using RTP.
	 */
	@XmlElement(name = "RealTime")
	public RealTime realTime;
	/**
	 * This object contains parameters relating to Packet Transport using GTP-U.
	 */
	@XmlElement(name = "Packet")
	public Packet packet;
	/**
	 * This object contains parameters relating to Security.
	 */
	@XmlElement(name = "Security")
	public Security security;

	public Transport() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to SIP as a transport protocol.

SIP is defined in {{bibref|RFC3261}}.
	 *
	 * @return the value
	 */
	public SIP getSip() {
		return sip;
	}

	/**
	 * Set the this object contains parameters relating to SIP as a transport protocol.

SIP is defined in {{bibref|RFC3261}}.
	 *
	 * @param sip the input value
	 */
	public void  setSip(SIP sip) {
		this.sip = sip;
	}

	/**
	 * Set the this object contains parameters relating to SIP as a transport protocol.

SIP is defined in {{bibref|RFC3261}}.
	 *
	 * @param sip the input value
	 * @return this instance
	 */
	public Transport withSip(SIP sip) {
		this.sip = sip;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to SCTP as a transport protocol.

SCTP is defined in {{bibref|RFC4960}} and {{bibref|RFC3873}}.
	 *
	 * @return the value
	 */
	public SCTP getSctP() {
		return sctP;
	}

	/**
	 * Set the this object contains parameters relating to SCTP as a transport protocol.

SCTP is defined in {{bibref|RFC4960}} and {{bibref|RFC3873}}.
	 *
	 * @param sctP the input value
	 */
	public void  setSctP(SCTP sctP) {
		this.sctP = sctP;
	}

	/**
	 * Set the this object contains parameters relating to SCTP as a transport protocol.

SCTP is defined in {{bibref|RFC4960}} and {{bibref|RFC3873}}.
	 *
	 * @param sctP the input value
	 * @return this instance
	 */
	public Transport withSctP(SCTP sctP) {
		this.sctP = sctP;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Real Time Transport using RTP.
	 *
	 * @return the value
	 */
	public RealTime getRealTime() {
		return realTime;
	}

	/**
	 * Set the this object contains parameters relating to Real Time Transport using RTP.
	 *
	 * @param realTime the input value
	 */
	public void  setRealTime(RealTime realTime) {
		this.realTime = realTime;
	}

	/**
	 * Set the this object contains parameters relating to Real Time Transport using RTP.
	 *
	 * @param realTime the input value
	 * @return this instance
	 */
	public Transport withRealTime(RealTime realTime) {
		this.realTime = realTime;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Packet Transport using GTP-U.
	 *
	 * @return the value
	 */
	public Packet getPacket() {
		return packet;
	}

	/**
	 * Set the this object contains parameters relating to Packet Transport using GTP-U.
	 *
	 * @param packet the input value
	 */
	public void  setPacket(Packet packet) {
		this.packet = packet;
	}

	/**
	 * Set the this object contains parameters relating to Packet Transport using GTP-U.
	 *
	 * @param packet the input value
	 * @return this instance
	 */
	public Transport withPacket(Packet packet) {
		this.packet = packet;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to Security.
	 *
	 * @return the value
	 */
	public Security getSecurity() {
		return security;
	}

	/**
	 * Set the this object contains parameters relating to Security.
	 *
	 * @param security the input value
	 */
	public void  setSecurity(Security security) {
		this.security = security;
	}

	/**
	 * Set the this object contains parameters relating to Security.
	 *
	 * @param security the input value
	 * @return this instance
	 */
	public Transport withSecurity(Security security) {
		this.security = security;
		return this;
	}

	//</editor-fold>

}