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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.connmode;

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

	/**
	 * This object contains parameters relating to the connected mode mobility (handover) configuration that is common to all inter-RAT handover scenarios (UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.2}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.ConnMode.IRAT.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.ConnMode.IRAT")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.ConnMode.IRAT")
@XmlAccessorType(XmlAccessType.FIELD)
public class IRAT {

	/**
	 * {{list}} Each item is a UTRA-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectUTRA specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QoffsettUTRA")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> qoffsettUTRA;
	/**
	 * {{list}} Each item is a filtering coefficient used for UTRA measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to filterCoefficient parameter specified in  QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterCoefficientUTRA")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> filterCoefficientUTRA;
	/**
	 * Measurement quantity used for UTRA measurements. Corresponds to measQuantityUTRA-FDD parameter specified in QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeasQuantityUTRAFDD")
	@CWMPParameter(access = "readWrite")
	public String measQuantityUTRAFDD;
	/**
	 * RSCP threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B1ThresholdUTRARSCP")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -5, max = 91)
	public Integer b1thresholdUTRARSCP;
	/**
	 * EcNo threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B1ThresholdUTRAEcN0")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 0, max = 49)
	public Long b1thresholdUTRAEcN0;
	/**
	 * {{list}} Each item is a GERAN-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectGERAN specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QoffsetGERAN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> qoffsetGERAN;
	/**
	 * {{list}} Each item is a filtering coefficient used for GERAN measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficient parameter specified in QuantityConfigGERAN IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterCoefficientGERAN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> filterCoefficientGERAN;
	/**
	 * Threshold to be used in GERAN measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b1-ThresholdGERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B1ThresholdGERAN")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 0, max = 63)
	public Long b1thresholdGERAN;
	/**
	 * {{list}} Each item is a CDMA2000-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectCDMA2000 specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QoffsetCDMA2000")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> qoffsetCDMA2000;
	/**
	 * Measurement quantity used for CDMA2000 measurements. Corresponds to measQuantityCDMA2000 parameter specified in QuantityConfigCDMA2000 IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeasQuantityCDMA2000")
	@CWMPParameter(access = "readWrite")
	public String measQuantityCDMA2000;
	/**
	 * Threshold to be used in CDMA2000 measurement report triggering condition for event B1. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.45.008}}. Corresponds to parameter b1-ThresholdCDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B1ThresholdCDMA2000")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 0, max = 63)
	public Long b1thresholdCDMA2000;
	/**
	 * RSCP threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B2Threshold2UTRARSCP")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -5, max = 91)
	public Integer b2threshold2UTRARSCP;
	/**
	 * EcNo threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B2Threshold2UTRAEcN0")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 0, max = 49)
	public Long b2threshold2UTRAEcN0;
	/**
	 * Threshold to be used in GERAN measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2GERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B2Threshold2GERAN")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 0, max = 63)
	public Long b2threshold2GERAN;
	/**
	 * Threshold to be used in CDMA2000 measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2CDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "B2Threshold2CDMA2000")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 0, max = 63)
	public Long b2threshold2CDMA2000;
	/**
	 * {{list}} Each item is a hysteresis value applied to entry and leave condition of an IRAT report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Hysteresis")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> hysteresis;
	/**
	 * {{list}} Each item is a time period during which IRAT measurement report triggering condition needs to be met in order to trigger IRAT measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value.. Corresponds to parameter timeToTrigger specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTrigger")
	@CWMPParameter(access = "readWrite")
	@Size(min = 5120, max = 5120)
	public Long timeToTrigger;
	/**
	 * Maximum number of IRAT cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxReportCells")
	@Size(min = 1, max = 8)
	public Long maxReportCells;
	/**
	 * Interval between successive IRAT measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportInterval")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 3600000, max = 3600000)
	public Long reportInterval;
	/**
	 * Number of times an IRAT measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportAmount")
	@CWMPParameter(access = "readWrite")
	@Size(min = 64, max = 64)
	public Long reportAmount;

	public IRAT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a UTRA-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectUTRA specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQoffsettUTRA() {
		if (this.qoffsettUTRA == null){ this.qoffsettUTRA=new ArrayList<>();}
		return qoffsettUTRA;
	}

	/**
	 * Set the {{list}} Each item is a UTRA-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectUTRA specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qoffsettUTRA the input value
	 */
	public void  setQoffsettUTRA(Collection<String> qoffsettUTRA) {
		this.qoffsettUTRA = qoffsettUTRA;
	}

	/**
	 * Set the {{list}} Each item is a UTRA-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectUTRA specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IRAT withQoffsettUTRA(String string) {
		getQoffsettUTRA().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a filtering coefficient used for UTRA measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to filterCoefficient parameter specified in  QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFilterCoefficientUTRA() {
		if (this.filterCoefficientUTRA == null){ this.filterCoefficientUTRA=new ArrayList<>();}
		return filterCoefficientUTRA;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for UTRA measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to filterCoefficient parameter specified in  QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param filterCoefficientUTRA the input value
	 */
	public void  setFilterCoefficientUTRA(Collection<String> filterCoefficientUTRA) {
		this.filterCoefficientUTRA = filterCoefficientUTRA;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for UTRA measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to filterCoefficient parameter specified in  QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IRAT withFilterCoefficientUTRA(String string) {
		getFilterCoefficientUTRA().add(string);
		return this;
	}

	/**
	 * Get the measurement quantity used for UTRA measurements. Corresponds to measQuantityUTRA-FDD parameter specified in QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMeasQuantityUTRAFDD() {
		return measQuantityUTRAFDD;
	}

	/**
	 * Set the measurement quantity used for UTRA measurements. Corresponds to measQuantityUTRA-FDD parameter specified in QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param measQuantityUTRAFDD the input value
	 */
	public void  setMeasQuantityUTRAFDD(String measQuantityUTRAFDD) {
		this.measQuantityUTRAFDD = measQuantityUTRAFDD;
	}

	/**
	 * Set the measurement quantity used for UTRA measurements. Corresponds to measQuantityUTRA-FDD parameter specified in QuantityConfigUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param measQuantityUTRAFDD the input value
	 * @return this instance
	 */
	public IRAT withMeasQuantityUTRAFDD(String measQuantityUTRAFDD) {
		this.measQuantityUTRAFDD = measQuantityUTRAFDD;
		return this;
	}

	/**
	 * Get the rscP threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getB1thresholdUTRARSCP() {
		return b1thresholdUTRARSCP;
	}

	/**
	 * Set the rscP threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdUTRARSCP the input value
	 */
	public void  setB1thresholdUTRARSCP(Integer b1thresholdUTRARSCP) {
		this.b1thresholdUTRARSCP = b1thresholdUTRARSCP;
	}

	/**
	 * Set the rscP threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdUTRARSCP the input value
	 * @return this instance
	 */
	public IRAT withB1thresholdUTRARSCP(Integer b1thresholdUTRARSCP) {
		this.b1thresholdUTRARSCP = b1thresholdUTRARSCP;
		return this;
	}

	/**
	 * Get the ecno threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getB1thresholdUTRAEcN0() {
		return b1thresholdUTRAEcN0;
	}

	/**
	 * Set the ecno threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdUTRAEcN0 the input value
	 */
	public void  setB1thresholdUTRAEcN0(Long b1thresholdUTRAEcN0) {
		this.b1thresholdUTRAEcN0 = b1thresholdUTRAEcN0;
	}

	/**
	 * Set the ecno threshold to be used in UTRA measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b1-ThresholdUTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdUTRAEcN0 the input value
	 * @return this instance
	 */
	public IRAT withB1thresholdUTRAEcN0(Long b1thresholdUTRAEcN0) {
		this.b1thresholdUTRAEcN0 = b1thresholdUTRAEcN0;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a GERAN-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectGERAN specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQoffsetGERAN() {
		if (this.qoffsetGERAN == null){ this.qoffsetGERAN=new ArrayList<>();}
		return qoffsetGERAN;
	}

	/**
	 * Set the {{list}} Each item is a GERAN-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectGERAN specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qoffsetGERAN the input value
	 */
	public void  setQoffsetGERAN(Collection<String> qoffsetGERAN) {
		this.qoffsetGERAN = qoffsetGERAN;
	}

	/**
	 * Set the {{list}} Each item is a GERAN-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectGERAN specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IRAT withQoffsetGERAN(String string) {
		getQoffsetGERAN().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a filtering coefficient used for GERAN measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficient parameter specified in QuantityConfigGERAN IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFilterCoefficientGERAN() {
		if (this.filterCoefficientGERAN == null){ this.filterCoefficientGERAN=new ArrayList<>();}
		return filterCoefficientGERAN;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for GERAN measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficient parameter specified in QuantityConfigGERAN IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param filterCoefficientGERAN the input value
	 */
	public void  setFilterCoefficientGERAN(Collection<String> filterCoefficientGERAN) {
		this.filterCoefficientGERAN = filterCoefficientGERAN;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for GERAN measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficient parameter specified in QuantityConfigGERAN IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IRAT withFilterCoefficientGERAN(String string) {
		getFilterCoefficientGERAN().add(string);
		return this;
	}

	/**
	 * Get the threshold to be used in GERAN measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b1-ThresholdGERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getB1thresholdGERAN() {
		return b1thresholdGERAN;
	}

	/**
	 * Set the threshold to be used in GERAN measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b1-ThresholdGERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdGERAN the input value
	 */
	public void  setB1thresholdGERAN(Long b1thresholdGERAN) {
		this.b1thresholdGERAN = b1thresholdGERAN;
	}

	/**
	 * Set the threshold to be used in GERAN measurement report triggering condition for event B1. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b1-ThresholdGERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdGERAN the input value
	 * @return this instance
	 */
	public IRAT withB1thresholdGERAN(Long b1thresholdGERAN) {
		this.b1thresholdGERAN = b1thresholdGERAN;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a CDMA2000-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectCDMA2000 specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQoffsetCDMA2000() {
		if (this.qoffsetCDMA2000 == null){ this.qoffsetCDMA2000=new ArrayList<>();}
		return qoffsetCDMA2000;
	}

	/**
	 * Set the {{list}} Each item is a CDMA2000-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectCDMA2000 specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qoffsetCDMA2000 the input value
	 */
	public void  setQoffsetCDMA2000(Collection<String> qoffsetCDMA2000) {
		this.qoffsetCDMA2000 = qoffsetCDMA2000;
	}

	/**
	 * Set the {{list}} Each item is a CDMA2000-specific offset to be applied when evaluating triggering conditions for measurement reporting in connected mode, with a numeric range between -15 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter offsetFreq included in the IE MeasObjectCDMA2000 specified in {{bibref|3GPP-TS.36.331}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IRAT withQoffsetCDMA2000(String string) {
		getQoffsetCDMA2000().add(string);
		return this;
	}

	/**
	 * Get the measurement quantity used for CDMA2000 measurements. Corresponds to measQuantityCDMA2000 parameter specified in QuantityConfigCDMA2000 IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMeasQuantityCDMA2000() {
		return measQuantityCDMA2000;
	}

	/**
	 * Set the measurement quantity used for CDMA2000 measurements. Corresponds to measQuantityCDMA2000 parameter specified in QuantityConfigCDMA2000 IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param measQuantityCDMA2000 the input value
	 */
	public void  setMeasQuantityCDMA2000(String measQuantityCDMA2000) {
		this.measQuantityCDMA2000 = measQuantityCDMA2000;
	}

	/**
	 * Set the measurement quantity used for CDMA2000 measurements. Corresponds to measQuantityCDMA2000 parameter specified in QuantityConfigCDMA2000 IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param measQuantityCDMA2000 the input value
	 * @return this instance
	 */
	public IRAT withMeasQuantityCDMA2000(String measQuantityCDMA2000) {
		this.measQuantityCDMA2000 = measQuantityCDMA2000;
		return this;
	}

	/**
	 * Get the threshold to be used in CDMA2000 measurement report triggering condition for event B1. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.45.008}}. Corresponds to parameter b1-ThresholdCDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getB1thresholdCDMA2000() {
		return b1thresholdCDMA2000;
	}

	/**
	 * Set the threshold to be used in CDMA2000 measurement report triggering condition for event B1. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.45.008}}. Corresponds to parameter b1-ThresholdCDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdCDMA2000 the input value
	 */
	public void  setB1thresholdCDMA2000(Long b1thresholdCDMA2000) {
		this.b1thresholdCDMA2000 = b1thresholdCDMA2000;
	}

	/**
	 * Set the threshold to be used in CDMA2000 measurement report triggering condition for event B1. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.45.008}}. Corresponds to parameter b1-ThresholdCDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b1thresholdCDMA2000 the input value
	 * @return this instance
	 */
	public IRAT withB1thresholdCDMA2000(Long b1thresholdCDMA2000) {
		this.b1thresholdCDMA2000 = b1thresholdCDMA2000;
		return this;
	}

	/**
	 * Get the rscP threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getB2threshold2UTRARSCP() {
		return b2threshold2UTRARSCP;
	}

	/**
	 * Set the rscP threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2UTRARSCP the input value
	 */
	public void  setB2threshold2UTRARSCP(Integer b2threshold2UTRARSCP) {
		this.b2threshold2UTRARSCP = b2threshold2UTRARSCP;
	}

	/**
	 * Set the rscP threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in {{bibref|3GPP-TS.25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-RSCP specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2UTRARSCP the input value
	 * @return this instance
	 */
	public IRAT withB2threshold2UTRARSCP(Integer b2threshold2UTRARSCP) {
		this.b2threshold2UTRARSCP = b2threshold2UTRARSCP;
		return this;
	}

	/**
	 * Get the ecno threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getB2threshold2UTRAEcN0() {
		return b2threshold2UTRAEcN0;
	}

	/**
	 * Set the ecno threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2UTRAEcN0 the input value
	 */
	public void  setB2threshold2UTRAEcN0(Long b2threshold2UTRAEcN0) {
		this.b2threshold2UTRAEcN0 = b2threshold2UTRAEcN0;
	}

	/**
	 * Set the ecno threshold to be used in UTRA measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 25.133}}. Corresponds to parameter b2-Threshold2UTRA:utra-EcNo specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2UTRAEcN0 the input value
	 * @return this instance
	 */
	public IRAT withB2threshold2UTRAEcN0(Long b2threshold2UTRAEcN0) {
		this.b2threshold2UTRAEcN0 = b2threshold2UTRAEcN0;
		return this;
	}

	/**
	 * Get the threshold to be used in GERAN measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2GERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getB2threshold2GERAN() {
		return b2threshold2GERAN;
	}

	/**
	 * Set the threshold to be used in GERAN measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2GERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2GERAN the input value
	 */
	public void  setB2threshold2GERAN(Long b2threshold2GERAN) {
		this.b2threshold2GERAN = b2threshold2GERAN;
	}

	/**
	 * Set the threshold to be used in GERAN measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2GERAN specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2GERAN the input value
	 * @return this instance
	 */
	public IRAT withB2threshold2GERAN(Long b2threshold2GERAN) {
		this.b2threshold2GERAN = b2threshold2GERAN;
		return this;
	}

	/**
	 * Get the threshold to be used in CDMA2000 measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2CDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getB2threshold2CDMA2000() {
		return b2threshold2CDMA2000;
	}

	/**
	 * Set the threshold to be used in CDMA2000 measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2CDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2CDMA2000 the input value
	 */
	public void  setB2threshold2CDMA2000(Long b2threshold2CDMA2000) {
		this.b2threshold2CDMA2000 = b2threshold2CDMA2000;
	}

	/**
	 * Set the threshold to be used in CDMA2000 measurement report triggering condition for event B2. Mapping to actual dBm values is specified in 3GPP TS 45.008}}. Corresponds to parameter b2-Threshold2CDMA2000 specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param b2threshold2CDMA2000 the input value
	 * @return this instance
	 */
	public IRAT withB2threshold2CDMA2000(Long b2threshold2CDMA2000) {
		this.b2threshold2CDMA2000 = b2threshold2CDMA2000;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a hysteresis value applied to entry and leave condition of an IRAT report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHysteresis() {
		if (this.hysteresis == null){ this.hysteresis=new ArrayList<>();}
		return hysteresis;
	}

	/**
	 * Set the {{list}} Each item is a hysteresis value applied to entry and leave condition of an IRAT report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param hysteresis the input value
	 */
	public void  setHysteresis(Collection<String> hysteresis) {
		this.hysteresis = hysteresis;
	}

	/**
	 * Set the {{list}} Each item is a hysteresis value applied to entry and leave condition of an IRAT report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IRAT withHysteresis(String string) {
		getHysteresis().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a time period during which IRAT measurement report triggering condition needs to be met in order to trigger IRAT measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value.. Corresponds to parameter timeToTrigger specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTrigger() {
		return timeToTrigger;
	}

	/**
	 * Set the {{list}} Each item is a time period during which IRAT measurement report triggering condition needs to be met in order to trigger IRAT measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value.. Corresponds to parameter timeToTrigger specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param timeToTrigger the input value
	 */
	public void  setTimeToTrigger(Long timeToTrigger) {
		this.timeToTrigger = timeToTrigger;
	}

	/**
	 * Set the {{list}} Each item is a time period during which IRAT measurement report triggering condition needs to be met in order to trigger IRAT measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value.. Corresponds to parameter timeToTrigger specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param timeToTrigger the input value
	 * @return this instance
	 */
	public IRAT withTimeToTrigger(Long timeToTrigger) {
		this.timeToTrigger = timeToTrigger;
		return this;
	}

	/**
	 * Get the maximum number of IRAT cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxReportCells() {
		return maxReportCells;
	}

	/**
	 * Set the maximum number of IRAT cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param maxReportCells the input value
	 */
	public void  setMaxReportCells(Long maxReportCells) {
		this.maxReportCells = maxReportCells;
	}

	/**
	 * Set the maximum number of IRAT cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param maxReportCells the input value
	 * @return this instance
	 */
	public IRAT withMaxReportCells(Long maxReportCells) {
		this.maxReportCells = maxReportCells;
		return this;
	}

	/**
	 * Get the interval between successive IRAT measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportInterval() {
		return reportInterval;
	}

	/**
	 * Set the interval between successive IRAT measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param reportInterval the input value
	 */
	public void  setReportInterval(Long reportInterval) {
		this.reportInterval = reportInterval;
	}

	/**
	 * Set the interval between successive IRAT measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param reportInterval the input value
	 * @return this instance
	 */
	public IRAT withReportInterval(Long reportInterval) {
		this.reportInterval = reportInterval;
		return this;
	}

	/**
	 * Get the number of times an IRAT measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportAmount() {
		return reportAmount;
	}

	/**
	 * Set the number of times an IRAT measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @param reportAmount the input value
	 */
	public void  setReportAmount(Long reportAmount) {
		this.reportAmount = reportAmount;
	}

	/**
	 * Set the number of times an IRAT measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigInterRAT IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @param reportAmount the input value
	 * @return this instance
	 */
	public IRAT withReportAmount(Long reportAmount) {
		this.reportAmount = reportAmount;
		return this;
	}

	//</editor-fold>

}