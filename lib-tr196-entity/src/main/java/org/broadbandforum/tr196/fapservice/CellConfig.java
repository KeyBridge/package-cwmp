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
package org.broadbandforum.tr196.fapservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.CDMA2000;
import org.broadbandforum.tr196.fapservice.cellconfig.LTE;
import org.broadbandforum.tr196.fapservice.cellconfig.UMTS;

	/**
	 * This object contains parameters relating to configuring the FAP.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.")
@XmlRootElement(name = "FAPService.CellConfig")
@XmlType(name = "FAPService.CellConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class CellConfig {

	/**
	 * This object contains parameters relating to configuring UMTS system specific information.
	 */
	@XmlElement(name = "UMTS")
	public UMTS umtS;
	/**
	 * This object contains parameters relating to configuring the LTE FAP.
	 */
	@XmlElement(name = "LTE")
	public LTE lte;
	/**
	 * This object contains parameters relating to configuring the CDMA2000 FAP.
	 */
	@XmlElement(name = "CDMA2000")
	public CDMA2000 cdmA2000;

	public CellConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object contains parameters relating to configuring UMTS system specific information.
	 *
	 * @return the value
	 */
	public UMTS getUmtS() {
		return umtS;
	}

	/**
	 * Set the this object contains parameters relating to configuring UMTS system specific information.
	 *
	 * @param umtS the input value
	 */
	public void  setUmtS(UMTS umtS) {
		this.umtS = umtS;
	}

	/**
	 * Set the this object contains parameters relating to configuring UMTS system specific information.
	 *
	 * @param umtS the input value
	 * @return this instance
	 */
	public CellConfig withUmtS(UMTS umtS) {
		this.umtS = umtS;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring the LTE FAP.
	 *
	 * @return the value
	 */
	public LTE getLte() {
		return lte;
	}

	/**
	 * Set the this object contains parameters relating to configuring the LTE FAP.
	 *
	 * @param lte the input value
	 */
	public void  setLte(LTE lte) {
		this.lte = lte;
	}

	/**
	 * Set the this object contains parameters relating to configuring the LTE FAP.
	 *
	 * @param lte the input value
	 * @return this instance
	 */
	public CellConfig withLte(LTE lte) {
		this.lte = lte;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring the CDMA2000 FAP.
	 *
	 * @return the value
	 */
	public CDMA2000 getCdmA2000() {
		return cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to configuring the CDMA2000 FAP.
	 *
	 * @param cdmA2000 the input value
	 */
	public void  setCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to configuring the CDMA2000 FAP.
	 *
	 * @param cdmA2000 the input value
	 * @return this instance
	 */
	public CellConfig withCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
		return this;
	}

	//</editor-fold>

}