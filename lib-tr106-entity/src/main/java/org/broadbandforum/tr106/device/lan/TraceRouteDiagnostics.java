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
package org.broadbandforum.tr106.device.lan;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr106.device.lan.traceroutediagnostics.RouteHops;

	/**
	 * This object is defines access to an IP-layer trace-route test for the default IP interface.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "Device.LAN.TraceRouteDiagnostics.")
public class TraceRouteDiagnostics {

	/**
	 * Indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DiagnosticsState")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public String diagnosticsState;
	/**
	 * Host name or address of the host to find a route to.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Host")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String host;
	/**
	 * Timeout in milliseconds for the trace route test.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Timeout")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1)
	public Long timeout;
	/**
	 * Size of the data block in bytes to be sent for each trace route.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DataBlockSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long dataBlockSize;
	/**
	 * The maximum number of hop used in outgoing probe packets (max TTL).  The default is 30 hops.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxHopCount")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 64)
	public Long maxHopCount;
	/**
	 * DiffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DSCP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscP;
	/**
	 * Result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ResponseTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long responseTime;
	/**
	 * Result parameter indicating the number of hops within the discovered route.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfRouteHops")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numberOfRouteHops;
	/**
	 * Result parameter indicating the components of the discovered route.  If a route could not be determined, there will be no instances of this object.
	 */
	@XmlElementWrapper(name = "routeHopss")
	@XmlElement(name = "RouteHops")
	public Collection<RouteHops> routeHopss;

	public TraceRouteDiagnostics() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDiagnosticsState() {
		return diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 * @param diagnosticsState the input value
	 */
	public void  setDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
	}

	/**
	 * Set the indicates availability of diagnostic data.  {{enum}}

If the ACS sets the value of this parameter to {{enum|Requested}}, the CPE MUST initiate the corresponding diagnostic test.  When writing, the only allowed value is {{enum|Requested}}.  To ensure the use of the proper test parameters (the writable parameters in this object), the test parameters MUST be set either prior to or at the same time as (in the same SetParameterValues) setting the {{param}} to {{enum|Requested}}.

When requested, the CPE SHOULD wait until after completion of the communication session with the ACS before starting the diagnostic.

When the test is completed, the value of this parameter MUST be either {{enum|Complete}} (if the test completed successfully), or one of the ''Error'' values listed above.

If the value of this parameter is anything other than {{enum|Complete}}, the values of the results parameters for this test are indeterminate.

When the diagnostic initiated by the ACS is completed (successfully or not), the CPE MUST establish a new connection to the ACS to allow the ACS to view the results, indicating the Event code ''8 DIAGNOSTICS COMPLETE'' in the Inform message.

After the diagnostic is complete, the value of all result parameters (all read-only parameters in this object) MUST be retained by the CPE until either this diagnostic is run again, or the CPE reboots.  After a reboot, if the CPE has not retained the result parameters from the most recent test, it MUST set the value of this parameter to {{enum|None}}.

Modifying any of the writable parameters in this object except for this one MUST result in the value of this parameter being set to {{enum|None}}.

While the test is in progress, modifying any of the writable parameters in this object except for this one MUST result in the test being terminated and the value of this parameter being set to {{enum|None}}.

While the test is in progress, setting this parameter to {{enum|Requested}} (and possibly modifying other writable parameters in this object) MUST result in the test being terminated and then restarted using the current values of the test parameters.
	 *
	 * @since 1.0
	 * @param diagnosticsState the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withDiagnosticsState(String diagnosticsState) {
		this.diagnosticsState = diagnosticsState;
		return this;
	}

	/**
	 * Get the host name or address of the host to find a route to.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Set the host name or address of the host to find a route to.
	 *
	 * @since 1.0
	 * @param host the input value
	 */
	public void  setHost(String host) {
		this.host = host;
	}

	/**
	 * Set the host name or address of the host to find a route to.
	 *
	 * @since 1.0
	 * @param host the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withHost(String host) {
		this.host = host;
		return this;
	}

	/**
	 * Get the timeout in milliseconds for the trace route test.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTimeout() {
		return timeout;
	}

	/**
	 * Set the timeout in milliseconds for the trace route test.
	 *
	 * @since 1.0
	 * @param timeout the input value
	 */
	public void  setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	/**
	 * Set the timeout in milliseconds for the trace route test.
	 *
	 * @since 1.0
	 * @param timeout the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * Get the size of the data block in bytes to be sent for each trace route.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDataBlockSize() {
		return dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each trace route.
	 *
	 * @since 1.0
	 * @param dataBlockSize the input value
	 */
	public void  setDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
	}

	/**
	 * Set the size of the data block in bytes to be sent for each trace route.
	 *
	 * @since 1.0
	 * @param dataBlockSize the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withDataBlockSize(Long dataBlockSize) {
		this.dataBlockSize = dataBlockSize;
		return this;
	}

	/**
	 * Get the maximum number of hop used in outgoing probe packets (max TTL).  The default is 30 hops.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxHopCount() {
		return maxHopCount;
	}

	/**
	 * Set the maximum number of hop used in outgoing probe packets (max TTL).  The default is 30 hops.
	 *
	 * @since 1.0
	 * @param maxHopCount the input value
	 */
	public void  setMaxHopCount(Long maxHopCount) {
		this.maxHopCount = maxHopCount;
	}

	/**
	 * Set the maximum number of hop used in outgoing probe packets (max TTL).  The default is 30 hops.
	 *
	 * @since 1.0
	 * @param maxHopCount the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withMaxHopCount(Long maxHopCount) {
		this.maxHopCount = maxHopCount;
		return this;
	}

	/**
	 * Get the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDscP() {
		return dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
	 *
	 * @since 1.0
	 * @param dscP the input value
	 */
	public void  setDscP(Long dscP) {
		this.dscP = dscP;
	}

	/**
	 * Set the diffServ codepoint to be used for the test packets.  By default the CPE SHOULD set this value to zero.
	 *
	 * @since 1.0
	 * @param dscP the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withDscP(Long dscP) {
		this.dscP = dscP;
		return this;
	}

	/**
	 * Get the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getResponseTime() {
		return responseTime;
	}

	/**
	 * Set the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param responseTime the input value
	 */
	public void  setResponseTime(Long responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * Set the result parameter indicating the response time in milliseconds the most recent trace route test.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param responseTime the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withResponseTime(Long responseTime) {
		this.responseTime = responseTime;
		return this;
	}

	/**
	 * Get the result parameter indicating the number of hops within the discovered route.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getNumberOfRouteHops() {
		return numberOfRouteHops;
	}

	/**
	 * Set the result parameter indicating the number of hops within the discovered route.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param numberOfRouteHops the input value
	 */
	public void  setNumberOfRouteHops(Long numberOfRouteHops) {
		this.numberOfRouteHops = numberOfRouteHops;
	}

	/**
	 * Set the result parameter indicating the number of hops within the discovered route.  If a route could not be determined, this value MUST be zero.
	 *
	 * @since 1.0
	 * @param numberOfRouteHops the input value
	 * @return this instance
	 */
	public TraceRouteDiagnostics withNumberOfRouteHops(Long numberOfRouteHops) {
		this.numberOfRouteHops = numberOfRouteHops;
		return this;
	}

	/**
	 * Get the result parameter indicating the components of the discovered route.  If a route could not be determined, there will be no instances of this object.
	 *
	 * @return the value
	 */
	public Collection<RouteHops> getRouteHopss() {
		if (this.routeHopss == null){ this.routeHopss=new ArrayList<>();}
		return routeHopss;
	}

	/**
	 * Set the result parameter indicating the components of the discovered route.  If a route could not be determined, there will be no instances of this object.
	 *
	 * @param routeHopss the input value
	 */
	public void  setRouteHopss(Collection<RouteHops> routeHopss) {
		this.routeHopss = routeHopss;
	}

	/**
	 * Set the result parameter indicating the components of the discovered route.  If a route could not be determined, there will be no instances of this object.
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