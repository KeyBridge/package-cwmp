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
package org.broadbandforum.tr181.device.ip.diagnostics.downloaddiagnostics;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Results for time segmented tests (tests where {{param|#.TimeBasedTestDuration}} > 0 and {{param|#.TimeBasedTestMeasurementInterval}} > 0).  This data is totaled across all connections in the test.  A new object is created every {{param|#.TimeBasedTestMeasurementInterval}} after that interval has completed.  Instance numbers MUST start at 1 and sequentially increment as new instances are created.  All instances are removed when {{param|#.DiagnosticsState}} is set to {{enum|Requested|#.DiagnosticsState}} or {{enum|None|#.DiagnosticsState}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IP.Diagnostics.DownloadDiagnostics.IncrementalResult.{i}.")
public class IncrementalResult {

	/**
	 * Change in the value of {{param|#.TestBytesReceivedUnderFullLoading}} between {{param|StartTime}} and {{param|EndTime}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TestBytesReceived")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long testBytesReceived;
	/**
	 * The total number of bytes (at the IP layer) received on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TotalBytesReceived")
	public Long totalBytesReceived;
	/**
	 * The total number of bytes (at the IP layer) sent on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "TotalBytesSent")
	public Long totalBytesSent;
	/**
	 * The start time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "StartTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime startTime;
	/**
	 * The end time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "EndTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime endTime;

	public IncrementalResult() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the change in the value of {{param|#.TestBytesReceivedUnderFullLoading}} between {{param|StartTime}} and {{param|EndTime}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTestBytesReceived() {
		return testBytesReceived;
	}

	/**
	 * Set the change in the value of {{param|#.TestBytesReceivedUnderFullLoading}} between {{param|StartTime}} and {{param|EndTime}}.
	 *
	 * @since 2.9
	 * @param testBytesReceived the input value
	 */
	public void  setTestBytesReceived(Long testBytesReceived) {
		this.testBytesReceived = testBytesReceived;
	}

	/**
	 * Set the change in the value of {{param|#.TestBytesReceivedUnderFullLoading}} between {{param|StartTime}} and {{param|EndTime}}.
	 *
	 * @since 2.9
	 * @param testBytesReceived the input value
	 * @return this instance
	 */
	public IncrementalResult withTestBytesReceived(Long testBytesReceived) {
		this.testBytesReceived = testBytesReceived;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) received on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesReceived the input value
	 */
	public void  setTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
	}

	/**
	 * Set the total number of bytes (at the IP layer) received on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesReceived on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesReceived the input value
	 * @return this instance
	 */
	public IncrementalResult withTotalBytesReceived(Long totalBytesReceived) {
		this.totalBytesReceived = totalBytesReceived;
		return this;
	}

	/**
	 * Get the total number of bytes (at the IP layer) sent on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSent the input value
	 */
	public void  setTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
	}

	/**
	 * Set the total number of bytes (at the IP layer) sent on the Interface between {{param|StartTime}} and {{param|EndTime}}.  This MAY be calculated by sampling Stats.bytesSent on the {{param|#.Interface}} object at {{param|StartTime}} and at {{param|EndTime}} and subtracting.
	 *
	 * @since 2.9
	 * @param totalBytesSent the input value
	 * @return this instance
	 */
	public IncrementalResult withTotalBytesSent(Long totalBytesSent) {
		this.totalBytesSent = totalBytesSent;
		return this;
	}

	/**
	 * Get the start time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @return the value
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}

	/**
	 * Set the start time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @param startTime the input value
	 */
	public void  setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * Set the start time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @param startTime the input value
	 * @return this instance
	 */
	public IncrementalResult withStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Get the end time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @return the value
	 */
	public LocalDateTime getEndTime() {
		return endTime;
	}

	/**
	 * Set the end time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @param endTime the input value
	 */
	public void  setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	/**
	 * Set the end time of this interval which MUST be specified to microsecond precision.

          For example: 2008-04-09T15:01:05.123456Z
	 *
	 * @since 2.9
	 * @param endTime the input value
	 * @return this instance
	 */
	public IncrementalResult withEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
		return this;
	}

	//</editor-fold>

}