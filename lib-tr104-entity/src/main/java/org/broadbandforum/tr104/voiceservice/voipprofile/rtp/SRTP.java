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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * VoIP profile parameters for secure voice transmission via SRTP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.VoIPProfile.{i}.RTP.SRTP.")
public class SRTP {

	/**
	 * Enable or disable the use of SRTP.

If RTCP is enabled, a {{true}} value of this parameter also implies the use of SRTCP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{list|available keying methods}} 

Enumerated value must be one of [Null, Static, SDP, IKE]
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "KeyingMethods")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> keyingMethods;
	/**
	 * {{list|available encryption key sizes}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EncryptionKeySizes")
	@CWMPParameter(access = "readWrite")
	public Long encryptionKeySizes;

	public SRTP() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable the use of SRTP.

If RTCP is enabled, a {{true}} value of this parameter also implies the use of SRTCP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enable or disable the use of SRTP.

If RTCP is enabled, a {{true}} value of this parameter also implies the use of SRTCP.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enable or disable the use of SRTP.

If RTCP is enabled, a {{true}} value of this parameter also implies the use of SRTCP.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public SRTP withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{list|available keying methods}} 

Enumerated value must be one of [Null, Static, SDP, IKE]
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getKeyingMethods() {
		if (this.keyingMethods == null){ this.keyingMethods=new ArrayList<>();}
		return keyingMethods;
	}

	/**
	 * Set the {{list|available keying methods}} 

Enumerated value must be one of [Null, Static, SDP, IKE]
	 *
	 * @since 2.0
	 * @param keyingMethods the input value
	 */
	public void  setKeyingMethods(Collection<String> keyingMethods) {
		this.keyingMethods = keyingMethods;
	}

	/**
	 * Set the {{list|available keying methods}} 

Enumerated value must be one of [Null, Static, SDP, IKE]
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public SRTP withKeyingMethods(String string) {
		getKeyingMethods().add(string);
		return this;
	}

	/**
	 * Get the {{list|available encryption key sizes}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEncryptionKeySizes() {
		return encryptionKeySizes;
	}

	/**
	 * Set the {{list|available encryption key sizes}}
	 *
	 * @since 2.0
	 * @param encryptionKeySizes the input value
	 */
	public void  setEncryptionKeySizes(Long encryptionKeySizes) {
		this.encryptionKeySizes = encryptionKeySizes;
	}

	/**
	 * Set the {{list|available encryption key sizes}}
	 *
	 * @since 2.0
	 * @param encryptionKeySizes the input value
	 * @return this instance
	 */
	public SRTP withEncryptionKeySizes(Long encryptionKeySizes) {
		this.encryptionKeySizes = encryptionKeySizes;
		return this;
	}

	//</editor-fold>

}