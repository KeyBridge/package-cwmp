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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to self-configuration of the MaxFAPTxPower of the FAP.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.NetworkListenModeConfig.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.NetworkListenModeConfig")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.NetworkListenModeConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class NetworkListenModeConfig {

	/**
	 * If self-configuration of RFCNFL is enabled, this value indicates the total received signal strength margin to be applied to the entries in RFCNFL when the FAP decides on the RFCNInUse in order to bias the selection of the most preferred frequency.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFLMargin")
	@CWMPParameter(access = "readWrite")
	public Long rfcNFLMargin;
	/**
	 * Defines the target value measured in dB for the range of the FAP's FL coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods) between the minimum and maximum values, i.e., "<FAPCoverageTarget_min>..<FAPCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

<FAPCoverageTarget_min> and <FAPCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPCoverageTarget")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String fapCoverageTarget;
	/**
	 * Defines the target value measured in dB for the range of the FAP's FL Beacon coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive beacon transmit power levels.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods)

between the minimum and maximum values, i.e., "<BeaconCoverageTarget_min>..<BeaconCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels for the beacon(s) in the presence of co-channel and adjacent channel interference."

<BeaconCoverageTarget_min> and <BeaconCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPBeaconCoverageTarget")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String fapBeaconCoverageTarget;
	/**
	 * The maximum strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and noise) desired for FAP users at the edge of the FAP coverage target in units of 0.1 dB. This value can be used by the FAP's self configuration algorithms to help prevent aggressive transmit power level settings .
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCoverageEdgePilotStrength")
	@CWMPParameter(access = "readWrite", units = "0.1 dB")
	@Size(min = -300, max = 0)
	public Integer maxCoverageEdgePilotStrength;
	/**
	 * The maximum amount in dB by which the strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and

noise) for alien users can be degraded in the presence of FAP interference at the edge of FAP coverage, in 0.1 dB units.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxAllowablePilotStrengthDegradation")
	@CWMPParameter(access = "readWrite", units = "0.1 dB")
	@Size(min = 0, max = 150)
	public Integer maxAllowablePilotStrengthDegradation;
	/**
	 * {{list}} Each item is a FL RFCN corresponding to a CDMA2000 carrier that is adjacent to the RFCNFLInUse to be protected from adjacent channel interference. If any of the items in the list are adjacent to the FAP's own FL channel, the FAP MUST take the PilotStrength and total received power spectral density (Io) measured on these channels into account as part of its maximum transmit power selfconfiguration.

The RFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators.

The list should take into account the ability of the FAP to self-configure its own FL RFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the RFCN selected by the FAP.

For example, if only adjacent operator protection is needed and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the RFCNs immediately above and below the range of channels owned by the FAP operator.

If an empty string then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFLToProtect")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> rfcNFLToProtect;
	/**
	 * Defines the maximum allowed coverage hole created on carriers listed in RFCNFLToProtect by the FAP transmission, measured in dB, in terms of RF propagation loss such that the {{param|MaxAllowablePilotStrengthDegradation}} is maintained outside the {{param}} for MS on that {{param|RFCNFLToProtect}}. This value can be used by the FAP's self configuration algorithms to help derive transmit power levels.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPAllowedAdjChanCoverageHole")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 30, max = 150)
	public Long fapAllowedAdjChanCoverageHole;
	/**
	 * AdjacentChannelInterferenceRatio value in dB to be used when determining the coverage hole created on adjacent channels due to leakage.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACIR")
	@CWMPParameter(access = "readWrite", units = "dB")
	public Long aciR;

	public NetworkListenModeConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the if self-configuration of RFCNFL is enabled, this value indicates the total received signal strength margin to be applied to the entries in RFCNFL when the FAP decides on the RFCNInUse in order to bias the selection of the most preferred frequency.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRfcNFLMargin() {
		return rfcNFLMargin;
	}

	/**
	 * Set the if self-configuration of RFCNFL is enabled, this value indicates the total received signal strength margin to be applied to the entries in RFCNFL when the FAP decides on the RFCNInUse in order to bias the selection of the most preferred frequency.
	 *
	 * @since 2.0
	 * @param rfcNFLMargin the input value
	 */
	public void  setRfcNFLMargin(Long rfcNFLMargin) {
		this.rfcNFLMargin = rfcNFLMargin;
	}

	/**
	 * Set the if self-configuration of RFCNFL is enabled, this value indicates the total received signal strength margin to be applied to the entries in RFCNFL when the FAP decides on the RFCNInUse in order to bias the selection of the most preferred frequency.
	 *
	 * @since 2.0
	 * @param rfcNFLMargin the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withRfcNFLMargin(Long rfcNFLMargin) {
		this.rfcNFLMargin = rfcNFLMargin;
		return this;
	}

	/**
	 * Get the defines the target value measured in dB for the range of the FAP's FL coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods) between the minimum and maximum values, i.e., "<FAPCoverageTarget_min>..<FAPCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

<FAPCoverageTarget_min> and <FAPCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFapCoverageTarget() {
		return fapCoverageTarget;
	}

	/**
	 * Set the defines the target value measured in dB for the range of the FAP's FL coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods) between the minimum and maximum values, i.e., "<FAPCoverageTarget_min>..<FAPCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

<FAPCoverageTarget_min> and <FAPCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 * @param fapCoverageTarget the input value
	 */
	public void  setFapCoverageTarget(String fapCoverageTarget) {
		this.fapCoverageTarget = fapCoverageTarget;
	}

	/**
	 * Set the defines the target value measured in dB for the range of the FAP's FL coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods) between the minimum and maximum values, i.e., "<FAPCoverageTarget_min>..<FAPCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

<FAPCoverageTarget_min> and <FAPCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 * @param fapCoverageTarget the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withFapCoverageTarget(String fapCoverageTarget) {
		this.fapCoverageTarget = fapCoverageTarget;
		return this;
	}

	/**
	 * Get the defines the target value measured in dB for the range of the FAP's FL Beacon coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive beacon transmit power levels.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods)

between the minimum and maximum values, i.e., "<BeaconCoverageTarget_min>..<BeaconCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels for the beacon(s) in the presence of co-channel and adjacent channel interference."

<BeaconCoverageTarget_min> and <BeaconCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFapBeaconCoverageTarget() {
		return fapBeaconCoverageTarget;
	}

	/**
	 * Set the defines the target value measured in dB for the range of the FAP's FL Beacon coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive beacon transmit power levels.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods)

between the minimum and maximum values, i.e., "<BeaconCoverageTarget_min>..<BeaconCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels for the beacon(s) in the presence of co-channel and adjacent channel interference."

<BeaconCoverageTarget_min> and <BeaconCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 * @param fapBeaconCoverageTarget the input value
	 */
	public void  setFapBeaconCoverageTarget(String fapBeaconCoverageTarget) {
		this.fapBeaconCoverageTarget = fapBeaconCoverageTarget;
	}

	/**
	 * Set the defines the target value measured in dB for the range of the FAP's FL Beacon coverage, in terms of RF propagation loss. This value can be used by the FAP's selfconfiguration algorithms to help derive beacon transmit power levels.

{{param}} is expressed as a range of the minimum coverage path loss and the maximum coverage path loss with ".." (two periods)

between the minimum and maximum values, i.e., "<BeaconCoverageTarget_min>..<BeaconCoverageTarget_max>". These values can be used by the FAP's selfconfiguration algorithms to help derive transmit power levels for the beacon(s) in the presence of co-channel and adjacent channel interference."

<BeaconCoverageTarget_min> and <BeaconCoverageTarget_max> are measured in dB and have a range of [50,150] incremented by 1 dB.
	 *
	 * @since 2.0
	 * @param fapBeaconCoverageTarget the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withFapBeaconCoverageTarget(String fapBeaconCoverageTarget) {
		this.fapBeaconCoverageTarget = fapBeaconCoverageTarget;
		return this;
	}

	/**
	 * Get the maximum strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and noise) desired for FAP users at the edge of the FAP coverage target in units of 0.1 dB. This value can be used by the FAP's self configuration algorithms to help prevent aggressive transmit power level settings .
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxCoverageEdgePilotStrength() {
		return maxCoverageEdgePilotStrength;
	}

	/**
	 * Set the maximum strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and noise) desired for FAP users at the edge of the FAP coverage target in units of 0.1 dB. This value can be used by the FAP's self configuration algorithms to help prevent aggressive transmit power level settings .
	 *
	 * @since 2.0
	 * @param maxCoverageEdgePilotStrength the input value
	 */
	public void  setMaxCoverageEdgePilotStrength(Integer maxCoverageEdgePilotStrength) {
		this.maxCoverageEdgePilotStrength = maxCoverageEdgePilotStrength;
	}

	/**
	 * Set the maximum strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and noise) desired for FAP users at the edge of the FAP coverage target in units of 0.1 dB. This value can be used by the FAP's self configuration algorithms to help prevent aggressive transmit power level settings .
	 *
	 * @since 2.0
	 * @param maxCoverageEdgePilotStrength the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withMaxCoverageEdgePilotStrength(Integer maxCoverageEdgePilotStrength) {
		this.maxCoverageEdgePilotStrength = maxCoverageEdgePilotStrength;
		return this;
	}

	/**
	 * Get the maximum amount in dB by which the strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and

noise) for alien users can be degraded in the presence of FAP interference at the edge of FAP coverage, in 0.1 dB units.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxAllowablePilotStrengthDegradation() {
		return maxAllowablePilotStrengthDegradation;
	}

	/**
	 * Set the maximum amount in dB by which the strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and

noise) for alien users can be degraded in the presence of FAP interference at the edge of FAP coverage, in 0.1 dB units.
	 *
	 * @since 2.0
	 * @param maxAllowablePilotStrengthDegradation the input value
	 */
	public void  setMaxAllowablePilotStrengthDegradation(Integer maxAllowablePilotStrengthDegradation) {
		this.maxAllowablePilotStrengthDegradation = maxAllowablePilotStrengthDegradation;
	}

	/**
	 * Set the maximum amount in dB by which the strength of the received pilot energy per chip, Ec, to total received spectral density, Io (signal and

noise) for alien users can be degraded in the presence of FAP interference at the edge of FAP coverage, in 0.1 dB units.
	 *
	 * @since 2.0
	 * @param maxAllowablePilotStrengthDegradation the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withMaxAllowablePilotStrengthDegradation(Integer maxAllowablePilotStrengthDegradation) {
		this.maxAllowablePilotStrengthDegradation = maxAllowablePilotStrengthDegradation;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a FL RFCN corresponding to a CDMA2000 carrier that is adjacent to the RFCNFLInUse to be protected from adjacent channel interference. If any of the items in the list are adjacent to the FAP's own FL channel, the FAP MUST take the PilotStrength and total received power spectral density (Io) measured on these channels into account as part of its maximum transmit power selfconfiguration.

The RFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators.

The list should take into account the ability of the FAP to self-configure its own FL RFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the RFCN selected by the FAP.

For example, if only adjacent operator protection is needed and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the RFCNs immediately above and below the range of channels owned by the FAP operator.

If an empty string then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getRfcNFLToProtect() {
		if (this.rfcNFLToProtect == null){ this.rfcNFLToProtect=new ArrayList<>();}
		return rfcNFLToProtect;
	}

	/**
	 * Set the {{list}} Each item is a FL RFCN corresponding to a CDMA2000 carrier that is adjacent to the RFCNFLInUse to be protected from adjacent channel interference. If any of the items in the list are adjacent to the FAP's own FL channel, the FAP MUST take the PilotStrength and total received power spectral density (Io) measured on these channels into account as part of its maximum transmit power selfconfiguration.

The RFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators.

The list should take into account the ability of the FAP to self-configure its own FL RFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the RFCN selected by the FAP.

For example, if only adjacent operator protection is needed and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the RFCNs immediately above and below the range of channels owned by the FAP operator.

If an empty string then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 * @param rfcNFLToProtect the input value
	 */
	public void  setRfcNFLToProtect(Collection<String> rfcNFLToProtect) {
		this.rfcNFLToProtect = rfcNFLToProtect;
	}

	/**
	 * Set the {{list}} Each item is a FL RFCN corresponding to a CDMA2000 carrier that is adjacent to the RFCNFLInUse to be protected from adjacent channel interference. If any of the items in the list are adjacent to the FAP's own FL channel, the FAP MUST take the PilotStrength and total received power spectral density (Io) measured on these channels into account as part of its maximum transmit power selfconfiguration.

The RFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators.

The list should take into account the ability of the FAP to self-configure its own FL RFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the RFCN selected by the FAP.

For example, if only adjacent operator protection is needed and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the RFCNs immediately above and below the range of channels owned by the FAP operator.

If an empty string then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withRfcNFLToProtect(String string) {
		getRfcNFLToProtect().add(string);
		return this;
	}

	/**
	 * Get the defines the maximum allowed coverage hole created on carriers listed in RFCNFLToProtect by the FAP transmission, measured in dB, in terms of RF propagation loss such that the {{param|MaxAllowablePilotStrengthDegradation}} is maintained outside the {{param}} for MS on that {{param|RFCNFLToProtect}}. This value can be used by the FAP's self configuration algorithms to help derive transmit power levels.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFapAllowedAdjChanCoverageHole() {
		return fapAllowedAdjChanCoverageHole;
	}

	/**
	 * Set the defines the maximum allowed coverage hole created on carriers listed in RFCNFLToProtect by the FAP transmission, measured in dB, in terms of RF propagation loss such that the {{param|MaxAllowablePilotStrengthDegradation}} is maintained outside the {{param}} for MS on that {{param|RFCNFLToProtect}}. This value can be used by the FAP's self configuration algorithms to help derive transmit power levels.
	 *
	 * @since 2.0
	 * @param fapAllowedAdjChanCoverageHole the input value
	 */
	public void  setFapAllowedAdjChanCoverageHole(Long fapAllowedAdjChanCoverageHole) {
		this.fapAllowedAdjChanCoverageHole = fapAllowedAdjChanCoverageHole;
	}

	/**
	 * Set the defines the maximum allowed coverage hole created on carriers listed in RFCNFLToProtect by the FAP transmission, measured in dB, in terms of RF propagation loss such that the {{param|MaxAllowablePilotStrengthDegradation}} is maintained outside the {{param}} for MS on that {{param|RFCNFLToProtect}}. This value can be used by the FAP's self configuration algorithms to help derive transmit power levels.
	 *
	 * @since 2.0
	 * @param fapAllowedAdjChanCoverageHole the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withFapAllowedAdjChanCoverageHole(Long fapAllowedAdjChanCoverageHole) {
		this.fapAllowedAdjChanCoverageHole = fapAllowedAdjChanCoverageHole;
		return this;
	}

	/**
	 * Get adjacentChannelInterferenceRatio value in dB to be used when determining the coverage hole created on adjacent channels due to leakage.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAciR() {
		return aciR;
	}

	/**
	 * Set adjacentChannelInterferenceRatio value in dB to be used when determining the coverage hole created on adjacent channels due to leakage.
	 *
	 * @since 2.0
	 * @param aciR the input value
	 */
	public void  setAciR(Long aciR) {
		this.aciR = aciR;
	}

	/**
	 * Set adjacentChannelInterferenceRatio value in dB to be used when determining the coverage hole created on adjacent channels due to leakage.
	 *
	 * @since 2.0
	 * @param aciR the input value
	 * @return this instance
	 */
	public NetworkListenModeConfig withAciR(Long aciR) {
		this.aciR = aciR;
		return this;
	}

	//</editor-fold>

}