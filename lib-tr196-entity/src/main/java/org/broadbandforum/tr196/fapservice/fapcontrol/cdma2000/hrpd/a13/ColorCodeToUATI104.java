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
package org.broadbandforum.tr196.fapservice.fapcontrol.cdma2000.hrpd.a13;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;

	/**
	 * HRPD ColorCode to UATI Mapping Table number of entries.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.FAPControl.CDMA2000.HRPD.A13.ColorCodeToUATI104.{i}.")
public class ColorCodeToUATI104 {

	/**
	 * Enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Color Code mapped to UATI104 in the following field
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ColorCode")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 256)
	public Long colorCode = 0L;
	/**
	 * The UATI104 of the AT that accesses with the ColorCode field
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UATI104")
	@CWMPParameter(access = "readWrite")
	public byte[] uatI104;

	public ColorCodeToUATI104() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public ColorCodeToUATI104 withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public ColorCodeToUATI104 withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the color Code mapped to UATI104 in the following field
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getColorCode() {
		return colorCode;
	}

	/**
	 * Set the color Code mapped to UATI104 in the following field
	 *
	 * @since 2.0
	 * @param colorCode the input value
	 */
	public void  setColorCode(Long colorCode) {
		this.colorCode = colorCode;
	}

	/**
	 * Set the color Code mapped to UATI104 in the following field
	 *
	 * @since 2.0
	 * @param colorCode the input value
	 * @return this instance
	 */
	public ColorCodeToUATI104 withColorCode(Long colorCode) {
		this.colorCode = colorCode;
		return this;
	}

	/**
	 * Get the UATI104 of the AT that accesses with the ColorCode field
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getUatI104() {
		return uatI104;
	}

	/**
	 * Set the UATI104 of the AT that accesses with the ColorCode field
	 *
	 * @since 2.0
	 * @param uatI104 the input value
	 */
	public void  setUatI104(byte[] uatI104) {
		this.uatI104 = uatI104;
	}

	/**
	 * Set the UATI104 of the AT that accesses with the ColorCode field
	 *
	 * @since 2.0
	 * @param uatI104 the input value
	 * @return this instance
	 */
	public ColorCodeToUATI104 withUatI104(byte[] uatI104) {
		this.uatI104 = uatI104;
		return this;
	}

	//</editor-fold>

}