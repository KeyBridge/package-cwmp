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
package org.broadbandforum.tr098.internetgatewaydevice.traceroutediagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Contains the array of results returned.  If a route could not be determined, this array will be empty
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.TraceRouteDiagnostics.RouteHops.{i}.")
@XmlRootElement(name = "RouteHops")
@XmlType(name = "InternetGatewayDevice.TraceRouteDiagnostics.RouteHops")
@XmlAccessorType(XmlAccessType.FIELD)
public class RouteHops {

	/**
	 * Result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered route.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "HopHost")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String hopHost;
	/**
	 * If this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the {{param|HopHost}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "HopHostAddress")
	@CWMPParameter(activeNotify = "canDeny")
	public String hopHostAddress;
	/**
	 * Contains the error code returned for this hop  This code is directly from the ICMP CODE field.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "HopErrorCode")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hopErrorCode;
	/**
	 * Contains one or more round trip times in milliseconds (one for each repetition) for this hop.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "HopRTTimes")
	@CWMPParameter(activeNotify = "canDeny")
	public Long hopRTTimes;

	public RouteHops() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered route.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getHopHost() {
		return hopHost;
	}

	/**
	 * Set the result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered route.
	 *
	 * @since 1.4
	 * @param hopHost the input value
	 */
	public void  setHopHost(String hopHost) {
		this.hopHost = hopHost;
	}

	/**
	 * Set the result parameter indicating the Host Name if DNS is able to resolve or IP Address of a hop along the discovered route.
	 *
	 * @since 1.4
	 * @param hopHost the input value
	 * @return this instance
	 */
	public RouteHops withHopHost(String hopHost) {
		this.hopHost = hopHost;
		return this;
	}

	/**
	 * Get the if this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the {{param|HopHost}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getHopHostAddress() {
		return hopHostAddress;
	}

	/**
	 * Set the if this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the {{param|HopHost}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 1.4
	 * @param hopHostAddress the input value
	 */
	public void  setHopHostAddress(String hopHostAddress) {
		this.hopHostAddress = hopHostAddress;
	}

	/**
	 * Set the if this parameter is not {{empty}} it will contain the last IP address of the host returned for this hop and the {{param|HopHost}} will contain the Host Name returned from the reverse DNS query.
	 *
	 * @since 1.4
	 * @param hopHostAddress the input value
	 * @return this instance
	 */
	public RouteHops withHopHostAddress(String hopHostAddress) {
		this.hopHostAddress = hopHostAddress;
		return this;
	}

	/**
	 * Get the contains the error code returned for this hop  This code is directly from the ICMP CODE field.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getHopErrorCode() {
		return hopErrorCode;
	}

	/**
	 * Set the contains the error code returned for this hop  This code is directly from the ICMP CODE field.
	 *
	 * @since 1.4
	 * @param hopErrorCode the input value
	 */
	public void  setHopErrorCode(Long hopErrorCode) {
		this.hopErrorCode = hopErrorCode;
	}

	/**
	 * Set the contains the error code returned for this hop  This code is directly from the ICMP CODE field.
	 *
	 * @since 1.4
	 * @param hopErrorCode the input value
	 * @return this instance
	 */
	public RouteHops withHopErrorCode(Long hopErrorCode) {
		this.hopErrorCode = hopErrorCode;
		return this;
	}

	/**
	 * Get the contains one or more round trip times in milliseconds (one for each repetition) for this hop.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getHopRTTimes() {
		return hopRTTimes;
	}

	/**
	 * Set the contains one or more round trip times in milliseconds (one for each repetition) for this hop.
	 *
	 * @since 1.4
	 * @param hopRTTimes the input value
	 */
	public void  setHopRTTimes(Long hopRTTimes) {
		this.hopRTTimes = hopRTTimes;
	}

	/**
	 * Set the contains one or more round trip times in milliseconds (one for each repetition) for this hop.
	 *
	 * @since 1.4
	 * @param hopRTTimes the input value
	 * @return this instance
	 */
	public RouteHops withHopRTTimes(Long hopRTTimes) {
		this.hopRTTimes = hopRTTimes;
		return this;
	}

	//</editor-fold>

}