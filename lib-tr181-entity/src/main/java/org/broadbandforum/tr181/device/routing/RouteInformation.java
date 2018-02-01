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
package org.broadbandforum.tr181.device.routing;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.device.routing.routeinformation.InterfaceSetting;

	/**
	 * Received Router Advertisement (RA) route information {{bibref|RFC4191}}.
	 *
	 * @since 2.2
	 */
@CWMPObject(name = "Device.Routing.RouteInformation.")
public class RouteInformation {

	/**
	 * Enables or disables receiving route information from the RA.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * IP Interface RA route information table. Contains received RA route information {{bibref|RFC4191}}. As such, the data in this table cannot be modified.
	 */
	@XmlElementWrapper(name = "InterfaceSettings")
	@XmlElement(name = "InterfaceSetting")
	public Collection<InterfaceSetting> interfaceSettings;

	public RouteInformation() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables receiving route information from the RA.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables receiving route information from the RA.
	 *
	 * @since 2.2
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables receiving route information from the RA.
	 *
	 * @since 2.2
	 * @param enable the input value
	 * @return this instance
	 */
	public RouteInformation withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the ip Interface RA route information table. Contains received RA route information {{bibref|RFC4191}}. As such, the data in this table cannot be modified.
	 *
	 * @return the value
	 */
	public Collection<InterfaceSetting> getInterfaceSettings() {
		if (this.interfaceSettings == null){ this.interfaceSettings=new ArrayList<>();}
		return interfaceSettings;
	}

	/**
	 * Set the ip Interface RA route information table. Contains received RA route information {{bibref|RFC4191}}. As such, the data in this table cannot be modified.
	 *
	 * @param interfaceSettings the input value
	 */
	public void  setInterfaceSettings(Collection<InterfaceSetting> interfaceSettings) {
		this.interfaceSettings = interfaceSettings;
	}

	/**
	 * Set the ip Interface RA route information table. Contains received RA route information {{bibref|RFC4191}}. As such, the data in this table cannot be modified.
	 *
	 * @param interfaceSetting the input value
	 * @return this instance
	 */
	public RouteInformation withInterfaceSetting(InterfaceSetting interfaceSetting) {
		getInterfaceSettings().add(interfaceSetting);
		return this;
	}

	//</editor-fold>

}