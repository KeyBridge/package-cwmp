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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.IPAddress;

	/**
	 * This object provides access to a diagnostics test that performs either an ICMP Ping or UDP Echo ping against multiple hosts determining which one has the smallest average response time. There MUST be a ping response to the transmitted ping, or timeout, before the next ping is sent out.
	 *
	 * @since TR181 v2.9
	 */
@CWMPObject(name = "Device.IP.Diagnostics.ServerSelectionDiagnostics.")
@XmlRootElement(name = "Device.IP.Diagnostics.ServerSelectionDiagnostics")
@XmlType(name = "Device.IP.Diagnostics.ServerSelectionDiagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServerSelectionDiagnostics {

	/**
	 * Indicates availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When  writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in  this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the  {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one  of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are  indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to  allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by  the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result  parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to  {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test  being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this  object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
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
	 * Indicates the IP protocol version to be used.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ProtocolVersion")
	@CWMPParameter(access = "readWrite")
	public String protocolVersion;
	/**
	 * The protocol over which the test is to be performed.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	public String protocol;
	/**
	 * Each entry is a Host name or address of a host to ping.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "HostList")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> hostList;
	/**
	 * Number of repetitions of the ping test to perform for each {{param|HostList}} entry before reporting the results.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NumberOfRepetitions")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long numberOfRepetitions;
	/**
	 * Timeout in milliseconds for each iteration of the ping test where the total number of iterations is the value of {{param|NumberOfRepetitions}} times the number of entities in the {{param|HostList}} Parameter.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timeout;
	/**
	 * Result parameter indicating the Host (one of the items within the {{param|HostList}} Parameter) with the smallest average response time.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "FastestHost")
	@CWMPParameter(activeNotify = "canDeny")
	public String fastestHost;
	/**
	 * Result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MinimumResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long minimumResponseTime;
	/**
	 * Result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "AverageResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long averageResponseTime;
	/**
	 * Result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MaximumResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "microseconds")
	public Long maximumResponseTime;
	/**
	 * Indicates which IP address was used to send the request to the host identified in {{param|FastestHost}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPAddressUsed")
	public IPAddress ipaddressUsed;

	public ServerSelectionDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When  writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in  this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the  {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one  of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are  indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to  allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by  the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result  parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to  {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test  being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this  object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When  writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in  this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the  {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one  of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are  indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to  allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by  the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result  parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to  {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test  being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this  object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.9
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When  writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in  this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the  {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one  of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are  indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to  allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by  the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result  parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to  {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test  being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this  object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.9
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withDiagnosticsState(String diagnosticsState) {
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
	public ServerSelectionDiagnostics with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the indicates the IP protocol version to be used.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * Set the indicates the IP protocol version to be used.
	 *
	 * @since 2.9
	 * @param protocolVersion the input value
	 */
	public void  setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * Set the indicates the IP protocol version to be used.
	 *
	 * @since 2.9
	 * @param protocolVersion the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		return this;
	}

	/**
	 * Get the protocol over which the test is to be performed.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the protocol over which the test is to be performed.
	 *
	 * @since 2.9
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the protocol over which the test is to be performed.
	 *
	 * @since 2.9
	 * @param protocol the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the each entry is a Host name or address of a host to ping.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getHostList() {
		if (this.hostList == null){ this.hostList=new ArrayList<>();}
		return hostList;
	}

	/**
	 * Set the each entry is a Host name or address of a host to ping.
	 *
	 * @since 2.9
	 * @param hostList the input value
	 */
	public void  setHostList(Collection<String> hostList) {
		this.hostList = hostList;
	}

	/**
	 * Set the each entry is a Host name or address of a host to ping.
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withHostList(String string) {
		getHostList().add(string);
		return this;
	}

	/**
	 * Get the number of repetitions of the ping test to perform for each {{param|HostList}} entry before reporting the results.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the ping test to perform for each {{param|HostList}} entry before reporting the results.
	 *
	 * @since 2.9
	 * @param numberOfRepetitions the input value
	 */
	public void  setNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
	}

	/**
	 * Set the number of repetitions of the ping test to perform for each {{param|HostList}} entry before reporting the results.
	 *
	 * @since 2.9
	 * @param numberOfRepetitions the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
		return this;
	}

	/**
	 * Get the timeout in milliseconds for each iteration of the ping test where the total number of iterations is the value of {{param|NumberOfRepetitions}} times the number of entities in the {{param|HostList}} Parameter.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds for each iteration of the ping test where the total number of iterations is the value of {{param|NumberOfRepetitions}} times the number of entities in the {{param|HostList}} Parameter.
	 *
	 * @since 2.9
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds for each iteration of the ping test where the total number of iterations is the value of {{param|NumberOfRepetitions}} times the number of entities in the {{param|HostList}} Parameter.
	 *
	 * @since 2.9
	 * @param timeout the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the result parameter indicating the Host (one of the items within the {{param|HostList}} Parameter) with the smallest average response time.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getFastestHost() {
		return fastestHost;
	}

	/**
	 * Set the result parameter indicating the Host (one of the items within the {{param|HostList}} Parameter) with the smallest average response time.
	 *
	 * @since 2.9
	 * @param fastestHost the input value
	 */
	public void  setFastestHost(String fastestHost) {
		this.fastestHost = fastestHost;
	}

	/**
	 * Set the result parameter indicating the Host (one of the items within the {{param|HostList}} Parameter) with the smallest average response time.
	 *
	 * @since 2.9
	 * @param fastestHost the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withFastestHost(String fastestHost) {
		this.fastestHost = fastestHost;
		return this;
	}

	/**
	 * Get the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getMinimumResponseTime() {
		return minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param minimumResponseTime the input value
	 */
	public void  setMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
	}

	/**
	 * Set the result parameter indicating the minimum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param minimumResponseTime the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withMinimumResponseTime(Long minimumResponseTime) {
		this.minimumResponseTime = minimumResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getAverageResponseTime() {
		return averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param averageResponseTime the input value
	 */
	public void  setAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
	}

	/**
	 * Set the result parameter indicating the average response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param averageResponseTime the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withAverageResponseTime(Long averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getMaximumResponseTime() {
		return maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param maximumResponseTime the input value
	 */
	public void  setMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
	}

	/**
	 * Set the result parameter indicating the maximum response time in microseconds over all repetitions with successful responses of the most recent ping test for the Host identified in {{param|FastestHost}}. Success is defined by the underlying protocol used.   If there were no successful responses across all Hosts, this value MUST be zero.
	 *
	 * @since 2.9
	 * @param maximumResponseTime the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withMaximumResponseTime(Long maximumResponseTime) {
		this.maximumResponseTime = maximumResponseTime;
		return this;
	}

	/**
	 * Get the indicates which IP address was used to send the request to the host identified in {{param|FastestHost}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public IPAddress getIpaddressUsed() {
		return ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used to send the request to the host identified in {{param|FastestHost}}.
	 *
	 * @since 2.9
	 * @param ipaddressUsed the input value
	 */
	public void  setIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used to send the request to the host identified in {{param|FastestHost}}.
	 *
	 * @since 2.9
	 * @param ipaddressUsed the input value
	 * @return this instance
	 */
	public ServerSelectionDiagnostics withIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
		return this;
	}

	//</editor-fold>

}