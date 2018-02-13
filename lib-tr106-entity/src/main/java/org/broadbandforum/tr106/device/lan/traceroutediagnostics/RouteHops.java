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
package org.broadbandforum.tr106.device.lan.traceroutediagnostics;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;

	/**
	 * Result parameter indicating the components of the discovered route.  If a route could not be determined, there will be no instances of this object.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "Device.LAN.TraceRouteDiagnostics.RouteHops.{i}.")
@XmlRootElement(name = "RouteHops")
@XmlType(name = "Device.LAN.TraceRouteDiagnostics.RouteHops")
@XmlAccessorType(XmlAccessType.FIELD)
public class RouteHops {

	/**
	 * Result parameter indicating the Host Name or IP Address of a hop along the discovered route.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "HopHost")
	@CWMPParameter(activeNotify = "canDeny")
	@Size(max = 256)
	public String hopHost;

	public RouteHops() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the result parameter indicating the Host Name or IP Address of a hop along the discovered route.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public String getHopHost() {
		return hopHost;
	}

	/**
	 * Set the result parameter indicating the Host Name or IP Address of a hop along the discovered route.
	 *
	 * @since 1.0
	 * @param hopHost the input value
	 */
	public void  setHopHost(String hopHost) {
		this.hopHost = hopHost;
	}

	/**
	 * Set the result parameter indicating the Host Name or IP Address of a hop along the discovered route.
	 *
	 * @since 1.0
	 * @param hopHost the input value
	 * @return this instance
	 */
	public RouteHops withHopHost(String hopHost) {
		this.hopHost = hopHost;
		return this;
	}

	//</editor-fold>

}