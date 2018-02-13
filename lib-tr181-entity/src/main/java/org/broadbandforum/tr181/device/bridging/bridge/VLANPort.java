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
package org.broadbandforum.tr181.device.bridging.bridge;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr181.datatypes.Alias;

	/**
	 * Bridge VLAN egress port and untagged port membership table.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.

        Note: The {{object}} table includes unique key parameters that are strong references. If a strongly referenced object is deleted, the CPE will set the referencing parameter to {{empty}}. However, doing so under these circumstances might cause the updated {{object}} row to then violate the table's unique key constraint; if this occurs, the CPE MUST disable the offending {{object}} row.
	 *
	 * @since 2.0
	 */
@CWMPObject(name = "Device.Bridging.Bridge.{i}.VLANPort.{i}.")
@XmlRootElement(name = "VLANPort")
@XmlType(name = "Device.Bridging.Bridge.VLANPort")
@XmlAccessorType(XmlAccessType.FIELD)
public class VLANPort {

	/**
	 * Enables or disables this {{object}} entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * {{reference}}  Specifies the VLAN for which port membership is expressed.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLAN")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String vlaN;
	/**
	 * {{reference}}  Specifies the bridge port that is member of the VLAN.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Port")
	@CWMPParameter(access = "readWrite")
	@Size(max = 256)
	public String port;
	/**
	 * Enables or disables untagged port membership to the VLAN and determines whether egress frames for this VLAN are sent untagged or tagged.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Untagged")
	@CWMPParameter(access = "readWrite")
	public Boolean untagged;

	public VLANPort() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this {{object}} entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this {{object}} entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public VLANPort withEnable(Boolean enable) {
		this.enable = enable;
		return this;
	}

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
	public VLANPort withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the {{reference}}  Specifies the VLAN for which port membership is expressed.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getVlaN() {
		return vlaN;
	}

	/**
	 * Set the {{reference}}  Specifies the VLAN for which port membership is expressed.
	 *
	 * @since 2.0
	 * @param vlaN the input value
	 */
	public void  setVlaN(String vlaN) {
		this.vlaN = vlaN;
	}

	/**
	 * Set the {{reference}}  Specifies the VLAN for which port membership is expressed.
	 *
	 * @since 2.0
	 * @param vlaN the input value
	 * @return this instance
	 */
	public VLANPort withVlaN(String vlaN) {
		this.vlaN = vlaN;
		return this;
	}

	/**
	 * Get the {{reference}}  Specifies the bridge port that is member of the VLAN.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getPort() {
		return port;
	}

	/**
	 * Set the {{reference}}  Specifies the bridge port that is member of the VLAN.
	 *
	 * @since 2.0
	 * @param port the input value
	 */
	public void  setPort(String port) {
		this.port = port;
	}

	/**
	 * Set the {{reference}}  Specifies the bridge port that is member of the VLAN.
	 *
	 * @since 2.0
	 * @param port the input value
	 * @return this instance
	 */
	public VLANPort withPort(String port) {
		this.port = port;
		return this;
	}

	/**
	 * Get the enables or disables untagged port membership to the VLAN and determines whether egress frames for this VLAN are sent untagged or tagged.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isUntagged() {
		return untagged;
	}

	/**
	 * Set the enables or disables untagged port membership to the VLAN and determines whether egress frames for this VLAN are sent untagged or tagged.
	 *
	 * @since 2.0
	 * @param untagged the input value
	 */
	public void  setUntagged(Boolean untagged) {
		this.untagged = untagged;
	}

	/**
	 * Set the enables or disables untagged port membership to the VLAN and determines whether egress frames for this VLAN are sent untagged or tagged.
	 *
	 * @since 2.0
	 * @param untagged the input value
	 * @return this instance
	 */
	public VLANPort withUntagged(Boolean untagged) {
		this.untagged = untagged;
		return this;
	}

	//</editor-fold>

}