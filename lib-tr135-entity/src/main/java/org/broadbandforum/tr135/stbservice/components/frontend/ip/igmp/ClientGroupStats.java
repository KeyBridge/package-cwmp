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
package org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;
import org.broadbandforum.tr135.datatypes.IPAddress;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp.clientgroupstats.CurrentDay;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp.clientgroupstats.QuarterHour;
import org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp.clientgroupstats.Total;

	/**
	 * IGMP Group statistics table.  This stores per-group historical statistical data.

The CPE MUST support at least ''MaximumNumberOfTrackedGroups'' table entries.  The CPE MAY reclaim entries based on the oldest membership reports.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.IGMP.ClientGroupStats.{i}.")
public class ClientGroupStats {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GroupAddress")
	public IPAddress groupAddress;
	/**
	 * Number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long totalStart;
	/**
	 * Number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

The CPE MAY align the beginning of each {{object|CurrentDay}} interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long currentDayStart;
	/**
	 * Number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

The CPE MAY align the beginning of each {{object|QuarterHour}} interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourStart")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long quarterHourStart;
	/**
	 * Total statistics for this multicast group.
	 */
	@XmlElement(name = "Total")
	public Total total;
	/**
	 * Current day statistics for this multicast group.
	 */
	@XmlElement(name = "CurrentDay")
	public CurrentDay currentDay;
	/**
	 * Current quarter hour statistics for this multicast group.
	 */
	@XmlElement(name = "QuarterHour")
	public QuarterHour quarterHour;

	public ClientGroupStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public ClientGroupStats withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getGroupAddress() {
		return groupAddress;
	}

	/**
	 * Set the IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 * @param groupAddress the input value
	 */
	public void  setGroupAddress(IPAddress groupAddress) {
		this.groupAddress = groupAddress;
	}

	/**
	 * Set the IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 * @param groupAddress the input value
	 * @return this instance
	 */
	public ClientGroupStats withGroupAddress(IPAddress groupAddress) {
		this.groupAddress = groupAddress;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalStart() {
		return totalStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @param totalStart the input value
	 */
	public void  setTotalStart(Long totalStart) {
		this.totalStart = totalStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of {{object|Total}} statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @param totalStart the input value
	 * @return this instance
	 */
	public ClientGroupStats withTotalStart(Long totalStart) {
		this.totalStart = totalStart;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

The CPE MAY align the beginning of each {{object|CurrentDay}} interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayStart() {
		return currentDayStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

The CPE MAY align the beginning of each {{object|CurrentDay}} interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @param currentDayStart the input value
	 */
	public void  setCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of {{object|CurrentDay}} statistics.

The CPE MAY align the beginning of each {{object|CurrentDay}} interval with days in the UTC time zone, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @param currentDayStart the input value
	 * @return this instance
	 */
	public ClientGroupStats withCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

The CPE MAY align the beginning of each {{object|QuarterHour}} interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourStart() {
		return quarterHourStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

The CPE MAY align the beginning of each {{object|QuarterHour}} interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @param quarterHourStart the input value
	 */
	public void  setQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of {{object|QuarterHour}} statistics.

The CPE MAY align the beginning of each {{object|QuarterHour}} interval with real-time quarter-hour intervals, but is not required to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this may not always be possible.
	 *
	 * @since 1.0
	 * @param quarterHourStart the input value
	 * @return this instance
	 */
	public ClientGroupStats withQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
		return this;
	}

	/**
	 * Get the total statistics for this multicast group.
	 *
	 * @return the value
	 */
	public Total getTotal() {
		return total;
	}

	/**
	 * Set the total statistics for this multicast group.
	 *
	 * @param total the input value
	 */
	public void  setTotal(Total total) {
		this.total = total;
	}

	/**
	 * Set the total statistics for this multicast group.
	 *
	 * @param total the input value
	 * @return this instance
	 */
	public ClientGroupStats withTotal(Total total) {
		this.total = total;
		return this;
	}

	/**
	 * Get the current day statistics for this multicast group.
	 *
	 * @return the value
	 */
	public CurrentDay getCurrentDay() {
		return currentDay;
	}

	/**
	 * Set the current day statistics for this multicast group.
	 *
	 * @param currentDay the input value
	 */
	public void  setCurrentDay(CurrentDay currentDay) {
		this.currentDay = currentDay;
	}

	/**
	 * Set the current day statistics for this multicast group.
	 *
	 * @param currentDay the input value
	 * @return this instance
	 */
	public ClientGroupStats withCurrentDay(CurrentDay currentDay) {
		this.currentDay = currentDay;
		return this;
	}

	/**
	 * Get the current quarter hour statistics for this multicast group.
	 *
	 * @return the value
	 */
	public QuarterHour getQuarterHour() {
		return quarterHour;
	}

	/**
	 * Set the current quarter hour statistics for this multicast group.
	 *
	 * @param quarterHour the input value
	 */
	public void  setQuarterHour(QuarterHour quarterHour) {
		this.quarterHour = quarterHour;
	}

	/**
	 * Set the current quarter hour statistics for this multicast group.
	 *
	 * @param quarterHour the input value
	 * @return this instance
	 */
	public ClientGroupStats withQuarterHour(QuarterHour quarterHour) {
		this.quarterHour = quarterHour;
		return this;
	}

	//</editor-fold>

}