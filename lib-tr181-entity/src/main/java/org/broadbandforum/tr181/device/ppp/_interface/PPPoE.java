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
package org.broadbandforum.tr181.device.ppp._interface;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * PPPoE object that functionally groups PPPoE related parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.PPP.Interface.{i}.PPPoE.")
@XmlRootElement(name = "PPPoE")
@XmlType(name = "Device.PPP.Interface.PPPoE")
@XmlAccessorType(XmlAccessType.FIELD)
public class PPPoE {

	/**
	 * Represents the PPPoE Session ID.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SessionID")
	@Size(min = 1)
	public Long sessionID;
	/**
	 * PPPoE Access Concentrator.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String acname;
	/**
	 * PPPoE Service Name.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ServiceName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serviceName;

	public PPPoE() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the represents the PPPoE Session ID.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSessionID() {
		return sessionID;
	}

	/**
	 * Set the represents the PPPoE Session ID.
	 *
	 * @since 2.0
	 * @param sessionID the input value
	 */
	public void  setSessionID(Long sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * Set the represents the PPPoE Session ID.
	 *
	 * @since 2.0
	 * @param sessionID the input value
	 * @return this instance
	 */
	public PPPoE withSessionID(Long sessionID) {
		this.sessionID = sessionID;
		return this;
	}

	/**
	 * Get the pppoE Access Concentrator.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getAcname() {
		return acname;
	}

	/**
	 * Set the pppoE Access Concentrator.
	 *
	 * @since 2.0
	 * @param acname the input value
	 */
	public void  setAcname(String acname) {
		this.acname = acname;
	}

	/**
	 * Set the pppoE Access Concentrator.
	 *
	 * @since 2.0
	 * @param acname the input value
	 * @return this instance
	 */
	public PPPoE withAcname(String acname) {
		this.acname = acname;
		return this;
	}

	/**
	 * Get the pppoE Service Name.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Set the pppoE Service Name.
	 *
	 * @since 2.0
	 * @param serviceName the input value
	 */
	public void  setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * Set the pppoE Service Name.
	 *
	 * @since 2.0
	 * @param serviceName the input value
	 * @return this instance
	 */
	public PPPoE withServiceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	//</editor-fold>

}