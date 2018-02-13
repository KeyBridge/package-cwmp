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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.BridgingTuple;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.IEEE1905Neighbor;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.IPv4Address;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.IPv6Address;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.Interface;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.L2Neighbor;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.NonIEEE1905Neighbor;
import org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device.VendorProperties;

	/**
	 * This object represents an instance of discovered 1905 Devices in the network (received Topology discovery message as defined in {{bibref|IEEE1905.1a|Clause 6.3.1}}).
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.")
@XmlRootElement(name = "IEEE1905Device")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device")
@XmlAccessorType(XmlAccessType.FIELD)
public class IEEE1905Device {

	/**
	 * 1905 AL MAC Address.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IEEE1905Id")
	public MACAddress ieeE1905Id;
	/**
	 * 1905 profile version number in Higher Layer Response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Version")
	public String version;
	/**
	 * {{list}} of frequency bands identified as supported for a registrar role in an AP-autoconfiguration response message as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}} 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz].
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "RegistrarFreqBand")
	@Size(max = 1024)
	@XmlList
	public Collection<String> registrarFreqBand;
	/**
	 * Friendly Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "FriendlyName")
	@Size(max = 128)
	public String friendlyName;
	/**
	 * Manufacturer Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ManufacturerName")
	@Size(max = 128)
	public String manufacturerName;
	/**
	 * Manufacturer Model String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ManufacturerModel")
	@Size(max = 128)
	public String manufacturerModel;
	/**
	 * Control URL received in Higher Layer response message as defined in defined in {{bibref|IEEE1905.1a|Table 6-31: Control URL Type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "ControlURL")
	@Size(max = 1024)
	public String controlURL;
	/**
	 * This object represents represents all IPv4 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-32: IPv4 type TLV}}.
	 */
	@XmlElementWrapper(name = "IPv4Addresss")
	@XmlElement(name = "IPv4Address")
	public Collection<IPv4Address> ipv4Addresss;
	/**
	 * This object represents represents all IPv6 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-34: IPv6 type TLV}}.
	 */
	@XmlElementWrapper(name = "IPv6Addresss")
	@XmlElement(name = "IPv6Address")
	public Collection<IPv6Address> ipv6Addresss;
	/**
	 * This object represents vendor specific information received in a message with a Vendor specific TLV (as defined in in {{bibref|IEEE1905.1a|Table 6-7: Vendor specific TLV}}).
	 */
	@XmlElementWrapper(name = "VendorPropertiess")
	@XmlElement(name = "VendorProperties")
	public Collection<VendorProperties> vendorPropertiess;
	/**
	 * This object represents an instance of an interface for the {{object|##.IEEE1905Device}}.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * This object represents an instance of a Non-IEEE1905 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-14: Non-1905 neighbor device TLV}}.
	 */
	@XmlElementWrapper(name = "NonIEEE1905Neighbors")
	@XmlElement(name = "NonIEEE1905Neighbor")
	public Collection<NonIEEE1905Neighbor> nonIEEE1905Neighbors;
	/**
	 * This object represents an instance of an L2 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-41: L2 neighbor device TLV}}.
	 */
	@XmlElementWrapper(name = "L2Neighbors")
	@XmlElement(name = "L2Neighbor")
	public Collection<L2Neighbor> l2neighbors;
	/**
	 * This object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values are from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-15: 1905 neighbor device TLV}}.
	 */
	@XmlElementWrapper(name = "IEEE1905Neighbors")
	@XmlElement(name = "IEEE1905Neighbor")
	public Collection<IEEE1905Neighbor> ieeE1905Neighbors;
	/**
	 * This object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values come from the 1905 Device’s Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-11: Device bridging capability TLV}}.
	 */
	@XmlElementWrapper(name = "BridgingTuples")
	@XmlElement(name = "BridgingTuple")
	public Collection<BridgingTuple> bridgingTuples;

	public IEEE1905Device() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the 1905 AL MAC Address.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getIeeE1905Id() {
		return ieeE1905Id;
	}

	/**
	 * Set the 1905 AL MAC Address.
	 *
	 * @since 2.9
	 * @param ieeE1905Id the input value
	 */
	public void  setIeeE1905Id(MACAddress ieeE1905Id) {
		this.ieeE1905Id = ieeE1905Id;
	}

	/**
	 * Set the 1905 AL MAC Address.
	 *
	 * @since 2.9
	 * @param ieeE1905Id the input value
	 * @return this instance
	 */
	public IEEE1905Device withIeeE1905Id(MACAddress ieeE1905Id) {
		this.ieeE1905Id = ieeE1905Id;
		return this;
	}

	/**
	 * Get the 1905 profile version number in Higher Layer Response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set the 1905 profile version number in Higher Layer Response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 * @param version the input value
	 */
	public void  setVersion(String version) {
		this.version = version;
	}

	/**
	 * Set the 1905 profile version number in Higher Layer Response message as defined in {{bibref|IEEE1905.1a|Table 6-37: 1905 profile version TLV}}.
	 *
	 * @since 2.9
	 * @param version the input value
	 * @return this instance
	 */
	public IEEE1905Device withVersion(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the {{list}} of frequency bands identified as supported for a registrar role in an AP-autoconfiguration response message as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}} 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz].
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getRegistrarFreqBand() {
		if (this.registrarFreqBand == null){ this.registrarFreqBand=new ArrayList<>();}
		return registrarFreqBand;
	}

	/**
	 * Set the {{list}} of frequency bands identified as supported for a registrar role in an AP-autoconfiguration response message as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}} 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz].
	 *
	 * @since 2.9
	 * @param registrarFreqBand the input value
	 */
	public void  setRegistrarFreqBand(Collection<String> registrarFreqBand) {
		this.registrarFreqBand = registrarFreqBand;
	}

	/**
	 * Set the {{list}} of frequency bands identified as supported for a registrar role in an AP-autoconfiguration response message as defined in {{bibref|IEEE1905.1a|Table 6-25: SupportedFreqBand TLV}} 

Enumerated value must be one of [802.11 2.4 GHz, 802.11 5 GHz, 802.11 60 GHz].
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public IEEE1905Device withRegistrarFreqBand(String string) {
		getRegistrarFreqBand().add(string);
		return this;
	}

	/**
	 * Get the friendly Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getFriendlyName() {
		return friendlyName;
	}

	/**
	 * Set the friendly Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @param friendlyName the input value
	 */
	public void  setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	/**
	 * Set the friendly Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @param friendlyName the input value
	 * @return this instance
	 */
	public IEEE1905Device withFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
		return this;
	}

	/**
	 * Get the manufacturer Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * Set the manufacturer Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @param manufacturerName the input value
	 */
	public void  setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	/**
	 * Set the manufacturer Name String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @param manufacturerName the input value
	 * @return this instance
	 */
	public IEEE1905Device withManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
		return this;
	}

	/**
	 * Get the manufacturer Model String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getManufacturerModel() {
		return manufacturerModel;
	}

	/**
	 * Set the manufacturer Model String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @param manufacturerModel the input value
	 */
	public void  setManufacturerModel(String manufacturerModel) {
		this.manufacturerModel = manufacturerModel;
	}

	/**
	 * Set the manufacturer Model String received in Higher Layer response message as defined in {{bibref|IEEE1905.1a|Table 6-30: Device Identification Type TLV}}.
	 *
	 * @since 2.9
	 * @param manufacturerModel the input value
	 * @return this instance
	 */
	public IEEE1905Device withManufacturerModel(String manufacturerModel) {
		this.manufacturerModel = manufacturerModel;
		return this;
	}

	/**
	 * Get the control URL received in Higher Layer response message as defined in defined in {{bibref|IEEE1905.1a|Table 6-31: Control URL Type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getControlURL() {
		return controlURL;
	}

	/**
	 * Set the control URL received in Higher Layer response message as defined in defined in {{bibref|IEEE1905.1a|Table 6-31: Control URL Type TLV}}.
	 *
	 * @since 2.9
	 * @param controlURL the input value
	 */
	public void  setControlURL(String controlURL) {
		this.controlURL = controlURL;
	}

	/**
	 * Set the control URL received in Higher Layer response message as defined in defined in {{bibref|IEEE1905.1a|Table 6-31: Control URL Type TLV}}.
	 *
	 * @since 2.9
	 * @param controlURL the input value
	 * @return this instance
	 */
	public IEEE1905Device withControlURL(String controlURL) {
		this.controlURL = controlURL;
		return this;
	}

	/**
	 * Get the this object represents represents all IPv4 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-32: IPv4 type TLV}}.
	 *
	 * @return the value
	 */
	public Collection<IPv4Address> getIpv4Addresss() {
		if (this.ipv4Addresss == null){ this.ipv4Addresss=new ArrayList<>();}
		return ipv4Addresss;
	}

	/**
	 * Set the this object represents represents all IPv4 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-32: IPv4 type TLV}}.
	 *
	 * @param ipv4Addresss the input value
	 */
	public void  setIpv4Addresss(Collection<IPv4Address> ipv4Addresss) {
		this.ipv4Addresss = ipv4Addresss;
	}

	/**
	 * Set the this object represents represents all IPv4 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-32: IPv4 type TLV}}.
	 *
	 * @param ipv4Address the input value
	 * @return this instance
	 */
	public IEEE1905Device withIPv4Address(IPv4Address ipv4Address) {
		getIpv4Addresss().add(ipv4Address);
		return this;
	}

	/**
	 * Get the this object represents represents all IPv6 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-34: IPv6 type TLV}}.
	 *
	 * @return the value
	 */
	public Collection<IPv6Address> getIpv6Addresss() {
		if (this.ipv6Addresss == null){ this.ipv6Addresss=new ArrayList<>();}
		return ipv6Addresss;
	}

	/**
	 * Set the this object represents represents all IPv6 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-34: IPv6 type TLV}}.
	 *
	 * @param ipv6Addresss the input value
	 */
	public void  setIpv6Addresss(Collection<IPv6Address> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;
	}

	/**
	 * Set the this object represents represents all IPv6 addresses reported for a MAC address (AL or interface) in a Higher Layer response message for the IEEE1905Device as defined in {{bibref|IEEE1905.1a|Table 6-34: IPv6 type TLV}}.
	 *
	 * @param ipv6Address the input value
	 * @return this instance
	 */
	public IEEE1905Device withIPv6Address(IPv6Address ipv6Address) {
		getIpv6Addresss().add(ipv6Address);
		return this;
	}

	/**
	 * Get the this object represents vendor specific information received in a message with a Vendor specific TLV (as defined in in {{bibref|IEEE1905.1a|Table 6-7: Vendor specific TLV}}).
	 *
	 * @return the value
	 */
	public Collection<VendorProperties> getVendorPropertiess() {
		if (this.vendorPropertiess == null){ this.vendorPropertiess=new ArrayList<>();}
		return vendorPropertiess;
	}

	/**
	 * Set the this object represents vendor specific information received in a message with a Vendor specific TLV (as defined in in {{bibref|IEEE1905.1a|Table 6-7: Vendor specific TLV}}).
	 *
	 * @param vendorPropertiess the input value
	 */
	public void  setVendorPropertiess(Collection<VendorProperties> vendorPropertiess) {
		this.vendorPropertiess = vendorPropertiess;
	}

	/**
	 * Set the this object represents vendor specific information received in a message with a Vendor specific TLV (as defined in in {{bibref|IEEE1905.1a|Table 6-7: Vendor specific TLV}}).
	 *
	 * @param vendorProperties the input value
	 * @return this instance
	 */
	public IEEE1905Device withVendorProperties(VendorProperties vendorProperties) {
		getVendorPropertiess().add(vendorProperties);
		return this;
	}

	/**
	 * Get the this object represents an instance of an interface for the {{object|##.IEEE1905Device}}.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the this object represents an instance of an interface for the {{object|##.IEEE1905Device}}.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the this object represents an instance of an interface for the {{object|##.IEEE1905Device}}.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public IEEE1905Device withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the this object represents an instance of a Non-IEEE1905 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-14: Non-1905 neighbor device TLV}}.
	 *
	 * @return the value
	 */
	public Collection<NonIEEE1905Neighbor> getNonIEEE1905Neighbors() {
		if (this.nonIEEE1905Neighbors == null){ this.nonIEEE1905Neighbors=new ArrayList<>();}
		return nonIEEE1905Neighbors;
	}

	/**
	 * Set the this object represents an instance of a Non-IEEE1905 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-14: Non-1905 neighbor device TLV}}.
	 *
	 * @param nonIEEE1905Neighbors the input value
	 */
	public void  setNonIEEE1905Neighbors(Collection<NonIEEE1905Neighbor> nonIEEE1905Neighbors) {
		this.nonIEEE1905Neighbors = nonIEEE1905Neighbors;
	}

	/**
	 * Set the this object represents an instance of a Non-IEEE1905 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-14: Non-1905 neighbor device TLV}}.
	 *
	 * @param nonIEEE1905Neighbor the input value
	 * @return this instance
	 */
	public IEEE1905Device withNonIEEE1905Neighbor(NonIEEE1905Neighbor nonIEEE1905Neighbor) {
		getNonIEEE1905Neighbors().add(nonIEEE1905Neighbor);
		return this;
	}

	/**
	 * Get the this object represents an instance of an L2 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-41: L2 neighbor device TLV}}.
	 *
	 * @return the value
	 */
	public Collection<L2Neighbor> getL2neighbors() {
		if (this.l2neighbors == null){ this.l2neighbors=new ArrayList<>();}
		return l2neighbors;
	}

	/**
	 * Set the this object represents an instance of an L2 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-41: L2 neighbor device TLV}}.
	 *
	 * @param l2neighbors the input value
	 */
	public void  setL2neighbors(Collection<L2Neighbor> l2neighbors) {
		this.l2neighbors = l2neighbors;
	}

	/**
	 * Set the this object represents an instance of an L2 Neighbor for the {{object|##.IEEE1905Device}}. These fields come from a Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-41: L2 neighbor device TLV}}.
	 *
	 * @param l2neighbor the input value
	 * @return this instance
	 */
	public IEEE1905Device withL2Neighbor(L2Neighbor l2neighbor) {
		getL2neighbors().add(l2neighbor);
		return this;
	}

	/**
	 * Get the this object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values are from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-15: 1905 neighbor device TLV}}.
	 *
	 * @return the value
	 */
	public Collection<IEEE1905Neighbor> getIeeE1905Neighbors() {
		if (this.ieeE1905Neighbors == null){ this.ieeE1905Neighbors=new ArrayList<>();}
		return ieeE1905Neighbors;
	}

	/**
	 * Set the this object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values are from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-15: 1905 neighbor device TLV}}.
	 *
	 * @param ieeE1905Neighbors the input value
	 */
	public void  setIeeE1905Neighbors(Collection<IEEE1905Neighbor> ieeE1905Neighbors) {
		this.ieeE1905Neighbors = ieeE1905Neighbors;
	}

	/**
	 * Set the this object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values are from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-15: 1905 neighbor device TLV}}.
	 *
	 * @param ieeE1905Neighbor the input value
	 * @return this instance
	 */
	public IEEE1905Device withIEEE1905Neighbor(IEEE1905Neighbor ieeE1905Neighbor) {
		getIeeE1905Neighbors().add(ieeE1905Neighbor);
		return this;
	}

	/**
	 * Get the this object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values come from the 1905 Device’s Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-11: Device bridging capability TLV}}.
	 *
	 * @return the value
	 */
	public Collection<BridgingTuple> getBridgingTuples() {
		if (this.bridgingTuples == null){ this.bridgingTuples=new ArrayList<>();}
		return bridgingTuples;
	}

	/**
	 * Set the this object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values come from the 1905 Device’s Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-11: Device bridging capability TLV}}.
	 *
	 * @param bridgingTuples the input value
	 */
	public void  setBridgingTuples(Collection<BridgingTuple> bridgingTuples) {
		this.bridgingTuples = bridgingTuples;
	}

	/**
	 * Set the this object represents an instance of an {{object}} for the {{object|##.IEEE1905Device}}. These values come from the 1905 Device’s Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-11: Device bridging capability TLV}}.
	 *
	 * @param bridgingTuple the input value
	 * @return this instance
	 */
	public IEEE1905Device withBridgingTuple(BridgingTuple bridgingTuple) {
		getBridgingTuples().add(bridgingTuple);
		return this;
	}

	//</editor-fold>

}