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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * CDMA2000 FAP Security Gateway operational parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.Gateway.")
public class Gateway {

	/**
	 * First SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer1")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer1;
	/**
	 * Second SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer2")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer2;
	/**
	 * Third SecGW that the FAP attempts to contact. Can contain either FQDN or IP address
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWServer3")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String secGWServer3;
	/**
	 * Counter indicating how many times FAP has switched between SecGW
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecGWSwitchoverCount")
	public Long secGWSwitchoverCount;

	public Gateway() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the first SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer1() {
		return secGWServer1;
	}

	/**
	 * Set the first SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 * @param secGWServer1 the input value
	 */
	public void  setSecGWServer1(String secGWServer1) {
		this.secGWServer1 = secGWServer1;
	}

	/**
	 * Set the first SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 * @param secGWServer1 the input value
	 * @return this instance
	 */
	public Gateway withSecGWServer1(String secGWServer1) {
		this.secGWServer1 = secGWServer1;
		return this;
	}

	/**
	 * Get the second SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer2() {
		return secGWServer2;
	}

	/**
	 * Set the second SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 * @param secGWServer2 the input value
	 */
	public void  setSecGWServer2(String secGWServer2) {
		this.secGWServer2 = secGWServer2;
	}

	/**
	 * Set the second SecGW the FAP attempts to contact. Either FQDN or IP address
	 *
	 * @since 2.0
	 * @param secGWServer2 the input value
	 * @return this instance
	 */
	public Gateway withSecGWServer2(String secGWServer2) {
		this.secGWServer2 = secGWServer2;
		return this;
	}

	/**
	 * Get the third SecGW that the FAP attempts to contact. Can contain either FQDN or IP address
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSecGWServer3() {
		return secGWServer3;
	}

	/**
	 * Set the third SecGW that the FAP attempts to contact. Can contain either FQDN or IP address
	 *
	 * @since 2.0
	 * @param secGWServer3 the input value
	 */
	public void  setSecGWServer3(String secGWServer3) {
		this.secGWServer3 = secGWServer3;
	}

	/**
	 * Set the third SecGW that the FAP attempts to contact. Can contain either FQDN or IP address
	 *
	 * @since 2.0
	 * @param secGWServer3 the input value
	 * @return this instance
	 */
	public Gateway withSecGWServer3(String secGWServer3) {
		this.secGWServer3 = secGWServer3;
		return this;
	}

	/**
	 * Get the counter indicating how many times FAP has switched between SecGW
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSecGWSwitchoverCount() {
		return secGWSwitchoverCount;
	}

	/**
	 * Set the counter indicating how many times FAP has switched between SecGW
	 *
	 * @since 2.0
	 * @param secGWSwitchoverCount the input value
	 */
	public void  setSecGWSwitchoverCount(Long secGWSwitchoverCount) {
		this.secGWSwitchoverCount = secGWSwitchoverCount;
	}

	/**
	 * Set the counter indicating how many times FAP has switched between SecGW
	 *
	 * @since 2.0
	 * @param secGWSwitchoverCount the input value
	 * @return this instance
	 */
	public Gateway withSecGWSwitchoverCount(Long secGWSwitchoverCount) {
		this.secGWSwitchoverCount = secGWSwitchoverCount;
		return this;
	}

	//</editor-fold>

}