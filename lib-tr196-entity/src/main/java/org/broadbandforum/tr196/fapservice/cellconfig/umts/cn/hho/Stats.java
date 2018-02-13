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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.hho;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides the HHO statistics as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.HHO.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "FAPService.CellConfig.UMTS.CN.HHO.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This measurement provides the number of successful HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "SuccHnbUmtsIntraFreq")
	@CWMPParameter(activeNotify = "canDeny")
	public Long succHnbUmtsIntraFreq;
	/**
	 * This measurement provides the number of attempted HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AttHnbUmtsIntraFreq")
	@CWMPParameter(activeNotify = "canDeny")
	public Long attHnbUmtsIntraFreq;
	/**
	 * This measurement provides the number of attempted HNB to UMTS macro cell inter frequency hard handovers.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AttHnbUmtsInterFreq")
	@CWMPParameter(activeNotify = "canDeny")
	public Long attHnbUmtsInterFreq;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the number of successful HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getSuccHnbUmtsIntraFreq() {
		return succHnbUmtsIntraFreq;
	}

	/**
	 * Set the this measurement provides the number of successful HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 * @param succHnbUmtsIntraFreq the input value
	 */
	public void  setSuccHnbUmtsIntraFreq(Long succHnbUmtsIntraFreq) {
		this.succHnbUmtsIntraFreq = succHnbUmtsIntraFreq;
	}

	/**
	 * Set the this measurement provides the number of successful HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 * @param succHnbUmtsIntraFreq the input value
	 * @return this instance
	 */
	public Stats withSuccHnbUmtsIntraFreq(Long succHnbUmtsIntraFreq) {
		this.succHnbUmtsIntraFreq = succHnbUmtsIntraFreq;
		return this;
	}

	/**
	 * Get the this measurement provides the number of attempted HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getAttHnbUmtsIntraFreq() {
		return attHnbUmtsIntraFreq;
	}

	/**
	 * Set the this measurement provides the number of attempted HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 * @param attHnbUmtsIntraFreq the input value
	 */
	public void  setAttHnbUmtsIntraFreq(Long attHnbUmtsIntraFreq) {
		this.attHnbUmtsIntraFreq = attHnbUmtsIntraFreq;
	}

	/**
	 * Set the this measurement provides the number of attempted HNB to UMTS macro cell intra frequency hard handovers.
	 *
	 * @since 2.1
	 * @param attHnbUmtsIntraFreq the input value
	 * @return this instance
	 */
	public Stats withAttHnbUmtsIntraFreq(Long attHnbUmtsIntraFreq) {
		this.attHnbUmtsIntraFreq = attHnbUmtsIntraFreq;
		return this;
	}

	/**
	 * Get the this measurement provides the number of attempted HNB to UMTS macro cell inter frequency hard handovers.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getAttHnbUmtsInterFreq() {
		return attHnbUmtsInterFreq;
	}

	/**
	 * Set the this measurement provides the number of attempted HNB to UMTS macro cell inter frequency hard handovers.
	 *
	 * @since 2.1
	 * @param attHnbUmtsInterFreq the input value
	 */
	public void  setAttHnbUmtsInterFreq(Long attHnbUmtsInterFreq) {
		this.attHnbUmtsInterFreq = attHnbUmtsInterFreq;
	}

	/**
	 * Set the this measurement provides the number of attempted HNB to UMTS macro cell inter frequency hard handovers.
	 *
	 * @since 2.1
	 * @param attHnbUmtsInterFreq the input value
	 * @return this instance
	 */
	public Stats withAttHnbUmtsInterFreq(Long attHnbUmtsInterFreq) {
		this.attHnbUmtsInterFreq = attHnbUmtsInterFreq;
		return this;
	}

	//</editor-fold>

}