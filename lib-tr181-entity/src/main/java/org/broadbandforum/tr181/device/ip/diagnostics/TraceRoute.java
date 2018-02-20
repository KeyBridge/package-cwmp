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
import org.broadbandforum.common.DiagnosticsState;
import org.broadbandforum.common.IPAddress;
import org.broadbandforum.tr181.device.ip.diagnostics.traceroute.RouteHops;

	/**
	 * This object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.IP.Diagnostics.TraceRoute.")
@XmlRootElement(name = "Device.IP.Diagnostics.TraceRoute")
@XmlType(name = "Device.IP.Diagnostics.TraceRoute")
@XmlAccessorType(XmlAccessType.FIELD)
public class TraceRoute {

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
	 * Host name or address of the host to find a route to.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Host")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String host;
	/**
	 * Number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to  3.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberOfTries")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 3)
	public Long numberOfTries;
	/**
	 * Timeout in milliseconds for each hop of the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long timeout;
	/**
	 * Size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to  38.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DataBlockSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long dataBlockSize;
	/**
	 * DiffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * The maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to  30.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHopCount")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 64)
	public Long maxHopCount;
	/**
	 * Indicates which IP address was used for TraceRoute. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "IPAddressUsed")
	public IPAddress ipaddressUsed;
	/**
	 * Result parameter indicating the response time in milliseconds the most recent trace route test.  If a route  could not be determined, this value MUST be zero.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ResponseTime")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long responseTime;
	/**
	 * Contains the array of hop results returned. If a route could not be determined, this array will be empty
	 */
	@XmlElementWrapper(name = "RouteHopss")
	@XmlElement(name = "RouteHops")
	public Collection<RouteHops> routeHopss;

	public TraceRoute() {
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
	public TraceRoute withDiagnosticsState(DiagnosticsState diagnosticsState) {
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
	public TraceRoute with_interface(String _interface) {
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
	public TraceRoute withProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
		return this;
	}

	/**
	 * Get the host name or address of the host to find a route to.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Set the host name or address of the host to find a route to.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 * @param host the input value
	 */
	public void  setHost(String host) {
		this.host = host;
	}

	/**
	 * Set the host name or address of the host to find a route to.

          In the case where {{param}} is specified by name, and the name resolves to more than one address, it is up to the device implementation to choose which address to use.
	 *
	 * @since 2.0
	 * @param host the input value
	 * @return this instance
	 */
	public TraceRoute withHost(String host) {
		this.host = host;
		return this;
	}

	/**
	 * Get the number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to  3.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumberOfTries() {
		return numberOfTries;
	}

	/**
	 * Set the number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to  3.
	 *
	 * @since 2.0
	 * @param numberOfTries the input value
	 */
	public void  setNumberOfTries(Long numberOfTries) {
		this.numberOfTries = numberOfTries;
	}

	/**
	 * Set the number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to  3.
	 *
	 * @since 2.0
	 * @param numberOfTries the input value
	 * @return this instance
	 */
	public TraceRoute withNumberOfTries(Long numberOfTries) {
		this.numberOfTries = numberOfTries;
		return this;
	}

	/**
	 * Get the timeout in milliseconds for each hop of the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds for each hop of the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds for each hop of the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 2.0
	 * @param timeout the input value
	 * @return this instance
	 */
	public TraceRoute withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to  38.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDataBlockSize() {
		return dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to  38.
	 *
	 * @since 2.0
	 * @param dataBlockSize the input value
	 */
	public void  setDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to  38.
	 *
	 * @since 2.0
	 * @param dataBlockSize the input value
	 * @return this instance
	 */
	public TraceRoute withDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
		return this;
	}

	/**
	 * Get the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  0.
	 *
	 * @since 2.0
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to  0.
	 *
	 * @since 2.0
	 * @param dscP the input value
	 * @return this instance
	 */
	public TraceRoute withDscP(Long dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to  30.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxHopCount() {
		return maxHopCount;
	}

	/**
	 * Set the maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to  30.
	 *
	 * @since 2.0
	 * @param maxHopCount the input value
	 */
	public void  setMaxHopCount(Long maxHopCount) {
		this.maxHopCount = maxHopCount;
	}

	/**
	 * Set the maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to  30.
	 *
	 * @since 2.0
	 * @param maxHopCount the input value
	 * @return this instance
	 */
	public TraceRoute withMaxHopCount(Long maxHopCount) {
		this.maxHopCount = maxHopCount;
		return this;
	}

	/**
	 * Get the indicates which IP address was used for TraceRoute. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public IPAddress getIpaddressUsed() {
		return ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used for TraceRoute. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 * @param ipaddressUsed the input value
	 */
	public void  setIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
	}

	/**
	 * Set the indicates which IP address was used for TraceRoute. The parameter is only valid if the {{param|DiagnosticsState}} is {{enum|Complete|DiagnosticsState}}.
	 *
	 * @since 2.8
	 * @param ipaddressUsed the input value
	 * @return this instance
	 */
	public TraceRoute withIpaddressUsed(IPAddress ipaddressUsed) {
		this.ipaddressUsed = ipaddressUsed;
		return this;
	}

	/**
	 * Get the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route  could not be determined, this value MUST be zero.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getResponseTime() {
		return responseTime;
	}

	/**
	 * Set the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route  could not be determined, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param responseTime the input value
	 */
	public void  setResponseTime(Long responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * Set the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route  could not be determined, this value MUST be zero.
	 *
	 * @since 2.0
	 * @param responseTime the input value
	 * @return this instance
	 */
	public TraceRoute withResponseTime(Long responseTime) {
		this.responseTime = responseTime;
		return this;
	}

	/**
	 * Get the contains the array of hop results returned. If a route could not be determined, this array will be empty
	 *
	 * @return the value
	 */
	public Collection<RouteHops> getRouteHopss() {
		if (this.routeHopss == null){ this.routeHopss=new ArrayList<>();}
		return routeHopss;
	}

	/**
	 * Set the contains the array of hop results returned. If a route could not be determined, this array will be empty
	 *
	 * @param routeHopss the input value
	 */
	public void  setRouteHopss(Collection<RouteHops> routeHopss) {
		this.routeHopss = routeHopss;
	}

	/**
	 * Set the contains the array of hop results returned. If a route could not be determined, this array will be empty
	 *
	 * @param routeHops the input value
	 * @return this instance
	 */
	public TraceRoute withRouteHops(RouteHops routeHops) {
		getRouteHopss().add(routeHops);
		return this;
	}

	//</editor-fold>

}