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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;

	/**
	 * Table containing the intra-frequency cell list provided by the ACS. The table contents MAY be added/deleted/modified during operation, in which case these changes shall be reflected in the broadcast information as soon as possible.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.")
@XmlRootElement(name = "IntraFreqCell")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntraFreqCell {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Indicates whether this instance of the neighbor shall be included or excluded in the FAP's NL configuration.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MustInclude")
	@CWMPParameter(access = "readWrite")
	public Boolean mustInclude = false;
	/**
	 * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String plmNID;
	/**
	 * RNC-ID of an intra-freq neighbor cell. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RNCID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long rncID = 0L;
	/**
	 * Cell Identifier (C-id) that identifies a cell within an RNS. This Cell Identifier together with the controlling RNC (RNC-ID) constitutes the UTRAN Cell ID (UC-ID) and is used to identify a cell uniquely within UTRAN. C-ID is either 12-bit or 16-bit value. {{bibref|3GPP-TS.25.401|Section 6.1.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long cid;
	/**
	 * Location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI).

{{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LAC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long lac = 0L;
	/**
	 * Routing Area Code (RAC). The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI).

{{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RAC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long rac = 0L;
	/**
	 * UTRAN Registration Area (URA) {{bibref|3GPP-TS.23.401}}.

Indicates to the UE which {{param}} it shall use in case of overlapping URAs.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URA")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long ura = 0L;
	/**
	 * Primary CPICH scrambling code.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHScramblingCode")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 511)
	public Long pcpICHScramblingCode = 0L;
	/**
	 * Primary CPICH Tx power in dBm.

Actual values of the power are -10.0 dBm to 50.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the power.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 2.2.33}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHTxPower")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -100, max = 500)
	public Integer pcpICHTxPower = 0;
	/**
	 * Provides identity of collocated inter-frequency Cell. Needed for pathloss estimation, in case the femto environment masks intra-frequency neighbor.

Cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CollocatedInterFreqCell")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 268435455)
	public Long collocatedInterFreqCell;
	/**
	 * Cell Max Tx Power. Parameter needed in HNB power calibration, for protection of neighbour cells. Actual values of the power are -30.0 dBm to 60.0 dBm

in steps of 0.1 dB. The value of MaxTxPower

divided by 10 yields the actual value of the power.

C.f {{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxTxPower")
	@CWMPParameter(access = "readWrite", units = "0.1 dBm")
	@Size(min = -300, max = 600)
	public Integer maxTxPower = 0;
	/**
	 * Maximum DL DPCH Tx Power per UE configured in the cell (for CS UEs).

Parameter may be used by FAP to protect the DL budget allocated to neighbouring UEs served by neighbour cells.

C.f  (max 10 dB below max Tx power)

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}

Actual values of the power are -40.0 dBm to 50.0 dBm

in steps of 0.1 dB. The value of MaxDPCHtxPower

divided by 10 yields the actual value of the power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxDPCHtxPower")
	@CWMPParameter(access = "readWrite", units = "0.1 dBm")
	@Size(min = -400, max = 500)
	public Integer maxDPCHtxPower = 0;

	public IntraFreqCell() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public IntraFreqCell withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public IntraFreqCell withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates whether this instance of the neighbor shall be included or excluded in the FAP's NL configuration.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMustInclude() {
		return mustInclude;
	}

	/**
	 * Set the indicates whether this instance of the neighbor shall be included or excluded in the FAP's NL configuration.
	 *
	 * @since 2.0
	 * @param mustInclude the input value
	 */
	public void  setMustInclude(Boolean mustInclude) {
		this.mustInclude = mustInclude;
	}

	/**
	 * Set the indicates whether this instance of the neighbor shall be included or excluded in the FAP's NL configuration.
	 *
	 * @since 2.0
	 * @param mustInclude the input value
	 * @return this instance
	 */
	public IntraFreqCell withMustInclude(Boolean mustInclude) {
		this.mustInclude = mustInclude;
		return this;
	}

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
	public IntraFreqCell withPlmNID(String plmNID) {
		this.plmNID = plmNID;
		return this;
	}

	/**
	 * Get the rnc-ID of an intra-freq neighbor cell. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRncID() {
		return rncID;
	}

	/**
	 * Set the rnc-ID of an intra-freq neighbor cell. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 * @param rncID the input value
	 */
	public void  setRncID(Long rncID) {
		this.rncID = rncID;
	}

	/**
	 * Set the rnc-ID of an intra-freq neighbor cell. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 * @param rncID the input value
	 * @return this instance
	 */
	public IntraFreqCell withRncID(Long rncID) {
		this.rncID = rncID;
		return this;
	}

	/**
	 * Get the cell Identifier (C-id) that identifies a cell within an RNS. This Cell Identifier together with the controlling RNC (RNC-ID) constitutes the UTRAN Cell ID (UC-ID) and is used to identify a cell uniquely within UTRAN. C-ID is either 12-bit or 16-bit value. {{bibref|3GPP-TS.25.401|Section 6.1.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCid() {
		return cid;
	}

	/**
	 * Set the cell Identifier (C-id) that identifies a cell within an RNS. This Cell Identifier together with the controlling RNC (RNC-ID) constitutes the UTRAN Cell ID (UC-ID) and is used to identify a cell uniquely within UTRAN. C-ID is either 12-bit or 16-bit value. {{bibref|3GPP-TS.25.401|Section 6.1.5}}.
	 *
	 * @since 2.0
	 * @param cid the input value
	 */
	public void  setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * Set the cell Identifier (C-id) that identifies a cell within an RNS. This Cell Identifier together with the controlling RNC (RNC-ID) constitutes the UTRAN Cell ID (UC-ID) and is used to identify a cell uniquely within UTRAN. C-ID is either 12-bit or 16-bit value. {{bibref|3GPP-TS.25.401|Section 6.1.5}}.
	 *
	 * @since 2.0
	 * @param cid the input value
	 * @return this instance
	 */
	public IntraFreqCell withCid(Long cid) {
		this.cid = cid;
		return this;
	}

	/**
	 * Get the location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI).

{{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLac() {
		return lac;
	}

	/**
	 * Set the location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI).

{{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}
	 *
	 * @since 2.0
	 * @param lac the input value
	 */
	public void  setLac(Long lac) {
		this.lac = lac;
	}

	/**
	 * Set the location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI).

{{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}
	 *
	 * @since 2.0
	 * @param lac the input value
	 * @return this instance
	 */
	public IntraFreqCell withLac(Long lac) {
		this.lac = lac;
		return this;
	}

	/**
	 * Get the routing Area Code (RAC). The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI).

{{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRac() {
		return rac;
	}

	/**
	 * Set the routing Area Code (RAC). The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI).

{{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 * @param rac the input value
	 */
	public void  setRac(Long rac) {
		this.rac = rac;
	}

	/**
	 * Set the routing Area Code (RAC). The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI).

{{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 * @param rac the input value
	 * @return this instance
	 */
	public IntraFreqCell withRac(Long rac) {
		this.rac = rac;
		return this;
	}

	/**
	 * Get the utrAN Registration Area (URA) {{bibref|3GPP-TS.23.401}}.

Indicates to the UE which {{param}} it shall use in case of overlapping URAs.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUra() {
		return ura;
	}

	/**
	 * Set the utrAN Registration Area (URA) {{bibref|3GPP-TS.23.401}}.

Indicates to the UE which {{param}} it shall use in case of overlapping URAs.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 * @param ura the input value
	 */
	public void  setUra(Long ura) {
		this.ura = ura;
	}

	/**
	 * Set the utrAN Registration Area (URA) {{bibref|3GPP-TS.23.401}}.

Indicates to the UE which {{param}} it shall use in case of overlapping URAs.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 * @param ura the input value
	 * @return this instance
	 */
	public IntraFreqCell withUra(Long ura) {
		this.ura = ura;
		return this;
	}

	/**
	 * Get the primary CPICH scrambling code.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPcpICHScramblingCode() {
		return pcpICHScramblingCode;
	}

	/**
	 * Set the primary CPICH scrambling code.
	 *
	 * @since 2.0
	 * @param pcpICHScramblingCode the input value
	 */
	public void  setPcpICHScramblingCode(Long pcpICHScramblingCode) {
		this.pcpICHScramblingCode = pcpICHScramblingCode;
	}

	/**
	 * Set the primary CPICH scrambling code.
	 *
	 * @since 2.0
	 * @param pcpICHScramblingCode the input value
	 * @return this instance
	 */
	public IntraFreqCell withPcpICHScramblingCode(Long pcpICHScramblingCode) {
		this.pcpICHScramblingCode = pcpICHScramblingCode;
		return this;
	}

	/**
	 * Get the primary CPICH Tx power in dBm.

Actual values of the power are -10.0 dBm to 50.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the power.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 2.2.33}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPcpICHTxPower() {
		return pcpICHTxPower;
	}

	/**
	 * Set the primary CPICH Tx power in dBm.

Actual values of the power are -10.0 dBm to 50.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the power.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 2.2.33}}
	 *
	 * @since 2.0
	 * @param pcpICHTxPower the input value
	 */
	public void  setPcpICHTxPower(Integer pcpICHTxPower) {
		this.pcpICHTxPower = pcpICHTxPower;
	}

	/**
	 * Set the primary CPICH Tx power in dBm.

Actual values of the power are -10.0 dBm to 50.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the power.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 2.2.33}}
	 *
	 * @since 2.0
	 * @param pcpICHTxPower the input value
	 * @return this instance
	 */
	public IntraFreqCell withPcpICHTxPower(Integer pcpICHTxPower) {
		this.pcpICHTxPower = pcpICHTxPower;
		return this;
	}

	/**
	 * Get the provides identity of collocated inter-frequency Cell. Needed for pathloss estimation, in case the femto environment masks intra-frequency neighbor.

Cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCollocatedInterFreqCell() {
		return collocatedInterFreqCell;
	}

	/**
	 * Set the provides identity of collocated inter-frequency Cell. Needed for pathloss estimation, in case the femto environment masks intra-frequency neighbor.

Cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 * @param collocatedInterFreqCell the input value
	 */
	public void  setCollocatedInterFreqCell(Long collocatedInterFreqCell) {
		this.collocatedInterFreqCell = collocatedInterFreqCell;
	}

	/**
	 * Set the provides identity of collocated inter-frequency Cell. Needed for pathloss estimation, in case the femto environment masks intra-frequency neighbor.

Cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 * @param collocatedInterFreqCell the input value
	 * @return this instance
	 */
	public IntraFreqCell withCollocatedInterFreqCell(Long collocatedInterFreqCell) {
		this.collocatedInterFreqCell = collocatedInterFreqCell;
		return this;
	}

	/**
	 * Get the cell Max Tx Power. Parameter needed in HNB power calibration, for protection of neighbour cells. Actual values of the power are -30.0 dBm to 60.0 dBm

in steps of 0.1 dB. The value of MaxTxPower

divided by 10 yields the actual value of the power.

C.f {{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxTxPower() {
		return maxTxPower;
	}

	/**
	 * Set the cell Max Tx Power. Parameter needed in HNB power calibration, for protection of neighbour cells. Actual values of the power are -30.0 dBm to 60.0 dBm

in steps of 0.1 dB. The value of MaxTxPower

divided by 10 yields the actual value of the power.

C.f {{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @param maxTxPower the input value
	 */
	public void  setMaxTxPower(Integer maxTxPower) {
		this.maxTxPower = maxTxPower;
	}

	/**
	 * Set the cell Max Tx Power. Parameter needed in HNB power calibration, for protection of neighbour cells. Actual values of the power are -30.0 dBm to 60.0 dBm

in steps of 0.1 dB. The value of MaxTxPower

divided by 10 yields the actual value of the power.

C.f {{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @param maxTxPower the input value
	 * @return this instance
	 */
	public IntraFreqCell withMaxTxPower(Integer maxTxPower) {
		this.maxTxPower = maxTxPower;
		return this;
	}

	/**
	 * Get the maximum DL DPCH Tx Power per UE configured in the cell (for CS UEs).

Parameter may be used by FAP to protect the DL budget allocated to neighbouring UEs served by neighbour cells.

C.f  (max 10 dB below max Tx power)

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}

Actual values of the power are -40.0 dBm to 50.0 dBm

in steps of 0.1 dB. The value of MaxDPCHtxPower

divided by 10 yields the actual value of the power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxDPCHtxPower() {
		return maxDPCHtxPower;
	}

	/**
	 * Set the maximum DL DPCH Tx Power per UE configured in the cell (for CS UEs).

Parameter may be used by FAP to protect the DL budget allocated to neighbouring UEs served by neighbour cells.

C.f  (max 10 dB below max Tx power)

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}

Actual values of the power are -40.0 dBm to 50.0 dBm

in steps of 0.1 dB. The value of MaxDPCHtxPower

divided by 10 yields the actual value of the power.
	 *
	 * @since 2.0
	 * @param maxDPCHtxPower the input value
	 */
	public void  setMaxDPCHtxPower(Integer maxDPCHtxPower) {
		this.maxDPCHtxPower = maxDPCHtxPower;
	}

	/**
	 * Set the maximum DL DPCH Tx Power per UE configured in the cell (for CS UEs).

Parameter may be used by FAP to protect the DL budget allocated to neighbouring UEs served by neighbour cells.

C.f  (max 10 dB below max Tx power)

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}

Actual values of the power are -40.0 dBm to 50.0 dBm

in steps of 0.1 dB. The value of MaxDPCHtxPower

divided by 10 yields the actual value of the power.
	 *
	 * @since 2.0
	 * @param maxDPCHtxPower the input value
	 * @return this instance
	 */
	public IntraFreqCell withMaxDPCHtxPower(Integer maxDPCHtxPower) {
		this.maxDPCHtxPower = maxDPCHtxPower;
		return this;
	}

	//</editor-fold>

}