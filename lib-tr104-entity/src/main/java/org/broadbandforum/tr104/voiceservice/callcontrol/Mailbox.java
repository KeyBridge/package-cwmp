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
package org.broadbandforum.tr104.voiceservice.callcontrol;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr104.datatypes.Alias;

	/**
	 * Voice mail configuration related to a particular extension.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.CallControl.Mailbox.{i}.")
@XmlRootElement(name = "Mailbox")
@XmlType(name = "VoiceService.CallControl.Mailbox")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mailbox {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * This limits the number of messages in a voicemail folder.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxMsg")
	@CWMPParameter(access = "readWrite")
	public Long maxMsg;
	/**
	 * Defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxMessageTime")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long maxMessageTime;
	/**
	 * Minimal size in seconds of the voicemail box.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MinSize")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long minSize;
	/**
	 * SMTP server FQDN or IP Address used for voicemail notifications.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SMTPServerAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String smtPServerAddress;
	/**
	 * SMTP server port for voicemail notifications.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SMTPServerPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long smtPServerPort = 25L;
	/**
	 * SMTP user name.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SMTPUser")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String smtPUser;
	/**
	 * SMTP password.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SMTPPassword")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String smtPPassword;
	/**
	 * Type of authentication used to connect to the SMTP server.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SMTPAuthenticationType")
	@CWMPParameter(access = "readWrite")
	public String smtPAuthenticationType = "None";
	/**
	 * Sender's email address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SMTPFrom")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String smtPFrom;

	public Mailbox() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public Mailbox withEnable(Boolean enable) {
		this.enable = enable;
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
	public Mailbox withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the this limits the number of messages in a voicemail folder.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxMsg() {
		return maxMsg;
	}

	/**
	 * Set the this limits the number of messages in a voicemail folder.
	 *
	 * @since 2.0
	 * @param maxMsg the input value
	 */
	public void  setMaxMsg(Long maxMsg) {
		this.maxMsg = maxMsg;
	}

	/**
	 * Set the this limits the number of messages in a voicemail folder.
	 *
	 * @since 2.0
	 * @param maxMsg the input value
	 * @return this instance
	 */
	public Mailbox withMaxMsg(Long maxMsg) {
		this.maxMsg = maxMsg;
		return this;
	}

	/**
	 * Get the defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxMessageTime() {
		return maxMessageTime;
	}

	/**
	 * Set the defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 * @param maxMessageTime the input value
	 */
	public void  setMaxMessageTime(Long maxMessageTime) {
		this.maxMessageTime = maxMessageTime;
	}

	/**
	 * Set the defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. A value of 0 means there will be no maximum time limit enforced.
	 *
	 * @since 2.0
	 * @param maxMessageTime the input value
	 * @return this instance
	 */
	public Mailbox withMaxMessageTime(Long maxMessageTime) {
		this.maxMessageTime = maxMessageTime;
		return this;
	}

	/**
	 * Get the minimal size in seconds of the voicemail box.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMinSize() {
		return minSize;
	}

	/**
	 * Set the minimal size in seconds of the voicemail box.
	 *
	 * @since 2.0
	 * @param minSize the input value
	 */
	public void  setMinSize(Long minSize) {
		this.minSize = minSize;
	}

	/**
	 * Set the minimal size in seconds of the voicemail box.
	 *
	 * @since 2.0
	 * @param minSize the input value
	 * @return this instance
	 */
	public Mailbox withMinSize(Long minSize) {
		this.minSize = minSize;
		return this;
	}

	/**
	 * Get the smtP server FQDN or IP Address used for voicemail notifications.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSmtPServerAddress() {
		return smtPServerAddress;
	}

	/**
	 * Set the smtP server FQDN or IP Address used for voicemail notifications.
	 *
	 * @since 2.0
	 * @param smtPServerAddress the input value
	 */
	public void  setSmtPServerAddress(String smtPServerAddress) {
		this.smtPServerAddress = smtPServerAddress;
	}

	/**
	 * Set the smtP server FQDN or IP Address used for voicemail notifications.
	 *
	 * @since 2.0
	 * @param smtPServerAddress the input value
	 * @return this instance
	 */
	public Mailbox withSmtPServerAddress(String smtPServerAddress) {
		this.smtPServerAddress = smtPServerAddress;
		return this;
	}

	/**
	 * Get the smtP server port for voicemail notifications.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSmtPServerPort() {
		return smtPServerPort;
	}

	/**
	 * Set the smtP server port for voicemail notifications.
	 *
	 * @since 2.0
	 * @param smtPServerPort the input value
	 */
	public void  setSmtPServerPort(Long smtPServerPort) {
		this.smtPServerPort = smtPServerPort;
	}

	/**
	 * Set the smtP server port for voicemail notifications.
	 *
	 * @since 2.0
	 * @param smtPServerPort the input value
	 * @return this instance
	 */
	public Mailbox withSmtPServerPort(Long smtPServerPort) {
		this.smtPServerPort = smtPServerPort;
		return this;
	}

	/**
	 * Get the smtP user name.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSmtPUser() {
		return smtPUser;
	}

	/**
	 * Set the smtP user name.
	 *
	 * @since 2.0
	 * @param smtPUser the input value
	 */
	public void  setSmtPUser(String smtPUser) {
		this.smtPUser = smtPUser;
	}

	/**
	 * Set the smtP user name.
	 *
	 * @since 2.0
	 * @param smtPUser the input value
	 * @return this instance
	 */
	public Mailbox withSmtPUser(String smtPUser) {
		this.smtPUser = smtPUser;
		return this;
	}

	/**
	 * Get the smtP password.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSmtPPassword() {
		return smtPPassword;
	}

	/**
	 * Set the smtP password.
	 *
	 * @since 2.0
	 * @param smtPPassword the input value
	 */
	public void  setSmtPPassword(String smtPPassword) {
		this.smtPPassword = smtPPassword;
	}

	/**
	 * Set the smtP password.
	 *
	 * @since 2.0
	 * @param smtPPassword the input value
	 * @return this instance
	 */
	public Mailbox withSmtPPassword(String smtPPassword) {
		this.smtPPassword = smtPPassword;
		return this;
	}

	/**
	 * Get the type of authentication used to connect to the SMTP server.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSmtPAuthenticationType() {
		return smtPAuthenticationType;
	}

	/**
	 * Set the type of authentication used to connect to the SMTP server.
	 *
	 * @since 2.0
	 * @param smtPAuthenticationType the input value
	 */
	public void  setSmtPAuthenticationType(String smtPAuthenticationType) {
		this.smtPAuthenticationType = smtPAuthenticationType;
	}

	/**
	 * Set the type of authentication used to connect to the SMTP server.
	 *
	 * @since 2.0
	 * @param smtPAuthenticationType the input value
	 * @return this instance
	 */
	public Mailbox withSmtPAuthenticationType(String smtPAuthenticationType) {
		this.smtPAuthenticationType = smtPAuthenticationType;
		return this;
	}

	/**
	 * Get the sender's email address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getSmtPFrom() {
		return smtPFrom;
	}

	/**
	 * Set the sender's email address.
	 *
	 * @since 2.0
	 * @param smtPFrom the input value
	 */
	public void  setSmtPFrom(String smtPFrom) {
		this.smtPFrom = smtPFrom;
	}

	/**
	 * Set the sender's email address.
	 *
	 * @since 2.0
	 * @param smtPFrom the input value
	 * @return this instance
	 */
	public Mailbox withSmtPFrom(String smtPFrom) {
		this.smtPFrom = smtPFrom;
		return this;
	}

	//</editor-fold>

}