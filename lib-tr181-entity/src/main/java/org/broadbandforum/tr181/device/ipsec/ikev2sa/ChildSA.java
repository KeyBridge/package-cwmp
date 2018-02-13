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
package org.broadbandforum.tr181.device.ipsec.ikev2sa;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.ipsec.ikev2sa.childsa.Stats;

	/**
	 * Represents a child Security Association (SA) pair, i.e. an inbound child SA and an outbound child SA.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.IKEv2SA.{i}.ChildSA.{i}.")
@XmlRootElement(name = "ChildSA")
@XmlType(name = "Device.IPsec.IKEv2SA.ChildSA")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChildSA {

	/**
	 * The current operational state of the child SA pair.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The inbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "InboundSPI")
	public Long inboundSPI;
	/**
	 * The outbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "OutboundSPI")
	public Long outboundSPI;
	/**
	 * The date and time when the child SA was created.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "CreationTime")
	public LocalDateTime creationTime;
	/**
	 * Statistics for this child Security Association (SA).

        The CPE MUST reset the child SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the parent {{object|#}} instance's Stats parameters are reset.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public ChildSA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the current operational state of the child SA pair.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the child SA pair.
	 *
	 * @since 2.5
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the child SA pair.
	 *
	 * @since 2.5
	 * @param status the input value
	 * @return this instance
	 */
	public ChildSA withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 * @return this instance
	 */
	public ChildSA withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the inbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getInboundSPI() {
		return inboundSPI;
	}

	/**
	 * Set the inbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 * @param inboundSPI the input value
	 */
	public void  setInboundSPI(Long inboundSPI) {
		this.inboundSPI = inboundSPI;
	}

	/**
	 * Set the inbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 * @param inboundSPI the input value
	 * @return this instance
	 */
	public ChildSA withInboundSPI(Long inboundSPI) {
		this.inboundSPI = inboundSPI;
		return this;
	}

	/**
	 * Get the outbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getOutboundSPI() {
		return outboundSPI;
	}

	/**
	 * Set the outbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 * @param outboundSPI the input value
	 */
	public void  setOutboundSPI(Long outboundSPI) {
		this.outboundSPI = outboundSPI;
	}

	/**
	 * Set the outbound child SA's Security Parameter Index (SPI).
	 *
	 * @since 2.5
	 * @param outboundSPI the input value
	 * @return this instance
	 */
	public ChildSA withOutboundSPI(Long outboundSPI) {
		this.outboundSPI = outboundSPI;
		return this;
	}

	/**
	 * Get the date and time when the child SA was created.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	/**
	 * Set the date and time when the child SA was created.
	 *
	 * @since 2.5
	 * @param creationTime the input value
	 */
	public void  setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * Set the date and time when the child SA was created.
	 *
	 * @since 2.5
	 * @param creationTime the input value
	 * @return this instance
	 */
	public ChildSA withCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
		return this;
	}

	/**
	 * Get the statistics for this child Security Association (SA).

        The CPE MUST reset the child SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the parent {{object|#}} instance's Stats parameters are reset.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the statistics for this child Security Association (SA).

        The CPE MUST reset the child SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the parent {{object|#}} instance's Stats parameters are reset.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the statistics for this child Security Association (SA).

        The CPE MUST reset the child SA's Stats parameters (unless otherwise stated in individual object or parameter descriptions) whenever the parent {{object|#}} instance's Stats parameters are reset.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public ChildSA withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}