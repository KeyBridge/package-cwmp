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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table containing the LTE EUTRA (i.e. intra-RAT) cell list.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.LTECell.{i}.")
public class LTECell {

	/**
	 * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNID")
	@Size(max = 6)
	public String plmNID;
	/**
	 * Cell Identity. {{bibref|3GPP-TS.36.331|Section 6.3.4}}. Combination of {{param|PLMNID}} and {{param}} constitutes the Cell Global ID (CGI).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CID")
	@Size(min = 1, max = 268435455)
	public Long cid;
	/**
	 * Indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and  and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}. If the value of {{param}} is the same with the one currently being used by the, then it implies that this neighbor cell is an intra-frequency cell; otherwise, it is an inter-frequency cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EUTRACarrierARFCN")
	@Size(min = 0, max = 65535)
	public Long eutRACarrierARFCN;
	/**
	 * Physical cell ID, as specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhyCellID")
	@Size(min = 0, max = 503)
	public Long phyCellID;
	/**
	 * Indicate a cell-specific offset applicable to a specific neighbouring cell. It is used for evaluating the cell as a candidate for cell re-selection in idle mode.

Corresponds to parameter q-OffsetCell broadcast in SIB4 for intra-frequency cells and in SIB5 for inter-frequency cells, specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QOffset")
	@Size(min = 8, max = 24)
	public Integer qoffset;
	/**
	 * Cell individual offset applicable to a specific neighbouring cell. It is used for evaluating triggering conditions for measurement reporting in connected mode.

Specified by cellIndividualOffset in MeasObjectEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CIO")
	@Size(min = 8, max = 24)
	public Integer cio;
	/**
	 * The downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSTxPower")
	@Size(min = -60, max = 50)
	public Integer rstxPower;
	/**
	 * Indicates whether this neighbor cell is allowed for UEs as handover target or not. If {{true}}, handover is prohibited towards this cell. If {{false}}, handover is allowed toward this cell. The {{param}} parameter allows this cell to be prohibited as a handover target, while still allowing this cell to be included in the BCCH SIB4 or 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Blacklisted")
	public Boolean blacklisted;

	public LTECell() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPlmNID() {
		return plmNID;
	}

	/**
	 * Set the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 */
	public void  setPlmNID(String plmNID) {
		this.plmNID = plmNID;
	}

	/**
	 * Set the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 * @return this instance
	 */
	public LTECell withPlmNID(String plmNID) {
		this.plmNID = plmNID;
		return this;
	}

	/**
	 * Get the cell Identity. {{bibref|3GPP-TS.36.331|Section 6.3.4}}. Combination of {{param|PLMNID}} and {{param}} constitutes the Cell Global ID (CGI).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCid() {
		return cid;
	}

	/**
	 * Set the cell Identity. {{bibref|3GPP-TS.36.331|Section 6.3.4}}. Combination of {{param|PLMNID}} and {{param}} constitutes the Cell Global ID (CGI).
	 *
	 * @since 2.0
	 * @param cid the input value
	 */
	public void  setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * Set the cell Identity. {{bibref|3GPP-TS.36.331|Section 6.3.4}}. Combination of {{param|PLMNID}} and {{param}} constitutes the Cell Global ID (CGI).
	 *
	 * @since 2.0
	 * @param cid the input value
	 * @return this instance
	 */
	public LTECell withCid(Long cid) {
		this.cid = cid;
		return this;
	}

	/**
	 * Get the indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and  and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}. If the value of {{param}} is the same with the one currently being used by the, then it implies that this neighbor cell is an intra-frequency cell; otherwise, it is an inter-frequency cell.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEutRACarrierARFCN() {
		return eutRACarrierARFCN;
	}

	/**
	 * Set the indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and  and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}. If the value of {{param}} is the same with the one currently being used by the, then it implies that this neighbor cell is an intra-frequency cell; otherwise, it is an inter-frequency cell.
	 *
	 * @since 2.0
	 * @param eutRACarrierARFCN the input value
	 */
	public void  setEutRACarrierARFCN(Long eutRACarrierARFCN) {
		this.eutRACarrierARFCN = eutRACarrierARFCN;
	}

	/**
	 * Set the indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and  and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}. If the value of {{param}} is the same with the one currently being used by the, then it implies that this neighbor cell is an intra-frequency cell; otherwise, it is an inter-frequency cell.
	 *
	 * @since 2.0
	 * @param eutRACarrierARFCN the input value
	 * @return this instance
	 */
	public LTECell withEutRACarrierARFCN(Long eutRACarrierARFCN) {
		this.eutRACarrierARFCN = eutRACarrierARFCN;
		return this;
	}

	/**
	 * Get the physical cell ID, as specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyCellID() {
		return phyCellID;
	}

	/**
	 * Set the physical cell ID, as specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.
	 *
	 * @since 2.0
	 * @param phyCellID the input value
	 */
	public void  setPhyCellID(Long phyCellID) {
		this.phyCellID = phyCellID;
	}

	/**
	 * Set the physical cell ID, as specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.
	 *
	 * @since 2.0
	 * @param phyCellID the input value
	 * @return this instance
	 */
	public LTECell withPhyCellID(Long phyCellID) {
		this.phyCellID = phyCellID;
		return this;
	}

	/**
	 * Get the indicate a cell-specific offset applicable to a specific neighbouring cell. It is used for evaluating the cell as a candidate for cell re-selection in idle mode.

Corresponds to parameter q-OffsetCell broadcast in SIB4 for intra-frequency cells and in SIB5 for inter-frequency cells, specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getQoffset() {
		return qoffset;
	}

	/**
	 * Set the indicate a cell-specific offset applicable to a specific neighbouring cell. It is used for evaluating the cell as a candidate for cell re-selection in idle mode.

Corresponds to parameter q-OffsetCell broadcast in SIB4 for intra-frequency cells and in SIB5 for inter-frequency cells, specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param qoffset the input value
	 */
	public void  setQoffset(Integer qoffset) {
		this.qoffset = qoffset;
	}

	/**
	 * Set the indicate a cell-specific offset applicable to a specific neighbouring cell. It is used for evaluating the cell as a candidate for cell re-selection in idle mode.

Corresponds to parameter q-OffsetCell broadcast in SIB4 for intra-frequency cells and in SIB5 for inter-frequency cells, specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param qoffset the input value
	 * @return this instance
	 */
	public LTECell withQoffset(Integer qoffset) {
		this.qoffset = qoffset;
		return this;
	}

	/**
	 * Get the cell individual offset applicable to a specific neighbouring cell. It is used for evaluating triggering conditions for measurement reporting in connected mode.

Specified by cellIndividualOffset in MeasObjectEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getCio() {
		return cio;
	}

	/**
	 * Set the cell individual offset applicable to a specific neighbouring cell. It is used for evaluating triggering conditions for measurement reporting in connected mode.

Specified by cellIndividualOffset in MeasObjectEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param cio the input value
	 */
	public void  setCio(Integer cio) {
		this.cio = cio;
	}

	/**
	 * Set the cell individual offset applicable to a specific neighbouring cell. It is used for evaluating triggering conditions for measurement reporting in connected mode.

Specified by cellIndividualOffset in MeasObjectEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param cio the input value
	 * @return this instance
	 */
	public LTECell withCio(Integer cio) {
		this.cio = cio;
		return this;
	}

	/**
	 * Get the downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRstxPower() {
		return rstxPower;
	}

	/**
	 * Set the downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param rstxPower the input value
	 */
	public void  setRstxPower(Integer rstxPower) {
		this.rstxPower = rstxPower;
	}

	/**
	 * Set the downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param rstxPower the input value
	 * @return this instance
	 */
	public LTECell withRstxPower(Integer rstxPower) {
		this.rstxPower = rstxPower;
		return this;
	}

	/**
	 * Get the indicates whether this neighbor cell is allowed for UEs as handover target or not. If {{true}}, handover is prohibited towards this cell. If {{false}}, handover is allowed toward this cell. The {{param}} parameter allows this cell to be prohibited as a handover target, while still allowing this cell to be included in the BCCH SIB4 or 5.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isBlacklisted() {
		return blacklisted;
	}

	/**
	 * Set the indicates whether this neighbor cell is allowed for UEs as handover target or not. If {{true}}, handover is prohibited towards this cell. If {{false}}, handover is allowed toward this cell. The {{param}} parameter allows this cell to be prohibited as a handover target, while still allowing this cell to be included in the BCCH SIB4 or 5.
	 *
	 * @since 2.0
	 * @param blacklisted the input value
	 */
	public void  setBlacklisted(Boolean blacklisted) {
		this.blacklisted = blacklisted;
	}

	/**
	 * Set the indicates whether this neighbor cell is allowed for UEs as handover target or not. If {{true}}, handover is prohibited towards this cell. If {{false}}, handover is allowed toward this cell. The {{param}} parameter allows this cell to be prohibited as a handover target, while still allowing this cell to be included in the BCCH SIB4 or 5.
	 *
	 * @since 2.0
	 * @param blacklisted the input value
	 * @return this instance
	 */
	public LTECell withBlacklisted(Boolean blacklisted) {
		this.blacklisted = blacklisted;
		return this;
	}

	//</editor-fold>

}