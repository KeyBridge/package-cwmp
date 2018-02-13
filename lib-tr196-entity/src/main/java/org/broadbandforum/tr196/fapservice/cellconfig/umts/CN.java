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
package org.broadbandforum.tr196.fapservice.cellconfig.umts;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.CSDomain;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.HHO;
import org.broadbandforum.tr196.fapservice.cellconfig.umts.cn.PSDomain;

	/**
	 * This object contains parameters relating to configuring UMTS CN.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.CN.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.CN")
@XmlType(name = "FAPService.CellConfig.UMTS.CN")
@XmlAccessorType(XmlAccessType.FIELD)
public class CN {

	/**
	 * Type of Public Land Mobile Network (PLMN).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNType")
	@CWMPParameter(access = "readWrite")
	public String plmNType;
	/**
	 * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String plmNID;
	/**
	 * {{list}} Each item is a PLMNID.

PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of the PLMNID is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EquivPLMNID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> equivPLMNID;
	/**
	 * Service Area Code (SAC)  {{bibref|3GPP-TS.23.003}}.

The concatenation of PLMN ID (MCC+MNC), LAC, and SAC uniquely identifies the Service Area ID (SAI).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SAC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long sac;
	/**
	 * Service Area Code (SAC) for broadcast. The format of this parameter is the same with {{param|SAC}}, and it uniquely identifies the Service Area ID (SAI) for Earthquake and Tsunami Warning Services (ETWS) {{bibref|3GPP-TS.25.469|Section 9.1.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BroadcastSAC")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long broadcastSAC;
	/**
	 * {{list}}  Each item is a LAC/RAC combination expressed in the following format:

:<LAC or LACrange>':'<RAC or RACrange>

Where LAC and RAC are single values, while LACrange and RACrange are inclusive and can be expressed in the following format:

:<Start-value>".."<End-value>

Location Area Code (LAC) consists of up to 5 numerical characters. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI). {{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}.

Routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}.

The FAP is to select one LAC and RAC from the combination(s) expressed in this parameter for use in {{param|LACInUse}} and {{param|RACInUse}} respectively.

If a LAC occurs more than once in the list, this shall not increase the chance that it is selected over other LAC values in the list.

The following are examples of the valid LACRAC combination formats:

:"64000:210"

::(one list item with single value for LAC and RAC)

:"64000..64100:210, 64101:211"

::(two list items, first item has a LAC range)

:"64000:210..214, 64001:215..219"

::(two list items, both items have a RAC range for a specific LAC value)

:"64000..64100:210..214"

::(one list item both have a LAC range and a RAC range)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LACRAC")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> lacRAC;
	/**
	 * The LAC being used by the FAP.

Self-configuration for LAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first LAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LACInUse")
	@Size(max = 65535)
	public Long lacInUse;
	/**
	 * The RAC being used by the FAP.

Self-configuration for RAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first RAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RACInUse")
	@Size(max = 255)
	public Long racInUse;
	/**
	 * This object contains parameters relating to configuring the CS domain of the UMTS CN.
	 */
	@XmlElement(name = "CSDomain")
	public CSDomain csdomain;
	/**
	 * This object contains parameters relating to configuring the PS domain of the UMTS CN.
	 */
	@XmlElement(name = "PSDomain")
	public PSDomain psdomain;
	/**
	 * This object provides monitoring of the Hard Handover (HHO) properties in the HNB.
	 */
	@XmlElement(name = "HHO")
	public HHO hho;

	public CN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the type of Public Land Mobile Network (PLMN).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPlmNType() {
		return plmNType;
	}

	/**
	 * Set the type of Public Land Mobile Network (PLMN).
	 *
	 * @since 2.0
	 * @param plmNType the input value
	 */
	public void  setPlmNType(String plmNType) {
		this.plmNType = plmNType;
	}

	/**
	 * Set the type of Public Land Mobile Network (PLMN).
	 *
	 * @since 2.0
	 * @param plmNType the input value
	 * @return this instance
	 */
	public CN withPlmNType(String plmNType) {
		this.plmNType = plmNType;
		return this;
	}

	/**
	 * Get the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPlmNID() {
		return plmNID;
	}

	/**
	 * Set the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 */
	public void  setPlmNID(String plmNID) {
		this.plmNID = plmNID;
	}

	/**
	 * Set the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 * @return this instance
	 */
	public CN withPlmNID(String plmNID) {
		this.plmNID = plmNID;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a PLMNID.

PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of the PLMNID is 5.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getEquivPLMNID() {
		if (this.equivPLMNID == null){ this.equivPLMNID=new ArrayList<>();}
		return equivPLMNID;
	}

	/**
	 * Set the {{list}} Each item is a PLMNID.

PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of the PLMNID is 5.
	 *
	 * @since 2.0
	 * @param equivPLMNID the input value
	 */
	public void  setEquivPLMNID(Collection<String> equivPLMNID) {
		this.equivPLMNID = equivPLMNID;
	}

	/**
	 * Set the {{list}} Each item is a PLMNID.

PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber.

Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.

For a 2-digit MNC the total string length of the PLMNID is 5.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CN withEquivPLMNID(String string) {
		getEquivPLMNID().add(string);
		return this;
	}

	/**
	 * Get the service Area Code (SAC)  {{bibref|3GPP-TS.23.003}}.

The concatenation of PLMN ID (MCC+MNC), LAC, and SAC uniquely identifies the Service Area ID (SAI).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSac() {
		return sac;
	}

	/**
	 * Set the service Area Code (SAC)  {{bibref|3GPP-TS.23.003}}.

The concatenation of PLMN ID (MCC+MNC), LAC, and SAC uniquely identifies the Service Area ID (SAI).
	 *
	 * @since 2.0
	 * @param sac the input value
	 */
	public void  setSac(Long sac) {
		this.sac = sac;
	}

	/**
	 * Set the service Area Code (SAC)  {{bibref|3GPP-TS.23.003}}.

The concatenation of PLMN ID (MCC+MNC), LAC, and SAC uniquely identifies the Service Area ID (SAI).
	 *
	 * @since 2.0
	 * @param sac the input value
	 * @return this instance
	 */
	public CN withSac(Long sac) {
		this.sac = sac;
		return this;
	}

	/**
	 * Get the service Area Code (SAC) for broadcast. The format of this parameter is the same with {{param|SAC}}, and it uniquely identifies the Service Area ID (SAI) for Earthquake and Tsunami Warning Services (ETWS) {{bibref|3GPP-TS.25.469|Section 9.1.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBroadcastSAC() {
		return broadcastSAC;
	}

	/**
	 * Set the service Area Code (SAC) for broadcast. The format of this parameter is the same with {{param|SAC}}, and it uniquely identifies the Service Area ID (SAI) for Earthquake and Tsunami Warning Services (ETWS) {{bibref|3GPP-TS.25.469|Section 9.1.3}}.
	 *
	 * @since 2.0
	 * @param broadcastSAC the input value
	 */
	public void  setBroadcastSAC(Long broadcastSAC) {
		this.broadcastSAC = broadcastSAC;
	}

	/**
	 * Set the service Area Code (SAC) for broadcast. The format of this parameter is the same with {{param|SAC}}, and it uniquely identifies the Service Area ID (SAI) for Earthquake and Tsunami Warning Services (ETWS) {{bibref|3GPP-TS.25.469|Section 9.1.3}}.
	 *
	 * @since 2.0
	 * @param broadcastSAC the input value
	 * @return this instance
	 */
	public CN withBroadcastSAC(Long broadcastSAC) {
		this.broadcastSAC = broadcastSAC;
		return this;
	}

	/**
	 * Get the {{list}}  Each item is a LAC/RAC combination expressed in the following format:

:<LAC or LACrange>':'<RAC or RACrange>

Where LAC and RAC are single values, while LACrange and RACrange are inclusive and can be expressed in the following format:

:<Start-value>".."<End-value>

Location Area Code (LAC) consists of up to 5 numerical characters. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI). {{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}.

Routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}.

The FAP is to select one LAC and RAC from the combination(s) expressed in this parameter for use in {{param|LACInUse}} and {{param|RACInUse}} respectively.

If a LAC occurs more than once in the list, this shall not increase the chance that it is selected over other LAC values in the list.

The following are examples of the valid LACRAC combination formats:

:"64000:210"

::(one list item with single value for LAC and RAC)

:"64000..64100:210, 64101:211"

::(two list items, first item has a LAC range)

:"64000:210..214, 64001:215..219"

::(two list items, both items have a RAC range for a specific LAC value)

:"64000..64100:210..214"

::(one list item both have a LAC range and a RAC range)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getLacRAC() {
		if (this.lacRAC == null){ this.lacRAC=new ArrayList<>();}
		return lacRAC;
	}

	/**
	 * Set the {{list}}  Each item is a LAC/RAC combination expressed in the following format:

:<LAC or LACrange>':'<RAC or RACrange>

Where LAC and RAC are single values, while LACrange and RACrange are inclusive and can be expressed in the following format:

:<Start-value>".."<End-value>

Location Area Code (LAC) consists of up to 5 numerical characters. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI). {{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}.

Routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}.

The FAP is to select one LAC and RAC from the combination(s) expressed in this parameter for use in {{param|LACInUse}} and {{param|RACInUse}} respectively.

If a LAC occurs more than once in the list, this shall not increase the chance that it is selected over other LAC values in the list.

The following are examples of the valid LACRAC combination formats:

:"64000:210"

::(one list item with single value for LAC and RAC)

:"64000..64100:210, 64101:211"

::(two list items, first item has a LAC range)

:"64000:210..214, 64001:215..219"

::(two list items, both items have a RAC range for a specific LAC value)

:"64000..64100:210..214"

::(one list item both have a LAC range and a RAC range)
	 *
	 * @since 2.0
	 * @param lacRAC the input value
	 */
	public void  setLacRAC(Collection<String> lacRAC) {
		this.lacRAC = lacRAC;
	}

	/**
	 * Set the {{list}}  Each item is a LAC/RAC combination expressed in the following format:

:<LAC or LACrange>':'<RAC or RACrange>

Where LAC and RAC are single values, while LACrange and RACrange are inclusive and can be expressed in the following format:

:<Start-value>".."<End-value>

Location Area Code (LAC) consists of up to 5 numerical characters. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the Location Area ID (LAI). {{bibref|3GPP-TS.23.003|Section 4.1}} {{bibref|3GPP-TS.25.413|Section 9.2.3.6}}.

Routing Area Code (RAC) consists of up to 3 numerical characters. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the Routing Area ID (RAI). {{bibref|3GPP-TS.23.003|Section 4.2}} {{bibref|3GPP-TS.25.413|Section 9.2.3.7}}.

The FAP is to select one LAC and RAC from the combination(s) expressed in this parameter for use in {{param|LACInUse}} and {{param|RACInUse}} respectively.

If a LAC occurs more than once in the list, this shall not increase the chance that it is selected over other LAC values in the list.

The following are examples of the valid LACRAC combination formats:

:"64000:210"

::(one list item with single value for LAC and RAC)

:"64000..64100:210, 64101:211"

::(two list items, first item has a LAC range)

:"64000:210..214, 64001:215..219"

::(two list items, both items have a RAC range for a specific LAC value)

:"64000..64100:210..214"

::(one list item both have a LAC range and a RAC range)
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CN withLacRAC(String string) {
		getLacRAC().add(string);
		return this;
	}

	/**
	 * Get the LAC being used by the FAP.

Self-configuration for LAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first LAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLacInUse() {
		return lacInUse;
	}

	/**
	 * Set the LAC being used by the FAP.

Self-configuration for LAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first LAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 * @param lacInUse the input value
	 */
	public void  setLacInUse(Long lacInUse) {
		this.lacInUse = lacInUse;
	}

	/**
	 * Set the LAC being used by the FAP.

Self-configuration for LAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first LAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 * @param lacInUse the input value
	 * @return this instance
	 */
	public CN withLacInUse(Long lacInUse) {
		this.lacInUse = lacInUse;
		return this;
	}

	/**
	 * Get the RAC being used by the FAP.

Self-configuration for RAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first RAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRacInUse() {
		return racInUse;
	}

	/**
	 * Set the RAC being used by the FAP.

Self-configuration for RAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first RAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 * @param racInUse the input value
	 */
	public void  setRacInUse(Long racInUse) {
		this.racInUse = racInUse;
	}

	/**
	 * Set the RAC being used by the FAP.

Self-configuration for RAC is controlled by {{param|.Capabilities.UMTS.SelfConfig.LACRACURAConfig}} from an availability perspective and {{param|.FAPControl.UMTS.SelfConfig.LACRACURASelfConfigEnable}} from an enabled perspective.

If the self-configuration capability is available and enabled, this parameter indicates the value selected by the FAP among the choices provided in {{param|LACRAC}}.

If the self-configuration capability is not available or not enabled, then this parameter contains the first RAC value in {{param|LACRAC}}.
	 *
	 * @since 2.0
	 * @param racInUse the input value
	 * @return this instance
	 */
	public CN withRacInUse(Long racInUse) {
		this.racInUse = racInUse;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring the CS domain of the UMTS CN.
	 *
	 * @return the value
	 */
	public CSDomain getCsdomain() {
		return csdomain;
	}

	/**
	 * Set the this object contains parameters relating to configuring the CS domain of the UMTS CN.
	 *
	 * @param csdomain the input value
	 */
	public void  setCsdomain(CSDomain csdomain) {
		this.csdomain = csdomain;
	}

	/**
	 * Set the this object contains parameters relating to configuring the CS domain of the UMTS CN.
	 *
	 * @param csdomain the input value
	 * @return this instance
	 */
	public CN withCsdomain(CSDomain csdomain) {
		this.csdomain = csdomain;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to configuring the PS domain of the UMTS CN.
	 *
	 * @return the value
	 */
	public PSDomain getPsdomain() {
		return psdomain;
	}

	/**
	 * Set the this object contains parameters relating to configuring the PS domain of the UMTS CN.
	 *
	 * @param psdomain the input value
	 */
	public void  setPsdomain(PSDomain psdomain) {
		this.psdomain = psdomain;
	}

	/**
	 * Set the this object contains parameters relating to configuring the PS domain of the UMTS CN.
	 *
	 * @param psdomain the input value
	 * @return this instance
	 */
	public CN withPsdomain(PSDomain psdomain) {
		this.psdomain = psdomain;
		return this;
	}

	/**
	 * Get the this object provides monitoring of the Hard Handover (HHO) properties in the HNB.
	 *
	 * @return the value
	 */
	public HHO getHho() {
		return hho;
	}

	/**
	 * Set the this object provides monitoring of the Hard Handover (HHO) properties in the HNB.
	 *
	 * @param hho the input value
	 */
	public void  setHho(HHO hho) {
		this.hho = hho;
	}

	/**
	 * Set the this object provides monitoring of the Hard Handover (HHO) properties in the HNB.
	 *
	 * @param hho the input value
	 * @return this instance
	 */
	public CN withHho(HHO hho) {
		this.hho = hho;
		return this;
	}

	//</editor-fold>

}