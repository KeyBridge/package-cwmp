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
package org.broadbandforum.tr181.device.ip._interface;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

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
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.IP.Interface.{i}.IPv6Address.{i}.")
@XmlRootElement(name = "IPv6Address")
@XmlType(name = "Device.IP.Interface.IPv6Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv6Address {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The status of this {{object}} table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Status")
	public String status = "Disabled";
	/**
	 * The status of {{param|IPAddress}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPAddressStatus")
	public String ipaddressStatus = "Invalid";
	/**
	 * {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * IPv6 address.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressAddr'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "IPAddress")
	@CWMPParameter(access = "readWrite")
	public org.broadbandforum.tr181.datatypes.IPv6Address ipaddress;
	/**
	 * Mechanism via which the IP address was assigned.  {{enum}}

          This parameter is based on ''ipOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Origin")
	public String origin = "Static";
	/**
	 * IPv6 address prefix.

          Some addresses, e.g. addresses assigned via the DHCPv6 IA_NA option, are not associated with a prefix, and some {{enum|WellKnown|#.IPv6Prefix.{i}.Origin}} prefixes might not be modeled.  In both of these cases {{param}} will be {{null}}.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Prefix")
	@CWMPParameter(access = "readWrite")
	public String prefix;
	/**
	 * The time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "PreferredLifetime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime preferredLifetime = LocalDateTime.parse("9999-12-31T23:59:59Z");;
	/**
	 * The time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "ValidLifetime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime validLifetime = LocalDateTime.parse("9999-12-31T23:59:59Z");;
	/**
	 * Indicates whether this is an anycast address {{bibref|RFC4291|Section 2.6}}.  Anycast addresses are syntactically identical to unicast addresses and so need to be configured explicitly.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressType'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Anycast")
	@CWMPParameter(access = "readWrite")
	public Boolean anycast = false;

	public IPv6Address() {
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
	public IPv6Address withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this {{object}} table entry.  {{enum}}

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
	 * Set the status of this {{object}} table entry.  {{enum}}

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
	 * Set the status of this {{object}} table entry.  {{enum}}

          The {{enum|Error_Misconfigured}} value indicates that a necessary configuration value is undefined or invalid.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.2
	 * @param status the input value
	 * @return this instance
	 */
	public IPv6Address withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the status of {{param|IPAddress}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getIpaddressStatus() {
		return ipaddressStatus;
	}

	/**
	 * Set the status of {{param|IPAddress}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param ipaddressStatus the input value
	 */
	public void  setIpaddressStatus(String ipaddressStatus) {
		this.ipaddressStatus = ipaddressStatus;
	}

	/**
	 * Set the status of {{param|IPAddress}}, indicating whether it can be used for communication.  See also {{param|PreferredLifetime}} and {{param|ValidLifetime}}.  {{enum}}

          This parameter is based on ''ipAddressStatus'' and ''ipAddressStatusTC'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param ipaddressStatus the input value
	 * @return this instance
	 */
	public IPv6Address withIpaddressStatus(String ipaddressStatus) {
		this.ipaddressStatus = ipaddressStatus;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}

          This parameter can only be modified if {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public IPv6Address withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the ipv6 address.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressAddr'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv6Address getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the ipv6 address.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressAddr'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(org.broadbandforum.tr181.datatypes.IPv6Address ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the ipv6 address.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressAddr'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public IPv6Address withIpaddress(org.broadbandforum.tr181.datatypes.IPv6Address ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the mechanism via which the IP address was assigned.  {{enum}}

          This parameter is based on ''ipOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Set the mechanism via which the IP address was assigned.  {{enum}}

          This parameter is based on ''ipOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param origin the input value
	 */
	public void  setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Set the mechanism via which the IP address was assigned.  {{enum}}

          This parameter is based on ''ipOrigin'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param origin the input value
	 * @return this instance
	 */
	public IPv6Address withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Get the ipv6 address prefix.

          Some addresses, e.g. addresses assigned via the DHCPv6 IA_NA option, are not associated with a prefix, and some {{enum|WellKnown|#.IPv6Prefix.{i}.Origin}} prefixes might not be modeled.  In both of these cases {{param}} will be {{null}}.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * Set the ipv6 address prefix.

          Some addresses, e.g. addresses assigned via the DHCPv6 IA_NA option, are not associated with a prefix, and some {{enum|WellKnown|#.IPv6Prefix.{i}.Origin}} prefixes might not be modeled.  In both of these cases {{param}} will be {{null}}.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 */
	public void  setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * Set the ipv6 address prefix.

          Some addresses, e.g. addresses assigned via the DHCPv6 IA_NA option, are not associated with a prefix, and some {{enum|WellKnown|#.IPv6Prefix.{i}.Origin}} prefixes might not be modeled.  In both of these cases {{param}} will be {{null}}.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressPrefix'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param prefix the input value
	 * @return this instance
	 */
	public IPv6Address withPrefix(String prefix) {
		this.prefix = prefix;
		return this;
	}

	/**
	 * Get the time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getPreferredLifetime() {
		return preferredLifetime;
	}

	/**
	 * Set the time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 */
	public void  setPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
	}

	/**
	 * Set the time at which this address will cease to be preferred (i.e. will become deprecated), or {{null}} if not known. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param preferredLifetime the input value
	 * @return this instance
	 */
	public IPv6Address withPreferredLifetime(LocalDateTime preferredLifetime) {
		this.preferredLifetime = preferredLifetime;
		return this;
	}

	/**
	 * Get the time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getValidLifetime() {
		return validLifetime;
	}

	/**
	 * Set the time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 */
	public void  setValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
	}

	/**
	 * Set the time at which this address will cease to be valid (i.e. will become invalid), or {{null}} if unknown. For an infinite lifetime, the parameter value MUST be 9999-12-31T23:59:59Z.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.
	 *
	 * @since 2.2
	 * @param validLifetime the input value
	 * @return this instance
	 */
	public IPv6Address withValidLifetime(LocalDateTime validLifetime) {
		this.validLifetime = validLifetime;
		return this;
	}

	/**
	 * Get the indicates whether this is an anycast address {{bibref|RFC4291|Section 2.6}}.  Anycast addresses are syntactically identical to unicast addresses and so need to be configured explicitly.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressType'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isAnycast() {
		return anycast;
	}

	/**
	 * Set the indicates whether this is an anycast address {{bibref|RFC4291|Section 2.6}}.  Anycast addresses are syntactically identical to unicast addresses and so need to be configured explicitly.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressType'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param anycast the input value
	 */
	public void  setAnycast(Boolean anycast) {
		this.anycast = anycast;
	}

	/**
	 * Set the indicates whether this is an anycast address {{bibref|RFC4291|Section 2.6}}.  Anycast addresses are syntactically identical to unicast addresses and so need to be configured explicitly.

          This parameter can only be modified if the {{param|Origin}} is {{enum|Static|Origin}}.

          This parameter is based on ''ipAddressType'' from {{bibref|RFC4293}}.
	 *
	 * @since 2.2
	 * @param anycast the input value
	 * @return this instance
	 */
	public IPv6Address withAnycast(Boolean anycast) {
		this.anycast = anycast;
		return this;
	}

	//</editor-fold>

}