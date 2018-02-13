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
package org.broadbandforum.tr181.device.etsim2m.scl.safpolicyset.anppolicy.requestcategory.schedule;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * This object defines an instance of a time span used for determining an RCAT schedule.

        An instance of the {{object}} represents the time span in which the schedule recurrence defined in {{param|#.Schedules}} is constrained.

        {{object}} instances with unknown values for the {{param|StartTime}} or {{param|EndTime}} are ignored.

        All instances of the {{object}} within this {{object|##.Schedule}} MUST utilize the same time zone.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.ETSIM2M.SCL.{i}.SAFPolicySet.{i}.ANPPolicy.{i}.RequestCategory.{i}.Schedule.{i}.AbsTimeSpan.{i}.")
@XmlRootElement(name = "Device.ETSIM2M.SCL.SAFPolicySet.ANPPolicy.RequestCategory.Schedule.AbsTimeSpan")
@XmlType(name = "Device.ETSIM2M.SCL.SAFPolicySet.ANPPolicy.RequestCategory.Schedule.AbsTimeSpan")
@XmlAccessorType(XmlAccessType.FIELD)
public class AbsTimeSpan {

	/**
	 * Administratively enables or disables this instance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Date and time that represents the start of the time span. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value greater than the {{param|EndTime}} value.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "StartTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime startTime = LocalDateTime.parse("0001-01-01T00:00:00Z");;
	/**
	 * Date and time that represents the end of the time span. 

          The value 9999-12-31T23:59:59Z represents an infinite time span from the start time. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value less than or equal the {{param|StartTime}} value.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "EndTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime endTime = LocalDateTime.parse("0001-01-01T00:00:00Z");;

	public AbsTimeSpan() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set administratively enables or disables this instance.
	 *
	 * @since 2.6
	 * @param enable the input value
	 * @return this instance
	 */
	public AbsTimeSpan withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.6
	 * @param alias the input value
	 * @return this instance
	 */
	public AbsTimeSpan withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the date and time that represents the start of the time span. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value greater than the {{param|EndTime}} value.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}

	/**
	 * Set the date and time that represents the start of the time span. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value greater than the {{param|EndTime}} value.
	 *
	 * @since 2.6
	 * @param startTime the input value
	 */
	public void  setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * Set the date and time that represents the start of the time span. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value greater than the {{param|EndTime}} value.
	 *
	 * @since 2.6
	 * @param startTime the input value
	 * @return this instance
	 */
	public AbsTimeSpan withStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Get the date and time that represents the end of the time span. 

          The value 9999-12-31T23:59:59Z represents an infinite time span from the start time. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value less than or equal the {{param|StartTime}} value.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public LocalDateTime getEndTime() {
		return endTime;
	}

	/**
	 * Set the date and time that represents the end of the time span. 

          The value 9999-12-31T23:59:59Z represents an infinite time span from the start time. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value less than or equal the {{param|StartTime}} value.
	 *
	 * @since 2.6
	 * @param endTime the input value
	 */
	public void  setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	/**
	 * Set the date and time that represents the end of the time span. 

          The value 9999-12-31T23:59:59Z represents an infinite time span from the start time. 

          The value 0001-01-01T00:00:00Z represents an unknown value.

          The device MUST reject requests to set the {{param}} value less than or equal the {{param|StartTime}} value.
	 *
	 * @since 2.6
	 * @param endTime the input value
	 * @return this instance
	 */
	public AbsTimeSpan withEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
		return this;
	}

	//</editor-fold>

}