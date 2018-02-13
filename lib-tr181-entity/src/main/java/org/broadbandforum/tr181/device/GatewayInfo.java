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

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains information associated with a connected Internet Gateway Device.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.GatewayInfo.")
@XmlRootElement(name = "Device.GatewayInfo")
@XmlType(name = "Device.GatewayInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GatewayInfo {

	/**
	 * Organizationally unique identifier of the associated Internet Gateway Device.  {{pattern}}

          {{empty}} indicates that there is  no associated Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ManufacturerOUI")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	@Size(max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String manufacturerOUI;
	/**
	 * Identifier of the product class of the associated Internet Gateway Device.  {{empty}} indicates either that  there is no associated Internet Gateway Device that has been detected, or the Internet Gateway Device does not support the use of the  product-class parameter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProductClass")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	@Size(max = 64)
	public String productClass;
	/**
	 * Serial number of the associated Internet Gateway Device.  {{empty}} indicates that there is no associated  Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SerialNumber")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	@Size(max = 64)
	public String serialNumber;

	public GatewayInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the organizationally unique identifier of the associated Internet Gateway Device.  {{pattern}}

          {{empty}} indicates that there is  no associated Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the associated Internet Gateway Device.  {{pattern}}

          {{empty}} indicates that there is  no associated Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the associated Internet Gateway Device.  {{pattern}}

          {{empty}} indicates that there is  no associated Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 * @param manufacturerOUI the input value
	 * @return this instance
	 */
	public GatewayInfo withManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
		return this;
	}

	/**
	 * Get the identifier of the product class of the associated Internet Gateway Device.  {{empty}} indicates either that  there is no associated Internet Gateway Device that has been detected, or the Internet Gateway Device does not support the use of the  product-class parameter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * Set the identifier of the product class of the associated Internet Gateway Device.  {{empty}} indicates either that  there is no associated Internet Gateway Device that has been detected, or the Internet Gateway Device does not support the use of the  product-class parameter.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 */
	public void  setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Set the identifier of the product class of the associated Internet Gateway Device.  {{empty}} indicates either that  there is no associated Internet Gateway Device that has been detected, or the Internet Gateway Device does not support the use of the  product-class parameter.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 * @return this instance
	 */
	public GatewayInfo withProductClass(String productClass) {
		this.productClass = productClass;
		return this;
	}

	/**
	 * Get the serial number of the associated Internet Gateway Device.  {{empty}} indicates that there is no associated  Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the serial number of the associated Internet Gateway Device.  {{empty}} indicates that there is no associated  Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the serial number of the associated Internet Gateway Device.  {{empty}} indicates that there is no associated  Internet Gateway Device that has been detected.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public GatewayInfo withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	//</editor-fold>

}