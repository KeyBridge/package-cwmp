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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.AvailableInterface;
import org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.Bridge;
import org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.Filter;
import org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.Marking;

	/**
	 * Layer 2 bridging configuration.  Specifies bridges between layer 2 LAN and/or WAN interfaces.  Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} bridges.  Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled. 

If the Layer2Bridging object is implemented, the view that it provides of the CPE's underlying bridging configuration MUST be consistent with the view provided by any LANDevice and WAN**Connection objects.  The implications of this are explained in Annex A.6.
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
	 * The maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1D.

There is no guarantee that this many 802.1D Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MaxDBridgeEntries")
	public Long maxDBridgeEntries;
	/**
	 * The maximum number of 802.1Q {{bibref|802.1Q-2005}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1Q.

There is no guarantee that this many 802.1Q Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MaxQBridgeEntries")
	public Long maxQBridgeEntries;
	/**
	 * The maximum number of 802.1Q {{bibref|802.1Q-2005}} VLANs supported per {{object|Bridge}} table entry.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MaxVLANEntries")
	public Long maxVLANEntries;
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
	 * Bridge table.  Each entry in this table represents a single physical 802.1D {{bibref|802.1D-2004}} or 802.1Q {{bibref|802.1Q-2005}} bridge.

If the Bridge Port table is supported, it explicitly defines the Bridge's interfaces.  Otherwise, they are implicitly defined via the union of the FilterInterface / MarkingInterface parameters for all the Filter and Marking table entries that are associated with the Bridge.
	 */
	@XmlElementWrapper(name = "Bridges")
	@XmlElement(name = "Bridge")
	@CWMPParameter(access = "readWrite")
	public Collection<Bridge> bridges;
	/**
	 * Filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.

For both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# If the Bridge Port table is not supported, it implicitly specifies the Bridge interfaces (in collaboration with the Marking table).

# It specifies destination MAC address classification rules.

For an 802.1Q Bridge, this table is also used for the following:

# For each VLAN ID, it specifies the interfaces that are in the VLAN's Member Set.

# If the Bridge Port table is not supported, it specifies the Port VLAN ID (PVID) for each interface.

This table also supports several concepts that are not covered by either 802.1D or 802.1Q:

# It allows a given packet to be admitted to multiple Bridges.

# It supports Ethertype and source MAC address classification rules.
	 */
	@XmlElementWrapper(name = "Filters")
	@XmlElement(name = "Filter")
	@CWMPParameter(access = "readWrite")
	public Collection<Filter> filters;
	/**
	 * Marking table identifying non-default layer 2 marking behavior for packets on egress from the specified interfaces.

This table is not relevant to 802.1D {{bibref|802.1D-2004}} Bridges, which are not VLAN-aware.

For 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# It specifies whether VLAN tags are to be removed on egress.

This table also supports several concepts that are not covered by 802.1Q:

# It allows the VLAN ID to be changed on egress.

# It allows the Ethernet Priority to be changed on egress.
	 */
	@XmlElementWrapper(name = "Markings")
	@XmlElement(name = "Marking")
	@CWMPParameter(access = "readWrite")
	public Collection<Marking> markings;
	/**
	 * Table containing all LAN and WAN interfaces that are available to be referenced by the Bridge table.  Only interfaces that can carry layer 2 bridged traffic are included.
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
	 * Get the maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1D.

There is no guarantee that this many 802.1D Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getMaxDBridgeEntries() {
		return maxDBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1D.

There is no guarantee that this many 802.1D Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 * @param maxDBridgeEntries the input value
	 */
	public void  setMaxDBridgeEntries(Long maxDBridgeEntries) {
		this.maxDBridgeEntries = maxDBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1D.

There is no guarantee that this many 802.1D Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 * @param maxDBridgeEntries the input value
	 * @return this instance
	 */
	public Layer2Bridging withMaxDBridgeEntries(Long maxDBridgeEntries) {
		this.maxDBridgeEntries = maxDBridgeEntries;
		return this;
	}

	/**
	 * Get the maximum number of 802.1Q {{bibref|802.1Q-2005}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1Q.

There is no guarantee that this many 802.1Q Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getMaxQBridgeEntries() {
		return maxQBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2005}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1Q.

There is no guarantee that this many 802.1Q Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 * @param maxQBridgeEntries the input value
	 */
	public void  setMaxQBridgeEntries(Long maxQBridgeEntries) {
		this.maxQBridgeEntries = maxQBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2005}} entries available in the {{object|Bridge}} table.  A positive value for this parameter implies support for 802.1Q.

There is no guarantee that this many 802.1Q Bridges can be configured.  For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 1.4
	 * @param maxQBridgeEntries the input value
	 * @return this instance
	 */
	public Layer2Bridging withMaxQBridgeEntries(Long maxQBridgeEntries) {
		this.maxQBridgeEntries = maxQBridgeEntries;
		return this;
	}

	/**
	 * Get the maximum number of 802.1Q {{bibref|802.1Q-2005}} VLANs supported per {{object|Bridge}} table entry.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getMaxVLANEntries() {
		return maxVLANEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2005}} VLANs supported per {{object|Bridge}} table entry.
	 *
	 * @since 1.4
	 * @param maxVLANEntries the input value
	 */
	public void  setMaxVLANEntries(Long maxVLANEntries) {
		this.maxVLANEntries = maxVLANEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2005}} VLANs supported per {{object|Bridge}} table entry.
	 *
	 * @since 1.4
	 * @param maxVLANEntries the input value
	 * @return this instance
	 */
	public Layer2Bridging withMaxVLANEntries(Long maxVLANEntries) {
		this.maxVLANEntries = maxVLANEntries;
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
	 * Get the bridge table.  Each entry in this table represents a single physical 802.1D {{bibref|802.1D-2004}} or 802.1Q {{bibref|802.1Q-2005}} bridge.

If the Bridge Port table is supported, it explicitly defines the Bridge's interfaces.  Otherwise, they are implicitly defined via the union of the FilterInterface / MarkingInterface parameters for all the Filter and Marking table entries that are associated with the Bridge.
	 *
	 * @return the value
	 */
	public Collection<Bridge> getBridges() {
		if (this.bridges == null){ this.bridges=new ArrayList<>();}
		return bridges;
	}

	/**
	 * Set the bridge table.  Each entry in this table represents a single physical 802.1D {{bibref|802.1D-2004}} or 802.1Q {{bibref|802.1Q-2005}} bridge.

If the Bridge Port table is supported, it explicitly defines the Bridge's interfaces.  Otherwise, they are implicitly defined via the union of the FilterInterface / MarkingInterface parameters for all the Filter and Marking table entries that are associated with the Bridge.
	 *
	 * @param bridges the input value
	 */
	public void  setBridges(Collection<Bridge> bridges) {
		this.bridges = bridges;
	}

	/**
	 * Set the bridge table.  Each entry in this table represents a single physical 802.1D {{bibref|802.1D-2004}} or 802.1Q {{bibref|802.1Q-2005}} bridge.

If the Bridge Port table is supported, it explicitly defines the Bridge's interfaces.  Otherwise, they are implicitly defined via the union of the FilterInterface / MarkingInterface parameters for all the Filter and Marking table entries that are associated with the Bridge.
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

For both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# If the Bridge Port table is not supported, it implicitly specifies the Bridge interfaces (in collaboration with the Marking table).

# It specifies destination MAC address classification rules.

For an 802.1Q Bridge, this table is also used for the following:

# For each VLAN ID, it specifies the interfaces that are in the VLAN's Member Set.

# If the Bridge Port table is not supported, it specifies the Port VLAN ID (PVID) for each interface.

This table also supports several concepts that are not covered by either 802.1D or 802.1Q:

# It allows a given packet to be admitted to multiple Bridges.

# It supports Ethertype and source MAC address classification rules.
	 *
	 * @return the value
	 */
	public Collection<Filter> getFilters() {
		if (this.filters == null){ this.filters=new ArrayList<>();}
		return filters;
	}

	/**
	 * Set the filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.

For both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# If the Bridge Port table is not supported, it implicitly specifies the Bridge interfaces (in collaboration with the Marking table).

# It specifies destination MAC address classification rules.

For an 802.1Q Bridge, this table is also used for the following:

# For each VLAN ID, it specifies the interfaces that are in the VLAN's Member Set.

# If the Bridge Port table is not supported, it specifies the Port VLAN ID (PVID) for each interface.

This table also supports several concepts that are not covered by either 802.1D or 802.1Q:

# It allows a given packet to be admitted to multiple Bridges.

# It supports Ethertype and source MAC address classification rules.
	 *
	 * @param filters the input value
	 */
	public void  setFilters(Collection<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * Set the filter table containing filter entries each of which is associated with one Bridge as specified by a ''Bridge'' table entry.

For both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# If the Bridge Port table is not supported, it implicitly specifies the Bridge interfaces (in collaboration with the Marking table).

# It specifies destination MAC address classification rules.

For an 802.1Q Bridge, this table is also used for the following:

# For each VLAN ID, it specifies the interfaces that are in the VLAN's Member Set.

# If the Bridge Port table is not supported, it specifies the Port VLAN ID (PVID) for each interface.

This table also supports several concepts that are not covered by either 802.1D or 802.1Q:

# It allows a given packet to be admitted to multiple Bridges.

# It supports Ethertype and source MAC address classification rules.
	 *
	 * @param filter the input value
	 * @return this instance
	 */
	public Layer2Bridging withFilter(Filter filter) {
		getFilters().add(filter);
		return this;
	}

	/**
	 * Get the marking table identifying non-default layer 2 marking behavior for packets on egress from the specified interfaces.

This table is not relevant to 802.1D {{bibref|802.1D-2004}} Bridges, which are not VLAN-aware.

For 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# It specifies whether VLAN tags are to be removed on egress.

This table also supports several concepts that are not covered by 802.1Q:

# It allows the VLAN ID to be changed on egress.

# It allows the Ethernet Priority to be changed on egress.
	 *
	 * @return the value
	 */
	public Collection<Marking> getMarkings() {
		if (this.markings == null){ this.markings=new ArrayList<>();}
		return markings;
	}

	/**
	 * Set the marking table identifying non-default layer 2 marking behavior for packets on egress from the specified interfaces.

This table is not relevant to 802.1D {{bibref|802.1D-2004}} Bridges, which are not VLAN-aware.

For 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# It specifies whether VLAN tags are to be removed on egress.

This table also supports several concepts that are not covered by 802.1Q:

# It allows the VLAN ID to be changed on egress.

# It allows the Ethernet Priority to be changed on egress.
	 *
	 * @param markings the input value
	 */
	public void  setMarkings(Collection<Marking> markings) {
		this.markings = markings;
	}

	/**
	 * Set the marking table identifying non-default layer 2 marking behavior for packets on egress from the specified interfaces.

This table is not relevant to 802.1D {{bibref|802.1D-2004}} Bridges, which are not VLAN-aware.

For 802.1Q {{bibref|802.1Q-2005}} Bridges, this table is used for the following:

# It specifies whether VLAN tags are to be removed on egress.

This table also supports several concepts that are not covered by 802.1Q:

# It allows the VLAN ID to be changed on egress.

# It allows the Ethernet Priority to be changed on egress.
	 *
	 * @param marking the input value
	 * @return this instance
	 */
	public Layer2Bridging withMarking(Marking marking) {
		getMarkings().add(marking);
		return this;
	}

	/**
	 * Get the table containing all LAN and WAN interfaces that are available to be referenced by the Bridge table.  Only interfaces that can carry layer 2 bridged traffic are included.
	 *
	 * @return the value
	 */
	public Collection<AvailableInterface> getAvailableInterfaces() {
		if (this.availableInterfaces == null){ this.availableInterfaces=new ArrayList<>();}
		return availableInterfaces;
	}

	/**
	 * Set the table containing all LAN and WAN interfaces that are available to be referenced by the Bridge table.  Only interfaces that can carry layer 2 bridged traffic are included.
	 *
	 * @param availableInterfaces the input value
	 */
	public void  setAvailableInterfaces(Collection<AvailableInterface> availableInterfaces) {
		this.availableInterfaces = availableInterfaces;
	}

	/**
	 * Set the table containing all LAN and WAN interfaces that are available to be referenced by the Bridge table.  Only interfaces that can carry layer 2 bridged traffic are included.
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