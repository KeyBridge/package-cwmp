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
import org.broadbandforum.annotation.CWMPUnique;
import org.broadbandforum.common.Alias;

	/**
	 * Bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

        This table only applies to an 802.1Q {{bibref|802.1Q-2011}} Bridge.
	 *
	 * @since TR181 v2.0
	 */
@CWMPObject(name = "Device.Bridging.Bridge.{i}.VLAN.{i}.", uniqueConstraints = {@CWMPUnique(names = {"Alias"}, functional = false),
	@CWMPUnique(names = {"VLANID"})})
@XmlRootElement(name = "Device.Bridging.Bridge.VLAN")
@XmlType(name = "Device.Bridging.Bridge.VLAN")
@XmlAccessorType(XmlAccessType.FIELD)
public class VLAN {

	/**
	 * Enables or disables this VLAN table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Enable")
	@CWMPParameter(access = "readWrite")
	public Boolean enable;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name for this VLAN table entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "Name")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String name;
	/**
	 * VLAN ID of the entry.
	 *
	 * @since 2.0
	 */
	@XmlElement(name = "VLANID")
	@CWMPParameter(access = "readWrite")
	@Size(min = 1, max = 4094)
	public Integer vlaNID;

	public VLAN() {
	}

	//<editor-fold defaultstate="collapsed" desc="Getter and Setter">
	/**
	 * Get the enables or disables this VLAN table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Set the enables or disables this VLAN table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 */
	public void  setEnable(Boolean enable) {
		this.enable = enable;
	}

	/**
	 * Set the enables or disables this VLAN table entry.
	 *
	 * @since 2.0
	 * @param enable the input value
	 * @return this instance
	 */
	public VLAN withEnable(Boolean enable) {
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
	public VLAN withAlias(Alias alias) {
		this.alias = alias;
		return this;
	}

	/**
	 * Get the human-readable name for this VLAN table entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the human-readable name for this VLAN table entry.
	 *
	 * @since 2.0
	 * @param name the input value
	 */
	public void  setName(String name) {
		this.name = name;
	}

	/**
	 * Set the human-readable name for this VLAN table entry.
	 *
	 * @since 2.0
	 * @param name the input value
	 * @return this instance
	 */
	public VLAN withName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get the vlaN ID of the entry.
	 *
	 * @since 2.0
	 * @return the value
	 */
	public Integer getVlaNID() {
		return vlaNID;
	}

	/**
	 * Set the vlaN ID of the entry.
	 *
	 * @since 2.0
	 * @param vlaNID the input value
	 */
	public void  setVlaNID(Integer vlaNID) {
		this.vlaNID = vlaNID;
	}

	/**
	 * Set the vlaN ID of the entry.
	 *
	 * @since 2.0
	 * @param vlaNID the input value
	 * @return this instance
	 */
	public VLAN withVlaNID(Integer vlaNID) {
		this.vlaNID = vlaNID;
		return this;
	}

	//</editor-fold>

}