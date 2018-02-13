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
package org.broadbandforum.tr135.stbservice.servicemonitoring.mainstream.eventlog.entry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object represents an instance of a parameter that is associated with the Entry object Instance.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.MainStream.{i}.EventLog.Entry.{i}.Parameter.{i}.")
@XmlRootElement(name = "Parameter")
@XmlType(name = "STBService.ServiceMonitoring.MainStream.EventLog.Entry.Parameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameter {

	/**
	 * Name of the parameter (vendor-specific).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Name")
	public String name;
	/**
	 * Value of the parameter.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Value")
	public String value;

	public Parameter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the name of the parameter (vendor-specific).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the parameter (vendor-specific).
	 *
	 * @since 1.4
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the parameter (vendor-specific).
	 *
	 * @since 1.4
	 * @param name the input value
	 * @return this instance
	 */
	public Parameter withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the value of the parameter.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set the value of the parameter.
	 *
	 * @since 1.4
	 * @param value the input value
	 */
	public void  setValue(String value) {
		this.value = value;
	}

	/**
	 * Set the value of the parameter.
	 *
	 * @since 1.4
	 * @param value the input value
	 * @return this instance
	 */
	public Parameter withValue(String value) {
		this.value = value;
		return this;
	}

	//</editor-fold>

}