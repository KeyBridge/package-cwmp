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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.energysavings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides a time period for which energy saving is not allowed.

This object can be used to prevent a cell entering energy saving state. 

This object is valid on the specified day(s) and time of every week.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.EnergySavings.NotAllowedTimePeriod.{i}.")
@XmlRootElement(name = "NotAllowedTimePeriod")
@XmlType(name = "FAPService.CellConfig.LTE.EnergySavings.NotAllowedTimePeriod")
@XmlAccessorType(XmlAccessType.FIELD)
public class NotAllowedTimePeriod {

	/**
	 * This attribute determines whether the time period is enabled or disabled.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Starting time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "StartTime")
	@CWMPParameter(access = "readWrite")
	public String startTime;
	/**
	 * Ending time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "EndTime")
	@CWMPParameter(access = "readWrite")
	public String endTime;
	/**
	 * {{list| that represents the days of the week that are effective for this time period}}
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "DaysOfWeek")
	@CWMPParameter(access = "readWrite")
	public String daysOfWeek;

	public NotAllowedTimePeriod() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this attribute determines whether the time period is enabled or disabled.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the this attribute determines whether the time period is enabled or disabled.
	 *
	 * @since 2.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the this attribute determines whether the time period is enabled or disabled.
	 *
	 * @since 2.1
	 * @param enable the input value
	 * @return this instance
	 */
	public NotAllowedTimePeriod withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the starting time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Set the starting time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 * @param startTime the input value
	 */
	public void  setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * Set the starting time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 * @param startTime the input value
	 * @return this instance
	 */
	public NotAllowedTimePeriod withStartTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Get the ending time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Set the ending time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 * @param endTime the input value
	 */
	public void  setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * Set the ending time for this time period formatted as "HH:MM:SS" in UTC.
	 *
	 * @since 2.1
	 * @param endTime the input value
	 * @return this instance
	 */
	public NotAllowedTimePeriod withEndTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	/**
	 * Get the {{list| that represents the days of the week that are effective for this time period}}
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getDaysOfWeek() {
		return daysOfWeek;
	}

	/**
	 * Set the {{list| that represents the days of the week that are effective for this time period}}
	 *
	 * @since 2.1
	 * @param daysOfWeek the input value
	 */
	public void  setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	/**
	 * Set the {{list| that represents the days of the week that are effective for this time period}}
	 *
	 * @since 2.1
	 * @param daysOfWeek the input value
	 * @return this instance
	 */
	public NotAllowedTimePeriod withDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
		return this;
	}

	//</editor-fold>

}