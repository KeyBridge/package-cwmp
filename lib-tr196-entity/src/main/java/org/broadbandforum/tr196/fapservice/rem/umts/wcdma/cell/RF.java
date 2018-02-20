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
package org.broadbandforum.tr196.fapservice.rem.umts.wcdma.cell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table indicating the RF aspect of the discovered cells.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.RF.")
@XmlRootElement(name = "FAPService.REM.UMTS.WCDMA.Cell.RF")
@XmlType(name = "FAPService.REM.UMTS.WCDMA.Cell.RF")
@XmlAccessorType(XmlAccessType.FIELD)
public class RF {

	/**
	 * The UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction of an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNDL")
	@Size(min = 0, max = 16383)
	public Long uarFCNDL;
	/**
	 * Received signal level in dBm of the CPICH channel. (Ref. 3GPP TS 25.133)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CPICHRSCP")
	@Size(min = -120, max = -25)
	public Integer cpiCHRSCP;
	/**
	 * Measured EcNo. (energy per chip to interference power density) in dB received in the downlink pilot channel.

Actual values of the range are -24.0 dB to 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range. {{bibref|3GPP-TS.25.133|Section 9.1.2.3}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CPICHEcNo")
	@Size(min = -48, max = 0)
	public Integer cpiCHEcNo;
	/**
	 * This measurement is for Inter-frequency handover evaluation, measured in total dBm in the band. {{bibref|3GPP-TS.25.133|Section9.1.3}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSSI")
	@Size(min = -100, max = -25)
	public Integer rssI;
	/**
	 * Primary scrambling code.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrimaryScramblingCode")
	@Size(min = 0, max = 511)
	public Long primaryScramblingCode;

	public RF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction of an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUarFCNDL() {
		return uarFCNDL;
	}

	/**
	 * Set the UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction of an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @param uarFCNDL the input value
	 */
	public void  setUarFCNDL(Long uarFCNDL) {
		this.uarFCNDL = uarFCNDL;
	}

	/**
	 * Set the UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction of an FDD mode cell. {{bibref|3GPP-TS.25.433}}
	 *
	 * @since 2.0
	 * @param uarFCNDL the input value
	 * @return this instance
	 */
	public RF withUarFCNDL(Long uarFCNDL) {
		this.uarFCNDL = uarFCNDL;
		return this;
	}

	/**
	 * Get the received signal level in dBm of the CPICH channel. (Ref. 3GPP TS 25.133)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getCpiCHRSCP() {
		return cpiCHRSCP;
	}

	/**
	 * Set the received signal level in dBm of the CPICH channel. (Ref. 3GPP TS 25.133)
	 *
	 * @since 2.0
	 * @param cpiCHRSCP the input value
	 */
	public void  setCpiCHRSCP(Integer cpiCHRSCP) {
		this.cpiCHRSCP = cpiCHRSCP;
	}

	/**
	 * Set the received signal level in dBm of the CPICH channel. (Ref. 3GPP TS 25.133)
	 *
	 * @since 2.0
	 * @param cpiCHRSCP the input value
	 * @return this instance
	 */
	public RF withCpiCHRSCP(Integer cpiCHRSCP) {
		this.cpiCHRSCP = cpiCHRSCP;
		return this;
	}

	/**
	 * Get the measured EcNo. (energy per chip to interference power density) in dB received in the downlink pilot channel.

Actual values of the range are -24.0 dB to 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range. {{bibref|3GPP-TS.25.133|Section 9.1.2.3}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getCpiCHEcNo() {
		return cpiCHEcNo;
	}

	/**
	 * Set the measured EcNo. (energy per chip to interference power density) in dB received in the downlink pilot channel.

Actual values of the range are -24.0 dB to 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range. {{bibref|3GPP-TS.25.133|Section 9.1.2.3}}
	 *
	 * @since 2.0
	 * @param cpiCHEcNo the input value
	 */
	public void  setCpiCHEcNo(Integer cpiCHEcNo) {
		this.cpiCHEcNo = cpiCHEcNo;
	}

	/**
	 * Set the measured EcNo. (energy per chip to interference power density) in dB received in the downlink pilot channel.

Actual values of the range are -24.0 dB to 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range. {{bibref|3GPP-TS.25.133|Section 9.1.2.3}}
	 *
	 * @since 2.0
	 * @param cpiCHEcNo the input value
	 * @return this instance
	 */
	public RF withCpiCHEcNo(Integer cpiCHEcNo) {
		this.cpiCHEcNo = cpiCHEcNo;
		return this;
	}

	/**
	 * Get the this measurement is for Inter-frequency handover evaluation, measured in total dBm in the band. {{bibref|3GPP-TS.25.133|Section9.1.3}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRssI() {
		return rssI;
	}

	/**
	 * Set the this measurement is for Inter-frequency handover evaluation, measured in total dBm in the band. {{bibref|3GPP-TS.25.133|Section9.1.3}}
	 *
	 * @since 2.0
	 * @param rssI the input value
	 */
	public void  setRssI(Integer rssI) {
		this.rssI = rssI;
	}

	/**
	 * Set the this measurement is for Inter-frequency handover evaluation, measured in total dBm in the band. {{bibref|3GPP-TS.25.133|Section9.1.3}}
	 *
	 * @since 2.0
	 * @param rssI the input value
	 * @return this instance
	 */
	public RF withRssI(Integer rssI) {
		this.rssI = rssI;
		return this;
	}

	/**
	 * Get the primary scrambling code.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrimaryScramblingCode() {
		return primaryScramblingCode;
	}

	/**
	 * Set the primary scrambling code.
	 *
	 * @since 2.0
	 * @param primaryScramblingCode the input value
	 */
	public void  setPrimaryScramblingCode(Long primaryScramblingCode) {
		this.primaryScramblingCode = primaryScramblingCode;
	}

	/**
	 * Set the primary scrambling code.
	 *
	 * @since 2.0
	 * @param primaryScramblingCode the input value
	 * @return this instance
	 */
	public RF withPrimaryScramblingCode(Long primaryScramblingCode) {
		this.primaryScramblingCode = primaryScramblingCode;
		return this;
	}

	//</editor-fold>

}