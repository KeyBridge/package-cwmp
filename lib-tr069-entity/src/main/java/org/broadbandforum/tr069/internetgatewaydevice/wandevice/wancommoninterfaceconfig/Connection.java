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
package org.broadbandforum.tr069.internetgatewaydevice.wandevice.wancommoninterfaceconfig;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;

	/**
	 * Active connection table.
	 *
	 * @since TR069 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANCommonInterfaceConfig.Connection.{i}.", uniqueConstraints = {@CWMPUnique(names = {"ActiveConnectionServiceID"})})
@XmlRootElement(name = "InternetGatewayDevice.WANDevice.WANCommonInterfaceConfig.Connection")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANCommonInterfaceConfig.Connection")
@XmlAccessorType(XmlAccessType.FIELD)
public class Connection {

	/**
	 * Specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ActiveConnectionDeviceContainer")
	@Size(max = 256)
	public String activeConnectionDeviceContainer;
	/**
	 * Specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ActiveConnectionServiceID")
	@Size(max = 256)
	public String activeConnectionServiceID;

	public Connection() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getActiveConnectionDeviceContainer() {
		return activeConnectionDeviceContainer;
	}

	/**
	 * Set the specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.
	 *
	 * @since 1.0
	 * @param activeConnectionDeviceContainer the input value
	 */
	public void  setActiveConnectionDeviceContainer(String activeConnectionDeviceContainer) {
		this.activeConnectionDeviceContainer = activeConnectionDeviceContainer;
	}

	/**
	 * Set the specifies a WAN connection device object associated with this connection instance.  The content is the full hierarchical parameter name of the WAN connection device.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''.
	 *
	 * @since 1.0
	 * @param activeConnectionDeviceContainer the input value
	 * @return this instance
	 */
	public Connection withActiveConnectionDeviceContainer(String activeConnectionDeviceContainer) {
		this.activeConnectionDeviceContainer = activeConnectionDeviceContainer;
		return this;
	}

	/**
	 * Get the specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getActiveConnectionServiceID() {
		return activeConnectionServiceID;
	}

	/**
	 * Set the specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @param activeConnectionServiceID the input value
	 */
	public void  setActiveConnectionServiceID(String activeConnectionServiceID) {
		this.activeConnectionServiceID = activeConnectionServiceID;
	}

	/**
	 * Set the specifies a WAN connection object associated with this connection instance.  The content is the full hierarchical parameter name of the layer-3 connection object.  Example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''.
	 *
	 * @since 1.0
	 * @param activeConnectionServiceID the input value
	 * @return this instance
	 */
	public Connection withActiveConnectionServiceID(String activeConnectionServiceID) {
		this.activeConnectionServiceID = activeConnectionServiceID;
		return this;
	}

	//</editor-fold>

}