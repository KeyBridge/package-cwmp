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
package org.broadbandforum.tr098.internetgatewaydevice.fap.applicationplatform.monitoring;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * This object contains parameters related to the Monitoring of the SMS API.
	 *
	 * @since 1.10
	 */
@CWMPObject(name = "InternetGatewayDevice.FAP.ApplicationPlatform.Monitoring.SMS.")
public class SMS {

	/**
	 * Specifies whether the SMS API is currently available on this device (the API could be disabled or could have exhausted its resources)..
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "APIAvailable")
	public Boolean apiAvailable;
	/**
	 * Specifies the current number of Applications using the SMS API.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "APIUsers")
	@Size(min = 0, max = 255)
	public Long apiUsers;
	/**
	 * Specifies the state of the SMS API Queue.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "QueueState")
	public String queueState;
	/**
	 * Specifies the current number of requests waiting in the SMS API Queue.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "QueueNum")
	@Size(min = 0, max = 255)
	public Long queueNum;
	/**
	 * Specifies the number of requests in the SMS API Queue that have been received. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "QueueReceived")
	public Long queueReceived;
	/**
	 * Specifies the number of requests in the SMS API Queue that have been discarded. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 */
	@XmlElement(name = "QueueDiscarded")
	public Long queueDiscarded;

	public SMS() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the specifies whether the SMS API is currently available on this device (the API could be disabled or could have exhausted its resources)..
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Boolean isApiAvailable() {
		return apiAvailable;
	}

	/**
	 * Set the specifies whether the SMS API is currently available on this device (the API could be disabled or could have exhausted its resources)..
	 *
	 * @since 1.10
	 * @param apiAvailable the input value
	 */
	public void  setApiAvailable(Boolean apiAvailable) {
		this.apiAvailable = apiAvailable;
	}

	/**
	 * Set the specifies whether the SMS API is currently available on this device (the API could be disabled or could have exhausted its resources)..
	 *
	 * @since 1.10
	 * @param apiAvailable the input value
	 * @return this instance
	 */
	public SMS withApiAvailable(Boolean apiAvailable) {
		this.apiAvailable = apiAvailable;
		return this;
	}

	/**
	 * Get the specifies the current number of Applications using the SMS API.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getApiUsers() {
		return apiUsers;
	}

	/**
	 * Set the specifies the current number of Applications using the SMS API.
	 *
	 * @since 1.10
	 * @param apiUsers the input value
	 */
	public void  setApiUsers(Long apiUsers) {
		this.apiUsers = apiUsers;
	}

	/**
	 * Set the specifies the current number of Applications using the SMS API.
	 *
	 * @since 1.10
	 * @param apiUsers the input value
	 * @return this instance
	 */
	public SMS withApiUsers(Long apiUsers) {
		this.apiUsers = apiUsers;
		return this;
	}

	/**
	 * Get the specifies the state of the SMS API Queue.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public String getQueueState() {
		return queueState;
	}

	/**
	 * Set the specifies the state of the SMS API Queue.
	 *
	 * @since 1.10
	 * @param queueState the input value
	 */
	public void  setQueueState(String queueState) {
		this.queueState = queueState;
	}

	/**
	 * Set the specifies the state of the SMS API Queue.
	 *
	 * @since 1.10
	 * @param queueState the input value
	 * @return this instance
	 */
	public SMS withQueueState(String queueState) {
		this.queueState = queueState;
		return this;
	}

	/**
	 * Get the specifies the current number of requests waiting in the SMS API Queue.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getQueueNum() {
		return queueNum;
	}

	/**
	 * Set the specifies the current number of requests waiting in the SMS API Queue.
	 *
	 * @since 1.10
	 * @param queueNum the input value
	 */
	public void  setQueueNum(Long queueNum) {
		this.queueNum = queueNum;
	}

	/**
	 * Set the specifies the current number of requests waiting in the SMS API Queue.
	 *
	 * @since 1.10
	 * @param queueNum the input value
	 * @return this instance
	 */
	public SMS withQueueNum(Long queueNum) {
		this.queueNum = queueNum;
		return this;
	}

	/**
	 * Get the specifies the number of requests in the SMS API Queue that have been received. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getQueueReceived() {
		return queueReceived;
	}

	/**
	 * Set the specifies the number of requests in the SMS API Queue that have been received. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param queueReceived the input value
	 */
	public void  setQueueReceived(Long queueReceived) {
		this.queueReceived = queueReceived;
	}

	/**
	 * Set the specifies the number of requests in the SMS API Queue that have been received. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param queueReceived the input value
	 * @return this instance
	 */
	public SMS withQueueReceived(Long queueReceived) {
		this.queueReceived = queueReceived;
		return this;
	}

	/**
	 * Get the specifies the number of requests in the SMS API Queue that have been discarded. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @return the value
	 */
	public Long getQueueDiscarded() {
		return queueDiscarded;
	}

	/**
	 * Set the specifies the number of requests in the SMS API Queue that have been discarded. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param queueDiscarded the input value
	 */
	public void  setQueueDiscarded(Long queueDiscarded) {
		this.queueDiscarded = queueDiscarded;
	}

	/**
	 * Set the specifies the number of requests in the SMS API Queue that have been discarded. The counter will be reset whenever the device reboots or the {{param|#.Enable}} parameter is set to {{true}}.
	 *
	 * @since 1.10
	 * @param queueDiscarded the input value
	 * @return this instance
	 */
	public SMS withQueueDiscarded(Long queueDiscarded) {
		this.queueDiscarded = queueDiscarded;
		return this;
	}

	//</editor-fold>

}