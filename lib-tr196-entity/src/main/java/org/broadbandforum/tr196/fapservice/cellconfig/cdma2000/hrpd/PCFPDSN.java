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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;
import org.broadbandforum.tr196.datatypes.IPAddress;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.pcfpdsn.A11RegUpdateStats;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.pcfpdsn.A11SessionUpdateStats;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.pcfpdsn.AuxA10Stats;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.pcfpdsn.PCFPDSNStats;

	/**
	 * PCFPDSN Object configured for HRPD. {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.")
@XmlRootElement(name = "PCFPDSN")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD.PCFPDSN")
@XmlAccessorType(XmlAccessType.FIELD)
public class PCFPDSN {

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
	 * Index of this PDSN object in the PCFPDSNCollection array. The index is used as PDSN number in PDSN selection algorithm (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}})
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 127)
	public Integer pdsNNumber = 0;
	/**
	 * Security Parameter Index used
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecurityParameterIndex")
	@CWMPParameter(access = "readWrite")
	@Size(min = 256, max = -1)
	public Long securityParameterIndex = 256L;
	/**
	 * Secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SecurityKey")
	@CWMPParameter(access = "readWrite")
	public byte[] securityKey;
	/**
	 * HRPD IOS Version of this PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "IOSVersion")
	@CWMPParameter(access = "readWrite")
	public String iosVersion = "TIA-878-a";
	/**
	 * Administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNadminStatus")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer pdsNadminStatus = 0;
	/**
	 * Reachability status of this PDSN.  0-unreachable, 1-reachable.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNHealthStatus")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Long pdsNHealthStatus = 0L;
	/**
	 * IP address of the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress pdsNIPAddress;
	/**
	 * This object is used in obtaining the A11 Session Update stats for each PDSN
	 */
	@XmlElement(name = "A11SessionUpdateStats")
	public A11SessionUpdateStats a11SessionUpdateStats;
	/**
	 * This object is used in obtaining the A11 Registration Update stats for each PDSN.
	 */
	@XmlElement(name = "A11RegUpdateStats")
	public A11RegUpdateStats a11RegUpdateStats;
	/**
	 * This object is used in obtaining the Auxillary A10 Connection stats for each PDSN
	 */
	@XmlElement(name = "AuxA10Stats")
	public AuxA10Stats auxA10Stats;
	/**
	 * This object is used in obtaining the PCF PDSN stats for each PDSN
	 */
	@XmlElement(name = "PCFPDSNStats")
	public PCFPDSNStats pcfPDSNStats;

	public PCFPDSN() {
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
	public PCFPDSN withEnable(Boolean enable) {
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
	public PCFPDSN withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the index of this PDSN object in the PCFPDSNCollection array. The index is used as PDSN number in PDSN selection algorithm (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}})
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPdsNNumber() {
		return pdsNNumber;
	}

	/**
	 * Set the index of this PDSN object in the PCFPDSNCollection array. The index is used as PDSN number in PDSN selection algorithm (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}})
	 *
	 * @since 2.0
	 * @param pdsNNumber the input value
	 */
	public void  setPdsNNumber(Integer pdsNNumber) {
		this.pdsNNumber = pdsNNumber;
	}

	/**
	 * Set the index of this PDSN object in the PCFPDSNCollection array. The index is used as PDSN number in PDSN selection algorithm (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}})
	 *
	 * @since 2.0
	 * @param pdsNNumber the input value
	 * @return this instance
	 */
	public PCFPDSN withPdsNNumber(Integer pdsNNumber) {
		this.pdsNNumber = pdsNNumber;
		return this;
	}

	/**
	 * Get the security Parameter Index used
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSecurityParameterIndex() {
		return securityParameterIndex;
	}

	/**
	 * Set the security Parameter Index used
	 *
	 * @since 2.0
	 * @param securityParameterIndex the input value
	 */
	public void  setSecurityParameterIndex(Long securityParameterIndex) {
		this.securityParameterIndex = securityParameterIndex;
	}

	/**
	 * Set the security Parameter Index used
	 *
	 * @since 2.0
	 * @param securityParameterIndex the input value
	 * @return this instance
	 */
	public PCFPDSN withSecurityParameterIndex(Long securityParameterIndex) {
		this.securityParameterIndex = securityParameterIndex;
		return this;
	}

	/**
	 * Get the secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getSecurityKey() {
		return securityKey;
	}

	/**
	 * Set the secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 * @param securityKey the input value
	 */
	public void  setSecurityKey(byte[] securityKey) {
		this.securityKey = securityKey;
	}

	/**
	 * Set the secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 * @param securityKey the input value
	 * @return this instance
	 */
	public PCFPDSN withSecurityKey(byte[] securityKey) {
		this.securityKey = securityKey;
		return this;
	}

	/**
	 * Get the hrpD IOS Version of this PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getIosVersion() {
		return iosVersion;
	}

	/**
	 * Set the hrpD IOS Version of this PDSN
	 *
	 * @since 2.0
	 * @param iosVersion the input value
	 */
	public void  setIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
	}

	/**
	 * Set the hrpD IOS Version of this PDSN
	 *
	 * @since 2.0
	 * @param iosVersion the input value
	 * @return this instance
	 */
	public PCFPDSN withIosVersion(String iosVersion) {
		this.iosVersion = iosVersion;
		return this;
	}

	/**
	 * Get administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPdsNadminStatus() {
		return pdsNadminStatus;
	}

	/**
	 * Set administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 * @param pdsNadminStatus the input value
	 */
	public void  setPdsNadminStatus(Integer pdsNadminStatus) {
		this.pdsNadminStatus = pdsNadminStatus;
	}

	/**
	 * Set administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 * @param pdsNadminStatus the input value
	 * @return this instance
	 */
	public PCFPDSN withPdsNadminStatus(Integer pdsNadminStatus) {
		this.pdsNadminStatus = pdsNadminStatus;
		return this;
	}

	/**
	 * Get the reachability status of this PDSN.  0-unreachable, 1-reachable.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPdsNHealthStatus() {
		return pdsNHealthStatus;
	}

	/**
	 * Set the reachability status of this PDSN.  0-unreachable, 1-reachable.
	 *
	 * @since 2.0
	 * @param pdsNHealthStatus the input value
	 */
	public void  setPdsNHealthStatus(Long pdsNHealthStatus) {
		this.pdsNHealthStatus = pdsNHealthStatus;
	}

	/**
	 * Set the reachability status of this PDSN.  0-unreachable, 1-reachable.
	 *
	 * @since 2.0
	 * @param pdsNHealthStatus the input value
	 * @return this instance
	 */
	public PCFPDSN withPdsNHealthStatus(Long pdsNHealthStatus) {
		this.pdsNHealthStatus = pdsNHealthStatus;
		return this;
	}

	/**
	 * Get the ip address of the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getPdsNIPAddress() {
		return pdsNIPAddress;
	}

	/**
	 * Set the ip address of the PDSN.
	 *
	 * @since 2.0
	 * @param pdsNIPAddress the input value
	 */
	public void  setPdsNIPAddress(IPAddress pdsNIPAddress) {
		this.pdsNIPAddress = pdsNIPAddress;
	}

	/**
	 * Set the ip address of the PDSN.
	 *
	 * @since 2.0
	 * @param pdsNIPAddress the input value
	 * @return this instance
	 */
	public PCFPDSN withPdsNIPAddress(IPAddress pdsNIPAddress) {
		this.pdsNIPAddress = pdsNIPAddress;
		return this;
	}

	/**
	 * Get the this object is used in obtaining the A11 Session Update stats for each PDSN
	 *
	 * @return the value
	 */
	public A11SessionUpdateStats getA11SessionUpdateStats() {
		return a11SessionUpdateStats;
	}

	/**
	 * Set the this object is used in obtaining the A11 Session Update stats for each PDSN
	 *
	 * @param a11SessionUpdateStats the input value
	 */
	public void  setA11SessionUpdateStats(A11SessionUpdateStats a11SessionUpdateStats) {
		this.a11SessionUpdateStats = a11SessionUpdateStats;
	}

	/**
	 * Set the this object is used in obtaining the A11 Session Update stats for each PDSN
	 *
	 * @param a11SessionUpdateStats the input value
	 * @return this instance
	 */
	public PCFPDSN withA11SessionUpdateStats(A11SessionUpdateStats a11SessionUpdateStats) {
		this.a11SessionUpdateStats = a11SessionUpdateStats;
		return this;
	}

	/**
	 * Get the this object is used in obtaining the A11 Registration Update stats for each PDSN.
	 *
	 * @return the value
	 */
	public A11RegUpdateStats getA11RegUpdateStats() {
		return a11RegUpdateStats;
	}

	/**
	 * Set the this object is used in obtaining the A11 Registration Update stats for each PDSN.
	 *
	 * @param a11RegUpdateStats the input value
	 */
	public void  setA11RegUpdateStats(A11RegUpdateStats a11RegUpdateStats) {
		this.a11RegUpdateStats = a11RegUpdateStats;
	}

	/**
	 * Set the this object is used in obtaining the A11 Registration Update stats for each PDSN.
	 *
	 * @param a11RegUpdateStats the input value
	 * @return this instance
	 */
	public PCFPDSN withA11RegUpdateStats(A11RegUpdateStats a11RegUpdateStats) {
		this.a11RegUpdateStats = a11RegUpdateStats;
		return this;
	}

	/**
	 * Get the this object is used in obtaining the Auxillary A10 Connection stats for each PDSN
	 *
	 * @return the value
	 */
	public AuxA10Stats getAuxA10Stats() {
		return auxA10Stats;
	}

	/**
	 * Set the this object is used in obtaining the Auxillary A10 Connection stats for each PDSN
	 *
	 * @param auxA10Stats the input value
	 */
	public void  setAuxA10Stats(AuxA10Stats auxA10Stats) {
		this.auxA10Stats = auxA10Stats;
	}

	/**
	 * Set the this object is used in obtaining the Auxillary A10 Connection stats for each PDSN
	 *
	 * @param auxA10Stats the input value
	 * @return this instance
	 */
	public PCFPDSN withAuxA10Stats(AuxA10Stats auxA10Stats) {
		this.auxA10Stats = auxA10Stats;
		return this;
	}

	/**
	 * Get the this object is used in obtaining the PCF PDSN stats for each PDSN
	 *
	 * @return the value
	 */
	public PCFPDSNStats getPcfPDSNStats() {
		return pcfPDSNStats;
	}

	/**
	 * Set the this object is used in obtaining the PCF PDSN stats for each PDSN
	 *
	 * @param pcfPDSNStats the input value
	 */
	public void  setPcfPDSNStats(PCFPDSNStats pcfPDSNStats) {
		this.pcfPDSNStats = pcfPDSNStats;
	}

	/**
	 * Set the this object is used in obtaining the PCF PDSN stats for each PDSN
	 *
	 * @param pcfPDSNStats the input value
	 * @return this instance
	 */
	public PCFPDSN withPcfPDSNStats(PCFPDSNStats pcfPDSNStats) {
		this.pcfPDSNStats = pcfPDSNStats;
		return this;
	}

	//</editor-fold>

}