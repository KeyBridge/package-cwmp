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
package org.broadbandforum.tr181.device.ieee1905.al;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This object represents the detected Network Registrars detection function for the IEEE 1905 network. They are determined by received AP-autoconfiguration response messages with Registrar role, with supported band as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}}
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkingRegistrar.")
public class NetworkingRegistrar {

	/**
	 * {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 2.4 GHz.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Registrar2dot4")
	public MACAddress registrar2dot4;
	/**
	 * {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 5 GHz.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Registrar5")
	public MACAddress registrar5;
	/**
	 * {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 60 GHz.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Registrar60")
	public MACAddress registrar60;

	public NetworkingRegistrar() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 2.4 GHz.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getRegistrar2dot4() {
		return registrar2dot4;
	}

	/**
	 * Set the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 2.4 GHz.
	 *
	 * @since 2.9
	 * @param registrar2dot4 the input value
	 */
	public void  setRegistrar2dot4(MACAddress registrar2dot4) {
		this.registrar2dot4 = registrar2dot4;
	}

	/**
	 * Set the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 2.4 GHz.
	 *
	 * @since 2.9
	 * @param registrar2dot4 the input value
	 * @return this instance
	 */
	public NetworkingRegistrar withRegistrar2dot4(MACAddress registrar2dot4) {
		this.registrar2dot4 = registrar2dot4;
		return this;
	}

	/**
	 * Get the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 5 GHz.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getRegistrar5() {
		return registrar5;
	}

	/**
	 * Set the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 5 GHz.
	 *
	 * @since 2.9
	 * @param registrar5 the input value
	 */
	public void  setRegistrar5(MACAddress registrar5) {
		this.registrar5 = registrar5;
	}

	/**
	 * Set the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 5 GHz.
	 *
	 * @since 2.9
	 * @param registrar5 the input value
	 * @return this instance
	 */
	public NetworkingRegistrar withRegistrar5(MACAddress registrar5) {
		this.registrar5 = registrar5;
		return this;
	}

	/**
	 * Get the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 60 GHz.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getRegistrar60() {
		return registrar60;
	}

	/**
	 * Set the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 60 GHz.
	 *
	 * @since 2.9
	 * @param registrar60 the input value
	 */
	public void  setRegistrar60(MACAddress registrar60) {
		this.registrar60 = registrar60;
	}

	/**
	 * Set the {{list}} 1905 AL MAC addresses as determined by source MAC address in received AP-autoconfiguration response messages with supported frequency band of 802.11 60 GHz.
	 *
	 * @since 2.9
	 * @param registrar60 the input value
	 * @return this instance
	 */
	public NetworkingRegistrar withRegistrar60(MACAddress registrar60) {
		this.registrar60 = registrar60;
		return this;
	}

	//</editor-fold>

}