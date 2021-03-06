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
package org.broadbandforum.tr262.fap.applicationplatform.control;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * This object contains parameters related to the MMS API.
	 *
	 * @since TR262 v1.0
	 */
@CWMPObject(name = "FAP.ApplicationPlatform.Control.MMS.")
@XmlRootElement(name = "FAP.ApplicationPlatform.Control.MMS")
@XmlType(name = "FAP.ApplicationPlatform.Control.MMS")
@XmlAccessorType(XmlAccessType.FIELD)
public class MMS {

	/**
	 * Enable or disable MMS API exposure on FAP
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "APIEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean apiEnable;
	/**
	 * Enable or disable Request queueing for the API
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QueueEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean queueEnable;
	/**
	 * Determines how FAP handles simultaneous requests from different Applications to MMS API.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Queueing ")
	@CWMPParameter(access = "readWrite")
	public String queueing ;
	/**
	 * Determines the Max Number of different Applications that can send Requests to MMS API.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxAPIUsersNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long maxAPIUsersNumber;
	/**
	 * Determines the Minimum Time Interval in seconds between two consecutive Send MMS Requests by the same Application.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MinSendMMSTimeInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 3599)
	public Long minSendMMSTimeInterval;
	/**
	 * Enable or disable "QuerySMSDeliveryStatus" Operation on MMS API. When disabled, QuerySMSDeliveryStatus Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EnableQueryMMSDeliveryStatus")
	@CWMPParameter(access = "readWrite")
	public Boolean enableQueryMMSDeliveryStatus;
	/**
	 * Enable or disable "SubscribeTo NotificationsOfMessageSentToApplication" Operation on MMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "EnableSubscribeToNotificationsOfMessageSentToApplication")
	@CWMPParameter(access = "readWrite")
	public Boolean enableSubscribeToNotificationsOfMessageSentToApplication;

	public MMS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable MMS API exposure on FAP
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isApiEnable() {
		return apiEnable;
	}

	/**
	 * Set the enable or disable MMS API exposure on FAP
	 *
	 * @since 1.0
	 * @param apiEnable the input value
	 */
	public void  setApiEnable(Boolean apiEnable) {
		this.apiEnable = apiEnable;
	}

	/**
	 * Set the enable or disable MMS API exposure on FAP
	 *
	 * @since 1.0
	 * @param apiEnable the input value
	 * @return this instance
	 */
	public MMS withApiEnable(Boolean apiEnable) {
		this.apiEnable = apiEnable;
		return this;
	}

	/**
	 * Get the enable or disable Request queueing for the API
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isQueueEnable() {
		return queueEnable;
	}

	/**
	 * Set the enable or disable Request queueing for the API
	 *
	 * @since 1.0
	 * @param queueEnable the input value
	 */
	public void  setQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
	}

	/**
	 * Set the enable or disable Request queueing for the API
	 *
	 * @since 1.0
	 * @param queueEnable the input value
	 * @return this instance
	 */
	public MMS withQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
		return this;
	}

	/**
	 * Get the determines how FAP handles simultaneous requests from different Applications to MMS API.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getQueueing () {
		return queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to MMS API.
	 *
	 * @since 1.0
	 * @param queueing  the input value
	 */
	public void  setQueueing (String queueing ) {
		this.queueing  = queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to MMS API.
	 *
	 * @since 1.0
	 * @param queueing  the input value
	 * @return this instance
	 */
	public MMS withQueueing (String queueing ) {
		this.queueing  = queueing ;
		return this;
	}

	/**
	 * Get the determines the Max Number of different Applications that can send Requests to MMS API.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxAPIUsersNumber() {
		return maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to MMS API.
	 *
	 * @since 1.0
	 * @param maxAPIUsersNumber the input value
	 */
	public void  setMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to MMS API.
	 *
	 * @since 1.0
	 * @param maxAPIUsersNumber the input value
	 * @return this instance
	 */
	public MMS withMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
		return this;
	}

	/**
	 * Get the determines the Minimum Time Interval in seconds between two consecutive Send MMS Requests by the same Application.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMinSendMMSTimeInterval() {
		return minSendMMSTimeInterval;
	}

	/**
	 * Set the determines the Minimum Time Interval in seconds between two consecutive Send MMS Requests by the same Application.
	 *
	 * @since 1.0
	 * @param minSendMMSTimeInterval the input value
	 */
	public void  setMinSendMMSTimeInterval(Long minSendMMSTimeInterval) {
		this.minSendMMSTimeInterval = minSendMMSTimeInterval;
	}

	/**
	 * Set the determines the Minimum Time Interval in seconds between two consecutive Send MMS Requests by the same Application.
	 *
	 * @since 1.0
	 * @param minSendMMSTimeInterval the input value
	 * @return this instance
	 */
	public MMS withMinSendMMSTimeInterval(Long minSendMMSTimeInterval) {
		this.minSendMMSTimeInterval = minSendMMSTimeInterval;
		return this;
	}

	/**
	 * Get the enable or disable "QuerySMSDeliveryStatus" Operation on MMS API. When disabled, QuerySMSDeliveryStatus Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnableQueryMMSDeliveryStatus() {
		return enableQueryMMSDeliveryStatus;
	}

	/**
	 * Set the enable or disable "QuerySMSDeliveryStatus" Operation on MMS API. When disabled, QuerySMSDeliveryStatus Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 * @param enableQueryMMSDeliveryStatus the input value
	 */
	public void  setEnableQueryMMSDeliveryStatus(Boolean enableQueryMMSDeliveryStatus) {
		this.enableQueryMMSDeliveryStatus = enableQueryMMSDeliveryStatus;
	}

	/**
	 * Set the enable or disable "QuerySMSDeliveryStatus" Operation on MMS API. When disabled, QuerySMSDeliveryStatus Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 * @param enableQueryMMSDeliveryStatus the input value
	 * @return this instance
	 */
	public MMS withEnableQueryMMSDeliveryStatus(Boolean enableQueryMMSDeliveryStatus) {
		this.enableQueryMMSDeliveryStatus = enableQueryMMSDeliveryStatus;
		return this;
	}

	/**
	 * Get the enable or disable "SubscribeTo NotificationsOfMessageSentToApplication" Operation on MMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isEnableSubscribeToNotificationsOfMessageSentToApplication() {
		return enableSubscribeToNotificationsOfMessageSentToApplication;
	}

	/**
	 * Set the enable or disable "SubscribeTo NotificationsOfMessageSentToApplication" Operation on MMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 * @param enableSubscribeToNotificationsOfMessageSentToApplication the input value
	 */
	public void  setEnableSubscribeToNotificationsOfMessageSentToApplication(Boolean enableSubscribeToNotificationsOfMessageSentToApplication) {
		this.enableSubscribeToNotificationsOfMessageSentToApplication = enableSubscribeToNotificationsOfMessageSentToApplication;
	}

	/**
	 * Set the enable or disable "SubscribeTo NotificationsOfMessageSentToApplication" Operation on MMS API. When disabled, SubscribeTo NotificationsOfMessageSentToApplication Requests to MMS API are ignored.
	 *
	 * @since 1.0
	 * @param enableSubscribeToNotificationsOfMessageSentToApplication the input value
	 * @return this instance
	 */
	public MMS withEnableSubscribeToNotificationsOfMessageSentToApplication(Boolean enableSubscribeToNotificationsOfMessageSentToApplication) {
		this.enableSubscribeToNotificationsOfMessageSentToApplication = enableSubscribeToNotificationsOfMessageSentToApplication;
		return this;
	}

	//</editor-fold>

}