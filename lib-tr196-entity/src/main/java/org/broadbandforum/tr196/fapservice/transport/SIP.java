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
package org.broadbandforum.tr196.fapservice.transport;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.transport.sip.FCS;

	/**
	 * This object contains parameters relating to SIP as a transport protocol.

SIP is defined in {{bibref|RFC3261}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.SIP.")
public class SIP {

	/**
	 * Enables or disables the whole SIP object and allows the setup or release of SIP associations and their related streams.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * This object models SIP Femtocell Convergence Server (FCS) parameters.
	 */
	@XmlElement(name = "FCS")
	public FCS fcs;

	public SIP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the whole SIP object and allows the setup or release of SIP associations and their related streams.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the whole SIP object and allows the setup or release of SIP associations and their related streams.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the whole SIP object and allows the setup or release of SIP associations and their related streams.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SIP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the this object models SIP Femtocell Convergence Server (FCS) parameters.
	 *
	 * @return the value
	 */
	public FCS getFcs() {
		return fcs;
	}

	/**
	 * Set the this object models SIP Femtocell Convergence Server (FCS) parameters.
	 *
	 * @param fcs the input value
	 */
	public void  setFcs(FCS fcs) {
		this.fcs = fcs;
	}

	/**
	 * Set the this object models SIP Femtocell Convergence Server (FCS) parameters.
	 *
	 * @param fcs the input value
	 * @return this instance
	 */
	public SIP withFcs(FCS fcs) {
		this.fcs = fcs;
		return this;
	}

	//</editor-fold>

}