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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the UE internal measurement control parameters.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.UEInternalMeas.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.RAN.UEInternalMeas")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.UEInternalMeas")
@XmlAccessorType(XmlAccessType.FIELD)
public class UEInternalMeas {

	/**
	 * Defines the filter coefficient for UE internal measurement.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.79}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterCoefficient")
	@CWMPParameter(access = "readWrite")
	@Size(min = 19, max = 19)
	public Long filterCoefficient;
	/**
	 * Defines the threshold for UE transmit power above which Event 6a is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UETxPwrThresholdEvent6a")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -50, max = 33)
	public Integer uetxPwrThresholdEvent6a;
	/**
	 * Defines the period in milliseconds between detection of Event 6a and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent6a")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent6a;
	/**
	 * Defines the threshold for UE transmit power above which Event 6b is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UETxPwrThresholdEvent6b")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -50, max = 33)
	public Integer uetxPwrThresholdEvent6b;
	/**
	 * Defines the period in milliseconds between detection of Event 6b and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent6b")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent6b;

	public UEInternalMeas() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the filter coefficient for UE internal measurement.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.79}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFilterCoefficient() {
		return filterCoefficient;
	}

	/**
	 * Set the defines the filter coefficient for UE internal measurement.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.79}}
	 *
	 * @since 2.0
	 * @param filterCoefficient the input value
	 */
	public void  setFilterCoefficient(Long filterCoefficient) {
		this.filterCoefficient = filterCoefficient;
	}

	/**
	 * Set the defines the filter coefficient for UE internal measurement.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.79}}
	 *
	 * @since 2.0
	 * @param filterCoefficient the input value
	 * @return this instance
	 */
	public UEInternalMeas withFilterCoefficient(Long filterCoefficient) {
		this.filterCoefficient = filterCoefficient;
		return this;
	}

	/**
	 * Get the defines the threshold for UE transmit power above which Event 6a is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getUetxPwrThresholdEvent6a() {
		return uetxPwrThresholdEvent6a;
	}

	/**
	 * Set the defines the threshold for UE transmit power above which Event 6a is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param uetxPwrThresholdEvent6a the input value
	 */
	public void  setUetxPwrThresholdEvent6a(Integer uetxPwrThresholdEvent6a) {
		this.uetxPwrThresholdEvent6a = uetxPwrThresholdEvent6a;
	}

	/**
	 * Set the defines the threshold for UE transmit power above which Event 6a is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param uetxPwrThresholdEvent6a the input value
	 * @return this instance
	 */
	public UEInternalMeas withUetxPwrThresholdEvent6a(Integer uetxPwrThresholdEvent6a) {
		this.uetxPwrThresholdEvent6a = uetxPwrThresholdEvent6a;
		return this;
	}

	/**
	 * Get the defines the period in milliseconds between detection of Event 6a and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent6a() {
		return timeToTriggerEvent6a;
	}

	/**
	 * Set the defines the period in milliseconds between detection of Event 6a and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent6a the input value
	 */
	public void  setTimeToTriggerEvent6a(Long timeToTriggerEvent6a) {
		this.timeToTriggerEvent6a = timeToTriggerEvent6a;
	}

	/**
	 * Set the defines the period in milliseconds between detection of Event 6a and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent6a the input value
	 * @return this instance
	 */
	public UEInternalMeas withTimeToTriggerEvent6a(Long timeToTriggerEvent6a) {
		this.timeToTriggerEvent6a = timeToTriggerEvent6a;
		return this;
	}

	/**
	 * Get the defines the threshold for UE transmit power above which Event 6b is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getUetxPwrThresholdEvent6b() {
		return uetxPwrThresholdEvent6b;
	}

	/**
	 * Set the defines the threshold for UE transmit power above which Event 6b is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param uetxPwrThresholdEvent6b the input value
	 */
	public void  setUetxPwrThresholdEvent6b(Integer uetxPwrThresholdEvent6b) {
		this.uetxPwrThresholdEvent6b = uetxPwrThresholdEvent6b;
	}

	/**
	 * Set the defines the threshold for UE transmit power above which Event 6b is reported.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param uetxPwrThresholdEvent6b the input value
	 * @return this instance
	 */
	public UEInternalMeas withUetxPwrThresholdEvent6b(Integer uetxPwrThresholdEvent6b) {
		this.uetxPwrThresholdEvent6b = uetxPwrThresholdEvent6b;
		return this;
	}

	/**
	 * Get the defines the period in milliseconds between detection of Event 6b and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent6b() {
		return timeToTriggerEvent6b;
	}

	/**
	 * Set the defines the period in milliseconds between detection of Event 6b and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent6b the input value
	 */
	public void  setTimeToTriggerEvent6b(Long timeToTriggerEvent6b) {
		this.timeToTriggerEvent6b = timeToTriggerEvent6b;
	}

	/**
	 * Set the defines the period in milliseconds between detection of Event 6b and sending of Measurement Report.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.80}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent6b the input value
	 * @return this instance
	 */
	public UEInternalMeas withTimeToTriggerEvent6b(Long timeToTriggerEvent6b) {
		this.timeToTriggerEvent6b = timeToTriggerEvent6b;
		return this;
	}

	//</editor-fold>

}