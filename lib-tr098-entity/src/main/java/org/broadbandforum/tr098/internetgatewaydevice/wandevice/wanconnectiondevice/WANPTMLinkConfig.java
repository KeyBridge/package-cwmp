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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.MACAddress;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanconnectiondevice.wanptmlinkconfig.Stats;

	/**
	 * This object models the PTM layer properties specific to a layer 2 interface of a DSL modem used for Internet access on a CPE.  This object is intended for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*LinkConfig'' object within a given ''WANConnectionDevice'' instance. 

The PTM Link Layer object exists when the ''WANDSLInterfaceConfig'' ''LinkEncapsulationSupported'' parameter includes any of:

* ''G.992.3_Annex_K_PTM''

* ''G.993.2_Annex_K_PTM''

* ''G.994.1''
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPTMLinkConfig.")
public class WANPTMLinkConfig {

	/**
	 * Enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Status of the link.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LinkStatus")
	public String linkStatus;
	/**
	 * The physical address of the interface.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * This object represents the statistics collected and returned over a PTM link.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public WANPTMLinkConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the link.  On creation of a ''WANConnectionDevice'', this object is disabled by default.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public WANPTMLinkConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the link.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getLinkStatus() {
		return linkStatus;
	}

	/**
	 * Set the status of the link.
	 *
	 * @since 1.4
	 * @param linkStatus the input value
	 */
	public void  setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	/**
	 * Set the status of the link.
	 *
	 * @since 1.4
	 * @param linkStatus the input value
	 * @return this instance
	 */
	public WANPTMLinkConfig withLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
		return this;
	}

	/**
	 * Get the physical address of the interface.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the physical address of the interface.
	 *
	 * @since 1.4
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the physical address of the interface.
	 *
	 * @since 1.4
	 * @param macAddress the input value
	 * @return this instance
	 */
	public WANPTMLinkConfig withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the this object represents the statistics collected and returned over a PTM link.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object represents the statistics collected and returned over a PTM link.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object represents the statistics collected and returned over a PTM link.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public WANPTMLinkConfig withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}