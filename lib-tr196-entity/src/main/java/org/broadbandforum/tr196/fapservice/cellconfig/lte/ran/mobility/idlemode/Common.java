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
	 * This object contains parameters relating to the idle mode mobility configuration that is common to all cell re-selection scenarios (intra/inter-freq, inter-RAT to UTRA (UMTS), GERAN (GSM) and CDMA2000) (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.1}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.Common.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.Common")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.Common")
@XmlAccessorType(XmlAccessType.FIELD)
public class Common {

	/**
	 * {{list}} Each item is a hysteresis value applied to serving cell for evaluating cell ranking criteria specified in dB, with a numeric range between 0 and 24 inclusive. For the value greater than 6, only even numbers are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter q-Hyst specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Qhyst")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> qhyst;
	/**
	 * Speed-dependent scaling factor for Qhyst in Medium-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QHystSFMedium")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 0)
	public Integer qhystSFMedium;
	/**
	 * Speed-dependent scaling factor for Qhyst in High-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "QHystSFHigh")
	@CWMPParameter(access = "readWrite", units = "dB")
	@Size(min = 0, max = 0)
	public Integer qhystSFHigh;
	/**
	 * Duration for evaluating allowed amount of cell re-selection(s) required to enter mobility states, specified in seconds.

Corresponds to parameter t-Evaluation specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmax specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TEvaluation")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 240, max = 240)
	public Long tevaluation;
	/**
	 * Additional duration for evaluating criteria to enter normal mobility state, specified in seconds. Specifies the additional time period for evaluating criteria to enter Normal-mobility state.

Corresponds to parameter t-HystNormal specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmaxHyst specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "THystNormal")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 240, max = 240)
	public Long thystNormal;
	/**
	 * Defines the number of cell re-selections within TEvaluation to enter Medium-mobility state.

Corresponds to parameter n-cellChangeMedium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_M specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NCellChangeMedium")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 16)
	public Long ncellChangeMedium;
	/**
	 * Defines the number of cell re-selections within TEvaluation to enter High-mobility state.

Corresponds to parameter n-cellChangeHigh specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_H specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NCellChangeHigh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 16)
	public Long ncellChangeHigh;

	public Common() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a hysteresis value applied to serving cell for evaluating cell ranking criteria specified in dB, with a numeric range between 0 and 24 inclusive. For the value greater than 6, only even numbers are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter q-Hyst specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getQhyst() {
		if (this.qhyst == null){ this.qhyst=new ArrayList<>();}
		return qhyst;
	}

	/**
	 * Set the {{list}} Each item is a hysteresis value applied to serving cell for evaluating cell ranking criteria specified in dB, with a numeric range between 0 and 24 inclusive. For the value greater than 6, only even numbers are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter q-Hyst specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param qhyst the input value
	 */
	public void  setQhyst(Collection<String> qhyst) {
		this.qhyst = qhyst;
	}

	/**
	 * Set the {{list}} Each item is a hysteresis value applied to serving cell for evaluating cell ranking criteria specified in dB, with a numeric range between 0 and 24 inclusive. For the value greater than 6, only even numbers are valid. If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter q-Hyst specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public Common withQhyst(String string) {
		getQhyst().add(string);
		return this;
	}

	/**
	 * Get the speed-dependent scaling factor for Qhyst in Medium-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getQhystSFMedium() {
		return qhystSFMedium;
	}

	/**
	 * Set the speed-dependent scaling factor for Qhyst in Medium-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param qhystSFMedium the input value
	 */
	public void  setQhystSFMedium(Integer qhystSFMedium) {
		this.qhystSFMedium = qhystSFMedium;
	}

	/**
	 * Set the speed-dependent scaling factor for Qhyst in Medium-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-Medium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param qhystSFMedium the input value
	 * @return this instance
	 */
	public Common withQhystSFMedium(Integer qhystSFMedium) {
		this.qhystSFMedium = qhystSFMedium;
		return this;
	}

	/**
	 * Get the speed-dependent scaling factor for Qhyst in High-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getQhystSFHigh() {
		return qhystSFHigh;
	}

	/**
	 * Set the speed-dependent scaling factor for Qhyst in High-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param qhystSFHigh the input value
	 */
	public void  setQhystSFHigh(Integer qhystSFHigh) {
		this.qhystSFHigh = qhystSFHigh;
	}

	/**
	 * Set the speed-dependent scaling factor for Qhyst in High-mobility state, specified in dB.

Corresponds to parameter q-HystSF:sf-High specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param qhystSFHigh the input value
	 * @return this instance
	 */
	public Common withQhystSFHigh(Integer qhystSFHigh) {
		this.qhystSFHigh = qhystSFHigh;
		return this;
	}

	/**
	 * Get the duration for evaluating allowed amount of cell re-selection(s) required to enter mobility states, specified in seconds.

Corresponds to parameter t-Evaluation specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmax specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTevaluation() {
		return tevaluation;
	}

	/**
	 * Set the duration for evaluating allowed amount of cell re-selection(s) required to enter mobility states, specified in seconds.

Corresponds to parameter t-Evaluation specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmax specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param tevaluation the input value
	 */
	public void  setTevaluation(Long tevaluation) {
		this.tevaluation = tevaluation;
	}

	/**
	 * Set the duration for evaluating allowed amount of cell re-selection(s) required to enter mobility states, specified in seconds.

Corresponds to parameter t-Evaluation specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmax specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param tevaluation the input value
	 * @return this instance
	 */
	public Common withTevaluation(Long tevaluation) {
		this.tevaluation = tevaluation;
		return this;
	}

	/**
	 * Get additional duration for evaluating criteria to enter normal mobility state, specified in seconds. Specifies the additional time period for evaluating criteria to enter Normal-mobility state.

Corresponds to parameter t-HystNormal specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmaxHyst specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getThystNormal() {
		return thystNormal;
	}

	/**
	 * Set additional duration for evaluating criteria to enter normal mobility state, specified in seconds. Specifies the additional time period for evaluating criteria to enter Normal-mobility state.

Corresponds to parameter t-HystNormal specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmaxHyst specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param thystNormal the input value
	 */
	public void  setThystNormal(Long thystNormal) {
		this.thystNormal = thystNormal;
	}

	/**
	 * Set additional duration for evaluating criteria to enter normal mobility state, specified in seconds. Specifies the additional time period for evaluating criteria to enter Normal-mobility state.

Corresponds to parameter t-HystNormal specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter TCRmaxHyst specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param thystNormal the input value
	 * @return this instance
	 */
	public Common withThystNormal(Long thystNormal) {
		this.thystNormal = thystNormal;
		return this;
	}

	/**
	 * Get the defines the number of cell re-selections within TEvaluation to enter Medium-mobility state.

Corresponds to parameter n-cellChangeMedium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_M specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNcellChangeMedium() {
		return ncellChangeMedium;
	}

	/**
	 * Set the defines the number of cell re-selections within TEvaluation to enter Medium-mobility state.

Corresponds to parameter n-cellChangeMedium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_M specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param ncellChangeMedium the input value
	 */
	public void  setNcellChangeMedium(Long ncellChangeMedium) {
		this.ncellChangeMedium = ncellChangeMedium;
	}

	/**
	 * Set the defines the number of cell re-selections within TEvaluation to enter Medium-mobility state.

Corresponds to parameter n-cellChangeMedium specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_M specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param ncellChangeMedium the input value
	 * @return this instance
	 */
	public Common withNcellChangeMedium(Long ncellChangeMedium) {
		this.ncellChangeMedium = ncellChangeMedium;
		return this;
	}

	/**
	 * Get the defines the number of cell re-selections within TEvaluation to enter High-mobility state.

Corresponds to parameter n-cellChangeHigh specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_H specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNcellChangeHigh() {
		return ncellChangeHigh;
	}

	/**
	 * Set the defines the number of cell re-selections within TEvaluation to enter High-mobility state.

Corresponds to parameter n-cellChangeHigh specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_H specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param ncellChangeHigh the input value
	 */
	public void  setNcellChangeHigh(Long ncellChangeHigh) {
		this.ncellChangeHigh = ncellChangeHigh;
	}

	/**
	 * Set the defines the number of cell re-selections within TEvaluation to enter High-mobility state.

Corresponds to parameter n-cellChangeHigh specified in SIB3 in {{bibref|3GPP-TS.36.331|Section 6.3.4}} and to parameter NCR_H specified in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param ncellChangeHigh the input value
	 * @return this instance
	 */
	public Common withNcellChangeHigh(Long ncellChangeHigh) {
		this.ncellChangeHigh = ncellChangeHigh;
		return this;
	}

	//</editor-fold>

}