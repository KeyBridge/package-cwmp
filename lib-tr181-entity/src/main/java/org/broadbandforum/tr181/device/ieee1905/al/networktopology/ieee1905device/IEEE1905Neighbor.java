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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.ieee1905neighbor.Metric;

	/**
	 * This object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values are from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-15: 1905 neighbor device TLV}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.IEEE1905Neighbor.{i}.")
public class IEEE1905Neighbor {

	/**
	 * {{reference}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LocalInterface")
	@Size(max = 256)
	public String localInterface;
	/**
	 * 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NeighborDeviceId")
	public MACAddress neighborDeviceId;
	/**
	 * This object represents the metrics included in a Link metric response from the IEEE1905Device where {{param|#.LocalInterface}} is the MAC address of an interface in the receiving 1905 AL as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV}}.
	 */
	@XmlElementWrapper(name = "metrics")
	@XmlElement(name = "Metric")
	public Collection<Metric> metrics;

	public IEEE1905Neighbor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{reference}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getLocalInterface() {
		return localInterface;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.9
	 * @param localInterface the input value
	 */
	public void  setLocalInterface(String localInterface) {
		this.localInterface = localInterface;
	}

	/**
	 * Set the {{reference}}
	 *
	 * @since 2.9
	 * @param localInterface the input value
	 * @return this instance
	 */
	public IEEE1905Neighbor withLocalInterface(String localInterface) {
		this.localInterface = localInterface;
		return this;
	}

	/**
	 * Get the 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getNeighborDeviceId() {
		return neighborDeviceId;
	}

	/**
	 * Set the 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 * @param neighborDeviceId the input value
	 */
	public void  setNeighborDeviceId(MACAddress neighborDeviceId) {
		this.neighborDeviceId = neighborDeviceId;
	}

	/**
	 * Set the 1905 AL MAC Address of the Neighbor.
	 *
	 * @since 2.9
	 * @param neighborDeviceId the input value
	 * @return this instance
	 */
	public IEEE1905Neighbor withNeighborDeviceId(MACAddress neighborDeviceId) {
		this.neighborDeviceId = neighborDeviceId;
		return this;
	}

	/**
	 * Get the this object represents the metrics included in a Link metric response from the IEEE1905Device where {{param|#.LocalInterface}} is the MAC address of an interface in the receiving 1905 AL as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV}}.
	 *
	 * @return the value
	 */
	public Collection<Metric> getMetrics() {
		if (this.metrics == null){ this.metrics=new ArrayList<>();}
		return metrics;
	}

	/**
	 * Set the this object represents the metrics included in a Link metric response from the IEEE1905Device where {{param|#.LocalInterface}} is the MAC address of an interface in the receiving 1905 AL as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV}}.
	 *
	 * @param metrics the input value
	 */
	public void  setMetrics(Collection<Metric> metrics) {
		this.metrics = metrics;
	}

	/**
	 * Set the this object represents the metrics included in a Link metric response from the IEEE1905Device where {{param|#.LocalInterface}} is the MAC address of an interface in the receiving 1905 AL as defined in {{bibref|IEEE1905.1a|Table 6-17: 1905 transmitter link metric TLV}}.
	 *
	 * @param metric the input value
	 * @return this instance
	 */
	public IEEE1905Neighbor withMetric(Metric metric) {
		getMetrics().add(metric);
		return this;
	}

	//</editor-fold>

}