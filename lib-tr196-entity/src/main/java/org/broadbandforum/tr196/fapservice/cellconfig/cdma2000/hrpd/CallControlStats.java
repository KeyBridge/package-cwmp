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
package org.broadbandforum.tr196.fapservice.cellconfig.cdma2000.hrpd;

import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Details on call control stats
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.CallControlStats.")
public class CallControlStats {

	/**
	 * This parameter is a counter for the total number of session instances that are created on a specific FAP when a regular session setup attempt is initiated with an unknown RATI
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumSessionSetupAttempts")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numSessionSetupAttempts;
	/**
	 * This parameter is a counter for the total number of successful regular session setup attempts that are initiated with an unknown RATI
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumSessionSetupSuccessful")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numSessionSetupSuccessful;
	/**
	 * This parameter is a counter for the total number of successfully established HRPD Sessions that exists on a specific picasso
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumCurrentSessionsEstablished")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numCurrentSessionsEstablished;
	/**
	 * The number of times a Page Message was sent to the AT to facilitate the setup of a connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumPageMessagesToAt")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numPageMessagesToAt;
	/**
	 * The total number of pages succeeded
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumPagesSucceeded")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numPagesSucceeded;
	/**
	 * Total HRPD Connections Opened
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumConnectionsOpened")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numConnectionsOpened;
	/**
	 * This parameter is a counter for the total number of HRPD session setups that are aborted due to various failure reasons
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumSessionSetupsFailedToTermAuth")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numSessionSetupsFailedToTermAuth;
	/**
	 * Number of HRPD packets(bytes) sent from PDSN to AT.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumForwardRLPBytes")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long numForwardRLPBytes;
	/**
	 * No. of HRPD packets(bytes) sent from AT to PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReverseRLPBytes")
	@CWMPParameter(activeNotify = "canDeny", units = "bytes")
	public Long numReverseRLPBytes;
	/**
	 * This parameter maintains a record of the average session setup time for all successfully setup sessions on a specific FAP. The average session setup time is in units of 10 ms.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AverageSessionSetupTime")
	@CWMPParameter(activeNotify = "canDeny", units = "10 ms")
	public Long averageSessionSetupTime;
	/**
	 * The average connection setup time in response to a FAP initiated page. The time is from initiation of Page to the time the connection is declared open
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "AveragePageSetupTime")
	@CWMPParameter(activeNotify = "canDeny")
	public Long averagePageSetupTime;
	/**
	 * The number of connection setups that were aborted
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumConnSetupsAborted")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numConnSetupsAborted;
	/**
	 * Number of packets dropped at Pre-RLP queue due to overflow in forward direction. This counter will also be written to the performance log.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumForwardPreRLPDroppedPkts")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numForwardPreRLPDroppedPkts;

	public CallControlStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this parameter is a counter for the total number of session instances that are created on a specific FAP when a regular session setup attempt is initiated with an unknown RATI
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumSessionSetupAttempts() {
		return numSessionSetupAttempts;
	}

	/**
	 * Set the this parameter is a counter for the total number of session instances that are created on a specific FAP when a regular session setup attempt is initiated with an unknown RATI
	 *
	 * @since 2.0
	 * @param numSessionSetupAttempts the input value
	 */
	public void  setNumSessionSetupAttempts(Long numSessionSetupAttempts) {
		this.numSessionSetupAttempts = numSessionSetupAttempts;
	}

	/**
	 * Set the this parameter is a counter for the total number of session instances that are created on a specific FAP when a regular session setup attempt is initiated with an unknown RATI
	 *
	 * @since 2.0
	 * @param numSessionSetupAttempts the input value
	 * @return this instance
	 */
	public CallControlStats withNumSessionSetupAttempts(Long numSessionSetupAttempts) {
		this.numSessionSetupAttempts = numSessionSetupAttempts;
		return this;
	}

	/**
	 * Get the this parameter is a counter for the total number of successful regular session setup attempts that are initiated with an unknown RATI
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumSessionSetupSuccessful() {
		return numSessionSetupSuccessful;
	}

	/**
	 * Set the this parameter is a counter for the total number of successful regular session setup attempts that are initiated with an unknown RATI
	 *
	 * @since 2.0
	 * @param numSessionSetupSuccessful the input value
	 */
	public void  setNumSessionSetupSuccessful(Long numSessionSetupSuccessful) {
		this.numSessionSetupSuccessful = numSessionSetupSuccessful;
	}

	/**
	 * Set the this parameter is a counter for the total number of successful regular session setup attempts that are initiated with an unknown RATI
	 *
	 * @since 2.0
	 * @param numSessionSetupSuccessful the input value
	 * @return this instance
	 */
	public CallControlStats withNumSessionSetupSuccessful(Long numSessionSetupSuccessful) {
		this.numSessionSetupSuccessful = numSessionSetupSuccessful;
		return this;
	}

	/**
	 * Get the this parameter is a counter for the total number of successfully established HRPD Sessions that exists on a specific picasso
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumCurrentSessionsEstablished() {
		return numCurrentSessionsEstablished;
	}

	/**
	 * Set the this parameter is a counter for the total number of successfully established HRPD Sessions that exists on a specific picasso
	 *
	 * @since 2.0
	 * @param numCurrentSessionsEstablished the input value
	 */
	public void  setNumCurrentSessionsEstablished(Long numCurrentSessionsEstablished) {
		this.numCurrentSessionsEstablished = numCurrentSessionsEstablished;
	}

	/**
	 * Set the this parameter is a counter for the total number of successfully established HRPD Sessions that exists on a specific picasso
	 *
	 * @since 2.0
	 * @param numCurrentSessionsEstablished the input value
	 * @return this instance
	 */
	public CallControlStats withNumCurrentSessionsEstablished(Long numCurrentSessionsEstablished) {
		this.numCurrentSessionsEstablished = numCurrentSessionsEstablished;
		return this;
	}

	/**
	 * Get the number of times a Page Message was sent to the AT to facilitate the setup of a connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumPageMessagesToAt() {
		return numPageMessagesToAt;
	}

	/**
	 * Set the number of times a Page Message was sent to the AT to facilitate the setup of a connection.
	 *
	 * @since 2.0
	 * @param numPageMessagesToAt the input value
	 */
	public void  setNumPageMessagesToAt(Long numPageMessagesToAt) {
		this.numPageMessagesToAt = numPageMessagesToAt;
	}

	/**
	 * Set the number of times a Page Message was sent to the AT to facilitate the setup of a connection.
	 *
	 * @since 2.0
	 * @param numPageMessagesToAt the input value
	 * @return this instance
	 */
	public CallControlStats withNumPageMessagesToAt(Long numPageMessagesToAt) {
		this.numPageMessagesToAt = numPageMessagesToAt;
		return this;
	}

	/**
	 * Get the total number of pages succeeded
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumPagesSucceeded() {
		return numPagesSucceeded;
	}

	/**
	 * Set the total number of pages succeeded
	 *
	 * @since 2.0
	 * @param numPagesSucceeded the input value
	 */
	public void  setNumPagesSucceeded(Long numPagesSucceeded) {
		this.numPagesSucceeded = numPagesSucceeded;
	}

	/**
	 * Set the total number of pages succeeded
	 *
	 * @since 2.0
	 * @param numPagesSucceeded the input value
	 * @return this instance
	 */
	public CallControlStats withNumPagesSucceeded(Long numPagesSucceeded) {
		this.numPagesSucceeded = numPagesSucceeded;
		return this;
	}

	/**
	 * Get the total HRPD Connections Opened
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumConnectionsOpened() {
		return numConnectionsOpened;
	}

	/**
	 * Set the total HRPD Connections Opened
	 *
	 * @since 2.0
	 * @param numConnectionsOpened the input value
	 */
	public void  setNumConnectionsOpened(Long numConnectionsOpened) {
		this.numConnectionsOpened = numConnectionsOpened;
	}

	/**
	 * Set the total HRPD Connections Opened
	 *
	 * @since 2.0
	 * @param numConnectionsOpened the input value
	 * @return this instance
	 */
	public CallControlStats withNumConnectionsOpened(Long numConnectionsOpened) {
		this.numConnectionsOpened = numConnectionsOpened;
		return this;
	}

	/**
	 * Get the this parameter is a counter for the total number of HRPD session setups that are aborted due to various failure reasons
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumSessionSetupsFailedToTermAuth() {
		return numSessionSetupsFailedToTermAuth;
	}

	/**
	 * Set the this parameter is a counter for the total number of HRPD session setups that are aborted due to various failure reasons
	 *
	 * @since 2.0
	 * @param numSessionSetupsFailedToTermAuth the input value
	 */
	public void  setNumSessionSetupsFailedToTermAuth(Long numSessionSetupsFailedToTermAuth) {
		this.numSessionSetupsFailedToTermAuth = numSessionSetupsFailedToTermAuth;
	}

	/**
	 * Set the this parameter is a counter for the total number of HRPD session setups that are aborted due to various failure reasons
	 *
	 * @since 2.0
	 * @param numSessionSetupsFailedToTermAuth the input value
	 * @return this instance
	 */
	public CallControlStats withNumSessionSetupsFailedToTermAuth(Long numSessionSetupsFailedToTermAuth) {
		this.numSessionSetupsFailedToTermAuth = numSessionSetupsFailedToTermAuth;
		return this;
	}

	/**
	 * Get the number of HRPD packets(bytes) sent from PDSN to AT.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumForwardRLPBytes() {
		return numForwardRLPBytes;
	}

	/**
	 * Set the number of HRPD packets(bytes) sent from PDSN to AT.
	 *
	 * @since 2.0
	 * @param numForwardRLPBytes the input value
	 */
	public void  setNumForwardRLPBytes(Long numForwardRLPBytes) {
		this.numForwardRLPBytes = numForwardRLPBytes;
	}

	/**
	 * Set the number of HRPD packets(bytes) sent from PDSN to AT.
	 *
	 * @since 2.0
	 * @param numForwardRLPBytes the input value
	 * @return this instance
	 */
	public CallControlStats withNumForwardRLPBytes(Long numForwardRLPBytes) {
		this.numForwardRLPBytes = numForwardRLPBytes;
		return this;
	}

	/**
	 * Get the no. of HRPD packets(bytes) sent from AT to PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReverseRLPBytes() {
		return numReverseRLPBytes;
	}

	/**
	 * Set the no. of HRPD packets(bytes) sent from AT to PDSN.
	 *
	 * @since 2.0
	 * @param numReverseRLPBytes the input value
	 */
	public void  setNumReverseRLPBytes(Long numReverseRLPBytes) {
		this.numReverseRLPBytes = numReverseRLPBytes;
	}

	/**
	 * Set the no. of HRPD packets(bytes) sent from AT to PDSN.
	 *
	 * @since 2.0
	 * @param numReverseRLPBytes the input value
	 * @return this instance
	 */
	public CallControlStats withNumReverseRLPBytes(Long numReverseRLPBytes) {
		this.numReverseRLPBytes = numReverseRLPBytes;
		return this;
	}

	/**
	 * Get the this parameter maintains a record of the average session setup time for all successfully setup sessions on a specific FAP. The average session setup time is in units of 10 ms.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAverageSessionSetupTime() {
		return averageSessionSetupTime;
	}

	/**
	 * Set the this parameter maintains a record of the average session setup time for all successfully setup sessions on a specific FAP. The average session setup time is in units of 10 ms.
	 *
	 * @since 2.0
	 * @param averageSessionSetupTime the input value
	 */
	public void  setAverageSessionSetupTime(Long averageSessionSetupTime) {
		this.averageSessionSetupTime = averageSessionSetupTime;
	}

	/**
	 * Set the this parameter maintains a record of the average session setup time for all successfully setup sessions on a specific FAP. The average session setup time is in units of 10 ms.
	 *
	 * @since 2.0
	 * @param averageSessionSetupTime the input value
	 * @return this instance
	 */
	public CallControlStats withAverageSessionSetupTime(Long averageSessionSetupTime) {
		this.averageSessionSetupTime = averageSessionSetupTime;
		return this;
	}

	/**
	 * Get the average connection setup time in response to a FAP initiated page. The time is from initiation of Page to the time the connection is declared open
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getAveragePageSetupTime() {
		return averagePageSetupTime;
	}

	/**
	 * Set the average connection setup time in response to a FAP initiated page. The time is from initiation of Page to the time the connection is declared open
	 *
	 * @since 2.0
	 * @param averagePageSetupTime the input value
	 */
	public void  setAveragePageSetupTime(Long averagePageSetupTime) {
		this.averagePageSetupTime = averagePageSetupTime;
	}

	/**
	 * Set the average connection setup time in response to a FAP initiated page. The time is from initiation of Page to the time the connection is declared open
	 *
	 * @since 2.0
	 * @param averagePageSetupTime the input value
	 * @return this instance
	 */
	public CallControlStats withAveragePageSetupTime(Long averagePageSetupTime) {
		this.averagePageSetupTime = averagePageSetupTime;
		return this;
	}

	/**
	 * Get the number of connection setups that were aborted
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumConnSetupsAborted() {
		return numConnSetupsAborted;
	}

	/**
	 * Set the number of connection setups that were aborted
	 *
	 * @since 2.0
	 * @param numConnSetupsAborted the input value
	 */
	public void  setNumConnSetupsAborted(Long numConnSetupsAborted) {
		this.numConnSetupsAborted = numConnSetupsAborted;
	}

	/**
	 * Set the number of connection setups that were aborted
	 *
	 * @since 2.0
	 * @param numConnSetupsAborted the input value
	 * @return this instance
	 */
	public CallControlStats withNumConnSetupsAborted(Long numConnSetupsAborted) {
		this.numConnSetupsAborted = numConnSetupsAborted;
		return this;
	}

	/**
	 * Get the number of packets dropped at Pre-RLP queue due to overflow in forward direction. This counter will also be written to the performance log.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumForwardPreRLPDroppedPkts() {
		return numForwardPreRLPDroppedPkts;
	}

	/**
	 * Set the number of packets dropped at Pre-RLP queue due to overflow in forward direction. This counter will also be written to the performance log.
	 *
	 * @since 2.0
	 * @param numForwardPreRLPDroppedPkts the input value
	 */
	public void  setNumForwardPreRLPDroppedPkts(Long numForwardPreRLPDroppedPkts) {
		this.numForwardPreRLPDroppedPkts = numForwardPreRLPDroppedPkts;
	}

	/**
	 * Set the number of packets dropped at Pre-RLP queue due to overflow in forward direction. This counter will also be written to the performance log.
	 *
	 * @since 2.0
	 * @param numForwardPreRLPDroppedPkts the input value
	 * @return this instance
	 */
	public CallControlStats withNumForwardPreRLPDroppedPkts(Long numForwardPreRLPDroppedPkts) {
		this.numForwardPreRLPDroppedPkts = numForwardPreRLPDroppedPkts;
		return this;
	}

	//</editor-fold>

}