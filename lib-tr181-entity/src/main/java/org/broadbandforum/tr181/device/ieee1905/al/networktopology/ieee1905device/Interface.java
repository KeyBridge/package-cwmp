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
package org.broadbandforum.tr181.device.ieee1905.al.networktopology.ieee1905device;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.MACAddress;

	/**
	 * This object represents an instance of an interface for the {{object|##.IEEE1905Device}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.{i}.Interface.{i}.")
@XmlRootElement(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.Interface")
@XmlType(name = "Device.IEEE1905.AL.NetworkTopology.IEEE1905Device.Interface")
@XmlAccessorType(XmlAccessType.FIELD)
public class Interface {

	/**
	 * MAC Address of the interface. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "InterfaceId")
	public MACAddress interfaceId;
	/**
	 * Media type of this {{object}}. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MediaType")
	public String mediaType;
	/**
	 * The Power State of this {{object}}. "{{enum|Off}}" is used for interfaces identified in a Power Off Interface TLV as defined in {{bibref|IEEE1905.1a|Table 6-38}}. "{{enum|On}}" is used for all other interfaces. "{{enum|Power_Save}}" and "{{enum|Unsupported}}" are not used at this time. Updated as a result of a received Interface Power Change response with “request completed” or “alternate change made” Interface Power Change status as defined in {{bibref|IEEE1905.1a|Table 6-40: Interface Power Change status TLV}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "PowerState")
	public String powerState;
	/**
	 * {{param}} of this {{object|#.Interface}}. {{pattern}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyOUI")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String genericPhyOUI;
	/**
	 * Variant Index of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyVariant")
	public byte[] genericPhyVariant;
	/**
	 * URL to Generic Phy XML Description of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message URL to generic phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyURL")
	@Size(max = 1024)
	public String genericPhyURL;
	/**
	 * MACAddress Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "NetworkMembership")
	public MACAddress networkMembership;
	/**
	 * Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Role")
	public String role;
	/**
	 * Hexadecimal digit. Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "APChannelBand")
	public byte[] apchannelBand;
	/**
	 * Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "FrequencyIndex1")
	public byte[] frequencyIndex1;
	/**
	 * Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "FrequencyIndex2")
	public byte[] frequencyIndex2;

	public Interface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac Address of the interface. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getInterfaceId() {
		return interfaceId;
	}

	/**
	 * Set the mac Address of the interface. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}.
	 *
	 * @since 2.9
	 * @param interfaceId the input value
	 */
	public void  setInterfaceId(MACAddress interfaceId) {
		this.interfaceId = interfaceId;
	}

	/**
	 * Set the mac Address of the interface. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}.
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
	 * Get the media type of this {{object}}. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * Set the media type of this {{object}}. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}. {{enum}}
	 *
	 * @since 2.9
	 * @param mediaType the input value
	 */
	public void  setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * Set the media type of this {{object}}. This comes from the Topology response message as defined in {{bibref|IEEE1905.1a|Table 6-10: 1905 device information type TLV}}. {{enum}}
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
	 * Get the Power State of this {{object}}. "{{enum|Off}}" is used for interfaces identified in a Power Off Interface TLV as defined in {{bibref|IEEE1905.1a|Table 6-38}}. "{{enum|On}}" is used for all other interfaces. "{{enum|Power_Save}}" and "{{enum|Unsupported}}" are not used at this time. Updated as a result of a received Interface Power Change response with “request completed” or “alternate change made” Interface Power Change status as defined in {{bibref|IEEE1905.1a|Table 6-40: Interface Power Change status TLV}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getPowerState() {
		return powerState;
	}

	/**
	 * Set the Power State of this {{object}}. "{{enum|Off}}" is used for interfaces identified in a Power Off Interface TLV as defined in {{bibref|IEEE1905.1a|Table 6-38}}. "{{enum|On}}" is used for all other interfaces. "{{enum|Power_Save}}" and "{{enum|Unsupported}}" are not used at this time. Updated as a result of a received Interface Power Change response with “request completed” or “alternate change made” Interface Power Change status as defined in {{bibref|IEEE1905.1a|Table 6-40: Interface Power Change status TLV}}. {{enum}}
	 *
	 * @since 2.9
	 * @param powerState the input value
	 */
	public void  setPowerState(String powerState) {
		this.powerState = powerState;
	}

	/**
	 * Set the Power State of this {{object}}. "{{enum|Off}}" is used for interfaces identified in a Power Off Interface TLV as defined in {{bibref|IEEE1905.1a|Table 6-38}}. "{{enum|On}}" is used for all other interfaces. "{{enum|Power_Save}}" and "{{enum|Unsupported}}" are not used at this time. Updated as a result of a received Interface Power Change response with “request completed” or “alternate change made” Interface Power Change status as defined in {{bibref|IEEE1905.1a|Table 6-40: Interface Power Change status TLV}}. {{enum}}
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
	 * Get the {{param}} of this {{object|#.Interface}}. {{pattern}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getGenericPhyOUI() {
		return genericPhyOUI;
	}

	/**
	 * Set the {{param}} of this {{object|#.Interface}}. {{pattern}}
	 *
	 * @since 2.9
	 * @param genericPhyOUI the input value
	 */
	public void  setGenericPhyOUI(String genericPhyOUI) {
		this.genericPhyOUI = genericPhyOUI;
	}

	/**
	 * Set the {{param}} of this {{object|#.Interface}}. {{pattern}}
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
	 * Get the variant Index of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public byte[] getGenericPhyVariant() {
		return genericPhyVariant;
	}

	/**
	 * Set the variant Index of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyVariant the input value
	 */
	public void  setGenericPhyVariant(byte[] genericPhyVariant) {
		this.genericPhyVariant = genericPhyVariant;
	}

	/**
	 * Set the variant Index of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
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
	 * Get the url to Generic Phy XML Description of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message URL to generic phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getGenericPhyURL() {
		return genericPhyURL;
	}

	/**
	 * Set the url to Generic Phy XML Description of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message URL to generic phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyURL the input value
	 */
	public void  setGenericPhyURL(String genericPhyURL) {
		this.genericPhyURL = genericPhyURL;
	}

	/**
	 * Set the url to Generic Phy XML Description of the Generic Phy networking technology of this {{object|#.Interface}}. This value is from a Generic Phy response message URL to generic phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
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
	 * Get the macAddress Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getNetworkMembership() {
		return networkMembership;
	}

	/**
	 * Set the macAddress Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}.
	 *
	 * @since 2.9
	 * @param networkMembership the input value
	 */
	public void  setNetworkMembership(MACAddress networkMembership) {
		this.networkMembership = networkMembership;
	}

	/**
	 * Set the macAddress Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}.
	 *
	 * @since 2.9
	 * @param networkMembership the input value
	 * @return this instance
	 */
	public Interface withNetworkMembership(MACAddress networkMembership) {
		this.networkMembership = networkMembership;
		return this;
	}

	/**
	 * Get the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Set the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}. {{enum}}
	 *
	 * @since 2.9
	 * @param role the input value
	 */
	public void  setRole(String role) {
		this.role = role;
	}

	/**
	 * Set the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}. {{enum}}
	 *
	 * @since 2.9
	 * @param role the input value
	 * @return this instance
	 */
	public Interface withRole(String role) {
		this.role = role;
		return this;
	}

	/**
	 * Get the hexadecimal digit. Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public byte[] getApchannelBand() {
		return apchannelBand;
	}

	/**
	 * Set the hexadecimal digit. Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @param apchannelBand the input value
	 */
	public void  setApchannelBand(byte[] apchannelBand) {
		this.apchannelBand = apchannelBand;
	}

	/**
	 * Set the hexadecimal digit. Field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @param apchannelBand the input value
	 * @return this instance
	 */
	public Interface withApchannelBand(byte[] apchannelBand) {
		this.apchannelBand = apchannelBand;
		return this;
	}

	/**
	 * Get the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public byte[] getFrequencyIndex1() {
		return frequencyIndex1;
	}

	/**
	 * Set the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @param frequencyIndex1 the input value
	 */
	public void  setFrequencyIndex1(byte[] frequencyIndex1) {
		this.frequencyIndex1 = frequencyIndex1;
	}

	/**
	 * Set the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @param frequencyIndex1 the input value
	 * @return this instance
	 */
	public Interface withFrequencyIndex1(byte[] frequencyIndex1) {
		this.frequencyIndex1 = frequencyIndex1;
		return this;
	}

	/**
	 * Get the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public byte[] getFrequencyIndex2() {
		return frequencyIndex2;
	}

	/**
	 * Set the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @param frequencyIndex2 the input value
	 */
	public void  setFrequencyIndex2(byte[] frequencyIndex2) {
		this.frequencyIndex2 = frequencyIndex2;
	}

	/**
	 * Set the field from Media specific information for an 802.11 interface provided in a Topology response message 1905 device information type TLV as defined in {{bibref|IEEE1905.1a|Table 6-13: IEEE 802.11 specific information}}
	 *
	 * @since 2.9
	 * @param frequencyIndex2 the input value
	 * @return this instance
	 */
	public Interface withFrequencyIndex2(byte[] frequencyIndex2) {
		this.frequencyIndex2 = frequencyIndex2;
		return this;
	}

	//</editor-fold>

}