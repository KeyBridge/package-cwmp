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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.intrafreqmeas.Instance;

	/**
	 * This object contains parameters relating to the intra-freq HO control parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.IntraFreqMeas.")
public class IntraFreqMeas {

	/**
	 * Defines the measurement quantity for intra-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.38}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeasurementQuantity")
	@CWMPParameter(access = "readWrite")
	public String measurementQuantity;
	/**
	 * Defines the equivalent time constant of the low pass filter applied to the CPICH quality measurements, or {{enum|CPICH Ec/No|MeasurementQuantity}}.

{{bibref|3GPP-TS.25.331|Section 8.6.7.2 and Section 10.3.7.9}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterCoefficient")
	@CWMPParameter(access = "readWrite")
	@Size(min = 19, max = 19)
	public Long filterCoefficient;
	/**
	 * {{list}} Each entry is an Event ID from the list of: 1a, 1b, 1c, 1d, 1e, 1f, 1g, 1h, 1i

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.34}}

Since the FAP can determine this on its own, it might not be necessary to configure it.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IntraFrequencyEventIdentity")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> intraFrequencyEventIdentity;
	/**
	 * {{list}} Indicates which cells can trigger Event 1a. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TriggeringCondition2Event1a")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> triggeringCondition2Event1a;
	/**
	 * {{list}} Indicates which cells can trigger Event 1b. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TriggeringCondition1Event1b")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> triggeringCondition1Event1b;
	/**
	 * {{list}} Indicates which cells can trigger Event 1e. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TriggeringCondition2Event1e")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> triggeringCondition2Event1e;
	/**
	 * {{list}} Indicates which cells can trigger Event 1f. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TriggeringCondition1Event1f")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> triggeringCondition1Event1f;
	/**
	 * Defines a constant in the inequality criterion that needs to be satisfied for an Event 1a to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportingRangeEvent1a")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 29)
	public Long reportingRangeEvent1a;
	/**
	 * Defines a constant in the inequality criterion that needs to be satisfied for an Event 1b to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportingRangeEvent1b")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 29)
	public Long reportingRangeEvent1b;
	/**
	 * Defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactorEvent1a")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactorEvent1a;
	/**
	 * Defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactorEvent1b")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactorEvent1b;
	/**
	 * Defines the maximum number of cells allowed in the "active cell set" for Event 1a to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportDeactivationThresholdEvent1a")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long reportDeactivationThresholdEvent1a;
	/**
	 * Defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportingAmountEvent1a")
	@CWMPParameter(access = "readWrite")
	@Size(min = 64, max = 64)
	public Integer reportingAmountEvent1a;
	/**
	 * Defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportingAmountEvent1c")
	@CWMPParameter(access = "readWrite")
	@Size(min = 64, max = 64)
	public Integer reportingAmountEvent1c;
	/**
	 * Defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportingIntervalEvent1a")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 16000, max = 16000)
	public Long reportingIntervalEvent1a;
	/**
	 * Defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportingIntervalEvent1c")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 16000, max = 16000)
	public Long reportingIntervalEvent1c;
	/**
	 * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent1a")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresisEvent1a;
	/**
	 * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent1b")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresisEvent1b;
	/**
	 * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent1c")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresisEvent1c;
	/**
	 * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent1d")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresisEvent1d;
	/**
	 * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent1e")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresisEvent1e;
	/**
	 * Defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent1f")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresisEvent1f;
	/**
	 * Defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent1a")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent1a;
	/**
	 * Defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent1b")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent1b;
	/**
	 * Defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent1c")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent1c;
	/**
	 * Defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent1d")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent1d;
	/**
	 * Defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent1e")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent1e;
	/**
	 * Defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent1f")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent1f;
	/**
	 * Defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdUsedFrequencyEvent1e")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = 165)
	public Integer thresholdUsedFrequencyEvent1e;
	/**
	 * Defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdUsedFrequencyEvent1f")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = 165)
	public Integer thresholdUsedFrequencyEvent1f;
	/**
	 * Defines the minimum number of cells allowed in the "active cell set" for Event 1c to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReplacementActivationThresholdEvent1c")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long replacementActivationThresholdEvent1c;
	/**
	 * Table containing parameters relating to a particular instance of intra-freq events.
	 */
	@XmlElementWrapper(name = "Instances")
	@XmlElement(name = "Instance")
	@CWMPParameter(access = "readWrite")
	public Collection<Instance> instances;

	public IntraFreqMeas() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the measurement quantity for intra-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.38}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMeasurementQuantity() {
		return measurementQuantity;
	}

	/**
	 * Set the defines the measurement quantity for intra-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.38}}
	 *
	 * @since 2.0
	 * @param measurementQuantity the input value
	 */
	public void  setMeasurementQuantity(String measurementQuantity) {
		this.measurementQuantity = measurementQuantity;
	}

	/**
	 * Set the defines the measurement quantity for intra-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.38}}
	 *
	 * @since 2.0
	 * @param measurementQuantity the input value
	 * @return this instance
	 */
	public IntraFreqMeas withMeasurementQuantity(String measurementQuantity) {
		this.measurementQuantity = measurementQuantity;
		return this;
	}

	/**
	 * Get the defines the equivalent time constant of the low pass filter applied to the CPICH quality measurements, or {{enum|CPICH Ec/No|MeasurementQuantity}}.

{{bibref|3GPP-TS.25.331|Section 8.6.7.2 and Section 10.3.7.9}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFilterCoefficient() {
		return filterCoefficient;
	}

	/**
	 * Set the defines the equivalent time constant of the low pass filter applied to the CPICH quality measurements, or {{enum|CPICH Ec/No|MeasurementQuantity}}.

{{bibref|3GPP-TS.25.331|Section 8.6.7.2 and Section 10.3.7.9}}
	 *
	 * @since 2.0
	 * @param filterCoefficient the input value
	 */
	public void  setFilterCoefficient(Long filterCoefficient) {
		this.filterCoefficient = filterCoefficient;
	}

	/**
	 * Set the defines the equivalent time constant of the low pass filter applied to the CPICH quality measurements, or {{enum|CPICH Ec/No|MeasurementQuantity}}.

{{bibref|3GPP-TS.25.331|Section 8.6.7.2 and Section 10.3.7.9}}
	 *
	 * @since 2.0
	 * @param filterCoefficient the input value
	 * @return this instance
	 */
	public IntraFreqMeas withFilterCoefficient(Long filterCoefficient) {
		this.filterCoefficient = filterCoefficient;
		return this;
	}

	/**
	 * Get the {{list}} Each entry is an Event ID from the list of: 1a, 1b, 1c, 1d, 1e, 1f, 1g, 1h, 1i

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.34}}

Since the FAP can determine this on its own, it might not be necessary to configure it.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getIntraFrequencyEventIdentity() {
		if (this.intraFrequencyEventIdentity == null){ this.intraFrequencyEventIdentity=new ArrayList<>();}
		return intraFrequencyEventIdentity;
	}

	/**
	 * Set the {{list}} Each entry is an Event ID from the list of: 1a, 1b, 1c, 1d, 1e, 1f, 1g, 1h, 1i

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.34}}

Since the FAP can determine this on its own, it might not be necessary to configure it.
	 *
	 * @since 2.0
	 * @param intraFrequencyEventIdentity the input value
	 */
	public void  setIntraFrequencyEventIdentity(Collection<String> intraFrequencyEventIdentity) {
		this.intraFrequencyEventIdentity = intraFrequencyEventIdentity;
	}

	/**
	 * Set the {{list}} Each entry is an Event ID from the list of: 1a, 1b, 1c, 1d, 1e, 1f, 1g, 1h, 1i

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.34}}

Since the FAP can determine this on its own, it might not be necessary to configure it.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreqMeas withIntraFrequencyEventIdentity(String string) {
		getIntraFrequencyEventIdentity().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates which cells can trigger Event 1a. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTriggeringCondition2Event1a() {
		if (this.triggeringCondition2Event1a == null){ this.triggeringCondition2Event1a=new ArrayList<>();}
		return triggeringCondition2Event1a;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1a. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param triggeringCondition2Event1a the input value
	 */
	public void  setTriggeringCondition2Event1a(Collection<String> triggeringCondition2Event1a) {
		this.triggeringCondition2Event1a = triggeringCondition2Event1a;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1a. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTriggeringCondition2Event1a(String string) {
		getTriggeringCondition2Event1a().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates which cells can trigger Event 1b. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTriggeringCondition1Event1b() {
		if (this.triggeringCondition1Event1b == null){ this.triggeringCondition1Event1b=new ArrayList<>();}
		return triggeringCondition1Event1b;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1b. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param triggeringCondition1Event1b the input value
	 */
	public void  setTriggeringCondition1Event1b(Collection<String> triggeringCondition1Event1b) {
		this.triggeringCondition1Event1b = triggeringCondition1Event1b;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1b. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTriggeringCondition1Event1b(String string) {
		getTriggeringCondition1Event1b().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates which cells can trigger Event 1e. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTriggeringCondition2Event1e() {
		if (this.triggeringCondition2Event1e == null){ this.triggeringCondition2Event1e=new ArrayList<>();}
		return triggeringCondition2Event1e;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1e. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param triggeringCondition2Event1e the input value
	 */
	public void  setTriggeringCondition2Event1e(Collection<String> triggeringCondition2Event1e) {
		this.triggeringCondition2Event1e = triggeringCondition2Event1e;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1e. 

Enumerated value must be one of [Active, Monitored, Active and Monitored, Detected, Detected and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTriggeringCondition2Event1e(String string) {
		getTriggeringCondition2Event1e().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates which cells can trigger Event 1f. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTriggeringCondition1Event1f() {
		if (this.triggeringCondition1Event1f == null){ this.triggeringCondition1Event1f=new ArrayList<>();}
		return triggeringCondition1Event1f;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1f. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param triggeringCondition1Event1f the input value
	 */
	public void  setTriggeringCondition1Event1f(Collection<String> triggeringCondition1Event1f) {
		this.triggeringCondition1Event1f = triggeringCondition1Event1f;
	}

	/**
	 * Set the {{list}} Indicates which cells can trigger Event 1f. 

Enumerated value must be one of [Active, Monitored, Active and Monitored]

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTriggeringCondition1Event1f(String string) {
		getTriggeringCondition1Event1f().add(string);
		return this;
	}

	/**
	 * Get the defines a constant in the inequality criterion that needs to be satisfied for an Event 1a to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportingRangeEvent1a() {
		return reportingRangeEvent1a;
	}

	/**
	 * Set the defines a constant in the inequality criterion that needs to be satisfied for an Event 1a to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingRangeEvent1a the input value
	 */
	public void  setReportingRangeEvent1a(Long reportingRangeEvent1a) {
		this.reportingRangeEvent1a = reportingRangeEvent1a;
	}

	/**
	 * Set the defines a constant in the inequality criterion that needs to be satisfied for an Event 1a to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingRangeEvent1a the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReportingRangeEvent1a(Long reportingRangeEvent1a) {
		this.reportingRangeEvent1a = reportingRangeEvent1a;
		return this;
	}

	/**
	 * Get the defines a constant in the inequality criterion that needs to be satisfied for an Event 1b to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportingRangeEvent1b() {
		return reportingRangeEvent1b;
	}

	/**
	 * Set the defines a constant in the inequality criterion that needs to be satisfied for an Event 1b to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingRangeEvent1b the input value
	 */
	public void  setReportingRangeEvent1b(Long reportingRangeEvent1b) {
		this.reportingRangeEvent1b = reportingRangeEvent1b;
	}

	/**
	 * Set the defines a constant in the inequality criterion that needs to be satisfied for an Event 1b to occur.

Actual values of the range are 0.0 to 14.5 dB in steps of 0.5 dB. The value of {{param}} divided by 2 yields the actual value of the range.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingRangeEvent1b the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReportingRangeEvent1b(Long reportingRangeEvent1b) {
		this.reportingRangeEvent1b = reportingRangeEvent1b;
		return this;
	}

	/**
	 * Get the defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeightingFactorEvent1a() {
		return weightingFactorEvent1a;
	}

	/**
	 * Set the defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent1a the input value
	 */
	public void  setWeightingFactorEvent1a(Long weightingFactorEvent1a) {
		this.weightingFactorEvent1a = weightingFactorEvent1a;
	}

	/**
	 * Set the defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent1a the input value
	 * @return this instance
	 */
	public IntraFreqMeas withWeightingFactorEvent1a(Long weightingFactorEvent1a) {
		this.weightingFactorEvent1a = weightingFactorEvent1a;
		return this;
	}

	/**
	 * Get the defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeightingFactorEvent1b() {
		return weightingFactorEvent1b;
	}

	/**
	 * Set the defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent1b the input value
	 */
	public void  setWeightingFactorEvent1b(Long weightingFactorEvent1b) {
		this.weightingFactorEvent1b = weightingFactorEvent1b;
	}

	/**
	 * Set the defines the weighting factor for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent1b the input value
	 * @return this instance
	 */
	public IntraFreqMeas withWeightingFactorEvent1b(Long weightingFactorEvent1b) {
		this.weightingFactorEvent1b = weightingFactorEvent1b;
		return this;
	}

	/**
	 * Get the defines the maximum number of cells allowed in the "active cell set" for Event 1a to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportDeactivationThresholdEvent1a() {
		return reportDeactivationThresholdEvent1a;
	}

	/**
	 * Set the defines the maximum number of cells allowed in the "active cell set" for Event 1a to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportDeactivationThresholdEvent1a the input value
	 */
	public void  setReportDeactivationThresholdEvent1a(Long reportDeactivationThresholdEvent1a) {
		this.reportDeactivationThresholdEvent1a = reportDeactivationThresholdEvent1a;
	}

	/**
	 * Set the defines the maximum number of cells allowed in the "active cell set" for Event 1a to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportDeactivationThresholdEvent1a the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReportDeactivationThresholdEvent1a(Long reportDeactivationThresholdEvent1a) {
		this.reportDeactivationThresholdEvent1a = reportDeactivationThresholdEvent1a;
		return this;
	}

	/**
	 * Get the defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getReportingAmountEvent1a() {
		return reportingAmountEvent1a;
	}

	/**
	 * Set the defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingAmountEvent1a the input value
	 */
	public void  setReportingAmountEvent1a(Integer reportingAmountEvent1a) {
		this.reportingAmountEvent1a = reportingAmountEvent1a;
	}

	/**
	 * Set the defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingAmountEvent1a the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReportingAmountEvent1a(Integer reportingAmountEvent1a) {
		this.reportingAmountEvent1a = reportingAmountEvent1a;
		return this;
	}

	/**
	 * Get the defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getReportingAmountEvent1c() {
		return reportingAmountEvent1c;
	}

	/**
	 * Set the defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingAmountEvent1c the input value
	 */
	public void  setReportingAmountEvent1c(Integer reportingAmountEvent1c) {
		this.reportingAmountEvent1c = reportingAmountEvent1c;
	}

	/**
	 * Set the defines the maximum number of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c

The value -1 is used to represent an unbounded maximum.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingAmountEvent1c the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReportingAmountEvent1c(Integer reportingAmountEvent1c) {
		this.reportingAmountEvent1c = reportingAmountEvent1c;
		return this;
	}

	/**
	 * Get the defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportingIntervalEvent1a() {
		return reportingIntervalEvent1a;
	}

	/**
	 * Set the defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingIntervalEvent1a the input value
	 */
	public void  setReportingIntervalEvent1a(Long reportingIntervalEvent1a) {
		this.reportingIntervalEvent1a = reportingIntervalEvent1a;
	}

	/**
	 * Set the defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1a.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingIntervalEvent1a the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReportingIntervalEvent1a(Long reportingIntervalEvent1a) {
		this.reportingIntervalEvent1a = reportingIntervalEvent1a;
		return this;
	}

	/**
	 * Get the defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReportingIntervalEvent1c() {
		return reportingIntervalEvent1c;
	}

	/**
	 * Set the defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingIntervalEvent1c the input value
	 */
	public void  setReportingIntervalEvent1c(Long reportingIntervalEvent1c) {
		this.reportingIntervalEvent1c = reportingIntervalEvent1c;
	}

	/**
	 * Set the defines the transmission period in milliseconds of MEASUREMENT REPORT messages sent by the UE in case of periodic reporting triggered by an Event 1c.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param reportingIntervalEvent1c the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReportingIntervalEvent1c(Long reportingIntervalEvent1c) {
		this.reportingIntervalEvent1c = reportingIntervalEvent1c;
		return this;
	}

	/**
	 * Get the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent1a() {
		return hysteresisEvent1a;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1a the input value
	 */
	public void  setHysteresisEvent1a(Long hysteresisEvent1a) {
		this.hysteresisEvent1a = hysteresisEvent1a;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1a the input value
	 * @return this instance
	 */
	public IntraFreqMeas withHysteresisEvent1a(Long hysteresisEvent1a) {
		this.hysteresisEvent1a = hysteresisEvent1a;
		return this;
	}

	/**
	 * Get the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent1b() {
		return hysteresisEvent1b;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1b the input value
	 */
	public void  setHysteresisEvent1b(Long hysteresisEvent1b) {
		this.hysteresisEvent1b = hysteresisEvent1b;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1b the input value
	 * @return this instance
	 */
	public IntraFreqMeas withHysteresisEvent1b(Long hysteresisEvent1b) {
		this.hysteresisEvent1b = hysteresisEvent1b;
		return this;
	}

	/**
	 * Get the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent1c() {
		return hysteresisEvent1c;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1c the input value
	 */
	public void  setHysteresisEvent1c(Long hysteresisEvent1c) {
		this.hysteresisEvent1c = hysteresisEvent1c;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1c the input value
	 * @return this instance
	 */
	public IntraFreqMeas withHysteresisEvent1c(Long hysteresisEvent1c) {
		this.hysteresisEvent1c = hysteresisEvent1c;
		return this;
	}

	/**
	 * Get the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent1d() {
		return hysteresisEvent1d;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1d the input value
	 */
	public void  setHysteresisEvent1d(Long hysteresisEvent1d) {
		this.hysteresisEvent1d = hysteresisEvent1d;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1d the input value
	 * @return this instance
	 */
	public IntraFreqMeas withHysteresisEvent1d(Long hysteresisEvent1d) {
		this.hysteresisEvent1d = hysteresisEvent1d;
		return this;
	}

	/**
	 * Get the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent1e() {
		return hysteresisEvent1e;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1e the input value
	 */
	public void  setHysteresisEvent1e(Long hysteresisEvent1e) {
		this.hysteresisEvent1e = hysteresisEvent1e;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1e the input value
	 * @return this instance
	 */
	public IntraFreqMeas withHysteresisEvent1e(Long hysteresisEvent1e) {
		this.hysteresisEvent1e = hysteresisEvent1e;
		return this;
	}

	/**
	 * Get the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent1f() {
		return hysteresisEvent1f;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1f the input value
	 */
	public void  setHysteresisEvent1f(Long hysteresisEvent1f) {
		this.hysteresisEvent1f = hysteresisEvent1f;
	}

	/**
	 * Set the defines the hysteresis for intra-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 14.1.2}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent1f the input value
	 * @return this instance
	 */
	public IntraFreqMeas withHysteresisEvent1f(Long hysteresisEvent1f) {
		this.hysteresisEvent1f = hysteresisEvent1f;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent1a() {
		return timeToTriggerEvent1a;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1a the input value
	 */
	public void  setTimeToTriggerEvent1a(Long timeToTriggerEvent1a) {
		this.timeToTriggerEvent1a = timeToTriggerEvent1a;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1a the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTimeToTriggerEvent1a(Long timeToTriggerEvent1a) {
		this.timeToTriggerEvent1a = timeToTriggerEvent1a;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent1b() {
		return timeToTriggerEvent1b;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1b the input value
	 */
	public void  setTimeToTriggerEvent1b(Long timeToTriggerEvent1b) {
		this.timeToTriggerEvent1b = timeToTriggerEvent1b;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1b the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTimeToTriggerEvent1b(Long timeToTriggerEvent1b) {
		this.timeToTriggerEvent1b = timeToTriggerEvent1b;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent1c() {
		return timeToTriggerEvent1c;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1c the input value
	 */
	public void  setTimeToTriggerEvent1c(Long timeToTriggerEvent1c) {
		this.timeToTriggerEvent1c = timeToTriggerEvent1c;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1c the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTimeToTriggerEvent1c(Long timeToTriggerEvent1c) {
		this.timeToTriggerEvent1c = timeToTriggerEvent1c;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent1d() {
		return timeToTriggerEvent1d;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1d the input value
	 */
	public void  setTimeToTriggerEvent1d(Long timeToTriggerEvent1d) {
		this.timeToTriggerEvent1d = timeToTriggerEvent1d;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1d the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTimeToTriggerEvent1d(Long timeToTriggerEvent1d) {
		this.timeToTriggerEvent1d = timeToTriggerEvent1d;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent1e() {
		return timeToTriggerEvent1e;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1e the input value
	 */
	public void  setTimeToTriggerEvent1e(Long timeToTriggerEvent1e) {
		this.timeToTriggerEvent1e = timeToTriggerEvent1e;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1e the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTimeToTriggerEvent1e(Long timeToTriggerEvent1e) {
		this.timeToTriggerEvent1e = timeToTriggerEvent1e;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent1f() {
		return timeToTriggerEvent1f;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1f the input value
	 */
	public void  setTimeToTriggerEvent1f(Long timeToTriggerEvent1f) {
		this.timeToTriggerEvent1f = timeToTriggerEvent1f;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for intra-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent1f the input value
	 * @return this instance
	 */
	public IntraFreqMeas withTimeToTriggerEvent1f(Long timeToTriggerEvent1f) {
		this.timeToTriggerEvent1f = timeToTriggerEvent1f;
		return this;
	}

	/**
	 * Get the defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdUsedFrequencyEvent1e() {
		return thresholdUsedFrequencyEvent1e;
	}

	/**
	 * Set the defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent1e the input value
	 */
	public void  setThresholdUsedFrequencyEvent1e(Integer thresholdUsedFrequencyEvent1e) {
		this.thresholdUsedFrequencyEvent1e = thresholdUsedFrequencyEvent1e;
	}

	/**
	 * Set the defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent1e the input value
	 * @return this instance
	 */
	public IntraFreqMeas withThresholdUsedFrequencyEvent1e(Integer thresholdUsedFrequencyEvent1e) {
		this.thresholdUsedFrequencyEvent1e = thresholdUsedFrequencyEvent1e;
		return this;
	}

	/**
	 * Get the defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdUsedFrequencyEvent1f() {
		return thresholdUsedFrequencyEvent1f;
	}

	/**
	 * Set the defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent1f the input value
	 */
	public void  setThresholdUsedFrequencyEvent1f(Integer thresholdUsedFrequencyEvent1f) {
		this.thresholdUsedFrequencyEvent1f = thresholdUsedFrequencyEvent1f;
	}

	/**
	 * Set the defines the reporting threshold for intra-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.39}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB

{{enum|Pathloss|MeasurementQuantity}} has a range of 30 dB to 165 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent1f the input value
	 * @return this instance
	 */
	public IntraFreqMeas withThresholdUsedFrequencyEvent1f(Integer thresholdUsedFrequencyEvent1f) {
		this.thresholdUsedFrequencyEvent1f = thresholdUsedFrequencyEvent1f;
		return this;
	}

	/**
	 * Get the defines the minimum number of cells allowed in the "active cell set" for Event 1c to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReplacementActivationThresholdEvent1c() {
		return replacementActivationThresholdEvent1c;
	}

	/**
	 * Set the defines the minimum number of cells allowed in the "active cell set" for Event 1c to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param replacementActivationThresholdEvent1c the input value
	 */
	public void  setReplacementActivationThresholdEvent1c(Long replacementActivationThresholdEvent1c) {
		this.replacementActivationThresholdEvent1c = replacementActivationThresholdEvent1c;
	}

	/**
	 * Set the defines the minimum number of cells allowed in the "active cell set" for Event 1c to occur.

{{bibref|3GPP-TS.25.331|Section 14.1.2 and Section 10.3.7.39}}
	 *
	 * @since 2.0
	 * @param replacementActivationThresholdEvent1c the input value
	 * @return this instance
	 */
	public IntraFreqMeas withReplacementActivationThresholdEvent1c(Long replacementActivationThresholdEvent1c) {
		this.replacementActivationThresholdEvent1c = replacementActivationThresholdEvent1c;
		return this;
	}

	/**
	 * Get the table containing parameters relating to a particular instance of intra-freq events.
	 *
	 * @return the value
	 */
	public Collection<Instance> getInstances() {
		if (this.instances == null){ this.instances=new ArrayList<>();}
		return instances;
	}

	/**
	 * Set the table containing parameters relating to a particular instance of intra-freq events.
	 *
	 * @param instances the input value
	 */
	public void  setInstances(Collection<Instance> instances) {
		this.instances = instances;
	}

	/**
	 * Set the table containing parameters relating to a particular instance of intra-freq events.
	 *
	 * @param instance the input value
	 * @return this instance
	 */
	public IntraFreqMeas withInstance(Instance instance) {
		getInstances().add(instance);
		return this;
	}

	//</editor-fold>

}