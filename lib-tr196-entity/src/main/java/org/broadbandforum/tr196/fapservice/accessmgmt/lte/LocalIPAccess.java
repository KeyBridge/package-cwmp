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
package org.broadbandforum.tr196.fapservice.accessmgmt.lte;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Local IP access for LTE FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.AccessMgmt.LTE.LocalIPAccess.")
public class LocalIPAccess {

	/**
	 * Enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;

	public LocalIPAccess() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables/disables the Local IP Access (LIPA) functionality.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public LocalIPAccess withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	//</editor-fold>

}