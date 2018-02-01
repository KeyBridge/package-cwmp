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
package org.broadbandforum.tr143.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.internetgatewaydevice.layer2bridging.AvailableInterface;
import org.broadbandforum.tr143.internetgatewaydevice.layer2bridging.Bridge;
import org.broadbandforum.tr143.internetgatewaydevice.layer2bridging.Filter;
import org.broadbandforum.tr143.internetgatewaydevice.layer2bridging.Marking;

	/**
	 * Layer-2 bridging table.  Specifies bridges between layer-2 LAN and/or WAN interfaces.  Bridges can be defined to include layer-2 filter criteria to selectively bridge traffic between interfaces.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.")
public class Layer2Bridging {

	/**
	 * The maximum number of entries available in the {{object|Bridge}} table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxBridgeEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxBridgeEntries;
	/**
	 * The maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxFilterEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxFilterEntries;
	/**
	 * The maximum number of entries available in the {{object|Marking}} table.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "MaxMarkingEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxMarkingEntries;
	/**
	 * Bridge table.
	 */
	@XmlElementWrapper(name = "Bridges")
	@XmlElement(name = "Bridge")
	@CWMPParameter(access = "readWrite")
	public Collection<Bridge> bridges;
	/**
	 * Filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.
	 */
	@XmlElementWrapper(name = "Filters")
	@XmlElement(name = "Filter")
	@CWMPParameter(access = "readWrite")
	public Collection<Filter> filters;
	/**
	 * Marking table identifying non-default layer-2 marking behavior for packets on egress from the specified interfaces.
	 */
	@XmlElementWrapper(name = "Markings")
	@XmlElement(name = "Marking")
	@CWMPParameter(access = "readWrite")
	public Collection<Marking> markings;
	/**
	 * Table containing all LAN and WAN interfaces that are available to be referenced by the ''Bridge'' table.  Only interfaces that can carry layer-2 bridged traffic are included.
	 */
	@XmlElementWrapper(name = "AvailableInterfaces")
	@XmlElement(name = "AvailableInterface")
	public Collection<AvailableInterface> availableInterfaces;

	public Layer2Bridging() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries available in the {{object|Bridge}} table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxBridgeEntries() {
		return maxBridgeEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Bridge}} table.
	 *
	 * @since 1.1
	 * @param maxBridgeEntries the input value
	 */
	public void  setMaxBridgeEntries(Long maxBridgeEntries) {
		this.maxBridgeEntries = maxBridgeEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Bridge}} table.
	 *
	 * @since 1.1
	 * @param maxBridgeEntries the input value
	 * @return this instance
	 */
	public Layer2Bridging withMaxBridgeEntries(Long maxBridgeEntries) {
		this.maxBridgeEntries = maxBridgeEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxFilterEntries() {
		return maxFilterEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 1.1
	 * @param maxFilterEntries the input value
	 */
	public void  setMaxFilterEntries(Long maxFilterEntries) {
		this.maxFilterEntries = maxFilterEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 1.1
	 * @param maxFilterEntries the input value
	 * @return this instance
	 */
	public Layer2Bridging withMaxFilterEntries(Long maxFilterEntries) {
		this.maxFilterEntries = maxFilterEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Marking}} table.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getMaxMarkingEntries() {
		return maxMarkingEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Marking}} table.
	 *
	 * @since 1.1
	 * @param maxMarkingEntries the input value
	 */
	public void  setMaxMarkingEntries(Long maxMarkingEntries) {
		this.maxMarkingEntries = maxMarkingEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Marking}} table.
	 *
	 * @since 1.1
	 * @param maxMarkingEntries the input value
	 * @return this instance
	 */
	public Layer2Bridging withMaxMarkingEntries(Long maxMarkingEntries) {
		this.maxMarkingEntries = maxMarkingEntries;
		return this;
	}

	/**
	 * Get the bridge table.
	 *
	 * @return the value
	 */
	public Collection<Bridge> getBridges() {
		if (this.bridges == null){ this.bridges=new ArrayList<>();}
		return bridges;
	}

	/**
	 * Set the bridge table.
	 *
	 * @param bridges the input value
	 */
	public void  setBridges(Collection<Bridge> bridges) {
		this.bridges = bridges;
	}

	/**
	 * Set the bridge table.
	 *
	 * @param bridge the input value
	 * @return this instance
	 */
	public Layer2Bridging withBridge(Bridge bridge) {
		getBridges().add(bridge);
		return this;
	}

	/**
	 * Get the filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.
	 *
	 * @return the value
	 */
	public Collection<Filter> getFilters() {
		if (this.filters == null){ this.filters=new ArrayList<>();}
		return filters;
	}

	/**
	 * Set the filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.
	 *
	 * @param filters the input value
	 */
	public void  setFilters(Collection<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * Set the filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.
	 *
	 * @param filter the input value
	 * @return this instance
	 */
	public Layer2Bridging withFilter(Filter filter) {
		getFilters().add(filter);
		return this;
	}

	/**
	 * Get the marking table identifying non-default layer-2 marking behavior for packets on egress from the specified interfaces.
	 *
	 * @return the value
	 */
	public Collection<Marking> getMarkings() {
		if (this.markings == null){ this.markings=new ArrayList<>();}
		return markings;
	}

	/**
	 * Set the marking table identifying non-default layer-2 marking behavior for packets on egress from the specified interfaces.
	 *
	 * @param markings the input value
	 */
	public void  setMarkings(Collection<Marking> markings) {
		this.markings = markings;
	}

	/**
	 * Set the marking table identifying non-default layer-2 marking behavior for packets on egress from the specified interfaces.
	 *
	 * @param marking the input value
	 * @return this instance
	 */
	public Layer2Bridging withMarking(Marking marking) {
		getMarkings().add(marking);
		return this;
	}

	/**
	 * Get the table containing all LAN and WAN interfaces that are available to be referenced by the ''Bridge'' table.  Only interfaces that can carry layer-2 bridged traffic are included.
	 *
	 * @return the value
	 */
	public Collection<AvailableInterface> getAvailableInterfaces() {
		if (this.availableInterfaces == null){ this.availableInterfaces=new ArrayList<>();}
		return availableInterfaces;
	}

	/**
	 * Set the table containing all LAN and WAN interfaces that are available to be referenced by the ''Bridge'' table.  Only interfaces that can carry layer-2 bridged traffic are included.
	 *
	 * @param availableInterfaces the input value
	 */
	public void  setAvailableInterfaces(Collection<AvailableInterface> availableInterfaces) {
		this.availableInterfaces = availableInterfaces;
	}

	/**
	 * Set the table containing all LAN and WAN interfaces that are available to be referenced by the ''Bridge'' table.  Only interfaces that can carry layer-2 bridged traffic are included.
	 *
	 * @param availableInterface the input value
	 * @return this instance
	 */
	public Layer2Bridging withAvailableInterface(AvailableInterface availableInterface) {
		getAvailableInterfaces().add(availableInterface);
		return this;
	}

	//</editor-fold>

}