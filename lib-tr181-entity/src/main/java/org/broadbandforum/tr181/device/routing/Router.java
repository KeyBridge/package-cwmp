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
package org.broadbandforum.tr181.device.routing;

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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr181.device.routing.router.IPv4Forwarding;
import org.broadbandforum.tr181.device.routing.router.IPv6Forwarding;

	/**
	 * This object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.Routing.Router.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.Routing.Router")
@XmlType(name = "Device.Routing.Router")
@XmlAccessorType(XmlAccessType.FIELD)
public class Router {

	/**
	 * Enables or disables this ''Router'' entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this ''Router'' entry.  {{enum}}

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
	 * Layer 3 IPv4 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP (i.e. RIP version 2), OSPF, DHCPv4, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination address/mask are considered, and the matching entry with the longest prefix is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv4-capable interface (that is attached to the IPv4 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 */
	@XmlElementWrapper(name = "IPv4Forwardings")
	@XmlElement(name = "IPv4Forwarding")
	@CWMPParameter(access = "readWrite")
	public Collection<IPv4Forwarding> ipv4Forwardings;
	/**
	 * Layer 3 IPv6 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIPng, OSPF, DHCPv6, and RA.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination prefix are considered, and the matching entry with the longest prefix length is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        This object is based on ''inetCidrRouteTable'' from {{bibref|RFC4292}}.
	 */
	@XmlElementWrapper(name = "IPv6Forwardings")
	@XmlElement(name = "IPv6Forwarding")
	@CWMPParameter(access = "readWrite")
	public Collection<IPv6Forwarding> ipv6Forwardings;

	public Router() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this ''Router'' entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this ''Router'' entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this ''Router'' entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Router withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this ''Router'' entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this ''Router'' entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this ''Router'' entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Router withStatus(String status) {
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
	public Router withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the layer 3 IPv4 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP (i.e. RIP version 2), OSPF, DHCPv4, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination address/mask are considered, and the matching entry with the longest prefix is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv4-capable interface (that is attached to the IPv4 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @return the value
	 */
	public Collection<IPv4Forwarding> getIpv4Forwardings() {
		if (this.ipv4Forwardings == null){ this.ipv4Forwardings=new ArrayList<>();}
		return ipv4Forwardings;
	}

	/**
	 * Set the layer 3 IPv4 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP (i.e. RIP version 2), OSPF, DHCPv4, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination address/mask are considered, and the matching entry with the longest prefix is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv4-capable interface (that is attached to the IPv4 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @param ipv4Forwardings the input value
	 */
	public void  setIpv4Forwardings(Collection<IPv4Forwarding> ipv4Forwardings) {
		this.ipv4Forwardings = ipv4Forwardings;
	}

	/**
	 * Set the layer 3 IPv4 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP (i.e. RIP version 2), OSPF, DHCPv4, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination address/mask are considered, and the matching entry with the longest prefix is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv4-capable interface (that is attached to the IPv4 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        Note: The {{object}} table includes a unique key parameter that is a strong reference. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @param ipv4Forwarding the input value
	 * @return this instance
	 */
	public Router withIPv4Forwarding(IPv4Forwarding ipv4Forwarding) {
		getIpv4Forwardings().add(ipv4Forwarding);
		return this;
	}

	/**
	 * Get the layer 3 IPv6 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIPng, OSPF, DHCPv6, and RA.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination prefix are considered, and the matching entry with the longest prefix length is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        This object is based on ''inetCidrRouteTable'' from {{bibref|RFC4292}}.
	 *
	 * @return the value
	 */
	public Collection<IPv6Forwarding> getIpv6Forwardings() {
		if (this.ipv6Forwardings == null){ this.ipv6Forwardings=new ArrayList<>();}
		return ipv6Forwardings;
	}

	/**
	 * Set the layer 3 IPv6 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIPng, OSPF, DHCPv6, and RA.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination prefix are considered, and the matching entry with the longest prefix length is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        This object is based on ''inetCidrRouteTable'' from {{bibref|RFC4292}}.
	 *
	 * @param ipv6Forwardings the input value
	 */
	public void  setIpv6Forwardings(Collection<IPv6Forwarding> ipv6Forwardings) {
		this.ipv6Forwardings = ipv6Forwardings;
	}

	/**
	 * Set the layer 3 IPv6 forwarding table.

        In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIPng, OSPF, DHCPv6, and RA.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

        For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

        * Only enabled table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

        * Next, table entries that also have a matching destination prefix are considered, and the matching entry with the longest prefix length is applied to the packet (i.e. the entry with the most specific network). An unspecified destination address is a wild-card and always matches, but with a prefix length of zero.

        For enabled table entries, if {{param|Interface}} is not a valid reference to an IPv6-capable interface (that is attached to the IPv6 stack), then the table entry is inoperable and the CPE MUST set {{param|Status}} to {{enum|Error_Misconfigured|Status}}.

        This object is based on ''inetCidrRouteTable'' from {{bibref|RFC4292}}.
	 *
	 * @param ipv6Forwarding the input value
	 * @return this instance
	 */
	public Router withIPv6Forwarding(IPv6Forwarding ipv6Forwarding) {
		getIpv6Forwardings().add(ipv6Forwarding);
		return this;
	}

	//</editor-fold>

}