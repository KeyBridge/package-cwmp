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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to Wi-Fi Protected Setup {{bibref|WPSv1.0}} for this access point.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.WiFi.AccessPoint.{i}.WPS.")
@XmlRootElement(name = "Device.WiFi.AccessPoint.WPS")
@XmlType(name = "Device.WiFi.AccessPoint.WPS")
@XmlAccessorType(XmlAccessType.FIELD)
public class WPS {

	/**
	 * Enables or disables WPS functionality for this access point.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{list}} Indicates WPS configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, PIN]

          This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}. The {{enum|PushButton}} and {{enum|PIN}} methods MUST be supported.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConfigMethodsSupported")
	@XmlList
	public Collection<String> configMethodsSupported;
	/**
	 * {{list}} Indicates WPS configuration methods enabled on the device.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConfigMethodsEnabled")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> configMethodsEnabled;

	public WPS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables WPS functionality for this access point.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables WPS functionality for this access point.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables WPS functionality for this access point.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WPS withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{list}} Indicates WPS configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, PIN]

          This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}. The {{enum|PushButton}} and {{enum|PIN}} methods MUST be supported.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getConfigMethodsSupported() {
		if (this.configMethodsSupported == null){ this.configMethodsSupported=new ArrayList<>();}
		return configMethodsSupported;
	}

	/**
	 * Set the {{list}} Indicates WPS configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, PIN]

          This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}. The {{enum|PushButton}} and {{enum|PIN}} methods MUST be supported.
	 *
	 * @since 2.0
	 * @param configMethodsSupported the input value
	 */
	public void  setConfigMethodsSupported(Collection<String> configMethodsSupported) {
		this.configMethodsSupported = configMethodsSupported;
	}

	/**
	 * Set the {{list}} Indicates WPS configuration methods supported by the device.  

Enumerated value must be one of [USBFlashDrive, Ethernet, ExternalNFCToken, IntegratedNFCToken, NFCInterface, PushButton, PIN]

          This parameter corresponds directly to the "Config Methods" attribute of the WPS specification {{bibref|WPSv1.0}}. The {{enum|PushButton}} and {{enum|PIN}} methods MUST be supported.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public WPS withConfigMethodsSupported(String string) {
		getConfigMethodsSupported().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates WPS configuration methods enabled on the device.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getConfigMethodsEnabled() {
		if (this.configMethodsEnabled == null){ this.configMethodsEnabled=new ArrayList<>();}
		return configMethodsEnabled;
	}

	/**
	 * Set the {{list}} Indicates WPS configuration methods enabled on the device.
	 *
	 * @since 2.0
	 * @param configMethodsEnabled the input value
	 */
	public void  setConfigMethodsEnabled(Collection<String> configMethodsEnabled) {
		this.configMethodsEnabled = configMethodsEnabled;
	}

	/**
	 * Set the {{list}} Indicates WPS configuration methods enabled on the device.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public WPS withConfigMethodsEnabled(String string) {
		getConfigMethodsEnabled().add(string);
		return this;
	}

	//</editor-fold>

}