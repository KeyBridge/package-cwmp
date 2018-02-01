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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.IPAddress;
import org.broadbandforum.tr181.device.ip.diagnostics.downloaddiagnostics.IncrementalResult;
import org.broadbandforum.tr181.device.ip.diagnostics.downloaddiagnostics.PerConnectionResult;

	/**
	 * This object defines the diagnostics configuration for a HTTP and FTP DownloadDiagnostics Test.

        Files received in the DownloadDiagnostics do not require file storage on the CPE device.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.Diagnostics.DownloadDiagnostics.")
public class DownloadDiagnostics {

	/**
	 * Indicate the availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite")
	public String diagnosticsState;
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
	 * The URL, as defined in {{bibref|RFC3986}}, for the CPE to perform the download on. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

          * When using FTP transport, FTP binary transfer MUST be used.

          * When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

          * When using HTTP transport the HTTP Authentication MUST NOT be used.

          Note: For time based tests ({{param|TimeBasedTestDuration}} > 0) the ACS MAY add a hint to duration of the test to the URL.  See {{bibref|TR-143a1|Section 4.3}} for more details.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownloadURL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String downloadURL;
	/**
	 * Supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownloadTransports")
	@XmlList
	public Collection<String> downloadTransports;
	/**
	 * Indicates the maximum number of connections that are supported by Download Diagnostics.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "DownloadDiagnosticMaxConnections")
	@Size(min = 1)
	public Long downloadDiagnosticMaxConnections;
	/**
	 * The maximum number of rows in {{object|IncrementalResult}} that the CPE will store.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "DownloadDiagnosticsMaxIncrementalResult")
	@Size(min = 1)
	public Long downloadDiagnosticsMaxIncrementalResult;
	/**
	 * The DiffServ code point for marking packets transmitted in the test. 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * Ethernet priority code for marking packets transmitted in the test (if applicable). 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long ethernetPriority;
	/**
	 * Controls time based testing {{bibref|TR-143a1|Section 4.3}}. When {{param}} > 0, {{param}} is the duration in seconds of a time based test. If {{param}} is 0, the test is not based on time, but on the size of the file to be downloaded.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TimeBasedTestDuration")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 999)
	public Long timeBasedTestDuration;
	/**
	 * The measurement interval duration in seconds for objects in {{object|IncrementalResult}} for a time based FTP/HTTP download test (when {{param|TimeBasedTestDuration}} > 0).  The default value SHOULD be 0, which implies {{object|IncrementalResult}} collection is disabled.

          For example if {{param|TimeBasedTestDuration}} is 90 seconds and {{param}} is 10 seconds, there will be 9 results in {{object|IncrementalResult}}, each with a 10 seconds duration.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TimeBasedTestMeasurementInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 999)
	public Long timeBasedTestMeasurementInterval;
	/**
	 * This {{param}} works in conjunction with {{param|TimeBasedTestMeasurementInterval}} to allow the interval measurement to start a number of seconds after {{param|BOMTime}}. The test measurement interval in {{object|IncrementalResult}} starts at time {{param|BOMTime}} + {{param}} to allow for slow start window removal of file transfers.

          This {{param}} is in seconds.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TimeBasedTestMeasurementOffset")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 255)
	public Long timeBasedTestMeasurementOffset;
	/**
	 * Indicates the IP protocol version to be used.  The default value SHOULD be {{enum|Any}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ProtocolVersion")
	@CWMPParameter(access = "readWrite")
	public String protocolVersion;
	/**
	 * The number of connections to be used in the test.  The default value SHOULD be 1.  {{param}} MUST NOT be set to a value greater than {{param|DownloadDiagnosticMaxConnections}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NumberOfConnections")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long numberOfConnections;
	/**
	 * Indicates which IP address was used to send the request.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IPAddressUsed")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress ipaddressUsed;
	/**
	 * Request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the client sends the GET command.

          * For FTP this is the time at which the client sends the RTRV command.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ROMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime romTime;
	/**
	 * Begin of transmission time in UTC, which MUST be specified to microsecond precision

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the first data packet is received.

          * For FTP this is the time at which the client receives the first data packet on the data connection.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BOMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime bomTime;
	/**
	 * End of transmission in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the last data packet is received.

          * For FTP this is the time at which the client receives the last packet on the data connection.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EOMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime eomTime;
	/**
	 * The number of bytes received during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}} across all connections.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TestBytesReceived")
	public Long testBytesReceived;
	/**
	 * The total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TotalBytesReceived")
	public Long totalBytesReceived;
	/**
	 * The total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TotalBytesSent")
	public Long totalBytesSent;
	/**
	 * The number of bytes of the test file received between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} across all connections.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestBytesReceivedUnderFullLoading")
	public Long testBytesReceivedUnderFullLoading;
	/**
	 * The total number of bytes (at the IP layer) received in between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TotalBytesReceivedUnderFullLoading")
	public Long totalBytesReceivedUnderFullLoading;
	/**
	 * The total number of bytes (at the IP layer) sent between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TotalBytesSentUnderFullLoading")
	public Long totalBytesSentUnderFullLoading;
	/**
	 * The period of time in microseconds between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} of the test.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PeriodOfFullLoading")
	public Long periodOfFullLoading;
	/**
	 * Request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

          * For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCPOpenRequestTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime tcpOpenRequestTime;
	/**
	 * Response time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP ACK to the socket opening the HTTP connection was received.

          * For FTP this is the time at which the TCP ACK to the socket opening the data connection was received.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCPOpenResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime tcpOpenResponseTime;
	/**
	 * The results must be returned in the {{object|PerConnectionResult}} table for every connection when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "EnablePerConnectionResults")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Boolean enablePerConnectionResults;
	/**
	 * Results for individual connections.  This table is only populated when {{param|#.EnablePerConnectionResults}} is {{true}}.  A new object is created for each connection specified in {{param|#.NumberOfConnections}}.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 */
	@XmlElementWrapper(name = "perConnectionResults")
	@XmlElement(name = "PerConnectionResult")
	public Collection<PerConnectionResult> perConnectionResults;
	/**
	 * Results for time segmented tests (tests where {{param|#.TimeBasedTestDuration}} > 0 and {{param|#.TimeBasedTestMeasurementInterval}} > 0).  This data is totaled across all connections in the test.  A new object is created every {{param|#.TimeBasedTestMeasurementInterval}} after that interval has completed.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 */
	@XmlElementWrapper(name = "incrementalResults")
	@XmlElement(name = "IncrementalResult")
	public Collection<IncrementalResult> incrementalResults;

	public DownloadDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicate the availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicate the availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicate the availability of diagnostic data.  {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

          If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}} and remove all object instances from {{object|PerConnectionResult}} and {{object|IncrementalResult}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withDiagnosticsState(String diagnosticsState) {
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
	public DownloadDiagnostics with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the URL, as defined in {{bibref|RFC3986}}, for the CPE to perform the download on. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

          * When using FTP transport, FTP binary transfer MUST be used.

          * When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

          * When using HTTP transport the HTTP Authentication MUST NOT be used.

          Note: For time based tests ({{param|TimeBasedTestDuration}} > 0) the ACS MAY add a hint to duration of the test to the URL.  See {{bibref|TR-143a1|Section 4.3}} for more details.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDownloadURL() {
		return downloadURL;
	}

	/**
	 * Set the URL, as defined in {{bibref|RFC3986}}, for the CPE to perform the download on. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

          * When using FTP transport, FTP binary transfer MUST be used.

          * When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

          * When using HTTP transport the HTTP Authentication MUST NOT be used.

          Note: For time based tests ({{param|TimeBasedTestDuration}} > 0) the ACS MAY add a hint to duration of the test to the URL.  See {{bibref|TR-143a1|Section 4.3}} for more details.
	 *
	 * @since 2.0
	 * @param downloadURL the input value
	 */
	public void  setDownloadURL(String downloadURL) {
		this.downloadURL = downloadURL;
	}

	/**
	 * Set the URL, as defined in {{bibref|RFC3986}}, for the CPE to perform the download on. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

          * When using FTP transport, FTP binary transfer MUST be used.

          * When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

          * When using HTTP transport the HTTP Authentication MUST NOT be used.

          Note: For time based tests ({{param|TimeBasedTestDuration}} > 0) the ACS MAY add a hint to duration of the test to the URL.  See {{bibref|TR-143a1|Section 4.3}} for more details.
	 *
	 * @since 2.0
	 * @param downloadURL the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withDownloadURL(String downloadURL) {
		this.downloadURL = downloadURL;
		return this;
	}

	/**
	 * Get the supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDownloadTransports() {
		if (this.downloadTransports == null){ this.downloadTransports=new ArrayList<>();}
		return downloadTransports;
	}

	/**
	 * Set the supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 2.0
	 * @param downloadTransports the input value
	 */
	public void  setDownloadTransports(Collection<String> downloadTransports) {
		this.downloadTransports = downloadTransports;
	}

	/**
	 * Set the supported ''DownloadDiagnostics'' transport protocols for a CPE device.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withDownloadTransports(String string) {
		getDownloadTransports().add(string);
		return this;
	}

	/**
	 * Get the indicates the maximum number of connections that are supported by Download Diagnostics.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getDownloadDiagnosticMaxConnections() {
		return downloadDiagnosticMaxConnections;
	}

	/**
	 * Set the indicates the maximum number of connections that are supported by Download Diagnostics.
	 *
	 * @since 2.9
	 * @param downloadDiagnosticMaxConnections the input value
	 */
	public void  setDownloadDiagnosticMaxConnections(Long downloadDiagnosticMaxConnections) {
		this.downloadDiagnosticMaxConnections = downloadDiagnosticMaxConnections;
	}

	/**
	 * Set the indicates the maximum number of connections that are supported by Download Diagnostics.
	 *
	 * @since 2.9
	 * @param downloadDiagnosticMaxConnections the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withDownloadDiagnosticMaxConnections(Long downloadDiagnosticMaxConnections) {
		this.downloadDiagnosticMaxConnections = downloadDiagnosticMaxConnections;
		return this;
	}

	/**
	 * Get the maximum number of rows in {{object|IncrementalResult}} that the CPE will store.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getDownloadDiagnosticsMaxIncrementalResult() {
		return downloadDiagnosticsMaxIncrementalResult;
	}

	/**
	 * Set the maximum number of rows in {{object|IncrementalResult}} that the CPE will store.
	 *
	 * @since 2.9
	 * @param downloadDiagnosticsMaxIncrementalResult the input value
	 */
	public void  setDownloadDiagnosticsMaxIncrementalResult(Long downloadDiagnosticsMaxIncrementalResult) {
		this.downloadDiagnosticsMaxIncrementalResult = downloadDiagnosticsMaxIncrementalResult;
	}

	/**
	 * Set the maximum number of rows in {{object|IncrementalResult}} that the CPE will store.
	 *
	 * @since 2.9
	 * @param downloadDiagnosticsMaxIncrementalResult the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withDownloadDiagnosticsMaxIncrementalResult(Long downloadDiagnosticsMaxIncrementalResult) {
		this.downloadDiagnosticsMaxIncrementalResult = downloadDiagnosticsMaxIncrementalResult;
		return this;
	}

	/**
	 * Get the DiffServ code point for marking packets transmitted in the test. 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the DiffServ code point for marking packets transmitted in the test. 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the DiffServ code point for marking packets transmitted in the test. 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 * @param dscP the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withDscP(Long dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the ethernet priority code for marking packets transmitted in the test (if applicable). 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEthernetPriority() {
		return ethernetPriority;
	}

	/**
	 * Set the ethernet priority code for marking packets transmitted in the test (if applicable). 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 * @param ethernetPriority the input value
	 */
	public void  setEthernetPriority(Long ethernetPriority) {
		this.ethernetPriority = ethernetPriority;
	}

	/**
	 * Set the ethernet priority code for marking packets transmitted in the test (if applicable). 

          The default value SHOULD be zero.
	 *
	 * @since 2.0
	 * @param ethernetPriority the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withEthernetPriority(Long ethernetPriority) {
		this.ethernetPriority = ethernetPriority;
		return this;
	}

	/**
	 * Get the controls time based testing {{bibref|TR-143a1|Section 4.3}}. When {{param}} > 0, {{param}} is the duration in seconds of a time based test. If {{param}} is 0, the test is not based on time, but on the size of the file to be downloaded.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTimeBasedTestDuration() {
		return timeBasedTestDuration;
	}

	/**
	 * Set the controls time based testing {{bibref|TR-143a1|Section 4.3}}. When {{param}} > 0, {{param}} is the duration in seconds of a time based test. If {{param}} is 0, the test is not based on time, but on the size of the file to be downloaded.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 * @param timeBasedTestDuration the input value
	 */
	public void  setTimeBasedTestDuration(Long timeBasedTestDuration) {
		this.timeBasedTestDuration = timeBasedTestDuration;
	}

	/**
	 * Set the controls time based testing {{bibref|TR-143a1|Section 4.3}}. When {{param}} > 0, {{param}} is the duration in seconds of a time based test. If {{param}} is 0, the test is not based on time, but on the size of the file to be downloaded.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 * @param timeBasedTestDuration the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTimeBasedTestDuration(Long timeBasedTestDuration) {
		this.timeBasedTestDuration = timeBasedTestDuration;
		return this;
	}

	/**
	 * Get the measurement interval duration in seconds for objects in {{object|IncrementalResult}} for a time based FTP/HTTP download test (when {{param|TimeBasedTestDuration}} > 0).  The default value SHOULD be 0, which implies {{object|IncrementalResult}} collection is disabled.

          For example if {{param|TimeBasedTestDuration}} is 90 seconds and {{param}} is 10 seconds, there will be 9 results in {{object|IncrementalResult}}, each with a 10 seconds duration.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTimeBasedTestMeasurementInterval() {
		return timeBasedTestMeasurementInterval;
	}

	/**
	 * Set the measurement interval duration in seconds for objects in {{object|IncrementalResult}} for a time based FTP/HTTP download test (when {{param|TimeBasedTestDuration}} > 0).  The default value SHOULD be 0, which implies {{object|IncrementalResult}} collection is disabled.

          For example if {{param|TimeBasedTestDuration}} is 90 seconds and {{param}} is 10 seconds, there will be 9 results in {{object|IncrementalResult}}, each with a 10 seconds duration.
	 *
	 * @since 2.9
	 * @param timeBasedTestMeasurementInterval the input value
	 */
	public void  setTimeBasedTestMeasurementInterval(Long timeBasedTestMeasurementInterval) {
		this.timeBasedTestMeasurementInterval = timeBasedTestMeasurementInterval;
	}

	/**
	 * Set the measurement interval duration in seconds for objects in {{object|IncrementalResult}} for a time based FTP/HTTP download test (when {{param|TimeBasedTestDuration}} > 0).  The default value SHOULD be 0, which implies {{object|IncrementalResult}} collection is disabled.

          For example if {{param|TimeBasedTestDuration}} is 90 seconds and {{param}} is 10 seconds, there will be 9 results in {{object|IncrementalResult}}, each with a 10 seconds duration.
	 *
	 * @since 2.9
	 * @param timeBasedTestMeasurementInterval the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTimeBasedTestMeasurementInterval(Long timeBasedTestMeasurementInterval) {
		this.timeBasedTestMeasurementInterval = timeBasedTestMeasurementInterval;
		return this;
	}

	/**
	 * Get the this {{param}} works in conjunction with {{param|TimeBasedTestMeasurementInterval}} to allow the interval measurement to start a number of seconds after {{param|BOMTime}}. The test measurement interval in {{object|IncrementalResult}} starts at time {{param|BOMTime}} + {{param}} to allow for slow start window removal of file transfers.

          This {{param}} is in seconds.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTimeBasedTestMeasurementOffset() {
		return timeBasedTestMeasurementOffset;
	}

	/**
	 * Set the this {{param}} works in conjunction with {{param|TimeBasedTestMeasurementInterval}} to allow the interval measurement to start a number of seconds after {{param|BOMTime}}. The test measurement interval in {{object|IncrementalResult}} starts at time {{param|BOMTime}} + {{param}} to allow for slow start window removal of file transfers.

          This {{param}} is in seconds.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 * @param timeBasedTestMeasurementOffset the input value
	 */
	public void  setTimeBasedTestMeasurementOffset(Long timeBasedTestMeasurementOffset) {
		this.timeBasedTestMeasurementOffset = timeBasedTestMeasurementOffset;
	}

	/**
	 * Set the this {{param}} works in conjunction with {{param|TimeBasedTestMeasurementInterval}} to allow the interval measurement to start a number of seconds after {{param|BOMTime}}. The test measurement interval in {{object|IncrementalResult}} starts at time {{param|BOMTime}} + {{param}} to allow for slow start window removal of file transfers.

          This {{param}} is in seconds.  The default value SHOULD be 0.
	 *
	 * @since 2.9
	 * @param timeBasedTestMeasurementOffset the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTimeBasedTestMeasurementOffset(Long timeBasedTestMeasurementOffset) {
		this.timeBasedTestMeasurementOffset = timeBasedTestMeasurementOffset;
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
	public DownloadDiagnostics withProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		return this;
	}

	/**
	 * Get the number of connections to be used in the test.  The default value SHOULD be 1.  {{param}} MUST NOT be set to a value greater than {{param|DownloadDiagnosticMaxConnections}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getNumberOfConnections() {
		return numberOfConnections;
	}

	/**
	 * Set the number of connections to be used in the test.  The default value SHOULD be 1.  {{param}} MUST NOT be set to a value greater than {{param|DownloadDiagnosticMaxConnections}}.
	 *
	 * @since 2.9
	 * @param numberOfConnections the input value
	 */
	public void  setNumberOfConnections(Long numberOfConnections) {
		this.numberOfConnections = numberOfConnections;
	}

	/**
	 * Set the number of connections to be used in the test.  The default value SHOULD be 1.  {{param}} MUST NOT be set to a value greater than {{param|DownloadDiagnosticMaxConnections}}.
	 *
	 * @since 2.9
	 * @param numberOfConnections the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withNumberOfConnections(Long numberOfConnections) {
		this.numberOfConnections = numberOfConnections;
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
	public DownloadDiagnostics withIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
		return this;
	}

	/**
	 * Get the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the client sends the GET command.

          * For FTP this is the time at which the client sends the RTRV command.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getRomTime() {
		return romTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the client sends the GET command.

          * For FTP this is the time at which the client sends the RTRV command.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param romTime the input value
	 */
	public void  setRomTime(LocalDateTime romTime) {
		this.romTime = romTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the client sends the GET command.

          * For FTP this is the time at which the client sends the RTRV command.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param romTime the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withRomTime(LocalDateTime romTime) {
		this.romTime = romTime;
		return this;
	}

	/**
	 * Get the begin of transmission time in UTC, which MUST be specified to microsecond precision

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the first data packet is received.

          * For FTP this is the time at which the client receives the first data packet on the data connection.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getBomTime() {
		return bomTime;
	}

	/**
	 * Set the begin of transmission time in UTC, which MUST be specified to microsecond precision

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the first data packet is received.

          * For FTP this is the time at which the client receives the first data packet on the data connection.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param bomTime the input value
	 */
	public void  setBomTime(LocalDateTime bomTime) {
		this.bomTime = bomTime;
	}

	/**
	 * Set the begin of transmission time in UTC, which MUST be specified to microsecond precision

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the first data packet is received.

          * For FTP this is the time at which the client receives the first data packet on the data connection.

          If multiple connections are used, then {{param}} is set to the earliest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param bomTime the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withBomTime(LocalDateTime bomTime) {
		this.bomTime = bomTime;
		return this;
	}

	/**
	 * Get the end of transmission in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the last data packet is received.

          * For FTP this is the time at which the client receives the last packet on the data connection.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getEomTime() {
		return eomTime;
	}

	/**
	 * Set the end of transmission in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the last data packet is received.

          * For FTP this is the time at which the client receives the last packet on the data connection.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param eomTime the input value
	 */
	public void  setEomTime(LocalDateTime eomTime) {
		this.eomTime = eomTime;
	}

	/**
	 * Set the end of transmission in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the last data packet is received.

          * For FTP this is the time at which the client receives the last packet on the data connection.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param eomTime the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withEomTime(LocalDateTime eomTime) {
		this.eomTime = eomTime;
		return this;
	}

	/**
	 * Get the number of bytes received during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}} across all connections.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTestBytesReceived() {
		return testBytesReceived;
	}

	/**
	 * Set the number of bytes received during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}} across all connections.
	 *
	 * @since 2.0
	 * @param testBytesReceived the input value
	 */
	public void  setTestBytesReceived(Long testBytesReceived) {
		this.testBytesReceived = testBytesReceived;
	}

	/**
	 * Set the number of bytes received during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}} across all connections.
	 *
	 * @since 2.0
	 * @param testBytesReceived the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTestBytesReceived(Long testBytesReceived) {
		this.testBytesReceived = testBytesReceived;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.0
	 * @param totalBytesReceived the input value
	 */
	public void  setTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.0
	 * @param totalBytesReceived the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSent the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
		return this;
	}

	/**
	 * Get the number of bytes of the test file received between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} across all connections.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestBytesReceivedUnderFullLoading() {
		return testBytesReceivedUnderFullLoading;
	}

	/**
	 * Set the number of bytes of the test file received between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} across all connections.
	 *
	 * @since 2.9
	 * @param testBytesReceivedUnderFullLoading the input value
	 */
	public void  setTestBytesReceivedUnderFullLoading(Long testBytesReceivedUnderFullLoading) {
		this.testBytesReceivedUnderFullLoading = testBytesReceivedUnderFullLoading;
	}

	/**
	 * Set the number of bytes of the test file received between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} across all connections.
	 *
	 * @since 2.9
	 * @param testBytesReceivedUnderFullLoading the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTestBytesReceivedUnderFullLoading(Long testBytesReceivedUnderFullLoading) {
		this.testBytesReceivedUnderFullLoading = testBytesReceivedUnderFullLoading;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) received in between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTotalBytesReceivedUnderFullLoading() {
		return totalBytesReceivedUnderFullLoading;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received in between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesReceivedUnderFullLoading the input value
	 */
	public void  setTotalBytesReceivedUnderFullLoading(Long totalBytesReceivedUnderFullLoading) {
		this.totalBytesReceivedUnderFullLoading = totalBytesReceivedUnderFullLoading;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received in between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesReceivedUnderFullLoading the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTotalBytesReceivedUnderFullLoading(Long totalBytesReceivedUnderFullLoading) {
		this.totalBytesReceivedUnderFullLoading = totalBytesReceivedUnderFullLoading;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) sent between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTotalBytesSentUnderFullLoading() {
		return totalBytesSentUnderFullLoading;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSentUnderFullLoading the input value
	 */
	public void  setTotalBytesSentUnderFullLoading(Long totalBytesSentUnderFullLoading) {
		this.totalBytesSentUnderFullLoading = totalBytesSentUnderFullLoading;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|Interface}} object at the latest {{param|PerConnectionResult.{i}.BOMTime}} and at the earliest {{param|PerConnectionResult.{i}.EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSentUnderFullLoading the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTotalBytesSentUnderFullLoading(Long totalBytesSentUnderFullLoading) {
		this.totalBytesSentUnderFullLoading = totalBytesSentUnderFullLoading;
		return this;
	}

	/**
	 * Get the period of time in microseconds between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} of the test.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getPeriodOfFullLoading() {
		return periodOfFullLoading;
	}

	/**
	 * Set the period of time in microseconds between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} of the test.
	 *
	 * @since 2.9
	 * @param periodOfFullLoading the input value
	 */
	public void  setPeriodOfFullLoading(Long periodOfFullLoading) {
		this.periodOfFullLoading = periodOfFullLoading;
	}

	/**
	 * Set the period of time in microseconds between the latest {{param|PerConnectionResult.{i}.BOMTime}} and the earliest {{param|PerConnectionResult.{i}.EOMTime}} of the test.
	 *
	 * @since 2.9
	 * @param periodOfFullLoading the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withPeriodOfFullLoading(Long periodOfFullLoading) {
		this.periodOfFullLoading = periodOfFullLoading;
		return this;
	}

	/**
	 * Get the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

          * For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getTcpOpenRequestTime() {
		return tcpOpenRequestTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

          * For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param tcpOpenRequestTime the input value
	 */
	public void  setTcpOpenRequestTime(LocalDateTime tcpOpenRequestTime) {
		this.tcpOpenRequestTime = tcpOpenRequestTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

          * For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param tcpOpenRequestTime the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTcpOpenRequestTime(LocalDateTime tcpOpenRequestTime) {
		this.tcpOpenRequestTime = tcpOpenRequestTime;
		return this;
	}

	/**
	 * Get the response time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP ACK to the socket opening the HTTP connection was received.

          * For FTP this is the time at which the TCP ACK to the socket opening the data connection was received.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getTcpOpenResponseTime() {
		return tcpOpenResponseTime;
	}

	/**
	 * Set the response time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP ACK to the socket opening the HTTP connection was received.

          * For FTP this is the time at which the TCP ACK to the socket opening the data connection was received.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param tcpOpenResponseTime the input value
	 */
	public void  setTcpOpenResponseTime(LocalDateTime tcpOpenResponseTime) {
		this.tcpOpenResponseTime = tcpOpenResponseTime;
	}

	/**
	 * Set the response time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP ACK to the socket opening the HTTP connection was received.

          * For FTP this is the time at which the TCP ACK to the socket opening the data connection was received.

          Note: Interval of 1 microsecond SHOULD be supported.

          If multiple connections are used, then {{param}} is set to the latest {{param}} across all connections.
	 *
	 * @since 2.0
	 * @param tcpOpenResponseTime the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withTcpOpenResponseTime(LocalDateTime tcpOpenResponseTime) {
		this.tcpOpenResponseTime = tcpOpenResponseTime;
		return this;
	}

	/**
	 * Get the results must be returned in the {{object|PerConnectionResult}} table for every connection when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isEnablePerConnectionResults() {
		return enablePerConnectionResults;
	}

	/**
	 * Set the results must be returned in the {{object|PerConnectionResult}} table for every connection when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 * @param enablePerConnectionResults the input value
	 */
	public void  setEnablePerConnectionResults(Boolean enablePerConnectionResults) {
		this.enablePerConnectionResults = enablePerConnectionResults;
	}

	/**
	 * Set the results must be returned in the {{object|PerConnectionResult}} table for every connection when set to {{true}}. The default value SHOULD be {{false}}.
	 *
	 * @since 2.9
	 * @param enablePerConnectionResults the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withEnablePerConnectionResults(Boolean enablePerConnectionResults) {
		this.enablePerConnectionResults = enablePerConnectionResults;
		return this;
	}

	/**
	 * Get the results for individual connections.  This table is only populated when {{param|#.EnablePerConnectionResults}} is {{true}}.  A new object is created for each connection specified in {{param|#.NumberOfConnections}}.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @return the value
	 */
	public Collection<PerConnectionResult> getPerConnectionResults() {
		if (this.perConnectionResults == null){ this.perConnectionResults=new ArrayList<>();}
		return perConnectionResults;
	}

	/**
	 * Set the results for individual connections.  This table is only populated when {{param|#.EnablePerConnectionResults}} is {{true}}.  A new object is created for each connection specified in {{param|#.NumberOfConnections}}.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @param perConnectionResults the input value
	 */
	public void  setPerConnectionResults(Collection<PerConnectionResult> perConnectionResults) {
		this.perConnectionResults = perConnectionResults;
	}

	/**
	 * Set the results for individual connections.  This table is only populated when {{param|#.EnablePerConnectionResults}} is {{true}}.  A new object is created for each connection specified in {{param|#.NumberOfConnections}}.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @param perConnectionResult the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withPerConnectionResult(PerConnectionResult perConnectionResult) {
		getPerConnectionResults().add(perConnectionResult);
		return this;
	}

	/**
	 * Get the results for time segmented tests (tests where {{param|#.TimeBasedTestDuration}} > 0 and {{param|#.TimeBasedTestMeasurementInterval}} > 0).  This data is totaled across all connections in the test.  A new object is created every {{param|#.TimeBasedTestMeasurementInterval}} after that interval has completed.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @return the value
	 */
	public Collection<IncrementalResult> getIncrementalResults() {
		if (this.incrementalResults == null){ this.incrementalResults=new ArrayList<>();}
		return incrementalResults;
	}

	/**
	 * Set the results for time segmented tests (tests where {{param|#.TimeBasedTestDuration}} > 0 and {{param|#.TimeBasedTestMeasurementInterval}} > 0).  This data is totaled across all connections in the test.  A new object is created every {{param|#.TimeBasedTestMeasurementInterval}} after that interval has completed.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @param incrementalResults the input value
	 */
	public void  setIncrementalResults(Collection<IncrementalResult> incrementalResults) {
		this.incrementalResults = incrementalResults;
	}

	/**
	 * Set the results for time segmented tests (tests where {{param|#.TimeBasedTestDuration}} > 0 and {{param|#.TimeBasedTestMeasurementInterval}} > 0).  This data is totaled across all connections in the test.  A new object is created every {{param|#.TimeBasedTestMeasurementInterval}} after that interval has completed.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @param incrementalResult the input value
	 * @return this instance
	 */
	public DownloadDiagnostics withIncrementalResult(IncrementalResult incrementalResult) {
		getIncrementalResults().add(incrementalResult);
		return this;
	}

	//</editor-fold>

}