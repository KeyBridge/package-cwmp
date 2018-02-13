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
package org.broadbandforum.tr181.device.bulkdata.profile;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Bulk data parameter table.

        Each entry in this table represents a parameter (or set of parameters if a partial path is provided) to be collected and reported.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.BulkData.Profile.{i}.Parameter.{i}.")
@XmlRootElement(name = "Device.BulkData.Profile.Parameter")
@XmlType(name = "Device.BulkData.Profile.Parameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameter {

	/**
	 * Name of the parameter in the report body. 

          If the value of this parameter is {{empty}}, then the value of the {{param|Reference}} parameter is used as the name.

          When the value {{param|Reference}} parameter contains wildcards and/or partial parameter names, the rules for determining the value of this parameter are specified in {{bibref|TR-157a10|Annex A.3.2.1}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * Represents the parameter(s) that are part of this Bulk Data collection profile. The value MUST be a path name of a parameter or an object.

          When the {{param|##.ParameterWildCardSupported}} parameter has a value of {{true}}, patterns for instance identifiers are permitted with wildcards (an "*" character) in place of instance identifiers; any attempt to set the value otherwise MUST be rejected by the CPE.

          In the case where a partial parameter path is specified, the sub-objects of the resolved pattern and contained parameters will be part of the bulk data collected and reported. If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Reference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String reference;

	public Parameter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the name of the parameter in the report body. 

          If the value of this parameter is {{empty}}, then the value of the {{param|Reference}} parameter is used as the name.

          When the value {{param|Reference}} parameter contains wildcards and/or partial parameter names, the rules for determining the value of this parameter are specified in {{bibref|TR-157a10|Annex A.3.2.1}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the parameter in the report body. 

          If the value of this parameter is {{empty}}, then the value of the {{param|Reference}} parameter is used as the name.

          When the value {{param|Reference}} parameter contains wildcards and/or partial parameter names, the rules for determining the value of this parameter are specified in {{bibref|TR-157a10|Annex A.3.2.1}}.
	 *
	 * @since 2.10
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the name of the parameter in the report body. 

          If the value of this parameter is {{empty}}, then the value of the {{param|Reference}} parameter is used as the name.

          When the value {{param|Reference}} parameter contains wildcards and/or partial parameter names, the rules for determining the value of this parameter are specified in {{bibref|TR-157a10|Annex A.3.2.1}}.
	 *
	 * @since 2.10
	 * @param name the input value
	 * @return this instance
	 */
	public Parameter withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the represents the parameter(s) that are part of this Bulk Data collection profile. The value MUST be a path name of a parameter or an object.

          When the {{param|##.ParameterWildCardSupported}} parameter has a value of {{true}}, patterns for instance identifiers are permitted with wildcards (an "*" character) in place of instance identifiers; any attempt to set the value otherwise MUST be rejected by the CPE.

          In the case where a partial parameter path is specified, the sub-objects of the resolved pattern and contained parameters will be part of the bulk data collected and reported. If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Set the represents the parameter(s) that are part of this Bulk Data collection profile. The value MUST be a path name of a parameter or an object.

          When the {{param|##.ParameterWildCardSupported}} parameter has a value of {{true}}, patterns for instance identifiers are permitted with wildcards (an "*" character) in place of instance identifiers; any attempt to set the value otherwise MUST be rejected by the CPE.

          In the case where a partial parameter path is specified, the sub-objects of the resolved pattern and contained parameters will be part of the bulk data collected and reported. If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 2.5
	 * @param reference the input value
	 */
	public void  setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Set the represents the parameter(s) that are part of this Bulk Data collection profile. The value MUST be a path name of a parameter or an object.

          When the {{param|##.ParameterWildCardSupported}} parameter has a value of {{true}}, patterns for instance identifiers are permitted with wildcards (an "*" character) in place of instance identifiers; any attempt to set the value otherwise MUST be rejected by the CPE.

          In the case where a partial parameter path is specified, the sub-objects of the resolved pattern and contained parameters will be part of the bulk data collected and reported. If the path name refers to an object then it MUST end with a '.'.
	 *
	 * @since 2.5
	 * @param reference the input value
	 * @return this instance
	 */
	public Parameter withReference(String reference) {
		this.reference = reference;
		return this;
	}

	//</editor-fold>

}