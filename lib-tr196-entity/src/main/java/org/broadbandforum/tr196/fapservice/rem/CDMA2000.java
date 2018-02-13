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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.HRPD;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.MacroTiming;
import org.broadbandforum.tr196.fapservice.rem.cdma2000.OneX;

	/**
	 * This object contains parameters relating to radio environment measurement capabilities for the CDMA2000 system.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.")
@XmlRootElement(name = "FAPService.REM.CDMA2000")
@XmlType(name = "FAPService.REM.CDMA2000")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDMA2000 {

	/**
	 * FAP REM behavior with respect to ongoing active connections. {{enum}}
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
	 * Directs FAP to perform radio environment measurements immediately (but respecting the setting of {{param|InServiceHandling}}) and report back. After performing the action, the FAP resets the ScanNow value to "0" ({{false}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ScanNow")
	@CWMPParameter(access = "readWrite")
	public Boolean scanNow;
	/**
	 * Time  in seconds within which the action should be performed by the FAP. Only applies if {{param|InServiceHandling}} is set to Delayed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReturnTimer")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 1)
	public Long returnTimer;
	/**
	 * Enables periodic reporting of radio environment measurements.
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
	@Size(min = 1)
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
	 * If {{param}} is set to {{enum|All}}, the FAP shall report the overheads from the sectors as well.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReportOverheads")
	@CWMPParameter(access = "readWrite")
	public String reportOverheads;
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
	 * Provides more detail when the {{param|ScanStatus}} is either "Error" or "Error_TIMEOUT".
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ErrorDetails")
	@Size(max = 256)
	public String errorDetails;
	/**
	 * The time of the last system radio environment measurement.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastScanTime")
	public LocalDateTime lastScanTime;
	/**
	 * This object contains parameters relating to radio environment measurement capabilities for the 1x system.
	 */
	@XmlElement(name = "OneX")
	public OneX oneX;
	/**
	 * This object contains parameters relating to radio environment measurement capabilities for the HRPD system.
	 */
	@XmlElement(name = "HRPD")
	public HRPD hrpD;
	/**
	 * Parameters for controlling CDMA2000 system timing derived from macro system sniffing.
	 */
	@XmlElement(name = "MacroTiming")
	public MacroTiming macroTiming;

	public CDMA2000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the fap REM behavior with respect to ongoing active connections. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getInserviceHandling() {
		return inserviceHandling;
	}

	/**
	 * Set the fap REM behavior with respect to ongoing active connections. {{enum}}
	 *
	 * @since 2.0
	 * @param inserviceHandling the input value
	 */
	public void  setInserviceHandling(String inserviceHandling) {
		this.inserviceHandling = inserviceHandling;
	}

	/**
	 * Set the fap REM behavior with respect to ongoing active connections. {{enum}}
	 *
	 * @since 2.0
	 * @param inserviceHandling the input value
	 * @return this instance
	 */
	public CDMA2000 withInserviceHandling(String inserviceHandling) {
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
	public CDMA2000 withScanOnBoot(Boolean scanOnBoot) {
		this.scanOnBoot = scanOnBoot;
		return this;
	}

	/**
	 * Get the directs FAP to perform radio environment measurements immediately (but respecting the setting of {{param|InServiceHandling}}) and report back. After performing the action, the FAP resets the ScanNow value to "0" ({{false}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isScanNow() {
		return scanNow;
	}

	/**
	 * Set the directs FAP to perform radio environment measurements immediately (but respecting the setting of {{param|InServiceHandling}}) and report back. After performing the action, the FAP resets the ScanNow value to "0" ({{false}}).
	 *
	 * @since 2.0
	 * @param scanNow the input value
	 */
	public void  setScanNow(Boolean scanNow) {
		this.scanNow = scanNow;
	}

	/**
	 * Set the directs FAP to perform radio environment measurements immediately (but respecting the setting of {{param|InServiceHandling}}) and report back. After performing the action, the FAP resets the ScanNow value to "0" ({{false}}).
	 *
	 * @since 2.0
	 * @param scanNow the input value
	 * @return this instance
	 */
	public CDMA2000 withScanNow(Boolean scanNow) {
		this.scanNow = scanNow;
		return this;
	}

	/**
	 * Get the time  in seconds within which the action should be performed by the FAP. Only applies if {{param|InServiceHandling}} is set to Delayed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReturnTimer() {
		return returnTimer;
	}

	/**
	 * Set the time  in seconds within which the action should be performed by the FAP. Only applies if {{param|InServiceHandling}} is set to Delayed.
	 *
	 * @since 2.0
	 * @param returnTimer the input value
	 */
	public void  setReturnTimer(Long returnTimer) {
		this.returnTimer = returnTimer;
	}

	/**
	 * Set the time  in seconds within which the action should be performed by the FAP. Only applies if {{param|InServiceHandling}} is set to Delayed.
	 *
	 * @since 2.0
	 * @param returnTimer the input value
	 * @return this instance
	 */
	public CDMA2000 withReturnTimer(Long returnTimer) {
		this.returnTimer = returnTimer;
		return this;
	}

	/**
	 * Get the enables periodic reporting of radio environment measurements.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isScanPeriodically() {
		return scanPeriodically;
	}

	/**
	 * Set the enables periodic reporting of radio environment measurements.
	 *
	 * @since 2.0
	 * @param scanPeriodically the input value
	 */
	public void  setScanPeriodically(Boolean scanPeriodically) {
		this.scanPeriodically = scanPeriodically;
	}

	/**
	 * Set the enables periodic reporting of radio environment measurements.
	 *
	 * @since 2.0
	 * @param scanPeriodically the input value
	 * @return this instance
	 */
	public CDMA2000 withScanPeriodically(Boolean scanPeriodically) {
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
	public CDMA2000 withPeriodicInterval(Long periodicInterval) {
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
	public CDMA2000 withPeriodicTime(LocalDateTime periodicTime) {
		this.periodicTime = periodicTime;
		return this;
	}

	/**
	 * Get the if {{param}} is set to {{enum|All}}, the FAP shall report the overheads from the sectors as well.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getReportOverheads() {
		return reportOverheads;
	}

	/**
	 * Set the if {{param}} is set to {{enum|All}}, the FAP shall report the overheads from the sectors as well.
	 *
	 * @since 2.0
	 * @param reportOverheads the input value
	 */
	public void  setReportOverheads(String reportOverheads) {
		this.reportOverheads = reportOverheads;
	}

	/**
	 * Set the if {{param}} is set to {{enum|All}}, the FAP shall report the overheads from the sectors as well.
	 *
	 * @since 2.0
	 * @param reportOverheads the input value
	 * @return this instance
	 */
	public CDMA2000 withReportOverheads(String reportOverheads) {
		this.reportOverheads = reportOverheads;
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
	public CDMA2000 withScanTimeout(Long scanTimeout) {
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
	public CDMA2000 withScanStatus(String scanStatus) {
		this.scanStatus = scanStatus;
		return this;
	}

	/**
	 * Get the provides more detail when the {{param|ScanStatus}} is either "Error" or "Error_TIMEOUT".
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getErrorDetails() {
		return errorDetails;
	}

	/**
	 * Set the provides more detail when the {{param|ScanStatus}} is either "Error" or "Error_TIMEOUT".
	 *
	 * @since 2.0
	 * @param errorDetails the input value
	 */
	public void  setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * Set the provides more detail when the {{param|ScanStatus}} is either "Error" or "Error_TIMEOUT".
	 *
	 * @since 2.0
	 * @param errorDetails the input value
	 * @return this instance
	 */
	public CDMA2000 withErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
		return this;
	}

	/**
	 * Get the time of the last system radio environment measurement.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public LocalDateTime getLastScanTime() {
		return lastScanTime;
	}

	/**
	 * Set the time of the last system radio environment measurement.
	 *
	 * @since 2.0
	 * @param lastScanTime the input value
	 */
	public void  setLastScanTime(LocalDateTime lastScanTime) {
		this.lastScanTime = lastScanTime;
	}

	/**
	 * Set the time of the last system radio environment measurement.
	 *
	 * @since 2.0
	 * @param lastScanTime the input value
	 * @return this instance
	 */
	public CDMA2000 withLastScanTime(LocalDateTime lastScanTime) {
		this.lastScanTime = lastScanTime;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to radio environment measurement capabilities for the 1x system.
	 *
	 * @return the value
	 */
	public OneX getOneX() {
		return oneX;
	}

	/**
	 * Set the this object contains parameters relating to radio environment measurement capabilities for the 1x system.
	 *
	 * @param oneX the input value
	 */
	public void  setOneX(OneX oneX) {
		this.oneX = oneX;
	}

	/**
	 * Set the this object contains parameters relating to radio environment measurement capabilities for the 1x system.
	 *
	 * @param oneX the input value
	 * @return this instance
	 */
	public CDMA2000 withOneX(OneX oneX) {
		this.oneX = oneX;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to radio environment measurement capabilities for the HRPD system.
	 *
	 * @return the value
	 */
	public HRPD getHrpD() {
		return hrpD;
	}

	/**
	 * Set the this object contains parameters relating to radio environment measurement capabilities for the HRPD system.
	 *
	 * @param hrpD the input value
	 */
	public void  setHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
	}

	/**
	 * Set the this object contains parameters relating to radio environment measurement capabilities for the HRPD system.
	 *
	 * @param hrpD the input value
	 * @return this instance
	 */
	public CDMA2000 withHrpD(HRPD hrpD) {
		this.hrpD = hrpD;
		return this;
	}

	/**
	 * Get the parameters for controlling CDMA2000 system timing derived from macro system sniffing.
	 *
	 * @return the value
	 */
	public MacroTiming getMacroTiming() {
		return macroTiming;
	}

	/**
	 * Set the parameters for controlling CDMA2000 system timing derived from macro system sniffing.
	 *
	 * @param macroTiming the input value
	 */
	public void  setMacroTiming(MacroTiming macroTiming) {
		this.macroTiming = macroTiming;
	}

	/**
	 * Set the parameters for controlling CDMA2000 system timing derived from macro system sniffing.
	 *
	 * @param macroTiming the input value
	 * @return this instance
	 */
	public CDMA2000 withMacroTiming(MacroTiming macroTiming) {
		this.macroTiming = macroTiming;
		return this;
	}

	//</editor-fold>

}