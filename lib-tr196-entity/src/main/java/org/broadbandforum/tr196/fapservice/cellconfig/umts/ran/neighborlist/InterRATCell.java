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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.neighborlist;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.neighborlist.interratcell.GSM;

	/**
	 * The inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.25.331|Section 10.3.7.23}}
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.InterRATCell.")
public class InterRATCell {

	/**
	 * The maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.GSM.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxGSMEntries")
	public Long maxGSMEntries;
	/**
	 * Table containing the inter-RAT cell list for GSM provided by the ACS. The table contents MAY be added/deleted/modified during operation, in which case these changes shall be reflected in the broadcast information as soon as possible.
	 */
	@XmlElementWrapper(name = "GSMs")
	@XmlElement(name = "GSM")
	@CWMPParameter(access = "readWrite")
	public Collection<GSM> gsms;

	public InterRATCell() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.GSM.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxGSMEntries() {
		return maxGSMEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.GSM.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxGSMEntries the input value
	 */
	public void  setMaxGSMEntries(Long maxGSMEntries) {
		this.maxGSMEntries = maxGSMEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.GSM.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxGSMEntries the input value
	 * @return this instance
	 */
	public InterRATCell withMaxGSMEntries(Long maxGSMEntries) {
		this.maxGSMEntries = maxGSMEntries;
		return this;
	}

	/**
	 * Get the table containing the inter-RAT cell list for GSM provided by the ACS. The table contents MAY be added/deleted/modified during operation, in which case these changes shall be reflected in the broadcast information as soon as possible.
	 *
	 * @return the value
	 */
	public Collection<GSM> getGsms() {
		if (this.gsms == null){ this.gsms=new ArrayList<>();}
		return gsms;
	}

	/**
	 * Set the table containing the inter-RAT cell list for GSM provided by the ACS. The table contents MAY be added/deleted/modified during operation, in which case these changes shall be reflected in the broadcast information as soon as possible.
	 *
	 * @param gsms the input value
	 */
	public void  setGsms(Collection<GSM> gsms) {
		this.gsms = gsms;
	}

	/**
	 * Set the table containing the inter-RAT cell list for GSM provided by the ACS. The table contents MAY be added/deleted/modified during operation, in which case these changes shall be reflected in the broadcast information as soon as possible.
	 *
	 * @param gsm the input value
	 * @return this instance
	 */
	public InterRATCell withGSM(GSM gsm) {
		getGsms().add(gsm);
		return this;
	}

	//</editor-fold>

}