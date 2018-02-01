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
package org.broadbandforum.tr196.fapservice.rem.umts.gsm;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table indicating the components of the discovered cells.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.UMTS.GSM.Cell.{i}.")
public class Cell {

	/**
	 * Indicates how to interpret the BCCH ARFCN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandIndicator")
	public String bandIndicator;
	/**
	 * Absolute Radio Frequency Channel Number (ARFCN) {{bibref|3GPP-TS.05.05}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ARFCN")
	@Size(min = 0, max = 1023)
	public Long arfCN;
	/**
	 * Base Station Identity Code {{bibref|3GPP-TS.03.03}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BSIC")
	@Size(min = 0, max = 63)
	public Long bsiC;
	/**
	 * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of the PLMNID is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNID")
	@Size(max = 6)
	public String plmNID;
	/**
	 * Location Area Code (LAC) as defined in SIB1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LAC")
	@Size(min = 1, max = 65535)
	public Long lac;
	/**
	 * Routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RAC")
	@Size(max = 255)
	public Long rac;
	/**
	 * Cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CI")
	@Size(max = 63535)
	public Long ci;
	/**
	 * Received signal level in dBm of the BCCH carrier.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSSI")
	@Size(min = -110, max = 48)
	public Integer rssI;

	public Cell() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates how to interpret the BCCH ARFCN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBandIndicator() {
		return bandIndicator;
	}

	/**
	 * Set the indicates how to interpret the BCCH ARFCN.
	 *
	 * @since 2.0
	 * @param bandIndicator the input value
	 */
	public void  setBandIndicator(String bandIndicator) {
		this.bandIndicator = bandIndicator;
	}

	/**
	 * Set the indicates how to interpret the BCCH ARFCN.
	 *
	 * @since 2.0
	 * @param bandIndicator the input value
	 * @return this instance
	 */
	public Cell withBandIndicator(String bandIndicator) {
		this.bandIndicator = bandIndicator;
		return this;
	}

	/**
	 * Get absolute Radio Frequency Channel Number (ARFCN) {{bibref|3GPP-TS.05.05}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getArfCN() {
		return arfCN;
	}

	/**
	 * Set absolute Radio Frequency Channel Number (ARFCN) {{bibref|3GPP-TS.05.05}}.
	 *
	 * @since 2.0
	 * @param arfCN the input value
	 */
	public void  setArfCN(Long arfCN) {
		this.arfCN = arfCN;
	}

	/**
	 * Set absolute Radio Frequency Channel Number (ARFCN) {{bibref|3GPP-TS.05.05}}.
	 *
	 * @since 2.0
	 * @param arfCN the input value
	 * @return this instance
	 */
	public Cell withArfCN(Long arfCN) {
		this.arfCN = arfCN;
		return this;
	}

	/**
	 * Get the base Station Identity Code {{bibref|3GPP-TS.03.03}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBsiC() {
		return bsiC;
	}

	/**
	 * Set the base Station Identity Code {{bibref|3GPP-TS.03.03}}.
	 *
	 * @since 2.0
	 * @param bsiC the input value
	 */
	public void  setBsiC(Long bsiC) {
		this.bsiC = bsiC;
	}

	/**
	 * Set the base Station Identity Code {{bibref|3GPP-TS.03.03}}.
	 *
	 * @since 2.0
	 * @param bsiC the input value
	 * @return this instance
	 */
	public Cell withBsiC(Long bsiC) {
		this.bsiC = bsiC;
		return this;
	}

	/**
	 * Get the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of the PLMNID is 5.
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

For a 2-digit MNC the total string length of the PLMNID is 5.
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

For a 2-digit MNC the total string length of the PLMNID is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 * @return this instance
	 */
	public Cell withPlmNID(String plmNID) {
		this.plmNID = plmNID;
		return this;
	}

	/**
	 * Get the location Area Code (LAC) as defined in SIB1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLac() {
		return lac;
	}

	/**
	 * Set the location Area Code (LAC) as defined in SIB1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @param lac the input value
	 */
	public void  setLac(Long lac) {
		this.lac = lac;
	}

	/**
	 * Set the location Area Code (LAC) as defined in SIB1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @param lac the input value
	 * @return this instance
	 */
	public Cell withLac(Long lac) {
		this.lac = lac;
		return this;
	}

	/**
	 * Get the routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRac() {
		return rac;
	}

	/**
	 * Set the routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 * @param rac the input value
	 */
	public void  setRac(Long rac) {
		this.rac = rac;
	}

	/**
	 * Set the routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}
	 *
	 * @since 2.0
	 * @param rac the input value
	 * @return this instance
	 */
	public Cell withRac(Long rac) {
		this.rac = rac;
		return this;
	}

	/**
	 * Get the cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCi() {
		return ci;
	}

	/**
	 * Set the cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 * @param ci the input value
	 */
	public void  setCi(Long ci) {
		this.ci = ci;
	}

	/**
	 * Set the cell Identity. {{bibref|3GPP-TS.25.331|Section 10.3.2.2}}
	 *
	 * @since 2.0
	 * @param ci the input value
	 * @return this instance
	 */
	public Cell withCi(Long ci) {
		this.ci = ci;
		return this;
	}

	/**
	 * Get the received signal level in dBm of the BCCH carrier.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRssI() {
		return rssI;
	}

	/**
	 * Set the received signal level in dBm of the BCCH carrier.
	 *
	 * @since 2.0
	 * @param rssI the input value
	 */
	public void  setRssI(Integer rssI) {
		this.rssI = rssI;
	}

	/**
	 * Set the received signal level in dBm of the BCCH carrier.
	 *
	 * @since 2.0
	 * @param rssI the input value
	 * @return this instance
	 */
	public Cell withRssI(Integer rssI) {
		this.rssI = rssI;
		return this;
	}

	//</editor-fold>

}