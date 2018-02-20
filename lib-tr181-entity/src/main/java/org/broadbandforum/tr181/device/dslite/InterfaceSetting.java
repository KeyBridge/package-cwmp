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
package org.broadbandforum.tr181.device.dslite;

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
import org.broadbandforum.common.IPv6Address;

	/**
	 * DSLite {{bibref|DSLite}} settings.
	 *
	 * @since TR181 v2.2
	 */
@CWMPObject(name = "Device.DSLite.InterfaceSetting.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "Device.DSLite.InterfaceSetting")
@XmlType(name = "Device.DSLite.InterfaceSetting")
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
	 * Indicates the preferred method to be used in assigning values to {{param|EndpointName}} when both static and dynamic values are available.  See {{param|EndpointName}} for further clarification.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "EndpointAssignmentPrecedence")
	@CWMPParameter(access = "readWrite")
	public String endpointAssignmentPrecedence;
	/**
	 * Indicates the preferred method to be used to assign the address of the DS-Lite Endpoint when both {{param|EndpointName}} and {{param|EndpointAddress}} values are available and the {{enum|Static|EndpointAssignmentPrecedence}} method is used.  See {{param|EndpointName}} and {{param|EndpointAddress}} for further clarification.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "EndpointAddressTypePrecedence")
	@CWMPParameter(access = "readWrite")
	public String endpointAddressTypePrecedence;
	/**
	 * Indicates the address currently in use for the tunnel concentrator (remote endpoint).  It is derived from the values of the {{param|EndpointAssignmentPrecedence}}, {{param|EndpointAddressTypePrecedence}}, {{param|EndpointName}} and {{param|EndpointAddress}} parameters.

          It is {{empty}} if no endpoint address is currently known.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "EndpointAddressInUse")
	public IPv6Address endpointAddressInUse;
	/**
	 * The Fully Qualified Domain Name (FQDN) of the tunnel concentrator (remote endpoint).

          This parameter is based on ''OPTION_DS_LITE_NAME'' from {{bibref|DSLite-options|Section 4}} and can be assigned statically (e.g. present in the factory default configuration or set by the ACS) or can be updated dynamically (via DHCPv6). If both statically and dynamically assigned, then {{param|EndpointAssignmentPrecedence}} indicates whether it is the static configuration or the DHCPv6 configuration that is actually applied to {{param}}.

          Note: {{param}} is only writable when {{param|EndpointAssignmentPrecedence}} is {{enum|Static|EndpointAssignmentPrecedence}}; otherwise, {{param}} is automatically configured via the DHCPv6 received option.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "EndpointName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String endpointName;
	/**
	 * The address of the tunnel concentrator (remote endpoint).

          This parameter can only be assigned statically (e.g. present in the factory default configuration or set by the ACS).
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "EndpointAddress")
	@CWMPParameter(access = "readWrite")
	public IPv6Address endpointAddress;
	/**
	 * Method used to assign {{param|EndpointAddressInUse}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Origin")
	public String origin;
	/**
	 * {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv4 traffic and is also logically the tunnel exit point for downstream IPv4 traffic (i.e. the entry point for non-tunneled upstream IPv4 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv4 traffic leaving a tunnel after being un-tunneled). 

          IPv4 traffic that enters {{param}} is expected to continue on through {{param|TunneledInterface}} from the LAN, and traffic from the WAN is expected to come from TunneledInterface into TunnelInterface. TunnelInterface is a logical interface that can allow for classification, marking (of IPv4 headers), and policing of IPv4 traffic that will be going over a DS-Lite tunnel. These functions are modeled in the Device.QoS object.

          Note: In DS-Lite, IPv4 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, DS-Lite traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "TunnelInterface")
	@Size(max = 256)
	public String tunnelInterface;
	/**
	 * {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv6 headers used to encapsulate the IPv4 packets.

          Encapsulated IPv4 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers and VLAN tags), and policing of IPv6 packets that encapsulate IPv4 packets in DS-Lite traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In DS-Lite, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv6 capable IP interface that the "DSLite IPv4-in-IPv6 tunnel" goes over. DS-Lite traffic that enters over this IPv6 WAN interface gets logically sent to this {{param}}.
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
	 * Get the indicates the preferred method to be used in assigning values to {{param|EndpointName}} when both static and dynamic values are available.  See {{param|EndpointName}} for further clarification.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getEndpointAssignmentPrecedence() {
		return endpointAssignmentPrecedence;
	}

	/**
	 * Set the indicates the preferred method to be used in assigning values to {{param|EndpointName}} when both static and dynamic values are available.  See {{param|EndpointName}} for further clarification.
	 *
	 * @since 2.2
	 * @param endpointAssignmentPrecedence the input value
	 */
	public void  setEndpointAssignmentPrecedence(String endpointAssignmentPrecedence) {
		this.endpointAssignmentPrecedence = endpointAssignmentPrecedence;
	}

	/**
	 * Set the indicates the preferred method to be used in assigning values to {{param|EndpointName}} when both static and dynamic values are available.  See {{param|EndpointName}} for further clarification.
	 *
	 * @since 2.2
	 * @param endpointAssignmentPrecedence the input value
	 * @return this instance
	 */
	public InterfaceSetting withEndpointAssignmentPrecedence(String endpointAssignmentPrecedence) {
		this.endpointAssignmentPrecedence = endpointAssignmentPrecedence;
		return this;
	}

	/**
	 * Get the indicates the preferred method to be used to assign the address of the DS-Lite Endpoint when both {{param|EndpointName}} and {{param|EndpointAddress}} values are available and the {{enum|Static|EndpointAssignmentPrecedence}} method is used.  See {{param|EndpointName}} and {{param|EndpointAddress}} for further clarification.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getEndpointAddressTypePrecedence() {
		return endpointAddressTypePrecedence;
	}

	/**
	 * Set the indicates the preferred method to be used to assign the address of the DS-Lite Endpoint when both {{param|EndpointName}} and {{param|EndpointAddress}} values are available and the {{enum|Static|EndpointAssignmentPrecedence}} method is used.  See {{param|EndpointName}} and {{param|EndpointAddress}} for further clarification.
	 *
	 * @since 2.5
	 * @param endpointAddressTypePrecedence the input value
	 */
	public void  setEndpointAddressTypePrecedence(String endpointAddressTypePrecedence) {
		this.endpointAddressTypePrecedence = endpointAddressTypePrecedence;
	}

	/**
	 * Set the indicates the preferred method to be used to assign the address of the DS-Lite Endpoint when both {{param|EndpointName}} and {{param|EndpointAddress}} values are available and the {{enum|Static|EndpointAssignmentPrecedence}} method is used.  See {{param|EndpointName}} and {{param|EndpointAddress}} for further clarification.
	 *
	 * @since 2.5
	 * @param endpointAddressTypePrecedence the input value
	 * @return this instance
	 */
	public InterfaceSetting withEndpointAddressTypePrecedence(String endpointAddressTypePrecedence) {
		this.endpointAddressTypePrecedence = endpointAddressTypePrecedence;
		return this;
	}

	/**
	 * Get the indicates the address currently in use for the tunnel concentrator (remote endpoint).  It is derived from the values of the {{param|EndpointAssignmentPrecedence}}, {{param|EndpointAddressTypePrecedence}}, {{param|EndpointName}} and {{param|EndpointAddress}} parameters.

          It is {{empty}} if no endpoint address is currently known.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPv6Address getEndpointAddressInUse() {
		return endpointAddressInUse;
	}

	/**
	 * Set the indicates the address currently in use for the tunnel concentrator (remote endpoint).  It is derived from the values of the {{param|EndpointAssignmentPrecedence}}, {{param|EndpointAddressTypePrecedence}}, {{param|EndpointName}} and {{param|EndpointAddress}} parameters.

          It is {{empty}} if no endpoint address is currently known.
	 *
	 * @since 2.5
	 * @param endpointAddressInUse the input value
	 */
	public void  setEndpointAddressInUse(IPv6Address endpointAddressInUse) {
		this.endpointAddressInUse = endpointAddressInUse;
	}

	/**
	 * Set the indicates the address currently in use for the tunnel concentrator (remote endpoint).  It is derived from the values of the {{param|EndpointAssignmentPrecedence}}, {{param|EndpointAddressTypePrecedence}}, {{param|EndpointName}} and {{param|EndpointAddress}} parameters.

          It is {{empty}} if no endpoint address is currently known.
	 *
	 * @since 2.5
	 * @param endpointAddressInUse the input value
	 * @return this instance
	 */
	public InterfaceSetting withEndpointAddressInUse(IPv6Address endpointAddressInUse) {
		this.endpointAddressInUse = endpointAddressInUse;
		return this;
	}

	/**
	 * Get the Fully Qualified Domain Name (FQDN) of the tunnel concentrator (remote endpoint).

          This parameter is based on ''OPTION_DS_LITE_NAME'' from {{bibref|DSLite-options|Section 4}} and can be assigned statically (e.g. present in the factory default configuration or set by the ACS) or can be updated dynamically (via DHCPv6). If both statically and dynamically assigned, then {{param|EndpointAssignmentPrecedence}} indicates whether it is the static configuration or the DHCPv6 configuration that is actually applied to {{param}}.

          Note: {{param}} is only writable when {{param|EndpointAssignmentPrecedence}} is {{enum|Static|EndpointAssignmentPrecedence}}; otherwise, {{param}} is automatically configured via the DHCPv6 received option.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getEndpointName() {
		return endpointName;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) of the tunnel concentrator (remote endpoint).

          This parameter is based on ''OPTION_DS_LITE_NAME'' from {{bibref|DSLite-options|Section 4}} and can be assigned statically (e.g. present in the factory default configuration or set by the ACS) or can be updated dynamically (via DHCPv6). If both statically and dynamically assigned, then {{param|EndpointAssignmentPrecedence}} indicates whether it is the static configuration or the DHCPv6 configuration that is actually applied to {{param}}.

          Note: {{param}} is only writable when {{param|EndpointAssignmentPrecedence}} is {{enum|Static|EndpointAssignmentPrecedence}}; otherwise, {{param}} is automatically configured via the DHCPv6 received option.
	 *
	 * @since 2.2
	 * @param endpointName the input value
	 */
	public void  setEndpointName(String endpointName) {
		this.endpointName = endpointName;
	}

	/**
	 * Set the Fully Qualified Domain Name (FQDN) of the tunnel concentrator (remote endpoint).

          This parameter is based on ''OPTION_DS_LITE_NAME'' from {{bibref|DSLite-options|Section 4}} and can be assigned statically (e.g. present in the factory default configuration or set by the ACS) or can be updated dynamically (via DHCPv6). If both statically and dynamically assigned, then {{param|EndpointAssignmentPrecedence}} indicates whether it is the static configuration or the DHCPv6 configuration that is actually applied to {{param}}.

          Note: {{param}} is only writable when {{param|EndpointAssignmentPrecedence}} is {{enum|Static|EndpointAssignmentPrecedence}}; otherwise, {{param}} is automatically configured via the DHCPv6 received option.
	 *
	 * @since 2.2
	 * @param endpointName the input value
	 * @return this instance
	 */
	public InterfaceSetting withEndpointName(String endpointName) {
		this.endpointName = endpointName;
		return this;
	}

	/**
	 * Get the address of the tunnel concentrator (remote endpoint).

          This parameter can only be assigned statically (e.g. present in the factory default configuration or set by the ACS).
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getEndpointAddress() {
		return endpointAddress;
	}

	/**
	 * Set the address of the tunnel concentrator (remote endpoint).

          This parameter can only be assigned statically (e.g. present in the factory default configuration or set by the ACS).
	 *
	 * @since 2.2
	 * @param endpointAddress the input value
	 */
	public void  setEndpointAddress(IPv6Address endpointAddress) {
		this.endpointAddress = endpointAddress;
	}

	/**
	 * Set the address of the tunnel concentrator (remote endpoint).

          This parameter can only be assigned statically (e.g. present in the factory default configuration or set by the ACS).
	 *
	 * @since 2.2
	 * @param endpointAddress the input value
	 * @return this instance
	 */
	public InterfaceSetting withEndpointAddress(IPv6Address endpointAddress) {
		this.endpointAddress = endpointAddress;
		return this;
	}

	/**
	 * Get the method used to assign {{param|EndpointAddressInUse}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the method used to assign {{param|EndpointAddressInUse}}.
	 *
	 * @since 2.2
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the method used to assign {{param|EndpointAddressInUse}}.
	 *
	 * @since 2.2
	 * @param origin the input value
	 * @return this instance
	 */
	public InterfaceSetting withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv4 traffic and is also logically the tunnel exit point for downstream IPv4 traffic (i.e. the entry point for non-tunneled upstream IPv4 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv4 traffic leaving a tunnel after being un-tunneled). 

          IPv4 traffic that enters {{param}} is expected to continue on through {{param|TunneledInterface}} from the LAN, and traffic from the WAN is expected to come from TunneledInterface into TunnelInterface. TunnelInterface is a logical interface that can allow for classification, marking (of IPv4 headers), and policing of IPv4 traffic that will be going over a DS-Lite tunnel. These functions are modeled in the Device.QoS object.

          Note: In DS-Lite, IPv4 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, DS-Lite traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getTunnelInterface() {
		return tunnelInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv4 traffic and is also logically the tunnel exit point for downstream IPv4 traffic (i.e. the entry point for non-tunneled upstream IPv4 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv4 traffic leaving a tunnel after being un-tunneled). 

          IPv4 traffic that enters {{param}} is expected to continue on through {{param|TunneledInterface}} from the LAN, and traffic from the WAN is expected to come from TunneledInterface into TunnelInterface. TunnelInterface is a logical interface that can allow for classification, marking (of IPv4 headers), and policing of IPv4 traffic that will be going over a DS-Lite tunnel. These functions are modeled in the Device.QoS object.

          Note: In DS-Lite, IPv4 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, DS-Lite traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
	 *
	 * @since 2.2
	 * @param tunnelInterface the input value
	 */
	public void  setTunnelInterface(String tunnelInterface) {
		this.tunnelInterface = tunnelInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunnel|.IP.Interface.{i}.Type}} that is logically the tunnel entry point for upstream IPv4 traffic and is also logically the tunnel exit point for downstream IPv4 traffic (i.e. the entry point for non-tunneled upstream IPv4 traffic to enter a tunnel and become tunneled, or conversely, the exit point for downstream IPv4 traffic leaving a tunnel after being un-tunneled). 

          IPv4 traffic that enters {{param}} is expected to continue on through {{param|TunneledInterface}} from the LAN, and traffic from the WAN is expected to come from TunneledInterface into TunnelInterface. TunnelInterface is a logical interface that can allow for classification, marking (of IPv4 headers), and policing of IPv4 traffic that will be going over a DS-Lite tunnel. These functions are modeled in the Device.QoS object.

          Note: In DS-Lite, IPv4 packets arriving over one or more device LAN IP interfaces are logically fed into this {{param}}. Likewise, DS-Lite traffic from the WAN gets logically sent from this {{param}} to LAN IP interfaces.
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
	 * Get the {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv6 headers used to encapsulate the IPv4 packets.

          Encapsulated IPv4 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers and VLAN tags), and policing of IPv6 packets that encapsulate IPv4 packets in DS-Lite traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In DS-Lite, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv6 capable IP interface that the "DSLite IPv4-in-IPv6 tunnel" goes over. DS-Lite traffic that enters over this IPv6 WAN interface gets logically sent to this {{param}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getTunneledInterface() {
		return tunneledInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv6 headers used to encapsulate the IPv4 packets.

          Encapsulated IPv4 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers and VLAN tags), and policing of IPv6 packets that encapsulate IPv4 packets in DS-Lite traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In DS-Lite, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv6 capable IP interface that the "DSLite IPv4-in-IPv6 tunnel" goes over. DS-Lite traffic that enters over this IPv6 WAN interface gets logically sent to this {{param}}.
	 *
	 * @since 2.2
	 * @param tunneledInterface the input value
	 */
	public void  setTunneledInterface(String tunneledInterface) {
		this.tunneledInterface = tunneledInterface;
	}

	/**
	 * Set the {{reference}} This is an IP interface of ''Type'' {{enum|Tunneled|.IP.Interface.{i}.Type}} that provides information about the IPv6 headers used to encapsulate the IPv4 packets.

          Encapsulated IPv4 traffic that enters {{param}} from the WAN is expected to continue on through {{param|TunnelInterface}}, and traffic from the LAN is expected to come from {{param|TunnelInterface}} into {{param}}. {{param}} is a logical interface that can allow for classification, marking (of IPv6 headers and VLAN tags), and policing of IPv6 packets that encapsulate IPv4 packets in DS-Lite traffic. These functions are modeled in the {{object|.QoS.}} object.

          Note: In DS-Lite, {{param}} traffic originating from the LAN logically feeds into a WAN-side IPv6 capable IP interface that the "DSLite IPv4-in-IPv6 tunnel" goes over. DS-Lite traffic that enters over this IPv6 WAN interface gets logically sent to this {{param}}.
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