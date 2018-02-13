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
package org.broadbandforum.tr196.fapservice.cellconfig.umts.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to cell selection and reselection.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.CellSelection.")
@XmlRootElement(name = "CellSelection")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.CellSelection")
@XmlAccessorType(XmlAccessType.FIELD)
public class CellSelection {

	/**
	 * Which mechanism to use when doing CPICH quality measurements. {{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QualityMeasureCPICH")
	@CWMPParameter(access = "readWrite")
	public String qualityMeasureCPICH;
	/**
	 * Minimum required quality measure, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QqualMin")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -24, max = 0)
	public Integer qqualMin;
	/**
	 * Offset for {{param|QqualMin}} specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QqualMinOffset")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 1, max = 16)
	public Long qqualMinOffset = 1L;
	/**
	 * Minimum required RX level in the cell, specified in dBm. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only odd values are valid, use of an even value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QRxLevMin")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -115, max = -25)
	public Integer qrxLevMin;
	/**
	 * Delta for the minimum required RX level in the cell, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

The actual value of {{param|QRxLevMin}} = {{param|QRxLevMin}} + {{param}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaQRxLevMin")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -2, max = -2)
	public Integer deltaQRxLevMin;
	/**
	 * Offset for {{param|QRxLevMin}}, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QRxLevMinOffset")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 16, max = 16)
	public Long qrxLevMinOffset = 2L;
	/**
	 * GSM and FDD Cell reselection hysteresis 1. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QHyst1s")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 40)
	public Long qhyst1s;
	/**
	 * FDD Cell reselection hysteresis 2. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.

By default when {{param|QHyst1s}} is set and {{param}} is not, then the value for {{param}} SHOULD match the value of {{param|QHyst1s}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QHyst2s")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 40)
	public Long qhyst2s;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

A UE triggers the reselection of a new cell if the cell reselection criteria are fulfilled during the time interval in seconds.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselections")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 31)
	public Long treselections;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the threshold for intra-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SIntrasearch")
	@CWMPParameter(access = "readWrite")
	@Size(min = -32, max = 20)
	public Integer sintrasearch;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the threshold for inter-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SIntersearch")
	@CWMPParameter(access = "readWrite")
	@Size(min = -32, max = 20)
	public Integer sintersearch;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the threshold for intrafrequency and interfrequency measurement rules in HCS.

Below this limit in the serving cell, the UE initiates measurements of all intrafrequency and interfrequency neighbouring cells of the serving cell.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSearchHCS")
	@CWMPParameter(access = "readWrite")
	@Size(min = -105, max = 91)
	public Integer ssearchHCS;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSearchRAT")
	@CWMPParameter(access = "readWrite")
	@Size(min = -32, max = 20)
	public Integer ssearchRAT;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules in HCS.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SHCSRAT")
	@CWMPParameter(access = "readWrite")
	@Size(min = -105, max = 91)
	public Integer shcSRAT;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the threshold for skipping inter-RAT measurement rules in HCS. Above this RAT (GSM) specific threshold in the serving UTRA cell, the UE does not need to perform any inter-RAT measurements.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SLimitSearchRAT")
	@CWMPParameter(access = "readWrite")
	@Size(min = -32, max = 20)
	public Integer slimitSearchRAT;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NonHCSNCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NonHCSTCRMax")
	@CWMPParameter(access = "readWrite")
	public String nonHCSTCRMax;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|NonHCSTCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NonHCSNCR")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 16)
	public Long nonHCSNCR;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param|TCRMaxHyst}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NonHCSTCRMaxHyst")
	@CWMPParameter(access = "readWrite")
	public String nonHCSTCRMaxHyst;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the quality threshold levels for applying prioritised hierarchical cell reselection.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12 and Section 10.3.7.54a}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QHCS")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 99)
	public Long qhcS = 0L;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Indicate whether HCS is used in this cell or not.

{{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UseOfHCS")
	@CWMPParameter(access = "readWrite")
	public Boolean useOfHCS;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the HCS priority of this cell.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HCSPrio")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long hcsPrio = 0L;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCRMax")
	@CWMPParameter(access = "readWrite")
	public String tcrMax;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|TCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NCR")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 16)
	public Long ncr;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TCRMaxHyst")
	@CWMPParameter(access = "readWrite")
	public String tcrMaxHyst;
	/**
	 * A member of the set of parameters used for cell reselection functionality.

Defines the maximum transmit power level, specified in dBm, that an UE MAY use when accessing the cell on RACH. Used to calculate Pcompensation, which is: max(UE_TXPWR_MAX_RACH - P_MAX, 0), where UE_TXPWR_MAX_RACH is {{param}} and P_MAX is the max transmit power for a UE.

{{bibref|3GPP-TS.25.331|Section 10.3.2.3}} {{bibref|3GPP-TS.25.304|Section 5.2.3}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "UETxPwrMaxRACH")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -50, max = 33)
	public Integer uetxPwrMaxRACH;

	public CellSelection() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the which mechanism to use when doing CPICH quality measurements. {{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getQualityMeasureCPICH() {
		return qualityMeasureCPICH;
	}

	/**
	 * Set the which mechanism to use when doing CPICH quality measurements. {{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 * @param qualityMeasureCPICH the input value
	 */
	public void  setQualityMeasureCPICH(String qualityMeasureCPICH) {
		this.qualityMeasureCPICH = qualityMeasureCPICH;
	}

	/**
	 * Set the which mechanism to use when doing CPICH quality measurements. {{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 * @param qualityMeasureCPICH the input value
	 * @return this instance
	 */
	public CellSelection withQualityMeasureCPICH(String qualityMeasureCPICH) {
		this.qualityMeasureCPICH = qualityMeasureCPICH;
		return this;
	}

	/**
	 * Get the minimum required quality measure, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getQqualMin() {
		return qqualMin;
	}

	/**
	 * Set the minimum required quality measure, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qqualMin the input value
	 */
	public void  setQqualMin(Integer qqualMin) {
		this.qqualMin = qqualMin;
	}

	/**
	 * Set the minimum required quality measure, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qqualMin the input value
	 * @return this instance
	 */
	public CellSelection withQqualMin(Integer qqualMin) {
		this.qqualMin = qqualMin;
		return this;
	}

	/**
	 * Get the offset for {{param|QqualMin}} specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQqualMinOffset() {
		return qqualMinOffset;
	}

	/**
	 * Set the offset for {{param|QqualMin}} specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qqualMinOffset the input value
	 */
	public void  setQqualMinOffset(Long qqualMinOffset) {
		this.qqualMinOffset = qqualMinOffset;
	}

	/**
	 * Set the offset for {{param|QqualMin}} specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|Ec/No|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qqualMinOffset the input value
	 * @return this instance
	 */
	public CellSelection withQqualMinOffset(Long qqualMinOffset) {
		this.qqualMinOffset = qqualMinOffset;
		return this;
	}

	/**
	 * Get the minimum required RX level in the cell, specified in dBm. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only odd values are valid, use of an even value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getQrxLevMin() {
		return qrxLevMin;
	}

	/**
	 * Set the minimum required RX level in the cell, specified in dBm. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only odd values are valid, use of an even value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qrxLevMin the input value
	 */
	public void  setQrxLevMin(Integer qrxLevMin) {
		this.qrxLevMin = qrxLevMin;
	}

	/**
	 * Set the minimum required RX level in the cell, specified in dBm. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only odd values are valid, use of an even value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qrxLevMin the input value
	 * @return this instance
	 */
	public CellSelection withQrxLevMin(Integer qrxLevMin) {
		this.qrxLevMin = qrxLevMin;
		return this;
	}

	/**
	 * Get the delta for the minimum required RX level in the cell, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

The actual value of {{param|QRxLevMin}} = {{param|QRxLevMin}} + {{param}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDeltaQRxLevMin() {
		return deltaQRxLevMin;
	}

	/**
	 * Set the delta for the minimum required RX level in the cell, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

The actual value of {{param|QRxLevMin}} = {{param|QRxLevMin}} + {{param}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param deltaQRxLevMin the input value
	 */
	public void  setDeltaQRxLevMin(Integer deltaQRxLevMin) {
		this.deltaQRxLevMin = deltaQRxLevMin;
	}

	/**
	 * Set the delta for the minimum required RX level in the cell, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3 and Section 10.3.2.4}}

The actual value of {{param|QRxLevMin}} = {{param|QRxLevMin}} + {{param}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param deltaQRxLevMin the input value
	 * @return this instance
	 */
	public CellSelection withDeltaQRxLevMin(Integer deltaQRxLevMin) {
		this.deltaQRxLevMin = deltaQRxLevMin;
		return this;
	}

	/**
	 * Get the offset for {{param|QRxLevMin}}, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQrxLevMinOffset() {
		return qrxLevMinOffset;
	}

	/**
	 * Set the offset for {{param|QRxLevMin}}, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qrxLevMinOffset the input value
	 */
	public void  setQrxLevMinOffset(Long qrxLevMinOffset) {
		this.qrxLevMinOffset = qrxLevMinOffset;
	}

	/**
	 * Set the offset for {{param|QRxLevMin}}, specified in dB. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qrxLevMinOffset the input value
	 * @return this instance
	 */
	public CellSelection withQrxLevMinOffset(Long qrxLevMinOffset) {
		this.qrxLevMinOffset = qrxLevMinOffset;
		return this;
	}

	/**
	 * Get the gsm and FDD Cell reselection hysteresis 1. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQhyst1s() {
		return qhyst1s;
	}

	/**
	 * Set the gsm and FDD Cell reselection hysteresis 1. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qhyst1s the input value
	 */
	public void  setQhyst1s(Long qhyst1s) {
		this.qhyst1s = qhyst1s;
	}

	/**
	 * Set the gsm and FDD Cell reselection hysteresis 1. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.
	 *
	 * @since 2.0
	 * @param qhyst1s the input value
	 * @return this instance
	 */
	public CellSelection withQhyst1s(Long qhyst1s) {
		this.qhyst1s = qhyst1s;
		return this;
	}

	/**
	 * Get the fdd Cell reselection hysteresis 2. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.

By default when {{param|QHyst1s}} is set and {{param}} is not, then the value for {{param}} SHOULD match the value of {{param|QHyst1s}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQhyst2s() {
		return qhyst2s;
	}

	/**
	 * Set the fdd Cell reselection hysteresis 2. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.

By default when {{param|QHyst1s}} is set and {{param}} is not, then the value for {{param}} SHOULD match the value of {{param|QHyst1s}}.
	 *
	 * @since 2.0
	 * @param qhyst2s the input value
	 */
	public void  setQhyst2s(Long qhyst2s) {
		this.qhyst2s = qhyst2s;
	}

	/**
	 * Set the fdd Cell reselection hysteresis 2. {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}

Only even values are valid, use of an odd value MUST be rejected by the CPE.

This value is only meaningful if {{param|QualityMeasureCPICH}} has the value {{enum|RSCP|QualityMeasureCPICH}} and it MUST otherwise be ignored.

By default when {{param|QHyst1s}} is set and {{param}} is not, then the value for {{param}} SHOULD match the value of {{param|QHyst1s}}.
	 *
	 * @since 2.0
	 * @param qhyst2s the input value
	 * @return this instance
	 */
	public CellSelection withQhyst2s(Long qhyst2s) {
		this.qhyst2s = qhyst2s;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

A UE triggers the reselection of a new cell if the cell reselection criteria are fulfilled during the time interval in seconds.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselections() {
		return treselections;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

A UE triggers the reselection of a new cell if the cell reselection criteria are fulfilled during the time interval in seconds.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param treselections the input value
	 */
	public void  setTreselections(Long treselections) {
		this.treselections = treselections;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

A UE triggers the reselection of a new cell if the cell reselection criteria are fulfilled during the time interval in seconds.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param treselections the input value
	 * @return this instance
	 */
	public CellSelection withTreselections(Long treselections) {
		this.treselections = treselections;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the threshold for intra-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSintrasearch() {
		return sintrasearch;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for intra-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param sintrasearch the input value
	 */
	public void  setSintrasearch(Integer sintrasearch) {
		this.sintrasearch = sintrasearch;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for intra-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param sintrasearch the input value
	 * @return this instance
	 */
	public CellSelection withSintrasearch(Integer sintrasearch) {
		this.sintrasearch = sintrasearch;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the threshold for inter-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSintersearch() {
		return sintersearch;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for inter-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param sintersearch the input value
	 */
	public void  setSintersearch(Integer sintersearch) {
		this.sintersearch = sintersearch;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for inter-frequency measurements, and for the HCS measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param sintersearch the input value
	 * @return this instance
	 */
	public CellSelection withSintersearch(Integer sintersearch) {
		this.sintersearch = sintersearch;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the threshold for intrafrequency and interfrequency measurement rules in HCS.

Below this limit in the serving cell, the UE initiates measurements of all intrafrequency and interfrequency neighbouring cells of the serving cell.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSsearchHCS() {
		return ssearchHCS;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for intrafrequency and interfrequency measurement rules in HCS.

Below this limit in the serving cell, the UE initiates measurements of all intrafrequency and interfrequency neighbouring cells of the serving cell.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param ssearchHCS the input value
	 */
	public void  setSsearchHCS(Integer ssearchHCS) {
		this.ssearchHCS = ssearchHCS;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for intrafrequency and interfrequency measurement rules in HCS.

Below this limit in the serving cell, the UE initiates measurements of all intrafrequency and interfrequency neighbouring cells of the serving cell.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param ssearchHCS the input value
	 * @return this instance
	 */
	public CellSelection withSsearchHCS(Integer ssearchHCS) {
		this.ssearchHCS = ssearchHCS;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSsearchRAT() {
		return ssearchRAT;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param ssearchRAT the input value
	 */
	public void  setSsearchRAT(Integer ssearchRAT) {
		this.ssearchRAT = ssearchRAT;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param ssearchRAT the input value
	 * @return this instance
	 */
	public CellSelection withSsearchRAT(Integer ssearchRAT) {
		this.ssearchRAT = ssearchRAT;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules in HCS.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getShcSRAT() {
		return shcSRAT;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules in HCS.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param shcSRAT the input value
	 */
	public void  setShcSRAT(Integer shcSRAT) {
		this.shcSRAT = shcSRAT;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the RAT (GSM) specific threshold for inter-RAT measurement rules in HCS.

Only odd values are valid, use of an even value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param shcSRAT the input value
	 * @return this instance
	 */
	public CellSelection withShcSRAT(Integer shcSRAT) {
		this.shcSRAT = shcSRAT;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the threshold for skipping inter-RAT measurement rules in HCS. Above this RAT (GSM) specific threshold in the serving UTRA cell, the UE does not need to perform any inter-RAT measurements.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getSlimitSearchRAT() {
		return slimitSearchRAT;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for skipping inter-RAT measurement rules in HCS. Above this RAT (GSM) specific threshold in the serving UTRA cell, the UE does not need to perform any inter-RAT measurements.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param slimitSearchRAT the input value
	 */
	public void  setSlimitSearchRAT(Integer slimitSearchRAT) {
		this.slimitSearchRAT = slimitSearchRAT;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the threshold for skipping inter-RAT measurement rules in HCS. Above this RAT (GSM) specific threshold in the serving UTRA cell, the UE does not need to perform any inter-RAT measurements.

Only even values are valid, use of an odd value MUST be rejected by the CPE.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param slimitSearchRAT the input value
	 * @return this instance
	 */
	public CellSelection withSlimitSearchRAT(Integer slimitSearchRAT) {
		this.slimitSearchRAT = slimitSearchRAT;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NonHCSNCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNonHCSTCRMax() {
		return nonHCSTCRMax;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NonHCSNCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param nonHCSTCRMax the input value
	 */
	public void  setNonHCSTCRMax(String nonHCSTCRMax) {
		this.nonHCSTCRMax = nonHCSTCRMax;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NonHCSNCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param nonHCSTCRMax the input value
	 * @return this instance
	 */
	public CellSelection withNonHCSTCRMax(String nonHCSTCRMax) {
		this.nonHCSTCRMax = nonHCSTCRMax;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|NonHCSTCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNonHCSNCR() {
		return nonHCSNCR;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|NonHCSTCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param nonHCSNCR the input value
	 */
	public void  setNonHCSNCR(Long nonHCSNCR) {
		this.nonHCSNCR = nonHCSNCR;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|NonHCSTCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param nonHCSNCR the input value
	 * @return this instance
	 */
	public CellSelection withNonHCSNCR(Long nonHCSNCR) {
		this.nonHCSNCR = nonHCSNCR;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param|TCRMaxHyst}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getNonHCSTCRMaxHyst() {
		return nonHCSTCRMaxHyst;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param|TCRMaxHyst}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param nonHCSTCRMaxHyst the input value
	 */
	public void  setNonHCSTCRMaxHyst(String nonHCSTCRMaxHyst) {
		this.nonHCSTCRMaxHyst = nonHCSTCRMaxHyst;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param|TCRMaxHyst}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.2.3}}.
	 *
	 * @since 2.0
	 * @param nonHCSTCRMaxHyst the input value
	 * @return this instance
	 */
	public CellSelection withNonHCSTCRMaxHyst(String nonHCSTCRMaxHyst) {
		this.nonHCSTCRMaxHyst = nonHCSTCRMaxHyst;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the quality threshold levels for applying prioritised hierarchical cell reselection.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12 and Section 10.3.7.54a}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQhcS() {
		return qhcS;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the quality threshold levels for applying prioritised hierarchical cell reselection.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12 and Section 10.3.7.54a}}
	 *
	 * @since 2.0
	 * @param qhcS the input value
	 */
	public void  setQhcS(Long qhcS) {
		this.qhcS = qhcS;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the quality threshold levels for applying prioritised hierarchical cell reselection.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12 and Section 10.3.7.54a}}
	 *
	 * @since 2.0
	 * @param qhcS the input value
	 * @return this instance
	 */
	public CellSelection withQhcS(Long qhcS) {
		this.qhcS = qhcS;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Indicate whether HCS is used in this cell or not.

{{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUseOfHCS() {
		return useOfHCS;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Indicate whether HCS is used in this cell or not.

{{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 * @param useOfHCS the input value
	 */
	public void  setUseOfHCS(Boolean useOfHCS) {
		this.useOfHCS = useOfHCS;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Indicate whether HCS is used in this cell or not.

{{bibref|3GPP-TS.25.331|Section 10.3.7.47}}
	 *
	 * @since 2.0
	 * @param useOfHCS the input value
	 * @return this instance
	 */
	public CellSelection withUseOfHCS(Boolean useOfHCS) {
		this.useOfHCS = useOfHCS;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the HCS priority of this cell.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getHcsPrio() {
		return hcsPrio;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the HCS priority of this cell.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12}}
	 *
	 * @since 2.0
	 * @param hcsPrio the input value
	 */
	public void  setHcsPrio(Long hcsPrio) {
		this.hcsPrio = hcsPrio;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the HCS priority of this cell.

{{bibref|3GPP-TS.25.331|Section 10.3.7.12}}
	 *
	 * @since 2.0
	 * @param hcsPrio the input value
	 * @return this instance
	 */
	public CellSelection withHcsPrio(Long hcsPrio) {
		this.hcsPrio = hcsPrio;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTcrMax() {
		return tcrMax;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @param tcrMax the input value
	 */
	public void  setTcrMax(String tcrMax) {
		this.tcrMax = tcrMax;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the duration in seconds for evaluating the allowed amount of cell reselections. If the number of cell reselections during the time period defined by {{param}} exceeds {{param|NCR}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @param tcrMax the input value
	 * @return this instance
	 */
	public CellSelection withTcrMax(String tcrMax) {
		this.tcrMax = tcrMax;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|TCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNcr() {
		return ncr;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|TCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @param ncr the input value
	 */
	public void  setNcr(Long ncr) {
		this.ncr = ncr;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the maximum number of cell reselections. If the number of cell reselections during the {{param|TCRMax}} time period exceeds the value of {{param}}, high mobility has been detected.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @param ncr the input value
	 * @return this instance
	 */
	public CellSelection withNcr(Long ncr) {
		this.ncr = ncr;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getTcrMaxHyst() {
		return tcrMaxHyst;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @param tcrMaxHyst the input value
	 */
	public void  setTcrMaxHyst(String tcrMaxHyst) {
		this.tcrMaxHyst = tcrMaxHyst;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the cell reselection hysteresis for reverting from UE high-mobility measurements. The additional time period in seconds before UE reverts to low-mobility measurements. When the number of cell reselections during the time period defined by {{param|TCRMax}} no longer exceeds {{param|NCR}}, UE continues measurements during the time period defined by {{param}}.

Parameter defined in SIB3 {{bibref|3GPP-TS.25.331|Section 10.3.7.12}}.
	 *
	 * @since 2.0
	 * @param tcrMaxHyst the input value
	 * @return this instance
	 */
	public CellSelection withTcrMaxHyst(String tcrMaxHyst) {
		this.tcrMaxHyst = tcrMaxHyst;
		return this;
	}

	/**
	 * Get a member of the set of parameters used for cell reselection functionality.

Defines the maximum transmit power level, specified in dBm, that an UE MAY use when accessing the cell on RACH. Used to calculate Pcompensation, which is: max(UE_TXPWR_MAX_RACH - P_MAX, 0), where UE_TXPWR_MAX_RACH is {{param}} and P_MAX is the max transmit power for a UE.

{{bibref|3GPP-TS.25.331|Section 10.3.2.3}} {{bibref|3GPP-TS.25.304|Section 5.2.3}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getUetxPwrMaxRACH() {
		return uetxPwrMaxRACH;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the maximum transmit power level, specified in dBm, that an UE MAY use when accessing the cell on RACH. Used to calculate Pcompensation, which is: max(UE_TXPWR_MAX_RACH - P_MAX, 0), where UE_TXPWR_MAX_RACH is {{param}} and P_MAX is the max transmit power for a UE.

{{bibref|3GPP-TS.25.331|Section 10.3.2.3}} {{bibref|3GPP-TS.25.304|Section 5.2.3}}
	 *
	 * @since 2.0
	 * @param uetxPwrMaxRACH the input value
	 */
	public void  setUetxPwrMaxRACH(Integer uetxPwrMaxRACH) {
		this.uetxPwrMaxRACH = uetxPwrMaxRACH;
	}

	/**
	 * Set a member of the set of parameters used for cell reselection functionality.

Defines the maximum transmit power level, specified in dBm, that an UE MAY use when accessing the cell on RACH. Used to calculate Pcompensation, which is: max(UE_TXPWR_MAX_RACH - P_MAX, 0), where UE_TXPWR_MAX_RACH is {{param}} and P_MAX is the max transmit power for a UE.

{{bibref|3GPP-TS.25.331|Section 10.3.2.3}} {{bibref|3GPP-TS.25.304|Section 5.2.3}}
	 *
	 * @since 2.0
	 * @param uetxPwrMaxRACH the input value
	 * @return this instance
	 */
	public CellSelection withUetxPwrMaxRACH(Integer uetxPwrMaxRACH) {
		this.uetxPwrMaxRACH = uetxPwrMaxRACH;
		return this;
	}

	//</editor-fold>

}