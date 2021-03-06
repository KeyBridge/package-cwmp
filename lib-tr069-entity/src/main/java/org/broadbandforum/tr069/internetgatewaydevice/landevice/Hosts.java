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
package org.broadbandforum.tr069.internetgatewaydevice.landevice;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr069.internetgatewaydevice.landevice.hosts.Host;

	/**
	 * This object provides information about each of the hosts on the LAN, including those whose IP address was allocated by the CPE using DHCP as well as hosts with statically allocated IP addresses.
	 *
	 * @since TR069 v1.0
	 */
@CWMPObject(name = "InternetGatewayDevice.LANDevice.{i}.Hosts.")
@XmlRootElement(name = "InternetGatewayDevice.LANDevice.Hosts")
@XmlType(name = "InternetGatewayDevice.LANDevice.Hosts")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hosts {

	/**
	 * Host table.
	 */
	@XmlElementWrapper(name = "Hosts")
	@XmlElement(name = "Host")
	public Collection<Host> hosts;

	public Hosts() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the host table.
	 *
	 * @return the value
	 */
	public Collection<Host> getHosts() {
		if (this.hosts == null){ this.hosts=new ArrayList<>();}
		return hosts;
	}

	/**
	 * Set the host table.
	 *
	 * @param hosts the input value
	 */
	public void  setHosts(Collection<Host> hosts) {
		this.hosts = hosts;
	}

	/**
	 * Set the host table.
	 *
	 * @param host the input value
	 * @return this instance
	 */
	public Hosts withHost(Host host) {
		getHosts().add(host);
		return this;
	}

	//</editor-fold>

}