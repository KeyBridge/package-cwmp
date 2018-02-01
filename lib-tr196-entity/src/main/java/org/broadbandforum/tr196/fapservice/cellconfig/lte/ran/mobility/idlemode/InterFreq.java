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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.interfreq.Carrier;

	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-freq re-selection scenario .
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.")
public class InterFreq {

	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCarrierEntries")
	public Long maxCarrierEntries;
	/**
	 * This object contains parameters relating to the carrier information for inter-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.3}}).
	 */
	@XmlElementWrapper(name = "Carriers")
	@XmlElement(name = "Carrier")
	@CWMPParameter(access = "readWrite")
	public Collection<Carrier> carriers;

	public InterFreq() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxCarrierEntries() {
		return maxCarrierEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCarrierEntries the input value
	 */
	public void  setMaxCarrierEntries(Long maxCarrierEntries) {
		this.maxCarrierEntries = maxCarrierEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCarrierEntries the input value
	 * @return this instance
	 */
	public InterFreq withMaxCarrierEntries(Long maxCarrierEntries) {
		this.maxCarrierEntries = maxCarrierEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the carrier information for inter-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.3}}).
	 *
	 * @return the value
	 */
	public Collection<Carrier> getCarriers() {
		if (this.carriers == null){ this.carriers=new ArrayList<>();}
		return carriers;
	}

	/**
	 * Set the this object contains parameters relating to the carrier information for inter-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.3}}).
	 *
	 * @param carriers the input value
	 */
	public void  setCarriers(Collection<Carrier> carriers) {
		this.carriers = carriers;
	}

	/**
	 * Set the this object contains parameters relating to the carrier information for inter-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.3}}).
	 *
	 * @param carrier the input value
	 * @return this instance
	 */
	public InterFreq withCarrier(Carrier carrier) {
		getCarriers().add(carrier);
		return this;
	}

	//</editor-fold>

}