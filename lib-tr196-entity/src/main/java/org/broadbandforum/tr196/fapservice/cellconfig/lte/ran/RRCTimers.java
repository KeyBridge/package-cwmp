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
package org.broadbandforum.tr196.fapservice.cellconfig.lte.ran;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to the RRC timers and constants (see {{bibref|3GPP-TS.32.592|Section 6.1.6.1}}) and (see {{bibref|3GPP-TS.32.592|Section 6.1.6.2}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.RRCTimers.")
public class RRCTimers {

	/**
	 * {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t300 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T300")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2000, max = 2000)
	public Long t300;
	/**
	 * {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionReestablishmentRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t301 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T301")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2000, max = 2000)
	public Long t301;
	/**
	 * Time to wait in milliseconds for cell re-selection or RRConnectionSetup after RRCConnectionReject. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T302")
	@CWMPParameter(access = "readWrite", units = "milliseconds")
	@Size(min = 2000, max = 2000)
	public Long t302;
	/**
	 * {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE MobilityControlInfo in RRCConnectionReconfiguration message in {{bibref|3GPP-TS.36.331|Section 5.3.5.4 and Section 6.3.4}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T304EUTRA")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2000, max = 2000)
	public Long t304EUTRA;
	/**
	 * {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE CellChangeOrder in MobilityFromEUTRACommand message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T304IRAT")
	@CWMPParameter(access = "readWrite")
	@Size(min = 8000, max = 8000)
	public Long t304IRAT;
	/**
	 * {{list}} Each item is a RLF declaration timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t310 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T310")
	@CWMPParameter(access = "readWrite")
	@Size(min = 2000, max = 2000)
	public Long t310;
	/**
	 * {{list}} Each item is a RLF recovery timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t311 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T311")
	@CWMPParameter(access = "readWrite")
	@Size(min = 30000, max = 30000)
	public Long t311;
	/**
	 * Time in minutes after RRCConnection Release in which cell re-selection priority info supplied in RRCConnectionRelease MUST be observed. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

Corresponds to parameter t320 specified in RRCConnectionRelease message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. S
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "T320")
	@CWMPParameter(access = "readWrite", units = "minutes")
	@Size(min = 180, max = 180)
	public Long t320;
	/**
	 * Number of consecutive "out-of-sync" indications received from lower layers that triggers timer T310.

Corresponds to parameter n310 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N310")
	@CWMPParameter(access = "readWrite")
	@Size(min = 20, max = 20)
	public Long n310;
	/**
	 * Number of consecutive "in-sync" indications received from lower layers that stops timer T310.

Corresponds to parameter n311 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "N311")
	@CWMPParameter(access = "readWrite")
	@Size(min = 10, max = 10)
	public Long n311;

	public RRCTimers() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t300 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT300() {
		return t300;
	}

	/**
	 * Set the {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t300 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t300 the input value
	 */
	public void  setT300(Long t300) {
		this.t300 = t300;
	}

	/**
	 * Set the {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t300 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t300 the input value
	 * @return this instance
	 */
	public RRCTimers withT300(Long t300) {
		this.t300 = t300;
		return this;
	}

	/**
	 * Get the {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionReestablishmentRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t301 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT301() {
		return t301;
	}

	/**
	 * Set the {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionReestablishmentRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t301 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t301 the input value
	 */
	public void  setT301(Long t301) {
		this.t301 = t301;
	}

	/**
	 * Set the {{list}} Each item is an interval, in milliseconds, between subsequent transmissions of RRCConnectionReestablishmentRequest. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t301 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}.  Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t301 the input value
	 * @return this instance
	 */
	public RRCTimers withT301(Long t301) {
		this.t301 = t301;
		return this;
	}

	/**
	 * Get the time to wait in milliseconds for cell re-selection or RRConnectionSetup after RRCConnectionReject. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT302() {
		return t302;
	}

	/**
	 * Set the time to wait in milliseconds for cell re-selection or RRConnectionSetup after RRCConnectionReject. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.
	 *
	 * @since 2.0
	 * @param t302 the input value
	 */
	public void  setT302(Long t302) {
		this.t302 = t302;
	}

	/**
	 * Set the time to wait in milliseconds for cell re-selection or RRConnectionSetup after RRCConnectionReject. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.
	 *
	 * @since 2.0
	 * @param t302 the input value
	 * @return this instance
	 */
	public RRCTimers withT302(Long t302) {
		this.t302 = t302;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE MobilityControlInfo in RRCConnectionReconfiguration message in {{bibref|3GPP-TS.36.331|Section 5.3.5.4 and Section 6.3.4}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT304EUTRA() {
		return t304EUTRA;
	}

	/**
	 * Set the {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE MobilityControlInfo in RRCConnectionReconfiguration message in {{bibref|3GPP-TS.36.331|Section 5.3.5.4 and Section 6.3.4}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t304EUTRA the input value
	 */
	public void  setT304EUTRA(Long t304EUTRA) {
		this.t304EUTRA = t304EUTRA;
	}

	/**
	 * Set the {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE MobilityControlInfo in RRCConnectionReconfiguration message in {{bibref|3GPP-TS.36.331|Section 5.3.5.4 and Section 6.3.4}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t304EUTRA the input value
	 * @return this instance
	 */
	public RRCTimers withT304EUTRA(Long t304EUTRA) {
		this.t304EUTRA = t304EUTRA;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE CellChangeOrder in MobilityFromEUTRACommand message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT304IRAT() {
		return t304IRAT;
	}

	/**
	 * Set the {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE CellChangeOrder in MobilityFromEUTRACommand message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t304IRAT the input value
	 */
	public void  setT304IRAT(Long t304IRAT) {
		this.t304IRAT = t304IRAT;
	}

	/**
	 * Set the {{list}} Each item is a HO failure timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to t304 defined within IE CellChangeOrder in MobilityFromEUTRACommand message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t304IRAT the input value
	 * @return this instance
	 */
	public RRCTimers withT304IRAT(Long t304IRAT) {
		this.t304IRAT = t304IRAT;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a RLF declaration timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t310 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT310() {
		return t310;
	}

	/**
	 * Set the {{list}} Each item is a RLF declaration timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t310 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t310 the input value
	 */
	public void  setT310(Long t310) {
		this.t310 = t310;
	}

	/**
	 * Set the {{list}} Each item is a RLF declaration timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t310 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t310 the input value
	 * @return this instance
	 */
	public RRCTimers withT310(Long t310) {
		this.t310 = t310;
		return this;
	}

	/**
	 * Get the {{list}} Each item is a RLF recovery timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t311 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT311() {
		return t311;
	}

	/**
	 * Set the {{list}} Each item is a RLF recovery timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t311 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t311 the input value
	 */
	public void  setT311(Long t311) {
		this.t311 = t311;
	}

	/**
	 * Set the {{list}} Each item is a RLF recovery timer, in milliseconds. In case there is more than one item in the list, the first item contains the most preferred value. Corresponds to parameter t311 specified in RLF-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6}}. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

If  supports self-configuration capability for {{param}} and more than one item is configured, then  is expected to select one from the list and overwrite this parameter containing only the one selected.  If  does not support self-configuration capability for {{param}} and more than one item is configured, then  accepts the first value and ignore the rest. If only one item is configured regardless of the self-configuration capability of ,  accepts the value as an explicit configuration by the ACS.
	 *
	 * @since 2.0
	 * @param t311 the input value
	 * @return this instance
	 */
	public RRCTimers withT311(Long t311) {
		this.t311 = t311;
		return this;
	}

	/**
	 * Get the time in minutes after RRCConnection Release in which cell re-selection priority info supplied in RRCConnectionRelease MUST be observed. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

Corresponds to parameter t320 specified in RRCConnectionRelease message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. S
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getT320() {
		return t320;
	}

	/**
	 * Set the time in minutes after RRCConnection Release in which cell re-selection priority info supplied in RRCConnectionRelease MUST be observed. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

Corresponds to parameter t320 specified in RRCConnectionRelease message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. S
	 *
	 * @since 2.0
	 * @param t320 the input value
	 */
	public void  setT320(Long t320) {
		this.t320 = t320;
	}

	/**
	 * Set the time in minutes after RRCConnection Release in which cell re-selection priority info supplied in RRCConnectionRelease MUST be observed. Start/stop/expirary condition is defined in {{bibref|3GPP-TS.36.331|Section 7.3}}.

Corresponds to parameter t320 specified in RRCConnectionRelease message in {{bibref|3GPP-TS.36.331|Section 6.2.2}}. S
	 *
	 * @since 2.0
	 * @param t320 the input value
	 * @return this instance
	 */
	public RRCTimers withT320(Long t320) {
		this.t320 = t320;
		return this;
	}

	/**
	 * Get the number of consecutive "out-of-sync" indications received from lower layers that triggers timer T310.

Corresponds to parameter n310 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN310() {
		return n310;
	}

	/**
	 * Set the number of consecutive "out-of-sync" indications received from lower layers that triggers timer T310.

Corresponds to parameter n310 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 * @param n310 the input value
	 */
	public void  setN310(Long n310) {
		this.n310 = n310;
	}

	/**
	 * Set the number of consecutive "out-of-sync" indications received from lower layers that triggers timer T310.

Corresponds to parameter n310 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 * @param n310 the input value
	 * @return this instance
	 */
	public RRCTimers withN310(Long n310) {
		this.n310 = n310;
		return this;
	}

	/**
	 * Get the number of consecutive "in-sync" indications received from lower layers that stops timer T310.

Corresponds to parameter n311 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getN311() {
		return n311;
	}

	/**
	 * Set the number of consecutive "in-sync" indications received from lower layers that stops timer T310.

Corresponds to parameter n311 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 * @param n311 the input value
	 */
	public void  setN311(Long n311) {
		this.n311 = n311;
	}

	/**
	 * Set the number of consecutive "in-sync" indications received from lower layers that stops timer T310.

Corresponds to parameter n311 specified in UE-TimersAndConstants IE in {{bibref|3GPP-TS.36.331|Section 6.3.6 and Section 7.3}}.
	 *
	 * @since 2.0
	 * @param n311 the input value
	 * @return this instance
	 */
	public RRCTimers withN311(Long n311) {
		this.n311 = n311;
		return this;
	}

	//</editor-fold>

}