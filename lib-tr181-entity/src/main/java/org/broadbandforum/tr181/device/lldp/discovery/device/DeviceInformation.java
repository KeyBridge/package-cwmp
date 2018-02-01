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
package org.broadbandforum.tr181.device.lldp.discovery.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.device.lldp.discovery.device.deviceinformation.VendorSpecific;

	/**
	 * The device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127).

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI'') and the organizationally defined subtype in the sixth octet is 1 (''Device Information'').
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.LLDP.Discovery.Device.{i}.DeviceInformation.")
public class DeviceInformation {

	/**
	 * Each list item indicates a device category (e.g."AV_TV" and "AV_Recorder"), or the value is {{empty}} if no device categories were provided.

          Note: It is assumed that this list might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DeviceCategory")
	@XmlList
	public Collection<String> deviceCategory;
	/**
	 * The manufacturer OUI, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no manufacturer OUI was provided.

          {{pattern}}
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ManufacturerOUI")
	@Size(min = 0, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String manufacturerOUI;
	/**
	 * The model name, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model name was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ModelName")
	@Size(max = 31)
	public String modelName;
	/**
	 * The model number, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model number was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ModelNumber")
	@Size(max = 31)
	public String modelNumber;
	/**
	 * The vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127). 

        {{keys}}

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI''), the organizationally defined subtype in the sixth octet is 1 (''Device Information''), and the device information ID in the seventh octet is 255 (''Vendor-specific extension field'').
	 */
	@XmlElementWrapper(name = "vendorSpecifics")
	@XmlElement(name = "VendorSpecific")
	public Collection<VendorSpecific> vendorSpecifics;

	public DeviceInformation() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each list item indicates a device category (e.g."AV_TV" and "AV_Recorder"), or the value is {{empty}} if no device categories were provided.

          Note: It is assumed that this list might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getDeviceCategory() {
		if (this.deviceCategory == null){ this.deviceCategory=new ArrayList<>();}
		return deviceCategory;
	}

	/**
	 * Set the each list item indicates a device category (e.g."AV_TV" and "AV_Recorder"), or the value is {{empty}} if no device categories were provided.

          Note: It is assumed that this list might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.
	 *
	 * @since 2.8
	 * @param deviceCategory the input value
	 */
	public void  setDeviceCategory(Collection<String> deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	/**
	 * Set the each list item indicates a device category (e.g."AV_TV" and "AV_Recorder"), or the value is {{empty}} if no device categories were provided.

          Note: It is assumed that this list might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public DeviceInformation withDeviceCategory(String string) {
		getDeviceCategory().add(string);
		return this;
	}

	/**
	 * Get the manufacturer OUI, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no manufacturer OUI was provided.

          {{pattern}}
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the manufacturer OUI, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no manufacturer OUI was provided.

          {{pattern}}
	 *
	 * @since 2.8
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the manufacturer OUI, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no manufacturer OUI was provided.

          {{pattern}}
	 *
	 * @since 2.8
	 * @param manufacturerOUI the input value
	 * @return this instance
	 */
	public DeviceInformation withManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
		return this;
	}

	/**
	 * Get the model name, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model name was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * Set the model name, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model name was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @param modelName the input value
	 */
	public void  setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * Set the model name, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model name was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @param modelName the input value
	 * @return this instance
	 */
	public DeviceInformation withModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	/**
	 * Get the model number, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model number was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * Set the model number, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model number was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @param modelNumber the input value
	 */
	public void  setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * Set the model number, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127), or {{empty}} if no model number was provided.

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @param modelNumber the input value
	 * @return this instance
	 */
	public DeviceInformation withModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
		return this;
	}

	/**
	 * Get the vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127). 

        {{keys}}

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI''), the organizationally defined subtype in the sixth octet is 1 (''Device Information''), and the device information ID in the seventh octet is 255 (''Vendor-specific extension field'').
	 *
	 * @return the value
	 */
	public Collection<VendorSpecific> getVendorSpecifics() {
		if (this.vendorSpecifics == null){ this.vendorSpecifics=new ArrayList<>();}
		return vendorSpecifics;
	}

	/**
	 * Set the vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127). 

        {{keys}}

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI''), the organizationally defined subtype in the sixth octet is 1 (''Device Information''), and the device information ID in the seventh octet is 255 (''Vendor-specific extension field'').
	 *
	 * @param vendorSpecifics the input value
	 */
	public void  setVendorSpecifics(Collection<VendorSpecific> vendorSpecifics) {
		this.vendorSpecifics = vendorSpecifics;
	}

	/**
	 * Set the vendor-specific device information, which is included in the value of the ''LLDPDU's'' Organizationally Specific TLV (TLV Type = 127). 

        {{keys}}

        Note: It is assumed that this object might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, this table contains the Organizationally Specific TLV (TLV Type = 127) of ''LLDPDU'', in which the {{bibref|OUI}} in the third octet is E0271A (''TTC-OUI''), the organizationally defined subtype in the sixth octet is 1 (''Device Information''), and the device information ID in the seventh octet is 255 (''Vendor-specific extension field'').
	 *
	 * @param vendorSpecific the input value
	 * @return this instance
	 */
	public DeviceInformation withVendorSpecific(VendorSpecific vendorSpecific) {
		getVendorSpecifics().add(vendorSpecific);
		return this;
	}

	//</editor-fold>

}