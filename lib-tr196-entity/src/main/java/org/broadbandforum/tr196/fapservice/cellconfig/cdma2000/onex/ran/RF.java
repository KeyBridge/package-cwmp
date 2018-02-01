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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to RF configuration of the FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.RF.")
public class RF {

	/**
	 * {{list}} Each item is a pair of 2-digit Band class number (as defined in {{bibref|3GPP2-C.S0057}}) followed by 4-digit FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCN is controlled by {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}}. If the FAP's self-configuration capability for RFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for RFCNFLInUse.

If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item.

An example value is "010001, 030500". If multiple items are specified, they are done in the order of preference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFL")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> rfcNFL;
	/**
	 * The FL Band being used by the FAP. Self-configuration for Band and RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first band class value in RFCNFL.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFLBandInUse")
	@Size(max = 16)
	public String rfcNFLBandInUse;
	/**
	 * The FL RFCN being used by the FAP. Self-configuration for RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first RFCN value in RFCNFL.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFLInUse")
	public Long rfcNFLInUse;
	/**
	 * {{list}} Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for PilotPNInUse. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offset values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The order of the items has no significance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotPN")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> pilotPN;
	/**
	 * The Pilot PN Offset being used by the FAP in 64 PN chips. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in PilotPN.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in PilotPN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotPNInUse")
	@Size(min = 0, max = 511)
	public Long pilotPNInUse;
	/**
	 * Defines the maximum transmission power allowed on the FAP. MaxFAPTxPower is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<Pmax_low>;..<Pmax_high>;".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low>; and <Pmax_high>; are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPower")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String maxFAPTxPower;
	/**
	 * The maximum transmission power measured in 0.1 dBm currently used by the FAP.

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the

actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerInUse")
	@Size(min = -400, max = 200)
	public Integer maxFAPTxPowerInUse;
	/**
	 * Percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent). For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PchPwrPercentage")
	@CWMPParameter(access = "readWrite", units = "0.001 percent")
	@Size(min = 1000, max = 1000000)
	public Long pchPwrPercentage;
	/**
	 * Percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent). For example, 19950 means 19.95% of total.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotPwrPercentage")
	@CWMPParameter(access = "readWrite", units = "0.001 percent")
	@Size(min = 1000, max = 1000000)
	public Long pilotPwrPercentage;
	/**
	 * Percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent). For example, 23458 means 23.4% of the max sector power.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SyncPwrPercentage")
	@CWMPParameter(access = "readWrite", units = "0.001 percent")
	@Size(min = 1000, max = 1000000)
	public Long syncPwrPercentage;

	public RF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a pair of 2-digit Band class number (as defined in {{bibref|3GPP2-C.S0057}}) followed by 4-digit FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCN is controlled by {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}}. If the FAP's self-configuration capability for RFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for RFCNFLInUse.

If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item.

An example value is "010001, 030500". If multiple items are specified, they are done in the order of preference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getRfcNFL() {
		if (this.rfcNFL == null){ this.rfcNFL=new ArrayList<>();}
		return rfcNFL;
	}

	/**
	 * Set the {{list}} Each item is a pair of 2-digit Band class number (as defined in {{bibref|3GPP2-C.S0057}}) followed by 4-digit FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCN is controlled by {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}}. If the FAP's self-configuration capability for RFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for RFCNFLInUse.

If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item.

An example value is "010001, 030500". If multiple items are specified, they are done in the order of preference.
	 *
	 * @since 2.0
	 * @param rfcNFL the input value
	 */
	public void  setRfcNFL(Collection<String> rfcNFL) {
		this.rfcNFL = rfcNFL;
	}

	/**
	 * Set the {{list}} Each item is a pair of 2-digit Band class number (as defined in {{bibref|3GPP2-C.S0057}}) followed by 4-digit FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCN is controlled by {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}}. If the FAP's self-configuration capability for RFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for RFCNFLInUse.

If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item.

An example value is "010001, 030500". If multiple items are specified, they are done in the order of preference.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withRfcNFL(String string) {
		getRfcNFL().add(string);
		return this;
	}

	/**
	 * Get the FL Band being used by the FAP. Self-configuration for Band and RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first band class value in RFCNFL.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getRfcNFLBandInUse() {
		return rfcNFLBandInUse;
	}

	/**
	 * Set the FL Band being used by the FAP. Self-configuration for Band and RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first band class value in RFCNFL.
	 *
	 * @since 2.0
	 * @param rfcNFLBandInUse the input value
	 */
	public void  setRfcNFLBandInUse(String rfcNFLBandInUse) {
		this.rfcNFLBandInUse = rfcNFLBandInUse;
	}

	/**
	 * Set the FL Band being used by the FAP. Self-configuration for Band and RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first band class value in RFCNFL.
	 *
	 * @since 2.0
	 * @param rfcNFLBandInUse the input value
	 * @return this instance
	 */
	public RF withRfcNFLBandInUse(String rfcNFLBandInUse) {
		this.rfcNFLBandInUse = rfcNFLBandInUse;
		return this;
	}

	/**
	 * Get the FL RFCN being used by the FAP. Self-configuration for RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first RFCN value in RFCNFL.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRfcNFLInUse() {
		return rfcNFLInUse;
	}

	/**
	 * Set the FL RFCN being used by the FAP. Self-configuration for RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first RFCN value in RFCNFL.
	 *
	 * @since 2.0
	 * @param rfcNFLInUse the input value
	 */
	public void  setRfcNFLInUse(Long rfcNFLInUse) {
		this.rfcNFLInUse = rfcNFLInUse;
	}

	/**
	 * Set the FL RFCN being used by the FAP. Self-configuration for RFCN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in RFCNFL. If the self-configuration capability is not available or not enabled, then this parameter contains the first RFCN value in RFCNFL.
	 *
	 * @since 2.0
	 * @param rfcNFLInUse the input value
	 * @return this instance
	 */
	public RF withRfcNFLInUse(Long rfcNFLInUse) {
		this.rfcNFLInUse = rfcNFLInUse;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for PilotPNInUse. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offset values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The order of the items has no significance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPilotPN() {
		if (this.pilotPN == null){ this.pilotPN=new ArrayList<>();}
		return pilotPN;
	}

	/**
	 * Set the {{list}} Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for PilotPNInUse. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offset values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The order of the items has no significance.
	 *
	 * @since 2.0
	 * @param pilotPN the input value
	 */
	public void  setPilotPN(Collection<String> pilotPN) {
		this.pilotPN = pilotPN;
	}

	/**
	 * Set the {{list}} Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for PilotPNInUse. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offset values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The order of the items has no significance.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withPilotPN(String string) {
		getPilotPN().add(string);
		return this;
	}

	/**
	 * Get the Pilot PN Offset being used by the FAP in 64 PN chips. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in PilotPN.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in PilotPN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPilotPNInUse() {
		return pilotPNInUse;
	}

	/**
	 * Set the Pilot PN Offset being used by the FAP in 64 PN chips. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in PilotPN.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in PilotPN.
	 *
	 * @since 2.0
	 * @param pilotPNInUse the input value
	 */
	public void  setPilotPNInUse(Long pilotPNInUse) {
		this.pilotPNInUse = pilotPNInUse;
	}

	/**
	 * Set the Pilot PN Offset being used by the FAP in 64 PN chips. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in PilotPN.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in PilotPN.
	 *
	 * @since 2.0
	 * @param pilotPNInUse the input value
	 * @return this instance
	 */
	public RF withPilotPNInUse(Long pilotPNInUse) {
		this.pilotPNInUse = pilotPNInUse;
		return this;
	}

	/**
	 * Get the defines the maximum transmission power allowed on the FAP. MaxFAPTxPower is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<Pmax_low>;..<Pmax_high>;".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low>; and <Pmax_high>; are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMaxFAPTxPower() {
		return maxFAPTxPower;
	}

	/**
	 * Set the defines the maximum transmission power allowed on the FAP. MaxFAPTxPower is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<Pmax_low>;..<Pmax_high>;".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low>; and <Pmax_high>; are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param maxFAPTxPower the input value
	 */
	public void  setMaxFAPTxPower(String maxFAPTxPower) {
		this.maxFAPTxPower = maxFAPTxPower;
	}

	/**
	 * Set the defines the maximum transmission power allowed on the FAP. MaxFAPTxPower is expressed as a range of allowed maximum power levels with ".." (two periods)

between the upper and lower values, i.e. "<Pmax_low>;..<Pmax_high>;".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <Pmax_low>; and <Pmax_high>; are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param maxFAPTxPower the input value
	 * @return this instance
	 */
	public RF withMaxFAPTxPower(String maxFAPTxPower) {
		this.maxFAPTxPower = maxFAPTxPower;
		return this;
	}

	/**
	 * Get the maximum transmission power measured in 0.1 dBm currently used by the FAP.

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the

actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxFAPTxPowerInUse() {
		return maxFAPTxPowerInUse;
	}

	/**
	 * Set the maximum transmission power measured in 0.1 dBm currently used by the FAP.

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the

actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerInUse the input value
	 */
	public void  setMaxFAPTxPowerInUse(Integer maxFAPTxPowerInUse) {
		this.maxFAPTxPowerInUse = maxFAPTxPowerInUse;
	}

	/**
	 * Set the maximum transmission power measured in 0.1 dBm currently used by the FAP.

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the

actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.OneX.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerInUse the input value
	 * @return this instance
	 */
	public RF withMaxFAPTxPowerInUse(Integer maxFAPTxPowerInUse) {
		this.maxFAPTxPowerInUse = maxFAPTxPowerInUse;
		return this;
	}

	/**
	 * Get the percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent). For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPchPwrPercentage() {
		return pchPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent). For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 * @param pchPwrPercentage the input value
	 */
	public void  setPchPwrPercentage(Long pchPwrPercentage) {
		this.pchPwrPercentage = pchPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Paging Channel (expressed in 0.001 percent). For example, 93333 means 93.333% of the max sector power.
	 *
	 * @since 2.0
	 * @param pchPwrPercentage the input value
	 * @return this instance
	 */
	public RF withPchPwrPercentage(Long pchPwrPercentage) {
		this.pchPwrPercentage = pchPwrPercentage;
		return this;
	}

	/**
	 * Get the percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent). For example, 19950 means 19.95% of total.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPilotPwrPercentage() {
		return pilotPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent). For example, 19950 means 19.95% of total.
	 *
	 * @since 2.0
	 * @param pilotPwrPercentage the input value
	 */
	public void  setPilotPwrPercentage(Long pilotPwrPercentage) {
		this.pilotPwrPercentage = pilotPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Pilot Channel (expressed in 0.001 percent). For example, 19950 means 19.95% of total.
	 *
	 * @since 2.0
	 * @param pilotPwrPercentage the input value
	 * @return this instance
	 */
	public RF withPilotPwrPercentage(Long pilotPwrPercentage) {
		this.pilotPwrPercentage = pilotPwrPercentage;
		return this;
	}

	/**
	 * Get the percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent). For example, 23458 means 23.4% of the max sector power.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSyncPwrPercentage() {
		return syncPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent). For example, 23458 means 23.4% of the max sector power.
	 *
	 * @since 2.0
	 * @param syncPwrPercentage the input value
	 */
	public void  setSyncPwrPercentage(Long syncPwrPercentage) {
		this.syncPwrPercentage = syncPwrPercentage;
	}

	/**
	 * Set the percentage of Max Sector Power Used By Sync Channel (expressed in 0.001 percent). For example, 23458 means 23.4% of the max sector power.
	 *
	 * @since 2.0
	 * @param syncPwrPercentage the input value
	 * @return this instance
	 */
	public RF withSyncPwrPercentage(Long syncPwrPercentage) {
		this.syncPwrPercentage = syncPwrPercentage;
		return this;
	}

	//</editor-fold>

}