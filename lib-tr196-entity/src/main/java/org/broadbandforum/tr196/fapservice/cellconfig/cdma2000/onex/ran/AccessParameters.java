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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * The object used for configuring access parameter messages for 1x. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.RAN.AccessParameters.")
@XmlRootElement(name = "AccessParameters")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX.RAN.AccessParameters")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccessParameters {

	/**
	 * Nominal power correction factor used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NomPwr")
	@CWMPParameter(access = "readWrite")
	@Size(min = -7, max = 8)
	public Integer nomPwr;
	/**
	 * Initial power offset used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "InitPwr")
	@CWMPParameter(access = "readWrite")
	@Size(min = -15, max = 16)
	public Integer initPwr;
	/**
	 * Power step increment in successive access probes. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PwrStepIndb")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long pwrStepIndb;
	/**
	 * {{param}} should be zero for BC0 and BC1.  For other band classes, {{param}} is 1 if Mobile's correction factor is between -24dBm and -9dBm. Otherwise {{param}} is zero. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NomPwrExt")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 0, max = 1)
	public Long nomPwrExt;
	/**
	 * Enabling/disabling global authentication. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APMAuth")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long apmAuth;
	/**
	 * The period (in seconds) that the BSS updates the RAND value sent via APM. Only 2 second multiples accepted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "APMRandUpdatePrd")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 16, max = 14400)
	public Long apmRandUpdatePrd;
	/**
	 * Initial power offset for access. The base station shall set this field to the correction factor to be used by mobile stations in the open loop power estimate for the initial transmission on an Access Channel, expressed as a two's complement value in units of dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Initialpwr")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 31)
	public Long initialpwr;
	/**
	 * Power increment. The base station shall set this field to the value by which mobile stations are to increase their transmit power between successive access probes in an access probe sequence, in units of dB.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PwrStep")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 7)
	public Long pwrStep;
	/**
	 * Number of access probes. The base station shall set this field to one less than the maximum number of access probes mobile stations are to transmit in a single access probe sequence.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumStep")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long numStep;
	/**
	 * Maximum Access Channel message capsule size. The base station shall set this field to the value in the range 0 to 7. {{param}} is set to three less than the maximum number of Access Channel frames in an Access Channel message capsule.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCapSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long maxCapSize;
	/**
	 * Access Channel preamble length. The base station shall set this field to one less than the number of Access Channel frames that mobile stations are to transmit in each Access Channel preamble.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PreambleSize")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long preambleSize;
	/**
	 * Persistence value for access probes sent by mobiles with Access Overload calls values of  0 - 9. A value of 63 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Psist09")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 63)
	public Long psist09;
	/**
	 * Persistence value for access probes sent by mobiles with Access Overload calls values of  10 (test Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Psist10")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long psist10;
	/**
	 * Persistence value for access probes sent by mobiles with Access Overload calls values of  11 (emergency Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Psist11")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long psist11;
	/**
	 * Persistence value for access probes sent by mobiles with Access Overload calls values of  12. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Psist12")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long psist12;
	/**
	 * Persistence value for access probes sent by mobiles with Access Overload calls values of  13. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Psist13")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long psist13;
	/**
	 * Persistence value for access probes sent by mobiles with Access Overload calls values of  14. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Psist14")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long psist14;
	/**
	 * Persistence value for access probes sent by mobiles with Access Overload calls values of  15. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Psist15")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long psist15;
	/**
	 * Persistence modifier for access channel attempts transmitting a message.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MsgPsist")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long msgPsist;
	/**
	 * Persistence modifier for registration message transmission.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RegPsist")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long regPsist;
	/**
	 * Time randomization for access channel probes.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProbePNRan")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 9)
	public Long probePNRan;
	/**
	 * Access transmission timeout. Two less than the time the mobile has to wait before determining that the probe is not received by the BSS. It is in 80 ms slots.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AccTmo")
	@CWMPParameter(access = "readWrite", units = "80 ms slots")
	@Size(min = 0, max = 15)
	public Long accTmo;
	/**
	 * One less than maximum number for randomized delay between successive access probes in frames.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ProbeBkoff")
	@CWMPParameter(access = "readWrite", units = "frames")
	@Size(min = 0, max = 15)
	public Long probeBkoff;
	/**
	 * One less than maximum number for randomized delay between successive access sequences in 80 ms slots.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Bkoff")
	@CWMPParameter(access = "readWrite", units = "80 ms slots")
	@Size(min = 0, max = 15)
	public Long bkoff;
	/**
	 * Maximum number of access probe sequences for an access request.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxReqSeq")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long maxReqSeq;
	/**
	 * Maximum number of access probe sequences for an access response
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxRspSeq")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 15)
	public Long maxRspSeq;

	public AccessParameters() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the nominal power correction factor used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getNomPwr() {
		return nomPwr;
	}

	/**
	 * Set the nominal power correction factor used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nomPwr the input value
	 */
	public void  setNomPwr(Integer nomPwr) {
		this.nomPwr = nomPwr;
	}

	/**
	 * Set the nominal power correction factor used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nomPwr the input value
	 * @return this instance
	 */
	public AccessParameters withNomPwr(Integer nomPwr) {
		this.nomPwr = nomPwr;
		return this;
	}

	/**
	 * Get the initial power offset used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getInitPwr() {
		return initPwr;
	}

	/**
	 * Set the initial power offset used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param initPwr the input value
	 */
	public void  setInitPwr(Integer initPwr) {
		this.initPwr = initPwr;
	}

	/**
	 * Set the initial power offset used by the mobile in open loop power adjustment. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param initPwr the input value
	 * @return this instance
	 */
	public AccessParameters withInitPwr(Integer initPwr) {
		this.initPwr = initPwr;
		return this;
	}

	/**
	 * Get the power step increment in successive access probes. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPwrStepIndb() {
		return pwrStepIndb;
	}

	/**
	 * Set the power step increment in successive access probes. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrStepIndb the input value
	 */
	public void  setPwrStepIndb(Long pwrStepIndb) {
		this.pwrStepIndb = pwrStepIndb;
	}

	/**
	 * Set the power step increment in successive access probes. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param pwrStepIndb the input value
	 * @return this instance
	 */
	public AccessParameters withPwrStepIndb(Long pwrStepIndb) {
		this.pwrStepIndb = pwrStepIndb;
		return this;
	}

	/**
	 * Get the {{param}} should be zero for BC0 and BC1.  For other band classes, {{param}} is 1 if Mobile's correction factor is between -24dBm and -9dBm. Otherwise {{param}} is zero. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNomPwrExt() {
		return nomPwrExt;
	}

	/**
	 * Set the {{param}} should be zero for BC0 and BC1.  For other band classes, {{param}} is 1 if Mobile's correction factor is between -24dBm and -9dBm. Otherwise {{param}} is zero. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nomPwrExt the input value
	 */
	public void  setNomPwrExt(Long nomPwrExt) {
		this.nomPwrExt = nomPwrExt;
	}

	/**
	 * Set the {{param}} should be zero for BC0 and BC1.  For other band classes, {{param}} is 1 if Mobile's correction factor is between -24dBm and -9dBm. Otherwise {{param}} is zero. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param nomPwrExt the input value
	 * @return this instance
	 */
	public AccessParameters withNomPwrExt(Long nomPwrExt) {
		this.nomPwrExt = nomPwrExt;
		return this;
	}

	/**
	 * Get the enabling/disabling global authentication. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApmAuth() {
		return apmAuth;
	}

	/**
	 * Set the enabling/disabling global authentication. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apmAuth the input value
	 */
	public void  setApmAuth(Long apmAuth) {
		this.apmAuth = apmAuth;
	}

	/**
	 * Set the enabling/disabling global authentication. See {{bibref|3GPP2-C.S0005}}.
	 *
	 * @since 2.0
	 * @param apmAuth the input value
	 * @return this instance
	 */
	public AccessParameters withApmAuth(Long apmAuth) {
		this.apmAuth = apmAuth;
		return this;
	}

	/**
	 * Get the period (in seconds) that the BSS updates the RAND value sent via APM. Only 2 second multiples accepted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getApmRandUpdatePrd() {
		return apmRandUpdatePrd;
	}

	/**
	 * Set the period (in seconds) that the BSS updates the RAND value sent via APM. Only 2 second multiples accepted.
	 *
	 * @since 2.0
	 * @param apmRandUpdatePrd the input value
	 */
	public void  setApmRandUpdatePrd(Long apmRandUpdatePrd) {
		this.apmRandUpdatePrd = apmRandUpdatePrd;
	}

	/**
	 * Set the period (in seconds) that the BSS updates the RAND value sent via APM. Only 2 second multiples accepted.
	 *
	 * @since 2.0
	 * @param apmRandUpdatePrd the input value
	 * @return this instance
	 */
	public AccessParameters withApmRandUpdatePrd(Long apmRandUpdatePrd) {
		this.apmRandUpdatePrd = apmRandUpdatePrd;
		return this;
	}

	/**
	 * Get the initial power offset for access. The base station shall set this field to the correction factor to be used by mobile stations in the open loop power estimate for the initial transmission on an Access Channel, expressed as a two's complement value in units of dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getInitialpwr() {
		return initialpwr;
	}

	/**
	 * Set the initial power offset for access. The base station shall set this field to the correction factor to be used by mobile stations in the open loop power estimate for the initial transmission on an Access Channel, expressed as a two's complement value in units of dB.
	 *
	 * @since 2.0
	 * @param initialpwr the input value
	 */
	public void  setInitialpwr(Long initialpwr) {
		this.initialpwr = initialpwr;
	}

	/**
	 * Set the initial power offset for access. The base station shall set this field to the correction factor to be used by mobile stations in the open loop power estimate for the initial transmission on an Access Channel, expressed as a two's complement value in units of dB.
	 *
	 * @since 2.0
	 * @param initialpwr the input value
	 * @return this instance
	 */
	public AccessParameters withInitialpwr(Long initialpwr) {
		this.initialpwr = initialpwr;
		return this;
	}

	/**
	 * Get the power increment. The base station shall set this field to the value by which mobile stations are to increase their transmit power between successive access probes in an access probe sequence, in units of dB.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPwrStep() {
		return pwrStep;
	}

	/**
	 * Set the power increment. The base station shall set this field to the value by which mobile stations are to increase their transmit power between successive access probes in an access probe sequence, in units of dB.
	 *
	 * @since 2.0
	 * @param pwrStep the input value
	 */
	public void  setPwrStep(Long pwrStep) {
		this.pwrStep = pwrStep;
	}

	/**
	 * Set the power increment. The base station shall set this field to the value by which mobile stations are to increase their transmit power between successive access probes in an access probe sequence, in units of dB.
	 *
	 * @since 2.0
	 * @param pwrStep the input value
	 * @return this instance
	 */
	public AccessParameters withPwrStep(Long pwrStep) {
		this.pwrStep = pwrStep;
		return this;
	}

	/**
	 * Get the number of access probes. The base station shall set this field to one less than the maximum number of access probes mobile stations are to transmit in a single access probe sequence.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumStep() {
		return numStep;
	}

	/**
	 * Set the number of access probes. The base station shall set this field to one less than the maximum number of access probes mobile stations are to transmit in a single access probe sequence.
	 *
	 * @since 2.0
	 * @param numStep the input value
	 */
	public void  setNumStep(Long numStep) {
		this.numStep = numStep;
	}

	/**
	 * Set the number of access probes. The base station shall set this field to one less than the maximum number of access probes mobile stations are to transmit in a single access probe sequence.
	 *
	 * @since 2.0
	 * @param numStep the input value
	 * @return this instance
	 */
	public AccessParameters withNumStep(Long numStep) {
		this.numStep = numStep;
		return this;
	}

	/**
	 * Get the maximum Access Channel message capsule size. The base station shall set this field to the value in the range 0 to 7. {{param}} is set to three less than the maximum number of Access Channel frames in an Access Channel message capsule.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxCapSize() {
		return maxCapSize;
	}

	/**
	 * Set the maximum Access Channel message capsule size. The base station shall set this field to the value in the range 0 to 7. {{param}} is set to three less than the maximum number of Access Channel frames in an Access Channel message capsule.
	 *
	 * @since 2.0
	 * @param maxCapSize the input value
	 */
	public void  setMaxCapSize(Long maxCapSize) {
		this.maxCapSize = maxCapSize;
	}

	/**
	 * Set the maximum Access Channel message capsule size. The base station shall set this field to the value in the range 0 to 7. {{param}} is set to three less than the maximum number of Access Channel frames in an Access Channel message capsule.
	 *
	 * @since 2.0
	 * @param maxCapSize the input value
	 * @return this instance
	 */
	public AccessParameters withMaxCapSize(Long maxCapSize) {
		this.maxCapSize = maxCapSize;
		return this;
	}

	/**
	 * Get access Channel preamble length. The base station shall set this field to one less than the number of Access Channel frames that mobile stations are to transmit in each Access Channel preamble.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPreambleSize() {
		return preambleSize;
	}

	/**
	 * Set access Channel preamble length. The base station shall set this field to one less than the number of Access Channel frames that mobile stations are to transmit in each Access Channel preamble.
	 *
	 * @since 2.0
	 * @param preambleSize the input value
	 */
	public void  setPreambleSize(Long preambleSize) {
		this.preambleSize = preambleSize;
	}

	/**
	 * Set access Channel preamble length. The base station shall set this field to one less than the number of Access Channel frames that mobile stations are to transmit in each Access Channel preamble.
	 *
	 * @since 2.0
	 * @param preambleSize the input value
	 * @return this instance
	 */
	public AccessParameters withPreambleSize(Long preambleSize) {
		this.preambleSize = preambleSize;
		return this;
	}

	/**
	 * Get the persistence value for access probes sent by mobiles with Access Overload calls values of  0 - 9. A value of 63 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPsist09() {
		return psist09;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  0 - 9. A value of 63 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist09 the input value
	 */
	public void  setPsist09(Long psist09) {
		this.psist09 = psist09;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  0 - 9. A value of 63 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist09 the input value
	 * @return this instance
	 */
	public AccessParameters withPsist09(Long psist09) {
		this.psist09 = psist09;
		return this;
	}

	/**
	 * Get the persistence value for access probes sent by mobiles with Access Overload calls values of  10 (test Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPsist10() {
		return psist10;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  10 (test Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist10 the input value
	 */
	public void  setPsist10(Long psist10) {
		this.psist10 = psist10;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  10 (test Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist10 the input value
	 * @return this instance
	 */
	public AccessParameters withPsist10(Long psist10) {
		this.psist10 = psist10;
		return this;
	}

	/**
	 * Get the persistence value for access probes sent by mobiles with Access Overload calls values of  11 (emergency Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPsist11() {
		return psist11;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  11 (emergency Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist11 the input value
	 */
	public void  setPsist11(Long psist11) {
		this.psist11 = psist11;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  11 (emergency Mobile). A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist11 the input value
	 * @return this instance
	 */
	public AccessParameters withPsist11(Long psist11) {
		this.psist11 = psist11;
		return this;
	}

	/**
	 * Get the persistence value for access probes sent by mobiles with Access Overload calls values of  12. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPsist12() {
		return psist12;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  12. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist12 the input value
	 */
	public void  setPsist12(Long psist12) {
		this.psist12 = psist12;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  12. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist12 the input value
	 * @return this instance
	 */
	public AccessParameters withPsist12(Long psist12) {
		this.psist12 = psist12;
		return this;
	}

	/**
	 * Get the persistence value for access probes sent by mobiles with Access Overload calls values of  13. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPsist13() {
		return psist13;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  13. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist13 the input value
	 */
	public void  setPsist13(Long psist13) {
		this.psist13 = psist13;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  13. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist13 the input value
	 * @return this instance
	 */
	public AccessParameters withPsist13(Long psist13) {
		this.psist13 = psist13;
		return this;
	}

	/**
	 * Get the persistence value for access probes sent by mobiles with Access Overload calls values of  14. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPsist14() {
		return psist14;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  14. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist14 the input value
	 */
	public void  setPsist14(Long psist14) {
		this.psist14 = psist14;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  14. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist14 the input value
	 * @return this instance
	 */
	public AccessParameters withPsist14(Long psist14) {
		this.psist14 = psist14;
		return this;
	}

	/**
	 * Get the persistence value for access probes sent by mobiles with Access Overload calls values of  15. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPsist15() {
		return psist15;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  15. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist15 the input value
	 */
	public void  setPsist15(Long psist15) {
		this.psist15 = psist15;
	}

	/**
	 * Set the persistence value for access probes sent by mobiles with Access Overload calls values of  15. A value of 7 indicates such mobiles are not allowed to send access probes.
	 *
	 * @since 2.0
	 * @param psist15 the input value
	 * @return this instance
	 */
	public AccessParameters withPsist15(Long psist15) {
		this.psist15 = psist15;
		return this;
	}

	/**
	 * Get the persistence modifier for access channel attempts transmitting a message.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMsgPsist() {
		return msgPsist;
	}

	/**
	 * Set the persistence modifier for access channel attempts transmitting a message.
	 *
	 * @since 2.0
	 * @param msgPsist the input value
	 */
	public void  setMsgPsist(Long msgPsist) {
		this.msgPsist = msgPsist;
	}

	/**
	 * Set the persistence modifier for access channel attempts transmitting a message.
	 *
	 * @since 2.0
	 * @param msgPsist the input value
	 * @return this instance
	 */
	public AccessParameters withMsgPsist(Long msgPsist) {
		this.msgPsist = msgPsist;
		return this;
	}

	/**
	 * Get the persistence modifier for registration message transmission.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRegPsist() {
		return regPsist;
	}

	/**
	 * Set the persistence modifier for registration message transmission.
	 *
	 * @since 2.0
	 * @param regPsist the input value
	 */
	public void  setRegPsist(Long regPsist) {
		this.regPsist = regPsist;
	}

	/**
	 * Set the persistence modifier for registration message transmission.
	 *
	 * @since 2.0
	 * @param regPsist the input value
	 * @return this instance
	 */
	public AccessParameters withRegPsist(Long regPsist) {
		this.regPsist = regPsist;
		return this;
	}

	/**
	 * Get the time randomization for access channel probes.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getProbePNRan() {
		return probePNRan;
	}

	/**
	 * Set the time randomization for access channel probes.
	 *
	 * @since 2.0
	 * @param probePNRan the input value
	 */
	public void  setProbePNRan(Long probePNRan) {
		this.probePNRan = probePNRan;
	}

	/**
	 * Set the time randomization for access channel probes.
	 *
	 * @since 2.0
	 * @param probePNRan the input value
	 * @return this instance
	 */
	public AccessParameters withProbePNRan(Long probePNRan) {
		this.probePNRan = probePNRan;
		return this;
	}

	/**
	 * Get access transmission timeout. Two less than the time the mobile has to wait before determining that the probe is not received by the BSS. It is in 80 ms slots.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAccTmo() {
		return accTmo;
	}

	/**
	 * Set access transmission timeout. Two less than the time the mobile has to wait before determining that the probe is not received by the BSS. It is in 80 ms slots.
	 *
	 * @since 2.0
	 * @param accTmo the input value
	 */
	public void  setAccTmo(Long accTmo) {
		this.accTmo = accTmo;
	}

	/**
	 * Set access transmission timeout. Two less than the time the mobile has to wait before determining that the probe is not received by the BSS. It is in 80 ms slots.
	 *
	 * @since 2.0
	 * @param accTmo the input value
	 * @return this instance
	 */
	public AccessParameters withAccTmo(Long accTmo) {
		this.accTmo = accTmo;
		return this;
	}

	/**
	 * Get one less than maximum number for randomized delay between successive access probes in frames.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getProbeBkoff() {
		return probeBkoff;
	}

	/**
	 * Set one less than maximum number for randomized delay between successive access probes in frames.
	 *
	 * @since 2.0
	 * @param probeBkoff the input value
	 */
	public void  setProbeBkoff(Long probeBkoff) {
		this.probeBkoff = probeBkoff;
	}

	/**
	 * Set one less than maximum number for randomized delay between successive access probes in frames.
	 *
	 * @since 2.0
	 * @param probeBkoff the input value
	 * @return this instance
	 */
	public AccessParameters withProbeBkoff(Long probeBkoff) {
		this.probeBkoff = probeBkoff;
		return this;
	}

	/**
	 * Get one less than maximum number for randomized delay between successive access sequences in 80 ms slots.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBkoff() {
		return bkoff;
	}

	/**
	 * Set one less than maximum number for randomized delay between successive access sequences in 80 ms slots.
	 *
	 * @since 2.0
	 * @param bkoff the input value
	 */
	public void  setBkoff(Long bkoff) {
		this.bkoff = bkoff;
	}

	/**
	 * Set one less than maximum number for randomized delay between successive access sequences in 80 ms slots.
	 *
	 * @since 2.0
	 * @param bkoff the input value
	 * @return this instance
	 */
	public AccessParameters withBkoff(Long bkoff) {
		this.bkoff = bkoff;
		return this;
	}

	/**
	 * Get the maximum number of access probe sequences for an access request.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxReqSeq() {
		return maxReqSeq;
	}

	/**
	 * Set the maximum number of access probe sequences for an access request.
	 *
	 * @since 2.0
	 * @param maxReqSeq the input value
	 */
	public void  setMaxReqSeq(Long maxReqSeq) {
		this.maxReqSeq = maxReqSeq;
	}

	/**
	 * Set the maximum number of access probe sequences for an access request.
	 *
	 * @since 2.0
	 * @param maxReqSeq the input value
	 * @return this instance
	 */
	public AccessParameters withMaxReqSeq(Long maxReqSeq) {
		this.maxReqSeq = maxReqSeq;
		return this;
	}

	/**
	 * Get the maximum number of access probe sequences for an access response
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxRspSeq() {
		return maxRspSeq;
	}

	/**
	 * Set the maximum number of access probe sequences for an access response
	 *
	 * @since 2.0
	 * @param maxRspSeq the input value
	 */
	public void  setMaxRspSeq(Long maxRspSeq) {
		this.maxRspSeq = maxRspSeq;
	}

	/**
	 * Set the maximum number of access probe sequences for an access response
	 *
	 * @since 2.0
	 * @param maxRspSeq the input value
	 * @return this instance
	 */
	public AccessParameters withMaxRspSeq(Long maxRspSeq) {
		this.maxRspSeq = maxRspSeq;
		return this;
	}

	//</editor-fold>

}