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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.onex;

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
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.OneX.SelfConfig.")
@XmlRootElement(name = "FAPService.FAPControl.CDMA2000.OneX.SelfConfig")
@XmlType(name = "FAPService.FAPControl.CDMA2000.OneX.SelfConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class SelfConfig {

	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.RFCNFL}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFLSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean rfcNFLSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.PilotPN}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotPNSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean pilotPNSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.MaxFAPTxPower}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean maxFAPTxPowerSelfConfigEnable;
	/**
	 * Indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPBeaconTxPowerSelfConfigEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean maxFAPBeaconTxPowerSelfConfigEnable;

	public SelfConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.RFCNFL}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isRfcNFLSelfConfigEnable() {
		return rfcNFLSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.RFCNFL}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param rfcNFLSelfConfigEnable the input value
	 */
	public void  setRfcNFLSelfConfigEnable(Boolean rfcNFLSelfConfigEnable) {
		this.rfcNFLSelfConfigEnable = rfcNFLSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the values of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.RFCNFL}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param rfcNFLSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withRfcNFLSelfConfigEnable(Boolean rfcNFLSelfConfigEnable) {
		this.rfcNFLSelfConfigEnable = rfcNFLSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.PilotPN}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isPilotPNSelfConfigEnable() {
		return pilotPNSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.PilotPN}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param pilotPNSelfConfigEnable the input value
	 */
	public void  setPilotPNSelfConfigEnable(Boolean pilotPNSelfConfigEnable) {
		this.pilotPNSelfConfigEnable = pilotPNSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.PilotPN}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param pilotPNSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withPilotPNSelfConfigEnable(Boolean pilotPNSelfConfigEnable) {
		this.pilotPNSelfConfigEnable = pilotPNSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.MaxFAPTxPower}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxFAPTxPowerSelfConfigEnable() {
		return maxFAPTxPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.MaxFAPTxPower}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerSelfConfigEnable the input value
	 */
	public void  setMaxFAPTxPowerSelfConfigEnable(Boolean maxFAPTxPowerSelfConfigEnable) {
		this.maxFAPTxPowerSelfConfigEnable = maxFAPTxPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.OneX.RAN.RF.MaxFAPTxPower}}. If {{true}} the FAP self-configures the value. If {{false}} the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withMaxFAPTxPowerSelfConfigEnable(Boolean maxFAPTxPowerSelfConfigEnable) {
		this.maxFAPTxPowerSelfConfigEnable = maxFAPTxPowerSelfConfigEnable;
		return this;
	}

	/**
	 * Get the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMaxFAPBeaconTxPowerSelfConfigEnable() {
		return maxFAPBeaconTxPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPowerSelfConfigEnable the input value
	 */
	public void  setMaxFAPBeaconTxPowerSelfConfigEnable(Boolean maxFAPBeaconTxPowerSelfConfigEnable) {
		this.maxFAPBeaconTxPowerSelfConfigEnable = maxFAPBeaconTxPowerSelfConfigEnable;
	}

	/**
	 * Set the indicates whether the self-configuration capability in the FAP is used or not to determine the value of {{param|.CellConfig.CDMA2000.Beacon.MaxFAPBeaconTxPower}}. If {{true}}, the FAP self-configures the value. If {{false}}, the ACS must provide the specific value to be used.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPowerSelfConfigEnable the input value
	 * @return this instance
	 */
	public SelfConfig withMaxFAPBeaconTxPowerSelfConfigEnable(Boolean maxFAPBeaconTxPowerSelfConfigEnable) {
		this.maxFAPBeaconTxPowerSelfConfigEnable = maxFAPBeaconTxPowerSelfConfigEnable;
		return this;
	}

	//</editor-fold>

}