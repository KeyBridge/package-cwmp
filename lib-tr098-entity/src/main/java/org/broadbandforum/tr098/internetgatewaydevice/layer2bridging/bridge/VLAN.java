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
package org.broadbandforum.tr098.internetgatewaydevice.layer2bridging.bridge;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import org.broadbandforum.annotation.CWMPObject;
import org.broadbandforum.annotation.CWMPParameter;
import org.broadbandforum.tr098.datatypes.Alias;

	/**
	 * Bridge VLAN table.  If this table is supported, if MUST contain an entry for each VLAN known to the Bridge.

This table only applies to an 802.1Q {{bibref|802.1Q-2005}} Bridge.
	 *
	 * @since 1.4
	 */
@CWMPObject(name = "InternetGatewayDevice.Layer2Bridging.Bridge.{i}.VLAN.{i}.")
public class VLAN {

	/**
	 * Enables or disables this VLAN table entry.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VLANEnable")
	@CWMPParameter(access = "readWrite")
	public Boolean vlaNEnable = false;
	/**
	 * {{datatype|expand}}
	 *
	 * @since 1.9
	 */
	@XmlElement(name = "Alias")
	@CWMPParameter(access = "readWrite", activeNotify = "canDeny")
	public Alias alias;
	/**
	 * Human-readable name for this VLAN table entry.
	 *
	 * @since 1.4
	 */
	@XmlElement(name = "VLANName")
	@CWMPParameter(access = "readWrite")
	@Size(max = 64)
	public String vlaNName;
	/**
	 * VLAN ID of the entry,
	 *
	 * @since 1.4
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
	 * @since 1.4
	 * @return the value
	 */
	public Boolean isVlaNEnable() {
		return vlaNEnable;
	}

	/**
	 * Set the enables or disables this VLAN table entry.
	 *
	 * @since 1.4
	 * @param vlaNEnable the input value
	 */
	public void  setVlaNEnable(Boolean vlaNEnable) {
		this.vlaNEnable = vlaNEnable;
	}

	/**
	 * Set the enables or disables this VLAN table entry.
	 *
	 * @since 1.4
	 * @param vlaNEnable the input value
	 * @return this instance
	 */
	public VLAN withVlaNEnable(Boolean vlaNEnable) {
		this.vlaNEnable = vlaNEnable;
		return this;
	}

	/**
	 * Get the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @return the value
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
	 * @param alias the input value
	 */
	public void  setAlias(Alias alias) {
		this.alias = alias;
	}

	/**
	 * Set the {{datatype|expand}}
	 *
	 * @since 1.9
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
	 * @since 1.4
	 * @return the value
	 */
	public String getVlaNName() {
		return vlaNName;
	}

	/**
	 * Set the human-readable name for this VLAN table entry.
	 *
	 * @since 1.4
	 * @param vlaNName the input value
	 */
	public void  setVlaNName(String vlaNName) {
		this.vlaNName = vlaNName;
	}

	/**
	 * Set the human-readable name for this VLAN table entry.
	 *
	 * @since 1.4
	 * @param vlaNName the input value
	 * @return this instance
	 */
	public VLAN withVlaNName(String vlaNName) {
		this.vlaNName = vlaNName;
		return this;
	}

	/**
	 * Get the vlaN ID of the entry,
	 *
	 * @since 1.4
	 * @return the value
	 */
	public Integer getVlaNID() {
		return vlaNID;
	}

	/**
	 * Set the vlaN ID of the entry,
	 *
	 * @since 1.4
	 * @param vlaNID the input value
	 */
	public void  setVlaNID(Integer vlaNID) {
		this.vlaNID = vlaNID;
	}

	/**
	 * Set the vlaN ID of the entry,
	 *
	 * @since 1.4
	 * @param vlaNID the input value
	 * @return this instance
	 */
	public VLAN withVlaNID(Integer vlaNID) {
		this.vlaNID = vlaNID;
		return this;
	}

	//</editor-fold>

}