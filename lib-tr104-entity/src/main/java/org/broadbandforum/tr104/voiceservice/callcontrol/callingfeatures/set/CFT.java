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
package org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * This object defines a Call Forwarding Timed (CFT) that permit the user to forward calls to particular destinations depending on the time of day.

Note: a bad configuration (e.g. timeslots overlapping) could cause unexpected behavior.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.CallingFeatures.Set.{i}.CFT.{i}.")
public class CFT {

	/**
	 * Whether this schedule is currently enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Day where the schedule active.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Day")
	@CWMPParameter(access = "readWrite")
	public String day;
	/**
	 * Start time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StartTime")
	@CWMPParameter(access = "readWrite")
	@Size(max = 5)
	public String startTime;
	/**
	 * End time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EndTime")
	@CWMPParameter(access = "readWrite")
	@Size(max = 5)
	public String endTime;
	/**
	 * Number to forward the call to.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ForwardedToNumber")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String forwardedToNumber;

	public CFT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the whether this schedule is currently enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the whether this schedule is currently enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the whether this schedule is currently enabled.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public CFT withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public CFT withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the day where the schedule active.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDay() {
		return day;
	}

	/**
	 * Set the day where the schedule active.
	 *
	 * @since 2.0
	 * @param day the input value
	 */
	public void  setDay(String day) {
		this.day = day;
	}

	/**
	 * Set the day where the schedule active.
	 *
	 * @since 2.0
	 * @param day the input value
	 * @return this instance
	 */
	public CFT withDay(String day) {
		this.day = day;
		return this;
	}

	/**
	 * Get the start time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Set the start time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 * @param startTime the input value
	 */
	public void  setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * Set the start time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 * @param startTime the input value
	 * @return this instance
	 */
	public CFT withStartTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Get the end time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Set the end time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 * @param endTime the input value
	 */
	public void  setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * Set the end time of the schedule in the form : hh:mm.
	 *
	 * @since 2.0
	 * @param endTime the input value
	 * @return this instance
	 */
	public CFT withEndTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	/**
	 * Get the number to forward the call to.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getForwardedToNumber() {
		return forwardedToNumber;
	}

	/**
	 * Set the number to forward the call to.
	 *
	 * @since 2.0
	 * @param forwardedToNumber the input value
	 */
	public void  setForwardedToNumber(String forwardedToNumber) {
		this.forwardedToNumber = forwardedToNumber;
	}

	/**
	 * Set the number to forward the call to.
	 *
	 * @since 2.0
	 * @param forwardedToNumber the input value
	 * @return this instance
	 */
	public CFT withForwardedToNumber(String forwardedToNumber) {
		this.forwardedToNumber = forwardedToNumber;
		return this;
	}

	//</editor-fold>

}