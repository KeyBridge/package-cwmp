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
package org.broadbandforum.tr196.fapservice.rem.lte.cell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table indicating the RF aspect of the discovered cells.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.LTE.Cell.{i}.RF.")
public class RF {

	/**
	 * Indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EUTRACarrierARFCN")
	@Size(min = 0, max = 65535)
	public Long eutRACarrierARFCN;
	/**
	 * Physical cell ID of the detected EUTRAN cell, as specified in {{bibref|3GPP-TS.36.101|Section 5.6}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhyCellID")
	@Size(min = 0, max = 503)
	public Long phyCellID;
	/**
	 * Received RSRP level of the detected EUTRA cell, specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.1}}. The reporting range is specified in {{bibref|3GPP-TS.36.133|Section 9.1.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSRP")
	@Size(min = -140, max = -44)
	public Integer rsrP;
	/**
	 * Received RSRQ level of the detected EUTRA cell, specified in dB, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}.  Actual measured values range between -24.0 dB and 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 10 yields the actual measured value. Only values in multiple of 5 are valid.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSRQ")
	@Size(min = -240, max = 0)
	public Integer rsrQ;
	/**
	 * E-UTRA Carrier Received Signal Strength Indicator (RSSI), specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}. It comprises the linear average of the total received power (in [W]) observed only in OFDM symbols containing reference symbols for antenna port 0, in the measurement bandwidth, over N number of resource blocks by the UE from all sources, including co-channel serving and non-serving cells, adjacent channel interference, thermal noise etc.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSSI")
	@Size(min = -110, max = -19)
	public Integer rssI;

	public RF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEutRACarrierARFCN() {
		return eutRACarrierARFCN;
	}

	/**
	 * Set the indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.
	 *
	 * @since 2.0
	 * @param eutRACarrierARFCN the input value
	 */
	public void  setEutRACarrierARFCN(Long eutRACarrierARFCN) {
		this.eutRACarrierARFCN = eutRACarrierARFCN;
	}

	/**
	 * Set the indicates the ARFCN of this carrier frequency. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.
	 *
	 * @since 2.0
	 * @param eutRACarrierARFCN the input value
	 * @return this instance
	 */
	public RF withEutRACarrierARFCN(Long eutRACarrierARFCN) {
		this.eutRACarrierARFCN = eutRACarrierARFCN;
		return this;
	}

	/**
	 * Get the physical cell ID of the detected EUTRAN cell, as specified in {{bibref|3GPP-TS.36.101|Section 5.6}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPhyCellID() {
		return phyCellID;
	}

	/**
	 * Set the physical cell ID of the detected EUTRAN cell, as specified in {{bibref|3GPP-TS.36.101|Section 5.6}}.
	 *
	 * @since 2.0
	 * @param phyCellID the input value
	 */
	public void  setPhyCellID(Long phyCellID) {
		this.phyCellID = phyCellID;
	}

	/**
	 * Set the physical cell ID of the detected EUTRAN cell, as specified in {{bibref|3GPP-TS.36.101|Section 5.6}}.
	 *
	 * @since 2.0
	 * @param phyCellID the input value
	 * @return this instance
	 */
	public RF withPhyCellID(Long phyCellID) {
		this.phyCellID = phyCellID;
		return this;
	}

	/**
	 * Get the received RSRP level of the detected EUTRA cell, specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.1}}. The reporting range is specified in {{bibref|3GPP-TS.36.133|Section 9.1.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRsrP() {
		return rsrP;
	}

	/**
	 * Set the received RSRP level of the detected EUTRA cell, specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.1}}. The reporting range is specified in {{bibref|3GPP-TS.36.133|Section 9.1.4}}.
	 *
	 * @since 2.0
	 * @param rsrP the input value
	 */
	public void  setRsrP(Integer rsrP) {
		this.rsrP = rsrP;
	}

	/**
	 * Set the received RSRP level of the detected EUTRA cell, specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.1}}. The reporting range is specified in {{bibref|3GPP-TS.36.133|Section 9.1.4}}.
	 *
	 * @since 2.0
	 * @param rsrP the input value
	 * @return this instance
	 */
	public RF withRsrP(Integer rsrP) {
		this.rsrP = rsrP;
		return this;
	}

	/**
	 * Get the received RSRQ level of the detected EUTRA cell, specified in dB, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}.  Actual measured values range between -24.0 dB and 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 10 yields the actual measured value. Only values in multiple of 5 are valid.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRsrQ() {
		return rsrQ;
	}

	/**
	 * Set the received RSRQ level of the detected EUTRA cell, specified in dB, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}.  Actual measured values range between -24.0 dB and 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 10 yields the actual measured value. Only values in multiple of 5 are valid.
	 *
	 * @since 2.0
	 * @param rsrQ the input value
	 */
	public void  setRsrQ(Integer rsrQ) {
		this.rsrQ = rsrQ;
	}

	/**
	 * Set the received RSRQ level of the detected EUTRA cell, specified in dB, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}.  Actual measured values range between -24.0 dB and 0.0 dB in steps of 0.5 dB. The value of {{param}} divided by 10 yields the actual measured value. Only values in multiple of 5 are valid.
	 *
	 * @since 2.0
	 * @param rsrQ the input value
	 * @return this instance
	 */
	public RF withRsrQ(Integer rsrQ) {
		this.rsrQ = rsrQ;
		return this;
	}

	/**
	 * Get the e-uTRA Carrier Received Signal Strength Indicator (RSSI), specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}. It comprises the linear average of the total received power (in [W]) observed only in OFDM symbols containing reference symbols for antenna port 0, in the measurement bandwidth, over N number of resource blocks by the UE from all sources, including co-channel serving and non-serving cells, adjacent channel interference, thermal noise etc.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRssI() {
		return rssI;
	}

	/**
	 * Set the e-uTRA Carrier Received Signal Strength Indicator (RSSI), specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}. It comprises the linear average of the total received power (in [W]) observed only in OFDM symbols containing reference symbols for antenna port 0, in the measurement bandwidth, over N number of resource blocks by the UE from all sources, including co-channel serving and non-serving cells, adjacent channel interference, thermal noise etc.
	 *
	 * @since 2.0
	 * @param rssI the input value
	 */
	public void  setRssI(Integer rssI) {
		this.rssI = rssI;
	}

	/**
	 * Set the e-uTRA Carrier Received Signal Strength Indicator (RSSI), specified in dBm, as specified in {{bibref|3GPP-TS.36.214|Section 5.1.3}}. It comprises the linear average of the total received power (in [W]) observed only in OFDM symbols containing reference symbols for antenna port 0, in the measurement bandwidth, over N number of resource blocks by the UE from all sources, including co-channel serving and non-serving cells, adjacent channel interference, thermal noise etc.
	 *
	 * @since 2.0
	 * @param rssI the input value
	 * @return this instance
	 */
	public RF withRssI(Integer rssI) {
		this.rssI = rssI;
		return this;
	}

	//</editor-fold>

}