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
package org.broadbandforum.tr181.device.ieee1905.al;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object represents the Security configuration for the 1905 device as defined in {{bibref|IEEE1905.1a|Section 9.2 Security Setup Methods}}.
	 *
	 * @since 2.9
	 */
@CWMPObject(name = "Device.IEEE1905.AL.Security.")
@XmlRootElement(name = "Device.IEEE1905.AL.Security")
@XmlType(name = "Device.IEEE1905.AL.Security")
@XmlAccessorType(XmlAccessType.FIELD)
public class Security {

	/**
	 * {{list}} Supported security setup method(s) for the network. 

Enumerated value must be one of [UCPK, PBC, NFCNK]
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "SetupMethod")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> setupMethod;
	/**
	 * 1905 network passphrase for generating security keys.
	 *
	 * @since 2.9
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	public String password;

	public Security() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Supported security setup method(s) for the network. 

Enumerated value must be one of [UCPK, PBC, NFCNK]
	 *
	 * @since 2.9
	 * @return the value
	 */
	public Collection<String> getSetupMethod() {
		if (this.setupMethod == null){ this.setupMethod=new ArrayList<>();}
		return setupMethod;
	}

	/**
	 * Set the {{list}} Supported security setup method(s) for the network. 

Enumerated value must be one of [UCPK, PBC, NFCNK]
	 *
	 * @since 2.9
	 * @param setupMethod the input value
	 */
	public void  setSetupMethod(Collection<String> setupMethod) {
		this.setupMethod = setupMethod;
	}

	/**
	 * Set the {{list}} Supported security setup method(s) for the network. 

Enumerated value must be one of [UCPK, PBC, NFCNK]
	 *
	 * @since 2.9
	 * @param string the input value
	 * @return this instance
	 */
	public Security withSetupMethod(String string) {
		getSetupMethod().add(string);
		return this;
	}

	/**
	 * Get the 1905 network passphrase for generating security keys.
	 *
	 * @since 2.9
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the 1905 network passphrase for generating security keys.
	 *
	 * @since 2.9
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the 1905 network passphrase for generating security keys.
	 *
	 * @since 2.9
	 * @param password the input value
	 * @return this instance
	 */
	public Security withPassword(String password) {
		this.password = password;
		return this;
	}

	//</editor-fold>

}