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
package org.broadbandforum.tr098.internetgatewaydevice.bulkdata.profile;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Bulk data parameter table.

Each entry in this table represents a parameter (or set of parameters if a partial path is provided) to be collected and reported.
	 *
	 * @since 1.11
	 */
@CWMPObject(name = "InternetGatewayDevice.BulkData.Profile.{i}.Parameter.{i}.")
public class Parameter {

	/**
	 * Represents the parameter(s) that are part of this Bulk Data collection profile.

In the case where a partial parameter path is specified all sub-objects and contained parameters will be part of the bulk data collected and reported.  If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "Reference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String reference;

	public Parameter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the represents the parameter(s) that are part of this Bulk Data collection profile.

In the case where a partial parameter path is specified all sub-objects and contained parameters will be part of the bulk data collected and reported.  If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Set the represents the parameter(s) that are part of this Bulk Data collection profile.

In the case where a partial parameter path is specified all sub-objects and contained parameters will be part of the bulk data collected and reported.  If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 1.11
	 * @param reference the input value
	 */
	public void  setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Set the represents the parameter(s) that are part of this Bulk Data collection profile.

In the case where a partial parameter path is specified all sub-objects and contained parameters will be part of the bulk data collected and reported.  If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 1.11
	 * @param reference the input value
	 * @return this instance
	 */
	public Parameter withReference(String reference) {
		this.reference = reference;
		return this;
	}

	//</editor-fold>

}