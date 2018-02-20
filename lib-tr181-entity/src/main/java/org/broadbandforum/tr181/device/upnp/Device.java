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
package org.broadbandforum.tr181.device.upnp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.upnp.device.Capabilities;

	/**
	 * This object defines the UPnP devices and UPnP services that are implemented by the CPE.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.UPnP.Device.")
@XmlRootElement(name = "Device.UPnP.Device")
@XmlType(name = "Device.UPnP.Device")
@XmlAccessorType(XmlAccessType.FIELD)
public class Device {

	/**
	 * Enables/Disables UPnP support.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Enables/Disables UPnP Media Server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPMediaServer")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPMediaServer;
	/**
	 * Enables/Disables UPnP Media Renderer.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPMediaRenderer")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPMediaRenderer;
	/**
	 * Enables/Disables UPnP Wireless Access Point.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPWLANAccessPoint")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPWLANAccessPoint;
	/**
	 * Enables/Disables UPnP QoS Device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPQoSDevice ")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPQoSDevice ;
	/**
	 * Enables/Disables UPnP QoS Policy Holder.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPQoSPolicyHolder")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPQoSPolicyHolder;
	/**
	 * Enables/Disables UPnP IGD.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPIGD")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPIGD;
	/**
	 * Enables/Disables UPnP-DM Basic Management.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPDMBasicMgmt")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPDMBasicMgmt;
	/**
	 * Enables/Disables UPnP-DM Configuration Management.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPDMConfigurationMgmt")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPDMConfigurationMgmt;
	/**
	 * Enables/Disables UPnP-DM Software Management.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPnPDMSoftwareMgmt")
	@CWMPParameter(access = "readWrite")
	public Boolean upnPDMSoftwareMgmt;
	/**
	 * This object defines what UPnP capabilities this device has.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;

	public Device() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables/Disables UPnP support.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables/Disables UPnP support.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables/Disables UPnP support.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Device withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP Media Server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPMediaServer() {
		return upnPMediaServer;
	}

	/**
	 * Set the enables/Disables UPnP Media Server.
	 *
	 * @since 2.0
	 * @param upnPMediaServer the input value
	 */
	public void  setUpnPMediaServer(Boolean upnPMediaServer) {
		this.upnPMediaServer = upnPMediaServer;
	}

	/**
	 * Set the enables/Disables UPnP Media Server.
	 *
	 * @since 2.0
	 * @param upnPMediaServer the input value
	 * @return this instance
	 */
	public Device withUpnPMediaServer(Boolean upnPMediaServer) {
		this.upnPMediaServer = upnPMediaServer;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP Media Renderer.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPMediaRenderer() {
		return upnPMediaRenderer;
	}

	/**
	 * Set the enables/Disables UPnP Media Renderer.
	 *
	 * @since 2.0
	 * @param upnPMediaRenderer the input value
	 */
	public void  setUpnPMediaRenderer(Boolean upnPMediaRenderer) {
		this.upnPMediaRenderer = upnPMediaRenderer;
	}

	/**
	 * Set the enables/Disables UPnP Media Renderer.
	 *
	 * @since 2.0
	 * @param upnPMediaRenderer the input value
	 * @return this instance
	 */
	public Device withUpnPMediaRenderer(Boolean upnPMediaRenderer) {
		this.upnPMediaRenderer = upnPMediaRenderer;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP Wireless Access Point.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPWLANAccessPoint() {
		return upnPWLANAccessPoint;
	}

	/**
	 * Set the enables/Disables UPnP Wireless Access Point.
	 *
	 * @since 2.0
	 * @param upnPWLANAccessPoint the input value
	 */
	public void  setUpnPWLANAccessPoint(Boolean upnPWLANAccessPoint) {
		this.upnPWLANAccessPoint = upnPWLANAccessPoint;
	}

	/**
	 * Set the enables/Disables UPnP Wireless Access Point.
	 *
	 * @since 2.0
	 * @param upnPWLANAccessPoint the input value
	 * @return this instance
	 */
	public Device withUpnPWLANAccessPoint(Boolean upnPWLANAccessPoint) {
		this.upnPWLANAccessPoint = upnPWLANAccessPoint;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP QoS Device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPQoSDevice () {
		return upnPQoSDevice ;
	}

	/**
	 * Set the enables/Disables UPnP QoS Device.
	 *
	 * @since 2.0
	 * @param upnPQoSDevice  the input value
	 */
	public void  setUpnPQoSDevice (Boolean upnPQoSDevice ) {
		this.upnPQoSDevice  = upnPQoSDevice ;
	}

	/**
	 * Set the enables/Disables UPnP QoS Device.
	 *
	 * @since 2.0
	 * @param upnPQoSDevice  the input value
	 * @return this instance
	 */
	public Device withUpnPQoSDevice (Boolean upnPQoSDevice ) {
		this.upnPQoSDevice  = upnPQoSDevice ;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP QoS Policy Holder.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPQoSPolicyHolder() {
		return upnPQoSPolicyHolder;
	}

	/**
	 * Set the enables/Disables UPnP QoS Policy Holder.
	 *
	 * @since 2.0
	 * @param upnPQoSPolicyHolder the input value
	 */
	public void  setUpnPQoSPolicyHolder(Boolean upnPQoSPolicyHolder) {
		this.upnPQoSPolicyHolder = upnPQoSPolicyHolder;
	}

	/**
	 * Set the enables/Disables UPnP QoS Policy Holder.
	 *
	 * @since 2.0
	 * @param upnPQoSPolicyHolder the input value
	 * @return this instance
	 */
	public Device withUpnPQoSPolicyHolder(Boolean upnPQoSPolicyHolder) {
		this.upnPQoSPolicyHolder = upnPQoSPolicyHolder;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP IGD.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPIGD() {
		return upnPIGD;
	}

	/**
	 * Set the enables/Disables UPnP IGD.
	 *
	 * @since 2.0
	 * @param upnPIGD the input value
	 */
	public void  setUpnPIGD(Boolean upnPIGD) {
		this.upnPIGD = upnPIGD;
	}

	/**
	 * Set the enables/Disables UPnP IGD.
	 *
	 * @since 2.0
	 * @param upnPIGD the input value
	 * @return this instance
	 */
	public Device withUpnPIGD(Boolean upnPIGD) {
		this.upnPIGD = upnPIGD;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP-DM Basic Management.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPDMBasicMgmt() {
		return upnPDMBasicMgmt;
	}

	/**
	 * Set the enables/Disables UPnP-DM Basic Management.
	 *
	 * @since 2.0
	 * @param upnPDMBasicMgmt the input value
	 */
	public void  setUpnPDMBasicMgmt(Boolean upnPDMBasicMgmt) {
		this.upnPDMBasicMgmt = upnPDMBasicMgmt;
	}

	/**
	 * Set the enables/Disables UPnP-DM Basic Management.
	 *
	 * @since 2.0
	 * @param upnPDMBasicMgmt the input value
	 * @return this instance
	 */
	public Device withUpnPDMBasicMgmt(Boolean upnPDMBasicMgmt) {
		this.upnPDMBasicMgmt = upnPDMBasicMgmt;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP-DM Configuration Management.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPDMConfigurationMgmt() {
		return upnPDMConfigurationMgmt;
	}

	/**
	 * Set the enables/Disables UPnP-DM Configuration Management.
	 *
	 * @since 2.0
	 * @param upnPDMConfigurationMgmt the input value
	 */
	public void  setUpnPDMConfigurationMgmt(Boolean upnPDMConfigurationMgmt) {
		this.upnPDMConfigurationMgmt = upnPDMConfigurationMgmt;
	}

	/**
	 * Set the enables/Disables UPnP-DM Configuration Management.
	 *
	 * @since 2.0
	 * @param upnPDMConfigurationMgmt the input value
	 * @return this instance
	 */
	public Device withUpnPDMConfigurationMgmt(Boolean upnPDMConfigurationMgmt) {
		this.upnPDMConfigurationMgmt = upnPDMConfigurationMgmt;
		return this;
	}

	/**
	 * Get the enables/Disables UPnP-DM Software Management.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpnPDMSoftwareMgmt() {
		return upnPDMSoftwareMgmt;
	}

	/**
	 * Set the enables/Disables UPnP-DM Software Management.
	 *
	 * @since 2.0
	 * @param upnPDMSoftwareMgmt the input value
	 */
	public void  setUpnPDMSoftwareMgmt(Boolean upnPDMSoftwareMgmt) {
		this.upnPDMSoftwareMgmt = upnPDMSoftwareMgmt;
	}

	/**
	 * Set the enables/Disables UPnP-DM Software Management.
	 *
	 * @since 2.0
	 * @param upnPDMSoftwareMgmt the input value
	 * @return this instance
	 */
	public Device withUpnPDMSoftwareMgmt(Boolean upnPDMSoftwareMgmt) {
		this.upnPDMSoftwareMgmt = upnPDMSoftwareMgmt;
		return this;
	}

	/**
	 * Get the this object defines what UPnP capabilities this device has.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the this object defines what UPnP capabilities this device has.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the this object defines what UPnP capabilities this device has.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public Device withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	//</editor-fold>

}