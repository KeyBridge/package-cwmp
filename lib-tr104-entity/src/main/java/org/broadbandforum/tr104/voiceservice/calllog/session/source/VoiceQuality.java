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
package org.broadbandforum.tr104.voiceservice.calllog.session.source;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * VoIP Statistics for current session instance.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallLog.{i}.Session.{i}.Source.VoiceQuality.")
@XmlRootElement(name = "VoiceService.CallLog.Session.Source.VoiceQuality")
@XmlType(name = "VoiceService.CallLog.Session.Source.VoiceQuality")
@XmlAccessorType(XmlAccessType.FIELD)
public class VoiceQuality {

	/**
	 * {{list|representing the VoIP quality calculated for consecutive intervals of the session}} The interval is specified by {{param|.VoIPProfile.{i}.QICalculationInterval}} and the quality model used is specified by {{param|.VoIPProfile.{i}.QIModelUsed}}.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.

For long sessions the number of values might exceed the limit given by {{param|.Capabilities.QualityIndicator.MaxQIValues}}. In that case, the CPE MUST remove the oldest values to keep the number of reported values within the limit.

The interpretation of the QI values are algorithm-specific, the only constraints being the range and the fact that lower values indicate worse quality than do higher values.

For instance, if {{param}} is reported as "78,57,88,79,34,56", and {{param|.VoIPProfile.{i}.QICalculationInterval}} is 10 seconds, the quality during the first ten seconds was 78, the next ten seconds 57, and so on. The last reported value (here 56) might cover a shorter time period than {{param|.VoIPProfile.{i}.QICalculationInterval}}, but the length can be deduced using {{param|##.Duration}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoIPQualityIndicator")
	@Size(max = 65535)
	public Long voiPQualityIndicator;
	/**
	 * {{list|representing the worst VoIP quality indicators calculated during the whole session}}

Only the N worst values are stored, where N is the limit stored in the  {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}} attribute.

The values are given in the same algorithm-specific representation as {{param|VoIPQualityIndicator}}, and MUST be in quality-order with the lowest value first.

Example: "34,56,57" are the 3 worst values calculated during the call.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WorstVoIPQualityIndicatorsValues")
	@Size(max = 65535)
	public Long worstVoIPQualityIndicatorsValues;
	/**
	 * {{list}} Each value represents the timestamp index, given in units of {{param|.VoIPProfile.{i}.QICalculationInterval}}, when the corresponding value in {{param|WorstVoIPQualityIndicatorsValues}} was calculated.

The first index is number 1.

Only the N worst values are stored, where N is the limit stored in {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}}.

Example: if {{param|.VoIPProfile.{i}.QICalculationInterval}} is equal to 10 (seconds), the value "6,2,5" designates the time intervals 50-60 s, 10-20 s, and 40-50 s when the 3 worst values were calculated.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "WorstVoIPQualityIndicatorTimestamps")
	@Size(max = 65535)
	public Long worstVoIPQualityIndicatorTimestamps;

	public VoiceQuality() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list|representing the VoIP quality calculated for consecutive intervals of the session}} The interval is specified by {{param|.VoIPProfile.{i}.QICalculationInterval}} and the quality model used is specified by {{param|.VoIPProfile.{i}.QIModelUsed}}.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.

For long sessions the number of values might exceed the limit given by {{param|.Capabilities.QualityIndicator.MaxQIValues}}. In that case, the CPE MUST remove the oldest values to keep the number of reported values within the limit.

The interpretation of the QI values are algorithm-specific, the only constraints being the range and the fact that lower values indicate worse quality than do higher values.

For instance, if {{param}} is reported as "78,57,88,79,34,56", and {{param|.VoIPProfile.{i}.QICalculationInterval}} is 10 seconds, the quality during the first ten seconds was 78, the next ten seconds 57, and so on. The last reported value (here 56) might cover a shorter time period than {{param|.VoIPProfile.{i}.QICalculationInterval}}, but the length can be deduced using {{param|##.Duration}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getVoiPQualityIndicator() {
		return voiPQualityIndicator;
	}

	/**
	 * Set the {{list|representing the VoIP quality calculated for consecutive intervals of the session}} The interval is specified by {{param|.VoIPProfile.{i}.QICalculationInterval}} and the quality model used is specified by {{param|.VoIPProfile.{i}.QIModelUsed}}.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.

For long sessions the number of values might exceed the limit given by {{param|.Capabilities.QualityIndicator.MaxQIValues}}. In that case, the CPE MUST remove the oldest values to keep the number of reported values within the limit.

The interpretation of the QI values are algorithm-specific, the only constraints being the range and the fact that lower values indicate worse quality than do higher values.

For instance, if {{param}} is reported as "78,57,88,79,34,56", and {{param|.VoIPProfile.{i}.QICalculationInterval}} is 10 seconds, the quality during the first ten seconds was 78, the next ten seconds 57, and so on. The last reported value (here 56) might cover a shorter time period than {{param|.VoIPProfile.{i}.QICalculationInterval}}, but the length can be deduced using {{param|##.Duration}}.
	 *
	 * @since 2.0
	 * @param voiPQualityIndicator the input value
	 */
	public void  setVoiPQualityIndicator(Long voiPQualityIndicator) {
		this.voiPQualityIndicator = voiPQualityIndicator;
	}

	/**
	 * Set the {{list|representing the VoIP quality calculated for consecutive intervals of the session}} The interval is specified by {{param|.VoIPProfile.{i}.QICalculationInterval}} and the quality model used is specified by {{param|.VoIPProfile.{i}.QIModelUsed}}.

The statistics values in this list MUST be in time order, with the oldest one first and the most recent one last.

For long sessions the number of values might exceed the limit given by {{param|.Capabilities.QualityIndicator.MaxQIValues}}. In that case, the CPE MUST remove the oldest values to keep the number of reported values within the limit.

The interpretation of the QI values are algorithm-specific, the only constraints being the range and the fact that lower values indicate worse quality than do higher values.

For instance, if {{param}} is reported as "78,57,88,79,34,56", and {{param|.VoIPProfile.{i}.QICalculationInterval}} is 10 seconds, the quality during the first ten seconds was 78, the next ten seconds 57, and so on. The last reported value (here 56) might cover a shorter time period than {{param|.VoIPProfile.{i}.QICalculationInterval}}, but the length can be deduced using {{param|##.Duration}}.
	 *
	 * @since 2.0
	 * @param voiPQualityIndicator the input value
	 * @return this instance
	 */
	public VoiceQuality withVoiPQualityIndicator(Long voiPQualityIndicator) {
		this.voiPQualityIndicator = voiPQualityIndicator;
		return this;
	}

	/**
	 * Get the {{list|representing the worst VoIP quality indicators calculated during the whole session}}

Only the N worst values are stored, where N is the limit stored in the  {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}} attribute.

The values are given in the same algorithm-specific representation as {{param|VoIPQualityIndicator}}, and MUST be in quality-order with the lowest value first.

Example: "34,56,57" are the 3 worst values calculated during the call.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWorstVoIPQualityIndicatorsValues() {
		return worstVoIPQualityIndicatorsValues;
	}

	/**
	 * Set the {{list|representing the worst VoIP quality indicators calculated during the whole session}}

Only the N worst values are stored, where N is the limit stored in the  {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}} attribute.

The values are given in the same algorithm-specific representation as {{param|VoIPQualityIndicator}}, and MUST be in quality-order with the lowest value first.

Example: "34,56,57" are the 3 worst values calculated during the call.
	 *
	 * @since 2.0
	 * @param worstVoIPQualityIndicatorsValues the input value
	 */
	public void  setWorstVoIPQualityIndicatorsValues(Long worstVoIPQualityIndicatorsValues) {
		this.worstVoIPQualityIndicatorsValues = worstVoIPQualityIndicatorsValues;
	}

	/**
	 * Set the {{list|representing the worst VoIP quality indicators calculated during the whole session}}

Only the N worst values are stored, where N is the limit stored in the  {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}} attribute.

The values are given in the same algorithm-specific representation as {{param|VoIPQualityIndicator}}, and MUST be in quality-order with the lowest value first.

Example: "34,56,57" are the 3 worst values calculated during the call.
	 *
	 * @since 2.0
	 * @param worstVoIPQualityIndicatorsValues the input value
	 * @return this instance
	 */
	public VoiceQuality withWorstVoIPQualityIndicatorsValues(Long worstVoIPQualityIndicatorsValues) {
		this.worstVoIPQualityIndicatorsValues = worstVoIPQualityIndicatorsValues;
		return this;
	}

	/**
	 * Get the {{list}} Each value represents the timestamp index, given in units of {{param|.VoIPProfile.{i}.QICalculationInterval}}, when the corresponding value in {{param|WorstVoIPQualityIndicatorsValues}} was calculated.

The first index is number 1.

Only the N worst values are stored, where N is the limit stored in {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}}.

Example: if {{param|.VoIPProfile.{i}.QICalculationInterval}} is equal to 10 (seconds), the value "6,2,5" designates the time intervals 50-60 s, 10-20 s, and 40-50 s when the 3 worst values were calculated.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getWorstVoIPQualityIndicatorTimestamps() {
		return worstVoIPQualityIndicatorTimestamps;
	}

	/**
	 * Set the {{list}} Each value represents the timestamp index, given in units of {{param|.VoIPProfile.{i}.QICalculationInterval}}, when the corresponding value in {{param|WorstVoIPQualityIndicatorsValues}} was calculated.

The first index is number 1.

Only the N worst values are stored, where N is the limit stored in {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}}.

Example: if {{param|.VoIPProfile.{i}.QICalculationInterval}} is equal to 10 (seconds), the value "6,2,5" designates the time intervals 50-60 s, 10-20 s, and 40-50 s when the 3 worst values were calculated.
	 *
	 * @since 2.0
	 * @param worstVoIPQualityIndicatorTimestamps the input value
	 */
	public void  setWorstVoIPQualityIndicatorTimestamps(Long worstVoIPQualityIndicatorTimestamps) {
		this.worstVoIPQualityIndicatorTimestamps = worstVoIPQualityIndicatorTimestamps;
	}

	/**
	 * Set the {{list}} Each value represents the timestamp index, given in units of {{param|.VoIPProfile.{i}.QICalculationInterval}}, when the corresponding value in {{param|WorstVoIPQualityIndicatorsValues}} was calculated.

The first index is number 1.

Only the N worst values are stored, where N is the limit stored in {{param|.VoIPProfile.{i}.NumberOfWorstQIValues}}.

Example: if {{param|.VoIPProfile.{i}.QICalculationInterval}} is equal to 10 (seconds), the value "6,2,5" designates the time intervals 50-60 s, 10-20 s, and 40-50 s when the 3 worst values were calculated.
	 *
	 * @since 2.0
	 * @param worstVoIPQualityIndicatorTimestamps the input value
	 * @return this instance
	 */
	public VoiceQuality withWorstVoIPQualityIndicatorTimestamps(Long worstVoIPQualityIndicatorTimestamps) {
		this.worstVoIPQualityIndicatorTimestamps = worstVoIPQualityIndicatorTimestamps;
		return this;
	}

	//</editor-fold>

}