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
package org.broadbandforum.tr104;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;
import org.broadbandforum.tr104.voiceservice.CallControl;
import org.broadbandforum.tr104.voiceservice.CallLog;
import org.broadbandforum.tr104.voiceservice.Capabilities;
import org.broadbandforum.tr104.voiceservice.ClockSynchronization;
import org.broadbandforum.tr104.voiceservice.CodecProfile;
import org.broadbandforum.tr104.voiceservice.DECT;
import org.broadbandforum.tr104.voiceservice.H323;
import org.broadbandforum.tr104.voiceservice.ISDN;
import org.broadbandforum.tr104.voiceservice.Interwork;
import org.broadbandforum.tr104.voiceservice.MGCP;
import org.broadbandforum.tr104.voiceservice.POTS;
import org.broadbandforum.tr104.voiceservice.ReservedPorts;
import org.broadbandforum.tr104.voiceservice.SIP;
import org.broadbandforum.tr104.voiceservice.Terminal;
import org.broadbandforum.tr104.voiceservice.Tone;
import org.broadbandforum.tr104.voiceservice.Trunk;
import org.broadbandforum.tr104.voiceservice.VoIPProfile;

	/**
	 * The top-level object for CPE with voice capabilities.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.")
public class VoiceService {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The overall capabilities of the VoIP CPE.
	 */
	@XmlElement(name = "Capabilities")
	public Capabilities capabilities;
	/**
	 * The list of IP ports on the CPE WAN and LAN interfaces that will not be allocated by the ACS and therefore are available to be allocated by the CPE. The CPE can dynamically allocate ports from this range for things like signaling listening ports or local RTP ports.
	 */
	@XmlElement(name = "ReservedPorts")
	public ReservedPorts reservedPorts;
	/**
	 * This object models ISDN physical interfaces (BRI and PRI) supporting {{bibref|Q.931}} based signalling.
	 */
	@XmlElement(name = "ISDN")
	public ISDN isdN;
	/**
	 * This object models analogue lines. Both FXO and FXS are handled.
	 */
	@XmlElement(name = "POTS")
	public POTS potS;
	/**
	 * This object models DECT bases and portables.
	 */
	@XmlElement(name = "DECT")
	public DECT decT;
	/**
	 * This object is dedicated to SIP as defined in {{bibref|RFC3261}}. It models SIP networks, clients, proxies and registrars.
	 */
	@XmlElement(name = "SIP")
	public SIP sip;
	/**
	 * This object is dedicated to MGCP as defined in {{bibref|RFC3435}}. It models MGCP clients and networks.
	 */
	@XmlElement(name = "MGCP")
	public MGCP mgcP;
	/**
	 * This object is dedicated to H.323 as defined in {{bibref|H.323}}. It models H.323 clients and networks.
	 */
	@XmlElement(name = "H323")
	public H323 h323;
	/**
	 * Trunk table.

The {{object}} holds all parameters a CPE needs to set up a trunk connection with an NGN, as defined in {{bibref|ETSI_TS_181_019}}.
	 */
	@XmlElementWrapper(name = "Trunks")
	@XmlElement(name = "Trunk")
	@CWMPParameter(access = "readWrite")
	public Collection<Trunk> trunks;
	/**
	 * Call control and call routing parameters. This object is a control plane application for the VoiceService that provides numbers or names based routing, local PBX functionalities and advanced telephony features.

It is mutually exclusive with the {{object|.Interwork}} table which is used in case of switching capabilities.
	 */
	@XmlElement(name = "CallControl")
	public CallControl callControl;
	/**
	 * Each entry in this table configures Inter-Working Function switching features.

It is mutually exclusive with the {{object|.CallControl}} object which is used in case of PBX or Endpoint capabilities.
	 */
	@XmlElementWrapper(name = "Interworks")
	@XmlElement(name = "Interwork")
	@CWMPParameter(access = "readWrite")
	public Collection<Interwork> interworks;
	/**
	 * This table contains a list of calls. An entry is similar to a CDR (Call Detail Record) as used in PBX or on mobile phones.

An entry is created each time a call is terminated. If the number of {{object|.CallLog}} exceeds {{param|.Capabilities.MaxCallLogCount}}, the CPE SHOULD remove the oldest {{object|.CallLog}} object on basis of {{param|Start}} parameter.
	 */
	@XmlElementWrapper(name = "CallLogs")
	@XmlElement(name = "CallLog")
	public Collection<CallLog> callLogs;
	/**
	 * Configuration profile that can be shared by VoIP components.

A VoIP Profile contains media transport configuration parameters that are common to different VoIP protocols.

VoIP Profiles could be used by {{object|.SIP.Network.}}, {{object|.SIP.Proxy.}}, {{object|.SIP.Network.}}, {{object|.H323.Network.}} and {{object|.MGCP.Network.}}.
	 */
	@XmlElementWrapper(name = "VoIPProfiles")
	@XmlElement(name = "VoIPProfile")
	@CWMPParameter(access = "readWrite")
	public Collection<VoIPProfile> voiPProfiles;
	/**
	 * Table of codec profiles. This table MUST be populated with the set of supported codecs matching {{object|.Capabilities.Codec.}}. Additional entries can be added to use different configurations of codec or to use the same codec configuration in different CodecList parameters.
	 */
	@XmlElementWrapper(name = "CodecProfiles")
	@XmlElement(name = "CodecProfile")
	@CWMPParameter(access = "readWrite")
	public Collection<CodecProfile> codecProfiles;
	/**
	 * This object defines the contents of the tones and announcements generated locally by the VoIP device.
	 */
	@XmlElement(name = "Tone")
	public Tone tone;
	/**
	 * This object models a telephony terminal, each object in the table represents an end-user interface.

This object has to be used when the CPE is a voice endpoint itself.
	 */
	@XmlElementWrapper(name = "Terminals")
	@XmlElement(name = "Terminal")
	@CWMPParameter(minEntries = 1)
	public Collection<Terminal> terminals;
	/**
	 * Clock source configuration for Time-Division multiplexing subsystem.
	 */
	@XmlElement(name = "ClockSynchronization")
	public ClockSynchronization clockSynchronization;

	public VoiceService() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public VoiceService withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the overall capabilities of the VoIP CPE.
	 *
	 * @return the value
	 */
	public Capabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Set the overall capabilities of the VoIP CPE.
	 *
	 * @param capabilities the input value
	 */
	public void  setCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
	}

	/**
	 * Set the overall capabilities of the VoIP CPE.
	 *
	 * @param capabilities the input value
	 * @return this instance
	 */
	public VoiceService withCapabilities(Capabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	/**
	 * Get the list of IP ports on the CPE WAN and LAN interfaces that will not be allocated by the ACS and therefore are available to be allocated by the CPE. The CPE can dynamically allocate ports from this range for things like signaling listening ports or local RTP ports.
	 *
	 * @return the value
	 */
	public ReservedPorts getReservedPorts() {
		return reservedPorts;
	}

	/**
	 * Set the list of IP ports on the CPE WAN and LAN interfaces that will not be allocated by the ACS and therefore are available to be allocated by the CPE. The CPE can dynamically allocate ports from this range for things like signaling listening ports or local RTP ports.
	 *
	 * @param reservedPorts the input value
	 */
	public void  setReservedPorts(ReservedPorts reservedPorts) {
		this.reservedPorts = reservedPorts;
	}

	/**
	 * Set the list of IP ports on the CPE WAN and LAN interfaces that will not be allocated by the ACS and therefore are available to be allocated by the CPE. The CPE can dynamically allocate ports from this range for things like signaling listening ports or local RTP ports.
	 *
	 * @param reservedPorts the input value
	 * @return this instance
	 */
	public VoiceService withReservedPorts(ReservedPorts reservedPorts) {
		this.reservedPorts = reservedPorts;
		return this;
	}

	/**
	 * Get the this object models ISDN physical interfaces (BRI and PRI) supporting {{bibref|Q.931}} based signalling.
	 *
	 * @return the value
	 */
	public ISDN getIsdN() {
		return isdN;
	}

	/**
	 * Set the this object models ISDN physical interfaces (BRI and PRI) supporting {{bibref|Q.931}} based signalling.
	 *
	 * @param isdN the input value
	 */
	public void  setIsdN(ISDN isdN) {
		this.isdN = isdN;
	}

	/**
	 * Set the this object models ISDN physical interfaces (BRI and PRI) supporting {{bibref|Q.931}} based signalling.
	 *
	 * @param isdN the input value
	 * @return this instance
	 */
	public VoiceService withIsdN(ISDN isdN) {
		this.isdN = isdN;
		return this;
	}

	/**
	 * Get the this object models analogue lines. Both FXO and FXS are handled.
	 *
	 * @return the value
	 */
	public POTS getPotS() {
		return potS;
	}

	/**
	 * Set the this object models analogue lines. Both FXO and FXS are handled.
	 *
	 * @param potS the input value
	 */
	public void  setPotS(POTS potS) {
		this.potS = potS;
	}

	/**
	 * Set the this object models analogue lines. Both FXO and FXS are handled.
	 *
	 * @param potS the input value
	 * @return this instance
	 */
	public VoiceService withPotS(POTS potS) {
		this.potS = potS;
		return this;
	}

	/**
	 * Get the this object models DECT bases and portables.
	 *
	 * @return the value
	 */
	public DECT getDecT() {
		return decT;
	}

	/**
	 * Set the this object models DECT bases and portables.
	 *
	 * @param decT the input value
	 */
	public void  setDecT(DECT decT) {
		this.decT = decT;
	}

	/**
	 * Set the this object models DECT bases and portables.
	 *
	 * @param decT the input value
	 * @return this instance
	 */
	public VoiceService withDecT(DECT decT) {
		this.decT = decT;
		return this;
	}

	/**
	 * Get the this object is dedicated to SIP as defined in {{bibref|RFC3261}}. It models SIP networks, clients, proxies and registrars.
	 *
	 * @return the value
	 */
	public SIP getSip() {
		return sip;
	}

	/**
	 * Set the this object is dedicated to SIP as defined in {{bibref|RFC3261}}. It models SIP networks, clients, proxies and registrars.
	 *
	 * @param sip the input value
	 */
	public void  setSip(SIP sip) {
		this.sip = sip;
	}

	/**
	 * Set the this object is dedicated to SIP as defined in {{bibref|RFC3261}}. It models SIP networks, clients, proxies and registrars.
	 *
	 * @param sip the input value
	 * @return this instance
	 */
	public VoiceService withSip(SIP sip) {
		this.sip = sip;
		return this;
	}

	/**
	 * Get the this object is dedicated to MGCP as defined in {{bibref|RFC3435}}. It models MGCP clients and networks.
	 *
	 * @return the value
	 */
	public MGCP getMgcP() {
		return mgcP;
	}

	/**
	 * Set the this object is dedicated to MGCP as defined in {{bibref|RFC3435}}. It models MGCP clients and networks.
	 *
	 * @param mgcP the input value
	 */
	public void  setMgcP(MGCP mgcP) {
		this.mgcP = mgcP;
	}

	/**
	 * Set the this object is dedicated to MGCP as defined in {{bibref|RFC3435}}. It models MGCP clients and networks.
	 *
	 * @param mgcP the input value
	 * @return this instance
	 */
	public VoiceService withMgcP(MGCP mgcP) {
		this.mgcP = mgcP;
		return this;
	}

	/**
	 * Get the this object is dedicated to H.323 as defined in {{bibref|H.323}}. It models H.323 clients and networks.
	 *
	 * @return the value
	 */
	public H323 getH323() {
		return h323;
	}

	/**
	 * Set the this object is dedicated to H.323 as defined in {{bibref|H.323}}. It models H.323 clients and networks.
	 *
	 * @param h323 the input value
	 */
	public void  setH323(H323 h323) {
		this.h323 = h323;
	}

	/**
	 * Set the this object is dedicated to H.323 as defined in {{bibref|H.323}}. It models H.323 clients and networks.
	 *
	 * @param h323 the input value
	 * @return this instance
	 */
	public VoiceService withH323(H323 h323) {
		this.h323 = h323;
		return this;
	}

	/**
	 * Get the trunk table.

The {{object}} holds all parameters a CPE needs to set up a trunk connection with an NGN, as defined in {{bibref|ETSI_TS_181_019}}.
	 *
	 * @return the value
	 */
	public Collection<Trunk> getTrunks() {
		if (this.trunks == null){ this.trunks=new ArrayList<>();}
		return trunks;
	}

	/**
	 * Set the trunk table.

The {{object}} holds all parameters a CPE needs to set up a trunk connection with an NGN, as defined in {{bibref|ETSI_TS_181_019}}.
	 *
	 * @param trunks the input value
	 */
	public void  setTrunks(Collection<Trunk> trunks) {
		this.trunks = trunks;
	}

	/**
	 * Set the trunk table.

The {{object}} holds all parameters a CPE needs to set up a trunk connection with an NGN, as defined in {{bibref|ETSI_TS_181_019}}.
	 *
	 * @param trunk the input value
	 * @return this instance
	 */
	public VoiceService withTrunk(Trunk trunk) {
		getTrunks().add(trunk);
		return this;
	}

	/**
	 * Get the call control and call routing parameters. This object is a control plane application for the VoiceService that provides numbers or names based routing, local PBX functionalities and advanced telephony features.

It is mutually exclusive with the {{object|.Interwork}} table which is used in case of switching capabilities.
	 *
	 * @return the value
	 */
	public CallControl getCallControl() {
		return callControl;
	}

	/**
	 * Set the call control and call routing parameters. This object is a control plane application for the VoiceService that provides numbers or names based routing, local PBX functionalities and advanced telephony features.

It is mutually exclusive with the {{object|.Interwork}} table which is used in case of switching capabilities.
	 *
	 * @param callControl the input value
	 */
	public void  setCallControl(CallControl callControl) {
		this.callControl = callControl;
	}

	/**
	 * Set the call control and call routing parameters. This object is a control plane application for the VoiceService that provides numbers or names based routing, local PBX functionalities and advanced telephony features.

It is mutually exclusive with the {{object|.Interwork}} table which is used in case of switching capabilities.
	 *
	 * @param callControl the input value
	 * @return this instance
	 */
	public VoiceService withCallControl(CallControl callControl) {
		this.callControl = callControl;
		return this;
	}

	/**
	 * Get the each entry in this table configures Inter-Working Function switching features.

It is mutually exclusive with the {{object|.CallControl}} object which is used in case of PBX or Endpoint capabilities.
	 *
	 * @return the value
	 */
	public Collection<Interwork> getInterworks() {
		if (this.interworks == null){ this.interworks=new ArrayList<>();}
		return interworks;
	}

	/**
	 * Set the each entry in this table configures Inter-Working Function switching features.

It is mutually exclusive with the {{object|.CallControl}} object which is used in case of PBX or Endpoint capabilities.
	 *
	 * @param interworks the input value
	 */
	public void  setInterworks(Collection<Interwork> interworks) {
		this.interworks = interworks;
	}

	/**
	 * Set the each entry in this table configures Inter-Working Function switching features.

It is mutually exclusive with the {{object|.CallControl}} object which is used in case of PBX or Endpoint capabilities.
	 *
	 * @param interwork the input value
	 * @return this instance
	 */
	public VoiceService withInterwork(Interwork interwork) {
		getInterworks().add(interwork);
		return this;
	}

	/**
	 * Get the this table contains a list of calls. An entry is similar to a CDR (Call Detail Record) as used in PBX or on mobile phones.

An entry is created each time a call is terminated. If the number of {{object|.CallLog}} exceeds {{param|.Capabilities.MaxCallLogCount}}, the CPE SHOULD remove the oldest {{object|.CallLog}} object on basis of {{param|Start}} parameter.
	 *
	 * @return the value
	 */
	public Collection<CallLog> getCallLogs() {
		if (this.callLogs == null){ this.callLogs=new ArrayList<>();}
		return callLogs;
	}

	/**
	 * Set the this table contains a list of calls. An entry is similar to a CDR (Call Detail Record) as used in PBX or on mobile phones.

An entry is created each time a call is terminated. If the number of {{object|.CallLog}} exceeds {{param|.Capabilities.MaxCallLogCount}}, the CPE SHOULD remove the oldest {{object|.CallLog}} object on basis of {{param|Start}} parameter.
	 *
	 * @param callLogs the input value
	 */
	public void  setCallLogs(Collection<CallLog> callLogs) {
		this.callLogs = callLogs;
	}

	/**
	 * Set the this table contains a list of calls. An entry is similar to a CDR (Call Detail Record) as used in PBX or on mobile phones.

An entry is created each time a call is terminated. If the number of {{object|.CallLog}} exceeds {{param|.Capabilities.MaxCallLogCount}}, the CPE SHOULD remove the oldest {{object|.CallLog}} object on basis of {{param|Start}} parameter.
	 *
	 * @param callLog the input value
	 * @return this instance
	 */
	public VoiceService withCallLog(CallLog callLog) {
		getCallLogs().add(callLog);
		return this;
	}

	/**
	 * Get the configuration profile that can be shared by VoIP components.

A VoIP Profile contains media transport configuration parameters that are common to different VoIP protocols.

VoIP Profiles could be used by {{object|.SIP.Network.}}, {{object|.SIP.Proxy.}}, {{object|.SIP.Network.}}, {{object|.H323.Network.}} and {{object|.MGCP.Network.}}.
	 *
	 * @return the value
	 */
	public Collection<VoIPProfile> getVoiPProfiles() {
		if (this.voiPProfiles == null){ this.voiPProfiles=new ArrayList<>();}
		return voiPProfiles;
	}

	/**
	 * Set the configuration profile that can be shared by VoIP components.

A VoIP Profile contains media transport configuration parameters that are common to different VoIP protocols.

VoIP Profiles could be used by {{object|.SIP.Network.}}, {{object|.SIP.Proxy.}}, {{object|.SIP.Network.}}, {{object|.H323.Network.}} and {{object|.MGCP.Network.}}.
	 *
	 * @param voiPProfiles the input value
	 */
	public void  setVoiPProfiles(Collection<VoIPProfile> voiPProfiles) {
		this.voiPProfiles = voiPProfiles;
	}

	/**
	 * Set the configuration profile that can be shared by VoIP components.

A VoIP Profile contains media transport configuration parameters that are common to different VoIP protocols.

VoIP Profiles could be used by {{object|.SIP.Network.}}, {{object|.SIP.Proxy.}}, {{object|.SIP.Network.}}, {{object|.H323.Network.}} and {{object|.MGCP.Network.}}.
	 *
	 * @param voiPProfile the input value
	 * @return this instance
	 */
	public VoiceService withVoIPProfile(VoIPProfile voiPProfile) {
		getVoiPProfiles().add(voiPProfile);
		return this;
	}

	/**
	 * Get the table of codec profiles. This table MUST be populated with the set of supported codecs matching {{object|.Capabilities.Codec.}}. Additional entries can be added to use different configurations of codec or to use the same codec configuration in different CodecList parameters.
	 *
	 * @return the value
	 */
	public Collection<CodecProfile> getCodecProfiles() {
		if (this.codecProfiles == null){ this.codecProfiles=new ArrayList<>();}
		return codecProfiles;
	}

	/**
	 * Set the table of codec profiles. This table MUST be populated with the set of supported codecs matching {{object|.Capabilities.Codec.}}. Additional entries can be added to use different configurations of codec or to use the same codec configuration in different CodecList parameters.
	 *
	 * @param codecProfiles the input value
	 */
	public void  setCodecProfiles(Collection<CodecProfile> codecProfiles) {
		this.codecProfiles = codecProfiles;
	}

	/**
	 * Set the table of codec profiles. This table MUST be populated with the set of supported codecs matching {{object|.Capabilities.Codec.}}. Additional entries can be added to use different configurations of codec or to use the same codec configuration in different CodecList parameters.
	 *
	 * @param codecProfile the input value
	 * @return this instance
	 */
	public VoiceService withCodecProfile(CodecProfile codecProfile) {
		getCodecProfiles().add(codecProfile);
		return this;
	}

	/**
	 * Get the this object defines the contents of the tones and announcements generated locally by the VoIP device.
	 *
	 * @return the value
	 */
	public Tone getTone() {
		return tone;
	}

	/**
	 * Set the this object defines the contents of the tones and announcements generated locally by the VoIP device.
	 *
	 * @param tone the input value
	 */
	public void  setTone(Tone tone) {
		this.tone = tone;
	}

	/**
	 * Set the this object defines the contents of the tones and announcements generated locally by the VoIP device.
	 *
	 * @param tone the input value
	 * @return this instance
	 */
	public VoiceService withTone(Tone tone) {
		this.tone = tone;
		return this;
	}

	/**
	 * Get the this object models a telephony terminal, each object in the table represents an end-user interface.

This object has to be used when the CPE is a voice endpoint itself.
	 *
	 * @return the value
	 */
	public Collection<Terminal> getTerminals() {
		if (this.terminals == null){ this.terminals=new ArrayList<>();}
		return terminals;
	}

	/**
	 * Set the this object models a telephony terminal, each object in the table represents an end-user interface.

This object has to be used when the CPE is a voice endpoint itself.
	 *
	 * @param terminals the input value
	 */
	public void  setTerminals(Collection<Terminal> terminals) {
		this.terminals = terminals;
	}

	/**
	 * Set the this object models a telephony terminal, each object in the table represents an end-user interface.

This object has to be used when the CPE is a voice endpoint itself.
	 *
	 * @param terminal the input value
	 * @return this instance
	 */
	public VoiceService withTerminal(Terminal terminal) {
		getTerminals().add(terminal);
		return this;
	}

	/**
	 * Get the clock source configuration for Time-Division multiplexing subsystem.
	 *
	 * @return the value
	 */
	public ClockSynchronization getClockSynchronization() {
		return clockSynchronization;
	}

	/**
	 * Set the clock source configuration for Time-Division multiplexing subsystem.
	 *
	 * @param clockSynchronization the input value
	 */
	public void  setClockSynchronization(ClockSynchronization clockSynchronization) {
		this.clockSynchronization = clockSynchronization;
	}

	/**
	 * Set the clock source configuration for Time-Division multiplexing subsystem.
	 *
	 * @param clockSynchronization the input value
	 * @return this instance
	 */
	public VoiceService withClockSynchronization(ClockSynchronization clockSynchronization) {
		this.clockSynchronization = clockSynchronization;
		return this;
	}

	//</editor-fold>

}