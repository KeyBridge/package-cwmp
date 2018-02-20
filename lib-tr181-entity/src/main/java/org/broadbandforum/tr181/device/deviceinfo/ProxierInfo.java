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
package org.broadbandforum.tr181.device.deviceinfo;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Represents the associated CPE Proxier for a Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex J.1.1}}.
	 *
	 * @since TR181 v2.3
	 */
@CWMPObject(name = "Device.DeviceInfo.ProxierInfo.")
@XmlRootElement(name = "Device.DeviceInfo.ProxierInfo")
@XmlType(name = "Device.DeviceInfo.ProxierInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProxierInfo {

	/**
	 * Organizationally unique identifier of the associated CPE Proxier.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ManufacturerOUI")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String manufacturerOUI;
	/**
	 * Identifier of the class of product of the associated CPE Proxier for which the serial number applies.

          {{empty}} indicates either that the CPE Proxier does not use a product class to differentiate its serial number.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ProductClass")
	@Size(max = 64)
	public String productClass;
	/**
	 * Serial number of the associated CPE Proxier.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * The protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ProxyProtocol")
	public String proxyProtocol;

	public ProxierInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the organizationally unique identifier of the associated CPE Proxier.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the associated CPE Proxier.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the associated CPE Proxier.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 * @param manufacturerOUI the input value
	 * @return this instance
	 */
	public ProxierInfo withManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
		return this;
	}

	/**
	 * Get the identifier of the class of product of the associated CPE Proxier for which the serial number applies.

          {{empty}} indicates either that the CPE Proxier does not use a product class to differentiate its serial number.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * Set the identifier of the class of product of the associated CPE Proxier for which the serial number applies.

          {{empty}} indicates either that the CPE Proxier does not use a product class to differentiate its serial number.
	 *
	 * @since 2.3
	 * @param productClass the input value
	 */
	public void  setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Set the identifier of the class of product of the associated CPE Proxier for which the serial number applies.

          {{empty}} indicates either that the CPE Proxier does not use a product class to differentiate its serial number.
	 *
	 * @since 2.3
	 * @param productClass the input value
	 * @return this instance
	 */
	public ProxierInfo withProductClass(String productClass) {
		this.productClass = productClass;
		return this;
	}

	/**
	 * Get the serial number of the associated CPE Proxier.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the serial number of the associated CPE Proxier.
	 *
	 * @since 2.3
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the serial number of the associated CPE Proxier.
	 *
	 * @since 2.3
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public ProxierInfo withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getProxyProtocol() {
		return proxyProtocol;
	}

	/**
	 * Set the protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 * @param proxyProtocol the input value
	 */
	public void  setProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
	}

	/**
	 * Set the protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 * @param proxyProtocol the input value
	 * @return this instance
	 */
	public ProxierInfo withProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
		return this;
	}

	//</editor-fold>

}