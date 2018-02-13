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
package org.broadbandforum.tr181.device.zigbee.zdo;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.datatypes.IEEE_EUI64;
import org.broadbandforum.tr181.datatypes.ZigBeeNetworkAddress;

	/**
	 * The {{object}} object describes the configuration capabilities related to maintaining a ZigBee Device's Binding Table as defined in {{bibref|ZigBee2007|section 2.2.8.2 Binding}}.
	 *
	 * @since 2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.Binding.{i}.")
@XmlRootElement(name = "Binding")
@XmlType(name = "Device.ZigBee.ZDO.Binding")
@XmlAccessorType(XmlAccessType.FIELD)
public class Binding {

	/**
	 * Enables or disables the use of this binding on the device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Specifies the source endpoint used in this binding entry.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SourceEndpoint")
	@CWMPParameter(access = "readWrite")
	@Size(max = 240)
	public Long sourceEndpoint;
	/**
	 * Specifies the source address used in this binding entry.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SourceAddress")
	@CWMPParameter(access = "readWrite")
	public IEEE_EUI64 sourceAddress;
	/**
	 * Specifies the cluster identifier used in this binding entry.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ClusterId")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long clusterId;
	/**
	 * Specifies the type of destination address used for this binding entry. {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DestinationAddressMode")
	@CWMPParameter(access = "readWrite")
	public String destinationAddressMode;
	/**
	 * Specifies the destination endpoint for the binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DestinationEndpoint")
	@CWMPParameter(access = "readWrite")
	@Size(max = 240)
	public Long destinationEndpoint;
	/**
	 * Specifies the IEEE destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "IEEEDestinationAddress")
	@CWMPParameter(access = "readWrite")
	public IEEE_EUI64 ieeEDestinationAddress;
	/**
	 * Specifies the group destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Group|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "GroupDestinationAddress")
	@CWMPParameter(access = "readWrite")
	public ZigBeeNetworkAddress groupDestinationAddress;

	public Binding() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the use of this binding on the device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the use of this binding on the device.
	 *
	 * @since 2.7
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the use of this binding on the device.
	 *
	 * @since 2.7
	 * @param enable the input value
	 * @return this instance
	 */
	public Binding withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.7
	 * @param alias the input value
	 * @return this instance
	 */
	public Binding withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the specifies the source endpoint used in this binding entry.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getSourceEndpoint() {
		return sourceEndpoint;
	}

	/**
	 * Set the specifies the source endpoint used in this binding entry.
	 *
	 * @since 2.7
	 * @param sourceEndpoint the input value
	 */
	public void  setSourceEndpoint(Long sourceEndpoint) {
		this.sourceEndpoint = sourceEndpoint;
	}

	/**
	 * Set the specifies the source endpoint used in this binding entry.
	 *
	 * @since 2.7
	 * @param sourceEndpoint the input value
	 * @return this instance
	 */
	public Binding withSourceEndpoint(Long sourceEndpoint) {
		this.sourceEndpoint = sourceEndpoint;
		return this;
	}

	/**
	 * Get the specifies the source address used in this binding entry.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public IEEE_EUI64 getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * Set the specifies the source address used in this binding entry.
	 *
	 * @since 2.7
	 * @param sourceAddress the input value
	 */
	public void  setSourceAddress(IEEE_EUI64 sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	/**
	 * Set the specifies the source address used in this binding entry.
	 *
	 * @since 2.7
	 * @param sourceAddress the input value
	 * @return this instance
	 */
	public Binding withSourceAddress(IEEE_EUI64 sourceAddress) {
		this.sourceAddress = sourceAddress;
		return this;
	}

	/**
	 * Get the specifies the cluster identifier used in this binding entry.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getClusterId() {
		return clusterId;
	}

	/**
	 * Set the specifies the cluster identifier used in this binding entry.
	 *
	 * @since 2.7
	 * @param clusterId the input value
	 */
	public void  setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}

	/**
	 * Set the specifies the cluster identifier used in this binding entry.
	 *
	 * @since 2.7
	 * @param clusterId the input value
	 * @return this instance
	 */
	public Binding withClusterId(Long clusterId) {
		this.clusterId = clusterId;
		return this;
	}

	/**
	 * Get the specifies the type of destination address used for this binding entry. {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getDestinationAddressMode() {
		return destinationAddressMode;
	}

	/**
	 * Set the specifies the type of destination address used for this binding entry. {{enum}}
	 *
	 * @since 2.7
	 * @param destinationAddressMode the input value
	 */
	public void  setDestinationAddressMode(String destinationAddressMode) {
		this.destinationAddressMode = destinationAddressMode;
	}

	/**
	 * Set the specifies the type of destination address used for this binding entry. {{enum}}
	 *
	 * @since 2.7
	 * @param destinationAddressMode the input value
	 * @return this instance
	 */
	public Binding withDestinationAddressMode(String destinationAddressMode) {
		this.destinationAddressMode = destinationAddressMode;
		return this;
	}

	/**
	 * Get the specifies the destination endpoint for the binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getDestinationEndpoint() {
		return destinationEndpoint;
	}

	/**
	 * Set the specifies the destination endpoint for the binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @param destinationEndpoint the input value
	 */
	public void  setDestinationEndpoint(Long destinationEndpoint) {
		this.destinationEndpoint = destinationEndpoint;
	}

	/**
	 * Set the specifies the destination endpoint for the binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @param destinationEndpoint the input value
	 * @return this instance
	 */
	public Binding withDestinationEndpoint(Long destinationEndpoint) {
		this.destinationEndpoint = destinationEndpoint;
		return this;
	}

	/**
	 * Get the specifies the IEEE destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public IEEE_EUI64 getIeeEDestinationAddress() {
		return ieeEDestinationAddress;
	}

	/**
	 * Set the specifies the IEEE destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @param ieeEDestinationAddress the input value
	 */
	public void  setIeeEDestinationAddress(IEEE_EUI64 ieeEDestinationAddress) {
		this.ieeEDestinationAddress = ieeEDestinationAddress;
	}

	/**
	 * Set the specifies the IEEE destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Endpoint|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @param ieeEDestinationAddress the input value
	 * @return this instance
	 */
	public Binding withIeeEDestinationAddress(IEEE_EUI64 ieeEDestinationAddress) {
		this.ieeEDestinationAddress = ieeEDestinationAddress;
		return this;
	}

	/**
	 * Get the specifies the group destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Group|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public ZigBeeNetworkAddress getGroupDestinationAddress() {
		return groupDestinationAddress;
	}

	/**
	 * Set the specifies the group destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Group|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @param groupDestinationAddress the input value
	 */
	public void  setGroupDestinationAddress(ZigBeeNetworkAddress groupDestinationAddress) {
		this.groupDestinationAddress = groupDestinationAddress;
	}

	/**
	 * Set the specifies the group destination address for this binding entry. The value of this field is valid when the value of the {{param|DestinationAddressMode}} is {{enum|Group|DestinationAddressMode}}.
	 *
	 * @since 2.7
	 * @param groupDestinationAddress the input value
	 * @return this instance
	 */
	public Binding withGroupDestinationAddress(ZigBeeNetworkAddress groupDestinationAddress) {
		this.groupDestinationAddress = groupDestinationAddress;
		return this;
	}

	//</editor-fold>

}