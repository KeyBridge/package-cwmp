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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.utra.UTRANFDDFreq;

	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to UTRA (UMTS) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.4}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA")
@XmlAccessorType(XmlAccessType.FIELD)
public class UTRA {

	/**
	 * {{list}} Each item is a cell re-selection timer for re-selection to a UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionUTRA specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionUTRA")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> treselectionUTRA;
	/**
	 * Scaling factor for TreselectionUTRA for inter-RAT re-selection to UTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-Medium specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionUTRASFMedium")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionUTRASFMedium;
	/**
	 * Scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-High specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionUTRASFHigh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionUTRASFHigh;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.UTRANFDDFreq.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxUTRANFDDFreqEntries")
	public Long maxUTRANFDDFreqEntries;
	/**
	 * This object contains parameters relating to the channel frequncy related information of UTRA (UMTS) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.5, 6.1.5.1.6}}).
	 */
	@XmlElementWrapper(name = "UTRANFDDFreqs")
	@XmlElement(name = "UTRANFDDFreq")
	@CWMPParameter(access = "readWrite")
	public Collection<UTRANFDDFreq> utrANFDDFreqs;

	public UTRA() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a cell re-selection timer for re-selection to a UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionUTRA specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTreselectionUTRA() {
		if (this.treselectionUTRA == null){ this.treselectionUTRA=new ArrayList<>();}
		return treselectionUTRA;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for re-selection to a UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionUTRA specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param treselectionUTRA the input value
	 */
	public void  setTreselectionUTRA(Collection<String> treselectionUTRA) {
		this.treselectionUTRA = treselectionUTRA;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for re-selection to a UTRA frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionUTRA specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public UTRA withTreselectionUTRA(String string) {
		getTreselectionUTRA().add(string);
		return this;
	}

	/**
	 * Get the scaling factor for TreselectionUTRA for inter-RAT re-selection to UTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-Medium specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionUTRASFMedium() {
		return treselectionUTRASFMedium;
	}

	/**
	 * Set the scaling factor for TreselectionUTRA for inter-RAT re-selection to UTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-Medium specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionUTRASFMedium the input value
	 */
	public void  setTreselectionUTRASFMedium(Long treselectionUTRASFMedium) {
		this.treselectionUTRASFMedium = treselectionUTRASFMedium;
	}

	/**
	 * Set the scaling factor for TreselectionUTRA for inter-RAT re-selection to UTRA in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-Medium specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionUTRASFMedium the input value
	 * @return this instance
	 */
	public UTRA withTreselectionUTRASFMedium(Long treselectionUTRASFMedium) {
		this.treselectionUTRASFMedium = treselectionUTRASFMedium;
		return this;
	}

	/**
	 * Get the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-High specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionUTRASFHigh() {
		return treselectionUTRASFHigh;
	}

	/**
	 * Set the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-High specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionUTRASFHigh the input value
	 */
	public void  setTreselectionUTRASFHigh(Long treselectionUTRASFHigh) {
		this.treselectionUTRASFHigh = treselectionUTRASFHigh;
	}

	/**
	 * Set the scaling factor for TreselectionEUTRA for inter-frequency re-selection to this frequency carrier in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionUTRA-SF:sf-High specified in SIB6 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionUTRASFHigh the input value
	 * @return this instance
	 */
	public UTRA withTreselectionUTRASFHigh(Long treselectionUTRASFHigh) {
		this.treselectionUTRASFHigh = treselectionUTRASFHigh;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.UTRANFDDFreq.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxUTRANFDDFreqEntries() {
		return maxUTRANFDDFreqEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.UTRANFDDFreq.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxUTRANFDDFreqEntries the input value
	 */
	public void  setMaxUTRANFDDFreqEntries(Long maxUTRANFDDFreqEntries) {
		this.maxUTRANFDDFreqEntries = maxUTRANFDDFreqEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.UTRA.UTRANFDDFreq.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxUTRANFDDFreqEntries the input value
	 * @return this instance
	 */
	public UTRA withMaxUTRANFDDFreqEntries(Long maxUTRANFDDFreqEntries) {
		this.maxUTRANFDDFreqEntries = maxUTRANFDDFreqEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the channel frequncy related information of UTRA (UMTS) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.5, 6.1.5.1.6}}).
	 *
	 * @return the value
	 */
	public Collection<UTRANFDDFreq> getUtrANFDDFreqs() {
		if (this.utrANFDDFreqs == null){ this.utrANFDDFreqs=new ArrayList<>();}
		return utrANFDDFreqs;
	}

	/**
	 * Set the this object contains parameters relating to the channel frequncy related information of UTRA (UMTS) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.5, 6.1.5.1.6}}).
	 *
	 * @param utrANFDDFreqs the input value
	 */
	public void  setUtrANFDDFreqs(Collection<UTRANFDDFreq> utrANFDDFreqs) {
		this.utrANFDDFreqs = utrANFDDFreqs;
	}

	/**
	 * Set the this object contains parameters relating to the channel frequncy related information of UTRA (UMTS) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.5, 6.1.5.1.6}}).
	 *
	 * @param utrANFDDFreq the input value
	 * @return this instance
	 */
	public UTRA withUTRANFDDFreq(UTRANFDDFreq utrANFDDFreq) {
		getUtrANFDDFreqs().add(utrANFDDFreq);
		return this;
	}

	//</editor-fold>

}