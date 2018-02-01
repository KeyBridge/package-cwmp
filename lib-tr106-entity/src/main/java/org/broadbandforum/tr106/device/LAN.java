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
package org.broadbandforum.tr106.device;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr106.datatypes.IPAddress;
import org.broadbandforum.tr106.datatypes.MACAddress;
import org.broadbandforum.tr106.device.lan.DHCPOption;
import org.broadbandforum.tr106.device.lan.IPPingDiagnostics;
import org.broadbandforum.tr106.device.lan.Stats;
import org.broadbandforum.tr106.device.lan.TraceRouteDiagnostics;

	/**
	 * This object contains parameters relating to IP-based LAN connectivity of a device.

This object relates only to IP-layer LAN capabilities.  Lower-layer aspects of LAN connectivity are not considered part of the common data model defined in this specification.

For a device that contains multiple IP interfaces, the scope of this object is limited to the default IP interface.  Data that might be associated with other interfaces is not considered part of the common data model defined in this specification.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "Device.LAN.")
public class LAN {

	/**
	 * The method used to assign an address to this interface.  {{enum}}

The ability to modify this parameter is OPTIONAL.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AddressingType")
	@CWMPParameter(access = "readWrite")
	public String addressingType;
	/**
	 * The current IP address assigned to this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "IPAddress")
	@CWMPParameter(access = "readWrite", forcedInform = true)
	public IPAddress ipaddress;
	/**
	 * The current subnet mask.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "SubnetMask")
	@CWMPParameter(access = "readWrite")
	public IPAddress subnetMask;
	/**
	 * The IP address of the current default gateway for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DefaultGateway")
	@CWMPParameter(access = "readWrite")
	public String defaultGateway;
	/**
	 * Comma-separated list of IP address of the DNS servers for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.

If this parameter is modifiable, the device MAY ignore any DNS servers beyond the first two in the list.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DNSServers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> dnsServers;
	/**
	 * The physical address of this interface.  Writable only if {{param|MACAddressOverride}} is present and equal to {{true}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddress")
	@CWMPParameter(access = "readWrite")
	public MACAddress macAddress;
	/**
	 * Whether the value of MACAddress parameter can be overridden.

* When {{true}}, {{param|MACAddress}} is writable.

* When {{false}}, {{param|MACAddress}} is not writable, and the default MAC address assigned by the device SHOULD be restored.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MACAddressOverride")
	@CWMPParameter(access = "readWrite")
	public Boolean macAddressOverride;
	/**
	 * This object is for configuration of DHCP options.  Each instance of this object represents a DHCP option to be included by the DHCP client in client requests.  The DHCP client MAY include any other options not specified in this table.
	 */
	@XmlElementWrapper(name = "dhcPOptions")
	@XmlElement(name = "DHCPOption")
	@CWMPParameter(access = "readWrite")
	public Collection<DHCPOption> dhcPOptions;
	/**
	 * This object contains statistics for the default IP interface.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This object defines access to an IP-layer ping test for the default IP interface.
	 */
	@XmlElement(name = "IPPingDiagnostics")
	public IPPingDiagnostics ippingDiagnostics;
	/**
	 * This object is defines access to an IP-layer trace-route test for the default IP interface.
	 */
	@XmlElement(name = "TraceRouteDiagnostics")
	public TraceRouteDiagnostics traceRouteDiagnostics;

	public LAN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the method used to assign an address to this interface.  {{enum}}

The ability to modify this parameter is OPTIONAL.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAddressingType() {
		return addressingType;
	}

	/**
	 * Set the method used to assign an address to this interface.  {{enum}}

The ability to modify this parameter is OPTIONAL.
	 *
	 * @since 1.0
	 * @param addressingType the input value
	 */
	public void  setAddressingType(String addressingType) {
		this.addressingType = addressingType;
	}

	/**
	 * Set the method used to assign an address to this interface.  {{enum}}

The ability to modify this parameter is OPTIONAL.
	 *
	 * @since 1.0
	 * @param addressingType the input value
	 * @return this instance
	 */
	public LAN withAddressingType(String addressingType) {
		this.addressingType = addressingType;
		return this;
	}

	/**
	 * Get the current IP address assigned to this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getIpaddress() {
		return ipaddress;
	}

	/**
	 * Set the current IP address assigned to this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @param ipaddress the input value
	 */
	public void  setIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
	}

	/**
	 * Set the current IP address assigned to this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @param ipaddress the input value
	 * @return this instance
	 */
	public LAN withIpaddress(IPAddress ipaddress) {
		this.ipaddress = ipaddress;
		return this;
	}

	/**
	 * Get the current subnet mask.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the current subnet mask.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the current subnet mask.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public LAN withSubnetMask(IPAddress subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the IP address of the current default gateway for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDefaultGateway() {
		return defaultGateway;
	}

	/**
	 * Set the IP address of the current default gateway for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @param defaultGateway the input value
	 */
	public void  setDefaultGateway(String defaultGateway) {
		this.defaultGateway = defaultGateway;
	}

	/**
	 * Set the IP address of the current default gateway for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.
	 *
	 * @since 1.0
	 * @param defaultGateway the input value
	 * @return this instance
	 */
	public LAN withDefaultGateway(String defaultGateway) {
		this.defaultGateway = defaultGateway;
		return this;
	}

	/**
	 * Get the comma-separated list of IP address of the DNS servers for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.

If this parameter is modifiable, the device MAY ignore any DNS servers beyond the first two in the list.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Collection<String> getDnsServers() {
		if (this.dnsServers == null){ this.dnsServers=new ArrayList<>();}
		return dnsServers;
	}

	/**
	 * Set the comma-separated list of IP address of the DNS servers for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.

If this parameter is modifiable, the device MAY ignore any DNS servers beyond the first two in the list.
	 *
	 * @since 1.0
	 * @param dnsServers the input value
	 */
	public void  setDnsServers(Collection<String> dnsServers) {
		this.dnsServers = dnsServers;
	}

	/**
	 * Set the comma-separated list of IP address of the DNS servers for this interface.

The ability to modify this parameter is OPTIONAL, and this parameter cannot be modified if the {{param|AddressingType}} is {{enum|DHCP|AddressingType}}.

If this parameter is modifiable, the device MAY ignore any DNS servers beyond the first two in the list.
	 *
	 * @since 1.0
	 * @param string the input value
	 * @return this instance
	 */
	public LAN withDnsServers(String string) {
		getDnsServers().add(string);
		return this;
	}

	/**
	 * Get the physical address of this interface.  Writable only if {{param|MACAddressOverride}} is present and equal to {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getMacAddress() {
		return macAddress;
	}

	/**
	 * Set the physical address of this interface.  Writable only if {{param|MACAddressOverride}} is present and equal to {{true}}.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 */
	public void  setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Set the physical address of this interface.  Writable only if {{param|MACAddressOverride}} is present and equal to {{true}}.
	 *
	 * @since 1.0
	 * @param macAddress the input value
	 * @return this instance
	 */
	public LAN withMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
		return this;
	}

	/**
	 * Get the whether the value of MACAddress parameter can be overridden.

* When {{true}}, {{param|MACAddress}} is writable.

* When {{false}}, {{param|MACAddress}} is not writable, and the default MAC address assigned by the device SHOULD be restored.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isMacAddressOverride() {
		return macAddressOverride;
	}

	/**
	 * Set the whether the value of MACAddress parameter can be overridden.

* When {{true}}, {{param|MACAddress}} is writable.

* When {{false}}, {{param|MACAddress}} is not writable, and the default MAC address assigned by the device SHOULD be restored.
	 *
	 * @since 1.0
	 * @param macAddressOverride the input value
	 */
	public void  setMacAddressOverride(Boolean macAddressOverride) {
		this.macAddressOverride = macAddressOverride;
	}

	/**
	 * Set the whether the value of MACAddress parameter can be overridden.

* When {{true}}, {{param|MACAddress}} is writable.

* When {{false}}, {{param|MACAddress}} is not writable, and the default MAC address assigned by the device SHOULD be restored.
	 *
	 * @since 1.0
	 * @param macAddressOverride the input value
	 * @return this instance
	 */
	public LAN withMacAddressOverride(Boolean macAddressOverride) {
		this.macAddressOverride = macAddressOverride;
		return this;
	}

	/**
	 * Get the this object is for configuration of DHCP options.  Each instance of this object represents a DHCP option to be included by the DHCP client in client requests.  The DHCP client MAY include any other options not specified in this table.
	 *
	 * @return the value
	 */
	public Collection<DHCPOption> getDhcPOptions() {
		if (this.dhcPOptions == null){ this.dhcPOptions=new ArrayList<>();}
		return dhcPOptions;
	}

	/**
	 * Set the this object is for configuration of DHCP options.  Each instance of this object represents a DHCP option to be included by the DHCP client in client requests.  The DHCP client MAY include any other options not specified in this table.
	 *
	 * @param dhcPOptions the input value
	 */
	public void  setDhcPOptions(Collection<DHCPOption> dhcPOptions) {
		this.dhcPOptions = dhcPOptions;
	}

	/**
	 * Set the this object is for configuration of DHCP options.  Each instance of this object represents a DHCP option to be included by the DHCP client in client requests.  The DHCP client MAY include any other options not specified in this table.
	 *
	 * @param dhcPOption the input value
	 * @return this instance
	 */
	public LAN withDHCPOption(DHCPOption dhcPOption) {
		getDhcPOptions().add(dhcPOption);
		return this;
	}

	/**
	 * Get the this object contains statistics for the default IP interface.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for the default IP interface.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for the default IP interface.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public LAN withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the this object defines access to an IP-layer ping test for the default IP interface.
	 *
	 * @return the value
	 */
	public IPPingDiagnostics getIppingDiagnostics() {
		return ippingDiagnostics;
	}

	/**
	 * Set the this object defines access to an IP-layer ping test for the default IP interface.
	 *
	 * @param ippingDiagnostics the input value
	 */
	public void  setIppingDiagnostics(IPPingDiagnostics ippingDiagnostics) {
		this.ippingDiagnostics = ippingDiagnostics;
	}

	/**
	 * Set the this object defines access to an IP-layer ping test for the default IP interface.
	 *
	 * @param ippingDiagnostics the input value
	 * @return this instance
	 */
	public LAN withIppingDiagnostics(IPPingDiagnostics ippingDiagnostics) {
		this.ippingDiagnostics = ippingDiagnostics;
		return this;
	}

	/**
	 * Get the this object is defines access to an IP-layer trace-route test for the default IP interface.
	 *
	 * @return the value
	 */
	public TraceRouteDiagnostics getTraceRouteDiagnostics() {
		return traceRouteDiagnostics;
	}

	/**
	 * Set the this object is defines access to an IP-layer trace-route test for the default IP interface.
	 *
	 * @param traceRouteDiagnostics the input value
	 */
	public void  setTraceRouteDiagnostics(TraceRouteDiagnostics traceRouteDiagnostics) {
		this.traceRouteDiagnostics = traceRouteDiagnostics;
	}

	/**
	 * Set the this object is defines access to an IP-layer trace-route test for the default IP interface.
	 *
	 * @param traceRouteDiagnostics the input value
	 * @return this instance
	 */
	public LAN withTraceRouteDiagnostics(TraceRouteDiagnostics traceRouteDiagnostics) {
		this.traceRouteDiagnostics = traceRouteDiagnostics;
		return this;
	}

	//</editor-fold>

}