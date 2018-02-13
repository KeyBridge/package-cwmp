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
package org.broadbandforum.tr098.internetgatewaydevice.periodicstatistics.sampleset;

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
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Periodic statistics parameter table for this sample set.  This table contains entries for parameters whose values are to be sampled.

Note that the comma-separated lists in this object (SampleSeconds, SuspectData and Values) only ever change (a) when first enabled, (b) when ForceSample is set to true (a "sneak preview" of the current sample), or (c) at the end of the sample interval.
	 *
	 * @since 1.5
	 */
@CWMPObject(name = "InternetGatewayDevice.PeriodicStatistics.SampleSet.{i}.Parameter.{i}.")
@XmlRootElement(name = "Parameter")
@XmlType(name = "InternetGatewayDevice.PeriodicStatistics.SampleSet.Parameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameter {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Enables or disables this object instance.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{reference}} This is the parameter being monitored by the Periodic Statistics mechanism.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Reference")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String reference;
	/**
	 * Controls how this parameter's value is sampled. {{enum}}

Parameters of non-numeric types can only support {{enum|Current}}.  The value of the {{param}} MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "SampleMode")
	@CWMPParameter(access = "readWrite")
	public String sampleMode = "Current";
	/**
	 * Controls how this parameter's statistic is calculated from the sampled value(s). {{enum}}

Parameters of non-numeric types can only support {{enum|Latest}}.  The value of the {{param}} MUST be ignored for such parameters.

{{param|SampleMode}} MUST be applied before {{param}}, i.e. the inputs to the calculation will have already accounted for {{param|SampleMode}}.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "CalculationMode")
	@CWMPParameter(access = "readWrite")
	public String calculationMode = "Latest";
	/**
	 * The low threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|HighThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "LowThreshold")
	@CWMPParameter(access = "readWrite")
	public Integer lowThreshold = 0;
	/**
	 * The high threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|LowThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "HighThreshold")
	@CWMPParameter(access = "readWrite")
	public Integer highThreshold = 0;
	/**
	 * {{list}} Each entry indicates the number of seconds during which data was collected for this parameter during the sample interval.

Individual {{param}} values can be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}, for several reasons, including:

: Any of the reasons for which {{param|.PeriodicStatistics.SampleSet.{i}.SampleSeconds}} values might be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}.

: The parameter doesn't exist, or was created or deleted during a sample interval.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "SampleSeconds")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long sampleSeconds;
	/**
	 * {{list}} Each entry is 0 if the sampled value is believed to be valid, or 1 if an event that might affect the validity of the sampled value occurred during the sample interval.

For example, if the parameter value were to be reset during the sample interval then it would be appropriate to set {{param}} to 1.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "SuspectData")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 1)
	public Long suspectData;
	/**
	 * {{list}} Each entry indicates the value of the referenced parameter, as determined by {{param|SampleMode}}, during the sample interval.

The statistics values in this comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

If the {{param|SampleMode}} parameter is not present, or is inappropriate for the referenced parameter, the statistics values MUST be collected in Current mode.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Values")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> values;
	/**
	 * Counts the number of times (since this object instance was last enabled) that a newly-calculated sample value (accounting for {{param|SampleMode}}) transitioned from the "in range" state to the "out of range" state, or between the "out of range (low)" and "out of range (high)" states.  The states are defined as follows:

* "in range" : current value is greater than {{param|LowThreshold}} and less than {{param|HighThreshold}}.

* "out of range" : current value is less than or equal to {{param|LowThreshold}}, or greater than or equal to {{param|HighThreshold}}.

* "out of range (low)" : current value is less than or equal to {{param|LowThreshold}}.

* "out of range (high)" : current value is greater than or equal to {{param|HighThreshold}}.

Note that, if {{param|LowThreshold}} and {{param|HighThreshold}} are both the same, the threshold/failure mechanism is disabled, so the value of this parameter will not increment.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval. For this reason, the CPE SHOULD place a locally specified limit on the frequency at which it will notify the ACS of such changes, as described in {{bibref|TR-069a2|Section 3.2.1}}.

Parameters of non-numeric types cannot support the threshold/failure mechanism.  The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 */
	@XmlElement(name = "Failures")
	public Long failures = 0L;

	public Parameter() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 * @return this instance
	 */
	public Parameter withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the enables or disables this object instance.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this object instance.
	 *
	 * @since 1.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this object instance.
	 *
	 * @since 1.5
	 * @param enable the input value
	 * @return this instance
	 */
	public Parameter withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{reference}} This is the parameter being monitored by the Periodic Statistics mechanism.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * Set the {{reference}} This is the parameter being monitored by the Periodic Statistics mechanism.
	 *
	 * @since 1.5
	 * @param reference the input value
	 */
	public void  setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * Set the {{reference}} This is the parameter being monitored by the Periodic Statistics mechanism.
	 *
	 * @since 1.5
	 * @param reference the input value
	 * @return this instance
	 */
	public Parameter withReference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * Get the controls how this parameter's value is sampled. {{enum}}

Parameters of non-numeric types can only support {{enum|Current}}.  The value of the {{param}} MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getSampleMode() {
		return sampleMode;
	}

	/**
	 * Set the controls how this parameter's value is sampled. {{enum}}

Parameters of non-numeric types can only support {{enum|Current}}.  The value of the {{param}} MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param sampleMode the input value
	 */
	public void  setSampleMode(String sampleMode) {
		this.sampleMode = sampleMode;
	}

	/**
	 * Set the controls how this parameter's value is sampled. {{enum}}

Parameters of non-numeric types can only support {{enum|Current}}.  The value of the {{param}} MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param sampleMode the input value
	 * @return this instance
	 */
	public Parameter withSampleMode(String sampleMode) {
		this.sampleMode = sampleMode;
		return this;
	}

	/**
	 * Get the controls how this parameter's statistic is calculated from the sampled value(s). {{enum}}

Parameters of non-numeric types can only support {{enum|Latest}}.  The value of the {{param}} MUST be ignored for such parameters.

{{param|SampleMode}} MUST be applied before {{param}}, i.e. the inputs to the calculation will have already accounted for {{param|SampleMode}}.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public String getCalculationMode() {
		return calculationMode;
	}

	/**
	 * Set the controls how this parameter's statistic is calculated from the sampled value(s). {{enum}}

Parameters of non-numeric types can only support {{enum|Latest}}.  The value of the {{param}} MUST be ignored for such parameters.

{{param|SampleMode}} MUST be applied before {{param}}, i.e. the inputs to the calculation will have already accounted for {{param|SampleMode}}.
	 *
	 * @since 1.5
	 * @param calculationMode the input value
	 */
	public void  setCalculationMode(String calculationMode) {
		this.calculationMode = calculationMode;
	}

	/**
	 * Set the controls how this parameter's statistic is calculated from the sampled value(s). {{enum}}

Parameters of non-numeric types can only support {{enum|Latest}}.  The value of the {{param}} MUST be ignored for such parameters.

{{param|SampleMode}} MUST be applied before {{param}}, i.e. the inputs to the calculation will have already accounted for {{param|SampleMode}}.
	 *
	 * @since 1.5
	 * @param calculationMode the input value
	 * @return this instance
	 */
	public Parameter withCalculationMode(String calculationMode) {
		this.calculationMode = calculationMode;
		return this;
	}

	/**
	 * Get the low threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|HighThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Integer getLowThreshold() {
		return lowThreshold;
	}

	/**
	 * Set the low threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|HighThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param lowThreshold the input value
	 */
	public void  setLowThreshold(Integer lowThreshold) {
		this.lowThreshold = lowThreshold;
	}

	/**
	 * Set the low threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|HighThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param lowThreshold the input value
	 * @return this instance
	 */
	public Parameter withLowThreshold(Integer lowThreshold) {
		this.lowThreshold = lowThreshold;
		return this;
	}

	/**
	 * Get the high threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|LowThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Integer getHighThreshold() {
		return highThreshold;
	}

	/**
	 * Set the high threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|LowThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param highThreshold the input value
	 */
	public void  setHighThreshold(Integer highThreshold) {
		this.highThreshold = highThreshold;
	}

	/**
	 * Set the high threshold value that controls the calculation of {{param|Failures}}.  

A value equal to {{param|LowThreshold}} disables the threshold/failure mechanism.

Parameters of non-numeric types cannot support the threshold/failure mechanism. The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param highThreshold the input value
	 * @return this instance
	 */
	public Parameter withHighThreshold(Integer highThreshold) {
		this.highThreshold = highThreshold;
		return this;
	}

	/**
	 * Get the {{list}} Each entry indicates the number of seconds during which data was collected for this parameter during the sample interval.

Individual {{param}} values can be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}, for several reasons, including:

: Any of the reasons for which {{param|.PeriodicStatistics.SampleSet.{i}.SampleSeconds}} values might be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}.

: The parameter doesn't exist, or was created or deleted during a sample interval.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getSampleSeconds() {
		return sampleSeconds;
	}

	/**
	 * Set the {{list}} Each entry indicates the number of seconds during which data was collected for this parameter during the sample interval.

Individual {{param}} values can be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}, for several reasons, including:

: Any of the reasons for which {{param|.PeriodicStatistics.SampleSet.{i}.SampleSeconds}} values might be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}.

: The parameter doesn't exist, or was created or deleted during a sample interval.
	 *
	 * @since 1.5
	 * @param sampleSeconds the input value
	 */
	public void  setSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
	}

	/**
	 * Set the {{list}} Each entry indicates the number of seconds during which data was collected for this parameter during the sample interval.

Individual {{param}} values can be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}, for several reasons, including:

: Any of the reasons for which {{param|.PeriodicStatistics.SampleSet.{i}.SampleSeconds}} values might be less than {{param|.PeriodicStatistics.SampleSet.{i}.SampleInterval}}.

: The parameter doesn't exist, or was created or deleted during a sample interval.
	 *
	 * @since 1.5
	 * @param sampleSeconds the input value
	 * @return this instance
	 */
	public Parameter withSampleSeconds(Long sampleSeconds) {
		this.sampleSeconds = sampleSeconds;
		return this;
	}

	/**
	 * Get the {{list}} Each entry is 0 if the sampled value is believed to be valid, or 1 if an event that might affect the validity of the sampled value occurred during the sample interval.

For example, if the parameter value were to be reset during the sample interval then it would be appropriate to set {{param}} to 1.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getSuspectData() {
		return suspectData;
	}

	/**
	 * Set the {{list}} Each entry is 0 if the sampled value is believed to be valid, or 1 if an event that might affect the validity of the sampled value occurred during the sample interval.

For example, if the parameter value were to be reset during the sample interval then it would be appropriate to set {{param}} to 1.
	 *
	 * @since 1.5
	 * @param suspectData the input value
	 */
	public void  setSuspectData(Long suspectData) {
		this.suspectData = suspectData;
	}

	/**
	 * Set the {{list}} Each entry is 0 if the sampled value is believed to be valid, or 1 if an event that might affect the validity of the sampled value occurred during the sample interval.

For example, if the parameter value were to be reset during the sample interval then it would be appropriate to set {{param}} to 1.
	 *
	 * @since 1.5
	 * @param suspectData the input value
	 * @return this instance
	 */
	public Parameter withSuspectData(Long suspectData) {
		this.suspectData = suspectData;
		return this;
	}

	/**
	 * Get the {{list}} Each entry indicates the value of the referenced parameter, as determined by {{param|SampleMode}}, during the sample interval.

The statistics values in this comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

If the {{param|SampleMode}} parameter is not present, or is inappropriate for the referenced parameter, the statistics values MUST be collected in Current mode.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Collection<String> getValues() {
		if (this.values == null){ this.values=new ArrayList<>();}
		return values;
	}

	/**
	 * Set the {{list}} Each entry indicates the value of the referenced parameter, as determined by {{param|SampleMode}}, during the sample interval.

The statistics values in this comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

If the {{param|SampleMode}} parameter is not present, or is inappropriate for the referenced parameter, the statistics values MUST be collected in Current mode.
	 *
	 * @since 1.5
	 * @param values the input value
	 */
	public void  setValues(Collection<String> values) {
		this.values = values;
	}

	/**
	 * Set the {{list}} Each entry indicates the value of the referenced parameter, as determined by {{param|SampleMode}}, during the sample interval.

The statistics values in this comma-separated lists MUST be in time order, with the oldest one first and the most recent one last.

If the {{param|SampleMode}} parameter is not present, or is inappropriate for the referenced parameter, the statistics values MUST be collected in Current mode.
	 *
	 * @since 1.5
	 * @param string the input value
	 * @return this instance
	 */
	public Parameter withValues(String string) {
		getValues().add(string);
		return this;
	}

	/**
	 * Get the counts the number of times (since this object instance was last enabled) that a newly-calculated sample value (accounting for {{param|SampleMode}}) transitioned from the "in range" state to the "out of range" state, or between the "out of range (low)" and "out of range (high)" states.  The states are defined as follows:

* "in range" : current value is greater than {{param|LowThreshold}} and less than {{param|HighThreshold}}.

* "out of range" : current value is less than or equal to {{param|LowThreshold}}, or greater than or equal to {{param|HighThreshold}}.

* "out of range (low)" : current value is less than or equal to {{param|LowThreshold}}.

* "out of range (high)" : current value is greater than or equal to {{param|HighThreshold}}.

Note that, if {{param|LowThreshold}} and {{param|HighThreshold}} are both the same, the threshold/failure mechanism is disabled, so the value of this parameter will not increment.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval. For this reason, the CPE SHOULD place a locally specified limit on the frequency at which it will notify the ACS of such changes, as described in {{bibref|TR-069a2|Section 3.2.1}}.

Parameters of non-numeric types cannot support the threshold/failure mechanism.  The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @return the value
	 */
	public Long getFailures() {
		return failures;
	}

	/**
	 * Set the counts the number of times (since this object instance was last enabled) that a newly-calculated sample value (accounting for {{param|SampleMode}}) transitioned from the "in range" state to the "out of range" state, or between the "out of range (low)" and "out of range (high)" states.  The states are defined as follows:

* "in range" : current value is greater than {{param|LowThreshold}} and less than {{param|HighThreshold}}.

* "out of range" : current value is less than or equal to {{param|LowThreshold}}, or greater than or equal to {{param|HighThreshold}}.

* "out of range (low)" : current value is less than or equal to {{param|LowThreshold}}.

* "out of range (high)" : current value is greater than or equal to {{param|HighThreshold}}.

Note that, if {{param|LowThreshold}} and {{param|HighThreshold}} are both the same, the threshold/failure mechanism is disabled, so the value of this parameter will not increment.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval. For this reason, the CPE SHOULD place a locally specified limit on the frequency at which it will notify the ACS of such changes, as described in {{bibref|TR-069a2|Section 3.2.1}}.

Parameters of non-numeric types cannot support the threshold/failure mechanism.  The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param failures the input value
	 */
	public void  setFailures(Long failures) {
		this.failures = failures;
	}

	/**
	 * Set the counts the number of times (since this object instance was last enabled) that a newly-calculated sample value (accounting for {{param|SampleMode}}) transitioned from the "in range" state to the "out of range" state, or between the "out of range (low)" and "out of range (high)" states.  The states are defined as follows:

* "in range" : current value is greater than {{param|LowThreshold}} and less than {{param|HighThreshold}}.

* "out of range" : current value is less than or equal to {{param|LowThreshold}}, or greater than or equal to {{param|HighThreshold}}.

* "out of range (low)" : current value is less than or equal to {{param|LowThreshold}}.

* "out of range (high)" : current value is greater than or equal to {{param|HighThreshold}}.

Note that, if {{param|LowThreshold}} and {{param|HighThreshold}} are both the same, the threshold/failure mechanism is disabled, so the value of this parameter will not increment.

This parameter can be incremented at any time during a sample interval, and might be incremented more than once during a single sample interval. For this reason, the CPE SHOULD place a locally specified limit on the frequency at which it will notify the ACS of such changes, as described in {{bibref|TR-069a2|Section 3.2.1}}.

Parameters of non-numeric types cannot support the threshold/failure mechanism.  The value of this parameter MUST be ignored for such parameters.
	 *
	 * @since 1.5
	 * @param failures the input value
	 * @return this instance
	 */
	public Parameter withFailures(Long failures) {
		this.failures = failures;
		return this;
	}

	//</editor-fold>

}