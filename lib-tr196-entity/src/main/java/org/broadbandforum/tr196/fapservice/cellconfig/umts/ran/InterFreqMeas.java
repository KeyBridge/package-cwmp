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
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.interfreqmeas.Instance;

	/**
	 * This object contains parameters relating to the inter-freq HO related control parameters.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.InterFreqMeas.")
public class InterFreqMeas {

	/**
	 * Defines the measurement quantity for inter-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.18}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MeasurementQuantity")
	@CWMPParameter(access = "readWrite")
	public String measurementQuantity;
	/**
	 * Defines the filter coefficient for inter-freq HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.18}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FilterCoefficient")
	@CWMPParameter(access = "readWrite")
	@Size(min = 19, max = 19)
	public Long filterCoefficient;
	/**
	 * {{list}} Each entry is an Event ID from the list of: 2a, 2b, 2c, 2d, 2e,2f

Defines the identity of the event used to trigger inter-frequency UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterFrequencyEventIdentity")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> interFrequencyEventIdentity;
	/**
	 * Defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactorEvent2a")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactorEvent2a;
	/**
	 * Defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactorEvent2b")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactorEvent2b;
	/**
	 * Defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactorEvent2d")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactorEvent2d;
	/**
	 * Defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactorEvent2f")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactorEvent2f;
	/**
	 * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent2a")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 29)
	public Long hysteresisEvent2a;
	/**
	 * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent2b")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 29)
	public Long hysteresisEvent2b;
	/**
	 * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent2d")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 29)
	public Long hysteresisEvent2d;
	/**
	 * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HysteresisEvent2f")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 29)
	public Long hysteresisEvent2f;
	/**
	 * Defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent2a")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent2a;
	/**
	 * Defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent2b")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent2b;
	/**
	 * Defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent2d")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent2d;
	/**
	 * Defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTriggerEvent2f")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTriggerEvent2f;
	/**
	 * Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdUsedFrequencyEvent2b")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = 0)
	public Integer thresholdUsedFrequencyEvent2b;
	/**
	 * Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdUsedFrequencyEvent2d")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = 0)
	public Integer thresholdUsedFrequencyEvent2d;
	/**
	 * Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdUsedFrequencyEvent2f")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = 0)
	public Integer thresholdUsedFrequencyEvent2f;
	/**
	 * Table containing parameters relating to a particular instance of inter-freq events.
	 */
	@XmlElementWrapper(name = "Instances")
	@XmlElement(name = "Instance")
	@CWMPParameter(access = "readWrite")
	public Collection<Instance> instances;

	public InterFreqMeas() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the measurement quantity for inter-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.18}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMeasurementQuantity() {
		return measurementQuantity;
	}

	/**
	 * Set the defines the measurement quantity for inter-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.18}}
	 *
	 * @since 2.0
	 * @param measurementQuantity the input value
	 */
	public void  setMeasurementQuantity(String measurementQuantity) {
		this.measurementQuantity = measurementQuantity;
	}

	/**
	 * Set the defines the measurement quantity for inter-freq HO measurement when the UE is in Cell-DCH state.

Enumeration of:

{{enum}}

{{bibref|3GPP-TS.25.331|Section 10.3.7.18}}
	 *
	 * @since 2.0
	 * @param measurementQuantity the input value
	 * @return this instance
	 */
	public InterFreqMeas withMeasurementQuantity(String measurementQuantity) {
		this.measurementQuantity = measurementQuantity;
		return this;
	}

	/**
	 * Get the defines the filter coefficient for inter-freq HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.18}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFilterCoefficient() {
		return filterCoefficient;
	}

	/**
	 * Set the defines the filter coefficient for inter-freq HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.18}}
	 *
	 * @since 2.0
	 * @param filterCoefficient the input value
	 */
	public void  setFilterCoefficient(Long filterCoefficient) {
		this.filterCoefficient = filterCoefficient;
	}

	/**
	 * Set the defines the filter coefficient for inter-freq HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.18}}
	 *
	 * @since 2.0
	 * @param filterCoefficient the input value
	 * @return this instance
	 */
	public InterFreqMeas withFilterCoefficient(Long filterCoefficient) {
		this.filterCoefficient = filterCoefficient;
		return this;
	}

	/**
	 * Get the {{list}} Each entry is an Event ID from the list of: 2a, 2b, 2c, 2d, 2e,2f

Defines the identity of the event used to trigger inter-frequency UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getInterFrequencyEventIdentity() {
		if (this.interFrequencyEventIdentity == null){ this.interFrequencyEventIdentity=new ArrayList<>();}
		return interFrequencyEventIdentity;
	}

	/**
	 * Set the {{list}} Each entry is an Event ID from the list of: 2a, 2b, 2c, 2d, 2e,2f

Defines the identity of the event used to trigger inter-frequency UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}
	 *
	 * @since 2.0
	 * @param interFrequencyEventIdentity the input value
	 */
	public void  setInterFrequencyEventIdentity(Collection<String> interFrequencyEventIdentity) {
		this.interFrequencyEventIdentity = interFrequencyEventIdentity;
	}

	/**
	 * Set the {{list}} Each entry is an Event ID from the list of: 2a, 2b, 2c, 2d, 2e,2f

Defines the identity of the event used to trigger inter-frequency UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public InterFreqMeas withInterFrequencyEventIdentity(String string) {
		getInterFrequencyEventIdentity().add(string);
		return this;
	}

	/**
	 * Get the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeightingFactorEvent2a() {
		return weightingFactorEvent2a;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2a the input value
	 */
	public void  setWeightingFactorEvent2a(Long weightingFactorEvent2a) {
		this.weightingFactorEvent2a = weightingFactorEvent2a;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2a the input value
	 * @return this instance
	 */
	public InterFreqMeas withWeightingFactorEvent2a(Long weightingFactorEvent2a) {
		this.weightingFactorEvent2a = weightingFactorEvent2a;
		return this;
	}

	/**
	 * Get the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeightingFactorEvent2b() {
		return weightingFactorEvent2b;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2b the input value
	 */
	public void  setWeightingFactorEvent2b(Long weightingFactorEvent2b) {
		this.weightingFactorEvent2b = weightingFactorEvent2b;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2b the input value
	 * @return this instance
	 */
	public InterFreqMeas withWeightingFactorEvent2b(Long weightingFactorEvent2b) {
		this.weightingFactorEvent2b = weightingFactorEvent2b;
		return this;
	}

	/**
	 * Get the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeightingFactorEvent2d() {
		return weightingFactorEvent2d;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2d the input value
	 */
	public void  setWeightingFactorEvent2d(Long weightingFactorEvent2d) {
		this.weightingFactorEvent2d = weightingFactorEvent2d;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2d the input value
	 * @return this instance
	 */
	public InterFreqMeas withWeightingFactorEvent2d(Long weightingFactorEvent2d) {
		this.weightingFactorEvent2d = weightingFactorEvent2d;
		return this;
	}

	/**
	 * Get the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeightingFactorEvent2f() {
		return weightingFactorEvent2f;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2f the input value
	 */
	public void  setWeightingFactorEvent2f(Long weightingFactorEvent2f) {
		this.weightingFactorEvent2f = weightingFactorEvent2f;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactorEvent2f the input value
	 * @return this instance
	 */
	public InterFreqMeas withWeightingFactorEvent2f(Long weightingFactorEvent2f) {
		this.weightingFactorEvent2f = weightingFactorEvent2f;
		return this;
	}

	/**
	 * Get the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent2a() {
		return hysteresisEvent2a;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2a the input value
	 */
	public void  setHysteresisEvent2a(Long hysteresisEvent2a) {
		this.hysteresisEvent2a = hysteresisEvent2a;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2a the input value
	 * @return this instance
	 */
	public InterFreqMeas withHysteresisEvent2a(Long hysteresisEvent2a) {
		this.hysteresisEvent2a = hysteresisEvent2a;
		return this;
	}

	/**
	 * Get the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent2b() {
		return hysteresisEvent2b;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2b the input value
	 */
	public void  setHysteresisEvent2b(Long hysteresisEvent2b) {
		this.hysteresisEvent2b = hysteresisEvent2b;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2b the input value
	 * @return this instance
	 */
	public InterFreqMeas withHysteresisEvent2b(Long hysteresisEvent2b) {
		this.hysteresisEvent2b = hysteresisEvent2b;
		return this;
	}

	/**
	 * Get the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent2d() {
		return hysteresisEvent2d;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2d the input value
	 */
	public void  setHysteresisEvent2d(Long hysteresisEvent2d) {
		this.hysteresisEvent2d = hysteresisEvent2d;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2d the input value
	 * @return this instance
	 */
	public InterFreqMeas withHysteresisEvent2d(Long hysteresisEvent2d) {
		this.hysteresisEvent2d = hysteresisEvent2d;
		return this;
	}

	/**
	 * Get the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresisEvent2f() {
		return hysteresisEvent2f;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2f the input value
	 */
	public void  setHysteresisEvent2f(Long hysteresisEvent2f) {
		this.hysteresisEvent2f = hysteresisEvent2f;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresisEvent2f the input value
	 * @return this instance
	 */
	public InterFreqMeas withHysteresisEvent2f(Long hysteresisEvent2f) {
		this.hysteresisEvent2f = hysteresisEvent2f;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent2a() {
		return timeToTriggerEvent2a;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2a the input value
	 */
	public void  setTimeToTriggerEvent2a(Long timeToTriggerEvent2a) {
		this.timeToTriggerEvent2a = timeToTriggerEvent2a;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2a the input value
	 * @return this instance
	 */
	public InterFreqMeas withTimeToTriggerEvent2a(Long timeToTriggerEvent2a) {
		this.timeToTriggerEvent2a = timeToTriggerEvent2a;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent2b() {
		return timeToTriggerEvent2b;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2b the input value
	 */
	public void  setTimeToTriggerEvent2b(Long timeToTriggerEvent2b) {
		this.timeToTriggerEvent2b = timeToTriggerEvent2b;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2b the input value
	 * @return this instance
	 */
	public InterFreqMeas withTimeToTriggerEvent2b(Long timeToTriggerEvent2b) {
		this.timeToTriggerEvent2b = timeToTriggerEvent2b;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent2d() {
		return timeToTriggerEvent2d;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2d the input value
	 */
	public void  setTimeToTriggerEvent2d(Long timeToTriggerEvent2d) {
		this.timeToTriggerEvent2d = timeToTriggerEvent2d;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2d the input value
	 * @return this instance
	 */
	public InterFreqMeas withTimeToTriggerEvent2d(Long timeToTriggerEvent2d) {
		this.timeToTriggerEvent2d = timeToTriggerEvent2d;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTriggerEvent2f() {
		return timeToTriggerEvent2f;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2f the input value
	 */
	public void  setTimeToTriggerEvent2f(Long timeToTriggerEvent2f) {
		this.timeToTriggerEvent2f = timeToTriggerEvent2f;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTriggerEvent2f the input value
	 * @return this instance
	 */
	public InterFreqMeas withTimeToTriggerEvent2f(Long timeToTriggerEvent2f) {
		this.timeToTriggerEvent2f = timeToTriggerEvent2f;
		return this;
	}

	/**
	 * Get the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdUsedFrequencyEvent2b() {
		return thresholdUsedFrequencyEvent2b;
	}

	/**
	 * Set the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent2b the input value
	 */
	public void  setThresholdUsedFrequencyEvent2b(Integer thresholdUsedFrequencyEvent2b) {
		this.thresholdUsedFrequencyEvent2b = thresholdUsedFrequencyEvent2b;
	}

	/**
	 * Set the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent2b the input value
	 * @return this instance
	 */
	public InterFreqMeas withThresholdUsedFrequencyEvent2b(Integer thresholdUsedFrequencyEvent2b) {
		this.thresholdUsedFrequencyEvent2b = thresholdUsedFrequencyEvent2b;
		return this;
	}

	/**
	 * Get the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdUsedFrequencyEvent2d() {
		return thresholdUsedFrequencyEvent2d;
	}

	/**
	 * Set the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent2d the input value
	 */
	public void  setThresholdUsedFrequencyEvent2d(Integer thresholdUsedFrequencyEvent2d) {
		this.thresholdUsedFrequencyEvent2d = thresholdUsedFrequencyEvent2d;
	}

	/**
	 * Set the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent2d the input value
	 * @return this instance
	 */
	public InterFreqMeas withThresholdUsedFrequencyEvent2d(Integer thresholdUsedFrequencyEvent2d) {
		this.thresholdUsedFrequencyEvent2d = thresholdUsedFrequencyEvent2d;
		return this;
	}

	/**
	 * Get the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdUsedFrequencyEvent2f() {
		return thresholdUsedFrequencyEvent2f;
	}

	/**
	 * Set the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent2f the input value
	 */
	public void  setThresholdUsedFrequencyEvent2f(Integer thresholdUsedFrequencyEvent2f) {
		this.thresholdUsedFrequencyEvent2f = thresholdUsedFrequencyEvent2f;
	}

	/**
	 * Set the defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequencyEvent2f the input value
	 * @return this instance
	 */
	public InterFreqMeas withThresholdUsedFrequencyEvent2f(Integer thresholdUsedFrequencyEvent2f) {
		this.thresholdUsedFrequencyEvent2f = thresholdUsedFrequencyEvent2f;
		return this;
	}

	/**
	 * Get the table containing parameters relating to a particular instance of inter-freq events.
	 *
	 * @return the value
	 */
	public Collection<Instance> getInstances() {
		if (this.instances == null){ this.instances=new ArrayList<>();}
		return instances;
	}

	/**
	 * Set the table containing parameters relating to a particular instance of inter-freq events.
	 *
	 * @param instances the input value
	 */
	public void  setInstances(Collection<Instance> instances) {
		this.instances = instances;
	}

	/**
	 * Set the table containing parameters relating to a particular instance of inter-freq events.
	 *
	 * @param instance the input value
	 * @return this instance
	 */
	public InterFreqMeas withInstance(Instance instance) {
		getInstances().add(instance);
		return this;
	}

	//</editor-fold>

}