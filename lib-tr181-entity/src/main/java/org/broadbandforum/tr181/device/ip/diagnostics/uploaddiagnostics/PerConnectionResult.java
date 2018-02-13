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
package org.broadbandforum.tr181.device.ip.diagnostics.uploaddiagnostics;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Results for individual connections.  This table is only populated when {{param|#.EnablePerConnectionResults}} is {{true}}.  A new object is created for each connection specified in {{param|#.NumberOfConnections}}.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IP.Diagnostics.UploadDiagnostics.PerConnectionResult.{i}.")
@XmlRootElement(name = "Device.IP.Diagnostics.UploadDiagnostics.PerConnectionResult")
@XmlType(name = "Device.IP.Diagnostics.UploadDiagnostics.PerConnectionResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class PerConnectionResult {

	/**
	 * Request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the client sends the GET command.

          * For FTP this is the time at which the client sends the RTRV command.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ROMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime romTime;
	/**
	 * Begin of transmission time in UTC, which MUST be specified to microsecond precision

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the first data packet is received.

          * For FTP this is the time at which the client receives the first data packet on the data connection.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "BOMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime bomTime;
	/**
	 * End of transmission in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the last data packet is received.

          * For FTP this is the time at which the client receives the last packet on the data connection.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "EOMTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime eomTime;
	/**
	 * The number of bytes of the test file sent during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestBytesSent")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long testBytesSent;
	/**
	 * The total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TotalBytesReceived")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long totalBytesReceived;
	/**
	 * The total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TotalBytesSent")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long totalBytesSent;
	/**
	 * Request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

          * For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TCPOpenRequestTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime tcpOpenRequestTime;
	/**
	 * Response time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP ACK to the socket opening the HTTP connection was received.

          * For FTP this is the time at which the TCP ACK to the socket opening the data connection was received.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TCPOpenResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime tcpOpenResponseTime;

	public PerConnectionResult() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the client sends the GET command.

          * For FTP this is the time at which the client sends the RTRV command.
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
	 * @param romTime the input value
	 * @return this instance
	 */
	public PerConnectionResult withRomTime(LocalDateTime romTime) {
		this.romTime = romTime;
		return this;
	}

	/**
	 * Get the begin of transmission time in UTC, which MUST be specified to microsecond precision

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the first data packet is received.

          * For FTP this is the time at which the client receives the first data packet on the data connection.
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
	 * @param bomTime the input value
	 * @return this instance
	 */
	public PerConnectionResult withBomTime(LocalDateTime bomTime) {
		this.bomTime = bomTime;
		return this;
	}

	/**
	 * Get the end of transmission in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the last data packet is received.

          * For FTP this is the time at which the client receives the last packet on the data connection.
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
	 * @param eomTime the input value
	 * @return this instance
	 */
	public PerConnectionResult withEomTime(LocalDateTime eomTime) {
		this.eomTime = eomTime;
		return this;
	}

	/**
	 * Get the number of bytes of the test file sent during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestBytesSent() {
		return testBytesSent;
	}

	/**
	 * Set the number of bytes of the test file sent during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 2.9
	 * @param testBytesSent the input value
	 */
	public void  setTestBytesSent(Long testBytesSent) {
		this.testBytesSent = testBytesSent;
	}

	/**
	 * Set the number of bytes of the test file sent during the FTP/HTTP transaction including FTP/HTTP headers, between {{param|BOMTime}} and {{param|EOMTime}}.
	 *
	 * @since 2.9
	 * @param testBytesSent the input value
	 * @return this instance
	 */
	public PerConnectionResult withTestBytesSent(Long testBytesSent) {
		this.testBytesSent = testBytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesReceived the input value
	 */
	public void  setTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesReceived the input value
	 * @return this instance
	 */
	public PerConnectionResult withTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent on the Interface between {{param|BOMTime}} and {{param|EOMTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|BOMTime}} and at {{param|EOMTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSent the input value
	 * @return this instance
	 */
	public PerConnectionResult withTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
		return this;
	}

	/**
	 * Get the request time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP socket open (SYN) was sent for the HTTP connection.

          * For FTP this is the time at which the TCP socket open (SYN) was sent for the data connection.
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
	 * @param tcpOpenRequestTime the input value
	 * @return this instance
	 */
	public PerConnectionResult withTcpOpenRequestTime(LocalDateTime tcpOpenRequestTime) {
		this.tcpOpenRequestTime = tcpOpenRequestTime;
		return this;
	}

	/**
	 * Get the response time in UTC, which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z

          * For HTTP this is the time at which the TCP ACK to the socket opening the HTTP connection was received.

          * For FTP this is the time at which the TCP ACK to the socket opening the data connection was received.
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
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
	 *
	 * @since 2.9
	 * @param tcpOpenResponseTime the input value
	 * @return this instance
	 */
	public PerConnectionResult withTcpOpenResponseTime(LocalDateTime tcpOpenResponseTime) {
		this.tcpOpenResponseTime = tcpOpenResponseTime;
		return this;
	}

	//</editor-fold>

}