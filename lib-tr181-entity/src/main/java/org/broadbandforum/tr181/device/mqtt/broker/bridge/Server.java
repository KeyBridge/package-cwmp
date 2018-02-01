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
package org.broadbandforum.tr181.device.mqtt.broker.bridge;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Each {{object}} instance represents a MQTT bridge server to be used for a {{object|##.Bridge}}. A remote MQTT broker, which is connected by a MQTT bridge can be reachable via several host addresses each represented by its own {{object}} table entry. For an active MQTT bridge at least one enabled entry has to exist.

        If a MQTT bridge gets enabled by setting the parameter {{param|##.Bridge.{i}.Enable}} to {{true}}, which either has an empty {{object}} table or the {{object}} table only contains instances whose {{param|Enable}} is set to {{false}}, the {{param|##.Bridge.{i}.Status}} has to be set to {{enum|Error_Misconfigured|##.Bridge.{i}.Status}}.

        Any attempt to delete an instance, which is currently in use ({{param|##.Bridge.{i}.ServerConnection}} refers to the instance to be deleted), has to be rejected.
	 *
	 * @since 2.10
	 */
@CWMPObject(name = "Device.MQTT.Broker.{i}.Bridge.{i}.Server.{i}.")
public class Server {

	/**
	 * Enables or disables this {{object}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite")
	public Alias alias;
	/**
	 * The priority of this {{object}} that is used by the {{object|##.Bridge}} when determining the {{object}} to connect to. The {{object|##.Bridge}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Bridge}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Bridge}}.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Priority")
	@CWMPParameter(access = "readWrite")
	@Size(min = 0, max = 65535)
	public Long priority;
	/**
	 * This parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Weight")
	@CWMPParameter(access = "readWrite")
	@Size(min = -1, max = 65535)
	public Long weight;
	/**
	 * Fully Qualified Domain Name (FQDN) or IP address of the MQTT broker server this {{object|##.Bridge}} connects to.

          If the value of this parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attempted (in an implementation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on rules defined over the selected {{param|##.Bridge.{i}.ServerSelectionAlgorithm}}) SHOULD be used.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Address")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String address;
	/**
	 * Port number of the MQTT broker server this {{object|##.Bridge}} connects to.
	 *
	 * @since 2.10
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 65535)
	public Long port = 1883L;

	public Server() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.10
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}}.
	 *
	 * @since 2.10
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
	 * Get the priority of this {{object}} that is used by the {{object|##.Bridge}} when determining the {{object}} to connect to. The {{object|##.Bridge}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Bridge}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Bridge}}.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Set the priority of this {{object}} that is used by the {{object|##.Bridge}} when determining the {{object}} to connect to. The {{object|##.Bridge}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Bridge}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Bridge}}.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 * @param priority the input value
	 */
	public void  setPriority(Long priority) {
		this.priority = priority;
	}

	/**
	 * Set the priority of this {{object}} that is used by the {{object|##.Bridge}} when determining the {{object}} to connect to. The {{object|##.Bridge}} MUST contact the {{object}} with the lowest-numbered priority that the {{object|##.Bridge}} can reach as defined in {{bibref|RFC2782}}. The selection of {{object}}s with the same {{param}} value utilizes the {{param|Weight}} parameter to determine which {{object}} is selected by the {{object|##.Bridge}}.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 * @param priority the input value
	 * @return this instance
	 */
	public Server withPriority(Long priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get the this parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * Set the this parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 * @param weight the input value
	 */
	public void  setWeight(Long weight) {
		this.weight = weight;
	}

	/**
	 * Set the this parameter specifies a relative weight for entries with the same {{param|Priority}}. The mechanism is defined in {{bibref|RFC2782}}. A value of -1 indicates that the implementation of this parameter is specific to the Vendor.

          This value is only used if {{param|##.Bridge.{i}.ServerSelectionAlgorithm}} is set to {{enum|Priority|##.Bridge.{i}.ServerSelectionAlgorithm}}.
	 *
	 * @since 2.10
	 * @param weight the input value
	 * @return this instance
	 */
	public Server withWeight(Long weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * Get the fully Qualified Domain Name (FQDN) or IP address of the MQTT broker server this {{object|##.Bridge}} connects to.

          If the value of this parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attempted (in an implementation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on rules defined over the selected {{param|##.Bridge.{i}.ServerSelectionAlgorithm}}) SHOULD be used.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Set the fully Qualified Domain Name (FQDN) or IP address of the MQTT broker server this {{object|##.Bridge}} connects to.

          If the value of this parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attempted (in an implementation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on rules defined over the selected {{param|##.Bridge.{i}.ServerSelectionAlgorithm}}) SHOULD be used.
	 *
	 * @since 2.10
	 * @param address the input value
	 */
	public void  setAddress(String address) {
		this.address = address;
	}

	/**
	 * Set the fully Qualified Domain Name (FQDN) or IP address of the MQTT broker server this {{object|##.Bridge}} connects to.

          If the value of this parameter is a FQDN that resolves to multiple addresses then each address SHOULD be attempted (in an implementation-specific order) until a connection can be made or all addresses are exhausted, in which case the next {{object}} instance (based on rules defined over the selected {{param|##.Bridge.{i}.ServerSelectionAlgorithm}}) SHOULD be used.
	 *
	 * @since 2.10
	 * @param address the input value
	 * @return this instance
	 */
	public Server withAddress(String address) {
		this.address = address;
		return this;
	}

	/**
	 * Get the port number of the MQTT broker server this {{object|##.Bridge}} connects to.
	 *
	 * @since 2.10
	 * @return the value
	 */
	public Long getPort() {
		return port;
	}

	/**
	 * Set the port number of the MQTT broker server this {{object|##.Bridge}} connects to.
	 *
	 * @since 2.10
	 * @param port the input value
	 */
	public void  setPort(Long port) {
		this.port = port;
	}

	/**
	 * Set the port number of the MQTT broker server this {{object|##.Bridge}} connects to.
	 *
	 * @since 2.10
	 * @param port the input value
	 * @return this instance
	 */
	public Server withPort(Long port) {
		this.port = port;
		return this;
	}

	//</editor-fold>

}