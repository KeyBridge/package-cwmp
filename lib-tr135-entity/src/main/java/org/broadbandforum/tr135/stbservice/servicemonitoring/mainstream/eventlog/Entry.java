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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.eventlog;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.eventlog.entry.Parameter;

	/**
	 * This object represents an entry (e.g., start session, channel change) in the event log.
	 *
	 * @since TR135 v1.4
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.EventLog.Entry.{i}.", uniqueConstraints = {@CWMPUnique(names = {"SequenceNumber"})})
@XmlRootElement(name = "STBService.ServiceMonitoring.MainStream.EventLog.Entry")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.EventLog.Entry")
@XmlAccessorType(XmlAccessType.FIELD)
public class Entry {

	/**
	 * The sequence number of the event within the EventLog.

This parameter is incremented by one (1) for each entry within the EventLog.

When the value of the parameter exceeds the maximium range, the lowest value of this parameter that is not contained in current EventLog entries is used.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SequenceNumber")
	@Size(min = 1)
	public Long sequenceNumber;
	/**
	 * Type of the event. The values for this parameter are vendor specific.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * Timestamp of the event.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Time")
	public LocalDateTime time;
	/**
	 * This object represents an instance of a parameter that is associated with the Entry object Instance.
	 */
	@XmlElementWrapper(name = "Parameters")
	@XmlElement(name = "Parameter")
	public Collection<Parameter> parameters;

	public Entry() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the sequence number of the event within the EventLog.

This parameter is incremented by one (1) for each entry within the EventLog.

When the value of the parameter exceeds the maximium range, the lowest value of this parameter that is not contained in current EventLog entries is used.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Set the sequence number of the event within the EventLog.

This parameter is incremented by one (1) for each entry within the EventLog.

When the value of the parameter exceeds the maximium range, the lowest value of this parameter that is not contained in current EventLog entries is used.
	 *
	 * @since 1.4
	 * @param sequenceNumber the input value
	 */
	public void  setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	/**
	 * Set the sequence number of the event within the EventLog.

This parameter is incremented by one (1) for each entry within the EventLog.

When the value of the parameter exceeds the maximium range, the lowest value of this parameter that is not contained in current EventLog entries is used.
	 *
	 * @since 1.4
	 * @param sequenceNumber the input value
	 * @return this instance
	 */
	public Entry withSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	/**
	 * Get the type of the event. The values for this parameter are vendor specific.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of the event. The values for this parameter are vendor specific.
	 *
	 * @since 1.4
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the type of the event. The values for this parameter are vendor specific.
	 *
	 * @since 1.4
	 * @param type the input value
	 * @return this instance
	 */
	public Entry withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the timestamp of the event.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public LocalDateTime getTime() {
		return time;
	}

	/**
	 * Set the timestamp of the event.
	 *
	 * @since 1.4
	 * @param time the input value
	 */
	public void  setTime(LocalDateTime time) {
		this.time = time;
	}

	/**
	 * Set the timestamp of the event.
	 *
	 * @since 1.4
	 * @param time the input value
	 * @return this instance
	 */
	public Entry withTime(LocalDateTime time) {
		this.time = time;
		return this;
	}

	/**
	 * Get the this object represents an instance of a parameter that is associated with the Entry object Instance.
	 *
	 * @return the value
	 */
	public Collection<Parameter> getParameters() {
		if (this.parameters == null){ this.parameters=new ArrayList<>();}
		return parameters;
	}

	/**
	 * Set the this object represents an instance of a parameter that is associated with the Entry object Instance.
	 *
	 * @param parameters the input value
	 */
	public void  setParameters(Collection<Parameter> parameters) {
		this.parameters = parameters;
	}

	/**
	 * Set the this object represents an instance of a parameter that is associated with the Entry object Instance.
	 *
	 * @param parameter the input value
	 * @return this instance
	 */
	public Entry withParameter(Parameter parameter) {
		getParameters().add(parameter);
		return this;
	}

	//</editor-fold>

}