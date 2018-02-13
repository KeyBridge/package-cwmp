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
package org.broadbandforum.tr262.fap;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr262.fap.gps.AGPSServerConfig;
import org.broadbandforum.tr262.fap.gps.ContinuousGPSStatus;

	/**
	 * This object contains the parameters relating to the GPS scan.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "FAP.GPS.")
@XmlRootElement(name = "GPS")
@XmlType(name = "FAP.GPS")
@XmlAccessorType(XmlAccessType.FIELD)
public class GPS {

	/**
	 * Enables or disables GPS scans during the device start up.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ScanOnBoot")
	@CWMPParameter(access = "readWrite")
	public Boolean scanOnBoot = true;
	/**
	 * Enables or disables periodic GPS scans.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ScanPeriodically")
	@CWMPParameter(access = "readWrite")
	public Boolean scanPeriodically = false;
	/**
	 * When {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which GPS scan is performed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long periodicInterval;
	/**
	 * An absolute time reference in UTC to determine when the CPE will initiate the periodic GPS scan. Each GPS scan MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the GPS scan. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic GPS scans will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future. 

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval. 

If absolute time is not available to the CPE, its periodic GPS scan behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "PeriodicTime")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime periodicTime;
	/**
	 * Whether or not the device SHOULD maintain a continuous GPS lock (e.g. as a frequency stability source).
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ContinuousGPS")
	@CWMPParameter(access = "readWrite")
	public Boolean continuousGPS;
	/**
	 * Specifies the time-out value in seconds since the scan started after which the scan will time out. A timed out scan is to be reported as {{enum|Error_TIMEOUT|ScanStatus}} with {{param|ErrorDetails}} indicating "Timed out"
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ScanTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long scanTimeout;
	/**
	 * Indicates the current status of this scan.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ScanStatus")
	public String scanStatus;
	/**
	 * Provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "ErrorDetails")
	@Size(max = 256)
	public String errorDetails;
	/**
	 * The date and time when the last GPS scan completed.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastScanTime")
	@CWMPParameter(activeNotify = "forceDefaultEnabled")
	public LocalDateTime lastScanTime;
	/**
	 * Specifies the date and time, when the GPS scan last completed successfully.  

This value is retained across reboot and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}.  

The values for {{param|LockedLatitude}}, {{param|LockedLongitude}} and {{param|NumberOfSatellites}} correspond to this time. If a scan has never succeeded before, the value will be the Unknown Time value, as defined in {{bibref|TR-106a4|Section 3.2}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LastSuccessfulScanTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime lastSuccessfulScanTime;
	/**
	 * This parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50d00.00' S would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LockedLatitude")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -90000000, max = 90000000)
	public Integer lockedLatitude;
	/**
	 * This parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LockedLongitude")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -180000000, max = 180000000)
	public Integer lockedLongitude;
	/**
	 * The number of satellites that were locked during the test execution. The greater the number of satellites the better the precision of the results.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NumberOfSatellites")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numberOfSatellites;
	/**
	 * Setting this to {{true}} will cause a reset on the GPS Hardware. Setting this to {{false}} has no effect.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GPSReset")
	@CWMPParameter(access = "readWrite")
	public Boolean gpsReset;
	/**
	 * When {{param|#.ContinuousGPS}} is {{true}}, the parameters in this object contain the GPS status as it is continuously monitored.

When {{param|#.ContinuousGPS}} is {{false}}, the parameters in this object are not being updated and their values are not accurate.
	 */
	@XmlElement(name = "ContinuousGPSStatus")
	public ContinuousGPSStatus continuousGPSStatus;
	/**
	 * This object contains parameters for the configuration of the Assisted Global Positioning System (A-GPS) server. See also {{bibref|3GPP-TS.25.171|Section 3.2}}
	 */
	@XmlElement(name = "AGPSServerConfig")
	public AGPSServerConfig agpSServerConfig;

	public GPS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables GPS scans during the device start up.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isScanOnBoot() {
		return scanOnBoot;
	}

	/**
	 * Set the enables or disables GPS scans during the device start up.
	 *
	 * @since 1.0
	 * @param scanOnBoot the input value
	 */
	public void  setScanOnBoot(Boolean scanOnBoot) {
		this.scanOnBoot = scanOnBoot;
	}

	/**
	 * Set the enables or disables GPS scans during the device start up.
	 *
	 * @since 1.0
	 * @param scanOnBoot the input value
	 * @return this instance
	 */
	public GPS withScanOnBoot(Boolean scanOnBoot) {
		this.scanOnBoot = scanOnBoot;
		return this;
	}

	/**
	 * Get the enables or disables periodic GPS scans.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isScanPeriodically() {
		return scanPeriodically;
	}

	/**
	 * Set the enables or disables periodic GPS scans.
	 *
	 * @since 1.0
	 * @param scanPeriodically the input value
	 */
	public void  setScanPeriodically(Boolean scanPeriodically) {
		this.scanPeriodically = scanPeriodically;
	}

	/**
	 * Set the enables or disables periodic GPS scans.
	 *
	 * @since 1.0
	 * @param scanPeriodically the input value
	 * @return this instance
	 */
	public GPS withScanPeriodically(Boolean scanPeriodically) {
		this.scanPeriodically = scanPeriodically;
		return this;
	}

	/**
	 * Get the when {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which GPS scan is performed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getPeriodicInterval() {
		return periodicInterval;
	}

	/**
	 * Set the when {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which GPS scan is performed.
	 *
	 * @since 1.0
	 * @param periodicInterval the input value
	 */
	public void  setPeriodicInterval(Long periodicInterval) {
		this.periodicInterval = periodicInterval;
	}

	/**
	 * Set the when {{param|ScanPeriodically}} is {{true}}, this value indicates the interval in seconds which GPS scan is performed.
	 *
	 * @since 1.0
	 * @param periodicInterval the input value
	 * @return this instance
	 */
	public GPS withPeriodicInterval(Long periodicInterval) {
		this.periodicInterval = periodicInterval;
		return this;
	}

	/**
	 * Get an absolute time reference in UTC to determine when the CPE will initiate the periodic GPS scan. Each GPS scan MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the GPS scan. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic GPS scans will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future. 

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval. 

If absolute time is not available to the CPE, its periodic GPS scan behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getPeriodicTime() {
		return periodicTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic GPS scan. Each GPS scan MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the GPS scan. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic GPS scans will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future. 

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval. 

If absolute time is not available to the CPE, its periodic GPS scan behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicTime the input value
	 */
	public void  setPeriodicTime(LocalDateTime periodicTime) {
		this.periodicTime = periodicTime;
	}

	/**
	 * Set an absolute time reference in UTC to determine when the CPE will initiate the periodic GPS scan. Each GPS scan MUST occur at (or as soon as possible after) this reference time plus or minus an integer multiple of the {{param|PeriodicInterval}}.

{{param}} is used only to set the "phase" of the GPS scan. The actual value of {{param}} can be arbitrarily far into the past or future. 

For example, if {{param|PeriodicInterval}} is 86400 (a day) and if {{param}} is set to UTC midnight on some day (in the past, present, or future) then periodic GPS scans will occur every day at UTC midnight. These MUST begin on the very next midnight, even if {{param}} refers to a day in the future. 

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} indicates that no particular time reference is specified. That is, the CPE MAY locally choose the time reference, and needs only to adhere to the specified PeriodicInformInterval. 

If absolute time is not available to the CPE, its periodic GPS scan behavior MUST be the same as if {{param}} parameter was set to the Unknown Time value.
	 *
	 * @since 1.0
	 * @param periodicTime the input value
	 * @return this instance
	 */
	public GPS withPeriodicTime(LocalDateTime periodicTime) {
		this.periodicTime = periodicTime;
		return this;
	}

	/**
	 * Get the whether or not the device SHOULD maintain a continuous GPS lock (e.g. as a frequency stability source).
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isContinuousGPS() {
		return continuousGPS;
	}

	/**
	 * Set the whether or not the device SHOULD maintain a continuous GPS lock (e.g. as a frequency stability source).
	 *
	 * @since 1.0
	 * @param continuousGPS the input value
	 */
	public void  setContinuousGPS(Boolean continuousGPS) {
		this.continuousGPS = continuousGPS;
	}

	/**
	 * Set the whether or not the device SHOULD maintain a continuous GPS lock (e.g. as a frequency stability source).
	 *
	 * @since 1.0
	 * @param continuousGPS the input value
	 * @return this instance
	 */
	public GPS withContinuousGPS(Boolean continuousGPS) {
		this.continuousGPS = continuousGPS;
		return this;
	}

	/**
	 * Get the specifies the time-out value in seconds since the scan started after which the scan will time out. A timed out scan is to be reported as {{enum|Error_TIMEOUT|ScanStatus}} with {{param|ErrorDetails}} indicating "Timed out"
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getScanTimeout() {
		return scanTimeout;
	}

	/**
	 * Set the specifies the time-out value in seconds since the scan started after which the scan will time out. A timed out scan is to be reported as {{enum|Error_TIMEOUT|ScanStatus}} with {{param|ErrorDetails}} indicating "Timed out"
	 *
	 * @since 1.0
	 * @param scanTimeout the input value
	 */
	public void  setScanTimeout(Long scanTimeout) {
		this.scanTimeout = scanTimeout;
	}

	/**
	 * Set the specifies the time-out value in seconds since the scan started after which the scan will time out. A timed out scan is to be reported as {{enum|Error_TIMEOUT|ScanStatus}} with {{param|ErrorDetails}} indicating "Timed out"
	 *
	 * @since 1.0
	 * @param scanTimeout the input value
	 * @return this instance
	 */
	public GPS withScanTimeout(Long scanTimeout) {
		this.scanTimeout = scanTimeout;
		return this;
	}

	/**
	 * Get the indicates the current status of this scan.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getScanStatus() {
		return scanStatus;
	}

	/**
	 * Set the indicates the current status of this scan.
	 *
	 * @since 1.0
	 * @param scanStatus the input value
	 */
	public void  setScanStatus(String scanStatus) {
		this.scanStatus = scanStatus;
	}

	/**
	 * Set the indicates the current status of this scan.
	 *
	 * @since 1.0
	 * @param scanStatus the input value
	 * @return this instance
	 */
	public GPS withScanStatus(String scanStatus) {
		this.scanStatus = scanStatus;
		return this;
	}

	/**
	 * Get the provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getErrorDetails() {
		return errorDetails;
	}

	/**
	 * Set the provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 1.0
	 * @param errorDetails the input value
	 */
	public void  setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * Set the provides more detail when the {{param|ScanStatus}} is either {{enum|Error|ScanStatus}} or {{enum|Error_TIMEOUT|ScanStatus}}.
	 *
	 * @since 1.0
	 * @param errorDetails the input value
	 * @return this instance
	 */
	public GPS withErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
		return this;
	}

	/**
	 * Get the date and time when the last GPS scan completed.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getLastScanTime() {
		return lastScanTime;
	}

	/**
	 * Set the date and time when the last GPS scan completed.
	 *
	 * @since 1.0
	 * @param lastScanTime the input value
	 */
	public void  setLastScanTime(LocalDateTime lastScanTime) {
		this.lastScanTime = lastScanTime;
	}

	/**
	 * Set the date and time when the last GPS scan completed.
	 *
	 * @since 1.0
	 * @param lastScanTime the input value
	 * @return this instance
	 */
	public GPS withLastScanTime(LocalDateTime lastScanTime) {
		this.lastScanTime = lastScanTime;
		return this;
	}

	/**
	 * Get the specifies the date and time, when the GPS scan last completed successfully.  

This value is retained across reboot and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}.  

The values for {{param|LockedLatitude}}, {{param|LockedLongitude}} and {{param|NumberOfSatellites}} correspond to this time. If a scan has never succeeded before, the value will be the Unknown Time value, as defined in {{bibref|TR-106a4|Section 3.2}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getLastSuccessfulScanTime() {
		return lastSuccessfulScanTime;
	}

	/**
	 * Set the specifies the date and time, when the GPS scan last completed successfully.  

This value is retained across reboot and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}.  

The values for {{param|LockedLatitude}}, {{param|LockedLongitude}} and {{param|NumberOfSatellites}} correspond to this time. If a scan has never succeeded before, the value will be the Unknown Time value, as defined in {{bibref|TR-106a4|Section 3.2}}.
	 *
	 * @since 1.0
	 * @param lastSuccessfulScanTime the input value
	 */
	public void  setLastSuccessfulScanTime(LocalDateTime lastSuccessfulScanTime) {
		this.lastSuccessfulScanTime = lastSuccessfulScanTime;
	}

	/**
	 * Set the specifies the date and time, when the GPS scan last completed successfully.  

This value is retained across reboot and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}.  

The values for {{param|LockedLatitude}}, {{param|LockedLongitude}} and {{param|NumberOfSatellites}} correspond to this time. If a scan has never succeeded before, the value will be the Unknown Time value, as defined in {{bibref|TR-106a4|Section 3.2}}.
	 *
	 * @since 1.0
	 * @param lastSuccessfulScanTime the input value
	 * @return this instance
	 */
	public GPS withLastSuccessfulScanTime(LocalDateTime lastSuccessfulScanTime) {
		this.lastSuccessfulScanTime = lastSuccessfulScanTime;
		return this;
	}

	/**
	 * Get the this parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50d00.00' S would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getLockedLatitude() {
		return lockedLatitude;
	}

	/**
	 * Set the this parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50d00.00' S would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @param lockedLatitude the input value
	 */
	public void  setLockedLatitude(Integer lockedLatitude) {
		this.lockedLatitude = lockedLatitude;
	}

	/**
	 * Set the this parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90d00.00' South (-90,000,000) to 90d00.00' North (90,000,000).

Example: A latitude of 13d19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50d00.00' S would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @param lockedLatitude the input value
	 * @return this instance
	 */
	public GPS withLockedLatitude(Integer lockedLatitude) {
		this.lockedLatitude = lockedLatitude;
		return this;
	}

	/**
	 * Get the this parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Integer getLockedLongitude() {
		return lockedLongitude;
	}

	/**
	 * Set the this parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @param lockedLongitude the input value
	 */
	public void  setLockedLongitude(Integer lockedLongitude) {
		this.lockedLongitude = lockedLongitude;
	}

	/**
	 * Set the this parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @param lockedLongitude the input value
	 * @return this instance
	 */
	public GPS withLockedLongitude(Integer lockedLongitude) {
		this.lockedLongitude = lockedLongitude;
		return this;
	}

	/**
	 * Get the number of satellites that were locked during the test execution. The greater the number of satellites the better the precision of the results.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getNumberOfSatellites() {
		return numberOfSatellites;
	}

	/**
	 * Set the number of satellites that were locked during the test execution. The greater the number of satellites the better the precision of the results.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @param numberOfSatellites the input value
	 */
	public void  setNumberOfSatellites(Long numberOfSatellites) {
		this.numberOfSatellites = numberOfSatellites;
	}

	/**
	 * Set the number of satellites that were locked during the test execution. The greater the number of satellites the better the precision of the results.

This value is retained across reboots and is only reset after another scan completes successfully or {{param|GPSReset}} is set to {{true}}. If a scan has never succeeded before, the value 0 is reported.
	 *
	 * @since 1.0
	 * @param numberOfSatellites the input value
	 * @return this instance
	 */
	public GPS withNumberOfSatellites(Long numberOfSatellites) {
		this.numberOfSatellites = numberOfSatellites;
		return this;
	}

	/**
	 * Get the setting this to {{true}} will cause a reset on the GPS Hardware. Setting this to {{false}} has no effect.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isGpsReset() {
		return gpsReset;
	}

	/**
	 * Set the setting this to {{true}} will cause a reset on the GPS Hardware. Setting this to {{false}} has no effect.
	 *
	 * @since 1.0
	 * @param gpsReset the input value
	 */
	public void  setGpsReset(Boolean gpsReset) {
		this.gpsReset = gpsReset;
	}

	/**
	 * Set the setting this to {{true}} will cause a reset on the GPS Hardware. Setting this to {{false}} has no effect.
	 *
	 * @since 1.0
	 * @param gpsReset the input value
	 * @return this instance
	 */
	public GPS withGpsReset(Boolean gpsReset) {
		this.gpsReset = gpsReset;
		return this;
	}

	/**
	 * Get the when {{param|#.ContinuousGPS}} is {{true}}, the parameters in this object contain the GPS status as it is continuously monitored.

When {{param|#.ContinuousGPS}} is {{false}}, the parameters in this object are not being updated and their values are not accurate.
	 *
	 * @return the value
	 */
	public ContinuousGPSStatus getContinuousGPSStatus() {
		return continuousGPSStatus;
	}

	/**
	 * Set the when {{param|#.ContinuousGPS}} is {{true}}, the parameters in this object contain the GPS status as it is continuously monitored.

When {{param|#.ContinuousGPS}} is {{false}}, the parameters in this object are not being updated and their values are not accurate.
	 *
	 * @param continuousGPSStatus the input value
	 */
	public void  setContinuousGPSStatus(ContinuousGPSStatus continuousGPSStatus) {
		this.continuousGPSStatus = continuousGPSStatus;
	}

	/**
	 * Set the when {{param|#.ContinuousGPS}} is {{true}}, the parameters in this object contain the GPS status as it is continuously monitored.

When {{param|#.ContinuousGPS}} is {{false}}, the parameters in this object are not being updated and their values are not accurate.
	 *
	 * @param continuousGPSStatus the input value
	 * @return this instance
	 */
	public GPS withContinuousGPSStatus(ContinuousGPSStatus continuousGPSStatus) {
		this.continuousGPSStatus = continuousGPSStatus;
		return this;
	}

	/**
	 * Get the this object contains parameters for the configuration of the Assisted Global Positioning System (A-GPS) server. See also {{bibref|3GPP-TS.25.171|Section 3.2}}
	 *
	 * @return the value
	 */
	public AGPSServerConfig getAgpSServerConfig() {
		return agpSServerConfig;
	}

	/**
	 * Set the this object contains parameters for the configuration of the Assisted Global Positioning System (A-GPS) server. See also {{bibref|3GPP-TS.25.171|Section 3.2}}
	 *
	 * @param agpSServerConfig the input value
	 */
	public void  setAgpSServerConfig(AGPSServerConfig agpSServerConfig) {
		this.agpSServerConfig = agpSServerConfig;
	}

	/**
	 * Set the this object contains parameters for the configuration of the Assisted Global Positioning System (A-GPS) server. See also {{bibref|3GPP-TS.25.171|Section 3.2}}
	 *
	 * @param agpSServerConfig the input value
	 * @return this instance
	 */
	public GPS withAgpSServerConfig(AGPSServerConfig agpSServerConfig) {
		this.agpSServerConfig = agpSServerConfig;
		return this;
	}

	//</editor-fold>

}