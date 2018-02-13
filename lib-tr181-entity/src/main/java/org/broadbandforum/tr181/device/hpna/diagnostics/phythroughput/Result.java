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
package org.broadbandforum.tr181.device.hpna.diagnostics.phythroughput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * PHY throughput diagnostics results. 

        Each result object corresponds to unidirectional traffic between two PHY diagnostics-enabled nodes (so there are two such objects for  each such pair).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HPNA.Diagnostics.PHYThroughput.Result.{i}.")
@XmlRootElement(name = "Device.HPNA.Diagnostics.PHYThroughput.Result")
@XmlType(name = "Device.HPNA.Diagnostics.PHYThroughput.Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {

	/**
	 * HPNA source MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SrcMACAddress")
	public MACAddress srcMACAddress;
	/**
	 * HPNA destination MAC address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestMACAddress")
	public MACAddress destMACAddress;
	/**
	 * PHY diagnostics HPNA PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PHYRate")
	public Long phyRate;
	/**
	 * PHY Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BaudRate")
	public Long baudRate;
	/**
	 * PHY diagnostics SNR (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNR")
	public Long snr;
	/**
	 * Number of received packets in PHY diagnostics mode.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PacketsReceived")
	public Long packetsReceived;
	/**
	 * Measured attenuation (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Attenuation")
	public Long attenuation;

	public Result() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the hpnA source MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getSrcMACAddress() {
		return srcMACAddress;
	}

	/**
	 * Set the hpnA source MAC address.
	 *
	 * @since 2.0
	 * @param srcMACAddress the input value
	 */
	public void  setSrcMACAddress(MACAddress srcMACAddress) {
		this.srcMACAddress = srcMACAddress;
	}

	/**
	 * Set the hpnA source MAC address.
	 *
	 * @since 2.0
	 * @param srcMACAddress the input value
	 * @return this instance
	 */
	public Result withSrcMACAddress(MACAddress srcMACAddress) {
		this.srcMACAddress = srcMACAddress;
		return this;
	}

	/**
	 * Get the hpnA destination MAC address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getDestMACAddress() {
		return destMACAddress;
	}

	/**
	 * Set the hpnA destination MAC address.
	 *
	 * @since 2.0
	 * @param destMACAddress the input value
	 */
	public void  setDestMACAddress(MACAddress destMACAddress) {
		this.destMACAddress = destMACAddress;
	}

	/**
	 * Set the hpnA destination MAC address.
	 *
	 * @since 2.0
	 * @param destMACAddress the input value
	 * @return this instance
	 */
	public Result withDestMACAddress(MACAddress destMACAddress) {
		this.destMACAddress = destMACAddress;
		return this;
	}

	/**
	 * Get the phy diagnostics HPNA PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyRate() {
		return phyRate;
	}

	/**
	 * Set the phy diagnostics HPNA PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param phyRate the input value
	 */
	public void  setPhyRate(Long phyRate) {
		this.phyRate = phyRate;
	}

	/**
	 * Set the phy diagnostics HPNA PHY rate (expressed in Mbps).
	 *
	 * @since 2.0
	 * @param phyRate the input value
	 * @return this instance
	 */
	public Result withPhyRate(Long phyRate) {
		this.phyRate = phyRate;
		return this;
	}

	/**
	 * Get the phy Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBaudRate() {
		return baudRate;
	}

	/**
	 * Set the phy Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 * @param baudRate the input value
	 */
	public void  setBaudRate(Long baudRate) {
		this.baudRate = baudRate;
	}

	/**
	 * Set the phy Baud rate (expressed in Kbaud).
	 *
	 * @since 2.0
	 * @param baudRate the input value
	 * @return this instance
	 */
	public Result withBaudRate(Long baudRate) {
		this.baudRate = baudRate;
		return this;
	}

	/**
	 * Get the phy diagnostics SNR (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnr() {
		return snr;
	}

	/**
	 * Set the phy diagnostics SNR (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param snr the input value
	 */
	public void  setSnr(Long snr) {
		this.snr = snr;
	}

	/**
	 * Set the phy diagnostics SNR (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param snr the input value
	 * @return this instance
	 */
	public Result withSnr(Long snr) {
		this.snr = snr;
		return this;
	}

	/**
	 * Get the number of received packets in PHY diagnostics mode.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPacketsReceived() {
		return packetsReceived;
	}

	/**
	 * Set the number of received packets in PHY diagnostics mode.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 */
	public void  setPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
	}

	/**
	 * Set the number of received packets in PHY diagnostics mode.
	 *
	 * @since 2.0
	 * @param packetsReceived the input value
	 * @return this instance
	 */
	public Result withPacketsReceived(Long packetsReceived) {
		this.packetsReceived = packetsReceived;
		return this;
	}

	/**
	 * Get the measured attenuation (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAttenuation() {
		return attenuation;
	}

	/**
	 * Set the measured attenuation (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param attenuation the input value
	 */
	public void  setAttenuation(Long attenuation) {
		this.attenuation = attenuation;
	}

	/**
	 * Set the measured attenuation (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param attenuation the input value
	 * @return this instance
	 */
	public Result withAttenuation(Long attenuation) {
		this.attenuation = attenuation;
		return this;
	}

	//</editor-fold>

}