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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.MACAddress;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wanethernetinterfaceconfig.Stats;

	/**
	 * This object models physical layer properties specific to a single Ethernet physical connection used for Internet access on a CPE.  This object is required for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANEthernetInterfaceConfig.")
@XmlRootElement(name = "WANEthernetInterfaceConfig")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANEthernetInterfaceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANEthernetInterfaceConfig {

	/**
	 * Enables or disables this interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The physical address of the interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddress")
	public MACAddress macAddress;
	/**
	 * The maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxBitRate")
	@CWMPParameter(access = "readWrite")
	public String maxBitRate;
	/**
	 * The duplex mode available to this connection.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DuplexMode")
	@CWMPParameter(access = "readWrite")
	public String duplexMode;
	/**
	 * Rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ShapingRate")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer shapingRate;
	/**
	 * Burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ShapingBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long shapingBurstSize;
	/**
	 * This object contains statistics for an Ethernet WAN interface on a CPE device.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public WANEthernetInterfaceConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this interface.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this interface.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of this interface.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the physical address of the interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the physical address of the interface.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the physical address of the interface.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(String maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum upstream and downstream bit rate available to this connection.
	 *
	 * @since 1.0
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withMaxBitRate(String maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the duplex mode available to this connection.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDuplexMode() {
		return duplexMode;
	}

	/**
	 * Set the duplex mode available to this connection.
	 *
	 * @since 1.0
	 * @param duplexMode the input value
	 */
	public void  setDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
	}

	/**
	 * Set the duplex mode available to this connection.
	 *
	 * @since 1.0
	 * @param duplexMode the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
		return this;
	}

	/**
	 * Get the rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getShapingRate() {
		return shapingRate;
	}

	/**
	 * Set the rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.4
	 * @param shapingRate the input value
	 */
	public void  setShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
	}

	/**
	 * Set the rate to shape this connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

If > 100, in bits per second.

A value of -1 indicates no shaping.

For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 1.4
	 * @param shapingRate the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
		return this;
	}

	/**
	 * Get the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getShapingBurstSize() {
		return shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.4
	 * @param shapingBurstSize the input value
	 */
	public void  setShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping) this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 1.4
	 * @param shapingBurstSize the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
		return this;
	}

	/**
	 * Get the this object contains statistics for an Ethernet WAN interface on a CPE device.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for an Ethernet WAN interface on a CPE device.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for an Ethernet WAN interface on a CPE device.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public WANEthernetInterfaceConfig withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}