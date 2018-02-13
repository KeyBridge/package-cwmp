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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Global operations total statistics.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.ServiceMonitoring.GlobalOperation.Total.")
@XmlRootElement(name = "Total")
@XmlType(name = "STBService.ServiceMonitoring.GlobalOperation.Total")
@XmlAccessorType(XmlAccessType.FIELD)
public class Total {

	/**
	 * The time period in, milliseconds, between the first message (e.g. DHCP Discover) sent by the STB during boot-up and the first multicast I-frame for the default channel displayed by the STB.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ServiceAccessTime")
	public Long serviceAccessTime;
	/**
	 * Minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MinimumPortalResponse")
	public Long minimumPortalResponse;
	/**
	 * Maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaximumPortalResponse")
	public Long maximumPortalResponse;

	public Total() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the time period in, milliseconds, between the first message (e.g. DHCP Discover) sent by the STB during boot-up and the first multicast I-frame for the default channel displayed by the STB.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getServiceAccessTime() {
		return serviceAccessTime;
	}

	/**
	 * Set the time period in, milliseconds, between the first message (e.g. DHCP Discover) sent by the STB during boot-up and the first multicast I-frame for the default channel displayed by the STB.
	 *
	 * @since 1.1
	 * @param serviceAccessTime the input value
	 */
	public void  setServiceAccessTime(Long serviceAccessTime) {
		this.serviceAccessTime = serviceAccessTime;
	}

	/**
	 * Set the time period in, milliseconds, between the first message (e.g. DHCP Discover) sent by the STB during boot-up and the first multicast I-frame for the default channel displayed by the STB.
	 *
	 * @since 1.1
	 * @param serviceAccessTime the input value
	 * @return this instance
	 */
	public Total withServiceAccessTime(Long serviceAccessTime) {
		this.serviceAccessTime = serviceAccessTime;
		return this;
	}

	/**
	 * Get the minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMinimumPortalResponse() {
		return minimumPortalResponse;
	}

	/**
	 * Set the minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 * @param minimumPortalResponse the input value
	 */
	public void  setMinimumPortalResponse(Long minimumPortalResponse) {
		this.minimumPortalResponse = minimumPortalResponse;
	}

	/**
	 * Set the minimum portal latency defined as the minimum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 * @param minimumPortalResponse the input value
	 * @return this instance
	 */
	public Total withMinimumPortalResponse(Long minimumPortalResponse) {
		this.minimumPortalResponse = minimumPortalResponse;
		return this;
	}

	/**
	 * Get the maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaximumPortalResponse() {
		return maximumPortalResponse;
	}

	/**
	 * Set the maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 * @param maximumPortalResponse the input value
	 */
	public void  setMaximumPortalResponse(Long maximumPortalResponse) {
		this.maximumPortalResponse = maximumPortalResponse;
	}

	/**
	 * Set the maximum portal latency defined as the maximum time period, in milliseconds, between the instant of transmitting TCP SYN (the three way handshake) prior to first HTTP message, and receiving the last HTTP message carrying the information.
	 *
	 * @since 1.1
	 * @param maximumPortalResponse the input value
	 * @return this instance
	 */
	public Total withMaximumPortalResponse(Long maximumPortalResponse) {
		this.maximumPortalResponse = maximumPortalResponse;
		return this;
	}

	//</editor-fold>

}