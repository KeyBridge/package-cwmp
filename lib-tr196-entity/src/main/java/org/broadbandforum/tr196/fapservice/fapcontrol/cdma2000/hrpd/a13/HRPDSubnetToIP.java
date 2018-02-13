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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.hrpd.a13;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;
import org.broadbandforum.tr196.datatypes.IPAddress;

	/**
	 * This object contains attributes related to A13 Session Transfer
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.HRPDSubnetToIP.{i}.")
@XmlRootElement(name = "FAPService.FAPControl.CDMA2000.HRPD.A13.HRPDSubnetToIP")
@XmlType(name = "FAPService.FAPControl.CDMA2000.HRPD.A13.HRPDSubnetToIP")
@XmlAccessorType(XmlAccessType.FIELD)
public class HRPDSubnetToIP {

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
	 * The number of MSBs (in bits) in the following field that is part of HRPDSubnet
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDSubnetLength")
	@CWMPParameter(access = "readWrite", units = "bits")
	@Size(min = 1, max = 104)
	public Long hrpDSubnetLength = 104L;
	/**
	 * The {{param|HRPDSubnetLength}} MSBs of this field contain the HRPD subnet that maps to the IP address in the following field
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDSubnet")
	@CWMPParameter(access = "readWrite")
	public byte[] hrpDSubnet;
	/**
	 * This field contains the IP address of A13 endpoint that corresponds to the HRPD subnet
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A13IPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress a13IPAddress;

	public HRPDSubnetToIP() {
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
	public HRPDSubnetToIP withEnable(Boolean enable) {
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
	public HRPDSubnetToIP withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the number of MSBs (in bits) in the following field that is part of HRPDSubnet
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHrpDSubnetLength() {
		return hrpDSubnetLength;
	}

	/**
	 * Set the number of MSBs (in bits) in the following field that is part of HRPDSubnet
	 *
	 * @since 2.0
	 * @param hrpDSubnetLength the input value
	 */
	public void  setHrpDSubnetLength(Long hrpDSubnetLength) {
		this.hrpDSubnetLength = hrpDSubnetLength;
	}

	/**
	 * Set the number of MSBs (in bits) in the following field that is part of HRPDSubnet
	 *
	 * @since 2.0
	 * @param hrpDSubnetLength the input value
	 * @return this instance
	 */
	public HRPDSubnetToIP withHrpDSubnetLength(Long hrpDSubnetLength) {
		this.hrpDSubnetLength = hrpDSubnetLength;
		return this;
	}

	/**
	 * Get the {{param|HRPDSubnetLength}} MSBs of this field contain the HRPD subnet that maps to the IP address in the following field
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getHrpDSubnet() {
		return hrpDSubnet;
	}

	/**
	 * Set the {{param|HRPDSubnetLength}} MSBs of this field contain the HRPD subnet that maps to the IP address in the following field
	 *
	 * @since 2.0
	 * @param hrpDSubnet the input value
	 */
	public void  setHrpDSubnet(byte[] hrpDSubnet) {
		this.hrpDSubnet = hrpDSubnet;
	}

	/**
	 * Set the {{param|HRPDSubnetLength}} MSBs of this field contain the HRPD subnet that maps to the IP address in the following field
	 *
	 * @since 2.0
	 * @param hrpDSubnet the input value
	 * @return this instance
	 */
	public HRPDSubnetToIP withHrpDSubnet(byte[] hrpDSubnet) {
		this.hrpDSubnet = hrpDSubnet;
		return this;
	}

	/**
	 * Get the this field contains the IP address of A13 endpoint that corresponds to the HRPD subnet
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getA13IPAddress() {
		return a13IPAddress;
	}

	/**
	 * Set the this field contains the IP address of A13 endpoint that corresponds to the HRPD subnet
	 *
	 * @since 2.0
	 * @param a13IPAddress the input value
	 */
	public void  setA13IPAddress(IPAddress a13IPAddress) {
		this.a13IPAddress = a13IPAddress;
	}

	/**
	 * Set the this field contains the IP address of A13 endpoint that corresponds to the HRPD subnet
	 *
	 * @since 2.0
	 * @param a13IPAddress the input value
	 * @return this instance
	 */
	public HRPDSubnetToIP withA13IPAddress(IPAddress a13IPAddress) {
		this.a13IPAddress = a13IPAddress;
		return this;
	}

	//</editor-fold>

}