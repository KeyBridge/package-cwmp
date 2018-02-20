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
	 * This object contains parameters relating to the PRACH (Physical Random Access Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.4}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.PRACH.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY.PRACH")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.PRACH")
@XmlAccessorType(XmlAccessType.FIELD)
public class PRACH {

	/**
	 * {{list}} Each item is a Logical root sequence index with a numeric range between 0 and 837 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Logical root sequence index is used to determine 64 physical RACH preamble sequences available in the cell. Corresponds to RACH_ROOT_SEQUENCE parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RootSequenceIndex")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> rootSequenceIndex;
	/**
	 * {{list}} Each item is an index to the table defining PRACH resources within the frame with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to PRACH-Configuration-Index parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ConfigurationIndex")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> configurationIndex;
	/**
	 * Indicates whether restricted set or unrestricted set of preambles is used.

If {{true}}, indicates restricted set. If {{false}}, indicates unrestricted set.

Corresponds to highSpeedFlag parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and high-speed-flag parameter defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HighSpeedFlag")
	@CWMPParameter(access = "readWrite")
	public Boolean highSpeedFlag;
	/**
	 * {{list}} Each item is a value used for preamble sequence generation with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Each item corresponds to zeroCorrelationZoneConfig parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to NCS parameter  defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ZeroCorrelationZoneConfig")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> zeroCorrelationZoneConfig;
	/**
	 * {{list}} Each item represents the first available physical resource block number for PRACH. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to prach-FreqOffset parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and nPRBoffsetRA parameter defined {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FreqOffset")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> freqOffset;

	public PRACH() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a Logical root sequence index with a numeric range between 0 and 837 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Logical root sequence index is used to determine 64 physical RACH preamble sequences available in the cell. Corresponds to RACH_ROOT_SEQUENCE parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getRootSequenceIndex() {
		if (this.rootSequenceIndex == null){ this.rootSequenceIndex=new ArrayList<>();}
		return rootSequenceIndex;
	}

	/**
	 * Set the {{list}} Each item is a Logical root sequence index with a numeric range between 0 and 837 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Logical root sequence index is used to determine 64 physical RACH preamble sequences available in the cell. Corresponds to RACH_ROOT_SEQUENCE parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param rootSequenceIndex the input value
	 */
	public void  setRootSequenceIndex(Collection<String> rootSequenceIndex) {
		this.rootSequenceIndex = rootSequenceIndex;
	}

	/**
	 * Set the {{list}} Each item is a Logical root sequence index with a numeric range between 0 and 837 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Logical root sequence index is used to determine 64 physical RACH preamble sequences available in the cell. Corresponds to RACH_ROOT_SEQUENCE parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PRACH withRootSequenceIndex(String string) {
		getRootSequenceIndex().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is an index to the table defining PRACH resources within the frame with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to PRACH-Configuration-Index parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getConfigurationIndex() {
		if (this.configurationIndex == null){ this.configurationIndex=new ArrayList<>();}
		return configurationIndex;
	}

	/**
	 * Set the {{list}} Each item is an index to the table defining PRACH resources within the frame with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to PRACH-Configuration-Index parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param configurationIndex the input value
	 */
	public void  setConfigurationIndex(Collection<String> configurationIndex) {
		this.configurationIndex = configurationIndex;
	}

	/**
	 * Set the {{list}} Each item is an index to the table defining PRACH resources within the frame with a numeric range between 0 and 63 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to PRACH-Configuration-Index parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PRACH withConfigurationIndex(String string) {
		getConfigurationIndex().add(string);
		return this;
	}

	/**
	 * Get the indicates whether restricted set or unrestricted set of preambles is used.

If {{true}}, indicates restricted set. If {{false}}, indicates unrestricted set.

Corresponds to highSpeedFlag parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and high-speed-flag parameter defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isHighSpeedFlag() {
		return highSpeedFlag;
	}

	/**
	 * Set the indicates whether restricted set or unrestricted set of preambles is used.

If {{true}}, indicates restricted set. If {{false}}, indicates unrestricted set.

Corresponds to highSpeedFlag parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and high-speed-flag parameter defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.
	 *
	 * @since 2.0
	 * @param highSpeedFlag the input value
	 */
	public void  setHighSpeedFlag(Boolean highSpeedFlag) {
		this.highSpeedFlag = highSpeedFlag;
	}

	/**
	 * Set the indicates whether restricted set or unrestricted set of preambles is used.

If {{true}}, indicates restricted set. If {{false}}, indicates unrestricted set.

Corresponds to highSpeedFlag parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and high-speed-flag parameter defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.
	 *
	 * @since 2.0
	 * @param highSpeedFlag the input value
	 * @return this instance
	 */
	public PRACH withHighSpeedFlag(Boolean highSpeedFlag) {
		this.highSpeedFlag = highSpeedFlag;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value used for preamble sequence generation with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Each item corresponds to zeroCorrelationZoneConfig parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to NCS parameter  defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getZeroCorrelationZoneConfig() {
		if (this.zeroCorrelationZoneConfig == null){ this.zeroCorrelationZoneConfig=new ArrayList<>();}
		return zeroCorrelationZoneConfig;
	}

	/**
	 * Set the {{list}} Each item is a value used for preamble sequence generation with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Each item corresponds to zeroCorrelationZoneConfig parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to NCS parameter  defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param zeroCorrelationZoneConfig the input value
	 */
	public void  setZeroCorrelationZoneConfig(Collection<String> zeroCorrelationZoneConfig) {
		this.zeroCorrelationZoneConfig = zeroCorrelationZoneConfig;
	}

	/**
	 * Set the {{list}} Each item is a value used for preamble sequence generation with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Each item corresponds to zeroCorrelationZoneConfig parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and to NCS parameter  defined in {{bibref|3GPP-TS.36.211|Section 5.7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PRACH withZeroCorrelationZoneConfig(String string) {
		getZeroCorrelationZoneConfig().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item represents the first available physical resource block number for PRACH. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to prach-FreqOffset parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and nPRBoffsetRA parameter defined {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getFreqOffset() {
		if (this.freqOffset == null){ this.freqOffset=new ArrayList<>();}
		return freqOffset;
	}

	/**
	 * Set the {{list}} Each item represents the first available physical resource block number for PRACH. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to prach-FreqOffset parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and nPRBoffsetRA parameter defined {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param freqOffset the input value
	 */
	public void  setFreqOffset(Collection<String> freqOffset) {
		this.freqOffset = freqOffset;
	}

	/**
	 * Set the {{list}} Each item represents the first available physical resource block number for PRACH. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to prach-FreqOffset parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and nPRBoffsetRA parameter defined {{bibref|3GPP-TS.36.211|Section 5.7.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PRACH withFreqOffset(String string) {
		getFreqOffset().add(string);
		return this;
	}

	//</editor-fold>

}