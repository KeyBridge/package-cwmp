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

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Properties for the interworking function between UPnP IGD (Internet Gateway Device) and PCP, as specified in {{bibref|RFC6970}}.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.PCP.Client.{i}.UPnPIWF.")
public class UPnPIWF {

	/**
	 * Enables or disables the UPnP IGD-PCP Interworking Function for this PCP Client.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of the UPnP IGD-PCP Interworking Function for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "Status")
	public String status;

	public UPnPIWF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the UPnP IGD-PCP Interworking Function for this PCP Client.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the UPnP IGD-PCP Interworking Function for this PCP Client.
	 *
	 * @since 2.8
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the UPnP IGD-PCP Interworking Function for this PCP Client.
	 *
	 * @since 2.8
	 * @param enable the input value
	 * @return this instance
	 */
	public UPnPIWF withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the UPnP IGD-PCP Interworking Function for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the UPnP IGD-PCP Interworking Function for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the UPnP IGD-PCP Interworking Function for this PCP Client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.8
	 * @param status the input value
	 * @return this instance
	 */
	public UPnPIWF withStatus(String status) {
		this.status = status;
		return this;
	}

	//</editor-fold>

}