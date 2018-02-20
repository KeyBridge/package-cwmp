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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.interfreq;

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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * This object contains parameters relating to the carrier information for inter-freq re-selection scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.3}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier.{i}.", uniqueConstraints = {@CWMPUnique(names = {"EUTRACarrierARFCN"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.InterFreq.Carrier")
@XmlAccessorType(XmlAccessType.FIELD)
public class Carrier {

	/**
	 * Enables or disables this entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * Indicates the ARFCN of this frequency carrier. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "EUTRACarrierARFCN")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long eutRACarrierARFCN = 0L;
	/**
	 * {{list}} Each item is a required minimum received RSRP level on this E-UTRA frequency carrier, spcified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QRxLevMinSIB5")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> qrxLevMinSIB5;
	/**
	 * {{list}} Each item is an offset applicable between serving and this frequency carrier, specified in dBm, with a numeric range between -24 and 24 inclusive. For values less than or equal to -6, or values greater than or equal to 6, only the even values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-OffsetFreq in SIB5 specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.4.2.6}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QOffsetFreq")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> qoffsetFreq;
	/**
	 * {{list}} Each item is a cell re-selection timer for inter-frequency cell re-selection to this E-UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter t-ReselectionEUTRA specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

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
	 * Absolute priority of this E-UTRA frequency carrier, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CellReselectionPriority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 7)
	public Long cellReselectionPriority = 0L;
	/**
	 * Threshold used when re-selecting from a lower priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshXHigh")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 31)
	public Long threshXHigh = 0L;
	/**
	 * Threshold used when re-selecting from a higher priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-Low specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ThreshXLow")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 31)
	public Long threshXLow = 0L;
	/**
	 * Used to limit the allowed UE uplink transmission power on this carrier frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PMax")
	@CWMPParameter(access = "readWrite", units = "dBm")
	@Size(min = -30, max = 33)
	public Integer pmax;
	/**
	 * Scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionEUTRASFMedium")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionEUTRASFMedium = 25L;
	/**
	 * Scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionEUTRASFHigh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionEUTRASFHigh = 25L;

	public Carrier() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Carrier withEnable(Boolean enable) {
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
	public Carrier withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the indicates the ARFCN of this frequency carrier. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getEutRACarrierARFCN() {
		return eutRACarrierARFCN;
	}

	/**
	 * Set the indicates the ARFCN of this frequency carrier. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param eutRACarrierARFCN the input value
	 */
	public void  setEutRACarrierARFCN(Long eutRACarrierARFCN) {
		this.eutRACarrierARFCN = eutRACarrierARFCN;
	}

	/**
	 * Set the indicates the ARFCN of this frequency carrier. Corresponds to parameter dl-CarrierFreq in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param eutRACarrierARFCN the input value
	 * @return this instance
	 */
	public Carrier withEutRACarrierARFCN(Long eutRACarrierARFCN) {
		this.eutRACarrierARFCN = eutRACarrierARFCN;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a required minimum received RSRP level on this E-UTRA frequency carrier, spcified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQrxLevMinSIB5() {
		if (this.qrxLevMinSIB5 == null){ this.qrxLevMinSIB5=new ArrayList<>();}
		return qrxLevMinSIB5;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSRP level on this E-UTRA frequency carrier, spcified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qrxLevMinSIB5 the input value
	 */
	public void  setQrxLevMinSIB5(Collection<String> qrxLevMinSIB5) {
		this.qrxLevMinSIB5 = qrxLevMinSIB5;
	}

	/**
	 * Set the {{list}} Each item is a required minimum received RSRP level on this E-UTRA frequency carrier, spcified in dBm, with a numeric range between -70 and -22 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-rxLevMin in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Carrier withQrxLevMinSIB5(String string) {
		getQrxLevMinSIB5().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is an offset applicable between serving and this frequency carrier, specified in dBm, with a numeric range between -24 and 24 inclusive. For values less than or equal to -6, or values greater than or equal to 6, only the even values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-OffsetFreq in SIB5 specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.4.2.6}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQoffsetFreq() {
		if (this.qoffsetFreq == null){ this.qoffsetFreq=new ArrayList<>();}
		return qoffsetFreq;
	}

	/**
	 * Set the {{list}} Each item is an offset applicable between serving and this frequency carrier, specified in dBm, with a numeric range between -24 and 24 inclusive. For values less than or equal to -6, or values greater than or equal to 6, only the even values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-OffsetFreq in SIB5 specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.4.2.6}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qoffsetFreq the input value
	 */
	public void  setQoffsetFreq(Collection<String> qoffsetFreq) {
		this.qoffsetFreq = qoffsetFreq;
	}

	/**
	 * Set the {{list}} Each item is an offset applicable between serving and this frequency carrier, specified in dBm, with a numeric range between -24 and 24 inclusive. For values less than or equal to -6, or values greater than or equal to 6, only the even values are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. The value of ({{param}} * 2) yields the actual value. Corresponds to parameter q-OffsetFreq in SIB5 specified in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.4.2.6}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Carrier withQoffsetFreq(String string) {
		getQoffsetFreq().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a cell re-selection timer for inter-frequency cell re-selection to this E-UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter t-ReselectionEUTRA specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

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
	 * Set the {{list}} Each item is a cell re-selection timer for inter-frequency cell re-selection to this E-UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter t-ReselectionEUTRA specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

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
	 * Set the {{list}} Each item is a cell re-selection timer for inter-frequency cell re-selection to this E-UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter t-ReselectionEUTRA specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Carrier withTreselectionEUTRA(String string) {
		getTreselectionEUTRA().add(string);
		return this;
	}

	/**
	 * Get absolute priority of this E-UTRA frequency carrier, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCellReselectionPriority() {
		return cellReselectionPriority;
	}

	/**
	 * Set absolute priority of this E-UTRA frequency carrier, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 */
	public void  setCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
	}

	/**
	 * Set absolute priority of this E-UTRA frequency carrier, as used by the inter-frequency cell re-selection procedure.

Corresponds to parameter CellReselectionPriority specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.
	 *
	 * @since 2.0
	 * @param cellReselectionPriority the input value
	 * @return this instance
	 */
	public Carrier withCellReselectionPriority(Long cellReselectionPriority) {
		this.cellReselectionPriority = cellReselectionPriority;
		return this;
	}

	/**
	 * Get the threshold used when re-selecting from a lower priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshXHigh() {
		return threshXHigh;
	}

	/**
	 * Set the threshold used when re-selecting from a lower priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXHigh the input value
	 */
	public void  setThreshXHigh(Long threshXHigh) {
		this.threshXHigh = threshXHigh;
	}

	/**
	 * Set the threshold used when re-selecting from a lower priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXHigh the input value
	 * @return this instance
	 */
	public Carrier withThreshXHigh(Long threshXHigh) {
		this.threshXHigh = threshXHigh;
		return this;
	}

	/**
	 * Get the threshold used when re-selecting from a higher priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-Low specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThreshXLow() {
		return threshXLow;
	}

	/**
	 * Set the threshold used when re-selecting from a higher priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-Low specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXLow the input value
	 */
	public void  setThreshXLow(Long threshXLow) {
		this.threshXLow = threshXLow;
	}

	/**
	 * Set the threshold used when re-selecting from a higher priority E-UTRAN frequency, specified in dB. The value of ({{param}} * 2) yields the actual value.

Corresponds to parameter threshX-Low specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.5}}.
	 *
	 * @since 2.0
	 * @param threshXLow the input value
	 * @return this instance
	 */
	public Carrier withThreshXLow(Long threshXLow) {
		this.threshXLow = threshXLow;
		return this;
	}

	/**
	 * Get the used to limit the allowed UE uplink transmission power on this carrier frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPmax() {
		return pmax;
	}

	/**
	 * Set the used to limit the allowed UE uplink transmission power on this carrier frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param pmax the input value
	 */
	public void  setPmax(Integer pmax) {
		this.pmax = pmax;
	}

	/**
	 * Set the used to limit the allowed UE uplink transmission power on this carrier frequency, specified in dBm. It is used to calculate the parameter Pcompensation defined in {{bibref|3GPP-TS.36.304|Section 5.2.3.2}}.

Corresponds to parameter p-Max specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}}.
	 *
	 * @since 2.0
	 * @param pmax the input value
	 * @return this instance
	 */
	public Carrier withPmax(Integer pmax) {
		this.pmax = pmax;
		return this;
	}

	/**
	 * Get the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionEUTRASFMedium() {
		return treselectionEUTRASFMedium;
	}

	/**
	 * Set the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFMedium the input value
	 */
	public void  setTreselectionEUTRASFMedium(Long treselectionEUTRASFMedium) {
		this.treselectionEUTRASFMedium = treselectionEUTRASFMedium;
	}

	/**
	 * Set the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-Medium specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFMedium the input value
	 * @return this instance
	 */
	public Carrier withTreselectionEUTRASFMedium(Long treselectionEUTRASFMedium) {
		this.treselectionEUTRASFMedium = treselectionEUTRASFMedium;
		return this;
	}

	/**
	 * Get the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionEUTRASFHigh() {
		return treselectionEUTRASFHigh;
	}

	/**
	 * Set the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFHigh the input value
	 */
	public void  setTreselectionEUTRASFHigh(Long treselectionEUTRASFHigh) {
		this.treselectionEUTRASFHigh = treselectionEUTRASFHigh;
	}

	/**
	 * Set the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionEUTRA-SF:sf-High specified in SIB5 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionEUTRASFHigh the input value
	 * @return this instance
	 */
	public Carrier withTreselectionEUTRASFHigh(Long treselectionEUTRASFHigh) {
		this.treselectionEUTRASFHigh = treselectionEUTRASFHigh;
		return this;
	}

	//</editor-fold>

}