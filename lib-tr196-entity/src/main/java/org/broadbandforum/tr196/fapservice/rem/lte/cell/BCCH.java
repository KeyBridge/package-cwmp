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
package org.broadbandforum.tr196.fapservice.rem.lte.cell;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.rem.lte.cell.bcch.PLMNList;

	/**
	 * Table containing the system information broadcast in the BCCH logical channel.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.LTE.Cell.{i}.BCCH.")
@XmlRootElement(name = "FAPService.REM.LTE.Cell.BCCH")
@XmlType(name = "FAPService.REM.LTE.Cell.BCCH")
@XmlAccessorType(XmlAccessType.FIELD)
public class BCCH {

	/**
	 * Downlink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter dl_Bandwidth in Master Information Block in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DLBandwidth")
	@Size(min = 100, max = 100)
	public Long dlbandwidth;
	/**
	 * Uplink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ULBandwidth")
	@Size(min = 100, max = 100)
	public Long ulbandwidth;
	/**
	 * The downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RSTxPower")
	@Size(min = -60, max = 50)
	public Integer rstxPower;
	/**
	 * Tracking Area Code that is common for all the PLMNs listed. Corresponds to trackingAreaCode as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TAC")
	@Size(max = 65535)
	public Long tac;
	/**
	 * Defines the cell identify, defines as a 28-bit binary number.  Corresponds to cellIdentity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellID")
	@Size(max = 268435455)
	public Long cellID;
	/**
	 * Indicates whether the cell is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred. Corresponds to cellBarred as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and {{bibref|3GPP-TS.36.304}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellBarred")
	public Boolean cellBarred;
	/**
	 * Indicates whether CSG is used in this cell or not. If {{true}}, the UE is only allowed to access the cell if the CSG identity matches an entry in the allowed CSG list that the UE has stored. Corresponds to csg-Indication as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGIndication")
	public Boolean csgIndication;
	/**
	 * Defines the CSG ID value if {{param|CSGIndication}} parameter indicates that CSG is used in this cell.  Corresponds to csg-Identity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGIdentity")
	@Size(min = 0, max = 134217727)
	public Long csgIdentity;
	/**
	 * The maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxPLMNListEntries")
	public Long maxPLMNListEntries;
	/**
	 * Table containing the PLMN list in the system information broadcast in the BCCH logical channel. Correspnds to plmn-IdentityList as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.
	 */
	@XmlElementWrapper(name = "PLMNLists")
	@XmlElement(name = "PLMNList")
	public Collection<PLMNList> plmNLists;

	public BCCH() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the downlink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter dl_Bandwidth in Master Information Block in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDlbandwidth() {
		return dlbandwidth;
	}

	/**
	 * Set the downlink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter dl_Bandwidth in Master Information Block in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 * @param dlbandwidth the input value
	 */
	public void  setDlbandwidth(Long dlbandwidth) {
		this.dlbandwidth = dlbandwidth;
	}

	/**
	 * Set the downlink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter dl_Bandwidth in Master Information Block in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 * @param dlbandwidth the input value
	 * @return this instance
	 */
	public BCCH withDlbandwidth(Long dlbandwidth) {
		this.dlbandwidth = dlbandwidth;
		return this;
	}

	/**
	 * Get the uplink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUlbandwidth() {
		return ulbandwidth;
	}

	/**
	 * Set the uplink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 * @param ulbandwidth the input value
	 */
	public void  setUlbandwidth(Long ulbandwidth) {
		this.ulbandwidth = ulbandwidth;
	}

	/**
	 * Set the uplink transmission bandwidth, specified in number of resource blocks.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.
	 *
	 * @since 2.0
	 * @param ulbandwidth the input value
	 * @return this instance
	 */
	public BCCH withUlbandwidth(Long ulbandwidth) {
		this.ulbandwidth = ulbandwidth;
		return this;
	}

	/**
	 * Get the downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRstxPower() {
		return rstxPower;
	}

	/**
	 * Set the downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param rstxPower the input value
	 */
	public void  setRstxPower(Integer rstxPower) {
		this.rstxPower = rstxPower;
	}

	/**
	 * Set the downlink reference-signal transmit power, specified in dBm. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in SIB4 as a part of PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param rstxPower the input value
	 * @return this instance
	 */
	public BCCH withRstxPower(Integer rstxPower) {
		this.rstxPower = rstxPower;
		return this;
	}

	/**
	 * Get the tracking Area Code that is common for all the PLMNs listed. Corresponds to trackingAreaCode as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTac() {
		return tac;
	}

	/**
	 * Set the tracking Area Code that is common for all the PLMNs listed. Corresponds to trackingAreaCode as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param tac the input value
	 */
	public void  setTac(Long tac) {
		this.tac = tac;
	}

	/**
	 * Set the tracking Area Code that is common for all the PLMNs listed. Corresponds to trackingAreaCode as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param tac the input value
	 * @return this instance
	 */
	public BCCH withTac(Long tac) {
		this.tac = tac;
		return this;
	}

	/**
	 * Get the defines the cell identify, defines as a 28-bit binary number.  Corresponds to cellIdentity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellID() {
		return cellID;
	}

	/**
	 * Set the defines the cell identify, defines as a 28-bit binary number.  Corresponds to cellIdentity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param cellID the input value
	 */
	public void  setCellID(Long cellID) {
		this.cellID = cellID;
	}

	/**
	 * Set the defines the cell identify, defines as a 28-bit binary number.  Corresponds to cellIdentity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param cellID the input value
	 * @return this instance
	 */
	public BCCH withCellID(Long cellID) {
		this.cellID = cellID;
		return this;
	}

	/**
	 * Get the indicates whether the cell is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred. Corresponds to cellBarred as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and {{bibref|3GPP-TS.36.304}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCellBarred() {
		return cellBarred;
	}

	/**
	 * Set the indicates whether the cell is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred. Corresponds to cellBarred as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and {{bibref|3GPP-TS.36.304}}.
	 *
	 * @since 2.0
	 * @param cellBarred the input value
	 */
	public void  setCellBarred(Boolean cellBarred) {
		this.cellBarred = cellBarred;
	}

	/**
	 * Set the indicates whether the cell is barred or not. If {{true}}, the cell is barred. If {{false}}, the cell is not barred. Corresponds to cellBarred as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and {{bibref|3GPP-TS.36.304}}.
	 *
	 * @since 2.0
	 * @param cellBarred the input value
	 * @return this instance
	 */
	public BCCH withCellBarred(Boolean cellBarred) {
		this.cellBarred = cellBarred;
		return this;
	}

	/**
	 * Get the indicates whether CSG is used in this cell or not. If {{true}}, the UE is only allowed to access the cell if the CSG identity matches an entry in the allowed CSG list that the UE has stored. Corresponds to csg-Indication as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isCsgIndication() {
		return csgIndication;
	}

	/**
	 * Set the indicates whether CSG is used in this cell or not. If {{true}}, the UE is only allowed to access the cell if the CSG identity matches an entry in the allowed CSG list that the UE has stored. Corresponds to csg-Indication as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param csgIndication the input value
	 */
	public void  setCsgIndication(Boolean csgIndication) {
		this.csgIndication = csgIndication;
	}

	/**
	 * Set the indicates whether CSG is used in this cell or not. If {{true}}, the UE is only allowed to access the cell if the CSG identity matches an entry in the allowed CSG list that the UE has stored. Corresponds to csg-Indication as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param csgIndication the input value
	 * @return this instance
	 */
	public BCCH withCsgIndication(Boolean csgIndication) {
		this.csgIndication = csgIndication;
		return this;
	}

	/**
	 * Get the defines the CSG ID value if {{param|CSGIndication}} parameter indicates that CSG is used in this cell.  Corresponds to csg-Identity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCsgIdentity() {
		return csgIdentity;
	}

	/**
	 * Set the defines the CSG ID value if {{param|CSGIndication}} parameter indicates that CSG is used in this cell.  Corresponds to csg-Identity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param csgIdentity the input value
	 */
	public void  setCsgIdentity(Long csgIdentity) {
		this.csgIdentity = csgIdentity;
	}

	/**
	 * Set the defines the CSG ID value if {{param|CSGIndication}} parameter indicates that CSG is used in this cell.  Corresponds to csg-Identity as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param csgIdentity the input value
	 * @return this instance
	 */
	public BCCH withCsgIdentity(Long csgIdentity) {
		this.csgIdentity = csgIdentity;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxPLMNListEntries() {
		return maxPLMNListEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxPLMNListEntries the input value
	 */
	public void  setMaxPLMNListEntries(Long maxPLMNListEntries) {
		this.maxPLMNListEntries = maxPLMNListEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.BCCH.PLMNList.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxPLMNListEntries the input value
	 * @return this instance
	 */
	public BCCH withMaxPLMNListEntries(Long maxPLMNListEntries) {
		this.maxPLMNListEntries = maxPLMNListEntries;
		return this;
	}

	/**
	 * Get the table containing the PLMN list in the system information broadcast in the BCCH logical channel. Correspnds to plmn-IdentityList as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.
	 *
	 * @return the value
	 */
	public Collection<PLMNList> getPlmNLists() {
		if (this.plmNLists == null){ this.plmNLists=new ArrayList<>();}
		return plmNLists;
	}

	/**
	 * Set the table containing the PLMN list in the system information broadcast in the BCCH logical channel. Correspnds to plmn-IdentityList as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.
	 *
	 * @param plmNLists the input value
	 */
	public void  setPlmNLists(Collection<PLMNList> plmNLists) {
		this.plmNLists = plmNLists;
	}

	/**
	 * Set the table containing the PLMN list in the system information broadcast in the BCCH logical channel. Correspnds to plmn-IdentityList as specified in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Each instance in this object is a PLMN-IdentityInfo which consists of plmn-Identity and cellReservedForOperatorUse IEs.
	 *
	 * @param plmNList the input value
	 * @return this instance
	 */
	public BCCH withPLMNList(PLMNList plmNList) {
		getPlmNLists().add(plmNList);
		return this;
	}

	//</editor-fold>

}