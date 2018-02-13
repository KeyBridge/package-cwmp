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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice.wanconnectiondevice;

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

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object instance) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String diagnosticsState = "None";
	/**
	 * Number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfRepetitions")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long numberOfRepetitions = 1L;
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
	@CWMPParameter(activeNotify = "canDeny")
	public Long successCount = 0L;
	/**
	 * Result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FailureCount")
	@CWMPParameter(activeNotify = "canDeny")
	public Long failureCount = 0L;
	/**
	 * Result parameter indicating the average response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long averageResponseTime = 0L;
	/**
	 * Result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinimumResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long minimumResponseTime = 0L;
	/**
	 * Result parameter indicating the maximum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maximumResponseTime = 0L;

	public WANATMF5LoopbackDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object instance) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object instance) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object instance) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
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