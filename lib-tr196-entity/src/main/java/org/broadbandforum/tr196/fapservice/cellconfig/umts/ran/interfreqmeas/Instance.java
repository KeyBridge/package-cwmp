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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.interfreqmeas;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Table containing parameters relating to a particular instance of inter-freq events.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.InterFreqMeas.Instance.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"IntraFrequencyEventIdentity"})})
@XmlRootElement(name = "FAPService.CellConfig.UMTS.RAN.InterFreqMeas.Instance")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.InterFreqMeas.Instance")
@XmlAccessorType(XmlAccessType.FIELD)
public class Instance {

	/**
	 * Enables or disables this {{object}} entry.
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
	 * Each entry is an Event ID from the list of: {{enum}}

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}

This attribute is readable, as it is highly dependent on how the FAP makes use of the event.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IntraFrequencyEventIdentity")
	public String intraFrequencyEventIdentity;
	/**
	 * A free-form description of the way the event instance is meant to be used.

E.g. "detecting cell edge to prepare for hand-out", "cancel hand-out preparation".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EventDescription")
	@Size(max = 256)
	public String eventDescription;
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
	 * Defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactor")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactor;
	/**
	 * Defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Hysteresis")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresis;
	/**
	 * Defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TimeToTrigger")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 5000, max = 5000)
	public Long timeToTrigger;
	/**
	 * Applicable to events 2b, 2d, 2f, otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdUsedFrequency")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = 0)
	public Integer thresholdUsedFrequency;
	/**
	 * Applicable to events 2a, 2b, 2c, 2e otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold non used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdNonUsedFrequency")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = 0)
	public Integer thresholdNonUsedFrequency;

	public Instance() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Instance withEnable(Boolean enable) {
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
	public Instance withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the each entry is an Event ID from the list of: {{enum}}

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}

This attribute is readable, as it is highly dependent on how the FAP makes use of the event.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getIntraFrequencyEventIdentity() {
		return intraFrequencyEventIdentity;
	}

	/**
	 * Set the each entry is an Event ID from the list of: {{enum}}

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}

This attribute is readable, as it is highly dependent on how the FAP makes use of the event.
	 *
	 * @since 2.0
	 * @param intraFrequencyEventIdentity the input value
	 */
	public void  setIntraFrequencyEventIdentity(String intraFrequencyEventIdentity) {
		this.intraFrequencyEventIdentity = intraFrequencyEventIdentity;
	}

	/**
	 * Set the each entry is an Event ID from the list of: {{enum}}

Defines the identity of the event used to trigger UE reporting (in case of event-triggered reporting).

{{bibref|3GPP-TS.25.331|Section 10.3.7.14}}

This attribute is readable, as it is highly dependent on how the FAP makes use of the event.
	 *
	 * @since 2.0
	 * @param intraFrequencyEventIdentity the input value
	 * @return this instance
	 */
	public Instance withIntraFrequencyEventIdentity(String intraFrequencyEventIdentity) {
		this.intraFrequencyEventIdentity = intraFrequencyEventIdentity;
		return this;
	}

	/**
	 * Get a free-form description of the way the event instance is meant to be used.

E.g. "detecting cell edge to prepare for hand-out", "cancel hand-out preparation".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEventDescription() {
		return eventDescription;
	}

	/**
	 * Set a free-form description of the way the event instance is meant to be used.

E.g. "detecting cell edge to prepare for hand-out", "cancel hand-out preparation".
	 *
	 * @since 2.0
	 * @param eventDescription the input value
	 */
	public void  setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	/**
	 * Set a free-form description of the way the event instance is meant to be used.

E.g. "detecting cell edge to prepare for hand-out", "cancel hand-out preparation".
	 *
	 * @since 2.0
	 * @param eventDescription the input value
	 * @return this instance
	 */
	public Instance withEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
		return this;
	}

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
	public Instance withMeasurementQuantity(String measurementQuantity) {
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
	public Instance withFilterCoefficient(Long filterCoefficient) {
		this.filterCoefficient = filterCoefficient;
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
	public Long getWeightingFactor() {
		return weightingFactor;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactor the input value
	 */
	public void  setWeightingFactor(Long weightingFactor) {
		this.weightingFactor = weightingFactor;
	}

	/**
	 * Set the defines the weighting factor for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param weightingFactor the input value
	 * @return this instance
	 */
	public Instance withWeightingFactor(Long weightingFactor) {
		this.weightingFactor = weightingFactor;
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
	public Long getHysteresis() {
		return hysteresis;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresis the input value
	 */
	public void  setHysteresis(Long hysteresis) {
		this.hysteresis = hysteresis;
	}

	/**
	 * Set the defines the hysteresis for inter-freq HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 14.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.19}}
	 *
	 * @since 2.0
	 * @param hysteresis the input value
	 * @return this instance
	 */
	public Instance withHysteresis(Long hysteresis) {
		this.hysteresis = hysteresis;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTimeToTrigger() {
		return timeToTrigger;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTrigger the input value
	 */
	public void  setTimeToTrigger(Long timeToTrigger) {
		this.timeToTrigger = timeToTrigger;
	}

	/**
	 * Set the defines the time-to-trigger in milliseconds for inter-freq HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTrigger the input value
	 * @return this instance
	 */
	public Instance withTimeToTrigger(Long timeToTrigger) {
		this.timeToTrigger = timeToTrigger;
		return this;
	}

	/**
	 * Get applicable to events 2b, 2d, 2f, otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdUsedFrequency() {
		return thresholdUsedFrequency;
	}

	/**
	 * Set applicable to events 2b, 2d, 2f, otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequency the input value
	 */
	public void  setThresholdUsedFrequency(Integer thresholdUsedFrequency) {
		this.thresholdUsedFrequency = thresholdUsedFrequency;
	}

	/**
	 * Set applicable to events 2b, 2d, 2f, otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdUsedFrequency the input value
	 * @return this instance
	 */
	public Instance withThresholdUsedFrequency(Integer thresholdUsedFrequency) {
		this.thresholdUsedFrequency = thresholdUsedFrequency;
		return this;
	}

	/**
	 * Get applicable to events 2a, 2b, 2c, 2e otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold non used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdNonUsedFrequency() {
		return thresholdNonUsedFrequency;
	}

	/**
	 * Set applicable to events 2a, 2b, 2c, 2e otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold non used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdNonUsedFrequency the input value
	 */
	public void  setThresholdNonUsedFrequency(Integer thresholdNonUsedFrequency) {
		this.thresholdNonUsedFrequency = thresholdNonUsedFrequency;
	}

	/**
	 * Set applicable to events 2a, 2b, 2c, 2e otherwise not needed.

Defines the reporting threshold for inter-freq HO measurement when the UE is in Cell-DCH state. This is the "Threshold non used frequency" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.19}}.

Each valid value of {{param|MeasurementQuantity}} has a different valid range.

{{enum|CPICH RSCP|MeasurementQuantity}} has a range of -120 dBm to -25 dBm

{{enum|CPICH Ec/No|MeasurementQuantity}} has a range of -24 dB to 0 dB
	 *
	 * @since 2.0
	 * @param thresholdNonUsedFrequency the input value
	 * @return this instance
	 */
	public Instance withThresholdNonUsedFrequency(Integer thresholdNonUsedFrequency) {
		this.thresholdNonUsedFrequency = thresholdNonUsedFrequency;
		return this;
	}

	//</editor-fold>

}