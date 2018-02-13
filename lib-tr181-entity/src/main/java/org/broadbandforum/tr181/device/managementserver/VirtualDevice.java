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

	/**
	 * Each entry in this table represents a distinct Proxied Device that utilizes the Virtual CWMP Device Mechanism {{bibref|TR-069a4|Annex I.1.1}} for proxying devices.
	 *
	 * @since 2.3
	 */
@CWMPObject(name = "Device.ManagementServer.VirtualDevice.{i}.")
@XmlRootElement(name = "VirtualDevice")
@XmlType(name = "Device.ManagementServer.VirtualDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class VirtualDevice {

	/**
	 * Organizationally unique identifier of the associated Proxied Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ManufacturerOUI")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String manufacturerOUI;
	/**
	 * Identifier of the class of product of the associated Proxied Device for which the serial number applies.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ProductClass")
	@Size(max = 64)
	public String productClass;
	/**
	 * Serial number of the associated Proxied Device.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "SerialNumber")
	@Size(max = 64)
	public String serialNumber;
	/**
	 * {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this proxied LAN device.  There can be multiple such entries if the Proxied Device has more than one network interface.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Host")
	@Size
	@XmlList
	public Collection<String> host;
	/**
	 * The protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ProxyProtocol")
	public String proxyProtocol;
	/**
	 * {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ProxyProtocolReference")
	public String proxyProtocolReference;
	/**
	 * {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DiscoveryProtocol")
	@XmlList
	public Collection<String> discoveryProtocol;
	/**
	 * {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DiscoveryProtocolReference")
	@XmlList
	public Collection<String> discoveryProtocolReference;

	public VirtualDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the organizationally unique identifier of the associated Proxied Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getManufacturerOUI() {
		return manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the associated Proxied Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 * @param manufacturerOUI the input value
	 */
	public void  setManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
	}

	/**
	 * Set the organizationally unique identifier of the associated Proxied Device.  Represented as a six hexadecimal-digit value using all upper-case letters and including any leading zeros.  {{pattern}}

          The value MUST be a valid OUI as defined in {{bibref|OUI}}.
	 *
	 * @since 2.3
	 * @param manufacturerOUI the input value
	 * @return this instance
	 */
	public VirtualDevice withManufacturerOUI(String manufacturerOUI) {
		this.manufacturerOUI = manufacturerOUI;
		return this;
	}

	/**
	 * Get the identifier of the class of product of the associated Proxied Device for which the serial number applies.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * Set the identifier of the class of product of the associated Proxied Device for which the serial number applies.
	 *
	 * @since 2.3
	 * @param productClass the input value
	 */
	public void  setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * Set the identifier of the class of product of the associated Proxied Device for which the serial number applies.
	 *
	 * @since 2.3
	 * @param productClass the input value
	 * @return this instance
	 */
	public VirtualDevice withProductClass(String productClass) {
		this.productClass = productClass;
		return this;
	}

	/**
	 * Get the serial number of the associated Proxied Device.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Set the serial number of the associated Proxied Device.
	 *
	 * @since 2.3
	 * @param serialNumber the input value
	 */
	public void  setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Set the serial number of the associated Proxied Device.
	 *
	 * @since 2.3
	 * @param serialNumber the input value
	 * @return this instance
	 */
	public VirtualDevice withSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	/**
	 * Get the {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this proxied LAN device.  There can be multiple such entries if the Proxied Device has more than one network interface.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this proxied LAN device.  There can be multiple such entries if the Proxied Device has more than one network interface.
	 *
	 * @since 2.3
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the {{list}} {{reference}}  References all the {{object|.Hosts.Host}} table entries, whether active or inactive, that correspond to this proxied LAN device.  There can be multiple such entries if the Proxied Device has more than one network interface.
	 *
	 * @since 2.3
	 * @param string the input value
	 * @return this instance
	 */
	public VirtualDevice withHost(String string) {
		getHost().add(string);
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
	public VirtualDevice withProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
		return this;
	}

	/**
	 * Get the {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getProxyProtocolReference() {
		return proxyProtocolReference;
	}

	/**
	 * Set the {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 * @param proxyProtocolReference the input value
	 */
	public void  setProxyProtocolReference(String proxyProtocolReference) {
		this.proxyProtocolReference = proxyProtocolReference;
	}

	/**
	 * Set the {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 * @param proxyProtocolReference the input value
	 * @return this instance
	 */
	public VirtualDevice withProxyProtocolReference(String proxyProtocolReference) {
		this.proxyProtocolReference = proxyProtocolReference;
		return this;
	}

	/**
	 * Get the {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getDiscoveryProtocol() {
		if (this.discoveryProtocol == null){ this.discoveryProtocol=new ArrayList<>();}
		return discoveryProtocol;
	}

	/**
	 * Set the {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 * @param discoveryProtocol the input value
	 */
	public void  setDiscoveryProtocol(Collection<String> discoveryProtocol) {
		this.discoveryProtocol = discoveryProtocol;
	}

	/**
	 * Set the {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public VirtualDevice withDiscoveryProtocol(String string) {
		getDiscoveryProtocol().add(string);
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getDiscoveryProtocolReference() {
		if (this.discoveryProtocolReference == null){ this.discoveryProtocolReference=new ArrayList<>();}
		return discoveryProtocolReference;
	}

	/**
	 * Set the {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 * @param discoveryProtocolReference the input value
	 */
	public void  setDiscoveryProtocolReference(Collection<String> discoveryProtocolReference) {
		this.discoveryProtocolReference = discoveryProtocolReference;
	}

	/**
	 * Set the {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public VirtualDevice withDiscoveryProtocolReference(String string) {
		getDiscoveryProtocolReference().add(string);
		return this;
	}

	//</editor-fold>

}