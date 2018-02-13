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
package org.broadbandforum.tr181.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.bridging.Bridge;
import org.broadbandforum.tr181.device.bridging.Filter;
import org.broadbandforum.tr181.device.bridging.ProviderBridge;

	/**
	 * Layer 2 bridging configuration. Specifies bridges between different layer 2 interfaces. Bridges can be defined to include layer 2 filter criteria to selectively bridge traffic between interfaces.

        This object can be used to configure both 802.1D {{bibref|802.1D-2004}} and 802.1Q {{bibref|802.1Q-2011}} bridges.

        Not all 802.1D and 802.1Q features are modeled, and some additional features not present in either 802.1D or 802.1Q are modeled.

        802.1Q {{bibref|802.1Q-2011}} bridges incorporate 802.1Q {{bibref|802.1Q-2005}} customer and 802.1ad {{bibref|802.1ad-2005}} provider bridges.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Bridging.")
@XmlRootElement(name = "Bridging")
@XmlType(name = "Device.Bridging")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bridging {

	/**
	 * The maximum number of entries available in the {{object|.Bridging.Bridge}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBridgeEntries")
	public Long maxBridgeEntries;
	/**
	 * The maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|.Bridging.Bridge}} table.  A positive value for this parameter implies support for 802.1D.

          There is no guarantee that this many 802.1D Bridges can be configured. For example, the CPE might not be able simultaneously to  support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxDBridgeEntries")
	public Long maxDBridgeEntries;
	/**
	 * The maximum number of 802.1Q {{bibref|802.1Q-2011}} entries available in the {{object|.Bridging.Bridge}} table. A non-zero value for this parameter implies support for 802.1Q.

          There is no guarantee that this many 802.1Q Bridges can be configured. For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxQBridgeEntries")
	public Long maxQBridgeEntries;
	/**
	 * The maximum number of 802.1Q {{bibref|802.1Q-2011}} VLANs supported per {{object|.Bridging.Bridge}} table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxVLANEntries")
	public Long maxVLANEntries;
	/**
	 * The maximum number of entries available in the {{object|.Bridging.ProviderBridge}} table. A non-zero value for this parameter implies support for 802.1Q Provider Bridges.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MaxProviderBridgeEntries")
	public Long maxProviderBridgeEntries;
	/**
	 * The maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFilterEntries")
	@CWMPParameter(activeNotify = "canDeny")
	public Long maxFilterEntries;
	/**
	 * Bridge table.
	 */
	@XmlElementWrapper(name = "Bridges")
	@XmlElement(name = "Bridge")
	@CWMPParameter(access = "readWrite")
	public Collection<Bridge> bridges;
	/**
	 * Filter table containing classification filter entries, each of which expresses a set of classification criterion to classify ingress frames as member of a {{object|#.Bridge}} instance or a {{object|#.Bridge.{i}.VLAN}} instance.

        Bridge VLAN classification only applies for 802.1Q {{bibref|802.1Q-2011}} Bridges.

        For enabled table entries, if {{param|Bridge}} or {{param|Interface}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as filter criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 */
	@XmlElementWrapper(name = "Filters")
	@XmlElement(name = "Filter")
	@CWMPParameter(access = "readWrite")
	public Collection<Filter> filters;
	/**
	 * Provider Bridge table.

        A Provider Bridge is described in {{bibref|802.1Q-2011|section 5.10 Provider Bridge conformance}} as an entity that is comprised of one S-VLAN component and zero or more C-VLAN components. S-VLAN and C-VLAN components are modelled as instances of {{object|#.Bridge}} objects.

        When {{param|Type}} is configured with value of {{enum|PE|Type}} VLAN tags from the S-VLAN component (outer of 2 VLAN tags) are stacked on top of the VLAN tag from the C-VLAN component (inner of 2 VLAN tags).

        When {{param|Type}} is configured with value of {{enum|S-VLAN|Type}} only VLAN tags from the S-VLAN component are utilized.
	 */
	@XmlElementWrapper(name = "ProviderBridges")
	@XmlElement(name = "ProviderBridge")
	@CWMPParameter(access = "readWrite")
	public Collection<ProviderBridge> providerBridges;

	public Bridging() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries available in the {{object|.Bridging.Bridge}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBridgeEntries() {
		return maxBridgeEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.Bridging.Bridge}} table.
	 *
	 * @since 2.0
	 * @param maxBridgeEntries the input value
	 */
	public void  setMaxBridgeEntries(Long maxBridgeEntries) {
		this.maxBridgeEntries = maxBridgeEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.Bridging.Bridge}} table.
	 *
	 * @since 2.0
	 * @param maxBridgeEntries the input value
	 * @return this instance
	 */
	public Bridging withMaxBridgeEntries(Long maxBridgeEntries) {
		this.maxBridgeEntries = maxBridgeEntries;
		return this;
	}

	/**
	 * Get the maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|.Bridging.Bridge}} table.  A positive value for this parameter implies support for 802.1D.

          There is no guarantee that this many 802.1D Bridges can be configured. For example, the CPE might not be able simultaneously to  support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxDBridgeEntries() {
		return maxDBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|.Bridging.Bridge}} table.  A positive value for this parameter implies support for 802.1D.

          There is no guarantee that this many 802.1D Bridges can be configured. For example, the CPE might not be able simultaneously to  support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 * @param maxDBridgeEntries the input value
	 */
	public void  setMaxDBridgeEntries(Long maxDBridgeEntries) {
		this.maxDBridgeEntries = maxDBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1D {{bibref|802.1D-2004}} entries available in the {{object|.Bridging.Bridge}} table.  A positive value for this parameter implies support for 802.1D.

          There is no guarantee that this many 802.1D Bridges can be configured. For example, the CPE might not be able simultaneously to  support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 * @param maxDBridgeEntries the input value
	 * @return this instance
	 */
	public Bridging withMaxDBridgeEntries(Long maxDBridgeEntries) {
		this.maxDBridgeEntries = maxDBridgeEntries;
		return this;
	}

	/**
	 * Get the maximum number of 802.1Q {{bibref|802.1Q-2011}} entries available in the {{object|.Bridging.Bridge}} table. A non-zero value for this parameter implies support for 802.1Q.

          There is no guarantee that this many 802.1Q Bridges can be configured. For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxQBridgeEntries() {
		return maxQBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2011}} entries available in the {{object|.Bridging.Bridge}} table. A non-zero value for this parameter implies support for 802.1Q.

          There is no guarantee that this many 802.1Q Bridges can be configured. For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 * @param maxQBridgeEntries the input value
	 */
	public void  setMaxQBridgeEntries(Long maxQBridgeEntries) {
		this.maxQBridgeEntries = maxQBridgeEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2011}} entries available in the {{object|.Bridging.Bridge}} table. A non-zero value for this parameter implies support for 802.1Q.

          There is no guarantee that this many 802.1Q Bridges can be configured. For example, the CPE might not be able simultaneously to support both 802.1D and 802.1Q Bridges.
	 *
	 * @since 2.0
	 * @param maxQBridgeEntries the input value
	 * @return this instance
	 */
	public Bridging withMaxQBridgeEntries(Long maxQBridgeEntries) {
		this.maxQBridgeEntries = maxQBridgeEntries;
		return this;
	}

	/**
	 * Get the maximum number of 802.1Q {{bibref|802.1Q-2011}} VLANs supported per {{object|.Bridging.Bridge}} table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxVLANEntries() {
		return maxVLANEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2011}} VLANs supported per {{object|.Bridging.Bridge}} table entry.
	 *
	 * @since 2.0
	 * @param maxVLANEntries the input value
	 */
	public void  setMaxVLANEntries(Long maxVLANEntries) {
		this.maxVLANEntries = maxVLANEntries;
	}

	/**
	 * Set the maximum number of 802.1Q {{bibref|802.1Q-2011}} VLANs supported per {{object|.Bridging.Bridge}} table entry.
	 *
	 * @since 2.0
	 * @param maxVLANEntries the input value
	 * @return this instance
	 */
	public Bridging withMaxVLANEntries(Long maxVLANEntries) {
		this.maxVLANEntries = maxVLANEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.Bridging.ProviderBridge}} table. A non-zero value for this parameter implies support for 802.1Q Provider Bridges.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getMaxProviderBridgeEntries() {
		return maxProviderBridgeEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.Bridging.ProviderBridge}} table. A non-zero value for this parameter implies support for 802.1Q Provider Bridges.
	 *
	 * @since 2.7
	 * @param maxProviderBridgeEntries the input value
	 */
	public void  setMaxProviderBridgeEntries(Long maxProviderBridgeEntries) {
		this.maxProviderBridgeEntries = maxProviderBridgeEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.Bridging.ProviderBridge}} table. A non-zero value for this parameter implies support for 802.1Q Provider Bridges.
	 *
	 * @since 2.7
	 * @param maxProviderBridgeEntries the input value
	 * @return this instance
	 */
	public Bridging withMaxProviderBridgeEntries(Long maxProviderBridgeEntries) {
		this.maxProviderBridgeEntries = maxProviderBridgeEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxFilterEntries() {
		return maxFilterEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 2.0
	 * @param maxFilterEntries the input value
	 */
	public void  setMaxFilterEntries(Long maxFilterEntries) {
		this.maxFilterEntries = maxFilterEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|Filter}} table.
	 *
	 * @since 2.0
	 * @param maxFilterEntries the input value
	 * @return this instance
	 */
	public Bridging withMaxFilterEntries(Long maxFilterEntries) {
		this.maxFilterEntries = maxFilterEntries;
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
	public Bridging withBridge(Bridge bridge) {
		getBridges().add(bridge);
		return this;
	}

	/**
	 * Get the filter table containing classification filter entries, each of which expresses a set of classification criterion to classify ingress frames as member of a {{object|#.Bridge}} instance or a {{object|#.Bridge.{i}.VLAN}} instance.

        Bridge VLAN classification only applies for 802.1Q {{bibref|802.1Q-2011}} Bridges.

        For enabled table entries, if {{param|Bridge}} or {{param|Interface}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as filter criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @return the value
	 */
	public Collection<Filter> getFilters() {
		if (this.filters == null){ this.filters=new ArrayList<>();}
		return filters;
	}

	/**
	 * Set the filter table containing classification filter entries, each of which expresses a set of classification criterion to classify ingress frames as member of a {{object|#.Bridge}} instance or a {{object|#.Bridge.{i}.VLAN}} instance.

        Bridge VLAN classification only applies for 802.1Q {{bibref|802.1Q-2011}} Bridges.

        For enabled table entries, if {{param|Bridge}} or {{param|Interface}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as filter criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @param filters the input value
	 */
	public void  setFilters(Collection<Filter> filters) {
		this.filters = filters;
	}

	/**
	 * Set the filter table containing classification filter entries, each of which expresses a set of classification criterion to classify ingress frames as member of a {{object|#.Bridge}} instance or a {{object|#.Bridge.{i}.VLAN}} instance.

        Bridge VLAN classification only applies for 802.1Q {{bibref|802.1Q-2011}} Bridges.

        For enabled table entries, if {{param|Bridge}} or {{param|Interface}} is {{empty}} then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Several of this object's parameters specify DHCP option values. Some cases are version neutral (the parameter can apply to both DHCPv4 and DHCPv6), but in other cases the representation of the option is different for DHCPv4 and DHCPv6, so it is necessary to define separate DHCPv4-specific and DHCPv6-specific parameters. Therefore, an instance of this object that uses DHCP option values as filter criteria will be associated with either DHCPv4 or DHCPv6, as indicated by the {{param|DHCPType}} parameter.
	 *
	 * @param filter the input value
	 * @return this instance
	 */
	public Bridging withFilter(Filter filter) {
		getFilters().add(filter);
		return this;
	}

	/**
	 * Get the provider Bridge table.

        A Provider Bridge is described in {{bibref|802.1Q-2011|section 5.10 Provider Bridge conformance}} as an entity that is comprised of one S-VLAN component and zero or more C-VLAN components. S-VLAN and C-VLAN components are modelled as instances of {{object|#.Bridge}} objects.

        When {{param|Type}} is configured with value of {{enum|PE|Type}} VLAN tags from the S-VLAN component (outer of 2 VLAN tags) are stacked on top of the VLAN tag from the C-VLAN component (inner of 2 VLAN tags).

        When {{param|Type}} is configured with value of {{enum|S-VLAN|Type}} only VLAN tags from the S-VLAN component are utilized.
	 *
	 * @return the value
	 */
	public Collection<ProviderBridge> getProviderBridges() {
		if (this.providerBridges == null){ this.providerBridges=new ArrayList<>();}
		return providerBridges;
	}

	/**
	 * Set the provider Bridge table.

        A Provider Bridge is described in {{bibref|802.1Q-2011|section 5.10 Provider Bridge conformance}} as an entity that is comprised of one S-VLAN component and zero or more C-VLAN components. S-VLAN and C-VLAN components are modelled as instances of {{object|#.Bridge}} objects.

        When {{param|Type}} is configured with value of {{enum|PE|Type}} VLAN tags from the S-VLAN component (outer of 2 VLAN tags) are stacked on top of the VLAN tag from the C-VLAN component (inner of 2 VLAN tags).

        When {{param|Type}} is configured with value of {{enum|S-VLAN|Type}} only VLAN tags from the S-VLAN component are utilized.
	 *
	 * @param providerBridges the input value
	 */
	public void  setProviderBridges(Collection<ProviderBridge> providerBridges) {
		this.providerBridges = providerBridges;
	}

	/**
	 * Set the provider Bridge table.

        A Provider Bridge is described in {{bibref|802.1Q-2011|section 5.10 Provider Bridge conformance}} as an entity that is comprised of one S-VLAN component and zero or more C-VLAN components. S-VLAN and C-VLAN components are modelled as instances of {{object|#.Bridge}} objects.

        When {{param|Type}} is configured with value of {{enum|PE|Type}} VLAN tags from the S-VLAN component (outer of 2 VLAN tags) are stacked on top of the VLAN tag from the C-VLAN component (inner of 2 VLAN tags).

        When {{param|Type}} is configured with value of {{enum|S-VLAN|Type}} only VLAN tags from the S-VLAN component are utilized.
	 *
	 * @param providerBridge the input value
	 * @return this instance
	 */
	public Bridging withProviderBridge(ProviderBridge providerBridge) {
		getProviderBridges().add(providerBridge);
		return this;
	}

	//</editor-fold>

}