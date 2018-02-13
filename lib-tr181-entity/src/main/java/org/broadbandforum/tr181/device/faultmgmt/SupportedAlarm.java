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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Supported Alarm Entries which can be raised by the device. 

        The instance numbers for this table SHOULD be maintained across firmware upgrades of the device.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FaultMgmt.SupportedAlarm.{i}.")
@XmlRootElement(name = "SupportedAlarm")
@XmlType(name = "Device.FaultMgmt.SupportedAlarm")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupportedAlarm {

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

          This is vendor defined and will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}.

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SpecificProblem")
	@Size(max = 128)
	public String specificProblem;
	/**
	 * Indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}

          This will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}. 

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "PerceivedSeverity")
	public String perceivedSeverity;
	/**
	 * Indicates the reporting mechanism setting of the alarm. {{enum}}
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "ReportingMechanism")
	@CWMPParameter(access = "readWrite")
	public String reportingMechanism;

	public SupportedAlarm() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public SupportedAlarm withEventType(String eventType) {
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
	public SupportedAlarm withProbableCause(String probableCause) {
		this.probableCause = probableCause;
		return this;
	}

	/**
	 * Get the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

          This is vendor defined and will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}.

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getSpecificProblem() {
		return specificProblem;
	}

	/**
	 * Set the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

          This is vendor defined and will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}.

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 * @param specificProblem the input value
	 */
	public void  setSpecificProblem(String specificProblem) {
		this.specificProblem = specificProblem;
	}

	/**
	 * Set the provides further qualification on the alarm beyond {{param|EventType}} and {{param|ProbableCause}}.

          This is vendor defined and will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}.

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 * @param specificProblem the input value
	 * @return this instance
	 */
	public SupportedAlarm withSpecificProblem(String specificProblem) {
		this.specificProblem = specificProblem;
		return this;
	}

	/**
	 * Get the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}

          This will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}. 

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getPerceivedSeverity() {
		return perceivedSeverity;
	}

	/**
	 * Set the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}

          This will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}. 

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 * @param perceivedSeverity the input value
	 */
	public void  setPerceivedSeverity(String perceivedSeverity) {
		this.perceivedSeverity = perceivedSeverity;
	}

	/**
	 * Set the indicates the relative level of urgency for operator attention, see {{bibref|ITU-X.733}}. {{enum}}

          This will be {{empty}} if the device doesn't support unique indexing of the table using {{param}}. 

          The string can be set to "*" to indicate the default case if only a subset of {{param}} are to be contained within the table.
	 *
	 * @since 2.4
	 * @param perceivedSeverity the input value
	 * @return this instance
	 */
	public SupportedAlarm withPerceivedSeverity(String perceivedSeverity) {
		this.perceivedSeverity = perceivedSeverity;
		return this;
	}

	/**
	 * Get the indicates the reporting mechanism setting of the alarm. {{enum}}
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getReportingMechanism() {
		return reportingMechanism;
	}

	/**
	 * Set the indicates the reporting mechanism setting of the alarm. {{enum}}
	 *
	 * @since 2.4
	 * @param reportingMechanism the input value
	 */
	public void  setReportingMechanism(String reportingMechanism) {
		this.reportingMechanism = reportingMechanism;
	}

	/**
	 * Set the indicates the reporting mechanism setting of the alarm. {{enum}}
	 *
	 * @since 2.4
	 * @param reportingMechanism the input value
	 * @return this instance
	 */
	public SupportedAlarm withReportingMechanism(String reportingMechanism) {
		this.reportingMechanism = reportingMechanism;
		return this;
	}

	//</editor-fold>

}