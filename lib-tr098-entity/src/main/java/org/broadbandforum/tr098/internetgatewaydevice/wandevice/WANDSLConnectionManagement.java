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
package org.broadbandforum.tr098.internetgatewaydevice.wandevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr098.internetgatewaydevice.wandevice.wandslconnectionmanagement.ConnectionService;

	/**
	 * This object is intended for a CPE with a DSL modem WAN interface.

Note - This object was originally created to allow ''WANConnection'' devices and services to be added dynamically in the IGD object model in TR-064 because UPnP Device Architecture 1.0 did not contain this capability natively.  Because in TR-069 objects can be created and removed using the AddObject and DeleteObject RPCs, ''WANConnection'' interfaces can be managed using these TR-069 mechanisms directly.  Therefore, unlike the TR-064 equivalent, the {{object|ConnectionService}} table within this object is Read-Only in the TR-069 ''InternetGatewayDevice'' data model context.

This object is OBSOLETED because it serves no purpose.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.WANDevice.{i}.WANDSLConnectionManagement.")
@XmlRootElement(name = "WANDSLConnectionManagement")
@XmlType(name = "InternetGatewayDevice.WANDevice.WANDSLConnectionManagement")
@XmlAccessorType(XmlAccessType.FIELD)
public class WANDSLConnectionManagement {

	/**
	 * This table contains an entry for each connection service.

This object is OBSOLETED because it is within an OBSOLETED object.
	 */
	@XmlElementWrapper(name = "ConnectionServices")
	@XmlElement(name = "ConnectionService")
	public Collection<ConnectionService> connectionServices;

	public WANDSLConnectionManagement() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this table contains an entry for each connection service.

This object is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @return the value
	 */
	public Collection<ConnectionService> getConnectionServices() {
		if (this.connectionServices == null){ this.connectionServices=new ArrayList<>();}
		return connectionServices;
	}

	/**
	 * Set the this table contains an entry for each connection service.

This object is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @param connectionServices the input value
	 */
	public void  setConnectionServices(Collection<ConnectionService> connectionServices) {
		this.connectionServices = connectionServices;
	}

	/**
	 * Set the this table contains an entry for each connection service.

This object is OBSOLETED because it is within an OBSOLETED object.
	 *
	 * @param connectionService the input value
	 * @return this instance
	 */
	public WANDSLConnectionManagement withConnectionService(ConnectionService connectionService) {
		getConnectionServices().add(connectionService);
		return this;
	}

	//</editor-fold>

}