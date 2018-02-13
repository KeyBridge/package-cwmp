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
package org.broadbandforum.tr181.device.fap;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.fap.applicationplatform.Capabilities;
import org.broadbandforum.tr181.device.fap.applicationplatform.Control;
import org.broadbandforum.tr181.device.fap.applicationplatform.Monitoring;

	/**
	 * This object defines the data model for the following Femtozone APIs.

        * Femto Awareness

        * SMS

        * MMS

        * Terminal Location

        Femto Awareness, SMS, MMS, and Terminal Location APIs are defined in the Release 1 API Specifications of the Service SIG in the Femto Forum (non public document).

        {{bibref|TR-262|appendix I}} provides the "Theory of Operation" for the usage of this object.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FAP.ApplicationPlatform.")
@XmlRootElement(name = "Device.FAP.ApplicationPlatform")
@XmlType(name = "Device.FAP.ApplicationPlatform")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationPlatform {

	/**
	 * Version of Femto Application Platform running on this device
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Version")
	@Size(max = 64)
	public String version;
	/**
	 * Enable or disable the Femto ApplicationPlatform
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Current state of the Femto Application Platform.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Determines how many Femtozone Applications can be supported by the Femto Application Platform simultaneously.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MaxNumberOfApplications")
	public Long maxNumberOfApplications;
	/**
	 * Specifies how many Femtozone Applications are currently communicating with the Femto Application Platform.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "CurrentNumberofApplications")
	public Long currentNumberofApplications;
	/**
	 * This object contains parameters related to the capabilities of the Femtozone Application Platform and the Femtozone APIs.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;
	/**
	 * This object contains parameters related to the operation of the Femtozone APIs.
	 */
	@XmlElement(name = "Control")
	public Control control;
	/**
	 * This object contains parameters related to the monitoring of the Femtozone Application Platform and the Femtozone APIs.
	 */
	@XmlElement(name = "Monitoring")
	public Monitoring monitoring;

	public ApplicationPlatform() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the version of Femto Application Platform running on this device
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the version of Femto Application Platform running on this device
	 *
	 * @since 2.4
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set the version of Femto Application Platform running on this device
	 *
	 * @since 2.4
	 * @param version the input value
	 * @return this instance
	 */
	public ApplicationPlatform withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the enable or disable the Femto ApplicationPlatform
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable the Femto ApplicationPlatform
	 *
	 * @since 2.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable the Femto ApplicationPlatform
	 *
	 * @since 2.4
	 * @param enable the input value
	 * @return this instance
	 */
	public ApplicationPlatform withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the current state of the Femto Application Platform.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current state of the Femto Application Platform.
	 *
	 * @since 2.4
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current state of the Femto Application Platform.
	 *
	 * @since 2.4
	 * @param status the input value
	 * @return this instance
	 */
	public ApplicationPlatform withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the determines how many Femtozone Applications can be supported by the Femto Application Platform simultaneously.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMaxNumberOfApplications() {
		return maxNumberOfApplications;
	}

	/**
	 * Set the determines how many Femtozone Applications can be supported by the Femto Application Platform simultaneously.
	 *
	 * @since 2.4
	 * @param maxNumberOfApplications the input value
	 */
	public void  setMaxNumberOfApplications(Long maxNumberOfApplications) {
		this.maxNumberOfApplications = maxNumberOfApplications;
	}

	/**
	 * Set the determines how many Femtozone Applications can be supported by the Femto Application Platform simultaneously.
	 *
	 * @since 2.4
	 * @param maxNumberOfApplications the input value
	 * @return this instance
	 */
	public ApplicationPlatform withMaxNumberOfApplications(Long maxNumberOfApplications) {
		this.maxNumberOfApplications = maxNumberOfApplications;
		return this;
	}

	/**
	 * Get the specifies how many Femtozone Applications are currently communicating with the Femto Application Platform.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getCurrentNumberofApplications() {
		return currentNumberofApplications;
	}

	/**
	 * Set the specifies how many Femtozone Applications are currently communicating with the Femto Application Platform.
	 *
	 * @since 2.4
	 * @param currentNumberofApplications the input value
	 */
	public void  setCurrentNumberofApplications(Long currentNumberofApplications) {
		this.currentNumberofApplications = currentNumberofApplications;
	}

	/**
	 * Set the specifies how many Femtozone Applications are currently communicating with the Femto Application Platform.
	 *
	 * @since 2.4
	 * @param currentNumberofApplications the input value
	 * @return this instance
	 */
	public ApplicationPlatform withCurrentNumberofApplications(Long currentNumberofApplications) {
		this.currentNumberofApplications = currentNumberofApplications;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the capabilities of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the this object contains parameters related to the capabilities of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the this object contains parameters related to the capabilities of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public ApplicationPlatform withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the operation of the Femtozone APIs.
	 *
	 * @return the value
	 */
	public Control getControl() {
		return control;
	}

	/**
	 * Set the this object contains parameters related to the operation of the Femtozone APIs.
	 *
	 * @param control the input value
	 */
	public void  setControl(Control control) {
		this.control = control;
	}

	/**
	 * Set the this object contains parameters related to the operation of the Femtozone APIs.
	 *
	 * @param control the input value
	 * @return this instance
	 */
	public ApplicationPlatform withControl(Control control) {
		this.control = control;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the monitoring of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @return the value
	 */
	public Monitoring getMonitoring() {
		return monitoring;
	}

	/**
	 * Set the this object contains parameters related to the monitoring of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @param monitoring the input value
	 */
	public void  setMonitoring(Monitoring monitoring) {
		this.monitoring = monitoring;
	}

	/**
	 * Set the this object contains parameters related to the monitoring of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @param monitoring the input value
	 * @return this instance
	 */
	public ApplicationPlatform withMonitoring(Monitoring monitoring) {
		this.monitoring = monitoring;
		return this;
	}

	//</editor-fold>

}