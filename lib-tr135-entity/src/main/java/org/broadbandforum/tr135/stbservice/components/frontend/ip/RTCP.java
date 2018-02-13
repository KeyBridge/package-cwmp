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
package org.broadbandforum.tr135.stbservice.components.frontend.ip;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Parameters related to RTCP receiver report generation as defined in {{bibref|RFC3550}}.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.RTCP.")
@XmlRootElement(name = "STBService.Components.FrontEnd.IP.RTCP")
@XmlType(name = "STBService.Components.FrontEnd.IP.RTCP")
@XmlAccessorType(XmlAccessType.FIELD)
public class RTCP {

	/**
	 * Enables or disables RTCP receiver report generation.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of RTCP receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Transmission repeat interval, in milliseconds.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TxRepeatInterval")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long txrepeatInterval;

	public RTCP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables RTCP receiver report generation.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables RTCP receiver report generation.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables RTCP receiver report generation.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public RTCP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of RTCP receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of RTCP receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of RTCP receiver report generation.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public RTCP withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the transmission repeat interval, in milliseconds.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTxrepeatInterval() {
		return txrepeatInterval;
	}

	/**
	 * Set the transmission repeat interval, in milliseconds.
	 *
	 * @since 1.0
	 * @param txrepeatInterval the input value
	 */
	public void  setTxrepeatInterval(Long txrepeatInterval) {
		this.txrepeatInterval = txrepeatInterval;
	}

	/**
	 * Set the transmission repeat interval, in milliseconds.
	 *
	 * @since 1.0
	 * @param txrepeatInterval the input value
	 * @return this instance
	 */
	public RTCP withTxrepeatInterval(Long txrepeatInterval) {
		this.txrepeatInterval = txrepeatInterval;
		return this;
	}

	//</editor-fold>

}