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
package org.broadbandforum.tr196.fapservice.rem.umts.wcdma.cell.bcch;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object defines parameters related to the surface point of the ellipsoid. {{bibref|3GPP-TS.23.032|Section 5}}

It is characterized by the co-ordinates of an ellipsoid point with altitude, distances, and an angle of orientation.

This information is used to refer to a point on the Earth's surface, or close to the Earth's surface, with the same longitude and latitude.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.UMTS.WCDMA.Cell.{i}.BCCH.ReferencePosition.")
@XmlRootElement(name = "FAPService.REM.UMTS.WCDMA.Cell.BCCH.ReferencePosition")
@XmlType(name = "FAPService.REM.UMTS.WCDMA.Cell.BCCH.ReferencePosition")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReferencePosition {

	/**
	 * This parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator.

Range is from: 90.00.00' South (-90,000,000) to 90.00.00' North (90,000,000).

Example: A latitude of 13.19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50.00.00' S would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Latitude")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -90000000, max = 90000000)
	public Integer latitude;
	/**
	 * This parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.

Range is from: 180.00.00' West (-180,000,000) to 180.00.00' East (180,000,000).

Example: A longitude of 13.19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  A longitude of 50.00'0'' W would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Longitude")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(min = -180000000, max = 180000000)
	public Integer longitude;
	/**
	 * The uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UncertaintySemiMajor")
	@Size(min = 0, max = 127)
	public Long uncertaintySemiMajor;
	/**
	 * The uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UncertaintySemiMinor")
	@Size(min = 0, max = 127)
	public Long uncertaintySemiMinor;
	/**
	 * The Information Element (IE) value 'N' is derived by this formula:

2N <= a < 2(N+1)

Where 'a' is the orientation in degrees (0..179).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OrientationOfMajorAxis")
	@Size(min = 0, max = 89)
	public Long orientationOfMajorAxis;
	/**
	 * The degree of confidence in the ellipsoid's points expressed in percent.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Confidence")
	@Size(min = 0, max = 100)
	public Long confidence;

	public ReferencePosition() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator.

Range is from: 90.00.00' South (-90,000,000) to 90.00.00' North (90,000,000).

Example: A latitude of 13.19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50.00.00' S would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLatitude() {
		return latitude;
	}

	/**
	 * Set the this parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator.

Range is from: 90.00.00' South (-90,000,000) to 90.00.00' North (90,000,000).

Example: A latitude of 13.19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50.00.00' S would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 * @param latitude the input value
	 */
	public void  setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	/**
	 * Set the this parameter specifies the latitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, north of the equator. The negative value signifies the direction, south of the equator.

Range is from: 90.00.00' South (-90,000,000) to 90.00.00' North (90,000,000).

Example: A latitude of 13.19.43' N would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  Latitude of 50.00.00' S would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 * @param latitude the input value
	 * @return this instance
	 */
	public ReferencePosition withLatitude(Integer latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * Get the this parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.

Range is from: 180.00.00' West (-180,000,000) to 180.00.00' East (180,000,000).

Example: A longitude of 13.19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  A longitude of 50.00'0'' W would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLongitude() {
		return longitude;
	}

	/**
	 * Set the this parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.

Range is from: 180.00.00' West (-180,000,000) to 180.00.00' East (180,000,000).

Example: A longitude of 13.19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  A longitude of 50.00'0'' W would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 * @param longitude the input value
	 */
	public void  setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	/**
	 * Set the this parameter specifies the longitude of the device's position in degrees, multiplied by 1 million. The positive value signifies the direction, east of the prime meridian. The negative value signifies the direction, west of the prime meridian.

Range is from: 180.00.00' West (-180,000,000) to 180.00.00' East (180,000,000).

Example: A longitude of 13.19.43' E would be represented as 13,323,833, derived as (13*1,000,000)+((19.43*1,000,000)/60).  A longitude of 50.00'0'' W would be represented as value -50,000,000.

If 0 then SIB15 is not detected in the specific cell.
	 *
	 * @since 2.0
	 * @param longitude the input value
	 * @return this instance
	 */
	public ReferencePosition withLongitude(Integer longitude) {
		this.longitude = longitude;
		return this;
	}

	/**
	 * Get the uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUncertaintySemiMajor() {
		return uncertaintySemiMajor;
	}

	/**
	 * Set the uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 * @param uncertaintySemiMajor the input value
	 */
	public void  setUncertaintySemiMajor(Long uncertaintySemiMajor) {
		this.uncertaintySemiMajor = uncertaintySemiMajor;
	}

	/**
	 * Set the uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 * @param uncertaintySemiMajor the input value
	 * @return this instance
	 */
	public ReferencePosition withUncertaintySemiMajor(Long uncertaintySemiMajor) {
		this.uncertaintySemiMajor = uncertaintySemiMajor;
		return this;
	}

	/**
	 * Get the uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUncertaintySemiMinor() {
		return uncertaintySemiMinor;
	}

	/**
	 * Set the uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 * @param uncertaintySemiMinor the input value
	 */
	public void  setUncertaintySemiMinor(Long uncertaintySemiMinor) {
		this.uncertaintySemiMinor = uncertaintySemiMinor;
	}

	/**
	 * Set the uncertainty r is derived from the "uncertainty code" k by

r = 10 x ( 1.1 <power> (k-1) )

{{bibref|3GPP-TS.23.032|Section6.2}}
	 *
	 * @since 2.0
	 * @param uncertaintySemiMinor the input value
	 * @return this instance
	 */
	public ReferencePosition withUncertaintySemiMinor(Long uncertaintySemiMinor) {
		this.uncertaintySemiMinor = uncertaintySemiMinor;
		return this;
	}

	/**
	 * Get the Information Element (IE) value 'N' is derived by this formula:

2N <= a < 2(N+1)

Where 'a' is the orientation in degrees (0..179).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getOrientationOfMajorAxis() {
		return orientationOfMajorAxis;
	}

	/**
	 * Set the Information Element (IE) value 'N' is derived by this formula:

2N <= a < 2(N+1)

Where 'a' is the orientation in degrees (0..179).
	 *
	 * @since 2.0
	 * @param orientationOfMajorAxis the input value
	 */
	public void  setOrientationOfMajorAxis(Long orientationOfMajorAxis) {
		this.orientationOfMajorAxis = orientationOfMajorAxis;
	}

	/**
	 * Set the Information Element (IE) value 'N' is derived by this formula:

2N <= a < 2(N+1)

Where 'a' is the orientation in degrees (0..179).
	 *
	 * @since 2.0
	 * @param orientationOfMajorAxis the input value
	 * @return this instance
	 */
	public ReferencePosition withOrientationOfMajorAxis(Long orientationOfMajorAxis) {
		this.orientationOfMajorAxis = orientationOfMajorAxis;
		return this;
	}

	/**
	 * Get the degree of confidence in the ellipsoid's points expressed in percent.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getConfidence() {
		return confidence;
	}

	/**
	 * Set the degree of confidence in the ellipsoid's points expressed in percent.
	 *
	 * @since 2.0
	 * @param confidence the input value
	 */
	public void  setConfidence(Long confidence) {
		this.confidence = confidence;
	}

	/**
	 * Set the degree of confidence in the ellipsoid's points expressed in percent.
	 *
	 * @since 2.0
	 * @param confidence the input value
	 * @return this instance
	 */
	public ReferencePosition withConfidence(Long confidence) {
		this.confidence = confidence;
		return this;
	}

	//</editor-fold>

}