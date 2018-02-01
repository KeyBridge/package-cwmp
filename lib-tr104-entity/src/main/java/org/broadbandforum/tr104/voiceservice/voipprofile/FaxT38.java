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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * T.38 Fax information for devices that support T.38 relay.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.VoIPProfile.{i}.FaxT38.")
public class FaxT38 {

	/**
	 * Maximum data rate in bits per second for fax as defined in {{bibref|T.38}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBitRate")
	@CWMPParameter(access = "readWrite", units = "bits per second")
	@Size(min = 0, max = 65535)
	public Long maxBitRate = 14400L;
	/**
	 * Specifies the packet-level redundancy for high-speed data transmissions (i.e., T.4 image data).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HighSpeedRedundancy")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 3)
	public Long highSpeedRedundancy;
	/**
	 * Specifies the packet-level redundancy for low-speed data transmissions (i.e., T.30 handshaking information).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LowSpeedRedundancy")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 5)
	public Long lowSpeedRedundancy;
	/**
	 * The method with which data is handled over the network.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCFMethod")
	@CWMPParameter(access = "readWrite")
	public String tcfMethod;

	public FaxT38() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum data rate in bits per second for fax as defined in {{bibref|T.38}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBitRate() {
		return maxBitRate;
	}

	/**
	 * Set the maximum data rate in bits per second for fax as defined in {{bibref|T.38}}.
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 */
	public void  setMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
	}

	/**
	 * Set the maximum data rate in bits per second for fax as defined in {{bibref|T.38}}.
	 *
	 * @since 2.0
	 * @param maxBitRate the input value
	 * @return this instance
	 */
	public FaxT38 withMaxBitRate(Long maxBitRate) {
		this.maxBitRate = maxBitRate;
		return this;
	}

	/**
	 * Get the specifies the packet-level redundancy for high-speed data transmissions (i.e., T.4 image data).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHighSpeedRedundancy() {
		return highSpeedRedundancy;
	}

	/**
	 * Set the specifies the packet-level redundancy for high-speed data transmissions (i.e., T.4 image data).
	 *
	 * @since 2.0
	 * @param highSpeedRedundancy the input value
	 */
	public void  setHighSpeedRedundancy(Long highSpeedRedundancy) {
		this.highSpeedRedundancy = highSpeedRedundancy;
	}

	/**
	 * Set the specifies the packet-level redundancy for high-speed data transmissions (i.e., T.4 image data).
	 *
	 * @since 2.0
	 * @param highSpeedRedundancy the input value
	 * @return this instance
	 */
	public FaxT38 withHighSpeedRedundancy(Long highSpeedRedundancy) {
		this.highSpeedRedundancy = highSpeedRedundancy;
		return this;
	}

	/**
	 * Get the specifies the packet-level redundancy for low-speed data transmissions (i.e., T.30 handshaking information).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLowSpeedRedundancy() {
		return lowSpeedRedundancy;
	}

	/**
	 * Set the specifies the packet-level redundancy for low-speed data transmissions (i.e., T.30 handshaking information).
	 *
	 * @since 2.0
	 * @param lowSpeedRedundancy the input value
	 */
	public void  setLowSpeedRedundancy(Long lowSpeedRedundancy) {
		this.lowSpeedRedundancy = lowSpeedRedundancy;
	}

	/**
	 * Set the specifies the packet-level redundancy for low-speed data transmissions (i.e., T.30 handshaking information).
	 *
	 * @since 2.0
	 * @param lowSpeedRedundancy the input value
	 * @return this instance
	 */
	public FaxT38 withLowSpeedRedundancy(Long lowSpeedRedundancy) {
		this.lowSpeedRedundancy = lowSpeedRedundancy;
		return this;
	}

	/**
	 * Get the method with which data is handled over the network.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTcfMethod() {
		return tcfMethod;
	}

	/**
	 * Set the method with which data is handled over the network.
	 *
	 * @since 2.0
	 * @param tcfMethod the input value
	 */
	public void  setTcfMethod(String tcfMethod) {
		this.tcfMethod = tcfMethod;
	}

	/**
	 * Set the method with which data is handled over the network.
	 *
	 * @since 2.0
	 * @param tcfMethod the input value
	 * @return this instance
	 */
	public FaxT38 withTcfMethod(String tcfMethod) {
		this.tcfMethod = tcfMethod;
		return this;
	}

	//</editor-fold>

}