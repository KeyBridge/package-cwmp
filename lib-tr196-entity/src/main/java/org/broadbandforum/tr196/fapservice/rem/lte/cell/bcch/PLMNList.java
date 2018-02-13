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
package org.broadbandforum.tr196.fapservice.rem.lte.cell.bcch;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table containing the PLMN list in the system information broadcast in the BCCH logical channel. Correspnds to plmn-IdentityList as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.")
@XmlRootElement(name = "FAPService.REM.LTE.Cell.BCCH.PLMNList")
@XmlType(name = "FAPService.REM.LTE.Cell.BCCH.PLMNList")
@XmlAccessorType(XmlAccessType.FIELD)
public class PLMNList {

	/**
	 * PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

Mobile Country Code consists of three digits and uniquely identifies the country of domicile of the subscriber. Mobile Network Code consists of two or three digits and identifies the Home PLMN within a country.  For a 2-digit MNC the total string length of {{param}} is 5.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNID")
	@Size(max = 6)
	public String plmNID;
	/**
	 * Indicates whether the cell is reserved for operator use or not. If {{true}}, it is reserved. If {{false}}, it is not reserved. Corresponds to "reserved" "notReserved" respectively as defined in PLMN-IdentityInfo in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReservedForOperatorUse")
	public Boolean cellReservedForOperatorUse;

	public PLMNList() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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