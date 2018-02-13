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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.AccessAuthConfig;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.AccessAuthStats;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.BatchPCFPDSN;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.CallControlStats;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.PCFConfig;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.PCFPDSN;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.QoSStats;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.RAN;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.RNCSigAppsStats;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd.Redirect;

	/**
	 * The object contains attributes related to HRPD.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.")
@XmlRootElement(name = "HRPD")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD")
@XmlAccessorType(XmlAccessType.FIELD)
public class HRPD {

	/**
	 * Maximum number of entries in the {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBatchPCFPDSNEntries")
	public Long maxBatchPCFPDSNEntries;
	/**
	 * The object contains attributes related to HRPD RAN.
	 */
	@XmlElement(name = "RAN")
	public RAN ran;
	/**
	 * CDMA2000 HRPD PCF configuration parameters.
	 */
	@XmlElement(name = "PCFConfig")
	public PCFConfig pcfConfig;
	/**
	 * The Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0 (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.}}.
	 */
	@XmlElementWrapper(name = "BatchPCFPDSNs")
	@XmlElement(name = "BatchPCFPDSN")
	@CWMPParameter(access = "readWrite")
	public Collection<BatchPCFPDSN> batchPCFPDSNs;
	/**
	 * PCFPDSN Object configured for HRPD. {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 */
	@XmlElementWrapper(name = "PCFPDSNs")
	@XmlElement(name = "PCFPDSN")
	@CWMPParameter(access = "readWrite")
	public Collection<PCFPDSN> pcfPDSNs;
	/**
	 * CDMA2000 HRPD service redirection parameters.
	 */
	@XmlElement(name = "Redirect")
	public Redirect redirect;
	/**
	 * Details on call control stats
	 */
	@XmlElement(name = "CallControlStats")
	public CallControlStats callControlStats;
	/**
	 * This object is used in obtaining the QoS Common Performance stats
	 */
	@XmlElement(name = "QoSStats")
	public QoSStats qosStats;
	/**
	 * Stats for HRPD RNC signaling procedures.
	 */
	@XmlElement(name = "RNCSigAppsStats")
	public RNCSigAppsStats rncSigAppsStats;
	/**
	 * HRPD A12-related service stats.
	 */
	@XmlElement(name = "AccessAuthConfig")
	public AccessAuthConfig accessAuthConfig;
	/**
	 * This object is used in obtaining the Access Authentication related stats.
	 */
	@XmlElement(name = "AccessAuthStats")
	public AccessAuthStats accessAuthStats;

	public HRPD() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBatchPCFPDSNEntries() {
		return maxBatchPCFPDSNEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxBatchPCFPDSNEntries the input value
	 */
	public void  setMaxBatchPCFPDSNEntries(Long maxBatchPCFPDSNEntries) {
		this.maxBatchPCFPDSNEntries = maxBatchPCFPDSNEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxBatchPCFPDSNEntries the input value
	 * @return this instance
	 */
	public HRPD withMaxBatchPCFPDSNEntries(Long maxBatchPCFPDSNEntries) {
		this.maxBatchPCFPDSNEntries = maxBatchPCFPDSNEntries;
		return this;
	}

	/**
	 * Get the object contains attributes related to HRPD RAN.
	 *
	 * @return the value
	 */
	public RAN getRan() {
		return ran;
	}

	/**
	 * Set the object contains attributes related to HRPD RAN.
	 *
	 * @param ran the input value
	 */
	public void  setRan(RAN ran) {
		this.ran = ran;
	}

	/**
	 * Set the object contains attributes related to HRPD RAN.
	 *
	 * @param ran the input value
	 * @return this instance
	 */
	public HRPD withRan(RAN ran) {
		this.ran = ran;
		return this;
	}

	/**
	 * Get the cdmA2000 HRPD PCF configuration parameters.
	 *
	 * @return the value
	 */
	public PCFConfig getPcfConfig() {
		return pcfConfig;
	}

	/**
	 * Set the cdmA2000 HRPD PCF configuration parameters.
	 *
	 * @param pcfConfig the input value
	 */
	public void  setPcfConfig(PCFConfig pcfConfig) {
		this.pcfConfig = pcfConfig;
	}

	/**
	 * Set the cdmA2000 HRPD PCF configuration parameters.
	 *
	 * @param pcfConfig the input value
	 * @return this instance
	 */
	public HRPD withPcfConfig(PCFConfig pcfConfig) {
		this.pcfConfig = pcfConfig;
		return this;
	}

	/**
	 * Get the Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0 (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.}}.
	 *
	 * @return the value
	 */
	public Collection<BatchPCFPDSN> getBatchPCFPDSNs() {
		if (this.batchPCFPDSNs == null){ this.batchPCFPDSNs=new ArrayList<>();}
		return batchPCFPDSNs;
	}

	/**
	 * Set the Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0 (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.}}.
	 *
	 * @param batchPCFPDSNs the input value
	 */
	public void  setBatchPCFPDSNs(Collection<BatchPCFPDSN> batchPCFPDSNs) {
		this.batchPCFPDSNs = batchPCFPDSNs;
	}

	/**
	 * Set the Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0 (refer to {{bibref|3GPP2-A.S0008}} and {{bibref|3GPP2-A.S0009}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.}}.
	 *
	 * @param batchPCFPDSN the input value
	 * @return this instance
	 */
	public HRPD withBatchPCFPDSN(BatchPCFPDSN batchPCFPDSN) {
		getBatchPCFPDSNs().add(batchPCFPDSN);
		return this;
	}

	/**
	 * Get the pcfPDSN Object configured for HRPD. {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 *
	 * @return the value
	 */
	public Collection<PCFPDSN> getPcfPDSNs() {
		if (this.pcfPDSNs == null){ this.pcfPDSNs=new ArrayList<>();}
		return pcfPDSNs;
	}

	/**
	 * Set the pcfPDSN Object configured for HRPD. {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 *
	 * @param pcfPDSNs the input value
	 */
	public void  setPcfPDSNs(Collection<PCFPDSN> pcfPDSNs) {
		this.pcfPDSNs = pcfPDSNs;
	}

	/**
	 * Set the pcfPDSN Object configured for HRPD. {{object|.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 *
	 * @param pcfPDSN the input value
	 * @return this instance
	 */
	public HRPD withPCFPDSN(PCFPDSN pcfPDSN) {
		getPcfPDSNs().add(pcfPDSN);
		return this;
	}

	/**
	 * Get the cdmA2000 HRPD service redirection parameters.
	 *
	 * @return the value
	 */
	public Redirect getRedirect() {
		return redirect;
	}

	/**
	 * Set the cdmA2000 HRPD service redirection parameters.
	 *
	 * @param redirect the input value
	 */
	public void  setRedirect(Redirect redirect) {
		this.redirect = redirect;
	}

	/**
	 * Set the cdmA2000 HRPD service redirection parameters.
	 *
	 * @param redirect the input value
	 * @return this instance
	 */
	public HRPD withRedirect(Redirect redirect) {
		this.redirect = redirect;
		return this;
	}

	/**
	 * Get the details on call control stats
	 *
	 * @return the value
	 */
	public CallControlStats getCallControlStats() {
		return callControlStats;
	}

	/**
	 * Set the details on call control stats
	 *
	 * @param callControlStats the input value
	 */
	public void  setCallControlStats(CallControlStats callControlStats) {
		this.callControlStats = callControlStats;
	}

	/**
	 * Set the details on call control stats
	 *
	 * @param callControlStats the input value
	 * @return this instance
	 */
	public HRPD withCallControlStats(CallControlStats callControlStats) {
		this.callControlStats = callControlStats;
		return this;
	}

	/**
	 * Get the this object is used in obtaining the QoS Common Performance stats
	 *
	 * @return the value
	 */
	public QoSStats getQosStats() {
		return qosStats;
	}

	/**
	 * Set the this object is used in obtaining the QoS Common Performance stats
	 *
	 * @param qosStats the input value
	 */
	public void  setQosStats(QoSStats qosStats) {
		this.qosStats = qosStats;
	}

	/**
	 * Set the this object is used in obtaining the QoS Common Performance stats
	 *
	 * @param qosStats the input value
	 * @return this instance
	 */
	public HRPD withQosStats(QoSStats qosStats) {
		this.qosStats = qosStats;
		return this;
	}

	/**
	 * Get the stats for HRPD RNC signaling procedures.
	 *
	 * @return the value
	 */
	public RNCSigAppsStats getRncSigAppsStats() {
		return rncSigAppsStats;
	}

	/**
	 * Set the stats for HRPD RNC signaling procedures.
	 *
	 * @param rncSigAppsStats the input value
	 */
	public void  setRncSigAppsStats(RNCSigAppsStats rncSigAppsStats) {
		this.rncSigAppsStats = rncSigAppsStats;
	}

	/**
	 * Set the stats for HRPD RNC signaling procedures.
	 *
	 * @param rncSigAppsStats the input value
	 * @return this instance
	 */
	public HRPD withRncSigAppsStats(RNCSigAppsStats rncSigAppsStats) {
		this.rncSigAppsStats = rncSigAppsStats;
		return this;
	}

	/**
	 * Get the hrpD A12-related service stats.
	 *
	 * @return the value
	 */
	public AccessAuthConfig getAccessAuthConfig() {
		return accessAuthConfig;
	}

	/**
	 * Set the hrpD A12-related service stats.
	 *
	 * @param accessAuthConfig the input value
	 */
	public void  setAccessAuthConfig(AccessAuthConfig accessAuthConfig) {
		this.accessAuthConfig = accessAuthConfig;
	}

	/**
	 * Set the hrpD A12-related service stats.
	 *
	 * @param accessAuthConfig the input value
	 * @return this instance
	 */
	public HRPD withAccessAuthConfig(AccessAuthConfig accessAuthConfig) {
		this.accessAuthConfig = accessAuthConfig;
		return this;
	}

	/**
	 * Get the this object is used in obtaining the Access Authentication related stats.
	 *
	 * @return the value
	 */
	public AccessAuthStats getAccessAuthStats() {
		return accessAuthStats;
	}

	/**
	 * Set the this object is used in obtaining the Access Authentication related stats.
	 *
	 * @param accessAuthStats the input value
	 */
	public void  setAccessAuthStats(AccessAuthStats accessAuthStats) {
		this.accessAuthStats = accessAuthStats;
	}

	/**
	 * Set the this object is used in obtaining the Access Authentication related stats.
	 *
	 * @param accessAuthStats the input value
	 * @return this instance
	 */
	public HRPD withAccessAuthStats(AccessAuthStats accessAuthStats) {
		this.accessAuthStats = accessAuthStats;
		return this;
	}

	//</editor-fold>

}