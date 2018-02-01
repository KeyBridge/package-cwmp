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
package org.broadbandforum.tr181.device.ip;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.tr181.datatypes.IPAddress;

	/**
	 * This table lists the ports on which TCP connections are listening or established.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.IP.ActivePort.{i}.")
public class ActivePort {

	/**
	 * Connection local IP address.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalIPAddress")
	public IPAddress localIPAddress;
	/**
	 * Connection local port.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "LocalPort")
	@Size(min = 0, max = 65535)
	public Long localPort;
	/**
	 * The remote IP address of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RemoteIPAddress")
	public IPAddress remoteIPAddress;
	/**
	 * The remote port of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "RemotePort")
	@Size(min = 0, max = 65535)
	public Long remotePort;
	/**
	 * Current operational status of the connection. {{enum}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Status")
	public String status;

	public ActivePort() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the connection local IP address.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getLocalIPAddress() {
		return localIPAddress;
	}

	/**
	 * Set the connection local IP address.
	 *
	 * @since 2.0
	 * @param localIPAddress the input value
	 */
	public void  setLocalIPAddress(IPAddress localIPAddress) {
		this.localIPAddress = localIPAddress;
	}

	/**
	 * Set the connection local IP address.
	 *
	 * @since 2.0
	 * @param localIPAddress the input value
	 * @return this instance
	 */
	public ActivePort withLocalIPAddress(IPAddress localIPAddress) {
		this.localIPAddress = localIPAddress;
		return this;
	}

	/**
	 * Get the connection local port.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getLocalPort() {
		return localPort;
	}

	/**
	 * Set the connection local port.
	 *
	 * @since 2.0
	 * @param localPort the input value
	 */
	public void  setLocalPort(Long localPort) {
		this.localPort = localPort;
	}

	/**
	 * Set the connection local port.
	 *
	 * @since 2.0
	 * @param localPort the input value
	 * @return this instance
	 */
	public ActivePort withLocalPort(Long localPort) {
		this.localPort = localPort;
		return this;
	}

	/**
	 * Get the remote IP address of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public IPAddress getRemoteIPAddress() {
		return remoteIPAddress;
	}

	/**
	 * Set the remote IP address of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 * @param remoteIPAddress the input value
	 */
	public void  setRemoteIPAddress(IPAddress remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
	}

	/**
	 * Set the remote IP address of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 * @param remoteIPAddress the input value
	 * @return this instance
	 */
	public ActivePort withRemoteIPAddress(IPAddress remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
		return this;
	}

	/**
	 * Get the remote port of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getRemotePort() {
		return remotePort;
	}

	/**
	 * Set the remote port of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 * @param remotePort the input value
	 */
	public void  setRemotePort(Long remotePort) {
		this.remotePort = remotePort;
	}

	/**
	 * Set the remote port of the source of inbound packets. 

          This will be {{null}} for listening connections (only connections in {{enum|ESTABLISHED|Status}} state have remote addresses).
	 *
	 * @since 2.0
	 * @param remotePort the input value
	 * @return this instance
	 */
	public ActivePort withRemotePort(Long remotePort) {
		this.remotePort = remotePort;
		return this;
	}

	/**
	 * Get the current operational status of the connection. {{enum}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the current operational status of the connection. {{enum}}
	 *
	 * @since 2.0
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the current operational status of the connection. {{enum}}
	 *
	 * @since 2.0
	 * @param status the input value
	 * @return this instance
	 */
	public ActivePort withStatus(String status) {
		this.status = status;
		return this;
	}

	//</editor-fold>

}