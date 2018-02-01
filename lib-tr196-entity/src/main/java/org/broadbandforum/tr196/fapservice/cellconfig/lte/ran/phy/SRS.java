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
	 * This object contains parameters relating to the UL SRS (Sounding Reference Signal) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.1.3}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.PHY.SRS.")
public class SRS {

	/**
	 * Indicates whether UL SRS (Sounding RS) is enabled or not.

If {{true}}, UL Sounding RS is enabled. If {{false}}, UL Sounding RS is disabled.

Corresponds to SoundingRS-UL-ConfigCommonIE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SRSEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean srsEnabled;
	/**
	 * {{list}} Each item is a index into tables of cell specific SRS Bandwidth Configuration, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. SRS Bandwidth Configuration tables are specified in {{bibref|3GPP-TS.36.211|Table 5.5.3.2-1, 5.5.3.2-2, 5.5.3.2-3 and 5.5.3.2– 4}}. Corresponds to srs-BandwidthConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SRSBandwidthConfig")
	@CWMPParameter(access = "readWrite")
	@Size(max = 32)
	@XmlList
	public Collection<String> srsBandwidthConfig;
	/**
	 * Defines whether reconfiguration of SRS applies to UpPTS or not.

If {{true}}, SRS applies to UpPTS. If {{false}}, SRS does not apply to UpPTS.

Corresponds to srs-MaxUpPts specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and srsMaxUpPts specified in {{bibref|3GPP-TS.36.211|Section 5.5.3.2}}.

This parameter is applicable to TDD mode only.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SRSMaxUpPTS")
	@CWMPParameter(access = "readWrite")
	public Boolean srsMaxUpPTS;
	/**
	 * Defines whether a UE can simultaneously transmit SRS and HARQ ACK/NACK or not.

If {{true}}, simultaneous transmission is allowed. If {{false}}, simultaneous transmission is not allowed.

Corresponds to ackNackSRS-SimultaneousTransmission specfied in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Simultaneous-AN-and-SRS specified in {{bibref|3GPP-TS.36.213|Section 8.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AckNackSRSSimultaneousTransmission")
	@CWMPParameter(access = "readWrite")
	public Boolean ackNackSRSSimultaneousTransmission;

	public SRS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates whether UL SRS (Sounding RS) is enabled or not.

If {{true}}, UL Sounding RS is enabled. If {{false}}, UL Sounding RS is disabled.

Corresponds to SoundingRS-UL-ConfigCommonIE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSrsEnabled() {
		return srsEnabled;
	}

	/**
	 * Set the indicates whether UL SRS (Sounding RS) is enabled or not.

If {{true}}, UL Sounding RS is enabled. If {{false}}, UL Sounding RS is disabled.

Corresponds to SoundingRS-UL-ConfigCommonIE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param srsEnabled the input value
	 */
	public void  setSrsEnabled(Boolean srsEnabled) {
		this.srsEnabled = srsEnabled;
	}

	/**
	 * Set the indicates whether UL SRS (Sounding RS) is enabled or not.

If {{true}}, UL Sounding RS is enabled. If {{false}}, UL Sounding RS is disabled.

Corresponds to SoundingRS-UL-ConfigCommonIE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param srsEnabled the input value
	 * @return this instance
	 */
	public SRS withSrsEnabled(Boolean srsEnabled) {
		this.srsEnabled = srsEnabled;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a index into tables of cell specific SRS Bandwidth Configuration, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. SRS Bandwidth Configuration tables are specified in {{bibref|3GPP-TS.36.211|Table 5.5.3.2-1, 5.5.3.2-2, 5.5.3.2-3 and 5.5.3.2– 4}}. Corresponds to srs-BandwidthConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSrsBandwidthConfig() {
		if (this.srsBandwidthConfig == null){ this.srsBandwidthConfig=new ArrayList<>();}
		return srsBandwidthConfig;
	}

	/**
	 * Set the {{list}} Each item is a index into tables of cell specific SRS Bandwidth Configuration, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. SRS Bandwidth Configuration tables are specified in {{bibref|3GPP-TS.36.211|Table 5.5.3.2-1, 5.5.3.2-2, 5.5.3.2-3 and 5.5.3.2– 4}}. Corresponds to srs-BandwidthConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param srsBandwidthConfig the input value
	 */
	public void  setSrsBandwidthConfig(Collection<String> srsBandwidthConfig) {
		this.srsBandwidthConfig = srsBandwidthConfig;
	}

	/**
	 * Set the {{list}} Each item is a index into tables of cell specific SRS Bandwidth Configuration, with a numeric range between 0 and 7 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. SRS Bandwidth Configuration tables are specified in {{bibref|3GPP-TS.36.211|Table 5.5.3.2-1, 5.5.3.2-2, 5.5.3.2-3 and 5.5.3.2– 4}}. Corresponds to srs-BandwidthConfig IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public SRS withSrsBandwidthConfig(String string) {
		getSrsBandwidthConfig().add(string);
		return this;
	}

	/**
	 * Get the defines whether reconfiguration of SRS applies to UpPTS or not.

If {{true}}, SRS applies to UpPTS. If {{false}}, SRS does not apply to UpPTS.

Corresponds to srs-MaxUpPts specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and srsMaxUpPts specified in {{bibref|3GPP-TS.36.211|Section 5.5.3.2}}.

This parameter is applicable to TDD mode only.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isSrsMaxUpPTS() {
		return srsMaxUpPTS;
	}

	/**
	 * Set the defines whether reconfiguration of SRS applies to UpPTS or not.

If {{true}}, SRS applies to UpPTS. If {{false}}, SRS does not apply to UpPTS.

Corresponds to srs-MaxUpPts specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and srsMaxUpPts specified in {{bibref|3GPP-TS.36.211|Section 5.5.3.2}}.

This parameter is applicable to TDD mode only.
	 *
	 * @since 2.0
	 * @param srsMaxUpPTS the input value
	 */
	public void  setSrsMaxUpPTS(Boolean srsMaxUpPTS) {
		this.srsMaxUpPTS = srsMaxUpPTS;
	}

	/**
	 * Set the defines whether reconfiguration of SRS applies to UpPTS or not.

If {{true}}, SRS applies to UpPTS. If {{false}}, SRS does not apply to UpPTS.

Corresponds to srs-MaxUpPts specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and srsMaxUpPts specified in {{bibref|3GPP-TS.36.211|Section 5.5.3.2}}.

This parameter is applicable to TDD mode only.
	 *
	 * @since 2.0
	 * @param srsMaxUpPTS the input value
	 * @return this instance
	 */
	public SRS withSrsMaxUpPTS(Boolean srsMaxUpPTS) {
		this.srsMaxUpPTS = srsMaxUpPTS;
		return this;
	}

	/**
	 * Get the defines whether a UE can simultaneously transmit SRS and HARQ ACK/NACK or not.

If {{true}}, simultaneous transmission is allowed. If {{false}}, simultaneous transmission is not allowed.

Corresponds to ackNackSRS-SimultaneousTransmission specfied in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Simultaneous-AN-and-SRS specified in {{bibref|3GPP-TS.36.213|Section 8.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isAckNackSRSSimultaneousTransmission() {
		return ackNackSRSSimultaneousTransmission;
	}

	/**
	 * Set the defines whether a UE can simultaneously transmit SRS and HARQ ACK/NACK or not.

If {{true}}, simultaneous transmission is allowed. If {{false}}, simultaneous transmission is not allowed.

Corresponds to ackNackSRS-SimultaneousTransmission specfied in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Simultaneous-AN-and-SRS specified in {{bibref|3GPP-TS.36.213|Section 8.2}}.
	 *
	 * @since 2.0
	 * @param ackNackSRSSimultaneousTransmission the input value
	 */
	public void  setAckNackSRSSimultaneousTransmission(Boolean ackNackSRSSimultaneousTransmission) {
		this.ackNackSRSSimultaneousTransmission = ackNackSRSSimultaneousTransmission;
	}

	/**
	 * Set the defines whether a UE can simultaneously transmit SRS and HARQ ACK/NACK or not.

If {{true}}, simultaneous transmission is allowed. If {{false}}, simultaneous transmission is not allowed.

Corresponds to ackNackSRS-SimultaneousTransmission specfied in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and Simultaneous-AN-and-SRS specified in {{bibref|3GPP-TS.36.213|Section 8.2}}.
	 *
	 * @since 2.0
	 * @param ackNackSRSSimultaneousTransmission the input value
	 * @return this instance
	 */
	public SRS withAckNackSRSSimultaneousTransmission(Boolean ackNackSRSSimultaneousTransmission) {
		this.ackNackSRSSimultaneousTransmission = ackNackSRSSimultaneousTransmission;
		return this;
	}

	//</editor-fold>

}