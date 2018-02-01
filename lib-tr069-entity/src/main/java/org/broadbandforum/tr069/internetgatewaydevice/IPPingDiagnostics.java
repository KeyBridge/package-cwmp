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
package org.broadbandforum.tr069.internetgatewaydevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object is provides access to an IP-layer ping test.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.IPPingDiagnostics.")
public class IPPingDiagnostics {

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
	 * Specifies the WAN or LAN IP-layer interface over which the test is to be performed.  The content is the full hierarchical parameter name of the interface. 

The following is a WAN interface example:

: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example:

: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Host name or address of the host to ping.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Host")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String host;
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
	 * Size of the data block in bytes to be sent for each ping.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DataBlockSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long dataBlockSize;
	/**
	 * DiffServ codepoint to be used for the test packets.  By default the CPE should set this value to zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 64)
	public Long dscP;
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
	@XmlElement(name = "MinimumResponseTmie")
	public Long minimumResponseTmie;
	/**
	 * Result parameter indicating the maximum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumResponseTime")
	public Long maximumResponseTime;

	public IPPingDiagnostics() {
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
	public IPPingDiagnostics withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the specifies the WAN or LAN IP-layer interface over which the test is to be performed.  The content is the full hierarchical parameter name of the interface. 

The following is a WAN interface example:

: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example:

: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the specifies the WAN or LAN IP-layer interface over which the test is to be performed.  The content is the full hierarchical parameter name of the interface. 

The following is a WAN interface example:

: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example:

: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the specifies the WAN or LAN IP-layer interface over which the test is to be performed.  The content is the full hierarchical parameter name of the interface. 

The following is a WAN interface example:

: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example:

: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public IPPingDiagnostics with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the host name or address of the host to ping.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Set the host name or address of the host to ping.
	 *
	 * @since 1.0
	 * @param host the input value
	 */
	public void  setHost(String host) {
		this.host = host;
	}

	/**
	 * Set the host name or address of the host to ping.
	 *
	 * @since 1.0
	 * @param host the input value
	 * @return this instance
	 */
	public IPPingDiagnostics withHost(String host) {
		this.host = host;
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
	public IPPingDiagnostics withNumberOfRepetitions(Long numberOfRepetitions) {
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
	public IPPingDiagnostics withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the size of the data block in bytes to be sent for each ping.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDataBlockSize() {
		return dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each ping.
	 *
	 * @since 1.0
	 * @param dataBlockSize the input value
	 */
	public void  setDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each ping.
	 *
	 * @since 1.0
	 * @param dataBlockSize the input value
	 * @return this instance
	 */
	public IPPingDiagnostics withDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
		return this;
	}

	/**
	 * Get the diffServ codepoint to be used for the test packets.  By default the CPE should set this value to zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE should set this value to zero.
	 *
	 * @since 1.0
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE should set this value to zero.
	 *
	 * @since 1.0
	 * @param dscP the input value
	 * @return this instance
	 */
	public IPPingDiagnostics withDscP(Long dscP) {
		this.dscP = dscP;
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
	public IPPingDiagnostics withSuccessCount(Long successCount) {
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
	public IPPingDiagnostics withFailureCount(Long failureCount) {
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
	public IPPingDiagnostics withAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinimumResponseTmie() {
		return minimumResponseTmie;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param minimumResponseTmie the input value
	 */
	public void  setMinimumResponseTmie(Long minimumResponseTmie) {
		this.minimumResponseTmie = minimumResponseTmie;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param minimumResponseTmie the input value
	 * @return this instance
	 */
	public IPPingDiagnostics withMinimumResponseTmie(Long minimumResponseTmie) {
		this.minimumResponseTmie = minimumResponseTmie;
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
	public IPPingDiagnostics withMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
		return this;
	}

	//</editor-fold>

}