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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.neighborlistinuse;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table containing the intra-frequency cell list.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntraFreqCell {

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
	 * RNC-ID of an intra-freq neighbor cell. It uniquely identifies an RNC within a PLMN.

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
	 * C-ID of the intra-freq neighbour cell {{bibref|3GPP-TS.25.401|Section 6.1.5}}.

If {{param|RNCID}} is larger than 4095, then {{param}} will be 12 bits (i.e. a range of [0:4095]), else {{param}} is 16 bits long (i.e. range of [4096:65535]).

This is needed to facilitate Femto to Macro handover.

Used in {{bibref|3GPP-TS.25.413|Section 9.2.1.28}} as part of Target Cell ID.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CID")
	@Size(min = 0, max = 65535)
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
	 * Primary CPICH scrambling code.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHScramblingCode")
	@Size(min = 0, max = 511)
	public Long pcpICHScramblingCode;

	public IntraFreqCell() {
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
	 * Get the c-iD of the intra-freq neighbour cell {{bibref|3GPP-TS.25.401|Section 6.1.5}}.

If {{param|RNCID}} is larger than 4095, then {{param}} will be 12 bits (i.e. a range of [0:4095]), else {{param}} is 16 bits long (i.e. range of [4096:65535]).

This is needed to facilitate Femto to Macro handover.

Used in {{bibref|3GPP-TS.25.413|Section 9.2.1.28}} as part of Target Cell ID.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCid() {
		return cid;
	}

	/**
	 * Set the c-iD of the intra-freq neighbour cell {{bibref|3GPP-TS.25.401|Section 6.1.5}}.

If {{param|RNCID}} is larger than 4095, then {{param}} will be 12 bits (i.e. a range of [0:4095]), else {{param}} is 16 bits long (i.e. range of [4096:65535]).

This is needed to facilitate Femto to Macro handover.

Used in {{bibref|3GPP-TS.25.413|Section 9.2.1.28}} as part of Target Cell ID.
	 *
	 * @since 2.0
	 * @param cid the input value
	 */
	public void  setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * Set the c-iD of the intra-freq neighbour cell {{bibref|3GPP-TS.25.401|Section 6.1.5}}.

If {{param|RNCID}} is larger than 4095, then {{param}} will be 12 bits (i.e. a range of [0:4095]), else {{param}} is 16 bits long (i.e. range of [4096:65535]).

This is needed to facilitate Femto to Macro handover.

Used in {{bibref|3GPP-TS.25.413|Section 9.2.1.28}} as part of Target Cell ID.
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

	//</editor-fold>

}