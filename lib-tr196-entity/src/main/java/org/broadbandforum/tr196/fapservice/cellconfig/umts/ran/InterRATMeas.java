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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.interratmeas.Instance;

	/**
	 * This object contains parameters relating to the inter-RAT HO related control parameters. This is specifically for GERAN system.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.InterRATMeas.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.RAN.InterRATMeas")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.InterRATMeas")
@XmlAccessorType(XmlAccessType.FIELD)
public class InterRATMeas {

	/**
	 * Defines the filter coefficient for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.29}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GSMFilterCoefficient")
	@CWMPParameter(access = "readWrite")
	@Size(min = 19, max = 19)
	public Long gsmFilterCoefficient;
	/**
	 * Indicates whether the BSIC verification is required or not for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.29}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BSICVerificationRequired")
	@CWMPParameter(access = "readWrite")
	public Boolean bsiCVerificationRequired;
	/**
	 * Defines the weighting factor for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WeightingFactor")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 20)
	public Long weightingFactor;
	/**
	 * Defines the hysteresis for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Hysteresis")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long hysteresis;
	/**
	 * Defines the time-to-trigger in milliseconds for inter-RAT HO measurement when the UE is in Cell-DCH state.

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
	 * Defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold own system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdOwnSystem")
	@CWMPParameter(access = "readWrite")
	@Size(min = -115, max = 0)
	public Integer thresholdOwnSystem;
	/**
	 * Defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold other system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThresholdOtherSystem")
	@CWMPParameter(access = "readWrite")
	@Size(min = -115, max = 0)
	public Integer thresholdOtherSystem;
	/**
	 * Table containing parameters relating to a particular instance of inter-freq events.
	 */
	@XmlElementWrapper(name = "Instances")
	@XmlElement(name = "Instance")
	@CWMPParameter(access = "readWrite")
	public Collection<Instance> instances;

	public InterRATMeas() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the filter coefficient for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.29}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getGsmFilterCoefficient() {
		return gsmFilterCoefficient;
	}

	/**
	 * Set the defines the filter coefficient for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.29}}
	 *
	 * @since 2.0
	 * @param gsmFilterCoefficient the input value
	 */
	public void  setGsmFilterCoefficient(Long gsmFilterCoefficient) {
		this.gsmFilterCoefficient = gsmFilterCoefficient;
	}

	/**
	 * Set the defines the filter coefficient for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.9 and Section 10.3.7.29}}
	 *
	 * @since 2.0
	 * @param gsmFilterCoefficient the input value
	 * @return this instance
	 */
	public InterRATMeas withGsmFilterCoefficient(Long gsmFilterCoefficient) {
		this.gsmFilterCoefficient = gsmFilterCoefficient;
		return this;
	}

	/**
	 * Get the indicates whether the BSIC verification is required or not for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.29}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isBsiCVerificationRequired() {
		return bsiCVerificationRequired;
	}

	/**
	 * Set the indicates whether the BSIC verification is required or not for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.29}}
	 *
	 * @since 2.0
	 * @param bsiCVerificationRequired the input value
	 */
	public void  setBsiCVerificationRequired(Boolean bsiCVerificationRequired) {
		this.bsiCVerificationRequired = bsiCVerificationRequired;
	}

	/**
	 * Set the indicates whether the BSIC verification is required or not for inter-RAT HO measurement when the UE is in Cell-DCH state.

{{bibref|3GPP-TS.25.331|Section 10.3.7.29}}
	 *
	 * @since 2.0
	 * @param bsiCVerificationRequired the input value
	 * @return this instance
	 */
	public InterRATMeas withBsiCVerificationRequired(Boolean bsiCVerificationRequired) {
		this.bsiCVerificationRequired = bsiCVerificationRequired;
		return this;
	}

	/**
	 * Get the defines the weighting factor for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWeightingFactor() {
		return weightingFactor;
	}

	/**
	 * Set the defines the weighting factor for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 * @param weightingFactor the input value
	 */
	public void  setWeightingFactor(Long weightingFactor) {
		this.weightingFactor = weightingFactor;
	}

	/**
	 * Set the defines the weighting factor for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the weighting factor are 0.0 to 2.0 in steps of 0.1. The value of {{param}} divided by 10 yields the actual value of the weighting factor.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 * @param weightingFactor the input value
	 * @return this instance
	 */
	public InterRATMeas withWeightingFactor(Long weightingFactor) {
		this.weightingFactor = weightingFactor;
		return this;
	}

	/**
	 * Get the defines the hysteresis for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHysteresis() {
		return hysteresis;
	}

	/**
	 * Set the defines the hysteresis for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 * @param hysteresis the input value
	 */
	public void  setHysteresis(Long hysteresis) {
		this.hysteresis = hysteresis;
	}

	/**
	 * Set the defines the hysteresis for inter-RAT HO measurement when the UE is in Cell-DCH state.

Actual values of the range are 0.0 to 7.5 in steps of 0.5. The value of {{param}} divided by 2 yields the actual value of the hysteresis.

{{bibref|3GPP-TS.25.331|Section 10.3.7.30}}
	 *
	 * @since 2.0
	 * @param hysteresis the input value
	 * @return this instance
	 */
	public InterRATMeas withHysteresis(Long hysteresis) {
		this.hysteresis = hysteresis;
		return this;
	}

	/**
	 * Get the defines the time-to-trigger in milliseconds for inter-RAT HO measurement when the UE is in Cell-DCH state.

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
	 * Set the defines the time-to-trigger in milliseconds for inter-RAT HO measurement when the UE is in Cell-DCH state.

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
	 * Set the defines the time-to-trigger in milliseconds for inter-RAT HO measurement when the UE is in Cell-DCH state.

Only the specified values are considered valid, any value other than those and the CPE MUST reject the request.

{{bibref|3GPP-TS.25.331|Section 10.3.7.39 and Section 10.3.7.64}}
	 *
	 * @since 2.0
	 * @param timeToTrigger the input value
	 * @return this instance
	 */
	public InterRATMeas withTimeToTrigger(Long timeToTrigger) {
		this.timeToTrigger = timeToTrigger;
		return this;
	}

	/**
	 * Get the defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold own system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdOwnSystem() {
		return thresholdOwnSystem;
	}

	/**
	 * Set the defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold own system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 * @param thresholdOwnSystem the input value
	 */
	public void  setThresholdOwnSystem(Integer thresholdOwnSystem) {
		this.thresholdOwnSystem = thresholdOwnSystem;
	}

	/**
	 * Set the defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold own system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 * @param thresholdOwnSystem the input value
	 * @return this instance
	 */
	public InterRATMeas withThresholdOwnSystem(Integer thresholdOwnSystem) {
		this.thresholdOwnSystem = thresholdOwnSystem;
		return this;
	}

	/**
	 * Get the defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold other system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getThresholdOtherSystem() {
		return thresholdOtherSystem;
	}

	/**
	 * Set the defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold other system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 * @param thresholdOtherSystem the input value
	 */
	public void  setThresholdOtherSystem(Integer thresholdOtherSystem) {
		this.thresholdOtherSystem = thresholdOtherSystem;
	}

	/**
	 * Set the defines the reporting threshold for inter-RAT HO measurement when the UE is in Cell-DCH state. This is the "Threshold other system" as defined in {{bibref|3GPP-TS.25.331|Section 10.3.7.30}}.
	 *
	 * @since 2.0
	 * @param thresholdOtherSystem the input value
	 * @return this instance
	 */
	public InterRATMeas withThresholdOtherSystem(Integer thresholdOtherSystem) {
		this.thresholdOtherSystem = thresholdOtherSystem;
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
	public InterRATMeas withInstance(Instance instance) {
		getInstances().add(instance);
		return this;
	}

	//</editor-fold>

}