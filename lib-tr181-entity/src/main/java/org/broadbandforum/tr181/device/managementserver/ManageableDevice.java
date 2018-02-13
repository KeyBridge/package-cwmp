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
package org.broadbandforum.tr181.device.managementserver;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Each entry in this table corresponds to a distinct LAN Device that supports Device-Gateway Association according to {{bibref|TR-069a2|Annex F}} as indicated by the presence of the DHCP option specified in that Annex.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.ManagementServer.ManageableDevice.{i}.")
@XmlRootElement(name = "Device.ManagementServer.ManageableDevice")
@XmlType(name = "Device.ManagementServer.ManageableDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManageableDevice {

	/**
	 * A non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String alias;
	/**
	 * Organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.   Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid  OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ManufacturerOUI")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String manufacturerOUI;
	/**
	 * Serial number of the Device as provided to the Gateway by the Device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SerialNumber")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * Identifier of the class of product for which the Device's serial number applies as provided to the Gateway by  the Device.

          If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProductClass")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 64)
	public String productClass;
	/**
	 * {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this physical LAN device.  There can be multiple such entries if the device has more than one network interface.

          For example: ''Device.Hosts.Host.1,Device.Hosts.Host.5''
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Host")
	@Size(max = 1024)
	@XmlList
	public Collection<String> host;

	public ManageableDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Set a non-volatile handle used to reference this instance. {{param}} provides a mechanism for an ACS to label this instance for future reference. An initial unique value MUST be assigned when the CPE creates an instance of this object.

          This parameter is DEPRECATED because {{object}} is a transient object.
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public ManageableDevice withAlias(String alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.   Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid  OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.   Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid  OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.0
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the Device manufacturer as provided to the Gateway by the Device.   Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid  OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.0
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
	 * @since 2.0
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the serial number of the Device as provided to the Gateway by the Device.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the serial number of the Device as provided to the Gateway by the Device.
	 *
	 * @since 2.0
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public ManageableDevice withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the identifier of the class of product for which the Device's serial number applies as provided to the Gateway by  the Device.

          If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * Set the identifier of the class of product for which the Device's serial number applies as provided to the Gateway by  the Device.

          If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 */
	public void  setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Set the identifier of the class of product for which the Device's serial number applies as provided to the Gateway by  the Device.

          If the Device does not provide a Product Class, then this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param productClass the input value
	 * @return this instance
	 */
	public ManageableDevice withProductClass(String productClass) {
		this.productClass = productClass;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this physical LAN device.  There can be multiple such entries if the device has more than one network interface.

          For example: ''Device.Hosts.Host.1,Device.Hosts.Host.5''
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this physical LAN device.  There can be multiple such entries if the device has more than one network interface.

          For example: ''Device.Hosts.Host.1,Device.Hosts.Host.5''
	 *
	 * @since 2.0
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this physical LAN device.  There can be multiple such entries if the device has more than one network interface.

          For example: ''Device.Hosts.Host.1,Device.Hosts.Host.5''
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ManageableDevice withHost(String string) {
		getHost().add(string);
		return this;
	}

	//</editor-fold>

}