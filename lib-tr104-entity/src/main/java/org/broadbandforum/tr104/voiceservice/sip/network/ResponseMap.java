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
package org.broadbandforum.tr104.voiceservice.sip.network;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Each entry in this table specifies the tone and message to be provided to the user for a particular SIP response received (normally 4xx and 5xx).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.SIP.Network.{i}.ResponseMap.{i}.")
public class ResponseMap {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The SIP response code number.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SIPResponseNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 101, max = 999)
	public Long sipResponseNumber;
	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * The message to be provided on the screen or display of the VoIP device when the SIP response is received.

If this parameter is not {{empty}}, display of this text preempts the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}.  If this parameter is {{empty}}, the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}, if any, is displayed instead.

This parameter is applicable only for VoIP devices capable of text display.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TextMessage")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String textMessage;
	/**
	 * The tone to be played to the user when the SIP response is received.  

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Tone")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String tone;

	public ResponseMap() {
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
	public ResponseMap withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the SIP response code number.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSipResponseNumber() {
		return sipResponseNumber;
	}

	/**
	 * Set the SIP response code number.
	 *
	 * @since 2.0
	 * @param sipResponseNumber the input value
	 */
	public void  setSipResponseNumber(Long sipResponseNumber) {
		this.sipResponseNumber = sipResponseNumber;
	}

	/**
	 * Set the SIP response code number.
	 *
	 * @since 2.0
	 * @param sipResponseNumber the input value
	 * @return this instance
	 */
	public ResponseMap withSipResponseNumber(Long sipResponseNumber) {
		this.sipResponseNumber = sipResponseNumber;
		return this;
	}

	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public ResponseMap withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the message to be provided on the screen or display of the VoIP device when the SIP response is received.

If this parameter is not {{empty}}, display of this text preempts the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}.  If this parameter is {{empty}}, the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}, if any, is displayed instead.

This parameter is applicable only for VoIP devices capable of text display.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTextMessage() {
		return textMessage;
	}

	/**
	 * Set the message to be provided on the screen or display of the VoIP device when the SIP response is received.

If this parameter is not {{empty}}, display of this text preempts the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}.  If this parameter is {{empty}}, the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}, if any, is displayed instead.

This parameter is applicable only for VoIP devices capable of text display.
	 *
	 * @since 2.0
	 * @param textMessage the input value
	 */
	public void  setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}

	/**
	 * Set the message to be provided on the screen or display of the VoIP device when the SIP response is received.

If this parameter is not {{empty}}, display of this text preempts the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}.  If this parameter is {{empty}}, the value of {{param|.Tone.Description.{i}.ToneText}} associated with {{param|Tone}}, if any, is displayed instead.

This parameter is applicable only for VoIP devices capable of text display.
	 *
	 * @since 2.0
	 * @param textMessage the input value
	 * @return this instance
	 */
	public ResponseMap withTextMessage(String textMessage) {
		this.textMessage = textMessage;
		return this;
	}

	/**
	 * Get the tone to be played to the user when the SIP response is received.  

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTone() {
		return tone;
	}

	/**
	 * Set the tone to be played to the user when the SIP response is received.  

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 * @param tone the input value
	 */
	public void  setTone(String tone) {
		this.tone = tone;
	}

	/**
	 * Set the tone to be played to the user when the SIP response is received.  

{{reference}}

{{empty}} indicates no tone is to be played for this event.
	 *
	 * @since 2.0
	 * @param tone the input value
	 * @return this instance
	 */
	public ResponseMap withTone(String tone) {
		this.tone = tone;
		return this;
	}

	//</editor-fold>

}