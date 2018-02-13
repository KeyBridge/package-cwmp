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
package org.broadbandforum.tr181.device;

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
import org.broadbandforum.tr181.device.cellular.AccessPoint;
import org.broadbandforum.tr181.device.cellular.Interface;

	/**
	 * This object models cellular interfaces and access points.
	 *
	 * @since 2.8
	 */
@CWMPObject(name = "Device.Cellular.")
@XmlRootElement(name = "Cellular")
@XmlType(name = "Device.Cellular")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cellular {

	/**
	 * Enables or disables roaming.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RoamingEnabled")
	@CWMPParameter(access = "readWrite")
	public Boolean roamingEnabled;
	/**
	 * Current roaming status.
	 *
	 * @since 2.8
	 */
	@XmlElement(name = "RoamingStatus")
	public String roamingStatus;
	/**
	 * Cellular interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  Each instance of this object models a cellular modem with a single radio and a single {{object|USIM}}.
	 */
	@XmlElementWrapper(name = "Interfaces")
	@XmlElement(name = "Interface")
	public Collection<Interface> interfaces;
	/**
	 * Cellular Access Point table. Each entry is identified by an {{param|APN}} (Access Point Name) that identifies a gateway between the mobile network and another computer network.
	 */
	@XmlElementWrapper(name = "AccessPoints")
	@XmlElement(name = "AccessPoint")
	@CWMPParameter(access = "readWrite")
	public Collection<AccessPoint> accessPoints;

	public Cellular() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables roaming.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public Boolean isRoamingEnabled() {
		return roamingEnabled;
	}

	/**
	 * Set the enables or disables roaming.
	 *
	 * @since 2.8
	 * @param roamingEnabled the input value
	 */
	public void  setRoamingEnabled(Boolean roamingEnabled) {
		this.roamingEnabled = roamingEnabled;
	}

	/**
	 * Set the enables or disables roaming.
	 *
	 * @since 2.8
	 * @param roamingEnabled the input value
	 * @return this instance
	 */
	public Cellular withRoamingEnabled(Boolean roamingEnabled) {
		this.roamingEnabled = roamingEnabled;
		return this;
	}

	/**
	 * Get the current roaming status.
	 *
	 * @since 2.8
	 * @return the value
	 */
	public String getRoamingStatus() {
		return roamingStatus;
	}

	/**
	 * Set the current roaming status.
	 *
	 * @since 2.8
	 * @param roamingStatus the input value
	 */
	public void  setRoamingStatus(String roamingStatus) {
		this.roamingStatus = roamingStatus;
	}

	/**
	 * Set the current roaming status.
	 *
	 * @since 2.8
	 * @param roamingStatus the input value
	 * @return this instance
	 */
	public Cellular withRoamingStatus(String roamingStatus) {
		this.roamingStatus = roamingStatus;
		return this;
	}

	/**
	 * Get the cellular interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  Each instance of this object models a cellular modem with a single radio and a single {{object|USIM}}.
	 *
	 * @return the value
	 */
	public Collection<Interface> getInterfaces() {
		if (this.interfaces == null){ this.interfaces=new ArrayList<>();}
		return interfaces;
	}

	/**
	 * Set the cellular interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  Each instance of this object models a cellular modem with a single radio and a single {{object|USIM}}.
	 *
	 * @param interfaces the input value
	 */
	public void  setInterfaces(Collection<Interface> interfaces) {
		this.interfaces = interfaces;
	}

	/**
	 * Set the cellular interface table (a stackable interface object as described in {{bibref|TR-181i2|Section 4.2}}).  Each instance of this object models a cellular modem with a single radio and a single {{object|USIM}}.
	 *
	 * @param _interface the input value
	 * @return this instance
	 */
	public Cellular withInterface(Interface _interface) {
		getInterfaces().add(_interface);
		return this;
	}

	/**
	 * Get the cellular Access Point table. Each entry is identified by an {{param|APN}} (Access Point Name) that identifies a gateway between the mobile network and another computer network.
	 *
	 * @return the value
	 */
	public Collection<AccessPoint> getAccessPoints() {
		if (this.accessPoints == null){ this.accessPoints=new ArrayList<>();}
		return accessPoints;
	}

	/**
	 * Set the cellular Access Point table. Each entry is identified by an {{param|APN}} (Access Point Name) that identifies a gateway between the mobile network and another computer network.
	 *
	 * @param accessPoints the input value
	 */
	public void  setAccessPoints(Collection<AccessPoint> accessPoints) {
		this.accessPoints = accessPoints;
	}

	/**
	 * Set the cellular Access Point table. Each entry is identified by an {{param|APN}} (Access Point Name) that identifies a gateway between the mobile network and another computer network.
	 *
	 * @param accessPoint the input value
	 * @return this instance
	 */
	public Cellular withAccessPoint(AccessPoint accessPoint) {
		getAccessPoints().add(accessPoint);
		return this;
	}

	//</editor-fold>

}