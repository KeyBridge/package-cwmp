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

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains parameters relating to the ULSCH (Uplink Shared Channel) configuration (see {{bibref|3GPP-TS.32.592|Section 6.1.2.3}}).
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.LTE.RAN.MAC.ULSCH.")
@XmlRootElement(name = "ULSCH")
@XmlType(name = "FAPService.CellConfig.LTE.RAN.MAC.ULSCH")
@XmlAccessorType(XmlAccessType.FIELD)
public class ULSCH {

	/**
	 * Maximum number of UL HARQ transmissions.

Corresponds to parameter maxHARQ-Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "MaxHARQTx")
	@Size(min = 28, max = 28)
	public Long maxHARQTx;
	/**
	 * Timer for Periodic BSR (Buffer Status Report) reporting, specified in number of subframes. UE transmits periodic BSR at the expiration of this timer.

Corresponds to parameter periodicBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "PeriodicBSRTimer")
	@Size(min = 2560, max = 2560)
	public Long periodicBSRTimer;
	/**
	 * Timer for Regular BSR reporting, specified in number of subframes. UE transmits a Regular BSR at the expiration of this timer if data is available in the buffer.

Corresponds to parameter retxBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RetxBSRTimer")
	@Size(min = 10240, max = 10240)
	public Long retxBSRTimer;
	/**
	 * Enables/disables TTI bundling. If {{true}}, TTI bundling is enabled. If {{false}}, TTI bundling is disabled.

Corresponds to parameter ttiBundling specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.1}}.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TTIBundling")
	public Boolean ttiBundling;

	public ULSCH() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the maximum number of UL HARQ transmissions.

Corresponds to parameter maxHARQ-Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getMaxHARQTx() {
		return maxHARQTx;
	}

	/**
	 * Set the maximum number of UL HARQ transmissions.

Corresponds to parameter maxHARQ-Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.
	 *
	 * @since 2.0
	 * @param maxHARQTx the input value
	 */
	public void  setMaxHARQTx(Long maxHARQTx) {
		this.maxHARQTx = maxHARQTx;
	}

	/**
	 * Set the maximum number of UL HARQ transmissions.

Corresponds to parameter maxHARQ-Tx specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.2}}.
	 *
	 * @since 2.0
	 * @param maxHARQTx the input value
	 * @return this instance
	 */
	public ULSCH withMaxHARQTx(Long maxHARQTx) {
		this.maxHARQTx = maxHARQTx;
		return this;
	}

	/**
	 * Get the timer for Periodic BSR (Buffer Status Report) reporting, specified in number of subframes. UE transmits periodic BSR at the expiration of this timer.

Corresponds to parameter periodicBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPeriodicBSRTimer() {
		return periodicBSRTimer;
	}

	/**
	 * Set the timer for Periodic BSR (Buffer Status Report) reporting, specified in number of subframes. UE transmits periodic BSR at the expiration of this timer.

Corresponds to parameter periodicBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @param periodicBSRTimer the input value
	 */
	public void  setPeriodicBSRTimer(Long periodicBSRTimer) {
		this.periodicBSRTimer = periodicBSRTimer;
	}

	/**
	 * Set the timer for Periodic BSR (Buffer Status Report) reporting, specified in number of subframes. UE transmits periodic BSR at the expiration of this timer.

Corresponds to parameter periodicBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}. Value of 0 indicates "infinity."
	 *
	 * @since 2.0
	 * @param periodicBSRTimer the input value
	 * @return this instance
	 */
	public ULSCH withPeriodicBSRTimer(Long periodicBSRTimer) {
		this.periodicBSRTimer = periodicBSRTimer;
		return this;
	}

	/**
	 * Get the timer for Regular BSR reporting, specified in number of subframes. UE transmits a Regular BSR at the expiration of this timer if data is available in the buffer.

Corresponds to parameter retxBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRetxBSRTimer() {
		return retxBSRTimer;
	}

	/**
	 * Set the timer for Regular BSR reporting, specified in number of subframes. UE transmits a Regular BSR at the expiration of this timer if data is available in the buffer.

Corresponds to parameter retxBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}.
	 *
	 * @since 2.0
	 * @param retxBSRTimer the input value
	 */
	public void  setRetxBSRTimer(Long retxBSRTimer) {
		this.retxBSRTimer = retxBSRTimer;
	}

	/**
	 * Set the timer for Regular BSR reporting, specified in number of subframes. UE transmits a Regular BSR at the expiration of this timer if data is available in the buffer.

Corresponds to parameter retxBSR-Timer specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.5}}.
	 *
	 * @since 2.0
	 * @param retxBSRTimer the input value
	 * @return this instance
	 */
	public ULSCH withRetxBSRTimer(Long retxBSRTimer) {
		this.retxBSRTimer = retxBSRTimer;
		return this;
	}

	/**
	 * Get the enables/disables TTI bundling. If {{true}}, TTI bundling is enabled. If {{false}}, TTI bundling is disabled.

Corresponds to parameter ttiBundling specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.1}}.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isTtiBundling() {
		return ttiBundling;
	}

	/**
	 * Set the enables/disables TTI bundling. If {{true}}, TTI bundling is enabled. If {{false}}, TTI bundling is disabled.

Corresponds to parameter ttiBundling specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.1}}.
	 *
	 * @since 2.0
	 * @param ttiBundling the input value
	 */
	public void  setTtiBundling(Boolean ttiBundling) {
		this.ttiBundling = ttiBundling;
	}

	/**
	 * Set the enables/disables TTI bundling. If {{true}}, TTI bundling is enabled. If {{false}}, TTI bundling is disabled.

Corresponds to parameter ttiBundling specified in {{bibref|3GPP-TS.36.331|Section 6.3.2}} and in {{bibref|3GPP-TS.36.321|Section 5.4.2.1}}.
	 *
	 * @since 2.0
	 * @param ttiBundling the input value
	 * @return this instance
	 */
	public ULSCH withTtiBundling(Boolean ttiBundling) {
		this.ttiBundling = ttiBundling;
		return this;
	}

	//</editor-fold>

}