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
package org.broadbandforum.tr181.device.dynamicdns;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.dynamicdns.client.Hostname;

	/**
	 * Client properties for Dynamic DNS. 

        A dynamic DNS client is responsible for verifying IP address changes and updating information from a subscribed account on a Dynamic DNS Server.

        For enabled table entries, if {{param|Server}} is not a valid reference then the table entry is inoperable and the CPE MUST set the {{param|Status}} to {{enum|Error_Misconfigured|Status}}.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.DynamicDNS.Client.{i}.")
@XmlRootElement(name = "Client")
@XmlType(name = "Device.DynamicDNS.Client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	/**
	 * Enables or disables this Dynamic DNS Client.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Status of this Dynamic DNS Client.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The last error this Dynamic DNS Client has encountered.

          The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "LastError")
	public String lastError;
	/**
	 * The DynamicDNS server associated with this Dynamic DNS Client.

          {{reference}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Server")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String server;
	/**
	 * The IP interface over which update queries to the server are sent.

          {{reference}}

          If an empty string is specified, the CPE MUST use its routing policy (Forwarding table entries), to determine the appropriate interface.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Username used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Each table entry represents a fully qualified domain name updated by this Dynamic DNS Client.
	 */
	@XmlElementWrapper(name = "Hostnames")
	@XmlElement(name = "Hostname")
	@CWMPParameter(access = "readWrite")
	public Collection<Hostname> hostnames;

	public Client() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this Dynamic DNS Client.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this Dynamic DNS Client.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this Dynamic DNS Client.
	 *
	 * @since 2.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Client withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the status of this Dynamic DNS Client.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the status of this Dynamic DNS Client.
	 *
	 * @since 2.10
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the status of this Dynamic DNS Client.
	 *
	 * @since 2.10
	 * @param status the input value
	 * @return this instance
	 */
	public Client withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.10
	 * @param alias the input value
	 * @return this instance
	 */
	public Client withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the last error this Dynamic DNS Client has encountered.

          The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getLastError() {
		return lastError;
	}

	/**
	 * Set the last error this Dynamic DNS Client has encountered.

          The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.10
	 * @param lastError the input value
	 */
	public void  setLastError(String lastError) {
		this.lastError = lastError;
	}

	/**
	 * Set the last error this Dynamic DNS Client has encountered.

          The parameter MAY instead indicate a vendor-specific cause, which MUST use the format defined in {{bibref|TR-106}}.
	 *
	 * @since 2.10
	 * @param lastError the input value
	 * @return this instance
	 */
	public Client withLastError(String lastError) {
		this.lastError = lastError;
		return this;
	}

	/**
	 * Get the DynamicDNS server associated with this Dynamic DNS Client.

          {{reference}}
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getServer() {
		return server;
	}

	/**
	 * Set the DynamicDNS server associated with this Dynamic DNS Client.

          {{reference}}
	 *
	 * @since 2.10
	 * @param server the input value
	 */
	public void  setServer(String server) {
		this.server = server;
	}

	/**
	 * Set the DynamicDNS server associated with this Dynamic DNS Client.

          {{reference}}
	 *
	 * @since 2.10
	 * @param server the input value
	 * @return this instance
	 */
	public Client withServer(String server) {
		this.server = server;
		return this;
	}

	/**
	 * Get the IP interface over which update queries to the server are sent.

          {{reference}}

          If an empty string is specified, the CPE MUST use its routing policy (Forwarding table entries), to determine the appropriate interface.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the IP interface over which update queries to the server are sent.

          {{reference}}

          If an empty string is specified, the CPE MUST use its routing policy (Forwarding table entries), to determine the appropriate interface.
	 *
	 * @since 2.10
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the IP interface over which update queries to the server are sent.

          {{reference}}

          If an empty string is specified, the CPE MUST use its routing policy (Forwarding table entries), to determine the appropriate interface.
	 *
	 * @since 2.10
	 * @param _interface the input value
	 * @return this instance
	 */
	public Client with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the username used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 * @param username the input value
	 * @return this instance
	 */
	public Client withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used by this Dynamic DNS Client to authenticate with the Server.
	 *
	 * @since 2.10
	 * @param password the input value
	 * @return this instance
	 */
	public Client withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the each table entry represents a fully qualified domain name updated by this Dynamic DNS Client.
	 *
	 * @return the value
	 */
	public Collection<Hostname> getHostnames() {
		if (this.hostnames == null){ this.hostnames=new ArrayList<>();}
		return hostnames;
	}

	/**
	 * Set the each table entry represents a fully qualified domain name updated by this Dynamic DNS Client.
	 *
	 * @param hostnames the input value
	 */
	public void  setHostnames(Collection<Hostname> hostnames) {
		this.hostnames = hostnames;
	}

	/**
	 * Set the each table entry represents a fully qualified domain name updated by this Dynamic DNS Client.
	 *
	 * @param hostname the input value
	 * @return this instance
	 */
	public Client withHostname(Hostname hostname) {
		getHostnames().add(hostname);
		return this;
	}

	//</editor-fold>

}