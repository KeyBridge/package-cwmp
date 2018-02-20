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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.pusch;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the ULRS (Uplink Reference Signal) of PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6.1}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.PUSCH.ULRS.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY.PUSCH.ULRS")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.PUSCH.ULRS")
@XmlAccessorType(XmlAccessType.FIELD)
public class ULRS {

	/**
	 * Indicates whether group hopping is enabled or not. If {{true}}, group hopping is enabled. If {{false}}, group hopping is not enabled.

Corresponds to groupHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GroupHoppingEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean groupHoppingEnabled;
	/**
	 * Corresponds to parameter groupAssignmentPUSCH specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GroupAssignmentPUSCH")
	@Size(min = 0, max = 29)
	public Long groupAssignmentPUSCH;
	/**
	 * Indicates whether sequence hopping is enabled or not. If {{true}}, sequence hopping is enabled. If {{false}}, sequence hopping is not enabled.

Corresponds to sequenceHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SequenceHoppingEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean sequenceHoppingEnabled;
	/**
	 * Corresponds to parameter cyclcShift specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CyclicShift")
	@Size(min = 0, max = 7)
	public Long cyclicShift;

	public ULRS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether group hopping is enabled or not. If {{true}}, group hopping is enabled. If {{false}}, group hopping is not enabled.

Corresponds to groupHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isGroupHoppingEnabled() {
		return groupHoppingEnabled;
	}

	/**
	 * Set the indicates whether group hopping is enabled or not. If {{true}}, group hopping is enabled. If {{false}}, group hopping is not enabled.

Corresponds to groupHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.3}}.
	 *
	 * @since 2.0
	 * @param groupHoppingEnabled the input value
	 */
	public void  setGroupHoppingEnabled(Boolean groupHoppingEnabled) {
		this.groupHoppingEnabled = groupHoppingEnabled;
	}

	/**
	 * Set the indicates whether group hopping is enabled or not. If {{true}}, group hopping is enabled. If {{false}}, group hopping is not enabled.

Corresponds to groupHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.3}}.
	 *
	 * @since 2.0
	 * @param groupHoppingEnabled the input value
	 * @return this instance
	 */
	public ULRS withGroupHoppingEnabled(Boolean groupHoppingEnabled) {
		this.groupHoppingEnabled = groupHoppingEnabled;
		return this;
	}

	/**
	 * Get the corresponds to parameter groupAssignmentPUSCH specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getGroupAssignmentPUSCH() {
		return groupAssignmentPUSCH;
	}

	/**
	 * Set the corresponds to parameter groupAssignmentPUSCH specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param groupAssignmentPUSCH the input value
	 */
	public void  setGroupAssignmentPUSCH(Long groupAssignmentPUSCH) {
		this.groupAssignmentPUSCH = groupAssignmentPUSCH;
	}

	/**
	 * Set the corresponds to parameter groupAssignmentPUSCH specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param groupAssignmentPUSCH the input value
	 * @return this instance
	 */
	public ULRS withGroupAssignmentPUSCH(Long groupAssignmentPUSCH) {
		this.groupAssignmentPUSCH = groupAssignmentPUSCH;
		return this;
	}

	/**
	 * Get the indicates whether sequence hopping is enabled or not. If {{true}}, sequence hopping is enabled. If {{false}}, sequence hopping is not enabled.

Corresponds to sequenceHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSequenceHoppingEnabled() {
		return sequenceHoppingEnabled;
	}

	/**
	 * Set the indicates whether sequence hopping is enabled or not. If {{true}}, sequence hopping is enabled. If {{false}}, sequence hopping is not enabled.

Corresponds to sequenceHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.4}}.
	 *
	 * @since 2.0
	 * @param sequenceHoppingEnabled the input value
	 */
	public void  setSequenceHoppingEnabled(Boolean sequenceHoppingEnabled) {
		this.sequenceHoppingEnabled = sequenceHoppingEnabled;
	}

	/**
	 * Set the indicates whether sequence hopping is enabled or not. If {{true}}, sequence hopping is enabled. If {{false}}, sequence hopping is not enabled.

Corresponds to sequenceHoppingEnabled parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.and in {{bibref|3GPP-TS.36.211|Section 5.5.1.4}}.
	 *
	 * @since 2.0
	 * @param sequenceHoppingEnabled the input value
	 * @return this instance
	 */
	public ULRS withSequenceHoppingEnabled(Boolean sequenceHoppingEnabled) {
		this.sequenceHoppingEnabled = sequenceHoppingEnabled;
		return this;
	}

	/**
	 * Get the corresponds to parameter cyclcShift specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCyclicShift() {
		return cyclicShift;
	}

	/**
	 * Set the corresponds to parameter cyclcShift specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param cyclicShift the input value
	 */
	public void  setCyclicShift(Long cyclicShift) {
		this.cyclicShift = cyclicShift;
	}

	/**
	 * Set the corresponds to parameter cyclcShift specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param cyclicShift the input value
	 * @return this instance
	 */
	public ULRS withCyclicShift(Long cyclicShift) {
		this.cyclicShift = cyclicShift;
		return this;
	}

	//</editor-fold>

}