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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * VoIP profile parameters related to RTCP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.VoIPProfile.{i}.RTP.RTCP.")
@XmlRootElement(name = "VoiceService.VoIPProfile.RTP.RTCP")
@XmlType(name = "VoiceService.VoIPProfile.RTP.RTCP")
@XmlAccessorType(XmlAccessType.FIELD)
public class RTCP {

	/**
	 * Enable or disable RTCP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Transmission repeat interval, in milliseconds.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TxRepeatInterval")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 1)
	public Long txrepeatInterval;
	/**
	 * Local Cname (canonical name).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalCName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String localCName;

	public RTCP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable RTCP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable RTCP.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable RTCP.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public RTCP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the transmission repeat interval, in milliseconds.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTxrepeatInterval() {
		return txrepeatInterval;
	}

	/**
	 * Set the transmission repeat interval, in milliseconds.
	 *
	 * @since 2.0
	 * @param txrepeatInterval the input value
	 */
	public void  setTxrepeatInterval(Long txrepeatInterval) {
		this.txrepeatInterval = txrepeatInterval;
	}

	/**
	 * Set the transmission repeat interval, in milliseconds.
	 *
	 * @since 2.0
	 * @param txrepeatInterval the input value
	 * @return this instance
	 */
	public RTCP withTxrepeatInterval(Long txrepeatInterval) {
		this.txrepeatInterval = txrepeatInterval;
		return this;
	}

	/**
	 * Get the local Cname (canonical name).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLocalCName() {
		return localCName;
	}

	/**
	 * Set the local Cname (canonical name).
	 *
	 * @since 2.0
	 * @param localCName the input value
	 */
	public void  setLocalCName(String localCName) {
		this.localCName = localCName;
	}

	/**
	 * Set the local Cname (canonical name).
	 *
	 * @since 2.0
	 * @param localCName the input value
	 * @return this instance
	 */
	public RTCP withLocalCName(String localCName) {
		this.localCName = localCName;
		return this;
	}

	//</editor-fold>

}