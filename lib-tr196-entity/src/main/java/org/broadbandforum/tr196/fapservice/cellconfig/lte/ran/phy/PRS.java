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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the PRS (Positioning Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.9}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.PRS.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY.PRS")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.PRS")
@XmlAccessorType(XmlAccessType.FIELD)
public class PRS {

	/**
	 * Defines the number of RBs (Resource Blocks) used for PRS. Corresponds to the parameter NRBPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumPRSResourceBlocks")
	@CWMPParameter(access = "readWrite", units = "Resource Blocks")
	public Long numPRSResourceBlocks;
	/**
	 * Corresponds to the PRS configuration index defined as parameter IPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3 and Table 6.10.4.3.-1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PRSConfigurationIndex")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 4095)
	public Long prsConfigurationIndex;
	/**
	 * Defines the number of consecutive positioning sub-frames. Corresponds to the parameter NPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumConsecutivePRSSubfames")
	@CWMPParameter(access = "readWrite")
	@Size(min = 6, max = 6)
	public Long numConsecutivePRSSubfames;

	public PRS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the number of RBs (Resource Blocks) used for PRS. Corresponds to the parameter NRBPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumPRSResourceBlocks() {
		return numPRSResourceBlocks;
	}

	/**
	 * Set the defines the number of RBs (Resource Blocks) used for PRS. Corresponds to the parameter NRBPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.1}}.
	 *
	 * @since 2.0
	 * @param numPRSResourceBlocks the input value
	 */
	public void  setNumPRSResourceBlocks(Long numPRSResourceBlocks) {
		this.numPRSResourceBlocks = numPRSResourceBlocks;
	}

	/**
	 * Set the defines the number of RBs (Resource Blocks) used for PRS. Corresponds to the parameter NRBPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.1}}.
	 *
	 * @since 2.0
	 * @param numPRSResourceBlocks the input value
	 * @return this instance
	 */
	public PRS withNumPRSResourceBlocks(Long numPRSResourceBlocks) {
		this.numPRSResourceBlocks = numPRSResourceBlocks;
		return this;
	}

	/**
	 * Get the corresponds to the PRS configuration index defined as parameter IPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3 and Table 6.10.4.3.-1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrsConfigurationIndex() {
		return prsConfigurationIndex;
	}

	/**
	 * Set the corresponds to the PRS configuration index defined as parameter IPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3 and Table 6.10.4.3.-1}}.
	 *
	 * @since 2.0
	 * @param prsConfigurationIndex the input value
	 */
	public void  setPrsConfigurationIndex(Long prsConfigurationIndex) {
		this.prsConfigurationIndex = prsConfigurationIndex;
	}

	/**
	 * Set the corresponds to the PRS configuration index defined as parameter IPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3 and Table 6.10.4.3.-1}}.
	 *
	 * @since 2.0
	 * @param prsConfigurationIndex the input value
	 * @return this instance
	 */
	public PRS withPrsConfigurationIndex(Long prsConfigurationIndex) {
		this.prsConfigurationIndex = prsConfigurationIndex;
		return this;
	}

	/**
	 * Get the defines the number of consecutive positioning sub-frames. Corresponds to the parameter NPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumConsecutivePRSSubfames() {
		return numConsecutivePRSSubfames;
	}

	/**
	 * Set the defines the number of consecutive positioning sub-frames. Corresponds to the parameter NPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3}}.
	 *
	 * @since 2.0
	 * @param numConsecutivePRSSubfames the input value
	 */
	public void  setNumConsecutivePRSSubfames(Long numConsecutivePRSSubfames) {
		this.numConsecutivePRSSubfames = numConsecutivePRSSubfames;
	}

	/**
	 * Set the defines the number of consecutive positioning sub-frames. Corresponds to the parameter NPRS in {{bibref|3GPP-TS.36.211|Section 6.10.4.3}}.
	 *
	 * @since 2.0
	 * @param numConsecutivePRSSubfames the input value
	 * @return this instance
	 */
	public PRS withNumConsecutivePRSSubfames(Long numConsecutivePRSSubfames) {
		this.numConsecutivePRSSubfames = numConsecutivePRSSubfames;
		return this;
	}

	//</editor-fold>

}