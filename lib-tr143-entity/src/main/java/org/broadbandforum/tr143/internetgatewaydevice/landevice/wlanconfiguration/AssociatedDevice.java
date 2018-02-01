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
package org.broadbandforum.tr143.internetgatewaydevice.landevice.wlanconfiguration;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr143.datatypes.MACAddress;

	/**
	 * A table of the devices currently associated with the access point.  The size of this table is given by {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.TotalAssociations}}.  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.AssociatedDevice.{i}.")
public class AssociatedDevice {

	/**
	 * The MAC address of an associated device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AssociatedDeviceMACAddress")
	@CWMPParameter(activeNotify = "canDeny")
	public MACAddress associatedDeviceMACAddress;
	/**
	 * The IP address or DNS name of an associated device.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AssociatedDeviceIPAddress")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 64)
	public String associatedDeviceIPAddress;
	/**
	 * Whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "AssociatedDeviceAuthenticationState")
	@CWMPParameter(activeNotify = "canDeny")
	public Boolean associatedDeviceAuthenticationState;
	/**
	 * The unicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastRequestedUnicastCipher")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String lastRequestedUnicastCipher;
	/**
	 * The multicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastRequestedMulticastCipher")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String lastRequestedMulticastCipher;
	/**
	 * The pairwise master key (PMK) that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastPMKId")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String lastPMKId;

	public AssociatedDevice() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the MAC address of an associated device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public MACAddress getAssociatedDeviceMACAddress() {
		return associatedDeviceMACAddress;
	}

	/**
	 * Set the MAC address of an associated device.
	 *
	 * @since 1.0
	 * @param associatedDeviceMACAddress the input value
	 */
	public void  setAssociatedDeviceMACAddress(MACAddress associatedDeviceMACAddress) {
		this.associatedDeviceMACAddress = associatedDeviceMACAddress;
	}

	/**
	 * Set the MAC address of an associated device.
	 *
	 * @since 1.0
	 * @param associatedDeviceMACAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withAssociatedDeviceMACAddress(MACAddress associatedDeviceMACAddress) {
		this.associatedDeviceMACAddress = associatedDeviceMACAddress;
		return this;
	}

	/**
	 * Get the IP address or DNS name of an associated device.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAssociatedDeviceIPAddress() {
		return associatedDeviceIPAddress;
	}

	/**
	 * Set the IP address or DNS name of an associated device.
	 *
	 * @since 1.0
	 * @param associatedDeviceIPAddress the input value
	 */
	public void  setAssociatedDeviceIPAddress(String associatedDeviceIPAddress) {
		this.associatedDeviceIPAddress = associatedDeviceIPAddress;
	}

	/**
	 * Set the IP address or DNS name of an associated device.
	 *
	 * @since 1.0
	 * @param associatedDeviceIPAddress the input value
	 * @return this instance
	 */
	public AssociatedDevice withAssociatedDeviceIPAddress(String associatedDeviceIPAddress) {
		this.associatedDeviceIPAddress = associatedDeviceIPAddress;
		return this;
	}

	/**
	 * Get the whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isAssociatedDeviceAuthenticationState() {
		return associatedDeviceAuthenticationState;
	}

	/**
	 * Set the whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 1.0
	 * @param associatedDeviceAuthenticationState the input value
	 */
	public void  setAssociatedDeviceAuthenticationState(Boolean associatedDeviceAuthenticationState) {
		this.associatedDeviceAuthenticationState = associatedDeviceAuthenticationState;
	}

	/**
	 * Set the whether an associated device has authenticated ({{true}}) or not ({{false}}).
	 *
	 * @since 1.0
	 * @param associatedDeviceAuthenticationState the input value
	 * @return this instance
	 */
	public AssociatedDevice withAssociatedDeviceAuthenticationState(Boolean associatedDeviceAuthenticationState) {
		this.associatedDeviceAuthenticationState = associatedDeviceAuthenticationState;
		return this;
	}

	/**
	 * Get the unicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLastRequestedUnicastCipher() {
		return lastRequestedUnicastCipher;
	}

	/**
	 * Set the unicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @param lastRequestedUnicastCipher the input value
	 */
	public void  setLastRequestedUnicastCipher(String lastRequestedUnicastCipher) {
		this.lastRequestedUnicastCipher = lastRequestedUnicastCipher;
	}

	/**
	 * Set the unicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @param lastRequestedUnicastCipher the input value
	 * @return this instance
	 */
	public AssociatedDevice withLastRequestedUnicastCipher(String lastRequestedUnicastCipher) {
		this.lastRequestedUnicastCipher = lastRequestedUnicastCipher;
		return this;
	}

	/**
	 * Get the multicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLastRequestedMulticastCipher() {
		return lastRequestedMulticastCipher;
	}

	/**
	 * Set the multicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @param lastRequestedMulticastCipher the input value
	 */
	public void  setLastRequestedMulticastCipher(String lastRequestedMulticastCipher) {
		this.lastRequestedMulticastCipher = lastRequestedMulticastCipher;
	}

	/**
	 * Set the multicast cipher that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @param lastRequestedMulticastCipher the input value
	 * @return this instance
	 */
	public AssociatedDevice withLastRequestedMulticastCipher(String lastRequestedMulticastCipher) {
		this.lastRequestedMulticastCipher = lastRequestedMulticastCipher;
		return this;
	}

	/**
	 * Get the pairwise master key (PMK) that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLastPMKId() {
		return lastPMKId;
	}

	/**
	 * Set the pairwise master key (PMK) that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @param lastPMKId the input value
	 */
	public void  setLastPMKId(String lastPMKId) {
		this.lastPMKId = lastPMKId;
	}

	/**
	 * Set the pairwise master key (PMK) that was most recently used for a station with a specified MAC address (802.11i only).
	 *
	 * @since 1.0
	 * @param lastPMKId the input value
	 * @return this instance
	 */
	public AssociatedDevice withLastPMKId(String lastPMKId) {
		this.lastPMKId = lastPMKId;
		return this;
	}

	//</editor-fold>

}