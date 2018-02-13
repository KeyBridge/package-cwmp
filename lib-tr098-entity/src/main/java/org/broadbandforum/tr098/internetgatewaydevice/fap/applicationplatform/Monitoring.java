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
package org.broadbandforum.tr098.internetgatewaydevice.fap.applicationplatform;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.internetgatewaydevice.fap.applicationplatform.monitoring.FemtoAwareness;
import org.broadbandforum.tr098.internetgatewaydevice.fap.applicationplatform.monitoring.MMS;
import org.broadbandforum.tr098.internetgatewaydevice.fap.applicationplatform.monitoring.SMS;
import org.broadbandforum.tr098.internetgatewaydevice.fap.applicationplatform.monitoring.TerminalLocation;

	/**
	 * This object contains parameters related to the monitoring of the Femtozone Application Platform and the Femtozone APIs.
	 *
	 * @since 1.10
	 */
@CWMPObject(name = "InternetGatewayDevice.FAP.ApplicationPlatform.Monitoring.")
@XmlRootElement(name = "Monitoring")
@XmlType(name = "InternetGatewayDevice.FAP.ApplicationPlatform.Monitoring")
@XmlAccessorType(XmlAccessType.FIELD)
public class Monitoring {

	/**
	 * Enables and disables this entry.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Specifies the interval in seconds used to collect the monitoring measurements.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "MonitoringInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long monitoringInterval;
	/**
	 * Specifies the total number of authentication requests received by the Femto Application Platform. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AuthenticationRequestsReceived")
	public Long authenticationRequestsReceived;
	/**
	 * Specifies the number of authentication requests received by the Femto Application Platform that were rejected. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "AuthenticationRequestsRejected")
	public Long authenticationRequestsRejected;
	/**
	 * This object contains parameters related to the Monitoring of the FemtoAwareness API.
	 */
	@XmlElement(name = "FemtoAwareness")
	public FemtoAwareness femtoAwareness;
	/**
	 * This object contains parameters related to the Monitoring of the SMS API.
	 */
	@XmlElement(name = "SMS")
	public SMS sms;
	/**
	 * This object contains parameters related to the Monitoring of the MMS API.
	 */
	@XmlElement(name = "MMS")
	public MMS mms;
	/**
	 * This object contains parameters related to the Monitoring of the TerminalLocation API.
	 */
	@XmlElement(name = "TerminalLocation")
	public TerminalLocation terminalLocation;

	public Monitoring() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables and disables this entry.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables and disables this entry.
	 *
	 * @since 1.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables and disables this entry.
	 *
	 * @since 1.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Monitoring withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the specifies the interval in seconds used to collect the monitoring measurements.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getMonitoringInterval() {
		return monitoringInterval;
	}

	/**
	 * Set the specifies the interval in seconds used to collect the monitoring measurements.
	 *
	 * @since 1.10
	 * @param monitoringInterval the input value
	 */
	public void  setMonitoringInterval(Long monitoringInterval) {
		this.monitoringInterval = monitoringInterval;
	}

	/**
	 * Set the specifies the interval in seconds used to collect the monitoring measurements.
	 *
	 * @since 1.10
	 * @param monitoringInterval the input value
	 * @return this instance
	 */
	public Monitoring withMonitoringInterval(Long monitoringInterval) {
		this.monitoringInterval = monitoringInterval;
		return this;
	}

	/**
	 * Get the specifies the total number of authentication requests received by the Femto Application Platform. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getAuthenticationRequestsReceived() {
		return authenticationRequestsReceived;
	}

	/**
	 * Set the specifies the total number of authentication requests received by the Femto Application Platform. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param authenticationRequestsReceived the input value
	 */
	public void  setAuthenticationRequestsReceived(Long authenticationRequestsReceived) {
		this.authenticationRequestsReceived = authenticationRequestsReceived;
	}

	/**
	 * Set the specifies the total number of authentication requests received by the Femto Application Platform. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param authenticationRequestsReceived the input value
	 * @return this instance
	 */
	public Monitoring withAuthenticationRequestsReceived(Long authenticationRequestsReceived) {
		this.authenticationRequestsReceived = authenticationRequestsReceived;
		return this;
	}

	/**
	 * Get the specifies the number of authentication requests received by the Femto Application Platform that were rejected. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getAuthenticationRequestsRejected() {
		return authenticationRequestsRejected;
	}

	/**
	 * Set the specifies the number of authentication requests received by the Femto Application Platform that were rejected. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param authenticationRequestsRejected the input value
	 */
	public void  setAuthenticationRequestsRejected(Long authenticationRequestsRejected) {
		this.authenticationRequestsRejected = authenticationRequestsRejected;
	}

	/**
	 * Set the specifies the number of authentication requests received by the Femto Application Platform that were rejected. The counter will be reset whenever the device reboots or the {{param|Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param authenticationRequestsRejected the input value
	 * @return this instance
	 */
	public Monitoring withAuthenticationRequestsRejected(Long authenticationRequestsRejected) {
		this.authenticationRequestsRejected = authenticationRequestsRejected;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the Monitoring of the FemtoAwareness API.
	 *
	 * @return the value
	 */
	public FemtoAwareness getFemtoAwareness() {
		return femtoAwareness;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the FemtoAwareness API.
	 *
	 * @param femtoAwareness the input value
	 */
	public void  setFemtoAwareness(FemtoAwareness femtoAwareness) {
		this.femtoAwareness = femtoAwareness;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the FemtoAwareness API.
	 *
	 * @param femtoAwareness the input value
	 * @return this instance
	 */
	public Monitoring withFemtoAwareness(FemtoAwareness femtoAwareness) {
		this.femtoAwareness = femtoAwareness;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the Monitoring of the SMS API.
	 *
	 * @return the value
	 */
	public SMS getSms() {
		return sms;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the SMS API.
	 *
	 * @param sms the input value
	 */
	public void  setSms(SMS sms) {
		this.sms = sms;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the SMS API.
	 *
	 * @param sms the input value
	 * @return this instance
	 */
	public Monitoring withSms(SMS sms) {
		this.sms = sms;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the Monitoring of the MMS API.
	 *
	 * @return the value
	 */
	public MMS getMms() {
		return mms;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the MMS API.
	 *
	 * @param mms the input value
	 */
	public void  setMms(MMS mms) {
		this.mms = mms;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the MMS API.
	 *
	 * @param mms the input value
	 * @return this instance
	 */
	public Monitoring withMms(MMS mms) {
		this.mms = mms;
		return this;
	}

	/**
	 * Get the this object contains parameters related to the Monitoring of the TerminalLocation API.
	 *
	 * @return the value
	 */
	public TerminalLocation getTerminalLocation() {
		return terminalLocation;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the TerminalLocation API.
	 *
	 * @param terminalLocation the input value
	 */
	public void  setTerminalLocation(TerminalLocation terminalLocation) {
		this.terminalLocation = terminalLocation;
	}

	/**
	 * Set the this object contains parameters related to the Monitoring of the TerminalLocation API.
	 *
	 * @param terminalLocation the input value
	 * @return this instance
	 */
	public Monitoring withTerminalLocation(TerminalLocation terminalLocation) {
		this.terminalLocation = terminalLocation;
		return this;
	}

	//</editor-fold>

}