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
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.geran.GERANFreqGroup;

	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to GERAN (GSM) scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.6}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.")
@XmlRootElement(name = "GERAN")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN")
@XmlAccessorType(XmlAccessType.FIELD)
public class GERAN {

	/**
	 * {{list}} Each item is a cell re-selection timer for re-selection to a GERAN frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionGERAN specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionGERA in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionGERAN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> treselectionGERAN;
	/**
	 * Scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-Medium specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionGERANSFMedium")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionGERANSFMedium;
	/**
	 * Scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionGERANSFHigh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionGERANSFHigh;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxGERANFreqGroupEntries")
	public Long maxGERANFreqGroupEntries;
	/**
	 * This object contains parameters relating to the channel frequncy related information of GERAN (GSM) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.7}}).
	 */
	@XmlElementWrapper(name = "GERANFreqGroups")
	@XmlElement(name = "GERANFreqGroup")
	@CWMPParameter(access = "readWrite")
	public Collection<GERANFreqGroup> gerANFreqGroups;

	public GERAN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a cell re-selection timer for re-selection to a GERAN frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionGERAN specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionGERA in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTreselectionGERAN() {
		if (this.treselectionGERAN == null){ this.treselectionGERAN=new ArrayList<>();}
		return treselectionGERAN;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for re-selection to a GERAN frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionGERAN specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionGERA in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param treselectionGERAN the input value
	 */
	public void  setTreselectionGERAN(Collection<String> treselectionGERAN) {
		this.treselectionGERAN = treselectionGERAN;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for re-selection to a GERAN frequency carrier, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionGERAN specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionGERA in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public GERAN withTreselectionGERAN(String string) {
		getTreselectionGERAN().add(string);
		return this;
	}

	/**
	 * Get the scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-Medium specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionGERANSFMedium() {
		return treselectionGERANSFMedium;
	}

	/**
	 * Set the scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-Medium specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionGERANSFMedium the input value
	 */
	public void  setTreselectionGERANSFMedium(Long treselectionGERANSFMedium) {
		this.treselectionGERANSFMedium = treselectionGERANSFMedium;
	}

	/**
	 * Set the scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-Medium specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionGERANSFMedium the input value
	 * @return this instance
	 */
	public GERAN withTreselectionGERANSFMedium(Long treselectionGERANSFMedium) {
		this.treselectionGERANSFMedium = treselectionGERANSFMedium;
		return this;
	}

	/**
	 * Get the scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionGERANSFHigh() {
		return treselectionGERANSFHigh;
	}

	/**
	 * Set the scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionGERANSFHigh the input value
	 */
	public void  setTreselectionGERANSFHigh(Long treselectionGERANSFHigh) {
		this.treselectionGERANSFHigh = treselectionGERANSFHigh;
	}

	/**
	 * Set the scaling factor for TreselectionGERAN for inter-RAT re-selection to GERAN in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.

Corresponds to parameter t-ReselectionGERAN-SF:sf-High specified in SIB7 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionGERANSFHigh the input value
	 * @return this instance
	 */
	public GERAN withTreselectionGERANSFHigh(Long treselectionGERANSFHigh) {
		this.treselectionGERANSFHigh = treselectionGERANSFHigh;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxGERANFreqGroupEntries() {
		return maxGERANFreqGroupEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxGERANFreqGroupEntries the input value
	 */
	public void  setMaxGERANFreqGroupEntries(Long maxGERANFreqGroupEntries) {
		this.maxGERANFreqGroupEntries = maxGERANFreqGroupEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.GERAN.GERANFreqGroup.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxGERANFreqGroupEntries the input value
	 * @return this instance
	 */
	public GERAN withMaxGERANFreqGroupEntries(Long maxGERANFreqGroupEntries) {
		this.maxGERANFreqGroupEntries = maxGERANFreqGroupEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the channel frequncy related information of GERAN (GSM) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.7}}).
	 *
	 * @return the value
	 */
	public Collection<GERANFreqGroup> getGerANFreqGroups() {
		if (this.gerANFreqGroups == null){ this.gerANFreqGroups=new ArrayList<>();}
		return gerANFreqGroups;
	}

	/**
	 * Set the this object contains parameters relating to the channel frequncy related information of GERAN (GSM) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.7}}).
	 *
	 * @param gerANFreqGroups the input value
	 */
	public void  setGerANFreqGroups(Collection<GERANFreqGroup> gerANFreqGroups) {
		this.gerANFreqGroups = gerANFreqGroups;
	}

	/**
	 * Set the this object contains parameters relating to the channel frequncy related information of GERAN (GSM) system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.7}}).
	 *
	 * @param gerANFreqGroup the input value
	 * @return this instance
	 */
	public GERAN withGERANFreqGroup(GERANFreqGroup gerANFreqGroup) {
		getGerANFreqGroups().add(gerANFreqGroup);
		return this;
	}

	//</editor-fold>

}