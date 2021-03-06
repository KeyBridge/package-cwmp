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
	 * This object contains parameters relating to the PDSCH (Physical Downlink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.2}}).
	 *
	 * @since TR196 v2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.PDSCH.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY.PDSCH")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.PDSCH")
@XmlAccessorType(XmlAccessType.FIELD)
public class PDSCH {

	/**
	 * {{list}} Each item is a Eb/Ea value with a numeric range between 0 and 3 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of this parameter is the same for all UEs in the cell. Eb repsents EPRE of PDSCH REs type B, i.e. REs in OFDM symbols that include reference symbols, as specified in {{bibref|3GPP-TS.36.213|Section 5.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Pb")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> pb;
	/**
	 * {{list}} Each item is a Ea/Ers value. In case there is more than one item in the list, the first item contains the most preferred value. Ea represents EPRE of PDSCH REs type A, i.e. REs in OFDM symbols that do not include reference symbols.  Ers represents EPRE of reference symbols REs. Specified in {{bibref|3GPP-TS.36.213|Section 5.2}}. Actual values of range are -6.00 to 3.00dB. The value of each item in {{param}} divided by 100 yields the actual value.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Pa")
	@CWMPParameter(access = "readWrite")
	@Size(min = 300, max = 300)
	public Integer pa;

	public PDSCH() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is a Eb/Ea value with a numeric range between 0 and 3 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of this parameter is the same for all UEs in the cell. Eb repsents EPRE of PDSCH REs type B, i.e. REs in OFDM symbols that include reference symbols, as specified in {{bibref|3GPP-TS.36.213|Section 5.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getPb() {
		if (this.pb == null){ this.pb=new ArrayList<>();}
		return pb;
	}

	/**
	 * Set the {{list}} Each item is a Eb/Ea value with a numeric range between 0 and 3 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of this parameter is the same for all UEs in the cell. Eb repsents EPRE of PDSCH REs type B, i.e. REs in OFDM symbols that include reference symbols, as specified in {{bibref|3GPP-TS.36.213|Section 5.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pb the input value
	 */
	public void  setPb(Collection<String> pb) {
		this.pb = pb;
	}

	/**
	 * Set the {{list}} Each item is a Eb/Ea value with a numeric range between 0 and 3 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The value of this parameter is the same for all UEs in the cell. Eb repsents EPRE of PDSCH REs type B, i.e. REs in OFDM symbols that include reference symbols, as specified in {{bibref|3GPP-TS.36.213|Section 5.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PDSCH withPb(String string) {
		getPb().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a Ea/Ers value. In case there is more than one item in the list, the first item contains the most preferred value. Ea represents EPRE of PDSCH REs type A, i.e. REs in OFDM symbols that do not include reference symbols.  Ers represents EPRE of reference symbols REs. Specified in {{bibref|3GPP-TS.36.213|Section 5.2}}. Actual values of range are -6.00 to 3.00dB. The value of each item in {{param}} divided by 100 yields the actual value.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getPa() {
		return pa;
	}

	/**
	 * Set the {{list}} Each item is a Ea/Ers value. In case there is more than one item in the list, the first item contains the most preferred value. Ea represents EPRE of PDSCH REs type A, i.e. REs in OFDM symbols that do not include reference symbols.  Ers represents EPRE of reference symbols REs. Specified in {{bibref|3GPP-TS.36.213|Section 5.2}}. Actual values of range are -6.00 to 3.00dB. The value of each item in {{param}} divided by 100 yields the actual value.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pa the input value
	 */
	public void  setPa(Integer pa) {
		this.pa = pa;
	}

	/**
	 * Set the {{list}} Each item is a Ea/Ers value. In case there is more than one item in the list, the first item contains the most preferred value. Ea represents EPRE of PDSCH REs type A, i.e. REs in OFDM symbols that do not include reference symbols.  Ers represents EPRE of reference symbols REs. Specified in {{bibref|3GPP-TS.36.213|Section 5.2}}. Actual values of range are -6.00 to 3.00dB. The value of each item in {{param}} divided by 100 yields the actual value.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pa the input value
	 * @return this instance
	 */
	public PDSCH withPa(Integer pa) {
		this.pa = pa;
		return this;
	}

	//</editor-fold>

}