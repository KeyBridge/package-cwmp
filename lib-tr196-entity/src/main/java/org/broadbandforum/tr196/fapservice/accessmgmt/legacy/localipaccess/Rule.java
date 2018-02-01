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
package org.broadbandforum.tr196.fapservice.accessmgmt.legacy.localipaccess;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;
import org.broadbandforum.tr196.datatypes.IPAddress;

	/**
	 * Policy for selecting traffic for local IP access. Originated traffic will be NAT'ed. The rule is bi-directional, i.e. return traffic is allowed. Rules do NOT affect traffic to/from the FAP itself (such as TR-069 or control). The rules are applied to the mobile station data traffic (PS-domain) via deep packet inspection or similar method.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.Legacy.LocalIPAccess.Rule.{i}.")
public class Rule {

	/**
	 * Enables or disables the forwarding entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Destination IP Address. {{empty}} indicates no destination address is specified. An entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress destIPAddress;
	/**
	 * Destination subnet mask (IPv4) or prefix (IPv6). {{empty}} indicates no destination subnet mask or prefix is specified. If a destination subnet mask or prefix is specified, {{param}} is ANDed with the destination address before comparing with {{param|DestIPAddress}}. Otherwise, the full destination address is used as-is.

An entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DestSubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress destSubnetMask;
	/**
	 * IP Protocol Identifier. -1 matches any protocol.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer protocol = -1;
	/**
	 * Action to be taken for traffic matching this rule.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Action")
	@CWMPParameter(access = "readWrite")
	public String action = "Tunnel";
	/**
	 * Specifies the egress interface when {{param|Action}} is set to {{enum|NAPT|Action}}. {{reference}} layer-3 connection object.

Example: InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;

	public Rule() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the forwarding entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the forwarding entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Rule withEnable(Boolean enable) {
		this.enable = enable;
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
	public Rule withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the destination IP Address. {{empty}} indicates no destination address is specified. An entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getDestIPAddress() {
		return destIPAddress;
	}

	/**
	 * Set the destination IP Address. {{empty}} indicates no destination address is specified. An entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destIPAddress the input value
	 */
	public void  setDestIPAddress(IPAddress destIPAddress) {
		this.destIPAddress = destIPAddress;
	}

	/**
	 * Set the destination IP Address. {{empty}} indicates no destination address is specified. An entry for which {{param}} and {{param|DestSubnetMask}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destIPAddress the input value
	 * @return this instance
	 */
	public Rule withDestIPAddress(IPAddress destIPAddress) {
		this.destIPAddress = destIPAddress;
		return this;
	}

	/**
	 * Get the destination subnet mask (IPv4) or prefix (IPv6). {{empty}} indicates no destination subnet mask or prefix is specified. If a destination subnet mask or prefix is specified, {{param}} is ANDed with the destination address before comparing with {{param|DestIPAddress}}. Otherwise, the full destination address is used as-is.

An entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getDestSubnetMask() {
		return destSubnetMask;
	}

	/**
	 * Set the destination subnet mask (IPv4) or prefix (IPv6). {{empty}} indicates no destination subnet mask or prefix is specified. If a destination subnet mask or prefix is specified, {{param}} is ANDed with the destination address before comparing with {{param|DestIPAddress}}. Otherwise, the full destination address is used as-is.

An entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destSubnetMask the input value
	 */
	public void  setDestSubnetMask(IPAddress destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
	}

	/**
	 * Set the destination subnet mask (IPv4) or prefix (IPv6). {{empty}} indicates no destination subnet mask or prefix is specified. If a destination subnet mask or prefix is specified, {{param}} is ANDed with the destination address before comparing with {{param|DestIPAddress}}. Otherwise, the full destination address is used as-is.

An entry for which {{param|DestIPAddress}} and {{param}} are both {{empty}} is a default route.
	 *
	 * @since 2.0
	 * @param destSubnetMask the input value
	 * @return this instance
	 */
	public Rule withDestSubnetMask(IPAddress destSubnetMask) {
		this.destSubnetMask = destSubnetMask;
		return this;
	}

	/**
	 * Get the ip Protocol Identifier. -1 matches any protocol.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * Set the ip Protocol Identifier. -1 matches any protocol.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 */
	public void  setProtocol(Integer protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the ip Protocol Identifier. -1 matches any protocol.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 * @return this instance
	 */
	public Rule withProtocol(Integer protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get action to be taken for traffic matching this rule.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Set action to be taken for traffic matching this rule.
	 *
	 * @since 2.0
	 * @param action the input value
	 */
	public void  setAction(String action) {
		this.action = action;
	}

	/**
	 * Set action to be taken for traffic matching this rule.
	 *
	 * @since 2.0
	 * @param action the input value
	 * @return this instance
	 */
	public Rule withAction(String action) {
		this.action = action;
		return this;
	}

	/**
	 * Get the specifies the egress interface when {{param|Action}} is set to {{enum|NAPT|Action}}. {{reference}} layer-3 connection object.

Example: InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the specifies the egress interface when {{param|Action}} is set to {{enum|NAPT|Action}}. {{reference}} layer-3 connection object.

Example: InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the specifies the egress interface when {{param|Action}} is set to {{enum|NAPT|Action}}. {{reference}} layer-3 connection object.

Example: InternetGatewayDevice.LANDevice.{i}.LANEthernetInterfaceConfig.{i}.
	 *
	 * @since 2.0
	 * @param _interface the input value
	 * @return this instance
	 */
	public Rule with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	//</editor-fold>

}