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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice.wanconnectiondevice.wanipconnection;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains statistics for all connections within the same ''WANConnectionDevice'' that share a common MAC address.  The contents of this object should be identical for each such connection.

This object is required for all ''WANConnectionDevice''s that can support an Ethernet-layer on this interface (e.g., ''PPPoE'', ''IPoE'').
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANIPConnection.{i}.Stats.")
public class Stats {

	/**
	 * Total number of bytes sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetBytesSent")
	public Long ethernetBytesSent;
	/**
	 * Total number of bytes received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetBytesReceived")
	public Long ethernetBytesReceived;
	/**
	 * Total number of Ethernet packets sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetPacketsSent")
	public Long ethernetPacketsSent;
	/**
	 * Total number of Ethernet packets received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EthernetPacketsReceived")
	public Long ethernetPacketsReceived;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the total number of bytes sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetBytesSent() {
		return ethernetBytesSent;
	}

	/**
	 * Set the total number of bytes sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetBytesSent the input value
	 */
	public void  setEthernetBytesSent(Long ethernetBytesSent) {
		this.ethernetBytesSent = ethernetBytesSent;
	}

	/**
	 * Set the total number of bytes sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetBytesSent the input value
	 * @return this instance
	 */
	public Stats withEthernetBytesSent(Long ethernetBytesSent) {
		this.ethernetBytesSent = ethernetBytesSent;
		return this;
	}

	/**
	 * Get the total number of bytes received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetBytesReceived() {
		return ethernetBytesReceived;
	}

	/**
	 * Set the total number of bytes received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetBytesReceived the input value
	 */
	public void  setEthernetBytesReceived(Long ethernetBytesReceived) {
		this.ethernetBytesReceived = ethernetBytesReceived;
	}

	/**
	 * Set the total number of bytes received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetBytesReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetBytesReceived(Long ethernetBytesReceived) {
		this.ethernetBytesReceived = ethernetBytesReceived;
		return this;
	}

	/**
	 * Get the total number of Ethernet packets sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetPacketsSent() {
		return ethernetPacketsSent;
	}

	/**
	 * Set the total number of Ethernet packets sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetPacketsSent the input value
	 */
	public void  setEthernetPacketsSent(Long ethernetPacketsSent) {
		this.ethernetPacketsSent = ethernetPacketsSent;
	}

	/**
	 * Set the total number of Ethernet packets sent over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetPacketsSent the input value
	 * @return this instance
	 */
	public Stats withEthernetPacketsSent(Long ethernetPacketsSent) {
		this.ethernetPacketsSent = ethernetPacketsSent;
		return this;
	}

	/**
	 * Get the total number of Ethernet packets received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getEthernetPacketsReceived() {
		return ethernetPacketsReceived;
	}

	/**
	 * Set the total number of Ethernet packets received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetPacketsReceived the input value
	 */
	public void  setEthernetPacketsReceived(Long ethernetPacketsReceived) {
		this.ethernetPacketsReceived = ethernetPacketsReceived;
	}

	/**
	 * Set the total number of Ethernet packets received over all connections within the same ''WANConnectionDevice'' that share a common MAC address since the CPE was last reset.
	 *
	 * @since 1.0
	 * @param ethernetPacketsReceived the input value
	 * @return this instance
	 */
	public Stats withEthernetPacketsReceived(Long ethernetPacketsReceived) {
		this.ethernetPacketsReceived = ethernetPacketsReceived;
		return this;
	}

	//</editor-fold>

}