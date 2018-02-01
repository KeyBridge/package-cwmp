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
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to the SMS API.
	 *
	 * @since 2.4
	 */
@CWMPObject(name = "Device.FAP.ApplicationPlatform.Control.SMS.")
public class SMS {

	/**
	 * Enable or disable SMS API exposure on FAP
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
	 * Determines how FAP handles simultaneous requests from different Applications to SMS API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "Queueing ")
	@CWMPParameter(access = "readWrite")
	public String queueing ;
	/**
	 * Determines the Max Number of different Applications that can send Requests to SMS API.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MaxAPIUsersNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long maxAPIUsersNumber;
	/**
	 * Determines the Minimum Time Interval in seconds between two consecutive Send SMS Requests by the same Application.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "MinSendSMSTimeInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 3599)
	public Long minSendSMSTimeInterval;
	/**
	 * Enable or disable "QuerySMSDeliveryStatus" Operation on SMS API. When disabled, QuerySMSDeliveryStatus Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "EnableQuerySMSDeliveryStatus")
	@CWMPParameter(access = "readWrite")
	public Boolean enableQuerySMSDeliveryStatus;
	/**
	 * Enable or disable "SubscribeToNotificationsOfMessageSentToApplication" Operation on SMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 */
	@XmlElement(name = "EnableSubscribeToNotificationsOfMessageSentToApplication")
	@CWMPParameter(access = "readWrite")
	public Boolean enableSubscribeToNotificationsOfMessageSentToApplication;

	public SMS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable SMS API exposure on FAP
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isApiEnable() {
		return apiEnable;
	}

	/**
	 * Set the enable or disable SMS API exposure on FAP
	 *
	 * @since 2.4
	 * @param apiEnable the input value
	 */
	public void  setApiEnable(Boolean apiEnable) {
		this.apiEnable = apiEnable;
	}

	/**
	 * Set the enable or disable SMS API exposure on FAP
	 *
	 * @since 2.4
	 * @param apiEnable the input value
	 * @return this instance
	 */
	public SMS withApiEnable(Boolean apiEnable) {
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
	public SMS withQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
		return this;
	}

	/**
	 * Get the determines how FAP handles simultaneous requests from different Applications to SMS API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public String getQueueing () {
		return queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to SMS API.
	 *
	 * @since 2.4
	 * @param queueing  the input value
	 */
	public void  setQueueing (String queueing ) {
		this.queueing  = queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to SMS API.
	 *
	 * @since 2.4
	 * @param queueing  the input value
	 * @return this instance
	 */
	public SMS withQueueing (String queueing ) {
		this.queueing  = queueing ;
		return this;
	}

	/**
	 * Get the determines the Max Number of different Applications that can send Requests to SMS API.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMaxAPIUsersNumber() {
		return maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to SMS API.
	 *
	 * @since 2.4
	 * @param maxAPIUsersNumber the input value
	 */
	public void  setMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to SMS API.
	 *
	 * @since 2.4
	 * @param maxAPIUsersNumber the input value
	 * @return this instance
	 */
	public SMS withMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
		return this;
	}

	/**
	 * Get the determines the Minimum Time Interval in seconds between two consecutive Send SMS Requests by the same Application.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Long getMinSendSMSTimeInterval() {
		return minSendSMSTimeInterval;
	}

	/**
	 * Set the determines the Minimum Time Interval in seconds between two consecutive Send SMS Requests by the same Application.
	 *
	 * @since 2.4
	 * @param minSendSMSTimeInterval the input value
	 */
	public void  setMinSendSMSTimeInterval(Long minSendSMSTimeInterval) {
		this.minSendSMSTimeInterval = minSendSMSTimeInterval;
	}

	/**
	 * Set the determines the Minimum Time Interval in seconds between two consecutive Send SMS Requests by the same Application.
	 *
	 * @since 2.4
	 * @param minSendSMSTimeInterval the input value
	 * @return this instance
	 */
	public SMS withMinSendSMSTimeInterval(Long minSendSMSTimeInterval) {
		this.minSendSMSTimeInterval = minSendSMSTimeInterval;
		return this;
	}

	/**
	 * Get the enable or disable "QuerySMSDeliveryStatus" Operation on SMS API. When disabled, QuerySMSDeliveryStatus Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isEnableQuerySMSDeliveryStatus() {
		return enableQuerySMSDeliveryStatus;
	}

	/**
	 * Set the enable or disable "QuerySMSDeliveryStatus" Operation on SMS API. When disabled, QuerySMSDeliveryStatus Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 * @param enableQuerySMSDeliveryStatus the input value
	 */
	public void  setEnableQuerySMSDeliveryStatus(Boolean enableQuerySMSDeliveryStatus) {
		this.enableQuerySMSDeliveryStatus = enableQuerySMSDeliveryStatus;
	}

	/**
	 * Set the enable or disable "QuerySMSDeliveryStatus" Operation on SMS API. When disabled, QuerySMSDeliveryStatus Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 * @param enableQuerySMSDeliveryStatus the input value
	 * @return this instance
	 */
	public SMS withEnableQuerySMSDeliveryStatus(Boolean enableQuerySMSDeliveryStatus) {
		this.enableQuerySMSDeliveryStatus = enableQuerySMSDeliveryStatus;
		return this;
	}

	/**
	 * Get the enable or disable "SubscribeToNotificationsOfMessageSentToApplication" Operation on SMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 * @return the value
	 */
	public Boolean isEnableSubscribeToNotificationsOfMessageSentToApplication() {
		return enableSubscribeToNotificationsOfMessageSentToApplication;
	}

	/**
	 * Set the enable or disable "SubscribeToNotificationsOfMessageSentToApplication" Operation on SMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 * @param enableSubscribeToNotificationsOfMessageSentToApplication the input value
	 */
	public void  setEnableSubscribeToNotificationsOfMessageSentToApplication(Boolean enableSubscribeToNotificationsOfMessageSentToApplication) {
		this.enableSubscribeToNotificationsOfMessageSentToApplication = enableSubscribeToNotificationsOfMessageSentToApplication;
	}

	/**
	 * Set the enable or disable "SubscribeToNotificationsOfMessageSentToApplication" Operation on SMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to SMS API are ignored.
	 *
	 * @since 2.4
	 * @param enableSubscribeToNotificationsOfMessageSentToApplication the input value
	 * @return this instance
	 */
	public SMS withEnableSubscribeToNotificationsOfMessageSentToApplication(Boolean enableSubscribeToNotificationsOfMessageSentToApplication) {
		this.enableSubscribeToNotificationsOfMessageSentToApplication = enableSubscribeToNotificationsOfMessageSentToApplication;
		return this;
	}

	//</editor-fold>

}