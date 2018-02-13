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
	 * Table containing the inter-RAT cell list for GERAN (GSM) cell.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.GSM")
@XmlAccessorType(XmlAccessType.FIELD)
public class GSM {

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
	 * Location Area Code (LAC). The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI).

{{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LAC")
	@Size(min = 0, max = 65535)
	public Long lac;
	/**
	 * BSIC of the cell per {{bibref|3GPP-TS.23.003}}, consisting of:

:Bit 7:6 - not used ("00")

:Bit 5:3 - NCC (PLMN Color Code)

:Bit 2:0 - BCC (BS color code)

For example, if NCC is 7 and BCC is 2 you would have 00111010 (binary) or 0x3A (hex), and the value of this parameter would be 58.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BSIC")
	@Size(min = 0, max = 255)
	public Long bsiC;
	/**
	 * Cell ID of the cell per {{bibref|3GPP-TS.23.003|Section 4.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CI")
	@Size(min = 0, max = 65535)
	public Long ci;
	/**
	 * Indicates how to interpret the BCCH ARFCN. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandIndicator")
	public String bandIndicator;
	/**
	 * ARFCN of this cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BCCHARFCN")
	@Size(min = 0, max = 1023)
	public Long bccHARFCN;

	public GSM() {
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
	public GSM withPlmNID(String plmNID) {
		this.plmNID = plmNID;
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
	public GSM withLac(Long lac) {
		this.lac = lac;
		return this;
	}

	/**
	 * Get the bsiC of the cell per {{bibref|3GPP-TS.23.003}}, consisting of:

:Bit 7:6 - not used ("00")

:Bit 5:3 - NCC (PLMN Color Code)

:Bit 2:0 - BCC (BS color code)

For example, if NCC is 7 and BCC is 2 you would have 00111010 (binary) or 0x3A (hex), and the value of this parameter would be 58.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBsiC() {
		return bsiC;
	}

	/**
	 * Set the bsiC of the cell per {{bibref|3GPP-TS.23.003}}, consisting of:

:Bit 7:6 - not used ("00")

:Bit 5:3 - NCC (PLMN Color Code)

:Bit 2:0 - BCC (BS color code)

For example, if NCC is 7 and BCC is 2 you would have 00111010 (binary) or 0x3A (hex), and the value of this parameter would be 58.
	 *
	 * @since 2.0
	 * @param bsiC the input value
	 */
	public void  setBsiC(Long bsiC) {
		this.bsiC = bsiC;
	}

	/**
	 * Set the bsiC of the cell per {{bibref|3GPP-TS.23.003}}, consisting of:

:Bit 7:6 - not used ("00")

:Bit 5:3 - NCC (PLMN Color Code)

:Bit 2:0 - BCC (BS color code)

For example, if NCC is 7 and BCC is 2 you would have 00111010 (binary) or 0x3A (hex), and the value of this parameter would be 58.
	 *
	 * @since 2.0
	 * @param bsiC the input value
	 * @return this instance
	 */
	public GSM withBsiC(Long bsiC) {
		this.bsiC = bsiC;
		return this;
	}

	/**
	 * Get the cell ID of the cell per {{bibref|3GPP-TS.23.003|Section 4.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCi() {
		return ci;
	}

	/**
	 * Set the cell ID of the cell per {{bibref|3GPP-TS.23.003|Section 4.3.1}}.
	 *
	 * @since 2.0
	 * @param ci the input value
	 */
	public void  setCi(Long ci) {
		this.ci = ci;
	}

	/**
	 * Set the cell ID of the cell per {{bibref|3GPP-TS.23.003|Section 4.3.1}}.
	 *
	 * @since 2.0
	 * @param ci the input value
	 * @return this instance
	 */
	public GSM withCi(Long ci) {
		this.ci = ci;
		return this;
	}

	/**
	 * Get the indicates how to interpret the BCCH ARFCN. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBandIndicator() {
		return bandIndicator;
	}

	/**
	 * Set the indicates how to interpret the BCCH ARFCN. {{enum}}
	 *
	 * @since 2.0
	 * @param bandIndicator the input value
	 */
	public void  setBandIndicator(String bandIndicator) {
		this.bandIndicator = bandIndicator;
	}

	/**
	 * Set the indicates how to interpret the BCCH ARFCN. {{enum}}
	 *
	 * @since 2.0
	 * @param bandIndicator the input value
	 * @return this instance
	 */
	public GSM withBandIndicator(String bandIndicator) {
		this.bandIndicator = bandIndicator;
		return this;
	}

	/**
	 * Get arfCN of this cell.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBccHARFCN() {
		return bccHARFCN;
	}

	/**
	 * Set arfCN of this cell.
	 *
	 * @since 2.0
	 * @param bccHARFCN the input value
	 */
	public void  setBccHARFCN(Long bccHARFCN) {
		this.bccHARFCN = bccHARFCN;
	}

	/**
	 * Set arfCN of this cell.
	 *
	 * @since 2.0
	 * @param bccHARFCN the input value
	 * @return this instance
	 */
	public GSM withBccHARFCN(Long bccHARFCN) {
		this.bccHARFCN = bccHARFCN;
		return this;
	}

	//</editor-fold>

}