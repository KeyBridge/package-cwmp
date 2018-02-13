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
package org.broadbandforum.tr181.device.homeplug._interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This table contains information about other HomePlug devices connected to this HomePlug interface.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.HomePlug.Interface.{i}.AssociatedDevice.{i}.")
@XmlRootElement(name = "AssociatedDevice")
@XmlType(name = "Device.HomePlug.Interface.AssociatedDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class AssociatedDevice {

	/**
	 * MAC address of remote HomePlug device. It is used to uniquely identify and easily correlate with the connected remote HomePlug device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * The PHY transmit Rate (expressed in Mbps) to this remote device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxPhyRate")
	public Long txphyRate;
	/**
	 * The PHY receive Rate (expressed in Mbps) from this remote device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RxPhyRate")
	public Long rxphyRate;
	/**
	 * {{list}} List items indicate Signal to Noise Ratio (SNR) per tone from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRPerTone")
	public Long snrPerTone;
	/**
	 * Average attenuation from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AvgAttenuation")
	public Long avgAttenuation;
	/**
	 * {{list}} List items represent MAC addresses of end stations bridged by the remote HomePlug device.

          For example: "11:22:33:AA:BB:CC, 22:33:44:DD:EE:66"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EndStationMACs")
	public MACAddress endStationMACs;
	/**
	 * Whether or not this device is currently present in the HomePlug network.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;

	public AssociatedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac address of remote HomePlug device. It is used to uniquely identify and easily correlate with the connected remote HomePlug device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the mac address of remote HomePlug device. It is used to uniquely identify and easily correlate with the connected remote HomePlug device.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the mac address of remote HomePlug device. It is used to uniquely identify and easily correlate with the connected remote HomePlug device.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the PHY transmit Rate (expressed in Mbps) to this remote device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxphyRate() {
		return txphyRate;
	}

	/**
	 * Set the PHY transmit Rate (expressed in Mbps) to this remote device.
	 *
	 * @since 2.0
	 * @param txphyRate the input value
	 */
	public void  setTxphyRate(Long txphyRate) {
		this.txphyRate = txphyRate;
	}

	/**
	 * Set the PHY transmit Rate (expressed in Mbps) to this remote device.
	 *
	 * @since 2.0
	 * @param txphyRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withTxphyRate(Long txphyRate) {
		this.txphyRate = txphyRate;
		return this;
	}

	/**
	 * Get the PHY receive Rate (expressed in Mbps) from this remote device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRxphyRate() {
		return rxphyRate;
	}

	/**
	 * Set the PHY receive Rate (expressed in Mbps) from this remote device.
	 *
	 * @since 2.0
	 * @param rxphyRate the input value
	 */
	public void  setRxphyRate(Long rxphyRate) {
		this.rxphyRate = rxphyRate;
	}

	/**
	 * Set the PHY receive Rate (expressed in Mbps) from this remote device.
	 *
	 * @since 2.0
	 * @param rxphyRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withRxphyRate(Long rxphyRate) {
		this.rxphyRate = rxphyRate;
		return this;
	}

	/**
	 * Get the {{list}} List items indicate Signal to Noise Ratio (SNR) per tone from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnrPerTone() {
		return snrPerTone;
	}

	/**
	 * Set the {{list}} List items indicate Signal to Noise Ratio (SNR) per tone from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param snrPerTone the input value
	 */
	public void  setSnrPerTone(Long snrPerTone) {
		this.snrPerTone = snrPerTone;
	}

	/**
	 * Set the {{list}} List items indicate Signal to Noise Ratio (SNR) per tone from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param snrPerTone the input value
	 * @return this instance
	 */
	public AssociatedDevice withSnrPerTone(Long snrPerTone) {
		this.snrPerTone = snrPerTone;
		return this;
	}

	/**
	 * Get average attenuation from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAvgAttenuation() {
		return avgAttenuation;
	}

	/**
	 * Set average attenuation from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param avgAttenuation the input value
	 */
	public void  setAvgAttenuation(Long avgAttenuation) {
		this.avgAttenuation = avgAttenuation;
	}

	/**
	 * Set average attenuation from this remote device (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param avgAttenuation the input value
	 * @return this instance
	 */
	public AssociatedDevice withAvgAttenuation(Long avgAttenuation) {
		this.avgAttenuation = avgAttenuation;
		return this;
	}

	/**
	 * Get the {{list}} List items represent MAC addresses of end stations bridged by the remote HomePlug device.

          For example: "11:22:33:AA:BB:CC, 22:33:44:DD:EE:66"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getEndStationMACs() {
		return endStationMACs;
	}

	/**
	 * Set the {{list}} List items represent MAC addresses of end stations bridged by the remote HomePlug device.

          For example: "11:22:33:AA:BB:CC, 22:33:44:DD:EE:66"
	 *
	 * @since 2.0
	 * @param endStationMACs the input value
	 */
	public void  setEndStationMACs(MACAddress endStationMACs) {
		this.endStationMACs = endStationMACs;
	}

	/**
	 * Set the {{list}} List items represent MAC addresses of end stations bridged by the remote HomePlug device.

          For example: "11:22:33:AA:BB:CC, 22:33:44:DD:EE:66"
	 *
	 * @since 2.0
	 * @param endStationMACs the input value
	 * @return this instance
	 */
	public AssociatedDevice withEndStationMACs(MACAddress endStationMACs) {
		this.endStationMACs = endStationMACs;
		return this;
	}

	/**
	 * Get the whether or not this device is currently present in the HomePlug network.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this device is currently present in the HomePlug network.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this device is currently present in the HomePlug network.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 * @return this instance
	 */
	public AssociatedDevice withActive(Boolean active) {
		this.active = active;
		return this;
	}

	//</editor-fold>

}