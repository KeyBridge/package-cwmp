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
package org.broadbandforum.tr196.fapservice.capabilities.cdma2000.hrpd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains parameters relating to the self-configuration capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.CDMA2000.HRPD.SelfConfig.")
@XmlRootElement(name = "FAPService.Capabilities.CDMA2000.HRPD.SelfConfig")
@XmlType(name = "FAPService.Capabilities.CDMA2000.HRPD.SelfConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class SelfConfig {

	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the Radio Frequency Channel Number. If {{true}} multiple values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFLConfig")
	public Boolean rfcNFLConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the pilot PN offset. If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotPNConfig")
	public Boolean pilotPNConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerConfig")
	public Boolean maxFAPTxPowerConfig;
	/**
	 * Indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Beacon Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPBeaconTxPowerConfig")
	public Boolean maxFAPBeaconTxPowerConfig;

	public SelfConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the Radio Frequency Channel Number. If {{true}} multiple values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRfcNFLConfig() {
		return rfcNFLConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Radio Frequency Channel Number. If {{true}} multiple values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}}.
	 *
	 * @since 2.0
	 * @param rfcNFLConfig the input value
	 */
	public void  setRfcNFLConfig(Boolean rfcNFLConfig) {
		this.rfcNFLConfig = rfcNFLConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Radio Frequency Channel Number. If {{true}} multiple values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.RFCNFL}}.
	 *
	 * @since 2.0
	 * @param rfcNFLConfig the input value
	 * @return this instance
	 */
	public SelfConfig withRfcNFLConfig(Boolean rfcNFLConfig) {
		this.rfcNFLConfig = rfcNFLConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the pilot PN offset. If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPilotPNConfig() {
		return pilotPNConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the pilot PN offset. If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}}.
	 *
	 * @since 2.0
	 * @param pilotPNConfig the input value
	 */
	public void  setPilotPNConfig(Boolean pilotPNConfig) {
		this.pilotPNConfig = pilotPNConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the pilot PN offset. If {{true}} multiple values or a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.PilotPN}}.
	 *
	 * @since 2.0
	 * @param pilotPNConfig the input value
	 * @return this instance
	 */
	public SelfConfig withPilotPNConfig(Boolean pilotPNConfig) {
		this.pilotPNConfig = pilotPNConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxFAPTxPowerConfig() {
		return maxFAPTxPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}}.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerConfig the input value
	 */
	public void  setMaxFAPTxPowerConfig(Boolean maxFAPTxPowerConfig) {
		this.maxFAPTxPowerConfig = maxFAPTxPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.HRPD.RAN.RF.MaxFAPTxPower}}.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerConfig the input value
	 * @return this instance
	 */
	public SelfConfig withMaxFAPTxPowerConfig(Boolean maxFAPTxPowerConfig) {
		this.maxFAPTxPowerConfig = maxFAPTxPowerConfig;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Beacon Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxFAPBeaconTxPowerConfig() {
		return maxFAPBeaconTxPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Beacon Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPowerConfig the input value
	 */
	public void  setMaxFAPBeaconTxPowerConfig(Boolean maxFAPBeaconTxPowerConfig) {
		this.maxFAPBeaconTxPowerConfig = maxFAPBeaconTxPowerConfig;
	}

	/**
	 * Set the indicates whether the FAP supports the self-configuration capability to determine the Maximum FAP Beacon Transmit Power. If {{true}} a range of values MAY be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}} for the FAP to select from. If {{false}} only a single value SHOULD be provided in {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPowerConfig the input value
	 * @return this instance
	 */
	public SelfConfig withMaxFAPBeaconTxPowerConfig(Boolean maxFAPBeaconTxPowerConfig) {
		this.maxFAPBeaconTxPowerConfig = maxFAPBeaconTxPowerConfig;
		return this;
	}

	//</editor-fold>

}