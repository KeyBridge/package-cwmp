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
package org.broadbandforum.tr181.device.wifi.endpoint.profile;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains security related parameters that apply to a WiFi End Point profile {{bibref|802.11-2007}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.EndPoint.{i}.Profile.{i}.Security.")
@XmlRootElement(name = "Device.WiFi.EndPoint.Profile.Security")
@XmlType(name = "Device.WiFi.EndPoint.Profile.Security")
@XmlAccessorType(XmlAccessType.FIELD)
public class Security {

	/**
	 * Indicates which security mode is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModeEnabled")
	@CWMPParameter(access = "readWrite")
	public String modeEnabled;
	/**
	 * A WEP key expressed as a hexadecimal string.

          {{param}} is used only if {{param|ModeEnabled}} is set to {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.

          A 5 byte {{param}} corresponds to security mode {{enum|WEP-64|ModeEnabled}} and a 13 byte {{param}} corresponds to security mode {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WEPKey")
	@CWMPParameter(access = "readWrite")
	public byte[] wepKey;
	/**
	 * A literal PreSharedKey (PSK) expressed as a hexadecimal string.

          {{param}} is only used if {{param|ModeEnabled}} is set to {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}}.

          If {{param|KeyPassphrase}} is written, then {{param}} is immediately generated. The ACS SHOULD NOT set both the {{param|KeyPassphrase}} and the {{param}} directly (the result of doing this is undefined).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PreSharedKey")
	@CWMPParameter(access = "readWrite")
	public byte[] preSharedKey;
	/**
	 * A passphrase from which the {{param|PreSharedKey}} is to be generated, for {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}} security modes.

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 {{bibref|RFC2898}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "KeyPassphrase")
	@CWMPParameter(access = "readWrite")
	@Size(min = 8, max = 63)
	public String keyPassphrase;

	public Security() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates which security mode is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getModeEnabled() {
		return modeEnabled;
	}

	/**
	 * Set the indicates which security mode is enabled.
	 *
	 * @since 2.0
	 * @param modeEnabled the input value
	 */
	public void  setModeEnabled(String modeEnabled) {
		this.modeEnabled = modeEnabled;
	}

	/**
	 * Set the indicates which security mode is enabled.
	 *
	 * @since 2.0
	 * @param modeEnabled the input value
	 * @return this instance
	 */
	public Security withModeEnabled(String modeEnabled) {
		this.modeEnabled = modeEnabled;
		return this;
	}

	/**
	 * Get a wEP key expressed as a hexadecimal string.

          {{param}} is used only if {{param|ModeEnabled}} is set to {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.

          A 5 byte {{param}} corresponds to security mode {{enum|WEP-64|ModeEnabled}} and a 13 byte {{param}} corresponds to security mode {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getWepKey() {
		return wepKey;
	}

	/**
	 * Set a wEP key expressed as a hexadecimal string.

          {{param}} is used only if {{param|ModeEnabled}} is set to {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.

          A 5 byte {{param}} corresponds to security mode {{enum|WEP-64|ModeEnabled}} and a 13 byte {{param}} corresponds to security mode {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 * @param wepKey the input value
	 */
	public void  setWepKey(byte[] wepKey) {
		this.wepKey = wepKey;
	}

	/**
	 * Set a wEP key expressed as a hexadecimal string.

          {{param}} is used only if {{param|ModeEnabled}} is set to {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.

          A 5 byte {{param}} corresponds to security mode {{enum|WEP-64|ModeEnabled}} and a 13 byte {{param}} corresponds to security mode {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 * @param wepKey the input value
	 * @return this instance
	 */
	public Security withWepKey(byte[] wepKey) {
		this.wepKey = wepKey;
		return this;
	}

	/**
	 * Get a literal PreSharedKey (PSK) expressed as a hexadecimal string.

          {{param}} is only used if {{param|ModeEnabled}} is set to {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}}.

          If {{param|KeyPassphrase}} is written, then {{param}} is immediately generated. The ACS SHOULD NOT set both the {{param|KeyPassphrase}} and the {{param}} directly (the result of doing this is undefined).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getPreSharedKey() {
		return preSharedKey;
	}

	/**
	 * Set a literal PreSharedKey (PSK) expressed as a hexadecimal string.

          {{param}} is only used if {{param|ModeEnabled}} is set to {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}}.

          If {{param|KeyPassphrase}} is written, then {{param}} is immediately generated. The ACS SHOULD NOT set both the {{param|KeyPassphrase}} and the {{param}} directly (the result of doing this is undefined).
	 *
	 * @since 2.0
	 * @param preSharedKey the input value
	 */
	public void  setPreSharedKey(byte[] preSharedKey) {
		this.preSharedKey = preSharedKey;
	}

	/**
	 * Set a literal PreSharedKey (PSK) expressed as a hexadecimal string.

          {{param}} is only used if {{param|ModeEnabled}} is set to {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}}.

          If {{param|KeyPassphrase}} is written, then {{param}} is immediately generated. The ACS SHOULD NOT set both the {{param|KeyPassphrase}} and the {{param}} directly (the result of doing this is undefined).
	 *
	 * @since 2.0
	 * @param preSharedKey the input value
	 * @return this instance
	 */
	public Security withPreSharedKey(byte[] preSharedKey) {
		this.preSharedKey = preSharedKey;
		return this;
	}

	/**
	 * Get a passphrase from which the {{param|PreSharedKey}} is to be generated, for {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}} security modes.

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 {{bibref|RFC2898}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getKeyPassphrase() {
		return keyPassphrase;
	}

	/**
	 * Set a passphrase from which the {{param|PreSharedKey}} is to be generated, for {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}} security modes.

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 {{bibref|RFC2898}}.
	 *
	 * @since 2.0
	 * @param keyPassphrase the input value
	 */
	public void  setKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
	}

	/**
	 * Set a passphrase from which the {{param|PreSharedKey}} is to be generated, for {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}} security modes.

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 {{bibref|RFC2898}}.
	 *
	 * @since 2.0
	 * @param keyPassphrase the input value
	 * @return this instance
	 */
	public Security withKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
		return this;
	}

	//</editor-fold>

}