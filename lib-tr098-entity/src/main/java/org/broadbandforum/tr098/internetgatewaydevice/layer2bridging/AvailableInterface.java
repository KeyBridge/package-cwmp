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
package org.broadbandforum.tr098.internetgatewaydevice.layer2bridging;

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
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Table containing all LAN and WAN interfaces that are available to be referenced by the Bridge table.  Only interfaces that can carry layer 2 bridged traffic are included.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.AvailableInterface.{i}.")
@XmlRootElement(name = "AvailableInterface")
@XmlType(name = "InternetGatewayDevice.Layer2Bridging.AvailableInterface")
@XmlAccessorType(XmlAccessType.FIELD)
public class AvailableInterface {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
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
	 * {{reference|an available LAN or WAN interface}}  This table SHOULD contain a single entry for each available LAN and WAN interface.

When such an interface is modeled in more than one place within the data model, the value of this parameter MUST include the full hierarchical parameter names of all of the corresponding objects.  For example, if a given Ethernet interface is present within two ''LANDevice'' instances, the value of this parameter might be: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.1, InternetGatewayDevice.LANDevice.2.LANEthernetInterfaceConfig.1''

Note that the remainder of the parameter description does not refer to the possibility that the parameter value is a comma-separated list.  Nevertheless, the above requirement does apply.

* For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer 2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

* For a LAN interface, this parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object, or a ''WLANConfiguration'' object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''WAN**Connection'' service.  This table SHOULD include an entry for each layer 3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

* For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''LANDevice''.  This table SHOULD include an entry for each ''LANDevice'', each of which is associated with a LAN-side layer 3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "InterfaceReference")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	@XmlList
	public Collection<String> interfaceReference;

	public AvailableInterface() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public AvailableInterface withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

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
	 * Get the {{reference|an available LAN or WAN interface}}  This table SHOULD contain a single entry for each available LAN and WAN interface.

When such an interface is modeled in more than one place within the data model, the value of this parameter MUST include the full hierarchical parameter names of all of the corresponding objects.  For example, if a given Ethernet interface is present within two ''LANDevice'' instances, the value of this parameter might be: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.1, InternetGatewayDevice.LANDevice.2.LANEthernetInterfaceConfig.1''

Note that the remainder of the parameter description does not refer to the possibility that the parameter value is a comma-separated list.  Nevertheless, the above requirement does apply.

* For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer 2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

* For a LAN interface, this parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object, or a ''WLANConfiguration'' object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''WAN**Connection'' service.  This table SHOULD include an entry for each layer 3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

* For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''LANDevice''.  This table SHOULD include an entry for each ''LANDevice'', each of which is associated with a LAN-side layer 3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Collection<String> getInterfaceReference() {
		if (this.interfaceReference == null){ this.interfaceReference=new ArrayList<>();}
		return interfaceReference;
	}

	/**
	 * Set the {{reference|an available LAN or WAN interface}}  This table SHOULD contain a single entry for each available LAN and WAN interface.

When such an interface is modeled in more than one place within the data model, the value of this parameter MUST include the full hierarchical parameter names of all of the corresponding objects.  For example, if a given Ethernet interface is present within two ''LANDevice'' instances, the value of this parameter might be: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.1, InternetGatewayDevice.LANDevice.2.LANEthernetInterfaceConfig.1''

Note that the remainder of the parameter description does not refer to the possibility that the parameter value is a comma-separated list.  Nevertheless, the above requirement does apply.

* For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer 2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

* For a LAN interface, this parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object, or a ''WLANConfiguration'' object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''WAN**Connection'' service.  This table SHOULD include an entry for each layer 3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

* For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''LANDevice''.  This table SHOULD include an entry for each ''LANDevice'', each of which is associated with a LAN-side layer 3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 * @param interfaceReference the input value
	 */
	public void  setInterfaceReference(Collection<String> interfaceReference) {
		this.interfaceReference = interfaceReference;
	}

	/**
	 * Set the {{reference|an available LAN or WAN interface}}  This table SHOULD contain a single entry for each available LAN and WAN interface.

When such an interface is modeled in more than one place within the data model, the value of this parameter MUST include the full hierarchical parameter names of all of the corresponding objects.  For example, if a given Ethernet interface is present within two ''LANDevice'' instances, the value of this parameter might be: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.1, InternetGatewayDevice.LANDevice.2.LANEthernetInterfaceConfig.1''

Note that the remainder of the parameter description does not refer to the possibility that the parameter value is a comma-separated list.  Nevertheless, the above requirement does apply.

* For a WAN interface, this parameter is the full hierarchical parameter name of a particular ''WANConnectionDevice''.  A ''WANConnectionDevice'' is considered available (included in this table) only if it supports layer 2 bridged traffic.  That is, this table MUST include only ''WANConnectionDevice''s that contain either a ''WANEthernetLinkConfig'' object, or that contain a ''WANDSLLinkConfig'' object for which the ''LinkType'' is ''EoA''.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2''

* For a LAN interface, this parameter is the full hierarchical parameter name of a particular ''LAN**InterfaceConfig'' object, or a ''WLANConfiguration'' object.  This table SHOULD include one entry for each such object.  For example: ''InternetGatewayDevice.LANDevice.1.LANEthernetInterfaceConfig.2''

* For a WAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''WAN**Connection'' service.  This table SHOULD include an entry for each layer 3 WAN connection.  For example: ''InternetGatewayDevice.WANDevice.1.WANConnectionDevice.2.WANPPPConnection.1''

* For a LAN-side connection to the Gateway's IP router, this parameter is the full hierarchical parameter name of a particular ''LANDevice''.  This table SHOULD include an entry for each ''LANDevice'', each of which is associated with a LAN-side layer 3 connection to the Gateway's IP router.  For example: ''InternetGatewayDevice.LANDevice.2''
	 *
	 * @since 1.1
	 * @param string the input value
	 * @return this instance
	 */
	public AvailableInterface withInterfaceReference(String string) {
		getInterfaceReference().add(string);
		return this;
	}

	//</editor-fold>

}