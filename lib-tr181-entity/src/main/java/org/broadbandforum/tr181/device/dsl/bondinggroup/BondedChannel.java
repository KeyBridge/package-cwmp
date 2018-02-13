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
package org.broadbandforum.tr181.device.dsl.bondinggroup;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;
import org.broadbandforum.tr181.device.dsl.bondinggroup.bondedchannel.Ethernet;

	/**
	 * DSL bonded channel table. Each table entry represents a bonded channel within the bonding group, and is associated with exactly one {{object|##.Channel}} instance. There MUST be an instance of {{object}} for each DSL channel that is bonded.

        When a {{object|##.Channel}} is no longer bonded, then the CPE MUST delete the corresponding {{object}} instance. However, when a bonded {{object|##.Channel}} becomes disabled, the channel remains bonded and so the corresponding {{object}} instance MUST NOT be deleted.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.DSL.BondingGroup.{i}.BondedChannel.{i}.")
@XmlRootElement(name = "BondedChannel")
@XmlType(name = "Device.DSL.BondingGroup.BondedChannel")
@XmlAccessorType(XmlAccessType.FIELD)
public class BondedChannel {

	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}}This is the channel that is being bonded.

          This is read-only because bonding is expected to be configured by the CPE, not by the ACS.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Channel")
	@Size(max = 256)
	public String channel;
	/**
	 * Per-channel {{bibref|G.998.2}} Ethernet-based bonding parameters.

        This object MUST be present if, and only if, {{param|##.BondScheme}} is  {{enum|Ethernet|##.BondScheme}}.
	 */
	@XmlElement(name = "Ethernet")
	public Ethernet ethernet;

	public BondedChannel() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 2.0
	 * @param alias the input value
	 * @return this instance
	 */
	public BondedChannel withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}}This is the channel that is being bonded.

          This is read-only because bonding is expected to be configured by the CPE, not by the ACS.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Set the {{reference}}This is the channel that is being bonded.

          This is read-only because bonding is expected to be configured by the CPE, not by the ACS.
	 *
	 * @since 2.0
	 * @param channel the input value
	 */
	public void  setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Set the {{reference}}This is the channel that is being bonded.

          This is read-only because bonding is expected to be configured by the CPE, not by the ACS.
	 *
	 * @since 2.0
	 * @param channel the input value
	 * @return this instance
	 */
	public BondedChannel withChannel(String channel) {
		this.channel = channel;
		return this;
	}

	/**
	 * Get the per-channel {{bibref|G.998.2}} Ethernet-based bonding parameters.

        This object MUST be present if, and only if, {{param|##.BondScheme}} is  {{enum|Ethernet|##.BondScheme}}.
	 *
	 * @return the value
	 */
	public Ethernet getEthernet() {
		return ethernet;
	}

	/**
	 * Set the per-channel {{bibref|G.998.2}} Ethernet-based bonding parameters.

        This object MUST be present if, and only if, {{param|##.BondScheme}} is  {{enum|Ethernet|##.BondScheme}}.
	 *
	 * @param ethernet the input value
	 */
	public void  setEthernet(Ethernet ethernet) {
		this.ethernet = ethernet;
	}

	/**
	 * Set the per-channel {{bibref|G.998.2}} Ethernet-based bonding parameters.

        This object MUST be present if, and only if, {{param|##.BondScheme}} is  {{enum|Ethernet|##.BondScheme}}.
	 *
	 * @param ethernet the input value
	 * @return this instance
	 */
	public BondedChannel withEthernet(Ethernet ethernet) {
		this.ethernet = ethernet;
		return this;
	}

	//</editor-fold>

}