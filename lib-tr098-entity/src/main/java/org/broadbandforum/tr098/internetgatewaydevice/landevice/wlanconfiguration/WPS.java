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
package org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.landevice.wlanconfiguration.wps.Registrar;

	/**
	 * This object contains parameters related to WPS (Wi-Fi Protected Setup) {{bibref|WPSv1.0}} that apply to a CPE acting as an Access Point.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.WPS.")
public class WPS {

	/**
	 * Enables or disables WPS functionality for this interface.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * User-friendly description of the device.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DeviceName")
	@Size(max = 32)
	public String deviceName;
	/**
	 * Represents the DevicePassword used (commonly known as PIN).

This parameter corresponds directly to the "Device Password" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "DevicePassword")
	@CWMPParameter(access = "readWrite")
	public Long devicePassword;
	/**
	 * UUID of the device. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. "f81d4fae-7dec-11d0-a765-00a0c91e6bf6".

This parameter corresponds directly to the "UUID-E" (enrollee) and "UUID-R" (registrar) attributes of the WPS specification {{bibref|WPSv1.0}}.  Note that if the Access Point can act both as an enrollee and as a registrar then UUID-E and UUID-R will be the same as each other.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UUID")
	@Size(max = 36)
	@Pattern(regexp = "[0-9A-Fa-f]{8}-([0-9A-Fa-f]{4}-){3}[0-9A-Fa-f]{12}")
	public String uuiD;
	/**
	 * The Wi-Fi Protected Setup version supported by the device.

This parameter corresponds directly to the "Version" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Version")
	public Long version;
	/**
	 * WPS configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, Label, Display, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, Keypad]

This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ConfigMethodsSupported")
	@XmlList
	public Collection<String> configMethodsSupported;
	/**
	 * WPS configuration methods enabled on the device.  This parameter corresponds directly to the "Permitted Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ConfigMethodsEnabled")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> configMethodsEnabled;
	/**
	 * Indicates if the AP Setup mode is enabled for configuration of the AP through an external registrar. The AP Setup mode can be disabled by the user, by the remote management or in case of a brute force attack against the AP's PIN (Wrong PIN provided to AP multiple times).  {{enum}}

This parameter corresponds directly to the "AP Setup Locked" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{enum|Unlocked}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SetupLockedState")
	public String setupLockedState;
	/**
	 * When set to {{true}}, the Access Point will refuse to accept new external registrars; already established registrars will continue to be able to add new enrollees (the {{param|SetupLockedState}} becomes {{enum|LockedByRemoteManagement|SetupLockedState}}).

When set to {{false}}, the Access Point is enabled for configuration through an external registrar (the {{param|SetupLockedState}} becomes {{enum|Unlocked|SetupLockedState}}).

The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SetupLock")
	@CWMPParameter(access = "readWrite")
	public Boolean setupLock;
	/**
	 * Description of the WPS status on the Wireless Access Point side.  {{enum}}

This parameter corresponds directly to the "Wi-Fi Protected Setup State" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ConfigurationState")
	public String configurationState;
	/**
	 * Shows the result of the last external registrar attempt to configure the Access Point.  {{enum}}

If no external registrar has yet attempted to configure the Access Point, this parameter MUST have the value {{enum|NoError}}.  The value of this parameter MUST persist across CPE reboots.

This parameter corresponds directly to the "Configuration Error" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LastConfigurationError")
	public String lastConfigurationError;
	/**
	 * {{true}} if the Access Point has ever previously created an association with a Registrar.

This parameter corresponds directly to the "Registrar Established" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "RegistrarEstablished")
	public Boolean registrarEstablished;
	/**
	 * This table lists the Registrars associated with the Access Point.

This table MUST persist across CPE reboots.  The registrar UUID is the unique key.

This object corresponds directly to the "Registrar List" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 */
	@XmlElementWrapper(name = "registrars")
	@XmlElement(name = "Registrar")
	public Collection<Registrar> registrars;

	public WPS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables WPS functionality for this interface.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables WPS functionality for this interface.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables WPS functionality for this interface.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public WPS withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the user-friendly description of the device.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * Set the user-friendly description of the device.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param deviceName the input value
	 */
	public void  setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * Set the user-friendly description of the device.

This parameter corresponds directly to the "Device Name" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param deviceName the input value
	 * @return this instance
	 */
	public WPS withDeviceName(String deviceName) {
		this.deviceName = deviceName;
		return this;
	}

	/**
	 * Get the represents the DevicePassword used (commonly known as PIN).

This parameter corresponds directly to the "Device Password" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getDevicePassword() {
		return devicePassword;
	}

	/**
	 * Set the represents the DevicePassword used (commonly known as PIN).

This parameter corresponds directly to the "Device Password" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param devicePassword the input value
	 */
	public void  setDevicePassword(Long devicePassword) {
		this.devicePassword = devicePassword;
	}

	/**
	 * Set the represents the DevicePassword used (commonly known as PIN).

This parameter corresponds directly to the "Device Password" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param devicePassword the input value
	 * @return this instance
	 */
	public WPS withDevicePassword(Long devicePassword) {
		this.devicePassword = devicePassword;
		return this;
	}

	/**
	 * Get the uuiD of the device. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. "f81d4fae-7dec-11d0-a765-00a0c91e6bf6".

This parameter corresponds directly to the "UUID-E" (enrollee) and "UUID-R" (registrar) attributes of the WPS specification {{bibref|WPSv1.0}}.  Note that if the Access Point can act both as an enrollee and as a registrar then UUID-E and UUID-R will be the same as each other.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getUuiD() {
		return uuiD;
	}

	/**
	 * Set the uuiD of the device. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. "f81d4fae-7dec-11d0-a765-00a0c91e6bf6".

This parameter corresponds directly to the "UUID-E" (enrollee) and "UUID-R" (registrar) attributes of the WPS specification {{bibref|WPSv1.0}}.  Note that if the Access Point can act both as an enrollee and as a registrar then UUID-E and UUID-R will be the same as each other.
	 *
	 * @since 1.4
	 * @param uuiD the input value
	 */
	public void  setUuiD(String uuiD) {
		this.uuiD = uuiD;
	}

	/**
	 * Set the uuiD of the device. This is represented as specified in RFC 4122 {{bibref|RFC4122}} but omitting the leading "urn:uuid:", e.g. "f81d4fae-7dec-11d0-a765-00a0c91e6bf6".

This parameter corresponds directly to the "UUID-E" (enrollee) and "UUID-R" (registrar) attributes of the WPS specification {{bibref|WPSv1.0}}.  Note that if the Access Point can act both as an enrollee and as a registrar then UUID-E and UUID-R will be the same as each other.
	 *
	 * @since 1.4
	 * @param uuiD the input value
	 * @return this instance
	 */
	public WPS withUuiD(String uuiD) {
		this.uuiD = uuiD;
		return this;
	}

	/**
	 * Get the Wi-Fi Protected Setup version supported by the device.

This parameter corresponds directly to the "Version" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * Set the Wi-Fi Protected Setup version supported by the device.

This parameter corresponds directly to the "Version" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param version the input value
	 */
	public void  setVersion(Long version) {
		this.version = version;
	}

	/**
	 * Set the Wi-Fi Protected Setup version supported by the device.

This parameter corresponds directly to the "Version" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param version the input value
	 * @return this instance
	 */
	public WPS withVersion(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Get the wps configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, Label, Display, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, Keypad]

This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getConfigMethodsSupported() {
		if (this.configMethodsSupported == null){ this.configMethodsSupported=new ArrayList<>();}
		return configMethodsSupported;
	}

	/**
	 * Set the wps configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, Label, Display, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, Keypad]

This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param configMethodsSupported the input value
	 */
	public void  setConfigMethodsSupported(Collection<String> configMethodsSupported) {
		this.configMethodsSupported = configMethodsSupported;
	}

	/**
	 * Set the wps configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, Label, Display, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, Keypad]

This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public WPS withConfigMethodsSupported(String string) {
		getConfigMethodsSupported().add(string);
		return this;
	}

	/**
	 * Get the wps configuration methods enabled on the device.  This parameter corresponds directly to the "Permitted Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getConfigMethodsEnabled() {
		if (this.configMethodsEnabled == null){ this.configMethodsEnabled=new ArrayList<>();}
		return configMethodsEnabled;
	}

	/**
	 * Set the wps configuration methods enabled on the device.  This parameter corresponds directly to the "Permitted Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param configMethodsEnabled the input value
	 */
	public void  setConfigMethodsEnabled(Collection<String> configMethodsEnabled) {
		this.configMethodsEnabled = configMethodsEnabled;
	}

	/**
	 * Set the wps configuration methods enabled on the device.  This parameter corresponds directly to the "Permitted Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public WPS withConfigMethodsEnabled(String string) {
		getConfigMethodsEnabled().add(string);
		return this;
	}

	/**
	 * Get the indicates if the AP Setup mode is enabled for configuration of the AP through an external registrar. The AP Setup mode can be disabled by the user, by the remote management or in case of a brute force attack against the AP's PIN (Wrong PIN provided to AP multiple times).  {{enum}}

This parameter corresponds directly to the "AP Setup Locked" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{enum|Unlocked}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getSetupLockedState() {
		return setupLockedState;
	}

	/**
	 * Set the indicates if the AP Setup mode is enabled for configuration of the AP through an external registrar. The AP Setup mode can be disabled by the user, by the remote management or in case of a brute force attack against the AP's PIN (Wrong PIN provided to AP multiple times).  {{enum}}

This parameter corresponds directly to the "AP Setup Locked" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{enum|Unlocked}}.
	 *
	 * @since 1.4
	 * @param setupLockedState the input value
	 */
	public void  setSetupLockedState(String setupLockedState) {
		this.setupLockedState = setupLockedState;
	}

	/**
	 * Set the indicates if the AP Setup mode is enabled for configuration of the AP through an external registrar. The AP Setup mode can be disabled by the user, by the remote management or in case of a brute force attack against the AP's PIN (Wrong PIN provided to AP multiple times).  {{enum}}

This parameter corresponds directly to the "AP Setup Locked" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{enum|Unlocked}}.
	 *
	 * @since 1.4
	 * @param setupLockedState the input value
	 * @return this instance
	 */
	public WPS withSetupLockedState(String setupLockedState) {
		this.setupLockedState = setupLockedState;
		return this;
	}

	/**
	 * Get the when set to {{true}}, the Access Point will refuse to accept new external registrars; already established registrars will continue to be able to add new enrollees (the {{param|SetupLockedState}} becomes {{enum|LockedByRemoteManagement|SetupLockedState}}).

When set to {{false}}, the Access Point is enabled for configuration through an external registrar (the {{param|SetupLockedState}} becomes {{enum|Unlocked|SetupLockedState}}).

The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isSetupLock() {
		return setupLock;
	}

	/**
	 * Set the when set to {{true}}, the Access Point will refuse to accept new external registrars; already established registrars will continue to be able to add new enrollees (the {{param|SetupLockedState}} becomes {{enum|LockedByRemoteManagement|SetupLockedState}}).

When set to {{false}}, the Access Point is enabled for configuration through an external registrar (the {{param|SetupLockedState}} becomes {{enum|Unlocked|SetupLockedState}}).

The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 * @param setupLock the input value
	 */
	public void  setSetupLock(Boolean setupLock) {
		this.setupLock = setupLock;
	}

	/**
	 * Set the when set to {{true}}, the Access Point will refuse to accept new external registrars; already established registrars will continue to be able to add new enrollees (the {{param|SetupLockedState}} becomes {{enum|LockedByRemoteManagement|SetupLockedState}}).

When set to {{false}}, the Access Point is enabled for configuration through an external registrar (the {{param|SetupLockedState}} becomes {{enum|Unlocked|SetupLockedState}}).

The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 * @param setupLock the input value
	 * @return this instance
	 */
	public WPS withSetupLock(Boolean setupLock) {
		this.setupLock = setupLock;
		return this;
	}

	/**
	 * Get the description of the WPS status on the Wireless Access Point side.  {{enum}}

This parameter corresponds directly to the "Wi-Fi Protected Setup State" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getConfigurationState() {
		return configurationState;
	}

	/**
	 * Set the description of the WPS status on the Wireless Access Point side.  {{enum}}

This parameter corresponds directly to the "Wi-Fi Protected Setup State" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param configurationState the input value
	 */
	public void  setConfigurationState(String configurationState) {
		this.configurationState = configurationState;
	}

	/**
	 * Set the description of the WPS status on the Wireless Access Point side.  {{enum}}

This parameter corresponds directly to the "Wi-Fi Protected Setup State" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param configurationState the input value
	 * @return this instance
	 */
	public WPS withConfigurationState(String configurationState) {
		this.configurationState = configurationState;
		return this;
	}

	/**
	 * Get the shows the result of the last external registrar attempt to configure the Access Point.  {{enum}}

If no external registrar has yet attempted to configure the Access Point, this parameter MUST have the value {{enum|NoError}}.  The value of this parameter MUST persist across CPE reboots.

This parameter corresponds directly to the "Configuration Error" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getLastConfigurationError() {
		return lastConfigurationError;
	}

	/**
	 * Set the shows the result of the last external registrar attempt to configure the Access Point.  {{enum}}

If no external registrar has yet attempted to configure the Access Point, this parameter MUST have the value {{enum|NoError}}.  The value of this parameter MUST persist across CPE reboots.

This parameter corresponds directly to the "Configuration Error" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param lastConfigurationError the input value
	 */
	public void  setLastConfigurationError(String lastConfigurationError) {
		this.lastConfigurationError = lastConfigurationError;
	}

	/**
	 * Set the shows the result of the last external registrar attempt to configure the Access Point.  {{enum}}

If no external registrar has yet attempted to configure the Access Point, this parameter MUST have the value {{enum|NoError}}.  The value of this parameter MUST persist across CPE reboots.

This parameter corresponds directly to the "Configuration Error" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @since 1.4
	 * @param lastConfigurationError the input value
	 * @return this instance
	 */
	public WPS withLastConfigurationError(String lastConfigurationError) {
		this.lastConfigurationError = lastConfigurationError;
		return this;
	}

	/**
	 * Get the {{true}} if the Access Point has ever previously created an association with a Registrar.

This parameter corresponds directly to the "Registrar Established" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isRegistrarEstablished() {
		return registrarEstablished;
	}

	/**
	 * Set the {{true}} if the Access Point has ever previously created an association with a Registrar.

This parameter corresponds directly to the "Registrar Established" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 * @param registrarEstablished the input value
	 */
	public void  setRegistrarEstablished(Boolean registrarEstablished) {
		this.registrarEstablished = registrarEstablished;
	}

	/**
	 * Set the {{true}} if the Access Point has ever previously created an association with a Registrar.

This parameter corresponds directly to the "Registrar Established" attribute of the WPS specification {{bibref|WPSv1.0}}.  The factory default setting is {{false}}.
	 *
	 * @since 1.4
	 * @param registrarEstablished the input value
	 * @return this instance
	 */
	public WPS withRegistrarEstablished(Boolean registrarEstablished) {
		this.registrarEstablished = registrarEstablished;
		return this;
	}

	/**
	 * Get the this table lists the Registrars associated with the Access Point.

This table MUST persist across CPE reboots.  The registrar UUID is the unique key.

This object corresponds directly to the "Registrar List" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @return the value
	 */
	public Collection<Registrar> getRegistrars() {
		if (this.registrars == null){ this.registrars=new ArrayList<>();}
		return registrars;
	}

	/**
	 * Set the this table lists the Registrars associated with the Access Point.

This table MUST persist across CPE reboots.  The registrar UUID is the unique key.

This object corresponds directly to the "Registrar List" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @param registrars the input value
	 */
	public void  setRegistrars(Collection<Registrar> registrars) {
		this.registrars = registrars;
	}

	/**
	 * Set the this table lists the Registrars associated with the Access Point.

This table MUST persist across CPE reboots.  The registrar UUID is the unique key.

This object corresponds directly to the "Registrar List" attribute of the WPS specification {{bibref|WPSv1.0}}.
	 *
	 * @param registrar the input value
	 * @return this instance
	 */
	public WPS withRegistrar(Registrar registrar) {
		getRegistrars().add(registrar);
		return this;
	}

	//</editor-fold>

}