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
package org.broadbandforum.tr196.fapservice.cellconfig.umts;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters relating to Radio Access layers {{bibref|3GPP-TS.32.405}}
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.UMTS.RAB.")
public class RAB {

	/**
	 * The number of successfully established RABs (with or without queueing) for CS domain.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABSuccEstabCS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long rabSuccEstabCS;
	/**
	 * The number of RAB establishment failures for CS domain.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABFailEstabCS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long rabFailEstabCS;
	/**
	 * The number of successfully established RABs for PS domain.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABSuccEstabPS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long rabSuccEstabPS;
	/**
	 * The number of RABs failed to establish for PS domain.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABFailEstabPS")
	@CWMPParameter(activeNotify = "canDeny")
	public Long rabFailEstabPS;
	/**
	 * The mean time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABCSSetupTimeMean")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long rabCSSetupTimeMean;
	/**
	 * The maximum time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABCSSetupTimeMax")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long rabCSSetupTimeMax;
	/**
	 * The mean time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABPSSetupTimeMean")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long rabPSSetupTimeMean;
	/**
	 * The maximum time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RABPSSetupTimeMax")
	@CWMPParameter(activeNotify = "canDeny", units = "milliseconds")
	public Long rabPSSetupTimeMax;
	/**
	 * The number of failed Handovers.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "FailHO")
	@CWMPParameter(activeNotify = "canDeny")
	public Long failHO;
	/**
	 * The number of successful Handovers.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SuccHO")
	@CWMPParameter(activeNotify = "canDeny")
	public Long succHO;

	public RAB() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of successfully established RABs (with or without queueing) for CS domain.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabSuccEstabCS() {
		return rabSuccEstabCS;
	}

	/**
	 * Set the number of successfully established RABs (with or without queueing) for CS domain.
	 *
	 * @since 2.0
	 * @param rabSuccEstabCS the input value
	 */
	public void  setRabSuccEstabCS(Long rabSuccEstabCS) {
		this.rabSuccEstabCS = rabSuccEstabCS;
	}

	/**
	 * Set the number of successfully established RABs (with or without queueing) for CS domain.
	 *
	 * @since 2.0
	 * @param rabSuccEstabCS the input value
	 * @return this instance
	 */
	public RAB withRabSuccEstabCS(Long rabSuccEstabCS) {
		this.rabSuccEstabCS = rabSuccEstabCS;
		return this;
	}

	/**
	 * Get the number of RAB establishment failures for CS domain.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabFailEstabCS() {
		return rabFailEstabCS;
	}

	/**
	 * Set the number of RAB establishment failures for CS domain.
	 *
	 * @since 2.0
	 * @param rabFailEstabCS the input value
	 */
	public void  setRabFailEstabCS(Long rabFailEstabCS) {
		this.rabFailEstabCS = rabFailEstabCS;
	}

	/**
	 * Set the number of RAB establishment failures for CS domain.
	 *
	 * @since 2.0
	 * @param rabFailEstabCS the input value
	 * @return this instance
	 */
	public RAB withRabFailEstabCS(Long rabFailEstabCS) {
		this.rabFailEstabCS = rabFailEstabCS;
		return this;
	}

	/**
	 * Get the number of successfully established RABs for PS domain.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabSuccEstabPS() {
		return rabSuccEstabPS;
	}

	/**
	 * Set the number of successfully established RABs for PS domain.
	 *
	 * @since 2.0
	 * @param rabSuccEstabPS the input value
	 */
	public void  setRabSuccEstabPS(Long rabSuccEstabPS) {
		this.rabSuccEstabPS = rabSuccEstabPS;
	}

	/**
	 * Set the number of successfully established RABs for PS domain.
	 *
	 * @since 2.0
	 * @param rabSuccEstabPS the input value
	 * @return this instance
	 */
	public RAB withRabSuccEstabPS(Long rabSuccEstabPS) {
		this.rabSuccEstabPS = rabSuccEstabPS;
		return this;
	}

	/**
	 * Get the number of RABs failed to establish for PS domain.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabFailEstabPS() {
		return rabFailEstabPS;
	}

	/**
	 * Set the number of RABs failed to establish for PS domain.
	 *
	 * @since 2.0
	 * @param rabFailEstabPS the input value
	 */
	public void  setRabFailEstabPS(Long rabFailEstabPS) {
		this.rabFailEstabPS = rabFailEstabPS;
	}

	/**
	 * Set the number of RABs failed to establish for PS domain.
	 *
	 * @since 2.0
	 * @param rabFailEstabPS the input value
	 * @return this instance
	 */
	public RAB withRabFailEstabPS(Long rabFailEstabPS) {
		this.rabFailEstabPS = rabFailEstabPS;
		return this;
	}

	/**
	 * Get the mean time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabCSSetupTimeMean() {
		return rabCSSetupTimeMean;
	}

	/**
	 * Set the mean time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 * @param rabCSSetupTimeMean the input value
	 */
	public void  setRabCSSetupTimeMean(Long rabCSSetupTimeMean) {
		this.rabCSSetupTimeMean = rabCSSetupTimeMean;
	}

	/**
	 * Set the mean time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 * @param rabCSSetupTimeMean the input value
	 * @return this instance
	 */
	public RAB withRabCSSetupTimeMean(Long rabCSSetupTimeMean) {
		this.rabCSSetupTimeMean = rabCSSetupTimeMean;
		return this;
	}

	/**
	 * Get the maximum time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabCSSetupTimeMax() {
		return rabCSSetupTimeMax;
	}

	/**
	 * Set the maximum time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 * @param rabCSSetupTimeMax the input value
	 */
	public void  setRabCSSetupTimeMax(Long rabCSSetupTimeMax) {
		this.rabCSSetupTimeMax = rabCSSetupTimeMax;
	}

	/**
	 * Set the maximum time in milliseconds for a FAP to establish a RAB CS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for CS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 * @param rabCSSetupTimeMax the input value
	 * @return this instance
	 */
	public RAB withRabCSSetupTimeMax(Long rabCSSetupTimeMax) {
		this.rabCSSetupTimeMax = rabCSSetupTimeMax;
		return this;
	}

	/**
	 * Get the mean time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabPSSetupTimeMean() {
		return rabPSSetupTimeMean;
	}

	/**
	 * Set the mean time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 * @param rabPSSetupTimeMean the input value
	 */
	public void  setRabPSSetupTimeMean(Long rabPSSetupTimeMean) {
		this.rabPSSetupTimeMean = rabPSSetupTimeMean;
	}

	/**
	 * Set the mean time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by accumulating the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs over a granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).

This end value of the time will then be divided by the number of successfully established RABs observed in the granularity period to give the arithmetic mean. The accumulator SHALL be reinitialized at the beginning of each granularity period.
	 *
	 * @since 2.0
	 * @param rabPSSetupTimeMean the input value
	 * @return this instance
	 */
	public RAB withRabPSSetupTimeMean(Long rabPSSetupTimeMean) {
		this.rabPSSetupTimeMean = rabPSSetupTimeMean;
		return this;
	}

	/**
	 * Get the maximum time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRabPSSetupTimeMax() {
		return rabPSSetupTimeMax;
	}

	/**
	 * Set the maximum time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 * @param rabPSSetupTimeMax the input value
	 */
	public void  setRabPSSetupTimeMax(Long rabPSSetupTimeMax) {
		this.rabPSSetupTimeMax = rabPSSetupTimeMax;
	}

	/**
	 * Set the maximum time in milliseconds for a FAP to establish a RAB PS connection.

This measurement is obtained by monitoring the time intervals for each successful RAB establishment between the receipt by the FAP of a RANAP "RAB ASSIGNMENT REQUEST" message to establish a RAB for PS domain, and the first corresponding (based on RAB ID) transmission by the FAP of a RANAP "RAB ASSIGNMENT RESPONSE" message for successfully established RABs.

The high tide mark of this time will be stored in a gauge; the gauge SHALL be reinitialized at the beginning of each granularity period (Sample Interval {{bibref|3GPP-TS.32.582|Section 6.3.2}}).
	 *
	 * @since 2.0
	 * @param rabPSSetupTimeMax the input value
	 * @return this instance
	 */
	public RAB withRabPSSetupTimeMax(Long rabPSSetupTimeMax) {
		this.rabPSSetupTimeMax = rabPSSetupTimeMax;
		return this;
	}

	/**
	 * Get the number of failed Handovers.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getFailHO() {
		return failHO;
	}

	/**
	 * Set the number of failed Handovers.
	 *
	 * @since 2.0
	 * @param failHO the input value
	 */
	public void  setFailHO(Long failHO) {
		this.failHO = failHO;
	}

	/**
	 * Set the number of failed Handovers.
	 *
	 * @since 2.0
	 * @param failHO the input value
	 * @return this instance
	 */
	public RAB withFailHO(Long failHO) {
		this.failHO = failHO;
		return this;
	}

	/**
	 * Get the number of successful Handovers.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSuccHO() {
		return succHO;
	}

	/**
	 * Set the number of successful Handovers.
	 *
	 * @since 2.0
	 * @param succHO the input value
	 */
	public void  setSuccHO(Long succHO) {
		this.succHO = succHO;
	}

	/**
	 * Set the number of successful Handovers.
	 *
	 * @since 2.0
	 * @param succHO the input value
	 * @return this instance
	 */
	public RAB withSuccHO(Long succHO) {
		this.succHO = succHO;
		return this;
	}

	//</editor-fold>

}