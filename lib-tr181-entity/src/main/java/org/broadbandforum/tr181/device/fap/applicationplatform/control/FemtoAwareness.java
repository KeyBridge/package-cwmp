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
package org.broadbandforum.tr181.device.fap.applicationplatform.control;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to the Femto Awareness API.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FAP.ApplicationPlatform.Control.FemtoAwareness.")
@XmlRootElement(name = "FemtoAwareness")
@XmlType(name = "Device.FAP.ApplicationPlatform.Control.FemtoAwareness")
@XmlAccessorType(XmlAccessType.FIELD)
public class FemtoAwareness {

	/**
	 * Enable or disable FemtoAwareness API exposure on FAP
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "APIEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean apiEnable;
	/**
	 * Enable or disable Request queueing for the API
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "QueueEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean queueEnable;
	/**
	 * Determines how FAP handles simultaneous requests from different Applications to Femto Awareness API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Queueing ")
	@CWMPParameter(access = "readWrite")
	public String queueing ;
	/**
	 * Determines the Max Number of different Applications that can send Requests to Femto Awareness API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MaxAPIUsersNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long maxAPIUsersNumber;
	/**
	 * Specifies Identifier of the Femtozone.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "FemtozoneID")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String femtozoneID;
	/**
	 * Specifies whether the Mobile Station International Subscriber Directory Number (MSISDN) has to be used as UserIdentifier in Femto Awareness Notifications. A value of {{true}} means that the MSISDN is send as user identifier, a value of {{false}} means that an anonymous reference is used.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "NotificationsUserIdentifierMSISDN")
	@CWMPParameter(access = "readWrite")
	public Boolean notificationsUserIdentifierMSISDN;
	/**
	 * Specifies whether the OPTIONAL Argument "Callback Data" has to be used in Responses to Requests to "Subscribe To Femto Awareness Notifications".
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "SubscribeToNotificationsResponseCallbackData")
	@CWMPParameter(access = "readWrite")
	public Boolean subscribeToNotificationsResponseCallbackData;
	/**
	 * Specifies whether the OPTIONAL Argument "Timezone" has to be used in Responses to Requests to "Query Femtocell Status".
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "QueryFemtocellResponseTimezone")
	@CWMPParameter(access = "readWrite")
	public Boolean queryFemtocellResponseTimezone;

	public FemtoAwareness() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable FemtoAwareness API exposure on FAP
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isApiEnable() {
		return apiEnable;
	}

	/**
	 * Set the enable or disable FemtoAwareness API exposure on FAP
	 *
	 * @since 2.4
	 * @param apiEnable the input value
	 */
	public void  setApiEnable(Boolean apiEnable) {
		this.apiEnable = apiEnable;
	}

	/**
	 * Set the enable or disable FemtoAwareness API exposure on FAP
	 *
	 * @since 2.4
	 * @param apiEnable the input value
	 * @return this instance
	 */
	public FemtoAwareness withApiEnable(Boolean apiEnable) {
		this.apiEnable = apiEnable;
		return this;
	}

	/**
	 * Get the enable or disable Request queueing for the API
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isQueueEnable() {
		return queueEnable;
	}

	/**
	 * Set the enable or disable Request queueing for the API
	 *
	 * @since 2.4
	 * @param queueEnable the input value
	 */
	public void  setQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
	}

	/**
	 * Set the enable or disable Request queueing for the API
	 *
	 * @since 2.4
	 * @param queueEnable the input value
	 * @return this instance
	 */
	public FemtoAwareness withQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
		return this;
	}

	/**
	 * Get the determines how FAP handles simultaneous requests from different Applications to Femto Awareness API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getQueueing () {
		return queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to Femto Awareness API.
	 *
	 * @since 2.4
	 * @param queueing  the input value
	 */
	public void  setQueueing (String queueing ) {
		this.queueing  = queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to Femto Awareness API.
	 *
	 * @since 2.4
	 * @param queueing  the input value
	 * @return this instance
	 */
	public FemtoAwareness withQueueing (String queueing ) {
		this.queueing  = queueing ;
		return this;
	}

	/**
	 * Get the determines the Max Number of different Applications that can send Requests to Femto Awareness API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMaxAPIUsersNumber() {
		return maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to Femto Awareness API.
	 *
	 * @since 2.4
	 * @param maxAPIUsersNumber the input value
	 */
	public void  setMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to Femto Awareness API.
	 *
	 * @since 2.4
	 * @param maxAPIUsersNumber the input value
	 * @return this instance
	 */
	public FemtoAwareness withMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
		return this;
	}

	/**
	 * Get the specifies Identifier of the Femtozone.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getFemtozoneID() {
		return femtozoneID;
	}

	/**
	 * Set the specifies Identifier of the Femtozone.
	 *
	 * @since 2.4
	 * @param femtozoneID the input value
	 */
	public void  setFemtozoneID(String femtozoneID) {
		this.femtozoneID = femtozoneID;
	}

	/**
	 * Set the specifies Identifier of the Femtozone.
	 *
	 * @since 2.4
	 * @param femtozoneID the input value
	 * @return this instance
	 */
	public FemtoAwareness withFemtozoneID(String femtozoneID) {
		this.femtozoneID = femtozoneID;
		return this;
	}

	/**
	 * Get the specifies whether the Mobile Station International Subscriber Directory Number (MSISDN) has to be used as UserIdentifier in Femto Awareness Notifications. A value of {{true}} means that the MSISDN is send as user identifier, a value of {{false}} means that an anonymous reference is used.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isNotificationsUserIdentifierMSISDN() {
		return notificationsUserIdentifierMSISDN;
	}

	/**
	 * Set the specifies whether the Mobile Station International Subscriber Directory Number (MSISDN) has to be used as UserIdentifier in Femto Awareness Notifications. A value of {{true}} means that the MSISDN is send as user identifier, a value of {{false}} means that an anonymous reference is used.
	 *
	 * @since 2.4
	 * @param notificationsUserIdentifierMSISDN the input value
	 */
	public void  setNotificationsUserIdentifierMSISDN(Boolean notificationsUserIdentifierMSISDN) {
		this.notificationsUserIdentifierMSISDN = notificationsUserIdentifierMSISDN;
	}

	/**
	 * Set the specifies whether the Mobile Station International Subscriber Directory Number (MSISDN) has to be used as UserIdentifier in Femto Awareness Notifications. A value of {{true}} means that the MSISDN is send as user identifier, a value of {{false}} means that an anonymous reference is used.
	 *
	 * @since 2.4
	 * @param notificationsUserIdentifierMSISDN the input value
	 * @return this instance
	 */
	public FemtoAwareness withNotificationsUserIdentifierMSISDN(Boolean notificationsUserIdentifierMSISDN) {
		this.notificationsUserIdentifierMSISDN = notificationsUserIdentifierMSISDN;
		return this;
	}

	/**
	 * Get the specifies whether the OPTIONAL Argument "Callback Data" has to be used in Responses to Requests to "Subscribe To Femto Awareness Notifications".
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isSubscribeToNotificationsResponseCallbackData() {
		return subscribeToNotificationsResponseCallbackData;
	}

	/**
	 * Set the specifies whether the OPTIONAL Argument "Callback Data" has to be used in Responses to Requests to "Subscribe To Femto Awareness Notifications".
	 *
	 * @since 2.4
	 * @param subscribeToNotificationsResponseCallbackData the input value
	 */
	public void  setSubscribeToNotificationsResponseCallbackData(Boolean subscribeToNotificationsResponseCallbackData) {
		this.subscribeToNotificationsResponseCallbackData = subscribeToNotificationsResponseCallbackData;
	}

	/**
	 * Set the specifies whether the OPTIONAL Argument "Callback Data" has to be used in Responses to Requests to "Subscribe To Femto Awareness Notifications".
	 *
	 * @since 2.4
	 * @param subscribeToNotificationsResponseCallbackData the input value
	 * @return this instance
	 */
	public FemtoAwareness withSubscribeToNotificationsResponseCallbackData(Boolean subscribeToNotificationsResponseCallbackData) {
		this.subscribeToNotificationsResponseCallbackData = subscribeToNotificationsResponseCallbackData;
		return this;
	}

	/**
	 * Get the specifies whether the OPTIONAL Argument "Timezone" has to be used in Responses to Requests to "Query Femtocell Status".
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isQueryFemtocellResponseTimezone() {
		return queryFemtocellResponseTimezone;
	}

	/**
	 * Set the specifies whether the OPTIONAL Argument "Timezone" has to be used in Responses to Requests to "Query Femtocell Status".
	 *
	 * @since 2.4
	 * @param queryFemtocellResponseTimezone the input value
	 */
	public void  setQueryFemtocellResponseTimezone(Boolean queryFemtocellResponseTimezone) {
		this.queryFemtocellResponseTimezone = queryFemtocellResponseTimezone;
	}

	/**
	 * Set the specifies whether the OPTIONAL Argument "Timezone" has to be used in Responses to Requests to "Query Femtocell Status".
	 *
	 * @since 2.4
	 * @param queryFemtocellResponseTimezone the input value
	 * @return this instance
	 */
	public FemtoAwareness withQueryFemtocellResponseTimezone(Boolean queryFemtocellResponseTimezone) {
		this.queryFemtocellResponseTimezone = queryFemtocellResponseTimezone;
		return this;
	}

	//</editor-fold>

}