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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.cdma2000;

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
	 * This object contains parameters relating to the channel frequncy related information of CDMA2000 system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDMA2000Band {

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
	 * Defines the CDMA2000 band in which the CDMA2000 carrier frequency can be found, specified in bandclass number. BandClass is defined in 3GPP2 C.S0057-B Table 1.5-1.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandClass")
	@CWMPParameter(access = "readWrite", units = "bandclass number")
	@Size(min = 0, max = 17)
	public Long bandClass = 0L;
	/**
	 * Absolute priority of this CDMA2000 band used by the inter-frequency cell re-selection procedure. Corresponds to parameter CellReselectionPriority specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReselectionPriority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long cellReselectionPriority = 0L;
	/**
	 * Threshold used when re-selecting towards a higher priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshXHigh")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long threshXHigh = 0L;
	/**
	 * Threshold used when re-selecting towards a lower priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter threshX-Low specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshXLow")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 63)
	public Long threshXLow = 0L;

	public CDMA2000Band() {
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
	public CDMA2000Band withEnable(Boolean enable) {
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
	public CDMA2000Band withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the defines the CDMA2000 band in which the CDMA2000 carrier frequency can be found, specified in bandclass number. BandClass is defined in 3GPP2 C.S0057-B Table 1.5-1.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBandClass() {
		return bandClass;
	}

	/**
	 * Set the defines the CDMA2000 band in which the CDMA2000 carrier frequency can be found, specified in bandclass number. BandClass is defined in 3GPP2 C.S0057-B Table 1.5-1.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param bandClass the input value
	 */
	public void  setBandClass(Long bandClass) {
		this.bandClass = bandClass;
	}

	/**
	 * Set the defines the CDMA2000 band in which the CDMA2000 carrier frequency can be found, specified in bandclass number. BandClass is defined in 3GPP2 C.S0057-B Table 1.5-1.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param bandClass the input value
	 * @return this instance
	 */
	public CDMA2000Band withBandClass(Long bandClass) {
		this.bandClass = bandClass;
		return this;
	}

	/**
	 * Get absolute priority of this CDMA2000 band used by the inter-frequency cell re-selection procedure. Corresponds to parameter CellReselectionPriority specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellReselectionPriority() {
		return cellReselectionPriority;
	}

	/**
	 * Set absolute priority of this CDMA2000 band used by the inter-frequency cell re-selection procedure. Corresponds to parameter CellReselectionPriority specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 */
	public void  setCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
	}

	/**
	 * Set absolute priority of this CDMA2000 band used by the inter-frequency cell re-selection procedure. Corresponds to parameter CellReselectionPriority specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 * @return this instance
	 */
	public CDMA2000Band withCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
		return this;
	}

	/**
	 * Get the threshold used when re-selecting towards a higher priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshXHigh() {
		return threshXHigh;
	}

	/**
	 * Set the threshold used when re-selecting towards a higher priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXHigh the input value
	 */
	public void  setThreshXHigh(Long threshXHigh) {
		this.threshXHigh = threshXHigh;
	}

	/**
	 * Set the threshold used when re-selecting towards a higher priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXHigh the input value
	 * @return this instance
	 */
	public CDMA2000Band withThreshXHigh(Long threshXHigh) {
		this.threshXHigh = threshXHigh;
		return this;
	}

	/**
	 * Get the threshold used when re-selecting towards a lower priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter threshX-Low specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshXLow() {
		return threshXLow;
	}

	/**
	 * Set the threshold used when re-selecting towards a lower priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter threshX-Low specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXLow the input value
	 */
	public void  setThreshXLow(Long threshXLow) {
		this.threshXLow = threshXLow;
	}

	/**
	 * Set the threshold used when re-selecting towards a lower priority CDMA2000 band than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter threshX-Low specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXLow the input value
	 * @return this instance
	 */
	public CDMA2000Band withThreshXLow(Long threshXLow) {
		this.threshXLow = threshXLow;
		return this;
	}

	//</editor-fold>

}