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
package org.broadbandforum.tr135.stbservice.components.frontend.ip.igmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr135.datatypes.Alias;
import org.broadbandforum.tr135.datatypes.IPAddress;

	/**
	 * IGMP Group table. This is the database that is maintained by the IGMP client to reflect the current group membership.

The CPE MUST support at least ''MaximumNumberOfConcurrentGroups'' table entries.
	 *
	 * @since 1.0
	 */
@CWMPObject(name = "STBService.{i}.Components.FrontEnd.{i}.IP.IGMP.ClientGroup.{i}.")
@XmlRootElement(name = "STBService.Components.FrontEnd.IP.IGMP.ClientGroup")
@XmlType(name = "STBService.Components.FrontEnd.IP.IGMP.ClientGroup")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientGroup {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.2
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "GroupAddress")
	public IPAddress groupAddress;
	/**
	 * Time elapsed in seconds since the multicast group has been a member on this interface.
	 *
	 * @since 1.0
	 */
	@XmlElement(name = "UpTime")
	@CWMPParameter(activeNotify = "canDeny", units = "seconds")
	public Long uptime;

	public ClientGroup() {
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
	public ClientGroup withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public IPAddress getGroupAddress() {
		return groupAddress;
	}

	/**
	 * Set the IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 * @param groupAddress the input value
	 */
	public void  setGroupAddress(IPAddress groupAddress) {
		this.groupAddress = groupAddress;
	}

	/**
	 * Set the IP multicast group address for which this entry contains information.
	 *
	 * @since 1.0
	 * @param groupAddress the input value
	 * @return this instance
	 */
	public ClientGroup withGroupAddress(IPAddress groupAddress) {
		this.groupAddress = groupAddress;
		return this;
	}

	/**
	 * Get the time elapsed in seconds since the multicast group has been a member on this interface.
	 *
	 * @since 1.0
	 * @return the value
	 */
	public Long getUptime() {
		return uptime;
	}

	/**
	 * Set the time elapsed in seconds since the multicast group has been a member on this interface.
	 *
	 * @since 1.0
	 * @param uptime the input value
	 */
	public void  setUptime(Long uptime) {
		this.uptime = uptime;
	}

	/**
	 * Set the time elapsed in seconds since the multicast group has been a member on this interface.
	 *
	 * @since 1.0
	 * @param uptime the input value
	 * @return this instance
	 */
	public ClientGroup withUptime(Long uptime) {
		this.uptime = uptime;
		return this;
	}

	//</editor-fold>

}