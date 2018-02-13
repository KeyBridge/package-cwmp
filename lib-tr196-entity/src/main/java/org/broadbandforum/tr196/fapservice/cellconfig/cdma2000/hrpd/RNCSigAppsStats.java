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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Stats for HRPD RNC signaling procedures.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.RNCSigAppsStats.")
@XmlRootElement(name = "FAPService.CellConfig.CDMA2000.HRPD.RNCSigAppsStats")
@XmlType(name = "FAPService.CellConfig.CDMA2000.HRPD.RNCSigAppsStats")
@XmlAccessorType(XmlAccessType.FIELD)
public class RNCSigAppsStats {

	/**
	 * Number of HRPD Page requests made after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumPageRequests")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumPageRequests;
	/**
	 * Number of HRPD Page requests made before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumPageRequests")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumPageRequests;
	/**
	 * Number of HRPD Connection setups attempted before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumConnectionSetupAttempts")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumConnectionSetupAttempts;
	/**
	 * Number of HRPD Connection setups attempted after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumConnectionSetupAttempts")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumConnectionSetupAttempts;
	/**
	 * Number of HRPD Connection setups succeeded before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumConnectionSetupSuccess")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumConnectionSetupSuccess;
	/**
	 * Number of HRPD Connection setups succeeded after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumConnectionSetupSuccess")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumConnectionSetupSuccess;
	/**
	 * The number of HRPD connections that were closed normally before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumNormalConnectionCloses")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumNormalConnectionCloses;
	/**
	 * The number of HRPD connections that were closed normally after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumNormalConnectionCloses")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumNormalConnectionCloses;
	/**
	 * The total number of HRPD connections closed, normally or abnormally, data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumTotalConnectionCloses")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumTotalConnectionCloses;
	/**
	 * The total number of HRPD connections closed, normally or abnormally, after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumTotalConnectionCloses")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumTotalConnectionCloses;
	/**
	 * Number of HRPD connection close because of RTC loss or No FTC before data has flowed on the A10 connection
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumRFRelatedDrops")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumRFRelatedDrops;
	/**
	 * Number of HRPD connection close because of RTC loss or No FTC after data has flowed on the A10 connection
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumRFRelatedDrops")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumRFRelatedDrops;
	/**
	 * Total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumPageResponses")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumPageResponses;
	/**
	 * Total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumPageResponses")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumPageResponses;
	/**
	 * This statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumRFRelatedDropsRTCLost")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumRFRelatedDropsRTCLost;
	/**
	 * This statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumRFRelatedDropsRTCLost")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumRFRelatedDropsRTCLost;
	/**
	 * This statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumRFRelatedDropsNoFTC")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumRFRelatedDropsNoFTC;
	/**
	 * This statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumRFRelatedDropsNoFTC")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumRFRelatedDropsNoFTC;
	/**
	 * This statistic counts the number of HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumNetworkErrorDrops")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumNetworkErrorDrops;
	/**
	 * This statistic counts the number of HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumNetworkErrorDrops")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumNetworkErrorDrops;
	/**
	 * This statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumNetworkErrorDropsRNCInternal")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumNetworkErrorDropsRNCInternal;
	/**
	 * This statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumNetworkErrorDropsRNCInternal")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumNetworkErrorDropsRNCInternal;
	/**
	 * This statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumNetworkErrorDropsRNCExternal")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumNetworkErrorDropsRNCExternal;
	/**
	 * This statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumNetworkErrorDropsRNCExternal")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumNetworkErrorDropsRNCExternal;
	/**
	 * This statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumNetworkErrorDropsA10SetupFail")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumNetworkErrorDropsA10SetupFail;
	/**
	 * This statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumNetworkErrorDropsA10SetupFail")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumNetworkErrorDropsA10SetupFail;
	/**
	 * This statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumMiscDropsSectorDown")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumMiscDropsSectorDown;
	/**
	 * This statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumMiscDropsSectorDown")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumMiscDropsSectorDown;
	/**
	 * This statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumMiscDropsInternalError")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumMiscDropsInternalError;
	/**
	 * This statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumMiscDropsInternalError")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumMiscDropsInternalError;
	/**
	 * This statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection when the FAP finds a state mismatch between itself andthe AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumMiscDropsStateMismatch")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumMiscDropsStateMismatch;
	/**
	 * This statistic counts the number of connections that were dropped before the demarcation point when the FAP finds a state mismatch between itself and the AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumMiscDropsStateMismatch")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumMiscDropsStateMismatch;
	/**
	 * This statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SNumMiscDropsDueToRLP")
	@CWMPParameter(activeNotify = "canDeny")
	public Long snumMiscDropsDueToRLP;
	/**
	 * This statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "CNumMiscDropsDueToRLP")
	@CWMPParameter(activeNotify = "canDeny")
	public Long cnumMiscDropsDueToRLP;

	public RNCSigAppsStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of HRPD Page requests made after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumPageRequests() {
		return cnumPageRequests;
	}

	/**
	 * Set the number of HRPD Page requests made after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumPageRequests the input value
	 */
	public void  setCnumPageRequests(Long cnumPageRequests) {
		this.cnumPageRequests = cnumPageRequests;
	}

	/**
	 * Set the number of HRPD Page requests made after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumPageRequests the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumPageRequests(Long cnumPageRequests) {
		this.cnumPageRequests = cnumPageRequests;
		return this;
	}

	/**
	 * Get the number of HRPD Page requests made before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumPageRequests() {
		return snumPageRequests;
	}

	/**
	 * Set the number of HRPD Page requests made before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumPageRequests the input value
	 */
	public void  setSnumPageRequests(Long snumPageRequests) {
		this.snumPageRequests = snumPageRequests;
	}

	/**
	 * Set the number of HRPD Page requests made before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumPageRequests the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumPageRequests(Long snumPageRequests) {
		this.snumPageRequests = snumPageRequests;
		return this;
	}

	/**
	 * Get the number of HRPD Connection setups attempted before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumConnectionSetupAttempts() {
		return snumConnectionSetupAttempts;
	}

	/**
	 * Set the number of HRPD Connection setups attempted before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumConnectionSetupAttempts the input value
	 */
	public void  setSnumConnectionSetupAttempts(Long snumConnectionSetupAttempts) {
		this.snumConnectionSetupAttempts = snumConnectionSetupAttempts;
	}

	/**
	 * Set the number of HRPD Connection setups attempted before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumConnectionSetupAttempts the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumConnectionSetupAttempts(Long snumConnectionSetupAttempts) {
		this.snumConnectionSetupAttempts = snumConnectionSetupAttempts;
		return this;
	}

	/**
	 * Get the number of HRPD Connection setups attempted after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumConnectionSetupAttempts() {
		return cnumConnectionSetupAttempts;
	}

	/**
	 * Set the number of HRPD Connection setups attempted after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumConnectionSetupAttempts the input value
	 */
	public void  setCnumConnectionSetupAttempts(Long cnumConnectionSetupAttempts) {
		this.cnumConnectionSetupAttempts = cnumConnectionSetupAttempts;
	}

	/**
	 * Set the number of HRPD Connection setups attempted after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumConnectionSetupAttempts the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumConnectionSetupAttempts(Long cnumConnectionSetupAttempts) {
		this.cnumConnectionSetupAttempts = cnumConnectionSetupAttempts;
		return this;
	}

	/**
	 * Get the number of HRPD Connection setups succeeded before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumConnectionSetupSuccess() {
		return snumConnectionSetupSuccess;
	}

	/**
	 * Set the number of HRPD Connection setups succeeded before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumConnectionSetupSuccess the input value
	 */
	public void  setSnumConnectionSetupSuccess(Long snumConnectionSetupSuccess) {
		this.snumConnectionSetupSuccess = snumConnectionSetupSuccess;
	}

	/**
	 * Set the number of HRPD Connection setups succeeded before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumConnectionSetupSuccess the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumConnectionSetupSuccess(Long snumConnectionSetupSuccess) {
		this.snumConnectionSetupSuccess = snumConnectionSetupSuccess;
		return this;
	}

	/**
	 * Get the number of HRPD Connection setups succeeded after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumConnectionSetupSuccess() {
		return cnumConnectionSetupSuccess;
	}

	/**
	 * Set the number of HRPD Connection setups succeeded after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumConnectionSetupSuccess the input value
	 */
	public void  setCnumConnectionSetupSuccess(Long cnumConnectionSetupSuccess) {
		this.cnumConnectionSetupSuccess = cnumConnectionSetupSuccess;
	}

	/**
	 * Set the number of HRPD Connection setups succeeded after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumConnectionSetupSuccess the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumConnectionSetupSuccess(Long cnumConnectionSetupSuccess) {
		this.cnumConnectionSetupSuccess = cnumConnectionSetupSuccess;
		return this;
	}

	/**
	 * Get the number of HRPD connections that were closed normally before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumNormalConnectionCloses() {
		return snumNormalConnectionCloses;
	}

	/**
	 * Set the number of HRPD connections that were closed normally before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumNormalConnectionCloses the input value
	 */
	public void  setSnumNormalConnectionCloses(Long snumNormalConnectionCloses) {
		this.snumNormalConnectionCloses = snumNormalConnectionCloses;
	}

	/**
	 * Set the number of HRPD connections that were closed normally before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumNormalConnectionCloses the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumNormalConnectionCloses(Long snumNormalConnectionCloses) {
		this.snumNormalConnectionCloses = snumNormalConnectionCloses;
		return this;
	}

	/**
	 * Get the number of HRPD connections that were closed normally after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumNormalConnectionCloses() {
		return cnumNormalConnectionCloses;
	}

	/**
	 * Set the number of HRPD connections that were closed normally after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumNormalConnectionCloses the input value
	 */
	public void  setCnumNormalConnectionCloses(Long cnumNormalConnectionCloses) {
		this.cnumNormalConnectionCloses = cnumNormalConnectionCloses;
	}

	/**
	 * Set the number of HRPD connections that were closed normally after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumNormalConnectionCloses the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumNormalConnectionCloses(Long cnumNormalConnectionCloses) {
		this.cnumNormalConnectionCloses = cnumNormalConnectionCloses;
		return this;
	}

	/**
	 * Get the total number of HRPD connections closed, normally or abnormally, data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumTotalConnectionCloses() {
		return snumTotalConnectionCloses;
	}

	/**
	 * Set the total number of HRPD connections closed, normally or abnormally, data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumTotalConnectionCloses the input value
	 */
	public void  setSnumTotalConnectionCloses(Long snumTotalConnectionCloses) {
		this.snumTotalConnectionCloses = snumTotalConnectionCloses;
	}

	/**
	 * Set the total number of HRPD connections closed, normally or abnormally, data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumTotalConnectionCloses the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumTotalConnectionCloses(Long snumTotalConnectionCloses) {
		this.snumTotalConnectionCloses = snumTotalConnectionCloses;
		return this;
	}

	/**
	 * Get the total number of HRPD connections closed, normally or abnormally, after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumTotalConnectionCloses() {
		return cnumTotalConnectionCloses;
	}

	/**
	 * Set the total number of HRPD connections closed, normally or abnormally, after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumTotalConnectionCloses the input value
	 */
	public void  setCnumTotalConnectionCloses(Long cnumTotalConnectionCloses) {
		this.cnumTotalConnectionCloses = cnumTotalConnectionCloses;
	}

	/**
	 * Set the total number of HRPD connections closed, normally or abnormally, after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumTotalConnectionCloses the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumTotalConnectionCloses(Long cnumTotalConnectionCloses) {
		this.cnumTotalConnectionCloses = cnumTotalConnectionCloses;
		return this;
	}

	/**
	 * Get the number of HRPD connection close because of RTC loss or No FTC before data has flowed on the A10 connection
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumRFRelatedDrops() {
		return snumRFRelatedDrops;
	}

	/**
	 * Set the number of HRPD connection close because of RTC loss or No FTC before data has flowed on the A10 connection
	 *
	 * @since 2.0
	 * @param snumRFRelatedDrops the input value
	 */
	public void  setSnumRFRelatedDrops(Long snumRFRelatedDrops) {
		this.snumRFRelatedDrops = snumRFRelatedDrops;
	}

	/**
	 * Set the number of HRPD connection close because of RTC loss or No FTC before data has flowed on the A10 connection
	 *
	 * @since 2.0
	 * @param snumRFRelatedDrops the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumRFRelatedDrops(Long snumRFRelatedDrops) {
		this.snumRFRelatedDrops = snumRFRelatedDrops;
		return this;
	}

	/**
	 * Get the number of HRPD connection close because of RTC loss or No FTC after data has flowed on the A10 connection
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumRFRelatedDrops() {
		return cnumRFRelatedDrops;
	}

	/**
	 * Set the number of HRPD connection close because of RTC loss or No FTC after data has flowed on the A10 connection
	 *
	 * @since 2.0
	 * @param cnumRFRelatedDrops the input value
	 */
	public void  setCnumRFRelatedDrops(Long cnumRFRelatedDrops) {
		this.cnumRFRelatedDrops = cnumRFRelatedDrops;
	}

	/**
	 * Set the number of HRPD connection close because of RTC loss or No FTC after data has flowed on the A10 connection
	 *
	 * @since 2.0
	 * @param cnumRFRelatedDrops the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumRFRelatedDrops(Long cnumRFRelatedDrops) {
		this.cnumRFRelatedDrops = cnumRFRelatedDrops;
		return this;
	}

	/**
	 * Get the total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumPageResponses() {
		return snumPageResponses;
	}

	/**
	 * Set the total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumPageResponses the input value
	 */
	public void  setSnumPageResponses(Long snumPageResponses) {
		this.snumPageResponses = snumPageResponses;
	}

	/**
	 * Set the total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and before data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param snumPageResponses the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumPageResponses(Long snumPageResponses) {
		this.snumPageResponses = snumPageResponses;
		return this;
	}

	/**
	 * Get the total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumPageResponses() {
		return cnumPageResponses;
	}

	/**
	 * Set the total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumPageResponses the input value
	 */
	public void  setCnumPageResponses(Long cnumPageResponses) {
		this.cnumPageResponses = cnumPageResponses;
	}

	/**
	 * Set the total number of successful responses to HRPD page requests that were received from the AT before the final page timeout and after data has flowed on the A10 connection.
	 *
	 * @since 2.0
	 * @param cnumPageResponses the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumPageResponses(Long cnumPageResponses) {
		this.cnumPageResponses = cnumPageResponses;
		return this;
	}

	/**
	 * Get the this statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumRFRelatedDropsRTCLost() {
		return snumRFRelatedDropsRTCLost;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 * @param snumRFRelatedDropsRTCLost the input value
	 */
	public void  setSnumRFRelatedDropsRTCLost(Long snumRFRelatedDropsRTCLost) {
		this.snumRFRelatedDropsRTCLost = snumRFRelatedDropsRTCLost;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 * @param snumRFRelatedDropsRTCLost the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumRFRelatedDropsRTCLost(Long snumRFRelatedDropsRTCLost) {
		this.snumRFRelatedDropsRTCLost = snumRFRelatedDropsRTCLost;
		return this;
	}

	/**
	 * Get the this statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumRFRelatedDropsRTCLost() {
		return cnumRFRelatedDropsRTCLost;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 * @param cnumRFRelatedDropsRTCLost the input value
	 */
	public void  setCnumRFRelatedDropsRTCLost(Long cnumRFRelatedDropsRTCLost) {
		this.cnumRFRelatedDropsRTCLost = cnumRFRelatedDropsRTCLost;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection because a Reverse Traffic Channel (RTC) lost indication was received, and as a result, no reverse link for the connection were available.
	 *
	 * @since 2.0
	 * @param cnumRFRelatedDropsRTCLost the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumRFRelatedDropsRTCLost(Long cnumRFRelatedDropsRTCLost) {
		this.cnumRFRelatedDropsRTCLost = cnumRFRelatedDropsRTCLost;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumRFRelatedDropsNoFTC() {
		return snumRFRelatedDropsNoFTC;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 * @param snumRFRelatedDropsNoFTC the input value
	 */
	public void  setSnumRFRelatedDropsNoFTC(Long snumRFRelatedDropsNoFTC) {
		this.snumRFRelatedDropsNoFTC = snumRFRelatedDropsNoFTC;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 * @param snumRFRelatedDropsNoFTC the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumRFRelatedDropsNoFTC(Long snumRFRelatedDropsNoFTC) {
		this.snumRFRelatedDropsNoFTC = snumRFRelatedDropsNoFTC;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumRFRelatedDropsNoFTC() {
		return cnumRFRelatedDropsNoFTC;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 * @param cnumRFRelatedDropsNoFTC the input value
	 */
	public void  setCnumRFRelatedDropsNoFTC(Long cnumRFRelatedDropsNoFTC) {
		this.cnumRFRelatedDropsNoFTC = cnumRFRelatedDropsNoFTC;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because of indications that there is no active Forward Traffic Channel (FTC) available.
	 *
	 * @since 2.0
	 * @param cnumRFRelatedDropsNoFTC the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumRFRelatedDropsNoFTC(Long cnumRFRelatedDropsNoFTC) {
		this.cnumRFRelatedDropsNoFTC = cnumRFRelatedDropsNoFTC;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumNetworkErrorDrops() {
		return snumNetworkErrorDrops;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDrops the input value
	 */
	public void  setSnumNetworkErrorDrops(Long snumNetworkErrorDrops) {
		this.snumNetworkErrorDrops = snumNetworkErrorDrops;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDrops the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumNetworkErrorDrops(Long snumNetworkErrorDrops) {
		this.snumNetworkErrorDrops = snumNetworkErrorDrops;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumNetworkErrorDrops() {
		return cnumNetworkErrorDrops;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDrops the input value
	 */
	public void  setCnumNetworkErrorDrops(Long cnumNetworkErrorDrops) {
		this.cnumNetworkErrorDrops = cnumNetworkErrorDrops;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the open A10 connection.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDrops the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumNetworkErrorDrops(Long cnumNetworkErrorDrops) {
		this.cnumNetworkErrorDrops = cnumNetworkErrorDrops;
		return this;
	}

	/**
	 * Get the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumNetworkErrorDropsRNCInternal() {
		return snumNetworkErrorDropsRNCInternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDropsRNCInternal the input value
	 */
	public void  setSnumNetworkErrorDropsRNCInternal(Long snumNetworkErrorDropsRNCInternal) {
		this.snumNetworkErrorDropsRNCInternal = snumNetworkErrorDropsRNCInternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDropsRNCInternal the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumNetworkErrorDropsRNCInternal(Long snumNetworkErrorDropsRNCInternal) {
		this.snumNetworkErrorDropsRNCInternal = snumNetworkErrorDropsRNCInternal;
		return this;
	}

	/**
	 * Get the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumNetworkErrorDropsRNCInternal() {
		return cnumNetworkErrorDropsRNCInternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDropsRNCInternal the input value
	 */
	public void  setCnumNetworkErrorDropsRNCInternal(Long cnumNetworkErrorDropsRNCInternal) {
		this.cnumNetworkErrorDropsRNCInternal = cnumNetworkErrorDropsRNCInternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to internal failures.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDropsRNCInternal the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumNetworkErrorDropsRNCInternal(Long cnumNetworkErrorDropsRNCInternal) {
		this.cnumNetworkErrorDropsRNCInternal = cnumNetworkErrorDropsRNCInternal;
		return this;
	}

	/**
	 * Get the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumNetworkErrorDropsRNCExternal() {
		return snumNetworkErrorDropsRNCExternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDropsRNCExternal the input value
	 */
	public void  setSnumNetworkErrorDropsRNCExternal(Long snumNetworkErrorDropsRNCExternal) {
		this.snumNetworkErrorDropsRNCExternal = snumNetworkErrorDropsRNCExternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDropsRNCExternal the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumNetworkErrorDropsRNCExternal(Long snumNetworkErrorDropsRNCExternal) {
		this.snumNetworkErrorDropsRNCExternal = snumNetworkErrorDropsRNCExternal;
		return this;
	}

	/**
	 * Get the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumNetworkErrorDropsRNCExternal() {
		return cnumNetworkErrorDropsRNCExternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDropsRNCExternal the input value
	 */
	public void  setCnumNetworkErrorDropsRNCExternal(Long cnumNetworkErrorDropsRNCExternal) {
		this.cnumNetworkErrorDropsRNCExternal = cnumNetworkErrorDropsRNCExternal;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because the FAP closed the A10 connection due to the PDSN unreachablity.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDropsRNCExternal the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumNetworkErrorDropsRNCExternal(Long cnumNetworkErrorDropsRNCExternal) {
		this.cnumNetworkErrorDropsRNCExternal = cnumNetworkErrorDropsRNCExternal;
		return this;
	}

	/**
	 * Get the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumNetworkErrorDropsA10SetupFail() {
		return snumNetworkErrorDropsA10SetupFail;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDropsA10SetupFail the input value
	 */
	public void  setSnumNetworkErrorDropsA10SetupFail(Long snumNetworkErrorDropsA10SetupFail) {
		this.snumNetworkErrorDropsA10SetupFail = snumNetworkErrorDropsA10SetupFail;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed before data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 * @param snumNetworkErrorDropsA10SetupFail the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumNetworkErrorDropsA10SetupFail(Long snumNetworkErrorDropsA10SetupFail) {
		this.snumNetworkErrorDropsA10SetupFail = snumNetworkErrorDropsA10SetupFail;
		return this;
	}

	/**
	 * Get the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumNetworkErrorDropsA10SetupFail() {
		return cnumNetworkErrorDropsA10SetupFail;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDropsA10SetupFail the input value
	 */
	public void  setCnumNetworkErrorDropsA10SetupFail(Long cnumNetworkErrorDropsA10SetupFail) {
		this.cnumNetworkErrorDropsA10SetupFail = cnumNetworkErrorDropsA10SetupFail;
	}

	/**
	 * Set the this statistic counts the number of open HRPD connections that were closed after data has flowed on the A10 connection because there was failure in the A10 connection set-up.
	 *
	 * @since 2.0
	 * @param cnumNetworkErrorDropsA10SetupFail the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumNetworkErrorDropsA10SetupFail(Long cnumNetworkErrorDropsA10SetupFail) {
		this.cnumNetworkErrorDropsA10SetupFail = cnumNetworkErrorDropsA10SetupFail;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumMiscDropsSectorDown() {
		return snumMiscDropsSectorDown;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 * @param snumMiscDropsSectorDown the input value
	 */
	public void  setSnumMiscDropsSectorDown(Long snumMiscDropsSectorDown) {
		this.snumMiscDropsSectorDown = snumMiscDropsSectorDown;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 * @param snumMiscDropsSectorDown the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumMiscDropsSectorDown(Long snumMiscDropsSectorDown) {
		this.snumMiscDropsSectorDown = snumMiscDropsSectorDown;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumMiscDropsSectorDown() {
		return cnumMiscDropsSectorDown;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsSectorDown the input value
	 */
	public void  setCnumMiscDropsSectorDown(Long cnumMiscDropsSectorDown) {
		this.cnumMiscDropsSectorDown = cnumMiscDropsSectorDown;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection because there is only one pilot available for the connection and a sector down indication has been received for that pilot.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsSectorDown the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumMiscDropsSectorDown(Long cnumMiscDropsSectorDown) {
		this.cnumMiscDropsSectorDown = cnumMiscDropsSectorDown;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumMiscDropsInternalError() {
		return snumMiscDropsInternalError;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 * @param snumMiscDropsInternalError the input value
	 */
	public void  setSnumMiscDropsInternalError(Long snumMiscDropsInternalError) {
		this.snumMiscDropsInternalError = snumMiscDropsInternalError;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped before data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 * @param snumMiscDropsInternalError the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumMiscDropsInternalError(Long snumMiscDropsInternalError) {
		this.snumMiscDropsInternalError = snumMiscDropsInternalError;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumMiscDropsInternalError() {
		return cnumMiscDropsInternalError;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsInternalError the input value
	 */
	public void  setCnumMiscDropsInternalError(Long cnumMiscDropsInternalError) {
		this.cnumMiscDropsInternalError = cnumMiscDropsInternalError;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection due to internal software errors.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsInternalError the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumMiscDropsInternalError(Long cnumMiscDropsInternalError) {
		this.cnumMiscDropsInternalError = cnumMiscDropsInternalError;
		return this;
	}

	/**
	 * Get the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection when the FAP finds a state mismatch between itself andthe AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumMiscDropsStateMismatch() {
		return cnumMiscDropsStateMismatch;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection when the FAP finds a state mismatch between itself andthe AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsStateMismatch the input value
	 */
	public void  setCnumMiscDropsStateMismatch(Long cnumMiscDropsStateMismatch) {
		this.cnumMiscDropsStateMismatch = cnumMiscDropsStateMismatch;
	}

	/**
	 * Set the this statistic counts the number of HRPD connections that were dropped after data has flowed on the A10 connection when the FAP finds a state mismatch between itself andthe AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsStateMismatch the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumMiscDropsStateMismatch(Long cnumMiscDropsStateMismatch) {
		this.cnumMiscDropsStateMismatch = cnumMiscDropsStateMismatch;
		return this;
	}

	/**
	 * Get the this statistic counts the number of connections that were dropped before the demarcation point when the FAP finds a state mismatch between itself and the AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumMiscDropsStateMismatch() {
		return snumMiscDropsStateMismatch;
	}

	/**
	 * Set the this statistic counts the number of connections that were dropped before the demarcation point when the FAP finds a state mismatch between itself and the AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 * @param snumMiscDropsStateMismatch the input value
	 */
	public void  setSnumMiscDropsStateMismatch(Long snumMiscDropsStateMismatch) {
		this.snumMiscDropsStateMismatch = snumMiscDropsStateMismatch;
	}

	/**
	 * Set the this statistic counts the number of connections that were dropped before the demarcation point when the FAP finds a state mismatch between itself and the AT. Such a mismatch is found when a connection request message is received from the AT, and the connection is already open as perceived by the FAP.
	 *
	 * @since 2.0
	 * @param snumMiscDropsStateMismatch the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumMiscDropsStateMismatch(Long snumMiscDropsStateMismatch) {
		this.snumMiscDropsStateMismatch = snumMiscDropsStateMismatch;
		return this;
	}

	/**
	 * Get the this statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getSnumMiscDropsDueToRLP() {
		return snumMiscDropsDueToRLP;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 * @param snumMiscDropsDueToRLP the input value
	 */
	public void  setSnumMiscDropsDueToRLP(Long snumMiscDropsDueToRLP) {
		this.snumMiscDropsDueToRLP = snumMiscDropsDueToRLP;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped before data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 * @param snumMiscDropsDueToRLP the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withSnumMiscDropsDueToRLP(Long snumMiscDropsDueToRLP) {
		this.snumMiscDropsDueToRLP = snumMiscDropsDueToRLP;
		return this;
	}

	/**
	 * Get the this statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getCnumMiscDropsDueToRLP() {
		return cnumMiscDropsDueToRLP;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsDueToRLP the input value
	 */
	public void  setCnumMiscDropsDueToRLP(Long cnumMiscDropsDueToRLP) {
		this.cnumMiscDropsDueToRLP = cnumMiscDropsDueToRLP;
	}

	/**
	 * Set the this statistic counts the number of times the HRPD connection was dropped after data has flowed on the A10 connection at the request of the Radio Link Protocol. This request is generated when the HDR Fast Path component finds that the reset acknowledgment timeout has expired for the connection.
	 *
	 * @since 2.0
	 * @param cnumMiscDropsDueToRLP the input value
	 * @return this instance
	 */
	public RNCSigAppsStats withCnumMiscDropsDueToRLP(Long cnumMiscDropsDueToRLP) {
		this.cnumMiscDropsDueToRLP = cnumMiscDropsDueToRLP;
		return this;
	}

	//</editor-fold>

}