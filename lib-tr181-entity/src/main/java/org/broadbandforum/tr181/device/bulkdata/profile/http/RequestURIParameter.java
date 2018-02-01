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
package org.broadbandforum.tr181.device.bulkdata.profile.http;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object represents an instance of a parameter to be used in the report header used as part of the HTTP Request-URI transmitted by the CPE to the collection server using the Request-URI in addition to the parameters required by {{bibref|TR-157a10|Annex A.2.1}}.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.BulkData.Profile.{i}.HTTP.RequestURIParameter.{i}.")
public class RequestURIParameter {

	/**
	 * Name of the Request-URI parameter. 

          If {{param}} is {{empty}}, the name of the Request-URI parameter is the value of {{param|Reference}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * The value MUST be the path name of the Request-URI parameter.

          If the value of this parameter is empty, then this object is not encoded in the report header.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Reference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String reference;

	public RequestURIParameter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the name of the Request-URI parameter. 

          If {{param}} is {{empty}}, the name of the Request-URI parameter is the value of {{param|Reference}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the Request-URI parameter. 

          If {{param}} is {{empty}}, the name of the Request-URI parameter is the value of {{param|Reference}}.
	 *
	 * @since 2.10
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the Request-URI parameter. 

          If {{param}} is {{empty}}, the name of the Request-URI parameter is the value of {{param|Reference}}.
	 *
	 * @since 2.10
	 * @param name the input value
	 * @return this instance
	 */
	public RequestURIParameter withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the value MUST be the path name of the Request-URI parameter.

          If the value of this parameter is empty, then this object is not encoded in the report header.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Set the value MUST be the path name of the Request-URI parameter.

          If the value of this parameter is empty, then this object is not encoded in the report header.
	 *
	 * @since 2.10
	 * @param reference the input value
	 */
	public void  setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Set the value MUST be the path name of the Request-URI parameter.

          If the value of this parameter is empty, then this object is not encoded in the report header.
	 *
	 * @since 2.10
	 * @param reference the input value
	 * @return this instance
	 */
	public RequestURIParameter withReference(String reference) {
		this.reference = reference;
		return this;
	}

	//</editor-fold>

}