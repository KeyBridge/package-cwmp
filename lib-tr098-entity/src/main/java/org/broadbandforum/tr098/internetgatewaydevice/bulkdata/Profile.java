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
package org.broadbandforum.tr098.internetgatewaydevice.bulkdata;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.internetgatewaydevice.bulkdata.profile.Parameter;

	/**
	 * A set of Bulk Data Collection profiles.  

Each profile represents a bulk data report, including its own timing configuration, communications configuration, and set of parameters.  This allows the ACS to configure multiple reports to be generated at different times for different sets of data.
	 *
	 * @since 1.11
	 */
@CWMPObject(name = "InternetGatewayDevice.BulkData.Profile.{i}.")
public class Profile {

	/**
	 * Enables or disables this specific bulk data profile.

If {{false}}, this profile will not be collected or reported.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The IPDR Protocol being used for this collection profile.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	public String protocol;
	/**
	 * The IPDR Encoding Type being used for this collection profile.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "EncodingType")
	@CWMPParameter(access = "readWrite")
	public String encodingType;
	/**
	 * The reporting interval in seconds. Each report is generated based on this interval and {{param|TimeReference}}.

The CPE MAY reject a request to set {{param}} to less than {{param|#.MinReportingInterval}}.

Reporting intervals MUST begin every {{param}} seconds.

If {{param}} is changed while collection is enabled, the first reporting interval begins immediately.

For example, if {{param}} is 86400 (a day) and if {{param|TimeReference}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if the {{param|Protocol}} parameter is set to {{enum|Streaming|#.Protocols}}) its report at midnight every 24 hours.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "ReportingInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long reportingInterval = 86400L;
	/**
	 * An absolute time reference in UTC to determine when will be transmitted.  Each reporting interval MUST complete at this reference time plus or minus an integer multiple of {{param|ReportingInterval}}, unless unable to due to higher prioritized operations.

{{param}} is used only to set the "phase" of the reporting intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of bulk data is enabled, the first reporting interval begins immediately.

The Unknown Time value as defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified reporting intervals.

If absolute time is not available to the CPE, its reporting interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|ReportingInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if in a "ITPush" mode) its report at midnight every 24 hours.

Note that, if {{param}} is set to a time other than the Unknown Time, the first reporting interval (which has to begin immediately) will almost certainly be shorter than {{param|ReportingInterval}}).  This is why {{param}} is defined in terms of when reporting intervals complete rather than start.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "TimeReference")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime timeReference = LocalDateTime.parse("0001-01-01T00:00:00Z");;
	/**
	 * This is the host name or IP Address of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "StreamingHost")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String streamingHost;
	/**
	 * This is the port number of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "StreamingPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long streamingPort = 4737L;
	/**
	 * This is the unique identification of an IPDR Session to be used when this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).

An ACS MUST NOT configure multiple IPDR Streaming Protocol collection profiles with the same {{param}}.  Doing so MUST cause the CPE to fail the SetParameterValues.

Within the IPDR Streaming Protocol specification the Session ID has a type of a single 'char', but we are restricting the range even further (ASCII values of '0' - '9' and 'A' - 'Z'.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "StreamingSessionID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 65, max = 90)
	public Long streamingSessionID;
	/**
	 * This is the URL within the CPE that is used by an IPDR Collector to retrieve the IPDRDocs when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "FileTransferURL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String fileTransferURL;
	/**
	 * Username used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "FileTransferUsername")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String fileTransferUsername;
	/**
	 * Password used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "FileTransferPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String fileTransferPassword;
	/**
	 * If this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}) then the control file names will be of the following format:

: <ControlFilePrefix>_<ControlFilePolicy>.<ControlFileSuffix>

Where the following rules apply:

* ControlFilePrefix MUST NOT contain an underscore '_' or any other character not suitable for a file name.

* ControlFilePolicy MUST contain one or more 'N' characters, where the number of 'N' characters denotes the number of digits in the sequence number, including leading zeros as necessary to match the number of 'N' characters. 

* ControlFileSuffix is a file extension.  

For example, BulkData_NNNN.log where "BulkData" would be the prefix, "NNNN" would be the policy, and "log" would be the suffix.  Files adhering to this file format would look like: BulkData_0000.log, BulkData_0001.log, etc.
	 *
	 * @since 1.11
	 */
	@XmlElement(name = "ControlFileFormat")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String controlFileFormat;
	/**
	 * Bulk data parameter table.

Each entry in this table represents a parameter (or set of parameters if a partial path is provided) to be collected and reported.
	 */
	@XmlElementWrapper(name = "parameters")
	@XmlElement(name = "Parameter")
	@CWMPParameter(access = "readWrite")
	public Collection<Parameter> parameters;

	public Profile() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this specific bulk data profile.

If {{false}}, this profile will not be collected or reported.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this specific bulk data profile.

If {{false}}, this profile will not be collected or reported.
	 *
	 * @since 1.11
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this specific bulk data profile.

If {{false}}, this profile will not be collected or reported.
	 *
	 * @since 1.11
	 * @param enable the input value
	 * @return this instance
	 */
	public Profile withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.11
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.11
	 * @param alias the input value
	 * @return this instance
	 */
	public Profile withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the IPDR Protocol being used for this collection profile.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the IPDR Protocol being used for this collection profile.
	 *
	 * @since 1.11
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the IPDR Protocol being used for this collection profile.
	 *
	 * @since 1.11
	 * @param protocol the input value
	 * @return this instance
	 */
	public Profile withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the IPDR Encoding Type being used for this collection profile.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getEncodingType() {
		return encodingType;
	}

	/**
	 * Set the IPDR Encoding Type being used for this collection profile.
	 *
	 * @since 1.11
	 * @param encodingType the input value
	 */
	public void  setEncodingType(String encodingType) {
		this.encodingType = encodingType;
	}

	/**
	 * Set the IPDR Encoding Type being used for this collection profile.
	 *
	 * @since 1.11
	 * @param encodingType the input value
	 * @return this instance
	 */
	public Profile withEncodingType(String encodingType) {
		this.encodingType = encodingType;
		return this;
	}

	/**
	 * Get the reporting interval in seconds. Each report is generated based on this interval and {{param|TimeReference}}.

The CPE MAY reject a request to set {{param}} to less than {{param|#.MinReportingInterval}}.

Reporting intervals MUST begin every {{param}} seconds.

If {{param}} is changed while collection is enabled, the first reporting interval begins immediately.

For example, if {{param}} is 86400 (a day) and if {{param|TimeReference}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if the {{param|Protocol}} parameter is set to {{enum|Streaming|#.Protocols}}) its report at midnight every 24 hours.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Long getReportingInterval() {
		return reportingInterval;
	}

	/**
	 * Set the reporting interval in seconds. Each report is generated based on this interval and {{param|TimeReference}}.

The CPE MAY reject a request to set {{param}} to less than {{param|#.MinReportingInterval}}.

Reporting intervals MUST begin every {{param}} seconds.

If {{param}} is changed while collection is enabled, the first reporting interval begins immediately.

For example, if {{param}} is 86400 (a day) and if {{param|TimeReference}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if the {{param|Protocol}} parameter is set to {{enum|Streaming|#.Protocols}}) its report at midnight every 24 hours.
	 *
	 * @since 1.11
	 * @param reportingInterval the input value
	 */
	public void  setReportingInterval(Long reportingInterval) {
		this.reportingInterval = reportingInterval;
	}

	/**
	 * Set the reporting interval in seconds. Each report is generated based on this interval and {{param|TimeReference}}.

The CPE MAY reject a request to set {{param}} to less than {{param|#.MinReportingInterval}}.

Reporting intervals MUST begin every {{param}} seconds.

If {{param}} is changed while collection is enabled, the first reporting interval begins immediately.

For example, if {{param}} is 86400 (a day) and if {{param|TimeReference}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if the {{param|Protocol}} parameter is set to {{enum|Streaming|#.Protocols}}) its report at midnight every 24 hours.
	 *
	 * @since 1.11
	 * @param reportingInterval the input value
	 * @return this instance
	 */
	public Profile withReportingInterval(Long reportingInterval) {
		this.reportingInterval = reportingInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when will be transmitted.  Each reporting interval MUST complete at this reference time plus or minus an integer multiple of {{param|ReportingInterval}}, unless unable to due to higher prioritized operations.

{{param}} is used only to set the "phase" of the reporting intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of bulk data is enabled, the first reporting interval begins immediately.

The Unknown Time value as defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified reporting intervals.

If absolute time is not available to the CPE, its reporting interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|ReportingInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if in a "ITPush" mode) its report at midnight every 24 hours.

Note that, if {{param}} is set to a time other than the Unknown Time, the first reporting interval (which has to begin immediately) will almost certainly be shorter than {{param|ReportingInterval}}).  This is why {{param}} is defined in terms of when reporting intervals complete rather than start.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public LocalDateTime getTimeReference() {
		return timeReference;
	}

	/**
	 * Set an absolute time reference in UTC to determine when will be transmitted.  Each reporting interval MUST complete at this reference time plus or minus an integer multiple of {{param|ReportingInterval}}, unless unable to due to higher prioritized operations.

{{param}} is used only to set the "phase" of the reporting intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of bulk data is enabled, the first reporting interval begins immediately.

The Unknown Time value as defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified reporting intervals.

If absolute time is not available to the CPE, its reporting interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|ReportingInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if in a "ITPush" mode) its report at midnight every 24 hours.

Note that, if {{param}} is set to a time other than the Unknown Time, the first reporting interval (which has to begin immediately) will almost certainly be shorter than {{param|ReportingInterval}}).  This is why {{param}} is defined in terms of when reporting intervals complete rather than start.
	 *
	 * @since 1.11
	 * @param timeReference the input value
	 */
	public void  setTimeReference(LocalDateTime timeReference) {
		this.timeReference = timeReference;
	}

	/**
	 * Set an absolute time reference in UTC to determine when will be transmitted.  Each reporting interval MUST complete at this reference time plus or minus an integer multiple of {{param|ReportingInterval}}, unless unable to due to higher prioritized operations.

{{param}} is used only to set the "phase" of the reporting intervals.  The actual value of {{param}} can be arbitrarily far into the past or future.

If {{param}} is changed while collection of bulk data is enabled, the first reporting interval begins immediately.

The Unknown Time value as defined in {{bibref|TR-106a2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and is required only to adhere to the specified reporting intervals.

If absolute time is not available to the CPE, its reporting interval behavior MUST be the same as if the {{param}} parameter was set to the Unknown Time value.

For example, if {{param|ReportingInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then the CPE will generate (and transmit, if in a "ITPush" mode) its report at midnight every 24 hours.

Note that, if {{param}} is set to a time other than the Unknown Time, the first reporting interval (which has to begin immediately) will almost certainly be shorter than {{param|ReportingInterval}}).  This is why {{param}} is defined in terms of when reporting intervals complete rather than start.
	 *
	 * @since 1.11
	 * @param timeReference the input value
	 * @return this instance
	 */
	public Profile withTimeReference(LocalDateTime timeReference) {
		this.timeReference = timeReference;
		return this;
	}

	/**
	 * Get the this is the host name or IP Address of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getStreamingHost() {
		return streamingHost;
	}

	/**
	 * Set the this is the host name or IP Address of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param streamingHost the input value
	 */
	public void  setStreamingHost(String streamingHost) {
		this.streamingHost = streamingHost;
	}

	/**
	 * Set the this is the host name or IP Address of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param streamingHost the input value
	 * @return this instance
	 */
	public Profile withStreamingHost(String streamingHost) {
		this.streamingHost = streamingHost;
		return this;
	}

	/**
	 * Get the this is the port number of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Long getStreamingPort() {
		return streamingPort;
	}

	/**
	 * Set the this is the port number of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param streamingPort the input value
	 */
	public void  setStreamingPort(Long streamingPort) {
		this.streamingPort = streamingPort;
	}

	/**
	 * Set the this is the port number of the IPDR Collector to be used by the CPE to stream bulk data records if this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param streamingPort the input value
	 * @return this instance
	 */
	public Profile withStreamingPort(Long streamingPort) {
		this.streamingPort = streamingPort;
		return this;
	}

	/**
	 * Get the this is the unique identification of an IPDR Session to be used when this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).

An ACS MUST NOT configure multiple IPDR Streaming Protocol collection profiles with the same {{param}}.  Doing so MUST cause the CPE to fail the SetParameterValues.

Within the IPDR Streaming Protocol specification the Session ID has a type of a single 'char', but we are restricting the range even further (ASCII values of '0' - '9' and 'A' - 'Z'.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public Long getStreamingSessionID() {
		return streamingSessionID;
	}

	/**
	 * Set the this is the unique identification of an IPDR Session to be used when this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).

An ACS MUST NOT configure multiple IPDR Streaming Protocol collection profiles with the same {{param}}.  Doing so MUST cause the CPE to fail the SetParameterValues.

Within the IPDR Streaming Protocol specification the Session ID has a type of a single 'char', but we are restricting the range even further (ASCII values of '0' - '9' and 'A' - 'Z'.
	 *
	 * @since 1.11
	 * @param streamingSessionID the input value
	 */
	public void  setStreamingSessionID(Long streamingSessionID) {
		this.streamingSessionID = streamingSessionID;
	}

	/**
	 * Set the this is the unique identification of an IPDR Session to be used when this collection profile is configured for the IPDR Streaming Protocol {{bibref|IPDR-SP}} (the {{param|Protocol}} parameter has a value of {{enum|Streaming|#.Protocols}}).

An ACS MUST NOT configure multiple IPDR Streaming Protocol collection profiles with the same {{param}}.  Doing so MUST cause the CPE to fail the SetParameterValues.

Within the IPDR Streaming Protocol specification the Session ID has a type of a single 'char', but we are restricting the range even further (ASCII values of '0' - '9' and 'A' - 'Z'.
	 *
	 * @since 1.11
	 * @param streamingSessionID the input value
	 * @return this instance
	 */
	public Profile withStreamingSessionID(Long streamingSessionID) {
		this.streamingSessionID = streamingSessionID;
		return this;
	}

	/**
	 * Get the this is the URL within the CPE that is used by an IPDR Collector to retrieve the IPDRDocs when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getFileTransferURL() {
		return fileTransferURL;
	}

	/**
	 * Set the this is the URL within the CPE that is used by an IPDR Collector to retrieve the IPDRDocs when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param fileTransferURL the input value
	 */
	public void  setFileTransferURL(String fileTransferURL) {
		this.fileTransferURL = fileTransferURL;
	}

	/**
	 * Set the this is the URL within the CPE that is used by an IPDR Collector to retrieve the IPDRDocs when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param fileTransferURL the input value
	 * @return this instance
	 */
	public Profile withFileTransferURL(String fileTransferURL) {
		this.fileTransferURL = fileTransferURL;
		return this;
	}

	/**
	 * Get the username used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getFileTransferUsername() {
		return fileTransferUsername;
	}

	/**
	 * Set the username used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param fileTransferUsername the input value
	 */
	public void  setFileTransferUsername(String fileTransferUsername) {
		this.fileTransferUsername = fileTransferUsername;
	}

	/**
	 * Set the username used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param fileTransferUsername the input value
	 * @return this instance
	 */
	public Profile withFileTransferUsername(String fileTransferUsername) {
		this.fileTransferUsername = fileTransferUsername;
		return this;
	}

	/**
	 * Get the password used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getFileTransferPassword() {
		return fileTransferPassword;
	}

	/**
	 * Set the password used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param fileTransferPassword the input value
	 */
	public void  setFileTransferPassword(String fileTransferPassword) {
		this.fileTransferPassword = fileTransferPassword;
	}

	/**
	 * Set the password used for authentication of the {{param|FileTransferURL}}.

This is the {{param}} that the IPDR Collector uses to access the CPE when this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}).
	 *
	 * @since 1.11
	 * @param fileTransferPassword the input value
	 * @return this instance
	 */
	public Profile withFileTransferPassword(String fileTransferPassword) {
		this.fileTransferPassword = fileTransferPassword;
		return this;
	}

	/**
	 * Get the if this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}) then the control file names will be of the following format:

: <ControlFilePrefix>_<ControlFilePolicy>.<ControlFileSuffix>

Where the following rules apply:

* ControlFilePrefix MUST NOT contain an underscore '_' or any other character not suitable for a file name.

* ControlFilePolicy MUST contain one or more 'N' characters, where the number of 'N' characters denotes the number of digits in the sequence number, including leading zeros as necessary to match the number of 'N' characters. 

* ControlFileSuffix is a file extension.  

For example, BulkData_NNNN.log where "BulkData" would be the prefix, "NNNN" would be the policy, and "log" would be the suffix.  Files adhering to this file format would look like: BulkData_0000.log, BulkData_0001.log, etc.
	 *
	 * @since 1.11
	 * @return the value
	 */
	public String getControlFileFormat() {
		return controlFileFormat;
	}

	/**
	 * Set the if this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}) then the control file names will be of the following format:

: <ControlFilePrefix>_<ControlFilePolicy>.<ControlFileSuffix>

Where the following rules apply:

* ControlFilePrefix MUST NOT contain an underscore '_' or any other character not suitable for a file name.

* ControlFilePolicy MUST contain one or more 'N' characters, where the number of 'N' characters denotes the number of digits in the sequence number, including leading zeros as necessary to match the number of 'N' characters. 

* ControlFileSuffix is a file extension.  

For example, BulkData_NNNN.log where "BulkData" would be the prefix, "NNNN" would be the policy, and "log" would be the suffix.  Files adhering to this file format would look like: BulkData_0000.log, BulkData_0001.log, etc.
	 *
	 * @since 1.11
	 * @param controlFileFormat the input value
	 */
	public void  setControlFileFormat(String controlFileFormat) {
		this.controlFileFormat = controlFileFormat;
	}

	/**
	 * Set the if this collection profile is configured for the IPDR File Transfer Protocol {{bibref|IPDR-FTP}} (the {{param|Protocol}} parameter has a value of {{enum|File|#.Protocols}}) then the control file names will be of the following format:

: <ControlFilePrefix>_<ControlFilePolicy>.<ControlFileSuffix>

Where the following rules apply:

* ControlFilePrefix MUST NOT contain an underscore '_' or any other character not suitable for a file name.

* ControlFilePolicy MUST contain one or more 'N' characters, where the number of 'N' characters denotes the number of digits in the sequence number, including leading zeros as necessary to match the number of 'N' characters. 

* ControlFileSuffix is a file extension.  

For example, BulkData_NNNN.log where "BulkData" would be the prefix, "NNNN" would be the policy, and "log" would be the suffix.  Files adhering to this file format would look like: BulkData_0000.log, BulkData_0001.log, etc.
	 *
	 * @since 1.11
	 * @param controlFileFormat the input value
	 * @return this instance
	 */
	public Profile withControlFileFormat(String controlFileFormat) {
		this.controlFileFormat = controlFileFormat;
		return this;
	}

	/**
	 * Get the bulk data parameter table.

Each entry in this table represents a parameter (or set of parameters if a partial path is provided) to be collected and reported.
	 *
	 * @return the value
	 */
	public Collection<Parameter> getParameters() {
		if (this.parameters == null){ this.parameters=new ArrayList<>();}
		return parameters;
	}

	/**
	 * Set the bulk data parameter table.

Each entry in this table represents a parameter (or set of parameters if a partial path is provided) to be collected and reported.
	 *
	 * @param parameters the input value
	 */
	public void  setParameters(Collection<Parameter> parameters) {
		this.parameters = parameters;
	}

	/**
	 * Set the bulk data parameter table.

Each entry in this table represents a parameter (or set of parameters if a partial path is provided) to be collected and reported.
	 *
	 * @param parameter the input value
	 * @return this instance
	 */
	public Profile withParameter(Parameter parameter) {
		getParameters().add(parameter);
		return this;
	}

	//</editor-fold>

}