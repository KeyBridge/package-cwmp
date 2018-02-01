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
package org.broadbandforum.tr143.internetgatewaydevice;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains generic device configuration information.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANConfigSecurity.")
public class LANConfigSecurity {

	/**
	 * A password to allow LAN access to protected auto-configuration services.

If the CPE supports TR-064 (LAN-side DSL CPE Configuration Protocol), this parameter is to be used as the ''dslf-config'' password (as defined in TR-064).

If the CPE has a user interface with password protection enabled, this parameter is also to be used as the user password for password-protected operations.  However, this parameter MUST NOT be used to set the user password if the optional parameter {{param|InternetGatewayDevice.UserInterface.PasswordUserSelectable}} is {{true}}.
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

If the CPE supports TR-064 (LAN-side DSL CPE Configuration Protocol), this parameter is to be used as the ''dslf-config'' password (as defined in TR-064).

If the CPE has a user interface with password protection enabled, this parameter is also to be used as the user password for password-protected operations.  However, this parameter MUST NOT be used to set the user password if the optional parameter {{param|InternetGatewayDevice.UserInterface.PasswordUserSelectable}} is {{true}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getConfigPassword() {
		return configPassword;
	}

	/**
	 * Set a password to allow LAN access to protected auto-configuration services.

If the CPE supports TR-064 (LAN-side DSL CPE Configuration Protocol), this parameter is to be used as the ''dslf-config'' password (as defined in TR-064).

If the CPE has a user interface with password protection enabled, this parameter is also to be used as the user password for password-protected operations.  However, this parameter MUST NOT be used to set the user password if the optional parameter {{param|InternetGatewayDevice.UserInterface.PasswordUserSelectable}} is {{true}}.
	 *
	 * @since 1.0
	 * @param configPassword the input value
	 */
	public void  setConfigPassword(String configPassword) {
		this.configPassword = configPassword;
	}

	/**
	 * Set a password to allow LAN access to protected auto-configuration services.

If the CPE supports TR-064 (LAN-side DSL CPE Configuration Protocol), this parameter is to be used as the ''dslf-config'' password (as defined in TR-064).

If the CPE has a user interface with password protection enabled, this parameter is also to be used as the user password for password-protected operations.  However, this parameter MUST NOT be used to set the user password if the optional parameter {{param|InternetGatewayDevice.UserInterface.PasswordUserSelectable}} is {{true}}.
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