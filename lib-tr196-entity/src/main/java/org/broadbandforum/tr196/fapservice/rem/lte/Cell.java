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
package org.broadbandforum.tr196.fapservice.rem.lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.rem.lte.cell.BCCH;
import org.broadbandforum.tr196.fapservice.rem.lte.cell.RF;

	/**
	 * Table indicating the components of the discovered cells.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.LTE.Cell.{i}.")
@XmlRootElement(name = "FAPService.REM.LTE.Cell")
@XmlType(name = "FAPService.REM.LTE.Cell")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cell {

	/**
	 * Table indicating the RF aspect of the discovered cells.
	 */
	@XmlElement(name = "RF")
	public RF rf;
	/**
	 * Table containing the system information broadcast in the BCCH logical channel.
	 */
	@XmlElement(name = "BCCH")
	public BCCH bccH;

	public Cell() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the table indicating the RF aspect of the discovered cells.
	 *
	 * @return the value
	 */
	public RF getRf() {
		return rf;
	}

	/**
	 * Set the table indicating the RF aspect of the discovered cells.
	 *
	 * @param rf the input value
	 */
	public void  setRf(RF rf) {
		this.rf = rf;
	}

	/**
	 * Set the table indicating the RF aspect of the discovered cells.
	 *
	 * @param rf the input value
	 * @return this instance
	 */
	public Cell withRf(RF rf) {
		this.rf = rf;
		return this;
	}

	/**
	 * Get the table containing the system information broadcast in the BCCH logical channel.
	 *
	 * @return the value
	 */
	public BCCH getBccH() {
		return bccH;
	}

	/**
	 * Set the table containing the system information broadcast in the BCCH logical channel.
	 *
	 * @param bccH the input value
	 */
	public void  setBccH(BCCH bccH) {
		this.bccH = bccH;
	}

	/**
	 * Set the table containing the system information broadcast in the BCCH logical channel.
	 *
	 * @param bccH the input value
	 * @return this instance
	 */
	public Cell withBccH(BCCH bccH) {
		this.bccH = bccH;
		return this;
	}

	//</editor-fold>

}