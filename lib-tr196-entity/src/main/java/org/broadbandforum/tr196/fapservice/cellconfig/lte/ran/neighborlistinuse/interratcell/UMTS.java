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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse.interratcell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table containing the inter-RAT cell list for UTRA (UMTS) cell.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.UMTS.{i}.")
@XmlRootElement(name = "UMTS")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.UMTS")
@XmlAccessorType(XmlAccessType.FIELD)
public class UMTS {

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
	 * RNC-ID of an intra-RAT UMTS neighbor cell. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RNCID")
	@Size(min = 0, max = 65535)
	public Long rncID;
	/**
	 * Cell Identifier (C-id) that identifies a cell within an RNS. This Cell Identifier together with the controlling RNC (RNC-ID) constitutes the UTRAN Cell ID (UC-ID) and is used to identify a cell uniquely within UTRAN. C-ID is either 12-bit or 16-bit value. {{bibref|3GPP-TS.25.401|Section 6.1.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CID")
	@Size(min = 1, max = 65535)
	public Long cid;
	/**
	 * Location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI).

{{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LAC")
	@Size(min = 0, max = 65535)
	public Long lac;
	/**
	 * Routing Area Code (RAC). The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI).

{{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RAC")
	@Size(min = 0, max = 255)
	public Long rac;
	/**
	 * UTRAN Registration Area (URA) {{bibref|3GPP-TS.23.401}}.

Indicates to the UE which {{param}} it shall use in case of overlapping URAs.

{{bibref|3GPP-TS.25.331|Section 10.3.2.6}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "URA")
	@Size(min = 0, max = 65535)
	public Long ura;
	/**
	 * The UL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNUL")
	@Size(min = 0, max = 16383)
	public Long uarFCNUL;
	/**
	 * The DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNDL")
	@Size(min = 0, max = 16383)
	public Long uarFCNDL;
	/**
	 * Primary CPICH scrambling code.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHScramblingCode")
	@Size(min = 0, max = 511)
	public Long pcpICHScramblingCode;
	/**
	 * Primary CPICH Tx power in dBm.

Actual values of the power are -10.0 dBm to 50.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the power.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 2.2.33}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHTxPower")
	@Size(min = -100, max = 500)
	public Integer pcpICHTxPower;

	public UMTS() {
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
	public UMTS withPlmNID(String plmNID) {
		this.plmNID = plmNID;
		return this;
	}

	/**
	 * Get the rnc-ID of an intra-RAT UMTS neighbor cell. It uniquely identifies an RNC within a PLMN.

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
	 * Set the rnc-ID of an intra-RAT UMTS neighbor cell. It uniquely identifies an RNC within a PLMN.

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
	 * Set the rnc-ID of an intra-RAT UMTS neighbor cell. It uniquely identifies an RNC within a PLMN.

Normally, RNC-ID consists of 12 bits (i.e. a range of [0:4095]). However, if the value is larger than 4095, then Extended RNC-ID (range of [4096:65535]) is used in RANAP.

The RNC-ID and Extended RNC-ID are combined into a single parameter here as there is no explicit need to have them separated.

{{bibref|3GPP-TS.25.413|Section 9.2.1.39}}
	 *
	 * @since 2.0
	 * @param rncID the input value
	 * @return this instance
	 */
	public UMTS withRncID(Long rncID) {
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
	public UMTS withCid(Long cid) {
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
	public UMTS withLac(Long lac) {
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
	public UMTS withRac(Long rac) {
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
	public UMTS withUra(Long ura) {
		this.ura = ura;
		return this;
	}

	/**
	 * Get the UL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUarFCNUL() {
		return uarFCNUL;
	}

	/**
	 * Set the UL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @param uarFCNUL the input value
	 */
	public void  setUarFCNUL(Long uarFCNUL) {
		this.uarFCNUL = uarFCNUL;
	}

	/**
	 * Set the UL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @param uarFCNUL the input value
	 * @return this instance
	 */
	public UMTS withUarFCNUL(Long uarFCNUL) {
		this.uarFCNUL = uarFCNUL;
		return this;
	}

	/**
	 * Get the DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUarFCNDL() {
		return uarFCNDL;
	}

	/**
	 * Set the DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @param uarFCNDL the input value
	 */
	public void  setUarFCNDL(Long uarFCNDL) {
		this.uarFCNDL = uarFCNDL;
	}

	/**
	 * Set the DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @param uarFCNDL the input value
	 * @return this instance
	 */
	public UMTS withUarFCNDL(Long uarFCNDL) {
		this.uarFCNDL = uarFCNDL;
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
	public UMTS withPcpICHScramblingCode(Long pcpICHScramblingCode) {
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
	public UMTS withPcpICHTxPower(Integer pcpICHTxPower) {
		this.pcpICHTxPower = pcpICHTxPower;
		return this;
	}

	//</editor-fold>

}