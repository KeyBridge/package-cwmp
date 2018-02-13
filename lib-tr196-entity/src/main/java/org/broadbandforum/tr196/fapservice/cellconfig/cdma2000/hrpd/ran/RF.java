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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.ran;

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
	 * Contains the details related to HRPD RF
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.RAN.RF.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.HRPD.RAN.RF")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD.RAN.RF")
@XmlAccessorType(XmlAccessType.FIELD)
public class RF {

	/**
	 * The Band Class this HRPD Carrier object is to operate on. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDCarBandClass")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long hrpDCarBandClass;
	/**
	 * {{list}} Each item is a FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCNFL is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the FAP's self-configuration capability for RFCNFL is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|RFCNFLInUse}}. If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item. If multiple items are specified, they are done in the order of preference.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFL")
	@CWMPParameter(access = "readWrite")
	@Size
	@XmlList
	public Collection<String> rfcNFL;
	/**
	 * The FL RFCN being used by the FAP. Self-configuration for RFCNFL is controlled by

{{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and

{{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|RFCNFL}}. If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|RFCNFL}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RFCNFLInUse")
	public Long rfcNFLInUse;
	/**
	 * {{list}} (maximum length 32) (minimum 1 items) of strings. Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PilotPNInUse}}. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offsets values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The order of the items has no significance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotPN")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> pilotPN;
	/**
	 * The Pilot PN Offset being used by the FAP. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PilotPN}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PilotPN}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PilotPNInUse")
	@CWMPParameter(access = "readWrite")
	public Long pilotPNInUse;
	/**
	 * Defines the maximum transmission power allowed on the FAP. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPower")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String maxFAPTxPower;
	/**
	 * The maximum transmission power measured in 0.1 dBm currently used by the FAP.

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxFAPTxPowerInUse")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "0.1 dBm")
	@Size(min = -200, max = 200)
	public Integer maxFAPTxPowerInUse;
	/**
	 * The data rate of the Control Channel of this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-10.4.1.3.2.4
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ControlChannelRate")
	@CWMPParameter(access = "readWrite")
	public Integer controlChannelRate;
	/**
	 * The offset from the control channel cycle boundary at which the synchronous capsules are to be transmitted for this HRPD SectorElement object. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-9.2.6.1.4.1.2
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SyncCapsuleOffset")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Integer syncCapsuleOffset;
	/**
	 * The Reverse Activity Bit (RAB) length measured in slots for this HRPD SectorElement object.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2, Table 9.7.6.2-2.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RabLength")
	@CWMPParameter(access = "readWrite")
	@Size(min = 64, max = 64)
	public Integer rabLength;
	/**
	 * The Reverse Activity Bit (RAB) offset for this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RabOffset")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Integer rabOffset;
	/**
	 * The 128 bit Sector ID for this HRPD SectorElement object. The Sector ID is used in the computation of the long code mask. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SectorID")
	@CWMPParameter(access = "readWrite")
	public byte[] sectorID;
	/**
	 * The HRPD color code associated with this sector-element. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ColorCode")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Integer colorCode;
	/**
	 * {{param}} is the length of the HRPD SubnetMask in bits. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubnetMaskLength")
	@CWMPParameter(access = "readWrite", units = "bits")
	@Size(min = 0, max = 104)
	public Integer subnetMaskLength;
	/**
	 * Duration of the Reverse Link Silence Interval in units of frames. The duration of the silence interval to be maintained on the reverse link.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDSecElReverseLinkSilenceDuration")
	@CWMPParameter(access = "readWrite", units = "frames")
	@Size(min = 0, max = 3)
	public Integer hrpDSecElReverseLinkSilenceDuration;
	/**
	 * The Reverse Link Silence Interval is defined as the time interval of duration ReverseLinkSilenceDuration frames that starts at times T where T is the CDMA System Time in units of frames and it satisfies the following equation:

T mod (2048 x 2^(ReverseLinkSilencePeriod) - 1) = 0.

The period in the access cycle duration for which the silence interval shall be maintained on the reverse link. {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HRPDSecElReverseLinkSilencePeriod")
	@CWMPParameter(access = "readWrite", units = "frames")
	@Size(min = 0, max = 3)
	public Integer hrpDSecElReverseLinkSilencePeriod;
	/**
	 * The open loop adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the negative of the nominal power to be used by ATs in the open loop power estimate, expressed as an unsigned value in units of 1 dB. The value used by the AT is -1 times the value of this field.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OpenLoopAdjust")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 255)
	public Integer openLoopAdjust;
	/**
	 * The probe initial adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the correction factor to be used by ATs in the open loop power estimate for the initial transmission on the Access Channel, expressed as a two's complement value in units of 1 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProbeInitialAdjust")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -15, max = 15)
	public Integer probeInitialAdjust;
	/**
	 * The number of power level steps for access probes for the access parameters of this sector-element. FAP sets this field to the maximum number of access probes ATs are to transmit in a single access probe sequence. The access network shall set this field to a value in the range [1 ... 15]. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProbeNumSteps")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 15)
	public Integer probeNumSteps;
	/**
	 * The power step size (in 0.5 dB) applied to successive probes on the access channel associated with this sector-element. Probe power increase step. FAPsets this field to the increase in power between probes, in resolution of 0.5 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProbePowerStep")
	@CWMPParameter(access = "readWrite", units = "0.5 dB")
	@Size(min = 0, max = 15)
	public Integer probePowerStep;
	/**
	 * The A-Persistence vector, as per HRPD specification, for controlling contention access on the access channel associated with this sector-element. Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6.  Format is "0xAABBCCDD", where AA, BB, CC, DD are in the range "01" through "3F" hex.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APersistence")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16)
	public String apersistence;
	/**
	 * RAB threshold for RSSI based RAB algorithm.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSSIRABThreshold")
	@CWMPParameter(access = "readWrite", units = "0.125 dBm")
	@Size(min = -1600, max = 1600)
	public Integer rssIRABThreshold;
	/**
	 * RAB threshold for Load based RAB algorithm in units of 0.125 dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LoadRABThreshold")
	@CWMPParameter(access = "readWrite", units = "0.125 dB")
	@Size(min = 0, max = 480)
	public Long loadRABThreshold;
	/**
	 * 4 different configurations.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConnectionRateLimit")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Long connectionRateLimit;
	/**
	 * Config Parameter for DRC based rate control
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RfeRLBalanceRatio")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 20)
	public Long rfeRLBalanceRatio;

	public RF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the Band Class this HRPD Carrier object is to operate on. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHrpDCarBandClass() {
		return hrpDCarBandClass;
	}

	/**
	 * Set the Band Class this HRPD Carrier object is to operate on. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 * @param hrpDCarBandClass the input value
	 */
	public void  setHrpDCarBandClass(Long hrpDCarBandClass) {
		this.hrpDCarBandClass = hrpDCarBandClass;
	}

	/**
	 * Set the Band Class this HRPD Carrier object is to operate on. Reference - {{bibref|3GPP2-C.S0057}}, Band Class Specification for CDMA2000 Spread Spectrum Systems.
	 *
	 * @since 2.0
	 * @param hrpDCarBandClass the input value
	 * @return this instance
	 */
	public RF withHrpDCarBandClass(Long hrpDCarBandClass) {
		this.hrpDCarBandClass = hrpDCarBandClass;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCNFL is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the FAP's self-configuration capability for RFCNFL is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|RFCNFLInUse}}. If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item. If multiple items are specified, they are done in the order of preference.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getRfcNFL() {
		if (this.rfcNFL == null){ this.rfcNFL=new ArrayList<>();}
		return rfcNFL;
	}

	/**
	 * Set the {{list}} Each item is a FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCNFL is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the FAP's self-configuration capability for RFCNFL is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|RFCNFLInUse}}. If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item. If multiple items are specified, they are done in the order of preference.
	 *
	 * @since 2.0
	 * @param rfcNFL the input value
	 */
	public void  setRfcNFL(Collection<String> rfcNFL) {
		this.rfcNFL = rfcNFL;
	}

	/**
	 * Set the {{list}} Each item is a FL Radio Frequency Channel Number (RFCN). Self-configuration for RFCNFL is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the FAP's self-configuration capability for RFCNFL is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|RFCNFLInUse}}. If the self-configuration capability is not available or not enabled, then  this parameter SHOULD contain only a single item. If multiple items are specified, they are done in the order of preference.
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
	 * Get the FL RFCN being used by the FAP. Self-configuration for RFCNFL is controlled by

{{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and

{{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|RFCNFL}}. If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|RFCNFL}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRfcNFLInUse() {
		return rfcNFLInUse;
	}

	/**
	 * Set the FL RFCN being used by the FAP. Self-configuration for RFCNFL is controlled by

{{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and

{{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|RFCNFL}}. If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|RFCNFL}}.
	 *
	 * @since 2.0
	 * @param rfcNFLInUse the input value
	 */
	public void  setRfcNFLInUse(Long rfcNFLInUse) {
		this.rfcNFLInUse = rfcNFLInUse;
	}

	/**
	 * Set the FL RFCN being used by the FAP. Self-configuration for RFCNFL is controlled by

{{param|.Capabilities.CDMA2000.HRPD.SelfConfig.RFCNFLConfig}} from an availability perspective and

{{param|.FAPControl.CDMA2000.HRPD.SelfConfig.RFCNFLSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|RFCNFL}}. If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|RFCNFL}}.
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
	 * Get the {{list}} (maximum length 32) (minimum 1 items) of strings. Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PilotPNInUse}}. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offsets values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

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
	 * Set the {{list}} (maximum length 32) (minimum 1 items) of strings. Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PilotPNInUse}}. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offsets values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

The order of the items has no significance.
	 *
	 * @since 2.0
	 * @param pilotPN the input value
	 */
	public void  setPilotPN(Collection<String> pilotPN) {
		this.pilotPN = pilotPN;
	}

	/**
	 * Set the {{list}} (maximum length 32) (minimum 1 items) of strings. Each item is a pilot PN offset in units of 64 PN chips. Self-configuration for pilot PN is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective.

If the FAP's self-configuration capability for Pilot PN Offset is available and enabled, this parameter MAY contain more than one item and the FAP is expected to select one from the list for {{param|PilotPNInUse}}. If the self-configuration capability is not available or not enabled, then this parameter SHOULD contain only a single item.

The multiplicity of the PN offsets values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.

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
	 * Get the Pilot PN Offset being used by the FAP. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PilotPN}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PilotPN}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPilotPNInUse() {
		return pilotPNInUse;
	}

	/**
	 * Set the Pilot PN Offset being used by the FAP. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PilotPN}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PilotPN}}.
	 *
	 * @since 2.0
	 * @param pilotPNInUse the input value
	 */
	public void  setPilotPNInUse(Long pilotPNInUse) {
		this.pilotPNInUse = pilotPNInUse;
	}

	/**
	 * Set the Pilot PN Offset being used by the FAP. Self-configuration for Pilot PN Offset is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.PilotPNConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.PilotPNSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|PilotPN}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first value in {{param|PilotPN}}.
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
	 * Get the defines the maximum transmission power allowed on the FAP. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMaxFAPTxPower() {
		return maxFAPTxPower;
	}

	/**
	 * Set the defines the maximum transmission power allowed on the FAP. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
	 *
	 * @since 2.0
	 * @param maxFAPTxPower the input value
	 */
	public void  setMaxFAPTxPower(String maxFAPTxPower) {
		this.maxFAPTxPower = maxFAPTxPower;
	}

	/**
	 * Set the defines the maximum transmission power allowed on the FAP. {{param}} is expressed as a range of allowed maximum power levels with ".." (two periods) between the upper and lower values, i.e. "<;Pmax_low>..<;Pmax_high>".

{{param}} identifies the limits between which the FAP can self-configure its maximum transmit power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. <;Pmax_low> and <;Pmax_high> are measured in dBm and have a range of -40.0 to 20.0 incremented by 0.1 dB.
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

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxFAPTxPowerInUse() {
		return maxFAPTxPowerInUse;
	}

	/**
	 * Set the maximum transmission power measured in 0.1 dBm currently used by the FAP.

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
	 *
	 * @since 2.0
	 * @param maxFAPTxPowerInUse the input value
	 */
	public void  setMaxFAPTxPowerInUse(Integer maxFAPTxPowerInUse) {
		this.maxFAPTxPowerInUse = maxFAPTxPowerInUse;
	}

	/**
	 * Set the maximum transmission power measured in 0.1 dBm currently used by the FAP.

Actual values of the maximum transmission power are -40.0 dBm to 20.0 dBm in steps of 0.1 dBm. The value of {{param}} divided by 10 yields the actual value of the maximum transmission power.

Self-configuration for maximum transmission power is controlled by {{param|.Capabilities.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerConfig}} from an availability perspective and {{param|.FAPControl.CDMA2000.HRPD.SelfConfig.MaxFAPTxPowerSelfConfigEnable}} from an enabled perspective. If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the range provided in {{param|MaxFAPTxPower}}. If the self-configuration capability is not available or not enabled, then this parameter contains a value selected by the ACS.
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
	 * Get the data rate of the Control Channel of this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-10.4.1.3.2.4
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getControlChannelRate() {
		return controlChannelRate;
	}

	/**
	 * Set the data rate of the Control Channel of this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-10.4.1.3.2.4
	 *
	 * @since 2.0
	 * @param controlChannelRate the input value
	 */
	public void  setControlChannelRate(Integer controlChannelRate) {
		this.controlChannelRate = controlChannelRate;
	}

	/**
	 * Set the data rate of the Control Channel of this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-10.4.1.3.2.4
	 *
	 * @since 2.0
	 * @param controlChannelRate the input value
	 * @return this instance
	 */
	public RF withControlChannelRate(Integer controlChannelRate) {
		this.controlChannelRate = controlChannelRate;
		return this;
	}

	/**
	 * Get the offset from the control channel cycle boundary at which the synchronous capsules are to be transmitted for this HRPD SectorElement object. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-9.2.6.1.4.1.2
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSyncCapsuleOffset() {
		return syncCapsuleOffset;
	}

	/**
	 * Set the offset from the control channel cycle boundary at which the synchronous capsules are to be transmitted for this HRPD SectorElement object. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-9.2.6.1.4.1.2
	 *
	 * @since 2.0
	 * @param syncCapsuleOffset the input value
	 */
	public void  setSyncCapsuleOffset(Integer syncCapsuleOffset) {
		this.syncCapsuleOffset = syncCapsuleOffset;
	}

	/**
	 * Set the offset from the control channel cycle boundary at which the synchronous capsules are to be transmitted for this HRPD SectorElement object. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-9.2.6.1.4.1.2
	 *
	 * @since 2.0
	 * @param syncCapsuleOffset the input value
	 * @return this instance
	 */
	public RF withSyncCapsuleOffset(Integer syncCapsuleOffset) {
		this.syncCapsuleOffset = syncCapsuleOffset;
		return this;
	}

	/**
	 * Get the Reverse Activity Bit (RAB) length measured in slots for this HRPD SectorElement object.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2, Table 9.7.6.2-2.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRabLength() {
		return rabLength;
	}

	/**
	 * Set the Reverse Activity Bit (RAB) length measured in slots for this HRPD SectorElement object.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2, Table 9.7.6.2-2.
	 *
	 * @since 2.0
	 * @param rabLength the input value
	 */
	public void  setRabLength(Integer rabLength) {
		this.rabLength = rabLength;
	}

	/**
	 * Set the Reverse Activity Bit (RAB) length measured in slots for this HRPD SectorElement object.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2, Table 9.7.6.2-2.
	 *
	 * @since 2.0
	 * @param rabLength the input value
	 * @return this instance
	 */
	public RF withRabLength(Integer rabLength) {
		this.rabLength = rabLength;
		return this;
	}

	/**
	 * Get the Reverse Activity Bit (RAB) offset for this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRabOffset() {
		return rabOffset;
	}

	/**
	 * Set the Reverse Activity Bit (RAB) offset for this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2.
	 *
	 * @since 2.0
	 * @param rabOffset the input value
	 */
	public void  setRabOffset(Integer rabOffset) {
		this.rabOffset = rabOffset;
	}

	/**
	 * Set the Reverse Activity Bit (RAB) offset for this HRPD SectorElement object.  Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification, section-7.8.6.2.2.
	 *
	 * @since 2.0
	 * @param rabOffset the input value
	 * @return this instance
	 */
	public RF withRabOffset(Integer rabOffset) {
		this.rabOffset = rabOffset;
		return this;
	}

	/**
	 * Get the 128 bit Sector ID for this HRPD SectorElement object. The Sector ID is used in the computation of the long code mask. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSectorID() {
		return sectorID;
	}

	/**
	 * Set the 128 bit Sector ID for this HRPD SectorElement object. The Sector ID is used in the computation of the long code mask. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification.
	 *
	 * @since 2.0
	 * @param sectorID the input value
	 */
	public void  setSectorID(byte[] sectorID) {
		this.sectorID = sectorID;
	}

	/**
	 * Set the 128 bit Sector ID for this HRPD SectorElement object. The Sector ID is used in the computation of the long code mask. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification.
	 *
	 * @since 2.0
	 * @param sectorID the input value
	 * @return this instance
	 */
	public RF withSectorID(byte[] sectorID) {
		this.sectorID = sectorID;
		return this;
	}

	/**
	 * Get the HRPD color code associated with this sector-element. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getColorCode() {
		return colorCode;
	}

	/**
	 * Set the HRPD color code associated with this sector-element. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 * @param colorCode the input value
	 */
	public void  setColorCode(Integer colorCode) {
		this.colorCode = colorCode;
	}

	/**
	 * Set the HRPD color code associated with this sector-element. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 * @param colorCode the input value
	 * @return this instance
	 */
	public RF withColorCode(Integer colorCode) {
		this.colorCode = colorCode;
		return this;
	}

	/**
	 * Get the {{param}} is the length of the HRPD SubnetMask in bits. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSubnetMaskLength() {
		return subnetMaskLength;
	}

	/**
	 * Set the {{param}} is the length of the HRPD SubnetMask in bits. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 * @param subnetMaskLength the input value
	 */
	public void  setSubnetMaskLength(Integer subnetMaskLength) {
		this.subnetMaskLength = subnetMaskLength;
	}

	/**
	 * Set the {{param}} is the length of the HRPD SubnetMask in bits. See {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification
	 *
	 * @since 2.0
	 * @param subnetMaskLength the input value
	 * @return this instance
	 */
	public RF withSubnetMaskLength(Integer subnetMaskLength) {
		this.subnetMaskLength = subnetMaskLength;
		return this;
	}

	/**
	 * Get the duration of the Reverse Link Silence Interval in units of frames. The duration of the silence interval to be maintained on the reverse link.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHrpDSecElReverseLinkSilenceDuration() {
		return hrpDSecElReverseLinkSilenceDuration;
	}

	/**
	 * Set the duration of the Reverse Link Silence Interval in units of frames. The duration of the silence interval to be maintained on the reverse link.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 * @param hrpDSecElReverseLinkSilenceDuration the input value
	 */
	public void  setHrpDSecElReverseLinkSilenceDuration(Integer hrpDSecElReverseLinkSilenceDuration) {
		this.hrpDSecElReverseLinkSilenceDuration = hrpDSecElReverseLinkSilenceDuration;
	}

	/**
	 * Set the duration of the Reverse Link Silence Interval in units of frames. The duration of the silence interval to be maintained on the reverse link.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 * @param hrpDSecElReverseLinkSilenceDuration the input value
	 * @return this instance
	 */
	public RF withHrpDSecElReverseLinkSilenceDuration(Integer hrpDSecElReverseLinkSilenceDuration) {
		this.hrpDSecElReverseLinkSilenceDuration = hrpDSecElReverseLinkSilenceDuration;
		return this;
	}

	/**
	 * Get the Reverse Link Silence Interval is defined as the time interval of duration ReverseLinkSilenceDuration frames that starts at times T where T is the CDMA System Time in units of frames and it satisfies the following equation:

T mod (2048 x 2^(ReverseLinkSilencePeriod) - 1) = 0.

The period in the access cycle duration for which the silence interval shall be maintained on the reverse link. {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getHrpDSecElReverseLinkSilencePeriod() {
		return hrpDSecElReverseLinkSilencePeriod;
	}

	/**
	 * Set the Reverse Link Silence Interval is defined as the time interval of duration ReverseLinkSilenceDuration frames that starts at times T where T is the CDMA System Time in units of frames and it satisfies the following equation:

T mod (2048 x 2^(ReverseLinkSilencePeriod) - 1) = 0.

The period in the access cycle duration for which the silence interval shall be maintained on the reverse link. {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 * @param hrpDSecElReverseLinkSilencePeriod the input value
	 */
	public void  setHrpDSecElReverseLinkSilencePeriod(Integer hrpDSecElReverseLinkSilencePeriod) {
		this.hrpDSecElReverseLinkSilencePeriod = hrpDSecElReverseLinkSilencePeriod;
	}

	/**
	 * Set the Reverse Link Silence Interval is defined as the time interval of duration ReverseLinkSilenceDuration frames that starts at times T where T is the CDMA System Time in units of frames and it satisfies the following equation:

T mod (2048 x 2^(ReverseLinkSilencePeriod) - 1) = 0.

The period in the access cycle duration for which the silence interval shall be maintained on the reverse link. {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.1.4.1.1.
	 *
	 * @since 2.0
	 * @param hrpDSecElReverseLinkSilencePeriod the input value
	 * @return this instance
	 */
	public RF withHrpDSecElReverseLinkSilencePeriod(Integer hrpDSecElReverseLinkSilencePeriod) {
		this.hrpDSecElReverseLinkSilencePeriod = hrpDSecElReverseLinkSilencePeriod;
		return this;
	}

	/**
	 * Get the open loop adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the negative of the nominal power to be used by ATs in the open loop power estimate, expressed as an unsigned value in units of 1 dB. The value used by the AT is -1 times the value of this field.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getOpenLoopAdjust() {
		return openLoopAdjust;
	}

	/**
	 * Set the open loop adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the negative of the nominal power to be used by ATs in the open loop power estimate, expressed as an unsigned value in units of 1 dB. The value used by the AT is -1 times the value of this field.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param openLoopAdjust the input value
	 */
	public void  setOpenLoopAdjust(Integer openLoopAdjust) {
		this.openLoopAdjust = openLoopAdjust;
	}

	/**
	 * Set the open loop adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the negative of the nominal power to be used by ATs in the open loop power estimate, expressed as an unsigned value in units of 1 dB. The value used by the AT is -1 times the value of this field.  Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param openLoopAdjust the input value
	 * @return this instance
	 */
	public RF withOpenLoopAdjust(Integer openLoopAdjust) {
		this.openLoopAdjust = openLoopAdjust;
		return this;
	}

	/**
	 * Get the probe initial adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the correction factor to be used by ATs in the open loop power estimate for the initial transmission on the Access Channel, expressed as a two's complement value in units of 1 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getProbeInitialAdjust() {
		return probeInitialAdjust;
	}

	/**
	 * Set the probe initial adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the correction factor to be used by ATs in the open loop power estimate for the initial transmission on the Access Channel, expressed as a two's complement value in units of 1 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param probeInitialAdjust the input value
	 */
	public void  setProbeInitialAdjust(Integer probeInitialAdjust) {
		this.probeInitialAdjust = probeInitialAdjust;
	}

	/**
	 * Set the probe initial adjustment (in dB) for the access parameters of this sector-element. FAP sets this field to the correction factor to be used by ATs in the open loop power estimate for the initial transmission on the Access Channel, expressed as a two's complement value in units of 1 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param probeInitialAdjust the input value
	 * @return this instance
	 */
	public RF withProbeInitialAdjust(Integer probeInitialAdjust) {
		this.probeInitialAdjust = probeInitialAdjust;
		return this;
	}

	/**
	 * Get the number of power level steps for access probes for the access parameters of this sector-element. FAP sets this field to the maximum number of access probes ATs are to transmit in a single access probe sequence. The access network shall set this field to a value in the range [1 ... 15]. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getProbeNumSteps() {
		return probeNumSteps;
	}

	/**
	 * Set the number of power level steps for access probes for the access parameters of this sector-element. FAP sets this field to the maximum number of access probes ATs are to transmit in a single access probe sequence. The access network shall set this field to a value in the range [1 ... 15]. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param probeNumSteps the input value
	 */
	public void  setProbeNumSteps(Integer probeNumSteps) {
		this.probeNumSteps = probeNumSteps;
	}

	/**
	 * Set the number of power level steps for access probes for the access parameters of this sector-element. FAP sets this field to the maximum number of access probes ATs are to transmit in a single access probe sequence. The access network shall set this field to a value in the range [1 ... 15]. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param probeNumSteps the input value
	 * @return this instance
	 */
	public RF withProbeNumSteps(Integer probeNumSteps) {
		this.probeNumSteps = probeNumSteps;
		return this;
	}

	/**
	 * Get the power step size (in 0.5 dB) applied to successive probes on the access channel associated with this sector-element. Probe power increase step. FAPsets this field to the increase in power between probes, in resolution of 0.5 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getProbePowerStep() {
		return probePowerStep;
	}

	/**
	 * Set the power step size (in 0.5 dB) applied to successive probes on the access channel associated with this sector-element. Probe power increase step. FAPsets this field to the increase in power between probes, in resolution of 0.5 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param probePowerStep the input value
	 */
	public void  setProbePowerStep(Integer probePowerStep) {
		this.probePowerStep = probePowerStep;
	}

	/**
	 * Set the power step size (in 0.5 dB) applied to successive probes on the access channel associated with this sector-element. Probe power increase step. FAPsets this field to the increase in power between probes, in resolution of 0.5 dB. Reference -{{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6
	 *
	 * @since 2.0
	 * @param probePowerStep the input value
	 * @return this instance
	 */
	public RF withProbePowerStep(Integer probePowerStep) {
		this.probePowerStep = probePowerStep;
		return this;
	}

	/**
	 * Get the A-Persistence vector, as per HRPD specification, for controlling contention access on the access channel associated with this sector-element. Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6.  Format is "0xAABBCCDD", where AA, BB, CC, DD are in the range "01" through "3F" hex.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getApersistence() {
		return apersistence;
	}

	/**
	 * Set the A-Persistence vector, as per HRPD specification, for controlling contention access on the access channel associated with this sector-element. Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6.  Format is "0xAABBCCDD", where AA, BB, CC, DD are in the range "01" through "3F" hex.
	 *
	 * @since 2.0
	 * @param apersistence the input value
	 */
	public void  setApersistence(String apersistence) {
		this.apersistence = apersistence;
	}

	/**
	 * Set the A-Persistence vector, as per HRPD specification, for controlling contention access on the access channel associated with this sector-element. Reference - {{bibref|3GPP2-C.S0024-B}}, CDMA2000 High Rate Packet Data Air Interface Specification. Section-9.4.6.2.6.  Format is "0xAABBCCDD", where AA, BB, CC, DD are in the range "01" through "3F" hex.
	 *
	 * @since 2.0
	 * @param apersistence the input value
	 * @return this instance
	 */
	public RF withApersistence(String apersistence) {
		this.apersistence = apersistence;
		return this;
	}

	/**
	 * Get the rab threshold for RSSI based RAB algorithm.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRssIRABThreshold() {
		return rssIRABThreshold;
	}

	/**
	 * Set the rab threshold for RSSI based RAB algorithm.
	 *
	 * @since 2.0
	 * @param rssIRABThreshold the input value
	 */
	public void  setRssIRABThreshold(Integer rssIRABThreshold) {
		this.rssIRABThreshold = rssIRABThreshold;
	}

	/**
	 * Set the rab threshold for RSSI based RAB algorithm.
	 *
	 * @since 2.0
	 * @param rssIRABThreshold the input value
	 * @return this instance
	 */
	public RF withRssIRABThreshold(Integer rssIRABThreshold) {
		this.rssIRABThreshold = rssIRABThreshold;
		return this;
	}

	/**
	 * Get the rab threshold for Load based RAB algorithm in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLoadRABThreshold() {
		return loadRABThreshold;
	}

	/**
	 * Set the rab threshold for Load based RAB algorithm in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param loadRABThreshold the input value
	 */
	public void  setLoadRABThreshold(Long loadRABThreshold) {
		this.loadRABThreshold = loadRABThreshold;
	}

	/**
	 * Set the rab threshold for Load based RAB algorithm in units of 0.125 dB.
	 *
	 * @since 2.0
	 * @param loadRABThreshold the input value
	 * @return this instance
	 */
	public RF withLoadRABThreshold(Long loadRABThreshold) {
		this.loadRABThreshold = loadRABThreshold;
		return this;
	}

	/**
	 * Get the 4 different configurations.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getConnectionRateLimit() {
		return connectionRateLimit;
	}

	/**
	 * Set the 4 different configurations.
	 *
	 * @since 2.0
	 * @param connectionRateLimit the input value
	 */
	public void  setConnectionRateLimit(Long connectionRateLimit) {
		this.connectionRateLimit = connectionRateLimit;
	}

	/**
	 * Set the 4 different configurations.
	 *
	 * @since 2.0
	 * @param connectionRateLimit the input value
	 * @return this instance
	 */
	public RF withConnectionRateLimit(Long connectionRateLimit) {
		this.connectionRateLimit = connectionRateLimit;
		return this;
	}

	/**
	 * Get the config Parameter for DRC based rate control
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRfeRLBalanceRatio() {
		return rfeRLBalanceRatio;
	}

	/**
	 * Set the config Parameter for DRC based rate control
	 *
	 * @since 2.0
	 * @param rfeRLBalanceRatio the input value
	 */
	public void  setRfeRLBalanceRatio(Long rfeRLBalanceRatio) {
		this.rfeRLBalanceRatio = rfeRLBalanceRatio;
	}

	/**
	 * Set the config Parameter for DRC based rate control
	 *
	 * @since 2.0
	 * @param rfeRLBalanceRatio the input value
	 * @return this instance
	 */
	public RF withRfeRLBalanceRatio(Long rfeRLBalanceRatio) {
		this.rfeRLBalanceRatio = rfeRLBalanceRatio;
		return this;
	}

	//</editor-fold>

}