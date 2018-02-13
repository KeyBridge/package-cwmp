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
package org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp.clientgroupstats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Current quarter hour statistics for this multicast group.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.IGMP.ClientGroupStats.{i}.QuarterHour.")
@XmlRootElement(name = "QuarterHour")
@XmlType(name = "STBService.Components.FrontEnd.IP.IGMP.ClientGroupStats.QuarterHour")
@XmlAccessorType(XmlAccessType.FIELD)
public class QuarterHour {

	/**
	 * Number of IGMP joins during this period.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfJoins")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numberOfJoins;
	/**
	 * Number of IGMP leaves during this period.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfLeaves")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numberOfLeaves;
	/**
	 * Maximum latency delay, in milliseconds, from the sending of a Join message for this group to the arrival of the first IP packet for this group during this period.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxJoinDelay")
	public Long maxJoinDelay;

	public QuarterHour() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of IGMP joins during this period.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getNumberOfJoins() {
		return numberOfJoins;
	}

	/**
	 * Set the number of IGMP joins during this period.
	 *
	 * @since 1.0
	 * @param numberOfJoins the input value
	 */
	public void  setNumberOfJoins(Long numberOfJoins) {
		this.numberOfJoins = numberOfJoins;
	}

	/**
	 * Set the number of IGMP joins during this period.
	 *
	 * @since 1.0
	 * @param numberOfJoins the input value
	 * @return this instance
	 */
	public QuarterHour withNumberOfJoins(Long numberOfJoins) {
		this.numberOfJoins = numberOfJoins;
		return this;
	}

	/**
	 * Get the number of IGMP leaves during this period.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getNumberOfLeaves() {
		return numberOfLeaves;
	}

	/**
	 * Set the number of IGMP leaves during this period.
	 *
	 * @since 1.0
	 * @param numberOfLeaves the input value
	 */
	public void  setNumberOfLeaves(Long numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}

	/**
	 * Set the number of IGMP leaves during this period.
	 *
	 * @since 1.0
	 * @param numberOfLeaves the input value
	 * @return this instance
	 */
	public QuarterHour withNumberOfLeaves(Long numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
		return this;
	}

	/**
	 * Get the maximum latency delay, in milliseconds, from the sending of a Join message for this group to the arrival of the first IP packet for this group during this period.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxJoinDelay() {
		return maxJoinDelay;
	}

	/**
	 * Set the maximum latency delay, in milliseconds, from the sending of a Join message for this group to the arrival of the first IP packet for this group during this period.
	 *
	 * @since 1.0
	 * @param maxJoinDelay the input value
	 */
	public void  setMaxJoinDelay(Long maxJoinDelay) {
		this.maxJoinDelay = maxJoinDelay;
	}

	/**
	 * Set the maximum latency delay, in milliseconds, from the sending of a Join message for this group to the arrival of the first IP packet for this group during this period.
	 *
	 * @since 1.0
	 * @param maxJoinDelay the input value
	 * @return this instance
	 */
	public QuarterHour withMaxJoinDelay(Long maxJoinDelay) {
		this.maxJoinDelay = maxJoinDelay;
		return this;
	}

	//</editor-fold>

}