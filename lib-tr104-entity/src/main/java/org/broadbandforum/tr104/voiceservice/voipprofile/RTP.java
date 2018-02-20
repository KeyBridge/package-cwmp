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
package org.broadbandforum.tr104.voiceservice.voipprofile;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.voiceservice.voipprofile.rtp.RTCP;
import org.broadbandforum.tr104.voiceservice.voipprofile.rtp.Redundancy;
import org.broadbandforum.tr104.voiceservice.voipprofile.rtp.SRTP;

	/**
	 * VoIP profile parameters related to the voice stream sent via RTP.
	 *
	 * @since TR104 v2.0
	 */
@CWMPObject(name = "VoiceService.{i}.VoIPProfile.{i}.RTP.")
@XmlRootElement(name = "VoiceService.VoIPProfile.RTP")
@XmlType(name = "VoiceService.VoIPProfile.RTP")
@XmlAccessorType(XmlAccessType.FIELD)
public class RTP {

	/**
	 * Base of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalPortMin")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long localPortMin = 1024L;
	/**
	 * Top of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalPortMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long localPortMax = 1024L;
	/**
	 * Minimum number of consecutive received packets after the end of an RTP Loss Event. A Loss Event is defined as as a sequence of lost or discarded packets, possibly including islands of received packets. Each island consists of up to ({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Gmin")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 255)
	public Long gmin = 16L;
	/**
	 * Diffserv code point to be used for outgoing RTP and RTCP packets for this profile.  It is RECOMMENDED that by default the DSCP for RTP traffic be set to the value to indicate EF traffic.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DSCPMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long dscPMark;
	/**
	 * VLAN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANIDMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer vlaNIDMark;
	/**
	 * Ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EthernetPriorityMark")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1)
	public Integer ethernetPriorityMark;
	/**
	 * Payload type to be used for RTP telephone events.

This parameter indicates the payload type to be used for DTMF events if transmission of DTMF information is in use according to {{bibref|RFC4733}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TelephoneEventPayloadType")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 128)
	public Long telephoneEventPayloadType;
	/**
	 * The indicates if the jitte buffer is static or dynamic.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "JitterBufferType")
	@CWMPParameter(access = "readWrite")
	public String jitterBufferType;
	/**
	 * Maximal (or static) jitter buffer size in milliseconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "JitterBufferMaxSize")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long jitterBufferMaxSize;
	/**
	 * Minimal jitter buffer size in milliseconds, not used if static buffer is used.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "JitterBufferMinSize")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long jitterBufferMinSize;
	/**
	 * Actual jitter buffer size in milliseconds, if static buffer ist used equal to {{param|JitterBufferMaxSize}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "JitterBufferActualSize")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	public Long jitterBufferActualSize;
	/**
	 * VoIP profile parameters related to RTCP.
	 */
	@XmlElement(name = "RTCP")
	public RTCP rtcP;
	/**
	 * VoIP profile parameters for secure voice transmission via SRTP.
	 */
	@XmlElement(name = "SRTP")
	public SRTP srtP;
	/**
	 * VoIP profile parameters for RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 */
	@XmlElement(name = "Redundancy")
	public Redundancy redundancy;

	public RTP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the base of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLocalPortMin() {
		return localPortMin;
	}

	/**
	 * Set the base of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 * @param localPortMin the input value
	 */
	public void  setLocalPortMin(Long localPortMin) {
		this.localPortMin = localPortMin;
	}

	/**
	 * Set the base of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 * @param localPortMin the input value
	 * @return this instance
	 */
	public RTP withLocalPortMin(Long localPortMin) {
		this.localPortMin = localPortMin;
		return this;
	}

	/**
	 * Get the top of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLocalPortMax() {
		return localPortMax;
	}

	/**
	 * Set the top of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 * @param localPortMax the input value
	 */
	public void  setLocalPortMax(Long localPortMax) {
		this.localPortMax = localPortMax;
	}

	/**
	 * Set the top of port range to be used for incoming RTP streams for this profile.
	 *
	 * @since 2.0
	 * @param localPortMax the input value
	 * @return this instance
	 */
	public RTP withLocalPortMax(Long localPortMax) {
		this.localPortMax = localPortMax;
		return this;
	}

	/**
	 * Get the minimum number of consecutive received packets after the end of an RTP Loss Event. A Loss Event is defined as as a sequence of lost or discarded packets, possibly including islands of received packets. Each island consists of up to ({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getGmin() {
		return gmin;
	}

	/**
	 * Set the minimum number of consecutive received packets after the end of an RTP Loss Event. A Loss Event is defined as as a sequence of lost or discarded packets, possibly including islands of received packets. Each island consists of up to ({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 2.0
	 * @param gmin the input value
	 */
	public void  setGmin(Long gmin) {
		this.gmin = gmin;
	}

	/**
	 * Set the minimum number of consecutive received packets after the end of an RTP Loss Event. A Loss Event is defined as as a sequence of lost or discarded packets, possibly including islands of received packets. Each island consists of up to ({{param}} - 1) received packets (a sequence of {{param}} received packets terminates the Loss Event, and so is not an island).
	 *
	 * @since 2.0
	 * @param gmin the input value
	 * @return this instance
	 */
	public RTP withGmin(Long gmin) {
		this.gmin = gmin;
		return this;
	}

	/**
	 * Get the diffserv code point to be used for outgoing RTP and RTCP packets for this profile.  It is RECOMMENDED that by default the DSCP for RTP traffic be set to the value to indicate EF traffic.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDscPMark() {
		return dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing RTP and RTCP packets for this profile.  It is RECOMMENDED that by default the DSCP for RTP traffic be set to the value to indicate EF traffic.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 */
	public void  setDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
	}

	/**
	 * Set the diffserv code point to be used for outgoing RTP and RTCP packets for this profile.  It is RECOMMENDED that by default the DSCP for RTP traffic be set to the value to indicate EF traffic.
	 *
	 * @since 2.0
	 * @param dscPMark the input value
	 * @return this instance
	 */
	public RTP withDscPMark(Long dscPMark) {
		this.dscPMark = dscPMark;
		return this;
	}

	/**
	 * Get the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getVlaNIDMark() {
		return vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param vlaNIDMark the input value
	 */
	public void  setVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
	}

	/**
	 * Set the vlaN ID (as defined in {{bibref|802.1Q-2005}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param}} or {{param|EthernetPriorityMark}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param vlaNIDMark the input value
	 * @return this instance
	 */
	public RTP withVlaNIDMark(Integer vlaNIDMark) {
		this.vlaNIDMark = vlaNIDMark;
		return this;
	}

	/**
	 * Get the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getEthernetPriorityMark() {
		return ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 */
	public void  setEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
	}

	/**
	 * Set the ethernet priority code (as defined in {{bibref|802.1D-2004}}) to be used for outgoing RTP packets for this profile.  A value of -1 indicates the default value is to be used.

If either {{param|VLANIDMark}} or {{param}} is greater than zero, then the outgoing frames MUST be tagged.  Otherwise, the outgoing frames MAY be tagged or untagged.
	 *
	 * @since 2.0
	 * @param ethernetPriorityMark the input value
	 * @return this instance
	 */
	public RTP withEthernetPriorityMark(Integer ethernetPriorityMark) {
		this.ethernetPriorityMark = ethernetPriorityMark;
		return this;
	}

	/**
	 * Get the payload type to be used for RTP telephone events.

This parameter indicates the payload type to be used for DTMF events if transmission of DTMF information is in use according to {{bibref|RFC4733}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTelephoneEventPayloadType() {
		return telephoneEventPayloadType;
	}

	/**
	 * Set the payload type to be used for RTP telephone events.

This parameter indicates the payload type to be used for DTMF events if transmission of DTMF information is in use according to {{bibref|RFC4733}}.
	 *
	 * @since 2.0
	 * @param telephoneEventPayloadType the input value
	 */
	public void  setTelephoneEventPayloadType(Long telephoneEventPayloadType) {
		this.telephoneEventPayloadType = telephoneEventPayloadType;
	}

	/**
	 * Set the payload type to be used for RTP telephone events.

This parameter indicates the payload type to be used for DTMF events if transmission of DTMF information is in use according to {{bibref|RFC4733}}.
	 *
	 * @since 2.0
	 * @param telephoneEventPayloadType the input value
	 * @return this instance
	 */
	public RTP withTelephoneEventPayloadType(Long telephoneEventPayloadType) {
		this.telephoneEventPayloadType = telephoneEventPayloadType;
		return this;
	}

	/**
	 * Get the indicates if the jitte buffer is static or dynamic.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getJitterBufferType() {
		return jitterBufferType;
	}

	/**
	 * Set the indicates if the jitte buffer is static or dynamic.
	 *
	 * @since 2.0
	 * @param jitterBufferType the input value
	 */
	public void  setJitterBufferType(String jitterBufferType) {
		this.jitterBufferType = jitterBufferType;
	}

	/**
	 * Set the indicates if the jitte buffer is static or dynamic.
	 *
	 * @since 2.0
	 * @param jitterBufferType the input value
	 * @return this instance
	 */
	public RTP withJitterBufferType(String jitterBufferType) {
		this.jitterBufferType = jitterBufferType;
		return this;
	}

	/**
	 * Get the maximal (or static) jitter buffer size in milliseconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getJitterBufferMaxSize() {
		return jitterBufferMaxSize;
	}

	/**
	 * Set the maximal (or static) jitter buffer size in milliseconds.
	 *
	 * @since 2.0
	 * @param jitterBufferMaxSize the input value
	 */
	public void  setJitterBufferMaxSize(Long jitterBufferMaxSize) {
		this.jitterBufferMaxSize = jitterBufferMaxSize;
	}

	/**
	 * Set the maximal (or static) jitter buffer size in milliseconds.
	 *
	 * @since 2.0
	 * @param jitterBufferMaxSize the input value
	 * @return this instance
	 */
	public RTP withJitterBufferMaxSize(Long jitterBufferMaxSize) {
		this.jitterBufferMaxSize = jitterBufferMaxSize;
		return this;
	}

	/**
	 * Get the minimal jitter buffer size in milliseconds, not used if static buffer is used.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getJitterBufferMinSize() {
		return jitterBufferMinSize;
	}

	/**
	 * Set the minimal jitter buffer size in milliseconds, not used if static buffer is used.
	 *
	 * @since 2.0
	 * @param jitterBufferMinSize the input value
	 */
	public void  setJitterBufferMinSize(Long jitterBufferMinSize) {
		this.jitterBufferMinSize = jitterBufferMinSize;
	}

	/**
	 * Set the minimal jitter buffer size in milliseconds, not used if static buffer is used.
	 *
	 * @since 2.0
	 * @param jitterBufferMinSize the input value
	 * @return this instance
	 */
	public RTP withJitterBufferMinSize(Long jitterBufferMinSize) {
		this.jitterBufferMinSize = jitterBufferMinSize;
		return this;
	}

	/**
	 * Get actual jitter buffer size in milliseconds, if static buffer ist used equal to {{param|JitterBufferMaxSize}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getJitterBufferActualSize() {
		return jitterBufferActualSize;
	}

	/**
	 * Set actual jitter buffer size in milliseconds, if static buffer ist used equal to {{param|JitterBufferMaxSize}}.
	 *
	 * @since 2.0
	 * @param jitterBufferActualSize the input value
	 */
	public void  setJitterBufferActualSize(Long jitterBufferActualSize) {
		this.jitterBufferActualSize = jitterBufferActualSize;
	}

	/**
	 * Set actual jitter buffer size in milliseconds, if static buffer ist used equal to {{param|JitterBufferMaxSize}}.
	 *
	 * @since 2.0
	 * @param jitterBufferActualSize the input value
	 * @return this instance
	 */
	public RTP withJitterBufferActualSize(Long jitterBufferActualSize) {
		this.jitterBufferActualSize = jitterBufferActualSize;
		return this;
	}

	/**
	 * Get the voiP profile parameters related to RTCP.
	 *
	 * @return the value
	 */
	public RTCP getRtcP() {
		return rtcP;
	}

	/**
	 * Set the voiP profile parameters related to RTCP.
	 *
	 * @param rtcP the input value
	 */
	public void  setRtcP(RTCP rtcP) {
		this.rtcP = rtcP;
	}

	/**
	 * Set the voiP profile parameters related to RTCP.
	 *
	 * @param rtcP the input value
	 * @return this instance
	 */
	public RTP withRtcP(RTCP rtcP) {
		this.rtcP = rtcP;
		return this;
	}

	/**
	 * Get the voiP profile parameters for secure voice transmission via SRTP.
	 *
	 * @return the value
	 */
	public SRTP getSrtP() {
		return srtP;
	}

	/**
	 * Set the voiP profile parameters for secure voice transmission via SRTP.
	 *
	 * @param srtP the input value
	 */
	public void  setSrtP(SRTP srtP) {
		this.srtP = srtP;
	}

	/**
	 * Set the voiP profile parameters for secure voice transmission via SRTP.
	 *
	 * @param srtP the input value
	 * @return this instance
	 */
	public RTP withSrtP(SRTP srtP) {
		this.srtP = srtP;
		return this;
	}

	/**
	 * Get the voiP profile parameters for RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @return the value
	 */
	public Redundancy getRedundancy() {
		return redundancy;
	}

	/**
	 * Set the voiP profile parameters for RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @param redundancy the input value
	 */
	public void  setRedundancy(Redundancy redundancy) {
		this.redundancy = redundancy;
	}

	/**
	 * Set the voiP profile parameters for RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @param redundancy the input value
	 * @return this instance
	 */
	public RTP withRedundancy(Redundancy redundancy) {
		this.redundancy = redundancy;
		return this;
	}

	//</editor-fold>

}