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
package org.broadbandforum.tr098.internetgatewaydevice;

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
	 * This object contains parameters relating an NTP or SNTP time client in the CPE.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.Time.")
@XmlRootElement(name = "Time")
@XmlType(name = "InternetGatewayDevice.Time")
@XmlAccessorType(XmlAccessType.FIELD)
public class Time {

	/**
	 * Enables or disables the NTP or SNTP time client.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Status of Time support on the CPE.  {{enum}}

The {{enum|Unsynchronized}} value indicates that the CPE's absolute time has not yet been set.

The {{enum|Synchronized}} value indicates that the CPE has acquired accurate absolute time; its current time is accurate.

The {{enum|Error_FailedToSynchronize}} value indicates that the CPE failed to acquire accurate absolute time; its current time is not accurate.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * First NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NTPServer1")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ntpServer1;
	/**
	 * Second NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NTPServer2")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ntpServer2;
	/**
	 * Third NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NTPServer3")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ntpServer3;
	/**
	 * Fourth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NTPServer4")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ntpServer4;
	/**
	 * Fifth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "NTPServer5")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String ntpServer5;
	/**
	 * The current date and time in the CPE's local time zone.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "CurrentLocalTime")
	@CWMPParameter(activeNotify = "canDeny")
	public LocalDateTime currentLocalTime;
	/**
	 * The local time zone offset from UTC, ignoring daylight savings time adjustments, in the form:

: +hh:mm

: -hh:mm

For example, this will always be "-08:00" for California, "+00:00" or "-00:00" for the United Kingdom, and "+01:00" for France.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LocalTimeZone")
	@CWMPParameter(access = "readWrite")
	@Size(max = 6)
	public String localTimeZone;
	/**
	 * Name of the local time zone (human readable string).

The name SHOULD be encoded according to IEEE 1003.1 (POSIX).  The following is an example value: ''EST+5EDT,M4.1.0/2,M10.5.0/2''
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LocalTimeZoneName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String localTimeZoneName;
	/**
	 * Whether or not daylight savings time is in use in the CPE's local time zone.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DaylightSavingsUsed")
	@CWMPParameter(access = "readWrite")
	public Boolean daylightSavingsUsed;
	/**
	 * Current local date and time at which the switch to daylight savings time occurs.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DaylightSavingsStart")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime daylightSavingsStart;
	/**
	 * Current local date and time at which the switch from daylight savings time will occur.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "DaylightSavingsEnd")
	@CWMPParameter(access = "readWrite")
	public LocalDateTime daylightSavingsEnd;

	public Time() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the NTP or SNTP time client.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the NTP or SNTP time client.
	 *
	 * @since 1.4
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the NTP or SNTP time client.
	 *
	 * @since 1.4
	 * @param enable the input value
	 * @return this instance
	 */
	public Time withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of Time support on the CPE.  {{enum}}

The {{enum|Unsynchronized}} value indicates that the CPE's absolute time has not yet been set.

The {{enum|Synchronized}} value indicates that the CPE has acquired accurate absolute time; its current time is accurate.

The {{enum|Error_FailedToSynchronize}} value indicates that the CPE failed to acquire accurate absolute time; its current time is not accurate.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of Time support on the CPE.  {{enum}}

The {{enum|Unsynchronized}} value indicates that the CPE's absolute time has not yet been set.

The {{enum|Synchronized}} value indicates that the CPE has acquired accurate absolute time; its current time is accurate.

The {{enum|Error_FailedToSynchronize}} value indicates that the CPE failed to acquire accurate absolute time; its current time is not accurate.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of Time support on the CPE.  {{enum}}

The {{enum|Unsynchronized}} value indicates that the CPE's absolute time has not yet been set.

The {{enum|Synchronized}} value indicates that the CPE has acquired accurate absolute time; its current time is accurate.

The {{enum|Error_FailedToSynchronize}} value indicates that the CPE failed to acquire accurate absolute time; its current time is not accurate.

The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 1.4
	 * @param status the input value
	 * @return this instance
	 */
	public Time withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the first NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getNtpServer1() {
		return ntpServer1;
	}

	/**
	 * Set the first NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer1 the input value
	 */
	public void  setNtpServer1(String ntpServer1) {
		this.ntpServer1 = ntpServer1;
	}

	/**
	 * Set the first NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer1 the input value
	 * @return this instance
	 */
	public Time withNtpServer1(String ntpServer1) {
		this.ntpServer1 = ntpServer1;
		return this;
	}

	/**
	 * Get the second NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getNtpServer2() {
		return ntpServer2;
	}

	/**
	 * Set the second NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer2 the input value
	 */
	public void  setNtpServer2(String ntpServer2) {
		this.ntpServer2 = ntpServer2;
	}

	/**
	 * Set the second NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer2 the input value
	 * @return this instance
	 */
	public Time withNtpServer2(String ntpServer2) {
		this.ntpServer2 = ntpServer2;
		return this;
	}

	/**
	 * Get the third NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getNtpServer3() {
		return ntpServer3;
	}

	/**
	 * Set the third NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer3 the input value
	 */
	public void  setNtpServer3(String ntpServer3) {
		this.ntpServer3 = ntpServer3;
	}

	/**
	 * Set the third NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer3 the input value
	 * @return this instance
	 */
	public Time withNtpServer3(String ntpServer3) {
		this.ntpServer3 = ntpServer3;
		return this;
	}

	/**
	 * Get the fourth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getNtpServer4() {
		return ntpServer4;
	}

	/**
	 * Set the fourth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer4 the input value
	 */
	public void  setNtpServer4(String ntpServer4) {
		this.ntpServer4 = ntpServer4;
	}

	/**
	 * Set the fourth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer4 the input value
	 * @return this instance
	 */
	public Time withNtpServer4(String ntpServer4) {
		this.ntpServer4 = ntpServer4;
		return this;
	}

	/**
	 * Get the fifth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getNtpServer5() {
		return ntpServer5;
	}

	/**
	 * Set the fifth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer5 the input value
	 */
	public void  setNtpServer5(String ntpServer5) {
		this.ntpServer5 = ntpServer5;
	}

	/**
	 * Set the fifth NTP timeserver.  Either a host name or IP address.
	 *
	 * @since 1.0
	 * @param ntpServer5 the input value
	 * @return this instance
	 */
	public Time withNtpServer5(String ntpServer5) {
		this.ntpServer5 = ntpServer5;
		return this;
	}

	/**
	 * Get the current date and time in the CPE's local time zone.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getCurrentLocalTime() {
		return currentLocalTime;
	}

	/**
	 * Set the current date and time in the CPE's local time zone.
	 *
	 * @since 1.0
	 * @param currentLocalTime the input value
	 */
	public void  setCurrentLocalTime(LocalDateTime currentLocalTime) {
		this.currentLocalTime = currentLocalTime;
	}

	/**
	 * Set the current date and time in the CPE's local time zone.
	 *
	 * @since 1.0
	 * @param currentLocalTime the input value
	 * @return this instance
	 */
	public Time withCurrentLocalTime(LocalDateTime currentLocalTime) {
		this.currentLocalTime = currentLocalTime;
		return this;
	}

	/**
	 * Get the local time zone offset from UTC, ignoring daylight savings time adjustments, in the form:

: +hh:mm

: -hh:mm

For example, this will always be "-08:00" for California, "+00:00" or "-00:00" for the United Kingdom, and "+01:00" for France.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLocalTimeZone() {
		return localTimeZone;
	}

	/**
	 * Set the local time zone offset from UTC, ignoring daylight savings time adjustments, in the form:

: +hh:mm

: -hh:mm

For example, this will always be "-08:00" for California, "+00:00" or "-00:00" for the United Kingdom, and "+01:00" for France.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param localTimeZone the input value
	 */
	public void  setLocalTimeZone(String localTimeZone) {
		this.localTimeZone = localTimeZone;
	}

	/**
	 * Set the local time zone offset from UTC, ignoring daylight savings time adjustments, in the form:

: +hh:mm

: -hh:mm

For example, this will always be "-08:00" for California, "+00:00" or "-00:00" for the United Kingdom, and "+01:00" for France.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param localTimeZone the input value
	 * @return this instance
	 */
	public Time withLocalTimeZone(String localTimeZone) {
		this.localTimeZone = localTimeZone;
		return this;
	}

	/**
	 * Get the name of the local time zone (human readable string).

The name SHOULD be encoded according to IEEE 1003.1 (POSIX).  The following is an example value: ''EST+5EDT,M4.1.0/2,M10.5.0/2''
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getLocalTimeZoneName() {
		return localTimeZoneName;
	}

	/**
	 * Set the name of the local time zone (human readable string).

The name SHOULD be encoded according to IEEE 1003.1 (POSIX).  The following is an example value: ''EST+5EDT,M4.1.0/2,M10.5.0/2''
	 *
	 * @since 1.0
	 * @param localTimeZoneName the input value
	 */
	public void  setLocalTimeZoneName(String localTimeZoneName) {
		this.localTimeZoneName = localTimeZoneName;
	}

	/**
	 * Set the name of the local time zone (human readable string).

The name SHOULD be encoded according to IEEE 1003.1 (POSIX).  The following is an example value: ''EST+5EDT,M4.1.0/2,M10.5.0/2''
	 *
	 * @since 1.0
	 * @param localTimeZoneName the input value
	 * @return this instance
	 */
	public Time withLocalTimeZoneName(String localTimeZoneName) {
		this.localTimeZoneName = localTimeZoneName;
		return this;
	}

	/**
	 * Get the whether or not daylight savings time is in use in the CPE's local time zone.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isDaylightSavingsUsed() {
		return daylightSavingsUsed;
	}

	/**
	 * Set the whether or not daylight savings time is in use in the CPE's local time zone.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param daylightSavingsUsed the input value
	 */
	public void  setDaylightSavingsUsed(Boolean daylightSavingsUsed) {
		this.daylightSavingsUsed = daylightSavingsUsed;
	}

	/**
	 * Set the whether or not daylight savings time is in use in the CPE's local time zone.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param daylightSavingsUsed the input value
	 * @return this instance
	 */
	public Time withDaylightSavingsUsed(Boolean daylightSavingsUsed) {
		this.daylightSavingsUsed = daylightSavingsUsed;
		return this;
	}

	/**
	 * Get the current local date and time at which the switch to daylight savings time occurs.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getDaylightSavingsStart() {
		return daylightSavingsStart;
	}

	/**
	 * Set the current local date and time at which the switch to daylight savings time occurs.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param daylightSavingsStart the input value
	 */
	public void  setDaylightSavingsStart(LocalDateTime daylightSavingsStart) {
		this.daylightSavingsStart = daylightSavingsStart;
	}

	/**
	 * Set the current local date and time at which the switch to daylight savings time occurs.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param daylightSavingsStart the input value
	 * @return this instance
	 */
	public Time withDaylightSavingsStart(LocalDateTime daylightSavingsStart) {
		this.daylightSavingsStart = daylightSavingsStart;
		return this;
	}

	/**
	 * Get the current local date and time at which the switch from daylight savings time will occur.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public LocalDateTime getDaylightSavingsEnd() {
		return daylightSavingsEnd;
	}

	/**
	 * Set the current local date and time at which the switch from daylight savings time will occur.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param daylightSavingsEnd the input value
	 */
	public void  setDaylightSavingsEnd(LocalDateTime daylightSavingsEnd) {
		this.daylightSavingsEnd = daylightSavingsEnd;
	}

	/**
	 * Set the current local date and time at which the switch from daylight savings time will occur.  If daylight savings time is not used, this value is ignored.

This parameter is OBSOLETED because the information that it represents is fully covered by {{param|LocalTimeZoneName}}.
	 *
	 * @since 1.0
	 * @param daylightSavingsEnd the input value
	 * @return this instance
	 */
	public Time withDaylightSavingsEnd(LocalDateTime daylightSavingsEnd) {
		this.daylightSavingsEnd = daylightSavingsEnd;
		return this;
	}

	//</editor-fold>

}