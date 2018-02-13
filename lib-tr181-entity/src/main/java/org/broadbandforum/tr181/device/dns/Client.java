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
package org.broadbandforum.tr181.device.dns;

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
import org.broadbandforum.tr181.device.dns.client.Server;

	/**
	 * Client properties for Domain Name Service (DNS). The DNS client resolves FQDN on behalf of device internal (client) applications.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DNS.Client.")
@XmlRootElement(name = "Client")
@XmlType(name = "Device.DNS.Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	/**
	 * Enables or disables the DNS client.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The status of the DNS client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * This table contains the DNS Server IP address to be used by the DHCP Client (it does ''not'' model a DNS Server). Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.
	 */
	@XmlElementWrapper(name = "Servers")
	@XmlElement(name = "Server")
	@CWMPParameter(access = "readWrite")
	public Collection<Server> servers;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables the DNS client.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables the DNS client.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables the DNS client.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public Client withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of the DNS client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of the DNS client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of the DNS client. {{enum}}

          The {{enum|Error}} value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public Client withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the this table contains the DNS Server IP address to be used by the DHCP Client (it does ''not'' model a DNS Server). Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.
	 *
	 * @return the value
	 */
	public Collection<Server> getServers() {
		if (this.servers == null){ this.servers=new ArrayList<>();}
		return servers;
	}

	/**
	 * Set the this table contains the DNS Server IP address to be used by the DHCP Client (it does ''not'' model a DNS Server). Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.
	 *
	 * @param servers the input value
	 */
	public void  setServers(Collection<Server> servers) {
		this.servers = servers;
	}

	/**
	 * Set the this table contains the DNS Server IP address to be used by the DHCP Client (it does ''not'' model a DNS Server). Entries are either automatically created as result of DHCP (v4 or v6), IPCP, or RA received DNS server information, or are statically configured by the ACS.
	 *
	 * @param server the input value
	 * @return this instance
	 */
	public Client withServer(Server server) {
		getServers().add(server);
		return this;
	}

	//</editor-fold>

}