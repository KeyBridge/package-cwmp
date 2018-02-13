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
package org.broadbandforum.tr135.stbservice.capabilities;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object describes the capabilities of the {{object|.Applications.AudienceStats}} object.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Capabilities.AudienceStats.")
@XmlRootElement(name = "AudienceStats")
@XmlType(name = "STBService.Capabilities.AudienceStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudienceStats {

	/**
	 * Maximum number of channels that the STB MUST support in the {{object|.Applications.AudienceStats}} object

A value of -1 indicates no specific limit on the number of channels.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxAudienceStatsChannels")
	@Size(min = -1)
	public Integer maxAudienceStatsChannels;

	public AudienceStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of channels that the STB MUST support in the {{object|.Applications.AudienceStats}} object

A value of -1 indicates no specific limit on the number of channels.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getMaxAudienceStatsChannels() {
		return maxAudienceStatsChannels;
	}

	/**
	 * Set the maximum number of channels that the STB MUST support in the {{object|.Applications.AudienceStats}} object

A value of -1 indicates no specific limit on the number of channels.
	 *
	 * @since 1.0
	 * @param maxAudienceStatsChannels the input value
	 */
	public void  setMaxAudienceStatsChannels(Integer maxAudienceStatsChannels) {
		this.maxAudienceStatsChannels = maxAudienceStatsChannels;
	}

	/**
	 * Set the maximum number of channels that the STB MUST support in the {{object|.Applications.AudienceStats}} object

A value of -1 indicates no specific limit on the number of channels.
	 *
	 * @since 1.0
	 * @param maxAudienceStatsChannels the input value
	 * @return this instance
	 */
	public AudienceStats withMaxAudienceStatsChannels(Integer maxAudienceStatsChannels) {
		this.maxAudienceStatsChannels = maxAudienceStatsChannels;
		return this;
	}

	//</editor-fold>

}