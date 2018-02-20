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
package org.broadbandforum.tr181.device.wifi.endpoint;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Throughput statistics for this end point.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.WiFi.EndPoint.{i}.Stats.")
@XmlRootElement(name = "Device.WiFi.EndPoint.Stats")
@XmlType(name = "Device.WiFi.EndPoint.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The data transmit rate in kbps that was most recently used for transmission from the access point to the end point device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastDataDownlinkRate")
	@CWMPParameter(activeNotify = "canDeny", units = "kbps")
	@Size(min = 1000, max = 600000)
	public Long lastDataDownlinkRate;
	/**
	 * The data transmit rate in kbps that was most recently used for transmission from the end point to the access point device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastDataUplinkRate")
	@CWMPParameter(activeNotify = "canDeny", units = "kbps")
	@Size(min = 1000, max = 600000)
	public Long lastDataUplinkRate;
	/**
	 * An indicator of radio signal strength of the downlink from the access point to the end point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SignalStrength")
	@Size(min = -200, max = 0)
	public Integer signalStrength;
	/**
	 * The number of packets that had to be re-transmitted, from the last 100 packets sent to the access point. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Retransmissions")
	@Size(min = 0, max = 100)
	public Long retransmissions = 0L;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the data transmit rate in kbps that was most recently used for transmission from the access point to the end point device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastDataDownlinkRate() {
		return lastDataDownlinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the access point to the end point device.
	 *
	 * @since 2.0
	 * @param lastDataDownlinkRate the input value
	 */
	public void  setLastDataDownlinkRate(Long lastDataDownlinkRate) {
		this.lastDataDownlinkRate = lastDataDownlinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the access point to the end point device.
	 *
	 * @since 2.0
	 * @param lastDataDownlinkRate the input value
	 * @return this instance
	 */
	public Stats withLastDataDownlinkRate(Long lastDataDownlinkRate) {
		this.lastDataDownlinkRate = lastDataDownlinkRate;
		return this;
	}

	/**
	 * Get the data transmit rate in kbps that was most recently used for transmission from the end point to the access point device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastDataUplinkRate() {
		return lastDataUplinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the end point to the access point device.
	 *
	 * @since 2.0
	 * @param lastDataUplinkRate the input value
	 */
	public void  setLastDataUplinkRate(Long lastDataUplinkRate) {
		this.lastDataUplinkRate = lastDataUplinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the end point to the access point device.
	 *
	 * @since 2.0
	 * @param lastDataUplinkRate the input value
	 * @return this instance
	 */
	public Stats withLastDataUplinkRate(Long lastDataUplinkRate) {
		this.lastDataUplinkRate = lastDataUplinkRate;
		return this;
	}

	/**
	 * Get an indicator of radio signal strength of the downlink from the access point to the end point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSignalStrength() {
		return signalStrength;
	}

	/**
	 * Set an indicator of radio signal strength of the downlink from the access point to the end point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 * @param signalStrength the input value
	 */
	public void  setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}

	/**
	 * Set an indicator of radio signal strength of the downlink from the access point to the end point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 * @param signalStrength the input value
	 * @return this instance
	 */
	public Stats withSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
		return this;
	}

	/**
	 * Get the number of packets that had to be re-transmitted, from the last 100 packets sent to the access point. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRetransmissions() {
		return retransmissions;
	}

	/**
	 * Set the number of packets that had to be re-transmitted, from the last 100 packets sent to the access point. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 * @param retransmissions the input value
	 */
	public void  setRetransmissions(Long retransmissions) {
		this.retransmissions = retransmissions;
	}

	/**
	 * Set the number of packets that had to be re-transmitted, from the last 100 packets sent to the access point. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 * @param retransmissions the input value
	 * @return this instance
	 */
	public Stats withRetransmissions(Long retransmissions) {
		this.retransmissions = retransmissions;
		return this;
	}

	//</editor-fold>

}