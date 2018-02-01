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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.datatypes.Alias;
import org.broadbandforum.tr196.datatypes.IPAddress;

	/**
	 * The Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0 (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.")
public class BatchPCFPDSN {

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
	 * The BatchTable Number should be given only once during the creation of a Batch Table. This is the Key Attribute that uniquely identifies a BatchTable entry
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BatchTableNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 127)
	public Integer batchTableNumber = 0;
	/**
	 * Start IP address of the range of PDSNs
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BatchTableStartIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress batchTableStartIPAddress;
	/**
	 * End IP address of the range of PDSNs
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BatchTableEndIPAddress")
	@CWMPParameter(access = "readWrite")
	public IPAddress batchTableEndIPAddress;
	/**
	 * Security Parameter Index to be used
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BatchTableSecurityParameterIndex")
	@CWMPParameter(access = "readWrite")
	@Size(min = 256, max = -1)
	public Long batchTableSecurityParameterIndex = 0L;
	/**
	 * Secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BatchTableSecretKey")
	@CWMPParameter(access = "readWrite")
	public byte[] batchTableSecretKey;
	/**
	 * HRPD IOS Version of this PDSN
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BatchTableIOSVersion")
	@CWMPParameter(access = "readWrite")
	public String batchTableIOSVersion = "TIA-878-a";
	/**
	 * Administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "BatchTablePDSNAdminStatus")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 1)
	public Integer batchTablePDSNAdminStatus = 0;
	/**
	 * Indicates the PDSN type for this batch.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PDSNType")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	public String pdsNType = "HRPD RevA";

	public BatchPCFPDSN() {
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
	public BatchPCFPDSN withEnable(Boolean enable) {
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
	public BatchPCFPDSN withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the BatchTable Number should be given only once during the creation of a Batch Table. This is the Key Attribute that uniquely identifies a BatchTable entry
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBatchTableNumber() {
		return batchTableNumber;
	}

	/**
	 * Set the BatchTable Number should be given only once during the creation of a Batch Table. This is the Key Attribute that uniquely identifies a BatchTable entry
	 *
	 * @since 2.0
	 * @param batchTableNumber the input value
	 */
	public void  setBatchTableNumber(Integer batchTableNumber) {
		this.batchTableNumber = batchTableNumber;
	}

	/**
	 * Set the BatchTable Number should be given only once during the creation of a Batch Table. This is the Key Attribute that uniquely identifies a BatchTable entry
	 *
	 * @since 2.0
	 * @param batchTableNumber the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withBatchTableNumber(Integer batchTableNumber) {
		this.batchTableNumber = batchTableNumber;
		return this;
	}

	/**
	 * Get the start IP address of the range of PDSNs
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getBatchTableStartIPAddress() {
		return batchTableStartIPAddress;
	}

	/**
	 * Set the start IP address of the range of PDSNs
	 *
	 * @since 2.0
	 * @param batchTableStartIPAddress the input value
	 */
	public void  setBatchTableStartIPAddress(IPAddress batchTableStartIPAddress) {
		this.batchTableStartIPAddress = batchTableStartIPAddress;
	}

	/**
	 * Set the start IP address of the range of PDSNs
	 *
	 * @since 2.0
	 * @param batchTableStartIPAddress the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withBatchTableStartIPAddress(IPAddress batchTableStartIPAddress) {
		this.batchTableStartIPAddress = batchTableStartIPAddress;
		return this;
	}

	/**
	 * Get the end IP address of the range of PDSNs
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getBatchTableEndIPAddress() {
		return batchTableEndIPAddress;
	}

	/**
	 * Set the end IP address of the range of PDSNs
	 *
	 * @since 2.0
	 * @param batchTableEndIPAddress the input value
	 */
	public void  setBatchTableEndIPAddress(IPAddress batchTableEndIPAddress) {
		this.batchTableEndIPAddress = batchTableEndIPAddress;
	}

	/**
	 * Set the end IP address of the range of PDSNs
	 *
	 * @since 2.0
	 * @param batchTableEndIPAddress the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withBatchTableEndIPAddress(IPAddress batchTableEndIPAddress) {
		this.batchTableEndIPAddress = batchTableEndIPAddress;
		return this;
	}

	/**
	 * Get the security Parameter Index to be used
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getBatchTableSecurityParameterIndex() {
		return batchTableSecurityParameterIndex;
	}

	/**
	 * Set the security Parameter Index to be used
	 *
	 * @since 2.0
	 * @param batchTableSecurityParameterIndex the input value
	 */
	public void  setBatchTableSecurityParameterIndex(Long batchTableSecurityParameterIndex) {
		this.batchTableSecurityParameterIndex = batchTableSecurityParameterIndex;
	}

	/**
	 * Set the security Parameter Index to be used
	 *
	 * @since 2.0
	 * @param batchTableSecurityParameterIndex the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withBatchTableSecurityParameterIndex(Long batchTableSecurityParameterIndex) {
		this.batchTableSecurityParameterIndex = batchTableSecurityParameterIndex;
		return this;
	}

	/**
	 * Get the secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public byte[] getBatchTableSecretKey() {
		return batchTableSecretKey;
	}

	/**
	 * Set the secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 * @param batchTableSecretKey the input value
	 */
	public void  setBatchTableSecretKey(byte[] batchTableSecretKey) {
		this.batchTableSecretKey = batchTableSecretKey;
	}

	/**
	 * Set the secret key in 32-digit hexidecimal representation.
	 *
	 * @since 2.0
	 * @param batchTableSecretKey the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withBatchTableSecretKey(byte[] batchTableSecretKey) {
		this.batchTableSecretKey = batchTableSecretKey;
		return this;
	}

	/**
	 * Get the hrpD IOS Version of this PDSN
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getBatchTableIOSVersion() {
		return batchTableIOSVersion;
	}

	/**
	 * Set the hrpD IOS Version of this PDSN
	 *
	 * @since 2.0
	 * @param batchTableIOSVersion the input value
	 */
	public void  setBatchTableIOSVersion(String batchTableIOSVersion) {
		this.batchTableIOSVersion = batchTableIOSVersion;
	}

	/**
	 * Set the hrpD IOS Version of this PDSN
	 *
	 * @since 2.0
	 * @param batchTableIOSVersion the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withBatchTableIOSVersion(String batchTableIOSVersion) {
		this.batchTableIOSVersion = batchTableIOSVersion;
		return this;
	}

	/**
	 * Get administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getBatchTablePDSNAdminStatus() {
		return batchTablePDSNAdminStatus;
	}

	/**
	 * Set administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 * @param batchTablePDSNAdminStatus the input value
	 */
	public void  setBatchTablePDSNAdminStatus(Integer batchTablePDSNAdminStatus) {
		this.batchTablePDSNAdminStatus = batchTablePDSNAdminStatus;
	}

	/**
	 * Set administrative status of this PDSN.  0- UP 1-DOWN.
	 *
	 * @since 2.0
	 * @param batchTablePDSNAdminStatus the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withBatchTablePDSNAdminStatus(Integer batchTablePDSNAdminStatus) {
		this.batchTablePDSNAdminStatus = batchTablePDSNAdminStatus;
		return this;
	}

	/**
	 * Get the indicates the PDSN type for this batch.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPdsNType() {
		return pdsNType;
	}

	/**
	 * Set the indicates the PDSN type for this batch.
	 *
	 * @since 2.0
	 * @param pdsNType the input value
	 */
	public void  setPdsNType(String pdsNType) {
		this.pdsNType = pdsNType;
	}

	/**
	 * Set the indicates the PDSN type for this batch.
	 *
	 * @since 2.0
	 * @param pdsNType the input value
	 * @return this instance
	 */
	public BatchPCFPDSN withPdsNType(String pdsNType) {
		this.pdsNType = pdsNType;
		return this;
	}

	//</editor-fold>

}