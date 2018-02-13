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
package org.broadbandforum.tr181.device.userinterface;

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

	/**
	 * This object contains parameters relating to remotely accessing the CPE's user interface.

        Remote access is defined as any entity not of a local subnet attempting to connect to the CPE.

        Remote access requires user authentication.  To provide remote access authentication the CPE MUST support a "User" table with at least one instance that has "RemoteAccessCapable" set to {{true}}.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.UserInterface.RemoteAccess.")
@XmlRootElement(name = "Device.UserInterface.RemoteAccess")
@XmlType(name = "Device.UserInterface.RemoteAccess")
@XmlAccessorType(XmlAccessType.FIELD)
public class RemoteAccess {

	/**
	 * Enables/Disables remotely accessing the CPE's user interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Destination TCP port required for remote access connection.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(max = 65535)
	public Long port;
	/**
	 * {{list}} Indicates the protocols that are supported by the CPE for the purpose of remotely accessing the user interface.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "SupportedProtocols")
	@XmlList
	public Collection<String> supportedProtocols;
	/**
	 * This is the protocol currently being used for remote access.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Protocol")
	@CWMPParameter(access = "readWrite")
	public String protocol;

	public RemoteAccess() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables/Disables remotely accessing the CPE's user interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables/Disables remotely accessing the CPE's user interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables/Disables remotely accessing the CPE's user interface.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public RemoteAccess withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the destination TCP port required for remote access connection.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the destination TCP port required for remote access connection.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the destination TCP port required for remote access connection.
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public RemoteAccess withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the {{list}} Indicates the protocols that are supported by the CPE for the purpose of remotely accessing the user interface.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Collection<String> getSupportedProtocols() {
		if (this.supportedProtocols == null){ this.supportedProtocols=new ArrayList<>();}
		return supportedProtocols;
	}

	/**
	 * Set the {{list}} Indicates the protocols that are supported by the CPE for the purpose of remotely accessing the user interface.
	 *
	 * @since 2.0
	 * @param supportedProtocols the input value
	 */
	public void  setSupportedProtocols(Collection<String> supportedProtocols) {
		this.supportedProtocols = supportedProtocols;
	}

	/**
	 * Set the {{list}} Indicates the protocols that are supported by the CPE for the purpose of remotely accessing the user interface.
	 *
	 * @since 2.0
	 * @param string the input value
	 * @return this instance
	 */
	public RemoteAccess withSupportedProtocols(String string) {
		getSupportedProtocols().add(string);
		return this;
	}

	/**
	 * Get the this is the protocol currently being used for remote access.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * Set the this is the protocol currently being used for remote access.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 */
	public void  setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * Set the this is the protocol currently being used for remote access.
	 *
	 * @since 2.0
	 * @param protocol the input value
	 * @return this instance
	 */
	public RemoteAccess withProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	//</editor-fold>

}