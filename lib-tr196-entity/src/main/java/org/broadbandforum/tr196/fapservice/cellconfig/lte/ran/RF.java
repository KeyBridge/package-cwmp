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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

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
	 * This object contains parameters relating to the RF, see {{bibref|3GPP-TS.32.592|Section 6.1.7.1}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.RF.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.RF")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.RF")
@XmlAccessorType(XmlAccessType.FIELD)
public class RF {

	/**
	 * {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the downlink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NDL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EARFCNDL")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long earFCNDL;
	/**
	 * {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the uplink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NUL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EARFCNUL")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long earFCNUL;
	/**
	 * Frequency band indicator. Corresponds to parameter freqBandIndicator in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FreqBandIndicator")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 40)
	public Long freqBandIndicator;
	/**
	 * {{list}} Each item is a downlink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter dl_Bandwidth in MIB (Master Information Block) in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DLBandwidth")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long dlbandwidth;
	/**
	 * {{list}} Each item is an uplink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ULBandwidth")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long ulbandwidth;
	/**
	 * {{list}} Each item is a downlink reference-signal transmit power, specified in dBm, with a numeric range between -60 and 50 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReferenceSignalPower")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> referenceSignalPower;
	/**
	 * {{list}} Each item is a physical cell ID with a numeric range between 0 and 503 inclusive. Represents the list of physical cell identities LTE FAP to choose from. In case there is more than one item in the list, the first item contains the most preferred value. As specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PhyCellID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> phyCellID;
	/**
	 * {{list}} Each item is a power offset, specified in dB, of the Primary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PSCHPowerOffset")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> pscHPowerOffset;
	/**
	 * {{list}} Each item is a power offset, specified in dB, of the Secondary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SSCHPowerOffset")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> sscHPowerOffset;
	/**
	 * {{list}} Each item is a power offset, specified in dB, of the Physical Broadcast Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PBCHPowerOffset")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> pbcHPowerOffset;

	public RF() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the downlink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NDL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEarFCNDL() {
		return earFCNDL;
	}

	/**
	 * Set the {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the downlink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NDL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param earFCNDL the input value
	 */
	public void  setEarFCNDL(Long earFCNDL) {
		this.earFCNDL = earFCNDL;
	}

	/**
	 * Set the {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the downlink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NDL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param earFCNDL the input value
	 * @return this instance
	 */
	public RF withEarFCNDL(Long earFCNDL) {
		this.earFCNDL = earFCNDL;
		return this;
	}

	/**
	 * Get the {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the uplink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NUL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEarFCNUL() {
		return earFCNUL;
	}

	/**
	 * Set the {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the uplink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NUL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param earFCNUL the input value
	 */
	public void  setEarFCNUL(Long earFCNUL) {
		this.earFCNUL = earFCNUL;
	}

	/**
	 * Set the {{list}} Each item is an E-UTRA Absolute Radio Frequency Channel Number in the uplink direction. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter NUL specified in {{bibref|3GPP-TS.36.104|Table 5.7.3.1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param earFCNUL the input value
	 * @return this instance
	 */
	public RF withEarFCNUL(Long earFCNUL) {
		this.earFCNUL = earFCNUL;
		return this;
	}

	/**
	 * Get the frequency band indicator. Corresponds to parameter freqBandIndicator in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFreqBandIndicator() {
		return freqBandIndicator;
	}

	/**
	 * Set the frequency band indicator. Corresponds to parameter freqBandIndicator in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param freqBandIndicator the input value
	 */
	public void  setFreqBandIndicator(Long freqBandIndicator) {
		this.freqBandIndicator = freqBandIndicator;
	}

	/**
	 * Set the frequency band indicator. Corresponds to parameter freqBandIndicator in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}}.
	 *
	 * @since 2.0
	 * @param freqBandIndicator the input value
	 * @return this instance
	 */
	public RF withFreqBandIndicator(Long freqBandIndicator) {
		this.freqBandIndicator = freqBandIndicator;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a downlink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter dl_Bandwidth in MIB (Master Information Block) in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDlbandwidth() {
		return dlbandwidth;
	}

	/**
	 * Set the {{list}} Each item is a downlink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter dl_Bandwidth in MIB (Master Information Block) in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param dlbandwidth the input value
	 */
	public void  setDlbandwidth(Long dlbandwidth) {
		this.dlbandwidth = dlbandwidth;
	}

	/**
	 * Set the {{list}} Each item is a downlink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter dl_Bandwidth in MIB (Master Information Block) in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param dlbandwidth the input value
	 * @return this instance
	 */
	public RF withDlbandwidth(Long dlbandwidth) {
		this.dlbandwidth = dlbandwidth;
		return this;
	}

	/**
	 * Get the {{list}} Each item is an uplink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getUlbandwidth() {
		return ulbandwidth;
	}

	/**
	 * Set the {{list}} Each item is an uplink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param ulbandwidth the input value
	 */
	public void  setUlbandwidth(Long ulbandwidth) {
		this.ulbandwidth = ulbandwidth;
	}

	/**
	 * Set the {{list}} Each item is an uplink transmission bandwidth, specified in number of Resource Blocks. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter ul_Bandwidth in SIB2 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}. and to parameter NRB in {{bibref|3GPP-TS.36.101|Table 5.6-1}}.

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param ulbandwidth the input value
	 * @return this instance
	 */
	public RF withUlbandwidth(Long ulbandwidth) {
		this.ulbandwidth = ulbandwidth;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a downlink reference-signal transmit power, specified in dBm, with a numeric range between -60 and 50 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getReferenceSignalPower() {
		if (this.referenceSignalPower == null){ this.referenceSignalPower=new ArrayList<>();}
		return referenceSignalPower;
	}

	/**
	 * Set the {{list}} Each item is a downlink reference-signal transmit power, specified in dBm, with a numeric range between -60 and 50 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param referenceSignalPower the input value
	 */
	public void  setReferenceSignalPower(Collection<String> referenceSignalPower) {
		this.referenceSignalPower = referenceSignalPower;
	}

	/**
	 * Set the {{list}} Each item is a downlink reference-signal transmit power, specified in dBm, with a numeric range between -60 and 50 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Defined as the linear average over the power contributions (in W) of all resource elements that carry cell-specific reference signals within the operating system bandwidth. Corresponds to parameter referenceSignalPower in PDSCH-Config IE in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then LTE FAP accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of LTE FAP, LTE FAP accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withReferenceSignalPower(String string) {
		getReferenceSignalPower().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a physical cell ID with a numeric range between 0 and 503 inclusive. Represents the list of physical cell identities LTE FAP to choose from. In case there is more than one item in the list, the first item contains the most preferred value. As specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPhyCellID() {
		if (this.phyCellID == null){ this.phyCellID=new ArrayList<>();}
		return phyCellID;
	}

	/**
	 * Set the {{list}} Each item is a physical cell ID with a numeric range between 0 and 503 inclusive. Represents the list of physical cell identities LTE FAP to choose from. In case there is more than one item in the list, the first item contains the most preferred value. As specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param phyCellID the input value
	 */
	public void  setPhyCellID(Collection<String> phyCellID) {
		this.phyCellID = phyCellID;
	}

	/**
	 * Set the {{list}} Each item is a physical cell ID with a numeric range between 0 and 503 inclusive. Represents the list of physical cell identities LTE FAP to choose from. In case there is more than one item in the list, the first item contains the most preferred value. As specified in {{bibref|3GPP-TS.36.211|Section 6.11}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If LTE FAP supports self-configuration capability for {{param}} and more than one item is configured, then LTE FAP is expected to select one from the list and overwrite this parameter containing only the one selected.  If LTE FAP does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withPhyCellID(String string) {
		getPhyCellID().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a power offset, specified in dB, of the Primary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPscHPowerOffset() {
		if (this.pscHPowerOffset == null){ this.pscHPowerOffset=new ArrayList<>();}
		return pscHPowerOffset;
	}

	/**
	 * Set the {{list}} Each item is a power offset, specified in dB, of the Primary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pscHPowerOffset the input value
	 */
	public void  setPscHPowerOffset(Collection<String> pscHPowerOffset) {
		this.pscHPowerOffset = pscHPowerOffset;
	}

	/**
	 * Set the {{list}} Each item is a power offset, specified in dB, of the Primary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withPscHPowerOffset(String string) {
		getPscHPowerOffset().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a power offset, specified in dB, of the Secondary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSscHPowerOffset() {
		if (this.sscHPowerOffset == null){ this.sscHPowerOffset=new ArrayList<>();}
		return sscHPowerOffset;
	}

	/**
	 * Set the {{list}} Each item is a power offset, specified in dB, of the Secondary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param sscHPowerOffset the input value
	 */
	public void  setSscHPowerOffset(Collection<String> sscHPowerOffset) {
		this.sscHPowerOffset = sscHPowerOffset;
	}

	/**
	 * Set the {{list}} Each item is a power offset, specified in dB, of the Secondary Synchronization Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withSscHPowerOffset(String string) {
		getSscHPowerOffset().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a power offset, specified in dB, of the Physical Broadcast Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPbcHPowerOffset() {
		if (this.pbcHPowerOffset == null){ this.pbcHPowerOffset=new ArrayList<>();}
		return pbcHPowerOffset;
	}

	/**
	 * Set the {{list}} Each item is a power offset, specified in dB, of the Physical Broadcast Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pbcHPowerOffset the input value
	 */
	public void  setPbcHPowerOffset(Collection<String> pbcHPowerOffset) {
		this.pbcHPowerOffset = pbcHPowerOffset;
	}

	/**
	 * Set the {{list}} Each item is a power offset, specified in dB, of the Physical Broadcast Channel with respect to the ReferenceSignalPower, with a numeric range between -350 and 150 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of {{param}} divided by 10 yields the actual value.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RF withPbcHPowerOffset(String string) {
		getPbcHPowerOffset().add(string);
		return this;
	}

	//</editor-fold>

}