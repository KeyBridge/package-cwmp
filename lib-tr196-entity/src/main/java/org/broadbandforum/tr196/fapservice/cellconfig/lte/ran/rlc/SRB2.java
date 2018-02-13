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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.rlc;

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
	 * This object contains parameters relating to the SRB2 (Signaling Radio Bearer 2) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.3.1}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.RLC.SRB2.")
@XmlRootElement(name = "SRB2")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.RLC.SRB2")
@XmlAccessorType(XmlAccessType.FIELD)
public class SRB2 {

	/**
	 * Indicates the whether default RLC configuration for SRB1 is used or not.

If {{true}}, the default RLC configuration is used as specified in {{bibref|3GPP-TS.36.331|Section 9.2.1.1}}. In this case, rest of the parameters defined under the current object are ignored by the CPE.

If {{false}}, rest of the parameters defined under the current object are used by the CPE for RLC configuration.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DefaultConfiguration")
	@CWMPParameter(access = "readWrite")
	public Boolean defaultConfiguration;
	/**
	 * {{list}} Each item is a timer between successive poll transmissions, specified in milliseconds, with a numeric range between 5 and 500 inclusive.  Only the multiple of 5 are valid in the range between 5 and 250 inclusive (i.e. 5, 10, 15, 20,... 250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e., 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-PollRetransmit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TPollRetransmit")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> tpollRetransmit;
	/**
	 * {{list}} Each item is a counter of PDUs between successive poll transmissions, specified in the number of PDUs. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to pollPDU IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates "infinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PollPDU")
	@CWMPParameter(access = "readWrite")
	@Size(min = 256, max = 256)
	public Long pollPDU;
	/**
	 * {{list}} Each item is a counter of PDU bytes transmitted between successive poll transmissions, specified in kilobytes. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}.  Corresponds to pollByte IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates infinite amount of kilobytes.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PollByte")
	@CWMPParameter(access = "readWrite")
	@Size(min = 3000, max = 3000)
	public Long pollByte;
	/**
	 * {{list}} Each item defines the maximum number of transmission retry used by the RLC entity to limit the number of retransmissions of an AMD PDU. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to maxRetxThreshold IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxRetxThreshold")
	@CWMPParameter(access = "readWrite")
	@Size(min = 32, max = 32)
	public Long maxRetxThreshold;
	/**
	 * {{list}} Each item defines a timer used by the receiving side of an RLC entity in order to detect loss of RLC PDUs at lower layer, specified in milliseconds, with a numeric range between 0 and 200 inclusive. Only the multiple of 5 are valid in the range between 0 and 100 inclusive (i.e. 0, 5, 10, 15,...,100), and only the multiple of 10 are valid in the range between 110 and 200 inclusive (110, 120, 130,...,200). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-Reordering IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.1.2.2. and 5.1.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TReordering")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> treordering;
	/**
	 * {{list}} Each item defines a timer used by the receiving side of an AM RLC entity in order to prohibit transmission of a STATUS PDU, specified in milliseconds, with a numeric range between 0 and 500 inclusive. Only the multiple of 5 are valid in the range between 0 and 250 inclusive (i.e. 0, 5, 10, 15,...,250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e. 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-StatusProhibit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.3}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TStatusProhibit")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	@XmlList
	public Collection<String> tstatusProhibit;

	public SRB2() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the indicates the whether default RLC configuration for SRB1 is used or not.

If {{true}}, the default RLC configuration is used as specified in {{bibref|3GPP-TS.36.331|Section 9.2.1.1}}. In this case, rest of the parameters defined under the current object are ignored by the CPE.

If {{false}}, rest of the parameters defined under the current object are used by the CPE for RLC configuration.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDefaultConfiguration() {
		return defaultConfiguration;
	}

	/**
	 * Set the indicates the whether default RLC configuration for SRB1 is used or not.

If {{true}}, the default RLC configuration is used as specified in {{bibref|3GPP-TS.36.331|Section 9.2.1.1}}. In this case, rest of the parameters defined under the current object are ignored by the CPE.

If {{false}}, rest of the parameters defined under the current object are used by the CPE for RLC configuration.
	 *
	 * @since 2.0
	 * @param defaultConfiguration the input value
	 */
	public void  setDefaultConfiguration(Boolean defaultConfiguration) {
		this.defaultConfiguration = defaultConfiguration;
	}

	/**
	 * Set the indicates the whether default RLC configuration for SRB1 is used or not.

If {{true}}, the default RLC configuration is used as specified in {{bibref|3GPP-TS.36.331|Section 9.2.1.1}}. In this case, rest of the parameters defined under the current object are ignored by the CPE.

If {{false}}, rest of the parameters defined under the current object are used by the CPE for RLC configuration.
	 *
	 * @since 2.0
	 * @param defaultConfiguration the input value
	 * @return this instance
	 */
	public SRB2 withDefaultConfiguration(Boolean defaultConfiguration) {
		this.defaultConfiguration = defaultConfiguration;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a timer between successive poll transmissions, specified in milliseconds, with a numeric range between 5 and 500 inclusive.  Only the multiple of 5 are valid in the range between 5 and 250 inclusive (i.e. 5, 10, 15, 20,... 250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e., 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-PollRetransmit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTpollRetransmit() {
		if (this.tpollRetransmit == null){ this.tpollRetransmit=new ArrayList<>();}
		return tpollRetransmit;
	}

	/**
	 * Set the {{list}} Each item is a timer between successive poll transmissions, specified in milliseconds, with a numeric range between 5 and 500 inclusive.  Only the multiple of 5 are valid in the range between 5 and 250 inclusive (i.e. 5, 10, 15, 20,... 250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e., 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-PollRetransmit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param tpollRetransmit the input value
	 */
	public void  setTpollRetransmit(Collection<String> tpollRetransmit) {
		this.tpollRetransmit = tpollRetransmit;
	}

	/**
	 * Set the {{list}} Each item is a timer between successive poll transmissions, specified in milliseconds, with a numeric range between 5 and 500 inclusive.  Only the multiple of 5 are valid in the range between 5 and 250 inclusive (i.e. 5, 10, 15, 20,... 250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e., 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-PollRetransmit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public SRB2 withTpollRetransmit(String string) {
		getTpollRetransmit().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is a counter of PDUs between successive poll transmissions, specified in the number of PDUs. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to pollPDU IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates "infinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPollPDU() {
		return pollPDU;
	}

	/**
	 * Set the {{list}} Each item is a counter of PDUs between successive poll transmissions, specified in the number of PDUs. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to pollPDU IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates "infinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pollPDU the input value
	 */
	public void  setPollPDU(Long pollPDU) {
		this.pollPDU = pollPDU;
	}

	/**
	 * Set the {{list}} Each item is a counter of PDUs between successive poll transmissions, specified in the number of PDUs. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to pollPDU IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates "infinity."

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pollPDU the input value
	 * @return this instance
	 */
	public SRB2 withPollPDU(Long pollPDU) {
		this.pollPDU = pollPDU;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a counter of PDU bytes transmitted between successive poll transmissions, specified in kilobytes. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}.  Corresponds to pollByte IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates infinite amount of kilobytes.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPollByte() {
		return pollByte;
	}

	/**
	 * Set the {{list}} Each item is a counter of PDU bytes transmitted between successive poll transmissions, specified in kilobytes. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}.  Corresponds to pollByte IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates infinite amount of kilobytes.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pollByte the input value
	 */
	public void  setPollByte(Long pollByte) {
		this.pollByte = pollByte;
	}

	/**
	 * Set the {{list}} Each item is a counter of PDU bytes transmitted between successive poll transmissions, specified in kilobytes. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}.  Corresponds to pollByte IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.2.1}}.  Value of 0 indicates infinite amount of kilobytes.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param pollByte the input value
	 * @return this instance
	 */
	public SRB2 withPollByte(Long pollByte) {
		this.pollByte = pollByte;
		return this;
	}

	/**
	 * Get the {{list}} Each item defines the maximum number of transmission retry used by the RLC entity to limit the number of retransmissions of an AMD PDU. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to maxRetxThreshold IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxRetxThreshold() {
		return maxRetxThreshold;
	}

	/**
	 * Set the {{list}} Each item defines the maximum number of transmission retry used by the RLC entity to limit the number of retransmissions of an AMD PDU. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to maxRetxThreshold IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param maxRetxThreshold the input value
	 */
	public void  setMaxRetxThreshold(Long maxRetxThreshold) {
		this.maxRetxThreshold = maxRetxThreshold;
	}

	/**
	 * Set the {{list}} Each item defines the maximum number of transmission retry used by the RLC entity to limit the number of retransmissions of an AMD PDU. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to maxRetxThreshold IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.1}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param maxRetxThreshold the input value
	 * @return this instance
	 */
	public SRB2 withMaxRetxThreshold(Long maxRetxThreshold) {
		this.maxRetxThreshold = maxRetxThreshold;
		return this;
	}

	/**
	 * Get the {{list}} Each item defines a timer used by the receiving side of an RLC entity in order to detect loss of RLC PDUs at lower layer, specified in milliseconds, with a numeric range between 0 and 200 inclusive. Only the multiple of 5 are valid in the range between 0 and 100 inclusive (i.e. 0, 5, 10, 15,...,100), and only the multiple of 10 are valid in the range between 110 and 200 inclusive (110, 120, 130,...,200). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-Reordering IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.1.2.2. and 5.1.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTreordering() {
		if (this.treordering == null){ this.treordering=new ArrayList<>();}
		return treordering;
	}

	/**
	 * Set the {{list}} Each item defines a timer used by the receiving side of an RLC entity in order to detect loss of RLC PDUs at lower layer, specified in milliseconds, with a numeric range between 0 and 200 inclusive. Only the multiple of 5 are valid in the range between 0 and 100 inclusive (i.e. 0, 5, 10, 15,...,100), and only the multiple of 10 are valid in the range between 110 and 200 inclusive (110, 120, 130,...,200). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-Reordering IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.1.2.2. and 5.1.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param treordering the input value
	 */
	public void  setTreordering(Collection<String> treordering) {
		this.treordering = treordering;
	}

	/**
	 * Set the {{list}} Each item defines a timer used by the receiving side of an RLC entity in order to detect loss of RLC PDUs at lower layer, specified in milliseconds, with a numeric range between 0 and 200 inclusive. Only the multiple of 5 are valid in the range between 0 and 100 inclusive (i.e. 0, 5, 10, 15,...,100), and only the multiple of 10 are valid in the range between 110 and 200 inclusive (110, 120, 130,...,200). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-Reordering IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.1.2.2. and 5.1.3.2}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public SRB2 withTreordering(String string) {
		getTreordering().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item defines a timer used by the receiving side of an AM RLC entity in order to prohibit transmission of a STATUS PDU, specified in milliseconds, with a numeric range between 0 and 500 inclusive. Only the multiple of 5 are valid in the range between 0 and 250 inclusive (i.e. 0, 5, 10, 15,...,250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e. 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-StatusProhibit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.3}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getTstatusProhibit() {
		if (this.tstatusProhibit == null){ this.tstatusProhibit=new ArrayList<>();}
		return tstatusProhibit;
	}

	/**
	 * Set the {{list}} Each item defines a timer used by the receiving side of an AM RLC entity in order to prohibit transmission of a STATUS PDU, specified in milliseconds, with a numeric range between 0 and 500 inclusive. Only the multiple of 5 are valid in the range between 0 and 250 inclusive (i.e. 0, 5, 10, 15,...,250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e. 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-StatusProhibit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.3}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param tstatusProhibit the input value
	 */
	public void  setTstatusProhibit(Collection<String> tstatusProhibit) {
		this.tstatusProhibit = tstatusProhibit;
	}

	/**
	 * Set the {{list}} Each item defines a timer used by the receiving side of an AM RLC entity in order to prohibit transmission of a STATUS PDU, specified in milliseconds, with a numeric range between 0 and 500 inclusive. Only the multiple of 5 are valid in the range between 0 and 250 inclusive (i.e. 0, 5, 10, 15,...,250), and only the multiple of 50 are valid in the range between 300 and 500 inclusive (i.e. 300, 350, 400, 450, 500). If the value is other than these, the CPE MUST reject the value. In case there is more than one item in the list, the first item contains the most preferred value.

This parameter is valid only if {{param|DefaultConfiguration}} paramter under the current object is set to {{false}}. Corresponds to t-StatusProhibit IE specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.322|Section 5.2.3}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public SRB2 withTstatusProhibit(String string) {
		getTstatusProhibit().add(string);
		return this;
	}

	//</editor-fold>

}