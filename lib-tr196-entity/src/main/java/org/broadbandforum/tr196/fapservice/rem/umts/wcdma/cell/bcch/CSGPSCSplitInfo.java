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
package org.broadbandforum.tr196.fapservice.rem.umts.wcdma.cell.bcch;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains parameters relating to the Primary Scambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.CSGPSCSplitInfo.")
@XmlRootElement(name = "CSGPSCSplitInfo")
@XmlType(name = "FAPService.REM.UMTS.WCDMA.Cell.BCCH.CSGPSCSplitInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CSGPSCSplitInfo {

	/**
	 * The value of this Information Element (IE) multiplied by 8 specifies the start PSC value of the first PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "StartPSCRange1Coefficient")
	@Size(min = 0, max = 63)
	public Long startPSCRange1Coefficient;
	/**
	 * This Information Element (IE) specifies the number of PSCs reserved for CSG cells in each PSC range.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberOfPSCs")
	public String numberOfPSCs;
	/**
	 * If this Information Element (IE) is included, the UE shall calculate the second PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.

If this Information Element (IE) is not included, the UE shall consider the second PSC range to be not present.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PSCRange2Offset")
	@Size(min = 0, max = 63)
	public Long pscRange2Offset;

	public CSGPSCSplitInfo() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the value of this Information Element (IE) multiplied by 8 specifies the start PSC value of the first PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getStartPSCRange1Coefficient() {
		return startPSCRange1Coefficient;
	}

	/**
	 * Set the value of this Information Element (IE) multiplied by 8 specifies the start PSC value of the first PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.
	 *
	 * @since 2.0
	 * @param startPSCRange1Coefficient the input value
	 */
	public void  setStartPSCRange1Coefficient(Long startPSCRange1Coefficient) {
		this.startPSCRange1Coefficient = startPSCRange1Coefficient;
	}

	/**
	 * Set the value of this Information Element (IE) multiplied by 8 specifies the start PSC value of the first PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.
	 *
	 * @since 2.0
	 * @param startPSCRange1Coefficient the input value
	 * @return this instance
	 */
	public CSGPSCSplitInfo withStartPSCRange1Coefficient(Long startPSCRange1Coefficient) {
		this.startPSCRange1Coefficient = startPSCRange1Coefficient;
		return this;
	}

	/**
	 * Get the this Information Element (IE) specifies the number of PSCs reserved for CSG cells in each PSC range.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNumberOfPSCs() {
		return numberOfPSCs;
	}

	/**
	 * Set the this Information Element (IE) specifies the number of PSCs reserved for CSG cells in each PSC range.
	 *
	 * @since 2.0
	 * @param numberOfPSCs the input value
	 */
	public void  setNumberOfPSCs(String numberOfPSCs) {
		this.numberOfPSCs = numberOfPSCs;
	}

	/**
	 * Set the this Information Element (IE) specifies the number of PSCs reserved for CSG cells in each PSC range.
	 *
	 * @since 2.0
	 * @param numberOfPSCs the input value
	 * @return this instance
	 */
	public CSGPSCSplitInfo withNumberOfPSCs(String numberOfPSCs) {
		this.numberOfPSCs = numberOfPSCs;
		return this;
	}

	/**
	 * Get the if this Information Element (IE) is included, the UE shall calculate the second PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.

If this Information Element (IE) is not included, the UE shall consider the second PSC range to be not present.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPscRange2Offset() {
		return pscRange2Offset;
	}

	/**
	 * Set the if this Information Element (IE) is included, the UE shall calculate the second PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.

If this Information Element (IE) is not included, the UE shall consider the second PSC range to be not present.
	 *
	 * @since 2.0
	 * @param pscRange2Offset the input value
	 */
	public void  setPscRange2Offset(Long pscRange2Offset) {
		this.pscRange2Offset = pscRange2Offset;
	}

	/**
	 * Set the if this Information Element (IE) is included, the UE shall calculate the second PSC range as specified in {{bibref|3GPP-TS.25.331|Section 8.6.2.4}}.

If this Information Element (IE) is not included, the UE shall consider the second PSC range to be not present.
	 *
	 * @since 2.0
	 * @param pscRange2Offset the input value
	 * @return this instance
	 */
	public CSGPSCSplitInfo withPscRange2Offset(Long pscRange2Offset) {
		this.pscRange2Offset = pscRange2Offset;
		return this;
	}

	//</editor-fold>

}