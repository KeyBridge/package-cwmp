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
package org.broadbandforum.tr098.internetgatewaydevice.xmpp.connection;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * The {{object}} represents an XMPP server to be used for a {{object|##.Connection}}.

This table is only relevant when {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|ServerTable|##.Connection.{i}.ServerConnectAlgorithm}}.  If {{param|##.Connection.{i}.ServerConnectAlgorithm}} is set to {{enum|DNS-SRV|##.Connection.{i}.ServerConnectAlgorithm}} then any instances of this table are ignored by this {{object|##.Connection}}.
	 *
	 * @since 1.13
	 */
@CWMPObject(name = "InternetGatewayDevice.XMPP.Connection.{i}.Server.{i}.")
public class Server {

	/**
	 * Enables or disables this {{object}}.

This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The priority of this {{object}} that is used by the {{object|##.Connection}} when determining the {{object}} to connect. The {{object|##.Connection}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Connection}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Connection}}.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long priority;
	/**
	 * This parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "Weight")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Long weight;
	/**
	 * Fully Qualified Domain Name (FQDN) or IP address of the XMPP server for this {{object|##.Connection}}.

If the value of this Parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attemtped (in an implemnetation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on {{param|Priority}} and {{param|Weight}}) SHOULD be used.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "ServerAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serverAddress;
	/**
	 * Port number of the XMPP server for this {{object|##.Connection}}.
	 *
	 * @since 1.13
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long port = 5222L;

	public Server() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}}.

This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}}.

This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 1.13
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}}.

This parameter is based on ''ifAdminStatus'' from {{bibref|RFC2863}}.
	 *
	 * @since 1.13
	 * @param enable the input value
	 * @return this instance
	 */
	public Server withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.13
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.13
	 * @param alias the input value
	 * @return this instance
	 */
	public Server withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the priority of this {{object}} that is used by the {{object|##.Connection}} when determining the {{object}} to connect. The {{object|##.Connection}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Connection}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Connection}}.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the priority of this {{object}} that is used by the {{object|##.Connection}} when determining the {{object}} to connect. The {{object|##.Connection}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Connection}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Connection}}.
	 *
	 * @since 1.13
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the priority of this {{object}} that is used by the {{object|##.Connection}} when determining the {{object}} to connect. The {{object|##.Connection}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Connection}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Connection}}.
	 *
	 * @since 1.13
	 * @param priority the input value
	 * @return this instance
	 */
	public Server withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the this parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * Set the this parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.
	 *
	 * @since 1.13
	 * @param weight the input value
	 */
	public void  setWeight(Long weight) {
		this.weight = weight;
	}

	/**
	 * Set the this parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.
	 *
	 * @since 1.13
	 * @param weight the input value
	 * @return this instance
	 */
	public Server withWeight(Long weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * Get the fully Qualified Domain Name (FQDN) or IP address of the XMPP server for this {{object|##.Connection}}.

If the value of this Parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attemtped (in an implemnetation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on {{param|Priority}} and {{param|Weight}}) SHOULD be used.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public String getServerAddress() {
		return serverAddress;
	}

	/**
	 * Set the fully Qualified Domain Name (FQDN) or IP address of the XMPP server for this {{object|##.Connection}}.

If the value of this Parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attemtped (in an implemnetation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on {{param|Priority}} and {{param|Weight}}) SHOULD be used.
	 *
	 * @since 1.13
	 * @param serverAddress the input value
	 */
	public void  setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	/**
	 * Set the fully Qualified Domain Name (FQDN) or IP address of the XMPP server for this {{object|##.Connection}}.

If the value of this Parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attemtped (in an implemnetation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on {{param|Priority}} and {{param|Weight}}) SHOULD be used.
	 *
	 * @since 1.13
	 * @param serverAddress the input value
	 * @return this instance
	 */
	public Server withServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
		return this;
	}

	/**
	 * Get the port number of the XMPP server for this {{object|##.Connection}}.
	 *
	 * @since 1.13
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the port number of the XMPP server for this {{object|##.Connection}}.
	 *
	 * @since 1.13
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the port number of the XMPP server for this {{object|##.Connection}}.
	 *
	 * @since 1.13
	 * @param port the input value
	 * @return this instance
	 */
	public Server withPort(Long port) {
		this.port = port;
		return this;
	}

	//</editor-fold>

}