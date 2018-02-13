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
package org.broadbandforum.tr181.device.dhcpv6.server.pool;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.dhcpv6.server.pool.client.IPv6Prefix;
import org.broadbandforum.tr181.device.dhcpv6.server.pool.client.Option;

	/**
	 * DHCPv6 client table.

        This table lists details of DHCPv6 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Server.Pool.{i}.Client.{i}.")
@XmlRootElement(name = "Client")
@XmlType(name = "Device.DHCPv6.Server.Pool.Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	/**
	 * {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Source address of the DHCPv6 client.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceAddress")
	public org.broadbandforum.tr181.datatypes.IPv6Address sourceAddress;
	/**
	 * Whether or not the DHCPv6 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv6 clients is OPTIONAL.  If the CPE includes inactive DHCPv6 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv6 client.  The length of time an inactive DHCPv6 client remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * IPv6 addresses assigned to this client via IA_NA.
	 */
	@XmlElementWrapper(name = "IPv6Addresss")
	@XmlElement(name = "IPv6Address")
	public Collection<org.broadbandforum.tr181.device.dhcpv6.server.pool.client.IPv6Address> ipv6Addresss;
	/**
	 * IPv6 prefixes delegated to this client via IA_PD.
	 */
	@XmlElementWrapper(name = "IPv6Prefixs")
	@XmlElement(name = "IPv6Prefix")
	public Collection<IPv6Prefix> ipv6Prefixs;
	/**
	 * DHCPv6 options supplied by this client, e.g. ''DUID'' (Option 1), ''UserClassID'' (Option 15) or ''VendorClassID'' (option 16).
	 */
	@XmlElementWrapper(name = "Options")
	@XmlElement(name = "Option")
	public Collection<Option> options;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}

          Note: There is no guarantee that the {{param}} value on automatically-created {{object}} instances will be retained. This is because automatically-created {{object}} instances can be transitory.
	 *
	 * @since 2.2
	 * @param alias the input value
	 * @return this instance
	 */
	public Client withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the source address of the DHCPv6 client.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv6Address getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * Set the source address of the DHCPv6 client.
	 *
	 * @since 2.2
	 * @param sourceAddress the input value
	 */
	public void  setSourceAddress(org.broadbandforum.tr181.datatypes.IPv6Address sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	/**
	 * Set the source address of the DHCPv6 client.
	 *
	 * @since 2.2
	 * @param sourceAddress the input value
	 * @return this instance
	 */
	public Client withSourceAddress(org.broadbandforum.tr181.datatypes.IPv6Address sourceAddress) {
		this.sourceAddress = sourceAddress;
		return this;
	}

	/**
	 * Get the whether or not the DHCPv6 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv6 clients is OPTIONAL.  If the CPE includes inactive DHCPv6 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv6 client.  The length of time an inactive DHCPv6 client remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not the DHCPv6 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv6 clients is OPTIONAL.  If the CPE includes inactive DHCPv6 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv6 client.  The length of time an inactive DHCPv6 client remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not the DHCPv6 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv6 clients is OPTIONAL.  If the CPE includes inactive DHCPv6 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv6 client.  The length of time an inactive DHCPv6 client remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @param active the input value
	 * @return this instance
	 */
	public Client withActive(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Get the ipv6 addresses assigned to this client via IA_NA.
	 *
	 * @return the value
	 */
	public Collection<org.broadbandforum.tr181.device.dhcpv6.server.pool.client.IPv6Address> getIpv6Addresss() {
		if (this.ipv6Addresss == null){ this.ipv6Addresss=new ArrayList<>();}
		return ipv6Addresss;
	}

	/**
	 * Set the ipv6 addresses assigned to this client via IA_NA.
	 *
	 * @param ipv6Addresss the input value
	 */
	public void  setIpv6Addresss(Collection<org.broadbandforum.tr181.device.dhcpv6.server.pool.client.IPv6Address> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;
	}

	/**
	 * Set the ipv6 addresses assigned to this client via IA_NA.
	 *
	 * @param ipv6Address the input value
	 * @return this instance
	 */
	public Client withIPv6Address(org.broadbandforum.tr181.device.dhcpv6.server.pool.client.IPv6Address ipv6Address) {
		getIpv6Addresss().add(ipv6Address);
		return this;
	}

	/**
	 * Get the ipv6 prefixes delegated to this client via IA_PD.
	 *
	 * @return the value
	 */
	public Collection<IPv6Prefix> getIpv6Prefixs() {
		if (this.ipv6Prefixs == null){ this.ipv6Prefixs=new ArrayList<>();}
		return ipv6Prefixs;
	}

	/**
	 * Set the ipv6 prefixes delegated to this client via IA_PD.
	 *
	 * @param ipv6Prefixs the input value
	 */
	public void  setIpv6Prefixs(Collection<IPv6Prefix> ipv6Prefixs) {
		this.ipv6Prefixs = ipv6Prefixs;
	}

	/**
	 * Set the ipv6 prefixes delegated to this client via IA_PD.
	 *
	 * @param ipv6Prefix the input value
	 * @return this instance
	 */
	public Client withIPv6Prefix(IPv6Prefix ipv6Prefix) {
		getIpv6Prefixs().add(ipv6Prefix);
		return this;
	}

	/**
	 * Get the dhcPv6 options supplied by this client, e.g. ''DUID'' (Option 1), ''UserClassID'' (Option 15) or ''VendorClassID'' (option 16).
	 *
	 * @return the value
	 */
	public Collection<Option> getOptions() {
		if (this.options == null){ this.options=new ArrayList<>();}
		return options;
	}

	/**
	 * Set the dhcPv6 options supplied by this client, e.g. ''DUID'' (Option 1), ''UserClassID'' (Option 15) or ''VendorClassID'' (option 16).
	 *
	 * @param options the input value
	 */
	public void  setOptions(Collection<Option> options) {
		this.options = options;
	}

	/**
	 * Set the dhcPv6 options supplied by this client, e.g. ''DUID'' (Option 1), ''UserClassID'' (Option 15) or ''VendorClassID'' (option 16).
	 *
	 * @param option the input value
	 * @return this instance
	 */
	public Client withOption(Option option) {
		getOptions().add(option);
		return this;
	}

	//</editor-fold>

}