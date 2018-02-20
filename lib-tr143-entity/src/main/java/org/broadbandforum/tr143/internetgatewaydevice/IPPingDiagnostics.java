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
package org.broadbandforum.tr143.internetgatewaydevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides access to an IP-layer ping test.
	 *
	 * @since TR143 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.IPPingDiagnostics.")
@XmlRootElement(name = "InternetGatewayDevice.IPPingDiagnostics")
@XmlType(name = "InternetGatewayDevice.IPPingDiagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPPingDiagnostics {

	/**
	 * Indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String diagnosticsState;
	/**
	 * Specifies the WAN or LAN IP-layer interface over which the test is to be performed.  The content is the full hierarchical parameter name of the interface. 

The following is a WAN interface example:

: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example:

: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (Forwarding table entries) to determine the appropriate interface.
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
	 * DiffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * Result parameter indicating the number of successful pings (those in which a successful response was received prior to the timeout) in the most recent ping test.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SuccessCount")
	@CWMPParameter(activeNotify = "canDeny")
	public Long successCount;
	/**
	 * Result parameter indicating the number of failed pings in the most recent ping test.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "FailureCount")
	@CWMPParameter(activeNotify = "canDeny")
	public Long failureCount;
	/**
	 * Result parameter indicating the average response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AverageResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long averageResponseTime;
	/**
	 * Result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MinimumResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long minimumResponseTime;
	/**
	 * Result parameter indicating the maximum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaximumResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maximumResponseTime;

	public IPPingDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

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

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

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

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
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

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (Forwarding table entries) to determine the appropriate interface.
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

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (Forwarding table entries) to determine the appropriate interface.
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

The value of this parameter MUST be either a valid interface or {{empty}}.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (Forwarding table entries) to determine the appropriate interface.
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
	 * Get the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
	 *
	 * @since 1.0
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
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
	 * @since 1.1
	 * @return the value
	 */
	public Long getMinimumResponseTime() {
		return minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.1
	 * @param minimumResponseTime the input value
	 */
	public void  setMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in milliseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 1.1
	 * @param minimumResponseTime the input value
	 * @return this instance
	 */
	public IPPingDiagnostics withMinimumResponseTime(Long minimumResponseTime) {
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
	public IPPingDiagnostics withMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
		return this;
	}

	//</editor-fold>

}