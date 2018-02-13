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
package org.broadbandforum.tr098.internetgatewaydevice;

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
import org.broadbandforum.tr098.internetgatewaydevice.traceroutediagnostics.RouteHops;

	/**
	 * This object is defines access to an IP-layer trace-route test for the specified IP interface.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.TraceRouteDiagnostics.")
@XmlRootElement(name = "TraceRouteDiagnostics")
@XmlType(name = "InternetGatewayDevice.TraceRouteDiagnostics")
@XmlAccessorType(XmlAccessType.FIELD)
public class TraceRouteDiagnostics {

	/**
	 * Indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String diagnosticsState;
	/**
	 * {{reference|the WAN or LAN IP-layer interface over which the test is to be performed}}  This identifies the source IP address to use when performing the test.

The following is a WAN interface example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Host name or address of the host to find a route to
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Host")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String host;
	/**
	 * Number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to 3.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "NumberOfTries")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 3)
	public Long numberOfTries;
	/**
	 * Timeout in milliseconds for the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long timeout;
	/**
	 * Size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to 38.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DataBlockSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long dataBlockSize;
	/**
	 * DiffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to 0.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * The maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to 30.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MaxHopCount")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 64)
	public Long maxHopCount;
	/**
	 * Result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long responseTime;
	/**
	 * Contains the array of results returned.  If a route could not be determined, this array will be empty
	 */
	@XmlElementWrapper(name = "RouteHopss")
	@XmlElement(name = "RouteHops")
	public Collection<RouteHops> routeHopss;

	public TraceRouteDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.4
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.
	 *
	 * @since 1.4
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the {{reference|the WAN or LAN IP-layer interface over which the test is to be performed}}  This identifies the source IP address to use when performing the test.

The following is a WAN interface example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference|the WAN or LAN IP-layer interface over which the test is to be performed}}  This identifies the source IP address to use when performing the test.

The following is a WAN interface example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.4
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference|the WAN or LAN IP-layer interface over which the test is to be performed}}  This identifies the source IP address to use when performing the test.

The following is a WAN interface example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

The following is a LAN interface example: ''InternetGatewayDevice.LANDevice.1.LANHostConfigManagement.IPInterface.1''
	 *
	 * @since 1.4
	 * @param _interface the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the host name or address of the host to find a route to
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Set the host name or address of the host to find a route to
	 *
	 * @since 1.4
	 * @param host the input value
	 */
	public void  setHost(String host) {
		this.host = host;
	}

	/**
	 * Set the host name or address of the host to find a route to
	 *
	 * @since 1.4
	 * @param host the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withHost(String host) {
		this.host = host;
		return this;
	}

	/**
	 * Get the number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to 3.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getNumberOfTries() {
		return numberOfTries;
	}

	/**
	 * Set the number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to 3.
	 *
	 * @since 1.4
	 * @param numberOfTries the input value
	 */
	public void  setNumberOfTries(Long numberOfTries) {
		this.numberOfTries = numberOfTries;
	}

	/**
	 * Set the number of tries per hop. Set prior to running Diagnostic.  By default, the CPE SHOULD set this value to 3.
	 *
	 * @since 1.4
	 * @param numberOfTries the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withNumberOfTries(Long numberOfTries) {
		this.numberOfTries = numberOfTries;
		return this;
	}

	/**
	 * Get the timeout in milliseconds for the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds for the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 1.4
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds for the trace route test.  By default the CPE SHOULD set this value to 5000.
	 *
	 * @since 1.4
	 * @param timeout the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to 38.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getDataBlockSize() {
		return dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to 38.
	 *
	 * @since 1.4
	 * @param dataBlockSize the input value
	 */
	public void  setDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each trace route.  By default, the CPE SHOULD set this value to 38.
	 *
	 * @since 1.4
	 * @param dataBlockSize the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
		return this;
	}

	/**
	 * Get the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to 0.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to 0.
	 *
	 * @since 1.4
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to 0.
	 *
	 * @since 1.4
	 * @param dscP the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withDscP(Long dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to 30.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getMaxHopCount() {
		return maxHopCount;
	}

	/**
	 * Set the maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to 30.
	 *
	 * @since 1.4
	 * @param maxHopCount the input value
	 */
	public void  setMaxHopCount(Long maxHopCount) {
		this.maxHopCount = maxHopCount;
	}

	/**
	 * Set the maximum number of hop used in outgoing probe packets (max TTL).  By default the CPE SHOULD set this value to 30.
	 *
	 * @since 1.4
	 * @param maxHopCount the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withMaxHopCount(Long maxHopCount) {
		this.maxHopCount = maxHopCount;
		return this;
	}

	/**
	 * Get the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getResponseTime() {
		return responseTime;
	}

	/**
	 * Set the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.4
	 * @param responseTime the input value
	 */
	public void  setResponseTime(Long responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * Set the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.4
	 * @param responseTime the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withResponseTime(Long responseTime) {
		this.responseTime = responseTime;
		return this;
	}

	/**
	 * Get the contains the array of results returned.  If a route could not be determined, this array will be empty
	 *
	 * @return the value
	 */
	public Collection<RouteHops> getRouteHopss() {
		if (this.routeHopss == null){ this.routeHopss=new ArrayList<>();}
		return routeHopss;
	}

	/**
	 * Set the contains the array of results returned.  If a route could not be determined, this array will be empty
	 *
	 * @param routeHopss the input value
	 */
	public void  setRouteHopss(Collection<RouteHops> routeHopss) {
		this.routeHopss = routeHopss;
	}

	/**
	 * Set the contains the array of results returned.  If a route could not be determined, this array will be empty
	 *
	 * @param routeHops the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withRouteHops(RouteHops routeHops) {
		getRouteHopss().add(routeHops);
		return this;
	}

	//</editor-fold>

}