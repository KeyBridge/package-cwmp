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
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.csg.Stats;

	/**
	 * This object provides monitoring of Closed Subscriber Groups (CSG) in the HeNB.
	 *
	 * @since TR196 v2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.CSG.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.CSG")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.CSG")
@XmlAccessorType(XmlAccessType.FIELD)
public class CSG {

	/**
	 * This object provides the LTE RAN CSG statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public CSG() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object provides the LTE RAN CSG statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object provides the LTE RAN CSG statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object provides the LTE RAN CSG statistics as defined in {{bibref|3GPP-TS.32.453}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public CSG withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}