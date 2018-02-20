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
package org.broadbandforum.tr069.internetgatewaydevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains generic device configuration information.
	 *
	 * @since TR069 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANConfigSecurity.")
@XmlRootElement(name = "InternetGatewayDevice.LANConfigSecurity")
@XmlType(name = "InternetGatewayDevice.LANConfigSecurity")
@XmlAccessorType(XmlAccessType.FIELD)
public class LANConfigSecurity {

	/**
	 * A password to allow LAN access to protected auto-configuration services.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ConfigPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String configPassword;

	public LANConfigSecurity() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get a password to allow LAN access to protected auto-configuration services.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConfigPassword() {
		return configPassword;
	}

	/**
	 * Set a password to allow LAN access to protected auto-configuration services.
	 *
	 * @since 1.0
	 * @param configPassword the input value
	 */
	public void  setConfigPassword(String configPassword) {
		this.configPassword = configPassword;
	}

	/**
	 * Set a password to allow LAN access to protected auto-configuration services.
	 *
	 * @since 1.0
	 * @param configPassword the input value
	 * @return this instance
	 */
	public LANConfigSecurity withConfigPassword(String configPassword) {
		this.configPassword = configPassword;
		return this;
	}

	//</editor-fold>

}