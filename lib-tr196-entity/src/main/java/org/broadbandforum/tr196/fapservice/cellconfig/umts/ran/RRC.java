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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.rrc.Stats;

	/**
	 * This object provides monitoring of the RRC in the HNB.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.RRC.")
@XmlRootElement(name = "RRC")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.RRC")
@XmlAccessorType(XmlAccessType.FIELD)
public class RRC {

	/**
	 * This object provides the RRC statistics as defined in {{bibref|3GPP-TS.32.452}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public RRC() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object provides the RRC statistics as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object provides the RRC statistics as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object provides the RRC statistics as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public RRC withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}