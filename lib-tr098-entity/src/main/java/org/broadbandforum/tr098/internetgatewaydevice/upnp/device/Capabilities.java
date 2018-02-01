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
package org.broadbandforum.tr098.internetgatewaydevice.upnp.device;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object defines what UPnP capabilities this device has.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.UPnP.Device.Capabilities.")
public class Capabilities {

	/**
	 * Numeric value indicating the major version of the supported UPnP architecture. 

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 2.

A value of 0 indicates no UPnP support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPArchitecture")
	public Long upnPArchitecture;
	/**
	 * Numeric value indicating the minor version of the supported UPnP architecture.

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 0.

If {{param|UPnPArchitecture}} is 0 then this parameter SHOULD be ignored.
	 *
	 * @since 1.7
	 */
	@XmlElement(name = "UPnPArchitectureMinorVer")
	public Long upnPArchitectureMinorVer;
	/**
	 * Numeric value indicating the supported revision for UPnP Media Server.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPMediaServer")
	public Long upnPMediaServer;
	/**
	 * Numeric value indicating the supported revision for UPnP Media Renderer.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPMediaRenderer")
	public Long upnPMediaRenderer;
	/**
	 * Numeric value indicating the supported revision for UPnP Wireless Access Point.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPWLANAccessPoint")
	public Long upnPWLANAccessPoint;
	/**
	 * Numeric value indicating the supported revision for UPnP Basic Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPBasicDevice")
	public Long upnPBasicDevice;
	/**
	 * Numeric value indicating the supported revision for UPnP Qos Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPQoSDevice")
	public Long upnPQoSDevice;
	/**
	 * Numeric value indicating the supported revision for UPnP Qos Policy Holder.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPQoSPolicyHolder")
	public Long upnPQoSPolicyHolder;
	/**
	 * Numeric value indicating the supported revision for UPnP IGD.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "UPnPIGD")
	public Long upnPIGD;
	/**
	 * Numeric value indicating the supported revision for UPnP-DM Basic Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 */
	@XmlElement(name = "UPnPDMBasicMgmt")
	public Long upnPDMBasicMgmt;
	/**
	 * Numeric value indicating the supported revision for UPnP-DM Configuration Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 */
	@XmlElement(name = "UPnPDMConfigurationMgmt")
	public Long upnPDMConfigurationMgmt;
	/**
	 * Numeric value indicating the supported revision for UPnP-DM Software Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 */
	@XmlElement(name = "UPnPDMSoftwareMgmt")
	public Long upnPDMSoftwareMgmt;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the numeric value indicating the major version of the supported UPnP architecture. 

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 2.

A value of 0 indicates no UPnP support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPArchitecture() {
		return upnPArchitecture;
	}

	/**
	 * Set the numeric value indicating the major version of the supported UPnP architecture. 

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 2.

A value of 0 indicates no UPnP support.
	 *
	 * @since 1.5
	 * @param upnPArchitecture the input value
	 */
	public void  setUpnPArchitecture(Long upnPArchitecture) {
		this.upnPArchitecture = upnPArchitecture;
	}

	/**
	 * Set the numeric value indicating the major version of the supported UPnP architecture. 

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 2.

A value of 0 indicates no UPnP support.
	 *
	 * @since 1.5
	 * @param upnPArchitecture the input value
	 * @return this instance
	 */
	public Capabilities withUpnPArchitecture(Long upnPArchitecture) {
		this.upnPArchitecture = upnPArchitecture;
		return this;
	}

	/**
	 * Get the numeric value indicating the minor version of the supported UPnP architecture.

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 0.

If {{param|UPnPArchitecture}} is 0 then this parameter SHOULD be ignored.
	 *
	 * @since 1.7
	 * @return the value
	 */
	public Long getUpnPArchitectureMinorVer() {
		return upnPArchitectureMinorVer;
	}

	/**
	 * Set the numeric value indicating the minor version of the supported UPnP architecture.

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 0.

If {{param|UPnPArchitecture}} is 0 then this parameter SHOULD be ignored.
	 *
	 * @since 1.7
	 * @param upnPArchitectureMinorVer the input value
	 */
	public void  setUpnPArchitectureMinorVer(Long upnPArchitectureMinorVer) {
		this.upnPArchitectureMinorVer = upnPArchitectureMinorVer;
	}

	/**
	 * Set the numeric value indicating the minor version of the supported UPnP architecture.

If UPnP 1.1 is supported the value is 1.  If UPnP 2.0 is supported the value is 0.

If {{param|UPnPArchitecture}} is 0 then this parameter SHOULD be ignored.
	 *
	 * @since 1.7
	 * @param upnPArchitectureMinorVer the input value
	 * @return this instance
	 */
	public Capabilities withUpnPArchitectureMinorVer(Long upnPArchitectureMinorVer) {
		this.upnPArchitectureMinorVer = upnPArchitectureMinorVer;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP Media Server.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPMediaServer() {
		return upnPMediaServer;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Media Server.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPMediaServer the input value
	 */
	public void  setUpnPMediaServer(Long upnPMediaServer) {
		this.upnPMediaServer = upnPMediaServer;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Media Server.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPMediaServer the input value
	 * @return this instance
	 */
	public Capabilities withUpnPMediaServer(Long upnPMediaServer) {
		this.upnPMediaServer = upnPMediaServer;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP Media Renderer.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPMediaRenderer() {
		return upnPMediaRenderer;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Media Renderer.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPMediaRenderer the input value
	 */
	public void  setUpnPMediaRenderer(Long upnPMediaRenderer) {
		this.upnPMediaRenderer = upnPMediaRenderer;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Media Renderer.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPMediaRenderer the input value
	 * @return this instance
	 */
	public Capabilities withUpnPMediaRenderer(Long upnPMediaRenderer) {
		this.upnPMediaRenderer = upnPMediaRenderer;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP Wireless Access Point.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPWLANAccessPoint() {
		return upnPWLANAccessPoint;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Wireless Access Point.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPWLANAccessPoint the input value
	 */
	public void  setUpnPWLANAccessPoint(Long upnPWLANAccessPoint) {
		this.upnPWLANAccessPoint = upnPWLANAccessPoint;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Wireless Access Point.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPWLANAccessPoint the input value
	 * @return this instance
	 */
	public Capabilities withUpnPWLANAccessPoint(Long upnPWLANAccessPoint) {
		this.upnPWLANAccessPoint = upnPWLANAccessPoint;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP Basic Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPBasicDevice() {
		return upnPBasicDevice;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Basic Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPBasicDevice the input value
	 */
	public void  setUpnPBasicDevice(Long upnPBasicDevice) {
		this.upnPBasicDevice = upnPBasicDevice;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Basic Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPBasicDevice the input value
	 * @return this instance
	 */
	public Capabilities withUpnPBasicDevice(Long upnPBasicDevice) {
		this.upnPBasicDevice = upnPBasicDevice;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP Qos Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPQoSDevice() {
		return upnPQoSDevice;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Qos Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPQoSDevice the input value
	 */
	public void  setUpnPQoSDevice(Long upnPQoSDevice) {
		this.upnPQoSDevice = upnPQoSDevice;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Qos Device.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPQoSDevice the input value
	 * @return this instance
	 */
	public Capabilities withUpnPQoSDevice(Long upnPQoSDevice) {
		this.upnPQoSDevice = upnPQoSDevice;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP Qos Policy Holder.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPQoSPolicyHolder() {
		return upnPQoSPolicyHolder;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Qos Policy Holder.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPQoSPolicyHolder the input value
	 */
	public void  setUpnPQoSPolicyHolder(Long upnPQoSPolicyHolder) {
		this.upnPQoSPolicyHolder = upnPQoSPolicyHolder;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP Qos Policy Holder.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPQoSPolicyHolder the input value
	 * @return this instance
	 */
	public Capabilities withUpnPQoSPolicyHolder(Long upnPQoSPolicyHolder) {
		this.upnPQoSPolicyHolder = upnPQoSPolicyHolder;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP IGD.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getUpnPIGD() {
		return upnPIGD;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP IGD.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPIGD the input value
	 */
	public void  setUpnPIGD(Long upnPIGD) {
		this.upnPIGD = upnPIGD;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP IGD.

A value of 0 indicates no support.
	 *
	 * @since 1.5
	 * @param upnPIGD the input value
	 * @return this instance
	 */
	public Capabilities withUpnPIGD(Long upnPIGD) {
		this.upnPIGD = upnPIGD;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP-DM Basic Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @return the value
	 */
	public Long getUpnPDMBasicMgmt() {
		return upnPDMBasicMgmt;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP-DM Basic Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @param upnPDMBasicMgmt the input value
	 */
	public void  setUpnPDMBasicMgmt(Long upnPDMBasicMgmt) {
		this.upnPDMBasicMgmt = upnPDMBasicMgmt;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP-DM Basic Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @param upnPDMBasicMgmt the input value
	 * @return this instance
	 */
	public Capabilities withUpnPDMBasicMgmt(Long upnPDMBasicMgmt) {
		this.upnPDMBasicMgmt = upnPDMBasicMgmt;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP-DM Configuration Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @return the value
	 */
	public Long getUpnPDMConfigurationMgmt() {
		return upnPDMConfigurationMgmt;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP-DM Configuration Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @param upnPDMConfigurationMgmt the input value
	 */
	public void  setUpnPDMConfigurationMgmt(Long upnPDMConfigurationMgmt) {
		this.upnPDMConfigurationMgmt = upnPDMConfigurationMgmt;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP-DM Configuration Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @param upnPDMConfigurationMgmt the input value
	 * @return this instance
	 */
	public Capabilities withUpnPDMConfigurationMgmt(Long upnPDMConfigurationMgmt) {
		this.upnPDMConfigurationMgmt = upnPDMConfigurationMgmt;
		return this;
	}

	/**
	 * Get the numeric value indicating the supported revision for UPnP-DM Software Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @return the value
	 */
	public Long getUpnPDMSoftwareMgmt() {
		return upnPDMSoftwareMgmt;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP-DM Software Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @param upnPDMSoftwareMgmt the input value
	 */
	public void  setUpnPDMSoftwareMgmt(Long upnPDMSoftwareMgmt) {
		this.upnPDMSoftwareMgmt = upnPDMSoftwareMgmt;
	}

	/**
	 * Set the numeric value indicating the supported revision for UPnP-DM Software Management.

A value of 0 indicates no support.
	 *
	 * @since 1.7
	 * @param upnPDMSoftwareMgmt the input value
	 * @return this instance
	 */
	public Capabilities withUpnPDMSoftwareMgmt(Long upnPDMSoftwareMgmt) {
		this.upnPDMSoftwareMgmt = upnPDMSoftwareMgmt;
		return this;
	}

	//</editor-fold>

}