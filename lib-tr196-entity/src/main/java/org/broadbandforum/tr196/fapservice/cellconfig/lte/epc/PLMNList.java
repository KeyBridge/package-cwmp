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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.epc;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This object contains parameters relating to list of PLMN identity specific to LTE EPC definition, called PLMN-IdentityList, as specified in SystemInformationBlockType1 message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.  At minimum 1 item MUST be present in this list, and maximum of 6 items.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.EPC.PLMNList.{i}.", uniqueConstraints = {@CWMPUnique(names = {"PLMNID"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "FAPService.CellConfig.LTE.EPC.PLMNList")
@XmlType(name = "FAPService.CellConfig.LTE.EPC.PLMNList")
@XmlAccessorType(XmlAccessType.FIELD)
public class PLMNList {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Indicates whether this {{param|PLMNID}} is a primary PLMN or not. If there is more than one instance in {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table, then ACS MUST set this {{param}} set to {{true}} in only one instance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IsPrimary")
	@CWMPParameter(access = "readWrite")
	public Boolean isprimary;
	/**
	 * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String plmNID;
	/**
	 * Indicates whether the cell is reserved for operator use or not. If {{true}}, it is reserved. If {{false}}, it is not reserved. Corresponds to "reserved" "notReserved" respectively as defined in PLMN-IdentityInfo in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReservedForOperatorUse")
	@CWMPParameter(access = "readWrite")
	public Boolean cellReservedForOperatorUse;

	public PLMNList() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public PLMNList withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public PLMNList withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates whether this {{param|PLMNID}} is a primary PLMN or not. If there is more than one instance in {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table, then ACS MUST set this {{param}} set to {{true}} in only one instance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIsprimary() {
		return isprimary;
	}

	/**
	 * Set the indicates whether this {{param|PLMNID}} is a primary PLMN or not. If there is more than one instance in {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table, then ACS MUST set this {{param}} set to {{true}} in only one instance.
	 *
	 * @since 2.0
	 * @param isprimary the input value
	 */
	public void  setIsprimary(Boolean isprimary) {
		this.isprimary = isprimary;
	}

	/**
	 * Set the indicates whether this {{param|PLMNID}} is a primary PLMN or not. If there is more than one instance in {{object|.CellConfig.LTE.EPC.PLMNList.{i}.}} table, then ACS MUST set this {{param}} set to {{true}} in only one instance.
	 *
	 * @since 2.0
	 * @param isprimary the input value
	 * @return this instance
	 */
	public PLMNList withIsprimary(Boolean isprimary) {
		this.isprimary = isprimary;
		return this;
	}

	/**
	 * Get the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPlmNID() {
		return plmNID;
	}

	/**
	 * Set the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 */
	public void  setPlmNID(String plmNID) {
		this.plmNID = plmNID;
	}

	/**
	 * Set the plmN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 * @param plmNID the input value
	 * @return this instance
	 */
	public PLMNList withPlmNID(String plmNID) {
		this.plmNID = plmNID;
		return this;
	}

	/**
	 * Get the indicates whether the cell is reserved for operator use or not. If {{true}}, it is reserved. If {{false}}, it is not reserved. Corresponds to "reserved" "notReserved" respectively as defined in PLMN-IdentityInfo in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellReservedForOperatorUse() {
		return cellReservedForOperatorUse;
	}

	/**
	 * Set the indicates whether the cell is reserved for operator use or not. If {{true}}, it is reserved. If {{false}}, it is not reserved. Corresponds to "reserved" "notReserved" respectively as defined in PLMN-IdentityInfo in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param cellReservedForOperatorUse the input value
	 */
	public void  setCellReservedForOperatorUse(Boolean cellReservedForOperatorUse) {
		this.cellReservedForOperatorUse = cellReservedForOperatorUse;
	}

	/**
	 * Set the indicates whether the cell is reserved for operator use or not. If {{true}}, it is reserved. If {{false}}, it is not reserved. Corresponds to "reserved" "notReserved" respectively as defined in PLMN-IdentityInfo in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param cellReservedForOperatorUse the input value
	 * @return this instance
	 */
	public PLMNList withCellReservedForOperatorUse(Boolean cellReservedForOperatorUse) {
		this.cellReservedForOperatorUse = cellReservedForOperatorUse;
		return this;
	}

	//</editor-fold>

}