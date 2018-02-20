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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.geran;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This object contains parameters relating to the channel frequncy related information of GERAN (GSM) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.7}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup.{i}.", uniqueConstraints = {@CWMPUnique(names = {"BCCHARFCN"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup")
@XmlAccessorType(XmlAccessType.FIELD)
public class GERANFreqGroup {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Indicates how to interpret the BCCH ARFCN. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandIndicator")
	@CWMPParameter(access = "readWrite")
	public String bandIndicator;
	/**
	 * ARFCN of this cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BCCHARFCN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1023)
	public Long bccHARFCN = 0L;
	/**
	 * {{list}} Each item is a required minimum received RSSI level on this GERAN frequency carrier for re-selection to this UTRA FDD carrier, specified in dBm, with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2 - 115) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to RXLEV_ACCESS_MIN in {{bibref|3GPP-TS.45.008}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QRxLevMin")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> qrxLevMin;
	/**
	 * Absolute priority of this GERAN frequency group, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReselectionPriority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long cellReselectionPriority = 0L;
	/**
	 * Threshold used when re-selecting towards a higher priority GERAN frequency group than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshXHigh")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 31)
	public Long threshXHigh = 0L;
	/**
	 * Threshold used when re-selecting towards a lower priority GERAN frequency group than current serving E-UTRA frequency, specified in dB dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-Low specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshXLow")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 31)
	public Long threshXLow = 0L;

	public GERANFreqGroup() {
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
	public GERANFreqGroup withEnable(Boolean enable) {
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
	public GERANFreqGroup withAlias(Alias alias) {
		this.alias = alias;
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
	public GERANFreqGroup withBandIndicator(String bandIndicator) {
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
	public GERANFreqGroup withBccHARFCN(Long bccHARFCN) {
		this.bccHARFCN = bccHARFCN;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a required minimum received RSSI level on this GERAN frequency carrier for re-selection to this UTRA FDD carrier, specified in dBm, with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2 - 115) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to RXLEV_ACCESS_MIN in {{bibref|3GPP-TS.45.008}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQrxLevMin() {
		if (this.qrxLevMin == null){ this.qrxLevMin=new ArrayList<>();}
		return qrxLevMin;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSSI level on this GERAN frequency carrier for re-selection to this UTRA FDD carrier, specified in dBm, with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2 - 115) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to RXLEV_ACCESS_MIN in {{bibref|3GPP-TS.45.008}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qrxLevMin the input value
	 */
	public void  setQrxLevMin(Collection<String> qrxLevMin) {
		this.qrxLevMin = qrxLevMin;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSSI level on this GERAN frequency carrier for re-selection to this UTRA FDD carrier, specified in dBm, with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2 - 115) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to RXLEV_ACCESS_MIN in {{bibref|3GPP-TS.45.008}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public GERANFreqGroup withQrxLevMin(String string) {
		getQrxLevMin().add(string);
		return this;
	}

	/**
	 * Get absolute priority of this GERAN frequency group, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellReselectionPriority() {
		return cellReselectionPriority;
	}

	/**
	 * Set absolute priority of this GERAN frequency group, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 */
	public void  setCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
	}

	/**
	 * Set absolute priority of this GERAN frequency group, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 * @return this instance
	 */
	public GERANFreqGroup withCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
		return this;
	}

	/**
	 * Get the threshold used when re-selecting towards a higher priority GERAN frequency group than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshXHigh() {
		return threshXHigh;
	}

	/**
	 * Set the threshold used when re-selecting towards a higher priority GERAN frequency group than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXHigh the input value
	 */
	public void  setThreshXHigh(Long threshXHigh) {
		this.threshXHigh = threshXHigh;
	}

	/**
	 * Set the threshold used when re-selecting towards a higher priority GERAN frequency group than current serving E-UTRA frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXHigh the input value
	 * @return this instance
	 */
	public GERANFreqGroup withThreshXHigh(Long threshXHigh) {
		this.threshXHigh = threshXHigh;
		return this;
	}

	/**
	 * Get the threshold used when re-selecting towards a lower priority GERAN frequency group than current serving E-UTRA frequency, specified in dB dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-Low specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshXLow() {
		return threshXLow;
	}

	/**
	 * Set the threshold used when re-selecting towards a lower priority GERAN frequency group than current serving E-UTRA frequency, specified in dB dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-Low specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXLow the input value
	 */
	public void  setThreshXLow(Long threshXLow) {
		this.threshXLow = threshXLow;
	}

	/**
	 * Set the threshold used when re-selecting towards a lower priority GERAN frequency group than current serving E-UTRA frequency, specified in dB dB. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter threshX-Low specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXLow the input value
	 * @return this instance
	 */
	public GERANFreqGroup withThreshXLow(Long threshXLow) {
		this.threshXLow = threshXLow;
		return this;
	}

	//</editor-fold>

}