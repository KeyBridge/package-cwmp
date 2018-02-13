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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.csdomain.rab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object provides the RAB statistics in the CS Domain as defined in {{bibref|3GPP-TS.32.452}}.
	 *
	 * @since 2.1
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.CSDomain.RAB.Stats.")
@XmlRootElement(name = "Stats")
@XmlType(name = "FAPService.CellConfig.UMTS.CN.CSDomain.RAB.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * This measurement provides the total number of requested RABs in establishment attempts.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "AttEstabCS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long attEstabCS;
	/**
	 * This measurement provides the number of RABs establishment failures for the CS domain.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "FailEstabCS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long failEstabCS;
	/**
	 * This measurement provides the number of successfully established RABs for the CS domain.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "SuccEstabCS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long succEstabCS;
	/**
	 * This measurement provides the total number of dropped RAB connections for service type CS Domain.
	 *
	 * @since 2.1
	 */
	@XmlElement(name = "RelDropCS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long relDropCS;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this measurement provides the total number of requested RABs in establishment attempts.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getAttEstabCS() {
		return attEstabCS;
	}

	/**
	 * Set the this measurement provides the total number of requested RABs in establishment attempts.
	 *
	 * @since 2.1
	 * @param attEstabCS the input value
	 */
	public void  setAttEstabCS(Long attEstabCS) {
		this.attEstabCS = attEstabCS;
	}

	/**
	 * Set the this measurement provides the total number of requested RABs in establishment attempts.
	 *
	 * @since 2.1
	 * @param attEstabCS the input value
	 * @return this instance
	 */
	public Stats withAttEstabCS(Long attEstabCS) {
		this.attEstabCS = attEstabCS;
		return this;
	}

	/**
	 * Get the this measurement provides the number of RABs establishment failures for the CS domain.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getFailEstabCS() {
		return failEstabCS;
	}

	/**
	 * Set the this measurement provides the number of RABs establishment failures for the CS domain.
	 *
	 * @since 2.1
	 * @param failEstabCS the input value
	 */
	public void  setFailEstabCS(Long failEstabCS) {
		this.failEstabCS = failEstabCS;
	}

	/**
	 * Set the this measurement provides the number of RABs establishment failures for the CS domain.
	 *
	 * @since 2.1
	 * @param failEstabCS the input value
	 * @return this instance
	 */
	public Stats withFailEstabCS(Long failEstabCS) {
		this.failEstabCS = failEstabCS;
		return this;
	}

	/**
	 * Get the this measurement provides the number of successfully established RABs for the CS domain.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getSuccEstabCS() {
		return succEstabCS;
	}

	/**
	 * Set the this measurement provides the number of successfully established RABs for the CS domain.
	 *
	 * @since 2.1
	 * @param succEstabCS the input value
	 */
	public void  setSuccEstabCS(Long succEstabCS) {
		this.succEstabCS = succEstabCS;
	}

	/**
	 * Set the this measurement provides the number of successfully established RABs for the CS domain.
	 *
	 * @since 2.1
	 * @param succEstabCS the input value
	 * @return this instance
	 */
	public Stats withSuccEstabCS(Long succEstabCS) {
		this.succEstabCS = succEstabCS;
		return this;
	}

	/**
	 * Get the this measurement provides the total number of dropped RAB connections for service type CS Domain.
	 *
	 * @since 2.1
	 * @return the value
	 */
	public Long getRelDropCS() {
		return relDropCS;
	}

	/**
	 * Set the this measurement provides the total number of dropped RAB connections for service type CS Domain.
	 *
	 * @since 2.1
	 * @param relDropCS the input value
	 */
	public void  setRelDropCS(Long relDropCS) {
		this.relDropCS = relDropCS;
	}

	/**
	 * Set the this measurement provides the total number of dropped RAB connections for service type CS Domain.
	 *
	 * @since 2.1
	 * @param relDropCS the input value
	 * @return this instance
	 */
	public Stats withRelDropCS(Long relDropCS) {
		this.relDropCS = relDropCS;
		return this;
	}

	//</editor-fold>

}