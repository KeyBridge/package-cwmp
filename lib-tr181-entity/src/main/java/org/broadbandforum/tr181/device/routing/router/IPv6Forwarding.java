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

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv6Address;
import org.broadbandforum.tr181.datatypes.IPv6Prefix;

	/**
	 * Layer 3 IPv6 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIPng, OSPF, DHCPv6, and RA.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination prefix are considered, and the matching entry with the longest prefix length is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        This object is based on ''inetCidrRouteTable'' from {{bibref|RFC4292}}.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.Routing.Router.{i}.IPv6Forwarding.{i}.")
public class IPv6Forwarding {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * Indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Destination IPv6 prefix. {{empty}} indicates that it matches all destination prefixes (i.e. equivalent to "::/0"). All bits to the right of the prefix MUST be zero, e.g. 2001:edff:fe6a:f76::/64.

          Routes with a 128-bit prefix length (/128) are host routes for a specific IPv6 destination, e.g. 2001:db8:28:2:713e:a426:d167:37ab/128.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DestIPPrefix")
	@CWMPParameter(access = "readWrite")
	public IPv6Prefix destIPPrefix;
	/**
	 * Identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ForwardingPolicy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer forwardingPolicy = -1;
	/**
	 * IPv6 address of the next hop.

          Only one of {{param}} and {{param|Interface}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "NextHop")
	@CWMPParameter(access = "readWrite")
	public IPv6Address nextHop;
	/**
	 * {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: ''Device.IP.Interface.1''. 

          Only one of {{param|NextHop}} and {{param}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param|NextHop}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|NextHop}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Protocol via which the IPv6 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * Forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ForwardingMetric")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer forwardingMetric = -1;
	/**
	 * The time at which the route will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is provided by an underlying dynamic routing protocol, e.g. by an {{bibref|RFC4191}} route information option.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ExpirationTime")
	public LocalDateTime expirationTime = LocalDateTime.parse("9999-12-31T23:59:59Z");;

	public IPv6Forwarding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public IPv6Forwarding withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the forwarding entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public IPv6Forwarding withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public IPv6Forwarding withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the destination IPv6 prefix. {{empty}} indicates that it matches all destination prefixes (i.e. equivalent to "::/0"). All bits to the right of the prefix MUST be zero, e.g. 2001:edff:fe6a:f76::/64.

          Routes with a 128-bit prefix length (/128) are host routes for a specific IPv6 destination, e.g. 2001:db8:28:2:713e:a426:d167:37ab/128.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Prefix getDestIPPrefix() {
		return destIPPrefix;
	}

	/**
	 * Set the destination IPv6 prefix. {{empty}} indicates that it matches all destination prefixes (i.e. equivalent to "::/0"). All bits to the right of the prefix MUST be zero, e.g. 2001:edff:fe6a:f76::/64.

          Routes with a 128-bit prefix length (/128) are host routes for a specific IPv6 destination, e.g. 2001:db8:28:2:713e:a426:d167:37ab/128.
	 *
	 * @since 2.2
	 * @param destIPPrefix the input value
	 */
	public void  setDestIPPrefix(IPv6Prefix destIPPrefix) {
		this.destIPPrefix = destIPPrefix;
	}

	/**
	 * Set the destination IPv6 prefix. {{empty}} indicates that it matches all destination prefixes (i.e. equivalent to "::/0"). All bits to the right of the prefix MUST be zero, e.g. 2001:edff:fe6a:f76::/64.

          Routes with a 128-bit prefix length (/128) are host routes for a specific IPv6 destination, e.g. 2001:db8:28:2:713e:a426:d167:37ab/128.
	 *
	 * @since 2.2
	 * @param destIPPrefix the input value
	 * @return this instance
	 */
	public IPv6Forwarding withDestIPPrefix(IPv6Prefix destIPPrefix) {
		this.destIPPrefix = destIPPrefix;
		return this;
	}

	/**
	 * Get the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getForwardingPolicy() {
		return forwardingPolicy;
	}

	/**
	 * Set the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.2
	 * @param forwardingPolicy the input value
	 */
	public void  setForwardingPolicy(Integer forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
	}

	/**
	 * Set the identifier of a set of classes or flows that have the corresponding {{param}} value as defined in the {{object|.QoS}} object.

          A value of -1 indicates no {{param}} is specified.

          If specified, this forwarding entry is to apply only to traffic associated with the specified classes and flows.
	 *
	 * @since 2.2
	 * @param forwardingPolicy the input value
	 * @return this instance
	 */
	public IPv6Forwarding withForwardingPolicy(Integer forwardingPolicy) {
		this.forwardingPolicy = forwardingPolicy;
		return this;
	}

	/**
	 * Get the ipv6 address of the next hop.

          Only one of {{param}} and {{param|Interface}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getNextHop() {
		return nextHop;
	}

	/**
	 * Set the ipv6 address of the next hop.

          Only one of {{param}} and {{param|Interface}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.2
	 * @param nextHop the input value
	 */
	public void  setNextHop(IPv6Address nextHop) {
		this.nextHop = nextHop;
	}

	/**
	 * Set the ipv6 address of the next hop.

          Only one of {{param}} and {{param|Interface}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param}} and {{param|Interface}} MUST be consistent with each other.
	 *
	 * @since 2.2
	 * @param nextHop the input value
	 * @return this instance
	 */
	public IPv6Forwarding withNextHop(IPv6Address nextHop) {
		this.nextHop = nextHop;
		return this;
	}

	/**
	 * Get the {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: ''Device.IP.Interface.1''. 

          Only one of {{param|NextHop}} and {{param}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param|NextHop}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|NextHop}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: ''Device.IP.Interface.1''. 

          Only one of {{param|NextHop}} and {{param}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param|NextHop}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|NextHop}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the {{reference}} Specifies the egress layer 3 interface associated with this entry. Example: ''Device.IP.Interface.1''. 

          Only one of {{param|NextHop}} and {{param}} SHOULD be configured for a route. {{empty}} indicates no {{param}} is specified.

          If both are configured, {{param|NextHop}} and {{param}} MUST be consistent with each other. 

          For a route that was configured by setting {{param|NextHop}} but not {{param}}, read access to {{param}} MUST return the full hierarchical parameter name for the route's egress interface.
	 *
	 * @since 2.2
	 * @param _interface the input value
	 * @return this instance
	 */
	public IPv6Forwarding with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the protocol via which the IPv6 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the protocol via which the IPv6 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the protocol via which the IPv6 forwarding rule was learned.  {{enum}}
	 *
	 * @since 2.2
	 * @param origin the input value
	 * @return this instance
	 */
	public IPv6Forwarding withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Integer getForwardingMetric() {
		return forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.2
	 * @param forwardingMetric the input value
	 */
	public void  setForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
	}

	/**
	 * Set the forwarding metric.  A value of -1 indicates this metric is not used.
	 *
	 * @since 2.2
	 * @param forwardingMetric the input value
	 * @return this instance
	 */
	public IPv6Forwarding withForwardingMetric(Integer forwardingMetric) {
		this.forwardingMetric = forwardingMetric;
		return this;
	}

	/**
	 * Get the time at which the route will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is provided by an underlying dynamic routing protocol, e.g. by an {{bibref|RFC4191}} route information option.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getExpirationTime() {
		return expirationTime;
	}

	/**
	 * Set the time at which the route will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is provided by an underlying dynamic routing protocol, e.g. by an {{bibref|RFC4191}} route information option.
	 *
	 * @since 2.2
	 * @param expirationTime the input value
	 */
	public void  setExpirationTime(LocalDateTime expirationTime) {
		this.expirationTime = expirationTime;
	}

	/**
	 * Set the time at which the route will expire, or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          {{param}} is provided by an underlying dynamic routing protocol, e.g. by an {{bibref|RFC4191}} route information option.
	 *
	 * @since 2.2
	 * @param expirationTime the input value
	 * @return this instance
	 */
	public IPv6Forwarding withExpirationTime(LocalDateTime expirationTime) {
		this.expirationTime = expirationTime;
		return this;
	}

	//</editor-fold>

}