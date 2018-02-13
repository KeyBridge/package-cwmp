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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mac.DRX;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mac.RACH;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mac.ULSCH;

	/**
	 * This object contains parameters relating to the MAC (Medium Access Control) configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.MAC.")
@XmlRootElement(name = "MAC")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.MAC")
@XmlAccessorType(XmlAccessType.FIELD)
public class MAC {

	/**
	 * This object contains parameters relating to the RACH (Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.1}}).
	 */
	@XmlElement(name = "RACH")
	public RACH racH;
	/**
	 * This object contains parameters relating to the DRX (Discontinuous Reception) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.2}}).
	 */
	@XmlElement(name = "DRX")
	public DRX drx;
	/**
	 * This object contains parameters relating to the ULSCH (Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.3}}).
	 */
	@XmlElement(name = "ULSCH")
	public ULSCH ulsCH;

	public MAC() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to the RACH (Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.1}}).
	 *
	 * @return the value
	 */
	public RACH getRacH() {
		return racH;
	}

	/**
	 * Set the this object contains parameters relating to the RACH (Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.1}}).
	 *
	 * @param racH the input value
	 */
	public void  setRacH(RACH racH) {
		this.racH = racH;
	}

	/**
	 * Set the this object contains parameters relating to the RACH (Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.1}}).
	 *
	 * @param racH the input value
	 * @return this instance
	 */
	public MAC withRacH(RACH racH) {
		this.racH = racH;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the DRX (Discontinuous Reception) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.2}}).
	 *
	 * @return the value
	 */
	public DRX getDrx() {
		return drx;
	}

	/**
	 * Set the this object contains parameters relating to the DRX (Discontinuous Reception) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.2}}).
	 *
	 * @param drx the input value
	 */
	public void  setDrx(DRX drx) {
		this.drx = drx;
	}

	/**
	 * Set the this object contains parameters relating to the DRX (Discontinuous Reception) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.2}}).
	 *
	 * @param drx the input value
	 * @return this instance
	 */
	public MAC withDrx(DRX drx) {
		this.drx = drx;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the ULSCH (Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.3}}).
	 *
	 * @return the value
	 */
	public ULSCH getUlsCH() {
		return ulsCH;
	}

	/**
	 * Set the this object contains parameters relating to the ULSCH (Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.3}}).
	 *
	 * @param ulsCH the input value
	 */
	public void  setUlsCH(ULSCH ulsCH) {
		this.ulsCH = ulsCH;
	}

	/**
	 * Set the this object contains parameters relating to the ULSCH (Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.3}}).
	 *
	 * @param ulsCH the input value
	 * @return this instance
	 */
	public MAC withUlsCH(ULSCH ulsCH) {
		this.ulsCH = ulsCH;
		return this;
	}

	//</editor-fold>

}