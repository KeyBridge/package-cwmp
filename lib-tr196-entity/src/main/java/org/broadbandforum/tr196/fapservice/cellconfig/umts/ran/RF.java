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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the RF configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.RF.")
public class RF {

	/**
	 * {{list}} Each item is a DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell.

{{bibref|3GPP-TS.25.433|Section 9.2.1.65}}

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for UARFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|UARFCNDLInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The UARFCN values supplied to the list are derived based on the formula defined in {{bibref|3GPP-TS.25.104|Section 5.4.3}}

The order of the UARFCN entries has no significance.

The carrier spacing in FDD mode is fixed as defined in {{bibref|3GPP-TS.25.104}}. Therefore, the FAP can unambiguously derive the UL UARFCN value based on the selected DL UARFCN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNDL")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> uarFCNDL;
	/**
	 * The DL UARFCN being used by the FAP.

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|UARFCNDL}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|UARFCNDL}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNDLInUse")
	public Long uarFCNDLInUse;
	/**
	 * The UL UARFCN being used by the FAP.

The UL UARFCN that corresponds to {{param|UARFCNDLInUse}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNULInUse")
	public Long uarFCNULInUse;
	/**
	 * {{list}} Each item is a DL UARFCNs to be protected from adjacent channel interference.  "Adjacent channel" in this context means offset from the FAP's UARFCN by 5MHz. {{bibref|3GPP-TS.25.104|Section 6.4.6}}

If any of the items in the list are adjacent to the FAP's own DL channel, the FAP MUST take the Primary CPICH code power measured on these channels into account as part of its maximum transmit power self-configuration.

The UARFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators (only the latter is mandated by the {{bibref|3GPP-TS.25.104}} requirements).

The list SHOULD take into account the ability of the FAP to self-configure its own DL UARFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the UARFCN selected by the FAP.

For example, if only adjacent operator protection is required and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the UARFCNs immediately above and below the range of channels owned by the FAP operator. Adjacent channel protection can cause the FAP transmit power to be reduced down to as low as 8dBm.

If {{empty}} then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNDLToProtect")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> uarFCNDLToProtect;
	/**
	 * {{list}} Each item is a Primary DL Scrambling Code used by the FDD mode cell with a numeric range between 0 and 511 inclusive.

{{bibref|3GPP-TS.25.433|Section 9.2.2.34}}

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for {{param}} is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PrimaryScramblingCodeInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PSC values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The following are examples of valid PSC string:

:"20"

::(explicitly specifies a single PSC value)

:"20,30,40"

::(specifies 3 possible PSC values to select from)

"20..40"

::(specifies 21 possible values between 20 and 40, inclusive)

"20..40,50"

::(specifies 22 possible values between 20 and 40 inclusive and a single value 50)

The order of the items has no significance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrimaryScramblingCode")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> primaryScramblingCode;
	/**
	 * The PSC being used by the FAP.

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PrimaryScramblingCode}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PrimaryScramblingCodeInUse")
	public Long primaryScramblingCodeInUse;
	/**
	 * Defines the maximum transmission power allowed on the FAP, maximum value for the linear sum of the power of all downlink physical channels, that is allowed to be used in a cell.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -30.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerExpanded")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String maxFAPTxPowerExpanded;
	/**
	 * The maximum transmission power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -30.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPowerExpanded}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerInUseExpanded")
	@Size(min = -300, max = 200)
	public Integer maxFAPTxPowerInUseExpanded;
	/**
	 * Defines the maximum transmission power level a UE can use on PRACH.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -50 to 33 incremented by 1.

{{bibref|3GPP-TS.25.331|Section 10.3.6.39}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxULTxPower")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String maxULTxPower;
	/**
	 * The maximum transmission power level a UE can use on PRACH.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxULTxPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxULTxPowerInUse")
	@Size(min = -50, max = 33)
	public Integer maxULTxPowerInUse;
	/**
	 * The value of the transmission power of the Primary Common PIlot CHannel (P-CPICH). The P-CPICH physical channel carries the common pilots of the cell. Parameter in SIB5.

{{param}} is expressed as a range of allowed transmission power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -10.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHPower")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String pcpICHPower;
	/**
	 * The P-CPICH power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -10.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|PCPICHPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHPowerInUse")
	@Size(min = -100, max = 200)
	public Integer pcpICHPowerInUse;
	/**
	 * Defines the power offset between pilot channel and DPDCH.

Actual values of the offset are 0.0 dB to 6.0 dB in steps of 0.25 dB. The value of {{param}} divided by 4 yields the actual value of the offset.

{{bibref|3GPP-TS.25.331|Section 10.3.6.18}} {{bibref|3GPP-TS.25.214|Section 5.2.1}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerOffsetPilotDPDCH")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 24)
	public Long powerOffsetPilotDPDCH;
	/**
	 * Defines the target value measured in dB for the range of the FAP's DL coverage, in terms of RF propagation loss.

This value can be used by the FAP's self-configuration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{bibref|3GPP-TS.25.967|Section 7.2.1}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPCoverageTarget")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 50, max = 150)
	public Long fapCoverageTarget;
	/**
	 * Defines the target value measured in dB for the downlink signal quality of the FAP in terms of CPICH Ec/Io, thereby clarifying the meaning of "FAPCoverageTarget".

Actual values of the FAPQualityTargetEcIo are -20 dB to 0 dB in steps of 0.1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FAPQualityTargetEcIo")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -200, max = 0)
	public Integer fapQualityTargetEcIo;
	/**
	 * Defines the transmission power offset measured in dB of the Primary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PSCHPower")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -350, max = 150)
	public Integer pscHPower;
	/**
	 * Defines the transmission power offset measured in dB of the Secondary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSCHPower")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -350, max = 150)
	public Integer sscHPower;
	/**
	 * Defines the maximum transmission power offset measured in dB of the PICH channel relative to the Primary CPICH transmission power.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.2.1.49A}} {{bibref|3GPP-TS.25.331|Section 10.3.6.50}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PICHPower")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -10, max = 5)
	public Integer picHPower;
	/**
	 * Defines the transmission power offset measured in dB of the PCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.3.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCHPower")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -350, max = 150)
	public Integer pchPower;
	/**
	 * Defines the transmission power offset measured in dB of the FACH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.6.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FACHPower")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -350, max = 150)
	public Integer facHPower;
	/**
	 * Defines the transmission power offset measured in dB of the BCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 9.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BCHPower")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -350, max = 150)
	public Integer bchPower;
	/**
	 * Defines the transmission power offset measured in dB of one AICH relative to the Primary CPICH power. Parameter defined in SIB5 {{bibref|3GPP-TS.25.331|Section 10.3.6.3}}.

Transmission power level of AICH, AP-AICH and CD/CA-ICH channels compared to CPICH.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.2.2.D}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AICHPower")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -22, max = 5)
	public Integer aicHPower;
	/**
	 * The value defines 'N' multiples of M(TTI) for CBS DRX calculations at the UE side.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CTCHAllocationPeriod")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 255)
	public Long ctcHAllocationPeriod;
	/**
	 * Value of CBS frame offset (CTCH) on DL FACH.  Parameter in SIB5
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CBSFrameOffset")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long cbsFrameOffset;
	/**
	 * Defines the number of radio frames in the TTI of the FACH used for CTCH (MTTI).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxTTI")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 255)
	public Long maxTTI;
	/**
	 * Defines the lower value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not exceed the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}

The Noise Rise Limit range identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NoiseRiseLimitLowerValue")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 500)
	public Long noiseRiseLimitLowerValue;
	/**
	 * Defines the upper value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not be below the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}}

NoiseRiseLimit identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NoiseRiseLimitUpperValue")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 500)
	public Long noiseRiseLimitUpperValue;
	/**
	 * Actual value of the Noise Rise Limit that the FAP uses. The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NoiseRiseLimitInUse")
	@Size(min = 0, max = 500)
	public Long noiseRiseLimitInUse;

	public RF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell.

{{bibref|3GPP-TS.25.433|Section 9.2.1.65}}

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for UARFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|UARFCNDLInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The UARFCN values supplied to the list are derived based on the formula defined in {{bibref|3GPP-TS.25.104|Section 5.4.3}}

The order of the UARFCN entries has no significance.

The carrier spacing in FDD mode is fixed as defined in {{bibref|3GPP-TS.25.104}}. Therefore, the FAP can unambiguously derive the UL UARFCN value based on the selected DL UARFCN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getUarFCNDL() {
		if (this.uarFCNDL == null){ this.uarFCNDL=new ArrayList<>();}
		return uarFCNDL;
	}

	/**
	 * Set the {{list}} Each item is a DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell.

{{bibref|3GPP-TS.25.433|Section 9.2.1.65}}

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for UARFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|UARFCNDLInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The UARFCN values supplied to the list are derived based on the formula defined in {{bibref|3GPP-TS.25.104|Section 5.4.3}}

The order of the UARFCN entries has no significance.

The carrier spacing in FDD mode is fixed as defined in {{bibref|3GPP-TS.25.104}}. Therefore, the FAP can unambiguously derive the UL UARFCN value based on the selected DL UARFCN.
	 *
	 * @since 2.0
	 * @param uarFCNDL the input value
	 */
	public void  setUarFCNDL(Collection<String> uarFCNDL) {
		this.uarFCNDL = uarFCNDL;
	}

	/**
	 * Set the {{list}} Each item is a DL UTRA Absolute Radio Frequency Channel Number (UARFCN) in an FDD mode cell.

{{bibref|3GPP-TS.25.433|Section 9.2.1.65}}

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for UARFCN is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|UARFCNDLInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The UARFCN values supplied to the list are derived based on the formula defined in {{bibref|3GPP-TS.25.104|Section 5.4.3}}

The order of the UARFCN entries has no significance.

The carrier spacing in FDD mode is fixed as defined in {{bibref|3GPP-TS.25.104}}. Therefore, the FAP can unambiguously derive the UL UARFCN value based on the selected DL UARFCN.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withUarFCNDL(String string) {
		getUarFCNDL().add(string);
		return this;
	}

	/**
	 * Get the DL UARFCN being used by the FAP.

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|UARFCNDL}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|UARFCNDL}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUarFCNDLInUse() {
		return uarFCNDLInUse;
	}

	/**
	 * Set the DL UARFCN being used by the FAP.

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|UARFCNDL}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|UARFCNDL}}.
	 *
	 * @since 2.0
	 * @param uarFCNDLInUse the input value
	 */
	public void  setUarFCNDLInUse(Long uarFCNDLInUse) {
		this.uarFCNDLInUse = uarFCNDLInUse;
	}

	/**
	 * Set the DL UARFCN being used by the FAP.

Self-configuration for UARFCN is controlled by {{param|.Capabilities.UMTS.SelfConfig.UARFCNConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.UARFCNSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|UARFCNDL}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|UARFCNDL}}.
	 *
	 * @since 2.0
	 * @param uarFCNDLInUse the input value
	 * @return this instance
	 */
	public RF withUarFCNDLInUse(Long uarFCNDLInUse) {
		this.uarFCNDLInUse = uarFCNDLInUse;
		return this;
	}

	/**
	 * Get the UL UARFCN being used by the FAP.

The UL UARFCN that corresponds to {{param|UARFCNDLInUse}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUarFCNULInUse() {
		return uarFCNULInUse;
	}

	/**
	 * Set the UL UARFCN being used by the FAP.

The UL UARFCN that corresponds to {{param|UARFCNDLInUse}}.
	 *
	 * @since 2.0
	 * @param uarFCNULInUse the input value
	 */
	public void  setUarFCNULInUse(Long uarFCNULInUse) {
		this.uarFCNULInUse = uarFCNULInUse;
	}

	/**
	 * Set the UL UARFCN being used by the FAP.

The UL UARFCN that corresponds to {{param|UARFCNDLInUse}}.
	 *
	 * @since 2.0
	 * @param uarFCNULInUse the input value
	 * @return this instance
	 */
	public RF withUarFCNULInUse(Long uarFCNULInUse) {
		this.uarFCNULInUse = uarFCNULInUse;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a DL UARFCNs to be protected from adjacent channel interference.  "Adjacent channel" in this context means offset from the FAP's UARFCN by 5MHz. {{bibref|3GPP-TS.25.104|Section 6.4.6}}

If any of the items in the list are adjacent to the FAP's own DL channel, the FAP MUST take the Primary CPICH code power measured on these channels into account as part of its maximum transmit power self-configuration.

The UARFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators (only the latter is mandated by the {{bibref|3GPP-TS.25.104}} requirements).

The list SHOULD take into account the ability of the FAP to self-configure its own DL UARFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the UARFCN selected by the FAP.

For example, if only adjacent operator protection is required and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the UARFCNs immediately above and below the range of channels owned by the FAP operator. Adjacent channel protection can cause the FAP transmit power to be reduced down to as low as 8dBm.

If {{empty}} then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getUarFCNDLToProtect() {
		if (this.uarFCNDLToProtect == null){ this.uarFCNDLToProtect=new ArrayList<>();}
		return uarFCNDLToProtect;
	}

	/**
	 * Set the {{list}} Each item is a DL UARFCNs to be protected from adjacent channel interference.  "Adjacent channel" in this context means offset from the FAP's UARFCN by 5MHz. {{bibref|3GPP-TS.25.104|Section 6.4.6}}

If any of the items in the list are adjacent to the FAP's own DL channel, the FAP MUST take the Primary CPICH code power measured on these channels into account as part of its maximum transmit power self-configuration.

The UARFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators (only the latter is mandated by the {{bibref|3GPP-TS.25.104}} requirements).

The list SHOULD take into account the ability of the FAP to self-configure its own DL UARFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the UARFCN selected by the FAP.

For example, if only adjacent operator protection is required and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the UARFCNs immediately above and below the range of channels owned by the FAP operator. Adjacent channel protection can cause the FAP transmit power to be reduced down to as low as 8dBm.

If {{empty}} then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 * @param uarFCNDLToProtect the input value
	 */
	public void  setUarFCNDLToProtect(Collection<String> uarFCNDLToProtect) {
		this.uarFCNDLToProtect = uarFCNDLToProtect;
	}

	/**
	 * Set the {{list}} Each item is a DL UARFCNs to be protected from adjacent channel interference.  "Adjacent channel" in this context means offset from the FAP's UARFCN by 5MHz. {{bibref|3GPP-TS.25.104|Section 6.4.6}}

If any of the items in the list are adjacent to the FAP's own DL channel, the FAP MUST take the Primary CPICH code power measured on these channels into account as part of its maximum transmit power self-configuration.

The UARFCNs in the list can belong to any operator, allowing for protection of the FAP operator's own macro layer as well as that of other operators (only the latter is mandated by the {{bibref|3GPP-TS.25.104}} requirements).

The list SHOULD take into account the ability of the FAP to self-configure its own DL UARFCN and so SHOULD include any channels (requiring protection) which can potentially be adjacent to the UARFCN selected by the FAP.

For example, if only adjacent operator protection is required and the FAP has the ability to self-configure to any channel owned by its operator, this list would be populated with the UARFCNs immediately above and below the range of channels owned by the FAP operator. Adjacent channel protection can cause the FAP transmit power to be reduced down to as low as 8dBm.

If {{empty}} then it indicates that there are no channels adjacent to the FAP that require protection, or that self-configuration of the FAP transmit power is not enabled.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withUarFCNDLToProtect(String string) {
		getUarFCNDLToProtect().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a Primary DL Scrambling Code used by the FDD mode cell with a numeric range between 0 and 511 inclusive.

{{bibref|3GPP-TS.25.433|Section 9.2.2.34}}

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for {{param}} is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PrimaryScramblingCodeInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PSC values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The following are examples of valid PSC string:

:"20"

::(explicitly specifies a single PSC value)

:"20,30,40"

::(specifies 3 possible PSC values to select from)

"20..40"

::(specifies 21 possible values between 20 and 40, inclusive)

"20..40,50"

::(specifies 22 possible values between 20 and 40 inclusive and a single value 50)

The order of the items has no significance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPrimaryScramblingCode() {
		if (this.primaryScramblingCode == null){ this.primaryScramblingCode=new ArrayList<>();}
		return primaryScramblingCode;
	}

	/**
	 * Set the {{list}} Each item is a Primary DL Scrambling Code used by the FDD mode cell with a numeric range between 0 and 511 inclusive.

{{bibref|3GPP-TS.25.433|Section 9.2.2.34}}

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for {{param}} is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PrimaryScramblingCodeInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PSC values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The following are examples of valid PSC string:

:"20"

::(explicitly specifies a single PSC value)

:"20,30,40"

::(specifies 3 possible PSC values to select from)

"20..40"

::(specifies 21 possible values between 20 and 40, inclusive)

"20..40,50"

::(specifies 22 possible values between 20 and 40 inclusive and a single value 50)

The order of the items has no significance.
	 *
	 * @since 2.0
	 * @param primaryScramblingCode the input value
	 */
	public void  setPrimaryScramblingCode(Collection<String> primaryScramblingCode) {
		this.primaryScramblingCode = primaryScramblingCode;
	}

	/**
	 * Set the {{list}} Each item is a Primary DL Scrambling Code used by the FDD mode cell with a numeric range between 0 and 511 inclusive.

{{bibref|3GPP-TS.25.433|Section 9.2.2.34}}

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for {{param}} is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PrimaryScramblingCodeInUse}}.

If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PSC values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The following are examples of valid PSC string:

:"20"

::(explicitly specifies a single PSC value)

:"20,30,40"

::(specifies 3 possible PSC values to select from)

"20..40"

::(specifies 21 possible values between 20 and 40, inclusive)

"20..40,50"

::(specifies 22 possible values between 20 and 40 inclusive and a single value 50)

The order of the items has no significance.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withPrimaryScramblingCode(String string) {
		getPrimaryScramblingCode().add(string);
		return this;
	}

	/**
	 * Get the PSC being used by the FAP.

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PrimaryScramblingCode}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPrimaryScramblingCodeInUse() {
		return primaryScramblingCodeInUse;
	}

	/**
	 * Set the PSC being used by the FAP.

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PrimaryScramblingCode}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 * @param primaryScramblingCodeInUse the input value
	 */
	public void  setPrimaryScramblingCodeInUse(Long primaryScramblingCodeInUse) {
		this.primaryScramblingCodeInUse = primaryScramblingCodeInUse;
	}

	/**
	 * Set the PSC being used by the FAP.

Self-configuration for PSC is controlled by {{param|.Capabilities.UMTS.SelfConfig.PrimaryScramblingCodeConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PrimaryScramblingCodeSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PrimaryScramblingCode}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PrimaryScramblingCode}}.
	 *
	 * @since 2.0
	 * @param primaryScramblingCodeInUse the input value
	 * @return this instance
	 */
	public RF withPrimaryScramblingCodeInUse(Long primaryScramblingCodeInUse) {
		this.primaryScramblingCodeInUse = primaryScramblingCodeInUse;
		return this;
	}

	/**
	 * Get the defines the maximum transmission power allowed on the FAP, maximum value for the linear sum of the power of all downlink physical channels, that is allowed to be used in a cell.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -30.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMaxFAPTxPowerExpanded() {
		return maxFAPTxPowerExpanded;
	}

	/**
	 * Set the defines the maximum transmission power allowed on the FAP, maximum value for the linear sum of the power of all downlink physical channels, that is allowed to be used in a cell.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -30.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerExpanded the input value
	 */
	public void  setMaxFAPTxPowerExpanded(String maxFAPTxPowerExpanded) {
		this.maxFAPTxPowerExpanded = maxFAPTxPowerExpanded;
	}

	/**
	 * Set the defines the maximum transmission power allowed on the FAP, maximum value for the linear sum of the power of all downlink physical channels, that is allowed to be used in a cell.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -30.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerExpanded the input value
	 * @return this instance
	 */
	public RF withMaxFAPTxPowerExpanded(String maxFAPTxPowerExpanded) {
		this.maxFAPTxPowerExpanded = maxFAPTxPowerExpanded;
		return this;
	}

	/**
	 * Get the maximum transmission power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -30.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPowerExpanded}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxFAPTxPowerInUseExpanded() {
		return maxFAPTxPowerInUseExpanded;
	}

	/**
	 * Set the maximum transmission power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -30.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPowerExpanded}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerInUseExpanded the input value
	 */
	public void  setMaxFAPTxPowerInUseExpanded(Integer maxFAPTxPowerInUseExpanded) {
		this.maxFAPTxPowerInUseExpanded = maxFAPTxPowerInUseExpanded;
	}

	/**
	 * Set the maximum transmission power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -30.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxFAPTxPowerExpandedConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxFAPTxPowerExpandedSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPowerExpanded}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerInUseExpanded the input value
	 * @return this instance
	 */
	public RF withMaxFAPTxPowerInUseExpanded(Integer maxFAPTxPowerInUseExpanded) {
		this.maxFAPTxPowerInUseExpanded = maxFAPTxPowerInUseExpanded;
		return this;
	}

	/**
	 * Get the defines the maximum transmission power level a UE can use on PRACH.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -50 to 33 incremented by 1.

{{bibref|3GPP-TS.25.331|Section 10.3.6.39}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMaxULTxPower() {
		return maxULTxPower;
	}

	/**
	 * Set the defines the maximum transmission power level a UE can use on PRACH.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -50 to 33 incremented by 1.

{{bibref|3GPP-TS.25.331|Section 10.3.6.39}}
	 *
	 * @since 2.0
	 * @param maxULTxPower the input value
	 */
	public void  setMaxULTxPower(String maxULTxPower) {
		this.maxULTxPower = maxULTxPower;
	}

	/**
	 * Set the defines the maximum transmission power level a UE can use on PRACH.

{{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -50 to 33 incremented by 1.

{{bibref|3GPP-TS.25.331|Section 10.3.6.39}}
	 *
	 * @since 2.0
	 * @param maxULTxPower the input value
	 * @return this instance
	 */
	public RF withMaxULTxPower(String maxULTxPower) {
		this.maxULTxPower = maxULTxPower;
		return this;
	}

	/**
	 * Get the maximum transmission power level a UE can use on PRACH.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxULTxPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxULTxPowerInUse() {
		return maxULTxPowerInUse;
	}

	/**
	 * Set the maximum transmission power level a UE can use on PRACH.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxULTxPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param maxULTxPowerInUse the input value
	 */
	public void  setMaxULTxPowerInUse(Integer maxULTxPowerInUse) {
		this.maxULTxPowerInUse = maxULTxPowerInUse;
	}

	/**
	 * Set the maximum transmission power level a UE can use on PRACH.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.MaxULTxPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.MaxULTxPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxULTxPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param maxULTxPowerInUse the input value
	 * @return this instance
	 */
	public RF withMaxULTxPowerInUse(Integer maxULTxPowerInUse) {
		this.maxULTxPowerInUse = maxULTxPowerInUse;
		return this;
	}

	/**
	 * Get the value of the transmission power of the Primary Common PIlot CHannel (P-CPICH). The P-CPICH physical channel carries the common pilots of the cell. Parameter in SIB5.

{{param}} is expressed as a range of allowed transmission power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -10.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPcpICHPower() {
		return pcpICHPower;
	}

	/**
	 * Set the value of the transmission power of the Primary Common PIlot CHannel (P-CPICH). The P-CPICH physical channel carries the common pilots of the cell. Parameter in SIB5.

{{param}} is expressed as a range of allowed transmission power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -10.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @param pcpICHPower the input value
	 */
	public void  setPcpICHPower(String pcpICHPower) {
		this.pcpICHPower = pcpICHPower;
	}

	/**
	 * Set the value of the transmission power of the Primary Common PIlot CHannel (P-CPICH). The P-CPICH physical channel carries the common pilots of the cell. Parameter in SIB5.

{{param}} is expressed as a range of allowed transmission power levels with ".." (two periods) between the upper and lower values, i.e. "<Pmax_low>..<Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

<Pmax_low> and <Pmax_high> are measured in dBm and have a range of -10.0 to 20.0 incremented by 0.1 dB.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.104|Section 6.2.1}}
	 *
	 * @since 2.0
	 * @param pcpICHPower the input value
	 * @return this instance
	 */
	public RF withPcpICHPower(String pcpICHPower) {
		this.pcpICHPower = pcpICHPower;
		return this;
	}

	/**
	 * Get the P-CPICH power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -10.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|PCPICHPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPcpICHPowerInUse() {
		return pcpICHPowerInUse;
	}

	/**
	 * Set the P-CPICH power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -10.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|PCPICHPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param pcpICHPowerInUse the input value
	 */
	public void  setPcpICHPowerInUse(Integer pcpICHPowerInUse) {
		this.pcpICHPowerInUse = pcpICHPowerInUse;
	}

	/**
	 * Set the P-CPICH power measured in dBm currently used by the FAP.

Actual values of the maximum transmission power are -10.0 dBm to 20.0 dBm in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for transmission power is controlled by {{param|.Capabilities.UMTS.SelfConfig.PCPICHPowerConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.PCPICHPowerSelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|PCPICHPower}}.

If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param pcpICHPowerInUse the input value
	 * @return this instance
	 */
	public RF withPcpICHPowerInUse(Integer pcpICHPowerInUse) {
		this.pcpICHPowerInUse = pcpICHPowerInUse;
		return this;
	}

	/**
	 * Get the defines the power offset between pilot channel and DPDCH.

Actual values of the offset are 0.0 dB to 6.0 dB in steps of 0.25 dB. The value of {{param}} divided by 4 yields the actual value of the offset.

{{bibref|3GPP-TS.25.331|Section 10.3.6.18}} {{bibref|3GPP-TS.25.214|Section 5.2.1}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPowerOffsetPilotDPDCH() {
		return powerOffsetPilotDPDCH;
	}

	/**
	 * Set the defines the power offset between pilot channel and DPDCH.

Actual values of the offset are 0.0 dB to 6.0 dB in steps of 0.25 dB. The value of {{param}} divided by 4 yields the actual value of the offset.

{{bibref|3GPP-TS.25.331|Section 10.3.6.18}} {{bibref|3GPP-TS.25.214|Section 5.2.1}}
	 *
	 * @since 2.0
	 * @param powerOffsetPilotDPDCH the input value
	 */
	public void  setPowerOffsetPilotDPDCH(Long powerOffsetPilotDPDCH) {
		this.powerOffsetPilotDPDCH = powerOffsetPilotDPDCH;
	}

	/**
	 * Set the defines the power offset between pilot channel and DPDCH.

Actual values of the offset are 0.0 dB to 6.0 dB in steps of 0.25 dB. The value of {{param}} divided by 4 yields the actual value of the offset.

{{bibref|3GPP-TS.25.331|Section 10.3.6.18}} {{bibref|3GPP-TS.25.214|Section 5.2.1}}
	 *
	 * @since 2.0
	 * @param powerOffsetPilotDPDCH the input value
	 * @return this instance
	 */
	public RF withPowerOffsetPilotDPDCH(Long powerOffsetPilotDPDCH) {
		this.powerOffsetPilotDPDCH = powerOffsetPilotDPDCH;
		return this;
	}

	/**
	 * Get the defines the target value measured in dB for the range of the FAP's DL coverage, in terms of RF propagation loss.

This value can be used by the FAP's self-configuration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{bibref|3GPP-TS.25.967|Section 7.2.1}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFapCoverageTarget() {
		return fapCoverageTarget;
	}

	/**
	 * Set the defines the target value measured in dB for the range of the FAP's DL coverage, in terms of RF propagation loss.

This value can be used by the FAP's self-configuration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{bibref|3GPP-TS.25.967|Section 7.2.1}}
	 *
	 * @since 2.0
	 * @param fapCoverageTarget the input value
	 */
	public void  setFapCoverageTarget(Long fapCoverageTarget) {
		this.fapCoverageTarget = fapCoverageTarget;
	}

	/**
	 * Set the defines the target value measured in dB for the range of the FAP's DL coverage, in terms of RF propagation loss.

This value can be used by the FAP's self-configuration algorithms to help derive transmit power levels in the presence of co-channel and adjacent channel interference.

{{bibref|3GPP-TS.25.967|Section 7.2.1}}
	 *
	 * @since 2.0
	 * @param fapCoverageTarget the input value
	 * @return this instance
	 */
	public RF withFapCoverageTarget(Long fapCoverageTarget) {
		this.fapCoverageTarget = fapCoverageTarget;
		return this;
	}

	/**
	 * Get the defines the target value measured in dB for the downlink signal quality of the FAP in terms of CPICH Ec/Io, thereby clarifying the meaning of "FAPCoverageTarget".

Actual values of the FAPQualityTargetEcIo are -20 dB to 0 dB in steps of 0.1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFapQualityTargetEcIo() {
		return fapQualityTargetEcIo;
	}

	/**
	 * Set the defines the target value measured in dB for the downlink signal quality of the FAP in terms of CPICH Ec/Io, thereby clarifying the meaning of "FAPCoverageTarget".

Actual values of the FAPQualityTargetEcIo are -20 dB to 0 dB in steps of 0.1 dB.
	 *
	 * @since 2.0
	 * @param fapQualityTargetEcIo the input value
	 */
	public void  setFapQualityTargetEcIo(Integer fapQualityTargetEcIo) {
		this.fapQualityTargetEcIo = fapQualityTargetEcIo;
	}

	/**
	 * Set the defines the target value measured in dB for the downlink signal quality of the FAP in terms of CPICH Ec/Io, thereby clarifying the meaning of "FAPCoverageTarget".

Actual values of the FAPQualityTargetEcIo are -20 dB to 0 dB in steps of 0.1 dB.
	 *
	 * @since 2.0
	 * @param fapQualityTargetEcIo the input value
	 * @return this instance
	 */
	public RF withFapQualityTargetEcIo(Integer fapQualityTargetEcIo) {
		this.fapQualityTargetEcIo = fapQualityTargetEcIo;
		return this;
	}

	/**
	 * Get the defines the transmission power offset measured in dB of the Primary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPscHPower() {
		return pscHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the Primary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param pscHPower the input value
	 */
	public void  setPscHPower(Integer pscHPower) {
		this.pscHPower = pscHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the Primary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param pscHPower the input value
	 * @return this instance
	 */
	public RF withPscHPower(Integer pscHPower) {
		this.pscHPower = pscHPower;
		return this;
	}

	/**
	 * Get the defines the transmission power offset measured in dB of the Secondary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSscHPower() {
		return sscHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the Secondary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param sscHPower the input value
	 */
	public void  setSscHPower(Integer sscHPower) {
		this.sscHPower = sscHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the Secondary SCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param sscHPower the input value
	 * @return this instance
	 */
	public RF withSscHPower(Integer sscHPower) {
		this.sscHPower = sscHPower;
		return this;
	}

	/**
	 * Get the defines the maximum transmission power offset measured in dB of the PICH channel relative to the Primary CPICH transmission power.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.2.1.49A}} {{bibref|3GPP-TS.25.331|Section 10.3.6.50}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPicHPower() {
		return picHPower;
	}

	/**
	 * Set the defines the maximum transmission power offset measured in dB of the PICH channel relative to the Primary CPICH transmission power.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.2.1.49A}} {{bibref|3GPP-TS.25.331|Section 10.3.6.50}}
	 *
	 * @since 2.0
	 * @param picHPower the input value
	 */
	public void  setPicHPower(Integer picHPower) {
		this.picHPower = picHPower;
	}

	/**
	 * Set the defines the maximum transmission power offset measured in dB of the PICH channel relative to the Primary CPICH transmission power.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.2.1.49A}} {{bibref|3GPP-TS.25.331|Section 10.3.6.50}}
	 *
	 * @since 2.0
	 * @param picHPower the input value
	 * @return this instance
	 */
	public RF withPicHPower(Integer picHPower) {
		this.picHPower = picHPower;
		return this;
	}

	/**
	 * Get the defines the transmission power offset measured in dB of the PCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.3.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPchPower() {
		return pchPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the PCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.3.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param pchPower the input value
	 */
	public void  setPchPower(Integer pchPower) {
		this.pchPower = pchPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the PCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.3.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param pchPower the input value
	 * @return this instance
	 */
	public RF withPchPower(Integer pchPower) {
		this.pchPower = pchPower;
		return this;
	}

	/**
	 * Get the defines the transmission power offset measured in dB of the FACH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.6.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFacHPower() {
		return facHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the FACH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.6.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param facHPower the input value
	 */
	public void  setFacHPower(Integer facHPower) {
		this.facHPower = facHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the FACH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 6.3.9}} {{bibref|3GPP-TS.25.433|Section 9.1.6.1 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param facHPower the input value
	 * @return this instance
	 */
	public RF withFacHPower(Integer facHPower) {
		this.facHPower = facHPower;
		return this;
	}

	/**
	 * Get the defines the transmission power offset measured in dB of the BCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 9.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBchPower() {
		return bchPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the BCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 9.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param bchPower the input value
	 */
	public void  setBchPower(Integer bchPower) {
		this.bchPower = bchPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of the BCH relative to the Primary CPICH power.

Actual values of the transmission power offset are -35.0 dB to 15.0 dB in steps of 0.1 dB. The value of {{param}} divided by 10 yields the actual value of the transmission power offset.

{{bibref|3GPP-TS.32.642|Section 9.3.11}} {{bibref|3GPP-TS.25.433|Section 9.1.24 and Section 9.2.1.21}}
	 *
	 * @since 2.0
	 * @param bchPower the input value
	 * @return this instance
	 */
	public RF withBchPower(Integer bchPower) {
		this.bchPower = bchPower;
		return this;
	}

	/**
	 * Get the defines the transmission power offset measured in dB of one AICH relative to the Primary CPICH power. Parameter defined in SIB5 {{bibref|3GPP-TS.25.331|Section 10.3.6.3}}.

Transmission power level of AICH, AP-AICH and CD/CA-ICH channels compared to CPICH.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.2.2.D}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getAicHPower() {
		return aicHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of one AICH relative to the Primary CPICH power. Parameter defined in SIB5 {{bibref|3GPP-TS.25.331|Section 10.3.6.3}}.

Transmission power level of AICH, AP-AICH and CD/CA-ICH channels compared to CPICH.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.2.2.D}}
	 *
	 * @since 2.0
	 * @param aicHPower the input value
	 */
	public void  setAicHPower(Integer aicHPower) {
		this.aicHPower = aicHPower;
	}

	/**
	 * Set the defines the transmission power offset measured in dB of one AICH relative to the Primary CPICH power. Parameter defined in SIB5 {{bibref|3GPP-TS.25.331|Section 10.3.6.3}}.

Transmission power level of AICH, AP-AICH and CD/CA-ICH channels compared to CPICH.

{{bibref|3GPP-TS.32.642|Section 6.3.11}} {{bibref|3GPP-TS.25.433|Section 9.2.2.D}}
	 *
	 * @since 2.0
	 * @param aicHPower the input value
	 * @return this instance
	 */
	public RF withAicHPower(Integer aicHPower) {
		this.aicHPower = aicHPower;
		return this;
	}

	/**
	 * Get the value defines 'N' multiples of M(TTI) for CBS DRX calculations at the UE side.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCtcHAllocationPeriod() {
		return ctcHAllocationPeriod;
	}

	/**
	 * Set the value defines 'N' multiples of M(TTI) for CBS DRX calculations at the UE side.
	 *
	 * @since 2.0
	 * @param ctcHAllocationPeriod the input value
	 */
	public void  setCtcHAllocationPeriod(Long ctcHAllocationPeriod) {
		this.ctcHAllocationPeriod = ctcHAllocationPeriod;
	}

	/**
	 * Set the value defines 'N' multiples of M(TTI) for CBS DRX calculations at the UE side.
	 *
	 * @since 2.0
	 * @param ctcHAllocationPeriod the input value
	 * @return this instance
	 */
	public RF withCtcHAllocationPeriod(Long ctcHAllocationPeriod) {
		this.ctcHAllocationPeriod = ctcHAllocationPeriod;
		return this;
	}

	/**
	 * Get the value of CBS frame offset (CTCH) on DL FACH.  Parameter in SIB5
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCbsFrameOffset() {
		return cbsFrameOffset;
	}

	/**
	 * Set the value of CBS frame offset (CTCH) on DL FACH.  Parameter in SIB5
	 *
	 * @since 2.0
	 * @param cbsFrameOffset the input value
	 */
	public void  setCbsFrameOffset(Long cbsFrameOffset) {
		this.cbsFrameOffset = cbsFrameOffset;
	}

	/**
	 * Set the value of CBS frame offset (CTCH) on DL FACH.  Parameter in SIB5
	 *
	 * @since 2.0
	 * @param cbsFrameOffset the input value
	 * @return this instance
	 */
	public RF withCbsFrameOffset(Long cbsFrameOffset) {
		this.cbsFrameOffset = cbsFrameOffset;
		return this;
	}

	/**
	 * Get the defines the number of radio frames in the TTI of the FACH used for CTCH (MTTI).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxTTI() {
		return maxTTI;
	}

	/**
	 * Set the defines the number of radio frames in the TTI of the FACH used for CTCH (MTTI).
	 *
	 * @since 2.0
	 * @param maxTTI the input value
	 */
	public void  setMaxTTI(Long maxTTI) {
		this.maxTTI = maxTTI;
	}

	/**
	 * Set the defines the number of radio frames in the TTI of the FACH used for CTCH (MTTI).
	 *
	 * @since 2.0
	 * @param maxTTI the input value
	 * @return this instance
	 */
	public RF withMaxTTI(Long maxTTI) {
		this.maxTTI = maxTTI;
		return this;
	}

	/**
	 * Get the defines the lower value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not exceed the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}

The Noise Rise Limit range identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNoiseRiseLimitLowerValue() {
		return noiseRiseLimitLowerValue;
	}

	/**
	 * Set the defines the lower value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not exceed the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}

The Noise Rise Limit range identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitLowerValue the input value
	 */
	public void  setNoiseRiseLimitLowerValue(Long noiseRiseLimitLowerValue) {
		this.noiseRiseLimitLowerValue = noiseRiseLimitLowerValue;
	}

	/**
	 * Set the defines the lower value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not exceed the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitUpperValue}}

The Noise Rise Limit range identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitLowerValue the input value
	 * @return this instance
	 */
	public RF withNoiseRiseLimitLowerValue(Long noiseRiseLimitLowerValue) {
		this.noiseRiseLimitLowerValue = noiseRiseLimitLowerValue;
		return this;
	}

	/**
	 * Get the defines the upper value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not be below the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}}

NoiseRiseLimit identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNoiseRiseLimitUpperValue() {
		return noiseRiseLimitUpperValue;
	}

	/**
	 * Set the defines the upper value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not be below the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}}

NoiseRiseLimit identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitUpperValue the input value
	 */
	public void  setNoiseRiseLimitUpperValue(Long noiseRiseLimitUpperValue) {
		this.noiseRiseLimitUpperValue = noiseRiseLimitUpperValue;
	}

	/**
	 * Set the defines the upper value of the Noise Rise Limit range that UMTS FAP is allowed to pick from.

The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB. the value MUST not be below the value of {{param|.CellConfig.UMTS.RAN.RF.NoiseRiseLimitLowerValue}}

NoiseRiseLimit identifies the limits between which the FAP can self-configure its uplink noise rise limit.

Self-configuration for noise rise limit is controlled by {{param|.Capabilities.UMTS.SelfConfig.NoiseRiseLimitConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.NoiseRiseLimitConfigEnable}} from an enabled perspective.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitUpperValue the input value
	 * @return this instance
	 */
	public RF withNoiseRiseLimitUpperValue(Long noiseRiseLimitUpperValue) {
		this.noiseRiseLimitUpperValue = noiseRiseLimitUpperValue;
		return this;
	}

	/**
	 * Get actual value of the Noise Rise Limit that the FAP uses. The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNoiseRiseLimitInUse() {
		return noiseRiseLimitInUse;
	}

	/**
	 * Set actual value of the Noise Rise Limit that the FAP uses. The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitInUse the input value
	 */
	public void  setNoiseRiseLimitInUse(Long noiseRiseLimitInUse) {
		this.noiseRiseLimitInUse = noiseRiseLimitInUse;
	}

	/**
	 * Set actual value of the Noise Rise Limit that the FAP uses. The value is measured in dB and has a range of 0.0 to 50.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param noiseRiseLimitInUse the input value
	 * @return this instance
	 */
	public RF withNoiseRiseLimitInUse(Long noiseRiseLimitInUse) {
		this.noiseRiseLimitInUse = noiseRiseLimitInUse;
		return this;
	}

	//</editor-fold>

}