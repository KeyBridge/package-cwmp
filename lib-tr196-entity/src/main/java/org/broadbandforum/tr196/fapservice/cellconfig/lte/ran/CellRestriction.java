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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the cell restriction configuration.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.CellRestriction.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.CellRestriction")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.CellRestriction")
@XmlAccessorType(XmlAccessType.FIELD)
public class CellRestriction {

	/**
	 * Indicates whether the  is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred.

Corresponds to parameter CellBarred specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellBarred")
	@CWMPParameter(access = "readWrite")
	public Boolean cellBarred;
	/**
	 * Indicates whether the  is reserved for operator's use or not. If {{true}}, the cell is reserved for operator use. If {{false}}, the cell is not reserved for operator use.

Corresponds to parameter cellReservedForOperatorUse specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReservedForOperatorUse")
	@CWMPParameter(access = "readWrite")
	public Boolean cellReservedForOperatorUse;
	/**
	 * Indicates whether the  is barred for Access Class 10 or not.

If {{true}}, the cell is barred for Access Class 10.

If {{false}}, the cell is not barred for Access Class 10.

Corresponds to parameter ac-BarringForEmergency specified in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BarringForEmergency")
	@CWMPParameter(access = "readWrite")
	public Boolean barringForEmergency;

	public CellRestriction() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the  is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred.

Corresponds to parameter CellBarred specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellBarred() {
		return cellBarred;
	}

	/**
	 * Set the indicates whether the  is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred.

Corresponds to parameter CellBarred specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param cellBarred the input value
	 */
	public void  setCellBarred(Boolean cellBarred) {
		this.cellBarred = cellBarred;
	}

	/**
	 * Set the indicates whether the  is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred.

Corresponds to parameter CellBarred specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param cellBarred the input value
	 * @return this instance
	 */
	public CellRestriction withCellBarred(Boolean cellBarred) {
		this.cellBarred = cellBarred;
		return this;
	}

	/**
	 * Get the indicates whether the  is reserved for operator's use or not. If {{true}}, the cell is reserved for operator use. If {{false}}, the cell is not reserved for operator use.

Corresponds to parameter cellReservedForOperatorUse specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellReservedForOperatorUse() {
		return cellReservedForOperatorUse;
	}

	/**
	 * Set the indicates whether the  is reserved for operator's use or not. If {{true}}, the cell is reserved for operator use. If {{false}}, the cell is not reserved for operator use.

Corresponds to parameter cellReservedForOperatorUse specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param cellReservedForOperatorUse the input value
	 */
	public void  setCellReservedForOperatorUse(Boolean cellReservedForOperatorUse) {
		this.cellReservedForOperatorUse = cellReservedForOperatorUse;
	}

	/**
	 * Set the indicates whether the  is reserved for operator's use or not. If {{true}}, the cell is reserved for operator use. If {{false}}, the cell is not reserved for operator use.

Corresponds to parameter cellReservedForOperatorUse specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param cellReservedForOperatorUse the input value
	 * @return this instance
	 */
	public CellRestriction withCellReservedForOperatorUse(Boolean cellReservedForOperatorUse) {
		this.cellReservedForOperatorUse = cellReservedForOperatorUse;
		return this;
	}

	/**
	 * Get the indicates whether the  is barred for Access Class 10 or not.

If {{true}}, the cell is barred for Access Class 10.

If {{false}}, the cell is not barred for Access Class 10.

Corresponds to parameter ac-BarringForEmergency specified in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isBarringForEmergency() {
		return barringForEmergency;
	}

	/**
	 * Set the indicates whether the  is barred for Access Class 10 or not.

If {{true}}, the cell is barred for Access Class 10.

If {{false}}, the cell is not barred for Access Class 10.

Corresponds to parameter ac-BarringForEmergency specified in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param barringForEmergency the input value
	 */
	public void  setBarringForEmergency(Boolean barringForEmergency) {
		this.barringForEmergency = barringForEmergency;
	}

	/**
	 * Set the indicates whether the  is barred for Access Class 10 or not.

If {{true}}, the cell is barred for Access Class 10.

If {{false}}, the cell is not barred for Access Class 10.

Corresponds to parameter ac-BarringForEmergency specified in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param barringForEmergency the input value
	 * @return this instance
	 */
	public CellRestriction withBarringForEmergency(Boolean barringForEmergency) {
		this.barringForEmergency = barringForEmergency;
		return this;
	}

	//</editor-fold>

}