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
package org.broadbandforum.tr181.device.wifi.accesspoint;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.IPAddress;

	/**
	 * This object contains the parameters related to RADIUS accounting functionality for the access point.
	 *
	 * @since 2.5
	 */
@CWMPObject(name = "Device.WiFi.AccessPoint.{i}.Accounting.")
public class Accounting {

	/**
	 * Enables or disables accounting functionality for the access point.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * The IP Address of the RADIUS accounting server.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ServerIPAddr")
	@CWMPParameter(access = "readWrite")
	public IPAddress serverIPAddr;
	/**
	 * The IP Address of a secondary RADIUS accounting server.

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion. {{bibref|RFC2866}}
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SecondaryServerIPAddr")
	@CWMPParameter(access = "readWrite")
	public IPAddress secondaryServerIPAddr;
	/**
	 * The port number of the RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "ServerPort")
	@CWMPParameter(access = "readWrite")
	public Long serverPort = 1813L;
	/**
	 * The port number of the secondary RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SecondaryServerPort")
	@CWMPParameter(access = "readWrite")
	public Long secondaryServerPort = 1813L;
	/**
	 * The secret used for handshaking with the RADIUS accounting server {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "Secret")
	@CWMPParameter(access = "readWrite")
	public String secret;
	/**
	 * The secret used for handshaking with the secondary RADIUS accounting server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "SecondarySecret")
	@CWMPParameter(access = "readWrite")
	public String secondarySecret;
	/**
	 * Specifies the default interim accounting interval in seconds, which is used for service accounting when the ''Acct-Interim-Interval'' attribute is not configured. {{bibref|RFC2869|Section 2.1}}

          The value MUST NOT be smaller than 60.  The value SHOULD NOT be smaller than  600, and careful consideration should be given to its impact on network traffic {{bibref|RFC2869|Section 5.16}}.

          A value of 0 means no interim accounting messages are sent.
	 *
	 * @since 2.5
	 */
	@XmlElement(name = "InterimInterval")
	@CWMPParameter(access = "readWrite", units = "seconds")
	@Size(min = 60)
	public Long interimInterval = 0L;

	public Accounting() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables accounting functionality for the access point.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables accounting functionality for the access point.
	 *
	 * @since 2.5
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables accounting functionality for the access point.
	 *
	 * @since 2.5
	 * @param enable the input value
	 * @return this instance
	 */
	public Accounting withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the IP Address of the RADIUS accounting server.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getServerIPAddr() {
		return serverIPAddr;
	}

	/**
	 * Set the IP Address of the RADIUS accounting server.
	 *
	 * @since 2.5
	 * @param serverIPAddr the input value
	 */
	public void  setServerIPAddr(IPAddress serverIPAddr) {
		this.serverIPAddr = serverIPAddr;
	}

	/**
	 * Set the IP Address of the RADIUS accounting server.
	 *
	 * @since 2.5
	 * @param serverIPAddr the input value
	 * @return this instance
	 */
	public Accounting withServerIPAddr(IPAddress serverIPAddr) {
		this.serverIPAddr = serverIPAddr;
		return this;
	}

	/**
	 * Get the IP Address of a secondary RADIUS accounting server.

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion. {{bibref|RFC2866}}
	 *
	 * @since 2.5
	 * @return the value
	 */
	public IPAddress getSecondaryServerIPAddr() {
		return secondaryServerIPAddr;
	}

	/**
	 * Set the IP Address of a secondary RADIUS accounting server.

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion. {{bibref|RFC2866}}
	 *
	 * @since 2.5
	 * @param secondaryServerIPAddr the input value
	 */
	public void  setSecondaryServerIPAddr(IPAddress secondaryServerIPAddr) {
		this.secondaryServerIPAddr = secondaryServerIPAddr;
	}

	/**
	 * Set the IP Address of a secondary RADIUS accounting server.

          The client can forward requests to the secondary server in the event that the primary server is down or unreachable, or after a number of tries to the primary server fail, or in a round-robin fashion. {{bibref|RFC2866}}
	 *
	 * @since 2.5
	 * @param secondaryServerIPAddr the input value
	 * @return this instance
	 */
	public Accounting withSecondaryServerIPAddr(IPAddress secondaryServerIPAddr) {
		this.secondaryServerIPAddr = secondaryServerIPAddr;
		return this;
	}

	/**
	 * Get the port number of the RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getServerPort() {
		return serverPort;
	}

	/**
	 * Set the port number of the RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.
	 *
	 * @since 2.5
	 * @param serverPort the input value
	 */
	public void  setServerPort(Long serverPort) {
		this.serverPort = serverPort;
	}

	/**
	 * Set the port number of the RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.
	 *
	 * @since 2.5
	 * @param serverPort the input value
	 * @return this instance
	 */
	public Accounting withServerPort(Long serverPort) {
		this.serverPort = serverPort;
		return this;
	}

	/**
	 * Get the port number of the secondary RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getSecondaryServerPort() {
		return secondaryServerPort;
	}

	/**
	 * Set the port number of the secondary RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondaryServerPort the input value
	 */
	public void  setSecondaryServerPort(Long secondaryServerPort) {
		this.secondaryServerPort = secondaryServerPort;
	}

	/**
	 * Set the port number of the secondary RADIUS server used for accounting. The default port is 1813 as defined in {{bibref|RFC2866}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same port number as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondaryServerPort the input value
	 * @return this instance
	 */
	public Accounting withSecondaryServerPort(Long secondaryServerPort) {
		this.secondaryServerPort = secondaryServerPort;
		return this;
	}

	/**
	 * Get the secret used for handshaking with the RADIUS accounting server {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * Set the secret used for handshaking with the RADIUS accounting server {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 * @param secret the input value
	 */
	public void  setSecret(String secret) {
		this.secret = secret;
	}

	/**
	 * Set the secret used for handshaking with the RADIUS accounting server {{bibref|RFC2865}}.
	 *
	 * @since 2.5
	 * @param secret the input value
	 * @return this instance
	 */
	public Accounting withSecret(String secret) {
		this.secret = secret;
		return this;
	}

	/**
	 * Get the secret used for handshaking with the secondary RADIUS accounting server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public String getSecondarySecret() {
		return secondarySecret;
	}

	/**
	 * Set the secret used for handshaking with the secondary RADIUS accounting server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondarySecret the input value
	 */
	public void  setSecondarySecret(String secondarySecret) {
		this.secondarySecret = secondarySecret;
	}

	/**
	 * Set the secret used for handshaking with the secondary RADIUS accounting server {{bibref|RFC2865}}.

          If this parameter is not implemented, the secondary RADIUS server will use the same secret as the primary RADIUS server.
	 *
	 * @since 2.5
	 * @param secondarySecret the input value
	 * @return this instance
	 */
	public Accounting withSecondarySecret(String secondarySecret) {
		this.secondarySecret = secondarySecret;
		return this;
	}

	/**
	 * Get the specifies the default interim accounting interval in seconds, which is used for service accounting when the ''Acct-Interim-Interval'' attribute is not configured. {{bibref|RFC2869|Section 2.1}}

          The value MUST NOT be smaller than 60.  The value SHOULD NOT be smaller than  600, and careful consideration should be given to its impact on network traffic {{bibref|RFC2869|Section 5.16}}.

          A value of 0 means no interim accounting messages are sent.
	 *
	 * @since 2.5
	 * @return the value
	 */
	public Long getInterimInterval() {
		return interimInterval;
	}

	/**
	 * Set the specifies the default interim accounting interval in seconds, which is used for service accounting when the ''Acct-Interim-Interval'' attribute is not configured. {{bibref|RFC2869|Section 2.1}}

          The value MUST NOT be smaller than 60.  The value SHOULD NOT be smaller than  600, and careful consideration should be given to its impact on network traffic {{bibref|RFC2869|Section 5.16}}.

          A value of 0 means no interim accounting messages are sent.
	 *
	 * @since 2.5
	 * @param interimInterval the input value
	 */
	public void  setInterimInterval(Long interimInterval) {
		this.interimInterval = interimInterval;
	}

	/**
	 * Set the specifies the default interim accounting interval in seconds, which is used for service accounting when the ''Acct-Interim-Interval'' attribute is not configured. {{bibref|RFC2869|Section 2.1}}

          The value MUST NOT be smaller than 60.  The value SHOULD NOT be smaller than  600, and careful consideration should be given to its impact on network traffic {{bibref|RFC2869|Section 5.16}}.

          A value of 0 means no interim accounting messages are sent.
	 *
	 * @since 2.5
	 * @param interimInterval the input value
	 * @return this instance
	 */
	public Accounting withInterimInterval(Long interimInterval) {
		this.interimInterval = interimInterval;
		return this;
	}

	//</editor-fold>

}