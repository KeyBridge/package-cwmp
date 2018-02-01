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
package org.broadbandforum.tr181.device.mqtt;

import java.util.ArrayList;
import java.util.Collection;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.mqtt.broker.Bridge;
import org.broadbandforum.tr181.device.mqtt.broker.Stats;

	/**
	 * MQTT broker table. Contains a list of configured MQTT brokers.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.Broker.{i}.")
public class Broker {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * The textual name of the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * Allows to enable or disable the MQTT broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * Indicates the status of the MQTT broker.  {{enum}}

          The "{{enum|Error_Misconfigured}}" value indicates that a necessary configuration value is undefined or invalid.

          The "{{enum|Error}}" value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Status")
	public String status;
	/**
	 * Port used by the MQTT Broker.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long port = 1883L;
	/**
	 * If {{empty}} is specified, the CPE MUST bind the MQTT broker to all available interfaces.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Interface")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String _interface;
	/**
	 * Username used to authenticate the MQTT clients, which connect to the MQTT broker.

          If this parameter is {{empty}} no authentication is used.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Username")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String username;
	/**
	 * Password used used to authenticate the MQTT clients, which connect to the MQTT broker.

          This password is only used if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Password")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String password;
	/**
	 * Configures MQTT bridges, which are used to communicate with other MQTT brokers.
	 */
	@XmlElementWrapper(name = "Bridges")
	@XmlElement(name = "Bridge")
	@CWMPParameter(access = "readWrite")
	public Collection<Bridge> bridges;
	/**
	 * The MQTT broker statistics values. These will reset with each MQTT broker start, either after reboot or if the MQTT broker gets (re-)enabled.
	 */
	@XmlElement(name = "Stats")
	public Stats stats;

	public Broker() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
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
	public Broker withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the textual name of the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the textual name of the MQTT broker.
	 *
	 * @since 2.10
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the textual name of the MQTT broker.
	 *
	 * @since 2.10
	 * @param name the input value
	 * @return this instance
	 */
	public Broker withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get allows to enable or disable the MQTT broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set allows to enable or disable the MQTT broker.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set allows to enable or disable the MQTT broker.
	 *
	 * @since 2.10
	 * @param enable the input value
	 * @return this instance
	 */
	public Broker withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

	/**
	 * Get the indicates the status of the MQTT broker.  {{enum}}

          The "{{enum|Error_Misconfigured}}" value indicates that a necessary configuration value is undefined or invalid.

          The "{{enum|Error}}" value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Set the indicates the status of the MQTT broker.  {{enum}}

          The "{{enum|Error_Misconfigured}}" value indicates that a necessary configuration value is undefined or invalid.

          The "{{enum|Error}}" value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @param status the input value
	 */
	public void  setStatus(String status) {
		this.status = status;
	}

	/**
	 * Set the indicates the status of the MQTT broker.  {{enum}}

          The "{{enum|Error_Misconfigured}}" value indicates that a necessary configuration value is undefined or invalid.

          The "{{enum|Error}}" value MAY be used by the CPE to indicate a locally defined error condition.
	 *
	 * @since 2.10
	 * @param status the input value
	 * @return this instance
	 */
	public Broker withStatus(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get the port used by the MQTT Broker.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the port used by the MQTT Broker.
	 *
	 * @since 2.10
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the port used by the MQTT Broker.
	 *
	 * @since 2.10
	 * @param port the input value
	 * @return this instance
	 */
	public Broker withPort(Long port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the if {{empty}} is specified, the CPE MUST bind the MQTT broker to all available interfaces.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String get_interface() {
		return _interface;
	}

	/**
	 * Set the if {{empty}} is specified, the CPE MUST bind the MQTT broker to all available interfaces.
	 *
	 * @since 2.10
	 * @param _interface the input value
	 */
	public void  set_interface(String _interface) {
		this._interface = _interface;
	}

	/**
	 * Set the if {{empty}} is specified, the CPE MUST bind the MQTT broker to all available interfaces.
	 *
	 * @since 2.10
	 * @param _interface the input value
	 * @return this instance
	 */
	public Broker with_interface(String _interface) {
		this._interface = _interface;
		return this;
	}

	/**
	 * Get the username used to authenticate the MQTT clients, which connect to the MQTT broker.

          If this parameter is {{empty}} no authentication is used.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set the username used to authenticate the MQTT clients, which connect to the MQTT broker.

          If this parameter is {{empty}} no authentication is used.
	 *
	 * @since 2.10
	 * @param username the input value
	 */
	public void  setUsername(String username) {
		this.username = username;
	}

	/**
	 * Set the username used to authenticate the MQTT clients, which connect to the MQTT broker.

          If this parameter is {{empty}} no authentication is used.
	 *
	 * @since 2.10
	 * @param username the input value
	 * @return this instance
	 */
	public Broker withUsername(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get the password used used to authenticate the MQTT clients, which connect to the MQTT broker.

          This password is only used if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password used used to authenticate the MQTT clients, which connect to the MQTT broker.

          This password is only used if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @param password the input value
	 */
	public void  setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the password used used to authenticate the MQTT clients, which connect to the MQTT broker.

          This password is only used if {{param|Username}} is not {{empty}}.
	 *
	 * @since 2.10
	 * @param password the input value
	 * @return this instance
	 */
	public Broker withPassword(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get the configures MQTT bridges, which are used to communicate with other MQTT brokers.
	 *
	 * @return the value
	 */
	public Collection<Bridge> getBridges() {
		if (this.bridges == null){ this.bridges=new ArrayList<>();}
		return bridges;
	}

	/**
	 * Set the configures MQTT bridges, which are used to communicate with other MQTT brokers.
	 *
	 * @param bridges the input value
	 */
	public void  setBridges(Collection<Bridge> bridges) {
		this.bridges = bridges;
	}

	/**
	 * Set the configures MQTT bridges, which are used to communicate with other MQTT brokers.
	 *
	 * @param bridge the input value
	 * @return this instance
	 */
	public Broker withBridge(Bridge bridge) {
		getBridges().add(bridge);
		return this;
	}

	/**
	 * Get the MQTT broker statistics values. These will reset with each MQTT broker start, either after reboot or if the MQTT broker gets (re-)enabled.
	 *
	 * @return the value
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Set the MQTT broker statistics values. These will reset with each MQTT broker start, either after reboot or if the MQTT broker gets (re-)enabled.
	 *
	 * @param stats the input value
	 */
	public void  setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * Set the MQTT broker statistics values. These will reset with each MQTT broker start, either after reboot or if the MQTT broker gets (re-)enabled.
	 *
	 * @param stats the input value
	 * @return this instance
	 */
	public Broker withStats(Stats stats) {
		this.stats = stats;
		return this;
	}

	//</editor-fold>

}