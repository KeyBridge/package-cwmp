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
package org.broadbandforum.tr181.device.lldp.discovery.device.deviceinformation;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127). 

        {{keys}}

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI''), the organizationally defined subtype in the sixth octet is 1 (''Device Information''), and the device information ID in the seventh octet is 255 (''Vendor-specific extension field'').
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.LLDP.Discovery.Device.{i}.DeviceInformation.VendorSpecific.{i}.")
@XmlRootElement(name = "VendorSpecific")
@XmlType(name = "Device.LLDP.Discovery.Device.DeviceInformation.VendorSpecific")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorSpecific {

	/**
	 * The vendor-specific organization code, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "OrganizationCode")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String organizationCode;
	/**
	 * The vendor-specific device information type, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "InformationType")
	@Size(max = 255)
	public Long informationType;
	/**
	 * The vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Information")
	@Size(max = 248)
	public String information;

	public VendorSpecific() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the vendor-specific organization code, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getOrganizationCode() {
		return organizationCode;
	}

	/**
	 * Set the vendor-specific organization code, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @param organizationCode the input value
	 */
	public void  setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	/**
	 * Set the vendor-specific organization code, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @param organizationCode the input value
	 * @return this instance
	 */
	public VendorSpecific withOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
		return this;
	}

	/**
	 * Get the vendor-specific device information type, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getInformationType() {
		return informationType;
	}

	/**
	 * Set the vendor-specific device information type, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @param informationType the input value
	 */
	public void  setInformationType(Long informationType) {
		this.informationType = informationType;
	}

	/**
	 * Set the vendor-specific device information type, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @param informationType the input value
	 * @return this instance
	 */
	public VendorSpecific withInformationType(Long informationType) {
		this.informationType = informationType;
		return this;
	}

	/**
	 * Get the vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * Set the vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @param information the input value
	 */
	public void  setInformation(String information) {
		this.information = information;
	}

	/**
	 * Set the vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).
	 *
	 * @since 2.8
	 * @param information the input value
	 * @return this instance
	 */
	public VendorSpecific withInformation(String information) {
		this.information = information;
		return this;
	}

	//</editor-fold>

}