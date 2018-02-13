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
package org.broadbandforum.tr135.stbservice.servicemonitoring.globaloperation;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Global operations sample statistics.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.GlobalOperation.Sample.")
@XmlRootElement(name = "STBService.ServiceMonitoring.GlobalOperation.Sample")
@XmlType(name = "STBService.ServiceMonitoring.GlobalOperation.Sample")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sample {

	/**
	 * Each entry is the minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MinimumPortalResponse")
	public Long minimumPortalResponse;
	/**
	 * Each entry is the maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaximumPortalResponse")
	public Long maximumPortalResponse;
	/**
	 * Each entry is a colon separated list of time periods (in milliseconds) between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.  

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no PortalResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "PortalResponse")
	@XmlList
	public Collection<String> portalResponse;

	public Sample() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each entry is the minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMinimumPortalResponse() {
		return minimumPortalResponse;
	}

	/**
	 * Set the each entry is the minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 * @param minimumPortalResponse the input value
	 */
	public void  setMinimumPortalResponse(Long minimumPortalResponse) {
		this.minimumPortalResponse = minimumPortalResponse;
	}

	/**
	 * Set the each entry is the minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 * @param minimumPortalResponse the input value
	 * @return this instance
	 */
	public Sample withMinimumPortalResponse(Long minimumPortalResponse) {
		this.minimumPortalResponse = minimumPortalResponse;
		return this;
	}

	/**
	 * Get the each entry is the maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaximumPortalResponse() {
		return maximumPortalResponse;
	}

	/**
	 * Set the each entry is the maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 * @param maximumPortalResponse the input value
	 */
	public void  setMaximumPortalResponse(Long maximumPortalResponse) {
		this.maximumPortalResponse = maximumPortalResponse;
	}

	/**
	 * Set the each entry is the maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information during the sample interval.
	 *
	 * @since 1.1
	 * @param maximumPortalResponse the input value
	 * @return this instance
	 */
	public Sample withMaximumPortalResponse(Long maximumPortalResponse) {
		this.maximumPortalResponse = maximumPortalResponse;
		return this;
	}

	/**
	 * Get the each entry is a colon separated list of time periods (in milliseconds) between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.  

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no PortalResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getPortalResponse() {
		if (this.portalResponse == null){ this.portalResponse=new ArrayList<>();}
		return portalResponse;
	}

	/**
	 * Set the each entry is a colon separated list of time periods (in milliseconds) between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.  

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no PortalResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @param portalResponse the input value
	 */
	public void  setPortalResponse(Collection<String> portalResponse) {
		this.portalResponse = portalResponse;
	}

	/**
	 * Set the each entry is a colon separated list of time periods (in milliseconds) between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.  

A comma separates measurements made in different sample intervals, while a colon separates individual measurements within a specific sample interval.

If no PortalResponse measurements were made during a specific sample interval then this MUST be represented by an empty string.

Example: ,837:453:1234,759,,,923:698,,,1284

Here there were no measurements during first sample interval, three during the second, one during the third, etc.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.  This applies both to sample intervals and to individual measurements during a specific sample interval. {{nopattern}}
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public Sample withPortalResponse(String string) {
		getPortalResponse().add(string);
		return this;
	}

	//</editor-fold>

}