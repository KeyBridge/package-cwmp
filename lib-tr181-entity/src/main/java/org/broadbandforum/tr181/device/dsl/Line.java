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
package org.broadbandforum.tr181.device.dsl;

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
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.dsl.line.DataGathering;
import org.broadbandforum.tr181.device.dsl.line.Stats;
import org.broadbandforum.tr181.device.dsl.line.TestParams;

	/**
	 * DSL Line table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}). 

        This table models physical DSL lines.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.Line.{i}.")
@XmlRootElement(name = "Line")
@XmlType(name = "Device.DSL.Line")
@XmlAccessorType(XmlAccessType.FIELD)
public class Line {

	/**
	 * Enables or disables the DSL line.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Enables or disables data gathering on the DSL line.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "EnableDataGathering")
	@CWMPParameter(access = "readWrite")
	public Boolean enableDataGathering;
	/**
	 * The current operational state of the DSL line (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the DSL line as assigned by the CPE.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@Size(max = 64)
	public String name;
	/**
	 * The accumulated time in seconds since the DSL line entered its current operational state.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastChange")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastChange;
	/**
	 * {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowerLayers")
	@CWMPParameter(access = "readWrite")
	@Size(max = 1024)
	@XmlList
	public Collection<String> lowerLayers;
	/**
	 * Indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Upstream")
	public Boolean upstream;
	/**
	 * A string identifying the version of the modem firmware currently installed for this interface. This is applicable only when the modem firmware is separable from the overall CPE software.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FirmwareVersion")
	@Size(max = 64)
	public String firmwareVersion;
	/**
	 * Status of the DSL physical link. {{enum}}

          When {{param}} is {{enum|Up}}, {{param|Status}} is expected to be {{enum|Up|Status}}. When {{param}} is {{enum|Initializing}} or {{enum|EstablishingLink}} or {{enum|NoSignal}} or {{enum|Disabled}}, {{param|Status}} is expected to be {{enum|Down|Status}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LinkStatus")
	public String linkStatus;
	/**
	 * {{list}} List items indicate which DSL standards and recommendations are supported by the {{object}} instance. 

Enumerated value must be one of [G.992.1_Annex_A, G.992.1_Annex_B, G.992.1_Annex_C, T1.413, T1.413i2, ETSI_101_388, G.992.2, G.992.3_Annex_A, G.992.3_Annex_B, G.992.3_Annex_C, G.992.3_Annex_I, G.992.3_Annex_J, G.992.3_Annex_L, G.992.3_Annex_M, G.992.4, G.992.5_Annex_A, G.992.5_Annex_B, G.992.5_Annex_C, G.992.5_Annex_I, G.992.5_Annex_J, G.992.5_Annex_M, G.993.1, G.993.1_Annex_A, G.993.2_Annex_A, G.993.2_Annex_B, G.993.2_Annex_C]

          Note: In G.997.1, this parameter is called "xDSL Transmission system capabilities". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSE}} is supported.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StandardsSupported")
	@XmlList
	public Collection<String> standardsSupported;
	/**
	 * This configuration parameter defines the transmission system types to be allowed by the xTU on this {{object}} instance. Each bit is 0 if not allowed or 1 if allowed, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.

          Note: This parameter is defined as xDSL Transmission system enabling (XTSE) in ITU-T G.997.1. For a full definition, see Clause 7.3.1.1.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "XTSE")
	public byte[] xtsE;
	/**
	 * Indicates the standard that the {{object}} instance is using for the connection.

          Note: In G.997.1, this parameter is called "xDSL Transmission system". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSUsed}} is supported.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StandardUsed")
	public String standardUsed;
	/**
	 * This parameter indicates which DSL standard and recommendation are currently in use by the {{object}} instance. Only one bit is set, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "XTSUsed")
	public byte[] xtsUsed;
	/**
	 * The line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  {{enum}}

          Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LineEncoding")
	public String lineEncoding;
	/**
	 * {{list}} List items indicate which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

          Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation {{bibref|G.997.1}}.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AllowedProfiles")
	@XmlList
	public Collection<String> allowedProfiles;
	/**
	 * Indicates which VDSL2 profile is currently in use on the line.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentProfile")
	public String currentProfile;
	/**
	 * The power management state of the line. {{enum}}

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerManagementState")
	public String powerManagementState;
	/**
	 * The success failure cause of the initialization. An enumeration of the following integer values:

          * 0: Successful

          * 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in  an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate  for one or more bearer channels.

          * 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the  Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

          * 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode  can be selected in the G.994.1 handshaking procedure or due to a timeout.

          * 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow  detection of a peer xTU.

          * 5: Any other or unknown Initialization Failure cause.

          * 6: ITU T G.998.4 retransmission mode was not selected while RTX_MODE = FORCED or with RTX_MODE = RTX_TESTMODE.

          Note: In G.997.1, this parameter is called "Initialization success/failure cause". See Clause 7.5.1.6 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SuccessFailureCause")
	@Size(min = 0, max = 6)
	public Long successFailureCause;
	/**
	 * This parameter contains the estimated electrical loop length estimated by the VTU-R expressed in 0.1 dB at 1MHz (see O-UPDATE in section 12.2.4.2.1.2/G.993.2). The value is coded as an unsignedInt in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R in Clause 7.5.1.23.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UPBOKLER")
	@Size(min = 0, max = 1280)
	public Long upbOKLER;
	/**
	 * VTU-O estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported upstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          Note: This parameter is defined as UPBOKLE-pb in Clause 7.5.1.23.3 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UPBOKLEPb")
	@Size(min = 2047, max = 2047)
	public Long upbOKLEPb;
	/**
	 * VTU-R estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported downstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          The value of each list element is coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R-pb in Clause 7.5.1.23.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "UPBOKLERPb")
	@Size(min = 2047, max = 2047)
	public Long upbOKLERPb;
	/**
	 * UPBO downstream receiver signal level threshold.

          This parameter reports the downstream received signal level threshold value used in the alternative electrical length estimation method (ELE-M1). This parameter represents an offset from -100 dBm/Hz, and ranges from -64 dB to 0 dB in steps of 0.1 dB.

          The value is coded as a 16 bit number in the range -64 (coded as -640) to 0 dB (coded as 0) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RXTHRSHds")
	@Size(min = -640, max = 0)
	public Integer rxtHRSHds;
	/**
	 * This parameter indicates the actual active rate adaptation mode in the downstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEds in Clause 7.5.1.33.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ACTRAMODEds")
	@Size(min = 1, max = 4)
	public Long actRAMODEds;
	/**
	 * This parameter indicates the actual active rate adaptation mode in the upstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEus in Clause 7.5.1.33.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ACTRAMODEus")
	@Size(min = 1, max = 4)
	public Long actRAMODEus;
	/**
	 * This parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the downstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-ds in Clause 7.5.1.34.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ACTINPROCds")
	public Long actINPROCds;
	/**
	 * This parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the upstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-us in Clause 7.5.1.34.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "ACTINPROCus")
	public Long actINPROCus;
	/**
	 * This parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the downstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin {{param|DownstreamNoiseMargin}}.

          Note: This parameter is defined as SNRM-ROC-ds in Clause 7.5.1.35.1 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SNRMROCds")
	public Long snrMROCds;
	/**
	 * This parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the upstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin ({{param|UpstreamNoiseMargin}}).

          Note: This parameter is defined as SNRM-ROC-us in Clause 7.5.1.35.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "SNRMROCus")
	public Long snrMROCus;
	/**
	 * This parameter represents the last successful transmitted initialization state in the downstream direction in  the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastStateTransmittedDownstream")
	public Long lastStateTransmittedDownstream;
	/**
	 * This parameter represents the last successful transmitted initialization state in the upstream direction in the  last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastStateTransmittedUpstream")
	public Long lastStateTransmittedUpstream;
	/**
	 * This parameter contains the estimated electrical loop length expressed in 0.1dB at 1MHz (see O-UPDATE  in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded  as 1280) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UPBOKLE")
	@Size(min = 0, max = 1280)
	public Long upbOKLE;
	/**
	 * This parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MREFPSDds")
	public String mreFPSDds;
	/**
	 * This parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MREFPSDus")
	public String mreFPSDus;
	/**
	 * Indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LIMITMASK")
	public Long limITMASK;
	/**
	 * Indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "US0MASK")
	public Long us0MASK;
	/**
	 * Reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis  coding is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRELLISds")
	public Integer treLLISds;
	/**
	 * Reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding  is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TRELLISus")
	public Integer treLLISus;
	/**
	 * Reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTSNRMODEds")
	public Long actSNRMODEds;
	/**
	 * Reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTSNRMODEus")
	public Long actSNRMODEus;
	/**
	 * Reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined  in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VirtualNoisePSDds")
	public String virtualNoisePSDds;
	/**
	 * Reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in  G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VirtualNoisePSDus")
	public String virtualNoisePSDus;
	/**
	 * Reports the actual cyclic extension, as the value of m, in use for the connection.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 99.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ACTUALCE")
	public Long actUALCE;
	/**
	 * Signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost  pair.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LineNumber")
	@Size(min = 1)
	public Integer lineNumber;
	/**
	 * The current maximum attainable data rate upstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamMaxBitRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Kbps")
	public Long upstreamMaxBitRate;
	/**
	 * The current maximum attainable data rate downstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamMaxBitRate")
	@CWMPParameter(activeNotify = "canDeny", units = "Kbps")
	public Long downstreamMaxBitRate;
	/**
	 * The current signal-to-noise ratio margin (expressed in 0.1dB) in the upstream direction.

          Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamNoiseMargin")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1dB")
	public Integer upstreamNoiseMargin;
	/**
	 * The current signal-to-noise ratio margin (expressed in 0.1dB) in the downstream direction.

          Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamNoiseMargin")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1dB")
	public Integer downstreamNoiseMargin;
	/**
	 * {{list}} Indicates the current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRMpbus")
	@Size(max = 24)
	@XmlList
	public Collection<String> snrMpbus;
	/**
	 * {{list}} Indicates the current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNRMpbds")
	@Size(max = 24)
	@XmlList
	public Collection<String> snrMpbds;
	/**
	 * The Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU  receiver uses to determine in which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INMIATOds")
	@Size(min = 3, max = 511)
	public Long inmIATOds;
	/**
	 * The Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in  which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INMIATSds")
	@Size(min = 0, max = 7)
	public Long inmIATSds;
	/**
	 * The Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver  uses in the cluster indication process.

          Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INMCCds")
	@Size(min = 0, max = 64)
	public Long inmCCds;
	/**
	 * The Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in  the computation of the Equivalent INP.

          Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "INMINPEQMODEds")
	@Size(min = 0, max = 3)
	public Long inmINPEQMODEds;
	/**
	 * The current upstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamAttenuation")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1dB")
	public Integer upstreamAttenuation;
	/**
	 * The current downstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamAttenuation")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1dB")
	public Integer downstreamAttenuation;
	/**
	 * The current output power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UpstreamPower")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1dBmV")
	public Integer upstreamPower;
	/**
	 * The current received power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DownstreamPower")
	@CWMPParameter(activeNotify = "canDeny", units = "0.1dBmV")
	public Integer downstreamPower;
	/**
	 * xTU-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTURVendor")
	public byte[] xtuRVendor;
	/**
	 * T.35 country code of the xTU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTURCountry")
	public byte[] xtuRCountry;
	/**
	 * xTU-R T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTURANSIStd")
	public Long xtuRANSIStd;
	/**
	 * xTU-R Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTURANSIRev")
	public Long xtuRANSIRev;
	/**
	 * xTU-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTUCVendor")
	public byte[] xtuCVendor;
	/**
	 * T.35 country code of the xTU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTUCCountry")
	public byte[] xtuCCountry;
	/**
	 * xTU-C T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTUCANSIStd")
	public Long xtuCANSIStd;
	/**
	 * xTU-C Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "XTUCANSIRev")
	public Long xtuCANSIRev;
	/**
	 * This object models the DSL data gathering function at the VTU-R. This only applies to VDSL2.

        Note: see ITU-T Recommendation {{bibref|G.993.2}}.
	 */
	@XmlElement(name = "DataGathering")
	public DataGathering dataGathering;
	/**
	 * Throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * This object contains the DSL line test parameters that are available during the L0 (i.e., Showtime)  state.
	 */
	@XmlElement(name = "TestParams")
	public TestParams testParams;

	public Line() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DSL line.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DSL line.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DSL line.

          This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Line withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the enables or disables data gathering on the DSL line.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isEnableDataGathering() {
		return enableDataGathering;
	}

	/**
	 * Set the enables or disables data gathering on the DSL line.
	 *
	 * @since 2.8
	 * @param enableDataGathering the input value
	 */
	public void  setEnableDataGathering(Boolean enableDataGathering) {
		this.enableDataGathering = enableDataGathering;
	}

	/**
	 * Set the enables or disables data gathering on the DSL line.
	 *
	 * @since 2.8
	 * @param enableDataGathering the input value
	 * @return this instance
	 */
	public Line withEnableDataGathering(Boolean enableDataGathering) {
		this.enableDataGathering = enableDataGathering;
		return this;
	}

	/**
	 * Get the current operational state of the DSL line (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational state of the DSL line (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational state of the DSL line (see {{bibref|TR-181i2|Section 4.2.2}}). {{enum}}

          When {{param|Enable}} is {{false}} then {{param}} SHOULD normally be {{enum|Down}} (or {{enum|NotPresent}} or {{enum|Error}} if there is a fault condition on the interface). 

          When {{param|Enable}} is changed to {{true}} then {{param}} SHOULD change to {{enum|Up}} if and only if the interface is able to transmit and receive network traffic; it SHOULD change to {{enum|Dormant}} if and only if the interface is operable but is waiting for external actions before it can transmit and receive network traffic (and subsequently change to {{enum|Up}} if still operable when the expected actions have completed); it SHOULD change to {{enum|LowerLayerDown}} if and only if the interface is prevented from entering the {{enum|Up}} state because one or more of the interfaces beneath it is down; it SHOULD remain in the {{enum|Error}} state if there is an error or other fault condition detected on the interface; it SHOULD remain in the {{enum|NotPresent}} state if the interface has missing (typically hardware) components; it SHOULD change to {{enum|Unknown}} if the state of the interface can not be determined for some reason.

          This parameter is based on ''ifOperStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Line withStatus(String status) {
		this.status = status;
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
	public Line withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the DSL line as assigned by the CPE.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the DSL line as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the DSL line as assigned by the CPE.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public Line withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the accumulated time in seconds since the DSL line entered its current operational state.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastChange() {
		return lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the DSL line entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 */
	public void  setLastChange(Long lastChange) {
		this.lastChange = lastChange;
	}

	/**
	 * Set the accumulated time in seconds since the DSL line entered its current operational state.
	 *
	 * @since 2.0
	 * @param lastChange the input value
	 * @return this instance
	 */
	public Line withLastChange(Long lastChange) {
		this.lastChange = lastChange;
		return this;
	}

	/**
	 * Get the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLowerLayers() {
		if (this.lowerLayers == null){ this.lowerLayers=new ArrayList<>();}
		return lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
	 * @param lowerLayers the input value
	 */
	public void  setLowerLayers(Collection<String> lowerLayers) {
		this.lowerLayers = lowerLayers;
	}

	/**
	 * Set the {{list}} {{reference|an interface object that is stacked immediately below this interface object}}  See {{bibref|TR-181i2|Section 4.2.1}}.

          Note: Since {{object}} is a layer 1 interface, it is expected that {{param}} will not be used.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Line withLowerLayers(String string) {
		getLowerLayers().add(string);
		return this;
	}

	/**
	 * Get the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUpstream() {
		return upstream;
	}

	/**
	 * Set the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.0
	 * @param upstream the input value
	 */
	public void  setUpstream(Boolean upstream) {
		this.upstream = upstream;
	}

	/**
	 * Set the indicates whether the interface points towards the Internet ({{true}}) or towards End Devices ({{false}}).

          For example:

          * For an Internet Gateway Device, {{param}} will be {{true}} for all WAN interfaces and {{false}} for all LAN interfaces.

          * For a standalone WiFi Access Point that is connected via Ethernet to an Internet Gateway Device, {{param}} will be {{true}} for the Ethernet interface and {{false}} for the WiFi Radio interface.

          * For an End Device, {{param}} will be {{true}} for all interfaces.
	 *
	 * @since 2.0
	 * @param upstream the input value
	 * @return this instance
	 */
	public Line withUpstream(Boolean upstream) {
		this.upstream = upstream;
		return this;
	}

	/**
	 * Get a string identifying the version of the modem firmware currently installed for this interface. This is applicable only when the modem firmware is separable from the overall CPE software.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * Set a string identifying the version of the modem firmware currently installed for this interface. This is applicable only when the modem firmware is separable from the overall CPE software.
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 */
	public void  setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Set a string identifying the version of the modem firmware currently installed for this interface. This is applicable only when the modem firmware is separable from the overall CPE software.
	 *
	 * @since 2.0
	 * @param firmwareVersion the input value
	 * @return this instance
	 */
	public Line withFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
		return this;
	}

	/**
	 * Get the status of the DSL physical link. {{enum}}

          When {{param}} is {{enum|Up}}, {{param|Status}} is expected to be {{enum|Up|Status}}. When {{param}} is {{enum|Initializing}} or {{enum|EstablishingLink}} or {{enum|NoSignal}} or {{enum|Disabled}}, {{param|Status}} is expected to be {{enum|Down|Status}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLinkStatus() {
		return linkStatus;
	}

	/**
	 * Set the status of the DSL physical link. {{enum}}

          When {{param}} is {{enum|Up}}, {{param|Status}} is expected to be {{enum|Up|Status}}. When {{param}} is {{enum|Initializing}} or {{enum|EstablishingLink}} or {{enum|NoSignal}} or {{enum|Disabled}}, {{param|Status}} is expected to be {{enum|Down|Status}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param linkStatus the input value
	 */
	public void  setLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
	}

	/**
	 * Set the status of the DSL physical link. {{enum}}

          When {{param}} is {{enum|Up}}, {{param|Status}} is expected to be {{enum|Up|Status}}. When {{param}} is {{enum|Initializing}} or {{enum|EstablishingLink}} or {{enum|NoSignal}} or {{enum|Disabled}}, {{param|Status}} is expected to be {{enum|Down|Status}}.

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param linkStatus the input value
	 * @return this instance
	 */
	public Line withLinkStatus(String linkStatus) {
		this.linkStatus = linkStatus;
		return this;
	}

	/**
	 * Get the {{list}} List items indicate which DSL standards and recommendations are supported by the {{object}} instance. 

Enumerated value must be one of [G.992.1_Annex_A, G.992.1_Annex_B, G.992.1_Annex_C, T1.413, T1.413i2, ETSI_101_388, G.992.2, G.992.3_Annex_A, G.992.3_Annex_B, G.992.3_Annex_C, G.992.3_Annex_I, G.992.3_Annex_J, G.992.3_Annex_L, G.992.3_Annex_M, G.992.4, G.992.5_Annex_A, G.992.5_Annex_B, G.992.5_Annex_C, G.992.5_Annex_I, G.992.5_Annex_J, G.992.5_Annex_M, G.993.1, G.993.1_Annex_A, G.993.2_Annex_A, G.993.2_Annex_B, G.993.2_Annex_C]

          Note: In G.997.1, this parameter is called "xDSL Transmission system capabilities". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSE}} is supported.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getStandardsSupported() {
		if (this.standardsSupported == null){ this.standardsSupported=new ArrayList<>();}
		return standardsSupported;
	}

	/**
	 * Set the {{list}} List items indicate which DSL standards and recommendations are supported by the {{object}} instance. 

Enumerated value must be one of [G.992.1_Annex_A, G.992.1_Annex_B, G.992.1_Annex_C, T1.413, T1.413i2, ETSI_101_388, G.992.2, G.992.3_Annex_A, G.992.3_Annex_B, G.992.3_Annex_C, G.992.3_Annex_I, G.992.3_Annex_J, G.992.3_Annex_L, G.992.3_Annex_M, G.992.4, G.992.5_Annex_A, G.992.5_Annex_B, G.992.5_Annex_C, G.992.5_Annex_I, G.992.5_Annex_J, G.992.5_Annex_M, G.993.1, G.993.1_Annex_A, G.993.2_Annex_A, G.993.2_Annex_B, G.993.2_Annex_C]

          Note: In G.997.1, this parameter is called "xDSL Transmission system capabilities". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSE}} is supported.
	 *
	 * @since 2.0
	 * @param standardsSupported the input value
	 */
	public void  setStandardsSupported(Collection<String> standardsSupported) {
		this.standardsSupported = standardsSupported;
	}

	/**
	 * Set the {{list}} List items indicate which DSL standards and recommendations are supported by the {{object}} instance. 

Enumerated value must be one of [G.992.1_Annex_A, G.992.1_Annex_B, G.992.1_Annex_C, T1.413, T1.413i2, ETSI_101_388, G.992.2, G.992.3_Annex_A, G.992.3_Annex_B, G.992.3_Annex_C, G.992.3_Annex_I, G.992.3_Annex_J, G.992.3_Annex_L, G.992.3_Annex_M, G.992.4, G.992.5_Annex_A, G.992.5_Annex_B, G.992.5_Annex_C, G.992.5_Annex_I, G.992.5_Annex_J, G.992.5_Annex_M, G.993.1, G.993.1_Annex_A, G.993.2_Annex_A, G.993.2_Annex_B, G.993.2_Annex_C]

          Note: In G.997.1, this parameter is called "xDSL Transmission system capabilities". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSE}} is supported.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Line withStandardsSupported(String string) {
		getStandardsSupported().add(string);
		return this;
	}

	/**
	 * Get the this configuration parameter defines the transmission system types to be allowed by the xTU on this {{object}} instance. Each bit is 0 if not allowed or 1 if allowed, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.

          Note: This parameter is defined as xDSL Transmission system enabling (XTSE) in ITU-T G.997.1. For a full definition, see Clause 7.3.1.1.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getXtsE() {
		return xtsE;
	}

	/**
	 * Set the this configuration parameter defines the transmission system types to be allowed by the xTU on this {{object}} instance. Each bit is 0 if not allowed or 1 if allowed, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.

          Note: This parameter is defined as xDSL Transmission system enabling (XTSE) in ITU-T G.997.1. For a full definition, see Clause 7.3.1.1.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param xtsE the input value
	 */
	public void  setXtsE(byte[] xtsE) {
		this.xtsE = xtsE;
	}

	/**
	 * Set the this configuration parameter defines the transmission system types to be allowed by the xTU on this {{object}} instance. Each bit is 0 if not allowed or 1 if allowed, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.

          Note: This parameter is defined as xDSL Transmission system enabling (XTSE) in ITU-T G.997.1. For a full definition, see Clause 7.3.1.1.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param xtsE the input value
	 * @return this instance
	 */
	public Line withXtsE(byte[] xtsE) {
		this.xtsE = xtsE;
		return this;
	}

	/**
	 * Get the indicates the standard that the {{object}} instance is using for the connection.

          Note: In G.997.1, this parameter is called "xDSL Transmission system". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSUsed}} is supported.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStandardUsed() {
		return standardUsed;
	}

	/**
	 * Set the indicates the standard that the {{object}} instance is using for the connection.

          Note: In G.997.1, this parameter is called "xDSL Transmission system". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSUsed}} is supported.
	 *
	 * @since 2.0
	 * @param standardUsed the input value
	 */
	public void  setStandardUsed(String standardUsed) {
		this.standardUsed = standardUsed;
	}

	/**
	 * Set the indicates the standard that the {{object}} instance is using for the connection.

          Note: In G.997.1, this parameter is called "xDSL Transmission system". See ITU-T Recommendation {{bibref|G.997.1}}.

          This parameter is DEPRECATED because its entries are out-of-date; {{param|XTSE}} points to a current list.  Therefore its value MAY be {{empty}} if (and only if) {{param|XTSUsed}} is supported.
	 *
	 * @since 2.0
	 * @param standardUsed the input value
	 * @return this instance
	 */
	public Line withStandardUsed(String standardUsed) {
		this.standardUsed = standardUsed;
		return this;
	}

	/**
	 * Get the this parameter indicates which DSL standard and recommendation are currently in use by the {{object}} instance. Only one bit is set, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public byte[] getXtsUsed() {
		return xtsUsed;
	}

	/**
	 * Set the this parameter indicates which DSL standard and recommendation are currently in use by the {{object}} instance. Only one bit is set, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.
	 *
	 * @since 2.8
	 * @param xtsUsed the input value
	 */
	public void  setXtsUsed(byte[] xtsUsed) {
		this.xtsUsed = xtsUsed;
	}

	/**
	 * Set the this parameter indicates which DSL standard and recommendation are currently in use by the {{object}} instance. Only one bit is set, as defined for the xTU transmission system enabling (XTSE) in ITU-T G.997.1.
	 *
	 * @since 2.8
	 * @param xtsUsed the input value
	 * @return this instance
	 */
	public Line withXtsUsed(byte[] xtsUsed) {
		this.xtsUsed = xtsUsed;
		return this;
	}

	/**
	 * Get the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  {{enum}}

          Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLineEncoding() {
		return lineEncoding;
	}

	/**
	 * Set the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  {{enum}}

          Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 2.0
	 * @param lineEncoding the input value
	 */
	public void  setLineEncoding(String lineEncoding) {
		this.lineEncoding = lineEncoding;
	}

	/**
	 * Set the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  {{enum}}

          Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 2.0
	 * @param lineEncoding the input value
	 * @return this instance
	 */
	public Line withLineEncoding(String lineEncoding) {
		this.lineEncoding = lineEncoding;
		return this;
	}

	/**
	 * Get the {{list}} List items indicate which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

          Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation {{bibref|G.997.1}}.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAllowedProfiles() {
		if (this.allowedProfiles == null){ this.allowedProfiles=new ArrayList<>();}
		return allowedProfiles;
	}

	/**
	 * Set the {{list}} List items indicate which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

          Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation {{bibref|G.997.1}}.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param allowedProfiles the input value
	 */
	public void  setAllowedProfiles(Collection<String> allowedProfiles) {
		this.allowedProfiles = allowedProfiles;
	}

	/**
	 * Set the {{list}} List items indicate which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

          Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation {{bibref|G.997.1}}.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Line withAllowedProfiles(String string) {
		getAllowedProfiles().add(string);
		return this;
	}

	/**
	 * Get the indicates which VDSL2 profile is currently in use on the line.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCurrentProfile() {
		return currentProfile;
	}

	/**
	 * Set the indicates which VDSL2 profile is currently in use on the line.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param currentProfile the input value
	 */
	public void  setCurrentProfile(String currentProfile) {
		this.currentProfile = currentProfile;
	}

	/**
	 * Set the indicates which VDSL2 profile is currently in use on the line.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, its value MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param currentProfile the input value
	 * @return this instance
	 */
	public Line withCurrentProfile(String currentProfile) {
		this.currentProfile = currentProfile;
		return this;
	}

	/**
	 * Get the power management state of the line. {{enum}}

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPowerManagementState() {
		return powerManagementState;
	}

	/**
	 * Set the power management state of the line. {{enum}}

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param powerManagementState the input value
	 */
	public void  setPowerManagementState(String powerManagementState) {
		this.powerManagementState = powerManagementState;
	}

	/**
	 * Set the power management state of the line. {{enum}}

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param powerManagementState the input value
	 * @return this instance
	 */
	public Line withPowerManagementState(String powerManagementState) {
		this.powerManagementState = powerManagementState;
		return this;
	}

	/**
	 * Get the success failure cause of the initialization. An enumeration of the following integer values:

          * 0: Successful

          * 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in  an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate  for one or more bearer channels.

          * 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the  Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

          * 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode  can be selected in the G.994.1 handshaking procedure or due to a timeout.

          * 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow  detection of a peer xTU.

          * 5: Any other or unknown Initialization Failure cause.

          * 6: ITU T G.998.4 retransmission mode was not selected while RTX_MODE = FORCED or with RTX_MODE = RTX_TESTMODE.

          Note: In G.997.1, this parameter is called "Initialization success/failure cause". See Clause 7.5.1.6 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSuccessFailureCause() {
		return successFailureCause;
	}

	/**
	 * Set the success failure cause of the initialization. An enumeration of the following integer values:

          * 0: Successful

          * 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in  an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate  for one or more bearer channels.

          * 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the  Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

          * 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode  can be selected in the G.994.1 handshaking procedure or due to a timeout.

          * 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow  detection of a peer xTU.

          * 5: Any other or unknown Initialization Failure cause.

          * 6: ITU T G.998.4 retransmission mode was not selected while RTX_MODE = FORCED or with RTX_MODE = RTX_TESTMODE.

          Note: In G.997.1, this parameter is called "Initialization success/failure cause". See Clause 7.5.1.6 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param successFailureCause the input value
	 */
	public void  setSuccessFailureCause(Long successFailureCause) {
		this.successFailureCause = successFailureCause;
	}

	/**
	 * Set the success failure cause of the initialization. An enumeration of the following integer values:

          * 0: Successful

          * 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in  an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate  for one or more bearer channels.

          * 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the  Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

          * 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode  can be selected in the G.994.1 handshaking procedure or due to a timeout.

          * 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow  detection of a peer xTU.

          * 5: Any other or unknown Initialization Failure cause.

          * 6: ITU T G.998.4 retransmission mode was not selected while RTX_MODE = FORCED or with RTX_MODE = RTX_TESTMODE.

          Note: In G.997.1, this parameter is called "Initialization success/failure cause". See Clause 7.5.1.6 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param successFailureCause the input value
	 * @return this instance
	 */
	public Line withSuccessFailureCause(Long successFailureCause) {
		this.successFailureCause = successFailureCause;
		return this;
	}

	/**
	 * Get the this parameter contains the estimated electrical loop length estimated by the VTU-R expressed in 0.1 dB at 1MHz (see O-UPDATE in section 12.2.4.2.1.2/G.993.2). The value is coded as an unsignedInt in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R in Clause 7.5.1.23.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getUpbOKLER() {
		return upbOKLER;
	}

	/**
	 * Set the this parameter contains the estimated electrical loop length estimated by the VTU-R expressed in 0.1 dB at 1MHz (see O-UPDATE in section 12.2.4.2.1.2/G.993.2). The value is coded as an unsignedInt in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R in Clause 7.5.1.23.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param upbOKLER the input value
	 */
	public void  setUpbOKLER(Long upbOKLER) {
		this.upbOKLER = upbOKLER;
	}

	/**
	 * Set the this parameter contains the estimated electrical loop length estimated by the VTU-R expressed in 0.1 dB at 1MHz (see O-UPDATE in section 12.2.4.2.1.2/G.993.2). The value is coded as an unsignedInt in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R in Clause 7.5.1.23.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param upbOKLER the input value
	 * @return this instance
	 */
	public Line withUpbOKLER(Long upbOKLER) {
		this.upbOKLER = upbOKLER;
		return this;
	}

	/**
	 * Get the vtu-O estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported upstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          Note: This parameter is defined as UPBOKLE-pb in Clause 7.5.1.23.3 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getUpbOKLEPb() {
		return upbOKLEPb;
	}

	/**
	 * Set the vtu-O estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported upstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          Note: This parameter is defined as UPBOKLE-pb in Clause 7.5.1.23.3 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param upbOKLEPb the input value
	 */
	public void  setUpbOKLEPb(Long upbOKLEPb) {
		this.upbOKLEPb = upbOKLEPb;
	}

	/**
	 * Set the vtu-O estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported upstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          Note: This parameter is defined as UPBOKLE-pb in Clause 7.5.1.23.3 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param upbOKLEPb the input value
	 * @return this instance
	 */
	public Line withUpbOKLEPb(Long upbOKLEPb) {
		this.upbOKLEPb = upbOKLEPb;
		return this;
	}

	/**
	 * Get the vtu-R estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported downstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          The value of each list element is coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R-pb in Clause 7.5.1.23.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getUpbOKLERPb() {
		return upbOKLERPb;
	}

	/**
	 * Set the vtu-R estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported downstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          The value of each list element is coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R-pb in Clause 7.5.1.23.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param upbOKLERPb the input value
	 */
	public void  setUpbOKLERPb(Long upbOKLERPb) {
		this.upbOKLERPb = upbOKLERPb;
	}

	/**
	 * Set the vtu-R estimated upstream power back-off electrical length per band.

          This parameter is a vector of UPBO electrical length per-band estimates for each supported downstream band, expressed in 0.1 dB at 1 MHz (kl0) calculated by the VTU-R, based on separate measurements in the supported downstream bands. The value of each list element ranges from 0 to 128 dB in steps of 0.1 dB, with special value 204.7 which indicates that the estimate is greater than 128 dB. This parameter is required for the alternative electrical length estimation method (ELE-M1).

          The value of each list element is coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.

          Note: This parameter is defined as UPBOKLE-R-pb in Clause 7.5.1.23.4 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param upbOKLERPb the input value
	 * @return this instance
	 */
	public Line withUpbOKLERPb(Long upbOKLERPb) {
		this.upbOKLERPb = upbOKLERPb;
		return this;
	}

	/**
	 * Get the upbO downstream receiver signal level threshold.

          This parameter reports the downstream received signal level threshold value used in the alternative electrical length estimation method (ELE-M1). This parameter represents an offset from -100 dBm/Hz, and ranges from -64 dB to 0 dB in steps of 0.1 dB.

          The value is coded as a 16 bit number in the range -64 (coded as -640) to 0 dB (coded as 0) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Integer getRxtHRSHds() {
		return rxtHRSHds;
	}

	/**
	 * Set the upbO downstream receiver signal level threshold.

          This parameter reports the downstream received signal level threshold value used in the alternative electrical length estimation method (ELE-M1). This parameter represents an offset from -100 dBm/Hz, and ranges from -64 dB to 0 dB in steps of 0.1 dB.

          The value is coded as a 16 bit number in the range -64 (coded as -640) to 0 dB (coded as 0) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param rxtHRSHds the input value
	 */
	public void  setRxtHRSHds(Integer rxtHRSHds) {
		this.rxtHRSHds = rxtHRSHds;
	}

	/**
	 * Set the upbO downstream receiver signal level threshold.

          This parameter reports the downstream received signal level threshold value used in the alternative electrical length estimation method (ELE-M1). This parameter represents an offset from -100 dBm/Hz, and ranges from -64 dB to 0 dB in steps of 0.1 dB.

          The value is coded as a 16 bit number in the range -64 (coded as -640) to 0 dB (coded as 0) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param rxtHRSHds the input value
	 * @return this instance
	 */
	public Line withRxtHRSHds(Integer rxtHRSHds) {
		this.rxtHRSHds = rxtHRSHds;
		return this;
	}

	/**
	 * Get the this parameter indicates the actual active rate adaptation mode in the downstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEds in Clause 7.5.1.33.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getActRAMODEds() {
		return actRAMODEds;
	}

	/**
	 * Set the this parameter indicates the actual active rate adaptation mode in the downstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEds in Clause 7.5.1.33.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actRAMODEds the input value
	 */
	public void  setActRAMODEds(Long actRAMODEds) {
		this.actRAMODEds = actRAMODEds;
	}

	/**
	 * Set the this parameter indicates the actual active rate adaptation mode in the downstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEds in Clause 7.5.1.33.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actRAMODEds the input value
	 * @return this instance
	 */
	public Line withActRAMODEds(Long actRAMODEds) {
		this.actRAMODEds = actRAMODEds;
		return this;
	}

	/**
	 * Get the this parameter indicates the actual active rate adaptation mode in the upstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEus in Clause 7.5.1.33.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getActRAMODEus() {
		return actRAMODEus;
	}

	/**
	 * Set the this parameter indicates the actual active rate adaptation mode in the upstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEus in Clause 7.5.1.33.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actRAMODEus the input value
	 */
	public void  setActRAMODEus(Long actRAMODEus) {
		this.actRAMODEus = actRAMODEus;
	}

	/**
	 * Set the this parameter indicates the actual active rate adaptation mode in the upstream direction.

          * If {{param}} equals 1, the link is operating in RA-MODE 1 (MANUAL).

          * If {{param}} equals 2, the link is operating in RA-MODE 2 (AT_INIT).

          * If {{param}} equals 3, the link is operating in RA-MODE 3 (DYNAMIC).

          * If {{param}} equals 4, the link is operating in RA-MODE 4 (DYNAMIC with SOS).

          Note: This parameter is defined as ACT-RA-MODEus in Clause 7.5.1.33.2 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actRAMODEus the input value
	 * @return this instance
	 */
	public Line withActRAMODEus(Long actRAMODEus) {
		this.actRAMODEus = actRAMODEus;
		return this;
	}

	/**
	 * Get the this parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the downstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-ds in Clause 7.5.1.34.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getActINPROCds() {
		return actINPROCds;
	}

	/**
	 * Set the this parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the downstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-ds in Clause 7.5.1.34.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actINPROCds the input value
	 */
	public void  setActINPROCds(Long actINPROCds) {
		this.actINPROCds = actINPROCds;
	}

	/**
	 * Set the this parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the downstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-ds in Clause 7.5.1.34.1 of ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actINPROCds the input value
	 * @return this instance
	 */
	public Line withActINPROCds(Long actINPROCds) {
		this.actINPROCds = actINPROCds;
		return this;
	}

	/**
	 * Get the this parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the upstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-us in Clause 7.5.1.34.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getActINPROCus() {
		return actINPROCus;
	}

	/**
	 * Set the this parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the upstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-us in Clause 7.5.1.34.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actINPROCus the input value
	 */
	public void  setActINPROCus(Long actINPROCus) {
		this.actINPROCus = actINPROCus;
	}

	/**
	 * Set the this parameter reports the actual impulse noise protection (INP) of the robust overhead channel (ROC) in the upstream direction. The format and usage is identical to the channel status parameter {{param|#.Channel.{i}.ACTINP}}.

          Note: This parameter is defined as ACTINP-ROC-us in Clause 7.5.1.34.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param actINPROCus the input value
	 * @return this instance
	 */
	public Line withActINPROCus(Long actINPROCus) {
		this.actINPROCus = actINPROCus;
		return this;
	}

	/**
	 * Get the this parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the downstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin {{param|DownstreamNoiseMargin}}.

          Note: This parameter is defined as SNRM-ROC-ds in Clause 7.5.1.35.1 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSnrMROCds() {
		return snrMROCds;
	}

	/**
	 * Set the this parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the downstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin {{param|DownstreamNoiseMargin}}.

          Note: This parameter is defined as SNRM-ROC-ds in Clause 7.5.1.35.1 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param snrMROCds the input value
	 */
	public void  setSnrMROCds(Long snrMROCds) {
		this.snrMROCds = snrMROCds;
	}

	/**
	 * Set the this parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the downstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin {{param|DownstreamNoiseMargin}}.

          Note: This parameter is defined as SNRM-ROC-ds in Clause 7.5.1.35.1 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param snrMROCds the input value
	 * @return this instance
	 */
	public Line withSnrMROCds(Long snrMROCds) {
		this.snrMROCds = snrMROCds;
		return this;
	}

	/**
	 * Get the this parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the upstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin ({{param|UpstreamNoiseMargin}}).

          Note: This parameter is defined as SNRM-ROC-us in Clause 7.5.1.35.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Long getSnrMROCus() {
		return snrMROCus;
	}

	/**
	 * Set the this parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the upstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin ({{param|UpstreamNoiseMargin}}).

          Note: This parameter is defined as SNRM-ROC-us in Clause 7.5.1.35.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param snrMROCus the input value
	 */
	public void  setSnrMROCus(Long snrMROCus) {
		this.snrMROCus = snrMROCus;
	}

	/**
	 * Set the this parameter reports the actual signal-to-noise margin of the robust overhead channel (ROC) in the upstream direction (expressed in 0.1 dB). The format is identical to the format of the line status parameter SNRM margin ({{param|UpstreamNoiseMargin}}).

          Note: This parameter is defined as SNRM-ROC-us in Clause 7.5.1.35.2 ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.8
	 * @param snrMROCus the input value
	 * @return this instance
	 */
	public Line withSnrMROCus(Long snrMROCus) {
		this.snrMROCus = snrMROCus;
		return this;
	}

	/**
	 * Get the this parameter represents the last successful transmitted initialization state in the downstream direction in  the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastStateTransmittedDownstream() {
		return lastStateTransmittedDownstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the downstream direction in  the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param lastStateTransmittedDownstream the input value
	 */
	public void  setLastStateTransmittedDownstream(Long lastStateTransmittedDownstream) {
		this.lastStateTransmittedDownstream = lastStateTransmittedDownstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the downstream direction in  the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param lastStateTransmittedDownstream the input value
	 * @return this instance
	 */
	public Line withLastStateTransmittedDownstream(Long lastStateTransmittedDownstream) {
		this.lastStateTransmittedDownstream = lastStateTransmittedDownstream;
		return this;
	}

	/**
	 * Get the this parameter represents the last successful transmitted initialization state in the upstream direction in the  last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastStateTransmittedUpstream() {
		return lastStateTransmittedUpstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the upstream direction in the  last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param lastStateTransmittedUpstream the input value
	 */
	public void  setLastStateTransmittedUpstream(Long lastStateTransmittedUpstream) {
		this.lastStateTransmittedUpstream = lastStateTransmittedUpstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the upstream direction in the  last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are  counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with  the xDSL Transmission System.

          This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the  line.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param lastStateTransmittedUpstream the input value
	 * @return this instance
	 */
	public Line withLastStateTransmittedUpstream(Long lastStateTransmittedUpstream) {
		this.lastStateTransmittedUpstream = lastStateTransmittedUpstream;
		return this;
	}

	/**
	 * Get the this parameter contains the estimated electrical loop length expressed in 0.1dB at 1MHz (see O-UPDATE  in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded  as 1280) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUpbOKLE() {
		return upbOKLE;
	}

	/**
	 * Set the this parameter contains the estimated electrical loop length expressed in 0.1dB at 1MHz (see O-UPDATE  in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded  as 1280) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param upbOKLE the input value
	 */
	public void  setUpbOKLE(Long upbOKLE) {
		this.upbOKLE = upbOKLE;
	}

	/**
	 * Set the this parameter contains the estimated electrical loop length expressed in 0.1dB at 1MHz (see O-UPDATE  in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded  as 1280) in steps of 0.1 dB.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param upbOKLE the input value
	 * @return this instance
	 */
	public Line withUpbOKLE(Long upbOKLE) {
		this.upbOKLE = upbOKLE;
		return this;
	}

	/**
	 * Get the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMreFPSDds() {
		return mreFPSDds;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param mreFPSDds the input value
	 */
	public void  setMreFPSDds(String mreFPSDds) {
		this.mreFPSDds = mreFPSDds;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param mreFPSDds the input value
	 * @return this instance
	 */
	public Line withMreFPSDds(String mreFPSDds) {
		this.mreFPSDds = mreFPSDds;
		return this;
	}

	/**
	 * Get the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getMreFPSDus() {
		return mreFPSDus;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param mreFPSDus the input value
	 */
	public void  setMreFPSDus(String mreFPSDus) {
		this.mreFPSDus = mreFPSDus;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of  G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196  bytes for Base64 encoding).

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param mreFPSDus the input value
	 * @return this instance
	 */
	public Line withMreFPSDus(String mreFPSDus) {
		this.mreFPSDus = mreFPSDus;
		return this;
	}

	/**
	 * Get the indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLimITMASK() {
		return limITMASK;
	}

	/**
	 * Set the indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param limITMASK the input value
	 */
	public void  setLimITMASK(Long limITMASK) {
		this.limITMASK = limITMASK;
	}

	/**
	 * Set the indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param limITMASK the input value
	 * @return this instance
	 */
	public Line withLimITMASK(Long limITMASK) {
		this.limITMASK = limITMASK;
		return this;
	}

	/**
	 * Get the indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUs0MASK() {
		return us0MASK;
	}

	/**
	 * Set the indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param us0MASK the input value
	 */
	public void  setUs0MASK(Long us0MASK) {
		this.us0MASK = us0MASK;
	}

	/**
	 * Set the indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T  Recommendation G.997.1.

          Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to  0.

          Note: See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param us0MASK the input value
	 * @return this instance
	 */
	public Line withUs0MASK(Long us0MASK) {
		this.us0MASK = us0MASK;
		return this;
	}

	/**
	 * Get the reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis  coding is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTreLLISds() {
		return treLLISds;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis  coding is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param treLLISds the input value
	 */
	public void  setTreLLISds(Integer treLLISds) {
		this.treLLISds = treLLISds;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis  coding is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param treLLISds the input value
	 * @return this instance
	 */
	public Line withTreLLISds(Integer treLLISds) {
		this.treLLISds = treLLISds;
		return this;
	}

	/**
	 * Get the reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding  is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getTreLLISus() {
		return treLLISus;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding  is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param treLLISus the input value
	 */
	public void  setTreLLISus(Integer treLLISus) {
		this.treLLISus = treLLISus;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding  is in use, and a value of 0 indicates that the trellis is disabled.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to -1.
	 *
	 * @since 2.0
	 * @param treLLISus the input value
	 * @return this instance
	 */
	public Line withTreLLISus(Integer treLLISus) {
		this.treLLISus = treLLISus;
		return this;
	}

	/**
	 * Get the reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getActSNRMODEds() {
		return actSNRMODEds;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param actSNRMODEds the input value
	 */
	public void  setActSNRMODEds(Long actSNRMODEds) {
		this.actSNRMODEds = actSNRMODEds;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param actSNRMODEds the input value
	 * @return this instance
	 */
	public Line withActSNRMODEds(Long actSNRMODEds) {
		this.actSNRMODEds = actSNRMODEds;
		return this;
	}

	/**
	 * Get the reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getActSNRMODEus() {
		return actSNRMODEus;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param actSNRMODEus the input value
	 */
	public void  setActSNRMODEus(Long actSNRMODEus) {
		this.actSNRMODEus = actSNRMODEus;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1  indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 0.
	 *
	 * @since 2.0
	 * @param actSNRMODEus the input value
	 * @return this instance
	 */
	public Line withActSNRMODEus(Long actSNRMODEus) {
		this.actSNRMODEus = actSNRMODEus;
		return this;
	}

	/**
	 * Get the reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined  in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVirtualNoisePSDds() {
		return virtualNoisePSDds;
	}

	/**
	 * Set the reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined  in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 * @param virtualNoisePSDds the input value
	 */
	public void  setVirtualNoisePSDds(String virtualNoisePSDds) {
		this.virtualNoisePSDds = virtualNoisePSDds;
	}

	/**
	 * Set the reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined  in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 * @param virtualNoisePSDds the input value
	 * @return this instance
	 */
	public Line withVirtualNoisePSDds(String virtualNoisePSDds) {
		this.virtualNoisePSDds = virtualNoisePSDds;
		return this;
	}

	/**
	 * Get the reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in  G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVirtualNoisePSDus() {
		return virtualNoisePSDus;
	}

	/**
	 * Set the reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in  G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 * @param virtualNoisePSDus the input value
	 */
	public void  setVirtualNoisePSDus(String virtualNoisePSDus) {
		this.virtualNoisePSDus = virtualNoisePSDus;
	}

	/**
	 * Set the reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in  G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

          See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value of  this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 2.0
	 * @param virtualNoisePSDus the input value
	 * @return this instance
	 */
	public Line withVirtualNoisePSDus(String virtualNoisePSDus) {
		this.virtualNoisePSDus = virtualNoisePSDus;
		return this;
	}

	/**
	 * Get the reports the actual cyclic extension, as the value of m, in use for the connection.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 99.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getActUALCE() {
		return actUALCE;
	}

	/**
	 * Set the reports the actual cyclic extension, as the value of m, in use for the connection.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 99.
	 *
	 * @since 2.0
	 * @param actUALCE the input value
	 */
	public void  setActUALCE(Long actUALCE) {
		this.actUALCE = actUALCE;
	}

	/**
	 * Set the reports the actual cyclic extension, as the value of m, in use for the connection.  

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}. For a multimode device operating in a mode in which this parameter does not apply, the value  of this parameter SHOULD be set to 99.
	 *
	 * @since 2.0
	 * @param actUALCE the input value
	 * @return this instance
	 */
	public Line withActUALCE(Long actUALCE) {
		this.actUALCE = actUALCE;
		return this;
	}

	/**
	 * Get the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost  pair.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLineNumber() {
		return lineNumber;
	}

	/**
	 * Set the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost  pair.
	 *
	 * @since 2.0
	 * @param lineNumber the input value
	 */
	public void  setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	/**
	 * Set the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost  pair.
	 *
	 * @since 2.0
	 * @param lineNumber the input value
	 * @return this instance
	 */
	public Line withLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}

	/**
	 * Get the current maximum attainable data rate upstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUpstreamMaxBitRate() {
		return upstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate upstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param upstreamMaxBitRate the input value
	 */
	public void  setUpstreamMaxBitRate(Long upstreamMaxBitRate) {
		this.upstreamMaxBitRate = upstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate upstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param upstreamMaxBitRate the input value
	 * @return this instance
	 */
	public Line withUpstreamMaxBitRate(Long upstreamMaxBitRate) {
		this.upstreamMaxBitRate = upstreamMaxBitRate;
		return this;
	}

	/**
	 * Get the current maximum attainable data rate downstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDownstreamMaxBitRate() {
		return downstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate downstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param downstreamMaxBitRate the input value
	 */
	public void  setDownstreamMaxBitRate(Long downstreamMaxBitRate) {
		this.downstreamMaxBitRate = downstreamMaxBitRate;
	}

	/**
	 * Set the current maximum attainable data rate downstream (expressed in Kbps).

          Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param downstreamMaxBitRate the input value
	 * @return this instance
	 */
	public Line withDownstreamMaxBitRate(Long downstreamMaxBitRate) {
		this.downstreamMaxBitRate = downstreamMaxBitRate;
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio margin (expressed in 0.1dB) in the upstream direction.

          Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getUpstreamNoiseMargin() {
		return upstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1dB) in the upstream direction.

          Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param upstreamNoiseMargin the input value
	 */
	public void  setUpstreamNoiseMargin(Integer upstreamNoiseMargin) {
		this.upstreamNoiseMargin = upstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1dB) in the upstream direction.

          Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param upstreamNoiseMargin the input value
	 * @return this instance
	 */
	public Line withUpstreamNoiseMargin(Integer upstreamNoiseMargin) {
		this.upstreamNoiseMargin = upstreamNoiseMargin;
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio margin (expressed in 0.1dB) in the downstream direction.

          Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDownstreamNoiseMargin() {
		return downstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1dB) in the downstream direction.

          Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param downstreamNoiseMargin the input value
	 */
	public void  setDownstreamNoiseMargin(Integer downstreamNoiseMargin) {
		this.downstreamNoiseMargin = downstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1dB) in the downstream direction.

          Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param downstreamNoiseMargin the input value
	 * @return this instance
	 */
	public Line withDownstreamNoiseMargin(Integer downstreamNoiseMargin) {
		this.downstreamNoiseMargin = downstreamNoiseMargin;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSnrMpbus() {
		if (this.snrMpbus == null){ this.snrMpbus=new ArrayList<>();}
		return snrMpbus;
	}

	/**
	 * Set the {{list}} Indicates the current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param snrMpbus the input value
	 */
	public void  setSnrMpbus(Collection<String> snrMpbus) {
		this.snrMpbus = snrMpbus;
	}

	/**
	 * Set the {{list}} Indicates the current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Line withSnrMpbus(String string) {
		getSnrMpbus().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSnrMpbds() {
		if (this.snrMpbds == null){ this.snrMpbds=new ArrayList<>();}
		return snrMpbds;
	}

	/**
	 * Set the {{list}} Indicates the current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param snrMpbds the input value
	 */
	public void  setSnrMpbds(Collection<String> snrMpbds) {
		this.snrMpbds = snrMpbds;
	}

	/**
	 * Set the {{list}} Indicates the current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

          Note:  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Line withSnrMpbds(String string) {
		getSnrMpbds().add(string);
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU  receiver uses to determine in which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInmIATOds() {
		return inmIATOds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU  receiver uses to determine in which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmIATOds the input value
	 */
	public void  setInmIATOds(Long inmIATOds) {
		this.inmIATOds = inmIATOds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU  receiver uses to determine in which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmIATOds the input value
	 * @return this instance
	 */
	public Line withInmIATOds(Long inmIATOds) {
		this.inmIATOds = inmIATOds;
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in  which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInmIATSds() {
		return inmIATSds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in  which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmIATSds the input value
	 */
	public void  setInmIATSds(Long inmIATSds) {
		this.inmIATSds = inmIATSds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in  which bin of the IAT histogram the IAT is reported.

          Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmIATSds the input value
	 * @return this instance
	 */
	public Line withInmIATSds(Long inmIATSds) {
		this.inmIATSds = inmIATSds;
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver  uses in the cluster indication process.

          Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInmCCds() {
		return inmCCds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver  uses in the cluster indication process.

          Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmCCds the input value
	 */
	public void  setInmCCds(Long inmCCds) {
		this.inmCCds = inmCCds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver  uses in the cluster indication process.

          Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmCCds the input value
	 * @return this instance
	 */
	public Line withInmCCds(Long inmCCds) {
		this.inmCCds = inmCCds;
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in  the computation of the Equivalent INP.

          Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInmINPEQMODEds() {
		return inmINPEQMODEds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in  the computation of the Equivalent INP.

          Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmINPEQMODEds the input value
	 */
	public void  setInmINPEQMODEds(Long inmINPEQMODEds) {
		this.inmINPEQMODEds = inmINPEQMODEds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in  the computation of the Equivalent INP.

          Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param inmINPEQMODEds the input value
	 * @return this instance
	 */
	public Line withInmINPEQMODEds(Long inmINPEQMODEds) {
		this.inmINPEQMODEds = inmINPEQMODEds;
		return this;
	}

	/**
	 * Get the current upstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getUpstreamAttenuation() {
		return upstreamAttenuation;
	}

	/**
	 * Set the current upstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param upstreamAttenuation the input value
	 */
	public void  setUpstreamAttenuation(Integer upstreamAttenuation) {
		this.upstreamAttenuation = upstreamAttenuation;
	}

	/**
	 * Set the current upstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param upstreamAttenuation the input value
	 * @return this instance
	 */
	public Line withUpstreamAttenuation(Integer upstreamAttenuation) {
		this.upstreamAttenuation = upstreamAttenuation;
		return this;
	}

	/**
	 * Get the current downstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDownstreamAttenuation() {
		return downstreamAttenuation;
	}

	/**
	 * Set the current downstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param downstreamAttenuation the input value
	 */
	public void  setDownstreamAttenuation(Integer downstreamAttenuation) {
		this.downstreamAttenuation = downstreamAttenuation;
	}

	/**
	 * Set the current downstream signal loss (expressed in 0.1dB).
	 *
	 * @since 2.0
	 * @param downstreamAttenuation the input value
	 * @return this instance
	 */
	public Line withDownstreamAttenuation(Integer downstreamAttenuation) {
		this.downstreamAttenuation = downstreamAttenuation;
		return this;
	}

	/**
	 * Get the current output power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getUpstreamPower() {
		return upstreamPower;
	}

	/**
	 * Set the current output power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 * @param upstreamPower the input value
	 */
	public void  setUpstreamPower(Integer upstreamPower) {
		this.upstreamPower = upstreamPower;
	}

	/**
	 * Set the current output power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 * @param upstreamPower the input value
	 * @return this instance
	 */
	public Line withUpstreamPower(Integer upstreamPower) {
		this.upstreamPower = upstreamPower;
		return this;
	}

	/**
	 * Get the current received power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDownstreamPower() {
		return downstreamPower;
	}

	/**
	 * Set the current received power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 * @param downstreamPower the input value
	 */
	public void  setDownstreamPower(Integer downstreamPower) {
		this.downstreamPower = downstreamPower;
	}

	/**
	 * Set the current received power at the CPE's DSL line (expressed in 0.1dBmV).
	 *
	 * @since 2.0
	 * @param downstreamPower the input value
	 * @return this instance
	 */
	public Line withDownstreamPower(Integer downstreamPower) {
		this.downstreamPower = downstreamPower;
		return this;
	}

	/**
	 * Get the xtu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getXtuRVendor() {
		return xtuRVendor;
	}

	/**
	 * Set the xtu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param xtuRVendor the input value
	 */
	public void  setXtuRVendor(byte[] xtuRVendor) {
		this.xtuRVendor = xtuRVendor;
	}

	/**
	 * Set the xtu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param xtuRVendor the input value
	 * @return this instance
	 */
	public Line withXtuRVendor(byte[] xtuRVendor) {
		this.xtuRVendor = xtuRVendor;
		return this;
	}

	/**
	 * Get the t.35 country code of the xTU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getXtuRCountry() {
		return xtuRCountry;
	}

	/**
	 * Set the t.35 country code of the xTU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param xtuRCountry the input value
	 */
	public void  setXtuRCountry(byte[] xtuRCountry) {
		this.xtuRCountry = xtuRCountry;
	}

	/**
	 * Set the t.35 country code of the xTU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".

          Note: In G.997.1, this parameter is called "xTU-R G.994.1 Vendor ID". See ITU-T Recommendation {{bibref|G.997.1}}.
	 *
	 * @since 2.0
	 * @param xtuRCountry the input value
	 * @return this instance
	 */
	public Line withXtuRCountry(byte[] xtuRCountry) {
		this.xtuRCountry = xtuRCountry;
		return this;
	}

	/**
	 * Get the xtu-R T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuRANSIStd() {
		return xtuRANSIStd;
	}

	/**
	 * Set the xtu-R T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuRANSIStd the input value
	 */
	public void  setXtuRANSIStd(Long xtuRANSIStd) {
		this.xtuRANSIStd = xtuRANSIStd;
	}

	/**
	 * Set the xtu-R T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuRANSIStd the input value
	 * @return this instance
	 */
	public Line withXtuRANSIStd(Long xtuRANSIStd) {
		this.xtuRANSIStd = xtuRANSIStd;
		return this;
	}

	/**
	 * Get the xtu-R Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuRANSIRev() {
		return xtuRANSIRev;
	}

	/**
	 * Set the xtu-R Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuRANSIRev the input value
	 */
	public void  setXtuRANSIRev(Long xtuRANSIRev) {
		this.xtuRANSIRev = xtuRANSIRev;
	}

	/**
	 * Set the xtu-R Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuRANSIRev the input value
	 * @return this instance
	 */
	public Line withXtuRANSIRev(Long xtuRANSIRev) {
		this.xtuRANSIRev = xtuRANSIRev;
		return this;
	}

	/**
	 * Get the xtu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getXtuCVendor() {
		return xtuCVendor;
	}

	/**
	 * Set the xtu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".
	 *
	 * @since 2.0
	 * @param xtuCVendor the input value
	 */
	public void  setXtuCVendor(byte[] xtuCVendor) {
		this.xtuCVendor = xtuCVendor;
	}

	/**
	 * Set the xtu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "00000000".
	 *
	 * @since 2.0
	 * @param xtuCVendor the input value
	 * @return this instance
	 */
	public Line withXtuCVendor(byte[] xtuCVendor) {
		this.xtuCVendor = xtuCVendor;
		return this;
	}

	/**
	 * Get the t.35 country code of the xTU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getXtuCCountry() {
		return xtuCCountry;
	}

	/**
	 * Set the t.35 country code of the xTU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".
	 *
	 * @since 2.0
	 * @param xtuCCountry the input value
	 */
	public void  setXtuCCountry(byte[] xtuCCountry) {
		this.xtuCCountry = xtuCCountry;
	}

	/**
	 * Set the t.35 country code of the xTU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

          Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is  available, it MUST have the value "0000".
	 *
	 * @since 2.0
	 * @param xtuCCountry the input value
	 * @return this instance
	 */
	public Line withXtuCCountry(byte[] xtuCCountry) {
		this.xtuCCountry = xtuCCountry;
		return this;
	}

	/**
	 * Get the xtu-C T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuCANSIStd() {
		return xtuCANSIStd;
	}

	/**
	 * Set the xtu-C T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuCANSIStd the input value
	 */
	public void  setXtuCANSIStd(Long xtuCANSIStd) {
		this.xtuCANSIStd = xtuCANSIStd;
	}

	/**
	 * Set the xtu-C T1.413 Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuCANSIStd the input value
	 * @return this instance
	 */
	public Line withXtuCANSIStd(Long xtuCANSIStd) {
		this.xtuCANSIStd = xtuCANSIStd;
		return this;
	}

	/**
	 * Get the xtu-C Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getXtuCANSIRev() {
		return xtuCANSIRev;
	}

	/**
	 * Set the xtu-C Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuCANSIRev the input value
	 */
	public void  setXtuCANSIRev(Long xtuCANSIRev) {
		this.xtuCANSIRev = xtuCANSIRev;
	}

	/**
	 * Set the xtu-C Vendor Revision Number as defined in T1.413 Issue 2.

          When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 2.0
	 * @param xtuCANSIRev the input value
	 * @return this instance
	 */
	public Line withXtuCANSIRev(Long xtuCANSIRev) {
		this.xtuCANSIRev = xtuCANSIRev;
		return this;
	}

	/**
	 * Get the this object models the DSL data gathering function at the VTU-R. This only applies to VDSL2.

        Note: see ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @return the value
	 */
	public DataGathering getDataGathering() {
		return dataGathering;
	}

	/**
	 * Set the this object models the DSL data gathering function at the VTU-R. This only applies to VDSL2.

        Note: see ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @param dataGathering the input value
	 */
	public void  setDataGathering(DataGathering dataGathering) {
		this.dataGathering = dataGathering;
	}

	/**
	 * Set the this object models the DSL data gathering function at the VTU-R. This only applies to VDSL2.

        Note: see ITU-T Recommendation {{bibref|G.993.2}}.
	 *
	 * @param dataGathering the input value
	 * @return this instance
	 */
	public Line withDataGathering(DataGathering dataGathering) {
		this.dataGathering = dataGathering;
		return this;
	}

	/**
	 * Get the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the throughput statistics for this interface.

        The CPE MUST reset the interface's Stats parameters (unless otherwise stated in individual object or parameter descriptions) either when the interface becomes operationally down due to a previous administrative down (i.e. the interface's {{param|#.Status}} parameter transitions to a down state after the interface is disabled) or when the interface becomes administratively up (i.e. the interface's {{param|#.Enable}} parameter transitions from {{false}} to {{true}}). Administrative and operational interface status is discussed in {{bibref|TR-181i2|section 4.2.2}}.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Line withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the this object contains the DSL line test parameters that are available during the L0 (i.e., Showtime)  state.
	 *
	 * @return the value
	 */
	public TestParams getTestParams() {
		return testParams;
	}

	/**
	 * Set the this object contains the DSL line test parameters that are available during the L0 (i.e., Showtime)  state.
	 *
	 * @param testParams the input value
	 */
	public void  setTestParams(TestParams testParams) {
		this.testParams = testParams;
	}

	/**
	 * Set the this object contains the DSL line test parameters that are available during the L0 (i.e., Showtime)  state.
	 *
	 * @param testParams the input value
	 * @return this instance
	 */
	public Line withTestParams(TestParams testParams) {
		this.testParams = testParams;
		return this;
	}

	//</editor-fold>

}