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
package org.broadbandforum.tr181.device.ipv6rd;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IPv4Address;
import org.broadbandforum.tr181.datatypes.IPv6Prefix;

	/**
	 * 6rd {{bibref|RFC5969}} settings.

        A 6rd delegated prefix is expected to be of maximum length 64 bits, and is the concatenation of the following two items:

        * Service provider IPv6 prefix: specified via the {{param|SPIPv6Prefix}} parameter

        * IPv4 address suffix: the IPv4 address with the first {{param|IPv4MaskLength}} bits removed

        This object definition is derived from {{bibref|RFC5969}} with some minor nomenclature changes.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.IPv6rd.InterfaceSetting.{i}.")
@XmlRootElement(name = "InterfaceSetting")
@XmlType(name = "Device.IPv6rd.InterfaceSetting")
@XmlAccessorType(XmlAccessType.FIELD)
public class InterfaceSetting {

	/**
	 * Enable or disable this {{object}} instance.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * List items are the IPv4 addresses (possibly anycast) of the 6rd Relay(s).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "BorderRelayIPv4Addresses")
	@CWMPParameter(access = "readWrite")
	public IPv4Address borderRelayIPv4Addresses;
	/**
	 * If {{true}}, the destination address for all 6rd traffic will be set (IPv4 destination address) to one of the {{param|BorderRelayIPv4Addresses}}. If {{false}}, traffic whose destination address begins with the same prefix as {{param|SPIPv6Prefix}} will be sent directly to the destination IPv4 address of the endpoint, which is in the same 6rd domain. See 6rd Theory of Operation for further explanation {{bibref|TR-181i2a2|Appendix VI}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AllTrafficToBorderRelay")
	@CWMPParameter(access = "readWrite")
	public Boolean allTrafficToBorderRelay;
	/**
	 * The Service Provider's 6rd IPv6 prefix for this deployment and this 6rd RG.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SPIPv6Prefix")
	@CWMPParameter(access = "readWrite")
	public IPv6Prefix spiPv6Prefix;
	/**
	 * The number of high-order bits that are identical across all IPv4 addresses within a given 6rd domain. This number of bits MUST be removed from the start of the IPv4 address when generating the 6rd delegated prefix.

          For example, if this value is 8, only the final 24 bits of the subscriber IPv4 prefix will be used when creating the IPv6 delegated prefix, determining the destination IPv4 encapsulation address, etc.

          If the value is 0, then the whole 32 bits of the IPv4 address are used in the encoding.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv4MaskLength")
	@CWMPParameter(access = "readWrite", units = "bits")
	@Size(min = 0, max = 32)
	public Long ipv4MaskLength;
	/**
	 * {{reference}} Points to the IPv4 address that is the source of the IPv4 address embedded in the IPv6 6rd prefix, and used as the source encapsulating IPv4 address. If the value is {{empty}} or this parameter is not present, the device will use internal logic to determine which IPv4 source address to use.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "AddressSource")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String addressSource;
	/**
	 * {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv6 traffic and is also logically the tunnel exit point for downstream IPv6 traffic (i.e. the entry point for non-tunneled upstream IPv6 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv6 traffic leaving a tunnel after being un-tunneled). 

          IPv6 traffic that enters {{param}} from the LAN is expected to continue on through {{param|TunneledInterface}}, and traffic from the WAN is expected to come from {{param|TunneledInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers), and policing of IPv6 traffic that will be going over a 6rd tunnel. These functions are modeled in the {{object|.QoS.}} object.

          {{param}} can be used also to represent the 6rd virtual interface defined in {{bibref|RFC5969}}.

          Note: In 6rd, IPv6 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, 6rd traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "TunnelInterface")
	@Size(max = 256)
	public String tunnelInterface;
	/**
	 * {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv4 headers used to encapsulate the IPv6 packets.

          Encapsulated IPv6 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv4 headers and VLAN tags), and policing of IPv4 packets that encapsulate IPv6 packets in 6rd traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In 6rd, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv4 capable IP interface that the "IPv6 6rd tunnel" goes over. 6rd traffic that enters over this IPv4 WAN interface gets logically sent to this {{param}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "TunneledInterface")
	@Size(max = 256)
	public String tunneledInterface;

	public InterfaceSetting() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this {{object}} instance.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this {{object}} instance.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this {{object}} instance.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public InterfaceSetting withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this entry.  {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public InterfaceSetting withStatus(String status) {
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
	public InterfaceSetting withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the list items are the IPv4 addresses (possibly anycast) of the 6rd Relay(s).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv4Address getBorderRelayIPv4Addresses() {
		return borderRelayIPv4Addresses;
	}

	/**
	 * Set the list items are the IPv4 addresses (possibly anycast) of the 6rd Relay(s).
	 *
	 * @since 2.2
	 * @param borderRelayIPv4Addresses the input value
	 */
	public void  setBorderRelayIPv4Addresses(IPv4Address borderRelayIPv4Addresses) {
		this.borderRelayIPv4Addresses = borderRelayIPv4Addresses;
	}

	/**
	 * Set the list items are the IPv4 addresses (possibly anycast) of the 6rd Relay(s).
	 *
	 * @since 2.2
	 * @param borderRelayIPv4Addresses the input value
	 * @return this instance
	 */
	public InterfaceSetting withBorderRelayIPv4Addresses(IPv4Address borderRelayIPv4Addresses) {
		this.borderRelayIPv4Addresses = borderRelayIPv4Addresses;
		return this;
	}

	/**
	 * Get the if {{true}}, the destination address for all 6rd traffic will be set (IPv4 destination address) to one of the {{param|BorderRelayIPv4Addresses}}. If {{false}}, traffic whose destination address begins with the same prefix as {{param|SPIPv6Prefix}} will be sent directly to the destination IPv4 address of the endpoint, which is in the same 6rd domain. See 6rd Theory of Operation for further explanation {{bibref|TR-181i2a2|Appendix VI}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isAllTrafficToBorderRelay() {
		return allTrafficToBorderRelay;
	}

	/**
	 * Set the if {{true}}, the destination address for all 6rd traffic will be set (IPv4 destination address) to one of the {{param|BorderRelayIPv4Addresses}}. If {{false}}, traffic whose destination address begins with the same prefix as {{param|SPIPv6Prefix}} will be sent directly to the destination IPv4 address of the endpoint, which is in the same 6rd domain. See 6rd Theory of Operation for further explanation {{bibref|TR-181i2a2|Appendix VI}}.
	 *
	 * @since 2.2
	 * @param allTrafficToBorderRelay the input value
	 */
	public void  setAllTrafficToBorderRelay(Boolean allTrafficToBorderRelay) {
		this.allTrafficToBorderRelay = allTrafficToBorderRelay;
	}

	/**
	 * Set the if {{true}}, the destination address for all 6rd traffic will be set (IPv4 destination address) to one of the {{param|BorderRelayIPv4Addresses}}. If {{false}}, traffic whose destination address begins with the same prefix as {{param|SPIPv6Prefix}} will be sent directly to the destination IPv4 address of the endpoint, which is in the same 6rd domain. See 6rd Theory of Operation for further explanation {{bibref|TR-181i2a2|Appendix VI}}.
	 *
	 * @since 2.2
	 * @param allTrafficToBorderRelay the input value
	 * @return this instance
	 */
	public InterfaceSetting withAllTrafficToBorderRelay(Boolean allTrafficToBorderRelay) {
		this.allTrafficToBorderRelay = allTrafficToBorderRelay;
		return this;
	}

	/**
	 * Get the Service Provider's 6rd IPv6 prefix for this deployment and this 6rd RG.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Prefix getSpiPv6Prefix() {
		return spiPv6Prefix;
	}

	/**
	 * Set the Service Provider's 6rd IPv6 prefix for this deployment and this 6rd RG.
	 *
	 * @since 2.2
	 * @param spiPv6Prefix the input value
	 */
	public void  setSpiPv6Prefix(IPv6Prefix spiPv6Prefix) {
		this.spiPv6Prefix = spiPv6Prefix;
	}

	/**
	 * Set the Service Provider's 6rd IPv6 prefix for this deployment and this 6rd RG.
	 *
	 * @since 2.2
	 * @param spiPv6Prefix the input value
	 * @return this instance
	 */
	public InterfaceSetting withSpiPv6Prefix(IPv6Prefix spiPv6Prefix) {
		this.spiPv6Prefix = spiPv6Prefix;
		return this;
	}

	/**
	 * Get the number of high-order bits that are identical across all IPv4 addresses within a given 6rd domain. This number of bits MUST be removed from the start of the IPv4 address when generating the 6rd delegated prefix.

          For example, if this value is 8, only the final 24 bits of the subscriber IPv4 prefix will be used when creating the IPv6 delegated prefix, determining the destination IPv4 encapsulation address, etc.

          If the value is 0, then the whole 32 bits of the IPv4 address are used in the encoding.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Long getIpv4MaskLength() {
		return ipv4MaskLength;
	}

	/**
	 * Set the number of high-order bits that are identical across all IPv4 addresses within a given 6rd domain. This number of bits MUST be removed from the start of the IPv4 address when generating the 6rd delegated prefix.

          For example, if this value is 8, only the final 24 bits of the subscriber IPv4 prefix will be used when creating the IPv6 delegated prefix, determining the destination IPv4 encapsulation address, etc.

          If the value is 0, then the whole 32 bits of the IPv4 address are used in the encoding.
	 *
	 * @since 2.2
	 * @param ipv4MaskLength the input value
	 */
	public void  setIpv4MaskLength(Long ipv4MaskLength) {
		this.ipv4MaskLength = ipv4MaskLength;
	}

	/**
	 * Set the number of high-order bits that are identical across all IPv4 addresses within a given 6rd domain. This number of bits MUST be removed from the start of the IPv4 address when generating the 6rd delegated prefix.

          For example, if this value is 8, only the final 24 bits of the subscriber IPv4 prefix will be used when creating the IPv6 delegated prefix, determining the destination IPv4 encapsulation address, etc.

          If the value is 0, then the whole 32 bits of the IPv4 address are used in the encoding.
	 *
	 * @since 2.2
	 * @param ipv4MaskLength the input value
	 * @return this instance
	 */
	public InterfaceSetting withIpv4MaskLength(Long ipv4MaskLength) {
		this.ipv4MaskLength = ipv4MaskLength;
		return this;
	}

	/**
	 * Get the {{reference}} Points to the IPv4 address that is the source of the IPv4 address embedded in the IPv6 6rd prefix, and used as the source encapsulating IPv4 address. If the value is {{empty}} or this parameter is not present, the device will use internal logic to determine which IPv4 source address to use.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getAddressSource() {
		return addressSource;
	}

	/**
	 * Set the {{reference}} Points to the IPv4 address that is the source of the IPv4 address embedded in the IPv6 6rd prefix, and used as the source encapsulating IPv4 address. If the value is {{empty}} or this parameter is not present, the device will use internal logic to determine which IPv4 source address to use.
	 *
	 * @since 2.2
	 * @param addressSource the input value
	 */
	public void  setAddressSource(String addressSource) {
		this.addressSource = addressSource;
	}

	/**
	 * Set the {{reference}} Points to the IPv4 address that is the source of the IPv4 address embedded in the IPv6 6rd prefix, and used as the source encapsulating IPv4 address. If the value is {{empty}} or this parameter is not present, the device will use internal logic to determine which IPv4 source address to use.
	 *
	 * @since 2.2
	 * @param addressSource the input value
	 * @return this instance
	 */
	public InterfaceSetting withAddressSource(String addressSource) {
		this.addressSource = addressSource;
		return this;
	}

	/**
	 * Get the {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv6 traffic and is also logically the tunnel exit point for downstream IPv6 traffic (i.e. the entry point for non-tunneled upstream IPv6 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv6 traffic leaving a tunnel after being un-tunneled). 

          IPv6 traffic that enters {{param}} from the LAN is expected to continue on through {{param|TunneledInterface}}, and traffic from the WAN is expected to come from {{param|TunneledInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers), and policing of IPv6 traffic that will be going over a 6rd tunnel. These functions are modeled in the {{object|.QoS.}} object.

          {{param}} can be used also to represent the 6rd virtual interface defined in {{bibref|RFC5969}}.

          Note: In 6rd, IPv6 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, 6rd traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getTunnelInterface() {
		return tunnelInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv6 traffic and is also logically the tunnel exit point for downstream IPv6 traffic (i.e. the entry point for non-tunneled upstream IPv6 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv6 traffic leaving a tunnel after being un-tunneled). 

          IPv6 traffic that enters {{param}} from the LAN is expected to continue on through {{param|TunneledInterface}}, and traffic from the WAN is expected to come from {{param|TunneledInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers), and policing of IPv6 traffic that will be going over a 6rd tunnel. These functions are modeled in the {{object|.QoS.}} object.

          {{param}} can be used also to represent the 6rd virtual interface defined in {{bibref|RFC5969}}.

          Note: In 6rd, IPv6 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, 6rd traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
	 *
	 * @since 2.2
	 * @param tunnelInterface the input value
	 */
	public void  setTunnelInterface(String tunnelInterface) {
		this.tunnelInterface = tunnelInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv6 traffic and is also logically the tunnel exit point for downstream IPv6 traffic (i.e. the entry point for non-tunneled upstream IPv6 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv6 traffic leaving a tunnel after being un-tunneled). 

          IPv6 traffic that enters {{param}} from the LAN is expected to continue on through {{param|TunneledInterface}}, and traffic from the WAN is expected to come from {{param|TunneledInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers), and policing of IPv6 traffic that will be going over a 6rd tunnel. These functions are modeled in the {{object|.QoS.}} object.

          {{param}} can be used also to represent the 6rd virtual interface defined in {{bibref|RFC5969}}.

          Note: In 6rd, IPv6 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, 6rd traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
	 *
	 * @since 2.2
	 * @param tunnelInterface the input value
	 * @return this instance
	 */
	public InterfaceSetting withTunnelInterface(String tunnelInterface) {
		this.tunnelInterface = tunnelInterface;
		return this;
	}

	/**
	 * Get the {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv4 headers used to encapsulate the IPv6 packets.

          Encapsulated IPv6 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv4 headers and VLAN tags), and policing of IPv4 packets that encapsulate IPv6 packets in 6rd traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In 6rd, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv4 capable IP interface that the "IPv6 6rd tunnel" goes over. 6rd traffic that enters over this IPv4 WAN interface gets logically sent to this {{param}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getTunneledInterface() {
		return tunneledInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv4 headers used to encapsulate the IPv6 packets.

          Encapsulated IPv6 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv4 headers and VLAN tags), and policing of IPv4 packets that encapsulate IPv6 packets in 6rd traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In 6rd, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv4 capable IP interface that the "IPv6 6rd tunnel" goes over. 6rd traffic that enters over this IPv4 WAN interface gets logically sent to this {{param}}.
	 *
	 * @since 2.2
	 * @param tunneledInterface the input value
	 */
	public void  setTunneledInterface(String tunneledInterface) {
		this.tunneledInterface = tunneledInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv4 headers used to encapsulate the IPv6 packets.

          Encapsulated IPv6 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv4 headers and VLAN tags), and policing of IPv4 packets that encapsulate IPv6 packets in 6rd traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In 6rd, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv4 capable IP interface that the "IPv6 6rd tunnel" goes over. 6rd traffic that enters over this IPv4 WAN interface gets logically sent to this {{param}}.
	 *
	 * @since 2.2
	 * @param tunneledInterface the input value
	 * @return this instance
	 */
	public InterfaceSetting withTunneledInterface(String tunneledInterface) {
		this.tunneledInterface = tunneledInterface;
		return this;
	}

	//</editor-fold>

}