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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.capabilities.cdma2000.onex.SelfConfig;

	/**
	 * This object contains parameters relating to the capability attributes for the CDMA2000 1x radio technology portions of a CDMA2000 FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.CDMA2000.OneX.")
@XmlRootElement(name = "FAPService.Capabilities.CDMA2000.OneX")
@XmlType(name = "FAPService.Capabilities.CDMA2000.OneX")
@XmlAccessorType(XmlAccessType.FIELD)
public class OneX {

	/**
	 * {{list}} Indicates the CDMA bands that the FAP supports. At least one band MUST be supported and multiple bands MAY be supported.

Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. The following are example values:

"0"  (specifies US Cellular)

"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandClassSupportedFAP")
	@Size(max = 32)
	public String bandClassSupportedFAP;
	/**
	 * Indicates whether the FAP is capable of accepting hand-in of active 1x call from another base station. If {{true}}, the FAP is capable of accepting hand-in. If {{false}}, the FAP is not capable of accepting hand-in.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ActiveHandinCapable")
	public Boolean activeHandinCapable;
	/**
	 * Indicates whether the FAP supports Access Point Identification, Access Point Pilot Information, and Access Point Identification Text messages specified in {{bibref|3GPP2-C.S0005}}. If {{true}}, the FAP supports these messages. If {{false}}, the FAP does not supports these messages.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FemtoOverheadMessagesCapable")
	public Boolean femtoOverheadMessagesCapable;
	/**
	 * This object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}.
	 */
	@XmlElement(name = "SelfConfig")
	public SelfConfig selfConfig;

	public OneX() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Indicates the CDMA bands that the FAP supports. At least one band MUST be supported and multiple bands MAY be supported.

Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. The following are example values:

"0"  (specifies US Cellular)

"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBandClassSupportedFAP() {
		return bandClassSupportedFAP;
	}

	/**
	 * Set the {{list}} Indicates the CDMA bands that the FAP supports. At least one band MUST be supported and multiple bands MAY be supported.

Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. The following are example values:

"0"  (specifies US Cellular)

"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz)
	 *
	 * @since 2.0
	 * @param bandClassSupportedFAP the input value
	 */
	public void  setBandClassSupportedFAP(String bandClassSupportedFAP) {
		this.bandClassSupportedFAP = bandClassSupportedFAP;
	}

	/**
	 * Set the {{list}} Indicates the CDMA bands that the FAP supports. At least one band MUST be supported and multiple bands MAY be supported.

Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057}}. The following are example values:

"0"  (specifies US Cellular)

"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz)
	 *
	 * @since 2.0
	 * @param bandClassSupportedFAP the input value
	 * @return this instance
	 */
	public OneX withBandClassSupportedFAP(String bandClassSupportedFAP) {
		this.bandClassSupportedFAP = bandClassSupportedFAP;
		return this;
	}

	/**
	 * Get the indicates whether the FAP is capable of accepting hand-in of active 1x call from another base station. If {{true}}, the FAP is capable of accepting hand-in. If {{false}}, the FAP is not capable of accepting hand-in.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isActiveHandinCapable() {
		return activeHandinCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of accepting hand-in of active 1x call from another base station. If {{true}}, the FAP is capable of accepting hand-in. If {{false}}, the FAP is not capable of accepting hand-in.
	 *
	 * @since 2.0
	 * @param activeHandinCapable the input value
	 */
	public void  setActiveHandinCapable(Boolean activeHandinCapable) {
		this.activeHandinCapable = activeHandinCapable;
	}

	/**
	 * Set the indicates whether the FAP is capable of accepting hand-in of active 1x call from another base station. If {{true}}, the FAP is capable of accepting hand-in. If {{false}}, the FAP is not capable of accepting hand-in.
	 *
	 * @since 2.0
	 * @param activeHandinCapable the input value
	 * @return this instance
	 */
	public OneX withActiveHandinCapable(Boolean activeHandinCapable) {
		this.activeHandinCapable = activeHandinCapable;
		return this;
	}

	/**
	 * Get the indicates whether the FAP supports Access Point Identification, Access Point Pilot Information, and Access Point Identification Text messages specified in {{bibref|3GPP2-C.S0005}}. If {{true}}, the FAP supports these messages. If {{false}}, the FAP does not supports these messages.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isFemtoOverheadMessagesCapable() {
		return femtoOverheadMessagesCapable;
	}

	/**
	 * Set the indicates whether the FAP supports Access Point Identification, Access Point Pilot Information, and Access Point Identification Text messages specified in {{bibref|3GPP2-C.S0005}}. If {{true}}, the FAP supports these messages. If {{false}}, the FAP does not supports these messages.
	 *
	 * @since 2.0
	 * @param femtoOverheadMessagesCapable the input value
	 */
	public void  setFemtoOverheadMessagesCapable(Boolean femtoOverheadMessagesCapable) {
		this.femtoOverheadMessagesCapable = femtoOverheadMessagesCapable;
	}

	/**
	 * Set the indicates whether the FAP supports Access Point Identification, Access Point Pilot Information, and Access Point Identification Text messages specified in {{bibref|3GPP2-C.S0005}}. If {{true}}, the FAP supports these messages. If {{false}}, the FAP does not supports these messages.
	 *
	 * @since 2.0
	 * @param femtoOverheadMessagesCapable the input value
	 * @return this instance
	 */
	public OneX withFemtoOverheadMessagesCapable(Boolean femtoOverheadMessagesCapable) {
		this.femtoOverheadMessagesCapable = femtoOverheadMessagesCapable;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}.
	 *
	 * @return the value
	 */
	public SelfConfig getSelfConfig() {
		return selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}.
	 *
	 * @param selfConfig the input value
	 */
	public void  setSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.CDMA2000.OneX.SelfConfig.}}.
	 *
	 * @param selfConfig the input value
	 * @return this instance
	 */
	public OneX withSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
		return this;
	}

	//</editor-fold>

}