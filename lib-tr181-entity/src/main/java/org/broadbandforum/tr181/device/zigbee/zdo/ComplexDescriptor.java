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
package org.broadbandforum.tr181.device.zigbee.zdo;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The {{object}} object is an optional descriptor that describes extended capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.6 Complex Descriptor}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.ComplexDescriptor.")
public class ComplexDescriptor {

	/**
	 * When {{true}}, the Complex Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DescriptorAvailable")
	public Boolean descriptorAvailable;
	/**
	 * Specifies the ISO 639-1 language code as defined in {{bibref|ISO639-1}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Language")
	public String language;
	/**
	 * Specifies the ISO 646 character set as defined in {{bibref|ISO646-1991}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "CharacterSet")
	public String characterSet;
	/**
	 * Specifies the name of the manufacturer of the ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ManufacturerName")
	public String manufacturerName;
	/**
	 * Specifies the name of the manufacturer's model of the ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ModelName")
	public String modelName;
	/**
	 * Specifies the manufacturer's serial number of the ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SerialNumber")
	public String serialNumber;
	/**
	 * Specifies the URL through which more information relating to the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DeviceURL")
	public String deviceURL;
	/**
	 * The icon field contains an octet string which carries the data for an icon that can represent the ZigBee device.  The format of the icon MUST be a 32-by-32-pixel PNG image.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Icon")
	public byte[] icon;
	/**
	 * Specifies the URL through which the icon for the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "IconURL")
	public String iconURL;

	public ComplexDescriptor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the when {{true}}, the Complex Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isDescriptorAvailable() {
		return descriptorAvailable;
	}

	/**
	 * Set the when {{true}}, the Complex Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 * @param descriptorAvailable the input value
	 */
	public void  setDescriptorAvailable(Boolean descriptorAvailable) {
		this.descriptorAvailable = descriptorAvailable;
	}

	/**
	 * Set the when {{true}}, the Complex Descriptor recorded has been received from the target device.
	 *
	 * @since 2.7
	 * @param descriptorAvailable the input value
	 * @return this instance
	 */
	public ComplexDescriptor withDescriptorAvailable(Boolean descriptorAvailable) {
		this.descriptorAvailable = descriptorAvailable;
		return this;
	}

	/**
	 * Get the specifies the ISO 639-1 language code as defined in {{bibref|ISO639-1}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Set the specifies the ISO 639-1 language code as defined in {{bibref|ISO639-1}}.
	 *
	 * @since 2.7
	 * @param language the input value
	 */
	public void  setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Set the specifies the ISO 639-1 language code as defined in {{bibref|ISO639-1}}.
	 *
	 * @since 2.7
	 * @param language the input value
	 * @return this instance
	 */
	public ComplexDescriptor withLanguage(String language) {
		this.language = language;
		return this;
	}

	/**
	 * Get the specifies the ISO 646 character set as defined in {{bibref|ISO646-1991}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getCharacterSet() {
		return characterSet;
	}

	/**
	 * Set the specifies the ISO 646 character set as defined in {{bibref|ISO646-1991}}.
	 *
	 * @since 2.7
	 * @param characterSet the input value
	 */
	public void  setCharacterSet(String characterSet) {
		this.characterSet = characterSet;
	}

	/**
	 * Set the specifies the ISO 646 character set as defined in {{bibref|ISO646-1991}}.
	 *
	 * @since 2.7
	 * @param characterSet the input value
	 * @return this instance
	 */
	public ComplexDescriptor withCharacterSet(String characterSet) {
		this.characterSet = characterSet;
		return this;
	}

	/**
	 * Get the specifies the name of the manufacturer of the ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * Set the specifies the name of the manufacturer of the ZigBee device.
	 *
	 * @since 2.7
	 * @param manufacturerName the input value
	 */
	public void  setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	/**
	 * Set the specifies the name of the manufacturer of the ZigBee device.
	 *
	 * @since 2.7
	 * @param manufacturerName the input value
	 * @return this instance
	 */
	public ComplexDescriptor withManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
		return this;
	}

	/**
	 * Get the specifies the name of the manufacturer's model of the ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * Set the specifies the name of the manufacturer's model of the ZigBee device.
	 *
	 * @since 2.7
	 * @param modelName the input value
	 */
	public void  setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * Set the specifies the name of the manufacturer's model of the ZigBee device.
	 *
	 * @since 2.7
	 * @param modelName the input value
	 * @return this instance
	 */
	public ComplexDescriptor withModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	/**
	 * Get the specifies the manufacturer's serial number of the ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the specifies the manufacturer's serial number of the ZigBee device.
	 *
	 * @since 2.7
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the specifies the manufacturer's serial number of the ZigBee device.
	 *
	 * @since 2.7
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public ComplexDescriptor withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the specifies the URL through which more information relating to the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getDeviceURL() {
		return deviceURL;
	}

	/**
	 * Set the specifies the URL through which more information relating to the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 * @param deviceURL the input value
	 */
	public void  setDeviceURL(String deviceURL) {
		this.deviceURL = deviceURL;
	}

	/**
	 * Set the specifies the URL through which more information relating to the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 * @param deviceURL the input value
	 * @return this instance
	 */
	public ComplexDescriptor withDeviceURL(String deviceURL) {
		this.deviceURL = deviceURL;
		return this;
	}

	/**
	 * Get the icon field contains an octet string which carries the data for an icon that can represent the ZigBee device.  The format of the icon MUST be a 32-by-32-pixel PNG image.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public byte[] getIcon() {
		return icon;
	}

	/**
	 * Set the icon field contains an octet string which carries the data for an icon that can represent the ZigBee device.  The format of the icon MUST be a 32-by-32-pixel PNG image.
	 *
	 * @since 2.7
	 * @param icon the input value
	 */
	public void  setIcon(byte[] icon) {
		this.icon = icon;
	}

	/**
	 * Set the icon field contains an octet string which carries the data for an icon that can represent the ZigBee device.  The format of the icon MUST be a 32-by-32-pixel PNG image.
	 *
	 * @since 2.7
	 * @param icon the input value
	 * @return this instance
	 */
	public ComplexDescriptor withIcon(byte[] icon) {
		this.icon = icon;
		return this;
	}

	/**
	 * Get the specifies the URL through which the icon for the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getIconURL() {
		return iconURL;
	}

	/**
	 * Set the specifies the URL through which the icon for the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 * @param iconURL the input value
	 */
	public void  setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}

	/**
	 * Set the specifies the URL through which the icon for the ZigBee device can be obtained.
	 *
	 * @since 2.7
	 * @param iconURL the input value
	 * @return this instance
	 */
	public ComplexDescriptor withIconURL(String iconURL) {
		this.iconURL = iconURL;
		return this;
	}

	//</editor-fold>

}