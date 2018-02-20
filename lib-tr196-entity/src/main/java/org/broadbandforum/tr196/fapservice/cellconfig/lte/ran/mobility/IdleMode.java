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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.Common;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.IRAT;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.InterFreq;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.IntraFreq;

	/**
	 * This object contains parameters relating to the UE's mobility while it is in idle mode (cell (re-)selection). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode")
@XmlAccessorType(XmlAccessType.FIELD)
public class IdleMode {

	/**
	 * This object contains parameters relating to the idle mode mobility configuration that is common to all cell re-selection scenarios (intra/inter-freq, inter-RAT to UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.1}}).
	 */
	@XmlElement(name = "Common")
	public Common common;
	/**
	 * This object contains parameters relating to the idle mode mobility configuration for intra-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.2}}).
	 */
	@XmlElement(name = "IntraFreq")
	public IntraFreq intraFreq;
	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-freq re-selection scenario .
	 */
	@XmlElement(name = "InterFreq")
	public InterFreq interFreq;
	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection scenario.
	 */
	@XmlElement(name = "IRAT")
	public IRAT iraT;

	public IdleMode() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the idle mode mobility configuration that is common to all cell re-selection scenarios (intra/inter-freq, inter-RAT to UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.1}}).
	 *
	 * @return the value
	 */
	public Common getCommon() {
		return common;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration that is common to all cell re-selection scenarios (intra/inter-freq, inter-RAT to UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.1}}).
	 *
	 * @param common the input value
	 */
	public void  setCommon(Common common) {
		this.common = common;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration that is common to all cell re-selection scenarios (intra/inter-freq, inter-RAT to UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.1}}).
	 *
	 * @param common the input value
	 * @return this instance
	 */
	public IdleMode withCommon(Common common) {
		this.common = common;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the idle mode mobility configuration for intra-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.2}}).
	 *
	 * @return the value
	 */
	public IntraFreq getIntraFreq() {
		return intraFreq;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for intra-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.2}}).
	 *
	 * @param intraFreq the input value
	 */
	public void  setIntraFreq(IntraFreq intraFreq) {
		this.intraFreq = intraFreq;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for intra-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.2}}).
	 *
	 * @param intraFreq the input value
	 * @return this instance
	 */
	public IdleMode withIntraFreq(IntraFreq intraFreq) {
		this.intraFreq = intraFreq;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the idle mode mobility configuration for inter-freq re-selection scenario .
	 *
	 * @return the value
	 */
	public InterFreq getInterFreq() {
		return interFreq;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-freq re-selection scenario .
	 *
	 * @param interFreq the input value
	 */
	public void  setInterFreq(InterFreq interFreq) {
		this.interFreq = interFreq;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-freq re-selection scenario .
	 *
	 * @param interFreq the input value
	 * @return this instance
	 */
	public IdleMode withInterFreq(InterFreq interFreq) {
		this.interFreq = interFreq;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection scenario.
	 *
	 * @return the value
	 */
	public IRAT getIraT() {
		return iraT;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection scenario.
	 *
	 * @param iraT the input value
	 */
	public void  setIraT(IRAT iraT) {
		this.iraT = iraT;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection scenario.
	 *
	 * @param iraT the input value
	 * @return this instance
	 */
	public IdleMode withIraT(IRAT iraT) {
		this.iraT = iraT;
		return this;
	}

	//</editor-fold>

}