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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.beacon.BeaconList;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.beacon.HRPDBeaconList;

	/**
	 * This object models the attributes to control the generalized beacon. The beacon is modeled as a beacon frame composed of multiple beacon intervals. The beacon frame start is time-aligned to the instant when 1x 80ms paging frames and HRPD control channel frames align (occurs once every 1.28s).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.Beacon.")
public class Beacon {

	/**
	 * Allows administrative control of beacon.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconAdminStatus")
	@CWMPParameter(access = "readWrite")
	public String beaconAdminStatus;
	/**
	 * Reports operational status of beacon.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconOperStatus")
	public String beaconOperStatus;
	/**
	 * If set to {{true}} the HRPD-specific beacon described by {{object|HRPDBeaconList}} object is enabled. If set to {{false}}, all HRPD beacons (if any) are contained in the BeaconList object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDBeaconEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean hrpDBeaconEnable;
	/**
	 * Length and periodicity of the beacon frame in 80 ms slots. Reference - {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Period")
	@CWMPParameter(access = "readWrite", units = "80 ms slots")
	@Size(min = 0, max = 32767)
	public Long period;
	/**
	 * Maximum transmission power allowed on the FAP Beacon frequencies. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum beacon transmit power.

Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPBeaconTxPower")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	@Size(max = 64)
	public String maxFAPBeaconTxPower;
	/**
	 * Maximum beacon transmission power measured in 0.1 dBm currently used by the FAP on any beacon frequency.  Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPBeaconTxPowerInUse")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1 dBm")
	@Size(min = -400, max = 200)
	public Integer maxFAPBeaconTxPowerInUse;
	/**
	 * Percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent).

For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconPchPwrPercentage")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "0.001 percent")
	@Size(min = 1000, max = 1000000)
	public Integer beaconPchPwrPercentage;
	/**
	 * Maximum transmission power allowed on the dedicated HRPD beacon. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

MaxHRPDBeaconTxPower identifies the limits between which the FAP can self-configure its maximum beacon transmit power. Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low> and <Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHRPDBeaconTxPower")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	@Size(max = 64)
	public String maxHRPDBeaconTxPower;
	/**
	 * Maximum beacon transmission power measured in dBm currently used by the FAP on any beacon frequency.

Actual values of the maximum transmission power are -40.0 dBm to 20.0  in units of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHRPDBeaconTxPowerInUse")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1 dBm")
	@Size(min = -400, max = 200)
	public Integer maxHRPDBeaconTxPowerInUse;
	/**
	 * Percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent).  For example, 19950  means 19.950% of total.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconPilotPwrPercentage")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "0.001 percent")
	@Size(min = 1000, max = 1000000)
	public Integer beaconPilotPwrPercentage;
	/**
	 * Percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent).  For example, 23458 means 23.458% of the max sector power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BeaconSyncPwrPercentage")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "0.001 percent")
	@Size(min = 1000, max = 1000000)
	public Integer beaconSyncPwrPercentage;
	/**
	 * Maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.BeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBeaconListEntries")
	public Long maxBeaconListEntries;
	/**
	 * Maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHRPDBeaconListEntries")
	public Long maxHRPDBeaconListEntries;
	/**
	 * This object models an individual beacon intervals. It may be used to model both 1x and HRPD beacons with offset from start of beacon frame measured in 80ms slots.
	 */
	@XmlElementWrapper(name = "BeaconLists")
	@XmlElement(name = "BeaconList")
	@CWMPParameter(access = "readWrite")
	public Collection<BeaconList> beaconLists;
	/**
	 * This object models individual HRPD beacon intervals where the beacon start is expressed as a number of HRPD control channel slots from the start of the beacon frame.
	 */
	@XmlElementWrapper(name = "HRPDBeaconLists")
	@XmlElement(name = "HRPDBeaconList")
	@CWMPParameter(access = "readWrite")
	public Collection<HRPDBeaconList> hrpDBeaconLists;

	public Beacon() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get allows administrative control of beacon.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBeaconAdminStatus() {
		return beaconAdminStatus;
	}

	/**
	 * Set allows administrative control of beacon.
	 *
	 * @since 2.0
	 * @param beaconAdminStatus the input value
	 */
	public void  setBeaconAdminStatus(String beaconAdminStatus) {
		this.beaconAdminStatus = beaconAdminStatus;
	}

	/**
	 * Set allows administrative control of beacon.
	 *
	 * @since 2.0
	 * @param beaconAdminStatus the input value
	 * @return this instance
	 */
	public Beacon withBeaconAdminStatus(String beaconAdminStatus) {
		this.beaconAdminStatus = beaconAdminStatus;
		return this;
	}

	/**
	 * Get the reports operational status of beacon.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBeaconOperStatus() {
		return beaconOperStatus;
	}

	/**
	 * Set the reports operational status of beacon.
	 *
	 * @since 2.0
	 * @param beaconOperStatus the input value
	 */
	public void  setBeaconOperStatus(String beaconOperStatus) {
		this.beaconOperStatus = beaconOperStatus;
	}

	/**
	 * Set the reports operational status of beacon.
	 *
	 * @since 2.0
	 * @param beaconOperStatus the input value
	 * @return this instance
	 */
	public Beacon withBeaconOperStatus(String beaconOperStatus) {
		this.beaconOperStatus = beaconOperStatus;
		return this;
	}

	/**
	 * Get the if set to {{true}} the HRPD-specific beacon described by {{object|HRPDBeaconList}} object is enabled. If set to {{false}}, all HRPD beacons (if any) are contained in the BeaconList object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHrpDBeaconEnable() {
		return hrpDBeaconEnable;
	}

	/**
	 * Set the if set to {{true}} the HRPD-specific beacon described by {{object|HRPDBeaconList}} object is enabled. If set to {{false}}, all HRPD beacons (if any) are contained in the BeaconList object.
	 *
	 * @since 2.0
	 * @param hrpDBeaconEnable the input value
	 */
	public void  setHrpDBeaconEnable(Boolean hrpDBeaconEnable) {
		this.hrpDBeaconEnable = hrpDBeaconEnable;
	}

	/**
	 * Set the if set to {{true}} the HRPD-specific beacon described by {{object|HRPDBeaconList}} object is enabled. If set to {{false}}, all HRPD beacons (if any) are contained in the BeaconList object.
	 *
	 * @since 2.0
	 * @param hrpDBeaconEnable the input value
	 * @return this instance
	 */
	public Beacon withHrpDBeaconEnable(Boolean hrpDBeaconEnable) {
		this.hrpDBeaconEnable = hrpDBeaconEnable;
		return this;
	}

	/**
	 * Get the length and periodicity of the beacon frame in 80 ms slots. Reference - {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPeriod() {
		return period;
	}

	/**
	 * Set the length and periodicity of the beacon frame in 80 ms slots. Reference - {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param period the input value
	 */
	public void  setPeriod(Long period) {
		this.period = period;
	}

	/**
	 * Set the length and periodicity of the beacon frame in 80 ms slots. Reference - {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param period the input value
	 * @return this instance
	 */
	public Beacon withPeriod(Long period) {
		this.period = period;
		return this;
	}

	/**
	 * Get the maximum transmission power allowed on the FAP Beacon frequencies. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum beacon transmit power.

Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMaxFAPBeaconTxPower() {
		return maxFAPBeaconTxPower;
	}

	/**
	 * Set the maximum transmission power allowed on the FAP Beacon frequencies. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum beacon transmit power.

Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPower the input value
	 */
	public void  setMaxFAPBeaconTxPower(String maxFAPBeaconTxPower) {
		this.maxFAPBeaconTxPower = maxFAPBeaconTxPower;
	}

	/**
	 * Set the maximum transmission power allowed on the FAP Beacon frequencies. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum beacon transmit power.

Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPower the input value
	 * @return this instance
	 */
	public Beacon withMaxFAPBeaconTxPower(String maxFAPBeaconTxPower) {
		this.maxFAPBeaconTxPower = maxFAPBeaconTxPower;
		return this;
	}

	/**
	 * Get the maximum beacon transmission power measured in 0.1 dBm currently used by the FAP on any beacon frequency.  Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxFAPBeaconTxPowerInUse() {
		return maxFAPBeaconTxPowerInUse;
	}

	/**
	 * Set the maximum beacon transmission power measured in 0.1 dBm currently used by the FAP on any beacon frequency.  Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPowerInUse the input value
	 */
	public void  setMaxFAPBeaconTxPowerInUse(Integer maxFAPBeaconTxPowerInUse) {
		this.maxFAPBeaconTxPowerInUse = maxFAPBeaconTxPowerInUse;
	}

	/**
	 * Set the maximum beacon transmission power measured in 0.1 dBm currently used by the FAP on any beacon frequency.  Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 * @param maxFAPBeaconTxPowerInUse the input value
	 * @return this instance
	 */
	public Beacon withMaxFAPBeaconTxPowerInUse(Integer maxFAPBeaconTxPowerInUse) {
		this.maxFAPBeaconTxPowerInUse = maxFAPBeaconTxPowerInUse;
		return this;
	}

	/**
	 * Get the percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent).

For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBeaconPchPwrPercentage() {
		return beaconPchPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent).

For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 * @param beaconPchPwrPercentage the input value
	 */
	public void  setBeaconPchPwrPercentage(Integer beaconPchPwrPercentage) {
		this.beaconPchPwrPercentage = beaconPchPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent).

For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 * @param beaconPchPwrPercentage the input value
	 * @return this instance
	 */
	public Beacon withBeaconPchPwrPercentage(Integer beaconPchPwrPercentage) {
		this.beaconPchPwrPercentage = beaconPchPwrPercentage;
		return this;
	}

	/**
	 * Get the maximum transmission power allowed on the dedicated HRPD beacon. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

MaxHRPDBeaconTxPower identifies the limits between which the FAP can self-configure its maximum beacon transmit power. Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low> and <Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMaxHRPDBeaconTxPower() {
		return maxHRPDBeaconTxPower;
	}

	/**
	 * Set the maximum transmission power allowed on the dedicated HRPD beacon. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

MaxHRPDBeaconTxPower identifies the limits between which the FAP can self-configure its maximum beacon transmit power. Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low> and <Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param maxHRPDBeaconTxPower the input value
	 */
	public void  setMaxHRPDBeaconTxPower(String maxHRPDBeaconTxPower) {
		this.maxHRPDBeaconTxPower = maxHRPDBeaconTxPower;
	}

	/**
	 * Set the maximum transmission power allowed on the dedicated HRPD beacon. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

MaxHRPDBeaconTxPower identifies the limits between which the FAP can self-configure its maximum beacon transmit power. Self-configuration for maximum beacon transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPBeaconTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low> and <Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param maxHRPDBeaconTxPower the input value
	 * @return this instance
	 */
	public Beacon withMaxHRPDBeaconTxPower(String maxHRPDBeaconTxPower) {
		this.maxHRPDBeaconTxPower = maxHRPDBeaconTxPower;
		return this;
	}

	/**
	 * Get the maximum beacon transmission power measured in dBm currently used by the FAP on any beacon frequency.

Actual values of the maximum transmission power are -40.0 dBm to 20.0  in units of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxHRPDBeaconTxPowerInUse() {
		return maxHRPDBeaconTxPowerInUse;
	}

	/**
	 * Set the maximum beacon transmission power measured in dBm currently used by the FAP on any beacon frequency.

Actual values of the maximum transmission power are -40.0 dBm to 20.0  in units of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 * @param maxHRPDBeaconTxPowerInUse the input value
	 */
	public void  setMaxHRPDBeaconTxPowerInUse(Integer maxHRPDBeaconTxPowerInUse) {
		this.maxHRPDBeaconTxPowerInUse = maxHRPDBeaconTxPowerInUse;
	}

	/**
	 * Set the maximum beacon transmission power measured in dBm currently used by the FAP on any beacon frequency.

Actual values of the maximum transmission power are -40.0 dBm to 20.0  in units of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.
	 *
	 * @since 2.0
	 * @param maxHRPDBeaconTxPowerInUse the input value
	 * @return this instance
	 */
	public Beacon withMaxHRPDBeaconTxPowerInUse(Integer maxHRPDBeaconTxPowerInUse) {
		this.maxHRPDBeaconTxPowerInUse = maxHRPDBeaconTxPowerInUse;
		return this;
	}

	/**
	 * Get the percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent).  For example, 19950  means 19.950% of total.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBeaconPilotPwrPercentage() {
		return beaconPilotPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent).  For example, 19950  means 19.950% of total.
	 *
	 * @since 2.0
	 * @param beaconPilotPwrPercentage the input value
	 */
	public void  setBeaconPilotPwrPercentage(Integer beaconPilotPwrPercentage) {
		this.beaconPilotPwrPercentage = beaconPilotPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent).  For example, 19950  means 19.950% of total.
	 *
	 * @since 2.0
	 * @param beaconPilotPwrPercentage the input value
	 * @return this instance
	 */
	public Beacon withBeaconPilotPwrPercentage(Integer beaconPilotPwrPercentage) {
		this.beaconPilotPwrPercentage = beaconPilotPwrPercentage;
		return this;
	}

	/**
	 * Get the percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent).  For example, 23458 means 23.458% of the max sector power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBeaconSyncPwrPercentage() {
		return beaconSyncPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent).  For example, 23458 means 23.458% of the max sector power.
	 *
	 * @since 2.0
	 * @param beaconSyncPwrPercentage the input value
	 */
	public void  setBeaconSyncPwrPercentage(Integer beaconSyncPwrPercentage) {
		this.beaconSyncPwrPercentage = beaconSyncPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent).  For example, 23458 means 23.458% of the max sector power.
	 *
	 * @since 2.0
	 * @param beaconSyncPwrPercentage the input value
	 * @return this instance
	 */
	public Beacon withBeaconSyncPwrPercentage(Integer beaconSyncPwrPercentage) {
		this.beaconSyncPwrPercentage = beaconSyncPwrPercentage;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.BeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBeaconListEntries() {
		return maxBeaconListEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.BeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 * @param maxBeaconListEntries the input value
	 */
	public void  setMaxBeaconListEntries(Long maxBeaconListEntries) {
		this.maxBeaconListEntries = maxBeaconListEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.BeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 * @param maxBeaconListEntries the input value
	 * @return this instance
	 */
	public Beacon withMaxBeaconListEntries(Long maxBeaconListEntries) {
		this.maxBeaconListEntries = maxBeaconListEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxHRPDBeaconListEntries() {
		return maxHRPDBeaconListEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 * @param maxHRPDBeaconListEntries the input value
	 */
	public void  setMaxHRPDBeaconListEntries(Long maxHRPDBeaconListEntries) {
		this.maxHRPDBeaconListEntries = maxHRPDBeaconListEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.Beacon.HRPDBeaconList.{i}.}} object.
	 *
	 * @since 2.0
	 * @param maxHRPDBeaconListEntries the input value
	 * @return this instance
	 */
	public Beacon withMaxHRPDBeaconListEntries(Long maxHRPDBeaconListEntries) {
		this.maxHRPDBeaconListEntries = maxHRPDBeaconListEntries;
		return this;
	}

	/**
	 * Get the this object models an individual beacon intervals. It may be used to model both 1x and HRPD beacons with offset from start of beacon frame measured in 80ms slots.
	 *
	 * @return the value
	 */
	public Collection<BeaconList> getBeaconLists() {
		if (this.beaconLists == null){ this.beaconLists=new ArrayList<>();}
		return beaconLists;
	}

	/**
	 * Set the this object models an individual beacon intervals. It may be used to model both 1x and HRPD beacons with offset from start of beacon frame measured in 80ms slots.
	 *
	 * @param beaconLists the input value
	 */
	public void  setBeaconLists(Collection<BeaconList> beaconLists) {
		this.beaconLists = beaconLists;
	}

	/**
	 * Set the this object models an individual beacon intervals. It may be used to model both 1x and HRPD beacons with offset from start of beacon frame measured in 80ms slots.
	 *
	 * @param beaconList the input value
	 * @return this instance
	 */
	public Beacon withBeaconList(BeaconList beaconList) {
		getBeaconLists().add(beaconList);
		return this;
	}

	/**
	 * Get the this object models individual HRPD beacon intervals where the beacon start is expressed as a number of HRPD control channel slots from the start of the beacon frame.
	 *
	 * @return the value
	 */
	public Collection<HRPDBeaconList> getHrpDBeaconLists() {
		if (this.hrpDBeaconLists == null){ this.hrpDBeaconLists=new ArrayList<>();}
		return hrpDBeaconLists;
	}

	/**
	 * Set the this object models individual HRPD beacon intervals where the beacon start is expressed as a number of HRPD control channel slots from the start of the beacon frame.
	 *
	 * @param hrpDBeaconLists the input value
	 */
	public void  setHrpDBeaconLists(Collection<HRPDBeaconList> hrpDBeaconLists) {
		this.hrpDBeaconLists = hrpDBeaconLists;
	}

	/**
	 * Set the this object models individual HRPD beacon intervals where the beacon start is expressed as a number of HRPD control channel slots from the start of the beacon frame.
	 *
	 * @param hrpDBeaconList the input value
	 * @return this instance
	 */
	public Beacon withHRPDBeaconList(HRPDBeaconList hrpDBeaconList) {
		getHrpDBeaconLists().add(hrpDBeaconList);
		return this;
	}

	//</editor-fold>

}