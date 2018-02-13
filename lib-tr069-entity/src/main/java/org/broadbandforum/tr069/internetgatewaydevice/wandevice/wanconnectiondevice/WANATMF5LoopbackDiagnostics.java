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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice.wanconnectiondevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANATMF5LoopbackDiagnostics.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANATMF5LoopbackDiagnostics")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANConnectionDevice.WANATMF5LoopbackDiagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANATMF5LoopbackDiagnostics {

	/**
	 * Indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public String diagnosticsState;
	/**
	 * Number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfRepetitions")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long numberOfRepetitions;
	/**
	 * Timeout in milliseconds for the ping test.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long timeout;
	/**
	 * Result parameter indicating the number of successful pings (those in which a successful response was received prior to the timeout) in the most recent ping test.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SuccessCount")
	public Long successCount;
	/**
	 * Result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FailureCount")
	public Long failureCount;
	/**
	 * Result parameter indicating the average response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageResponseTime")
	public Long averageResponseTime;
	/**
	 * Result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumResponseTime")
	public Long minimumResponseTime;
	/**
	 * Result parameter indicating the maximum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumResponseTime")
	public Long maximumResponseTime;

	public WANATMF5LoopbackDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

Value may be set to {{enum|Requested}} to initiate the diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 1.0
	 * @param numberOfRepetitions the input value
	 */
	public void  setNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 1.0
	 * @param numberOfRepetitions the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
		return this;
	}

	/**
	 * Get the timeout in milliseconds for the ping test.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds for the ping test.
	 *
	 * @since 1.0
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds for the ping test.
	 *
	 * @since 1.0
	 * @param timeout the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the result parameter indicating the number of successful pings (those in which a successful response was received prior to the timeout) in the most recent ping test.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getSuccessCount() {
		return successCount;
	}

	/**
	 * Set the result parameter indicating the number of successful pings (those in which a successful response was received prior to the timeout) in the most recent ping test.
	 *
	 * @since 1.0
	 * @param successCount the input value
	 */
	public void  setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}

	/**
	 * Set the result parameter indicating the number of successful pings (those in which a successful response was received prior to the timeout) in the most recent ping test.
	 *
	 * @since 1.0
	 * @param successCount the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withSuccessCount(Long successCount) {
		this.successCount = successCount;
		return this;
	}

	/**
	 * Get the result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getFailureCount() {
		return failureCount;
	}

	/**
	 * Set the result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 1.0
	 * @param failureCount the input value
	 */
	public void  setFailureCount(Long failureCount) {
		this.failureCount = failureCount;
	}

	/**
	 * Set the result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 1.0
	 * @param failureCount the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withFailureCount(Long failureCount) {
		this.failureCount = failureCount;
		return this;
	}

	/**
	 * Get the result parameter indicating the average response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAverageResponseTime() {
		return averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param averageResponseTime the input value
	 */
	public void  setAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param averageResponseTime the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumResponseTime() {
		return minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param minimumResponseTime the input value
	 */
	public void  setMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param minimumResponseTime the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the maximum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaximumResponseTime() {
		return maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param maximumResponseTime the input value
	 */
	public void  setMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param maximumResponseTime the input value
	 * @return this instance
	 */
	public WANATMF5LoopbackDiagnostics withMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
		return this;
	}

	//</editor-fold>

}