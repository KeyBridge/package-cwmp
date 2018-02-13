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
import org.broadbandforum.tr196.fapservice.cellconfig.umts.ran.csg.CSGPSCSplitInfo;

	/**
	 * This object contains parameters relating to the Closed Subscriber Group (CSG).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.CSG.")
@XmlRootElement(name = "CSG")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.CSG")
@XmlAccessorType(XmlAccessType.FIELD)
public class CSG {

	/**
	 * The CSG-indicator Information Element (IE) in the Master Information Block reflects the access mode of the CSG cell. It is hence dependent on the value of {{param|.AccessMgmt.UMTS.AccessMode}}.

If {{true}} the CSG-indicator IE is present, reflecting access to the CSG cell is closed.

If {{false}} the CSG-indicator IE is absent, reflecting access to the CSG cell is not closed.

{{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGIndicator")
	public Boolean csgIndicator;
	/**
	 * {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN) in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNDLList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 16383)
	public Long uarFCNDLList;
	/**
	 * This object contains parameters relating to the Primary Scrambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 */
	@XmlElement(name = "CSGPSCSplitInfo")
	public CSGPSCSplitInfo csgPSCSplitInfo;

	public CSG() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the CSG-indicator Information Element (IE) in the Master Information Block reflects the access mode of the CSG cell. It is hence dependent on the value of {{param|.AccessMgmt.UMTS.AccessMode}}.

If {{true}} the CSG-indicator IE is present, reflecting access to the CSG cell is closed.

If {{false}} the CSG-indicator IE is absent, reflecting access to the CSG cell is not closed.

{{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCsgIndicator() {
		return csgIndicator;
	}

	/**
	 * Set the CSG-indicator Information Element (IE) in the Master Information Block reflects the access mode of the CSG cell. It is hence dependent on the value of {{param|.AccessMgmt.UMTS.AccessMode}}.

If {{true}} the CSG-indicator IE is present, reflecting access to the CSG cell is closed.

If {{false}} the CSG-indicator IE is absent, reflecting access to the CSG cell is not closed.

{{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
	 *
	 * @since 2.0
	 * @param csgIndicator the input value
	 */
	public void  setCsgIndicator(Boolean csgIndicator) {
		this.csgIndicator = csgIndicator;
	}

	/**
	 * Set the CSG-indicator Information Element (IE) in the Master Information Block reflects the access mode of the CSG cell. It is hence dependent on the value of {{param|.AccessMgmt.UMTS.AccessMode}}.

If {{true}} the CSG-indicator IE is present, reflecting access to the CSG cell is closed.

If {{false}} the CSG-indicator IE is absent, reflecting access to the CSG cell is not closed.

{{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
	 *
	 * @since 2.0
	 * @param csgIndicator the input value
	 * @return this instance
	 */
	public CSG withCsgIndicator(Boolean csgIndicator) {
		this.csgIndicator = csgIndicator;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN) in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUarFCNDLList() {
		return uarFCNDLList;
	}

	/**
	 * Set the {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN) in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 * @param uarFCNDLList the input value
	 */
	public void  setUarFCNDLList(Long uarFCNDLList) {
		this.uarFCNDLList = uarFCNDLList;
	}

	/**
	 * Set the {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN) in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN) in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 * @param uarFCNDLList the input value
	 * @return this instance
	 */
	public CSG withUarFCNDLList(Long uarFCNDLList) {
		this.uarFCNDLList = uarFCNDLList;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the Primary Scrambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 *
	 * @return the value
	 */
	public CSGPSCSplitInfo getCsgPSCSplitInfo() {
		return csgPSCSplitInfo;
	}

	/**
	 * Set the this object contains parameters relating to the Primary Scrambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 *
	 * @param csgPSCSplitInfo the input value
	 */
	public void  setCsgPSCSplitInfo(CSGPSCSplitInfo csgPSCSplitInfo) {
		this.csgPSCSplitInfo = csgPSCSplitInfo;
	}

	/**
	 * Set the this object contains parameters relating to the Primary Scrambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 *
	 * @param csgPSCSplitInfo the input value
	 * @return this instance
	 */
	public CSG withCsgPSCSplitInfo(CSGPSCSplitInfo csgPSCSplitInfo) {
		this.csgPSCSplitInfo = csgPSCSplitInfo;
		return this;
	}

	//</editor-fold>

}