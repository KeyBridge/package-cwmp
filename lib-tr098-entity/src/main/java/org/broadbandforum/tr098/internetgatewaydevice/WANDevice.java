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
package org.broadbandforum.tr098.internetgatewaydevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.WANCommonInterfaceConfig;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.WANConnectionDevice;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.WANDSLConnectionManagement;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.WANDSLDiagnostics;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.WANDSLInterfaceConfig;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.WANEthernetInterfaceConfig;

	/**
	 * Each instance contains all objects associated with a particular physical WAN interface.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.")
@XmlRootElement(name = "WANDevice")
@XmlType(name = "InternetGatewayDevice.WANDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANDevice {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * This object models WAN interface properties common across all connection instances.
	 */
	@XmlElement(name = "WANCommonInterfaceConfig")
	public WANCommonInterfaceConfig wanCommonInterfaceConfig;
	/**
	 * This object models physical layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is required for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.
	 */
	@XmlElement(name = "WANDSLInterfaceConfig")
	public WANDSLInterfaceConfig wanDSLInterfaceConfig;
	/**
	 * This object models physical layer properties specific to a single Ethernet physical connection used for Internet access on a CPE.  This object is required for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 */
	@XmlElement(name = "WANEthernetInterfaceConfig")
	public WANEthernetInterfaceConfig wanEthernetInterfaceConfig;
	/**
	 * This object is intended for a CPE with a DSL modem WAN interface.

Note - This object was originally created to allow ''WANConnection'' devices and services to be added dynamically in the IGD object model in TR-064 because UPnP Device Architecture 1.0 did not contain this capability natively.  Because in TR-069 objects can be created and removed using the AddObject and DeleteObject RPCs, ''WANConnection'' interfaces can be managed using these TR-069 mechanisms directly.  Therefore, unlike the TR-064 equivalent, the {{object|ConnectionService}} table within this object is Read-Only in the TR-069 ''InternetGatewayDevice'' data model context.

This object is OBSOLETED because it serves no purpose.
	 */
	@XmlElement(name = "WANDSLConnectionManagement")
	public WANDSLConnectionManagement wanDSLConnectionManagement;
	/**
	 * This object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 */
	@XmlElement(name = "WANDSLDiagnostics")
	public WANDSLDiagnostics wanDSLDiagnostics;
	/**
	 * Each instance contains objects associated with a given WAN link.  In the case of DSL, each instance corresponds to either a single ATM VC or a PTM Ethernet link.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.  In the case of Ethernet (interface or link), only one ''WANConnectionDevice'' instance is supported.
	 */
	@XmlElementWrapper(name = "WANConnectionDevices")
	@XmlElement(name = "WANConnectionDevice")
	@CWMPParameter(access = "readWrite")
	public Collection<WANConnectionDevice> wanConnectionDevices;

	public WANDevice() {
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
	public WANDevice withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this object models WAN interface properties common across all connection instances.
	 *
	 * @return the value
	 */
	public WANCommonInterfaceConfig getWanCommonInterfaceConfig() {
		return wanCommonInterfaceConfig;
	}

	/**
	 * Set the this object models WAN interface properties common across all connection instances.
	 *
	 * @param wanCommonInterfaceConfig the input value
	 */
	public void  setWanCommonInterfaceConfig(WANCommonInterfaceConfig wanCommonInterfaceConfig) {
		this.wanCommonInterfaceConfig = wanCommonInterfaceConfig;
	}

	/**
	 * Set the this object models WAN interface properties common across all connection instances.
	 *
	 * @param wanCommonInterfaceConfig the input value
	 * @return this instance
	 */
	public WANDevice withWanCommonInterfaceConfig(WANCommonInterfaceConfig wanCommonInterfaceConfig) {
		this.wanCommonInterfaceConfig = wanCommonInterfaceConfig;
		return this;
	}

	/**
	 * Get the this object models physical layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is required for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.
	 *
	 * @return the value
	 */
	public WANDSLInterfaceConfig getWanDSLInterfaceConfig() {
		return wanDSLInterfaceConfig;
	}

	/**
	 * Set the this object models physical layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is required for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.
	 *
	 * @param wanDSLInterfaceConfig the input value
	 */
	public void  setWanDSLInterfaceConfig(WANDSLInterfaceConfig wanDSLInterfaceConfig) {
		this.wanDSLInterfaceConfig = wanDSLInterfaceConfig;
	}

	/**
	 * Set the this object models physical layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is required for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.
	 *
	 * @param wanDSLInterfaceConfig the input value
	 * @return this instance
	 */
	public WANDevice withWanDSLInterfaceConfig(WANDSLInterfaceConfig wanDSLInterfaceConfig) {
		this.wanDSLInterfaceConfig = wanDSLInterfaceConfig;
		return this;
	}

	/**
	 * Get the this object models physical layer properties specific to a single Ethernet physical connection used for Internet access on a CPE.  This object is required for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @return the value
	 */
	public WANEthernetInterfaceConfig getWanEthernetInterfaceConfig() {
		return wanEthernetInterfaceConfig;
	}

	/**
	 * Set the this object models physical layer properties specific to a single Ethernet physical connection used for Internet access on a CPE.  This object is required for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @param wanEthernetInterfaceConfig the input value
	 */
	public void  setWanEthernetInterfaceConfig(WANEthernetInterfaceConfig wanEthernetInterfaceConfig) {
		this.wanEthernetInterfaceConfig = wanEthernetInterfaceConfig;
	}

	/**
	 * Set the this object models physical layer properties specific to a single Ethernet physical connection used for Internet access on a CPE.  This object is required for a CPE with an Ethernet WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.  Note that this object is not related to the Ethernet protocol layer sometimes used in associated with a DSL connection.
	 *
	 * @param wanEthernetInterfaceConfig the input value
	 * @return this instance
	 */
	public WANDevice withWanEthernetInterfaceConfig(WANEthernetInterfaceConfig wanEthernetInterfaceConfig) {
		this.wanEthernetInterfaceConfig = wanEthernetInterfaceConfig;
		return this;
	}

	/**
	 * Get the this object is intended for a CPE with a DSL modem WAN interface.

Note - This object was originally created to allow ''WANConnection'' devices and services to be added dynamically in the IGD object model in TR-064 because UPnP Device Architecture 1.0 did not contain this capability natively.  Because in TR-069 objects can be created and removed using the AddObject and DeleteObject RPCs, ''WANConnection'' interfaces can be managed using these TR-069 mechanisms directly.  Therefore, unlike the TR-064 equivalent, the {{object|ConnectionService}} table within this object is Read-Only in the TR-069 ''InternetGatewayDevice'' data model context.

This object is OBSOLETED because it serves no purpose.
	 *
	 * @return the value
	 */
	public WANDSLConnectionManagement getWanDSLConnectionManagement() {
		return wanDSLConnectionManagement;
	}

	/**
	 * Set the this object is intended for a CPE with a DSL modem WAN interface.

Note - This object was originally created to allow ''WANConnection'' devices and services to be added dynamically in the IGD object model in TR-064 because UPnP Device Architecture 1.0 did not contain this capability natively.  Because in TR-069 objects can be created and removed using the AddObject and DeleteObject RPCs, ''WANConnection'' interfaces can be managed using these TR-069 mechanisms directly.  Therefore, unlike the TR-064 equivalent, the {{object|ConnectionService}} table within this object is Read-Only in the TR-069 ''InternetGatewayDevice'' data model context.

This object is OBSOLETED because it serves no purpose.
	 *
	 * @param wanDSLConnectionManagement the input value
	 */
	public void  setWanDSLConnectionManagement(WANDSLConnectionManagement wanDSLConnectionManagement) {
		this.wanDSLConnectionManagement = wanDSLConnectionManagement;
	}

	/**
	 * Set the this object is intended for a CPE with a DSL modem WAN interface.

Note - This object was originally created to allow ''WANConnection'' devices and services to be added dynamically in the IGD object model in TR-064 because UPnP Device Architecture 1.0 did not contain this capability natively.  Because in TR-069 objects can be created and removed using the AddObject and DeleteObject RPCs, ''WANConnection'' interfaces can be managed using these TR-069 mechanisms directly.  Therefore, unlike the TR-064 equivalent, the {{object|ConnectionService}} table within this object is Read-Only in the TR-069 ''InternetGatewayDevice'' data model context.

This object is OBSOLETED because it serves no purpose.
	 *
	 * @param wanDSLConnectionManagement the input value
	 * @return this instance
	 */
	public WANDevice withWanDSLConnectionManagement(WANDSLConnectionManagement wanDSLConnectionManagement) {
		this.wanDSLConnectionManagement = wanDSLConnectionManagement;
		return this;
	}

	/**
	 * Get the this object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 *
	 * @return the value
	 */
	public WANDSLDiagnostics getWanDSLDiagnostics() {
		return wanDSLDiagnostics;
	}

	/**
	 * Set the this object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 *
	 * @param wanDSLDiagnostics the input value
	 */
	public void  setWanDSLDiagnostics(WANDSLDiagnostics wanDSLDiagnostics) {
		this.wanDSLDiagnostics = wanDSLDiagnostics;
	}

	/**
	 * Set the this object is to provide diagnostic information for a CPE with an ADSL2 or ADSL2+ modem WAN interface, but MAY also be used for ADSL.
	 *
	 * @param wanDSLDiagnostics the input value
	 * @return this instance
	 */
	public WANDevice withWanDSLDiagnostics(WANDSLDiagnostics wanDSLDiagnostics) {
		this.wanDSLDiagnostics = wanDSLDiagnostics;
		return this;
	}

	/**
	 * Get the each instance contains objects associated with a given WAN link.  In the case of DSL, each instance corresponds to either a single ATM VC or a PTM Ethernet link.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.  In the case of Ethernet (interface or link), only one ''WANConnectionDevice'' instance is supported.
	 *
	 * @return the value
	 */
	public Collection<WANConnectionDevice> getWanConnectionDevices() {
		if (this.wanConnectionDevices == null){ this.wanConnectionDevices=new ArrayList<>();}
		return wanConnectionDevices;
	}

	/**
	 * Set the each instance contains objects associated with a given WAN link.  In the case of DSL, each instance corresponds to either a single ATM VC or a PTM Ethernet link.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.  In the case of Ethernet (interface or link), only one ''WANConnectionDevice'' instance is supported.
	 *
	 * @param wanConnectionDevices the input value
	 */
	public void  setWanConnectionDevices(Collection<WANConnectionDevice> wanConnectionDevices) {
		this.wanConnectionDevices = wanConnectionDevices;
	}

	/**
	 * Set the each instance contains objects associated with a given WAN link.  In the case of DSL, each instance corresponds to either a single ATM VC or a PTM Ethernet link.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.  In the case of Ethernet (interface or link), only one ''WANConnectionDevice'' instance is supported.
	 *
	 * @param wanConnectionDevice the input value
	 * @return this instance
	 */
	public WANDevice withWANConnectionDevice(WANConnectionDevice wanConnectionDevice) {
		getWanConnectionDevices().add(wanConnectionDevice);
		return this;
	}

	//</editor-fold>

}