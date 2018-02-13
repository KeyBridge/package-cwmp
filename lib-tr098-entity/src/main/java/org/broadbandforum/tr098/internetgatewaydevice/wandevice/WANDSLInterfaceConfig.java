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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice;

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
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wandslinterfaceconfig.Stats;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wandslinterfaceconfig.TestParams;

	/**
	 * This object models physical layer properties specific to a single physical connection of a DSL modem used for Internet access on a CPE.  This object is required for a CPE with a DSL modem WAN interface, and is exclusive of any other ''WAN*InterfaceConfig'' object within a given ''WANDevice'' instance.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANDSLInterfaceConfig.")
@XmlRootElement(name = "WANDSLInterfaceConfig")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANDSLInterfaceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANDSLInterfaceConfig {

	/**
	 * Enables or disables the link.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Indicates which link encapsulation standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LinkEncapsulationSupported")
	@XmlList
	public Collection<String> linkEncapsulationSupported;
	/**
	 * Indicates the link encapsulation standard requested by the B-NT.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LinkEncapsulationRequested")
	@CWMPParameter(access = "readWrite")
	public String linkEncapsulationRequested;
	/**
	 * Indicates the link encapsulation standard that the B-NT is using for the connection.  {{enum}}

When the standard identifies ATM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANDSLLinkConfig}} object MUST be used.

When the standard identifies PTM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPTMLinkConfig}} object MUST be used.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LinkEncapsulationUsed")
	public String linkEncapsulationUsed;
	/**
	 * Indicates the type of modulation used on the connection.  {{enum}}

This parameter, which was inherited from WANDSLLinkConfig, is DEPRECATED because it is in general not clear which standards correspond to which of the the above enumerated values.

It is RECOMMENDED that the {{param|StandardUsed}} parameter be used to indicate which standard is in use.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ModulationType")
	public String modulationType;
	/**
	 * Indicates which DSL standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "StandardsSupported")
	@XmlList
	public Collection<String> standardsSupported;
	/**
	 * Indicates the standard that the B-NT is using for the connection.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "StandardUsed")
	public String standardUsed;
	/**
	 * The line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LineEncoding")
	public String lineEncoding;
	/**
	 * Indicates which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation G.997.1.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "AllowedProfiles")
	@XmlList
	public Collection<String> allowedProfiles;
	/**
	 * Indicates which VDSL2 profile is currently in use on the line.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "CurrentProfile")
	public String currentProfile;
	/**
	 * The power management state of the line.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "PowerManagementState")
	public String powerManagementState;
	/**
	 * The success failure cause of the initialization. An enumeration of the following integer values:

* 0: Successful

* 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate for one or more bearer channels.

* 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

* 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode can be selected in the G.994.1 handshaking procedure or due to a timeout..

* 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow detection of a peer xTU.

* 5: Any other or unknown Initialization Failure cause.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SuccessFailureCause")
	@Size(min = 0, max = 5)
	public Long successFailureCause;
	/**
	 * This parameter represents the last successful transmitted initialization state in the downstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LastStateTransmittedDownstream")
	public Long lastStateTransmittedDownstream;
	/**
	 * This parameter represents the last successful transmitted initialization state in the upstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LastStateTransmittedUpstream")
	public Long lastStateTransmittedUpstream;
	/**
	 * This parameter contains the estimated electrical loop length expressed in dB at 1MHz, kle (see O-UPDATE in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "UPBOKLE")
	@Size(min = 0, max = 1280)
	public Long upbOKLE;
	/**
	 * This parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MREFPSDds")
	public String mreFPSDds;
	/**
	 * This parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "MREFPSDus")
	public String mreFPSDus;
	/**
	 * Indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LIMITMASK")
	public Long limITMASK;
	/**
	 * Indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "US0MASK")
	public Long us0MASK;
	/**
	 * Indicates whether the data path is fast (lower latency) or interleaved (lower error rate).  {{enum}}

Note1:  This parameter is only applicable to G.992.1.

Note2:  For an ADSL1-capable multimode device operating in a mode other than ADSL1, the value of this parameter SHOULD be set to {{enum|None}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DataPath")
	public String dataPath;
	/**
	 * ADSL1 Interleaved depth.  This variable is only applicable to ADSL1 and only if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "InterleaveDepth")
	public Long interleaveDepth;
	/**
	 * Reports the index of the latency path supporting the bearer channel.  For single-latency connections, LPATH = 0.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LPATH")
	public Long lpaTH;
	/**
	 * Reports the interleaver depth D for the latency path indicated in LPATH. 

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "INTLVDEPTH")
	public Integer intLVDEPTH;
	/**
	 * Reports the interleaver block length in use on the latency path indicated in LPATH.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "INTLVBLOCK")
	public Integer intLVBLOCK;
	/**
	 * Reports the actual delay, in milliseconds, of the latency path due to interleaving. 

Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ActualInterleavingDelay")
	public Long actualInterleavingDelay;
	/**
	 * Reports the actual impulse noise protection (INP) provided by the latency path indicated in LPATH.  The value is the actual INP in the L0 (i.e., Showtime) state.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ACTINP")
	public Integer actINP;
	/**
	 * Reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.  Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding capabilities of receiver).

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "INPREPORT")
	public Boolean inpREPORT;
	/**
	 * Reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "NFEC")
	public Integer nfeC;
	/**
	 * Reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "RFEC")
	public Integer rfeC;
	/**
	 * Reports the number of bits per symbol assigned to the latency path indicated in LPATH.  This value does not include overhead due to trellis coding.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "LSYMB")
	public Integer lsyMB;
	/**
	 * Reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TRELLISds")
	public Integer treLLISds;
	/**
	 * Reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "TRELLISus")
	public Integer treLLISus;
	/**
	 * Reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ACTSNRMODEds")
	public Long actSNRMODEds;
	/**
	 * Reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ACTSNRMODEus")
	public Long actSNRMODEus;
	/**
	 * Reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VirtualNoisePSDds")
	public String virtualNoisePSDds;
	/**
	 * Reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VirtualNoisePSDus")
	public String virtualNoisePSDus;
	/**
	 * Reports the actual cyclic extension, as the value of m, in use for the connection.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 99.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "ACTUALCE")
	public Long actUALCE;
	/**
	 * Signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LineNumber")
	@Size(min = 1)
	public Integer lineNumber;
	/**
	 * The current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamCurrRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long upstreamCurrRate;
	/**
	 * The current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamCurrRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long downstreamCurrRate;
	/**
	 * The current attainable rate (expressed in Kbps) of the upstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamMaxRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long upstreamMaxRate;
	/**
	 * The current attainable rate (expressed in Kbps) of the downstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamMaxRate")
	@CWMPParameter(activeNotify = "canDeny")
	public Long downstreamMaxRate;
	/**
	 * The current signal-to-noise ratio margin (expressed in 0.1 dB) in the upstream direction.

Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamNoiseMargin")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer upstreamNoiseMargin;
	/**
	 * The current signal-to-noise ratio margin (expressed in 0.1 dB) in the downstream direction.

Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamNoiseMargin")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer downstreamNoiseMargin;
	/**
	 * The current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SNRMpbus")
	@Size(max = 24)
	@XmlList
	public Collection<String> snrMpbus;
	/**
	 * The current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "SNRMpbds")
	@Size(max = 24)
	@XmlList
	public Collection<String> snrMpbds;
	/**
	 * The Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "INMIATOds")
	@Size(min = 3, max = 511)
	public Long inmIATOds;
	/**
	 * The Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "INMIATSds")
	@Size(min = 0, max = 7)
	public Long inmIATSds;
	/**
	 * The Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver uses in the cluster indication process.

Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "INMCCds")
	@Size(min = 0, max = 64)
	public Long inmCCds;
	/**
	 * The Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in the computation of the Equivalent INP.

Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "INMINPEQMODEds")
	@Size(min = 0, max = 3)
	public Long inmINPEQMODEds;
	/**
	 * The current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamAttenuation")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer upstreamAttenuation;
	/**
	 * The current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamAttenuation")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer downstreamAttenuation;
	/**
	 * The current output power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpstreamPower")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer upstreamPower;
	/**
	 * The current received power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DownstreamPower")
	@CWMPParameter(activeNotify = "canDeny")
	public Integer downstreamPower;
	/**
	 * ATU-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURVendor")
	@Size(max = 8)
	public String atuRVendor;
	/**
	 * T.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURCountry")
	@Size(max = 4)
	public String atuRCountry;
	/**
	 * ATU-R T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURANSIStd")
	public Long atuRANSIStd;
	/**
	 * ATU-R Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATURANSIRev")
	public Long atuRANSIRev;
	/**
	 * ATU-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCVendor")
	@Size(max = 8)
	public String atuCVendor;
	/**
	 * T.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCCountry")
	@Size(max = 4)
	public String atuCCountry;
	/**
	 * ATU-C T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCANSIStd")
	public Long atuCANSIStd;
	/**
	 * ATU-C Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ATUCANSIRev")
	public Long atuCANSIRev;
	/**
	 * Number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long totalStart;
	/**
	 * Number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of ''Showtime'' statistics.

Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected since the most recent establishment of the DSL link.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ShowtimeStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long showtimeStart;
	/**
	 * Number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastShowtimeStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long lastShowtimeStart;
	/**
	 * Number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentDayStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long currentDayStart;
	/**
	 * Number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QuarterHourStart")
	@CWMPParameter(activeNotify = "canDeny")
	public Long quarterHourStart;
	/**
	 * This object contains the DSL test parameters that are available during the L0 (i.e., Showtime) state.
	 */
	@XmlElement(name = "TestParams")
	public TestParams testParams;
	/**
	 * This object contains statistics for a WAN DSL physical interface.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public WANDSLInterfaceConfig() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the link.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the link.
	 *
	 * @since 1.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the link.
	 *
	 * @since 1.0
	 * @param enable the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the DSL physical link.  {{enum}}

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.0
	 * @param status the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the indicates which link encapsulation standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getLinkEncapsulationSupported() {
		if (this.linkEncapsulationSupported == null){ this.linkEncapsulationSupported=new ArrayList<>();}
		return linkEncapsulationSupported;
	}

	/**
	 * Set the indicates which link encapsulation standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 * @param linkEncapsulationSupported the input value
	 */
	public void  setLinkEncapsulationSupported(Collection<String> linkEncapsulationSupported) {
		this.linkEncapsulationSupported = linkEncapsulationSupported;
	}

	/**
	 * Set the indicates which link encapsulation standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLinkEncapsulationSupported(String string) {
		getLinkEncapsulationSupported().add(string);
		return this;
	}

	/**
	 * Get the indicates the link encapsulation standard requested by the B-NT.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getLinkEncapsulationRequested() {
		return linkEncapsulationRequested;
	}

	/**
	 * Set the indicates the link encapsulation standard requested by the B-NT.
	 *
	 * @since 1.4
	 * @param linkEncapsulationRequested the input value
	 */
	public void  setLinkEncapsulationRequested(String linkEncapsulationRequested) {
		this.linkEncapsulationRequested = linkEncapsulationRequested;
	}

	/**
	 * Set the indicates the link encapsulation standard requested by the B-NT.
	 *
	 * @since 1.4
	 * @param linkEncapsulationRequested the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLinkEncapsulationRequested(String linkEncapsulationRequested) {
		this.linkEncapsulationRequested = linkEncapsulationRequested;
		return this;
	}

	/**
	 * Get the indicates the link encapsulation standard that the B-NT is using for the connection.  {{enum}}

When the standard identifies ATM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANDSLLinkConfig}} object MUST be used.

When the standard identifies PTM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPTMLinkConfig}} object MUST be used.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getLinkEncapsulationUsed() {
		return linkEncapsulationUsed;
	}

	/**
	 * Set the indicates the link encapsulation standard that the B-NT is using for the connection.  {{enum}}

When the standard identifies ATM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANDSLLinkConfig}} object MUST be used.

When the standard identifies PTM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPTMLinkConfig}} object MUST be used.
	 *
	 * @since 1.4
	 * @param linkEncapsulationUsed the input value
	 */
	public void  setLinkEncapsulationUsed(String linkEncapsulationUsed) {
		this.linkEncapsulationUsed = linkEncapsulationUsed;
	}

	/**
	 * Set the indicates the link encapsulation standard that the B-NT is using for the connection.  {{enum}}

When the standard identifies ATM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANDSLLinkConfig}} object MUST be used.

When the standard identifies PTM encapsulation then the {{object|InternetGatewayDevice.WANDevice.{i}.WANConnectionDevice.{i}.WANPTMLinkConfig}} object MUST be used.
	 *
	 * @since 1.4
	 * @param linkEncapsulationUsed the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLinkEncapsulationUsed(String linkEncapsulationUsed) {
		this.linkEncapsulationUsed = linkEncapsulationUsed;
		return this;
	}

	/**
	 * Get the indicates the type of modulation used on the connection.  {{enum}}

This parameter, which was inherited from WANDSLLinkConfig, is DEPRECATED because it is in general not clear which standards correspond to which of the the above enumerated values.

It is RECOMMENDED that the {{param|StandardUsed}} parameter be used to indicate which standard is in use.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getModulationType() {
		return modulationType;
	}

	/**
	 * Set the indicates the type of modulation used on the connection.  {{enum}}

This parameter, which was inherited from WANDSLLinkConfig, is DEPRECATED because it is in general not clear which standards correspond to which of the the above enumerated values.

It is RECOMMENDED that the {{param|StandardUsed}} parameter be used to indicate which standard is in use.
	 *
	 * @since 1.0
	 * @param modulationType the input value
	 */
	public void  setModulationType(String modulationType) {
		this.modulationType = modulationType;
	}

	/**
	 * Set the indicates the type of modulation used on the connection.  {{enum}}

This parameter, which was inherited from WANDSLLinkConfig, is DEPRECATED because it is in general not clear which standards correspond to which of the the above enumerated values.

It is RECOMMENDED that the {{param|StandardUsed}} parameter be used to indicate which standard is in use.
	 *
	 * @since 1.0
	 * @param modulationType the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withModulationType(String modulationType) {
		this.modulationType = modulationType;
		return this;
	}

	/**
	 * Get the indicates which DSL standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getStandardsSupported() {
		if (this.standardsSupported == null){ this.standardsSupported=new ArrayList<>();}
		return standardsSupported;
	}

	/**
	 * Set the indicates which DSL standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 * @param standardsSupported the input value
	 */
	public void  setStandardsSupported(Collection<String> standardsSupported) {
		this.standardsSupported = standardsSupported;
	}

	/**
	 * Set the indicates which DSL standards and recommendations are supported by the B-NT.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withStandardsSupported(String string) {
		getStandardsSupported().add(string);
		return this;
	}

	/**
	 * Get the indicates the standard that the B-NT is using for the connection.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getStandardUsed() {
		return standardUsed;
	}

	/**
	 * Set the indicates the standard that the B-NT is using for the connection.
	 *
	 * @since 1.4
	 * @param standardUsed the input value
	 */
	public void  setStandardUsed(String standardUsed) {
		this.standardUsed = standardUsed;
	}

	/**
	 * Set the indicates the standard that the B-NT is using for the connection.
	 *
	 * @since 1.4
	 * @param standardUsed the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withStandardUsed(String standardUsed) {
		this.standardUsed = standardUsed;
		return this;
	}

	/**
	 * Get the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLineEncoding() {
		return lineEncoding;
	}

	/**
	 * Set the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 * @param lineEncoding the input value
	 */
	public void  setLineEncoding(String lineEncoding) {
		this.lineEncoding = lineEncoding;
	}

	/**
	 * Set the line encoding method used in establishing the Layer 1 DSL connection between the CPE and the DSLAM.  Note: Generally speaking, this variable does not change after provisioning.
	 *
	 * @since 1.0
	 * @param lineEncoding the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLineEncoding(String lineEncoding) {
		this.lineEncoding = lineEncoding;
		return this;
	}

	/**
	 * Get the indicates which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation G.997.1.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getAllowedProfiles() {
		if (this.allowedProfiles == null){ this.allowedProfiles=new ArrayList<>();}
		return allowedProfiles;
	}

	/**
	 * Set the indicates which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation G.997.1.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 * @param allowedProfiles the input value
	 */
	public void  setAllowedProfiles(Collection<String> allowedProfiles) {
		this.allowedProfiles = allowedProfiles;
	}

	/**
	 * Set the indicates which VDSL2 profiles are allowed on the line.  

Enumerated value must be one of [8a, 8b, 8c, 8d, 12a, 12b, 17a, 17b, 30a]

Note:  In G.997.1, this parameter is called PROFILES.  See ITU-T Recommendation G.997.1.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAllowedProfiles(String string) {
		getAllowedProfiles().add(string);
		return this;
	}

	/**
	 * Get the indicates which VDSL2 profile is currently in use on the line.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getCurrentProfile() {
		return currentProfile;
	}

	/**
	 * Set the indicates which VDSL2 profile is currently in use on the line.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 * @param currentProfile the input value
	 */
	public void  setCurrentProfile(String currentProfile) {
		this.currentProfile = currentProfile;
	}

	/**
	 * Set the indicates which VDSL2 profile is currently in use on the line.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, its value MUST be {{empty}}.
	 *
	 * @since 1.4
	 * @param currentProfile the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withCurrentProfile(String currentProfile) {
		this.currentProfile = currentProfile;
		return this;
	}

	/**
	 * Get the power management state of the line.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getPowerManagementState() {
		return powerManagementState;
	}

	/**
	 * Set the power management state of the line.
	 *
	 * @since 1.4
	 * @param powerManagementState the input value
	 */
	public void  setPowerManagementState(String powerManagementState) {
		this.powerManagementState = powerManagementState;
	}

	/**
	 * Set the power management state of the line.
	 *
	 * @since 1.4
	 * @param powerManagementState the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withPowerManagementState(String powerManagementState) {
		this.powerManagementState = powerManagementState;
		return this;
	}

	/**
	 * Get the success failure cause of the initialization. An enumeration of the following integer values:

* 0: Successful

* 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate for one or more bearer channels.

* 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

* 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode can be selected in the G.994.1 handshaking procedure or due to a timeout..

* 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow detection of a peer xTU.

* 5: Any other or unknown Initialization Failure cause.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getSuccessFailureCause() {
		return successFailureCause;
	}

	/**
	 * Set the success failure cause of the initialization. An enumeration of the following integer values:

* 0: Successful

* 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate for one or more bearer channels.

* 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

* 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode can be selected in the G.994.1 handshaking procedure or due to a timeout..

* 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow detection of a peer xTU.

* 5: Any other or unknown Initialization Failure cause.
	 *
	 * @since 1.4
	 * @param successFailureCause the input value
	 */
	public void  setSuccessFailureCause(Long successFailureCause) {
		this.successFailureCause = successFailureCause;
	}

	/**
	 * Set the success failure cause of the initialization. An enumeration of the following integer values:

* 0: Successful

* 1: Configuration error.  This error occurs with inconsistencies in configuration parameters, e.g. when the line is initialized in an xDSL Transmission system where an xTU does not support the configured Maximum Delay or the configured Minimum or Maximum Data Rate for one or more bearer channels.

* 2: Configuration not feasible on the line.  This error occurs if the Minimum Data Rate cannot be reached on the line with the Minimum Noise Margin, Maximum PSD level, Maximum Delay and Maximum Bit Error Ratio for one or more bearer channels.

* 3: Communication problem.  This error occurs, for example, due to corrupted messages or bad syntax messages or if no common mode can be selected in the G.994.1 handshaking procedure or due to a timeout..

* 4: No peer xTU detected.  This error occurs if the peer xTU is not powered or not connected or if the line is too long to allow detection of a peer xTU.

* 5: Any other or unknown Initialization Failure cause.
	 *
	 * @since 1.4
	 * @param successFailureCause the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withSuccessFailureCause(Long successFailureCause) {
		this.successFailureCause = successFailureCause;
		return this;
	}

	/**
	 * Get the this parameter represents the last successful transmitted initialization state in the downstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getLastStateTransmittedDownstream() {
		return lastStateTransmittedDownstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the downstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 * @param lastStateTransmittedDownstream the input value
	 */
	public void  setLastStateTransmittedDownstream(Long lastStateTransmittedDownstream) {
		this.lastStateTransmittedDownstream = lastStateTransmittedDownstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the downstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 * @param lastStateTransmittedDownstream the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLastStateTransmittedDownstream(Long lastStateTransmittedDownstream) {
		this.lastStateTransmittedDownstream = lastStateTransmittedDownstream;
		return this;
	}

	/**
	 * Get the this parameter represents the last successful transmitted initialization state in the upstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getLastStateTransmittedUpstream() {
		return lastStateTransmittedUpstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the upstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 * @param lastStateTransmittedUpstream the input value
	 */
	public void  setLastStateTransmittedUpstream(Long lastStateTransmittedUpstream) {
		this.lastStateTransmittedUpstream = lastStateTransmittedUpstream;
	}

	/**
	 * Set the this parameter represents the last successful transmitted initialization state in the upstream direction in the last full initialization performed on the line.  Initialization states are defined in the individual xDSL Recommendations and are counted from 0 (if G.994.1 is used) or 1 (if G.994.1 is not used) up to Showtime.  This parameter needs to be interpreted along with the xDSL Transmission System.

This parameter is available only when, after a failed full initialization, the line diagnostics procedures are activated on the line.
	 *
	 * @since 1.4
	 * @param lastStateTransmittedUpstream the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLastStateTransmittedUpstream(Long lastStateTransmittedUpstream) {
		this.lastStateTransmittedUpstream = lastStateTransmittedUpstream;
		return this;
	}

	/**
	 * Get the this parameter contains the estimated electrical loop length expressed in dB at 1MHz, kle (see O-UPDATE in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getUpbOKLE() {
		return upbOKLE;
	}

	/**
	 * Set the this parameter contains the estimated electrical loop length expressed in dB at 1MHz, kle (see O-UPDATE in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.
	 *
	 * @since 1.4
	 * @param upbOKLE the input value
	 */
	public void  setUpbOKLE(Long upbOKLE) {
		this.upbOKLE = upbOKLE;
	}

	/**
	 * Set the this parameter contains the estimated electrical loop length expressed in dB at 1MHz, kle (see O-UPDATE in section 12.2.4.2.1.2/G.993.2).  The value SHALL be coded as an unsigned 16 bit number in the range 0 (coded as 0) to 128 dB (coded as 1280) in steps of 0.1 dB.
	 *
	 * @since 1.4
	 * @param upbOKLE the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpbOKLE(Long upbOKLE) {
		this.upbOKLE = upbOKLE;
		return this;
	}

	/**
	 * Get the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getMreFPSDds() {
		return mreFPSDds;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 * @param mreFPSDds the input value
	 */
	public void  setMreFPSDds(String mreFPSDds) {
		this.mreFPSDds = mreFPSDds;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDds fields of the O-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 * @param mreFPSDds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withMreFPSDds(String mreFPSDds) {
		this.mreFPSDds = mreFPSDds;
		return this;
	}

	/**
	 * Get the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getMreFPSDus() {
		return mreFPSDus;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 * @param mreFPSDus the input value
	 */
	public void  setMreFPSDus(String mreFPSDus) {
		this.mreFPSDus = mreFPSDus;
	}

	/**
	 * Set the this parameter SHALL contain the set of breakpoints exchanged in the MREFPSDus fields of the R-PRM message of G.993.2. Base64 encoded of the binary representation defined in Table 12-19/G.993.2 (maximum length is 145 octets, which requires 196 bytes for Base64 encoding).
	 *
	 * @since 1.4
	 * @param mreFPSDus the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withMreFPSDus(String mreFPSDus) {
		this.mreFPSDus = mreFPSDus;
		return this;
	}

	/**
	 * Get the indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getLimITMASK() {
		return limITMASK;
	}

	/**
	 * Set the indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param limITMASK the input value
	 */
	public void  setLimITMASK(Long limITMASK) {
		this.limITMASK = limITMASK;
	}

	/**
	 * Set the indicates the enabled VDSL2 Limit PSD mask of the selected PSD mask class.  Bit mask as specified in ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param limITMASK the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLimITMASK(Long limITMASK) {
		this.limITMASK = limITMASK;
		return this;
	}

	/**
	 * Get the indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getUs0MASK() {
		return us0MASK;
	}

	/**
	 * Set the indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param us0MASK the input value
	 */
	public void  setUs0MASK(Long us0MASK) {
		this.us0MASK = us0MASK;
	}

	/**
	 * Set the indicates the allowed VDSL2 US0 PSD masks for Annex A operation.  Bit mask as specified in see ITU-T Recommendation G.997.1.

Note:  For a VDSL2-capable multimode device operating in a mode other than VDSL2, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param us0MASK the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUs0MASK(Long us0MASK) {
		this.us0MASK = us0MASK;
		return this;
	}

	/**
	 * Get the indicates whether the data path is fast (lower latency) or interleaved (lower error rate).  {{enum}}

Note1:  This parameter is only applicable to G.992.1.

Note2:  For an ADSL1-capable multimode device operating in a mode other than ADSL1, the value of this parameter SHOULD be set to {{enum|None}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * Set the indicates whether the data path is fast (lower latency) or interleaved (lower error rate).  {{enum}}

Note1:  This parameter is only applicable to G.992.1.

Note2:  For an ADSL1-capable multimode device operating in a mode other than ADSL1, the value of this parameter SHOULD be set to {{enum|None}}.
	 *
	 * @since 1.0
	 * @param dataPath the input value
	 */
	public void  setDataPath(String dataPath) {
		this.dataPath = dataPath;
	}

	/**
	 * Set the indicates whether the data path is fast (lower latency) or interleaved (lower error rate).  {{enum}}

Note1:  This parameter is only applicable to G.992.1.

Note2:  For an ADSL1-capable multimode device operating in a mode other than ADSL1, the value of this parameter SHOULD be set to {{enum|None}}.
	 *
	 * @since 1.0
	 * @param dataPath the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDataPath(String dataPath) {
		this.dataPath = dataPath;
		return this;
	}

	/**
	 * Get adsL1 Interleaved depth.  This variable is only applicable to ADSL1 and only if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getInterleaveDepth() {
		return interleaveDepth;
	}

	/**
	 * Set adsL1 Interleaved depth.  This variable is only applicable to ADSL1 and only if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 * @param interleaveDepth the input value
	 */
	public void  setInterleaveDepth(Long interleaveDepth) {
		this.interleaveDepth = interleaveDepth;
	}

	/**
	 * Set adsL1 Interleaved depth.  This variable is only applicable to ADSL1 and only if {{param|DataPath}} = {{enum|Interleaved|DataPath}}.  Otherwise, the value of this parameter MUST be zero.
	 *
	 * @since 1.0
	 * @param interleaveDepth the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withInterleaveDepth(Long interleaveDepth) {
		this.interleaveDepth = interleaveDepth;
		return this;
	}

	/**
	 * Get the reports the index of the latency path supporting the bearer channel.  For single-latency connections, LPATH = 0.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getLpaTH() {
		return lpaTH;
	}

	/**
	 * Set the reports the index of the latency path supporting the bearer channel.  For single-latency connections, LPATH = 0.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param lpaTH the input value
	 */
	public void  setLpaTH(Long lpaTH) {
		this.lpaTH = lpaTH;
	}

	/**
	 * Set the reports the index of the latency path supporting the bearer channel.  For single-latency connections, LPATH = 0.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param lpaTH the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLpaTH(Long lpaTH) {
		this.lpaTH = lpaTH;
		return this;
	}

	/**
	 * Get the reports the interleaver depth D for the latency path indicated in LPATH. 

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getIntLVDEPTH() {
		return intLVDEPTH;
	}

	/**
	 * Set the reports the interleaver depth D for the latency path indicated in LPATH. 

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param intLVDEPTH the input value
	 */
	public void  setIntLVDEPTH(Integer intLVDEPTH) {
		this.intLVDEPTH = intLVDEPTH;
	}

	/**
	 * Set the reports the interleaver depth D for the latency path indicated in LPATH. 

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param intLVDEPTH the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withIntLVDEPTH(Integer intLVDEPTH) {
		this.intLVDEPTH = intLVDEPTH;
		return this;
	}

	/**
	 * Get the reports the interleaver block length in use on the latency path indicated in LPATH.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getIntLVBLOCK() {
		return intLVBLOCK;
	}

	/**
	 * Set the reports the interleaver block length in use on the latency path indicated in LPATH.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param intLVBLOCK the input value
	 */
	public void  setIntLVBLOCK(Integer intLVBLOCK) {
		this.intLVBLOCK = intLVBLOCK;
	}

	/**
	 * Set the reports the interleaver block length in use on the latency path indicated in LPATH.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param intLVBLOCK the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withIntLVBLOCK(Integer intLVBLOCK) {
		this.intLVBLOCK = intLVBLOCK;
		return this;
	}

	/**
	 * Get the reports the actual delay, in milliseconds, of the latency path due to interleaving. 

Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getActualInterleavingDelay() {
		return actualInterleavingDelay;
	}

	/**
	 * Set the reports the actual delay, in milliseconds, of the latency path due to interleaving. 

Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param actualInterleavingDelay the input value
	 */
	public void  setActualInterleavingDelay(Long actualInterleavingDelay) {
		this.actualInterleavingDelay = actualInterleavingDelay;
	}

	/**
	 * Set the reports the actual delay, in milliseconds, of the latency path due to interleaving. 

Note:  In G.997.1, this parameter is called "Actual Interleaving Delay." See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param actualInterleavingDelay the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withActualInterleavingDelay(Long actualInterleavingDelay) {
		this.actualInterleavingDelay = actualInterleavingDelay;
		return this;
	}

	/**
	 * Get the reports the actual impulse noise protection (INP) provided by the latency path indicated in LPATH.  The value is the actual INP in the L0 (i.e., Showtime) state.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getActINP() {
		return actINP;
	}

	/**
	 * Set the reports the actual impulse noise protection (INP) provided by the latency path indicated in LPATH.  The value is the actual INP in the L0 (i.e., Showtime) state.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param actINP the input value
	 */
	public void  setActINP(Integer actINP) {
		this.actINP = actINP;
	}

	/**
	 * Set the reports the actual impulse noise protection (INP) provided by the latency path indicated in LPATH.  The value is the actual INP in the L0 (i.e., Showtime) state.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param actINP the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withActINP(Integer actINP) {
		this.actINP = actINP;
		return this;
	}

	/**
	 * Get the reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.  Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding capabilities of receiver).

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isInpREPORT() {
		return inpREPORT;
	}

	/**
	 * Set the reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.  Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding capabilities of receiver).

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 1.4
	 * @param inpREPORT the input value
	 */
	public void  setInpREPORT(Boolean inpREPORT) {
		this.inpREPORT = inpREPORT;
	}

	/**
	 * Set the reports whether the value reported in ACTINP was computed assuming the receiver does not use erasure decoding.  Valid values are 0 (computed per the formula assuming no erasure decoding) and 1 (computed by taking into account erasure decoding capabilities of receiver).

Note:  See ITU-T Recommendation G.997.1.  For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{false}}.
	 *
	 * @since 1.4
	 * @param inpREPORT the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withInpREPORT(Boolean inpREPORT) {
		this.inpREPORT = inpREPORT;
		return this;
	}

	/**
	 * Get the reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getNfeC() {
		return nfeC;
	}

	/**
	 * Set the reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param nfeC the input value
	 */
	public void  setNfeC(Integer nfeC) {
		this.nfeC = nfeC;
	}

	/**
	 * Set the reports the size, in octets, of the Reed-Solomon codeword in use on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param nfeC the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withNfeC(Integer nfeC) {
		this.nfeC = nfeC;
		return this;
	}

	/**
	 * Get the reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getRfeC() {
		return rfeC;
	}

	/**
	 * Set the reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param rfeC the input value
	 */
	public void  setRfeC(Integer rfeC) {
		this.rfeC = rfeC;
	}

	/**
	 * Set the reports the number of redundancy bytes per Reed-Solomon codeword on the latency path indicated in LPATH.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param rfeC the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withRfeC(Integer rfeC) {
		this.rfeC = rfeC;
		return this;
	}

	/**
	 * Get the reports the number of bits per symbol assigned to the latency path indicated in LPATH.  This value does not include overhead due to trellis coding.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getLsyMB() {
		return lsyMB;
	}

	/**
	 * Set the reports the number of bits per symbol assigned to the latency path indicated in LPATH.  This value does not include overhead due to trellis coding.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param lsyMB the input value
	 */
	public void  setLsyMB(Integer lsyMB) {
		this.lsyMB = lsyMB;
	}

	/**
	 * Set the reports the number of bits per symbol assigned to the latency path indicated in LPATH.  This value does not include overhead due to trellis coding.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param lsyMB the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLsyMB(Integer lsyMB) {
		this.lsyMB = lsyMB;
		return this;
	}

	/**
	 * Get the reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getTreLLISds() {
		return treLLISds;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param treLLISds the input value
	 */
	public void  setTreLLISds(Integer treLLISds) {
		this.treLLISds = treLLISds;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the downstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param treLLISds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withTreLLISds(Integer treLLISds) {
		this.treLLISds = treLLISds;
		return this;
	}

	/**
	 * Get the reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getTreLLISus() {
		return treLLISus;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param treLLISus the input value
	 */
	public void  setTreLLISus(Integer treLLISus) {
		this.treLLISus = treLLISus;
	}

	/**
	 * Set the reports whether trellis coding is enabled in the upstream direction.  A value of 1 indicates that trellis coding is in use, and a value of 0 indicates that the trellis is disabled.

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to -1.
	 *
	 * @since 1.4
	 * @param treLLISus the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withTreLLISus(Integer treLLISus) {
		this.treLLISus = treLLISus;
		return this;
	}

	/**
	 * Get the reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getActSNRMODEds() {
		return actSNRMODEds;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param actSNRMODEds the input value
	 */
	public void  setActSNRMODEds(Long actSNRMODEds) {
		this.actSNRMODEds = actSNRMODEds;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the downstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param actSNRMODEds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withActSNRMODEds(Long actSNRMODEds) {
		this.actSNRMODEds = actSNRMODEds;
		return this;
	}

	/**
	 * Get the reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getActSNRMODEus() {
		return actSNRMODEus;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param actSNRMODEus the input value
	 */
	public void  setActSNRMODEus(Long actSNRMODEus) {
		this.actSNRMODEus = actSNRMODEus;
	}

	/**
	 * Set the reports whether the OPTIONAL virtual noise mechanism is in use in the upstream direction.  A value of 1 indicates the virtual noise mechanism is not in use, and a value of 2 indicates the virtual noise mechanism is in use. 

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 0.
	 *
	 * @since 1.4
	 * @param actSNRMODEus the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withActSNRMODEus(Long actSNRMODEus) {
		this.actSNRMODEus = actSNRMODEus;
		return this;
	}

	/**
	 * Get the reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getVirtualNoisePSDds() {
		return virtualNoisePSDds;
	}

	/**
	 * Set the reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 * @param virtualNoisePSDds the input value
	 */
	public void  setVirtualNoisePSDds(String virtualNoisePSDds) {
		this.virtualNoisePSDds = virtualNoisePSDds;
	}

	/**
	 * Set the reports the virtual noise PSD for the downstream direction. Base64 encoded of the binary representation defined in G.997.1 by the parameter called TXREFVNds (maximum length is 97 octets, which requires 132 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 * @param virtualNoisePSDds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withVirtualNoisePSDds(String virtualNoisePSDds) {
		this.virtualNoisePSDds = virtualNoisePSDds;
		return this;
	}

	/**
	 * Get the reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getVirtualNoisePSDus() {
		return virtualNoisePSDus;
	}

	/**
	 * Set the reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 * @param virtualNoisePSDus the input value
	 */
	public void  setVirtualNoisePSDus(String virtualNoisePSDus) {
		this.virtualNoisePSDus = virtualNoisePSDus;
	}

	/**
	 * Set the reports the virtual noise PSD for the upstream direction. Base64 encoded of the binary representation defined in G.997.1by the parameter called TXREFVNus (maximum length is 49 octets, which requires 68 bytes for Base64 encoding).

See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to {{empty}}.
	 *
	 * @since 1.4
	 * @param virtualNoisePSDus the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withVirtualNoisePSDus(String virtualNoisePSDus) {
		this.virtualNoisePSDus = virtualNoisePSDus;
		return this;
	}

	/**
	 * Get the reports the actual cyclic extension, as the value of m, in use for the connection.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 99.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getActUALCE() {
		return actUALCE;
	}

	/**
	 * Set the reports the actual cyclic extension, as the value of m, in use for the connection.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 99.
	 *
	 * @since 1.4
	 * @param actUALCE the input value
	 */
	public void  setActUALCE(Long actUALCE) {
		this.actUALCE = actUALCE;
	}

	/**
	 * Set the reports the actual cyclic extension, as the value of m, in use for the connection.  

Note:  See ITU-T Recommendation G.997.1. For a multimode device operating in a mode in which this parameter does not apply, the value of this parameter SHOULD be set to 99.
	 *
	 * @since 1.4
	 * @param actUALCE the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withActUALCE(Long actUALCE) {
		this.actUALCE = actUALCE;
		return this;
	}

	/**
	 * Get the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getLineNumber() {
		return lineNumber;
	}

	/**
	 * Set the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 * @param lineNumber the input value
	 */
	public void  setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	/**
	 * Set the signifies the line pair that the modem is using to connection.  {{param}} = 1 is the innermost pair.
	 *
	 * @since 1.0
	 * @param lineNumber the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}

	/**
	 * Get the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUpstreamCurrRate() {
		return upstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 * @param upstreamCurrRate the input value
	 */
	public void  setUpstreamCurrRate(Long upstreamCurrRate) {
		this.upstreamCurrRate = upstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the upstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 * @param upstreamCurrRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamCurrRate(Long upstreamCurrRate) {
		this.upstreamCurrRate = upstreamCurrRate;
		return this;
	}

	/**
	 * Get the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDownstreamCurrRate() {
		return downstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 * @param downstreamCurrRate the input value
	 */
	public void  setDownstreamCurrRate(Long downstreamCurrRate) {
		this.downstreamCurrRate = downstreamCurrRate;
	}

	/**
	 * Set the current physical layer aggregate data rate (expressed in Kbps) of the downstream DSL connection.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value 4294967295 (the maximum for its data type).
	 *
	 * @since 1.0
	 * @param downstreamCurrRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamCurrRate(Long downstreamCurrRate) {
		this.downstreamCurrRate = downstreamCurrRate;
		return this;
	}

	/**
	 * Get the current attainable rate (expressed in Kbps) of the upstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUpstreamMaxRate() {
		return upstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the upstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param upstreamMaxRate the input value
	 */
	public void  setUpstreamMaxRate(Long upstreamMaxRate) {
		this.upstreamMaxRate = upstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the upstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRus, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param upstreamMaxRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamMaxRate(Long upstreamMaxRate) {
		this.upstreamMaxRate = upstreamMaxRate;
		return this;
	}

	/**
	 * Get the current attainable rate (expressed in Kbps) of the downstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getDownstreamMaxRate() {
		return downstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the downstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param downstreamMaxRate the input value
	 */
	public void  setDownstreamMaxRate(Long downstreamMaxRate) {
		this.downstreamMaxRate = downstreamMaxRate;
	}

	/**
	 * Set the current attainable rate (expressed in Kbps) of the downstream DSL channel.

Note:  This parameter is related to the G.997.1 parameter ATTNDRds, which is measured in bits/s.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param downstreamMaxRate the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamMaxRate(Long downstreamMaxRate) {
		this.downstreamMaxRate = downstreamMaxRate;
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio margin (expressed in 0.1 dB) in the upstream direction.

Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getUpstreamNoiseMargin() {
		return upstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1 dB) in the upstream direction.

Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param upstreamNoiseMargin the input value
	 */
	public void  setUpstreamNoiseMargin(Integer upstreamNoiseMargin) {
		this.upstreamNoiseMargin = upstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1 dB) in the upstream direction.

Note:  In G.997.1, this parameter is called SNRMus.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param upstreamNoiseMargin the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamNoiseMargin(Integer upstreamNoiseMargin) {
		this.upstreamNoiseMargin = upstreamNoiseMargin;
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio margin (expressed in 0.1 dB) in the downstream direction.

Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDownstreamNoiseMargin() {
		return downstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1 dB) in the downstream direction.

Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param downstreamNoiseMargin the input value
	 */
	public void  setDownstreamNoiseMargin(Integer downstreamNoiseMargin) {
		this.downstreamNoiseMargin = downstreamNoiseMargin;
	}

	/**
	 * Set the current signal-to-noise ratio margin (expressed in 0.1 dB) in the downstream direction.

Note:  In G.997.1, this parameter is called SNRMds.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.0
	 * @param downstreamNoiseMargin the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamNoiseMargin(Integer downstreamNoiseMargin) {
		this.downstreamNoiseMargin = downstreamNoiseMargin;
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getSnrMpbus() {
		if (this.snrMpbus == null){ this.snrMpbus=new ArrayList<>();}
		return snrMpbus;
	}

	/**
	 * Set the current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param snrMpbus the input value
	 */
	public void  setSnrMpbus(Collection<String> snrMpbus) {
		this.snrMpbus = snrMpbus;
	}

	/**
	 * Set the current signal-to-noise ratio margin of each upstream band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withSnrMpbus(String string) {
		getSnrMpbus().add(string);
		return this;
	}

	/**
	 * Get the current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Collection<String> getSnrMpbds() {
		if (this.snrMpbds == null){ this.snrMpbds=new ArrayList<>();}
		return snrMpbds;
	}

	/**
	 * Set the current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param snrMpbds the input value
	 */
	public void  setSnrMpbds(Collection<String> snrMpbds) {
		this.snrMpbds = snrMpbds;
	}

	/**
	 * Set the current signal-to-noise ratio margin of each band.  Interpretation of the values is as defined in ITU-T Rec. G.997.1.

Note:  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param string the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withSnrMpbds(String string) {
		getSnrMpbds().add(string);
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getInmIATOds() {
		return inmIATOds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmIATOds the input value
	 */
	public void  setInmIATOds(Long inmIATOds) {
		this.inmIATOds = inmIATOds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Inter Arrival Time (IAT) Offset, measured in DMT symbols, that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATO.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmIATOds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withInmIATOds(Long inmIATOds) {
		this.inmIATOds = inmIATOds;
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getInmIATSds() {
		return inmIATSds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmIATSds the input value
	 */
	public void  setInmIATSds(Long inmIATSds) {
		this.inmIATSds = inmIATSds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM)  Inter Arrival Time (IAT) Step that the xTU receiver uses to determine in which bin of the IAT histogram the IAT is reported.

Note:  In G.997.1, this parameter is called INMIATS.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmIATSds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withInmIATSds(Long inmIATSds) {
		this.inmIATSds = inmIATSds;
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver uses in the cluster indication process.

Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getInmCCds() {
		return inmCCds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver uses in the cluster indication process.

Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmCCds the input value
	 */
	public void  setInmCCds(Long inmCCds) {
		this.inmCCds = inmCCds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Cluster Continuation value, measured in DMT symbols, that the xTU receiver uses in the cluster indication process.

Note:  In G.997.1, this parameter is called INMCC.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmCCds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withInmCCds(Long inmCCds) {
		this.inmCCds = inmCCds;
		return this;
	}

	/**
	 * Get the Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in the computation of the Equivalent INP.

Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Long getInmINPEQMODEds() {
		return inmINPEQMODEds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in the computation of the Equivalent INP.

Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmINPEQMODEds the input value
	 */
	public void  setInmINPEQMODEds(Long inmINPEQMODEds) {
		this.inmINPEQMODEds = inmINPEQMODEds;
	}

	/**
	 * Set the Impulse Noise Monitoring (INM) Equivalent Impulse Noise Protection (INP) Mode that the xTU receiver uses in the computation of the Equivalent INP.

Note:  In G.997.1, this parameter is called INM_INPEQ_MODE.  See ITU-T Recommendation G.997.1.
	 *
	 * @since 1.4
	 * @param inmINPEQMODEds the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withInmINPEQMODEds(Long inmINPEQMODEds) {
		this.inmINPEQMODEds = inmINPEQMODEds;
		return this;
	}

	/**
	 * Get the current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getUpstreamAttenuation() {
		return upstreamAttenuation;
	}

	/**
	 * Set the current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param upstreamAttenuation the input value
	 */
	public void  setUpstreamAttenuation(Integer upstreamAttenuation) {
		this.upstreamAttenuation = upstreamAttenuation;
	}

	/**
	 * Set the current upstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param upstreamAttenuation the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamAttenuation(Integer upstreamAttenuation) {
		this.upstreamAttenuation = upstreamAttenuation;
		return this;
	}

	/**
	 * Get the current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDownstreamAttenuation() {
		return downstreamAttenuation;
	}

	/**
	 * Set the current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param downstreamAttenuation the input value
	 */
	public void  setDownstreamAttenuation(Integer downstreamAttenuation) {
		this.downstreamAttenuation = downstreamAttenuation;
	}

	/**
	 * Set the current downstream signal loss (expressed in 0.1 dB).
	 *
	 * @since 1.0
	 * @param downstreamAttenuation the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamAttenuation(Integer downstreamAttenuation) {
		this.downstreamAttenuation = downstreamAttenuation;
		return this;
	}

	/**
	 * Get the current output power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getUpstreamPower() {
		return upstreamPower;
	}

	/**
	 * Set the current output power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 * @param upstreamPower the input value
	 */
	public void  setUpstreamPower(Integer upstreamPower) {
		this.upstreamPower = upstreamPower;
	}

	/**
	 * Set the current output power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 * @param upstreamPower the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withUpstreamPower(Integer upstreamPower) {
		this.upstreamPower = upstreamPower;
		return this;
	}

	/**
	 * Get the current received power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getDownstreamPower() {
		return downstreamPower;
	}

	/**
	 * Set the current received power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 * @param downstreamPower the input value
	 */
	public void  setDownstreamPower(Integer downstreamPower) {
		this.downstreamPower = downstreamPower;
	}

	/**
	 * Set the current received power at the CPE's DSL interface (expressed in 0.1 dBmV).
	 *
	 * @since 1.0
	 * @param downstreamPower the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withDownstreamPower(Integer downstreamPower) {
		this.downstreamPower = downstreamPower;
		return this;
	}

	/**
	 * Get atu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuRVendor() {
		return atuRVendor;
	}

	/**
	 * Set atu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 * @param atuRVendor the input value
	 */
	public void  setAtuRVendor(String atuRVendor) {
		this.atuRVendor = atuRVendor;
	}

	/**
	 * Set atu-R vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 * @param atuRVendor the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRVendor(String atuRVendor) {
		this.atuRVendor = atuRVendor;
		return this;
	}

	/**
	 * Get the t.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuRCountry() {
		return atuRCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 * @param atuRCountry the input value
	 */
	public void  setAtuRCountry(String atuRCountry) {
		this.atuRCountry = atuRCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-R vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 * @param atuRCountry the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRCountry(String atuRCountry) {
		this.atuRCountry = atuRCountry;
		return this;
	}

	/**
	 * Get atu-R T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuRANSIStd() {
		return atuRANSIStd;
	}

	/**
	 * Set atu-R T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuRANSIStd the input value
	 */
	public void  setAtuRANSIStd(Long atuRANSIStd) {
		this.atuRANSIStd = atuRANSIStd;
	}

	/**
	 * Set atu-R T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuRANSIStd the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRANSIStd(Long atuRANSIStd) {
		this.atuRANSIStd = atuRANSIStd;
		return this;
	}

	/**
	 * Get atu-R Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuRANSIRev() {
		return atuRANSIRev;
	}

	/**
	 * Set atu-R Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuRANSIRev the input value
	 */
	public void  setAtuRANSIRev(Long atuRANSIRev) {
		this.atuRANSIRev = atuRANSIRev;
	}

	/**
	 * Set atu-R Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuRANSIRev the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuRANSIRev(Long atuRANSIRev) {
		this.atuRANSIRev = atuRANSIRev;
		return this;
	}

	/**
	 * Get atu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuCVendor() {
		return atuCVendor;
	}

	/**
	 * Set atu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 * @param atuCVendor the input value
	 */
	public void  setAtuCVendor(String atuCVendor) {
		this.atuCVendor = atuCVendor;
	}

	/**
	 * Set atu-C vendor identifier as defined in G.994.1 and T1.413.  In the case of G.994.1 this corresponds to the four-octet provider code, which MUST be represented as eight hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "00000000".
	 *
	 * @since 1.0
	 * @param atuCVendor the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCVendor(String atuCVendor) {
		this.atuCVendor = atuCVendor;
		return this;
	}

	/**
	 * Get the t.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getAtuCCountry() {
		return atuCCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 * @param atuCCountry the input value
	 */
	public void  setAtuCCountry(String atuCCountry) {
		this.atuCCountry = atuCCountry;
	}

	/**
	 * Set the t.35 country code of the ATU-C vendor as defined in G.994.1, where the two-octet value defined in G.994.1 MUST be represented as four hexadecimal digits.

Note: This parameter is OPTIONAL at the G and S/T interfaces in G.997.1 Amendment 1.  If the parameter is implemented but no value is available, it MUST have the value "0000".
	 *
	 * @since 1.0
	 * @param atuCCountry the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCCountry(String atuCCountry) {
		this.atuCCountry = atuCCountry;
		return this;
	}

	/**
	 * Get atu-C T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuCANSIStd() {
		return atuCANSIStd;
	}

	/**
	 * Set atu-C T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuCANSIStd the input value
	 */
	public void  setAtuCANSIStd(Long atuCANSIStd) {
		this.atuCANSIStd = atuCANSIStd;
	}

	/**
	 * Set atu-C T1.413 Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuCANSIStd the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCANSIStd(Long atuCANSIStd) {
		this.atuCANSIStd = atuCANSIStd;
		return this;
	}

	/**
	 * Get atu-C Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getAtuCANSIRev() {
		return atuCANSIRev;
	}

	/**
	 * Set atu-C Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuCANSIRev the input value
	 */
	public void  setAtuCANSIRev(Long atuCANSIRev) {
		this.atuCANSIRev = atuCANSIRev;
	}

	/**
	 * Set atu-C Vendor Revision Number as defined in T1.413 Issue 2.

When T1.413 modulation is not in use, the parameter value SHOULD be 0.
	 *
	 * @since 1.0
	 * @param atuCANSIRev the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withAtuCANSIRev(Long atuCANSIRev) {
		this.atuCANSIRev = atuCANSIRev;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalStart() {
		return totalStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param totalStart the input value
	 */
	public void  setTotalStart(Long totalStart) {
		this.totalStart = totalStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''Total'' statistics.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param totalStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withTotalStart(Long totalStart) {
		this.totalStart = totalStart;
		return this;
	}

	/**
	 * Get the number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of ''Showtime'' statistics.

Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected since the most recent establishment of the DSL link.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getShowtimeStart() {
		return showtimeStart;
	}

	/**
	 * Set the number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of ''Showtime'' statistics.

Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected since the most recent establishment of the DSL link.
	 *
	 * @since 1.0
	 * @param showtimeStart the input value
	 */
	public void  setShowtimeStart(Long showtimeStart) {
		this.showtimeStart = showtimeStart;
	}

	/**
	 * Set the number of seconds since the most recent DSL Showtime - the beginning of the period used for collection of ''Showtime'' statistics.

Showtime is defined as successful completion of the DSL link establishment process.  The ''Showtime'' statistics are those collected since the most recent establishment of the DSL link.
	 *
	 * @since 1.0
	 * @param showtimeStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withShowtimeStart(Long showtimeStart) {
		this.showtimeStart = showtimeStart;
		return this;
	}

	/**
	 * Get the number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLastShowtimeStart() {
		return lastShowtimeStart;
	}

	/**
	 * Set the number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @param lastShowtimeStart the input value
	 */
	public void  setLastShowtimeStart(Long lastShowtimeStart) {
		this.lastShowtimeStart = lastShowtimeStart;
	}

	/**
	 * Set the number of seconds since the second most recent DSL Showtime-the beginning of the period used for collection of ''LastShowtime'' statistics.

If the CPE has not retained information about the second most recent Showtime (e.g., on reboot), the start of ''LastShowtime'' statistics MAY temporarily coincide with the start of ''Showtime'' statistics.
	 *
	 * @since 1.0
	 * @param lastShowtimeStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withLastShowtimeStart(Long lastShowtimeStart) {
		this.lastShowtimeStart = lastShowtimeStart;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getCurrentDayStart() {
		return currentDayStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param currentDayStart the input value
	 */
	public void  setCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''CurrentDay'' statistics.

The CPE MAY align the beginning of each CurrentDay interval with days in the UTC time zone, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param currentDayStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withCurrentDayStart(Long currentDayStart) {
		this.currentDayStart = currentDayStart;
		return this;
	}

	/**
	 * Get the number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQuarterHourStart() {
		return quarterHourStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param quarterHourStart the input value
	 */
	public void  setQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
	}

	/**
	 * Set the number of seconds since the beginning of the period used for collection of ''QuarterHour'' statistics.

The CPE MAY align the beginning of each QuarterHour interval with real-time quarter-hour intervals, but does not have to do so.

Statistics SHOULD continue to be accumulated across CPE reboots, though this might not always be possible.
	 *
	 * @since 1.0
	 * @param quarterHourStart the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withQuarterHourStart(Long quarterHourStart) {
		this.quarterHourStart = quarterHourStart;
		return this;
	}

	/**
	 * Get the this object contains the DSL test parameters that are available during the L0 (i.e., Showtime) state.
	 *
	 * @return the value
	 */
	public TestParams getTestParams() {
		return testParams;
	}

	/**
	 * Set the this object contains the DSL test parameters that are available during the L0 (i.e., Showtime) state.
	 *
	 * @param testParams the input value
	 */
	public void  setTestParams(TestParams testParams) {
		this.testParams = testParams;
	}

	/**
	 * Set the this object contains the DSL test parameters that are available during the L0 (i.e., Showtime) state.
	 *
	 * @param testParams the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withTestParams(TestParams testParams) {
		this.testParams = testParams;
		return this;
	}

	/**
	 * Get the this object contains statistics for a WAN DSL physical interface.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains statistics for a WAN DSL physical interface.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains statistics for a WAN DSL physical interface.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public WANDSLInterfaceConfig withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}