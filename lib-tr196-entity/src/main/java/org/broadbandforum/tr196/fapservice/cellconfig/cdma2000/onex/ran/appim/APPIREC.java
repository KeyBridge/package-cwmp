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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran.appim;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This object can be configured only if {{param|.Capabilities.CDMA2000.OneX.FemtoOverheadMessagesCapable}} is set to {{true}}.
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC.{i}.", uniqueConstraints = {@CWMPUnique(names = {"APSID", "APNID", "APBAND", "APFREQ", "APPNRECTYPE", "APPNRECLEN", "APPNREC"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.APPIM.APPIREC")
@XmlAccessorType(XmlAccessType.FIELD)
public class APPIREC {

	/**
	 * Enables or disables the {{object}} entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Access point association type the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APASSNTYPE")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long apaSSNTYPE = 0L;
	/**
	 * SID same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APSIDSAMEASPREVIOUS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long apsIDSAMEASPREVIOUS = 0L;
	/**
	 * NID same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APNIDSAMEASPREVIOUS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long apnIDSAMEASPREVIOUS = 0L;
	/**
	 * Bandclass same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APBANDSAMEASPREVIOUS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long apbANDSAMEASPREVIOUS = 0L;
	/**
	 * Frequency same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APFREQSAMEASPREVIOUS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long apfREQSAMEASPREVIOUS = 0L;
	/**
	 * PN offset same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APPNRECSAMEASPREVIOUS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long appNRECSAMEASPREVIOUS = 0L;
	/**
	 * Access point SID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APSID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 32767)
	public Long apsID = 0L;
	/**
	 * Access point NID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APNID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long apnID = 0L;
	/**
	 * Access point bandclass in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APBAND")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long apbAND = 0L;
	/**
	 * Access point frequency in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APFREQ")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 2047)
	public Long apfREQ = 0L;
	/**
	 * Access point PN offset in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APPNRECTYPE")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long appNRECTYPE = 0L;
	/**
	 * Length in octets of the access point PN record ({{param|APPNREC}}) in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APPNRECLEN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 31)
	public Long appNRECLEN = 0L;
	/**
	 * Access point PN Record in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APPNREC")
	@CWMPParameter(access = "readWrite")
	public byte[] appNREC;

	public APPIREC() {
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
	public APPIREC withEnable(Boolean enable) {
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
	public APPIREC withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get access point association type the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApaSSNTYPE() {
		return apaSSNTYPE;
	}

	/**
	 * Set access point association type the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apaSSNTYPE the input value
	 */
	public void  setApaSSNTYPE(Long apaSSNTYPE) {
		this.apaSSNTYPE = apaSSNTYPE;
	}

	/**
	 * Set access point association type the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apaSSNTYPE the input value
	 * @return this instance
	 */
	public APPIREC withApaSSNTYPE(Long apaSSNTYPE) {
		this.apaSSNTYPE = apaSSNTYPE;
		return this;
	}

	/**
	 * Get the sid same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApsIDSAMEASPREVIOUS() {
		return apsIDSAMEASPREVIOUS;
	}

	/**
	 * Set the sid same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apsIDSAMEASPREVIOUS the input value
	 */
	public void  setApsIDSAMEASPREVIOUS(Long apsIDSAMEASPREVIOUS) {
		this.apsIDSAMEASPREVIOUS = apsIDSAMEASPREVIOUS;
	}

	/**
	 * Set the sid same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apsIDSAMEASPREVIOUS the input value
	 * @return this instance
	 */
	public APPIREC withApsIDSAMEASPREVIOUS(Long apsIDSAMEASPREVIOUS) {
		this.apsIDSAMEASPREVIOUS = apsIDSAMEASPREVIOUS;
		return this;
	}

	/**
	 * Get the nid same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApnIDSAMEASPREVIOUS() {
		return apnIDSAMEASPREVIOUS;
	}

	/**
	 * Set the nid same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apnIDSAMEASPREVIOUS the input value
	 */
	public void  setApnIDSAMEASPREVIOUS(Long apnIDSAMEASPREVIOUS) {
		this.apnIDSAMEASPREVIOUS = apnIDSAMEASPREVIOUS;
	}

	/**
	 * Set the nid same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apnIDSAMEASPREVIOUS the input value
	 * @return this instance
	 */
	public APPIREC withApnIDSAMEASPREVIOUS(Long apnIDSAMEASPREVIOUS) {
		this.apnIDSAMEASPREVIOUS = apnIDSAMEASPREVIOUS;
		return this;
	}

	/**
	 * Get the bandclass same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApbANDSAMEASPREVIOUS() {
		return apbANDSAMEASPREVIOUS;
	}

	/**
	 * Set the bandclass same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apbANDSAMEASPREVIOUS the input value
	 */
	public void  setApbANDSAMEASPREVIOUS(Long apbANDSAMEASPREVIOUS) {
		this.apbANDSAMEASPREVIOUS = apbANDSAMEASPREVIOUS;
	}

	/**
	 * Set the bandclass same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apbANDSAMEASPREVIOUS the input value
	 * @return this instance
	 */
	public APPIREC withApbANDSAMEASPREVIOUS(Long apbANDSAMEASPREVIOUS) {
		this.apbANDSAMEASPREVIOUS = apbANDSAMEASPREVIOUS;
		return this;
	}

	/**
	 * Get the frequency same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApfREQSAMEASPREVIOUS() {
		return apfREQSAMEASPREVIOUS;
	}

	/**
	 * Set the frequency same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apfREQSAMEASPREVIOUS the input value
	 */
	public void  setApfREQSAMEASPREVIOUS(Long apfREQSAMEASPREVIOUS) {
		this.apfREQSAMEASPREVIOUS = apfREQSAMEASPREVIOUS;
	}

	/**
	 * Set the frequency same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apfREQSAMEASPREVIOUS the input value
	 * @return this instance
	 */
	public APPIREC withApfREQSAMEASPREVIOUS(Long apfREQSAMEASPREVIOUS) {
		this.apfREQSAMEASPREVIOUS = apfREQSAMEASPREVIOUS;
		return this;
	}

	/**
	 * Get the pn offset same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAppNRECSAMEASPREVIOUS() {
		return appNRECSAMEASPREVIOUS;
	}

	/**
	 * Set the pn offset same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNRECSAMEASPREVIOUS the input value
	 */
	public void  setAppNRECSAMEASPREVIOUS(Long appNRECSAMEASPREVIOUS) {
		this.appNRECSAMEASPREVIOUS = appNRECSAMEASPREVIOUS;
	}

	/**
	 * Set the pn offset same as previous indicator in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNRECSAMEASPREVIOUS the input value
	 * @return this instance
	 */
	public APPIREC withAppNRECSAMEASPREVIOUS(Long appNRECSAMEASPREVIOUS) {
		this.appNRECSAMEASPREVIOUS = appNRECSAMEASPREVIOUS;
		return this;
	}

	/**
	 * Get access point SID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApsID() {
		return apsID;
	}

	/**
	 * Set access point SID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apsID the input value
	 */
	public void  setApsID(Long apsID) {
		this.apsID = apsID;
	}

	/**
	 * Set access point SID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apsID the input value
	 * @return this instance
	 */
	public APPIREC withApsID(Long apsID) {
		this.apsID = apsID;
		return this;
	}

	/**
	 * Get access point NID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApnID() {
		return apnID;
	}

	/**
	 * Set access point NID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apnID the input value
	 */
	public void  setApnID(Long apnID) {
		this.apnID = apnID;
	}

	/**
	 * Set access point NID in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apnID the input value
	 * @return this instance
	 */
	public APPIREC withApnID(Long apnID) {
		this.apnID = apnID;
		return this;
	}

	/**
	 * Get access point bandclass in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApbAND() {
		return apbAND;
	}

	/**
	 * Set access point bandclass in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apbAND the input value
	 */
	public void  setApbAND(Long apbAND) {
		this.apbAND = apbAND;
	}

	/**
	 * Set access point bandclass in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apbAND the input value
	 * @return this instance
	 */
	public APPIREC withApbAND(Long apbAND) {
		this.apbAND = apbAND;
		return this;
	}

	/**
	 * Get access point frequency in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApfREQ() {
		return apfREQ;
	}

	/**
	 * Set access point frequency in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apfREQ the input value
	 */
	public void  setApfREQ(Long apfREQ) {
		this.apfREQ = apfREQ;
	}

	/**
	 * Set access point frequency in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param apfREQ the input value
	 * @return this instance
	 */
	public APPIREC withApfREQ(Long apfREQ) {
		this.apfREQ = apfREQ;
		return this;
	}

	/**
	 * Get access point PN offset in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAppNRECTYPE() {
		return appNRECTYPE;
	}

	/**
	 * Set access point PN offset in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNRECTYPE the input value
	 */
	public void  setAppNRECTYPE(Long appNRECTYPE) {
		this.appNRECTYPE = appNRECTYPE;
	}

	/**
	 * Set access point PN offset in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNRECTYPE the input value
	 * @return this instance
	 */
	public APPIREC withAppNRECTYPE(Long appNRECTYPE) {
		this.appNRECTYPE = appNRECTYPE;
		return this;
	}

	/**
	 * Get the length in octets of the access point PN record ({{param|APPNREC}}) in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAppNRECLEN() {
		return appNRECLEN;
	}

	/**
	 * Set the length in octets of the access point PN record ({{param|APPNREC}}) in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNRECLEN the input value
	 */
	public void  setAppNRECLEN(Long appNRECLEN) {
		this.appNRECLEN = appNRECLEN;
	}

	/**
	 * Set the length in octets of the access point PN record ({{param|APPNREC}}) in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNRECLEN the input value
	 * @return this instance
	 */
	public APPIREC withAppNRECLEN(Long appNRECLEN) {
		this.appNRECLEN = appNRECLEN;
		return this;
	}

	/**
	 * Get access point PN Record in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getAppNREC() {
		return appNREC;
	}

	/**
	 * Set access point PN Record in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNREC the input value
	 */
	public void  setAppNREC(byte[] appNREC) {
		this.appNREC = appNREC;
	}

	/**
	 * Set access point PN Record in the access point pilot information record. Refer {{bibref|3GPP2-C.S0005}} for definitions
	 *
	 * @since 2.0
	 * @param appNREC the input value
	 * @return this instance
	 */
	public APPIREC withAppNREC(byte[] appNREC) {
		this.appNREC = appNREC;
		return this;
	}

	//</editor-fold>

}