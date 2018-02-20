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
package org.broadbandforum.tr196.fapservice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.capabilities.CDMA2000;
import org.broadbandforum.tr196.fapservice.capabilities.LTE;
import org.broadbandforum.tr196.fapservice.capabilities.UMTS;

	/**
	 * This object contains parameters relating to the hardware capabilities of the FAP device.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.")
@XmlRootElement(name = "FAPService.Capabilities")
@XmlType(name = "FAPService.Capabilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class Capabilities {

	/**
	 * Indicates whether the FAP is equipped with a GPS receiver or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GPSEquipped")
	public Boolean gpsEquipped;
	/**
	 * Indicates the maximum possible transmit power in dBm that the FAP hardware can support.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxTxPower")
	public Long maxTxPower;
	/**
	 * {{list}} Each entry is a type of system that the FAP supports. 

Enumerated value must be one of [UMTS, LTE, CDMA1x, CDMAHRPD]
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SupportedSystems")
	@CWMPParameter(activeNotify = "canDeny")
	@XmlList
	public Collection<String> supportedSystems;
	/**
	 * Indicates whether FAP can support beacon transmission.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Beacon")
	@CWMPParameter(activeNotify = "canDeny")
	public Boolean beacon;
	/**
	 * This object contains parameters relating to the system and RF aspect of the FAP device that supports the UMTS system.
	 */
	@XmlElement(name = "UMTS")
	public UMTS umtS;
	/**
	 * This object contains parameters relating to the system and RF aspect of the FAP device that supports the LTE system.
	 */
	@XmlElement(name = "LTE")
	public LTE lte;
	/**
	 * This object contains parameters relating to the capability attributes for CDMA2000 FAP.
	 */
	@XmlElement(name = "CDMA2000")
	public CDMA2000 cdmA2000;

	public Capabilities() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the FAP is equipped with a GPS receiver or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isGpsEquipped() {
		return gpsEquipped;
	}

	/**
	 * Set the indicates whether the FAP is equipped with a GPS receiver or not.
	 *
	 * @since 2.0
	 * @param gpsEquipped the input value
	 */
	public void  setGpsEquipped(Boolean gpsEquipped) {
		this.gpsEquipped = gpsEquipped;
	}

	/**
	 * Set the indicates whether the FAP is equipped with a GPS receiver or not.
	 *
	 * @since 2.0
	 * @param gpsEquipped the input value
	 * @return this instance
	 */
	public Capabilities withGpsEquipped(Boolean gpsEquipped) {
		this.gpsEquipped = gpsEquipped;
		return this;
	}

	/**
	 * Get the indicates the maximum possible transmit power in dBm that the FAP hardware can support.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxTxPower() {
		return maxTxPower;
	}

	/**
	 * Set the indicates the maximum possible transmit power in dBm that the FAP hardware can support.
	 *
	 * @since 2.0
	 * @param maxTxPower the input value
	 */
	public void  setMaxTxPower(Long maxTxPower) {
		this.maxTxPower = maxTxPower;
	}

	/**
	 * Set the indicates the maximum possible transmit power in dBm that the FAP hardware can support.
	 *
	 * @since 2.0
	 * @param maxTxPower the input value
	 * @return this instance
	 */
	public Capabilities withMaxTxPower(Long maxTxPower) {
		this.maxTxPower = maxTxPower;
		return this;
	}

	/**
	 * Get the {{list}} Each entry is a type of system that the FAP supports. 

Enumerated value must be one of [UMTS, LTE, CDMA1x, CDMAHRPD]
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSupportedSystems() {
		if (this.supportedSystems == null){ this.supportedSystems=new ArrayList<>();}
		return supportedSystems;
	}

	/**
	 * Set the {{list}} Each entry is a type of system that the FAP supports. 

Enumerated value must be one of [UMTS, LTE, CDMA1x, CDMAHRPD]
	 *
	 * @since 2.0
	 * @param supportedSystems the input value
	 */
	public void  setSupportedSystems(Collection<String> supportedSystems) {
		this.supportedSystems = supportedSystems;
	}

	/**
	 * Set the {{list}} Each entry is a type of system that the FAP supports. 

Enumerated value must be one of [UMTS, LTE, CDMA1x, CDMAHRPD]
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Capabilities withSupportedSystems(String string) {
		getSupportedSystems().add(string);
		return this;
	}

	/**
	 * Get the indicates whether FAP can support beacon transmission.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isBeacon() {
		return beacon;
	}

	/**
	 * Set the indicates whether FAP can support beacon transmission.
	 *
	 * @since 2.0
	 * @param beacon the input value
	 */
	public void  setBeacon(Boolean beacon) {
		this.beacon = beacon;
	}

	/**
	 * Set the indicates whether FAP can support beacon transmission.
	 *
	 * @since 2.0
	 * @param beacon the input value
	 * @return this instance
	 */
	public Capabilities withBeacon(Boolean beacon) {
		this.beacon = beacon;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the system and RF aspect of the FAP device that supports the UMTS system.
	 *
	 * @return the value
	 */
	public UMTS getUmtS() {
		return umtS;
	}

	/**
	 * Set the this object contains parameters relating to the system and RF aspect of the FAP device that supports the UMTS system.
	 *
	 * @param umtS the input value
	 */
	public void  setUmtS(UMTS umtS) {
		this.umtS = umtS;
	}

	/**
	 * Set the this object contains parameters relating to the system and RF aspect of the FAP device that supports the UMTS system.
	 *
	 * @param umtS the input value
	 * @return this instance
	 */
	public Capabilities withUmtS(UMTS umtS) {
		this.umtS = umtS;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the system and RF aspect of the FAP device that supports the LTE system.
	 *
	 * @return the value
	 */
	public LTE getLte() {
		return lte;
	}

	/**
	 * Set the this object contains parameters relating to the system and RF aspect of the FAP device that supports the LTE system.
	 *
	 * @param lte the input value
	 */
	public void  setLte(LTE lte) {
		this.lte = lte;
	}

	/**
	 * Set the this object contains parameters relating to the system and RF aspect of the FAP device that supports the LTE system.
	 *
	 * @param lte the input value
	 * @return this instance
	 */
	public Capabilities withLte(LTE lte) {
		this.lte = lte;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the capability attributes for CDMA2000 FAP.
	 *
	 * @return the value
	 */
	public CDMA2000 getCdmA2000() {
		return cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to the capability attributes for CDMA2000 FAP.
	 *
	 * @param cdmA2000 the input value
	 */
	public void  setCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
	}

	/**
	 * Set the this object contains parameters relating to the capability attributes for CDMA2000 FAP.
	 *
	 * @param cdmA2000 the input value
	 * @return this instance
	 */
	public Capabilities withCdmA2000(CDMA2000 cdmA2000) {
		this.cdmA2000 = cdmA2000;
		return this;
	}

	//</editor-fold>

}