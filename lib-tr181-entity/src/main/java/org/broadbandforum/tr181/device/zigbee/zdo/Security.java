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
package org.broadbandforum.tr181.device.zigbee.zdo;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.common.IEEE_EUI64;

	/**
	 * The {{object}} object provides the configuration capabilities needed to perform the Security Management functionality defined in {{bibref|ZigBee2007|section 4 Security Management}}.
	 *
	 * @since TR181 v2.7
	 */
@CWMPObject(name = "Device.ZigBee.ZDO.{i}.Security.")
@XmlRootElement(name = "Device.ZigBee.ZDO.Security")
@XmlType(name = "Device.ZigBee.ZDO.Security")
@XmlAccessorType(XmlAccessType.FIELD)
public class Security {

	/**
	 * Specifies the IEEE address of a special device trusted by devices within a ZigBee network to distribute keys for the purpose of network and end-to-end application configuration management.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "TrustCenterAddress")
	public IEEE_EUI64 trustCenterAddress;
	/**
	 * Specifies how an outgoing frame is to be secured, how an incoming frame purportedly has been secured; it also indicates whether or not the payload is encrypted and to what extent data authenticity over the frame is provided, as reflected by the length of the message integrity code (MIC).

          {{enum}}
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "SecurityLevel")
	public String securityLevel;
	/**
	 * The period of time, in milliseconds, that this ZigBee device will wait for an expected security protocol frame.
	 *
	 * @since 2.7
	 */
	@XmlElement(name = "TimeOutPeriod")
	@Size(max = 65535)
	public Long timeOutPeriod;

	public Security() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies the IEEE address of a special device trusted by devices within a ZigBee network to distribute keys for the purpose of network and end-to-end application configuration management.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public IEEE_EUI64 getTrustCenterAddress() {
		return trustCenterAddress;
	}

	/**
	 * Set the specifies the IEEE address of a special device trusted by devices within a ZigBee network to distribute keys for the purpose of network and end-to-end application configuration management.
	 *
	 * @since 2.7
	 * @param trustCenterAddress the input value
	 */
	public void  setTrustCenterAddress(IEEE_EUI64 trustCenterAddress) {
		this.trustCenterAddress = trustCenterAddress;
	}

	/**
	 * Set the specifies the IEEE address of a special device trusted by devices within a ZigBee network to distribute keys for the purpose of network and end-to-end application configuration management.
	 *
	 * @since 2.7
	 * @param trustCenterAddress the input value
	 * @return this instance
	 */
	public Security withTrustCenterAddress(IEEE_EUI64 trustCenterAddress) {
		this.trustCenterAddress = trustCenterAddress;
		return this;
	}

	/**
	 * Get the specifies how an outgoing frame is to be secured, how an incoming frame purportedly has been secured; it also indicates whether or not the payload is encrypted and to what extent data authenticity over the frame is provided, as reflected by the length of the message integrity code (MIC).

          {{enum}}
	 *
	 * @since 2.7
	 * @return the value
	 */
	public String getSecurityLevel() {
		return securityLevel;
	}

	/**
	 * Set the specifies how an outgoing frame is to be secured, how an incoming frame purportedly has been secured; it also indicates whether or not the payload is encrypted and to what extent data authenticity over the frame is provided, as reflected by the length of the message integrity code (MIC).

          {{enum}}
	 *
	 * @since 2.7
	 * @param securityLevel the input value
	 */
	public void  setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	/**
	 * Set the specifies how an outgoing frame is to be secured, how an incoming frame purportedly has been secured; it also indicates whether or not the payload is encrypted and to what extent data authenticity over the frame is provided, as reflected by the length of the message integrity code (MIC).

          {{enum}}
	 *
	 * @since 2.7
	 * @param securityLevel the input value
	 * @return this instance
	 */
	public Security withSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
		return this;
	}

	/**
	 * Get the period of time, in milliseconds, that this ZigBee device will wait for an expected security protocol frame.
	 *
	 * @since 2.7
	 * @return the value
	 */
	public Long getTimeOutPeriod() {
		return timeOutPeriod;
	}

	/**
	 * Set the period of time, in milliseconds, that this ZigBee device will wait for an expected security protocol frame.
	 *
	 * @since 2.7
	 * @param timeOutPeriod the input value
	 */
	public void  setTimeOutPeriod(Long timeOutPeriod) {
		this.timeOutPeriod = timeOutPeriod;
	}

	/**
	 * Set the period of time, in milliseconds, that this ZigBee device will wait for an expected security protocol frame.
	 *
	 * @since 2.7
	 * @param timeOutPeriod the input value
	 * @return this instance
	 */
	public Security withTimeOutPeriod(Long timeOutPeriod) {
		this.timeOutPeriod = timeOutPeriod;
		return this;
	}

	//</editor-fold>

}