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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.ran.RF;

	/**
	 * The object contains attributes related to HRPD RAN.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.RAN.")
@XmlRootElement(name = "RAN")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD.RAN")
@XmlAccessorType(XmlAccessType.FIELD)
public class RAN {

	/**
	 * Contains the details related to HRPD RF
	 */
	@XmlElement(name = "RF")
	public RF rf;

	public RAN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the contains the details related to HRPD RF
	 *
	 * @return the value
	 */
	public RF getRf() {
		return rf;
	}

	/**
	 * Set the contains the details related to HRPD RF
	 *
	 * @param rf the input value
	 */
	public void  setRf(RF rf) {
		this.rf = rf;
	}

	/**
	 * Set the contains the details related to HRPD RF
	 *
	 * @param rf the input value
	 * @return this instance
	 */
	public RAN withRf(RF rf) {
		this.rf = rf;
		return this;
	}

	//</editor-fold>

}