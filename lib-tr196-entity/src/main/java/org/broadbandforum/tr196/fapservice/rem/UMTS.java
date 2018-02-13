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
package org.broadbandforum.tr196.fapservice.rem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.rem.umts.GSM;
import org.broadbandforum.tr196.fapservice.rem.umts.WCDMA;

	/**
	 * This object contains Radio Environment Measurement parameters for UMTS FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.UMTS.")
@XmlRootElement(name = "FAPService.REM.UMTS")
@XmlType(name = "FAPService.REM.UMTS")
@XmlAccessorType(XmlAccessType.FIELD)
public class UMTS {

	/**
	 * This object contains parameters relating to radio environment measurement capabilities for the UMTS system.
	 */
	@XmlElement(name = "WCDMA")
	public WCDMA wcdMA;
	/**
	 * This object contains parameters relating to GSM REM capabilities.
	 */
	@XmlElement(name = "GSM")
	public GSM gsm;

	public UMTS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to radio environment measurement capabilities for the UMTS system.
	 *
	 * @return the value
	 */
	public WCDMA getWcdMA() {
		return wcdMA;
	}

	/**
	 * Set the this object contains parameters relating to radio environment measurement capabilities for the UMTS system.
	 *
	 * @param wcdMA the input value
	 */
	public void  setWcdMA(WCDMA wcdMA) {
		this.wcdMA = wcdMA;
	}

	/**
	 * Set the this object contains parameters relating to radio environment measurement capabilities for the UMTS system.
	 *
	 * @param wcdMA the input value
	 * @return this instance
	 */
	public UMTS withWcdMA(WCDMA wcdMA) {
		this.wcdMA = wcdMA;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to GSM REM capabilities.
	 *
	 * @return the value
	 */
	public GSM getGsm() {
		return gsm;
	}

	/**
	 * Set the this object contains parameters relating to GSM REM capabilities.
	 *
	 * @param gsm the input value
	 */
	public void  setGsm(GSM gsm) {
		this.gsm = gsm;
	}

	/**
	 * Set the this object contains parameters relating to GSM REM capabilities.
	 *
	 * @param gsm the input value
	 * @return this instance
	 */
	public UMTS withGsm(GSM gsm) {
		this.gsm = gsm;
		return this;
	}

	//</editor-fold>

}