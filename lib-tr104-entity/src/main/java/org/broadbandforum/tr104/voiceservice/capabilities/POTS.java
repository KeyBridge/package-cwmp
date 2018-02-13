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
package org.broadbandforum.tr104.voiceservice.capabilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * The overall POTS capabilities of external ports of the CPE.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.POTS.")
@XmlRootElement(name = "POTS")
@XmlType(name = "VoiceService.Capabilities.POTS")
@XmlAccessorType(XmlAccessType.FIELD)
public class POTS {

	/**
	 * The supported supported dial type.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DialType")
	public String dialType;
	/**
	 * The external POTS ports support Calling Line identification (CLIP).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ClipGeneration")
	public Boolean clipGeneration;
	/**
	 * The external POTS ports support transmittal of a charging pulse according to TR1 TR 110.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ChargingPulse")
	public Boolean chargingPulse;

	public POTS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the supported supported dial type.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDialType() {
		return dialType;
	}

	/**
	 * Set the supported supported dial type.
	 *
	 * @since 2.0
	 * @param dialType the input value
	 */
	public void  setDialType(String dialType) {
		this.dialType = dialType;
	}

	/**
	 * Set the supported supported dial type.
	 *
	 * @since 2.0
	 * @param dialType the input value
	 * @return this instance
	 */
	public POTS withDialType(String dialType) {
		this.dialType = dialType;
		return this;
	}

	/**
	 * Get the external POTS ports support Calling Line identification (CLIP).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isClipGeneration() {
		return clipGeneration;
	}

	/**
	 * Set the external POTS ports support Calling Line identification (CLIP).
	 *
	 * @since 2.0
	 * @param clipGeneration the input value
	 */
	public void  setClipGeneration(Boolean clipGeneration) {
		this.clipGeneration = clipGeneration;
	}

	/**
	 * Set the external POTS ports support Calling Line identification (CLIP).
	 *
	 * @since 2.0
	 * @param clipGeneration the input value
	 * @return this instance
	 */
	public POTS withClipGeneration(Boolean clipGeneration) {
		this.clipGeneration = clipGeneration;
		return this;
	}

	/**
	 * Get the external POTS ports support transmittal of a charging pulse according to TR1 TR 110.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isChargingPulse() {
		return chargingPulse;
	}

	/**
	 * Set the external POTS ports support transmittal of a charging pulse according to TR1 TR 110.
	 *
	 * @since 2.0
	 * @param chargingPulse the input value
	 */
	public void  setChargingPulse(Boolean chargingPulse) {
		this.chargingPulse = chargingPulse;
	}

	/**
	 * Set the external POTS ports support transmittal of a charging pulse according to TR1 TR 110.
	 *
	 * @since 2.0
	 * @param chargingPulse the input value
	 * @return this instance
	 */
	public POTS withChargingPulse(Boolean chargingPulse) {
		this.chargingPulse = chargingPulse;
		return this;
	}

	//</editor-fold>

}