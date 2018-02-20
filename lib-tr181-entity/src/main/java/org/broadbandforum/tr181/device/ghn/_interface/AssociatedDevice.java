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
package org.broadbandforum.tr181.device.ghn._interface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.MACAddress;

	/**
	 * This table contains information about other G.hn devices connected to this G.hn interface.
	 *
	 * @since TR181 v2.4
	 */
@CWMPObject(name = "Device.Ghn.Interface.{i}.AssociatedDevice.{i}.", uniqueConstraints = {@CWMPUnique(names = {"MACAddress"})})
@XmlRootElement(name = "Device.Ghn.Interface.AssociatedDevice")
@XmlType(name = "Device.Ghn.Interface.AssociatedDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class AssociatedDevice {

	/**
	 * MAC address of remote G.hn device.

          This is denoted as REGID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * Device Id (as defined in G.hn) for the remote G.hn device, denoted as DEVICE_ID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "DeviceId")
	public Long deviceId;
	/**
	 * The PHY transmit Rate (expressed in Mbps) to this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "TxPhyRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Mbps")
	public Long txphyRate;
	/**
	 * The PHY receive Rate (expressed in Mbps) from this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "RxPhyRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Mbps")
	public Long rxphyRate;
	/**
	 * Whether or not this device is currently present in the G.hn domain.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.

          If {{param}} is {{true}}, it indicates that the Status of the remote device is 0, 1, or 2 (see {{bibref|G.9961|Table 7-3}}).
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Active")
	public Boolean active;

	public AssociatedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac address of remote G.hn device.

          This is denoted as REGID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the mac address of remote G.hn device.

          This is denoted as REGID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the mac address of remote G.hn device.

          This is denoted as REGID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @param macAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the device Id (as defined in G.hn) for the remote G.hn device, denoted as DEVICE_ID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getDeviceId() {
		return deviceId;
	}

	/**
	 * Set the device Id (as defined in G.hn) for the remote G.hn device, denoted as DEVICE_ID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @param deviceId the input value
	 */
	public void  setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * Set the device Id (as defined in G.hn) for the remote G.hn device, denoted as DEVICE_ID in {{bibref|G.9961}}.
	 *
	 * @since 2.4
	 * @param deviceId the input value
	 * @return this instance
	 */
	public AssociatedDevice withDeviceId(Long deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	/**
	 * Get the PHY transmit Rate (expressed in Mbps) to this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getTxphyRate() {
		return txphyRate;
	}

	/**
	 * Set the PHY transmit Rate (expressed in Mbps) to this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 * @param txphyRate the input value
	 */
	public void  setTxphyRate(Long txphyRate) {
		this.txphyRate = txphyRate;
	}

	/**
	 * Set the PHY transmit Rate (expressed in Mbps) to this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 * @param txphyRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withTxphyRate(Long txphyRate) {
		this.txphyRate = txphyRate;
		return this;
	}

	/**
	 * Get the PHY receive Rate (expressed in Mbps) from this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getRxphyRate() {
		return rxphyRate;
	}

	/**
	 * Set the PHY receive Rate (expressed in Mbps) from this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 * @param rxphyRate the input value
	 */
	public void  setRxphyRate(Long rxphyRate) {
		this.rxphyRate = rxphyRate;
	}

	/**
	 * Set the PHY receive Rate (expressed in Mbps) from this remote device, denoted as PHY data rate in {{bibref|G.9961}}.

          Refer to Note 1 of {{bibref|G.9961|Table 8-48}}.  To convert from the value in the table, divide by 32K (32768) and round down.
	 *
	 * @since 2.4
	 * @param rxphyRate the input value
	 * @return this instance
	 */
	public AssociatedDevice withRxphyRate(Long rxphyRate) {
		this.rxphyRate = rxphyRate;
		return this;
	}

	/**
	 * Get the whether or not this device is currently present in the G.hn domain.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.

          If {{param}} is {{true}}, it indicates that the Status of the remote device is 0, 1, or 2 (see {{bibref|G.9961|Table 7-3}}).
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not this device is currently present in the G.hn domain.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.

          If {{param}} is {{true}}, it indicates that the Status of the remote device is 0, 1, or 2 (see {{bibref|G.9961|Table 7-3}}).
	 *
	 * @since 2.4
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not this device is currently present in the G.hn domain.

          The ability to list inactive nodes is OPTIONAL. If the CPE includes inactive nodes in this table, {{param}} MUST be set to {{false}} for each inactive node. The length of time an inactive node remains listed in this table is a local matter to the CPE.

          If {{param}} is {{true}}, it indicates that the Status of the remote device is 0, 1, or 2 (see {{bibref|G.9961|Table 7-3}}).
	 *
	 * @since 2.4
	 * @param active the input value
	 * @return this instance
	 */
	public AssociatedDevice withActive(Boolean active) {
		this.active = active;
		return this;
	}

	//</editor-fold>

}