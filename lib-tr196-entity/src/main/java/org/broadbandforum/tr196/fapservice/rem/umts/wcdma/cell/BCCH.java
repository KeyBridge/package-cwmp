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
package org.broadbandforum.tr196.fapservice.rem.umts.wcdma.cell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr196.fapservice.rem.umts.wcdma.cell.bcch.CSGPSCSplitInfo;
import org.broadbandforum.tr196.fapservice.rem.umts.wcdma.cell.bcch.ReferencePosition;

	/**
	 * Table containing the system information broadcast in the BCCH logical channel.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.")
@XmlRootElement(name = "BCCH")
@XmlType(name = "FAPService.REM.UMTS.WCDMA.Cell.BCCH")
@XmlAccessorType(XmlAccessType.FIELD)
public class BCCH {

	/**
	 * Type of Public Land Mobile Network (PLMN).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PLMNType")
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
	@Size(max = 6)
	public String plmNID;
	/**
	 * Location Area Code (LAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LAC")
	@Size(min = 0, max = 65535)
	public Long lac;
	/**
	 * Routing Area Code (RAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the RAI (Routing Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RAC")
	@Size(min = 0, max = 255)
	public Long rac;
	/**
	 * Cell Identity as defined in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.2}}. {{bibref|3GPP-TS.24.008}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellID")
	@Size(max = 268435455)
	public Long cellID;
	/**
	 * Primary Common Pilot Channel (CPICH) power level on SIB 5/6 {{bibref|3GPP-TS.25.331|Section10.3.6.55}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PCPICHTxPower")
	@Size(min = -10, max = 50)
	public Integer pcpICHTxPower;
	/**
	 * The CSG-indicator Information Element (IE) in the Master Information Block reflects the access mode of the CSG cell. It is hence dependent on the value of {{param|.AccessMgmt.UMTS.AccessMode}}.

If {{true}} the CSG-indicator IE is present, reflecting closed access to the CSG cell.

If {{false}} the CSG-indicator IE is absent, reflecting the access mode as "not a closed-access".

{{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGIndicator")
	public Boolean csgIndicator;
	/**
	 * Defines the Closed Subscriber Group of the Access Control List. FAP broadcasts this CSG ID in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.8}} depending on the AccessMode.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CSGID")
	@Size(max = 134217727)
	public Long csgID;
	/**
	 * {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN} in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN} in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UARFCNDLList")
	@Size(max = 16383)
	public Long uarFCNDLList;
	/**
	 * This object contains parameters relating to the Primary Scambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 */
	@XmlElement(name = "CSGPSCSplitInfo")
	public CSGPSCSplitInfo csgPSCSplitInfo;
	/**
	 * This object defines parameters related to the surface point of the ellipsoid. {{bibref|3GPP-TS.23.032|Section 5}}

It is characterized by the co-ordinates of an ellipsoid point with altitude, distances, and an angle of orientation.

This information is used to refer to a point on the Earth's surface, or close to the Earth's surface, with the same longitude and latitude.
	 */
	@XmlElement(name = "ReferencePosition")
	public ReferencePosition referencePosition;

	public BCCH() {
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
	public BCCH withPlmNType(String plmNType) {
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
	public BCCH withPlmNID(String plmNID) {
		this.plmNID = plmNID;
		return this;
	}

	/**
	 * Get the location Area Code (LAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLac() {
		return lac;
	}

	/**
	 * Set the location Area Code (LAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @param lac the input value
	 */
	public void  setLac(Long lac) {
		this.lac = lac;
	}

	/**
	 * Set the location Area Code (LAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC) and LAC uniquely identifies the LAI (Location Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @param lac the input value
	 * @return this instance
	 */
	public BCCH withLac(Long lac) {
		this.lac = lac;
		return this;
	}

	/**
	 * Get the routing Area Code (RAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the RAI (Routing Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRac() {
		return rac;
	}

	/**
	 * Set the routing Area Code (RAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the RAI (Routing Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @param rac the input value
	 */
	public void  setRac(Long rac) {
		this.rac = rac;
	}

	/**
	 * Set the routing Area Code (RAC) as defined in SIB 1 {{bibref|3GPP-TS.25.331}}. The concatenation of PLMN ID (MCC+MNC), LAC, and RAC uniquely identifies the RAI (Routing Area ID) {{bibref|3GPP-TS.23.003}}.
	 *
	 * @since 2.0
	 * @param rac the input value
	 * @return this instance
	 */
	public BCCH withRac(Long rac) {
		this.rac = rac;
		return this;
	}

	/**
	 * Get the cell Identity as defined in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.2}}. {{bibref|3GPP-TS.24.008}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellID() {
		return cellID;
	}

	/**
	 * Set the cell Identity as defined in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.2}}. {{bibref|3GPP-TS.24.008}}
	 *
	 * @since 2.0
	 * @param cellID the input value
	 */
	public void  setCellID(Long cellID) {
		this.cellID = cellID;
	}

	/**
	 * Set the cell Identity as defined in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.2}}. {{bibref|3GPP-TS.24.008}}
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
	 * Get the primary Common Pilot Channel (CPICH) power level on SIB 5/6 {{bibref|3GPP-TS.25.331|Section10.3.6.55}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPcpICHTxPower() {
		return pcpICHTxPower;
	}

	/**
	 * Set the primary Common Pilot Channel (CPICH) power level on SIB 5/6 {{bibref|3GPP-TS.25.331|Section10.3.6.55}}.
	 *
	 * @since 2.0
	 * @param pcpICHTxPower the input value
	 */
	public void  setPcpICHTxPower(Integer pcpICHTxPower) {
		this.pcpICHTxPower = pcpICHTxPower;
	}

	/**
	 * Set the primary Common Pilot Channel (CPICH) power level on SIB 5/6 {{bibref|3GPP-TS.25.331|Section10.3.6.55}}.
	 *
	 * @since 2.0
	 * @param pcpICHTxPower the input value
	 * @return this instance
	 */
	public BCCH withPcpICHTxPower(Integer pcpICHTxPower) {
		this.pcpICHTxPower = pcpICHTxPower;
		return this;
	}

	/**
	 * Get the CSG-indicator Information Element (IE) in the Master Information Block reflects the access mode of the CSG cell. It is hence dependent on the value of {{param|.AccessMgmt.UMTS.AccessMode}}.

If {{true}} the CSG-indicator IE is present, reflecting closed access to the CSG cell.

If {{false}} the CSG-indicator IE is absent, reflecting the access mode as "not a closed-access".

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

If {{true}} the CSG-indicator IE is present, reflecting closed access to the CSG cell.

If {{false}} the CSG-indicator IE is absent, reflecting the access mode as "not a closed-access".

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

If {{true}} the CSG-indicator IE is present, reflecting closed access to the CSG cell.

If {{false}} the CSG-indicator IE is absent, reflecting the access mode as "not a closed-access".

{{bibref|3GPP-TS.25.331|Section 10.2.48.8.1}}
	 *
	 * @since 2.0
	 * @param csgIndicator the input value
	 * @return this instance
	 */
	public BCCH withCsgIndicator(Boolean csgIndicator) {
		this.csgIndicator = csgIndicator;
		return this;
	}

	/**
	 * Get the defines the Closed Subscriber Group of the Access Control List. FAP broadcasts this CSG ID in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.8}} depending on the AccessMode.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCsgID() {
		return csgID;
	}

	/**
	 * Set the defines the Closed Subscriber Group of the Access Control List. FAP broadcasts this CSG ID in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.8}} depending on the AccessMode.
	 *
	 * @since 2.0
	 * @param csgID the input value
	 */
	public void  setCsgID(Long csgID) {
		this.csgID = csgID;
	}

	/**
	 * Set the defines the Closed Subscriber Group of the Access Control List. FAP broadcasts this CSG ID in SIB3 {{bibref|3GPP-TS.25.331|Section10.3.2.8}} depending on the AccessMode.
	 *
	 * @since 2.0
	 * @param csgID the input value
	 * @return this instance
	 */
	public BCCH withCsgID(Long csgID) {
		this.csgID = csgID;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN} in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN} in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUarFCNDLList() {
		return uarFCNDLList;
	}

	/**
	 * Set the {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN} in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN} in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 * @param uarFCNDLList the input value
	 */
	public void  setUarFCNDLList(Long uarFCNDLList) {
		this.uarFCNDLList = uarFCNDLList;
	}

	/**
	 * Set the {{list}} Each item is a UTRA Absolute Radio Frequency Channel Number (UARFCN} in the DL direction dedicated to the CSG cells.

{{param}} is broadcast in SIB 11bis {{bibref|3GPP-TS.25.331|Section 10.2.48.8.14a}}.

The corresponding UTRA Absolute Radio Frequency Channel Number (UARFCN} in the UL direction is derived based on the fixed offset applicable for the frequency band.
	 *
	 * @since 2.0
	 * @param uarFCNDLList the input value
	 * @return this instance
	 */
	public BCCH withUarFCNDLList(Long uarFCNDLList) {
		this.uarFCNDLList = uarFCNDLList;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the Primary Scambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 *
	 * @return the value
	 */
	public CSGPSCSplitInfo getCsgPSCSplitInfo() {
		return csgPSCSplitInfo;
	}

	/**
	 * Set the this object contains parameters relating to the Primary Scambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 *
	 * @param csgPSCSplitInfo the input value
	 */
	public void  setCsgPSCSplitInfo(CSGPSCSplitInfo csgPSCSplitInfo) {
		this.csgPSCSplitInfo = csgPSCSplitInfo;
	}

	/**
	 * Set the this object contains parameters relating to the Primary Scambling Code (PSC) split information for the CSG. Defined in SIB3/11bis {{bibref|3GPP-TS.25.331|Section 10.3.2.8 and 10.3.2.9}}.
	 *
	 * @param csgPSCSplitInfo the input value
	 * @return this instance
	 */
	public BCCH withCsgPSCSplitInfo(CSGPSCSplitInfo csgPSCSplitInfo) {
		this.csgPSCSplitInfo = csgPSCSplitInfo;
		return this;
	}

	/**
	 * Get the this object defines parameters related to the surface point of the ellipsoid. {{bibref|3GPP-TS.23.032|Section 5}}

It is characterized by the co-ordinates of an ellipsoid point with altitude, distances, and an angle of orientation.

This information is used to refer to a point on the Earth's surface, or close to the Earth's surface, with the same longitude and latitude.
	 *
	 * @return the value
	 */
	public ReferencePosition getReferencePosition() {
		return referencePosition;
	}

	/**
	 * Set the this object defines parameters related to the surface point of the ellipsoid. {{bibref|3GPP-TS.23.032|Section 5}}

It is characterized by the co-ordinates of an ellipsoid point with altitude, distances, and an angle of orientation.

This information is used to refer to a point on the Earth's surface, or close to the Earth's surface, with the same longitude and latitude.
	 *
	 * @param referencePosition the input value
	 */
	public void  setReferencePosition(ReferencePosition referencePosition) {
		this.referencePosition = referencePosition;
	}

	/**
	 * Set the this object defines parameters related to the surface point of the ellipsoid. {{bibref|3GPP-TS.23.032|Section 5}}

It is characterized by the co-ordinates of an ellipsoid point with altitude, distances, and an angle of orientation.

This information is used to refer to a point on the Earth's surface, or close to the Earth's surface, with the same longitude and latitude.
	 *
	 * @param referencePosition the input value
	 * @return this instance
	 */
	public BCCH withReferencePosition(ReferencePosition referencePosition) {
		this.referencePosition = referencePosition;
		return this;
	}

	//</editor-fold>

}