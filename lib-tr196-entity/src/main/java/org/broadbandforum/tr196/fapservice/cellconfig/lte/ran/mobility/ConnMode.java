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
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.connmode.EUTRA;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.connmode.IRAT;

	/**
	 * This object contains parameters relating to the UE's mobility while it is in connected mode (handover). Parameters under this object determines the content in the SIB (System Information Block) that is broadcast by LTE .
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.ConnMode.")
@XmlRootElement(name = "ConnMode")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.ConnMode")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConnMode {

	/**
	 * This object contains parameters relating to the connected mode mobility (handover) configuration within LTE system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.1}}).
	 */
	@XmlElement(name = "EUTRA")
	public EUTRA eutRA;
	/**
	 * This object contains parameters relating to the connected mode mobility (handover) configuration that is common to all inter-RAT handover scenarios (UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.2}}).
	 */
	@XmlElement(name = "IRAT")
	public IRAT iraT;

	public ConnMode() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the connected mode mobility (handover) configuration within LTE system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.1}}).
	 *
	 * @return the value
	 */
	public EUTRA getEutRA() {
		return eutRA;
	}

	/**
	 * Set the this object contains parameters relating to the connected mode mobility (handover) configuration within LTE system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.1}}).
	 *
	 * @param eutRA the input value
	 */
	public void  setEutRA(EUTRA eutRA) {
		this.eutRA = eutRA;
	}

	/**
	 * Set the this object contains parameters relating to the connected mode mobility (handover) configuration within LTE system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.1}}).
	 *
	 * @param eutRA the input value
	 * @return this instance
	 */
	public ConnMode withEutRA(EUTRA eutRA) {
		this.eutRA = eutRA;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the connected mode mobility (handover) configuration that is common to all inter-RAT handover scenarios (UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.2}}).
	 *
	 * @return the value
	 */
	public IRAT getIraT() {
		return iraT;
	}

	/**
	 * Set the this object contains parameters relating to the connected mode mobility (handover) configuration that is common to all inter-RAT handover scenarios (UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.2}}).
	 *
	 * @param iraT the input value
	 */
	public void  setIraT(IRAT iraT) {
		this.iraT = iraT;
	}

	/**
	 * Set the this object contains parameters relating to the connected mode mobility (handover) configuration that is common to all inter-RAT handover scenarios (UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.2}}).
	 *
	 * @param iraT the input value
	 * @return this instance
	 */
	public ConnMode withIraT(IRAT iraT) {
		this.iraT = iraT;
		return this;
	}

	//</editor-fold>

}