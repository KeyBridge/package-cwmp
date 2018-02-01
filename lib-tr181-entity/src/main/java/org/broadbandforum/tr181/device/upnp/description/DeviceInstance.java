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
package org.broadbandforum.tr181.device.upnp.description;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.UUID;

	/**
	 * This table contains the information from Device Description Document retrieved for a discovered UPnP root or embedded device.
	 *
	 * @since 2.6
	 */
@CWMPObject(name = "Device.UPnP.Description.DeviceInstance.{i}.")
public class DeviceInstance {

	/**
	 * Unique Device Name of this device represented as a UUID for the device.

          This value is extracted from the UDN element in the Device Description Document with the leading uuid: removed.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "UDN")
	public UUID udn;
	/**
	 * {{reference|a {{object}} table entry (if this is an embedded device) or {{empty}} (if this is a root device)}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ParentDevice")
	@Size(max = 256)
	public String parentDevice;
	/**
	 * {{reference|a {{object|##.Discovery.RootDevice}} table entry (if this is a root device) or a {{object|##.Discovery.Device}} table entry (if this is an embedded device)}}

          This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DiscoveryDevice")
	@Size(max = 256)
	public String discoveryDevice;
	/**
	 * The value of the UPnP deviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DeviceType")
	@Size(max = 256)
	public String deviceType;
	/**
	 * The value of the UPnP friendlyName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "FriendlyName")
	@Size(max = 128)
	public String friendlyName;
	/**
	 * Each list item is the value of an element in the Device Description Document for this {{object}} that indicates a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

          Note: It is assumed that the ''htip:X_DeviceCategory'' Device Description Document element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.

          Note: {{param}} is different from {{param|DeviceType}} and is included here for the purpose of HTIP usage.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "DeviceCategory")
	@XmlList
	public Collection<String> deviceCategory;
	/**
	 * The value of the UPnP manufacturer element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "Manufacturer")
	@Size(max = 128)
	public String manufacturer;
	/**
	 * The value of an element in the Device Description Document for this {{object}} that indicates the manufacturer OUI if this value is provided by the device; or {{empty}} if this value is not provided by the device.

          {{pattern}}

          Note: It is assumed that the ''htip:X_ManufacturerOUI'' element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ManufacturerOUI")
	@Size(min = 0, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String manufacturerOUI;
	/**
	 * The value of the UPnP manufacturerURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ManufacturerURL")
	@Size(max = 256)
	public String manufacturerURL;
	/**
	 * The value of the UPnP modelDescription element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ModelDescription")
	@Size(max = 256)
	public String modelDescription;
	/**
	 * The value of the UPnP modelName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ModelName")
	@Size(max = 64)
	public String modelName;
	/**
	 * The value of the UPnP modelNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ModelNumber")
	@Size(max = 64)
	public String modelNumber;
	/**
	 * The value of the UPnP modelURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ModelURL")
	@Size(max = 256)
	public String modelURL;
	/**
	 * The value of the UPnP serialNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 128)
	public String serialNumber;
	/**
	 * The value of the UPnP UPC element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "UPC")
	@Size(max = 12)
	public String upc;
	/**
	 * The value of the UPnP presentationURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

          The way to obtain an absolute URL from the presentationURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

          If the presentationURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "PresentationURL")
	@Size(max = 256)
	public String presentationURL;

	public DeviceInstance() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique Device Name of this device represented as a UUID for the device.

          This value is extracted from the UDN element in the Device Description Document with the leading uuid: removed.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public UUID getUdn() {
		return udn;
	}

	/**
	 * Set the unique Device Name of this device represented as a UUID for the device.

          This value is extracted from the UDN element in the Device Description Document with the leading uuid: removed.
	 *
	 * @since 2.6
	 * @param udn the input value
	 */
	public void  setUdn(UUID udn) {
		this.udn = udn;
	}

	/**
	 * Set the unique Device Name of this device represented as a UUID for the device.

          This value is extracted from the UDN element in the Device Description Document with the leading uuid: removed.
	 *
	 * @since 2.6
	 * @param udn the input value
	 * @return this instance
	 */
	public DeviceInstance withUdn(UUID udn) {
		this.udn = udn;
		return this;
	}

	/**
	 * Get the {{reference|a {{object}} table entry (if this is an embedded device) or {{empty}} (if this is a root device)}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getParentDevice() {
		return parentDevice;
	}

	/**
	 * Set the {{reference|a {{object}} table entry (if this is an embedded device) or {{empty}} (if this is a root device)}}
	 *
	 * @since 2.6
	 * @param parentDevice the input value
	 */
	public void  setParentDevice(String parentDevice) {
		this.parentDevice = parentDevice;
	}

	/**
	 * Set the {{reference|a {{object}} table entry (if this is an embedded device) or {{empty}} (if this is a root device)}}
	 *
	 * @since 2.6
	 * @param parentDevice the input value
	 * @return this instance
	 */
	public DeviceInstance withParentDevice(String parentDevice) {
		this.parentDevice = parentDevice;
		return this;
	}

	/**
	 * Get the {{reference|a {{object|##.Discovery.RootDevice}} table entry (if this is a root device) or a {{object|##.Discovery.Device}} table entry (if this is an embedded device)}}

          This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getDiscoveryDevice() {
		return discoveryDevice;
	}

	/**
	 * Set the {{reference|a {{object|##.Discovery.RootDevice}} table entry (if this is a root device) or a {{object|##.Discovery.Device}} table entry (if this is an embedded device)}}

          This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 2.6
	 * @param discoveryDevice the input value
	 */
	public void  setDiscoveryDevice(String discoveryDevice) {
		this.discoveryDevice = discoveryDevice;
	}

	/**
	 * Set the {{reference|a {{object|##.Discovery.RootDevice}} table entry (if this is a root device) or a {{object|##.Discovery.Device}} table entry (if this is an embedded device)}}

          This {{param}} value can be {{empty}} because the referenced object has been deleted or the CPE was unable to retrieve the Description Document due to some out-of-band error. The determination to delete this {{object}} or use {{empty}} is implementation specific.
	 *
	 * @since 2.6
	 * @param discoveryDevice the input value
	 * @return this instance
	 */
	public DeviceInstance withDiscoveryDevice(String discoveryDevice) {
		this.discoveryDevice = discoveryDevice;
		return this;
	}

	/**
	 * Get the value of the UPnP deviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * Set the value of the UPnP deviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param deviceType the input value
	 */
	public void  setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * Set the value of the UPnP deviceType element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param deviceType the input value
	 * @return this instance
	 */
	public DeviceInstance withDeviceType(String deviceType) {
		this.deviceType = deviceType;
		return this;
	}

	/**
	 * Get the value of the UPnP friendlyName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getFriendlyName() {
		return friendlyName;
	}

	/**
	 * Set the value of the UPnP friendlyName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param friendlyName the input value
	 */
	public void  setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	/**
	 * Set the value of the UPnP friendlyName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param friendlyName the input value
	 * @return this instance
	 */
	public DeviceInstance withFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
		return this;
	}

	/**
	 * Get the each list item is the value of an element in the Device Description Document for this {{object}} that indicates a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

          Note: It is assumed that the ''htip:X_DeviceCategory'' Device Description Document element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.

          Note: {{param}} is different from {{param|DeviceType}} and is included here for the purpose of HTIP usage.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Collection<String> getDeviceCategory() {
		if (this.deviceCategory == null){ this.deviceCategory=new ArrayList<>();}
		return deviceCategory;
	}

	/**
	 * Set the each list item is the value of an element in the Device Description Document for this {{object}} that indicates a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

          Note: It is assumed that the ''htip:X_DeviceCategory'' Device Description Document element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.

          Note: {{param}} is different from {{param|DeviceType}} and is included here for the purpose of HTIP usage.
	 *
	 * @since 2.8
	 * @param deviceCategory the input value
	 */
	public void  setDeviceCategory(Collection<String> deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	/**
	 * Set the each list item is the value of an element in the Device Description Document for this {{object}} that indicates a device category (e.g. "AV_TV" and "AV_Recorder"), or the value is {{empty}} if no such element is provided by the device.

          Note: It is assumed that the ''htip:X_DeviceCategory'' Device Description Document element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}. Standard HTIP device categories are defined in {{bibref|JJ-300.01}}. In this case, the maximum length of the list is 127 and of each item is 31, and any non-HTIP device categories SHOULD NOT conflict with standard HTIP device categories.

          Note: {{param}} is different from {{param|DeviceType}} and is included here for the purpose of HTIP usage.
	 *
	 * @since 2.8
	 * @param string the input value
	 * @return this instance
	 */
	public DeviceInstance withDeviceCategory(String string) {
		getDeviceCategory().add(string);
		return this;
	}

	/**
	 * Get the value of the UPnP manufacturer element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Set the value of the UPnP manufacturer element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param manufacturer the input value
	 */
	public void  setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Set the value of the UPnP manufacturer element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param manufacturer the input value
	 * @return this instance
	 */
	public DeviceInstance withManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	/**
	 * Get the value of an element in the Device Description Document for this {{object}} that indicates the manufacturer OUI if this value is provided by the device; or {{empty}} if this value is not provided by the device.

          {{pattern}}

          Note: It is assumed that the ''htip:X_ManufacturerOUI'' element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the value of an element in the Device Description Document for this {{object}} that indicates the manufacturer OUI if this value is provided by the device; or {{empty}} if this value is not provided by the device.

          {{pattern}}

          Note: It is assumed that the ''htip:X_ManufacturerOUI'' element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the value of an element in the Device Description Document for this {{object}} that indicates the manufacturer OUI if this value is provided by the device; or {{empty}} if this value is not provided by the device.

          {{pattern}}

          Note: It is assumed that the ''htip:X_ManufacturerOUI'' element is used for HTIP (Home-network Topology Identifying Protocol) {{bibref|JJ-300.00}} and {{bibref|G.9973}}.
	 *
	 * @since 2.8
	 * @param manufacturerOUI the input value
	 * @return this instance
	 */
	public DeviceInstance withManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
		return this;
	}

	/**
	 * Get the value of the UPnP manufacturerURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getManufacturerURL() {
		return manufacturerURL;
	}

	/**
	 * Set the value of the UPnP manufacturerURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param manufacturerURL the input value
	 */
	public void  setManufacturerURL(String manufacturerURL) {
		this.manufacturerURL = manufacturerURL;
	}

	/**
	 * Set the value of the UPnP manufacturerURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param manufacturerURL the input value
	 * @return this instance
	 */
	public DeviceInstance withManufacturerURL(String manufacturerURL) {
		this.manufacturerURL = manufacturerURL;
		return this;
	}

	/**
	 * Get the value of the UPnP modelDescription element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getModelDescription() {
		return modelDescription;
	}

	/**
	 * Set the value of the UPnP modelDescription element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelDescription the input value
	 */
	public void  setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}

	/**
	 * Set the value of the UPnP modelDescription element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelDescription the input value
	 * @return this instance
	 */
	public DeviceInstance withModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
		return this;
	}

	/**
	 * Get the value of the UPnP modelName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * Set the value of the UPnP modelName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelName the input value
	 */
	public void  setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * Set the value of the UPnP modelName element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelName the input value
	 * @return this instance
	 */
	public DeviceInstance withModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	/**
	 * Get the value of the UPnP modelNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * Set the value of the UPnP modelNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelNumber the input value
	 */
	public void  setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * Set the value of the UPnP modelNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelNumber the input value
	 * @return this instance
	 */
	public DeviceInstance withModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
		return this;
	}

	/**
	 * Get the value of the UPnP modelURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getModelURL() {
		return modelURL;
	}

	/**
	 * Set the value of the UPnP modelURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelURL the input value
	 */
	public void  setModelURL(String modelURL) {
		this.modelURL = modelURL;
	}

	/**
	 * Set the value of the UPnP modelURL element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param modelURL the input value
	 * @return this instance
	 */
	public DeviceInstance withModelURL(String modelURL) {
		this.modelURL = modelURL;
		return this;
	}

	/**
	 * Get the value of the UPnP serialNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the value of the UPnP serialNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the value of the UPnP serialNumber element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public DeviceInstance withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the value of the UPnP UPC element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getUpc() {
		return upc;
	}

	/**
	 * Set the value of the UPnP UPC element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param upc the input value
	 */
	public void  setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * Set the value of the UPnP UPC element in the Device Description Document for this {{object}}, or {{empty}} if this value is not provided by the device.
	 *
	 * @since 2.6
	 * @param upc the input value
	 * @return this instance
	 */
	public DeviceInstance withUpc(String upc) {
		this.upc = upc;
		return this;
	}

	/**
	 * Get the value of the UPnP presentationURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

          The way to obtain an absolute URL from the presentationURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

          If the presentationURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getPresentationURL() {
		return presentationURL;
	}

	/**
	 * Set the value of the UPnP presentationURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

          The way to obtain an absolute URL from the presentationURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

          If the presentationURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 2.6
	 * @param presentationURL the input value
	 */
	public void  setPresentationURL(String presentationURL) {
		this.presentationURL = presentationURL;
	}

	/**
	 * Set the value of the UPnP presentationURL element in the Device Description Document for this {{object}} and MUST be an absolute URL.

          The way to obtain an absolute URL from the presentationURL element is specified in {{bibref|UPnP-DAv1}} and {{bibref|UPnP-DAv11}}.

          If the presentationURL is not provided by the device then this value MUST be {{empty}}.
	 *
	 * @since 2.6
	 * @param presentationURL the input value
	 * @return this instance
	 */
	public DeviceInstance withPresentationURL(String presentationURL) {
		this.presentationURL = presentationURL;
		return this;
	}

	//</editor-fold>

}