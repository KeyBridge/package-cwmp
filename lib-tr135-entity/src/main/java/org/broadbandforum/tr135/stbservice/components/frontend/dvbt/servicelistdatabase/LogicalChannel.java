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
package org.broadbandforum.tr135.stbservice.components.frontend.dvbt.servicelistdatabase;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.servicelistdatabase.logicalchannel.Service;

	/**
	 * DVB-T logical channel information.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.ServiceListDatabase.LogicalChannel.{i}.", uniqueConstraints = {@CWMPUnique(names = {"LogicalChannelNumber"}),
	@CWMPUnique(names = {"Alias"}, functional = false)})
@XmlRootElement(name = "STBService.Components.FrontEnd.DVBT.ServiceListDatabase.LogicalChannel")
@XmlType(name = "STBService.Components.FrontEnd.DVBT.ServiceListDatabase.LogicalChannel")
@XmlAccessorType(XmlAccessType.FIELD)
public class LogicalChannel {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Logical channel number.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "LogicalChannelNumber")
	public Long logicalChannelNumber;
	/**
	 * DVB-T service information.
	 */
	@XmlElementWrapper(name = "Services")
	@XmlElement(name = "Service")
	public Collection<Service> services;

	public LogicalChannel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.2
	 * @param alias the input value
	 * @return this instance
	 */
	public LogicalChannel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the logical channel number.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getLogicalChannelNumber() {
		return logicalChannelNumber;
	}

	/**
	 * Set the logical channel number.
	 *
	 * @since 1.0
	 * @param logicalChannelNumber the input value
	 */
	public void  setLogicalChannelNumber(Long logicalChannelNumber) {
		this.logicalChannelNumber = logicalChannelNumber;
	}

	/**
	 * Set the logical channel number.
	 *
	 * @since 1.0
	 * @param logicalChannelNumber the input value
	 * @return this instance
	 */
	public LogicalChannel withLogicalChannelNumber(Long logicalChannelNumber) {
		this.logicalChannelNumber = logicalChannelNumber;
		return this;
	}

	/**
	 * Get the dvb-T service information.
	 *
	 * @return the value
	 */
	public Collection<Service> getServices() {
		if (this.services == null){ this.services=new ArrayList<>();}
		return services;
	}

	/**
	 * Set the dvb-T service information.
	 *
	 * @param services the input value
	 */
	public void  setServices(Collection<Service> services) {
		this.services = services;
	}

	/**
	 * Set the dvb-T service information.
	 *
	 * @param service the input value
	 * @return this instance
	 */
	public LogicalChannel withService(Service service) {
		getServices().add(service);
		return this;
	}

	//</editor-fold>

}