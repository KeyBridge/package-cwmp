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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.eventlog.Entry;

	/**
	 * This object represents the log entries of events recorded by the MainStream object instance.

When the number of log entries in the EventLog exceeds the value of the {{param|###.Capabilities.ServiceMonitoring.MaxMainStreamEventLogEntries}} parameter, the Entry object with the lowest SequenceNumber value is replaced by the new EventLog Entry object.

Log entries are persisted across reboots of the CPE.
	 *
	 * @since TR135 v1.4
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.EventLog.")
@XmlRootElement(name = "STBService.ServiceMonitoring.MainStream.EventLog")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.EventLog")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventLog {

	/**
	 * When set to true, clears the events from the event log and the value of {{param|Entry.{i}.SequenceNumber}} parameter is reset to the parameter's minimum value.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * This object represents an entry (e.g., start session, channel change) in the event log.
	 */
	@XmlElementWrapper(name = "Entries")
	@XmlElement(name = "Entry")
	public Collection<Entry> entries;

	public EventLog() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the when set to true, clears the events from the event log and the value of {{param|Entry.{i}.SequenceNumber}} parameter is reset to the parameter's minimum value.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to true, clears the events from the event log and the value of {{param|Entry.{i}.SequenceNumber}} parameter is reset to the parameter's minimum value.
	 *
	 * @since 1.4
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to true, clears the events from the event log and the value of {{param|Entry.{i}.SequenceNumber}} parameter is reset to the parameter's minimum value.
	 *
	 * @since 1.4
	 * @param reset the input value
	 * @return this instance
	 */
	public EventLog withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the this object represents an entry (e.g., start session, channel change) in the event log.
	 *
	 * @return the value
	 */
	public Collection<Entry> getEntries() {
		if (this.entries == null){ this.entries=new ArrayList<>();}
		return entries;
	}

	/**
	 * Set the this object represents an entry (e.g., start session, channel change) in the event log.
	 *
	 * @param entries the input value
	 */
	public void  setEntries(Collection<Entry> entries) {
		this.entries = entries;
	}

	/**
	 * Set the this object represents an entry (e.g., start session, channel change) in the event log.
	 *
	 * @param entry the input value
	 * @return this instance
	 */
	public EventLog withEntry(Entry entry) {
		getEntries().add(entry);
		return this;
	}

	//</editor-fold>

}