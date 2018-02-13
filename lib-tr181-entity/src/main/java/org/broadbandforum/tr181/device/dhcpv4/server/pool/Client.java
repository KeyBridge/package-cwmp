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
package org.broadbandforum.tr181.device.dhcpv4.server.pool;

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
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.dhcpv4.server.pool.client.IPv4Address;
import org.broadbandforum.tr181.device.dhcpv4.server.pool.client.Option;

	/**
	 * DHCPv4 client table.

        This table lists details of DHCPv4 clients that matched the filter criteria of this {{object|#}} entry.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.DHCPv4.Server.Pool.{i}.Client.{i}.")
@XmlRootElement(name = "Client")
@XmlType(name = "Device.DHCPv4.Server.Pool.Client")
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
	 * MAC address of the DHCPv4 client.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Chaddr")
	public MACAddress chaddr;
	/**
	 * Whether or not the DHCPv4 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv4 clients is OPTIONAL.  If the CPE includes inactive DHCPv4 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv4 client.  The length of time an inactive DHCPv4 client remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Active")
	public Boolean active;
	/**
	 * IPv4 addresses assigned to this client.
	 */
	@XmlElementWrapper(name = "IPv4Addresss")
	@XmlElement(name = "IPv4Address")
	public Collection<IPv4Address> ipv4Addresss;
	/**
	 * DHCPv4 options supplied by this client, e.g. ''VendorClassID'' (Option 60), ''ClientID'' (option 61) or ''UserClassID'' (Option 77).
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
	 * Get the mac address of the DHCPv4 client.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public MACAddress getChaddr() {
		return chaddr;
	}

	/**
	 * Set the mac address of the DHCPv4 client.
	 *
	 * @since 2.2
	 * @param chaddr the input value
	 */
	public void  setChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
	}

	/**
	 * Set the mac address of the DHCPv4 client.
	 *
	 * @since 2.2
	 * @param chaddr the input value
	 * @return this instance
	 */
	public Client withChaddr(MACAddress chaddr) {
		this.chaddr = chaddr;
		return this;
	}

	/**
	 * Get the whether or not the DHCPv4 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv4 clients is OPTIONAL.  If the CPE includes inactive DHCPv4 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv4 client.  The length of time an inactive DHCPv4 client remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isActive() {
		return active;
	}

	/**
	 * Set the whether or not the DHCPv4 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv4 clients is OPTIONAL.  If the CPE includes inactive DHCPv4 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv4 client.  The length of time an inactive DHCPv4 client remains listed in this table is a local matter to the CPE.
	 *
	 * @since 2.2
	 * @param active the input value
	 */
	public void  setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Set the whether or not the DHCPv4 client is currently present on the LAN.  The method of presence detection is a local matter to  the CPE.

          The ability to list inactive DHCPv4 clients is OPTIONAL.  If the CPE includes inactive DHCPv4 clients in this table, {{param}} MUST be set to {{false}}  for each inactive DHCPv4 client.  The length of time an inactive DHCPv4 client remains listed in this table is a local matter to the CPE.
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
	 * Get the ipv4 addresses assigned to this client.
	 *
	 * @return the value
	 */
	public Collection<IPv4Address> getIpv4Addresss() {
		if (this.ipv4Addresss == null){ this.ipv4Addresss=new ArrayList<>();}
		return ipv4Addresss;
	}

	/**
	 * Set the ipv4 addresses assigned to this client.
	 *
	 * @param ipv4Addresss the input value
	 */
	public void  setIpv4Addresss(Collection<IPv4Address> ipv4Addresss) {
		this.ipv4Addresss = ipv4Addresss;
	}

	/**
	 * Set the ipv4 addresses assigned to this client.
	 *
	 * @param ipv4Address the input value
	 * @return this instance
	 */
	public Client withIPv4Address(IPv4Address ipv4Address) {
		getIpv4Addresss().add(ipv4Address);
		return this;
	}

	/**
	 * Get the dhcPv4 options supplied by this client, e.g. ''VendorClassID'' (Option 60), ''ClientID'' (option 61) or ''UserClassID'' (Option 77).
	 *
	 * @return the value
	 */
	public Collection<Option> getOptions() {
		if (this.options == null){ this.options=new ArrayList<>();}
		return options;
	}

	/**
	 * Set the dhcPv4 options supplied by this client, e.g. ''VendorClassID'' (Option 60), ''ClientID'' (option 61) or ''UserClassID'' (Option 77).
	 *
	 * @param options the input value
	 */
	public void  setOptions(Collection<Option> options) {
		this.options = options;
	}

	/**
	 * Set the dhcPv4 options supplied by this client, e.g. ''VendorClassID'' (Option 60), ''ClientID'' (option 61) or ''UserClassID'' (Option 77).
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