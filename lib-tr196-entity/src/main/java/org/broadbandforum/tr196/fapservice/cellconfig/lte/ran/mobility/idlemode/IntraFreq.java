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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode;

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
	 * This object contains parameters relating to the idle mode mobility configuration for intra-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.2}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IntraFreq.")
@XmlRootElement(name = "IntraFreq")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IntraFreq")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntraFreq {

	/**
	 * {{list}} Each item is a required minimum received RSRP level of a E-UTRA cell for cell selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QRxLevMinSIB1")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> qrxLevMinSIB1;
	/**
	 * {{list}} Each item is a required minimum received RSRP level for intra-frequency E-UTRA cell re-selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QRxLevMinSIB3")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> qrxLevMinSIB3;
	/**
	 * Defines offset with respect to QrxLevMin, specified in dBm. This offset is taken into account in the computation of Srxlev for cell selection evaluation of cells detected during a periodic search for a higher priority PLMN while camped normally in a VPLMN. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter q-rxLevMinOffset in SIB1 specified in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QRxLevMinOffset")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = 1, max = 8)
	public Long qrxLevMinOffset;
	/**
	 * {{list}} Each item is a threshold for intra-frequency measurements, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-IntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SIntraSearch")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> sintraSearch;
	/**
	 * {{list}} Each item is a cell re-selection timer for intra-frequency E-UTRA cell re-selection, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionEUTRA specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionEUTRA")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> treselectionEUTRA;
	/**
	 * {{list}} Each item is a threshold for inter-frequency and inter-RAT measurements with lower or equal priority, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-NonIntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNonIntraSearch")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> snonIntraSearch;
	/**
	 * Absolute priority of the E-UTRAN serving carrier frequency used in the inter-frequency and inter-RAT cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReselectionPriority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long cellReselectionPriority;
	/**
	 * Used to limit the allowed UE uplink transmission power on the serving frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB1 and SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PMax")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -30, max = 33)
	public Integer pmax;
	/**
	 * Threshold for serving frequency used in evaluation of re-selection towards lower priority E-UTRAN frequency or inter-RAT, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshServingLow specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshServingLow")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 31)
	public Long threshServingLow;
	/**
	 * Scaling factor for intra-frequency TreselectionEUTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionEUTRASFMedium")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionEUTRASFMedium;
	/**
	 * Scaling factor for intra-frequency TreselectionEUTRA in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionEUTRASFHigh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionEUTRASFHigh;

	public IntraFreq() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a required minimum received RSRP level of a E-UTRA cell for cell selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQrxLevMinSIB1() {
		if (this.qrxLevMinSIB1 == null){ this.qrxLevMinSIB1=new ArrayList<>();}
		return qrxLevMinSIB1;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSRP level of a E-UTRA cell for cell selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qrxLevMinSIB1 the input value
	 */
	public void  setQrxLevMinSIB1(Collection<String> qrxLevMinSIB1) {
		this.qrxLevMinSIB1 = qrxLevMinSIB1;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSRP level of a E-UTRA cell for cell selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB1 in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreq withQrxLevMinSIB1(String string) {
		getQrxLevMinSIB1().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a required minimum received RSRP level for intra-frequency E-UTRA cell re-selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQrxLevMinSIB3() {
		if (this.qrxLevMinSIB3 == null){ this.qrxLevMinSIB3=new ArrayList<>();}
		return qrxLevMinSIB3;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSRP level for intra-frequency E-UTRA cell re-selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qrxLevMinSIB3 the input value
	 */
	public void  setQrxLevMinSIB3(Collection<String> qrxLevMinSIB3) {
		this.qrxLevMinSIB3 = qrxLevMinSIB3;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSRP level for intra-frequency E-UTRA cell re-selection, specified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value.  Corresponds to parameter q-rxLevMin in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreq withQrxLevMinSIB3(String string) {
		getQrxLevMinSIB3().add(string);
		return this;
	}

	/**
	 * Get the defines offset with respect to QrxLevMin, specified in dBm. This offset is taken into account in the computation of Srxlev for cell selection evaluation of cells detected during a periodic search for a higher priority PLMN while camped normally in a VPLMN. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter q-rxLevMinOffset in SIB1 specified in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getQrxLevMinOffset() {
		return qrxLevMinOffset;
	}

	/**
	 * Set the defines offset with respect to QrxLevMin, specified in dBm. This offset is taken into account in the computation of Srxlev for cell selection evaluation of cells detected during a periodic search for a higher priority PLMN while camped normally in a VPLMN. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter q-rxLevMinOffset in SIB1 specified in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.
	 *
	 * @since 2.0
	 * @param qrxLevMinOffset the input value
	 */
	public void  setQrxLevMinOffset(Long qrxLevMinOffset) {
		this.qrxLevMinOffset = qrxLevMinOffset;
	}

	/**
	 * Set the defines offset with respect to QrxLevMin, specified in dBm. This offset is taken into account in the computation of Srxlev for cell selection evaluation of cells detected during a periodic search for a higher priority PLMN while camped normally in a VPLMN. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter q-rxLevMinOffset in SIB1 specified in {{bibref|3GPP-TS.36.331|Section 6.2.2}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.
	 *
	 * @since 2.0
	 * @param qrxLevMinOffset the input value
	 * @return this instance
	 */
	public IntraFreq withQrxLevMinOffset(Long qrxLevMinOffset) {
		this.qrxLevMinOffset = qrxLevMinOffset;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a threshold for intra-frequency measurements, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-IntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSintraSearch() {
		if (this.sintraSearch == null){ this.sintraSearch=new ArrayList<>();}
		return sintraSearch;
	}

	/**
	 * Set the {{list}} Each item is a threshold for intra-frequency measurements, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-IntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param sintraSearch the input value
	 */
	public void  setSintraSearch(Collection<String> sintraSearch) {
		this.sintraSearch = sintraSearch;
	}

	/**
	 * Set the {{list}} Each item is a threshold for intra-frequency measurements, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-IntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreq withSintraSearch(String string) {
		getSintraSearch().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a cell re-selection timer for intra-frequency E-UTRA cell re-selection, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionEUTRA specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTreselectionEUTRA() {
		if (this.treselectionEUTRA == null){ this.treselectionEUTRA=new ArrayList<>();}
		return treselectionEUTRA;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for intra-frequency E-UTRA cell re-selection, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionEUTRA specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param treselectionEUTRA the input value
	 */
	public void  setTreselectionEUTRA(Collection<String> treselectionEUTRA) {
		this.treselectionEUTRA = treselectionEUTRA;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for intra-frequency E-UTRA cell re-selection, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionEUTRA specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreq withTreselectionEUTRA(String string) {
		getTreselectionEUTRA().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a threshold for inter-frequency and inter-RAT measurements with lower or equal priority, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-NonIntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSnonIntraSearch() {
		if (this.snonIntraSearch == null){ this.snonIntraSearch=new ArrayList<>();}
		return snonIntraSearch;
	}

	/**
	 * Set the {{list}} Each item is a threshold for inter-frequency and inter-RAT measurements with lower or equal priority, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-NonIntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param snonIntraSearch the input value
	 */
	public void  setSnonIntraSearch(Collection<String> snonIntraSearch) {
		this.snonIntraSearch = snonIntraSearch;
	}

	/**
	 * Set the {{list}} Each item is a threshold for inter-frequency and inter-RAT measurements with lower or equal priority, specified in dB, with a numeric range between 0 and 31 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter s-NonIntraSearch specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public IntraFreq withSnonIntraSearch(String string) {
		getSnonIntraSearch().add(string);
		return this;
	}

	/**
	 * Get absolute priority of the E-UTRAN serving carrier frequency used in the inter-frequency and inter-RAT cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellReselectionPriority() {
		return cellReselectionPriority;
	}

	/**
	 * Set absolute priority of the E-UTRAN serving carrier frequency used in the inter-frequency and inter-RAT cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 */
	public void  setCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
	}

	/**
	 * Set absolute priority of the E-UTRAN serving carrier frequency used in the inter-frequency and inter-RAT cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 * @return this instance
	 */
	public IntraFreq withCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
		return this;
	}

	/**
	 * Get the used to limit the allowed UE uplink transmission power on the serving frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB1 and SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPmax() {
		return pmax;
	}

	/**
	 * Set the used to limit the allowed UE uplink transmission power on the serving frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB1 and SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param pmax the input value
	 */
	public void  setPmax(Integer pmax) {
		this.pmax = pmax;
	}

	/**
	 * Set the used to limit the allowed UE uplink transmission power on the serving frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB1 and SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1 and Section 6.3.4}}.
	 *
	 * @since 2.0
	 * @param pmax the input value
	 * @return this instance
	 */
	public IntraFreq withPmax(Integer pmax) {
		this.pmax = pmax;
		return this;
	}

	/**
	 * Get the threshold for serving frequency used in evaluation of re-selection towards lower priority E-UTRAN frequency or inter-RAT, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshServingLow specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshServingLow() {
		return threshServingLow;
	}

	/**
	 * Set the threshold for serving frequency used in evaluation of re-selection towards lower priority E-UTRAN frequency or inter-RAT, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshServingLow specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param threshServingLow the input value
	 */
	public void  setThreshServingLow(Long threshServingLow) {
		this.threshServingLow = threshServingLow;
	}

	/**
	 * Set the threshold for serving frequency used in evaluation of re-selection towards lower priority E-UTRAN frequency or inter-RAT, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshServingLow specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param threshServingLow the input value
	 * @return this instance
	 */
	public IntraFreq withThreshServingLow(Long threshServingLow) {
		this.threshServingLow = threshServingLow;
		return this;
	}

	/**
	 * Get the scaling factor for intra-frequency TreselectionEUTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionEUTRASFMedium() {
		return treselectionEUTRASFMedium;
	}

	/**
	 * Set the scaling factor for intra-frequency TreselectionEUTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFMedium the input value
	 */
	public void  setTreselectionEUTRASFMedium(Long treselectionEUTRASFMedium) {
		this.treselectionEUTRASFMedium = treselectionEUTRASFMedium;
	}

	/**
	 * Set the scaling factor for intra-frequency TreselectionEUTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFMedium the input value
	 * @return this instance
	 */
	public IntraFreq withTreselectionEUTRASFMedium(Long treselectionEUTRASFMedium) {
		this.treselectionEUTRASFMedium = treselectionEUTRASFMedium;
		return this;
	}

	/**
	 * Get the scaling factor for intra-frequency TreselectionEUTRA in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionEUTRASFHigh() {
		return treselectionEUTRASFHigh;
	}

	/**
	 * Set the scaling factor for intra-frequency TreselectionEUTRA in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFHigh the input value
	 */
	public void  setTreselectionEUTRASFHigh(Long treselectionEUTRASFHigh) {
		this.treselectionEUTRASFHigh = treselectionEUTRASFHigh;
	}

	/**
	 * Set the scaling factor for intra-frequency TreselectionEUTRA in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFHigh the input value
	 * @return this instance
	 */
	public IntraFreq withTreselectionEUTRASFHigh(Long treselectionEUTRASFHigh) {
		this.treselectionEUTRASFHigh = treselectionEUTRASFHigh;
		return this;
	}

	//</editor-fold>

}