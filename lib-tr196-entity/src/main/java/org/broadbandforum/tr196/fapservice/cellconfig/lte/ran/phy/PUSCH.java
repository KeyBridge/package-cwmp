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
import org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.phy.pusch.ULRS;

	/**
	 * This object contains parameters relating to the PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.PUSCH.")
@XmlRootElement(name = "FAPService.CellConfig.LTE.RAN.PHY.PUSCH")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.PHY.PUSCH")
@XmlAccessorType(XmlAccessType.FIELD)
public class PUSCH {

	/**
	 * Defines the number of sub-bands. This parameter corresponds to n-SB parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NSB parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NSB")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 4)
	public Long nsb;
	/**
	 * Indicates if hopping is "inter-subframe" or "intra and inter-subframe". Corresponds to hoppingMode parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Hopping-mode parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HoppingMode")
	@CWMPParameter(access = "readWrite")
	public String hoppingMode;
	/**
	 * {{list}} Each item is a value to compute the set of physical resource blocks to be used for transmission on PUSCH if uplink frequency hopping mode is enabled, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.   This parameter corresponds to pusch-HoppingOffset parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRBHO parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "HoppingOffset")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> hoppingOffset;
	/**
	 * Indicates whether 64QAM is allowed or not. If {{true}}, 64QAM is allowed. If {{false}}, 64QAM is not allowed.

Corresponds to enable64QAM parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable64QAM")
	public Boolean enable64QAM;
	/**
	 * This object contains parameters relating to the ULRS (Uplink Reference Signal) of PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6.1}}).
	 */
	@XmlElement(name = "ULRS")
	public ULRS ulrS;

	public PUSCH() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the defines the number of sub-bands. This parameter corresponds to n-SB parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NSB parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNsb() {
		return nsb;
	}

	/**
	 * Set the defines the number of sub-bands. This parameter corresponds to n-SB parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NSB parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 * @param nsb the input value
	 */
	public void  setNsb(Long nsb) {
		this.nsb = nsb;
	}

	/**
	 * Set the defines the number of sub-bands. This parameter corresponds to n-SB parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NSB parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 * @param nsb the input value
	 * @return this instance
	 */
	public PUSCH withNsb(Long nsb) {
		this.nsb = nsb;
		return this;
	}

	/**
	 * Get the indicates if hopping is "inter-subframe" or "intra and inter-subframe". Corresponds to hoppingMode parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Hopping-mode parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getHoppingMode() {
		return hoppingMode;
	}

	/**
	 * Set the indicates if hopping is "inter-subframe" or "intra and inter-subframe". Corresponds to hoppingMode parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Hopping-mode parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 * @param hoppingMode the input value
	 */
	public void  setHoppingMode(String hoppingMode) {
		this.hoppingMode = hoppingMode;
	}

	/**
	 * Set the indicates if hopping is "inter-subframe" or "intra and inter-subframe". Corresponds to hoppingMode parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Hopping-mode parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.
	 *
	 * @since 2.0
	 * @param hoppingMode the input value
	 * @return this instance
	 */
	public PUSCH withHoppingMode(String hoppingMode) {
		this.hoppingMode = hoppingMode;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a value to compute the set of physical resource blocks to be used for transmission on PUSCH if uplink frequency hopping mode is enabled, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.   This parameter corresponds to pusch-HoppingOffset parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRBHO parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getHoppingOffset() {
		if (this.hoppingOffset == null){ this.hoppingOffset=new ArrayList<>();}
		return hoppingOffset;
	}

	/**
	 * Set the {{list}} Each item is a value to compute the set of physical resource blocks to be used for transmission on PUSCH if uplink frequency hopping mode is enabled, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.   This parameter corresponds to pusch-HoppingOffset parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRBHO parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param hoppingOffset the input value
	 */
	public void  setHoppingOffset(Collection<String> hoppingOffset) {
		this.hoppingOffset = hoppingOffset;
	}

	/**
	 * Set the {{list}} Each item is a value to compute the set of physical resource blocks to be used for transmission on PUSCH if uplink frequency hopping mode is enabled, with a numeric range between 0 and 98 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.   This parameter corresponds to pusch-HoppingOffset parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and NRBHO parameter specified in {{bibref|3GPP-TS.36.211|Section 5.3.4}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public PUSCH withHoppingOffset(String string) {
		getHoppingOffset().add(string);
		return this;
	}

	/**
	 * Get the indicates whether 64QAM is allowed or not. If {{true}}, 64QAM is allowed. If {{false}}, 64QAM is not allowed.

Corresponds to enable64QAM parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable64QAM() {
		return enable64QAM;
	}

	/**
	 * Set the indicates whether 64QAM is allowed or not. If {{true}}, 64QAM is allowed. If {{false}}, 64QAM is not allowed.

Corresponds to enable64QAM parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param enable64QAM the input value
	 */
	public void  setEnable64QAM(Boolean enable64QAM) {
		this.enable64QAM = enable64QAM;
	}

	/**
	 * Set the indicates whether 64QAM is allowed or not. If {{true}}, 64QAM is allowed. If {{false}}, 64QAM is not allowed.

Corresponds to enable64QAM parameter specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param enable64QAM the input value
	 * @return this instance
	 */
	public PUSCH withEnable64QAM(Boolean enable64QAM) {
		this.enable64QAM = enable64QAM;
		return this;
	}

	/**
	 * Get the this object contains parameters relating to the ULRS (Uplink Reference Signal) of PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6.1}}).
	 *
	 * @return the value
	 */
	public ULRS getUlrS() {
		return ulrS;
	}

	/**
	 * Set the this object contains parameters relating to the ULRS (Uplink Reference Signal) of PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6.1}}).
	 *
	 * @param ulrS the input value
	 */
	public void  setUlrS(ULRS ulrS) {
		this.ulrS = ulrS;
	}

	/**
	 * Set the this object contains parameters relating to the ULRS (Uplink Reference Signal) of PUSCH (Physical Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.6.1}}).
	 *
	 * @param ulrS the input value
	 * @return this instance
	 */
	public PUSCH withUlrS(ULRS ulrS) {
		this.ulrS = ulrS;
		return this;
	}

	//</editor-fold>

}