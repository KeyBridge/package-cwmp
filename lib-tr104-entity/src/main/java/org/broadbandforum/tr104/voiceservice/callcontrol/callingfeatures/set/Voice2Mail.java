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
package org.broadbandforum.tr104.voiceservice.callcontrol.callingfeatures.set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Voice to mail specific attributes. Applies only if {{param|#.VoiceMailEnable}} is set to {{true}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.CallingFeatures.Set.{i}.Voice2Mail.")
@XmlRootElement(name = "Voice2Mail")
@XmlType(name = "VoiceService.CallControl.CallingFeatures.Set.Voice2Mail")
@XmlAccessorType(XmlAccessType.FIELD)
public class Voice2Mail {

	/**
	 * Enable or disable voice mail notification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxMessageLength")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long maxMessageLength;
	/**
	 * Indicates if the message is sent as an attachment in voice mail notification.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Attach")
	@CWMPParameter(access = "readWrite")
	public Boolean attach;
	/**
	 * Whether the voice to mail message is kept on the CPE after sending the mail. Applicable only if {{param|Attach}} is {{true}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "KeepLocal")
	@CWMPParameter(access = "readWrite")
	public Boolean keepLocal;
	/**
	 * E-mail for voice to mail notification messages.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EMailAddress")
	@CWMPParameter(access = "readWrite")
	public String emailAddress;

	public Voice2Mail() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable voice mail notification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable voice mail notification.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable voice mail notification.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Voice2Mail withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxMessageLength() {
		return maxMessageLength;
	}

	/**
	 * Set the defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 * @param maxMessageLength the input value
	 */
	public void  setMaxMessageLength(Long maxMessageLength) {
		this.maxMessageLength = maxMessageLength;
	}

	/**
	 * Set the defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 * @param maxMessageLength the input value
	 * @return this instance
	 */
	public Voice2Mail withMaxMessageLength(Long maxMessageLength) {
		this.maxMessageLength = maxMessageLength;
		return this;
	}

	/**
	 * Get the indicates if the message is sent as an attachment in voice mail notification.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAttach() {
		return attach;
	}

	/**
	 * Set the indicates if the message is sent as an attachment in voice mail notification.
	 *
	 * @since 2.0
	 * @param attach the input value
	 */
	public void  setAttach(Boolean attach) {
		this.attach = attach;
	}

	/**
	 * Set the indicates if the message is sent as an attachment in voice mail notification.
	 *
	 * @since 2.0
	 * @param attach the input value
	 * @return this instance
	 */
	public Voice2Mail withAttach(Boolean attach) {
		this.attach = attach;
		return this;
	}

	/**
	 * Get the whether the voice to mail message is kept on the CPE after sending the mail. Applicable only if {{param|Attach}} is {{true}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isKeepLocal() {
		return keepLocal;
	}

	/**
	 * Set the whether the voice to mail message is kept on the CPE after sending the mail. Applicable only if {{param|Attach}} is {{true}}.
	 *
	 * @since 2.0
	 * @param keepLocal the input value
	 */
	public void  setKeepLocal(Boolean keepLocal) {
		this.keepLocal = keepLocal;
	}

	/**
	 * Set the whether the voice to mail message is kept on the CPE after sending the mail. Applicable only if {{param|Attach}} is {{true}}.
	 *
	 * @since 2.0
	 * @param keepLocal the input value
	 * @return this instance
	 */
	public Voice2Mail withKeepLocal(Boolean keepLocal) {
		this.keepLocal = keepLocal;
		return this;
	}

	/**
	 * Get the e-mail for voice to mail notification messages.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Set the e-mail for voice to mail notification messages.
	 *
	 * @since 2.0
	 * @param emailAddress the input value
	 */
	public void  setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Set the e-mail for voice to mail notification messages.
	 *
	 * @since 2.0
	 * @param emailAddress the input value
	 * @return this instance
	 */
	public Voice2Mail withEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	//</editor-fold>

}