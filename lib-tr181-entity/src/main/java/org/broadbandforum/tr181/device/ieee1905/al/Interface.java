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
package org.broadbandforum.tr181.device.ieee1905.al;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.MACAddress;
import org.broadbandforum.tr181.device.ieee1905.al._interface.Link;
import org.broadbandforum.tr181.device.ieee1905.al._interface.VendorProperties;

	/**
	 * The 1905 interface table (described in {{bibref|IEEE1905.1a|sub-clause 5 Abstraction Layer Management}}).
	 *
	 * @since TR181 v2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.Interface.{i}.", uniqueConstraints = {@CWMPUnique(names = {"InterfaceId"})})
@XmlRootElement(name = "Device.IEEE1905.AL.Interface")
@XmlType(name = "Device.IEEE1905.AL.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interface {

	/**
	 * MAC Address of this interface.  This is the value of the intfAddress parameter defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "InterfaceId")
	public MACAddress interfaceId;
	/**
	 * This parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          It SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD normally be {{enum|Down}} when the interface cannot transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * This parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * This parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "LowerLayers")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * Path name of an interface object described by this 1905 {{object}}. Referenced interface object MUST have a MACAddress and the InterfaceId MUST be the same as the interface object MACAddress.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "InterfaceStackReference")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String interfaceStackReference;
	/**
	 * Media type of this {{object}}. This is derived from the value of the intfType parameter defined in {{bibref|IEEE1905.1a|Tables 5.2: intfDescriptor elements}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MediaType")
	public String mediaType;
	/**
	 * OUI of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyOUI")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String genericPhyOUI;
	/**
	 * Variant Index of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyVariant")
	public byte[] genericPhyVariant;
	/**
	 * URL to Generic Phy XML Description of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyURL")
	@Size(max = 1024)
	public String genericPhyURL;
	/**
	 * Enables or disables the Abstraction Layer's ability to set the power state for the interface. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "SetIntfPowerStateEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean setIntfPowerStateEnabled;
	/**
	 * The Power State of this {{object}}. This is derived from the value of the powerState parameter as defined in {{bibref|IEEE1905.1a|Tables 5.3: ALME-SET-INTF-PWR-STATE.request parameters and Table 5.7: ALME-GET-INTF-PWR-STATE.response parameters}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PowerState")
	@CWMPParameter(access = "readWrite")
	public String powerState;
	/**
	 * This object defines the vendor specific properties (vendorSpecificInfo field) of this {{object|##.Interface}} as defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}.
	 */
	@XmlElementWrapper(name = "VendorPropertiess")
	@XmlElement(name = "VendorProperties")
	public Collection<VendorProperties> vendorPropertiess;
	/**
	 * This object defines the 1905 neighbors and link properties.
	 */
	@XmlElementWrapper(name = "Links")
	@XmlElement(name = "Link")
	public Collection<Link> links;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac Address of this interface.  This is the value of the intfAddress parameter defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getInterfaceId() {
		return interfaceId;
	}

	/**
	 * Set the mac Address of this interface.  This is the value of the intfAddress parameter defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}
	 *
	 * @since 2.9
	 * @param interfaceId the input value
	 */
	public void  setInterfaceId(MACAddress interfaceId) {
		this.interfaceId = interfaceId;
	}

	/**
	 * Set the mac Address of this interface.  This is the value of the intfAddress parameter defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}
	 *
	 * @since 2.9
	 * @param interfaceId the input value
	 * @return this instance
	 */
	public Interface withInterfaceId(MACAddress interfaceId) {
		this.interfaceId = interfaceId;
		return this;
	}

	/**
	 * Get the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          It SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD normally be {{enum|Down}} when the interface cannot transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          It SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD normally be {{enum|Down}} when the interface cannot transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.9
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The current operational state of the interface (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          It SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD normally be {{enum|Down}} when the interface cannot transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.9
	 * @param status the input value
	 * @return this instance
	 */
	public Interface withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.9
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  The accumulated time in seconds since the interface entered its current operational state.
	 *
	 * @since 2.9
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Interface withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the this parameter is NOT RECOMMENDED to be used because it is not a parameter defined in a 1905 ALME primitive or protocol TLV.  {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public Interface withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the path name of an interface object described by this 1905 {{object}}. Referenced interface object MUST have a MACAddress and the InterfaceId MUST be the same as the interface object MACAddress.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getInterfaceStackReference() {
		return interfaceStackReference;
	}

	/**
	 * Set the path name of an interface object described by this 1905 {{object}}. Referenced interface object MUST have a MACAddress and the InterfaceId MUST be the same as the interface object MACAddress.
	 *
	 * @since 2.9
	 * @param interfaceStackReference the input value
	 */
	public void  setInterfaceStackReference(String interfaceStackReference) {
		this.interfaceStackReference = interfaceStackReference;
	}

	/**
	 * Set the path name of an interface object described by this 1905 {{object}}. Referenced interface object MUST have a MACAddress and the InterfaceId MUST be the same as the interface object MACAddress.
	 *
	 * @since 2.9
	 * @param interfaceStackReference the input value
	 * @return this instance
	 */
	public Interface withInterfaceStackReference(String interfaceStackReference) {
		this.interfaceStackReference = interfaceStackReference;
		return this;
	}

	/**
	 * Get the media type of this {{object}}. This is derived from the value of the intfType parameter defined in {{bibref|IEEE1905.1a|Tables 5.2: intfDescriptor elements}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * Set the media type of this {{object}}. This is derived from the value of the intfType parameter defined in {{bibref|IEEE1905.1a|Tables 5.2: intfDescriptor elements}}. {{enum}}
	 *
	 * @since 2.9
	 * @param mediaType the input value
	 */
	public void  setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * Set the media type of this {{object}}. This is derived from the value of the intfType parameter defined in {{bibref|IEEE1905.1a|Tables 5.2: intfDescriptor elements}}. {{enum}}
	 *
	 * @since 2.9
	 * @param mediaType the input value
	 * @return this instance
	 */
	public Interface withMediaType(String mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	/**
	 * Get the oui of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getGenericPhyOUI() {
		return genericPhyOUI;
	}

	/**
	 * Set the oui of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyOUI the input value
	 */
	public void  setGenericPhyOUI(String genericPhyOUI) {
		this.genericPhyOUI = genericPhyOUI;
	}

	/**
	 * Set the oui of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyOUI the input value
	 * @return this instance
	 */
	public Interface withGenericPhyOUI(String genericPhyOUI) {
		this.genericPhyOUI = genericPhyOUI;
		return this;
	}

	/**
	 * Get the variant Index of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public byte[] getGenericPhyVariant() {
		return genericPhyVariant;
	}

	/**
	 * Set the variant Index of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyVariant the input value
	 */
	public void  setGenericPhyVariant(byte[] genericPhyVariant) {
		this.genericPhyVariant = genericPhyVariant;
	}

	/**
	 * Set the variant Index of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyVariant the input value
	 * @return this instance
	 */
	public Interface withGenericPhyVariant(byte[] genericPhyVariant) {
		this.genericPhyVariant = genericPhyVariant;
		return this;
	}

	/**
	 * Get the url to Generic Phy XML Description of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getGenericPhyURL() {
		return genericPhyURL;
	}

	/**
	 * Set the url to Generic Phy XML Description of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyURL the input value
	 */
	public void  setGenericPhyURL(String genericPhyURL) {
		this.genericPhyURL = genericPhyURL;
	}

	/**
	 * Set the url to Generic Phy XML Description of the Generic Phy networking technology of the local interface that would be included in a Generic Phy Device Information Type TLV defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyURL the input value
	 * @return this instance
	 */
	public Interface withGenericPhyURL(String genericPhyURL) {
		this.genericPhyURL = genericPhyURL;
		return this;
	}

	/**
	 * Get the enables or disables the Abstraction Layer's ability to set the power state for the interface. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Boolean isSetIntfPowerStateEnabled() {
		return setIntfPowerStateEnabled;
	}

	/**
	 * Set the enables or disables the Abstraction Layer's ability to set the power state for the interface. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 * @param setIntfPowerStateEnabled the input value
	 */
	public void  setSetIntfPowerStateEnabled(Boolean setIntfPowerStateEnabled) {
		this.setIntfPowerStateEnabled = setIntfPowerStateEnabled;
	}

	/**
	 * Set the enables or disables the Abstraction Layer's ability to set the power state for the interface. Boolean can be {{true}} for "enabled" and {{false}} for "disabled".
	 *
	 * @since 2.9
	 * @param setIntfPowerStateEnabled the input value
	 * @return this instance
	 */
	public Interface withSetIntfPowerStateEnabled(Boolean setIntfPowerStateEnabled) {
		this.setIntfPowerStateEnabled = setIntfPowerStateEnabled;
		return this;
	}

	/**
	 * Get the Power State of this {{object}}. This is derived from the value of the powerState parameter as defined in {{bibref|IEEE1905.1a|Tables 5.3: ALME-SET-INTF-PWR-STATE.request parameters and Table 5.7: ALME-GET-INTF-PWR-STATE.response parameters}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getPowerState() {
		return powerState;
	}

	/**
	 * Set the Power State of this {{object}}. This is derived from the value of the powerState parameter as defined in {{bibref|IEEE1905.1a|Tables 5.3: ALME-SET-INTF-PWR-STATE.request parameters and Table 5.7: ALME-GET-INTF-PWR-STATE.response parameters}}. {{enum}}
	 *
	 * @since 2.9
	 * @param powerState the input value
	 */
	public void  setPowerState(String powerState) {
		this.powerState = powerState;
	}

	/**
	 * Set the Power State of this {{object}}. This is derived from the value of the powerState parameter as defined in {{bibref|IEEE1905.1a|Tables 5.3: ALME-SET-INTF-PWR-STATE.request parameters and Table 5.7: ALME-GET-INTF-PWR-STATE.response parameters}}. {{enum}}
	 *
	 * @since 2.9
	 * @param powerState the input value
	 * @return this instance
	 */
	public Interface withPowerState(String powerState) {
		this.powerState = powerState;
		return this;
	}

	/**
	 * Get the this object defines the vendor specific properties (vendorSpecificInfo field) of this {{object|##.Interface}} as defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}.
	 *
	 * @return the value
	 */
	public Collection<VendorProperties> getVendorPropertiess() {
		if (this.vendorPropertiess == null){ this.vendorPropertiess=new ArrayList<>();}
		return vendorPropertiess;
	}

	/**
	 * Set the this object defines the vendor specific properties (vendorSpecificInfo field) of this {{object|##.Interface}} as defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}.
	 *
	 * @param vendorPropertiess the input value
	 */
	public void  setVendorPropertiess(Collection<VendorProperties> vendorPropertiess) {
		this.vendorPropertiess = vendorPropertiess;
	}

	/**
	 * Set the this object defines the vendor specific properties (vendorSpecificInfo field) of this {{object|##.Interface}} as defined in {{bibref|IEEE1905.1a|Table 5-2: intfDescriptor elements}}.
	 *
	 * @param vendorProperties the input value
	 * @return this instance
	 */
	public Interface withVendorProperties(VendorProperties vendorProperties) {
		getVendorPropertiess().add(vendorProperties);
		return this;
	}

	/**
	 * Get the this object defines the 1905 neighbors and link properties.
	 *
	 * @return the value
	 */
	public Collection<Link> getLinks() {
		if (this.links == null){ this.links=new ArrayList<>();}
		return links;
	}

	/**
	 * Set the this object defines the 1905 neighbors and link properties.
	 *
	 * @param links the input value
	 */
	public void  setLinks(Collection<Link> links) {
		this.links = links;
	}

	/**
	 * Set the this object defines the 1905 neighbors and link properties.
	 *
	 * @param link the input value
	 * @return this instance
	 */
	public Interface withLink(Link link) {
		getLinks().add(link);
		return this;
	}

	//</editor-fold>

}