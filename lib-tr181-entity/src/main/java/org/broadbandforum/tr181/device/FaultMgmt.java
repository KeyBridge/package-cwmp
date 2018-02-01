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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.faultmgmt.CurrentAlarm;
import org.broadbandforum.tr181.device.faultmgmt.ExpeditedEvent;
import org.broadbandforum.tr181.device.faultmgmt.HistoryEvent;
import org.broadbandforum.tr181.device.faultmgmt.QueuedEvent;
import org.broadbandforum.tr181.device.faultmgmt.SupportedAlarm;

	/**
	 * This object contains parameters relating to Fault/Alarm Management.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FaultMgmt.")
public class FaultMgmt {

	/**
	 * The maximum number of entries allowed in the {{object|.FaultMgmt.CurrentAlarm.{i}.}} table.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MaxCurrentAlarmEntries")
	public Long maxCurrentAlarmEntries;
	/**
	 * Supported Alarm Entries which can be raised by the device. 

        The instance numbers for this table SHOULD be maintained across firmware upgrades of the device.
	 */
	@XmlElementWrapper(name = "SupportedAlarms")
	@XmlElement(name = "SupportedAlarm")
	public Collection<SupportedAlarm> supportedAlarms;
	/**
	 * Contains all currently active alarms (whose {{param|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}} is not {{enum|Cleared|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}}).

        Newly raised alarms result in a new entry in this table being added, any changes to the alarm as a result of an update event are updated in the existing table entry, and a clear event raised against an alarm results in the alarm being removed from this table.

        If maximum entries as indicated by {{param|.FaultMgmt.MaxCurrentAlarmEntries}} is reached, the next event overrides the object with the oldest {{param|AlarmChangedTime}}.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 */
	@XmlElementWrapper(name = "CurrentAlarms")
	@XmlElement(name = "CurrentAlarm")
	public Collection<CurrentAlarm> currentAlarms;
	/**
	 * Alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table. This table also contains alarm clearing events.

        Active alarms at the time of a power failure or reboot might not get an alarm clearing event.

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.HistoryEventNumberOfEntries}}.  

        If maximum instance number {{param|.FaultMgmt.HistoryEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.
	 */
	@XmlElementWrapper(name = "HistoryEvents")
	@XmlElement(name = "HistoryEvent")
	public Collection<HistoryEvent> historyEvents;
	/**
	 * Alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|0 Expedited|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 */
	@XmlElementWrapper(name = "ExpeditedEvents")
	@XmlElement(name = "ExpeditedEvent")
	public Collection<ExpeditedEvent> expeditedEvents;
	/**
	 * Alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|1 Queued|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.QueuedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.QueuedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 */
	@XmlElementWrapper(name = "QueuedEvents")
	@XmlElement(name = "QueuedEvent")
	public Collection<QueuedEvent> queuedEvents;

	public FaultMgmt() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries allowed in the {{object|.FaultMgmt.CurrentAlarm.{i}.}} table.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMaxCurrentAlarmEntries() {
		return maxCurrentAlarmEntries;
	}

	/**
	 * Set the maximum number of entries allowed in the {{object|.FaultMgmt.CurrentAlarm.{i}.}} table.
	 *
	 * @since 2.4
	 * @param maxCurrentAlarmEntries the input value
	 */
	public void  setMaxCurrentAlarmEntries(Long maxCurrentAlarmEntries) {
		this.maxCurrentAlarmEntries = maxCurrentAlarmEntries;
	}

	/**
	 * Set the maximum number of entries allowed in the {{object|.FaultMgmt.CurrentAlarm.{i}.}} table.
	 *
	 * @since 2.4
	 * @param maxCurrentAlarmEntries the input value
	 * @return this instance
	 */
	public FaultMgmt withMaxCurrentAlarmEntries(Long maxCurrentAlarmEntries) {
		this.maxCurrentAlarmEntries = maxCurrentAlarmEntries;
		return this;
	}

	/**
	 * Get the supported Alarm Entries which can be raised by the device. 

        The instance numbers for this table SHOULD be maintained across firmware upgrades of the device.
	 *
	 * @return the value
	 */
	public Collection<SupportedAlarm> getSupportedAlarms() {
		if (this.supportedAlarms == null){ this.supportedAlarms=new ArrayList<>();}
		return supportedAlarms;
	}

	/**
	 * Set the supported Alarm Entries which can be raised by the device. 

        The instance numbers for this table SHOULD be maintained across firmware upgrades of the device.
	 *
	 * @param supportedAlarms the input value
	 */
	public void  setSupportedAlarms(Collection<SupportedAlarm> supportedAlarms) {
		this.supportedAlarms = supportedAlarms;
	}

	/**
	 * Set the supported Alarm Entries which can be raised by the device. 

        The instance numbers for this table SHOULD be maintained across firmware upgrades of the device.
	 *
	 * @param supportedAlarm the input value
	 * @return this instance
	 */
	public FaultMgmt withSupportedAlarm(SupportedAlarm supportedAlarm) {
		getSupportedAlarms().add(supportedAlarm);
		return this;
	}

	/**
	 * Get the contains all currently active alarms (whose {{param|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}} is not {{enum|Cleared|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}}).

        Newly raised alarms result in a new entry in this table being added, any changes to the alarm as a result of an update event are updated in the existing table entry, and a clear event raised against an alarm results in the alarm being removed from this table.

        If maximum entries as indicated by {{param|.FaultMgmt.MaxCurrentAlarmEntries}} is reached, the next event overrides the object with the oldest {{param|AlarmChangedTime}}.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @return the value
	 */
	public Collection<CurrentAlarm> getCurrentAlarms() {
		if (this.currentAlarms == null){ this.currentAlarms=new ArrayList<>();}
		return currentAlarms;
	}

	/**
	 * Set the contains all currently active alarms (whose {{param|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}} is not {{enum|Cleared|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}}).

        Newly raised alarms result in a new entry in this table being added, any changes to the alarm as a result of an update event are updated in the existing table entry, and a clear event raised against an alarm results in the alarm being removed from this table.

        If maximum entries as indicated by {{param|.FaultMgmt.MaxCurrentAlarmEntries}} is reached, the next event overrides the object with the oldest {{param|AlarmChangedTime}}.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @param currentAlarms the input value
	 */
	public void  setCurrentAlarms(Collection<CurrentAlarm> currentAlarms) {
		this.currentAlarms = currentAlarms;
	}

	/**
	 * Set the contains all currently active alarms (whose {{param|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}} is not {{enum|Cleared|.FaultMgmt.SupportedAlarm.{i}.PerceivedSeverity}}).

        Newly raised alarms result in a new entry in this table being added, any changes to the alarm as a result of an update event are updated in the existing table entry, and a clear event raised against an alarm results in the alarm being removed from this table.

        If maximum entries as indicated by {{param|.FaultMgmt.MaxCurrentAlarmEntries}} is reached, the next event overrides the object with the oldest {{param|AlarmChangedTime}}.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @param currentAlarm the input value
	 * @return this instance
	 */
	public FaultMgmt withCurrentAlarm(CurrentAlarm currentAlarm) {
		getCurrentAlarms().add(currentAlarm);
		return this;
	}

	/**
	 * Get alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table. This table also contains alarm clearing events.

        Active alarms at the time of a power failure or reboot might not get an alarm clearing event.

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.HistoryEventNumberOfEntries}}.  

        If maximum instance number {{param|.FaultMgmt.HistoryEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.
	 *
	 * @return the value
	 */
	public Collection<HistoryEvent> getHistoryEvents() {
		if (this.historyEvents == null){ this.historyEvents=new ArrayList<>();}
		return historyEvents;
	}

	/**
	 * Set alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table. This table also contains alarm clearing events.

        Active alarms at the time of a power failure or reboot might not get an alarm clearing event.

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.HistoryEventNumberOfEntries}}.  

        If maximum instance number {{param|.FaultMgmt.HistoryEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.
	 *
	 * @param historyEvents the input value
	 */
	public void  setHistoryEvents(Collection<HistoryEvent> historyEvents) {
		this.historyEvents = historyEvents;
	}

	/**
	 * Set alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table. This table also contains alarm clearing events.

        Active alarms at the time of a power failure or reboot might not get an alarm clearing event.

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.HistoryEventNumberOfEntries}}.  

        If maximum instance number {{param|.FaultMgmt.HistoryEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.
	 *
	 * @param historyEvent the input value
	 * @return this instance
	 */
	public FaultMgmt withHistoryEvent(HistoryEvent historyEvent) {
		getHistoryEvents().add(historyEvent);
		return this;
	}

	/**
	 * Get alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|0 Expedited|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @return the value
	 */
	public Collection<ExpeditedEvent> getExpeditedEvents() {
		if (this.expeditedEvents == null){ this.expeditedEvents=new ArrayList<>();}
		return expeditedEvents;
	}

	/**
	 * Set alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|0 Expedited|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @param expeditedEvents the input value
	 */
	public void  setExpeditedEvents(Collection<ExpeditedEvent> expeditedEvents) {
		this.expeditedEvents = expeditedEvents;
	}

	/**
	 * Set alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|0 Expedited|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.ExpeditedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @param expeditedEvent the input value
	 * @return this instance
	 */
	public FaultMgmt withExpeditedEvent(ExpeditedEvent expeditedEvent) {
		getExpeditedEvents().add(expeditedEvent);
		return this;
	}

	/**
	 * Get alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|1 Queued|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.QueuedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.QueuedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @return the value
	 */
	public Collection<QueuedEvent> getQueuedEvents() {
		if (this.queuedEvents == null){ this.queuedEvents=new ArrayList<>();}
		return queuedEvents;
	}

	/**
	 * Set alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|1 Queued|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.QueuedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.QueuedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @param queuedEvents the input value
	 */
	public void  setQueuedEvents(Collection<QueuedEvent> queuedEvents) {
		this.queuedEvents = queuedEvents;
	}

	/**
	 * Set alarm events added or updated in {{object|.FaultMgmt.CurrentAlarm.{i}.}} are simultaneously entered into the this table if their corresponding entry in {{object|.FaultMgmt.SupportedAlarm.{i}.}} has {{param|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}} set to {{enum|1 Queued|.FaultMgmt.SupportedAlarm.{i}.ReportingMechanism}}. This table also contains alarm clearing events. 

        This object has a fixed number of entries with instance numbers from 1 to {{param|.FaultMgmt.QueuedEventNumberOfEntries}}.  

        Initially the table starts with all instances having {{param|EventTime}} set to the Unknown Time value, as defined in {{bibref|TR-106a4}}.

        If maximum instance number {{param|.FaultMgmt.QueuedEventNumberOfEntries}} is reached, the next event overrides the object with instance number 1.  Subsequent entries override objects at sequentially increasing instance numbers.  This logic provides for automatic "rolling" of records.

        When a new alarm replaces an existing alarm, then all parameter values for that instance are considered as changed for the purposes of value change notifications to the ACS (even if their new values are identical to those of the prior alarm).
	 *
	 * @param queuedEvent the input value
	 * @return this instance
	 */
	public FaultMgmt withQueuedEvent(QueuedEvent queuedEvent) {
		getQueuedEvents().add(queuedEvent);
		return this;
	}

	//</editor-fold>

}