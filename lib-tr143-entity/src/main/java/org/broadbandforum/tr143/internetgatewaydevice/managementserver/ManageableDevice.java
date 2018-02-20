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
package org.broadbandforum.tr143.internetgatewaydevice.managementserver;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * Each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a1|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @since TR143 v1.2
	 */
@CWMPObject(name = "InternetGatewayDevice.ManagementServer.ManageableDevice.{i}.", uniqueConstraints = {@CWMPUnique(names = {"ManufacturerOUI", "SerialNumber", "ProductClass"})})
@XmlRootElement(name = "InternetGatewayDevice.ManagementServer.ManageableDevice")
@XmlType(name = "InternetGatewayDevice.ManagementServer.ManageableDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManageableDevice {

	/**
	 * Organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "ManufacturerOUI")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 6)
	public String manufacturerOUI;
	/**
	 * Serial number of the Device as provided to the Gateway by the Device.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "SerialNumber")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * Identifier of the class of product for which the Device's serial number applies as provided to the Gateway by the Device.

If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "ProductClass")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 64)
	public String productClass;

	public ManageableDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 1.2
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 1.2
	 * @param manufacturerOUI the input value
	 * @return this instance
	 */
	public ManageableDevice withManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
		return this;
	}

	/**
	 * Get the serial number of the Device as provided to the Gateway by the Device.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the serial number of the Device as provided to the Gateway by the Device.
	 *
	 * @since 1.2
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the serial number of the Device as provided to the Gateway by the Device.
	 *
	 * @since 1.2
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public ManageableDevice withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the identifier of the class of product for which the Device's serial number applies as provided to the Gateway by the Device.

If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 1.2
	 * @return the value
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * Set the identifier of the class of product for which the Device's serial number applies as provided to the Gateway by the Device.

If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 1.2
	 * @param productClass the input value
	 */
	public void  setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Set the identifier of the class of product for which the Device's serial number applies as provided to the Gateway by the Device.

If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 1.2
	 * @param productClass the input value
	 * @return this instance
	 */
	public ManageableDevice withProductClass(String productClass) {
		this.productClass = productClass;
		return this;
	}

	//</editor-fold>

}