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
package org.broadbandforum.tr098.internetgatewaydevice.layer3forwarding;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.datatypes.IPAddress;

	/**
	 * Layer 3 forwarding table.

In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP, OSPF, DHCP, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

* Only table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

* For the remaining table entries, those for which the source address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified source address is a wild-card and always matches, with a prefix length of zero). 

* For the remaining table entries, those for which the destination address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified destination address is a wild-card and always matches, with a prefix length of zero). 

* The first of the remaining table entries is applied to the packet.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer3Forwarding.Forwarding.{i}.")
@XmlRootElement(name = "Forwarding")
@XmlType(name = "InternetGatewayDevice.Layer3Forwarding.Forwarding")
@XmlAccessorType(XmlAccessType.FIELD)
public class Forwarding {

	/**
	 * Enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Indicates the status of the forwarding entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}

This parameter can only be modified if {{param|StaticRoute}} is {{true}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * If {{true}}, this route is a Static route.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "StaticRoute")
	public Boolean staticRoute = true;
	/**
	 * Indicates the type of route.  {{enum}}

This parameter is DEPRECATED because its value could conflict with {{param|DestIPAddress}} and/or {{param|DestSubnetMask}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Type")
	@CWMPParameter(access = "readWrite")
	public String type = "Host";
	/**
	 * Destination address.  {{empty}} or a value of "0.0.0.0" indicates no destination address is specified.

A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIPAddress;
	/**
	 * Destination subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no destination subnet mask is specified.

If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestSubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress destSubnetMask;
	/**
	 * Source address.  {{empty}} or a value of "0.0.0.0" indicates no source address is specified.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SourceIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceIPAddress;
	/**
	 * Source subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no source subnet mask is specified.

If a source subnet mask is specified, the {{param}} is ANDed with the source address before comparing with the {{param|SourceIPAddress}}.  Otherwise, the full source address is used as is.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SourceSubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress sourceSubnetMask;
	/**
	 * Identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the ''QueueManagement'' object.

A value of -1 indicates no {{param}} is specified.

If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer forwardingPolicy = -1;
	/**
	 * IP address of the gateway.

Only one of GatewayIPAddress and Interface SHOULD be configured for a route.

If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GatewayIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress gatewayIPAddress;
	/**
	 * Specifies the egress interface associated with this entry.  {{reference|the layer 3 connection object}}  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route.

If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other.

For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ForwardingMetric")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer forwardingMetric = -1;
	/**
	 * The maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MTU")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1540)
	public Long mtu;

	public Forwarding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.  On creation, an entry is disabled by default.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Forwarding withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the forwarding entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public Forwarding withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}

This parameter can only be modified if {{param|StaticRoute}} is {{true}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}

This parameter can only be modified if {{param|StaticRoute}} is {{true}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}

This parameter can only be modified if {{param|StaticRoute}} is {{true}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public Forwarding withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the if {{true}}, this route is a Static route.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isStaticRoute() {
		return staticRoute;
	}

	/**
	 * Set the if {{true}}, this route is a Static route.
	 *
	 * @since 1.4
	 * @param staticRoute the input value
	 */
	public void  setStaticRoute(Boolean staticRoute) {
		this.staticRoute = staticRoute;
	}

	/**
	 * Set the if {{true}}, this route is a Static route.
	 *
	 * @since 1.4
	 * @param staticRoute the input value
	 * @return this instance
	 */
	public Forwarding withStaticRoute(Boolean staticRoute) {
		this.staticRoute = staticRoute;
		return this;
	}

	/**
	 * Get the indicates the type of route.  {{enum}}

This parameter is DEPRECATED because its value could conflict with {{param|DestIPAddress}} and/or {{param|DestSubnetMask}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the indicates the type of route.  {{enum}}

This parameter is DEPRECATED because its value could conflict with {{param|DestIPAddress}} and/or {{param|DestSubnetMask}}.
	 *
	 * @since 1.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the indicates the type of route.  {{enum}}

This parameter is DEPRECATED because its value could conflict with {{param|DestIPAddress}} and/or {{param|DestSubnetMask}}.
	 *
	 * @since 1.0
	 * @param type the input value
	 * @return this instance
	 */
	public Forwarding withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the destination address.  {{empty}} or a value of "0.0.0.0" indicates no destination address is specified.

A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDestIPAddress() {
		return destIPAddress;
	}

	/**
	 * Set the destination address.  {{empty}} or a value of "0.0.0.0" indicates no destination address is specified.

A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 * @param destIPAddress the input value
	 */
	public void  setDestIPAddress(IPAddress destIPAddress) {
		this.destIPAddress = destIPAddress;
	}

	/**
	 * Set the destination address.  {{empty}} or a value of "0.0.0.0" indicates no destination address is specified.

A Forwarding table entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 * @param destIPAddress the input value
	 * @return this instance
	 */
	public Forwarding withDestIPAddress(IPAddress destIPAddress) {
		this.destIPAddress = destIPAddress;
		return this;
	}

	/**
	 * Get the destination subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no destination subnet mask is specified.

If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getDestSubnetMask() {
		return destSubnetMask;
	}

	/**
	 * Set the destination subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no destination subnet mask is specified.

If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 * @param destSubnetMask the input value
	 */
	public void  setDestSubnetMask(IPAddress destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
	}

	/**
	 * Set the destination subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no destination subnet mask is specified.

If a destination subnet mask is specified, the {{param}} is ANDed with the destination address before comparing with the {{param|DestIPAddress}}.  Otherwise, the full destination address is used as is.

A Forwarding table entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} or "0.0.0.0" is a default route.
	 *
	 * @since 1.0
	 * @param destSubnetMask the input value
	 * @return this instance
	 */
	public Forwarding withDestSubnetMask(IPAddress destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
		return this;
	}

	/**
	 * Get the source address.  {{empty}} or a value of "0.0.0.0" indicates no source address is specified.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSourceIPAddress() {
		return sourceIPAddress;
	}

	/**
	 * Set the source address.  {{empty}} or a value of "0.0.0.0" indicates no source address is specified.
	 *
	 * @since 1.0
	 * @param sourceIPAddress the input value
	 */
	public void  setSourceIPAddress(IPAddress sourceIPAddress) {
		this.sourceIPAddress = sourceIPAddress;
	}

	/**
	 * Set the source address.  {{empty}} or a value of "0.0.0.0" indicates no source address is specified.
	 *
	 * @since 1.0
	 * @param sourceIPAddress the input value
	 * @return this instance
	 */
	public Forwarding withSourceIPAddress(IPAddress sourceIPAddress) {
		this.sourceIPAddress = sourceIPAddress;
		return this;
	}

	/**
	 * Get the source subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no source subnet mask is specified.

If a source subnet mask is specified, the {{param}} is ANDed with the source address before comparing with the {{param|SourceIPAddress}}.  Otherwise, the full source address is used as is.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSourceSubnetMask() {
		return sourceSubnetMask;
	}

	/**
	 * Set the source subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no source subnet mask is specified.

If a source subnet mask is specified, the {{param}} is ANDed with the source address before comparing with the {{param|SourceIPAddress}}.  Otherwise, the full source address is used as is.
	 *
	 * @since 1.0
	 * @param sourceSubnetMask the input value
	 */
	public void  setSourceSubnetMask(IPAddress sourceSubnetMask) {
		this.sourceSubnetMask = sourceSubnetMask;
	}

	/**
	 * Set the source subnet mask.  {{empty}} or a value of "0.0.0.0" indicates no source subnet mask is specified.

If a source subnet mask is specified, the {{param}} is ANDed with the source address before comparing with the {{param|SourceIPAddress}}.  Otherwise, the full source address is used as is.
	 *
	 * @since 1.0
	 * @param sourceSubnetMask the input value
	 * @return this instance
	 */
	public Forwarding withSourceSubnetMask(IPAddress sourceSubnetMask) {
		this.sourceSubnetMask = sourceSubnetMask;
		return this;
	}

	/**
	 * Get the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the ''QueueManagement'' object.

A value of -1 indicates no {{param}} is specified.

If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Integer getForwardingPolicy() {
		return forwardingPolicy;
	}

	/**
	 * Set the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the ''QueueManagement'' object.

A value of -1 indicates no {{param}} is specified.

If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 1.1
	 * @param forwardingPolicy the input value
	 */
	public void  setForwardingPolicy(Integer forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
	}

	/**
	 * Set the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the ''QueueManagement'' object.

A value of -1 indicates no {{param}} is specified.

If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 1.1
	 * @param forwardingPolicy the input value
	 * @return this instance
	 */
	public Forwarding withForwardingPolicy(Integer forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
		return this;
	}

	/**
	 * Get the ip address of the gateway.

Only one of GatewayIPAddress and Interface SHOULD be configured for a route.

If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getGatewayIPAddress() {
		return gatewayIPAddress;
	}

	/**
	 * Set the ip address of the gateway.

Only one of GatewayIPAddress and Interface SHOULD be configured for a route.

If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 1.0
	 * @param gatewayIPAddress the input value
	 */
	public void  setGatewayIPAddress(IPAddress gatewayIPAddress) {
		this.gatewayIPAddress = gatewayIPAddress;
	}

	/**
	 * Set the ip address of the gateway.

Only one of GatewayIPAddress and Interface SHOULD be configured for a route.

If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 1.0
	 * @param gatewayIPAddress the input value
	 * @return this instance
	 */
	public Forwarding withGatewayIPAddress(IPAddress gatewayIPAddress) {
		this.gatewayIPAddress = gatewayIPAddress;
		return this;
	}

	/**
	 * Get the specifies the egress interface associated with this entry.  {{reference|the layer 3 connection object}}  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route.

If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other.

For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the specifies the egress interface associated with this entry.  {{reference|the layer 3 connection object}}  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route.

If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other.

For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 1.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the specifies the egress interface associated with this entry.  {{reference|the layer 3 connection object}}  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

Only one of {{param|GatewayIPAddress}} and {{param}} SHOULD be configured for a route.

If both are configured, {{param|GatewayIPAddress}} and {{param}} MUST be consistent with each other.

For a route that was configured by setting {{param|GatewayIPAddress}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 1.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Forwarding with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getForwardingMetric() {
		return forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 * @param forwardingMetric the input value
	 */
	public void  setForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 1.0
	 * @param forwardingMetric the input value
	 * @return this instance
	 */
	public Forwarding withForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
		return this;
	}

	/**
	 * Get the maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMtu() {
		return mtu;
	}

	/**
	 * Set the maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 * @param mtu the input value
	 */
	public void  setMtu(Long mtu) {
		this.mtu = mtu;
	}

	/**
	 * Set the maximum allowed size of an Ethernet frame for this route.
	 *
	 * @since 1.0
	 * @param mtu the input value
	 * @return this instance
	 */
	public Forwarding withMtu(Long mtu) {
		this.mtu = mtu;
		return this;
	}

	//</editor-fold>

}