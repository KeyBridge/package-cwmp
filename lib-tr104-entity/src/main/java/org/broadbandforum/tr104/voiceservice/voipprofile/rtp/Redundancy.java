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
package org.broadbandforum.tr104.voiceservice.voipprofile.rtp;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * VoIP profile parameters for RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.VoIPProfile.{i}.RTP.Redundancy.")
public class Redundancy {

	/**
	 * Enable or disable the use of RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The Payload Type of RTP packet as defined in {{bibref|RFC2198}}.  Values SHOULD be within the range of dynamic Payload Types (96-127).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PayloadType")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 127)
	public Long payloadType = 0L;
	/**
	 * Block Payload Type of redundancy packet.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BlockPayloadType")
	@Size(min = 0, max = 127)
	public Long blockPayloadType = 0L;
	/**
	 * Specifies the redundancy number for fax and modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for fax and modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for fax and modem pass-through data.

If {{param|ModemRedundancy}} is present, then {{param}} applies only to fax transmissions, but not to modem transmissions.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FaxAndModemRedundancy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 5)
	public Integer faxAndModemRedundancy = -1;
	/**
	 * Specifies the redundancy number for modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for modem pass-through data.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ModemRedundancy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 5)
	public Integer modemRedundancy = -1;
	/**
	 * Specifies the redundancy number for DTMF transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for DTMF.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for DTMF.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DTMFRedundancy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 5)
	public Integer dtmFRedundancy = -1;
	/**
	 * Specifies the redundancy number for general voice transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for voice.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for voice.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VoiceRedundancy")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 5)
	public Integer voiceRedundancy = -1;
	/**
	 * The maximum number of sessions using {{bibref|RFC2198}} payload redundancy simultaneously in this profile.

A value of zero indicates no explicit limit on the number of sessions using redundancy.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxSessionsUsingRedundancy")
	@CWMPParameter(access = "readWrite")
	public Long maxSessionsUsingRedundancy = 0L;

	public Redundancy() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable the use of RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable the use of RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable the use of RTP payload redundancy as defined by {{bibref|RFC2198}}.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Redundancy withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the Payload Type of RTP packet as defined in {{bibref|RFC2198}}.  Values SHOULD be within the range of dynamic Payload Types (96-127).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPayloadType() {
		return payloadType;
	}

	/**
	 * Set the Payload Type of RTP packet as defined in {{bibref|RFC2198}}.  Values SHOULD be within the range of dynamic Payload Types (96-127).
	 *
	 * @since 2.0
	 * @param payloadType the input value
	 */
	public void  setPayloadType(Long payloadType) {
		this.payloadType = payloadType;
	}

	/**
	 * Set the Payload Type of RTP packet as defined in {{bibref|RFC2198}}.  Values SHOULD be within the range of dynamic Payload Types (96-127).
	 *
	 * @since 2.0
	 * @param payloadType the input value
	 * @return this instance
	 */
	public Redundancy withPayloadType(Long payloadType) {
		this.payloadType = payloadType;
		return this;
	}

	/**
	 * Get the block Payload Type of redundancy packet.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBlockPayloadType() {
		return blockPayloadType;
	}

	/**
	 * Set the block Payload Type of redundancy packet.
	 *
	 * @since 2.0
	 * @param blockPayloadType the input value
	 */
	public void  setBlockPayloadType(Long blockPayloadType) {
		this.blockPayloadType = blockPayloadType;
	}

	/**
	 * Set the block Payload Type of redundancy packet.
	 *
	 * @since 2.0
	 * @param blockPayloadType the input value
	 * @return this instance
	 */
	public Redundancy withBlockPayloadType(Long blockPayloadType) {
		this.blockPayloadType = blockPayloadType;
		return this;
	}

	/**
	 * Get the specifies the redundancy number for fax and modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for fax and modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for fax and modem pass-through data.

If {{param|ModemRedundancy}} is present, then {{param}} applies only to fax transmissions, but not to modem transmissions.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getFaxAndModemRedundancy() {
		return faxAndModemRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for fax and modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for fax and modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for fax and modem pass-through data.

If {{param|ModemRedundancy}} is present, then {{param}} applies only to fax transmissions, but not to modem transmissions.
	 *
	 * @since 2.0
	 * @param faxAndModemRedundancy the input value
	 */
	public void  setFaxAndModemRedundancy(Integer faxAndModemRedundancy) {
		this.faxAndModemRedundancy = faxAndModemRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for fax and modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for fax and modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for fax and modem pass-through data.

If {{param|ModemRedundancy}} is present, then {{param}} applies only to fax transmissions, but not to modem transmissions.
	 *
	 * @since 2.0
	 * @param faxAndModemRedundancy the input value
	 * @return this instance
	 */
	public Redundancy withFaxAndModemRedundancy(Integer faxAndModemRedundancy) {
		this.faxAndModemRedundancy = faxAndModemRedundancy;
		return this;
	}

	/**
	 * Get the specifies the redundancy number for modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for modem pass-through data.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getModemRedundancy() {
		return modemRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for modem pass-through data.
	 *
	 * @since 2.0
	 * @param modemRedundancy the input value
	 */
	public void  setModemRedundancy(Integer modemRedundancy) {
		this.modemRedundancy = modemRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for modem pass-through data transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for modem pass-through data.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for modem pass-through data.
	 *
	 * @since 2.0
	 * @param modemRedundancy the input value
	 * @return this instance
	 */
	public Redundancy withModemRedundancy(Integer modemRedundancy) {
		this.modemRedundancy = modemRedundancy;
		return this;
	}

	/**
	 * Get the specifies the redundancy number for DTMF transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for DTMF.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for DTMF.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDtmFRedundancy() {
		return dtmFRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for DTMF transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for DTMF.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for DTMF.
	 *
	 * @since 2.0
	 * @param dtmFRedundancy the input value
	 */
	public void  setDtmFRedundancy(Integer dtmFRedundancy) {
		this.dtmFRedundancy = dtmFRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for DTMF transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for DTMF.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for DTMF.
	 *
	 * @since 2.0
	 * @param dtmFRedundancy the input value
	 * @return this instance
	 */
	public Redundancy withDtmFRedundancy(Integer dtmFRedundancy) {
		this.dtmFRedundancy = dtmFRedundancy;
		return this;
	}

	/**
	 * Get the specifies the redundancy number for general voice transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for voice.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for voice.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getVoiceRedundancy() {
		return voiceRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for general voice transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for voice.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for voice.
	 *
	 * @since 2.0
	 * @param voiceRedundancy the input value
	 */
	public void  setVoiceRedundancy(Integer voiceRedundancy) {
		this.voiceRedundancy = voiceRedundancy;
	}

	/**
	 * Set the specifies the redundancy number for general voice transmissions.

A non-negative value indicates that {{bibref|RFC2198}} is to be used for voice.  The value indicates the number of redundant copies to be transmitted (the total number transmitted is one plus this value).

A value of -1 indicates {{bibref|RFC2198}} is not to be used for voice.
	 *
	 * @since 2.0
	 * @param voiceRedundancy the input value
	 * @return this instance
	 */
	public Redundancy withVoiceRedundancy(Integer voiceRedundancy) {
		this.voiceRedundancy = voiceRedundancy;
		return this;
	}

	/**
	 * Get the maximum number of sessions using {{bibref|RFC2198}} payload redundancy simultaneously in this profile.

A value of zero indicates no explicit limit on the number of sessions using redundancy.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxSessionsUsingRedundancy() {
		return maxSessionsUsingRedundancy;
	}

	/**
	 * Set the maximum number of sessions using {{bibref|RFC2198}} payload redundancy simultaneously in this profile.

A value of zero indicates no explicit limit on the number of sessions using redundancy.
	 *
	 * @since 2.0
	 * @param maxSessionsUsingRedundancy the input value
	 */
	public void  setMaxSessionsUsingRedundancy(Long maxSessionsUsingRedundancy) {
		this.maxSessionsUsingRedundancy = maxSessionsUsingRedundancy;
	}

	/**
	 * Set the maximum number of sessions using {{bibref|RFC2198}} payload redundancy simultaneously in this profile.

A value of zero indicates no explicit limit on the number of sessions using redundancy.
	 *
	 * @since 2.0
	 * @param maxSessionsUsingRedundancy the input value
	 * @return this instance
	 */
	public Redundancy withMaxSessionsUsingRedundancy(Long maxSessionsUsingRedundancy) {
		this.maxSessionsUsingRedundancy = maxSessionsUsingRedundancy;
		return this;
	}

	//</editor-fold>

}