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
package org.broadbandforum.tr196.fapservice.capabilities;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.capabilities.umts.SelfConfig;

	/**
	 * This object contains parameters relating to the system and RF aspect of the FAP device that supports the UMTS system.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.UMTS.")
public class UMTS {

	/**
	 * Indicates the mode supported by the FAP. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DuplexMode")
	public String duplexMode;
	/**
	 * Indicates whether the FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GSMRxSupported")
	public Boolean gsmRxSupported;
	/**
	 * Indicates whether the FAP hardware supports the HSDPA capability or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HSDPASupported")
	public Boolean hsdPASupported;
	/**
	 * If the FAP hardware supports HSDPA ({{param|HSDPASupported}} is {{true}}), this parameter indicates the maximum HSDPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHSDPADataRateSupported")
	public Long maxHSDPADataRateSupported;
	/**
	 * Indicates whether the FAP hardware supports the HSUPA capability or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HSUPASupported")
	public Boolean hsuPASupported;
	/**
	 * If the FAP hardware supports HSUPA ({{param|HSUPASupported}} is {{true}}), this parameter indicates the maximum HSUPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHSUPADataRateSupported")
	public Long maxHSUPADataRateSupported;
	/**
	 * If the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of codes at the defined spreading factor (SF=16), within the complete code tree. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHSPDSCHsSupported")
	@Size(max = 15)
	public Long maxHSPDSCHsSupported;
	/**
	 * If the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of HS-SCCHs for one cell. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHSSCCHsSupported")
	public Long maxHSSCCHsSupported;
	/**
	 * {{list}} Indicates the UMTS bands that the FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.25.104}} Version 8.3.0 defines 14 UMTS bands (I through XIV).

Each individual band is identified by its upper case Roman numeral. The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.25.104}}, the corresponding new upper case Roman numeral will be included in the valid band indicators.

The followings are examples of valid values:

:"I" (specifies only band-I is supported)

:"I,II,V" (specifies 3 bands are supported)

:"II,VII,I" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FDDBandsSupported")
	@Size(max = 16)
	@XmlList
	public Collection<String> fddBandsSupported;
	/**
	 * {{list}} Indicates the GSM receive bands that the FAP supports {{bibref|3GPP-TS.45.005}}. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.45.005}} defines 14 GSM bands. 

Enumerated value must be one of [T-GSM380, T-GSM410, GSM450, GSM480, GSM710, GSM750, T-GSM810, GSM850, P-GSM900, E-GSM900, R-GSM900, T-GSM900, DCS1800, PCS1900]

The order of the band indicators in the string has no significance.

The following is an example of a valid value.

:"GSM850,PCS1900"
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GSMRxBandsSupported")
	@XmlList
	public Collection<String> gsmRxBandsSupported;
	/**
	 * This object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.UMTS.SelfConfig.}}
	 */
	@XmlElement(name = "SelfConfig")
	public SelfConfig selfConfig;

	public UMTS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the mode supported by the FAP. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDuplexMode() {
		return duplexMode;
	}

	/**
	 * Set the indicates the mode supported by the FAP. {{enum}}
	 *
	 * @since 2.0
	 * @param duplexMode the input value
	 */
	public void  setDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
	}

	/**
	 * Set the indicates the mode supported by the FAP. {{enum}}
	 *
	 * @since 2.0
	 * @param duplexMode the input value
	 * @return this instance
	 */
	public UMTS withDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
		return this;
	}

	/**
	 * Get the indicates whether the FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isGsmRxSupported() {
		return gsmRxSupported;
	}

	/**
	 * Set the indicates whether the FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 * @param gsmRxSupported the input value
	 */
	public void  setGsmRxSupported(Boolean gsmRxSupported) {
		this.gsmRxSupported = gsmRxSupported;
	}

	/**
	 * Set the indicates whether the FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 * @param gsmRxSupported the input value
	 * @return this instance
	 */
	public UMTS withGsmRxSupported(Boolean gsmRxSupported) {
		this.gsmRxSupported = gsmRxSupported;
		return this;
	}

	/**
	 * Get the indicates whether the FAP hardware supports the HSDPA capability or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHsdPASupported() {
		return hsdPASupported;
	}

	/**
	 * Set the indicates whether the FAP hardware supports the HSDPA capability or not.
	 *
	 * @since 2.0
	 * @param hsdPASupported the input value
	 */
	public void  setHsdPASupported(Boolean hsdPASupported) {
		this.hsdPASupported = hsdPASupported;
	}

	/**
	 * Set the indicates whether the FAP hardware supports the HSDPA capability or not.
	 *
	 * @since 2.0
	 * @param hsdPASupported the input value
	 * @return this instance
	 */
	public UMTS withHsdPASupported(Boolean hsdPASupported) {
		this.hsdPASupported = hsdPASupported;
		return this;
	}

	/**
	 * Get the if the FAP hardware supports HSDPA ({{param|HSDPASupported}} is {{true}}), this parameter indicates the maximum HSDPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxHSDPADataRateSupported() {
		return maxHSDPADataRateSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSDPA ({{param|HSDPASupported}} is {{true}}), this parameter indicates the maximum HSDPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 * @param maxHSDPADataRateSupported the input value
	 */
	public void  setMaxHSDPADataRateSupported(Long maxHSDPADataRateSupported) {
		this.maxHSDPADataRateSupported = maxHSDPADataRateSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSDPA ({{param|HSDPASupported}} is {{true}}), this parameter indicates the maximum HSDPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 * @param maxHSDPADataRateSupported the input value
	 * @return this instance
	 */
	public UMTS withMaxHSDPADataRateSupported(Long maxHSDPADataRateSupported) {
		this.maxHSDPADataRateSupported = maxHSDPADataRateSupported;
		return this;
	}

	/**
	 * Get the indicates whether the FAP hardware supports the HSUPA capability or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHsuPASupported() {
		return hsuPASupported;
	}

	/**
	 * Set the indicates whether the FAP hardware supports the HSUPA capability or not.
	 *
	 * @since 2.0
	 * @param hsuPASupported the input value
	 */
	public void  setHsuPASupported(Boolean hsuPASupported) {
		this.hsuPASupported = hsuPASupported;
	}

	/**
	 * Set the indicates whether the FAP hardware supports the HSUPA capability or not.
	 *
	 * @since 2.0
	 * @param hsuPASupported the input value
	 * @return this instance
	 */
	public UMTS withHsuPASupported(Boolean hsuPASupported) {
		this.hsuPASupported = hsuPASupported;
		return this;
	}

	/**
	 * Get the if the FAP hardware supports HSUPA ({{param|HSUPASupported}} is {{true}}), this parameter indicates the maximum HSUPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxHSUPADataRateSupported() {
		return maxHSUPADataRateSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSUPA ({{param|HSUPASupported}} is {{true}}), this parameter indicates the maximum HSUPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 * @param maxHSUPADataRateSupported the input value
	 */
	public void  setMaxHSUPADataRateSupported(Long maxHSUPADataRateSupported) {
		this.maxHSUPADataRateSupported = maxHSUPADataRateSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSUPA ({{param|HSUPASupported}} is {{true}}), this parameter indicates the maximum HSUPA data rate in Kbps that the device supports.
	 *
	 * @since 2.0
	 * @param maxHSUPADataRateSupported the input value
	 * @return this instance
	 */
	public UMTS withMaxHSUPADataRateSupported(Long maxHSUPADataRateSupported) {
		this.maxHSUPADataRateSupported = maxHSUPADataRateSupported;
		return this;
	}

	/**
	 * Get the if the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of codes at the defined spreading factor (SF=16), within the complete code tree. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxHSPDSCHsSupported() {
		return maxHSPDSCHsSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of codes at the defined spreading factor (SF=16), within the complete code tree. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 * @param maxHSPDSCHsSupported the input value
	 */
	public void  setMaxHSPDSCHsSupported(Long maxHSPDSCHsSupported) {
		this.maxHSPDSCHsSupported = maxHSPDSCHsSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of codes at the defined spreading factor (SF=16), within the complete code tree. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 * @param maxHSPDSCHsSupported the input value
	 * @return this instance
	 */
	public UMTS withMaxHSPDSCHsSupported(Long maxHSPDSCHsSupported) {
		this.maxHSPDSCHsSupported = maxHSPDSCHsSupported;
		return this;
	}

	/**
	 * Get the if the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of HS-SCCHs for one cell. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxHSSCCHsSupported() {
		return maxHSSCCHsSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of HS-SCCHs for one cell. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 * @param maxHSSCCHsSupported the input value
	 */
	public void  setMaxHSSCCHsSupported(Long maxHSSCCHsSupported) {
		this.maxHSSCCHsSupported = maxHSSCCHsSupported;
	}

	/**
	 * Set the if the FAP hardware supports HSPA family (either {{param|HSDPASupported}} is {{true}} or {{param|HSUPASupported}} is {{true}}), this parameter indicates the available number of HS-SCCHs for one cell. See {{bibref|3GPP-TS.32.642|Section 6.3.9}} for more details.
	 *
	 * @since 2.0
	 * @param maxHSSCCHsSupported the input value
	 * @return this instance
	 */
	public UMTS withMaxHSSCCHsSupported(Long maxHSSCCHsSupported) {
		this.maxHSSCCHsSupported = maxHSSCCHsSupported;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the UMTS bands that the FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.25.104}} Version 8.3.0 defines 14 UMTS bands (I through XIV).

Each individual band is identified by its upper case Roman numeral. The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.25.104}}, the corresponding new upper case Roman numeral will be included in the valid band indicators.

The followings are examples of valid values:

:"I" (specifies only band-I is supported)

:"I,II,V" (specifies 3 bands are supported)

:"II,VII,I" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFddBandsSupported() {
		if (this.fddBandsSupported == null){ this.fddBandsSupported=new ArrayList<>();}
		return fddBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the UMTS bands that the FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.25.104}} Version 8.3.0 defines 14 UMTS bands (I through XIV).

Each individual band is identified by its upper case Roman numeral. The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.25.104}}, the corresponding new upper case Roman numeral will be included in the valid band indicators.

The followings are examples of valid values:

:"I" (specifies only band-I is supported)

:"I,II,V" (specifies 3 bands are supported)

:"II,VII,I" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @param fddBandsSupported the input value
	 */
	public void  setFddBandsSupported(Collection<String> fddBandsSupported) {
		this.fddBandsSupported = fddBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the UMTS bands that the FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.25.104}} Version 8.3.0 defines 14 UMTS bands (I through XIV).

Each individual band is identified by its upper case Roman numeral. The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.25.104}}, the corresponding new upper case Roman numeral will be included in the valid band indicators.

The followings are examples of valid values:

:"I" (specifies only band-I is supported)

:"I,II,V" (specifies 3 bands are supported)

:"II,VII,I" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public UMTS withFddBandsSupported(String string) {
		getFddBandsSupported().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Indicates the GSM receive bands that the FAP supports {{bibref|3GPP-TS.45.005}}. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.45.005}} defines 14 GSM bands. 

Enumerated value must be one of [T-GSM380, T-GSM410, GSM450, GSM480, GSM710, GSM750, T-GSM810, GSM850, P-GSM900, E-GSM900, R-GSM900, T-GSM900, DCS1800, PCS1900]

The order of the band indicators in the string has no significance.

The following is an example of a valid value.

:"GSM850,PCS1900"
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getGsmRxBandsSupported() {
		if (this.gsmRxBandsSupported == null){ this.gsmRxBandsSupported=new ArrayList<>();}
		return gsmRxBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the GSM receive bands that the FAP supports {{bibref|3GPP-TS.45.005}}. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.45.005}} defines 14 GSM bands. 

Enumerated value must be one of [T-GSM380, T-GSM410, GSM450, GSM480, GSM710, GSM750, T-GSM810, GSM850, P-GSM900, E-GSM900, R-GSM900, T-GSM900, DCS1800, PCS1900]

The order of the band indicators in the string has no significance.

The following is an example of a valid value.

:"GSM850,PCS1900"
	 *
	 * @since 2.0
	 * @param gsmRxBandsSupported the input value
	 */
	public void  setGsmRxBandsSupported(Collection<String> gsmRxBandsSupported) {
		this.gsmRxBandsSupported = gsmRxBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the GSM receive bands that the FAP supports {{bibref|3GPP-TS.45.005}}. At least one band MUST be supported and multiple bands MAY be supported.

{{bibref|3GPP-TS.45.005}} defines 14 GSM bands. 

Enumerated value must be one of [T-GSM380, T-GSM410, GSM450, GSM480, GSM710, GSM750, T-GSM810, GSM850, P-GSM900, E-GSM900, R-GSM900, T-GSM900, DCS1800, PCS1900]

The order of the band indicators in the string has no significance.

The following is an example of a valid value.

:"GSM850,PCS1900"
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public UMTS withGsmRxBandsSupported(String string) {
		getGsmRxBandsSupported().add(string);
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.UMTS.SelfConfig.}}
	 *
	 * @return the value
	 */
	public SelfConfig getSelfConfig() {
		return selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.UMTS.SelfConfig.}}
	 *
	 * @param selfConfig the input value
	 */
	public void  setSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
	}

	/**
	 * Set the this object contains parameters relating to the self-configuration capabilities of the FAP. Self-configuration is enabled in {{object|.FAPControl.UMTS.SelfConfig.}}
	 *
	 * @param selfConfig the input value
	 * @return this instance
	 */
	public UMTS withSelfConfig(SelfConfig selfConfig) {
		this.selfConfig = selfConfig;
		return this;
	}

	//</editor-fold>

}