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
package org.broadbandforum.tr181.device.dhcpv6.client;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.IPv6Address;

	/**
	 * This is a transitory table that lists the discovered DHCPv6 servers (it does ''not'' model a local DHCP server). Table entries are automatically created to correspond with these servers. However, it is a local matter to the CPE when to delete old table entries.
	 *
	 * @since TR181 v2.2
	 */
@CWMPObject(name = "Device.DHCPv6.Client.{i}.Server.{i}.", uniqueConstraints = {@CWMPUnique(names = {"SourceAddress"})})
@XmlRootElement(name = "Device.DHCPv6.Client.Server")
@XmlType(name = "Device.DHCPv6.Client.Server")
@XmlAccessorType(XmlAccessType.FIELD)
public class Server {

	/**
	 * The IP address from which the message most recently received from this server was sent.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "SourceAddress")
	public IPv6Address sourceAddress;
	/**
	 * The server's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}} as received via OPTION_SERVERID.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "DUID")
	public byte[] duiD;
	/**
	 * The OPTION_INFORMATION_REFRESH_TIME value {{bibref|RFC4242}} that was most recently received from this server, converted to the ''dateTime'' at which the associated information will expire.  If no such option has been received, the parameter value MUST be the "Unknown Time" {{null}}.  If the information will never expire, the parameter value MUST be infinite time 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 */
	@XmlElement(name = "InformationRefreshTime")
	public LocalDateTime informationRefreshTime;

	public Server() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the IP address from which the message most recently received from this server was sent.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public IPv6Address getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * Set the IP address from which the message most recently received from this server was sent.
	 *
	 * @since 2.2
	 * @param sourceAddress the input value
	 */
	public void  setSourceAddress(IPv6Address sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	/**
	 * Set the IP address from which the message most recently received from this server was sent.
	 *
	 * @since 2.2
	 * @param sourceAddress the input value
	 * @return this instance
	 */
	public Server withSourceAddress(IPv6Address sourceAddress) {
		this.sourceAddress = sourceAddress;
		return this;
	}

	/**
	 * Get the server's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}} as received via OPTION_SERVERID.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public byte[] getDuiD() {
		return duiD;
	}

	/**
	 * Set the server's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}} as received via OPTION_SERVERID.
	 *
	 * @since 2.2
	 * @param duiD the input value
	 */
	public void  setDuiD(byte[] duiD) {
		this.duiD = duiD;
	}

	/**
	 * Set the server's DHCP Unique Identifier (DUID) {{bibref|RFC3315|Section 9}} as received via OPTION_SERVERID.
	 *
	 * @since 2.2
	 * @param duiD the input value
	 * @return this instance
	 */
	public Server withDuiD(byte[] duiD) {
		this.duiD = duiD;
		return this;
	}

	/**
	 * Get the OPTION_INFORMATION_REFRESH_TIME value {{bibref|RFC4242}} that was most recently received from this server, converted to the ''dateTime'' at which the associated information will expire.  If no such option has been received, the parameter value MUST be the "Unknown Time" {{null}}.  If the information will never expire, the parameter value MUST be infinite time 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @return the value
	 */
	public LocalDateTime getInformationRefreshTime() {
		return informationRefreshTime;
	}

	/**
	 * Set the OPTION_INFORMATION_REFRESH_TIME value {{bibref|RFC4242}} that was most recently received from this server, converted to the ''dateTime'' at which the associated information will expire.  If no such option has been received, the parameter value MUST be the "Unknown Time" {{null}}.  If the information will never expire, the parameter value MUST be infinite time 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param informationRefreshTime the input value
	 */
	public void  setInformationRefreshTime(LocalDateTime informationRefreshTime) {
		this.informationRefreshTime = informationRefreshTime;
	}

	/**
	 * Set the OPTION_INFORMATION_REFRESH_TIME value {{bibref|RFC4242}} that was most recently received from this server, converted to the ''dateTime'' at which the associated information will expire.  If no such option has been received, the parameter value MUST be the "Unknown Time" {{null}}.  If the information will never expire, the parameter value MUST be infinite time 9999-12-31T23:59:59Z.
	 *
	 * @since 2.2
	 * @param informationRefreshTime the input value
	 * @return this instance
	 */
	public Server withInformationRefreshTime(LocalDateTime informationRefreshTime) {
		this.informationRefreshTime = informationRefreshTime;
		return this;
	}

	//</editor-fold>

}