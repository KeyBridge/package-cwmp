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

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * 802.1x Authentication Supplicant provisioning information used for TLS certificate authentication. This object will not exist if the EAP-TLS is not a supported authentication type.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IEEE8021x.Supplicant.{i}.EAPTLS.")
public class EAPTLS {

	/**
	 * This parameter enables or disables the supplicant's support for EAP-TLS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The parameter controls if the supplicant will authenticate the authenticator.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MutualAuthenticationEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean mutualAuthenticationEnable;

	public EAPTLS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter enables or disables the supplicant's support for EAP-TLS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the this parameter enables or disables the supplicant's support for EAP-TLS.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the this parameter enables or disables the supplicant's support for EAP-TLS.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public EAPTLS withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the parameter controls if the supplicant will authenticate the authenticator.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMutualAuthenticationEnable() {
		return mutualAuthenticationEnable;
	}

	/**
	 * Set the parameter controls if the supplicant will authenticate the authenticator.
	 *
	 * @since 2.0
	 * @param mutualAuthenticationEnable the input value
	 */
	public void  setMutualAuthenticationEnable(Boolean mutualAuthenticationEnable) {
		this.mutualAuthenticationEnable = mutualAuthenticationEnable;
	}

	/**
	 * Set the parameter controls if the supplicant will authenticate the authenticator.
	 *
	 * @since 2.0
	 * @param mutualAuthenticationEnable the input value
	 * @return this instance
	 */
	public EAPTLS withMutualAuthenticationEnable(Boolean mutualAuthenticationEnable) {
		this.mutualAuthenticationEnable = mutualAuthenticationEnable;
		return this;
	}

	//</editor-fold>

}