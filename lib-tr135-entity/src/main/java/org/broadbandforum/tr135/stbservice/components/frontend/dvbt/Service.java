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
package org.broadbandforum.tr135.stbservice.components.frontend.dvbt;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;

	/**
	 * DVB-T Current service details.
	 *
	 * @since 1.1
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.Service.")
public class Service {

	/**
	 * It represents the logical channel object instance for the current service, For example: ''.Components.FrontEnd.1.DVBT.-ServiceListDatabase.LogicalChannel.12''.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CurrentLogicalChannel")
	@Size(max = 256)
	public String currentLogicalChannel;
	/**
	 * It represents the service object instance for the current service. For example: ''.Components.FrontEnd.1.DVBT.ServiceListDatabase.LogicalChannel.12.Service.1''.
	 *
	 * @since 1.1
	 */
	@XmlElement(name = "CurrentService")
	@Size(max = 256)
	public String currentService;

	public Service() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the it represents the logical channel object instance for the current service, For example: ''.Components.FrontEnd.1.DVBT.-ServiceListDatabase.LogicalChannel.12''.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getCurrentLogicalChannel() {
		return currentLogicalChannel;
	}

	/**
	 * Set the it represents the logical channel object instance for the current service, For example: ''.Components.FrontEnd.1.DVBT.-ServiceListDatabase.LogicalChannel.12''.
	 *
	 * @since 1.1
	 * @param currentLogicalChannel the input value
	 */
	public void  setCurrentLogicalChannel(String currentLogicalChannel) {
		this.currentLogicalChannel = currentLogicalChannel;
	}

	/**
	 * Set the it represents the logical channel object instance for the current service, For example: ''.Components.FrontEnd.1.DVBT.-ServiceListDatabase.LogicalChannel.12''.
	 *
	 * @since 1.1
	 * @param currentLogicalChannel the input value
	 * @return this instance
	 */
	public Service withCurrentLogicalChannel(String currentLogicalChannel) {
		this.currentLogicalChannel = currentLogicalChannel;
		return this;
	}

	/**
	 * Get the it represents the service object instance for the current service. For example: ''.Components.FrontEnd.1.DVBT.ServiceListDatabase.LogicalChannel.12.Service.1''.
	 *
	 * @since 1.1
	 * @return the value
	 */
	public String getCurrentService() {
		return currentService;
	}

	/**
	 * Set the it represents the service object instance for the current service. For example: ''.Components.FrontEnd.1.DVBT.ServiceListDatabase.LogicalChannel.12.Service.1''.
	 *
	 * @since 1.1
	 * @param currentService the input value
	 */
	public void  setCurrentService(String currentService) {
		this.currentService = currentService;
	}

	/**
	 * Set the it represents the service object instance for the current service. For example: ''.Components.FrontEnd.1.DVBT.ServiceListDatabase.LogicalChannel.12.Service.1''.
	 *
	 * @since 1.1
	 * @param currentService the input value
	 * @return this instance
	 */
	public Service withCurrentService(String currentService) {
		this.currentService = currentService;
		return this;
	}

	//</editor-fold>

}