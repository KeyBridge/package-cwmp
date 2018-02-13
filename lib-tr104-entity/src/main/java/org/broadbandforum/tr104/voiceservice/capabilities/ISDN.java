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
	 * The overall ISDN capabilities of external ports of the CPE.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "VoiceService.{i}.Capabilities.ISDN.")
@XmlRootElement(name = "VoiceService.Capabilities.ISDN")
@XmlType(name = "VoiceService.Capabilities.ISDN")
@XmlAccessorType(XmlAccessType.FIELD)
public class ISDN {

	/**
	 * The external ISDN ports support {{bibref|I.251.2}} Number identification supplementary services: Multiple Subscriber Number
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MSN")
	public Boolean msn;
	/**
	 * The external ISDN ports support {{bibref|I.251.1}} Number identification supplementary services: Direct-dialling-In
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DDI")
	public Boolean ddi;
	/**
	 * The external ISDN ports support {{bibref|I.251.7}} Number identification supplementary services: Malicious call Identification
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MCID")
	public Boolean mciD;
	/**
	 * The external ISDN ports support Message Waiting Indication (MWI)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MWI")
	public Boolean mwi;
	/**
	 * The external ISDN ports support one or more of the followings AOC-services:

{{bibref|I.256.2a}} Charging supplementary services: Advice of charge: charging information at call set-up time (AOC-S)

{{bibref|I.256.2b}} Charging supplementary services: Advice of charge: charging information during the call (AOC-D)

{{bibref|I.256.2c}} Charging supplementary services: Advice of charge: charging information at the end of the call (AOC-E)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AoC")
	public Boolean aoc;
	/**
	 * The external ISDN ports support {{bibref|I.252.7}} Call offering supplementary services:

Explicit call transfer  (ECT)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ECT")
	public Boolean ect;

	public ISDN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the external ISDN ports support {{bibref|I.251.2}} Number identification supplementary services: Multiple Subscriber Number
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMsn() {
		return msn;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.251.2}} Number identification supplementary services: Multiple Subscriber Number
	 *
	 * @since 2.0
	 * @param msn the input value
	 */
	public void  setMsn(Boolean msn) {
		this.msn = msn;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.251.2}} Number identification supplementary services: Multiple Subscriber Number
	 *
	 * @since 2.0
	 * @param msn the input value
	 * @return this instance
	 */
	public ISDN withMsn(Boolean msn) {
		this.msn = msn;
		return this;
	}

	/**
	 * Get the external ISDN ports support {{bibref|I.251.1}} Number identification supplementary services: Direct-dialling-In
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDdi() {
		return ddi;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.251.1}} Number identification supplementary services: Direct-dialling-In
	 *
	 * @since 2.0
	 * @param ddi the input value
	 */
	public void  setDdi(Boolean ddi) {
		this.ddi = ddi;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.251.1}} Number identification supplementary services: Direct-dialling-In
	 *
	 * @since 2.0
	 * @param ddi the input value
	 * @return this instance
	 */
	public ISDN withDdi(Boolean ddi) {
		this.ddi = ddi;
		return this;
	}

	/**
	 * Get the external ISDN ports support {{bibref|I.251.7}} Number identification supplementary services: Malicious call Identification
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMciD() {
		return mciD;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.251.7}} Number identification supplementary services: Malicious call Identification
	 *
	 * @since 2.0
	 * @param mciD the input value
	 */
	public void  setMciD(Boolean mciD) {
		this.mciD = mciD;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.251.7}} Number identification supplementary services: Malicious call Identification
	 *
	 * @since 2.0
	 * @param mciD the input value
	 * @return this instance
	 */
	public ISDN withMciD(Boolean mciD) {
		this.mciD = mciD;
		return this;
	}

	/**
	 * Get the external ISDN ports support Message Waiting Indication (MWI)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isMwi() {
		return mwi;
	}

	/**
	 * Set the external ISDN ports support Message Waiting Indication (MWI)
	 *
	 * @since 2.0
	 * @param mwi the input value
	 */
	public void  setMwi(Boolean mwi) {
		this.mwi = mwi;
	}

	/**
	 * Set the external ISDN ports support Message Waiting Indication (MWI)
	 *
	 * @since 2.0
	 * @param mwi the input value
	 * @return this instance
	 */
	public ISDN withMwi(Boolean mwi) {
		this.mwi = mwi;
		return this;
	}

	/**
	 * Get the external ISDN ports support one or more of the followings AOC-services:

{{bibref|I.256.2a}} Charging supplementary services: Advice of charge: charging information at call set-up time (AOC-S)

{{bibref|I.256.2b}} Charging supplementary services: Advice of charge: charging information during the call (AOC-D)

{{bibref|I.256.2c}} Charging supplementary services: Advice of charge: charging information at the end of the call (AOC-E)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAoc() {
		return aoc;
	}

	/**
	 * Set the external ISDN ports support one or more of the followings AOC-services:

{{bibref|I.256.2a}} Charging supplementary services: Advice of charge: charging information at call set-up time (AOC-S)

{{bibref|I.256.2b}} Charging supplementary services: Advice of charge: charging information during the call (AOC-D)

{{bibref|I.256.2c}} Charging supplementary services: Advice of charge: charging information at the end of the call (AOC-E)
	 *
	 * @since 2.0
	 * @param aoc the input value
	 */
	public void  setAoc(Boolean aoc) {
		this.aoc = aoc;
	}

	/**
	 * Set the external ISDN ports support one or more of the followings AOC-services:

{{bibref|I.256.2a}} Charging supplementary services: Advice of charge: charging information at call set-up time (AOC-S)

{{bibref|I.256.2b}} Charging supplementary services: Advice of charge: charging information during the call (AOC-D)

{{bibref|I.256.2c}} Charging supplementary services: Advice of charge: charging information at the end of the call (AOC-E)
	 *
	 * @since 2.0
	 * @param aoc the input value
	 * @return this instance
	 */
	public ISDN withAoc(Boolean aoc) {
		this.aoc = aoc;
		return this;
	}

	/**
	 * Get the external ISDN ports support {{bibref|I.252.7}} Call offering supplementary services:

Explicit call transfer  (ECT)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEct() {
		return ect;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.252.7}} Call offering supplementary services:

Explicit call transfer  (ECT)
	 *
	 * @since 2.0
	 * @param ect the input value
	 */
	public void  setEct(Boolean ect) {
		this.ect = ect;
	}

	/**
	 * Set the external ISDN ports support {{bibref|I.252.7}} Call offering supplementary services:

Explicit call transfer  (ECT)
	 *
	 * @since 2.0
	 * @param ect the input value
	 * @return this instance
	 */
	public ISDN withEct(Boolean ect) {
		this.ect = ect;
		return this;
	}

	//</editor-fold>

}