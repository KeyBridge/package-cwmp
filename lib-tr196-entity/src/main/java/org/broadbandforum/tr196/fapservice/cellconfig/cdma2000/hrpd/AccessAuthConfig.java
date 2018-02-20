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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * HRPD A12-related service stats.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.AccessAuthConfig.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.HRPD.AccessAuthConfig")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD.AccessAuthConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccessAuthConfig {

	/**
	 * Flag to enable/Disable HRPD Access Authentication. {{true}} - Enabled, {{false}} - Disabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A12AccessAuthenticationEnable")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer a12AccessAuthenticationEnable;

	public AccessAuthConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the flag to enable/Disable HRPD Access Authentication. {{true}} - Enabled, {{false}} - Disabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getA12AccessAuthenticationEnable() {
		return a12AccessAuthenticationEnable;
	}

	/**
	 * Set the flag to enable/Disable HRPD Access Authentication. {{true}} - Enabled, {{false}} - Disabled.
	 *
	 * @since 2.0
	 * @param a12AccessAuthenticationEnable the input value
	 */
	public void  setA12AccessAuthenticationEnable(Integer a12AccessAuthenticationEnable) {
		this.a12AccessAuthenticationEnable = a12AccessAuthenticationEnable;
	}

	/**
	 * Set the flag to enable/Disable HRPD Access Authentication. {{true}} - Enabled, {{false}} - Disabled.
	 *
	 * @since 2.0
	 * @param a12AccessAuthenticationEnable the input value
	 * @return this instance
	 */
	public AccessAuthConfig withA12AccessAuthenticationEnable(Integer a12AccessAuthenticationEnable) {
		this.a12AccessAuthenticationEnable = a12AccessAuthenticationEnable;
		return this;
	}

	//</editor-fold>

}