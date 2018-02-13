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
package org.broadbandforum.tr262.fap.tunnel;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Child IPsec Security Association Table.  This Table is a member of the IPsec Security Association Database (SAD). {{bibref|RFC4301}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "FAP.Tunnel.ChildSA.{i}.")
@XmlRootElement(name = "FAP.Tunnel.ChildSA")
@XmlType(name = "FAP.Tunnel.ChildSA")
@XmlAccessorType(XmlAccessType.FIELD)
public class ChildSA {

	/**
	 * {{reference}}
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ParentID")
	@Size(max = 256)
	public String parentID;
	/**
	 * SPI value of the Child SA.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SPI")
	public Long spi;
	/**
	 * Traffic Direction.

If {{true}} this Child SA refers to outbound traffic.

If {{false}} this Child SA refers to inbound traffic.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DirectionOutbound")
	public Boolean directionOutbound;
	/**
	 * The time that the current Child SA was set up.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CreationTime")
	public LocalDateTime creationTime;
	/**
	 * The measured traffic in bytes transferred by the Child SA.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Traffic")
	public Long traffic;
	/**
	 * The number of inbound packets discarded by the Child SA due to integrity checking errors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IntegrityErrors")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long integrityErrors;
	/**
	 * The number of inbound packets discarded by the Child SA due to anti-replay errors.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ReplayErrors")
	@CWMPParameter(activeNotify = "canDeny", units = "packets")
	public Long replayErrors;

	public ChildSA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{reference}}
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getParentID() {
		return parentID;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 1.0
	 * @param parentID the input value
	 */
	public void  setParentID(String parentID) {
		this.parentID = parentID;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 1.0
	 * @param parentID the input value
	 * @return this instance
	 */
	public ChildSA withParentID(String parentID) {
		this.parentID = parentID;
		return this;
	}

	/**
	 * Get the spi value of the Child SA.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSpi() {
		return spi;
	}

	/**
	 * Set the spi value of the Child SA.
	 *
	 * @since 1.0
	 * @param spi the input value
	 */
	public void  setSpi(Long spi) {
		this.spi = spi;
	}

	/**
	 * Set the spi value of the Child SA.
	 *
	 * @since 1.0
	 * @param spi the input value
	 * @return this instance
	 */
	public ChildSA withSpi(Long spi) {
		this.spi = spi;
		return this;
	}

	/**
	 * Get the traffic Direction.

If {{true}} this Child SA refers to outbound traffic.

If {{false}} this Child SA refers to inbound traffic.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDirectionOutbound() {
		return directionOutbound;
	}

	/**
	 * Set the traffic Direction.

If {{true}} this Child SA refers to outbound traffic.

If {{false}} this Child SA refers to inbound traffic.
	 *
	 * @since 1.0
	 * @param directionOutbound the input value
	 */
	public void  setDirectionOutbound(Boolean directionOutbound) {
		this.directionOutbound = directionOutbound;
	}

	/**
	 * Set the traffic Direction.

If {{true}} this Child SA refers to outbound traffic.

If {{false}} this Child SA refers to inbound traffic.
	 *
	 * @since 1.0
	 * @param directionOutbound the input value
	 * @return this instance
	 */
	public ChildSA withDirectionOutbound(Boolean directionOutbound) {
		this.directionOutbound = directionOutbound;
		return this;
	}

	/**
	 * Get the time that the current Child SA was set up.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	/**
	 * Set the time that the current Child SA was set up.
	 *
	 * @since 1.0
	 * @param creationTime the input value
	 */
	public void  setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * Set the time that the current Child SA was set up.
	 *
	 * @since 1.0
	 * @param creationTime the input value
	 * @return this instance
	 */
	public ChildSA withCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
		return this;
	}

	/**
	 * Get the measured traffic in bytes transferred by the Child SA.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTraffic() {
		return traffic;
	}

	/**
	 * Set the measured traffic in bytes transferred by the Child SA.
	 *
	 * @since 1.0
	 * @param traffic the input value
	 */
	public void  setTraffic(Long traffic) {
		this.traffic = traffic;
	}

	/**
	 * Set the measured traffic in bytes transferred by the Child SA.
	 *
	 * @since 1.0
	 * @param traffic the input value
	 * @return this instance
	 */
	public ChildSA withTraffic(Long traffic) {
		this.traffic = traffic;
		return this;
	}

	/**
	 * Get the number of inbound packets discarded by the Child SA due to integrity checking errors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getIntegrityErrors() {
		return integrityErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the Child SA due to integrity checking errors.
	 *
	 * @since 1.0
	 * @param integrityErrors the input value
	 */
	public void  setIntegrityErrors(Long integrityErrors) {
		this.integrityErrors = integrityErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the Child SA due to integrity checking errors.
	 *
	 * @since 1.0
	 * @param integrityErrors the input value
	 * @return this instance
	 */
	public ChildSA withIntegrityErrors(Long integrityErrors) {
		this.integrityErrors = integrityErrors;
		return this;
	}

	/**
	 * Get the number of inbound packets discarded by the Child SA due to anti-replay errors.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getReplayErrors() {
		return replayErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the Child SA due to anti-replay errors.
	 *
	 * @since 1.0
	 * @param replayErrors the input value
	 */
	public void  setReplayErrors(Long replayErrors) {
		this.replayErrors = replayErrors;
	}

	/**
	 * Set the number of inbound packets discarded by the Child SA due to anti-replay errors.
	 *
	 * @since 1.0
	 * @param replayErrors the input value
	 * @return this instance
	 */
	public ChildSA withReplayErrors(Long replayErrors) {
		this.replayErrors = replayErrors;
		return this;
	}

	//</editor-fold>

}