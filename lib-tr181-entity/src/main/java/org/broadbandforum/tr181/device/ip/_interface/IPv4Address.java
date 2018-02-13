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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * IPv4 address table. Entries are auto-created and auto-deleted as IP addresses are added and deleted via DHCP, auto-IP, or IPCP. Static entries are created and configured by the ACS.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.Interface.{i}.IPv4Address.{i}.")
@XmlRootElement(name = "Device.IP.Interface.IPv4Address")
@XmlType(name = "Device.IP.Interface.IPv4Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class IPv4Address {

	/**
	 * Enables or disables this IPv4 address.
	 *
	 * @since 2.0
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
	 * {{datatype|expand}}

          This parameter can only be modified if {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * IPv4 address.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IPAddress")
	@CWMPParameter(access = "readWrite")
	public org.broadbandforum.tr181.datatypes.IPv4Address ipaddress;
	/**
	 * Subnet mask.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	public org.broadbandforum.tr181.datatypes.IPv4Address subnetMask;
	/**
	 * Addressing method used to assign the IP address. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AddressingType")
	public String addressingType = "Static";

	public IPv4Address() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this IPv4 address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this IPv4 address.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this IPv4 address.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public IPv4Address withEnable(Boolean enable) {
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
	public IPv4Address withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}

          This parameter can only be modified if {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}

          This parameter can only be modified if {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}

          This parameter can only be modified if {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public IPv4Address withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the ipv4 address.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv4Address getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the ipv4 address.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(org.broadbandforum.tr181.datatypes.IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the ipv4 address.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public IPv4Address withIpaddress(org.broadbandforum.tr181.datatypes.IPv4Address ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the subnet mask.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public org.broadbandforum.tr181.datatypes.IPv4Address getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the subnet mask.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(org.broadbandforum.tr181.datatypes.IPv4Address subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the subnet mask.

          This parameter can only be modified if the {{param|AddressingType}} is {{enum|Static|AddressingType}}.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public IPv4Address withSubnetMask(org.broadbandforum.tr181.datatypes.IPv4Address subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get addressing method used to assign the IP address. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAddressingType() {
		return addressingType;
	}

	/**
	 * Set addressing method used to assign the IP address. {{enum}}
	 *
	 * @since 2.0
	 * @param addressingType the input value
	 */
	public void  setAddressingType(String addressingType) {
		this.addressingType = addressingType;
	}

	/**
	 * Set addressing method used to assign the IP address. {{enum}}
	 *
	 * @since 2.0
	 * @param addressingType the input value
	 * @return this instance
	 */
	public IPv4Address withAddressingType(String addressingType) {
		this.addressingType = addressingType;
		return this;
	}

	//</editor-fold>

}