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
package org.broadbandforum.tr181.device.dns.diagnostics;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.dns.diagnostics.nslookupdiagnostics.Result;

	/**
	 * This object defines access to an IP-layer NS Lookup test for the specified IP interface.

        When initiated, the NS Lookup test will contact {{param|DNSServer}} and look up {{param|HostName}} {{param|NumberOfRepetitions}} times.

        There will be a {{object|Result}} instance for each time the device performs a DNS lookup, which is determined by the value of {{param|NumberOfRepetitions}}.

        Any previous {{object|Result}} instances are removed when a new test is initiated.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DNS.Diagnostics.NSLookupDiagnostics.")
public class NSLookupDiagnostics {

	/**
	 * Indicates availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

          If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code "8 DIAGNOSTICS COMPLETE" in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String diagnosticsState;
	/**
	 * {{reference}} This parameter specifies the IP-layer interface over which the test is to be performed (i.e. the source IP address to use when performing the test). 

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Specifies the Host Name that NS Lookup is to look for. The current domain name MUST be used unless the name is a fully qualified name.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HostName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String hostName;
	/**
	 * Specifies the DNS Server name or IP address that NS Lookup is to use for the lookup. The name of this server will be resolved using the default DNS server unless an IP address is provided.

          If {{empty}} is specified, the device's default DNS server will be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DNSServer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String dnsServer;
	/**
	 * Timeout in milliseconds that indicates that a request has failed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long timeout;
	/**
	 * The number of times the device SHOULD repeat the execution of the NSLookup using the same input parameters.  If the diagnostics test fails the CPE MAY terminate the test without completing the full number of repetitions. 

          Each repetition will use a Result instance to hold the NSLookup result data.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberOfRepetitions")
	@CWMPParameter(access = "readWrite")
	public Long numberOfRepetitions;
	/**
	 * Number of successfully executed repetitions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SuccessCount")
	@CWMPParameter(activeNotify = "canDeny")
	public Long successCount;
	/**
	 * Results from the most recent invocation of the test, one instance per repetition.
	 */
	@XmlElementWrapper(name = "Results")
	@XmlElement(name = "Result")
	public Collection<Result> results;

	public NSLookupDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

          If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code "8 DIAGNOSTICS COMPLETE" in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

          If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code "8 DIAGNOSTICS COMPLETE" in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data. {{enum}}

          If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the DiagnosticsState to {{enum|Requested}}.

          When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

          When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the Error values listed above.

          If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

          When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code "8 DIAGNOSTICS COMPLETE" in the Inform message.

          After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

          Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

          While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

          While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 2.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference}} This parameter specifies the IP-layer interface over which the test is to be performed (i.e. the source IP address to use when performing the test). 

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} This parameter specifies the IP-layer interface over which the test is to be performed (i.e. the source IP address to use when performing the test). 

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} This parameter specifies the IP-layer interface over which the test is to be performed (i.e. the source IP address to use when performing the test). 

          If {{empty}} is specified, the CPE MUST use its routing policy (Forwarding table entries), if necessary, to determine the appropriate interface.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the specifies the Host Name that NS Lookup is to look for. The current domain name MUST be used unless the name is a fully qualified name.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Set the specifies the Host Name that NS Lookup is to look for. The current domain name MUST be used unless the name is a fully qualified name.
	 *
	 * @since 2.0
	 * @param hostName the input value
	 */
	public void  setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Set the specifies the Host Name that NS Lookup is to look for. The current domain name MUST be used unless the name is a fully qualified name.
	 *
	 * @since 2.0
	 * @param hostName the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics withHostName(String hostName) {
		this.hostName = hostName;
		return this;
	}

	/**
	 * Get the specifies the DNS Server name or IP address that NS Lookup is to use for the lookup. The name of this server will be resolved using the default DNS server unless an IP address is provided.

          If {{empty}} is specified, the device's default DNS server will be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDnsServer() {
		return dnsServer;
	}

	/**
	 * Set the specifies the DNS Server name or IP address that NS Lookup is to use for the lookup. The name of this server will be resolved using the default DNS server unless an IP address is provided.

          If {{empty}} is specified, the device's default DNS server will be used.
	 *
	 * @since 2.0
	 * @param dnsServer the input value
	 */
	public void  setDnsServer(String dnsServer) {
		this.dnsServer = dnsServer;
	}

	/**
	 * Set the specifies the DNS Server name or IP address that NS Lookup is to use for the lookup. The name of this server will be resolved using the default DNS server unless an IP address is provided.

          If {{empty}} is specified, the device's default DNS server will be used.
	 *
	 * @since 2.0
	 * @param dnsServer the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics withDnsServer(String dnsServer) {
		this.dnsServer = dnsServer;
		return this;
	}

	/**
	 * Get the timeout in milliseconds that indicates that a request has failed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds that indicates that a request has failed.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds that indicates that a request has failed.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the number of times the device SHOULD repeat the execution of the NSLookup using the same input parameters.  If the diagnostics test fails the CPE MAY terminate the test without completing the full number of repetitions. 

          Each repetition will use a Result instance to hold the NSLookup result data.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * Set the number of times the device SHOULD repeat the execution of the NSLookup using the same input parameters.  If the diagnostics test fails the CPE MAY terminate the test without completing the full number of repetitions. 

          Each repetition will use a Result instance to hold the NSLookup result data.
	 *
	 * @since 2.0
	 * @param numberOfRepetitions the input value
	 */
	public void  setNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
	}

	/**
	 * Set the number of times the device SHOULD repeat the execution of the NSLookup using the same input parameters.  If the diagnostics test fails the CPE MAY terminate the test without completing the full number of repetitions. 

          Each repetition will use a Result instance to hold the NSLookup result data.
	 *
	 * @since 2.0
	 * @param numberOfRepetitions the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics withNumberOfRepetitions(Long numberOfRepetitions) {
		this.numberOfRepetitions = numberOfRepetitions;
		return this;
	}

	/**
	 * Get the number of successfully executed repetitions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSuccessCount() {
		return successCount;
	}

	/**
	 * Set the number of successfully executed repetitions.
	 *
	 * @since 2.0
	 * @param successCount the input value
	 */
	public void  setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}

	/**
	 * Set the number of successfully executed repetitions.
	 *
	 * @since 2.0
	 * @param successCount the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics withSuccessCount(Long successCount) {
		this.successCount = successCount;
		return this;
	}

	/**
	 * Get the results from the most recent invocation of the test, one instance per repetition.
	 *
	 * @return the value
	 */
	public Collection<Result> getResults() {
		if (this.results == null){ this.results=new ArrayList<>();}
		return results;
	}

	/**
	 * Set the results from the most recent invocation of the test, one instance per repetition.
	 *
	 * @param results the input value
	 */
	public void  setResults(Collection<Result> results) {
		this.results = results;
	}

	/**
	 * Set the results from the most recent invocation of the test, one instance per repetition.
	 *
	 * @param result the input value
	 * @return this instance
	 */
	public NSLookupDiagnostics withResult(Result result) {
		getResults().add(result);
		return this;
	}

	//</editor-fold>

}