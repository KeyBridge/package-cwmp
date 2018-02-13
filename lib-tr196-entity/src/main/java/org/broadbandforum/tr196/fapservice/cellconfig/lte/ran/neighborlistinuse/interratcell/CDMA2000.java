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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.neighborlistinuse.interratcell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table containing the inter-RAT cell list for CDMA2000 cell.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000.{i}.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.NeighborListInUse.InterRATCell.CDMA2000")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDMA2000 {

	/**
	 * Defines the CDMA2000 band in which the CDMA2000 frequency carrier can be found, specified in bandclass number. BandClass is defined in {{bibref|3GPP2-C.S0057-B|Table 1.5-1}}.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BandClass")
	@Size(min = 0, max = 17)
	public Long bandClass;
	/**
	 * Defines the CDMA2000 frequency carrier within a CDMA2000 band, as specified by ARFCN-ValueCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and {{bibref|3GPP2-C.S0002-A}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ARFCN")
	@Size(min = 0, max = 2047)
	public Long arfCN;
	/**
	 * Defines the PN offset that represents the "Physical cell identity" in CDMA2000 system, as specified by PhysCellIdCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PNOffset")
	@Size(min = 0, max = 511)
	public Long pnoffset;
	/**
	 * Indicates the type of the cell. This parameter determines the length of the CID parameter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Type")
	public String type;
	/**
	 * Defines the global cell identity of the cell. For a 1xRTT cell, the cell identity is a binary string 47 bits long. For a HRPD cell, the cell identity is a binary string 128 bits long. The value of {{param}} parameter is interpreted as 128-bit long unsigned integer. If {{param|Type}} is {{enum|1xRTT|Type}}, the first 47 bits (6 octet) is used and the rest of this {{param}} parameter MUST be ignored by the CPE. If {{param|Type}} is {{enum|HRPD|Type}}, the entire 16 octet is used as {{param}}. Corresponds to IE CellGlobalIdCDMA2000 specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CID")
	@Size(max = 16)
	public String cid;

	public CDMA2000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the CDMA2000 band in which the CDMA2000 frequency carrier can be found, specified in bandclass number. BandClass is defined in {{bibref|3GPP2-C.S0057-B|Table 1.5-1}}.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBandClass() {
		return bandClass;
	}

	/**
	 * Set the defines the CDMA2000 band in which the CDMA2000 frequency carrier can be found, specified in bandclass number. BandClass is defined in {{bibref|3GPP2-C.S0057-B|Table 1.5-1}}.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param bandClass the input value
	 */
	public void  setBandClass(Long bandClass) {
		this.bandClass = bandClass;
	}

	/**
	 * Set the defines the CDMA2000 band in which the CDMA2000 frequency carrier can be found, specified in bandclass number. BandClass is defined in {{bibref|3GPP2-C.S0057-B|Table 1.5-1}}.

Corresponds to parameter bandClass specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param bandClass the input value
	 * @return this instance
	 */
	public CDMA2000 withBandClass(Long bandClass) {
		this.bandClass = bandClass;
		return this;
	}

	/**
	 * Get the defines the CDMA2000 frequency carrier within a CDMA2000 band, as specified by ARFCN-ValueCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and {{bibref|3GPP2-C.S0002-A}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getArfCN() {
		return arfCN;
	}

	/**
	 * Set the defines the CDMA2000 frequency carrier within a CDMA2000 band, as specified by ARFCN-ValueCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and {{bibref|3GPP2-C.S0002-A}}.
	 *
	 * @since 2.0
	 * @param arfCN the input value
	 */
	public void  setArfCN(Long arfCN) {
		this.arfCN = arfCN;
	}

	/**
	 * Set the defines the CDMA2000 frequency carrier within a CDMA2000 band, as specified by ARFCN-ValueCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}, and {{bibref|3GPP2-C.S0002-A}}.
	 *
	 * @since 2.0
	 * @param arfCN the input value
	 * @return this instance
	 */
	public CDMA2000 withArfCN(Long arfCN) {
		this.arfCN = arfCN;
		return this;
	}

	/**
	 * Get the defines the PN offset that represents the "Physical cell identity" in CDMA2000 system, as specified by PhysCellIdCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPnoffset() {
		return pnoffset;
	}

	/**
	 * Set the defines the PN offset that represents the "Physical cell identity" in CDMA2000 system, as specified by PhysCellIdCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param pnoffset the input value
	 */
	public void  setPnoffset(Long pnoffset) {
		this.pnoffset = pnoffset;
	}

	/**
	 * Set the defines the PN offset that represents the "Physical cell identity" in CDMA2000 system, as specified by PhysCellIdCDMA2000 in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param pnoffset the input value
	 * @return this instance
	 */
	public CDMA2000 withPnoffset(Long pnoffset) {
		this.pnoffset = pnoffset;
		return this;
	}

	/**
	 * Get the indicates the type of the cell. This parameter determines the length of the CID parameter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set the indicates the type of the cell. This parameter determines the length of the CID parameter.
	 *
	 * @since 2.0
	 * @param type the input value
	 */
	public void  setType(String type) {
		this.type = type;
	}

	/**
	 * Set the indicates the type of the cell. This parameter determines the length of the CID parameter.
	 *
	 * @since 2.0
	 * @param type the input value
	 * @return this instance
	 */
	public CDMA2000 withType(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the defines the global cell identity of the cell. For a 1xRTT cell, the cell identity is a binary string 47 bits long. For a HRPD cell, the cell identity is a binary string 128 bits long. The value of {{param}} parameter is interpreted as 128-bit long unsigned integer. If {{param|Type}} is {{enum|1xRTT|Type}}, the first 47 bits (6 octet) is used and the rest of this {{param}} parameter MUST be ignored by the CPE. If {{param|Type}} is {{enum|HRPD|Type}}, the entire 16 octet is used as {{param}}. Corresponds to IE CellGlobalIdCDMA2000 specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * Set the defines the global cell identity of the cell. For a 1xRTT cell, the cell identity is a binary string 47 bits long. For a HRPD cell, the cell identity is a binary string 128 bits long. The value of {{param}} parameter is interpreted as 128-bit long unsigned integer. If {{param|Type}} is {{enum|1xRTT|Type}}, the first 47 bits (6 octet) is used and the rest of this {{param}} parameter MUST be ignored by the CPE. If {{param|Type}} is {{enum|HRPD|Type}}, the entire 16 octet is used as {{param}}. Corresponds to IE CellGlobalIdCDMA2000 specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param cid the input value
	 */
	public void  setCid(String cid) {
		this.cid = cid;
	}

	/**
	 * Set the defines the global cell identity of the cell. For a 1xRTT cell, the cell identity is a binary string 47 bits long. For a HRPD cell, the cell identity is a binary string 128 bits long. The value of {{param}} parameter is interpreted as 128-bit long unsigned integer. If {{param|Type}} is {{enum|1xRTT|Type}}, the first 47 bits (6 octet) is used and the rest of this {{param}} parameter MUST be ignored by the CPE. If {{param|Type}} is {{enum|HRPD|Type}}, the entire 16 octet is used as {{param}}. Corresponds to IE CellGlobalIdCDMA2000 specified in {{bibref|3GPP-TS.36.331|Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param cid the input value
	 * @return this instance
	 */
	public CDMA2000 withCid(String cid) {
		this.cid = cid;
		return this;
	}

	//</editor-fold>

}