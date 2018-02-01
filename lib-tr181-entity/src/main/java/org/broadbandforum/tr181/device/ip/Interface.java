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
package org.broadbandforum.tr181.device.ip;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.ip._interface.IPv4Address;
import org.broadbandforum.tr181.device.ip._interface.IPv6Address;
import org.broadbandforum.tr181.device.ip._interface.IPv6Prefix;
import org.broadbandforum.tr181.device.ip._interface.Stats;

	/**
	 * IP interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). This table models the layer 3 IP interface.

        Each IP interface can be attached to the IPv4 and/or IPv6 stack.  The interface's IP addresses and prefixes are listed in the {{object|IPv4Address}}, {{object|IPv6Address}} and {{object|IPv6Prefix}} tables.

        Note that support for manipulating {{param|Loopback}} interfaces is OPTIONAL, so the implementation MAY choose not to create (or allow the ACS to create) {{object}} instances of type {{enum|Loopback|Type}}.

        When the ACS administratively disables the interface, i.e. sets {{param|Enable}} to {{false}}, the interface's automatically-assigned IP addresses and prefixes MAY be retained.  When the ACS administratively enables the interface, i.e. sets {{param|Enable}} to {{true}}, these IP addresses and prefixes MUST be refreshed.  It's up to the implementation to decide exactly what this means: it SHOULD take all reasonable steps to refresh everything but if it is unable, for example, to refresh a prefix that still has a significant lifetime, it might well choose to retain rather than discard it.

        Any {{enum|Tunneled|Type}} IP interface instances instantiated by the CPE MUST NOT have any statistics, writable parameters, IP addresses or IPv6 prefixes.  Any read-only parameters, e.g. {{param|Status}}, MUST return the same information as for the corresponding {{enum|Tunnel|Type}} interface.  The reason for these rules is that {{enum|Tunneled|Type}} IP interfaces exist only in order to be the targets of references (within the data model) and do not model any concepts over and above those already modeled by the {{enum|Tunnel|Type}} IP interfaces.

        Note that {{enum|Tunnel|Type}} and {{enum|Tunneled|Type}} IP interfaces are part of a legacy mechanism that is only used for {{object|##.IPv6rd}}, {{object|##.DSLite}} and {{object|##.IPsec}} tunnels and MUST NOT be used in any other context.  For all other tunneling mechanisms {{enum|Normal|Type}} IP interfaces are stacked above technology-specific Tunnel Interfaces, e.g. above {{object|##.GRE.Tunnel.{i}.Interface}} or {{object|##.MAP.Domain.{i}.Interface}} objects.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.Interface.{i}.")
public class Interface {

	/**
	 * Enables or disables the interface (regardless of {{param|IPv4Enable}} and {{param|IPv6Enable}}).

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * If set to {{true}}, attaches this interface to the IPv4 stack.  If set to {{false}}, detaches this interface from the IPv4 stack.

          Once detached from the IPv4 stack, the interface will now no longer be able to pass IPv4 packets, and will be operationally down (unless also attached to an enabled IPv6 stack).

          For an IPv4 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv4 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv4 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv4Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean ipv4Enable;
	/**
	 * If set to {{true}}, attaches this interface to the IPv6 stack.  If set to {{false}}, detaches this interface from the IPv6 stack.

          Once detached from the IPv6 stack, the interface will now no longer be able to pass IPv6 packets, and will be operationally down (unless also attached to an enabled IPv4 stack).

          For an IPv6 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv6 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv6 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPv6Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean ipv6Enable;
	/**
	 * Controls whether or not ULAs {{bibref|RFC4193}} are generated and used on this interface.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ULAEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean ulaEnable = false;
	/**
	 * The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status = "Down";
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          {{param}} MUST be {{empty}} and read-only when {{param|Type}} is {{enum|Loopback|Type}}, {{enum|Tunnel|Type}}, or {{enum|Tunneled|Type}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * {{reference}} The ''Router'' instance that is associated with this IP Interface entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Router")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String router;
	/**
	 * When set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset = false;
	/**
	 * The maximum transmission unit (MTU); the largest allowed size of an IP packet (including IP headers, but excluding lower layer headers such as Ethernet, PPP, or PPPoE headers) that is allowed to be transmitted by or through this device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxMTUSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 64, max = 65535)
	public Long maxMTUSize;
	/**
	 * IP interface type. {{enum}}

          For {{enum|Loopback}}, {{enum|Tunnel}}, and {{enum|Tunneled}} IP interface objects, the {{param|LowerLayers}} parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	public String type = "Normal";
	/**
	 * When set to {{true}}, the IP interface becomes a loopback interface and the CPE MUST set {{param|Type}} to {{enum|Loopback|Type}}. In this case, the CPE MUST also set {{param|LowerLayers}} to {{empty}} and fail subsequent attempts at setting {{param|LowerLayers}} until the interface is no longer a loopback.

          Support for manipulating loopback interfaces is OPTIONAL.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Loopback")
	@CWMPParameter(access = "readWrite")
	public Boolean loopback = false;
	/**
	 * If {{true}}, enables auto-IP on the interface {{bibref|RFC3927}}. This mechanism is only used with IPv4.

          When auto-IP is enabled on an interface, an {{object|IPv4Address}} object will dynamically be created and configured with auto-IP  parameter values. The exact conditions under which an auto-IP address is created (e.g. always when enabled or only in absence of  dynamic IP addressing) is implementation specific.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AutoIPEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean autoIPEnable = false;
	/**
	 * IPv4 address table. Entries are auto-created and auto-deleted as IP addresses are added and deleted via DHCP, auto-IP, or IPCP. Static entries are created and configured by the ACS.
	 */
	@XmlElementWrapper(name = "IPv4Addresss")
	@XmlElement(name = "IPv4Address")
	@CWMPParameter(access = "readWrite")
	public Collection<IPv4Address> ipv4Addresss;
	/**
	 * This table contains the IP interface's IPv6 unicast addresses.  There MUST be an entry for each such address, including anycast addresses.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via SLAAC {{bibref|RFC4862}}, which covers generation of link-local addresses (for all types of device) and global addresses (for non-router devices).

        * Automatically via DHCPv6 {{bibref|RFC3315}}, which covers generation of any type of address (subject to the configured DHCP server policy).

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        This table MUST NOT include entries for the Subnet-Router anycast address {{bibref|RFC4291|Section 2.6.1}}.  Such entries would be identical to others but with a zero interface identifier, and would add no value.

        A loopback interface will always have address ''::1'' {{bibref|RFC4291|Section 2.5.3}} and MAY also have link-local address ''fe80::1''.

        This object is based on ''ipAddressTable'' from {{bibref|RFC4293}}.
	 */
	@XmlElementWrapper(name = "IPv6Addresss")
	@XmlElement(name = "IPv6Address")
	@CWMPParameter(access = "readWrite")
	public Collection<IPv6Address> ipv6Addresss;
	/**
	 * This table contains the interface's IPv6 prefixes.  There MUST be an entry for each such prefix, not only for prefixes learned from router advertisements.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via {{bibref|RFC4861}} Router Advertisements.  See also {{object|.RouterAdvertisement}}.

        * Automatically via DHCPv6 {{bibref|RFC3315}} prefix delegation {{bibref|RFC3633}}.  See also {{object|.DHCPv6.Client}}.

        * Automatically via internal CPE logic, e.g. creation of child prefixes derived from a parent prefix.

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        The CPE MAY choose not to create {{object}} entries for {{enum|WellKnown|Origin}} prefixes or for the ULA /48 prefix {{bibref|RFC4193}}. If an {{object}} entry exists for the ULA /48 prefix, it MUST be on a downstream interface (i.e. an interface for which the physical layer interface object has ''Upstream'' = {{false}}).

        This object is based on ''ipAddressPrefixTable'' from {{bibref|RFC4293}}.
	 */
	@XmlElementWrapper(name = "IPv6Prefixs")
	@XmlElement(name = "IPv6Prefix")
	@CWMPParameter(access = "readWrite")
	public Collection<IPv6Prefix> ipv6Prefixs;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the interface (regardless of {{param|IPv4Enable}} and {{param|IPv6Enable}}).

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the interface (regardless of {{param|IPv4Enable}} and {{param|IPv6Enable}}).

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the interface (regardless of {{param|IPv4Enable}} and {{param|IPv6Enable}}).

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Interface withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the if set to {{true}}, attaches this interface to the IPv4 stack.  If set to {{false}}, detaches this interface from the IPv4 stack.

          Once detached from the IPv4 stack, the interface will now no longer be able to pass IPv4 packets, and will be operationally down (unless also attached to an enabled IPv6 stack).

          For an IPv4 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv4 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv4 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIpv4Enable() {
		return ipv4Enable;
	}

	/**
	 * Set the if set to {{true}}, attaches this interface to the IPv4 stack.  If set to {{false}}, detaches this interface from the IPv4 stack.

          Once detached from the IPv4 stack, the interface will now no longer be able to pass IPv4 packets, and will be operationally down (unless also attached to an enabled IPv6 stack).

          For an IPv4 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv4 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv4 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 * @param ipv4Enable the input value
	 */
	public void  setIpv4Enable(Boolean ipv4Enable) {
		this.ipv4Enable = ipv4Enable;
	}

	/**
	 * Set the if set to {{true}}, attaches this interface to the IPv4 stack.  If set to {{false}}, detaches this interface from the IPv4 stack.

          Once detached from the IPv4 stack, the interface will now no longer be able to pass IPv4 packets, and will be operationally down (unless also attached to an enabled IPv6 stack).

          For an IPv4 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv4 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv4 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 * @param ipv4Enable the input value
	 * @return this instance
	 */
	public Interface withIpv4Enable(Boolean ipv4Enable) {
		this.ipv4Enable = ipv4Enable;
		return this;
	}

	/**
	 * Get the if set to {{true}}, attaches this interface to the IPv6 stack.  If set to {{false}}, detaches this interface from the IPv6 stack.

          Once detached from the IPv6 stack, the interface will now no longer be able to pass IPv6 packets, and will be operationally down (unless also attached to an enabled IPv4 stack).

          For an IPv6 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv6 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv6 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isIpv6Enable() {
		return ipv6Enable;
	}

	/**
	 * Set the if set to {{true}}, attaches this interface to the IPv6 stack.  If set to {{false}}, detaches this interface from the IPv6 stack.

          Once detached from the IPv6 stack, the interface will now no longer be able to pass IPv6 packets, and will be operationally down (unless also attached to an enabled IPv4 stack).

          For an IPv6 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv6 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv6 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 * @param ipv6Enable the input value
	 */
	public void  setIpv6Enable(Boolean ipv6Enable) {
		this.ipv6Enable = ipv6Enable;
	}

	/**
	 * Set the if set to {{true}}, attaches this interface to the IPv6 stack.  If set to {{false}}, detaches this interface from the IPv6 stack.

          Once detached from the IPv6 stack, the interface will now no longer be able to pass IPv6 packets, and will be operationally down (unless also attached to an enabled IPv4 stack).

          For an IPv6 capable device, if {{param}} is not present this interface SHOULD be permanently attached to the IPv6 stack.

          Note that {{param}} is independent of {{param|Enable}}, and that to administratively enable an interface for IPv6 it is necessary for both {{param|Enable}} and {{param}} to be {{true}}.
	 *
	 * @since 2.2
	 * @param ipv6Enable the input value
	 * @return this instance
	 */
	public Interface withIpv6Enable(Boolean ipv6Enable) {
		this.ipv6Enable = ipv6Enable;
		return this;
	}

	/**
	 * Get the controls whether or not ULAs {{bibref|RFC4193}} are generated and used on this interface.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isUlaEnable() {
		return ulaEnable;
	}

	/**
	 * Set the controls whether or not ULAs {{bibref|RFC4193}} are generated and used on this interface.
	 *
	 * @since 2.2
	 * @param ulaEnable the input value
	 */
	public void  setUlaEnable(Boolean ulaEnable) {
		this.ulaEnable = ulaEnable;
	}

	/**
	 * Set the controls whether or not ULAs {{bibref|RFC4193}} are generated and used on this interface.
	 *
	 * @since 2.2
	 * @param ulaEnable the input value
	 * @return this instance
	 */
	public Interface withUlaEnable(Boolean ulaEnable) {
		this.ulaEnable = ulaEnable;
		return this;
	}

	/**
	 * Get the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Interface withStatus(String status) {
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
	public Interface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the interface as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Interface withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          {{param}} MUST be {{empty}} and read-only when {{param|Type}} is {{enum|Loopback|Type}}, {{enum|Tunnel|Type}}, or {{enum|Tunneled|Type}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          {{param}} MUST be {{empty}} and read-only when {{param|Type}} is {{enum|Loopback|Type}}, {{enum|Tunnel|Type}}, or {{enum|Tunneled|Type}}.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          {{param}} MUST be {{empty}} and read-only when {{param|Type}} is {{enum|Loopback|Type}}, {{enum|Tunnel|Type}}, or {{enum|Tunneled|Type}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the {{reference}} The ''Router'' instance that is associated with this IP Interface entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRouter() {
		return router;
	}

	/**
	 * Set the {{reference}} The ''Router'' instance that is associated with this IP Interface entry.
	 *
	 * @since 2.0
	 * @param router the input value
	 */
	public void  setRouter(String router) {
		this.router = router;
	}

	/**
	 * Set the {{reference}} The ''Router'' instance that is associated with this IP Interface entry.
	 *
	 * @since 2.0
	 * @param router the input value
	 * @return this instance
	 */
	public Interface withRouter(String router) {
		this.router = router;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, the device MUST tear down the existing IP connection represented by this object and establish a new one.  

          The device MUST initiate the reset after completion of the current CWMP session.  The device MAY delay resetting the connection in order to avoid interruption of a user service such as an ongoing voice call.

          Reset on a disabled interface is a no-op (not an error).
	 *
	 * @since 2.0
	 * @param reset the input value
	 * @return this instance
	 */
	public Interface withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the maximum transmission unit (MTU); the largest allowed size of an IP packet (including IP headers, but excluding lower layer headers such as Ethernet, PPP, or PPPoE headers) that is allowed to be transmitted by or through this device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxMTUSize() {
		return maxMTUSize;
	}

	/**
	 * Set the maximum transmission unit (MTU); the largest allowed size of an IP packet (including IP headers, but excluding lower layer headers such as Ethernet, PPP, or PPPoE headers) that is allowed to be transmitted by or through this device.
	 *
	 * @since 2.0
	 * @param maxMTUSize the input value
	 */
	public void  setMaxMTUSize(Long maxMTUSize) {
		this.maxMTUSize = maxMTUSize;
	}

	/**
	 * Set the maximum transmission unit (MTU); the largest allowed size of an IP packet (including IP headers, but excluding lower layer headers such as Ethernet, PPP, or PPPoE headers) that is allowed to be transmitted by or through this device.
	 *
	 * @since 2.0
	 * @param maxMTUSize the input value
	 * @return this instance
	 */
	public Interface withMaxMTUSize(Long maxMTUSize) {
		this.maxMTUSize = maxMTUSize;
		return this;
	}

	/**
	 * Get the ip interface type. {{enum}}

          For {{enum|Loopback}}, {{enum|Tunnel}}, and {{enum|Tunneled}} IP interface objects, the {{param|LowerLayers}} parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the ip interface type. {{enum}}

          For {{enum|Loopback}}, {{enum|Tunnel}}, and {{enum|Tunneled}} IP interface objects, the {{param|LowerLayers}} parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the ip interface type. {{enum}}

          For {{enum|Loopback}}, {{enum|Tunnel}}, and {{enum|Tunneled}} IP interface objects, the {{param|LowerLayers}} parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public Interface withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the IP interface becomes a loopback interface and the CPE MUST set {{param|Type}} to {{enum|Loopback|Type}}. In this case, the CPE MUST also set {{param|LowerLayers}} to {{empty}} and fail subsequent attempts at setting {{param|LowerLayers}} until the interface is no longer a loopback.

          Support for manipulating loopback interfaces is OPTIONAL.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLoopback() {
		return loopback;
	}

	/**
	 * Set the when set to {{true}}, the IP interface becomes a loopback interface and the CPE MUST set {{param|Type}} to {{enum|Loopback|Type}}. In this case, the CPE MUST also set {{param|LowerLayers}} to {{empty}} and fail subsequent attempts at setting {{param|LowerLayers}} until the interface is no longer a loopback.

          Support for manipulating loopback interfaces is OPTIONAL.
	 *
	 * @since 2.0
	 * @param loopback the input value
	 */
	public void  setLoopback(Boolean loopback) {
		this.loopback = loopback;
	}

	/**
	 * Set the when set to {{true}}, the IP interface becomes a loopback interface and the CPE MUST set {{param|Type}} to {{enum|Loopback|Type}}. In this case, the CPE MUST also set {{param|LowerLayers}} to {{empty}} and fail subsequent attempts at setting {{param|LowerLayers}} until the interface is no longer a loopback.

          Support for manipulating loopback interfaces is OPTIONAL.
	 *
	 * @since 2.0
	 * @param loopback the input value
	 * @return this instance
	 */
	public Interface withLoopback(Boolean loopback) {
		this.loopback = loopback;
		return this;
	}

	/**
	 * Get the if {{true}}, enables auto-IP on the interface {{bibref|RFC3927}}. This mechanism is only used with IPv4.

          When auto-IP is enabled on an interface, an {{object|IPv4Address}} object will dynamically be created and configured with auto-IP  parameter values. The exact conditions under which an auto-IP address is created (e.g. always when enabled or only in absence of  dynamic IP addressing) is implementation specific.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAutoIPEnable() {
		return autoIPEnable;
	}

	/**
	 * Set the if {{true}}, enables auto-IP on the interface {{bibref|RFC3927}}. This mechanism is only used with IPv4.

          When auto-IP is enabled on an interface, an {{object|IPv4Address}} object will dynamically be created and configured with auto-IP  parameter values. The exact conditions under which an auto-IP address is created (e.g. always when enabled or only in absence of  dynamic IP addressing) is implementation specific.
	 *
	 * @since 2.0
	 * @param autoIPEnable the input value
	 */
	public void  setAutoIPEnable(Boolean autoIPEnable) {
		this.autoIPEnable = autoIPEnable;
	}

	/**
	 * Set the if {{true}}, enables auto-IP on the interface {{bibref|RFC3927}}. This mechanism is only used with IPv4.

          When auto-IP is enabled on an interface, an {{object|IPv4Address}} object will dynamically be created and configured with auto-IP  parameter values. The exact conditions under which an auto-IP address is created (e.g. always when enabled or only in absence of  dynamic IP addressing) is implementation specific.
	 *
	 * @since 2.0
	 * @param autoIPEnable the input value
	 * @return this instance
	 */
	public Interface withAutoIPEnable(Boolean autoIPEnable) {
		this.autoIPEnable = autoIPEnable;
		return this;
	}

	/**
	 * Get the ipv4 address table. Entries are auto-created and auto-deleted as IP addresses are added and deleted via DHCP, auto-IP, or IPCP. Static entries are created and configured by the ACS.
	 *
	 * @return the value
	 */
	public Collection<IPv4Address> getIpv4Addresss() {
		if (this.ipv4Addresss == null){ this.ipv4Addresss=new ArrayList<>();}
		return ipv4Addresss;
	}

	/**
	 * Set the ipv4 address table. Entries are auto-created and auto-deleted as IP addresses are added and deleted via DHCP, auto-IP, or IPCP. Static entries are created and configured by the ACS.
	 *
	 * @param ipv4Addresss the input value
	 */
	public void  setIpv4Addresss(Collection<IPv4Address> ipv4Addresss) {
		this.ipv4Addresss = ipv4Addresss;
	}

	/**
	 * Set the ipv4 address table. Entries are auto-created and auto-deleted as IP addresses are added and deleted via DHCP, auto-IP, or IPCP. Static entries are created and configured by the ACS.
	 *
	 * @param ipv4Address the input value
	 * @return this instance
	 */
	public Interface withIPv4Address(IPv4Address ipv4Address) {
		getIpv4Addresss().add(ipv4Address);
		return this;
	}

	/**
	 * Get the this table contains the IP interface's IPv6 unicast addresses.  There MUST be an entry for each such address, including anycast addresses.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via SLAAC {{bibref|RFC4862}}, which covers generation of link-local addresses (for all types of device) and global addresses (for non-router devices).

        * Automatically via DHCPv6 {{bibref|RFC3315}}, which covers generation of any type of address (subject to the configured DHCP server policy).

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        This table MUST NOT include entries for the Subnet-Router anycast address {{bibref|RFC4291|Section 2.6.1}}.  Such entries would be identical to others but with a zero interface identifier, and would add no value.

        A loopback interface will always have address ''::1'' {{bibref|RFC4291|Section 2.5.3}} and MAY also have link-local address ''fe80::1''.

        This object is based on ''ipAddressTable'' from {{bibref|RFC4293}}.
	 *
	 * @return the value
	 */
	public Collection<IPv6Address> getIpv6Addresss() {
		if (this.ipv6Addresss == null){ this.ipv6Addresss=new ArrayList<>();}
		return ipv6Addresss;
	}

	/**
	 * Set the this table contains the IP interface's IPv6 unicast addresses.  There MUST be an entry for each such address, including anycast addresses.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via SLAAC {{bibref|RFC4862}}, which covers generation of link-local addresses (for all types of device) and global addresses (for non-router devices).

        * Automatically via DHCPv6 {{bibref|RFC3315}}, which covers generation of any type of address (subject to the configured DHCP server policy).

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        This table MUST NOT include entries for the Subnet-Router anycast address {{bibref|RFC4291|Section 2.6.1}}.  Such entries would be identical to others but with a zero interface identifier, and would add no value.

        A loopback interface will always have address ''::1'' {{bibref|RFC4291|Section 2.5.3}} and MAY also have link-local address ''fe80::1''.

        This object is based on ''ipAddressTable'' from {{bibref|RFC4293}}.
	 *
	 * @param ipv6Addresss the input value
	 */
	public void  setIpv6Addresss(Collection<IPv6Address> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;
	}

	/**
	 * Set the this table contains the IP interface's IPv6 unicast addresses.  There MUST be an entry for each such address, including anycast addresses.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via SLAAC {{bibref|RFC4862}}, which covers generation of link-local addresses (for all types of device) and global addresses (for non-router devices).

        * Automatically via DHCPv6 {{bibref|RFC3315}}, which covers generation of any type of address (subject to the configured DHCP server policy).

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        This table MUST NOT include entries for the Subnet-Router anycast address {{bibref|RFC4291|Section 2.6.1}}.  Such entries would be identical to others but with a zero interface identifier, and would add no value.

        A loopback interface will always have address ''::1'' {{bibref|RFC4291|Section 2.5.3}} and MAY also have link-local address ''fe80::1''.

        This object is based on ''ipAddressTable'' from {{bibref|RFC4293}}.
	 *
	 * @param ipv6Address the input value
	 * @return this instance
	 */
	public Interface withIPv6Address(IPv6Address ipv6Address) {
		getIpv6Addresss().add(ipv6Address);
		return this;
	}

	/**
	 * Get the this table contains the interface's IPv6 prefixes.  There MUST be an entry for each such prefix, not only for prefixes learned from router advertisements.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via {{bibref|RFC4861}} Router Advertisements.  See also {{object|.RouterAdvertisement}}.

        * Automatically via DHCPv6 {{bibref|RFC3315}} prefix delegation {{bibref|RFC3633}}.  See also {{object|.DHCPv6.Client}}.

        * Automatically via internal CPE logic, e.g. creation of child prefixes derived from a parent prefix.

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        The CPE MAY choose not to create {{object}} entries for {{enum|WellKnown|Origin}} prefixes or for the ULA /48 prefix {{bibref|RFC4193}}. If an {{object}} entry exists for the ULA /48 prefix, it MUST be on a downstream interface (i.e. an interface for which the physical layer interface object has ''Upstream'' = {{false}}).

        This object is based on ''ipAddressPrefixTable'' from {{bibref|RFC4293}}.
	 *
	 * @return the value
	 */
	public Collection<IPv6Prefix> getIpv6Prefixs() {
		if (this.ipv6Prefixs == null){ this.ipv6Prefixs=new ArrayList<>();}
		return ipv6Prefixs;
	}

	/**
	 * Set the this table contains the interface's IPv6 prefixes.  There MUST be an entry for each such prefix, not only for prefixes learned from router advertisements.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via {{bibref|RFC4861}} Router Advertisements.  See also {{object|.RouterAdvertisement}}.

        * Automatically via DHCPv6 {{bibref|RFC3315}} prefix delegation {{bibref|RFC3633}}.  See also {{object|.DHCPv6.Client}}.

        * Automatically via internal CPE logic, e.g. creation of child prefixes derived from a parent prefix.

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        The CPE MAY choose not to create {{object}} entries for {{enum|WellKnown|Origin}} prefixes or for the ULA /48 prefix {{bibref|RFC4193}}. If an {{object}} entry exists for the ULA /48 prefix, it MUST be on a downstream interface (i.e. an interface for which the physical layer interface object has ''Upstream'' = {{false}}).

        This object is based on ''ipAddressPrefixTable'' from {{bibref|RFC4293}}.
	 *
	 * @param ipv6Prefixs the input value
	 */
	public void  setIpv6Prefixs(Collection<IPv6Prefix> ipv6Prefixs) {
		this.ipv6Prefixs = ipv6Prefixs;
	}

	/**
	 * Set the this table contains the interface's IPv6 prefixes.  There MUST be an entry for each such prefix, not only for prefixes learned from router advertisements.

        There are several ways in which entries can be added to and deleted from this table, including:

        * Automatically via {{bibref|RFC4861}} Router Advertisements.  See also {{object|.RouterAdvertisement}}.

        * Automatically via DHCPv6 {{bibref|RFC3315}} prefix delegation {{bibref|RFC3633}}.  See also {{object|.DHCPv6.Client}}.

        * Automatically via internal CPE logic, e.g. creation of child prefixes derived from a parent prefix.

        * Manually via a GUI or some other local management interface.

        * Manually via factory default configuration.

        * By the ACS.

        The CPE MAY choose not to create {{object}} entries for {{enum|WellKnown|Origin}} prefixes or for the ULA /48 prefix {{bibref|RFC4193}}. If an {{object}} entry exists for the ULA /48 prefix, it MUST be on a downstream interface (i.e. an interface for which the physical layer interface object has ''Upstream'' = {{false}}).

        This object is based on ''ipAddressPrefixTable'' from {{bibref|RFC4293}}.
	 *
	 * @param ipv6Prefix the input value
	 * @return this instance
	 */
	public Interface withIPv6Prefix(IPv6Prefix ipv6Prefix) {
		getIpv6Prefixs().add(ipv6Prefix);
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Interface withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}