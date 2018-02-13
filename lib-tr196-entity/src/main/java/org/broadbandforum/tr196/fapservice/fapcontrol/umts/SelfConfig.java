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
package org.broadbandforum.tr196.fapservice.fapcontrol.umts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the controlling of self-configuration capabilities in the FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.UMTS.SelfConfig.")
@XmlRootElement(name = "FAPService.FAPControl.UMTS.SelfConfig")
@XmlType(name = "FAPService.FAPControl.UMTS.SelfConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class SelfConfig {

	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.RAN.CSG.UARFCNDLList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean uarFCNSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.

If {{true}} the FAP self-configures the value.

If {{false}} the ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrimaryScramblingCodeSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean primaryScramblingCodeSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerExpandedSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean maxFAPTxPowerExpandedSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHPowerSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean pcpICHPowerSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxULTxPowerSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean maxULTxPowerSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LACRACURASelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean lacRACURASelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the values in the object {{object|.CellConfig.UMTS.RAN.NeighborList.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NeighborListSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean neighborListSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine Cell Selection/Reselection-related parameters in {{object|.CellConfig.UMTS.RAN.CellSelection.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReSelectionSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean cellReSelectionSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine intra-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IntraFreqMeasSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean intraFreqMeasSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine inter-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterFreqMeasSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean interFreqMeasSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine inter-RAT measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterRATMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterRATMeasSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean interRATMeasSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine UE internal measurement-related parameters in {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UEInternalMeasConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean ueinternalMeasConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitInUse}}.

If {{true}} the FAP self-configures the value, based on the limits specified in {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}.

If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NoiseRiseLimitConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean noiseRiseLimitConfigEnable;

	public SelfConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.RAN.CSG.UARFCNDLList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUarFCNSelfConfigEnable() {
		return uarFCNSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.RAN.CSG.UARFCNDLList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param uarFCNSelfConfigEnable the input value
	 */
	public void  setUarFCNSelfConfigEnable(Boolean uarFCNSelfConfigEnable) {
		this.uarFCNSelfConfigEnable = uarFCNSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.RAN.CSG.UARFCNDLList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param uarFCNSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withUarFCNSelfConfigEnable(Boolean uarFCNSelfConfigEnable) {
		this.uarFCNSelfConfigEnable = uarFCNSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.

If {{true}} the FAP self-configures the value.

If {{false}} the ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPrimaryScramblingCodeSelfConfigEnable() {
		return primaryScramblingCodeSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.

If {{true}} the FAP self-configures the value.

If {{false}} the ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param primaryScramblingCodeSelfConfigEnable the input value
	 */
	public void  setPrimaryScramblingCodeSelfConfigEnable(Boolean primaryScramblingCodeSelfConfigEnable) {
		this.primaryScramblingCodeSelfConfigEnable = primaryScramblingCodeSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.

If {{true}} the FAP self-configures the value.

If {{false}} the ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param primaryScramblingCodeSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withPrimaryScramblingCodeSelfConfigEnable(Boolean primaryScramblingCodeSelfConfigEnable) {
		this.primaryScramblingCodeSelfConfigEnable = primaryScramblingCodeSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxFAPTxPowerExpandedSelfConfigEnable() {
		return maxFAPTxPowerExpandedSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerExpandedSelfConfigEnable the input value
	 */
	public void  setMaxFAPTxPowerExpandedSelfConfigEnable(Boolean maxFAPTxPowerExpandedSelfConfigEnable) {
		this.maxFAPTxPowerExpandedSelfConfigEnable = maxFAPTxPowerExpandedSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerExpandedSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withMaxFAPTxPowerExpandedSelfConfigEnable(Boolean maxFAPTxPowerExpandedSelfConfigEnable) {
		this.maxFAPTxPowerExpandedSelfConfigEnable = maxFAPTxPowerExpandedSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPcpICHPowerSelfConfigEnable() {
		return pcpICHPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param pcpICHPowerSelfConfigEnable the input value
	 */
	public void  setPcpICHPowerSelfConfigEnable(Boolean pcpICHPowerSelfConfigEnable) {
		this.pcpICHPowerSelfConfigEnable = pcpICHPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param pcpICHPowerSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withPcpICHPowerSelfConfigEnable(Boolean pcpICHPowerSelfConfigEnable) {
		this.pcpICHPowerSelfConfigEnable = pcpICHPowerSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxULTxPowerSelfConfigEnable() {
		return maxULTxPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxULTxPowerSelfConfigEnable the input value
	 */
	public void  setMaxULTxPowerSelfConfigEnable(Boolean maxULTxPowerSelfConfigEnable) {
		this.maxULTxPowerSelfConfigEnable = maxULTxPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxULTxPowerSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withMaxULTxPowerSelfConfigEnable(Boolean maxULTxPowerSelfConfigEnable) {
		this.maxULTxPowerSelfConfigEnable = maxULTxPowerSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLacRACURASelfConfigEnable() {
		return lacRACURASelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param lacRACURASelfConfigEnable the input value
	 */
	public void  setLacRACURASelfConfigEnable(Boolean lacRACURASelfConfigEnable) {
		this.lacRACURASelfConfigEnable = lacRACURASelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param lacRACURASelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withLacRACURASelfConfigEnable(Boolean lacRACURASelfConfigEnable) {
		this.lacRACURASelfConfigEnable = lacRACURASelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the values in the object {{object|.CellConfig.UMTS.RAN.NeighborList.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNeighborListSelfConfigEnable() {
		return neighborListSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values in the object {{object|.CellConfig.UMTS.RAN.NeighborList.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param neighborListSelfConfigEnable the input value
	 */
	public void  setNeighborListSelfConfigEnable(Boolean neighborListSelfConfigEnable) {
		this.neighborListSelfConfigEnable = neighborListSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values in the object {{object|.CellConfig.UMTS.RAN.NeighborList.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param neighborListSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withNeighborListSelfConfigEnable(Boolean neighborListSelfConfigEnable) {
		this.neighborListSelfConfigEnable = neighborListSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine Cell Selection/Reselection-related parameters in {{object|.CellConfig.UMTS.RAN.CellSelection.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellReSelectionSelfConfigEnable() {
		return cellReSelectionSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine Cell Selection/Reselection-related parameters in {{object|.CellConfig.UMTS.RAN.CellSelection.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param cellReSelectionSelfConfigEnable the input value
	 */
	public void  setCellReSelectionSelfConfigEnable(Boolean cellReSelectionSelfConfigEnable) {
		this.cellReSelectionSelfConfigEnable = cellReSelectionSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine Cell Selection/Reselection-related parameters in {{object|.CellConfig.UMTS.RAN.CellSelection.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param cellReSelectionSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withCellReSelectionSelfConfigEnable(Boolean cellReSelectionSelfConfigEnable) {
		this.cellReSelectionSelfConfigEnable = cellReSelectionSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine intra-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntraFreqMeasSelfConfigEnable() {
		return intraFreqMeasSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine intra-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param intraFreqMeasSelfConfigEnable the input value
	 */
	public void  setIntraFreqMeasSelfConfigEnable(Boolean intraFreqMeasSelfConfigEnable) {
		this.intraFreqMeasSelfConfigEnable = intraFreqMeasSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine intra-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param intraFreqMeasSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withIntraFreqMeasSelfConfigEnable(Boolean intraFreqMeasSelfConfigEnable) {
		this.intraFreqMeasSelfConfigEnable = intraFreqMeasSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine inter-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isInterFreqMeasSelfConfigEnable() {
		return interFreqMeasSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine inter-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param interFreqMeasSelfConfigEnable the input value
	 */
	public void  setInterFreqMeasSelfConfigEnable(Boolean interFreqMeasSelfConfigEnable) {
		this.interFreqMeasSelfConfigEnable = interFreqMeasSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine inter-frequency measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param interFreqMeasSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withInterFreqMeasSelfConfigEnable(Boolean interFreqMeasSelfConfigEnable) {
		this.interFreqMeasSelfConfigEnable = interFreqMeasSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine inter-RAT measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterRATMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isInterRATMeasSelfConfigEnable() {
		return interRATMeasSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine inter-RAT measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterRATMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param interRATMeasSelfConfigEnable the input value
	 */
	public void  setInterRATMeasSelfConfigEnable(Boolean interRATMeasSelfConfigEnable) {
		this.interRATMeasSelfConfigEnable = interRATMeasSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine inter-RAT measurement -related parameters in {{object|.CellConfig.UMTS.RAN.InterRATMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param interRATMeasSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withInterRATMeasSelfConfigEnable(Boolean interRATMeasSelfConfigEnable) {
		this.interRATMeasSelfConfigEnable = interRATMeasSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine UE internal measurement-related parameters in {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUeinternalMeasConfigEnable() {
		return ueinternalMeasConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine UE internal measurement-related parameters in {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param ueinternalMeasConfigEnable the input value
	 */
	public void  setUeinternalMeasConfigEnable(Boolean ueinternalMeasConfigEnable) {
		this.ueinternalMeasConfigEnable = ueinternalMeasConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine UE internal measurement-related parameters in {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}}

If {{true}} The FAP self-configures the value.

If {{false}} The ACS MUST provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param ueinternalMeasConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withUeinternalMeasConfigEnable(Boolean ueinternalMeasConfigEnable) {
		this.ueinternalMeasConfigEnable = ueinternalMeasConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitInUse}}.

If {{true}} the FAP self-configures the value, based on the limits specified in {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}.

If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNoiseRiseLimitConfigEnable() {
		return noiseRiseLimitConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitInUse}}.

If {{true}} the FAP self-configures the value, based on the limits specified in {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}.

If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitConfigEnable the input value
	 */
	public void  setNoiseRiseLimitConfigEnable(Boolean noiseRiseLimitConfigEnable) {
		this.noiseRiseLimitConfigEnable = noiseRiseLimitConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitInUse}}.

If {{true}} the FAP self-configures the value, based on the limits specified in {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}.

If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withNoiseRiseLimitConfigEnable(Boolean noiseRiseLimitConfigEnable) {
		this.noiseRiseLimitConfigEnable = noiseRiseLimitConfigEnable;
		return this;
	}

	//</editor-fold>

}