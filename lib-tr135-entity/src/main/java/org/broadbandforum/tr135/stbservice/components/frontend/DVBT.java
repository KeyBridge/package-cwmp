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
package org.broadbandforum.tr135.stbservice.components.frontend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.Install;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.LogicalChannelConnect;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.Modulation;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.Service;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.ServiceConnect;
import org.broadbandforum.tr135.stbservice.components.frontend.dvbt.ServiceListDatabase;

	/**
	 * DVB-T front-end details. This object will normally be present if and only if this front-end is a DVB-T front-end.

Parameters are taken from the DGTVi D-Book {{bibref|D-Book}}.
	 *
	 * @since TR135 v1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.DVBT.")
@XmlRootElement(name = "STBService.Components.FrontEnd.DVBT")
@XmlType(name = "STBService.Components.FrontEnd.DVBT")
@XmlAccessorType(XmlAccessType.FIELD)
public class DVBT {

	/**
	 * DVB-T modulation details.
	 */
	@XmlElement(name = "Modulation")
	public Modulation modulation;
	/**
	 * DVB-T Current service details.
	 */
	@XmlElement(name = "Service")
	public Service service;
	/**
	 * DVB-T service list database installation.  Supports maintenance of the service list database by scanning frequencies in order to detect services.

The service list database is in {{object|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase}}.
	 */
	@XmlElement(name = "Install")
	public Install install;
	/**
	 * DVB-T service list database.
	 */
	@XmlElement(name = "ServiceListDatabase")
	public ServiceListDatabase serviceListDatabase;
	/**
	 * Connect to a DVB-T logical channel.
	 */
	@XmlElement(name = "LogicalChannelConnect")
	public LogicalChannelConnect logicalChannelConnect;
	/**
	 * Connect to a DVB-T service.
	 */
	@XmlElement(name = "ServiceConnect")
	public ServiceConnect serviceConnect;

	public DVBT() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the dvb-T modulation details.
	 *
	 * @return the value
	 */
	public Modulation getModulation() {
		return modulation;
	}

	/**
	 * Set the dvb-T modulation details.
	 *
	 * @param modulation the input value
	 */
	public void  setModulation(Modulation modulation) {
		this.modulation = modulation;
	}

	/**
	 * Set the dvb-T modulation details.
	 *
	 * @param modulation the input value
	 * @return this instance
	 */
	public DVBT withModulation(Modulation modulation) {
		this.modulation = modulation;
		return this;
	}

	/**
	 * Get the dvb-T Current service details.
	 *
	 * @return the value
	 */
	public Service getService() {
		return service;
	}

	/**
	 * Set the dvb-T Current service details.
	 *
	 * @param service the input value
	 */
	public void  setService(Service service) {
		this.service = service;
	}

	/**
	 * Set the dvb-T Current service details.
	 *
	 * @param service the input value
	 * @return this instance
	 */
	public DVBT withService(Service service) {
		this.service = service;
		return this;
	}

	/**
	 * Get the dvb-T service list database installation.  Supports maintenance of the service list database by scanning frequencies in order to detect services.

The service list database is in {{object|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase}}.
	 *
	 * @return the value
	 */
	public Install getInstall() {
		return install;
	}

	/**
	 * Set the dvb-T service list database installation.  Supports maintenance of the service list database by scanning frequencies in order to detect services.

The service list database is in {{object|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase}}.
	 *
	 * @param install the input value
	 */
	public void  setInstall(Install install) {
		this.install = install;
	}

	/**
	 * Set the dvb-T service list database installation.  Supports maintenance of the service list database by scanning frequencies in order to detect services.

The service list database is in {{object|.Components.FrontEnd.{i}.DVBT.ServiceListDatabase}}.
	 *
	 * @param install the input value
	 * @return this instance
	 */
	public DVBT withInstall(Install install) {
		this.install = install;
		return this;
	}

	/**
	 * Get the dvb-T service list database.
	 *
	 * @return the value
	 */
	public ServiceListDatabase getServiceListDatabase() {
		return serviceListDatabase;
	}

	/**
	 * Set the dvb-T service list database.
	 *
	 * @param serviceListDatabase the input value
	 */
	public void  setServiceListDatabase(ServiceListDatabase serviceListDatabase) {
		this.serviceListDatabase = serviceListDatabase;
	}

	/**
	 * Set the dvb-T service list database.
	 *
	 * @param serviceListDatabase the input value
	 * @return this instance
	 */
	public DVBT withServiceListDatabase(ServiceListDatabase serviceListDatabase) {
		this.serviceListDatabase = serviceListDatabase;
		return this;
	}

	/**
	 * Get the connect to a DVB-T logical channel.
	 *
	 * @return the value
	 */
	public LogicalChannelConnect getLogicalChannelConnect() {
		return logicalChannelConnect;
	}

	/**
	 * Set the connect to a DVB-T logical channel.
	 *
	 * @param logicalChannelConnect the input value
	 */
	public void  setLogicalChannelConnect(LogicalChannelConnect logicalChannelConnect) {
		this.logicalChannelConnect = logicalChannelConnect;
	}

	/**
	 * Set the connect to a DVB-T logical channel.
	 *
	 * @param logicalChannelConnect the input value
	 * @return this instance
	 */
	public DVBT withLogicalChannelConnect(LogicalChannelConnect logicalChannelConnect) {
		this.logicalChannelConnect = logicalChannelConnect;
		return this;
	}

	/**
	 * Get the connect to a DVB-T service.
	 *
	 * @return the value
	 */
	public ServiceConnect getServiceConnect() {
		return serviceConnect;
	}

	/**
	 * Set the connect to a DVB-T service.
	 *
	 * @param serviceConnect the input value
	 */
	public void  setServiceConnect(ServiceConnect serviceConnect) {
		this.serviceConnect = serviceConnect;
	}

	/**
	 * Set the connect to a DVB-T service.
	 *
	 * @param serviceConnect the input value
	 * @return this instance
	 */
	public DVBT withServiceConnect(ServiceConnect serviceConnect) {
		this.serviceConnect = serviceConnect;
		return this;
	}

	//</editor-fold>

}