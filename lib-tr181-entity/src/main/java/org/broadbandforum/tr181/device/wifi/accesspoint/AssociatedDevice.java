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
package org.broadbandforum.tr181.device.wifi.accesspoint;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.wifi.accesspoint.associateddevice.Stats;

	/**
	 * A table of the devices currently associated with the access point.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.AccessPoint.{i}.AssociatedDevice.{i}.")
@XmlRootElement(name = "Device.WiFi.AccessPoint.AssociatedDevice")
@XmlType(name = "Device.WiFi.AccessPoint.AssociatedDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class AssociatedDevice {

	/**
	 * The MAC address of an associated device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MACAddress")
	@CWMPParameter(activeNotify = "canDeny")
	public MACAddress macAddress;
	/**
	 * The operating standard that this associated device is connected with.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "OperatingStandard")
	public String operatingStandard;
	/**
	 * Whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AuthenticationState")
	@CWMPParameter(activeNotify = "canDeny")
	public Boolean authenticationState;
	/**
	 * The data transmit rate in kbps that was most recently used for transmission from the access point to the associated device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastDataDownlinkRate")
	@CWMPParameter(activeNotify = "canDeny", units = "kbps")
	@Size(min = 1000, max = 600000)
	public Long lastDataDownlinkRate;
	/**
	 * The data transmit rate in kbps that was most recently used for transmission from the associated device to the access point.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastDataUplinkRate")
	@CWMPParameter(activeNotify = "canDeny", units = "kbps")
	@Size(min = 1000, max = 600000)
	public Long lastDataUplinkRate;
	/**
	 * An indicator of radio signal strength of the uplink from the associated device to the access point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SignalStrength")
	@Size(min = -200, max = 0)
	public Integer signalStrength;
	/**
	 * The number of packets that had to be re-transmitted, from the last 100 packets sent to the associated device. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Retransmissions")
	@Size(min = 0, max = 100)
	public Long retransmissions;
	/**
	 * Whether or not this node is currently present in the WiFi AccessPoint network.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * These count bytes or packets sent to, or received from, this Associated Device, which is a WiFi station associated to this access point. Packet counters here count 802.11 WiFi frames.

        The CPE MUST reset these {{object}} parameters (unless otherwise stated in individual object or parameter descriptions) either when the {{param|##.Status}} of the parent {{object|##}} object transitions from {{enum|Disabled|##.Status}} to {{enum|Enabled|##.Status}}, or when it transitions from {{enum|Enabled|##.Status}} to {{enum|Disabled|##.Status}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public AssociatedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the MAC address of an associated device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the MAC address of an associated device.
	 *
	 * @since 2.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the MAC address of an associated device.
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
	 * Get the operating standard that this associated device is connected with.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getOperatingStandard() {
		return operatingStandard;
	}

	/**
	 * Set the operating standard that this associated device is connected with.
	 *
	 * @since 2.10
	 * @param operatingStandard the input value
	 */
	public void  setOperatingStandard(String operatingStandard) {
		this.operatingStandard = operatingStandard;
	}

	/**
	 * Set the operating standard that this associated device is connected with.
	 *
	 * @since 2.10
	 * @param operatingStandard the input value
	 * @return this instance
	 */
	public AssociatedDevice withOperatingStandard(String operatingStandard) {
		this.operatingStandard = operatingStandard;
		return this;
	}

	/**
	 * Get the whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAuthenticationState() {
		return authenticationState;
	}

	/**
	 * Set the whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 2.0
	 * @param authenticationState the input value
	 */
	public void  setAuthenticationState(Boolean authenticationState) {
		this.authenticationState = authenticationState;
	}

	/**
	 * Set the whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 2.0
	 * @param authenticationState the input value
	 * @return this instance
	 */
	public AssociatedDevice withAuthenticationState(Boolean authenticationState) {
		this.authenticationState = authenticationState;
		return this;
	}

	/**
	 * Get the data transmit rate in kbps that was most recently used for transmission from the access point to the associated device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastDataDownlinkRate() {
		return lastDataDownlinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the access point to the associated device.
	 *
	 * @since 2.0
	 * @param lastDataDownlinkRate the input value
	 */
	public void  setLastDataDownlinkRate(Long lastDataDownlinkRate) {
		this.lastDataDownlinkRate = lastDataDownlinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the access point to the associated device.
	 *
	 * @since 2.0
	 * @param lastDataDownlinkRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withLastDataDownlinkRate(Long lastDataDownlinkRate) {
		this.lastDataDownlinkRate = lastDataDownlinkRate;
		return this;
	}

	/**
	 * Get the data transmit rate in kbps that was most recently used for transmission from the associated device to the access point.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastDataUplinkRate() {
		return lastDataUplinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the associated device to the access point.
	 *
	 * @since 2.0
	 * @param lastDataUplinkRate the input value
	 */
	public void  setLastDataUplinkRate(Long lastDataUplinkRate) {
		this.lastDataUplinkRate = lastDataUplinkRate;
	}

	/**
	 * Set the data transmit rate in kbps that was most recently used for transmission from the associated device to the access point.
	 *
	 * @since 2.0
	 * @param lastDataUplinkRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withLastDataUplinkRate(Long lastDataUplinkRate) {
		this.lastDataUplinkRate = lastDataUplinkRate;
		return this;
	}

	/**
	 * Get an indicator of radio signal strength of the uplink from the associated device to the access point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSignalStrength() {
		return signalStrength;
	}

	/**
	 * Set an indicator of radio signal strength of the uplink from the associated device to the access point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 * @param signalStrength the input value
	 */
	public void  setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}

	/**
	 * Set an indicator of radio signal strength of the uplink from the associated device to the access point, measured in dBm, as an average of the last 100 packets received from the device.
	 *
	 * @since 2.0
	 * @param signalStrength the input value
	 * @return this instance
	 */
	public AssociatedDevice withSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
		return this;
	}

	/**
	 * Get the number of packets that had to be re-transmitted, from the last 100 packets sent to the associated device. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRetransmissions() {
		return retransmissions;
	}

	/**
	 * Set the number of packets that had to be re-transmitted, from the last 100 packets sent to the associated device. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 * @param retransmissions the input value
	 */
	public void  setRetransmissions(Long retransmissions) {
		this.retransmissions = retransmissions;
	}

	/**
	 * Set the number of packets that had to be re-transmitted, from the last 100 packets sent to the associated device. Multiple re-transmissions of the same packet count as one.
	 *
	 * @since 2.0
	 * @param retransmissions the input value
	 * @return this instance
	 */
	public AssociatedDevice withRetransmissions(Long retransmissions) {
		this.retransmissions = retransmissions;
		return this;
	}

	/**
	 * Get the whether or not this node is currently present in the WiFi AccessPoint network.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this node is currently present in the WiFi AccessPoint network.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this node is currently present in the WiFi AccessPoint network.

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

	/**
	 * Get these count bytes or packets sent to, or received from, this Associated Device, which is a WiFi station associated to this access point. Packet counters here count 802.11 WiFi frames.

        The CPE MUST reset these {{object}} parameters (unless otherwise stated in individual object or parameter descriptions) either when the {{param|##.Status}} of the parent {{object|##}} object transitions from {{enum|Disabled|##.Status}} to {{enum|Enabled|##.Status}}, or when it transitions from {{enum|Enabled|##.Status}} to {{enum|Disabled|##.Status}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set these count bytes or packets sent to, or received from, this Associated Device, which is a WiFi station associated to this access point. Packet counters here count 802.11 WiFi frames.

        The CPE MUST reset these {{object}} parameters (unless otherwise stated in individual object or parameter descriptions) either when the {{param|##.Status}} of the parent {{object|##}} object transitions from {{enum|Disabled|##.Status}} to {{enum|Enabled|##.Status}}, or when it transitions from {{enum|Enabled|##.Status}} to {{enum|Disabled|##.Status}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set these count bytes or packets sent to, or received from, this Associated Device, which is a WiFi station associated to this access point. Packet counters here count 802.11 WiFi frames.

        The CPE MUST reset these {{object}} parameters (unless otherwise stated in individual object or parameter descriptions) either when the {{param|##.Status}} of the parent {{object|##}} object transitions from {{enum|Disabled|##.Status}} to {{enum|Enabled|##.Status}}, or when it transitions from {{enum|Enabled|##.Status}} to {{enum|Disabled|##.Status}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public AssociatedDevice withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}