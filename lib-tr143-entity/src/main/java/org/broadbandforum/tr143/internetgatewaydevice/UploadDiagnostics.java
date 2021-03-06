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

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object defines the diagnostics configuration for a HTTP or FTP UploadDiagnostics test. 

Files sent by the UploadDiagnostics do not require file storage on the CPE device, and MAY be an arbitrary stream of bytes.
	 *
	 * @since TR143 v1.3
	 */
@CWMPObject(name = "InternetGatewayDevice.UploadDiagnostics.")
@XmlRootElement(name = "InternetGatewayDevice.UploadDiagnostics")
@XmlType(name = "InternetGatewayDevice.UploadDiagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class UploadDiagnostics {

	/**
	 * Indicate the availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String diagnosticsState;
	/**
	 * {{reference|the IP-layer interface over which the test is to be performed}}

The value of this parameter MUST be either a valid interface or an empty string.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the default routing interface.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * The URL, as defined in {{bibref|RFC3986}}, for the CPE to Upload to. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

* When using FTP transport, FTP binary transfer MUST be used.

* When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

* When using HTTP transport the HTTP Authentication MUST NOT be used.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "UploadURL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String uploadURL;
	/**
	 * DiffServ code point for marking packets transmitted in the test. 

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * Ethernet priority code for marking packets transmitted in the test (if applicable).

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "EthernetPriority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long ethernetPriority;
	/**
	 * The size of the file (in bytes) to be uploaded to the server.

The CPE MUST insure the appropriate number of bytes are sent.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "TestFileLength")
	@CWMPParameter(access = "readWrite")
	public Long testFileLength;
	/**
	 * Request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the client sends the PUT command

* For FTP this is the time at which the STOR command is sent.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "ROMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime romTime;
	/**
	 * Begin of transmission time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the first data packet is sent.

* For FTP this is the time at which the client receives the ready for transfer notification.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "BOMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime bomTime;
	/**
	 * End of transmission in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time when the HTTP successful response code is received.

* For FTP this is the time when the client receives a transfer complete.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "EOMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime eomTime;
	/**
	 * The total number of bytes sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "TotalBytesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalBytesSent;
	/**
	 * Request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

* For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "TCPOpenRequestTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime tcpOpenRequestTime;
	/**
	 * Response time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the Time at which the TCP ACK to the socket opening the HTTP connection was received.

* For FTP this is  the Time at which the TCP ACK to the socket opening the Data connection was received.

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 */
	@XmlElement(name = "TCPOpenResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime tcpOpenResponseTime;

	public UploadDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicate the availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Completed}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Completed}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.3
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

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.3
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

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.3
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public UploadDiagnostics withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference|the IP-layer interface over which the test is to be performed}}

The value of this parameter MUST be either a valid interface or an empty string.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the default routing interface.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference|the IP-layer interface over which the test is to be performed}}

The value of this parameter MUST be either a valid interface or an empty string.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the default routing interface.
	 *
	 * @since 1.3
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference|the IP-layer interface over which the test is to be performed}}

The value of this parameter MUST be either a valid interface or an empty string.  An attempt to set this parameter to a different value MUST be rejected as an invalid parameter value.

If {{empty}} is specified, the CPE MUST use the default routing interface.
	 *
	 * @since 1.3
	 * @param _interface the input value
	 * @return this instance
	 */
	public UploadDiagnostics with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the URL, as defined in {{bibref|RFC3986}}, for the CPE to Upload to. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

* When using FTP transport, FTP binary transfer MUST be used.

* When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

* When using HTTP transport the HTTP Authentication MUST NOT be used.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public String getUploadURL() {
		return uploadURL;
	}

	/**
	 * Set the URL, as defined in {{bibref|RFC3986}}, for the CPE to Upload to. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

* When using FTP transport, FTP binary transfer MUST be used.

* When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

* When using HTTP transport the HTTP Authentication MUST NOT be used.
	 *
	 * @since 1.3
	 * @param uploadURL the input value
	 */
	public void  setUploadURL(String uploadURL) {
		this.uploadURL = uploadURL;
	}

	/**
	 * Set the URL, as defined in {{bibref|RFC3986}}, for the CPE to Upload to. This parameter MUST be in the form of a valid HTTP {{bibref|RFC2616}} or FTP {{bibref|RFC959}} URL.

* When using FTP transport, FTP binary transfer MUST be used.

* When using HTTP transport, persistent connections MUST be used and pipelining MUST NOT be used.

* When using HTTP transport the HTTP Authentication MUST NOT be used.
	 *
	 * @since 1.3
	 * @param uploadURL the input value
	 * @return this instance
	 */
	public UploadDiagnostics withUploadURL(String uploadURL) {
		this.uploadURL = uploadURL;
		return this;
	}

	/**
	 * Get the diffServ code point for marking packets transmitted in the test. 

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ code point for marking packets transmitted in the test. 

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ code point for marking packets transmitted in the test. 

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 * @param dscP the input value
	 * @return this instance
	 */
	public UploadDiagnostics withDscP(Long dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the ethernet priority code for marking packets transmitted in the test (if applicable).

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getEthernetPriority() {
		return ethernetPriority;
	}

	/**
	 * Set the ethernet priority code for marking packets transmitted in the test (if applicable).

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 * @param ethernetPriority the input value
	 */
	public void  setEthernetPriority(Long ethernetPriority) {
		this.ethernetPriority = ethernetPriority;
	}

	/**
	 * Set the ethernet priority code for marking packets transmitted in the test (if applicable).

The default value SHOULD be zero.
	 *
	 * @since 1.3
	 * @param ethernetPriority the input value
	 * @return this instance
	 */
	public UploadDiagnostics withEthernetPriority(Long ethernetPriority) {
		this.ethernetPriority = ethernetPriority;
		return this;
	}

	/**
	 * Get the size of the file (in bytes) to be uploaded to the server.

The CPE MUST insure the appropriate number of bytes are sent.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getTestFileLength() {
		return testFileLength;
	}

	/**
	 * Set the size of the file (in bytes) to be uploaded to the server.

The CPE MUST insure the appropriate number of bytes are sent.
	 *
	 * @since 1.3
	 * @param testFileLength the input value
	 */
	public void  setTestFileLength(Long testFileLength) {
		this.testFileLength = testFileLength;
	}

	/**
	 * Set the size of the file (in bytes) to be uploaded to the server.

The CPE MUST insure the appropriate number of bytes are sent.
	 *
	 * @since 1.3
	 * @param testFileLength the input value
	 * @return this instance
	 */
	public UploadDiagnostics withTestFileLength(Long testFileLength) {
		this.testFileLength = testFileLength;
		return this;
	}

	/**
	 * Get the request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the client sends the PUT command

* For FTP this is the time at which the STOR command is sent.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public LocalDateTime getRomTime() {
		return romTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the client sends the PUT command

* For FTP this is the time at which the STOR command is sent.
	 *
	 * @since 1.3
	 * @param romTime the input value
	 */
	public void  setRomTime(LocalDateTime romTime) {
		this.romTime = romTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the client sends the PUT command

* For FTP this is the time at which the STOR command is sent.
	 *
	 * @since 1.3
	 * @param romTime the input value
	 * @return this instance
	 */
	public UploadDiagnostics withRomTime(LocalDateTime romTime) {
		this.romTime = romTime;
		return this;
	}

	/**
	 * Get the begin of transmission time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the first data packet is sent.

* For FTP this is the time at which the client receives the ready for transfer notification.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public LocalDateTime getBomTime() {
		return bomTime;
	}

	/**
	 * Set the begin of transmission time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the first data packet is sent.

* For FTP this is the time at which the client receives the ready for transfer notification.
	 *
	 * @since 1.3
	 * @param bomTime the input value
	 */
	public void  setBomTime(LocalDateTime bomTime) {
		this.bomTime = bomTime;
	}

	/**
	 * Set the begin of transmission time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the first data packet is sent.

* For FTP this is the time at which the client receives the ready for transfer notification.
	 *
	 * @since 1.3
	 * @param bomTime the input value
	 * @return this instance
	 */
	public UploadDiagnostics withBomTime(LocalDateTime bomTime) {
		this.bomTime = bomTime;
		return this;
	}

	/**
	 * Get the end of transmission in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time when the HTTP successful response code is received.

* For FTP this is the time when the client receives a transfer complete.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public LocalDateTime getEomTime() {
		return eomTime;
	}

	/**
	 * Set the end of transmission in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time when the HTTP successful response code is received.

* For FTP this is the time when the client receives a transfer complete.
	 *
	 * @since 1.3
	 * @param eomTime the input value
	 */
	public void  setEomTime(LocalDateTime eomTime) {
		this.eomTime = eomTime;
	}

	/**
	 * Set the end of transmission in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time when the HTTP successful response code is received.

* For FTP this is the time when the client receives a transfer complete.
	 *
	 * @since 1.3
	 * @param eomTime the input value
	 * @return this instance
	 */
	public UploadDiagnostics withEomTime(LocalDateTime eomTime) {
		this.eomTime = eomTime;
		return this;
	}

	/**
	 * Get the total number of bytes sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the total number of bytes sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 1.3
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the total number of bytes sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 1.3
	 * @param totalBytesSent the input value
	 * @return this instance
	 */
	public UploadDiagnostics withTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
		return this;
	}

	/**
	 * Get the request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

* For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public LocalDateTime getTcpOpenRequestTime() {
		return tcpOpenRequestTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

* For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 * @param tcpOpenRequestTime the input value
	 */
	public void  setTcpOpenRequestTime(LocalDateTime tcpOpenRequestTime) {
		this.tcpOpenRequestTime = tcpOpenRequestTime;
	}

	/**
	 * Set the request time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

* For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 * @param tcpOpenRequestTime the input value
	 * @return this instance
	 */
	public UploadDiagnostics withTcpOpenRequestTime(LocalDateTime tcpOpenRequestTime) {
		this.tcpOpenRequestTime = tcpOpenRequestTime;
		return this;
	}

	/**
	 * Get the response time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the Time at which the TCP ACK to the socket opening the HTTP connection was received.

* For FTP this is  the Time at which the TCP ACK to the socket opening the Data connection was received.

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 * @return the value
	 */
	public LocalDateTime getTcpOpenResponseTime() {
		return tcpOpenResponseTime;
	}

	/**
	 * Set the response time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the Time at which the TCP ACK to the socket opening the HTTP connection was received.

* For FTP this is  the Time at which the TCP ACK to the socket opening the Data connection was received.

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 * @param tcpOpenResponseTime the input value
	 */
	public void  setTcpOpenResponseTime(LocalDateTime tcpOpenResponseTime) {
		this.tcpOpenResponseTime = tcpOpenResponseTime;
	}

	/**
	 * Set the response time in UTC, which MUST be specified to microsecond precision.

For example: 2008-04-09T15:01:05.123456

* For HTTP this is the Time at which the TCP ACK to the socket opening the HTTP connection was received.

* For FTP this is  the Time at which the TCP ACK to the socket opening the Data connection was received.

Note: Interval of 1 microsecond SHOULD be supported.
	 *
	 * @since 1.3
	 * @param tcpOpenResponseTime the input value
	 * @return this instance
	 */
	public UploadDiagnostics withTcpOpenResponseTime(LocalDateTime tcpOpenResponseTime) {
		this.tcpOpenResponseTime = tcpOpenResponseTime;
		return this;
	}

	//</editor-fold>

}