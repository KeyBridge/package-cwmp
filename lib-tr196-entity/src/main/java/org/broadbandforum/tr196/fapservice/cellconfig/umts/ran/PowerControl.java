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
	 * This object contains parameters related to power control and RACH.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAN.PowerControl.")
@XmlRootElement(name = "FAPService.CellConfig.UMTS.RAN.PowerControl")
@XmlType(name = "FAPService.CellConfig.UMTS.RAN.PowerControl")
@XmlAccessorType(XmlAccessType.FIELD)
public class PowerControl {

	/**
	 * Used by the UE to calculate the initial output power, specified in dB, on PRACH according to the open loop power control procedure.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.11}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConstantValue")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = -35, max = -10)
	public Integer constantValue;
	/**
	 * Used for the Uplink Common Channel.

Defines the Power ramp setup, specified in dB, on PRACH preamble when no acquisition indicator (AI) is detected by the UE.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerRampStepUp")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 1, max = 8)
	public Long powerRampStepUp;
	/**
	 * Used for the Uplink Common Channel.

Defines the maximum number of preambles allowed in one preamble ramping cycle.

PRACH Preamble Retrans Max is part of "PRACH power offset" which is part of "PRACH system information list".

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PreambleRetransMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 64)
	public Long preambleRetransMax;
	/**
	 * Persistence Scaling Factor for overload control.

Parameter in SIB5.

The value is the scaling factor multiplied by 10, e.g. 2 is a scaling factor of 0.2
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PersistenceScaleFactor")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2, max = 9)
	public Long persistenceScaleFactor;
	/**
	 * Maximum number of RACH preamble cycles.

Defines how many times the PRACH preamble ramping procedure can be repeated before UE MAC reports a failure on RACH transmission to higher layers. Maximum number of RACH preamble cycles is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MMax")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 32)
	public Long mmax;
	/**
	 * RACH random back-off lower bound.

{{param}} is the lower bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NB01Min")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 50)
	public Long nb01Min;
	/**
	 * RACH random back-off upper bound.

{{param}} is the Upper bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NB01Max")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 50)
	public Long nb01Max;

	public PowerControl() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the used by the UE to calculate the initial output power, specified in dB, on PRACH according to the open loop power control procedure.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.11}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getConstantValue() {
		return constantValue;
	}

	/**
	 * Set the used by the UE to calculate the initial output power, specified in dB, on PRACH according to the open loop power control procedure.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.11}}
	 *
	 * @since 2.0
	 * @param constantValue the input value
	 */
	public void  setConstantValue(Integer constantValue) {
		this.constantValue = constantValue;
	}

	/**
	 * Set the used by the UE to calculate the initial output power, specified in dB, on PRACH according to the open loop power control procedure.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.11}}
	 *
	 * @since 2.0
	 * @param constantValue the input value
	 * @return this instance
	 */
	public PowerControl withConstantValue(Integer constantValue) {
		this.constantValue = constantValue;
		return this;
	}

	/**
	 * Get the used for the Uplink Common Channel.

Defines the Power ramp setup, specified in dB, on PRACH preamble when no acquisition indicator (AI) is detected by the UE.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPowerRampStepUp() {
		return powerRampStepUp;
	}

	/**
	 * Set the used for the Uplink Common Channel.

Defines the Power ramp setup, specified in dB, on PRACH preamble when no acquisition indicator (AI) is detected by the UE.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 * @param powerRampStepUp the input value
	 */
	public void  setPowerRampStepUp(Long powerRampStepUp) {
		this.powerRampStepUp = powerRampStepUp;
	}

	/**
	 * Set the used for the Uplink Common Channel.

Defines the Power ramp setup, specified in dB, on PRACH preamble when no acquisition indicator (AI) is detected by the UE.

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 * @param powerRampStepUp the input value
	 * @return this instance
	 */
	public PowerControl withPowerRampStepUp(Long powerRampStepUp) {
		this.powerRampStepUp = powerRampStepUp;
		return this;
	}

	/**
	 * Get the used for the Uplink Common Channel.

Defines the maximum number of preambles allowed in one preamble ramping cycle.

PRACH Preamble Retrans Max is part of "PRACH power offset" which is part of "PRACH system information list".

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPreambleRetransMax() {
		return preambleRetransMax;
	}

	/**
	 * Set the used for the Uplink Common Channel.

Defines the maximum number of preambles allowed in one preamble ramping cycle.

PRACH Preamble Retrans Max is part of "PRACH power offset" which is part of "PRACH system information list".

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 * @param preambleRetransMax the input value
	 */
	public void  setPreambleRetransMax(Long preambleRetransMax) {
		this.preambleRetransMax = preambleRetransMax;
	}

	/**
	 * Set the used for the Uplink Common Channel.

Defines the maximum number of preambles allowed in one preamble ramping cycle.

PRACH Preamble Retrans Max is part of "PRACH power offset" which is part of "PRACH system information list".

Parameter in SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.54}}
	 *
	 * @since 2.0
	 * @param preambleRetransMax the input value
	 * @return this instance
	 */
	public PowerControl withPreambleRetransMax(Long preambleRetransMax) {
		this.preambleRetransMax = preambleRetransMax;
		return this;
	}

	/**
	 * Get the persistence Scaling Factor for overload control.

Parameter in SIB5.

The value is the scaling factor multiplied by 10, e.g. 2 is a scaling factor of 0.2
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPersistenceScaleFactor() {
		return persistenceScaleFactor;
	}

	/**
	 * Set the persistence Scaling Factor for overload control.

Parameter in SIB5.

The value is the scaling factor multiplied by 10, e.g. 2 is a scaling factor of 0.2
	 *
	 * @since 2.0
	 * @param persistenceScaleFactor the input value
	 */
	public void  setPersistenceScaleFactor(Long persistenceScaleFactor) {
		this.persistenceScaleFactor = persistenceScaleFactor;
	}

	/**
	 * Set the persistence Scaling Factor for overload control.

Parameter in SIB5.

The value is the scaling factor multiplied by 10, e.g. 2 is a scaling factor of 0.2
	 *
	 * @since 2.0
	 * @param persistenceScaleFactor the input value
	 * @return this instance
	 */
	public PowerControl withPersistenceScaleFactor(Long persistenceScaleFactor) {
		this.persistenceScaleFactor = persistenceScaleFactor;
		return this;
	}

	/**
	 * Get the maximum number of RACH preamble cycles.

Defines how many times the PRACH preamble ramping procedure can be repeated before UE MAC reports a failure on RACH transmission to higher layers. Maximum number of RACH preamble cycles is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMmax() {
		return mmax;
	}

	/**
	 * Set the maximum number of RACH preamble cycles.

Defines how many times the PRACH preamble ramping procedure can be repeated before UE MAC reports a failure on RACH transmission to higher layers. Maximum number of RACH preamble cycles is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @param mmax the input value
	 */
	public void  setMmax(Long mmax) {
		this.mmax = mmax;
	}

	/**
	 * Set the maximum number of RACH preamble cycles.

Defines how many times the PRACH preamble ramping procedure can be repeated before UE MAC reports a failure on RACH transmission to higher layers. Maximum number of RACH preamble cycles is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @param mmax the input value
	 * @return this instance
	 */
	public PowerControl withMmax(Long mmax) {
		this.mmax = mmax;
		return this;
	}

	/**
	 * Get the racH random back-off lower bound.

{{param}} is the lower bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNb01Min() {
		return nb01Min;
	}

	/**
	 * Set the racH random back-off lower bound.

{{param}} is the lower bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @param nb01Min the input value
	 */
	public void  setNb01Min(Long nb01Min) {
		this.nb01Min = nb01Min;
	}

	/**
	 * Set the racH random back-off lower bound.

{{param}} is the lower bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @param nb01Min the input value
	 * @return this instance
	 */
	public PowerControl withNb01Min(Long nb01Min) {
		this.nb01Min = nb01Min;
		return this;
	}

	/**
	 * Get the racH random back-off upper bound.

{{param}} is the Upper bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNb01Max() {
		return nb01Max;
	}

	/**
	 * Set the racH random back-off upper bound.

{{param}} is the Upper bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @param nb01Max the input value
	 */
	public void  setNb01Max(Long nb01Max) {
		this.nb01Max = nb01Max;
	}

	/**
	 * Set the racH random back-off upper bound.

{{param}} is the Upper bound of the waiting time in 10 millisecond increments (i.e. 1 corresponds to 10 ms and 50 corresponds to 500 ms).

{{param}} is part of "RACH transmission parameters" which is part of "PRACH system information list" which is part of SIB5.

{{bibref|3GPP-TS.25.331|Section 10.3.6.67}}
	 *
	 * @since 2.0
	 * @param nb01Max the input value
	 * @return this instance
	 */
	public PowerControl withNb01Max(Long nb01Max) {
		this.nb01Max = nb01Max;
		return this;
	}

	//</editor-fold>

}