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
	 * This object is used in obtaining the QoS Common Performance stats
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "FAPService.{i}.CellConfig.CDMA2000.HRPD.QoSStats.")
public class QoSStats {

	/**
	 * Number of subscriber QoS profile updates received from the PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumQoSSubscriberProfileUpdatesRcvd")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numQoSSubscriberProfileUpdatesRcvd;
	/**
	 * Number of PDSN IP flow update messages received from PDSN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumPDSNIPFlowUpdatesMsgRcvd")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numPDSNIPFlowUpdatesMsgRcvd;
	/**
	 * Number of PDSN IP Flow updates messages that failed per RNC.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumPDSNIPFlowUpdatesMsgFailed")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numPDSNIPFlowUpdatesMsgFailed;
	/**
	 * Number of QoS setup requests received from the AT.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumQoSSetupRequestsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numQoSSetupRequestsReceived;
	/**
	 * Number of QoS setup requests received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumQoSSetupRequestsAccepted")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numQoSSetupRequestsAccepted;
	/**
	 * Number of QoS setup requests from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumQoSSetupRequestsRejected")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numQoSSetupRequestsRejected;
	/**
	 * Number of ReservationOnRequest messages received from the AT.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReservationOnRequestsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numReservationOnRequestsReceived;
	/**
	 * Number of ReservationOnRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReservationOnRequestsAccepted")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numReservationOnRequestsAccepted;
	/**
	 * Number of ReservationOnRequest message received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReservationOnRequestsRejected")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numReservationOnRequestsRejected;
	/**
	 * Number of ReservationOnRequest message received from the AT that the FAP RNC failed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReservationOnRequestsFailed")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numReservationOnRequestsFailed;
	/**
	 * Number of times the FAP RNC sent a FwdReservationOn message to the AT to activate a forward Reservation.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumFwdReservationOnMessagesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numFwdReservationOnMessagesSent;
	/**
	 * Number of times the FAP RNC sent a RevReservationOn message to the AT to activate a reverse Reservation.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumRevReservationOnMessagesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numRevReservationOnMessagesSent;
	/**
	 * Number of ReservationOffRequest message is received from the AT.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReservationOffRequestsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numReservationOffRequestsReceived;
	/**
	 * Number of ReservationOffRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReservationOffRequestsAccepted")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numReservationOffRequestsAccepted;
	/**
	 * Number of ReservationOffRequest messages received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumReservationOffRequestsRejected")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numReservationOffRequestsRejected;
	/**
	 * Number of times the FAP RNC sent a FwdReservationOff message to the AT to deactivate a forward Reservation.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumFwdReservationOffMessagesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numFwdReservationOffMessagesSent;
	/**
	 * Number of times the FAP RNC sent a RevReservationOff message to the AT to deactivate a reverse Reservation.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumRevReservationOffMessagesSent")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numRevReservationOffMessagesSent;
	/**
	 * Number of QoS release requests received from the AT.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumQoSReleaseRequestsReceived")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numQoSReleaseRequestsReceived;
	/**
	 * Number of times FAP RNC initiated a connection close in response to the ReservationOnRequest because it did not have the RAN resources to satisfy one or more Reservations included in the request.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "NumConnectionCloseInitiatedNoRANRsr")
	@CWMPParameter(activeNotify = "canDeny")
	public Long numConnectionCloseInitiatedNoRANRsr;

	public QoSStats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of subscriber QoS profile updates received from the PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumQoSSubscriberProfileUpdatesRcvd() {
		return numQoSSubscriberProfileUpdatesRcvd;
	}

	/**
	 * Set the number of subscriber QoS profile updates received from the PDSN.
	 *
	 * @since 2.0
	 * @param numQoSSubscriberProfileUpdatesRcvd the input value
	 */
	public void  setNumQoSSubscriberProfileUpdatesRcvd(Long numQoSSubscriberProfileUpdatesRcvd) {
		this.numQoSSubscriberProfileUpdatesRcvd = numQoSSubscriberProfileUpdatesRcvd;
	}

	/**
	 * Set the number of subscriber QoS profile updates received from the PDSN.
	 *
	 * @since 2.0
	 * @param numQoSSubscriberProfileUpdatesRcvd the input value
	 * @return this instance
	 */
	public QoSStats withNumQoSSubscriberProfileUpdatesRcvd(Long numQoSSubscriberProfileUpdatesRcvd) {
		this.numQoSSubscriberProfileUpdatesRcvd = numQoSSubscriberProfileUpdatesRcvd;
		return this;
	}

	/**
	 * Get the number of PDSN IP flow update messages received from PDSN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumPDSNIPFlowUpdatesMsgRcvd() {
		return numPDSNIPFlowUpdatesMsgRcvd;
	}

	/**
	 * Set the number of PDSN IP flow update messages received from PDSN.
	 *
	 * @since 2.0
	 * @param numPDSNIPFlowUpdatesMsgRcvd the input value
	 */
	public void  setNumPDSNIPFlowUpdatesMsgRcvd(Long numPDSNIPFlowUpdatesMsgRcvd) {
		this.numPDSNIPFlowUpdatesMsgRcvd = numPDSNIPFlowUpdatesMsgRcvd;
	}

	/**
	 * Set the number of PDSN IP flow update messages received from PDSN.
	 *
	 * @since 2.0
	 * @param numPDSNIPFlowUpdatesMsgRcvd the input value
	 * @return this instance
	 */
	public QoSStats withNumPDSNIPFlowUpdatesMsgRcvd(Long numPDSNIPFlowUpdatesMsgRcvd) {
		this.numPDSNIPFlowUpdatesMsgRcvd = numPDSNIPFlowUpdatesMsgRcvd;
		return this;
	}

	/**
	 * Get the number of PDSN IP Flow updates messages that failed per RNC.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumPDSNIPFlowUpdatesMsgFailed() {
		return numPDSNIPFlowUpdatesMsgFailed;
	}

	/**
	 * Set the number of PDSN IP Flow updates messages that failed per RNC.
	 *
	 * @since 2.0
	 * @param numPDSNIPFlowUpdatesMsgFailed the input value
	 */
	public void  setNumPDSNIPFlowUpdatesMsgFailed(Long numPDSNIPFlowUpdatesMsgFailed) {
		this.numPDSNIPFlowUpdatesMsgFailed = numPDSNIPFlowUpdatesMsgFailed;
	}

	/**
	 * Set the number of PDSN IP Flow updates messages that failed per RNC.
	 *
	 * @since 2.0
	 * @param numPDSNIPFlowUpdatesMsgFailed the input value
	 * @return this instance
	 */
	public QoSStats withNumPDSNIPFlowUpdatesMsgFailed(Long numPDSNIPFlowUpdatesMsgFailed) {
		this.numPDSNIPFlowUpdatesMsgFailed = numPDSNIPFlowUpdatesMsgFailed;
		return this;
	}

	/**
	 * Get the number of QoS setup requests received from the AT.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumQoSSetupRequestsReceived() {
		return numQoSSetupRequestsReceived;
	}

	/**
	 * Set the number of QoS setup requests received from the AT.
	 *
	 * @since 2.0
	 * @param numQoSSetupRequestsReceived the input value
	 */
	public void  setNumQoSSetupRequestsReceived(Long numQoSSetupRequestsReceived) {
		this.numQoSSetupRequestsReceived = numQoSSetupRequestsReceived;
	}

	/**
	 * Set the number of QoS setup requests received from the AT.
	 *
	 * @since 2.0
	 * @param numQoSSetupRequestsReceived the input value
	 * @return this instance
	 */
	public QoSStats withNumQoSSetupRequestsReceived(Long numQoSSetupRequestsReceived) {
		this.numQoSSetupRequestsReceived = numQoSSetupRequestsReceived;
		return this;
	}

	/**
	 * Get the number of QoS setup requests received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumQoSSetupRequestsAccepted() {
		return numQoSSetupRequestsAccepted;
	}

	/**
	 * Set the number of QoS setup requests received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @param numQoSSetupRequestsAccepted the input value
	 */
	public void  setNumQoSSetupRequestsAccepted(Long numQoSSetupRequestsAccepted) {
		this.numQoSSetupRequestsAccepted = numQoSSetupRequestsAccepted;
	}

	/**
	 * Set the number of QoS setup requests received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @param numQoSSetupRequestsAccepted the input value
	 * @return this instance
	 */
	public QoSStats withNumQoSSetupRequestsAccepted(Long numQoSSetupRequestsAccepted) {
		this.numQoSSetupRequestsAccepted = numQoSSetupRequestsAccepted;
		return this;
	}

	/**
	 * Get the number of QoS setup requests from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumQoSSetupRequestsRejected() {
		return numQoSSetupRequestsRejected;
	}

	/**
	 * Set the number of QoS setup requests from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @param numQoSSetupRequestsRejected the input value
	 */
	public void  setNumQoSSetupRequestsRejected(Long numQoSSetupRequestsRejected) {
		this.numQoSSetupRequestsRejected = numQoSSetupRequestsRejected;
	}

	/**
	 * Set the number of QoS setup requests from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @param numQoSSetupRequestsRejected the input value
	 * @return this instance
	 */
	public QoSStats withNumQoSSetupRequestsRejected(Long numQoSSetupRequestsRejected) {
		this.numQoSSetupRequestsRejected = numQoSSetupRequestsRejected;
		return this;
	}

	/**
	 * Get the number of ReservationOnRequest messages received from the AT.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReservationOnRequestsReceived() {
		return numReservationOnRequestsReceived;
	}

	/**
	 * Set the number of ReservationOnRequest messages received from the AT.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsReceived the input value
	 */
	public void  setNumReservationOnRequestsReceived(Long numReservationOnRequestsReceived) {
		this.numReservationOnRequestsReceived = numReservationOnRequestsReceived;
	}

	/**
	 * Set the number of ReservationOnRequest messages received from the AT.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsReceived the input value
	 * @return this instance
	 */
	public QoSStats withNumReservationOnRequestsReceived(Long numReservationOnRequestsReceived) {
		this.numReservationOnRequestsReceived = numReservationOnRequestsReceived;
		return this;
	}

	/**
	 * Get the number of ReservationOnRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReservationOnRequestsAccepted() {
		return numReservationOnRequestsAccepted;
	}

	/**
	 * Set the number of ReservationOnRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsAccepted the input value
	 */
	public void  setNumReservationOnRequestsAccepted(Long numReservationOnRequestsAccepted) {
		this.numReservationOnRequestsAccepted = numReservationOnRequestsAccepted;
	}

	/**
	 * Set the number of ReservationOnRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsAccepted the input value
	 * @return this instance
	 */
	public QoSStats withNumReservationOnRequestsAccepted(Long numReservationOnRequestsAccepted) {
		this.numReservationOnRequestsAccepted = numReservationOnRequestsAccepted;
		return this;
	}

	/**
	 * Get the number of ReservationOnRequest message received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReservationOnRequestsRejected() {
		return numReservationOnRequestsRejected;
	}

	/**
	 * Set the number of ReservationOnRequest message received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsRejected the input value
	 */
	public void  setNumReservationOnRequestsRejected(Long numReservationOnRequestsRejected) {
		this.numReservationOnRequestsRejected = numReservationOnRequestsRejected;
	}

	/**
	 * Set the number of ReservationOnRequest message received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsRejected the input value
	 * @return this instance
	 */
	public QoSStats withNumReservationOnRequestsRejected(Long numReservationOnRequestsRejected) {
		this.numReservationOnRequestsRejected = numReservationOnRequestsRejected;
		return this;
	}

	/**
	 * Get the number of ReservationOnRequest message received from the AT that the FAP RNC failed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReservationOnRequestsFailed() {
		return numReservationOnRequestsFailed;
	}

	/**
	 * Set the number of ReservationOnRequest message received from the AT that the FAP RNC failed.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsFailed the input value
	 */
	public void  setNumReservationOnRequestsFailed(Long numReservationOnRequestsFailed) {
		this.numReservationOnRequestsFailed = numReservationOnRequestsFailed;
	}

	/**
	 * Set the number of ReservationOnRequest message received from the AT that the FAP RNC failed.
	 *
	 * @since 2.0
	 * @param numReservationOnRequestsFailed the input value
	 * @return this instance
	 */
	public QoSStats withNumReservationOnRequestsFailed(Long numReservationOnRequestsFailed) {
		this.numReservationOnRequestsFailed = numReservationOnRequestsFailed;
		return this;
	}

	/**
	 * Get the number of times the FAP RNC sent a FwdReservationOn message to the AT to activate a forward Reservation.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumFwdReservationOnMessagesSent() {
		return numFwdReservationOnMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a FwdReservationOn message to the AT to activate a forward Reservation.
	 *
	 * @since 2.0
	 * @param numFwdReservationOnMessagesSent the input value
	 */
	public void  setNumFwdReservationOnMessagesSent(Long numFwdReservationOnMessagesSent) {
		this.numFwdReservationOnMessagesSent = numFwdReservationOnMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a FwdReservationOn message to the AT to activate a forward Reservation.
	 *
	 * @since 2.0
	 * @param numFwdReservationOnMessagesSent the input value
	 * @return this instance
	 */
	public QoSStats withNumFwdReservationOnMessagesSent(Long numFwdReservationOnMessagesSent) {
		this.numFwdReservationOnMessagesSent = numFwdReservationOnMessagesSent;
		return this;
	}

	/**
	 * Get the number of times the FAP RNC sent a RevReservationOn message to the AT to activate a reverse Reservation.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumRevReservationOnMessagesSent() {
		return numRevReservationOnMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a RevReservationOn message to the AT to activate a reverse Reservation.
	 *
	 * @since 2.0
	 * @param numRevReservationOnMessagesSent the input value
	 */
	public void  setNumRevReservationOnMessagesSent(Long numRevReservationOnMessagesSent) {
		this.numRevReservationOnMessagesSent = numRevReservationOnMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a RevReservationOn message to the AT to activate a reverse Reservation.
	 *
	 * @since 2.0
	 * @param numRevReservationOnMessagesSent the input value
	 * @return this instance
	 */
	public QoSStats withNumRevReservationOnMessagesSent(Long numRevReservationOnMessagesSent) {
		this.numRevReservationOnMessagesSent = numRevReservationOnMessagesSent;
		return this;
	}

	/**
	 * Get the number of ReservationOffRequest message is received from the AT.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReservationOffRequestsReceived() {
		return numReservationOffRequestsReceived;
	}

	/**
	 * Set the number of ReservationOffRequest message is received from the AT.
	 *
	 * @since 2.0
	 * @param numReservationOffRequestsReceived the input value
	 */
	public void  setNumReservationOffRequestsReceived(Long numReservationOffRequestsReceived) {
		this.numReservationOffRequestsReceived = numReservationOffRequestsReceived;
	}

	/**
	 * Set the number of ReservationOffRequest message is received from the AT.
	 *
	 * @since 2.0
	 * @param numReservationOffRequestsReceived the input value
	 * @return this instance
	 */
	public QoSStats withNumReservationOffRequestsReceived(Long numReservationOffRequestsReceived) {
		this.numReservationOffRequestsReceived = numReservationOffRequestsReceived;
		return this;
	}

	/**
	 * Get the number of ReservationOffRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReservationOffRequestsAccepted() {
		return numReservationOffRequestsAccepted;
	}

	/**
	 * Set the number of ReservationOffRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @param numReservationOffRequestsAccepted the input value
	 */
	public void  setNumReservationOffRequestsAccepted(Long numReservationOffRequestsAccepted) {
		this.numReservationOffRequestsAccepted = numReservationOffRequestsAccepted;
	}

	/**
	 * Set the number of ReservationOffRequest messages received from the AT that the FAP RNC accepted.
	 *
	 * @since 2.0
	 * @param numReservationOffRequestsAccepted the input value
	 * @return this instance
	 */
	public QoSStats withNumReservationOffRequestsAccepted(Long numReservationOffRequestsAccepted) {
		this.numReservationOffRequestsAccepted = numReservationOffRequestsAccepted;
		return this;
	}

	/**
	 * Get the number of ReservationOffRequest messages received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumReservationOffRequestsRejected() {
		return numReservationOffRequestsRejected;
	}

	/**
	 * Set the number of ReservationOffRequest messages received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @param numReservationOffRequestsRejected the input value
	 */
	public void  setNumReservationOffRequestsRejected(Long numReservationOffRequestsRejected) {
		this.numReservationOffRequestsRejected = numReservationOffRequestsRejected;
	}

	/**
	 * Set the number of ReservationOffRequest messages received from the AT that the FAP RNC rejected.
	 *
	 * @since 2.0
	 * @param numReservationOffRequestsRejected the input value
	 * @return this instance
	 */
	public QoSStats withNumReservationOffRequestsRejected(Long numReservationOffRequestsRejected) {
		this.numReservationOffRequestsRejected = numReservationOffRequestsRejected;
		return this;
	}

	/**
	 * Get the number of times the FAP RNC sent a FwdReservationOff message to the AT to deactivate a forward Reservation.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumFwdReservationOffMessagesSent() {
		return numFwdReservationOffMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a FwdReservationOff message to the AT to deactivate a forward Reservation.
	 *
	 * @since 2.0
	 * @param numFwdReservationOffMessagesSent the input value
	 */
	public void  setNumFwdReservationOffMessagesSent(Long numFwdReservationOffMessagesSent) {
		this.numFwdReservationOffMessagesSent = numFwdReservationOffMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a FwdReservationOff message to the AT to deactivate a forward Reservation.
	 *
	 * @since 2.0
	 * @param numFwdReservationOffMessagesSent the input value
	 * @return this instance
	 */
	public QoSStats withNumFwdReservationOffMessagesSent(Long numFwdReservationOffMessagesSent) {
		this.numFwdReservationOffMessagesSent = numFwdReservationOffMessagesSent;
		return this;
	}

	/**
	 * Get the number of times the FAP RNC sent a RevReservationOff message to the AT to deactivate a reverse Reservation.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumRevReservationOffMessagesSent() {
		return numRevReservationOffMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a RevReservationOff message to the AT to deactivate a reverse Reservation.
	 *
	 * @since 2.0
	 * @param numRevReservationOffMessagesSent the input value
	 */
	public void  setNumRevReservationOffMessagesSent(Long numRevReservationOffMessagesSent) {
		this.numRevReservationOffMessagesSent = numRevReservationOffMessagesSent;
	}

	/**
	 * Set the number of times the FAP RNC sent a RevReservationOff message to the AT to deactivate a reverse Reservation.
	 *
	 * @since 2.0
	 * @param numRevReservationOffMessagesSent the input value
	 * @return this instance
	 */
	public QoSStats withNumRevReservationOffMessagesSent(Long numRevReservationOffMessagesSent) {
		this.numRevReservationOffMessagesSent = numRevReservationOffMessagesSent;
		return this;
	}

	/**
	 * Get the number of QoS release requests received from the AT.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumQoSReleaseRequestsReceived() {
		return numQoSReleaseRequestsReceived;
	}

	/**
	 * Set the number of QoS release requests received from the AT.
	 *
	 * @since 2.0
	 * @param numQoSReleaseRequestsReceived the input value
	 */
	public void  setNumQoSReleaseRequestsReceived(Long numQoSReleaseRequestsReceived) {
		this.numQoSReleaseRequestsReceived = numQoSReleaseRequestsReceived;
	}

	/**
	 * Set the number of QoS release requests received from the AT.
	 *
	 * @since 2.0
	 * @param numQoSReleaseRequestsReceived the input value
	 * @return this instance
	 */
	public QoSStats withNumQoSReleaseRequestsReceived(Long numQoSReleaseRequestsReceived) {
		this.numQoSReleaseRequestsReceived = numQoSReleaseRequestsReceived;
		return this;
	}

	/**
	 * Get the number of times FAP RNC initiated a connection close in response to the ReservationOnRequest because it did not have the RAN resources to satisfy one or more Reservations included in the request.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getNumConnectionCloseInitiatedNoRANRsr() {
		return numConnectionCloseInitiatedNoRANRsr;
	}

	/**
	 * Set the number of times FAP RNC initiated a connection close in response to the ReservationOnRequest because it did not have the RAN resources to satisfy one or more Reservations included in the request.
	 *
	 * @since 2.0
	 * @param numConnectionCloseInitiatedNoRANRsr the input value
	 */
	public void  setNumConnectionCloseInitiatedNoRANRsr(Long numConnectionCloseInitiatedNoRANRsr) {
		this.numConnectionCloseInitiatedNoRANRsr = numConnectionCloseInitiatedNoRANRsr;
	}

	/**
	 * Set the number of times FAP RNC initiated a connection close in response to the ReservationOnRequest because it did not have the RAN resources to satisfy one or more Reservations included in the request.
	 *
	 * @since 2.0
	 * @param numConnectionCloseInitiatedNoRANRsr the input value
	 * @return this instance
	 */
	public QoSStats withNumConnectionCloseInitiatedNoRANRsr(Long numConnectionCloseInitiatedNoRANRsr) {
		this.numConnectionCloseInitiatedNoRANRsr = numConnectionCloseInitiatedNoRANRsr;
		return this;
	}

	//</editor-fold>

}