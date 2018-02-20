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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse.interratcell.CDMA2000;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse.interratcell.GSM;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse.interratcell.UMTS;

	/**
	 * Table containing the inter-RAT cell lists separated by technology. {{bibref|3GPP-TS.36.331|Section 6.3.1 (SIB6, 7, 8)}}.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell")
@XmlAccessorType(XmlAccessType.FIELD)
public class InterRATCell {

	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.UMTS.{i}.}} table. There can be maximum of 16 UTRAN (UMTS) neighbor cells, as specified by carrierFreqListUTRA-FDD in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxUMTSEntries")
	public Long maxUMTSEntries;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM.{i}.}} table. There can be maximum of 16 GERAN (GSM) neighbor cells, as specified by carrierFreqsInfoList in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxGSMEntries")
	public Long maxGSMEntries;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000.{i}.}} table. There can be maximum of 32 banclasses. In each bandclass, there can be maximum of 16 CDMA2000 carrier frequencies. In each carrier, there can be maximum of 16 CDMA2000 neighbor cells (PN offset). It is specified by neighCellList in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCDMA2000Entries")
	public Long maxCDMA2000Entries;
	/**
	 * Table containing the inter-RAT cell list for UTRA (UMTS) cell.
	 */
	@XmlElementWrapper(name = "UMTSs")
	@XmlElement(name = "UMTS")
	public Collection<UMTS> umtSs;
	/**
	 * Table containing the inter-RAT cell list for GERAN (GSM) cell.
	 */
	@XmlElementWrapper(name = "GSMs")
	@XmlElement(name = "GSM")
	public Collection<GSM> gsms;
	/**
	 * Table containing the inter-RAT cell list for CDMA2000 cell.
	 */
	@XmlElementWrapper(name = "CDMA2000s")
	@XmlElement(name = "CDMA2000")
	public Collection<CDMA2000> cdmA2000s;

	public InterRATCell() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.UMTS.{i}.}} table. There can be maximum of 16 UTRAN (UMTS) neighbor cells, as specified by carrierFreqListUTRA-FDD in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxUMTSEntries() {
		return maxUMTSEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.UMTS.{i}.}} table. There can be maximum of 16 UTRAN (UMTS) neighbor cells, as specified by carrierFreqListUTRA-FDD in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param maxUMTSEntries the input value
	 */
	public void  setMaxUMTSEntries(Long maxUMTSEntries) {
		this.maxUMTSEntries = maxUMTSEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.UMTS.{i}.}} table. There can be maximum of 16 UTRAN (UMTS) neighbor cells, as specified by carrierFreqListUTRA-FDD in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param maxUMTSEntries the input value
	 * @return this instance
	 */
	public InterRATCell withMaxUMTSEntries(Long maxUMTSEntries) {
		this.maxUMTSEntries = maxUMTSEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM.{i}.}} table. There can be maximum of 16 GERAN (GSM) neighbor cells, as specified by carrierFreqsInfoList in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxGSMEntries() {
		return maxGSMEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM.{i}.}} table. There can be maximum of 16 GERAN (GSM) neighbor cells, as specified by carrierFreqsInfoList in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param maxGSMEntries the input value
	 */
	public void  setMaxGSMEntries(Long maxGSMEntries) {
		this.maxGSMEntries = maxGSMEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM.{i}.}} table. There can be maximum of 16 GERAN (GSM) neighbor cells, as specified by carrierFreqsInfoList in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
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
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000.{i}.}} table. There can be maximum of 32 banclasses. In each bandclass, there can be maximum of 16 CDMA2000 carrier frequencies. In each carrier, there can be maximum of 16 CDMA2000 neighbor cells (PN offset). It is specified by neighCellList in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxCDMA2000Entries() {
		return maxCDMA2000Entries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000.{i}.}} table. There can be maximum of 32 banclasses. In each bandclass, there can be maximum of 16 CDMA2000 carrier frequencies. In each carrier, there can be maximum of 16 CDMA2000 neighbor cells (PN offset). It is specified by neighCellList in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param maxCDMA2000Entries the input value
	 */
	public void  setMaxCDMA2000Entries(Long maxCDMA2000Entries) {
		this.maxCDMA2000Entries = maxCDMA2000Entries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000.{i}.}} table. There can be maximum of 32 banclasses. In each bandclass, there can be maximum of 16 CDMA2000 carrier frequencies. In each carrier, there can be maximum of 16 CDMA2000 neighbor cells (PN offset). It is specified by neighCellList in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param maxCDMA2000Entries the input value
	 * @return this instance
	 */
	public InterRATCell withMaxCDMA2000Entries(Long maxCDMA2000Entries) {
		this.maxCDMA2000Entries = maxCDMA2000Entries;
		return this;
	}

	/**
	 * Get the table containing the inter-RAT cell list for UTRA (UMTS) cell.
	 *
	 * @return the value
	 */
	public Collection<UMTS> getUmtSs() {
		if (this.umtSs == null){ this.umtSs=new ArrayList<>();}
		return umtSs;
	}

	/**
	 * Set the table containing the inter-RAT cell list for UTRA (UMTS) cell.
	 *
	 * @param umtSs the input value
	 */
	public void  setUmtSs(Collection<UMTS> umtSs) {
		this.umtSs = umtSs;
	}

	/**
	 * Set the table containing the inter-RAT cell list for UTRA (UMTS) cell.
	 *
	 * @param umtS the input value
	 * @return this instance
	 */
	public InterRATCell withUMTS(UMTS umtS) {
		getUmtSs().add(umtS);
		return this;
	}

	/**
	 * Get the table containing the inter-RAT cell list for GERAN (GSM) cell.
	 *
	 * @return the value
	 */
	public Collection<GSM> getGsms() {
		if (this.gsms == null){ this.gsms=new ArrayList<>();}
		return gsms;
	}

	/**
	 * Set the table containing the inter-RAT cell list for GERAN (GSM) cell.
	 *
	 * @param gsms the input value
	 */
	public void  setGsms(Collection<GSM> gsms) {
		this.gsms = gsms;
	}

	/**
	 * Set the table containing the inter-RAT cell list for GERAN (GSM) cell.
	 *
	 * @param gsm the input value
	 * @return this instance
	 */
	public InterRATCell withGSM(GSM gsm) {
		getGsms().add(gsm);
		return this;
	}

	/**
	 * Get the table containing the inter-RAT cell list for CDMA2000 cell.
	 *
	 * @return the value
	 */
	public Collection<CDMA2000> getCdmA2000s() {
		if (this.cdmA2000s == null){ this.cdmA2000s=new ArrayList<>();}
		return cdmA2000s;
	}

	/**
	 * Set the table containing the inter-RAT cell list for CDMA2000 cell.
	 *
	 * @param cdmA2000s the input value
	 */
	public void  setCdmA2000s(Collection<CDMA2000> cdmA2000s) {
		this.cdmA2000s = cdmA2000s;
	}

	/**
	 * Set the table containing the inter-RAT cell list for CDMA2000 cell.
	 *
	 * @param cdmA2000 the input value
	 * @return this instance
	 */
	public InterRATCell withCDMA2000(CDMA2000 cdmA2000) {
		getCdmA2000s().add(cdmA2000);
		return this;
	}

	//</editor-fold>

}