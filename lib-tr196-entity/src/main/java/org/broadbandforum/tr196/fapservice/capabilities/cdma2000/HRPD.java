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
package org.broadbandforum.tr196.fapservice.capabilities.cdma2000;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.capabilities.cdma2000.hrpd.SelfConfig;

	/**
	 * This object contains parameters relating to the capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.CDMA2000.HRPD.")
public class HRPD {

	/**
	 * Indicates whether the FAP is capable of supporting A13 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A13SessionTransferCapable")
	public Boolean a13SessionTransferCapable;
	/**
	 * Indicates whether the FAP is capable of supporting A16 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "A16SessionTransferCapable")
	public Boolean a16SessionTransferCapable;
	/**
	 * Indicates whether the FAP is capable of supporting Local IP access. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalIPAccessCapable")
	public Boolean localIPAccessCapable;
	/**
	 * Indicated whether the FAP supports a dedicated transmission of HRPD beacon independent of the generalized beacon.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DedicatedHRPDBeacon")
	public Boolean dedicatedHRPDBeacon;
	/**
	 * This object contains parameters relating to the self-configuration capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 */
	@XmlElement(name = "SelfConfig")
	public SelfConfig selfConfig;

	public HRPD() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the FAP is capable of supporting A13 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isA13SessionTransferCapable() {
		return a13SessionTransferCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of supporting A13 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @param a13SessionTransferCapable the input value
	 */
	public void  setA13SessionTransferCapable(Boolean a13SessionTransferCapable) {
		this.a13SessionTransferCapable = a13SessionTransferCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of supporting A13 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @param a13SessionTransferCapable the input value
	 * @return this instance
	 */
	public HRPD withA13SessionTransferCapable(Boolean a13SessionTransferCapable) {
		this.a13SessionTransferCapable = a13SessionTransferCapable;
		return this;
	}

	/**
	 * Get the indicates whether the FAP is capable of supporting A16 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isA16SessionTransferCapable() {
		return a16SessionTransferCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of supporting A16 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @param a16SessionTransferCapable the input value
	 */
	public void  setA16SessionTransferCapable(Boolean a16SessionTransferCapable) {
		this.a16SessionTransferCapable = a16SessionTransferCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of supporting A16 session transfer. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @param a16SessionTransferCapable the input value
	 * @return this instance
	 */
	public HRPD withA16SessionTransferCapable(Boolean a16SessionTransferCapable) {
		this.a16SessionTransferCapable = a16SessionTransferCapable;
		return this;
	}

	/**
	 * Get the indicates whether the FAP is capable of supporting Local IP access. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isLocalIPAccessCapable() {
		return localIPAccessCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of supporting Local IP access. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @param localIPAccessCapable the input value
	 */
	public void  setLocalIPAccessCapable(Boolean localIPAccessCapable) {
		this.localIPAccessCapable = localIPAccessCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of supporting Local IP access. See {{bibref|3GPP2-C.S0024-B}}.
	 *
	 * @since 2.0
	 * @param localIPAccessCapable the input value
	 * @return this instance
	 */
	public HRPD withLocalIPAccessCapable(Boolean localIPAccessCapable) {
		this.localIPAccessCapable = localIPAccessCapable;
		return this;
	}

	/**
	 * Get the indicated whether the FAP supports a dedicated transmission of HRPD beacon independent of the generalized beacon.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDedicatedHRPDBeacon() {
		return dedicatedHRPDBeacon;
	}

	/**
	 * Set the indicated whether the FAP supports a dedicated transmission of HRPD beacon independent of the generalized beacon.
	 *
	 * @since 2.0
	 * @param dedicatedHRPDBeacon the input value
	 */
	public void  setDedicatedHRPDBeacon(Boolean dedicatedHRPDBeacon) {
		this.dedicatedHRPDBeacon = dedicatedHRPDBeacon;
	}

	/**
	 * Set the indicated whether the FAP supports a dedicated transmission of HRPD beacon independent of the generalized beacon.
	 *
	 * @since 2.0
	 * @param dedicatedHRPDBeacon the input value
	 * @return this instance
	 */
	public HRPD withDedicatedHRPDBeacon(Boolean dedicatedHRPDBeacon) {
		this.dedicatedHRPDBeacon = dedicatedHRPDBeacon;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the self-configuration capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @return the value
	 */
	public SelfConfig getSelfConfig() {
		return selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the self-configuration capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @param selfConfig the input value
	 */
	public void  setSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the self-configuration capability attributes for the CDMA2000 HRPD radio technology portions of a CDMA2000 FAP.
	 *
	 * @param selfConfig the input value
	 * @return this instance
	 */
	public HRPD withSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
		return this;
	}

	//</editor-fold>

}