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
package org.broadbandforum.tr181.device.qos;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Shaper table. Used to shape the queue(s) associated with {{param|Interface}}. In case of a single queue for that interface, determines the egress rate of the queue. In case of multiple queues for that interface (possibly with per queue shaping rates), determines the aggregate egress rate on that interface.

        For enabled table entries, if {{param|Interface}} is not a valid reference then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}} and disable the offending {{object}} row.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.QoS.Shaper.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"Interface"})})
@XmlRootElement(name = "Device.QoS.Shaper")
@XmlType(name = "Device.QoS.Shaper")
@XmlAccessorType(XmlAccessType.FIELD)
public class Shaper {

	/**
	 * Enables or disables this shaper.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this shaper.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}}The interface object associated with this ''Shaper'' entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Shapers'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Rate to shape the associated interface connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

          If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

          If > 100, in bits per second.

          A value of -1 indicates no shaping.

          For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ShapingRate")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer shapingRate;
	/**
	 * Burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ShapingBurstSize")
	@CWMPParameter(access = "readWrite")
	public Long shapingBurstSize;

	public Shaper() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this shaper.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this shaper.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this shaper.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Shaper withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this shaper.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this shaper.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this shaper.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Shaper withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public Shaper withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}}The interface object associated with this ''Shaper'' entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Shapers'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}}The interface object associated with this ''Shaper'' entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Shapers'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}}The interface object associated with this ''Shaper'' entry. It MAY be a layer 1, 2 or 3 interface, however, the types of interfaces for which ''Shapers'' can be instantiated is a local matter to the CPE.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Shaper with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the rate to shape the associated interface connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

          If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

          If > 100, in bits per second.

          A value of -1 indicates no shaping.

          For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getShapingRate() {
		return shapingRate;
	}

	/**
	 * Set the rate to shape the associated interface connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

          If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

          If > 100, in bits per second.

          A value of -1 indicates no shaping.

          For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 2.0
	 * @param shapingRate the input value
	 */
	public void  setShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
	}

	/**
	 * Set the rate to shape the associated interface connection's egress traffic to.  For leaky bucket (constant rate shaping), this is the constant rate.  For token bucket (variable rate shaping), this is the average rate.

          If <= 100, in percent of the rate of the highest rate-constrained layer over which the packet will travel on egress.

          If > 100, in bits per second.

          A value of -1 indicates no shaping.

          For example, for packets destined for a WAN DSL interface, if the ATM layer is rate-constrained, then the rate is calculated relative to this rate.  Otherwise, the rate is calculated relative to the physical-layer DSL rate.
	 *
	 * @since 2.0
	 * @param shapingRate the input value
	 * @return this instance
	 */
	public Shaper withShapingRate(Integer shapingRate) {
		this.shapingRate = shapingRate;
		return this;
	}

	/**
	 * Get the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getShapingBurstSize() {
		return shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 * @param shapingBurstSize the input value
	 */
	public void  setShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
	}

	/**
	 * Set the burst size in bytes.  For both leaky bucket (constant rate shaping) and token bucket (variable rate shaping)  this is the bucket size and is therefore the maximum burst size.
	 *
	 * @since 2.0
	 * @param shapingBurstSize the input value
	 * @return this instance
	 */
	public Shaper withShapingBurstSize(Long shapingBurstSize) {
		this.shapingBurstSize = shapingBurstSize;
		return this;
	}

	//</editor-fold>

}