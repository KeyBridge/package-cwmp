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
package org.broadbandforum.tr181.device.ieee8021x.supplicant;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * 802.1x Authentication Supplicant provisioning information used for MD5 shared secret exchange. This object will not exist if EAP-MD5 is not a supported authentication type.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IEEE8021x.Supplicant.{i}.EAPMD5.")
@XmlRootElement(name = "EAPMD5")
@XmlType(name = "Device.IEEE8021x.Supplicant.EAPMD5")
@XmlAccessorType(XmlAccessType.FIELD)
public class EAPMD5 {

	/**
	 * This parameter enables or disables the supplicant's support for EAP-MD5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The shared secret to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SharedSecret")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String sharedSecret;

	public EAPMD5() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter enables or disables the supplicant's support for EAP-MD5.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the this parameter enables or disables the supplicant's support for EAP-MD5.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the this parameter enables or disables the supplicant's support for EAP-MD5.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public EAPMD5 withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the shared secret to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSharedSecret() {
		return sharedSecret;
	}

	/**
	 * Set the shared secret to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 * @param sharedSecret the input value
	 */
	public void  setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}

	/**
	 * Set the shared secret to be exchanged between the supplicant and authenticator.
	 *
	 * @since 2.0
	 * @param sharedSecret the input value
	 * @return this instance
	 */
	public EAPMD5 withSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
		return this;
	}

	//</editor-fold>

}