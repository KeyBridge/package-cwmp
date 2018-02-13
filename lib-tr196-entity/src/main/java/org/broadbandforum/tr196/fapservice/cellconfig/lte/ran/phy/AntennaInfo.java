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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains parameters relating to the antenna configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.1}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.AntennaInfo.")
@XmlRootElement(name = "AntennaInfo")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.AntennaInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class AntennaInfo {

	/**
	 * Defines the number of cell specific antenna ports according to {{bibref|3GPP-TS.36.211|Section 6.2.1}}. A UE in IDLE mode acquires the information about the number of transmit antenna ports according to {{bibref|3GPP-TS.36.212|Section 5.3.1.1}}. Corresponds to antennaPortsCount IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AntennaPortsCount")
	@Size(min = 4, max = 4)
	public Long antennaPortsCount;

	public AntennaInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the number of cell specific antenna ports according to {{bibref|3GPP-TS.36.211|Section 6.2.1}}. A UE in IDLE mode acquires the information about the number of transmit antenna ports according to {{bibref|3GPP-TS.36.212|Section 5.3.1.1}}. Corresponds to antennaPortsCount IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAntennaPortsCount() {
		return antennaPortsCount;
	}

	/**
	 * Set the defines the number of cell specific antenna ports according to {{bibref|3GPP-TS.36.211|Section 6.2.1}}. A UE in IDLE mode acquires the information about the number of transmit antenna ports according to {{bibref|3GPP-TS.36.212|Section 5.3.1.1}}. Corresponds to antennaPortsCount IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param antennaPortsCount the input value
	 */
	public void  setAntennaPortsCount(Long antennaPortsCount) {
		this.antennaPortsCount = antennaPortsCount;
	}

	/**
	 * Set the defines the number of cell specific antenna ports according to {{bibref|3GPP-TS.36.211|Section 6.2.1}}. A UE in IDLE mode acquires the information about the number of transmit antenna ports according to {{bibref|3GPP-TS.36.212|Section 5.3.1.1}}. Corresponds to antennaPortsCount IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param antennaPortsCount the input value
	 * @return this instance
	 */
	public AntennaInfo withAntennaPortsCount(Long antennaPortsCount) {
		this.antennaPortsCount = antennaPortsCount;
		return this;
	}

	//</editor-fold>

}