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
	 * This object contains parameters related to the TerminalLocation API.
	 *
	 * @since TR262 v1.0
	 */
@CWMPObject(name = "FAP.ApplicationPlatform.Control.TerminalLocation.")
@XmlRootElement(name = "FAP.ApplicationPlatform.Control.TerminalLocation")
@XmlType(name = "FAP.ApplicationPlatform.Control.TerminalLocation")
@XmlAccessorType(XmlAccessType.FIELD)
public class TerminalLocation {

	/**
	 * Enable or disable TerminalLocation API exposure on FAP
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
	 * Determines how FAP handles simultaneous requests from different Applications to TerminalLocation API.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Queueing ")
	@CWMPParameter(access = "readWrite")
	public String queueing ;
	/**
	 * Determines the Max Number of different Applications that can send Requests to TerminalLocation API.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "MaxAPIUsersNumber")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 255)
	public Long maxAPIUsersNumber;
	/**
	 * Specifies Terminal Address  Format to be used in QueryMobileLocation Responses.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QueryMobileLocationResponseAddress")
	@CWMPParameter(access = "readWrite")
	public String queryMobileLocationResponseAddress;
	/**
	 * Include or exclude FAP Longitude and Latitude arguments in Responses to QueryMobileLocation Requests.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QueryMobileLocationResponseLongitudeLatitude")
	@CWMPParameter(access = "readWrite")
	public Boolean queryMobileLocationResponseLongitudeLatitude;
	/**
	 * Include or exclude FAP Altitude argument in Responses to QueryMobileLocation Requests .
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QueryMobileLocationResponseAltitude")
	@CWMPParameter(access = "readWrite")
	public Boolean queryMobileLocationResponseAltitude;
	/**
	 * Specifies Response Timestamp in seconds.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "QueryMobileLocationResponseTimestamp")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 0, max = 86399)
	public Long queryMobileLocationResponseTimestamp;

	public TerminalLocation() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enable or disable TerminalLocation API exposure on FAP
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isApiEnable() {
		return apiEnable;
	}

	/**
	 * Set the enable or disable TerminalLocation API exposure on FAP
	 *
	 * @since 1.0
	 * @param apiEnable the input value
	 */
	public void  setApiEnable(Boolean apiEnable) {
		this.apiEnable = apiEnable;
	}

	/**
	 * Set the enable or disable TerminalLocation API exposure on FAP
	 *
	 * @since 1.0
	 * @param apiEnable the input value
	 * @return this instance
	 */
	public TerminalLocation withApiEnable(Boolean apiEnable) {
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
	public TerminalLocation withQueueEnable(Boolean queueEnable) {
		this.queueEnable = queueEnable;
		return this;
	}

	/**
	 * Get the determines how FAP handles simultaneous requests from different Applications to TerminalLocation API.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getQueueing () {
		return queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to TerminalLocation API.
	 *
	 * @since 1.0
	 * @param queueing  the input value
	 */
	public void  setQueueing (String queueing ) {
		this.queueing  = queueing ;
	}

	/**
	 * Set the determines how FAP handles simultaneous requests from different Applications to TerminalLocation API.
	 *
	 * @since 1.0
	 * @param queueing  the input value
	 * @return this instance
	 */
	public TerminalLocation withQueueing (String queueing ) {
		this.queueing  = queueing ;
		return this;
	}

	/**
	 * Get the determines the Max Number of different Applications that can send Requests to TerminalLocation API.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getMaxAPIUsersNumber() {
		return maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to TerminalLocation API.
	 *
	 * @since 1.0
	 * @param maxAPIUsersNumber the input value
	 */
	public void  setMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
	}

	/**
	 * Set the determines the Max Number of different Applications that can send Requests to TerminalLocation API.
	 *
	 * @since 1.0
	 * @param maxAPIUsersNumber the input value
	 * @return this instance
	 */
	public TerminalLocation withMaxAPIUsersNumber(Long maxAPIUsersNumber) {
		this.maxAPIUsersNumber = maxAPIUsersNumber;
		return this;
	}

	/**
	 * Get the specifies Terminal Address  Format to be used in QueryMobileLocation Responses.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getQueryMobileLocationResponseAddress() {
		return queryMobileLocationResponseAddress;
	}

	/**
	 * Set the specifies Terminal Address  Format to be used in QueryMobileLocation Responses.
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseAddress the input value
	 */
	public void  setQueryMobileLocationResponseAddress(String queryMobileLocationResponseAddress) {
		this.queryMobileLocationResponseAddress = queryMobileLocationResponseAddress;
	}

	/**
	 * Set the specifies Terminal Address  Format to be used in QueryMobileLocation Responses.
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseAddress the input value
	 * @return this instance
	 */
	public TerminalLocation withQueryMobileLocationResponseAddress(String queryMobileLocationResponseAddress) {
		this.queryMobileLocationResponseAddress = queryMobileLocationResponseAddress;
		return this;
	}

	/**
	 * Get the include or exclude FAP Longitude and Latitude arguments in Responses to QueryMobileLocation Requests.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isQueryMobileLocationResponseLongitudeLatitude() {
		return queryMobileLocationResponseLongitudeLatitude;
	}

	/**
	 * Set the include or exclude FAP Longitude and Latitude arguments in Responses to QueryMobileLocation Requests.
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseLongitudeLatitude the input value
	 */
	public void  setQueryMobileLocationResponseLongitudeLatitude(Boolean queryMobileLocationResponseLongitudeLatitude) {
		this.queryMobileLocationResponseLongitudeLatitude = queryMobileLocationResponseLongitudeLatitude;
	}

	/**
	 * Set the include or exclude FAP Longitude and Latitude arguments in Responses to QueryMobileLocation Requests.
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseLongitudeLatitude the input value
	 * @return this instance
	 */
	public TerminalLocation withQueryMobileLocationResponseLongitudeLatitude(Boolean queryMobileLocationResponseLongitudeLatitude) {
		this.queryMobileLocationResponseLongitudeLatitude = queryMobileLocationResponseLongitudeLatitude;
		return this;
	}

	/**
	 * Get the include or exclude FAP Altitude argument in Responses to QueryMobileLocation Requests .
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isQueryMobileLocationResponseAltitude() {
		return queryMobileLocationResponseAltitude;
	}

	/**
	 * Set the include or exclude FAP Altitude argument in Responses to QueryMobileLocation Requests .
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseAltitude the input value
	 */
	public void  setQueryMobileLocationResponseAltitude(Boolean queryMobileLocationResponseAltitude) {
		this.queryMobileLocationResponseAltitude = queryMobileLocationResponseAltitude;
	}

	/**
	 * Set the include or exclude FAP Altitude argument in Responses to QueryMobileLocation Requests .
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseAltitude the input value
	 * @return this instance
	 */
	public TerminalLocation withQueryMobileLocationResponseAltitude(Boolean queryMobileLocationResponseAltitude) {
		this.queryMobileLocationResponseAltitude = queryMobileLocationResponseAltitude;
		return this;
	}

	/**
	 * Get the specifies Response Timestamp in seconds.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getQueryMobileLocationResponseTimestamp() {
		return queryMobileLocationResponseTimestamp;
	}

	/**
	 * Set the specifies Response Timestamp in seconds.
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseTimestamp the input value
	 */
	public void  setQueryMobileLocationResponseTimestamp(Long queryMobileLocationResponseTimestamp) {
		this.queryMobileLocationResponseTimestamp = queryMobileLocationResponseTimestamp;
	}

	/**
	 * Set the specifies Response Timestamp in seconds.
	 *
	 * @since 1.0
	 * @param queryMobileLocationResponseTimestamp the input value
	 * @return this instance
	 */
	public TerminalLocation withQueryMobileLocationResponseTimestamp(Long queryMobileLocationResponseTimestamp) {
		this.queryMobileLocationResponseTimestamp = queryMobileLocationResponseTimestamp;
		return this;
	}

	//</editor-fold>

}