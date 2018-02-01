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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the connected mode mobility (handover) configuration within LTE system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.2.1}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.ConnMode.EUTRA.")
public class EUTRA {

	/**
	 * {{list}} Each item is a filtering coefficient used for RSRP measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRP parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterCoefficientRSRP")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> filterCoefficientRSRP;
	/**
	 * {{list}} Each item is a filtering coefficient used for RSRQ measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRQ parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterCoefficientRSRQ")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> filterCoefficientRSRQ;
	/**
	 * Threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a1-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A1ThresholdRSRP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 97)
	public Long a1thresholdRSRP;
	/**
	 * Threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in 3GPP TS 36.133}} table 9.1.7-1. Corresponds to parameter a1-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A1ThresholdRSRQ")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 34)
	public Long a1thresholdRSRQ;
	/**
	 * Threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a2-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A2ThresholdRSRP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 97)
	public Long a2thresholdRSRP;
	/**
	 * Threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.7-1}}. Corresponds to parameter a2-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A2ThresholdRSRQ")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 34)
	public Long a2thresholdRSRQ;
	/**
	 * {{list}} Each item is an offset to be used in evaluation of EUTRA measurement report triggering condition for event A3, with a numeric range between -30 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a3-Offset specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A3Offset")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> a3offset;
	/**
	 * Indicates whether or not the UE shall initiate the measurement reporting procedure when the leaving condition is met for event A3 for a cell in cellsTriggeredList, as specified in {{bibref|3GPP-TS.36.331|Section 5.5.4.1 and Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportOnLeave")
	@CWMPParameter(access = "readWrite")
	public Boolean reportOnLeave;
	/**
	 * Threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A4ThresholdRSRP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 97)
	public Long a4thresholdRSRP;
	/**
	 * Threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A4ThresholdRSRQ")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 34)
	public Long a4thresholdRSRQ;
	/**
	 * Threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A5Threshold1RSRP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 97)
	public Long a5threshold1RSRP;
	/**
	 * Threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A5Threshold1RSRQ")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 34)
	public Long a5threshold1RSRQ;
	/**
	 * Threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A5Threshold2RSRP")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 97)
	public Long a5threshold2RSRP;
	/**
	 * Threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A5Threshold2RSRQ")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 34)
	public Long a5threshold2RSRQ;
	/**
	 * {{list}} Each item is a hysteresis value applied to entry and leave condition of a report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

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
	 * {{list}} Each item is a time period during which measurement report triggering condition needs to be met in order to trigger a measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter timeToTrigger specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTrigger")
	@CWMPParameter(access = "readWrite")
	@Size(min = 5120, max = 5120)
	public Long timeToTrigger;
	/**
	 * Quantities used to evaluate a measurement report triggering condition.  Corresponds to parameter triggerQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TriggerQuantity")
	@CWMPParameter(access = "readWrite")
	public String triggerQuantity;
	/**
	 * Measrument quantities to be included in the measurement report. Corresponds to parameter reportQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The value {{enum|Both}} specifies that both the RSRP and RSRQ quantities are to be included in the measurement report.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportQuantity")
	@CWMPParameter(access = "readWrite")
	public String reportQuantity;
	/**
	 * Maximum number of cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxReportCells")
	@Size(min = 1, max = 8)
	public Long maxReportCells;
	/**
	 * Interval between successive measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportInterval")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 3600000, max = 3600000)
	public Long reportInterval;
	/**
	 * Number of times a measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.  Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportAmount")
	@CWMPParameter(access = "readWrite")
	@Size(min = 64, max = 64)
	public Long reportAmount;

	public EUTRA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a filtering coefficient used for RSRP measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRP parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFilterCoefficientRSRP() {
		if (this.filterCoefficientRSRP == null){ this.filterCoefficientRSRP=new ArrayList<>();}
		return filterCoefficientRSRP;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for RSRP measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRP parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param filterCoefficientRSRP the input value
	 */
	public void  setFilterCoefficientRSRP(Collection<String> filterCoefficientRSRP) {
		this.filterCoefficientRSRP = filterCoefficientRSRP;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for RSRP measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRP parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public EUTRA withFilterCoefficientRSRP(String string) {
		getFilterCoefficientRSRP().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a filtering coefficient used for RSRQ measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRQ parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFilterCoefficientRSRQ() {
		if (this.filterCoefficientRSRQ == null){ this.filterCoefficientRSRQ=new ArrayList<>();}
		return filterCoefficientRSRQ;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for RSRQ measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRQ parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param filterCoefficientRSRQ the input value
	 */
	public void  setFilterCoefficientRSRQ(Collection<String> filterCoefficientRSRQ) {
		this.filterCoefficientRSRQ = filterCoefficientRSRQ;
	}

	/**
	 * Set the {{list}} Each item is a filtering coefficient used for RSRQ measurements, with a numeric range between 0 and 19 inclusive. For values greater than 9, only odd values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to filterCoefficientRSRQ parameter specified in  QuantityConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public EUTRA withFilterCoefficientRSRQ(String string) {
		getFilterCoefficientRSRQ().add(string);
		return this;
	}

	/**
	 * Get the threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a1-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA1thresholdRSRP() {
		return a1thresholdRSRP;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a1-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a1thresholdRSRP the input value
	 */
	public void  setA1thresholdRSRP(Long a1thresholdRSRP) {
		this.a1thresholdRSRP = a1thresholdRSRP;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a1-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a1thresholdRSRP the input value
	 * @return this instance
	 */
	public EUTRA withA1thresholdRSRP(Long a1thresholdRSRP) {
		this.a1thresholdRSRP = a1thresholdRSRP;
		return this;
	}

	/**
	 * Get the threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in 3GPP TS 36.133}} table 9.1.7-1. Corresponds to parameter a1-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA1thresholdRSRQ() {
		return a1thresholdRSRQ;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in 3GPP TS 36.133}} table 9.1.7-1. Corresponds to parameter a1-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a1thresholdRSRQ the input value
	 */
	public void  setA1thresholdRSRQ(Long a1thresholdRSRQ) {
		this.a1thresholdRSRQ = a1thresholdRSRQ;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A1. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in 3GPP TS 36.133}} table 9.1.7-1. Corresponds to parameter a1-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a1thresholdRSRQ the input value
	 * @return this instance
	 */
	public EUTRA withA1thresholdRSRQ(Long a1thresholdRSRQ) {
		this.a1thresholdRSRQ = a1thresholdRSRQ;
		return this;
	}

	/**
	 * Get the threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a2-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA2thresholdRSRP() {
		return a2thresholdRSRP;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a2-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a2thresholdRSRP the input value
	 */
	public void  setA2thresholdRSRP(Long a2thresholdRSRP) {
		this.a2thresholdRSRP = a2thresholdRSRP;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.4-1}}. Corresponds to parameter a2-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a2thresholdRSRP the input value
	 * @return this instance
	 */
	public EUTRA withA2thresholdRSRP(Long a2thresholdRSRP) {
		this.a2thresholdRSRP = a2thresholdRSRP;
		return this;
	}

	/**
	 * Get the threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.7-1}}. Corresponds to parameter a2-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA2thresholdRSRQ() {
		return a2thresholdRSRQ;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.7-1}}. Corresponds to parameter a2-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a2thresholdRSRQ the input value
	 */
	public void  setA2thresholdRSRQ(Long a2thresholdRSRQ) {
		this.a2thresholdRSRQ = a2thresholdRSRQ;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A2. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133|Table 9.1.7-1}}. Corresponds to parameter a2-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a2thresholdRSRQ the input value
	 * @return this instance
	 */
	public EUTRA withA2thresholdRSRQ(Long a2thresholdRSRQ) {
		this.a2thresholdRSRQ = a2thresholdRSRQ;
		return this;
	}

	/**
	 * Get the {{list}} Each item is an offset to be used in evaluation of EUTRA measurement report triggering condition for event A3, with a numeric range between -30 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a3-Offset specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getA3offset() {
		if (this.a3offset == null){ this.a3offset=new ArrayList<>();}
		return a3offset;
	}

	/**
	 * Set the {{list}} Each item is an offset to be used in evaluation of EUTRA measurement report triggering condition for event A3, with a numeric range between -30 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a3-Offset specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param a3offset the input value
	 */
	public void  setA3offset(Collection<String> a3offset) {
		this.a3offset = a3offset;
	}

	/**
	 * Set the {{list}} Each item is an offset to be used in evaluation of EUTRA measurement report triggering condition for event A3, with a numeric range between -30 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a3-Offset specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public EUTRA withA3offset(String string) {
		getA3offset().add(string);
		return this;
	}

	/**
	 * Get the indicates whether or not the UE shall initiate the measurement reporting procedure when the leaving condition is met for event A3 for a cell in cellsTriggeredList, as specified in {{bibref|3GPP-TS.36.331|Section 5.5.4.1 and Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isReportOnLeave() {
		return reportOnLeave;
	}

	/**
	 * Set the indicates whether or not the UE shall initiate the measurement reporting procedure when the leaving condition is met for event A3 for a cell in cellsTriggeredList, as specified in {{bibref|3GPP-TS.36.331|Section 5.5.4.1 and Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param reportOnLeave the input value
	 */
	public void  setReportOnLeave(Boolean reportOnLeave) {
		this.reportOnLeave = reportOnLeave;
	}

	/**
	 * Set the indicates whether or not the UE shall initiate the measurement reporting procedure when the leaving condition is met for event A3 for a cell in cellsTriggeredList, as specified in {{bibref|3GPP-TS.36.331|Section 5.5.4.1 and Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param reportOnLeave the input value
	 * @return this instance
	 */
	public EUTRA withReportOnLeave(Boolean reportOnLeave) {
		this.reportOnLeave = reportOnLeave;
		return this;
	}

	/**
	 * Get the threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA4thresholdRSRP() {
		return a4thresholdRSRP;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a4thresholdRSRP the input value
	 */
	public void  setA4thresholdRSRP(Long a4thresholdRSRP) {
		this.a4thresholdRSRP = a4thresholdRSRP;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a4thresholdRSRP the input value
	 * @return this instance
	 */
	public EUTRA withA4thresholdRSRP(Long a4thresholdRSRP) {
		this.a4thresholdRSRP = a4thresholdRSRP;
		return this;
	}

	/**
	 * Get the threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA4thresholdRSRQ() {
		return a4thresholdRSRQ;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a4thresholdRSRQ the input value
	 */
	public void  setA4thresholdRSRQ(Long a4thresholdRSRQ) {
		this.a4thresholdRSRQ = a4thresholdRSRQ;
	}

	/**
	 * Set the threshold to be used in EUTRA measurement report triggering condition for event A4. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a4-Threshold:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a4thresholdRSRQ the input value
	 * @return this instance
	 */
	public EUTRA withA4thresholdRSRQ(Long a4thresholdRSRQ) {
		this.a4thresholdRSRQ = a4thresholdRSRQ;
		return this;
	}

	/**
	 * Get the threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA5threshold1RSRP() {
		return a5threshold1RSRP;
	}

	/**
	 * Set the threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold1RSRP the input value
	 */
	public void  setA5threshold1RSRP(Long a5threshold1RSRP) {
		this.a5threshold1RSRP = a5threshold1RSRP;
	}

	/**
	 * Set the threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold1RSRP the input value
	 * @return this instance
	 */
	public EUTRA withA5threshold1RSRP(Long a5threshold1RSRP) {
		this.a5threshold1RSRP = a5threshold1RSRP;
		return this;
	}

	/**
	 * Get the threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA5threshold1RSRQ() {
		return a5threshold1RSRQ;
	}

	/**
	 * Set the threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold1RSRQ the input value
	 */
	public void  setA5threshold1RSRQ(Long a5threshold1RSRQ) {
		this.a5threshold1RSRQ = a5threshold1RSRQ;
	}

	/**
	 * Set the threshold1 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold1:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold1RSRQ the input value
	 * @return this instance
	 */
	public EUTRA withA5threshold1RSRQ(Long a5threshold1RSRQ) {
		this.a5threshold1RSRQ = a5threshold1RSRQ;
		return this;
	}

	/**
	 * Get the threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA5threshold2RSRP() {
		return a5threshold2RSRP;
	}

	/**
	 * Set the threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold2RSRP the input value
	 */
	public void  setA5threshold2RSRP(Long a5threshold2RSRP) {
		this.a5threshold2RSRP = a5threshold2RSRP;
	}

	/**
	 * Set the threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRP|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRP specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold2RSRP the input value
	 * @return this instance
	 */
	public EUTRA withA5threshold2RSRP(Long a5threshold2RSRP) {
		this.a5threshold2RSRP = a5threshold2RSRP;
		return this;
	}

	/**
	 * Get the threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getA5threshold2RSRQ() {
		return a5threshold2RSRQ;
	}

	/**
	 * Set the threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold2RSRQ the input value
	 */
	public void  setA5threshold2RSRQ(Long a5threshold2RSRQ) {
		this.a5threshold2RSRQ = a5threshold2RSRQ;
	}

	/**
	 * Set the threshold2 to be used in EUTRA measurement report triggering condition for event A5. Valid only if {{param|TriggerQuantity}} is {{enum|RSRQ|TriggerQuantity}}. Mapping to actual values is specified in {{bibref|3GPP-TS.36.133}}. Corresponds to parameter a5-Threshold2:threshold-RSRQ specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param a5threshold2RSRQ the input value
	 * @return this instance
	 */
	public EUTRA withA5threshold2RSRQ(Long a5threshold2RSRQ) {
		this.a5threshold2RSRQ = a5threshold2RSRQ;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a hysteresis value applied to entry and leave condition of a report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

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
	 * Set the {{list}} Each item is a hysteresis value applied to entry and leave condition of a report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

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
	 * Set the {{list}} Each item is a hysteresis value applied to entry and leave condition of a report triggering event, with a numeric range between 0 and 30 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter hysteresis specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public EUTRA withHysteresis(String string) {
		getHysteresis().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a time period during which measurement report triggering condition needs to be met in order to trigger a measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter timeToTrigger specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTrigger() {
		return timeToTrigger;
	}

	/**
	 * Set the {{list}} Each item is a time period during which measurement report triggering condition needs to be met in order to trigger a measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter timeToTrigger specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param timeToTrigger the input value
	 */
	public void  setTimeToTrigger(Long timeToTrigger) {
		this.timeToTrigger = timeToTrigger;
	}

	/**
	 * Set the {{list}} Each item is a time period during which measurement report triggering condition needs to be met in order to trigger a measurement report, specified in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter timeToTrigger specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param timeToTrigger the input value
	 * @return this instance
	 */
	public EUTRA withTimeToTrigger(Long timeToTrigger) {
		this.timeToTrigger = timeToTrigger;
		return this;
	}

	/**
	 * Get the quantities used to evaluate a measurement report triggering condition.  Corresponds to parameter triggerQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTriggerQuantity() {
		return triggerQuantity;
	}

	/**
	 * Set the quantities used to evaluate a measurement report triggering condition.  Corresponds to parameter triggerQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param triggerQuantity the input value
	 */
	public void  setTriggerQuantity(String triggerQuantity) {
		this.triggerQuantity = triggerQuantity;
	}

	/**
	 * Set the quantities used to evaluate a measurement report triggering condition.  Corresponds to parameter triggerQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param triggerQuantity the input value
	 * @return this instance
	 */
	public EUTRA withTriggerQuantity(String triggerQuantity) {
		this.triggerQuantity = triggerQuantity;
		return this;
	}

	/**
	 * Get the measrument quantities to be included in the measurement report. Corresponds to parameter reportQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The value {{enum|Both}} specifies that both the RSRP and RSRQ quantities are to be included in the measurement report.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getReportQuantity() {
		return reportQuantity;
	}

	/**
	 * Set the measrument quantities to be included in the measurement report. Corresponds to parameter reportQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The value {{enum|Both}} specifies that both the RSRP and RSRQ quantities are to be included in the measurement report.
	 *
	 * @since 2.0
	 * @param reportQuantity the input value
	 */
	public void  setReportQuantity(String reportQuantity) {
		this.reportQuantity = reportQuantity;
	}

	/**
	 * Set the measrument quantities to be included in the measurement report. Corresponds to parameter reportQuantity specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}. The value {{enum|Both}} specifies that both the RSRP and RSRQ quantities are to be included in the measurement report.
	 *
	 * @since 2.0
	 * @param reportQuantity the input value
	 * @return this instance
	 */
	public EUTRA withReportQuantity(String reportQuantity) {
		this.reportQuantity = reportQuantity;
		return this;
	}

	/**
	 * Get the maximum number of cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxReportCells() {
		return maxReportCells;
	}

	/**
	 * Set the maximum number of cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param maxReportCells the input value
	 */
	public void  setMaxReportCells(Long maxReportCells) {
		this.maxReportCells = maxReportCells;
	}

	/**
	 * Set the maximum number of cells that can be included in a measurement report.  Corresponds to parameter maxReportCells specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param maxReportCells the input value
	 * @return this instance
	 */
	public EUTRA withMaxReportCells(Long maxReportCells) {
		this.maxReportCells = maxReportCells;
		return this;
	}

	/**
	 * Get the interval between successive measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportInterval() {
		return reportInterval;
	}

	/**
	 * Set the interval between successive measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param reportInterval the input value
	 */
	public void  setReportInterval(Long reportInterval) {
		this.reportInterval = reportInterval;
	}

	/**
	 * Set the interval between successive measurement reports, specified in milliseconds.  Corresponds to parameter reportInterval specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.
	 *
	 * @since 2.0
	 * @param reportInterval the input value
	 * @return this instance
	 */
	public EUTRA withReportInterval(Long reportInterval) {
		this.reportInterval = reportInterval;
		return this;
	}

	/**
	 * Get the number of times a measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.  Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportAmount() {
		return reportAmount;
	}

	/**
	 * Set the number of times a measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.  Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @param reportAmount the input value
	 */
	public void  setReportAmount(Long reportAmount) {
		this.reportAmount = reportAmount;
	}

	/**
	 * Set the number of times a measurement report is sent. Corresponds to parameter reportAmount specified in ReportConfigEUTRA IE in {{bibref|3GPP-TS.36.331|Section 6.3.5}}.  Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @param reportAmount the input value
	 * @return this instance
	 */
	public EUTRA withReportAmount(Long reportAmount) {
		this.reportAmount = reportAmount;
		return this;
	}

	//</editor-fold>

}