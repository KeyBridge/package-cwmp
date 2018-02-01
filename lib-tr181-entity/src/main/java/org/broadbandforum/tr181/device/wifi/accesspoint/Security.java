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
package org.broadbandforum.tr181.device.wifi.accesspoint;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.IPAddress;

	/**
	 * This object contains security related parameters that apply to a CPE acting as an Access Point {{bibref|802.11-2007}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.WiFi.AccessPoint.{i}.Security.")
public class Security {

	/**
	 * When set to {{true}}, this {{object|#}} instance's WiFi security settings are reset to their factory default values.  The affected settings include {{param|ModeEnabled}}, {{param|WEPKey}}, {{param|PreSharedKey}} and {{param|KeyPassphrase}}.

          If the parameter cannot be set, the CPE MUST reject the request as an invalid parameter value.  Possible failure reasons include a lack of default values or if {{param|ModeEnabled}} is an Enterprise type, i.e. {{enum|WPA-Enterprise|ModesSupported}}, {{enum|WPA2-Enterprise|ModesSupported}} or {{enum|WPA-WPA2-Enterprise|ModesSupported}}.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModesSupported")
	@XmlList
	public Collection<String> modesSupported;
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

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 ({{bibref|RFC2898}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "KeyPassphrase")
	@CWMPParameter(access = "readWrite")
	@Size(min = 8, max = 63)
	public String keyPassphrase;
	/**
	 * The interval (expressed in seconds) in which the keys are re-generated. 

          This is applicable to WPA, WPA2 and Mixed (WPA-WPA2) modes in Personal or Enterprise mode (i.e. when {{param|ModeEnabled}} is set to a value other than {{enum|None|ModeEnabled}} or {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RekeyingInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long rekeyingInterval = 3600L;
	/**
	 * The IP Address of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RadiusServerIPAddr")
	@CWMPParameter(access = "readWrite")
	public IPAddress radiusServerIPAddr;
	/**
	 * The IP Address of a secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SecondaryRadiusServerIPAddr ")
	@CWMPParameter(access = "readWrite")
	public IPAddress secondaryRadiusServerIPAddr ;
	/**
	 * The port number of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RadiusServerPort")
	@CWMPParameter(access = "readWrite")
	public Long radiusServerPort = 1812L;
	/**
	 * The port number of the secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SecondaryRadiusServerPort")
	@CWMPParameter(access = "readWrite")
	public Long secondaryRadiusServerPort = 1812L;
	/**
	 * The secret used for handshaking with the RADIUS server {{bibref|RFC2865}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RadiusSecret")
	@CWMPParameter(access = "readWrite")
	public String radiusSecret;
	/**
	 * The secret used for handshaking with the secondary RADIUS server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SecondaryRadiusSecret")
	@CWMPParameter(access = "readWrite")
	public String secondaryRadiusSecret;

	public Security() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the when set to {{true}}, this {{object|#}} instance's WiFi security settings are reset to their factory default values.  The affected settings include {{param|ModeEnabled}}, {{param|WEPKey}}, {{param|PreSharedKey}} and {{param|KeyPassphrase}}.

          If the parameter cannot be set, the CPE MUST reject the request as an invalid parameter value.  Possible failure reasons include a lack of default values or if {{param|ModeEnabled}} is an Enterprise type, i.e. {{enum|WPA-Enterprise|ModesSupported}}, {{enum|WPA2-Enterprise|ModesSupported}} or {{enum|WPA-WPA2-Enterprise|ModesSupported}}.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, this {{object|#}} instance's WiFi security settings are reset to their factory default values.  The affected settings include {{param|ModeEnabled}}, {{param|WEPKey}}, {{param|PreSharedKey}} and {{param|KeyPassphrase}}.

          If the parameter cannot be set, the CPE MUST reject the request as an invalid parameter value.  Possible failure reasons include a lack of default values or if {{param|ModeEnabled}} is an Enterprise type, i.e. {{enum|WPA-Enterprise|ModesSupported}}, {{enum|WPA2-Enterprise|ModesSupported}} or {{enum|WPA-WPA2-Enterprise|ModesSupported}}.
	 *
	 * @since 2.4
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, this {{object|#}} instance's WiFi security settings are reset to their factory default values.  The affected settings include {{param|ModeEnabled}}, {{param|WEPKey}}, {{param|PreSharedKey}} and {{param|KeyPassphrase}}.

          If the parameter cannot be set, the CPE MUST reject the request as an invalid parameter value.  Possible failure reasons include a lack of default values or if {{param|ModeEnabled}} is an Enterprise type, i.e. {{enum|WPA-Enterprise|ModesSupported}}, {{enum|WPA2-Enterprise|ModesSupported}} or {{enum|WPA-WPA2-Enterprise|ModesSupported}}.
	 *
	 * @since 2.4
	 * @param reset the input value
	 * @return this instance
	 */
	public Security withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getModesSupported() {
		if (this.modesSupported == null){ this.modesSupported=new ArrayList<>();}
		return modesSupported;
	}

	/**
	 * Set the {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 * @param modesSupported the input value
	 */
	public void  setModesSupported(Collection<String> modesSupported) {
		this.modesSupported = modesSupported;
	}

	/**
	 * Set the {{list}} Indicates which security modes this {{object|#}} instance is capable of supporting.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Security withModesSupported(String string) {
		getModesSupported().add(string);
		return this;
	}

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

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 ({{bibref|RFC2898}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getKeyPassphrase() {
		return keyPassphrase;
	}

	/**
	 * Set a passphrase from which the {{param|PreSharedKey}} is to be generated, for {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}} security modes.

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 ({{bibref|RFC2898}}).
	 *
	 * @since 2.0
	 * @param keyPassphrase the input value
	 */
	public void  setKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
	}

	/**
	 * Set a passphrase from which the {{param|PreSharedKey}} is to be generated, for {{enum|WPA-Personal|ModeEnabled}} or {{enum|WPA2-Personal|ModeEnabled}} or {{enum|WPA-WPA2-Personal|ModeEnabled}} security modes.

          If {{param}} is written, then {{param|PreSharedKey}} is immediately generated. The ACS SHOULD NOT set both the {{param}} and the {{param|PreSharedKey}} directly (the result of doing this is undefined). The key is generated as specified by WPA, which uses PBKDF2 from PKCS #5: Password-based Cryptography Specification Version 2.0 ({{bibref|RFC2898}}).
	 *
	 * @since 2.0
	 * @param keyPassphrase the input value
	 * @return this instance
	 */
	public Security withKeyPassphrase(String keyPassphrase) {
		this.keyPassphrase = keyPassphrase;
		return this;
	}

	/**
	 * Get the interval (expressed in seconds) in which the keys are re-generated. 

          This is applicable to WPA, WPA2 and Mixed (WPA-WPA2) modes in Personal or Enterprise mode (i.e. when {{param|ModeEnabled}} is set to a value other than {{enum|None|ModeEnabled}} or {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRekeyingInterval() {
		return rekeyingInterval;
	}

	/**
	 * Set the interval (expressed in seconds) in which the keys are re-generated. 

          This is applicable to WPA, WPA2 and Mixed (WPA-WPA2) modes in Personal or Enterprise mode (i.e. when {{param|ModeEnabled}} is set to a value other than {{enum|None|ModeEnabled}} or {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 * @param rekeyingInterval the input value
	 */
	public void  setRekeyingInterval(Long rekeyingInterval) {
		this.rekeyingInterval = rekeyingInterval;
	}

	/**
	 * Set the interval (expressed in seconds) in which the keys are re-generated. 

          This is applicable to WPA, WPA2 and Mixed (WPA-WPA2) modes in Personal or Enterprise mode (i.e. when {{param|ModeEnabled}} is set to a value other than {{enum|None|ModeEnabled}} or {{enum|WEP-64|ModeEnabled}} or {{enum|WEP-128|ModeEnabled}}.
	 *
	 * @since 2.0
	 * @param rekeyingInterval the input value
	 * @return this instance
	 */
	public Security withRekeyingInterval(Long rekeyingInterval) {
		this.rekeyingInterval = rekeyingInterval;
		return this;
	}

	/**
	 * Get the IP Address of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getRadiusServerIPAddr() {
		return radiusServerIPAddr;
	}

	/**
	 * Set the IP Address of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 * @param radiusServerIPAddr the input value
	 */
	public void  setRadiusServerIPAddr(IPAddress radiusServerIPAddr) {
		this.radiusServerIPAddr = radiusServerIPAddr;
	}

	/**
	 * Set the IP Address of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 * @param radiusServerIPAddr the input value
	 * @return this instance
	 */
	public Security withRadiusServerIPAddr(IPAddress radiusServerIPAddr) {
		this.radiusServerIPAddr = radiusServerIPAddr;
		return this;
	}

	/**
	 * Get the IP Address of a secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getSecondaryRadiusServerIPAddr () {
		return secondaryRadiusServerIPAddr ;
	}

	/**
	 * Set the IP Address of a secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 * @param secondaryRadiusServerIPAddr  the input value
	 */
	public void  setSecondaryRadiusServerIPAddr (IPAddress secondaryRadiusServerIPAddr ) {
		this.secondaryRadiusServerIPAddr  = secondaryRadiusServerIPAddr ;
	}

	/**
	 * Set the IP Address of a secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 * @param secondaryRadiusServerIPAddr  the input value
	 * @return this instance
	 */
	public Security withSecondaryRadiusServerIPAddr (IPAddress secondaryRadiusServerIPAddr ) {
		this.secondaryRadiusServerIPAddr  = secondaryRadiusServerIPAddr ;
		return this;
	}

	/**
	 * Get the port number of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRadiusServerPort() {
		return radiusServerPort;
	}

	/**
	 * Set the port number of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 * @param radiusServerPort the input value
	 */
	public void  setRadiusServerPort(Long radiusServerPort) {
		this.radiusServerPort = radiusServerPort;
	}

	/**
	 * Set the port number of the RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).
	 *
	 * @since 2.0
	 * @param radiusServerPort the input value
	 * @return this instance
	 */
	public Security withRadiusServerPort(Long radiusServerPort) {
		this.radiusServerPort = radiusServerPort;
		return this;
	}

	/**
	 * Get the port number of the secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getSecondaryRadiusServerPort() {
		return secondaryRadiusServerPort;
	}

	/**
	 * Set the port number of the secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondaryRadiusServerPort the input value
	 */
	public void  setSecondaryRadiusServerPort(Long secondaryRadiusServerPort) {
		this.secondaryRadiusServerPort = secondaryRadiusServerPort;
	}

	/**
	 * Set the port number of the secondary RADIUS server used for WLAN security. {{param}} is only applicable when {{param|ModeEnabled}} is an Enterprise type (i.e. {{enum|WPA-Enterprise|ModeEnabled}}, {{enum|WPA2-Enterprise|ModeEnabled}} or {{enum|WPA-WPA2-Enterprise|ModeEnabled}}).

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondaryRadiusServerPort the input value
	 * @return this instance
	 */
	public Security withSecondaryRadiusServerPort(Long secondaryRadiusServerPort) {
		this.secondaryRadiusServerPort = secondaryRadiusServerPort;
		return this;
	}

	/**
	 * Get the secret used for handshaking with the RADIUS server {{bibref|RFC2865}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRadiusSecret() {
		return radiusSecret;
	}

	/**
	 * Set the secret used for handshaking with the RADIUS server {{bibref|RFC2865}}.
	 *
	 * @since 2.0
	 * @param radiusSecret the input value
	 */
	public void  setRadiusSecret(String radiusSecret) {
		this.radiusSecret = radiusSecret;
	}

	/**
	 * Set the secret used for handshaking with the RADIUS server {{bibref|RFC2865}}.
	 *
	 * @since 2.0
	 * @param radiusSecret the input value
	 * @return this instance
	 */
	public Security withRadiusSecret(String radiusSecret) {
		this.radiusSecret = radiusSecret;
		return this;
	}

	/**
	 * Get the secret used for handshaking with the secondary RADIUS server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getSecondaryRadiusSecret() {
		return secondaryRadiusSecret;
	}

	/**
	 * Set the secret used for handshaking with the secondary RADIUS server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondaryRadiusSecret the input value
	 */
	public void  setSecondaryRadiusSecret(String secondaryRadiusSecret) {
		this.secondaryRadiusSecret = secondaryRadiusSecret;
	}

	/**
	 * Set the secret used for handshaking with the secondary RADIUS server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondaryRadiusSecret the input value
	 * @return this instance
	 */
	public Security withSecondaryRadiusSecret(String secondaryRadiusSecret) {
		this.secondaryRadiusSecret = secondaryRadiusSecret;
		return this;
	}

	//</editor-fold>

}