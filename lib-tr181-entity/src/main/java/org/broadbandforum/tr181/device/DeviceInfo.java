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
package org.broadbandforum.tr181.device;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.deviceinfo.Location;
import org.broadbandforum.tr181.device.deviceinfo.MemoryStatus;
import org.broadbandforum.tr181.device.deviceinfo.NetworkProperties;
import org.broadbandforum.tr181.device.deviceinfo.ProcessStatus;
import org.broadbandforum.tr181.device.deviceinfo.Processor;
import org.broadbandforum.tr181.device.deviceinfo.ProxierInfo;
import org.broadbandforum.tr181.device.deviceinfo.SupportedDataModel;
import org.broadbandforum.tr181.device.deviceinfo.TemperatureStatus;
import org.broadbandforum.tr181.device.deviceinfo.VendorConfigFile;
import org.broadbandforum.tr181.device.deviceinfo.VendorLogFile;

	/**
	 * This object contains general device information.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DeviceInfo.")
@XmlRootElement(name = "Device.DeviceInfo")
@XmlType(name = "Device.DeviceInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceInfo {

	/**
	 * Each list item is a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

          Note: It is assumed that this list might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DeviceCategory")
	@XmlList
	public Collection<String> deviceCategory;
	/**
	 * The manufacturer of the CPE (human readable string).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Manufacturer")
	@Size(max = 64)
	public String manufacturer;
	/**
	 * Organizationally unique identifier of the device manufacturer.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ManufacturerOUI")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String manufacturerOUI;
	/**
	 * Model name of the CPE (human readable string).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModelName")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 64)
	public String modelName;
	/**
	 * The model number of the device (human readable string), or {{empty}} if no model number is provided by the device. 

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the maximum length of the string is 31.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ModelNumber")
	@Size(max = 64)
	public String modelNumber;
	/**
	 * A full description of the CPE device (human readable string).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Description")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String description;
	/**
	 * Identifier of the class of product for which the serial number applies.  That is, for a given manufacturer, this  parameter is used to identify the product or class of product over which the {{param|SerialNumber}} parameter is unique.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProductClass")
	@Size(max = 64)
	public String productClass;
	/**
	 * Identifier of the particular device that is unique for the indicated class of product and manufacturer.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * A string identifying the particular CPE model and version.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HardwareVersion")
	@CWMPParameter(forcedInform = true)
	@Size(max = 64)
	public String hardwareVersion;
	/**
	 * A string identifying the software version currently installed in the CPE (i.e. version of the overall CPE  firmware).

          To allow version comparisons, this element SHOULD be in the form of dot-delimited integers, where each successive integer represents  a more minor category of variation.  For example, ''3.0.21'' where the components mean: ''Major.Minor.Build''.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SoftwareVersion")
	@CWMPParameter(activeNotify = "forceEnabled", forcedInform = true)
	@Size(max = 64)
	public String softwareVersion;
	/**
	 * {{list}}  Each entry is an additional version.  Represents any additional hardware version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AdditionalHardwareVersion")
	@Size(max = 64)
	@XmlList
	public Collection<String> additionalHardwareVersion;
	/**
	 * {{list}}  Each entry is an additional version.  Represents any additional software version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AdditionalSoftwareVersion")
	@Size(max = 64)
	@XmlList
	public Collection<String> additionalSoftwareVersion;
	/**
	 * Identifier of the primary service provider and other provisioning information, which MAY be used by the ACS to  determine service provider-specific customization and provisioning parameters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProvisioningCode")
	@CWMPParameter(access = "readWrite", activeNotify = "forceEnabled", forcedInform = true)
	@Size(max = 64)
	public String provisioningCode;
	/**
	 * Time in seconds since the CPE was last restarted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpTime")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long uptime;
	/**
	 * Date and time in UTC that the CPE first both successfully established an IP-layer network connection and acquired an absolute time reference using NTP or equivalent over that network connection.  The CPE MAY reset this date after a factory reset.

          If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirstUseDate")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime firstUseDate;
	/**
	 * Every instance of this object is a Vendor Configuration File, and contains parameters associated with the Vendor  Configuration File.

        This table of Vendor Configuration Files is for information only and does not allow the ACS to operate on these files in any way.

        Whenever the CPE successfully downloads a configuration file as a result of the Download RPC with the FileType argument of ''3 Vendor Configuration File'', the CPE MUST update this table.
	 */
	@XmlElementWrapper(name = "VendorConfigFiles")
	@XmlElement(name = "VendorConfigFile")
	public Collection<VendorConfigFile> vendorConfigFiles;
	/**
	 * This table contains details of the device's Current Supported Data Model.

        The table MUST describe the device's entire Supported Data Model.  Therefore, if a device's Supported Data Model changes at run-time, entries will need to be added or removed as appropriate.

        Each table entry MUST refer to only a single Root Object or Service Object.  The device MAY choose to use more than one table entry for a given Root Object or Service Object.

        Considering that every device has some form of a data model, this table MUST NOT be empty.
	 */
	@XmlElementWrapper(name = "SupportedDataModels")
	@XmlElement(name = "SupportedDataModel")
	public Collection<SupportedDataModel> supportedDataModels;
	/**
	 * Status of the device's volatile physical memory.
	 */
	@XmlElement(name = "MemoryStatus")
	public MemoryStatus memoryStatus;
	/**
	 * Status of the processes on the device.
	 */
	@XmlElement(name = "ProcessStatus")
	public ProcessStatus processStatus;
	/**
	 * Status of the temperature of the device.
	 */
	@XmlElement(name = "TemperatureStatus")
	public TemperatureStatus temperatureStatus;
	/**
	 * This object defines the parameters that describe how the device handles network traffic.
	 */
	@XmlElement(name = "NetworkProperties")
	public NetworkProperties networkProperties;
	/**
	 * Each table entry represents a hardware or virtual processor that resides on this device.
	 */
	@XmlElementWrapper(name = "Processors")
	@XmlElement(name = "Processor")
	public Collection<Processor> processors;
	/**
	 * Each table entry represents a Vendor Log File. 

        This table of log files is informational only and does not allow the ACS to operate on these files in any way.
	 */
	@XmlElementWrapper(name = "VendorLogFiles")
	@XmlElement(name = "VendorLogFile")
	public Collection<VendorLogFile> vendorLogFiles;
	/**
	 * Represents the associated CPE Proxier for a Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}}.
	 */
	@XmlElement(name = "ProxierInfo")
	public ProxierInfo proxierInfo;
	/**
	 * This object contains Location information.
	 */
	@XmlElementWrapper(name = "Locations")
	@XmlElement(name = "Location")
	@CWMPParameter(access = "readWrite")
	public Collection<Location> locations;

	public DeviceInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the each list item is a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

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
	 * Set the each list item is a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

          Note: It is assumed that this list might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.
	 *
	 * @since 2.8
	 * @param deviceCategory the input value
	 */
	public void  setDeviceCategory(Collection<String> deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	/**
	 * Set the each list item is a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

          Note: It is assumed that this list might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public DeviceInfo withDeviceCategory(String string) {
		getDeviceCategory().add(string);
		return this;
	}

	/**
	 * Get the manufacturer of the CPE (human readable string).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Set the manufacturer of the CPE (human readable string).
	 *
	 * @since 2.0
	 * @param manufacturer the input value
	 */
	public void  setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Set the manufacturer of the CPE (human readable string).
	 *
	 * @since 2.0
	 * @param manufacturer the input value
	 * @return this instance
	 */
	public DeviceInfo withManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	/**
	 * Get the organizationally unique identifier of the device manufacturer.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the device manufacturer.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the device manufacturer.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @param manufacturerOUI the input value
	 * @return this instance
	 */
	public DeviceInfo withManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
		return this;
	}

	/**
	 * Get the model name of the CPE (human readable string).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * Set the model name of the CPE (human readable string).
	 *
	 * @since 2.0
	 * @param modelName the input value
	 */
	public void  setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * Set the model name of the CPE (human readable string).
	 *
	 * @since 2.0
	 * @param modelName the input value
	 * @return this instance
	 */
	public DeviceInfo withModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	/**
	 * Get the model number of the device (human readable string), or {{empty}} if no model number is provided by the device. 

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the maximum length of the string is 31.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * Set the model number of the device (human readable string), or {{empty}} if no model number is provided by the device. 

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the maximum length of the string is 31.
	 *
	 * @since 2.8
	 * @param modelNumber the input value
	 */
	public void  setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * Set the model number of the device (human readable string), or {{empty}} if no model number is provided by the device. 

          Note: It is assumed that this string might be used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. In this case, the maximum length of the string is 31.
	 *
	 * @since 2.8
	 * @param modelNumber the input value
	 * @return this instance
	 */
	public DeviceInfo withModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
		return this;
	}

	/**
	 * Get a full description of the CPE device (human readable string).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set a full description of the CPE device (human readable string).
	 *
	 * @since 2.0
	 * @param description the input value
	 */
	public void  setDescription(String description) {
		this.description = description;
	}

	/**
	 * Set a full description of the CPE device (human readable string).
	 *
	 * @since 2.0
	 * @param description the input value
	 * @return this instance
	 */
	public DeviceInfo withDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get the identifier of the class of product for which the serial number applies.  That is, for a given manufacturer, this  parameter is used to identify the product or class of product over which the {{param|SerialNumber}} parameter is unique.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * Set the identifier of the class of product for which the serial number applies.  That is, for a given manufacturer, this  parameter is used to identify the product or class of product over which the {{param|SerialNumber}} parameter is unique.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 */
	public void  setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Set the identifier of the class of product for which the serial number applies.  That is, for a given manufacturer, this  parameter is used to identify the product or class of product over which the {{param|SerialNumber}} parameter is unique.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 * @return this instance
	 */
	public DeviceInfo withProductClass(String productClass) {
		this.productClass = productClass;
		return this;
	}

	/**
	 * Get the identifier of the particular device that is unique for the indicated class of product and manufacturer.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the identifier of the particular device that is unique for the indicated class of product and manufacturer.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the identifier of the particular device that is unique for the indicated class of product and manufacturer.

          This value MUST remain fixed over the lifetime of the device, including across firmware updates. Any change would indicate that it's  a new device and would therefore require a BOOTSTRAP Inform.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public DeviceInfo withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get a string identifying the particular CPE model and version.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHardwareVersion() {
		return hardwareVersion;
	}

	/**
	 * Set a string identifying the particular CPE model and version.
	 *
	 * @since 2.0
	 * @param hardwareVersion the input value
	 */
	public void  setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	/**
	 * Set a string identifying the particular CPE model and version.
	 *
	 * @since 2.0
	 * @param hardwareVersion the input value
	 * @return this instance
	 */
	public DeviceInfo withHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
		return this;
	}

	/**
	 * Get a string identifying the software version currently installed in the CPE (i.e. version of the overall CPE  firmware).

          To allow version comparisons, this element SHOULD be in the form of dot-delimited integers, where each successive integer represents  a more minor category of variation.  For example, ''3.0.21'' where the components mean: ''Major.Minor.Build''.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * Set a string identifying the software version currently installed in the CPE (i.e. version of the overall CPE  firmware).

          To allow version comparisons, this element SHOULD be in the form of dot-delimited integers, where each successive integer represents  a more minor category of variation.  For example, ''3.0.21'' where the components mean: ''Major.Minor.Build''.
	 *
	 * @since 2.0
	 * @param softwareVersion the input value
	 */
	public void  setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/**
	 * Set a string identifying the software version currently installed in the CPE (i.e. version of the overall CPE  firmware).

          To allow version comparisons, this element SHOULD be in the form of dot-delimited integers, where each successive integer represents  a more minor category of variation.  For example, ''3.0.21'' where the components mean: ''Major.Minor.Build''.
	 *
	 * @since 2.0
	 * @param softwareVersion the input value
	 * @return this instance
	 */
	public DeviceInfo withSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
		return this;
	}

	/**
	 * Get the {{list}}  Each entry is an additional version.  Represents any additional hardware version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAdditionalHardwareVersion() {
		if (this.additionalHardwareVersion == null){ this.additionalHardwareVersion=new ArrayList<>();}
		return additionalHardwareVersion;
	}

	/**
	 * Set the {{list}}  Each entry is an additional version.  Represents any additional hardware version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 * @param additionalHardwareVersion the input value
	 */
	public void  setAdditionalHardwareVersion(Collection<String> additionalHardwareVersion) {
		this.additionalHardwareVersion = additionalHardwareVersion;
	}

	/**
	 * Set the {{list}}  Each entry is an additional version.  Represents any additional hardware version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public DeviceInfo withAdditionalHardwareVersion(String string) {
		getAdditionalHardwareVersion().add(string);
		return this;
	}

	/**
	 * Get the {{list}}  Each entry is an additional version.  Represents any additional software version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAdditionalSoftwareVersion() {
		if (this.additionalSoftwareVersion == null){ this.additionalSoftwareVersion=new ArrayList<>();}
		return additionalSoftwareVersion;
	}

	/**
	 * Set the {{list}}  Each entry is an additional version.  Represents any additional software version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 * @param additionalSoftwareVersion the input value
	 */
	public void  setAdditionalSoftwareVersion(Collection<String> additionalSoftwareVersion) {
		this.additionalSoftwareVersion = additionalSoftwareVersion;
	}

	/**
	 * Set the {{list}}  Each entry is an additional version.  Represents any additional software version information the vendor might wish to supply.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public DeviceInfo withAdditionalSoftwareVersion(String string) {
		getAdditionalSoftwareVersion().add(string);
		return this;
	}

	/**
	 * Get the identifier of the primary service provider and other provisioning information, which MAY be used by the ACS to  determine service provider-specific customization and provisioning parameters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProvisioningCode() {
		return provisioningCode;
	}

	/**
	 * Set the identifier of the primary service provider and other provisioning information, which MAY be used by the ACS to  determine service provider-specific customization and provisioning parameters.
	 *
	 * @since 2.0
	 * @param provisioningCode the input value
	 */
	public void  setProvisioningCode(String provisioningCode) {
		this.provisioningCode = provisioningCode;
	}

	/**
	 * Set the identifier of the primary service provider and other provisioning information, which MAY be used by the ACS to  determine service provider-specific customization and provisioning parameters.
	 *
	 * @since 2.0
	 * @param provisioningCode the input value
	 * @return this instance
	 */
	public DeviceInfo withProvisioningCode(String provisioningCode) {
		this.provisioningCode = provisioningCode;
		return this;
	}

	/**
	 * Get the time in seconds since the CPE was last restarted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUptime() {
		return uptime;
	}

	/**
	 * Set the time in seconds since the CPE was last restarted.
	 *
	 * @since 2.0
	 * @param uptime the input value
	 */
	public void  setUptime(Long uptime) {
		this.uptime = uptime;
	}

	/**
	 * Set the time in seconds since the CPE was last restarted.
	 *
	 * @since 2.0
	 * @param uptime the input value
	 * @return this instance
	 */
	public DeviceInfo withUptime(Long uptime) {
		this.uptime = uptime;
		return this;
	}

	/**
	 * Get the date and time in UTC that the CPE first both successfully established an IP-layer network connection and acquired an absolute time reference using NTP or equivalent over that network connection.  The CPE MAY reset this date after a factory reset.

          If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getFirstUseDate() {
		return firstUseDate;
	}

	/**
	 * Set the date and time in UTC that the CPE first both successfully established an IP-layer network connection and acquired an absolute time reference using NTP or equivalent over that network connection.  The CPE MAY reset this date after a factory reset.

          If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param firstUseDate the input value
	 */
	public void  setFirstUseDate(LocalDateTime firstUseDate) {
		this.firstUseDate = firstUseDate;
	}

	/**
	 * Set the date and time in UTC that the CPE first both successfully established an IP-layer network connection and acquired an absolute time reference using NTP or equivalent over that network connection.  The CPE MAY reset this date after a factory reset.

          If NTP or equivalent is not available, this parameter, if present, SHOULD be set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param firstUseDate the input value
	 * @return this instance
	 */
	public DeviceInfo withFirstUseDate(LocalDateTime firstUseDate) {
		this.firstUseDate = firstUseDate;
		return this;
	}

	/**
	 * Get the every instance of this object is a Vendor Configuration File, and contains parameters associated with the Vendor  Configuration File.

        This table of Vendor Configuration Files is for information only and does not allow the ACS to operate on these files in any way.

        Whenever the CPE successfully downloads a configuration file as a result of the Download RPC with the FileType argument of ''3 Vendor Configuration File'', the CPE MUST update this table.
	 *
	 * @return the value
	 */
	public Collection<VendorConfigFile> getVendorConfigFiles() {
		if (this.vendorConfigFiles == null){ this.vendorConfigFiles=new ArrayList<>();}
		return vendorConfigFiles;
	}

	/**
	 * Set the every instance of this object is a Vendor Configuration File, and contains parameters associated with the Vendor  Configuration File.

        This table of Vendor Configuration Files is for information only and does not allow the ACS to operate on these files in any way.

        Whenever the CPE successfully downloads a configuration file as a result of the Download RPC with the FileType argument of ''3 Vendor Configuration File'', the CPE MUST update this table.
	 *
	 * @param vendorConfigFiles the input value
	 */
	public void  setVendorConfigFiles(Collection<VendorConfigFile> vendorConfigFiles) {
		this.vendorConfigFiles = vendorConfigFiles;
	}

	/**
	 * Set the every instance of this object is a Vendor Configuration File, and contains parameters associated with the Vendor  Configuration File.

        This table of Vendor Configuration Files is for information only and does not allow the ACS to operate on these files in any way.

        Whenever the CPE successfully downloads a configuration file as a result of the Download RPC with the FileType argument of ''3 Vendor Configuration File'', the CPE MUST update this table.
	 *
	 * @param vendorConfigFile the input value
	 * @return this instance
	 */
	public DeviceInfo withVendorConfigFile(VendorConfigFile vendorConfigFile) {
		getVendorConfigFiles().add(vendorConfigFile);
		return this;
	}

	/**
	 * Get the this table contains details of the device's Current Supported Data Model.

        The table MUST describe the device's entire Supported Data Model.  Therefore, if a device's Supported Data Model changes at run-time, entries will need to be added or removed as appropriate.

        Each table entry MUST refer to only a single Root Object or Service Object.  The device MAY choose to use more than one table entry for a given Root Object or Service Object.

        Considering that every device has some form of a data model, this table MUST NOT be empty.
	 *
	 * @return the value
	 */
	public Collection<SupportedDataModel> getSupportedDataModels() {
		if (this.supportedDataModels == null){ this.supportedDataModels=new ArrayList<>();}
		return supportedDataModels;
	}

	/**
	 * Set the this table contains details of the device's Current Supported Data Model.

        The table MUST describe the device's entire Supported Data Model.  Therefore, if a device's Supported Data Model changes at run-time, entries will need to be added or removed as appropriate.

        Each table entry MUST refer to only a single Root Object or Service Object.  The device MAY choose to use more than one table entry for a given Root Object or Service Object.

        Considering that every device has some form of a data model, this table MUST NOT be empty.
	 *
	 * @param supportedDataModels the input value
	 */
	public void  setSupportedDataModels(Collection<SupportedDataModel> supportedDataModels) {
		this.supportedDataModels = supportedDataModels;
	}

	/**
	 * Set the this table contains details of the device's Current Supported Data Model.

        The table MUST describe the device's entire Supported Data Model.  Therefore, if a device's Supported Data Model changes at run-time, entries will need to be added or removed as appropriate.

        Each table entry MUST refer to only a single Root Object or Service Object.  The device MAY choose to use more than one table entry for a given Root Object or Service Object.

        Considering that every device has some form of a data model, this table MUST NOT be empty.
	 *
	 * @param supportedDataModel the input value
	 * @return this instance
	 */
	public DeviceInfo withSupportedDataModel(SupportedDataModel supportedDataModel) {
		getSupportedDataModels().add(supportedDataModel);
		return this;
	}

	/**
	 * Get the status of the device's volatile physical memory.
	 *
	 * @return the value
	 */
	public MemoryStatus getMemoryStatus() {
		return memoryStatus;
	}

	/**
	 * Set the status of the device's volatile physical memory.
	 *
	 * @param memoryStatus the input value
	 */
	public void  setMemoryStatus(MemoryStatus memoryStatus) {
		this.memoryStatus = memoryStatus;
	}

	/**
	 * Set the status of the device's volatile physical memory.
	 *
	 * @param memoryStatus the input value
	 * @return this instance
	 */
	public DeviceInfo withMemoryStatus(MemoryStatus memoryStatus) {
		this.memoryStatus = memoryStatus;
		return this;
	}

	/**
	 * Get the status of the processes on the device.
	 *
	 * @return the value
	 */
	public ProcessStatus getProcessStatus() {
		return processStatus;
	}

	/**
	 * Set the status of the processes on the device.
	 *
	 * @param processStatus the input value
	 */
	public void  setProcessStatus(ProcessStatus processStatus) {
		this.processStatus = processStatus;
	}

	/**
	 * Set the status of the processes on the device.
	 *
	 * @param processStatus the input value
	 * @return this instance
	 */
	public DeviceInfo withProcessStatus(ProcessStatus processStatus) {
		this.processStatus = processStatus;
		return this;
	}

	/**
	 * Get the status of the temperature of the device.
	 *
	 * @return the value
	 */
	public TemperatureStatus getTemperatureStatus() {
		return temperatureStatus;
	}

	/**
	 * Set the status of the temperature of the device.
	 *
	 * @param temperatureStatus the input value
	 */
	public void  setTemperatureStatus(TemperatureStatus temperatureStatus) {
		this.temperatureStatus = temperatureStatus;
	}

	/**
	 * Set the status of the temperature of the device.
	 *
	 * @param temperatureStatus the input value
	 * @return this instance
	 */
	public DeviceInfo withTemperatureStatus(TemperatureStatus temperatureStatus) {
		this.temperatureStatus = temperatureStatus;
		return this;
	}

	/**
	 * Get the this object defines the parameters that describe how the device handles network traffic.
	 *
	 * @return the value
	 */
	public NetworkProperties getNetworkProperties() {
		return networkProperties;
	}

	/**
	 * Set the this object defines the parameters that describe how the device handles network traffic.
	 *
	 * @param networkProperties the input value
	 */
	public void  setNetworkProperties(NetworkProperties networkProperties) {
		this.networkProperties = networkProperties;
	}

	/**
	 * Set the this object defines the parameters that describe how the device handles network traffic.
	 *
	 * @param networkProperties the input value
	 * @return this instance
	 */
	public DeviceInfo withNetworkProperties(NetworkProperties networkProperties) {
		this.networkProperties = networkProperties;
		return this;
	}

	/**
	 * Get the each table entry represents a hardware or virtual processor that resides on this device.
	 *
	 * @return the value
	 */
	public Collection<Processor> getProcessors() {
		if (this.processors == null){ this.processors=new ArrayList<>();}
		return processors;
	}

	/**
	 * Set the each table entry represents a hardware or virtual processor that resides on this device.
	 *
	 * @param processors the input value
	 */
	public void  setProcessors(Collection<Processor> processors) {
		this.processors = processors;
	}

	/**
	 * Set the each table entry represents a hardware or virtual processor that resides on this device.
	 *
	 * @param processor the input value
	 * @return this instance
	 */
	public DeviceInfo withProcessor(Processor processor) {
		getProcessors().add(processor);
		return this;
	}

	/**
	 * Get the each table entry represents a Vendor Log File. 

        This table of log files is informational only and does not allow the ACS to operate on these files in any way.
	 *
	 * @return the value
	 */
	public Collection<VendorLogFile> getVendorLogFiles() {
		if (this.vendorLogFiles == null){ this.vendorLogFiles=new ArrayList<>();}
		return vendorLogFiles;
	}

	/**
	 * Set the each table entry represents a Vendor Log File. 

        This table of log files is informational only and does not allow the ACS to operate on these files in any way.
	 *
	 * @param vendorLogFiles the input value
	 */
	public void  setVendorLogFiles(Collection<VendorLogFile> vendorLogFiles) {
		this.vendorLogFiles = vendorLogFiles;
	}

	/**
	 * Set the each table entry represents a Vendor Log File. 

        This table of log files is informational only and does not allow the ACS to operate on these files in any way.
	 *
	 * @param vendorLogFile the input value
	 * @return this instance
	 */
	public DeviceInfo withVendorLogFile(VendorLogFile vendorLogFile) {
		getVendorLogFiles().add(vendorLogFile);
		return this;
	}

	/**
	 * Get the represents the associated CPE Proxier for a Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}}.
	 *
	 * @return the value
	 */
	public ProxierInfo getProxierInfo() {
		return proxierInfo;
	}

	/**
	 * Set the represents the associated CPE Proxier for a Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}}.
	 *
	 * @param proxierInfo the input value
	 */
	public void  setProxierInfo(ProxierInfo proxierInfo) {
		this.proxierInfo = proxierInfo;
	}

	/**
	 * Set the represents the associated CPE Proxier for a Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}}.
	 *
	 * @param proxierInfo the input value
	 * @return this instance
	 */
	public DeviceInfo withProxierInfo(ProxierInfo proxierInfo) {
		this.proxierInfo = proxierInfo;
		return this;
	}

	/**
	 * Get the this object contains Location information.
	 *
	 * @return the value
	 */
	public Collection<Location> getLocations() {
		if (this.locations == null){ this.locations=new ArrayList<>();}
		return locations;
	}

	/**
	 * Set the this object contains Location information.
	 *
	 * @param locations the input value
	 */
	public void  setLocations(Collection<Location> locations) {
		this.locations = locations;
	}

	/**
	 * Set the this object contains Location information.
	 *
	 * @param location the input value
	 * @return this instance
	 */
	public DeviceInfo withLocation(Location location) {
		getLocations().add(location);
		return this;
	}

	//</editor-fold>

}