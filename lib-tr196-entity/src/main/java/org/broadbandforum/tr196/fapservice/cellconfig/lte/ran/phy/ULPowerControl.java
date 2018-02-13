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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the uplink power control configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.7}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.ULPowerControl.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY.ULPowerControl")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.ULPowerControl")
@XmlAccessorType(XmlAccessType.FIELD)
public class ULPowerControl {

	/**
	 * {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUSCH for semi-persistant grants, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUSCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUSCH(0) parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "P0NominalPUSCH")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> p0nominalPUSCH;
	/**
	 * {{list}} Each item is a value used to compute the UL UE transmit power for transmission on PUSCH, from the list of 0, 4, 5, 6, 7, 8, 9, 100. In case there is more than one item in the list, the first item contains the most preferred value.  Actual values of range are from 0.00 to 1.00. The value of {{param}} divided by 100 yields the actual value. Corresponds to alpha parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to α parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alpha")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> alpha;
	/**
	 * {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUCCH, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUCCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUCCH parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.2.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "P0NominalPUCCH")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> p0nominalPUCCH;
	/**
	 * Defines deltaF-PUCCH-Format1 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaFPUCCHFormat1")
	@Size(min = 2, max = 2)
	public Integer deltaFPUCCHFormat1;
	/**
	 * Defines deltaF-PUCCH-Format1b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1b) in dB dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaFPUCCHFormat1b")
	@Size(min = 5, max = 5)
	public Long deltaFPUCCHFormat1b;
	/**
	 * Defines deltaF-PUCCH-Format2 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaFPUCCHFormat2")
	@Size(min = 0, max = 2)
	public Integer deltaFPUCCHFormat2;
	/**
	 * Defines deltaF-PUCCH-Format2a to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2a) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaFPUCCHFormat2a")
	@Size(min = 2, max = 2)
	public Integer deltaFPUCCHFormat2a;
	/**
	 * Defines deltaF-PUCCH-Format2b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2b) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaFPUCCHFormat2b")
	@Size(min = 2, max = 2)
	public Integer deltaFPUCCHFormat2b;
	/**
	 * Defines the parameter in dB used to compute the UL UE transmit power for transmission of random access response grant.

This parameter corresponds to deltaPreambleMsg3 parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to ?PREAMBLE_Msg3  parameter specified in {{bibref|3GPP-TS.36.213|Section 5.1.1.1}}. Actual value is 2x the value of this parameter.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaPreambleMsg3")
	@Size(min = -1, max = 6)
	public Integer deltaPreambleMsg3;

	public ULPowerControl() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUSCH for semi-persistant grants, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUSCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUSCH(0) parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getP0nominalPUSCH() {
		if (this.p0nominalPUSCH == null){ this.p0nominalPUSCH=new ArrayList<>();}
		return p0nominalPUSCH;
	}

	/**
	 * Set the {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUSCH for semi-persistant grants, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUSCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUSCH(0) parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param p0nominalPUSCH the input value
	 */
	public void  setP0nominalPUSCH(Collection<String> p0nominalPUSCH) {
		this.p0nominalPUSCH = p0nominalPUSCH;
	}

	/**
	 * Set the {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUSCH for semi-persistant grants, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUSCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUSCH(0) parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ULPowerControl withP0nominalPUSCH(String string) {
		getP0nominalPUSCH().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value used to compute the UL UE transmit power for transmission on PUSCH, from the list of 0, 4, 5, 6, 7, 8, 9, 100. In case there is more than one item in the list, the first item contains the most preferred value.  Actual values of range are from 0.00 to 1.00. The value of {{param}} divided by 100 yields the actual value. Corresponds to alpha parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to α parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getAlpha() {
		if (this.alpha == null){ this.alpha=new ArrayList<>();}
		return alpha;
	}

	/**
	 * Set the {{list}} Each item is a value used to compute the UL UE transmit power for transmission on PUSCH, from the list of 0, 4, 5, 6, 7, 8, 9, 100. In case there is more than one item in the list, the first item contains the most preferred value.  Actual values of range are from 0.00 to 1.00. The value of {{param}} divided by 100 yields the actual value. Corresponds to alpha parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to α parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param alpha the input value
	 */
	public void  setAlpha(Collection<String> alpha) {
		this.alpha = alpha;
	}

	/**
	 * Set the {{list}} Each item is a value used to compute the UL UE transmit power for transmission on PUSCH, from the list of 0, 4, 5, 6, 7, 8, 9, 100. In case there is more than one item in the list, the first item contains the most preferred value.  Actual values of range are from 0.00 to 1.00. The value of {{param}} divided by 100 yields the actual value. Corresponds to alpha parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to α parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.1.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ULPowerControl withAlpha(String string) {
		getAlpha().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUCCH, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUCCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUCCH parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.2.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getP0nominalPUCCH() {
		if (this.p0nominalPUCCH == null){ this.p0nominalPUCCH=new ArrayList<>();}
		return p0nominalPUCCH;
	}

	/**
	 * Set the {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUCCH, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUCCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUCCH parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.2.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param p0nominalPUCCH the input value
	 */
	public void  setP0nominalPUCCH(Collection<String> p0nominalPUCCH) {
		this.p0nominalPUCCH = p0nominalPUCCH;
	}

	/**
	 * Set the {{list}} Each item is a value to compute the UL UE transmit power for transmission on PUCCH, with a numeric range between -126 and 24 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to p0-NominalPUCCH parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and PO_NOMINAL_PUCCH parameter specified in {{bibref|3GPP-TS.36.211|Section 5.1.2.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public ULPowerControl withP0nominalPUCCH(String string) {
		getP0nominalPUCCH().add(string);
		return this;
	}

	/**
	 * Get the defines deltaF-PUCCH-Format1 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDeltaFPUCCHFormat1() {
		return deltaFPUCCHFormat1;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format1 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat1 the input value
	 */
	public void  setDeltaFPUCCHFormat1(Integer deltaFPUCCHFormat1) {
		this.deltaFPUCCHFormat1 = deltaFPUCCHFormat1;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format1 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat1 the input value
	 * @return this instance
	 */
	public ULPowerControl withDeltaFPUCCHFormat1(Integer deltaFPUCCHFormat1) {
		this.deltaFPUCCHFormat1 = deltaFPUCCHFormat1;
		return this;
	}

	/**
	 * Get the defines deltaF-PUCCH-Format1b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1b) in dB dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDeltaFPUCCHFormat1b() {
		return deltaFPUCCHFormat1b;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format1b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1b) in dB dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat1b the input value
	 */
	public void  setDeltaFPUCCHFormat1b(Long deltaFPUCCHFormat1b) {
		this.deltaFPUCCHFormat1b = deltaFPUCCHFormat1b;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format1b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(1b) in dB dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat1b the input value
	 * @return this instance
	 */
	public ULPowerControl withDeltaFPUCCHFormat1b(Long deltaFPUCCHFormat1b) {
		this.deltaFPUCCHFormat1b = deltaFPUCCHFormat1b;
		return this;
	}

	/**
	 * Get the defines deltaF-PUCCH-Format2 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDeltaFPUCCHFormat2() {
		return deltaFPUCCHFormat2;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format2 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat2 the input value
	 */
	public void  setDeltaFPUCCHFormat2(Integer deltaFPUCCHFormat2) {
		this.deltaFPUCCHFormat2 = deltaFPUCCHFormat2;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format2 to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat2 the input value
	 * @return this instance
	 */
	public ULPowerControl withDeltaFPUCCHFormat2(Integer deltaFPUCCHFormat2) {
		this.deltaFPUCCHFormat2 = deltaFPUCCHFormat2;
		return this;
	}

	/**
	 * Get the defines deltaF-PUCCH-Format2a to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2a) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDeltaFPUCCHFormat2a() {
		return deltaFPUCCHFormat2a;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format2a to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2a) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat2a the input value
	 */
	public void  setDeltaFPUCCHFormat2a(Integer deltaFPUCCHFormat2a) {
		this.deltaFPUCCHFormat2a = deltaFPUCCHFormat2a;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format2a to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2a) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat2a the input value
	 * @return this instance
	 */
	public ULPowerControl withDeltaFPUCCHFormat2a(Integer deltaFPUCCHFormat2a) {
		this.deltaFPUCCHFormat2a = deltaFPUCCHFormat2a;
		return this;
	}

	/**
	 * Get the defines deltaF-PUCCH-Format2b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2b) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDeltaFPUCCHFormat2b() {
		return deltaFPUCCHFormat2b;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format2b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2b) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat2b the input value
	 */
	public void  setDeltaFPUCCHFormat2b(Integer deltaFPUCCHFormat2b) {
		this.deltaFPUCCHFormat2b = deltaFPUCCHFormat2b;
	}

	/**
	 * Set the defines deltaF-PUCCH-Format2b to derive the UE transmit power.

Corresponds to parameter ?F_PUCCH(2b) in dB as specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.213|Section 5.1.2}}.
	 *
	 * @since 2.0
	 * @param deltaFPUCCHFormat2b the input value
	 * @return this instance
	 */
	public ULPowerControl withDeltaFPUCCHFormat2b(Integer deltaFPUCCHFormat2b) {
		this.deltaFPUCCHFormat2b = deltaFPUCCHFormat2b;
		return this;
	}

	/**
	 * Get the defines the parameter in dB used to compute the UL UE transmit power for transmission of random access response grant.

This parameter corresponds to deltaPreambleMsg3 parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to ?PREAMBLE_Msg3  parameter specified in {{bibref|3GPP-TS.36.213|Section 5.1.1.1}}. Actual value is 2x the value of this parameter.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getDeltaPreambleMsg3() {
		return deltaPreambleMsg3;
	}

	/**
	 * Set the defines the parameter in dB used to compute the UL UE transmit power for transmission of random access response grant.

This parameter corresponds to deltaPreambleMsg3 parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to ?PREAMBLE_Msg3  parameter specified in {{bibref|3GPP-TS.36.213|Section 5.1.1.1}}. Actual value is 2x the value of this parameter.
	 *
	 * @since 2.0
	 * @param deltaPreambleMsg3 the input value
	 */
	public void  setDeltaPreambleMsg3(Integer deltaPreambleMsg3) {
		this.deltaPreambleMsg3 = deltaPreambleMsg3;
	}

	/**
	 * Set the defines the parameter in dB used to compute the UL UE transmit power for transmission of random access response grant.

This parameter corresponds to deltaPreambleMsg3 parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to ?PREAMBLE_Msg3  parameter specified in {{bibref|3GPP-TS.36.213|Section 5.1.1.1}}. Actual value is 2x the value of this parameter.
	 *
	 * @since 2.0
	 * @param deltaPreambleMsg3 the input value
	 * @return this instance
	 */
	public ULPowerControl withDeltaPreambleMsg3(Integer deltaPreambleMsg3) {
		this.deltaPreambleMsg3 = deltaPreambleMsg3;
		return this;
	}

	//</editor-fold>

}