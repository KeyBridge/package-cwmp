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
package org.broadbandforum.tr181.device.ipsec;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.ipsec.tunnel.Stats;

	/**
	 * Represents an IPsec tunnel, i.e. a virtual IP interface that models an IPsec tunnel entry point and exit point.  A {{object}} instance always references (and has the same lifetime as) a ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair.  The {{object}} instance models the IPsec-specific concepts, the {{enum|Tunnel|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance models the generic concepts, and the {{enum|Tunneled|.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance exists only so it can be referenced by forwarding or filter rules.

        {{object}} instances are automatically created (as needed) when {{object|#.Filter}} instances are enabled and disabled.

        Each instance's {{param|Filters}} parameter references the {{object|#.Filter}} instances that require the {{object}} instance to exist.  If this list ever becomes {{empty}}, e.g. because all the referenced {{object|#.Filter}} instances have been disabled or deleted, the CPE MAY choose not to delete the {{object}} instance (and its associated ({{enum|Tunnel|.IP.Interface.{i}.Type}},{{enum|Tunneled|.IP.Interface.{i}.Type}}) {{object|.IP.Interface}} pair).  This can be desirable, because {{object|.QoS.Classification}}, {{object|.Routing.Router.{i}.IPv4Forwarding}}, {{object|.Routing.Router.{i}.IPv6Forwarding}} etc instances might be referencing the {{object|.IP.Interface}} instances.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.IPsec.Tunnel.{i}.")
@XmlRootElement(name = "Tunnel")
@XmlType(name = "Device.IPsec.Tunnel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tunnel {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The corresponding auto-created {{enum|Tunnel|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "TunnelInterface")
	public String tunnelInterface;
	/**
	 * The corresponding auto-created {{enum|Tunneled|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "TunneledInterface")
	public String tunneledInterface;
	/**
	 * The {{object|#.Filter}} instances that require this {{object}} instance to exist.  {{reference}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Filters")
	@XmlList
	public Collection<String> filters;
	/**
	 * Statistics for this IPsec tunnel, i.e. all traffic that has passed through the tunnel, including IKEv2 negotiation, IKEv2 SA and ChildSA traffic.

        The CPE MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e. its associated {{param|.IP.Interface.{i}.Status}} parameter transitions to a down state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. its associated {{param|.IP.Interface.{i}.Enable}} parameter transition from {{false}} to {{true}}).

        Note that this object does not include generic statistics that are available in the associated {{object|.IP.Interface.{i}.Stats}} object.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Tunnel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.5
	 * @param alias the input value
	 * @return this instance
	 */
	public Tunnel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the corresponding auto-created {{enum|Tunnel|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getTunnelInterface() {
		return tunnelInterface;
	}

	/**
	 * Set the corresponding auto-created {{enum|Tunnel|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 * @param tunnelInterface the input value
	 */
	public void  setTunnelInterface(String tunnelInterface) {
		this.tunnelInterface = tunnelInterface;
	}

	/**
	 * Set the corresponding auto-created {{enum|Tunnel|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 * @param tunnelInterface the input value
	 * @return this instance
	 */
	public Tunnel withTunnelInterface(String tunnelInterface) {
		this.tunnelInterface = tunnelInterface;
		return this;
	}

	/**
	 * Get the corresponding auto-created {{enum|Tunneled|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getTunneledInterface() {
		return tunneledInterface;
	}

	/**
	 * Set the corresponding auto-created {{enum|Tunneled|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 * @param tunneledInterface the input value
	 */
	public void  setTunneledInterface(String tunneledInterface) {
		this.tunneledInterface = tunneledInterface;
	}

	/**
	 * Set the corresponding auto-created {{enum|Tunneled|Device.IP.Interface.{i}.Type}} {{object|.IP.Interface}} instance.  {{reference||delete}}
	 *
	 * @since 2.5
	 * @param tunneledInterface the input value
	 * @return this instance
	 */
	public Tunnel withTunneledInterface(String tunneledInterface) {
		this.tunneledInterface = tunneledInterface;
		return this;
	}

	/**
	 * Get the {{object|#.Filter}} instances that require this {{object}} instance to exist.  {{reference}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Collection<String> getFilters() {
		if (this.filters == null){ this.filters=new ArrayList<>();}
		return filters;
	}

	/**
	 * Set the {{object|#.Filter}} instances that require this {{object}} instance to exist.  {{reference}}
	 *
	 * @since 2.5
	 * @param filters the input value
	 */
	public void  setFilters(Collection<String> filters) {
		this.filters = filters;
	}

	/**
	 * Set the {{object|#.Filter}} instances that require this {{object}} instance to exist.  {{reference}}
	 *
	 * @since 2.5
	 * @param string the input value
	 * @return this instance
	 */
	public Tunnel withFilters(String string) {
		getFilters().add(string);
		return this;
	}

	/**
	 * Get the statistics for this IPsec tunnel, i.e. all traffic that has passed through the tunnel, including IKEv2 negotiation, IKEv2 SA and ChildSA traffic.

        The CPE MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e. its associated {{param|.IP.Interface.{i}.Status}} parameter transitions to a down state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. its associated {{param|.IP.Interface.{i}.Enable}} parameter transition from {{false}} to {{true}}).

        Note that this object does not include generic statistics that are available in the associated {{object|.IP.Interface.{i}.Stats}} object.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the statistics for this IPsec tunnel, i.e. all traffic that has passed through the tunnel, including IKEv2 negotiation, IKEv2 SA and ChildSA traffic.

        The CPE MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e. its associated {{param|.IP.Interface.{i}.Status}} parameter transitions to a down state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. its associated {{param|.IP.Interface.{i}.Enable}} parameter transition from {{false}} to {{true}}).

        Note that this object does not include generic statistics that are available in the associated {{object|.IP.Interface.{i}.Stats}} object.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the statistics for this IPsec tunnel, i.e. all traffic that has passed through the tunnel, including IKEv2 negotiation, IKEv2 SA and ChildSA traffic.

        The CPE MUST reset the tunnel's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the tunnel becomes operationally down due to a previous administrative down (i.e. its associated {{param|.IP.Interface.{i}.Status}} parameter transitions to a down state after the tunnel has been disabled) or when the tunnel becomes administratively up (i.e. its associated {{param|.IP.Interface.{i}.Enable}} parameter transition from {{false}} to {{true}}).

        Note that this object does not include generic statistics that are available in the associated {{object|.IP.Interface.{i}.Stats}} object.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Tunnel withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}