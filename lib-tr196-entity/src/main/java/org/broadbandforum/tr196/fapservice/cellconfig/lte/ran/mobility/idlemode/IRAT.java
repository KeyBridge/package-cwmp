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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.CDMA2000;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.GERAN;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.UTRA;

	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection scenario.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT")
@XmlAccessorType(XmlAccessType.FIELD)
public class IRAT {

	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to UTRA (UMTS) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.4}}).
	 */
	@XmlElement(name = "UTRA")
	public UTRA utrA;
	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to GERAN (GSM) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.6}}).
	 */
	@XmlElement(name = "GERAN")
	public GERAN gerAN;
	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to CDMA2000 system scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 */
	@XmlElement(name = "CDMA2000")
	public CDMA2000 cdmA2000;

	public IRAT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to UTRA (UMTS) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.4}}).
	 *
	 * @return the value
	 */
	public UTRA getUtrA() {
		return utrA;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to UTRA (UMTS) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.4}}).
	 *
	 * @param utrA the input value
	 */
	public void  setUtrA(UTRA utrA) {
		this.utrA = utrA;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to UTRA (UMTS) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.4}}).
	 *
	 * @param utrA the input value
	 * @return this instance
	 */
	public IRAT withUtrA(UTRA utrA) {
		this.utrA = utrA;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to GERAN (GSM) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.6}}).
	 *
	 * @return the value
	 */
	public GERAN getGerAN() {
		return gerAN;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to GERAN (GSM) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.6}}).
	 *
	 * @param gerAN the input value
	 */
	public void  setGerAN(GERAN gerAN) {
		this.gerAN = gerAN;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to GERAN (GSM) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.6}}).
	 *
	 * @param gerAN the input value
	 * @return this instance
	 */
	public IRAT withGerAN(GERAN gerAN) {
		this.gerAN = gerAN;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to CDMA2000 system scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @return the value
	 */
	public CDMA2000 getCdmA2000() {
		return cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to CDMA2000 system scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @param cdmA2000 the input value
	 */
	public void  setCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to CDMA2000 system scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @param cdmA2000 the input value
	 * @return this instance
	 */
	public IRAT withCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
		return this;
	}

	//</editor-fold>

}