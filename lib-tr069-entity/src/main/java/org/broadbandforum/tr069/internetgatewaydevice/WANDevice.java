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
package org.broadbandforum.tr069.internetgatewaydevice;

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
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.WANCommonInterfaceConfig;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.WANConnectionDevice;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.WANDSLConnectionManagement;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.WANDSLDiagnostics;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.WANDSLInterfaceConfig;
import org.broadbandforum.tr069.internetgatewaydevice.wandevice.WANEthernetInterfaceConfig;

	/**
	 * Each instance contains all objects associated with a particular physical WAN interface.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.")
@XmlRootElement(name = "InternetGatewayDevice.WANDevice")
@XmlType(name = "InternetGatewayDevice.WANDevice")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANDevice {

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
	 * This object is required for a CPE with a DSL modem WAN interface
	 */
	@XmlElement(name = "WANDSLConnectionManagement")
	public WANDSLConnectionManagement wanDSLConnectionManagement;
	/**
	 * This object is required for a CPE with an ADSL2 or ADSL2+ modem WAN interface, and optional otherwise.
	 */
	@XmlElement(name = "WANDSLDiagnostics")
	public WANDSLDiagnostics wanDSLDiagnostics;
	/**
	 * Each instance contains objects associated with a given WAN link.  In this case of DSL, each instance corresponds to a single ATM VC.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.
	 */
	@XmlElementWrapper(name = "WANConnectionDevices")
	@XmlElement(name = "WANConnectionDevice")
	@CWMPParameter(access = "readWrite")
	public Collection<WANConnectionDevice> wanConnectionDevices;

	public WANDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	 * Get the this object is required for a CPE with a DSL modem WAN interface
	 *
	 * @return the value
	 */
	public WANDSLConnectionManagement getWanDSLConnectionManagement() {
		return wanDSLConnectionManagement;
	}

	/**
	 * Set the this object is required for a CPE with a DSL modem WAN interface
	 *
	 * @param wanDSLConnectionManagement the input value
	 */
	public void  setWanDSLConnectionManagement(WANDSLConnectionManagement wanDSLConnectionManagement) {
		this.wanDSLConnectionManagement = wanDSLConnectionManagement;
	}

	/**
	 * Set the this object is required for a CPE with a DSL modem WAN interface
	 *
	 * @param wanDSLConnectionManagement the input value
	 * @return this instance
	 */
	public WANDevice withWanDSLConnectionManagement(WANDSLConnectionManagement wanDSLConnectionManagement) {
		this.wanDSLConnectionManagement = wanDSLConnectionManagement;
		return this;
	}

	/**
	 * Get the this object is required for a CPE with an ADSL2 or ADSL2+ modem WAN interface, and optional otherwise.
	 *
	 * @return the value
	 */
	public WANDSLDiagnostics getWanDSLDiagnostics() {
		return wanDSLDiagnostics;
	}

	/**
	 * Set the this object is required for a CPE with an ADSL2 or ADSL2+ modem WAN interface, and optional otherwise.
	 *
	 * @param wanDSLDiagnostics the input value
	 */
	public void  setWanDSLDiagnostics(WANDSLDiagnostics wanDSLDiagnostics) {
		this.wanDSLDiagnostics = wanDSLDiagnostics;
	}

	/**
	 * Set the this object is required for a CPE with an ADSL2 or ADSL2+ modem WAN interface, and optional otherwise.
	 *
	 * @param wanDSLDiagnostics the input value
	 * @return this instance
	 */
	public WANDevice withWanDSLDiagnostics(WANDSLDiagnostics wanDSLDiagnostics) {
		this.wanDSLDiagnostics = wanDSLDiagnostics;
		return this;
	}

	/**
	 * Get the each instance contains objects associated with a given WAN link.  In this case of DSL, each instance corresponds to a single ATM VC.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.
	 *
	 * @return the value
	 */
	public Collection<WANConnectionDevice> getWanConnectionDevices() {
		if (this.wanConnectionDevices == null){ this.wanConnectionDevices=new ArrayList<>();}
		return wanConnectionDevices;
	}

	/**
	 * Set the each instance contains objects associated with a given WAN link.  In this case of DSL, each instance corresponds to a single ATM VC.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.
	 *
	 * @param wanConnectionDevices the input value
	 */
	public void  setWanConnectionDevices(Collection<WANConnectionDevice> wanConnectionDevices) {
		this.wanConnectionDevices = wanConnectionDevices;
	}

	/**
	 * Set the each instance contains objects associated with a given WAN link.  In this case of DSL, each instance corresponds to a single ATM VC.  On creation of a ''WANConnectionDevice'' instance, there are initially no connection objects contained within.
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