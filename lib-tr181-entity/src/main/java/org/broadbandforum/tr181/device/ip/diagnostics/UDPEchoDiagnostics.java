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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.IPAddress;
import org.broadbandforum.tr181.device.ip.diagnostics.udpechodiagnostics.IndividualPacketResult;

	/**
	 * This object defines the diagnostics configuration for a UDP Echo test {{bibref|TR-143a1|Appendix A.1}} defined in {{bibref|RFC862}} or a UDP Echo Plus test defined in {{bibref|TR-143a1|Appendix A.1}}.
	 *
	 * @since TR181 v2.9
	 */
@CWMPObject(name = "Device.IP.Diagnostics.UDPEchoDiagnostics.")
@XmlRootElement(name = "Device.IP.Diagnostics.UDPEchoDiagnostics")
@XmlType(name = "Device.IP.Diagnostics.UDPEchoDiagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class UDPEchoDiagnostics {

	/**
	 * Indicate the availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test. When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic. When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String diagnosticsState;
	/**
	 * {{reference|the IP-layer interface over which the test is to be performed|ignore}} Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Host name or address of the host to perform tests to.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Host")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	@Size(max = 256)
	public String host;
	/**
	 * Port on the host to perform tests to.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	@Size(min = 1, max = 65535)
	public Long port;
	/**
	 * Number of repetitions of the test to perform before reporting the results. The default value SHOULD be 1.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NumberOfRepetitions")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	@Size(min = 1)
	public Long numberOfRepetitions;
	/**
	 * Timeout in milliseconds for the test. That is, the amount of time to wait for the return of a packet that was sent to the {{param|Host}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "milliseconds")
	@Size(min = 1)
	public Long timeout;
	/**
	 * Size of the data block in bytes to be sent for each packet.  The default value SHOULD be 24.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "DataBlockSize")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "bytes")
	@Size(min = 1, max = 65535)
	public Long dataBlockSize;
	/**
	 * DiffServ codepoint to be used for the test packets. The default value SHOULD be zero.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * The time in milliseconds between the {{param|NumberOfRepetitions}} of packets sent during a given test.  The default value SHOULD be 1000.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "InterTransmissionTime")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "milliseconds")
	@Size(min = 1, max = 65535)
	public Long interTransmissionTime;
	/**
	 * Indicates the IP protocol version to be used.  The default value SHOULD be {{enum|Any}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ProtocolVersion")
	@CWMPParameter(access = "readWrite")
	public String protocolVersion;
	/**
	 * Indicates which IP address was used to send the request.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPAddressUsed")
	public IPAddress ipaddressUsed;
	/**
	 * Result parameter indicating the number of successful packets (those in which a successful response was received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "SuccessCount")
	public Long successCount;
	/**
	 * Result parameter indicating the number of failed packets (those in which a successful response was not received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "FailureCount")
	public Long failureCount;
	/**
	 * Result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "AverageResponseTime")
	public Long averageResponseTime;
	/**
	 * Result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MinimumResponseTime")
	public Long minimumResponseTime;
	/**
	 * Result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MaximumResponseTime")
	public Long maximumResponseTime;
	/**
	 * The results must be returned in the {{object|IndividualPacketResult}} table for every repetition of the test when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "EnableIndividualPacketResults")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Boolean enableIndividualPacketResults;
	/**
	 * The maximum number of rows in {{object|IndividualPacketResult}} that the CPE will store.  If a test would create more rows than {{param}} only the first {{param}} rows are present in {{object|IndividualPacketResult}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "UDPEchoDiagnosticsMaxResults")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 1)
	public Long udpEchoDiagnosticsMaxResults;
	/**
	 * This object provides the results from individual UDPEchoPlus test packets collected during a test if {{param|#.EnableIndividualPacketResults}} is set to true.  When {{param|#.DiagnosticsState}} is set to {{enum|Completed|#.DiagnosticsState}} it should contain {{param|#.NumberOfRepetitions}} objects.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  The instance number should match the TestIterationNumber field of the request and response packet.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 */
	@XmlElementWrapper(name = "IndividualPacketResults")
	@XmlElement(name = "IndividualPacketResult")
	public Collection<IndividualPacketResult> individualPacketResults;

	public UDPEchoDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicate the availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test. When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic. When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicate the availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test. When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic. When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.9
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicate the availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test. When writing, the only allowed value is {{enum|Requested}}. To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic. When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots. After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|IndividualPacketResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.9
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference|the IP-layer interface over which the test is to be performed|ignore}} Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference|the IP-layer interface over which the test is to be performed|ignore}} Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.9
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference|the IP-layer interface over which the test is to be performed|ignore}} Example: Device.IP.Interface.1

          If {{empty}} is specified, the CPE MUST use the interface as directed by its routing policy (''Forwarding'' table entries) to determine the appropriate interface.
	 *
	 * @since 2.9
	 * @param _interface the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the host name or address of the host to perform tests to.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Set the host name or address of the host to perform tests to.
	 *
	 * @since 2.9
	 * @param host the input value
	 */
	public void  setHost(String host) {
		this.host = host;
	}

	/**
	 * Set the host name or address of the host to perform tests to.
	 *
	 * @since 2.9
	 * @param host the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withHost(String host) {
		this.host = host;
		return this;
	}

	/**
	 * Get the port on the host to perform tests to.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the port on the host to perform tests to.
	 *
	 * @since 2.9
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the port on the host to perform tests to.
	 *
	 * @since 2.9
	 * @param port the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the number of repetitions of the test to perform before reporting the results. The default value SHOULD be 1.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the test to perform before reporting the results. The default value SHOULD be 1.
	 *
	 * @since 2.9
	 * @param numberOfRepetitions the input value
	 */
	public void  setNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the test to perform before reporting the results. The default value SHOULD be 1.
	 *
	 * @since 2.9
	 * @param numberOfRepetitions the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
		return this;
	}

	/**
	 * Get the timeout in milliseconds for the test. That is, the amount of time to wait for the return of a packet that was sent to the {{param|Host}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds for the test. That is, the amount of time to wait for the return of a packet that was sent to the {{param|Host}}.
	 *
	 * @since 2.9
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds for the test. That is, the amount of time to wait for the return of a packet that was sent to the {{param|Host}}.
	 *
	 * @since 2.9
	 * @param timeout the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the size of the data block in bytes to be sent for each packet.  The default value SHOULD be 24.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getDataBlockSize() {
		return dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each packet.  The default value SHOULD be 24.
	 *
	 * @since 2.9
	 * @param dataBlockSize the input value
	 */
	public void  setDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each packet.  The default value SHOULD be 24.
	 *
	 * @since 2.9
	 * @param dataBlockSize the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
		return this;
	}

	/**
	 * Get the diffServ codepoint to be used for the test packets. The default value SHOULD be zero.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets. The default value SHOULD be zero.
	 *
	 * @since 2.9
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets. The default value SHOULD be zero.
	 *
	 * @since 2.9
	 * @param dscP the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withDscP(Long dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the time in milliseconds between the {{param|NumberOfRepetitions}} of packets sent during a given test.  The default value SHOULD be 1000.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getInterTransmissionTime() {
		return interTransmissionTime;
	}

	/**
	 * Set the time in milliseconds between the {{param|NumberOfRepetitions}} of packets sent during a given test.  The default value SHOULD be 1000.
	 *
	 * @since 2.9
	 * @param interTransmissionTime the input value
	 */
	public void  setInterTransmissionTime(Long interTransmissionTime) {
		this.interTransmissionTime = interTransmissionTime;
	}

	/**
	 * Set the time in milliseconds between the {{param|NumberOfRepetitions}} of packets sent during a given test.  The default value SHOULD be 1000.
	 *
	 * @since 2.9
	 * @param interTransmissionTime the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withInterTransmissionTime(Long interTransmissionTime) {
		this.interTransmissionTime = interTransmissionTime;
		return this;
	}

	/**
	 * Get the indicates the IP protocol version to be used.  The default value SHOULD be {{enum|Any}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * Set the indicates the IP protocol version to be used.  The default value SHOULD be {{enum|Any}}.
	 *
	 * @since 2.9
	 * @param protocolVersion the input value
	 */
	public void  setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * Set the indicates the IP protocol version to be used.  The default value SHOULD be {{enum|Any}}.
	 *
	 * @since 2.9
	 * @param protocolVersion the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		return this;
	}

	/**
	 * Get the indicates which IP address was used to send the request.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public IPAddress getIpaddressUsed() {
		return ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used to send the request.
	 *
	 * @since 2.9
	 * @param ipaddressUsed the input value
	 */
	public void  setIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used to send the request.
	 *
	 * @since 2.9
	 * @param ipaddressUsed the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
		return this;
	}

	/**
	 * Get the result parameter indicating the number of successful packets (those in which a successful response was received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getSuccessCount() {
		return successCount;
	}

	/**
	 * Set the result parameter indicating the number of successful packets (those in which a successful response was received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 * @param successCount the input value
	 */
	public void  setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}

	/**
	 * Set the result parameter indicating the number of successful packets (those in which a successful response was received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 * @param successCount the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withSuccessCount(Long successCount) {
		this.successCount = successCount;
		return this;
	}

	/**
	 * Get the result parameter indicating the number of failed packets (those in which a successful response was not received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getFailureCount() {
		return failureCount;
	}

	/**
	 * Set the result parameter indicating the number of failed packets (those in which a successful response was not received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 * @param failureCount the input value
	 */
	public void  setFailureCount(Long failureCount) {
		this.failureCount = failureCount;
	}

	/**
	 * Set the result parameter indicating the number of failed packets (those in which a successful response was not received prior to the timeout) in the most recent test.
	 *
	 * @since 2.9
	 * @param failureCount the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withFailureCount(Long failureCount) {
		this.failureCount = failureCount;
		return this;
	}

	/**
	 * Get the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getAverageResponseTime() {
		return averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param averageResponseTime the input value
	 */
	public void  setAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param averageResponseTime the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getMinimumResponseTime() {
		return minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param minimumResponseTime the input value
	 */
	public void  setMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param minimumResponseTime the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getMaximumResponseTime() {
		return maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param maximumResponseTime the input value
	 */
	public void  setMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent test. If there were no successful responses, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param maximumResponseTime the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
		return this;
	}

	/**
	 * Get the results must be returned in the {{object|IndividualPacketResult}} table for every repetition of the test when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isEnableIndividualPacketResults() {
		return enableIndividualPacketResults;
	}

	/**
	 * Set the results must be returned in the {{object|IndividualPacketResult}} table for every repetition of the test when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 * @param enableIndividualPacketResults the input value
	 */
	public void  setEnableIndividualPacketResults(Boolean enableIndividualPacketResults) {
		this.enableIndividualPacketResults = enableIndividualPacketResults;
	}

	/**
	 * Set the results must be returned in the {{object|IndividualPacketResult}} table for every repetition of the test when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 * @param enableIndividualPacketResults the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withEnableIndividualPacketResults(Boolean enableIndividualPacketResults) {
		this.enableIndividualPacketResults = enableIndividualPacketResults;
		return this;
	}

	/**
	 * Get the maximum number of rows in {{object|IndividualPacketResult}} that the CPE will store.  If a test would create more rows than {{param}} only the first {{param}} rows are present in {{object|IndividualPacketResult}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getUdpEchoDiagnosticsMaxResults() {
		return udpEchoDiagnosticsMaxResults;
	}

	/**
	 * Set the maximum number of rows in {{object|IndividualPacketResult}} that the CPE will store.  If a test would create more rows than {{param}} only the first {{param}} rows are present in {{object|IndividualPacketResult}}.
	 *
	 * @since 2.9
	 * @param udpEchoDiagnosticsMaxResults the input value
	 */
	public void  setUdpEchoDiagnosticsMaxResults(Long udpEchoDiagnosticsMaxResults) {
		this.udpEchoDiagnosticsMaxResults = udpEchoDiagnosticsMaxResults;
	}

	/**
	 * Set the maximum number of rows in {{object|IndividualPacketResult}} that the CPE will store.  If a test would create more rows than {{param}} only the first {{param}} rows are present in {{object|IndividualPacketResult}}.
	 *
	 * @since 2.9
	 * @param udpEchoDiagnosticsMaxResults the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withUdpEchoDiagnosticsMaxResults(Long udpEchoDiagnosticsMaxResults) {
		this.udpEchoDiagnosticsMaxResults = udpEchoDiagnosticsMaxResults;
		return this;
	}

	/**
	 * Get the this object provides the results from individual UDPEchoPlus test packets collected during a test if {{param|#.EnableIndividualPacketResults}} is set to true.  When {{param|#.DiagnosticsState}} is set to {{enum|Completed|#.DiagnosticsState}} it should contain {{param|#.NumberOfRepetitions}} objects.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  The instance number should match the TestIterationNumber field of the request and response packet.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @return the value
	 */
	public Collection<IndividualPacketResult> getIndividualPacketResults() {
		if (this.individualPacketResults == null){ this.individualPacketResults=new ArrayList<>();}
		return individualPacketResults;
	}

	/**
	 * Set the this object provides the results from individual UDPEchoPlus test packets collected during a test if {{param|#.EnableIndividualPacketResults}} is set to true.  When {{param|#.DiagnosticsState}} is set to {{enum|Completed|#.DiagnosticsState}} it should contain {{param|#.NumberOfRepetitions}} objects.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  The instance number should match the TestIterationNumber field of the request and response packet.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @param individualPacketResults the input value
	 */
	public void  setIndividualPacketResults(Collection<IndividualPacketResult> individualPacketResults) {
		this.individualPacketResults = individualPacketResults;
	}

	/**
	 * Set the this object provides the results from individual UDPEchoPlus test packets collected during a test if {{param|#.EnableIndividualPacketResults}} is set to true.  When {{param|#.DiagnosticsState}} is set to {{enum|Completed|#.DiagnosticsState}} it should contain {{param|#.NumberOfRepetitions}} objects.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  The instance number should match the TestIterationNumber field of the request and response packet.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @param individualPacketResult the input value
	 * @return this instance
	 */
	public UDPEchoDiagnostics withIndividualPacketResult(IndividualPacketResult individualPacketResult) {
		getIndividualPacketResults().add(individualPacketResult);
		return this;
	}

	//</editor-fold>

}