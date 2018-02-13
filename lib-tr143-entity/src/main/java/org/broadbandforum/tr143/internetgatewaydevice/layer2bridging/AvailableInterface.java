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
package org.broadbandforum.tr143.internetgatewaydevice.layer2bridging;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Table containing all LAN and WAN interfaces that are available to be referenced by the ''Bridge'' table.  Only interfaces that can carry layer-2 bridged traffic are included.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.AvailableInterface.{i}.")
@XmlRootElement(name = "AvailableInterface")
@XmlType(name = "InternetGatewayDevice.Layer2Bridging.AvailableInterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailableInterface {

	/**
	 * Unique key for each Interface entry.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "AvailableInterfaceKey")
	@CWMPParameter(activeNotify = "canDeny")
	public Long availableInterfaceKey;
	/**
	 * Whether the interface is a LAN-side or WAN-side interface, or a LAN-side or WAN-side connection to the Gateway's IP router.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "InterfaceType")
	@CWMPParameter(activeNotify = "canDeny")
	public String interfaceType;
	/**
	 * This table SHOULD contain a single entry for each available LAN and WAN interface.

For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer-2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

For a LAN interface, this parameter is the full hierarchical parameter name of a particular LAN**InterfaceConfig object, or a WLANConfiguration object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANLANEthernetInterfaceConfig.2''

For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular WAN**Connection service.  This table SHOULD include an entry for each layer-3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular LANDevice.  This table SHOULD include an entry for each LANDevice, each of which is associated with a LAN-side layer-3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "InterfaceReference")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String interfaceReference;

	public AvailableInterface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the unique key for each Interface entry.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Long getAvailableInterfaceKey() {
		return availableInterfaceKey;
	}

	/**
	 * Set the unique key for each Interface entry.
	 *
	 * @since 1.1
	 * @param availableInterfaceKey the input value
	 */
	public void  setAvailableInterfaceKey(Long availableInterfaceKey) {
		this.availableInterfaceKey = availableInterfaceKey;
	}

	/**
	 * Set the unique key for each Interface entry.
	 *
	 * @since 1.1
	 * @param availableInterfaceKey the input value
	 * @return this instance
	 */
	public AvailableInterface withAvailableInterfaceKey(Long availableInterfaceKey) {
		this.availableInterfaceKey = availableInterfaceKey;
		return this;
	}

	/**
	 * Get the whether the interface is a LAN-side or WAN-side interface, or a LAN-side or WAN-side connection to the Gateway's IP router.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getInterfaceType() {
		return interfaceType;
	}

	/**
	 * Set the whether the interface is a LAN-side or WAN-side interface, or a LAN-side or WAN-side connection to the Gateway's IP router.
	 *
	 * @since 1.1
	 * @param interfaceType the input value
	 */
	public void  setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	/**
	 * Set the whether the interface is a LAN-side or WAN-side interface, or a LAN-side or WAN-side connection to the Gateway's IP router.
	 *
	 * @since 1.1
	 * @param interfaceType the input value
	 * @return this instance
	 */
	public AvailableInterface withInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
		return this;
	}

	/**
	 * Get the this table SHOULD contain a single entry for each available LAN and WAN interface.

For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer-2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

For a LAN interface, this parameter is the full hierarchical parameter name of a particular LAN**InterfaceConfig object, or a WLANConfiguration object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANLANEthernetInterfaceConfig.2''

For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular WAN**Connection service.  This table SHOULD include an entry for each layer-3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular LANDevice.  This table SHOULD include an entry for each LANDevice, each of which is associated with a LAN-side layer-3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getInterfaceReference() {
		return interfaceReference;
	}

	/**
	 * Set the this table SHOULD contain a single entry for each available LAN and WAN interface.

For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer-2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

For a LAN interface, this parameter is the full hierarchical parameter name of a particular LAN**InterfaceConfig object, or a WLANConfiguration object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANLANEthernetInterfaceConfig.2''

For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular WAN**Connection service.  This table SHOULD include an entry for each layer-3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular LANDevice.  This table SHOULD include an entry for each LANDevice, each of which is associated with a LAN-side layer-3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 * @param interfaceReference the input value
	 */
	public void  setInterfaceReference(String interfaceReference) {
		this.interfaceReference = interfaceReference;
	}

	/**
	 * Set the this table SHOULD contain a single entry for each available LAN and WAN interface.

For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer-2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

For a LAN interface, this parameter is the full hierarchical parameter name of a particular LAN**InterfaceConfig object, or a WLANConfiguration object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANLANEthernetInterfaceConfig.2''

For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular WAN**Connection service.  This table SHOULD include an entry for each layer-3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular LANDevice.  This table SHOULD include an entry for each LANDevice, each of which is associated with a LAN-side layer-3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 * @param interfaceReference the input value
	 * @return this instance
	 */
	public AvailableInterface withInterfaceReference(String interfaceReference) {
		this.interfaceReference = interfaceReference;
		return this;
	}

	//</editor-fold>

}