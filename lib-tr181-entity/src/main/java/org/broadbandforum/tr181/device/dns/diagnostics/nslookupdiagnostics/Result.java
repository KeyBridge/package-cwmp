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
package org.broadbandforum.tr181.device.dns.diagnostics.nslookupdiagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.common.IPAddress;

	/**
	 * Results from the most recent invocation of the test, one instance per repetition.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.DNS.Diagnostics.NSLookupDiagnostics.Result.{i}.")
@XmlRootElement(name = "Device.DNS.Diagnostics.NSLookupDiagnostics.Result")
@XmlType(name = "Device.DNS.Diagnostics.NSLookupDiagnostics.Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {

	/**
	 * Result Parameter to represent whether the NS Lookup was successful or not.  

          Errors for individual Result instances do not get bubbled up to {{param|#.DiagnosticsState}}.  

          A failure on a specific attempt does not mean that the overall test failed, but a failure on all attempts means that {{param|#.DiagnosticsState}} SHOULD be {{enum|Error_Other|#.DiagnosticsState}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	@CWMPParameter(activeNotify = "canDeny")
	public String status;
	/**
	 * Result parameter to represent whether the answer is Authoritative or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AnswerType")
	@CWMPParameter(activeNotify = "canDeny")
	public String answerType;
	/**
	 * Result parameter to represent the fully qualified name for the Host Name in the calling parameter (e.g. HostName.DomainName); if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HostNameReturned")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String hostNameReturned;
	/**
	 * {{list}} Indicates the IP Address results returned by the NS Lookup; if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPAddresses")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress ipaddresses;
	/**
	 * Result parameter to represent the actual DNS Server IP address that the NS Lookup used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DNSServerIP")
	@CWMPParameter(activeNotify = "canDeny")
	public IPAddress dnsServerIP;
	/**
	 * Response time (for the first response packet) in milliseconds, or 0 if no response was received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long responseTime;

	public Result() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the result Parameter to represent whether the NS Lookup was successful or not.  

          Errors for individual Result instances do not get bubbled up to {{param|#.DiagnosticsState}}.  

          A failure on a specific attempt does not mean that the overall test failed, but a failure on all attempts means that {{param|#.DiagnosticsState}} SHOULD be {{enum|Error_Other|#.DiagnosticsState}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the result Parameter to represent whether the NS Lookup was successful or not.  

          Errors for individual Result instances do not get bubbled up to {{param|#.DiagnosticsState}}.  

          A failure on a specific attempt does not mean that the overall test failed, but a failure on all attempts means that {{param|#.DiagnosticsState}} SHOULD be {{enum|Error_Other|#.DiagnosticsState}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the result Parameter to represent whether the NS Lookup was successful or not.  

          Errors for individual Result instances do not get bubbled up to {{param|#.DiagnosticsState}}.  

          A failure on a specific attempt does not mean that the overall test failed, but a failure on all attempts means that {{param|#.DiagnosticsState}} SHOULD be {{enum|Error_Other|#.DiagnosticsState}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Result withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the result parameter to represent whether the answer is Authoritative or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAnswerType() {
		return answerType;
	}

	/**
	 * Set the result parameter to represent whether the answer is Authoritative or not.
	 *
	 * @since 2.0
	 * @param answerType the input value
	 */
	public void  setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	/**
	 * Set the result parameter to represent whether the answer is Authoritative or not.
	 *
	 * @since 2.0
	 * @param answerType the input value
	 * @return this instance
	 */
	public Result withAnswerType(String answerType) {
		this.answerType = answerType;
		return this;
	}

	/**
	 * Get the result parameter to represent the fully qualified name for the Host Name in the calling parameter (e.g. HostName.DomainName); if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHostNameReturned() {
		return hostNameReturned;
	}

	/**
	 * Set the result parameter to represent the fully qualified name for the Host Name in the calling parameter (e.g. HostName.DomainName); if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param hostNameReturned the input value
	 */
	public void  setHostNameReturned(String hostNameReturned) {
		this.hostNameReturned = hostNameReturned;
	}

	/**
	 * Set the result parameter to represent the fully qualified name for the Host Name in the calling parameter (e.g. HostName.DomainName); if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param hostNameReturned the input value
	 * @return this instance
	 */
	public Result withHostNameReturned(String hostNameReturned) {
		this.hostNameReturned = hostNameReturned;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the IP Address results returned by the NS Lookup; if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getIpaddresses() {
		return ipaddresses;
	}

	/**
	 * Set the {{list}} Indicates the IP Address results returned by the NS Lookup; if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param ipaddresses the input value
	 */
	public void  setIpaddresses(IPAddress ipaddresses) {
		this.ipaddresses = ipaddresses;
	}

	/**
	 * Set the {{list}} Indicates the IP Address results returned by the NS Lookup; if no response was provided, then this parameter is {{empty}}.
	 *
	 * @since 2.0
	 * @param ipaddresses the input value
	 * @return this instance
	 */
	public Result withIpaddresses(IPAddress ipaddresses) {
		this.ipaddresses = ipaddresses;
		return this;
	}

	/**
	 * Get the result parameter to represent the actual DNS Server IP address that the NS Lookup used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getDnsServerIP() {
		return dnsServerIP;
	}

	/**
	 * Set the result parameter to represent the actual DNS Server IP address that the NS Lookup used.
	 *
	 * @since 2.0
	 * @param dnsServerIP the input value
	 */
	public void  setDnsServerIP(IPAddress dnsServerIP) {
		this.dnsServerIP = dnsServerIP;
	}

	/**
	 * Set the result parameter to represent the actual DNS Server IP address that the NS Lookup used.
	 *
	 * @since 2.0
	 * @param dnsServerIP the input value
	 * @return this instance
	 */
	public Result withDnsServerIP(IPAddress dnsServerIP) {
		this.dnsServerIP = dnsServerIP;
		return this;
	}

	/**
	 * Get the response time (for the first response packet) in milliseconds, or 0 if no response was received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getResponseTime() {
		return responseTime;
	}

	/**
	 * Set the response time (for the first response packet) in milliseconds, or 0 if no response was received.
	 *
	 * @since 2.0
	 * @param responseTime the input value
	 */
	public void  setResponseTime(Long responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * Set the response time (for the first response packet) in milliseconds, or 0 if no response was received.
	 *
	 * @since 2.0
	 * @param responseTime the input value
	 * @return this instance
	 */
	public Result withResponseTime(Long responseTime) {
		this.responseTime = responseTime;
		return this;
	}

	//</editor-fold>

}