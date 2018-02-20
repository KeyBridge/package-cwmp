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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object allows configuration of CPE policy for notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events defined in {{bibref|TR-069a3}}.  

        The CPE policy determines the conditions under which the CPE notifies the ACS of the completion of Deployment Unit state changes that were not specifically requested via CWMP.
	 *
	 * @since TR181 v2.1
	 */
@CWMPObject(name = "Device.ManagementServer.DUStateChangeComplPolicy.")
@XmlRootElement(name = "Device.ManagementServer.DUStateChangeComplPolicy")
@XmlType(name = "Device.ManagementServer.DUStateChangeComplPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
public class DUStateChangeComplPolicy {

	/**
	 * Enables/Disables CPE notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events to the ACS.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the Deployment Unit operations that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  

          Operation types not indicated by this list MUST NOT be included when the CPE notifies the ACS.  {{empty}} is essentially the same as setting {{param|Enable}} to {{false}}.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "OperationTypeFilter")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> operationTypeFilter;
	/**
	 * Indicates the Deployment Unit state change results that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change results omitted from this filter MUST NOT be included when the CPE notifies the ACS.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "ResultTypeFilter")
	@CWMPParameter(access = "readWrite")
	public String resultTypeFilter;
	/**
	 * Indicates the Deployment Unit state change fault codes that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change fault codes omitted from this filter MUST NOT be included when the CPE notifies the ACS.

          This filter has no effect on the notification of a successful autonomous state change. This filter only applies when {{param|ResultTypeFilter}} is set to either {{enum|Failure|ResultTypeFilter}} or {{enum|Both|ResultTypeFilter}}.  {{empty}} means that failed autonomous state changes will not be sent to the ACS.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FaultCodeFilter")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> faultCodeFilter;

	public DUStateChangeComplPolicy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables/Disables CPE notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events to the ACS.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables/Disables CPE notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events to the ACS.
	 *
	 * @since 2.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables/Disables CPE notification of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events to the ACS.
	 *
	 * @since 2.1
	 * @param enable the input value
	 * @return this instance
	 */
	public DUStateChangeComplPolicy withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the Deployment Unit operations that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  

          Operation types not indicated by this list MUST NOT be included when the CPE notifies the ACS.  {{empty}} is essentially the same as setting {{param|Enable}} to {{false}}.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getOperationTypeFilter() {
		if (this.operationTypeFilter == null){ this.operationTypeFilter=new ArrayList<>();}
		return operationTypeFilter;
	}

	/**
	 * Set the indicates the Deployment Unit operations that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  

          Operation types not indicated by this list MUST NOT be included when the CPE notifies the ACS.  {{empty}} is essentially the same as setting {{param|Enable}} to {{false}}.
	 *
	 * @since 2.1
	 * @param operationTypeFilter the input value
	 */
	public void  setOperationTypeFilter(Collection<String> operationTypeFilter) {
		this.operationTypeFilter = operationTypeFilter;
	}

	/**
	 * Set the indicates the Deployment Unit operations that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  

          Operation types not indicated by this list MUST NOT be included when the CPE notifies the ACS.  {{empty}} is essentially the same as setting {{param|Enable}} to {{false}}.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public DUStateChangeComplPolicy withOperationTypeFilter(String string) {
		getOperationTypeFilter().add(string);
		return this;
	}

	/**
	 * Get the indicates the Deployment Unit state change results that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change results omitted from this filter MUST NOT be included when the CPE notifies the ACS.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public String getResultTypeFilter() {
		return resultTypeFilter;
	}

	/**
	 * Set the indicates the Deployment Unit state change results that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change results omitted from this filter MUST NOT be included when the CPE notifies the ACS.
	 *
	 * @since 2.1
	 * @param resultTypeFilter the input value
	 */
	public void  setResultTypeFilter(String resultTypeFilter) {
		this.resultTypeFilter = resultTypeFilter;
	}

	/**
	 * Set the indicates the Deployment Unit state change results that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change results omitted from this filter MUST NOT be included when the CPE notifies the ACS.
	 *
	 * @since 2.1
	 * @param resultTypeFilter the input value
	 * @return this instance
	 */
	public DUStateChangeComplPolicy withResultTypeFilter(String resultTypeFilter) {
		this.resultTypeFilter = resultTypeFilter;
		return this;
	}

	/**
	 * Get the indicates the Deployment Unit state change fault codes that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change fault codes omitted from this filter MUST NOT be included when the CPE notifies the ACS.

          This filter has no effect on the notification of a successful autonomous state change. This filter only applies when {{param|ResultTypeFilter}} is set to either {{enum|Failure|ResultTypeFilter}} or {{enum|Both|ResultTypeFilter}}.  {{empty}} means that failed autonomous state changes will not be sent to the ACS.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Collection<String> getFaultCodeFilter() {
		if (this.faultCodeFilter == null){ this.faultCodeFilter=new ArrayList<>();}
		return faultCodeFilter;
	}

	/**
	 * Set the indicates the Deployment Unit state change fault codes that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change fault codes omitted from this filter MUST NOT be included when the CPE notifies the ACS.

          This filter has no effect on the notification of a successful autonomous state change. This filter only applies when {{param|ResultTypeFilter}} is set to either {{enum|Failure|ResultTypeFilter}} or {{enum|Both|ResultTypeFilter}}.  {{empty}} means that failed autonomous state changes will not be sent to the ACS.
	 *
	 * @since 2.1
	 * @param faultCodeFilter the input value
	 */
	public void  setFaultCodeFilter(Collection<String> faultCodeFilter) {
		this.faultCodeFilter = faultCodeFilter;
	}

	/**
	 * Set the indicates the Deployment Unit state change fault codes that MUST be included when the CPE notifies the ACS of "12 AUTONOMOUS DU STATE CHANGE COMPLETE" events.  State change fault codes omitted from this filter MUST NOT be included when the CPE notifies the ACS.

          This filter has no effect on the notification of a successful autonomous state change. This filter only applies when {{param|ResultTypeFilter}} is set to either {{enum|Failure|ResultTypeFilter}} or {{enum|Both|ResultTypeFilter}}.  {{empty}} means that failed autonomous state changes will not be sent to the ACS.
	 *
	 * @since 2.1
	 * @param string the input value
	 * @return this instance
	 */
	public DUStateChangeComplPolicy withFaultCodeFilter(String string) {
		getFaultCodeFilter().add(string);
		return this;
	}

	//</editor-fold>

}