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
package org.broadbandforum.tr181.device.ieee8021x.supplicant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.common.MACAddress;

	/**
	 * 802.1x Authentication Supplicant EAP statistics information for this resource.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.IEEE8021x.Supplicant.{i}.Stats.")
@XmlRootElement(name = "Device.IEEE8021x.Supplicant.Stats")
@XmlType(name = "Device.IEEE8021x.Supplicant.Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {

	/**
	 * The number of EAPOL frames of any type that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceivedFrames")
	public Long receivedFrames = 0L;
	/**
	 * The number of EAPOL frames of any type that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames transmitted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmittedFrames")
	public Long transmittedFrames = 0L;
	/**
	 * The number of EAPOL Start frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Start frames transmitted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmittedStartFrames")
	public Long transmittedStartFrames = 0L;
	/**
	 * The number of EAPOL Logoff frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Logoff frames transmitted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmittedLogoffFrames")
	public Long transmittedLogoffFrames = 0L;
	/**
	 * The number of EAP Resp/Id frames that have been transmitted; {{bibref|802.1x-2004|9.5.2}}, EAP Resp/Id frames transmitted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmittedResponseIdFrames")
	public Long transmittedResponseIdFrames = 0L;
	/**
	 * The number of valid EAP Response frames (other than Resp/Id frames) that have been transmitted by this  Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Resp frames transmitted.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "TransmittedResponseFrames")
	public Long transmittedResponseFrames = 0L;
	/**
	 * The number of EAP Req/Id frames that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req/Id frames received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceivedRequestIdFrames")
	public Long receivedRequestIdFrames = 0L;
	/**
	 * The number of EAP Request frames (other than Rq/Id frames) that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceivedRequestFrames")
	public Long receivedRequestFrames = 0L;
	/**
	 * The number of EAPOL frames that have been received by this Supplicant in which the frame type is not recognized; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceivedInvalidFrames")
	public Long receivedInvalidFrames = 0L;
	/**
	 * The number of EAPOL frames that have been received by this Supplicant in which the Packet Body Length field is invalid; {{bibref|802.1x-2004|9.5.2}}, EAP length error frames received.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "ReceivedLengthErrorFrames")
	public Long receivedLengthErrorFrames = 0L;
	/**
	 * The protocol version number carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame version
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastFrameVersion")
	public Long lastFrameVersion;
	/**
	 * The source MAC address carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame source.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LastFrameSourceMACAddress")
	public MACAddress lastFrameSourceMACAddress;

	public Stats() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the number of EAPOL frames of any type that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReceivedFrames() {
		return receivedFrames;
	}

	/**
	 * Set the number of EAPOL frames of any type that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames received.
	 *
	 * @since 2.0
	 * @param receivedFrames the input value
	 */
	public void  setReceivedFrames(Long receivedFrames) {
		this.receivedFrames = receivedFrames;
	}

	/**
	 * Set the number of EAPOL frames of any type that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames received.
	 *
	 * @since 2.0
	 * @param receivedFrames the input value
	 * @return this instance
	 */
	public Stats withReceivedFrames(Long receivedFrames) {
		this.receivedFrames = receivedFrames;
		return this;
	}

	/**
	 * Get the number of EAPOL frames of any type that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames transmitted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTransmittedFrames() {
		return transmittedFrames;
	}

	/**
	 * Set the number of EAPOL frames of any type that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedFrames the input value
	 */
	public void  setTransmittedFrames(Long transmittedFrames) {
		this.transmittedFrames = transmittedFrames;
	}

	/**
	 * Set the number of EAPOL frames of any type that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedFrames the input value
	 * @return this instance
	 */
	public Stats withTransmittedFrames(Long transmittedFrames) {
		this.transmittedFrames = transmittedFrames;
		return this;
	}

	/**
	 * Get the number of EAPOL Start frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Start frames transmitted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTransmittedStartFrames() {
		return transmittedStartFrames;
	}

	/**
	 * Set the number of EAPOL Start frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Start frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedStartFrames the input value
	 */
	public void  setTransmittedStartFrames(Long transmittedStartFrames) {
		this.transmittedStartFrames = transmittedStartFrames;
	}

	/**
	 * Set the number of EAPOL Start frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Start frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedStartFrames the input value
	 * @return this instance
	 */
	public Stats withTransmittedStartFrames(Long transmittedStartFrames) {
		this.transmittedStartFrames = transmittedStartFrames;
		return this;
	}

	/**
	 * Get the number of EAPOL Logoff frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Logoff frames transmitted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTransmittedLogoffFrames() {
		return transmittedLogoffFrames;
	}

	/**
	 * Set the number of EAPOL Logoff frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Logoff frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedLogoffFrames the input value
	 */
	public void  setTransmittedLogoffFrames(Long transmittedLogoffFrames) {
		this.transmittedLogoffFrames = transmittedLogoffFrames;
	}

	/**
	 * Set the number of EAPOL Logoff frames that have been transmitted by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAPOL Logoff frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedLogoffFrames the input value
	 * @return this instance
	 */
	public Stats withTransmittedLogoffFrames(Long transmittedLogoffFrames) {
		this.transmittedLogoffFrames = transmittedLogoffFrames;
		return this;
	}

	/**
	 * Get the number of EAP Resp/Id frames that have been transmitted; {{bibref|802.1x-2004|9.5.2}}, EAP Resp/Id frames transmitted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTransmittedResponseIdFrames() {
		return transmittedResponseIdFrames;
	}

	/**
	 * Set the number of EAP Resp/Id frames that have been transmitted; {{bibref|802.1x-2004|9.5.2}}, EAP Resp/Id frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedResponseIdFrames the input value
	 */
	public void  setTransmittedResponseIdFrames(Long transmittedResponseIdFrames) {
		this.transmittedResponseIdFrames = transmittedResponseIdFrames;
	}

	/**
	 * Set the number of EAP Resp/Id frames that have been transmitted; {{bibref|802.1x-2004|9.5.2}}, EAP Resp/Id frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedResponseIdFrames the input value
	 * @return this instance
	 */
	public Stats withTransmittedResponseIdFrames(Long transmittedResponseIdFrames) {
		this.transmittedResponseIdFrames = transmittedResponseIdFrames;
		return this;
	}

	/**
	 * Get the number of valid EAP Response frames (other than Resp/Id frames) that have been transmitted by this  Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Resp frames transmitted.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getTransmittedResponseFrames() {
		return transmittedResponseFrames;
	}

	/**
	 * Set the number of valid EAP Response frames (other than Resp/Id frames) that have been transmitted by this  Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Resp frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedResponseFrames the input value
	 */
	public void  setTransmittedResponseFrames(Long transmittedResponseFrames) {
		this.transmittedResponseFrames = transmittedResponseFrames;
	}

	/**
	 * Set the number of valid EAP Response frames (other than Resp/Id frames) that have been transmitted by this  Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Resp frames transmitted.
	 *
	 * @since 2.0
	 * @param transmittedResponseFrames the input value
	 * @return this instance
	 */
	public Stats withTransmittedResponseFrames(Long transmittedResponseFrames) {
		this.transmittedResponseFrames = transmittedResponseFrames;
		return this;
	}

	/**
	 * Get the number of EAP Req/Id frames that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req/Id frames received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReceivedRequestIdFrames() {
		return receivedRequestIdFrames;
	}

	/**
	 * Set the number of EAP Req/Id frames that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req/Id frames received.
	 *
	 * @since 2.0
	 * @param receivedRequestIdFrames the input value
	 */
	public void  setReceivedRequestIdFrames(Long receivedRequestIdFrames) {
		this.receivedRequestIdFrames = receivedRequestIdFrames;
	}

	/**
	 * Set the number of EAP Req/Id frames that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req/Id frames received.
	 *
	 * @since 2.0
	 * @param receivedRequestIdFrames the input value
	 * @return this instance
	 */
	public Stats withReceivedRequestIdFrames(Long receivedRequestIdFrames) {
		this.receivedRequestIdFrames = receivedRequestIdFrames;
		return this;
	}

	/**
	 * Get the number of EAP Request frames (other than Rq/Id frames) that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReceivedRequestFrames() {
		return receivedRequestFrames;
	}

	/**
	 * Set the number of EAP Request frames (other than Rq/Id frames) that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 * @param receivedRequestFrames the input value
	 */
	public void  setReceivedRequestFrames(Long receivedRequestFrames) {
		this.receivedRequestFrames = receivedRequestFrames;
	}

	/**
	 * Set the number of EAP Request frames (other than Rq/Id frames) that have been received by this Supplicant; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 * @param receivedRequestFrames the input value
	 * @return this instance
	 */
	public Stats withReceivedRequestFrames(Long receivedRequestFrames) {
		this.receivedRequestFrames = receivedRequestFrames;
		return this;
	}

	/**
	 * Get the number of EAPOL frames that have been received by this Supplicant in which the frame type is not recognized; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReceivedInvalidFrames() {
		return receivedInvalidFrames;
	}

	/**
	 * Set the number of EAPOL frames that have been received by this Supplicant in which the frame type is not recognized; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 * @param receivedInvalidFrames the input value
	 */
	public void  setReceivedInvalidFrames(Long receivedInvalidFrames) {
		this.receivedInvalidFrames = receivedInvalidFrames;
	}

	/**
	 * Set the number of EAPOL frames that have been received by this Supplicant in which the frame type is not recognized; {{bibref|802.1x-2004|9.5.2}}, EAP Req frames received.
	 *
	 * @since 2.0
	 * @param receivedInvalidFrames the input value
	 * @return this instance
	 */
	public Stats withReceivedInvalidFrames(Long receivedInvalidFrames) {
		this.receivedInvalidFrames = receivedInvalidFrames;
		return this;
	}

	/**
	 * Get the number of EAPOL frames that have been received by this Supplicant in which the Packet Body Length field is invalid; {{bibref|802.1x-2004|9.5.2}}, EAP length error frames received.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getReceivedLengthErrorFrames() {
		return receivedLengthErrorFrames;
	}

	/**
	 * Set the number of EAPOL frames that have been received by this Supplicant in which the Packet Body Length field is invalid; {{bibref|802.1x-2004|9.5.2}}, EAP length error frames received.
	 *
	 * @since 2.0
	 * @param receivedLengthErrorFrames the input value
	 */
	public void  setReceivedLengthErrorFrames(Long receivedLengthErrorFrames) {
		this.receivedLengthErrorFrames = receivedLengthErrorFrames;
	}

	/**
	 * Set the number of EAPOL frames that have been received by this Supplicant in which the Packet Body Length field is invalid; {{bibref|802.1x-2004|9.5.2}}, EAP length error frames received.
	 *
	 * @since 2.0
	 * @param receivedLengthErrorFrames the input value
	 * @return this instance
	 */
	public Stats withReceivedLengthErrorFrames(Long receivedLengthErrorFrames) {
		this.receivedLengthErrorFrames = receivedLengthErrorFrames;
		return this;
	}

	/**
	 * Get the protocol version number carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame version
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLastFrameVersion() {
		return lastFrameVersion;
	}

	/**
	 * Set the protocol version number carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame version
	 *
	 * @since 2.0
	 * @param lastFrameVersion the input value
	 */
	public void  setLastFrameVersion(Long lastFrameVersion) {
		this.lastFrameVersion = lastFrameVersion;
	}

	/**
	 * Set the protocol version number carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame version
	 *
	 * @since 2.0
	 * @param lastFrameVersion the input value
	 * @return this instance
	 */
	public Stats withLastFrameVersion(Long lastFrameVersion) {
		this.lastFrameVersion = lastFrameVersion;
		return this;
	}

	/**
	 * Get the source MAC address carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame source.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public MACAddress getLastFrameSourceMACAddress() {
		return lastFrameSourceMACAddress;
	}

	/**
	 * Set the source MAC address carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame source.
	 *
	 * @since 2.0
	 * @param lastFrameSourceMACAddress the input value
	 */
	public void  setLastFrameSourceMACAddress(MACAddress lastFrameSourceMACAddress) {
		this.lastFrameSourceMACAddress = lastFrameSourceMACAddress;
	}

	/**
	 * Set the source MAC address carried in the most recently received EAPOL frame; {{bibref|802.1x-2004|9.5.2}}, Last EAPOL frame source.
	 *
	 * @since 2.0
	 * @param lastFrameSourceMACAddress the input value
	 * @return this instance
	 */
	public Stats withLastFrameSourceMACAddress(MACAddress lastFrameSourceMACAddress) {
		this.lastFrameSourceMACAddress = lastFrameSourceMACAddress;
		return this;
	}

	//</editor-fold>

}