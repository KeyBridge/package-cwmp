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
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mobility.idlemode.irat.cdma2000.CDMA2000Band;

	/**
	 * This object contains parameters relating to the idle mode mobility configuration for inter-RAT (Radio Access Technology) re-selection, specifically for re-selection to CDMA2000 system scenario (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000")
@XmlAccessorType(XmlAccessType.FIELD)
public class CDMA2000 {

	/**
	 * {{list}} Each item is a CDMA2000 parameter affecting the search for neighbouring pilots, with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter searchWindowSize in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP2-C.S0005-A|Table 2.6.6.2.1-1}} and {{bibref|3GPP2-C.S0024-A|Table 8.7.6.2-4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SearchWindowSize")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> searchWindowSize;
	/**
	 * {{list}} Each item is a cell re-selection timer for a CDMA2000 band, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionCDMA2000 specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionCDMA_HRPD or TreselectionCDMA_1xRTT in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionCDMA2000")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> treselectionCDMA2000;
	/**
	 * Scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value. Corresponds to parameter t-ReselectionCDMA2000-SF:sf-Medium specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionCDMA2000SFMedium")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionCDMA2000SFMedium;
	/**
	 * Scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.  Corresponds to parameter t-ReselectionCDMA2000-SF:sf-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReselectionCDMA2000SFHigh")
	@CWMPParameter(access = "readWrite")
	@Size(min = 100, max = 100)
	public Long treselectionCDMA2000SFHigh;
	/**
	 * The maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.}} table.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxCDMA2000BandEntries")
	public Long maxCDMA2000BandEntries;
	/**
	 * This object contains parameters relating to the channel frequncy related information of CDMA2000 system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 */
	@XmlElementWrapper(name = "CDMA2000Bands")
	@XmlElement(name = "CDMA2000Band")
	@CWMPParameter(access = "readWrite")
	public Collection<CDMA2000Band> cdmA2000Bands;

	public CDMA2000() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a CDMA2000 parameter affecting the search for neighbouring pilots, with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter searchWindowSize in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP2-C.S0005-A|Table 2.6.6.2.1-1}} and {{bibref|3GPP2-C.S0024-A|Table 8.7.6.2-4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSearchWindowSize() {
		if (this.searchWindowSize == null){ this.searchWindowSize=new ArrayList<>();}
		return searchWindowSize;
	}

	/**
	 * Set the {{list}} Each item is a CDMA2000 parameter affecting the search for neighbouring pilots, with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter searchWindowSize in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP2-C.S0005-A|Table 2.6.6.2.1-1}} and {{bibref|3GPP2-C.S0024-A|Table 8.7.6.2-4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param searchWindowSize the input value
	 */
	public void  setSearchWindowSize(Collection<String> searchWindowSize) {
		this.searchWindowSize = searchWindowSize;
	}

	/**
	 * Set the {{list}} Each item is a CDMA2000 parameter affecting the search for neighbouring pilots, with a numeric range between 0 and 15 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter searchWindowSize in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP2-C.S0005-A|Table 2.6.6.2.1-1}} and {{bibref|3GPP2-C.S0024-A|Table 8.7.6.2-4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CDMA2000 withSearchWindowSize(String string) {
		getSearchWindowSize().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a cell re-selection timer for a CDMA2000 band, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionCDMA2000 specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionCDMA_HRPD or TreselectionCDMA_1xRTT in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTreselectionCDMA2000() {
		if (this.treselectionCDMA2000 == null){ this.treselectionCDMA2000=new ArrayList<>();}
		return treselectionCDMA2000;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for a CDMA2000 band, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionCDMA2000 specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionCDMA_HRPD or TreselectionCDMA_1xRTT in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param treselectionCDMA2000 the input value
	 */
	public void  setTreselectionCDMA2000(Collection<String> treselectionCDMA2000) {
		this.treselectionCDMA2000 = treselectionCDMA2000;
	}

	/**
	 * Set the {{list}} Each item is a cell re-selection timer for a CDMA2000 band, specified in seconds, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t-ReselectionCDMA2000 specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and to TreselectionCDMA_HRPD or TreselectionCDMA_1xRTT in {{bibref|3GPP-TS.36.304|Section 5.2.4.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public CDMA2000 withTreselectionCDMA2000(String string) {
		getTreselectionCDMA2000().add(string);
		return this;
	}

	/**
	 * Get the scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value. Corresponds to parameter t-ReselectionCDMA2000-SF:sf-Medium specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionCDMA2000SFMedium() {
		return treselectionCDMA2000SFMedium;
	}

	/**
	 * Set the scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value. Corresponds to parameter t-ReselectionCDMA2000-SF:sf-Medium specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionCDMA2000SFMedium the input value
	 */
	public void  setTreselectionCDMA2000SFMedium(Long treselectionCDMA2000SFMedium) {
		this.treselectionCDMA2000SFMedium = treselectionCDMA2000SFMedium;
	}

	/**
	 * Set the scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in Medium-mobility state. The value of {{param}} divided by 100 yields the actual SF value. Corresponds to parameter t-ReselectionCDMA2000-SF:sf-Medium specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionCDMA2000SFMedium the input value
	 * @return this instance
	 */
	public CDMA2000 withTreselectionCDMA2000SFMedium(Long treselectionCDMA2000SFMedium) {
		this.treselectionCDMA2000SFMedium = treselectionCDMA2000SFMedium;
		return this;
	}

	/**
	 * Get the scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.  Corresponds to parameter t-ReselectionCDMA2000-SF:sf-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTreselectionCDMA2000SFHigh() {
		return treselectionCDMA2000SFHigh;
	}

	/**
	 * Set the scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.  Corresponds to parameter t-ReselectionCDMA2000-SF:sf-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionCDMA2000SFHigh the input value
	 */
	public void  setTreselectionCDMA2000SFHigh(Long treselectionCDMA2000SFHigh) {
		this.treselectionCDMA2000SFHigh = treselectionCDMA2000SFHigh;
	}

	/**
	 * Set the scaling factor for TReselectionCDMA2000 for inter-RAT re-selection to CDMA2000 in High-mobility state. The value of {{param}} divided by 100 yields the actual SF value.  Corresponds to parameter t-ReselectionCDMA2000-SF:sf-High specified in SIB8 in {{bibref|3GPP-TS.36.331|Section 6.3.1}} and in {{bibref|3GPP-TS.36.304|Section 5.2.4.3}}.
	 *
	 * @since 2.0
	 * @param treselectionCDMA2000SFHigh the input value
	 * @return this instance
	 */
	public CDMA2000 withTreselectionCDMA2000SFHigh(Long treselectionCDMA2000SFHigh) {
		this.treselectionCDMA2000SFHigh = treselectionCDMA2000SFHigh;
		return this;
	}

	/**
	 * Get the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.}} table.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxCDMA2000BandEntries() {
		return maxCDMA2000BandEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCDMA2000BandEntries the input value
	 */
	public void  setMaxCDMA2000BandEntries(Long maxCDMA2000BandEntries) {
		this.maxCDMA2000BandEntries = maxCDMA2000BandEntries;
	}

	/**
	 * Set the maximum number of entries in the {{object|.CellConfig.LTE.RAN.Mobility.IdleMode.IRAT.CDMA2000.CDMA2000Band.{i}.}} table.
	 *
	 * @since 2.0
	 * @param maxCDMA2000BandEntries the input value
	 * @return this instance
	 */
	public CDMA2000 withMaxCDMA2000BandEntries(Long maxCDMA2000BandEntries) {
		this.maxCDMA2000BandEntries = maxCDMA2000BandEntries;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the channel frequncy related information of CDMA2000 system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @return the value
	 */
	public Collection<CDMA2000Band> getCdmA2000Bands() {
		if (this.cdmA2000Bands == null){ this.cdmA2000Bands=new ArrayList<>();}
		return cdmA2000Bands;
	}

	/**
	 * Set the this object contains parameters relating to the channel frequncy related information of CDMA2000 system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @param cdmA2000Bands the input value
	 */
	public void  setCdmA2000Bands(Collection<CDMA2000Band> cdmA2000Bands) {
		this.cdmA2000Bands = cdmA2000Bands;
	}

	/**
	 * Set the this object contains parameters relating to the channel frequncy related information of CDMA2000 system (see {{bibref|3GPP-TS.32.592|Section 6.1.5.1.8}}).
	 *
	 * @param cdmA2000Band the input value
	 * @return this instance
	 */
	public CDMA2000 withCDMA2000Band(CDMA2000Band cdmA2000Band) {
		getCdmA2000Bands().add(cdmA2000Band);
		return this;
	}

	//</editor-fold>

}