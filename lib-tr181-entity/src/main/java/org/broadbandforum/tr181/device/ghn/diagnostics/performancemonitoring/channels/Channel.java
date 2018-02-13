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
package org.broadbandforum.tr181.device.ghn.diagnostics.performancemonitoring.channels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * Per-channel G.hn performance monitoring results during the current sample interval. Each table entry contains the results collected from the channel between a G.hn interface (as indicated by {{param|##.DiagnoseMACAddress}}) and a G.hn interface indicated by {{param|DestinationMACAddress}})
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Channels.Channel.{i}.")
@XmlRootElement(name = "Channel")
@XmlType(name = "Device.Ghn.Diagnostics.PerformanceMonitoring.Channels.Channel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Channel {

	/**
	 * MAC address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DestinationMACAddress")
	public MACAddress destinationMACAddress;
	/**
	 * The result of an SNR test performed over the channel. It is formatted as a comma-separated list of N/M unsigned integers that represents the result of Signal-to-Noise-Ratio measurement averaging in groups of M subcarriers. The number N depends on the bandplan used by the node and corresponds to the OFDM control parameter N of each medium as defined in {{bibref|G.9964}}. The number M corresponds to the parameter {{param|##.SNRGroupLength}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SNR")
	public Long snr;

	public Channel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public MACAddress getDestinationMACAddress() {
		return destinationMACAddress;
	}

	/**
	 * Set the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @param destinationMACAddress the input value
	 */
	public void  setDestinationMACAddress(MACAddress destinationMACAddress) {
		this.destinationMACAddress = destinationMACAddress;
	}

	/**
	 * Set the mac address of the destination node of the link being measured.
	 *
	 * @since 2.8
	 * @param destinationMACAddress the input value
	 * @return this instance
	 */
	public Channel withDestinationMACAddress(MACAddress destinationMACAddress) {
		this.destinationMACAddress = destinationMACAddress;
		return this;
	}

	/**
	 * Get the result of an SNR test performed over the channel. It is formatted as a comma-separated list of N/M unsigned integers that represents the result of Signal-to-Noise-Ratio measurement averaging in groups of M subcarriers. The number N depends on the bandplan used by the node and corresponds to the OFDM control parameter N of each medium as defined in {{bibref|G.9964}}. The number M corresponds to the parameter {{param|##.SNRGroupLength}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSnr() {
		return snr;
	}

	/**
	 * Set the result of an SNR test performed over the channel. It is formatted as a comma-separated list of N/M unsigned integers that represents the result of Signal-to-Noise-Ratio measurement averaging in groups of M subcarriers. The number N depends on the bandplan used by the node and corresponds to the OFDM control parameter N of each medium as defined in {{bibref|G.9964}}. The number M corresponds to the parameter {{param|##.SNRGroupLength}}.
	 *
	 * @since 2.8
	 * @param snr the input value
	 */
	public void  setSnr(Long snr) {
		this.snr = snr;
	}

	/**
	 * Set the result of an SNR test performed over the channel. It is formatted as a comma-separated list of N/M unsigned integers that represents the result of Signal-to-Noise-Ratio measurement averaging in groups of M subcarriers. The number N depends on the bandplan used by the node and corresponds to the OFDM control parameter N of each medium as defined in {{bibref|G.9964}}. The number M corresponds to the parameter {{param|##.SNRGroupLength}}.
	 *
	 * @since 2.8
	 * @param snr the input value
	 * @return this instance
	 */
	public Channel withSnr(Long snr) {
		this.snr = snr;
		return this;
	}

	//</editor-fold>

}