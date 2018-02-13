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
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.BatchPCFPDSN;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.PCFConfig;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.PCFPDSN;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.RAN;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.Redirect;
import org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.onex.Stats;

	/**
	 * This object contains parameters relating to configuring the CDMA2000 1x FAP.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.OneX.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.OneX")
@XmlType(name = "FAPService.CellConfig.CDMA2000.OneX")
@XmlAccessorType(XmlAccessType.FIELD)
public class OneX {

	/**
	 * Maximum number of entries in the {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxBatchPCFPDSNEntries")
	public Long maxBatchPCFPDSNEntries;
	/**
	 * This object contains parameters relating to RAN configuring the CDMA2000 1x FAP.
	 */
	@XmlElement(name = "RAN")
	public RAN ran;
	/**
	 * CDMA2000 1x PCF configuration information.
	 */
	@XmlElement(name = "PCFConfig")
	public PCFConfig pcfConfig;
	/**
	 * The Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0. (Refer to {{bibref|3GPP2-A.S0013}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.}}.
	 */
	@XmlElementWrapper(name = "BatchPCFPDSNs")
	@XmlElement(name = "BatchPCFPDSN")
	@CWMPParameter(access = "readWrite")
	public Collection<BatchPCFPDSN> batchPCFPDSNs;
	/**
	 * PCFPDSN Object configured for 1x. {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 */
	@XmlElementWrapper(name = "PCFPDSNs")
	@XmlElement(name = "PCFPDSN")
	@CWMPParameter(access = "readWrite")
	public Collection<PCFPDSN> pcfPDSNs;
	/**
	 * This object contains 1x FAP statistics aggregated over all connections of all users over all sectors.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;
	/**
	 * CDMA2000 1x service redirection parameters.
	 */
	@XmlElement(name = "Redirect")
	public Redirect redirect;

	public OneX() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxBatchPCFPDSNEntries() {
		return maxBatchPCFPDSNEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxBatchPCFPDSNEntries the input value
	 */
	public void  setMaxBatchPCFPDSNEntries(Long maxBatchPCFPDSNEntries) {
		this.maxBatchPCFPDSNEntries = maxBatchPCFPDSNEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxBatchPCFPDSNEntries the input value
	 * @return this instance
	 */
	public OneX withMaxBatchPCFPDSNEntries(Long maxBatchPCFPDSNEntries) {
		this.maxBatchPCFPDSNEntries = maxBatchPCFPDSNEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to RAN configuring the CDMA2000 1x FAP.
	 *
	 * @return the value
	 */
	public RAN getRan() {
		return ran;
	}

	/**
	 * Set the this object contains parameters relating to RAN configuring the CDMA2000 1x FAP.
	 *
	 * @param ran the input value
	 */
	public void  setRan(RAN ran) {
		this.ran = ran;
	}

	/**
	 * Set the this object contains parameters relating to RAN configuring the CDMA2000 1x FAP.
	 *
	 * @param ran the input value
	 * @return this instance
	 */
	public OneX withRan(RAN ran) {
		this.ran = ran;
		return this;
	}

	/**
	 * Get the cdmA2000 1x PCF configuration information.
	 *
	 * @return the value
	 */
	public PCFConfig getPcfConfig() {
		return pcfConfig;
	}

	/**
	 * Set the cdmA2000 1x PCF configuration information.
	 *
	 * @param pcfConfig the input value
	 */
	public void  setPcfConfig(PCFConfig pcfConfig) {
		this.pcfConfig = pcfConfig;
	}

	/**
	 * Set the cdmA2000 1x PCF configuration information.
	 *
	 * @param pcfConfig the input value
	 * @return this instance
	 */
	public OneX withPcfConfig(PCFConfig pcfConfig) {
		this.pcfConfig = pcfConfig;
		return this;
	}

	/**
	 * Get the Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0. (Refer to {{bibref|3GPP2-A.S0013}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.}}.
	 *
	 * @return the value
	 */
	public Collection<BatchPCFPDSN> getBatchPCFPDSNs() {
		if (this.batchPCFPDSNs == null){ this.batchPCFPDSNs=new ArrayList<>();}
		return batchPCFPDSNs;
	}

	/**
	 * Set the Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0. (Refer to {{bibref|3GPP2-A.S0013}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.}}.
	 *
	 * @param batchPCFPDSNs the input value
	 */
	public void  setBatchPCFPDSNs(Collection<BatchPCFPDSN> batchPCFPDSNs) {
		this.batchPCFPDSNs = batchPCFPDSNs;
	}

	/**
	 * Set the Batch configuration Object used to configure PDSN table using a start and end IP address. The order of the address is used as part of PDSN selection algorithm, e.g., the first element is considered PDSN number 0. (Refer to {{bibref|3GPP2-A.S0013}}). To get individual PDSN entries use the {{object|.CellConfig.CDMA2000.OneX.PCFPDSN.{i}.}}.
	 *
	 * @param batchPCFPDSN the input value
	 * @return this instance
	 */
	public OneX withBatchPCFPDSN(BatchPCFPDSN batchPCFPDSN) {
		getBatchPCFPDSNs().add(batchPCFPDSN);
		return this;
	}

	/**
	 * Get the pcfPDSN Object configured for 1x. {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 *
	 * @return the value
	 */
	public Collection<PCFPDSN> getPcfPDSNs() {
		if (this.pcfPDSNs == null){ this.pcfPDSNs=new ArrayList<>();}
		return pcfPDSNs;
	}

	/**
	 * Set the pcfPDSN Object configured for 1x. {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 *
	 * @param pcfPDSNs the input value
	 */
	public void  setPcfPDSNs(Collection<PCFPDSN> pcfPDSNs) {
		this.pcfPDSNs = pcfPDSNs;
	}

	/**
	 * Set the pcfPDSN Object configured for 1x. {{object|.CellConfig.CDMA2000.OneX.BatchPCFPDSN.{i}.}} table should be used to configure PDSN details.
	 *
	 * @param pcfPDSN the input value
	 * @return this instance
	 */
	public OneX withPCFPDSN(PCFPDSN pcfPDSN) {
		getPcfPDSNs().add(pcfPDSN);
		return this;
	}

	/**
	 * Get the this object contains 1x FAP statistics aggregated over all connections of all users over all sectors.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the this object contains 1x FAP statistics aggregated over all connections of all users over all sectors.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the this object contains 1x FAP statistics aggregated over all connections of all users over all sectors.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public OneX withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * Get the cdmA2000 1x service redirection parameters.
	 *
	 * @return the value
	 */
	public Redirect getRedirect() {
		return redirect;
	}

	/**
	 * Set the cdmA2000 1x service redirection parameters.
	 *
	 * @param redirect the input value
	 */
	public void  setRedirect(Redirect redirect) {
		this.redirect = redirect;
	}

	/**
	 * Set the cdmA2000 1x service redirection parameters.
	 *
	 * @param redirect the input value
	 * @return this instance
	 */
	public OneX withRedirect(Redirect redirect) {
		this.redirect = redirect;
		return this;
	}

	//</editor-fold>

}