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
package org.broadbandforum.tr196.fapservice.transport.security;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Shared Secret Table. This table gathers information about all types of shared secret-based credentials (UICC).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Transport.Security.Secret.{i}.")
public class Secret {

	/**
	 * Enable or disable this Shared Secret entry
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The type of this Shared Secret entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * The status of this Shared Secret entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * The UICC Card Identifier (UICCID), only numeric values are allowed. {{bibref|ITU-E.118}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UICCCardID")
	@Size(max = 19)
	public String uicCCardID;

	public Secret() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable this Shared Secret entry
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable this Shared Secret entry
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable this Shared Secret entry
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Secret withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the type of this Shared Secret entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the type of this Shared Secret entry.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the type of this Shared Secret entry.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public Secret withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the status of this Shared Secret entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Shared Secret entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Shared Secret entry.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Secret withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the UICC Card Identifier (UICCID), only numeric values are allowed. {{bibref|ITU-E.118}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getUicCCardID() {
		return uicCCardID;
	}

	/**
	 * Set the UICC Card Identifier (UICCID), only numeric values are allowed. {{bibref|ITU-E.118}}
	 *
	 * @since 2.0
	 * @param uicCCardID the input value
	 */
	public void  setUicCCardID(String uicCCardID) {
		this.uicCCardID = uicCCardID;
	}

	/**
	 * Set the UICC Card Identifier (UICCID), only numeric values are allowed. {{bibref|ITU-E.118}}
	 *
	 * @since 2.0
	 * @param uicCCardID the input value
	 * @return this instance
	 */
	public Secret withUicCCardID(String uicCCardID) {
		this.uicCCardID = uicCCardID;
		return this;
	}

	//</editor-fold>

}