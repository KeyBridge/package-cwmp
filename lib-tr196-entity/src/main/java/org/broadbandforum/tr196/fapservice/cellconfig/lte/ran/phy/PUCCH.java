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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the PUCCH (Physical Uplink Control Channel) configuration. (see {{bibref|3GPP-TS.32.592|Section 6.1.1.5}})
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.PUCCH.")
public class PUCCH {

	/**
	 * Defines the cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

It is an integer multiple of deltaPUCCHShift  within the range of {0, 1, ., 7} .

Corresponds to deltaPUCCH-Shift parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Delta-shiftPUCCH parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DeltaPUCCHShift")
	@CWMPParameter(access = "readWrite")
	public String deltaPUCCHShift;
	/**
	 * {{list}} Each item is a value that defines the bandwidth in terms of resource blocks available for use by PUCCH formats 2/2a/2b transmission in each slot, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to nRB-CQI parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(2) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NRBCQI")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> nrbCQI;
	/**
	 * Defines the number of cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

The value is an integer multiple of deltaPUCCHShift within the range of {0, 1, ., 7}.

Corresponds to nCS-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(1) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NCSAN")
	@Size(min = 0, max = 7)
	public Long ncsAN;
	/**
	 * {{list}} Each item is a value that determines resources used for transmission of PUCCH format 1/1a/1b and 2/2a/2b, with a numeric range between 0 and 2047 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to n1PUCCH-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NPUCCH(1) parameter defined {{bibref|3GPP-TS.36.213|Section 10.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N1PUCCHAN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> n1pUCCHAN;
	/**
	 * {{list}} Each item is a value that indicates the position of PUCCH, with a numeric range between 0 and 1185 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. . Corresponds to the cqi-PUCCH-ResourceIndex IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}. and to parameter nPUCCH(2) specified in {{bibref|3GPP-TS.36.213|Section 7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CQIPUCCHResourceIndex")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> cqiPUCCHResourceIndex;
	/**
	 * Sub-band size for sub-band reporting mode expressed in units of physical Resource Blocks, see {{bibref|3GPP-TS.36.213|Section 7.2.2}}.

This parameter corresponds to the K IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "K")
	@Size(min = 1, max = 4)
	public Long k;

	public PUCCH() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

It is an integer multiple of deltaPUCCHShift  within the range of {0, 1, ., 7} .

Corresponds to deltaPUCCH-Shift parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Delta-shiftPUCCH parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getDeltaPUCCHShift() {
		return deltaPUCCHShift;
	}

	/**
	 * Set the defines the cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

It is an integer multiple of deltaPUCCHShift  within the range of {0, 1, ., 7} .

Corresponds to deltaPUCCH-Shift parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Delta-shiftPUCCH parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 * @param deltaPUCCHShift the input value
	 */
	public void  setDeltaPUCCHShift(String deltaPUCCHShift) {
		this.deltaPUCCHShift = deltaPUCCHShift;
	}

	/**
	 * Set the defines the cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

It is an integer multiple of deltaPUCCHShift  within the range of {0, 1, ., 7} .

Corresponds to deltaPUCCH-Shift parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Delta-shiftPUCCH parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 * @param deltaPUCCHShift the input value
	 * @return this instance
	 */
	public PUCCH withDeltaPUCCHShift(String deltaPUCCHShift) {
		this.deltaPUCCHShift = deltaPUCCHShift;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value that defines the bandwidth in terms of resource blocks available for use by PUCCH formats 2/2a/2b transmission in each slot, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to nRB-CQI parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(2) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getNrbCQI() {
		if (this.nrbCQI == null){ this.nrbCQI=new ArrayList<>();}
		return nrbCQI;
	}

	/**
	 * Set the {{list}} Each item is a value that defines the bandwidth in terms of resource blocks available for use by PUCCH formats 2/2a/2b transmission in each slot, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to nRB-CQI parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(2) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param nrbCQI the input value
	 */
	public void  setNrbCQI(Collection<String> nrbCQI) {
		this.nrbCQI = nrbCQI;
	}

	/**
	 * Set the {{list}} Each item is a value that defines the bandwidth in terms of resource blocks available for use by PUCCH formats 2/2a/2b transmission in each slot, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to nRB-CQI parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(2) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive.If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PUCCH withNrbCQI(String string) {
		getNrbCQI().add(string);
		return this;
	}

	/**
	 * Get the defines the number of cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

The value is an integer multiple of deltaPUCCHShift within the range of {0, 1, ., 7}.

Corresponds to nCS-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(1) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNcsAN() {
		return ncsAN;
	}

	/**
	 * Set the defines the number of cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

The value is an integer multiple of deltaPUCCHShift within the range of {0, 1, ., 7}.

Corresponds to nCS-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(1) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 * @param ncsAN the input value
	 */
	public void  setNcsAN(Long ncsAN) {
		this.ncsAN = ncsAN;
	}

	/**
	 * Set the defines the number of cyclic shift used for PUCCH formats 1/1a/1b in a resource block used for a mix of formats 1/1a/1b and 2/2a/2b.

The value is an integer multiple of deltaPUCCHShift within the range of {0, 1, ., 7}.

Corresponds to nCS-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRB(1) parameter defined {{bibref|3GPP-TS.36.211|Section 5.4}}.
	 *
	 * @since 2.0
	 * @param ncsAN the input value
	 * @return this instance
	 */
	public PUCCH withNcsAN(Long ncsAN) {
		this.ncsAN = ncsAN;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value that determines resources used for transmission of PUCCH format 1/1a/1b and 2/2a/2b, with a numeric range between 0 and 2047 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to n1PUCCH-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NPUCCH(1) parameter defined {{bibref|3GPP-TS.36.213|Section 10.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getN1pUCCHAN() {
		if (this.n1pUCCHAN == null){ this.n1pUCCHAN=new ArrayList<>();}
		return n1pUCCHAN;
	}

	/**
	 * Set the {{list}} Each item is a value that determines resources used for transmission of PUCCH format 1/1a/1b and 2/2a/2b, with a numeric range between 0 and 2047 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to n1PUCCH-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NPUCCH(1) parameter defined {{bibref|3GPP-TS.36.213|Section 10.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param n1pUCCHAN the input value
	 */
	public void  setN1pUCCHAN(Collection<String> n1pUCCHAN) {
		this.n1pUCCHAN = n1pUCCHAN;
	}

	/**
	 * Set the {{list}} Each item is a value that determines resources used for transmission of PUCCH format 1/1a/1b and 2/2a/2b, with a numeric range between 0 and 2047 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to n1PUCCH-AN parameter defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NPUCCH(1) parameter defined {{bibref|3GPP-TS.36.213|Section 10.1}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PUCCH withN1pUCCHAN(String string) {
		getN1pUCCHAN().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value that indicates the position of PUCCH, with a numeric range between 0 and 1185 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. . Corresponds to the cqi-PUCCH-ResourceIndex IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}. and to parameter nPUCCH(2) specified in {{bibref|3GPP-TS.36.213|Section 7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getCqiPUCCHResourceIndex() {
		if (this.cqiPUCCHResourceIndex == null){ this.cqiPUCCHResourceIndex=new ArrayList<>();}
		return cqiPUCCHResourceIndex;
	}

	/**
	 * Set the {{list}} Each item is a value that indicates the position of PUCCH, with a numeric range between 0 and 1185 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. . Corresponds to the cqi-PUCCH-ResourceIndex IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}. and to parameter nPUCCH(2) specified in {{bibref|3GPP-TS.36.213|Section 7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param cqiPUCCHResourceIndex the input value
	 */
	public void  setCqiPUCCHResourceIndex(Collection<String> cqiPUCCHResourceIndex) {
		this.cqiPUCCHResourceIndex = cqiPUCCHResourceIndex;
	}

	/**
	 * Set the {{list}} Each item is a value that indicates the position of PUCCH, with a numeric range between 0 and 1185 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. . Corresponds to the cqi-PUCCH-ResourceIndex IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}. and to parameter nPUCCH(2) specified in {{bibref|3GPP-TS.36.213|Section 7.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PUCCH withCqiPUCCHResourceIndex(String string) {
		getCqiPUCCHResourceIndex().add(string);
		return this;
	}

	/**
	 * Get the sub-band size for sub-band reporting mode expressed in units of physical Resource Blocks, see {{bibref|3GPP-TS.36.213|Section 7.2.2}}.

This parameter corresponds to the K IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getK() {
		return k;
	}

	/**
	 * Set the sub-band size for sub-band reporting mode expressed in units of physical Resource Blocks, see {{bibref|3GPP-TS.36.213|Section 7.2.2}}.

This parameter corresponds to the K IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param k the input value
	 */
	public void  setK(Long k) {
		this.k = k;
	}

	/**
	 * Set the sub-band size for sub-band reporting mode expressed in units of physical Resource Blocks, see {{bibref|3GPP-TS.36.213|Section 7.2.2}}.

This parameter corresponds to the K IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param k the input value
	 * @return this instance
	 */
	public PUCCH withK(Long k) {
		this.k = k;
		return this;
	}

	//</editor-fold>

}