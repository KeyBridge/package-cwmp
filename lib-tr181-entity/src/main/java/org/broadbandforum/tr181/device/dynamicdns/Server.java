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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Table of Dynamic DNS servers available for this CPE.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.DynamicDNS.Server.{i}.")
@XmlRootElement(name = "Server")
@XmlType(name = "Device.DynamicDNS.Server")
@XmlAccessorType(XmlAccessType.FIELD)
public class Server {

	/**
	 * Enables or disables Dynamic DNS Server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String enable;
	/**
	 * The textual name of the Dynamic DNS Server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Dynamic DNS service used to contact this server.

          {{reference}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ServiceName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serviceName;
	/**
	 * Host name or IP address of the Dynamic DNS server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ServerAddress")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String serverAddress;
	/**
	 * Port number of the Dynamic DNS server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "ServerPort")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long serverPort;
	/**
	 * Indicates the protocols that are supported by the CPE for sending requests to the Dynamic DNS server. {{list}} This list depends on the Dynamic DNS service defined by the {{param|ServiceName}} parameter.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "SupportedProtocols")
	@XmlList
	public Collection<String> supportedProtocols;
	/**
	 * Indicates the protocol used to send requests to the Dynamic DNS server.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	public String protocol;
	/**
	 * Interval (in seconds) between two checks for IP change.

          A value of zero indicates that the CPE knows when IP changes and doesn’t need to check it periodically.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "CheckInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long checkInterval;
	/**
	 * Initial retry interval (in seconds) after a failed request. This parameter can be used as a fixed value or as part of a retry interval calculation.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "RetryInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	public Long retryInterval;
	/**
	 * Maximum number of retries after a failed request. When the maximum number is reached, no further requests are sent until the context changes.

          A value of 0 means that there are no retries after a failed request.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "MaxRetries")
	@CWMPParameter(access = "readWrite")
	public Long maxRetries;

	public Server() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(String enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Server withEnable(String enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the textual name of the Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the Dynamic DNS Server.
	 *
	 * @since 2.10
	 * @param name the input value
	 * @return this instance
	 */
	public Server withName(String name) {
		this.name = name;
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
	public Server withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the dynamic DNS service used to contact this server.

          {{reference}}
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Set the dynamic DNS service used to contact this server.

          {{reference}}
	 *
	 * @since 2.10
	 * @param serviceName the input value
	 */
	public void  setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * Set the dynamic DNS service used to contact this server.

          {{reference}}
	 *
	 * @since 2.10
	 * @param serviceName the input value
	 * @return this instance
	 */
	public Server withServiceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get the host name or IP address of the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getServerAddress() {
		return serverAddress;
	}

	/**
	 * Set the host name or IP address of the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @param serverAddress the input value
	 */
	public void  setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	/**
	 * Set the host name or IP address of the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @param serverAddress the input value
	 * @return this instance
	 */
	public Server withServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
		return this;
	}

	/**
	 * Get the port number of the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getServerPort() {
		return serverPort;
	}

	/**
	 * Set the port number of the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @param serverPort the input value
	 */
	public void  setServerPort(Long serverPort) {
		this.serverPort = serverPort;
	}

	/**
	 * Set the port number of the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @param serverPort the input value
	 * @return this instance
	 */
	public Server withServerPort(Long serverPort) {
		this.serverPort = serverPort;
		return this;
	}

	/**
	 * Get the indicates the protocols that are supported by the CPE for sending requests to the Dynamic DNS server. {{list}} This list depends on the Dynamic DNS service defined by the {{param|ServiceName}} parameter.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Collection<String> getSupportedProtocols() {
		if (this.supportedProtocols == null){ this.supportedProtocols=new ArrayList<>();}
		return supportedProtocols;
	}

	/**
	 * Set the indicates the protocols that are supported by the CPE for sending requests to the Dynamic DNS server. {{list}} This list depends on the Dynamic DNS service defined by the {{param|ServiceName}} parameter.
	 *
	 * @since 2.10
	 * @param supportedProtocols the input value
	 */
	public void  setSupportedProtocols(Collection<String> supportedProtocols) {
		this.supportedProtocols = supportedProtocols;
	}

	/**
	 * Set the indicates the protocols that are supported by the CPE for sending requests to the Dynamic DNS server. {{list}} This list depends on the Dynamic DNS service defined by the {{param|ServiceName}} parameter.
	 *
	 * @since 2.10
	 * @param string the input value
	 * @return this instance
	 */
	public Server withSupportedProtocols(String string) {
		getSupportedProtocols().add(string);
		return this;
	}

	/**
	 * Get the indicates the protocol used to send requests to the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the indicates the protocol used to send requests to the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the indicates the protocol used to send requests to the Dynamic DNS server.
	 *
	 * @since 2.10
	 * @param protocol the input value
	 * @return this instance
	 */
	public Server withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	/**
	 * Get the interval (in seconds) between two checks for IP change.

          A value of zero indicates that the CPE knows when IP changes and doesn’t need to check it periodically.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getCheckInterval() {
		return checkInterval;
	}

	/**
	 * Set the interval (in seconds) between two checks for IP change.

          A value of zero indicates that the CPE knows when IP changes and doesn’t need to check it periodically.
	 *
	 * @since 2.10
	 * @param checkInterval the input value
	 */
	public void  setCheckInterval(Long checkInterval) {
		this.checkInterval = checkInterval;
	}

	/**
	 * Set the interval (in seconds) between two checks for IP change.

          A value of zero indicates that the CPE knows when IP changes and doesn’t need to check it periodically.
	 *
	 * @since 2.10
	 * @param checkInterval the input value
	 * @return this instance
	 */
	public Server withCheckInterval(Long checkInterval) {
		this.checkInterval = checkInterval;
		return this;
	}

	/**
	 * Get the initial retry interval (in seconds) after a failed request. This parameter can be used as a fixed value or as part of a retry interval calculation.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getRetryInterval() {
		return retryInterval;
	}

	/**
	 * Set the initial retry interval (in seconds) after a failed request. This parameter can be used as a fixed value or as part of a retry interval calculation.
	 *
	 * @since 2.10
	 * @param retryInterval the input value
	 */
	public void  setRetryInterval(Long retryInterval) {
		this.retryInterval = retryInterval;
	}

	/**
	 * Set the initial retry interval (in seconds) after a failed request. This parameter can be used as a fixed value or as part of a retry interval calculation.
	 *
	 * @since 2.10
	 * @param retryInterval the input value
	 * @return this instance
	 */
	public Server withRetryInterval(Long retryInterval) {
		this.retryInterval = retryInterval;
		return this;
	}

	/**
	 * Get the maximum number of retries after a failed request. When the maximum number is reached, no further requests are sent until the context changes.

          A value of 0 means that there are no retries after a failed request.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getMaxRetries() {
		return maxRetries;
	}

	/**
	 * Set the maximum number of retries after a failed request. When the maximum number is reached, no further requests are sent until the context changes.

          A value of 0 means that there are no retries after a failed request.
	 *
	 * @since 2.10
	 * @param maxRetries the input value
	 */
	public void  setMaxRetries(Long maxRetries) {
		this.maxRetries = maxRetries;
	}

	/**
	 * Set the maximum number of retries after a failed request. When the maximum number is reached, no further requests are sent until the context changes.

          A value of 0 means that there are no retries after a failed request.
	 *
	 * @since 2.10
	 * @param maxRetries the input value
	 * @return this instance
	 */
	public Server withMaxRetries(Long maxRetries) {
		this.maxRetries = maxRetries;
		return this;
	}

	//</editor-fold>

}