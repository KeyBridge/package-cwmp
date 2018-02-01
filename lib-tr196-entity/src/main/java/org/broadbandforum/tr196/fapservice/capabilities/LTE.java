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

	/**
	 * This object contains parameters relating to the system and RF aspect of the FAP device that supports the LTE system.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.Capabilities.LTE.")
public class LTE {

	/**
	 * Indicates the mode supported by the LTE FAP. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DuplexMode")
	public String duplexMode;
	/**
	 * {{list}} Indicates the LTE bands that the LTE FAP supports {{bibref|3GPP-TS.36.101|Section 5.5}}. At least one band MUST be supported and multiple bands MAY be supported.

Each individual band is identified by arabic number (1, 2,...). The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.36.101}}, the corresponding new band number will be included in the valid band indicators.

The followings are examples of valid values:

:"1" (specifies only band-1 is supported)

:"1,2,11" (specifies 3 bands are supported)

:"2,11,1" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandsSupported")
	@Size(min = 33, max = 40)
	public Long bandsSupported;
	/**
	 * Indicates whether LTE FAP supports the NAS Node Selection Function (NNSF) or not. NNSF is described in {{bibref|3GPP-TS.36.300|Section 19.2.1.7 and Section 4.6.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NNSFSupported")
	public Boolean nnsFSupported;
	/**
	 * Indicates whether the LTE FAP hardware supports the receiving function of UMTS or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UMTSRxSupported")
	public Boolean umtSRxSupported;
	/**
	 * {{list}} Indicates the UMTS receive bands that the LTE FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. If {{param|UMTSRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

Each individual band is identified by its upper case Roman numeral. The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.25.104}}, the corresponding new upper case Roman numeral will be included in the valid band indicators.

The followings are examples of valid values:

:"I" (specifies only band-I is supported)

:"I,II,V" (specifies 3 bands are supported)

:"II,VII,I" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UMTSRxBandsSupported")
	@Size(max = 16)
	@XmlList
	public Collection<String> umtSRxBandsSupported;
	/**
	 * Indicates whether the LTE FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "GSMRxSupported")
	public Boolean gsmRxSupported;
	/**
	 * {{list}} Indicates the GSM receive bands that the LTE FAP supports {{bibref|3GPP-TS.45.005}}. If {{param|GSMRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

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
	 * Indicates whether the LTE FAP hardware supports the receiving function of CDMA2000 or not.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CDMA2000RxSupported")
	public Boolean cdmA2000RxSupported;
	/**
	 * {{list}} Indicates the CDMA2000 receive bands that the LTE FAP supports. If {{param|CDMA2000RxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported. The order of the band indicators in the string has no significance. Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057-B}}.

The following are example values:

:"0" (specifies US Cellular)

:"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz) specifies 3 bands are supported)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CDMA2000RxBandsSupported")
	@Size(max = 16)
	@XmlList
	public Collection<String> cdmA2000RxBandsSupported;

	public LTE() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the mode supported by the LTE FAP. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDuplexMode() {
		return duplexMode;
	}

	/**
	 * Set the indicates the mode supported by the LTE FAP. {{enum}}
	 *
	 * @since 2.0
	 * @param duplexMode the input value
	 */
	public void  setDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
	}

	/**
	 * Set the indicates the mode supported by the LTE FAP. {{enum}}
	 *
	 * @since 2.0
	 * @param duplexMode the input value
	 * @return this instance
	 */
	public LTE withDuplexMode(String duplexMode) {
		this.duplexMode = duplexMode;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the LTE bands that the LTE FAP supports {{bibref|3GPP-TS.36.101|Section 5.5}}. At least one band MUST be supported and multiple bands MAY be supported.

Each individual band is identified by arabic number (1, 2,...). The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.36.101}}, the corresponding new band number will be included in the valid band indicators.

The followings are examples of valid values:

:"1" (specifies only band-1 is supported)

:"1,2,11" (specifies 3 bands are supported)

:"2,11,1" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBandsSupported() {
		return bandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the LTE bands that the LTE FAP supports {{bibref|3GPP-TS.36.101|Section 5.5}}. At least one band MUST be supported and multiple bands MAY be supported.

Each individual band is identified by arabic number (1, 2,...). The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.36.101}}, the corresponding new band number will be included in the valid band indicators.

The followings are examples of valid values:

:"1" (specifies only band-1 is supported)

:"1,2,11" (specifies 3 bands are supported)

:"2,11,1" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @param bandsSupported the input value
	 */
	public void  setBandsSupported(Long bandsSupported) {
		this.bandsSupported = bandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the LTE bands that the LTE FAP supports {{bibref|3GPP-TS.36.101|Section 5.5}}. At least one band MUST be supported and multiple bands MAY be supported.

Each individual band is identified by arabic number (1, 2,...). The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.36.101}}, the corresponding new band number will be included in the valid band indicators.

The followings are examples of valid values:

:"1" (specifies only band-1 is supported)

:"1,2,11" (specifies 3 bands are supported)

:"2,11,1" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @param bandsSupported the input value
	 * @return this instance
	 */
	public LTE withBandsSupported(Long bandsSupported) {
		this.bandsSupported = bandsSupported;
		return this;
	}

	/**
	 * Get the indicates whether LTE FAP supports the NAS Node Selection Function (NNSF) or not. NNSF is described in {{bibref|3GPP-TS.36.300|Section 19.2.1.7 and Section 4.6.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isNnsFSupported() {
		return nnsFSupported;
	}

	/**
	 * Set the indicates whether LTE FAP supports the NAS Node Selection Function (NNSF) or not. NNSF is described in {{bibref|3GPP-TS.36.300|Section 19.2.1.7 and Section 4.6.1}}.
	 *
	 * @since 2.0
	 * @param nnsFSupported the input value
	 */
	public void  setNnsFSupported(Boolean nnsFSupported) {
		this.nnsFSupported = nnsFSupported;
	}

	/**
	 * Set the indicates whether LTE FAP supports the NAS Node Selection Function (NNSF) or not. NNSF is described in {{bibref|3GPP-TS.36.300|Section 19.2.1.7 and Section 4.6.1}}.
	 *
	 * @since 2.0
	 * @param nnsFSupported the input value
	 * @return this instance
	 */
	public LTE withNnsFSupported(Boolean nnsFSupported) {
		this.nnsFSupported = nnsFSupported;
		return this;
	}

	/**
	 * Get the indicates whether the LTE FAP hardware supports the receiving function of UMTS or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUmtSRxSupported() {
		return umtSRxSupported;
	}

	/**
	 * Set the indicates whether the LTE FAP hardware supports the receiving function of UMTS or not.
	 *
	 * @since 2.0
	 * @param umtSRxSupported the input value
	 */
	public void  setUmtSRxSupported(Boolean umtSRxSupported) {
		this.umtSRxSupported = umtSRxSupported;
	}

	/**
	 * Set the indicates whether the LTE FAP hardware supports the receiving function of UMTS or not.
	 *
	 * @since 2.0
	 * @param umtSRxSupported the input value
	 * @return this instance
	 */
	public LTE withUmtSRxSupported(Boolean umtSRxSupported) {
		this.umtSRxSupported = umtSRxSupported;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the UMTS receive bands that the LTE FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. If {{param|UMTSRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

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
	public Collection<String> getUmtSRxBandsSupported() {
		if (this.umtSRxBandsSupported == null){ this.umtSRxBandsSupported=new ArrayList<>();}
		return umtSRxBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the UMTS receive bands that the LTE FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. If {{param|UMTSRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

Each individual band is identified by its upper case Roman numeral. The order of the band indicators in the string has no significance.

In case a new band is defined in the 3GPP standard in a future release of {{bibref|3GPP-TS.25.104}}, the corresponding new upper case Roman numeral will be included in the valid band indicators.

The followings are examples of valid values:

:"I" (specifies only band-I is supported)

:"I,II,V" (specifies 3 bands are supported)

:"II,VII,I" (specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @param umtSRxBandsSupported the input value
	 */
	public void  setUmtSRxBandsSupported(Collection<String> umtSRxBandsSupported) {
		this.umtSRxBandsSupported = umtSRxBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the UMTS receive bands that the LTE FAP supports {{bibref|3GPP-TS.25.104}}, Release 8. If {{param|UMTSRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

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
	public LTE withUmtSRxBandsSupported(String string) {
		getUmtSRxBandsSupported().add(string);
		return this;
	}

	/**
	 * Get the indicates whether the LTE FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isGsmRxSupported() {
		return gsmRxSupported;
	}

	/**
	 * Set the indicates whether the LTE FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 * @param gsmRxSupported the input value
	 */
	public void  setGsmRxSupported(Boolean gsmRxSupported) {
		this.gsmRxSupported = gsmRxSupported;
	}

	/**
	 * Set the indicates whether the LTE FAP hardware supports the receiving function of GSM or not.
	 *
	 * @since 2.0
	 * @param gsmRxSupported the input value
	 * @return this instance
	 */
	public LTE withGsmRxSupported(Boolean gsmRxSupported) {
		this.gsmRxSupported = gsmRxSupported;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the GSM receive bands that the LTE FAP supports {{bibref|3GPP-TS.45.005}}. If {{param|GSMRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

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
	 * Set the {{list}} Indicates the GSM receive bands that the LTE FAP supports {{bibref|3GPP-TS.45.005}}. If {{param|GSMRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

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
	 * Set the {{list}} Indicates the GSM receive bands that the LTE FAP supports {{bibref|3GPP-TS.45.005}}. If {{param|GSMRxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported.

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
	public LTE withGsmRxBandsSupported(String string) {
		getGsmRxBandsSupported().add(string);
		return this;
	}

	/**
	 * Get the indicates whether the LTE FAP hardware supports the receiving function of CDMA2000 or not.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCdmA2000RxSupported() {
		return cdmA2000RxSupported;
	}

	/**
	 * Set the indicates whether the LTE FAP hardware supports the receiving function of CDMA2000 or not.
	 *
	 * @since 2.0
	 * @param cdmA2000RxSupported the input value
	 */
	public void  setCdmA2000RxSupported(Boolean cdmA2000RxSupported) {
		this.cdmA2000RxSupported = cdmA2000RxSupported;
	}

	/**
	 * Set the indicates whether the LTE FAP hardware supports the receiving function of CDMA2000 or not.
	 *
	 * @since 2.0
	 * @param cdmA2000RxSupported the input value
	 * @return this instance
	 */
	public LTE withCdmA2000RxSupported(Boolean cdmA2000RxSupported) {
		this.cdmA2000RxSupported = cdmA2000RxSupported;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the CDMA2000 receive bands that the LTE FAP supports. If {{param|CDMA2000RxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported. The order of the band indicators in the string has no significance. Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057-B}}.

The following are example values:

:"0" (specifies US Cellular)

:"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz) specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getCdmA2000RxBandsSupported() {
		if (this.cdmA2000RxBandsSupported == null){ this.cdmA2000RxBandsSupported=new ArrayList<>();}
		return cdmA2000RxBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the CDMA2000 receive bands that the LTE FAP supports. If {{param|CDMA2000RxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported. The order of the band indicators in the string has no significance. Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057-B}}.

The following are example values:

:"0" (specifies US Cellular)

:"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz) specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @param cdmA2000RxBandsSupported the input value
	 */
	public void  setCdmA2000RxBandsSupported(Collection<String> cdmA2000RxBandsSupported) {
		this.cdmA2000RxBandsSupported = cdmA2000RxBandsSupported;
	}

	/**
	 * Set the {{list}} Indicates the CDMA2000 receive bands that the LTE FAP supports. If {{param|CDMA2000RxSupported}} is {{true}}, then at least one band MUST be supported and multiple bands MAY be supported. The order of the band indicators in the string has no significance. Bandclass is a 1 or 2-digit number as defined in {{bibref|3GPP2-C.S0057-B}}.

The following are example values:

:"0" (specifies US Cellular)

:"1,3,14" (specifies US PCS, Japan Cellular and US PCS 1.9Ghz) specifies 3 bands are supported)
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public LTE withCdmA2000RxBandsSupported(String string) {
		getCdmA2000RxBandsSupported().add(string);
		return this;
	}

	//</editor-fold>

}