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
package org.broadbandforum.tr143.internetgatewaydevice.wandevice.wandslconnectionmanagement;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This table contains an entry for each connection service.

This object is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANDSLConnectionManagement.ConnectionService.{i}.")
@XmlRootElement(name = "ConnectionService")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANDSLConnectionManagement.ConnectionService")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConnectionService {

	/**
	 * Specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WANConnectionDevice")
	@Size(max = 256)
	public String wanConnectionDevice;
	/**
	 * Specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WANConnectionService")
	@Size(max = 256)
	public String wanConnectionService;
	/**
	 * Destination address of the WANConnectionDevice entry.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''

The "PVC:" or "SVC:" prefix is part of the parameter value and MUST be followed by 0 or 1 space characters.  For example, possible values for this parameter are "PVC:8/23" or "PVC: 0/35".

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DestinationAddress")
	@Size(max = 256)
	public String destinationAddress;
	/**
	 * Link Type of the ''WANConnectionDevice'' entry.  One of Link Types as described in ''WANDSLLinkConfig''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LinkType")
	public String linkType;
	/**
	 * Connection Type of the ''WANPPPConnection'' or ''WANIPConnection'' entry. One of ''PossibleConnectionTypes'' as described in ''WAN**Connection'' service.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConnectionType")
	public String connectionType;
	/**
	 * User-readable name of the connection.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 32)
	public String name;

	public ConnectionService() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getWanConnectionDevice() {
		return wanConnectionDevice;
	}

	/**
	 * Set the specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param wanConnectionDevice the input value
	 */
	public void  setWanConnectionDevice(String wanConnectionDevice) {
		this.wanConnectionDevice = wanConnectionDevice;
	}

	/**
	 * Set the specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param wanConnectionDevice the input value
	 * @return this instance
	 */
	public ConnectionService withWanConnectionDevice(String wanConnectionDevice) {
		this.wanConnectionDevice = wanConnectionDevice;
		return this;
	}

	/**
	 * Get the specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getWanConnectionService() {
		return wanConnectionService;
	}

	/**
	 * Set the specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param wanConnectionService the input value
	 */
	public void  setWanConnectionService(String wanConnectionService) {
		this.wanConnectionService = wanConnectionService;
	}

	/**
	 * Set the specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param wanConnectionService the input value
	 * @return this instance
	 */
	public ConnectionService withWanConnectionService(String wanConnectionService) {
		this.wanConnectionService = wanConnectionService;
		return this;
	}

	/**
	 * Get the destination address of the WANConnectionDevice entry.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''

The "PVC:" or "SVC:" prefix is part of the parameter value and MUST be followed by 0 or 1 space characters.  For example, possible values for this parameter are "PVC:8/23" or "PVC: 0/35".

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * Set the destination address of the WANConnectionDevice entry.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''

The "PVC:" or "SVC:" prefix is part of the parameter value and MUST be followed by 0 or 1 space characters.  For example, possible values for this parameter are "PVC:8/23" or "PVC: 0/35".

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param destinationAddress the input value
	 */
	public void  setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	/**
	 * Set the destination address of the WANConnectionDevice entry.  One of:

* ''PVC: VPI/VCI''

* ''SVC: ATM connection name''

* ''SVC: ATM address''

The "PVC:" or "SVC:" prefix is part of the parameter value and MUST be followed by 0 or 1 space characters.  For example, possible values for this parameter are "PVC:8/23" or "PVC: 0/35".

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param destinationAddress the input value
	 * @return this instance
	 */
	public ConnectionService withDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
		return this;
	}

	/**
	 * Get the link Type of the ''WANConnectionDevice'' entry.  One of Link Types as described in ''WANDSLLinkConfig''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLinkType() {
		return linkType;
	}

	/**
	 * Set the link Type of the ''WANConnectionDevice'' entry.  One of Link Types as described in ''WANDSLLinkConfig''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param linkType the input value
	 */
	public void  setLinkType(String linkType) {
		this.linkType = linkType;
	}

	/**
	 * Set the link Type of the ''WANConnectionDevice'' entry.  One of Link Types as described in ''WANDSLLinkConfig''.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param linkType the input value
	 * @return this instance
	 */
	public ConnectionService withLinkType(String linkType) {
		this.linkType = linkType;
		return this;
	}

	/**
	 * Get the connection Type of the ''WANPPPConnection'' or ''WANIPConnection'' entry. One of ''PossibleConnectionTypes'' as described in ''WAN**Connection'' service.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * Set the connection Type of the ''WANPPPConnection'' or ''WANIPConnection'' entry. One of ''PossibleConnectionTypes'' as described in ''WAN**Connection'' service.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param connectionType the input value
	 */
	public void  setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	/**
	 * Set the connection Type of the ''WANPPPConnection'' or ''WANIPConnection'' entry. One of ''PossibleConnectionTypes'' as described in ''WAN**Connection'' service.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param connectionType the input value
	 * @return this instance
	 */
	public ConnectionService withConnectionType(String connectionType) {
		this.connectionType = connectionType;
		return this;
	}

	/**
	 * Get the user-readable name of the connection.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the user-readable name of the connection.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the user-readable name of the connection.

This parameter is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @since 1.0
	 * @param name the input value
	 * @return this instance
	 */
	public ConnectionService withName(String name) {
		this.name = name;
		return this;
	}

	//</editor-fold>

}