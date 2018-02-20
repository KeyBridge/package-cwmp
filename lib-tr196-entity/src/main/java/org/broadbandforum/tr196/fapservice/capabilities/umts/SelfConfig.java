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
package org.broadbandforum.tr196.fapservice.capabilities.umts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.UMTS.SelfConfig.}}
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.UMTS.SelfConfig.")
@XmlRootElement(name = "FAPService.Capabilities.UMTS.SelfConfig")
@XmlType(name = "FAPService.Capabilities.UMTS.SelfConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class SelfConfig {

	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the UTRA Absolute Radio Frequency Channel Number (UARFCN).

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNConfig")
	public Boolean uarFCNConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the Primary Scrambling Code (PSC).

If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrimaryScramblingCodeConfig")
	public Boolean primaryScramblingCodeConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerExpandedConfig")
	public Boolean maxFAPTxPowerExpandedConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the P-CPICH power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} as an upper bound.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHPowerConfig")
	public Boolean pcpICHPowerConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the Maximum UL Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxULTxPowerConfig")
	public Boolean maxULTxPowerConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the LAC, RAC, and URA.

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LACRACURAConfig")
	public Boolean lacRACURAConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the neighbor list.

If {{true}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to explicitly include or exclude entries and the FAP uses that information to determine the final configuration found in the {{object|.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.}} tables.

If {{false}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to only specify the included entries and the FAP uses that list.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NeighborListConfig")
	public Boolean neighborListConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine cell-reselection values.

If {{true}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} is provided by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReSelectionConfig")
	public Boolean cellReSelectionConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine intra-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IntraFreqMeasConfig")
	public Boolean intraFreqMeasConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine inter-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterFreqMeasConfig")
	public Boolean interFreqMeasConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine inter-RAT measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InterRATMeasConfig")
	public Boolean interRATMeasConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine UE internal measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UEInternalMeasConfig")
	public Boolean ueinternalMeasConfig;
	/**
	 * Indicates whether the FAP supports the selfconfiguration capability to determine the Noise Rise Limit.

If {{true}}  {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}. MAY provide a range of values to select from.

If {{false}} {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}} provides only a single value to be used. The value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} is ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NoiseRiseLimitConfig")
	public Boolean noiseRiseLimitConfig;

	public SelfConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the UTRA Absolute Radio Frequency Channel Number (UARFCN).

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUarFCNConfig() {
		return uarFCNConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the UTRA Absolute Radio Frequency Channel Number (UARFCN).

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}}.
	 *
	 * @since 2.0
	 * @param uarFCNConfig the input value
	 */
	public void  setUarFCNConfig(Boolean uarFCNConfig) {
		this.uarFCNConfig = uarFCNConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the UTRA Absolute Radio Frequency Channel Number (UARFCN).

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.UARFCNDL}}.
	 *
	 * @since 2.0
	 * @param uarFCNConfig the input value
	 * @return this instance
	 */
	public SelfConfig withUarFCNConfig(Boolean uarFCNConfig) {
		this.uarFCNConfig = uarFCNConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the Primary Scrambling Code (PSC).

If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPrimaryScramblingCodeConfig() {
		return primaryScramblingCodeConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Primary Scrambling Code (PSC).

If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 * @param primaryScramblingCodeConfig the input value
	 */
	public void  setPrimaryScramblingCodeConfig(Boolean primaryScramblingCodeConfig) {
		this.primaryScramblingCodeConfig = primaryScramblingCodeConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Primary Scrambling Code (PSC).

If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 * @param primaryScramblingCodeConfig the input value
	 * @return this instance
	 */
	public SelfConfig withPrimaryScramblingCodeConfig(Boolean primaryScramblingCodeConfig) {
		this.primaryScramblingCodeConfig = primaryScramblingCodeConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxFAPTxPowerExpandedConfig() {
		return maxFAPTxPowerExpandedConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerExpandedConfig the input value
	 */
	public void  setMaxFAPTxPowerExpandedConfig(Boolean maxFAPTxPowerExpandedConfig) {
		this.maxFAPTxPowerExpandedConfig = maxFAPTxPowerExpandedConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxFAPTxPowerExpanded}}.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerExpandedConfig the input value
	 * @return this instance
	 */
	public SelfConfig withMaxFAPTxPowerExpandedConfig(Boolean maxFAPTxPowerExpandedConfig) {
		this.maxFAPTxPowerExpandedConfig = maxFAPTxPowerExpandedConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the P-CPICH power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} as an upper bound.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPcpICHPowerConfig() {
		return pcpICHPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the P-CPICH power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} as an upper bound.
	 *
	 * @since 2.0
	 * @param pcpICHPowerConfig the input value
	 */
	public void  setPcpICHPowerConfig(Boolean pcpICHPowerConfig) {
		this.pcpICHPowerConfig = pcpICHPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the P-CPICH power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.PCPICHPower}} as an upper bound.
	 *
	 * @since 2.0
	 * @param pcpICHPowerConfig the input value
	 * @return this instance
	 */
	public SelfConfig withPcpICHPowerConfig(Boolean pcpICHPowerConfig) {
		this.pcpICHPowerConfig = pcpICHPowerConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the Maximum UL Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxULTxPowerConfig() {
		return maxULTxPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum UL Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.
	 *
	 * @since 2.0
	 * @param maxULTxPowerConfig the input value
	 */
	public void  setMaxULTxPowerConfig(Boolean maxULTxPowerConfig) {
		this.maxULTxPowerConfig = maxULTxPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum UL Transmit Power.

If {{true}} a range of values MAY be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.RAN.RF.MaxULTxPower}}.
	 *
	 * @since 2.0
	 * @param maxULTxPowerConfig the input value
	 * @return this instance
	 */
	public SelfConfig withMaxULTxPowerConfig(Boolean maxULTxPowerConfig) {
		this.maxULTxPowerConfig = maxULTxPowerConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the LAC, RAC, and URA.

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLacRACURAConfig() {
		return lacRACURAConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the LAC, RAC, and URA.

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.
	 *
	 * @since 2.0
	 * @param lacRACURAConfig the input value
	 */
	public void  setLacRACURAConfig(Boolean lacRACURAConfig) {
		this.lacRACURAConfig = lacRACURAConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the LAC, RAC, and URA.

If {{true}} multiple values MAY be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}} for the FAP to select from.

If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.UMTS.CN.LACRAC}} and {{param|.CellConfig.UMTS.RAN.URAList}}.
	 *
	 * @since 2.0
	 * @param lacRACURAConfig the input value
	 * @return this instance
	 */
	public SelfConfig withLacRACURAConfig(Boolean lacRACURAConfig) {
		this.lacRACURAConfig = lacRACURAConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the neighbor list.

If {{true}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to explicitly include or exclude entries and the FAP uses that information to determine the final configuration found in the {{object|.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.}} tables.

If {{false}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to only specify the included entries and the FAP uses that list.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNeighborListConfig() {
		return neighborListConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the neighbor list.

If {{true}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to explicitly include or exclude entries and the FAP uses that information to determine the final configuration found in the {{object|.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.}} tables.

If {{false}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to only specify the included entries and the FAP uses that list.
	 *
	 * @since 2.0
	 * @param neighborListConfig the input value
	 */
	public void  setNeighborListConfig(Boolean neighborListConfig) {
		this.neighborListConfig = neighborListConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the neighbor list.

If {{true}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to explicitly include or exclude entries and the FAP uses that information to determine the final configuration found in the {{object|.CellConfig.UMTS.RAN.NeighborListInUse.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborListInUse.InterRATCell.}} tables.

If {{false}} the ACS uses the {{object|.CellConfig.UMTS.RAN.NeighborList.IntraFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterFreqCell.{i}.}}, {{object|.CellConfig.UMTS.RAN.NeighborList.InterRATCell.}} tables to only specify the included entries and the FAP uses that list.
	 *
	 * @since 2.0
	 * @param neighborListConfig the input value
	 * @return this instance
	 */
	public SelfConfig withNeighborListConfig(Boolean neighborListConfig) {
		this.neighborListConfig = neighborListConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine cell-reselection values.

If {{true}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellReSelectionConfig() {
		return cellReSelectionConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine cell-reselection values.

If {{true}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param cellReSelectionConfig the input value
	 */
	public void  setCellReSelectionConfig(Boolean cellReSelectionConfig) {
		this.cellReSelectionConfig = cellReSelectionConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine cell-reselection values.

If {{true}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.CellSelection.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param cellReSelectionConfig the input value
	 * @return this instance
	 */
	public SelfConfig withCellReSelectionConfig(Boolean cellReSelectionConfig) {
		this.cellReSelectionConfig = cellReSelectionConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine intra-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntraFreqMeasConfig() {
		return intraFreqMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine intra-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param intraFreqMeasConfig the input value
	 */
	public void  setIntraFreqMeasConfig(Boolean intraFreqMeasConfig) {
		this.intraFreqMeasConfig = intraFreqMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine intra-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.IntraFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param intraFreqMeasConfig the input value
	 * @return this instance
	 */
	public SelfConfig withIntraFreqMeasConfig(Boolean intraFreqMeasConfig) {
		this.intraFreqMeasConfig = intraFreqMeasConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine inter-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isInterFreqMeasConfig() {
		return interFreqMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine inter-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param interFreqMeasConfig the input value
	 */
	public void  setInterFreqMeasConfig(Boolean interFreqMeasConfig) {
		this.interFreqMeasConfig = interFreqMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine inter-frequency measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterFreqMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param interFreqMeasConfig the input value
	 * @return this instance
	 */
	public SelfConfig withInterFreqMeasConfig(Boolean interFreqMeasConfig) {
		this.interFreqMeasConfig = interFreqMeasConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine inter-RAT measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isInterRATMeasConfig() {
		return interRATMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine inter-RAT measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param interRATMeasConfig the input value
	 */
	public void  setInterRATMeasConfig(Boolean interRATMeasConfig) {
		this.interRATMeasConfig = interRATMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine inter-RAT measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.InterRATMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param interRATMeasConfig the input value
	 * @return this instance
	 */
	public SelfConfig withInterRATMeasConfig(Boolean interRATMeasConfig) {
		this.interRATMeasConfig = interRATMeasConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine UE internal measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUeinternalMeasConfig() {
		return ueinternalMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine UE internal measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param ueinternalMeasConfig the input value
	 */
	public void  setUeinternalMeasConfig(Boolean ueinternalMeasConfig) {
		this.ueinternalMeasConfig = ueinternalMeasConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine UE internal measurement values.

If {{true}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} can be self-configured.

If {{false}} {{object|.CellConfig.UMTS.RAN.UEInternalMeas.}} is provided by the ACS.
	 *
	 * @since 2.0
	 * @param ueinternalMeasConfig the input value
	 * @return this instance
	 */
	public SelfConfig withUeinternalMeasConfig(Boolean ueinternalMeasConfig) {
		this.ueinternalMeasConfig = ueinternalMeasConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the selfconfiguration capability to determine the Noise Rise Limit.

If {{true}}  {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}. MAY provide a range of values to select from.

If {{false}} {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}} provides only a single value to be used. The value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} is ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNoiseRiseLimitConfig() {
		return noiseRiseLimitConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the selfconfiguration capability to determine the Noise Rise Limit.

If {{true}}  {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}. MAY provide a range of values to select from.

If {{false}} {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}} provides only a single value to be used. The value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} is ignored.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitConfig the input value
	 */
	public void  setNoiseRiseLimitConfig(Boolean noiseRiseLimitConfig) {
		this.noiseRiseLimitConfig = noiseRiseLimitConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the selfconfiguration capability to determine the Noise Rise Limit.

If {{true}}  {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} and {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}. MAY provide a range of values to select from.

If {{false}} {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}} provides only a single value to be used. The value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}} is ignored.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitConfig the input value
	 * @return this instance
	 */
	public SelfConfig withNoiseRiseLimitConfig(Boolean noiseRiseLimitConfig) {
		this.noiseRiseLimitConfig = noiseRiseLimitConfig;
		return this;
	}

	//</editor-fold>

}