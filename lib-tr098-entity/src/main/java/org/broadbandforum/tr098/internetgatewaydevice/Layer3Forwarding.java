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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.layer3forwarding.Forwarding;

	/**
	 * This object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer3Forwarding.")
public class Layer3Forwarding {

	/**
	 * Specifies the default WAN interface.  The content is the full hierarchical parameter name of the default layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DefaultConnectionService")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String defaultConnectionService;
	/**
	 * Layer 3 forwarding table.

In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP, OSPF, DHCP, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

* Only table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

* For the remaining table entries, those for which the source address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified source address is a wild-card and always matches, with a prefix length of zero). 

* For the remaining table entries, those for which the destination address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified destination address is a wild-card and always matches, with a prefix length of zero). 

* The first of the remaining table entries is applied to the packet.
	 */
	@XmlElementWrapper(name = "forwardings")
	@XmlElement(name = "Forwarding")
	@CWMPParameter(access = "readWrite")
	public Collection<Forwarding> forwardings;

	public Layer3Forwarding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies the default WAN interface.  The content is the full hierarchical parameter name of the default layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDefaultConnectionService() {
		return defaultConnectionService;
	}

	/**
	 * Set the specifies the default WAN interface.  The content is the full hierarchical parameter name of the default layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @param defaultConnectionService the input value
	 */
	public void  setDefaultConnectionService(String defaultConnectionService) {
		this.defaultConnectionService = defaultConnectionService;
	}

	/**
	 * Set the specifies the default WAN interface.  The content is the full hierarchical parameter name of the default layer 3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @param defaultConnectionService the input value
	 * @return this instance
	 */
	public Layer3Forwarding withDefaultConnectionService(String defaultConnectionService) {
		this.defaultConnectionService = defaultConnectionService;
		return this;
	}

	/**
	 * Get the layer 3 forwarding table.

In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP, OSPF, DHCP, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

* Only table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

* For the remaining table entries, those for which the source address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified source address is a wild-card and always matches, with a prefix length of zero). 

* For the remaining table entries, those for which the destination address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified destination address is a wild-card and always matches, with a prefix length of zero). 

* The first of the remaining table entries is applied to the packet.
	 *
	 * @return the value
	 */
	public Collection<Forwarding> getForwardings() {
		if (this.forwardings == null){ this.forwardings=new ArrayList<>();}
		return forwardings;
	}

	/**
	 * Set the layer 3 forwarding table.

In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP, OSPF, DHCP, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

* Only table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

* For the remaining table entries, those for which the source address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified source address is a wild-card and always matches, with a prefix length of zero). 

* For the remaining table entries, those for which the destination address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified destination address is a wild-card and always matches, with a prefix length of zero). 

* The first of the remaining table entries is applied to the packet.
	 *
	 * @param forwardings the input value
	 */
	public void  setForwardings(Collection<Forwarding> forwardings) {
		this.forwardings = forwardings;
	}

	/**
	 * Set the layer 3 forwarding table.

In addition to statically configured routes, this table MUST include dynamic routes learned through layer 3 routing protocols, including RIP, OSPF, DHCP, and IPCP.  The CPE MAY reject attempts to delete or modify a dynamic route entry.

For each incoming packet, the layer 3 forwarding decision is conceptually made as follows:

* Only table entries with a matching {{param|ForwardingPolicy}} are considered, i.e. those that either do not specify a {{param|ForwardingPolicy}}, or else specify a {{param|ForwardingPolicy}} that matches that of the incoming packet. 

* For the remaining table entries, those for which the source address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified source address is a wild-card and always matches, with a prefix length of zero). 

* For the remaining table entries, those for which the destination address/mask matches are sorted by longest prefix, i.e. with the most specific networks first (an unspecified destination address is a wild-card and always matches, with a prefix length of zero). 

* The first of the remaining table entries is applied to the packet.
	 *
	 * @param forwarding the input value
	 * @return this instance
	 */
	public Layer3Forwarding withForwarding(Forwarding forwarding) {
		getForwardings().add(forwarding);
		return this;
	}

	//</editor-fold>

}