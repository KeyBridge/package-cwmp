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
package org.broadbandforum.tr104.voiceservice.capabilities;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Specific capabilities concerning quality indicators.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.QualityIndicator.")
@XmlRootElement(name = "QualityIndicator")
@XmlType(name = "VoiceService.Capabilities.QualityIndicator")
@XmlAccessorType(XmlAccessType.FIELD)
public class QualityIndicator {

	/**
	 * Comma-separated list of supported models for evaluation of VoIP Quality Indicator. {{empty}} indicates that CPE does not support evaluation of this indicator.

The entry MAY include vendor-specific models, which MUST be in the format defined in {{bibref|TR-106}}.

For example: “P.564,G.107,X_EXAMPLE-COM_MyModel”
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QIModelsSupported")
	public String qimodelsSupported;
	/**
	 * Specifies the maximum number of QI values which can be reported for a session. If this parameter is empty there is no specified maximum limit.

If possible this limit SHOULD be large enough to handle at least 10 to 15 minutes of call time, which would typically mean 60 to 90 quality values for commonly used quality models.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxQIValues")
	@Size(min = 0, max = 127)
	public Long maxQIValues;
	/**
	 * Maximum number of worst QI values which the CPE is able to store and report. A value of 0 indicates no specific maximum number of worst QI values.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxWorstQIValues")
	@Size(min = 0, max = 127)
	public Long maxWorstQIValues;

	public QualityIndicator() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the comma-separated list of supported models for evaluation of VoIP Quality Indicator. {{empty}} indicates that CPE does not support evaluation of this indicator.

The entry MAY include vendor-specific models, which MUST be in the format defined in {{bibref|TR-106}}.

For example: “P.564,G.107,X_EXAMPLE-COM_MyModel”
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getQimodelsSupported() {
		return qimodelsSupported;
	}

	/**
	 * Set the comma-separated list of supported models for evaluation of VoIP Quality Indicator. {{empty}} indicates that CPE does not support evaluation of this indicator.

The entry MAY include vendor-specific models, which MUST be in the format defined in {{bibref|TR-106}}.

For example: “P.564,G.107,X_EXAMPLE-COM_MyModel”
	 *
	 * @since 2.0
	 * @param qimodelsSupported the input value
	 */
	public void  setQimodelsSupported(String qimodelsSupported) {
		this.qimodelsSupported = qimodelsSupported;
	}

	/**
	 * Set the comma-separated list of supported models for evaluation of VoIP Quality Indicator. {{empty}} indicates that CPE does not support evaluation of this indicator.

The entry MAY include vendor-specific models, which MUST be in the format defined in {{bibref|TR-106}}.

For example: “P.564,G.107,X_EXAMPLE-COM_MyModel”
	 *
	 * @since 2.0
	 * @param qimodelsSupported the input value
	 * @return this instance
	 */
	public QualityIndicator withQimodelsSupported(String qimodelsSupported) {
		this.qimodelsSupported = qimodelsSupported;
		return this;
	}

	/**
	 * Get the specifies the maximum number of QI values which can be reported for a session. If this parameter is empty there is no specified maximum limit.

If possible this limit SHOULD be large enough to handle at least 10 to 15 minutes of call time, which would typically mean 60 to 90 quality values for commonly used quality models.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxQIValues() {
		return maxQIValues;
	}

	/**
	 * Set the specifies the maximum number of QI values which can be reported for a session. If this parameter is empty there is no specified maximum limit.

If possible this limit SHOULD be large enough to handle at least 10 to 15 minutes of call time, which would typically mean 60 to 90 quality values for commonly used quality models.
	 *
	 * @since 2.0
	 * @param maxQIValues the input value
	 */
	public void  setMaxQIValues(Long maxQIValues) {
		this.maxQIValues = maxQIValues;
	}

	/**
	 * Set the specifies the maximum number of QI values which can be reported for a session. If this parameter is empty there is no specified maximum limit.

If possible this limit SHOULD be large enough to handle at least 10 to 15 minutes of call time, which would typically mean 60 to 90 quality values for commonly used quality models.
	 *
	 * @since 2.0
	 * @param maxQIValues the input value
	 * @return this instance
	 */
	public QualityIndicator withMaxQIValues(Long maxQIValues) {
		this.maxQIValues = maxQIValues;
		return this;
	}

	/**
	 * Get the maximum number of worst QI values which the CPE is able to store and report. A value of 0 indicates no specific maximum number of worst QI values.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxWorstQIValues() {
		return maxWorstQIValues;
	}

	/**
	 * Set the maximum number of worst QI values which the CPE is able to store and report. A value of 0 indicates no specific maximum number of worst QI values.
	 *
	 * @since 2.0
	 * @param maxWorstQIValues the input value
	 */
	public void  setMaxWorstQIValues(Long maxWorstQIValues) {
		this.maxWorstQIValues = maxWorstQIValues;
	}

	/**
	 * Set the maximum number of worst QI values which the CPE is able to store and report. A value of 0 indicates no specific maximum number of worst QI values.
	 *
	 * @since 2.0
	 * @param maxWorstQIValues the input value
	 * @return this instance
	 */
	public QualityIndicator withMaxWorstQIValues(Long maxWorstQIValues) {
		this.maxWorstQIValues = maxWorstQIValues;
		return this;
	}

	//</editor-fold>

}