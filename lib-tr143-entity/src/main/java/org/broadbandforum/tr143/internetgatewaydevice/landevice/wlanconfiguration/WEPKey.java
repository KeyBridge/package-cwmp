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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This is a table of WEP keys.  The size of this table is fixed with exactly 4 entries (with instance numbers 1 through 4).  This object MUST be implemented for CPE that contain an 802.11 interface on the LAN side.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.WEPKey.{i}.")
@XmlRootElement(name = "WEPKey")
@XmlType(name = "InternetGatewayDevice.LANDevice.WLANConfiguration.WEPKey")
@XmlAccessorType(XmlAccessType.FIELD)
public class WEPKey {

	/**
	 * A WEP key expressed as a hexadecimal string. 

The WEP encryption level for a given key is inferred from the key length, e.g. 10 characters for 40-bit encryption, or 26 characters for 104-bit encryption (keys do not all have to be of the same length, although they will be if the CPE uses {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} to generate them).

If {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "WEPKey")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	public String wepKey;

	public WEPKey() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get a wEP key expressed as a hexadecimal string. 

The WEP encryption level for a given key is inferred from the key length, e.g. 10 characters for 40-bit encryption, or 26 characters for 104-bit encryption (keys do not all have to be of the same length, although they will be if the CPE uses {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} to generate them).

If {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getWepKey() {
		return wepKey;
	}

	/**
	 * Set a wEP key expressed as a hexadecimal string. 

The WEP encryption level for a given key is inferred from the key length, e.g. 10 characters for 40-bit encryption, or 26 characters for 104-bit encryption (keys do not all have to be of the same length, although they will be if the CPE uses {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} to generate them).

If {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).
	 *
	 * @since 1.0
	 * @param wepKey the input value
	 */
	public void  setWepKey(String wepKey) {
		this.wepKey = wepKey;
	}

	/**
	 * Set a wEP key expressed as a hexadecimal string. 

The WEP encryption level for a given key is inferred from the key length, e.g. 10 characters for 40-bit encryption, or 26 characters for 104-bit encryption (keys do not all have to be of the same length, although they will be if the CPE uses {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} to generate them).

If {{param|InternetGatewayDevice.LANDevice.{i}.WLANConfiguration.{i}.KeyPassphrase}} is written, all four WEP keys are immediately generated.  The ACS SHOULD NOT set the passphrase and also set the WEP keys directly (the result of doing this is undefined).
	 *
	 * @since 1.0
	 * @param wepKey the input value
	 * @return this instance
	 */
	public WEPKey withWepKey(String wepKey) {
		this.wepKey = wepKey;
		return this;
	}

	//</editor-fold>

}