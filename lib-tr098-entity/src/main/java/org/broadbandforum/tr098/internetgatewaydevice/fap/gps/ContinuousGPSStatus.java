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
package org.broadbandforum.tr098.internetgatewaydevice.fap.gps;

import java.time.LocalDateTime;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * When {{param|#.ContinuousGPS}} is {{true}}, the parameters in this object contain the GPS status as it is continuously monitored.

When {{param|#.ContinuousGPS}} is {{false}}, the parameters in this object are not being updated and their values are not accurate.
	 *
	 * @since 1.10
	 */
@CWMPObject(name = "InternetGatewayDevice.FAP.GPS.ContinuousGPSStatus.")
@XmlRootElement(name = "ContinuousGPSStatus")
@XmlType(name = "InternetGatewayDevice.FAP.GPS.ContinuousGPSStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContinuousGPSStatus {

	/**
	 * The value is {{true}} if the location fix is currently valid (i.e. GPS receiver is currently tracking satellite signals), otherwise it is {{false}}. After a reboot the value is {{false}} until the GPS receivers has a valid current position.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "CurrentFix")
	@CWMPParameter(activeNotify = "canDeny")
	public Boolean currentFix;
	/**
	 * The value is {{true}} if {{param|CurrentFix}} has transitioned to {{true}} at least once since {{param|#.ContinuousGPS}} was enabled, otherwise it is {{false}}. After a reboot the value is {{false}} until {{param|CurrentFix}} has transitioned to {{true}} again.

The GPS coordinates ({{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}}) are not valid until {{param}} has a value of {{true}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "GotFix")
	@CWMPParameter(activeNotify = "canDeny")
	public Boolean gotFix;
	/**
	 * The value is {{true}} if the timing synchronization is good, otherwise it is {{false}}. After a reboot the value is {{false}} until the timing is synchronized again.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "TimingGood")
	@CWMPParameter(activeNotify = "canDeny")
	public Boolean timingGood;
	/**
	 * This parameter represents the most recent latitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90 deg 00.00' South (-90,000,000) to 90 deg 00.00' North (90,000,000).

Example: A latitude of 13 deg 19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50 deg 00.00' S would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}. 

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Latitude")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -90000000, max = 90000000)
	public Integer latitude;
	/**
	 * This parameter represents the most recent longitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Longitude")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -180000000, max = 180000000)
	public Integer longitude;
	/**
	 * This parameter represents the most recent elevation reading for the device's position in millimeters, relative to the WGS84 ellipsoid. The positive value signifies the direction, above sea level. The negative value signifies the direction, below sea level.  

Range is from: 5,000.000 meters below sea level (-5,000,000) to 25,000.000 meters above sea level (25,000,000).

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Elevation")
	@CWMPParameter(activeNotify = "canDeny", units = "millimeters")
	@Size(min = -5000000, max = 25000000)
	public Integer elevation;
	/**
	 * Represents the date and time when the last GPS Fix was acquired.

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} is used when {{param|GotFix}} is {{false}}. This applies too after a reboot of the device until a valid location is determined and {{param|GotFix}} transsitions to {{true}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "LastFixTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime lastFixTime;
	/**
	 * Number of seconds of continuous GPS fix time. After a reboot this value is reset to 0.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "LastFixDuration")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long lastFixDuration;
	/**
	 * Number of seconds to wait for first GPS fix before declaring a GPS fault.

A value of -1 means that there is no timeout and no fault logging.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "FirstFixTimeout")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = -1)
	public Integer firstFixTimeout;
	/**
	 * The number of satellites the receiver is tracking.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SatellitesTracked")
	@CWMPParameter(activeNotify = "canDeny")
	public Long satellitesTracked;
	/**
	 * The interval in seconds at which the GPS tracking information gets reported.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "SatelliteTrackingInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 60, max = 3600)
	public Long satelliteTrackingInterval;
	/**
	 * The output of the GPS receiver's status.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "ReceiverStatus")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String receiverStatus;
	/**
	 * Indicates whether the {{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}} values are determined via a GPS Fix (where the value of this parameter would be {{enum|Real}}) or via some other means (where the value of this parameter would be {{enum|Reference}}).
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "LocationType")
	@CWMPParameter(activeNotify = "canDeny")
	public String locationType;
	/**
	 * The timer duration, in seconds, for which the device waits for GPS to acquire lock.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "LockTimeOutDuration")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 120, max = 86400)
	public Long lockTimeOutDuration;

	public ContinuousGPSStatus() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the value is {{true}} if the location fix is currently valid (i.e. GPS receiver is currently tracking satellite signals), otherwise it is {{false}}. After a reboot the value is {{false}} until the GPS receivers has a valid current position.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isCurrentFix() {
		return currentFix;
	}

	/**
	 * Set the value is {{true}} if the location fix is currently valid (i.e. GPS receiver is currently tracking satellite signals), otherwise it is {{false}}. After a reboot the value is {{false}} until the GPS receivers has a valid current position.
	 *
	 * @since 1.10
	 * @param currentFix the input value
	 */
	public void  setCurrentFix(Boolean currentFix) {
		this.currentFix = currentFix;
	}

	/**
	 * Set the value is {{true}} if the location fix is currently valid (i.e. GPS receiver is currently tracking satellite signals), otherwise it is {{false}}. After a reboot the value is {{false}} until the GPS receivers has a valid current position.
	 *
	 * @since 1.10
	 * @param currentFix the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withCurrentFix(Boolean currentFix) {
		this.currentFix = currentFix;
		return this;
	}

	/**
	 * Get the value is {{true}} if {{param|CurrentFix}} has transitioned to {{true}} at least once since {{param|#.ContinuousGPS}} was enabled, otherwise it is {{false}}. After a reboot the value is {{false}} until {{param|CurrentFix}} has transitioned to {{true}} again.

The GPS coordinates ({{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}}) are not valid until {{param}} has a value of {{true}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isGotFix() {
		return gotFix;
	}

	/**
	 * Set the value is {{true}} if {{param|CurrentFix}} has transitioned to {{true}} at least once since {{param|#.ContinuousGPS}} was enabled, otherwise it is {{false}}. After a reboot the value is {{false}} until {{param|CurrentFix}} has transitioned to {{true}} again.

The GPS coordinates ({{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}}) are not valid until {{param}} has a value of {{true}}.
	 *
	 * @since 1.10
	 * @param gotFix the input value
	 */
	public void  setGotFix(Boolean gotFix) {
		this.gotFix = gotFix;
	}

	/**
	 * Set the value is {{true}} if {{param|CurrentFix}} has transitioned to {{true}} at least once since {{param|#.ContinuousGPS}} was enabled, otherwise it is {{false}}. After a reboot the value is {{false}} until {{param|CurrentFix}} has transitioned to {{true}} again.

The GPS coordinates ({{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}}) are not valid until {{param}} has a value of {{true}}.
	 *
	 * @since 1.10
	 * @param gotFix the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withGotFix(Boolean gotFix) {
		this.gotFix = gotFix;
		return this;
	}

	/**
	 * Get the value is {{true}} if the timing synchronization is good, otherwise it is {{false}}. After a reboot the value is {{false}} until the timing is synchronized again.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isTimingGood() {
		return timingGood;
	}

	/**
	 * Set the value is {{true}} if the timing synchronization is good, otherwise it is {{false}}. After a reboot the value is {{false}} until the timing is synchronized again.
	 *
	 * @since 1.10
	 * @param timingGood the input value
	 */
	public void  setTimingGood(Boolean timingGood) {
		this.timingGood = timingGood;
	}

	/**
	 * Set the value is {{true}} if the timing synchronization is good, otherwise it is {{false}}. After a reboot the value is {{false}} until the timing is synchronized again.
	 *
	 * @since 1.10
	 * @param timingGood the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withTimingGood(Boolean timingGood) {
		this.timingGood = timingGood;
		return this;
	}

	/**
	 * Get the this parameter represents the most recent latitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90 deg 00.00' South (-90,000,000) to 90 deg 00.00' North (90,000,000).

Example: A latitude of 13 deg 19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50 deg 00.00' S would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}. 

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Integer getLatitude() {
		return latitude;
	}

	/**
	 * Set the this parameter represents the most recent latitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90 deg 00.00' South (-90,000,000) to 90 deg 00.00' North (90,000,000).

Example: A latitude of 13 deg 19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50 deg 00.00' S would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}. 

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @param latitude the input value
	 */
	public void  setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	/**
	 * Set the this parameter represents the most recent latitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator. 

Range is from: 90 deg 00.00' South (-90,000,000) to 90 deg 00.00' North (90,000,000).

Example: A latitude of 13 deg 19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). Latitude of 50 deg 00.00' S would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}. 

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @param latitude the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withLatitude(Integer latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * Get the this parameter represents the most recent longitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Integer getLongitude() {
		return longitude;
	}

	/**
	 * Set the this parameter represents the most recent longitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @param longitude the input value
	 */
	public void  setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	/**
	 * Set the this parameter represents the most recent longitude reading for the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.  

Range is from: 180d00.00' West (-180,000,000) to 180d00.00' East (180,000,000).

Example: A longitude of 13d19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60). A longitude of 50d00.00' W would be represented as value -50,000,000.

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @param longitude the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withLongitude(Integer longitude) {
		this.longitude = longitude;
		return this;
	}

	/**
	 * Get the this parameter represents the most recent elevation reading for the device's position in millimeters, relative to the WGS84 ellipsoid. The positive value signifies the direction, above sea level. The negative value signifies the direction, below sea level.  

Range is from: 5,000.000 meters below sea level (-5,000,000) to 25,000.000 meters above sea level (25,000,000).

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Integer getElevation() {
		return elevation;
	}

	/**
	 * Set the this parameter represents the most recent elevation reading for the device's position in millimeters, relative to the WGS84 ellipsoid. The positive value signifies the direction, above sea level. The negative value signifies the direction, below sea level.  

Range is from: 5,000.000 meters below sea level (-5,000,000) to 25,000.000 meters above sea level (25,000,000).

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @param elevation the input value
	 */
	public void  setElevation(Integer elevation) {
		this.elevation = elevation;
	}

	/**
	 * Set the this parameter represents the most recent elevation reading for the device's position in millimeters, relative to the WGS84 ellipsoid. The positive value signifies the direction, above sea level. The negative value signifies the direction, below sea level.  

Range is from: 5,000.000 meters below sea level (-5,000,000) to 25,000.000 meters above sea level (25,000,000).

{{param}} is not valid until {{param|GotFix}} is {{true}}.

If the parameter has never been set before, the value 0 is reported. The value SHOULD be maintained over a reboot.
	 *
	 * @since 1.10
	 * @param elevation the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withElevation(Integer elevation) {
		this.elevation = elevation;
		return this;
	}

	/**
	 * Get the represents the date and time when the last GPS Fix was acquired.

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} is used when {{param|GotFix}} is {{false}}. This applies too after a reboot of the device until a valid location is determined and {{param|GotFix}} transsitions to {{true}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public LocalDateTime getLastFixTime() {
		return lastFixTime;
	}

	/**
	 * Set the represents the date and time when the last GPS Fix was acquired.

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} is used when {{param|GotFix}} is {{false}}. This applies too after a reboot of the device until a valid location is determined and {{param|GotFix}} transsitions to {{true}}.
	 *
	 * @since 1.10
	 * @param lastFixTime the input value
	 */
	public void  setLastFixTime(LocalDateTime lastFixTime) {
		this.lastFixTime = lastFixTime;
	}

	/**
	 * Set the represents the date and time when the last GPS Fix was acquired.

The Unknown Time value defined in {{bibref|TR-106a4|Section 3.2}} is used when {{param|GotFix}} is {{false}}. This applies too after a reboot of the device until a valid location is determined and {{param|GotFix}} transsitions to {{true}}.
	 *
	 * @since 1.10
	 * @param lastFixTime the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withLastFixTime(LocalDateTime lastFixTime) {
		this.lastFixTime = lastFixTime;
		return this;
	}

	/**
	 * Get the number of seconds of continuous GPS fix time. After a reboot this value is reset to 0.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getLastFixDuration() {
		return lastFixDuration;
	}

	/**
	 * Set the number of seconds of continuous GPS fix time. After a reboot this value is reset to 0.
	 *
	 * @since 1.10
	 * @param lastFixDuration the input value
	 */
	public void  setLastFixDuration(Long lastFixDuration) {
		this.lastFixDuration = lastFixDuration;
	}

	/**
	 * Set the number of seconds of continuous GPS fix time. After a reboot this value is reset to 0.
	 *
	 * @since 1.10
	 * @param lastFixDuration the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withLastFixDuration(Long lastFixDuration) {
		this.lastFixDuration = lastFixDuration;
		return this;
	}

	/**
	 * Get the number of seconds to wait for first GPS fix before declaring a GPS fault.

A value of -1 means that there is no timeout and no fault logging.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Integer getFirstFixTimeout() {
		return firstFixTimeout;
	}

	/**
	 * Set the number of seconds to wait for first GPS fix before declaring a GPS fault.

A value of -1 means that there is no timeout and no fault logging.
	 *
	 * @since 1.10
	 * @param firstFixTimeout the input value
	 */
	public void  setFirstFixTimeout(Integer firstFixTimeout) {
		this.firstFixTimeout = firstFixTimeout;
	}

	/**
	 * Set the number of seconds to wait for first GPS fix before declaring a GPS fault.

A value of -1 means that there is no timeout and no fault logging.
	 *
	 * @since 1.10
	 * @param firstFixTimeout the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withFirstFixTimeout(Integer firstFixTimeout) {
		this.firstFixTimeout = firstFixTimeout;
		return this;
	}

	/**
	 * Get the number of satellites the receiver is tracking.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getSatellitesTracked() {
		return satellitesTracked;
	}

	/**
	 * Set the number of satellites the receiver is tracking.
	 *
	 * @since 1.10
	 * @param satellitesTracked the input value
	 */
	public void  setSatellitesTracked(Long satellitesTracked) {
		this.satellitesTracked = satellitesTracked;
	}

	/**
	 * Set the number of satellites the receiver is tracking.
	 *
	 * @since 1.10
	 * @param satellitesTracked the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withSatellitesTracked(Long satellitesTracked) {
		this.satellitesTracked = satellitesTracked;
		return this;
	}

	/**
	 * Get the interval in seconds at which the GPS tracking information gets reported.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getSatelliteTrackingInterval() {
		return satelliteTrackingInterval;
	}

	/**
	 * Set the interval in seconds at which the GPS tracking information gets reported.
	 *
	 * @since 1.10
	 * @param satelliteTrackingInterval the input value
	 */
	public void  setSatelliteTrackingInterval(Long satelliteTrackingInterval) {
		this.satelliteTrackingInterval = satelliteTrackingInterval;
	}

	/**
	 * Set the interval in seconds at which the GPS tracking information gets reported.
	 *
	 * @since 1.10
	 * @param satelliteTrackingInterval the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withSatelliteTrackingInterval(Long satelliteTrackingInterval) {
		this.satelliteTrackingInterval = satelliteTrackingInterval;
		return this;
	}

	/**
	 * Get the output of the GPS receiver's status.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getReceiverStatus() {
		return receiverStatus;
	}

	/**
	 * Set the output of the GPS receiver's status.
	 *
	 * @since 1.10
	 * @param receiverStatus the input value
	 */
	public void  setReceiverStatus(String receiverStatus) {
		this.receiverStatus = receiverStatus;
	}

	/**
	 * Set the output of the GPS receiver's status.
	 *
	 * @since 1.10
	 * @param receiverStatus the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withReceiverStatus(String receiverStatus) {
		this.receiverStatus = receiverStatus;
		return this;
	}

	/**
	 * Get the indicates whether the {{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}} values are determined via a GPS Fix (where the value of this parameter would be {{enum|Real}}) or via some other means (where the value of this parameter would be {{enum|Reference}}).
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getLocationType() {
		return locationType;
	}

	/**
	 * Set the indicates whether the {{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}} values are determined via a GPS Fix (where the value of this parameter would be {{enum|Real}}) or via some other means (where the value of this parameter would be {{enum|Reference}}).
	 *
	 * @since 1.10
	 * @param locationType the input value
	 */
	public void  setLocationType(String locationType) {
		this.locationType = locationType;
	}

	/**
	 * Set the indicates whether the {{param|Latitude}}, {{param|Longitude}}, and {{param|Elevation}} values are determined via a GPS Fix (where the value of this parameter would be {{enum|Real}}) or via some other means (where the value of this parameter would be {{enum|Reference}}).
	 *
	 * @since 1.10
	 * @param locationType the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withLocationType(String locationType) {
		this.locationType = locationType;
		return this;
	}

	/**
	 * Get the timer duration, in seconds, for which the device waits for GPS to acquire lock.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getLockTimeOutDuration() {
		return lockTimeOutDuration;
	}

	/**
	 * Set the timer duration, in seconds, for which the device waits for GPS to acquire lock.
	 *
	 * @since 1.10
	 * @param lockTimeOutDuration the input value
	 */
	public void  setLockTimeOutDuration(Long lockTimeOutDuration) {
		this.lockTimeOutDuration = lockTimeOutDuration;
	}

	/**
	 * Set the timer duration, in seconds, for which the device waits for GPS to acquire lock.
	 *
	 * @since 1.10
	 * @param lockTimeOutDuration the input value
	 * @return this instance
	 */
	public ContinuousGPSStatus withLockTimeOutDuration(Long lockTimeOutDuration) {
		this.lockTimeOutDuration = lockTimeOutDuration;
		return this;
	}

	//</editor-fold>

}