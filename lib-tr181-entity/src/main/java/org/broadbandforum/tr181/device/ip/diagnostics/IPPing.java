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
package org.broadbandforum.tr181.device.ip.diagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.DiagnosticsState;
import org.broadbandforum.tr181.datatypes.IPAddress;

	/**
	 * This object provides access to an IP-layer ping test.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.Diagnostics.IPPing.")
public class IPPing {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public DiagnosticsState diagnosticsState;
	/**
	 * {{reference}} The IP-layer interface over which the test is to be performed. Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Indicates the IP protocol to be used.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ProtocolVersion")
	@CWMPParameter(access = "readWrite")
	public String protocolVersion;
	/**
	 * Host name or address of the host to ping.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Host")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String host;
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
	 * Size of the data block in bytes to be sent for each ping.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DataBlockSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long dataBlockSize;
	/**
	 * DiffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  zero.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * Indicates which IP address was used to send the Ping request. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPAddressUsed")
	public IPAddress ipaddressUsed;
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
	/**
	 * Result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "AverageResponseTimeDetailed")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long averageResponseTimeDetailed;
	/**
	 * Result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MinimumResponseTimeDetailed")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long minimumResponseTimeDetailed;
	/**
	 * Result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MaximumResponseTimeDetailed")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long maximumResponseTimeDetailed;

	public IPPing() {
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
	public IPPing withDiagnosticsState(DiagnosticsState diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference}} The IP-layer interface over which the test is to be performed. Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} The IP-layer interface over which the test is to be performed. Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} The IP-layer interface over which the test is to be performed. Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public IPPing with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the indicates the IP protocol to be used.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * Set the indicates the IP protocol to be used.
	 *
	 * @since 2.8
	 * @param protocolVersion the input value
	 */
	public void  setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * Set the indicates the IP protocol to be used.
	 *
	 * @since 2.8
	 * @param protocolVersion the input value
	 * @return this instance
	 */
	public IPPing withProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		return this;
	}

	/**
	 * Get the host name or address of the host to ping.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Set the host name or address of the host to ping.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 * @param host the input value
	 */
	public void  setHost(String host) {
		this.host = host;
	}

	/**
	 * Set the host name or address of the host to ping.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 * @param host the input value
	 * @return this instance
	 */
	public IPPing withHost(String host) {
		this.host = host;
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
	public IPPing withNumberOfRepetitions(Long numberOfRepetitions) {
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
	public IPPing withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the size of the data block in bytes to be sent for each ping.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDataBlockSize() {
		return dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each ping.
	 *
	 * @since 2.0
	 * @param dataBlockSize the input value
	 */
	public void  setDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each ping.
	 *
	 * @since 2.0
	 * @param dataBlockSize the input value
	 * @return this instance
	 */
	public IPPing withDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
		return this;
	}

	/**
	 * Get the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  zero.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  zero.
	 *
	 * @since 2.0
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  zero.
	 *
	 * @since 2.0
	 * @param dscP the input value
	 * @return this instance
	 */
	public IPPing withDscP(Long dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the indicates which IP address was used to send the Ping request. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getIpaddressUsed() {
		return ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used to send the Ping request. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 * @param ipaddressUsed the input value
	 */
	public void  setIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used to send the Ping request. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 * @param ipaddressUsed the input value
	 * @return this instance
	 */
	public IPPing withIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
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
	public IPPing withSuccessCount(Long successCount) {
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
	public IPPing withFailureCount(Long failureCount) {
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
	public IPPing withAverageResponseTime(Long averageResponseTime) {
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
	public IPPing withMinimumResponseTime(Long minimumResponseTime) {
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
	public IPPing withMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getAverageResponseTimeDetailed() {
		return averageResponseTimeDetailed;
	}

	/**
	 * Set the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @param averageResponseTimeDetailed the input value
	 */
	public void  setAverageResponseTimeDetailed(Long averageResponseTimeDetailed) {
		this.averageResponseTimeDetailed = averageResponseTimeDetailed;
	}

	/**
	 * Set the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @param averageResponseTimeDetailed the input value
	 * @return this instance
	 */
	public IPPing withAverageResponseTimeDetailed(Long averageResponseTimeDetailed) {
		this.averageResponseTimeDetailed = averageResponseTimeDetailed;
		return this;
	}

	/**
	 * Get the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getMinimumResponseTimeDetailed() {
		return minimumResponseTimeDetailed;
	}

	/**
	 * Set the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @param minimumResponseTimeDetailed the input value
	 */
	public void  setMinimumResponseTimeDetailed(Long minimumResponseTimeDetailed) {
		this.minimumResponseTimeDetailed = minimumResponseTimeDetailed;
	}

	/**
	 * Set the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @param minimumResponseTimeDetailed the input value
	 * @return this instance
	 */
	public IPPing withMinimumResponseTimeDetailed(Long minimumResponseTimeDetailed) {
		this.minimumResponseTimeDetailed = minimumResponseTimeDetailed;
		return this;
	}

	/**
	 * Get the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getMaximumResponseTimeDetailed() {
		return maximumResponseTimeDetailed;
	}

	/**
	 * Set the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @param maximumResponseTimeDetailed the input value
	 */
	public void  setMaximumResponseTimeDetailed(Long maximumResponseTimeDetailed) {
		this.maximumResponseTimeDetailed = maximumResponseTimeDetailed;
	}

	/**
	 * Set the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test.  If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.7
	 * @param maximumResponseTimeDetailed the input value
	 * @return this instance
	 */
	public IPPing withMaximumResponseTimeDetailed(Long maximumResponseTimeDetailed) {
		this.maximumResponseTimeDetailed = maximumResponseTimeDetailed;
		return this;
	}

	//</editor-fold>

}