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
package org.broadbandforum.tr196.fapservice.rem.cdma2000.hrpd.cell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table containing information braodcast on control channel.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.HRPD.Cell.{i}.ControlChannel.")
public class ControlChannel {

	/**
	 * The color code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ColorCode")
	public Integer colorCode;
	/**
	 * The sector ID of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SectorID")
	public byte[] sectorID;
	/**
	 * The length of the subnet mask in bits for the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SubnetMask")
	@Size(min = 0, max = 104)
	public Integer subnetMask;
	/**
	 * The country code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CountryCode")
	public Integer countryCode;
	/**
	 * The reported lattitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying North latitudes in the range -1296000 to 1296000 inclusive corresponding to a range of -90 to +90) Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Latitude")
	@Size(min = -1296000, max = 1296000)
	public Integer latitude;
	/**
	 * The reported longitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying East longitude in the range -2592000 to 2592000 inclusive (corresponding to a range of -180 to +180). Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Longitude")
	@Size(min = -2592000, max = 2592000)
	public Integer longitude;

	public ControlChannel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the color code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getColorCode() {
		return colorCode;
	}

	/**
	 * Set the color code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param colorCode the input value
	 */
	public void  setColorCode(Integer colorCode) {
		this.colorCode = colorCode;
	}

	/**
	 * Set the color code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param colorCode the input value
	 * @return this instance
	 */
	public ControlChannel withColorCode(Integer colorCode) {
		this.colorCode = colorCode;
		return this;
	}

	/**
	 * Get the sector ID of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSectorID() {
		return sectorID;
	}

	/**
	 * Set the sector ID of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param sectorID the input value
	 */
	public void  setSectorID(byte[] sectorID) {
		this.sectorID = sectorID;
	}

	/**
	 * Set the sector ID of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param sectorID the input value
	 * @return this instance
	 */
	public ControlChannel withSectorID(byte[] sectorID) {
		this.sectorID = sectorID;
		return this;
	}

	/**
	 * Get the length of the subnet mask in bits for the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Set the length of the subnet mask in bits for the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 */
	public void  setSubnetMask(Integer subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Set the length of the subnet mask in bits for the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param subnetMask the input value
	 * @return this instance
	 */
	public ControlChannel withSubnetMask(Integer subnetMask) {
		this.subnetMask = subnetMask;
		return this;
	}

	/**
	 * Get the country code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getCountryCode() {
		return countryCode;
	}

	/**
	 * Set the country code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param countryCode the input value
	 */
	public void  setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Set the country code of the measured sector as defined in {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param countryCode the input value
	 * @return this instance
	 */
	public ControlChannel withCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * Get the reported lattitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying North latitudes in the range -1296000 to 1296000 inclusive corresponding to a range of -90 to +90) Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLatitude() {
		return latitude;
	}

	/**
	 * Set the reported lattitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying North latitudes in the range -1296000 to 1296000 inclusive corresponding to a range of -90 to +90) Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param latitude the input value
	 */
	public void  setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	/**
	 * Set the reported lattitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying North latitudes in the range -1296000 to 1296000 inclusive corresponding to a range of -90 to +90) Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param latitude the input value
	 * @return this instance
	 */
	public ControlChannel withLatitude(Integer latitude) {
		this.latitude = latitude;
		return this;
	}

	/**
	 * Get the reported longitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying East longitude in the range -2592000 to 2592000 inclusive (corresponding to a range of -180 to +180). Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getLongitude() {
		return longitude;
	}

	/**
	 * Set the reported longitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying East longitude in the range -2592000 to 2592000 inclusive (corresponding to a range of -180 to +180). Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param longitude the input value
	 */
	public void  setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	/**
	 * Set the reported longitude of the cell in units of 0.25 arc seconds, expressed as a two's complement signed number with positive numbers signifying East longitude in the range -2592000 to 2592000 inclusive (corresponding to a range of -180 to +180). Refer to {{bibref|3GPP2-C.S0024}}.
	 *
	 * @since 2.0
	 * @param longitude the input value
	 * @return this instance
	 */
	public ControlChannel withLongitude(Integer longitude) {
		this.longitude = longitude;
		return this;
	}

	//</editor-fold>

}