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
package org.broadbandforum.tr181.device.ieee1905.al._interface;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object defines the vendor specific properties (vendorSpecificInfo field) of this {{object|##.Interface}} as defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.Interface.{i}.VendorProperties.{i}.")
@XmlRootElement(name = "VendorProperties")
@XmlType(name = "Device.IEEE1905.AL.Interface.VendorProperties")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorProperties {

	/**
	 * Organizationally unique identifier of a manufacturer of this {{object|##.Interface}}.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros according to {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.  {{pattern}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "OUI")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String oui;
	/**
	 * A hexbinary string used to to provide vendor specific information about this {{object|##.Interface}}. This is the value of the vendorSpecificInfo parameter defined in {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Information")
	public byte[] information;

	public VendorProperties() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the organizationally unique identifier of a manufacturer of this {{object|##.Interface}}.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros according to {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.  {{pattern}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getOui() {
		return oui;
	}

	/**
	 * Set the organizationally unique identifier of a manufacturer of this {{object|##.Interface}}.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros according to {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.  {{pattern}}
	 *
	 * @since 2.9
	 * @param oui the input value
	 */
	public void  setOui(String oui) {
		this.oui = oui;
	}

	/**
	 * Set the organizationally unique identifier of a manufacturer of this {{object|##.Interface}}.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros according to {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.  {{pattern}}
	 *
	 * @since 2.9
	 * @param oui the input value
	 * @return this instance
	 */
	public VendorProperties withOui(String oui) {
		this.oui = oui;
		return this;
	}

	/**
	 * Get a hexbinary string used to to provide vendor specific information about this {{object|##.Interface}}. This is the value of the vendorSpecificInfo parameter defined in {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public byte[] getInformation() {
		return information;
	}

	/**
	 * Set a hexbinary string used to to provide vendor specific information about this {{object|##.Interface}}. This is the value of the vendorSpecificInfo parameter defined in {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.
	 *
	 * @since 2.9
	 * @param information the input value
	 */
	public void  setInformation(byte[] information) {
		this.information = information;
	}

	/**
	 * Set a hexbinary string used to to provide vendor specific information about this {{object|##.Interface}}. This is the value of the vendorSpecificInfo parameter defined in {{bibref|IEEE1905.1a|Table 5-20: VendorSpecificInfo information element}}.
	 *
	 * @since 2.9
	 * @param information the input value
	 * @return this instance
	 */
	public VendorProperties withInformation(byte[] information) {
		this.information = information;
		return this;
	}

	//</editor-fold>

}