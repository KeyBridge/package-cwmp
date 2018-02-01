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

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.servicelistdatabase.LogicalChannel;

	/**
	 * DVB-T service list database.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.ServiceListDatabase.")
public class ServiceListDatabase {

	/**
	 * When set to {{true}}, resets the service list database.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "Reset")
	@CWMPParameter(access = "readWrite")
	public Boolean reset;
	/**
	 * Total number of services defined in the service list database, i.e. the number of different DvbIds in the database.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "TotalServices")
	public Long totalServices;
	/**
	 * DVB-T logical channel information.
	 */
	@XmlElementWrapper(name = "LogicalChannels")
	@XmlElement(name = "LogicalChannel")
	public Collection<LogicalChannel> logicalChannels;

	public ServiceListDatabase() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the when set to {{true}}, resets the service list database.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Boolean isReset() {
		return reset;
	}

	/**
	 * Set the when set to {{true}}, resets the service list database.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @param reset the input value
	 */
	public void  setReset(Boolean reset) {
		this.reset = reset;
	}

	/**
	 * Set the when set to {{true}}, resets the service list database.  Setting it to {{false}} has no effect.  The value is not saved in device state and is always {{false}} when read.
	 *
	 * @since 1.0
	 * @param reset the input value
	 * @return this instance
	 */
	public ServiceListDatabase withReset(Boolean reset) {
		this.reset = reset;
		return this;
	}

	/**
	 * Get the total number of services defined in the service list database, i.e. the number of different DvbIds in the database.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getTotalServices() {
		return totalServices;
	}

	/**
	 * Set the total number of services defined in the service list database, i.e. the number of different DvbIds in the database.
	 *
	 * @since 1.0
	 * @param totalServices the input value
	 */
	public void  setTotalServices(Long totalServices) {
		this.totalServices = totalServices;
	}

	/**
	 * Set the total number of services defined in the service list database, i.e. the number of different DvbIds in the database.
	 *
	 * @since 1.0
	 * @param totalServices the input value
	 * @return this instance
	 */
	public ServiceListDatabase withTotalServices(Long totalServices) {
		this.totalServices = totalServices;
		return this;
	}

	/**
	 * Get the dvb-T logical channel information.
	 *
	 * @return the value
	 */
	public Collection<LogicalChannel> getLogicalChannels() {
		if (this.logicalChannels == null){ this.logicalChannels=new ArrayList<>();}
		return logicalChannels;
	}

	/**
	 * Set the dvb-T logical channel information.
	 *
	 * @param logicalChannels the input value
	 */
	public void  setLogicalChannels(Collection<LogicalChannel> logicalChannels) {
		this.logicalChannels = logicalChannels;
	}

	/**
	 * Set the dvb-T logical channel information.
	 *
	 * @param logicalChannel the input value
	 * @return this instance
	 */
	public ServiceListDatabase withLogicalChannel(LogicalChannel logicalChannel) {
		getLogicalChannels().add(logicalChannel);
		return this;
	}

	//</editor-fold>

}