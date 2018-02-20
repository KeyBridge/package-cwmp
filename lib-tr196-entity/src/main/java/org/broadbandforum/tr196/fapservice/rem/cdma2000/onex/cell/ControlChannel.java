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
package org.broadbandforum.tr196.fapservice.rem.cdma2000.onex.cell;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * Table containing information broadcast on control channel.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.REM.CDMA2000.OneX.Cell.{i}.ControlChannel.")
@XmlRootElement(name = "FAPService.REM.CDMA2000.OneX.Cell.ControlChannel")
@XmlType(name = "FAPService.REM.CDMA2000.OneX.Cell.ControlChannel")
@XmlAccessorType(XmlAccessType.FIELD)
public class ControlChannel {

	/**
	 * System identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SID")
	public Integer sid;
	/**
	 * Network identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NID")
	public Integer nid;
	/**
	 * Registration Zone. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "REGZONE")
	public Integer regZONE;
	/**
	 * Basestation latitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BASELAT")
	@Size(min = -2147483648, max = 2147483647)
	public Integer basELAT;
	/**
	 * Basestation longtitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BASELONG")
	@Size(min = -2147483648, max = 2147483647)
	public Integer basELONG;
	/**
	 * Mobile Country Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MCC")
	public Integer mcc;
	/**
	 * the 11th and 12th digits of IMSI, i.e., Mobile Network Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MNCIMSI1112")
	public Integer mncIMSI1112;
	/**
	 * Basestation identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BASEID")
	public Integer basEID;
	/**
	 * Access Point Identification. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APID")
	@Size(max = 32)
	public String apiD;
	/**
	 * Access Point Identification Mask. Set to zero if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APIDMASK")
	public Integer apiDMASK;
	/**
	 * Access Point Identification Text. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APIDTEXT")
	@Size(max = 256)
	public String apiDTEXT;

	public ControlChannel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the system identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSid() {
		return sid;
	}

	/**
	 * Set the system identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param sid the input value
	 */
	public void  setSid(Integer sid) {
		this.sid = sid;
	}

	/**
	 * Set the system identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param sid the input value
	 * @return this instance
	 */
	public ControlChannel withSid(Integer sid) {
		this.sid = sid;
		return this;
	}

	/**
	 * Get the network identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getNid() {
		return nid;
	}

	/**
	 * Set the network identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nid the input value
	 */
	public void  setNid(Integer nid) {
		this.nid = nid;
	}

	/**
	 * Set the network identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nid the input value
	 * @return this instance
	 */
	public ControlChannel withNid(Integer nid) {
		this.nid = nid;
		return this;
	}

	/**
	 * Get the registration Zone. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getRegZONE() {
		return regZONE;
	}

	/**
	 * Set the registration Zone. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param regZONE the input value
	 */
	public void  setRegZONE(Integer regZONE) {
		this.regZONE = regZONE;
	}

	/**
	 * Set the registration Zone. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param regZONE the input value
	 * @return this instance
	 */
	public ControlChannel withRegZONE(Integer regZONE) {
		this.regZONE = regZONE;
		return this;
	}

	/**
	 * Get the basestation latitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBasELAT() {
		return basELAT;
	}

	/**
	 * Set the basestation latitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param basELAT the input value
	 */
	public void  setBasELAT(Integer basELAT) {
		this.basELAT = basELAT;
	}

	/**
	 * Set the basestation latitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param basELAT the input value
	 * @return this instance
	 */
	public ControlChannel withBasELAT(Integer basELAT) {
		this.basELAT = basELAT;
		return this;
	}

	/**
	 * Get the basestation longtitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBasELONG() {
		return basELONG;
	}

	/**
	 * Set the basestation longtitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param basELONG the input value
	 */
	public void  setBasELONG(Integer basELONG) {
		this.basELONG = basELONG;
	}

	/**
	 * Set the basestation longtitude. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param basELONG the input value
	 * @return this instance
	 */
	public ControlChannel withBasELONG(Integer basELONG) {
		this.basELONG = basELONG;
		return this;
	}

	/**
	 * Get the mobile Country Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMcc() {
		return mcc;
	}

	/**
	 * Set the mobile Country Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param mcc the input value
	 */
	public void  setMcc(Integer mcc) {
		this.mcc = mcc;
	}

	/**
	 * Set the mobile Country Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param mcc the input value
	 * @return this instance
	 */
	public ControlChannel withMcc(Integer mcc) {
		this.mcc = mcc;
		return this;
	}

	/**
	 * Get the the 11th and 12th digits of IMSI, i.e., Mobile Network Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMncIMSI1112() {
		return mncIMSI1112;
	}

	/**
	 * Set the the 11th and 12th digits of IMSI, i.e., Mobile Network Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param mncIMSI1112 the input value
	 */
	public void  setMncIMSI1112(Integer mncIMSI1112) {
		this.mncIMSI1112 = mncIMSI1112;
	}

	/**
	 * Set the the 11th and 12th digits of IMSI, i.e., Mobile Network Code. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param mncIMSI1112 the input value
	 * @return this instance
	 */
	public ControlChannel withMncIMSI1112(Integer mncIMSI1112) {
		this.mncIMSI1112 = mncIMSI1112;
		return this;
	}

	/**
	 * Get the basestation identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBasEID() {
		return basEID;
	}

	/**
	 * Set the basestation identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param basEID the input value
	 */
	public void  setBasEID(Integer basEID) {
		this.basEID = basEID;
	}

	/**
	 * Set the basestation identification. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param basEID the input value
	 * @return this instance
	 */
	public ControlChannel withBasEID(Integer basEID) {
		this.basEID = basEID;
		return this;
	}

	/**
	 * Get access Point Identification. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getApiD() {
		return apiD;
	}

	/**
	 * Set access Point Identification. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiD the input value
	 */
	public void  setApiD(String apiD) {
		this.apiD = apiD;
	}

	/**
	 * Set access Point Identification. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiD the input value
	 * @return this instance
	 */
	public ControlChannel withApiD(String apiD) {
		this.apiD = apiD;
		return this;
	}

	/**
	 * Get access Point Identification Mask. Set to zero if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getApiDMASK() {
		return apiDMASK;
	}

	/**
	 * Set access Point Identification Mask. Set to zero if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiDMASK the input value
	 */
	public void  setApiDMASK(Integer apiDMASK) {
		this.apiDMASK = apiDMASK;
	}

	/**
	 * Set access Point Identification Mask. Set to zero if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiDMASK the input value
	 * @return this instance
	 */
	public ControlChannel withApiDMASK(Integer apiDMASK) {
		this.apiDMASK = apiDMASK;
		return this;
	}

	/**
	 * Get access Point Identification Text. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getApiDTEXT() {
		return apiDTEXT;
	}

	/**
	 * Set access Point Identification Text. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiDTEXT the input value
	 */
	public void  setApiDTEXT(String apiDTEXT) {
		this.apiDTEXT = apiDTEXT;
	}

	/**
	 * Set access Point Identification Text. Set to empty string if not available. Refer to {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apiDTEXT the input value
	 * @return this instance
	 */
	public ControlChannel withApiDTEXT(String apiDTEXT) {
		this.apiDTEXT = apiDTEXT;
		return this;
	}

	//</editor-fold>

}