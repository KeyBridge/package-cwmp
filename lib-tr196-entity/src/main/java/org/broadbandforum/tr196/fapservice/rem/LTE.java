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
package org.broadbandforum.tr196.fapservice.rem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.rem.lte.CarrierMeas;
import org.broadbandforum.tr196.fapservice.rem.lte.Cell;

	/**
	 * This object contains parameters relating to radio environment measurement capabilities for the LTE system.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.LTE.")
@XmlRootElement(name = "FAPService.REM.LTE")
@XmlType(name = "FAPService.REM.LTE")
@XmlAccessorType(XmlAccessType.FIELD)
public class LTE {

	/**
	 * FAP REM behavior with respect to ongoing active connections.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InServiceHandling")
	@CWMPParameter(access = "readWrite")
	public String inserviceHandling;
	/**
	 * Enables or disables Radio Environment Measurement during the FAP start up.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ScanOnBoot")
	@CWMPParameter(access = "readWrite")
	public Boolean scanOnBoot;
	/**
	 * Enable Periodic Radio Environment Measurement on LTE EUTRAN bands.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ScanPeriodically")
	@CWMPParameter(access = "readWrite")
	public Boolean scanPeriodically;
	/**
	 * When {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which REM is performed while the FAP service is enabled.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PeriodicInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long periodicInterval;
	/**
	 * An absolute time reference in UTC to determine when the CPE will initiate the periodic REM. Each REM MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the REM. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic REMs will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval.

If absolute time is not available to the CPE, its periodic REM behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PeriodicTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime periodicTime;
	/**
	 * {{list}} Each item is a PLMN ID to measure. PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

If {{empty}}, then no specific PLMN ID is provided, meaning that the FAP is required to scan all available PLMN IDs.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "REMPLMNList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> remPLMNList;
	/**
	 * {{list}} Each item is a LTE Band to measure. Corresponds to frequency band indicator defined in {{bibref|3GPP-TS.36.101|Table 5.5-1}}.

If {{empty}} then no specific LTE band is provided, meaning that the FAP is required to scan all available bands.

The order of the band indicator has no significance.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "REMBandList")
	@CWMPParameter(access = "readWrite")
	@XmlList
	public Collection<String> remBandList;
	/**
	 * {{list}} Each entry is a EUTRA ARFCN in the DL direction to measure. Corrsponds to the parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.

If {{empty}}, then no specific EUTRA ARFCN is provided, meaning that the FAP is required to scan all ARFCNs that it is aware of.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EUTRACarrierARFCNDLList")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> eutRACarrierARFCNDLList;
	/**
	 * Specifies the time-out value in seconds, measured from the start of the REM scan, before the REM scan will time out.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ScanTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long scanTimeout;
	/**
	 * Indicates the current status of this scan.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ScanStatus")
	public String scanStatus;
	/**
	 * Provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErrorDetails")
	@Size(max = 256)
	public String errorDetails;
	/**
	 * The  time of the last LTE system radio environment measurement.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastScanTime")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	public LocalDateTime lastScanTime;
	/**
	 * The maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCellEntries")
	public Long maxCellEntries;
	/**
	 * The maximum number of entries available in the {{object|.REM.LTE.CarrierMeas.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCarrierMeasEntries")
	public Long maxCarrierMeasEntries;
	/**
	 * Table indicating the components of the discovered cells.
	 */
	@XmlElementWrapper(name = "Cells")
	@XmlElement(name = "Cell")
	public Collection<Cell> cells;
	/**
	 * Table indicating the measurement of the discovered carrier. The information stored in this object is strictly in the physical layer level and may not necessarily be associated with any particular E-UTRAN cell (e.g. interference level generated by sources other than E-UTRAN cell).
	 */
	@XmlElementWrapper(name = "CarrierMeass")
	@XmlElement(name = "CarrierMeas")
	@CWMPParameter(access = "readWrite")
	public Collection<CarrierMeas> carrierMeass;

	public LTE() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the fap REM behavior with respect to ongoing active connections.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInserviceHandling() {
		return inserviceHandling;
	}

	/**
	 * Set the fap REM behavior with respect to ongoing active connections.
	 *
	 * @since 2.0
	 * @param inserviceHandling the input value
	 */
	public void  setInserviceHandling(String inserviceHandling) {
		this.inserviceHandling = inserviceHandling;
	}

	/**
	 * Set the fap REM behavior with respect to ongoing active connections.
	 *
	 * @since 2.0
	 * @param inserviceHandling the input value
	 * @return this instance
	 */
	public LTE withInserviceHandling(String inserviceHandling) {
		this.inserviceHandling = inserviceHandling;
		return this;
	}

	/**
	 * Get the enables or disables Radio Environment Measurement during the FAP start up.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isScanOnBoot() {
		return scanOnBoot;
	}

	/**
	 * Set the enables or disables Radio Environment Measurement during the FAP start up.
	 *
	 * @since 2.0
	 * @param scanOnBoot the input value
	 */
	public void  setScanOnBoot(Boolean scanOnBoot) {
		this.scanOnBoot = scanOnBoot;
	}

	/**
	 * Set the enables or disables Radio Environment Measurement during the FAP start up.
	 *
	 * @since 2.0
	 * @param scanOnBoot the input value
	 * @return this instance
	 */
	public LTE withScanOnBoot(Boolean scanOnBoot) {
		this.scanOnBoot = scanOnBoot;
		return this;
	}

	/**
	 * Get the enable Periodic Radio Environment Measurement on LTE EUTRAN bands.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isScanPeriodically() {
		return scanPeriodically;
	}

	/**
	 * Set the enable Periodic Radio Environment Measurement on LTE EUTRAN bands.
	 *
	 * @since 2.0
	 * @param scanPeriodically the input value
	 */
	public void  setScanPeriodically(Boolean scanPeriodically) {
		this.scanPeriodically = scanPeriodically;
	}

	/**
	 * Set the enable Periodic Radio Environment Measurement on LTE EUTRAN bands.
	 *
	 * @since 2.0
	 * @param scanPeriodically the input value
	 * @return this instance
	 */
	public LTE withScanPeriodically(Boolean scanPeriodically) {
		this.scanPeriodically = scanPeriodically;
		return this;
	}

	/**
	 * Get the when {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which REM is performed while the FAP service is enabled.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPeriodicInterval() {
		return periodicInterval;
	}

	/**
	 * Set the when {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which REM is performed while the FAP service is enabled.
	 *
	 * @since 2.0
	 * @param periodicInterval the input value
	 */
	public void  setPeriodicInterval(Long periodicInterval) {
		this.periodicInterval = periodicInterval;
	}

	/**
	 * Set the when {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which REM is performed while the FAP service is enabled.
	 *
	 * @since 2.0
	 * @param periodicInterval the input value
	 * @return this instance
	 */
	public LTE withPeriodicInterval(Long periodicInterval) {
		this.periodicInterval = periodicInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when the CPE will initiate the periodic REM. Each REM MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the REM. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic REMs will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval.

If absolute time is not available to the CPE, its periodic REM behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getPeriodicTime() {
		return periodicTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic REM. Each REM MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the REM. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic REMs will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval.

If absolute time is not available to the CPE, its periodic REM behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param periodicTime the input value
	 */
	public void  setPeriodicTime(LocalDateTime periodicTime) {
		this.periodicTime = periodicTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic REM. Each REM MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the REM. The actual value of {{param}} can be arbitrarily far into the past or future.

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic REMs will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future.

The Unknown Time value defined in {{bibref|TR-106a2|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval.

If absolute time is not available to the CPE, its periodic REM behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 2.0
	 * @param periodicTime the input value
	 * @return this instance
	 */
	public LTE withPeriodicTime(LocalDateTime periodicTime) {
		this.periodicTime = periodicTime;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a PLMN ID to measure. PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

If {{empty}}, then no specific PLMN ID is provided, meaning that the FAP is required to scan all available PLMN IDs.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getRemPLMNList() {
		if (this.remPLMNList == null){ this.remPLMNList=new ArrayList<>();}
		return remPLMNList;
	}

	/**
	 * Set the {{list}} Each item is a PLMN ID to measure. PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

If {{empty}}, then no specific PLMN ID is provided, meaning that the FAP is required to scan all available PLMN IDs.
	 *
	 * @since 2.0
	 * @param remPLMNList the input value
	 */
	public void  setRemPLMNList(Collection<String> remPLMNList) {
		this.remPLMNList = remPLMNList;
	}

	/**
	 * Set the {{list}} Each item is a PLMN ID to measure. PLMN ID consists of Mobile Country Code (MCC) and Mobile Network Code (MNC) {{bibref|3GPP-TS.23.003}}, {{bibref|3GPP-TS.24.008}}.

If {{empty}}, then no specific PLMN ID is provided, meaning that the FAP is required to scan all available PLMN IDs.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public LTE withRemPLMNList(String string) {
		getRemPLMNList().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a LTE Band to measure. Corresponds to frequency band indicator defined in {{bibref|3GPP-TS.36.101|Table 5.5-1}}.

If {{empty}} then no specific LTE band is provided, meaning that the FAP is required to scan all available bands.

The order of the band indicator has no significance.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getRemBandList() {
		if (this.remBandList == null){ this.remBandList=new ArrayList<>();}
		return remBandList;
	}

	/**
	 * Set the {{list}} Each item is a LTE Band to measure. Corresponds to frequency band indicator defined in {{bibref|3GPP-TS.36.101|Table 5.5-1}}.

If {{empty}} then no specific LTE band is provided, meaning that the FAP is required to scan all available bands.

The order of the band indicator has no significance.
	 *
	 * @since 2.0
	 * @param remBandList the input value
	 */
	public void  setRemBandList(Collection<String> remBandList) {
		this.remBandList = remBandList;
	}

	/**
	 * Set the {{list}} Each item is a LTE Band to measure. Corresponds to frequency band indicator defined in {{bibref|3GPP-TS.36.101|Table 5.5-1}}.

If {{empty}} then no specific LTE band is provided, meaning that the FAP is required to scan all available bands.

The order of the band indicator has no significance.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public LTE withRemBandList(String string) {
		getRemBandList().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each entry is a EUTRA ARFCN in the DL direction to measure. Corrsponds to the parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.

If {{empty}}, then no specific EUTRA ARFCN is provided, meaning that the FAP is required to scan all ARFCNs that it is aware of.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getEutRACarrierARFCNDLList() {
		if (this.eutRACarrierARFCNDLList == null){ this.eutRACarrierARFCNDLList=new ArrayList<>();}
		return eutRACarrierARFCNDLList;
	}

	/**
	 * Set the {{list}} Each entry is a EUTRA ARFCN in the DL direction to measure. Corrsponds to the parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.

If {{empty}}, then no specific EUTRA ARFCN is provided, meaning that the FAP is required to scan all ARFCNs that it is aware of.
	 *
	 * @since 2.0
	 * @param eutRACarrierARFCNDLList the input value
	 */
	public void  setEutRACarrierARFCNDLList(Collection<String> eutRACarrierARFCNDLList) {
		this.eutRACarrierARFCNDLList = eutRACarrierARFCNDLList;
	}

	/**
	 * Set the {{list}} Each entry is a EUTRA ARFCN in the DL direction to measure. Corrsponds to the parameter NDL in {{bibref|3GPP-TS.36.101|Section 5.7.3}}.

If {{empty}}, then no specific EUTRA ARFCN is provided, meaning that the FAP is required to scan all ARFCNs that it is aware of.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public LTE withEutRACarrierARFCNDLList(String string) {
		getEutRACarrierARFCNDLList().add(string);
		return this;
	}

	/**
	 * Get the specifies the time-out value in seconds, measured from the start of the REM scan, before the REM scan will time out.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getScanTimeout() {
		return scanTimeout;
	}

	/**
	 * Set the specifies the time-out value in seconds, measured from the start of the REM scan, before the REM scan will time out.
	 *
	 * @since 2.0
	 * @param scanTimeout the input value
	 */
	public void  setScanTimeout(Long scanTimeout) {
		this.scanTimeout = scanTimeout;
	}

	/**
	 * Set the specifies the time-out value in seconds, measured from the start of the REM scan, before the REM scan will time out.
	 *
	 * @since 2.0
	 * @param scanTimeout the input value
	 * @return this instance
	 */
	public LTE withScanTimeout(Long scanTimeout) {
		this.scanTimeout = scanTimeout;
		return this;
	}

	/**
	 * Get the indicates the current status of this scan.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getScanStatus() {
		return scanStatus;
	}

	/**
	 * Set the indicates the current status of this scan.
	 *
	 * @since 2.0
	 * @param scanStatus the input value
	 */
	public void  setScanStatus(String scanStatus) {
		this.scanStatus = scanStatus;
	}

	/**
	 * Set the indicates the current status of this scan.
	 *
	 * @since 2.0
	 * @param scanStatus the input value
	 * @return this instance
	 */
	public LTE withScanStatus(String scanStatus) {
		this.scanStatus = scanStatus;
		return this;
	}

	/**
	 * Get the provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getErrorDetails() {
		return errorDetails;
	}

	/**
	 * Set the provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 2.0
	 * @param errorDetails the input value
	 */
	public void  setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * Set the provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 2.0
	 * @param errorDetails the input value
	 * @return this instance
	 */
	public LTE withErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
		return this;
	}

	/**
	 * Get the  time of the last LTE system radio environment measurement.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getLastScanTime() {
		return lastScanTime;
	}

	/**
	 * Set the  time of the last LTE system radio environment measurement.
	 *
	 * @since 2.0
	 * @param lastScanTime the input value
	 */
	public void  setLastScanTime(LocalDateTime lastScanTime) {
		this.lastScanTime = lastScanTime;
	}

	/**
	 * Set the  time of the last LTE system radio environment measurement.
	 *
	 * @since 2.0
	 * @param lastScanTime the input value
	 * @return this instance
	 */
	public LTE withLastScanTime(LocalDateTime lastScanTime) {
		this.lastScanTime = lastScanTime;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxCellEntries() {
		return maxCellEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCellEntries the input value
	 */
	public void  setMaxCellEntries(Long maxCellEntries) {
		this.maxCellEntries = maxCellEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.LTE.Cell.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCellEntries the input value
	 * @return this instance
	 */
	public LTE withMaxCellEntries(Long maxCellEntries) {
		this.maxCellEntries = maxCellEntries;
		return this;
	}

	/**
	 * Get the maximum number of entries available in the {{object|.REM.LTE.CarrierMeas.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxCarrierMeasEntries() {
		return maxCarrierMeasEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.LTE.CarrierMeas.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCarrierMeasEntries the input value
	 */
	public void  setMaxCarrierMeasEntries(Long maxCarrierMeasEntries) {
		this.maxCarrierMeasEntries = maxCarrierMeasEntries;
	}

	/**
	 * Set the maximum number of entries available in the {{object|.REM.LTE.CarrierMeas.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCarrierMeasEntries the input value
	 * @return this instance
	 */
	public LTE withMaxCarrierMeasEntries(Long maxCarrierMeasEntries) {
		this.maxCarrierMeasEntries = maxCarrierMeasEntries;
		return this;
	}

	/**
	 * Get the table indicating the components of the discovered cells.
	 *
	 * @return the value
	 */
	public Collection<Cell> getCells() {
		if (this.cells == null){ this.cells=new ArrayList<>();}
		return cells;
	}

	/**
	 * Set the table indicating the components of the discovered cells.
	 *
	 * @param cells the input value
	 */
	public void  setCells(Collection<Cell> cells) {
		this.cells = cells;
	}

	/**
	 * Set the table indicating the components of the discovered cells.
	 *
	 * @param cell the input value
	 * @return this instance
	 */
	public LTE withCell(Cell cell) {
		getCells().add(cell);
		return this;
	}

	/**
	 * Get the table indicating the measurement of the discovered carrier. The information stored in this object is strictly in the physical layer level and may not necessarily be associated with any particular E-UTRAN cell (e.g. interference level generated by sources other than E-UTRAN cell).
	 *
	 * @return the value
	 */
	public Collection<CarrierMeas> getCarrierMeass() {
		if (this.carrierMeass == null){ this.carrierMeass=new ArrayList<>();}
		return carrierMeass;
	}

	/**
	 * Set the table indicating the measurement of the discovered carrier. The information stored in this object is strictly in the physical layer level and may not necessarily be associated with any particular E-UTRAN cell (e.g. interference level generated by sources other than E-UTRAN cell).
	 *
	 * @param carrierMeass the input value
	 */
	public void  setCarrierMeass(Collection<CarrierMeas> carrierMeass) {
		this.carrierMeass = carrierMeass;
	}

	/**
	 * Set the table indicating the measurement of the discovered carrier. The information stored in this object is strictly in the physical layer level and may not necessarily be associated with any particular E-UTRAN cell (e.g. interference level generated by sources other than E-UTRAN cell).
	 *
	 * @param carrierMeas the input value
	 * @return this instance
	 */
	public LTE withCarrierMeas(CarrierMeas carrierMeas) {
		getCarrierMeass().add(carrierMeas);
		return this;
	}

	//</editor-fold>

}