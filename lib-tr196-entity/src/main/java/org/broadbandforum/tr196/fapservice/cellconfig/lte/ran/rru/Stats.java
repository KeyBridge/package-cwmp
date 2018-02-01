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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.rru;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides the RRU statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.RRU.Stats.")
public class Stats {

	/**
	 * This measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the downlink for any purpose.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PrbTotDl")
	@CWMPParameter(activeNotify = "canDeny", units = "percentage")
	@Size(min = 0, max = 100)
	public Long prbTotDl;
	/**
	 * This measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the uplink for any purpose.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "PrbTotUl")
	@CWMPParameter(activeNotify = "canDeny", units = "percentage")
	@Size(min = 0, max = 100)
	public Long prbTotUl;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the downlink for any purpose.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getPrbTotDl() {
		return prbTotDl;
	}

	/**
	 * Set the this measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the downlink for any purpose.
	 *
	 * @since 2.1
	 * @param prbTotDl the input value
	 */
	public void  setPrbTotDl(Long prbTotDl) {
		this.prbTotDl = prbTotDl;
	}

	/**
	 * Set the this measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the downlink for any purpose.
	 *
	 * @since 2.1
	 * @param prbTotDl the input value
	 * @return this instance
	 */
	public Stats withPrbTotDl(Long prbTotDl) {
		this.prbTotDl = prbTotDl;
		return this;
	}

	/**
	 * Get the this measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the uplink for any purpose.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getPrbTotUl() {
		return prbTotUl;
	}

	/**
	 * Set the this measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the uplink for any purpose.
	 *
	 * @since 2.1
	 * @param prbTotUl the input value
	 */
	public void  setPrbTotUl(Long prbTotUl) {
		this.prbTotUl = prbTotUl;
	}

	/**
	 * Set the this measurement provides the total usage, in percentage, of physical resource blocks (PRBs) on the uplink for any purpose.
	 *
	 * @since 2.1
	 * @param prbTotUl the input value
	 * @return this instance
	 */
	public Stats withPrbTotUl(Long prbTotUl) {
		this.prbTotUl = prbTotUl;
		return this;
	}

	//</editor-fold>

}