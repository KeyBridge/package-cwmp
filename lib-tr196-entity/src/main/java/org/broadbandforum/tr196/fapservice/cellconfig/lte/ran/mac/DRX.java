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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran.mac;

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
	 * This object contains parameters relating to the DRX (Discontinuous Reception) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.2}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.MAC.DRX.")
@XmlRootElement(name = "DRX")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.MAC.DRX")
@XmlAccessorType(XmlAccessType.FIELD)
public class DRX {

	/**
	 * Specifies whether DRX operation is enabled or not. If {{true}}, DRX operation is enabled. If {{false}}, DRX operation is not enabled.

Corresponds to drx-Configuration IE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DRXEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean drxEnabled;
	/**
	 * {{list}} Each item is the DRX cycle during which UE actively monitors PDCCH, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter onDurationTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "OnDurationTimer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> ondurationTimer;
	/**
	 * {{list}} Each item defines the number of inactive consecutive PDCCH sub-frame(s) that will activate short DRX cycle, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200, 300, 500, 750, 1280, 1920, 2560.  In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter drx-InactivityTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DRXInactivityTimer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 128)
	@XmlList
	public Collection<String> drxInactivityTimer;
	/**
	 * {{list}} Each item defines the maximum number of consecutive PDCCH sub-frame(s) UE MUST remain active expecting a DL retransmission, specified in number of PDCCH sub-frames. In case there is more than one item in the list, the first item contains the most preferred value. The timer is started when a HARQ RTT Timer expires and the data in the soft buffer of the corresponding HARQ process was not successfully decoded. There is one timer for each active HARQ process.  Corresponds to parameter drx-RetransmissionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DRXRetransmissionTimer")
	@CWMPParameter(access = "readWrite")
	@Size(min = 33, max = 33)
	public Long drxRetransmissionTimer;
	/**
	 * {{list}} Each item is long DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, this value MUST be a multiple of the {{param|ShortDRXCycle}} value. Corresponds to longDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}} and longDRX-CycleStartOffset specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LongDRXCycle")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2560, max = 2560)
	public Long longDRXCycle;
	/**
	 * {{list}} Each item defines the starting frame of the DRX cycle within the long DRX cycle, with a numeric range between 0 and 2559 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The valid value range is dependent on {{param|LongDRXCycle}} parameter which defines the upper bound of this range, i.e., range definition is [0: ({{param|LongDRXCycle}}-1)]. Corresponds to drxStartOffset parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}. 

Use of values bigger than ({{param|LongDRXCycle}}-1) MUST be rejected by the CPE.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DRXStartOffset")
	@CWMPParameter(access = "readWrite")
	@Size(max = 512)
	@XmlList
	public Collection<String> drxStartOffset;
	/**
	 * {{list}} Each item is the short DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, the value of {{param|LongDRXCycle}} MUST be a multiple of the {{param}} value. Corresponds to shortDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ShortDRXCycle")
	@CWMPParameter(access = "readWrite")
	@Size(min = 640, max = 640)
	public Long shortDRXCycle;
	/**
	 * {{list}} Each item defined the duration of the short DRX cycle in multiples of {{param|ShortDRXCycle}} parameter, specified in number of sub-frames, with a numeric range between 1 and 16 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Denotes the number of consecutive sub-frame(s)the UE shall follow the short DRX cycle after the DRX Inactivity Timer has expired. Corresponds to drxShortCycleTimer parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "DRXShortCycleTimer")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	@XmlList
	public Collection<String> drxShortCycleTimer;

	public DRX() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies whether DRX operation is enabled or not. If {{true}}, DRX operation is enabled. If {{false}}, DRX operation is not enabled.

Corresponds to drx-Configuration IE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isDrxEnabled() {
		return drxEnabled;
	}

	/**
	 * Set the specifies whether DRX operation is enabled or not. If {{true}}, DRX operation is enabled. If {{false}}, DRX operation is not enabled.

Corresponds to drx-Configuration IE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param drxEnabled the input value
	 */
	public void  setDrxEnabled(Boolean drxEnabled) {
		this.drxEnabled = drxEnabled;
	}

	/**
	 * Set the specifies whether DRX operation is enabled or not. If {{true}}, DRX operation is enabled. If {{false}}, DRX operation is not enabled.

Corresponds to drx-Configuration IE defined in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.
	 *
	 * @since 2.0
	 * @param drxEnabled the input value
	 * @return this instance
	 */
	public DRX withDrxEnabled(Boolean drxEnabled) {
		this.drxEnabled = drxEnabled;
		return this;
	}

	/**
	 * Get the {{list}} Each item is the DRX cycle during which UE actively monitors PDCCH, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter onDurationTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getOndurationTimer() {
		if (this.ondurationTimer == null){ this.ondurationTimer=new ArrayList<>();}
		return ondurationTimer;
	}

	/**
	 * Set the {{list}} Each item is the DRX cycle during which UE actively monitors PDCCH, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter onDurationTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param ondurationTimer the input value
	 */
	public void  setOndurationTimer(Collection<String> ondurationTimer) {
		this.ondurationTimer = ondurationTimer;
	}

	/**
	 * Set the {{list}} Each item is the DRX cycle during which UE actively monitors PDCCH, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200. In case there is more than one item in the list, the first item contains the most preferred value.  Corresponds to parameter onDurationTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public DRX withOndurationTimer(String string) {
		getOndurationTimer().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item defines the number of inactive consecutive PDCCH sub-frame(s) that will activate short DRX cycle, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200, 300, 500, 750, 1280, 1920, 2560.  In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter drx-InactivityTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDrxInactivityTimer() {
		if (this.drxInactivityTimer == null){ this.drxInactivityTimer=new ArrayList<>();}
		return drxInactivityTimer;
	}

	/**
	 * Set the {{list}} Each item defines the number of inactive consecutive PDCCH sub-frame(s) that will activate short DRX cycle, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200, 300, 500, 750, 1280, 1920, 2560.  In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter drx-InactivityTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param drxInactivityTimer the input value
	 */
	public void  setDrxInactivityTimer(Collection<String> drxInactivityTimer) {
		this.drxInactivityTimer = drxInactivityTimer;
	}

	/**
	 * Set the {{list}} Each item defines the number of inactive consecutive PDCCH sub-frame(s) that will activate short DRX cycle, specified in number of PDCCH sub-frames, from the list of 1, 2, 3, 4, 5, 6, 8, 10, 20, 30, 40, 50, 60, 80, 100, 200, 300, 500, 750, 1280, 1920, 2560.  In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter drx-InactivityTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public DRX withDrxInactivityTimer(String string) {
		getDrxInactivityTimer().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item defines the maximum number of consecutive PDCCH sub-frame(s) UE MUST remain active expecting a DL retransmission, specified in number of PDCCH sub-frames. In case there is more than one item in the list, the first item contains the most preferred value. The timer is started when a HARQ RTT Timer expires and the data in the soft buffer of the corresponding HARQ process was not successfully decoded. There is one timer for each active HARQ process.  Corresponds to parameter drx-RetransmissionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getDrxRetransmissionTimer() {
		return drxRetransmissionTimer;
	}

	/**
	 * Set the {{list}} Each item defines the maximum number of consecutive PDCCH sub-frame(s) UE MUST remain active expecting a DL retransmission, specified in number of PDCCH sub-frames. In case there is more than one item in the list, the first item contains the most preferred value. The timer is started when a HARQ RTT Timer expires and the data in the soft buffer of the corresponding HARQ process was not successfully decoded. There is one timer for each active HARQ process.  Corresponds to parameter drx-RetransmissionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param drxRetransmissionTimer the input value
	 */
	public void  setDrxRetransmissionTimer(Long drxRetransmissionTimer) {
		this.drxRetransmissionTimer = drxRetransmissionTimer;
	}

	/**
	 * Set the {{list}} Each item defines the maximum number of consecutive PDCCH sub-frame(s) UE MUST remain active expecting a DL retransmission, specified in number of PDCCH sub-frames. In case there is more than one item in the list, the first item contains the most preferred value. The timer is started when a HARQ RTT Timer expires and the data in the soft buffer of the corresponding HARQ process was not successfully decoded. There is one timer for each active HARQ process.  Corresponds to parameter drx-RetransmissionTimer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param drxRetransmissionTimer the input value
	 * @return this instance
	 */
	public DRX withDrxRetransmissionTimer(Long drxRetransmissionTimer) {
		this.drxRetransmissionTimer = drxRetransmissionTimer;
		return this;
	}

	/**
	 * Get the {{list}} Each item is long DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, this value MUST be a multiple of the {{param|ShortDRXCycle}} value. Corresponds to longDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}} and longDRX-CycleStartOffset specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLongDRXCycle() {
		return longDRXCycle;
	}

	/**
	 * Set the {{list}} Each item is long DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, this value MUST be a multiple of the {{param|ShortDRXCycle}} value. Corresponds to longDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}} and longDRX-CycleStartOffset specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param longDRXCycle the input value
	 */
	public void  setLongDRXCycle(Long longDRXCycle) {
		this.longDRXCycle = longDRXCycle;
	}

	/**
	 * Set the {{list}} Each item is long DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, this value MUST be a multiple of the {{param|ShortDRXCycle}} value. Corresponds to longDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}} and longDRX-CycleStartOffset specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param longDRXCycle the input value
	 * @return this instance
	 */
	public DRX withLongDRXCycle(Long longDRXCycle) {
		this.longDRXCycle = longDRXCycle;
		return this;
	}

	/**
	 * Get the {{list}} Each item defines the starting frame of the DRX cycle within the long DRX cycle, with a numeric range between 0 and 2559 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The valid value range is dependent on {{param|LongDRXCycle}} parameter which defines the upper bound of this range, i.e., range definition is [0: ({{param|LongDRXCycle}}-1)]. Corresponds to drxStartOffset parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}. 

Use of values bigger than ({{param|LongDRXCycle}}-1) MUST be rejected by the CPE.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDrxStartOffset() {
		if (this.drxStartOffset == null){ this.drxStartOffset=new ArrayList<>();}
		return drxStartOffset;
	}

	/**
	 * Set the {{list}} Each item defines the starting frame of the DRX cycle within the long DRX cycle, with a numeric range between 0 and 2559 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The valid value range is dependent on {{param|LongDRXCycle}} parameter which defines the upper bound of this range, i.e., range definition is [0: ({{param|LongDRXCycle}}-1)]. Corresponds to drxStartOffset parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}. 

Use of values bigger than ({{param|LongDRXCycle}}-1) MUST be rejected by the CPE.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param drxStartOffset the input value
	 */
	public void  setDrxStartOffset(Collection<String> drxStartOffset) {
		this.drxStartOffset = drxStartOffset;
	}

	/**
	 * Set the {{list}} Each item defines the starting frame of the DRX cycle within the long DRX cycle, with a numeric range between 0 and 2559 inclusive. In case there is more than one item in the list, the first item contains the most preferred value. The valid value range is dependent on {{param|LongDRXCycle}} parameter which defines the upper bound of this range, i.e., range definition is [0: ({{param|LongDRXCycle}}-1)]. Corresponds to drxStartOffset parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}. 

Use of values bigger than ({{param|LongDRXCycle}}-1) MUST be rejected by the CPE.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public DRX withDrxStartOffset(String string) {
		getDrxStartOffset().add(string);
		return this;
	}

	/**
	 * Get the {{list}} Each item is the short DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, the value of {{param|LongDRXCycle}} MUST be a multiple of the {{param}} value. Corresponds to shortDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getShortDRXCycle() {
		return shortDRXCycle;
	}

	/**
	 * Set the {{list}} Each item is the short DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, the value of {{param|LongDRXCycle}} MUST be a multiple of the {{param}} value. Corresponds to shortDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param shortDRXCycle the input value
	 */
	public void  setShortDRXCycle(Long shortDRXCycle) {
		this.shortDRXCycle = shortDRXCycle;
	}

	/**
	 * Set the {{list}} Each item is the short DRX Cycle value, specified in number of sub-frames.  In case there is more than one item in the list, the first item contains the most preferred value. If shortDRX-Cycle is configured, the value of {{param|LongDRXCycle}} MUST be a multiple of the {{param}} value. Corresponds to shortDRX-Cycle parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param shortDRXCycle the input value
	 * @return this instance
	 */
	public DRX withShortDRXCycle(Long shortDRXCycle) {
		this.shortDRXCycle = shortDRXCycle;
		return this;
	}

	/**
	 * Get the {{list}} Each item defined the duration of the short DRX cycle in multiples of {{param|ShortDRXCycle}} parameter, specified in number of sub-frames, with a numeric range between 1 and 16 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Denotes the number of consecutive sub-frame(s)the UE shall follow the short DRX cycle after the DRX Inactivity Timer has expired. Corresponds to drxShortCycleTimer parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getDrxShortCycleTimer() {
		if (this.drxShortCycleTimer == null){ this.drxShortCycleTimer=new ArrayList<>();}
		return drxShortCycleTimer;
	}

	/**
	 * Set the {{list}} Each item defined the duration of the short DRX cycle in multiples of {{param|ShortDRXCycle}} parameter, specified in number of sub-frames, with a numeric range between 1 and 16 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Denotes the number of consecutive sub-frame(s)the UE shall follow the short DRX cycle after the DRX Inactivity Timer has expired. Corresponds to drxShortCycleTimer parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param drxShortCycleTimer the input value
	 */
	public void  setDrxShortCycleTimer(Collection<String> drxShortCycleTimer) {
		this.drxShortCycleTimer = drxShortCycleTimer;
	}

	/**
	 * Set the {{list}} Each item defined the duration of the short DRX cycle in multiples of {{param|ShortDRXCycle}} parameter, specified in number of sub-frames, with a numeric range between 1 and 16 inclusive. In case there is more than one item in the list, the first item contains the most preferred value.  Denotes the number of consecutive sub-frame(s)the UE shall follow the short DRX cycle after the DRX Inactivity Timer has expired. Corresponds to drxShortCycleTimer parameter specified in {{bibref|3GPP-TS.36.321|Section 5.7}}.

The multiplicity of the {{param}} values can also be expressed by defining a range using ".." (two periods) between two values. In this case, the combination of two values defines the lower-bound and upper-bound of the range inclusive. If this notation is used, then the list contains at least 2 items: "<preferred-value>,<lower-bound>..<upper-bound>".

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public DRX withDrxShortCycleTimer(String string) {
		getDrxShortCycleTimer().add(string);
		return this;
	}

	//</editor-fold>

}