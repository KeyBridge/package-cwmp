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
package org.broadbandforum.tr104.voiceservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr104.voiceservice.capabilities.Codec;
import org.broadbandforum.tr104.voiceservice.capabilities.H323;
import org.broadbandforum.tr104.voiceservice.capabilities.ISDN;
import org.broadbandforum.tr104.voiceservice.capabilities.MGCP;
import org.broadbandforum.tr104.voiceservice.capabilities.POTS;
import org.broadbandforum.tr104.voiceservice.capabilities.QualityIndicator;
import org.broadbandforum.tr104.voiceservice.capabilities.SIP;

	/**
	 * The overall capabilities of the VoIP CPE.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.")
@XmlRootElement(name = "VoiceService.Capabilities")
@XmlType(name = "VoiceService.Capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

	/**
	 * Maximum total number of {{object|.CallControl.Line}} objects supported.

A value of -1 indicates no specific limit on the number of lines.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxLineCount")
	@Size(min = -1)
	public Integer maxLineCount;
	/**
	 * Maximum total number of {{object|.CallControl.Extension}} objects supported.

A value of -1 indicates no specific limit on the number of extensions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxExtensionCount")
	@Size(min = -1)
	public Integer maxExtensionCount;
	/**
	 * Maximum total number of {{object|.CallLog}} objects supported.

A value of -1 indicates no specific limit on the number of call logs.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCallLogCount")
	@Size(min = -1)
	public Integer maxCallLogCount;
	/**
	 * Maximum number of voice sessions supported for any given {{object|.CallControl.Line}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per line.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessionsPerLine")
	@Size(min = -1)
	public Integer maxSessionsPerLine;
	/**
	 * Maximum number of voice sessions supported for any given {{object|.CallControl.Extension}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per extension.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessionsPerExtension")
	@Size(min = -1)
	public Integer maxSessionsPerExtension;
	/**
	 * Maximum total number of voice sessions supported across all {{object|.CallControl.Line}} objects.  (This might differ from {{param|MaxLineCount}} if each line can support more than one session for CPE-provided conference calling.  This value MAY be less than the product of {{param|MaxLineCount}} and {{param|MaxSessionsPerLine}}.)

A value of -1 indicates no specific limit on the number of voice sessions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessionCount")
	@Size(min = -1)
	public Integer maxSessionCount;
	/**
	 * {{list}}  Each item is a supported network connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NetworkConnectionModes")
	@XmlList
	public Collection<String> networkConnectionModes;
	/**
	 * {{list}}  Each item is a supported user connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UserConnectionModes")
	@XmlList
	public Collection<String> userConnectionModes;
	/**
	 * {{list}} Each item is a supported tone file format.  The specified file formats are raw codec data files, using one of the codecs listed below. 

Enumerated value must be one of [G.711MuLaw, G.711ALaw, G.729, MP3, WAV, AMR]

The list MAY include vendor-specific -specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"G.711MuLaw, MP3, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support tone files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ToneFileFormats")
	@XmlList
	public Collection<String> toneFileFormats;
	/**
	 * {{list}} Each item is a supported ring file format. 

Enumerated value must be one of [MIDI, SMAF, RTTTL, MP3, WAV, AMR]

The list MAY include vendor-specific-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"MIDI, AMR, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support ring files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RingFileFormats")
	@XmlList
	public Collection<String> ringFileFormats;
	/**
	 * The facility actions supported by this VoiceService.  

Enumerated value must be one of [AA_REGISTER, AA_ERASE, AA_INTERROGATE, CA_ACTIVATE, CCBS_ACTIVATE, CCBS_DEACTIVATE, CCBS_INTERROGATE, CCNR_ACTIVATE, CCNR_DEACTIVATE, CCNR_INTERROGATE, CFB_REGISTER, CFB_ACTIVATE, CFB_DEACTIVATE, CFB_ERASE, CFB_INTERROGATE, CFNR_REGISTER, CFNR_ACTIVATE, CFNR_DEACTIVATE, CFNR_ERASE, CFNR_INTERROGATE, CFNR_TIMER, CFT_ACTIVATE, CFT_DEACTIVATE, CFT_INTERROGATE, CFU_REGISTER, CFU_ACTIVATE, CFU_DEACTIVATE, CFU_ERASE, CFU_INTERROGATE, CLIR_ACTIVATE, CLIR_DEACTIVATE, CLIR_INTERROGATE, CP_INVOKE, CW_ACTIVATE, CW_DEACTIVATE, CW_INVOKE, DND_ACTIVATE, DND_DEACTIVATE, DND_INTERROGATE, EXT_INVOKE, LINE_INVOKE, MAILBOX_INVOKE, OCB_ACTIVATE, OCB_DEACTIVATE, OCB_INTERROGATE, PSO_ACTIVATE, PW_SET, SCF_ACTIVATE, SCF_DEACTIVATE, SCF_INTERROGATE, SCREJ_ACTIVATE, SCREJ_DEACTIVATE, SCREJ_INTERROGATE, SR_ACTIVATE, SR_DEACTIVATE, SR_INTERROGATE]

The list MAY include vendor-specific Facility Actions, which MUST use the format defined in {{bibref|TR-106}}.

Facility Actions are referenced in the VoiceService data model in the objects {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} and {{object|.Terminal.{i}.ButtonMap.Button.{i}.}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FacilityActions")
	@XmlList
	public Collection<String> facilityActions;
	/**
	 * SIP-specific capabilities (as defined in {{bibref|RFC3261}}).
	 */
	@XmlElement(name = "SIP")
	public SIP sip;
	/**
	 * MGCP-specific capabilities (as defined in {{bibref|RFC3435}}).
	 */
	@XmlElement(name = "MGCP")
	public MGCP mgcP;
	/**
	 * H.323-specific capabilities (as defined in {{bibref|H.323}}).
	 */
	@XmlElement(name = "H323")
	public H323 h323;
	/**
	 * The overall ISDN capabilities of external ports of the CPE.
	 */
	@XmlElement(name = "ISDN")
	public ISDN isdN;
	/**
	 * The overall POTS capabilities of external ports of the CPE.
	 */
	@XmlElement(name = "POTS")
	public POTS potS;
	/**
	 * Table to describe the set of supported codecs.
	 */
	@XmlElementWrapper(name = "Codecs")
	@XmlElement(name = "Codec")
	public Collection<Codec> codecs;
	/**
	 * Specific capabilities concerning quality indicators.
	 */
	@XmlElement(name = "QualityIndicator")
	public QualityIndicator qualityIndicator;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum total number of {{object|.CallControl.Line}} objects supported.

A value of -1 indicates no specific limit on the number of lines.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxLineCount() {
		return maxLineCount;
	}

	/**
	 * Set the maximum total number of {{object|.CallControl.Line}} objects supported.

A value of -1 indicates no specific limit on the number of lines.
	 *
	 * @since 2.0
	 * @param maxLineCount the input value
	 */
	public void  setMaxLineCount(Integer maxLineCount) {
		this.maxLineCount = maxLineCount;
	}

	/**
	 * Set the maximum total number of {{object|.CallControl.Line}} objects supported.

A value of -1 indicates no specific limit on the number of lines.
	 *
	 * @since 2.0
	 * @param maxLineCount the input value
	 * @return this instance
	 */
	public Capabilities withMaxLineCount(Integer maxLineCount) {
		this.maxLineCount = maxLineCount;
		return this;
	}

	/**
	 * Get the maximum total number of {{object|.CallControl.Extension}} objects supported.

A value of -1 indicates no specific limit on the number of extensions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxExtensionCount() {
		return maxExtensionCount;
	}

	/**
	 * Set the maximum total number of {{object|.CallControl.Extension}} objects supported.

A value of -1 indicates no specific limit on the number of extensions.
	 *
	 * @since 2.0
	 * @param maxExtensionCount the input value
	 */
	public void  setMaxExtensionCount(Integer maxExtensionCount) {
		this.maxExtensionCount = maxExtensionCount;
	}

	/**
	 * Set the maximum total number of {{object|.CallControl.Extension}} objects supported.

A value of -1 indicates no specific limit on the number of extensions.
	 *
	 * @since 2.0
	 * @param maxExtensionCount the input value
	 * @return this instance
	 */
	public Capabilities withMaxExtensionCount(Integer maxExtensionCount) {
		this.maxExtensionCount = maxExtensionCount;
		return this;
	}

	/**
	 * Get the maximum total number of {{object|.CallLog}} objects supported.

A value of -1 indicates no specific limit on the number of call logs.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxCallLogCount() {
		return maxCallLogCount;
	}

	/**
	 * Set the maximum total number of {{object|.CallLog}} objects supported.

A value of -1 indicates no specific limit on the number of call logs.
	 *
	 * @since 2.0
	 * @param maxCallLogCount the input value
	 */
	public void  setMaxCallLogCount(Integer maxCallLogCount) {
		this.maxCallLogCount = maxCallLogCount;
	}

	/**
	 * Set the maximum total number of {{object|.CallLog}} objects supported.

A value of -1 indicates no specific limit on the number of call logs.
	 *
	 * @since 2.0
	 * @param maxCallLogCount the input value
	 * @return this instance
	 */
	public Capabilities withMaxCallLogCount(Integer maxCallLogCount) {
		this.maxCallLogCount = maxCallLogCount;
		return this;
	}

	/**
	 * Get the maximum number of voice sessions supported for any given {{object|.CallControl.Line}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per line.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxSessionsPerLine() {
		return maxSessionsPerLine;
	}

	/**
	 * Set the maximum number of voice sessions supported for any given {{object|.CallControl.Line}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per line.
	 *
	 * @since 2.0
	 * @param maxSessionsPerLine the input value
	 */
	public void  setMaxSessionsPerLine(Integer maxSessionsPerLine) {
		this.maxSessionsPerLine = maxSessionsPerLine;
	}

	/**
	 * Set the maximum number of voice sessions supported for any given {{object|.CallControl.Line}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per line.
	 *
	 * @since 2.0
	 * @param maxSessionsPerLine the input value
	 * @return this instance
	 */
	public Capabilities withMaxSessionsPerLine(Integer maxSessionsPerLine) {
		this.maxSessionsPerLine = maxSessionsPerLine;
		return this;
	}

	/**
	 * Get the maximum number of voice sessions supported for any given {{object|.CallControl.Extension}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per extension.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxSessionsPerExtension() {
		return maxSessionsPerExtension;
	}

	/**
	 * Set the maximum number of voice sessions supported for any given {{object|.CallControl.Extension}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per extension.
	 *
	 * @since 2.0
	 * @param maxSessionsPerExtension the input value
	 */
	public void  setMaxSessionsPerExtension(Integer maxSessionsPerExtension) {
		this.maxSessionsPerExtension = maxSessionsPerExtension;
	}

	/**
	 * Set the maximum number of voice sessions supported for any given {{object|.CallControl.Extension}} object.  A value greater than one indicates support for CPE-provided conference calling.

A value of -1 indicates no specific limit on the number of voice sessions per extension.
	 *
	 * @since 2.0
	 * @param maxSessionsPerExtension the input value
	 * @return this instance
	 */
	public Capabilities withMaxSessionsPerExtension(Integer maxSessionsPerExtension) {
		this.maxSessionsPerExtension = maxSessionsPerExtension;
		return this;
	}

	/**
	 * Get the maximum total number of voice sessions supported across all {{object|.CallControl.Line}} objects.  (This might differ from {{param|MaxLineCount}} if each line can support more than one session for CPE-provided conference calling.  This value MAY be less than the product of {{param|MaxLineCount}} and {{param|MaxSessionsPerLine}}.)

A value of -1 indicates no specific limit on the number of voice sessions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMaxSessionCount() {
		return maxSessionCount;
	}

	/**
	 * Set the maximum total number of voice sessions supported across all {{object|.CallControl.Line}} objects.  (This might differ from {{param|MaxLineCount}} if each line can support more than one session for CPE-provided conference calling.  This value MAY be less than the product of {{param|MaxLineCount}} and {{param|MaxSessionsPerLine}}.)

A value of -1 indicates no specific limit on the number of voice sessions.
	 *
	 * @since 2.0
	 * @param maxSessionCount the input value
	 */
	public void  setMaxSessionCount(Integer maxSessionCount) {
		this.maxSessionCount = maxSessionCount;
	}

	/**
	 * Set the maximum total number of voice sessions supported across all {{object|.CallControl.Line}} objects.  (This might differ from {{param|MaxLineCount}} if each line can support more than one session for CPE-provided conference calling.  This value MAY be less than the product of {{param|MaxLineCount}} and {{param|MaxSessionsPerLine}}.)

A value of -1 indicates no specific limit on the number of voice sessions.
	 *
	 * @since 2.0
	 * @param maxSessionCount the input value
	 * @return this instance
	 */
	public Capabilities withMaxSessionCount(Integer maxSessionCount) {
		this.maxSessionCount = maxSessionCount;
		return this;
	}

	/**
	 * Get the {{list}}  Each item is a supported network connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getNetworkConnectionModes() {
		if (this.networkConnectionModes == null){ this.networkConnectionModes=new ArrayList<>();}
		return networkConnectionModes;
	}

	/**
	 * Set the {{list}}  Each item is a supported network connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 * @param networkConnectionModes the input value
	 */
	public void  setNetworkConnectionModes(Collection<String> networkConnectionModes) {
		this.networkConnectionModes = networkConnectionModes;
	}

	/**
	 * Set the {{list}}  Each item is a supported network connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withNetworkConnectionModes(String string) {
		getNetworkConnectionModes().add(string);
		return this;
	}

	/**
	 * Get the {{list}}  Each item is a supported user connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getUserConnectionModes() {
		if (this.userConnectionModes == null){ this.userConnectionModes=new ArrayList<>();}
		return userConnectionModes;
	}

	/**
	 * Set the {{list}}  Each item is a supported user connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 * @param userConnectionModes the input value
	 */
	public void  setUserConnectionModes(Collection<String> userConnectionModes) {
		this.userConnectionModes = userConnectionModes;
	}

	/**
	 * Set the {{list}}  Each item is a supported user connection mode.  {{pattern}}

Most entries MAY be appended with a version indicator in the form "/X.Y".  For example:

"SIP/2.0"

The list MAY include vendor-specific modes, which MUST be in the format defined in {{bibref|TR-106}}.  For example:

"X_EXAMPLE-COM_MyMode"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withUserConnectionModes(String string) {
		getUserConnectionModes().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported tone file format.  The specified file formats are raw codec data files, using one of the codecs listed below. 

Enumerated value must be one of [G.711MuLaw, G.711ALaw, G.729, MP3, WAV, AMR]

The list MAY include vendor-specific -specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"G.711MuLaw, MP3, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support tone files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getToneFileFormats() {
		if (this.toneFileFormats == null){ this.toneFileFormats=new ArrayList<>();}
		return toneFileFormats;
	}

	/**
	 * Set the {{list}} Each item is a supported tone file format.  The specified file formats are raw codec data files, using one of the codecs listed below. 

Enumerated value must be one of [G.711MuLaw, G.711ALaw, G.729, MP3, WAV, AMR]

The list MAY include vendor-specific -specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"G.711MuLaw, MP3, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support tone files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param toneFileFormats the input value
	 */
	public void  setToneFileFormats(Collection<String> toneFileFormats) {
		this.toneFileFormats = toneFileFormats;
	}

	/**
	 * Set the {{list}} Each item is a supported tone file format.  The specified file formats are raw codec data files, using one of the codecs listed below. 

Enumerated value must be one of [G.711MuLaw, G.711ALaw, G.729, MP3, WAV, AMR]

The list MAY include vendor-specific -specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"G.711MuLaw, MP3, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support tone files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withToneFileFormats(String string) {
		getToneFileFormats().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a supported ring file format. 

Enumerated value must be one of [MIDI, SMAF, RTTTL, MP3, WAV, AMR]

The list MAY include vendor-specific-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"MIDI, AMR, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support ring files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getRingFileFormats() {
		if (this.ringFileFormats == null){ this.ringFileFormats=new ArrayList<>();}
		return ringFileFormats;
	}

	/**
	 * Set the {{list}} Each item is a supported ring file format. 

Enumerated value must be one of [MIDI, SMAF, RTTTL, MP3, WAV, AMR]

The list MAY include vendor-specific-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"MIDI, AMR, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support ring files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param ringFileFormats the input value
	 */
	public void  setRingFileFormats(Collection<String> ringFileFormats) {
		this.ringFileFormats = ringFileFormats;
	}

	/**
	 * Set the {{list}} Each item is a supported ring file format. 

Enumerated value must be one of [MIDI, SMAF, RTTTL, MP3, WAV, AMR]

The list MAY include vendor-specific-specific extensions, which MUST use the format defined in {{bibref|TR-106}}.

Example:

"MIDI, AMR, X_EXAMPLE-COM_MyFileFormat"

If the CPE does not support ring files, this parameter MUST be {{empty}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withRingFileFormats(String string) {
		getRingFileFormats().add(string);
		return this;
	}

	/**
	 * Get the facility actions supported by this VoiceService.  

Enumerated value must be one of [AA_REGISTER, AA_ERASE, AA_INTERROGATE, CA_ACTIVATE, CCBS_ACTIVATE, CCBS_DEACTIVATE, CCBS_INTERROGATE, CCNR_ACTIVATE, CCNR_DEACTIVATE, CCNR_INTERROGATE, CFB_REGISTER, CFB_ACTIVATE, CFB_DEACTIVATE, CFB_ERASE, CFB_INTERROGATE, CFNR_REGISTER, CFNR_ACTIVATE, CFNR_DEACTIVATE, CFNR_ERASE, CFNR_INTERROGATE, CFNR_TIMER, CFT_ACTIVATE, CFT_DEACTIVATE, CFT_INTERROGATE, CFU_REGISTER, CFU_ACTIVATE, CFU_DEACTIVATE, CFU_ERASE, CFU_INTERROGATE, CLIR_ACTIVATE, CLIR_DEACTIVATE, CLIR_INTERROGATE, CP_INVOKE, CW_ACTIVATE, CW_DEACTIVATE, CW_INVOKE, DND_ACTIVATE, DND_DEACTIVATE, DND_INTERROGATE, EXT_INVOKE, LINE_INVOKE, MAILBOX_INVOKE, OCB_ACTIVATE, OCB_DEACTIVATE, OCB_INTERROGATE, PSO_ACTIVATE, PW_SET, SCF_ACTIVATE, SCF_DEACTIVATE, SCF_INTERROGATE, SCREJ_ACTIVATE, SCREJ_DEACTIVATE, SCREJ_INTERROGATE, SR_ACTIVATE, SR_DEACTIVATE, SR_INTERROGATE]

The list MAY include vendor-specific Facility Actions, which MUST use the format defined in {{bibref|TR-106}}.

Facility Actions are referenced in the VoiceService data model in the objects {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} and {{object|.Terminal.{i}.ButtonMap.Button.{i}.}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFacilityActions() {
		if (this.facilityActions == null){ this.facilityActions=new ArrayList<>();}
		return facilityActions;
	}

	/**
	 * Set the facility actions supported by this VoiceService.  

Enumerated value must be one of [AA_REGISTER, AA_ERASE, AA_INTERROGATE, CA_ACTIVATE, CCBS_ACTIVATE, CCBS_DEACTIVATE, CCBS_INTERROGATE, CCNR_ACTIVATE, CCNR_DEACTIVATE, CCNR_INTERROGATE, CFB_REGISTER, CFB_ACTIVATE, CFB_DEACTIVATE, CFB_ERASE, CFB_INTERROGATE, CFNR_REGISTER, CFNR_ACTIVATE, CFNR_DEACTIVATE, CFNR_ERASE, CFNR_INTERROGATE, CFNR_TIMER, CFT_ACTIVATE, CFT_DEACTIVATE, CFT_INTERROGATE, CFU_REGISTER, CFU_ACTIVATE, CFU_DEACTIVATE, CFU_ERASE, CFU_INTERROGATE, CLIR_ACTIVATE, CLIR_DEACTIVATE, CLIR_INTERROGATE, CP_INVOKE, CW_ACTIVATE, CW_DEACTIVATE, CW_INVOKE, DND_ACTIVATE, DND_DEACTIVATE, DND_INTERROGATE, EXT_INVOKE, LINE_INVOKE, MAILBOX_INVOKE, OCB_ACTIVATE, OCB_DEACTIVATE, OCB_INTERROGATE, PSO_ACTIVATE, PW_SET, SCF_ACTIVATE, SCF_DEACTIVATE, SCF_INTERROGATE, SCREJ_ACTIVATE, SCREJ_DEACTIVATE, SCREJ_INTERROGATE, SR_ACTIVATE, SR_DEACTIVATE, SR_INTERROGATE]

The list MAY include vendor-specific Facility Actions, which MUST use the format defined in {{bibref|TR-106}}.

Facility Actions are referenced in the VoiceService data model in the objects {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} and {{object|.Terminal.{i}.ButtonMap.Button.{i}.}}.
	 *
	 * @since 2.0
	 * @param facilityActions the input value
	 */
	public void  setFacilityActions(Collection<String> facilityActions) {
		this.facilityActions = facilityActions;
	}

	/**
	 * Set the facility actions supported by this VoiceService.  

Enumerated value must be one of [AA_REGISTER, AA_ERASE, AA_INTERROGATE, CA_ACTIVATE, CCBS_ACTIVATE, CCBS_DEACTIVATE, CCBS_INTERROGATE, CCNR_ACTIVATE, CCNR_DEACTIVATE, CCNR_INTERROGATE, CFB_REGISTER, CFB_ACTIVATE, CFB_DEACTIVATE, CFB_ERASE, CFB_INTERROGATE, CFNR_REGISTER, CFNR_ACTIVATE, CFNR_DEACTIVATE, CFNR_ERASE, CFNR_INTERROGATE, CFNR_TIMER, CFT_ACTIVATE, CFT_DEACTIVATE, CFT_INTERROGATE, CFU_REGISTER, CFU_ACTIVATE, CFU_DEACTIVATE, CFU_ERASE, CFU_INTERROGATE, CLIR_ACTIVATE, CLIR_DEACTIVATE, CLIR_INTERROGATE, CP_INVOKE, CW_ACTIVATE, CW_DEACTIVATE, CW_INVOKE, DND_ACTIVATE, DND_DEACTIVATE, DND_INTERROGATE, EXT_INVOKE, LINE_INVOKE, MAILBOX_INVOKE, OCB_ACTIVATE, OCB_DEACTIVATE, OCB_INTERROGATE, PSO_ACTIVATE, PW_SET, SCF_ACTIVATE, SCF_DEACTIVATE, SCF_INTERROGATE, SCREJ_ACTIVATE, SCREJ_DEACTIVATE, SCREJ_INTERROGATE, SR_ACTIVATE, SR_DEACTIVATE, SR_INTERROGATE]

The list MAY include vendor-specific Facility Actions, which MUST use the format defined in {{bibref|TR-106}}.

Facility Actions are referenced in the VoiceService data model in the objects {{object|.CallControl.NumberingPlan.{i}.PrefixInfo.{i}.}} and {{object|.Terminal.{i}.ButtonMap.Button.{i}.}}.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withFacilityActions(String string) {
		getFacilityActions().add(string);
		return this;
	}

	/**
	 * Get the sip-specific capabilities (as defined in {{bibref|RFC3261}}).
	 *
	 * @return the value
	 */
	public SIP getSip() {
		return sip;
	}

	/**
	 * Set the sip-specific capabilities (as defined in {{bibref|RFC3261}}).
	 *
	 * @param sip the input value
	 */
	public void  setSip(SIP sip) {
		this.sip = sip;
	}

	/**
	 * Set the sip-specific capabilities (as defined in {{bibref|RFC3261}}).
	 *
	 * @param sip the input value
	 * @return this instance
	 */
	public Capabilities withSip(SIP sip) {
		this.sip = sip;
		return this;
	}

	/**
	 * Get the mgcP-specific capabilities (as defined in {{bibref|RFC3435}}).
	 *
	 * @return the value
	 */
	public MGCP getMgcP() {
		return mgcP;
	}

	/**
	 * Set the mgcP-specific capabilities (as defined in {{bibref|RFC3435}}).
	 *
	 * @param mgcP the input value
	 */
	public void  setMgcP(MGCP mgcP) {
		this.mgcP = mgcP;
	}

	/**
	 * Set the mgcP-specific capabilities (as defined in {{bibref|RFC3435}}).
	 *
	 * @param mgcP the input value
	 * @return this instance
	 */
	public Capabilities withMgcP(MGCP mgcP) {
		this.mgcP = mgcP;
		return this;
	}

	/**
	 * Get the h.323-specific capabilities (as defined in {{bibref|H.323}}).
	 *
	 * @return the value
	 */
	public H323 getH323() {
		return h323;
	}

	/**
	 * Set the h.323-specific capabilities (as defined in {{bibref|H.323}}).
	 *
	 * @param h323 the input value
	 */
	public void  setH323(H323 h323) {
		this.h323 = h323;
	}

	/**
	 * Set the h.323-specific capabilities (as defined in {{bibref|H.323}}).
	 *
	 * @param h323 the input value
	 * @return this instance
	 */
	public Capabilities withH323(H323 h323) {
		this.h323 = h323;
		return this;
	}

	/**
	 * Get the overall ISDN capabilities of external ports of the CPE.
	 *
	 * @return the value
	 */
	public ISDN getIsdN() {
		return isdN;
	}

	/**
	 * Set the overall ISDN capabilities of external ports of the CPE.
	 *
	 * @param isdN the input value
	 */
	public void  setIsdN(ISDN isdN) {
		this.isdN = isdN;
	}

	/**
	 * Set the overall ISDN capabilities of external ports of the CPE.
	 *
	 * @param isdN the input value
	 * @return this instance
	 */
	public Capabilities withIsdN(ISDN isdN) {
		this.isdN = isdN;
		return this;
	}

	/**
	 * Get the overall POTS capabilities of external ports of the CPE.
	 *
	 * @return the value
	 */
	public POTS getPotS() {
		return potS;
	}

	/**
	 * Set the overall POTS capabilities of external ports of the CPE.
	 *
	 * @param potS the input value
	 */
	public void  setPotS(POTS potS) {
		this.potS = potS;
	}

	/**
	 * Set the overall POTS capabilities of external ports of the CPE.
	 *
	 * @param potS the input value
	 * @return this instance
	 */
	public Capabilities withPotS(POTS potS) {
		this.potS = potS;
		return this;
	}

	/**
	 * Get the table to describe the set of supported codecs.
	 *
	 * @return the value
	 */
	public Collection<Codec> getCodecs() {
		if (this.codecs == null){ this.codecs=new ArrayList<>();}
		return codecs;
	}

	/**
	 * Set the table to describe the set of supported codecs.
	 *
	 * @param codecs the input value
	 */
	public void  setCodecs(Collection<Codec> codecs) {
		this.codecs = codecs;
	}

	/**
	 * Set the table to describe the set of supported codecs.
	 *
	 * @param codec the input value
	 * @return this instance
	 */
	public Capabilities withCodec(Codec codec) {
		getCodecs().add(codec);
		return this;
	}

	/**
	 * Get the specific capabilities concerning quality indicators.
	 *
	 * @return the value
	 */
	public QualityIndicator getQualityIndicator() {
		return qualityIndicator;
	}

	/**
	 * Set the specific capabilities concerning quality indicators.
	 *
	 * @param qualityIndicator the input value
	 */
	public void  setQualityIndicator(QualityIndicator qualityIndicator) {
		this.qualityIndicator = qualityIndicator;
	}

	/**
	 * Set the specific capabilities concerning quality indicators.
	 *
	 * @param qualityIndicator the input value
	 * @return this instance
	 */
	public Capabilities withQualityIndicator(QualityIndicator qualityIndicator) {
		this.qualityIndicator = qualityIndicator;
		return this;
	}

	//</editor-fold>

}