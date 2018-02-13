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
package org.broadbandforum.tr181.device.ip.diagnostics.traceroute;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Contains the array of hop results returned. If a route could not be determined, this array will be empty
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.Diagnostics.TraceRoute.RouteHops.{i}.")
@XmlRootElement(name = "RouteHops")
@XmlType(name = "Device.IP.Diagnostics.TraceRoute.RouteHops")
@XmlAccessorType(XmlAccessType.FIELD)
public class RouteHops {

	/**
	 * Result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered  route.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Host")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String host;
	/**
	 * If this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the  {{param|Host}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HostAddress")
	@CWMPParameter(activeNotify = "canDeny")
	public String hostAddress;
	/**
	 * Contains the error code returned for this hop. This code is directly from the ICMP CODE field.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErrorCode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long errorCode;
	/**
	 * {{list}} Each list item contains one or more round trip times in milliseconds (one for each repetition) for this hop.

          A list item of 0 indicates that the corresponding response was not received.  Round trip times of less than 1 milliseconds MUST be rounded up to 1.

          The number of list entries is determined by the {{param|#.RouteHopsNumberOfEntries}} parameter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RTTimes")
	public Long rttimes;

	public RouteHops() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered  route.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Set the result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered  route.
	 *
	 * @since 2.0
	 * @param host the input value
	 */
	public void  setHost(String host) {
		this.host = host;
	}

	/**
	 * Set the result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered  route.
	 *
	 * @since 2.0
	 * @param host the input value
	 * @return this instance
	 */
	public RouteHops withHost(String host) {
		this.host = host;
		return this;
	}

	/**
	 * Get the if this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the  {{param|Host}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHostAddress() {
		return hostAddress;
	}

	/**
	 * Set the if this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the  {{param|Host}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 2.0
	 * @param hostAddress the input value
	 */
	public void  setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	/**
	 * Set the if this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the  {{param|Host}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 2.0
	 * @param hostAddress the input value
	 * @return this instance
	 */
	public RouteHops withHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
		return this;
	}

	/**
	 * Get the contains the error code returned for this hop. This code is directly from the ICMP CODE field.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getErrorCode() {
		return errorCode;
	}

	/**
	 * Set the contains the error code returned for this hop. This code is directly from the ICMP CODE field.
	 *
	 * @since 2.0
	 * @param errorCode the input value
	 */
	public void  setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Set the contains the error code returned for this hop. This code is directly from the ICMP CODE field.
	 *
	 * @since 2.0
	 * @param errorCode the input value
	 * @return this instance
	 */
	public RouteHops withErrorCode(Long errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	/**
	 * Get the {{list}} Each list item contains one or more round trip times in milliseconds (one for each repetition) for this hop.

          A list item of 0 indicates that the corresponding response was not received.  Round trip times of less than 1 milliseconds MUST be rounded up to 1.

          The number of list entries is determined by the {{param|#.RouteHopsNumberOfEntries}} parameter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRttimes() {
		return rttimes;
	}

	/**
	 * Set the {{list}} Each list item contains one or more round trip times in milliseconds (one for each repetition) for this hop.

          A list item of 0 indicates that the corresponding response was not received.  Round trip times of less than 1 milliseconds MUST be rounded up to 1.

          The number of list entries is determined by the {{param|#.RouteHopsNumberOfEntries}} parameter.
	 *
	 * @since 2.0
	 * @param rttimes the input value
	 */
	public void  setRttimes(Long rttimes) {
		this.rttimes = rttimes;
	}

	/**
	 * Set the {{list}} Each list item contains one or more round trip times in milliseconds (one for each repetition) for this hop.

          A list item of 0 indicates that the corresponding response was not received.  Round trip times of less than 1 milliseconds MUST be rounded up to 1.

          The number of list entries is determined by the {{param|#.RouteHopsNumberOfEntries}} parameter.
	 *
	 * @since 2.0
	 * @param rttimes the input value
	 * @return this instance
	 */
	public RouteHops withRttimes(Long rttimes) {
		this.rttimes = rttimes;
		return this;
	}

	//</editor-fold>

}