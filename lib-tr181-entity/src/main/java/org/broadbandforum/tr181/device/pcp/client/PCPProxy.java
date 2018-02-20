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
package org.broadbandforum.tr181.device.pcp.client;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Properties for the Port Control Protocol (PCP) Proxy, as specified in {{bibref|PCPProxy}}.
	 *
	 * @since TR181 v2.8
	 */
@CWMPObject(name = "Device.PCP.Client.{i}.PCPProxy.")
@XmlRootElement(name = "Device.PCP.Client.PCPProxy")
@XmlType(name = "Device.PCP.Client.PCPProxy")
@XmlAccessorType(XmlAccessType.FIELD)
public class PCPProxy {

	/**
	 * Enables or disables the PCP Proxy for this PCP Client.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * A string identifying the highest version of PCP that the proxy supports.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "HighestVersion")
	@Size(min = 0, max = 65535)
	public Long highestVersion;
	/**
	 * The status of the PCP Proxy for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status;

	public PCPProxy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the PCP Proxy for this PCP Client.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the PCP Proxy for this PCP Client.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the PCP Proxy for this PCP Client.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public PCPProxy withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get a string identifying the highest version of PCP that the proxy supports.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getHighestVersion() {
		return highestVersion;
	}

	/**
	 * Set a string identifying the highest version of PCP that the proxy supports.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @param highestVersion the input value
	 */
	public void  setHighestVersion(Long highestVersion) {
		this.highestVersion = highestVersion;
	}

	/**
	 * Set a string identifying the highest version of PCP that the proxy supports.

          This parameter is based on Version from {{bibref|RFC6887}}.
	 *
	 * @since 2.8
	 * @param highestVersion the input value
	 * @return this instance
	 */
	public PCPProxy withHighestVersion(Long highestVersion) {
		this.highestVersion = highestVersion;
		return this;
	}

	/**
	 * Get the status of the PCP Proxy for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the PCP Proxy for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the PCP Proxy for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public PCPProxy withStatus(String status) {
		this.status = status;
		return this;
	}

	//</editor-fold>

}