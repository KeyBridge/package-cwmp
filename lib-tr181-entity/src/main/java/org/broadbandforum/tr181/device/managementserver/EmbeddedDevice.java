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
package org.broadbandforum.tr181.device.managementserver;

import java.time.LocalDateTime;
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
	 * Each entry in this table represents a distinct Proxied Device that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}} for proxying devices.
	 *
	 * @since 2.3
	 */
@CWMPObject(name = "Device.ManagementServer.EmbeddedDevice.{i}.")
@XmlRootElement(name = "Device.ManagementServer.EmbeddedDevice")
@XmlType(name = "Device.ManagementServer.EmbeddedDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmbeddedDevice {

	/**
	 * Identifier of the controller that is responsible for a sub-network of Proxied Devices within the LAN.

          {{empty}} indicates that this Proxied Device either:

          * Isn't part of a sub-network, within the LAN, with a controller entity.

          * Doesn't need a {{param}} to ensure its {{param|ProxiedDeviceID}} is unique throughout the LAN.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ControllerID")
	@Size(max = 256)
	public String controllerID;
	/**
	 * Idenitfier of the Proxied Device.  

          This is an opaque string that is unique to the Proxied Device within a specific sub-network within the LAN (identified by the {{param|ControllerID}}).  If the {{param|ControllerID}} is {{empty}} this {{param}} is unique across the LAN.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ProxiedDeviceID")
	@Size(max = 256)
	public String proxiedDeviceID;
	/**
	 * {{noreference}}The value MUST be the path name of a table row.  If the referenced object is deleted, this {{object}} instance MUST also be removed. Represents the instance of a multi-instanced object that is directly controlled by, and has come into existence because of, this Proxied Device  that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}}.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Reference")
	public String reference;
	/**
	 * Represents the CWMP-DT schema instance(s) that this Proxied Device is utilizing.  The CWMP-DT schema instance is also the one being utilized by the object referenced within {{param|Reference}}.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "SupportedDataModel")
	@XmlList
	public Collection<String> supportedDataModel;
	/**
	 * References the {{object|.Hosts.Host}} table entry(s), whether active or inactive, that corresponds to this proxied LAN device.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "Host")
	@Size
	@XmlList
	public Collection<String> host;
	/**
	 * The protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "ProxyProtocol")
	public String proxyProtocol;
	/**
	 * {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "ProxyProtocolReference")
	public String proxyProtocolReference;
	/**
	 * {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DiscoveryProtocol")
	@XmlList
	public Collection<String> discoveryProtocol;
	/**
	 * {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 */
	@XmlElement(name = "DiscoveryProtocolReference")
	@XmlList
	public Collection<String> discoveryProtocolReference;
	/**
	 * Whether or not the CPE Proxier has successfully communicated all pending configuration commands down to the Proxied Device.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "CommandProcessed")
	public String commandProcessed;
	/**
	 * Detailed {{param|CommandProcessed}} error description (vendor specific).
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "CommandProcessingErrMsg")
	@Size(max = 1024)
	public String commandProcessingErrMsg;
	/**
	 * The last time that the CPE Proxier synchronized the state of the Proxied Device.  This parameter MUST be updated when a proxy command is executed successfully on the Proxied Device.

          The Unknown Time value, as defined in {{bibref|TR-106a6}}, indicates that the Proxied Device's state has not been synchronized since the CPE Proxier was last rebooted.
	 *
	 * @since 2.3
	 */
	@XmlElement(name = "LastSyncTime")
	public LocalDateTime lastSyncTime;

	public EmbeddedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the identifier of the controller that is responsible for a sub-network of Proxied Devices within the LAN.

          {{empty}} indicates that this Proxied Device either:

          * Isn't part of a sub-network, within the LAN, with a controller entity.

          * Doesn't need a {{param}} to ensure its {{param|ProxiedDeviceID}} is unique throughout the LAN.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getControllerID() {
		return controllerID;
	}

	/**
	 * Set the identifier of the controller that is responsible for a sub-network of Proxied Devices within the LAN.

          {{empty}} indicates that this Proxied Device either:

          * Isn't part of a sub-network, within the LAN, with a controller entity.

          * Doesn't need a {{param}} to ensure its {{param|ProxiedDeviceID}} is unique throughout the LAN.
	 *
	 * @since 2.3
	 * @param controllerID the input value
	 */
	public void  setControllerID(String controllerID) {
		this.controllerID = controllerID;
	}

	/**
	 * Set the identifier of the controller that is responsible for a sub-network of Proxied Devices within the LAN.

          {{empty}} indicates that this Proxied Device either:

          * Isn't part of a sub-network, within the LAN, with a controller entity.

          * Doesn't need a {{param}} to ensure its {{param|ProxiedDeviceID}} is unique throughout the LAN.
	 *
	 * @since 2.3
	 * @param controllerID the input value
	 * @return this instance
	 */
	public EmbeddedDevice withControllerID(String controllerID) {
		this.controllerID = controllerID;
		return this;
	}

	/**
	 * Get the idenitfier of the Proxied Device.  

          This is an opaque string that is unique to the Proxied Device within a specific sub-network within the LAN (identified by the {{param|ControllerID}}).  If the {{param|ControllerID}} is {{empty}} this {{param}} is unique across the LAN.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getProxiedDeviceID() {
		return proxiedDeviceID;
	}

	/**
	 * Set the idenitfier of the Proxied Device.  

          This is an opaque string that is unique to the Proxied Device within a specific sub-network within the LAN (identified by the {{param|ControllerID}}).  If the {{param|ControllerID}} is {{empty}} this {{param}} is unique across the LAN.
	 *
	 * @since 2.3
	 * @param proxiedDeviceID the input value
	 */
	public void  setProxiedDeviceID(String proxiedDeviceID) {
		this.proxiedDeviceID = proxiedDeviceID;
	}

	/**
	 * Set the idenitfier of the Proxied Device.  

          This is an opaque string that is unique to the Proxied Device within a specific sub-network within the LAN (identified by the {{param|ControllerID}}).  If the {{param|ControllerID}} is {{empty}} this {{param}} is unique across the LAN.
	 *
	 * @since 2.3
	 * @param proxiedDeviceID the input value
	 * @return this instance
	 */
	public EmbeddedDevice withProxiedDeviceID(String proxiedDeviceID) {
		this.proxiedDeviceID = proxiedDeviceID;
		return this;
	}

	/**
	 * Get the {{noreference}}The value MUST be the path name of a table row.  If the referenced object is deleted, this {{object}} instance MUST also be removed. Represents the instance of a multi-instanced object that is directly controlled by, and has come into existence because of, this Proxied Device  that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}}.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Set the {{noreference}}The value MUST be the path name of a table row.  If the referenced object is deleted, this {{object}} instance MUST also be removed. Represents the instance of a multi-instanced object that is directly controlled by, and has come into existence because of, this Proxied Device  that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}}.
	 *
	 * @since 2.3
	 * @param reference the input value
	 */
	public void  setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Set the {{noreference}}The value MUST be the path name of a table row.  If the referenced object is deleted, this {{object}} instance MUST also be removed. Represents the instance of a multi-instanced object that is directly controlled by, and has come into existence because of, this Proxied Device  that utilizes the Embedded Object Mechanism {{bibref|TR-069a4|Annex J.1.2}}.
	 *
	 * @since 2.3
	 * @param reference the input value
	 * @return this instance
	 */
	public EmbeddedDevice withReference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * Get the represents the CWMP-DT schema instance(s) that this Proxied Device is utilizing.  The CWMP-DT schema instance is also the one being utilized by the object referenced within {{param|Reference}}.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Collection<String> getSupportedDataModel() {
		if (this.supportedDataModel == null){ this.supportedDataModel=new ArrayList<>();}
		return supportedDataModel;
	}

	/**
	 * Set the represents the CWMP-DT schema instance(s) that this Proxied Device is utilizing.  The CWMP-DT schema instance is also the one being utilized by the object referenced within {{param|Reference}}.
	 *
	 * @since 2.3
	 * @param supportedDataModel the input value
	 */
	public void  setSupportedDataModel(Collection<String> supportedDataModel) {
		this.supportedDataModel = supportedDataModel;
	}

	/**
	 * Set the represents the CWMP-DT schema instance(s) that this Proxied Device is utilizing.  The CWMP-DT schema instance is also the one being utilized by the object referenced within {{param|Reference}}.
	 *
	 * @since 2.3
	 * @param string the input value
	 * @return this instance
	 */
	public EmbeddedDevice withSupportedDataModel(String string) {
		getSupportedDataModel().add(string);
		return this;
	}

	/**
	 * Get the references the {{object|.Hosts.Host}} table entry(s), whether active or inactive, that corresponds to this proxied LAN device.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public Collection<String> getHost() {
		if (this.host == null){ this.host=new ArrayList<>();}
		return host;
	}

	/**
	 * Set the references the {{object|.Hosts.Host}} table entry(s), whether active or inactive, that corresponds to this proxied LAN device.
	 *
	 * @since 2.3
	 * @param host the input value
	 */
	public void  setHost(Collection<String> host) {
		this.host = host;
	}

	/**
	 * Set the references the {{object|.Hosts.Host}} table entry(s), whether active or inactive, that corresponds to this proxied LAN device.
	 *
	 * @since 2.3
	 * @param string the input value
	 * @return this instance
	 */
	public EmbeddedDevice withHost(String string) {
		getHost().add(string);
		return this;
	}

	/**
	 * Get the protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getProxyProtocol() {
		return proxyProtocol;
	}

	/**
	 * Set the protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 * @param proxyProtocol the input value
	 */
	public void  setProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
	}

	/**
	 * Set the protocol being used to communicate between the CPE Proxier and this Proxied Device. {{enum}}

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a6|3.3}} MUST be adhered to.
	 *
	 * @since 2.3
	 * @param proxyProtocol the input value
	 * @return this instance
	 */
	public EmbeddedDevice withProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
		return this;
	}

	/**
	 * Get the {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 * @return the value
	 */
	public String getProxyProtocolReference() {
		return proxyProtocolReference;
	}

	/**
	 * Set the {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 * @param proxyProtocolReference the input value
	 */
	public void  setProxyProtocolReference(String proxyProtocolReference) {
		this.proxyProtocolReference = proxyProtocolReference;
	}

	/**
	 * Set the {{reference|a protocol object that uses the {{param|ProxyProtocol}}}}
	 *
	 * @since 2.6
	 * @param proxyProtocolReference the input value
	 * @return this instance
	 */
	public EmbeddedDevice withProxyProtocolReference(String proxyProtocolReference) {
		this.proxyProtocolReference = proxyProtocolReference;
		return this;
	}

	/**
	 * Get the {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getDiscoveryProtocol() {
		if (this.discoveryProtocol == null){ this.discoveryProtocol=new ArrayList<>();}
		return discoveryProtocol;
	}

	/**
	 * Set the {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 * @param discoveryProtocol the input value
	 */
	public void  setDiscoveryProtocol(Collection<String> discoveryProtocol) {
		this.discoveryProtocol = discoveryProtocol;
	}

	/**
	 * Set the {{list|that represents the discovery protocol(s) for this proxied device}}

          

Enumerated value must be one of [Z-Wave, ZigBee, UPnP, ETSI-M2M]

          Vendors can extend the enumerated values with vendor specific extensions, in which case the rules outlined in {{bibref|TR-106a3|Section 3.3}} MUST be adhered to.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public EmbeddedDevice withDiscoveryProtocol(String string) {
		getDiscoveryProtocol().add(string);
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 * @return the value
	 */
	public Collection<String> getDiscoveryProtocolReference() {
		if (this.discoveryProtocolReference == null){ this.discoveryProtocolReference=new ArrayList<>();}
		return discoveryProtocolReference;
	}

	/**
	 * Set the {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 * @param discoveryProtocolReference the input value
	 */
	public void  setDiscoveryProtocolReference(Collection<String> discoveryProtocolReference) {
		this.discoveryProtocolReference = discoveryProtocolReference;
	}

	/**
	 * Set the {{list}} {{reference|an object discovered using one or more protocols listed in {{param|DiscoveryProtocol}}|ignore}}

          For objects discovered by the UPnP discovery protocol, the {{param}} would contain items that are references to instances of the following:

          * {{object|.UPnP.Discovery.RootDevice}}

          * {{object|.UPnP.Discovery.Device}}

          * {{object|.UPnP.Discovery.Service}}

          For objects discovered by the ETSI-M2M discovery protocol, the {{param}} would contain items that are references to instances of ETSIM2M.SCL.{i}.AreaNwkDeviceInfoInstance.
	 *
	 * @since 2.6
	 * @param string the input value
	 * @return this instance
	 */
	public EmbeddedDevice withDiscoveryProtocolReference(String string) {
		getDiscoveryProtocolReference().add(string);
		return this;
	}

	/**
	 * Get the whether or not the CPE Proxier has successfully communicated all pending configuration commands down to the Proxied Device.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getCommandProcessed() {
		return commandProcessed;
	}

	/**
	 * Set the whether or not the CPE Proxier has successfully communicated all pending configuration commands down to the Proxied Device.
	 *
	 * @since 2.3
	 * @param commandProcessed the input value
	 */
	public void  setCommandProcessed(String commandProcessed) {
		this.commandProcessed = commandProcessed;
	}

	/**
	 * Set the whether or not the CPE Proxier has successfully communicated all pending configuration commands down to the Proxied Device.
	 *
	 * @since 2.3
	 * @param commandProcessed the input value
	 * @return this instance
	 */
	public EmbeddedDevice withCommandProcessed(String commandProcessed) {
		this.commandProcessed = commandProcessed;
		return this;
	}

	/**
	 * Get the detailed {{param|CommandProcessed}} error description (vendor specific).
	 *
	 * @since 2.3
	 * @return the value
	 */
	public String getCommandProcessingErrMsg() {
		return commandProcessingErrMsg;
	}

	/**
	 * Set the detailed {{param|CommandProcessed}} error description (vendor specific).
	 *
	 * @since 2.3
	 * @param commandProcessingErrMsg the input value
	 */
	public void  setCommandProcessingErrMsg(String commandProcessingErrMsg) {
		this.commandProcessingErrMsg = commandProcessingErrMsg;
	}

	/**
	 * Set the detailed {{param|CommandProcessed}} error description (vendor specific).
	 *
	 * @since 2.3
	 * @param commandProcessingErrMsg the input value
	 * @return this instance
	 */
	public EmbeddedDevice withCommandProcessingErrMsg(String commandProcessingErrMsg) {
		this.commandProcessingErrMsg = commandProcessingErrMsg;
		return this;
	}

	/**
	 * Get the last time that the CPE Proxier synchronized the state of the Proxied Device.  This parameter MUST be updated when a proxy command is executed successfully on the Proxied Device.

          The Unknown Time value, as defined in {{bibref|TR-106a6}}, indicates that the Proxied Device's state has not been synchronized since the CPE Proxier was last rebooted.
	 *
	 * @since 2.3
	 * @return the value
	 */
	public LocalDateTime getLastSyncTime() {
		return lastSyncTime;
	}

	/**
	 * Set the last time that the CPE Proxier synchronized the state of the Proxied Device.  This parameter MUST be updated when a proxy command is executed successfully on the Proxied Device.

          The Unknown Time value, as defined in {{bibref|TR-106a6}}, indicates that the Proxied Device's state has not been synchronized since the CPE Proxier was last rebooted.
	 *
	 * @since 2.3
	 * @param lastSyncTime the input value
	 */
	public void  setLastSyncTime(LocalDateTime lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}

	/**
	 * Set the last time that the CPE Proxier synchronized the state of the Proxied Device.  This parameter MUST be updated when a proxy command is executed successfully on the Proxied Device.

          The Unknown Time value, as defined in {{bibref|TR-106a6}}, indicates that the Proxied Device's state has not been synchronized since the CPE Proxier was last rebooted.
	 *
	 * @since 2.3
	 * @param lastSyncTime the input value
	 * @return this instance
	 */
	public EmbeddedDevice withLastSyncTime(LocalDateTime lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
		return this;
	}

	//</editor-fold>

}