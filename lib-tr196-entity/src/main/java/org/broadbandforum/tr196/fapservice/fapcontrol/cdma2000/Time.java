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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to time syncronization with CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.Time.")
public class Time {

	/**
	 * The local time zone for CDMA2000 operational purposes. E.g., "+HH:MM JST" for Japan. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalTimeZone")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	@Size(max = 256)
	public String localTimeZone;
	/**
	 * The current CDMA System Time (see {{bibref|3GPP2-C.S0005}}), expressed as date and time in the CPE's local time zone. The format of this field is "YYYY-MM-DDThh:mm:ss.sTZD" (e.g., 1997-07-16T19:20:30.45+01:00),

where:

YYYY = four-digit year

MM   = two-digit month (01=January, etc.)

DD   = two-digit day of month (01 through 31)

hh   = two digits of hour (00 through 23) (am/pm NOT allowed)

mm   = two digits of minute (00 through 59)

ss   = two digits of second (00 through 59)

s    = one or more digits representing a decimal fraction of a second

TZD  = time zone designator (Z or +hh:mm or -hh:mm)
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CurrentLocalTime")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 64)
	public String currentLocalTime;
	/**
	 * Number of leap seconds (in seconds to be applied between CurrentLocalTime and CDMA System Time. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LeapSeconds")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny", units = "seconds")
	@Size(min = 0, max = 255)
	public Integer leapSeconds;
	/**
	 * Whether or not daylight savings time is in use in the FAP's local time zone with respect to CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}). {true}} if daylight savings time is being used; otherwise {{false}}. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DaylightSavingsUsed")
	@CWMPParameter(access = "readWrite")
	public Boolean daylightSavingsUsed;

	public Time() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the local time zone for CDMA2000 operational purposes. E.g., "+HH:MM JST" for Japan. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getLocalTimeZone() {
		return localTimeZone;
	}

	/**
	 * Set the local time zone for CDMA2000 operational purposes. E.g., "+HH:MM JST" for Japan. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param localTimeZone the input value
	 */
	public void  setLocalTimeZone(String localTimeZone) {
		this.localTimeZone = localTimeZone;
	}

	/**
	 * Set the local time zone for CDMA2000 operational purposes. E.g., "+HH:MM JST" for Japan. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param localTimeZone the input value
	 * @return this instance
	 */
	public Time withLocalTimeZone(String localTimeZone) {
		this.localTimeZone = localTimeZone;
		return this;
	}

	/**
	 * Get the current CDMA System Time (see {{bibref|3GPP2-C.S0005}}), expressed as date and time in the CPE's local time zone. The format of this field is "YYYY-MM-DDThh:mm:ss.sTZD" (e.g., 1997-07-16T19:20:30.45+01:00),

where:

YYYY = four-digit year

MM   = two-digit month (01=January, etc.)

DD   = two-digit day of month (01 through 31)

hh   = two digits of hour (00 through 23) (am/pm NOT allowed)

mm   = two digits of minute (00 through 59)

ss   = two digits of second (00 through 59)

s    = one or more digits representing a decimal fraction of a second

TZD  = time zone designator (Z or +hh:mm or -hh:mm)
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getCurrentLocalTime() {
		return currentLocalTime;
	}

	/**
	 * Set the current CDMA System Time (see {{bibref|3GPP2-C.S0005}}), expressed as date and time in the CPE's local time zone. The format of this field is "YYYY-MM-DDThh:mm:ss.sTZD" (e.g., 1997-07-16T19:20:30.45+01:00),

where:

YYYY = four-digit year

MM   = two-digit month (01=January, etc.)

DD   = two-digit day of month (01 through 31)

hh   = two digits of hour (00 through 23) (am/pm NOT allowed)

mm   = two digits of minute (00 through 59)

ss   = two digits of second (00 through 59)

s    = one or more digits representing a decimal fraction of a second

TZD  = time zone designator (Z or +hh:mm or -hh:mm)
	 *
	 * @since 2.0
	 * @param currentLocalTime the input value
	 */
	public void  setCurrentLocalTime(String currentLocalTime) {
		this.currentLocalTime = currentLocalTime;
	}

	/**
	 * Set the current CDMA System Time (see {{bibref|3GPP2-C.S0005}}), expressed as date and time in the CPE's local time zone. The format of this field is "YYYY-MM-DDThh:mm:ss.sTZD" (e.g., 1997-07-16T19:20:30.45+01:00),

where:

YYYY = four-digit year

MM   = two-digit month (01=January, etc.)

DD   = two-digit day of month (01 through 31)

hh   = two digits of hour (00 through 23) (am/pm NOT allowed)

mm   = two digits of minute (00 through 59)

ss   = two digits of second (00 through 59)

s    = one or more digits representing a decimal fraction of a second

TZD  = time zone designator (Z or +hh:mm or -hh:mm)
	 *
	 * @since 2.0
	 * @param currentLocalTime the input value
	 * @return this instance
	 */
	public Time withCurrentLocalTime(String currentLocalTime) {
		this.currentLocalTime = currentLocalTime;
		return this;
	}

	/**
	 * Get the number of leap seconds (in seconds to be applied between CurrentLocalTime and CDMA System Time. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLeapSeconds() {
		return leapSeconds;
	}

	/**
	 * Set the number of leap seconds (in seconds to be applied between CurrentLocalTime and CDMA System Time. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param leapSeconds the input value
	 */
	public void  setLeapSeconds(Integer leapSeconds) {
		this.leapSeconds = leapSeconds;
	}

	/**
	 * Set the number of leap seconds (in seconds to be applied between CurrentLocalTime and CDMA System Time. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param leapSeconds the input value
	 * @return this instance
	 */
	public Time withLeapSeconds(Integer leapSeconds) {
		this.leapSeconds = leapSeconds;
		return this;
	}

	/**
	 * Get the whether or not daylight savings time is in use in the FAP's local time zone with respect to CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}). {true}} if daylight savings time is being used; otherwise {{false}}. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDaylightSavingsUsed() {
		return daylightSavingsUsed;
	}

	/**
	 * Set the whether or not daylight savings time is in use in the FAP's local time zone with respect to CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}). {true}} if daylight savings time is being used; otherwise {{false}}. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param daylightSavingsUsed the input value
	 */
	public void  setDaylightSavingsUsed(Boolean daylightSavingsUsed) {
		this.daylightSavingsUsed = daylightSavingsUsed;
	}

	/**
	 * Set the whether or not daylight savings time is in use in the FAP's local time zone with respect to CDMA2000 System Time (see {{bibref|3GPP2-C.S0005}}). {true}} if daylight savings time is being used; otherwise {{false}}. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param daylightSavingsUsed the input value
	 * @return this instance
	 */
	public Time withDaylightSavingsUsed(Boolean daylightSavingsUsed) {
		this.daylightSavingsUsed = daylightSavingsUsed;
		return this;
	}

	//</editor-fold>

}