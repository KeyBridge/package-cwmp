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
package org.broadbandforum.tr181.device.atm.diagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.DiagnosticsState;

	/**
	 * This object provides access to an ATM-layer F5 OAM loopback test.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.ATM.Diagnostics.F5Loopback.")
@XmlRootElement(name = "Device.ATM.Diagnostics.F5Loopback")
@XmlType(name = "Device.ATM.Diagnostics.F5Loopback")
@XmlAccessorType(XmlAccessType.FIELD)
public class F5Loopback {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberOfRepetitions")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long numberOfRepetitions;
	/**
	 * Timeout in milliseconds for the ping test.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timeout;
	/**
	 * Result parameter indicating the number of successful pings (those in which a successful response was received  prior to the timeout) in the most recent ping test.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SuccessCount")
	@CWMPParameter(activeNotify = "canDeny")
	public Long successCount;
	/**
	 * Result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FailureCount")
	@CWMPParameter(activeNotify = "canDeny")
	public Long failureCount;
	/**
	 * Result parameter indicating the average response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long averageResponseTime;
	/**
	 * Result parameter indicating the minimum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinimumResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long minimumResponseTime;
	/**
	 * Result parameter indicating the maximum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaximumResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long maximumResponseTime;

	public F5Loopback() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public DiagnosticsState getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public F5Loopback withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}}  This is the interface over which the test is to be performed.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public F5Loopback with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 2.0
	 * @param numberOfRepetitions the input value
	 */
	public void  setNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the ping test to perform before reporting the results.
	 *
	 * @since 2.0
	 * @param numberOfRepetitions the input value
	 * @return this instance
	 */
	public F5Loopback withNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
		return this;
	}

	/**
	 * Get the timeout in milliseconds for the ping test.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds for the ping test.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds for the ping test.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 * @return this instance
	 */
	public F5Loopback withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the result parameter indicating the number of successful pings (those in which a successful response was received  prior to the timeout) in the most recent ping test.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSuccessCount() {
		return successCount;
	}

	/**
	 * Set the result parameter indicating the number of successful pings (those in which a successful response was received  prior to the timeout) in the most recent ping test.
	 *
	 * @since 2.0
	 * @param successCount the input value
	 */
	public void  setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}

	/**
	 * Set the result parameter indicating the number of successful pings (those in which a successful response was received  prior to the timeout) in the most recent ping test.
	 *
	 * @since 2.0
	 * @param successCount the input value
	 * @return this instance
	 */
	public F5Loopback withSuccessCount(Long successCount) {
		this.successCount = successCount;
		return this;
	}

	/**
	 * Get the result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFailureCount() {
		return failureCount;
	}

	/**
	 * Set the result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 2.0
	 * @param failureCount the input value
	 */
	public void  setFailureCount(Long failureCount) {
		this.failureCount = failureCount;
	}

	/**
	 * Set the result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 2.0
	 * @param failureCount the input value
	 * @return this instance
	 */
	public F5Loopback withFailureCount(Long failureCount) {
		this.failureCount = failureCount;
		return this;
	}

	/**
	 * Get the result parameter indicating the average response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAverageResponseTime() {
		return averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param averageResponseTime the input value
	 */
	public void  setAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param averageResponseTime the input value
	 * @return this instance
	 */
	public F5Loopback withAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the minimum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMinimumResponseTime() {
		return minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param minimumResponseTime the input value
	 */
	public void  setMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param minimumResponseTime the input value
	 * @return this instance
	 */
	public F5Loopback withMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the maximum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaximumResponseTime() {
		return maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param maximumResponseTime the input value
	 */
	public void  setMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in milliseconds over all repetitions with successful  responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param maximumResponseTime the input value
	 * @return this instance
	 */
	public F5Loopback withMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
		return this;
	}

	//</editor-fold>

}