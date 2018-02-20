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

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The {{object}} object describes the node capabilities of the ZigBee device as defined in {{bibref|ZigBee2007|section 2.3.2.3 Node Descriptor}}.
	 *
	 * @since TR181 v2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.NodeDescriptor.")
@XmlRootElement(name = "Device.ZigBee.ZDO.NodeDescriptor")
@XmlType(name = "Device.ZigBee.ZDO.NodeDescriptor")
@XmlAccessorType(XmlAccessType.FIELD)
public class NodeDescriptor {

	/**
	 * The type of ZigBee device that is extracted from the Logical Type Field as defined in {{bibref|ZigBee2007|Table 2.29}}.

          {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "LogicalType")
	public String logicalType;
	/**
	 * When {{true}}, specifies that the {{object|#.ComplexDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ComplexDescriptorSupported")
	public Boolean complexDescriptorSupported;
	/**
	 * When {{true}}, specifies that the {{object|#.UserDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "UserDescriptorSupported")
	public Boolean userDescriptorSupported;
	/**
	 * Specifies the frequency bands that are supported by the underlying IEEE 802.15.4 radio utilized by the ZigBee device.

          {{list}} 

Enumerated value must be one of [868-868.6, 902-928, 2400-2483.5]
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "FrequencyBand")
	@XmlList
	public Collection<String> frequencyBand;
	/**
	 * Specifies  the IEEE 802.15.4-2003 MAC sub-layer capabilities for this ZigBee device.

          {{list}} 

Enumerated value must be one of [AlternatePANCoordinator, FFD, MainsPowerSource, OnWhenIdle, SecureCommunication]
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MACCapability")
	@XmlList
	public Collection<String> macCapability;
	/**
	 * Specifies a manufacturer code that is allocated by the ZigBee Alliance, relating the manufacturer to the device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ManufactureCode")
	@Size(max = 65535)
	public Long manufactureCode;
	/**
	 * Specifies the maximum buffer size, in octets, of the network sub-layer data unit (NSDU) for this ZigBee device.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MaximumBufferSize")
	@Size(max = 128)
	public Long maximumBufferSize;
	/**
	 * Specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred to this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MaximumIncomingTransferSize")
	@Size(max = 32768)
	public Long maximumIncomingTransferSize;
	/**
	 * Specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred from this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "MaximumOutgoingTransferSize")
	@Size(max = 32768)
	public Long maximumOutgoingTransferSize;
	/**
	 * Specifies the system server capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [PrimaryTrustCenter, PrimaryBindingTableCache, BackupBindingTableCache, PrimaryDiscoveryCache, BackupDiscoveryCache, NetworkManager]
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "ServerMask")
	@XmlList
	public Collection<String> serverMask;
	/**
	 * Specifies the descriptor capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [ExtendedActiveEndpointListAvailable, ExtendedSimpleDescriptorListAvailable]
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "DescriptorCapability")
	@XmlList
	public Collection<String> descriptorCapability;

	public NodeDescriptor() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the type of ZigBee device that is extracted from the Logical Type Field as defined in {{bibref|ZigBee2007|Table 2.29}}.

          {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getLogicalType() {
		return logicalType;
	}

	/**
	 * Set the type of ZigBee device that is extracted from the Logical Type Field as defined in {{bibref|ZigBee2007|Table 2.29}}.

          {{enum}}
	 *
	 * @since 2.7
	 * @param logicalType the input value
	 */
	public void  setLogicalType(String logicalType) {
		this.logicalType = logicalType;
	}

	/**
	 * Set the type of ZigBee device that is extracted from the Logical Type Field as defined in {{bibref|ZigBee2007|Table 2.29}}.

          {{enum}}
	 *
	 * @since 2.7
	 * @param logicalType the input value
	 * @return this instance
	 */
	public NodeDescriptor withLogicalType(String logicalType) {
		this.logicalType = logicalType;
		return this;
	}

	/**
	 * Get the when {{true}}, specifies that the {{object|#.ComplexDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isComplexDescriptorSupported() {
		return complexDescriptorSupported;
	}

	/**
	 * Set the when {{true}}, specifies that the {{object|#.ComplexDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 * @param complexDescriptorSupported the input value
	 */
	public void  setComplexDescriptorSupported(Boolean complexDescriptorSupported) {
		this.complexDescriptorSupported = complexDescriptorSupported;
	}

	/**
	 * Set the when {{true}}, specifies that the {{object|#.ComplexDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 * @param complexDescriptorSupported the input value
	 * @return this instance
	 */
	public NodeDescriptor withComplexDescriptorSupported(Boolean complexDescriptorSupported) {
		this.complexDescriptorSupported = complexDescriptorSupported;
		return this;
	}

	/**
	 * Get the when {{true}}, specifies that the {{object|#.UserDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Boolean isUserDescriptorSupported() {
		return userDescriptorSupported;
	}

	/**
	 * Set the when {{true}}, specifies that the {{object|#.UserDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 * @param userDescriptorSupported the input value
	 */
	public void  setUserDescriptorSupported(Boolean userDescriptorSupported) {
		this.userDescriptorSupported = userDescriptorSupported;
	}

	/**
	 * Set the when {{true}}, specifies that the {{object|#.UserDescriptor}} object is supported for this ZigBee device.
	 *
	 * @since 2.7
	 * @param userDescriptorSupported the input value
	 * @return this instance
	 */
	public NodeDescriptor withUserDescriptorSupported(Boolean userDescriptorSupported) {
		this.userDescriptorSupported = userDescriptorSupported;
		return this;
	}

	/**
	 * Get the specifies the frequency bands that are supported by the underlying IEEE 802.15.4 radio utilized by the ZigBee device.

          {{list}} 

Enumerated value must be one of [868-868.6, 902-928, 2400-2483.5]
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getFrequencyBand() {
		if (this.frequencyBand == null){ this.frequencyBand=new ArrayList<>();}
		return frequencyBand;
	}

	/**
	 * Set the specifies the frequency bands that are supported by the underlying IEEE 802.15.4 radio utilized by the ZigBee device.

          {{list}} 

Enumerated value must be one of [868-868.6, 902-928, 2400-2483.5]
	 *
	 * @since 2.7
	 * @param frequencyBand the input value
	 */
	public void  setFrequencyBand(Collection<String> frequencyBand) {
		this.frequencyBand = frequencyBand;
	}

	/**
	 * Set the specifies the frequency bands that are supported by the underlying IEEE 802.15.4 radio utilized by the ZigBee device.

          {{list}} 

Enumerated value must be one of [868-868.6, 902-928, 2400-2483.5]
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public NodeDescriptor withFrequencyBand(String string) {
		getFrequencyBand().add(string);
		return this;
	}

	/**
	 * Get the specifies  the IEEE 802.15.4-2003 MAC sub-layer capabilities for this ZigBee device.

          {{list}} 

Enumerated value must be one of [AlternatePANCoordinator, FFD, MainsPowerSource, OnWhenIdle, SecureCommunication]
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getMacCapability() {
		if (this.macCapability == null){ this.macCapability=new ArrayList<>();}
		return macCapability;
	}

	/**
	 * Set the specifies  the IEEE 802.15.4-2003 MAC sub-layer capabilities for this ZigBee device.

          {{list}} 

Enumerated value must be one of [AlternatePANCoordinator, FFD, MainsPowerSource, OnWhenIdle, SecureCommunication]
	 *
	 * @since 2.7
	 * @param macCapability the input value
	 */
	public void  setMacCapability(Collection<String> macCapability) {
		this.macCapability = macCapability;
	}

	/**
	 * Set the specifies  the IEEE 802.15.4-2003 MAC sub-layer capabilities for this ZigBee device.

          {{list}} 

Enumerated value must be one of [AlternatePANCoordinator, FFD, MainsPowerSource, OnWhenIdle, SecureCommunication]
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public NodeDescriptor withMacCapability(String string) {
		getMacCapability().add(string);
		return this;
	}

	/**
	 * Get the specifies a manufacturer code that is allocated by the ZigBee Alliance, relating the manufacturer to the device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getManufactureCode() {
		return manufactureCode;
	}

	/**
	 * Set the specifies a manufacturer code that is allocated by the ZigBee Alliance, relating the manufacturer to the device.
	 *
	 * @since 2.7
	 * @param manufactureCode the input value
	 */
	public void  setManufactureCode(Long manufactureCode) {
		this.manufactureCode = manufactureCode;
	}

	/**
	 * Set the specifies a manufacturer code that is allocated by the ZigBee Alliance, relating the manufacturer to the device.
	 *
	 * @since 2.7
	 * @param manufactureCode the input value
	 * @return this instance
	 */
	public NodeDescriptor withManufactureCode(Long manufactureCode) {
		this.manufactureCode = manufactureCode;
		return this;
	}

	/**
	 * Get the specifies the maximum buffer size, in octets, of the network sub-layer data unit (NSDU) for this ZigBee device.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getMaximumBufferSize() {
		return maximumBufferSize;
	}

	/**
	 * Set the specifies the maximum buffer size, in octets, of the network sub-layer data unit (NSDU) for this ZigBee device.
	 *
	 * @since 2.7
	 * @param maximumBufferSize the input value
	 */
	public void  setMaximumBufferSize(Long maximumBufferSize) {
		this.maximumBufferSize = maximumBufferSize;
	}

	/**
	 * Set the specifies the maximum buffer size, in octets, of the network sub-layer data unit (NSDU) for this ZigBee device.
	 *
	 * @since 2.7
	 * @param maximumBufferSize the input value
	 * @return this instance
	 */
	public NodeDescriptor withMaximumBufferSize(Long maximumBufferSize) {
		this.maximumBufferSize = maximumBufferSize;
		return this;
	}

	/**
	 * Get the specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred to this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getMaximumIncomingTransferSize() {
		return maximumIncomingTransferSize;
	}

	/**
	 * Set the specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred to this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 * @param maximumIncomingTransferSize the input value
	 */
	public void  setMaximumIncomingTransferSize(Long maximumIncomingTransferSize) {
		this.maximumIncomingTransferSize = maximumIncomingTransferSize;
	}

	/**
	 * Set the specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred to this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 * @param maximumIncomingTransferSize the input value
	 * @return this instance
	 */
	public NodeDescriptor withMaximumIncomingTransferSize(Long maximumIncomingTransferSize) {
		this.maximumIncomingTransferSize = maximumIncomingTransferSize;
		return this;
	}

	/**
	 * Get the specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred from this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getMaximumOutgoingTransferSize() {
		return maximumOutgoingTransferSize;
	}

	/**
	 * Set the specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred from this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 * @param maximumOutgoingTransferSize the input value
	 */
	public void  setMaximumOutgoingTransferSize(Long maximumOutgoingTransferSize) {
		this.maximumOutgoingTransferSize = maximumOutgoingTransferSize;
	}

	/**
	 * Set the specifies the maximum size, in octets, of the application sub-layer data unit (ASDU) that can be transferred from this ZigBee device in one single message transfer.
	 *
	 * @since 2.7
	 * @param maximumOutgoingTransferSize the input value
	 * @return this instance
	 */
	public NodeDescriptor withMaximumOutgoingTransferSize(Long maximumOutgoingTransferSize) {
		this.maximumOutgoingTransferSize = maximumOutgoingTransferSize;
		return this;
	}

	/**
	 * Get the specifies the system server capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [PrimaryTrustCenter, PrimaryBindingTableCache, BackupBindingTableCache, PrimaryDiscoveryCache, BackupDiscoveryCache, NetworkManager]
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getServerMask() {
		if (this.serverMask == null){ this.serverMask=new ArrayList<>();}
		return serverMask;
	}

	/**
	 * Set the specifies the system server capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [PrimaryTrustCenter, PrimaryBindingTableCache, BackupBindingTableCache, PrimaryDiscoveryCache, BackupDiscoveryCache, NetworkManager]
	 *
	 * @since 2.7
	 * @param serverMask the input value
	 */
	public void  setServerMask(Collection<String> serverMask) {
		this.serverMask = serverMask;
	}

	/**
	 * Set the specifies the system server capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [PrimaryTrustCenter, PrimaryBindingTableCache, BackupBindingTableCache, PrimaryDiscoveryCache, BackupDiscoveryCache, NetworkManager]
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public NodeDescriptor withServerMask(String string) {
		getServerMask().add(string);
		return this;
	}

	/**
	 * Get the specifies the descriptor capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [ExtendedActiveEndpointListAvailable, ExtendedSimpleDescriptorListAvailable]
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Collection<String> getDescriptorCapability() {
		if (this.descriptorCapability == null){ this.descriptorCapability=new ArrayList<>();}
		return descriptorCapability;
	}

	/**
	 * Set the specifies the descriptor capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [ExtendedActiveEndpointListAvailable, ExtendedSimpleDescriptorListAvailable]
	 *
	 * @since 2.7
	 * @param descriptorCapability the input value
	 */
	public void  setDescriptorCapability(Collection<String> descriptorCapability) {
		this.descriptorCapability = descriptorCapability;
	}

	/**
	 * Set the specifies the descriptor capabilities of this ZigBee device.

          {{list}} 

Enumerated value must be one of [ExtendedActiveEndpointListAvailable, ExtendedSimpleDescriptorListAvailable]
	 *
	 * @since 2.7
	 * @param string the input value
	 * @return this instance
	 */
	public NodeDescriptor withDescriptorCapability(String string) {
		getDescriptorCapability().add(string);
		return this;
	}

	//</editor-fold>

}