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
package org.broadbandforum.tr181.device.routing.router;

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
import org.broadbandforum.common.IPv4Address;

	/**
	 * Layer 3 IPv4 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP (i.e. RIP version 2), OSPF, DHCPv4, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination address/mask are considered, and the matching entry with the longest prefix is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv4-capable interface (that is attached to the IPv4 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.Routing.Router.{i}.IPv4Forwarding.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"DestIPAddress", "DestSubnetMask", "ForwardingPolicy", "GatewayIPAddress", "Interface", "ForwardingMetric"})})
@XmlRootElement(name = "Device.Routing.Router.IPv4Forwarding")
@XmlType(name = "Device.Routing.Router.IPv4Forwarding")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv4Forwarding {

	/**
	 * Enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
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
	 * If {{true}}, this route is a Static route.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StaticRoute")
	public Boolean staticRoute;
	/**
	 * Destination IPv4 address.  {{empty}} indicates no destination address is specified.

          A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPv4Address destIPAddress;
	/**
	 * Destination subnet mask.  {{empty}} indicates no destination subnet mask is specified.

          If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

          A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestSubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPv4Address destSubnetMask;
	/**
	 * Identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|Device.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer forwardingPolicy;
	/**
	 * IPv4 address of the gateway.

          Only one of {{param}} and Interface SHOULD be configured for a route.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GatewayIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPv4Address gatewayIPAddress;
	/**
	 * {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: Device.IP.Interface.1. 

          Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route. 

          If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the routes egress interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Protocol via which the IPv4 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * Forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ForwardingMetric")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer forwardingMetric;

	public IPv4Forwarding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public IPv4Forwarding withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public IPv4Forwarding withStatus(String status) {
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
	public IPv4Forwarding withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the if {{true}}, this route is a Static route.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isStaticRoute() {
		return staticRoute;
	}

	/**
	 * Set the if {{true}}, this route is a Static route.
	 *
	 * @since 2.0
	 * @param staticRoute the input value
	 */
	public void  setStaticRoute(Boolean staticRoute) {
		this.staticRoute = staticRoute;
	}

	/**
	 * Set the if {{true}}, this route is a Static route.
	 *
	 * @since 2.0
	 * @param staticRoute the input value
	 * @return this instance
	 */
	public IPv4Forwarding withStaticRoute(Boolean staticRoute) {
		this.staticRoute = staticRoute;
		return this;
	}

	/**
	 * Get the destination IPv4 address.  {{empty}} indicates no destination address is specified.

          A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getDestIPAddress() {
		return destIPAddress;
	}

	/**
	 * Set the destination IPv4 address.  {{empty}} indicates no destination address is specified.

          A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destIPAddress the input value
	 */
	public void  setDestIPAddress(IPv4Address destIPAddress) {
		this.destIPAddress = destIPAddress;
	}

	/**
	 * Set the destination IPv4 address.  {{empty}} indicates no destination address is specified.

          A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destIPAddress the input value
	 * @return this instance
	 */
	public IPv4Forwarding withDestIPAddress(IPv4Address destIPAddress) {
		this.destIPAddress = destIPAddress;
		return this;
	}

	/**
	 * Get the destination subnet mask.  {{empty}} indicates no destination subnet mask is specified.

          If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

          A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getDestSubnetMask() {
		return destSubnetMask;
	}

	/**
	 * Set the destination subnet mask.  {{empty}} indicates no destination subnet mask is specified.

          If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

          A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destSubnetMask the input value
	 */
	public void  setDestSubnetMask(IPv4Address destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
	}

	/**
	 * Set the destination subnet mask.  {{empty}} indicates no destination subnet mask is specified.

          If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

          A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destSubnetMask the input value
	 * @return this instance
	 */
	public IPv4Forwarding withDestSubnetMask(IPv4Address destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
		return this;
	}

	/**
	 * Get the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|Device.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getForwardingPolicy() {
		return forwardingPolicy;
	}

	/**
	 * Set the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|Device.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.0
	 * @param forwardingPolicy the input value
	 */
	public void  setForwardingPolicy(Integer forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
	}

	/**
	 * Set the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|Device.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.0
	 * @param forwardingPolicy the input value
	 * @return this instance
	 */
	public IPv4Forwarding withForwardingPolicy(Integer forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
		return this;
	}

	/**
	 * Get the ipv4 address of the gateway.

          Only one of {{param}} and Interface SHOULD be configured for a route.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getGatewayIPAddress() {
		return gatewayIPAddress;
	}

	/**
	 * Set the ipv4 address of the gateway.

          Only one of {{param}} and Interface SHOULD be configured for a route.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.0
	 * @param gatewayIPAddress the input value
	 */
	public void  setGatewayIPAddress(IPv4Address gatewayIPAddress) {
		this.gatewayIPAddress = gatewayIPAddress;
	}

	/**
	 * Set the ipv4 address of the gateway.

          Only one of {{param}} and Interface SHOULD be configured for a route.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.0
	 * @param gatewayIPAddress the input value
	 * @return this instance
	 */
	public IPv4Forwarding withGatewayIPAddress(IPv4Address gatewayIPAddress) {
		this.gatewayIPAddress = gatewayIPAddress;
		return this;
	}

	/**
	 * Get the {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: Device.IP.Interface.1. 

          Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route. 

          If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the routes egress interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: Device.IP.Interface.1. 

          Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route. 

          If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the routes egress interface.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: Device.IP.Interface.1. 

          Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route. 

          If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the routes egress interface.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public IPv4Forwarding with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the protocol via which the IPv4 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the protocol via which the IPv4 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the protocol via which the IPv4 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 * @param origin the input value
	 * @return this instance
	 */
	public IPv4Forwarding withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getForwardingMetric() {
		return forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.0
	 * @param forwardingMetric the input value
	 */
	public void  setForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.0
	 * @param forwardingMetric the input value
	 * @return this instance
	 */
	public IPv4Forwarding withForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
		return this;
	}

	//</editor-fold>

}