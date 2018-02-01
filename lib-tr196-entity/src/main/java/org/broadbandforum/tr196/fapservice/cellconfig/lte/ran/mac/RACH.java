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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mac;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the RACH (Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.1}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.MAC.RACH.")
public class RACH {

	/**
	 * {{list}} Each item is a number of non-dedicated random access preambles. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter numberOfRA-Preambles specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumberOfRaPreambles")
	@CWMPParameter(access = "readWrite")
	@Size(min = 4, max = 64)
	public Long numberOfRaPreambles;
	/**
	 * {{list}} Each item is a number of non-dedicated random access preambles in Random Acces Preambles group A. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...60); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter sizeOfRA-PreamblesGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SizeOfRaGroupA")
	@CWMPParameter(access = "readWrite")
	@Size(min = 4, max = 60)
	public Long sizeOfRaGroupA;
	/**
	 * {{list}} Each item is a threshold for preamble selection, specified in bits. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messageSizeGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MessageSizeGroupA")
	@CWMPParameter(access = "readWrite")
	@Size(min = 256, max = 256)
	public Long messageSizeGroupA;
	/**
	 * {{list}} Each item is a threshold for preamble selection, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messagePowerOffsetGroupB specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.  Value of -1 indicates "minusinfinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MessagePowerOffsetGroupB")
	@CWMPParameter(access = "readWrite")
	@Size(min = 18, max = 18)
	public Integer messagePowerOffsetGroupB;
	/**
	 * {{list}} Each item is a power increase factor between subsequent random access preamble transmissions, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter powerRampingStep specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PowerRampingStep")
	@CWMPParameter(access = "readWrite")
	@Size(min = 6, max = 6)
	public Long powerRampingStep;
	/**
	 * {{list}} Each item is a value used as the baseline for computation for random access transmission power, specified in dBm. Also used as a parameter in the criteria for preamble selection. Only even values are valid (i.e. -120, -118, -116,...-90); use of other values within the defined range MUST be rejected by the CPE.  In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter preambleInitialReceivedTargetPower specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.2}}. and section 5.1.3.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PreambleInitialReceivedTargetPower")
	@CWMPParameter(access = "readWrite")
	@Size(min = -120, max = -90)
	public Integer preambleInitialReceivedTargetPower;
	/**
	 * {{list}} Each item is a maximum number of random access preamble transmissions, from the list of 3, 4, 5, 6, 7, 8, 10, 20, 50, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter preambleTransMax specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4 and section 5.1.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PreambleTransMax")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> preambleTransMax;
	/**
	 * {{list}} Each item is a duration of the random access response window, specified in sub-frames, with a numeric range between 2 and 10 inclusive (except value of 9). In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter ra-ResponseWindowSize specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ResponseWindowSize")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> responseWindowSize;
	/**
	 * {{list}} Each item is a contention resolution timer, specified in sub-frames. Only values multiple of 8 are valid (i.e. 8, 16, 24,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter mac-ContentionResolutionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ContentionResolutionTimer")
	@CWMPParameter(access = "readWrite")
	@Size(min = 8, max = 64)
	public Long contentionResolutionTimer;
	/**
	 * {{list}} Each item is a maximum number of Msg3 HARQ transmissions by RRC, with a numeric range between 1 and 8 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter maxHARQ-Msg3Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHARQMsg3Tx")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> maxHARQMsg3Tx;

	public RACH() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a number of non-dedicated random access preambles. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter numberOfRA-Preambles specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumberOfRaPreambles() {
		return numberOfRaPreambles;
	}

	/**
	 * Set the {{list}} Each item is a number of non-dedicated random access preambles. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter numberOfRA-Preambles specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param numberOfRaPreambles the input value
	 */
	public void  setNumberOfRaPreambles(Long numberOfRaPreambles) {
		this.numberOfRaPreambles = numberOfRaPreambles;
	}

	/**
	 * Set the {{list}} Each item is a number of non-dedicated random access preambles. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter numberOfRA-Preambles specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param numberOfRaPreambles the input value
	 * @return this instance
	 */
	public RACH withNumberOfRaPreambles(Long numberOfRaPreambles) {
		this.numberOfRaPreambles = numberOfRaPreambles;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a number of non-dedicated random access preambles in Random Acces Preambles group A. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...60); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter sizeOfRA-PreamblesGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSizeOfRaGroupA() {
		return sizeOfRaGroupA;
	}

	/**
	 * Set the {{list}} Each item is a number of non-dedicated random access preambles in Random Acces Preambles group A. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...60); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter sizeOfRA-PreamblesGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param sizeOfRaGroupA the input value
	 */
	public void  setSizeOfRaGroupA(Long sizeOfRaGroupA) {
		this.sizeOfRaGroupA = sizeOfRaGroupA;
	}

	/**
	 * Set the {{list}} Each item is a number of non-dedicated random access preambles in Random Acces Preambles group A. Only values in multiple of 4 are valid (i.e. 4, 8, 12, 16,...60); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter sizeOfRA-PreamblesGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param sizeOfRaGroupA the input value
	 * @return this instance
	 */
	public RACH withSizeOfRaGroupA(Long sizeOfRaGroupA) {
		this.sizeOfRaGroupA = sizeOfRaGroupA;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a threshold for preamble selection, specified in bits. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messageSizeGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMessageSizeGroupA() {
		return messageSizeGroupA;
	}

	/**
	 * Set the {{list}} Each item is a threshold for preamble selection, specified in bits. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messageSizeGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param messageSizeGroupA the input value
	 */
	public void  setMessageSizeGroupA(Long messageSizeGroupA) {
		this.messageSizeGroupA = messageSizeGroupA;
	}

	/**
	 * Set the {{list}} Each item is a threshold for preamble selection, specified in bits. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messageSizeGroupA specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param messageSizeGroupA the input value
	 * @return this instance
	 */
	public RACH withMessageSizeGroupA(Long messageSizeGroupA) {
		this.messageSizeGroupA = messageSizeGroupA;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a threshold for preamble selection, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messagePowerOffsetGroupB specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.  Value of -1 indicates "minusinfinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getMessagePowerOffsetGroupB() {
		return messagePowerOffsetGroupB;
	}

	/**
	 * Set the {{list}} Each item is a threshold for preamble selection, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messagePowerOffsetGroupB specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.  Value of -1 indicates "minusinfinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param messagePowerOffsetGroupB the input value
	 */
	public void  setMessagePowerOffsetGroupB(Integer messagePowerOffsetGroupB) {
		this.messagePowerOffsetGroupB = messagePowerOffsetGroupB;
	}

	/**
	 * Set the {{list}} Each item is a threshold for preamble selection, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Defined in {{bibref|3GPP-TS.36.321|Section 5.1.2}}.  Corresponds to parameter messagePowerOffsetGroupB specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.  Value of -1 indicates "minusinfinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param messagePowerOffsetGroupB the input value
	 * @return this instance
	 */
	public RACH withMessagePowerOffsetGroupB(Integer messagePowerOffsetGroupB) {
		this.messagePowerOffsetGroupB = messagePowerOffsetGroupB;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a power increase factor between subsequent random access preamble transmissions, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter powerRampingStep specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPowerRampingStep() {
		return powerRampingStep;
	}

	/**
	 * Set the {{list}} Each item is a power increase factor between subsequent random access preamble transmissions, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter powerRampingStep specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param powerRampingStep the input value
	 */
	public void  setPowerRampingStep(Long powerRampingStep) {
		this.powerRampingStep = powerRampingStep;
	}

	/**
	 * Set the {{list}} Each item is a power increase factor between subsequent random access preamble transmissions, specified in dB. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter powerRampingStep specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param powerRampingStep the input value
	 * @return this instance
	 */
	public RACH withPowerRampingStep(Long powerRampingStep) {
		this.powerRampingStep = powerRampingStep;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value used as the baseline for computation for random access transmission power, specified in dBm. Also used as a parameter in the criteria for preamble selection. Only even values are valid (i.e. -120, -118, -116,...-90); use of other values within the defined range MUST be rejected by the CPE.  In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter preambleInitialReceivedTargetPower specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.2}}. and section 5.1.3.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPreambleInitialReceivedTargetPower() {
		return preambleInitialReceivedTargetPower;
	}

	/**
	 * Set the {{list}} Each item is a value used as the baseline for computation for random access transmission power, specified in dBm. Also used as a parameter in the criteria for preamble selection. Only even values are valid (i.e. -120, -118, -116,...-90); use of other values within the defined range MUST be rejected by the CPE.  In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter preambleInitialReceivedTargetPower specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.2}}. and section 5.1.3.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param preambleInitialReceivedTargetPower the input value
	 */
	public void  setPreambleInitialReceivedTargetPower(Integer preambleInitialReceivedTargetPower) {
		this.preambleInitialReceivedTargetPower = preambleInitialReceivedTargetPower;
	}

	/**
	 * Set the {{list}} Each item is a value used as the baseline for computation for random access transmission power, specified in dBm. Also used as a parameter in the criteria for preamble selection. Only even values are valid (i.e. -120, -118, -116,...-90); use of other values within the defined range MUST be rejected by the CPE.  In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter preambleInitialReceivedTargetPower specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.2}}. and section 5.1.3.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param preambleInitialReceivedTargetPower the input value
	 * @return this instance
	 */
	public RACH withPreambleInitialReceivedTargetPower(Integer preambleInitialReceivedTargetPower) {
		this.preambleInitialReceivedTargetPower = preambleInitialReceivedTargetPower;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a maximum number of random access preamble transmissions, from the list of 3, 4, 5, 6, 7, 8, 10, 20, 50, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter preambleTransMax specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4 and section 5.1.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPreambleTransMax() {
		if (this.preambleTransMax == null){ this.preambleTransMax=new ArrayList<>();}
		return preambleTransMax;
	}

	/**
	 * Set the {{list}} Each item is a maximum number of random access preamble transmissions, from the list of 3, 4, 5, 6, 7, 8, 10, 20, 50, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter preambleTransMax specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4 and section 5.1.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param preambleTransMax the input value
	 */
	public void  setPreambleTransMax(Collection<String> preambleTransMax) {
		this.preambleTransMax = preambleTransMax;
	}

	/**
	 * Set the {{list}} Each item is a maximum number of random access preamble transmissions, from the list of 3, 4, 5, 6, 7, 8, 10, 20, 50, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter preambleTransMax specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4 and section 5.1.5}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RACH withPreambleTransMax(String string) {
		getPreambleTransMax().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a duration of the random access response window, specified in sub-frames, with a numeric range between 2 and 10 inclusive (except value of 9). In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter ra-ResponseWindowSize specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getResponseWindowSize() {
		if (this.responseWindowSize == null){ this.responseWindowSize=new ArrayList<>();}
		return responseWindowSize;
	}

	/**
	 * Set the {{list}} Each item is a duration of the random access response window, specified in sub-frames, with a numeric range between 2 and 10 inclusive (except value of 9). In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter ra-ResponseWindowSize specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param responseWindowSize the input value
	 */
	public void  setResponseWindowSize(Collection<String> responseWindowSize) {
		this.responseWindowSize = responseWindowSize;
	}

	/**
	 * Set the {{list}} Each item is a duration of the random access response window, specified in sub-frames, with a numeric range between 2 and 10 inclusive (except value of 9). In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter ra-ResponseWindowSize specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RACH withResponseWindowSize(String string) {
		getResponseWindowSize().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a contention resolution timer, specified in sub-frames. Only values multiple of 8 are valid (i.e. 8, 16, 24,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter mac-ContentionResolutionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getContentionResolutionTimer() {
		return contentionResolutionTimer;
	}

	/**
	 * Set the {{list}} Each item is a contention resolution timer, specified in sub-frames. Only values multiple of 8 are valid (i.e. 8, 16, 24,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter mac-ContentionResolutionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param contentionResolutionTimer the input value
	 */
	public void  setContentionResolutionTimer(Long contentionResolutionTimer) {
		this.contentionResolutionTimer = contentionResolutionTimer;
	}

	/**
	 * Set the {{list}} Each item is a contention resolution timer, specified in sub-frames. Only values multiple of 8 are valid (i.e. 8, 16, 24,...64); use of other values within the defined range MUST be rejected by the CPE. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter mac-ContentionResolutionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.1.5}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param contentionResolutionTimer the input value
	 * @return this instance
	 */
	public RACH withContentionResolutionTimer(Long contentionResolutionTimer) {
		this.contentionResolutionTimer = contentionResolutionTimer;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a maximum number of Msg3 HARQ transmissions by RRC, with a numeric range between 1 and 8 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter maxHARQ-Msg3Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getMaxHARQMsg3Tx() {
		if (this.maxHARQMsg3Tx == null){ this.maxHARQMsg3Tx=new ArrayList<>();}
		return maxHARQMsg3Tx;
	}

	/**
	 * Set the {{list}} Each item is a maximum number of Msg3 HARQ transmissions by RRC, with a numeric range between 1 and 8 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter maxHARQ-Msg3Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param maxHARQMsg3Tx the input value
	 */
	public void  setMaxHARQMsg3Tx(Collection<String> maxHARQMsg3Tx) {
		this.maxHARQMsg3Tx = maxHARQMsg3Tx;
	}

	/**
	 * Set the {{list}} Each item is a maximum number of Msg3 HARQ transmissions by RRC, with a numeric range between 1 and 8 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter maxHARQ-Msg3Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RACH withMaxHARQMsg3Tx(String string) {
		getMaxHARQMsg3Tx().add(string);
		return this;
	}

	//</editor-fold>

}