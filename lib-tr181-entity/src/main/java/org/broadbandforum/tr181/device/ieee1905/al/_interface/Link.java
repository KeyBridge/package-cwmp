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
import org.broadbandforum.tr181.datatypes.MACAddress;
import org.broadbandforum.tr181.device.ieee1905.al._interface.link.Metric;

	/**
	 * This object defines the 1905 neighbors and link properties.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.Interface.{i}.Link.{i}.")
@XmlRootElement(name = "Link")
@XmlType(name = "Device.IEEE1905.AL.Interface.Link")
@XmlAccessorType(XmlAccessType.FIELD)
public class Link {

	/**
	 * MAC Address of the interface of the Neighbor for this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-9: MAC address typeTLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "InterfaceId")
	public MACAddress interfaceId;
	/**
	 * MAC Address of the 1905 AL entity of the Neighbor device on this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-8: AL MAC address type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "IEEE1905Id")
	public MACAddress ieeE1905Id;
	/**
	 * Media type of this {{object}}. This value is derived from the neighbor’s Topology response message 1905 device information type TLV Media Type field as defined in {{bibref|IEEE1905.1a|Table 6-12: Media type}}. {{enum}}
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "MediaType")
	public String mediaType;
	/**
	 * OUI of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyOUI")
	@Size(min = 6, max = 6)
	@Pattern(regexp = "[0-9A-F]{6}")
	public String genericPhyOUI;
	/**
	 * Variant Index of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyVariant")
	public byte[] genericPhyVariant;
	/**
	 * URL to Generic Phy XML Description of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message URL to Generic Phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "GenericPhyURL")
	@Size(max = 1024)
	public String genericPhyURL;
	/**
	 * This object represents the metrics for this {{object|##.Link}} as defined in {{bibref|IEEE1905.1a|Tables 6-18: 1905 transmitter link metrics and Table 6-20: 1905 receiver link metrics}}.
	 */
	@XmlElement(name = "Metric")
	public Metric metric;

	public Link() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the mac Address of the interface of the Neighbor for this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-9: MAC address typeTLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getInterfaceId() {
		return interfaceId;
	}

	/**
	 * Set the mac Address of the interface of the Neighbor for this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-9: MAC address typeTLV}}.
	 *
	 * @since 2.9
	 * @param interfaceId the input value
	 */
	public void  setInterfaceId(MACAddress interfaceId) {
		this.interfaceId = interfaceId;
	}

	/**
	 * Set the mac Address of the interface of the Neighbor for this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-9: MAC address typeTLV}}.
	 *
	 * @since 2.9
	 * @param interfaceId the input value
	 * @return this instance
	 */
	public Link withInterfaceId(MACAddress interfaceId) {
		this.interfaceId = interfaceId;
		return this;
	}

	/**
	 * Get the mac Address of the 1905 AL entity of the Neighbor device on this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-8: AL MAC address type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public MACAddress getIeeE1905Id() {
		return ieeE1905Id;
	}

	/**
	 * Set the mac Address of the 1905 AL entity of the Neighbor device on this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-8: AL MAC address type TLV}}.
	 *
	 * @since 2.9
	 * @param ieeE1905Id the input value
	 */
	public void  setIeeE1905Id(MACAddress ieeE1905Id) {
		this.ieeE1905Id = ieeE1905Id;
	}

	/**
	 * Set the mac Address of the 1905 AL entity of the Neighbor device on this {{object}}. This value comes from the neighbor’s Topology discovery message as defined in {{bibref|IEEE1905.1a|Table 6-8: AL MAC address type TLV}}.
	 *
	 * @since 2.9
	 * @param ieeE1905Id the input value
	 * @return this instance
	 */
	public Link withIeeE1905Id(MACAddress ieeE1905Id) {
		this.ieeE1905Id = ieeE1905Id;
		return this;
	}

	/**
	 * Get the media type of this {{object}}. This value is derived from the neighbor’s Topology response message 1905 device information type TLV Media Type field as defined in {{bibref|IEEE1905.1a|Table 6-12: Media type}}. {{enum}}
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * Set the media type of this {{object}}. This value is derived from the neighbor’s Topology response message 1905 device information type TLV Media Type field as defined in {{bibref|IEEE1905.1a|Table 6-12: Media type}}. {{enum}}
	 *
	 * @since 2.9
	 * @param mediaType the input value
	 */
	public void  setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * Set the media type of this {{object}}. This value is derived from the neighbor’s Topology response message 1905 device information type TLV Media Type field as defined in {{bibref|IEEE1905.1a|Table 6-12: Media type}}. {{enum}}
	 *
	 * @since 2.9
	 * @param mediaType the input value
	 * @return this instance
	 */
	public Link withMediaType(String mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	/**
	 * Get the oui of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getGenericPhyOUI() {
		return genericPhyOUI;
	}

	/**
	 * Set the oui of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyOUI the input value
	 */
	public void  setGenericPhyOUI(String genericPhyOUI) {
		this.genericPhyOUI = genericPhyOUI;
	}

	/**
	 * Set the oui of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyOUI the input value
	 * @return this instance
	 */
	public Link withGenericPhyOUI(String genericPhyOUI) {
		this.genericPhyOUI = genericPhyOUI;
		return this;
	}

	/**
	 * Get the variant Index of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public byte[] getGenericPhyVariant() {
		return genericPhyVariant;
	}

	/**
	 * Set the variant Index of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyVariant the input value
	 */
	public void  setGenericPhyVariant(byte[] genericPhyVariant) {
		this.genericPhyVariant = genericPhyVariant;
	}

	/**
	 * Set the variant Index of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message variant index field as defined in {{bibref|IEEE1905.1a|Tables 6-29: Generic Phy Device Information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyVariant the input value
	 * @return this instance
	 */
	public Link withGenericPhyVariant(byte[] genericPhyVariant) {
		this.genericPhyVariant = genericPhyVariant;
		return this;
	}

	/**
	 * Get the url to Generic Phy XML Description of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message URL to Generic Phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getGenericPhyURL() {
		return genericPhyURL;
	}

	/**
	 * Set the url to Generic Phy XML Description of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message URL to Generic Phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyURL the input value
	 */
	public void  setGenericPhyURL(String genericPhyURL) {
		this.genericPhyURL = genericPhyURL;
	}

	/**
	 * Set the url to Generic Phy XML Description of the Generic Phy networking technology of the interface of the Neighbor for this {{object|#.Link}}. This value is from a Generic Phy response message URL to Generic Phy field as defined in {{bibref|IEEE1905.1a|Table 6-29: Generic Phy device information type TLV}}.
	 *
	 * @since 2.9
	 * @param genericPhyURL the input value
	 * @return this instance
	 */
	public Link withGenericPhyURL(String genericPhyURL) {
		this.genericPhyURL = genericPhyURL;
		return this;
	}

	/**
	 * Get the this object represents the metrics for this {{object|##.Link}} as defined in {{bibref|IEEE1905.1a|Tables 6-18: 1905 transmitter link metrics and Table 6-20: 1905 receiver link metrics}}.
	 *
	 * @return the value
	 */
	public Metric getMetric() {
		return metric;
	}

	/**
	 * Set the this object represents the metrics for this {{object|##.Link}} as defined in {{bibref|IEEE1905.1a|Tables 6-18: 1905 transmitter link metrics and Table 6-20: 1905 receiver link metrics}}.
	 *
	 * @param metric the input value
	 */
	public void  setMetric(Metric metric) {
		this.metric = metric;
	}

	/**
	 * Set the this object represents the metrics for this {{object|##.Link}} as defined in {{bibref|IEEE1905.1a|Tables 6-18: 1905 transmitter link metrics and Table 6-20: 1905 receiver link metrics}}.
	 *
	 * @param metric the input value
	 * @return this instance
	 */
	public Link withMetric(Metric metric) {
		this.metric = metric;
		return this;
	}

	//</editor-fold>

}