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
package org.broadbandforum.tr098.internetgatewaydevice.faultmgmt;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Contains all currently active alarms (whose {{param|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}} is not {{enum|Cleared|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}}).

Newly raised alarms result in a new entry in this table being added, any changes to the alarm as a result of an update event are updated in the existing table entry, and a clear event raised against an alarm results in the alarm being removed from this table.

If maximum entries as indicated by {{param|.FaultMgmt.MaxCurrentAlarmEntries}} is reached, the next event overrides the object with the oldest {{param|AlarmChangedTime}}.

When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @since 1.10
	 */
@CWMPObject(name = "InternetGatewayDevice.FaultMgmt.CurrentAlarm.{i}.")
@XmlRootElement(name = "CurrentAlarm")
@XmlType(name = "InternetGatewayDevice.FaultMgmt.CurrentAlarm")
@XmlAccessorType(XmlAccessType.FIELD)
public class CurrentAlarm {

	/**
	 * Identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AlarmIdentifier")
	@Size(max = 64)
	public String alarmIdentifier;
	/**
	 * Indicates the date and time when the alarm was first raised by the device.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AlarmRaisedTime")
	public LocalDateTime alarmRaisedTime;
	/**
	 * Indicates the date and time when the alarm was last changed by the device.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AlarmChangedTime")
	public LocalDateTime alarmChangedTime;
	/**
	 * Specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "ManagedObjectInstance")
	@Size(max = 512)
	public String managedObjectInstance;
	/**
	 * Indicates the type of event.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "EventType")
	@Size(max = 64)
	public String eventType;
	/**
	 * Qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "ProbableCause")
	@Size(max = 64)
	public String probableCause;
	/**
	 * Provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SpecificProblem")
	@Size(max = 128)
	public String specificProblem;
	/**
	 * Indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "PerceivedSeverity")
	public String perceivedSeverity;
	/**
	 * This provides a textual string which is vendor defined.

This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AdditionalText")
	@Size(max = 256)
	public String additionalText;
	/**
	 * This contains additional information about the alarm and is vendor defined.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AdditionalInformation")
	@Size(max = 256)
	public String additionalInformation;

	public CurrentAlarm() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getAlarmIdentifier() {
		return alarmIdentifier;
	}

	/**
	 * Set the identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.
	 *
	 * @since 1.10
	 * @param alarmIdentifier the input value
	 */
	public void  setAlarmIdentifier(String alarmIdentifier) {
		this.alarmIdentifier = alarmIdentifier;
	}

	/**
	 * Set the identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.
	 *
	 * @since 1.10
	 * @param alarmIdentifier the input value
	 * @return this instance
	 */
	public CurrentAlarm withAlarmIdentifier(String alarmIdentifier) {
		this.alarmIdentifier = alarmIdentifier;
		return this;
	}

	/**
	 * Get the indicates the date and time when the alarm was first raised by the device.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public LocalDateTime getAlarmRaisedTime() {
		return alarmRaisedTime;
	}

	/**
	 * Set the indicates the date and time when the alarm was first raised by the device.
	 *
	 * @since 1.10
	 * @param alarmRaisedTime the input value
	 */
	public void  setAlarmRaisedTime(LocalDateTime alarmRaisedTime) {
		this.alarmRaisedTime = alarmRaisedTime;
	}

	/**
	 * Set the indicates the date and time when the alarm was first raised by the device.
	 *
	 * @since 1.10
	 * @param alarmRaisedTime the input value
	 * @return this instance
	 */
	public CurrentAlarm withAlarmRaisedTime(LocalDateTime alarmRaisedTime) {
		this.alarmRaisedTime = alarmRaisedTime;
		return this;
	}

	/**
	 * Get the indicates the date and time when the alarm was last changed by the device.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public LocalDateTime getAlarmChangedTime() {
		return alarmChangedTime;
	}

	/**
	 * Set the indicates the date and time when the alarm was last changed by the device.
	 *
	 * @since 1.10
	 * @param alarmChangedTime the input value
	 */
	public void  setAlarmChangedTime(LocalDateTime alarmChangedTime) {
		this.alarmChangedTime = alarmChangedTime;
	}

	/**
	 * Set the indicates the date and time when the alarm was last changed by the device.
	 *
	 * @since 1.10
	 * @param alarmChangedTime the input value
	 * @return this instance
	 */
	public CurrentAlarm withAlarmChangedTime(LocalDateTime alarmChangedTime) {
		this.alarmChangedTime = alarmChangedTime;
		return this;
	}

	/**
	 * Get the specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getManagedObjectInstance() {
		return managedObjectInstance;
	}

	/**
	 * Set the specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 1.10
	 * @param managedObjectInstance the input value
	 */
	public void  setManagedObjectInstance(String managedObjectInstance) {
		this.managedObjectInstance = managedObjectInstance;
	}

	/**
	 * Set the specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 1.10
	 * @param managedObjectInstance the input value
	 * @return this instance
	 */
	public CurrentAlarm withManagedObjectInstance(String managedObjectInstance) {
		this.managedObjectInstance = managedObjectInstance;
		return this;
	}

	/**
	 * Get the indicates the type of event.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * Set the indicates the type of event.
	 *
	 * @since 1.10
	 * @param eventType the input value
	 */
	public void  setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * Set the indicates the type of event.
	 *
	 * @since 1.10
	 * @param eventType the input value
	 * @return this instance
	 */
	public CurrentAlarm withEventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * Get the qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getProbableCause() {
		return probableCause;
	}

	/**
	 * Set the qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 1.10
	 * @param probableCause the input value
	 */
	public void  setProbableCause(String probableCause) {
		this.probableCause = probableCause;
	}

	/**
	 * Set the qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 1.10
	 * @param probableCause the input value
	 * @return this instance
	 */
	public CurrentAlarm withProbableCause(String probableCause) {
		this.probableCause = probableCause;
		return this;
	}

	/**
	 * Get the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getSpecificProblem() {
		return specificProblem;
	}

	/**
	 * Set the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 * @param specificProblem the input value
	 */
	public void  setSpecificProblem(String specificProblem) {
		this.specificProblem = specificProblem;
	}

	/**
	 * Set the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 * @param specificProblem the input value
	 * @return this instance
	 */
	public CurrentAlarm withSpecificProblem(String specificProblem) {
		this.specificProblem = specificProblem;
		return this;
	}

	/**
	 * Get the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getPerceivedSeverity() {
		return perceivedSeverity;
	}

	/**
	 * Set the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 1.10
	 * @param perceivedSeverity the input value
	 */
	public void  setPerceivedSeverity(String perceivedSeverity) {
		this.perceivedSeverity = perceivedSeverity;
	}

	/**
	 * Set the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 1.10
	 * @param perceivedSeverity the input value
	 * @return this instance
	 */
	public CurrentAlarm withPerceivedSeverity(String perceivedSeverity) {
		this.perceivedSeverity = perceivedSeverity;
		return this;
	}

	/**
	 * Get the this provides a textual string which is vendor defined.

This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getAdditionalText() {
		return additionalText;
	}

	/**
	 * Set the this provides a textual string which is vendor defined.

This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 * @param additionalText the input value
	 */
	public void  setAdditionalText(String additionalText) {
		this.additionalText = additionalText;
	}

	/**
	 * Set the this provides a textual string which is vendor defined.

This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 1.10
	 * @param additionalText the input value
	 * @return this instance
	 */
	public CurrentAlarm withAdditionalText(String additionalText) {
		this.additionalText = additionalText;
		return this;
	}

	/**
	 * Get the this contains additional information about the alarm and is vendor defined.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * Set the this contains additional information about the alarm and is vendor defined.
	 *
	 * @since 1.10
	 * @param additionalInformation the input value
	 */
	public void  setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	/**
	 * Set the this contains additional information about the alarm and is vendor defined.
	 *
	 * @since 1.10
	 * @param additionalInformation the input value
	 * @return this instance
	 */
	public CurrentAlarm withAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	//</editor-fold>

}