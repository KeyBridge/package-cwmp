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
package org.broadbandforum.tr196.fapservice.accessmgmt.cdma2000.localipaccess.hrpd;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;
import org.broadbandforum.tr196.datatypes.IPv4Address;

	/**
	 * HRPD LIPA Egress Filter Table entries.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.EgressFilter.{i}.")
public class EgressFilter {

	/**
	 * Enables or disables the {{object}} entry.
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
	 * The IP subnet of the egress filter to be installed to the AT. The meaning of this field depends on the  {{param|.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.FilterType}} field.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Subnet")
	@CWMPParameter(access = "readWrite")
	public IPv4Address subnet;
	/**
	 * The length of the IP subnetmask associated with the IP subnet in the previous field.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 32)
	public Long subnetMask = 0L;

	public EgressFilter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public EgressFilter withEnable(Boolean enable) {
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
	public EgressFilter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the IP subnet of the egress filter to be installed to the AT. The meaning of this field depends on the  {{param|.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.FilterType}} field.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPv4Address getSubnet() {
		return subnet;
	}

	/**
	 * Set the IP subnet of the egress filter to be installed to the AT. The meaning of this field depends on the  {{param|.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.FilterType}} field.
	 *
	 * @since 2.0
	 * @param subnet the input value
	 */
	public void  setSubnet(IPv4Address subnet) {
		this.subnet = subnet;
	}

	/**
	 * Set the IP subnet of the egress filter to be installed to the AT. The meaning of this field depends on the  {{param|.AccessMgmt.CDMA2000.LocalIPAccess.HRPD.FilterType}} field.
	 *
	 * @since 2.0
	 * @param subnet the input value
	 * @return this instance
	 */
	public EgressFilter withSubnet(IPv4Address subnet) {
		this.subnet = subnet;
		return this;
	}

	/**
	 * Get the length of the IP subnetmask associated with the IP subnet in the previous field.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the length of the IP subnetmask associated with the IP subnet in the previous field.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(Long subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the length of the IP subnetmask associated with the IP subnet in the previous field.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public EgressFilter withSubnetMask(Long subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	//</editor-fold>

}