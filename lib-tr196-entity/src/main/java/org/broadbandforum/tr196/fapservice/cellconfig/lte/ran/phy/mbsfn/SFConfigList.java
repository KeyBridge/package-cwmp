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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.mbsfn;

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
	 * This object contains parameters relating to the sub-frame that are reserved for MBSFN (Multimedia Broadcast multicast service Single Frequency Network) in downlink direction.  For FDD mode, only one entry can exist in this table. For TDD mode, at most one entry can exist with a given value of stratumID (see {{bibref|3GPP-TS.32.592|Section 6.1.1.8}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList.{i}.", uniqueConstraints = {@CWMPUnique(names = {"RadioFrameAllocationPeriod", "RadioframeAllocationOffset", "RadioFrameAllocationSize"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.MBSFN.SFConfigList")
@XmlAccessorType(XmlAccessType.FIELD)
public class SFConfigList {

	/**
	 * Enables or disables this entry.
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
	 * This parameter is applicable to TDD mode only. Defines the synchronization stratum level to which the MBSFN configuration applies.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SyncStratumID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 8)
	public Long syncStratumID;
	/**
	 * Defines the period where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param}}) = {{param|RadioframeAllocationOffset}}). The value of 1 and 2 are only meaningful when the value of {{param|RadioFrameAllocationSize}} parameter is 1.

Corresponds to radioFrameAllocationPeriod IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RadioFrameAllocationPeriod")
	@CWMPParameter(access = "readWrite")
	@Size(min = 32, max = 32)
	public Long radioFrameAllocationPeriod;
	/**
	 * Defines the offset where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param|RadioFrameAllocationPeriod}}) = {{param}}). Corresponds to radioFrameAllocationOffset IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RadioframeAllocationOffset")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long radioframeAllocationOffset;
	/**
	 * Defines the number of connsecutive frames that the MBSFN allocation pertains to defined by the combination of {{param|RadioFrameAllocationPeriod}} and {{param|RadioframeAllocationOffset}} parameters.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RadioFrameAllocationSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 4, max = 4)
	public Long radioFrameAllocationSize;
	/**
	 * {{list}} The value of "1" indicates the position of sub-frames that is allocated to MBSFN  within the radio frame.  First item defines the MBSFN allocation for sub-frame #1, second item for #2, third item for #3, fourth item for #6, fifth item for #7, sixth item for #8. If the value of {{param|RadioFrameAllocationSize}} is 4, then this pattern repeats in the sequence of the four radio frames.

The actual size of this parameter depends on the value of  {{param|RadioFrameAllocationSize}} parameter. If the value of {{param|RadioFrameAllocationSize}} is 1, then the size of this parameter is 6; if the size {{param|RadioFrameAllocationSize}} is 4, then the size of this parameter is 24.

Corresponds to subframeAllocation IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubFrameAllocations")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 1)
	public Long subFrameAllocations;

	public SFConfigList() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SFConfigList withEnable(Boolean enable) {
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
	public SFConfigList withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this parameter is applicable to TDD mode only. Defines the synchronization stratum level to which the MBSFN configuration applies.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSyncStratumID() {
		return syncStratumID;
	}

	/**
	 * Set the this parameter is applicable to TDD mode only. Defines the synchronization stratum level to which the MBSFN configuration applies.
	 *
	 * @since 2.0
	 * @param syncStratumID the input value
	 */
	public void  setSyncStratumID(Long syncStratumID) {
		this.syncStratumID = syncStratumID;
	}

	/**
	 * Set the this parameter is applicable to TDD mode only. Defines the synchronization stratum level to which the MBSFN configuration applies.
	 *
	 * @since 2.0
	 * @param syncStratumID the input value
	 * @return this instance
	 */
	public SFConfigList withSyncStratumID(Long syncStratumID) {
		this.syncStratumID = syncStratumID;
		return this;
	}

	/**
	 * Get the defines the period where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param}}) = {{param|RadioframeAllocationOffset}}). The value of 1 and 2 are only meaningful when the value of {{param|RadioFrameAllocationSize}} parameter is 1.

Corresponds to radioFrameAllocationPeriod IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRadioFrameAllocationPeriod() {
		return radioFrameAllocationPeriod;
	}

	/**
	 * Set the defines the period where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param}}) = {{param|RadioframeAllocationOffset}}). The value of 1 and 2 are only meaningful when the value of {{param|RadioFrameAllocationSize}} parameter is 1.

Corresponds to radioFrameAllocationPeriod IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param radioFrameAllocationPeriod the input value
	 */
	public void  setRadioFrameAllocationPeriod(Long radioFrameAllocationPeriod) {
		this.radioFrameAllocationPeriod = radioFrameAllocationPeriod;
	}

	/**
	 * Set the defines the period where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param}}) = {{param|RadioframeAllocationOffset}}). The value of 1 and 2 are only meaningful when the value of {{param|RadioFrameAllocationSize}} parameter is 1.

Corresponds to radioFrameAllocationPeriod IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param radioFrameAllocationPeriod the input value
	 * @return this instance
	 */
	public SFConfigList withRadioFrameAllocationPeriod(Long radioFrameAllocationPeriod) {
		this.radioFrameAllocationPeriod = radioFrameAllocationPeriod;
		return this;
	}

	/**
	 * Get the defines the offset where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param|RadioFrameAllocationPeriod}}) = {{param}}). Corresponds to radioFrameAllocationOffset IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRadioframeAllocationOffset() {
		return radioframeAllocationOffset;
	}

	/**
	 * Set the defines the offset where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param|RadioFrameAllocationPeriod}}) = {{param}}). Corresponds to radioFrameAllocationOffset IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param radioframeAllocationOffset the input value
	 */
	public void  setRadioframeAllocationOffset(Long radioframeAllocationOffset) {
		this.radioframeAllocationOffset = radioframeAllocationOffset;
	}

	/**
	 * Set the defines the offset where MBSFN sub-frames occur in the radio frames. Radio frames contain MBSFN sub-frame when the following condition is met: ((SFN mod {{param|RadioFrameAllocationPeriod}}) = {{param}}). Corresponds to radioFrameAllocationOffset IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param radioframeAllocationOffset the input value
	 * @return this instance
	 */
	public SFConfigList withRadioframeAllocationOffset(Long radioframeAllocationOffset) {
		this.radioframeAllocationOffset = radioframeAllocationOffset;
		return this;
	}

	/**
	 * Get the defines the number of connsecutive frames that the MBSFN allocation pertains to defined by the combination of {{param|RadioFrameAllocationPeriod}} and {{param|RadioframeAllocationOffset}} parameters.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRadioFrameAllocationSize() {
		return radioFrameAllocationSize;
	}

	/**
	 * Set the defines the number of connsecutive frames that the MBSFN allocation pertains to defined by the combination of {{param|RadioFrameAllocationPeriod}} and {{param|RadioframeAllocationOffset}} parameters.
	 *
	 * @since 2.0
	 * @param radioFrameAllocationSize the input value
	 */
	public void  setRadioFrameAllocationSize(Long radioFrameAllocationSize) {
		this.radioFrameAllocationSize = radioFrameAllocationSize;
	}

	/**
	 * Set the defines the number of connsecutive frames that the MBSFN allocation pertains to defined by the combination of {{param|RadioFrameAllocationPeriod}} and {{param|RadioframeAllocationOffset}} parameters.
	 *
	 * @since 2.0
	 * @param radioFrameAllocationSize the input value
	 * @return this instance
	 */
	public SFConfigList withRadioFrameAllocationSize(Long radioFrameAllocationSize) {
		this.radioFrameAllocationSize = radioFrameAllocationSize;
		return this;
	}

	/**
	 * Get the {{list}} The value of "1" indicates the position of sub-frames that is allocated to MBSFN  within the radio frame.  First item defines the MBSFN allocation for sub-frame #1, second item for #2, third item for #3, fourth item for #6, fifth item for #7, sixth item for #8. If the value of {{param|RadioFrameAllocationSize}} is 4, then this pattern repeats in the sequence of the four radio frames.

The actual size of this parameter depends on the value of  {{param|RadioFrameAllocationSize}} parameter. If the value of {{param|RadioFrameAllocationSize}} is 1, then the size of this parameter is 6; if the size {{param|RadioFrameAllocationSize}} is 4, then the size of this parameter is 24.

Corresponds to subframeAllocation IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSubFrameAllocations() {
		return subFrameAllocations;
	}

	/**
	 * Set the {{list}} The value of "1" indicates the position of sub-frames that is allocated to MBSFN  within the radio frame.  First item defines the MBSFN allocation for sub-frame #1, second item for #2, third item for #3, fourth item for #6, fifth item for #7, sixth item for #8. If the value of {{param|RadioFrameAllocationSize}} is 4, then this pattern repeats in the sequence of the four radio frames.

The actual size of this parameter depends on the value of  {{param|RadioFrameAllocationSize}} parameter. If the value of {{param|RadioFrameAllocationSize}} is 1, then the size of this parameter is 6; if the size {{param|RadioFrameAllocationSize}} is 4, then the size of this parameter is 24.

Corresponds to subframeAllocation IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param subFrameAllocations the input value
	 */
	public void  setSubFrameAllocations(Long subFrameAllocations) {
		this.subFrameAllocations = subFrameAllocations;
	}

	/**
	 * Set the {{list}} The value of "1" indicates the position of sub-frames that is allocated to MBSFN  within the radio frame.  First item defines the MBSFN allocation for sub-frame #1, second item for #2, third item for #3, fourth item for #6, fifth item for #7, sixth item for #8. If the value of {{param|RadioFrameAllocationSize}} is 4, then this pattern repeats in the sequence of the four radio frames.

The actual size of this parameter depends on the value of  {{param|RadioFrameAllocationSize}} parameter. If the value of {{param|RadioFrameAllocationSize}} is 1, then the size of this parameter is 6; if the size {{param|RadioFrameAllocationSize}} is 4, then the size of this parameter is 24.

Corresponds to subframeAllocation IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param subFrameAllocations the input value
	 * @return this instance
	 */
	public SFConfigList withSubFrameAllocations(Long subFrameAllocations) {
		this.subFrameAllocations = subFrameAllocations;
		return this;
	}

	//</editor-fold>

}