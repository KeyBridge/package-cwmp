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
package org.broadbandforum.tr181.device.managementserver;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * This table provides the ACS with the ability to control the Parameters that are delivered by the Inform RPC.

        Any Parameter (identified by {{param|ParameterName}}) contained in this table MUST be included within the ParameterList argument of the Inform RPC whenever any Event within the {{param|EventList}} is being delivered. 

        This table does not include Forced Inform Parameters, and Forced Inform Parameters are not allowed to be inserted into this table.  Any attempt by an ACS to configure this table to contain a Forced Inform Parameter MUST result in the failure of the SetParameterValues RPC with error code 9007.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.ManagementServer.InformParameter.{i}.")
@XmlRootElement(name = "InformParameter")
@XmlType(name = "Device.ManagementServer.InformParameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class InformParameter {

	/**
	 * Enables or disables this {{object}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * A pattern that describes the Parameter(s) to be included in the Inform’s ParameterList argument.  Specifically, patterns with wildcards (an "*" character) in place of Instance Identifiers are allowed; any attempt to set the value otherwise MUST be rejected by the CPE.  

          If the pattern does not match any existing Parameters at the time that the CPE is creating the Inform RPC, then this {{object|#.InformParameter}} instance is not included in the Inform’s ParameterList argument.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ParameterName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String parameterName;
	/**
	 * Each entry in this list represents an Event for which this Parameter MUST be included within the ParameterList argument of the Inform RPC.

          All Inform Events (see {{bibref|TR-069|Section 3.7.1.5}}), except for "4 VALUE CHANGE", are allowed as entries in this list.  "4 VALUE CHANGE" is not allowed as that would violate requirements contained in {{bibref|TR-069|Section A.3.3.1}}.

          {{empty}} means all events except "4 VALUE CHANGE".
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "EventList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> eventList;

	public InformParameter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public InformParameter withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.8
	 * @param alias the input value
	 * @return this instance
	 */
	public InformParameter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get a pattern that describes the Parameter(s) to be included in the Inform’s ParameterList argument.  Specifically, patterns with wildcards (an "*" character) in place of Instance Identifiers are allowed; any attempt to set the value otherwise MUST be rejected by the CPE.  

          If the pattern does not match any existing Parameters at the time that the CPE is creating the Inform RPC, then this {{object|#.InformParameter}} instance is not included in the Inform’s ParameterList argument.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * Set a pattern that describes the Parameter(s) to be included in the Inform’s ParameterList argument.  Specifically, patterns with wildcards (an "*" character) in place of Instance Identifiers are allowed; any attempt to set the value otherwise MUST be rejected by the CPE.  

          If the pattern does not match any existing Parameters at the time that the CPE is creating the Inform RPC, then this {{object|#.InformParameter}} instance is not included in the Inform’s ParameterList argument.
	 *
	 * @since 2.8
	 * @param parameterName the input value
	 */
	public void  setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	/**
	 * Set a pattern that describes the Parameter(s) to be included in the Inform’s ParameterList argument.  Specifically, patterns with wildcards (an "*" character) in place of Instance Identifiers are allowed; any attempt to set the value otherwise MUST be rejected by the CPE.  

          If the pattern does not match any existing Parameters at the time that the CPE is creating the Inform RPC, then this {{object|#.InformParameter}} instance is not included in the Inform’s ParameterList argument.
	 *
	 * @since 2.8
	 * @param parameterName the input value
	 * @return this instance
	 */
	public InformParameter withParameterName(String parameterName) {
		this.parameterName = parameterName;
		return this;
	}

	/**
	 * Get the each entry in this list represents an Event for which this Parameter MUST be included within the ParameterList argument of the Inform RPC.

          All Inform Events (see {{bibref|TR-069|Section 3.7.1.5}}), except for "4 VALUE CHANGE", are allowed as entries in this list.  "4 VALUE CHANGE" is not allowed as that would violate requirements contained in {{bibref|TR-069|Section A.3.3.1}}.

          {{empty}} means all events except "4 VALUE CHANGE".
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getEventList() {
		if (this.eventList == null){ this.eventList=new ArrayList<>();}
		return eventList;
	}

	/**
	 * Set the each entry in this list represents an Event for which this Parameter MUST be included within the ParameterList argument of the Inform RPC.

          All Inform Events (see {{bibref|TR-069|Section 3.7.1.5}}), except for "4 VALUE CHANGE", are allowed as entries in this list.  "4 VALUE CHANGE" is not allowed as that would violate requirements contained in {{bibref|TR-069|Section A.3.3.1}}.

          {{empty}} means all events except "4 VALUE CHANGE".
	 *
	 * @since 2.8
	 * @param eventList the input value
	 */
	public void  setEventList(Collection<String> eventList) {
		this.eventList = eventList;
	}

	/**
	 * Set the each entry in this list represents an Event for which this Parameter MUST be included within the ParameterList argument of the Inform RPC.

          All Inform Events (see {{bibref|TR-069|Section 3.7.1.5}}), except for "4 VALUE CHANGE", are allowed as entries in this list.  "4 VALUE CHANGE" is not allowed as that would violate requirements contained in {{bibref|TR-069|Section A.3.3.1}}.

          {{empty}} means all events except "4 VALUE CHANGE".
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public InformParameter withEventList(String string) {
		getEventList().add(string);
		return this;
	}

	//</editor-fold>

}