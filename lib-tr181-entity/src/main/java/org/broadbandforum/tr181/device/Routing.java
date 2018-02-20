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
import org.broadbandforum.tr181.device.routing.RIP;
import org.broadbandforum.tr181.device.routing.RouteInformation;
import org.broadbandforum.tr181.device.routing.Router;

	/**
	 * Routing object that contains the {{object|Router}} table and {{object|RIP}} protocol object.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.Routing.")
@XmlRootElement(name = "Device.Routing")
@XmlType(name = "Device.Routing")
@XmlAccessorType(XmlAccessType.FIELD)
public class Routing {

	/**
	 * This object allows the handling of the routing and forwarding configuration of the device.
	 */
	@XmlElementWrapper(name = "Routers")
	@XmlElement(name = "Router")
	@CWMPParameter(access = "readWrite")
	public Collection<Router> routers;
	/**
	 * Routing Information Protocol (RIP) object.
	 */
	@XmlElement(name = "RIP")
	public RIP rip;
	/**
	 * Received Router Advertisement (RA) route information {{bibref|RFC4191}}.
	 */
	@XmlElement(name = "RouteInformation")
	public RouteInformation routeInformation;

	public Routing() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the this object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @return the value
	 */
	public Collection<Router> getRouters() {
		if (this.routers == null){ this.routers=new ArrayList<>();}
		return routers;
	}

	/**
	 * Set the this object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @param routers the input value
	 */
	public void  setRouters(Collection<Router> routers) {
		this.routers = routers;
	}

	/**
	 * Set the this object allows the handling of the routing and forwarding configuration of the device.
	 *
	 * @param router the input value
	 * @return this instance
	 */
	public Routing withRouter(Router router) {
		getRouters().add(router);
		return this;
	}

	/**
	 * Get the routing Information Protocol (RIP) object.
	 *
	 * @return the value
	 */
	public RIP getRip() {
		return rip;
	}

	/**
	 * Set the routing Information Protocol (RIP) object.
	 *
	 * @param rip the input value
	 */
	public void  setRip(RIP rip) {
		this.rip = rip;
	}

	/**
	 * Set the routing Information Protocol (RIP) object.
	 *
	 * @param rip the input value
	 * @return this instance
	 */
	public Routing withRip(RIP rip) {
		this.rip = rip;
		return this;
	}

	/**
	 * Get the received Router Advertisement (RA) route information {{bibref|RFC4191}}.
	 *
	 * @return the value
	 */
	public RouteInformation getRouteInformation() {
		return routeInformation;
	}

	/**
	 * Set the received Router Advertisement (RA) route information {{bibref|RFC4191}}.
	 *
	 * @param routeInformation the input value
	 */
	public void  setRouteInformation(RouteInformation routeInformation) {
		this.routeInformation = routeInformation;
	}

	/**
	 * Set the received Router Advertisement (RA) route information {{bibref|RFC4191}}.
	 *
	 * @param routeInformation the input value
	 * @return this instance
	 */
	public Routing withRouteInformation(RouteInformation routeInformation) {
		this.routeInformation = routeInformation;
		return this;
	}

	//</editor-fold>

}