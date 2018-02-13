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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Parameters related to AL-FEC configuration as defined in {{bibref|SMPTE20022-1}}.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.FEC.")
@XmlRootElement(name = "FEC")
@XmlType(name = "STBService.Components.FrontEnd.IP.FEC")
@XmlAccessorType(XmlAccessType.FIELD)
public class FEC {

	/**
	 * Enables or disables FEC decoder operation.

When set to {{true}}, enables the FEC decoder operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the FEC decoder operation.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The operation mode of the FEC decoder. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled the STB decides whether or not to run the AL_FEC decoding (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the FEC decoding.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "OperationMode")
	@CWMPParameter(access = "readWrite")
	public String operationMode;
	/**
	 * The status of FEC decoder operation. {{enum}} 

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "ECOperationStatus")
	public String ecoperationStatus;

	public FEC() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables FEC decoder operation.

When set to {{true}}, enables the FEC decoder operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the FEC decoder operation.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables FEC decoder operation.

When set to {{true}}, enables the FEC decoder operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the FEC decoder operation.
	 *
	 * @since 1.1
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables FEC decoder operation.

When set to {{true}}, enables the FEC decoder operation, immediately ({{enum|Forced|OperationMode}} mode) or automatically when necessary ({{enum|Auto|OperationMode}} mode).

When set to {{false}}, disables the FEC decoder operation.
	 *
	 * @since 1.1
	 * @param enable the input value
	 * @return this instance
	 */
	public FEC withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the operation mode of the FEC decoder. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled the STB decides whether or not to run the AL_FEC decoding (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the FEC decoding.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getOperationMode() {
		return operationMode;
	}

	/**
	 * Set the operation mode of the FEC decoder. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled the STB decides whether or not to run the AL_FEC decoding (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the FEC decoding.
	 *
	 * @since 1.1
	 * @param operationMode the input value
	 */
	public void  setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	/**
	 * Set the operation mode of the FEC decoder. {{enum}}

In {{enum|Auto}} mode, when Error Correction is enabled the STB decides whether or not to run the AL_FEC decoding (e.g. after an error analysis).

In {{enum|Forced}} mode, when Error Correction is enabled the STB MUST run the FEC decoding.
	 *
	 * @since 1.1
	 * @param operationMode the input value
	 * @return this instance
	 */
	public FEC withOperationMode(String operationMode) {
		this.operationMode = operationMode;
		return this;
	}

	/**
	 * Get the status of FEC decoder operation. {{enum}} 

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getEcoperationStatus() {
		return ecoperationStatus;
	}

	/**
	 * Set the status of FEC decoder operation. {{enum}} 

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param ecoperationStatus the input value
	 */
	public void  setEcoperationStatus(String ecoperationStatus) {
		this.ecoperationStatus = ecoperationStatus;
	}

	/**
	 * Set the status of FEC decoder operation. {{enum}} 

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.1
	 * @param ecoperationStatus the input value
	 * @return this instance
	 */
	public FEC withEcoperationStatus(String ecoperationStatus) {
		this.ecoperationStatus = ecoperationStatus;
		return this;
	}

	//</editor-fold>

}