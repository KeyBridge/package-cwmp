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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to cell access restriction.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.CellRestriction.")
@XmlRootElement(name = "CellRestriction")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.CellRestriction")
@XmlAccessorType(XmlAccessType.FIELD)
public class CellRestriction {

	/**
	 * Indicates whether the FAP is barred from service or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellBarred")
	@CWMPParameter(access = "readWrite")
	public Boolean cellBarred;
	/**
	 * When {{param|CellBarred}} is {{true}}, this indicates whether the intra-frequency cell re-selection is allowed or not.

{{param}} has no meaning if {{param|CellBarred}} is {{false}} and MUST be ignored in such cases.

{{true}} means that intra-frequency cell re-selection is allowed.

{{false}} means that intra-frequency cell re-selection is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IntraFreqCellReselectionIndicator")
	@CWMPParameter(access = "readWrite")
	public Boolean intraFreqCellReselectionIndicator;
	/**
	 * The time period in seconds during which the UE is barred from accessing the FAP.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TBarred")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1280, max = 1280)
	public Long tbarred;
	/**
	 * {{list}} Each entry is an Access Class that is barred from CS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessClassBarredListCS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long accessClassBarredListCS;
	/**
	 * {{list}} Each entry is an Access Class that is barred from PS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccessClassBarredListPS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long accessClassBarredListPS;
	/**
	 * Indicates whether the FAP is reserved for operator use or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReservedForOperatorUse")
	@CWMPParameter(access = "readWrite")
	public Boolean cellReservedForOperatorUse;

	public CellRestriction() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether the FAP is barred from service or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellBarred() {
		return cellBarred;
	}

	/**
	 * Set the indicates whether the FAP is barred from service or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param cellBarred the input value
	 */
	public void  setCellBarred(Boolean cellBarred) {
		this.cellBarred = cellBarred;
	}

	/**
	 * Set the indicates whether the FAP is barred from service or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
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
	 * Get the when {{param|CellBarred}} is {{true}}, this indicates whether the intra-frequency cell re-selection is allowed or not.

{{param}} has no meaning if {{param|CellBarred}} is {{false}} and MUST be ignored in such cases.

{{true}} means that intra-frequency cell re-selection is allowed.

{{false}} means that intra-frequency cell re-selection is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isIntraFreqCellReselectionIndicator() {
		return intraFreqCellReselectionIndicator;
	}

	/**
	 * Set the when {{param|CellBarred}} is {{true}}, this indicates whether the intra-frequency cell re-selection is allowed or not.

{{param}} has no meaning if {{param|CellBarred}} is {{false}} and MUST be ignored in such cases.

{{true}} means that intra-frequency cell re-selection is allowed.

{{false}} means that intra-frequency cell re-selection is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param intraFreqCellReselectionIndicator the input value
	 */
	public void  setIntraFreqCellReselectionIndicator(Boolean intraFreqCellReselectionIndicator) {
		this.intraFreqCellReselectionIndicator = intraFreqCellReselectionIndicator;
	}

	/**
	 * Set the when {{param|CellBarred}} is {{true}}, this indicates whether the intra-frequency cell re-selection is allowed or not.

{{param}} has no meaning if {{param|CellBarred}} is {{false}} and MUST be ignored in such cases.

{{true}} means that intra-frequency cell re-selection is allowed.

{{false}} means that intra-frequency cell re-selection is not allowed.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param intraFreqCellReselectionIndicator the input value
	 * @return this instance
	 */
	public CellRestriction withIntraFreqCellReselectionIndicator(Boolean intraFreqCellReselectionIndicator) {
		this.intraFreqCellReselectionIndicator = intraFreqCellReselectionIndicator;
		return this;
	}

	/**
	 * Get the time period in seconds during which the UE is barred from accessing the FAP.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTbarred() {
		return tbarred;
	}

	/**
	 * Set the time period in seconds during which the UE is barred from accessing the FAP.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param tbarred the input value
	 */
	public void  setTbarred(Long tbarred) {
		this.tbarred = tbarred;
	}

	/**
	 * Set the time period in seconds during which the UE is barred from accessing the FAP.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param tbarred the input value
	 * @return this instance
	 */
	public CellRestriction withTbarred(Long tbarred) {
		this.tbarred = tbarred;
		return this;
	}

	/**
	 * Get the {{list}} Each entry is an Access Class that is barred from CS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessClassBarredListCS() {
		return accessClassBarredListCS;
	}

	/**
	 * Set the {{list}} Each entry is an Access Class that is barred from CS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param accessClassBarredListCS the input value
	 */
	public void  setAccessClassBarredListCS(Long accessClassBarredListCS) {
		this.accessClassBarredListCS = accessClassBarredListCS;
	}

	/**
	 * Set the {{list}} Each entry is an Access Class that is barred from CS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param accessClassBarredListCS the input value
	 * @return this instance
	 */
	public CellRestriction withAccessClassBarredListCS(Long accessClassBarredListCS) {
		this.accessClassBarredListCS = accessClassBarredListCS;
		return this;
	}

	/**
	 * Get the {{list}} Each entry is an Access Class that is barred from PS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccessClassBarredListPS() {
		return accessClassBarredListPS;
	}

	/**
	 * Set the {{list}} Each entry is an Access Class that is barred from PS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param accessClassBarredListPS the input value
	 */
	public void  setAccessClassBarredListPS(Long accessClassBarredListPS) {
		this.accessClassBarredListPS = accessClassBarredListPS;
	}

	/**
	 * Set the {{list}} Each entry is an Access Class that is barred from PS service.

The order of the list has no significance.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param accessClassBarredListPS the input value
	 * @return this instance
	 */
	public CellRestriction withAccessClassBarredListPS(Long accessClassBarredListPS) {
		this.accessClassBarredListPS = accessClassBarredListPS;
		return this;
	}

	/**
	 * Get the indicates whether the FAP is reserved for operator use or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellReservedForOperatorUse() {
		return cellReservedForOperatorUse;
	}

	/**
	 * Set the indicates whether the FAP is reserved for operator use or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param cellReservedForOperatorUse the input value
	 */
	public void  setCellReservedForOperatorUse(Boolean cellReservedForOperatorUse) {
		this.cellReservedForOperatorUse = cellReservedForOperatorUse;
	}

	/**
	 * Set the indicates whether the FAP is reserved for operator use or not.

{{bibref|3GPP-TS.25.331|Section 10.3.2}}
	 *
	 * @since 2.0
	 * @param cellReservedForOperatorUse the input value
	 * @return this instance
	 */
	public CellRestriction withCellReservedForOperatorUse(Boolean cellReservedForOperatorUse) {
		this.cellReservedForOperatorUse = cellReservedForOperatorUse;
		return this;
	}

	//</editor-fold>

}