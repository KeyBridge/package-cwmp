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
package org.broadbandforum.tr181.device.faultmgmt;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * Alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|1 Queued|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.QueuedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.QueuedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @since TR181 v2.4
	 */
@CWMPObject(name = "Device.FaultMgmt.QueuedEvent.{i}.", uniqueConstraints = {@CWMPUnique(names = {"AlarmIdentifier"})})
@XmlRootElement(name = "Device.FaultMgmt.QueuedEvent")
@XmlType(name = "Device.FaultMgmt.QueuedEvent")
@XmlAccessorType(XmlAccessType.FIELD)
public class QueuedEvent {

	/**
	 * Indicates the date and time when the alarm event occurs. 

          For an unpopulated entry, the value is the Unknown Time as defined in {{bibref|TR-106a4}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "EventTime")
	public LocalDateTime eventTime;
	/**
	 * Identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.

          For an unpopulated entry, the value is {{empty}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "AlarmIdentifier")
	@Size(max = 64)
	public String alarmIdentifier;
	/**
	 * Indicates the reason for the specific alarm notification event. {{enum}}
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "NotificationType")
	public String notificationType;
	/**
	 * Specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ManagedObjectInstance")
	@Size(max = 512)
	public String managedObjectInstance;
	/**
	 * Indicates the type of event.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "EventType")
	@Size(max = 64)
	public String eventType;
	/**
	 * Qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ProbableCause")
	@Size(max = 64)
	public String probableCause;
	/**
	 * Provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

          This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SpecificProblem")
	@Size(max = 128)
	public String specificProblem;
	/**
	 * Indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "PerceivedSeverity")
	public String perceivedSeverity;
	/**
	 * This provides a textual string which is vendor defined.

          This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "AdditionalText")
	@Size(max = 256)
	public String additionalText;
	/**
	 * This contains additional information about the alarm and is vendor defined.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "AdditionalInformation")
	@Size(max = 256)
	public String additionalInformation;

	public QueuedEvent() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the date and time when the alarm event occurs. 

          For an unpopulated entry, the value is the Unknown Time as defined in {{bibref|TR-106a4}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public LocalDateTime getEventTime() {
		return eventTime;
	}

	/**
	 * Set the indicates the date and time when the alarm event occurs. 

          For an unpopulated entry, the value is the Unknown Time as defined in {{bibref|TR-106a4}}.
	 *
	 * @since 2.4
	 * @param eventTime the input value
	 */
	public void  setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

	/**
	 * Set the indicates the date and time when the alarm event occurs. 

          For an unpopulated entry, the value is the Unknown Time as defined in {{bibref|TR-106a4}}.
	 *
	 * @since 2.4
	 * @param eventTime the input value
	 * @return this instance
	 */
	public QueuedEvent withEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
		return this;
	}

	/**
	 * Get the identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.

          For an unpopulated entry, the value is {{empty}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getAlarmIdentifier() {
		return alarmIdentifier;
	}

	/**
	 * Set the identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.

          For an unpopulated entry, the value is {{empty}}.
	 *
	 * @since 2.4
	 * @param alarmIdentifier the input value
	 */
	public void  setAlarmIdentifier(String alarmIdentifier) {
		this.alarmIdentifier = alarmIdentifier;
	}

	/**
	 * Set the identifies one Alarm Entry in the Alarm List.  This value MUST be uniquely allocated by the device to the alarm instance during the lifetime of the individual alarm.

          For an unpopulated entry, the value is {{empty}}.
	 *
	 * @since 2.4
	 * @param alarmIdentifier the input value
	 * @return this instance
	 */
	public QueuedEvent withAlarmIdentifier(String alarmIdentifier) {
		this.alarmIdentifier = alarmIdentifier;
		return this;
	}

	/**
	 * Get the indicates the reason for the specific alarm notification event. {{enum}}
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getNotificationType() {
		return notificationType;
	}

	/**
	 * Set the indicates the reason for the specific alarm notification event. {{enum}}
	 *
	 * @since 2.4
	 * @param notificationType the input value
	 */
	public void  setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	/**
	 * Set the indicates the reason for the specific alarm notification event. {{enum}}
	 *
	 * @since 2.4
	 * @param notificationType the input value
	 * @return this instance
	 */
	public QueuedEvent withNotificationType(String notificationType) {
		this.notificationType = notificationType;
		return this;
	}

	/**
	 * Get the specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getManagedObjectInstance() {
		return managedObjectInstance;
	}

	/**
	 * Set the specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 2.4
	 * @param managedObjectInstance the input value
	 */
	public void  setManagedObjectInstance(String managedObjectInstance) {
		this.managedObjectInstance = managedObjectInstance;
	}

	/**
	 * Set the specifies the instance of the Informational Object Class in which the alarm occurred by carrying the Distinguished Name (DN) of this object instance. The format of the DN is specific to the application that is using this {{object}}.
	 *
	 * @since 2.4
	 * @param managedObjectInstance the input value
	 * @return this instance
	 */
	public QueuedEvent withManagedObjectInstance(String managedObjectInstance) {
		this.managedObjectInstance = managedObjectInstance;
		return this;
	}

	/**
	 * Get the indicates the type of event.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * Set the indicates the type of event.
	 *
	 * @since 2.4
	 * @param eventType the input value
	 */
	public void  setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * Set the indicates the type of event.
	 *
	 * @since 2.4
	 * @param eventType the input value
	 * @return this instance
	 */
	public QueuedEvent withEventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * Get the qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getProbableCause() {
		return probableCause;
	}

	/**
	 * Set the qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 2.4
	 * @param probableCause the input value
	 */
	public void  setProbableCause(String probableCause) {
		this.probableCause = probableCause;
	}

	/**
	 * Set the qualifies the alarm and provides further information than {{param|EventType}}.
	 *
	 * @since 2.4
	 * @param probableCause the input value
	 * @return this instance
	 */
	public QueuedEvent withProbableCause(String probableCause) {
		this.probableCause = probableCause;
		return this;
	}

	/**
	 * Get the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

          This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getSpecificProblem() {
		return specificProblem;
	}

	/**
	 * Set the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

          This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 * @param specificProblem the input value
	 */
	public void  setSpecificProblem(String specificProblem) {
		this.specificProblem = specificProblem;
	}

	/**
	 * Set the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

          This is vendor defined and will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 * @param specificProblem the input value
	 * @return this instance
	 */
	public QueuedEvent withSpecificProblem(String specificProblem) {
		this.specificProblem = specificProblem;
		return this;
	}

	/**
	 * Get the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getPerceivedSeverity() {
		return perceivedSeverity;
	}

	/**
	 * Set the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 2.4
	 * @param perceivedSeverity the input value
	 */
	public void  setPerceivedSeverity(String perceivedSeverity) {
		this.perceivedSeverity = perceivedSeverity;
	}

	/**
	 * Set the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}
	 *
	 * @since 2.4
	 * @param perceivedSeverity the input value
	 * @return this instance
	 */
	public QueuedEvent withPerceivedSeverity(String perceivedSeverity) {
		this.perceivedSeverity = perceivedSeverity;
		return this;
	}

	/**
	 * Get the this provides a textual string which is vendor defined.

          This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getAdditionalText() {
		return additionalText;
	}

	/**
	 * Set the this provides a textual string which is vendor defined.

          This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 * @param additionalText the input value
	 */
	public void  setAdditionalText(String additionalText) {
		this.additionalText = additionalText;
	}

	/**
	 * Set the this provides a textual string which is vendor defined.

          This will be {{empty}} if the device doesn't support inclusion of this information.
	 *
	 * @since 2.4
	 * @param additionalText the input value
	 * @return this instance
	 */
	public QueuedEvent withAdditionalText(String additionalText) {
		this.additionalText = additionalText;
		return this;
	}

	/**
	 * Get the this contains additional information about the alarm and is vendor defined.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * Set the this contains additional information about the alarm and is vendor defined.
	 *
	 * @since 2.4
	 * @param additionalInformation the input value
	 */
	public void  setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	/**
	 * Set the this contains additional information about the alarm and is vendor defined.
	 *
	 * @since 2.4
	 * @param additionalInformation the input value
	 * @return this instance
	 */
	public QueuedEvent withAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	//</editor-fold>

}